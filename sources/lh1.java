// default package

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lh1 extends c79 {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ int e;
    public final /* synthetic */ nh1 f;

    public lh1(nh1 nh1Var, Activity activity, vnb vnbVar, int i) {
        this.f = nh1Var;
        this.c = activity;
        this.d = vnbVar;
        this.e = i;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        lc7 lc7Var = uc7.s1(this.e).E3;
        if (lc7Var == null) {
            return 0;
        }
        return lc7Var.c.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        mh1 mh1Var = (mh1) f89Var.a;
        yob.h(aob.d6, this.d, mh1Var);
        boolean z = i == this.f.e;
        mh1Var.s = z;
        mh1Var.w.f(z, true);
        mh1Var.invalidate();
        lc7 lc7Var = uc7.s1(this.e).E3;
        if (lc7Var != null) {
            ArrayList arrayList = lc7Var.c;
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            mh1Var.a((kc7) arrayList.get(i));
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new mh1(this.f, this.c));
    }
}
