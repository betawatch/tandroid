// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bab extends yz6 implements SubMenu {
    public final c07 A;
    public final yz6 z;

    public bab(Context context, yz6 yz6Var, c07 c07Var) {
        super(context);
        this.z = yz6Var;
        this.A = c07Var;
    }

    @Override // yz6
    public final boolean d(c07 c07Var) {
        return this.z.d(c07Var);
    }

    @Override // yz6
    public final boolean e(yz6 yz6Var, MenuItem menuItem) {
        return super.e(yz6Var, menuItem) || this.z.e(yz6Var, menuItem);
    }

    @Override // yz6
    public final boolean f(c07 c07Var) {
        return this.z.f(c07Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // yz6
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return de9.k(i, "android:menu:actionviewstates:");
    }

    @Override // yz6
    public final yz6 k() {
        return this.z.k();
    }

    @Override // yz6
    public final boolean m() {
        return this.z.m();
    }

    @Override // yz6
    public final boolean n() {
        return this.z.n();
    }

    @Override // yz6
    public final boolean o() {
        return this.z.o();
    }

    @Override // yz6, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // yz6, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
