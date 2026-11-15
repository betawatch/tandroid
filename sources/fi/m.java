package fi;

import android.view.ViewGroup;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.qv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ qv e;

    public m(qv qvVar, boolean z10) {
        this.e = qvVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        boolean z10 = this.d;
        qv qvVar = this.e;
        return (z10 ? qvVar.E : qvVar.y).size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        p pVar = (p) e1Var.a;
        pVar.b = i7;
        boolean z10 = this.d;
        qv qvVar = this.e;
        if (z10) {
            pVar.setDialogId(((n) qvVar.E.get(i7)).c);
        } else {
            pVar.setDialogId(((n) qvVar.y.get(i7)).c);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new cj0(pVar);
    }
}
