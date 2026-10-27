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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ib0 implements Menu {
    public final l80 a;
    public final b3 b;
    public final Runnable c;

    public ib0(l80 l80Var, b3 b3Var, Runnable runnable) {
        this.a = l80Var;
        this.b = b3Var;
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
        if (runnable == null || !org.telegram.ui.ActionBar.c5.r.contains(Integer.valueOf(i11)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            h2 h2Var = new h2(this, i11, 8);
            l80 l80Var = this.a;
            l80Var.c(0, charSequence, h2Var, false);
            if (runnable != null && org.telegram.ui.ActionBar.c5.r.contains(Integer.valueOf(i11))) {
                l80Var.M(runnable);
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
