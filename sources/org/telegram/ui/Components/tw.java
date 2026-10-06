package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(nz nzVar, Context context, boolean z10) {
        super(context);
        this.b = nzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.b;
        ax axVar = nzVar.B0;
        vw vwVar = nzVar.D0;
        zw zwVar = nzVar.G0;
        if (this.a || !(view == vwVar || view == zwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = axVar.getY() + axVar.getMeasuredHeight() + 1.0f;
        if (view == vwVar) {
            y3 = Math.max(y3, zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * nzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nz nzVar = this.b;
        nzVar.K0 = true;
        nzVar.X();
        gg.g1 g1Var = nzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nz nzVar = this.b;
        nzVar.K0 = false;
        nzVar.X();
        gg.g1 g1Var = nzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
