// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gb0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mb0 d;

    public gb0(mb0 mb0Var, float f, float f2, boolean z) {
        this.d = mb0Var;
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar;
        a aVar2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mb0 mb0Var = this.d;
        mb0Var.O = floatValue;
        float R1 = gl.R1(this.a, this.b, floatValue);
        aVar = ((d) mb0Var).actionBar;
        aVar.getTitleTextView().setAlpha(mb0Var.O);
        if (mb0Var.G && !this.c) {
            mb0Var.m0(false, 1.0f - mb0Var.O);
        }
        mb0Var.r.setTranslationY(R1);
        mb0Var.y.setTranslationY(R1);
        mb0Var.fragmentView.invalidate();
        aVar2 = ((d) mb0Var).actionBar;
        aVar2.invalidate();
    }
}
