package k4;

import c3.p;
import e2.x;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        u6.g(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
