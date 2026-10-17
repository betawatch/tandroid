package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class za extends hm0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public za(ij ijVar, Context context) {
        this.c = 1;
        this.f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.g0
    public void B(s4.i0 i0Var) {
        switch (this.c) {
            case 0:
                ((hm0) this.e).B(new ya(this, i0Var));
                break;
            default:
                super.B(i0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.c) {
            case 0:
                return ((hm0) this.e).D(b1Var);
            default:
                return b1Var.f == 0;
        }
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((hm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 == (bbVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((hm0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 != (bbVar.P ? h() - 1 : 0)) {
                    ((hm0) this.e).v(b1Var, i10 - (!bbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) b1Var.a;
                abVar.d(1, false, false);
                abVar.setSize(((ij) this.f).r);
                abVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new sl0(new ai.hc((bb) this.f, this.d)) : ((hm0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.b = false;
                return new sl0(hjVar);
        }
    }

    public za(bb bbVar, hm0 hm0Var, Context context) {
        this.c = 0;
        this.f = bbVar;
        this.e = hm0Var;
        this.d = context;
    }
}
