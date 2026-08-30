package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
