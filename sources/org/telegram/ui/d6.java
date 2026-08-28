package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ l6 c;
    public final /* synthetic */ m6 d;

    public /* synthetic */ d6(y6 y6Var, l6 l6Var, m6 m6Var, int i9) {
        this.a = i9;
        this.b = y6Var;
        this.c = l6Var;
        this.d = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new d6(this.b, this.c, this.d, 1));
                break;
            default:
                y6.V(this.b, this.c, this.d);
                break;
        }
    }
}
