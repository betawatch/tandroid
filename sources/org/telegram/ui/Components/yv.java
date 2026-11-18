package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(ry ryVar, Context context, boolean z10) {
        super(context);
        this.b = ryVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ry ryVar = this.b;
        fw fwVar = ryVar.C0;
        aw awVar = ryVar.E0;
        ew ewVar = ryVar.H0;
        if (this.a || !(view == awVar || view == ewVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f;
        if (view == awVar) {
            y10 = Math.max(y10, ewVar.getY() + ewVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * ryVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ry ryVar = this.b;
        ryVar.L0 = true;
        ryVar.Z();
        jg.d1 d1Var = ryVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ry ryVar = this.b;
        ryVar.L0 = false;
        ryVar.Z();
        jg.d1 d1Var = ryVar.U0;
        if (d1Var != null) {
            d1Var.a();
        }
    }
}
