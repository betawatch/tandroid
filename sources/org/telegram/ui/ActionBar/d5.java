package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d5 extends q0 {
    public final c5 A0;
    public boolean B0;
    public m0 C0;
    public boolean D0;
    public boolean E0;

    public d5(Context context, c5 c5Var, int i7, int i10, boolean z10, e6 e6Var) {
        super(context, null, i7, i10, z10, e6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = c5Var;
        setDelegate(new a5(c5Var));
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
        this.A0.a.y(z10, true);
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
        w4 w4Var = this.A0.a;
        if (!w4Var.G) {
            return w4Var.y(z10, true);
        }
        w4Var.m(z10);
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
        c5 c5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                c5Var.f = true;
                c5Var.requestLayout();
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
        } else if (!z11 || !isLaidOut() || !c5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !c5Var.a.w()) {
            c5Var.f = true;
        }
        c5Var.requestLayout();
    }

    public c5 getParentMenu() {
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
    public g5 getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public q4 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public final boolean j() {
        c5 c5Var = this.A0;
        return !c5Var.b || c5Var.a.v();
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
        c5 c5Var = this.A0;
        if (c5Var == null || i7 == 4) {
            super.setVisibility(i7);
            return;
        }
        boolean z10 = false;
        boolean z11 = i7 == 0;
        w4 w4Var = c5Var.a;
        if (c5Var.isLaidOut() && w4Var.w() && (!c5Var.b || (w4Var.v() && w4Var.getActionModeFactor() > 0.0f))) {
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
