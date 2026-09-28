package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.InputFilter;
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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public class lu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, bw0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.o1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.d6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.t6 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final gu a;
    public final hg.l b;
    public final dm0 c;
    public hu d;
    public boolean e;
    public cw0 f;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public lu(Context context, org.telegram.ui.hd hdVar, org.telegram.ui.ro roVar) {
        this(context, hdVar, roVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.bw0
    public final void H(int i10, boolean z10) {
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
                cw0 cw0Var = this.f;
                if (cw0Var != null) {
                    this.w = layoutParams.height;
                    cw0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.x) {
                        p();
                    }
                }
            }
        }
        this.T = this.x;
        int i15 = this.G;
        gu guVar = this.a;
        if (i15 == i10 && this.H == z10) {
            if (b()) {
                if (guVar.isFocused() && i10 > 0) {
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
        boolean z14 = guVar.isFocused() && i10 > 0;
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
        return this instanceof org.telegram.ui.d40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            hu huVar = this.d;
            if (huVar != null) {
                huVar.P.f1();
            }
            gu guVar = this.a;
            if (guVar != null) {
                int currentTextColor = guVar.getCurrentTextColor();
                guVar.setTextColor(-1);
                guVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        hu huVar = this.d;
        if (huVar != null && huVar.c1 != UserConfig.selectedAccount) {
            this.f.removeView(huVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        hu huVar2 = new hu(this, this.h, this.I, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.M, this.S);
        this.d = huVar2;
        huVar2.c = this.U;
        huVar2.U0 = this.Q;
        huVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ju(this));
        this.f.addView(this.d);
    }

    public du getEditText() {
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

    public mz getEmojiView() {
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
        return q5.g();
    }

    public final void j() {
        hu huVar;
        if (!this.e && (huVar = this.d) != null && huVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.w = 0;
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            hu huVar2 = this.d;
            if (huVar2 != null) {
                huVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            hu huVar = this.d;
            if (huVar == null || huVar.getVisibility() != 0 || this.N) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new r8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.x;
        this.x = false;
        if (z11) {
            hu huVar2 = this.d;
            if (huVar2 != null) {
                huVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        hu huVar = this.d;
        return huVar != null && huVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.y = true;
        hu huVar = this.d;
        if (huVar != null && (observersGroup = huVar.I2) != null) {
            observersGroup.removeAllObservers();
            huVar.I2 = null;
        }
        cw0 cw0Var = this.f;
        if (cw0Var != null) {
            cw0Var.r.remove(this);
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
            gu guVar = this.a;
            guVar.requestFocus();
            AndroidUtilities.showKeyboard(guVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.N = true;
            u();
            org.telegram.ui.Cells.t6 t6Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            AndroidUtilities.runOnUIThread(t6Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.o1 o1Var) {
        this.K = o1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        hu huVar = this.d;
        if (huVar != null) {
            huVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        gu guVar = this.a;
        guVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.L == 0 ? 11.0f : 8.0f);
        if (z10) {
            guVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            guVar.setPadding(0, 0, 0, dp);
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

    public void setSizeNotifierLayout(cw0 cw0Var) {
        cw0 cw0Var2 = this.f;
        if (cw0Var2 != null) {
            cw0Var2.r.remove(this);
        }
        this.f = cw0Var;
        cw0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        gu guVar = this.a;
        int inputType = guVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (guVar.getInputType() != i10) {
            guVar.setInputType(i10);
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
        gu guVar = this.a;
        guVar.requestFocus();
        AndroidUtilities.showKeyboard(guVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.N = true;
        org.telegram.ui.Cells.t6 t6Var = this.P;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        dm0 dm0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    dm0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    dm0Var.a(R.drawable.input_smile, true);
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
            cw0 cw0Var = this.f;
            if (cw0Var != null) {
                if (i10 == 0) {
                    this.w = 0;
                    this.R = 0.0f;
                }
                cw0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        hu huVar = this.d;
        if (huVar != null) {
            huVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.R = 1.0f;
        hu huVar2 = this.d;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) huVar2.getLayoutParams();
        layoutParams.height = i11;
        huVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        cw0 cw0Var2 = this.f;
        if (cw0Var2 != null) {
            this.w = i11;
            cw0Var2.requestLayout();
            dm0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public lu(Context context, cw0 cw0Var, org.telegram.ui.ActionBar.m2 m2Var, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.t6(this, 10);
        this.U = 2;
        this.I = z10;
        this.M = d6Var;
        this.L = i10;
        this.h = m2Var;
        this.f = cw0Var;
        cw0Var.r.add(this);
        gu guVar = new gu(this, context, d6Var, i10);
        this.a = guVar;
        guVar.setImeOptions(TLObject.FLAG_28);
        guVar.setInputType(guVar.getInputType() | 16384);
        guVar.setFocusable(guVar.isEnabled());
        guVar.setCursorSize(AndroidUtilities.dp(20.0f));
        guVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        guVar.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (i10 == 0) {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            guVar.setBackground(null);
            guVar.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            guVar.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.vf, d6Var));
            guVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(guVar, w7.y5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            guVar.setTextSize(1, 16.0f);
            guVar.setMaxLines(8);
            guVar.setGravity(19);
            guVar.setAllowTextEntitiesIntersection(true);
            guVar.setHintTextColor(-1929379841);
            guVar.setTextColor(-1);
            guVar.setCursorColor(-1);
            guVar.setBackground(null);
            guVar.setClipToPadding(false);
            guVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            guVar.setHandlesColor(-1);
            guVar.setHighlightColor(822083583);
            guVar.setLinkTextColor(-12147733);
            guVar.quoteColor = -1;
            guVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity(19);
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t5, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, d6Var));
            guVar.setBackground(null);
            guVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            guVar.setTextSize(1, 18.0f);
            guVar.setMaxLines(4);
            guVar.setGravity(19);
            guVar.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.t5, d6Var));
            guVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, d6Var));
            guVar.setBackground(null);
            guVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(guVar, w7.y5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.l lVar = new hg.l(this, context);
        this.b = lVar;
        lVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        dm0 dm0Var = new dm0(context);
        this.c = dm0Var;
        lVar.setImageDrawable(dm0Var);
        if (i10 == 0) {
            dm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            dm0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(lVar, w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            dm0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            dm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            dm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            dm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            dm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f7, d6Var), PorterDuff.Mode.MULTIPLY));
            dm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            dm0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xd, d6Var), PorterDuff.Mode.MULTIPLY));
            dm0Var.a(R.drawable.input_smile, false);
            addView(lVar, w7.y5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        lVar.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, -1));
        lVar.setOnClickListener(new ai.d0(this, cw0Var, d6Var, 21));
        lVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(ku kuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, hu huVar) {
    }

    public void q(int i10, int i11) {
    }
}
