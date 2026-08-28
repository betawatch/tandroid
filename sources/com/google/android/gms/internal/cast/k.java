package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ k(n nVar, int i9) {
        this.a = i9;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                we.b bVar = nVar.e;
                if (((c2.c0) bVar.c) == null) {
                    bVar.c = c2.c0.d((Context) bVar.b);
                }
                c2.c0 c0Var = (c2.c0) bVar.c;
                if (c0Var != null) {
                    c0Var.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
