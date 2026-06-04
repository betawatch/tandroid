package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichTextCell;

/* loaded from: classes3.dex */
public class RichTextCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final TextView bullet;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichEditText editText;
    private boolean forceHint;
    private boolean hijackingSelection;
    private final View indentSpacer;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout row;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onBackspace(BlockRow blockRow);

        boolean onBackspaceAtStart(BlockRow blockRow);

        void onEnter(BlockRow blockRow);

        boolean onIndent(BlockRow blockRow, boolean z);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void onTextChanged(BlockRow blockRow);

        void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2);
    }

    public RichTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        this.row = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.indentSpacer = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        TextView textView = new TextView(context);
        this.bullet = textView;
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(28, -2));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        richEditText.setListener(new 1());
        richEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                RichTextCell.this.lambda$new$0(view2, z);
            }
        });
        linearLayout.addView(richEditText, LayoutHelper.createLinear(0, -2, 1.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 6.0f, 16.0f, 0.0f));
        updateColors();
    }

    class 1 implements RichEditText.Listener {
        1() {
        }

        @Override // org.telegram.ui.iv.RichEditText.Listener
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            Transform matchEnterTrigger = RichTextCell.matchEnterTrigger(richEditText.getText().toString(), RichTextCell.this.currentRow);
            if (matchEnterTrigger != null) {
                RichTextCell.this.delegate.onTransform(RichTextCell.this.currentRow, matchEnterTrigger.block, matchEnterTrigger.level, matchEnterTrigger.num);
            } else {
                RichTextCell.this.delegate.onEnter(RichTextCell.this.currentRow);
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
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.applyTextToBlock(RichTextCell.this.currentRow.block, editable.toString());
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            final Transform matchMarkdownTrigger = RichTextCell.matchMarkdownTrigger(editable.toString(), RichTextCell.this.currentRow);
            if (matchMarkdownTrigger == null || RichTextCell.this.delegate == null) {
                return;
            }
            final BlockRow blockRow = RichTextCell.this.currentRow;
            RichTextCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.1.this.lambda$onTextChanged$0(blockRow, matchMarkdownTrigger);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTextChanged$0(BlockRow blockRow, Transform transform) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTransform(blockRow, transform.block, transform.level, transform.num);
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
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTextCell.this) {
                return;
            }
            RichTextCell.this.post(new Runnable() { // from class: org.telegram.ui.iv.RichTextCell$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RichTextCell.1.this.lambda$onSelectionChanged$1(richEditText, i2, selectionHelper, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSelectionChanged$1(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichTextCell.this, i2, i)) {
                return;
            }
            RichTextCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichTextCell.this.hijackingSelection = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, boolean z) {
        this.editText.setHint(getHint());
    }

    public void bind(BlockRow blockRow, Delegate delegate, boolean z) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.forceHint = z;
        applyStyle(blockRow.block);
        applyListDecoration(blockRow.level, blockRow.num);
        String readPlainText = readPlainText(blockRow.block);
        if (String.valueOf(this.editText.getText()).equals(readPlainText)) {
            return;
        }
        this.editText.setTextSilently(readPlainText);
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public void requestEditFocus() {
        this.editText.requestEditFocus();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout = this.editText.getLayout();
        if (layout == null) {
            return;
        }
        final int left = this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft();
        final int top = this.row.getTop() + this.editText.getTop() + this.editText.getPaddingTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichTextCell.2
            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public /* synthetic */ CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getRow() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public Layout getLayout() {
                return layout;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getX() {
                return left;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getY() {
                return top;
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.editText.applyColors();
        this.bullet.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
    }

    private void applyListDecoration(int i, int i2) {
        String str;
        if (i <= 0) {
            this.indentSpacer.setVisibility(8);
            this.bullet.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.indentSpacer.getLayoutParams();
        layoutParams.width = (i - 1) * AndroidUtilities.dp(24.0f);
        this.indentSpacer.setLayoutParams(layoutParams);
        this.indentSpacer.setVisibility(i > 1 ? 0 : 8);
        this.bullet.setVisibility(0);
        TextView textView = this.bullet;
        if (i2 == 0) {
            str = "•";
        } else {
            str = i2 + ".";
        }
        textView.setText(str);
    }

    private String getHint() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "Heading 1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "Heading 2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "Heading 3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "Heading 4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "Heading 5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "Heading 6";
        }
        if (!this.forceHint) {
            if (this.editText.isFocused() && !this.currentRow.isInList()) {
                return "Type something…";
            }
            return null;
        }
        return "Type something…";
    }

    private void applyStyle(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            this.editText.setTextSize(1, 24.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            this.editText.setTextSize(1, 22.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            this.editText.setTextSize(1, 20.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            this.editText.setTextSize(1, 18.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            this.editText.setTextSize(1, 16.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            this.editText.setTextSize(1, 14.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        } else {
            this.editText.setTextSize(1, 16.0f);
            this.editText.setTypeface(null);
        }
        this.editText.setHint(getHint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Transform {
        final TL_iv.PageBlock block;
        final int level;
        final int num;

        Transform(TL_iv.PageBlock pageBlock, int i, int i2) {
            this.block = pageBlock;
            this.level = i;
            this.num = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Transform matchMarkdownTrigger(String str, BlockRow blockRow) {
        int length;
        char charAt;
        char charAt2;
        char charAt3;
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockParagraph) && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                if (str.charAt(0) == '#') {
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
                if (blockRow.level == 0 && length == 2 && ((charAt3 = str.charAt(0)) == '-' || charAt3 == '*' || charAt3 == '+')) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph, "");
                    return new Transform(pageblockparagraph, 1, 0);
                }
                if (blockRow.level == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt2 = str.charAt(1)) == '.' || charAt2 == ')')) {
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph2, "");
                    return new Transform(pageblockparagraph2, 1, 1);
                }
                if (blockRow.level == 0 && length == 4 && (((charAt = str.charAt(0)) == '-' || charAt == '*' || charAt == '_') && str.charAt(1) == charAt && str.charAt(2) == charAt)) {
                    return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
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
        int i3 = 3;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new Transform(newHeading(charAt - '0'), blockRow.level, blockRow.num);
        }
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return new Transform(new TL_iv.pageBlockPhoto(), 0, 0);
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return new Transform(new TL_iv.pageBlockVideo(), 0, 0);
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
            pageblockmath.source = "";
            return new Transform(pageblockmath, 0, 0);
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.zoom = 15;
            pageblockmap.w = 600;
            pageblockmap.h = 400;
            return new Transform(pageblockmap, 0, 0);
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
                    try {
                        i = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                        i3 = i2;
                    } catch (NumberFormatException unused) {
                        i3 = i2;
                        i = 3;
                        return new Transform(newEmptyTable(i3, i), 0, 0);
                    }
                } catch (NumberFormatException unused2) {
                    i2 = 3;
                }
                return new Transform(newEmptyTable(i3, i), 0, 0);
            }
        }
        i = 3;
        return new Transform(newEmptyTable(i3, i), 0, 0);
    }

    private static TL_iv.pageBlockTable newEmptyTable(int i, int i2) {
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
        TL_iv.RichText extractRichText = extractRichText(pageBlock);
        if (extractRichText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) extractRichText).text;
        }
        return "";
    }

    static void applyTextToBlock(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            ((TL_iv.pageBlockParagraph) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            ((TL_iv.pageBlockHeading1) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            ((TL_iv.pageBlockHeading2) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            ((TL_iv.pageBlockHeading3) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            ((TL_iv.pageBlockHeading4) pageBlock).text = textplain;
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            ((TL_iv.pageBlockHeading5) pageBlock).text = textplain;
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            ((TL_iv.pageBlockHeading6) pageBlock).text = textplain;
        }
    }

    private static TL_iv.RichText extractRichText(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return ((TL_iv.pageBlockParagraph) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return ((TL_iv.pageBlockHeading1) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return ((TL_iv.pageBlockHeading2) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return ((TL_iv.pageBlockHeading3) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return ((TL_iv.pageBlockHeading4) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return ((TL_iv.pageBlockHeading5) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return ((TL_iv.pageBlockHeading6) pageBlock).text;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null && this.editText.getLayout() != null) {
            canvas.save();
            canvas.translate(this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft(), this.row.getTop() + this.editText.getTop() + this.editText.getPaddingTop());
            selectionHelper.draw(canvas, this, 0);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
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
            return new RichTextCell(context, resourcesProvider);
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
