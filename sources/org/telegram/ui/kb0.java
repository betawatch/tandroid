package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kb0 implements yf.k0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public kb0(yf.l0 l0Var) {
        this.d = l0Var;
    }

    @Override // yf.k0
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
                yf.l0 l0Var = (yf.l0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        l0Var.a++;
                    } else {
                        l0Var.a--;
                    }
                    boolean z11 = l0Var.a > 0;
                    if (l0Var.b != z11) {
                        l0Var.b = z11;
                        Window window = (Window) ((WeakReference) l0Var.c.b).get();
                        if (window != null) {
                            window.getDecorView().setVisibility(z11 ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // yf.k0
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
