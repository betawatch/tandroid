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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class yt extends FrameLayout implements org.telegram.messenger.gs, cu0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.i1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.h6 N;
    public boolean O;
    public boolean P;
    public final ik Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final tt a;
    public final kg.k b;
    public final mk0 c;
    public ut d;
    public boolean e;
    public du0 f;
    public final org.telegram.ui.ActionBar.g2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public yt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.rn rnVar) {
        this(context, wcVar, rnVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.cu0
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.w || (i10 = this.M) == 2 || i10 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.s = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i7;
                org.telegram.messenger.np.f1().edit().putInt("kbd_height", this.r).commit();
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
                du0 du0Var = this.f;
                if (du0Var != null) {
                    this.x = layoutParams.height;
                    du0Var.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i14 = this.H;
        tt ttVar = this.a;
        if (i14 == i7 && this.I == z10) {
            if (b()) {
                if (ttVar.isFocused() && i7 > 0) {
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
        boolean z14 = ttVar.isFocused() && i7 > 0;
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

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.l4) {
            ut utVar = this.d;
            if (utVar != null) {
                utVar.Q.g1();
            }
            tt ttVar = this.a;
            if (ttVar != null) {
                int currentTextColor = ttVar.getCurrentTextColor();
                ttVar.setTextColor(-1);
                ttVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        ut utVar = this.d;
        if (utVar != null && utVar.d1 != org.telegram.messenger.k10.t0) {
            this.f.removeView(utVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.M;
        ut utVar2 = new ut(this, this.h, this.J, context, b10, (i7 == 2 || i7 == 3 || i7 == 5) ? false : true, this.N, this.T);
        this.d = utVar2;
        utVar2.c = this.V;
        utVar2.V0 = this.R;
        utVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new wt(this));
        this.f.addView(this.d);
    }

    public ot getEditText() {
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

    public ty getEmojiView() {
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
        return p5.f();
    }

    public final void j() {
        ut utVar;
        if (!this.e && (utVar = this.d) != null && utVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z10 = this.y;
        this.y = false;
        if (z10) {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                utVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            ut utVar = this.d;
            if (utVar == null || utVar.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new y(this, 22));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.y;
        this.y = false;
        if (z11) {
            ut utVar2 = this.d;
            if (utVar2 != null) {
                utVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        ut utVar = this.d;
        return utVar != null && utVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        ut utVar = this.d;
        if (utVar != null) {
            utVar.B();
        }
        du0 du0Var = this.f;
        if (du0Var != null) {
            du0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.l4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            tt ttVar = this.a;
            ttVar.requestFocus();
            org.telegram.messenger.g0.I3(ttVar);
            if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
                return;
            }
            this.O = true;
            u();
            ik ikVar = this.Q;
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.L = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        ut utVar = this.d;
        if (utVar != null) {
            utVar.c = i7;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        tt ttVar = this.a;
        ttVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int L = org.telegram.messenger.g0.L(this.M == 0 ? 11.0f : 8.0f);
        if (z10) {
            ttVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), L);
        } else {
            ttVar.setPadding(0, 0, 0, L);
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

    public void setSizeNotifierLayout(du0 du0Var) {
        du0 du0Var2 = this.f;
        if (du0Var2 != null) {
            du0Var2.r.remove(this);
        }
        this.f = du0Var;
        du0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        tt ttVar = this.a;
        int inputType = ttVar.getInputType();
        int i7 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (ttVar.getInputType() != i7) {
            ttVar.setInputType(i7);
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
        tt ttVar = this.a;
        ttVar.requestFocus();
        org.telegram.messenger.g0.I3(ttVar);
        if (this.F) {
            this.G = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.O = true;
        ik ikVar = this.Q;
        org.telegram.messenger.g0.r(ikVar);
        org.telegram.messenger.g0.h3(ikVar, 100L);
    }

    public final void w(int i7, int i10) {
        this.a.setSelection(i7, i10);
    }

    public void x(int i7) {
        mk0 mk0Var = this.c;
        if (i7 != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    mk0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    mk0Var.a(R.drawable.input_smile, true);
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
            du0 du0Var = this.f;
            if (du0Var != null) {
                if (i7 == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                du0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        ut utVar = this.d;
        if (utVar != null) {
            utVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        ut utVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.r = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.s = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        if (this.y) {
            i10 = Math.min(org.telegram.messenger.g0.L(200.0f) + i10, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) utVar2.getLayoutParams();
        layoutParams.height = i10;
        utVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            org.telegram.messenger.g0.v1(this.a);
        }
        du0 du0Var2 = this.f;
        if (du0Var2 != null) {
            this.x = i10;
            du0Var2.requestLayout();
            mk0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public yt(Context context, du0 du0Var, org.telegram.ui.ActionBar.g2 g2Var, int i7, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.F = true;
        this.Q = new ik(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = h6Var;
        this.M = i7;
        this.h = g2Var;
        this.f = du0Var;
        du0Var.r.add(this);
        tt ttVar = new tt(this, context, h6Var, i7);
        this.a = ttVar;
        ttVar.setImeOptions(TLObject.FLAG_28);
        ttVar.setInputType(ttVar.getInputType() | TLObject.FLAG_14);
        ttVar.setFocusable(ttVar.isEnabled());
        ttVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ttVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.l(ttVar, 30, i10, h6Var);
        int i11 = 0;
        if (i7 == 0) {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            ttVar.setBackground(null);
            org.telegram.ui.ActionBar.t6.F(ttVar, org.telegram.ui.ActionBar.m6.k6, org.telegram.ui.ActionBar.m6.l6, org.telegram.ui.ActionBar.m6.p7, h6Var);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.H6, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, i10, h6Var);
            org.telegram.ui.ActionBar.t6.l(ttVar, 36, org.telegram.ui.ActionBar.m6.mg, h6Var);
            ttVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.hd.a0;
            addView(ttVar, c8.ma.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            ttVar.setTextSize(1, 16.0f);
            ttVar.setMaxLines(8);
            ttVar.setGravity(19);
            ttVar.setAllowTextEntitiesIntersection(true);
            ttVar.setHintTextColor(-1929379841);
            ttVar.setTextColor(-1);
            ttVar.setCursorColor(-1);
            ttVar.setBackground(null);
            ttVar.setClipToPadding(false);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            ttVar.setHandlesColor(-1);
            ttVar.setHighlightColor(822083583);
            ttVar.setLinkTextColor(-12147733);
            ttVar.E = -1;
            ttVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(ttVar, c8.ma.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity(19);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.t5, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, org.telegram.ui.ActionBar.m6.j5, h6Var);
            ttVar.setBackground(null);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ttVar, c8.ma.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            ttVar.setTextSize(1, 18.0f);
            ttVar.setMaxLines(4);
            ttVar.setGravity(19);
            org.telegram.ui.ActionBar.t6.D(ttVar, org.telegram.ui.ActionBar.m6.t5, h6Var);
            org.telegram.ui.ActionBar.t6.U(ttVar, org.telegram.ui.ActionBar.m6.j5, h6Var);
            ttVar.setBackground(null);
            ttVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(ttVar, c8.ma.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mk0 mk0Var = new mk0(context);
        this.c = mk0Var;
        kVar.setImageDrawable(mk0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, c8.ma.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            mk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            mk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.f7, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.t6.x(this, mk0Var, org.telegram.ui.ActionBar.m6.Oe, h6Var, PorterDuff.Mode.MULTIPLY);
            mk0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ma.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(kVar, h02, null, M, h6Var);
        kVar.setOnClickListener(new st(this, du0Var, h6Var, i11));
        kVar.setContentDescription(org.telegram.messenger.hd.N0(2131751184, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(xt xtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ut utVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
