// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
