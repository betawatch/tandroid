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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class rt extends FrameLayout implements org.telegram.messenger.is, rt0 {
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public org.telegram.ui.ActionBar.i1 L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
    public boolean O;
    public boolean P;
    public final zj Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public int V;
    public final mt a;
    public final kg.k b;
    public final ck0 c;
    public nt d;
    public boolean e;
    public st0 f;
    public final org.telegram.ui.ActionBar.e2 h;
    public boolean n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public boolean y;

    public rt(Context context, org.telegram.ui.wc wcVar, org.telegram.ui.qn qnVar) {
        this(context, wcVar, qnVar, 0, false, null);
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && ((this.w || (i10 = this.M) == 2 || i10 == 3) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1())) {
            if (z10) {
                this.s = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.s).commit();
            } else {
                this.r = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.r).commit();
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
                st0 st0Var = this.f;
                if (st0Var != null) {
                    this.x = layoutParams.height;
                    st0Var.requestLayout();
                    this.f.getHeight();
                    if (this.U != this.y) {
                        p();
                    }
                }
            }
        }
        this.U = this.y;
        int i14 = this.H;
        mt mtVar = this.a;
        if (i14 == i7 && this.I == z10) {
            if (b()) {
                if (mtVar.isFocused() && i7 > 0) {
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
        boolean z14 = mtVar.isFocused() && i7 > 0;
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
        return this instanceof org.telegram.ui.h20;
    }

    public final void d() {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.i4) {
            nt ntVar = this.d;
            if (ntVar != null) {
                ntVar.Q.g1();
            }
            mt mtVar = this.a;
            if (mtVar != null) {
                int currentTextColor = mtVar.getCurrentTextColor();
                mtVar.setTextColor(-1);
                mtVar.setTextColor(currentTextColor);
            }
        }
    }

    public void f() {
        nt ntVar = this.d;
        if (ntVar != null && ntVar.d1 != org.telegram.messenger.m10.t0) {
            this.f.removeView(ntVar);
            this.d = null;
        }
        if (this.d != null) {
            return;
        }
        Context context = getContext();
        boolean b10 = b();
        int i7 = this.M;
        nt ntVar2 = new nt(this, this.h, this.J, context, b10, (i7 == 2 || i7 == 3 || i7 == 5) ? false : true, this.N, this.T);
        this.d = ntVar2;
        ntVar2.c = this.V;
        ntVar2.V0 = this.R;
        ntVar2.setVisibility(8);
        this.S = 0.0f;
        if (org.telegram.messenger.g0.Q1()) {
            this.d.setForseMultiwindowLayout(true);
        }
        this.d.setDelegate(new pt(this));
        this.f.addView(this.d);
    }

    public ft getEditText() {
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

    public ly getEmojiView() {
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
        return g5.f();
    }

    public final void j() {
        nt ntVar;
        if (!this.e && (ntVar = this.d) != null && ntVar.getVisibility() != 8) {
            this.d.setVisibility(8);
            this.S = 0.0f;
        }
        this.x = 0;
        boolean z10 = this.y;
        this.y = false;
        if (z10) {
            nt ntVar2 = this.d;
            if (ntVar2 != null) {
                ntVar2.t(false);
            }
            y();
        }
    }

    public void k(boolean z10) {
        if (this.e) {
            x(0);
        }
        if (z10) {
            nt ntVar = this.d;
            if (ntVar == null || ntVar.getVisibility() != 0 || this.O) {
                j();
            } else {
                int measuredHeight = this.d.getMeasuredHeight();
                if (this.d.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.d.getParent()).getHeight() - this.d.getBottom();
                }
                this.S = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(this, measuredHeight, 2));
                this.P = true;
                ofFloat.addListener(new x5(this, 21));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                ofFloat.start();
            }
        }
        boolean z11 = this.y;
        this.y = false;
        if (z11) {
            nt ntVar2 = this.d;
            if (ntVar2 != null) {
                ntVar2.t(false);
            }
            y();
        }
    }

    public final boolean l(View view) {
        return view == this.d;
    }

    public final boolean m() {
        nt ntVar = this.d;
        return ntVar != null && ntVar.getVisibility() == 0;
    }

    public final int n() {
        return this.a.length();
    }

    public final void o() {
        this.E = true;
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.B();
        }
        st0 st0Var = this.f;
        if (st0Var != null) {
            st0Var.r.remove(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
    }

    public final void r() {
        this.F = true;
        d();
    }

    public final void s() {
        this.F = false;
        if (this.G) {
            this.G = false;
            mt mtVar = this.a;
            mtVar.requestFocus();
            org.telegram.messenger.g0.J3(mtVar);
            if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
                return;
            }
            this.O = true;
            u();
            zj zjVar = this.Q;
            org.telegram.messenger.g0.r(zjVar);
            org.telegram.messenger.g0.i3(zjVar, 100L);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.L = i1Var;
    }

    public void setEmojiViewCacheType(int i7) {
        this.V = i7;
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.c = i7;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        mt mtVar = this.a;
        mtVar.setEnabled(z10);
        this.b.setVisibility(z10 ? 0 : 8);
        int L = org.telegram.messenger.g0.L(this.M == 0 ? 11.0f : 8.0f);
        if (z10) {
            mtVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), L);
        } else {
            mtVar.setPadding(0, 0, 0, L);
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

    public void setSizeNotifierLayout(st0 st0Var) {
        st0 st0Var2 = this.f;
        if (st0Var2 != null) {
            st0Var2.r.remove(this);
        }
        this.f = st0Var;
        st0Var.r.add(this);
    }

    public void setSuggestionsEnabled(boolean z10) {
        mt mtVar = this.a;
        int inputType = mtVar.getInputType();
        int i7 = !z10 ? 524288 | inputType : (-524289) & inputType;
        if (mtVar.getInputType() != i7) {
            mtVar.setInputType(i7);
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
        mt mtVar = this.a;
        mtVar.requestFocus();
        org.telegram.messenger.g0.J3(mtVar);
        if (this.F) {
            this.G = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.w || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.O = true;
        zj zjVar = this.Q;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 100L);
    }

    public final void w(int i7, int i10) {
        this.a.setSelection(i7, i10);
    }

    public void x(int i7) {
        ck0 ck0Var = this.c;
        if (i7 != 1) {
            if (this.b != null) {
                if (this.M == 0) {
                    ck0Var.a(R.drawable.smiles_tab_smiles, true);
                } else {
                    ck0Var.a(R.drawable.input_smile, true);
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
            st0 st0Var = this.f;
            if (st0Var != null) {
                if (i7 == 0) {
                    this.x = 0;
                    this.S = 0.0f;
                }
                st0Var.requestLayout();
                this.f.getHeight();
                return;
            }
            return;
        }
        nt ntVar = this.d;
        if (ntVar != null) {
            ntVar.getVisibility();
        }
        f();
        this.d.setVisibility(0);
        this.e = true;
        this.S = 1.0f;
        nt ntVar2 = this.d;
        if (this.r <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.r = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.r = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            }
        }
        if (this.s <= 0) {
            if (org.telegram.messenger.g0.Q1()) {
                this.s = org.telegram.messenger.g0.L(150.0f);
            } else {
                this.s = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
            }
        }
        Point point = org.telegram.messenger.g0.q;
        int i10 = (point.x > point.y ? this.s : this.r) + (this.K ? org.telegram.messenger.g0.n : 0);
        if (this.y) {
            i10 = Math.min(org.telegram.messenger.g0.L(200.0f) + i10, point.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ntVar2.getLayoutParams();
        layoutParams.height = i10;
        ntVar2.setLayoutParams(layoutParams);
        if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            org.telegram.messenger.g0.v1(this.a);
        }
        st0 st0Var2 = this.f;
        if (st0Var2 != null) {
            this.x = i10;
            st0Var2.requestLayout();
            ck0Var.a(R.drawable.input_keyboard, true);
            this.f.getHeight();
        }
        p();
        this.d.setAlpha(1.0f);
        this.S = 1.0f;
        c(0.0f);
    }

    public rt(Context context, st0 st0Var, org.telegram.ui.ActionBar.e2 e2Var, int i7, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = true;
        this.Q = new zj(this, 3);
        this.V = 2;
        this.J = z10;
        this.N = e6Var;
        this.M = i7;
        this.h = e2Var;
        this.f = st0Var;
        st0Var.r.add(this);
        mt mtVar = new mt(this, context, e6Var, i7);
        this.a = mtVar;
        mtVar.setImeOptions(TLObject.FLAG_28);
        mtVar.setInputType(mtVar.getInputType() | TLObject.FLAG_14);
        mtVar.setFocusable(mtVar.isEnabled());
        mtVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        mtVar.setCursorWidth(1.5f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.l(mtVar, 30, i10, e6Var);
        int i11 = 0;
        if (i7 == 0) {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            mtVar.setBackground(null);
            org.telegram.ui.ActionBar.q6.F(mtVar, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, e6Var);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.H6, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, i10, e6Var);
            org.telegram.ui.ActionBar.q6.l(mtVar, 36, org.telegram.ui.ActionBar.j6.mg, e6Var);
            mtVar.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(40.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(11.0f));
            boolean z11 = org.telegram.messenger.hd.a0;
            addView(mtVar, c8.ja.d(-1, -2.0f, 19, z11 ? 11.0f : 0.0f, 1.0f, z11 ? 0.0f : 11.0f, 0.0f));
        } else if (i7 == 2 || i7 == 3) {
            mtVar.setTextSize(1, 16.0f);
            mtVar.setMaxLines(8);
            mtVar.setGravity(19);
            mtVar.setAllowTextEntitiesIntersection(true);
            mtVar.setHintTextColor(-1929379841);
            mtVar.setTextColor(-1);
            mtVar.setCursorColor(-1);
            mtVar.setBackground(null);
            mtVar.setClipToPadding(false);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            mtVar.setHandlesColor(-1);
            mtVar.setHighlightColor(822083583);
            mtVar.setLinkTextColor(-12147733);
            mtVar.E = -1;
            mtVar.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i7 == 4) {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity(19);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.t5, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, org.telegram.ui.ActionBar.j6.j5, e6Var);
            mtVar.setBackground(null);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            mtVar.setTextSize(1, 18.0f);
            mtVar.setMaxLines(4);
            mtVar.setGravity(19);
            org.telegram.ui.ActionBar.q6.D(mtVar, org.telegram.ui.ActionBar.j6.t5, e6Var);
            org.telegram.ui.ActionBar.q6.U(mtVar, org.telegram.ui.ActionBar.j6.j5, e6Var);
            mtVar.setBackground(null);
            mtVar.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(12.0f));
            addView(mtVar, c8.ja.d(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        kg.k kVar = new kg.k(this, context);
        this.b = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ck0 ck0Var = new ck0(context);
        this.c = ck0Var;
        kVar.setImageDrawable(ck0Var);
        if (i7 == 0) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(R.drawable.smiles_tab_smiles, false);
            addView(kVar, c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i7 == 2 || i7 == 3) {
            ck0Var.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            ck0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ja.d(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 4) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ja.d(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i7 == 5) {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.f7, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ja.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            org.telegram.ui.ActionBar.q6.x(this, ck0Var, org.telegram.ui.ActionBar.j6.Oe, e6Var, PorterDuff.Mode.MULTIPLY);
            ck0Var.a(R.drawable.input_smile, false);
            addView(kVar, c8.ja.d(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        kVar.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(kVar, h02, null, M, e6Var);
        kVar.setOnClickListener(new lt(this, st0Var, e6Var, i11));
        kVar.setContentDescription(org.telegram.messenger.hd.M0(2131751196, null));
    }

    public void c(float f10) {
    }

    public void setDelegate(qt qtVar) {
    }

    public void e() {
    }

    public void p() {
    }

    public void u() {
    }

    public void y() {
    }

    public void g(Canvas canvas, nt ntVar) {
    }

    public void i(ActionMode actionMode, Menu menu) {
    }

    public void q(int i7, int i10) {
    }
}
