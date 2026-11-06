package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
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
    public final MenuItem findItem(int i7) {
        return f(this.c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return f(this.c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.c.performIdentifierAction(i7, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.c.performShortcut(i7, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((a0.l) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.b;
                if (i10 >= lVar.c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getGroupId() == i7) {
                    ((a0.l) this.b).g(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((a0.l) this.b) != null) {
            int i10 = 0;
            while (true) {
                a0.l lVar = (a0.l) this.b;
                if (i10 >= lVar.c) {
                    break;
                }
                if (((l0.a) lVar.f(i10)).getItemId() == i7) {
                    ((a0.l) this.b).g(i10);
                    break;
                }
                i10++;
            }
        }
        this.c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z9, boolean z10) {
        this.c.setGroupCheckable(i7, z9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z9) {
        this.c.setGroupEnabled(i7, z9);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z9) {
        this.c.setGroupVisible(i7, z9);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.c.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return f(this.c.add(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return f(this.c.a(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.c.addSubMenu(i7, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return f(this.c.add(i7, i10, i11, i12));
    }
}
