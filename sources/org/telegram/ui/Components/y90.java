package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y90 extends org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.u6 M0;
    public final x90 N0;
    public ba0 O0;

    public y90(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.N0 = new x90(this);
        this.M0 = u6Var;
    }

    @Override // org.telegram.ui.ActionBar.b6, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.N0.f(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // org.telegram.ui.ActionBar.b6, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        x90 x90Var = this.N0;
        if (x90Var != null) {
            Layout layout = getLayout();
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x9 - getLayoutX());
                int layoutY = (int) (y3 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f7 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f7);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f7 && layout2.getLineWidth(lineForVertical) + lineLeft >= f7 && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            ba0 ba0Var = new ba0(clickableSpan, this.M0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.O0 = ba0Var;
                            x90Var.a(ba0Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.O0.i);
                            int spanEnd = spannableString.getSpanEnd(this.O0.i);
                            t90 b10 = this.O0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            x90Var.d(true);
                            ba0 ba0Var2 = this.O0;
                            if (ba0Var2 != null && (characterStyle = ba0Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.O0 = null;
                                return true;
                            }
                            this.O0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            x90Var.d(true);
                            this.O0 = null;
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
        return this.O0 != null || super.onTouchEvent(motionEvent);
    }
}
