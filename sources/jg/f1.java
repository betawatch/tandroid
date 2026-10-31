package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.d20;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.sk0;
import vh.j4;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f1 extends sk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ s9 d;
    public final /* synthetic */ j4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ s3 h;

    public f1(s3 s3Var, Context context, s9 s9Var, j4 j4Var, boolean z10) {
        this.h = s3Var;
        this.c = context;
        this.d = s9Var;
        this.e = j4Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.h.s0.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((jj) this.h.s0.get((r0.size() - 1) - i10)).U;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        bj d;
        s3 s3Var = this.h;
        ArrayList arrayList = s3Var.s0;
        jj jjVar = (jj) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            if (view instanceof org.telegram.ui.Cells.s0) {
                ((org.telegram.ui.Cells.s0) view).setMessageObject(jjVar);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        ej ejVar = s3Var.t0;
        if (ejVar == null || (d = ejVar.d(jjVar)) == null) {
            z10 = false;
        } else {
            z10 = d.c != 0;
        }
        ej ejVar2 = s3Var.t0;
        q1Var.s3(jjVar, ejVar2, ejVar2 != null, z10, false, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        i1 i1Var = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new ck0(new d1(this, context, i1Var));
        }
        e1 e1Var = new e1(this, context, d20.s0, i1Var);
        e1Var.d6 = true;
        return new ck0(e1Var);
    }
}
