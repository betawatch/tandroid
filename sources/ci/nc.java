package ci;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.d10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ nc(View view, int i3, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.f = view;
        this.b = i3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        int i10 = this.e;
        int i11 = this.d;
        int i12 = this.c;
        int i13 = this.b;
        View view = this.f;
        switch (i3) {
            case 0:
                qc qcVar = (qc) view;
                qcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.r = i0.a.f(floatValue, i13, i12);
                qcVar.s = i0.a.f(floatValue, i11, i10);
                qcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{qcVar.r, qcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                qcVar.invalidate();
                break;
            case 1:
                d10 d10Var = (d10) view;
                d10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                d10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                d10Var.G.setColorFilter(new PorterDuffColorFilter(d10Var.M, PorterDuff.Mode.MULTIPLY));
                d10Var.F.setColor(d10Var.M);
                d10Var.r.setColor(d10Var.N);
                d10Var.K.d(i0.a.o(d10Var.N, 38));
                d10Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                rVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                rVar.G0 = f10;
                rVar.U.setColor(f10);
                if (rVar.T > 0.0f) {
                    rVar.invalidate();
                    break;
                }
                break;
        }
    }
}
