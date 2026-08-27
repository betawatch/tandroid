package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 extends e5 {
    public final float[] w0;
    public final Path x0;
    public final float[] y0;
    public final /* synthetic */ l1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l1 l1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, b1 b1Var, ag.l2 l2Var, ag.l2 l2Var2, ag.l2 l2Var3, ag.l2 l2Var4, ag.l2 l2Var5, ag.l2 l2Var6) {
        super(context, c6Var, b1Var, l2Var, null, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6);
        this.z0 = l1Var;
        this.w0 = new float[3];
        this.x0 = new Path();
        this.y0 = new float[8];
    }

    @Override // hh.e5
    public final void d(j4 j4Var) {
        super.d(j4Var);
        this.z0.T(true);
    }

    @Override // hh.e5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.x0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // hh.e5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // hh.e5
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // hh.e5
    public final void j(int i10) {
        l1 l1Var = this.z0;
        ImageView imageView = l1Var.i0;
        if (imageView != null && org.telegram.ui.ActionBar.g6.B1(imageView.getBackground(), i10, false)) {
            l1Var.i0.invalidate();
        }
        ImageView imageView2 = l1Var.j0;
        if (imageView2 != null && org.telegram.ui.ActionBar.g6.B1(imageView2.getBackground(), i10, false)) {
            l1Var.j0.invalidate();
        }
        for (h1 h1Var : l1Var.V) {
            Drawable background = h1Var.getBackground();
            org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) h1Var.d;
            if (org.telegram.ui.ActionBar.g6.B1(background, i10, false)) {
                h1Var.invalidate();
            }
            int d = i0.b.d(0.33f, i10, -1);
            float[] fArr = this.w0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (j6Var.getSizeableBackground() instanceof u4) {
                ((u4) j6Var.getSizeableBackground()).b.setColor(HSVToColor);
                j6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.g6.B1(j6Var.getSizeableBackground(), HSVToColor, false)) {
                j6Var.invalidate();
            }
        }
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
