package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ ed1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(ed1 ed1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = ed1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = ed1Var;
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
                ed1 ed1Var = this.c;
                bc1 bc1Var = ed1Var.A0;
                tc1 tc1Var = ed1Var.u0;
                dc1 dc1Var = ed1Var.a;
                org.telegram.ui.ActionBar.k6.s(bc1Var, tc1Var, dc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                ed1 ed1Var2 = this.c;
                bc1 bc1Var2 = ed1Var2.B0;
                tc1 tc1Var2 = ed1Var2.u0;
                dc1 dc1Var2 = ed1Var2.a;
                org.telegram.ui.ActionBar.k6.s(bc1Var2, tc1Var2, dc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, dc1Var2.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
