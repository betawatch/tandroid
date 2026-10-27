package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ r(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s sVar = this.b;
        switch (i10) {
            case 0:
                h6.b bVar = s.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(sVar.e)));
                sVar.b(101);
                break;
            default:
                q qVar = new q(sVar);
                e6.g gVar = sVar.f;
                o6.l.h(gVar);
                gVar.a(qVar);
                break;
        }
    }
}
