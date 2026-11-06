package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(gy gyVar, Context context, boolean z9) {
        super(context);
        this.b = gyVar;
        this.a = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.b;
        tv tvVar = gyVar.B0;
        pv pvVar = gyVar.D0;
        sv svVar = gyVar.G0;
        if (this.a || !(view == pvVar || view == svVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = tvVar.getY() + tvVar.getMeasuredHeight() + 1.0f;
        if (view == pvVar) {
            y10 = Math.max(y10, svVar.getY() + svVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * gyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gy gyVar = this.b;
        gyVar.K0 = true;
        gyVar.Z();
        jg.e1 e1Var = gyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gy gyVar = this.b;
        gyVar.K0 = false;
        gyVar.Z();
        jg.e1 e1Var = gyVar.T0;
        if (e1Var != null) {
            e1Var.a();
        }
    }
}
