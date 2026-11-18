package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;

    public /* synthetic */ wb(zb zbVar, int i7) {
        this.a = i7;
        this.b = zbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        zb zbVar = this.b;
        switch (i7) {
            case 0:
                ec ecVar = zbVar.h;
                ThreadLocal threadLocal = ec.I;
                ecVar.V(true);
                break;
            case 1:
                zbVar.h.u.remove(zbVar.a.e);
                g0.g3(new wb(zbVar, 3));
                break;
            case 2:
                ec ecVar2 = zbVar.h;
                ThreadLocal threadLocal2 = ec.I;
                ecVar2.V(true);
                break;
            default:
                sb sbVar = zbVar.a;
                ks.f(sbVar.o).k(ks.Z1, sbVar.e, 1);
                break;
        }
    }
}
