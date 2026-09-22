package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ m6 c;
    public final /* synthetic */ n6 d;

    public /* synthetic */ f6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
        this.c = m6Var;
        this.d = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new f6(this.b, this.c, this.d, 1));
                break;
            default:
                z6.X(this.b, this.c, this.d);
                break;
        }
    }
}
