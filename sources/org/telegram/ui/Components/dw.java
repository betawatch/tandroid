package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(wy wyVar, Context context, boolean z10) {
        super(context);
        this.b = wyVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.b;
        jw jwVar = wyVar.x0;
        fw fwVar = wyVar.z0;
        iw iwVar = wyVar.C0;
        if (this.a || !(view == fwVar || view == iwVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f;
        if (view == fwVar) {
            y10 = Math.max(y10, iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * wyVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wy wyVar = this.b;
        wyVar.G0 = true;
        wyVar.Z();
        of.b1 b1Var = wyVar.P0;
        if (b1Var != null) {
            b1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wy wyVar = this.b;
        wyVar.G0 = false;
        wyVar.Z();
        of.b1 b1Var = wyVar.P0;
        if (b1Var != null) {
            b1Var.a();
        }
    }
}
