package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a0 extends f2.x implements Menu {
    public final k c;

    public a0(Context context, k kVar) {
        super(context);
        if (kVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.c = kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i9, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = f(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        a0.k kVar = (a0.k) this.b;
        if (kVar != null) {
            kVar.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        return f(this.c.findItem(i9));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return f(this.c.getItem(i9));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i9, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return this.c.performIdentifierAction(i9, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        return this.c.performShortcut(i9, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
        if (((a0.k) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.b;
                if (i10 >= kVar.c) {
                    break;
                }
                if (((l0.a) kVar.e(i10)).getGroupId() == i9) {
                    ((a0.k) this.b).f(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.c.removeGroup(i9);
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
        if (((a0.k) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.b;
                if (i10 >= kVar.c) {
                    break;
                }
                if (((l0.a) kVar.e(i10)).getItemId() == i9) {
                    ((a0.k) this.b).f(i10);
                    break;
                }
                i10++;
            }
        }
        this.c.removeItem(i9);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z10, boolean z11) {
        this.c.setGroupCheckable(i9, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z10) {
        this.c.setGroupEnabled(i9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z10) {
        this.c.setGroupVisible(i9, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return this.c.addSubMenu(i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return f(this.c.add(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return this.c.addSubMenu(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return f(this.c.a(i9, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return this.c.addSubMenu(i9, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return f(this.c.add(i9, i10, i11, i12));
    }
}
