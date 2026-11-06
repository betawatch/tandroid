package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g41 extends org.telegram.ui.Components.oj0 {
    public int c0;
    public int d;
    public final /* synthetic */ c51 d0;
    public int c = -1;
    public int e = -1;
    public int f = -1;
    public int h = -1;
    public int n = -1;
    public int r = -1;
    public int s = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public final a0.g a0 = new a0.g(0);
    public final a0.g b0 = new a0.g(0);

    public g41(c51 c51Var) {
        this.d0 = c51Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 9 || i7 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.I = -1;
        this.J = -1;
        this.f = -1;
        this.H = -1;
        this.s = -1;
        this.n = -1;
        this.D = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.c0 = 0;
        a0.g gVar = this.b0;
        gVar.clear();
        a0.g gVar2 = this.a0;
        gVar2.clear();
        c51 c51Var = this.d0;
        ArrayList arrayList = c51Var.y0;
        ArrayList arrayList2 = c51Var.P;
        ArrayList arrayList3 = c51Var.Q;
        ArrayList arrayList4 = c51Var.O;
        if (c51Var.b0) {
            if (c51Var.G != null) {
                int i7 = this.c0;
                this.c = i7;
                this.c0 = i7 + 2;
                this.d = i7 + 1;
            }
            o41 o41Var = c51Var.d;
            if (o41Var != null && !o41Var.l) {
                int i10 = this.c0;
                if (i10 > 0) {
                    this.c0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.c0;
                this.c0 = i11 + 1;
                this.e = i11;
            }
            o41 o41Var2 = c51Var.H;
            if (o41Var2 != null && !o41Var2.l) {
                int i12 = this.c0;
                if (i12 > 0) {
                    this.c0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.c0;
                this.c0 = i13 + 1;
                this.K = i13;
            }
            o41 o41Var3 = c51Var.I;
            if (o41Var3 != null && !o41Var3.l && !o41Var3.a) {
                int i14 = this.c0;
                if (i14 > 0) {
                    this.c0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.c0;
                this.c0 = i15 + 1;
                this.L = i15;
            }
            o41 o41Var4 = c51Var.J;
            if (o41Var4 != null && !o41Var4.l && !o41Var4.a) {
                int i16 = this.c0;
                if (i16 > 0) {
                    this.c0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.c0;
                this.c0 = i17 + 1;
                this.M = i17;
            }
            o41 o41Var5 = c51Var.K;
            if (o41Var5 != null && !o41Var5.l && !o41Var5.a) {
                int i18 = this.c0;
                if (i18 > 0) {
                    this.c0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.c0;
                this.c0 = i19 + 1;
                this.N = i19;
            }
            o41 o41Var6 = c51Var.L;
            if (o41Var6 != null && !o41Var6.l && !o41Var6.a) {
                int i20 = this.c0;
                if (i20 > 0) {
                    this.c0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.c0;
                this.c0 = i21 + 1;
                this.O = i21;
            }
            o41 o41Var7 = c51Var.e;
            if (o41Var7 != null && !o41Var7.l && !o41Var7.a) {
                int i22 = this.c0;
                if (i22 > 0) {
                    this.c0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.c0;
                this.c0 = i23 + 1;
                this.n = i23;
            }
            o41 o41Var8 = c51Var.M;
            if (o41Var8 != null && !o41Var8.l && !o41Var8.a) {
                int i24 = this.c0;
                if (i24 > 0) {
                    this.c0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.c0;
                this.c0 = i25 + 1;
                this.P = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.c0;
                if (i26 > 0) {
                    this.c0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.c0;
                int i28 = i27 + 1;
                this.Q = i27;
                this.c0 = i27 + 2;
                this.R = i28;
                int size = arrayList4.size() + i28;
                this.S = size - 1;
                this.c0 = size;
                if (arrayList4.size() != c51Var.N.size()) {
                    int i29 = this.c0;
                    this.c0 = i29 + 1;
                    this.Z = i29;
                } else {
                    int i30 = this.c0;
                    this.c0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.c0;
                if (i31 > 0) {
                    this.c0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.c0;
                int i33 = i32 + 1;
                this.T = i32;
                this.c0 = i32 + 2;
                this.U = i33;
                int size2 = arrayList3.size() + i33;
                this.V = size2 - 1;
                this.c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.c0;
                if (i34 > 0) {
                    this.c0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.c0;
                int i36 = i35 + 1;
                this.W = i35;
                this.c0 = i35 + 2;
                this.X = i36;
                int size3 = arrayList2.size() + i36;
                this.Y = size3 - 1;
                this.c0 = size3;
            }
            int i37 = this.c0;
            if (i37 > 0) {
                this.c0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.c0;
                this.c0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (c51Var.f != null) {
            int i39 = this.c0;
            this.c = i39;
            this.c0 = i39 + 2;
            this.d = i39 + 1;
        }
        o41 o41Var9 = c51Var.d;
        if (o41Var9 != null && !o41Var9.l) {
            int i40 = this.c0;
            if (i40 > 0) {
                this.c0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.c0;
            this.c0 = i41 + 1;
            this.e = i41;
        }
        o41 o41Var10 = c51Var.h;
        if (o41Var10 != null && !o41Var10.l) {
            int i42 = this.c0;
            if (i42 > 0) {
                this.c0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.c0;
            this.c0 = i43 + 1;
            this.h = i43;
        }
        o41 o41Var11 = c51Var.y;
        if (o41Var11 != null && !o41Var11.l) {
            int i44 = this.c0;
            if (i44 > 0) {
                this.c0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.c0;
            this.c0 = i45 + 1;
            this.D = i45;
        }
        o41 o41Var12 = c51Var.e;
        if (o41Var12 != null && !o41Var12.l) {
            int i46 = this.c0;
            if (i46 > 0) {
                this.c0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.c0;
            this.c0 = i47 + 1;
            this.n = i47;
        }
        o41 o41Var13 = c51Var.s;
        if (o41Var13 != null && !o41Var13.l) {
            int i48 = this.c0;
            if (i48 > 0) {
                this.c0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.c0;
            this.c0 = i49 + 1;
            this.w = i49;
        }
        o41 o41Var14 = c51Var.w;
        if (o41Var14 != null && !o41Var14.l) {
            int i50 = this.c0;
            if (i50 > 0) {
                this.c0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.c0;
            this.c0 = i51 + 1;
            this.x = i51;
        }
        o41 o41Var15 = c51Var.x;
        if (o41Var15 != null && !o41Var15.l) {
            int i52 = this.c0;
            if (i52 > 0) {
                this.c0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.c0;
            this.c0 = i53 + 1;
            this.y = i53;
        }
        o41 o41Var16 = c51Var.n;
        if (o41Var16 != null && !o41Var16.l) {
            int i54 = this.c0;
            if (i54 > 0) {
                this.c0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.c0;
            this.c0 = i55 + 1;
            this.r = i55;
        }
        o41 o41Var17 = c51Var.r;
        if (o41Var17 != null && !o41Var17.k && !o41Var17.a) {
            int i56 = this.c0;
            if (i56 > 0) {
                this.c0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.c0;
            this.c0 = i57 + 1;
            this.s = i57;
        }
        o41 o41Var18 = c51Var.D;
        if (o41Var18 != null && !o41Var18.l && !o41Var18.a) {
            int i58 = this.c0;
            if (i58 > 0) {
                this.c0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.c0;
            this.c0 = i59 + 1;
            this.E = i59;
        }
        o41 o41Var19 = c51Var.E;
        if (o41Var19 != null && !o41Var19.l && !o41Var19.a) {
            int i60 = this.c0;
            if (i60 > 0) {
                this.c0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.c0;
            this.c0 = i61 + 1;
            this.F = i61;
        }
        o41 o41Var20 = c51Var.F;
        if (o41Var20 != null && !o41Var20.l && !o41Var20.a) {
            int i62 = this.c0;
            if (i62 > 0) {
                this.c0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.c0;
            this.c0 = i63 + 1;
            this.G = i63;
        }
        int i64 = this.c0;
        this.c0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.c0;
            int i66 = i65 + 1;
            this.H = i65;
            this.c0 = i65 + 2;
            this.I = i66;
            int size4 = arrayList.size() + i66;
            this.J = size4 - 1;
            this.c0 = size4;
            if (c51Var.v0.size() != c51Var.u0.size()) {
                int i67 = this.c0;
                this.c0 = i67 + 1;
                this.f = i67;
            } else {
                int i68 = this.c0;
                this.c0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.c0;
            this.c0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.c0;
    }

    @Override // v4.g0
    public final long c(int i7) {
        if (i7 >= this.I && i7 < this.J) {
            return ((z41) this.d0.y0.get(i7 - r0)).b();
        }
        if (i7 == this.e) {
            return 1L;
        }
        if (i7 == this.h) {
            return 2L;
        }
        if (i7 == this.n) {
            return 3L;
        }
        if (i7 == this.r) {
            return 4L;
        }
        if (i7 == this.D) {
            return 5L;
        }
        if (i7 == this.s) {
            return 6L;
        }
        if (i7 == this.w) {
            return 7L;
        }
        if (i7 == this.x) {
            return 8L;
        }
        if (i7 == this.y) {
            return 9L;
        }
        if (i7 == this.K) {
            return 10L;
        }
        if (i7 == this.L) {
            return 11L;
        }
        if (i7 == this.M) {
            return 12L;
        }
        if (i7 == this.N) {
            return 13L;
        }
        if (i7 == this.O) {
            return 14L;
        }
        if (i7 == this.P) {
            return 15L;
        }
        if (i7 == this.E) {
            return 16L;
        }
        if (i7 == this.F) {
            return 17L;
        }
        return i7 == this.G ? 18L : -1L;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == this.e || i7 == this.h || i7 == this.n || i7 == this.D || i7 == this.O || i7 == this.K) {
            return 0;
        }
        if (i7 == this.r || i7 == this.s || i7 == this.F) {
            return 1;
        }
        if (i7 == this.w || i7 == this.x || i7 == this.L || i7 == this.N || i7 == this.E || i7 == this.G) {
            return 2;
        }
        if (i7 == this.y || i7 == this.M || i7 == this.P) {
            return 4;
        }
        if (i7 >= this.I && i7 <= this.J) {
            return 9;
        }
        if (i7 == this.f) {
            return 11;
        }
        if (this.b0.contains(Integer.valueOf(i7))) {
            return 12;
        }
        if (i7 == this.H || i7 == this.c || i7 == this.T || i7 == this.Q || i7 == this.W) {
            return 13;
        }
        if (i7 == this.d) {
            return 14;
        }
        if ((i7 < this.U || i7 > this.V) && ((i7 < this.R || i7 > this.S) && (i7 < this.X || i7 > this.Y))) {
            return i7 == this.Z ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c A[LOOP:0: B:100:0x021a->B:101:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0208  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.ij ijVar;
        float f10;
        org.telegram.messenger.ij ijVar2;
        z41 z41Var;
        CharSequence charSequence;
        z41 z41Var2;
        View view = d1Var.a;
        c51 c51Var = this.d0;
        ArrayList arrayList = c51Var.y0;
        ArrayList arrayList2 = c51Var.O;
        boolean z9 = c51Var.b0;
        int d = d(i7);
        if (d >= 0 && d <= 4) {
            ((m41) view).e(this.e == i7 ? c51Var.d : this.h == i7 ? c51Var.h : this.r == i7 ? c51Var.n : this.w == i7 ? c51Var.s : this.x == i7 ? c51Var.w : this.s == i7 ? c51Var.r : this.n == i7 ? c51Var.e : this.D == i7 ? c51Var.y : this.E == i7 ? c51Var.D : this.F == i7 ? c51Var.E : this.G == i7 ? c51Var.F : this.K == i7 ? c51Var.H : this.L == i7 ? c51Var.I : this.M == i7 ? c51Var.J : this.N == i7 ? c51Var.K : this.O == i7 ? c51Var.L : this.P == i7 ? c51Var.M : c51Var.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                ng.c cVar = (ng.c) view;
                cVar.c(true);
                cVar.b(c51Var.f0, c51Var.e0);
                cVar.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                if (i7 == this.c) {
                    cVar.setTitle(org.telegram.messenger.hd.M0(2131744896, "StatisticOverview"));
                    return;
                }
                if (i7 == this.T) {
                    cVar.setTitle(org.telegram.messenger.hd.M0(2131744036, "TopAdmins"));
                    return;
                }
                if (i7 == this.W) {
                    cVar.setTitle(org.telegram.messenger.hd.M0(2131744033, "TopInviters"));
                    return;
                } else {
                    if (i7 == this.Q) {
                        cVar.setTitle(org.telegram.messenger.hd.M0(2131744032, "TopMembers"));
                        return;
                    }
                    cVar.c(false);
                    cVar.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f));
                    cVar.setTitle(org.telegram.messenger.hd.M0(2131746364, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((org.telegram.ui.Cells.x4) view).b(R.drawable.arrow_more, 5, org.telegram.messenger.hd.G(c51Var.N.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            w41 w41Var = (w41) view;
            if (z9) {
                w41Var.setData(c51Var.G);
                return;
            }
            x41 x41Var = c51Var.f;
            TextView[] textViewArr = w41Var.a;
            TextView[] textViewArr2 = w41Var.c;
            TextView[] textViewArr3 = w41Var.b;
            int i10 = 0;
            for (int i11 = 0; i11 < textViewArr.length; i11++) {
                switch (i11) {
                    case 0:
                        textViewArr[i10].setText(x41Var.b);
                        textViewArr3[i10].setText(x41Var.c);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.d ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.a);
                        i10++;
                        break;
                    case 1:
                        textViewArr[i10].setText(x41Var.n);
                        textViewArr3[i10].setText("");
                        textViewArr2[i10].setText(x41Var.m);
                        i10++;
                        break;
                    case 2:
                        textViewArr[i10].setText(x41Var.f);
                        textViewArr3[i10].setText(x41Var.g);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.h ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.e);
                        i10++;
                        break;
                    case 3:
                        textViewArr[i10].setText(x41Var.z);
                        textViewArr3[i10].setText(x41Var.A);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.B ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.y);
                        if (!x41Var.C) {
                            break;
                        }
                        i10++;
                        break;
                    case 4:
                        textViewArr[i10].setText(x41Var.j);
                        textViewArr3[i10].setText(x41Var.k);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.l ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.i);
                        i10++;
                        break;
                    case 5:
                        textViewArr[i10].setText(x41Var.E);
                        textViewArr3[i10].setText(x41Var.F);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.G ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.D);
                        if (!x41Var.H) {
                            break;
                        }
                        i10++;
                        break;
                    case 6:
                        textViewArr[i10].setText(x41Var.p);
                        textViewArr3[i10].setText(x41Var.q);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.r ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.o);
                        if (!x41Var.s) {
                            break;
                        }
                        i10++;
                        break;
                    case 7:
                        textViewArr[i10].setText(x41Var.u);
                        textViewArr3[i10].setText(x41Var.v);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.w ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i10].setText(x41Var.t);
                        if (!x41Var.x) {
                            break;
                        }
                        i10++;
                        break;
                }
            }
            while (i10 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i10].getParent()).setVisibility(8);
                i10++;
            }
            for (int i12 = 0; i12 < w41Var.getChildCount(); i12++) {
                ViewGroup viewGroup = (ViewGroup) w41Var.getChildAt(i12);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            w41Var.updateColors();
            return;
        }
        if (z9) {
            int i13 = this.U;
            if (i7 >= i13 && i7 <= this.V) {
                ((org.telegram.ui.Cells.w7) view).setData((v41) c51Var.Q.get(i7 - i13));
                return;
            }
            int i14 = this.R;
            if (i7 >= i14 && i7 <= this.S) {
                ((org.telegram.ui.Cells.w7) view).setData((v41) arrayList2.get(i7 - i14));
                return;
            }
            int i15 = this.X;
            if (i7 < i15 || i7 > this.Y) {
                return;
            }
            ((org.telegram.ui.Cells.w7) view).setData((v41) c51Var.P.get(i7 - i15));
            return;
        }
        int i16 = i7 - this.I;
        z41 z41Var3 = (z41) arrayList.get(i16);
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        boolean z10 = i16 == arrayList.size() - 1;
        TextView textView = w7Var.f;
        TextView textView2 = w7Var.d;
        org.telegram.ui.Components.w8 w8Var = w7Var.n;
        TLRPC.ChatFull chatFull = w7Var.x;
        org.telegram.ui.Cells.u7 u7Var = w7Var.a;
        w7Var.w = z41Var3;
        w7Var.y = !z10;
        org.telegram.messenger.ij ijVar3 = z41Var3.b;
        ArrayList arrayList3 = ijVar3.n0;
        if (arrayList3 != null) {
            ijVar = ijVar3;
            f10 = 1.0f;
            u7Var.l(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(arrayList3, org.telegram.messenger.g0.Z0(false), false, null, false), ijVar3.l0), "50_50", org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar3.n0, 50, false, null, false), ijVar3.l0), "b1", 0, ijVar);
            u7Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
            u7Var.setScaleX(0.96f);
            u7Var.setScaleY(0.96f);
        } else {
            ijVar = ijVar3;
            f10 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                ijVar2 = ijVar;
                z41Var = z41Var3;
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(chatFull.id));
                w8Var.q(M0);
                u7Var.e(M0, w8Var);
                u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                u7Var.setScaleX(1.0f);
                u7Var.setScaleY(1.0f);
                if (ijVar2.y4()) {
                    u7Var.setScaleX(f10);
                    u7Var.setScaleY(f10);
                    u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                }
                if (!ijVar2.J3()) {
                    charSequence = a8.p0.D(ijVar2.z1(true).trim(), ", ", ijVar2.x1(true).trim());
                } else if (ijVar2.y4()) {
                    charSequence = org.telegram.messenger.hd.M0(2131744736, null);
                } else {
                    charSequence = ijVar2.z;
                    if (charSequence == null) {
                        charSequence = ijVar2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                w7Var.b.k(org.telegram.messenger.g0.P3(org.telegram.messenger.g0.N2(spannableStringBuilder), null));
                w7Var.c.setText(String.format(org.telegram.messenger.hd.K0(z41Var.d(), "Views"), org.telegram.messenger.g0.o0(z41Var.d(), 0)));
                z41Var2 = z41Var;
                Date date = new Date((z41Var2.b != null ? 0L : r6.k.date) * 1000);
                w7Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().C0().format(date), org.telegram.messenger.hd.E0().p0().format(date)));
                textView2.setText(org.telegram.messenger.g0.o0(z41Var2.a(), 0));
                textView.setText(org.telegram.messenger.g0.o0(z41Var2.c(), 0));
                textView2.setVisibility(z41Var2.a() == 0 ? 0 : 8);
                textView.setVisibility(z41Var2.c() == 0 ? 8 : 0);
                w7Var.invalidate();
                if (z41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    w7Var.setImageViewAction(null);
                    return;
                } else {
                    w7Var.setImageViewAction(new fk0(12, this, z41Var2));
                    return;
                }
            }
            u7Var.k(org.telegram.messenger.hc.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, w7Var.x);
            u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
            u7Var.setScaleX(0.96f);
            u7Var.setScaleY(0.96f);
        }
        z41Var = z41Var3;
        ijVar2 = ijVar;
        if (ijVar2.y4()) {
        }
        if (!ijVar2.J3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        w7Var.b.k(org.telegram.messenger.g0.P3(org.telegram.messenger.g0.N2(spannableStringBuilder2), null));
        w7Var.c.setText(String.format(org.telegram.messenger.hd.K0(z41Var.d(), "Views"), org.telegram.messenger.g0.o0(z41Var.d(), 0)));
        z41Var2 = z41Var;
        Date date2 = new Date((z41Var2.b != null ? 0L : r6.k.date) * 1000);
        w7Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().C0().format(date2), org.telegram.messenger.hd.E0().p0().format(date2)));
        textView2.setText(org.telegram.messenger.g0.o0(z41Var2.a(), 0));
        textView.setText(org.telegram.messenger.g0.o0(z41Var2.c(), 0));
        textView2.setVisibility(z41Var2.a() == 0 ? 0 : 8);
        textView.setVisibility(z41Var2.c() == 0 ? 8 : 0);
        w7Var.invalidate();
        if (z41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        c51 c51Var = this.d0;
        if (i7 >= 0 && i7 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.f2) c51Var).currentAccount;
            View d41Var = new d41(c51Var, context, i10, i7, c51Var.Z);
            d41Var.setWillNotDraw(false);
            view = d41Var;
        } else if (i7 == 9) {
            View e41Var = new e41(viewGroup.getContext(), c51Var.a, c51Var.getResourceProvider());
            e41Var.setWillNotDraw(false);
            view = e41Var;
        } else if (i7 == 11) {
            view = new org.telegram.ui.Cells.t4(viewGroup.getContext());
        } else if (i7 == 12) {
            view = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i7 == 13) {
            View f41Var = new f41(viewGroup.getContext(), null);
            f41Var.setWillNotDraw(false);
            f41Var.setPadding(f41Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), f41Var.getRight(), org.telegram.messenger.g0.L(16.0f));
            view = f41Var;
        } else if (i7 == 14) {
            view = new w41(viewGroup.getContext(), c51Var.b0 ? 2 : 4);
        } else if (i7 == 15) {
            org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            view = x4Var;
        } else {
            view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
        }
        return jg.g.r(view, view, -1, -2);
    }
}
