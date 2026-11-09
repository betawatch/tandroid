package bi;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.h10;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ wd(View view, int i7, int i10, int i11, int i12, int i13) {
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
                zd zdVar = (zd) view;
                zdVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.r = i0.a.f(floatValue, i13, i12);
                zdVar.s = i0.a.f(floatValue, i11, i10);
                zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.r, zdVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                zdVar.invalidate();
                break;
            case 1:
                h10 h10Var = (h10) view;
                h10Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                h10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                h10Var.F.setColorFilter(new PorterDuffColorFilter(h10Var.L, PorterDuff.Mode.MULTIPLY));
                h10Var.E.setColor(h10Var.L);
                h10Var.r.setColor(h10Var.M);
                h10Var.J.d(i0.a.o(h10Var.M, 38));
                h10Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) view;
                yVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.D0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                yVar.F0 = f10;
                yVar.T.setColor(f10);
                if (yVar.S > 0.0f) {
                    yVar.invalidate();
                    break;
                }
                break;
        }
    }
}
