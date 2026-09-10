package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ww extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ rz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(rz rzVar, Context context, boolean z10) {
        super(context);
        this.b = rzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        rz rzVar = this.b;
        cx cxVar = rzVar.B0;
        yw ywVar = rzVar.D0;
        bx bxVar = rzVar.G0;
        if (this.a || !(view == ywVar || view == bxVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f;
        if (view == ywVar) {
            y3 = Math.max(y3, bxVar.getY() + bxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * rzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.b;
        rzVar.K0 = true;
        rzVar.a0();
        fg.h1 h1Var = rzVar.T0;
        if (h1Var != null) {
            h1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.b;
        rzVar.K0 = false;
        rzVar.a0();
        fg.h1 h1Var = rzVar.T0;
        if (h1Var != null) {
            h1Var.a();
        }
    }
}
