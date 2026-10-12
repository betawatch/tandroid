package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nb0 implements zf.k0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ nb0(Object obj, int i10) {
        this.a = i10;
        this.d = obj;
    }

    @Override // zf.k0
    public void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i10 = launchActivity.A1 + (z10 ? 1 : -1);
                        launchActivity.A1 = i10;
                        l0 l0Var = launchActivity.w0;
                        if (l0Var != null) {
                            l0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                zf.l0 l0Var2 = (zf.l0) this.d;
                if (this.b != z10 && !this.c) {
                    this.b = z10;
                    if (z10) {
                        l0Var2.a++;
                    } else {
                        l0Var2.a--;
                    }
                    boolean z11 = l0Var2.a > 0;
                    if (l0Var2.b != z11) {
                        l0Var2.b = z11;
                        Window window = (Window) ((WeakReference) l0Var2.c.b).get();
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

    @Override // zf.k0
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

    public nb0(LaunchActivity launchActivity, boolean z10) {
        this.a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
