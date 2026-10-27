package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ru extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.q1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.u6 M;
    public boolean N;
    public boolean O;
    public final m.g3 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final mu a;
    public final jg.l b;
    public final vm0 c;
    public nu d;
    public boolean e;
    public ww0 f;
    public final org.telegram.ui.ActionBar.r2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public ru(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.oo ooVar) {
        this(context, jdVar, ooVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.vw0
    public final void I(int i10, boolean z10) {
        boolean z11;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i11 = this.L) == 2 || i11 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            int i12 = (z10 ? this.s : this.r) + (this.J ? AndroidUtilities.navigationBarHeight : 0);
            if (this.x) {
                i12 = Math.min(AndroidUtilities.dp(200.0f) + i12, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = AndroidUtilities.displaySize.x;
            if (i13 != i14 || layoutParams.height != i12) {
                layoutParams.width = i14;
                layoutParams.height = i12;
                this.d.setLayoutParams(layoutParams);
                ww0 ww0Var = this.f;
                if (ww0Var != null) {
                    this.w = layoutParams.height;
                    ww0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.x) {
                        p();
                    }
                }
            }
        }
        this.T = this.x;
        int i15 = this.G;
        mu muVar = this.a;
        if (i15 == i10 && this.H == z10) {
            if (b()) {
                if (muVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z13 = this.v;
        boolean z14 = muVar.isFocused() && i10 > 0;
        this.v = z14;
        if (z14 && this.e) {
            x(0);
        }
        if (this.w != 0 && !(z11 = this.v) && z11 != z13 && !this.e) {
            this.w = 0;
            this.f.requestLayout();
        }
        if (this.v && this.N) {
            this.N = false;
            AndroidUtilities.cancelRunOnUIThread(this.P);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        return i10 == 2 || i10 == 3 || i10 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.w30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            nu nuVar = this.d;
            if (nuVar != null) {
                nuVar.P.g1();
            }
            mu muVar = this.a;
            if (muVar != null) {
                int currentTextColor = muVar.getCurrentTextColor();
                muVar.setTextColor(-1);
                muVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        nu nuVar = this.d;
        if (nuVar != null && nuVar.c1 != UserConfig.selectedAccount) {
            this.f.removeView(nuVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        nu nuVar2 = new nu(this, this.h, this.I, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.M, this.S);
        this.d = nuVar2;
        nuVar2.c = this.U;
        nuVar2.U0 = this.Q;
        nuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pu(this));
        this.f.addView(this.d);
    }

    public ju getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.w;
    }

    public float getEmojiPaddingShown() {
        return this.R;
    }

    public sz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = AndroidUtilities.displaySize;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.J ? AndroidUtilities.navigationBarHeight : 0);
        return this.x ? Math.min(AndroidUtilities.dp(200.0f) + i10, AndroidUtilities.displaySize.y) : i10;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return t5.g();
    }

    public final void j() {
        nu nuVar;
        if (!this.e && (nuVar = this.d) != null && nuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.w = 0;
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            nu nuVar2 = this.d;
            if (nuVar2 != null) {
                nuVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            nu nuVar = this.d;
            if (nuVar == null || nuVar.getVisibility() != 0 || this.N) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.sp(this, 23));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.x;
        this.x = false;
        if (z11) {
            nu nuVar2 = this.d;
            if (nuVar2 != null) {
                nuVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        nu nuVar = this.d;
        return nuVar != null && nuVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.y = true;
        nu nuVar = this.d;
        if (nuVar != null) {
            nuVar.C();
        }
        ww0 ww0Var = this.f;
        if (ww0Var != null) {
            ww0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            mu muVar = this.a;
            muVar.requestFocus();
            AndroidUtilities.showKeyboard(muVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.N = true;
            u();
            m.g3 g3Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            AndroidUtilities.runOnUIThread(g3Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.K = q1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        nu nuVar = this.d;
        if (nuVar != null) {
            nuVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        mu muVar = this.a;
        muVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.L == 0 ? 11.0f : 8.0f);
        if (z10) {
            muVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            muVar.setPadding(0, 0, 0, dp);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override // android.view.View
    public void setFocusable(boolean z10) {
        this.a.setFocusable(z10);
    }

    public void setHint(CharSequence charSequence) {
        this.a.setHint(charSequence);
    }

    public void setMaxLines(int i10) {
        this.a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.a.setSelection(i10);
    }

    public void setSizeNotifierLayout(ww0 ww0Var) {
        ww0 ww0Var2 = this.f;
        if (ww0Var2 != null) {
            ww0Var2.r.remove(this);
        }
        this.f = ww0Var;
        ww0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        mu muVar = this.a;
        int inputType = muVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (muVar.getInputType() != i10) {
            muVar.setInputType(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i10) {
        return true;
    }

    public final void v() {
        u();
        x((AndroidUtilities.usingHardwareInput || this.E) ? 0 : 2);
        mu muVar = this.a;
        muVar.requestFocus();
        AndroidUtilities.showKeyboard(muVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.N = true;
        m.g3 g3Var = this.P;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        AndroidUtilities.runOnUIThread(g3Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        vm0 vm0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    vm0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    vm0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    this.d.setVisibility(8);
                    this.R = 0.0f;
                }
            }
            ww0 ww0Var = this.f;
            if (ww0Var != null) {
                if (i10 == 0) {
                    this.w = 0;
                    this.R = 0.0f;
                }
                ww0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        nu nuVar = this.d;
        if (nuVar != null) {
            nuVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.R = 1.0f;
        nu nuVar2 = this.d;
        if (this.r <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.r = AndroidUtilities.dp(150.0f);
            } else {
                this.r = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.s <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.s = AndroidUtilities.dp(150.0f);
            } else {
                this.s = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int i11 = (point.x > point.y ? this.s : this.r) + (this.J ? AndroidUtilities.navigationBarHeight : 0);
        if (this.x) {
            i11 = Math.min(AndroidUtilities.dp(200.0f) + i11, AndroidUtilities.displaySize.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nuVar2.getLayoutParams();
        layoutParams.height = i11;
        nuVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        ww0 ww0Var2 = this.f;
        if (ww0Var2 != null) {
            this.w = i11;
            ww0Var2.requestLayout();
            vm0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public ru(Context context, ww0 ww0Var, org.telegram.ui.ActionBar.r2 r2Var, int i10, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.E = true;
        this.P = new m.g3(this, 14);
        this.U = 2;
        this.I = z10;
        this.M = u6Var;
        this.L = i10;
        this.h = r2Var;
        this.f = ww0Var;
        ww0Var.r.add(this);
        mu muVar = new mu(this, context, u6Var, i10);
        this.a = muVar;
        muVar.setImeOptions(TLObject.FLAG_28);
        muVar.setInputType(muVar.getInputType() | 16384);
        muVar.setFocusable(muVar.isEnabled());
        muVar.setCursorSize(AndroidUtilities.dp(20.0f));
        muVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(muVar, 30, i11, u6Var);
        if (i10 == 0) {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            muVar.setBackground(null);
            org.telegram.ui.ActionBar.f7.G(muVar, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, u6Var);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.H6, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, i11, u6Var);
            org.telegram.ui.ActionBar.f7.m(muVar, 36, org.telegram.ui.ActionBar.y6.vf, u6Var);
            muVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(muVar, kb1.h(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            muVar.setTextSize(1, 16.0f);
            muVar.setMaxLines(8);
            muVar.setGravity(19);
            muVar.setAllowTextEntitiesIntersection(true);
            muVar.setHintTextColor(-1929379841);
            muVar.setTextColor(-1);
            muVar.setCursorColor(-1);
            muVar.setBackground(null);
            muVar.setClipToPadding(false);
            muVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            muVar.setHandlesColor(-1);
            muVar.setHighlightColor(822083583);
            muVar.setLinkTextColor(-12147733);
            muVar.quoteColor = -1;
            muVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(muVar, kb1.h(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity(19);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.t5, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, org.telegram.ui.ActionBar.y6.j5, u6Var);
            muVar.setBackground(null);
            muVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(muVar, kb1.h(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            muVar.setTextSize(1, 18.0f);
            muVar.setMaxLines(4);
            muVar.setGravity(19);
            org.telegram.ui.ActionBar.f7.E(muVar, org.telegram.ui.ActionBar.y6.t5, u6Var);
            org.telegram.ui.ActionBar.f7.V(muVar, org.telegram.ui.ActionBar.y6.j5, u6Var);
            muVar.setBackground(null);
            muVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(muVar, kb1.h(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        jg.l lVar = new jg.l(this, context);
        this.b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        vm0 vm0Var = new vm0(context);
        this.c = vm0Var;
        lVar.setImageDrawable(vm0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f7.y(this, vm0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            vm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, kb1.h(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            vm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, kb1.h(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.f7.y(this, vm0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, kb1.h(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.f7.y(this, vm0Var, org.telegram.ui.ActionBar.y6.f7, u6Var, PorterDuff.Mode.MULTIPLY);
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, kb1.h(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.f7.y(this, vm0Var, org.telegram.ui.ActionBar.y6.Xd, u6Var, PorterDuff.Mode.MULTIPLY);
            vm0Var.a(R.drawable.input_smile, false);
            addView(lVar, kb1.h(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        lVar.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(lVar, g02, null, N, u6Var);
        lVar.setOnClickListener(new bi.w0(this, ww0Var, u6Var, 24));
        lVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void c(float f7) {
    }

    public void setDelegate(qu quVar) {
    }

    public void g(Canvas canvas, nu nuVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
