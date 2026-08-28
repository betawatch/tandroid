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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x90 implements Menu {
    public final x60 a;
    public final v2 b;
    public final Runnable c;

    public x90(x60 x60Var, v2 v2Var, Runnable runnable) {
        this.a = x60Var;
        this.b = v2Var;
        this.c = runnable;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
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
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        Runnable runnable = this.c;
        if (runnable == null || !org.telegram.ui.ActionBar.v4.r.contains(Integer.valueOf(i10)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            qd qdVar = new qd(this, i10, 3);
            x60 x60Var = this.a;
            x60Var.c(0, charSequence, qdVar, false);
            if (runnable != null && org.telegram.ui.ActionBar.v4.r.contains(Integer.valueOf(i10))) {
                x60Var.M(runnable);
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        add(i9, i10, i11, LocaleController.getString(i12));
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
    }

    @Override // android.view.Menu
    public final void close() {
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z10) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z10, boolean z11) {
    }
}
