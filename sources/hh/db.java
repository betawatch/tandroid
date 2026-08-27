package hh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.e20;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ db(View view, int i10, int i11, int i12, int i13, int i14) {
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
                gb gbVar = (gb) view;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.r = i0.b.d(floatValue, i14, i13);
                gbVar.s = i0.b.d(floatValue, i12, i11);
                gbVar.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.r, gbVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gbVar.invalidate();
                break;
            case 1:
                e20 e20Var = (e20) view;
                e20Var.H = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                e20Var.I = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                e20Var.B.setColorFilter(new PorterDuffColorFilter(e20Var.H, PorterDuff.Mode.MULTIPLY));
                e20Var.A.setColor(e20Var.H);
                e20Var.r.setColor(e20Var.I);
                e20Var.F.d(i0.b.k(e20Var.I, 38));
                e20Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.z0 = i0.b.d(floatValue2, i14, i13);
                int d = i0.b.d(floatValue2, i12, i11);
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
