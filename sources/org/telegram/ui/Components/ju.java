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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class ju extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, pv0 {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.q1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.f6 M;
    public boolean N;
    public boolean O;
    public final org.telegram.ui.Cells.l7 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final eu a;
    public final hg.k b;
    public final rl0 c;
    public fu d;
    public boolean e;
    public qv0 f;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public ju(Context context, org.telegram.ui.jd jdVar, org.telegram.ui.wo woVar) {
        this(context, jdVar, woVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.pv0
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
                qv0 qv0Var = this.f;
                if (qv0Var != null) {
                    this.w = layoutParams.height;
                    qv0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.x) {
                        p();
                    }
                }
            }
        }
        this.T = this.x;
        int i15 = this.G;
        eu euVar = this.a;
        if (i15 == i10 && this.H == z10) {
            if (b()) {
                if (euVar.isFocused() && i10 > 0) {
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
        boolean z14 = euVar.isFocused() && i10 > 0;
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
        return this instanceof org.telegram.ui.k40;
    }

    public final void d() {
        AndroidUtilities.hideKeyboard(this.a);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            fu fuVar = this.d;
            if (fuVar != null) {
                fuVar.P.g1();
            }
            eu euVar = this.a;
            if (euVar != null) {
                int currentTextColor = euVar.getCurrentTextColor();
                euVar.setTextColor(-1);
                euVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        fu fuVar = this.d;
        if (fuVar != null && fuVar.c1 != UserConfig.selectedAccount) {
            this.f.removeView(fuVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        fu fuVar2 = new fu(this, this.h, this.I, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.M, this.S);
        this.d = fuVar2;
        fuVar2.c = this.U;
        fuVar2.U0 = this.Q;
        fuVar2.setVisibility(8);
        this.R = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new hu(this));
        this.f.addView(this.d);
    }

    public bu getEditText() {
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

    public kz getEmojiView() {
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
        return o5.g();
    }

    public final void j() {
        fu fuVar;
        if (!this.e && (fuVar = this.d) != null && fuVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.w = 0;
        boolean z10 = this.x;
        this.x = false;
        if (z10) {
            fu fuVar2 = this.d;
            if (fuVar2 != null) {
                fuVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            fu fuVar = this.d;
            if (fuVar == null || fuVar.getVisibility() != 0 || this.N) {
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
                ofFloat.addListener(new p8(this, 16));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.x;
        this.x = false;
        if (z11) {
            fu fuVar2 = this.d;
            if (fuVar2 != null) {
                fuVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        fu fuVar = this.d;
        return fuVar != null && fuVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        NotificationCenter.ObserversGroup observersGroup;
        this.y = true;
        fu fuVar = this.d;
        if (fuVar != null && (observersGroup = fuVar.I2) != null) {
            observersGroup.removeAllObservers();
            fuVar.I2 = null;
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
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            eu euVar = this.a;
            euVar.requestFocus();
            AndroidUtilities.showKeyboard(euVar);
            if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.N = true;
            u();
            org.telegram.ui.Cells.l7 l7Var = this.P;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.q1 q1Var) {
        this.K = q1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        fu fuVar = this.d;
        if (fuVar != null) {
            fuVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        eu euVar = this.a;
        euVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int dp = AndroidUtilities.dp(this.L == 0 ? 11.0f : 8.0f);
        if (z10) {
            euVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), dp);
        } else {
            euVar.setPadding(0, 0, 0, dp);
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

    public void setSizeNotifierLayout(qv0 qv0Var) {
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            qv0Var2.r.remove(this);
        }
        this.f = qv0Var;
        qv0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        eu euVar = this.a;
        int inputType = euVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (euVar.getInputType() != i10) {
            euVar.setInputType(i10);
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
        eu euVar = this.a;
        euVar.requestFocus();
        AndroidUtilities.showKeyboard(euVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.v || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.N = true;
        org.telegram.ui.Cells.l7 l7Var = this.P;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        rl0 rl0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    rl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    rl0Var.a(R.drawable.input_smile, true);
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
            qv0 qv0Var = this.f;
            if (qv0Var != null) {
                if (i10 == 0) {
                    this.w = 0;
                    this.R = 0.0f;
                }
                qv0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        fu fuVar = this.d;
        if (fuVar != null) {
            fuVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.R = 1.0f;
        fu fuVar2 = this.d;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fuVar2.getLayoutParams();
        layoutParams.height = i11;
        fuVar2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.a);
        }
        qv0 qv0Var2 = this.f;
        if (qv0Var2 != null) {
            this.w = i11;
            qv0Var2.requestLayout();
            rl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public ju(Context context, qv0 qv0Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new org.telegram.ui.Cells.l7(this, 9);
        this.U = 2;
        this.I = z10;
        this.M = f6Var;
        this.L = i10;
        this.h = o2Var;
        this.f = qv0Var;
        qv0Var.r.add(this);
        eu euVar = new eu(this, context, f6Var, i10);
        this.a = euVar;
        euVar.setImeOptions(TLObject.FLAG_28);
        euVar.setInputType(euVar.getInputType() | 16384);
        euVar.setFocusable(euVar.isEnabled());
        euVar.setCursorSize(AndroidUtilities.dp(20.0f));
        euVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        euVar.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (i10 == 0) {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            euVar.setBackground(null);
            euVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            euVar.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
            euVar.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z11 = LocaleController.isRTL;
            addView(euVar, w7.x5.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            euVar.setTextSize(1, 16.0f);
            euVar.setMaxLines(8);
            euVar.setGravity(19);
            euVar.setAllowTextEntitiesIntersection(true);
            euVar.setHintTextColor(-1929379841);
            euVar.setTextColor(-1);
            euVar.setCursorColor(-1);
            euVar.setBackground(null);
            euVar.setClipToPadding(false);
            euVar.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            euVar.setHandlesColor(-1);
            euVar.setHighlightColor(822083583);
            euVar.setLinkTextColor(-12147733);
            euVar.quoteColor = -1;
            euVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity(19);
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            euVar.setTextSize(1, 18.0f);
            euVar.setMaxLines(4);
            euVar.setGravity(19);
            euVar.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t5, f6Var));
            euVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
            euVar.setBackground(null);
            euVar.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(euVar, w7.x5.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        hg.k kVar = new hg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        rl0 rl0Var = new rl0(context);
        this.c = rl0Var;
        kVar.setImageDrawable(rl0Var);
        if (i10 == 0) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f7, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            rl0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xd, f6Var), PorterDuff.Mode.MULTIPLY));
            rl0Var.a(R.drawable.input_smile, false);
            addView(kVar, w7.x5.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        kVar.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, -1));
        kVar.setOnClickListener(new ai.d0(this, qv0Var, f6Var, 21));
        kVar.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void c(float f7) {
    }

    public void e() {
    }

    public void i(Menu menu) {
    }

    public void p() {
    }

    public void setDelegate(iu iuVar) {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, fu fuVar) {
    }

    public void q(int i10, int i11) {
    }
}
