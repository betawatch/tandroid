package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class z41 extends rg.b {
    public lg.f F;
    public w41 J;
    public w41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.q10 N;
    public boolean O;
    public final ck0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public org.telegram.messenger.q10 w;
    public final org.telegram.ui.ActionBar.i6 x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.s1 P = new org.telegram.ui.ActionBar.s1(this, 2);

    public z41(ck0 ck0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = ck0Var;
        this.e = context;
        this.f = i7;
        this.h = i10;
        this.n = z10;
        this.w = q10Var;
        this.x = i6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 < 10000) {
            return i7 == 7 || i7 == 8 || i7 == 38 || i7 == 31 || i7 == -4 || i7 == 28 || i7 == 2 || i7 == -2;
        }
        k41 G = l41.G(i7);
        return G != null && G.g();
    }

    @Override // org.telegram.ui.Components.bk0
    public boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        l41 G = G(f1Var.b());
        if (i7 >= 10000) {
            k41 G2 = l41.G(i7);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i7 != 3 && i7 != 5 && i7 != 6 && i7 != 30 && i7 != 4 && i7 != 10 && i7 != 44 && i7 != 11 && i7 != 12 && i7 != 17 && i7 != 16 && i7 != 29 && i7 != 25 && i7 != 27 && i7 != 32 && i7 != 33 && i7 != 35 && i7 != 36 && i7 != 37 && i7 != 41 && i7 != 39 && i7 != 40 && i7 != 38) {
            return false;
        }
        return G == null || G.g;
    }

    public final void F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.I;
            if (i7 >= arrayList.size()) {
                return;
            }
            w41 w41Var = (w41) arrayList.get(i7);
            this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(w41Var.a, w41Var.b + 1)));
            this.M = false;
        }
    }

    public final l41 G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (l41) arrayList.get(i7);
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            w41 w41Var = (w41) arrayList.get(i10);
            if (i7 >= w41Var.a && i7 <= w41Var.b) {
                return i10;
            }
            i10++;
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.n6.w0(i7, this.x);
    }

    public final boolean J(int i7) {
        l41 G = G(i7);
        l41 G2 = G(i7 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        w41 w41Var = this.K;
        if (w41Var != null) {
            w41Var.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        w41 w41Var = new w41();
        this.K = w41Var;
        w41Var.a = this.E.size();
        w41 w41Var2 = this.K;
        w41Var2.b = -1;
        this.I.add(w41Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i7) {
        if (!this.r) {
            return false;
        }
        ck0 ck0Var = this.d;
        if (ck0Var != null && ck0Var.b1() && ck0Var.getSectionsDrawBackground()) {
            return false;
        }
        if (i7 >= 10000) {
            return true;
        }
        switch (i7) {
            case -5:
            case -3:
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            case 29:
            case org.telegram.messenger.ks.T /* 30 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return true;
            case -4:
            case -2:
            case -1:
            case 2:
            case 7:
            case 8:
            case 26:
            case org.telegram.messenger.ks.U /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z10) {
        ck0 ck0Var = this.d;
        if (ck0Var == null || !ck0Var.c0()) {
            Q(z10);
        } else {
            ck0Var.post(new pp0(6, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.c6) {
            ((org.telegram.ui.ActionBar.c6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i7 = org.telegram.ui.ActionBar.u6.b;
            if (N(f1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i7)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.n6.h5 : org.telegram.ui.ActionBar.n6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i7));
        }
    }

    public final void Q(boolean z10) {
        ck0 ck0Var = this.d;
        if (ck0Var == null || !ck0Var.c0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.q10 q10Var = this.w;
            if (q10Var != null) {
                q10Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.f1 f1Var, boolean z10) {
        if (f1Var == null) {
            return;
        }
        View view = f1Var.a;
        int i7 = f1Var.f;
        if (i7 < 10000) {
            if (i7 != 16) {
                return;
            }
            ((kg.s1) view).setReorder(z10);
        } else {
            k41 G = l41.G(i7);
            if (G != null) {
                G.a(this.d, view, G(f1Var.b()));
            }
        }
    }

    public final void S() {
        ck0 ck0Var = this.d;
        if (ck0Var == null) {
            return;
        }
        ArrayList arrayList = ck0Var.L2;
        if (arrayList == null) {
            ck0Var.L2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            w41 w41Var = (w41) obj;
            ck0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(w41Var.a, w41Var.b)));
        }
    }

    public final void T() {
        ArrayList arrayList = this.y;
        arrayList.clear();
        ArrayList arrayList2 = this.E;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.H.clear();
        this.I.clear();
        org.telegram.messenger.q10 q10Var = this.w;
        if (q10Var != null) {
            q10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        w41 w41Var = this.J;
        if (w41Var != null) {
            w41Var.b = Math.max(0, (this.E.size() + this.G) - 1);
            w41 w41Var2 = this.J;
            if (w41Var2.a == w41Var2.b) {
                this.H.remove(w41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        w41 w41Var = new w41();
        this.J = w41Var;
        w41Var.a = this.E.size() + this.G;
        w41 w41Var2 = this.J;
        w41Var2.b = -1;
        this.H.add(w41Var2);
    }

    @Override // v4.i0
    public final int b() {
        return this.E.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        l41 G = G(i7);
        if (G == null) {
            return 0;
        }
        return G.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(v4.f1 f1Var, int i7) {
        String str;
        org.telegram.ui.Cells.z8 z8Var;
        ?? r92;
        TLRPC.Document document;
        long j3;
        String str2;
        org.telegram.messenger.fc fcVar;
        TLRPC.Photo photo;
        long j10;
        char c10;
        boolean z10;
        boolean z11;
        long j11;
        CharSequence concat;
        int i10;
        int i11 = this.f;
        ck0 ck0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = this.x;
        l41 G = G(i7);
        l41 G2 = G(i7 + 1);
        l41 G3 = G(i7 - 1);
        if (G == null) {
            return;
        }
        int i12 = f1Var.f;
        View view = f1Var.a;
        boolean J = J(i7);
        P(f1Var);
        if (i12 < 10000) {
            long j12 = 0;
            str = "";
            boolean z12 = true;
            switch (i12) {
                case -5:
                    hk0 hk0Var = (hk0) view;
                    if (hk0Var.getChildCount() != (G.c == null ? 0 : 1) || hk0Var.getChildAt(0) != G.c) {
                        hk0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            org.telegram.messenger.g0.E2(view2);
                            hk0Var.addView(G.c, c8.ma.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case -4:
                case -2:
                case -1:
                    FrameLayout frameLayout = (FrameLayout) view;
                    frameLayout.setClipChildren(!G.e);
                    frameLayout.setClipToPadding(!G.e);
                    if (frameLayout.getChildCount() != (G.c == null ? 0 : 1) || frameLayout.getChildAt(0) != G.c) {
                        frameLayout.removeAllViews();
                        View view3 = G.c;
                        if (view3 != null) {
                            org.telegram.messenger.g0.E2(view3);
                            frameLayout.addView(G.c, (i12 == -1 || i12 == -4) ? c8.ma.c(G.A, -1) : c8.ma.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    v41 v41Var = (v41) view;
                    v41Var.setMinusHeight(G.A);
                    v41Var.setMinusPadding(c8.dd.a(G.z, 1));
                    if (v41Var.getChildCount() != (G.c == null ? 0 : 1) || v41Var.getChildAt(0) != G.c) {
                        v41Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            org.telegram.messenger.g0.E2(view4);
                            v41Var.addView(G.c, c8.ma.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(G.m);
                    n4Var.b(G.g);
                    break;
                case 2:
                    o01 o01Var = (o01) view;
                    int i13 = G.k;
                    if (i13 == 0) {
                        int i14 = G.A;
                        if (i14 != 0) {
                            o01Var.setEmojiSize(i14);
                        }
                        String charSequence = G.n.toString();
                        String charSequence2 = G.o.toString();
                        o01Var.getClass();
                        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.t0).h2(o01Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.r) {
                        o01Var.setEmojiStatic(i13);
                    } else {
                        o01Var.setEmoji(i13);
                    }
                    if (!TextUtils.isEmpty(G.p)) {
                        o01Var.a(G.m, G.p);
                        break;
                    } else {
                        o01Var.setText(G.m);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    Object obj = G.H;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.m;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        m8Var.x = m8Var.getDefaultImageLeft();
                        m8Var.s = m8Var.c(false);
                        org.telegram.ui.ActionBar.n5 n5Var = m8Var.a;
                        n5Var.l(charSequence3, false);
                        n5Var.i(null);
                        n6 n6Var = m8Var.c;
                        m8Var.R = null;
                        n6Var.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        n6Var.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        ph0 ph0Var = m8Var.e;
                        ph0Var.setVisibility(8);
                        ph0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r12 = m8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        m8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.m;
                        String str3 = (String) obj;
                        m8Var.x = m8Var.getDefaultImageLeft();
                        m8Var.s = m8Var.c(false);
                        org.telegram.ui.ActionBar.n5 n5Var2 = m8Var.a;
                        n5Var2.l(charSequence4, false);
                        n5Var2.i(null);
                        n6 n6Var2 = m8Var.c;
                        m8Var.R = null;
                        n6Var2.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        n6Var2.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        ph0 ph0Var2 = m8Var.e;
                        ph0Var2.setVisibility(8);
                        ph0Var2.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r13 = m8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        m8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.o)) {
                        Object obj2 = G.H;
                        if (obj2 instanceof Drawable) {
                            m8Var.p(G.m, (Drawable) obj2, J);
                        } else {
                            int i15 = G.k;
                            if (i15 == 0) {
                                m8Var.k(G.m, J);
                            } else {
                                m8Var.o(i15, G.m, J);
                            }
                        }
                    } else {
                        Object obj3 = G.H;
                        if (obj3 instanceof Drawable) {
                            m8Var.t(G.m, G.o, (Drawable) obj3, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                m8Var.q(G.m, G.o, false, J);
                            } else {
                                m8Var.u(G.m, G.o, false, i16, J);
                            }
                        }
                    }
                    if (G.r) {
                        int i17 = org.telegram.ui.ActionBar.n6.q6;
                        m8Var.g(i17, i17);
                    } else if (G.s) {
                        m8Var.g(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
                    } else {
                        m8Var.g(org.telegram.ui.ActionBar.n6.m6, org.telegram.ui.ActionBar.n6.G6);
                    }
                    m8Var.h(45, G.u, true);
                    m8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (r8Var.b == G.d) {
                        r8Var.setChecked(G.e);
                    }
                    r8Var.e(null, G.g);
                    r8Var.f(G.m, G.e, J);
                    r8Var.b = G.d;
                    if (i12 == 9) {
                        org.telegram.ui.ActionBar.u6.h(G.e ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                    CharSequence charSequence5 = G.n;
                    i5Var.b(G.m, G.n, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.i5) view).b(G.m, G.n, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i12 == 7 || i12 == 8) {
                        org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                        if (TextUtils.isEmpty(G.m)) {
                            z8Var2.setFixedSize(i12 == 8 ? org.telegram.messenger.ks.x3 : 12);
                            z8Var2.setText("");
                        } else {
                            z8Var2.setFixedSize(0);
                            z8Var2.setText(G.m);
                        }
                        if (G.r) {
                            z8Var2.setTextGravity(17);
                            z8Var2.getTextView().setWidth(Math.min(hi.m3.a(z8Var2.getText(), z8Var2.getTextView().getPaint()), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(60.0f)));
                            z8Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            z8Var = z8Var2;
                        } else {
                            z8Var2.setTextGravity(8388611);
                            z8Var2.getTextView().setMinWidth(0);
                            z8Var2.getTextView().setMaxWidth(org.telegram.messenger.g0.q.x);
                            z8Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            z8Var = z8Var2;
                        }
                    } else if (i12 == 38) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                        CharSequence charSequence6 = G.p;
                        boolean z13 = G.f;
                        d2Var.a.setText(charSequence6);
                        View view5 = d2Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(lr.h).start();
                        if (G.r) {
                            d2Var.setColor(org.telegram.ui.ActionBar.n6.q6);
                            z8Var = d2Var;
                        } else if (G.s) {
                            d2Var.setColor(org.telegram.ui.ActionBar.n6.p7);
                            z8Var = d2Var;
                        } else {
                            d2Var.setColor(org.telegram.ui.ActionBar.n6.G6);
                            z8Var = d2Var;
                        }
                    } else {
                        z8Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!ck0Var.b1()) {
                        Drawable X0 = org.telegram.ui.ActionBar.n6.X0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.b7, i6Var));
                        if (!this.n) {
                            z8Var.setBackground(X0);
                            break;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.n6.i5;
                            z8Var.setBackground(new LayerDrawable(new Drawable[]{I(i18) == org.telegram.ui.ActionBar.n6.w0(i18, i6Var) ? new y41(i18, i6Var) : new ColorDrawable(I(i18)), X0}));
                            break;
                        }
                    } else {
                        z8Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                    int i19 = v2Var.a;
                    TextView textView = v2Var.b;
                    TextView textView2 = v2Var.c;
                    RadioButton radioButton = v2Var.d;
                    if (i19 == G.d) {
                        radioButton.a(G.e, true);
                        v2Var.a(G.g, true);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        v2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence7 = G.m;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r92);
                        v2Var.e = J;
                        v2Var.b();
                        v2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.m;
                        CharSequence charSequence9 = G.o;
                        boolean z17 = G.e;
                        textView2.setVisibility(r92);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r92);
                        v2Var.e = J;
                        v2Var.b();
                        v2Var.setWillNotDraw(!J);
                    }
                    v2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
                    qaVar.g(i11, G, J);
                    if (i12 == 12) {
                        qaVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.qa qaVar2 = (org.telegram.ui.Cells.qa) view;
                    qaVar2.g(i11, G, J);
                    CharSequence charSequence10 = G.o;
                    qaVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    qaVar2.setAddButtonVisible(!G.e);
                    qaVar2.setCloseIcon(G.E);
                    break;
                case 14:
                    eu0 eu0Var = (eu0) view;
                    eu0Var.b(G.A, null, G.q);
                    eu0Var.setMinAllowedIndex((int) G.C);
                    eu0Var.setCallback(new iy(G, 24));
                    break;
                case 15:
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                    t7Var.d(G.A, (org.telegram.ui.Cells.s7) G.H, G.D);
                    t7Var.setMinValueAllowed((int) G.C);
                    break;
                case 16:
                    kg.s1 s1Var = (kg.s1) view;
                    s1Var.d.a(G.e, false);
                    s1Var.setReorder(this.O);
                    Object obj4 = G.H;
                    if (obj4 instanceof kg.v1) {
                        s1Var.a((kg.v1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    kg.q1 q1Var = (kg.q1) view;
                    q1Var.e.a(G.e, false);
                    Object obj5 = G.H;
                    if (obj5 instanceof kg.v1) {
                        kg.v1 v1Var = (kg.v1) obj5;
                        b9 b9Var = q1Var.a;
                        int[] iArr = q1Var.r;
                        TextView textView3 = q1Var.d;
                        ImageReceiver imageReceiver = q1Var.b;
                        int i20 = org.telegram.messenger.j10.t0;
                        q1Var.c.setText(org.telegram.messenger.mp.u1(i20).D1(org.telegram.messenger.j10.i(i20).e(), false));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.messenger.fj fjVar = v1Var.e;
                        if (fjVar != null) {
                            spannableStringBuilder.append(org.telegram.messenger.j6.m(fjVar.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                        if (v1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
                            int a10 = v1Var.a() - 1;
                            int i21 = kg.r1.d;
                            SpannableString spannableString = new SpannableString("+");
                            kg.r1 r1Var = new kg.r1(a10);
                            iArr[0] = (int) (((vy0) r1Var.c).c + org.telegram.messenger.g0.L(10.0f));
                            spannableString.setSpan(r1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(v1Var.e);
                        if (m12 != null && (photo = m12.photo) != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            org.telegram.messenger.fc f10 = org.telegram.messenger.fc.f(w10, m12.photo);
                            org.telegram.messenger.fj fjVar2 = v1Var.e;
                            imageReceiver.p0(f10, "36_36", fjVar2.I1, w10 == null ? 0L : w10.size, null, fjVar2, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        } else if (m12 == null || (document = m12.document) == null) {
                            b9Var.r(org.telegram.messenger.j10.i(i20).f());
                            imageReceiver.i0(org.telegram.messenger.j10.i(i20).f(), b9Var, null);
                            imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
                        } else {
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            if (w11 == null) {
                                org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(m12.document);
                                j3 = m12.document.size;
                                fcVar = b10;
                                str2 = "g";
                            } else {
                                org.telegram.messenger.fc f11 = org.telegram.messenger.fc.f(w11, m12.document);
                                j3 = w11.size;
                                str2 = "36_36";
                                fcVar = f11;
                            }
                            long j13 = j3;
                            org.telegram.messenger.fj fjVar3 = v1Var.e;
                            imageReceiver.p0(fcVar, str2, fjVar3.I1, j13, null, fjVar3, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        }
                        q1Var.s = J;
                        q1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    org.telegram.ui.a51 a51Var = (org.telegram.ui.a51) view;
                    int i22 = G.A;
                    org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) G.H;
                    org.telegram.ui.eh ehVar = new org.telegram.ui.eh(z12 ? 1 : 0, this, G);
                    a51Var.y = i22;
                    a51Var.E = ehVar;
                    a51Var.e(o41Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.vd) view).set((org.telegram.ui.ud) G.H);
                    break;
                case 25:
                    org.telegram.ui.wd wdVar = (org.telegram.ui.wd) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.H;
                    w5 w5Var = wdVar.b;
                    org.telegram.ui.ActionBar.i6 i6Var2 = wdVar.a;
                    TextView textView4 = wdVar.c;
                    TextView textView5 = wdVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(org.telegram.messenger.gd.M0(2131748163, null));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(org.telegram.messenger.gd.M0(2131748166, null));
                            z10 = false;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.gd.Q(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? i5.c.k(2131748167, null, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j10 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131748165, null));
                            textView5.setText(org.telegram.messenger.gd.Q(r5.from_date) + " - " + org.telegram.messenger.gd.Q(r5.to_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            textView4.setText(org.telegram.messenger.gd.M0(2131748164, null));
                            textView5.setText(org.telegram.messenger.gd.Q(r5.from_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                        }
                        c10 = 1;
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.u6.U(textView5, z10 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.y6, i6Var2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) wdVar.e.format(Math.abs(j10) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    w5Var.setText(org.telegram.ui.xd.K(spannableStringBuilder3, w5Var.getPaint(), 1.1f, org.telegram.messenger.g0.L(0.33f), z11));
                    org.telegram.ui.ActionBar.u6.U(w5Var, c10 < 0 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.l8, i6Var2);
                    wdVar.f = J;
                    wdVar.setWillNotDraw(!J);
                    break;
                case 27:
                    hi.p8 p8Var = (hi.p8) view;
                    long j14 = p8Var.y;
                    Object obj6 = G.H;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j11 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z18 = j14 != j12;
                        p8Var.d(false, true);
                        p8Var.set(G.H);
                        p8Var.f.setVisibility(8);
                        p8Var.h.setVisibility(0);
                        p8Var.c(G.e, z18);
                        p8Var.setDivider(J);
                        break;
                    } else {
                        j11 = ((TLRPC.User) obj6).id;
                    }
                    j12 = j11;
                    if (j14 != j12) {
                    }
                    p8Var.d(false, true);
                    p8Var.set(G.H);
                    p8Var.f.setVisibility(8);
                    p8Var.h.setVisibility(0);
                    p8Var.c(G.e, z18);
                    p8Var.setDivider(J);
                case 28:
                    if (G.t) {
                        org.telegram.ui.ActionBar.u6.q(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.u6.q(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((x41) view).setHeight(G.A);
                    break;
                case 29:
                    kg.t tVar = (kg.t) view;
                    Object obj7 = G.H;
                    if (obj7 instanceof kg.u) {
                        org.telegram.ui.ActionBar.n5 n5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.n5 n5Var4 = tVar.c;
                        xh.l lVar = tVar.b;
                        tVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((kg.u) obj7).a;
                        tVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str4 = tVar.f.link;
                            kg.y[] yVarArr = kg.y.e;
                            if (str4.startsWith("https://")) {
                                str4 = str4.substring(8);
                            }
                            n5Var3.l(str4, false);
                        } else {
                            n5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        org.telegram.messenger.ri.g(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4, -1);
                        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder4, lVar.getPaint().getFontMetricsInt(), false, null, 0);
                        org.telegram.messenger.fj.B5(m10, tVar.f.entities, lVar.getPaint().getFontMetricsInt(), false);
                        lVar.setText(m10);
                        int i23 = tVar.f.views;
                        if (i23 == 0) {
                            n5Var4.l(org.telegram.messenger.gd.a0(null, null, 2131748035, new Object[0]), false);
                        } else {
                            n5Var4.l(org.telegram.messenger.gd.G(i23, "Clicks", new Object[0]), false);
                        }
                        n5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case org.telegram.messenger.ks.T /* 30 */:
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    CharSequence charSequence11 = G.m;
                    int i24 = G.k;
                    c9Var.b.l(charSequence11, false);
                    c9Var.a.setImageResource(i24);
                    c9Var.setDivider(J);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, c9Var, this.P);
                    break;
                case org.telegram.messenger.ks.U /* 31 */:
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (!TextUtils.equals(x3Var.getText(), G.m)) {
                        x3Var.b(G.m, G.n, G.E);
                        break;
                    } else {
                        x3Var.a(G.n, G.E);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                    Object obj8 = G.H;
                    if (G.r && (obj8 instanceof TLRPC.User) && (i10 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i10 != 0) {
                            concat = org.telegram.messenger.gd.H(' ', "BotUsers", i10);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z19 = G.u;
                            Object obj9 = G.I;
                            if (obj9 instanceof org.telegram.messenger.x10) {
                            }
                            g6Var.C0 = z19;
                            g6Var.D0 = r11;
                            g6Var.setRectangularAvatar(G.s);
                            CharSequence charSequence12 = G.n;
                            g6Var.x(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            g6Var.w(G.e, false);
                            g6Var.N = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z192 = G.u;
                        Object obj92 = G.I;
                        if (obj92 instanceof org.telegram.messenger.x10) {
                        }
                        g6Var.C0 = z192;
                        g6Var.D0 = r11;
                        g6Var.setRectangularAvatar(G.s);
                        CharSequence charSequence122 = G.n;
                        g6Var.x(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        g6Var.w(G.e, false);
                        g6Var.N = J;
                    } else {
                        if (G.J) {
                            String o4 = obj8 instanceof TLRPC.User ? org.telegram.messenger.o10.o((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) obj8, false) : null;
                            if (o4 != null) {
                                concat = "@".concat(o4);
                                if (!(obj8 instanceof TLRPC.Chat)) {
                                    TLRPC.Chat chat = (TLRPC.Chat) obj8;
                                    if (chat.participants_count != 0) {
                                        String H = (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.gd.H(' ', "Members", chat.participants_count) : org.telegram.messenger.gd.H(' ', "Subscribers", chat.participants_count);
                                        concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                    }
                                    str = chat.title;
                                } else if (obj8 instanceof TLRPC.User) {
                                    str = org.telegram.messenger.o10.q((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1922 = G.u;
                                Object obj922 = G.I;
                                org.telegram.messenger.x10 x10Var = obj922 instanceof org.telegram.messenger.x10 ? (org.telegram.messenger.x10) obj922 : null;
                                g6Var.C0 = z1922;
                                g6Var.D0 = x10Var;
                                g6Var.setRectangularAvatar(G.s);
                                CharSequence charSequence1222 = G.n;
                                g6Var.x(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                g6Var.w(G.e, false);
                                g6Var.N = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z19222 = G.u;
                        Object obj9222 = G.I;
                        if (obj9222 instanceof org.telegram.messenger.x10) {
                        }
                        g6Var.C0 = z19222;
                        g6Var.D0 = x10Var;
                        g6Var.setRectangularAvatar(G.s);
                        CharSequence charSequence12222 = G.n;
                        g6Var.x(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        g6Var.w(G.e, false);
                        g6Var.N = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    Object obj10 = G.H;
                    org.telegram.messenger.fj fjVar4 = obj10 instanceof org.telegram.messenger.fj ? (org.telegram.messenger.fj) obj10 : null;
                    t2Var.t2 = J;
                    if (fjVar4 != null) {
                        t2Var.d0(org.telegram.messenger.fj.B0(fjVar4.k), fjVar4, fjVar4.k.date, false, false);
                        break;
                    } else {
                        t2Var.d0(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((wz) view).setViewType(G.A);
                    break;
                case 35:
                case 36:
                case 41:
                    org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                    c2Var.setPad(G.i);
                    c2Var.e(G.m, "", G.e, J, c2Var.a == G.d);
                    c2Var.a = G.d;
                    c2Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                    if (i12 == 36 || i12 == 41) {
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.p;
                        View.OnClickListener onClickListener = G.E;
                        di.za zaVar = c2Var.w;
                        if (zaVar != null) {
                            n6 n6Var3 = (n6) zaVar.c;
                            n6Var3.a();
                            n6Var3.setText(charSequence13);
                            View view6 = zaVar.d;
                            view6.animate().cancel();
                            view6.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(lr.h).start();
                            if (onClickListener != null) {
                                zaVar.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                    c2Var2.setPad(G.i);
                    c2Var2.setUserOrChat((TLObject) G.H);
                    c2Var2.c(G.e, c2Var2.a == G.d);
                    c2Var2.a = G.d;
                    c2Var2.setNeedDivider(J);
                    break;
                case 39:
                case 40:
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.d(G.m.toString(), G.e, J, q8Var.a == G.d);
                    q8Var.getCheckBox().setDrawIconType(G.A);
                    Switch checkBox = q8Var.getCheckBox();
                    int i25 = G.A == 0 ? org.telegram.ui.ActionBar.n6.M6 : org.telegram.ui.ActionBar.n6.r7;
                    int i26 = org.telegram.ui.ActionBar.n6.N6;
                    int i27 = org.telegram.ui.ActionBar.n6.d6;
                    checkBox.d(i25, i26, i27, i27);
                    q8Var.a = G.d;
                    q8Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                    if (i12 == 40) {
                        if (!TextUtils.isEmpty(G.p)) {
                            q8Var.a(new hn0(19, G, q8Var), G.p.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = q8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case 42:
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view;
                    n4Var2.c(G.p, n4Var2.a == G.d);
                    n4Var2.a = G.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.m;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.n;
                        if (charSequence15 != null) {
                            w9Var.c(charSequence14, charSequence15, false, J);
                        } else {
                            w9Var.b(charSequence14, J);
                        }
                    }
                    w9Var.setIcon(G.k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.h6) view).b(G.m.toString(), G.o.toString(), J, G.e);
                    break;
            }
        } else {
            k41 G4 = l41.G(i12);
            if (G4 != null) {
                G4.b(f1Var.a, G, J, this, ck0Var instanceof e51 ? (e51) ck0Var : null);
            }
        }
        org.telegram.messenger.x10 x10Var2 = G.G;
        if (x10Var2 != null) {
            x10Var2.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        View hk0Var;
        View n4Var;
        View n4Var2;
        View i5Var;
        int i10;
        org.telegram.ui.Cells.n4 n4Var3;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.n6.h5 : org.telegram.ui.ActionBar.n6.d6;
        ck0 ck0Var = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = this.x;
        Context context = this.e;
        if (i7 < 10000) {
            int i12 = 8;
            switch (i7) {
                case -5:
                    hk0Var = new hk0(context);
                    hk0Var.setTag(-33024);
                    n4Var = hk0Var;
                    break;
                case -4:
                case -1:
                    hk0Var = new bi.p2(context, 25);
                    if (i7 == -4) {
                        hk0Var.setTag(-33024);
                    }
                    n4Var = hk0Var;
                    break;
                case -3:
                    v41 v41Var = new v41(context);
                    v41Var.a = 0;
                    n4Var = v41Var;
                    break;
                case -2:
                    n4Var = new bi.p2(context, 26);
                    break;
                case 0:
                    if (!z10) {
                        n4Var = new org.telegram.ui.Cells.n4(context, i6Var);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.n6.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.n6.G6, 17, 15, false, this.x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new o01(context, i6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, i6Var);
                    m8Var.setCompactLayout(this.s);
                    n4Var = m8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, i6Var);
                    if (i7 == 9) {
                        r8Var.setDrawCheckRipple(true);
                        r8Var.d(org.telegram.ui.ActionBar.n6.g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
                        r8Var.setTypeface(org.telegram.messenger.g0.o());
                        r8Var.setHeight(56);
                    }
                    n4Var = r8Var;
                    break;
                case 5:
                case 6:
                    i5Var = new org.telegram.ui.Cells.i5(this.e, 21, 60, i7 == 6, this.x);
                    n4Var = i5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.z8(context, i6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.v2 v2Var = new org.telegram.ui.Cells.v2(context);
                    v2Var.f = 23;
                    TextView textView = new TextView(context);
                    v2Var.b = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                    boolean z11 = org.telegram.messenger.gd.a0;
                    v2Var.addView(textView, c8.ma.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    v2Var.c = textView2;
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.I6, null);
                    org.telegram.messenger.n10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((org.telegram.messenger.gd.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    v2Var.addView(textView2, c8.ma.d(-2, -1.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    v2Var.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.h7, null);
                    v2Var.addView(radioButton, c8.ma.d(22, 22.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    v2Var.b();
                    v2Var.setHorizontalPadding(21);
                    n4Var = v2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.qa qaVar = new org.telegram.ui.Cells.qa(context, 6, i7 != 12 ? 0 : 3, false);
                    qaVar.setSelfAsSavedMessages(true);
                    n4Var = qaVar;
                    break;
                case 13:
                    n4Var2 = new org.telegram.ui.Cells.qa(6, 0, this.e, null, false, true);
                    n4Var = n4Var2;
                    break;
                case 14:
                    n4Var = new eu0(context, i6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.t7(context, i6Var);
                    break;
                case 16:
                    n4Var = new kg.s1(context, i6Var, this.N != null);
                    break;
                case 17:
                    n4Var = new kg.q1(context, i6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.i6) null);
                    }
                    i5Var = new org.telegram.ui.a51(this.e, this.f, i7 - 18, this.F, this.h);
                    n4Var = i5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.vd(context, i6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.wd(context, i6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.n6.G6, 23, 20, 0, false, false, this.x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    hi.p8 p8Var = new hi.p8(context, i6Var);
                    p8Var.d(false, false);
                    n4Var = p8Var;
                    break;
                case 28:
                    hk0Var = new x41(context);
                    hk0Var.setTag(-33024);
                    n4Var = hk0Var;
                    break;
                case 29:
                    n4Var = new kg.t(context, i6Var);
                    break;
                case org.telegram.messenger.ks.T /* 30 */:
                    n4Var = new org.telegram.ui.Cells.c9(context, i6Var);
                    break;
                case org.telegram.messenger.ks.U /* 31 */:
                    if (ck0Var != null && ck0Var.b1()) {
                        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(28, context, i6Var);
                        x3Var.setNoBackground(true);
                        n4Var = x3Var;
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.x3(context, i6Var);
                        break;
                    }
                    break;
                case 32:
                    n4Var = new org.telegram.ui.Cells.g6(context, null);
                    break;
                case 33:
                    n4Var = new org.telegram.ui.Cells.t2(context, true);
                    break;
                case 34:
                    wz wzVar = new wz(context, i6Var);
                    wzVar.setIsSingleCell(true);
                    n4Var = wzVar;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i7 != 35) {
                        if (i7 == 36) {
                            i10 = 6;
                        } else if (i7 == 37) {
                            i12 = 7;
                        } else if (i7 != 41) {
                            i10 = 0;
                        }
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this.e, i10, 21, true, this.x);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    } else {
                        i12 = 4;
                    }
                    i10 = i12;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.e, i10, 21, true, this.x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.n6.V6, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.k7);
                    n4Var3 = c2Var2;
                    n4Var = n4Var3;
                case 38:
                    n4Var = new org.telegram.ui.Cells.d2(context, i6Var);
                    break;
                case 39:
                case 40:
                    n4Var = new org.telegram.ui.Cells.q8(context);
                    break;
                case 42:
                    n4Var3 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.n6.L6, 21, 15, 0, false, true, this.x);
                    n4Var = n4Var3;
                    break;
                case 43:
                    n4Var = new org.telegram.ui.Cells.w9(0, context, i6Var);
                    break;
                case 44:
                    n4Var = new org.telegram.ui.Cells.h6(context, false);
                    break;
            }
        } else {
            k41 G = l41.G(i7);
            n4Var = G != null ? G.d(context, ck0Var, this.f, i6Var) : new View(context);
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.u6.h(i11, n4Var, this.P);
        }
        return new kj0(n4Var);
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        R(f1Var, this.O);
        P(f1Var);
    }
}
