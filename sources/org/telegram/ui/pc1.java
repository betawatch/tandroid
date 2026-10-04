package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class pc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ rd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc1(rd1 rd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = rd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = rd1Var;
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
                rd1 rd1Var = this.c;
                pc1 pc1Var = rd1Var.D0;
                gd1 gd1Var = rd1Var.x0;
                rc1 rc1Var = rd1Var.a;
                org.telegram.ui.ActionBar.i6.s(pc1Var, gd1Var, rc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var.H("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                rd1 rd1Var2 = this.c;
                pc1 pc1Var2 = rd1Var2.E0;
                gd1 gd1Var2 = rd1Var2.x0;
                rc1 rc1Var2 = rd1Var2.a;
                org.telegram.ui.ActionBar.i6.s(pc1Var2, gd1Var2, rc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var2.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, rc1Var2.H("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
