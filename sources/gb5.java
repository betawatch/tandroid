// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gb5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb5 b;

    public /* synthetic */ gb5(jb5 jb5Var, byte b) {
        this.a = b;
        this.b = jb5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jb5 jb5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.invalidate();
                break;
            default:
                jb5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.c = floatValue;
                g95 g95Var = jb5Var.k0;
                g95Var.u3.setAlpha(1.0f - floatValue);
                a85 a85Var = g95Var.H1;
                a85Var.setAlpha((1.0f - g95Var.T3.c) * (a85Var.getTag() != null ? 1.0f : 0.0f));
                g95Var.y1(g95Var.s2);
                jb5Var.j();
                break;
        }
    }
}
