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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ot extends EditText {
    private static final int SPOILER_TIMEOUT = 10000;
    private static Boolean allowHackingTextCanvasCache;
    private ColorFilter animatedEmojiColorFilter;
    private p5 animatedEmojiDrawables;
    private dh.r clickDetector;
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
    private ArrayList<bi0> quoteBlocks;
    private boolean quoteBlocksUpdating;
    public int quoteColor;
    private boolean[] quoteUpdateLayout;
    private int quoteUpdatesTries;
    private Rect rect;
    private int selEnd;
    private int selStart;
    private boolean shouldRevealSpoilersByTouch;
    private Runnable spoilerTimeout;
    private List<dh.l> spoilers;
    private Stack<dh.l> spoilersPool;
    public boolean suppressOnTextChanged;
    public boolean wrapCanvasToFixClipping;
    private ub0 wrappedCanvas;

    public ot(Context context) {
        super(context, null, 0, R.style.EditTextNoBackgroundStyle);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.quoteBlocks = new ArrayList<>();
        this.shouldRevealSpoilersByTouch = true;
        this.path = new Path();
        this.drawAnimatedEmojiDrawables = true;
        this.lastLayout = null;
        this.spoilerTimeout = new nt(this, 2);
        this.rect = new Rect();
        this.wrapCanvasToFixClipping = allowHackingTextCanvas();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.clickDetector = new dh.r(this, this.spoilers, new s(this, 28));
        }
    }

    public static void a(ot otVar) {
        otVar.postedSpoilerTimeout = false;
        otVar.isSpoilersRevealed = false;
        otVar.invalidateSpoilers();
        if (otVar.spoilers.isEmpty()) {
            return;
        }
        otVar.spoilers.get(0).q = new nt(otVar, 3);
        float sqrt = (float) Math.sqrt(Math.pow(otVar.getHeight(), 2.0d) + Math.pow(otVar.getWidth(), 2.0d));
        Iterator<dh.l> it = otVar.spoilers.iterator();
        while (it.hasNext()) {
            it.next().j(otVar.lastRippleX, otVar.lastRippleY, sqrt, true);
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
        int i9;
        int i10;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z10 = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (wz0 wz0Var : (wz0[]) spannable.getSpans(0, spannable.length(), wz0.class)) {
                int spanStart = spannable.getSpanStart(wz0Var);
                int spanEnd = spannable.getSpanEnd(wz0Var);
                if (wz0Var.c() && ((spanStart > (i9 = this.selStart) && spanEnd < this.selEnd) || ((i9 > spanStart && i9 < spanEnd) || ((i10 = this.selEnd) > spanStart && i10 < spanEnd)))) {
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

    public final void c(dh.l lVar, float f10, float f11) {
        if (this.isSpoilersRevealed) {
            return;
        }
        this.lastRippleX = f10;
        this.lastRippleY = f11;
        this.postedSpoilerTimeout = false;
        removeCallbacks(this.spoilerTimeout);
        setSpoilersRevealed(true, false);
        lVar.q = new nt(this, 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        Iterator<dh.l> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().j(f10, f11, sqrt, false);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        dh.r rVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList<bi0> arrayList = this.quoteBlocks;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i9 = 0;
            while (i9 < size) {
                bi0 bi0Var = arrayList.get(i9);
                i9++;
                bi0 bi0Var2 = bi0Var;
                xh0 xh0Var = bi0Var2.e.F;
                boolean z12 = bi0Var2.b() && bi0Var2.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (xh0Var != null) {
                        xh0Var.b(z12);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (xh0Var != null && xh0Var.h && z12) {
                        bi0Var2.e.e = !r5.e;
                        invalidateQuotes(true);
                        z10 = true;
                    }
                    if (xh0Var != null) {
                        xh0Var.b(false);
                    }
                } else if (motionEvent.getAction() == 3 && xh0Var != null) {
                    xh0Var.b(false);
                }
                z10 = (xh0Var != null && xh0Var.h) || z10;
            }
        }
        if (!z10) {
            if (this.shouldRevealSpoilersByTouch && (rVar = this.clickDetector) != null && ((GestureDetector) rVar.a.b).onTouchEvent(motionEvent)) {
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
        return k5.g();
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
        di0[] di0VarArr = (di0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), di0.class);
        for (int length = di0VarArr.length - 1; length >= 0; length--) {
            di0 di0Var = di0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(di0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(di0Var);
            spannableStringBuilder.removeSpan(di0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public void invalidateEffects() {
        Editable text = getText();
        if (text != null) {
            for (wz0 wz0Var : (wz0[]) text.getSpans(0, text.length(), wz0.class)) {
                if (wz0Var.c()) {
                    boolean z10 = this.isSpoilersRevealed;
                    vz0 vz0Var = wz0Var.b;
                    if (z10) {
                        vz0Var.a |= 512;
                    } else {
                        vz0Var.a &= -513;
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
        int i9 = 0;
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
            this.quoteBlocks = fi0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            if (this.editedWhileQuoteUpdating) {
                this.quoteBlocks = fi0.d(this, getLayout(), this.quoteBlocks, this.quoteUpdateLayout);
            }
            this.quoteBlocksUpdating = false;
            this.editedWhileQuoteUpdating = false;
            if (this.quoteUpdateLayout[0]) {
                resetFontMetricsCache();
            }
            this.quoteUpdatesTries--;
            if (getLayout() != null && getLayout().getText() != null) {
                i9 = getLayout().getText().length();
            }
            this.lastText2Length = i9;
        }
    }

    public void invalidateSpoilers() {
        p5 p5Var;
        p5 p5Var2;
        List<dh.l> list = this.spoilers;
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
            if (this.drawAnimatedEmojiDrawables && (p5Var2 = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList = p5Var2.a;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((o5) arrayList.get(i9)).d.recordPositions = false;
                }
            }
            Stack<dh.l> stack = this.spoilersPool;
            List<dh.l> list2 = this.spoilers;
            ArrayList<bi0> arrayList2 = this.quoteBlocks;
            int i10 = dh.l.A;
            int measuredWidth = getMeasuredWidth();
            dh.l.a(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, list2, arrayList2);
            if (this.drawAnimatedEmojiDrawables && (p5Var = this.animatedEmojiDrawables) != null) {
                ArrayList arrayList3 = p5Var.a;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((o5) arrayList3.get(i11)).d.recordPositions = true;
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
        t5.release(this, this.animatedEmojiDrawables);
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
            Iterator<dh.l> it = this.spoilers.iterator();
            while (it.hasNext()) {
                Rect bounds = it.next().getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        invalidateQuotes(false);
        for (int i9 = 0; i9 < this.quoteBlocks.size(); i9++) {
            bi0 bi0Var = this.quoteBlocks.get(i9);
            int width = getWidth();
            int i10 = this.quoteColor;
            getPaint();
            bi0Var.a(canvas, width, i10);
        }
        updateAnimatedEmoji(false);
        if (this.wrapCanvasToFixClipping) {
            if (this.wrappedCanvas == null) {
                this.wrappedCanvas = new ub0();
            }
            ub0 ub0Var = this.wrappedCanvas;
            ub0Var.a = canvas;
            super.onDraw(ub0Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.drawAnimatedEmojiDrawables || this.animatedEmojiDrawables == null) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            canvas2 = canvas;
            t5.drawAnimatedEmojis(canvas2, getLayout(), this.animatedEmojiDrawables, 0.0f, this.spoilers, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas2.restore();
        }
        canvas2.restore();
        if (this.spoilers.isEmpty()) {
            return;
        }
        dh.l lVar = this.spoilers.get(0);
        if (lVar.m > 0.0f && lVar.n > 0.0f) {
            canvas2.save();
            canvas2.clipPath(this.path);
            this.path.rewind();
            this.spoilers.get(0).e(this.path);
            canvas2.clipPath(this.path);
            canvas2.translate(0.0f, -getPaddingTop());
            if (this.wrapCanvasToFixClipping) {
                if (this.wrappedCanvas == null) {
                    this.wrappedCanvas = new ub0();
                }
                ub0 ub0Var2 = this.wrappedCanvas;
                ub0Var2.a = canvas2;
                super.onDraw(ub0Var2);
            } else {
                super.onDraw(canvas2);
            }
            canvas2.restore();
        }
        this.rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.offsetY), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.offsetY));
        canvas2.save();
        canvas2.clipRect(this.rect);
        canvas2.translate(paddingLeft, 0.0f);
        for (dh.l lVar2 : this.spoilers) {
            Rect bounds2 = lVar2.getBounds();
            Rect rect = this.rect;
            int i11 = rect.top;
            int i12 = bounds2.bottom;
            if ((i11 <= i12 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i12 >= i11)) {
                lVar2.h(lVar2.y ? this.quoteColor : getPaint().getColor());
                lVar2.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        invalidateQuotes(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        if (this.suppressOnTextChanged) {
            return;
        }
        this.selStart = i9;
        this.selEnd = i10;
        b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
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
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        if (!this.suppressOnTextChanged) {
            invalidateEffects();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i9);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i9);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    Iterator<dh.l> it = this.spoilers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dh.l next = it.next();
                        if (next.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        updateAnimatedEmoji(true);
        invalidateQuotes(true);
        invalidate();
    }

    public void recycleEmojis() {
        t5.release(this, this.animatedEmojiDrawables);
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

    public void setOffsetY(float f10) {
        this.offsetY = f10;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.shouldRevealSpoilersByTouch = z10;
    }

    public void setSpoilersRevealed(boolean z10, boolean z11) {
        this.isSpoilersRevealed = z10;
        Editable text = getText();
        if (text != null) {
            for (wz0 wz0Var : (wz0[]) text.getSpans(0, text.length(), wz0.class)) {
                if (wz0Var.c()) {
                    vz0 vz0Var = wz0Var.b;
                    if (z10) {
                        vz0Var.a |= 512;
                    } else {
                        vz0Var.a &= -513;
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
            Stack<dh.l> stack = this.spoilersPool;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i9) {
        this.lastTextColor = i9;
        super.setTextColor(i9);
        Integer num = this.emojiColor;
        if (num != null) {
            i9 = num.intValue();
        }
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    public void updateAnimatedEmoji(boolean z10) {
        if (this.drawAnimatedEmojiDrawables) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z10 && this.lastLayout == getLayout() && this.lastTextLength == length) {
                return;
            }
            this.animatedEmojiDrawables = t5.update(emojiCacheType(), this, this.animatedEmojiDrawables, getLayout());
            this.lastLayout = getLayout();
            this.lastTextLength = length;
        }
    }
}
