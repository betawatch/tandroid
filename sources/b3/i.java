package b3;

import a8.la;
import h2.x;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final long b;

    public /* synthetic */ i(int i7, long j3, boolean z10) {
        this.a = i7;
        this.b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.b(0, 8, xVar.a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.a;
        return i7 == 0 || i7 == 1;
    }

    public i(int i7, long j3) {
        la.f(j3 >= 0);
        this.a = i7;
        this.b = j3;
    }
}
