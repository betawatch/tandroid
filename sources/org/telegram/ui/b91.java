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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b91 extends org.telegram.ui.Components.lm0 {
    public int c0;
    public int d;
    public final /* synthetic */ w91 d0;
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

    public b91(w91 w91Var) {
        this.d0 = w91Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
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
        w91 w91Var = this.d0;
        ArrayList arrayList = w91Var.y0;
        ArrayList arrayList2 = w91Var.P;
        ArrayList arrayList3 = w91Var.Q;
        ArrayList arrayList4 = w91Var.O;
        if (w91Var.b0) {
            if (w91Var.G != null) {
                int i10 = this.c0;
                this.c = i10;
                this.c0 = i10 + 2;
                this.d = i10 + 1;
            }
            i91 i91Var = w91Var.d;
            if (i91Var != null && !i91Var.l) {
                int i11 = this.c0;
                if (i11 > 0) {
                    this.c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.c0;
                this.c0 = i12 + 1;
                this.e = i12;
            }
            i91 i91Var2 = w91Var.H;
            if (i91Var2 != null && !i91Var2.l) {
                int i13 = this.c0;
                if (i13 > 0) {
                    this.c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.c0;
                this.c0 = i14 + 1;
                this.K = i14;
            }
            i91 i91Var3 = w91Var.I;
            if (i91Var3 != null && !i91Var3.l && !i91Var3.a) {
                int i15 = this.c0;
                if (i15 > 0) {
                    this.c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.c0;
                this.c0 = i16 + 1;
                this.L = i16;
            }
            i91 i91Var4 = w91Var.J;
            if (i91Var4 != null && !i91Var4.l && !i91Var4.a) {
                int i17 = this.c0;
                if (i17 > 0) {
                    this.c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.c0;
                this.c0 = i18 + 1;
                this.M = i18;
            }
            i91 i91Var5 = w91Var.K;
            if (i91Var5 != null && !i91Var5.l && !i91Var5.a) {
                int i19 = this.c0;
                if (i19 > 0) {
                    this.c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.c0;
                this.c0 = i20 + 1;
                this.N = i20;
            }
            i91 i91Var6 = w91Var.L;
            if (i91Var6 != null && !i91Var6.l && !i91Var6.a) {
                int i21 = this.c0;
                if (i21 > 0) {
                    this.c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.c0;
                this.c0 = i22 + 1;
                this.O = i22;
            }
            i91 i91Var7 = w91Var.e;
            if (i91Var7 != null && !i91Var7.l && !i91Var7.a) {
                int i23 = this.c0;
                if (i23 > 0) {
                    this.c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.c0;
                this.c0 = i24 + 1;
                this.n = i24;
            }
            i91 i91Var8 = w91Var.M;
            if (i91Var8 != null && !i91Var8.l && !i91Var8.a) {
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
                if (arrayList4.size() != w91Var.N.size()) {
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
        if (w91Var.f != null) {
            int i40 = this.c0;
            this.c = i40;
            this.c0 = i40 + 2;
            this.d = i40 + 1;
        }
        i91 i91Var9 = w91Var.d;
        if (i91Var9 != null && !i91Var9.l) {
            int i41 = this.c0;
            if (i41 > 0) {
                this.c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.c0;
            this.c0 = i42 + 1;
            this.e = i42;
        }
        i91 i91Var10 = w91Var.h;
        if (i91Var10 != null && !i91Var10.l) {
            int i43 = this.c0;
            if (i43 > 0) {
                this.c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.c0;
            this.c0 = i44 + 1;
            this.h = i44;
        }
        i91 i91Var11 = w91Var.x;
        if (i91Var11 != null && !i91Var11.l) {
            int i45 = this.c0;
            if (i45 > 0) {
                this.c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.c0;
            this.c0 = i46 + 1;
            this.y = i46;
        }
        i91 i91Var12 = w91Var.e;
        if (i91Var12 != null && !i91Var12.l) {
            int i47 = this.c0;
            if (i47 > 0) {
                this.c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.c0;
            this.c0 = i48 + 1;
            this.n = i48;
        }
        i91 i91Var13 = w91Var.s;
        if (i91Var13 != null && !i91Var13.l) {
            int i49 = this.c0;
            if (i49 > 0) {
                this.c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.c0;
            this.c0 = i50 + 1;
            this.v = i50;
        }
        i91 i91Var14 = w91Var.v;
        if (i91Var14 != null && !i91Var14.l) {
            int i51 = this.c0;
            if (i51 > 0) {
                this.c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.c0;
            this.c0 = i52 + 1;
            this.w = i52;
        }
        i91 i91Var15 = w91Var.w;
        if (i91Var15 != null && !i91Var15.l) {
            int i53 = this.c0;
            if (i53 > 0) {
                this.c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.c0;
            this.c0 = i54 + 1;
            this.x = i54;
        }
        i91 i91Var16 = w91Var.n;
        if (i91Var16 != null && !i91Var16.l) {
            int i55 = this.c0;
            if (i55 > 0) {
                this.c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.c0;
            this.c0 = i56 + 1;
            this.r = i56;
        }
        i91 i91Var17 = w91Var.r;
        if (i91Var17 != null && !i91Var17.k && !i91Var17.a) {
            int i57 = this.c0;
            if (i57 > 0) {
                this.c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.c0;
            this.c0 = i58 + 1;
            this.s = i58;
        }
        i91 i91Var18 = w91Var.y;
        if (i91Var18 != null && !i91Var18.l && !i91Var18.a) {
            int i59 = this.c0;
            if (i59 > 0) {
                this.c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.c0;
            this.c0 = i60 + 1;
            this.E = i60;
        }
        i91 i91Var19 = w91Var.E;
        if (i91Var19 != null && !i91Var19.l && !i91Var19.a) {
            int i61 = this.c0;
            if (i61 > 0) {
                this.c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.c0;
            this.c0 = i62 + 1;
            this.F = i62;
        }
        i91 i91Var20 = w91Var.F;
        if (i91Var20 != null && !i91Var20.l && !i91Var20.a) {
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
            if (w91Var.v0.size() != w91Var.u0.size()) {
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

    @Override // s4.h0
    public final int h() {
        return this.c0;
    }

    @Override // s4.h0
    public final long i(int i10) {
        if (i10 >= this.I && i10 < this.J) {
            return ((t91) this.d0.y0.get(i10 - r0)).b();
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

    @Override // s4.h0
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
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        MessageObject messageObject;
        float f7;
        MessageObject messageObject2;
        int i11;
        CharSequence charSequence;
        View view = e1Var.a;
        w91 w91Var = this.d0;
        ArrayList arrayList = w91Var.y0;
        ArrayList arrayList2 = w91Var.O;
        boolean z10 = w91Var.b0;
        int j10 = j(i10);
        if (j10 >= 0 && j10 <= 4) {
            ((h91) view).e(this.e == i10 ? w91Var.d : this.h == i10 ? w91Var.h : this.r == i10 ? w91Var.n : this.v == i10 ? w91Var.s : this.w == i10 ? w91Var.v : this.s == i10 ? w91Var.r : this.n == i10 ? w91Var.e : this.y == i10 ? w91Var.x : this.E == i10 ? w91Var.y : this.F == i10 ? w91Var.E : this.G == i10 ? w91Var.F : this.K == i10 ? w91Var.H : this.L == i10 ? w91Var.I : this.M == i10 ? w91Var.J : this.N == i10 ? w91Var.K : this.O == i10 ? w91Var.L : this.P == i10 ? w91Var.M : w91Var.w, false);
            return;
        }
        if (j10 != 9) {
            if (j10 == 13) {
                mg.c cVar = (mg.c) view;
                cVar.c(true);
                cVar.b(w91Var.f0, w91Var.e0);
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
                    ((org.telegram.ui.Cells.c5) view).b(LocaleController.formatPluralString("ShowVotes", w91Var.N.size() - arrayList2.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            q91 q91Var = (q91) view;
            if (z10) {
                q91Var.setData(w91Var.G);
                return;
            }
            r91 r91Var = w91Var.f;
            TextView[] textViewArr = q91Var.a;
            TextView[] textViewArr2 = q91Var.c;
            TextView[] textViewArr3 = q91Var.b;
            int i12 = 0;
            for (int i13 = 0; i13 < textViewArr.length; i13++) {
                switch (i13) {
                    case 0:
                        textViewArr[i12].setText(r91Var.b);
                        textViewArr3[i12].setText(r91Var.c);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.d ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.a);
                        i12++;
                        break;
                    case 1:
                        textViewArr[i12].setText(r91Var.n);
                        textViewArr3[i12].setText("");
                        textViewArr2[i12].setText(r91Var.m);
                        i12++;
                        break;
                    case 2:
                        textViewArr[i12].setText(r91Var.f);
                        textViewArr3[i12].setText(r91Var.g);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.h ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.e);
                        i12++;
                        break;
                    case 3:
                        textViewArr[i12].setText(r91Var.z);
                        textViewArr3[i12].setText(r91Var.A);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.B ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.y);
                        if (!r91Var.C) {
                            break;
                        }
                        i12++;
                        break;
                    case 4:
                        textViewArr[i12].setText(r91Var.j);
                        textViewArr3[i12].setText(r91Var.k);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.l ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.i);
                        i12++;
                        break;
                    case 5:
                        textViewArr[i12].setText(r91Var.E);
                        textViewArr3[i12].setText(r91Var.F);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.G ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.D);
                        if (!r91Var.H) {
                            break;
                        }
                        i12++;
                        break;
                    case 6:
                        textViewArr[i12].setText(r91Var.p);
                        textViewArr3[i12].setText(r91Var.q);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.r ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.o);
                        if (!r91Var.s) {
                            break;
                        }
                        i12++;
                        break;
                    case 7:
                        textViewArr[i12].setText(r91Var.u);
                        textViewArr3[i12].setText(r91Var.v);
                        textViewArr3[i12].setTag(Integer.valueOf(r91Var.w ? org.telegram.ui.ActionBar.y6.x6 : org.telegram.ui.ActionBar.y6.p7));
                        textViewArr2[i12].setText(r91Var.t);
                        if (!r91Var.x) {
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
            for (int i14 = 0; i14 < q91Var.getChildCount(); i14++) {
                ViewGroup viewGroup = (ViewGroup) q91Var.getChildAt(i14);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            q91Var.updateColors();
            return;
        }
        if (z10) {
            int i15 = this.U;
            if (i10 >= i15 && i10 <= this.V) {
                ((org.telegram.ui.Cells.f8) view).setData((p91) w91Var.Q.get(i10 - i15));
                return;
            }
            int i16 = this.R;
            if (i10 >= i16 && i10 <= this.S) {
                ((org.telegram.ui.Cells.f8) view).setData((p91) arrayList2.get(i10 - i16));
                return;
            }
            int i17 = this.X;
            if (i10 < i17 || i10 > this.Y) {
                return;
            }
            ((org.telegram.ui.Cells.f8) view).setData((p91) w91Var.P.get(i10 - i17));
            return;
        }
        int i18 = i10 - this.I;
        t91 t91Var = (t91) arrayList.get(i18);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        boolean z11 = i18 == arrayList.size() - 1;
        TextView textView = f8Var.f;
        TextView textView2 = f8Var.d;
        org.telegram.ui.Components.j9 j9Var = f8Var.n;
        TLRPC.ChatFull chatFull = f8Var.w;
        org.telegram.ui.Cells.d8 d8Var = f8Var.a;
        f8Var.v = t91Var;
        f8Var.x = !z11;
        MessageObject messageObject3 = t91Var.b;
        ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject3.photoThumbs;
        if (arrayList3 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 50);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject3.photoThumbsObject);
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject);
            messageObject = messageObject3;
            f7 = 1.0f;
            d8Var.j(forObject, "50_50", forObject2, "b1", 0, messageObject);
            d8Var.setRoundRadius(AndroidUtilities.dp(9.0f));
            d8Var.setScaleX(0.96f);
            d8Var.setScaleY(0.96f);
        } else {
            messageObject = messageObject3;
            f7 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                messageObject2 = messageObject;
                i11 = 1;
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                j9Var.q(chat);
                d8Var.f(chat, j9Var);
                d8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                d8Var.setScaleX(1.0f);
                d8Var.setScaleY(1.0f);
                if (messageObject2.isStory()) {
                    d8Var.setScaleX(f7);
                    d8Var.setScaleY(f7);
                    d8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> i11);
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
                f8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView3 = f8Var.c;
                String pluralString = LocaleController.getPluralString("Views", t91Var.d());
                Object[] objArr = new Object[i11];
                objArr[0] = AndroidUtilities.formatWholeNumber(t91Var.d(), 0);
                textView3.setText(String.format(pluralString, objArr));
                Date date = new Date((t91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
                f8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                textView2.setText(AndroidUtilities.formatWholeNumber(t91Var.a(), 0));
                textView.setText(AndroidUtilities.formatWholeNumber(t91Var.c(), 0));
                textView2.setVisibility(t91Var.a() == 0 ? 0 : 8);
                textView.setVisibility(t91Var.c() == 0 ? 8 : 0);
                f8Var.invalidate();
                if (t91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    f8Var.setImageViewAction(null);
                    return;
                } else {
                    f8Var.setImageViewAction(new xd0(17, this, t91Var));
                    return;
                }
            }
            d8Var.i(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, f8Var.w);
            d8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            d8Var.setScaleX(0.96f);
            d8Var.setScaleY(0.96f);
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
        f8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder2), null));
        TextView textView32 = f8Var.c;
        String pluralString2 = LocaleController.getPluralString("Views", t91Var.d());
        Object[] objArr2 = new Object[i11];
        objArr2[0] = AndroidUtilities.formatWholeNumber(t91Var.d(), 0);
        textView32.setText(String.format(pluralString2, objArr2));
        Date date2 = new Date((t91Var.b != null ? 0L : r6.messageOwner.date) * 1000);
        f8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        textView2.setText(AndroidUtilities.formatWholeNumber(t91Var.a(), 0));
        textView.setText(AndroidUtilities.formatWholeNumber(t91Var.c(), 0));
        textView2.setVisibility(t91Var.a() == 0 ? 0 : 8);
        textView.setVisibility(t91Var.c() == 0 ? 8 : 0);
        f8Var.invalidate();
        if (t91Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        w91 w91Var = this.d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.r2) w91Var).currentAccount;
            View y81Var = new y81(w91Var, context, i11, i10, w91Var.Z);
            y81Var.setWillNotDraw(false);
            view = y81Var;
        } else if (i10 == 9) {
            View z81Var = new z81(viewGroup.getContext(), w91Var.a, w91Var.getResourceProvider());
            z81Var.setWillNotDraw(false);
            view = z81Var;
        } else if (i10 == 11) {
            view = new org.telegram.ui.Cells.w4(viewGroup.getContext());
        } else if (i10 == 12) {
            view = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View a91Var = new a91(viewGroup.getContext(), null);
            a91Var.setWillNotDraw(false);
            a91Var.setPadding(a91Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), a91Var.getRight(), AndroidUtilities.dp(16.0f));
            view = a91Var;
        } else if (i10 == 14) {
            view = new q91(viewGroup.getContext(), w91Var.b0 ? 2 : 4);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(viewGroup.getContext());
            c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
            view = c5Var;
        } else {
            view = new org.telegram.ui.Cells.f7(viewGroup.getContext(), 0, 0);
        }
        return ic.a.n(view, view, -1, -2);
    }
}
