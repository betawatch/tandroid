package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class eb0 implements yf.j0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public boolean c;
    public final Object d;

    public eb0(yf.k0 k0Var) {
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
                        k0 k0Var = launchActivity.w0;
                        if (k0Var != null) {
                            k0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                yf.k0 k0Var2 = (yf.k0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        k0Var2.a++;
                    } else {
                        k0Var2.a--;
                    }
                    boolean z11 = k0Var2.a > 0;
                    if (k0Var2.b != z11) {
                        k0Var2.b = z11;
                        Window window = (Window) ((WeakReference) k0Var2.c.b).get();
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

    public eb0(LaunchActivity launchActivity, boolean z10) {
        this.d = new WeakReference(launchActivity);
    }
}
