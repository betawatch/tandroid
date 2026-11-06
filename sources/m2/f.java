package m2;

import e2.k1;
import e2.l1;
import x2.g0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public int b;
    public long c;
    public final g0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ g g;

    public f(g gVar, String str, int i7, g0 g0Var) {
        this.g = gVar;
        this.a = str;
        this.b = i7;
        this.c = g0Var == null ? -1L : g0Var.d;
        if (g0Var == null || !g0Var.b()) {
            return;
        }
        this.d = g0Var;
    }

    public final boolean a(a aVar) {
        g0 g0Var = aVar.d;
        l1 l1Var = aVar.b;
        if (g0Var == null) {
            return this.b != aVar.c;
        }
        long j3 = this.c;
        if (j3 == -1) {
            return false;
        }
        if (g0Var.d > j3) {
            return true;
        }
        g0 g0Var2 = this.d;
        if (g0Var2 == null) {
            return false;
        }
        int i7 = g0Var2.b;
        int b10 = l1Var.b(g0Var.a);
        int b11 = l1Var.b(g0Var2.a);
        if (g0Var.d < g0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!g0Var.b()) {
            int i10 = g0Var.e;
            return i10 == -1 || i10 > i7;
        }
        int i11 = g0Var.b;
        int i12 = g0Var.c;
        if (i11 <= i7) {
            return i11 == i7 && i12 > g0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(l1 l1Var, l1 l1Var2) {
        g0 g0Var;
        int i7 = this.b;
        if (i7 < l1Var.o()) {
            g gVar = this.g;
            k1 k1Var = gVar.a;
            l1Var.n(i7, k1Var);
            for (int i10 = k1Var.n; i10 <= k1Var.o; i10++) {
                int b10 = l1Var2.b(l1Var.l(i10));
                if (b10 != -1) {
                    i7 = l1Var2.f(b10, gVar.b, false).c;
                    break;
                }
            }
            i7 = -1;
        }
        this.b = i7;
        return i7 != -1 && ((g0Var = this.d) == null || l1Var2.b(g0Var.a) != -1);
    }
}
