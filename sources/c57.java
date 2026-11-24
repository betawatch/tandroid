// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c57 implements f59 {
    public final /* synthetic */ f57 a;

    public c57(f57 f57Var) {
        this.a = f57Var;
    }

    @Override // f59
    public final void g(int i, View view) {
        f57 f57Var = this.a;
        if (f57Var.a != 1 || f57Var.r.f.size() <= 1) {
            return;
        }
        int e1 = ((k47) f57Var.r.f.get(i)).e1();
        boolean z = f57Var.r.g.get(e1, false);
        boolean z2 = !z;
        if (f57Var.r.g.size() == 1 && z) {
            return;
        }
        m47 m47Var = f57Var.r;
        if (z) {
            m47Var.g.delete(e1);
        } else {
            m47Var.g.put(e1, z2);
        }
        if (view instanceof rc2) {
            ((rc2) view).o3(z2, z2, true);
        }
        f57Var.l(true);
    }
}
