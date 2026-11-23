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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class c51 extends rg.b {
    public lg.f F;
    public z41 J;
    public z41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.r10 N;
    public boolean O;
    public final ek0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public org.telegram.messenger.r10 w;
    public final org.telegram.ui.ActionBar.h6 x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.r1 P = new org.telegram.ui.ActionBar.r1(this, 2);

    public c51(ek0 ek0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.r10 r10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = ek0Var;
        this.e = context;
        this.f = i7;
        this.h = i10;
        this.n = z10;
        this.w = r10Var;
        this.x = h6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 < 10000) {
            return i7 == 7 || i7 == 8 || i7 == 38 || i7 == 31 || i7 == -4 || i7 == 28 || i7 == 2 || i7 == -2;
        }
        n41 G = o41.G(i7);
        return G != null && G.g();
    }

    @Override // org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        o41 G = G(f1Var.b());
        if (i7 >= 10000) {
            n41 G2 = o41.G(i7);
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
            z41 z41Var = (z41) arrayList.get(i7);
            this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(z41Var.a, z41Var.b + 1)));
            this.M = false;
        }
    }

    public final o41 G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (o41) arrayList.get(i7);
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            z41 z41Var = (z41) arrayList.get(i10);
            if (i7 >= z41Var.a && i7 <= z41Var.b) {
                return i10;
            }
            i10++;
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.x);
    }

    public final boolean J(int i7) {
        o41 G = G(i7);
        o41 G2 = G(i7 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        z41 z41Var = this.K;
        if (z41Var != null) {
            z41Var.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        z41 z41Var = new z41();
        this.K = z41Var;
        z41Var.a = this.E.size();
        z41 z41Var2 = this.K;
        z41Var2.b = -1;
        this.I.add(z41Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i7) {
        if (!this.r) {
            return false;
        }
        ek0 ek0Var = this.d;
        if (ek0Var != null && ek0Var.b1() && ek0Var.getSectionsDrawBackground()) {
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
            case org.telegram.messenger.ls.T /* 30 */:
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
            case org.telegram.messenger.ls.U /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z10) {
        ek0 ek0Var = this.d;
        if (ek0Var == null || !ek0Var.c0()) {
            Q(z10);
        } else {
            ek0Var.post(new rp0(6, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i7 = org.telegram.ui.ActionBar.t6.b;
            if (N(f1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i7)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.m6.h5 : org.telegram.ui.ActionBar.m6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i7));
        }
    }

    public final void Q(boolean z10) {
        ek0 ek0Var = this.d;
        if (ek0Var == null || !ek0Var.c0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.r10 r10Var = this.w;
            if (r10Var != null) {
                r10Var.a(arrayList2, this);
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
            ((kg.r1) view).setReorder(z10);
        } else {
            n41 G = o41.G(i7);
            if (G != null) {
                G.a(this.d, view, G(f1Var.b()));
            }
        }
    }

    public final void S() {
        ek0 ek0Var = this.d;
        if (ek0Var == null) {
            return;
        }
        ArrayList arrayList = ek0Var.L2;
        if (arrayList == null) {
            ek0Var.L2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            z41 z41Var = (z41) obj;
            ek0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(z41Var.a, z41Var.b)));
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
        org.telegram.messenger.r10 r10Var = this.w;
        if (r10Var != null) {
            r10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        z41 z41Var = this.J;
        if (z41Var != null) {
            z41Var.b = Math.max(0, (this.E.size() + this.G) - 1);
            z41 z41Var2 = this.J;
            if (z41Var2.a == z41Var2.b) {
                this.H.remove(z41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        z41 z41Var = new z41();
        this.J = z41Var;
        z41Var.a = this.E.size() + this.G;
        z41 z41Var2 = this.J;
        z41Var2.b = -1;
        this.H.add(z41Var2);
    }

    @Override // v4.i0
    public final int b() {
        return this.E.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        o41 G = G(i7);
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
        org.telegram.ui.Cells.a9 a9Var;
        ?? r92;
        TLRPC.Document document;
        long j3;
        String str2;
        org.telegram.messenger.gc gcVar;
        TLRPC.Photo photo;
        long j10;
        char c10;
        boolean z10;
        boolean z11;
        long j11;
        CharSequence concat;
        int i10;
        int i11 = this.f;
        ek0 ek0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = this.x;
        o41 G = G(i7);
        o41 G2 = G(i7 + 1);
        o41 G3 = G(i7 - 1);
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
                    jk0 jk0Var = (jk0) view;
                    if (jk0Var.getChildCount() != (G.c == null ? 0 : 1) || jk0Var.getChildAt(0) != G.c) {
                        jk0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            org.telegram.messenger.g0.E2(view2);
                            jk0Var.addView(G.c, c8.ma.c(-1.0f, -1));
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
                    y41 y41Var = (y41) view;
                    y41Var.setMinusHeight(G.A);
                    y41Var.setMinusPadding(c8.dd.a(G.z, 1));
                    if (y41Var.getChildCount() != (G.c == null ? 0 : 1) || y41Var.getChildAt(0) != G.c) {
                        y41Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            org.telegram.messenger.g0.E2(view4);
                            y41Var.addView(G.c, c8.ma.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    o4Var.setText(G.m);
                    o4Var.b(G.g);
                    break;
                case 2:
                    p01 p01Var = (p01) view;
                    int i13 = G.k;
                    if (i13 == 0) {
                        int i14 = G.A;
                        if (i14 != 0) {
                            p01Var.setEmojiSize(i14);
                        }
                        String charSequence = G.n.toString();
                        String charSequence2 = G.o.toString();
                        p01Var.getClass();
                        org.telegram.messenger.si.d0(org.telegram.messenger.k10.t0).h2(p01Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.r) {
                        p01Var.setEmojiStatic(i13);
                    } else {
                        p01Var.setEmoji(i13);
                    }
                    if (!TextUtils.isEmpty(G.p)) {
                        p01Var.a(G.m, G.p);
                        break;
                    } else {
                        p01Var.setText(G.m);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    Object obj = G.H;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.m;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        n8Var.x = n8Var.getDefaultImageLeft();
                        n8Var.s = n8Var.c(false);
                        org.telegram.ui.ActionBar.m5 m5Var = n8Var.a;
                        m5Var.l(charSequence3, false);
                        m5Var.i(null);
                        o6 o6Var = n8Var.c;
                        n8Var.R = null;
                        o6Var.c(null, false, true);
                        n8Var.h.setVisibility(8);
                        o6Var.setVisibility(8);
                        n8Var.d.setVisibility(8);
                        rh0 rh0Var = n8Var.e;
                        rh0Var.setVisibility(8);
                        rh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        n8Var.r = J;
                        n8Var.setWillNotDraw(!J);
                        Switch r12 = n8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        n8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.m;
                        String str3 = (String) obj;
                        n8Var.x = n8Var.getDefaultImageLeft();
                        n8Var.s = n8Var.c(false);
                        org.telegram.ui.ActionBar.m5 m5Var2 = n8Var.a;
                        m5Var2.l(charSequence4, false);
                        m5Var2.i(null);
                        o6 o6Var2 = n8Var.c;
                        n8Var.R = null;
                        o6Var2.c(null, false, true);
                        n8Var.h.setVisibility(8);
                        o6Var2.setVisibility(8);
                        n8Var.d.setVisibility(8);
                        rh0 rh0Var2 = n8Var.e;
                        rh0Var2.setVisibility(8);
                        rh0Var2.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        n8Var.r = J;
                        n8Var.setWillNotDraw(!J);
                        Switch r13 = n8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        n8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.o)) {
                        Object obj2 = G.H;
                        if (obj2 instanceof Drawable) {
                            n8Var.p(G.m, (Drawable) obj2, J);
                        } else {
                            int i15 = G.k;
                            if (i15 == 0) {
                                n8Var.k(G.m, J);
                            } else {
                                n8Var.o(i15, G.m, J);
                            }
                        }
                    } else {
                        Object obj3 = G.H;
                        if (obj3 instanceof Drawable) {
                            n8Var.t(G.m, G.o, (Drawable) obj3, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                n8Var.q(G.m, G.o, false, J);
                            } else {
                                n8Var.u(G.m, G.o, false, i16, J);
                            }
                        }
                    }
                    if (G.r) {
                        int i17 = org.telegram.ui.ActionBar.m6.q6;
                        n8Var.g(i17, i17);
                    } else if (G.s) {
                        n8Var.g(org.telegram.ui.ActionBar.m6.q7, org.telegram.ui.ActionBar.m6.p7);
                    } else {
                        n8Var.g(org.telegram.ui.ActionBar.m6.m6, org.telegram.ui.ActionBar.m6.G6);
                    }
                    n8Var.h(45, G.u, true);
                    n8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (s8Var.b == G.d) {
                        s8Var.setChecked(G.e);
                    }
                    s8Var.e(null, G.g);
                    s8Var.f(G.m, G.e, J);
                    s8Var.b = G.d;
                    if (i12 == 9) {
                        org.telegram.ui.ActionBar.t6.h(G.e ? org.telegram.ui.ActionBar.m6.f6 : org.telegram.ui.ActionBar.m6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                    CharSequence charSequence5 = G.n;
                    j5Var.b(G.m, G.n, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.j5) view).b(G.m, G.n, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i12 == 7 || i12 == 8) {
                        org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                        if (TextUtils.isEmpty(G.m)) {
                            a9Var2.setFixedSize(i12 == 8 ? org.telegram.messenger.ls.x3 : 12);
                            a9Var2.setText("");
                        } else {
                            a9Var2.setFixedSize(0);
                            a9Var2.setText(G.m);
                        }
                        if (G.r) {
                            a9Var2.setTextGravity(17);
                            a9Var2.getTextView().setWidth(Math.min(hi.l3.a(a9Var2.getText(), a9Var2.getTextView().getPaint()), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(60.0f)));
                            a9Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            a9Var = a9Var2;
                        } else {
                            a9Var2.setTextGravity(8388611);
                            a9Var2.getTextView().setMinWidth(0);
                            a9Var2.getTextView().setMaxWidth(org.telegram.messenger.g0.q.x);
                            a9Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            a9Var = a9Var2;
                        }
                    } else if (i12 == 38) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                        CharSequence charSequence6 = G.p;
                        boolean z13 = G.f;
                        e2Var.a.setText(charSequence6);
                        View view5 = e2Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(nr.h).start();
                        if (G.r) {
                            e2Var.setColor(org.telegram.ui.ActionBar.m6.q6);
                            a9Var = e2Var;
                        } else if (G.s) {
                            e2Var.setColor(org.telegram.ui.ActionBar.m6.p7);
                            a9Var = e2Var;
                        } else {
                            e2Var.setColor(org.telegram.ui.ActionBar.m6.G6);
                            a9Var = e2Var;
                        }
                    } else {
                        a9Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!ek0Var.b1()) {
                        Drawable X0 = org.telegram.ui.ActionBar.m6.X0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.b7, h6Var));
                        if (!this.n) {
                            a9Var.setBackground(X0);
                            break;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.m6.i5;
                            a9Var.setBackground(new LayerDrawable(new Drawable[]{I(i18) == org.telegram.ui.ActionBar.m6.w0(i18, h6Var) ? new b51(i18, h6Var) : new ColorDrawable(I(i18)), X0}));
                            break;
                        }
                    } else {
                        a9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.w2 w2Var = (org.telegram.ui.Cells.w2) view;
                    int i19 = w2Var.a;
                    TextView textView = w2Var.b;
                    TextView textView2 = w2Var.c;
                    RadioButton radioButton = w2Var.d;
                    if (i19 == G.d) {
                        radioButton.a(G.e, true);
                        w2Var.a(G.g, true);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        w2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.o)) {
                        CharSequence charSequence7 = G.m;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r92);
                        w2Var.e = J;
                        w2Var.b();
                        w2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.m;
                        CharSequence charSequence9 = G.o;
                        boolean z17 = G.e;
                        textView2.setVisibility(r92);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r92);
                        w2Var.e = J;
                        w2Var.b();
                        w2Var.setWillNotDraw(!J);
                    }
                    w2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                    raVar.g(i11, G, J);
                    if (i12 == 12) {
                        raVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.ra raVar2 = (org.telegram.ui.Cells.ra) view;
                    raVar2.g(i11, G, J);
                    CharSequence charSequence10 = G.o;
                    raVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    raVar2.setAddButtonVisible(!G.e);
                    raVar2.setCloseIcon(G.E);
                    break;
                case 14:
                    hu0 hu0Var = (hu0) view;
                    hu0Var.b(G.A, null, G.q);
                    hu0Var.setMinAllowedIndex((int) G.C);
                    hu0Var.setCallback(new ky(G, 24));
                    break;
                case 15:
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                    u7Var.d(G.A, (org.telegram.ui.Cells.t7) G.H, G.D);
                    u7Var.setMinValueAllowed((int) G.C);
                    break;
                case 16:
                    kg.r1 r1Var = (kg.r1) view;
                    r1Var.d.a(G.e, false);
                    r1Var.setReorder(this.O);
                    Object obj4 = G.H;
                    if (obj4 instanceof kg.u1) {
                        r1Var.a((kg.u1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    kg.p1 p1Var = (kg.p1) view;
                    p1Var.e.a(G.e, false);
                    Object obj5 = G.H;
                    if (obj5 instanceof kg.u1) {
                        kg.u1 u1Var = (kg.u1) obj5;
                        b9 b9Var = p1Var.a;
                        int[] iArr = p1Var.r;
                        TextView textView3 = p1Var.d;
                        ImageReceiver imageReceiver = p1Var.b;
                        int i20 = org.telegram.messenger.k10.t0;
                        p1Var.c.setText(org.telegram.messenger.np.u1(i20).D1(org.telegram.messenger.k10.i(i20).e(), false));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.messenger.gj gjVar = u1Var.e;
                        if (gjVar != null) {
                            spannableStringBuilder.append(org.telegram.messenger.j6.m(gjVar.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                        if (u1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
                            int a10 = u1Var.a() - 1;
                            int i21 = kg.q1.d;
                            SpannableString spannableString = new SpannableString("+");
                            kg.q1 q1Var = new kg.q1(a10);
                            iArr[0] = (int) (((xy0) q1Var.c).c + org.telegram.messenger.g0.L(10.0f));
                            spannableString.setSpan(q1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(u1Var.e);
                        if (m12 != null && (photo = m12.photo) != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            org.telegram.messenger.gc f10 = org.telegram.messenger.gc.f(w10, m12.photo);
                            org.telegram.messenger.gj gjVar2 = u1Var.e;
                            imageReceiver.p0(f10, "36_36", gjVar2.I1, w10 == null ? 0L : w10.size, null, gjVar2, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        } else if (m12 == null || (document = m12.document) == null) {
                            b9Var.r(org.telegram.messenger.k10.i(i20).f());
                            imageReceiver.i0(org.telegram.messenger.k10.i(i20).f(), b9Var, null);
                            imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
                        } else {
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            if (w11 == null) {
                                org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(m12.document);
                                j3 = m12.document.size;
                                gcVar = b10;
                                str2 = "g";
                            } else {
                                org.telegram.messenger.gc f11 = org.telegram.messenger.gc.f(w11, m12.document);
                                j3 = w11.size;
                                str2 = "36_36";
                                gcVar = f11;
                            }
                            long j13 = j3;
                            org.telegram.messenger.gj gjVar3 = u1Var.e;
                            imageReceiver.p0(gcVar, str2, gjVar3.I1, j13, null, gjVar3, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        }
                        p1Var.s = J;
                        p1Var.invalidate();
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
                    org.telegram.ui.fh fhVar = new org.telegram.ui.fh(z12 ? 1 : 0, this, G);
                    a51Var.y = i22;
                    a51Var.E = fhVar;
                    a51Var.e(o41Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.vd) view).set((org.telegram.ui.ud) G.H);
                    break;
                case 25:
                    org.telegram.ui.wd wdVar = (org.telegram.ui.wd) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.H;
                    x5 x5Var = wdVar.b;
                    org.telegram.ui.ActionBar.h6 h6Var2 = wdVar.a;
                    TextView textView4 = wdVar.c;
                    TextView textView5 = wdVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(org.telegram.messenger.hd.N0(2131748162, null));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(org.telegram.messenger.hd.N0(2131748165, null));
                            z10 = false;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.hd.Q(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? i5.c.k(2131748166, null, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j10 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(org.telegram.messenger.hd.N0(2131748164, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date) + " - " + org.telegram.messenger.hd.Q(r5.to_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            textView4.setText(org.telegram.messenger.hd.N0(2131748163, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                        }
                        c10 = 1;
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.t6.U(textView5, z10 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.y6, h6Var2);
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
                    x5Var.setText(org.telegram.ui.xd.K(spannableStringBuilder3, x5Var.getPaint(), 1.1f, org.telegram.messenger.g0.L(0.33f), z11));
                    org.telegram.ui.ActionBar.t6.U(x5Var, c10 < 0 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.l8, h6Var2);
                    wdVar.f = J;
                    wdVar.setWillNotDraw(!J);
                    break;
                case 27:
                    hi.o8 o8Var = (hi.o8) view;
                    long j14 = o8Var.y;
                    Object obj6 = G.H;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j11 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z18 = j14 != j12;
                        o8Var.d(false, true);
                        o8Var.set(G.H);
                        o8Var.f.setVisibility(8);
                        o8Var.h.setVisibility(0);
                        o8Var.c(G.e, z18);
                        o8Var.setDivider(J);
                        break;
                    } else {
                        j11 = ((TLRPC.User) obj6).id;
                    }
                    j12 = j11;
                    if (j14 != j12) {
                    }
                    o8Var.d(false, true);
                    o8Var.set(G.H);
                    o8Var.f.setVisibility(8);
                    o8Var.h.setVisibility(0);
                    o8Var.c(G.e, z18);
                    o8Var.setDivider(J);
                case 28:
                    if (G.t) {
                        org.telegram.ui.ActionBar.t6.q(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.t6.q(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((a51) view).setHeight(G.A);
                    break;
                case 29:
                    kg.t tVar = (kg.t) view;
                    Object obj7 = G.H;
                    if (obj7 instanceof kg.u) {
                        org.telegram.ui.ActionBar.m5 m5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.m5 m5Var4 = tVar.c;
                        xh.l lVar = tVar.b;
                        tVar.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((kg.u) obj7).a;
                        tVar.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str4 = tVar.f.link;
                            kg.z[] zVarArr = kg.z.e;
                            if (str4.startsWith("https://")) {
                                str4 = str4.substring(8);
                            }
                            m5Var3.l(str4, false);
                        } else {
                            m5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        org.telegram.messenger.si.g(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4, -1);
                        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder4, lVar.getPaint().getFontMetricsInt(), false, null, 0);
                        org.telegram.messenger.gj.B5(m10, tVar.f.entities, lVar.getPaint().getFontMetricsInt(), false);
                        lVar.setText(m10);
                        int i23 = tVar.f.views;
                        if (i23 == 0) {
                            m5Var4.l(org.telegram.messenger.hd.a0(null, null, 2131748034, new Object[0]), false);
                        } else {
                            m5Var4.l(org.telegram.messenger.hd.G(i23, "Clicks", new Object[0]), false);
                        }
                        m5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case org.telegram.messenger.ls.T /* 30 */:
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    CharSequence charSequence11 = G.m;
                    int i24 = G.k;
                    d9Var.b.l(charSequence11, false);
                    d9Var.a.setImageResource(i24);
                    d9Var.setDivider(J);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, d9Var, this.P);
                    break;
                case org.telegram.messenger.ls.U /* 31 */:
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (!TextUtils.equals(y3Var.getText(), G.m)) {
                        y3Var.b(G.m, G.n, G.E);
                        break;
                    } else {
                        y3Var.a(G.n, G.E);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
                    Object obj8 = G.H;
                    if (G.r && (obj8 instanceof TLRPC.User) && (i10 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i10 != 0) {
                            concat = org.telegram.messenger.hd.H(' ', "BotUsers", i10);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z19 = G.u;
                            Object obj9 = G.I;
                            if (obj9 instanceof org.telegram.messenger.y10) {
                            }
                            h6Var3.C0 = z19;
                            h6Var3.D0 = r11;
                            h6Var3.setRectangularAvatar(G.s);
                            CharSequence charSequence12 = G.n;
                            h6Var3.x(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            h6Var3.w(G.e, false);
                            h6Var3.N = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z192 = G.u;
                        Object obj92 = G.I;
                        if (obj92 instanceof org.telegram.messenger.y10) {
                        }
                        h6Var3.C0 = z192;
                        h6Var3.D0 = r11;
                        h6Var3.setRectangularAvatar(G.s);
                        CharSequence charSequence122 = G.n;
                        h6Var3.x(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        h6Var3.w(G.e, false);
                        h6Var3.N = J;
                    } else {
                        if (G.J) {
                            String o4 = obj8 instanceof TLRPC.User ? org.telegram.messenger.p10.o((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) obj8, false) : null;
                            if (o4 != null) {
                                concat = "@".concat(o4);
                                if (!(obj8 instanceof TLRPC.Chat)) {
                                    TLRPC.Chat chat = (TLRPC.Chat) obj8;
                                    if (chat.participants_count != 0) {
                                        String H = (!org.telegram.messenger.v3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.H(' ', "Members", chat.participants_count) : org.telegram.messenger.hd.H(' ', "Subscribers", chat.participants_count);
                                        concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                    }
                                    str = chat.title;
                                } else if (obj8 instanceof TLRPC.User) {
                                    str = org.telegram.messenger.p10.q((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1922 = G.u;
                                Object obj922 = G.I;
                                org.telegram.messenger.y10 y10Var = obj922 instanceof org.telegram.messenger.y10 ? (org.telegram.messenger.y10) obj922 : null;
                                h6Var3.C0 = z1922;
                                h6Var3.D0 = y10Var;
                                h6Var3.setRectangularAvatar(G.s);
                                CharSequence charSequence1222 = G.n;
                                h6Var3.x(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                h6Var3.w(G.e, false);
                                h6Var3.N = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z19222 = G.u;
                        Object obj9222 = G.I;
                        if (obj9222 instanceof org.telegram.messenger.y10) {
                        }
                        h6Var3.C0 = z19222;
                        h6Var3.D0 = y10Var;
                        h6Var3.setRectangularAvatar(G.s);
                        CharSequence charSequence12222 = G.n;
                        h6Var3.x(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        h6Var3.w(G.e, false);
                        h6Var3.N = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                    Object obj10 = G.H;
                    org.telegram.messenger.gj gjVar4 = obj10 instanceof org.telegram.messenger.gj ? (org.telegram.messenger.gj) obj10 : null;
                    u2Var.t2 = J;
                    if (gjVar4 != null) {
                        u2Var.d0(org.telegram.messenger.gj.B0(gjVar4.k), gjVar4, gjVar4.k.date, false, false);
                        break;
                    } else {
                        u2Var.d0(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((yz) view).setViewType(G.A);
                    break;
                case 35:
                case 36:
                case 41:
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.setPad(G.i);
                    d2Var.e(G.m, "", G.e, J, d2Var.a == G.d);
                    d2Var.a = G.d;
                    d2Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                    if (i12 == 36 || i12 == 41) {
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.p;
                        View.OnClickListener onClickListener = G.E;
                        di.za zaVar = d2Var.w;
                        if (zaVar != null) {
                            o6 o6Var3 = (o6) zaVar.c;
                            o6Var3.a();
                            o6Var3.setText(charSequence13);
                            View view6 = zaVar.d;
                            view6.animate().cancel();
                            view6.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(nr.h).start();
                            if (onClickListener != null) {
                                zaVar.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view;
                    d2Var2.setPad(G.i);
                    d2Var2.setUserOrChat((TLObject) G.H);
                    d2Var2.c(G.e, d2Var2.a == G.d);
                    d2Var2.a = G.d;
                    d2Var2.setNeedDivider(J);
                    break;
                case 39:
                case 40:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    r8Var.d(G.m.toString(), G.e, J, r8Var.a == G.d);
                    r8Var.getCheckBox().setDrawIconType(G.A);
                    Switch checkBox = r8Var.getCheckBox();
                    int i25 = G.A == 0 ? org.telegram.ui.ActionBar.m6.M6 : org.telegram.ui.ActionBar.m6.r7;
                    int i26 = org.telegram.ui.ActionBar.m6.N6;
                    int i27 = org.telegram.ui.ActionBar.m6.d6;
                    checkBox.d(i25, i26, i27, i27);
                    r8Var.a = G.d;
                    r8Var.setIcon(G.u ? R.drawable.permission_locked : 0);
                    if (i12 == 40) {
                        if (!TextUtils.isEmpty(G.p)) {
                            r8Var.a(new fm0(21, G, r8Var), G.p.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = r8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case 42:
                    org.telegram.ui.Cells.o4 o4Var2 = (org.telegram.ui.Cells.o4) view;
                    o4Var2.c(G.p, o4Var2.a == G.d);
                    o4Var2.a = G.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.m;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.n;
                        if (charSequence15 != null) {
                            x9Var.c(charSequence14, charSequence15, false, J);
                        } else {
                            x9Var.b(charSequence14, J);
                        }
                    }
                    x9Var.setIcon(G.k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.i6) view).b(G.m.toString(), G.o.toString(), J, G.e);
                    break;
            }
        } else {
            n41 G4 = o41.G(i12);
            if (G4 != null) {
                G4.b(f1Var.a, G, J, this, ek0Var instanceof h51 ? (h51) ek0Var : null);
            }
        }
        org.telegram.messenger.y10 y10Var2 = G.G;
        if (y10Var2 != null) {
            y10Var2.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        View jk0Var;
        View o4Var;
        View o4Var2;
        View j5Var;
        int i10;
        org.telegram.ui.Cells.o4 o4Var3;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.m6.h5 : org.telegram.ui.ActionBar.m6.d6;
        ek0 ek0Var = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = this.x;
        Context context = this.e;
        if (i7 < 10000) {
            int i12 = 8;
            switch (i7) {
                case -5:
                    jk0Var = new jk0(context);
                    jk0Var.setTag(-33024);
                    o4Var = jk0Var;
                    break;
                case -4:
                case -1:
                    jk0Var = new bi.t2(context, 25);
                    if (i7 == -4) {
                        jk0Var.setTag(-33024);
                    }
                    o4Var = jk0Var;
                    break;
                case -3:
                    y41 y41Var = new y41(context);
                    y41Var.a = 0;
                    o4Var = y41Var;
                    break;
                case -2:
                    o4Var = new bi.t2(context, 26);
                    break;
                case 0:
                    if (!z10) {
                        o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.o4(this.e, org.telegram.ui.ActionBar.m6.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    o4Var2 = new org.telegram.ui.Cells.o4(this.e, org.telegram.ui.ActionBar.m6.G6, 17, 15, false, this.x);
                    o4Var = o4Var2;
                    break;
                case 2:
                    o4Var = new p01(context, h6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, h6Var);
                    n8Var.setCompactLayout(this.s);
                    o4Var = n8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, h6Var);
                    if (i7 == 9) {
                        s8Var.setDrawCheckRipple(true);
                        s8Var.d(org.telegram.ui.ActionBar.m6.g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
                        s8Var.setTypeface(org.telegram.messenger.g0.o());
                        s8Var.setHeight(56);
                    }
                    o4Var = s8Var;
                    break;
                case 5:
                case 6:
                    j5Var = new org.telegram.ui.Cells.j5(this.e, 21, 60, i7 == 6, this.x);
                    o4Var = j5Var;
                    break;
                case 7:
                case 8:
                default:
                    o4Var = new org.telegram.ui.Cells.a9(context, h6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.w2 w2Var = new org.telegram.ui.Cells.w2(context);
                    w2Var.f = 23;
                    TextView textView = new TextView(context);
                    w2Var.b = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    boolean z11 = org.telegram.messenger.hd.a0;
                    w2Var.addView(textView, c8.ma.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    w2Var.c = textView2;
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.I6, null);
                    org.telegram.messenger.o10.q(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    w2Var.addView(textView2, c8.ma.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    w2Var.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.h7, null);
                    w2Var.addView(radioButton, c8.ma.d(22, 22.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    w2Var.b();
                    w2Var.setHorizontalPadding(21);
                    o4Var = w2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(context, 6, i7 != 12 ? 0 : 3, false);
                    raVar.setSelfAsSavedMessages(true);
                    o4Var = raVar;
                    break;
                case 13:
                    o4Var2 = new org.telegram.ui.Cells.ra(6, 0, this.e, null, false, true);
                    o4Var = o4Var2;
                    break;
                case 14:
                    o4Var = new hu0(context, h6Var);
                    break;
                case 15:
                    o4Var = new org.telegram.ui.Cells.u7(context, h6Var);
                    break;
                case 16:
                    o4Var = new kg.r1(context, h6Var, this.N != null);
                    break;
                case 17:
                    o4Var = new kg.p1(context, h6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.h6) null);
                    }
                    j5Var = new org.telegram.ui.a51(this.e, this.f, i7 - 18, this.F, this.h);
                    o4Var = j5Var;
                    break;
                case 24:
                    o4Var = new org.telegram.ui.vd(context, h6Var);
                    break;
                case 25:
                    o4Var = new org.telegram.ui.wd(context, h6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(this.e, org.telegram.ui.ActionBar.m6.G6, 23, 20, 0, false, false, this.x);
                    o4Var4.setTextSize(20.0f);
                    o4Var3 = o4Var4;
                    o4Var = o4Var3;
                    break;
                case 27:
                    hi.o8 o8Var = new hi.o8(context, h6Var);
                    o8Var.d(false, false);
                    o4Var = o8Var;
                    break;
                case 28:
                    jk0Var = new a51(context);
                    jk0Var.setTag(-33024);
                    o4Var = jk0Var;
                    break;
                case 29:
                    o4Var = new kg.t(context, h6Var);
                    break;
                case org.telegram.messenger.ls.T /* 30 */:
                    o4Var = new org.telegram.ui.Cells.d9(context, h6Var);
                    break;
                case org.telegram.messenger.ls.U /* 31 */:
                    if (ek0Var != null && ek0Var.b1()) {
                        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(28, context, h6Var);
                        y3Var.setNoBackground(true);
                        o4Var = y3Var;
                        break;
                    } else {
                        o4Var = new org.telegram.ui.Cells.y3(context, h6Var);
                        break;
                    }
                    break;
                case 32:
                    o4Var = new org.telegram.ui.Cells.h6(context, null);
                    break;
                case 33:
                    o4Var = new org.telegram.ui.Cells.u2(context, true);
                    break;
                case 34:
                    yz yzVar = new yz(context, h6Var);
                    yzVar.setIsSingleCell(true);
                    o4Var = yzVar;
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
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.e, i10, 21, true, this.x);
                        d2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                        o4Var3 = d2Var;
                        o4Var = o4Var3;
                        break;
                    } else {
                        i12 = 4;
                    }
                    i10 = i12;
                    org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(this.e, i10, 21, true, this.x);
                    d2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.m6.V6, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.k7);
                    o4Var3 = d2Var2;
                    o4Var = o4Var3;
                case 38:
                    o4Var = new org.telegram.ui.Cells.e2(context, h6Var);
                    break;
                case 39:
                case 40:
                    o4Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 42:
                    o4Var3 = new org.telegram.ui.Cells.o4(this.e, org.telegram.ui.ActionBar.m6.L6, 21, 15, 0, false, true, this.x);
                    o4Var = o4Var3;
                    break;
                case 43:
                    o4Var = new org.telegram.ui.Cells.x9(0, context, h6Var);
                    break;
                case 44:
                    o4Var = new org.telegram.ui.Cells.i6(context, false);
                    break;
            }
        } else {
            n41 G = o41.G(i7);
            o4Var = G != null ? G.d(context, ek0Var, this.f, h6Var) : new View(context);
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.t6.h(i11, o4Var, this.P);
        }
        return new mj0(o4Var);
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        R(f1Var, this.O);
        P(f1Var);
    }
}
