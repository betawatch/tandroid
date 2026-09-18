package k4;

import c3.p;
import e2.v;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final long b;

    public /* synthetic */ d(int i10, long j3, boolean z10) {
        this.a = i10;
        this.b = j3;
    }

    public static d b(p pVar, v vVar) {
        pVar.a(0, 8, vVar.a);
        vVar.J(0);
        return new d(vVar.j(), vVar.o(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public d(int i10, long j3) {
        e2.d.b(j3 >= 0);
        this.a = i10;
        this.b = j3;
    }
}
