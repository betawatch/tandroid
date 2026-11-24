// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ixc extends lxc {
    public final WindowInsets.Builder c;

    public ixc(vxc vxcVar) {
        super(vxcVar);
        WindowInsets g = vxcVar.g();
        this.c = g != null ? mk1.i(g) : mk1.h();
    }

    @Override // lxc
    public vxc b() {
        a();
        vxc h = vxc.h(null, this.c.build());
        h.a.q(this.b);
        return h;
    }

    @Override // lxc
    public void d(io5 io5Var) {
        this.c.setMandatorySystemGestureInsets(io5Var.d());
    }

    @Override // lxc
    public void e(io5 io5Var) {
        this.c.setStableInsets(io5Var.d());
    }

    @Override // lxc
    public void f(io5 io5Var) {
        this.c.setSystemGestureInsets(io5Var.d());
    }

    @Override // lxc
    public void g(io5 io5Var) {
        this.c.setSystemWindowInsets(io5Var.d());
    }

    @Override // lxc
    public void h(io5 io5Var) {
        this.c.setTappableElementInsets(io5Var.d());
    }

    public ixc() {
        this.c = mk1.h();
    }
}
