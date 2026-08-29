package jh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.n20;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ xa(View view, int i10, int i11, int i12, int i13, int i14) {
        this.a = i14;
        this.f = view;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.c;
        int i14 = this.b;
        View view = this.f;
        switch (i10) {
            case 0:
                ab abVar = (ab) view;
                abVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abVar.r = i0.a.d(floatValue, i14, i13);
                abVar.s = i0.a.d(floatValue, i12, i11);
                abVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{abVar.r, abVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                abVar.invalidate();
                break;
            case 1:
                n20 n20Var = (n20) view;
                n20Var.H = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                n20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                n20Var.B.setColorFilter(new PorterDuffColorFilter(n20Var.H, PorterDuff.Mode.MULTIPLY));
                n20Var.A.setColor(n20Var.H);
                n20Var.r.setColor(n20Var.I);
                n20Var.F.d(i0.a.k(n20Var.I, 38));
                n20Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.z0 = i0.a.d(floatValue2, i14, i13);
                int d = i0.a.d(floatValue2, i12, i11);
                uVar.B0 = d;
                uVar.P.setColor(d);
                if (uVar.O > 0.0f) {
                    uVar.invalidate();
                    break;
                }
                break;
        }
    }
}
