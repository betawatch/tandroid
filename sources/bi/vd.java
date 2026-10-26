package bi;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.b30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ vd(View view, int i10, int i11, int i12, int i13, int i14) {
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
                yd ydVar = (yd) view;
                ydVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ydVar.r = i0.a.f(floatValue, i14, i13);
                ydVar.s = i0.a.f(floatValue, i12, i11);
                ydVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ydVar.r, ydVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                ydVar.invalidate();
                break;
            case 1:
                b30 b30Var = (b30) view;
                b30Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                b30Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                b30Var.F.setColorFilter(new PorterDuffColorFilter(b30Var.L, PorterDuff.Mode.MULTIPLY));
                b30Var.E.setColor(b30Var.L);
                b30Var.r.setColor(b30Var.M);
                b30Var.J.d(i0.a.o(b30Var.M, 38));
                b30Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.D0 = i0.a.f(floatValue2, i14, i13);
                int f7 = i0.a.f(floatValue2, i12, i11);
                tVar.F0 = f7;
                tVar.T.setColor(f7);
                if (tVar.S > 0.0f) {
                    tVar.invalidate();
                    break;
                }
                break;
        }
    }
}
