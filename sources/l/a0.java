package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class a0 extends f2.v implements Menu {
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
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = f(menuItemArr2[i14]);
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
    public final MenuItem findItem(int i10) {
        return f(this.c.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return f(this.c.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.c.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.c.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((a0.k) this.b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.b;
                if (i11 >= kVar.c) {
                    break;
                }
                if (((l0.a) kVar.e(i11)).getGroupId() == i10) {
                    ((a0.k) this.b).f(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.c.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((a0.k) this.b) != null) {
            int i11 = 0;
            while (true) {
                a0.k kVar = (a0.k) this.b;
                if (i11 >= kVar.c) {
                    break;
                }
                if (((l0.a) kVar.e(i11)).getItemId() == i10) {
                    ((a0.k) this.b).f(i11);
                    break;
                }
                i11++;
            }
        }
        this.c.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z4, boolean z10) {
        this.c.setGroupCheckable(i10, z4, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z4) {
        this.c.setGroupEnabled(i10, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z4) {
        this.c.setGroupVisible(i10, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.c.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return f(this.c.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return f(this.c.a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.c.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return f(this.c.add(i10, i11, i12, i13));
    }
}
