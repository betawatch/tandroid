package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class za extends lm0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public za(ij ijVar, Context context) {
        this.c = 1;
        this.f = ijVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.h0
    public void B(s4.j0 j0Var) {
        switch (this.c) {
            case 0:
                ((lm0) this.e).B(new ya(this, j0Var));
                break;
            default:
                super.B(j0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        switch (this.c) {
            case 0:
                return ((lm0) this.e).D(e1Var);
            default:
                return e1Var.f == 0;
        }
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((lm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 == (bbVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((lm0) this.e).j(i10 - (!bbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        switch (this.c) {
            case 0:
                bb bbVar = (bb) this.f;
                if (i10 != (bbVar.P ? h() - 1 : 0)) {
                    ((lm0) this.e).v(e1Var, i10 - (!bbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) e1Var.a;
                fbVar.d(1, false, false);
                fbVar.setSize(((ij) this.f).r);
                fbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new vl0(new bi.cc((bb) this.f, this.d)) : ((lm0) this.e).x(viewGroup, i10);
            default:
                hj hjVar = new hj(this, this.d);
                hjVar.b = false;
                return new vl0(hjVar);
        }
    }

    public za(bb bbVar, lm0 lm0Var, Context context) {
        this.c = 0;
        this.f = bbVar;
        this.e = lm0Var;
        this.d = context;
    }
}
