package org.telegram.ui.Wallet;

import org.telegram.ui.mt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt b;
    public final /* synthetic */ String c;

    public /* synthetic */ b1(mt mtVar, String str, int i10) {
        this.a = i10;
        this.b = mtVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
