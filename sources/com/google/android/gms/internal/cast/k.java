package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                if (((p4.x) sVar.c) == null) {
                    sVar.c = p4.x.d((Context) sVar.b);
                }
                p4.x xVar = (p4.x) sVar.c;
                if (xVar != null) {
                    xVar.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
