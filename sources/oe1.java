// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oe1 extends c79 {
    public final /* synthetic */ ve1 c;

    public oe1(ve1 ve1Var) {
        this.c = ve1Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 4;
    }

    @Override // j79
    public final int b() {
        ve1 ve1Var = this.c;
        d79 d79Var = ve1Var.b;
        ArrayList arrayList = ve1Var.w;
        if (d79Var != null) {
            ArrayList arrayList2 = d79Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                d79Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                ve1Var.b.L2.add(Long.valueOf(hl.u2(3, arrayList.size() + 3)));
            }
        }
        return (arrayList.size() > 0 ? arrayList.size() + 2 : 0) + 3;
    }

    @Override // j79
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

    @Override // j79
    public final void t(f89 f89Var, int i) {
        ve1 ve1Var = this.c;
        long j = ve1Var.y;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            ((mf5) view).setText(ob6.M0(i == 0 ? j != 0 ? 2131752966 : 2131745226 : 2131743297, null));
            return;
        }
        if (i2 == 2) {
            ((ilb) view).setText(ob6.M0(j != 0 ? 2131752918 : 2131743296, null));
            return;
        }
        if (i2 == 3) {
            ve1Var.n = true;
            pe1 pe1Var = (pe1) view;
            ve1Var.E = pe1Var;
            pe1Var.a.setText(ve1Var.r);
            ve1Var.n = false;
            return;
        }
        if (i2 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) ve1Var.w.get(i - 4);
        re1 re1Var = (re1) view;
        if (tL_username.editable) {
            ve1Var.F = re1Var;
        } else if (ve1Var.F == re1Var) {
            ve1Var.F = null;
        }
        re1Var.a(tL_username, i < b() - 2, false, ve1Var.y);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        ve1 ve1Var = this.c;
        if (i == 0) {
            return new n69(new mf5(ve1Var.getParentActivity()));
        }
        if (i == 1) {
            ue1 ue1Var = new ue1(ve1Var, ve1Var.getParentActivity());
            ue1Var.setTag(-33024);
            return new n69(ue1Var);
        }
        if (i == 2) {
            return new n69(new ilb(ve1Var.getParentActivity()));
        }
        if (i == 3) {
            return new n69(new pe1(ve1Var, ve1Var.getParentActivity()));
        }
        if (i != 4) {
            return null;
        }
        return new n69(new ne1(this, ve1Var.getParentActivity(), ve1Var.getResourceProvider()));
    }
}
