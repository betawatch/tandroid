package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f5 extends r0 {
    public boolean A0;
    public n0 B0;
    public boolean C0;
    public boolean D0;
    public final e5 z0;

    public f5(Context context, e5 e5Var, int i7, int i10, boolean z9, f6 f6Var) {
        super(context, null, i7, i10, z9, f6Var);
        this.C0 = true;
        this.D0 = true;
        this.z0 = e5Var;
        setDelegate(new c5(e5Var));
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void E() {
        n0 n0Var = this.B0;
        if (n0Var != null) {
            n0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void F(boolean z9) {
        this.z0.a.v(z9, true);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 J(n0 n0Var) {
        this.B0 = n0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 M() {
        N();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 N() {
        this.A0 = true;
        this.z0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void P(CharSequence charSequence, boolean z9) {
        this.z0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean T(boolean z9) {
        y4 y4Var = this.z0.a;
        if (!y4Var.F) {
            return y4Var.v(z9, true);
        }
        y4Var.j(z9);
        return false;
    }

    public final void X() {
        if (this.C0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Y(boolean z9, boolean z10) {
        boolean z11 = this.C0;
        e5 e5Var = this.z0;
        if (z11 == z9) {
            if (!z9 && !z10 && getVisibility() != 8) {
                super.setVisibility(8);
                e5Var.f = true;
                e5Var.requestLayout();
                return;
            } else {
                if (!z9 || getVisibility() == 0) {
                    return;
                }
                super.setVisibility(0);
                return;
            }
        }
        this.C0 = z9;
        if (z9) {
            setEnabled(this.D0);
        } else {
            this.D0 = isEnabled();
            setEnabled(false);
        }
        if (z9) {
            super.setVisibility(0);
        } else if (!z10 || !isLaidOut() || !e5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z10 || !e5Var.a.t()) {
            e5Var.f = true;
        }
        e5Var.requestLayout();
    }

    public e5 getParentMenu() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public EditTextBoldCursor getSearchField() {
        return this.z0.a.getSearchField();
    }

    public n0 getSearchListener() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public i5 getSubMenuOverlay() {
        return this.z0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public s4 getSubMenuOverlayHost() {
        return this.z0.a;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean i() {
        e5 e5Var = this.z0;
        return !e5Var.b || e5Var.a.s();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void n() {
        this.z0.a.setSearchFieldText("");
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.z0.a.setSearchFieldCaption(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void setSearchFieldHint(CharSequence charSequence) {
        this.z0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        e5 e5Var = this.z0;
        if (e5Var == null || i7 == 4) {
            super.setVisibility(i7);
            return;
        }
        boolean z9 = false;
        boolean z10 = i7 == 0;
        y4 y4Var = e5Var.a;
        if (e5Var.isLaidOut() && y4Var.t() && (!e5Var.b || (y4Var.s() && y4Var.getActionModeFactor() > 0.0f))) {
            z9 = true;
        }
        Y(z10, z9);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean u() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean v() {
        return this.z0.a.F;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean w() {
        return this.z0.a.F;
    }
}
