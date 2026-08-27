package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ m6 c;
    public final /* synthetic */ n6 d;

    public /* synthetic */ e6(z6 z6Var, m6 m6Var, n6 n6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
        this.c = m6Var;
        this.d = n6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new e6(this.b, this.c, this.d, 1));
                break;
            default:
                z6.W(this.b, this.c, this.d);
                break;
        }
    }
}
