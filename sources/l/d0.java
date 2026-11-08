package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d0 extends k implements SubMenu {
    public final m A;
    public final k z;

    public d0(Context context, k kVar, m mVar) {
        super(context);
        this.z = kVar;
        this.A = mVar;
    }

    @Override // l.k
    public final boolean d(m mVar) {
        return this.z.d(mVar);
    }

    @Override // l.k
    public final boolean e(k kVar, MenuItem menuItem) {
        return super.e(kVar, menuItem) || this.z.e(kVar, menuItem);
    }

    @Override // l.k
    public final boolean f(m mVar) {
        return this.z.f(mVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // l.k
    public final String j() {
        m mVar = this.A;
        int i7 = mVar != null ? mVar.a : 0;
        if (i7 == 0) {
            return null;
        }
        return jg.g.j(i7, "android:menu:actionviewstates:");
    }

    @Override // l.k
    public final k k() {
        return this.z.k();
    }

    @Override // l.k
    public final boolean m() {
        return this.z.m();
    }

    @Override // l.k
    public final boolean n() {
        return this.z.n();
    }

    @Override // l.k
    public final boolean o() {
        return this.z.o();
    }

    @Override // l.k, android.view.Menu
    public final void setGroupDividerEnabled(boolean z9) {
        this.z.setGroupDividerEnabled(z9);
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

    @Override // l.k, android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.z.setQwertyMode(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.A.setIcon(i7);
        return this;
    }
}
