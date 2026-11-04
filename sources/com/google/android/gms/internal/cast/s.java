package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ s(t tVar, int i3) {
        this.a = i3;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        t tVar = this.b;
        switch (i3) {
            case 0:
                i6.b bVar = t.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(tVar.e)));
                tVar.b(101);
                break;
            default:
                r rVar = new r(tVar);
                f6.g gVar = tVar.f;
                p6.m.g(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
