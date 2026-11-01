package k4;

import c3.p;
import e2.x;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final long b;

    public /* synthetic */ d(int i10, long j10, boolean z10) {
        this.a = i10;
        this.b = j10;
    }

    public static d b(p pVar, x xVar) {
        pVar.b(0, 8, xVar.a);
        xVar.N(0);
        return new d(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public d(int i10, long j10) {
        t6.f(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
