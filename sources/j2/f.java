package j2;

import b2.n1;
import b2.o1;
import u2.h0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public int b;
    public long c;
    public final h0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ g g;

    public f(g gVar, String str, int i10, h0 h0Var) {
        this.g = gVar;
        this.a = str;
        this.b = i10;
        this.c = h0Var == null ? -1L : h0Var.d;
        if (h0Var == null || !h0Var.b()) {
            return;
        }
        this.d = h0Var;
    }

    public final boolean a(a aVar) {
        h0 h0Var = aVar.d;
        o1 o1Var = aVar.b;
        if (h0Var == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (h0Var.d > j10) {
            return true;
        }
        h0 h0Var2 = this.d;
        if (h0Var2 == null) {
            return false;
        }
        int i10 = h0Var2.b;
        int b10 = o1Var.b(h0Var.a);
        int b11 = o1Var.b(h0Var2.a);
        if (h0Var.d < h0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!h0Var.b()) {
            int i11 = h0Var.e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = h0Var.b;
        int i13 = h0Var.c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > h0Var2.c;
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
        h0 h0Var;
        int i10 = this.b;
        if (i10 < o1Var.o()) {
            g gVar = this.g;
            n1 n1Var = gVar.a;
            o1Var.n(i10, n1Var);
            for (int i11 = n1Var.n; i11 <= n1Var.o; i11++) {
                int b10 = o1Var2.b(o1Var.l(i11));
                if (b10 != -1) {
                    i10 = o1Var2.f(b10, gVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((h0Var = this.d) == null || o1Var2.b(h0Var.a) != -1);
    }
}
