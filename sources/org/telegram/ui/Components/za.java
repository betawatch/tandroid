package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class za extends ll0 {
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
                ((ll0) this.e).B(new ya(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((ll0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((ll0) this.e).h() + 1;
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
                return ((ll0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
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
                    ((ll0) this.e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) c1Var.a;
                gbVar.d(1, false, false);
                gbVar.setSize(((kj) this.f).r);
                gbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new wk0(new ci.bb((bb) this.f, this.d)) : ((ll0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.b = false;
                return new wk0(jjVar);
        }
    }

    public za(bb bbVar, ll0 ll0Var, Context context) {
        this.c = 0;
        this.f = bbVar;
        this.e = ll0Var;
        this.d = context;
    }
}
