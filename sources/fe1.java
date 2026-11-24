// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fe1 extends n39 {
    public final /* synthetic */ me1 c;

    public fe1(me1 me1Var) {
        this.c = me1Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 4;
    }

    @Override // w39
    public final int b() {
        me1 me1Var = this.c;
        o39 o39Var = me1Var.b;
        ArrayList arrayList = me1Var.w;
        if (o39Var != null) {
            ArrayList arrayList2 = o39Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                o39Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                me1Var.b.L2.add(Long.valueOf(gl.u2(3, arrayList.size() + 3)));
            }
        }
        return (arrayList.size() > 0 ? arrayList.size() + 2 : 0) + 3;
    }

    @Override // w39
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

    @Override // w39
    public final void t(s49 s49Var, int i) {
        me1 me1Var = this.c;
        long j = me1Var.y;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ((ld5) view).setText(k96.M0(i == 0 ? j != 0 ? 2131752973 : 2131745306 : 2131743403, null));
            return;
        }
        if (i2 == 2) {
            ((mhb) view).setText(k96.M0(j != 0 ? 2131752925 : 2131743402, null));
            return;
        }
        if (i2 == 3) {
            me1Var.n = true;
            ge1 ge1Var = (ge1) view;
            me1Var.E = ge1Var;
            ge1Var.a.setText(me1Var.r);
            me1Var.n = false;
            return;
        }
        if (i2 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) me1Var.w.get(i - 4);
        ie1 ie1Var = (ie1) view;
        if (tL_username.editable) {
            me1Var.F = ie1Var;
        } else if (me1Var.F == ie1Var) {
            me1Var.F = null;
        }
        ie1Var.a(tL_username, i < b() - 2, false, me1Var.y);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        me1 me1Var = this.c;
        if (i == 0) {
            return new y29(new ld5(me1Var.getParentActivity()));
        }
        if (i == 1) {
            le1 le1Var = new le1(me1Var, me1Var.getParentActivity());
            le1Var.setTag(-33024);
            return new y29(le1Var);
        }
        if (i == 2) {
            return new y29(new mhb(me1Var.getParentActivity()));
        }
        if (i == 3) {
            return new y29(new ge1(me1Var, me1Var.getParentActivity()));
        }
        if (i != 4) {
            return null;
        }
        return new y29(new ee1(this, me1Var.getParentActivity(), me1Var.getResourceProvider()));
    }
}
