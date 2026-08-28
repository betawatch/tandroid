package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ qa0(ra0 ra0Var, int i9) {
        this.a = i9;
        this.b = ra0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ra0 ra0Var = this.b;
                if (ra0Var.W != -1) {
                    NotificationCenter.getInstance(ra0Var.Y.V.w).onAnimationFinish(ra0Var.W);
                    ra0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                ra0 ra0Var2 = this.b;
                if (ra0Var2.W != -1) {
                    NotificationCenter.getInstance(ra0Var2.Y.V.w).onAnimationFinish(ra0Var2.W);
                    ra0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
