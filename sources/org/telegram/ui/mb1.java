package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ oc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb1(oc1 oc1Var, Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 1:
                this.c = oc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = oc1Var;
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
                oc1 oc1Var = this.c;
                mb1 mb1Var = oc1Var.z0;
                dc1 dc1Var = oc1Var.t0;
                ob1 ob1Var = oc1Var.a;
                org.telegram.ui.ActionBar.f6.s(mb1Var, dc1Var, ob1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var.O("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.f6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var.O("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                oc1 oc1Var2 = this.c;
                mb1 mb1Var2 = oc1Var2.A0;
                dc1 dc1Var2 = oc1Var2.t0;
                ob1 ob1Var2 = oc1Var2.a;
                org.telegram.ui.ActionBar.f6.s(mb1Var2, dc1Var2, ob1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var2.O("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.f6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ob1Var2.O("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
