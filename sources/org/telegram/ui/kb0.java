package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kb0 implements yf.j0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public kb0(yf.k0 k0Var) {
        this.d = k0Var;
    }

    @Override // yf.j0
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.A1 + (z10 ? 1 : -1);
                        launchActivity.A1 = i10;
                        j0 j0Var = launchActivity.w0;
                        if (j0Var != null) {
                            j0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                yf.k0 k0Var = (yf.k0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        k0Var.a++;
                    } else {
                        k0Var.a--;
                    }
                    boolean z11 = k0Var.a > 0;
                    if (k0Var.b != z11) {
                        k0Var.b = z11;
                        Window window = (Window) ((WeakReference) k0Var.c.b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // yf.j0
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

    public kb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
