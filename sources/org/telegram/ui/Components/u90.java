package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u90 implements Menu {
    public final y60 a;
    public final y2 b;
    public final Runnable c;
    public final dt d;

    public u90(y60 y60Var, mt mtVar) {
        Objects.requireNonNull(mtVar);
        y2 y2Var = new y2(mtVar, 7);
        Runnable onPremiumMenuLockClickListener = mtVar.getOnPremiumMenuLockClickListener();
        dt dtVar = new dt(mtVar, 2);
        this.a = y60Var;
        this.b = y2Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = dtVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
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
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        dt dtVar;
        if (i10 != R.id.menu_quote || (dtVar = this.d) == null || ((Boolean) dtVar.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i10 != R.id.menu_regular || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.m4.r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).K3())) {
                org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i10, 13);
                y60 y60Var = this.a;
                y60Var.c(0, charSequence, iiVar, false);
                if (runnable != null && org.telegram.ui.ActionBar.m4.r.contains(Integer.valueOf(i10))) {
                    y60Var.N(runnable);
                }
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        add(i7, i10, i11, org.telegram.messenger.gd.M0(i12, null));
        return null;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
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
    public final void setGroupEnabled(int i7, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z10, boolean z11) {
    }
}
