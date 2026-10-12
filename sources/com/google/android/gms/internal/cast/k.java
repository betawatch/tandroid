package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ k(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                n4.s sVar = nVar.e;
                if (((p4.y) sVar.c) == null) {
                    sVar.c = p4.y.d((Context) sVar.b);
                }
                p4.y yVar = (p4.y) sVar.c;
                if (yVar != null) {
                    yVar.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
