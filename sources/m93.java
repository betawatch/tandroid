// default package

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m93 implements c59, ee {
    public final /* synthetic */ q93 a;

    public /* synthetic */ m93(q93 q93Var) {
        this.a = q93Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        int i2;
        int i3;
        int i4;
        q93 q93Var = this.a;
        t93 t93Var = q93Var.w3;
        ArrayList arrayList = q93Var.n3;
        arrayList.clear();
        int i5 = 0;
        while (true) {
            p93[] p93VarArr = q93Var.o3;
            if (i5 >= p93VarArr.length) {
                i2 = ((d) t93Var).currentAccount;
                b0b.c(i2).l(0);
                i3 = ((d) t93Var).currentAccount;
                b0b.c(i3).l(1);
                i4 = ((d) t93Var).currentAccount;
                b0b.c(i4).l(2);
                q93Var.f3 = true;
                q93Var.C1();
                q93Var.D1(true);
                return;
            }
            p93 p93Var = p93VarArr[i5];
            if (p93Var.c > 0) {
                arrayList.add(Integer.valueOf(p93Var.d));
            }
            i5++;
        }
    }

    @Override // c59
    public final int run() {
        q93 q93Var = this.a;
        ArrayList arrayList = q93Var.k3;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((l93) arrayList.get(i)).a == 5) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return -1;
        }
        q93Var.h3.g1(i, gm.L(60.0f));
        return i;
    }
}
