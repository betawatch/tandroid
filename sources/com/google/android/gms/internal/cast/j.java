package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                af.c cVar = mVar.e;
                if (((c2.d0) cVar.c) == null) {
                    cVar.c = c2.d0.d((Context) cVar.b);
                }
                c2.d0 d0Var = (c2.d0) cVar.c;
                if (d0Var != null) {
                    d0Var.h(mVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
