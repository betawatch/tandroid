package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.ActionBar.k5 {
    public final org.telegram.ui.ActionBar.e6 N0;
    public final m2.p0 O0;
    public t70 P0;

    public q70(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O0 = new m2.p0(this);
        this.N0 = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.O0.h(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        m2.p0 p0Var = this.O0;
        if (p0Var != null) {
            Layout layout = getLayout();
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x10 - getLayoutX());
                int layoutY = (int) (y9 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f10 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f10);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f10 && layout2.getLineWidth(lineForVertical) + lineLeft >= f10 && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            t70 t70Var = new t70(clickableSpan, this.N0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.P0 = t70Var;
                            p0Var.b(t70Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.P0.i);
                            int spanEnd = spannableString.getSpanEnd(this.P0.i);
                            n70 b10 = this.P0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            p0Var.f(true);
                            t70 t70Var2 = this.P0;
                            if (t70Var2 != null && (characterStyle = t70Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.P0 = null;
                                return true;
                            }
                            this.P0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            p0Var.f(true);
                            this.P0 = null;
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
        return this.P0 != null || super.onTouchEvent(motionEvent);
    }
}
