package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ra extends rl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ra(zi ziVar, Context context) {
        this.c = 1;
        this.f = ziVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // f2.o0
    public void B(f2.q0 q0Var) {
        switch (this.c) {
            case 0:
                ((rl0) this.e).B(new qa(this, q0Var));
                break;
            default:
                super.B(q0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        switch (this.c) {
            case 0:
                return ((rl0) this.e).D(l1Var);
            default:
                return l1Var.f == 0;
        }
    }

    @Override // f2.o0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((rl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // f2.o0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i10 == (saVar.N ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((rl0) this.e).j(i10 - (!saVar.N ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i10 != (saVar.N ? h() - 1 : 0)) {
                    ((rl0) this.e).v(l1Var, i10 - (!saVar.N ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) l1Var.a;
                zaVar.d(1, false, false);
                zaVar.setSize(((zi) this.f).r);
                zaVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new el0(new eg.h0((sa) this.f, this.d)) : ((rl0) this.e).x(viewGroup, i10);
            default:
                yi yiVar = new yi(this, this.d);
                yiVar.b = false;
                return new el0(yiVar);
        }
    }

    public ra(sa saVar, rl0 rl0Var, Context context) {
        this.c = 0;
        this.f = saVar;
        this.e = rl0Var;
        this.d = context;
    }
}
