package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class at0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.tu0 {
    public boolean A0;
    public boolean B0;
    public int D;
    public CharSequence E;
    public Editable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.sx0 Q;
    public org.telegram.ui.Components.vy R;
    public vh.r2 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.t0 a;
    public boolean a0;
    public ys0 b;
    public org.telegram.ui.Cells.e6 b0;
    public w71 c;
    public final boolean c0;
    public s4.a0 d;
    public final boolean d0;
    public gd e;
    public zs0 e0;
    public final un f;
    public boolean f0;
    public int g0;
    public org.telegram.ui.Components.q30 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final CharSequence[] w;
    public int w0;
    public final boolean[] x;
    public int x0;
    public int y;
    public final m4 y0;
    public TLRPC.MessageMedia z0;

    public at0(un unVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.i0.L(3.0f);
        this.g0 = -1;
        this.y0 = new m4(this, 14);
        this.c.getChildCount();
        this.d0 = true;
        int i10 = getMessagesController().S6;
        this.n = i10;
        this.w = new CharSequence[i10];
        this.x = new boolean[i10];
        this.f = unVar;
        this.c0 = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(this.currentAccount).a).q();
        this.L = false;
        this.N = 2;
    }

    public static void g0(at0 at0Var, View view, int i10) {
        int length;
        int i11;
        boolean z10 = at0Var.d0;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            if (i10 == at0Var.i0) {
                i11 = z10 ? at0Var.getMessagesController().T6 : org.telegram.messenger.zs.e4;
                CharSequence charSequence = at0Var.E;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == at0Var.j0) {
                Editable editable = at0Var.F;
                int length2 = editable != null ? editable.length() : 0;
                i11 = org.telegram.messenger.zs.e3;
                length = 200 - length2;
            } else {
                int i12 = at0Var.n0;
                if (i10 < i12 || i10 >= at0Var.D + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? at0Var.getMessagesController().U6 : 100;
                CharSequence charSequence2 = at0Var.w[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f7 = i11;
            if (length > f7 - (0.7f * f7)) {
                e6Var.setText2("");
                return;
            }
            e6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.u5 textView2 = e6Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.A6;
            org.telegram.ui.ActionBar.a7.Y(textView2, i15, null);
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void h0(at0 at0Var, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        if (at0Var.c0 && z10) {
            if (at0Var.b0 == e6Var && at0Var.P && at0Var.B0) {
                at0Var.n0();
                at0Var.P = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = at0Var.b0;
            at0Var.b0 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.fg emojiButton = e6Var.getEmojiButton();
            org.telegram.ui.Components.dg dgVar = org.telegram.ui.Components.dg.e;
            emojiButton.j(dgVar, false);
            w71 w71Var = at0Var.c;
            View F = w71Var.F(e6Var);
            s4.c1 T = F == null ? null : w71Var.T(F);
            org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
            if (sx0Var != null) {
                sx0Var.f();
                org.telegram.ui.Components.sx0 sx0Var2 = at0Var.Q;
                if (sx0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && sx0Var2.getDelegate() != view) {
                        at0Var.Q.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 == null || e6Var2 == e6Var) {
                return;
            }
            if (at0Var.P) {
                at0Var.n0();
                at0Var.o0(false);
                at0Var.q0();
            }
            e6Var2.setEmojiButtonVisibility(false);
            e6Var2.getEmojiButton().j(dgVar, false);
        }
    }

    public static void i0(at0 at0Var, org.telegram.ui.Cells.e6 e6Var) {
        at0Var.b0 = e6Var;
        if (!at0Var.P) {
            at0Var.u0(1);
        } else {
            at0Var.n0();
            at0Var.q0();
        }
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        boolean z11;
        if (this.c0) {
            if (i10 > org.telegram.messenger.i0.L(50.0f) && this.Y && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                if (z10) {
                    this.X = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    org.telegram.messenger.vp.c1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                int i11 = z10 ? this.X : this.W;
                if (this.B0) {
                    i11 += org.telegram.messenger.i0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.i0.q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.A0 != this.B0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.e.requestLayout();
                    boolean z12 = this.A0;
                    if (z12 != this.B0) {
                        k0(z12 ? -org.telegram.messenger.i0.L(120.0f) : org.telegram.messenger.i0.L(120.0f));
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z == i10 && this.a0 == z10) {
                return;
            }
            this.Z = i10;
            this.a0 = z10;
            boolean z13 = this.Y;
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                this.Y = e6Var.getEditField().isFocused() && this.S.c() && i10 > 0;
            } else {
                this.Y = false;
            }
            if (this.Y && this.P) {
                u0(0);
            }
            if (this.V != 0 && !(z11 = this.Y) && z11 != z13 && !this.P) {
                this.V = 0;
                this.S.a();
                this.e.requestLayout();
            }
            if (this.Y && this.T) {
                this.T = false;
                org.telegram.messenger.i0.r(this.y0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        String upperCase;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i10, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(this.actionBar, i10, getResourceProvider(), true);
        int i11 = 3;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.z8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i10, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.p6 p6Var = null;
        boolean z10 = this.d0;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(this.I ? 2131744131 : 2131744099, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748281, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131748282, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ss0(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (z10) {
            upperCase = org.telegram.messenger.cd.L0(this.I ? 2131744132 : 2131744100, null);
        } else {
            upperCase = org.telegram.messenger.cd.L0(2131751753, null).toUpperCase();
        }
        this.a = p5.e(1, upperCase);
        this.b = new ys0(this, context);
        gd gdVar = new gd(i11, context, this);
        this.e = gdVar;
        gdVar.setDelegate(this);
        gd gdVar2 = this.e;
        this.fragmentView = gdVar2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, gdVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new w71(9, context, p6Var);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.c.getItemAnimator()).C = false;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        this.c.setLayoutManager(a0Var);
        new s4.x(new ja(this, 8)).h(this.c);
        frameLayout.addView(this.c, w7.b6.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new g(this, 23));
        this.c.setOnScrollListener(new h3(this, 24));
        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(context, 4);
        this.h = q30Var;
        q30Var.setText(org.telegram.messenger.cd.L0(2131747170, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.c0) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
            org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = sx0Var;
            sx0Var.D = true;
            sx0Var.E = true;
            sx0Var.setHorizontalPadding(org.telegram.messenger.i0.L(24.0f));
            frameLayout.addView(this.Q, w7.b6.e(-2, org.telegram.messenger.zs.q2, 51));
        }
        this.S = new vh.r2(this.e, false, null);
        m0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                vyVar.P.g1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.b0.getEditField().setTextColor(-1);
                this.b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean hideKeyboardOnShow() {
        return this.g0 < 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
            if (this.actionBar.u()) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        int i10;
        org.telegram.ui.Components.sx0 sx0Var = this.Q;
        if (sx0Var != null) {
            sx0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.D;
        this.x[i11] = false;
        int i12 = i11 + 1;
        this.D = i12;
        if (this.r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.s + 1;
                    this.s = i10;
                }
                iArr[i13] = i10;
            }
            this.r = iArr;
        }
        if (this.D == this.w.length) {
            this.b.s(this.o0);
        }
        this.b.i(this.o0);
        v0();
        this.f0 = false;
        this.g0 = (this.n0 + this.D) - 1;
        this.b.g(this.p0);
    }

    public final void k0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new eg(this, f7, 3));
        ofFloat.addListener(new ts0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
        ofFloat.start();
    }

    public final boolean l0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.z0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(this.D, charSequenceArr.length); i11++) {
                if (!TextUtils.isEmpty(charSequenceArr[i11])) {
                    i10++;
                }
            }
            boolean z13 = (this.I || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.b0(this.E))) && i10 == todoList.list.size();
            if (z13) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(this.E));
            if (isEmpty) {
                for (int i13 = 0; i13 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i13]))); i13++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.d0;
            String L0 = org.telegram.messenger.cd.L0(z14 ? 2131752567 : 2131752573, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(z14 ? 2131752568 : 2131752574, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747596, null), new tj0(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            showDialog(x1Var);
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0() {
        int i10;
        boolean z10;
        boolean z11 = this.L;
        CharSequence[] charSequenceArr = this.w;
        if (z11) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.x;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.d0;
        int i12 = z12 ? getMessagesController().T6 : org.telegram.messenger.zs.e4;
        int i13 = z12 ? getMessagesController().U6 : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(this.F)) || this.F.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(this.E)) && this.E.length() <= i12) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i14]))) {
                    if (charSequenceArr[i14].length() > i13) {
                        i15 = 0;
                        break;
                    }
                    i15++;
                }
                i14++;
            }
            if (i15 >= (z12 ? 1 : 2) && (!this.L || i10 >= 1)) {
                z10 = true;
                this.a.setEnabled((this.L && i10 == 0) || z10);
                this.a.setAlpha(z10 ? 1.0f : 0.5f);
            }
        }
        z10 = false;
        if (this.L) {
            this.a.setEnabled((this.L && i10 == 0) || z10);
            this.a.setAlpha(z10 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.L && i10 == 0) || z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void n0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.i0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            k0(-org.telegram.messenger.i0.L(120.0f));
        }
    }

    public final void o0(boolean z10) {
        if (this.c0) {
            int i10 = 1;
            if (this.P) {
                org.telegram.ui.Components.vy vyVar = this.R;
                vyVar.P.C0();
                vyVar.I.scrollTo(0, 0);
                vyVar.G(1);
                vyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                u0(0);
            }
            if (z10) {
                org.telegram.ui.Components.vy vyVar2 = this.R;
                if (vyVar2 == null || vyVar2.getVisibility() != 0) {
                    p0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                ofFloat.addUpdateListener(new rs0(this, i10));
                ofFloat.addListener(new ts0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                ofFloat.start();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.P) {
            return l0(z10);
        }
        if (!z10) {
            return false;
        }
        o0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.f0 || this.g0 < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i10);
            this.c.getClass();
            if (RecyclerView.R(view) == this.g0) {
                break;
            } else {
                i10++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.messenger.i0.h3(new bh(((org.telegram.ui.Cells.e6) view).getTextView(), 5), 300L);
            this.g0 = -1;
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.c0) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                this.e.removeView(vyVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        if (this.c0) {
            o0(false);
            org.telegram.ui.Components.sx0 sx0Var = this.Q;
            if (sx0Var != null) {
                sx0Var.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.b0.getTextView().clearFocus();
                org.telegram.messenger.i0.v1(this.b0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        ys0 ys0Var = this.b;
        if (ys0Var != null) {
            ys0Var.f();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        int i10;
        ih.b bVar;
        super.onThemeColorsChanged();
        try {
            w71 w71Var = this.c;
            if (w71Var == null) {
                return;
            }
            for (int i11 = 0; i11 < w71Var.getChildCount(); i11++) {
                View childAt = w71Var.getChildAt(i11);
                s4.c1 T = w71Var.T(childAt);
                if (T != null && (((i10 = T.f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.e6) && (bVar = ((org.telegram.ui.Cells.e6) childAt).d) != null)) {
                    bVar.setTextColor(org.telegram.ui.ActionBar.t6.r1(bVar.isEnabled() ? 1.0f : 0.6f, getThemedColor(org.telegram.ui.ActionBar.t6.G6)));
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0() {
        org.telegram.ui.Components.vy vyVar;
        org.telegram.ui.Components.fg emojiButton;
        if (!this.P && (vyVar = this.R) != null && vyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.dg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void q0() {
        this.S.e = true;
        EditTextBoldCursor editField = this.b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.i0.J3(editField);
        u0(org.telegram.messenger.i0.D ? 0 : 2);
        if (org.telegram.messenger.i0.D || this.Y || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) {
            return;
        }
        this.T = true;
        m4 m4Var = this.y0;
        org.telegram.messenger.i0.r(m4Var);
        org.telegram.messenger.i0.h3(m4Var, 100L);
    }

    public final void r0(qg qgVar) {
        this.e0 = qgVar;
    }

    public final void s0(TLRPC.MessageMedia messageMedia, boolean z10) {
        t0(messageMedia, z10, -1);
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable A5 = org.telegram.messenger.jj.A5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = A5;
            org.telegram.messenger.jj.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.D;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.k6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.jj.A5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.jj.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i12] = tL_messageMediaToDo.todo.list.get(i12).id;
                this.s = Math.max(this.s, this.r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i11 + 1;
                v0();
                this.f0 = true;
                this.g0 = this.n0 + (i10 < 0 ? this.D - 1 : i10);
            }
        }
    }

    public final void u0(int i10) {
        org.telegram.ui.Cells.e6 e6Var;
        if (this.c0) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.fg emojiButton = this.b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.dg.e, true);
                }
                org.telegram.ui.Components.vy vyVar = this.R;
                if (vyVar != null) {
                    this.P = false;
                    this.B0 = false;
                    if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                        vyVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.V = 0;
                }
                this.S.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.vy vyVar2 = this.R;
            boolean z10 = vyVar2 != null && vyVar2.getVisibility() == 0;
            org.telegram.ui.Components.vy vyVar3 = this.R;
            if (vyVar3 != null && vyVar3.c1 != org.telegram.messenger.d20.s0) {
                this.e.removeView(vyVar3);
                this.R = null;
            }
            if (this.R == null) {
                org.telegram.ui.Components.vy vyVar4 = new org.telegram.ui.Components.vy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.R = vyVar4;
                vyVar4.x2 = false;
                vyVar4.U0 = false;
                vyVar4.setVisibility(8);
                if (org.telegram.messenger.i0.Q1()) {
                    this.R.setForseMultiwindowLayout(true);
                }
                this.R.setDelegate(new us0(this));
                this.e.addView(this.R);
            }
            this.R.setVisibility(0);
            this.P = true;
            org.telegram.ui.Components.vy vyVar5 = this.R;
            if (this.W <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.W = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.W = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                }
            }
            if (this.X <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.X = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.X = org.telegram.messenger.vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.i0.q;
            int i13 = point.x > point.y ? this.X : this.W;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar5.getLayoutParams();
            layoutParams.height = i13;
            vyVar5.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1() && (e6Var = this.b0) != null) {
                org.telegram.messenger.i0.v1(e6Var.getEditField());
            }
            this.V = i13;
            this.S.a();
            this.e.requestLayout();
            org.telegram.ui.Components.fg emojiButton2 = this.b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.dg.d, true);
            }
            if (z10 || this.Y) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            ofFloat.addUpdateListener(new rs0(this, i11));
            ofFloat.addListener(new ts0(this, i12));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
            ofFloat.start();
        }
    }

    public final void v0() {
        this.h0 = -1;
        this.i0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -1;
        this.w0 = -1;
        this.q0 = -1;
        this.x0 = 0;
        boolean z10 = this.d0;
        if (!z10 || !this.I) {
            this.h0 = 0;
            this.i0 = 1;
            this.l0 = 2;
            this.x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.D;
        if (i10 != 0) {
            int i11 = this.x0;
            this.n0 = i11;
            this.x0 = i11 + i10;
        }
        if (i10 != this.w.length) {
            int i12 = this.x0;
            this.x0 = i12 + 1;
            this.o0 = i12;
        }
        int i13 = this.x0;
        int i14 = i13 + 1;
        this.x0 = i14;
        this.p0 = i13;
        if (z10 && this.I) {
            return;
        }
        int i15 = i13 + 2;
        this.x0 = i15;
        this.q0 = i14;
        if (z10) {
            int i16 = i13 + 3;
            this.x0 = i16;
            this.v0 = i15;
            if (this.J) {
                this.x0 = i13 + 4;
                this.u0 = i16;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
            int i17 = this.x0;
            this.x0 = i17 + 1;
            this.r0 = i17;
        }
        int i18 = this.N;
        if (i18 != 1) {
            int i19 = this.x0;
            this.x0 = i19 + 1;
            this.s0 = i19;
        }
        if (i18 == 0) {
            int i20 = this.x0;
            this.x0 = i20 + 1;
            this.t0 = i20;
        }
        int i21 = this.x0;
        int i22 = i21 + 1;
        this.x0 = i22;
        this.w0 = i21;
        if (this.L) {
            this.j0 = i22;
            this.x0 = i21 + 3;
            this.k0 = i21 + 2;
        }
    }
}
