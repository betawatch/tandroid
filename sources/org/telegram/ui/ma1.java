package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ma1 extends org.telegram.ui.Components.lm0 {
    public int c0;
    public int d;
    public final /* synthetic */ hb1 d0;
    public int c = -1;
    public int e = -1;
    public int f = -1;
    public int h = -1;
    public int n = -1;
    public int r = -1;
    public int s = -1;
    public int v = -1;
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
    public final a0.g a0 = new a0.g(0);
    public final a0.g b0 = new a0.g(0);

    public ma1(hb1 hb1Var) {
        this.d0 = hb1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 9 || i10 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.I = -1;
        this.J = -1;
        this.f = -1;
        this.H = -1;
        this.s = -1;
        this.n = -1;
        this.y = -1;
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
        hb1 hb1Var = this.d0;
        ArrayList arrayList = hb1Var.v0;
        ArrayList arrayList2 = hb1Var.P;
        ArrayList arrayList3 = hb1Var.Q;
        ArrayList arrayList4 = hb1Var.O;
        if (hb1Var.c0) {
            if (hb1Var.G != null) {
                int i10 = this.c0;
                this.c = i10;
                this.c0 = i10 + 2;
                this.d = i10 + 1;
            }
            ta1 ta1Var = hb1Var.d;
            if (ta1Var != null && !ta1Var.l) {
                int i11 = this.c0;
                if (i11 > 0) {
                    this.c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.c0;
                this.c0 = i12 + 1;
                this.e = i12;
            }
            ta1 ta1Var2 = hb1Var.H;
            if (ta1Var2 != null && !ta1Var2.l) {
                int i13 = this.c0;
                if (i13 > 0) {
                    this.c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.c0;
                this.c0 = i14 + 1;
                this.K = i14;
            }
            ta1 ta1Var3 = hb1Var.I;
            if (ta1Var3 != null && !ta1Var3.l && !ta1Var3.a) {
                int i15 = this.c0;
                if (i15 > 0) {
                    this.c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.c0;
                this.c0 = i16 + 1;
                this.L = i16;
            }
            ta1 ta1Var4 = hb1Var.J;
            if (ta1Var4 != null && !ta1Var4.l && !ta1Var4.a) {
                int i17 = this.c0;
                if (i17 > 0) {
                    this.c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.c0;
                this.c0 = i18 + 1;
                this.M = i18;
            }
            ta1 ta1Var5 = hb1Var.K;
            if (ta1Var5 != null && !ta1Var5.l && !ta1Var5.a) {
                int i19 = this.c0;
                if (i19 > 0) {
                    this.c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.c0;
                this.c0 = i20 + 1;
                this.N = i20;
            }
            ta1 ta1Var6 = hb1Var.L;
            if (ta1Var6 != null && !ta1Var6.l && !ta1Var6.a) {
                int i21 = this.c0;
                if (i21 > 0) {
                    this.c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.c0;
                this.c0 = i22 + 1;
                this.O = i22;
            }
            ta1 ta1Var7 = hb1Var.e;
            if (ta1Var7 != null && !ta1Var7.l && !ta1Var7.a) {
                int i23 = this.c0;
                if (i23 > 0) {
                    this.c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.c0;
                this.c0 = i24 + 1;
                this.n = i24;
            }
            ta1 ta1Var8 = hb1Var.M;
            if (ta1Var8 != null && !ta1Var8.l && !ta1Var8.a) {
                int i25 = this.c0;
                if (i25 > 0) {
                    this.c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.c0;
                this.c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.c0;
                if (i27 > 0) {
                    this.c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.c0 = size;
                if (arrayList4.size() != hb1Var.N.size()) {
                    int i30 = this.c0;
                    this.c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.c0;
                    this.c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.c0;
                if (i32 > 0) {
                    this.c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.c0;
                if (i35 > 0) {
                    this.c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.c0 = size3;
            }
            int i38 = this.c0;
            if (i38 > 0) {
                this.c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.c0;
                this.c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (hb1Var.f != null) {
            int i40 = this.c0;
            this.c = i40;
            this.c0 = i40 + 2;
            this.d = i40 + 1;
        }
        ta1 ta1Var9 = hb1Var.d;
        if (ta1Var9 != null && !ta1Var9.l) {
            int i41 = this.c0;
            if (i41 > 0) {
                this.c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.c0;
            this.c0 = i42 + 1;
            this.e = i42;
        }
        ta1 ta1Var10 = hb1Var.h;
        if (ta1Var10 != null && !ta1Var10.l) {
            int i43 = this.c0;
            if (i43 > 0) {
                this.c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.c0;
            this.c0 = i44 + 1;
            this.h = i44;
        }
        ta1 ta1Var11 = hb1Var.x;
        if (ta1Var11 != null && !ta1Var11.l) {
            int i45 = this.c0;
            if (i45 > 0) {
                this.c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.c0;
            this.c0 = i46 + 1;
            this.y = i46;
        }
        ta1 ta1Var12 = hb1Var.e;
        if (ta1Var12 != null && !ta1Var12.l) {
            int i47 = this.c0;
            if (i47 > 0) {
                this.c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.c0;
            this.c0 = i48 + 1;
            this.n = i48;
        }
        ta1 ta1Var13 = hb1Var.s;
        if (ta1Var13 != null && !ta1Var13.l) {
            int i49 = this.c0;
            if (i49 > 0) {
                this.c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.c0;
            this.c0 = i50 + 1;
            this.v = i50;
        }
        ta1 ta1Var14 = hb1Var.v;
        if (ta1Var14 != null && !ta1Var14.l) {
            int i51 = this.c0;
            if (i51 > 0) {
                this.c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.c0;
            this.c0 = i52 + 1;
            this.w = i52;
        }
        ta1 ta1Var15 = hb1Var.w;
        if (ta1Var15 != null && !ta1Var15.l) {
            int i53 = this.c0;
            if (i53 > 0) {
                this.c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.c0;
            this.c0 = i54 + 1;
            this.x = i54;
        }
        ta1 ta1Var16 = hb1Var.n;
        if (ta1Var16 != null && !ta1Var16.l) {
            int i55 = this.c0;
            if (i55 > 0) {
                this.c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.c0;
            this.c0 = i56 + 1;
            this.r = i56;
        }
        ta1 ta1Var17 = hb1Var.r;
        if (ta1Var17 != null && !ta1Var17.k && !ta1Var17.a) {
            int i57 = this.c0;
            if (i57 > 0) {
                this.c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.c0;
            this.c0 = i58 + 1;
            this.s = i58;
        }
        ta1 ta1Var18 = hb1Var.y;
        if (ta1Var18 != null && !ta1Var18.l && !ta1Var18.a) {
            int i59 = this.c0;
            if (i59 > 0) {
                this.c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.c0;
            this.c0 = i60 + 1;
            this.E = i60;
        }
        ta1 ta1Var19 = hb1Var.E;
        if (ta1Var19 != null && !ta1Var19.l && !ta1Var19.a) {
            int i61 = this.c0;
            if (i61 > 0) {
                this.c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.c0;
            this.c0 = i62 + 1;
            this.F = i62;
        }
        ta1 ta1Var20 = hb1Var.F;
        if (ta1Var20 != null && !ta1Var20.l && !ta1Var20.a) {
            int i63 = this.c0;
            if (i63 > 0) {
                this.c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.c0;
            this.c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.c0;
        this.c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.c0 = size4;
            if (hb1Var.s0.size() != hb1Var.r0.size()) {
                int i68 = this.c0;
                this.c0 = i68 + 1;
                this.f = i68;
            } else {
                int i69 = this.c0;
                this.c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.c0;
            this.c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override // s4.g0
    public final int h() {
        return this.c0;
    }

    @Override // s4.g0
    public final long i(int i10) {
        if (i10 >= this.I && i10 < this.J) {
            return ((eb1) this.d0.v0.get(i10 - r0)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.n) {
            return 3L;
        }
        if (i10 == this.r) {
            return 4L;
        }
        if (i10 == this.y) {
            return 5L;
        }
        if (i10 == this.s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.w) {
            return 8L;
        }
        if (i10 == this.x) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        return i10 == this.G ? 18L : -1L;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == this.e || i10 == this.h || i10 == this.n || i10 == this.y || i10 == this.O || i10 == this.K) {
            return 0;
        }
        if (i10 == this.r || i10 == this.s || i10 == this.F) {
            return 1;
        }
        if (i10 == this.v || i10 == this.w || i10 == this.L || i10 == this.N || i10 == this.E || i10 == this.G) {
            return 2;
        }
        if (i10 == this.x || i10 == this.M || i10 == this.P) {
            return 4;
        }
        if (i10 >= this.I && i10 <= this.J) {
            return 9;
        }
        if (i10 == this.f) {
            return 11;
        }
        if (this.b0.contains(Integer.valueOf(i10))) {
            return 12;
        }
        if (i10 == this.H || i10 == this.c || i10 == this.T || i10 == this.Q || i10 == this.W) {
            return 13;
        }
        if (i10 == this.d) {
            return 14;
        }
        if ((i10 < this.U || i10 > this.V) && ((i10 < this.R || i10 > this.S) && (i10 < this.X || i10 > this.Y))) {
            return i10 == this.Z ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0217 A[LOOP:0: B:100:0x0215->B:101:0x0217, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        MessageObject messageObject;
        float f7;
        MessageObject messageObject2;
        int i11;
        CharSequence charSequence;
        View view = b1Var.a;
        hb1 hb1Var = this.d0;
        ArrayList arrayList = hb1Var.v0;
        ArrayList arrayList2 = hb1Var.O;
        boolean z10 = hb1Var.c0;
        int j10 = j(i10);
        if (j10 >= 0 && j10 <= 4) {
            ((sa1) view).e(this.e == i10 ? hb1Var.d : this.h == i10 ? hb1Var.h : this.r == i10 ? hb1Var.n : this.v == i10 ? hb1Var.s : this.w == i10 ? hb1Var.v : this.s == i10 ? hb1Var.r : this.n == i10 ? hb1Var.e : this.y == i10 ? hb1Var.x : this.E == i10 ? hb1Var.y : this.F == i10 ? hb1Var.E : this.G == i10 ? hb1Var.F : this.K == i10 ? hb1Var.H : this.L == i10 ? hb1Var.I : this.M == i10 ? hb1Var.J : this.N == i10 ? hb1Var.K : this.O == i10 ? hb1Var.L : this.P == i10 ? hb1Var.M : hb1Var.w, false);
            return;
        }
        if (j10 != 9) {
            if (j10 == 13) {
                lg.c cVar = (lg.c) view;
                cVar.c(true);
                cVar.b(hb1Var.g0, hb1Var.f0);
                cVar.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                if (i10 == this.c) {
                    cVar.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                    return;
                }
                if (i10 == this.T) {
                    cVar.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                    return;
                }
                if (i10 == this.W) {
                    cVar.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                    return;
                } else {
                    if (i10 == this.Q) {
                        cVar.setTitle(LocaleController.getString("TopMembers", R.string.TopMembers));
                        return;
                    }
                    cVar.c(false);
                    cVar.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f));
                    cVar.setTitle(LocaleController.getString("RecentPostsCapitalize", R.string.RecentPostsCapitalize));
                    return;
                }
            }
            if (j10 != 14) {
                if (j10 == 15) {
                    ((org.telegram.ui.Cells.y4) view).b(LocaleController.formatPluralString("ShowVotes", hb1Var.N.size() - arrayList2.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            bb1 bb1Var = (bb1) view;
            if (z10) {
                bb1Var.setData(hb1Var.G);
                return;
            }
            cb1 cb1Var = hb1Var.f;
            TextView[] textViewArr = bb1Var.a;
            TextView[] textViewArr2 = bb1Var.c;
            TextView[] textViewArr3 = bb1Var.b;
            int i12 = 0;
            for (int i13 = 0; i13 < textViewArr.length; i13++) {
                switch (i13) {
                    case 0:
                        textViewArr[i12].setText(cb1Var.b);
                        textViewArr3[i12].setText(cb1Var.c);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.d ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.a);
                        i12++;
                        break;
                    case 1:
                        textViewArr[i12].setText(cb1Var.n);
                        textViewArr3[i12].setText("");
                        textViewArr2[i12].setText(cb1Var.m);
                        i12++;
                        break;
                    case 2:
                        textViewArr[i12].setText(cb1Var.f);
                        textViewArr3[i12].setText(cb1Var.g);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.h ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.e);
                        i12++;
                        break;
                    case 3:
                        textViewArr[i12].setText(cb1Var.z);
                        textViewArr3[i12].setText(cb1Var.A);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.B ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.y);
                        if (!cb1Var.C) {
                            break;
                        }
                        i12++;
                        break;
                    case 4:
                        textViewArr[i12].setText(cb1Var.j);
                        textViewArr3[i12].setText(cb1Var.k);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.l ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.i);
                        i12++;
                        break;
                    case 5:
                        textViewArr[i12].setText(cb1Var.E);
                        textViewArr3[i12].setText(cb1Var.F);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.G ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.D);
                        if (!cb1Var.H) {
                            break;
                        }
                        i12++;
                        break;
                    case 6:
                        textViewArr[i12].setText(cb1Var.p);
                        textViewArr3[i12].setText(cb1Var.q);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.r ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.o);
                        if (!cb1Var.s) {
                            break;
                        }
                        i12++;
                        break;
                    case 7:
                        textViewArr[i12].setText(cb1Var.u);
                        textViewArr3[i12].setText(cb1Var.v);
                        textViewArr3[i12].setTag(Integer.valueOf(cb1Var.w ? org.telegram.ui.ActionBar.g6.x6 : org.telegram.ui.ActionBar.g6.p7));
                        textViewArr2[i12].setText(cb1Var.t);
                        if (!cb1Var.x) {
                            break;
                        }
                        i12++;
                        break;
                }
            }
            while (i12 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i12].getParent()).setVisibility(8);
                i12++;
            }
            for (int i14 = 0; i14 < bb1Var.getChildCount(); i14++) {
                ViewGroup viewGroup = (ViewGroup) bb1Var.getChildAt(i14);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            bb1Var.b();
            return;
        }
        if (z10) {
            int i15 = this.U;
            if (i10 >= i15 && i10 <= this.V) {
                ((org.telegram.ui.Cells.c8) view).setData((ab1) hb1Var.Q.get(i10 - i15));
                return;
            }
            int i16 = this.R;
            if (i10 >= i16 && i10 <= this.S) {
                ((org.telegram.ui.Cells.c8) view).setData((ab1) arrayList2.get(i10 - i16));
                return;
            }
            int i17 = this.X;
            if (i10 < i17 || i10 > this.Y) {
                return;
            }
            ((org.telegram.ui.Cells.c8) view).setData((ab1) hb1Var.P.get(i10 - i17));
            return;
        }
        int i18 = i10 - this.I;
        eb1 eb1Var = (eb1) arrayList.get(i18);
        org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
        boolean z11 = i18 == arrayList.size() - 1;
        TextView textView = c8Var.f;
        TextView textView2 = c8Var.d;
        org.telegram.ui.Components.k9 k9Var = c8Var.n;
        TLRPC.ChatFull chatFull = c8Var.w;
        org.telegram.ui.Cells.a8 a8Var = c8Var.a;
        c8Var.v = eb1Var;
        c8Var.x = !z11;
        MessageObject messageObject3 = eb1Var.b;
        ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject3.photoThumbs;
        if (arrayList3 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 50);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject3.photoThumbsObject);
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject);
            messageObject = messageObject3;
            f7 = 1.0f;
            a8Var.j(forObject, "50_50", forObject2, "b1", 0, messageObject);
            a8Var.setRoundRadius(AndroidUtilities.dp(9.0f));
            a8Var.setScaleX(0.96f);
            a8Var.setScaleY(0.96f);
        } else {
            messageObject = messageObject3;
            f7 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                messageObject2 = messageObject;
                i11 = 1;
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                k9Var.q(chat);
                a8Var.e(chat, k9Var);
                a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                a8Var.setScaleX(1.0f);
                a8Var.setScaleY(1.0f);
                if (messageObject2.isStory()) {
                    a8Var.setScaleX(f7);
                    a8Var.setScaleY(f7);
                    a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> i11);
                }
                if (!messageObject2.isMusic()) {
                    charSequence = a1.g.D(messageObject2.getMusicTitle().trim(), ", ", messageObject2.getMusicAuthor().trim());
                } else if (messageObject2.isStory()) {
                    charSequence = LocaleController.getString(R.string.Story);
                } else {
                    charSequence = messageObject2.caption;
                    if (charSequence == null) {
                        charSequence = messageObject2.messageText;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                c8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView3 = c8Var.c;
                String pluralString = LocaleController.getPluralString("Views", eb1Var.d());
                Object[] objArr = new Object[i11];
                objArr[0] = AndroidUtilities.formatWholeNumber(eb1Var.d(), 0);
                textView3.setText(String.format(pluralString, objArr));
                Date date = new Date((eb1Var.b != null ? 0L : r6.messageOwner.date) * 1000);
                c8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                textView2.setText(AndroidUtilities.formatWholeNumber(eb1Var.a(), 0));
                textView.setText(AndroidUtilities.formatWholeNumber(eb1Var.c(), 0));
                textView2.setVisibility(eb1Var.a() == 0 ? 0 : 8);
                textView.setVisibility(eb1Var.c() == 0 ? 8 : 0);
                c8Var.invalidate();
                if (eb1Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    c8Var.setImageViewAction(null);
                    return;
                } else {
                    c8Var.setImageViewAction(new bz0(6, this, eb1Var));
                    return;
                }
            }
            a8Var.i(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, c8Var.w);
            a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            a8Var.setScaleX(0.96f);
            a8Var.setScaleY(0.96f);
        }
        i11 = 1;
        messageObject2 = messageObject;
        if (messageObject2.isStory()) {
        }
        if (!messageObject2.isMusic()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r9 < r7) {
        }
        c8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder2), null));
        TextView textView32 = c8Var.c;
        String pluralString2 = LocaleController.getPluralString("Views", eb1Var.d());
        Object[] objArr2 = new Object[i11];
        objArr2[0] = AndroidUtilities.formatWholeNumber(eb1Var.d(), 0);
        textView32.setText(String.format(pluralString2, objArr2));
        Date date2 = new Date((eb1Var.b != null ? 0L : r6.messageOwner.date) * 1000);
        c8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        textView2.setText(AndroidUtilities.formatWholeNumber(eb1Var.a(), 0));
        textView.setText(AndroidUtilities.formatWholeNumber(eb1Var.c(), 0));
        textView2.setVisibility(eb1Var.a() == 0 ? 0 : 8);
        textView.setVisibility(eb1Var.c() == 0 ? 8 : 0);
        c8Var.invalidate();
        if (eb1Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        hb1 hb1Var = this.d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.m2) hb1Var).currentAccount;
            View ja1Var = new ja1(hb1Var, context, i11, i10, hb1Var.a0);
            ja1Var.setWillNotDraw(false);
            view = ja1Var;
        } else if (i10 == 9) {
            View ka1Var = new ka1(viewGroup.getContext(), hb1Var.a, hb1Var.getResourceProvider());
            ka1Var.setWillNotDraw(false);
            view = ka1Var;
        } else if (i10 == 11) {
            view = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i10 == 12) {
            view = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View la1Var = new la1(viewGroup.getContext(), null);
            la1Var.setWillNotDraw(false);
            la1Var.setPadding(la1Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), la1Var.getRight(), AndroidUtilities.dp(16.0f));
            view = la1Var;
        } else if (i10 == 14) {
            view = new bb1(viewGroup.getContext(), hb1Var.c0 ? 2 : 4);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            view = y4Var;
        } else {
            view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), 0, 0);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
