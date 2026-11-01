package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                n4.q qVar = mVar.e;
                if (((p4.y) qVar.b) == null) {
                    qVar.b = p4.y.d((Context) qVar.a);
                }
                p4.y yVar = (p4.y) qVar.b;
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
