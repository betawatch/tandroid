// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mc0 d;

    public gc0(mc0 mc0Var, float f, float f2, boolean z) {
        this.d = mc0Var;
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar;
        a aVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mc0 mc0Var = this.d;
        mc0Var.O = floatValue;
        float R1 = gm.R1(this.a, this.b, floatValue);
        aVar = ((d) mc0Var).actionBar;
        aVar.getTitleTextView().setAlpha(mc0Var.O);
        if (mc0Var.G && !this.c) {
            mc0Var.n0(false, 1.0f - mc0Var.O);
        }
        mc0Var.r.setTranslationY(R1);
        mc0Var.y.setTranslationY(R1);
        mc0Var.fragmentView.invalidate();
        aVar2 = ((d) mc0Var).actionBar;
        aVar2.invalidate();
    }
}
