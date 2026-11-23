package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.s10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ gc(View view, int i7, int i10, int i11, int i12, int i13) {
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
                jc jcVar = (jc) view;
                jcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.r = i0.a.f(floatValue, i13, i12);
                jcVar.s = i0.a.f(floatValue, i11, i10);
                jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.r, jcVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jcVar.invalidate();
                break;
            case 1:
                s10 s10Var = (s10) view;
                s10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                s10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                s10Var.G.setColorFilter(new PorterDuffColorFilter(s10Var.M, PorterDuff.Mode.MULTIPLY));
                s10Var.F.setColor(s10Var.M);
                s10Var.r.setColor(s10Var.N);
                s10Var.K.d(i0.a.o(s10Var.N, 38));
                s10Var.invalidate();
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
