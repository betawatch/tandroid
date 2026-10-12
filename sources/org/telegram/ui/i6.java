package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;
    public final /* synthetic */ q6 c;
    public final /* synthetic */ r6 d;

    public /* synthetic */ i6(d7 d7Var, q6 q6Var, r6 r6Var, int i10) {
        this.a = i10;
        this.b = d7Var;
        this.c = q6Var;
        this.d = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new i6(this.b, this.c, this.d, 1));
                break;
            default:
                d7.W(this.b, this.c, this.d);
                break;
        }
    }
}
