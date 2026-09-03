package kf;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t0 implements s0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public t0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override // kf.s0
    public final void a(boolean z4) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.d;
                if (this.b != z4 && !this.c) {
                    this.b = z4;
                    if (z4) {
                        u0Var.a++;
                    } else {
                        u0Var.a--;
                    }
                    boolean z10 = u0Var.a > 0;
                    if (u0Var.b != z10) {
                        u0Var.b = z10;
                        Window window = (Window) ((WeakReference) u0Var.c.b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z10 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.b != z4 && !this.c) {
                    this.b = z4;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.x1 + (z4 ? 1 : -1);
                        launchActivity.x1 = i10;
                        org.telegram.ui.n0 n0Var = launchActivity.t0;
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

    @Override // kf.s0
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

    public t0(LaunchActivity launchActivity, boolean z4) {
        this.d = new WeakReference(launchActivity);
    }
}
