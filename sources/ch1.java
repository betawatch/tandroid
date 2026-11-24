// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ch1 extends n39 {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ wjb d;
    public final /* synthetic */ int e;
    public final /* synthetic */ eh1 f;

    public ch1(eh1 eh1Var, Activity activity, wjb wjbVar, int i) {
        this.f = eh1Var;
        this.c = activity;
        this.d = wjbVar;
        this.e = i;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        ea7 ea7Var = na7.q1(this.e).E3;
        if (ea7Var == null) {
            return 0;
        }
        return ea7Var.c.size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        dh1 dh1Var = (dh1) s49Var.a;
        zkb.h(bkb.c6, this.d, dh1Var);
        boolean z = i == this.f.e;
        dh1Var.s = z;
        dh1Var.w.f(z, true);
        dh1Var.invalidate();
        ea7 ea7Var = na7.q1(this.e).E3;
        if (ea7Var != null) {
            ArrayList arrayList = ea7Var.c;
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            dh1Var.a((da7) arrayList.get(i));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new dh1(this.f, this.c));
    }
}
