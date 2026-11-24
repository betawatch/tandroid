// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oa2 extends q59 {
    public final /* synthetic */ pa2 c;

    public oa2(pa2 pa2Var) {
        this.c = pa2Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    @Override // y59
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i <= this.c.i3.O.size() ? 1 : 2;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        pa2 pa2Var = this.c;
        qa2 qa2Var = pa2Var.i3;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            jf5 jf5Var = (jf5) view;
            anb.h(cmb.c6, pa2Var.o2, jf5Var);
            jf5Var.setText(jb6.M0(2131743331, null));
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ((njb) view).setText(jb6.M0(2131743330, null));
                return;
            }
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) qa2Var.O.get(i - 1);
        qf1 qf1Var = (qf1) view;
        if (qf1Var.I) {
            qa2Var.P = null;
        }
        qf1Var.a(tL_username, i < qa2Var.O.size(), false, 0L);
        if (tL_username == null || !tL_username.editable) {
            return;
        }
        qa2Var.P = qf1Var;
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        pa2 pa2Var = this.c;
        ylb ylbVar = pa2Var.o2;
        if (i == 0) {
            return new b59(new jf5(pa2Var.getContext(), ylbVar));
        }
        if (i == 1) {
            return new b59(new mf1(this, pa2Var.getContext(), ylbVar));
        }
        if (i != 2) {
            return null;
        }
        return new b59(new njb(12, ylbVar, pa2Var.getContext()));
    }
}
