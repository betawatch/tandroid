package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                s5.b bVar = t.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(tVar.e)));
                tVar.b(101);
                break;
            default:
                r rVar = new r(tVar);
                p5.g gVar = tVar.f;
                z5.l.h(gVar);
                gVar.a(rVar);
                break;
        }
    }
}
