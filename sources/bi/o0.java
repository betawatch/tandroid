package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o0 extends di.w5 {
    public final Path E0;
    public final float[] F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ t0 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0 t0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, a3.f fVar, o oVar, o oVar2, o oVar3, o oVar4, o oVar5, o oVar6, int i7) {
        super(context, e6Var, fVar, oVar, null, oVar2, oVar3, oVar4, oVar5, oVar6);
        this.H0 = t0Var;
        this.G0 = i7;
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override // di.w5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.E0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // di.w5
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(this.G0);
    }

    @Override // di.w5
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(this.G0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        q0 q0Var = this.H0.Y1;
        if (q0Var != null) {
            q0Var.invalidate();
        }
    }

    @Override // di.w5
    public final void k(int i7) {
        this.H0.Y1.setRibbonColor(i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i7, i10, this.F0, Path.Direction.CW);
    }
}
