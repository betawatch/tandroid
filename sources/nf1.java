// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nf1 extends q59 {
    public final /* synthetic */ uf1 c;

    public nf1(uf1 uf1Var) {
        this.c = uf1Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 4;
    }

    @Override // y59
    public final int b() {
        uf1 uf1Var = this.c;
        r59 r59Var = uf1Var.b;
        ArrayList arrayList = uf1Var.w;
        if (r59Var != null) {
            ArrayList arrayList2 = r59Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                r59Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                uf1Var.b.L2.add(Long.valueOf(gm.u2(3, arrayList.size() + 3)));
            }
        }
        return (arrayList.size() > 0 ? arrayList.size() + 2 : 0) + 3;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 0;
        }
        return i != b() - 1 ? 4 : 2;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        uf1 uf1Var = this.c;
        long j = uf1Var.y;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            ((jf5) view).setText(jb6.M0(i == 0 ? j != 0 ? 2131752938 : 2131745232 : 2131743329, null));
            return;
        }
        if (i2 == 2) {
            ((njb) view).setText(jb6.M0(j != 0 ? 2131752890 : 2131743328, null));
            return;
        }
        if (i2 == 3) {
            uf1Var.n = true;
            of1 of1Var = (of1) view;
            uf1Var.E = of1Var;
            of1Var.a.setText(uf1Var.r);
            uf1Var.n = false;
            return;
        }
        if (i2 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) uf1Var.w.get(i - 4);
        qf1 qf1Var = (qf1) view;
        if (tL_username.editable) {
            uf1Var.F = qf1Var;
        } else if (uf1Var.F == qf1Var) {
            uf1Var.F = null;
        }
        qf1Var.a(tL_username, i < b() - 2, false, uf1Var.y);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        uf1 uf1Var = this.c;
        if (i == 0) {
            return new b59(new jf5(uf1Var.getParentActivity()));
        }
        if (i == 1) {
            tf1 tf1Var = new tf1(uf1Var, uf1Var.getParentActivity());
            tf1Var.setTag(-33024);
            return new b59(tf1Var);
        }
        if (i == 2) {
            return new b59(new njb(uf1Var.getParentActivity()));
        }
        if (i == 3) {
            return new b59(new of1(uf1Var, uf1Var.getParentActivity()));
        }
        if (i != 4) {
            return null;
        }
        return new b59(new mf1(this, uf1Var.getParentActivity(), uf1Var.getResourceProvider()));
    }
}
