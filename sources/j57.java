// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j57 implements r69 {
    public final /* synthetic */ m57 a;

    public j57(m57 m57Var) {
        this.a = m57Var;
    }

    @Override // r69
    public final void e(int i, View view) {
        m57 m57Var = this.a;
        if (m57Var.a != 1 || m57Var.r.f.size() <= 1) {
            return;
        }
        int e1 = ((r47) m57Var.r.f.get(i)).e1();
        boolean z = m57Var.r.g.get(e1, false);
        boolean z2 = !z;
        if (m57Var.r.g.size() == 1 && z) {
            return;
        }
        t47 t47Var = m57Var.r;
        if (z) {
            t47Var.g.delete(e1);
        } else {
            t47Var.g.put(e1, z2);
        }
        if (view instanceof wb2) {
            ((wb2) view).o3(z2, z2, true);
        }
        m57Var.l(true);
    }
}
