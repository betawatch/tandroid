package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ qc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb1(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = qc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = qc1Var;
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
                qc1 qc1Var = this.c;
                nb1 nb1Var = qc1Var.z0;
                fc1 fc1Var = qc1Var.t0;
                pb1 pb1Var = qc1Var.a;
                org.telegram.ui.ActionBar.g6.s(nb1Var, fc1Var, pb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                qc1 qc1Var2 = this.c;
                nb1 nb1Var2 = qc1Var2.A0;
                fc1 fc1Var2 = qc1Var2.t0;
                pb1 pb1Var2 = qc1Var2.a;
                org.telegram.ui.ActionBar.g6.s(nb1Var2, fc1Var2, pb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, pb1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
