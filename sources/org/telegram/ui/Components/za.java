package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class za extends kl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public za(jj jjVar, Context context) {
        this.c = 1;
        this.f = jjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((kl0) this.e).B(new ya(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((kl0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((kl0) this.e).h() + 1;
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
                return ((kl0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
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
                    ((kl0) this.e).v(c1Var, i10 - (!bbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) c1Var.a;
                ebVar.d(1, false, false);
                ebVar.setSize(((jj) this.f).r);
                ebVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new vk0(new di.eb((bb) this.f, this.d)) : ((kl0) this.e).x(viewGroup, i10);
            default:
                ij ijVar = new ij(this, this.d);
                ijVar.b = false;
                return new vk0(ijVar);
        }
    }

    public za(bb bbVar, kl0 kl0Var, Context context) {
        this.c = 0;
        this.f = bbVar;
        this.e = kl0Var;
        this.d = context;
    }
}
