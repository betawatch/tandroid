package b3;

import a8.ja;
import h2.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final long b;

    public /* synthetic */ i(int i7, long j3, boolean z10) {
        this.a = i7;
        this.b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.c(0, 8, xVar.a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.a;
        return i7 == 0 || i7 == 1;
    }

    public i(int i7, long j3) {
        ja.f(j3 >= 0);
        this.a = i7;
        this.b = j3;
    }
}
