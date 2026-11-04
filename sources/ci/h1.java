package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 extends f6 {
    public final float[] E0;
    public final Path F0;
    public final float[] G0;
    public final /* synthetic */ p1 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(p1 p1Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, d1 d1Var, ai.t tVar, ai.t tVar2, ai.t tVar3, ai.t tVar4, ai.t tVar5, ai.t tVar6) {
        super(context, e6Var, d1Var, tVar, null, tVar2, tVar3, tVar4, tVar5, tVar6);
        this.H0 = p1Var;
        this.E0 = new float[3];
        this.F0 = new Path();
        this.G0 = new float[8];
    }

    @Override // ci.f6
    public final void d(k5 k5Var) {
        super.d(k5Var);
        this.H0.h1(true);
    }

    @Override // ci.f6, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.F0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // ci.f6
    public final int getFinalHeight() {
        return org.telegram.messenger.g0.L(315.0f);
    }

    @Override // ci.f6
    public final float getRealHeight() {
        return org.telegram.messenger.g0.L(315.0f);
    }

    @Override // ci.f6
    public final void k(int i3) {
        p1 p1Var = this.H0;
        ImageView imageView = p1Var.f2;
        if (imageView != null && org.telegram.ui.ActionBar.k6.H1(imageView.getBackground(), i3, false)) {
            p1Var.f2.invalidate();
        }
        ImageView imageView2 = p1Var.g2;
        if (imageView2 != null && org.telegram.ui.ActionBar.k6.H1(imageView2.getBackground(), i3, false)) {
            p1Var.g2.invalidate();
        }
        for (l1 l1Var : p1Var.S1) {
            Drawable background = l1Var.getBackground();
            org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) l1Var.d;
            if (org.telegram.ui.ActionBar.k6.H1(background, i3, false)) {
                l1Var.invalidate();
            }
            int f10 = i0.a.f(0.33f, i3, -1);
            float[] fArr = this.E0;
            Color.colorToHSV(f10, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (h6Var.getSizeableBackground() instanceof v5) {
                ((v5) h6Var.getSizeableBackground()).b.setColor(HSVToColor);
                h6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.k6.H1(h6Var.getSizeableBackground(), HSVToColor, false)) {
                h6Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f);
        float[] fArr = this.G0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.F0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i3, i10, this.G0, Path.Direction.CW);
    }
}
