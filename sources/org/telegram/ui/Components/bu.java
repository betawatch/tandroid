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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bu extends gh.s {
    public final v80 N;
    public z80 O;
    public boolean P;
    public boolean Q;
    public boolean R;

    public bu(Context context) {
        super(context, null, true);
        this.N = new v80(this);
    }

    @Override // gh.s
    public final ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f9 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f9);
        float lineLeft = getLayout().getLineLeft(lineForVertical);
        if (lineLeft <= f9 && layout.getLineWidth(lineForVertical) + lineLeft >= f9 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override // gh.s, android.widget.TextView, android.view.View
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
        v80 v80Var = this.N;
        if (v80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                z80 z80Var = new z80(a2, null, motionEvent.getX(), motionEvent.getY(), 0);
                this.O = z80Var;
                v80Var.a(z80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.O.i);
                int spanEnd = spannableString.getSpanEnd(this.O.i);
                s80 b10 = this.O.b();
                b10.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new rp(this, z80Var, a2), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                v80Var.d(true);
                z80 z80Var2 = this.O;
                if (z80Var2 != null && (characterStyle = z80Var2.i) == a2) {
                    if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.O = null;
                    return true;
                }
                this.O = null;
            }
            if (motionEvent.getAction() == 3) {
                v80Var.d(true);
                this.O = null;
            }
        }
        return this.O != null || super.onTouchEvent(motionEvent);
    }

    @Override // gh.s
    public void setDisablePaddingsOffset(boolean z10) {
        this.P = z10;
    }

    @Override // gh.s
    public void setDisablePaddingsOffsetX(boolean z10) {
        this.Q = z10;
    }

    @Override // gh.s
    public void setDisablePaddingsOffsetY(boolean z10) {
        this.R = z10;
    }

    @Override // gh.s, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
    }
}
