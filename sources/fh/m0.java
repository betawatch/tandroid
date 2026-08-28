package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends gh.g5 {
    public final Path w0;
    public final float[] x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ r0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, af.e eVar, n nVar, n nVar2, n nVar3, n nVar4, n nVar5, n nVar6, int i9) {
        super(context, b6Var, eVar, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.z0 = r0Var;
        this.y0 = i9;
        this.w0 = new Path();
        this.x0 = new float[8];
    }

    @Override // gh.g5, android.view.ViewGroup, android.view.View
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

    @Override // gh.g5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.y0);
    }

    @Override // gh.g5
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.y0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        o0 o0Var = this.z0.Y;
        if (o0Var != null) {
            o0Var.invalidate();
        }
    }

    @Override // gh.g5
    public final void j(int i9) {
        this.z0.Y.setRibbonColor(i9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.x0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.w0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i9, i10, this.x0, Path.Direction.CW);
    }
}
