package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ pd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc1(pd1 pd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = pd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = pd1Var;
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
                pd1 pd1Var = this.c;
                nc1 nc1Var = pd1Var.D0;
                ed1 ed1Var = pd1Var.x0;
                pc1 pc1Var = pd1Var.a;
                org.telegram.ui.ActionBar.i6.s(nc1Var, ed1Var, pc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var.H("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                pd1 pd1Var2 = this.c;
                nc1 nc1Var2 = pd1Var2.E0;
                ed1 ed1Var2 = pd1Var2.x0;
                pc1 pc1Var2 = pd1Var2.a;
                org.telegram.ui.ActionBar.i6.s(nc1Var2, ed1Var2, pc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.H("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.i6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pc1Var2.H("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
