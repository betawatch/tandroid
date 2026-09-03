package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ jd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(jd1 jd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = jd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = jd1Var;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                jd1 jd1Var = this.c;
                gc1 gc1Var = jd1Var.A0;
                yc1 yc1Var = jd1Var.u0;
                ic1 ic1Var = jd1Var.a;
                org.telegram.ui.ActionBar.k6.s(gc1Var, yc1Var, ic1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                jd1 jd1Var2 = this.c;
                gc1 gc1Var2 = jd1Var2.B0;
                yc1 yc1Var2 = jd1Var2.u0;
                ic1 ic1Var2 = jd1Var2.a;
                org.telegram.ui.ActionBar.k6.s(gc1Var2, yc1Var2, ic1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ic1Var2.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
