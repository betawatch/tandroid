package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class rw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(kz kzVar, Context context, boolean z10) {
        super(context);
        this.b = kzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        kz kzVar = this.b;
        xw xwVar = kzVar.B0;
        tw twVar = kzVar.D0;
        ww wwVar = kzVar.G0;
        if (this.a || !(view == twVar || view == wwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f;
        if (view == twVar) {
            y3 = Math.max(y3, wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f);
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
        kzVar.a0();
        hg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kz kzVar = this.b;
        kzVar.K0 = false;
        kzVar.a0();
        hg.g1 g1Var = kzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
