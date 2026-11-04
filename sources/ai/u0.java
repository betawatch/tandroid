package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u0 extends ci.f6 {
    public final Path E0;
    public final float[] F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ z0 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z0 z0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, s sVar, t tVar, t tVar2, t tVar3, t tVar4, t tVar5, t tVar6, int i3) {
        super(context, e6Var, sVar, tVar, null, tVar2, tVar3, tVar4, tVar5, tVar6);
        this.H0 = z0Var;
        this.G0 = i3;
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override // ci.f6, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.E0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // ci.f6
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(this.G0);
    }

    @Override // ci.f6
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(this.G0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        w0 w0Var = this.H0.V1;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    @Override // ci.f6
    public final void k(int i3) {
        this.H0.V1.setRibbonColor(i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i3, i10, this.F0, Path.Direction.CW);
    }
}
