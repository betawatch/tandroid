package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ jd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc1(jd1 jd1Var, Context context, int i10) {
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
                hc1 hc1Var = jd1Var.A0;
                yc1 yc1Var = jd1Var.u0;
                jc1 jc1Var = jd1Var.a;
                org.telegram.ui.ActionBar.j6.s(hc1Var, yc1Var, jc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                jd1 jd1Var2 = this.c;
                hc1 hc1Var2 = jd1Var2.B0;
                yc1 yc1Var2 = jd1Var2.u0;
                jc1 jc1Var2 = jd1Var2.a;
                org.telegram.ui.ActionBar.j6.s(hc1Var2, yc1Var2, jc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, jc1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
