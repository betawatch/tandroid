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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class mu extends vh.n {
    public final m90 R;
    public q90 S;
    public boolean T;
    public boolean U;
    public boolean V;

    public mu(Context context) {
        super(context, null, true);
        this.R = new m90(this);
    }

    @Override // vh.n
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
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // vh.n, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.T) {
            canvas.translate(this.U ? 0.0f : getPaddingLeft(), this.V ? 0.0f : getPaddingTop());
        }
        if (this.R.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m90 m90Var = this.R;
        if (m90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q90 q90Var = new q90(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.S = q90Var;
                m90Var.a(q90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.S.i);
                int spanEnd = spannableString.getSpanEnd(this.S.i);
                j90 b10 = this.S.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new zp(this, q90Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m90Var.d(true);
                q90 q90Var2 = this.S;
                if (q90Var2 != null && (characterStyle = q90Var2.i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.S = null;
                    return true;
                }
                this.S = null;
            }
            if (motionEvent.getAction() == 3) {
                m90Var.d(true);
                this.S = null;
            }
        }
        return this.S != null || super.onTouchEvent(motionEvent);
    }

    @Override // vh.n
    public void setDisablePaddingsOffset(boolean z10) {
        this.T = z10;
    }

    @Override // vh.n
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.U = z10;
    }

    @Override // vh.n
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.V = z10;
    }

    @Override // vh.n, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
