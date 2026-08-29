package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f30 extends org.telegram.ui.Components.jl0 {
    public final /* synthetic */ r50 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.T2 = r50Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
        r50 r50Var = this.T2;
        x40 x40Var = r50Var.M;
        j30 j30Var = r50Var.W1;
        if (j30Var.r == null && !r50Var.J2.k()) {
            n20Var.setAlpha(1.0f);
            n20Var.setTranslationX(0.0f);
            n20Var.setTranslationY(0.0f);
        }
        f30 f30Var = r50Var.i2;
        n20Var.getClass();
        f30Var.getClass();
        if (RecyclerView.R(n20Var) == -1 && n20Var.getRenderer() != null) {
            return true;
        }
        if (n20Var.getTranslationY() == 0.0f || n20Var.getRenderer() == null || n20Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = x40Var.getTop() - getTop();
        float measuredHeight = x40Var.getMeasuredHeight() + top;
        float f9 = j30Var.c;
        canvas.save();
        float f10 = 1.0f - f9;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f9) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
