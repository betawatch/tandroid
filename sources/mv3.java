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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mv3 extends xna {
    public final i66 V;
    public m66 W;
    public boolean a0;
    public boolean b0;
    public boolean c0;

    public mv3(Context context) {
        super(null, context, true);
        this.V = new i66(this);
    }

    @Override // xna
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
            if (clickableSpanArr.length != 0 && !gm.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // xna, android.widget.TextView, android.view.View
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
        i66 i66Var = this.V;
        if (i66Var != null) {
            Layout layout = getLayout();
            ClickableSpan a = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a != null && motionEvent.getAction() == 0) {
                m66 m66Var = new m66(a, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.W = m66Var;
                i66Var.a(m66Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.W.i);
                int spanEnd = spannableString.getSpanEnd(this.W.i);
                b66 b = this.W.b();
                b.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b);
                gm.d3(new bn3(this, m66Var, a, (byte) 3), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i66Var.e(true);
                m66 m66Var2 = this.W;
                if (m66Var2 != null && (characterStyle = m66Var2.i) == a) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.W = null;
                    return true;
                }
                this.W = null;
            }
            if (motionEvent.getAction() == 3) {
                i66Var.e(true);
                this.W = null;
            }
        }
        return this.W != null || super.onTouchEvent(motionEvent);
    }

    @Override // xna
    public void setDisablePaddingsOffset(boolean z) {
        this.a0 = z;
    }

    @Override // xna
    public void setDisablePaddingsOffsetX(boolean z) {
        this.b0 = z;
    }

    @Override // xna
    public void setDisablePaddingsOffsetY(boolean z) {
        this.c0 = z;
    }

    @Override // xna, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
