package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kt extends yh.l {
    public final m2.p0 V;
    public t70 W;
    public boolean a0;
    public boolean b0;
    public boolean c0;

    public kt(Context context) {
        super(context, null, true);
        this.V = new m2.p0(this);
    }

    @Override // yh.l
    public final ClickableSpan a(int i3, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i3 - getPaddingLeft();
        int paddingTop = i10 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // yh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.a0) {
            canvas.translate(this.b0 ? 0.0f : getPaddingLeft(), this.c0 ? 0.0f : getPaddingTop());
        }
        if (this.V.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m2.p0 p0Var = this.V;
        if (p0Var != null) {
            Layout layout = getLayout();
            ClickableSpan a10 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a10 != null && motionEvent.getAction() == 0) {
                t70 t70Var = new t70(a10, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.W = t70Var;
                p0Var.b(t70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.W.i);
                int spanEnd = spannableString.getSpanEnd(this.W.i);
                n70 b10 = this.W.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                org.telegram.messenger.g0.i3(new gp(this, t70Var, a10), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                p0Var.f(true);
                t70 t70Var2 = this.W;
                if (t70Var2 != null && (characterStyle = t70Var2.i) == a10) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.W = null;
                    return true;
                }
                this.W = null;
            }
            if (motionEvent.getAction() == 3) {
                p0Var.f(true);
                this.W = null;
            }
        }
        return this.W != null || super.onTouchEvent(motionEvent);
    }

    @Override // yh.l
    public void setDisablePaddingsOffset(boolean z10) {
        this.a0 = z10;
    }

    @Override // yh.l
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.b0 = z10;
    }

    @Override // yh.l
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.c0 = z10;
    }

    @Override // yh.l, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
