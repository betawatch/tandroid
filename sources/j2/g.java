package j2;

import b2.n1;
import b2.o1;
import u2.f0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final f0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i10, f0 f0Var) {
        this.g = hVar;
        this.a = str;
        this.b = i10;
        this.c = f0Var == null ? -1L : f0Var.d;
        if (f0Var == null || !f0Var.b()) {
            return;
        }
        this.d = f0Var;
    }

    public final boolean a(a aVar) {
        f0 f0Var = aVar.d;
        o1 o1Var = aVar.b;
        if (f0Var == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (f0Var.d > j10) {
            return true;
        }
        f0 f0Var2 = this.d;
        if (f0Var2 == null) {
            return false;
        }
        int i10 = f0Var2.b;
        int b10 = o1Var.b(f0Var.a);
        int b11 = o1Var.b(f0Var2.a);
        if (f0Var.d < f0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!f0Var.b()) {
            int i11 = f0Var.e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = f0Var.b;
        int i13 = f0Var.c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > f0Var2.c;
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
        f0 f0Var;
        int i10 = this.b;
        if (i10 < o1Var.o()) {
            h hVar = this.g;
            n1 n1Var = hVar.a;
            o1Var.n(i10, n1Var);
            for (int i11 = n1Var.n; i11 <= n1Var.o; i11++) {
                int b10 = o1Var2.b(o1Var.l(i11));
                if (b10 != -1) {
                    i10 = o1Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((f0Var = this.d) == null || o1Var2.b(f0Var.a) != -1);
    }
}
