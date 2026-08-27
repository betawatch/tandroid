package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                xe.b bVar = nVar.e;
                if (((c2.b0) bVar.c) == null) {
                    bVar.c = c2.b0.d((Context) bVar.b);
                }
                c2.b0 b0Var = (c2.b0) bVar.c;
                if (b0Var != null) {
                    b0Var.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
