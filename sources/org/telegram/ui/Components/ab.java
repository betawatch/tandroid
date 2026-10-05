package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ab extends yl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ab(mj mjVar, Context context) {
        this.c = 1;
        this.f = mjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((yl0) this.e).B(new za(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((yl0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((yl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                cb cbVar = (cb) this.f;
                if (i10 == (cbVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((yl0) this.e).j(i10 - (!cbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                cb cbVar = (cb) this.f;
                if (i10 != (cbVar.P ? h() - 1 : 0)) {
                    ((yl0) this.e).v(c1Var, i10 - (!cbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.a;
                ebVar.d(1, false, false);
                ebVar.setSize(((mj) this.f).r);
                ebVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new il0(new ci.ab((cb) this.f, this.d)) : ((yl0) this.e).x(viewGroup, i10);
            default:
                lj ljVar = new lj(this, this.d);
                ljVar.b = false;
                return new il0(ljVar);
        }
    }

    public ab(cb cbVar, yl0 yl0Var, Context context) {
        this.c = 0;
        this.f = cbVar;
        this.e = yl0Var;
        this.d = context;
    }
}
