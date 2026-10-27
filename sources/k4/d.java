package k4;

import a8.yb;
import c3.p;
import e2.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        yb.g(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
