package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wa extends il0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public wa(bj bjVar, Context context) {
        this.c = 1;
        this.f = bjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // f2.p0
    public void B(f2.r0 r0Var) {
        switch (this.c) {
            case 0:
                ((il0) this.e).B(new va(this, r0Var));
                break;
            default:
                super.B(r0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        switch (this.c) {
            case 0:
                return ((il0) this.e).D(n1Var);
            default:
                return n1Var.f == 0;
        }
    }

    @Override // f2.p0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((il0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                xa xaVar = (xa) this.f;
                if (i10 == (xaVar.M ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((il0) this.e).j(i10 - (!xaVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        switch (this.c) {
            case 0:
                xa xaVar = (xa) this.f;
                if (i10 != (xaVar.M ? h() - 1 : 0)) {
                    ((il0) this.e).v(n1Var, i10 - (!xaVar.M ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) n1Var.a;
                waVar.d(1, false, false);
                waVar.setSize(((bj) this.f).r);
                waVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new vk0(new cg.h0((xa) this.f, this.d)) : ((il0) this.e).x(viewGroup, i10);
            default:
                aj ajVar = new aj(this, this.d);
                ajVar.b = false;
                return new vk0(ajVar);
        }
    }

    public wa(xa xaVar, il0 il0Var, Context context) {
        this.c = 0;
        this.f = xaVar;
        this.e = il0Var;
        this.d = context;
    }
}
