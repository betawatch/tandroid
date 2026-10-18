package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class kb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ mc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb1(mc1 mc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = mc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = mc1Var;
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
                mc1 mc1Var = this.c;
                kb1 kb1Var = mc1Var.D0;
                bc1 bc1Var = mc1Var.x0;
                mb1 mb1Var = mc1Var.a;
                org.telegram.ui.ActionBar.h6.s(kb1Var, bc1Var, mb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var.n("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                mc1 mc1Var2 = this.c;
                kb1 kb1Var2 = mc1Var2.E0;
                bc1 bc1Var2 = mc1Var2.x0;
                mb1 mb1Var2 = mc1Var2.a;
                org.telegram.ui.ActionBar.h6.s(kb1Var2, bc1Var2, mb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, mb1Var2.n("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
