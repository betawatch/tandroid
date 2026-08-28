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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ut extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, wu0 {
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public org.telegram.ui.ActionBar.q1 G;
    public final int H;
    public final org.telegram.ui.ActionBar.b6 I;
    public boolean J;
    public boolean K;
    public final m.i3 L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;
    public final pt a;
    public final ge b;
    public final bl0 c;
    public qt d;
    public boolean e;
    public xu0 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public ut(Context context, org.telegram.ui.ed edVar, org.telegram.ui.ho hoVar) {
        this(context, edVar, hoVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        boolean z11;
        int i10;
        if (i9 > AndroidUtilities.dp(50.0f) && ((this.v || (i10 = this.H) == 2 || i10 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z10) {
                this.s = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i9;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            int i11 = (z10 ? this.s : this.r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
            if (this.x) {
                i11 = Math.min(AndroidUtilities.dp(200.0f) + i11, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.d.setLayoutParams(layoutParams);
                xu0 xu0Var = this.f;
                if (xu0Var != null) {
                    this.w = layoutParams.height;
                    xu0Var.requestLayout();
                    this.f.getHeight();
                    if (this.P != this.x) {
                        p();
                    }
                }
            }
        }
        this.P = this.x;
        int i14 = this.C;
        pt ptVar = this.a;
        if (i14 == i9 && this.D == z10) {
            if (b()) {
                if (ptVar.isFocused() && i9 > 0) {
                    z12 = true;
                }
                this.v = z12;
            }
            this.f.getHeight();
            return;
        }
        this.C = i9;
        this.D = z10;
        boolean z13 = this.v;
        boolean z14 = ptVar.isFocused() && i9 > 0;
        this.v = z14;
        if (z14 && this.e) {
            x(0);
        }
        if (this.w != 0 && !(z11 = this.v) && z11 != z13 && !this.e) {
            this.w = 0;
            this.f.requestLayout();
        }
        if (this.v && this.J) {
            this.J = false;
            AndroidUtilities.cancelRunOnUIThread(this.L);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i9 = this.H;
        return i9 == 2 || i9 == 3 || i9 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.o30;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            qt qtVar = this.d;
            if (qtVar != null) {
                qtVar.L.f1();
            }
            pt ptVar = this.a;
            if (ptVar != null) {
                int currentTextColor = ptVar.getCurrentTextColor();
                ptVar.setTextColor(-1);
                ptVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        qt qtVar = this.d;
        if (qtVar != null && qtVar.Y0 != UserConfig.selectedAccount) {
            this.f.removeView(qtVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i9 = this.H;
        qt qtVar2 = new qt(this, this.h, this.E, context, b10, (i9 == 2 || i9 == 3 || i9 == 5) ? false : true, this.I, this.O);
        this.d = qtVar2;
        qtVar2.c = this.Q;
        qtVar2.Q0 = this.M;
        qtVar2.setVisibility(8);
        this.N = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new st(this));
        this.f.addView(this.d);
    }

    public mt getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.w;
    }

    public float getEmojiPaddingShown() {
        return this.N;
    }

    public wy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = AndroidUtilities.displaySize;
        int i9 = (point.x > point.y ? this.s : this.r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
        return this.x ? Math.min(AndroidUtilities.dp(200.0f) + i9, AndroidUtilities.displaySize.y) : i9;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return k5.g();
    }

    public final void j() {
        qt qtVar;
        if (!this.e && (qtVar = this.d) != null && qtVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.N = 0.0f;
        }
        this.w = 0;
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            qt qtVar2 = this.d;
            if (qtVar2 != null) {
                qtVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            qt qtVar = this.d;
            if (qtVar == null || qtVar.getVisibility() != 0 || this.J) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.N = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new dh.b(this, measuredHeight, 3));
                this.K = true;
                ofFloat.addListener(new org.telegram.ui.xp(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.x;
        this.x = false;
        if (z11) {
            qt qtVar2 = this.d;
            if (qtVar2 != null) {
                qtVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        qt qtVar = this.d;
        return qtVar != null && qtVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.y = true;
        qt qtVar = this.d;
        if (qtVar != null) {
            qtVar.D();
        }
        xu0 xu0Var = this.f;
        if (xu0Var != null) {
            xu0Var.r.remove(this);
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
        this.A = true;
        d();
    }

    public final void s() {
        this.A = false;
        if (this.B) {
            this.B = false;
            pt ptVar = this.a;
            ptVar.requestFocus();
            AndroidUtilities.showKeyboard(ptVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.J = true;
            u();
            m.i3 i3Var = this.L;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            AndroidUtilities.runOnUIThread(i3Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.G = q1Var;
    }

    public void setEmojiViewCacheType(int i9) {
        this.Q = i9;
        qt qtVar = this.d;
        if (qtVar != null) {
            qtVar.c = i9;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        pt ptVar = this.a;
        ptVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.H == 0 ? 11.0f : 8.0f);
        if (z10) {
            ptVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            ptVar.setPadding(0, 0, 0, dp);
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

    public void setMaxLines(int i9) {
        this.a.setMaxLines(i9);
    }

    public void setSelection(int i9) {
        this.a.setSelection(i9);
    }

    public void setSizeNotifierLayout(xu0 xu0Var) {
        xu0 xu0Var2 = this.f;
        if (xu0Var2 != null) {
            xu0Var2.r.remove(this);
        }
        this.f = xu0Var;
        xu0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        pt ptVar = this.a;
        int inputType = ptVar.getInputType();
        int i9 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (ptVar.getInputType() != i9) {
            ptVar.setInputType(i9);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i9) {
        return true;
    }

    public final void v() {
        u();
        x((AndroidUtilities.usingHardwareInput || this.A) ? 0 : 2);
        pt ptVar = this.a;
        ptVar.requestFocus();
        AndroidUtilities.showKeyboard(ptVar);
        if (this.A) {
            this.B = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.J = true;
        m.i3 i3Var = this.L;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 100L);
    }

    public final void w(int i9, int i10) {
        this.a.setSelection(i9, i10);
    }

    public void x(int i9) {
        bl0 bl0Var = this.c;
        if (i9 != 1) {
            if (this.b != null) {
                if (this.H == 0) {
                    bl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    bl0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    this.d.setVisibility(8);
                    this.N = 0.0f;
                }
            }
            xu0 xu0Var = this.f;
            if (xu0Var != null) {
                if (i9 == 0) {
                    this.w = 0;
                    this.N = 0.0f;
                }
                xu0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        qt qtVar = this.d;
        if (qtVar != null) {
            qtVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.N = 1.0f;
        qt qtVar2 = this.d;
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
        int i10 = (point.x > point.y ? this.s : this.r) + (this.F ? AndroidUtilities.navigationBarHeight : 0);
        if (this.x) {
            i10 = Math.min(AndroidUtilities.dp(200.0f) + i10, AndroidUtilities.displaySize.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qtVar2.getLayoutParams();
        layoutParams.height = i10;
        qtVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        xu0 xu0Var2 = this.f;
        if (xu0Var2 != null) {
            this.w = i10;
            xu0Var2.requestLayout();
            bl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.N = 1.0f;
        c(0.0f);
    }

    public ut(Context context, xu0 xu0Var, org.telegram.ui.ActionBar.o2 o2Var, int i9, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = true;
        this.L = new m.i3(this, 16);
        this.Q = 2;
        this.E = z10;
        this.I = b6Var;
        this.H = i9;
        this.h = o2Var;
        this.f = xu0Var;
        xu0Var.r.add(this);
        pt ptVar = new pt(this, context, b6Var, i9);
        this.a = ptVar;
        ptVar.setImeOptions(TLObject.FLAG_28);
        ptVar.setInputType(ptVar.getInputType() | 16384);
        ptVar.setFocusable(ptVar.isEnabled());
        ptVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ptVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        ptVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (i9 == 0) {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            ptVar.setBackground(null);
            ptVar.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            ptVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vf, b6Var));
            ptVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(ptVar, g7.e6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i9 == 2 || i9 == 3) {
            ptVar.setTextSize(1, 16.0f);
            ptVar.setMaxLines(8);
            ptVar.setGravity(19);
            ptVar.setAllowTextEntitiesIntersection(true);
            ptVar.setHintTextColor(-1929379841);
            ptVar.setTextColor(-1);
            ptVar.setCursorColor(-1);
            ptVar.setBackground(null);
            ptVar.setClipToPadding(false);
            ptVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            ptVar.setHandlesColor(-1);
            ptVar.setHighlightColor(822083583);
            ptVar.setLinkTextColor(-12147733);
            ptVar.quoteColor = -1;
            ptVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i9 == 4) {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity(19);
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
            ptVar.setBackground(null);
            ptVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ptVar.setTextSize(1, 18.0f);
            ptVar.setMaxLines(4);
            ptVar.setGravity(19);
            ptVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.t5, b6Var));
            ptVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, b6Var));
            ptVar.setBackground(null);
            ptVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ptVar, g7.e6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bl0 bl0Var = new bl0(context);
        this.c = bl0Var;
        geVar.setImageDrawable(bl0Var);
        if (i9 == 0) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i9 == 2 || i9 == 3) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i9 == 4) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i9 == 5) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f7, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            bl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xd, b6Var), PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(geVar, g7.e6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, -1));
        geVar.setOnClickListener(new fg.f(this, xu0Var, b6Var, 26));
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

    public void setDelegate(tt ttVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, qt qtVar) {
    }

    public void q(int i9, int i10) {
    }
}
