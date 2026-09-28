package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ l6 c;
    public final /* synthetic */ m6 d;

    public /* synthetic */ e6(z6 z6Var, l6 l6Var, m6 m6Var, int i10) {
        this.a = i10;
        this.b = z6Var;
        this.c = l6Var;
        this.d = m6Var;
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
