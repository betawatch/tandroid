package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import ei.y8;
import java.util.List;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public final List b;
    public final i0[] c;
    public final g2.d d;

    public c0(int i3, List list) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = list;
                this.c = new i0[list.size()];
                g2.d dVar = new g2.d(new y8(this, 29));
                this.d = dVar;
                dVar.C(3);
                break;
            default:
                this.b = list;
                this.c = new i0[list.size()];
                this.d = new g2.d(new y8(this, 28));
                break;
        }
    }

    public void a(long j10, g2.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int m10 = yVar.m();
        int m11 = yVar.m();
        int A = yVar.A();
        if (m10 == 434 && m11 == 1195456820 && A == 3) {
            this.d.a(j10, yVar);
        }
    }

    public final void b(e3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                int i3 = 0;
                while (true) {
                    i0[] i0VarArr = this.c;
                    if (i3 >= i0VarArr.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 i02 = qVar.i0(f0Var.c, 3);
                        d2.v vVar = (d2.v) this.b.get(i3);
                        String str = vVar.s;
                        zb.h("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = vVar.a;
                        if (str2 == null) {
                            f0Var.c();
                            str2 = (String) f0Var.e;
                        }
                        d2.u uVar = new d2.u();
                        uVar.a = str2;
                        uVar.q = u0.n("video/mp2t");
                        uVar.r = u0.n(str);
                        uVar.e = vVar.e;
                        uVar.d = vVar.d;
                        uVar.O = vVar.P;
                        uVar.u = vVar.v;
                        f1.w(uVar, i02);
                        i0VarArr[i3] = i02;
                        i3++;
                    }
                }
                break;
            default:
                int i10 = 0;
                while (true) {
                    i0[] i0VarArr2 = this.c;
                    if (i10 >= i0VarArr2.length) {
                        break;
                    } else {
                        f0Var.b();
                        f0Var.c();
                        i0 i03 = qVar.i0(f0Var.c, 3);
                        d2.v vVar2 = (d2.v) this.b.get(i10);
                        String str3 = vVar2.s;
                        zb.h("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        d2.u uVar2 = new d2.u();
                        f0Var.c();
                        uVar2.a = (String) f0Var.e;
                        uVar2.q = u0.n("video/mp2t");
                        uVar2.r = u0.n(str3);
                        uVar2.e = vVar2.e;
                        uVar2.d = vVar2.d;
                        uVar2.O = vVar2.P;
                        uVar2.u = vVar2.v;
                        f1.w(uVar2, i03);
                        i0VarArr2[i10] = i03;
                        i10++;
                    }
                }
                break;
        }
    }
}
