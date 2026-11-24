// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c37 implements c39 {
    public final /* synthetic */ f37 a;

    public c37(f37 f37Var) {
        this.a = f37Var;
    }

    @Override // c39
    public final void d(int i, View view) {
        f37 f37Var = this.a;
        if (f37Var.a != 1 || f37Var.r.f.size() <= 1) {
            return;
        }
        int e1 = ((k27) f37Var.r.f.get(i)).e1();
        boolean z = f37Var.r.g.get(e1, false);
        boolean z2 = !z;
        if (f37Var.r.g.size() == 1 && z) {
            return;
        }
        m27 m27Var = f37Var.r;
        if (z) {
            m27Var.g.delete(e1);
        } else {
            m27Var.g.put(e1, z2);
        }
        if (view instanceof gb2) {
            ((gb2) view).o3(z2, z2, true);
        }
        f37Var.l(true);
    }
}
