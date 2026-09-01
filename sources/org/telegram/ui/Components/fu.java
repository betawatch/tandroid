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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class fu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.r1 H;
    public final int I;
    public final org.telegram.ui.ActionBar.g6 J;
    public boolean K;
    public boolean L;
    public final m2.b M;
    public boolean N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public final au a;
    public final ge b;
    public final zl0 c;
    public bu d;
    public boolean e;
    public qv0 f;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public fu(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.po poVar) {
        this(context, jdVar, poVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        boolean z10;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && ((this.v || (i11 = this.I) == 2 || i11 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z4) {
                this.s = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z11 = false;
        if (this.e) {
            int i12 = (z4 ? this.s : this.r) + (this.G ? AndroidUtilities.navigationBarHeight : 0);
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
                qv0 qv0Var = this.f;
                if (qv0Var != null) {
                    this.w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f.getHeight();
                    if (this.Q != this.x) {
                        p();
                    }
                }
            }
        }
        this.Q = this.x;
        int i15 = this.D;
        au auVar = this.a;
        if (i15 == i10 && this.E == z4) {
            if (b()) {
                if (auVar.isFocused() && i10 > 0) {
                    z11 = true;
                }
                this.v = z11;
            }
            this.f.getHeight();
            return;
        }
        this.D = i10;
        this.E = z4;
        boolean z12 = this.v;
        boolean z13 = auVar.isFocused() && i10 > 0;
        this.v = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.w != 0 && !(z10 = this.v) && z10 != z12 && !this.e) {
            this.w = 0;
            this.f.requestLayout();
        }
        if (this.v && this.K) {
            this.K = false;
            AndroidUtilities.cancelRunOnUIThread(this.M);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i10 = this.I;
        return i10 == 2 || i10 == 3 || i10 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.e40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bu buVar = this.d;
            if (buVar != null) {
                buVar.M.f1();
            }
            au auVar = this.a;
            if (auVar != null) {
                int currentTextColor = auVar.getCurrentTextColor();
                auVar.setTextColor(-1);
                auVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        bu buVar = this.d;
        if (buVar != null && buVar.Z0 != UserConfig.selectedAccount) {
            this.f.removeView(buVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.I;
        bu buVar2 = new bu(this, this.h, this.F, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.J, this.P);
        this.d = buVar2;
        buVar2.c = this.R;
        buVar2.R0 = this.N;
        buVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new du(this));
        this.f.addView(this.d);
    }

    public xt getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.w;
    }

    public float getEmojiPaddingShown() {
        return this.O;
    }

    public mz getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = AndroidUtilities.displaySize;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.G ? AndroidUtilities.navigationBarHeight : 0);
        return this.x ? Math.min(AndroidUtilities.dp(200.0f) + i10, AndroidUtilities.displaySize.y) : i10;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return l5.g();
    }

    public final void j() {
        bu buVar;
        if (!this.e && (buVar = this.d) != null && buVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.w = 0;
        boolean z4 = this.x;
        this.x = false;
        if (z4) {
            bu buVar2 = this.d;
            if (buVar2 != null) {
                buVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.e) {
            x(0);
        }
        if (z4) {
            bu buVar = this.d;
            if (buVar == null || buVar.getVisibility() != 0 || this.K) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.O = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new jh.b(this, measuredHeight, 3));
                this.L = true;
                ofFloat.addListener(new a9(this, 15));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                ofFloat.start();
            }
        }
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            bu buVar2 = this.d;
            if (buVar2 != null) {
                buVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        bu buVar = this.d;
        return buVar != null && buVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.y = true;
        bu buVar = this.d;
        if (buVar != null) {
            buVar.D();
        }
        qv0 qv0Var = this.f;
        if (qv0Var != null) {
            qv0Var.r.remove(this);
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
        this.B = true;
        d();
    }

    public final void s() {
        this.B = false;
        if (this.C) {
            this.C = false;
            au auVar = this.a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.K = true;
            u();
            m2.b bVar = this.M;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.r1 r1Var) {
        this.H = r1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.R = i10;
        bu buVar = this.d;
        if (buVar != null) {
            buVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        au auVar = this.a;
        auVar.setEnabled(z4);
        this.b.setVisibility(z4 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.I == 0 ? 11.0f : 8.0f);
        if (z4) {
            auVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            auVar.setPadding(0, 0, 0, dp);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override // android.view.View
    public void setFocusable(boolean z4) {
        this.a.setFocusable(z4);
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

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            qv0Var2.r.remove(this);
        }
        this.f = qv0Var;
        qv0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z4) {
        au auVar = this.a;
        int inputType = auVar.getInputType();
        int i10 = !z4 ? 524288 | inputType : (-524289) & inputType;
        if (auVar.getInputType() != i10) {
            auVar.setInputType(i10);
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
        x((AndroidUtilities.usingHardwareInput || this.B) ? 0 : 2);
        au auVar = this.a;
        auVar.requestFocus();
        AndroidUtilities.showKeyboard(auVar);
        if (this.B) {
            this.C = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.K = true;
        m2.b bVar = this.M;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        zl0 zl0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.I == 0) {
                    zl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    zl0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    this.d.setVisibility(8);
                    this.O = 0.0f;
                }
            }
            qv0 qv0Var = this.f;
            if (qv0Var != null) {
                if (i10 == 0) {
                    this.w = 0;
                    this.O = 0.0f;
                }
                qv0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        bu buVar = this.d;
        if (buVar != null) {
            buVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.O = 1.0f;
        bu buVar2 = this.d;
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
        int i11 = (point.x > point.y ? this.s : this.r) + (this.G ? AndroidUtilities.navigationBarHeight : 0);
        if (this.x) {
            i11 = Math.min(AndroidUtilities.dp(200.0f) + i11, AndroidUtilities.displaySize.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) buVar2.getLayoutParams();
        layoutParams.height = i11;
        buVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            this.w = i11;
            qv0Var2.requestLayout();
            zl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.O = 1.0f;
        c(0.0f);
    }

    public fu(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.B = true;
        this.M = new m2.b(this, 18);
        this.R = 2;
        this.F = z4;
        this.J = g6Var;
        this.I = i10;
        this.h = p2Var;
        this.f = qv0Var;
        qv0Var.r.add(this);
        au auVar = new au(this, context, g6Var, i10);
        this.a = auVar;
        auVar.setImeOptions(TLObject.FLAG_28);
        auVar.setInputType(auVar.getInputType() | 16384);
        auVar.setFocusable(auVar.isEnabled());
        auVar.setCursorSize(AndroidUtilities.dp(20.0f));
        auVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        auVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (i10 == 0) {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            auVar.setBackground(null);
            auVar.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.k6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.l6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p7, g6Var));
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            auVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.vf, g6Var));
            auVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(auVar, k7.c6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            auVar.setTextSize(1, 16.0f);
            auVar.setMaxLines(8);
            auVar.setGravity(19);
            auVar.setAllowTextEntitiesIntersection(true);
            auVar.setHintTextColor(-1929379841);
            auVar.setTextColor(-1);
            auVar.setCursorColor(-1);
            auVar.setBackground(null);
            auVar.setClipToPadding(false);
            auVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            auVar.setHandlesColor(-1);
            auVar.setHighlightColor(822083583);
            auVar.setLinkTextColor(-12147733);
            auVar.quoteColor = -1;
            auVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity(19);
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t5, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
            auVar.setBackground(null);
            auVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            auVar.setTextSize(1, 18.0f);
            auVar.setMaxLines(4);
            auVar.setGravity(19);
            auVar.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t5, g6Var));
            auVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
            auVar.setBackground(null);
            auVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(auVar, k7.c6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        zl0 zl0Var = new zl0(context);
        this.c = zl0Var;
        geVar.setImageDrawable(zl0Var);
        if (i10 == 0) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.c6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f7, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            zl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xd, g6Var), PorterDuff.Mode.MULTIPLY));
            zl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.c6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 1, -1));
        geVar.setOnClickListener(new eg.o(this, qv0Var, g6Var, 24));
        geVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f10) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(eu euVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, bu buVar) {
    }

    public void q(int i10, int i11) {
    }
}
