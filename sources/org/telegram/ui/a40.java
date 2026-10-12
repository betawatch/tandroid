package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ n60 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = n60Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) view;
        n60 n60Var = this.V2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        if (e40Var.r == null && !n60Var.N2.k()) {
            e30Var.setAlpha(1.0f);
            e30Var.setTranslationX(0.0f);
            e30Var.setTranslationY(0.0f);
        }
        a40 a40Var = n60Var.m2;
        e30Var.getClass();
        a40Var.getClass();
        if (RecyclerView.R(e30Var) == -1 && e30Var.getRenderer() != null) {
            return true;
        }
        if (e30Var.getTranslationY() == 0.0f || e30Var.getRenderer() == null || e30Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = t50Var.getTop() - getTop();
        float measuredHeight = t50Var.getMeasuredHeight() + top;
        float f7 = e40Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
