package a3;

import b8.zb;
import g2.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final long b;

    public /* synthetic */ i(int i3, long j10, boolean z10) {
        this.a = i3;
        this.b = j10;
    }

    public static i b(e3.p pVar, y yVar) {
        pVar.c(0, 8, yVar.a);
        yVar.N(0);
        return new i(yVar.m(), yVar.r(), false);
    }

    public boolean a() {
        int i3 = this.a;
        return i3 == 0 || i3 == 1;
    }

    public i(int i3, long j10) {
        zb.f(j10 >= 0);
        this.a = i3;
        this.b = j10;
    }
}
