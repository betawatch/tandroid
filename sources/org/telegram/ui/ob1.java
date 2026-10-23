package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ob1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ qc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob1(qc1 qc1Var, Context context, int i10) {
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
                ob1 ob1Var = qc1Var.E0;
                fc1 fc1Var = qc1Var.y0;
                qb1 qb1Var = qc1Var.a;
                org.telegram.ui.ActionBar.k6.s(ob1Var, fc1Var, qb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                qc1 qc1Var2 = this.c;
                ob1 ob1Var2 = qc1Var2.F0;
                fc1 fc1Var2 = qc1Var2.y0;
                qb1 qb1Var2 = qc1Var2.a;
                org.telegram.ui.ActionBar.k6.s(ob1Var2, fc1Var2, qb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
