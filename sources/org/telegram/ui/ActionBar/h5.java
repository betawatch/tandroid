package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h5 extends r0 {
    public final g5 A0;
    public boolean B0;
    public n0 C0;
    public boolean D0;
    public boolean E0;

    public h5(Context context, g5 g5Var, int i7, int i10, boolean z10, i6 i6Var) {
        super(context, null, i7, i10, z10, i6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = g5Var;
        setDelegate(new e5(g5Var));
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void F() {
        n0 n0Var = this.C0;
        if (n0Var != null) {
            n0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void G(boolean z10) {
        this.A0.a.B(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 K(n0 n0Var) {
        this.C0 = n0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 N() {
        O();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final r0 O() {
        this.B0 = true;
        this.A0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void Q(CharSequence charSequence, boolean z10) {
        this.A0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean U(boolean z10) {
        a5 a5Var = this.A0.a;
        if (!a5Var.G) {
            return a5Var.B(z10, true);
        }
        a5Var.o(z10);
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
        g5 g5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                g5Var.f = true;
                g5Var.requestLayout();
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
        } else if (!z11 || !isLaidOut() || !g5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !g5Var.a.y()) {
            g5Var.f = true;
        }
        g5Var.requestLayout();
    }

    public g5 getParentMenu() {
        return this.A0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public EditTextBoldCursor getSearchField() {
        return this.A0.a.getSearchField();
    }

    public n0 getSearchListener() {
        return this.C0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public k5 getSubMenuOverlay() {
        return this.A0.a.getMenuOverlay();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public u4 getSubMenuOverlayHost() {
        return this.A0.a;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean j() {
        g5 g5Var = this.A0;
        return !g5Var.b || g5Var.a.x();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final void o() {
        this.A0.a.setSearchFieldText("");
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.a.setSearchFieldCaption(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        g5 g5Var = this.A0;
        if (g5Var == null || i7 == 4) {
            super.setVisibility(i7);
            return;
        }
        boolean z10 = false;
        boolean z11 = i7 == 0;
        a5 a5Var = g5Var.a;
        if (g5Var.isLaidOut() && a5Var.y() && (!g5Var.b || (a5Var.x() && a5Var.getActionModeFactor() > 0.0f))) {
            z10 = true;
        }
        Z(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean v() {
        return this.B0;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean w() {
        return this.A0.a.G;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public final boolean x() {
        return this.A0.a.G;
    }
}
