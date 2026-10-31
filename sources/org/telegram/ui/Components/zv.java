package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zv extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(vy vyVar, Context context, boolean z10) {
        super(context);
        this.b = vyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.b;
        gw gwVar = vyVar.B0;
        bw bwVar = vyVar.D0;
        fw fwVar = vyVar.G0;
        if (this.a || !(view == bwVar || view == fwVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = gwVar.getY() + gwVar.getMeasuredHeight() + 1.0f;
        if (view == bwVar) {
            y3 = Math.max(y3, fwVar.getY() + fwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (org.telegram.messenger.i0.L(16.0f) * vyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vy vyVar = this.b;
        vyVar.K0 = true;
        vyVar.Z();
        mw mwVar = vyVar.T0;
        if (mwVar != null) {
            mwVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vy vyVar = this.b;
        vyVar.K0 = false;
        vyVar.Z();
        mw mwVar = vyVar.T0;
        if (mwVar != null) {
            mwVar.a();
        }
    }
}
