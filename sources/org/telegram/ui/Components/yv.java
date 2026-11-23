package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(qy qyVar, Context context, boolean z10) {
        super(context);
        this.b = qyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qy qyVar = this.b;
        ew ewVar = qyVar.C0;
        aw awVar = qyVar.E0;
        dw dwVar = qyVar.H0;
        if (this.a || !(view == awVar || view == dwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = ewVar.getY() + ewVar.getMeasuredHeight() + 1.0f;
        if (view == awVar) {
            y10 = Math.max(y10, dwVar.getY() + dwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * qyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qy qyVar = this.b;
        qyVar.L0 = true;
        qyVar.Z();
        jg.d1 d1Var = qyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qy qyVar = this.b;
        qyVar.L0 = false;
        qyVar.Z();
        jg.d1 d1Var = qyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
