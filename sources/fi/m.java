package fi;

import android.view.ViewGroup;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class m extends rg.b {
    public final boolean d;
    public final /* synthetic */ tv e;

    public m(tv tvVar, boolean z10) {
        this.e = tvVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        boolean z10 = this.d;
        tv tvVar = this.e;
        return (z10 ? tvVar.E : tvVar.y).size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        p pVar = (p) f1Var.a;
        pVar.b = i7;
        boolean z10 = this.d;
        tv tvVar = this.e;
        if (z10) {
            pVar.setDialogId(((n) tvVar.E.get(i7)).c);
        } else {
            pVar.setDialogId(((n) tvVar.y.get(i7)).c);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        p pVar = new p(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        pVar.O = z10;
        if (z10) {
            pVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new kj0(pVar);
    }
}
