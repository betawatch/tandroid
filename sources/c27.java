// default package

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
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c27 implements aeb {
    public d27 A;
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
    public final y17 n;
    public dcb o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = TLObject.FLAG_12;
    public int k = TLObject.FLAG_12;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public c27(y17 y17Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = y17Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // aeb
    public final aeb a(d27 d27Var) {
        this.z = null;
        this.A = d27Var;
        this.n.p(true);
        d27 d27Var2 = this.A;
        if (d27Var2 != null) {
            d27Var2.b = new ai4((Object) this, (byte) 16);
            d27Var2.a.setVisibilityListener(d27Var2);
        }
        return this;
    }

    @Override // aeb
    public final d27 b() {
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
            drawable = drawable.mutate();
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
        d27 d27Var;
        if ((this.y & 8) != 0) {
            View view = this.z;
            if (view == null && (d27Var = this.A) != null) {
                view = d27Var.a.onCreateActionView(this);
                this.z = view;
            }
            if (view != null) {
                return true;
            }
        }
        return false;
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

    public final void f(boolean z) {
        int i = this.x;
        if (z) {
            this.x = i | 32;
        } else {
            this.x = i & (-33);
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
        d27 d27Var = this.A;
        if (d27Var == null) {
            return null;
        }
        View onCreateActionView = d27Var.a.onCreateActionView(this);
        this.z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // aeb, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // aeb, android.view.MenuItem
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
        int i = this.m;
        if (i == 0) {
            return null;
        }
        Drawable a = kod.a(this.n.a, i);
        this.m = 0;
        this.l = a;
        return d(a);
    }

    @Override // aeb, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // aeb, android.view.MenuItem
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

    @Override // aeb, android.view.MenuItem
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

    @Override // aeb, android.view.MenuItem
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
        d27 d27Var = this.A;
        return (d27Var == null || !d27Var.a.overridesItemVisibility()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        y17 y17Var = this.n;
        Context context = y17Var.a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        y17Var.k = true;
        y17Var.p(true);
        return this;
    }

    @Override // aeb, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (i & (-2)) | (z ? 1 : 0);
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.x;
        int i2 = i & 4;
        y17 y17Var = this.n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.x = i3;
            if (i != i3) {
                y17Var.p(false);
            }
            return this;
        }
        ArrayList arrayList = y17Var.f;
        int size = arrayList.size();
        y17Var.w();
        for (int i4 = 0; i4 < size; i4++) {
            c27 c27Var = (c27) arrayList.get(i4);
            if (c27Var.b == this.b && (c27Var.x & 4) != 0 && c27Var.isCheckable()) {
                boolean z2 = c27Var == this;
                int i5 = c27Var.x;
                int i6 = (i5 & (-3)) | (z2 ? 2 : 0);
                c27Var.x = i6;
                if (i5 != i6) {
                    c27Var.n.p(false);
                }
            }
        }
        y17Var.v();
        return this;
    }

    @Override // aeb, android.view.MenuItem
    public final aeb setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.x;
        if (z) {
            this.x = i | 16;
        } else {
            this.x = i & (-17);
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // aeb, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // aeb, android.view.MenuItem
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

    @Override // aeb, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
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

    @Override // aeb, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            u36.j("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.y = i;
        y17 y17Var = this.n;
        y17Var.k = true;
        y17Var.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        dcb dcbVar = this.o;
        if (dcbVar != null) {
            dcbVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // aeb, android.view.MenuItem
    public final aeb setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.x;
        int i2 = (i & (-9)) | (z ? 0 : 8);
        this.x = i2;
        if (i != i2) {
            y17 y17Var = this.n;
            y17Var.h = true;
            y17Var.p(true);
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

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
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

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.n.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        y17 y17Var = this.n;
        y17Var.k = true;
        y17Var.p(true);
        return this;
    }
}
