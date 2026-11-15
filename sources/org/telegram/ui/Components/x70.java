package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x70 extends org.telegram.ui.ActionBar.j5 {
    public final org.telegram.ui.ActionBar.e6 N0;
    public final n2.o0 O0;
    public a80 P0;

    public x70(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O0 = new n2.o0(this);
        this.N0 = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.j5, android.view.View
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
    @Override // org.telegram.ui.ActionBar.j5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        n2.o0 o0Var = this.O0;
        if (o0Var != null) {
            Layout layout = getLayout();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            Layout layout2 = getLayout();
            if (layout2 != null) {
                int layoutX = (int) (x10 - getLayoutX());
                int layoutY = (int) (y10 - getLayoutY());
                int lineForVertical = layout2.getLineForVertical(layoutY);
                float f10 = layoutX;
                int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f10);
                float lineLeft = layout2.getLineLeft(lineForVertical);
                if (lineLeft <= f10 && layout2.getLineWidth(lineForVertical) + lineLeft >= f10 && layoutY >= 0 && layoutY <= layout2.getHeight()) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                        clickableSpan = clickableSpanArr[0];
                        if (clickableSpan == null && motionEvent.getAction() == 0) {
                            a80 a80Var = new a80(clickableSpan, this.N0, motionEvent.getX(), motionEvent.getY(), 0);
                            this.P0 = a80Var;
                            o0Var.b(a80Var, null);
                            SpannableString spannableString = new SpannableString(layout.getText());
                            int spanStart = spannableString.getSpanStart(this.P0.i);
                            int spanEnd = spannableString.getSpanEnd(this.P0.i);
                            u70 b10 = this.P0.b();
                            b10.d(layout, spanStart, 0.0f);
                            layout.getSelectionPath(spanStart, spanEnd, b10);
                            return true;
                        }
                        if (motionEvent.getAction() == 1) {
                            o0Var.f(true);
                            a80 a80Var2 = this.P0;
                            if (a80Var2 != null && (characterStyle = a80Var2.i) == clickableSpan) {
                                if (characterStyle instanceof ClickableSpan) {
                                    ((ClickableSpan) characterStyle).onClick(this);
                                }
                                this.P0 = null;
                                return true;
                            }
                            this.P0 = null;
                        }
                        if (motionEvent.getAction() == 3) {
                            o0Var.f(true);
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
