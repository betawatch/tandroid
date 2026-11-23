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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h41 extends org.telegram.ui.Components.dk0 {
    public int d;
    public int d0;
    public final /* synthetic */ c51 e0;
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
    public int a0 = -1;
    public final a0.g b0 = new a0.g(0);
    public final a0.g c0 = new a0.g(0);

    public h41(c51 c51Var) {
        this.e0 = c51Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 9 || i7 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.J = -1;
        this.K = -1;
        this.f = -1;
        this.I = -1;
        this.s = -1;
        this.n = -1;
        this.E = -1;
        this.H = -1;
        this.G = -1;
        this.F = -1;
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
        this.a0 = -1;
        this.d0 = 0;
        a0.g gVar = this.c0;
        gVar.clear();
        a0.g gVar2 = this.b0;
        gVar2.clear();
        c51 c51Var = this.e0;
        ArrayList arrayList = c51Var.z0;
        ArrayList arrayList2 = c51Var.Q;
        ArrayList arrayList3 = c51Var.R;
        ArrayList arrayList4 = c51Var.P;
        if (c51Var.c0) {
            if (c51Var.H != null) {
                int i7 = this.d0;
                this.c = i7;
                this.d0 = i7 + 2;
                this.d = i7 + 1;
            }
            o41 o41Var = c51Var.d;
            if (o41Var != null && !o41Var.l) {
                int i10 = this.d0;
                if (i10 > 0) {
                    this.d0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.d0;
                this.d0 = i11 + 1;
                this.e = i11;
            }
            o41 o41Var2 = c51Var.I;
            if (o41Var2 != null && !o41Var2.l) {
                int i12 = this.d0;
                if (i12 > 0) {
                    this.d0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.d0;
                this.d0 = i13 + 1;
                this.L = i13;
            }
            o41 o41Var3 = c51Var.J;
            if (o41Var3 != null && !o41Var3.l && !o41Var3.a) {
                int i14 = this.d0;
                if (i14 > 0) {
                    this.d0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.d0;
                this.d0 = i15 + 1;
                this.M = i15;
            }
            o41 o41Var4 = c51Var.K;
            if (o41Var4 != null && !o41Var4.l && !o41Var4.a) {
                int i16 = this.d0;
                if (i16 > 0) {
                    this.d0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.d0;
                this.d0 = i17 + 1;
                this.N = i17;
            }
            o41 o41Var5 = c51Var.L;
            if (o41Var5 != null && !o41Var5.l && !o41Var5.a) {
                int i18 = this.d0;
                if (i18 > 0) {
                    this.d0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.d0;
                this.d0 = i19 + 1;
                this.O = i19;
            }
            o41 o41Var6 = c51Var.M;
            if (o41Var6 != null && !o41Var6.l && !o41Var6.a) {
                int i20 = this.d0;
                if (i20 > 0) {
                    this.d0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.d0;
                this.d0 = i21 + 1;
                this.P = i21;
            }
            o41 o41Var7 = c51Var.e;
            if (o41Var7 != null && !o41Var7.l && !o41Var7.a) {
                int i22 = this.d0;
                if (i22 > 0) {
                    this.d0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.d0;
                this.d0 = i23 + 1;
                this.n = i23;
            }
            o41 o41Var8 = c51Var.N;
            if (o41Var8 != null && !o41Var8.l && !o41Var8.a) {
                int i24 = this.d0;
                if (i24 > 0) {
                    this.d0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.d0;
                this.d0 = i25 + 1;
                this.Q = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.d0;
                if (i26 > 0) {
                    this.d0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.d0;
                int i28 = i27 + 1;
                this.R = i27;
                this.d0 = i27 + 2;
                this.S = i28;
                int size = arrayList4.size() + i28;
                this.T = size - 1;
                this.d0 = size;
                if (arrayList4.size() != c51Var.O.size()) {
                    int i29 = this.d0;
                    this.d0 = i29 + 1;
                    this.a0 = i29;
                } else {
                    int i30 = this.d0;
                    this.d0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.d0;
                if (i31 > 0) {
                    this.d0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.d0;
                int i33 = i32 + 1;
                this.U = i32;
                this.d0 = i32 + 2;
                this.V = i33;
                int size2 = arrayList3.size() + i33;
                this.W = size2 - 1;
                this.d0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.d0;
                if (i34 > 0) {
                    this.d0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.d0;
                int i36 = i35 + 1;
                this.X = i35;
                this.d0 = i35 + 2;
                this.Y = i36;
                int size3 = arrayList2.size() + i36;
                this.Z = size3 - 1;
                this.d0 = size3;
            }
            int i37 = this.d0;
            if (i37 > 0) {
                this.d0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.d0;
                this.d0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (c51Var.f != null) {
            int i39 = this.d0;
            this.c = i39;
            this.d0 = i39 + 2;
            this.d = i39 + 1;
        }
        o41 o41Var9 = c51Var.d;
        if (o41Var9 != null && !o41Var9.l) {
            int i40 = this.d0;
            if (i40 > 0) {
                this.d0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.d0;
            this.d0 = i41 + 1;
            this.e = i41;
        }
        o41 o41Var10 = c51Var.h;
        if (o41Var10 != null && !o41Var10.l) {
            int i42 = this.d0;
            if (i42 > 0) {
                this.d0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.d0;
            this.d0 = i43 + 1;
            this.h = i43;
        }
        o41 o41Var11 = c51Var.y;
        if (o41Var11 != null && !o41Var11.l) {
            int i44 = this.d0;
            if (i44 > 0) {
                this.d0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.d0;
            this.d0 = i45 + 1;
            this.E = i45;
        }
        o41 o41Var12 = c51Var.e;
        if (o41Var12 != null && !o41Var12.l) {
            int i46 = this.d0;
            if (i46 > 0) {
                this.d0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.d0;
            this.d0 = i47 + 1;
            this.n = i47;
        }
        o41 o41Var13 = c51Var.s;
        if (o41Var13 != null && !o41Var13.l) {
            int i48 = this.d0;
            if (i48 > 0) {
                this.d0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.d0;
            this.d0 = i49 + 1;
            this.w = i49;
        }
        o41 o41Var14 = c51Var.w;
        if (o41Var14 != null && !o41Var14.l) {
            int i50 = this.d0;
            if (i50 > 0) {
                this.d0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.d0;
            this.d0 = i51 + 1;
            this.x = i51;
        }
        o41 o41Var15 = c51Var.x;
        if (o41Var15 != null && !o41Var15.l) {
            int i52 = this.d0;
            if (i52 > 0) {
                this.d0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.d0;
            this.d0 = i53 + 1;
            this.y = i53;
        }
        o41 o41Var16 = c51Var.n;
        if (o41Var16 != null && !o41Var16.l) {
            int i54 = this.d0;
            if (i54 > 0) {
                this.d0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.d0;
            this.d0 = i55 + 1;
            this.r = i55;
        }
        o41 o41Var17 = c51Var.r;
        if (o41Var17 != null && !o41Var17.k && !o41Var17.a) {
            int i56 = this.d0;
            if (i56 > 0) {
                this.d0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.d0;
            this.d0 = i57 + 1;
            this.s = i57;
        }
        o41 o41Var18 = c51Var.E;
        if (o41Var18 != null && !o41Var18.l && !o41Var18.a) {
            int i58 = this.d0;
            if (i58 > 0) {
                this.d0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.d0;
            this.d0 = i59 + 1;
            this.F = i59;
        }
        o41 o41Var19 = c51Var.F;
        if (o41Var19 != null && !o41Var19.l && !o41Var19.a) {
            int i60 = this.d0;
            if (i60 > 0) {
                this.d0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.d0;
            this.d0 = i61 + 1;
            this.G = i61;
        }
        o41 o41Var20 = c51Var.G;
        if (o41Var20 != null && !o41Var20.l && !o41Var20.a) {
            int i62 = this.d0;
            if (i62 > 0) {
                this.d0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.d0;
            this.d0 = i63 + 1;
            this.H = i63;
        }
        int i64 = this.d0;
        this.d0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.d0;
            int i66 = i65 + 1;
            this.I = i65;
            this.d0 = i65 + 2;
            this.J = i66;
            int size4 = arrayList.size() + i66;
            this.K = size4 - 1;
            this.d0 = size4;
            if (c51Var.w0.size() != c51Var.v0.size()) {
                int i67 = this.d0;
                this.d0 = i67 + 1;
                this.f = i67;
            } else {
                int i68 = this.d0;
                this.d0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.d0;
            this.d0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.d0;
    }

    @Override // v4.i0
    public final long c(int i7) {
        if (i7 >= this.J && i7 < this.K) {
            return ((z41) this.e0.z0.get(i7 - r0)).b();
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
        if (i7 == this.E) {
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
        if (i7 == this.L) {
            return 10L;
        }
        if (i7 == this.M) {
            return 11L;
        }
        if (i7 == this.N) {
            return 12L;
        }
        if (i7 == this.O) {
            return 13L;
        }
        if (i7 == this.P) {
            return 14L;
        }
        if (i7 == this.Q) {
            return 15L;
        }
        if (i7 == this.F) {
            return 16L;
        }
        if (i7 == this.G) {
            return 17L;
        }
        return i7 == this.H ? 18L : -1L;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == this.e || i7 == this.h || i7 == this.n || i7 == this.E || i7 == this.P || i7 == this.L) {
            return 0;
        }
        if (i7 == this.r || i7 == this.s || i7 == this.G) {
            return 1;
        }
        if (i7 == this.w || i7 == this.x || i7 == this.M || i7 == this.O || i7 == this.F || i7 == this.H) {
            return 2;
        }
        if (i7 == this.y || i7 == this.N || i7 == this.Q) {
            return 4;
        }
        if (i7 >= this.J && i7 <= this.K) {
            return 9;
        }
        if (i7 == this.f) {
            return 11;
        }
        if (this.c0.contains(Integer.valueOf(i7))) {
            return 12;
        }
        if (i7 == this.I || i7 == this.c || i7 == this.U || i7 == this.R || i7 == this.X) {
            return 13;
        }
        if (i7 == this.d) {
            return 14;
        }
        if ((i7 < this.V || i7 > this.W) && ((i7 < this.S || i7 > this.T) && (i7 < this.Y || i7 > this.Z))) {
            return i7 == this.a0 ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0216 A[LOOP:0: B:100:0x0214->B:101:0x0216, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.gj gjVar;
        z41 z41Var;
        CharSequence charSequence;
        z41 z41Var2;
        View view = f1Var.a;
        c51 c51Var = this.e0;
        ArrayList arrayList = c51Var.z0;
        ArrayList arrayList2 = c51Var.P;
        boolean z10 = c51Var.c0;
        int d = d(i7);
        if (d >= 0 && d <= 4) {
            ((n41) view).e(this.e == i7 ? c51Var.d : this.h == i7 ? c51Var.h : this.r == i7 ? c51Var.n : this.w == i7 ? c51Var.s : this.x == i7 ? c51Var.w : this.s == i7 ? c51Var.r : this.n == i7 ? c51Var.e : this.E == i7 ? c51Var.y : this.F == i7 ? c51Var.E : this.G == i7 ? c51Var.F : this.H == i7 ? c51Var.G : this.L == i7 ? c51Var.I : this.M == i7 ? c51Var.J : this.N == i7 ? c51Var.K : this.O == i7 ? c51Var.L : this.P == i7 ? c51Var.M : this.Q == i7 ? c51Var.N : c51Var.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                ng.c cVar = (ng.c) view;
                cVar.c(true);
                cVar.b(c51Var.g0, c51Var.f0);
                cVar.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                if (i7 == this.c) {
                    cVar.setTitle(org.telegram.messenger.hd.N0(2131744652, "StatisticOverview"));
                    return;
                }
                if (i7 == this.U) {
                    cVar.setTitle(org.telegram.messenger.hd.N0(2131743792, "TopAdmins"));
                    return;
                }
                if (i7 == this.X) {
                    cVar.setTitle(org.telegram.messenger.hd.N0(2131743789, "TopInviters"));
                    return;
                } else {
                    if (i7 == this.R) {
                        cVar.setTitle(org.telegram.messenger.hd.N0(2131743788, "TopMembers"));
                        return;
                    }
                    cVar.c(false);
                    cVar.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f));
                    cVar.setTitle(org.telegram.messenger.hd.N0(2131746169, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((org.telegram.ui.Cells.y4) view).b(R.drawable.arrow_more, 5, org.telegram.messenger.hd.G(c51Var.O.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            w41 w41Var = (w41) view;
            if (z10) {
                w41Var.setData(c51Var.H);
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
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.d ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
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
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.h ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
                        textViewArr2[i10].setText(x41Var.e);
                        i10++;
                        break;
                    case 3:
                        textViewArr[i10].setText(x41Var.z);
                        textViewArr3[i10].setText(x41Var.A);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.B ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
                        textViewArr2[i10].setText(x41Var.y);
                        if (!x41Var.C) {
                            break;
                        }
                        i10++;
                        break;
                    case 4:
                        textViewArr[i10].setText(x41Var.j);
                        textViewArr3[i10].setText(x41Var.k);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.l ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
                        textViewArr2[i10].setText(x41Var.i);
                        i10++;
                        break;
                    case 5:
                        textViewArr[i10].setText(x41Var.E);
                        textViewArr3[i10].setText(x41Var.F);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.G ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
                        textViewArr2[i10].setText(x41Var.D);
                        if (!x41Var.H) {
                            break;
                        }
                        i10++;
                        break;
                    case 6:
                        textViewArr[i10].setText(x41Var.p);
                        textViewArr3[i10].setText(x41Var.q);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.r ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
                        textViewArr2[i10].setText(x41Var.o);
                        if (!x41Var.s) {
                            break;
                        }
                        i10++;
                        break;
                    case 7:
                        textViewArr[i10].setText(x41Var.u);
                        textViewArr3[i10].setText(x41Var.v);
                        textViewArr3[i10].setTag(Integer.valueOf(x41Var.w ? org.telegram.ui.ActionBar.m6.x6 : org.telegram.ui.ActionBar.m6.p7));
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
        if (z10) {
            int i13 = this.V;
            if (i7 >= i13 && i7 <= this.W) {
                ((org.telegram.ui.Cells.x7) view).setData((v41) c51Var.R.get(i7 - i13));
                return;
            }
            int i14 = this.S;
            if (i7 >= i14 && i7 <= this.T) {
                ((org.telegram.ui.Cells.x7) view).setData((v41) arrayList2.get(i7 - i14));
                return;
            }
            int i15 = this.Y;
            if (i7 < i15 || i7 > this.Z) {
                return;
            }
            ((org.telegram.ui.Cells.x7) view).setData((v41) c51Var.Q.get(i7 - i15));
            return;
        }
        int i16 = i7 - this.J;
        z41 z41Var3 = (z41) arrayList.get(i16);
        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
        boolean z11 = i16 == arrayList.size() - 1;
        TextView textView = x7Var.f;
        TextView textView2 = x7Var.d;
        org.telegram.ui.Components.b9 b9Var = x7Var.n;
        TLRPC.ChatFull chatFull = x7Var.x;
        org.telegram.ui.Cells.v7 v7Var = x7Var.a;
        x7Var.w = z41Var3;
        x7Var.y = !z11;
        org.telegram.messenger.gj gjVar2 = z41Var3.b;
        ArrayList arrayList3 = gjVar2.p0;
        if (arrayList3 != null) {
            v7Var.l(org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(arrayList3, org.telegram.messenger.g0.Z0(false), false, null, false), gjVar2.n0), "50_50", org.telegram.messenger.gc.f(org.telegram.messenger.w7.w(gjVar2.p0, 50, false, null, false), gjVar2.n0), "b1", 0, gjVar2);
            gjVar = gjVar2;
            v7Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
            v7Var.setScaleX(0.96f);
            v7Var.setScaleY(0.96f);
        } else {
            gjVar = gjVar2;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                z41Var = z41Var3;
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(chatFull.id));
                b9Var.q(O0);
                v7Var.f(O0, b9Var);
                v7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                v7Var.setScaleX(1.0f);
                v7Var.setScaleY(1.0f);
                if (gjVar.x4()) {
                    v7Var.setScaleX(1.0f);
                    v7Var.setScaleY(1.0f);
                    v7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
                }
                if (!gjVar.I3()) {
                    charSequence = a8.p0.E(gjVar.y1(true).trim(), ", ", gjVar.w1(true).trim());
                } else if (gjVar.x4()) {
                    charSequence = org.telegram.messenger.hd.N0(2131744492, null);
                } else {
                    charSequence = gjVar.z;
                    if (charSequence == null) {
                        charSequence = gjVar.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                x7Var.b.k(org.telegram.messenger.g0.N3(org.telegram.messenger.g0.N2(spannableStringBuilder), null));
                x7Var.c.setText(String.format(org.telegram.messenger.hd.K0(z41Var.d(), "Views"), org.telegram.messenger.g0.o0(z41Var.d(), 0)));
                z41Var2 = z41Var;
                Date date = new Date((z41Var2.b != null ? 0L : r6.k.date) * 1000);
                x7Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131742517, org.telegram.messenger.hd.E0().C0().format(date), org.telegram.messenger.hd.E0().p0().format(date)));
                textView2.setText(org.telegram.messenger.g0.o0(z41Var2.a(), 0));
                textView.setText(org.telegram.messenger.g0.o0(z41Var2.c(), 0));
                textView2.setVisibility(z41Var2.a() == 0 ? 0 : 8);
                textView.setVisibility(z41Var2.c() == 0 ? 8 : 0);
                x7Var.invalidate();
                if (z41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    x7Var.setImageViewAction(null);
                    return;
                } else {
                    x7Var.setImageViewAction(new jg0(14, this, z41Var2));
                    return;
                }
            }
            v7Var.k(org.telegram.messenger.gc.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, x7Var.x);
            v7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
            v7Var.setScaleX(0.96f);
            v7Var.setScaleY(0.96f);
        }
        z41Var = z41Var3;
        if (gjVar.x4()) {
        }
        if (!gjVar.I3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        x7Var.b.k(org.telegram.messenger.g0.N3(org.telegram.messenger.g0.N2(spannableStringBuilder2), null));
        x7Var.c.setText(String.format(org.telegram.messenger.hd.K0(z41Var.d(), "Views"), org.telegram.messenger.g0.o0(z41Var.d(), 0)));
        z41Var2 = z41Var;
        Date date2 = new Date((z41Var2.b != null ? 0L : r6.k.date) * 1000);
        x7Var.e.setText(org.telegram.messenger.hd.a0(null, null, 2131742517, org.telegram.messenger.hd.E0().C0().format(date2), org.telegram.messenger.hd.E0().p0().format(date2)));
        textView2.setText(org.telegram.messenger.g0.o0(z41Var2.a(), 0));
        textView.setText(org.telegram.messenger.g0.o0(z41Var2.c(), 0));
        textView2.setVisibility(z41Var2.a() == 0 ? 0 : 8);
        textView.setVisibility(z41Var2.c() == 0 ? 8 : 0);
        x7Var.invalidate();
        if (z41Var2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        c51 c51Var = this.e0;
        if (i7 >= 0 && i7 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.g2) c51Var).currentAccount;
            View e41Var = new e41(c51Var, context, i10, i7, c51Var.a0);
            e41Var.setWillNotDraw(false);
            view = e41Var;
        } else if (i7 == 9) {
            View f41Var = new f41(viewGroup.getContext(), c51Var.a, c51Var.getResourceProvider());
            f41Var.setWillNotDraw(false);
            view = f41Var;
        } else if (i7 == 11) {
            view = new org.telegram.ui.Cells.u4(viewGroup.getContext());
        } else if (i7 == 12) {
            view = new org.telegram.ui.Cells.n3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i7 == 13) {
            View g41Var = new g41(viewGroup.getContext(), null);
            g41Var.setWillNotDraw(false);
            g41Var.setPadding(g41Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), g41Var.getRight(), org.telegram.messenger.g0.L(16.0f));
            view = g41Var;
        } else if (i7 == 14) {
            view = new w41(viewGroup.getContext(), c51Var.c0 ? 2 : 4);
        } else if (i7 == 15) {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
            view = y4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
        }
        return i5.c.q(view, view, -1, -2);
    }
}
