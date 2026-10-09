package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gx extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ a00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(a00 a00Var, Context context, boolean z10) {
        super(context);
        this.b = a00Var;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.b;
        mx mxVar = a00Var.B0;
        ix ixVar = a00Var.D0;
        lx lxVar = a00Var.G0;
        if (this.a || !(view == ixVar || view == lxVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = mxVar.getY() + mxVar.getMeasuredHeight() + 1.0f;
        if (view == ixVar) {
            y3 = Math.max(y3, lxVar.getY() + lxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * a00Var.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a00 a00Var = this.b;
        a00Var.K0 = true;
        a00Var.Y();
        gg.f1 f1Var = a00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a00 a00Var = this.b;
        a00Var.K0 = false;
        a00Var.Y();
        gg.f1 f1Var = a00Var.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
