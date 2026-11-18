package androidx.mediarouter.app;

import android.view.animation.Animation;
import oi.a2;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class f0 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                n0 n0Var = ((l0) this.b).x;
                n0Var.P = false;
                n0Var.o();
                break;
            case 1:
                ((x1) this.b).o1.setAlpha(0.0f);
                break;
            default:
                ((k4) this.b).f.post(new a2(this, 12));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i7 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((l0) this.b).x.P = true;
                break;
            case 1:
                break;
            default:
                k4 k4Var = (k4) this.b;
                k4Var.i.setEnabled(false);
                k4Var.g.setVisibility(0);
                k4Var.h.setVisibility(0);
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
