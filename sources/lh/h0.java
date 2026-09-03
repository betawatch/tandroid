package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h0 extends mh.c5 {
    public final /* synthetic */ m0 A0;
    public final Path x0;
    public final float[] y0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, Context context, g6 g6Var, eh.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6, eg.m mVar7, int i10) {
        super(context, g6Var, mVar, mVar2, null, mVar3, mVar4, mVar5, mVar6, mVar7);
        this.A0 = m0Var;
        this.z0 = i10;
        this.x0 = new Path();
        this.y0 = new float[8];
    }

    @Override // mh.c5, android.view.ViewGroup, android.view.View
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

    @Override // mh.c5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(this.z0);
    }

    @Override // mh.c5
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

    @Override // mh.c5
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
