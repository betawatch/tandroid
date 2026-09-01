package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                bf.b bVar = mVar.e;
                if (((c2.c0) bVar.c) == null) {
                    bVar.c = c2.c0.d((Context) bVar.b);
                }
                c2.c0 c0Var = (c2.c0) bVar.c;
                if (c0Var != null) {
                    c0Var.h(mVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
