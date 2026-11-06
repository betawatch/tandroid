package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                q4.q qVar = mVar.e;
                if (((s4.x) qVar.c) == null) {
                    qVar.c = s4.x.d((Context) qVar.b);
                }
                s4.x xVar = (s4.x) qVar.c;
                if (xVar != null) {
                    xVar.h(mVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
