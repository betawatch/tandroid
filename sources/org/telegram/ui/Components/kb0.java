package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kb0 implements Menu {
    public final j80 a;
    public final y2 b;
    public final Runnable c;

    public kb0(j80 j80Var, y2 y2Var, Runnable runnable) {
        this.a = j80Var;
        this.b = y2Var;
        this.c = runnable;
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
        Runnable runnable = this.c;
        if (runnable == null || !org.telegram.ui.ActionBar.a5.r.contains(Integer.valueOf(i11)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            d2 d2Var = new d2(this, i11, 8);
            j80 j80Var = this.a;
            j80Var.c(0, charSequence, d2Var, false);
            if (runnable != null && org.telegram.ui.ActionBar.a5.r.contains(Integer.valueOf(i11))) {
                j80Var.M(runnable);
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
        add(i10, i11, i12, LocaleController.getString(i13));
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
    }

    @Override // android.view.Menu
    public final void close() {
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
    public final void setGroupEnabled(int i10, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
    }
}
