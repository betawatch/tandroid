package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c1 extends c5 {
    public final /* synthetic */ j1 A0;
    public final float[] x0;
    public final Path y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(j1 j1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, a1 a1Var, dg.m mVar, dg.m mVar2, dg.m mVar3, dg.m mVar4, dg.m mVar5, dg.m mVar6) {
        super(context, f6Var, a1Var, mVar, null, mVar2, mVar3, mVar4, mVar5, mVar6);
        this.A0 = j1Var;
        this.x0 = new float[3];
        this.y0 = new Path();
        this.z0 = new float[8];
    }

    @Override // lh.c5
    public final void d(c5.d dVar) {
        super.d(dVar);
        this.A0.T(true);
    }

    @Override // lh.c5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.y0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // lh.c5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // lh.c5
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // lh.c5
    public final void j(int i10) {
        j1 j1Var = this.A0;
        ImageView imageView = j1Var.j0;
        if (imageView != null && org.telegram.ui.ActionBar.j6.B1(imageView.getBackground(), i10, false)) {
            j1Var.j0.invalidate();
        }
        ImageView imageView2 = j1Var.k0;
        if (imageView2 != null && org.telegram.ui.ActionBar.j6.B1(imageView2.getBackground(), i10, false)) {
            j1Var.k0.invalidate();
        }
        for (dg.v3 v3Var : j1Var.W) {
            Drawable background = v3Var.getBackground();
            org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) v3Var.b;
            if (org.telegram.ui.ActionBar.j6.B1(background, i10, false)) {
                v3Var.invalidate();
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
            } else if (org.telegram.ui.ActionBar.j6.B1(k6Var.getSizeableBackground(), HSVToColor, false)) {
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
