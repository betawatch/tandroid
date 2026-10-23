package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ u50 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = u50Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
        u50 u50Var = this.Y2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        if (k30Var.r == null && !u50Var.N2.k()) {
            z20Var.setAlpha(1.0f);
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(0.0f);
        }
        g30 g30Var = u50Var.m2;
        z20Var.getClass();
        g30Var.getClass();
        if (RecyclerView.R(z20Var) == -1 && z20Var.getRenderer() != null) {
            return true;
        }
        if (z20Var.getTranslationY() == 0.0f || z20Var.getRenderer() == null || z20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = z40Var.getTop() - getTop();
        float measuredHeight = z40Var.getMeasuredHeight() + top;
        float f7 = k30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
