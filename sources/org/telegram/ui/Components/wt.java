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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class wt extends FrameLayout implements org.telegram.messenger.us, tu0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.m1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.p6 M;
    public boolean N;
    public boolean O;
    public final mg.c2 P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final rt a;
    public final ag.r b;
    public final bl0 c;
    public st d;
    public boolean e;
    public uu0 f;
    public final org.telegram.ui.ActionBar.k2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public wt(Context context, org.telegram.ui.gd gdVar, org.telegram.ui.oo ooVar) {
        this(context, gdVar, ooVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        boolean z11;
        int i11;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && ((this.w || (i11 = this.L) == 2 || i11 == 3) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1())) {
            if (z10) {
                this.s = i10;
                org.telegram.messenger.vp.c1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i10;
                org.telegram.messenger.vp.c1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z12 = false;
        if (this.e) {
            int i12 = (z10 ? this.s : this.r) + (this.J ? org.telegram.messenger.i0.n : 0);
            if (this.y) {
                i12 = Math.min(org.telegram.messenger.i0.L(200.0f) + i12, org.telegram.messenger.i0.q.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = org.telegram.messenger.i0.q.x;
            if (i13 != i14 || layoutParams.height != i12) {
                layoutParams.width = i14;
                layoutParams.height = i12;
                this.d.setLayoutParams(layoutParams);
                uu0 uu0Var = this.f;
                if (uu0Var != null) {
                    this.x = layoutParams.height;
                    uu0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.y) {
                        p();
                    }
                }
            }
        }
        this.T = this.y;
        int i15 = this.G;
        rt rtVar = this.a;
        if (i15 == i10 && this.H == z10) {
            if (b()) {
                if (rtVar.isFocused() && i10 > 0) {
                    z12 = true;
                }
                this.w = z12;
            }
            this.f.getHeight();
            return;
        }
        this.G = i10;
        this.H = z10;
        boolean z13 = this.w;
        boolean z14 = rtVar.isFocused() && i10 > 0;
        this.w = z14;
        if (z14 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z11 = this.w) && z11 != z13 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.N) {
            this.N = false;
            org.telegram.messenger.i0.r(this.P);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i10 = this.L;
        return i10 == 2 || i10 == 3 || i10 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.g30;
    }

    public final void d() {
        org.telegram.messenger.i0.v1(this.a);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            st stVar = this.d;
            if (stVar != null) {
                stVar.P.g1();
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
        if (stVar != null && stVar.c1 != org.telegram.messenger.d20.s0) {
            this.f.removeView(stVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i10 = this.L;
        st stVar2 = new st(this, this.h, this.I, context, b10, (i10 == 2 || i10 == 3 || i10 == 5) ? false : true, this.M, this.S);
        this.d = stVar2;
        stVar2.c = this.U;
        stVar2.U0 = this.Q;
        stVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.i0.Q1()) {
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
        return this.R;
    }

    public vy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = org.telegram.messenger.i0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.J ? org.telegram.messenger.i0.n : 0);
        return this.y ? Math.min(org.telegram.messenger.i0.L(200.0f) + i10, point.y) : i10;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return f5.f();
    }

    public final void j() {
        st stVar;
        if (!this.e && (stVar = this.d) != null && stVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
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
            if (stVar == null || stVar.getVisibility() != 0 || this.N) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new nh.b(this, measuredHeight, 3));
                this.O = true;
                ofFloat.addListener(new w5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
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
        this.D = true;
        st stVar = this.d;
        if (stVar != null) {
            stVar.C();
        }
        uu0 uu0Var = this.f;
        if (uu0Var != null) {
            uu0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            rt rtVar = this.a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
            if (org.telegram.messenger.i0.D || this.w || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) {
                return;
            }
            this.N = true;
            u();
            mg.c2 c2Var = this.P;
            org.telegram.messenger.i0.r(c2Var);
            org.telegram.messenger.i0.h3(c2Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.m1 m1Var) {
        this.K = m1Var;
    }

    public void setEmojiViewCacheType(int i10) {
        this.U = i10;
        st stVar = this.d;
        if (stVar != null) {
            stVar.c = i10;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        rt rtVar = this.a;
        rtVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int L = org.telegram.messenger.i0.L(this.L == 0 ? 11.0f : 8.0f);
        if (z10) {
            rtVar.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0, org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), L);
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

    public void setMaxLines(int i10) {
        this.a.setMaxLines(i10);
    }

    public void setSelection(int i10) {
        this.a.setSelection(i10);
    }

    public void setSizeNotifierLayout(uu0 uu0Var) {
        uu0 uu0Var2 = this.f;
        if (uu0Var2 != null) {
            uu0Var2.r.remove(this);
        }
        this.f = uu0Var;
        uu0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        rt rtVar = this.a;
        int inputType = rtVar.getInputType();
        int i10 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (rtVar.getInputType() != i10) {
            rtVar.setInputType(i10);
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
        x((org.telegram.messenger.i0.D || this.E) ? 0 : 2);
        rt rtVar = this.a;
        rtVar.requestFocus();
        org.telegram.messenger.i0.J3(rtVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (org.telegram.messenger.i0.D || this.w || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) {
            return;
        }
        this.N = true;
        mg.c2 c2Var = this.P;
        org.telegram.messenger.i0.r(c2Var);
        org.telegram.messenger.i0.h3(c2Var, 100L);
    }

    public final void w(int i10, int i11) {
        this.a.setSelection(i10, i11);
    }

    public void x(int i10) {
        bl0 bl0Var = this.c;
        if (i10 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    bl0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    bl0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    this.d.setVisibility(8);
                    this.R = 0.0f;
                }
            }
            uu0 uu0Var = this.f;
            if (uu0Var != null) {
                if (i10 == 0) {
                    this.x = 0;
                    this.R = 0.0f;
                }
                uu0Var.requestLayout();
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
        this.R = 1.0f;
        st stVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.i0.Q1()) {
                this.r = org.telegram.messenger.i0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.i0.Q1()) {
                this.s = org.telegram.messenger.i0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.i0.q;
        int i11 = (point.x > point.y ? this.s : this.r) + (this.J ? org.telegram.messenger.i0.n : 0);
        if (this.y) {
            i11 = Math.min(org.telegram.messenger.i0.L(200.0f) + i11, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar2.getLayoutParams();
        layoutParams.height = i11;
        stVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            org.telegram.messenger.i0.v1(this.a);
        }
        uu0 uu0Var2 = this.f;
        if (uu0Var2 != null) {
            this.x = i11;
            uu0Var2.requestLayout();
            bl0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public wt(Context context, uu0 uu0Var, org.telegram.ui.ActionBar.k2 k2Var, int i10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.E = true;
        this.P = new mg.c2(this, 28);
        this.U = 2;
        this.I = z10;
        this.M = p6Var;
        this.L = i10;
        this.h = k2Var;
        this.f = uu0Var;
        uu0Var.r.add(this);
        rt rtVar = new rt(this, context, p6Var, i10);
        this.a = rtVar;
        rtVar.setImeOptions(TLObject.FLAG_28);
        rtVar.setInputType(rtVar.getInputType() | TLObject.FLAG_14);
        rtVar.setFocusable(rtVar.isEnabled());
        rtVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        rtVar.setCursorWidth(1.5f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(rtVar, 30, i11, p6Var);
        if (i10 == 0) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            rtVar.setBackground(null);
            org.telegram.ui.ActionBar.a7.G(rtVar, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.H6, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, i11, p6Var);
            org.telegram.ui.ActionBar.a7.m(rtVar, 36, org.telegram.ui.ActionBar.t6.jg, p6Var);
            rtVar.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(40.0f) : 0, 0, org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(11.0f));
            boolean z11 = org.telegram.messenger.cd.X;
            addView(rtVar, w7.b6.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i10 == 2 || i10 == 3) {
            rtVar.setTextSize(1, 16.0f);
            rtVar.setMaxLines(8);
            rtVar.setGravity(19);
            rtVar.setAllowTextEntitiesIntersection(true);
            rtVar.setHintTextColor(-1929379841);
            rtVar.setTextColor(-1);
            rtVar.setCursorColor(-1);
            rtVar.setBackground(null);
            rtVar.setClipToPadding(false);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
            rtVar.setHandlesColor(-1);
            rtVar.setHighlightColor(822083583);
            rtVar.setLinkTextColor(-12147733);
            rtVar.D = -1;
            rtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i10 == 4) {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.t5, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, org.telegram.ui.ActionBar.t6.j5, p6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(12.0f));
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            rtVar.setTextSize(1, 18.0f);
            rtVar.setMaxLines(4);
            rtVar.setGravity(19);
            org.telegram.ui.ActionBar.a7.E(rtVar, org.telegram.ui.ActionBar.t6.t5, p6Var);
            org.telegram.ui.ActionBar.a7.V(rtVar, org.telegram.ui.ActionBar.t6.j5, p6Var);
            rtVar.setBackground(null);
            rtVar.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(12.0f));
            addView(rtVar, w7.b6.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ag.r rVar = new ag.r(this, context);
        this.b = rVar;
        rVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bl0 bl0Var = new bl0(context);
        this.c = bl0Var;
        rVar.setImageDrawable(bl0Var);
        if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.y(this, bl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            bl0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(rVar, w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i10 == 2 || i10 == 3) {
            bl0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bl0Var.a(R.drawable.input_smile, false);
            addView(rVar, w7.b6.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.a7.y(this, bl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            bl0Var.a(R.drawable.input_smile, false);
            addView(rVar, w7.b6.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i10 == 5) {
            org.telegram.ui.ActionBar.a7.y(this, bl0Var, org.telegram.ui.ActionBar.t6.f7, p6Var, PorterDuff.Mode.MULTIPLY);
            bl0Var.a(R.drawable.input_smile, false);
            addView(rVar, w7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.a7.y(this, bl0Var, org.telegram.ui.ActionBar.t6.Le, p6Var, PorterDuff.Mode.MULTIPLY);
            bl0Var.a(R.drawable.input_smile, false);
            addView(rVar, w7.b6.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        rVar.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(rVar, h02, null, N, p6Var);
        rVar.setOnClickListener(new ag.i(this, uu0Var, p6Var, 15));
        rVar.setContentDescription(org.telegram.messenger.cd.L0(2131751197, null));
    }

    public void c(float f7) {
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

    public void q(int i10, int i11) {
    }
}
