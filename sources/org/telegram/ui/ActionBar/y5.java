package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y5 extends w0 {
    public boolean A0;
    public boolean B0;
    public final x5 x0;
    public boolean y0;
    public s0 z0;

    public y5(Context context, x5 x5Var, int i10, int i11, boolean z10, u6 u6Var) {
        super(context, null, i10, i11, z10, u6Var);
        this.A0 = true;
        this.B0 = true;
        this.x0 = x5Var;
        setDelegate(new v5(x5Var));
    }

    private z5 getShownOverlay() {
        z5 openMenuOverlay = this.x0.a.getOpenMenuOverlay();
        if (openMenuOverlay == null || openMenuOverlay.b != this) {
            return null;
        }
        if (openMenuOverlay.n || openMenuOverlay.H) {
            return openMenuOverlay;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void E() {
        s0 s0Var = this.z0;
        if (s0Var != null) {
            s0Var.k(getSearchField());
        }
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void F(boolean z10) {
        this.x0.a.r(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final w0 J(s0 s0Var) {
        this.z0 = s0Var;
        return this;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final w0 M() {
        N();
        return this;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final w0 N() {
        this.y0 = true;
        this.x0.a.setSearchItem(this);
        return this;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void P(CharSequence charSequence, boolean z10) {
        this.x0.a.setSearchFieldText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final boolean T(boolean z10) {
        r5 r5Var = this.x0.a;
        if (!r5Var.F) {
            return r5Var.r(z10, true);
        }
        r5Var.f(z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void U(View view, View view2) {
        boolean z10;
        x5 x5Var = this.x0;
        z5 menuOverlay = x5Var.a.getMenuOverlay();
        eh.d dVar = null;
        if (menuOverlay == null) {
            super.U(null, null);
            return;
        }
        y();
        if (s()) {
            boolean z11 = x5Var.b;
            r5 r5Var = x5Var.a;
            if (!z11 || r5Var.o()) {
                if (menuOverlay.b == this && (((z10 = menuOverlay.n) || menuOverlay.H) && z10)) {
                    menuOverlay.a(true);
                    return;
                }
                this.T = false;
                t0 t0Var = this.Q;
                if (t0Var != null) {
                    t0Var.b();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                if (menuOverlay.n && menuOverlay.b == this) {
                    return;
                }
                y5 y5Var = menuOverlay.b;
                if (y5Var != null && y5Var != this) {
                    menuOverlay.d();
                }
                menuOverlay.a = r5Var;
                menuOverlay.b = this;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = menuOverlay.c;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != popupLayout) {
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                        AndroidUtilities.removeFromParent(actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    menuOverlay.c = popupLayout;
                }
                popupLayout.setBackgroundDrawable(null);
                popupLayout.setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
                popupLayout.setTranslationX(0.0f);
                popupLayout.setTranslationY(0.0f);
                popupLayout.setAlpha(1.0f);
                f7.e0(popupLayout, false);
                l80.U(popupLayout, y6.o1(0.06f, y6.w0(y6.E8, menuOverlay.a.a)));
                popupLayout.f();
                if (popupLayout.getSwipeBack() != null) {
                    popupLayout.getSwipeBack().b(false);
                }
                ScrollView scrollView = popupLayout.K;
                if (scrollView != null) {
                    scrollView.scrollTo(0, 0);
                }
                if (popupLayout.getParent() != menuOverlay) {
                    AndroidUtilities.removeFromParent(popupLayout);
                    menuOverlay.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                }
                if (menuOverlay.d == null || menuOverlay.e != r5Var) {
                    ch.b bVar = r5Var.L;
                    if (bVar != null) {
                        dVar = bVar.c(menuOverlay, null, false);
                        dVar.v(r5Var.M);
                        wh.s(dVar, AndroidUtilities.dp(23.0f), 6.0f);
                    }
                    menuOverlay.d = dVar;
                    menuOverlay.e = r5Var;
                }
                ViewParent parent = menuOverlay.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).bringChildToFront(menuOverlay);
                }
                menuOverlay.setVisibility(0);
                menuOverlay.n = true;
                menuOverlay.v = SystemClock.uptimeMillis();
                menuOverlay.y = Math.max(menuOverlay.E, menuOverlay.F);
                menuOverlay.x = 0L;
                menuOverlay.H = true;
                menuOverlay.invalidate();
                r5Var.O = menuOverlay;
                r5Var.P = this;
                r5Var.invalidate();
                menuOverlay.c();
                if (!menuOverlay.r) {
                    getIconView().setAlpha(0.0f);
                }
                menuOverlay.setFocusableInTouchMode(true);
                menuOverlay.requestFocus();
            }
        }
    }

    public final void X() {
        if (this.A0) {
            return;
        }
        super.setVisibility(8);
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.A0;
        x5 x5Var = this.x0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                x5Var.f = true;
                x5Var.requestLayout();
                return;
            } else {
                if (!z10 || getVisibility() == 0) {
                    return;
                }
                super.setVisibility(0);
                return;
            }
        }
        this.A0 = z10;
        if (z10) {
            setEnabled(this.B0);
        } else {
            this.B0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !x5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !x5Var.a.p()) {
            x5Var.f = true;
        }
        x5Var.requestLayout();
    }

    public x5 getParentMenu() {
        return this.x0;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public EditTextBoldCursor getSearchField() {
        return this.x0.a.getSearchField();
    }

    public s0 getSearchListener() {
        return this.z0;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void n() {
        this.x0.a.setSearchFieldText("");
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void o() {
        z5 shownOverlay = getShownOverlay();
        if (shownOverlay != null) {
            shownOverlay.a(true);
        } else {
            super.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final void q() {
        z5 shownOverlay = getShownOverlay();
        if (shownOverlay != null) {
            shownOverlay.a(true);
        } else {
            super.q();
        }
    }

    @Override // org.telegram.ui.ActionBar.w0
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.x0.a.setSearchFieldCaption(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public void setSearchFieldHint(CharSequence charSequence) {
        this.x0.a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        x5 x5Var = this.x0;
        if (x5Var == null || i10 == 4) {
            super.setVisibility(i10);
            return;
        }
        boolean z10 = false;
        boolean z11 = i10 == 0;
        r5 r5Var = x5Var.a;
        if (x5Var.isLaidOut() && r5Var.p() && (!x5Var.b || (r5Var.o() && r5Var.getActionModeFactor() > 0.0f))) {
            z10 = true;
        }
        Y(z11, z10);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final boolean u() {
        return this.y0;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final boolean v() {
        return this.x0.a.F;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final boolean w() {
        return this.x0.a.F;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final boolean x() {
        z5 shownOverlay = getShownOverlay();
        return shownOverlay != null ? shownOverlay.n : super.x();
    }
}
