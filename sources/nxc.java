// default package

import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class nxc extends mxc {
    public io5 n;

    public nxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
        this.n = null;
    }

    @Override // sxc
    public vxc b() {
        return vxc.h(null, this.c.consumeStableInsets());
    }

    @Override // sxc
    public vxc c() {
        return vxc.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // sxc
    public final io5 i() {
        io5 io5Var = this.n;
        if (io5Var != null) {
            return io5Var;
        }
        WindowInsets windowInsets = this.c;
        io5 b = io5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = b;
        return b;
    }

    @Override // sxc
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // sxc
    public void s(io5 io5Var) {
        this.n = io5Var;
    }
}
