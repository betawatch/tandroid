package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ac1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ cd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(cd1 cd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = cd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = cd1Var;
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
                cd1 cd1Var = this.c;
                ac1 ac1Var = cd1Var.A0;
                rc1 rc1Var = cd1Var.u0;
                cc1 cc1Var = cd1Var.a;
                org.telegram.ui.ActionBar.j6.s(ac1Var, rc1Var, cc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                cd1 cd1Var2 = this.c;
                ac1 ac1Var2 = cd1Var2.B0;
                rc1 rc1Var2 = cd1Var2.u0;
                cc1 cc1Var2 = cd1Var2.a;
                org.telegram.ui.ActionBar.j6.s(ac1Var2, rc1Var2, cc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cc1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
