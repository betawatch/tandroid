package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ tc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb1(tc1 tc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = tc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = tc1Var;
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
                tc1 tc1Var = this.c;
                qb1 qb1Var = tc1Var.E0;
                ic1 ic1Var = tc1Var.y0;
                sb1 sb1Var = tc1Var.a;
                org.telegram.ui.ActionBar.y6.s(qb1Var, ic1Var, sb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                tc1 tc1Var2 = this.c;
                qb1 qb1Var2 = tc1Var2.F0;
                ic1 ic1Var2 = tc1Var2.y0;
                sb1 sb1Var2 = tc1Var2.a;
                org.telegram.ui.ActionBar.y6.s(qb1Var2, ic1Var2, sb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, sb1Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
