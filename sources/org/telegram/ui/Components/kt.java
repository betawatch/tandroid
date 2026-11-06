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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class kt extends FrameLayout implements org.telegram.messenger.ls, qt0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public org.telegram.ui.ActionBar.i1 K;
    public final int L;
    public final org.telegram.ui.ActionBar.f6 M;
    public boolean N;
    public boolean O;
    public final dt P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public final et a;
    public final kg.k b;
    public final xj0 c;
    public ft d;
    public boolean e;
    public rt0 f;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public kt(Context context, org.telegram.ui.xc xcVar, org.telegram.ui.pn pnVar) {
        this(context, xcVar, pnVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        boolean z10;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.w || (i10 = this.L) == 2 || i10 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z9) {
                this.s = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i7;
                org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.r).commit();
            }
        }
        boolean z11 = false;
        if (this.e) {
            int i11 = (z9 ? this.s : this.r) + (this.J ? org.telegram.messenger.g0.n : 0);
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
                rt0 rt0Var = this.f;
                if (rt0Var != null) {
                    this.x = layoutParams.height;
                    rt0Var.requestLayout();
                    this.f.getHeight();
                    if (this.T != this.y) {
                        p();
                    }
                }
            }
        }
        this.T = this.y;
        int i14 = this.G;
        et etVar = this.a;
        if (i14 == i7 && this.H == z9) {
            if (b()) {
                if (etVar.isFocused() && i7 > 0) {
                    z11 = true;
                }
                this.w = z11;
            }
            this.f.getHeight();
            return;
        }
        this.G = i7;
        this.H = z9;
        boolean z12 = this.w;
        boolean z13 = etVar.isFocused() && i7 > 0;
        this.w = z13;
        if (z13 && this.e) {
            x(0);
        }
        if (this.x != 0 && !(z10 = this.w) && z10 != z12 && !this.e) {
            this.x = 0;
            this.f.requestLayout();
        }
        if (this.w && this.N) {
            this.N = false;
            org.telegram.messenger.g0.r(this.P);
        }
        this.f.getHeight();
    }

    public boolean a() {
        int i7 = this.L;
        return i7 == 2 || i7 == 3 || i7 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.h20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            ft ftVar = this.d;
            if (ftVar != null) {
                ftVar.P.g1();
            }
            et etVar = this.a;
            if (etVar != null) {
                int currentTextColor = etVar.getCurrentTextColor();
                etVar.setTextColor(-1);
                etVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        ft ftVar = this.d;
        if (ftVar != null && ftVar.c1 != org.telegram.messenger.p10.s0) {
            this.f.removeView(ftVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.L;
        ft ftVar2 = new ft(this, this.h, this.I, context, b10, (i7 == 2 || i7 == 3 || i7 == 5) ? false : true, this.M, this.S);
        this.d = ftVar2;
        ftVar2.c = this.U;
        ftVar2.U0 = this.Q;
        ftVar2.setVisibility(8);
        this.R = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new ht(this));
        this.f.addView(this.d);
    }

    public ys getEditText() {
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

    public gy getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = org.telegram.messenger.g0.q;
        int i7 = (point.x > point.y ? this.s : this.r) + (this.J ? org.telegram.messenger.g0.n : 0);
        return this.y ? Math.min(org.telegram.messenger.g0.L(200.0f) + i7, point.y) : i7;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return i5.f();
    }

    public final void j() {
        ft ftVar;
        if (!this.e && (ftVar = this.d) != null && ftVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.R = 0.0f;
        }
        this.x = 0;
        boolean z9 = this.y;
        this.y = false;
        if (z9) {
            ft ftVar2 = this.d;
            if (ftVar2 != null) {
                ftVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z9) {
        if (this.e) {
            x(0);
        }
        if (z9) {
            ft ftVar = this.d;
            if (ftVar == null || ftVar.getVisibility() != 0 || this.N) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.R = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(this, measuredHeight, 2));
                this.O = true;
                ofFloat.addListener(new z5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                ofFloat.start();
            }
        }
        boolean z10 = this.y;
        this.y = false;
        if (z10) {
            ft ftVar2 = this.d;
            if (ftVar2 != null) {
                ftVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        ft ftVar = this.d;
        return ftVar != null && ftVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.D = true;
        ft ftVar = this.d;
        if (ftVar != null) {
            ftVar.B();
        }
        rt0 rt0Var = this.f;
        if (rt0Var != null) {
            rt0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    public final void r() {
        this.E = true;
        d();
    }

    public final void s() {
        this.E = false;
        if (this.F) {
            this.F = false;
            et etVar = this.a;
            etVar.requestFocus();
            org.telegram.messenger.g0.K3(etVar);
            if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
                return;
            }
            this.N = true;
            u();
            dt dtVar = this.P;
            org.telegram.messenger.g0.r(dtVar);
            org.telegram.messenger.g0.i3(dtVar, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.K = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.U = i7;
        ft ftVar = this.d;
        if (ftVar != null) {
            ftVar.c = i7;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        et etVar = this.a;
        etVar.setEnabled(z9);
        this.b.setVisibility(z9 ? 0 : 8);
        int L = org.telegram.messenger.g0.L(this.L == 0 ? 11.0f : 8.0f);
        if (z9) {
            etVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), L);
        } else {
            etVar.setPadding(0, 0, 0, L);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.a.setFilters(inputFilterArr);
    }

    @Override // android.view.View
    public void setFocusable(boolean z9) {
        this.a.setFocusable(z9);
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

    public void setSizeNotifierLayout(rt0 rt0Var) {
        rt0 rt0Var2 = this.f;
        if (rt0Var2 != null) {
            rt0Var2.r.remove(this);
        }
        this.f = rt0Var;
        rt0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z9) {
        et etVar = this.a;
        int inputType = etVar.getInputType();
        int i7 = !z9 ? 524288 | inputType : (-524289) & inputType;
        if (etVar.getInputType() != i7) {
            etVar.setInputType(i7);
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
        x((org.telegram.messenger.g0.D || this.E) ? 0 : 2);
        et etVar = this.a;
        etVar.requestFocus();
        org.telegram.messenger.g0.K3(etVar);
        if (this.E) {
            this.F = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.N = true;
        dt dtVar = this.P;
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 100L);
    }

    public final void w(int i7, int i10) {
        this.a.setSelection(i7, i10);
    }

    public void x(int i7) {
        xj0 xj0Var = this.c;
        if (i7 != 1) {
            if (this.b != null) {
                if (this.L == 0) {
                    xj0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    xj0Var.a(R.drawable.input_smile, true);
                }
            }
            if (this.d != null) {
                this.e = false;
                p();
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    this.d.setVisibility(8);
                    this.R = 0.0f;
                }
            }
            rt0 rt0Var = this.f;
            if (rt0Var != null) {
                if (i7 == 0) {
                    this.x = 0;
                    this.R = 0.0f;
                }
                rt0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        ft ftVar = this.d;
        if (ftVar != null) {
            ftVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.R = 1.0f;
        ft ftVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.r = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.s = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.J ? org.telegram.messenger.g0.n : 0);
        if (this.y) {
            i10 = Math.min(org.telegram.messenger.g0.L(200.0f) + i10, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ftVar2.getLayoutParams();
        layoutParams.height = i10;
        ftVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            org.telegram.messenger.g0.v1(this.a);
        }
        rt0 rt0Var2 = this.f;
        if (rt0Var2 != null) {
            this.x = i10;
            rt0Var2.requestLayout();
            xj0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.R = 1.0f;
        c(0.0f);
    }

    public kt(Context context, rt0 rt0Var, org.telegram.ui.ActionBar.f2 f2Var, int i7, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = true;
        this.P = new dt(this, 0);
        this.U = 2;
        this.I = z9;
        this.M = f6Var;
        this.L = i7;
        this.h = f2Var;
        this.f = rt0Var;
        rt0Var.r.add(this);
        et etVar = new et(this, context, f6Var, i7);
        this.a = etVar;
        etVar.setImeOptions(TLObject.FLAG_28);
        etVar.setInputType(etVar.getInputType() | TLObject.FLAG_14);
        etVar.setFocusable(etVar.isEnabled());
        etVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        etVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(etVar, 30, i10, f6Var);
        if (i7 == 0) {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            etVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.G(etVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, f6Var);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.H6, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, i10, f6Var);
            org.telegram.ui.ActionBar.r6.m(etVar, 36, org.telegram.ui.ActionBar.k6.jg, f6Var);
            etVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z10 = org.telegram.messenger.hd.a0;
            addView(etVar, c8.ha.d(-1, -2.0f, 19, z10 ? 11.0f : 0.0f, 1.0f, z10 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            etVar.setTextSize(1, 16.0f);
            etVar.setMaxLines(8);
            etVar.setGravity(19);
            etVar.setAllowTextEntitiesIntersection(true);
            etVar.setHintTextColor(-1929379841);
            etVar.setTextColor(-1);
            etVar.setCursorColor(-1);
            etVar.setBackground(null);
            etVar.setClipToPadding(false);
            etVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            etVar.setHandlesColor(-1);
            etVar.setHighlightColor(822083583);
            etVar.setLinkTextColor(-12147733);
            etVar.D = -1;
            etVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, org.telegram.ui.ActionBar.k6.j5, f6Var);
            etVar.setBackground(null);
            etVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            etVar.setTextSize(1, 18.0f);
            etVar.setMaxLines(4);
            etVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(etVar, org.telegram.ui.ActionBar.k6.t5, f6Var);
            org.telegram.ui.ActionBar.r6.V(etVar, org.telegram.ui.ActionBar.k6.j5, f6Var);
            etVar.setBackground(null);
            etVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(etVar, c8.ha.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xj0 xj0Var = new xj0(context);
        this.c = xj0Var;
        kVar.setImageDrawable(xj0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            xj0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            xj0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ha.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ha.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.f7, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.y(this, xj0Var, org.telegram.ui.ActionBar.k6.Le, f6Var, PorterDuff.Mode.MULTIPLY);
            xj0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ha.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(kVar, h02, null, N, f6Var);
        kVar.setOnClickListener(new ah.g(this, rt0Var, f6Var, 25));
        kVar.setContentDescription(org.telegram.messenger.hd.M0(2131751197, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(jt jtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, ft ftVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
