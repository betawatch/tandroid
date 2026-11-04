package androidx.mediarouter.app;

import android.view.animation.Animation;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.v1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                o0 o0Var = ((m0) this.b).x;
                o0Var.P = false;
                o0Var.o();
                break;
            case 1:
                ((v1) this.b).q1.setAlpha(0.0f);
                break;
            default:
                ((i4) this.b).f.post(new lg.n(this, 29));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i3 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((m0) this.b).x.P = true;
                break;
            case 1:
                break;
            default:
                i4 i4Var = (i4) this.b;
                i4Var.i.setEnabled(false);
                i4Var.g.setVisibility(0);
                i4Var.h.setVisibility(0);
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
