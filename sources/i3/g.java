package i3;

import h3.q2;
import h3.r2;
import j4.d0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final d0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i9, d0 d0Var) {
        this.g = hVar;
        this.a = str;
        this.b = i9;
        this.c = d0Var == null ? -1L : d0Var.d;
        if (d0Var == null || !d0Var.a()) {
            return;
        }
        this.d = d0Var;
    }

    public final boolean a(a aVar) {
        d0 d0Var = aVar.d;
        r2 r2Var = aVar.b;
        if (d0Var == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (d0Var.d > j10) {
            return true;
        }
        d0 d0Var2 = this.d;
        if (d0Var2 == null) {
            return false;
        }
        int i9 = d0Var2.b;
        int b10 = r2Var.b(d0Var.a);
        int b11 = r2Var.b(d0Var2.a);
        if (d0Var.d < d0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!d0Var.a()) {
            int i10 = d0Var.e;
            return i10 == -1 || i10 > i9;
        }
        int i11 = d0Var.b;
        int i12 = d0Var.c;
        if (i11 <= i9) {
            return i11 == i9 && i12 > d0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(r2 r2Var, r2 r2Var2) {
        d0 d0Var;
        int i9 = this.b;
        if (i9 < r2Var.o()) {
            h hVar = this.g;
            q2 q2Var = hVar.a;
            r2Var.n(i9, q2Var);
            for (int i10 = q2Var.A; i10 <= q2Var.B; i10++) {
                int b10 = r2Var2.b(r2Var.l(i10));
                if (b10 != -1) {
                    i9 = r2Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i9 = -1;
        }
        this.b = i9;
        return i9 != -1 && ((d0Var = this.d) == null || r2Var2.b(d0Var.a) != -1);
    }
}
