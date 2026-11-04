package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j(m mVar, int i3) {
        this.a = i3;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                p4.q qVar = mVar.e;
                if (((r4.y) qVar.b) == null) {
                    qVar.b = r4.y.d((Context) qVar.a);
                }
                r4.y yVar = (r4.y) qVar.b;
                if (yVar != null) {
                    yVar.h(mVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
