package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cb extends pm0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public cb(nj njVar, Context context) {
        this.c = 1;
        this.f = njVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.i0
    public void B(s4.k0 k0Var) {
        switch (this.c) {
            case 0:
                ((pm0) this.e).B(new bb(this, k0Var));
                break;
            default:
                super.B(k0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        switch (this.c) {
            case 0:
                return ((pm0) this.e).D(d1Var);
            default:
                return d1Var.f == 0;
        }
    }

    @Override // s4.i0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((pm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.i0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                eb ebVar = (eb) this.f;
                if (i10 == (ebVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((pm0) this.e).j(i10 - (!ebVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        switch (this.c) {
            case 0:
                eb ebVar = (eb) this.f;
                if (i10 != (ebVar.P ? h() - 1 : 0)) {
                    ((pm0) this.e).v(d1Var, i10 - (!ebVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) d1Var.a;
                cbVar.d(1, false, false);
                cbVar.setSize(((nj) this.f).r);
                cbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new am0(new ci.bb((eb) this.f, this.d)) : ((pm0) this.e).x(viewGroup, i10);
            default:
                mj mjVar = new mj(this, this.d);
                mjVar.b = false;
                return new am0(mjVar);
        }
    }

    public cb(eb ebVar, pm0 pm0Var, Context context) {
        this.c = 0;
        this.f = ebVar;
        this.e = pm0Var;
        this.d = context;
    }
}
