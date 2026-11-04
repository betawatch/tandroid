package l2;

import d2.m1;
import d2.n1;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final g0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i3, g0 g0Var) {
        this.g = hVar;
        this.a = str;
        this.b = i3;
        this.c = g0Var == null ? -1L : g0Var.d;
        if (g0Var == null || !g0Var.b()) {
            return;
        }
        this.d = g0Var;
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        n1 n1Var = aVar.b;
        if (g0Var == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (g0Var.d > j10) {
            return true;
        }
        g0 g0Var2 = this.d;
        if (g0Var2 == null) {
            return false;
        }
        int i3 = g0Var2.b;
        int b10 = n1Var.b(g0Var.a);
        int b11 = n1Var.b(g0Var2.a);
        if (g0Var.d < g0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!g0Var.b()) {
            int i10 = g0Var.e;
            return i10 == -1 || i10 > i3;
        }
        int i11 = g0Var.b;
        int i12 = g0Var.c;
        if (i11 <= i3) {
            return i11 == i3 && i12 > g0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(n1 n1Var, n1 n1Var2) {
        g0 g0Var;
        int i3 = this.b;
        if (i3 < n1Var.o()) {
            h hVar = this.g;
            m1 m1Var = hVar.a;
            n1Var.n(i3, m1Var);
            for (int i10 = m1Var.n; i10 <= m1Var.o; i10++) {
                int b10 = n1Var2.b(n1Var.l(i10));
                if (b10 != -1) {
                    i3 = n1Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i3 = -1;
        }
        this.b = i3;
        return i3 != -1 && ((g0Var = this.d) == null || n1Var2.b(g0Var.a) != -1);
    }
}
