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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class l41 extends rg.b {
    public lg.f E;
    public i41 I;
    public i41 J;
    public int K;
    public boolean L;
    public org.telegram.messenger.v10 M;
    public boolean N;
    public final pj0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public org.telegram.messenger.v10 w;
    public final org.telegram.ui.ActionBar.f6 x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList D = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final org.telegram.ui.ActionBar.s1 O = new org.telegram.ui.ActionBar.s1(this, 2);

    public l41(pj0 pj0Var, Context context, int i7, int i10, boolean z9, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = pj0Var;
        this.e = context;
        this.f = i7;
        this.h = i10;
        this.n = z9;
        this.w = v10Var;
        this.x = f6Var;
        O(false);
    }

    public static boolean K(int i7) {
        if (i7 < 10000) {
            return i7 == 7 || i7 == 8 || i7 == 38 || i7 == 31 || i7 == -4 || i7 == 28 || i7 == 2 || i7 == -2;
        }
        w31 G = x31.G(i7);
        return G != null && G.g();
    }

    @Override // org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        x31 G = G(d1Var.b());
        if (i7 >= 10000) {
            w31 G2 = x31.G(i7);
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
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                return;
            }
            i41 i41Var = (i41) arrayList.get(i7);
            this.M.a(Integer.valueOf(i7), new ArrayList(this.D.subList(i41Var.a, i41Var.b + 1)));
            this.L = false;
        }
    }

    public final x31 G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (x31) arrayList.get(i7);
    }

    public final int H(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            i41 i41Var = (i41) arrayList.get(i10);
            if (i7 >= i41Var.a && i7 <= i41Var.b) {
                return i10;
            }
            i10++;
        }
    }

    public int I(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.x);
    }

    public final boolean J(int i7) {
        x31 G = G(i7);
        x31 G2 = G(i7 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        i41 i41Var = this.J;
        if (i41Var != null) {
            i41Var.b = Math.max(0, this.D.size() - 1);
        }
    }

    public final int M() {
        i41 i41Var = new i41();
        this.J = i41Var;
        i41Var.a = this.D.size();
        i41 i41Var2 = this.J;
        i41Var2.b = -1;
        this.H.add(i41Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i7) {
        if (!this.r) {
            return false;
        }
        pj0 pj0Var = this.d;
        if (pj0Var != null && pj0Var.b1() && pj0Var.getSectionsDrawBackground()) {
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
            case org.telegram.messenger.qs.T /* 30 */:
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
            case org.telegram.messenger.qs.U /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z9) {
        pj0 pj0Var = this.d;
        if (pj0Var == null || !pj0Var.c0()) {
            Q(z9);
        } else {
            pj0Var.post(new tp0(5, this, z9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.a6) {
            ((org.telegram.ui.ActionBar.a6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i7 = org.telegram.ui.ActionBar.r6.b;
            if (N(d1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i7)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i7));
        }
    }

    public final void Q(boolean z9) {
        pj0 pj0Var = this.d;
        if (pj0Var == null || !pj0Var.c0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.D;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            org.telegram.messenger.v10 v10Var = this.w;
            if (v10Var != null) {
                v10Var.a(arrayList2, this);
                S();
                if (z9) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(v4.d1 d1Var, boolean z9) {
        if (d1Var == null) {
            return;
        }
        View view = d1Var.a;
        int i7 = d1Var.f;
        if (i7 < 10000) {
            if (i7 != 16) {
                return;
            }
            ((kg.p1) view).setReorder(z9);
        } else {
            w31 G = x31.G(i7);
            if (G != null) {
                G.a(this.d, view, G(d1Var.b()));
            }
        }
    }

    public final void S() {
        pj0 pj0Var = this.d;
        if (pj0Var == null) {
            return;
        }
        ArrayList arrayList = pj0Var.K2;
        if (arrayList == null) {
            pj0Var.K2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            i41 i41Var = (i41) obj;
            pj0Var.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(i41Var.a, i41Var.b)));
        }
    }

    public final void T() {
        ArrayList arrayList = this.y;
        arrayList.clear();
        ArrayList arrayList2 = this.D;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.G.clear();
        this.H.clear();
        org.telegram.messenger.v10 v10Var = this.w;
        if (v10Var != null) {
            v10Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        i41 i41Var = this.I;
        if (i41Var != null) {
            i41Var.b = Math.max(0, (this.D.size() + this.F) - 1);
            i41 i41Var2 = this.I;
            if (i41Var2.a == i41Var2.b) {
                this.G.remove(i41Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        i41 i41Var = new i41();
        this.I = i41Var;
        i41Var.a = this.D.size() + this.F;
        i41 i41Var2 = this.I;
        i41Var2.b = -1;
        this.G.add(i41Var2);
    }

    @Override // v4.g0
    public final int b() {
        return this.D.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        x31 G = G(i7);
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(v4.d1 d1Var, int i7) {
        String str;
        org.telegram.ui.Cells.z8 z8Var;
        ?? r92;
        TLRPC.Document document;
        long j3;
        String str2;
        org.telegram.messenger.hc hcVar;
        TLRPC.Photo photo;
        long j10;
        char c10;
        boolean z9;
        boolean z10;
        long j11;
        CharSequence concat;
        int i10;
        int i11 = this.f;
        pj0 pj0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        x31 G = G(i7);
        x31 G2 = G(i7 + 1);
        x31 G3 = G(i7 - 1);
        if (G == null) {
            return;
        }
        int i12 = d1Var.f;
        View view = d1Var.a;
        boolean J = J(i7);
        P(d1Var);
        if (i12 < 10000) {
            long j12 = 0;
            str = "";
            boolean z11 = true;
            switch (i12) {
                case -5:
                    uj0 uj0Var = (uj0) view;
                    if (uj0Var.getChildCount() != (G.c == null ? 0 : 1) || uj0Var.getChildAt(0) != G.c) {
                        uj0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            org.telegram.messenger.g0.E2(view2);
                            uj0Var.addView(G.c, c8.ha.c(-1.0f, -1));
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
                            frameLayout.addView(G.c, (i12 == -1 || i12 == -4) ? c8.ha.c(G.z, -1) : c8.ha.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    h41 h41Var = (h41) view;
                    h41Var.setMinusHeight(G.z);
                    h41Var.setMinusPadding(c8.zc.a(G.y, 1));
                    if (h41Var.getChildCount() != (G.c == null ? 0 : 1) || h41Var.getChildAt(0) != G.c) {
                        h41Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            org.telegram.messenger.g0.E2(view4);
                            h41Var.addView(G.c, c8.ha.c(-1.0f, -1));
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
                    e01 e01Var = (e01) view;
                    int i13 = G.k;
                    if (i13 == 0) {
                        int i14 = G.z;
                        if (i14 != 0) {
                            e01Var.setEmojiSize(i14);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        e01Var.getClass();
                        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).c2(e01Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        e01Var.setEmojiStatic(i13);
                    } else {
                        e01Var.setEmoji(i13);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        e01Var.a(G.l, G.o);
                        break;
                    } else {
                        e01Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        m8Var.x = m8Var.getDefaultImageLeft();
                        m8Var.s = m8Var.c(false);
                        org.telegram.ui.ActionBar.k5 k5Var = m8Var.a;
                        k5Var.l(charSequence3, false);
                        k5Var.i(null);
                        j6 j6Var = m8Var.c;
                        m8Var.Q = null;
                        j6Var.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        j6Var.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        ch0 ch0Var = m8Var.e;
                        ch0Var.setVisibility(8);
                        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r12 = m8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        m8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str3 = (String) obj;
                        m8Var.x = m8Var.getDefaultImageLeft();
                        m8Var.s = m8Var.c(false);
                        org.telegram.ui.ActionBar.k5 k5Var2 = m8Var.a;
                        k5Var2.l(charSequence4, false);
                        k5Var2.i(null);
                        j6 j6Var2 = m8Var.c;
                        m8Var.Q = null;
                        j6Var2.c(null, false, true);
                        m8Var.h.setVisibility(8);
                        j6Var2.setVisibility(8);
                        m8Var.d.setVisibility(8);
                        ch0 ch0Var2 = m8Var.e;
                        ch0Var2.setVisibility(8);
                        ch0Var2.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                        m8Var.r = J;
                        m8Var.setWillNotDraw(!J);
                        Switch r13 = m8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        m8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            m8Var.p(G.l, (Drawable) obj2, J);
                        } else {
                            int i15 = G.k;
                            if (i15 == 0) {
                                m8Var.k(G.l, J);
                            } else {
                                m8Var.o(i15, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            m8Var.t(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                m8Var.q(G.l, G.n, false, J);
                            } else {
                                m8Var.u(G.l, G.n, false, i16, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i17 = org.telegram.ui.ActionBar.k6.q6;
                        m8Var.g(i17, i17);
                    } else if (G.r) {
                        m8Var.g(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
                    } else {
                        m8Var.g(org.telegram.ui.ActionBar.k6.m6, org.telegram.ui.ActionBar.k6.G6);
                    }
                    m8Var.h(45, G.t, true);
                    m8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (r8Var.b == G.d) {
                        r8Var.setChecked(G.e);
                    }
                    r8Var.e(null, G.g);
                    r8Var.f(G.l, G.e, J);
                    r8Var.b = G.d;
                    if (i12 == 9) {
                        org.telegram.ui.ActionBar.r6.i(G.e ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, view, null);
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
                        org.telegram.ui.Cells.z8 z8Var2 = (org.telegram.ui.Cells.z8) view;
                        if (TextUtils.isEmpty(G.l)) {
                            z8Var2.setFixedSize(i12 == 8 ? org.telegram.messenger.qs.x3 : 12);
                            z8Var2.setText("");
                        } else {
                            z8Var2.setFixedSize(0);
                            z8Var2.setText(G.l);
                        }
                        if (G.q) {
                            z8Var2.setTextGravity(17);
                            z8Var2.getTextView().setWidth(Math.min(fi.m3.a(z8Var2.getText(), z8Var2.getTextView().getPaint()), org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(60.0f)));
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
                        CharSequence charSequence6 = G.o;
                        boolean z12 = G.f;
                        d2Var.a.setText(charSequence6);
                        View view5 = d2Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z12 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h).start();
                        if (G.q) {
                            d2Var.setColor(org.telegram.ui.ActionBar.k6.q6);
                            z8Var = d2Var;
                        } else if (G.r) {
                            d2Var.setColor(org.telegram.ui.ActionBar.k6.p7);
                            z8Var = d2Var;
                        } else {
                            d2Var.setColor(org.telegram.ui.ActionBar.k6.G6);
                            z8Var = d2Var;
                        }
                    } else {
                        z8Var = null;
                    }
                    boolean z13 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z14 = (G2 == null || K(G2.a)) ? false : true;
                    if (!pj0Var.b1()) {
                        Drawable X0 = org.telegram.ui.ActionBar.k6.X0(this.e, (z13 && z14) ? R.drawable.greydivider : z13 ? R.drawable.greydivider_bottom : z14 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.b7, f6Var));
                        if (!this.n) {
                            z8Var.setBackground(X0);
                            break;
                        } else {
                            int i18 = org.telegram.ui.ActionBar.k6.i5;
                            z8Var.setBackground(new LayerDrawable(new Drawable[]{I(i18) == org.telegram.ui.ActionBar.k6.w0(i18, f6Var) ? new k41(i18, f6Var) : new ColorDrawable(I(i18)), X0}));
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
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z15 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z15, r92);
                        v2Var.e = J;
                        v2Var.b();
                        v2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z16 = G.e;
                        textView2.setVisibility(r92);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z16, r92);
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
                    vt0 vt0Var = (vt0) view;
                    vt0Var.b(G.z, null, G.p);
                    vt0Var.setMinAllowedIndex((int) G.B);
                    vt0Var.setCallback(new ax(G, 25));
                    break;
                case 15:
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                    t7Var.d(G.z, (org.telegram.ui.Cells.s7) G.G, G.C);
                    t7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    kg.p1 p1Var = (kg.p1) view;
                    p1Var.d.a(G.e, false);
                    p1Var.setReorder(this.N);
                    Object obj4 = G.G;
                    if (obj4 instanceof kg.s1) {
                        p1Var.a((kg.s1) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    kg.n1 n1Var = (kg.n1) view;
                    n1Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof kg.s1) {
                        kg.s1 s1Var = (kg.s1) obj5;
                        w8 w8Var = n1Var.a;
                        int[] iArr = n1Var.r;
                        TextView textView3 = n1Var.d;
                        ImageReceiver imageReceiver = n1Var.b;
                        int i20 = org.telegram.messenger.p10.s0;
                        n1Var.c.setText(org.telegram.messenger.qp.s1(i20).B1(org.telegram.messenger.p10.i(i20).e(), false));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.messenger.ij ijVar = s1Var.e;
                        if (ijVar != null) {
                            spannableStringBuilder.append(org.telegram.messenger.i6.m(ijVar.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                        if (s1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
                            int a10 = s1Var.a() - 1;
                            int i21 = kg.o1.d;
                            SpannableString spannableString = new SpannableString("+");
                            kg.o1 o1Var = new kg.o1(a10);
                            iArr[0] = (int) (((my0) o1Var.c).c + org.telegram.messenger.g0.L(10.0f));
                            spannableString.setSpan(o1Var, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia n1 = org.telegram.messenger.ij.n1(s1Var.e);
                        if (n1 != null && (photo = n1.photo) != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            org.telegram.messenger.hc f10 = org.telegram.messenger.hc.f(w10, n1.photo);
                            org.telegram.messenger.ij ijVar2 = s1Var.e;
                            imageReceiver.p0(f10, "36_36", ijVar2.G1, w10 == null ? 0L : w10.size, null, ijVar2, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        } else if (n1 == null || (document = n1.document) == null) {
                            w8Var.r(org.telegram.messenger.p10.i(i20).f());
                            imageReceiver.i0(org.telegram.messenger.p10.i(i20).f(), w8Var, null);
                            imageReceiver.J0(org.telegram.messenger.g0.L(56.0f));
                        } else {
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
                            if (w11 == null) {
                                org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(n1.document);
                                j3 = n1.document.size;
                                hcVar = b10;
                                str2 = "g";
                            } else {
                                org.telegram.messenger.hc f11 = org.telegram.messenger.hc.f(w11, n1.document);
                                j3 = w11.size;
                                str2 = "36_36";
                                hcVar = f11;
                            }
                            long j13 = j3;
                            org.telegram.messenger.ij ijVar3 = s1Var.e;
                            imageReceiver.p0(hcVar, str2, ijVar3.G1, j13, null, ijVar3, 0);
                            imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
                        }
                        n1Var.s = J;
                        n1Var.invalidate();
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
                    int i22 = G.z;
                    org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) G.G;
                    org.telegram.ui.eh ehVar = new org.telegram.ui.eh(z11 ? 1 : 0, this, G);
                    a51Var.y = i22;
                    a51Var.D = ehVar;
                    a51Var.e(o41Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.xd) view).set((org.telegram.ui.wd) G.G);
                    break;
                case 25:
                    org.telegram.ui.yd ydVar = (org.telegram.ui.yd) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    q5 q5Var = ydVar.b;
                    org.telegram.ui.ActionBar.f6 f6Var2 = ydVar.a;
                    TextView textView4 = ydVar.c;
                    TextView textView5 = ydVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(org.telegram.messenger.hd.M0(2131748354, null));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(org.telegram.messenger.hd.M0(2131748357, null));
                            z9 = false;
                        } else {
                            z9 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.hd.Q(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z9 ? jg.g.l(2131748358, null, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j10 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131748356, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date) + " - " + org.telegram.messenger.hd.Q(r5.to_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            textView4.setText(org.telegram.messenger.hd.M0(2131748355, null));
                            textView5.setText(org.telegram.messenger.hd.Q(r5.from_date));
                            j10 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                        }
                        c10 = 1;
                        z9 = false;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView5, z9 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6, f6Var2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) ydVar.e.format(Math.abs(j10) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z10 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z10 = false;
                    }
                    q5Var.setText(org.telegram.ui.zd.K(spannableStringBuilder3, q5Var.getPaint(), 1.1f, org.telegram.messenger.g0.L(0.33f), z10));
                    org.telegram.ui.ActionBar.r6.V(q5Var, c10 < 0 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.l8, f6Var2);
                    ydVar.f = J;
                    ydVar.setWillNotDraw(!J);
                    break;
                case 27:
                    fi.r8 r8Var2 = (fi.r8) view;
                    long j14 = r8Var2.y;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j11 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z17 = j14 != j12;
                        r8Var2.d(false, true);
                        r8Var2.set(G.G);
                        r8Var2.f.setVisibility(8);
                        r8Var2.h.setVisibility(0);
                        r8Var2.c(G.e, z17);
                        r8Var2.setDivider(J);
                        break;
                    } else {
                        j11 = ((TLRPC.User) obj6).id;
                    }
                    j12 = j11;
                    if (j14 != j12) {
                    }
                    r8Var2.d(false, true);
                    r8Var2.set(G.G);
                    r8Var2.f.setVisibility(8);
                    r8Var2.h.setVisibility(0);
                    r8Var2.c(G.e, z17);
                    r8Var2.setDivider(J);
                case 28:
                    if (G.s) {
                        org.telegram.ui.ActionBar.r6.r(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.r6.r(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((j41) view).setHeight(G.z);
                    break;
                case 29:
                    kg.t tVar = (kg.t) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof kg.u) {
                        org.telegram.ui.ActionBar.k5 k5Var3 = tVar.a;
                        org.telegram.ui.ActionBar.k5 k5Var4 = tVar.c;
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
                            k5Var3.l(str4, false);
                        } else {
                            k5Var3.l(tVar.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tVar.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = tVar.f;
                        org.telegram.messenger.ui.g(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4, -1);
                        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder4, lVar.getPaint().getFontMetricsInt(), false, null, 0);
                        org.telegram.messenger.ij.C5(m10, tVar.f.entities, lVar.getPaint().getFontMetricsInt(), false);
                        lVar.setText(m10);
                        int i23 = tVar.f.views;
                        if (i23 == 0) {
                            k5Var4.l(org.telegram.messenger.hd.a0(null, null, 2131748226, new Object[0]), false);
                        } else {
                            k5Var4.l(org.telegram.messenger.hd.G(i23, "Clicks", new Object[0]), false);
                        }
                        k5Var4.requestLayout();
                        tVar.invalidate();
                        break;
                    }
                    break;
                case org.telegram.messenger.qs.T /* 30 */:
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    CharSequence charSequence11 = G.l;
                    int i24 = G.k;
                    c9Var.b.l(charSequence11, false);
                    c9Var.a.setImageResource(i24);
                    c9Var.setDivider(J);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, c9Var, this.O);
                    break;
                case org.telegram.messenger.qs.U /* 31 */:
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (!TextUtils.equals(x3Var.getText(), G.l)) {
                        x3Var.b(G.l, G.m, G.D);
                        break;
                    } else {
                        x3Var.a(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i10 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i10 != 0) {
                            concat = org.telegram.messenger.hd.H(' ', "BotUsers", i10);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z18 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof org.telegram.messenger.c20) {
                            }
                            g6Var.B0 = z18;
                            g6Var.C0 = r11;
                            g6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            g6Var.x(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            g6Var.w(G.e, false);
                            g6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z182 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof org.telegram.messenger.c20) {
                        }
                        g6Var.B0 = z182;
                        g6Var.C0 = r11;
                        g6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        g6Var.x(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        g6Var.w(G.e, false);
                        g6Var.M = J;
                    } else {
                        if (G.I) {
                            String n10 = obj8 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) obj8, false) : null;
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
                                    str = org.telegram.messenger.t10.p((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1822 = G.t;
                                Object obj922 = G.H;
                                org.telegram.messenger.c20 c20Var = obj922 instanceof org.telegram.messenger.c20 ? (org.telegram.messenger.c20) obj922 : null;
                                g6Var.B0 = z1822;
                                g6Var.C0 = c20Var;
                                g6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                g6Var.x(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                g6Var.w(G.e, false);
                                g6Var.M = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z18222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof org.telegram.messenger.c20) {
                        }
                        g6Var.B0 = z18222;
                        g6Var.C0 = c20Var;
                        g6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        g6Var.x(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        g6Var.w(G.e, false);
                        g6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                    Object obj10 = G.G;
                    org.telegram.messenger.ij ijVar4 = obj10 instanceof org.telegram.messenger.ij ? (org.telegram.messenger.ij) obj10 : null;
                    t2Var.s2 = J;
                    if (ijVar4 != null) {
                        t2Var.d0(org.telegram.messenger.ij.B0(ijVar4.k), ijVar4, ijVar4.k.date, false, false);
                        break;
                    } else {
                        t2Var.d0(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((lz) view).setViewType(G.z);
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
                        boolean z19 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        bi.nc ncVar = c2Var.w;
                        if (ncVar != null) {
                            j6 j6Var3 = (j6) ncVar.c;
                            j6Var3.a();
                            j6Var3.setText(charSequence13);
                            View view6 = ncVar.d;
                            view6.animate().cancel();
                            view6.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h).start();
                            if (onClickListener != null) {
                                ncVar.setOnClickListener(onClickListener);
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
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.d(G.l.toString(), G.e, J, q8Var.a == G.d);
                    q8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = q8Var.getCheckBox();
                    int i25 = G.z == 0 ? org.telegram.ui.ActionBar.k6.M6 : org.telegram.ui.ActionBar.k6.r7;
                    int i26 = org.telegram.ui.ActionBar.k6.N6;
                    int i27 = org.telegram.ui.ActionBar.k6.d6;
                    checkBox.d(i25, i26, i27, i27);
                    q8Var.a = G.d;
                    q8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i12 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            q8Var.a(new v80(29, G, q8Var), G.o.toString(), G.f);
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
                    n4Var2.c(G.o, n4Var2.a == G.d);
                    n4Var2.a = G.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            w9Var.c(charSequence14, charSequence15, false, J);
                        } else {
                            w9Var.b(charSequence14, J);
                        }
                    }
                    w9Var.setIcon(G.k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.h6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            w31 G4 = x31.G(i12);
            if (G4 != null) {
                G4.b(d1Var.a, G, J, this, pj0Var instanceof q41 ? (q41) pj0Var : null);
            }
        }
        org.telegram.messenger.c20 c20Var2 = G.F;
        if (c20Var2 != null) {
            c20Var2.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        View uj0Var;
        View n4Var;
        View n4Var2;
        View h5Var;
        int i10;
        org.telegram.ui.Cells.n4 n4Var3;
        boolean z9 = this.n;
        int i11 = z9 ? org.telegram.ui.ActionBar.k6.h5 : org.telegram.ui.ActionBar.k6.d6;
        pj0 pj0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        Context context = this.e;
        if (i7 < 10000) {
            int i12 = 8;
            switch (i7) {
                case -5:
                    uj0Var = new uj0(context);
                    uj0Var.setTag(-33024);
                    n4Var = uj0Var;
                    break;
                case -4:
                case -1:
                    uj0Var = new di.a4(context, 23);
                    if (i7 == -4) {
                        uj0Var.setTag(-33024);
                    }
                    n4Var = uj0Var;
                    break;
                case -3:
                    h41 h41Var = new h41(context);
                    h41Var.a = 0;
                    n4Var = h41Var;
                    break;
                case -2:
                    n4Var = new di.a4(context, 24);
                    break;
                case 0:
                    if (!z9) {
                        n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    n4Var2 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.k6.G6, 17, 15, false, this.x);
                    n4Var = n4Var2;
                    break;
                case 2:
                    n4Var = new e01(context, f6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, f6Var);
                    m8Var.setCompactLayout(this.s);
                    n4Var = m8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, f6Var);
                    if (i7 == 9) {
                        r8Var.setDrawCheckRipple(true);
                        r8Var.d(org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
                        r8Var.setTypeface(org.telegram.messenger.g0.o());
                        r8Var.setHeight(56);
                    }
                    n4Var = r8Var;
                    break;
                case 5:
                case 6:
                    h5Var = new org.telegram.ui.Cells.h5(this.e, 21, 60, i7 == 6, this.x);
                    n4Var = h5Var;
                    break;
                case 7:
                case 8:
                default:
                    n4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.v2 v2Var = new org.telegram.ui.Cells.v2(context);
                    v2Var.f = 23;
                    TextView textView = new TextView(context);
                    v2Var.b = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    boolean z10 = org.telegram.messenger.hd.a0;
                    v2Var.addView(textView, c8.ha.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 61.0f : 23.0f, 0.0f, z10 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    v2Var.c = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.I6, null);
                    org.telegram.messenger.camera.q.n(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((org.telegram.messenger.hd.a0 ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    v2Var.addView(textView2, c8.ha.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    v2Var.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, null);
                    v2Var.addView(radioButton, c8.ha.d(22, 22.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
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
                    n4Var = new vt0(context, f6Var);
                    break;
                case 15:
                    n4Var = new org.telegram.ui.Cells.t7(context, f6Var);
                    break;
                case 16:
                    n4Var = new kg.p1(context, f6Var, this.M != null);
                    break;
                case 17:
                    n4Var = new kg.n1(context, f6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new lg.f((org.telegram.ui.ActionBar.f6) null);
                    }
                    h5Var = new org.telegram.ui.a51(this.e, this.f, i7 - 18, this.E, this.h);
                    n4Var = h5Var;
                    break;
                case 24:
                    n4Var = new org.telegram.ui.xd(context, f6Var);
                    break;
                case 25:
                    n4Var = new org.telegram.ui.yd(context, f6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.k6.G6, 23, 20, 0, false, false, this.x);
                    n4Var4.setTextSize(20.0f);
                    n4Var3 = n4Var4;
                    n4Var = n4Var3;
                    break;
                case 27:
                    fi.r8 r8Var2 = new fi.r8(context, f6Var);
                    r8Var2.d(false, false);
                    n4Var = r8Var2;
                    break;
                case 28:
                    uj0Var = new j41(context);
                    uj0Var.setTag(-33024);
                    n4Var = uj0Var;
                    break;
                case 29:
                    n4Var = new kg.t(context, f6Var);
                    break;
                case org.telegram.messenger.qs.T /* 30 */:
                    n4Var = new org.telegram.ui.Cells.c9(context, f6Var);
                    break;
                case org.telegram.messenger.qs.U /* 31 */:
                    if (pj0Var != null && pj0Var.b1()) {
                        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(28, context, f6Var);
                        x3Var.setNoBackground(true);
                        n4Var = x3Var;
                        break;
                    } else {
                        n4Var = new org.telegram.ui.Cells.x3(context, f6Var);
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
                    lz lzVar = new lz(context, f6Var);
                    lzVar.setIsSingleCell(true);
                    n4Var = lzVar;
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
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                        n4Var3 = c2Var;
                        n4Var = n4Var3;
                        break;
                    } else {
                        i12 = 4;
                    }
                    i10 = i12;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(this.e, i10, 21, true, this.x);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.k6.V6, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
                    n4Var3 = c2Var2;
                    n4Var = n4Var3;
                case 38:
                    n4Var = new org.telegram.ui.Cells.d2(context, f6Var);
                    break;
                case 39:
                case 40:
                    n4Var = new org.telegram.ui.Cells.q8(context);
                    break;
                case 42:
                    n4Var3 = new org.telegram.ui.Cells.n4(this.e, org.telegram.ui.ActionBar.k6.L6, 21, 15, 0, false, true, this.x);
                    n4Var = n4Var3;
                    break;
                case 43:
                    n4Var = new org.telegram.ui.Cells.w9(0, context, f6Var);
                    break;
                case 44:
                    n4Var = new org.telegram.ui.Cells.h6(context, false);
                    break;
            }
        } else {
            w31 G = x31.G(i7);
            n4Var = G != null ? G.d(context, pj0Var, this.f, f6Var) : new View(context);
        }
        if (N(i7)) {
            org.telegram.ui.ActionBar.r6.i(i11, n4Var, this.O);
        }
        return new xi0(n4Var);
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        R(d1Var, this.N);
        P(d1Var);
    }
}
