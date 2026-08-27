package i3;

import h3.r2;
import h3.s2;
import j4.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final c0 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i10, c0 c0Var) {
        this.g = hVar;
        this.a = str;
        this.b = i10;
        this.c = c0Var == null ? -1L : c0Var.d;
        if (c0Var == null || !c0Var.a()) {
            return;
        }
        this.d = c0Var;
    }

    public final boolean a(a aVar) {
        c0 c0Var = aVar.d;
        s2 s2Var = aVar.b;
        if (c0Var == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (c0Var.d > j10) {
            return true;
        }
        c0 c0Var2 = this.d;
        if (c0Var2 == null) {
            return false;
        }
        int i10 = c0Var2.b;
        int b10 = s2Var.b(c0Var.a);
        int b11 = s2Var.b(c0Var2.a);
        if (c0Var.d < c0Var2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!c0Var.a()) {
            int i11 = c0Var.e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = c0Var.b;
        int i13 = c0Var.c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > c0Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(s2 s2Var, s2 s2Var2) {
        c0 c0Var;
        int i10 = this.b;
        if (i10 < s2Var.o()) {
            h hVar = this.g;
            r2 r2Var = hVar.a;
            s2Var.n(i10, r2Var);
            for (int i11 = r2Var.A; i11 <= r2Var.B; i11++) {
                int b10 = s2Var2.b(s2Var.l(i11));
                if (b10 != -1) {
                    i10 = s2Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((c0Var = this.d) == null || s2Var2.b(c0Var.a) != -1);
    }
}
