package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bb extends lm0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final Object e;
    public final /* synthetic */ KeyEvent.Callback f;

    public bb(kj kjVar, Context context) {
        this.c = 1;
        this.f = kjVar;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override // s4.g0
    public void B(s4.i0 i0Var) {
        switch (this.c) {
            case 0:
                ((lm0) this.e).B(new ab(this, i0Var));
                break;
            default:
                super.B(i0Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.c) {
            case 0:
                return ((lm0) this.e).D(b1Var);
            default:
                return b1Var.f == 0;
        }
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((lm0) this.e).h() + 1;
            default:
                return ((ArrayList) this.e).size();
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                db dbVar = (db) this.f;
                if (i10 == (dbVar.P ? h() - 1 : 0)) {
                    return -1000;
                }
                return ((lm0) this.e).j(i10 - (!dbVar.P ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        switch (this.c) {
            case 0:
                db dbVar = (db) this.f;
                if (i10 != (dbVar.P ? h() - 1 : 0)) {
                    ((lm0) this.e).v(b1Var, i10 - (!dbVar.P ? 1 : 0));
                    break;
                }
                break;
            default:
                org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) b1Var.a;
                cbVar.d(1, false, false);
                cbVar.setSize(((kj) this.f).r);
                cbVar.e(1, ((ArrayList) this.e).get(i10), null, 0);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return i10 == -1000 ? new wl0(new di.ab((db) this.f, this.d)) : ((lm0) this.e).x(viewGroup, i10);
            default:
                jj jjVar = new jj(this, this.d);
                jjVar.b = false;
                return new wl0(jjVar);
        }
    }

    public bb(db dbVar, lm0 lm0Var, Context context) {
        this.c = 0;
        this.f = dbVar;
        this.e = lm0Var;
        this.d = context;
    }
}
