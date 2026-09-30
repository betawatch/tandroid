package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(mz mzVar, Context context, boolean z10) {
        super(context);
        this.b = mzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.b;
        zw zwVar = mzVar.B0;
        vw vwVar = mzVar.D0;
        yw ywVar = mzVar.G0;
        if (this.a || !(view == vwVar || view == ywVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f;
        if (view == vwVar) {
            y3 = Math.max(y3, ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mz mzVar = this.b;
        mzVar.K0 = true;
        mzVar.Y();
        gg.g1 g1Var = mzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mz mzVar = this.b;
        mzVar.K0 = false;
        mzVar.Y();
        gg.g1 g1Var = mzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
