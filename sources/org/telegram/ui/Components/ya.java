package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ya extends ul0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ya(mj mjVar, Context context) {
        this.c = 1;
        this.f = mjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((ul0) this.e).B(new xa(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return ((ul0) this.e).D(c1Var);
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((ul0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                ab abVar = (ab) this.f;
                if (i10 == (abVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((ul0) this.e).j(i10 - (!abVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                ab abVar = (ab) this.f;
                if (i10 != (abVar.P ? h() - 1 : 0)) {
                    ((ul0) this.e).v(c1Var, i10 - (!abVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) c1Var.a;
                gbVar.d(1, false, false);
                gbVar.setSize(((mj) this.f).r);
                gbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new fl0(new bi.nc((ab) this.f, this.d)) : ((ul0) this.e).x(viewGroup, i10);
            default:
                lj ljVar = new lj(this, this.d);
                ljVar.b = false;
                return new fl0(ljVar);
        }
    }

    public ya(ab abVar, ul0 ul0Var, Context context) {
        this.c = 0;
        this.f = abVar;
        this.e = ul0Var;
        this.d = context;
    }
}
