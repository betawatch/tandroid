package org.telegram.ui;

import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class na0 implements zf.k0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;

    public /* synthetic */ na0(Object obj, int i10) {
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
                        int i10 = launchActivity.B1 + (z10 ? 1 : -1);
                        launchActivity.B1 = i10;
                        m0 m0Var = launchActivity.w0;
                        if (m0Var != null) {
                            m0Var.setVisibility(i10 > 0 ? 8 : 0);
                        }
                        launchActivity.getWindow();
                        break;
                    }
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.d;
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

    public na0(LaunchActivity launchActivity, boolean z10) {
        this.a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
