package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 extends jh.d5 {
    public final Path w0;
    public final float[] x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ n0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, cg.m2 m2Var, bg.n nVar, bg.n nVar2, bg.n nVar3, bg.n nVar4, bg.n nVar5, bg.n nVar6, int i10) {
        super(context, c6Var, m2Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.z0 = n0Var;
        this.y0 = i10;
        this.w0 = new Path();
        this.x0 = new float[8];
    }

    @Override // jh.d5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.w0);
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

    @Override // jh.d5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.y0);
    }

    @Override // jh.d5
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.y0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        k0 k0Var = this.z0.Y;
        if (k0Var != null) {
            k0Var.invalidate();
        }
    }

    @Override // jh.d5
    public final void j(int i10) {
        this.z0.Y.setRibbonColor(i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.x0, Path.Direction.CW);
    }
}
