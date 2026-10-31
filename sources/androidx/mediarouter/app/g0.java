package androidx.mediarouter.app;

import android.view.animation.Animation;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.q4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g0 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                o0 o0Var = ((m0) this.b).x;
                o0Var.O = false;
                o0Var.o();
                break;
            case 1:
                ((b2) this.b).p1.setAlpha(0.0f);
                break;
            default:
                ((q4) this.b).f.post(new lg.s(this, 25));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i10 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((m0) this.b).x.O = true;
                break;
            case 1:
                break;
            default:
                q4 q4Var = (q4) this.b;
                q4Var.i.setEnabled(false);
                q4Var.g.setVisibility(0);
                q4Var.h.setVisibility(0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
