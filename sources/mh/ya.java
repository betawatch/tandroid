package mh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.t20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ ya(View view, int i10, int i11, int i12, int i13, int i14) {
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
                bb bbVar = (bb) view;
                bbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.r = i0.a.d(floatValue, i14, i13);
                bbVar.s = i0.a.d(floatValue, i12, i11);
                bbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.r, bbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                bbVar.invalidate();
                break;
            case 1:
                t20 t20Var = (t20) view;
                t20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                t20Var.J = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                t20Var.C.setColorFilter(new PorterDuffColorFilter(t20Var.I, PorterDuff.Mode.MULTIPLY));
                t20Var.B.setColor(t20Var.I);
                t20Var.r.setColor(t20Var.J);
                t20Var.G.d(i0.a.k(t20Var.J, 38));
                t20Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.A0 = i0.a.d(floatValue2, i14, i13);
                int d = i0.a.d(floatValue2, i12, i11);
                uVar.C0 = d;
                uVar.Q.setColor(d);
                if (uVar.P > 0.0f) {
                    uVar.invalidate();
                    break;
                }
                break;
        }
    }
}
