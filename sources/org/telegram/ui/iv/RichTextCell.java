package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.QuoteCollapseButton;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichTextCell;

/* loaded from: classes3.dex */
public class RichTextCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private boolean applyingCollapsedDecoration;
    private final RichEditText authorEditText;
    private final Paint bgPaint;
    private final TextView bullet;
    private final CheckBoxView checkBoxView;
    private QuoteCollapseButton collapseButton;
    private final RectF collapseButtonBounds;
    private boolean collapseButtonPressed;
    private int collapseExtraHeight;
    private CharacterStyle collapsedPart;
    private int collapsedPartEnd;
    private int collapsedPartStart;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichEditText editText;
    private boolean forceHint;
    private int highlightGeneration;
    private Runnable highlightScheduled;
    private String highlightedSnapshot;
    private boolean hijackingAuthorSelection;
    private boolean hijackingSelection;
    private final View indentSpacer;
    private LinearLayout languageButton;
    private ImageView languageButtonIcon;
    private TextView languageButtonText;
    private Drawable quoteIcon;
    private ReplyMessageLine quoteLine;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout row;
    private boolean showCommandBackground;
    private final ArrayList tmpBlocks;

    public static /* synthetic */ boolean $r8$lambda$WlQ7-4KoGXP_hHDx2kZV7wXg4-E(View view) {
        return true;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return Theme.Colorable.-CC.$default$getColorKeys(this);
    }

    public interface Delegate {
        int getListPaddingBottom(BlockRow blockRow);

        int getListPaddingTop(BlockRow blockRow);

        int getOrderedListMarkerWidth(BlockRow blockRow, Paint paint);

        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onBackspace(BlockRow blockRow);

        boolean onBackspaceAtStart(BlockRow blockRow);

        void onCheckboxToggle(BlockRow blockRow, boolean z);

        void onCommand(BlockRow blockRow, int i);

        void onEnter(BlockRow blockRow);

        boolean onIndent(BlockRow blockRow, boolean z);

        void onLanguageClick(BlockRow blockRow, View view);

        void onLockedInsert(CharSequence charSequence);

        boolean onPaste(BlockRow blockRow, RichEditText richEditText);

        void onQuoteAuthorEnter(BlockRow blockRow);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(BlockRow blockRow);

        void onSlashSuggest(RichTextCell richTextCell, String str);

        void onSpansChanged(BlockRow blockRow);

        void onTextChanged(BlockRow blockRow);

        void onTextWillChange(BlockRow blockRow, int i, int i2);

        void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2);

        public abstract /* synthetic */ class -CC {
            public static int $default$getOrderedListMarkerWidth(Delegate delegate, BlockRow blockRow, Paint paint) {
                StringBuilder sb = new StringBuilder();
                sb.append(blockRow != null ? blockRow.num : 1);
                sb.append(".");
                return Math.max(AndroidUtilities.dp(28.0f), ((int) Math.ceil(paint.measureText(sb.toString()))) + AndroidUtilities.dp(10.0f));
            }
        }
    }

    public RichTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.collapseButtonBounds = new RectF();
        this.collapsedPartStart = -1;
        this.collapsedPartEnd = -1;
        this.bgPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.row = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.indentSpacer = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        TextView textView = new TextView(context) { // from class: org.telegram.ui.iv.RichTextCell.1
            private final Paint markerPaint = new Paint(1);

            @Override // android.widget.TextView, android.view.View
            protected void onDraw(Canvas canvas) {
                if (RichTextCell.this.currentRow != null && RichTextCell.this.currentRow.level > 0 && RichTextCell.this.currentRow.num == 0 && !RichTextCell.this.currentRow.checkbox) {
                    this.markerPaint.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, this.markerPaint);
                    return;
                }
                super.onDraw(canvas);
            }
        };
        this.bullet = textView;
        textView.setGravity(8388627);
        textView.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(18, -2));
        CheckBoxView checkBoxView = new CheckBoxView(context, resourcesProvider);
        this.checkBoxView = checkBoxView;
        checkBoxView.setVisibility(8);
        checkBoxView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RichTextCell.$r8$lambda$U7eQEHmaQrnR5CUYTmeiyCDDKFg(RichTextCell.this, view2);
            }
        });
        linearLayout.addView(checkBoxView, LayoutHelper.createLinear(18, -2));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        richEditText.setListener(new 2());
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.EditTextCaption.EditTextCaptionDelegate
            public final void onSpansChanged() {
                RichTextCell.$r8$lambda$1qBBS-SV3_qXnIgzIL2cb3Mc29A(RichTextCell.this);
            }
        });
        richEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                RichTextCell.$r8$lambda$1TBRaFPPPd-YKleX2ap9DhIQwMA(RichTextCell.this, view2, z);
            }
        });
        linearLayout.addView(richEditText, LayoutHelper.createLinear(0, -2, 1.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 51));
        RichEditText richEditText2 = new RichEditText(context, resourcesProvider);
        this.authorEditText = richEditText2;
        richEditText2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        richEditText2.setAllowNewlines(false);
        richEditText2.setInputType(147457);
        richEditText2.setListener(new 3());
        richEditText2.setDelegate(new EditTextCaption.EditTextCaptionDelegate() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.EditTextCaption.EditTextCaptionDelegate
            public final void onSpansChanged() {
                RichTextCell.$r8$lambda$1P8uujXI-yJbbJWccL0VJp2Sb0Q(RichTextCell.this);
            }
        });
        richEditText2.setVisibility(8);
        addView(richEditText2, LayoutHelper.createFrame(-1, -2, 51));
        updateColors();
    }

    public static /* synthetic */ void $r8$lambda$U7eQEHmaQrnR5CUYTmeiyCDDKFg(RichTextCell richTextCell, View view) {
        BlockRow blockRow = richTextCell.currentRow;
        if (blockRow == null || !blockRow.checkbox) {
            return;
        }
        boolean z = !blockRow.checked;
        blockRow.checked = z;
        richTextCell.checkBoxView.setChecked(z, true);
        Delegate delegate = richTextCell.delegate;
        if (delegate != null) {
            BlockRow blockRow2 = richTextCell.currentRow;
            delegate.onCheckboxToggle(blockRow2, blockRow2.checked);
        }
    }

    class 2 implements RichEditText.Listener {
        2() {
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            String obj = richEditText.getText().toString();
            RichTextCell.this.delegate.onSlashSuggest(RichTextCell.this, null);
            String slashQuery = RichTextCell.slashQuery(obj);
            if (slashQuery != null) {
                ArrayList match = RichCommand.match(slashQuery);
                if (!match.isEmpty()) {
                    RichTextCell.this.selectCommand((RichCommand) match.get(0));
                    return;
                }
            }
            int matchCommand = RichTextCell.matchCommand(richEditText.getText().toString());
            if (matchCommand != 0) {
                RichTextCell.this.delegate.onCommand(RichTextCell.this.currentRow, matchCommand);
                return;
            }
            Transform matchEnterTrigger = RichTextCell.matchEnterTrigger(richEditText.getText().toString(), RichTextCell.this.currentRow);
            if (matchEnterTrigger != null) {
                RichTextCell.this.delegate.onTransform(RichTextCell.this.currentRow, matchEnterTrigger.block, matchEnterTrigger.level, matchEnterTrigger.num, matchEnterTrigger.checkbox, matchEnterTrigger.checked);
            } else if (!(RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote) || RichTextCell.this.editText.length() <= 0) {
                RichTextCell.this.delegate.onEnter(RichTextCell.this.currentRow);
            } else {
                RichTextCell.this.ensureAuthorVisibleAndFocus();
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onBackspace(RichTextCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onBackspaceAtStart(RichTextCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onTextWillChange(RichTextCell.this.currentRow, i, i2);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.sizeHeaderEmojiToText(editable);
            RichTextCell.this.updateListNumberStyle();
            RichTextCell.applyStyledTextToBlock(RichTextCell.this.currentRow.block, editable);
            RichTextCell.this.scheduleHighlight();
            RichTextCell.this.updateAuthorVisibility();
            RichTextCell.this.resetCollapsedIfTooShort();
            RichTextCell.this.updateCollapsedDecoration();
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onSlashSuggest(RichTextCell.this, RichTextCell.slashQuery(editable.toString()));
            }
            final int matchMarkdownCommand = RichTextCell.matchMarkdownCommand(editable.toString(), RichTextCell.this.currentRow);
            if (matchMarkdownCommand == 0 || RichTextCell.this.delegate == null) {
                final Transform matchMarkdownTrigger = RichTextCell.matchMarkdownTrigger(editable.toString(), RichTextCell.this.currentRow);
                if (matchMarkdownTrigger != null && RichTextCell.this.delegate != null) {
                    final BlockRow blockRow = RichTextCell.this.currentRow;
                    RichTextCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            RichTextCell.2.$r8$lambda$1SW3xSW4Il9o2aX501GGHrGXVw4(RichTextCell.2.this, blockRow, matchMarkdownTrigger);
                        }
                    });
                }
            } else {
                final BlockRow blockRow2 = RichTextCell.this.currentRow;
                RichTextCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RichTextCell.2.$r8$lambda$JKi_yu6ffjr_EOlKylbPYr0cYsw(RichTextCell.2.this, blockRow2, matchMarkdownCommand);
                    }
                });
            }
            if (RichTextCell.this.showCommandBackground || (RichTextCell.this.currentRow != null && (RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote))) {
                RichTextCell.this.invalidate();
            }
        }

        public static /* synthetic */ void $r8$lambda$JKi_yu6ffjr_EOlKylbPYr0cYsw(2 r2, BlockRow blockRow, int i) {
            if (RichTextCell.this.delegate == null) {
                return;
            }
            RichTextCell.applyTextToBlock(blockRow.block, "");
            RichTextCell.this.delegate.onCommand(blockRow, i);
        }

        public static /* synthetic */ void $r8$lambda$1SW3xSW4Il9o2aX501GGHrGXVw4(2 r7, BlockRow blockRow, Transform transform) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTransform(blockRow, transform.block, transform.level, transform.num, transform.checkbox, transform.checked);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onTab(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onIndent(RichTextCell.this.currentRow, z);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onSelectAll(RichTextCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onPaste(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onPaste(RichTextCell.this.currentRow, richEditText);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            RichTextCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.2.$r8$lambda$7fSgMRis17tacg-hQ4AXXetFGrQ(RichTextCell.2.this, richEditText, i2, selectionHelper, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$7fSgMRis17tacg-hQ4AXXetFGrQ(2 r3, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            r3.getClass();
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd()) {
                return;
            }
            if (articleTextSelectionHelper.isInSelectionMode()) {
                RichTextCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingSelection = false;
            } else if (articleTextSelectionHelper.selectRangeOf(RichTextCell.this, i2, i)) {
                RichTextCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingSelection = false;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$1qBBS-SV3_qXnIgzIL2cb3Mc29A(RichTextCell richTextCell) {
        if (richTextCell.applyingCollapsedDecoration || richTextCell.currentRow == null) {
            return;
        }
        richTextCell.updateListNumberStyle();
        applyStyledTextToBlock(richTextCell.currentRow.block, richTextCell.editText.getText());
        Delegate delegate = richTextCell.delegate;
        if (delegate != null) {
            delegate.onSpansChanged(richTextCell.currentRow);
        }
    }

    public static /* synthetic */ void $r8$lambda$1TBRaFPPPd-YKleX2ap9DhIQwMA(RichTextCell richTextCell, View view, boolean z) {
        Delegate delegate;
        richTextCell.editText.setHint(richTextCell.getHint());
        if (z || (delegate = richTextCell.delegate) == null) {
            return;
        }
        delegate.onSlashSuggest(richTextCell, null);
    }

    class 3 implements RichEditText.Listener {
        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onBackspaceOnEmpty(RichEditText richEditText) {
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public /* synthetic */ boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.-CC.$default$onPaste(this, richEditText);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public /* synthetic */ boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.-CC.$default$onTab(this, richEditText, z);
        }

        3() {
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onQuoteAuthorEnter(RichTextCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            RichTextCell.this.editText.requestEditFocus();
            RichTextCell.this.editText.setSelection(RichTextCell.this.editText.length());
            return true;
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onTextWillChange(RichTextCell.this.currentRow, i, i2);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.persistAuthor();
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            if (!(RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote)) {
                if (RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockBlockquote) {
                    RichTextCell.this.invalidate();
                    if (RichTextCell.this.collapseButtonExtraHeightChanged()) {
                        RichTextCell.this.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            RichTextCell.this.invalidate();
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onSelectAll(RichTextCell.this.currentRow);
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingAuthorSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            richEditText.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.3.$r8$lambda$A8TXYECEK3UQ83hDcoC5GleM_ZQ(RichTextCell.3.this, richEditText, i2, selectionHelper, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$A8TXYECEK3UQ83hDcoC5GleM_ZQ(3 r3, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            r3.getClass();
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd()) {
                return;
            }
            if (articleTextSelectionHelper.isInSelectionMode()) {
                RichTextCell.this.hijackingAuthorSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingAuthorSelection = false;
            } else if (articleTextSelectionHelper.selectRangeOf(RichTextCell.this, 1, i2, i)) {
                RichTextCell.this.hijackingAuthorSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingAuthorSelection = false;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$1P8uujXI-yJbbJWccL0VJp2Sb0Q(RichTextCell richTextCell) {
        if (richTextCell.currentRow == null) {
            return;
        }
        richTextCell.persistAuthor();
        Delegate delegate = richTextCell.delegate;
        if (delegate != null) {
            delegate.onSpansChanged(richTextCell.currentRow);
        }
    }

    private void updateLanguageButton(TL_iv.PageBlock pageBlock, boolean z) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.languageButton;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.languageButton;
        if (linearLayout2 != null && z) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.languageButton = null;
        }
        if (this.languageButton == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.languageButton = linearLayout3;
            linearLayout3.setOrientation(0);
            this.languageButton.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.languageButton.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.languageButton, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.languageButtonText = textView;
            textView.setTextSize(1, 12.0f);
            this.languageButtonText.setGravity(17);
            this.languageButton.addView(this.languageButtonText, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.languageButtonIcon = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.languageButton.addView(this.languageButtonIcon, LayoutHelper.createLinear(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.languageButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RichTextCell.$r8$lambda$2Q-lZut-ym7cGe1oz0jmQj5jFuM(RichTextCell.this, view);
                }
            });
            this.languageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda6
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return RichTextCell.$r8$lambda$WlQ7-4KoGXP_hHDx2kZV7wXg4-E(view);
                }
            });
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int multAlpha = Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), TextUtils.isEmpty(str) ? 0.5f : 0.75f);
        this.languageButtonIcon.setColorFilter(new PorterDuffColorFilter(multAlpha, PorterDuff.Mode.SRC_IN));
        this.languageButtonText.setTextColor(multAlpha);
        if (TextUtils.isEmpty(str)) {
            this.languageButtonText.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.languageButtonText.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.languageButton.setVisibility(0);
    }

    public static /* synthetic */ void $r8$lambda$2Q-lZut-ym7cGe1oz0jmQj5jFuM(RichTextCell richTextCell, View view) {
        Delegate delegate = richTextCell.delegate;
        if (delegate != null) {
            delegate.onLanguageClick(richTextCell.currentRow, view);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        QuoteCollapseButton quoteCollapseButton = this.collapseButton;
        return quoteCollapseButton != null && quoteCollapseButton.verifyDrawable(drawable);
    }

    public void bind(BlockRow blockRow, Delegate delegate, boolean z) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.forceHint = z;
        this.collapsedPartEnd = -1;
        this.collapsedPartStart = -1;
        this.editText.setBlock(blockRow.block);
        applyStyle(blockRow.block);
        applyQuoteInset(blockRow);
        applyListDecoration(blockRow);
        updateLanguageButton(blockRow.block, false);
        if (!String.valueOf(this.editText.getText()).equals(readPlainText(blockRow.block))) {
            CharSequence readStyledText = readStyledText(blockRow.block);
            if (RichEditorListView.isHeading(blockRow.block)) {
                SpannableString spannableString = new SpannableString(readStyledText);
                RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 1, false);
                RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 2, false);
                readStyledText = spannableString;
            }
            this.editText.setTextSilently(Emoji.replaceEmoji(readStyledText, this.editText.getPaint().getFontMetricsInt(), false, RichEditorListView.isHeading(blockRow.block) ? 0.85f : 1.0f));
            sizeHeaderEmojiToText(this.editText.getText());
            this.editText.invalidateEffects();
            this.highlightedSnapshot = null;
        }
        sizeHeaderEmojiToText(this.editText.getText());
        updateListNumberStyle();
        bindAuthor(blockRow.block);
        scheduleHighlight();
    }

    public void rebindInPlace() {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (delegate = this.delegate) == null) {
            return;
        }
        bind(blockRow, delegate, this.forceHint);
    }

    void refreshListVerticalPadding() {
        syncLiveListVerticalPadding();
    }

    private void bindAuthor(TL_iv.PageBlock pageBlock) {
        if (!isQuoteBlock(pageBlock)) {
            this.authorEditText.setVisibility(8);
            return;
        }
        ensureCaption(pageBlock);
        applyAuthorStyle(pageBlock);
        if (!String.valueOf(this.authorEditText.getText()).equals(readAuthorPlain(pageBlock))) {
            this.authorEditText.setTextSilently(Emoji.replaceEmoji(readAuthorStyled(pageBlock), this.authorEditText.getPaint().getFontMetricsInt(), false));
            this.authorEditText.invalidateEffects();
        }
        updateAuthorVisibility();
    }

    private void applyAuthorStyle(TL_iv.PageBlock pageBlock) {
        this.authorEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        this.authorEditText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.authorEditText.setTextColorKey(Theme.key_featuredStickers_addButton);
        this.authorEditText.setAccentHint(true);
        this.authorEditText.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            this.authorEditText.setGravity(49);
        } else {
            this.authorEditText.setGravity(8388659);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAuthorVisibility() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && isQuoteBlock(blockRow.block) && (this.editText.length() > 0 || this.authorEditText.length() > 0)) {
            if (this.authorEditText.getVisibility() != 0) {
                this.authorEditText.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (this.authorEditText.getVisibility() != 8) {
            if (this.authorEditText.isFocused()) {
                this.editText.requestFocus();
            }
            this.authorEditText.setVisibility(8);
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureAuthorVisibleAndFocus() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            ensureCaption(blockRow.block);
        }
        if (this.authorEditText.getVisibility() != 0) {
            this.authorEditText.setVisibility(0);
            requestLayout();
        }
        this.authorEditText.requestEditFocus();
        RichEditText richEditText = this.authorEditText;
        richEditText.setSelection(richEditText.length());
    }

    public void updateLanguage() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            updateLanguageButton(blockRow.block, true);
            this.highlightedSnapshot = null;
            scheduleHighlight();
        }
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public FloatingToolbar.StyleDelegate getStyleDelegate() {
        return this.editText;
    }

    public void persistStyle() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            applyStyledTextToBlock(blockRow.block, this.editText.getText());
        }
    }

    private boolean isHighlightableCode() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return false;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleHighlight() {
        Runnable runnable = this.highlightScheduled;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.highlightScheduled = null;
        }
        if (!isHighlightableCode()) {
            this.highlightGeneration++;
            clearHighlight();
            this.highlightedSnapshot = null;
        } else {
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.this.runHighlight();
                }
            };
            this.highlightScheduled = runnable2;
            postDelayed(runnable2, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runHighlight() {
        this.highlightScheduled = null;
        if (isHighlightableCode()) {
            final String obj = this.editText.getText().toString();
            if (obj.equals(this.highlightedSnapshot)) {
                return;
            }
            final BlockRow blockRow = this.currentRow;
            String str = ((TL_iv.pageBlockPreformatted) blockRow.block).language;
            final int i = this.highlightGeneration + 1;
            this.highlightGeneration = i;
            CodeHighlighting.highlightEditable(obj, str, new Utilities.Callback() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    RichTextCell.$r8$lambda$fV9Ed2lV2VkAyDNn-iN_pHhE9Ok(RichTextCell.this, i, blockRow, obj, (SpannableString) obj2);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$fV9Ed2lV2VkAyDNn-iN_pHhE9Ok(RichTextCell richTextCell, int i, BlockRow blockRow, String str, SpannableString spannableString) {
        if (i == richTextCell.highlightGeneration && richTextCell.currentRow == blockRow) {
            Editable text = richTextCell.editText.getText();
            if (TextUtils.equals(str, text)) {
                richTextCell.applyColorSpans(text, spannableString);
                richTextCell.highlightedSnapshot = str;
            }
        }
    }

    private void applyColorSpans(Editable editable, SpannableString spannableString) {
        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) editable.getSpans(0, editable.length(), CodeHighlighting.ColorSpan.class)) {
            editable.removeSpan(colorSpan);
        }
        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
        int length = editable.length();
        for (int i = 0; i < colorSpanArr.length; i++) {
            int spanStart = spannableString.getSpanStart(colorSpanArr[i]);
            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i]);
            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                editable.setSpan(colorSpanArr[i], spanStart, spanEnd, 33);
            }
        }
    }

    private void clearHighlight() {
        Editable text = this.editText.getText();
        if (text == null) {
            return;
        }
        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
            text.removeSpan(colorSpan);
        }
    }

    public void requestEditFocus() {
        this.editText.requestEditFocus();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
        this.authorEditText.setLocked(z);
    }

    public void hideActionModes() {
        this.editText.hideActionMode();
        this.authorEditText.hideActionMode();
    }

    public void finishActionModes() {
        this.editText.finishActionMode();
        this.authorEditText.finishActionMode();
    }

    public boolean isPressOnText(int i, int i2) {
        if (pressOnLayout(this.editText, this.row.getLeft() + this.editText.getLeft(), this.row.getTop() + this.editText.getTop(), i, i2)) {
            return true;
        }
        if (this.authorEditText.getVisibility() != 0) {
            return false;
        }
        RichEditText richEditText = this.authorEditText;
        return pressOnLayout(richEditText, richEditText.getLeft(), this.authorEditText.getTop(), i, i2);
    }

    private static boolean pressOnLayout(RichEditText richEditText, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = richEditText.getLayout();
        if (layout != null && richEditText.length() != 0) {
            int paddingLeft = i3 - (i + richEditText.getPaddingLeft());
            int paddingTop = i4 - (i2 + richEditText.getPaddingTop());
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (richEditText.getWidth() - richEditText.getPaddingLeft()) - richEditText.getPaddingRight());
                float f = dp;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= max2 && f2 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPressOnEmptyEditText(int i, int i2) {
        if (insideEmpty(this.editText, this.row.getLeft() + this.editText.getLeft(), this.row.getTop() + this.editText.getTop(), i, i2)) {
            return true;
        }
        if (this.authorEditText.getVisibility() != 0) {
            return false;
        }
        RichEditText richEditText = this.authorEditText;
        return insideEmpty(richEditText, richEditText.getLeft(), this.authorEditText.getTop(), i, i2);
    }

    private static boolean insideEmpty(RichEditText richEditText, int i, int i2, int i3, int i4) {
        return richEditText.length() == 0 && i3 >= i && i3 <= i + richEditText.getWidth() && i4 >= i2 && i4 <= i2 + richEditText.getHeight();
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout;
        final Layout layout2 = this.editText.getLayout();
        if (layout2 != null) {
            final int left = this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft();
            final int top = this.row.getTop() + this.editText.getTop() + this.editText.getPaddingTop();
            arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichTextCell.4
                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public /* synthetic */ CharSequence getPrefix() {
                    return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public int getRow() {
                    return 0;
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public /* synthetic */ Rect getSelectionBounds() {
                    return TextSelectionHelper.TextLayoutBlock.-CC.$default$getSelectionBounds(this);
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public Layout getLayout() {
                    return layout2;
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public int getX() {
                    return left;
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public int getY() {
                    return top;
                }

                @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
                public CharSequence getText() {
                    return layout2.getText();
                }
            });
        }
        if (this.authorEditText.getVisibility() != 0 || (layout = this.authorEditText.getLayout()) == null) {
            return;
        }
        final int left2 = this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft();
        final int top2 = this.authorEditText.getTop() + this.authorEditText.getPaddingTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichTextCell.5
            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public /* synthetic */ CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getRow() {
                return 1;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public /* synthetic */ Rect getSelectionBounds() {
                return TextSelectionHelper.TextLayoutBlock.-CC.$default$getSelectionBounds(this);
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public Layout getLayout() {
                return layout;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getX() {
                return left2;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getY() {
                return top2;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public CharSequence getText() {
                return layout.getText();
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.editText.updateColors();
        RichEditText richEditText = this.authorEditText;
        if (richEditText != null) {
            richEditText.updateColors();
        }
        this.bullet.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        Drawable drawable = this.quoteIcon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
        ReplyMessageLine replyMessageLine = this.quoteLine;
        if (replyMessageLine != null) {
            RichBlockChrome.applyEditorQuoteColor(replyMessageLine, this.resourcesProvider);
        }
    }

    private void applyListDecoration(BlockRow blockRow) {
        int max;
        String str;
        int i = blockRow.level;
        if (i <= 0) {
            this.indentSpacer.setVisibility(8);
            this.bullet.setVisibility(8);
            this.checkBoxView.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.indentSpacer.getLayoutParams();
        layoutParams.width = (i - 1) * AndroidUtilities.dp(24.0f);
        this.indentSpacer.setLayoutParams(layoutParams);
        this.indentSpacer.setVisibility(i > 1 ? 0 : 8);
        if (blockRow.checkbox) {
            this.bullet.setVisibility(8);
            this.checkBoxView.setVisibility(0);
            this.checkBoxView.setChecked(blockRow.checked, false);
            return;
        }
        this.checkBoxView.setVisibility(8);
        this.bullet.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.bullet.getLayoutParams();
        if (blockRow.num == 0) {
            max = AndroidUtilities.dp(18.0f);
        } else {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                max = delegate.getOrderedListMarkerWidth(blockRow, this.bullet.getPaint());
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint = this.bullet.getPaint();
                max = Math.max(dp, ((int) Math.ceil(paint.measureText(blockRow.num + "."))) + AndroidUtilities.dp(10.0f));
            }
        }
        if (layoutParams2.width != max) {
            layoutParams2.width = max;
            this.bullet.setLayoutParams(layoutParams2);
        }
        TextView textView = this.bullet;
        if (blockRow.num == 0) {
            str = "";
        } else {
            str = blockRow.num + ".";
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateListNumberStyle() {
        BlockRow blockRow = this.currentRow;
        boolean z = false;
        if (blockRow != null && blockRow.num > 0 && this.editText.length() > 0 && (this.editText.getCurrentStyle(0, 1) & 1) != 0) {
            z = true;
        }
        this.bullet.setTypeface(z ? AndroidUtilities.bold() : null);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 == null || blockRow2.num <= 0) {
            return;
        }
        applyListDecoration(blockRow2);
    }

    private String getHint() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(blockRow.firstBlock ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return LocaleController.getString(R.string.ArticleHeading3);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return LocaleController.getString(R.string.ArticleHeading4);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return LocaleController.getString(R.string.ArticleHeading5);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return LocaleController.getString(R.string.ArticleHeading6);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return LocaleController.getString(R.string.ArticleHintCode);
        }
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (blockRow.singleParagraph) {
                return LocaleController.getString(R.string.ArticleHintText);
            }
            return null;
        }
        return LocaleController.getString(R.string.ArticleHintQuote);
    }

    private void applyQuoteInset(BlockRow blockRow) {
        int quoteInset = RichBlockChrome.quoteInset(blockRow);
        int quoteInsetEnd = RichBlockChrome.quoteInsetEnd(blockRow);
        if (quoteInset > 0 || quoteInsetEnd > 0) {
            boolean z = blockRow.block instanceof TL_iv.pageBlockPreformatted;
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            if (blockRow.quoteFirst) {
                paddingTop = RichBlockChrome.quoteTopPad(blockRow) + (z ? AndroidUtilities.dp(24.0f) : 0);
            }
            if (blockRow.quoteLast) {
                paddingBottom = RichBlockChrome.quoteBottomPad(blockRow);
            }
            if (z) {
                quoteInset += AndroidUtilities.dp(8.0f);
                quoteInsetEnd += AndroidUtilities.dp(8.0f);
            }
            if (RichBlockChrome.rtl()) {
                setPadding(getPaddingLeft() + quoteInsetEnd, paddingTop, getPaddingRight() + quoteInset, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + quoteInset, paddingTop, getPaddingRight() + quoteInsetEnd, paddingBottom);
            }
        }
    }

    private void applyStyle(TL_iv.PageBlock pageBlock) {
        BlockRow blockRow;
        int i = SharedConfig.fontSize;
        this.editText.setCenterEmptyHint(false);
        this.editText.setHint(getHint());
        this.editText.setTextColorKey(Theme.key_windowBackgroundWhiteBlackText);
        this.editText.setLineSpacing(0.0f, 1.0f);
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            this.editText.setInputType(655505);
            this.editText.setAllowNewlines(true);
            this.editText.setSoftEnterNewline(false);
            this.editText.setGravity(8388659);
            this.editText.setTextSize(1, i - 1);
            this.editText.setTypeface(Typeface.MONOSPACE);
            RichEditText richEditText = this.editText;
            richEditText.setLineSpacing(richEditText.getPaint().getFontSpacing() * 0.3f, 1.0f);
            this.editText.setAccentHint(false);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            this.editText.setInputType(147457);
            this.editText.setAllowNewlines(false);
            this.editText.setSoftEnterNewline(false);
            this.editText.setGravity(8388659);
            setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
            this.editText.setTextSize(1, Math.max(8, i - 2));
            this.editText.setTypeface(null);
            this.editText.setAccentHint(true);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            this.editText.setInputType(147457);
            this.editText.setAllowNewlines(false);
            this.editText.setSoftEnterNewline(true);
            this.editText.setGravity(49);
            this.editText.setCenterEmptyHint(true);
            setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
            this.editText.setTextSize(1, Math.max(8, i - 2));
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
            this.editText.setAccentHint(true);
            return;
        }
        this.editText.setInputType(147457);
        this.editText.setAllowNewlines(false);
        this.editText.setSoftEnterNewline(false);
        this.editText.setGravity(8388659);
        boolean z = pageBlock instanceof TL_iv.pageBlockHeading1;
        boolean z2 = z || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z2 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z2 ? 7.0f : 4.66f));
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 != null && blockRow2.level > 0) {
            int dp = AndroidUtilities.dp(16.0f);
            Delegate delegate = this.delegate;
            int listPaddingTop = delegate != null ? delegate.getListPaddingTop(this.currentRow) : AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            Delegate delegate2 = this.delegate;
            setPadding(dp, listPaddingTop, dp2, delegate2 != null ? delegate2.getListPaddingBottom(this.currentRow) : AndroidUtilities.dp(11.0f));
        }
        if (z) {
            this.editText.setTextSize(1, i + 3);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            this.editText.setTextSize(1, i + 2);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            this.editText.setTextSize(1, i + 1);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            this.editText.setTextSize(1, i);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            this.editText.setTextSize(1, i - 1);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            this.editText.setTextSize(1, i - 2);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            this.editText.setTextSize(1, i - 2);
            this.editText.setTypeface(null);
            this.editText.setTextColorKey(Theme.key_chat_inReplyMessageText);
        } else {
            this.editText.setTextSize(1, (pageBlock instanceof TL_iv.pageBlockParagraph) && (blockRow = this.currentRow) != null && !blockRow.quoteIds.isEmpty() ? Math.max(8, i - 2) : i);
            this.editText.setTypeface(null);
        }
        this.editText.setAccentHint(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sizeHeaderEmojiToText(CharSequence charSequence) {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && RichEditorListView.isHeading(blockRow.block) && (charSequence instanceof Spanned)) {
            Paint.FontMetricsInt fontMetricsInt = this.editText.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((this.editText.getTextSize() * 0.85f) / 1.2f));
            Spanned spanned = (Spanned) charSequence;
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spanned.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) {
                animatedEmojiSpan.replaceFontMetrics(fontMetricsInt);
                animatedEmojiSpan.setSize(max);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Transform {
        final TL_iv.PageBlock block;
        final boolean checkbox;
        final boolean checked;
        final int level;
        final int num;

        Transform(TL_iv.PageBlock pageBlock, int i, int i2) {
            this(pageBlock, i, i2, false, false);
        }

        Transform(TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
            this.block = pageBlock;
            this.level = i;
            this.num = i2;
            this.checkbox = z;
            this.checked = z2;
        }
    }

    private static Transform newChecklistItem(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        applyTextToBlock(pageblockparagraph, "");
        return new Transform(pageblockparagraph, 1, 0, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int matchMarkdownCommand(String str, BlockRow blockRow) {
        return (blockRow != null && str != null && blockRow.level == 0 && (blockRow.block instanceof TL_iv.pageBlockParagraph) && str.equals("> ")) ? 6 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Transform matchMarkdownTrigger(String str, BlockRow blockRow) {
        int length;
        char charAt;
        if (blockRow != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = blockRow.block;
                boolean z = pageBlock instanceof TL_iv.pageBlockParagraph;
                boolean z2 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
                if (str.charAt(0) == '#' && (z || z2)) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        if (str.charAt(i3) != '#') {
                            return null;
                        }
                        i2++;
                    }
                    if (i2 < 1 || i2 > 6) {
                        return null;
                    }
                    return new Transform(newHeading(i2), blockRow.level, blockRow.num);
                }
                if (!z) {
                    return null;
                }
                if (blockRow.level == 0 && length == 2) {
                    char charAt2 = str.charAt(0);
                    if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        applyTextToBlock(pageblockparagraph, "");
                        return new Transform(pageblockparagraph, 1, 0);
                    }
                    if (charAt2 == '|') {
                        return new Transform(newBlockquote(), 0, 0);
                    }
                }
                if (blockRow.level == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                    return newChecklistItem(false);
                }
                if (blockRow.level == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                    char charAt3 = str.charAt(1);
                    if (charAt3 == ' ') {
                        return newChecklistItem(false);
                    }
                    if (charAt3 == 'x' || charAt3 == 'X') {
                        return newChecklistItem(true);
                    }
                }
                if (blockRow.level == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph2, "");
                    return new Transform(pageblockparagraph2, 1, 1);
                }
                if (blockRow.level == 0 && length == 4) {
                    char charAt4 = str.charAt(0);
                    if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                        return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
                    }
                    if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                        return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Transform matchEnterTrigger(String str, BlockRow blockRow) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str == null || blockRow == null) {
            return null;
        }
        String trim = str.trim();
        int i3 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new Transform(newHeading(charAt - '0'), blockRow.level, blockRow.num);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new Transform(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            return new Transform(newBlockquote(), 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            return new Transform(newPullquote(), 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(120);
            if (indexOf < 0) {
                indexOf = trim2.indexOf(88);
            }
            if (indexOf > 0) {
                try {
                    i2 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                } catch (NumberFormatException unused) {
                    i2 = 2;
                }
                try {
                    i = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    i3 = i2;
                } catch (NumberFormatException unused2) {
                    i3 = i2;
                    i = 2;
                    return new Transform(newEmptyTable(i3, i), 0, 0);
                }
                return new Transform(newEmptyTable(i3, i), 0, 0);
            }
        }
        i = 2;
        return new Transform(newEmptyTable(i3, i), 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String slashQuery(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public void selectCommand(RichCommand richCommand) {
        if (this.delegate == null || this.currentRow == null || richCommand == null || richCommand.commands.isEmpty()) {
            return;
        }
        for (String str : richCommand.commands) {
            int matchCommand = matchCommand(str);
            if (matchCommand != 0) {
                this.delegate.onCommand(this.currentRow, matchCommand);
                return;
            }
            Transform matchEnterTrigger = matchEnterTrigger(str, this.currentRow);
            if (matchEnterTrigger == null) {
                matchEnterTrigger = matchMarkdownTrigger(str + " ", this.currentRow);
            }
            if (matchEnterTrigger != null) {
                this.delegate.onTransform(this.currentRow, matchEnterTrigger.block, matchEnterTrigger.level, matchEnterTrigger.num, matchEnterTrigger.checkbox, matchEnterTrigger.checked);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int matchCommand(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static TL_iv.pageBlockTable newEmptyTable(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(TableModel.newEmptyCell());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    private static TL_iv.PageBlock newHeading(int i) {
        switch (i) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    static String readPlainText(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.plainOf(pageBlock.text);
    }

    static CharSequence readStyledText(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.toSpannable(pageBlock.text, pageBlock);
    }

    static void applyStyledTextToBlock(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        setRichText(pageBlock, RichTextStyle.fromSpannable(charSequence));
    }

    static boolean isQuoteBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    static TL_iv.pageBlockBlockquote newBlockquote() {
        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
        pageblockblockquote.caption = new TL_iv.textEmpty();
        return pageblockblockquote;
    }

    static TL_iv.pageBlockPullquote newPullquote() {
        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
        pageblockpullquote.caption = new TL_iv.textEmpty();
        return pageblockpullquote;
    }

    static void ensureCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    static TL_iv.RichText extractCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    static void setCaption(TL_iv.PageBlock pageBlock, TL_iv.RichText richText) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = richText;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = richText;
        }
    }

    static String readAuthorPlain(TL_iv.PageBlock pageBlock) {
        return RichTextStyle.plainOf(extractCaption(pageBlock));
    }

    static CharSequence readAuthorStyled(TL_iv.PageBlock pageBlock) {
        return RichTextStyle.toSpannable(extractCaption(pageBlock));
    }

    public void persistAuthor() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !isQuoteBlock(blockRow.block)) {
            return;
        }
        setCaption(this.currentRow.block, RichTextStyle.fromSpannable(this.authorEditText.getText()));
    }

    public RichEditText getAuthorEditText() {
        return this.authorEditText;
    }

    public boolean isAuthorVisible() {
        return this.authorEditText.getVisibility() == 0;
    }

    public boolean isAuthorFocused() {
        return this.authorEditText.isFocused();
    }

    public void focusAuthorEnd() {
        ensureAuthorVisibleAndFocus();
    }

    public void focusAuthorFromBody() {
        final float caretX = caretX(this.editText);
        if (this.authorEditText.getVisibility() != 0) {
            this.authorEditText.setVisibility(0);
            requestLayout();
        }
        this.authorEditText.requestEditFocus();
        this.authorEditText.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                RichTextCell.$r8$lambda$doAVWkhRczp1kiWU1UAXwRXBqwM(RichTextCell.this, caretX);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$doAVWkhRczp1kiWU1UAXwRXBqwM(RichTextCell richTextCell, float f) {
        Layout layout = richTextCell.authorEditText.getLayout();
        int length = richTextCell.authorEditText.length();
        if (layout != null) {
            length = layout.getOffsetForHorizontal(0, f);
        }
        RichEditText richEditText = richTextCell.authorEditText;
        richEditText.setSelection(Math.max(0, Math.min(length, richEditText.length())));
    }

    public void focusBodyFromAuthor() {
        final float caretX = caretX(this.authorEditText);
        this.editText.requestEditFocus();
        this.editText.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RichTextCell.$r8$lambda$FzB43jT4_VUBdGFSkdN4CwEkUvk(RichTextCell.this, caretX);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$FzB43jT4_VUBdGFSkdN4CwEkUvk(RichTextCell richTextCell, float f) {
        Layout layout = richTextCell.editText.getLayout();
        int length = richTextCell.editText.length();
        if (layout != null) {
            length = layout.getOffsetForHorizontal(Math.max(0, layout.getLineCount() - 1), f);
        }
        RichEditText richEditText = richTextCell.editText;
        richEditText.setSelection(Math.max(0, Math.min(length, richEditText.length())));
    }

    private static float caretX(RichEditText richEditText) {
        Layout layout = richEditText.getLayout();
        if (layout == null) {
            return 0.0f;
        }
        return layout.getPrimaryHorizontal(Math.max(0, Math.min(richEditText.getSelectionEnd(), richEditText.length())));
    }

    private static void setRichText(TL_iv.PageBlock pageBlock, TL_iv.RichText richText) {
        pageBlock.text = richText;
    }

    public static void applyTextToBlock(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        syncLiveListVerticalPadding();
        int size = View.MeasureSpec.getSize(i);
        if (this.authorEditText.getVisibility() == 8) {
            this.collapseExtraHeight = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        this.row.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.authorEditText.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingTop = getPaddingTop() + this.row.getMeasuredHeight() + this.authorEditText.getMeasuredHeight() + getPaddingBottom();
        int collapseButtonExtraHeight = collapseButtonExtraHeight(size, paddingTop);
        this.collapseExtraHeight = collapseButtonExtraHeight;
        setMeasuredDimension(size, paddingTop + collapseButtonExtraHeight);
    }

    private void syncLiveListVerticalPadding() {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || blockRow.level <= 0 || (delegate = this.delegate) == null) {
            return;
        }
        int listPaddingTop = delegate.getListPaddingTop(blockRow);
        int listPaddingBottom = this.delegate.getListPaddingBottom(this.currentRow);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2.quoteFirst) {
            listPaddingTop = RichBlockChrome.quoteTopPad(blockRow2);
        }
        BlockRow blockRow3 = this.currentRow;
        if (blockRow3.quoteLast) {
            listPaddingBottom = RichBlockChrome.quoteBottomPad(blockRow3);
        }
        if (listPaddingTop == getPaddingTop() && listPaddingBottom == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), listPaddingTop, getPaddingRight(), listPaddingBottom);
    }

    private int collapseButtonExtraHeight(int i, int i2) {
        Layout layout;
        if (hasCollapseButton() && this.authorEditText.getVisibility() == 0 && (layout = this.authorEditText.getLayout()) != null && layout.getLineCount() > 0) {
            ensureCollapseButton();
            int lineCount = layout.getLineCount() - 1;
            int paddingTop = getPaddingTop() + this.row.getMeasuredHeight();
            float paddingLeft = getPaddingLeft() + this.authorEditText.getPaddingLeft() + layout.getLineRight(lineCount);
            float paddingTop2 = this.authorEditText.getPaddingTop() + paddingTop + layout.getLineTop(lineCount);
            float paddingTop3 = paddingTop + this.authorEditText.getPaddingTop() + layout.getLineBottom(lineCount);
            int dp = AndroidUtilities.dp(3.333f);
            float dp2 = ((i - AndroidUtilities.dp(16.0f)) - dp) - this.collapseButton.width();
            int i3 = i2 - dp;
            float height = i3 - this.collapseButton.height();
            float f = i3;
            boolean z = paddingLeft > dp2;
            boolean z2 = paddingTop3 > height && paddingTop2 < f;
            if (z && z2) {
                return (int) Math.ceil(Math.max(0.0f, (((paddingTop3 + AndroidUtilities.dp(4.0f)) + r4) + dp) - i2));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean collapseButtonExtraHeightChanged() {
        int measuredWidth = getMeasuredWidth();
        return measuredWidth <= 0 || collapseButtonExtraHeight(measuredWidth, ((getPaddingTop() + this.row.getMeasuredHeight()) + this.authorEditText.getMeasuredHeight()) + getPaddingBottom()) != this.collapseExtraHeight;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        updateCollapsedDecoration();
        if (this.authorEditText.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.row;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, this.row.getMeasuredHeight() + paddingTop);
        int measuredHeight = paddingTop + this.row.getMeasuredHeight();
        RichEditText richEditText = this.authorEditText;
        richEditText.layout(paddingLeft, measuredHeight, richEditText.getMeasuredWidth() + paddingLeft, this.authorEditText.getMeasuredHeight() + measuredHeight);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.showCommandBackground == z) {
            return;
        }
        this.showCommandBackground = z;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        int i;
        BlockRow blockRow = this.currentRow;
        float f2 = 0.0f;
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPreformatted)) {
            this.bgPaint.setColor(Theme.getColor(Theme.key_chat_inArticleCodeBackground, this.resourcesProvider));
            int quoteInset = RichBlockChrome.quoteInset(this.currentRow);
            int quoteInsetEnd = RichBlockChrome.quoteInsetEnd(this.currentRow);
            int width = getWidth();
            if (quoteInset > 0 || quoteInsetEnd > 0) {
                int dp = AndroidUtilities.dp(16.0f) + quoteInset;
                int dp2 = AndroidUtilities.dp(16.0f) + quoteInsetEnd;
                i = RichBlockChrome.rtl() ? dp2 : dp;
                int width2 = getWidth();
                if (!RichBlockChrome.rtl()) {
                    dp = dp2;
                }
                width = width2 - dp;
            } else {
                i = 0;
            }
            float dp3 = (i > 0 || width < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            canvas.drawRoundRect(i, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), dp3, dp3, this.bgPaint);
            canvas2 = canvas;
        } else if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote)) {
            if (this.quoteLine == null) {
                ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
                this.quoteLine = replyMessageLine;
                replyMessageLine.check(null, null, null, this.resourcesProvider, 1);
                RichBlockChrome.applyEditorQuoteColor(this.quoteLine, this.resourcesProvider);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
            float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
            canvas2 = canvas;
            this.quoteLine.drawBackground(canvas2, rectF, floor, floor, floor, 1.0f);
            this.quoteLine.drawLine(canvas2, rectF, 1.0f);
        } else {
            canvas2 = canvas;
            if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPullquote)) {
                if (this.quoteLine == null) {
                    ReplyMessageLine replyMessageLine2 = new ReplyMessageLine(this);
                    this.quoteLine = replyMessageLine2;
                    replyMessageLine2.check(null, null, null, this.resourcesProvider, 1);
                    RichBlockChrome.applyEditorQuoteColor(this.quoteLine, this.resourcesProvider);
                }
                if (this.quoteIcon == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                    this.quoteIcon = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                }
                Layout layout = this.editText.getLayout();
                float width3 = getWidth();
                if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                    f = 0.0f;
                    for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                        width3 = Math.min(width3, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout.getLineLeft(i2));
                        f = Math.max(f, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout.getLineRight(i2));
                    }
                } else if (this.editText.getHint() != null) {
                    float measureText = this.editText.getPaint().measureText(this.editText.getHint().toString());
                    width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    f = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                } else {
                    f = 0.0f;
                }
                if (this.authorEditText.getVisibility() == 0) {
                    Layout layout2 = this.authorEditText.getLayout();
                    if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                        for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                            width3 = Math.min(width3, this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft() + layout2.getLineLeft(i3));
                            f = Math.max(f, this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft() + layout2.getLineRight(i3));
                        }
                    } else if (this.authorEditText.getHint() != null) {
                        float measureText2 = this.authorEditText.getPaint().measureText(this.authorEditText.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f = Math.max(f, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                    }
                }
                if (width3 < f) {
                    float dp4 = width3 - AndroidUtilities.dp(30.0f);
                    float dp5 = f + AndroidUtilities.dp(30.0f);
                    float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                    int dp6 = AndroidUtilities.dp(8.0f);
                    int height = getHeight() - AndroidUtilities.dp(8.0f);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp4, dp6, dp5, height);
                    this.quoteLine.drawBackground(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                    canvas2.save();
                    int i4 = (int) dp4;
                    this.quoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i4, dp6 + AndroidUtilities.dp(7.0f), i4 + AndroidUtilities.dp(8.0f) + this.quoteIcon.getIntrinsicWidth(), dp6 + AndroidUtilities.dp(7.0f) + this.quoteIcon.getIntrinsicHeight());
                    canvas2.scale(-1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                    this.quoteIcon.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    int i5 = (int) dp5;
                    this.quoteIcon.setBounds((i5 - AndroidUtilities.dp(8.0f)) - this.quoteIcon.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.quoteIcon.getIntrinsicHeight(), i5 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                    canvas2.scale(1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                    this.quoteIcon.draw(canvas2);
                    canvas2.restore();
                }
            }
        }
        if (this.showCommandBackground) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = this.editText.getLayout();
            float f3 = 0.0f;
            if (layout3 != null) {
                for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                    height2 = Math.min(height2, getPaddingTop() + this.editText.getPaddingTop() + layout3.getLineTop(i6));
                    width4 = Math.min(width4, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout3.getLineLeft(i6));
                    f2 = Math.max(f2, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout3.getLineRight(i6));
                    f3 = Math.max(height2, getPaddingTop() + this.editText.getPaddingTop() + layout3.getLineBottom(i6));
                }
            }
            if (width4 < f2 && height2 < f3) {
                float dp7 = width4 - AndroidUtilities.dp(4.0f);
                this.bgPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.05f));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp7, height2 - AndroidUtilities.dp(2.0f), f2 + AndroidUtilities.dp(4.0f), f3 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.bgPaint);
                canvas2 = canvas3;
            }
        }
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null) {
            this.tmpBlocks.clear();
            fillTextLayoutBlocks(this.tmpBlocks);
            for (int i7 = 0; i7 < this.tmpBlocks.size(); i7++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) this.tmpBlocks.get(i7);
                canvas2.save();
                canvas2.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                selectionHelper.draw(canvas2, this, i7);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        drawCollapseButton(canvas);
    }

    private boolean isBlockquote() {
        BlockRow blockRow = this.currentRow;
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote);
    }

    private boolean hasCollapseButton() {
        Layout layout;
        return isBlockquote() && (layout = this.editText.getLayout()) != null && layout.getLineCount() > QuoteSpan.COLLAPSE_LINES;
    }

    private void ensureCollapseButton() {
        if (this.collapseButton == null) {
            this.collapseButton = new QuoteCollapseButton(this);
        }
    }

    private void drawCollapseButton(Canvas canvas) {
        if (isBlockquote()) {
            ensureCollapseButton();
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.currentRow.block;
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
            int dp = AndroidUtilities.dp(3.333f);
            this.collapseButton.draw(canvas, this.collapseButtonBounds, (getWidth() - AndroidUtilities.dp(16.0f)) - dp, (getHeight() - AndroidUtilities.dp(8.0f)) - dp, color, pageblockblockquote.collapsed, hasCollapseButton());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetCollapsedIfTooShort() {
        if (!isBlockquote() || hasCollapseButton()) {
            return;
        }
        ((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed = false;
    }

    private void toggleCollapsed() {
        if (isBlockquote()) {
            ((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed = !r0.collapsed;
            updateCollapsedDecoration();
            invalidate();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onTextChanged(this.currentRow);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (hasCollapseButton() && this.collapseButton != null) {
            boolean contains = this.collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (this.collapseButtonPressed) {
                            this.collapseButton.setPressed(contains);
                            return true;
                        }
                    } else if (actionMasked == 3 && this.collapseButtonPressed) {
                        this.collapseButtonPressed = false;
                        this.collapseButton.setPressed(false);
                        return true;
                    }
                } else if (this.collapseButtonPressed) {
                    this.collapseButtonPressed = false;
                    this.collapseButton.setPressed(false);
                    if (contains) {
                        toggleCollapsed();
                    }
                    return true;
                }
            } else if (contains) {
                this.collapseButtonPressed = true;
                this.collapseButton.setPressed(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:22:0x004e, B:24:0x0052, B:26:0x005a, B:28:0x005e, B:29:0x0066), top: B:21:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:22:0x004e, B:24:0x0052, B:26:0x005a, B:28:0x005e, B:29:0x0066), top: B:21:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateCollapsedDecoration() {
        int i;
        CharacterStyle characterStyle;
        Layout layout;
        int lineStart;
        if (!OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(this.editText.getText())) {
            return;
        }
        Editable text = this.editText.getText();
        int i2 = -1;
        try {
            if (isBlockquote() && ((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed && (layout = this.editText.getLayout()) != null) {
                int lineCount = layout.getLineCount();
                int i3 = QuoteSpan.COLLAPSE_LINES;
                if (lineCount > i3 && (lineStart = layout.getLineStart(i3)) < (i = text.length())) {
                    i2 = lineStart;
                    if (i2 == this.collapsedPartStart || i != this.collapsedPartEnd) {
                        this.applyingCollapsedDecoration = true;
                        characterStyle = this.collapsedPart;
                        if (characterStyle != null) {
                            text.removeSpan(characterStyle);
                        }
                        if (i2 >= 0) {
                            if (this.collapsedPart == null) {
                                this.collapsedPart = new CollapsedTextPart();
                            }
                            text.setSpan(this.collapsedPart, i2, i, 33);
                        }
                        this.applyingCollapsedDecoration = false;
                        this.collapsedPartStart = i2;
                        this.collapsedPartEnd = i;
                        return;
                    }
                    return;
                }
            }
            characterStyle = this.collapsedPart;
            if (characterStyle != null) {
            }
            if (i2 >= 0) {
            }
            this.applyingCollapsedDecoration = false;
            this.collapsedPartStart = i2;
            this.collapsedPartEnd = i;
            return;
        } catch (Throwable th) {
            this.applyingCollapsedDecoration = false;
            throw th;
        }
        i = -1;
        if (i2 == this.collapsedPartStart) {
        }
        this.applyingCollapsedDecoration = true;
    }

    private class CollapsedTextPart extends CharacterStyle {
        private CollapsedTextPart() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.blendOver(Theme.multAlpha(textPaint.getColor(), 0.55f), Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, RichTextCell.this.resourcesProvider), 0.4f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class CheckBoxView extends View {
        private final CheckBoxBase checkBox;

        CheckBoxView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, resourcesProvider);
            this.checkBox = checkBoxBase;
            checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
            checkBoxBase.setBackgroundType(10);
            checkBoxBase.setDrawUnchecked(true);
            checkBoxBase.setCustomRadius(AndroidUtilities.dp(5.0f));
        }

        void setChecked(boolean z, boolean z2) {
            this.checkBox.setChecked(z, z2);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.checkBox.onAttachedToWindow();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.checkBox.onDetachedFromWindow();
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(24.0f));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int dp = AndroidUtilities.dp(20.0f);
            this.checkBox.setBounds((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
            this.checkBox.draw(canvas);
        }
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public RichTextCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichTextCell richTextCell = new RichTextCell(context, resourcesProvider);
            richTextCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richTextCell;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichTextCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2, uItem.red);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate, boolean z) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = blockRow;
            ofFactory.object2 = delegate;
            ofFactory.red = z;
            return ofFactory;
        }
    }
}
