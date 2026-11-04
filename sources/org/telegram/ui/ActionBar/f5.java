package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f5 extends q0 {
    public final e5 A0;
    public boolean B0;
    public m0 C0;
    public boolean D0;
    public boolean E0;

    public f5(Context context, e5 e5Var, int i3, int i10, boolean z10, e6 e6Var) {
        super(context, null, i3, i10, z10, e6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = e5Var;
        setDelegate(new c5(e5Var));
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void E() {
        m0 m0Var = this.C0;
        if (m0Var != null) {
            m0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void F(boolean z10) {
        this.A0.a.v(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 J(m0 m0Var) {
        this.C0 = m0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 M() {
        N();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final q0 N() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void P(CharSequence charSequence, boolean z10) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean T(boolean z10) {
        y4 y4Var = this.A0.a;
        if (!y4Var.G) {
            return y4Var.v(z10, true);
        }
        y4Var.j(z10);
        return false;
    }

    public final void X() {
        if (this.D0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.D0;
        e5 e5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                e5Var.f = true;
                e5Var.requestLayout();
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
        } else if (!z11 || !isLaidOut() || !e5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !e5Var.a.t()) {
            e5Var.f = true;
        }
        e5Var.requestLayout();
    }

    public e5 getParentMenu() {
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
    public i5 getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public s4 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean i() {
        e5 e5Var = this.A0;
        return !e5Var.b || e5Var.a.s();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final void n() {
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
    public void setVisibility(int i3) {
        e5 e5Var = this.A0;
        if (e5Var == null || i3 == 4) {
            super.setVisibility(i3);
            return;
        }
        boolean z10 = false;
        boolean z11 = i3 == 0;
        y4 y4Var = e5Var.a;
        if (e5Var.isLaidOut() && y4Var.t() && (!e5Var.b || (y4Var.s() && y4Var.getActionModeFactor() > 0.0f))) {
            z10 = true;
        }
        Y(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean u() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean v() {
        return this.A0.a.G;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean w() {
        return this.A0.a.G;
    }
}
