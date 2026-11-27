// default package

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class a37 implements Menu {
    public final fu5 a;
    public final ev0 b;
    public final Runnable c;
    public final yf0 d;

    public a37(fu5 fu5Var, xt3 xt3Var) {
        Objects.requireNonNull(xt3Var);
        ev0 ev0Var = new ev0(xt3Var, (byte) 1);
        Runnable onPremiumMenuLockClickListener = xt3Var.getOnPremiumMenuLockClickListener();
        yf0 yf0Var = new yf0(xt3Var, (byte) 3);
        this.a = fu5Var;
        this.b = ev0Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = yf0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 != R.id.menu_quote || ((Boolean) this.d.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i2 != R.id.menu_regular || runnable == null) && (runnable == null || !lm4.r.contains(Integer.valueOf(i2)) || !uc7.s1(yac.t0).M3())) {
                hl3 hl3Var = new hl3(this, i2, (byte) 24);
                fu5 fu5Var = this.a;
                fu5Var.b(0, charSequence, hl3Var, false);
                if (runnable != null && lm4.r.contains(Integer.valueOf(i2))) {
                    fu5Var.N(runnable);
                }
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final int size() {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
    }

    @Override // android.view.Menu
    public final void close() {
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        add(i, i2, i3, ob6.M0(i4, null));
        return null;
    }
}
