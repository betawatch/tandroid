package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ey b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(ey eyVar, Context context, boolean z10) {
        super(context);
        this.b = eyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ey eyVar = this.b;
        sv svVar = eyVar.C0;
        ov ovVar = eyVar.E0;
        rv rvVar = eyVar.H0;
        if (this.a || !(view == ovVar || view == rvVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y9 = svVar.getY() + svVar.getMeasuredHeight() + 1.0f;
        if (view == ovVar) {
            y9 = Math.max(y9, rvVar.getY() + rvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y9 - (org.telegram.messenger.g0.L(16.0f) * eyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ey eyVar = this.b;
        eyVar.L0 = true;
        eyVar.Z();
        kg.a1 a1Var = eyVar.U0;
        if (a1Var != null) {
            a1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ey eyVar = this.b;
        eyVar.L0 = false;
        eyVar.Z();
        kg.a1 a1Var = eyVar.U0;
        if (a1Var != null) {
            a1Var.a();
        }
    }
}
