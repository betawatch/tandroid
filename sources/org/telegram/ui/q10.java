package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ x30 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = x30Var;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view;
        x30 x30Var = this.f3;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        if (u10Var.r == null && !x30Var.F4.k()) {
            d10Var.setAlpha(1.0f);
            d10Var.setTranslationX(0.0f);
            d10Var.setTranslationY(0.0f);
        }
        q10 q10Var = x30Var.e4;
        d10Var.getClass();
        q10Var.getClass();
        if (RecyclerView.R(d10Var) == -1 && d10Var.getRenderer() != null) {
            return true;
        }
        if (d10Var.getTranslationY() == 0.0f || d10Var.getRenderer() == null || d10Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = f30Var.getTop() - getTop();
        float measuredHeight = f30Var.getMeasuredHeight() + top;
        float f10 = u10Var.c;
        canvas.save();
        float f11 = 1.0f - f10;
        canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
