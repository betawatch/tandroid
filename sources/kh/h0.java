package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h0 extends lh.c5 {
    public final /* synthetic */ m0 A0;
    public final Path x0;
    public final float[] y0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ef.e eVar, dg.m mVar, dg.m mVar2, dg.m mVar3, dg.m mVar4, dg.m mVar5, dg.m mVar6, int i10) {
        super(context, f6Var, eVar, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = m0Var;
        this.z0 = i10;
        this.x0 = new Path();
        this.y0 = new float[8];
    }

    @Override // lh.c5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.x0);
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

    @Override // lh.c5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.z0);
    }

    @Override // lh.c5
    public final float getRealHeight() {
        return AndroidUtilities.dp(this.z0);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j0 j0Var = this.A0.Z;
        if (j0Var != null) {
            j0Var.invalidate();
        }
    }

    @Override // lh.c5
    public final void j(int i10) {
        this.A0.Z.setRibbonColor(i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.y0, Path.Direction.CW);
    }
}
