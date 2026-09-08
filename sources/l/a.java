package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import v7.o8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements l0.a {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e;
    public char f;
    public int g;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;

    @Override // l0.a
    public final l0.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable d = o8.d(drawable);
                this.h = d;
                Drawable mutate = d.mutate();
                this.h = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.h.setTintMode(this.m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // l0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // l0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // l0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // l0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // l0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.p = (z10 ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.p = (z10 ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.p = (z10 ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.d = c10;
        this.f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.p = (this.p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f = Character.toLowerCase(c10);
        this.g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final l0.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.d = c10;
        this.e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.a = this.i.getResources().getString(i10);
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final l0.a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.h = this.i.getDrawable(i10);
        c();
        return this;
    }

    @Override // l0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.d = c10;
        this.e = KeyEvent.normalizeMetaState(i10);
        this.f = Character.toLowerCase(c11);
        this.g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
