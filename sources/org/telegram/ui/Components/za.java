package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class za extends vl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public za(kj kjVar, Context context) {
        this.c = 1;
        this.f = kjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((vl0) this.e).B(new ya(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((vl0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((vl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 == (bbVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((vl0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 != (bbVar.P ? h() - 1 : 0)) {
                    ((vl0) this.e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.a;
                ebVar.d(1, false, false);
                ebVar.setSize(((kj) this.f).r);
                ebVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new gl0(new ci.bb((bb) this.f, this.d)) : ((vl0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.b = false;
                return new gl0(jjVar);
        }
    }

    public za(bb bbVar, vl0 vl0Var, Context context) {
        this.c = 0;
        this.f = bbVar;
        this.e = vl0Var;
        this.d = context;
    }
}
