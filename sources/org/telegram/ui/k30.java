package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k30 extends org.telegram.ui.Components.nm0 {
    public final /* synthetic */ x50 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = x50Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view;
        x50 x50Var = this.f3;
        d50 d50Var = x50Var.Q;
        o30 o30Var = x50Var.a2;
        if (o30Var.r == null && !x50Var.N2.k()) {
            b30Var.setAlpha(1.0f);
            b30Var.setTranslationX(0.0f);
            b30Var.setTranslationY(0.0f);
        }
        k30 k30Var = x50Var.m2;
        b30Var.getClass();
        k30Var.getClass();
        if (RecyclerView.R(b30Var) == -1 && b30Var.getRenderer() != null) {
            return true;
        }
        if (b30Var.getTranslationY() == 0.0f || b30Var.getRenderer() == null || b30Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = d50Var.getTop() - getTop();
        float measuredHeight = d50Var.getMeasuredHeight() + top;
        float f7 = o30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
