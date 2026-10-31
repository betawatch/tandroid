package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fa extends sk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public fa(qi qiVar, Context context) {
        this.c = 1;
        this.f = qiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.g0
    public void B(s4.i0 i0Var) {
        switch (this.c) {
            case 0:
                ((sk0) this.e).B(new ea(this, i0Var));
                break;
            default:
                super.B(i0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((sk0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((sk0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.g0
    public final int d(int i10) {
        switch (this.c) {
            case 0:
                ha haVar = (ha) this.f;
                if (i10 == (haVar.G1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((sk0) this.e).d(i10 - (!haVar.G1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                ha haVar = (ha) this.f;
                if (i10 != (haVar.G1 ? b() - 1 : 0)) {
                    ((sk0) this.e).t(c1Var, i10 - (!haVar.G1 ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) c1Var.a;
                uaVar.d(1, false, false);
                uaVar.setSize(((qi) this.f).r);
                uaVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new ck0(new bi.t0((ha) this.f, this.d)) : ((sk0) this.e).w(viewGroup, i10);
            default:
                pi piVar = new pi(this, this.d);
                piVar.b = false;
                return new ck0(piVar);
        }
    }

    public fa(ha haVar, sk0 sk0Var, Context context) {
        this.c = 0;
        this.f = haVar;
        this.e = sk0Var;
        this.d = context;
    }
}
