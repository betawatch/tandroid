package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ca0 extends org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.ActionBar.e6 M0;
    public final ba0 N0;
    public fa0 O0;

    public ca0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.N0 = new ba0(this);
        this.M0 = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.j5, android.view.View
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
    @Override // org.telegram.ui.ActionBar.j5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        ba0 ba0Var = this.N0;
        if (ba0Var != null) {
            Layout layout = getLayout();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x10 - getLayoutX());
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
                            fa0 fa0Var = new fa0(clickableSpan, this.M0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.O0 = fa0Var;
                            ba0Var.a(fa0Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.O0.i);
                            int spanEnd = spannableString.getSpanEnd(this.O0.i);
                            y90 b10 = this.O0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            ba0Var.d(true);
                            fa0 fa0Var2 = this.O0;
                            if (fa0Var2 != null && (characterStyle = fa0Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.O0 = null;
                                return true;
                            }
                            this.O0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            ba0Var.d(true);
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
