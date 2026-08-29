package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                ze.b bVar = nVar.e;
                if (((c2.d0) bVar.b) == null) {
                    bVar.b = c2.d0.d((Context) bVar.a);
                }
                c2.d0 d0Var = (c2.d0) bVar.b;
                if (d0Var != null) {
                    d0Var.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
