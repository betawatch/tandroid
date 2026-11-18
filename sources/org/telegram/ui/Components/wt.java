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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class wt extends FrameLayout implements org.telegram.messenger.fs, zt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.j1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.i6 N;
    public boolean O;
    public boolean P;
    public final gk Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final rt a;
    public final kg.k b;
    public final kk0 c;
    public st d;
    public boolean e;
    public au0 f;
    public final org.telegram.ui.ActionBar.h2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public wt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.rn rnVar) {
        this(context, wcVar, rnVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.w || (i10 = this.M) == 2 || i10 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.s = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            int i11 = (z10 ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
            if (this.y) {
                i11 = Math.min(org.telegram.messenger.g0.L(200.0f) + i11, org.telegram.messenger.g0.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = org.telegram.messenger.g0.q.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.d.setLayoutParams(layoutParams);
                au0 au0Var = this.f;
                if (au0Var != null) {
                    this.x = layoutParams.height;
                    au0Var.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i14 = this.H;
        rt rtVar = this.a;
        if (i14 == i7 && this.I == z10) {
            if (b()) {
                if (rtVar.isFocused() && i7 > 0) {
                    z12 = true;
                }
                this.w = z12;
            }
            this.f.getHeight();
            return;
        }
        this.H = i7;
        this.I = z10;
        boolean z13 = this.w;
        boolean z14 = rtVar.isFocused() && i7 > 0;
        this.w = z14;
        if (z14 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z11 = this.w) && z11 != z13 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.O) {
            this.O = false;
            org.telegram.messenger.g0.r(this.Q);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i7 = this.M;
        return i7 == 2 || i7 == 3 || i7 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.k20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.k4) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.Q.g1();
            }
            rt rtVar = this.a;
            if (rtVar != null) {
                int currentTextColor = rtVar.getCurrentTextColor();
                rtVar.setTextColor(-1);
                rtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        st stVar = this.d;
        if (stVar != null && stVar.d1 != org.telegram.messenger.j10.t0) {
            this.f.removeView(stVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.M;
        st stVar2 = new st(this, this.h, this.J, context, b10, (i7 == 2 || i7 == 3 || i7 == 5) ? false : true, this.N, this.T);
        this.d = stVar2;
        stVar2.c = this.V;
        stVar2.V0 = this.R;
        stVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ut(this));
        this.f.addView(this.d);
    }

    public mt getEditText() {
        return this.a;
    }

    public View getEmojiButton() {
        return this.b;
    }

    public int getEmojiPadding() {
        return this.x;
    }

    public float getEmojiPaddingShown() {
        return this.S;
    }

    public ry getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = org.telegram.messenger.g0.q;
        int i7 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        return this.y ? Math.min(org.telegram.messenger.g0.L(200.0f) + i7, point.y) : i7;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return o5.f();
    }

    public final void j() {
        st stVar;
        if (!this.e && (stVar = this.d) != null && stVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z10 = this.y;
        this.y = false;
        if (z10) {
            st stVar2 = this.d;
            if (stVar2 != null) {
                stVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            st stVar = this.d;
            if (stVar == null || stVar.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.k2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.y;
        this.y = false;
        if (z11) {
            st stVar2 = this.d;
            if (stVar2 != null) {
                stVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        st stVar = this.d;
        return stVar != null && stVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        st stVar = this.d;
        if (stVar != null) {
            stVar.B();
        }
        au0 au0Var = this.f;
        if (au0Var != null) {
            au0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.k4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            rt rtVar = this.a;
            rtVar.requestFocus();
            org.telegram.messenger.g0.I3(rtVar);
            if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
                return;
            }
            this.O = true;
            u();
            gk gkVar = this.Q;
            org.telegram.messenger.g0.r(gkVar);
            org.telegram.messenger.g0.h3(gkVar, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.j1 j1Var) {
        this.L = j1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        st stVar = this.d;
        if (stVar != null) {
            stVar.c = i7;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        rt rtVar = this.a;
        rtVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int L = org.telegram.messenger.g0.L(this.M == 0 ? 11.0f : 8.0f);
        if (z10) {
            rtVar.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), L);
        } else {
            rtVar.setPadding(0, 0, 0, L);
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

    public void setMaxLines(int i7) {
        this.a.setMaxLines(i7);
    }

    public void setSelection(int i7) {
        this.a.setSelection(i7);
    }

    public void setSizeNotifierLayout(au0 au0Var) {
        au0 au0Var2 = this.f;
        if (au0Var2 != null) {
            au0Var2.r.remove(this);
        }
        this.f = au0Var;
        au0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        rt rtVar = this.a;
        int inputType = rtVar.getInputType();
        int i7 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (rtVar.getInputType() != i7) {
            rtVar.setInputType(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i7) {
        return true;
    }

    public final void v() {
        u();
        x((org.telegram.messenger.g0.D || this.F) ? 0 : 2);
        rt rtVar = this.a;
        rtVar.requestFocus();
        org.telegram.messenger.g0.I3(rtVar);
        if (this.F) {
            this.G = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.O = true;
        gk gkVar = this.Q;
        org.telegram.messenger.g0.r(gkVar);
        org.telegram.messenger.g0.h3(gkVar, 100L);
    }

    public final void w(int i7, int i10) {
        this.a.setSelection(i7, i10);
    }

    public void x(int i7) {
        kk0 kk0Var = this.c;
        if (i7 != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    kk0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    kk0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    this.d.setVisibility(8);
                    this.S = 0.0f;
                }
            }
            au0 au0Var = this.f;
            if (au0Var != null) {
                if (i7 == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                au0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        st stVar = this.d;
        if (stVar != null) {
            stVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        st stVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.r = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.s = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        if (this.y) {
            i10 = Math.min(org.telegram.messenger.g0.L(200.0f) + i10, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar2.getLayoutParams();
        layoutParams.height = i10;
        stVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            org.telegram.messenger.g0.v1(this.a);
        }
        au0 au0Var2 = this.f;
        if (au0Var2 != null) {
            this.x = i10;
            au0Var2.requestLayout();
            kk0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public wt(Context context, au0 au0Var, org.telegram.ui.ActionBar.h2 h2Var, int i7, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.F = true;
        this.Q = new gk(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = i6Var;
        this.M = i7;
        this.h = h2Var;
        this.f = au0Var;
        au0Var.r.add(this);
        rt rtVar = new rt(this, context, i6Var, i7);
        this.a = rtVar;
        rtVar.setImeOptions(TLObject.FLAG_28);
        rtVar.setInputType(rtVar.getInputType() | TLObject.FLAG_14);
        rtVar.setFocusable(rtVar.isEnabled());
        rtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(rtVar, 30, i10, i6Var);
        int i11 = 0;
        if (i7 == 0) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            rtVar.setBackground(null);
            org.telegram.ui.ActionBar.u6.F(rtVar, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, i6Var);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.H6, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, i10, i6Var);
            org.telegram.ui.ActionBar.u6.l(rtVar, 36, org.telegram.ui.ActionBar.n6.mg, i6Var);
            rtVar.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.gd.a0;
            addView(rtVar, c8.ma.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            rtVar.setTextSize(1, 16.0f);
            rtVar.setMaxLines(8);
            rtVar.setGravity(19);
            rtVar.setAllowTextEntitiesIntersection(true);
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setBackground(null);
            rtVar.setClipToPadding(false);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.setLinkTextColor(-12147733);
            rtVar.E = -1;
            rtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.t5, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, org.telegram.ui.ActionBar.n6.j5, i6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.u6.D(rtVar, org.telegram.ui.ActionBar.n6.t5, i6Var);
            org.telegram.ui.ActionBar.u6.U(rtVar, org.telegram.ui.ActionBar.n6.j5, i6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(rtVar, c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        kk0 kk0Var = new kk0(context);
        this.c = kk0Var;
        kVar.setImageDrawable(kk0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, c8.ma.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            kk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            kk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.f7, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.u6.x(this, kk0Var, org.telegram.ui.ActionBar.n6.Oe, i6Var, PorterDuff.Mode.MULTIPLY);
            kk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(kVar, h02, null, M, i6Var);
        kVar.setOnClickListener(new qt(this, au0Var, i6Var, i11));
        kVar.setContentDescription(org.telegram.messenger.gd.M0(2131751185, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(vt vtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, st stVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
