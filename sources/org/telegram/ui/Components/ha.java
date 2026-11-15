package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ha extends tj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ha(yi yiVar, Context context) {
        this.c = 1;
        this.f = yiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // v4.h0
    public void B(v4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((tj0) this.e).B(new ga(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        switch (this.c) {
            case 0:
                return ((tj0) this.e).D(e1Var);
            default:
                return e1Var.f == 0;
        }
    }

    @Override // v4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((tj0) this.e).b() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // v4.h0
    public final int d(int i7) {
        switch (this.c) {
            case 0:
                ja jaVar = (ja) this.f;
                if (i7 == (jaVar.K1 ? b() - 1 : 0)) {
                    return -1000;
                }
                return ((tj0) this.e).d(i7 - (!jaVar.K1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        switch (this.c) {
            case 0:
                ja jaVar = (ja) this.f;
                if (i7 != (jaVar.K1 ? b() - 1 : 0)) {
                    ((tj0) this.e).t(e1Var, i7 - (!jaVar.K1 ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) e1Var.a;
                taVar.d(1, false, false);
                taVar.setSize(((yi) this.f).r);
                taVar.e(1, ((ArrayList) this.e).get(i7), null, 0);
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return i7 == -1000 ? new cj0(new bi.o2((ja) this.f, this.d)) : ((tj0) this.e).x(viewGroup, i7);
            default:
                xi xiVar = new xi(this, this.d);
                xiVar.b = false;
                return new cj0(xiVar);
        }
    }

    public ha(ja jaVar, tj0 tj0Var, Context context) {
        this.c = 0;
        this.f = jaVar;
        this.e = tj0Var;
        this.d = context;
    }
}
