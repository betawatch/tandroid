package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ra extends sl0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ra(bj bjVar, Context context) {
        this.c = 1;
        this.f = bjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // f2.p0
    public void B(f2.r0 r0Var) {
        switch (this.c) {
            case 0:
                ((sl0) this.e).B(new qa(this, r0Var));
                break;
            default:
                super.B(r0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        switch (this.c) {
            case 0:
                return ((sl0) this.e).D(m1Var);
            default:
                return m1Var.f == 0;
        }
    }

    @Override // f2.p0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((sl0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i10 == (saVar.N ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((sl0) this.e).j(i10 - (!saVar.N ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i10 != (saVar.N ? h() - 1 : 0)) {
                    ((sl0) this.e).v(m1Var, i10 - (!saVar.N ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) m1Var.a;
                zaVar.d(1, false, false);
                zaVar.setSize(((bj) this.f).r);
                zaVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new fl0(new fg.h0((sa) this.f, this.d)) : ((sl0) this.e).x(viewGroup, i10);
            default:
                aj ajVar = new aj(this, this.d);
                ajVar.b = false;
                return new fl0(ajVar);
        }
    }

    public ra(sa saVar, sl0 sl0Var, Context context) {
        this.c = 0;
        this.f = saVar;
        this.e = sl0Var;
        this.d = context;
    }
}
