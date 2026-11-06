package b3;

import a8.ia;
import h2.x;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
