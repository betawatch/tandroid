package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j7.i8;
import j7.s7;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n implements l0.a {
    public o A;
    public MenuItem.OnActionExpandListener B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public final l n;
    public e0 o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.n = lVar;
        this.a = i11;
        this.b = i10;
        this.c = i12;
        this.d = i13;
        this.e = charSequence;
        this.y = i14;
    }

    public static void c(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // l0.a
    public final l0.a a(o oVar) {
        this.z = null;
        this.A = oVar;
        this.n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.b = new ja.c(this);
            oVar2.a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // l0.a
    public final o b() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = i8.d(drawable).mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (oVar = this.A) != null) {
            this.z = oVar.a(this);
        }
        return this.z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar == null) {
            return null;
        }
        View a2 = oVar.a(this);
        this.z = a2;
        return a2;
    }

    @Override // l0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // l0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.m;
        if (i10 == 0) {
            return null;
        }
        Drawable b10 = s7.b(this.n.a, i10);
        this.m = 0;
        this.l = b10;
        return d(b10);
    }

    @Override // l0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // l0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // l0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        return (oVar == null || !oVar.a.overridesItemVisibility()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.a) > 0) {
            view.setId(i10);
        }
        l lVar = this.n;
        lVar.k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.j == c3) {
            return this;
        }
        this.j = Character.toLowerCase(c3);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i10 = this.x;
        int i11 = (z4 ? 1 : 0) | (i10 & (-2));
        this.x = i11;
        if (i10 != i11) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i10 = this.x;
        int i11 = i10 & 4;
        l lVar = this.n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z4 ? 2 : 0);
            this.x = i12;
            if (i10 != i12) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f;
        int size = arrayList.size();
        lVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) arrayList.get(i13);
            if (nVar.b == this.b && (nVar.x & 4) != 0 && nVar.isCheckable()) {
                boolean z10 = nVar == this;
                int i14 = nVar.x;
                int i15 = (z10 ? 2 : 0) | (i14 & (-3));
                nVar.x = i15;
                if (i14 != i15) {
                    nVar.n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c10) {
        this.h = c3;
        this.j = Character.toLowerCase(c10);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i10;
        l lVar = this.n;
        lVar.k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        e0 e0Var = this.o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i10 = this.x;
        int i11 = (z4 ? 0 : 8) | (i10 & (-9));
        this.x = i11;
        if (i10 != i11) {
            l lVar = this.n;
            lVar.h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // l0.a, android.view.MenuItem
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i10) {
        if (this.j == c3 && this.k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i10) {
        if (this.h == c3 && this.i == i10) {
            return this;
        }
        this.h = c3;
        this.i = KeyEvent.normalizeMetaState(i10);
        this.n.p(false);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c10, int i10, int i11) {
        this.h = c3;
        this.i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i11);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.l = null;
        this.m = i10;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.n.a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.n;
        Context context = lVar.a;
        View inflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.a) > 0) {
            inflate.setId(i11);
        }
        lVar.k = true;
        lVar.p(true);
        return this;
    }
}
