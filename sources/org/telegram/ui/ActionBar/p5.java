package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p5 extends t0 {
    public boolean A0;
    public p0 B0;
    public boolean C0;
    public boolean D0;
    public final o5 z0;

    public p5(Context context, o5 o5Var, int i10, int i11, boolean z10, p6 p6Var) {
        super(context, null, i10, i11, z10, p6Var);
        this.C0 = true;
        this.D0 = true;
        this.z0 = o5Var;
        setDelegate(new m5(o5Var));
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void E() {
        p0 p0Var = this.B0;
        if (p0Var != null) {
            p0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void F(boolean z10) {
        this.z0.a.w(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final t0 J(p0 p0Var) {
        this.B0 = p0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final t0 M() {
        N();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final t0 N() {
        this.A0 = true;
        this.z0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void P(CharSequence charSequence, boolean z10) {
        this.z0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final boolean T(boolean z10) {
        i5 i5Var = this.z0.a;
        if (!i5Var.F) {
            return i5Var.w(z10, true);
        }
        i5Var.j(z10);
        return false;
    }

    public final void X() {
        if (this.C0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.C0;
        o5 o5Var = this.z0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                o5Var.f = true;
                o5Var.requestLayout();
                return;
            } else {
                if (!z10 || getVisibility() == 0) {
                    return;
                }
                super.setVisibility(0);
                return;
            }
        }
        this.C0 = z10;
        if (z10) {
            setEnabled(this.D0);
        } else {
            this.D0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !o5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !o5Var.a.t()) {
            o5Var.f = true;
        }
        o5Var.requestLayout();
    }

    public o5 getParentMenu() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public EditTextBoldCursor getSearchField() {
        return this.z0.a.getSearchField();
    }

    public p0 getSearchListener() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public s5 getSubMenuOverlay() {
        return this.z0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public b5 getSubMenuOverlayHost() {
        return this.z0.a;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final boolean i() {
        o5 o5Var = this.z0;
        return !o5Var.b || o5Var.a.s();
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final void n() {
        this.z0.a.setSearchFieldText("");
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.z0.a.setSearchFieldCaption(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public void setSearchFieldHint(CharSequence charSequence) {
        this.z0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        o5 o5Var = this.z0;
        if (o5Var == null || i10 == 4) {
            super.setVisibility(i10);
            return;
        }
        boolean z10 = false;
        boolean z11 = i10 == 0;
        i5 i5Var = o5Var.a;
        if (o5Var.isLaidOut() && i5Var.t() && (!o5Var.b || (i5Var.s() && i5Var.getActionModeFactor() > 0.0f))) {
            z10 = true;
        }
        Y(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final boolean u() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final boolean v() {
        return this.z0.a.F;
    }

    @Override // org.telegram.ui.ActionBar.t0
    public final boolean w() {
        return this.z0.a.F;
    }
}
