package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class eu extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private v5 animatedEmojiDrawables;
    private vh.l clickDetector;
    private boolean clipToPadding;
    public boolean drawAnimatedEmojiDrawables;
    private boolean editedWhileQuoteUpdating;
    private Integer emojiColor;
    private boolean isSpoilersRevealed;
    private Layout lastLayout;
    private float lastRippleX;
    private float lastRippleY;
    private int lastText2Length;
    private int lastTextColor;
    private int lastTextLength;
    protected float offsetY;
    private Path path;
    private boolean postedSpoilerTimeout;
    private ArrayList<zi0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<vh.g> spoilers;
    private Stack<vh.g> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private xc0 wrappedCanvas;

    public eu(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new du(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new vh.l(this, this.spoilers, new s(this, 28));
        }
    }

    public static void a(eu euVar) {
        euVar.postedSpoilerTimeout = false;
        euVar.isSpoilersRevealed = false;
        euVar.invalidateSpoilers();
        if (euVar.spoilers.isEmpty()) {
            return;
        }
        euVar.spoilers.get(0).q = new du(euVar, 3);
        float sqrt = (float) Math.sqrt(Math.pow(euVar.getHeight(), 2.0d) + Math.pow(euVar.getWidth(), 2.0d));
        Iterator<vh.g> it = euVar.spoilers.iterator();
        while (it.hasNext()) {
            it.next().j(euVar.lastRippleX, euVar.lastRippleY, sqrt, true);
        }
    }

    public static boolean allowHackingTextCanvas() {
        String str;
        if (allowHackingTextCanvasCache == null) {
            String str2 = Build.MANUFACTURER;
            allowHackingTextCanvasCache = Boolean.valueOf((str2 == null || !(str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) && ((str = Build.MODEL) == null || !str.toLowerCase().contains("mediapad")));
        }
        return allowHackingTextCanvasCache.booleanValue();
    }

    public final void b() {
        int i10;
        int i11;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z10 = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (c11 c11Var : (c11[]) spannable.getSpans(0, spannable.length(), c11.class)) {
                int spanStart = spannable.getSpanStart(c11Var);
                int spanEnd = spannable.getSpanEnd(c11Var);
                if (c11Var.c() && ((spanStart > (i10 = this.selStart) && spanEnd < this.selEnd) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.selEnd) > spanStart && i11 < spanEnd)))) {
                    removeCallbacks(this.spoilerTimeout);
                    this.postedSpoilerTimeout = false;
                    z10 = true;
                    break;
                }
            }
        }
        if (!this.isSpoilersRevealed || z10 || this.postedSpoilerTimeout) {
            return;
        }
        this.postedSpoilerTimeout = true;
        postDelayed(this.spoilerTimeout, 10000L);
    }

    public final void c(vh.g gVar, float f7, float f10) {
        if (this.isSpoilersRevealed) {
            return;
        }
        this.lastRippleX = f7;
        this.lastRippleY = f10;
        this.postedSpoilerTimeout = false;
        removeCallbacks(this.spoilerTimeout);
        setSpoilersRevealed(true, false);
        gVar.q = new du(this, 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        Iterator<vh.g> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().j(f7, f10, sqrt, false);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        vh.l lVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<zi0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i10 = 0;
            while (i10 < size) {
                zi0 zi0Var = arrayList.get(i10);
                i10++;
                zi0 zi0Var2 = zi0Var;
                vi0 vi0Var = zi0Var2.e.J;
                boolean z12 = zi0Var2.b() && zi0Var2.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (vi0Var != null) {
                        vi0Var.b(z12);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (vi0Var != null && vi0Var.h && z12) {
                        zi0Var2.e.e = !r5.e;
                        invalidateQuotes(true);
                        z10 = true;
                    }
                    if (vi0Var != null) {
                        vi0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && vi0Var != null) {
                    vi0Var.b(false);
                }
                z10 = (vi0Var != null && vi0Var.h) || z10;
            }
        }
        if (!z10) {
            if (this.shouldRevealSpoilersByTouch && (lVar = this.clickDetector) != null && ((GestureDetector) lVar.a.b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z11) {
                return false;
            }
        }
        return true;
    }

    public int emojiCacheType() {
        return q5.g();
    }

    public float getOffsetY() {
        return this.offsetY;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        bj0[] bj0VarArr = (bj0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bj0.class);
        for (int length = bj0VarArr.length - 1; length >= 0; length--) {
            bj0 bj0Var = bj0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(bj0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(bj0Var);
            spannableStringBuilder.removeSpan(bj0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        Editable text = getText();
        if (text != null) {
            for (c11 c11Var : (c11[]) text.getSpans(0, text.length(), c11.class)) {
                if (c11Var.c()) {
                    boolean z10 = this.isSpoilersRevealed;
                    b11 b11Var = c11Var.b;
                    if (z10) {
                        b11Var.a |= 512;
                    } else {
                        b11Var.a &= -513;
                    }
                }
            }
        }
        invalidateSpoilers();
    }

    public void invalidateQuotes(boolean z10) {
        if (this.quoteBlocksUpdating) {
            this.editedWhileQuoteUpdating = true;
            return;
        }
        int i10 = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z10 || this.lastText2Length != length) {
            this.quoteUpdatesTries = 2;
            this.lastText2Length = length;
        }
        if (this.quoteUpdatesTries > 0) {
            if (this.quoteUpdateLayout == null) {
                this.quoteUpdateLayout = new boolean[1];
            }
            this.quoteUpdateLayout[0] = false;
            this.editedWhileQuoteUpdating = false;
            this.quoteBlocksUpdating = true;
            this.quoteBlocks = dj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = dj0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            }
            this.quoteBlocksUpdating = false;
            this.editedWhileQuoteUpdating = false;
            if (this.quoteUpdateLayout[0]) {
                resetFontMetricsCache();
            }
            this.quoteUpdatesTries--;
            if (getLayout() != null && getLayout().getText() != null) {
                i10 = getLayout().getText().length();
            }
            this.lastText2Length = i10;
        }
    }

    public void invalidateSpoilers() {
        v5 v5Var;
        v5 v5Var2;
        List<vh.g> list = this.spoilers;
        if (list == null) {
            return;
        }
        this.spoilersPool.addAll(list);
        this.spoilers.clear();
        if (this.isSpoilersRevealed) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout != null && (layout.getText() instanceof Spannable)) {
            if (this.drawAnimatedEmojiDrawables && (v5Var2 = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList = v5Var2.a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((u5) arrayList.get(i10)).d.recordPositions = false;
                }
            }
            Stack<vh.g> stack = this.spoilersPool;
            List<vh.g> list2 = this.spoilers;
            ArrayList<zi0> arrayList2 = this.quoteBlocks;
            int i11 = vh.g.A;
            int measuredWidth = getMeasuredWidth();
            vh.g.a(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (v5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = v5Var.a;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    ((u5) arrayList3.get(i12)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
        invalidateQuotes(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.spoilerTimeout);
        z5.release(this, this.animatedEmojiDrawables);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        if (this.clipToPadding && getScrollY() != 0) {
            canvas.clipRect(-AndroidUtilities.dp(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.offsetY, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY);
        }
        int paddingLeft = getPaddingLeft();
        if (!this.spoilers.isEmpty()) {
            this.path.rewind();
            Iterator<vh.g> it = this.spoilers.iterator();
            while (it.hasNext()) {
                Rect bounds = it.next().getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        invalidateQuotes(false);
        for (int i10 = 0; i10 < this.quoteBlocks.size(); i10++) {
            zi0 zi0Var = this.quoteBlocks.get(i10);
            int width = getWidth();
            int i11 = this.quoteColor;
            getPaint();
            zi0Var.a(canvas, width, i11);
        }
        updateAnimatedEmoji(false);
        if (this.wrapCanvasToFixClipping) {
            if (this.wrappedCanvas == null) {
                this.wrappedCanvas = new xc0();
            }
            xc0 xc0Var = this.wrappedCanvas;
            xc0Var.a = canvas;
            super.onDraw(xc0Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.drawAnimatedEmojiDrawables || this.animatedEmojiDrawables == null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            z5.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        }
        canvas2.restore();
        if (this.spoilers.isEmpty()) {
            return;
        }
        vh.g gVar = this.spoilers.get(0);
        if (gVar.m > 0.0f && gVar.n > 0.0f) {
            canvas2.save();
            canvas2.clipPath(this.path);
            this.path.rewind();
            this.spoilers.get(0).e(this.path);
            canvas2.clipPath(this.path);
            canvas2.translate(0.0f, -getPaddingTop());
            if (this.wrapCanvasToFixClipping) {
                if (this.wrappedCanvas == null) {
                    this.wrappedCanvas = new xc0();
                }
                xc0 xc0Var2 = this.wrappedCanvas;
                xc0Var2.a = canvas2;
                super.onDraw(xc0Var2);
            } else {
                super.onDraw(canvas2);
            }
            canvas2.restore();
        }
        this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
        canvas2.save();
        canvas2.clipRect(this.rect);
        canvas2.translate(paddingLeft, 0.0f);
        for (vh.g gVar2 : this.spoilers) {
            Rect bounds2 = gVar2.getBounds();
            Rect rect = this.rect;
            int i12 = rect.top;
            int i13 = bounds2.bottom;
            if ((i12 <= i13 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i13 >= i12)) {
                gVar2.h(gVar2.y ? this.quoteColor : getPaint().getColor());
                gVar2.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        invalidateQuotes(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (this.suppressOnTextChanged) {
            return;
        }
        this.selStart = i10;
        this.selEnd = i11;
        b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        invalidateEffects();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r7 = r7 - r6;
        r3.selStart += r7;
        r3.selEnd += r7;
        c(r1, r5, r4);
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (!this.suppressOnTextChanged) {
            invalidateEffects();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i10);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i10);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    Iterator<vh.g> it = this.spoilers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        vh.g next = it.next();
                        if (next.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        updateAnimatedEmoji(true);
        invalidateQuotes(true);
        invalidate();
    }

    public void recycleEmojis() {
        z5.release(this, this.animatedEmojiDrawables);
    }

    public void resetFontMetricsCache() {
        float textSize = getTextSize();
        setTextSize(0, 1.0f + textSize);
        setTextSize(0, textSize);
    }

    public void setClipToPadding(boolean z10) {
        this.clipToPadding = z10;
    }

    public void setEmojiColor(Integer num) {
        this.emojiColor = num;
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(num == null ? this.lastTextColor : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f7) {
        this.offsetY = f7;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.shouldRevealSpoilersByTouch = z10;
    }

    public void setSpoilersRevealed(boolean z10, boolean z11) {
        this.isSpoilersRevealed = z10;
        Editable text = getText();
        if (text != null) {
            for (c11 c11Var : (c11[]) text.getSpans(0, text.length(), c11.class)) {
                if (c11Var.c()) {
                    b11 b11Var = c11Var.b;
                    if (z10) {
                        b11Var.a |= 512;
                    } else {
                        b11Var.a &= -513;
                    }
                }
            }
        }
        this.suppressOnTextChanged = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.selStart, this.selEnd);
        this.suppressOnTextChanged = false;
        if (z11) {
            invalidateSpoilers();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.suppressOnTextChanged) {
            this.isSpoilersRevealed = false;
            Stack<vh.g> stack = this.spoilersPool;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        this.lastTextColor = i10;
        super.setTextColor(i10);
        Integer num = this.emojiColor;
        if (num != null) {
            i10 = num.intValue();
        }
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void updateAnimatedEmoji(boolean z10) {
        if (this.drawAnimatedEmojiDrawables) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z10 && this.lastLayout == getLayout() && this.lastTextLength == length) {
                return;
            }
            this.animatedEmojiDrawables = z5.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = length;
        }
    }
}
