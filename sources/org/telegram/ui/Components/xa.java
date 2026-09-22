package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xa extends kl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public xa(jj jjVar, Context context) {
        this.c = 1;
        this.f = jjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((kl0) this.e).B(new wa(this, j0Var));
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
                za zaVar = (za) this.f;
                if (i10 == (zaVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((kl0) this.e).j(i10 - (!zaVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                za zaVar = (za) this.f;
                if (i10 != (zaVar.P ? h() - 1 : 0)) {
                    ((kl0) this.e).v(c1Var, i10 - (!zaVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) c1Var.a;
                fbVar.d(1, false, false);
                fbVar.setSize(((jj) this.f).r);
                fbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new vk0(new ci.eb((za) this.f, this.d)) : ((kl0) this.e).x(viewGroup, i10);
            default:
                ij ijVar = new ij(this, this.d);
                ijVar.b = false;
                return new vk0(ijVar);
        }
    }

    public xa(za zaVar, kl0 kl0Var, Context context) {
        this.c = 0;
        this.f = zaVar;
        this.e = kl0Var;
        this.d = context;
    }
}
