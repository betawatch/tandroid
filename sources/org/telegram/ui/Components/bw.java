package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(ty tyVar, Context context, boolean z10) {
        super(context);
        this.b = tyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ty tyVar = this.b;
        hw hwVar = tyVar.C0;
        dw dwVar = tyVar.E0;
        gw gwVar = tyVar.H0;
        if (this.a || !(view == dwVar || view == gwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f;
        if (view == dwVar) {
            y10 = Math.max(y10, gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * tyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ty tyVar = this.b;
        tyVar.L0 = true;
        tyVar.Z();
        jg.d1 d1Var = tyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ty tyVar = this.b;
        tyVar.L0 = false;
        tyVar.Z();
        jg.d1 d1Var = tyVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
