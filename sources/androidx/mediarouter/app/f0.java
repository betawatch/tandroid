package androidx.mediarouter.app;

import android.view.animation.Animation;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                n0Var.O = false;
                n0Var.o();
                break;
            case 1:
                ((x1) this.b).n1.setAlpha(0.0f);
                break;
            default:
                ((j4) this.b).f.post(new l2.a0(this, 25));
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
                ((l0) this.b).x.O = true;
                break;
            case 1:
                break;
            default:
                j4 j4Var = (j4) this.b;
                j4Var.i.setEnabled(false);
                j4Var.g.setVisibility(0);
                j4Var.h.setVisibility(0);
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
