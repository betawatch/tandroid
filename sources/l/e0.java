package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e0 extends l implements SubMenu {
    public final n A;
    public final l z;

    public e0(Context context, l lVar, n nVar) {
        super(context);
        this.z = lVar;
        this.A = nVar;
    }

    @Override // l.l
    public final boolean d(n nVar) {
        return this.z.d(nVar);
    }

    @Override // l.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.z.e(lVar, menuItem);
    }

    @Override // l.l
    public final boolean f(n nVar) {
        return this.z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // l.l
    public final String j() {
        n nVar = this.A;
        int i10 = nVar != null ? nVar.a : 0;
        if (i10 == 0) {
            return null;
        }
        return d.j(i10, "android:menu:actionviewstates:");
    }

    @Override // l.l
    public final l k() {
        return this.z.k();
    }

    @Override // l.l
    public final boolean m() {
        return this.z.m();
    }

    @Override // l.l
    public final boolean n() {
        return this.z.n();
    }

    @Override // l.l
    public final boolean o() {
        return this.z.o();
    }

    @Override // l.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.z.setGroupDividerEnabled(z4);
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

    @Override // l.l, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.z.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
