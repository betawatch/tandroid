package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ib1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ kc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib1(kc1 kc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = kc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = kc1Var;
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
                kc1 kc1Var = this.c;
                ib1 ib1Var = kc1Var.D0;
                zb1 zb1Var = kc1Var.x0;
                kb1 kb1Var = kc1Var.a;
                org.telegram.ui.ActionBar.h6.s(ib1Var, zb1Var, kb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var.n("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                kc1 kc1Var2 = this.c;
                ib1 ib1Var2 = kc1Var2.E0;
                zb1 zb1Var2 = kc1Var2.x0;
                kb1 kb1Var2 = kc1Var2.a;
                org.telegram.ui.ActionBar.h6.s(ib1Var2, zb1Var2, kb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var2.n("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, kb1Var2.n("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
