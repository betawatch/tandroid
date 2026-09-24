package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                n4.y yVar = nVar.e;
                if (((p4.x) yVar.c) == null) {
                    yVar.c = p4.x.d((Context) yVar.b);
                }
                p4.x xVar = (p4.x) yVar.c;
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
