package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(sz szVar, Context context, boolean z10) {
        super(context);
        this.b = szVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sz szVar = this.b;
        dx dxVar = szVar.B0;
        zw zwVar = szVar.D0;
        cx cxVar = szVar.G0;
        if (this.a || !(view == zwVar || view == cxVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = dxVar.getY() + dxVar.getMeasuredHeight() + 1.0f;
        if (view == zwVar) {
            y3 = Math.max(y3, cxVar.getY() + cxVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * szVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sz szVar = this.b;
        szVar.K0 = true;
        szVar.Y();
        ig.f1 f1Var = szVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sz szVar = this.b;
        szVar.K0 = false;
        szVar.Y();
        ig.f1 f1Var = szVar.T0;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
