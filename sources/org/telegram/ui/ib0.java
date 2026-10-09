package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ib0 implements yf.j0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ ib0(Object obj, int i10) {
        this.a = i10;
        this.d = obj;
    }

    @Override // yf.j0
    public void a(boolean z10) {
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

    public void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        Runnable runnable = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // yf.j0
    public void destroy() {
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

    public ib0(LaunchActivity launchActivity, boolean z10) {
        this.a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
