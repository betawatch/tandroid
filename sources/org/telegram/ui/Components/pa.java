package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pa extends yk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public pa(ui uiVar, Context context) {
        this.c = 1;
        this.f = uiVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // f2.q0
    public void B(f2.s0 s0Var) {
        switch (this.c) {
            case 0:
                ((yk0) this.e).B(new oa(this, s0Var));
                break;
            default:
                super.B(s0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        switch (this.c) {
            case 0:
                return ((yk0) this.e).D(o1Var);
            default:
                return o1Var.f == 0;
        }
    }

    @Override // f2.q0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((yk0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // f2.q0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                qa qaVar = (qa) this.f;
                if (i10 == (qaVar.M ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((yk0) this.e).j(i10 - (!qaVar.M ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        switch (this.c) {
            case 0:
                qa qaVar = (qa) this.f;
                if (i10 != (qaVar.M ? h() - 1 : 0)) {
                    ((yk0) this.e).v(o1Var, i10 - (!qaVar.M ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) o1Var.a;
                waVar.d(1, false, false);
                waVar.setSize(((ui) this.f).r);
                waVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new lk0(new ag.s0((qa) this.f, this.d)) : ((yk0) this.e).x(viewGroup, i10);
            default:
                ti tiVar = new ti(this, this.d);
                tiVar.b = false;
                return new lk0(tiVar);
        }
    }

    public pa(qa qaVar, yk0 yk0Var, Context context) {
        this.c = 0;
        this.f = qaVar;
        this.e = yk0Var;
        this.d = context;
    }
}
