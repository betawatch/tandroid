// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ki1 extends q59 {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ int e;
    public final /* synthetic */ mi1 f;

    public ki1(mi1 mi1Var, Activity activity, ylb ylbVar, int i) {
        this.f = mi1Var;
        this.c = activity;
        this.d = ylbVar;
        this.e = i;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        fc7 fc7Var = oc7.r1(this.e).E3;
        if (fc7Var == null) {
            return 0;
        }
        return fc7Var.c.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        li1 li1Var = (li1) u69Var.a;
        anb.h(cmb.c6, this.d, li1Var);
        boolean z = i == this.f.e;
        li1Var.s = z;
        li1Var.w.f(z, true);
        li1Var.invalidate();
        fc7 fc7Var = oc7.r1(this.e).E3;
        if (fc7Var != null) {
            ArrayList arrayList = fc7Var.c;
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            li1Var.a((ec7) arrayList.get(i));
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new li1(this.f, this.c));
    }
}
