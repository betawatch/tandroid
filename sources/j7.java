// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ r7 b;

    public j7(r7 r7Var, float f) {
        this.b = r7Var;
        this.a = f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r7 r7Var = this.b;
        r7Var.e.getViewTreeObserver().removeOnPreDrawListener(this);
        float x = r7Var.e.getX();
        float f = this.a;
        if (x != f) {
            l7 l7Var = r7Var.e;
            l7Var.setTranslationX(f - l7Var.getX());
        }
        r7Var.e.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(s33.f).start();
        return true;
    }
}
