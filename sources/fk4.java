// default package

import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fk4 extends ucb {
    public gk4 n;
    public ty0 o;

    @Override // ucb
    public final boolean c(ey7 ey7Var, long j, k7b k7bVar) {
        byte[] bArr = ey7Var.a;
        gk4 gk4Var = this.n;
        if (gk4Var == null) {
            gk4 gk4Var2 = new gk4(17, bArr);
            this.n = gk4Var2;
            jo4 a = gk4Var2.c(Arrays.copyOfRange(bArr, 9, ey7Var.c), null).a();
            a.r = dg7.n("audio/ogg");
            k7bVar.b = new ko4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            ty0 ty0Var = this.o;
            if (ty0Var != null) {
                ty0Var.a = j;
                k7bVar.c = ty0Var;
            }
            ((ko4) k7bVar.b).getClass();
            return false;
        }
        lh2 b2 = lle.b(ey7Var);
        gk4 gk4Var3 = new gk4(gk4Var.a, gk4Var.b, gk4Var.c, gk4Var.d, gk4Var.e, gk4Var.g, gk4Var.h, gk4Var.j, b2, gk4Var.l);
        this.n = gk4Var3;
        ty0 ty0Var2 = new ty0();
        ty0Var2.c = gk4Var3;
        ty0Var2.d = b2;
        ty0Var2.a = -1L;
        ty0Var2.b = -1L;
        this.o = ty0Var2;
        return true;
    }

    @Override // ucb
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
