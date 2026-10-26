package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i30 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ v50 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = v50Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view;
        v50 v50Var = this.f3;
        b50 b50Var = v50Var.Q;
        m30 m30Var = v50Var.a2;
        if (m30Var.r == null && !v50Var.N2.k()) {
            b30Var.setAlpha(1.0f);
            b30Var.setTranslationX(0.0f);
            b30Var.setTranslationY(0.0f);
        }
        i30 i30Var = v50Var.m2;
        b30Var.getClass();
        i30Var.getClass();
        if (RecyclerView.R(b30Var) == -1 && b30Var.getRenderer() != null) {
            return true;
        }
        if (b30Var.getTranslationY() == 0.0f || b30Var.getRenderer() == null || b30Var.getRenderer().c == null) {
            return super.drawChild(canvas, view, j10);
        }
        float top = b50Var.getTop() - getTop();
        float measuredHeight = b50Var.getMeasuredHeight() + top;
        float f7 = m30Var.c;
        canvas.save();
        float f10 = 1.0f - f7;
        canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
