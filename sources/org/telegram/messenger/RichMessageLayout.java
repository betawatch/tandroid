package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$-CC;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToIntFunction;
import kf.r;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x21;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.i20;
import org.telegram.ui.kj0;
import org.telegram.ui.lj0;
import org.telegram.ui.mj0;
import org.telegram.ui.yb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class RichMessageLayout {
    private static final int ORDERED_LIST_MARKER_START_DP = 6;
    private static final int ORDERED_LIST_MARKER_WIDTH_DP = 28;
    public static final int PART_MAX_HEIGHT_DP = 900;
    public static final int QUOTE_NEST_VPAD = 3;
    public static final int TEXT_FLAG_BLOCKS = 15;
    public static final int TEXT_FLAG_BLOCK_BUTTON = 13;
    public static final int TEXT_FLAG_BLOCK_CAPTION = 10;
    public static final int TEXT_FLAG_BLOCK_CODE = 8;
    public static final int TEXT_FLAG_BLOCK_FOOTER = 7;
    public static final int TEXT_FLAG_BLOCK_HEADING1 = 1;
    public static final int TEXT_FLAG_BLOCK_HEADING2 = 2;
    public static final int TEXT_FLAG_BLOCK_HEADING3 = 3;
    public static final int TEXT_FLAG_BLOCK_HEADING4 = 4;
    public static final int TEXT_FLAG_BLOCK_HEADING5 = 5;
    public static final int TEXT_FLAG_BLOCK_HEADING6 = 6;
    public static final int TEXT_FLAG_BLOCK_PULLQUOTE = 12;
    public static final int TEXT_FLAG_BLOCK_QUOTE = 9;
    public static final int TEXT_FLAG_BLOCK_QUOTE_CAPTION = 11;
    public static final int TEXT_FLAG_BLOCK_TABLE = 14;
    public static final int TEXT_FLAG_BLOCK_TABLE_TITLE = 15;
    public static final int TEXT_FLAG_BOLD = 16;
    public static final int TEXT_FLAG_ITALIC = 32;
    public static final int TEXT_FLAG_MARKED = 8192;
    public static final int TEXT_FLAG_MONO = 256;
    public static final int TEXT_FLAG_STRIKETHROUGH = 128;
    public static final int TEXT_FLAG_SUBSCRIPT = 2048;
    public static final int TEXT_FLAG_SUPERSCRIPT = 4096;
    public static final int TEXT_FLAG_UNDERLINE = 64;
    public static final int TEXT_FLAG_URL = 512;
    public static final int TEXT_FLAG_WEBPAGE_URL = 1024;
    public final HashMap<String, Integer> anchors;
    public final HashMap<TL_iv.pageBlockAudio, MessageObject> audioBlocks;
    public final ArrayList<MessageObject> audioMessages;
    public boolean blockquoteAnimating;
    public final ArrayList<RichBlock> blocks;
    private org.telegram.ui.Cells.s1 cell;
    public final i20 clip;
    public final int currentAccount;
    private org.telegram.ui.Cells.j1 delegate;
    private float density;
    public boolean detailsAnimating;
    private float detailsAnimationProgress;
    private int fontSize;
    public boolean forceTranslationLoading;
    protected int height;
    public boolean invalidateAnimatedEmojiInParent;
    public boolean isPart;
    public CharSequence joinedText;
    protected int maxWidth;
    public final MessageObject messageObject;
    protected int minWidth;
    public final TextPaint numTextPaint;
    public int padLeft;
    public int padRight;
    private RichBlock pressedBlock;
    private int pressedBlockY;
    private RichMessageLayout prev;
    private Drawable pullquoteIcon;
    public final zl0 quoteLine;
    public final ArrayList<QuoteBackground> quotes;
    protected org.telegram.ui.ActionBar.f6 resourcesProvider;
    public TL_iv.RichMessage richMessage;
    private org.telegram.ui.Components.rc showMoreBounce;
    private j90 showMoreLoading;
    private Paint showMorePaint;
    private boolean showMorePressed;
    private final RectF showMoreRect;
    private k01 showMoreText;
    private ih.j spoilerEffect2;
    public final HashMap<String, TL_iv.textAnchor> textAnchors;
    public final ArrayList<Integer> textBlockBlockIndex;
    public final ArrayList<Integer> textBlockCharOffsets;
    public final ArrayList<org.telegram.ui.Cells.w9> textBlocks;
    public final TextPaint textPaint;
    private org.telegram.ui.Components.z5 translationLoadingFloat;
    public float translationLoadingValue;
    public mj0 typingAnimator;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocks;
    public final ArrayList<RichUnsupportedBlock> unsupportedBlocksRoot;
    public View view;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class FoundLink {
        public int end;
        public StaticLayout layout;
        public int originalWidth;
        public int start;
        public float x;
        public float y;
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class PreviewView extends View implements org.telegram.ui.Cells.k9 {
        private boolean allowActions;
        private final int currentAccount;
        private int insetBottom;
        private int insetLeft;
        private int insetRight;
        private int insetTop;
        private RichMessageLayout layout;
        private int maxHeight;
        private MessageObject messageObject;
        private int minHeight;
        private org.telegram.ui.ActionBar.f6 resourcesProvider;
        private TL_iv.RichMessage richMessage;
        private org.telegram.ui.Cells.l9 textSelectionHelper;
        private Runnable textSelectionLongPressRunnable;
        private boolean translationLoading;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static final class Factory extends h51 {
            static {
                h51.setup(new Factory());
            }

            public static i51 of(TL_iv.RichMessage richMessage) {
                i51 J = i51.J(Factory.class);
                J.G = richMessage;
                return J;
            }

            @Override // org.telegram.ui.Components.h51
            public void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
                PreviewView previewView = (PreviewView) view;
                previewView.set((TL_iv.RichMessage) i51Var.G);
                previewView.setTranslationLoading(i51Var.e);
            }

            @Override // org.telegram.ui.Components.h51
            public boolean contentsEquals(i51 i51Var, i51 i51Var2) {
                return i51Var.d == i51Var2.d && i51Var.G == i51Var2.G && i51Var.e == i51Var2.e;
            }

            @Override // org.telegram.ui.Components.h51
            public boolean equals(i51 i51Var, i51 i51Var2) {
                return i51Var.d == i51Var2.d;
            }

            @Override // org.telegram.ui.Components.h51
            public boolean isClickable() {
                return false;
            }

            @Override // org.telegram.ui.Components.h51
            public PreviewView createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
                PreviewView previewView = new PreviewView(context, i10, f6Var);
                previewView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
                return previewView;
            }
        }

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static class PaddedTextLayoutBlock implements org.telegram.ui.Cells.w9 {
            private final org.telegram.ui.Cells.w9 inner;
            private final int px;
            private final int py;

            public PaddedTextLayoutBlock(org.telegram.ui.Cells.w9 w9Var, int i10, int i11) {
                this.inner = w9Var;
                this.px = i10;
                this.py = i11;
            }

            @Override // org.telegram.ui.Cells.w9
            public Layout getLayout() {
                return this.inner.getLayout();
            }

            @Override // org.telegram.ui.Cells.w9
            public CharSequence getPrefix() {
                return this.inner.getPrefix();
            }

            @Override // org.telegram.ui.Cells.w9
            public int getRow() {
                return this.inner.getRow();
            }

            @Override // org.telegram.ui.Cells.w9
            public /* bridge */ /* synthetic */ Rect getSelectionBounds() {
                return null;
            }

            @Override // org.telegram.ui.Cells.w9
            public CharSequence getText() {
                return this.inner.getText();
            }

            @Override // org.telegram.ui.Cells.w9
            public int getX() {
                return this.inner.getX() + this.px;
            }

            @Override // org.telegram.ui.Cells.w9
            public int getY() {
                return this.inner.getY() + this.py;
            }
        }

        public PreviewView(Context context) {
            this(context, UserConfig.selectedAccount, null);
        }

        private void buildLayout(int i10) {
            TL_iv.RichMessage richMessage;
            if (i10 <= 0 || (richMessage = this.richMessage) == null) {
                this.layout = null;
                return;
            }
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || richMessageLayout.needsUpdate(richMessage, i10)) {
                RichMessageLayout richMessageLayout2 = this.layout;
                if (richMessageLayout2 != null) {
                    richMessageLayout2.detach(this);
                }
                RichMessageLayout richMessageLayout3 = new RichMessageLayout(this.messageObject, i10, (RichMessageLayout) null);
                this.layout = richMessageLayout3;
                richMessageLayout3.forceTranslationLoading = this.translationLoading;
                richMessageLayout3.setResourcesProvider(this.resourcesProvider);
                RichMessageLayout richMessageLayout4 = this.layout;
                richMessageLayout4.invalidateAnimatedEmojiInParent = true;
                richMessageLayout4.checkQuoteLine(null, null);
                if (isAttachedToWindow()) {
                    this.layout.attach(this);
                    this.layout.updateAnimatedEmojis(0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTouchEvent$0() {
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout == null || !richMessageLayout.isPressingLink()) {
                this.textSelectionHelper.m0();
            }
        }

        @Override // org.telegram.ui.Cells.k9
        public void fillTextLayoutBlocks(ArrayList<org.telegram.ui.Cells.w9> arrayList) {
            if (this.layout != null) {
                int i10 = this.insetLeft;
                int i11 = this.insetTop;
                for (int i12 = 0; i12 < this.layout.textBlocks.size(); i12++) {
                    arrayList.add(new PaddedTextLayoutBlock(this.layout.textBlocks.get(i12), i10, i11));
                }
            }
        }

        @Override // android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.attach(this);
                this.layout.updateAnimatedEmojis(0);
            }
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(this);
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            if (this.layout == null) {
                return;
            }
            float height = (getHeight() - this.insetTop) - this.insetBottom;
            boolean z4 = this.layout.getHeight() > (getHeight() - this.insetTop) - this.insetBottom;
            canvas.save();
            if (z4) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            canvas.translate(this.insetLeft, this.insetTop);
            this.layout.draw(canvas, this.insetLeft, Math.max(0, (getWidth() - this.layout.getMinWidth()) - this.insetLeft), null, 0.0f, height);
            if (this.layout.hasOverlay()) {
                this.layout.drawOverlay(canvas, null);
            }
            if (z4) {
                canvas.translate(-this.insetLeft, -this.insetTop);
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, getHeight() - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
                this.layout.clip.b(canvas, rectF, 3, 1.0f);
                canvas.restore();
                canvas.restore();
            }
            canvas.restore();
            org.telegram.ui.Cells.l9 l9Var = this.textSelectionHelper;
            if (l9Var == null || !l9Var.y()) {
                return;
            }
            int i10 = this.insetLeft;
            int i11 = this.insetTop;
            for (int i12 = 0; i12 < this.layout.textBlocks.size(); i12++) {
                org.telegram.ui.Cells.w9 w9Var = this.layout.textBlocks.get(i12);
                canvas.save();
                canvas.translate(w9Var.getX() + i10, w9Var.getY() + i11);
                this.textSelectionHelper.a0(canvas, this, i12);
                canvas.restore();
            }
        }

        @Override // android.view.View
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            buildLayout((size - this.insetLeft) - this.insetRight);
            RichMessageLayout richMessageLayout = this.layout;
            int height = (richMessageLayout != null ? richMessageLayout.getHeight() : 0) + this.insetTop + this.insetBottom;
            int i12 = this.maxHeight;
            if (i12 > 0 && height > i12) {
                height = i12;
            }
            int i13 = this.minHeight;
            if (i13 > 0 && height < i13) {
                height = i13;
            }
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE) {
                height = Math.min(height, View.MeasureSpec.getSize(i11));
            } else if (mode == 1073741824) {
                height = View.MeasureSpec.getSize(i11);
            }
            setMeasuredDimension(size, height);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Runnable runnable;
            if (!this.allowActions) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.textSelectionHelper != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.textSelectionHelper.l0(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                    if (this.textSelectionLongPressRunnable == null) {
                        this.textSelectionLongPressRunnable = new xg(this, 6);
                    }
                    removeCallbacks(this.textSelectionLongPressRunnable);
                    postDelayed(this.textSelectionLongPressRunnable, ViewConfiguration.getLongPressTimeout());
                } else if ((action == 1 || action == 2 || action == 3) && (runnable = this.textSelectionLongPressRunnable) != null) {
                    removeCallbacks(runnable);
                }
            }
            if (this.layout != null) {
                motionEvent.offsetLocation(-this.insetLeft, -this.insetTop);
                boolean onTouchEvent = this.layout.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(this.insetLeft, this.insetTop);
                if (onTouchEvent) {
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        public void set(TL_iv.RichMessage richMessage) {
            if (this.richMessage == richMessage) {
                return;
            }
            this.richMessage = richMessage;
            if (this.messageObject == null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                this.messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            }
            this.messageObject.messageOwner.rich_message = richMessage;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.detach(this);
            }
            this.layout = null;
            requestLayout();
            invalidate();
        }

        public void setAllowActions(boolean z4) {
            this.allowActions = z4;
        }

        public void setMaxHeight(int i10) {
            this.maxHeight = i10;
        }

        public void setMinHeight(int i10) {
            this.minHeight = i10;
        }

        @Override // android.view.View
        public void setPadding(int i10, int i11, int i12, int i13) {
            if (this.insetLeft == i10 && this.insetTop == i11 && this.insetRight == i12 && this.insetBottom == i13) {
                return;
            }
            this.insetLeft = i10;
            this.insetTop = i11;
            this.insetRight = i12;
            this.insetBottom = i13;
            requestLayout();
            invalidate();
        }

        public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
            this.resourcesProvider = f6Var;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.setResourcesProvider(f6Var);
            }
        }

        public void setTextSelectionHelper(org.telegram.ui.Cells.l9 l9Var) {
            this.textSelectionHelper = l9Var;
        }

        public void setTranslationLoading(boolean z4) {
            this.translationLoading = z4;
            RichMessageLayout richMessageLayout = this.layout;
            if (richMessageLayout != null) {
                richMessageLayout.forceTranslationLoading = z4;
            }
            invalidate();
        }

        public PreviewView(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
            super(context);
            this.minHeight = -1;
            this.maxHeight = -1;
            this.allowActions = true;
            this.currentAccount = i10;
            this.resourcesProvider = f6Var;
            NotificationCenter.listenEmojiLoading(this);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class QuoteBackground {
        int endBlockIndex;
        int level;
        int outerBottomVpad;
        int outerTopVpad;
        int padding;
        int startBlockIndex;

        public QuoteBackground(int i10, int i11, int i12, int i13) {
            this(i10, i11, i12, i13, 0, 0);
        }

        public QuoteBackground(int i10, int i11, int i12, int i13, int i14) {
            this(i10, i11, i12, i13, i14, i14);
        }

        public QuoteBackground(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.startBlockIndex = i10;
            this.endBlockIndex = i11;
            this.padding = i12;
            this.level = i13;
            this.outerTopVpad = i14;
            this.outerBottomVpad = i15;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static abstract class RichBlock implements kj0 {
        public int accessibilityLabelResId;
        public int accessibilityParentLabelResId;
        private CheckBoxBase checkbox;
        private org.telegram.ui.Components.rc checkboxBounce;
        private TLObject checkboxItem;
        private boolean checkboxPressed;
        private float checkboxY;
        public int currH;
        public float currY;
        protected int layoutRow;
        protected int layoutX;
        protected int layoutY;
        public boolean listCheckbox;
        public boolean listChecked;
        public int listLevel;
        private int listMarkerWidth;
        public boolean listOrdered;
        public final int maxWidth;
        private StaticLayout numLayout;
        private int numLayoutLeft;
        private int numLayoutRight;
        private float numLayoutY;
        public final Rect padding;
        public RichDetailsBlock parentDetails;
        public int prevH;
        public float prevY;
        public final RichMessageLayout root;
        public mj0 typingAnimator;
        protected View view;
        private final RectF checkboxHit = new RectF();
        public boolean currVisible = true;
        public boolean prevVisible = true;

        public RichBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            this.root = richMessageLayout;
            this.padding = new Rect(rect);
            this.maxWidth = (i10 - rect.left) - rect.right;
        }

        public static void appendText(SpannableStringBuilder spannableStringBuilder, Text text, Text[] textArr) {
            StaticLayout staticLayout;
            StaticLayout staticLayout2;
            if (text != null && (staticLayout2 = text.layout) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
                spannableStringBuilder.append(withReplacements(text.layout.getText()));
                return;
            }
            if (textArr != null) {
                for (Text text2 : textArr) {
                    if (text2 != null && (staticLayout = text2.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append(withReplacements(text2.layout.getText()));
                    }
                }
            }
        }

        private boolean canToggleCheckbox() {
            return (this.checkbox == null || this.checkboxItem == null || this.root.getCell() == null || this.root.getDelegate() == null || !this.root.getDelegate().R(this.root.getCell())) ? false : true;
        }

        private int getCheckboxAccessibilityElementCount() {
            return this.checkbox == null ? 0 : 1;
        }

        private boolean getCheckboxChecked() {
            TLObject tLObject = this.checkboxItem;
            if (tLObject instanceof TL_iv.PageListItem) {
                return ((TL_iv.PageListItem) tLObject).checked;
            }
            if (tLObject instanceof TL_iv.PageListOrderedItem) {
                return ((TL_iv.PageListOrderedItem) tLObject).checked;
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            return checkBoxBase != null && checkBoxBase.q;
        }

        private void invalidateCell() {
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$toggleCheckbox$1(boolean z4) {
            setCheckboxChecked(!z4);
            View view = this.root.view;
            if (view != null) {
                this.checkbox.a = view;
            }
            this.checkbox.f(-1, !z4, true);
            invalidateCell();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$withReplacements$0(Spanned spanned, org.telegram.ui.Cells.r9 r9Var, org.telegram.ui.Cells.r9 r9Var2) {
            return spanned.getSpanStart(r9Var2) - spanned.getSpanStart(r9Var);
        }

        private void setCheckboxChecked(boolean z4) {
            TLObject tLObject = this.checkboxItem;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z4;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z4;
            }
        }

        private void toggleCheckbox() {
            if (canToggleCheckbox()) {
                if (!MessagesController.getInstance(this.root.currentAccount).richEditorAllowed()) {
                    new eg.o1(this.root.cell.getContext(), 43, this.root.resourcesProvider).show();
                    return;
                }
                boolean z4 = !getCheckboxChecked();
                setCheckboxChecked(z4);
                View view = this.root.view;
                if (view != null) {
                    this.checkbox.a = view;
                }
                this.checkbox.f(-1, z4, true);
                invalidateCell();
                View view2 = this.root.view;
                if (view2 != null) {
                    view2.performHapticFeedback(3, 2);
                }
                this.root.getDelegate().M(this.root.getCell(), new jh.f(10, this, z4));
            }
        }

        public static CharSequence withReplacements(CharSequence charSequence) {
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Cells.r9[] r9VarArr = (org.telegram.ui.Cells.r9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.r9.class);
            if (r9VarArr == null || r9VarArr.length == 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Arrays.sort(r9VarArr, new xh(spanned, 0));
            for (org.telegram.ui.Cells.r9 r9Var : r9VarArr) {
                int spanStart = spanned.getSpanStart(r9Var);
                int spanEnd = spanned.getSpanEnd(r9Var);
                if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                    CharSequence charSequence2 = r9Var.a;
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
                }
            }
            return spannableStringBuilder;
        }

        public void attach(View view) {
            View view2 = this.view;
            if (view2 == view) {
                return;
            }
            if (view2 != null) {
                onDetachedFromWindow();
                CheckBoxBase checkBoxBase = this.checkbox;
                if (checkBoxBase != null) {
                    checkBoxBase.l = false;
                }
                this.view = null;
            }
            this.view = view;
            CheckBoxBase checkBoxBase2 = this.checkbox;
            if (checkBoxBase2 != null) {
                checkBoxBase2.a = view;
                checkBoxBase2.l = true;
            }
            onAttachedToWindow();
        }

        public void collectAnimatorBlocks(List<kj0> list) {
            list.add(this);
        }

        public void detach(View view) {
            View view2 = this.view;
            if (view2 != null && view2 == view) {
                onDetachedFromWindow();
                CheckBoxBase checkBoxBase = this.checkbox;
                if (checkBoxBase != null) {
                    checkBoxBase.l = false;
                }
                this.view = null;
            }
        }

        public void draw(Canvas canvas) {
            draw(canvas, TLObject.FLAG_31, 0.0f);
        }

        public boolean drawOverlay(Canvas canvas) {
            return drawOverlay(canvas, null);
        }

        public void drawWithTyping(Canvas canvas) {
            mj0 mj0Var = this.typingAnimator;
            if (mj0Var != null && mj0Var.h && mj0Var.d(this) >= 0) {
                if (!mj0Var.j(this)) {
                    return;
                }
                if (mj0Var.g(this)) {
                    draw(canvas, mj0Var.g(this) ? mj0Var.e : -1, mj0Var.g(this) ? mj0Var.f : 0.0f);
                    return;
                }
                float c3 = mj0Var.c(this);
                if (c3 <= 0.0f) {
                    return;
                }
                if (c3 < 1.0f) {
                    Rect rect = this.padding;
                    int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.maxWidth + rect.right, getHeight(), (int) (c3 * 255.0f));
                    draw(canvas);
                    canvas.restoreToCount(saveLayerAlpha);
                    return;
                }
            }
            draw(canvas);
        }

        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            org.telegram.ui.Cells.w9[] text = getText();
            if (text == null) {
                return false;
            }
            for (org.telegram.ui.Cells.w9 w9Var : text) {
                if (w9Var instanceof Text) {
                    if (((Text) w9Var).fillFoundLink(characterStyle, foundLink)) {
                        Rect rect = this.padding;
                        foundLink.x = rect.left - r4.left;
                        foundLink.y = i10 + rect.top;
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean forcesTimeToNewLine() {
            return getLastLineWidth() >= getMinWidth();
        }

        public final void getAccessibilityElementBounds(int i10, Rect rect) {
            if (this.checkbox == null || i10 != 0) {
                getBlockAccessibilityElementBounds(i10 - getCheckboxAccessibilityElementCount(), rect);
            } else {
                int i11 = this.padding.left;
                float f10 = this.currY;
                rect.set(i11, (int) f10, this.maxWidth + i11, (int) (f10 + getHeight()));
            }
            RichMessageLayout richMessageLayout = this.root;
            int i12 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            int min = Math.min(minWidth, Math.max(rect.left, i12));
            rect.left = min;
            rect.right = Math.max(min, Math.min(rect.right, minWidth));
        }

        public final int getAccessibilityElementCount() {
            return getBlockAccessibilityElementCount() + getCheckboxAccessibilityElementCount();
        }

        public final CharSequence getAccessibilityElementStateDescription(int i10) {
            if (isAccessibilityElementCheckbox(i10)) {
                return LocaleController.getString(getCheckboxChecked() ? R.string.AccDescrChecked : R.string.AccDescrNotChecked);
            }
            return getBlockAccessibilityElementStateDescription(i10 - getCheckboxAccessibilityElementCount());
        }

        public final CharSequence getAccessibilityElementText(int i10) {
            if (this.checkbox == null || i10 != 0) {
                return getBlockAccessibilityElementText(i10 - getCheckboxAccessibilityElementCount());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence accessibilityListMarker = getAccessibilityListMarker();
            CharSequence accessibilityLabel = getAccessibilityLabel();
            if (!TextUtils.isEmpty(accessibilityListMarker)) {
                spannableStringBuilder.append(accessibilityListMarker).append(' ');
            }
            if (!TextUtils.isEmpty(accessibilityLabel)) {
                spannableStringBuilder.append(accessibilityLabel).append(", ");
            }
            appendAccessibilityText(spannableStringBuilder);
            return spannableStringBuilder.length() > 0 ? spannableStringBuilder : LocaleController.getString(R.string.AccDescrCheckbox);
        }

        public CharSequence getAccessibilityLabel() {
            int i10 = this.accessibilityParentLabelResId;
            String string = i10 == 0 ? null : LocaleController.getString(i10);
            int i11 = this.accessibilityLabelResId;
            String string2 = i11 != 0 ? LocaleController.getString(i11) : null;
            return TextUtils.isEmpty(string) ? string2 : TextUtils.isEmpty(string2) ? string : TextUtils.concat(string, ", ", string2);
        }

        public CharSequence getAccessibilityListMarker() {
            StaticLayout staticLayout;
            if (!this.listOrdered || (staticLayout = this.numLayout) == null) {
                return null;
            }
            return staticLayout.getText();
        }

        public float getBackgroundScale() {
            return 1.0f;
        }

        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int i11 = this.padding.left;
            float f10 = this.currY;
            rect.set(i11, (int) f10, this.maxWidth + i11, (int) (f10 + getHeight()));
        }

        public int getBlockAccessibilityElementCount() {
            return 0;
        }

        public CharSequence getBlockAccessibilityElementStateDescription(int i10) {
            return null;
        }

        public CharSequence getBlockAccessibilityElementText(int i10) {
            return null;
        }

        public int getContentPaddingTop() {
            return 0;
        }

        public int getHeight() {
            return 0;
        }

        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.ui.kj0
        public Layout getLayout() {
            return null;
        }

        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override // org.telegram.ui.kj0
        public View getParentView() {
            return null;
        }

        public org.telegram.ui.Cells.w9[] getText() {
            return null;
        }

        public final boolean isAccessibilityElementCheckbox(int i10) {
            return this.checkbox != null && i10 == 0;
        }

        public final boolean isAccessibilityElementChecked(int i10) {
            return isAccessibilityElementCheckbox(i10) && getCheckboxChecked();
        }

        public final boolean isAccessibilityElementClickable(int i10) {
            return !isAccessibilityElementCheckbox(i10) || canToggleCheckbox();
        }

        public final boolean isAccessibilityElementText(int i10) {
            return !isAccessibilityElementCheckbox(i10) && isBlockAccessibilityElementText(i10 - getCheckboxAccessibilityElementCount());
        }

        public boolean isAttachedToWindow() {
            return this.view != null;
        }

        public boolean isBlockAccessibilityElementText(int i10) {
            return false;
        }

        public boolean isHorizontallyDragging() {
            return false;
        }

        public boolean isInQuote() {
            int indexOf;
            if (this.root.quotes.isEmpty() || (indexOf = this.root.blocks.indexOf(this)) < 0) {
                return false;
            }
            for (int i10 = 0; i10 < this.root.quotes.size(); i10++) {
                QuoteBackground quoteBackground = this.root.quotes.get(i10);
                if (indexOf >= quoteBackground.startBlockIndex && indexOf <= quoteBackground.endBlockIndex) {
                    return true;
                }
            }
            return false;
        }

        public boolean isPressingLink() {
            org.telegram.ui.Cells.w9[] text = getText();
            if (text == null) {
                return false;
            }
            for (org.telegram.ui.Cells.w9 w9Var : text) {
                if ((w9Var instanceof Text) && ((Text) w9Var).isPressingLink()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isVisible() {
            RichDetailsBlock richDetailsBlock = this.parentDetails;
            if (richDetailsBlock == null) {
                return true;
            }
            if (richDetailsBlock.isOpen()) {
                return this.parentDetails.isVisible();
            }
            return false;
        }

        public final boolean onAccessibilityElementClick(int i10, View view) {
            if (this.checkbox == null || i10 != 0) {
                return onBlockAccessibilityElementClick(i10 - getCheckboxAccessibilityElementCount(), view);
            }
            if (!canToggleCheckbox()) {
                return false;
            }
            toggleCheckbox();
            return true;
        }

        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            return false;
        }

        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            onDraw(canvas);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            org.telegram.ui.Cells.w9[] text = getText();
            if (text == null) {
                return;
            }
            for (org.telegram.ui.Cells.w9 w9Var : text) {
                if (w9Var instanceof Text) {
                    Text text2 = (Text) w9Var;
                    text2.setX(i10 - text2.left);
                    text2.setY(i11);
                    text2.setRow(i12);
                }
            }
        }

        public void requestDisallowParentIntercept(boolean z4) {
            View view = this.view;
            if (view == null) {
                return;
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z4);
            }
        }

        public void setCheckbox(boolean z4) {
            setCheckbox(z4, null);
        }

        public void setListMarkerWidth(int i10) {
            this.listMarkerWidth = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setNum(String str) {
            String str2;
            this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            Layout layout = getLayout();
            CharSequence text = layout == null ? null : layout.getText();
            if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) text).getSpans(0, 1, StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan.flags, 16)) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                        str2 = spannableString;
                        break;
                    }
                }
            }
            str2 = str;
            int i10 = this.listMarkerWidth;
            if (i10 <= 0) {
                i10 = Math.max(this.root.isRtl() ? this.padding.right : this.padding.left, AndroidUtilities.dp(this.root.fontSize + 4));
            }
            int i11 = i10;
            RichMessageLayout richMessageLayout = this.root;
            this.numLayout = new StaticLayout(str2, richMessageLayout.numTextPaint, i11, richMessageLayout.isRtl() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            this.numLayoutLeft = AndroidUtilities.dp(this.root.fontSize + 4);
            this.numLayoutRight = 0;
            for (int i12 = 0; i12 < this.numLayout.getLineCount(); i12++) {
                this.numLayoutLeft = Math.min(this.numLayoutLeft, (int) this.numLayout.getLineLeft(i12));
                this.numLayoutRight = Math.max(this.numLayoutRight, (int) this.numLayout.getLineRight(i12));
            }
            updateListMarkerY();
        }

        public void snapshot() {
            this.prevY = this.currY;
            this.prevH = this.currH;
            this.prevVisible = this.currVisible;
        }

        public boolean touchEvent(MotionEvent motionEvent) {
            View view;
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (this.checkbox != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    boolean contains = this.checkboxHit.contains(motionEvent.getX(), motionEvent.getY());
                    if (actionMasked == 0) {
                        if (contains && canToggleCheckbox()) {
                            this.checkboxPressed = true;
                            if (this.checkboxBounce == null && (view = this.root.view) != null) {
                                this.checkboxBounce = new org.telegram.ui.Components.rc(view);
                            }
                            org.telegram.ui.Components.rc rcVar = this.checkboxBounce;
                            if (rcVar != null) {
                                rcVar.c(true);
                            }
                            invalidateCell();
                            Rect rect2 = this.padding;
                            motionEvent.offsetLocation(rect2.left, rect2.top);
                            return true;
                        }
                    } else if (this.checkboxPressed) {
                        if (actionMasked == 2) {
                            if (!contains) {
                                this.checkboxPressed = false;
                                org.telegram.ui.Components.rc rcVar2 = this.checkboxBounce;
                                if (rcVar2 != null) {
                                    rcVar2.c(false);
                                }
                            }
                        } else if (actionMasked == 1 || actionMasked == 3) {
                            boolean z4 = actionMasked == 1 && contains;
                            this.checkboxPressed = false;
                            org.telegram.ui.Components.rc rcVar3 = this.checkboxBounce;
                            if (rcVar3 != null) {
                                rcVar3.c(false);
                            }
                            if (z4) {
                                toggleCheckbox();
                            }
                            invalidateCell();
                        }
                        Rect rect22 = this.padding;
                        motionEvent.offsetLocation(rect22.left, rect22.top);
                        return true;
                    }
                }
                boolean onTouchEvent = onTouchEvent(motionEvent);
                Rect rect3 = this.padding;
                motionEvent.offsetLocation(rect3.left, rect3.top);
                return onTouchEvent;
            } catch (Throwable th2) {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
                throw th2;
            }
        }

        public final void updateListMarkerY() {
            if (this.numLayout != null) {
                if (getLayout() == null || getLayout().getLineCount() <= 0 || this.numLayout.getLineCount() <= 0) {
                    int dp = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height = getHeight();
                    Rect rect = this.padding;
                    this.numLayoutY = (Math.min(dp, (height - rect.top) - rect.bottom) - this.numLayout.getHeight()) / 2.0f;
                } else {
                    this.numLayoutY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - this.numLayout.getLineBaseline(0);
                }
            }
            if (this.checkbox != null) {
                if (getLayout() != null && getLayout().getLineCount() > 0) {
                    this.checkboxY = (getLayout().getLineBaseline(0) + getContentPaddingTop()) - (AndroidUtilities.dp(20.0f) * 0.7f);
                } else {
                    int dp2 = AndroidUtilities.dp(this.root.fontSize + 14);
                    int height2 = getHeight();
                    Rect rect2 = this.padding;
                    this.checkboxY = (Math.min(dp2, (height2 - rect2.top) - rect2.bottom) - AndroidUtilities.dp(20.0f)) / 2.0f;
                }
            }
        }

        public void draw(Canvas canvas, int i10, float f10) {
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            boolean isRtl = this.root.isRtl();
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect2 = this.padding;
            float f11 = (minWidth - rect2.right) - rect2.left;
            if (this.numLayout != null) {
                this.root.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                RichMessageLayout richMessageLayout = this.root;
                richMessageLayout.numTextPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec));
                canvas.save();
                if (!this.listOrdered && !this.listCheckbox) {
                    float dpf2 = AndroidUtilities.dpf2(4.3f);
                    canvas.drawCircle(isRtl ? ((AndroidUtilities.dp(18.0f) + f11) - AndroidUtilities.dpf2(5.66f)) - (dpf2 / 2.0f) : ((dpf2 / 2.0f) + AndroidUtilities.dpf2(5.66f)) - AndroidUtilities.dp(18.0f), (this.numLayoutY + this.numLayout.getLineBaseline(0)) - (AndroidUtilities.dp(SharedConfig.fontSize) * 0.35f), dpf2 / 2.0f, this.root.numTextPaint);
                } else if (isRtl) {
                    canvas.translate(((AndroidUtilities.dp(6.0f) + f11) - this.numLayoutLeft) + (this.checkbox != null ? AndroidUtilities.dp(26.0f) : 0), this.numLayoutY);
                    this.numLayout.draw(canvas);
                } else {
                    canvas.translate((AndroidUtilities.dp(6.0f) - this.listMarkerWidth) - this.numLayoutLeft, this.numLayoutY);
                    this.numLayout.draw(canvas);
                }
                canvas.restore();
            }
            if (this.checkbox != null) {
                int dp = isRtl ? (int) (f11 + AndroidUtilities.dp(6.0f)) : -AndroidUtilities.dp(26.0f);
                this.checkboxHit.set(dp - AndroidUtilities.dp(6.0f), this.checkboxY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + dp, this.checkboxY + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(6.0f));
                View view = this.root.view;
                if (view != null) {
                    CheckBoxBase checkBoxBase = this.checkbox;
                    if (checkBoxBase.a == null) {
                        checkBoxBase.a = view;
                    }
                }
                org.telegram.ui.Components.rc rcVar = this.checkboxBounce;
                float a2 = rcVar != null ? rcVar.a(0.1f) : 1.0f;
                canvas.save();
                canvas.scale(a2, a2, AndroidUtilities.dp(10.0f) + dp, this.checkboxY + AndroidUtilities.dp(10.0f));
                this.checkbox.e(dp, (int) this.checkboxY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.a(canvas);
                canvas.restore();
            }
            if (i10 == Integer.MIN_VALUE) {
                onDraw(canvas);
            } else {
                onDrawFaded(canvas, i10, f10);
            }
            canvas.restore();
        }

        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            Text text;
            org.telegram.ui.Components.q5 q5Var;
            org.telegram.ui.Cells.w9[] text2 = getText();
            if (text2 == null) {
                return false;
            }
            boolean z4 = false;
            for (org.telegram.ui.Cells.w9 w9Var : text2) {
                if ((w9Var instanceof Text) && (q5Var = (text = (Text) w9Var).animatedEmojiStack) != null && !q5Var.a.isEmpty()) {
                    canvas.save();
                    canvas.translate(text.x, text.y - this.currY);
                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                    canvas.restore();
                    z4 = true;
                }
            }
            return z4;
        }

        public void setCheckbox(boolean z4, TLObject tLObject) {
            this.checkboxItem = tLObject;
            if (this.checkbox == null) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.root.resourcesProvider);
                this.checkbox = checkBoxBase;
                checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
                this.checkbox.d(10);
                this.checkbox.k(true);
                this.checkbox.i(AndroidUtilities.dp(5.0f));
            }
            this.checkbox.f(-1, z4, false);
            updateListMarkerY();
        }

        public void onAttachedToWindow() {
        }

        public void onDetachedFromWindow() {
        }

        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
        }

        public void onDraw(Canvas canvas) {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichButton {
        private static final float ICON_OFFSET_X = 12.33f;
        private static final float ICON_OFFSET_Y = 11.66f;
        private static final float ICON_OFFSET_Y_INLINE = 9.33f;
        public static final int INLINE_PADDING_HORIZONTAL = 7;
        private static final int MIN_PADDING = 8;
        private static final int PADDING = 20;
        private static final int PADDING_WITH_ICON = 26;
        private static final float PRESS_SCALE = 0.04f;
        private static final float PRESS_SCALE_INLINE = 0.09f;
        private static final Xfermode SRC_OUT;
        private static final Paint SRC_OUT_PAINT;
        public int backgroundColor;
        public final Paint backgroundPaint;
        public int backgroundPressedColor;
        private final f10 colorSpan;
        private final boolean emojiFirst;
        private final boolean emojiLast;
        private Drawable iconDrawable;
        private final boolean inline;
        public final Runnable invalidateRunnable;
        public final boolean isDisabled;
        private int lastLinkColorFilterColor;
        private final RichMessageLayout layout;
        private final boolean link;
        private ColorFilter linkColorFilter;
        private boolean loading;
        public j90 loadingDrawable;
        private final RectF loadingRect;
        private final int maxWidth;
        private boolean needSaveLayer;
        private final boolean out;
        public final TL_keyboard.PageButton pageButton;
        public ValueAnimator pressAnimator;
        public float pressT;
        public boolean pressed;
        public final TL_keyboard.RichButtonStyle style;
        private final org.telegram.ui.ActionBar.b6 styleKeys;
        public final Text text;
        public int textColor;
        private ColorFilter textColorFilter;
        public int textColorKey;
        private final RectF textFadeRect;
        public final TL_keyboard.InlineButtonType type;
        public int width;
        public int x;

        static {
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            SRC_OUT = porterDuffXfermode;
            Paint paint = new Paint();
            SRC_OUT_PAINT = paint;
            paint.setXfermode(porterDuffXfermode);
        }

        public RichButton(RichMessageLayout richMessageLayout, int i10, TL_keyboard.PageButton pageButton, Runnable runnable) {
            this(richMessageLayout, i10, richMessageLayout.formatText(pageButton.text, RichMessageLayout.setBlockFlags(16, 13)), pageButton, pageButton.type, pageButton.style, lf.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), true, false, false, false, false, null, runnable);
        }

        private void drawLoading(Canvas canvas) {
            boolean z4 = (this.pageButton == null || this.layout.cell == null || !this.layout.cell.H1(this.pageButton)) ? false : true;
            setLoading(z4);
            j90 j90Var = this.loadingDrawable;
            if (j90Var != null) {
                if (z4 || j90Var.c()) {
                    float strokeWidth = this.loadingDrawable.w.getStrokeWidth();
                    this.loadingRect.set(0.0f, 0.0f, this.width, getHeight());
                    float f10 = strokeWidth / 2.0f;
                    this.loadingRect.inset(f10, f10);
                    this.loadingDrawable.h((getHeight() / 2.0f) - f10);
                    this.loadingDrawable.d(this.loadingRect);
                    this.loadingDrawable.f(org.telegram.ui.ActionBar.j6.l1(0.07f, this.textColor), org.telegram.ui.ActionBar.j6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.j6.l1(0.175f, this.textColor), org.telegram.ui.ActionBar.j6.l1(0.42f, this.textColor));
                    this.loadingDrawable.setAlpha(255);
                    this.loadingDrawable.draw(canvas);
                    this.invalidateRunnable.run();
                }
            }
        }

        private static int getButtonIcon(TL_keyboard.InlineButtonType inlineButtonType) {
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                return R.drawable.mini_inline_copy_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth) {
                return R.drawable.mini_inline_arrow_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                return yb0.l(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url) ? R.drawable.bot_webview : R.drawable.mini_inline_arrow_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView) {
                return R.drawable.bot_webview;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline) {
                return R.drawable.mini_inline_switch_16;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy) {
                return R.drawable.bot_card;
            }
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                return R.drawable.mini_inline_profile_16;
            }
            return 0;
        }

        private int getTextAvailableWidth() {
            return Math.max(1, getTextViewportRight() - getTextViewportLeft());
        }

        private int getTextViewportLeft() {
            if (this.link) {
                return 0;
            }
            return this.inline ? getPaddingLeft() : AndroidUtilities.dp(8.0f);
        }

        private int getTextViewportRight() {
            int i10;
            int max;
            if (this.link) {
                return this.width;
            }
            if (this.inline) {
                i10 = this.width;
                max = getPaddingRight();
            } else {
                i10 = this.width;
                max = Math.max(AndroidUtilities.dp(8.0f), getIconReserve());
            }
            return i10 - max;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.invalidateRunnable.run();
        }

        public void attach(View view) {
            this.text.attach(view);
        }

        public boolean contains(float f10) {
            int i10 = this.x;
            return f10 >= ((float) i10) && f10 <= ((float) (i10 + this.width));
        }

        public void detach(View view) {
            this.text.detach(view);
        }

        public void draw(Canvas canvas) {
            Canvas canvas2;
            float f10;
            float f11;
            float pressScale = getPressScale();
            canvas.save();
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.width / 2.0f, getHeight() / 2.0f);
            }
            boolean z4 = this.link;
            boolean z10 = this.needSaveLayer && !z4;
            if (z10) {
                canvas.saveLayer(0.0f, 0.0f, this.width, getHeight(), null);
            } else {
                this.backgroundPaint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                if (!z4) {
                    canvas.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.backgroundPaint);
                }
                drawLoading(canvas);
            }
            canvas.save();
            int textViewportLeft = getTextViewportLeft();
            int textViewportRight = getTextViewportRight();
            boolean z11 = getTextWidth() > getTextAvailableWidth();
            if (z11) {
                canvas2 = canvas;
                canvas2.saveLayer(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight(), null);
            } else {
                canvas2 = canvas;
            }
            canvas2.clipRect(textViewportLeft, -AndroidUtilities.dp(10.0f), textViewportRight, AndroidUtilities.dp(10.0f) + getHeight());
            canvas2.save();
            int baseline = this.text.getBaseline();
            boolean z12 = this.text.getEmojiOnlyCount() > 0;
            if (z12) {
                canvas2.translate(getTextX() - this.text.left, (getHeight() - this.text.getHeight()) / 2.0f);
            } else if (baseline <= 0) {
                canvas2.translate(getTextX() - this.text.left, ((getHeight() - this.text.getHeight()) / 2.0f) - AndroidUtilities.dp(1.0f));
            } else if (this.inline) {
                canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 43) / 56));
            } else {
                canvas2.translate(getTextX() - this.text.left, (-baseline) + ((getHeight() * 65) / 102));
            }
            this.text.draw(canvas2);
            if (this.layout.isOverlayActive()) {
                canvas2.translate(0.0f, AndroidUtilities.dp(z12 ? 0.0f : this.link ? 0.66f : 2.0f));
                if (this.link) {
                    int i10 = this.text.layout.getPaint().linkColor;
                    if (this.lastLinkColorFilterColor != i10 || this.linkColorFilter == null) {
                        this.lastLinkColorFilterColor = i10;
                        this.linkColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    }
                    Text text = this.text;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.linkColorFilter);
                    canvas2 = canvas;
                } else {
                    f10 = 0.0f;
                    f11 = 2.0f;
                    Text text2 = this.text;
                    canvas2 = canvas;
                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, this.textColorFilter);
                }
            } else {
                f10 = 0.0f;
                f11 = 2.0f;
            }
            canvas2.restore();
            if (z11) {
                this.textFadeRect.set(textViewportRight - AndroidUtilities.dp(8.0f), f10, textViewportRight, getHeight());
                this.layout.clip.b(canvas2, this.textFadeRect, 2, 1.0f);
                canvas2.restore();
            }
            canvas2.restore();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                r.d(drawable, this.width - AndroidUtilities.dp(ICON_OFFSET_X), AndroidUtilities.dp(this.inline ? ICON_OFFSET_Y_INLINE : ICON_OFFSET_Y), 17);
                this.iconDrawable.draw(canvas2);
            }
            if (z10) {
                Paint paint = SRC_OUT_PAINT;
                paint.setColor(this.pressed ? this.backgroundPressedColor : this.backgroundColor);
                canvas2.drawRoundRect(0.0f, 0.0f, this.width, getHeight(), getHeight() / f11, getHeight() / f11, paint);
                canvas.restore();
                drawLoading(canvas);
            }
            canvas.restore();
        }

        public int getHeight() {
            return AndroidUtilities.dp(this.inline ? this.layout.fontSize * 1.166666f : this.layout.fontSize + 18);
        }

        public int getIconReserve() {
            if (this.iconDrawable == null) {
                return 0;
            }
            return (AndroidUtilities.dp(ICON_OFFSET_Y) / 2) + AndroidUtilities.dp(ICON_OFFSET_X);
        }

        public int getMinWidth() {
            return Math.min(getPreferredWidth(), getIconReserve() + getHeight());
        }

        public int getPaddingLeft() {
            if (this.link) {
                return 0;
            }
            if (this.emojiFirst && this.inline) {
                return AndroidUtilities.dp(4.0f);
            }
            if (this.inline) {
                return AndroidUtilities.dp(7.0f);
            }
            return AndroidUtilities.dp(this.iconDrawable != null ? 26.0f : 20.0f);
        }

        public int getPaddingRight() {
            if (this.link) {
                return 0;
            }
            if (this.emojiLast && this.inline) {
                return AndroidUtilities.dp((this.iconDrawable != null ? 14 : 0) + 4);
            }
            if (this.inline) {
                return AndroidUtilities.dp((this.iconDrawable != null ? 14 : 0) + 7);
            }
            return AndroidUtilities.dp(this.iconDrawable != null ? 26.0f : 20.0f);
        }

        public int getPreferredWidth() {
            return Math.min(this.maxWidth, getPaddingRight() + getPaddingLeft() + getTextWidth());
        }

        public float getPressScale() {
            if (this.pressed) {
                float f10 = this.pressT;
                if (f10 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                    this.pressT = min;
                    this.pressT = Utilities.clamp(min, 1.0f, 0.0f);
                    this.invalidateRunnable.run();
                }
            }
            float f11 = this.inline ? PRESS_SCALE_INLINE : PRESS_SCALE;
            return e2.c.w(1.0f, this.pressT, f11, 1.0f - f11);
        }

        public int getTextWidth() {
            Text text = this.text;
            return text.right - text.left;
        }

        public float getTextX() {
            return this.inline ? getPaddingLeft() : getTextWidth() > getTextAvailableWidth() ? getTextViewportLeft() : this.iconDrawable == null ? (this.width - getTextWidth()) / 2.0f : Math.max(Math.min((this.width - getTextWidth()) / 2.0f, (this.width - getIconReserve()) - getTextWidth()), AndroidUtilities.dp(8.0f));
        }

        public boolean isLoading() {
            return this.loading;
        }

        public void setLoading(boolean z4) {
            if (this.loading == z4) {
                return;
            }
            this.loading = z4;
            if (z4) {
                j90 j90Var = this.loadingDrawable;
                if (j90Var == null) {
                    j90 j90Var2 = new j90();
                    this.loadingDrawable = j90Var2;
                    j90Var2.C = true;
                    j90Var2.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                } else {
                    j90Var.b = -1L;
                    j90Var.c = -1L;
                }
            } else {
                j90 j90Var3 = this.loadingDrawable;
                if (j90Var3 != null) {
                    j90Var3.a();
                }
            }
            this.invalidateRunnable.run();
        }

        public void setPressed(boolean z4) {
            if (this.pressed == z4) {
                return;
            }
            this.pressed = z4;
            this.invalidateRunnable.run();
            if (z4) {
                ValueAnimator valueAnimator = this.pressAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.pressAnimator.cancel();
                    this.pressAnimator = null;
                    return;
                }
                return;
            }
            float f10 = this.pressT;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.pressAnimator = ofFloat;
                ofFloat.addUpdateListener(new o(this, 1));
                this.pressAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.RichMessageLayout.RichButton.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        RichButton.this.pressAnimator = null;
                    }
                });
                this.pressAnimator.setInterpolator(new OvershootInterpolator(this.inline ? 3.5f : 2.0f));
                this.pressAnimator.setDuration(this.inline ? 420L : 350L);
                this.pressAnimator.start();
            }
        }

        public void setTextColorKey(int i10) {
            this.textColorKey = i10;
            int themedColor = this.layout.getThemedColor(i10);
            if (this.isDisabled) {
                themedColor = org.telegram.ui.ActionBar.j6.l1(0.5f, themedColor);
            }
            if (themedColor != this.textColor || this.textColorFilter == null) {
                this.textColor = themedColor;
                this.textColorFilter = new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.SRC_IN);
            }
            this.colorSpan.b = i10;
            this.invalidateRunnable.run();
            Drawable drawable = this.iconDrawable;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.MULTIPLY));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void updateColors() {
            boolean z4;
            org.telegram.ui.ActionBar.b6 b6Var;
            int i10;
            int i11;
            org.telegram.ui.ActionBar.f6 f6Var = this.layout.resourcesProvider;
            boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
            if (this.out && a2) {
                int themedColor = this.layout.getThemedColor(org.telegram.ui.ActionBar.j6.Da);
                int themedColor2 = this.layout.getThemedColor(org.telegram.ui.ActionBar.j6.Ea);
                int themedColor3 = this.layout.getThemedColor(org.telegram.ui.ActionBar.j6.Fa);
                if (themedColor != 0 || themedColor2 != 0 || themedColor3 != 0) {
                    z4 = true;
                    b6Var = this.styleKeys;
                    if (z4 && b6Var != org.telegram.ui.ActionBar.b6.n) {
                        b6Var = org.telegram.ui.ActionBar.b6.h;
                    }
                    boolean z10 = this.out;
                    i10 = !z10 ? b6Var.d : b6Var.a;
                    i11 = !z10 ? b6Var.e : b6Var.b;
                    int i12 = !z10 ? b6Var.f : b6Var.c;
                    int themedColor4 = this.layout.getThemedColor(i12);
                    this.needSaveLayer = false;
                    if (z4 || b6Var != org.telegram.ui.ActionBar.b6.n) {
                        if (!org.telegram.ui.ActionBar.j6.c1(i10) || b6Var == org.telegram.ui.ActionBar.b6.n) {
                            this.backgroundColor = this.layout.getThemedColor(i10);
                            if (org.telegram.ui.ActionBar.j6.c1(i11)) {
                                this.backgroundPressedColor = i0.a.d(0.1f, this.backgroundColor, themedColor4);
                            } else {
                                this.backgroundPressedColor = this.layout.getThemedColor(i11);
                            }
                        } else {
                            this.backgroundColor = org.telegram.ui.ActionBar.j6.l1(b6Var == org.telegram.ui.ActionBar.b6.h ? 0.08f : 0.1f, this.layout.getThemedColor(i12));
                            this.backgroundPressedColor = org.telegram.ui.ActionBar.j6.l1(0.16f, this.layout.getThemedColor(i12));
                        }
                    } else {
                        int themedColor5 = this.layout.getThemedColor(i12);
                        this.backgroundPressedColor = themedColor5;
                        this.backgroundColor = themedColor5;
                        this.needSaveLayer = true;
                    }
                    setTextColorKey(i12);
                }
            }
            z4 = false;
            b6Var = this.styleKeys;
            if (z4) {
                b6Var = org.telegram.ui.ActionBar.b6.h;
            }
            boolean z102 = this.out;
            if (!z102) {
            }
            if (!z102) {
            }
            if (!z102) {
            }
            int themedColor42 = this.layout.getThemedColor(i12);
            this.needSaveLayer = false;
            if (z4) {
            }
            if (org.telegram.ui.ActionBar.j6.c1(i10)) {
            }
            this.backgroundColor = this.layout.getThemedColor(i10);
            if (org.telegram.ui.ActionBar.j6.c1(i11)) {
            }
            setTextColorKey(i12);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RichButton(RichMessageLayout richMessageLayout, int i10, CharSequence charSequence, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, Runnable runnable) {
            org.telegram.ui.ActionBar.b6 b6Var;
            int buttonIcon;
            this.backgroundPaint = new Paint(1);
            this.loadingRect = new RectF();
            this.textFadeRect = new RectF();
            this.layout = richMessageLayout;
            this.maxWidth = Math.max(1, i10);
            this.invalidateRunnable = runnable;
            this.pageButton = pageButton;
            this.type = inlineButtonType;
            this.style = richButtonStyle;
            this.isDisabled = z4;
            this.emojiFirst = z11;
            this.emojiLast = z12;
            this.inline = z14;
            this.link = z13;
            boolean booleanValue = bool != null ? bool.booleanValue() : richMessageLayout.isOut();
            this.out = booleanValue;
            if (richButtonStyle != null) {
                org.telegram.ui.ActionBar.b6 b6Var2 = org.telegram.ui.ActionBar.b6.h;
                if (richButtonStyle.bg_primary) {
                    b6Var = org.telegram.ui.ActionBar.b6.n;
                } else if (richButtonStyle.bg_danger) {
                    b6Var = org.telegram.ui.ActionBar.b6.r;
                } else if (richButtonStyle.bg_success) {
                    b6Var = org.telegram.ui.ActionBar.b6.s;
                }
                if (b6Var == org.telegram.ui.ActionBar.b6.h && z14) {
                    b6Var = org.telegram.ui.ActionBar.b6.v;
                }
                this.styleKeys = b6Var;
                f10 f10Var = new f10(!booleanValue ? b6Var.f : b6Var.c, null);
                this.colorSpan = f10Var;
                f10Var.c = !z4 ? 0.5f : 1.0f;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                if (z13) {
                    spannableStringBuilder.setSpan(f10Var, 0, spannableStringBuilder.length(), 33);
                } else {
                    spannableStringBuilder.setSpan(new m51("", (s01) null), 0, spannableStringBuilder.length(), 33);
                }
                AndroidUtilities.replaceNewLines(spannableStringBuilder);
                Math.max(1, AndroidUtilities.dp(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder, richMessageLayout.textPaint))));
                Text text = new Text(richMessageLayout, spannableStringBuilder, 100000, Layout.Alignment.ALIGN_CENTER);
                this.text = text;
                text.setDrawAtOrigin(true);
                text.doNotInvalidateEmojiInParent = true;
                buttonIcon = z10 ? getButtonIcon(inlineButtonType) : 0;
                if (buttonIcon != 0) {
                    this.iconDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(buttonIcon).mutate();
                }
                this.width = getPreferredWidth();
                updateColors();
            }
            b6Var = org.telegram.ui.ActionBar.b6.h;
            if (b6Var == org.telegram.ui.ActionBar.b6.h) {
                b6Var = org.telegram.ui.ActionBar.b6.v;
            }
            this.styleKeys = b6Var;
            f10 f10Var2 = new f10(!booleanValue ? b6Var.f : b6Var.c, null);
            this.colorSpan = f10Var2;
            f10Var2.c = !z4 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            if (z13) {
            }
            AndroidUtilities.replaceNewLines(spannableStringBuilder2);
            Math.max(1, AndroidUtilities.dp(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder2, richMessageLayout.textPaint))));
            Text text2 = new Text(richMessageLayout, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.text = text2;
            text2.setDrawAtOrigin(true);
            text2.doNotInvalidateEmojiInParent = true;
            if (z10) {
            }
            if (buttonIcon != 0) {
            }
            this.width = getPreferredWidth();
            updateColors();
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichButtonRowBlock extends RichBlock {
        private static final int GAP = 7;
        private final Align align;
        private final RichButton[] buttons;
        private final yd.b clickHelper;
        private int layoutWidth;
        private RichButton pressedButton;
        private RichButton touchButton;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public enum Align {
            LEFT,
            RIGHT,
            CENTER,
            FILL
        }

        public RichButtonRowBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
            super(richMessageLayout, rect, i10);
            this.layoutWidth = -1;
            this.clickHelper = new yd.b(new yd.a() { // from class: org.telegram.messenger.RichMessageLayout.RichButtonRowBlock.1
                @Override // yd.a
                public /* bridge */ /* synthetic */ boolean forceEnableVibration() {
                    return false;
                }

                @Override // yd.a
                public long getLongPressDuration() {
                    return ViewConfiguration.getLongPressTimeout();
                }

                @Override // yd.a
                public /* bridge */ /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
                    return false;
                }

                @Override // yd.a
                public /* bridge */ /* synthetic */ boolean needCancelTouchBySlopMove() {
                    return true;
                }

                @Override // yd.a
                public boolean needClickAt(View view, float f10, float f11) {
                    RichButton buttonAt = RichButtonRowBlock.this.getButtonAt(f10, f11);
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    if (buttonAt == null || buttonAt.isDisabled) {
                        buttonAt = null;
                    }
                    richButtonRowBlock.touchButton = buttonAt;
                    return RichButtonRowBlock.this.touchButton != null;
                }

                @Override // yd.a
                public boolean needLongPress(float f10, float f11) {
                    return true;
                }

                @Override // yd.a
                public void onClickAt(View view, float f10, float f11) {
                    if (RichButtonRowBlock.this.touchButton != null) {
                        RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                        richButtonRowBlock.onButtonClick(richButtonRowBlock.touchButton);
                    }
                }

                @Override // yd.a
                public void onClickTouchDown(View view, float f10, float f11) {
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.touchButton);
                }

                @Override // yd.a
                public void onClickTouchMove(View view, float f10, float f11) {
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.setPressedButton(richButtonRowBlock.getButtonAt(f10, f11) == RichButtonRowBlock.this.touchButton ? RichButtonRowBlock.this.touchButton : null);
                }

                @Override // yd.a
                public void onClickTouchUp(View view, float f10, float f11) {
                    RichButtonRowBlock.this.setPressedButton(null);
                    RichButtonRowBlock.this.touchButton = null;
                }

                @Override // yd.a
                public boolean onLongPressRequestedAt(View view, float f10, float f11) {
                    if (RichButtonRowBlock.this.touchButton == null || RichButtonRowBlock.this.getButtonAt(f10, f11) != RichButtonRowBlock.this.touchButton) {
                        return false;
                    }
                    RichButtonRowBlock richButtonRowBlock = RichButtonRowBlock.this;
                    richButtonRowBlock.onButtonLongClick(richButtonRowBlock.touchButton);
                    return true;
                }

                @Override // yd.a
                public /* bridge */ /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
                }

                @Override // yd.a
                public /* bridge */ /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
                }

                @Override // yd.a
                public /* bridge */ /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
                }
            });
            this.buttons = new RichButton[pageblockbuttonrow.buttons.size()];
            int size = pageblockbuttonrow.buttons.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.buttons[i11] = new RichButton(richMessageLayout, i10, pageblockbuttonrow.buttons.get(i11), new xg(this, 7));
            }
            if (pageblockbuttonrow.align_left) {
                this.align = Align.LEFT;
            } else if (pageblockbuttonrow.align_center) {
                this.align = Align.CENTER;
            } else if (pageblockbuttonrow.align_right) {
                this.align = Align.RIGHT;
            } else {
                this.align = Align.FILL;
            }
            layout(getIntrinsicWidth());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RichButton getButtonAt(float f10, float f11) {
            updateLayout();
            RichButton[] richButtonArr = this.buttons;
            int dp = richButtonArr.length == 0 ? AndroidUtilities.dp(this.root.fontSize + 18) : richButtonArr[0].getHeight();
            float height = (getHeight() - dp) / 2.0f;
            if (f11 >= height && f11 <= height + dp) {
                for (RichButton richButton : this.buttons) {
                    if (richButton.contains(f10)) {
                        return richButton;
                    }
                }
            }
            return null;
        }

        private int getIntrinsicWidth() {
            int length = this.buttons.length;
            if (length == 0) {
                return 0;
            }
            int dp = (length - 1) * AndroidUtilities.dp(7.0f);
            for (RichButton richButton : this.buttons) {
                dp += richButton.getPreferredWidth();
            }
            return Math.min(this.maxWidth, dp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate() {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void layout(int i10) {
            this.layoutWidth = i10;
            int length = this.buttons.length;
            if (length == 0) {
                return;
            }
            int dp = AndroidUtilities.dp(7.0f);
            int i11 = (length - 1) * dp;
            int max = Math.max(0, i10 - i11);
            int i12 = 0;
            for (RichButton richButton : this.buttons) {
                int preferredWidth = richButton.getPreferredWidth();
                richButton.width = preferredWidth;
                i12 += preferredWidth;
            }
            if (i12 > max) {
                squeeze(max, i12);
            } else if (this.align == Align.FILL) {
                stretch(max);
            }
            for (RichButton richButton2 : this.buttons) {
                i11 += richButton2.width;
            }
            int ordinal = this.align.ordinal();
            int i13 = ordinal != 1 ? ordinal != 2 ? 0 : (i10 - i11) / 2 : i10 - i11;
            for (RichButton richButton3 : this.buttons) {
                richButton3.x = i13;
                i13 += richButton3.width + dp;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onButtonClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.r1(this.root.cell, richButton.pageButton);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onButtonLongClick(RichButton richButton) {
            if (this.root.delegate != null) {
                this.root.delegate.L1(this.root.cell, richButton.pageButton);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressedButton(RichButton richButton) {
            RichButton richButton2 = this.pressedButton;
            if (richButton2 == richButton) {
                return;
            }
            if (richButton2 != null) {
                richButton2.setPressed(false);
            }
            this.pressedButton = richButton;
            if (richButton != null) {
                richButton.setPressed(true);
            }
        }

        private void squeeze(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (RichButton richButton : this.buttons) {
                i13 += richButton.width - richButton.getMinWidth();
            }
            if (i13 <= 0) {
                RichButton[] richButtonArr = this.buttons;
                int length = richButtonArr.length;
                while (i12 < length) {
                    RichButton richButton2 = richButtonArr[i12];
                    richButton2.width = richButton2.getMinWidth();
                    i12++;
                }
                return;
            }
            int min = Math.min(i11 - i10, i13);
            int i14 = 0;
            while (true) {
                RichButton[] richButtonArr2 = this.buttons;
                if (i12 >= richButtonArr2.length) {
                    return;
                }
                RichButton richButton3 = richButtonArr2[i12];
                int minWidth = richButton3.width - richButton3.getMinWidth();
                int min2 = Math.min(i12 == this.buttons.length + (-1) ? min - i14 : (int) ((min * minWidth) / i13), minWidth);
                richButton3.width -= min2;
                i14 += min2;
                i12++;
            }
        }

        private void stretch(int i10) {
            int i11;
            RichButton[] richButtonArr = this.buttons;
            boolean[] zArr = new boolean[richButtonArr.length];
            int length = richButtonArr.length;
            boolean z4 = true;
            while (true) {
                boolean z10 = false;
                if (!z4 || length <= 0) {
                    break;
                }
                int i12 = i10 / length;
                int i13 = 0;
                while (true) {
                    RichButton[] richButtonArr2 = this.buttons;
                    if (i13 < richButtonArr2.length) {
                        if (!zArr[i13] && (i11 = richButtonArr2[i13].width) > i12) {
                            zArr[i13] = true;
                            i10 -= i11;
                            length--;
                            z10 = true;
                        }
                        i13++;
                    }
                }
                z4 = z10;
            }
            if (length <= 0) {
                return;
            }
            int i14 = i10 / length;
            int i15 = i10 - (length * i14);
            int i16 = 0;
            while (true) {
                RichButton[] richButtonArr3 = this.buttons;
                if (i16 >= richButtonArr3.length) {
                    return;
                }
                if (!zArr[i16]) {
                    int i17 = i15 - 1;
                    richButtonArr3[i16].width = (i15 > 0 ? 1 : 0) + i14;
                    i15 = i17;
                }
                i16++;
            }
        }

        private void updateLayout() {
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i10 = richMessageLayout.padLeft;
            int i11 = ((minWidth + i10) + richMessageLayout.padRight) - (i10 * 2);
            Rect rect = this.padding;
            int max = Math.max(0, (i11 - rect.left) - rect.right);
            if (this.layoutWidth != max) {
                layout(max);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void draw(Canvas canvas) {
            updateLayout();
            for (RichButton richButton : this.buttons) {
                canvas.save();
                canvas.translate(richButton.x, Math.round((getHeight() - richButton.getHeight()) / 2.0f));
                richButton.draw(canvas);
                canvas.restore();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            RichButton[] richButtonArr = this.buttons;
            return AndroidUtilities.dp(4.333f) + this.padding.top + (richButtonArr.length == 0 ? AndroidUtilities.dp(this.root.fontSize + 18) : richButtonArr[0].getHeight()) + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return this.padding.left + getIntrinsicWidth() + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            return this.touchButton != null;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            for (RichButton richButton : this.buttons) {
                richButton.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            for (RichButton richButton : this.buttons) {
                richButton.detach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            if (view == null) {
                return false;
            }
            return this.clickHelper.a(motionEvent, view);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichButtonSpan extends ReplacementSpan {
        private static final int MARGIN_HORIZONTAL = 1;
        private final RectF bounds;
        private final RichButton button;
        private int minimumLineHeight;
        private boolean preserveFontMetrics;
        private float scale;
        private final TL_iv.textButton textButton;
        private View v;

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            int i11 = fontMetricsInt.descent;
            int i12 = fontMetricsInt.ascent;
            int i13 = i11 - i12;
            if (i10 <= i13) {
                return;
            }
            int i14 = i10 - i13;
            int i15 = (i14 + 1) / 2;
            int i16 = i12 - i15;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i11 + (i14 - i15);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidate() {
            View view = this.v;
            if (view != null) {
                view.invalidate();
            }
        }

        public void attach(View view) {
            this.v = view;
            this.button.attach(view);
        }

        public boolean contains(float f10, float f11) {
            return this.bounds.contains(f10, f11);
        }

        public void detach(View view) {
            this.v = null;
            this.button.detach(view);
        }

        public void didPress(org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Cells.j1 j1Var, boolean z4) {
            if (s1Var == null || j1Var == null) {
                return;
            }
            if (z4) {
                j1Var.L1(s1Var, this.textButton);
            } else {
                j1Var.r1(s1Var, this.textButton);
            }
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            float f11;
            int i15 = (this.button.text.getEmojiOnlyCount() <= 0 || this.minimumLineHeight <= 0) ? 0 : 1;
            if (i15 == 0 && this.button.text.getEmojiOnlyCount() > 0 && (charSequence instanceof Spanned)) {
                StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) charSequence).getSpans(i10, i11, StyleSpan.class);
                int length = styleSpanArr.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        break;
                    }
                    if ((styleSpanArr[i16].flags & 15) == 14) {
                        i15 = 1;
                        break;
                    }
                    i16++;
                }
            }
            if (i15 != 0) {
                f11 = (i12 + i14) / 2.0f;
            } else {
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                f11 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i13;
            }
            canvas.save();
            int round = Math.round(f10 + (this.button.link ? 0 : AndroidUtilities.dp(1.0f)));
            int ceil = (int) Math.ceil((f11 - (this.button.getHeight() / 2.0f)) + (i15 ^ 1));
            RectF rectF = this.bounds;
            float f12 = round;
            float f13 = ceil;
            RichButton richButton = this.button;
            rectF.set(f12, f13, round + richButton.width, richButton.getHeight() + ceil);
            canvas.translate(f12, f13);
            this.button.draw(canvas);
            canvas.restore();
        }

        public RichButton getButton() {
            return this.button;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            boolean z4 = this.preserveFontMetrics && fontMetricsInt != null;
            int i12 = z4 ? fontMetricsInt.top : 0;
            int i13 = z4 ? fontMetricsInt.ascent : 0;
            int i14 = z4 ? fontMetricsInt.descent : 0;
            int i15 = z4 ? fontMetricsInt.bottom : 0;
            int i16 = z4 ? fontMetricsInt.leading : 0;
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt != null && this.button.link) {
                float f10 = (-dp2) - dp;
                float f11 = this.scale;
                fontMetricsInt.top = (int) (f10 * f11);
                float f12 = dp2 - dp;
                fontMetricsInt.bottom = (int) (f12 * f11);
                fontMetricsInt.ascent = (int) (f10 * f11);
                fontMetricsInt.descent = (int) (f12 * f11);
                fontMetricsInt.leading = 0;
            }
            if (z4) {
                fontMetricsInt.top = i12;
                fontMetricsInt.ascent = i13;
                fontMetricsInt.descent = i14;
                fontMetricsInt.bottom = i15;
                fontMetricsInt.leading = i16;
                expandFontMetrics(fontMetricsInt, this.minimumLineHeight);
            }
            RichButton richButton = this.button;
            return richButton.width + (richButton.link ? 0 : AndroidUtilities.dp(1.0f) * 2);
        }

        public boolean isDisabled() {
            return this.button.isDisabled;
        }

        public void setPressed(boolean z4) {
            this.button.setPressed(z4);
        }

        public RichButtonSpan(RichMessageLayout richMessageLayout, int i10, TL_iv.textButton textbutton) {
            this(richMessageLayout, i10, textbutton, null);
        }

        public boolean contains(float f10, float f11, float f12) {
            RectF rectF = this.bounds;
            return f10 >= rectF.left - f12 && f10 < rectF.right + f12 && f11 >= rectF.top - f12 && f11 < rectF.bottom + f12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RichButtonSpan(RichMessageLayout richMessageLayout, int i10, TL_iv.textButton textbutton, Boolean bool) {
            boolean z4;
            boolean z10;
            boolean z11;
            int blockFlags;
            this.bounds = new RectF();
            this.textButton = textbutton;
            TL_iv.RichText richText = textbutton.text;
            if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
                if (!textconcat.texts.isEmpty()) {
                    boolean z12 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                    z10 = kf.k0.i(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                    z4 = z12;
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    z11 = richButtonStyle == null && richButtonStyle.link;
                    if (!z11) {
                        blockFlags = RichMessageLayout.setBlockFlags(512, 0);
                    } else {
                        blockFlags = RichMessageLayout.setBlockFlags(16, 13);
                    }
                    CharSequence formatText = richMessageLayout.formatText(textbutton.text, blockFlags);
                    TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
                    RichButton richButton = new RichButton(richMessageLayout, i10, formatText, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, z4, z10, z11, true, bool, new xg(this, 8));
                    this.button = richButton;
                    richButton.width = richButton.getPreferredWidth();
                }
            }
            z4 = false;
            z10 = false;
            TL_keyboard.RichButtonStyle richButtonStyle2 = textbutton.style;
            if (richButtonStyle2 == null) {
            }
            if (!z11) {
            }
            CharSequence formatText2 = richMessageLayout.formatText(textbutton.text, blockFlags);
            TL_keyboard.InlineButtonType inlineButtonType2 = textbutton.type;
            RichButton richButton2 = new RichButton(richMessageLayout, i10, formatText2, null, inlineButtonType2, textbutton.style, inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, z4, z10, z11, true, bool, new xg(this, 8));
            this.button = richButton2;
            richButton2.width = richButton2.getPreferredWidth();
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichCaptionBlock extends RichBlock {
        public final Text caption;
        public final Text credit;
        public final boolean rtl;
        private final org.telegram.ui.Cells.w9[] texts;

        public RichCaptionBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10);
            Text text = !TextUtils.isEmpty(charSequence) ? new Text(richMessageLayout, charSequence, this.maxWidth) : null;
            this.caption = text;
            Text text2 = TextUtils.isEmpty(charSequence2) ? null : new Text(richMessageLayout, charSequence2, this.maxWidth);
            this.credit = text2;
            this.rtl = richMessageLayout.isRtl();
            ArrayList arrayList = new ArrayList(2);
            if (text != null) {
                arrayList.add(text);
            }
            if (text2 != null) {
                arrayList.add(text2);
            }
            this.texts = (org.telegram.ui.Cells.w9[]) arrayList.toArray(new org.telegram.ui.Cells.w9[0]);
        }

        private int captionHeight() {
            Text text = this.caption;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int creditDrawX() {
            if (this.credit == null || !this.rtl) {
                return 0;
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return Math.max(0, ((minWidth - rect.left) - rect.right) - this.credit.getMinWidth());
        }

        private int creditHeight() {
            Text text = this.credit;
            if (text != null) {
                return text.getHeight();
            }
            return 0;
        }

        private int gap() {
            if (this.caption == null || this.credit == null) {
                return 0;
            }
            return AndroidUtilities.dp(4.0f);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.caption, null);
            Text text = this.credit;
            if (text == null || (staticLayout = text.layout) == null || TextUtils.isEmpty(staticLayout.getText())) {
                return;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(this.credit.layout.getText());
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean forcesTimeToNewLine() {
            return false;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.padding.top + captionHeight() + gap() + creditHeight() + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            int lastLineWidth;
            int i10;
            Text text = this.credit;
            if (text != null) {
                lastLineWidth = text.getLastLineWidth() + this.padding.left;
                i10 = this.padding.right;
            } else {
                Text text2 = this.caption;
                if (text2 == null) {
                    Rect rect = this.padding;
                    return rect.left + rect.right;
                }
                lastLineWidth = text2.getLastLineWidth() + this.padding.left;
                i10 = this.padding.right;
            }
            return lastLineWidth + i10;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Text text = this.caption;
            int max = text != null ? Math.max(0, text.getMinWidth()) : 0;
            Text text2 = this.credit;
            if (text2 != null) {
                max = Math.max(max, text2.getMinWidth());
            }
            Rect rect = this.padding;
            return rect.left + max + rect.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            Text text = this.caption;
            if (text != null) {
                text.attach(this.view);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            Text text = this.caption;
            if (text != null) {
                text.detach(this.view);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.detach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Text text = this.caption;
            if (text != null) {
                text.draw(canvas);
            }
            if (this.credit != null) {
                canvas.save();
                canvas.translate(creditDrawX(), captionHeight() + gap());
                this.credit.draw(canvas);
                canvas.restore();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int captionHeight = captionHeight();
            int gap = gap();
            float y10 = motionEvent.getY();
            int i10 = this.padding.top;
            float f10 = y10 - i10;
            if (this.caption != null && f10 >= 0.0f && f10 < captionHeight) {
                motionEvent.offsetLocation(0.0f, -i10);
                boolean onTouchEvent = this.caption.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.padding.top);
                return onTouchEvent;
            }
            if (this.credit == null || f10 < captionHeight + gap) {
                return false;
            }
            int i11 = i10 + captionHeight + gap;
            int creditDrawX = creditDrawX();
            motionEvent.offsetLocation(-creditDrawX, -i11);
            boolean onTouchEvent2 = this.credit.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(creditDrawX, i11);
            return onTouchEvent2;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            Text text = this.caption;
            if (text != null) {
                text.setX(i10 - text.left);
                this.caption.setY(i11);
                this.caption.setRow(i12);
            }
            Text text2 = this.credit;
            if (text2 != null) {
                text2.setX((i10 + creditDrawX()) - this.credit.left);
                this.credit.setY(i11 + captionHeight() + gap());
                this.credit.setRow(i12);
            }
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichCollageBlock extends RichBlock {
        private static Paint mediaBgPaint;
        public final TL_iv.pageBlockCollage block;
        private int[] cellFlags;
        public final ArrayList<MediaCell> cells;
        private int contentHeight;
        public final boolean first;
        private MediaCell pressedCell;

        public RichCollageBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockCollage pageblockcollage, boolean z4) {
            super(richMessageLayout, rect, i10);
            this.cells = new ArrayList<>();
            this.block = pageblockcollage;
            this.first = z4;
            for (int i11 = 0; i11 < pageblockcollage.items.size(); i11++) {
                MediaCell forPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockcollage.items.get(i11));
                if (forPageBlock != null) {
                    this.cells.add(forPageBlock);
                }
            }
            layoutCells();
        }

        private void layoutCells() {
            int round;
            this.cellFlags = new int[this.cells.size()];
            if (this.cells.isEmpty()) {
                this.contentHeight = 0;
                return;
            }
            float f10 = 0.0f;
            byte b10 = 1;
            if (this.cells.size() == 1) {
                MediaCell mediaCell = this.cells.get(0);
                float f11 = mediaCell.aspectRatio;
                if (f11 <= 0.0f) {
                    f11 = 1.0f;
                }
                int i10 = this.maxWidth;
                int i11 = (int) (i10 / f11);
                Point point = AndroidUtilities.displaySize;
                int max = (int) (Math.max(point.x, point.y) * 0.55f);
                if (i11 > max) {
                    i10 = (int) (max * f11);
                    i11 = max;
                }
                mediaCell.setRect(0, 0, i10, i11);
                this.cellFlags[0] = 15;
                this.contentHeight = i11;
                return;
            }
            float[] fArr = new float[this.cells.size()];
            for (int i12 = 0; i12 < this.cells.size(); i12++) {
                fArr[i12] = this.cells.get(i12).aspectRatio;
            }
            MessageObject.GroupedMessagePosition[] computeGrouped = RichMessageLayout.computeGrouped(fArr);
            int i13 = 0;
            for (MessageObject.GroupedMessagePosition groupedMessagePosition : computeGrouped) {
                i13 = Math.max(i13, (int) groupedMessagePosition.maxY);
            }
            int i14 = i13 + 1;
            float[] fArr2 = new float[i14];
            for (MessageObject.GroupedMessagePosition groupedMessagePosition2 : computeGrouped) {
                byte b11 = groupedMessagePosition2.minY;
                if (b11 == groupedMessagePosition2.maxY) {
                    fArr2[b11] = Math.max(fArr2[b11], groupedMessagePosition2.ph);
                }
            }
            for (MessageObject.GroupedMessagePosition groupedMessagePosition3 : computeGrouped) {
                int i15 = groupedMessagePosition3.minY;
                byte b12 = groupedMessagePosition3.maxY;
                if (i15 != b12) {
                    int i16 = (b12 - i15) + 1;
                    float[] fArr3 = groupedMessagePosition3.siblingHeights;
                    if (fArr3 == null || fArr3.length != i16) {
                        float f12 = groupedMessagePosition3.ph / i16;
                        while (i15 <= groupedMessagePosition3.maxY) {
                            fArr2[i15] = Math.max(fArr2[i15], f12);
                            i15++;
                        }
                    } else {
                        for (int i17 = 0; i17 < i16; i17++) {
                            byte b13 = groupedMessagePosition3.minY;
                            fArr2[b13 + i17] = Math.max(fArr2[b13 + i17], groupedMessagePosition3.siblingHeights[i17]);
                        }
                    }
                }
            }
            Point point2 = AndroidUtilities.displaySize;
            float max2 = Math.max(point2.x, point2.y) * 0.5f;
            int[] iArr = new int[i13 + 2];
            for (int i18 = 0; i18 <= i13; i18++) {
                iArr[i18] = Math.round(f10 * max2);
                f10 += fArr2[i18];
            }
            iArr[i14] = Math.round(f10 * max2);
            int dp = AndroidUtilities.dp(2.0f);
            int i19 = 0;
            while (i19 < computeGrouped.length) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = computeGrouped[i19];
                int i20 = iArr[groupedMessagePosition4.minY];
                int i21 = iArr[groupedMessagePosition4.maxY + b10] - i20;
                if (groupedMessagePosition4.leftSpanOffset > 0) {
                    round = Math.round((r11 * this.maxWidth) / 1000.0f);
                } else {
                    int i22 = 0;
                    for (int i23 = 0; i23 < computeGrouped.length; i23++) {
                        if (i23 != i19) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = computeGrouped[i23];
                            byte b14 = groupedMessagePosition5.minY;
                            byte b15 = groupedMessagePosition4.minY;
                            if (b14 <= b15 && groupedMessagePosition5.maxY >= b15 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                i22 += groupedMessagePosition5.pw;
                            }
                        }
                    }
                    round = Math.round((i22 * this.maxWidth) / 1000.0f);
                }
                int round2 = (groupedMessagePosition4.flags & 2) != 0 ? this.maxWidth - round : Math.round((groupedMessagePosition4.pw * this.maxWidth) / 1000.0f) - dp;
                if ((groupedMessagePosition4.flags & 8) == 0) {
                    i21 -= dp;
                }
                this.cells.get(i19).setRect(round, i20, Math.max(0, round2), Math.max(0, i21));
                this.cellFlags[i19] = groupedMessagePosition4.flags;
                i19++;
                b10 = 1;
            }
            this.contentHeight = iArr[i14];
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, int i10, boolean z4) {
            int i11 = 0;
            boolean z10 = (i10 & 4) != 0;
            boolean z11 = (i10 & 8) != 0;
            boolean z12 = (i10 & 1) != 0;
            boolean z13 = (i10 & 2) != 0;
            if (z4) {
                int dp = AndroidUtilities.dp(8.0f);
                int i12 = (z10 && z12) ? dp : 0;
                int i13 = (z10 && z13) ? dp : 0;
                int i14 = (z11 && z13) ? dp : 0;
                if (z11 && z12) {
                    i11 = dp;
                }
                imageReceiver.setRoundRadius(i12, i13, i14, i11);
                return;
            }
            int i15 = SharedConfig.bubbleRadius;
            int dp2 = i15 > 2 ? AndroidUtilities.dp(i15 - 2) : AndroidUtilities.dp(i15);
            int min = Math.min(AndroidUtilities.dp(3.0f), dp2);
            int i16 = (z10 && z12) ? (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? min : dp2 : 0;
            if (!z10 || !z13) {
                dp2 = 0;
            } else if (!this.first || this.root.hasNameOffset() || (this.root.isOut() && this.root.isPinnedTop())) {
                dp2 = min;
            }
            int i17 = (z11 && z13) ? min : 0;
            if (z11 && z12) {
                i11 = min;
            }
            imageReceiver.setRoundRadius(i16, dp2, i17, i11);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return;
            }
            MediaCell mediaCell = this.cells.get(i10);
            Rect rect2 = this.padding;
            int i11 = rect2.left + mediaCell.x;
            int i12 = ((int) this.currY) + rect2.top + mediaCell.y;
            rect.set(i11, i12, mediaCell.w + i11, mediaCell.h + i12);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getBlockAccessibilityElementCount() {
            return this.cells.size();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getBlockAccessibilityElementText(int i10) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return null;
            }
            return this.cells.get(i10).getAccessibilityText();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.contentHeight;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (i10 < 0 || i10 >= this.cells.size()) {
                return false;
            }
            return this.cells.get(i10).onAccessibilityClick(view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.detach();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean isInQuote = isInQuote();
            int dp = AndroidUtilities.dp(2.0f);
            int i10 = isInQuote ? 0 : this.root.padLeft - dp;
            int i11 = isInQuote ? 0 : this.root.padRight - dp;
            int i12 = this.maxWidth;
            float f10 = (i12 <= 0 || (i10 <= 0 && i11 <= 0)) ? 1.0f : ((i12 + i10) + i11) / i12;
            int i13 = 0;
            while (i13 < this.cells.size()) {
                MediaCell mediaCell = this.cells.get(i13);
                int round = Math.round(mediaCell.x * f10) - i10;
                int round2 = Math.round(mediaCell.w * f10);
                ImageReceiver imageReceiver = mediaCell.imageReceiver;
                int[] iArr = this.cellFlags;
                updateRoundRadius(imageReceiver, (iArr == null || i13 >= iArr.length) ? 0 : iArr[i13], isInQuote);
                float f11 = round;
                mediaCell.imageReceiver.setImageCoords(f11, mediaCell.y, round2, mediaCell.h);
                if (mediaCell.imageReceiver.hasBitmapImage() && mediaCell.imageReceiver.getCurrentAlpha() == 1.0f) {
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(f11, mediaCell.y, round + round2, r10 + mediaCell.h, mediaBgPaint);
                }
                mediaCell.draw(canvas2);
                i13++;
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            boolean z4 = false;
            try {
                if (actionMasked == 0) {
                    this.pressedCell = null;
                    for (int i10 = 0; i10 < this.cells.size(); i10++) {
                        MediaCell mediaCell = this.cells.get(i10);
                        if (mediaCell.isInside(motionEvent.getX(), motionEvent.getY()) && mediaCell.onTouchEvent(motionEvent, this.view)) {
                            this.pressedCell = mediaCell;
                            return true;
                        }
                    }
                } else {
                    MediaCell mediaCell2 = this.pressedCell;
                    if (mediaCell2 != null) {
                        z4 = mediaCell2.onTouchEvent(motionEvent, this.view);
                        if (actionMasked == 1 || actionMasked == 3) {
                            this.pressedCell = null;
                        }
                    }
                }
                return z4;
            } finally {
                Rect rect2 = this.padding;
                motionEvent.offsetLocation(rect2.left, rect2.top);
            }
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichDetailsBlock extends RichBlock {
        private static final float ARROW_HEIGHT_DP = 6.16f;
        private static final float ARROW_LEFT_DP = 22.6f;
        private static final float ARROW_STROKE_DP = 1.66f;
        private static final float ARROW_TOP_DP = 21.66f;
        private static final float ARROW_WIDTH_DP = 12.66f;
        private static final float TEXT_BOTTOM_DP = 12.66f;
        private static final float TEXT_LEFT_DP = 53.0f;
        private static final float TEXT_RIGHT_DP = 16.0f;
        private static final float TEXT_TOP_DP = 14.0f;
        public float animClipBottom;
        public float animClipTop;
        public final AnimatedArrowDrawable arrow;
        public final TL_iv.pageBlockDetails block;
        private org.telegram.ui.Components.rc bounce;
        private final Paint linePaint;
        private boolean pressed;
        public final Text[] texts;
        public final Text title;

        public RichDetailsBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockDetails pageblockdetails, CharSequence charSequence) {
            super(richMessageLayout, rect, i10);
            this.linePaint = new Paint(1);
            this.block = pageblockdetails;
            Text text = new Text(richMessageLayout, charSequence, kf.k0.c(TEXT_RIGHT_DP, this.maxWidth - AndroidUtilities.dp(TEXT_LEFT_DP), 0));
            this.title = text;
            this.texts = new Text[]{text};
            AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.Ek : org.telegram.ui.ActionBar.j6.Dk));
            this.arrow = animatedArrowDrawable;
            animatedArrowDrawable.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new org.telegram.ui.Components.rc(view);
        }

        private int getContentHeight() {
            return y3.b(12.66f, this.title.getHeight() + AndroidUtilities.dp(TEXT_TOP_DP), AndroidUtilities.dp(27.82f));
        }

        private void toggle() {
            this.root.snapshotForDetailsAnimation();
            TL_iv.pageBlockDetails pageblockdetails = this.block;
            boolean z4 = pageblockdetails.open;
            pageblockdetails.open = !z4;
            this.arrow.a(!z4 ? 0.0f : 1.0f);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.detailsAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.I0(cell);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateBubbleInsets() {
            this.title.setX((AndroidUtilities.dp(TEXT_LEFT_DP) + (this.layoutX - this.root.padLeft)) - this.title.left);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.title, this.texts);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.title.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (AndroidUtilities.dp(TEXT_LEFT_DP) + (this.padding.left - this.root.padLeft)) - this.title.left;
            foundLink.y = AndroidUtilities.dp(TEXT_TOP_DP) + i10 + this.padding.top;
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int i11 = (int) this.currY;
            Rect rect2 = this.padding;
            int i12 = i11 + rect2.top;
            int i13 = rect2.left;
            RichMessageLayout richMessageLayout = this.root;
            rect.set(i13 - richMessageLayout.padLeft, i12, (richMessageLayout.getMinWidth() + this.root.padRight) - this.padding.right, getContentHeight() + i12);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getBlockAccessibilityElementStateDescription(int i10) {
            return LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getBlockAccessibilityElementText(int i10) {
            StaticLayout staticLayout;
            Text text = this.title;
            CharSequence withReplacements = (text == null || (staticLayout = text.layout) == null) ? null : RichBlock.withReplacements(staticLayout.getText());
            return TextUtils.concat(LocaleController.getString(R.string.ArticleToggleBlock), ", ", LocaleController.getString(isOpen() ? R.string.AccDescrExpanded : R.string.AccDescrCollapsed), TextUtils.isEmpty(withReplacements) ? "" : TextUtils.concat(", ", withReplacements));
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.padding.top + getContentHeight() + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return AndroidUtilities.dp(TEXT_RIGHT_DP) + this.title.getMinWidth() + AndroidUtilities.dp(TEXT_LEFT_DP) + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isBlockAccessibilityElementText(int i10) {
            return true;
        }

        public boolean isOpen() {
            return this.block.open;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.title.attach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            toggle();
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.title.detach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            org.telegram.ui.Components.rc rcVar = this.bounce;
            float a2 = rcVar != null ? rcVar.a(0.02f) : 1.0f;
            RichMessageLayout richMessageLayout = this.root;
            float f10 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            float f11 = (minWidth - rect.left) - rect.right;
            if (a2 != 1.0f) {
                canvas.save();
                canvas.scale(a2, a2, (f10 + f11) / 2.0f, getContentHeight() / 2.0f);
            }
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.Ek : org.telegram.ui.ActionBar.j6.Dk);
            AnimatedArrowDrawable animatedArrowDrawable = this.arrow;
            animatedArrowDrawable.a.setColor(themedColor);
            animatedArrowDrawable.invalidateSelf();
            canvas.save();
            canvas.translate(AndroidUtilities.dpf2(ARROW_LEFT_DP) + f10, AndroidUtilities.dpf2(ARROW_TOP_DP));
            this.arrow.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.dp(TEXT_LEFT_DP) + f10, AndroidUtilities.dp(TEXT_TOP_DP));
            this.title.draw(canvas);
            canvas.restore();
            if (a2 != 1.0f) {
                canvas.restore();
            }
            if (isOpen()) {
                return;
            }
            RichMessageLayout richMessageLayout3 = this.root;
            if (richMessageLayout3.detailsAnimating) {
                return;
            }
            this.linePaint.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.j6.Gk : org.telegram.ui.ActionBar.j6.Fk));
            canvas.drawRect(f10, getContentHeight() - 1.0f, f11, getContentHeight(), this.linePaint);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.rc rcVar = this.bounce;
                if (rcVar != null) {
                    rcVar.c(true);
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.rc rcVar2 = this.bounce;
                    if (rcVar2 != null) {
                        rcVar2.c(false);
                    }
                }
                return this.pressed;
            }
            if (!this.pressed) {
                return false;
            }
            this.pressed = false;
            org.telegram.ui.Components.rc rcVar3 = this.bounce;
            if (rcVar3 != null) {
                rcVar3.c(false);
            }
            View view = this.root.view;
            if (view != null) {
                view.playSoundEffect(0);
            }
            toggle();
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            this.title.setX((AndroidUtilities.dp(TEXT_LEFT_DP) + (i10 - this.root.padLeft)) - this.title.left);
            this.title.setY(AndroidUtilities.dp(TEXT_TOP_DP) + i11);
            this.title.setRow(i12);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichDetailsEndBlock extends RichBlock {
        private final Paint paint;

        public RichDetailsEndBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            super(richMessageLayout, rect, i10);
            this.paint = new Paint(1);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return y3.C(6.0f, this.padding.top, 1) + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f) + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.Gk : org.telegram.ui.ActionBar.j6.Fk));
            RichMessageLayout richMessageLayout2 = this.root;
            float f10 = -richMessageLayout2.padLeft;
            int minWidth = richMessageLayout2.getMinWidth();
            RichMessageLayout richMessageLayout3 = this.root;
            int i10 = minWidth + richMessageLayout3.padRight;
            Rect rect = this.padding;
            float f11 = (i10 - rect.left) - rect.right;
            if (richMessageLayout3.detailsAnimating) {
                r2 = AndroidUtilities.lerp(this.prevVisible ? 1.0f : 0.0f, this.currVisible ? 1.0f : 0.0f, richMessageLayout3.detailsAnimationProgress);
            } else if (this.currVisible) {
                r2 = 1.0f;
            }
            float lerp = AndroidUtilities.lerp((-1.0f) - (this.parentDetails != null ? r0.padding.bottom : 0), AndroidUtilities.dp(6.0f), r2);
            canvas.drawRect(f10, lerp, f11, lerp + 1.0f, this.paint);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichDividerBlock extends RichBlock {
        public final Paint paint;

        public RichDividerBlock(RichMessageLayout richMessageLayout, Rect rect, int i10) {
            super(richMessageLayout, rect, i10);
            this.paint = new Paint(1);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return AndroidUtilities.dp(12.0f) + this.padding.top + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            int minWidth = this.root.getMinWidth();
            RichMessageLayout richMessageLayout = this.root;
            int i10 = richMessageLayout.padLeft;
            int i11 = minWidth + i10 + richMessageLayout.padRight;
            Rect rect = this.padding;
            int i12 = rect.left;
            int i13 = ((i11 - i12) - rect.right) / 2;
            float f10 = (((r0 - i13) / 2.0f) - i10) + i12;
            float dp = (AndroidUtilities.dp(12.0f) - AndroidUtilities.dp(1.0f)) / 2.0f;
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.wk : org.telegram.ui.ActionBar.j6.vk));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, i13 + f10, AndroidUtilities.dp(1.0f) + dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), this.paint);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichMapBlock extends RichBlock {
        private static Paint mapBgPaint;
        public final TL_iv.pageBlockMap block;
        private int currentMapProvider;
        public final ImageReceiver imageReceiver;
        private final int imgHeight;
        private final int imgWidth;
        private boolean photoPressed;
        private Drawable redPinIcon;

        public RichMapBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockMap pageblockmap) {
            super(richMessageLayout, rect, i10);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.block = pageblockmap;
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            int i11 = pageblockmap.w;
            i11 = i11 <= 0 ? 100 : i11;
            int i12 = pageblockmap.h;
            int i13 = i12 > 0 ? i12 : 100;
            int i14 = this.maxWidth;
            int max = (int) ((i14 / Math.max(1, i11)) * i13);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i14 = (int) ((max2 / Math.max(1, i13)) * i11);
                max = max2;
            }
            this.imgWidth = i14;
            this.imgHeight = max;
            imageReceiver.setImageCoords(0.0f, 0.0f, i14, max);
            applyImage();
        }

        private void applyImage() {
            if (this.block.geo == null) {
                return;
            }
            int i10 = this.root.currentAccount;
            int i11 = MessagesController.getInstance(i10).mapProvider;
            this.currentMapProvider = i11;
            float f10 = this.imgWidth;
            float f11 = AndroidUtilities.density;
            int i12 = (int) (f10 / f11);
            int i13 = (int) (this.imgHeight / f11);
            TL_iv.pageBlockMap pageblockmap = this.block;
            int i14 = pageblockmap.zoom;
            int i15 = i14 > 0 ? i14 : 15;
            if (i11 == 2) {
                WebFile createWithGeoPoint = WebFile.createWithGeoPoint(pageblockmap.geo, i12, i13, i15, Math.min(2, (int) Math.ceil(f11)));
                if (createWithGeoPoint != null) {
                    this.imageReceiver.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, this.root.messageObject, 0);
                    return;
                }
                return;
            }
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i10, geoPoint.lat, geoPoint._long, i12, i13, true, i15, -1);
            if (formapMapUrl != null) {
                this.imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            View view;
            if (mapBgPaint == null) {
                mapBgPaint = new Paint(1);
            }
            mapBgPaint.setColor(this.root.getThemedColor(org.telegram.ui.ActionBar.j6.pe));
            boolean isInQuote = isInQuote();
            int i10 = isInQuote ? 0 : this.root.padLeft;
            int i11 = isInQuote ? 0 : this.root.padRight;
            float f10 = -i10;
            canvas.drawRect(f10, 0.0f, this.imgWidth + i11, this.imgHeight, mapBgPaint);
            Drawable drawable = org.telegram.ui.ActionBar.j6.S4[this.root.isOut() ? 1 : 0];
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i12 = (this.imgWidth - intrinsicWidth) / 2;
                int i13 = (this.imgHeight - intrinsicHeight) / 2;
                drawable.setBounds(i12, i13, intrinsicWidth + i12, intrinsicHeight + i13);
                drawable.draw(canvas);
            }
            this.imageReceiver.setImageCoords(f10, 0.0f, this.imgWidth + i10 + i11, this.imgHeight);
            this.imageReceiver.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                if (this.redPinIcon == null && (view = this.view) != null) {
                    this.redPinIcon = view.getContext().getDrawable(R.drawable.map_pin).mutate();
                }
                if (this.redPinIcon != null) {
                    int intrinsicWidth2 = (int) (r10.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int i14 = (this.imgWidth - intrinsicWidth2) / 2;
                    int i15 = (this.imgHeight / 2) - intrinsicHeight2;
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(i14, i15, intrinsicWidth2 + i14, intrinsicHeight2 + i15);
                    this.redPinIcon.draw(canvas);
                }
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view;
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX() - this.padding.left;
            float y10 = motionEvent.getY() - this.padding.top;
            boolean z4 = x10 >= 0.0f && x10 <= ((float) this.imgWidth) && y10 >= 0.0f && y10 <= ((float) this.imgHeight);
            if (actionMasked == 0) {
                if (!z4) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.photoPressed = false;
                }
                return this.photoPressed;
            }
            if (this.photoPressed) {
                this.photoPressed = false;
                if (z4 && this.block.geo != null && (view = this.view) != null) {
                    view.playSoundEffect(0);
                    try {
                        TLRPC.GeoPoint geoPoint = this.block.geo;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        this.view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichMathBlock extends RichBlock {
        private static final int HPAD = 0;
        private static final int VPAD = 8;
        private Bitmap bitmap;
        private final TL_iv.pageBlockMath block;
        private int contentH;
        private int contentW;
        private final int contentWidth;
        private int downScrollX;
        private float downX;
        private boolean dragging;
        private final Runnable flingTick;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        private final Paint paint;
        private int scrollX;
        private OverScroller scroller;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        public RichMathBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockMath pageblockmath) {
            super(richMessageLayout, rect, i10);
            this.paint = new Paint(3);
            this.flingTick = new Runnable() { // from class: org.telegram.messenger.RichMessageLayout.RichMathBlock.1
                @Override // java.lang.Runnable
                public void run() {
                    if (RichMathBlock.this.scroller != null) {
                        RichMathBlock richMathBlock = RichMathBlock.this;
                        if (richMathBlock.view != null && richMathBlock.scroller.computeScrollOffset()) {
                            int currX = RichMathBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichMathBlock.this.maxScrollX) {
                                currX = RichMathBlock.this.maxScrollX;
                            }
                            if (currX != RichMathBlock.this.scrollX) {
                                RichMathBlock.this.scrollX = currX;
                                RichMathBlock.this.view.invalidate();
                            }
                            if (RichMathBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichMathBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            this.block = pageblockmath;
            int i11 = this.maxWidth;
            this.viewportWidth = i11;
            vh.r a2 = (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? null : vh.r.a(pageblockmath.source, AndroidUtilities.dp(richMessageLayout.fontSize + 4), false);
            if (a2 != null) {
                this.bitmap = a2.a;
                this.contentW = a2.b;
                this.contentH = a2.c;
            }
            int D = y3.D(0.0f, 2, this.contentW);
            this.contentWidth = D;
            this.maxScrollX = Math.max(0, D - i11);
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            TL_iv.pageBlockMath pageblockmath = this.block;
            if (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) {
                return;
            }
            spannableStringBuilder.append((CharSequence) this.block.source);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return y3.D(8.0f, 2, this.padding.top + this.contentH) + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return Math.min(this.viewportWidth, this.contentWidth) + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.bitmap == null) {
                return;
            }
            Paint paint = this.paint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec));
            int D = y3.D(8.0f, 2, this.contentH);
            if (this.maxScrollX > 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                float f10 = -richMessageLayout2.padLeft;
                int minWidth = richMessageLayout2.getMinWidth() + this.root.padRight;
                Rect rect = this.padding;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f10, 0.0f, (minWidth - rect.left) - rect.right, D, 255, 31);
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            } else {
                canvas2 = canvas;
                canvas2.save();
                canvas2.translate(((this.root.getMinWidth() / 2.0f) - this.padding.left) - (this.contentW / 2.0f), AndroidUtilities.dp(8.0f));
            }
            canvas2.drawBitmap(this.bitmap, 0.0f, 0.0f, this.paint);
            if (this.maxScrollX > 0) {
                canvas2.restore();
                RectF rectF = AndroidUtilities.rectTmp;
                int i10 = this.root.padLeft;
                float f11 = D;
                rectF.set(-i10, 0.0f, AndroidUtilities.dp(12.0f) + (-i10), f11);
                this.root.clip.b(canvas2, rectF, 0, 1.0f);
                int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                Rect rect2 = this.padding;
                rectF.set(r1 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, f11);
                this.root.clip.b(canvas2, rectF, 2, 1.0f);
            }
            canvas2.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            if (this.maxScrollX <= 0) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                return true;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.downX;
                if (!this.dragging && Math.abs(x10) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                }
                if (!this.dragging) {
                    return false;
                }
                int i10 = (int) (this.downScrollX - x10);
                int i11 = i10 >= 0 ? i10 : 0;
                int i12 = this.maxScrollX;
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i11 != this.scrollX) {
                    this.scrollX = i11;
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
                return true;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            boolean z4 = this.dragging;
            this.dragging = false;
            if (z4) {
                requestDisallowParentIntercept(false);
                if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maxFlingVelocity);
                    float f10 = -this.velocityTracker.getXVelocity();
                    if (Math.abs(f10) > this.minFlingVelocity) {
                        this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                        this.view.postOnAnimation(this.flingTick);
                    }
                }
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.velocityTracker = null;
            }
            return z4 || actionMasked == 1;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichPhotoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockPhoto block;
        public final TLRPC.Photo photo;
        public final TLRPC.PhotoSize sizeFull;
        public final TLRPC.PhotoSize strippedSize;

        public RichPhotoBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockPhoto pageblockphoto, boolean z4) {
            super(richMessageLayout, rect, i10, z4);
            this.block = pageblockphoto;
            TLRPC.Photo photo = richMessageLayout.getPhoto(pageblockphoto.photo_id);
            this.photo = photo;
            if (photo != null) {
                this.sizeFull = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                this.strippedSize = FileLoader.getStrippedPhotoSize(photo.sizes);
            } else {
                this.sizeFull = null;
                this.strippedSize = null;
            }
            TLRPC.PhotoSize photoSize = this.sizeFull;
            int i11 = photoSize != null ? photoSize.w : 100;
            int i12 = photoSize != null ? photoSize.h : 100;
            int i13 = this.maxWidth;
            int max = (int) ((i13 / Math.max(1, i11)) * i12);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i13 = (int) ((max2 / Math.max(1, i12)) * i11);
                max = max2;
            }
            this.imgWidth = i13;
            this.imgHeight = max;
            finishLayout();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public void applyImage(boolean z4) {
            TLRPC.Photo photo = this.photo;
            if (photo == null || this.sizeFull == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedSize;
            ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
            if (z4) {
                this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            } else {
                this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean fileExists() {
            if (this.sizeFull == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
            return pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public String getFileName() {
            return FileLoader.getAttachFileName(this.sizeFull);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean isSpoiler() {
            TL_iv.pageBlockPhoto pageblockphoto = this.block;
            return pageblockphoto != null && pageblockphoto.spoiler;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichPreformattedBlock extends RichBlock {
        private static final int BACKGROUND_OUTER_VPAD = 7;
        private static final int HPAD = 0;
        private static final int SCROLLBAR_HEIGHT = 5;
        private static final int SCROLLBAR_HPAD = 6;
        private static final int SCROLLBAR_VPAD = 7;
        private static final int VPAD = 8;
        private final Paint bgPaint;
        public SpannableString content;
        private final int contentWidth;
        private int downScrollX;
        private float downX;
        private boolean dragging;
        private final Runnable flingTick;
        public final String language;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        public String plain;
        private int scrollX;
        private OverScroller scroller;
        public final Text text;
        private boolean textHandlingTouch;
        public final Text[] texts;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        public RichPreformattedBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockPreformatted pageblockpreformatted, RichPreformattedBlock richPreformattedBlock) {
            super(richMessageLayout, rect, i10);
            this.bgPaint = new Paint(1);
            this.flingTick = new Runnable() { // from class: org.telegram.messenger.RichMessageLayout.RichPreformattedBlock.1
                @Override // java.lang.Runnable
                public void run() {
                    if (RichPreformattedBlock.this.scroller != null) {
                        RichPreformattedBlock richPreformattedBlock2 = RichPreformattedBlock.this;
                        if (richPreformattedBlock2.view != null && richPreformattedBlock2.scroller.computeScrollOffset()) {
                            int currX = RichPreformattedBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichPreformattedBlock.this.maxScrollX) {
                                currX = RichPreformattedBlock.this.maxScrollX;
                            }
                            if (currX != RichPreformattedBlock.this.scrollX) {
                                RichPreformattedBlock.this.scrollX = currX;
                                RichPreformattedBlock richPreformattedBlock3 = RichPreformattedBlock.this;
                                richPreformattedBlock3.placeTexts(richPreformattedBlock3.layoutX, richPreformattedBlock3.layoutY, richPreformattedBlock3.layoutRow);
                                RichPreformattedBlock.this.view.invalidate();
                            }
                            if (RichPreformattedBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichPreformattedBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            this.viewportWidth = this.maxWidth;
            this.language = pageblockpreformatted.language;
            String string = RichMessageLayout.getString(pageblockpreformatted.text);
            this.plain = string;
            if (string == null) {
                this.plain = "";
            }
            SpannableString spannableString = new SpannableString(this.plain);
            this.content = spannableString;
            if (spannableString.length() > 0) {
                this.content.setSpan(new StyleSpan(richMessageLayout, 8), 0, this.content.length(), 33);
                if (richPreformattedBlock != null) {
                    CharSequence charSequence = richPreformattedBlock.content;
                    if ((charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) && !((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).ready) {
                        charSequence = ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback;
                    }
                    if (charSequence != null && charSequence.length() > 0 && this.plain.length() >= charSequence.length()) {
                        if (charSequence instanceof CodeHighlighting.LockedWithFallbackSpannableString) {
                            ((CodeHighlighting.LockedWithFallbackSpannableString) charSequence).fallback = null;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.plain.substring(charSequence.length()));
                        for (StyleSpan styleSpan : (StyleSpan[]) append.getSpans(0, append.length(), StyleSpan.class)) {
                            append.removeSpan(styleSpan);
                        }
                        append.setSpan(new StyleSpan(richMessageLayout, 8), 0, append.length(), 33);
                        CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) append.getSpans(0, append.length(), CodeHighlighting.Span.class);
                        for (int i11 = 0; i11 < spanArr.length; i11++) {
                            int spanStart = append.getSpanStart(spanArr[i11]);
                            int spanStart2 = append.getSpanStart(spanArr[i11]);
                            append.removeSpan(spanArr[i11]);
                            append.setSpan(spanArr[i11], spanStart, spanStart2, 33);
                        }
                        this.content = new CodeHighlighting.LockedWithFallbackSpannableString(this.content, append);
                    }
                }
                if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                    SpannableString spannableString2 = this.content;
                    CodeHighlighting.highlight(spannableString2, 0, spannableString2.length(), pageblockpreformatted.language, 0, null, false);
                }
            }
            Text text = new Text(richMessageLayout, this.content, AndroidUtilities.dp(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.3f);
            this.text = text;
            this.texts = new Text[]{text};
            int D = y3.D(0.0f, 2, Math.max(0, text.right - text.left));
            this.contentWidth = D;
            int max = Math.max(0, D - this.viewportWidth);
            this.maxScrollX = max;
            if (richPreformattedBlock != null) {
                this.scrollX = Utilities.clamp(richPreformattedBlock.scrollX, max, 0);
            }
        }

        private void drawBackground(Canvas canvas) {
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout = this.root;
            paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.yk : org.telegram.ui.ActionBar.j6.xk));
            if (this.padding.left <= 0) {
                RichMessageLayout richMessageLayout2 = this.root;
                canvas.drawRect(-richMessageLayout2.padLeft, 0.0f, richMessageLayout2.getMinWidth() + this.root.padRight, getBackgroundHeight(), this.bgPaint);
            } else {
                int minWidth = this.root.getMinWidth();
                Rect rect = this.padding;
                canvas.drawRect(0.0f, 0.0f, (minWidth - rect.left) - rect.right, getBackgroundHeight(), this.bgPaint);
            }
        }

        private void drawScrollbar(Canvas canvas) {
            float f10;
            float minWidth;
            if (this.maxScrollX <= 0) {
                return;
            }
            if (this.padding.left > 0) {
                int minWidth2 = this.root.getMinWidth();
                Rect rect = this.padding;
                minWidth = (minWidth2 - rect.left) - rect.right;
                f10 = 0.0f;
            } else {
                RichMessageLayout richMessageLayout = this.root;
                f10 = -richMessageLayout.padLeft;
                minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            }
            float dp = f10 + AndroidUtilities.dp(6.0f);
            float dp2 = minWidth - AndroidUtilities.dp(6.0f);
            if (dp2 <= dp) {
                return;
            }
            float dp3 = AndroidUtilities.dp(23.0f) + this.text.getHeight();
            float dp4 = dp3 + AndroidUtilities.dp(5.0f);
            float dp5 = AndroidUtilities.dp(2.5f);
            Paint paint = this.bgPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.Bk : org.telegram.ui.ActionBar.j6.zk));
            canvas.drawRoundRect(dp, dp3, dp2, dp4, dp5, dp5, this.bgPaint);
            float f11 = dp2 - dp;
            float min = Math.min(f11, Math.max(AndroidUtilities.dp(5.0f), (this.viewportWidth * f11) / this.contentWidth));
            float f12 = (((f11 - min) * this.scrollX) / this.maxScrollX) + dp;
            Paint paint2 = this.bgPaint;
            RichMessageLayout richMessageLayout3 = this.root;
            paint2.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.j6.Ck : org.telegram.ui.ActionBar.j6.Ak));
            canvas.drawRoundRect(f12, dp3, f12 + min, dp4, dp5, dp5, this.bgPaint);
        }

        private void drawTextContent(Canvas canvas, boolean z4, int i10, float f10) {
            int min = Math.min(this.viewportWidth, this.contentWidth);
            int D = y3.D(8.0f, 2, this.text.getHeight());
            if (this.padding.left > 0) {
                canvas.save();
                canvas.clipRect(0, 0, min, D);
                canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
                if (z4) {
                    this.text.drawFade(canvas, i10, f10);
                } else {
                    this.text.draw(canvas);
                }
                canvas.restore();
                return;
            }
            RichMessageLayout richMessageLayout = this.root;
            float f11 = -richMessageLayout.padLeft;
            float f12 = min + richMessageLayout.padRight;
            float f13 = D;
            canvas.saveLayerAlpha(f11, 0.0f, f12, f13, 255, 31);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(0.0f) - this.scrollX, AndroidUtilities.dp(8.0f));
            if (z4) {
                this.text.drawFade(canvas, i10, f10);
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i11 = this.root.padLeft;
            rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), f13);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth = this.root.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            rectF.set(r2 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth - rect.left) - rect.right, f13);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        private int getBackgroundHeight() {
            return AndroidUtilities.dp(16.0f) + this.text.getHeight() + (this.maxScrollX > 0 ? AndroidUtilities.dp(19.0f) : 0);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = ((AndroidUtilities.dp(0.0f) + this.padding.left) - this.scrollX) - this.text.left;
            foundLink.y = AndroidUtilities.dp(15.0f) + i10 + this.padding.top;
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getAccessibilityLabel() {
            CharSequence accessibilityLabel = super.getAccessibilityLabel();
            if (!TextUtils.isEmpty(this.language)) {
                String capitalizeLanguage = MessageObject.TextLayoutBlock.capitalizeLanguage(this.language);
                if (!TextUtils.isEmpty(capitalizeLanguage)) {
                    return TextUtils.concat(accessibilityLabel, " (", capitalizeLanguage, ")");
                }
            }
            return accessibilityLabel;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return y3.D(7.0f, 2, this.padding.top) + getBackgroundHeight() + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock, org.telegram.ui.kj0
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return Math.min(this.viewportWidth, this.contentWidth) + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, false, 0, 0.0f);
            drawScrollbar(canvas);
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            StaticLayout staticLayout = this.text.layout;
            if (staticLayout == null || i10 < 0 || i10 >= staticLayout.getLineCount()) {
                onDraw(canvas);
                return;
            }
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(7.0f));
            drawBackground(canvas);
            drawTextContent(canvas, true, i10, f10);
            drawScrollbar(canvas);
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            int actionMasked = motionEvent.getActionMasked();
            float dp = AndroidUtilities.dp(0.0f) - this.scrollX;
            float dp2 = AndroidUtilities.dp(15.0f);
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                motionEvent.offsetLocation(-dp, -dp2);
                this.textHandlingTouch = this.text.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(dp, dp2);
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked != 1 && actionMasked != 3) {
                    return false;
                }
                boolean z4 = this.dragging;
                this.dragging = false;
                if (z4) {
                    requestDisallowParentIntercept(false);
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maxFlingVelocity);
                        float f10 = -this.velocityTracker.getXVelocity();
                        if (Math.abs(f10) > this.minFlingVelocity) {
                            this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                            this.view.postOnAnimation(this.flingTick);
                        }
                    }
                }
                if (!z4 && this.textHandlingTouch) {
                    motionEvent.offsetLocation(-dp, -dp2);
                    this.text.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(dp, dp2);
                }
                this.textHandlingTouch = false;
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.velocityTracker = null;
                }
                return z4 || actionMasked == 1;
            }
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.downX;
            if (!this.dragging && this.maxScrollX > 0 && Math.abs(x10) > this.touchSlop) {
                this.dragging = true;
                requestDisallowParentIntercept(true);
                if (this.textHandlingTouch) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-dp, -dp2);
                    this.text.onTouchEvent(obtain);
                    obtain.recycle();
                    this.textHandlingTouch = false;
                }
            }
            if (!this.dragging) {
                return this.textHandlingTouch;
            }
            int i10 = (int) (this.downScrollX - x10);
            int i11 = i10 >= 0 ? i10 : 0;
            int i12 = this.maxScrollX;
            if (i11 > i12) {
                i11 = i12;
            }
            if (i11 != this.scrollX) {
                this.scrollX = i11;
                placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
            }
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            this.text.setX(((AndroidUtilities.dp(0.0f) + i10) - this.scrollX) - this.text.left);
            this.text.setY(AndroidUtilities.dp(15.0f) + i11);
            this.text.setRow(i12);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichPullquoteBlock extends RichTextWithAuthorBlock {
        public RichPullquoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10, charSequence, charSequence2, Layout.Alignment.ALIGN_CENTER);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichQuoteBlock extends RichTextWithAuthorBlock {
        public RichQuoteBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2) {
            super(richMessageLayout, rect, i10, charSequence, charSequence2, Layout.Alignment.ALIGN_NORMAL);
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichSlideshowBlock extends RichBlock {
        private static Paint mediaBgPaint;
        private static Paint slideDotPaint;
        public final TL_iv.pageBlockSlideshow block;
        public final ArrayList<MediaCell> cells;
        private final Path clipPath;
        private int currentPage;
        private int dotsHeight;
        private float downX;
        private float downY;
        private boolean dragging;
        public final boolean first;
        private int maxFlingVelocity;
        private int minFlingVelocity;
        private float pageOffset;
        private ValueAnimator settleAnimator;
        private int slideHeight;
        private int slideWidth;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private boolean verticalDragging;

        public RichSlideshowBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockSlideshow pageblockslideshow, boolean z4) {
            super(richMessageLayout, rect, i10);
            this.cells = new ArrayList<>();
            this.clipPath = new Path();
            this.block = pageblockslideshow;
            this.first = z4;
            for (int i11 = 0; i11 < pageblockslideshow.items.size(); i11++) {
                MediaCell forPageBlock = MediaCell.forPageBlock(richMessageLayout, pageblockslideshow.items.get(i11));
                if (forPageBlock != null) {
                    this.cells.add(forPageBlock);
                }
            }
            layoutCells();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$settle$0(ValueAnimator valueAnimator) {
            this.pageOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void layoutCells() {
            if (this.cells.isEmpty()) {
                this.slideHeight = 0;
                this.slideWidth = 0;
                return;
            }
            this.slideWidth = this.maxWidth;
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            float f10 = 0.0f;
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                float f11 = mediaCell.aspectRatio;
                if (f11 <= 0.0f) {
                    f11 = 1.0f;
                }
                f10 += f11;
            }
            int max = (int) (this.slideWidth / Math.max(0.5f, f10 / this.cells.size()));
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                max = max2;
            }
            this.slideHeight = max;
            this.dotsHeight = 0;
            ArrayList<MediaCell> arrayList2 = this.cells;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                MediaCell mediaCell2 = arrayList2.get(i11);
                i11++;
                mediaCell2.setRect(0, 0, this.slideWidth, this.slideHeight);
            }
        }

        private void settle(float f10) {
            int i10;
            if (f10 >= 0.0f || this.currentPage >= this.cells.size() - 1) {
                i10 = -1;
                if (f10 <= 0.0f || this.currentPage <= 0) {
                    if (this.pageOffset <= 0.5f || this.currentPage >= this.cells.size() - 1) {
                        if (this.pageOffset >= -0.5f || this.currentPage <= 0) {
                            i10 = 0;
                        }
                    }
                }
                final int i11 = i10 + this.currentPage;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.pageOffset, i11 - r7);
                this.settleAnimator = ofFloat;
                ofFloat.setDuration(420L);
                this.settleAnimator.setInterpolator(mr.h);
                this.settleAnimator.addUpdateListener(new o(this, 2));
                this.settleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.RichMessageLayout.RichSlideshowBlock.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        RichSlideshowBlock.this.currentPage = i11;
                        RichSlideshowBlock.this.pageOffset = 0.0f;
                        View view = RichSlideshowBlock.this.view;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                });
                this.settleAnimator.start();
            }
            i10 = 1;
            final int i112 = i10 + this.currentPage;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.pageOffset, i112 - r7);
            this.settleAnimator = ofFloat2;
            ofFloat2.setDuration(420L);
            this.settleAnimator.setInterpolator(mr.h);
            this.settleAnimator.addUpdateListener(new o(this, 2));
            this.settleAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.RichMessageLayout.RichSlideshowBlock.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RichSlideshowBlock.this.currentPage = i112;
                    RichSlideshowBlock.this.pageOffset = 0.0f;
                    View view = RichSlideshowBlock.this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            });
            this.settleAnimator.start();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            Rect rect2 = this.padding;
            int i11 = rect2.left;
            int i12 = ((int) this.currY) + rect2.top;
            rect.set(i11, i12, this.slideWidth + i11, this.slideHeight + i12);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getBlockAccessibilityElementCount() {
            return !this.cells.isEmpty() ? 1 : 0;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getBlockAccessibilityElementText(int i10) {
            if (this.cells.isEmpty()) {
                return null;
            }
            int max = Math.max(0, Math.min(this.currentPage, this.cells.size() - 1));
            return TextUtils.concat(this.cells.get(max).getAccessibilityText(), ", ", LocaleController.formatString(R.string.Of, Integer.valueOf(max + 1), Integer.valueOf(this.cells.size())));
        }

        public int getCurrentPage() {
            return this.currentPage;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.slideHeight + this.dotsHeight;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.maxWidth + rect.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            ValueAnimator valueAnimator = this.settleAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (this.cells.isEmpty()) {
                return false;
            }
            return this.cells.get(Math.max(0, Math.min(this.currentPage, this.cells.size() - 1))).onAccessibilityClick(view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            int i10 = 0;
            requestDisallowParentIntercept(false);
            this.dragging = false;
            this.verticalDragging = false;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            ArrayList<MediaCell> arrayList = this.cells;
            int size = arrayList.size();
            while (i10 < size) {
                MediaCell mediaCell = arrayList.get(i10);
                i10++;
                mediaCell.detach();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            float f10;
            float f11;
            float f12;
            int i10;
            int i11;
            int i12;
            int i13;
            float clamp;
            int i14;
            float f13;
            MediaCell mediaCell;
            if (this.cells.isEmpty()) {
                return;
            }
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            boolean isInQuote = isInQuote();
            int dp = AndroidUtilities.dp(2.0f);
            int i15 = isInQuote ? 0 : this.root.padLeft - dp;
            int i16 = isInQuote ? 0 : this.root.padRight - dp;
            int i17 = this.slideWidth + i15 + i16;
            canvas.save();
            if (isInQuote) {
                int dp2 = AndroidUtilities.dp(8.0f);
                this.clipPath.rewind();
                float f14 = dp2;
                this.clipPath.addRoundRect(0.0f, 0.0f, this.slideWidth, this.slideHeight, f14, f14, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i10 = dp2;
                i11 = i10;
                i12 = i11;
                i13 = i12;
                f10 = 2.0f;
                f11 = 3.0f;
                f12 = 8.0f;
            } else if (this.first) {
                int i18 = SharedConfig.bubbleRadius;
                int dp3 = i18 > 2 ? AndroidUtilities.dp(i18 - 2) : AndroidUtilities.dp(i18);
                int min = Math.min(AndroidUtilities.dp(3.0f), dp3);
                int i19 = ((this.root.isOut() || !this.root.isPinnedTop()) && !this.root.hasNameOffset()) ? dp3 : min;
                if ((this.root.isOut() && this.root.isPinnedTop()) || this.root.hasNameOffset()) {
                    dp3 = min;
                }
                float f15 = i19;
                float f16 = dp3;
                f10 = 2.0f;
                float f17 = min;
                f11 = 3.0f;
                this.clipPath.rewind();
                f12 = 8.0f;
                this.clipPath.addRoundRect(-i15, 0.0f, this.slideWidth + i16, this.slideHeight, new float[]{f15, f15, f16, f16, f17, f17, f17, f17}, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                i11 = dp3;
                i12 = min;
                i13 = i12;
                i10 = i19;
            } else {
                f10 = 2.0f;
                f11 = 3.0f;
                f12 = 8.0f;
                canvas.clipRect(-i15, 0, this.root.getMinWidth() + i16, this.slideHeight);
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            int i20 = this.currentPage;
            float f18 = 0.0f;
            if ((i20 == 0 && this.pageOffset < 0.0f) || (i20 == this.cells.size() - 1 && this.pageOffset > 0.0f)) {
                RichMessageLayout richMessageLayout = this.root;
                canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(0.2f, richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.cb : org.telegram.ui.ActionBar.j6.Wc)));
            }
            float f19 = i17;
            float f20 = (-this.pageOffset) * f19;
            int i21 = this.currentPage - 1;
            for (int i22 = 1; i21 <= this.currentPage + i22; i22 = 1) {
                if (i21 < 0 || i21 >= this.cells.size()) {
                    i14 = i21;
                    f13 = f19;
                } else {
                    MediaCell mediaCell2 = this.cells.get(i21);
                    canvas.save();
                    canvas.translate(((i21 - this.currentPage) * i17) + f20, f18);
                    mediaCell2.imageReceiver.setRoundRadius(i21 == 0 ? i10 : 0, i21 == this.cells.size() - i22 ? i11 : 0, i21 == this.cells.size() + (-1) ? i12 : 0, i21 == 0 ? i13 : 0);
                    mediaCell2.blurImageReceiver.setRoundRadius(i21 == 0 ? i10 : 0, i21 == this.cells.size() + (-1) ? i11 : 0, i21 == this.cells.size() + (-1) ? i12 : 0, i21 == 0 ? i13 : 0);
                    float f21 = -i15;
                    mediaCell2.imageReceiver.setImageCoords(f21, 0.0f, f19, this.slideHeight);
                    if (mediaCell2.imageReceiver.hasBitmapImage() && mediaCell2.imageReceiver.getCurrentAlpha() == 1.0f) {
                        i14 = i21;
                        f13 = f19;
                        mediaCell = mediaCell2;
                    } else {
                        i14 = i21;
                        mediaCell = mediaCell2;
                        f13 = f19;
                        canvas.drawRect(f21, 0.0f, i17 + i16, this.slideHeight, mediaBgPaint);
                    }
                    mediaCell.draw(canvas);
                    canvas.restore();
                }
                i21 = i14 + 1;
                f19 = f13;
                f18 = 0.0f;
            }
            canvas.restore();
            int size = this.cells.size();
            if (size > 1) {
                if (slideDotPaint == null) {
                    Paint paint2 = new Paint(1);
                    slideDotPaint = paint2;
                    paint2.setColor(-1);
                    slideDotPaint.setShadowLayer(AndroidUtilities.dpf2(f11), 0.0f, AndroidUtilities.dpf2(1.0f), TLObject.FLAG_31);
                }
                float dp4 = AndroidUtilities.dp(5.0f) + (this.slideHeight - AndroidUtilities.dp(23.0f));
                int dp5 = AndroidUtilities.dp(4.0f) + y3.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
                float f22 = this.currentPage + this.pageOffset;
                if (dp5 < i17) {
                    clamp = (i17 - dp5) / f10;
                } else {
                    float dp6 = AndroidUtilities.dp(4.0f);
                    int dp7 = AndroidUtilities.dp(13.0f);
                    clamp = dp6 - (Utilities.clamp(f22 - (((i17 - AndroidUtilities.dp(f12)) / 2) / dp7), Math.max(0, (size - (r11 * 2)) - 1), 0.0f) * dp7);
                }
                canvas.save();
                canvas.clipRect(0, this.slideHeight - AndroidUtilities.dp(23.0f), i17, this.slideHeight);
                for (int i23 = 0; i23 < size; i23++) {
                    float max = Math.max(0.0f, 1.0f - Math.abs(i23 - f22));
                    slideDotPaint.setAlpha((int) ((max * 95.0f) + 160.0f));
                    canvas.drawCircle(AndroidUtilities.dp(4.0f) + clamp + (AndroidUtilities.dp(13.0f) * i23), dp4, (AndroidUtilities.dp(1.0f) * max) + AndroidUtilities.dp(f10), slideDotPaint);
                }
                canvas.restore();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean onTouchEvent;
            VelocityTracker velocityTracker;
            View view;
            int actionMasked = motionEvent.getActionMasked();
            Rect rect = this.padding;
            motionEvent.offsetLocation(-rect.left, -rect.top);
            try {
                if (actionMasked == 0) {
                    if (this.touchSlop == 0 && (view = this.view) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.touchSlop = viewConfiguration.getScaledTouchSlop();
                        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.downX = motionEvent.getX();
                    this.downY = motionEvent.getY();
                    this.dragging = false;
                    this.verticalDragging = false;
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    requestDisallowParentIntercept(true);
                    ValueAnimator valueAnimator = this.settleAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.settleAnimator = null;
                    }
                    int i10 = this.currentPage;
                    if (i10 >= 0 && i10 < this.cells.size()) {
                        this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                    }
                } else {
                    float f10 = 0.0f;
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            boolean z4 = this.verticalDragging;
                            this.verticalDragging = false;
                            if (!z4 && actionMasked == 1 && (velocityTracker = this.velocityTracker) != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maxFlingVelocity);
                                float xVelocity = this.velocityTracker.getXVelocity();
                                float yVelocity = this.velocityTracker.getYVelocity();
                                if (Math.abs(xVelocity) >= this.minFlingVelocity && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                                    f10 = xVelocity;
                                }
                            }
                            VelocityTracker velocityTracker3 = this.velocityTracker;
                            if (velocityTracker3 != null) {
                                velocityTracker3.recycle();
                                this.velocityTracker = null;
                            }
                            requestDisallowParentIntercept(false);
                            if (!z4) {
                                if (this.dragging) {
                                    this.dragging = false;
                                    settle(f10);
                                } else {
                                    int i11 = this.currentPage;
                                    if (i11 >= 0 && i11 < this.cells.size()) {
                                        onTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                        Rect rect2 = this.padding;
                                        motionEvent.offsetLocation(rect2.left, rect2.top);
                                        return onTouchEvent;
                                    }
                                }
                            }
                        }
                        Rect rect3 = this.padding;
                        motionEvent.offsetLocation(rect3.left, rect3.top);
                        return false;
                    }
                    if (!this.verticalDragging) {
                        VelocityTracker velocityTracker4 = this.velocityTracker;
                        if (velocityTracker4 != null) {
                            velocityTracker4.addMovement(motionEvent);
                        }
                        float x10 = motionEvent.getX() - this.downX;
                        float y10 = motionEvent.getY() - this.downY;
                        if (this.dragging || Math.abs(y10) <= this.touchSlop || Math.abs(y10) <= Math.abs(x10)) {
                            if (!this.dragging && Math.abs(x10) > this.touchSlop && Math.abs(x10) > Math.abs(y10)) {
                                this.dragging = true;
                                int i12 = this.currentPage;
                                if (i12 >= 0 && i12 < this.cells.size()) {
                                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                    obtain.setAction(3);
                                    this.cells.get(this.currentPage).onTouchEvent(obtain, this.view);
                                    obtain.recycle();
                                }
                            }
                            if (!this.dragging) {
                                int i13 = this.currentPage;
                                if (i13 >= 0 && i13 < this.cells.size()) {
                                    onTouchEvent = this.cells.get(this.currentPage).onTouchEvent(motionEvent, this.view);
                                    Rect rect22 = this.padding;
                                    motionEvent.offsetLocation(rect22.left, rect22.top);
                                    return onTouchEvent;
                                }
                                Rect rect32 = this.padding;
                                motionEvent.offsetLocation(rect32.left, rect32.top);
                                return false;
                            }
                            float f11 = (-x10) / this.slideWidth;
                            int i14 = this.currentPage;
                            if (i14 == 0 && f11 < 0.0f) {
                                f11 *= 0.3f;
                            }
                            if (i14 == this.cells.size() - 1 && f11 > 0.0f) {
                                f11 *= 0.3f;
                            }
                            this.pageOffset = f11;
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.invalidate();
                            }
                        } else {
                            this.verticalDragging = true;
                            int i15 = this.currentPage;
                            if (i15 >= 0 && i15 < this.cells.size()) {
                                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                obtain2.setAction(3);
                                this.cells.get(this.currentPage).onTouchEvent(obtain2, this.view);
                                obtain2.recycle();
                            }
                            requestDisallowParentIntercept(false);
                        }
                    }
                }
                return true;
            } finally {
                Rect rect4 = this.padding;
                motionEvent.offsetLocation(rect4.left, rect4.top);
            }
        }

        public void setCurrentPage(int i10) {
            int max = Math.max(0, Math.min(i10, this.cells.size() - 1));
            ValueAnimator valueAnimator = this.settleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.settleAnimator = null;
            }
            if (this.currentPage == max && this.pageOffset == 0.0f) {
                return;
            }
            this.currentPage = max;
            this.pageOffset = 0.0f;
            this.dragging = false;
            this.verticalDragging = false;
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichTableBlock extends RichBlock implements mz0 {
        private static final int VERTICAL_PADDING_DP = 10;
        private final ArrayList<CellBlock> cellBlocks;
        private float cellDx;
        private float cellDy;
        private final ArrayList<Text> cellTexts;
        private int contentHeight;
        private final int contentMeasuredWidth;
        private int downScrollX;
        private float downX;
        private float downY;
        private boolean dragging;
        private final Runnable flingTick;
        private Paint halfLinePaint;
        private Paint headerPaint;
        private final int intrinsicContentWidth;
        private final int intrinsicTableWidth;
        private Paint linePaint;
        private int maxFlingVelocity;
        private final int maxScrollX;
        private int minFlingVelocity;
        public final TL_iv.pageBlockTable pageBlock;
        private Text pressedCellText;
        private int resolvedTableWidth;
        private int scrollX;
        private OverScroller scroller;
        private Paint stripPaint;
        public final nz0 tableLayout;
        private boolean textHandlingTouch;
        private final org.telegram.ui.Cells.w9[] textsArr;
        private final Text title;
        private final int titleHeight;
        private int touchSlop;
        private VelocityTracker velocityTracker;
        private final int viewportWidth;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static final class CellBlock implements kj0 {
            final gz0 child;

            public CellBlock(gz0 gz0Var) {
                this.child = gz0Var;
            }

            @Override // org.telegram.ui.kj0
            public Layout getLayout() {
                fz0 fz0Var = this.child.b;
                if (fz0Var == null) {
                    return null;
                }
                return fz0Var.getLayout();
            }

            @Override // org.telegram.ui.kj0
            public View getParentView() {
                return null;
            }
        }

        public RichTableBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
            super(richMessageLayout, rect, i10);
            int i11;
            this.cellTexts = new ArrayList<>();
            this.cellBlocks = new ArrayList<>();
            this.flingTick = new Runnable() { // from class: org.telegram.messenger.RichMessageLayout.RichTableBlock.1
                @Override // java.lang.Runnable
                public void run() {
                    if (RichTableBlock.this.scroller != null) {
                        RichTableBlock richTableBlock = RichTableBlock.this;
                        if (richTableBlock.view != null && richTableBlock.scroller.computeScrollOffset()) {
                            int currX = RichTableBlock.this.scroller.getCurrX();
                            if (currX < 0) {
                                currX = 0;
                            }
                            if (currX > RichTableBlock.this.maxScrollX) {
                                currX = RichTableBlock.this.maxScrollX;
                            }
                            if (currX != RichTableBlock.this.scrollX) {
                                RichTableBlock.this.scrollX = currX;
                                RichTableBlock richTableBlock2 = RichTableBlock.this;
                                richTableBlock2.placeTexts(richTableBlock2.layoutX, richTableBlock2.layoutY, richTableBlock2.layoutRow);
                                RichTableBlock.this.view.invalidate();
                            }
                            if (RichTableBlock.this.scroller.isFinished()) {
                                return;
                            }
                            RichTableBlock.this.view.postOnAnimation(this);
                        }
                    }
                }
            };
            Rect rect2 = this.padding;
            rect2.top = AndroidUtilities.dp(10.0f) + rect2.top;
            this.pageBlock = pageblocktable;
            this.viewportWidth = this.maxWidth;
            nz0 nz0Var = new nz0(ApplicationLoader.applicationContext, this, null);
            this.tableLayout = nz0Var;
            nz0Var.setOrientation(0);
            nz0Var.setRowOrderPreserved(true);
            nz0Var.setDrawLines(pageblocktable.bordered);
            nz0Var.setStriped(pageblocktable.striped);
            nz0Var.setRtl(richMessageLayout.isRtl());
            nz0Var.setFillWidth(false);
            if (pageblocktable.compact) {
                int dp = AndroidUtilities.dp(5.0f);
                int dp2 = AndroidUtilities.dp(5.0f);
                int dp3 = AndroidUtilities.dp(5.0f);
                if (nz0Var.v != dp || nz0Var.r != dp2 || nz0Var.s != dp3) {
                    nz0Var.v = dp;
                    nz0Var.r = dp2;
                    nz0Var.s = dp3;
                    nz0Var.requestLayout();
                }
            }
            nz0Var.setMinimumCellHeight(AndroidUtilities.dp(pageblocktable.compact ? 18.0f : 36.0f));
            if (pageblocktable.rows.isEmpty()) {
                i11 = 0;
            } else {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
                i11 = 0;
                for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                    int i13 = pagetablerow.cells.get(i12).colspan;
                    if (i13 == 0) {
                        i13 = 1;
                    }
                    i11 += i13;
                }
            }
            for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i14);
                int i15 = 0;
                for (int i16 = 0; i16 < pagetablerow2.cells.size(); i16++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                    int i17 = pagetablecell.colspan;
                    i17 = i17 == 0 ? 1 : i17;
                    int i18 = pagetablecell.rowspan;
                    i18 = i18 == 0 ? 1 : i18;
                    if (pagetablecell.text != null) {
                        this.tableLayout.b(pagetablecell, i15, i14, i17);
                    } else {
                        this.tableLayout.a(i15, i14, i17, i18);
                    }
                    i15 += i17;
                }
            }
            this.tableLayout.setColumnCount(i11);
            this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec(this.maxWidth, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = this.tableLayout.getMeasuredWidth();
            this.contentMeasuredWidth = measuredWidth;
            this.intrinsicContentWidth = measuredWidth;
            this.contentHeight = this.tableLayout.getMeasuredHeight();
            this.maxScrollX = Math.max(0, measuredWidth - this.viewportWidth);
            TL_iv.RichText richText = pageblocktable.title;
            if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(RichMessageLayout.getString(richText))) {
                this.title = null;
                this.titleHeight = 0;
            } else {
                Text text = new Text(richMessageLayout, richMessageLayout.formatText(pageblocktable.title, RichMessageLayout.setBlockFlags(0, 15)), this.viewportWidth);
                this.title = text;
                text.setDrawAtOrigin(true);
                this.titleHeight = AndroidUtilities.dp(9.0f) + text.getHeight();
            }
            Text text2 = this.title;
            int max = Math.max(0, Math.min(this.viewportWidth, Math.max(measuredWidth, text2 != null ? text2.getMinWidth() : 0)));
            this.intrinsicTableWidth = max;
            this.resolvedTableWidth = max;
            for (int i19 = 0; i19 < this.tableLayout.getChildCount(); i19++) {
                gz0 d = this.tableLayout.d(i19);
                fz0 fz0Var = d.b;
                if (fz0Var instanceof Text) {
                    this.cellTexts.add((Text) fz0Var);
                    this.cellBlocks.add(new CellBlock(d));
                }
            }
            ArrayList arrayList = new ArrayList();
            Text text3 = this.title;
            if (text3 != null) {
                arrayList.add(text3);
            }
            arrayList.addAll(this.cellTexts);
            this.textsArr = (org.telegram.ui.Cells.w9[]) arrayList.toArray(new org.telegram.ui.Cells.w9[0]);
        }

        private void drawCellsWithTyping(Canvas canvas, mj0 mj0Var, float f10) {
            CellBlock cellBlock;
            RichMessageLayout richMessageLayout = this.root;
            float f11 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            int saveLayerAlpha = canvas.saveLayerAlpha(f11, 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight, (int) (f10 * 255.0f), 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            int i10 = 0;
            int i11 = 0;
            while (i11 < childCount) {
                gz0 d = this.tableLayout.d(i11);
                if (i10 >= this.cellBlocks.size() || this.cellBlocks.get(i10).child != d) {
                    cellBlock = null;
                } else {
                    cellBlock = this.cellBlocks.get(i10);
                    i10++;
                }
                int i12 = i10;
                if (cellBlock == null) {
                    d.a(canvas, this.view, true);
                } else if (!mj0Var.j(cellBlock)) {
                    d.a(canvas, this.view, false);
                } else if (mj0Var.g(cellBlock)) {
                    d.a(canvas, this.view, false);
                    if (d.b instanceof Text) {
                        canvas.save();
                        canvas.translate(d.b(), d.c());
                        ((Text) d.b).drawFade(canvas, mj0Var.g(cellBlock) ? mj0Var.e : -1, mj0Var.g(cellBlock) ? mj0Var.f : 0.0f);
                        canvas.restore();
                    }
                } else {
                    float c3 = mj0Var.c(cellBlock);
                    if (c3 >= 1.0f) {
                        d.a(canvas, this.view, true);
                    } else if (c3 <= 0.0f || d.b == null) {
                        d.a(canvas, this.view, false);
                    } else {
                        d.a(canvas, this.view, false);
                        canvas.save();
                        canvas.translate(d.b(), d.c());
                        int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c3 * 255.0f), 31);
                        d.b.draw(canvas, this.view);
                        canvas.restoreToCount(saveLayerAlpha2);
                        canvas.restore();
                    }
                }
                i11++;
                i10 = i12;
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-this.root.padLeft, 0.0f, AndroidUtilities.dp(12.0f) + r4, this.contentHeight);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth2 = this.root.getMinWidth() + this.root.padRight;
            Rect rect2 = this.padding;
            rectF.set(r4 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, this.contentHeight);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restoreToCount(saveLayerAlpha);
        }

        private void drawTitle(Canvas canvas) {
            if (this.title == null) {
                return;
            }
            canvas.save();
            canvas.translate(titleDrawX(), 0.0f);
            this.title.draw(canvas);
            canvas.restore();
        }

        private void ensurePaints() {
            if (this.linePaint == null) {
                Paint paint = new Paint(1);
                this.linePaint = paint;
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                this.linePaint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                Paint paint2 = new Paint();
                this.halfLinePaint = paint2;
                paint2.setStyle(style);
                this.halfLinePaint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
                this.headerPaint = new Paint();
                this.stripPaint = new Paint();
            }
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.uk : org.telegram.ui.ActionBar.j6.tk);
            this.linePaint.setColor(themedColor);
            this.halfLinePaint.setColor(themedColor);
            Paint paint3 = this.headerPaint;
            RichMessageLayout richMessageLayout2 = this.root;
            paint3.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.sk : org.telegram.ui.ActionBar.j6.rk));
            this.stripPaint.setColor(167772160);
        }

        private void ensureTouchConfig() {
            View view;
            if (this.touchSlop == 0 && (view = this.view) != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                this.touchSlop = viewConfiguration.getScaledTouchSlop();
                this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            }
            if (this.scroller != null || this.view == null) {
                return;
            }
            this.scroller = new OverScroller(this.view.getContext());
        }

        private gz0 findCellChildAt(float f10, float f11) {
            float f12 = f10 + this.scrollX;
            float f13 = f11 - this.titleHeight;
            int childCount = this.tableLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                gz0 d = this.tableLayout.d(i10);
                if (d.b instanceof Text) {
                    if (f12 >= d.p && f12 < r3 + d.k) {
                        if (f13 >= d.q && f13 < r3 + d.l) {
                            return d;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveWidth(int i10) {
            int i11 = this.intrinsicTableWidth;
            int i12 = this.viewportWidth;
            Rect rect = this.padding;
            int max = Math.max(i11, Math.min(i12, Math.max(0, (i10 - rect.left) - rect.right)));
            this.resolvedTableWidth = max;
            this.tableLayout.setRenderWidth(max);
            this.contentHeight = this.tableLayout.getRenderHeight();
        }

        private int titleDrawX() {
            Text text = this.title;
            if (text == null) {
                return 0;
            }
            int i10 = this.resolvedTableWidth;
            int i11 = text.right;
            return Math.round(((i10 - (i11 - r0)) / 2.0f) - text.left);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            StaticLayout staticLayout;
            RichBlock.appendText(spannableStringBuilder, this.title, null);
            for (int i10 = 0; i10 < this.cellTexts.size(); i10++) {
                Text text = this.cellTexts.get(i10);
                if (text != null && (staticLayout = text.layout) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append(", ");
                    }
                    spannableStringBuilder.append(text.layout.getText());
                }
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void collectAnimatorBlocks(List<kj0> list) {
            if (this.cellBlocks.isEmpty()) {
                super.collectAnimatorBlocks(list);
            } else {
                list.addAll(this.cellBlocks);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            boolean z4;
            Text text;
            org.telegram.ui.Components.q5 q5Var;
            int i10;
            org.telegram.ui.Components.q5 q5Var2;
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            Text text2 = this.title;
            boolean z10 = true;
            if (text2 == null || (q5Var2 = text2.animatedEmojiStack) == null || q5Var2.a.isEmpty()) {
                z4 = false;
            } else {
                canvas.save();
                canvas.translate(titleDrawX(), 0.0f);
                Text text3 = this.title;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, text3.layout, text3.animatedEmojiStack, 0.0f, text3.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z4 = true;
            }
            canvas.translate(0.0f, this.titleHeight);
            int size = this.cellTexts.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = z4;
                    break;
                }
                org.telegram.ui.Components.q5 q5Var3 = this.cellTexts.get(i11).animatedEmojiStack;
                if (q5Var3 == null || q5Var3.a.isEmpty()) {
                    i11++;
                } else {
                    RichMessageLayout richMessageLayout = this.root;
                    float f10 = -richMessageLayout.padLeft;
                    int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
                    Rect rect2 = this.padding;
                    int saveLayerAlpha = canvas.saveLayerAlpha(f10, 0.0f, (minWidth - rect2.left) - rect2.right, this.contentHeight, 255, 31);
                    canvas.save();
                    canvas.translate(-this.scrollX, 0.0f);
                    int childCount = this.tableLayout.getChildCount();
                    int i12 = 0;
                    while (i12 < childCount) {
                        fz0 fz0Var = this.tableLayout.d(i12).b;
                        if (!(fz0Var instanceof Text) || (q5Var = (text = (Text) fz0Var).animatedEmojiStack) == null || q5Var.a.isEmpty()) {
                            i10 = i12;
                        } else {
                            canvas.save();
                            canvas.translate(r3.b(), r3.c());
                            i10 = i12;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, text.layout, text.animatedEmojiStack, 0.0f, text.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                            canvas.restore();
                        }
                        i12 = i10 + 1;
                    }
                    canvas.restore();
                    RectF rectF = AndroidUtilities.rectTmp;
                    int i13 = this.root.padLeft;
                    rectF.set(-i13, 0.0f, AndroidUtilities.dp(12.0f) + (-i13), this.contentHeight);
                    this.root.clip.b(canvas, rectF, 0, 1.0f);
                    int minWidth2 = this.root.getMinWidth() + this.root.padRight;
                    Rect rect3 = this.padding;
                    rectF.set(r3 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect3.left) - rect3.right, this.contentHeight);
                    this.root.clip.b(canvas, rectF, 2, 1.0f);
                    canvas.restoreToCount(saveLayerAlpha);
                }
            }
            canvas.restore();
            return z10;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void drawWithTyping(Canvas canvas) {
            mj0 mj0Var = this.typingAnimator;
            if (mj0Var == null || !mj0Var.h || this.cellBlocks.isEmpty() || mj0Var.d(this.cellBlocks.get(0)) < 0) {
                draw(canvas);
                return;
            }
            float c3 = mj0Var.c(this.cellBlocks.get(0));
            if (c3 <= 0.0f) {
                return;
            }
            canvas.save();
            Rect rect = this.padding;
            canvas.translate(rect.left, rect.top);
            drawTitle(canvas);
            canvas.translate(0.0f, this.titleHeight);
            drawCellsWithTyping(canvas, mj0Var, c3);
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            Text text = this.title;
            if (text != null && text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.x = (this.padding.left + titleDrawX()) - this.title.drawLeft();
                foundLink.y = i10 + this.padding.top;
                return true;
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                fz0 fz0Var = this.tableLayout.d(i11).b;
                if (fz0Var instanceof Text) {
                    if (((Text) fz0Var).fillFoundLink(characterStyle, foundLink)) {
                        foundLink.x = ((r4.b() + this.padding.left) - this.scrollX) - r5.drawLeft();
                        foundLink.y = r4.c() + i10 + this.padding.top + this.titleHeight;
                        return true;
                    }
                }
            }
            return false;
        }

        public Paint getHalfLinePaint() {
            ensurePaints();
            return this.halfLinePaint;
        }

        @Override // org.telegram.ui.Components.mz0
        public Paint getHeaderPaint() {
            ensurePaints();
            return this.headerPaint;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return AndroidUtilities.dp(10.0f) + this.padding.top + this.titleHeight + this.contentHeight + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.ui.Components.mz0
        public Paint getLinePaint() {
            ensurePaints();
            return this.linePaint;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.intrinsicTableWidth + rect.right;
        }

        @Override // org.telegram.ui.Components.mz0
        public Paint getStripPaint() {
            ensurePaints();
            return this.stripPaint;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.textsArr;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            if (this.dragging) {
                return true;
            }
            OverScroller overScroller = this.scroller;
            return (overScroller == null || overScroller.isFinished()) ? false : true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            Text text = this.title;
            if (text != null) {
                text.attach(this.view);
            }
            ArrayList<Text> arrayList = this.cellTexts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Text text2 = arrayList.get(i10);
                i10++;
                text2.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            Text text = this.title;
            if (text != null) {
                text.detach(this.view);
            }
            ArrayList<Text> arrayList = this.cellTexts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Text text2 = arrayList.get(i10);
                i10++;
                text2.detach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            drawTitle(canvas);
            canvas.save();
            canvas.translate(0.0f, this.titleHeight);
            RichMessageLayout richMessageLayout = this.root;
            float f10 = -richMessageLayout.padLeft;
            int minWidth = richMessageLayout.getMinWidth() + this.root.padRight;
            Rect rect = this.padding;
            canvas.saveLayerAlpha(f10, 0.0f, (minWidth - rect.left) - rect.right, this.contentHeight, 255, 31);
            canvas.save();
            canvas.translate(-this.scrollX, 0.0f);
            int childCount = this.tableLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.tableLayout.d(i10).a(canvas, this.view, true);
            }
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            int i11 = this.root.padLeft;
            rectF.set(-i11, 0.0f, AndroidUtilities.dp(12.0f) + (-i11), this.contentHeight);
            this.root.clip.b(canvas, rectF, 0, 1.0f);
            int minWidth2 = this.root.getMinWidth() + this.root.padRight;
            Rect rect2 = this.padding;
            rectF.set(r0 - AndroidUtilities.dp(12.0f), 0.0f, (minWidth2 - rect2.left) - rect2.right, this.contentHeight);
            this.root.clip.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            gz0 findCellChildAt;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ensureTouchConfig();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.forceFinished(true);
                }
                this.downX = motionEvent.getX();
                this.downY = motionEvent.getY();
                this.downScrollX = this.scrollX;
                this.dragging = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.velocityTracker.addMovement(motionEvent);
                this.pressedCellText = null;
                this.textHandlingTouch = false;
                if (this.title != null && motionEvent.getY() < this.titleHeight) {
                    float titleDrawX = titleDrawX();
                    motionEvent.offsetLocation(-titleDrawX, 0.0f);
                    boolean onTouchEvent = this.title.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(titleDrawX, 0.0f);
                    if (onTouchEvent) {
                        this.pressedCellText = this.title;
                        this.cellDx = titleDrawX;
                        this.cellDy = 0.0f;
                        this.textHandlingTouch = true;
                    }
                }
                if (!this.textHandlingTouch && (findCellChildAt = findCellChildAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    this.pressedCellText = (Text) findCellChildAt.b;
                    this.cellDx = findCellChildAt.b() - this.scrollX;
                    this.cellDy = findCellChildAt.c() + this.titleHeight;
                    this.pressedCellText.setSoleButtonHitBounds(findCellChildAt.p - findCellChildAt.b(), findCellChildAt.q - findCellChildAt.c(), (findCellChildAt.p + findCellChildAt.k) - findCellChildAt.b(), (findCellChildAt.q + findCellChildAt.l) - findCellChildAt.c());
                    motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
                    this.textHandlingTouch = this.pressedCellText.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(this.cellDx, this.cellDy);
                }
                return this.textHandlingTouch || this.maxScrollX > 0;
            }
            if (actionMasked == 2) {
                VelocityTracker velocityTracker3 = this.velocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.downX;
                if (!this.dragging && this.maxScrollX > 0 && Math.abs(x10) > this.touchSlop) {
                    this.dragging = true;
                    requestDisallowParentIntercept(true);
                    if (this.textHandlingTouch && this.pressedCellText != null) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-this.cellDx, -this.cellDy);
                        this.pressedCellText.onTouchEvent(obtain);
                        obtain.recycle();
                        this.textHandlingTouch = false;
                    }
                }
                if (!this.dragging) {
                    return this.textHandlingTouch;
                }
                int i10 = (int) (this.downScrollX - x10);
                int i11 = i10 >= 0 ? i10 : 0;
                int i12 = this.maxScrollX;
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i11 != this.scrollX) {
                    this.scrollX = i11;
                    placeTexts(this.layoutX, this.layoutY, this.layoutRow);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                    }
                }
                return true;
            }
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            boolean z4 = this.dragging;
            this.dragging = false;
            if (z4) {
                requestDisallowParentIntercept(false);
                if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null && this.scroller != null && this.view != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maxFlingVelocity);
                    float f10 = -this.velocityTracker.getXVelocity();
                    if (Math.abs(f10) > this.minFlingVelocity) {
                        this.scroller.fling(this.scrollX, 0, (int) f10, 0, 0, this.maxScrollX, 0, 0);
                        this.view.postOnAnimation(this.flingTick);
                    }
                }
            }
            if (!z4 && this.textHandlingTouch && this.pressedCellText != null) {
                motionEvent.offsetLocation(-this.cellDx, -this.cellDy);
                this.pressedCellText.onTouchEvent(motionEvent);
                motionEvent.offsetLocation(this.cellDx, this.cellDy);
            }
            boolean z10 = this.textHandlingTouch;
            this.textHandlingTouch = false;
            this.pressedCellText = null;
            VelocityTracker velocityTracker4 = this.velocityTracker;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.velocityTracker = null;
            }
            return z4 || z10;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            this.layoutX = i10;
            this.layoutY = i11;
            this.layoutRow = i12;
            Text text = this.title;
            if (text != null) {
                text.setX((titleDrawX() + i10) - this.title.drawLeft());
                this.title.setY(i11);
                this.title.setRow(i12);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                gz0 d = this.tableLayout.d(i13);
                fz0 fz0Var = d.b;
                if (fz0Var instanceof Text) {
                    Text text2 = (Text) fz0Var;
                    text2.setX(((d.b() + i10) - this.scrollX) - text2.drawLeft());
                    text2.setY(d.c() + this.titleHeight + i11);
                    text2.setRow(i12);
                }
            }
        }

        @Override // org.telegram.ui.Components.mz0
        public Text createTextLayout(TL_iv.pageTableCell pagetablecell, int i10) {
            if (pagetablecell == null) {
                return null;
            }
            Text text = new Text(this.root, this.root.formatText(pagetablecell.text, RichMessageLayout.setBlockFlags(0, 14)), i10, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
            text.setDrawAtOrigin(true);
            return text;
        }

        @Override // org.telegram.ui.Components.mz0
        public /* bridge */ /* synthetic */ void onLayoutChild(fz0 fz0Var, int i10, int i11) {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichTextBlock extends RichBlock {
        private final boolean centered;
        protected int contentPaddingBottom;
        protected int contentPaddingTop;
        public int quoteAuthorStart;
        public final Text text;
        public final Text[] texts;

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence) {
            this(richMessageLayout, rect, i10, charSequence, Layout.Alignment.ALIGN_NORMAL);
        }

        private int rtlOffset() {
            int i10;
            int minWidth;
            if (this.centered) {
                int minWidth2 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                i10 = (((minWidth2 + richMessageLayout.padRight) - richMessageLayout.padLeft) - this.text.getMinWidth()) / 2;
                minWidth = this.padding.left;
            } else {
                if (!this.root.isRtl()) {
                    return 0;
                }
                int minWidth3 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                i10 = (minWidth3 - rect.right) - rect.left;
                minWidth = this.text.getMinWidth();
            }
            return i10 - minWidth;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.y = i10 + this.padding.top + this.contentPaddingTop;
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getContentPaddingTop() {
            return this.contentPaddingTop;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.text.getHeight() + this.padding.top + this.contentPaddingTop + this.contentPaddingBottom + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return this.text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock, org.telegram.ui.kj0
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return this.text.getMinWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
                this.text.draw(canvas);
                canvas.restore();
            } else {
                this.text.draw(canvas);
            }
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            canvas.save();
            canvas.translate(0.0f, this.contentPaddingTop);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
                this.text.drawFade(canvas, i10, f10);
                canvas.restore();
            } else {
                this.text.drawFade(canvas, i10, f10);
            }
            canvas.restore();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int rtlOffset = rtlOffset();
            motionEvent.offsetLocation(-rtlOffset, -this.contentPaddingTop);
            boolean onTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(rtlOffset, this.contentPaddingTop);
            return onTouchEvent;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            super.placeTexts(i10, i11 + this.contentPaddingTop, i12);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((i10 + rtlOffset) - text.left);
            }
        }

        public void setContentPadding(int i10, int i11) {
            this.contentPaddingTop = i10;
            this.contentPaddingBottom = i11;
            updateListMarkerY();
        }

        public RichTextBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i10);
            this.quoteAuthorStart = -1;
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            this.texts = new Text[]{text};
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichTextBlockQuote extends RichTextBlock {
        public final TL_iv.pageBlockBlockquote block;
        private org.telegram.ui.Components.rc bounce;
        private boolean capturedByParent;
        private i20 clip;
        public int collapsedHeightToDraw;
        public float collapsedProgress;
        private boolean currentCollapsed;
        private boolean pressed;
        private boolean prevCollapsed;
        public final Drawable quoteArrow;
        private int quoteArrowColor;

        public RichTextBlockQuote(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockBlockquote pageblockblockquote, CharSequence charSequence) {
            super(richMessageLayout, rect, i10, charSequence);
            this.block = pageblockblockquote;
            this.quoteArrow = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.arrow_more).mutate();
            boolean z4 = pageblockblockquote.collapsed;
            this.currentCollapsed = z4;
            this.prevCollapsed = z4;
        }

        private void ensureBounce() {
            View view;
            if (this.bounce != null || (view = this.root.view) == null) {
                return;
            }
            this.bounce = new org.telegram.ui.Components.rc(view);
        }

        private void toggle() {
            this.root.snapshotForBlockquoteAnimation();
            this.currentCollapsed = !this.currentCollapsed;
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.blockquoteAnimating = true;
            richMessageLayout.reposition();
            View view = this.root.view;
            if (view != null) {
                view.invalidate();
            }
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            if (cell == null || delegate == null) {
                return;
            }
            delegate.I0(cell);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public float getBackgroundScale() {
            org.telegram.ui.Components.rc rcVar = this.bounce;
            if (rcVar != null) {
                return rcVar.a(0.01f);
            }
            return 1.0f;
        }

        public int getCollapsedHeight() {
            return (int) Math.min((this.text.layout.getPaint().getTextSize() * 1.4f * 3.0f) + this.padding.top + this.contentPaddingTop + this.padding.bottom, super.getHeight());
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichTextBlock, org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.currentCollapsed ? getCollapsedHeight() : super.getHeight();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichTextBlock, org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            org.telegram.ui.Components.rc rcVar = this.bounce;
            float a2 = rcVar != null ? rcVar.a(0.01f) : 1.0f;
            if (a2 != 1.0f) {
                canvas.save();
                canvas.scale(a2, a2, this.maxWidth / 2.0f, getHeight() / 2.0f);
            }
            boolean z4 = this.collapsedProgress > 0.0f;
            int i10 = (this.collapsedHeightToDraw - this.padding.bottom) - this.contentPaddingBottom;
            canvas.save();
            canvas.clipRect(0, 0, this.maxWidth, i10);
            if (z4) {
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.maxWidth, i10, null);
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
            if (z4) {
                if (this.clip == null) {
                    this.clip = new i20();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, i10 - AndroidUtilities.dp(24.0f), this.maxWidth, i10 + 1);
                this.clip.b(canvas2, rectF, 3, this.collapsedProgress);
                canvas2.restore();
            }
            canvas2.restore();
            if (this.root.quoteLine.h() != this.quoteArrowColor) {
                Drawable drawable = this.quoteArrow;
                int h = this.root.quoteLine.h();
                this.quoteArrowColor = h;
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
            }
            r.e(this.quoteArrow, this.root.getMinWidth() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f) + ((i10 - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(2.0f)), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 17);
            canvas2.save();
            canvas2.rotate(AndroidUtilities.lerp(180, 0, this.collapsedProgress), this.quoteArrow.getBounds().exactCenterX(), this.quoteArrow.getBounds().exactCenterY());
            this.quoteArrow.draw(canvas2);
            canvas2.restore();
            if (a2 != 1.0f) {
                canvas2.restore();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichTextBlock, org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.capturedByParent) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.capturedByParent = false;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (actionMasked == 0) {
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                this.capturedByParent = onTouchEvent;
                if (onTouchEvent) {
                    return true;
                }
                this.pressed = true;
                ensureBounce();
                org.telegram.ui.Components.rc rcVar = this.bounce;
                if (rcVar != null) {
                    rcVar.c(true);
                }
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    org.telegram.ui.Components.rc rcVar2 = this.bounce;
                    if (rcVar2 != null) {
                        rcVar2.c(false);
                    }
                }
                return this.pressed;
            }
            if (!this.pressed) {
                return false;
            }
            this.pressed = false;
            org.telegram.ui.Components.rc rcVar3 = this.bounce;
            if (rcVar3 != null) {
                rcVar3.c(false);
            }
            View view = this.root.view;
            if (view != null) {
                view.playSoundEffect(0);
            }
            toggle();
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void snapshot() {
            super.snapshot();
            this.prevCollapsed = this.currentCollapsed;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichTextWithAuthorBlock extends RichBlock {
        public final Text author;
        private final boolean centered;
        public final Text text;
        private final Text[] texts;

        public RichTextWithAuthorBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence, CharSequence charSequence2, Layout.Alignment alignment) {
            super(richMessageLayout, rect, i10);
            this.centered = alignment == Layout.Alignment.ALIGN_CENTER;
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth, alignment);
            this.text = text;
            Text text2 = !TextUtils.isEmpty(charSequence2) ? new Text(richMessageLayout, charSequence2, this.maxWidth, alignment) : null;
            this.author = text2;
            this.texts = text2 == null ? new Text[]{text} : new Text[]{text, text2};
        }

        private int gap() {
            if (this.author != null) {
                return AndroidUtilities.dp(2.0f);
            }
            return 0;
        }

        private int offset(Text text) {
            int i10;
            int minWidth;
            if (this.centered) {
                int minWidth2 = this.root.getMinWidth();
                RichMessageLayout richMessageLayout = this.root;
                i10 = (((minWidth2 + richMessageLayout.padRight) - richMessageLayout.padLeft) - text.getMinWidth()) / 2;
                minWidth = this.padding.left;
            } else {
                if (!this.root.isRtl()) {
                    return 0;
                }
                int minWidth3 = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
                Rect rect = this.padding;
                i10 = (minWidth3 - rect.right) - rect.left;
                minWidth = text.getMinWidth();
            }
            return i10 - minWidth;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, null, this.texts);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (this.text.fillFoundLink(characterStyle, foundLink)) {
                foundLink.x = (this.padding.left + offset(this.text)) - this.text.left;
                foundLink.y = i10 + this.padding.top;
                return true;
            }
            Text text = this.author;
            if (text == null || !text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + offset(this.author)) - this.author.left;
            foundLink.y = this.text.getHeight() + i10 + this.padding.top + gap();
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean forcesTimeToNewLine() {
            return this.centered;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            int height = this.text.getHeight() + this.padding.top + gap();
            Text text = this.author;
            return height + (text != null ? text.getHeight() : 0) + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            Text text = this.author;
            if (text == null) {
                text = this.text;
            }
            return text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock, org.telegram.ui.kj0
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return getTextWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        public int getTextWidth() {
            int minWidth = this.text.getMinWidth();
            Text text = this.author;
            return Math.max(minWidth, text != null ? text.getMinWidth() : 0);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.text.attach(this.view);
            Text text = this.author;
            if (text != null) {
                text.attach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
            Text text = this.author;
            if (text != null) {
                text.detach(this.view);
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(offset(this.text), 0.0f);
            this.text.draw(canvas);
            canvas.restore();
            if (this.author != null) {
                canvas.save();
                canvas.translate(offset(this.author), this.text.getHeight() + gap());
                this.author.draw(canvas);
                canvas.restore();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            Text text;
            int i10;
            int height = this.text.getHeight();
            float y10 = motionEvent.getY();
            int i11 = 0;
            if (y10 >= 0.0f && y10 < height) {
                text = this.text;
                i10 = offset(text);
            } else {
                if (this.author == null || y10 < gap() + height) {
                    return false;
                }
                Text text2 = this.author;
                int offset = offset(text2);
                i11 = gap() + height;
                text = text2;
                i10 = offset;
            }
            motionEvent.offsetLocation(-i10, -i11);
            boolean onTouchEvent = text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(i10, i11);
            return onTouchEvent;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            Text text = this.text;
            text.setX((offset(text) + i10) - this.text.left);
            this.text.setY(i11);
            this.text.setRow(i12);
            Text text2 = this.author;
            if (text2 != null) {
                text2.setX((i10 + offset(text2)) - this.author.left);
                this.author.setY(this.text.getHeight() + i11 + gap());
                this.author.setRow(i12);
            }
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichThinkingBlock extends RichBlock {
        public LinearGradient gradient;
        public int gradientColor;
        public final Matrix matrix;
        public final Paint paint;
        public final Text text;
        public final Text[] texts;

        public RichThinkingBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, CharSequence charSequence) {
            super(richMessageLayout, rect, i10);
            this.matrix = new Matrix();
            this.paint = new Paint(1);
            Text text = new Text(richMessageLayout, charSequence, this.maxWidth);
            this.text = text;
            this.texts = new Text[]{text};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDrawFaded$0(View view, Canvas canvas) {
            Text text = this.text;
            ih.k.g(view, false, -1, 0, text.spoilersPatchedTextLayout, 0, text.layout, text.spoilers, canvas, false);
            Text text2 = this.text;
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        }

        private int rtlOffset() {
            if (!this.root.isRtl()) {
                return 0;
            }
            int minWidth = (this.root.getMinWidth() + this.root.padRight) - AndroidUtilities.dp(14.0f);
            Rect rect = this.padding;
            return ((minWidth - rect.right) - rect.left) - this.text.getMinWidth();
        }

        private void updateGradient() {
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec);
            if (this.gradient == null || this.gradientColor != themedColor) {
                this.gradientColor = themedColor;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.maxWidth, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.l1(0.7f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.25f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.7f, themedColor)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
                this.gradient = linearGradient;
                this.paint.setShader(linearGradient);
                this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void appendAccessibilityText(SpannableStringBuilder spannableStringBuilder) {
            RichBlock.appendText(spannableStringBuilder, this.text, this.texts);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
            return false;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean findLink(CharacterStyle characterStyle, int i10, FoundLink foundLink) {
            if (!this.text.fillFoundLink(characterStyle, foundLink)) {
                return false;
            }
            foundLink.x = (this.padding.left + rtlOffset()) - this.text.left;
            foundLink.y = i10 + this.padding.top;
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return this.text.getHeight() + this.padding.top + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return this.text.getLastLineWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock, org.telegram.ui.kj0
        public Layout getLayout() {
            return this.text.layout;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            return this.text.getMinWidth() + this.padding.left + this.padding.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public org.telegram.ui.Cells.w9[] getText() {
            return this.texts;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.text.attach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.text.detach(this.view);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
                canvas.save();
                canvas.translate(rtlOffset, 0.0f);
            }
            this.text.draw(canvas);
            if (this.root.isOverlayActive()) {
                canvas.save();
                canvas.translate(-this.text.left, 0.0f);
                Text text2 = this.text;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, text2.layout, text2.animatedEmojiStack, 0.0f, text2.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas.restore();
            }
            if (rtlOffset != 0) {
                canvas.restore();
            }
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDrawFaded(Canvas canvas, int i10, float f10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), 255, 31);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((this.padding.left + rtlOffset) - text.left);
            }
            canvas.save();
            canvas.translate(rtlOffset - this.text.left, 0.0f);
            int color = this.root.textPaint.getColor();
            this.root.textPaint.setColor(-1);
            RichMessageLayout richMessageLayout = this.root;
            richMessageLayout.textPaint.linkColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
            mj0.b(canvas, this.text.layout, i10, f10, new c(5, this, this.view));
            canvas.restore();
            this.root.textPaint.setColor(color);
            updateGradient();
            this.matrix.reset();
            this.matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.maxWidth, 0.0f);
            this.gradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, this.root.getMinWidth(), getHeight(), this.paint);
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int rtlOffset = rtlOffset();
            if (rtlOffset == 0) {
                return this.text.onTouchEvent(motionEvent);
            }
            motionEvent.offsetLocation(-rtlOffset, 0.0f);
            boolean onTouchEvent = this.text.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(rtlOffset, 0.0f);
            return onTouchEvent;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void placeTexts(int i10, int i11, int i12) {
            super.placeTexts(i10, i11, i12);
            int rtlOffset = rtlOffset();
            if (rtlOffset != 0) {
                Text text = this.text;
                text.setX((i10 + rtlOffset) - text.left);
            }
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichVideoBlock extends RichMediaBlock {
        public final TL_iv.pageBlockVideo block;
        public final TLRPC.Document document;
        public final boolean isVideo;
        public final TLRPC.PhotoSize previewThumb;
        public final boolean realVideo;
        public final TLRPC.PhotoSize strippedThumb;

        public RichVideoBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockVideo pageblockvideo, boolean z4) {
            super(richMessageLayout, rect, i10, z4);
            int i11;
            int i12;
            this.block = pageblockvideo;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean isVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = isVideoDocument;
            int i13 = 0;
            this.isVideo = isVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                while (true) {
                    if (i13 >= this.document.attributes.size()) {
                        i11 = 100;
                        i12 = 100;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i12 = documentAttribute.w;
                        i11 = documentAttribute.h;
                        break;
                    }
                    i13++;
                }
                if (i12 <= 0 || i11 <= 0) {
                    TLRPC.PhotoSize photoSize = this.previewThumb;
                    i12 = photoSize != null ? photoSize.w : 100;
                    i11 = photoSize != null ? photoSize.h : 100;
                }
                r4 = i12;
            } else {
                i11 = 100;
            }
            int i14 = this.maxWidth;
            int max = (int) ((i14 / Math.max(1, r4)) * i11);
            Point point = AndroidUtilities.displaySize;
            int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
            if (max > max2) {
                i14 = (int) ((max2 / Math.max(1, i11)) * r4);
                max = max2;
            }
            this.imgWidth = i14;
            this.imgHeight = max;
            finishLayout();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public void applyImage(boolean z4) {
            TLRPC.Document document = this.document;
            if (document == null) {
                return;
            }
            TLRPC.PhotoSize photoSize = this.strippedThumb;
            ImageLocation forDocument = photoSize != null ? ImageLocation.getForDocument(photoSize, document) : null;
            TLRPC.PhotoSize photoSize2 = this.previewThumb;
            ImageLocation forDocument2 = photoSize2 != null ? ImageLocation.getForDocument(photoSize2, this.document) : null;
            if (!z4 || !this.isVideo || (!allowAutoplay() && !this.mediaForced)) {
                this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                return;
            }
            this.imageReceiver.setAllowStartAnimation(true);
            this.imageReceiver.setAutoRepeat(1);
            this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), ImageLoader.AUTOPLAY_FILTER, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean computeAutoDownload() {
            if (this.document == null) {
                return false;
            }
            if (this.isVideo) {
                return allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size);
            }
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean fileExists() {
            if (this.document == null) {
                return true;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
            File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
            return (pathToAttach != null && pathToAttach.exists()) || (pathToAttach2 != null && pathToAttach2.exists());
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public TL_iv.PageBlock getBlock() {
            return this.block;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public String getFileName() {
            return FileLoader.getAttachFileName(this.document);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean isAnimatedContent() {
            return this.isVideo;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean isRealVideo() {
            return this.realVideo;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichMediaBlock
        public boolean isSpoiler() {
            TL_iv.pageBlockVideo pageblockvideo = this.block;
            return pageblockvideo != null && pageblockvideo.spoiler;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static final class SpoilerReveal {
        private ValueAnimator animator;
        private float cx;
        private float cy;
        private float maxR;
        private final Path path = new Path();
        float progress;
        boolean revealed;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$start$0(View view, ValueAnimator valueAnimator) {
            this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (view != null) {
                view.invalidate();
            }
        }

        public void clipOut(Canvas canvas) {
            if (this.progress > 0.0f) {
                this.path.rewind();
                this.path.addCircle(this.cx, this.cy, this.maxR * this.progress, Path.Direction.CW);
                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            }
        }

        public boolean fullyRevealed() {
            return this.revealed && this.progress >= 1.0f;
        }

        public boolean isRevealing() {
            return this.revealed || this.animator != null;
        }

        public void start(final View view, float f10, float f11, float f12, float f13) {
            if (this.revealed || this.animator != null) {
                return;
            }
            this.cx = f10;
            this.cy = f11;
            this.maxR = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration((long) Utilities.clamp(this.maxR * 0.3f, 550.0f, 250.0f));
            this.animator.setInterpolator(mr.j);
            this.animator.addUpdateListener(new yh(0, this, view));
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.RichMessageLayout.SpoilerReveal.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpoilerReveal spoilerReveal = SpoilerReveal.this;
                    spoilerReveal.revealed = true;
                    spoilerReveal.animator = null;
                    View view2 = view;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                }
            });
            this.animator.start();
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class StyleSpan extends MetricAffectingSpan {
        public final int flags;
        private boolean fullSizeTableEmoji;
        public final boolean metricsOnly;
        public final RichMessageLayout root;

        public StyleSpan(RichMessageLayout richMessageLayout, int i10) {
            this(richMessageLayout, i10, false);
        }

        public void applyStyle(TextPaint textPaint) {
            Typeface typeface = getTypeface();
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            int textSize = getTextSize();
            if (TLObject.hasFlag(this.flags, 6144)) {
                textSize -= AndroidUtilities.dp(4.0f);
            }
            textPaint.setTextSize(textSize);
            if (!this.metricsOnly) {
                textPaint.setFlags(TLObject.setFlag(TLObject.setFlag(textPaint.getFlags(), 8, TLObject.hasFlag(this.flags, 64)), 16, TLObject.hasFlag(this.flags, 128)));
                if ((this.flags & 15) != 8) {
                    textPaint.setColor(getTextColor());
                }
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                textPaint.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if (TLObject.hasFlag(this.flags, 2048)) {
                textPaint.baselineShift = AndroidUtilities.dp(2.0f) + textPaint.baselineShift;
            }
        }

        public int getTextColor() {
            int i10 = this.flags & 15;
            if (i10 == 11) {
                RichMessageLayout richMessageLayout = this.root;
                return richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.cb : org.telegram.ui.ActionBar.j6.Wc);
            }
            if (i10 == 10) {
                RichMessageLayout richMessageLayout2 = this.root;
                return org.telegram.ui.ActionBar.j6.l1(0.5f, richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec));
            }
            RichMessageLayout richMessageLayout3 = this.root;
            return richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec);
        }

        public int getTextSize() {
            int i10 = this.flags & 15;
            int i11 = SharedConfig.fontSize;
            if (i10 == 14 && this.fullSizeTableEmoji) {
                return AndroidUtilities.dp(i11);
            }
            switch (i10) {
            }
            return AndroidUtilities.dp(i11);
        }

        public Typeface getTypeface() {
            int i10 = this.flags;
            int i11 = i10 & 15;
            if (i11 == 8) {
                return Typeface.MONOSPACE;
            }
            if (i11 == 11) {
                return AndroidUtilities.bold();
            }
            boolean z4 = true;
            if (i11 >= 1 && i11 <= 6) {
                return TLObject.hasFlag(i10, 32) ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
            }
            if (TLObject.hasFlag(i10, 256)) {
                return Typeface.MONOSPACE;
            }
            boolean hasFlag = TLObject.hasFlag(this.flags, 16);
            if (!TLObject.hasFlag(this.flags, 32) && i11 != 12) {
                z4 = false;
            }
            if (hasFlag && z4) {
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            }
            if (hasFlag) {
                return AndroidUtilities.bold();
            }
            if (z4) {
                return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
            }
            return null;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            applyStyle(textPaint);
        }

        public StyleSpan(RichMessageLayout richMessageLayout, int i10, boolean z4) {
            this.root = richMessageLayout;
            this.flags = i10;
            this.metricsOnly = z4;
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class Text implements org.telegram.ui.Cells.w9, fz0 {
        private static final int EMOJI_LINE_HEIGHT_MIN_PERCENT = 70;
        private static Paint markPaint;
        public org.telegram.ui.Components.q5 animatedEmojiStack;
        public int blockX;
        public int blockY;
        public boolean doNotInvalidateEmojiInParent;
        private boolean drawAtOrigin;
        private int emojiOnlyCount;
        public int lastLineRight;
        public final StaticLayout layout;
        public int left;
        public c90 linkCollector;
        private boolean longPressFired;
        private Runnable longPressRunnable;
        public y80 markPath;
        private RichButtonSpan pressedButtonSpan;
        private org.telegram.ui.Components.u5 pressedEmoji;
        private CharacterStyle pressedLink;
        private g90 pressedLinkDrawable;
        private int pressedLinkEnd;
        private int pressedLinkStart;
        private ih.k pressedSpoiler;
        public int right;
        public final RichMessageLayout root;
        public int row;
        private final RectF soleButtonHitBounds;
        public final List<ih.k> spoilers;
        public final AtomicReference<Layout> spoilersPatchedTextLayout;
        public final Stack<ih.k> spoilersPool;
        private j90 translationLoadingDrawable;
        private y80 translationLoadingPath;
        public View view;
        public int x;
        public int y;

        /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
        public static class EmojiLineMetrics {
            private int contentCount;
            private int emojiCount;
            private int emojiSide;

            private EmojiLineMetrics() {
            }

            public static /* synthetic */ int access$1408(EmojiLineMetrics emojiLineMetrics) {
                int i10 = emojiLineMetrics.emojiCount;
                emojiLineMetrics.emojiCount = i10 + 1;
                return i10;
            }

            public static /* synthetic */ int access$1412(EmojiLineMetrics emojiLineMetrics, int i10) {
                int i11 = emojiLineMetrics.emojiCount + i10;
                emojiLineMetrics.emojiCount = i11;
                return i11;
            }

            public static /* synthetic */ int access$1508(EmojiLineMetrics emojiLineMetrics) {
                int i10 = emojiLineMetrics.contentCount;
                emojiLineMetrics.contentCount = i10 + 1;
                return i10;
            }

            public static /* synthetic */ int access$1512(EmojiLineMetrics emojiLineMetrics, int i10) {
                int i11 = emojiLineMetrics.contentCount + i10;
                emojiLineMetrics.contentCount = i11;
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean allowsEmojiLineHeight() {
                int i10 = this.contentCount;
                return i10 > 0 && ((long) this.emojiCount) * 100 >= ((long) i10) * 70;
            }
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10) {
            this(richMessageLayout, charSequence, i10, Layout.Alignment.ALIGN_NORMAL);
        }

        private static void allowEmojiLineHeight(Spanned spanned, int i10, int i11, int i12) {
            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.u5.class)) {
                int spanStart = spanned.getSpanStart(u5Var);
                if (spanStart >= i10 && spanStart < i11) {
                    u5Var.setMinimumLineHeight(i12);
                }
            }
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(i10, i11, Emoji.EmojiSpan.class)) {
                int spanStart2 = spanned.getSpanStart(emojiSpan);
                if (spanStart2 >= i10 && spanStart2 < i11) {
                    emojiSpan.setMinimumLineHeight(i12);
                }
            }
            for (RichButtonSpan richButtonSpan : (RichButtonSpan[]) spanned.getSpans(i10, i11, RichButtonSpan.class)) {
                int spanStart3 = spanned.getSpanStart(richButtonSpan);
                if (richButtonSpan.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                    richButtonSpan.minimumLineHeight = i12;
                }
            }
        }

        private boolean buttonContains(RichButtonSpan richButtonSpan, float f10, float f11) {
            if (richButtonSpan.contains(f10, f11, AndroidUtilities.dp(8.0f))) {
                return true;
            }
            return richButtonSpan == getSoleButtonSpan() && this.soleButtonHitBounds.contains(f10, f11);
        }

        private void cancelLongPress() {
            Runnable runnable = this.longPressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longPressRunnable = null;
            }
        }

        private static CharSequence configureEmojiLineHeights(CharSequence charSequence, TextPaint textPaint) {
            if (!(charSequence instanceof Spanned)) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class)) {
                u5Var.setPreserveFontMetrics(true);
            }
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.setPreserveFontMetrics(true);
            }
            for (RichButtonSpan richButtonSpan : (RichButtonSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), RichButtonSpan.class)) {
                if (richButtonSpan.getButton().text.getEmojiOnlyCount() > 0) {
                    richButtonSpan.preserveFontMetrics = true;
                }
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i10);
                boolean z4 = indexOf >= 0;
                if (!z4) {
                    indexOf = spannableStringBuilder.length();
                }
                EmojiLineMetrics measureEmojiLine = measureEmojiLine(spannableStringBuilder, i10, indexOf, textPaint);
                if (measureEmojiLine.allowsEmojiLineHeight() && measureEmojiLine.emojiSide > 0) {
                    allowEmojiLineHeight(spannableStringBuilder, i10, indexOf, measureEmojiLine.emojiSide);
                }
                if (!z4) {
                    break;
                }
                i10 = indexOf + 1;
            }
            return spannableStringBuilder;
        }

        private void dispatchLinkClick(CharacterStyle characterStyle, boolean z4) {
            View view;
            String url;
            if (characterStyle == null) {
                return;
            }
            if (!z4 && (characterStyle instanceof URLSpan) && (url = ((URLSpan) characterStyle).getURL()) != null && url.startsWith("#") && this.root.handleAnchorClick(url)) {
                View view2 = this.view;
                if (view2 != null) {
                    view2.playSoundEffect(0);
                    return;
                }
                return;
            }
            CharacterStyle l51Var = ((characterStyle instanceof StyleSpan) && TLObject.hasFlag(((StyleSpan) characterStyle).flags, 256)) ? new l51(this.layout.getText(), this.pressedLinkStart, this.pressedLinkEnd, this.root.isOut() ? (byte) 1 : (byte) 0, null) : characterStyle;
            org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
            org.telegram.ui.Cells.s1 cell = this.root.getCell();
            if (delegate != null && cell != null) {
                View view3 = this.view;
                if (view3 != null && !z4) {
                    view3.playSoundEffect(0);
                }
                delegate.b1(cell, l51Var, z4);
                return;
            }
            if (z4 || (view = this.view) == null || !(characterStyle instanceof ClickableSpan)) {
                return;
            }
            view.playSoundEffect(0);
            ((ClickableSpan) characterStyle).onClick(this.view);
        }

        private void drawTranslationLoading(Canvas canvas) {
            RichMessageLayout richMessageLayout = this.root;
            float f10 = richMessageLayout.translationLoadingValue;
            if (f10 <= 0.0f) {
                return;
            }
            boolean isTranslating = richMessageLayout.isTranslating();
            if (this.translationLoadingDrawable == null) {
                j90 j90Var = new j90();
                this.translationLoadingDrawable = j90Var;
                j90Var.C = true;
                y80 y80Var = new y80(0);
                this.translationLoadingPath = y80Var;
                y80Var.c = true;
                j90 j90Var2 = this.translationLoadingDrawable;
                j90Var2.x = y80Var;
                j90Var2.j(5.0f);
                this.translationLoadingDrawable.b = -1L;
                this.translationLoadingPath.reset();
                this.translationLoadingPath.d(this.layout, 0, 0.0f);
                this.translationLoadingPath.n = false;
                StaticLayout staticLayout = this.layout;
                staticLayout.getSelectionPath(0, staticLayout.getText().length(), this.translationLoadingPath);
                y80 y80Var2 = this.translationLoadingPath;
                y80Var2.n = true;
                y80Var2.a();
                this.translationLoadingDrawable.k();
            }
            if (isTranslating && (this.translationLoadingDrawable.c() || this.translationLoadingDrawable.b())) {
                j90 j90Var3 = this.translationLoadingDrawable;
                j90Var3.b = -1L;
                j90Var3.c = -1L;
            } else if (!isTranslating && !this.translationLoadingDrawable.c() && !this.translationLoadingDrawable.b()) {
                this.translationLoadingDrawable.a();
            }
            RichMessageLayout richMessageLayout2 = this.root;
            int themedColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
            this.translationLoadingDrawable.f(org.telegram.ui.ActionBar.j6.l1(0.05f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.3f, themedColor));
            this.translationLoadingDrawable.setAlpha((int) (f10 * 255.0f));
            this.translationLoadingDrawable.draw(canvas);
        }

        private RichButtonSpan[] getButtonSpans() {
            if (!(this.layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            return (RichButtonSpan[]) spanned.getSpans(0, spanned.length(), RichButtonSpan.class);
        }

        private RichButtonSpan getSoleButtonSpan() {
            if (!(this.layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            RichButtonSpan[] richButtonSpanArr = (RichButtonSpan[]) spanned.getSpans(0, spanned.length(), RichButtonSpan.class);
            if (richButtonSpanArr.length != 1) {
                return null;
            }
            int spanStart = spanned.getSpanStart(richButtonSpanArr[0]);
            int spanEnd = spanned.getSpanEnd(richButtonSpanArr[0]);
            for (int i10 = 0; i10 < spanned.length(); i10++) {
                if ((i10 < spanStart || i10 >= spanEnd) && !Character.isWhitespace(spanned.charAt(i10))) {
                    return null;
                }
            }
            return richButtonSpanArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drawFade$1(View view, int i10, Canvas canvas) {
            ih.k.g(view, false, i10, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            cw0.a(canvas, this.layout);
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(Spanned spanned, RichButtonSpan richButtonSpan, RichButtonSpan richButtonSpan2) {
            return spanned.getSpanStart(richButtonSpan2) - spanned.getSpanStart(richButtonSpan);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$revealSpoilers$3(RichMessageLayout richMessageLayout, View view) {
            if (richMessageLayout != null) {
                MessageObject messageObject = richMessageLayout.messageObject;
                if (messageObject != null) {
                    messageObject.isSpoilersRevealed = true;
                }
                ArrayList<org.telegram.ui.Cells.w9> arrayList = richMessageLayout.textBlocks;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    org.telegram.ui.Cells.w9 w9Var = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.Cells.w9 w9Var2 = w9Var;
                    if (w9Var2 instanceof Text) {
                        ((Text) w9Var2).spoilers.clear();
                    }
                }
            } else {
                this.spoilers.clear();
            }
            view.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$revealSpoilers$4(View view, RichMessageLayout richMessageLayout) {
            if (view == null) {
                return;
            }
            view.post(new ai(this, richMessageLayout, view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$scheduleLongPress$2() {
            this.longPressRunnable = null;
            if (this.pressedButtonSpan != null) {
                this.longPressFired = true;
                View view = this.view;
                if (view != null) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                this.pressedButtonSpan.didPress(this.root.getCell(), this.root.getDelegate(), true);
                return;
            }
            if (this.pressedLink == null) {
                return;
            }
            this.longPressFired = true;
            View view2 = this.view;
            if (view2 != null) {
                try {
                    view2.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
            }
            dispatchLinkClick(this.pressedLink, true);
            c90 c90Var = this.linkCollector;
            if (c90Var != null) {
                c90Var.d(true);
            }
            this.pressedLinkDrawable = null;
        }

        private static EmojiLineMetrics measureEmojiLine(Spanned spanned, int i10, int i11, TextPaint textPaint) {
            RichButtonSpan[] richButtonSpanArr;
            int i12;
            EmojiLineMetrics emojiLineMetrics = new EmojiLineMetrics();
            int i13 = i11 - i10;
            if (i13 > 0) {
                org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(i10, i11, org.telegram.ui.Components.u5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(i10, i11, Emoji.EmojiSpan.class);
                int[] iArr = (u5VarArr.length == 0 && emojiSpanArr.length == 0) ? null : new int[i13];
                int length = u5VarArr.length;
                int i14 = 0;
                while (i14 < length) {
                    int i15 = i14;
                    org.telegram.ui.Components.u5 u5Var = u5VarArr[i15];
                    int spanStart = spanned.getSpanStart(u5Var);
                    int min = Math.min(i11, spanned.getSpanEnd(u5Var));
                    if (spanStart < i10 || spanStart >= i11 || min <= spanStart) {
                        i12 = i15;
                    } else {
                        int i16 = spanStart - i10;
                        iArr[i16] = Math.max(iArr[i16], min);
                        i12 = i15;
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, u5Var.getSize(textPaint, spanned, spanStart, min, null) + 1);
                    }
                    i14 = i12 + 1;
                }
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart2 = spanned.getSpanStart(emojiSpan);
                    int min2 = Math.min(i11, spanned.getSpanEnd(emojiSpan));
                    if (spanStart2 >= i10 && spanStart2 < i11 && min2 > spanStart2) {
                        int i17 = spanStart2 - i10;
                        iArr[i17] = Math.max(iArr[i17], min2);
                        emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, emojiSpan.getSize(textPaint, spanned, spanStart2, min2, null));
                    }
                }
                RichButtonSpan[] richButtonSpanArr2 = (RichButtonSpan[]) spanned.getSpans(i10, i11, RichButtonSpan.class);
                if (richButtonSpanArr2.length > 0) {
                    richButtonSpanArr = null;
                    for (RichButtonSpan richButtonSpan : richButtonSpanArr2) {
                        int spanStart3 = spanned.getSpanStart(richButtonSpan);
                        if (richButtonSpan.button.text.getEmojiOnlyCount() > 0 && spanStart3 >= i10 && spanStart3 < i11) {
                            if (richButtonSpanArr == null) {
                                richButtonSpanArr = new RichButtonSpan[i13];
                            }
                            richButtonSpanArr[spanStart3 - i10] = richButtonSpan;
                        }
                    }
                } else {
                    richButtonSpanArr = null;
                }
                if (iArr != null || richButtonSpanArr != null) {
                    int i18 = i10;
                    while (i18 < i11) {
                        int i19 = i18 - i10;
                        RichButtonSpan richButtonSpan2 = richButtonSpanArr == null ? null : richButtonSpanArr[i19];
                        if (richButtonSpan2 == null || !(richButtonSpan2.button.text.layout.getText() instanceof Spanned)) {
                            int i20 = iArr == null ? 0 : iArr[i19];
                            if (i20 > i18) {
                                EmojiLineMetrics.access$1408(emojiLineMetrics);
                                EmojiLineMetrics.access$1508(emojiLineMetrics);
                                i18 = i20;
                            } else {
                                int codePointAt = Character.codePointAt(spanned, i18);
                                if (!Character.isWhitespace(codePointAt)) {
                                    EmojiLineMetrics.access$1508(emojiLineMetrics);
                                }
                                i18 += Character.charCount(codePointAt);
                            }
                        } else {
                            Spanned spanned2 = (Spanned) richButtonSpan2.button.text.layout.getText();
                            EmojiLineMetrics measureEmojiLine = measureEmojiLine(spanned2, 0, spanned2.length(), richButtonSpan2.button.text.layout.getPaint());
                            EmojiLineMetrics.access$1412(emojiLineMetrics, measureEmojiLine.emojiCount);
                            EmojiLineMetrics.access$1512(emojiLineMetrics, Math.max(1, measureEmojiLine.contentCount));
                            emojiLineMetrics.emojiSide = Math.max(emojiLineMetrics.emojiSide, measureEmojiLine.emojiSide);
                            i18 = Math.min(i11, spanned.getSpanEnd(richButtonSpan2));
                        }
                    }
                }
            }
            return emojiLineMetrics;
        }

        private void revealSpoilers(int i10, int i11) {
            if (this.pressedSpoiler == null) {
                return;
            }
            float width = this.layout.getWidth();
            float height = this.layout.getHeight();
            float sqrt = (float) Math.sqrt((height * height) + (width * width));
            View view = this.view;
            this.pressedSpoiler.q = new ai(this, view, this.root);
            Iterator<ih.k> it = this.spoilers.iterator();
            while (it.hasNext()) {
                it.next().j(i10, i11, sqrt, false);
            }
            if (view != null) {
                view.playSoundEffect(0);
            }
        }

        private void scheduleLongPress() {
            cancelLongPress();
            xg xgVar = new xg(this, 10);
            this.longPressRunnable = xgVar;
            AndroidUtilities.runOnUIThread(xgVar, ViewConfiguration.getLongPressTimeout());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSoleButtonHitBounds(float f10, float f11, float f12, float f13) {
            this.soleButtonHitBounds.set(f10, f11, f12, f13);
        }

        @Override // org.telegram.ui.Components.fz0
        public void attach(View view) {
            View view2 = this.view;
            if (view == view2) {
                return;
            }
            if (view2 != null) {
                detach(view2);
            }
            this.view = view;
            onAttachedToWindow();
        }

        @Override // org.telegram.ui.Components.fz0
        public void detach(View view) {
            View view2 = this.view;
            if (view2 == view && view2 != null) {
                this.view = null;
                onDetachedFromWindow();
            }
        }

        public void draw(Canvas canvas) {
            draw(canvas, this.view);
        }

        public void drawFade(Canvas canvas, int i10, float f10) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            final int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
            final View view = this.view;
            mj0.b(canvas, this.layout, i10, f10, new lj0() { // from class: org.telegram.messenger.zh
                @Override // org.telegram.ui.lj0
                public final void a(Canvas canvas2) {
                    RichMessageLayout.Text.this.lambda$drawFade$1(view, themedColor, canvas2);
                }
            });
            canvas.restore();
        }

        public int drawLeft() {
            if (this.drawAtOrigin) {
                return 0;
            }
            return this.left;
        }

        public boolean fillFoundLink(CharacterStyle characterStyle, FoundLink foundLink) {
            if (!(this.layout.getText() instanceof Spanned)) {
                return false;
            }
            Spanned spanned = (Spanned) this.layout.getText();
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            if (spanStart < 0 || spanEnd <= spanStart) {
                return false;
            }
            StaticLayout staticLayout = this.layout;
            foundLink.layout = staticLayout;
            foundLink.start = spanStart;
            foundLink.end = spanEnd;
            foundLink.originalWidth = staticLayout.getWidth();
            return true;
        }

        public int getBaseline() {
            StaticLayout staticLayout = this.layout;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                return -1;
            }
            return this.layout.getLineBaseline(0);
        }

        @Override // org.telegram.ui.Components.fz0
        public int getEmojiOnlyCount() {
            return this.emojiOnlyCount;
        }

        public int getHeight() {
            return this.layout.getHeight();
        }

        public int getLastLineWidth() {
            return Math.max(0, this.lastLineRight - this.left);
        }

        @Override // org.telegram.ui.Cells.w9
        public Layout getLayout() {
            return this.layout;
        }

        public int getMinWidth() {
            return Math.max(0, this.right - this.left);
        }

        @Override // org.telegram.ui.Cells.w9
        public /* bridge */ /* synthetic */ CharSequence getPrefix() {
            return null;
        }

        @Override // org.telegram.ui.Cells.w9
        public int getRow() {
            return this.row;
        }

        @Override // org.telegram.ui.Cells.w9
        public /* bridge */ /* synthetic */ Rect getSelectionBounds() {
            return null;
        }

        @Override // org.telegram.ui.Cells.w9
        public CharSequence getText() {
            if (getLayout() == null) {
                return null;
            }
            return getLayout().getText();
        }

        @Override // org.telegram.ui.Cells.w9
        public int getX() {
            return this.blockX + this.x;
        }

        @Override // org.telegram.ui.Cells.w9
        public int getY() {
            return this.blockY + this.y;
        }

        public boolean isAttached() {
            return this.view != null;
        }

        public boolean isPressingLink() {
            return (this.pressedLink == null && this.pressedButtonSpan == null) ? false : true;
        }

        public Text offset(int i10, int i11) {
            this.x += i10;
            this.y += i11;
            return this;
        }

        public void onAttachedToWindow() {
            this.animatedEmojiStack = org.telegram.ui.Components.u5.update(0, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, this.animatedEmojiStack, this.layout);
            c90 c90Var = this.linkCollector;
            if (c90Var != null) {
                c90Var.a = this.view;
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.attach(this.view);
                }
            }
        }

        public void onDetachedFromWindow() {
            org.telegram.ui.Components.u5.release(this.view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            c90 c90Var = this.linkCollector;
            if (c90Var != null) {
                c90Var.a = null;
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan : buttonSpans) {
                    richButtonSpan.detach(this.view);
                }
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            StyleSpan styleSpan;
            boolean z4;
            int i10;
            StyleSpan styleSpan2;
            StyleSpan styleSpan3;
            int spanStart;
            int actionMasked = motionEvent.getActionMasked();
            int drawLeft = drawLeft() + ((int) motionEvent.getX());
            int y10 = (int) motionEvent.getY();
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    RichButtonSpan richButtonSpan = this.pressedButtonSpan;
                    if (richButtonSpan != null) {
                        if (!buttonContains(richButtonSpan, drawLeft, y10)) {
                            cancelLongPress();
                            this.pressedButtonSpan.setPressed(false);
                            this.pressedButtonSpan = null;
                            this.longPressFired = false;
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                if (actionMasked == 1) {
                    if (this.pressedButtonSpan != null) {
                        cancelLongPress();
                        RichButtonSpan richButtonSpan2 = this.pressedButtonSpan;
                        this.pressedButtonSpan = null;
                        richButtonSpan2.setPressed(false);
                        if (!this.longPressFired) {
                            View view = this.view;
                            if (view != null) {
                                view.playSoundEffect(0);
                            }
                            richButtonSpan2.didPress(this.root.getCell(), this.root.getDelegate(), false);
                        }
                        this.longPressFired = false;
                        return true;
                    }
                    if (this.pressedSpoiler != null) {
                        revealSpoilers(drawLeft, y10);
                        this.pressedSpoiler = null;
                        return true;
                    }
                    if (this.pressedLink != null) {
                        cancelLongPress();
                        if (!this.longPressFired) {
                            dispatchLinkClick(this.pressedLink, false);
                        }
                        c90 c90Var = this.linkCollector;
                        if (c90Var != null) {
                            c90Var.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                        return true;
                    }
                    org.telegram.ui.Components.u5 u5Var = this.pressedEmoji;
                    if (u5Var != null) {
                        this.pressedEmoji = null;
                        org.telegram.ui.Cells.s1 cell = this.root.getCell();
                        org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
                        if (cell != null && delegate != null) {
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.playSoundEffect(0);
                            }
                            delegate.t0(u5Var);
                            return true;
                        }
                        return true;
                    }
                } else if (actionMasked == 3) {
                    this.pressedSpoiler = null;
                    this.pressedEmoji = null;
                    if (this.pressedButtonSpan != null) {
                        cancelLongPress();
                        this.pressedButtonSpan.setPressed(false);
                        this.pressedButtonSpan = null;
                        this.longPressFired = false;
                    }
                    if (this.pressedLink != null) {
                        cancelLongPress();
                        c90 c90Var2 = this.linkCollector;
                        if (c90Var2 != null) {
                            c90Var2.d(true);
                        }
                        this.pressedLink = null;
                        this.pressedLinkDrawable = null;
                        this.longPressFired = false;
                    }
                }
                return false;
            }
            this.pressedSpoiler = null;
            this.pressedLink = null;
            this.pressedEmoji = null;
            this.pressedButtonSpan = null;
            for (ih.k kVar : this.spoilers) {
                if (kVar.getBounds().contains(drawLeft, y10)) {
                    this.pressedSpoiler = kVar;
                    return true;
                }
            }
            RichButtonSpan[] buttonSpans = getButtonSpans();
            if (buttonSpans != null) {
                for (RichButtonSpan richButtonSpan3 : buttonSpans) {
                    if (buttonContains(richButtonSpan3, drawLeft, y10)) {
                        if (!richButtonSpan3.isDisabled()) {
                            this.pressedButtonSpan = richButtonSpan3;
                            this.longPressFired = false;
                            richButtonSpan3.setPressed(true);
                            View view3 = this.view;
                            if (view3 != null) {
                                view3.invalidate();
                            }
                            scheduleLongPress();
                            return true;
                        }
                        return true;
                    }
                }
            }
            if ((this.layout.getText() instanceof Spannable) && y10 >= 0 && y10 < this.layout.getHeight()) {
                int lineForVertical = this.layout.getLineForVertical(y10);
                float lineLeft = this.layout.getLineLeft(lineForVertical);
                float lineWidth = this.layout.getLineWidth(lineForVertical) + lineLeft;
                float f10 = drawLeft;
                if (f10 >= lineLeft && f10 <= lineWidth) {
                    int offsetForHorizontal = this.layout.getOffsetForHorizontal(lineForVertical, f10);
                    Spannable spannable = (Spannable) this.layout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.pressedLink = clickableSpan;
                        this.pressedLinkStart = spannable.getSpanStart(clickableSpan);
                        this.pressedLinkEnd = spannable.getSpanEnd(this.pressedLink);
                        this.longPressFired = false;
                        g90 g90Var = new g90(this.pressedLink, this.root.resourcesProvider, f10, y10, 0);
                        y80 b10 = g90Var.b();
                        b10.d(this.layout, this.pressedLinkStart, 0.0f);
                        this.layout.getSelectionPath(this.pressedLinkStart, this.pressedLinkEnd, b10);
                        this.pressedLinkDrawable = g90Var;
                        if (this.linkCollector == null) {
                            this.linkCollector = new c90(this.view);
                        }
                        this.linkCollector.a(g90Var, null);
                        View view4 = this.view;
                        if (view4 != null) {
                            view4.invalidate();
                        }
                        scheduleLongPress();
                        return true;
                    }
                    StyleSpan[] styleSpanArr = (StyleSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, StyleSpan.class);
                    if (styleSpanArr != null) {
                        int length = styleSpanArr.length;
                        for (int i11 = 0; i11 < length; i11++) {
                            styleSpan = styleSpanArr[i11];
                            if (TLObject.hasFlag(styleSpan.flags, 256)) {
                                break;
                            }
                        }
                    }
                    styleSpan = null;
                    if (styleSpan != null) {
                        int spanStart2 = spannable.getSpanStart(styleSpan);
                        int spanEnd = spannable.getSpanEnd(styleSpan);
                        while (true) {
                            if (spanStart2 <= 0) {
                                z4 = true;
                                break;
                            }
                            int i12 = spanStart2 - 1;
                            StyleSpan[] styleSpanArr2 = (StyleSpan[]) spannable.getSpans(i12, i12, StyleSpan.class);
                            int length2 = styleSpanArr2.length;
                            int i13 = 0;
                            while (true) {
                                z4 = true;
                                if (i13 >= length2) {
                                    styleSpan3 = null;
                                    break;
                                }
                                styleSpan3 = styleSpanArr2[i13];
                                if (TLObject.hasFlag(styleSpan3.flags, 256)) {
                                    break;
                                }
                                i13++;
                            }
                            if (styleSpan3 == null || (spanStart = spannable.getSpanStart(styleSpan3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                        }
                        do {
                            i10 = spanEnd;
                            if (i10 >= spannable.length()) {
                                break;
                            }
                            StyleSpan[] styleSpanArr3 = (StyleSpan[]) spannable.getSpans(i10, i10, StyleSpan.class);
                            int length3 = styleSpanArr3.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    styleSpan2 = null;
                                    break;
                                }
                                styleSpan2 = styleSpanArr3[i14];
                                if (TLObject.hasFlag(styleSpan2.flags, 256)) {
                                    break;
                                }
                                i14++;
                            }
                            if (styleSpan2 == null) {
                                break;
                            }
                            spanEnd = spannable.getSpanEnd(styleSpan2);
                        } while (spanEnd > i10);
                        this.pressedLink = styleSpan;
                        this.pressedLinkStart = spanStart2;
                        this.pressedLinkEnd = i10;
                        this.longPressFired = false;
                        g90 g90Var2 = new g90(styleSpan, this.root.resourcesProvider, f10, y10, 0);
                        y80 b11 = g90Var2.b();
                        b11.d(this.layout, spanStart2, 0.0f);
                        this.layout.getSelectionPath(spanStart2, i10, b11);
                        this.pressedLinkDrawable = g90Var2;
                        if (this.linkCollector == null) {
                            this.linkCollector = new c90(this.view);
                        }
                        this.linkCollector.a(g90Var2, null);
                        View view5 = this.view;
                        if (view5 != null) {
                            view5.invalidate();
                        }
                        scheduleLongPress();
                        return z4;
                    }
                    org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.u5.class);
                    if (u5VarArr != null && u5VarArr.length > 0) {
                        this.pressedEmoji = u5VarArr[0];
                        return true;
                    }
                }
            }
            return false;
        }

        public void refreshAnimatedEmoji(int i10) {
            View view = this.view;
            if (view == null) {
                return;
            }
            org.telegram.ui.Components.u5.release(view, this.animatedEmojiStack);
            this.animatedEmojiStack = null;
            this.animatedEmojiStack = org.telegram.ui.Components.u5.update(i10, this.view, this.root.invalidateAnimatedEmojiInParent && !this.doNotInvalidateEmojiInParent, (org.telegram.ui.Components.q5) null, this.layout);
        }

        public void setBlockX(int i10) {
            this.blockX = i10;
        }

        public void setBlockY(int i10) {
            this.blockY = i10;
        }

        public void setDrawAtOrigin(boolean z4) {
            this.drawAtOrigin = z4;
        }

        @Override // org.telegram.ui.Components.fz0
        public void setRow(int i10) {
            this.row = i10;
        }

        @Override // org.telegram.ui.Components.fz0
        public void setX(int i10) {
            this.x = i10;
        }

        @Override // org.telegram.ui.Components.fz0
        public void setY(int i10) {
            this.y = i10;
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10, Layout.Alignment alignment) {
            this(richMessageLayout, charSequence, i10, alignment, 1.0f);
        }

        @Override // org.telegram.ui.Components.fz0
        public void draw(Canvas canvas, View view) {
            canvas.save();
            canvas.translate(-drawLeft(), 0.0f);
            RichMessageLayout richMessageLayout = this.root;
            int themedColor = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec);
            this.root.textPaint.setColor(themedColor);
            RichMessageLayout richMessageLayout2 = this.root;
            richMessageLayout2.textPaint.linkColor = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
            if (this.markPath != null) {
                if (markPaint == null) {
                    Paint paint = new Paint(1);
                    markPaint = paint;
                    paint.setPathEffect(y80.c());
                }
                markPaint.setColor((this.root.quoteLine.h() & 16777215) | 855638016);
                canvas.drawPath(this.markPath, markPaint);
            }
            View view2 = view != null ? view : this.view;
            c90 c90Var = this.linkCollector;
            if (c90Var != null && c90Var.f(canvas) && view2 != null) {
                view2.invalidate();
            }
            ih.k.g(view2, false, themedColor, 0, this.spoilersPatchedTextLayout, 0, this.layout, this.spoilers, canvas, false);
            cw0.a(canvas, this.layout);
            if (!this.root.isOverlayActive()) {
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            }
            drawTranslationLoading(canvas);
            canvas.restore();
        }

        public Text(RichMessageLayout richMessageLayout, CharSequence charSequence, int i10, Layout.Alignment alignment, float f10) {
            boolean z4;
            int dp;
            int i11;
            this.spoilers = new ArrayList();
            this.spoilersPool = new Stack<>();
            this.spoilersPatchedTextLayout = new AtomicReference<>();
            this.soleButtonHitBounds = new RectF();
            this.root = richMessageLayout;
            Paint.FontMetricsInt fontMetricsInt = richMessageLayout.textPaint.getFontMetricsInt();
            if (charSequence instanceof Spanned) {
                for (StyleSpan styleSpan : (StyleSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), StyleSpan.class)) {
                    int i12 = styleSpan.flags & 15;
                    if (i12 >= 1 && i12 <= 6) {
                        TextPaint textPaint = new TextPaint(richMessageLayout.textPaint);
                        styleSpan.applyStyle(textPaint);
                        fontMetricsInt = textPaint.getFontMetricsInt();
                        z4 = true;
                        break;
                    }
                }
            }
            z4 = false;
            CharSequence configureEmojiLineHeights = configureEmojiLineHeights(Emoji.replaceEmoji(charSequence, fontMetricsInt, false, z4 ? 0.85f : 1.0f), richMessageLayout.textPaint);
            int d = vh.y5.d(configureEmojiLineHeights);
            this.emojiOnlyCount = d;
            if (d == 0 && (configureEmojiLineHeights instanceof Spanned)) {
                Spanned spanned = (Spanned) configureEmojiLineHeights;
                RichButtonSpan[] richButtonSpanArr = (RichButtonSpan[]) spanned.getSpans(0, configureEmojiLineHeights.length(), RichButtonSpan.class);
                if (richButtonSpanArr.length > 0) {
                    Arrays.sort(richButtonSpanArr, new xh(spanned, 1));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(configureEmojiLineHeights);
                    int length = richButtonSpanArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            RichButtonSpan richButtonSpan = richButtonSpanArr[i13];
                            int spanStart = spanned.getSpanStart(richButtonSpan);
                            int spanEnd = spanned.getSpanEnd(richButtonSpan);
                            if (spanStart < 0 || spanEnd <= spanStart || richButtonSpan.getButton().text.getEmojiOnlyCount() == 0) {
                                break;
                            }
                            spannableStringBuilder.replace(spanStart, spanEnd, richButtonSpan.getButton().text.layout.getText());
                            i13++;
                        } else {
                            this.emojiOnlyCount = vh.y5.d(spannableStringBuilder);
                            break;
                        }
                    }
                }
            }
            if (this.emojiOnlyCount > 0 && (configureEmojiLineHeights instanceof Spanned)) {
                for (StyleSpan styleSpan2 : (StyleSpan[]) ((Spanned) configureEmojiLineHeights).getSpans(0, configureEmojiLineHeights.length(), StyleSpan.class)) {
                    if ((styleSpan2.flags & 15) == 14) {
                        styleSpan2.fullSizeTableEmoji = true;
                    }
                }
            }
            if (configureEmojiLineHeights instanceof Spanned) {
                StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) configureEmojiLineHeights).getSpans(0, configureEmojiLineHeights.length(), StyleSpan.class);
                int length2 = styleSpanArr.length;
                for (int i14 = 0; i14 < length2 && (styleSpanArr[i14].flags & 15) == 0; i14++) {
                }
            }
            this.layout = MessageObject.makeStaticLayout(configureEmojiLineHeights, richMessageLayout.textPaint, i10, f10, 0.0f, false, alignment);
            this.left = i10;
            this.right = 0;
            for (int i15 = 0; i15 < this.layout.getLineCount(); i15++) {
                this.left = Math.min(this.left, (int) Math.floor(this.layout.getLineLeft(i15)));
                this.right = Math.max(this.right, (int) Math.ceil(this.layout.getLineRight(i15)));
            }
            this.lastLineRight = 0;
            if (this.layout.getLineCount() > 0) {
                StaticLayout staticLayout = this.layout;
                this.lastLineRight = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
            }
            y80 y80Var = null;
            ih.k.c(null, this.layout, this.spoilersPool, this.spoilers);
            if (this.layout.getText() instanceof Spanned) {
                Spanned spanned2 = (Spanned) this.layout.getText();
                for (StyleSpan styleSpan3 : (StyleSpan[]) spanned2.getSpans(0, spanned2.length(), StyleSpan.class)) {
                    if (TLObject.hasFlag(styleSpan3.flags, 8192)) {
                        int spanStart2 = spanned2.getSpanStart(styleSpan3);
                        int spanEnd2 = spanned2.getSpanEnd(styleSpan3);
                        if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                            if (y80Var == null) {
                                y80Var = new y80(0);
                                y80Var.n = false;
                            }
                            y80Var.d(this.layout, spanStart2, 0.0f);
                            if (TLObject.hasFlag(styleSpan3.flags, 4096)) {
                                dp = -AndroidUtilities.dp(6.0f);
                            } else {
                                dp = TLObject.hasFlag(styleSpan3.flags, 2048) ? AndroidUtilities.dp(2.0f) : 0;
                            }
                            if (dp != 0) {
                                i11 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                            } else {
                                i11 = 0;
                            }
                            y80Var.o = i11;
                            this.layout.getSelectionPath(spanStart2, spanEnd2, y80Var);
                        }
                    }
                }
                if (y80Var != null) {
                    y80Var.n = true;
                    this.markPath = y80Var;
                }
            }
        }
    }

    public RichMessageLayout(MessageObject messageObject, int i10, RichMessageLayout richMessageLayout) {
        this.unsupportedBlocks = new ArrayList<>();
        this.unsupportedBlocksRoot = new ArrayList<>();
        this.blocks = new ArrayList<>();
        this.quotes = new ArrayList<>();
        this.anchors = new HashMap<>();
        this.textAnchors = new HashMap<>();
        this.audioMessages = new ArrayList<>();
        this.audioBlocks = new HashMap<>();
        this.textBlocks = new ArrayList<>();
        this.textBlockCharOffsets = new ArrayList<>();
        this.textBlockBlockIndex = new ArrayList<>();
        this.joinedText = "";
        this.detailsAnimationProgress = 1.0f;
        this.textPaint = new TextPaint(1);
        this.numTextPaint = new TextPaint(1);
        this.quoteLine = new zl0(null);
        this.clip = new i20();
        this.showMoreRect = new RectF();
        this.messageObject = messageObject;
        this.maxWidth = i10;
        this.currentAccount = messageObject.currentAccount;
        layout(richMessageLayout);
    }

    private void appendSelectionPiece(StringBuilder sb, CharSequence charSequence, int i10, int i11, boolean z4) {
        if (i11 <= i10) {
            return;
        }
        SpannableStringBuilder richHtmlSpannable = toRichHtmlSpannable(charSequence.subSequence(i10, i11));
        StringBuilder sb2 = new StringBuilder();
        vh.y3.g(sb2, richHtmlSpannable);
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return;
        }
        sb.append(z4 ? "<cite>" : "<p>");
        sb.append(sb3);
        sb.append(z4 ? "</cite>" : "</p>");
    }

    private void applyListPaddingFromBlocks() {
        int i10 = 0;
        while (i10 < this.blocks.size()) {
            RichBlock richBlock = this.blocks.get(i10);
            if ((richBlock instanceof RichTextBlock) && richBlock.listLevel > 0) {
                int i11 = i10 + 1;
                ((RichTextBlock) richBlock).setContentPadding(AndroidUtilities.dp(i10 > 0 && this.blocks.get(i10 + (-1)).listLevel > 0 ? 2.0f : 6.0f), AndroidUtilities.dp(i11 < this.blocks.size() && this.blocks.get(i11).listLevel > 0 ? 5.0f : 9.0f));
            }
            i10++;
        }
    }

    private void closeLists(StringBuilder sb, ArrayList<Boolean> arrayList) {
        while (!arrayList.isEmpty()) {
            sb.append(((Boolean) e2.c.g(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    private void computeBlockquoteClips(float f10) {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichTextBlockQuote) {
                RichTextBlockQuote richTextBlockQuote = (RichTextBlockQuote) richBlock;
                richTextBlockQuote.collapsedProgress = AndroidUtilities.lerp(richTextBlockQuote.prevCollapsed ? 1.0f : 0.0f, richTextBlockQuote.currentCollapsed ? 1.0f : 0.0f, f10);
                richTextBlockQuote.collapsedHeightToDraw = AndroidUtilities.lerp(richTextBlockQuote.prevH, richTextBlockQuote.currH, f10);
            }
        }
    }

    private void computeDetailsClips(float f10) {
        float f11;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichDetailsBlock) {
                RichDetailsBlock richDetailsBlock = (RichDetailsBlock) richBlock;
                richDetailsBlock.animClipTop = AndroidUtilities.lerp(richDetailsBlock.prevY, richDetailsBlock.currY, f10) + richDetailsBlock.getHeight();
                int i11 = i10 + 1;
                while (true) {
                    if (i11 >= this.blocks.size()) {
                        f11 = Float.MAX_VALUE;
                        break;
                    } else {
                        if (!isDescendantOf(this.blocks.get(i11), richDetailsBlock)) {
                            f11 = AndroidUtilities.lerp(this.blocks.get(i11).prevY, this.blocks.get(i11).currY, f10);
                            break;
                        }
                        i11++;
                    }
                }
                richDetailsBlock.animClipBottom = f11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0593, code lost:
    
        if (r11[2] <= r11[3]) goto L163;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MessageObject.GroupedMessagePosition[] computeGrouped(float[] fArr) {
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int length = fArr.length;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2 = new MessageObject.GroupedMessagePosition[length];
        if (length == 0) {
            return groupedMessagePositionArr2;
        }
        StringBuilder sb = new StringBuilder();
        float f10 = 0.0f;
        boolean z4 = false;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = fArr[i10];
            float f12 = f11 <= 0.0f ? 1.0f : f11;
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePositionArr2[i10] = groupedMessagePosition;
            groupedMessagePosition.aspectRatio = f12;
            if (f12 > 1.2f) {
                sb.append("w");
            } else if (f12 < 0.8f) {
                sb.append("n");
            } else {
                sb.append("q");
            }
            f10 += f12;
            if (f12 > 2.0f) {
                z4 = true;
            }
        }
        float f13 = f10 / length;
        int dp = AndroidUtilities.dp(120.0f);
        float dp2 = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        float min = Math.min(point.x, point.y);
        float f14 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        int i11 = (int) (dp2 / (min / f14));
        float dp3 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / f14));
        float f15 = f14 / 814.0f;
        float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (length == 1) {
            groupedMessagePositionArr2[0].set(0, 0, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, Math.round(Math.min(f14 / r0.aspectRatio, 407.0f)) / 814.0f, 15);
            return groupedMessagePositionArr2;
        }
        int i12 = 3;
        if (!z4 && (length == 2 || length == 3 || length == 4)) {
            if (length == 2) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePositionArr2[0];
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = groupedMessagePositionArr2[1];
                String sb2 = sb.toString();
                if (sb2.equals("ww") && f13 > f15 * 1.4f) {
                    if (groupedMessagePosition2.aspectRatio - groupedMessagePosition3.aspectRatio < 0.2f) {
                        float round = Math.round(Math.min(f14 / r6, Math.min(f14 / r7, 407.0f))) / 814.0f;
                        groupedMessagePosition2.set(0, 0, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 7);
                        groupedMessagePosition3.set(0, 0, 1, 1, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 11);
                        return groupedMessagePositionArr2;
                    }
                }
                if (sb2.equals("ww") || sb2.equals("qq")) {
                    float f16 = 500;
                    float round2 = Math.round(Math.min(f16 / groupedMessagePosition2.aspectRatio, Math.min(f16 / groupedMessagePosition3.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition2.set(0, 0, 0, 0, 500, round2, 13);
                    groupedMessagePosition3.set(1, 1, 0, 0, 500, round2, 14);
                    return groupedMessagePositionArr2;
                }
                float f17 = groupedMessagePosition2.aspectRatio;
                int max = (int) Math.max(0.4f * f14, Math.round((f14 / f17) / ((1.0f / groupedMessagePosition3.aspectRatio) + (1.0f / f17))));
                int i13 = 1000 - max;
                if (i13 < i11) {
                    max -= i11 - i13;
                } else {
                    i11 = i13;
                }
                float min3 = Math.min(814.0f, Math.round(Math.min(i11 / groupedMessagePosition2.aspectRatio, max / groupedMessagePosition3.aspectRatio))) / 814.0f;
                groupedMessagePosition2.set(0, 0, 0, 0, i11, min3, 13);
                groupedMessagePosition3.set(1, 1, 0, 0, max, min3, 14);
                return groupedMessagePositionArr2;
            }
            if (length == 3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArr2[0];
                MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArr2[1];
                MessageObject.GroupedMessagePosition groupedMessagePosition6 = groupedMessagePositionArr2[2];
                if (sb.charAt(0) == 'n') {
                    float f18 = groupedMessagePosition5.aspectRatio;
                    float min4 = Math.min(407.0f, Math.round((f18 * f14) / (groupedMessagePosition6.aspectRatio + f18)));
                    int max2 = (int) Math.max(i11, Math.min(f14 * 0.5f, Math.round(Math.min(groupedMessagePosition6.aspectRatio * min4, groupedMessagePosition5.aspectRatio * r7))));
                    groupedMessagePosition4.set(0, 0, 0, 1, Math.round(Math.min((groupedMessagePosition4.aspectRatio * 814.0f) + min2, 1000 - max2)), 1.0f, 13);
                    groupedMessagePosition5.set(1, 1, 0, 0, max2, (814.0f - min4) / 814.0f, 6);
                    groupedMessagePosition6.set(1, 1, 1, 1, max2, min4 / 814.0f, 10);
                    return groupedMessagePositionArr2;
                }
                float round3 = Math.round(Math.min(f14 / groupedMessagePosition4.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition4.set(0, 1, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round3, 7);
                float f19 = 500;
                float min5 = Math.min(814.0f - round3, Math.round(Math.min(f19 / groupedMessagePosition5.aspectRatio, f19 / groupedMessagePosition6.aspectRatio))) / 814.0f;
                float f20 = min5 < dp4 ? dp4 : min5;
                groupedMessagePosition5.set(0, 0, 1, 1, 500, f20, 9);
                groupedMessagePosition6.set(1, 1, 1, 1, 500, f20, 10);
                return groupedMessagePositionArr2;
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition7 = groupedMessagePositionArr2[0];
            MessageObject.GroupedMessagePosition groupedMessagePosition8 = groupedMessagePositionArr2[1];
            MessageObject.GroupedMessagePosition groupedMessagePosition9 = groupedMessagePositionArr2[2];
            MessageObject.GroupedMessagePosition groupedMessagePosition10 = groupedMessagePositionArr2[3];
            if (sb.charAt(0) != 'w') {
                int max3 = Math.max(i11, Math.round(814.0f / ((1.0f / groupedMessagePosition10.aspectRatio) + ((1.0f / groupedMessagePosition9.aspectRatio) + (1.0f / groupedMessagePosition8.aspectRatio)))));
                float f21 = dp;
                float f22 = max3;
                float min6 = Math.min(0.33f, Math.max(f21, f22 / groupedMessagePosition8.aspectRatio) / 814.0f);
                float min7 = Math.min(0.33f, Math.max(f21, f22 / groupedMessagePosition9.aspectRatio) / 814.0f);
                float f23 = (1.0f - min6) - min7;
                groupedMessagePosition7.set(0, 0, 0, 2, Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + min2, 1000 - max3)), min6 + min7 + f23, 13);
                groupedMessagePosition8.set(1, 1, 0, 0, max3, min6, 6);
                groupedMessagePosition9.set(1, 1, 1, 1, max3, min7, 2);
                groupedMessagePosition10.set(1, 1, 2, 2, max3, f23, 10);
                return groupedMessagePositionArr2;
            }
            float round4 = Math.round(Math.min(f14 / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
            groupedMessagePosition7.set(0, 2, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round4, 7);
            float round5 = Math.round(f14 / ((groupedMessagePosition8.aspectRatio + groupedMessagePosition9.aspectRatio) + groupedMessagePosition10.aspectRatio));
            float f24 = i11;
            int max4 = (int) Math.max(f24, Math.min(f14 * 0.4f, groupedMessagePosition8.aspectRatio * round5));
            int max5 = (int) Math.max(Math.max(f24, f14 * 0.33f), groupedMessagePosition10.aspectRatio * round5);
            int i14 = (1000 - max4) - max5;
            if (i14 < AndroidUtilities.dp(58.0f)) {
                int dp5 = AndroidUtilities.dp(58.0f) - i14;
                i14 = AndroidUtilities.dp(58.0f);
                int i15 = dp5 / 2;
                max4 -= i15;
                max5 -= dp5 - i15;
            }
            int i16 = max4;
            float min8 = Math.min(814.0f - round4, round5) / 814.0f;
            float f25 = min8 < dp4 ? dp4 : min8;
            groupedMessagePosition8.set(0, 0, 1, 1, i16, f25, 9);
            groupedMessagePosition9.set(1, 1, 1, 1, i14, f25, 8);
            groupedMessagePosition10.set(2, 2, 1, 1, max5, f25, 10);
            return groupedMessagePositionArr2;
        }
        int i17 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        float[] fArr2 = new float[length];
        for (int i18 = 0; i18 < length; i18++) {
            float f26 = groupedMessagePositionArr2[i18].aspectRatio;
            if (f13 > 1.1f) {
                fArr2[i18] = Math.max(1.0f, f26);
            } else {
                fArr2[i18] = Math.min(1.0f, f26);
            }
            fArr2[i18] = Math.max(0.66667f, Math.min(1.7f, fArr2[i18]));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i19 = 1; i19 < length; i19++) {
            int i20 = length - i19;
            if (i19 <= 3 && i20 <= 3) {
                arrayList.add(new int[]{i19, i20});
                arrayList2.add(new float[]{multiHeight(fArr2, 0, i19, MediaDataController.MAX_STYLE_RUNS_COUNT), multiHeight(fArr2, i19, length, MediaDataController.MAX_STYLE_RUNS_COUNT)});
            }
        }
        for (int i21 = 1; i21 < length - 1; i21++) {
            int i22 = 1;
            while (true) {
                int i23 = length - i21;
                if (i22 < i23) {
                    int i24 = i23 - i22;
                    if (i21 <= 3) {
                        if (i22 <= (f13 < 0.85f ? 4 : 3) && i24 <= 3) {
                            arrayList.add(new int[]{i21, i22, i24});
                            int i25 = i21 + i22;
                            arrayList2.add(new float[]{multiHeight(fArr2, 0, i21, MediaDataController.MAX_STYLE_RUNS_COUNT), multiHeight(fArr2, i21, i25, MediaDataController.MAX_STYLE_RUNS_COUNT), multiHeight(fArr2, i25, length, MediaDataController.MAX_STYLE_RUNS_COUNT)});
                        }
                    }
                    i22++;
                }
            }
        }
        int i26 = 1;
        while (i26 < length - 2) {
            int i27 = 1;
            while (true) {
                int i28 = length - i26;
                if (i27 < i28) {
                    int i29 = 1;
                    while (true) {
                        int i30 = i28 - i27;
                        if (i29 < i30) {
                            int i31 = i30 - i29;
                            if (i26 > i12 || i27 > i12 || i29 > i12 || i31 > i12) {
                                groupedMessagePositionArr = groupedMessagePositionArr2;
                            } else {
                                arrayList.add(new int[]{i26, i27, i29, i31});
                                int i32 = i26 + i27;
                                int i33 = i32 + i29;
                                groupedMessagePositionArr = groupedMessagePositionArr2;
                                arrayList2.add(new float[]{multiHeight(fArr2, 0, i26, i17), multiHeight(fArr2, i26, i32, i17), multiHeight(fArr2, i32, i33, i17), multiHeight(fArr2, i33, length, i17)});
                            }
                            i29++;
                            groupedMessagePositionArr2 = groupedMessagePositionArr;
                            i17 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            i12 = 3;
                        }
                    }
                    i27++;
                    i17 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i12 = 3;
                }
            }
            i26++;
            i17 = MediaDataController.MAX_STYLE_RUNS_COUNT;
            i12 = 3;
        }
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr3 = groupedMessagePositionArr2;
        float f27 = (f14 / 3.0f) * 4.0f;
        int i34 = -1;
        float f28 = 0.0f;
        for (int i35 = 0; i35 < arrayList.size(); i35++) {
            float[] fArr3 = (float[]) arrayList2.get(i35);
            int[] iArr = (int[]) arrayList.get(i35);
            float f29 = Float.MAX_VALUE;
            float f30 = 0.0f;
            for (float f31 : fArr3) {
                f30 += f31;
                if (f31 < f29) {
                    f29 = f31;
                }
            }
            float abs = Math.abs(f30 - f27);
            if (iArr.length > 1) {
                int i36 = iArr[0];
                int i37 = iArr[1];
                if (i36 <= i37) {
                    if (iArr.length > 2) {
                        if (i37 > iArr[2]) {
                        }
                    }
                    if (iArr.length > 3) {
                    }
                }
                abs *= 1.2f;
            }
            if (f29 < i11) {
                abs *= 1.5f;
            }
            if (i34 == -1 || abs < f28) {
                i34 = i35;
                f28 = abs;
            }
        }
        if (i34 == -1) {
            int i38 = 0;
            while (i38 < length) {
                int i39 = i38;
                groupedMessagePositionArr3[i38].set(0, 0, i39, i38, MediaDataController.MAX_STYLE_RUNS_COUNT, 0.4f, 3);
                i38 = i39 + 1;
            }
            return groupedMessagePositionArr3;
        }
        int[] iArr2 = (int[]) arrayList.get(i34);
        float[] fArr4 = (float[]) arrayList2.get(i34);
        int i40 = 0;
        int i41 = 0;
        while (i41 < iArr2.length) {
            int i42 = iArr2[i41];
            float f32 = fArr4[i41];
            MessageObject.GroupedMessagePosition groupedMessagePosition11 = null;
            int i43 = MediaDataController.MAX_STYLE_RUNS_COUNT;
            for (int i44 = 0; i44 < i42; i44++) {
                int i45 = (int) (fArr2[i40] * f32);
                i43 -= i45;
                MessageObject.GroupedMessagePosition groupedMessagePosition12 = groupedMessagePositionArr3[i40];
                int i46 = i41 == 0 ? 4 : 0;
                if (i41 == iArr2.length - 1) {
                    i46 |= 8;
                }
                if (i44 == 0) {
                    i46 |= 1;
                }
                if (i44 == i42 - 1) {
                    i46 |= 2;
                    groupedMessagePosition11 = groupedMessagePosition12;
                }
                groupedMessagePosition12.set(i44, i44, i41, i41, i45, Math.max(dp4, f32 / 814.0f), i46);
                i40++;
            }
            if (groupedMessagePosition11 != null) {
                groupedMessagePosition11.pw += i43;
                groupedMessagePosition11.spanSize += i43;
            }
            i41++;
        }
        return groupedMessagePositionArr3;
    }

    public static RichButtonSpan createEditorButtonSpan(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var, TL_iv.textButton textbutton) {
        return new RichButtonSpan(i11, textbutton, Boolean.FALSE);
    }

    public static RichButton createEditorPageButton(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var, TL_keyboard.PageButton pageButton, Runnable runnable) {
        RichMessageLayout richMessageLayout = new RichMessageLayout(i10, i11, f6Var);
        CharSequence formatText = richMessageLayout.formatText(pageButton.text, setBlockFlags(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        return new RichButton(richMessageLayout, i11, formatText, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, true, false, false, false, false, Boolean.FALSE, runnable);
    }

    private void drawBackground(Canvas canvas, org.telegram.ui.Cells.r1 r1Var) {
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                QuoteBackground quoteBackground = arrayList.get(i10);
                int blockTop = getBlockTop(quoteBackground.startBlockIndex, r1Var);
                int blockBottom = getBlockBottom(quoteBackground.endBlockIndex, r1Var);
                float blockBackgroundScale = getBlockBackgroundScale(quoteBackground.startBlockIndex, quoteBackground.endBlockIndex);
                int dp = AndroidUtilities.dp(3.0f) * quoteBackground.level;
                int i12 = quoteBackground.outerTopVpad + dp;
                int i13 = dp + quoteBackground.outerBottomVpad;
                if (blockBottom - blockTop > i12 + i13) {
                    blockTop += i12;
                    blockBottom -= i13;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(quoteBackground.padding, blockTop, getMinWidth() - AndroidUtilities.dp(quoteBackground.level * 12), blockBottom);
                canvas.save();
                canvas.scale(blockBackgroundScale, blockBackgroundScale, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                this.quoteLine.c(canvas, rectF, floor, floor, floor, 1.0f, false, false);
                this.quoteLine.e(canvas, rectF, 1.0f);
                canvas.restore();
                i10 = i11;
            }
        }
        for (int i14 = 0; i14 < this.blocks.size(); i14++) {
            RichBlock richBlock = this.blocks.get(i14);
            if ((richBlock instanceof RichPullquoteBlock) && (richBlock.currVisible || richBlock.prevVisible)) {
                drawPullquoteBackground(canvas, (RichPullquoteBlock) richBlock, r1Var);
            }
        }
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.r1 r1Var) {
        float f10;
        float f11;
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        boolean z4 = s1Var != null && s1Var.Xd > 0;
        if (z4) {
            float f12 = s1Var.Vd - s1Var.o0;
            f11 = s1Var.Xd + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        drawInternal(canvas, r1Var, z4, f10, f11);
    }

    private void drawPullquoteBackground(Canvas canvas, RichPullquoteBlock richPullquoteBlock, org.telegram.ui.Cells.r1 r1Var) {
        float f10;
        int textWidth = richPullquoteBlock.getTextWidth();
        if (textWidth <= 0) {
            return;
        }
        boolean z4 = r1Var != null && (this.detailsAnimating || this.blockquoteAnimating);
        float max = z4 ? Math.max(0.0f, Math.min(1.0f, r1Var.K1)) : 1.0f;
        if (z4) {
            f10 = AndroidUtilities.lerp(richPullquoteBlock.prevVisible ? 1.0f : 0.0f, richPullquoteBlock.currVisible ? 1.0f : 0.0f, max);
        } else {
            f10 = richPullquoteBlock.currVisible ? 1.0f : 0.0f;
        }
        if (f10 <= 0.0f) {
            return;
        }
        float minWidth = ((getMinWidth() + this.padRight) - this.padLeft) / 2.0f;
        float f11 = textWidth / 2.0f;
        float dp = (minWidth - f11) - AndroidUtilities.dp(30.0f);
        float dp2 = minWidth + f11 + AndroidUtilities.dp(30.0f);
        float lerp = z4 ? AndroidUtilities.lerp(richPullquoteBlock.prevY, richPullquoteBlock.currY, max) : richPullquoteBlock.currY;
        float dp3 = lerp + AndroidUtilities.dp(8.0f);
        float lerp2 = (lerp + (z4 ? AndroidUtilities.lerp(richPullquoteBlock.prevH, richPullquoteBlock.currH, max) : richPullquoteBlock.getHeight())) - AndroidUtilities.dp(8.0f);
        if (lerp2 <= dp3) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp3, dp2, lerp2);
        float floor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
        this.quoteLine.c(canvas, rectF, floor, floor, floor, f10, false, false);
        if (this.pullquoteIcon == null) {
            this.pullquoteIcon = ApplicationLoader.applicationContext.getDrawable(R.drawable.mini_quote).mutate();
        }
        this.pullquoteIcon.setColorFilter(this.quoteLine.h(), PorterDuff.Mode.SRC_IN);
        this.pullquoteIcon.setAlpha((int) (f10 * 255.0f));
        int intrinsicWidth = this.pullquoteIcon.getIntrinsicWidth();
        int intrinsicHeight = this.pullquoteIcon.getIntrinsicHeight();
        canvas.save();
        canvas.clipRect(dp, dp3, dp2, lerp2);
        int i10 = (int) dp;
        int i11 = (int) dp3;
        this.pullquoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i10, AndroidUtilities.dp(7.0f) + i11, y3.C(8.0f, i10, intrinsicWidth), y3.C(7.0f, i11, intrinsicHeight));
        canvas.scale(-1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(dp, dp3, dp2, lerp2);
        int i12 = (int) dp2;
        int i13 = (int) lerp2;
        this.pullquoteIcon.setBounds(y3.B(8.0f, i12, intrinsicWidth), y3.B(7.0f, i13, intrinsicHeight), i12 - AndroidUtilities.dp(8.0f), i13 - AndroidUtilities.dp(7.0f));
        canvas.scale(1.0f, -1.0f, this.pullquoteIcon.getBounds().centerX(), this.pullquoteIcon.getBounds().centerY());
        this.pullquoteIcon.draw(canvas);
        canvas.restore();
        this.pullquoteIcon.setAlpha(255);
    }

    private void drawShowMoreButton(Canvas canvas, int i10) {
        org.telegram.ui.Cells.j1 j1Var;
        int themedColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.j6.Xa : org.telegram.ui.ActionBar.j6.Kc);
        if (this.showMoreText == null) {
            this.showMoreText = new k01(LocaleController.getString(R.string.ShowMore), 16.0f, AndroidUtilities.bold());
        }
        org.telegram.ui.Components.rc rcVar = this.showMoreBounce;
        if (rcVar == null) {
            this.showMoreBounce = new org.telegram.ui.Components.rc(this.view, 1.5f, 2.0f);
        } else {
            View view = rcVar.a;
            View view2 = this.view;
            if (view != view2) {
                rcVar.a = view2;
            }
        }
        if (this.showMorePaint == null) {
            this.showMorePaint = new Paint(1);
        }
        this.showMorePaint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor));
        float dp = AndroidUtilities.dp(42.0f);
        float f10 = this.showMoreText.c;
        float minWidth = ((getMinWidth() + this.padLeft) + this.padRight) - AndroidUtilities.dp(24.0f);
        int minWidth2 = getMinWidth();
        float f11 = (((minWidth2 + r8) + this.padRight) / 2.0f) - this.padLeft;
        float dp2 = AndroidUtilities.dp(4.0f) + i10;
        float f12 = minWidth / 2.0f;
        this.showMoreRect.set(f11 - f12, dp2, f11 + f12, dp + dp2);
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        boolean z4 = (s1Var == null || (j1Var = this.delegate) == null || !j1Var.h1(7, s1Var)) ? false : true;
        j90 j90Var = this.showMoreLoading;
        if (j90Var != null && !z4 && !j90Var.b() && !this.showMoreLoading.c()) {
            this.showMoreLoading.a();
        }
        j90 j90Var2 = this.showMoreLoading;
        if (j90Var2 == null && z4) {
            j90 j90Var3 = new j90();
            this.showMoreLoading = j90Var3;
            j90Var3.w.setStrokeWidth(AndroidUtilities.dp(1.25f));
            this.showMoreLoading.C = true;
        } else if (j90Var2 != null && z4 && (j90Var2.b() || this.showMoreLoading.c())) {
            j90 j90Var4 = this.showMoreLoading;
            j90Var4.b = -1L;
            j90Var4.c = -1L;
        }
        j90 j90Var5 = this.showMoreLoading;
        if (j90Var5 != null) {
            j90Var5.f(org.telegram.ui.ActionBar.j6.l1(0.1f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.j6.l1(0.3f, themedColor), org.telegram.ui.ActionBar.j6.l1(1.2f, themedColor));
        }
        float a2 = this.showMoreBounce.a(0.075f);
        boolean z10 = a2 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(a2, a2, this.showMoreRect.centerX(), this.showMoreRect.centerY());
        }
        canvas.drawRoundRect(this.showMoreRect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.showMorePaint);
        j90 j90Var6 = this.showMoreLoading;
        if (j90Var6 != null && !j90Var6.b()) {
            this.showMoreLoading.d(this.showMoreRect);
            this.showMoreLoading.j(8.0f);
            this.showMoreLoading.draw(canvas);
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }
        this.showMoreText.c(this.showMoreRect.centerX() - (f10 / 2.0f), this.showMoreRect.centerY(), 1.0f, themedColor, canvas);
        if (z10) {
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [org.telegram.messenger.RichMessageLayout$RichTextBlock, org.telegram.messenger.RichMessageLayout$RichTextBlockQuote] */
    private RichBlock emitBlock(TL_iv.PageBlock pageBlock, int i10, Rect rect, int i11, boolean z4) {
        TLRPC.Document document;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        RichMessageLayout richMessageLayout;
        RichQuoteBlock richQuoteBlock;
        int i12;
        int i13;
        int i14;
        int i15;
        RichBlock richBlock;
        int i16 = i11;
        RichBlock richBlock2 = null;
        if (rect.left + rect.right >= this.maxWidth) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockThinking) {
            RichThinkingBlock richThinkingBlock = new RichThinkingBlock(this, new Rect(), this.maxWidth, formatText(pageBlock.text));
            this.blocks.add(richThinkingBlock);
            return richThinkingBlock;
        }
        if (org.telegram.ui.n4.K(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean K = org.telegram.ui.n4.K(pageBlock);
            RichTextBlock richTextBlock = new RichTextBlock(this, rect, this.maxWidth, formatText(pageBlock.text, setBlockFlags(i16, getBlockTextFlag(pageBlock))));
            if (K) {
                richTextBlock.setContentPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                richTextBlock.setContentPadding(z4 ? 0 : AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.66f));
            }
            richTextBlock.accessibilityLabelResId = getBlockAccessibilityLabel(pageBlock);
            this.blocks.add(richTextBlock);
            return richTextBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            RichPreformattedBlock richPreformattedBlock = new RichPreformattedBlock(this, rect, this.maxWidth, (TL_iv.pageBlockPreformatted) pageBlock, (RichPreformattedBlock) findPrevBlock(pageBlock, RichPreformattedBlock.class));
            richPreformattedBlock.accessibilityLabelResId = R.string.ArticleCode;
            this.blocks.add(richPreformattedBlock);
            return richPreformattedBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i17 = i10 + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            int dp = AndroidUtilities.dp(18.0f);
            for (int i18 = 0; i18 < pageblocklist.items.size(); i18++) {
                dp = Math.max(dp, pageblocklist.items.get(i18).checkbox ? AndroidUtilities.dp(26.0f) : AndroidUtilities.dp(18.0f));
            }
            Rect rect2 = new Rect(rect);
            if (isRtl()) {
                rect2.right += dp;
            } else {
                rect2.left += dp;
            }
            int i19 = 0;
            while (i19 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i19);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    richBlock = richBlock2;
                    RichTextBlock richTextBlock2 = new RichTextBlock(this, new Rect(rect2), this.maxWidth, formatText(tL_pageListItemText.text, i16));
                    richTextBlock2.setListMarkerWidth(dp);
                    if (tL_pageListItemText.checkbox) {
                        richTextBlock2.setCheckbox(tL_pageListItemText.checked, tL_pageListItemText);
                    } else {
                        richTextBlock2.setNum("•◦▪".charAt(i10 % 3) + "");
                    }
                    markListItem(richTextBlock2, i17, false, tL_pageListItemText.checkbox, tL_pageListItemText.checked);
                    this.blocks.add(richTextBlock2);
                } else {
                    richBlock = richBlock2;
                    if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                            int size = this.blocks.size();
                            int i20 = 0;
                            boolean z10 = false;
                            while (i20 < tL_pageListItemBlocks.blocks.size()) {
                                int i21 = i20;
                                RichBlock emitBlock = emitBlock(tL_pageListItemBlocks.blocks.get(i20), i17, new Rect(rect2), i16, previousBlockIsParagraph(tL_pageListItemBlocks.blocks, i20));
                                if (emitBlock != null && !z10) {
                                    emitBlock.setListMarkerWidth(dp);
                                    if (tL_pageListItemBlocks.checkbox) {
                                        emitBlock.setCheckbox(tL_pageListItemBlocks.checked, tL_pageListItemBlocks);
                                    } else {
                                        emitBlock.setNum("•◦▪".charAt(i10 % 3) + "");
                                    }
                                    markListItem(emitBlock, i17, false, tL_pageListItemBlocks.checkbox, tL_pageListItemBlocks.checked);
                                    z10 = true;
                                }
                                i20 = i21 + 1;
                            }
                            markListMembership(size, this.blocks.size(), i17, false);
                            i19++;
                            richBlock2 = richBlock;
                        }
                    }
                }
                i19++;
                richBlock2 = richBlock;
            }
            return richBlock2;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i22 = i10 + 1;
            this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
            new TextPaint(this.numTextPaint).setTypeface(AndroidUtilities.bold());
            int dp2 = AndroidUtilities.dp(28.0f);
            for (int i23 = 0; i23 < pageblockorderedlist.items.size(); i23++) {
                dp2 = Math.max(dp2, AndroidUtilities.dp(10.0f) + ((int) Math.ceil(r6.measureText(orderedListMarker(pageblockorderedlist, r11, i23)))) + (pageblockorderedlist.items.get(i23).checkbox ? AndroidUtilities.dp(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (isRtl()) {
                rect3.right += dp2;
            } else {
                rect3.left += dp2;
            }
            int i24 = 0;
            while (i24 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i24);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    RichTextBlock richTextBlock3 = new RichTextBlock(this, new Rect(rect3), this.maxWidth, formatText(tL_pageListOrderedItemText.text, i16));
                    richTextBlock3.setListMarkerWidth(dp2);
                    richTextBlock3.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemText, i24));
                    if (tL_pageListOrderedItemText.checkbox) {
                        richTextBlock3.setCheckbox(tL_pageListOrderedItemText.checked, tL_pageListOrderedItemText);
                    }
                    markListItem(richTextBlock3, i22, true, tL_pageListOrderedItemText.checkbox, tL_pageListOrderedItemText.checked);
                    this.blocks.add(richTextBlock3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int size2 = this.blocks.size();
                        boolean z11 = false;
                        int i25 = 0;
                        while (i25 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            RichBlock emitBlock2 = emitBlock(tL_pageListOrderedItemBlocks.blocks.get(i25), i22, new Rect(rect3), i16, previousBlockIsParagraph(tL_pageListOrderedItemBlocks.blocks, i25));
                            int i26 = i16;
                            if (emitBlock2 != null && !z11) {
                                emitBlock2.setListMarkerWidth(dp2);
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    emitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                }
                                emitBlock2.setNum(orderedListMarker(pageblockorderedlist, tL_pageListOrderedItemBlocks, i24));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    emitBlock2.setCheckbox(tL_pageListOrderedItemBlocks.checked, tL_pageListOrderedItemBlocks);
                                }
                                markListItem(emitBlock2, i22, true, tL_pageListOrderedItemBlocks.checkbox, tL_pageListOrderedItemBlocks.checked);
                                z11 = true;
                            }
                            i25++;
                            i16 = i26;
                        }
                        i15 = i16;
                        markListMembership(size2, this.blocks.size(), i22, true);
                        i24++;
                        i16 = i15;
                    }
                }
                i15 = i16;
                i24++;
                i16 = i15;
            }
            return null;
        }
        int i27 = i16;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            int i28 = rect.left;
            int size3 = this.blocks.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            CharSequence formatText = formatText(pageBlock.text, setBlockFlags(i27, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            CharSequence formatText2 = (richText == null || TextUtils.isEmpty(getString(richText))) ? null : formatText(pageblockblockquote2.caption, setBlockFlags(i27, 11));
            if (pageblockblockquote2.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatText);
                if (formatText2 != null) {
                    spannableStringBuilder.append('\n');
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(formatText2);
                    i14 = length;
                } else {
                    i14 = -1;
                }
                ?? richTextBlockQuote = new RichTextBlockQuote(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(4.0f) + rect.top, AndroidUtilities.dp(20.0f) + rect.right, AndroidUtilities.dp(4.0f) + rect.bottom), this.maxWidth, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                richTextBlockQuote.quoteAuthorStart = i14;
                richTextBlockQuote.setContentPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                richQuoteBlock = richTextBlockQuote;
                richMessageLayout = this;
            } else {
                pageblockblockquote = pageblockblockquote2;
                richMessageLayout = this;
                richQuoteBlock = new RichQuoteBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, AndroidUtilities.dp(12.0f) + rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(14.0f) + rect.bottom), this.maxWidth, formatText, formatText2);
            }
            richQuoteBlock.accessibilityLabelResId = R.string.ArticleQuote;
            richMessageLayout.blocks.add(richQuoteBlock);
            ArrayList<QuoteBackground> arrayList = richMessageLayout.quotes;
            int size4 = richMessageLayout.blocks.size() - 1;
            int dp3 = AndroidUtilities.dp(8.0f);
            if (pageblockblockquote.collapsed) {
                i12 = i28;
                i13 = AndroidUtilities.dp(8.0f);
            } else {
                i12 = i28;
                i13 = 0;
            }
            arrayList.add(new QuoteBackground(size3, size4, i12, i10, dp3, i13));
            return richQuoteBlock;
        }
        int i29 = 9;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i30 = rect.left;
            int i31 = i10 + 1;
            int size5 = this.blocks.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z12 = (richText2 == null || TextUtils.isEmpty(getString(richText2))) ? false : true;
            int i32 = 0;
            while (i32 < pageblockblockquoteblocks.blocks.size()) {
                emitBlock(pageblockblockquoteblocks.blocks.get(i32), i31, new Rect(AndroidUtilities.dp(12.0f) + rect.left, rect.top + (i32 == 0 ? AndroidUtilities.dp(4.0f) : 0), AndroidUtilities.dp(12.0f) + rect.right, rect.bottom + ((!(i32 == pageblockblockquoteblocks.blocks.size() + (-1)) || z12) ? 0 : AndroidUtilities.dp(4.0f))), setBlockFlags(i27, i29), previousBlockIsParagraph(pageblockblockquoteblocks.blocks, i32));
                i32++;
                size5 = size5;
                i29 = 9;
            }
            int i33 = size5;
            if (this.blocks.size() > i33) {
                this.blocks.get(i33).accessibilityParentLabelResId = R.string.ArticleQuote;
            }
            if (z12) {
                RichTextBlock richTextBlock4 = new RichTextBlock(this, new Rect(AndroidUtilities.dp(12.0f) + rect.left, rect.top, AndroidUtilities.dp(12.0f) + rect.right, AndroidUtilities.dp(6.0f) + rect.bottom), this.maxWidth, new SpannableStringBuilder(formatText(pageblockblockquoteblocks.caption, setBlockFlags(i27, 11))));
                richTextBlock4.quoteAuthorStart = 0;
                richTextBlock4.setContentPadding(AndroidUtilities.dp(2.0f), 0);
                this.blocks.add(richTextBlock4);
            }
            this.quotes.add(new QuoteBackground(i33, this.blocks.size() - 1, i30, i10));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            CharSequence formatText3 = formatText(pageBlock.text, setBlockFlags(i27, getBlockTextFlag(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            RichPullquoteBlock richPullquoteBlock = new RichPullquoteBlock(this, new Rect(AndroidUtilities.dp(30.0f) + rect.left, AndroidUtilities.dp(16.0f) + rect.top, AndroidUtilities.dp(30.0f) + rect.right, AndroidUtilities.dp(16.0f) + rect.bottom), this.maxWidth, formatText3, (richText3 == null || TextUtils.isEmpty(getString(richText3))) ? null : formatText(pageblockpullquote.caption, setBlockFlags(i27, 11)));
            richPullquoteBlock.accessibilityLabelResId = R.string.ArticlePullquote;
            this.blocks.add(richPullquoteBlock);
            return richPullquoteBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            RichButtonRowBlock richButtonRowBlock = new RichButtonRowBlock(this, rect, this.maxWidth, (TL_iv.pageBlockButtonRow) pageBlock);
            richButtonRowBlock.accessibilityLabelResId = R.string.AccDescrIVButtons;
            this.blocks.add(richButtonRowBlock);
            return richButtonRowBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            RichTableBlock richTableBlock = new RichTableBlock(this, rect, this.maxWidth, (TL_iv.pageBlockTable) pageBlock);
            richTableBlock.accessibilityLabelResId = R.string.AccDescrIVTable;
            this.blocks.add(richTableBlock);
            return richTableBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            RichMathBlock richMathBlock = new RichMathBlock(this, rect, this.maxWidth, (TL_iv.pageBlockMath) pageBlock);
            this.blocks.add(richMathBlock);
            return richMathBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            RichDividerBlock richDividerBlock = new RichDividerBlock(this, rect, this.maxWidth);
            this.blocks.add(richDividerBlock);
            return richDividerBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            RichPhotoBlock richPhotoBlock = new RichPhotoBlock(this, rect, this.maxWidth, pageblockphoto, this.blocks.isEmpty());
            this.blocks.add(richPhotoBlock);
            emitCaption(pageblockphoto.caption, rect, i27);
            return richPhotoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            RichVideoBlock richVideoBlock = new RichVideoBlock(this, rect, this.maxWidth, pageblockvideo, this.blocks.isEmpty());
            this.blocks.add(richVideoBlock);
            emitCaption(pageblockvideo.caption, rect, i27);
            return richVideoBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            RichCollageBlock richCollageBlock = new RichCollageBlock(this, rect, this.maxWidth, pageblockcollage, this.blocks.isEmpty());
            this.blocks.add(richCollageBlock);
            emitCaption(pageblockcollage.caption, rect, i27);
            return richCollageBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            RichSlideshowBlock richSlideshowBlock = new RichSlideshowBlock(this, rect, this.maxWidth, pageblockslideshow, this.blocks.isEmpty());
            this.blocks.add(richSlideshowBlock);
            emitCaption(pageblockslideshow.caption, rect, i27);
            return richSlideshowBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            RichMapBlock richMapBlock = new RichMapBlock(this, rect, this.maxWidth, pageblockmap);
            this.blocks.add(richMapBlock);
            emitCaption(pageblockmap.caption, rect, i27);
            return richMapBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            if (this.audioBlocks.get(pageblockaudio) == null && (document = getDocument(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i34 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i34;
                tL_message.id = i34;
                tL_message.realId = this.messageObject.getRealId();
                tL_message.dialog_id = this.messageObject.getDialogId();
                TLRPC.Peer peer = this.messageObject.messageOwner.peer_id;
                tL_message.peer_id = peer;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                tL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(pageblockaudio, messageObject);
            }
            RichAudioBlock richAudioBlock = new RichAudioBlock(this, rect, this.maxWidth, pageblockaudio);
            this.blocks.add(richAudioBlock);
            emitCaption(pageblockaudio.caption, rect, i27);
            return richAudioBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            RichDocumentBlock richDocumentBlock = new RichDocumentBlock(this, rect, this.maxWidth, pageblockdocument);
            this.blocks.add(richDocumentBlock);
            emitCaption(pageblockdocument.caption, rect, i27);
            return richDocumentBlock;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return emitBlock(((TL_iv.pageBlockCover) pageBlock).cover, i10, rect, i27, false);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str != null) {
                this.anchors.put(str.toLowerCase(), Integer.valueOf(this.blocks.size()));
            }
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int dp4 = k7.w8.a(i27, 9) ? AndroidUtilities.dp(6.0f) : i10 > 0 ? AndroidUtilities.dp(4.0f) : 0;
            RichUnsupportedBlock richUnsupportedBlock = new RichUnsupportedBlock(this, new Rect((rect.left + dp4) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.top), (rect.right + dp4) - AndroidUtilities.dp(7.0f), Math.max(AndroidUtilities.dp(14.0f), rect.bottom)), this.maxWidth, this.blocks.size(), i10);
            this.unsupportedBlocks.add(richUnsupportedBlock);
            if (i10 == 0) {
                this.unsupportedBlocksRoot.add(richUnsupportedBlock);
            }
            this.blocks.add(richUnsupportedBlock);
            return richUnsupportedBlock;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                return null;
            }
            RichTextBlock richTextBlock5 = new RichTextBlock(this, rect, this.maxWidth, "unsupported block " + pageBlock);
            this.blocks.add(richTextBlock5);
            return richTextBlock5;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        RichDetailsBlock richDetailsBlock = new RichDetailsBlock(this, rect, this.maxWidth, pageblockdetails, formatText(pageblockdetails.title, i27 & (-17)));
        this.blocks.add(richDetailsBlock);
        int i35 = 0;
        while (i35 < pageblockdetails.blocks.size()) {
            int i36 = i27;
            emitBlock(pageblockdetails.blocks.get(i35), i10 + 1, rect, i36, previousBlockIsParagraph(pageblockdetails.blocks, i35));
            i35++;
            i27 = i36;
        }
        this.blocks.add(new RichDetailsEndBlock(this, new Rect(rect.left, 0, rect.right, 0), this.maxWidth));
        for (int size6 = this.blocks.size(); size6 < this.blocks.size(); size6++) {
            RichBlock richBlock3 = this.blocks.get(size6);
            if (richBlock3.parentDetails == null) {
                richBlock3.parentDetails = richDetailsBlock;
            }
        }
        return richDetailsBlock;
    }

    private void emitCaption(TL_iv.PageCaption pageCaption, Rect rect, int i10) {
        if (pageCaption == null) {
            return;
        }
        TL_iv.RichText richText = pageCaption.text;
        boolean z4 = false;
        boolean z10 = (richText == null || (richText instanceof TL_iv.textEmpty)) ? false : true;
        TL_iv.RichText richText2 = pageCaption.credit;
        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
            z4 = true;
        }
        if (z10 || z4) {
            int blockFlags = setBlockFlags(i10, 10);
            this.blocks.add(new RichCaptionBlock(this, rect, this.maxWidth, z10 ? formatText(pageCaption.text, blockFlags) : null, z4 ? formatText(pageCaption.credit, blockFlags) : null));
        }
    }

    private <T extends RichBlock> T findPrevBlock(TL_iv.PageBlock pageBlock, Class<T> cls) {
        RichMessageLayout richMessageLayout = this.prev;
        if (richMessageLayout == null) {
            return null;
        }
        ArrayList<RichBlock> arrayList = richMessageLayout.blocks;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RichBlock richBlock = arrayList.get(i10);
            i10++;
            RichBlock richBlock2 = richBlock;
            if (cls.isInstance(richBlock2) && (richBlock2 instanceof RichPreformattedBlock) && prefixEquals(((RichPreformattedBlock) richBlock2).plain, getString(pageBlock.text))) {
                return cls.cast(richBlock2);
            }
        }
        return null;
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, Object obj) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i10);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    private static int getBlockAccessibilityLabel(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return R.string.ArticleHeading1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return R.string.ArticleHeading2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return R.string.ArticleHeading3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return R.string.ArticleHeading4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return R.string.ArticleHeading5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return R.string.ArticleHeading6;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return R.string.ArticleFooter;
        }
        return 0;
    }

    private float getBlockBackgroundScale(int i10, int i11) {
        float f10 = 1.0f;
        while (i10 < Math.min(i11 + 1, this.blocks.size())) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.isVisible()) {
                f10 = richBlock.getBackgroundScale() * f10;
            }
            i10++;
        }
        return f10;
    }

    private int getBlockBottom(int i10, org.telegram.ui.Cells.r1 r1Var) {
        if (i10 >= 0 && i10 < this.blocks.size() && r1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float max = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
            RichBlock richBlock = this.blocks.get(i10);
            int c3 = kf.k0.c(4.0f, richBlock.padding.bottom, 0);
            return Math.round(AndroidUtilities.lerp((richBlock.prevY + richBlock.prevH) - (richBlock.prevVisible ? c3 : 0), (richBlock.currY + richBlock.currH) - (richBlock.currVisible ? c3 : 0), max));
        }
        boolean z4 = false;
        int i11 = 0;
        while (r3 < this.blocks.size()) {
            RichBlock richBlock2 = this.blocks.get(r3);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z4) {
                i11 += getGap();
            }
            if (isVisible) {
                int height = ((r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? richBlock2.getHeight() : AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)))) + i11;
                i11 = (r3 != i10 || richBlock2.padding.bottom <= AndroidUtilities.dp(4.0f)) ? height : y3.z(4.0f, richBlock2.padding.bottom, height);
            }
            if (r3 == i10) {
                return i11;
            }
            if (isVisible) {
                z4 = true;
            }
            r3++;
        }
        return this.height;
    }

    private static int getBlockTextFlag(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return 6;
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks)) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 12;
        }
        return pageBlock instanceof TL_iv.pageBlockFooter ? 7 : 0;
    }

    private int getBlockTop(int i10, org.telegram.ui.Cells.r1 r1Var) {
        if (i10 >= 0 && i10 < this.blocks.size() && r1Var != null && (this.detailsAnimating || this.blockquoteAnimating)) {
            float max = Math.max(0.0f, Math.min(1.0f, r1Var.K1));
            RichBlock richBlock = this.blocks.get(i10);
            return Math.round(AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, max));
        }
        boolean z4 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < this.blocks.size(); i12++) {
            RichBlock richBlock2 = this.blocks.get(i12);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z4) {
                i11 += getGap();
            }
            if (i12 == i10) {
                return i11;
            }
            if (isVisible) {
                i11 = ((r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? richBlock2.getHeight() : AndroidUtilities.lerp(richBlock2.prevH, richBlock2.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)))) + i11;
                z4 = true;
            }
        }
        return this.height;
    }

    public static String getString(TL_iv.RichText richText) {
        StringBuilder sb = new StringBuilder();
        getString(richText, sb);
        return sb.toString();
    }

    private static s01 getTextStyleRun(int i10) {
        s01 s01Var = new s01();
        s01Var.a = i10;
        return s01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, this.resourcesProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getThemedDrawable(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        Drawable drawable = f6Var != null ? f6Var.getDrawable(str) : null;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.j6.O0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleAnchorClick(String str) {
        String substring;
        if (str == null || !str.startsWith("#")) {
            return false;
        }
        try {
            substring = URLDecoder.decode(str.substring(1), "UTF-8");
        } catch (Exception unused) {
            substring = str.substring(1);
        }
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        String lowerCase = substring.toLowerCase();
        TL_iv.textAnchor textanchor = this.textAnchors.get(lowerCase);
        if (textanchor != null) {
            return showFootnoteSheet(textanchor);
        }
        Integer num = this.anchors.get(lowerCase);
        if (num != null) {
            return scrollToPageBlockAnchor(num.intValue());
        }
        return true;
    }

    private boolean hasCustomIncomingQuoteColor(TLRPC.User user, TLRPC.Chat chat) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        MessageObject messageObject = this.messageObject;
        if (messageObject.overrideLinkColor >= 0 || messageObject.overrideLinkPeerColor != null) {
            return true;
        }
        if (messageObject.isSponsored() && (peerColor = this.messageObject.sponsoredColor) != null && peerColor.color != -1) {
            return true;
        }
        MessageObject messageObject2 = this.messageObject;
        TLRPC.Message message = messageObject2.messageOwner;
        if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            if (peerDialogId < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                return chat2 != null && hasCustomPeerColor(chat2.color);
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            return user2 != null && hasCustomPeerColor(user2.color);
        }
        if (DialogObject.isEncryptedDialog(messageObject2.getDialogId()) || this.messageObject.isFromUser()) {
            return user != null && hasCustomPeerColor(user.color);
        }
        if (!this.messageObject.isFromChannel() || chat == null) {
            return false;
        }
        if (!chat.signature_profiles) {
            return hasCustomPeerColor(chat.color);
        }
        long fromChatId = this.messageObject.getFromChatId();
        if (fromChatId >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
            return user3 != null && hasCustomPeerColor(user3.color);
        }
        TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
        return chat3 != null && hasCustomPeerColor(chat3.color);
    }

    private static boolean hasCustomPeerColor(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    private static boolean isDescendantOf(RichBlock richBlock, RichDetailsBlock richDetailsBlock) {
        do {
            richBlock = richBlock.parentDetails;
            if (richBlock == null) {
                return false;
            }
        } while (richBlock != richDetailsBlock);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$quotesFor$0(QuoteBackground quoteBackground, QuoteBackground quoteBackground2) {
        return quoteBackground.level - quoteBackground2.level;
    }

    private static void markListItem(RichBlock richBlock, int i10, boolean z4, boolean z10, boolean z11) {
        if (richBlock == null) {
            return;
        }
        richBlock.listLevel = i10;
        richBlock.listOrdered = z4;
        richBlock.listCheckbox = z10;
        richBlock.listChecked = z11;
    }

    private void markListMembership(int i10, int i11, int i12, boolean z4) {
        while (i10 < i11) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.listLevel == 0) {
                richBlock.listLevel = i12;
                richBlock.listOrdered = z4;
            }
            i10++;
        }
    }

    private static float multiHeight(float[] fArr, int i10, int i11, int i12) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return i12 / Math.max(1.0E-4f, f10);
    }

    private static String orderedListMarker(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i10) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            return pageListOrderedItem.num.endsWith(".") ? pageListOrderedItem.num : android.support.v4.media.a.r(new StringBuilder(), pageListOrderedItem.num, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return android.support.v4.media.a.m(pageListOrderedItem.value, ".", new StringBuilder());
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i10 + 1) + ".";
        }
        StringBuilder sb = new StringBuilder();
        int i11 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i10 = -i10;
        }
        sb.append(i11 + i10);
        sb.append(".");
        return sb.toString();
    }

    private boolean prefixEquals(String str, String str2) {
        if (str == null || str2 == null || str.length() > str2.length() || str2.length() <= 0) {
            return false;
        }
        return str2.startsWith(str);
    }

    private static boolean previousBlockIsParagraph(List<TL_iv.PageBlock> list, int i10) {
        return i10 > 0 && (list.get(i10 - 1) instanceof TL_iv.pageBlockParagraph);
    }

    private ArrayList<QuoteBackground> quotesFor(int i10) {
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        if (i10 >= 0) {
            ArrayList<QuoteBackground> arrayList2 = this.quotes;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                QuoteBackground quoteBackground = arrayList2.get(i11);
                i11++;
                QuoteBackground quoteBackground2 = quoteBackground;
                if (i10 >= quoteBackground2.startBlockIndex && i10 <= quoteBackground2.endBlockIndex) {
                    arrayList.add(quoteBackground2);
                }
            }
            Collections.sort(arrayList, new d(27));
        }
        return arrayList;
    }

    private static boolean sameQuotes(ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    private boolean scrollToPageBlockAnchor(int i10) {
        RecyclerView recyclerView;
        if (this.cell == null || i10 < 0 || i10 >= this.blocks.size()) {
            return false;
        }
        ViewParent parent = this.cell.getParent();
        while (true) {
            if (parent == null) {
                recyclerView = null;
                break;
            }
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
                break;
            }
            parent = parent.getParent();
        }
        if (recyclerView == null) {
            return false;
        }
        recyclerView.v0(0, (((this.cell.getTop() + this.cell.o0) + getBlockTop(i10, null)) - recyclerView.getPaddingTop()) - AndroidUtilities.dp(8.0f), null);
        return true;
    }

    public static int setBlockFlags(int i10, int i11) {
        return i11 == 0 ? i10 : (i10 & (-16)) | i11;
    }

    private void setBubblePaddings(int i10, int i11) {
        if (this.padLeft == i10 && this.padRight == i11) {
            return;
        }
        this.padLeft = i10;
        this.padRight = i11;
        for (int i12 = 0; i12 < this.blocks.size(); i12++) {
            RichBlock richBlock = this.blocks.get(i12);
            if (richBlock instanceof RichDetailsBlock) {
                ((RichDetailsBlock) richBlock).updateBubbleInsets();
            }
        }
    }

    private void setSpansWithoutClash(Object obj, final SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (!(obj instanceof StyleSpan)) {
            spannableStringBuilder.setSpan(obj, i10, i11, 33);
            return;
        }
        StyleSpan styleSpan = (StyleSpan) obj;
        StyleSpan[] styleSpanArr = (StyleSpan[]) spannableStringBuilder.getSpans(i10, i11, StyleSpan.class);
        if (styleSpanArr == null || styleSpanArr.length <= 0) {
            setStyleRange(spannableStringBuilder, i10, i11, styleSpan.flags);
            return;
        }
        Arrays.sort(styleSpanArr, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.messenger.wh
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj2) {
                return spannableStringBuilder.getSpanStart((RichMessageLayout.StyleSpan) obj2);
            }
        }));
        for (int i12 = 0; i12 < styleSpanArr.length; i12++) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpanArr[i12]);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpanArr[i12]);
            if (spanStart > i10) {
                setStyleRange(spannableStringBuilder, i10, spanStart, styleSpan.flags);
            }
            i10 = Math.max(i10, spanEnd);
        }
        if (i10 < i11) {
            setStyleRange(spannableStringBuilder, i10, i11, styleSpan.flags);
        }
    }

    private void setStyleRange(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        while (i10 < i11) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i10, i11, URLSpan.class);
            spannableStringBuilder.setSpan(new StyleSpan(this, i12, ((URLSpan[]) spannableStringBuilder.getSpans(i10, nextSpanTransition, URLSpan.class)).length > 0), i10, nextSpanTransition, 33);
            i10 = nextSpanTransition;
        }
    }

    private boolean showFootnoteSheet(TL_iv.textAnchor textanchor) {
        Context context;
        TL_iv.RichText richText;
        View view = this.view;
        if (view == null || (context = view.getContext()) == null || (richText = textanchor.text) == null || (richText instanceof TL_iv.textEmpty)) {
            return false;
        }
        String str = textanchor.name;
        CharSequence formatText = formatText(org.telegram.ui.web.h2.d(textanchor.text, "", str == null ? "" : str.toLowerCase()));
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, this.resourcesProvider, true, false);
        g3Var.fixNavigationBar();
        g3Var.applyTopPadding = false;
        g3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView g10 = y3.g(context, 1, 16.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.InstantViewReference));
        g10.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        g10.setTextColor(getThemedColor(i10));
        g10.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        linearLayout.addView(g10, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f)));
        f90 f90Var = new f90(context, this.resourcesProvider);
        f90Var.setTextSize(1, SharedConfig.fontSize);
        f90Var.setTextColor(getThemedColor(i10));
        f90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.k5));
        f90Var.setMovementMethod(LinkMovementMethod.getInstance());
        f90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(16.0f));
        f90Var.setText(formatText);
        linearLayout.addView(f90Var, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout, k7.b6.c(-2.0f, -1));
        g3Var.customView = frameLayout;
        g3Var.show();
        return true;
    }

    private void syncLists(StringBuilder sb, ArrayList<Boolean> arrayList, int i10, boolean z4) {
        String str;
        String str2;
        while (true) {
            str = "</ul>";
            if (arrayList.size() <= i10) {
                break;
            }
            if (((Boolean) e2.c.g(1, arrayList)).booleanValue()) {
                str = "</ol>";
            }
            sb.append(str);
        }
        while (true) {
            str2 = "<ul>";
            if (arrayList.size() >= i10) {
                break;
            }
            if (z4) {
                str2 = "<ol>";
            }
            sb.append(str2);
            arrayList.add(Boolean.valueOf(z4));
        }
        if (arrayList.isEmpty() || ((Boolean) kf.k0.i(1, arrayList)).booleanValue() == z4) {
            return;
        }
        sb.append(((Boolean) e2.c.g(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        sb.append(z4 ? "<ol>" : "<ul>");
        arrayList.add(Boolean.valueOf(z4));
    }

    private void syncQuotes(StringBuilder sb, ArrayList<QuoteBackground> arrayList, ArrayList<QuoteBackground> arrayList2) {
        int i10 = 0;
        while (i10 < arrayList.size() && i10 < arrayList2.size() && arrayList.get(i10) == arrayList2.get(i10)) {
            i10++;
        }
        while (arrayList.size() > i10) {
            sb.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb.append("<blockquote>");
            arrayList.add(arrayList2.get(arrayList.size()));
        }
    }

    private SpannableStringBuilder toRichHtmlSpannable(CharSequence charSequence) {
        int textStyleFlags;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(styleSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(styleSpan);
            if (spanEnd > spanStart && (textStyleFlags = toTextStyleFlags(styleSpan.flags)) != 0) {
                s01 s01Var = new s01();
                s01Var.a = textStyleFlags;
                spannableStringBuilder.setSpan(new t01(s01Var, 0), spanStart, spanEnd, 33);
            }
        }
        return spannableStringBuilder;
    }

    private static int toTextStyleFlags(int i10) {
        int i11 = (i10 & 16) != 0 ? 1 : 0;
        if ((i10 & 32) != 0) {
            i11 |= 2;
        }
        if ((i10 & 64) != 0) {
            i11 |= 16;
        }
        if ((i10 & 128) != 0) {
            i11 |= 8;
        }
        if ((i10 & 256) != 0) {
            i11 |= 4;
        }
        if ((i10 & 2048) != 0) {
            i11 |= 16384;
        }
        if ((i10 & 4096) != 0) {
            i11 |= 32768;
        }
        return (i10 & 8192) != 0 ? 65536 | i11 : i11;
    }

    private void updateTranslationLoading() {
        View view;
        boolean isTranslating = isTranslating();
        if (!isTranslating && this.translationLoadingFloat == null) {
            this.translationLoadingValue = 0.0f;
            return;
        }
        if (this.translationLoadingFloat == null) {
            this.translationLoadingFloat = new org.telegram.ui.Components.z5(0L, 350L, mr.h);
        }
        float d = this.translationLoadingFloat.d(isTranslating ? 1.0f : 0.0f, false);
        this.translationLoadingValue = d;
        if (d <= 0.0f || (view = this.view) == null) {
            return;
        }
        view.invalidate();
    }

    public void attach(View view) {
        View view2 = this.view;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            detach(view2);
        }
        this.view = view;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).attach(view);
        }
    }

    public void checkQuoteLine(TLRPC.User user, TLRPC.Chat chat) {
        this.quoteLine.a(this.messageObject, user, chat, this.resourcesProvider, 1);
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || messageObject.isOutOwner() || this.messageObject.shouldDrawWithoutBackground() || hasCustomIncomingQuoteColor(user, chat)) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        this.quoteLine.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider), f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q());
    }

    public void collectMediaBlocks(List<TL_iv.PageBlock> list) {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichPhotoBlock) {
                list.add(((RichPhotoBlock) richBlock).block);
            } else if (richBlock instanceof RichVideoBlock) {
                list.add(((RichVideoBlock) richBlock).block);
            } else if (richBlock instanceof RichCollageBlock) {
                ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    MediaCell mediaCell = arrayList.get(i11);
                    i11++;
                    list.add(mediaCell.pageBlock);
                }
            } else if (richBlock instanceof RichSlideshowBlock) {
                ArrayList<MediaCell> arrayList2 = ((RichSlideshowBlock) richBlock).cells;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    MediaCell mediaCell2 = arrayList2.get(i12);
                    i12++;
                    list.add(mediaCell2.pageBlock);
                }
            }
        }
    }

    public void detach(View view) {
        View view2 = this.view;
        if (view2 == view && view2 != null) {
            ih.j jVar = this.spoilerEffect2;
            if (jVar != null) {
                jVar.b(view);
                this.spoilerEffect2 = null;
            }
            this.view = null;
            for (int i10 = 0; i10 < this.blocks.size(); i10++) {
                this.blocks.get(i10).detach(view);
            }
            if (view == this.cell) {
                this.cell = null;
                this.delegate = null;
            }
        }
    }

    public void draw(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.r1 r1Var) {
        Canvas canvas2;
        setBubblePaddings(i10, i11);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
        boolean z4 = this.isPart;
        int min = Math.min(this.height, AndroidUtilities.dp(900.0f));
        if (z4) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(-i10, 0.0f, getMinWidth() + i11, min, 255, 31);
        } else {
            canvas2 = canvas;
        }
        drawInternal(canvas2, r1Var);
        if (z4) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(-i10, min - AndroidUtilities.dp(32.0f), getMinWidth() + i11, min);
            this.clip.b(canvas2, rectF, 3, 1.0f);
            canvas2.restore();
            drawShowMoreButton(canvas2, min);
        }
    }

    public boolean drawOverlay(Canvas canvas) {
        return drawOverlay(canvas, null);
    }

    public FoundLink findLink(CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return null;
        }
        FoundLink foundLink = new FoundLink();
        boolean z4 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < this.blocks.size(); i11++) {
            RichBlock richBlock = this.blocks.get(i11);
            if (richBlock.isVisible()) {
                if (z4) {
                    i10 += getGap();
                }
                if (richBlock.findLink(characterStyle, i10, foundLink)) {
                    return foundLink;
                }
                i10 = richBlock.getHeight() + i10;
                z4 = true;
            }
        }
        return null;
    }

    public ImageReceiver findMediaImageReceiver(TL_iv.PageBlock pageBlock, int[] iArr) {
        ImageReceiver imageReceiver;
        TL_iv.PageBlock pageBlock2;
        ImageReceiver imageReceiver2;
        int i10 = 0;
        while (true) {
            TL_iv.PageBlock pageBlock3 = null;
            if (i10 >= this.blocks.size()) {
                return null;
            }
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichPhotoBlock) {
                RichPhotoBlock richPhotoBlock = (RichPhotoBlock) richBlock;
                pageBlock2 = richPhotoBlock.block;
                imageReceiver2 = richPhotoBlock.imageReceiver;
            } else if (richBlock instanceof RichVideoBlock) {
                RichVideoBlock richVideoBlock = (RichVideoBlock) richBlock;
                pageBlock2 = richVideoBlock.block;
                imageReceiver2 = richVideoBlock.imageReceiver;
            } else {
                if (richBlock instanceof RichCollageBlock) {
                    ArrayList<MediaCell> arrayList = ((RichCollageBlock) richBlock).cells;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        MediaCell mediaCell = arrayList.get(i11);
                        i11++;
                        MediaCell mediaCell2 = mediaCell;
                        if (mediaCell2.pageBlock == pageBlock) {
                            if (iArr != null && iArr.length >= 2) {
                                Rect rect = richBlock.padding;
                                iArr[0] = rect.left;
                                iArr[1] = richBlock.layoutY + rect.top;
                            }
                            return mediaCell2.imageReceiver;
                        }
                    }
                } else if (richBlock instanceof RichSlideshowBlock) {
                    RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                    int currentPage = richSlideshowBlock.getCurrentPage();
                    if (currentPage >= 0 && currentPage < richSlideshowBlock.cells.size() && richSlideshowBlock.cells.get(currentPage).pageBlock == pageBlock) {
                        if (iArr != null && iArr.length >= 2) {
                            Rect rect2 = richBlock.padding;
                            iArr[0] = rect2.left;
                            iArr[1] = richBlock.layoutY + rect2.top;
                        }
                        return richSlideshowBlock.cells.get(currentPage).imageReceiver;
                    }
                } else {
                    imageReceiver = null;
                    if (pageBlock3 == pageBlock && imageReceiver != null) {
                        if (iArr != null && iArr.length >= 2) {
                            Rect rect3 = richBlock.padding;
                            iArr[0] = rect3.left;
                            iArr[1] = richBlock.layoutY + rect3.top;
                        }
                        return imageReceiver;
                    }
                }
                i10++;
            }
            TL_iv.PageBlock pageBlock4 = pageBlock2;
            imageReceiver = imageReceiver2;
            pageBlock3 = pageBlock4;
            if (pageBlock3 == pageBlock) {
                if (iArr != null) {
                    Rect rect32 = richBlock.padding;
                    iArr[0] = rect32.left;
                    iArr[1] = richBlock.layoutY + rect32.top;
                }
                return imageReceiver;
            }
            continue;
            i10++;
        }
    }

    public boolean forceNewLineForTime() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return true;
        }
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                QuoteBackground quoteBackground = arrayList.get(i10);
                i10++;
                if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                    return true;
                }
            }
        }
        return ((RichBlock) kf.k0.i(1, this.blocks)).forcesTimeToNewLine();
    }

    public CharSequence formatText(TL_iv.RichText richText) {
        return formatText(richText, new SpannableStringBuilder(), 0);
    }

    public List<kj0> getAnimatorBlocks() {
        ArrayList arrayList = new ArrayList(this.blocks.size());
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).collectAnimatorBlocks(arrayList);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((kj0) arrayList.get(i11)).getClass();
        }
        return arrayList;
    }

    public org.telegram.ui.Cells.s1 getCell() {
        return this.cell;
    }

    public org.telegram.ui.Cells.j1 getDelegate() {
        return this.delegate;
    }

    public TLRPC.Document getDocument(long j10) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document = arrayList.get(i10);
            i10++;
            TLRPC.Document document2 = document;
            if (document2.id == j10) {
                return document2;
            }
        }
        return null;
    }

    public int getGap() {
        return 0;
    }

    public int getHeight() {
        if (!this.isPart || this.height <= AndroidUtilities.dp(900.0f)) {
            return this.height + (this.isPart ? AndroidUtilities.dp(50.0f) : 0);
        }
        return AndroidUtilities.dp(950.0f);
    }

    public int getLastLineWidth() {
        if (this.blocks.isEmpty() || this.isPart || isRtl()) {
            return getMinWidth();
        }
        if (!this.quotes.isEmpty()) {
            ArrayList<QuoteBackground> arrayList = this.quotes;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                QuoteBackground quoteBackground = arrayList.get(i10);
                i10++;
                if (quoteBackground.endBlockIndex >= this.blocks.size() - 1) {
                    return getMinWidth();
                }
            }
        }
        RichBlock richBlock = (RichBlock) kf.k0.i(1, this.blocks);
        return richBlock.forcesTimeToNewLine() ? getMinWidth() : richBlock.getLastLineWidth();
    }

    public ih.j getMediaSpoilerEffect() {
        View view = this.view;
        if (view == null) {
            return null;
        }
        ih.j jVar = this.spoilerEffect2;
        if (jVar != null && jVar.i) {
            this.spoilerEffect2 = null;
        }
        if (this.spoilerEffect2 == null) {
            this.spoilerEffect2 = ih.j.e(view);
        }
        return this.spoilerEffect2;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public TLRPC.Photo getPhoto(long j10) {
        TL_iv.RichMessage richMessage = this.richMessage;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            TLRPC.Photo photo2 = photo;
            if (photo2.id == j10) {
                return photo2;
            }
        }
        return null;
    }

    public String getSelectionHtml(int i10, int i11) {
        int min;
        int max;
        RichMessageLayout richMessageLayout = this;
        if (richMessageLayout.textBlocks.isEmpty() || (max = Math.max(i10, i11)) <= (min = Math.min(i10, i11))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<QuoteBackground> arrayList = new ArrayList<>();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int i12 = 0;
        int i13 = -1;
        while (i12 < richMessageLayout.textBlocks.size()) {
            Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
            if (layout != null && layout.getText() != null) {
                CharSequence text = layout.getText();
                int intValue = i12 < richMessageLayout.textBlockCharOffsets.size() ? richMessageLayout.textBlockCharOffsets.get(i12).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    int intValue2 = i12 < richMessageLayout.textBlockBlockIndex.size() ? richMessageLayout.textBlockBlockIndex.get(i12).intValue() : -1;
                    RichBlock richBlock = (intValue2 < 0 || intValue2 >= richMessageLayout.blocks.size()) ? null : richMessageLayout.blocks.get(intValue2);
                    String str = "";
                    if (!(richBlock instanceof RichTableBlock)) {
                        ArrayList<QuoteBackground> quotesFor = richMessageLayout.quotesFor(intValue2);
                        if (!sameQuotes(arrayList, quotesFor)) {
                            richMessageLayout.closeLists(sb, arrayList2);
                            richMessageLayout.syncQuotes(sb, arrayList, quotesFor);
                        }
                        int i14 = max2 - intValue;
                        int i15 = min2 - intValue;
                        int i16 = richBlock instanceof RichTextBlock ? ((RichTextBlock) richBlock).quoteAuthorStart : -1;
                        boolean z4 = (richBlock instanceof RichTextWithAuthorBlock) && ((RichTextWithAuthorBlock) richBlock).author == richMessageLayout.textBlocks.get(i12);
                        int i17 = richBlock != null ? richBlock.listLevel : 0;
                        if (i17 <= 0 || i16 >= 0) {
                            richMessageLayout.closeLists(sb, arrayList2);
                            if (richBlock instanceof RichPreformattedBlock) {
                                SpannableStringBuilder richHtmlSpannable = richMessageLayout.toRichHtmlSpannable(text.subSequence(i14, i15));
                                String str2 = ((RichPreformattedBlock) richBlock).language;
                                StringBuilder sb2 = new StringBuilder();
                                vh.y3.g(sb2, richHtmlSpannable);
                                String sb3 = sb2.toString();
                                if (!sb3.isEmpty()) {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (TextUtils.isEmpty(str2)) {
                                        sb4.append("<pre>");
                                    } else {
                                        sb4.append("<pre language=\"");
                                        sb4.append(vh.y3.s(str2));
                                        sb4.append("\">");
                                    }
                                    str = android.support.v4.media.a.r(sb4, sb3, "</pre>");
                                }
                                sb.append(str);
                            } else if (z4) {
                                richMessageLayout.appendSelectionPiece(sb, text, i14, i15, true);
                                richMessageLayout = this;
                            } else if (i16 < 0) {
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb, text, i14, i15, false);
                            } else {
                                richMessageLayout = this;
                                richMessageLayout.appendSelectionPiece(sb, text, i14, Math.min(i15, i16 > 0 ? i16 - 1 : 0), false);
                                richMessageLayout.appendSelectionPiece(sb, text, Math.max(i14, i16), i15, true);
                            }
                        } else {
                            richMessageLayout.syncLists(sb, arrayList2, i17, richBlock.listOrdered);
                            sb.append("<li");
                            if (richBlock.listCheckbox) {
                                sb.append(" data-checkbox=\"1\"");
                                if (richBlock.listChecked) {
                                    sb.append(" data-checked=\"1\"");
                                }
                            }
                            sb.append('>');
                            SpannableStringBuilder richHtmlSpannable2 = richMessageLayout.toRichHtmlSpannable(text.subSequence(i14, i15));
                            StringBuilder sb5 = new StringBuilder();
                            vh.y3.g(sb5, richHtmlSpannable2);
                            sb.append(sb5.toString());
                            sb.append("</li>");
                        }
                    } else if (intValue2 != i13) {
                        richMessageLayout.closeLists(sb, arrayList2);
                        richMessageLayout.syncQuotes(sb, arrayList, richMessageLayout.quotesFor(intValue2));
                        TL_iv.pageBlockTable pageblocktable = ((RichTableBlock) richBlock).pageBlock;
                        if (pageblocktable != null) {
                            StringBuilder sb6 = new StringBuilder();
                            vh.y3.H(sb6, pageblocktable);
                            str = sb6.toString();
                        }
                        sb.append(str);
                        i13 = intValue2;
                    }
                    i12++;
                }
            }
            i12++;
        }
        richMessageLayout.closeLists(sb, arrayList2);
        while (!arrayList.isEmpty()) {
            sb.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public ArrayList<RichUnsupportedBlock> getUnsupportedHoles() {
        return this.unsupportedBlocks;
    }

    public ArrayList<RichUnsupportedBlock> getUnsupportedHolesRoot() {
        return this.unsupportedBlocksRoot;
    }

    public boolean hasNameOffset() {
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        return s1Var != null && s1Var.Ic > 0;
    }

    public boolean hasOverlay() {
        org.telegram.ui.Components.q5 q5Var;
        if (!isOverlayActive()) {
            return false;
        }
        for (int i10 = 0; i10 < this.textBlocks.size(); i10++) {
            org.telegram.ui.Cells.w9 w9Var = this.textBlocks.get(i10);
            if ((w9Var instanceof Text) && (q5Var = ((Text) w9Var).animatedEmojiStack) != null && !q5Var.a.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasRootUnsupportedBlocks() {
        return !this.unsupportedBlocksRoot.isEmpty();
    }

    public boolean hasUnsupportedBlocks() {
        return !this.unsupportedBlocks.isEmpty();
    }

    public boolean isAttached() {
        return this.view != null;
    }

    public boolean isHorizontallyDragging() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isHorizontallyDragging();
    }

    public boolean isOut() {
        MessageObject messageObject = this.messageObject;
        return messageObject != null && messageObject.isOutOwner();
    }

    public boolean isOverlayActive() {
        mj0 mj0Var = this.typingAnimator;
        return mj0Var == null || !mj0Var.h;
    }

    public boolean isPinnedTop() {
        org.telegram.ui.Cells.s1 s1Var = this.cell;
        return s1Var != null && s1Var.n3();
    }

    public boolean isPressingLink() {
        RichBlock richBlock = this.pressedBlock;
        return richBlock != null && richBlock.isPressingLink();
    }

    public boolean isRtl() {
        TL_iv.RichMessage richMessage = this.richMessage;
        return richMessage != null && richMessage.rtl;
    }

    public boolean isTranslating() {
        if (this.forceTranslationLoading) {
            return true;
        }
        return this.messageObject != null && MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslating(this.messageObject);
    }

    public void layout(RichMessageLayout richMessageLayout) {
        boolean z4;
        this.height = 0;
        this.minWidth = 0;
        View view = this.view;
        if (view != null) {
            for (int i10 = 0; i10 < this.blocks.size(); i10++) {
                this.blocks.get(i10).detach(view);
            }
        }
        this.unsupportedBlocks.clear();
        this.unsupportedBlocksRoot.clear();
        this.blocks.clear();
        this.quotes.clear();
        this.anchors.clear();
        this.textAnchors.clear();
        this.audioMessages.clear();
        this.audioBlocks.clear();
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
        this.textBlockBlockIndex.clear();
        this.joinedText = "";
        this.fontSize = SharedConfig.fontSize;
        this.density = AndroidUtilities.density;
        this.textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
        this.numTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
        this.isPart = false;
        this.richMessage = null;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || messageObject.messageOwner == null || messageObject.getDisplayRichMessage() == null) {
            return;
        }
        TL_iv.RichMessage displayRichMessage = this.messageObject.getDisplayRichMessage();
        this.richMessage = displayRichMessage;
        this.isPart = displayRichMessage.part;
        this.prev = richMessageLayout;
        int i11 = 0;
        while (i11 < this.richMessage.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.richMessage.blocks.get(i11);
            RichBlock emitBlock = emitBlock(pageBlock, 0, new Rect(), 0, previousBlockIsParagraph(this.richMessage.blocks, i11));
            if ((emitBlock instanceof RichTextBlock) && (((z4 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.n4.K(pageBlock))) {
                RichTextBlock richTextBlock = (RichTextBlock) emitBlock;
                richTextBlock.setContentPadding((i11 == 0 && z4) ? 0 : richTextBlock.contentPaddingTop, i11 == this.richMessage.blocks.size() + (-1) ? 0 : richTextBlock.contentPaddingBottom);
            }
            i11++;
        }
        applyListPaddingFromBlocks();
        this.prev = null;
        if (this.typingAnimator != null) {
            for (int i12 = 0; i12 < this.blocks.size(); i12++) {
                this.blocks.get(i12).typingAnimator = this.typingAnimator;
            }
            this.typingAnimator.l(getAnimatorBlocks());
        }
        if (view != null) {
            for (int i13 = 0; i13 < this.blocks.size(); i13++) {
                this.blocks.get(i13).attach(view);
            }
        }
        reposition();
        snapshotForDetailsAnimation();
    }

    public boolean needsUpdate(TL_iv.RichMessage richMessage, int i10) {
        return (this.richMessage == richMessage && this.fontSize == SharedConfig.fontSize && Math.abs(this.density - AndroidUtilities.density) <= 0.1f && i10 == this.maxWidth) ? false : true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 || (motionEvent.getX() >= this.padLeft && motionEvent.getX() <= getMinWidth() + this.padRight)) {
            if (this.isPart) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (actionMasked == 0) {
                    if (this.showMoreRect.contains(x10, y10)) {
                        this.showMorePressed = true;
                        org.telegram.ui.Components.rc rcVar = this.showMoreBounce;
                        if (rcVar != null) {
                            rcVar.c(true);
                            return true;
                        }
                        return true;
                    }
                } else if (this.showMorePressed) {
                    if (actionMasked == 2) {
                        if (!this.showMoreRect.contains(x10, y10)) {
                            org.telegram.ui.Components.rc rcVar2 = this.showMoreBounce;
                            if (rcVar2 != null) {
                                rcVar2.c(false);
                            }
                            this.showMorePressed = false;
                            return true;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        org.telegram.ui.Components.rc rcVar3 = this.showMoreBounce;
                        if (rcVar3 != null) {
                            rcVar3.c(false);
                        }
                        boolean z4 = actionMasked == 1 && this.showMoreRect.contains(x10, y10);
                        this.showMorePressed = false;
                        if (z4 && this.delegate != null && this.cell != null) {
                            View view = this.view;
                            if (view != null) {
                                view.performHapticFeedback(3, 2);
                            }
                            this.delegate.K0(this.cell);
                        }
                    }
                    return true;
                }
            }
            if (actionMasked == 0) {
                this.pressedBlock = null;
                float y11 = motionEvent.getY();
                int i10 = 0;
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    if (i10 >= this.blocks.size()) {
                        break;
                    }
                    RichBlock richBlock = this.blocks.get(i10);
                    if (richBlock.isVisible()) {
                        if (z10) {
                            i11 += getGap();
                        }
                        int height = richBlock.getHeight();
                        float f10 = i11;
                        if (y11 < f10 || y11 >= i11 + height) {
                            i11 += height;
                            z10 = true;
                        } else {
                            motionEvent.offsetLocation(0.0f, -i11);
                            boolean z11 = richBlock.touchEvent(motionEvent);
                            motionEvent.offsetLocation(0.0f, f10);
                            if (z11) {
                                this.pressedBlock = richBlock;
                                this.pressedBlockY = i11;
                                return true;
                            }
                        }
                    }
                    i10++;
                }
            } else if (this.pressedBlock != null) {
                motionEvent.offsetLocation(0.0f, -this.pressedBlockY);
                boolean z12 = this.pressedBlock.touchEvent(motionEvent);
                motionEvent.offsetLocation(0.0f, this.pressedBlockY);
                if (actionMasked != 1 && actionMasked != 3) {
                    return z12;
                }
                this.pressedBlock = null;
                return z12;
            }
        }
        return false;
    }

    public void reposition() {
        this.height = 0;
        this.minWidth = 0;
        this.textBlocks.clear();
        this.textBlockCharOffsets.clear();
        this.textBlockBlockIndex.clear();
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.minWidth = Math.max(this.minWidth, this.blocks.get(i10).getMinWidth());
        }
        for (int i11 = 0; i11 < this.blocks.size(); i11++) {
            RichBlock richBlock = this.blocks.get(i11);
            if (richBlock instanceof RichTableBlock) {
                ((RichTableBlock) richBlock).resolveWidth(this.minWidth);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i12 = 0;
        boolean z4 = false;
        for (int i13 = 0; i13 < this.blocks.size(); i13++) {
            RichBlock richBlock2 = this.blocks.get(i13);
            boolean isVisible = richBlock2.isVisible();
            if (isVisible && z4) {
                i12 += getGap();
            }
            richBlock2.currY = i12;
            richBlock2.currH = 0;
            richBlock2.currVisible = isVisible;
            Rect rect = richBlock2.padding;
            richBlock2.placeTexts(rect.left, rect.top + i12, i13);
            if (isVisible) {
                org.telegram.ui.Cells.w9[] text = richBlock2.getText();
                if (text != null) {
                    for (org.telegram.ui.Cells.w9 w9Var : text) {
                        if (w9Var != null && w9Var.getLayout() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            this.textBlockCharOffsets.add(Integer.valueOf(sb.length()));
                            this.textBlockBlockIndex.add(Integer.valueOf(i13));
                            this.textBlocks.add(w9Var);
                            CharSequence text2 = w9Var.getLayout().getText();
                            if (text2 != null) {
                                sb.append(text2);
                            }
                        }
                    }
                }
                int height = richBlock2.getHeight();
                richBlock2.currH = height;
                i12 += height;
                z4 = true;
            }
        }
        this.height = i12;
        this.joinedText = sb;
    }

    public void setChatMessageCellDelegate(org.telegram.ui.Cells.s1 s1Var, org.telegram.ui.Cells.j1 j1Var) {
        this.cell = s1Var;
        this.delegate = j1Var;
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.resourcesProvider = f6Var;
    }

    public boolean setSlideshowPage(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock instanceof RichSlideshowBlock) {
                RichSlideshowBlock richSlideshowBlock = (RichSlideshowBlock) richBlock;
                for (int i11 = 0; i11 < richSlideshowBlock.cells.size(); i11++) {
                    if (richSlideshowBlock.cells.get(i11).pageBlock == pageBlock) {
                        richSlideshowBlock.setCurrentPage(i11);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setTypingAnimator(mj0 mj0Var) {
        this.typingAnimator = mj0Var;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).typingAnimator = mj0Var;
            this.blocks.get(i10);
            this.blocks.get(i10).getClass();
        }
    }

    public void snapshotForBlockquoteAnimation() {
        snapshotForDetailsAnimation();
    }

    public void snapshotForDetailsAnimation() {
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            this.blocks.get(i10).snapshot();
        }
    }

    public boolean startsWithMedia() {
        if (this.blocks.isEmpty()) {
            return false;
        }
        RichBlock richBlock = this.blocks.get(0);
        return (richBlock instanceof RichPhotoBlock) || (richBlock instanceof RichVideoBlock) || (richBlock instanceof RichCollageBlock) || (richBlock instanceof RichSlideshowBlock);
    }

    public void updateAnimatedEmojis(int i10) {
        for (int i11 = 0; i11 < this.textBlocks.size(); i11++) {
            org.telegram.ui.Cells.w9 w9Var = this.textBlocks.get(i11);
            if (w9Var instanceof Text) {
                ((Text) w9Var).refreshAnimatedEmoji(i10);
            }
        }
    }

    public boolean drawOverlay(Canvas canvas, ColorFilter colorFilter) {
        if (!isOverlayActive()) {
            return false;
        }
        boolean z4 = false;
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.currVisible) {
                canvas.save();
                canvas.translate(0.0f, richBlock.currY);
                if (richBlock.drawOverlay(canvas, colorFilter)) {
                    z4 = true;
                }
                canvas.restore();
            }
        }
        return z4;
    }

    public CharSequence formatText(TL_iv.RichText richText, int i10) {
        return i10 == 0 ? formatText(richText, new SpannableStringBuilder(), 0) : formatTextAndSetSpan(richText, new SpannableStringBuilder(), i10, new StyleSpan(this, i10));
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichUnsupportedBlock extends RichBlock implements Drawable.Callback {
        public final int index;
        public final int level;
        public Bitmap tornBitmap;
        public x21 tornParams;
        public final j61 unsupportedBlockDrawable;
        public final int unsupportedBlockHeight;
        public final int unsupportedBlockWidth;

        public RichUnsupportedBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, int i11, int i12) {
            super(richMessageLayout, rect, i10);
            this.index = i11;
            this.level = i12;
            org.telegram.ui.ActionBar.f6 f6Var = richMessageLayout.resourcesProvider;
            j61 j61Var = new j61();
            this.unsupportedBlockDrawable = j61Var;
            j61Var.setCallback(this);
            j61Var.n = LocaleController.getString(R.string.UnsupportedBlockTitle);
            j61Var.o = LocaleController.getString(R.string.UnsupportedBlockMessage);
            j61Var.p = LocaleController.getString(R.string.UnsupportedUpdate);
            j61Var.j = new xg(richMessageLayout, 9);
            int i13 = this.maxWidth;
            this.unsupportedBlockWidth = i13;
            this.unsupportedBlockHeight = j61Var.a(i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(RichMessageLayout richMessageLayout) {
            if (richMessageLayout.delegate != null) {
                richMessageLayout.delegate.j();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void draw(Canvas canvas) {
            j61 j61Var = this.unsupportedBlockDrawable;
            Rect rect = this.padding;
            int i10 = rect.left;
            int i11 = rect.top;
            j61Var.setBounds(i10, i11, this.unsupportedBlockWidth + i10, this.unsupportedBlockHeight + i11);
            this.unsupportedBlockDrawable.draw(canvas);
        }

        public float getHeight(org.telegram.ui.Cells.r1 r1Var) {
            int i10;
            if (r1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    i10 = AndroidUtilities.lerp(this.prevH, this.currH, Math.max(0.0f, Math.min(1.0f, r1Var.K1)));
                    return i10;
                }
            }
            i10 = this.currH;
            return i10;
        }

        public float getY(org.telegram.ui.Cells.r1 r1Var) {
            if (r1Var != null) {
                RichMessageLayout richMessageLayout = this.root;
                if (richMessageLayout.detailsAnimating || richMessageLayout.blockquoteAnimating) {
                    return AndroidUtilities.lerp(this.prevY, this.currY, Math.max(0.0f, Math.min(1.0f, r1Var.K1)));
                }
            }
            return this.currY;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View view = this.view;
            return view != null ? this.unsupportedBlockDrawable.i.a(motionEvent, view) : super.onTouchEvent(motionEvent);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.unsupportedBlockHeight + rect.bottom;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        }
    }

    public static void getString(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!vh.y5.j(textdiff.text)) {
                getString(textdiff.text, sb);
                return;
            } else {
                if (vh.y5.j(textdiff.old_text)) {
                    return;
                }
                getString(textdiff.old_text, sb);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                getString(richText.texts.get(i10), sb);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            getString(richText2, sb);
        }
    }

    public CharSequence formatText(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10) {
        Object size;
        if (richText instanceof TL_iv.textEmpty) {
            return spannableStringBuilder;
        }
        if (richText instanceof TL_iv.textPlain) {
            spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            return spannableStringBuilder;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = vh.y5.j(textdiff.text);
            boolean j11 = vh.y5.j(textdiff.old_text);
            if (j10 && !j11) {
                formatTextAndSetSpan(textdiff.old_text, spannableStringBuilder, i10, new t01(getTextStyleRun(8192), 0));
                return spannableStringBuilder;
            }
            if (!j10 && j11) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i10, new t01(getTextStyleRun(4096), 0));
                return spannableStringBuilder;
            }
            if (!j10) {
                formatTextAndSetSpan(textdiff.text, spannableStringBuilder, i10, new cw0());
                return spannableStringBuilder;
            }
        } else {
            if (richText instanceof TL_iv.textBold) {
                int i11 = i10 | 16;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i11, new StyleSpan(this, i11));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textItalic) {
                int i12 = i10 | 32;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i12, new StyleSpan(this, i12));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textUnderline) {
                int i13 = i10 | 64;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i13, new StyleSpan(this, i13));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textStrike) {
                int i14 = i10 | 128;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i14, new StyleSpan(this, i14));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textFixed) {
                int i15 = i10 | 256;
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i15, new StyleSpan(this, i15));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textUrl) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51(((TL_iv.textUrl) richText).url, getTextStyleRun(1024)));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textEmail) {
                formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51("mailto:" + ((TL_iv.textEmail) richText).email, getTextStyleRun(1024)));
                return spannableStringBuilder;
            }
            if (richText instanceof TL_iv.textConcat) {
                for (int i16 = 0; i16 < richText.texts.size(); i16++) {
                    formatText(richText.texts.get(i16), spannableStringBuilder, i10);
                }
            } else {
                if (richText instanceof TL_iv.textSubscript) {
                    int i17 = i10 | 2048;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i17, new StyleSpan(this, i17));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textSuperscript) {
                    int i18 = i10 | 4096;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i18, new StyleSpan(this, i18));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textMarked) {
                    int i19 = i10 | 8192;
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i19, new StyleSpan(this, i19));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = se.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = vh.w2.e("+", d);
                    }
                    formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51(vh.w2.e("tel:", d), getTextStyleRun(1024)));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.textAnchors.put(lowerCase, textanchor);
                        } else if (!this.anchors.containsKey(lowerCase)) {
                            this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                        }
                    }
                    TL_iv.RichText richText2 = richText.text;
                    String str2 = textanchor.name;
                    formatTextAndSetSpan(richText2, spannableStringBuilder, i10, new AnchorSpan(str2 != null ? str2.toLowerCase() : ""));
                    return spannableStringBuilder;
                }
                if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        vh.r a2 = vh.r.a(textmath.source, AndroidUtilities.dp(this.fontSize + 4), true);
                        if (a2 != null) {
                            textmath.w = a2.b;
                            textmath.h = a2.c;
                            textmath.depth = a2.d;
                            textmath.bitmap = a2.a;
                        }
                    }
                    if (textmath.bitmap == null) {
                        String str3 = textmath.source;
                        return str3 == null ? "" : str3;
                    }
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(" ");
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.setSpan(new l01(null, textmath.bitmap, textmath.w, textmath.h, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourcesProvider), textmath.depth), length, length2, 33);
                    String str4 = textmath.source;
                    if (str4 != null && !str4.isEmpty()) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.r9(textmath.source), length, length2, 33);
                        return spannableStringBuilder;
                    }
                } else {
                    if (richText instanceof TL_iv.textCustomEmoji) {
                        TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                        CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append(charSequence);
                        int length4 = spannableStringBuilder.length();
                        boolean a10 = k7.w8.a(i10, 13);
                        int i20 = i10 & 15;
                        if (i20 >= 1 && i20 <= 6) {
                            TextPaint textPaint = new TextPaint(this.textPaint);
                            new StyleSpan(this, i10, true).applyStyle(textPaint);
                            size = new org.telegram.ui.Components.u5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                        } else {
                            size = new org.telegram.ui.Components.u5(textcustomemoji.document_id, a10 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(AndroidUtilities.dp(this.fontSize + 4 + (a10 ? -2 : 4)));
                        }
                        spannableStringBuilder.setSpan(size, length3, length4, 33);
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textSpoiler) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new t01(getTextStyleRun(256), 0));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textMention) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        s01 s01Var = new s01();
                        s01Var.d = tL_messageEntityMention;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new m51(getString(richText), s01Var));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textHashtag) {
                        TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                        s01 s01Var2 = new s01();
                        s01Var2.d = tL_messageEntityHashtag;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new m51(getString(richText), s01Var2));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textBotCommand) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new j51(getString(richText), isOut() ? 1 : 0, null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textCashtag) {
                        TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                        s01 s01Var3 = new s01();
                        s01Var3.d = tL_messageEntityCashtag;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new m51(getString(richText), s01Var3));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoUrl) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51(getString(richText), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoEmail) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51(vh.w2.e("mailto:", getString(richText)), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textAutoPhone) {
                        String string = getString(richText);
                        String d10 = se.b.d(string, false);
                        if (string.startsWith("+")) {
                            d10 = vh.w2.e("+", d10);
                        }
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new o51(vh.w2.e("tel:", d10), getTextStyleRun(1024)));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textBankCard) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new m51(vh.w2.e("card:", getString(richText)), (s01) null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textMentionName) {
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i10, new p51("" + ((TL_iv.textMentionName) richText).user_id, isOut() ? 1 : 0, null));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textDate) {
                        TL_iv.textDate textdate = (TL_iv.textDate) richText;
                        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                        tL_messageEntityFormattedDate.relative = textdate.relative;
                        tL_messageEntityFormattedDate.short_time = textdate.short_time;
                        tL_messageEntityFormattedDate.long_time = textdate.long_time;
                        tL_messageEntityFormattedDate.short_date = textdate.short_date;
                        tL_messageEntityFormattedDate.long_date = textdate.long_date;
                        tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                        tL_messageEntityFormattedDate.date = textdate.date;
                        int i21 = i10 | 512;
                        formatTextAndSetSpan(richText.text, spannableStringBuilder, i21, new StyleSpan(this, i21), new i10(getString(richText), null, tL_messageEntityFormattedDate));
                        return spannableStringBuilder;
                    }
                    if (richText instanceof TL_iv.textButton) {
                        int length5 = spannableStringBuilder.length();
                        spannableStringBuilder.append("*");
                        RichButtonSpan richButtonSpan = new RichButtonSpan(this, this.maxWidth, (TL_iv.textButton) richText);
                        richButtonSpan.scale = 1.2f;
                        spannableStringBuilder.setSpan(richButtonSpan, length5, spannableStringBuilder.length(), 33);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    private void drawInternal(Canvas canvas, org.telegram.ui.Cells.r1 r1Var, boolean z4, float f10, float f11) {
        float lerp;
        float f12;
        RichDetailsBlock richDetailsBlock;
        drawBackground(canvas, r1Var);
        updateTranslationLoading();
        float f13 = 0.0f;
        float max = (r1Var == null || !(this.detailsAnimating || this.blockquoteAnimating)) ? 1.0f : Math.max(0.0f, Math.min(1.0f, r1Var.K1));
        this.detailsAnimationProgress = max;
        if (max >= 1.0f) {
            this.detailsAnimating = false;
            this.blockquoteAnimating = false;
        }
        boolean z10 = this.detailsAnimating;
        boolean z11 = (z10 || this.blockquoteAnimating) ? false : z4;
        boolean z12 = z10 && max < 1.0f;
        if (z12) {
            computeDetailsClips(max);
        }
        computeBlockquoteClips(max);
        for (int i10 = 0; i10 < this.blocks.size(); i10++) {
            RichBlock richBlock = this.blocks.get(i10);
            if (richBlock.currVisible || richBlock.prevVisible) {
                float lerp2 = AndroidUtilities.lerp(richBlock.prevY, richBlock.currY, max);
                boolean z13 = richBlock instanceof RichDetailsEndBlock;
                if (z13) {
                    lerp = 1.0f;
                } else {
                    lerp = AndroidUtilities.lerp(richBlock.prevVisible ? 1.0f : 0.0f, richBlock.currVisible ? 1.0f : 0.0f, max);
                }
                if (lerp > f13) {
                    int height = richBlock.getHeight();
                    if (!z11 || (height + lerp2 > f10 && lerp2 < f11)) {
                        canvas.save();
                        if (!z12 || (richDetailsBlock = richBlock.parentDetails) == null || z13) {
                            f12 = 1.0f;
                        } else {
                            float f14 = -3.4028235E38f;
                            float f15 = Float.MAX_VALUE;
                            for (richDetailsBlock = richBlock.parentDetails; richDetailsBlock != null; richDetailsBlock = richDetailsBlock.parentDetails) {
                                f14 = Math.max(f14, richDetailsBlock.animClipTop);
                                f15 = Math.min(f15, richDetailsBlock.animClipBottom);
                            }
                            f12 = 1.0f;
                            if (f15 <= f14) {
                                canvas.restore();
                            } else {
                                canvas.clipRect(-this.padLeft, f14, getMinWidth() + this.padRight, f15);
                                f13 = 0.0f;
                            }
                        }
                        canvas.translate(f13, lerp2);
                        if (lerp < f12) {
                            int saveLayerAlpha = canvas.saveLayerAlpha(-this.padLeft, 0.0f, getMinWidth() + this.padRight, height, (int) (lerp * 255.0f), 31);
                            richBlock.drawWithTyping(canvas);
                            canvas.restoreToCount(saveLayerAlpha);
                        } else {
                            richBlock.drawWithTyping(canvas);
                        }
                        canvas.restore();
                    }
                }
            }
        }
        if (max >= 1.0f) {
            snapshotForDetailsAnimation();
        }
    }

    private CharSequence formatTextAndSetSpan(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, Object obj, Object obj2) {
        int length = spannableStringBuilder.length();
        formatText(richText, spannableStringBuilder, i10);
        if (spannableStringBuilder.length() > length) {
            setSpansWithoutClash(obj, spannableStringBuilder, length, spannableStringBuilder.length());
            setSpansWithoutClash(obj2, spannableStringBuilder, length, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    public void draw(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        setBubblePaddings(i10, i11);
        this.textPaint.linkColor = getThemedColor(isOut() ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.gc);
        drawInternal(canvas, r1Var, f11 > f10, f10, f11);
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class MediaCell implements DownloadController.FileDownloadProgressListener {
        private static ColorMatrixColorFilter fancyBlurFilter;
        public final float aspectRatio;
        public boolean autoDownload;
        public final ImageReceiver blurImageReceiver;
        private Bitmap blurSource;
        private boolean buttonPressed;
        private final int buttonSize;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        public final TLRPC.Document document;
        public int h;
        public final ImageReceiver imageReceiver;
        public final boolean isVideo;
        private boolean mediaForced;
        private final int observerTag;
        public final TL_iv.PageBlock pageBlock;
        private View parentView;
        public final TLRPC.Photo photo;
        private boolean photoPressed;
        public final TLRPC.PhotoSize previewThumb;
        public RadialProgress2 radialProgress;
        public final boolean realVideo;
        public final RichMessageLayout root;
        public final TLRPC.PhotoSize sizeFull;
        private final SpoilerReveal spoilerReveal;
        public final TLRPC.PhotoSize strippedSize;
        public final TLRPC.PhotoSize strippedThumb;
        public int w;
        public int x;
        public int y;

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockPhoto pageblockphoto) {
            int i10;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.spoilerReveal = new SpoilerReveal();
            this.root = richMessageLayout;
            this.pageBlock = pageblockphoto;
            TLRPC.Photo photo = richMessageLayout.getPhoto(pageblockphoto.photo_id);
            this.photo = photo;
            if (photo != null) {
                this.sizeFull = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                this.strippedSize = FileLoader.getStrippedPhotoSize(photo.sizes);
            } else {
                this.sizeFull = null;
                this.strippedSize = null;
            }
            this.document = null;
            this.previewThumb = null;
            this.strippedThumb = null;
            this.isVideo = false;
            this.realVideo = false;
            TLRPC.PhotoSize photoSize = this.sizeFull;
            this.aspectRatio = (photoSize == null || (i10 = photoSize.h) <= 0) ? 1.0f : photoSize.w / i10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        }

        private boolean allowAutoplay() {
            return this.realVideo ? SharedConfig.isAutoplayVideo() : SharedConfig.isAutoplayGifs();
        }

        private void applyImage(boolean z4) {
            TLRPC.Photo photo = this.photo;
            if (photo != null && this.sizeFull != null) {
                TLRPC.PhotoSize photoSize = this.strippedSize;
                ImageLocation forPhoto = photoSize != null ? ImageLocation.getForPhoto(photoSize, photo) : null;
                if (z4) {
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(this.sizeFull, this.photo), null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                } else {
                    this.imageReceiver.setImage(null, null, null, null, forPhoto, "b1", null, this.sizeFull.size, null, this.root.messageObject, 1);
                    return;
                }
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                TLRPC.PhotoSize photoSize2 = this.strippedThumb;
                ImageLocation forDocument = photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null;
                TLRPC.PhotoSize photoSize3 = this.previewThumb;
                ImageLocation forDocument2 = photoSize3 != null ? ImageLocation.getForDocument(photoSize3, this.document) : null;
                if (!z4 || !this.isVideo || (!allowAutoplay() && !this.mediaForced)) {
                    this.imageReceiver.setImage(null, null, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
                    return;
                }
                this.imageReceiver.setAllowStartAnimation(true);
                this.imageReceiver.setAutoRepeat(1);
                this.imageReceiver.setImage(ImageLocation.getForDocument(this.document), ImageLoader.AUTOPLAY_FILTER, forDocument2, null, forDocument, "b1", null, this.document.size, "mp4", this.root.messageObject, 1);
            }
        }

        private boolean computeAutoDownload() {
            if (this.document == null) {
                return (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
            }
            if (this.isVideo) {
                return allowAutoplay() && DownloadController.getInstance(this.root.currentAccount).canDownloadMedia(4, this.document.size);
            }
            return true;
        }

        private void didPressButton(View view, boolean z4) {
            int i10 = this.buttonState;
            if (i10 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z4);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z4);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z4);
                }
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.r2(this.root.cell, this.pageBlock);
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress24 = this.radialProgress;
            if (radialProgress24 != null) {
                radialProgress24.setIcon(4, false, z4);
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private void drawSpoiler(Canvas canvas) {
            Canvas canvas2;
            prepareBlurImage();
            float imageX = this.imageReceiver.getImageX();
            float imageY = this.imageReceiver.getImageY();
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            if (imageWidth <= 0.0f || imageHeight <= 0.0f) {
                return;
            }
            canvas.save();
            canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
            this.spoilerReveal.clipOut(canvas);
            if (this.blurImageReceiver.getBitmap() != null) {
                this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                this.blurImageReceiver.draw(canvas);
            }
            ih.j mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
            if (mediaSpoilerEffect != null) {
                canvas.translate(imageX, imageY);
                canvas2 = canvas;
                mediaSpoilerEffect.c(canvas2, this.parentView, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha(), false);
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }

        public static MediaCell forPageBlock(RichMessageLayout richMessageLayout, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return new MediaCell(richMessageLayout, (TL_iv.pageBlockPhoto) pageBlock);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return new MediaCell(richMessageLayout, (TL_iv.pageBlockVideo) pageBlock);
            }
            return null;
        }

        private boolean isOnButton(float f10, float f11) {
            if (this.buttonState == -1) {
                return false;
            }
            if (f10 < this.buttonX) {
                return false;
            }
            int i10 = this.buttonSize;
            if (f10 > r0 + i10) {
                return false;
            }
            int i11 = this.buttonY;
            return f11 >= ((float) i11) && f11 <= ((float) (i11 + i10));
        }

        private boolean isSpoiler() {
            TL_iv.PageBlock pageBlock = this.pageBlock;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
            }
            return false;
        }

        private void prepareBlurImage() {
            Bitmap bitmap;
            if ((this.blurImageReceiver.getBitmap() != null && this.imageReceiver.getAnimation() != null) || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
                return;
            }
            if (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null) {
                this.blurSource = bitmap;
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (fancyBlurFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                this.blurImageReceiver.setColorFilter(fancyBlurFilter);
            }
        }

        public void attach(View view) {
            this.parentView = view;
            this.imageReceiver.setParentView(view);
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.setParentView(view);
            this.blurImageReceiver.onAttachedToWindow();
            ensureProgress(view);
            updateButtonState(view, false);
        }

        public void detach() {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.blurSource = null;
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        public void draw(Canvas canvas) {
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawSpoiler(canvas);
                return;
            }
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 == null || this.buttonState == -1) {
                return;
            }
            radialProgress2.draw(canvas);
        }

        public void ensureProgress(View view) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || view == null) {
                if (radialProgress2 == null || view == null) {
                    return;
                }
                radialProgress2.m(view);
                RadialProgress2 radialProgress22 = this.radialProgress;
                int i10 = this.buttonX;
                int i11 = this.buttonY;
                int i12 = this.buttonSize;
                radialProgress22.q(i10, i11, i10 + i12, i12 + i11);
                return;
            }
            RadialProgress2 radialProgress23 = new RadialProgress2(view, null);
            this.radialProgress = radialProgress23;
            radialProgress23.d = -1;
            radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress24 = this.radialProgress;
            int i13 = this.buttonX;
            int i14 = this.buttonY;
            int i15 = this.buttonSize;
            radialProgress24.q(i13, i14, i13 + i15, i15 + i14);
        }

        public boolean fileExists() {
            if (this.sizeFull != null) {
                File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, true);
                File pathToAttach2 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.sizeFull, false);
                return pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
            }
            if (this.document == null) {
                return true;
            }
            File pathToAttach3 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document);
            File pathToAttach4 = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true);
            return (pathToAttach3 != null && pathToAttach3.exists()) || (pathToAttach4 != null && pathToAttach4.exists());
        }

        public CharSequence getAccessibilityText() {
            String string = LocaleController.getString(this.isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
        }

        public String getFileName() {
            TLRPC.PhotoSize photoSize = this.sizeFull;
            if (photoSize != null) {
                return FileLoader.getAttachFileName(photoSize);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                return FileLoader.getAttachFileName(document);
            }
            return null;
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.observerTag;
        }

        public boolean isInside(float f10, float f11) {
            if (f10 < this.x || f10 > r0 + this.w) {
                return false;
            }
            int i10 = this.y;
            return f11 >= ((float) i10) && f11 <= ((float) (i10 + this.h));
        }

        public boolean onAccessibilityClick(View view) {
            if (!isSpoiler() || this.spoilerReveal.isRevealing()) {
                if (this.root.delegate == null) {
                    return false;
                }
                this.root.delegate.r2(this.root.cell, this.pageBlock);
                return true;
            }
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
            return true;
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z4) {
            updateButtonState(this.parentView, false);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j10, long j11) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(this.parentView, true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(1.0f, true);
            }
            if (this.isVideo && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(this.parentView, true);
        }

        public boolean onTouchEvent(MotionEvent motionEvent, View view) {
            int i10;
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean isInside = isInside(x10, y10);
            boolean isOnButton = isOnButton(x10, y10);
            if (actionMasked == 0) {
                if (isInside && (isOnButton || (i10 = this.buttonState) == 0 || i10 == 2)) {
                    this.buttonPressed = true;
                    if (view != null) {
                        view.invalidate();
                    }
                    return true;
                }
                if (!isInside) {
                    return false;
                }
                this.photoPressed = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return this.photoPressed || this.buttonPressed;
                }
                this.photoPressed = false;
                this.buttonPressed = false;
                return false;
            }
            if (this.buttonPressed) {
                this.buttonPressed = false;
                if (view != null) {
                    view.playSoundEffect(0);
                    view.invalidate();
                }
                didPressButton(view, true);
                return true;
            }
            if (this.photoPressed) {
                this.photoPressed = false;
                if (isInside) {
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                        float imageWidth = this.imageReceiver.getImageWidth();
                        float imageHeight = this.imageReceiver.getImageHeight();
                        this.spoilerReveal.start(view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
                    } else if (this.root.delegate != null) {
                        this.root.delegate.r2(this.root.cell, this.pageBlock);
                    }
                    return true;
                }
            }
            return false;
        }

        public void setRect(int i10, int i11, int i12, int i13) {
            this.x = i10;
            this.y = i11;
            this.w = i12;
            this.h = i13;
            this.imageReceiver.setImageCoords(i10, i11, i12, i13);
            int i14 = this.buttonSize;
            int d = kf.k0.d(i12, i14, 2, i10);
            this.buttonX = d;
            int d10 = kf.k0.d(i13, i14, 2, i11);
            this.buttonY = d10;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.q(d, d10, d + i14, i14 + d10);
            }
            boolean computeAutoDownload = computeAutoDownload();
            this.autoDownload = computeAutoDownload;
            applyImage(computeAutoDownload || fileExists());
        }

        public void updateButtonState(View view, boolean z4) {
            if (view == null) {
                view = this.parentView;
            }
            ensureProgress(view);
            String fileName = getFileName();
            if (TextUtils.isEmpty(fileName)) {
                this.buttonState = -1;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setIcon(4, false, false);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.y5 animation = this.imageReceiver.getAnimation();
            boolean z10 = animation != null && (animation.s() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (this.isVideo && z10)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (this.realVideo && !z10) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress22 = this.radialProgress;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, false, z4);
                    }
                } else if (!this.isVideo || z10 || allowAutoplay() || this.mediaForced) {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress23 = this.radialProgress;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(4, false, z4);
                    }
                } else {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(8, false, z4);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    r2 = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress25 = this.radialProgress;
                    if (radialProgress25 != null) {
                        radialProgress25.setIcon(3, true, z4);
                    }
                } else if (this.realVideo) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z4);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z4);
                    }
                }
                RadialProgress2 radialProgress28 = this.radialProgress;
                if (radialProgress28 != null) {
                    radialProgress28.o(r2, false);
                }
            }
            if (view != null) {
                view.invalidate();
            }
        }

        private MediaCell(RichMessageLayout richMessageLayout, TL_iv.pageBlockVideo pageblockvideo) {
            float f10;
            int i10;
            this.imageReceiver = new ImageReceiver();
            this.blurImageReceiver = new ImageReceiver();
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.spoilerReveal = new SpoilerReveal();
            this.root = richMessageLayout;
            this.pageBlock = pageblockvideo;
            this.photo = null;
            this.sizeFull = null;
            this.strippedSize = null;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockvideo.video_id);
            this.document = document;
            boolean isVideoDocument = MessageObject.isVideoDocument(document);
            this.realVideo = isVideoDocument;
            this.isVideo = isVideoDocument || MessageObject.isGifDocument(document);
            if (document != null) {
                this.previewThumb = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                this.strippedThumb = FileLoader.getStrippedPhotoSize(document.thumbs);
            } else {
                this.previewThumb = null;
                this.strippedThumb = null;
            }
            if (document != null) {
                for (int i11 = 0; i11 < this.document.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = this.document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i10 = documentAttribute.h) > 0) {
                        f10 = documentAttribute.w / i10;
                        break;
                    }
                }
            }
            f10 = 1.0f;
            this.aspectRatio = f10;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            this.imageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.blurImageReceiver.setAllowLoadingOnAttachedOnly(true);
            this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.messenger.RichMessageLayout.MediaCell.1
                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public final /* synthetic */ void didSetImageBitmap(int i12, String str, Drawable drawable) {
                    j5.a(this, i12, str, drawable);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    MediaCell mediaCell = MediaCell.this;
                    mediaCell.updateButtonState(mediaCell.parentView, true);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
                }
            });
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j10, long j11, boolean z4) {
        }
    }

    private RichMessageLayout(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.unsupportedBlocks = new ArrayList<>();
        this.unsupportedBlocksRoot = new ArrayList<>();
        this.blocks = new ArrayList<>();
        this.quotes = new ArrayList<>();
        this.anchors = new HashMap<>();
        this.textAnchors = new HashMap<>();
        this.audioMessages = new ArrayList<>();
        this.audioBlocks = new HashMap<>();
        this.textBlocks = new ArrayList<>();
        this.textBlockCharOffsets = new ArrayList<>();
        this.textBlockBlockIndex = new ArrayList<>();
        this.joinedText = "";
        this.detailsAnimationProgress = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.numTextPaint = textPaint2;
        this.quoteLine = new zl0(null);
        this.clip = new i20();
        this.showMoreRect = new RectF();
        this.messageObject = null;
        this.currentAccount = i10;
        this.maxWidth = i11;
        this.resourcesProvider = f6Var;
        this.fontSize = SharedConfig.fontSize;
        this.density = AndroidUtilities.density;
        textPaint.setTextSize(AndroidUtilities.dp(r5));
        textPaint2.setTextSize(AndroidUtilities.dp(this.fontSize));
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class AnchorSpan extends CharacterStyle {
        public final String name;

        public AnchorSpan(String str) {
            this.name = str;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichAudioBlock extends RichBlock implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
        private final TextPaint audioTimePaint;
        public final TL_iv.pageBlockAudio block;
        private boolean buttonPressed;
        private int buttonState;
        private final int buttonX;
        private final int buttonY;
        private final TLRPC.Document currentDocument;
        private final MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private String lastTimeString;
        private int layoutWidth;
        private final int observerTag;
        private final RadialProgress2 radialProgress;
        private final fo0 seekBar;
        private int seekBarWidth;
        private int seekBarX;
        private int seekBarY;
        private final int size;
        private StaticLayout titleLayout;

        public RichAudioBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockAudio pageblockaudio) {
            super(richMessageLayout, rect, i10);
            this.audioTimePaint = new TextPaint(1);
            int dp = AndroidUtilities.dp(16.0f);
            this.buttonX = dp;
            int dp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = dp2;
            int dp3 = AndroidUtilities.dp(44.0f);
            this.size = dp3;
            this.layoutWidth = -1;
            this.block = pageblockaudio;
            MessageObject messageObject = richMessageLayout.audioBlocks.get(pageblockaudio);
            this.currentMessageObject = messageObject;
            this.currentDocument = messageObject != null ? messageObject.getDocument() : null;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            radialProgress2.q(dp, dp2, dp + dp3, dp3 + dp2);
            fo0 fo0Var = new fo0(null);
            this.seekBar = fo0Var;
            fo0Var.h = new d0(this, 12);
            layoutInner();
            updateButtonState(false);
        }

        private boolean canStream() {
            MessageObject messageObject;
            return (!SharedConfig.streamMedia || (messageObject = this.currentMessageObject) == null || !messageObject.isMusic() || this.currentMessageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(this.currentMessageObject.getDialogId())) ? false : true;
        }

        private void didPressedButton(boolean z4) {
            int i10 = this.root.currentAccount;
            int i11 = this.buttonState;
            if (i11 == 0) {
                if (MediaController.getInstance().setPlaylist(this.root.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
                    View view = this.view;
                    if (view != null) {
                        view.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
                    View view2 = this.view;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 2) {
                this.radialProgress.o(0.0f, false);
                FileLoader.getInstance(i10).loadFile(this.currentDocument, this.root.messageObject, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z4);
                View view3 = this.view;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            }
            if (i11 == 3) {
                FileLoader.getInstance(i10).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
                View view4 = this.view;
                if (view4 != null) {
                    view4.invalidate();
                }
            }
        }

        private int getIconForCurrentState() {
            int i10 = this.buttonState;
            if (i10 == 1) {
                return 1;
            }
            if (i10 == 2) {
                return 2;
            }
            return i10 == 3 ? 3 : 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(float f10) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f10;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f10);
        }

        private void layoutInner() {
            int i10 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            this.layoutWidth = i10 + richMessageLayout.padLeft + richMessageLayout.padRight;
            int dp = AndroidUtilities.dp(50.0f) + this.buttonX + this.size;
            this.seekBarX = dp;
            this.seekBarWidth = kf.k0.c(18.0f, this.layoutWidth - dp, 0);
            MessageObject messageObject = this.currentMessageObject;
            String musicAuthor = messageObject != null ? messageObject.getMusicAuthor(false) : null;
            MessageObject messageObject2 = this.currentMessageObject;
            String musicTitle = messageObject2 != null ? messageObject2.getMusicTitle(false) : null;
            if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                this.titleLayout = null;
                this.seekBarY = ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            } else {
                SpannableStringBuilder spannableStringBuilder = (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) ? !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor) : new SpannableStringBuilder(android.support.v4.media.a.z(musicAuthor, " - ", musicTitle));
                if (!TextUtils.isEmpty(musicAuthor)) {
                    spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                }
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                int dp2 = AndroidUtilities.dp(50.0f) + this.seekBarWidth;
                this.titleLayout = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, org.telegram.ui.ActionBar.j6.O2, dp2, TextUtils.TruncateAt.END), this.audioTimePaint, dp2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.seekBarY = AndroidUtilities.dp(11.0f) + ((this.size - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
            }
            this.seekBar.j(this.seekBarWidth, AndroidUtilities.dp(30.0f));
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            MessageObject playingMessageObject;
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            if (i10 == NotificationCenter.messagePlayingDidStart) {
                updateButtonState(true);
                return;
            }
            if (i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.messagePlayingPlayStateChanged) {
                updateButtonState(true);
                return;
            }
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged) {
                if (messageObject.getId() != ((Integer) objArr[0]).intValue() || (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null) {
                    return;
                }
                MessageObject messageObject2 = this.currentMessageObject;
                messageObject2.audioProgress = playingMessageObject.audioProgress;
                messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                updatePlayingMessageProgress();
            }
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return AndroidUtilities.dp(62.0f) + this.padding.top + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean isHorizontallyDragging() {
            return this.seekBar.e;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.m(view);
                this.seekBar.s = this.view;
            }
            updateButtonState(false);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
            NotificationCenter.getInstance(this.root.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            if (this.currentMessageObject == null || this.currentDocument == null) {
                return;
            }
            int i10 = this.layoutWidth;
            int i11 = this.maxWidth;
            RichMessageLayout richMessageLayout = this.root;
            if (i10 != i11 + richMessageLayout.padLeft + richMessageLayout.padRight) {
                layoutInner();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            this.radialProgress.g(this.root.isOut() ? org.telegram.ui.ActionBar.j6.Nb : org.telegram.ui.ActionBar.j6.ie, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Ob : org.telegram.ui.ActionBar.j6.je, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Pa : org.telegram.ui.ActionBar.j6.uc, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Qa : org.telegram.ui.ActionBar.j6.vc);
            RadialProgress2 radialProgress2 = this.radialProgress;
            RichMessageLayout richMessageLayout2 = this.root;
            radialProgress2.d = richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.Db : org.telegram.ui.ActionBar.j6.Bd);
            this.radialProgress.draw(canvas);
            fo0 fo0Var = this.seekBar;
            RichMessageLayout richMessageLayout3 = this.root;
            int themedColor = richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.j6.wb : org.telegram.ui.ActionBar.j6.ud);
            RichMessageLayout richMessageLayout4 = this.root;
            int themedColor2 = richMessageLayout4.getThemedColor(richMessageLayout4.isOut() ? org.telegram.ui.ActionBar.j6.xb : org.telegram.ui.ActionBar.j6.vd);
            RichMessageLayout richMessageLayout5 = this.root;
            int themedColor3 = richMessageLayout5.getThemedColor(richMessageLayout5.isOut() ? org.telegram.ui.ActionBar.j6.zb : org.telegram.ui.ActionBar.j6.xd);
            RichMessageLayout richMessageLayout6 = this.root;
            int themedColor4 = richMessageLayout6.getThemedColor(richMessageLayout6.isOut() ? org.telegram.ui.ActionBar.j6.zb : org.telegram.ui.ActionBar.j6.xd);
            RichMessageLayout richMessageLayout7 = this.root;
            fo0Var.h(themedColor, themedColor2, themedColor3, themedColor4, richMessageLayout7.getThemedColor(richMessageLayout7.isOut() ? org.telegram.ui.ActionBar.j6.yb : org.telegram.ui.ActionBar.j6.wd));
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.b(canvas);
            canvas.restore();
            if (this.durationLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, AndroidUtilities.dp(6.0f) + this.seekBarY);
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            if (this.titleLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, this.seekBarY - AndroidUtilities.dp(16.0f));
                this.titleLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z4) {
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j10, long j11) {
            this.radialProgress.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            this.radialProgress.o(1.0f, true);
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX() + this.root.padLeft;
            float y10 = motionEvent.getY();
            if (this.seekBar.f(x10 - this.seekBarX, y10 - this.seekBarY, actionMasked)) {
                if (actionMasked == 0) {
                    requestDisallowParentIntercept(true);
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    requestDisallowParentIntercept(false);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                }
                return true;
            }
            if (actionMasked == 0) {
                if (this.buttonState != -1) {
                    if (x10 >= this.buttonX && x10 <= AndroidUtilities.dp(48.0f) + r0) {
                        if (y10 >= this.buttonY && y10 <= AndroidUtilities.dp(48.0f) + r0) {
                            this.buttonPressed = true;
                            View view2 = this.view;
                            if (view2 != null) {
                                view2.invalidate();
                            }
                            return true;
                        }
                    }
                }
            } else if (actionMasked == 1) {
                if (this.buttonPressed) {
                    this.buttonPressed = false;
                    View view3 = this.view;
                    if (view3 != null) {
                        view3.playSoundEffect(0);
                    }
                    didPressedButton(true);
                    View view4 = this.view;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                this.buttonPressed = false;
            }
            return this.buttonPressed;
        }

        public void updateButtonState(boolean z4) {
            int i10 = this.root.currentAccount;
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            File pathToAttach = this.currentDocument == null ? null : FileLoader.getInstance(i10).getPathToAttach(this.currentDocument, true);
            boolean z10 = pathToAttach != null && pathToAttach.exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z10) {
                DownloadController.getInstance(i10).removeLoadingFileObserver(this);
                if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
            } else {
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
                if (canStream()) {
                    this.buttonState = (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject) || MediaController.getInstance().isMessagePaused()) ? 0 : 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
                } else {
                    if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                        this.buttonState = 3;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        this.radialProgress.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z4);
                        this.radialProgress.setIcon(getIconForCurrentState(), true, z4);
                    } else {
                        this.buttonState = 2;
                        this.radialProgress.o(0.0f, z4);
                        this.radialProgress.setIcon(getIconForCurrentState(), false, z4);
                    }
                }
            }
            updatePlayingMessageProgress();
        }

        public void updatePlayingMessageProgress() {
            MessageObject messageObject;
            int i10;
            if (this.currentDocument == null || (messageObject = this.currentMessageObject) == null) {
                return;
            }
            fo0 fo0Var = this.seekBar;
            if (!fo0Var.e) {
                fo0Var.i(messageObject.audioProgress);
            }
            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.currentDocument.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i10 = (int) documentAttribute.duration;
                        break;
                    }
                    i11++;
                }
            } else {
                i10 = this.currentMessageObject.audioProgressSec;
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            String str = this.lastTimeString;
            if (str == null || !str.equals(formatShortDuration)) {
                this.lastTimeString = formatShortDuration;
                this.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(formatShortDuration, this.audioTimePaint, (int) Math.ceil(this.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            TextPaint textPaint = this.audioTimePaint;
            RichMessageLayout richMessageLayout = this.root;
            textPaint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.fc : org.telegram.ui.ActionBar.j6.ec));
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j10, long j11, boolean z4) {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class RichDocumentBlock extends RichBlock implements DownloadController.FileDownloadProgressListener {
        private static final int MIN_WIDTH_DP = 220;
        public final TL_iv.pageBlockDocument block;
        private final int buttonSize;
        private int buttonState;
        private final int buttonTextSpacing;
        private final int buttonX;
        private final int buttonY;
        private final TLRPC.Document document;
        private final boolean hasPreview;
        private int layoutWidth;
        private final int observerTag;
        private final RectF optionsHit;
        private boolean optionsPressed;
        private boolean pressed;
        private final Paint previewBackgroundPaint;
        private final ImageReceiver previewImage;
        private final int previewX;
        private final RadialProgress2 radialProgress;
        private StaticLayout sizeLayout;
        private final TextPaint sizePaint;
        private StaticLayout titleLayout;
        private final TextPaint titlePaint;

        public RichDocumentBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockDocument pageblockdocument) {
            super(richMessageLayout, rect, i10);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.previewImage = imageReceiver;
            this.previewBackgroundPaint = new Paint(1);
            this.titlePaint = new TextPaint(1);
            this.sizePaint = new TextPaint(1);
            int dp = AndroidUtilities.dp(16.0f);
            this.buttonX = dp;
            int dp2 = AndroidUtilities.dp(9.0f);
            this.buttonY = dp2;
            int dp3 = AndroidUtilities.dp(42.0f);
            this.buttonSize = dp3;
            this.buttonTextSpacing = AndroidUtilities.dp(14.0f);
            this.optionsHit = new RectF();
            this.layoutWidth = -1;
            this.block = pageblockdocument;
            TLRPC.Document document = richMessageLayout.getDocument(pageblockdocument.document_id);
            this.document = document;
            int dp4 = AndroidUtilities.dp(10.0f) + richMessageLayout.padLeft;
            this.previewX = dp4;
            boolean isDocumentHasThumb = MessageObject.isDocumentHasThumb(document);
            this.hasPreview = isDocumentHasThumb;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(dp3 / 2);
            dp = isDocumentHasThumb ? ((AndroidUtilities.dp(86.0f) - dp3) / 2) + dp4 : dp;
            dp2 = isDocumentHasThumb ? AndroidUtilities.dp(10.0f) + ((AndroidUtilities.dp(86.0f) - dp3) / 2) : dp2;
            radialProgress2.q(dp, dp2, dp + dp3, dp3 + dp2);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            if (isDocumentHasThumb) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
                imageReceiver.setImageCoords(dp4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f), AndroidUtilities.dp(86.0f));
                imageReceiver.setImage(closestPhotoSizeWithSize != null ? ImageLocation.getForDocument(closestPhotoSizeWithSize, document) : null, "86_86", ImageLoader.createStripedBitmap(document.thumbs), null, richMessageLayout.messageObject, 1);
            }
            rebuildLayouts();
            updateButtonState(false);
        }

        private boolean canShowOptions() {
            return (this.document == null || this.root.cell == null || this.root.delegate == null || !this.root.delegate.a0(this.root.cell)) ? false : true;
        }

        private static Activity findActivity(Context context) {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }

        private int getLayoutWidth() {
            int i10;
            int minWidth = this.root.getMinWidth();
            if (minWidth > 0) {
                int i11 = this.maxWidth;
                Rect rect = this.padding;
                i10 = Math.min(i11, Math.max(0, (minWidth - rect.left) - rect.right));
            } else {
                i10 = this.maxWidth;
            }
            RichMessageLayout richMessageLayout = this.root;
            return i10 + richMessageLayout.padLeft + richMessageLayout.padRight;
        }

        private int getMenuX() {
            return (this.layoutWidth + this.padding.right) - AndroidUtilities.dp(32.0f);
        }

        private File path() {
            if (this.document == null) {
                return null;
            }
            File pathToAttach = FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, false);
            return (pathToAttach == null || !pathToAttach.exists()) ? FileLoader.getInstance(this.root.currentAccount).getPathToAttach(this.document, true) : pathToAttach;
        }

        private void press() {
            int i10 = this.buttonState;
            if (i10 == 0) {
                View view = this.view;
                Activity findActivity = findActivity(view == null ? null : view.getContext());
                File path = path();
                if (findActivity != null && path != null) {
                    AndroidUtilities.openForView(path, FileLoader.getDocumentFileName(this.document), this.document.mime_type, findActivity, this.root.resourcesProvider, false);
                }
            } else if (i10 == 1 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).loadFile(this.document, this.root.messageObject, 1, 1);
                this.buttonState = 2;
                this.radialProgress.setIcon(3, true, true);
            } else if (i10 == 2 && this.document != null) {
                FileLoader.getInstance(this.root.currentAccount).cancelLoadFile(this.document);
                this.buttonState = 1;
                this.radialProgress.setIcon(2, false, true);
            }
            View view2 = this.view;
            if (view2 != null) {
                view2.invalidate();
            }
        }

        private void rebuildLayouts() {
            this.layoutWidth = getLayoutWidth();
            int c3 = kf.k0.c(48.0f, this.layoutWidth - (this.hasPreview ? AndroidUtilities.dp(97.0f) + this.previewX : this.buttonTextSpacing + (this.buttonX + this.buttonSize)), AndroidUtilities.dp(40.0f));
            this.titlePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 1));
            this.titlePaint.setTypeface(AndroidUtilities.bold());
            this.sizePaint.setTextSize(AndroidUtilities.dp(this.root.fontSize - 3));
            TLRPC.Document document = this.document;
            CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : FileLoader.getDocumentFileName(document), this.titlePaint, c3, TextUtils.TruncateAt.END);
            TextPaint textPaint = this.titlePaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.titleLayout = new StaticLayout(ellipsize, textPaint, c3, alignment, 1.0f, 0.0f, false);
            TLRPC.Document document2 = this.document;
            this.sizeLayout = new StaticLayout(document2 != null ? AndroidUtilities.formatFileSize(document2.size) : "", this.sizePaint, c3, alignment, 1.0f, 0.0f, false);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            return AndroidUtilities.dp(this.hasPreview ? 106.0f : 60.0f) + this.padding.top + this.padding.bottom;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            int i10;
            int i11;
            if (this.hasPreview) {
                i10 = this.previewX - this.root.padLeft;
                i11 = AndroidUtilities.dp(86.0f);
            } else {
                StaticLayout staticLayout = this.sizeLayout;
                if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                    i10 = 0;
                } else {
                    StaticLayout staticLayout2 = this.sizeLayout;
                    i10 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
                }
                i11 = (this.buttonX - this.root.padLeft) + this.buttonSize + this.buttonTextSpacing;
            }
            int i12 = i11 + i10;
            Rect rect = this.padding;
            return rect.left + i12 + rect.right;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            TLRPC.Document document = this.document;
            String documentFileName = document == null ? "" : FileLoader.getDocumentFileName(document);
            int min = Math.min(this.maxWidth, Math.max(AndroidUtilities.dp(220.0f), AndroidUtilities.dp(48.0f) + (this.hasPreview ? AndroidUtilities.dp(107.0f) : this.buttonX + this.buttonSize + this.buttonTextSpacing) + ((int) Math.ceil(Math.max(this.titlePaint.measureText(documentFileName), this.sizePaint.measureText(this.document != null ? AndroidUtilities.formatFileSize(r2.size) : ""))))));
            Rect rect = this.padding;
            return rect.left + min + rect.right;
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.observerTag;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            View view = this.view;
            if (view != null) {
                this.radialProgress.m(view);
                this.previewImage.setParentView(this.view);
            }
            this.previewImage.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.previewImage.onDetachedFromWindow();
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.document == null) {
                return;
            }
            if (this.layoutWidth != getLayoutWidth()) {
                rebuildLayouts();
            }
            canvas.save();
            canvas.translate(-this.root.padLeft, 0.0f);
            if (!this.hasPreview || this.previewImage.draw(canvas)) {
                canvas2 = canvas;
            } else {
                Paint paint = this.previewBackgroundPaint;
                RichMessageLayout richMessageLayout = this.root;
                paint.setColor(richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.Ib : org.telegram.ui.ActionBar.j6.Gd));
                canvas2 = canvas;
                canvas2.drawRoundRect(this.previewX, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(86.0f) + this.previewX, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.previewBackgroundPaint);
            }
            this.radialProgress.draw(canvas2);
            TextPaint textPaint = this.titlePaint;
            RichMessageLayout richMessageLayout2 = this.root;
            textPaint.setColor(richMessageLayout2.getThemedColor(richMessageLayout2.isOut() ? org.telegram.ui.ActionBar.j6.Fb : org.telegram.ui.ActionBar.j6.Dd));
            TextPaint textPaint2 = this.sizePaint;
            RichMessageLayout richMessageLayout3 = this.root;
            textPaint2.setColor(richMessageLayout3.getThemedColor(richMessageLayout3.isOut() ? org.telegram.ui.ActionBar.j6.sb : org.telegram.ui.ActionBar.j6.nd));
            int dp = this.hasPreview ? AndroidUtilities.dp(97.0f) + this.previewX : this.buttonTextSpacing + this.buttonX + this.buttonSize;
            int dp2 = AndroidUtilities.dp(11.0f);
            int dp3 = AndroidUtilities.dp(2.0f) + this.titleLayout.getHeight() + dp2;
            canvas2.save();
            float f10 = dp;
            canvas2.translate(f10, dp2);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(f10, dp3);
            this.sizeLayout.draw(canvas2);
            canvas2.restore();
            if (canShowOptions()) {
                Drawable themedDrawable = this.root.isOut() ? this.root.getThemedDrawable("drawableMsgOutMenu") : org.telegram.ui.ActionBar.j6.c4;
                int menuX = getMenuX();
                int dp4 = AndroidUtilities.dp(7.0f);
                themedDrawable.setBounds(menuX, dp4, themedDrawable.getIntrinsicWidth() + menuX, themedDrawable.getIntrinsicHeight() + dp4);
                themedDrawable.draw(canvas2);
                this.optionsHit.set(menuX - AndroidUtilities.dp(8.0f), 0.0f, AndroidUtilities.dp(8.0f) + themedDrawable.getIntrinsicWidth() + menuX, AndroidUtilities.dp(54.0f));
            } else {
                this.optionsHit.setEmpty();
            }
            canvas2.restore();
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z4) {
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j10, long j11) {
            this.radialProgress.o(j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11), true);
            if (this.buttonState != 2) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            this.radialProgress.o(1.0f, true);
            updateButtonState(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z4;
            float x10 = motionEvent.getX() + this.root.padLeft;
            float y10 = motionEvent.getY();
            boolean contains = this.optionsHit.contains(x10, y10);
            if (motionEvent.getActionMasked() == 0 && contains) {
                this.optionsPressed = true;
                return true;
            }
            if (this.optionsPressed) {
                if (motionEvent.getActionMasked() == 2 && !contains) {
                    this.optionsPressed = false;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    boolean z10 = motionEvent.getActionMasked() == 1 && contains;
                    this.optionsPressed = false;
                    if (z10 && this.document != null && canShowOptions()) {
                        View view = this.view;
                        if (view != null) {
                            view.playSoundEffect(0);
                        }
                        this.root.cell.getTextX();
                        int i10 = this.padding.left;
                        int i11 = this.root.padLeft;
                        getMenuX();
                        this.root.cell.getTextY();
                        int i12 = this.padding.top;
                        AndroidUtilities.dp(7.0f);
                        this.root.delegate.u1(this.root.cell, this.document);
                        return true;
                    }
                    return true;
                }
            }
            if (x10 >= (this.hasPreview ? this.previewX : this.buttonX) && x10 <= this.layoutWidth - AndroidUtilities.dp(12.0f) && y10 >= AndroidUtilities.dp(10.0f)) {
                if (y10 <= AndroidUtilities.dp(this.hasPreview ? 96.0f : 53.0f)) {
                    z4 = true;
                    if (motionEvent.getActionMasked() != 0 && z4) {
                        this.pressed = true;
                        return true;
                    }
                    if (motionEvent.getActionMasked() == 1 || !this.pressed) {
                        if (motionEvent.getActionMasked() == 3) {
                            this.pressed = false;
                        }
                        return this.pressed;
                    }
                    this.pressed = false;
                    if (z4) {
                        View view2 = this.view;
                        if (view2 != null) {
                            view2.playSoundEffect(0);
                        }
                        press();
                    }
                    return true;
                }
            }
            z4 = false;
            if (motionEvent.getActionMasked() != 0) {
            }
            if (motionEvent.getActionMasked() == 1) {
            }
            if (motionEvent.getActionMasked() == 3) {
            }
            return this.pressed;
        }

        public void updateButtonState(boolean z4) {
            if (this.hasPreview) {
                this.radialProgress.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
                this.radialProgress.d = this.root.getThemedColor(org.telegram.ui.ActionBar.j6.hd);
            } else {
                this.radialProgress.g(this.root.isOut() ? org.telegram.ui.ActionBar.j6.Nb : org.telegram.ui.ActionBar.j6.ie, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Ob : org.telegram.ui.ActionBar.j6.je, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Pa : org.telegram.ui.ActionBar.j6.uc, this.root.isOut() ? org.telegram.ui.ActionBar.j6.Qa : org.telegram.ui.ActionBar.j6.vc);
                RadialProgress2 radialProgress2 = this.radialProgress;
                RichMessageLayout richMessageLayout = this.root;
                radialProgress2.d = richMessageLayout.getThemedColor(richMessageLayout.isOut() ? org.telegram.ui.ActionBar.j6.Db : org.telegram.ui.ActionBar.j6.Bd);
            }
            String attachFileName = FileLoader.getAttachFileName(this.document);
            File path = path();
            if (path != null && path.exists()) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = 0;
                this.radialProgress.setIcon(this.hasPreview ? 4 : 5, false, z4);
            } else if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, z4);
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (FileLoader.getInstance(this.root.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    this.radialProgress.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, z4);
                    this.radialProgress.setIcon(3, true, z4);
                } else {
                    this.buttonState = 1;
                    this.radialProgress.o(0.0f, z4);
                    this.radialProgress.setIcon(2, false, z4);
                }
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j10, long j11, boolean z4) {
        }
    }

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static abstract class RichMediaBlock extends RichBlock implements DownloadController.FileDownloadProgressListener {
        private static ColorMatrixColorFilter fancyBlurFilter;
        private static Paint mediaBgPaint;
        protected boolean autoDownload;
        public final ImageReceiver blurImageReceiver;
        private Bitmap blurSource;
        private boolean buttonPressed;
        private final int buttonSize;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private final Path clipPath;
        public final boolean first;
        public final ImageReceiver imageReceiver;
        protected int imgHeight;
        protected int imgWidth;
        protected boolean mediaForced;
        private final int observerTag;
        private boolean photoPressed;
        protected RadialProgress2 radialProgress;
        private final SpoilerReveal spoilerReveal;

        public RichMediaBlock(RichMessageLayout richMessageLayout, Rect rect, int i10, boolean z4) {
            super(richMessageLayout, rect, i10);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.blurImageReceiver = imageReceiver2;
            this.buttonState = -1;
            this.buttonSize = AndroidUtilities.dp(48.0f);
            this.clipPath = new Path();
            this.spoilerReveal = new SpoilerReveal();
            this.first = z4;
            this.observerTag = DownloadController.getInstance(richMessageLayout.currentAccount).generateObserverTag();
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            imageReceiver2.setAllowLoadingOnAttachedOnly(true);
            imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.messenger.RichMessageLayout.RichMediaBlock.1
                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public final /* synthetic */ void didSetImageBitmap(int i11, String str, Drawable drawable) {
                    j5.a(this, i11, str, drawable);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public void onAnimationReady(ImageReceiver imageReceiver3) {
                    RichMediaBlock.this.updateButtonState(true);
                }

                @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
                public void didSetImage(ImageReceiver imageReceiver3, boolean z10, boolean z11, boolean z12) {
                }
            });
        }

        private int availWidth() {
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            return (minWidth - rect.left) - rect.right;
        }

        private void didPressButton(boolean z4) {
            int i10 = this.buttonState;
            if (i10 == 0) {
                this.mediaForced = true;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.o(0.0f, z4);
                }
                applyImage(true);
                this.buttonState = 1;
                RadialProgress2 radialProgress22 = this.radialProgress;
                if (radialProgress22 != null) {
                    radialProgress22.setIcon(3, true, z4);
                }
                View view = this.view;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                this.mediaForced = false;
                this.imageReceiver.cancelLoadImage();
                this.buttonState = 0;
                RadialProgress2 radialProgress23 = this.radialProgress;
                if (radialProgress23 != null) {
                    radialProgress23.setIcon(2, false, z4);
                }
                View view2 = this.view;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3 || this.root.delegate == null) {
                    return;
                }
                this.root.delegate.r2(this.root.cell, getBlock());
                return;
            }
            this.mediaForced = true;
            this.imageReceiver.setAllowStartAnimation(true);
            applyImage(true);
            this.imageReceiver.startAnimation();
            this.buttonState = -1;
            RadialProgress2 radialProgress24 = this.radialProgress;
            if (radialProgress24 != null) {
                radialProgress24.setIcon(4, false, z4);
            }
            View view3 = this.view;
            if (view3 != null) {
                view3.invalidate();
            }
        }

        private void drawMediaSpoiler(Canvas canvas) {
            Canvas canvas2;
            if (this.spoilerReveal.fullyRevealed()) {
                return;
            }
            prepareBlurImage();
            float imageX = this.imageReceiver.getImageX();
            float imageY = this.imageReceiver.getImageY();
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            if (imageWidth <= 0.0f || imageHeight <= 0.0f) {
                return;
            }
            canvas.save();
            canvas.clipRect(imageX, imageY, imageX + imageWidth, imageY + imageHeight);
            this.spoilerReveal.clipOut(canvas);
            if (this.blurImageReceiver.getBitmap() != null) {
                updateRoundRadius(this.blurImageReceiver, false);
                this.blurImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                this.blurImageReceiver.draw(canvas);
            }
            ih.j mediaSpoilerEffect = this.root.getMediaSpoilerEffect();
            if (mediaSpoilerEffect != null) {
                canvas.translate(imageX, imageY);
                canvas2 = canvas;
                mediaSpoilerEffect.c(canvas2, this.view, Math.round(imageWidth), Math.round(imageHeight), this.imageReceiver.getCurrentAlpha(), false);
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        private void ensureProgress() {
            View view;
            View view2;
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null || (view2 = this.view) == null) {
                if (radialProgress2 == null || (view = this.view) == null) {
                    return;
                }
                radialProgress2.m(view);
                RadialProgress2 radialProgress22 = this.radialProgress;
                int i10 = this.buttonX;
                int i11 = this.buttonY;
                int i12 = this.buttonSize;
                radialProgress22.q(i10, i11, i10 + i12, i12 + i11);
                return;
            }
            RadialProgress2 radialProgress23 = new RadialProgress2(view2, null);
            this.radialProgress = radialProgress23;
            radialProgress23.d = -1;
            radialProgress23.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress24 = this.radialProgress;
            int i13 = this.buttonX;
            int i14 = this.buttonY;
            int i15 = this.buttonSize;
            radialProgress24.q(i13, i14, i13 + i15, i15 + i14);
        }

        private void prepareBlurImage() {
            Bitmap bitmap;
            if ((this.blurImageReceiver.getBitmap() != null && this.imageReceiver.getAnimation() != null) || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
                return;
            }
            if (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null) {
                this.blurSource = bitmap;
                this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (fancyBlurFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                this.blurImageReceiver.setColorFilter(fancyBlurFilter);
            }
        }

        private void startSpoilerReveal() {
            float imageWidth = this.imageReceiver.getImageWidth();
            float imageHeight = this.imageReceiver.getImageHeight();
            this.spoilerReveal.start(this.view, (imageWidth / 2.0f) + this.imageReceiver.getImageX(), (imageHeight / 2.0f) + this.imageReceiver.getImageY(), imageWidth, imageHeight);
        }

        private void updateRoundRadius(ImageReceiver imageReceiver, boolean z4) {
            if (z4) {
                imageReceiver.setRoundRadius(0);
                return;
            }
            int i10 = SharedConfig.bubbleRadius;
            int dp = i10 > 2 ? AndroidUtilities.dp(i10 - 2) : AndroidUtilities.dp(i10);
            int min = Math.min(AndroidUtilities.dp(3.0f), dp);
            int i11 = (!this.first || this.root.hasNameOffset() || (!this.root.isOut() && this.root.isPinnedTop())) ? min : dp;
            if (!this.first || (this.root.isOut() && this.root.isPinnedTop())) {
                dp = min;
            }
            imageReceiver.setRoundRadius(i11, dp, min, min);
        }

        public boolean allowAutoplay() {
            return true;
        }

        public abstract void applyImage(boolean z4);

        public boolean computeAutoDownload() {
            return (DownloadController.getInstance(this.root.currentAccount).getCurrentDownloadMask() & 1) != 0;
        }

        public abstract boolean fileExists();

        public void finishLayout() {
            this.imageReceiver.setImageCoords(0.0f, 0.0f, this.imgWidth, this.imgHeight);
            int i10 = this.imgWidth;
            int i11 = this.buttonSize;
            this.buttonX = (i10 - i11) / 2;
            this.buttonY = (this.imgHeight - i11) / 2;
            boolean computeAutoDownload = computeAutoDownload();
            this.autoDownload = computeAutoDownload;
            applyImage(computeAutoDownload || fileExists());
        }

        public abstract TL_iv.PageBlock getBlock();

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void getBlockAccessibilityElementBounds(int i10, Rect rect) {
            int imageLeft = getImageLeft() + this.padding.left;
            int i11 = ((int) this.currY) + this.padding.top;
            rect.set(imageLeft, i11, this.imgWidth + imageLeft, this.imgHeight + i11);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getBlockAccessibilityElementCount() {
            return 1;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public CharSequence getBlockAccessibilityElementText(int i10) {
            String string = LocaleController.getString(isRealVideo() ? R.string.AttachVideo : R.string.AttachPhoto);
            return (!isSpoiler() || this.spoilerReveal.fullyRevealed()) ? string : TextUtils.concat(string, ", ", LocaleController.getString(R.string.Spoiler));
        }

        public abstract String getFileName();

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getHeight() {
            Rect rect = this.padding;
            return rect.top + this.imgHeight + rect.bottom;
        }

        public int getImageLeft() {
            int availWidth = availWidth();
            int i10 = this.imgWidth;
            if (availWidth > i10) {
                return (availWidth - i10) / 2;
            }
            return 0;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getLastLineWidth() {
            return getMinWidth();
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public int getMinWidth() {
            Rect rect = this.padding;
            return rect.left + this.imgWidth + rect.right;
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.observerTag;
        }

        public boolean isAnimatedContent() {
            return false;
        }

        public boolean isRealVideo() {
            return false;
        }

        public boolean isSpoiler() {
            return false;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onAttachedToWindow() {
            this.imageReceiver.setParentView(this.view);
            this.imageReceiver.onAttachedToWindow();
            this.blurImageReceiver.setParentView(this.view);
            this.blurImageReceiver.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public boolean onBlockAccessibilityElementClick(int i10, View view) {
            if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                startSpoilerReveal();
                return true;
            }
            if (this.root.delegate == null) {
                return false;
            }
            this.root.delegate.r2(this.root.cell, getBlock());
            return true;
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDetachedFromWindow() {
            this.imageReceiver.onDetachedFromWindow();
            this.blurImageReceiver.onDetachedFromWindow();
            this.blurSource = null;
            DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
        }

        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        public void onDraw(Canvas canvas) {
            if (mediaBgPaint == null) {
                Paint paint = new Paint(1);
                mediaBgPaint = paint;
                paint.setColor(251658240);
            }
            int minWidth = this.root.getMinWidth();
            Rect rect = this.padding;
            int i10 = (minWidth - rect.left) - rect.right;
            boolean isInQuote = isInQuote();
            int dp = AndroidUtilities.dp(2.0f);
            int i11 = isInQuote ? 0 : this.root.padLeft - dp;
            int i12 = isInQuote ? 0 : this.root.padRight - dp;
            boolean z4 = availWidth() > this.imgWidth;
            if (isInQuote) {
                canvas.save();
                this.clipPath.rewind();
                this.clipPath.addRoundRect(0.0f, 0.0f, i10, this.imgHeight, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            if (!this.imageReceiver.hasBitmapImage() || this.imageReceiver.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(-i11, 0.0f, i10 + i12, this.imgHeight, mediaBgPaint);
            }
            if (z4) {
                prepareBlurImage();
                updateRoundRadius(this.blurImageReceiver, false);
                updateRoundRadius(this.imageReceiver, true);
                if (this.blurImageReceiver.getBitmap() != null) {
                    this.blurImageReceiver.setImageCoords(-i11, 0.0f, i11 + i10 + i12, this.imgHeight);
                    this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
                    this.blurImageReceiver.draw(canvas);
                }
                this.imageReceiver.setAspectFit(true);
                this.imageReceiver.setImageCoords(0.0f, 0.0f, availWidth(), this.imgHeight);
            } else {
                updateRoundRadius(this.imageReceiver, false);
                this.imageReceiver.setAspectFit(false);
                this.imageReceiver.setImageCoords(-i11, 0.0f, i11 + i10 + i12, this.imgHeight);
            }
            this.imageReceiver.draw(canvas);
            if (isSpoiler() && !this.spoilerReveal.fullyRevealed()) {
                drawMediaSpoiler(canvas);
            } else if (this.radialProgress != null && this.buttonState != -1) {
                int imageLeft = getImageLeft();
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i13 = this.buttonX;
                int i14 = imageLeft + i13;
                int i15 = this.buttonY;
                int i16 = imageLeft + i13;
                int i17 = this.buttonSize;
                radialProgress2.q(i14, i15, i16 + i17, i17 + i15);
                this.radialProgress.draw(canvas);
            }
            if (isInQuote) {
                canvas.restore();
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z4) {
            updateButtonState(false);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j10, long j11) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(Math.min(1.0f, j11 <= 0 ? 0.0f : j10 / j11), true);
            }
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            RadialProgress2 radialProgress2 = this.radialProgress;
            if (radialProgress2 != null) {
                radialProgress2.o(1.0f, true);
            }
            if (isAnimatedContent() && (allowAutoplay() || this.mediaForced)) {
                applyImage(true);
            }
            updateButtonState(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
        @Override // org.telegram.messenger.RichMessageLayout.RichBlock
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z4;
            int actionMasked = motionEvent.getActionMasked();
            float x10 = (motionEvent.getX() - this.padding.left) - getImageLeft();
            float y10 = motionEvent.getY() - this.padding.top;
            boolean z10 = x10 >= 0.0f && x10 <= ((float) this.imgWidth) && y10 >= 0.0f && y10 <= ((float) this.imgHeight);
            int i10 = this.buttonState;
            if (i10 != -1) {
                if (x10 >= this.buttonX) {
                    int i11 = this.buttonSize;
                    if (x10 <= r6 + i11) {
                        if (y10 >= this.buttonY && y10 <= r1 + i11) {
                            z4 = true;
                            if (actionMasked != 0) {
                                if (!z10 || (!z4 && i10 != 0 && i10 != 2)) {
                                    if (!z10) {
                                        return false;
                                    }
                                    this.photoPressed = true;
                                    return true;
                                }
                                this.buttonPressed = true;
                                View view = this.view;
                                if (view != null) {
                                    view.invalidate();
                                }
                                return true;
                            }
                            if (actionMasked != 1) {
                                if (actionMasked != 3) {
                                    return this.photoPressed || this.buttonPressed;
                                }
                                this.photoPressed = false;
                                this.buttonPressed = false;
                                return false;
                            }
                            if (this.buttonPressed) {
                                this.buttonPressed = false;
                                View view2 = this.view;
                                if (view2 != null) {
                                    view2.playSoundEffect(0);
                                    this.view.invalidate();
                                }
                                didPressButton(true);
                                return true;
                            }
                            if (this.photoPressed) {
                                this.photoPressed = false;
                                if (z10) {
                                    View view3 = this.view;
                                    if (view3 != null) {
                                        view3.playSoundEffect(0);
                                    }
                                    if (isSpoiler() && !this.spoilerReveal.isRevealing()) {
                                        startSpoilerReveal();
                                    } else if (this.root.delegate != null) {
                                        this.root.delegate.r2(this.root.cell, getBlock());
                                    }
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
            z4 = false;
            if (actionMasked != 0) {
            }
        }

        public void updateButtonState(boolean z4) {
            ensureProgress();
            String fileName = getFileName();
            if (TextUtils.isEmpty(fileName)) {
                this.buttonState = -1;
                RadialProgress2 radialProgress2 = this.radialProgress;
                if (radialProgress2 != null) {
                    radialProgress2.setIcon(4, false, false);
                    return;
                }
                return;
            }
            org.telegram.ui.Components.y5 animation = this.imageReceiver.getAnimation();
            boolean z10 = animation != null && (animation.s() || this.imageReceiver.isAnimationRunning());
            if (fileExists() || (isAnimatedContent() && z10)) {
                DownloadController.getInstance(this.root.currentAccount).removeLoadingFileObserver(this);
                if (isRealVideo() && !z10) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress22 = this.radialProgress;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, false, z4);
                    }
                } else if (!isAnimatedContent() || z10 || allowAutoplay() || this.mediaForced) {
                    this.buttonState = -1;
                    RadialProgress2 radialProgress23 = this.radialProgress;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(4, false, z4);
                    }
                } else {
                    this.buttonState = 2;
                    RadialProgress2 radialProgress24 = this.radialProgress;
                    if (radialProgress24 != null) {
                        radialProgress24.setIcon(8, false, z4);
                    }
                }
            } else {
                DownloadController.getInstance(this.root.currentAccount).addLoadingFileObserver(fileName, null, this);
                if (this.autoDownload || this.mediaForced || FileLoader.getInstance(this.root.currentAccount).isLoadingFile(fileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                    r2 = fileProgress != null ? fileProgress.floatValue() : 0.0f;
                    RadialProgress2 radialProgress25 = this.radialProgress;
                    if (radialProgress25 != null) {
                        radialProgress25.setIcon(3, true, z4);
                    }
                } else if (isRealVideo()) {
                    this.buttonState = 3;
                    RadialProgress2 radialProgress26 = this.radialProgress;
                    if (radialProgress26 != null) {
                        radialProgress26.setIcon(0, true, z4);
                    }
                } else {
                    this.buttonState = 0;
                    RadialProgress2 radialProgress27 = this.radialProgress;
                    if (radialProgress27 != null) {
                        radialProgress27.setIcon(2, true, z4);
                    }
                }
                RadialProgress2 radialProgress28 = this.radialProgress;
                if (radialProgress28 != null) {
                    radialProgress28.o(r2, false);
                }
            }
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j10, long j11, boolean z4) {
        }
    }
}
