package gh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.b20;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ db(View view, int i9, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.f = view;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        int i10 = this.e;
        int i11 = this.d;
        int i12 = this.c;
        int i13 = this.b;
        View view = this.f;
        switch (i9) {
            case 0:
                gb gbVar = (gb) view;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.r = i0.a.d(floatValue, i13, i12);
                gbVar.s = i0.a.d(floatValue, i11, i10);
                gbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.r, gbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gbVar.invalidate();
                break;
            case 1:
                b20 b20Var = (b20) view;
                b20Var.H = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                b20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                b20Var.B.setColorFilter(new PorterDuffColorFilter(b20Var.H, PorterDuff.Mode.MULTIPLY));
                b20Var.A.setColor(b20Var.H);
                b20Var.r.setColor(b20Var.I);
                b20Var.F.d(i0.a.k(b20Var.I, 38));
                b20Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.z0 = i0.a.d(floatValue2, i13, i12);
                int d = i0.a.d(floatValue2, i11, i10);
                tVar.B0 = d;
                tVar.P.setColor(d);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                    break;
                }
                break;
        }
    }
}
