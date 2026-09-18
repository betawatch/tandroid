package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xa extends ll0 {
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
                ((ll0) this.e).B(new wa(this, j0Var));
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
                za zaVar = (za) this.f;
                if (i10 == (zaVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((ll0) this.e).j(i10 - (!zaVar.P ? 1 : 0));
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
                    ((ll0) this.e).v(c1Var, i10 - (!zaVar.P ? 1 : 0));
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
                return i10 == -1000 ? new wk0(new ci.eb((za) this.f, this.d)) : ((ll0) this.e).x(viewGroup, i10);
            default:
                ij ijVar = new ij(this, this.d);
                ijVar.b = false;
                return new wk0(ijVar);
        }
    }

    public xa(za zaVar, ll0 ll0Var, Context context) {
        this.c = 0;
        this.f = zaVar;
        this.e = ll0Var;
        this.d = context;
    }
}
