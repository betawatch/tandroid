package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(kz kzVar, Context context, boolean z10) {
        super(context);
        this.b = kzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.b;
        ww wwVar = kzVar.B0;
        sw swVar = kzVar.D0;
        vw vwVar = kzVar.G0;
        if (this.a || !(view == swVar || view == vwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f;
        if (view == swVar) {
            y3 = Math.max(y3, vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * kzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kz kzVar = this.b;
        kzVar.K0 = true;
        kzVar.Y();
        gg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.b;
        kzVar.K0 = false;
        kzVar.Y();
        gg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
