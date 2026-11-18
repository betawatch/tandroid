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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, org.telegram.ui.Components.zt0 {
    public TLRPC.MessageMedia A0;
    public boolean B0;
    public boolean C0;
    public int E;
    public CharSequence F;
    public Editable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public boolean Q;
    public org.telegram.ui.Components.yw0 R;
    public org.telegram.ui.Components.ry S;
    public hi.p3 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.r0 a;
    public int a0;
    public nr0 b;
    public boolean b0;
    public f61 c;
    public org.telegram.ui.Cells.b6 c0;
    public v4.c0 d;
    public final boolean d0;
    public wc e;
    public final boolean e0;
    public final bn f;
    public or0 f0;
    public boolean g0;
    public org.telegram.ui.Components.j30 h;
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
    public int y0;
    public final m4 z0;

    public pr0(bn bnVar) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = org.telegram.messenger.g0.L(3.0f);
        this.h0 = -1;
        this.z0 = new m4(this, 14);
        this.e0 = true;
        int i7 = getMessagesController().U6;
        this.n = i7;
        this.w = new CharSequence[i7];
        this.x = new boolean[i7];
        this.f = bnVar;
        this.d0 = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(this.currentAccount).a).q();
        this.M = false;
        this.O = 2;
    }

    public static void h0(pr0 pr0Var, View view, int i7) {
        int length;
        int i10;
        boolean z10 = pr0Var.e0;
        if (view instanceof org.telegram.ui.Cells.b6) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            if (i7 == pr0Var.j0) {
                i10 = z10 ? pr0Var.getMessagesController().V6 : org.telegram.messenger.ks.e4;
                CharSequence charSequence = pr0Var.F;
                length = i10 - (charSequence != null ? charSequence.length() : 0);
            } else if (i7 == pr0Var.k0) {
                Editable editable = pr0Var.G;
                int length2 = editable != null ? editable.length() : 0;
                i10 = org.telegram.messenger.ks.e3;
                length = 200 - length2;
            } else {
                int i11 = pr0Var.o0;
                if (i7 < i11 || i7 >= pr0Var.E + i11) {
                    return;
                }
                int i12 = i7 - i11;
                int i13 = z10 ? pr0Var.getMessagesController().W6 : 100;
                CharSequence charSequence2 = pr0Var.w[i12];
                length = i13 - (charSequence2 != null ? charSequence2.length() : 0);
                i10 = i13;
            }
            float f10 = i10;
            if (length > f10 - (0.7f * f10)) {
                b6Var.setText2("");
                return;
            }
            b6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.n5 textView2 = b6Var.getTextView2();
            int i14 = length < 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.A6;
            org.telegram.ui.ActionBar.u6.X(textView2, i14, null);
            textView2.setTag(Integer.valueOf(i14));
        }
    }

    public static void i0(pr0 pr0Var, org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        if (pr0Var.d0 && z10) {
            if (pr0Var.c0 == b6Var && pr0Var.Q && pr0Var.C0) {
                pr0Var.o0();
                pr0Var.Q = false;
            }
            org.telegram.ui.Cells.b6 b6Var2 = pr0Var.c0;
            pr0Var.c0 = b6Var;
            b6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.yg emojiButton = b6Var.getEmojiButton();
            org.telegram.ui.Components.wg wgVar = org.telegram.ui.Components.wg.e;
            emojiButton.j(wgVar, false);
            f61 f61Var = pr0Var.c;
            View F = f61Var.F(b6Var);
            v4.f1 T = F == null ? null : f61Var.T(F);
            org.telegram.ui.Components.yw0 yw0Var = pr0Var.R;
            if (yw0Var != null) {
                yw0Var.f();
                org.telegram.ui.Components.yw0 yw0Var2 = pr0Var.R;
                if (yw0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.b6) && yw0Var2.getDelegate() != view) {
                        pr0Var.R.setDelegate((org.telegram.ui.Cells.b6) view);
                    }
                }
            }
            if (b6Var2 == null || b6Var2 == b6Var) {
                return;
            }
            if (pr0Var.Q) {
                pr0Var.o0();
                pr0Var.p0(false);
                pr0Var.r0();
            }
            b6Var2.setEmojiButtonVisibility(false);
            b6Var2.getEmojiButton().j(wgVar, false);
        }
    }

    public static void j0(pr0 pr0Var, org.telegram.ui.Cells.b6 b6Var) {
        pr0Var.c0 = b6Var;
        if (!pr0Var.Q) {
            pr0Var.v0(1);
        } else {
            pr0Var.o0();
            pr0Var.r0();
        }
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L(int i7, boolean z10) {
        boolean z11;
        if (this.d0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Z && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z10) {
                    this.Y = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i7;
                    org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.X).commit();
                }
            }
            if (this.Q) {
                int i10 = z10 ? this.Y : this.X;
                if (this.C0) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = org.telegram.messenger.g0.q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.B0 != this.C0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.e.requestLayout();
                    boolean z12 = this.B0;
                    if (z12 != this.C0) {
                        l0(z12 ? -org.telegram.messenger.g0.L(120.0f) : org.telegram.messenger.g0.L(120.0f));
                    }
                    this.B0 = this.C0;
                }
            }
            if (this.a0 == i7 && this.b0 == z10) {
                return;
            }
            this.a0 = i7;
            this.b0 = z10;
            boolean z13 = this.Z;
            org.telegram.ui.Cells.b6 b6Var = this.c0;
            if (b6Var != null) {
                this.Z = b6Var.getEditField().isFocused() && this.T.c() && i7 > 0;
            } else {
                this.Z = false;
            }
            if (this.Z && this.Q) {
                v0(0);
            }
            if (this.W != 0 && !(z11 = this.Z) && z11 != z13 && !this.Q) {
                this.W = 0;
                this.T.a();
                this.e.requestLayout();
            }
            if (this.Z && this.U) {
                this.U = false;
                org.telegram.messenger.g0.r(this.z0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        String upperCase;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.l(kVar, 1, i7, getResourceProvider());
        org.telegram.ui.ActionBar.u6.b(this.actionBar, i7, getResourceProvider(), true);
        int i10 = 3;
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.z8, getResourceProvider());
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 5, i7, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.i6 i6Var = null;
        boolean z10 = this.e0;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(this.J ? 2131743871 : 2131743839, null));
        } else if (this.O == 1) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748072, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748073, null));
        }
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hr0(this));
        org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
        if (z10) {
            upperCase = org.telegram.messenger.gd.M0(this.J ? 2131743872 : 2131743840, null);
        } else {
            upperCase = org.telegram.messenger.gd.M0(2131751742, null).toUpperCase();
        }
        this.a = t6.e(1, upperCase);
        this.b = new nr0(this, context);
        wc wcVar = new wc(i10, context, this);
        this.e = wcVar;
        wcVar.setDelegate(this);
        wc wcVar2 = this.e;
        this.fragmentView = wcVar2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, wcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new f61(12, context, i6Var);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.lr.h);
        kVar2.n(350L);
        this.c.setItemAnimator(kVar2);
        this.c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.c.getItemAnimator()).C = false;
        v4.c0 c0Var = new v4.c0(1, false);
        this.d = c0Var;
        this.c.setLayoutManager(c0Var);
        new v4.z(new gi.c(this, 9)).h(this.c);
        frameLayout.addView(this.c, c8.ma.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new h(this, 23));
        this.c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(context, 4);
        this.h = j30Var;
        j30Var.setText(org.telegram.messenger.gd.M0(2131746962, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.d0) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
            org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, this.currentAccount, null, this.resourceProvider);
            this.R = yw0Var;
            yw0Var.E = true;
            yw0Var.F = true;
            yw0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.R, c8.ma.e(-2, org.telegram.messenger.ks.q2, 51));
        }
        this.T = new hi.p3(this.e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l4) {
            org.telegram.ui.Components.ry ryVar = this.S;
            if (ryVar != null) {
                ryVar.Q.g1();
            }
            org.telegram.ui.Cells.b6 b6Var = this.c0;
            if (b6Var != null) {
                int currentTextColor = b6Var.getEditField().getCurrentTextColor();
                this.c0.getEditField().setTextColor(-1);
                this.c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean hideKeyboardOnShow() {
        return this.h0 < 0;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false);
            if (this.actionBar.y()) {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.yw0 yw0Var = this.R;
        if (yw0Var != null) {
            yw0Var.setDelegate(null);
            this.R.f();
        }
        int i10 = this.E;
        this.x[i10] = false;
        int i11 = i10 + 1;
        this.E = i11;
        if (this.r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.r;
                if (i12 < iArr2.length) {
                    i7 = iArr2[i12];
                } else {
                    i7 = this.s + 1;
                    this.s = i7;
                }
                iArr[i12] = i7;
            }
            this.r = iArr;
        }
        if (this.E == this.w.length) {
            this.b.s(this.p0);
        }
        this.b.i(this.p0);
        w0();
        this.g0 = false;
        this.h0 = (this.o0 + this.E) - 1;
        this.b.g(this.q0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new rf(this, f10, 5));
        ofFloat.addListener(new ir0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
        ofFloat.start();
    }

    public final boolean m0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i7 = 0;
            for (int i10 = 0; i10 < Math.min(this.E, charSequenceArr.length); i10++) {
                if (!TextUtils.isEmpty(charSequenceArr[i10])) {
                    i7++;
                }
            }
            boolean z13 = (this.J || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.rn.d0(this.F))) && i7 == todoList.list.size();
            if (z13) {
                for (int i11 = 0; i11 < i7; i11++) {
                    if (!TextUtils.equals(charSequenceArr[i11].toString(), todoList.list.get(i11).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(this.F));
            if (isEmpty) {
                for (int i12 = 0; i12 < this.E && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i12]))); i12++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.e0;
            String M0 = org.telegram.messenger.gd.M0(z14 ? 2131752556 : 2131752562, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(z14 ? 2131752557 : 2131752563, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new qi0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            showDialog(u1Var);
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0() {
        int i7;
        boolean z10;
        boolean z11 = this.M;
        CharSequence[] charSequenceArr = this.w;
        if (z11) {
            int i10 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.x;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i10])) && zArr[i10]) {
                    i7++;
                }
                i10++;
            }
        } else {
            i7 = 0;
        }
        boolean z12 = this.e0;
        int i11 = z12 ? getMessagesController().V6 : org.telegram.messenger.ks.e4;
        int i12 = z12 ? getMessagesController().W6 : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(this.G)) || this.G.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(this.F)) && this.F.length() <= i11) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i13]))) {
                    if (charSequenceArr[i13].length() > i12) {
                        i14 = 0;
                        break;
                    }
                    i14++;
                }
                i13++;
            }
            if (i14 >= (z12 ? 1 : 2) && (!this.M || i7 >= 1)) {
                z10 = true;
                this.a.setEnabled((this.M && i7 == 0) || z10);
                this.a.setAlpha(z10 ? 1.0f : 0.5f);
            }
        }
        z10 = false;
        if (this.M) {
            this.a.setEnabled((this.M && i7 == 0) || z10);
            this.a.setAlpha(z10 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.M && i7 == 0) || z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void o0() {
        if (this.C0) {
            this.S.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.S.setLayoutParams(layoutParams);
            this.W = layoutParams.height;
            this.B0 = this.C0;
            this.C0 = false;
            l0(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        if (!this.Q) {
            return m0(z10);
        }
        if (!z10) {
            return false;
        }
        p0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.g0 || this.h0 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i7);
            this.c.getClass();
            if (RecyclerView.R(view) == this.h0) {
                break;
            } else {
                i7++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.b6) {
            org.telegram.messenger.g0.h3(new qg(((org.telegram.ui.Cells.b6) view).getTextView(), 5), 300L);
            this.h0 = -1;
        }
        this.g0 = false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.V = true;
        if (this.d0) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
            org.telegram.ui.Components.ry ryVar = this.S;
            if (ryVar != null) {
                this.e.removeView(ryVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        if (this.d0) {
            p0(false);
            org.telegram.ui.Components.yw0 yw0Var = this.R;
            if (yw0Var != null) {
                yw0Var.f();
            }
            org.telegram.ui.Cells.b6 b6Var = this.c0;
            if (b6Var != null) {
                b6Var.setEmojiButtonVisibility(false);
                this.c0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.c0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        nr0 nr0Var = this.b;
        if (nr0Var != null) {
            nr0Var.f();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        int i7;
        bi.u uVar;
        super.onThemeColorsChanged();
        try {
            f61 f61Var = this.c;
            if (f61Var == null) {
                return;
            }
            for (int i10 = 0; i10 < f61Var.getChildCount(); i10++) {
                View childAt = f61Var.getChildAt(i10);
                v4.f1 T = f61Var.T(childAt);
                if (T != null && (((i7 = T.f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.b6) && (uVar = ((org.telegram.ui.Cells.b6) childAt).d) != null)) {
                    uVar.setTextColor(org.telegram.ui.ActionBar.n6.r1(uVar.isEnabled() ? 1.0f : 0.6f, getThemedColor(org.telegram.ui.ActionBar.n6.G6)));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.d0) {
            int i7 = 1;
            if (this.Q) {
                org.telegram.ui.Components.ry ryVar = this.S;
                ryVar.Q.C0();
                ryVar.J.scrollTo(0, 0);
                ryVar.F(1);
                ryVar.R.h1(0, 0);
                this.S.t(false);
                if (z10) {
                    this.S.A();
                }
                this.C0 = false;
                v0(0);
            }
            if (z10) {
                org.telegram.ui.Components.ry ryVar2 = this.S;
                if (ryVar2 == null || ryVar2.getVisibility() != 0) {
                    q0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                ofFloat.addUpdateListener(new gr0(this, i7));
                ofFloat.addListener(new ir0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                ofFloat.start();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.ry ryVar;
        org.telegram.ui.Components.yg emojiButton;
        if (!this.Q && (ryVar = this.S) != null && ryVar.getVisibility() != 8) {
            org.telegram.ui.Cells.b6 b6Var = this.c0;
            if (b6Var != null && (emojiButton = b6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.wg.e, false);
            }
            this.S.setVisibility(8);
        }
        int i7 = this.W;
        this.W = 0;
        if (i7 != 0) {
            this.T.a();
        }
    }

    public final void r0() {
        this.T.e = true;
        EditTextBoldCursor editField = this.c0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.I3(editField);
        v0(org.telegram.messenger.g0.D ? 0 : 2);
        if (org.telegram.messenger.g0.D || this.Z || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.U = true;
        m4 m4Var = this.z0;
        org.telegram.messenger.g0.r(m4Var);
        org.telegram.messenger.g0.h3(m4Var, 100L);
    }

    public final void s0(ag agVar) {
        this.f0 = agVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10) {
        u0(messageMedia, z10, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z10, int i7) {
        int i10;
        this.A0 = messageMedia;
        this.J = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.F = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m10;
            Spannable B5 = org.telegram.messenger.fj.B5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = B5;
            org.telegram.messenger.fj.b(B5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i11 = 0;
            while (true) {
                i10 = this.E;
                if (i11 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i11).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i11] = spannableStringBuilder2;
                charSequenceArr[i11] = org.telegram.messenger.j6.m(charSequenceArr[i11], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i11] = org.telegram.messenger.fj.B5(charSequenceArr[i11], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.fj.b(charSequenceArr[i11], tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i11] = tL_messageMediaToDo.todo.list.get(i11).id;
                this.s = Math.max(this.s, this.r[i11]);
                i11++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i10 + 1;
                w0();
                this.g0 = true;
                this.h0 = this.o0 + (i7 < 0 ? this.E - 1 : i7);
            }
        }
    }

    public final void v0(int i7) {
        org.telegram.ui.Cells.b6 b6Var;
        if (this.d0) {
            int i10 = 0;
            int i11 = 1;
            if (i7 != 1) {
                org.telegram.ui.Components.yg emojiButton = this.c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.wg.e, true);
                }
                org.telegram.ui.Components.ry ryVar = this.S;
                if (ryVar != null) {
                    this.Q = false;
                    this.C0 = false;
                    if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        ryVar.setVisibility(8);
                    }
                }
                if (i7 == 0) {
                    this.W = 0;
                }
                this.T.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.ry ryVar2 = this.S;
            boolean z10 = ryVar2 != null && ryVar2.getVisibility() == 0;
            org.telegram.ui.Components.ry ryVar3 = this.S;
            if (ryVar3 != null && ryVar3.d1 != org.telegram.messenger.j10.t0) {
                this.e.removeView(ryVar3);
                this.S = null;
            }
            if (this.S == null) {
                org.telegram.ui.Components.ry ryVar4 = new org.telegram.ui.Components.ry(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.S = ryVar4;
                ryVar4.y2 = false;
                ryVar4.V0 = false;
                ryVar4.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.S.setForseMultiwindowLayout(true);
                }
                this.S.setDelegate(new jr0(this));
                this.e.addView(this.S);
            }
            this.S.setVisibility(0);
            this.Q = true;
            org.telegram.ui.Components.ry ryVar5 = this.S;
            if (this.X <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.X = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.X = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.Y <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.Y = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.Y = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int i12 = point.x > point.y ? this.Y : this.X;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar5.getLayoutParams();
            layoutParams.height = i12;
            ryVar5.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (b6Var = this.c0) != null) {
                org.telegram.messenger.g0.v1(b6Var.getEditField());
            }
            this.W = i12;
            this.T.a();
            this.e.requestLayout();
            org.telegram.ui.Components.yg emojiButton2 = this.c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.wg.d, true);
            }
            if (z10 || this.Z) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            ofFloat.addUpdateListener(new gr0(this, i10));
            ofFloat.addListener(new ir0(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.w);
            ofFloat.start();
        }
    }

    public final void w0() {
        this.i0 = -1;
        this.j0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.u0 = -1;
        this.x0 = -1;
        this.r0 = -1;
        this.y0 = 0;
        boolean z10 = this.e0;
        if (!z10 || !this.J) {
            this.i0 = 0;
            this.j0 = 1;
            this.m0 = 2;
            this.y0 = 4;
            this.n0 = 3;
        }
        int i7 = this.E;
        if (i7 != 0) {
            int i10 = this.y0;
            this.o0 = i10;
            this.y0 = i10 + i7;
        }
        if (i7 != this.w.length) {
            int i11 = this.y0;
            this.y0 = i11 + 1;
            this.p0 = i11;
        }
        int i12 = this.y0;
        int i13 = i12 + 1;
        this.y0 = i13;
        this.q0 = i12;
        if (z10 && this.J) {
            return;
        }
        int i14 = i12 + 2;
        this.y0 = i14;
        this.r0 = i13;
        if (z10) {
            int i15 = i12 + 3;
            this.y0 = i15;
            this.w0 = i14;
            if (this.K) {
                this.y0 = i12 + 4;
                this.v0 = i15;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!org.telegram.messenger.v3.T(chat) || chat.megagroup) {
            int i16 = this.y0;
            this.y0 = i16 + 1;
            this.s0 = i16;
        }
        int i17 = this.O;
        if (i17 != 1) {
            int i18 = this.y0;
            this.y0 = i18 + 1;
            this.t0 = i18;
        }
        if (i17 == 0) {
            int i19 = this.y0;
            this.y0 = i19 + 1;
            this.u0 = i19;
        }
        int i20 = this.y0;
        int i21 = i20 + 1;
        this.y0 = i21;
        this.x0 = i20;
        if (this.M) {
            this.k0 = i21;
            this.y0 = i20 + 3;
            this.l0 = i20 + 2;
        }
    }
}
