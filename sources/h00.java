// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h00 extends ssa {
    public final Path H0;
    public final float[] I0;
    public final /* synthetic */ short J0;
    public final /* synthetic */ m00 K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h00(m00 m00Var, Context context, ylb ylbVar, f00 f00Var, x10 x10Var, x10 x10Var2, x10 x10Var3, x10 x10Var4, x10 x10Var5, x10 x10Var6, int i) {
        super(context, ylbVar, f00Var, x10Var, null, x10Var2, x10Var3, x10Var4, x10Var5, x10Var6);
        this.K0 = m00Var;
        this.J0 = i;
        this.H0 = new Path();
        this.I0 = new float[8];
    }

    @Override // ssa, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.b) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // ssa
    public final int getFinalHeight() {
        return gm.L(this.J0);
    }

    @Override // ssa
    public final float getRealHeight() {
        return gm.L(this.J0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j00 j00Var = this.K0.X1;
        if (j00Var != null) {
            j00Var.invalidate();
        }
    }

    @Override // ssa
    public final void k(int i) {
        this.K0.X1.setRibbonColor(i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gm.L(12.0f);
        float[] fArr = this.I0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.I0, Path.Direction.CW);
    }
}
