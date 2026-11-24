// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fk4 extends yab {
    public gk4 n;
    public sz0 o;

    @Override // yab
    public final boolean c(yw7 yw7Var, long j, xab xabVar) {
        byte[] bArr = yw7Var.a;
        gk4 gk4Var = this.n;
        if (gk4Var == null) {
            gk4 gk4Var2 = new gk4(17, bArr);
            this.n = gk4Var2;
            fo4 a = gk4Var2.c(Arrays.copyOfRange(bArr, 9, yw7Var.c), null).a();
            a.r = wf7.n("audio/ogg");
            xabVar.b = new go4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            sz0 sz0Var = this.o;
            if (sz0Var != null) {
                sz0Var.a = j;
                xabVar.c = sz0Var;
            }
            ((go4) xabVar.b).getClass();
            return false;
        }
        lx6 b2 = rie.b(yw7Var);
        gk4 gk4Var3 = new gk4(gk4Var.a, gk4Var.b, gk4Var.c, gk4Var.d, gk4Var.e, gk4Var.g, gk4Var.h, gk4Var.j, b2, gk4Var.l);
        this.n = gk4Var3;
        sz0 sz0Var2 = new sz0();
        sz0Var2.c = gk4Var3;
        sz0Var2.d = b2;
        sz0Var2.a = -1L;
        sz0Var2.b = -1L;
        this.o = sz0Var2;
        return true;
    }

    @Override // yab
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
