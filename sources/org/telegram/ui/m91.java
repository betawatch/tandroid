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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m91 extends org.telegram.ui.Components.sl0 {
    public int Z;
    public final /* synthetic */ ha1 a0;
    public int d;
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
    public int B = -1;
    public int C = -1;
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
    public final a0.g X = new a0.g(0);
    public final a0.g Y = new a0.g(0);

    public m91(ha1 ha1Var) {
        this.a0 = ha1Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 9 || i10 == 15;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.r = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.F = -1;
        this.G = -1;
        this.f = -1;
        this.E = -1;
        this.s = -1;
        this.n = -1;
        this.y = -1;
        this.D = -1;
        this.C = -1;
        this.B = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
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
        this.Z = 0;
        a0.g gVar = this.Y;
        gVar.clear();
        a0.g gVar2 = this.X;
        gVar2.clear();
        ha1 ha1Var = this.a0;
        ArrayList arrayList = ha1Var.s0;
        ArrayList arrayList2 = ha1Var.M;
        ArrayList arrayList3 = ha1Var.N;
        ArrayList arrayList4 = ha1Var.L;
        if (ha1Var.Z) {
            if (ha1Var.D != null) {
                int i10 = this.Z;
                this.c = i10;
                this.Z = i10 + 2;
                this.d = i10 + 1;
            }
            t91 t91Var = ha1Var.d;
            if (t91Var != null && !t91Var.l) {
                int i11 = this.Z;
                if (i11 > 0) {
                    this.Z = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.Z;
                this.Z = i12 + 1;
                this.e = i12;
            }
            t91 t91Var2 = ha1Var.E;
            if (t91Var2 != null && !t91Var2.l) {
                int i13 = this.Z;
                if (i13 > 0) {
                    this.Z = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.Z;
                this.Z = i14 + 1;
                this.H = i14;
            }
            t91 t91Var3 = ha1Var.F;
            if (t91Var3 != null && !t91Var3.l && !t91Var3.a) {
                int i15 = this.Z;
                if (i15 > 0) {
                    this.Z = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.Z;
                this.Z = i16 + 1;
                this.I = i16;
            }
            t91 t91Var4 = ha1Var.G;
            if (t91Var4 != null && !t91Var4.l && !t91Var4.a) {
                int i17 = this.Z;
                if (i17 > 0) {
                    this.Z = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.Z;
                this.Z = i18 + 1;
                this.J = i18;
            }
            t91 t91Var5 = ha1Var.H;
            if (t91Var5 != null && !t91Var5.l && !t91Var5.a) {
                int i19 = this.Z;
                if (i19 > 0) {
                    this.Z = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.Z;
                this.Z = i20 + 1;
                this.K = i20;
            }
            t91 t91Var6 = ha1Var.I;
            if (t91Var6 != null && !t91Var6.l && !t91Var6.a) {
                int i21 = this.Z;
                if (i21 > 0) {
                    this.Z = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.Z;
                this.Z = i22 + 1;
                this.L = i22;
            }
            t91 t91Var7 = ha1Var.e;
            if (t91Var7 != null && !t91Var7.l && !t91Var7.a) {
                int i23 = this.Z;
                if (i23 > 0) {
                    this.Z = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.Z;
                this.Z = i24 + 1;
                this.n = i24;
            }
            t91 t91Var8 = ha1Var.J;
            if (t91Var8 != null && !t91Var8.l && !t91Var8.a) {
                int i25 = this.Z;
                if (i25 > 0) {
                    this.Z = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.Z;
                this.Z = i26 + 1;
                this.M = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.Z;
                if (i27 > 0) {
                    this.Z = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.Z;
                int i29 = i28 + 1;
                this.N = i28;
                this.Z = i28 + 2;
                this.O = i29;
                int size = arrayList4.size() + i29;
                this.P = size - 1;
                this.Z = size;
                if (arrayList4.size() != ha1Var.K.size()) {
                    int i30 = this.Z;
                    this.Z = i30 + 1;
                    this.W = i30;
                } else {
                    int i31 = this.Z;
                    this.Z = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.Z;
                if (i32 > 0) {
                    this.Z = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.Z;
                int i34 = i33 + 1;
                this.Q = i33;
                this.Z = i33 + 2;
                this.R = i34;
                int size2 = arrayList3.size() + i34;
                this.S = size2 - 1;
                this.Z = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.Z;
                if (i35 > 0) {
                    this.Z = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.Z;
                int i37 = i36 + 1;
                this.T = i36;
                this.Z = i36 + 2;
                this.U = i37;
                int size3 = arrayList2.size() + i37;
                this.V = size3 - 1;
                this.Z = size3;
            }
            int i38 = this.Z;
            if (i38 > 0) {
                this.Z = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.Z;
                this.Z = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (ha1Var.f != null) {
            int i40 = this.Z;
            this.c = i40;
            this.Z = i40 + 2;
            this.d = i40 + 1;
        }
        t91 t91Var9 = ha1Var.d;
        if (t91Var9 != null && !t91Var9.l) {
            int i41 = this.Z;
            if (i41 > 0) {
                this.Z = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.Z;
            this.Z = i42 + 1;
            this.e = i42;
        }
        t91 t91Var10 = ha1Var.h;
        if (t91Var10 != null && !t91Var10.l) {
            int i43 = this.Z;
            if (i43 > 0) {
                this.Z = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.Z;
            this.Z = i44 + 1;
            this.h = i44;
        }
        t91 t91Var11 = ha1Var.x;
        if (t91Var11 != null && !t91Var11.l) {
            int i45 = this.Z;
            if (i45 > 0) {
                this.Z = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.Z;
            this.Z = i46 + 1;
            this.y = i46;
        }
        t91 t91Var12 = ha1Var.e;
        if (t91Var12 != null && !t91Var12.l) {
            int i47 = this.Z;
            if (i47 > 0) {
                this.Z = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.Z;
            this.Z = i48 + 1;
            this.n = i48;
        }
        t91 t91Var13 = ha1Var.s;
        if (t91Var13 != null && !t91Var13.l) {
            int i49 = this.Z;
            if (i49 > 0) {
                this.Z = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.Z;
            this.Z = i50 + 1;
            this.v = i50;
        }
        t91 t91Var14 = ha1Var.v;
        if (t91Var14 != null && !t91Var14.l) {
            int i51 = this.Z;
            if (i51 > 0) {
                this.Z = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.Z;
            this.Z = i52 + 1;
            this.w = i52;
        }
        t91 t91Var15 = ha1Var.w;
        if (t91Var15 != null && !t91Var15.l) {
            int i53 = this.Z;
            if (i53 > 0) {
                this.Z = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.Z;
            this.Z = i54 + 1;
            this.x = i54;
        }
        t91 t91Var16 = ha1Var.n;
        if (t91Var16 != null && !t91Var16.l) {
            int i55 = this.Z;
            if (i55 > 0) {
                this.Z = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.Z;
            this.Z = i56 + 1;
            this.r = i56;
        }
        t91 t91Var17 = ha1Var.r;
        if (t91Var17 != null && !t91Var17.k && !t91Var17.a) {
            int i57 = this.Z;
            if (i57 > 0) {
                this.Z = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.Z;
            this.Z = i58 + 1;
            this.s = i58;
        }
        t91 t91Var18 = ha1Var.y;
        if (t91Var18 != null && !t91Var18.l && !t91Var18.a) {
            int i59 = this.Z;
            if (i59 > 0) {
                this.Z = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.Z;
            this.Z = i60 + 1;
            this.B = i60;
        }
        t91 t91Var19 = ha1Var.B;
        if (t91Var19 != null && !t91Var19.l && !t91Var19.a) {
            int i61 = this.Z;
            if (i61 > 0) {
                this.Z = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.Z;
            this.Z = i62 + 1;
            this.C = i62;
        }
        t91 t91Var20 = ha1Var.C;
        if (t91Var20 != null && !t91Var20.l && !t91Var20.a) {
            int i63 = this.Z;
            if (i63 > 0) {
                this.Z = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.Z;
            this.Z = i64 + 1;
            this.D = i64;
        }
        int i65 = this.Z;
        this.Z = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.Z;
            int i67 = i66 + 1;
            this.E = i66;
            this.Z = i66 + 2;
            this.F = i67;
            int size4 = arrayList.size() + i67;
            this.G = size4 - 1;
            this.Z = size4;
            if (ha1Var.p0.size() != ha1Var.o0.size()) {
                int i68 = this.Z;
                this.Z = i68 + 1;
                this.f = i68;
            } else {
                int i69 = this.Z;
                this.Z = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.Z;
            this.Z = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.Z;
    }

    @Override // f2.p0
    public final long i(int i10) {
        if (i10 >= this.F && i10 < this.G) {
            return ((ea1) this.a0.s0.get(i10 - r0)).b();
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
        if (i10 == this.H) {
            return 10L;
        }
        if (i10 == this.I) {
            return 11L;
        }
        if (i10 == this.J) {
            return 12L;
        }
        if (i10 == this.K) {
            return 13L;
        }
        if (i10 == this.L) {
            return 14L;
        }
        if (i10 == this.M) {
            return 15L;
        }
        if (i10 == this.B) {
            return 16L;
        }
        if (i10 == this.C) {
            return 17L;
        }
        return i10 == this.D ? 18L : -1L;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == this.e || i10 == this.h || i10 == this.n || i10 == this.y || i10 == this.L || i10 == this.H) {
            return 0;
        }
        if (i10 == this.r || i10 == this.s || i10 == this.C) {
            return 1;
        }
        if (i10 == this.v || i10 == this.w || i10 == this.I || i10 == this.K || i10 == this.B || i10 == this.D) {
            return 2;
        }
        if (i10 == this.x || i10 == this.J || i10 == this.M) {
            return 4;
        }
        if (i10 >= this.F && i10 <= this.G) {
            return 9;
        }
        if (i10 == this.f) {
            return 11;
        }
        if (this.Y.contains(Integer.valueOf(i10))) {
            return 12;
        }
        if (i10 == this.E || i10 == this.c || i10 == this.Q || i10 == this.N || i10 == this.T) {
            return 13;
        }
        if (i10 == this.d) {
            return 14;
        }
        if ((i10 < this.R || i10 > this.S) && ((i10 < this.O || i10 > this.P) && (i10 < this.U || i10 > this.V))) {
            return i10 == this.W ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021f A[LOOP:0: B:100:0x021d->B:101:0x021f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        MessageObject messageObject;
        float f10;
        MessageObject messageObject2;
        int i11;
        CharSequence charSequence;
        View view = m1Var.a;
        ha1 ha1Var = this.a0;
        ArrayList arrayList = ha1Var.s0;
        ArrayList arrayList2 = ha1Var.L;
        boolean z4 = ha1Var.Z;
        int j10 = j(i10);
        if (j10 >= 0 && j10 <= 4) {
            ((s91) view).e(this.e == i10 ? ha1Var.d : this.h == i10 ? ha1Var.h : this.r == i10 ? ha1Var.n : this.v == i10 ? ha1Var.s : this.w == i10 ? ha1Var.v : this.s == i10 ? ha1Var.r : this.n == i10 ? ha1Var.e : this.y == i10 ? ha1Var.x : this.B == i10 ? ha1Var.y : this.C == i10 ? ha1Var.B : this.D == i10 ? ha1Var.C : this.H == i10 ? ha1Var.E : this.I == i10 ? ha1Var.F : this.J == i10 ? ha1Var.G : this.K == i10 ? ha1Var.H : this.L == i10 ? ha1Var.I : this.M == i10 ? ha1Var.J : ha1Var.w, false);
            return;
        }
        if (j10 != 9) {
            if (j10 == 13) {
                yf.c cVar = (yf.c) view;
                cVar.c(true);
                cVar.b(ha1Var.d0, ha1Var.c0);
                cVar.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                if (i10 == this.c) {
                    cVar.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                    return;
                }
                if (i10 == this.Q) {
                    cVar.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                    return;
                }
                if (i10 == this.T) {
                    cVar.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                    return;
                } else {
                    if (i10 == this.N) {
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
                    ((org.telegram.ui.Cells.y4) view).b(LocaleController.formatPluralString("ShowVotes", ha1Var.K.size() - arrayList2.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            ba1 ba1Var = (ba1) view;
            if (z4) {
                ba1Var.setData(ha1Var.D);
                return;
            }
            ca1 ca1Var = ha1Var.f;
            TextView[] textViewArr = ba1Var.a;
            TextView[] textViewArr2 = ba1Var.c;
            TextView[] textViewArr3 = ba1Var.b;
            int i12 = 0;
            for (int i13 = 0; i13 < textViewArr.length; i13++) {
                switch (i13) {
                    case 0:
                        textViewArr[i12].setText(ca1Var.b);
                        textViewArr3[i12].setText(ca1Var.c);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.d ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.a);
                        i12++;
                        break;
                    case 1:
                        textViewArr[i12].setText(ca1Var.n);
                        textViewArr3[i12].setText("");
                        textViewArr2[i12].setText(ca1Var.m);
                        i12++;
                        break;
                    case 2:
                        textViewArr[i12].setText(ca1Var.f);
                        textViewArr3[i12].setText(ca1Var.g);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.h ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.e);
                        i12++;
                        break;
                    case 3:
                        textViewArr[i12].setText(ca1Var.z);
                        textViewArr3[i12].setText(ca1Var.A);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.B ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.y);
                        if (!ca1Var.C) {
                            break;
                        }
                        i12++;
                        break;
                    case 4:
                        textViewArr[i12].setText(ca1Var.j);
                        textViewArr3[i12].setText(ca1Var.k);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.l ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.i);
                        i12++;
                        break;
                    case 5:
                        textViewArr[i12].setText(ca1Var.E);
                        textViewArr3[i12].setText(ca1Var.F);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.G ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.D);
                        if (!ca1Var.H) {
                            break;
                        }
                        i12++;
                        break;
                    case 6:
                        textViewArr[i12].setText(ca1Var.p);
                        textViewArr3[i12].setText(ca1Var.q);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.r ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.o);
                        if (!ca1Var.s) {
                            break;
                        }
                        i12++;
                        break;
                    case 7:
                        textViewArr[i12].setText(ca1Var.u);
                        textViewArr3[i12].setText(ca1Var.v);
                        textViewArr3[i12].setTag(Integer.valueOf(ca1Var.w ? org.telegram.ui.ActionBar.k6.x6 : org.telegram.ui.ActionBar.k6.p7));
                        textViewArr2[i12].setText(ca1Var.t);
                        if (!ca1Var.x) {
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
            for (int i14 = 0; i14 < ba1Var.getChildCount(); i14++) {
                ViewGroup viewGroup = (ViewGroup) ba1Var.getChildAt(i14);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            ba1Var.b();
            return;
        }
        if (z4) {
            int i15 = this.R;
            if (i10 >= i15 && i10 <= this.S) {
                ((org.telegram.ui.Cells.a8) view).setData((aa1) ha1Var.N.get(i10 - i15));
                return;
            }
            int i16 = this.O;
            if (i10 >= i16 && i10 <= this.P) {
                ((org.telegram.ui.Cells.a8) view).setData((aa1) arrayList2.get(i10 - i16));
                return;
            }
            int i17 = this.U;
            if (i10 < i17 || i10 > this.V) {
                return;
            }
            ((org.telegram.ui.Cells.a8) view).setData((aa1) ha1Var.M.get(i10 - i17));
            return;
        }
        int i18 = i10 - this.F;
        ea1 ea1Var = (ea1) arrayList.get(i18);
        org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
        boolean z10 = i18 == arrayList.size() - 1;
        TextView textView = a8Var.f;
        TextView textView2 = a8Var.d;
        org.telegram.ui.Components.z8 z8Var = a8Var.n;
        TLRPC.ChatFull chatFull = a8Var.w;
        org.telegram.ui.Cells.y7 y7Var = a8Var.a;
        a8Var.v = ea1Var;
        a8Var.x = !z10;
        MessageObject messageObject3 = ea1Var.b;
        ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject3.photoThumbs;
        if (arrayList3 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 50);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject3.photoThumbsObject);
            ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject);
            messageObject = messageObject3;
            f10 = 1.0f;
            y7Var.j(forObject, "50_50", forObject2, "b1", 0, messageObject);
            y7Var.setRoundRadius(AndroidUtilities.dp(9.0f));
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        } else {
            messageObject = messageObject3;
            f10 = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                messageObject2 = messageObject;
                i11 = 1;
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                z8Var.q(chat);
                y7Var.e(chat, z8Var);
                y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                y7Var.setScaleX(1.0f);
                y7Var.setScaleY(1.0f);
                if (messageObject2.isStory()) {
                    y7Var.setScaleX(f10);
                    y7Var.setScaleY(f10);
                    y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> i11);
                }
                if (!messageObject2.isMusic()) {
                    charSequence = android.support.v4.media.a.z(messageObject2.getMusicTitle().trim(), ", ", messageObject2.getMusicAuthor().trim());
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
                a8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView3 = a8Var.c;
                String pluralString = LocaleController.getPluralString("Views", ea1Var.d());
                Object[] objArr = new Object[i11];
                objArr[0] = AndroidUtilities.formatWholeNumber(ea1Var.d(), 0);
                textView3.setText(String.format(pluralString, objArr));
                Date date = new Date((ea1Var.b != null ? 0L : r6.messageOwner.date) * 1000);
                a8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                textView2.setText(AndroidUtilities.formatWholeNumber(ea1Var.a(), 0));
                textView.setText(AndroidUtilities.formatWholeNumber(ea1Var.c(), 0));
                textView2.setVisibility(ea1Var.a() == 0 ? 0 : 8);
                textView.setVisibility(ea1Var.c() == 0 ? 8 : 0);
                a8Var.invalidate();
                if (ea1Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    a8Var.setImageViewAction(null);
                    return;
                } else {
                    a8Var.setImageViewAction(new hb0(21, this, ea1Var));
                    return;
                }
            }
            y7Var.i(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, a8Var.w);
            y7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
            y7Var.setScaleX(0.96f);
            y7Var.setScaleY(0.96f);
        }
        messageObject2 = messageObject;
        i11 = 1;
        if (messageObject2.isStory()) {
        }
        if (!messageObject2.isMusic()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r9 < r7) {
        }
        a8Var.b.k(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder2), null));
        TextView textView32 = a8Var.c;
        String pluralString2 = LocaleController.getPluralString("Views", ea1Var.d());
        Object[] objArr2 = new Object[i11];
        objArr2[0] = AndroidUtilities.formatWholeNumber(ea1Var.d(), 0);
        textView32.setText(String.format(pluralString2, objArr2));
        Date date2 = new Date((ea1Var.b != null ? 0L : r6.messageOwner.date) * 1000);
        a8Var.e.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        textView2.setText(AndroidUtilities.formatWholeNumber(ea1Var.a(), 0));
        textView.setText(AndroidUtilities.formatWholeNumber(ea1Var.c(), 0));
        textView2.setVisibility(ea1Var.a() == 0 ? 0 : 8);
        textView.setVisibility(ea1Var.c() == 0 ? 8 : 0);
        a8Var.invalidate();
        if (ea1Var.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        ha1 ha1Var = this.a0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.p2) ha1Var).currentAccount;
            View j91Var = new j91(ha1Var, context, i11, i10, ha1Var.X);
            j91Var.setWillNotDraw(false);
            view = j91Var;
        } else if (i10 == 9) {
            View k91Var = new k91(viewGroup.getContext(), ha1Var.a, ha1Var.getResourceProvider());
            k91Var.setWillNotDraw(false);
            view = k91Var;
        } else if (i10 == 11) {
            view = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i10 == 12) {
            view = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View l91Var = new l91(viewGroup.getContext(), null);
            l91Var.setWillNotDraw(false);
            l91Var.setPadding(l91Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), l91Var.getRight(), AndroidUtilities.dp(16.0f));
            view = l91Var;
        } else if (i10 == 14) {
            view = new ba1(viewGroup.getContext(), ha1Var.Z ? 2 : 4);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            view = y4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
        }
        return yh.o(view, view, -1, -2);
    }
}
