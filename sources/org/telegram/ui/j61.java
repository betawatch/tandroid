package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ l71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(l71 l71Var, Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 1:
                this.c = l71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = l71Var;
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
                l71 l71Var = this.c;
                j61 j61Var = l71Var.F0;
                b71 b71Var = l71Var.z0;
                l61 l61Var = l71Var.a;
                org.telegram.ui.ActionBar.k6.t(j61Var, b71Var, l61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                l71 l71Var2 = this.c;
                j61 j61Var2 = l71Var2.G0;
                b71 b71Var2 = l71Var2.z0;
                l61 l61Var2 = l71Var2.a;
                org.telegram.ui.ActionBar.k6.t(j61Var2, b71Var2, l61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, l61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
