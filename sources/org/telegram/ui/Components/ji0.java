package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ ji0(mi0 mi0Var, int i9) {
        this.a = i9;
        this.b = mi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mi0 mi0Var = this.b;
                mi0Var.getClass();
                try {
                    ff.h hVar = mi0Var.z0;
                    if (hVar != null) {
                        hVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(mi0Var.x0);
                break;
            case 1:
                mi0 mi0Var2 = this.b;
                mi0Var2.M = null;
                mi0Var2.n();
                break;
            case 2:
                mi0.h(this.b);
                break;
            case 3:
                mi0.e(this.b);
                break;
            case 4:
                mi0.d(this.b);
                break;
            case 5:
                mi0.f(this.b);
                break;
            default:
                this.b.k();
                break;
        }
    }
}
