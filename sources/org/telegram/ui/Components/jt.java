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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class jt extends FrameLayout implements org.telegram.messenger.cs, pt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.h1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
    public boolean O;
    public boolean P;
    public final mi.b0 Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final dt a;
    public final lg.k b;
    public final bk0 c;
    public et d;
    public boolean e;
    public qt0 f;
    public final org.telegram.ui.ActionBar.d2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public jt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.ln lnVar) {
        this(context, wcVar, lnVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        boolean z11;
        int i10;
        if (i3 > org.telegram.messenger.g0.L(50.0f) && ((this.w || (i10 = this.M) == 2 || i10 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.s = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.r).commit();
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
                qt0 qt0Var = this.f;
                if (qt0Var != null) {
                    this.x = layoutParams.height;
                    qt0Var.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i14 = this.H;
        dt dtVar = this.a;
        if (i14 == i3 && this.I == z10) {
            if (b()) {
                if (dtVar.isFocused() && i3 > 0) {
                    z12 = true;
                }
                this.w = z12;
            }
            this.f.getHeight();
            return;
        }
        this.H = i3;
        this.I = z10;
        boolean z13 = this.w;
        boolean z14 = dtVar.isFocused() && i3 > 0;
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
        int i3 = this.M;
        return i3 == 2 || i3 == 3 || i3 == 5;
    }

    public boolean b() {
        return this instanceof org.telegram.ui.c20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            et etVar = this.d;
            if (etVar != null) {
                etVar.Q.g1();
            }
            dt dtVar = this.a;
            if (dtVar != null) {
                int currentTextColor = dtVar.getCurrentTextColor();
                dtVar.setTextColor(-1);
                dtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        et etVar = this.d;
        if (etVar != null && etVar.d1 != org.telegram.messenger.h10.t0) {
            this.f.removeView(etVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i3 = this.M;
        et etVar2 = new et(this, this.h, this.J, context, b10, (i3 == 2 || i3 == 3 || i3 == 5) ? false : true, this.N, this.T);
        this.d = etVar2;
        etVar2.c = this.V;
        etVar2.V0 = this.R;
        etVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new gt(this));
        this.f.addView(this.d);
    }

    public xs getEditText() {
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

    public ey getEmojiView() {
        return this.d;
    }

    public int getKeyboardHeight() {
        Point point = org.telegram.messenger.g0.q;
        int i3 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        return this.y ? Math.min(org.telegram.messenger.g0.L(200.0f) + i3, point.y) : i3;
    }

    public Editable getText() {
        return this.a.getText();
    }

    public int h() {
        return g5.f();
    }

    public final void j() {
        et etVar;
        if (!this.e && (etVar = this.d) != null && etVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z10 = this.y;
        this.y = false;
        if (z10) {
            et etVar2 = this.d;
            if (etVar2 != null) {
                etVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            et etVar = this.d;
            if (etVar == null || etVar.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.g2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.y;
        this.y = false;
        if (z11) {
            et etVar2 = this.d;
            if (etVar2 != null) {
                etVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        et etVar = this.d;
        return etVar != null && etVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        et etVar = this.d;
        if (etVar != null) {
            etVar.B();
        }
        qt0 qt0Var = this.f;
        if (qt0Var != null) {
            qt0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            dt dtVar = this.a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
            if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
                return;
            }
            this.O = true;
            u();
            mi.b0 b0Var = this.Q;
            org.telegram.messenger.g0.r(b0Var);
            org.telegram.messenger.g0.i3(b0Var, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.h1 h1Var) {
        this.L = h1Var;
    }

    public void setEmojiViewCacheType(int i3) {
        this.V = i3;
        et etVar = this.d;
        if (etVar != null) {
            etVar.c = i3;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        dt dtVar = this.a;
        dtVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int L = org.telegram.messenger.g0.L(this.M == 0 ? 11.0f : 8.0f);
        if (z10) {
            dtVar.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), L);
        } else {
            dtVar.setPadding(0, 0, 0, L);
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

    public void setMaxLines(int i3) {
        this.a.setMaxLines(i3);
    }

    public void setSelection(int i3) {
        this.a.setSelection(i3);
    }

    public void setSizeNotifierLayout(qt0 qt0Var) {
        qt0 qt0Var2 = this.f;
        if (qt0Var2 != null) {
            qt0Var2.r.remove(this);
        }
        this.f = qt0Var;
        qt0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        dt dtVar = this.a;
        int inputType = dtVar.getInputType();
        int i3 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (dtVar.getInputType() != i3) {
            dtVar.setInputType(i3);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean t(int i3) {
        return true;
    }

    public final void v() {
        u();
        x((org.telegram.messenger.g0.D || this.F) ? 0 : 2);
        dt dtVar = this.a;
        dtVar.requestFocus();
        org.telegram.messenger.g0.K3(dtVar);
        if (this.F) {
            this.G = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.O = true;
        mi.b0 b0Var = this.Q;
        org.telegram.messenger.g0.r(b0Var);
        org.telegram.messenger.g0.i3(b0Var, 100L);
    }

    public final void w(int i3, int i10) {
        this.a.setSelection(i3, i10);
    }

    public void x(int i3) {
        bk0 bk0Var = this.c;
        if (i3 != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    bk0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    bk0Var.a(R.drawable.input_smile, true);
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
            qt0 qt0Var = this.f;
            if (qt0Var != null) {
                if (i3 == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                qt0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        et etVar = this.d;
        if (etVar != null) {
            etVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        et etVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.r = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.s = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        if (this.y) {
            i10 = Math.min(org.telegram.messenger.g0.L(200.0f) + i10, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) etVar2.getLayoutParams();
        layoutParams.height = i10;
        etVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            org.telegram.messenger.g0.v1(this.a);
        }
        qt0 qt0Var2 = this.f;
        if (qt0Var2 != null) {
            this.x = i10;
            qt0Var2.requestLayout();
            bk0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public jt(Context context, qt0 qt0Var, org.telegram.ui.ActionBar.d2 d2Var, int i3, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = true;
        this.Q = new mi.b0(this, 29);
        this.V = 2;
        this.J = z10;
        this.N = e6Var;
        this.M = i3;
        this.h = d2Var;
        this.f = qt0Var;
        qt0Var.r.add(this);
        dt dtVar = new dt(this, context, e6Var, i3);
        this.a = dtVar;
        dtVar.setImeOptions(TLObject.FLAG_28);
        dtVar.setInputType(dtVar.getInputType() | TLObject.FLAG_14);
        dtVar.setFocusable(dtVar.isEnabled());
        dtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        dtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(dtVar, 30, i10, e6Var);
        int i11 = 0;
        if (i3 == 0) {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            dtVar.setBackground(null);
            org.telegram.ui.ActionBar.r6.G(dtVar, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.H6, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, i10, e6Var);
            org.telegram.ui.ActionBar.r6.m(dtVar, 36, org.telegram.ui.ActionBar.k6.jg, e6Var);
            dtVar.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.bd.a0;
            addView(dtVar, b8.mf.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i3 == 2 || i3 == 3) {
            dtVar.setTextSize(1, 16.0f);
            dtVar.setMaxLines(8);
            dtVar.setGravity(19);
            dtVar.setAllowTextEntitiesIntersection(true);
            dtVar.setHintTextColor(-1929379841);
            dtVar.setTextColor(-1);
            dtVar.setCursorColor(-1);
            dtVar.setBackground(null);
            dtVar.setClipToPadding(false);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            dtVar.setHandlesColor(-1);
            dtVar.setHighlightColor(822083583);
            dtVar.setLinkTextColor(-12147733);
            dtVar.E = -1;
            dtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i3 == 4) {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.t5, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, org.telegram.ui.ActionBar.k6.j5, e6Var);
            dtVar.setBackground(null);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            dtVar.setTextSize(1, 18.0f);
            dtVar.setMaxLines(4);
            dtVar.setGravity(19);
            org.telegram.ui.ActionBar.r6.E(dtVar, org.telegram.ui.ActionBar.k6.t5, e6Var);
            org.telegram.ui.ActionBar.r6.V(dtVar, org.telegram.ui.ActionBar.k6.j5, e6Var);
            dtVar.setBackground(null);
            dtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(dtVar, b8.mf.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        lg.k kVar = new lg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        kVar.setImageDrawable(bk0Var);
        if (i3 == 0) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, b8.mf.d(48, 48.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i3 == 2 || i3 == 3) {
            bk0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            bk0Var.a(R.drawable.input_smile, false);
            addView(kVar, b8.mf.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i3 == 4) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(R.drawable.input_smile, false);
            addView(kVar, b8.mf.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i3 == 5) {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.f7, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(R.drawable.input_smile, false);
            addView(kVar, b8.mf.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.r6.y(this, bk0Var, org.telegram.ui.ActionBar.k6.Le, e6Var, PorterDuff.Mode.MULTIPLY);
            bk0Var.a(R.drawable.input_smile, false);
            addView(kVar, b8.mf.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(kVar, h02, null, N, e6Var);
        kVar.setOnClickListener(new ct(this, qt0Var, e6Var, i11));
        kVar.setContentDescription(org.telegram.messenger.bd.M0(2131751197, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(ht htVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, et etVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i3, int i10) {
    }
}
