package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z90 implements Menu {
    public final z60 a;
    public final r2 b;
    public final Runnable c;
    public final ct d;

    public z90(z60 z60Var, mt mtVar) {
        Objects.requireNonNull(mtVar);
        r2 r2Var = new r2(mtVar, 5);
        Runnable onPremiumMenuLockClickListener = mtVar.getOnPremiumMenuLockClickListener();
        ct ctVar = new ct(mtVar, 2);
        this.a = z60Var;
        this.b = r2Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = ctVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
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
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        ct ctVar;
        if (i11 != R.id.menu_quote || (ctVar = this.d) == null || ((Boolean) ctVar.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i11 != R.id.menu_regular || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.s4.r.contains(Integer.valueOf(i11)) || !org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).A3())) {
                qq qqVar = new qq(this, i11, 2);
                z60 z60Var = this.a;
                z60Var.c(0, charSequence, qqVar, false);
                if (runnable != null && org.telegram.ui.ActionBar.s4.r.contains(Integer.valueOf(i11))) {
                    z60Var.M(runnable);
                }
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        add(i10, i11, i12, org.telegram.messenger.cd.L0(i13, null));
        return null;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
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
    public final void setGroupEnabled(int i10, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
    }
}
