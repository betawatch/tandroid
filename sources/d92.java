// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d92 extends n39 {
    public final /* synthetic */ e92 c;

    public d92(e92 e92Var) {
        this.c = e92Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    @Override // w39
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        e92 e92Var = this.c;
        f92 f92Var = e92Var.i3;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ld5 ld5Var = (ld5) view;
            zkb.h(bkb.c6, e92Var.o2, ld5Var);
            ld5Var.setText(k96.M0(2131743405, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ((mhb) view).setText(k96.M0(2131743404, null));
                return;
            }
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) f92Var.O.get(i - 1);
        ie1 ie1Var = (ie1) view;
        if (ie1Var.I) {
            f92Var.P = null;
        }
        ie1Var.a(tL_username, i < f92Var.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        f92Var.P = ie1Var;
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        e92 e92Var = this.c;
        wjb wjbVar = e92Var.o2;
        if (i == 0) {
            return new y29(new ld5(e92Var.getContext(), wjbVar));
        }
        if (i == 1) {
            return new y29(new ee1(this, e92Var.getContext(), wjbVar));
        }
        if (i != 2) {
            return null;
        }
        return new y29(new mhb(12, wjbVar, e92Var.getContext()));
    }
}
