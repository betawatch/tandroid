package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ t(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        u uVar = this.b;
        switch (i10) {
            case 0:
                g6.b bVar = u.i;
                Log.i(bVar.a, bVar.d("transfer with type = %d has timed out", Integer.valueOf(uVar.e)));
                uVar.b(101);
                break;
            default:
                s sVar = new s(uVar);
                d6.g gVar = uVar.f;
                n6.l.h(gVar);
                gVar.a(sVar);
                break;
        }
    }
}
