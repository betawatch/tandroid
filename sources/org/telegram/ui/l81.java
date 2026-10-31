package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l81 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ m91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l81(m91 m91Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = m91Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = m91Var;
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
                m91 m91Var = this.c;
                l81 l81Var = m91Var.E0;
                c91 c91Var = m91Var.y0;
                n81 n81Var = m91Var.a;
                org.telegram.ui.ActionBar.t6.t(l81Var, c91Var, n81Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                m91 m91Var2 = this.c;
                l81 l81Var2 = m91Var2.F0;
                c91 c91Var2 = m91Var2.y0;
                n81 n81Var2 = m91Var2.a;
                org.telegram.ui.ActionBar.t6.t(l81Var2, c91Var2, n81Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, n81Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
