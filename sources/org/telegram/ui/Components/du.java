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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class du extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public org.telegram.ui.ActionBar.r1 H;
    public final int I;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean K;
    public boolean L;
    public final m2.b M;
    public boolean N;
    public float O;
    public boolean P;
    public boolean Q;
    public int R;
    public final yt a;
    public final ge b;
    public final yl0 c;
    public zt d;
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

    public du(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.po poVar) {
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
        yt ytVar = this.a;
        if (i15 == i10 && this.E == z4) {
            if (b()) {
                if (ytVar.isFocused() && i10 > 0) {
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
        boolean z13 = ytVar.isFocused() && i10 > 0;
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
        return this instanceof org.telegram.ui.d40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            zt ztVar = this.d;
            if (ztVar != null) {
                ztVar.M.f1();
            }
            yt ytVar = this.a;
            if (ytVar != null) {
                int currentTextColor = ytVar.getCurrentTextColor();
                ytVar.setTextColor(-1);
                ytVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        zt ztVar = this.d;
        if (ztVar != null && ztVar.Z0 != UserConfig.selectedAccount) {
            this.f.removeView(ztVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.I;
        zt ztVar2 = new zt(this, this.h, this.F, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.J, this.P);
        this.d = ztVar2;
        ztVar2.c = this.R;
        ztVar2.R0 = this.N;
        ztVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new bu(this));
        this.f.addView(this.d);
    }

    public vt getEditText() {
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

    public kz getEmojiView() {
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
        zt ztVar;
        if (!this.e && (ztVar = this.d) != null && ztVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.w = 0;
        boolean z4 = this.x;
        this.x = false;
        if (z4) {
            zt ztVar2 = this.d;
            if (ztVar2 != null) {
                ztVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.e) {
            x(0);
        }
        if (z4) {
            zt ztVar = this.d;
            if (ztVar == null || ztVar.getVisibility() != 0 || this.K) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.O = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new ih.b(this, measuredHeight, 3));
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
            zt ztVar2 = this.d;
            if (ztVar2 != null) {
                ztVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        zt ztVar = this.d;
        return ztVar != null && ztVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.y = true;
        zt ztVar = this.d;
        if (ztVar != null) {
            ztVar.D();
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
            yt ytVar = this.a;
            ytVar.requestFocus();
            AndroidUtilities.showKeyboard(ytVar);
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
        zt ztVar = this.d;
        if (ztVar != null) {
            ztVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        yt ytVar = this.a;
        ytVar.setEnabled(z4);
        this.b.setVisibility(z4 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.I == 0 ? 11.0f : 8.0f);
        if (z4) {
            ytVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            ytVar.setPadding(0, 0, 0, dp);
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
        yt ytVar = this.a;
        int inputType = ytVar.getInputType();
        int i10 = !z4 ? 524288 | inputType : (-524289) & inputType;
        if (ytVar.getInputType() != i10) {
            ytVar.setInputType(i10);
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
        yt ytVar = this.a;
        ytVar.requestFocus();
        AndroidUtilities.showKeyboard(ytVar);
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
        yl0 yl0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.I == 0) {
                    yl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    yl0Var.a(R.drawable.input_smile, true);
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
        zt ztVar = this.d;
        if (ztVar != null) {
            ztVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.O = 1.0f;
        zt ztVar2 = this.d;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ztVar2.getLayoutParams();
        layoutParams.height = i11;
        ztVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            this.w = i11;
            qv0Var2.requestLayout();
            yl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.O = 1.0f;
        c(0.0f);
    }

    public du(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = true;
        this.M = new m2.b(this, 18);
        this.R = 2;
        this.F = z4;
        this.J = f6Var;
        this.I = i10;
        this.h = p2Var;
        this.f = qv0Var;
        qv0Var.r.add(this);
        yt ytVar = new yt(this, context, f6Var, i10);
        this.a = ytVar;
        ytVar.setImeOptions(TLObject.FLAG_28);
        ytVar.setInputType(ytVar.getInputType() | 16384);
        ytVar.setFocusable(ytVar.isEnabled());
        ytVar.setCursorSize(AndroidUtilities.dp(20.0f));
        ytVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        ytVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            ytVar.setBackground(null);
            ytVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            ytVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
            ytVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(ytVar, k7.b6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            ytVar.setTextSize(1, 16.0f);
            ytVar.setMaxLines(8);
            ytVar.setGravity(19);
            ytVar.setAllowTextEntitiesIntersection(true);
            ytVar.setHintTextColor(-1929379841);
            ytVar.setTextColor(-1);
            ytVar.setCursorColor(-1);
            ytVar.setBackground(null);
            ytVar.setClipToPadding(false);
            ytVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            ytVar.setHandlesColor(-1);
            ytVar.setHighlightColor(822083583);
            ytVar.setLinkTextColor(-12147733);
            ytVar.quoteColor = -1;
            ytVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity(19);
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            ytVar.setBackground(null);
            ytVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ytVar.setTextSize(1, 18.0f);
            ytVar.setMaxLines(4);
            ytVar.setGravity(19);
            ytVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            ytVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            ytVar.setBackground(null);
            ytVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(ytVar, k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        yl0 yl0Var = new yl0(context);
        this.c = yl0Var;
        geVar.setImageDrawable(yl0Var);
        if (i10 == 0) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.b6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            yl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            yl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        geVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, -1));
        geVar.setOnClickListener(new dg.p(this, qv0Var, f6Var, 24));
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

    public void setDelegate(cu cuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, zt ztVar) {
    }

    public void q(int i10, int i11) {
    }
}
