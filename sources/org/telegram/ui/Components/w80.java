package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w80 extends org.telegram.ui.ActionBar.h5 {
    public final org.telegram.ui.ActionBar.c6 I0;
    public final v80 J0;
    public z80 K0;

    public w80(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J0 = new v80(this);
        this.I0 = c6Var;
    }

    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.J0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // org.telegram.ui.ActionBar.h5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        v80 v80Var = this.J0;
        if (v80Var != null) {
            Layout layout = getLayout();
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x4 - getLayoutX());
                int layoutY = (int) (y8 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f9 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f9);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f9 && layout2.getLineWidth(lineForVertical) + lineLeft >= f9 && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            z80 z80Var = new z80(clickableSpan, this.I0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.K0 = z80Var;
                            v80Var.a(z80Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.K0.i);
                            int spanEnd = spannableString.getSpanEnd(this.K0.i);
                            s80 b10 = this.K0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            v80Var.d(true);
                            z80 z80Var2 = this.K0;
                            if (z80Var2 != null && (characterStyle = z80Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.K0 = null;
                                return true;
                            }
                            this.K0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            v80Var.d(true);
                            this.K0 = null;
                        }
                    }
                }
            }
            clickableSpan = null;
            if (clickableSpan == null) {
            }
            if (motionEvent.getAction() == 1) {
            }
            if (motionEvent.getAction() == 3) {
            }
        }
        return this.K0 != null || super.onTouchEvent(motionEvent);
    }
}
