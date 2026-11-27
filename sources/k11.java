// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v21 b;

    public /* synthetic */ k11(v21 v21Var, byte b) {
        this.a = b;
        this.b = v21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v21 v21Var = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = v21Var.h;
                z11 z11Var = v21Var.e;
                r11 r11Var = v21Var.q;
                if (r11Var != null && !z11Var.top) {
                    r11Var.b(0.0f);
                    v21Var.q.c(v21Var);
                }
                z11Var.transitionRunningExit = false;
                z11Var.onExitTransitionEnd();
                z11Var.onHide();
                frameLayout.removeView(v21Var.f);
                frameLayout.removeOnLayoutChangeListener(v21Var.c);
                z11Var.onDetach();
                Runnable runnable = v21Var.w;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                FrameLayout frameLayout2 = v21Var.h;
                frameLayout2.removeView(v21Var.f);
                frameLayout2.removeOnLayoutChangeListener(v21Var.c);
                break;
            default:
                v21Var.b();
                break;
        }
    }
}
