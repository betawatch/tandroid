package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class s1 extends e7 {
    public final float[] B0;
    public final Path C0;
    public final float[] D0;
    public final /* synthetic */ a2 E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a2 a2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, p1 p1Var, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, d6Var, p1Var, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
        this.E0 = a2Var;
        this.B0 = new float[3];
        this.C0 = new Path();
        this.D0 = new float[8];
    }

    @Override // ai.e7
    public final void d(g6 g6Var) {
        super.d(g6Var);
        this.E0.U(true);
    }

    @Override // ai.e7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.C0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // ai.e7
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // ai.e7
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override // ai.e7
    public final void k(int i10) {
        a2 a2Var = this.E0;
        ImageView imageView = a2Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.h6.C1(imageView.getBackground(), i10, false)) {
            a2Var.m0.invalidate();
        }
        ImageView imageView2 = a2Var.n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.h6.C1(imageView2.getBackground(), i10, false)) {
            a2Var.n0.invalidate();
        }
        for (w1 w1Var : a2Var.Z) {
            Drawable background = w1Var.getBackground();
            org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) w1Var.d;
            if (org.telegram.ui.ActionBar.h6.C1(background, i10, false)) {
                w1Var.invalidate();
            }
            int f7 = i0.b.f(0.33f, i10, -1);
            float[] fArr = this.B0;
            Color.colorToHSV(f7, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (q6Var.getSizeableBackground() instanceof t6) {
                ((t6) q6Var.getSizeableBackground()).b.setColor(HSVToColor);
                q6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.h6.C1(q6Var.getSizeableBackground(), HSVToColor, false)) {
                q6Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.D0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.C0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.D0, Path.Direction.CW);
    }
}
