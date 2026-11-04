package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class a0 extends g.p implements Menu {
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
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i3, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
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
        a0.l lVar = (a0.l) this.b;
        if (lVar != null) {
            lVar.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        return f(this.c.findItem(i3));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return f(this.c.getItem(i3));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i3, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i10) {
        return this.c.performIdentifierAction(i3, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
        return this.c.performShortcut(i3, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        if (((a0.l) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.b;
                if (i10 >= lVar.c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getGroupId() == i3) {
                    ((a0.l) this.b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.c.removeGroup(i3);
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        if (((a0.l) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.b;
                if (i10 >= lVar.c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getItemId() == i3) {
                    ((a0.l) this.b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.c.removeItem(i3);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
        this.c.setGroupCheckable(i3, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z10) {
        this.c.setGroupEnabled(i3, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z10) {
        this.c.setGroupVisible(i3, z10);
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
    public final SubMenu addSubMenu(int i3) {
        return this.c.addSubMenu(i3);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return f(this.c.add(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        return this.c.addSubMenu(i3, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        return f(this.c.a(i3, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return this.c.addSubMenu(i3, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        return f(this.c.add(i3, i10, i11, i12));
    }
}
