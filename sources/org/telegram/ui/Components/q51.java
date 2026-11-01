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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class q51 extends hg.c {
    public bg.h E;
    public n51 I;
    public n51 J;
    public int K;
    public boolean L;
    public org.telegram.messenger.k20 M;
    public boolean N;
    public final uk0 d;
    public final Context e;
    public final int f;
    public final int h;
    public final boolean n;
    public boolean s;
    public org.telegram.messenger.k20 w;
    public final org.telegram.ui.ActionBar.p6 x;
    public boolean r = true;
    public final ArrayList y = new ArrayList();
    public final ArrayList D = new ArrayList();
    public int F = 0;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final org.telegram.ui.ActionBar.v1 O = new org.telegram.ui.ActionBar.v1(this, 2);

    public q51(uk0 uk0Var, Context context, int i10, int i11, boolean z10, org.telegram.messenger.k20 k20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = uk0Var;
        this.e = context;
        this.f = i10;
        this.h = i11;
        this.n = z10;
        this.w = k20Var;
        this.x = p6Var;
        O(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        a51 G = b51.G(i10);
        return G != null && G.g();
    }

    @Override // org.telegram.ui.Components.tk0
    public boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        b51 G = G(c1Var.b());
        if (i10 >= 10000) {
            a51 G2 = b51.G(i10);
            if (G2 == null || !G2.f()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        return G == null || G.g;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return;
            }
            n51 n51Var = (n51) arrayList.get(i10);
            this.M.a(Integer.valueOf(i10), new ArrayList(this.D.subList(n51Var.a, n51Var.b + 1)));
            this.L = false;
        }
    }

    public final b51 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (b51) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            n51 n51Var = (n51) arrayList.get(i11);
            if (i10 >= n51Var.a && i10 <= n51Var.b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.x);
    }

    public final boolean J(int i10) {
        b51 G = G(i10);
        b51 G2 = G(i10 + 1);
        return (G == null || G.j || G2 == null || K(G2.a) != K(G.a)) ? false : true;
    }

    public final void L() {
        n51 n51Var = this.J;
        if (n51Var != null) {
            n51Var.b = Math.max(0, this.D.size() - 1);
        }
    }

    public final int M() {
        n51 n51Var = new n51();
        this.J = n51Var;
        n51Var.a = this.D.size();
        n51 n51Var2 = this.J;
        n51Var2.b = -1;
        this.H.add(n51Var2);
        return r1.size() - 1;
    }

    public final boolean N(int i10) {
        if (!this.r) {
            return false;
        }
        uk0 uk0Var = this.d;
        if (uk0Var != null && uk0Var.b1() && uk0Var.getSectionsDrawBackground()) {
            return false;
        }
        if (i10 >= 10000) {
            return true;
        }
        switch (i10) {
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
            case org.telegram.messenger.at.T /* 30 */:
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
            case org.telegram.messenger.at.U /* 31 */:
            case 38:
            default:
                return false;
        }
    }

    public void O(boolean z10) {
        uk0 uk0Var = this.d;
        if (uk0Var == null || !uk0Var.c0()) {
            Q(z10);
        } else {
            uk0Var.post(new k2.v(25, this, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.ActionBar.k6) {
            ((org.telegram.ui.ActionBar.k6) view).updateColors();
            Object tag = view.getTag(R.id.theme_generation);
            int i10 = org.telegram.ui.ActionBar.a7.b;
            if (N(c1Var.f) && (!(tag instanceof Integer) || ((Integer) tag).intValue() != i10)) {
                view.setBackgroundColor(I(this.n ? org.telegram.ui.ActionBar.t6.h5 : org.telegram.ui.ActionBar.t6.d6));
            }
            view.setTag(R.id.theme_generation, Integer.valueOf(i10));
        }
    }

    public final void Q(boolean z10) {
        uk0 uk0Var = this.d;
        if (uk0Var == null || !uk0Var.c0()) {
            ArrayList arrayList = this.y;
            arrayList.clear();
            ArrayList arrayList2 = this.D;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = null;
            this.G.clear();
            this.H.clear();
            org.telegram.messenger.k20 k20Var = this.w;
            if (k20Var != null) {
                k20Var.a(arrayList2, this);
                S();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    f();
                }
            }
        }
    }

    public final void R(s4.c1 c1Var, boolean z10) {
        if (c1Var == null) {
            return;
        }
        View view = c1Var.a;
        int i10 = c1Var.f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((ag.y2) view).setReorder(z10);
        } else {
            a51 G = b51.G(i10);
            if (G != null) {
                G.a(this.d, view, G(c1Var.b()));
            }
        }
    }

    public final void S() {
        uk0 uk0Var = this.d;
        if (uk0Var == null) {
            return;
        }
        ArrayList arrayList = uk0Var.K2;
        if (arrayList == null) {
            uk0Var.K2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            n51 n51Var = (n51) obj;
            uk0Var.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(n51Var.a, n51Var.b)));
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
        org.telegram.messenger.k20 k20Var = this.w;
        if (k20Var != null) {
            k20Var.a(arrayList2, this);
        }
        S();
    }

    public final void U() {
        n51 n51Var = this.I;
        if (n51Var != null) {
            n51Var.b = Math.max(0, (this.D.size() + this.F) - 1);
            n51 n51Var2 = this.I;
            if (n51Var2.a == n51Var2.b) {
                this.G.remove(n51Var2);
            }
            this.I = null;
        }
    }

    public final void V() {
        n51 n51Var = new n51();
        this.I = n51Var;
        n51Var.a = this.D.size() + this.F;
        n51 n51Var2 = this.I;
        n51Var2.b = -1;
        this.G.add(n51Var2);
    }

    @Override // s4.g0
    public final int b() {
        return this.D.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        b51 G = G(i10);
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(s4.c1 c1Var, int i10) {
        String str;
        org.telegram.ui.Cells.b9 b9Var;
        ?? r92;
        TLRPC.Document document;
        long j10;
        String str2;
        org.telegram.messenger.jc jcVar;
        TLRPC.Photo photo;
        long j11;
        char c10;
        boolean z10;
        boolean z11;
        long j12;
        CharSequence concat;
        int i11;
        int i12 = this.f;
        uk0 uk0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        b51 G = G(i10);
        b51 G2 = G(i10 + 1);
        b51 G3 = G(i10 - 1);
        if (G == null) {
            return;
        }
        int i13 = c1Var.f;
        View view = c1Var.a;
        boolean J = J(i10);
        P(c1Var);
        if (i13 < 10000) {
            long j13 = 0;
            str = "";
            boolean z12 = true;
            switch (i13) {
                case -5:
                    zk0 zk0Var = (zk0) view;
                    if (zk0Var.getChildCount() != (G.c == null ? 0 : 1) || zk0Var.getChildAt(0) != G.c) {
                        zk0Var.removeAllViews();
                        View view2 = G.c;
                        if (view2 != null) {
                            org.telegram.messenger.i0.E2(view2);
                            zk0Var.addView(G.c, w7.b6.c(-1.0f, -1));
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
                            org.telegram.messenger.i0.E2(view3);
                            frameLayout.addView(G.c, (i13 == -1 || i13 == -4) ? w7.b6.c(G.z, -1) : w7.b6.c(-2.0f, -2));
                            break;
                        }
                    }
                    break;
                case -3:
                    m51 m51Var = (m51) view;
                    m51Var.setMinusHeight(G.z);
                    m51Var.setMinusPadding(v7.u7.a(G.y, 1));
                    if (m51Var.getChildCount() != (G.c == null ? 0 : 1) || m51Var.getChildAt(0) != G.c) {
                        m51Var.removeAllViews();
                        View view4 = G.c;
                        if (view4 != null) {
                            org.telegram.messenger.i0.E2(view4);
                            m51Var.addView(G.c, w7.b6.c(-1.0f, -1));
                            break;
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    p4Var.setText(G.l);
                    p4Var.b(G.g);
                    break;
                case 2:
                    k11 k11Var = (k11) view;
                    int i14 = G.k;
                    if (i14 == 0) {
                        int i15 = G.z;
                        if (i15 != 0) {
                            k11Var.setEmojiSize(i15);
                        }
                        String charSequence = G.m.toString();
                        String charSequence2 = G.n.toString();
                        k11Var.getClass();
                        org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).c2(k11Var.b, charSequence, charSequence2, "90_90");
                    } else if (G.q) {
                        k11Var.setEmojiStatic(i14);
                    } else {
                        k11Var.setEmoji(i14);
                    }
                    if (!TextUtils.isEmpty(G.o)) {
                        k11Var.a(G.l, G.o);
                        break;
                    } else {
                        k11Var.setText(G.l);
                        break;
                    }
                case 3:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    Object obj = G.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = G.l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        p8Var.x = p8Var.getDefaultImageLeft();
                        p8Var.s = p8Var.c(false);
                        org.telegram.ui.ActionBar.u5 u5Var = p8Var.a;
                        u5Var.l(charSequence3, false);
                        u5Var.i(null);
                        f6 f6Var = p8Var.c;
                        p8Var.Q = null;
                        f6Var.c(null, false, true);
                        p8Var.h.setVisibility(8);
                        f6Var.setVisibility(8);
                        p8Var.d.setVisibility(8);
                        fi0 fi0Var = p8Var.e;
                        fi0Var.setVisibility(8);
                        fi0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
                        p8Var.r = J;
                        p8Var.setWillNotDraw(!J);
                        Switch r12 = p8Var.f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        p8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = G.l;
                        String str3 = (String) obj;
                        p8Var.x = p8Var.getDefaultImageLeft();
                        p8Var.s = p8Var.c(false);
                        org.telegram.ui.ActionBar.u5 u5Var2 = p8Var.a;
                        u5Var2.l(charSequence4, false);
                        u5Var2.i(null);
                        f6 f6Var2 = p8Var.c;
                        p8Var.Q = null;
                        f6Var2.c(null, false, true);
                        p8Var.h.setVisibility(8);
                        f6Var2.setVisibility(8);
                        p8Var.d.setVisibility(8);
                        fi0 fi0Var2 = p8Var.e;
                        fi0Var2.setVisibility(8);
                        fi0Var2.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
                        p8Var.r = J;
                        p8Var.setWillNotDraw(!J);
                        Switch r13 = p8Var.f;
                        if (r13 != null) {
                            r13.setVisibility(8);
                        }
                        p8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(G.n)) {
                        Object obj2 = G.G;
                        if (obj2 instanceof Drawable) {
                            p8Var.p(G.l, (Drawable) obj2, J);
                        } else {
                            int i16 = G.k;
                            if (i16 == 0) {
                                p8Var.k(G.l, J);
                            } else {
                                p8Var.o(i16, G.l, J);
                            }
                        }
                    } else {
                        Object obj3 = G.G;
                        if (obj3 instanceof Drawable) {
                            p8Var.t(G.l, G.n, (Drawable) obj3, J);
                        } else {
                            int i17 = G.k;
                            if (i17 == 0) {
                                p8Var.q(G.l, G.n, false, J);
                            } else {
                                p8Var.u(G.l, G.n, false, i17, J);
                            }
                        }
                    }
                    if (G.q) {
                        int i18 = org.telegram.ui.ActionBar.t6.q6;
                        p8Var.g(i18, i18);
                    } else if (G.r) {
                        p8Var.g(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                    } else {
                        p8Var.g(org.telegram.ui.ActionBar.t6.m6, org.telegram.ui.ActionBar.t6.G6);
                    }
                    p8Var.h(45, G.t, true);
                    p8Var.i(G.g, true);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    if (t8Var.b == G.d) {
                        t8Var.setChecked(G.e);
                    }
                    t8Var.e(null, G.g);
                    t8Var.f(G.l, G.e, J);
                    t8Var.b = G.d;
                    if (i13 == 9) {
                        org.telegram.ui.ActionBar.a7.i(G.e ? org.telegram.ui.ActionBar.t6.f6 : org.telegram.ui.ActionBar.t6.e6, view, null);
                        break;
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                    CharSequence charSequence5 = G.m;
                    l5Var.b(G.l, G.m, 0, G.e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), J, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.l5) view).b(G.l, G.m, 0, G.e, 0, false, J, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i13 == 7 || i13 == 8) {
                        org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
                        if (TextUtils.isEmpty(G.l)) {
                            b9Var2.setFixedSize(i13 == 8 ? org.telegram.messenger.at.x3 : 12);
                            b9Var2.setText("");
                        } else {
                            b9Var2.setFixedSize(0);
                            b9Var2.setText(G.l);
                        }
                        if (G.q) {
                            b9Var2.setTextGravity(17);
                            b9Var2.getTextView().setWidth(Math.min(vh.p2.a(b9Var2.getText(), b9Var2.getTextView().getPaint()), org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(60.0f)));
                            b9Var2.getTextView().setPadding(0, org.telegram.messenger.i0.L(17.0f), 0, org.telegram.messenger.i0.L(17.0f));
                            b9Var = b9Var2;
                        } else {
                            b9Var2.setTextGravity(8388611);
                            b9Var2.getTextView().setMinWidth(0);
                            b9Var2.getTextView().setMaxWidth(org.telegram.messenger.i0.q.x);
                            b9Var2.getTextView().setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(17.0f));
                            b9Var = b9Var2;
                        }
                    } else if (i13 == 38) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                        CharSequence charSequence6 = G.o;
                        boolean z13 = G.f;
                        d2Var.a.setText(charSequence6);
                        View view5 = d2Var.b;
                        view5.animate().cancel();
                        view5.animate().rotation(z13 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
                        if (G.q) {
                            d2Var.setColor(org.telegram.ui.ActionBar.t6.q6);
                            b9Var = d2Var;
                        } else if (G.r) {
                            d2Var.setColor(org.telegram.ui.ActionBar.t6.p7);
                            b9Var = d2Var;
                        } else {
                            d2Var.setColor(org.telegram.ui.ActionBar.t6.G6);
                            b9Var = d2Var;
                        }
                    } else {
                        b9Var = null;
                    }
                    boolean z14 = (G3 == null || K(G3.a)) ? false : true;
                    boolean z15 = (G2 == null || K(G2.a)) ? false : true;
                    if (!uk0Var.b1()) {
                        Drawable X0 = org.telegram.ui.ActionBar.t6.X0(this.e, (z14 && z15) ? R.drawable.greydivider : z14 ? R.drawable.greydivider_bottom : z15 ? R.drawable.greydivider_top : R.drawable.field_carret_empty, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.b7, p6Var));
                        if (!this.n) {
                            b9Var.setBackground(X0);
                            break;
                        } else {
                            int i19 = org.telegram.ui.ActionBar.t6.i5;
                            b9Var.setBackground(new LayerDrawable(new Drawable[]{I(i19) == org.telegram.ui.ActionBar.t6.w0(i19, p6Var) ? new p51(i19, p6Var) : new ColorDrawable(I(i19)), X0}));
                            break;
                        }
                    } else {
                        b9Var.setBackground(null);
                        break;
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.x2 x2Var = (org.telegram.ui.Cells.x2) view;
                    int i20 = x2Var.a;
                    TextView textView = x2Var.b;
                    TextView textView2 = x2Var.c;
                    RadioButton radioButton = x2Var.d;
                    if (i20 == G.d) {
                        radioButton.a(G.e, true);
                        x2Var.a(G.g, true);
                        r92 = 0;
                    } else {
                        r92 = 0;
                        x2Var.a(G.g, false);
                    }
                    if (TextUtils.isEmpty(G.n)) {
                        CharSequence charSequence7 = G.l;
                        boolean z16 = G.e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r92);
                        x2Var.e = J;
                        x2Var.b();
                        x2Var.setWillNotDraw(!J);
                    } else {
                        CharSequence charSequence8 = G.l;
                        CharSequence charSequence9 = G.n;
                        boolean z17 = G.e;
                        textView2.setVisibility(r92);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r92);
                        x2Var.e = J;
                        x2Var.b();
                        x2Var.setWillNotDraw(!J);
                    }
                    x2Var.a = G.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                    paVar.g(i12, G, J);
                    if (i13 == 12) {
                        paVar.c(G.e, false);
                        break;
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.pa paVar2 = (org.telegram.ui.Cells.pa) view;
                    paVar2.g(i12, G, J);
                    CharSequence charSequence10 = G.n;
                    paVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    paVar2.setAddButtonVisible(!G.e);
                    paVar2.setCloseIcon(G.D);
                    break;
                case 14:
                    zu0 zu0Var = (zu0) view;
                    zu0Var.b(G.z, null, G.p);
                    zu0Var.setMinAllowedIndex((int) G.B);
                    zu0Var.setCallback(new px(G, 25));
                    break;
                case 15:
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                    x7Var.d(G.z, (org.telegram.ui.Cells.w7) G.G, G.C);
                    x7Var.setMinValueAllowed((int) G.B);
                    break;
                case 16:
                    ag.y2 y2Var = (ag.y2) view;
                    y2Var.d.a(G.e, false);
                    y2Var.setReorder(this.N);
                    Object obj4 = G.G;
                    if (obj4 instanceof ag.h3) {
                        y2Var.a((ag.h3) obj4, null, J);
                        break;
                    }
                    break;
                case 17:
                    ag.w2 w2Var = (ag.w2) view;
                    w2Var.e.a(G.e, false);
                    Object obj5 = G.G;
                    if (obj5 instanceof ag.h3) {
                        ag.h3 h3Var = (ag.h3) obj5;
                        r8 r8Var = w2Var.a;
                        int[] iArr = w2Var.r;
                        TextView textView3 = w2Var.d;
                        ImageReceiver imageReceiver = w2Var.b;
                        int i21 = org.telegram.messenger.e20.s0;
                        w2Var.c.setText(org.telegram.messenger.wp.r1(i21).A1(org.telegram.messenger.e20.i(i21).e(), false));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.messenger.kj kjVar = h3Var.e;
                        if (kjVar != null) {
                            spannableStringBuilder.append(org.telegram.messenger.k6.m(kjVar.v, textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                        if (h3Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(80.0f);
                            int a2 = h3Var.a() - 1;
                            int i22 = ag.x2.d;
                            SpannableString spannableString = new SpannableString("+");
                            ag.x2 x2Var2 = new ag.x2(a2);
                            iArr[0] = (int) (((rz0) x2Var2.c).c + org.telegram.messenger.i0.L(10.0f));
                            spannableString.setSpan(x2Var2, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (L * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                        textView3.setText(spannableStringBuilder);
                        TLRPC.MessageMedia n12 = org.telegram.messenger.kj.n1(h3Var.e);
                        if (n12 != null && (photo = n12.photo) != null) {
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(36.0f), true, null, true);
                            org.telegram.messenger.jc f7 = org.telegram.messenger.jc.f(w9, n12.photo);
                            org.telegram.messenger.kj kjVar2 = h3Var.e;
                            imageReceiver.p0(f7, "36_36", kjVar2.G1, w9 == null ? 0L : w9.size, null, kjVar2, 0);
                            imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                        } else if (n12 == null || (document = n12.document) == null) {
                            r8Var.r(org.telegram.messenger.e20.i(i21).f());
                            imageReceiver.i0(org.telegram.messenger.e20.i(i21).f(), r8Var, null);
                            imageReceiver.J0(org.telegram.messenger.i0.L(56.0f));
                        } else {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(36.0f), true, null, true);
                            if (w10 == null) {
                                org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(n12.document);
                                j10 = n12.document.size;
                                jcVar = b10;
                                str2 = "g";
                            } else {
                                org.telegram.messenger.jc f10 = org.telegram.messenger.jc.f(w10, n12.document);
                                j10 = w10.size;
                                str2 = "36_36";
                                jcVar = f10;
                            }
                            long j14 = j10;
                            org.telegram.messenger.kj kjVar3 = h3Var.e;
                            imageReceiver.p0(jcVar, str2, kjVar3.G1, j14, null, kjVar3, 0);
                            imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
                        }
                        w2Var.s = J;
                        w2Var.invalidate();
                        break;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) view;
                    int i23 = G.z;
                    org.telegram.ui.e61 e61Var = (org.telegram.ui.e61) G.G;
                    org.telegram.ui.uh uhVar = new org.telegram.ui.uh(z12 ? 1 : 0, this, G);
                    q61Var.y = i23;
                    q61Var.D = uhVar;
                    q61Var.e(e61Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.je) view).set((org.telegram.ui.ie) G.G);
                    break;
                case 25:
                    org.telegram.ui.ke keVar = (org.telegram.ui.ke) view;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) G.G;
                    n5 n5Var = keVar.b;
                    org.telegram.ui.ActionBar.p6 p6Var2 = keVar.a;
                    TextView textView4 = keVar.c;
                    TextView textView5 = keVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(org.telegram.messenger.dd.L0(2131748370, null));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(org.telegram.messenger.dd.L0(2131748373, null));
                            z10 = false;
                        } else {
                            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(org.telegram.messenger.dd.Q(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z10 ? a1.g.m(null, 2131748374, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        c10 = 65535;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            textView4.setText(org.telegram.messenger.dd.L0(2131748372, null));
                            textView5.setText(org.telegram.messenger.dd.Q(r5.from_date) + " - " + org.telegram.messenger.dd.Q(r5.to_date));
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction).amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            textView4.setText(org.telegram.messenger.dd.L0(2131748371, null));
                            textView5.setText(org.telegram.messenger.dd.Q(r5.from_date));
                            j11 = ((TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction).amount;
                        }
                        c10 = 1;
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.a7.V(textView5, z10 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.y6, p6Var2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (c10 < 0 ? "-" : "+"));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) keVar.e.format(Math.abs(j11) / 1.0E9d));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (indexOf >= 0) {
                        z11 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, indexOf + 1, 33);
                    } else {
                        z11 = false;
                    }
                    n5Var.setText(org.telegram.ui.le.K(spannableStringBuilder3, n5Var.getPaint(), 1.1f, org.telegram.messenger.i0.L(0.33f), z11));
                    org.telegram.ui.ActionBar.a7.V(n5Var, c10 < 0 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.l8, p6Var2);
                    keVar.f = J;
                    keVar.setWillNotDraw(!J);
                    break;
                case 27:
                    vh.v6 v6Var = (vh.v6) view;
                    long j15 = v6Var.y;
                    Object obj6 = G.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j12 = -((TLRPC.Chat) obj6).id;
                        }
                        boolean z18 = j15 != j13;
                        v6Var.d(false, true);
                        v6Var.set(G.G);
                        v6Var.f.setVisibility(8);
                        v6Var.h.setVisibility(0);
                        v6Var.c(G.e, z18);
                        v6Var.setDivider(J);
                        break;
                    } else {
                        j12 = ((TLRPC.User) obj6).id;
                    }
                    j13 = j12;
                    if (j15 != j13) {
                    }
                    v6Var.d(false, true);
                    v6Var.set(G.G);
                    v6Var.f.setVisibility(8);
                    v6Var.h.setVisibility(0);
                    v6Var.c(G.e, z18);
                    v6Var.setDivider(J);
                case 28:
                    if (G.s) {
                        org.telegram.ui.ActionBar.a7.r(view);
                        view.setBackgroundColor(0);
                    } else if (G.k != 0) {
                        org.telegram.ui.ActionBar.a7.r(view);
                        view.setBackgroundColor(G.k);
                    }
                    view.setId(G.d);
                    ((o51) view).setHeight(G.z);
                    break;
                case 29:
                    ag.g0 g0Var = (ag.g0) view;
                    Object obj7 = G.G;
                    if (obj7 instanceof ag.h0) {
                        org.telegram.ui.ActionBar.u5 u5Var3 = g0Var.a;
                        org.telegram.ui.ActionBar.u5 u5Var4 = g0Var.c;
                        nh.p pVar = g0Var.b;
                        g0Var.e = J;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((ag.h0) obj7).a;
                        g0Var.f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String str4 = g0Var.f.link;
                            ag.s0[] s0VarArr = ag.s0.e;
                            if (str4.startsWith("https://")) {
                                str4 = str4.substring(8);
                            }
                            u5Var3.l(str4, false);
                        } else {
                            u5Var3.l(g0Var.f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(g0Var.f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = g0Var.f;
                        org.telegram.messenger.vi.g(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4, -1);
                        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder4, pVar.getPaint().getFontMetricsInt(), false, null, 0);
                        org.telegram.messenger.kj.A5(m10, g0Var.f.entities, pVar.getPaint().getFontMetricsInt(), false);
                        pVar.setText(m10);
                        int i24 = g0Var.f.views;
                        if (i24 == 0) {
                            u5Var4.l(org.telegram.messenger.dd.a0(null, null, 2131748244, new Object[0]), false);
                        } else {
                            u5Var4.l(org.telegram.messenger.dd.G(i24, "Clicks", new Object[0]), false);
                        }
                        u5Var4.requestLayout();
                        g0Var.invalidate();
                        break;
                    }
                    break;
                case org.telegram.messenger.at.T /* 30 */:
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    CharSequence charSequence11 = G.l;
                    int i25 = G.k;
                    e9Var.b.l(charSequence11, false);
                    e9Var.a.setImageResource(i25);
                    e9Var.setDivider(J);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, e9Var, this.O);
                    break;
                case org.telegram.messenger.at.U /* 31 */:
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                    if (!TextUtils.equals(z3Var.getText(), G.l)) {
                        z3Var.b(G.l, G.m, G.D);
                        break;
                    } else {
                        z3Var.a(G.m, G.D);
                        break;
                    }
                case 32:
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                    Object obj8 = G.G;
                    if (G.q && (obj8 instanceof TLRPC.User) && (i11 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i11 != 0) {
                            concat = org.telegram.messenger.dd.H(' ', "BotUsers", i11);
                            if (!(obj8 instanceof TLRPC.Chat)) {
                            }
                            String str5 = str;
                            boolean z19 = G.t;
                            Object obj9 = G.H;
                            if (obj9 instanceof org.telegram.messenger.r20) {
                            }
                            k6Var.B0 = z19;
                            k6Var.C0 = r11;
                            k6Var.setRectangularAvatar(G.r);
                            CharSequence charSequence12 = G.m;
                            k6Var.z(obj8, null, str5, charSequence12 == null ? charSequence12 : concat, false, false);
                            k6Var.y(G.e, false);
                            k6Var.M = J;
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str52 = str;
                        boolean z192 = G.t;
                        Object obj92 = G.H;
                        if (obj92 instanceof org.telegram.messenger.r20) {
                        }
                        k6Var.B0 = z192;
                        k6Var.C0 = r11;
                        k6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence122 = G.m;
                        k6Var.z(obj8, null, str52, charSequence122 == null ? charSequence122 : concat, false, false);
                        k6Var.y(G.e, false);
                        k6Var.M = J;
                    } else {
                        if (G.I) {
                            String n10 = obj8 instanceof TLRPC.User ? org.telegram.messenger.i20.n((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) obj8, false) : null;
                            if (n10 != null) {
                                concat = "@".concat(n10);
                                if (!(obj8 instanceof TLRPC.Chat)) {
                                    TLRPC.Chat chat = (TLRPC.Chat) obj8;
                                    if (chat.participants_count != 0) {
                                        String H = (!org.telegram.messenger.w3.T(chat) || chat.megagroup) ? org.telegram.messenger.dd.H(' ', "Members", chat.participants_count) : org.telegram.messenger.dd.H(' ', "Subscribers", chat.participants_count);
                                        concat = !TextUtils.isEmpty(concat) ? TextUtils.concat(concat, ", ", H) : H;
                                    }
                                    str = chat.title;
                                } else if (obj8 instanceof TLRPC.User) {
                                    str = org.telegram.messenger.i20.p((TLRPC.User) obj8);
                                }
                                String str522 = str;
                                boolean z1922 = G.t;
                                Object obj922 = G.H;
                                org.telegram.messenger.r20 r20Var = obj922 instanceof org.telegram.messenger.r20 ? (org.telegram.messenger.r20) obj922 : null;
                                k6Var.B0 = z1922;
                                k6Var.C0 = r20Var;
                                k6Var.setRectangularAvatar(G.r);
                                CharSequence charSequence1222 = G.m;
                                k6Var.z(obj8, null, str522, charSequence1222 == null ? charSequence1222 : concat, false, false);
                                k6Var.y(G.e, false);
                                k6Var.M = J;
                                break;
                            }
                        }
                        concat = "";
                        if (!(obj8 instanceof TLRPC.Chat)) {
                        }
                        String str5222 = str;
                        boolean z19222 = G.t;
                        Object obj9222 = G.H;
                        if (obj9222 instanceof org.telegram.messenger.r20) {
                        }
                        k6Var.B0 = z19222;
                        k6Var.C0 = r20Var;
                        k6Var.setRectangularAvatar(G.r);
                        CharSequence charSequence12222 = G.m;
                        k6Var.z(obj8, null, str5222, charSequence12222 == null ? charSequence12222 : concat, false, false);
                        k6Var.y(G.e, false);
                        k6Var.M = J;
                    }
                    break;
                case 33:
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                    Object obj10 = G.G;
                    org.telegram.messenger.kj kjVar4 = obj10 instanceof org.telegram.messenger.kj ? (org.telegram.messenger.kj) obj10 : null;
                    v2Var.s2 = J;
                    if (kjVar4 != null) {
                        v2Var.d0(org.telegram.messenger.kj.B0(kjVar4.k), kjVar4, kjVar4.k.date, false, false);
                        break;
                    } else {
                        v2Var.d0(0L, null, 0, false, false);
                        break;
                    }
                case 34:
                    ((zz) view).setViewType(G.z);
                    break;
                case 35:
                case 36:
                case 41:
                    org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                    c2Var.setPad(G.i);
                    c2Var.e(G.l, "", G.e, J, c2Var.a == G.d);
                    c2Var.a = G.d;
                    c2Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 36 || i13 == 41) {
                        boolean z20 = G.f;
                        CharSequence charSequence13 = G.o;
                        View.OnClickListener onClickListener = G.D;
                        ai.b bVar = c2Var.w;
                        if (bVar != null) {
                            f6 f6Var3 = (f6) bVar.c;
                            f6Var3.a();
                            f6Var3.setText(charSequence13);
                            View view6 = bVar.d;
                            view6.animate().cancel();
                            view6.animate().rotation(z20 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
                            if (onClickListener != null) {
                                bVar.setOnClickListener(onClickListener);
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
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    s8Var.d(G.l.toString(), G.e, J, s8Var.a == G.d);
                    s8Var.getCheckBox().setDrawIconType(G.z);
                    Switch checkBox = s8Var.getCheckBox();
                    int i26 = G.z == 0 ? org.telegram.ui.ActionBar.t6.M6 : org.telegram.ui.ActionBar.t6.r7;
                    int i27 = org.telegram.ui.ActionBar.t6.N6;
                    int i28 = org.telegram.ui.ActionBar.t6.d6;
                    checkBox.d(i26, i27, i28, i28);
                    s8Var.a = G.d;
                    s8Var.setIcon(G.t ? R.drawable.permission_locked : 0);
                    if (i13 == 40) {
                        if (!TextUtils.isEmpty(G.o)) {
                            s8Var.a(new hi0(23, G, s8Var), G.o.toString(), G.f);
                            break;
                        } else {
                            LinearLayout linearLayout = s8Var.f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                                break;
                            }
                        }
                    }
                    break;
                case 42:
                    org.telegram.ui.Cells.p4 p4Var2 = (org.telegram.ui.Cells.p4) view;
                    p4Var2.c(G.o, p4Var2.a == G.d);
                    p4Var2.a = G.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence14 = G.l;
                    if (charSequence14 != null) {
                        CharSequence charSequence15 = G.m;
                        if (charSequence15 != null) {
                            x9Var.c(charSequence14, charSequence15, false, J);
                        } else {
                            x9Var.b(charSequence14, J);
                        }
                    }
                    x9Var.setIcon(G.k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.l6) view).b(G.l.toString(), G.n.toString(), J, G.e);
                    break;
            }
        } else {
            a51 G4 = b51.G(i13);
            if (G4 != null) {
                G4.b(c1Var.a, G, J, this, uk0Var instanceof v51 ? (v51) uk0Var : null);
            }
        }
        org.telegram.messenger.r20 r20Var2 = G.F;
        if (r20Var2 != null) {
            r20Var2.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        View zk0Var;
        View p4Var;
        View p4Var2;
        View l5Var;
        int i11;
        org.telegram.ui.Cells.p4 p4Var3;
        boolean z10 = this.n;
        int i12 = z10 ? org.telegram.ui.ActionBar.t6.h5 : org.telegram.ui.ActionBar.t6.d6;
        uk0 uk0Var = this.d;
        org.telegram.ui.ActionBar.p6 p6Var = this.x;
        Context context = this.e;
        if (i10 < 10000) {
            int i13 = 8;
            switch (i10) {
                case -5:
                    zk0Var = new zk0(context);
                    zk0Var.setTag(-33024);
                    p4Var = zk0Var;
                    break;
                case -4:
                case -1:
                    zk0Var = new org.telegram.ui.Cells.a5(context, 27);
                    if (i10 == -4) {
                        zk0Var.setTag(-33024);
                    }
                    p4Var = zk0Var;
                    break;
                case -3:
                    m51 m51Var = new m51(context);
                    m51Var.a = 0;
                    p4Var = m51Var;
                    break;
                case -2:
                    p4Var = new org.telegram.ui.Cells.a5(context, 28);
                    break;
                case 0:
                    if (!z10) {
                        p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                        break;
                    } else {
                        p4Var = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.L6, 21, 15, 0, false, false, this.x);
                        break;
                    }
                case 1:
                    p4Var2 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.G6, 17, 15, false, this.x);
                    p4Var = p4Var2;
                    break;
                case 2:
                    p4Var = new k11(context, p6Var);
                    break;
                case 3:
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, p6Var);
                    p8Var.setCompactLayout(this.s);
                    p4Var = p8Var;
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, p6Var);
                    if (i10 == 9) {
                        t8Var.setDrawCheckRipple(true);
                        t8Var.d(org.telegram.ui.ActionBar.t6.g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
                        t8Var.setTypeface(org.telegram.messenger.i0.o());
                        t8Var.setHeight(56);
                    }
                    p4Var = t8Var;
                    break;
                case 5:
                case 6:
                    l5Var = new org.telegram.ui.Cells.l5(21, 60, this.e, this.x, i10 == 6);
                    p4Var = l5Var;
                    break;
                case 7:
                case 8:
                default:
                    p4Var = new org.telegram.ui.Cells.b9(context, p6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.x2 x2Var = new org.telegram.ui.Cells.x2(context);
                    x2Var.f = 23;
                    TextView textView = new TextView(context);
                    x2Var.b = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.messenger.a30.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((org.telegram.messenger.dd.X ? 5 : 3) | 16);
                    boolean z11 = org.telegram.messenger.dd.X;
                    x2Var.addView(textView, w7.b6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    x2Var.c = textView2;
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.I6, null);
                    org.telegram.messenger.a30.o(textView2, 1, 16.0f, 1, 1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((org.telegram.messenger.dd.X ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    x2Var.addView(textView2, w7.b6.d(-2, -1.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    x2Var.d = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.h7, null);
                    x2Var.addView(radioButton, w7.b6.d(22, 22.0f, (org.telegram.messenger.dd.X ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    x2Var.b();
                    x2Var.setHorizontalPadding(21);
                    p4Var = x2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, i10 != 12 ? 0 : 3, false);
                    paVar.setSelfAsSavedMessages(true);
                    p4Var = paVar;
                    break;
                case 13:
                    p4Var2 = new org.telegram.ui.Cells.pa(6, 0, this.e, null, false, true);
                    p4Var = p4Var2;
                    break;
                case 14:
                    p4Var = new zu0(context, p6Var);
                    break;
                case 15:
                    p4Var = new org.telegram.ui.Cells.x7(context, p6Var);
                    break;
                case 16:
                    p4Var = new ag.y2(context, p6Var, this.M != null);
                    break;
                case 17:
                    p4Var = new ag.w2(context, p6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.E == null) {
                        this.E = new bg.h((org.telegram.ui.ActionBar.p6) null);
                    }
                    l5Var = new org.telegram.ui.q61(this.e, this.f, i10 - 18, this.E, this.h);
                    p4Var = l5Var;
                    break;
                case 24:
                    p4Var = new org.telegram.ui.je(context, p6Var);
                    break;
                case 25:
                    p4Var = new org.telegram.ui.ke(context, p6Var);
                    break;
                case 26:
                    org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.G6, 23, 20, 0, false, false, this.x);
                    p4Var4.setTextSize(20.0f);
                    p4Var3 = p4Var4;
                    p4Var = p4Var3;
                    break;
                case 27:
                    vh.v6 v6Var = new vh.v6(context, p6Var);
                    v6Var.d(false, false);
                    p4Var = v6Var;
                    break;
                case 28:
                    zk0Var = new o51(context);
                    zk0Var.setTag(-33024);
                    p4Var = zk0Var;
                    break;
                case 29:
                    p4Var = new ag.g0(context, p6Var);
                    break;
                case org.telegram.messenger.at.T /* 30 */:
                    p4Var = new org.telegram.ui.Cells.e9(context, p6Var);
                    break;
                case org.telegram.messenger.at.U /* 31 */:
                    if (uk0Var != null && uk0Var.b1()) {
                        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(28, context, p6Var);
                        z3Var.setNoBackground(true);
                        p4Var = z3Var;
                        break;
                    } else {
                        p4Var = new org.telegram.ui.Cells.z3(context, p6Var);
                        break;
                    }
                    break;
                case 32:
                    p4Var = new org.telegram.ui.Cells.k6(context, null);
                    break;
                case 33:
                    p4Var = new org.telegram.ui.Cells.v2(context, true);
                    break;
                case 34:
                    zz zzVar = new zz(context, p6Var);
                    zzVar.setIsSingleCell(true);
                    p4Var = zzVar;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i10 != 35) {
                        if (i10 == 36) {
                            i11 = 6;
                        } else if (i10 == 37) {
                            i13 = 7;
                        } else if (i10 != 41) {
                            i11 = 0;
                        }
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(i11, 21, this.e, this.x, true);
                        c2Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
                        p4Var3 = c2Var;
                        p4Var = p4Var3;
                        break;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13;
                    org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(i11, 21, this.e, this.x, true);
                    c2Var2.getCheckBoxRound().b(org.telegram.ui.ActionBar.t6.V6, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
                    p4Var3 = c2Var2;
                    p4Var = p4Var3;
                case 38:
                    p4Var = new org.telegram.ui.Cells.d2(context, p6Var);
                    break;
                case 39:
                case 40:
                    p4Var = new org.telegram.ui.Cells.s8(context);
                    break;
                case 42:
                    p4Var3 = new org.telegram.ui.Cells.p4(this.e, org.telegram.ui.ActionBar.t6.L6, 21, 15, 0, false, true, this.x);
                    p4Var = p4Var3;
                    break;
                case 43:
                    p4Var = new org.telegram.ui.Cells.x9(0, context, p6Var);
                    break;
                case 44:
                    p4Var = new org.telegram.ui.Cells.l6(context, false);
                    break;
            }
        } else {
            a51 G = b51.G(i10);
            p4Var = G != null ? G.d(context, uk0Var, this.f, p6Var) : new View(context);
        }
        if (N(i10)) {
            org.telegram.ui.ActionBar.a7.i(i12, p4Var, this.O);
        }
        return new dk0(p4Var);
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        R(c1Var, this.N);
        P(c1Var);
    }
}
