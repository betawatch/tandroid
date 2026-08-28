package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d1 extends g5 {
    public final float[] w0;
    public final Path x0;
    public final float[] y0;
    public final /* synthetic */ l1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l1 l1Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, b1 b1Var, fh.n nVar, fh.n nVar2, fh.n nVar3, fh.n nVar4, fh.n nVar5, fh.n nVar6) {
        super(context, b6Var, b1Var, nVar, null, nVar2, nVar3, nVar4, nVar5, nVar6);
        this.z0 = l1Var;
        this.w0 = new float[3];
        this.x0 = new Path();
        this.y0 = new float[8];
    }

    @Override // gh.g5
    public final void d(l4 l4Var) {
        super.d(l4Var);
        this.z0.S(true);
    }

    @Override // gh.g5, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.x0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // gh.g5
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // gh.g5
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // gh.g5
    public final void j(int i9) {
        l1 l1Var = this.z0;
        ImageView imageView = l1Var.i0;
        if (imageView != null && org.telegram.ui.ActionBar.f6.B1(imageView.getBackground(), i9, false)) {
            l1Var.i0.invalidate();
        }
        ImageView imageView2 = l1Var.j0;
        if (imageView2 != null && org.telegram.ui.ActionBar.f6.B1(imageView2.getBackground(), i9, false)) {
            l1Var.j0.invalidate();
        }
        for (h1 h1Var : l1Var.V) {
            Drawable background = h1Var.getBackground();
            org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) h1Var.d;
            if (org.telegram.ui.ActionBar.f6.B1(background, i9, false)) {
                h1Var.invalidate();
            }
            int d = i0.a.d(0.33f, i9, -1);
            float[] fArr = this.w0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (j6Var.getSizeableBackground() instanceof w4) {
                ((w4) j6Var.getSizeableBackground()).b.setColor(HSVToColor);
                j6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.f6.B1(j6Var.getSizeableBackground(), HSVToColor, false)) {
                j6Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.y0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.x0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i9, i10, this.y0, Path.Direction.CW);
    }
}
