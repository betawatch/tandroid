package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = mVar != null ? mVar.a : 0;
        if (i9 == 0) {
            return null;
        }
        return r0.l(i9, "android:menu:actionviewstates:");
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
    public final void setGroupDividerEnabled(boolean z10) {
        this.z.setGroupDividerEnabled(z10);
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
    public final void setQwertyMode(boolean z10) {
        this.z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i9) {
        u(0, null, i9, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i9) {
        u(i9, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i9) {
        this.A.setIcon(i9);
        return this;
    }
}
