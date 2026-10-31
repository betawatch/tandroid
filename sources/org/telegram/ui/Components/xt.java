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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xt extends nh.p {
    public final ji.a U;
    public q80 V;
    public boolean W;
    public boolean a0;
    public boolean b0;

    public xt(Context context) {
        super(context, null, true);
        this.U = new ji.a(this);
    }

    @Override // nh.p
    public final ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.i0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // nh.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.W) {
            canvas.translate(this.a0 ? 0.0f : getPaddingLeft(), this.b0 ? 0.0f : getPaddingTop());
        }
        if (this.U.h(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        ji.a aVar = this.U;
        if (aVar != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.V = q80Var;
                aVar.b(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.V.i);
                int spanEnd = spannableString.getSpanEnd(this.V.i);
                k80 b10 = this.V.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                org.telegram.messenger.i0.h3(new ho(this, q80Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                aVar.f(true);
                q80 q80Var2 = this.V;
                if (q80Var2 != null && (characterStyle = q80Var2.i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.V = null;
                    return true;
                }
                this.V = null;
            }
            if (motionEvent.getAction() == 3) {
                aVar.f(true);
                this.V = null;
            }
        }
        return this.V != null || super.onTouchEvent(motionEvent);
    }

    @Override // nh.p
    public void setDisablePaddingsOffset(boolean z10) {
        this.W = z10;
    }

    @Override // nh.p
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.a0 = z10;
    }

    @Override // nh.p
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.b0 = z10;
    }

    @Override // nh.p, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
