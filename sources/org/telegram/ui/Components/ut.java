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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ut extends eh.s {
    public final m80 N;
    public q80 O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public ut(Context context) {
        super(context, null, true);
        this.N = new m80(this);
    }

    @Override // eh.s
    public final ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // eh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.P) {
            canvas.translate(this.Q ? 0.0f : getPaddingLeft(), this.R ? 0.0f : getPaddingTop());
        }
        if (this.N.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m80 m80Var = this.N;
        if (m80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.O = q80Var;
                m80Var.a(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.O.i);
                int spanEnd = spannableString.getSpanEnd(this.O.i);
                j80 b10 = this.O.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new lp(this, q80Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                q80 q80Var2 = this.O;
                if (q80Var2 != null && (characterStyle = q80Var2.i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.O = null;
                    return true;
                }
                this.O = null;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.O = null;
            }
        }
        return this.O != null || super.onTouchEvent(motionEvent);
    }

    @Override // eh.s
    public void setDisablePaddingsOffset(boolean z10) {
        this.P = z10;
    }

    @Override // eh.s
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.Q = z10;
    }

    @Override // eh.s
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.R = z10;
    }

    @Override // eh.s, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
