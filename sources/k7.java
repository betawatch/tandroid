// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ s7 b;

    public k7(s7 s7Var, float f) {
        this.b = s7Var;
        this.a = f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s7 s7Var = this.b;
        s7Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x = s7Var.e.getX();
        float f = this.a;
        if (x != f) {
            m7 m7Var = s7Var.e;
            m7Var.setTranslationX(f - m7Var.getX());
        }
        s7Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(k43.f).start();
        return true;
    }
}
