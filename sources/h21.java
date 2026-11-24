// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u31 b;

    public /* synthetic */ h21(u31 u31Var, byte b) {
        this.a = b;
        this.b = u31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u31 u31Var = this.b;
        switch (b) {
            case 0:
                u31Var.b();
                break;
            case 1:
                FrameLayout frameLayout = u31Var.h;
                y21 y21Var = u31Var.e;
                q21 q21Var = u31Var.q;
                if (q21Var != null && !y21Var.top) {
                    q21Var.b(0.0f);
                    u31Var.q.c(u31Var);
                }
                y21Var.transitionRunningExit = false;
                y21Var.onExitTransitionEnd();
                y21Var.onHide();
                frameLayout.removeView(u31Var.f);
                frameLayout.removeOnLayoutChangeListener(u31Var.c);
                y21Var.onDetach();
                Runnable runnable = u31Var.w;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                FrameLayout frameLayout2 = u31Var.h;
                frameLayout2.removeView(u31Var.f);
                frameLayout2.removeOnLayoutChangeListener(u31Var.c);
                break;
        }
    }
}
