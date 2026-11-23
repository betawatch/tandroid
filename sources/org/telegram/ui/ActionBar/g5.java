package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g5 extends q0 {
    public final f5 A0;
    public boolean B0;
    public m0 C0;
    public boolean D0;
    public boolean E0;

    public g5(Context context, f5 f5Var, int i7, int i10, boolean z10, h6 h6Var) {
        super(context, null, i7, i10, z10, h6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = f5Var;
        setDelegate(new d5(f5Var));
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void F() {
        m0 m0Var = this.C0;
        if (m0Var != null) {
            m0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void G(boolean z10) {
        this.A0.a.B(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 K(m0 m0Var) {
        this.C0 = m0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 N() {
        O();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 O() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void Q(CharSequence charSequence, boolean z10) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean U(boolean z10) {
        z4 z4Var = this.A0.a;
        if (!z4Var.G) {
            return z4Var.B(z10, true);
        }
        z4Var.o(z10);
        return false;
    }

    public final void Y() {
        if (this.D0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Z(boolean z10, boolean z11) {
        boolean z12 = this.D0;
        f5 f5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                f5Var.f = true;
                f5Var.requestLayout();
                return;
            } else {
                if (!z10 || getVisibility() == 0) {
                    return;
                }
                super.setVisibility(0);
                return;
            }
        }
        this.D0 = z10;
        if (z10) {
            setEnabled(this.E0);
        } else {
            this.E0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !f5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !f5Var.a.y()) {
            f5Var.f = true;
        }
        f5Var.requestLayout();
    }

    public f5 getParentMenu() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public m0 getSearchListener() {
        return this.C0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public j5 getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public t4 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean j() {
        f5 f5Var = this.A0;
        return !f5Var.b || f5Var.a.x();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void o() {
        this.A0.a.setSearchFieldText("");
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.a.setSearchFieldCaption(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        f5 f5Var = this.A0;
        if (f5Var == null || i7 == 4) {
            super.setVisibility(i7);
            return;
        }
        boolean z10 = false;
        boolean z11 = i7 == 0;
        z4 z4Var = f5Var.a;
        if (f5Var.isLaidOut() && z4Var.y() && (!f5Var.b || (z4Var.x() && z4Var.getActionModeFactor() > 0.0f))) {
            z10 = true;
        }
        Z(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean v() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean w() {
        return this.A0.a.G;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean x() {
        return this.A0.a.G;
    }
}
