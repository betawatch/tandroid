package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ r(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        s sVar = this.b;
        switch (i7) {
            case 0:
                j6.b bVar = s.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(sVar.e)));
                sVar.b(101);
                break;
            default:
                q qVar = new q(sVar);
                g6.g gVar = sVar.f;
                q6.m.h(gVar);
                gVar.a(qVar);
                break;
        }
    }
}
