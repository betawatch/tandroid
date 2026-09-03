package b4;

import j3.m0;
import j3.n0;
import java.util.List;
import k7.t6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d0 {
    public final /* synthetic */ int a;
    public final List b;
    public final r3.v[] c;

    public d0(int i10, List list) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = list;
                this.c = new r3.v[list.size()];
                break;
            default:
                this.b = list;
                this.c = new r3.v[list.size()];
                break;
        }
    }

    public void a(long j10, h5.w wVar) {
        if (wVar.a() < 9) {
            return;
        }
        int g10 = wVar.g();
        int g11 = wVar.g();
        int u10 = wVar.u();
        if (g10 == 434 && g11 == 1195456820 && u10 == 3) {
            t6.b(j10, wVar, this.c);
        }
    }

    public final void b(r3.m mVar, h0 h0Var) {
        switch (this.a) {
            case 0:
                int i10 = 0;
                while (true) {
                    r3.v[] vVarArr = this.c;
                    if (i10 >= vVarArr.length) {
                        break;
                    } else {
                        h0Var.a();
                        h0Var.b();
                        r3.v i22 = mVar.i2(h0Var.d, 3);
                        n0 n0Var = (n0) this.b.get(i10);
                        String str = n0Var.C;
                        h5.a.e("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = n0Var.a;
                        if (str2 == null) {
                            h0Var.b();
                            str2 = h0Var.e;
                        }
                        m0 m0Var = new m0();
                        m0Var.a = str2;
                        m0Var.o = str;
                        m0Var.d = n0Var.d;
                        m0Var.c = n0Var.c;
                        m0Var.G = n0Var.U;
                        m0Var.q = n0Var.E;
                        i22.b(new n0(m0Var));
                        vVarArr[i10] = i22;
                        i10++;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    r3.v[] vVarArr2 = this.c;
                    if (i11 >= vVarArr2.length) {
                        break;
                    } else {
                        h0Var.a();
                        h0Var.b();
                        r3.v i23 = mVar.i2(h0Var.d, 3);
                        n0 n0Var2 = (n0) this.b.get(i11);
                        String str3 = n0Var2.C;
                        h5.a.e("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        m0 m0Var2 = new m0();
                        h0Var.b();
                        m0Var2.a = h0Var.e;
                        m0Var2.o = str3;
                        m0Var2.d = n0Var2.d;
                        m0Var2.c = n0Var2.c;
                        m0Var2.G = n0Var2.U;
                        m0Var2.q = n0Var2.E;
                        i23.b(new n0(m0Var2));
                        vVarArr2[i11] = i23;
                        i11++;
                    }
                }
                break;
        }
    }
}
