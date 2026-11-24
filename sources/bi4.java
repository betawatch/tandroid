// default package

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bi4 extends w8b {
    public ci4 n;
    public ly0 o;

    @Override // w8b
    public final boolean c(xu7 xu7Var, long j, v8b v8bVar) {
        byte[] bArr = xu7Var.a;
        ci4 ci4Var = this.n;
        if (ci4Var == null) {
            ci4 ci4Var2 = new ci4(17, bArr);
            this.n = ci4Var2;
            em4 a = ci4Var2.c(Arrays.copyOfRange(bArr, 9, xu7Var.c), null).a();
            a.r = ud7.n("audio/ogg");
            v8bVar.b = new fm4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            ly0 ly0Var = this.o;
            if (ly0Var != null) {
                ly0Var.a = j;
                v8bVar.c = ly0Var;
            }
            ((fm4) v8bVar.b).getClass();
            return false;
        }
        lv6 b2 = qge.b(xu7Var);
        ci4 ci4Var3 = new ci4(ci4Var.a, ci4Var.b, ci4Var.c, ci4Var.d, ci4Var.e, ci4Var.g, ci4Var.h, ci4Var.j, b2, ci4Var.l);
        this.n = ci4Var3;
        ly0 ly0Var2 = new ly0();
        ly0Var2.c = ci4Var3;
        ly0Var2.d = b2;
        ly0Var2.a = -1L;
        ly0Var2.b = -1L;
        this.o = ly0Var2;
        return true;
    }

    @Override // w8b
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
