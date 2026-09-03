package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
