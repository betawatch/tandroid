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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.qt0 {
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
    public org.telegram.ui.Components.ow0 Q;
    public org.telegram.ui.Components.gy R;
    public fi.q3 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.r0 a;
    public boolean a0;
    public nr0 b;
    public org.telegram.ui.Cells.a6 b0;
    public e61 c;
    public final boolean c0;
    public v4.b0 d;
    public final boolean d0;
    public xc e;
    public or0 e0;
    public final an f;
    public boolean f0;
    public int g0;
    public org.telegram.ui.Components.y20 h;
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

    public pr0(an anVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.g0.L(3.0f);
        this.g0 = -1;
        this.y0 = new m4(this, 14);
        this.d0 = true;
        int i7 = getMessagesController().R6;
        this.n = i7;
        this.w = new CharSequence[i7];
        this.x = new boolean[i7];
        this.f = anVar;
        this.c0 = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(this.currentAccount).a).q();
        this.L = false;
        this.N = 2;
    }

    public static void h0(pr0 pr0Var, View view, int i7) {
        int length;
        int i10;
        boolean z9 = pr0Var.d0;
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            if (i7 == pr0Var.i0) {
                i10 = z9 ? pr0Var.getMessagesController().S6 : org.telegram.messenger.qs.e4;
                CharSequence charSequence = pr0Var.E;
                length = i10 - (charSequence != null ? charSequence.length() : 0);
            } else if (i7 == pr0Var.j0) {
                Editable editable = pr0Var.F;
                int length2 = editable != null ? editable.length() : 0;
                i10 = org.telegram.messenger.qs.e3;
                length = 200 - length2;
            } else {
                int i11 = pr0Var.n0;
                if (i7 < i11 || i7 >= pr0Var.D + i11) {
                    return;
                }
                int i12 = i7 - i11;
                int i13 = z9 ? pr0Var.getMessagesController().T6 : 100;
                CharSequence charSequence2 = pr0Var.w[i12];
                length = i13 - (charSequence2 != null ? charSequence2.length() : 0);
                i10 = i13;
            }
            float f10 = i10;
            if (length > f10 - (0.7f * f10)) {
                a6Var.setText2("");
                return;
            }
            a6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.k5 textView2 = a6Var.getTextView2();
            int i14 = length < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
            org.telegram.ui.ActionBar.r6.Y(textView2, i14, null);
            textView2.setTag(Integer.valueOf(i14));
        }
    }

    public static void i0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        if (pr0Var.c0 && z9) {
            if (pr0Var.b0 == a6Var && pr0Var.P && pr0Var.B0) {
                pr0Var.o0();
                pr0Var.P = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = pr0Var.b0;
            pr0Var.b0 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.jg emojiButton = a6Var.getEmojiButton();
            org.telegram.ui.Components.hg hgVar = org.telegram.ui.Components.hg.e;
            emojiButton.j(hgVar, false);
            e61 e61Var = pr0Var.c;
            View F = e61Var.F(a6Var);
            v4.d1 T = F == null ? null : e61Var.T(F);
            org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
            if (ow0Var != null) {
                ow0Var.f();
                org.telegram.ui.Components.ow0 ow0Var2 = pr0Var.Q;
                if (ow0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && ow0Var2.getDelegate() != view) {
                        pr0Var.Q.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 == null || a6Var2 == a6Var) {
                return;
            }
            if (pr0Var.P) {
                pr0Var.o0();
                pr0Var.p0(false);
                pr0Var.r0();
            }
            a6Var2.setEmojiButtonVisibility(false);
            a6Var2.getEmojiButton().j(hgVar, false);
        }
    }

    public static void j0(pr0 pr0Var, org.telegram.ui.Cells.a6 a6Var) {
        pr0Var.b0 = a6Var;
        if (!pr0Var.P) {
            pr0Var.v0(1);
        } else {
            pr0Var.o0();
            pr0Var.r0();
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        boolean z10;
        if (this.c0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Y && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z9) {
                    this.X = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                int i10 = z9 ? this.X : this.W;
                if (this.B0) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = org.telegram.messenger.g0.q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.A0 != this.B0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.e.requestLayout();
                    boolean z11 = this.A0;
                    if (z11 != this.B0) {
                        l0(z11 ? -org.telegram.messenger.g0.L(120.0f) : org.telegram.messenger.g0.L(120.0f));
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z == i7 && this.a0 == z9) {
                return;
            }
            this.Z = i7;
            this.a0 = z9;
            boolean z12 = this.Y;
            org.telegram.ui.Cells.a6 a6Var = this.b0;
            if (a6Var != null) {
                this.Y = a6Var.getEditField().isFocused() && this.S.c() && i7 > 0;
            } else {
                this.Y = false;
            }
            if (this.Y && this.P) {
                v0(0);
            }
            if (this.V != 0 && !(z10 = this.Y) && z10 != z12 && !this.P) {
                this.V = 0;
                this.S.a();
                this.e.requestLayout();
            }
            if (this.Y && this.T) {
                this.T = false;
                org.telegram.messenger.g0.r(this.y0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        String upperCase;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(this.actionBar, i7, getResourceProvider(), true);
        int i10 = 3;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.z8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i7, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.f6 f6Var = null;
        boolean z9 = this.d0;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(this.I ? 2131744107 : 2131744075, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748263, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748264, null));
        }
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hr0(this));
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        if (z9) {
            upperCase = org.telegram.messenger.hd.M0(this.I ? 2131744108 : 2131744076, null);
        } else {
            upperCase = org.telegram.messenger.hd.M0(2131751753, null).toUpperCase();
        }
        this.a = q10.e(1, upperCase);
        this.b = new nr0(this, context);
        xc xcVar = new xc(i10, context, this);
        this.e = xcVar;
        xcVar.setDelegate(this);
        xc xcVar2 = this.e;
        this.fragmentView = xcVar2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, xcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new e61(12, context, f6Var);
        v4.k kVar2 = new v4.k();
        kVar2.m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.xq.h);
        kVar2.n(350L);
        this.c.setItemAnimator(kVar2);
        this.c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.c.getItemAnimator()).C = false;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        this.c.setLayoutManager(b0Var);
        new v4.y(new ei.d(this, 9)).h(this.c);
        frameLayout.addView(this.c, c8.ha.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new h(this, 23));
        this.c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(context, 4);
        this.h = y20Var;
        y20Var.setText(org.telegram.messenger.hd.M0(2131747154, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.c0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
            org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = ow0Var;
            ow0Var.D = true;
            ow0Var.E = true;
            ow0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.Q, c8.ha.e(-2, org.telegram.messenger.qs.q2, 51));
        }
        this.S = new fi.q3(this.e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.ui.Components.gy gyVar = this.R;
            if (gyVar != null) {
                gyVar.P.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.b0;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.b0.getEditField().setTextColor(-1);
                this.b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean hideKeyboardOnShow() {
        return this.g0 < 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.actionBar.v()) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.ow0 ow0Var = this.Q;
        if (ow0Var != null) {
            ow0Var.setDelegate(null);
            this.Q.f();
        }
        int i10 = this.D;
        this.x[i10] = false;
        int i11 = i10 + 1;
        this.D = i11;
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
        if (this.D == this.w.length) {
            this.b.s(this.o0);
        }
        this.b.i(this.o0);
        w0();
        this.f0 = false;
        this.g0 = (this.n0 + this.D) - 1;
        this.b.g(this.p0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new sf(this, f10, 3));
        ofFloat.addListener(new ir0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
        ofFloat.start();
    }

    public final boolean m0(boolean z9) {
        TLRPC.MessageMedia messageMedia = this.z0;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z11 = false;
        if (z10) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i7 = 0;
            for (int i10 = 0; i10 < Math.min(this.D, charSequenceArr.length); i10++) {
                if (!TextUtils.isEmpty(charSequenceArr[i10])) {
                    i7++;
                }
            }
            boolean z12 = (this.I || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.bn.d0(this.E))) && i7 == todoList.list.size();
            if (z12) {
                for (int i11 = 0; i11 < i7; i11++) {
                    if (!TextUtils.equals(charSequenceArr[i11].toString(), todoList.list.get(i11).title.text)) {
                        break;
                    }
                }
            }
            z11 = z12;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(this.E));
            if (isEmpty) {
                for (int i12 = 0; i12 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i12]))); i12++) {
                }
            }
            z11 = isEmpty;
        }
        if (z9 && !z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.d0;
            String M0 = org.telegram.messenger.hd.M0(z13 ? 2131752567 : 2131752573, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(z13 ? 2131752568 : 2131752574, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747579, null), new li0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            showDialog(u1Var);
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0() {
        int i7;
        boolean z9;
        boolean z10 = this.L;
        CharSequence[] charSequenceArr = this.w;
        if (z10) {
            int i10 = 0;
            i7 = 0;
            while (true) {
                boolean[] zArr = this.x;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i10])) && zArr[i10]) {
                    i7++;
                }
                i10++;
            }
        } else {
            i7 = 0;
        }
        boolean z11 = this.d0;
        int i11 = z11 ? getMessagesController().S6 : org.telegram.messenger.qs.e4;
        int i12 = z11 ? getMessagesController().T6 : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(this.F)) || this.F.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(this.E)) && this.E.length() <= i11) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.bn.d0(charSequenceArr[i13]))) {
                    if (charSequenceArr[i13].length() > i12) {
                        i14 = 0;
                        break;
                    }
                    i14++;
                }
                i13++;
            }
            if (i14 >= (z11 ? 1 : 2) && (!this.L || i7 >= 1)) {
                z9 = true;
                this.a.setEnabled((this.L && i7 == 0) || z9);
                this.a.setAlpha(z9 ? 1.0f : 0.5f);
            }
        }
        z9 = false;
        if (this.L) {
            this.a.setEnabled((this.L && i7 == 0) || z9);
            this.a.setAlpha(z9 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.L && i7 == 0) || z9);
        this.a.setAlpha(z9 ? 1.0f : 0.5f);
    }

    public final void o0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            l0(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!this.P) {
            return m0(z9);
        }
        if (!z9) {
            return false;
        }
        p0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.f0 || this.g0 < 0) {
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
            if (RecyclerView.R(view) == this.g0) {
                break;
            } else {
                i7++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.messenger.g0.i3(new sg(((org.telegram.ui.Cells.a6) view).getTextView(), 5), 300L);
            this.g0 = -1;
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.c0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
            org.telegram.ui.Components.gy gyVar = this.R;
            if (gyVar != null) {
                this.e.removeView(gyVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        if (this.c0) {
            p0(false);
            org.telegram.ui.Components.ow0 ow0Var = this.Q;
            if (ow0Var != null) {
                ow0Var.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.b0;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.b0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.b0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        nr0 nr0Var = this.b;
        if (nr0Var != null) {
            nr0Var.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        int i7;
        org.telegram.ui.Cells.z5 z5Var;
        super.onThemeColorsChanged();
        try {
            e61 e61Var = this.c;
            if (e61Var == null) {
                return;
            }
            for (int i10 = 0; i10 < e61Var.getChildCount(); i10++) {
                View childAt = e61Var.getChildAt(i10);
                v4.d1 T = e61Var.T(childAt);
                if (T != null && (((i7 = T.f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.a6) && (z5Var = ((org.telegram.ui.Cells.a6) childAt).d) != null)) {
                    z5Var.setTextColor(org.telegram.ui.ActionBar.k6.r1(z5Var.isEnabled() ? 1.0f : 0.6f, getThemedColor(org.telegram.ui.ActionBar.k6.G6)));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.c0) {
            int i7 = 1;
            if (this.P) {
                org.telegram.ui.Components.gy gyVar = this.R;
                gyVar.P.C0();
                gyVar.I.scrollTo(0, 0);
                gyVar.E(1);
                gyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z9) {
                    this.R.A();
                }
                this.B0 = false;
                v0(0);
            }
            if (z9) {
                org.telegram.ui.Components.gy gyVar2 = this.R;
                if (gyVar2 == null || gyVar2.getVisibility() != 0) {
                    q0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                ofFloat.addUpdateListener(new gr0(this, i7));
                ofFloat.addListener(new ir0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                ofFloat.start();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.gy gyVar;
        org.telegram.ui.Components.jg emojiButton;
        if (!this.P && (gyVar = this.R) != null && gyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.b0;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.hg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i7 = this.V;
        this.V = 0;
        if (i7 != 0) {
            this.S.a();
        }
    }

    public final void r0() {
        this.S.e = true;
        EditTextBoldCursor editField = this.b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        v0(org.telegram.messenger.g0.D ? 0 : 2);
        if (org.telegram.messenger.g0.D || this.Y || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) {
            return;
        }
        this.T = true;
        m4 m4Var = this.y0;
        org.telegram.messenger.g0.r(m4Var);
        org.telegram.messenger.g0.i3(m4Var, 100L);
    }

    public final void s0(dg dgVar) {
        this.e0 = dgVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z9) {
        u0(messageMedia, z9, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z9, int i7) {
        int i10;
        this.z0 = messageMedia;
        this.I = z9;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable C5 = org.telegram.messenger.ij.C5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = C5;
            org.telegram.messenger.ij.b(C5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i11 = 0;
            while (true) {
                i10 = this.D;
                if (i11 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i11).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i11] = spannableStringBuilder2;
                charSequenceArr[i11] = org.telegram.messenger.i6.m(charSequenceArr[i11], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i11] = org.telegram.messenger.ij.C5(charSequenceArr[i11], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.ij.b(charSequenceArr[i11], tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i11] = tL_messageMediaToDo.todo.list.get(i11).id;
                this.s = Math.max(this.s, this.r[i11]);
                i11++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i10 + 1;
                w0();
                this.f0 = true;
                this.g0 = this.n0 + (i7 < 0 ? this.D - 1 : i7);
            }
        }
    }

    public final void v0(int i7) {
        org.telegram.ui.Cells.a6 a6Var;
        if (this.c0) {
            int i10 = 0;
            int i11 = 1;
            if (i7 != 1) {
                org.telegram.ui.Components.jg emojiButton = this.b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.hg.e, true);
                }
                org.telegram.ui.Components.gy gyVar = this.R;
                if (gyVar != null) {
                    this.P = false;
                    this.B0 = false;
                    if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                        gyVar.setVisibility(8);
                    }
                }
                if (i7 == 0) {
                    this.V = 0;
                }
                this.S.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.gy gyVar2 = this.R;
            boolean z9 = gyVar2 != null && gyVar2.getVisibility() == 0;
            org.telegram.ui.Components.gy gyVar3 = this.R;
            if (gyVar3 != null && gyVar3.c1 != org.telegram.messenger.p10.s0) {
                this.e.removeView(gyVar3);
                this.R = null;
            }
            if (this.R == null) {
                org.telegram.ui.Components.gy gyVar4 = new org.telegram.ui.Components.gy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.R = gyVar4;
                gyVar4.x2 = false;
                gyVar4.U0 = false;
                gyVar4.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.R.setForseMultiwindowLayout(true);
                }
                this.R.setDelegate(new jr0(this));
                this.e.addView(this.R);
            }
            this.R.setVisibility(0);
            this.P = true;
            org.telegram.ui.Components.gy gyVar5 = this.R;
            if (this.W <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.W = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.W = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.X <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.X = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.X = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.q;
            int i12 = point.x > point.y ? this.X : this.W;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gyVar5.getLayoutParams();
            layoutParams.height = i12;
            gyVar5.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.b0) != null) {
                org.telegram.messenger.g0.v1(a6Var.getEditField());
            }
            this.V = i12;
            this.S.a();
            this.e.requestLayout();
            org.telegram.ui.Components.jg emojiButton2 = this.b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.hg.d, true);
            }
            if (z9 || this.Y) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            ofFloat.addUpdateListener(new gr0(this, i10));
            ofFloat.addListener(new ir0(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.w);
            ofFloat.start();
        }
    }

    public final void w0() {
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
        boolean z9 = this.d0;
        if (!z9 || !this.I) {
            this.h0 = 0;
            this.i0 = 1;
            this.l0 = 2;
            this.x0 = 4;
            this.m0 = 3;
        }
        int i7 = this.D;
        if (i7 != 0) {
            int i10 = this.x0;
            this.n0 = i10;
            this.x0 = i10 + i7;
        }
        if (i7 != this.w.length) {
            int i11 = this.x0;
            this.x0 = i11 + 1;
            this.o0 = i11;
        }
        int i12 = this.x0;
        int i13 = i12 + 1;
        this.x0 = i13;
        this.p0 = i12;
        if (z9 && this.I) {
            return;
        }
        int i14 = i12 + 2;
        this.x0 = i14;
        this.q0 = i13;
        if (z9) {
            int i15 = i12 + 3;
            this.x0 = i15;
            this.v0 = i14;
            if (this.J) {
                this.x0 = i12 + 4;
                this.u0 = i15;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
            int i16 = this.x0;
            this.x0 = i16 + 1;
            this.r0 = i16;
        }
        int i17 = this.N;
        if (i17 != 1) {
            int i18 = this.x0;
            this.x0 = i18 + 1;
            this.s0 = i18;
        }
        if (i17 == 0) {
            int i19 = this.x0;
            this.x0 = i19 + 1;
            this.t0 = i19;
        }
        int i20 = this.x0;
        int i21 = i20 + 1;
        this.x0 = i21;
        this.w0 = i20;
        if (this.L) {
            this.j0 = i21;
            this.x0 = i20 + 3;
            this.k0 = i20 + 2;
        }
    }
}
