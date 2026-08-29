package jf;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s0 implements r0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public s0(t0 t0Var) {
        this.d = t0Var;
    }

    @Override // jf.r0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        t0Var.a++;
                    } else {
                        t0Var.a--;
                    }
                    boolean z11 = t0Var.a > 0;
                    if (t0Var.b != z11) {
                        t0Var.b = z11;
                        Window window = (Window) ((WeakReference) t0Var.c.b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.w1 + (z10 ? 1 : -1);
                        launchActivity.w1 = i10;
                        org.telegram.ui.n0 n0Var = launchActivity.s0;
                        if (n0Var != null) {
                            n0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
        }
    }

    @Override // jf.r0
    public final void destroy() {
        switch (this.a) {
            case 0:
                a(false);
                this.c = true;
                break;
            default:
                a(false);
                this.c = true;
                break;
        }
    }

    public s0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
