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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class p41 extends rg.b {
    public lg.f F;
    public m41 J;
    public m41 K;
    public int L;
    public boolean M;
    public org.telegram.messenger.s10 N;
    public boolean O;
    public final uj0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public org.telegram.messenger.s10 w;
    public final org.telegram.ui.ActionBar.e6 x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public int G = 0;
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final org.telegram.ui.ActionBar.r1 P = new org.telegram.ui.ActionBar.r1(this, 2);

    public p41(uj0 uj0Var, Context context, int i7, int i10, boolean z10, org.telegram.messenger.s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.d = uj0Var;
        this.e = context;
        this.f = i7;
        this.h = i10;
        this.n = z10;
        this.w = s10Var;
        this.x = e6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 < 10000) {
            return i7 == 7 || i7 == 8 || i7 == 38 || i7 == 31 || i7 == -4 || i7 == 28 || i7 == 2 || i7 == -2;
        }
        a41 G = b41.G(i7);
        return G != null && G.g();
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        b41 G = G(e1Var.b());
        if (i7 >= 10000) {
            a41 G2 = b41.G(i7);
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
            m41 m41Var = (m41) arrayList.get(i7);
            this.N.a(Integer.valueOf(i7), new ArrayList(this.E.subList(m41Var.a, m41Var.b + 1)));
            this.M = false;
        }
    }

    public final b41 G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (b41) arrayList.get(i7);
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            m41 m41Var = (m41) arrayList.get(i10);
            if (i7 >= m41Var.a && i7 <= m41Var.b) {
                return i10;
            }
            i10++;
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.x);
    }

    public final boolean J(int i7) {
        b41 G = G(i7);
        b41 G2 = G(i7 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        m41 m41Var = this.K;
        if (m41Var != null) {
            m41Var.b = Math.max(0, this.E.size() - 1);
        }
    }

    public final int M() {
        m41 m41Var = new m41();
        this.K = m41Var;
        m41Var.a = this.E.size();
        m41 m41Var2 = this.K;
        m41Var2.b = -1;
        this.I.add(m41Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i7) {
        if (!this.r) {
            return false;
        }
        uj0 uj0Var = this.d;
        if (uj0Var != null && uj0Var.b1() && uj0Var.getSectionsDrawBackground()) {
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
            case org.telegram.messenger.ns.T /* 30 */:
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
            case org.telegram.messenger.ns.U /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z10) {
        uj0 uj0Var = this.d;
        if (uj0Var == null || !uj0Var.c0()) {
            Q(z10);
        } else {
            uj0Var.post(new fp0(6, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.z5) {
            ((org.telegram.ui.ActionBar.z5) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i7 = org.telegram.ui.ActionBar.q6.b;
            if (N(e1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i7)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i7));
        }
    }

    public final void Q(boolean z10) {
        uj0 uj0Var = this.d;
        if (uj0Var == null || !uj0Var.c0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.E;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.J = null;
            this.H.clear();
            this.I.clear();
            org.telegram.messenger.s10 s10Var = this.w;
            if (s10Var != null) {
                s10Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.e1 e1Var, boolean z10) {
        if (e1Var == null) {
            return;
        }
        View view = e1Var.a;
        int i7 = e1Var.f;
        if (i7 < 10000) {
            if (i7 != 16) {
                return;
            }
            ((kg.q1) view).setReorder(z10);
        } else {
            a41 G = b41.G(i7);
            if (G != null) {
                G.a(this.d, view, G(e1Var.b()));
            }
        }
    }

    public final void S() {
        uj0 uj0Var = this.d;
        if (uj0Var == null) {
            return;
        }
        ArrayList arrayList = uj0Var.L2;
        if (arrayList == null) {
            uj0Var.L2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            m41 m41Var = (m41) obj;
            uj0Var.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(m41Var.a, m41Var.b)));
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
        org.telegram.messenger.s10 s10Var = this.w;
        if (s10Var != null) {
            s10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        m41 m41Var = this.J;
        if (m41Var != null) {
            m41Var.b = Math.max(0, (this.E.size() + this.G) - 1);
            m41 m41Var2 = this.J;
            if (m41Var2.a == m41Var2.b) {
                this.H.remove(m41Var2);
            }
            this.J = null;
        }
    }

    public final void V() {
        m41 m41Var = new m41();
        this.J = m41Var;
        m41Var.a = this.E.size() + this.G;
        m41 m41Var2 = this.J;
        m41Var2.b = -1;
        this.H.add(m41Var2);
    }

    @Override // v4.h0
    public final int b() {
        return this.E.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        b41 G = G(i7);
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(v4.e1 e1Var, int i7) {
        String str;
        org.telegram.ui.Cells.y8 y8Var;
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
        uj0 uj0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        b41 G = G(i7);
        b41 G2 = G(i7 + 1);
        b41 G3 = G(i7 - 1);
        if (G == null) {
            return;
        }
        int i12 = e1Var.f;
        View view = e1Var.a;
        boolean J = J(i7);
        P(e1Var);
        if (i12 < 10000) {
            long j12 = 0;
            str = "";
            boolean z12 = true;
            switch (i12) {
                case -5:
                    zj0 zj0Var = (zj0) view;
                    if (zj0Var.getChildCount() != (G.c == null ? 0 : 1) || zj0Var.getChildAt(0) != G.c) {
                        zj0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            org.telegram.messenger.g0.E2(view2);
                            zj0Var.addView(G.c, c8.ja.c(-1.0f, -1));
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
                            frameLayout.addView(G.c, (i12 == -1 || i12 == -4) ? c8.ja.c(G.z, -1) : c8.ja.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    l41 l41Var = (l41) view;
                    l41Var.setMinusHeight(G.z);
                    l41Var.setMinusPadding(c8.zc.a(G.y, 1));
                    if (l41Var.getChildCount() != (G.c == null ? 0 : 1) || l41Var.getChildAt(0) != G.c) {
                        l41Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            org.telegram.messenger.g0.E2(view4);
                            l41Var.addView(G.c, c8.ja.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(G.l);
                    n4Var.b(G.g);
                    break;
                case 2:
                    g01 g01Var = (g01) view;
                    int i13 = G.k;
                    if (i13 == 0) {
                        int i14 = G.z;
                        if (i14 != 0) {
                            g01Var.setEmojiSize(i14);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        g01Var.getClass();
                        org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).c2(g01Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        g01Var.setEmojiStatic(i13);
                    } else {
                        g01Var.setEmoji(i13);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        g01Var.a(G.l, G.o);
                        break;
                    } else {
                        g01Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        l8Var.x = l8Var.getDefaultImageLeft();
                        l8Var.s = l8Var.c(false);
                        org.telegram.ui.ActionBar.j5 j5Var = l8Var.a;
                        j5Var.l(charSequence3, false);
                        j5Var.i(null);
                        h6 h6Var = l8Var.c;
                        l8Var.R = null;
                        h6Var.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        h6Var.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        fh0 fh0Var = l8Var.e;
                        fh0Var.setVisibility(8);
                        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        l8Var.r = J;
                        l8Var.setWillNotDraw(!J);
                        Switch r12 = l8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        l8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str3 = (String) obj;
                        l8Var.x = l8Var.getDefaultImageLeft();
                        l8Var.s = l8Var.c(false);
                        org.telegram.ui.ActionBar.j5 j5Var2 = l8Var.a;
                        j5Var2.l(charSequence4, false);
                        j5Var2.i(null);
                        h6 h6Var2 = l8Var.c;
                        l8Var.R = null;
                        h6Var2.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        h6Var2.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        fh0 fh0Var2 = l8Var.e;
                        fh0Var2.setVisibility(8);
                        fh0Var2.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        l8Var.r = J;
                        l8Var.setWillNotDraw(!J);
                        Switch r13 = l8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        l8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            l8Var.p(G.l, (Drawable) obj2, J);
                        } else {
                            int i15 = G.k;
                            if (i15 == 0) {
                                l8Var.k(G.l, J);
                            } else {
                                l8Var.o(i15, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            l8Var.t(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                l8Var.q(G.l, G.n, false, J);
                            } else {
                                l8Var.u(G.l, G.n, false, i16, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i17 = org.telegram.ui.ActionBar.j6.q6;
                        l8Var.g(i17, i17);
                    } else if (G.r) {
                        l8Var.g(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
                    } else {
                        l8Var.g(org.telegram.ui.ActionBar.j6.m6, org.telegram.ui.ActionBar.j6.G6);
                    }
                    l8Var.h(45, G.t, true);
                    l8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    if (q8Var.b == G.d) {
                        q8Var.setChecked(G.e);
                    }
                    q8Var.e(null, G.g);
                    q8Var.f(G.l, G.e, J);
                    q8Var.b = G.d;
                    if (i12 == 9) {
                        org.telegram.ui.ActionBar.q6.h(G.e ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                    CharSequence charSequence5 = G.m;
                    h5Var.b(G.l, G.m, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.h5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i12 == 7 || i12 == 8) {
                        org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
                        if (TextUtils.isEmpty(G.l)) {
                            y8Var2.setFixedSize(i12 == 8 ? org.telegram.messenger.ns.x3 : 12);
                            y8Var2.setText("");
                        } else {
                            y8Var2.setFixedSize(0);
                            y8Var2.setText(G.l);
                        }
                        if (G.q) {
                            y8Var2.setTextGravity(17);
                            y8Var2.getTextView().setWidth(Math.min(hi.l3.a(y8Var2.getText(), y8Var2.getTextView().getPaint()), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(60.0f)));
                            y8Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(17.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            y8Var = y8Var2;
                        } else {
                            y8Var2.setTextGravity(8388611);
                            y8Var2.getTextView().setMinWidth(0);
                            y8Var2.getTextView().setMaxWidth(org.telegram.messenger.g0.q.x);
                            y8Var2.getTextView().setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(17.0f));
                            y8Var = y8Var2;
                        }
                    } else if (i12 == 38) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                        CharSequence charSequence6 = G.o;
                        boolean z13 = G.f;
                        d2Var.a.setText(charSequence6);
                        View view5 = d2Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
                        if (G.q) {
                            d2Var.setColor(org.telegram.ui.ActionBar.j6.q6);
                            y8Var = d2Var;
                        } else if (G.r) {
                            d2Var.setColor(org.telegram.ui.ActionBar.j6.p7);
                            y8Var = d2Var;
                        } else {
                            d2Var.setColor(org.telegram.ui.ActionBar.j6.G6);
                            y8Var = d2Var;
                        }
                    } else {
                        y8Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!uj0Var.b1()) {
                        Drawable X0 = org.telegram.ui.ActionBar.j6.X0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.b7, e6Var));
                        if (!this.n) {
                            y8Var.setBackground(X0);
                            break;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.j6.i5;
                            y8Var.setBackground(new LayerDrawable(new Drawable[]{I(i18) == org.telegram.ui.ActionBar.j6.w0(i18, e6Var) ? new o41(i18, e6Var) : new ColorDrawable(I(i18)), X0}));
                            break;
                        }
                    } else {
                        y8Var.setBackground(null);
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
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r92);
                        v2Var.e = J;
                        v2Var.b();
                        v2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
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
                    org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                    paVar.g(i11, G, J);
                    if (i12 == 12) {
                        paVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.pa paVar2 = (org.telegram.ui.Cells.pa) view;
                    paVar2.g(i11, G, J);
                    CharSequence charSequence10 = G.n;
                    paVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    paVar2.setAddButtonVisible(!G.e);
                    paVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    wt0 wt0Var = (wt0) view;
                    wt0Var.b(G.z, null, G.p);
                    wt0Var.setMinAllowedIndex((int) G.B);
                    wt0Var.setCallback(new gx(G, 25));
                    break;
                case 15:
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                    s7Var.d(G.z, (org.telegram.ui.Cells.r7) G.G, G.C);
                    s7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    kg.q1 q1Var = (kg.q1) view;
                    q1Var.d.a(G.e, false);
                    q1Var.setReorder(this.O);
                    Object obj4 = G.G;
                    if (obj4 instanceof kg.u1) {
                        q1Var.a((kg.u1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    kg.o1 o1Var = (kg.o1) view;
                    o1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof kg.u1) {
                        kg.u1 u1Var = (kg.u1) obj5;
                        t8 t8Var = o1Var.a;
                        int[] iArr = o1Var.r;
                        TextView textView3 = o1Var.d;
                        ImageReceiver imageReceiver = o1Var.b;
                        int i20 = org.telegram.messenger.m10.t0;
                        o1Var.c.setText(org.telegram.messenger.np.s1(i20).B1(org.telegram.messenger.m10.i(i20).e(), false));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.messenger.gj gjVar = u1Var.e;
                        if (gjVar != null) {
                            spannableStringBuilder.append(org.telegram.messenger.j6.m(gjVar.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                        if (u1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
                            int a10 = u1Var.a() - 1;
                            int i21 = kg.p1.d;
                            SpannableString spannableString = new SpannableString("+");
                            kg.p1 p1Var = new kg.p1(a10);
                            iArr[0] = (int) (((oy0) p1Var.c).c + org.telegram.messenger.g0.L(10.0f));
                            spannableString.setSpan(p1Var, 0, spannableString.length(), 33);
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
                            t8Var.r(org.telegram.messenger.m10.i(i20).f());
                            imageReceiver.i0(org.telegram.messenger.m10.i(i20).f(), t8Var, null);
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
                        o1Var.s = J;
                        o1Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    org.telegram.ui.x41 x41Var = (org.telegram.ui.x41) view;
                    int i22 = G.z;
                    org.telegram.ui.l41 l41Var2 = (org.telegram.ui.l41) G.G;
                    org.telegram.ui.eh ehVar = new org.telegram.ui.eh(z12 ? 1 : 0, this, G);
                    x41Var.y = i22;
                    x41Var.E = ehVar;
                    x41Var.e(l41Var2, false);
                    break;
                case 24:
                    ((org.telegram.ui.vd) view).set((org.telegram.ui.ud) G.G);
                    break;
                case 25:
                    org.telegram.ui.wd wdVar = (org.telegram.ui.wd) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    o5 o5Var = wdVar.b;
                    org.telegram.ui.ActionBar.e6 e6Var2 = wdVar.a;
                    TextView textView4 = wdVar.c;
                    TextView textView5 = wdVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(org.telegram.messenger.hd.M0(2131748355, null));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(org.telegram.messenger.hd.M0(2131748358, null));
                            z10 = false;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.hd.Q(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? i5.c.k(2131748359, null, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j10 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131748357, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date) + " - " + org.telegram.messenger.hd.Q(r5.to_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131748356, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                        }
                        c10 = 1;
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.q6.U(textView5, z10 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, e6Var2);
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
                    o5Var.setText(org.telegram.ui.xd.K(spannableStringBuilder3, o5Var.getPaint(), 1.1f, org.telegram.messenger.g0.L(0.33f), z11));
                    org.telegram.ui.ActionBar.q6.U(o5Var, c10 < 0 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.l8, e6Var2);
                    wdVar.f = J;
                    wdVar.setWillNotDraw(!J);
                    break;
                case 27:
                    hi.p8 p8Var = (hi.p8) view;
                    long j14 = p8Var.y;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j11 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z18 = j14 != j12;
                        p8Var.d(false, true);
                        p8Var.set(G.G);
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
                    p8Var.set(G.G);
                    p8Var.f.setVisibility(8);
                    p8Var.h.setVisibility(0);
                    p8Var.c(G.e, z18);
                    p8Var.setDivider(J);
                case 28:
                    if (G.s) {
                        org.telegram.ui.ActionBar.q6.q(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.q6.q(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((n41) view).setHeight(G.z);
                    break;
                case 29:
                    kg.t tVar = (kg.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof kg.u) {
                        org.telegram.ui.ActionBar.j5 j5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.j5 j5Var4 = tVar.c;
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
                            j5Var3.l(str4, false);
                        } else {
                            j5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        org.telegram.messenger.si.g(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4, -1);
                        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder4, lVar.getPaint().getFontMetricsInt(), false, null, 0);
                        org.telegram.messenger.gj.B5(m10, tVar.f.entities, lVar.getPaint().getFontMetricsInt(), false);
                        lVar.setText(m10);
                        int i23 = tVar.f.views;
                        if (i23 == 0) {
                            j5Var4.l(org.telegram.messenger.hd.a0(null, null, 2131748227, new Object[0]), false);
                        } else {
                            j5Var4.l(org.telegram.messenger.hd.G(i23, "Clicks", new Object[0]), false);
                        }
                        j5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case org.telegram.messenger.ns.T /* 30 */:
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    CharSequence charSequence11 = G.l;
                    int i24 = G.k;
                    b9Var.b.l(charSequence11, false);
                    b9Var.a.setImageResource(i24);
                    b9Var.setDivider(J);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, b9Var, this.P);
                    break;
                case org.telegram.messenger.ns.U /* 31 */:
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (!TextUtils.equals(x3Var.getText(), G.l)) {
                        x3Var.b(G.l, G.m, G.D);
                        break;
                    } else {
                        x3Var.a(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i10 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i10 != 0) {
                            concat = org.telegram.messenger.hd.H(' ', "BotUsers", i10);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z19 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof org.telegram.messenger.z10) {
                            }
                            f6Var.C0 = z19;
                            f6Var.D0 = r11;
                            f6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            f6Var.x(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            f6Var.w(G.e, false);
                            f6Var.N = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z192 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof org.telegram.messenger.z10) {
                        }
                        f6Var.C0 = z192;
                        f6Var.D0 = r11;
                        f6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        f6Var.x(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        f6Var.w(G.e, false);
                        f6Var.N = J;
                    } else {
                        if (G.I) {
                            String n10 = obj8 instanceof TLRPC.User ? org.telegram.messenger.q10.n((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) obj8, false) : null;
                            if (n10 != null) {
                                concat = "@".concat(n10);
                                if (!(obj8 instanceof TLRPC.Chat)) {
                                    TLRPC.Chat chat = (TLRPC.Chat) obj8;
                                    if (chat.participants_count != 0) {
                                        String H = (!org.telegram.messenger.t3.T(chat) || chat.megagroup) ? org.telegram.messenger.hd.H(' ', "Members", chat.participants_count) : org.telegram.messenger.hd.H(' ', "Subscribers", chat.participants_count);
                                        concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                    }
                                    str = chat.title;
                                } else if (obj8 instanceof TLRPC.User) {
                                    str = org.telegram.messenger.q10.p((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1922 = G.t;
                                Object obj922 = G.H;
                                org.telegram.messenger.z10 z10Var = obj922 instanceof org.telegram.messenger.z10 ? (org.telegram.messenger.z10) obj922 : null;
                                f6Var.C0 = z1922;
                                f6Var.D0 = z10Var;
                                f6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                f6Var.x(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                f6Var.w(G.e, false);
                                f6Var.N = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z19222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof org.telegram.messenger.z10) {
                        }
                        f6Var.C0 = z19222;
                        f6Var.D0 = z10Var;
                        f6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        f6Var.x(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        f6Var.w(G.e, false);
                        f6Var.N = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    Object obj10 = G.G;
                    org.telegram.messenger.gj gjVar4 = obj10 instanceof org.telegram.messenger.gj ? (org.telegram.messenger.gj) obj10 : null;
                    t2Var.t2 = J;
                    if (gjVar4 != null) {
                        t2Var.f0(org.telegram.messenger.gj.B0(gjVar4.k), gjVar4, gjVar4.k.date, false, false);
                        break;
                    } else {
                        t2Var.f0(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((pz) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case 41:
                    org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                    c2Var.setPad(G.i);
                    c2Var.e(G.l, "", G.e, J, c2Var.a == G.d);
                    c2Var.a = G.d;
                    c2Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i12 == 36 || i12 == 41) {
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        di.va vaVar = c2Var.w;
                        if (vaVar != null) {
                            h6 h6Var3 = (h6) vaVar.c;
                            h6Var3.a();
                            h6Var3.setText(charSequence13);
                            View view6 = vaVar.d;
                            view6.animate().cancel();
                            view6.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
                            if (onClickListener != null) {
                                vaVar.setOnClickListener(onClickListener);
                                break;
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
                    c2Var2.setPad(G.i);
                    c2Var2.setUserOrChat((TLObject) G.G);
                    c2Var2.c(G.e, c2Var2.a == G.d);
                    c2Var2.a = G.d;
                    c2Var2.setNeedDivider(J);
                    break;
                case 39:
                case 40:
                    org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                    p8Var2.d(G.l.toString(), G.e, J, p8Var2.a == G.d);
                    p8Var2.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = p8Var2.getCheckBox();
                    int i25 = G.z == 0 ? org.telegram.ui.ActionBar.j6.M6 : org.telegram.ui.ActionBar.j6.r7;
                    int i26 = org.telegram.ui.ActionBar.j6.N6;
                    int i27 = org.telegram.ui.ActionBar.j6.d6;
                    checkBox.d(i25, i26, i27, i27);
                    p8Var2.a = G.d;
                    p8Var2.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i12 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            p8Var2.a(new hh0(24, G, p8Var2), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = p8Var2.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case 42:
                    org.telegram.ui.Cells.n4 n4Var2 = (org.telegram.ui.Cells.n4) view;
                    n4Var2.c(G.o, n4Var2.a == G.d);
                    n4Var2.a = G.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            v9Var.c(charSequence14, charSequence15, false, J);
                        } else {
                            v9Var.b(charSequence14, J);
                        }
                    }
                    v9Var.setIcon(G.k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.g6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            a41 G4 = b41.G(i12);
            if (G4 != null) {
                G4.b(e1Var.a, G, J, this, uj0Var instanceof u41 ? (u41) uj0Var : null);
            }
        }
        org.telegram.messenger.z10 z10Var2 = G.F;
        if (z10Var2 != null) {
            z10Var2.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public v4.e1 x(ViewGroup viewGroup, int i7) {
        View zj0Var;
        View n4Var;
        View n4Var2;
        View h5Var;
        int i10;
        org.telegram.ui.Cells.n4 n4Var3;
        boolean z10 = this.n;
        int i11 = z10 ? org.telegram.ui.ActionBar.j6.h5 : org.telegram.ui.ActionBar.j6.d6;
        uj0 uj0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        Context context = this.e;
        if (i7 < 10000) {
            int i12 = 8;
            switch (i7) {
                case -5:
                    zj0Var = new zj0(context);
                    zj0Var.setTag(-33024);
                    n4Var = zj0Var;
                    break;
                case -4:
                case -1:
                    zj0Var = new bi.v1(context, 25);
                    if (i7 == -4) {
                        zj0Var.setTag(-33024);
                    }
                    n4Var = zj0Var;
                    break;
                case -3:
                    l41 l41Var = new l41(context);
                    l41Var.a = 0;
                    n4Var = l41Var;
                    break;
                case -2:
                    n4Var = new bi.v1(context, 26);
                    break;
                case 0:
                    if (!z10) {
                        n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 17, 15, false, this.x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new g01(context, e6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
                    l8Var.setCompactLayout(this.s);
                    n4Var = l8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                    if (i7 == 9) {
                        q8Var.setDrawCheckRipple(true);
                        q8Var.d(org.telegram.ui.ActionBar.j6.g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
                        q8Var.setTypeface(org.telegram.messenger.g0.o());
                        q8Var.setHeight(56);
                    }
                    n4Var = q8Var;
                    break;
                case 5:
                case 6:
                    h5Var = new org.telegram.ui.Cells.h5(this.e, 21, 60, i7 == 6, this.x);
                    n4Var = h5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.v2 v2Var = new org.telegram.ui.Cells.v2(context);
                    v2Var.f = 23;
                    TextView textView = new TextView(context);
                    v2Var.b = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    boolean z11 = org.telegram.messenger.hd.a0;
                    v2Var.addView(textView, c8.ja.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    v2Var.c = textView2;
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.I6, null);
                    org.telegram.messenger.i20.p(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    v2Var.addView(textView2, c8.ja.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    v2Var.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.h7, null);
                    v2Var.addView(radioButton, c8.ja.d(22, 22.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    v2Var.b();
                    v2Var.setHorizontalPadding(21);
                    n4Var = v2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, i7 != 12 ? 0 : 3, false);
                    paVar.setSelfAsSavedMessages(true);
                    n4Var = paVar;
                    break;
                case 13:
                    n4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.e, null, false, true);
                    n4Var = n4Var2;
                    break;
                case 14:
                    n4Var = new wt0(context, e6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.s7(context, e6Var);
                    break;
                case 16:
                    n4Var = new kg.q1(context, e6Var, this.N != null);
                    break;
                case 17:
                    n4Var = new kg.o1(context, e6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.F == null) {
                        this.F = new lg.f((org.telegram.ui.ActionBar.e6) null);
                    }
                    h5Var = new org.telegram.ui.x41(this.e, this.f, i7 - 18, this.F, this.h);
                    n4Var = h5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.vd(context, e6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.wd(context, e6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.G6, 23, 20, 0, false, false, this.x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    hi.p8 p8Var = new hi.p8(context, e6Var);
                    p8Var.d(false, false);
                    n4Var = p8Var;
                    break;
                case 28:
                    zj0Var = new n41(context);
                    zj0Var.setTag(-33024);
                    n4Var = zj0Var;
                    break;
                case 29:
                    n4Var = new kg.t(context, e6Var);
                    break;
                case org.telegram.messenger.ns.T /* 30 */:
                    n4Var = new org.telegram.ui.Cells.b9(context, e6Var);
                    break;
                case org.telegram.messenger.ns.U /* 31 */:
                    if (uj0Var != null && uj0Var.b1()) {
                        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(28, context, e6Var);
                        x3Var.setNoBackground(true);
                        n4Var = x3Var;
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.x3(context, e6Var);
                        break;
                    }
                    break;
                case 32:
                    n4Var = new org.telegram.ui.Cells.f6(context, null);
                    break;
                case 33:
                    n4Var = new org.telegram.ui.Cells.t2(context, true);
                    break;
                case 34:
                    pz pzVar = new pz(context, e6Var);
                    pzVar.setIsSingleCell(true);
                    n4Var = pzVar;
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
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    } else {
                        i12 = 4;
                    }
                    i10 = i12;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.e, i10, 21, true, this.x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.j6.V6, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.k7);
                    n4Var3 = c2Var2;
                    n4Var = n4Var3;
                case 38:
                    n4Var = new org.telegram.ui.Cells.d2(context, e6Var);
                    break;
                case 39:
                case 40:
                    n4Var = new org.telegram.ui.Cells.p8(context);
                    break;
                case 42:
                    n4Var3 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.j6.L6, 21, 15, 0, false, true, this.x);
                    n4Var = n4Var3;
                    break;
                case 43:
                    n4Var = new org.telegram.ui.Cells.v9(0, context, e6Var);
                    break;
                case 44:
                    n4Var = new org.telegram.ui.Cells.g6(context, false);
                    break;
            }
        } else {
            a41 G = b41.G(i7);
            n4Var = G != null ? G.d(context, uj0Var, this.f, e6Var) : new View(context);
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.q6.h(i11, n4Var, this.P);
        }
        return new cj0(n4Var);
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        R(e1Var, this.O);
        P(e1Var);
    }
}
