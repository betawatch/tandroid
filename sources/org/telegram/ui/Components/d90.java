package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d90 implements Menu {
    public final f60 a;
    public final p2 b;
    public final Runnable c;
    public final qs d;

    public d90(f60 f60Var, xs xsVar) {
        Objects.requireNonNull(xsVar);
        p2 p2Var = new p2(xsVar, 5);
        Runnable onPremiumMenuLockClickListener = xsVar.getOnPremiumMenuLockClickListener();
        qs qsVar = new qs(xsVar, 2);
        this.a = f60Var;
        this.b = p2Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = qsVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i10) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        return false;
    }

    @Override // android.view.Menu
    public final int size() {
        return 0;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        qs qsVar;
        if (i10 != R.id.menu_quote || (qsVar = this.d) == null || ((Boolean) qsVar.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i10 != R.id.menu_regular || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.k4.r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).D3())) {
                o2 o2Var = new o2(this, i10, 7);
                f60 f60Var = this.a;
                f60Var.c(0, charSequence, o2Var, false);
                if (runnable != null && org.telegram.ui.ActionBar.k4.r.contains(Integer.valueOf(i10))) {
                    f60Var.M(runnable);
                }
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        add(i3, i10, i11, org.telegram.messenger.bd.M0(i12, null));
        return null;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
    }

    @Override // android.view.Menu
    public final void clear() {
    }

    @Override // android.view.Menu
    public final void close() {
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
    }
}
