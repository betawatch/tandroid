package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ s(t tVar, int i9) {
        this.a = i9;
        this.b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        t tVar = this.b;
        switch (i9) {
            case 0:
                q5.b bVar = t.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(tVar.e)));
                tVar.b(101);
                break;
            default:
                r rVar = new r(tVar);
                n5.g gVar = tVar.f;
                x5.l.h(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
