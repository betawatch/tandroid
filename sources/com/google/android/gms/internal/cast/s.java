package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ s(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t tVar = this.b;
        switch (i10) {
            case 0:
                g6.b bVar = t.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(tVar.e)));
                tVar.b(101);
                break;
            default:
                r rVar = new r(tVar);
                d6.g gVar = tVar.f;
                n6.l.g(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
