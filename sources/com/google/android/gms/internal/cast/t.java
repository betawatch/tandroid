package com.google.android.gms.internal.cast;

import android.util.Log;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
