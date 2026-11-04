package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ka extends sj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ka(qi qiVar, Context context) {
        this.c = 1;
        this.f = qiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // u4.h0
    public void B(u4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((sj0) this.e).B(new ja(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                return ((sj0) this.e).D(d1Var);
            default:
                return d1Var.f == 0;
        }
    }

    @Override // u4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((sj0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // u4.h0
    public final int d(int i3) {
        switch (this.c) {
            case 0:
                ma maVar = (ma) this.f;
                if (i3 == (maVar.H1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((sj0) this.e).d(i3 - (!maVar.H1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        switch (this.c) {
            case 0:
                ma maVar = (ma) this.f;
                if (i3 != (maVar.H1 ? b() - 1 : 0)) {
                    ((sj0) this.e).t(d1Var, i3 - (!maVar.H1 ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) d1Var.a;
                taVar.d(1, false, false);
                taVar.setSize(((qi) this.f).r);
                taVar.e(1, ((ArrayList) this.e).get(i3), null, 0);
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.c) {
            case 0:
                return i3 == -1000 ? new bj0(new ai.x2((ma) this.f, this.d)) : ((sj0) this.e).x(viewGroup, i3);
            default:
                pi piVar = new pi(this, this.d);
                piVar.b = false;
                return new bj0(piVar);
        }
    }

    public ka(ma maVar, sj0 sj0Var, Context context) {
        this.c = 0;
        this.f = maVar;
        this.e = sj0Var;
        this.d = context;
    }
}
