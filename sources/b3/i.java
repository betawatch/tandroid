package b3;

import a8.ia;
import h2.x;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final long b;

    public /* synthetic */ i(int i7, long j3, boolean z9) {
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
        ia.f(j3 >= 0);
        this.a = i7;
        this.b = j3;
    }
}
