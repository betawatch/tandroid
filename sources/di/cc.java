package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.k10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ cc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.f = view;
        this.b = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        int i10 = this.e;
        int i11 = this.d;
        int i12 = this.c;
        int i13 = this.b;
        View view = this.f;
        switch (i7) {
            case 0:
                fc fcVar = (fc) view;
                fcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fcVar.r = i0.a.f(floatValue, i13, i12);
                fcVar.s = i0.a.f(floatValue, i11, i10);
                fcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{fcVar.r, fcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fcVar.invalidate();
                break;
            case 1:
                k10 k10Var = (k10) view;
                k10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                k10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                k10Var.G.setColorFilter(new PorterDuffColorFilter(k10Var.M, PorterDuff.Mode.MULTIPLY));
                k10Var.F.setColor(k10Var.M);
                k10Var.r.setColor(k10Var.N);
                k10Var.K.d(i0.a.o(k10Var.N, 38));
                k10Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) view;
                zVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                zVar.G0 = f10;
                zVar.U.setColor(f10);
                if (zVar.T > 0.0f) {
                    zVar.invalidate();
                    break;
                }
                break;
        }
    }
}
