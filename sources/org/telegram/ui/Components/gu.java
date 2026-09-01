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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gu extends jh.s {
    public final d90 O;
    public h90 P;
    public boolean Q;
    public boolean R;
    public boolean S;

    public gu(Context context) {
        super(context, null, true);
        this.O = new d90(this);
    }

    @Override // jh.s
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

    @Override // jh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        if (!this.Q) {
            canvas.translate(this.R ? 0.0f : getPaddingLeft(), this.S ? 0.0f : getPaddingTop());
        }
        if (this.O.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        d90 d90Var = this.O;
        if (d90Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                h90 h90Var = new h90(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.P = h90Var;
                d90Var.a(h90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.P.i);
                int spanEnd = spannableString.getSpanEnd(this.P.i);
                z80 b10 = this.P.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new xp(this, h90Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                d90Var.d(true);
                h90 h90Var2 = this.P;
                if (h90Var2 != null && (characterStyle = h90Var2.i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.P = null;
                    return true;
                }
                this.P = null;
            }
            if (motionEvent.getAction() == 3) {
                d90Var.d(true);
                this.P = null;
            }
        }
        return this.P != null || super.onTouchEvent(motionEvent);
    }

    @Override // jh.s
    public void setDisablePaddingsOffset(boolean z4) {
        this.Q = z4;
    }

    @Override // jh.s
    public void setDisablePaddingsOffsetX(boolean z4) {
        this.R = z4;
    }

    @Override // jh.s
    public void setDisablePaddingsOffsetY(boolean z4) {
        this.S = z4;
    }

    @Override // jh.s, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
