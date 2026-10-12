package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ad1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ ce1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(ce1 ce1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = ce1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = ce1Var;
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
                ce1 ce1Var = this.c;
                ad1 ad1Var = ce1Var.D0;
                rd1 rd1Var = ce1Var.x0;
                cd1 cd1Var = ce1Var.a;
                org.telegram.ui.ActionBar.g6.s(ad1Var, rd1Var, cd1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                ce1 ce1Var2 = this.c;
                ad1 ad1Var2 = ce1Var2.E0;
                rd1 rd1Var2 = ce1Var2.x0;
                cd1 cd1Var2 = ce1Var2.a;
                org.telegram.ui.ActionBar.g6.s(ad1Var2, rd1Var2, cd1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.g6.b1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, cd1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
