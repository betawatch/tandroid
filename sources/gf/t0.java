package gf;

import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 implements s0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public t0(u0 u0Var) {
        this.d = u0Var;
    }

    @Override // gf.s0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        u0Var.a++;
                    } else {
                        u0Var.a--;
                    }
                    boolean z11 = u0Var.a > 0;
                    if (u0Var.b != z11) {
                        u0Var.b = z11;
                        Window window = (Window) ((WeakReference) u0Var.c.b).get();
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

    @Override // gf.s0
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

    public t0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
