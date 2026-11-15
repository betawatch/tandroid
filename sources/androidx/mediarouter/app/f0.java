package androidx.mediarouter.app;

import android.view.animation.Animation;
import org.telegram.ui.ActionBar.g4;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.w1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ((w1) this.b).o1.setAlpha(0.0f);
                break;
            default:
                ((g4) this.b).f.post(new r0(this, 8));
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
                g4 g4Var = (g4) this.b;
                g4Var.i.setEnabled(false);
                g4Var.g.setVisibility(0);
                g4Var.h.setVisibility(0);
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
