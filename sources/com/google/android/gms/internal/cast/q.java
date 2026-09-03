package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ q(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r rVar = this.b;
        switch (i10) {
            case 0:
                u5.b bVar = r.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(rVar.e)));
                rVar.b(101);
                break;
            default:
                p pVar = new p(rVar);
                r5.g gVar = rVar.f;
                b6.m.h(gVar);
                gVar.a(pVar);
                break;
        }
    }
}
