package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.r10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                r10 r10Var = (r10) view;
                r10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                r10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                r10Var.G.setColorFilter(new PorterDuffColorFilter(r10Var.M, PorterDuff.Mode.MULTIPLY));
                r10Var.F.setColor(r10Var.M);
                r10Var.r.setColor(r10Var.N);
                r10Var.K.d(i0.a.o(r10Var.N, 38));
                r10Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) view;
                yVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                yVar.G0 = f10;
                yVar.U.setColor(f10);
                if (yVar.T > 0.0f) {
                    yVar.invalidate();
                    break;
                }
                break;
        }
    }
}
