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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class qu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, nw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.g6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.u5 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final lu a;
    public final ig.k b;
    public final rm0 c;
    public mu d;
    public boolean e;
    public ow0 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public qu(Context context, org.telegram.ui.id idVar, org.telegram.ui.ko koVar) {
        this(context, idVar, koVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.nw0
    public final void G(int i10, boolean z10) {
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
                ow0 ow0Var = this.f;
                if (ow0Var != null) {
                    this.w = layoutParams.height;
                    ow0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.x) {
                        p();
                    }
                }
            }
        }
        this.T = this.x;
        int i15 = this.G;
        lu luVar = this.a;
        if (i15 == i10 && this.H == z10) {
            if (b()) {
                if (luVar.isFocused() && i10 > 0) {
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
        boolean z14 = luVar.isFocused() && i10 > 0;
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
        return this instanceof org.telegram.ui.s30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mu muVar = this.d;
            if (muVar != null) {
                muVar.P.g1();
            }
            lu luVar = this.a;
            if (luVar != null) {
                int currentTextColor = luVar.getCurrentTextColor();
                luVar.setTextColor(-1);
                luVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        mu muVar = this.d;
        if (muVar != null && muVar.c1 != UserConfig.selectedAccount) {
            this.f.removeView(muVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        mu muVar2 = new mu(this, this.h, this.I, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.M, this.S);
        this.d = muVar2;
        muVar2.c = this.U;
        muVar2.U0 = this.Q;
        muVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ou(this));
        this.f.addView(this.d);
    }

    public iu getEditText() {
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

    public tz getEmojiView() {
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
        return r5.g();
    }

    public final void j() {
        mu muVar;
        if (!this.e && (muVar = this.d) != null && muVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.w = 0;
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.u(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            mu muVar = this.d;
            if (muVar == null || muVar.getVisibility() != 0 || this.N) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.r2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new org.telegram.ui.pq(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.x;
        this.x = false;
        if (z11) {
            mu muVar2 = this.d;
            if (muVar2 != null) {
                muVar2.u(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        mu muVar = this.d;
        return muVar != null && muVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.y = true;
        mu muVar = this.d;
        if (muVar != null && (observersGroup = muVar.O2) != null) {
            observersGroup.removeAllObservers();
            muVar.O2 = null;
        }
        ow0 ow0Var = this.f;
        if (ow0Var != null) {
            ow0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
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
            lu luVar = this.a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.N = true;
            u();
            org.telegram.ui.Cells.u5 u5Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        mu muVar = this.d;
        if (muVar != null) {
            muVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        lu luVar = this.a;
        luVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.L == 0 ? 11.0f : 8.0f);
        if (z10) {
            luVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            luVar.setPadding(0, 0, 0, dp);
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

    public void setSizeNotifierLayout(ow0 ow0Var) {
        ow0 ow0Var2 = this.f;
        if (ow0Var2 != null) {
            ow0Var2.r.remove(this);
        }
        this.f = ow0Var;
        ow0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        lu luVar = this.a;
        int inputType = luVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (luVar.getInputType() != i10) {
            luVar.setInputType(i10);
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
        lu luVar = this.a;
        luVar.requestFocus();
        AndroidUtilities.showKeyboard(luVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.N = true;
        org.telegram.ui.Cells.u5 u5Var = this.P;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        AndroidUtilities.runOnUIThread(u5Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        rm0 rm0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    rm0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    rm0Var.a(R.drawable.input_smile, true);
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
            ow0 ow0Var = this.f;
            if (ow0Var != null) {
                if (i10 == 0) {
                    this.w = 0;
                    this.R = 0.0f;
                }
                ow0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        mu muVar = this.d;
        if (muVar != null) {
            muVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.R = 1.0f;
        mu muVar2 = this.d;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) muVar2.getLayoutParams();
        layoutParams.height = i11;
        muVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        ow0 ow0Var2 = this.f;
        if (ow0Var2 != null) {
            this.w = i11;
            ow0Var2.requestLayout();
            rm0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public qu(Context context, ow0 ow0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.u5(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = g6Var;
        this.L = i10;
        this.h = o2Var;
        this.f = ow0Var;
        ow0Var.r.add(this);
        lu luVar = new lu(this, context, g6Var, i10);
        this.a = luVar;
        luVar.setImeOptions(TLObject.FLAG_28);
        luVar.setInputType(luVar.getInputType() | 16384);
        luVar.setFocusable(luVar.isEnabled());
        luVar.setCursorSize(AndroidUtilities.dp(20.0f));
        luVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(luVar, 30, i11, g6Var);
        if (i10 == 0) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            luVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.H(luVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, g6Var);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.H6, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, i11, g6Var);
            org.telegram.ui.ActionBar.r6.m(luVar, 36, org.telegram.ui.ActionBar.k6.vf, g6Var);
            luVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(luVar, w7.z5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            luVar.setTextSize(1, 16.0f);
            luVar.setMaxLines(8);
            luVar.setGravity(19);
            luVar.setAllowTextEntitiesIntersection(true);
            luVar.setHintTextColor(-1929379841);
            luVar.setTextColor(-1);
            luVar.setCursorColor(-1);
            luVar.setBackground(null);
            luVar.setClipToPadding(false);
            luVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            luVar.setHandlesColor(-1);
            luVar.setHighlightColor(822083583);
            luVar.setLinkTextColor(-12147733);
            luVar.quoteColor = -1;
            luVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, org.telegram.ui.ActionBar.k6.j5, g6Var);
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            luVar.setTextSize(1, 18.0f);
            luVar.setMaxLines(4);
            luVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.F(luVar, org.telegram.ui.ActionBar.k6.t5, g6Var);
            org.telegram.ui.ActionBar.r6.W(luVar, org.telegram.ui.ActionBar.k6.j5, g6Var);
            luVar.setBackground(null);
            luVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(luVar, w7.z5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ig.k kVar = new ig.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rm0 rm0Var = new rm0(context);
        this.c = rm0Var;
        kVar.setImageDrawable(rm0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            rm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.f7, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.z(this, rm0Var, org.telegram.ui.ActionBar.k6.Xd, g6Var, PorterDuff.Mode.MULTIPLY);
            rm0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.z5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        kVar.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(kVar, g02, null, O, g6Var);
        kVar.setOnClickListener(new ai.v0(this, ow0Var, g6Var, 24));
        kVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void p() {
    }

    public void setDelegate(pu puVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, mu muVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i10, int i11) {
    }
}
