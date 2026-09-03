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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class cu extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
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
    public final xt a;
    public final ge b;
    public final xl0 c;
    public yt d;
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

    public cu(Context context, org.telegram.ui.ld ldVar, org.telegram.ui.ro roVar) {
        this(context, ldVar, roVar, 0, false, null);
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
        xt xtVar = this.a;
        if (i15 == i10 && this.E == z4) {
            if (b()) {
                if (xtVar.isFocused() && i10 > 0) {
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
        boolean z13 = xtVar.isFocused() && i10 > 0;
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
        return this instanceof org.telegram.ui.f40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            yt ytVar = this.d;
            if (ytVar != null) {
                ytVar.M.e1();
            }
            xt xtVar = this.a;
            if (xtVar != null) {
                int currentTextColor = xtVar.getCurrentTextColor();
                xtVar.setTextColor(-1);
                xtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        yt ytVar = this.d;
        if (ytVar != null && ytVar.Z0 != UserConfig.selectedAccount) {
            this.f.removeView(ytVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.I;
        yt ytVar2 = new yt(this, this.h, this.F, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.J, this.P);
        this.d = ytVar2;
        ytVar2.c = this.R;
        ytVar2.R0 = this.N;
        ytVar2.setVisibility(8);
        this.O = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new au(this));
        this.f.addView(this.d);
    }

    public ut getEditText() {
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
        yt ytVar;
        if (!this.e && (ytVar = this.d) != null && ytVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.O = 0.0f;
        }
        this.w = 0;
        boolean z4 = this.x;
        this.x = false;
        if (z4) {
            yt ytVar2 = this.d;
            if (ytVar2 != null) {
                ytVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z4) {
        if (this.e) {
            x(0);
        }
        if (z4) {
            yt ytVar = this.d;
            if (ytVar == null || ytVar.getVisibility() != 0 || this.K) {
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
            yt ytVar2 = this.d;
            if (ytVar2 != null) {
                ytVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        yt ytVar = this.d;
        return ytVar != null && ytVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.y = true;
        yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.D();
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
            xt xtVar = this.a;
            xtVar.requestFocus();
            AndroidUtilities.showKeyboard(xtVar);
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
        yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        xt xtVar = this.a;
        xtVar.setEnabled(z4);
        this.b.setVisibility(z4 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.I == 0 ? 11.0f : 8.0f);
        if (z4) {
            xtVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            xtVar.setPadding(0, 0, 0, dp);
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
        xt xtVar = this.a;
        int inputType = xtVar.getInputType();
        int i10 = !z4 ? 524288 | inputType : (-524289) & inputType;
        if (xtVar.getInputType() != i10) {
            xtVar.setInputType(i10);
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
        xt xtVar = this.a;
        xtVar.requestFocus();
        AndroidUtilities.showKeyboard(xtVar);
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
        xl0 xl0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.I == 0) {
                    xl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    xl0Var.a(R.drawable.input_smile, true);
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
        yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.O = 1.0f;
        yt ytVar2 = this.d;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ytVar2.getLayoutParams();
        layoutParams.height = i11;
        ytVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            this.w = i11;
            qv0Var2.requestLayout();
            xl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.O = 1.0f;
        c(0.0f);
    }

    public cu(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
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
        xt xtVar = new xt(this, context, f6Var, i10);
        this.a = xtVar;
        xtVar.setImeOptions(TLObject.FLAG_28);
        xtVar.setInputType(xtVar.getInputType() | 16384);
        xtVar.setFocusable(xtVar.isEnabled());
        xtVar.setCursorSize(AndroidUtilities.dp(20.0f));
        xtVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        xtVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            xtVar.setBackground(null);
            xtVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            xtVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
            xtVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z10 = LocaleController.isRTL;
            addView(xtVar, k7.b6.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            xtVar.setTextSize(1, 16.0f);
            xtVar.setMaxLines(8);
            xtVar.setGravity(19);
            xtVar.setAllowTextEntitiesIntersection(true);
            xtVar.setHintTextColor(-1929379841);
            xtVar.setTextColor(-1);
            xtVar.setCursorColor(-1);
            xtVar.setBackground(null);
            xtVar.setClipToPadding(false);
            xtVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            xtVar.setHandlesColor(-1);
            xtVar.setHighlightColor(822083583);
            xtVar.setLinkTextColor(-12147733);
            xtVar.quoteColor = -1;
            xtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity(19);
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            xtVar.setBackground(null);
            xtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            xtVar.setTextSize(1, 18.0f);
            xtVar.setMaxLines(4);
            xtVar.setGravity(19);
            xtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            xtVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            xtVar.setBackground(null);
            xtVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(xtVar, k7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ge geVar = new ge(this, context);
        this.b = geVar;
        geVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xl0 xl0Var = new xl0(context);
        this.c = xl0Var;
        geVar.setImageDrawable(xl0Var);
        if (i10 == 0) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(geVar, k7.b6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
            addView(geVar, k7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            xl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            xl0Var.a(R.drawable.input_smile, false);
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

    public void setDelegate(bu buVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, yt ytVar) {
    }

    public void q(int i10, int i11) {
    }
}
