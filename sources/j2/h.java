package j2;

import b2.n1;
import b2.o1;
import u2.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h {
    public final String a;
    public int b;
    public long c;
    public final g0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ i g;

    public h(i iVar, String str, int i10, g0 g0Var) {
        this.g = iVar;
        this.a = str;
        this.b = i10;
        this.c = g0Var == null ? -1L : g0Var.d;
        if (g0Var == null || !g0Var.b()) {
            return;
        }
        this.d = g0Var;
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        o1 o1Var = aVar.b;
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
        int i10 = g0Var2.b;
        int b10 = o1Var.b(g0Var.a);
        int b11 = o1Var.b(g0Var2.a);
        if (g0Var.d < g0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!g0Var.b()) {
            int i11 = g0Var.e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = g0Var.b;
        int i13 = g0Var.c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > g0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(o1 o1Var, o1 o1Var2) {
        g0 g0Var;
        int i10 = this.b;
        if (i10 < o1Var.o()) {
            i iVar = this.g;
            n1 n1Var = iVar.a;
            o1Var.n(i10, n1Var);
            for (int i11 = n1Var.n; i11 <= n1Var.o; i11++) {
                int b10 = o1Var2.b(o1Var.l(i11));
                if (b10 != -1) {
                    i10 = o1Var2.f(b10, iVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((g0Var = this.d) == null || o1Var2.b(g0Var.a) != -1);
    }
}
