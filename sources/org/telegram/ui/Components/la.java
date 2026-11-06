package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class la extends oj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public la(qi qiVar, Context context) {
        this.c = 1;
        this.f = qiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // v4.g0
    public void B(v4.i0 i0Var) {
        switch (this.c) {
            case 0:
                ((oj0) this.e).B(new ka(this, i0Var));
                break;
            default:
                super.B(i0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                return ((oj0) this.e).D(d1Var);
            default:
                return d1Var.f == 0;
        }
    }

    @Override // v4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((oj0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // v4.g0
    public final int d(int i7) {
        switch (this.c) {
            case 0:
                na naVar = (na) this.f;
                if (i7 == (naVar.G1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((oj0) this.e).d(i7 - (!naVar.G1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        switch (this.c) {
            case 0:
                na naVar = (na) this.f;
                if (i7 != (naVar.G1 ? b() - 1 : 0)) {
                    ((oj0) this.e).t(d1Var, i7 - (!naVar.G1 ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) d1Var.a;
                uaVar.d(1, false, false);
                uaVar.setSize(((qi) this.f).r);
                uaVar.e(1, ((ArrayList) this.e).get(i7), null, 0);
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return i7 == -1000 ? new xi0(new bi.ec((na) this.f, this.d)) : ((oj0) this.e).x(viewGroup, i7);
            default:
                pi piVar = new pi(this, this.d);
                piVar.b = false;
                return new xi0(piVar);
        }
    }

    public la(na naVar, oj0 oj0Var, Context context) {
        this.c = 0;
        this.f = naVar;
        this.e = oj0Var;
        this.d = context;
    }
}
