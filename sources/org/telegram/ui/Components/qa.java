package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qa extends dk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public qa(hj hjVar, Context context) {
        this.c = 1;
        this.f = hjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // v4.i0
    public void B(v4.k0 k0Var) {
        switch (this.c) {
            case 0:
                ((dk0) this.e).B(new pa(this, k0Var));
                break;
            default:
                super.B(k0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                return ((dk0) this.e).D(f1Var);
            default:
                return f1Var.f == 0;
        }
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((dk0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // v4.i0
    public final int d(int i7) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i7 == (saVar.K1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((dk0) this.e).d(i7 - (!saVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i7 != (saVar.K1 ? b() - 1 : 0)) {
                    ((dk0) this.e).t(f1Var, i7 - (!saVar.K1 ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) f1Var.a;
                vaVar.d(1, false, false);
                vaVar.setSize(((hj) this.f).r);
                vaVar.e(1, ((ArrayList) this.e).get(i7), null, 0);
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return i7 == -1000 ? new mj0(new bi.m3((sa) this.f, this.d)) : ((dk0) this.e).x(viewGroup, i7);
            default:
                gj gjVar = new gj(this, this.d);
                gjVar.b = false;
                return new mj0(gjVar);
        }
    }

    public qa(sa saVar, dk0 dk0Var, Context context) {
        this.c = 0;
        this.f = saVar;
        this.e = dk0Var;
        this.d = context;
    }
}
