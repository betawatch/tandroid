package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ t71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(t71 t71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = t71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = t71Var;
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
                t71 t71Var = this.c;
                q61 q61Var = t71Var.F0;
                j71 j71Var = t71Var.z0;
                s61 s61Var = t71Var.a;
                org.telegram.ui.ActionBar.j6.t(q61Var, j71Var, s61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                t71 t71Var2 = this.c;
                q61 q61Var2 = t71Var2.G0;
                j71 j71Var2 = t71Var2.z0;
                s61 s61Var2 = t71Var2.a;
                org.telegram.ui.ActionBar.j6.t(q61Var2, j71Var2, s61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, s61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
