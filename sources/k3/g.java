package k3;

import j3.n2;
import j3.o2;
import o4.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public int b;
    public long c;
    public final v d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ h g;

    public g(h hVar, String str, int i10, v vVar) {
        this.g = hVar;
        this.a = str;
        this.b = i10;
        this.c = vVar == null ? -1L : vVar.d;
        if (vVar == null || !vVar.a()) {
            return;
        }
        this.d = vVar;
    }

    public final boolean a(a aVar) {
        v vVar = aVar.d;
        o2 o2Var = aVar.b;
        if (vVar == null) {
            return this.b != aVar.c;
        }
        long j10 = this.c;
        if (j10 == -1) {
            return false;
        }
        if (vVar.d > j10) {
            return true;
        }
        v vVar2 = this.d;
        if (vVar2 == null) {
            return false;
        }
        int i10 = vVar2.b;
        int b10 = o2Var.b(vVar.a);
        int b11 = o2Var.b(vVar2.a);
        if (vVar.d < vVar2.d || b10 < b11) {
            return false;
        }
        if (b10 > b11) {
            return true;
        }
        if (!vVar.a()) {
            int i11 = vVar.e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = vVar.b;
        int i13 = vVar.c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > vVar2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(o2 o2Var, o2 o2Var2) {
        v vVar;
        int i10 = this.b;
        if (i10 < o2Var.o()) {
            h hVar = this.g;
            n2 n2Var = hVar.a;
            o2Var.n(i10, n2Var);
            for (int i11 = n2Var.B; i11 <= n2Var.C; i11++) {
                int b10 = o2Var2.b(o2Var.l(i11));
                if (b10 != -1) {
                    i10 = o2Var2.f(b10, hVar.b, false).c;
                    break;
                }
            }
            i10 = -1;
        }
        this.b = i10;
        return i10 != -1 && ((vVar = this.d) == null || o2Var2.b(vVar.a) != -1);
    }
}
