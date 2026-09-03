package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b1 extends c5 {
    public final /* synthetic */ i1 A0;
    public final float[] x0;
    public final Path y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i1 i1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, z0 z0Var, eg.m mVar, eg.m mVar2, eg.m mVar3, eg.m mVar4, eg.m mVar5, eg.m mVar6) {
        super(context, g6Var, z0Var, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = i1Var;
        this.x0 = new float[3];
        this.y0 = new Path();
        this.z0 = new float[8];
    }

    @Override // mh.c5
    public final void d(c5.d dVar) {
        super.d(dVar);
        this.A0.T(true);
    }

    @Override // mh.c5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.y0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // mh.c5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // mh.c5
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // mh.c5
    public final void j(int i10) {
        i1 i1Var = this.A0;
        ImageView imageView = i1Var.j0;
        if (imageView != null && org.telegram.ui.ActionBar.k6.B1(imageView.getBackground(), i10, false)) {
            i1Var.j0.invalidate();
        }
        ImageView imageView2 = i1Var.k0;
        if (imageView2 != null && org.telegram.ui.ActionBar.k6.B1(imageView2.getBackground(), i10, false)) {
            i1Var.k0.invalidate();
        }
        for (eg.t3 t3Var : i1Var.W) {
            Drawable background = t3Var.getBackground();
            org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) t3Var.b;
            if (org.telegram.ui.ActionBar.k6.B1(background, i10, false)) {
                t3Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.x0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (k6Var.getSizeableBackground() instanceof s4) {
                ((s4) k6Var.getSizeableBackground()).b.setColor(HSVToColor);
                k6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.k6.B1(k6Var.getSizeableBackground(), HSVToColor, false)) {
                k6Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.z0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.y0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.z0, Path.Direction.CW);
    }
}
