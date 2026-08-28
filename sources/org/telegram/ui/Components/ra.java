package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ra extends vk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public ra(yi yiVar, Context context) {
        this.c = 1;
        this.f = yiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // f2.r0
    public void B(f2.t0 t0Var) {
        switch (this.c) {
            case 0:
                ((vk0) this.e).B(new qa(this, t0Var));
                break;
            default:
                super.B(t0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        switch (this.c) {
            case 0:
                return ((vk0) this.e).D(q1Var);
            default:
                return q1Var.f == 0;
        }
    }

    @Override // f2.r0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((vk0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // f2.r0
    public final int j(int i9) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i9 == (saVar.M ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((vk0) this.e).j(i9 - (!saVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        switch (this.c) {
            case 0:
                sa saVar = (sa) this.f;
                if (i9 != (saVar.M ? h() - 1 : 0)) {
                    ((vk0) this.e).v(q1Var, i9 - (!saVar.M ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) q1Var.a;
                zaVar.d(1, false, false);
                zaVar.setSize(((yi) this.f).r);
                zaVar.e(1, ((ArrayList) this.e).get(i9), null, 0);
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        switch (this.c) {
            case 0:
                return i9 == -1000 ? new ik0(new fh.l2((sa) this.f, this.d)) : ((vk0) this.e).x(viewGroup, i9);
            default:
                xi xiVar = new xi(this, this.d);
                xiVar.b = false;
                return new ik0(xiVar);
        }
    }

    public ra(sa saVar, vk0 vk0Var, Context context) {
        this.c = 0;
        this.f = saVar;
        this.e = vk0Var;
        this.d = context;
    }
}
