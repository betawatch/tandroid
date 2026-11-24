// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bu3 extends wla {
    public final i46 V;
    public m46 W;
    public boolean a0;
    public boolean b0;
    public boolean c0;

    public bu3(Context context) {
        super(null, context, true);
        this.V = new i46(this);
    }

    @Override // wla
    public final ClickableSpan a(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i - getPaddingLeft();
        int paddingTop = i2 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !gl.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // wla, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.a0) {
            canvas.translate(this.b0 ? 0.0f : getPaddingLeft(), this.c0 ? 0.0f : getPaddingTop());
        }
        if (this.V.g(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        i46 i46Var = this.V;
        if (i46Var != null) {
            Layout layout = getLayout();
            ClickableSpan a = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a != null && motionEvent.getAction() == 0) {
                m46 m46Var = new m46(a, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.W = m46Var;
                i46Var.a(m46Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.W.i);
                int spanEnd = spannableString.getSpanEnd(this.W.i);
                b46 b = this.W.b();
                b.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b);
                gl.d3(new ql3(this, m46Var, a, (byte) 3), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i46Var.e(true);
                m46 m46Var2 = this.W;
                if (m46Var2 != null && (characterStyle = m46Var2.i) == a) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.W = null;
                    return true;
                }
                this.W = null;
            }
            if (motionEvent.getAction() == 3) {
                i46Var.e(true);
                this.W = null;
            }
        }
        return this.W != null || super.onTouchEvent(motionEvent);
    }

    @Override // wla
    public void setDisablePaddingsOffset(boolean z) {
        this.a0 = z;
    }

    @Override // wla
    public void setDisablePaddingsOffsetX(boolean z) {
        this.b0 = z;
    }

    @Override // wla
    public void setDisablePaddingsOffsetY(boolean z) {
        this.c0 = z;
    }

    @Override // wla, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
