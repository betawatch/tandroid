package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ nc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(nc1 nc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = nc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = nc1Var;
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
                nc1 nc1Var = this.c;
                kb1 kb1Var = nc1Var.z0;
                cc1 cc1Var = nc1Var.t0;
                mb1 mb1Var = nc1Var.a;
                org.telegram.ui.ActionBar.g6.s(kb1Var, cc1Var, mb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.N("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.N("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                nc1 nc1Var2 = this.c;
                kb1 kb1Var2 = nc1Var2.A0;
                cc1 cc1Var2 = nc1Var2.t0;
                mb1 mb1Var2 = nc1Var2.a;
                org.telegram.ui.ActionBar.g6.s(kb1Var2, cc1Var2, mb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.N("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.N("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
