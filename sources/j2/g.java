package j2;

import b2.j1;
import b2.k1;
import u2.f0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        k1 k1Var = aVar.b;
        if (f0Var == null) {
            return this.b != aVar.c;
        }
        long j3 = this.c;
        if (j3 == -1) {
            return false;
        }
        if (f0Var.d > j3) {
            return true;
        }
        f0 f0Var2 = this.d;
        if (f0Var2 == null) {
            return false;
        }
        int i10 = f0Var2.b;
        int b10 = k1Var.b(f0Var.a);
        int b11 = k1Var.b(f0Var2.a);
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
    public final boolean b(k1 k1Var, k1 k1Var2) {
        f0 f0Var;
        int i10 = this.b;
        if (i10 < k1Var.o()) {
            h hVar = this.g;
            j1 j1Var = hVar.a;
            k1Var.n(i10, j1Var);
            for (int i11 = j1Var.n; i11 <= j1Var.o; i11++) {
                int b10 = k1Var2.b(k1Var.l(i11));
                if (b10 != -1) {
                    i10 = k1Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((f0Var = this.d) == null || k1Var2.b(f0Var.a) != -1);
    }
}
