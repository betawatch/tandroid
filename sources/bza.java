// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bza extends q59 {
    public int d;
    public int d0;
    public final /* synthetic */ xza e0;
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
    public final st b0 = new st(0);
    public final st c0 = new st(0);

    public bza(xza xzaVar) {
        this.e0 = xzaVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 9 || i == 15;
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
        st stVar = this.c0;
        stVar.clear();
        st stVar2 = this.b0;
        stVar2.clear();
        xza xzaVar = this.e0;
        ArrayList arrayList = xzaVar.z0;
        ArrayList arrayList2 = xzaVar.Q;
        ArrayList arrayList3 = xzaVar.R;
        ArrayList arrayList4 = xzaVar.P;
        if (xzaVar.c0) {
            if (xzaVar.H != null) {
                int i = this.d0;
                this.c = i;
                this.d0 = i + 2;
                this.d = i + 1;
            }
            jza jzaVar = xzaVar.d;
            if (jzaVar != null && !jzaVar.l) {
                int i2 = this.d0;
                if (i2 > 0) {
                    this.d0 = i2 + 1;
                    stVar2.add(Integer.valueOf(i2));
                }
                int i3 = this.d0;
                this.d0 = i3 + 1;
                this.e = i3;
            }
            jza jzaVar2 = xzaVar.I;
            if (jzaVar2 != null && !jzaVar2.l) {
                int i4 = this.d0;
                if (i4 > 0) {
                    this.d0 = i4 + 1;
                    stVar2.add(Integer.valueOf(i4));
                }
                int i5 = this.d0;
                this.d0 = i5 + 1;
                this.L = i5;
            }
            jza jzaVar3 = xzaVar.J;
            if (jzaVar3 != null && !jzaVar3.l && !jzaVar3.a) {
                int i6 = this.d0;
                if (i6 > 0) {
                    this.d0 = i6 + 1;
                    stVar2.add(Integer.valueOf(i6));
                }
                int i7 = this.d0;
                this.d0 = i7 + 1;
                this.M = i7;
            }
            jza jzaVar4 = xzaVar.K;
            if (jzaVar4 != null && !jzaVar4.l && !jzaVar4.a) {
                int i8 = this.d0;
                if (i8 > 0) {
                    this.d0 = i8 + 1;
                    stVar2.add(Integer.valueOf(i8));
                }
                int i9 = this.d0;
                this.d0 = i9 + 1;
                this.N = i9;
            }
            jza jzaVar5 = xzaVar.L;
            if (jzaVar5 != null && !jzaVar5.l && !jzaVar5.a) {
                int i10 = this.d0;
                if (i10 > 0) {
                    this.d0 = i10 + 1;
                    stVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.d0;
                this.d0 = i11 + 1;
                this.O = i11;
            }
            jza jzaVar6 = xzaVar.M;
            if (jzaVar6 != null && !jzaVar6.l && !jzaVar6.a) {
                int i12 = this.d0;
                if (i12 > 0) {
                    this.d0 = i12 + 1;
                    stVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.d0;
                this.d0 = i13 + 1;
                this.P = i13;
            }
            jza jzaVar7 = xzaVar.e;
            if (jzaVar7 != null && !jzaVar7.l && !jzaVar7.a) {
                int i14 = this.d0;
                if (i14 > 0) {
                    this.d0 = i14 + 1;
                    stVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.d0;
                this.d0 = i15 + 1;
                this.n = i15;
            }
            jza jzaVar8 = xzaVar.N;
            if (jzaVar8 != null && !jzaVar8.l && !jzaVar8.a) {
                int i16 = this.d0;
                if (i16 > 0) {
                    this.d0 = i16 + 1;
                    stVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.d0;
                this.d0 = i17 + 1;
                this.Q = i17;
            }
            if (arrayList4.size() > 0) {
                int i18 = this.d0;
                if (i18 > 0) {
                    this.d0 = i18 + 1;
                    stVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.d0;
                int i20 = i19 + 1;
                this.R = i19;
                this.d0 = i19 + 2;
                this.S = i20;
                int size = arrayList4.size() + i20;
                this.T = size - 1;
                this.d0 = size;
                int size2 = arrayList4.size();
                int size3 = xzaVar.O.size();
                int i21 = this.d0;
                if (size2 != size3) {
                    this.d0 = i21 + 1;
                    this.a0 = i21;
                } else {
                    this.d0 = i21 + 1;
                    stVar.add(Integer.valueOf(i21));
                }
            }
            if (arrayList3.size() > 0) {
                int i22 = this.d0;
                if (i22 > 0) {
                    this.d0 = i22 + 1;
                    stVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.d0;
                int i24 = i23 + 1;
                this.U = i23;
                this.d0 = i23 + 2;
                this.V = i24;
                int size4 = arrayList3.size() + i24;
                this.W = size4 - 1;
                this.d0 = size4 + 1;
                stVar.add(Integer.valueOf(size4));
            }
            if (arrayList2.size() > 0) {
                int i25 = this.d0;
                if (i25 > 0) {
                    this.d0 = i25 + 1;
                    stVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.d0;
                int i27 = i26 + 1;
                this.X = i26;
                this.d0 = i26 + 2;
                this.Y = i27;
                int size5 = arrayList2.size() + i27;
                this.Z = size5 - 1;
                this.d0 = size5;
            }
            int i28 = this.d0;
            if (i28 > 0) {
                this.d0 = i28 + 1;
                stVar.add(Integer.valueOf(i28));
                int i29 = this.d0;
                this.d0 = i29 + 1;
                stVar2.add(Integer.valueOf(i29));
                return;
            }
            return;
        }
        if (xzaVar.f != null) {
            int i30 = this.d0;
            this.c = i30;
            this.d0 = i30 + 2;
            this.d = i30 + 1;
        }
        jza jzaVar9 = xzaVar.d;
        if (jzaVar9 != null && !jzaVar9.l) {
            int i31 = this.d0;
            if (i31 > 0) {
                this.d0 = i31 + 1;
                stVar2.add(Integer.valueOf(i31));
            }
            int i32 = this.d0;
            this.d0 = i32 + 1;
            this.e = i32;
        }
        jza jzaVar10 = xzaVar.h;
        if (jzaVar10 != null && !jzaVar10.l) {
            int i33 = this.d0;
            if (i33 > 0) {
                this.d0 = i33 + 1;
                stVar2.add(Integer.valueOf(i33));
            }
            int i34 = this.d0;
            this.d0 = i34 + 1;
            this.h = i34;
        }
        jza jzaVar11 = xzaVar.y;
        if (jzaVar11 != null && !jzaVar11.l) {
            int i35 = this.d0;
            if (i35 > 0) {
                this.d0 = i35 + 1;
                stVar2.add(Integer.valueOf(i35));
            }
            int i36 = this.d0;
            this.d0 = i36 + 1;
            this.E = i36;
        }
        jza jzaVar12 = xzaVar.e;
        if (jzaVar12 != null && !jzaVar12.l) {
            int i37 = this.d0;
            if (i37 > 0) {
                this.d0 = i37 + 1;
                stVar2.add(Integer.valueOf(i37));
            }
            int i38 = this.d0;
            this.d0 = i38 + 1;
            this.n = i38;
        }
        jza jzaVar13 = xzaVar.s;
        if (jzaVar13 != null && !jzaVar13.l) {
            int i39 = this.d0;
            if (i39 > 0) {
                this.d0 = i39 + 1;
                stVar2.add(Integer.valueOf(i39));
            }
            int i40 = this.d0;
            this.d0 = i40 + 1;
            this.w = i40;
        }
        jza jzaVar14 = xzaVar.w;
        if (jzaVar14 != null && !jzaVar14.l) {
            int i41 = this.d0;
            if (i41 > 0) {
                this.d0 = i41 + 1;
                stVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.d0;
            this.d0 = i42 + 1;
            this.x = i42;
        }
        jza jzaVar15 = xzaVar.x;
        if (jzaVar15 != null && !jzaVar15.l) {
            int i43 = this.d0;
            if (i43 > 0) {
                this.d0 = i43 + 1;
                stVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.d0;
            this.d0 = i44 + 1;
            this.y = i44;
        }
        jza jzaVar16 = xzaVar.n;
        if (jzaVar16 != null && !jzaVar16.l) {
            int i45 = this.d0;
            if (i45 > 0) {
                this.d0 = i45 + 1;
                stVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.d0;
            this.d0 = i46 + 1;
            this.r = i46;
        }
        jza jzaVar17 = xzaVar.r;
        if (jzaVar17 != null && !jzaVar17.k && !jzaVar17.a) {
            int i47 = this.d0;
            if (i47 > 0) {
                this.d0 = i47 + 1;
                stVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.d0;
            this.d0 = i48 + 1;
            this.s = i48;
        }
        jza jzaVar18 = xzaVar.E;
        if (jzaVar18 != null && !jzaVar18.l && !jzaVar18.a) {
            int i49 = this.d0;
            if (i49 > 0) {
                this.d0 = i49 + 1;
                stVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.d0;
            this.d0 = i50 + 1;
            this.F = i50;
        }
        jza jzaVar19 = xzaVar.F;
        if (jzaVar19 != null && !jzaVar19.l && !jzaVar19.a) {
            int i51 = this.d0;
            if (i51 > 0) {
                this.d0 = i51 + 1;
                stVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.d0;
            this.d0 = i52 + 1;
            this.G = i52;
        }
        jza jzaVar20 = xzaVar.G;
        if (jzaVar20 != null && !jzaVar20.l && !jzaVar20.a) {
            int i53 = this.d0;
            if (i53 > 0) {
                this.d0 = i53 + 1;
                stVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.d0;
            this.d0 = i54 + 1;
            this.H = i54;
        }
        int i55 = this.d0;
        this.d0 = i55 + 1;
        stVar2.add(Integer.valueOf(i55));
        if (arrayList.size() > 0) {
            int i56 = this.d0;
            int i57 = i56 + 1;
            this.I = i56;
            this.d0 = i56 + 2;
            this.J = i57;
            int size6 = arrayList.size() + i57;
            this.K = size6 - 1;
            this.d0 = size6;
            int size7 = xzaVar.w0.size();
            int size8 = xzaVar.v0.size();
            int i58 = this.d0;
            if (size7 != size8) {
                this.d0 = i58 + 1;
                this.f = i58;
            } else {
                this.d0 = i58 + 1;
                stVar.add(Integer.valueOf(i58));
            }
            int i59 = this.d0;
            this.d0 = i59 + 1;
            stVar2.add(Integer.valueOf(i59));
        }
    }

    @Override // y59
    public final int b() {
        return this.d0;
    }

    @Override // y59
    public final long c(int i) {
        if (i >= this.J && i < this.K) {
            return ((uza) this.e0.z0.get(i - r0)).b();
        }
        if (i == this.e) {
            return 1L;
        }
        if (i == this.h) {
            return 2L;
        }
        if (i == this.n) {
            return 3L;
        }
        if (i == this.r) {
            return 4L;
        }
        if (i == this.E) {
            return 5L;
        }
        if (i == this.s) {
            return 6L;
        }
        if (i == this.w) {
            return 7L;
        }
        if (i == this.x) {
            return 8L;
        }
        if (i == this.y) {
            return 9L;
        }
        if (i == this.L) {
            return 10L;
        }
        if (i == this.M) {
            return 11L;
        }
        if (i == this.N) {
            return 12L;
        }
        if (i == this.O) {
            return 13L;
        }
        if (i == this.P) {
            return 14L;
        }
        if (i == this.Q) {
            return 15L;
        }
        if (i == this.F) {
            return 16L;
        }
        if (i == this.G) {
            return 17L;
        }
        return i == this.H ? 18L : -1L;
    }

    @Override // y59
    public final int d(int i) {
        if (i == this.e || i == this.h || i == this.n || i == this.E || i == this.P || i == this.L) {
            return 0;
        }
        if (i == this.r || i == this.s || i == this.G) {
            return 1;
        }
        if (i == this.w || i == this.x || i == this.M || i == this.O || i == this.F || i == this.H) {
            return 2;
        }
        if (i == this.y || i == this.N || i == this.Q) {
            return 4;
        }
        if (i >= this.J && i <= this.K) {
            return 9;
        }
        if (i == this.f) {
            return 11;
        }
        if (this.c0.contains(Integer.valueOf(i))) {
            return 12;
        }
        if (i == this.I || i == this.c || i == this.U || i == this.R || i == this.X) {
            return 13;
        }
        if (i == this.d) {
            return 14;
        }
        if (i >= this.V && i <= this.W) {
            return 9;
        }
        if (i >= this.S && i <= this.T) {
            return 9;
        }
        if (i < this.Y || i > this.Z) {
            return i == this.a0 ? 15 : 10;
        }
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021b A[LOOP:0: B:100:0x0219->B:101:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0207  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        k47 k47Var;
        float f;
        k47 k47Var2;
        uza uzaVar;
        CharSequence charSequence;
        uza uzaVar2;
        View view = u69Var.a;
        xza xzaVar = this.e0;
        ArrayList arrayList = xzaVar.z0;
        ArrayList arrayList2 = xzaVar.P;
        boolean z = xzaVar.c0;
        int d = d(i);
        if (d >= 0 && d <= 4) {
            ((iza) view).e(this.e == i ? xzaVar.d : this.h == i ? xzaVar.h : this.r == i ? xzaVar.n : this.w == i ? xzaVar.s : this.x == i ? xzaVar.w : this.s == i ? xzaVar.r : this.n == i ? xzaVar.e : this.E == i ? xzaVar.y : this.F == i ? xzaVar.E : this.G == i ? xzaVar.F : this.H == i ? xzaVar.G : this.L == i ? xzaVar.I : this.M == i ? xzaVar.J : this.N == i ? xzaVar.K : this.O == i ? xzaVar.L : this.P == i ? xzaVar.M : this.Q == i ? xzaVar.N : xzaVar.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                pl1 pl1Var = (pl1) view;
                pl1Var.c(true);
                pl1Var.b(xzaVar.g0, xzaVar.f0);
                pl1Var.setPadding(0, gm.L(16.0f), 0, gm.L(16.0f));
                if (i == this.c) {
                    pl1Var.setTitle(jb6.M0(2131744584, "StatisticOverview"));
                    return;
                }
                if (i == this.U) {
                    pl1Var.setTitle(jb6.M0(2131743721, "TopAdmins"));
                    return;
                }
                if (i == this.X) {
                    pl1Var.setTitle(jb6.M0(2131743718, "TopInviters"));
                    return;
                } else {
                    if (i == this.R) {
                        pl1Var.setTitle(jb6.M0(2131743717, "TopMembers"));
                        return;
                    }
                    pl1Var.c(false);
                    pl1Var.setPadding(gm.L(2.0f), gm.L(15.0f), gm.L(2.0f), gm.L(6.0f));
                    pl1Var.setTitle(jb6.M0(2131746098, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((fj6) view).b(R.drawable.arrow_more, 5, jb6.G(xzaVar.O.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            rza rzaVar = (rza) view;
            if (z) {
                rzaVar.setData(xzaVar.H);
                return;
            }
            sza szaVar = xzaVar.f;
            TextView[] textViewArr = rzaVar.a;
            TextView[] textViewArr2 = rzaVar.c;
            TextView[] textViewArr3 = rzaVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < textViewArr.length; i3++) {
                switch (i3) {
                    case 0:
                        textViewArr[i2].setText(szaVar.b);
                        textViewArr3[i2].setText(szaVar.c);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.d ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.a);
                        i2++;
                        break;
                    case 1:
                        textViewArr[i2].setText(szaVar.n);
                        textViewArr3[i2].setText("");
                        textViewArr2[i2].setText(szaVar.m);
                        i2++;
                        break;
                    case 2:
                        textViewArr[i2].setText(szaVar.f);
                        textViewArr3[i2].setText(szaVar.g);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.h ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.e);
                        i2++;
                        break;
                    case 3:
                        textViewArr[i2].setText(szaVar.z);
                        textViewArr3[i2].setText(szaVar.A);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.B ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.y);
                        if (!szaVar.C) {
                            break;
                        }
                        i2++;
                        break;
                    case 4:
                        textViewArr[i2].setText(szaVar.j);
                        textViewArr3[i2].setText(szaVar.k);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.l ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.i);
                        i2++;
                        break;
                    case 5:
                        textViewArr[i2].setText(szaVar.E);
                        textViewArr3[i2].setText(szaVar.F);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.G ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.D);
                        if (!szaVar.H) {
                            break;
                        }
                        i2++;
                        break;
                    case 6:
                        textViewArr[i2].setText(szaVar.p);
                        textViewArr3[i2].setText(szaVar.q);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.r ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.o);
                        if (!szaVar.s) {
                            break;
                        }
                        i2++;
                        break;
                    case 7:
                        textViewArr[i2].setText(szaVar.u);
                        textViewArr3[i2].setText(szaVar.v);
                        textViewArr3[i2].setTag(Integer.valueOf(szaVar.w ? cmb.w6 : cmb.o7));
                        textViewArr2[i2].setText(szaVar.t);
                        if (!szaVar.x) {
                            break;
                        }
                        i2++;
                        break;
                }
            }
            while (i2 < textViewArr.length) {
                ((ViewGroup) textViewArr2[i2].getParent()).setVisibility(8);
                i2++;
            }
            for (int i4 = 0; i4 < rzaVar.getChildCount(); i4++) {
                ViewGroup viewGroup = (ViewGroup) rzaVar.getChildAt(i4);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            rzaVar.updateColors();
            return;
        }
        if (z) {
            int i5 = this.V;
            if (i >= i5 && i <= this.W) {
                ((a0b) view).setData((qza) xzaVar.R.get(i - i5));
                return;
            }
            int i6 = this.S;
            if (i >= i6 && i <= this.T) {
                ((a0b) view).setData((qza) arrayList2.get(i - i6));
                return;
            }
            int i7 = this.Y;
            if (i < i7 || i > this.Z) {
                return;
            }
            ((a0b) view).setData((qza) xzaVar.Q.get(i - i7));
            return;
        }
        int i8 = i - this.J;
        uza uzaVar3 = (uza) arrayList.get(i8);
        a0b a0bVar = (a0b) view;
        boolean z2 = i8 == arrayList.size() - 1;
        TextView textView = a0bVar.f;
        TextView textView2 = a0bVar.d;
        pc0 pc0Var = a0bVar.n;
        TLRPC.ChatFull chatFull = a0bVar.x;
        yza yzaVar = a0bVar.a;
        a0bVar.w = uzaVar3;
        a0bVar.y = !z2;
        k47 k47Var3 = uzaVar3.b;
        ArrayList arrayList3 = k47Var3.p0;
        if (arrayList3 != null) {
            k47Var = k47Var3;
            f = 1.0f;
            yzaVar.h(gn5.f(bc4.w(arrayList3, gm.Y0(false), false, null, false), k47Var3.n0), "50_50", gn5.f(bc4.w(k47Var3.p0, 50, false, null, false), k47Var3.n0), "b1", 0, k47Var);
            yzaVar.setRoundRadius(gm.L(9.0f));
            yzaVar.setScaleX(0.96f);
            yzaVar.setScaleY(0.96f);
        } else {
            k47Var = k47Var3;
            f = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                k47Var2 = k47Var;
                uzaVar = uzaVar3;
                TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(chatFull.id));
                pc0Var.p(L0);
                yzaVar.f(L0, pc0Var);
                yzaVar.setRoundRadius(gm.L(46.0f) >> 1);
                yzaVar.setScaleX(1.0f);
                yzaVar.setScaleY(1.0f);
                if (k47Var2.w4()) {
                    yzaVar.setScaleX(f);
                    yzaVar.setScaleY(f);
                    yzaVar.setRoundRadius(gm.L(46.0f) >> 1);
                }
                if (!k47Var2.I3()) {
                    charSequence = td4.q(k47Var2.y1(true).trim(), ", ", k47Var2.w1(true).trim());
                } else if (k47Var2.w4()) {
                    charSequence = jb6.M0(2131744424, null);
                } else {
                    charSequence = k47Var2.z;
                    if (charSequence == null) {
                        charSequence = k47Var2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                a0bVar.b.k(gm.J3(gm.J2(spannableStringBuilder), null));
                a0bVar.c.setText(String.format(jb6.J0(uzaVar.d(), "Views"), gm.o0(uzaVar.d(), 0)));
                uzaVar2 = uzaVar;
                Date date = new Date((uzaVar2.b != null ? 0L : r6.k.date) * 1000);
                a0bVar.e.setText(jb6.a0(null, null, 2131742446, jb6.D0().B0().format(date), jb6.D0().o0().format(date)));
                textView2.setText(gm.o0(uzaVar2.a(), 0));
                textView.setText(gm.o0(uzaVar2.c(), 0));
                textView2.setVisibility(uzaVar2.a() == 0 ? 0 : 8);
                textView.setVisibility(uzaVar2.c() == 0 ? 8 : 0);
                a0bVar.invalidate();
                if (uzaVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    a0bVar.setImageViewAction(null);
                    return;
                } else {
                    a0bVar.setImageViewAction(new r39(this, uzaVar2, (byte) 19));
                    return;
                }
            }
            yzaVar.n(gn5.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, a0bVar.x);
            yzaVar.setRoundRadius(gm.L(46.0f) >> 1);
            yzaVar.setScaleX(0.96f);
            yzaVar.setScaleY(0.96f);
        }
        uzaVar = uzaVar3;
        k47Var2 = k47Var;
        if (k47Var2.w4()) {
        }
        if (!k47Var2.I3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        a0bVar.b.k(gm.J3(gm.J2(spannableStringBuilder2), null));
        a0bVar.c.setText(String.format(jb6.J0(uzaVar.d(), "Views"), gm.o0(uzaVar.d(), 0)));
        uzaVar2 = uzaVar;
        Date date2 = new Date((uzaVar2.b != null ? 0L : r6.k.date) * 1000);
        a0bVar.e.setText(jb6.a0(null, null, 2131742446, jb6.D0().B0().format(date2), jb6.D0().o0().format(date2)));
        textView2.setText(gm.o0(uzaVar2.a(), 0));
        textView.setText(gm.o0(uzaVar2.c(), 0));
        textView2.setVisibility(uzaVar2.a() == 0 ? 0 : 8);
        textView.setVisibility(uzaVar2.c() == 0 ? 8 : 0);
        a0bVar.invalidate();
        if (uzaVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        xza xzaVar = this.e0;
        if (i >= 0 && i <= 4) {
            Context context = viewGroup.getContext();
            i2 = ((d) xzaVar).currentAccount;
            View yyaVar = new yya(xzaVar, context, i2, i, xzaVar.a0);
            yyaVar.setWillNotDraw(false);
            view = yyaVar;
        } else if (i == 9) {
            View zyaVar = new zya(viewGroup.getContext(), xzaVar.a, xzaVar.getResourceProvider());
            zyaVar.setWillNotDraw(false);
            view = zyaVar;
        } else if (i == 11) {
            view = new pa6(viewGroup.getContext());
        } else if (i == 12) {
            view = new j34(viewGroup.getContext(), gm.L(15.0f));
        } else if (i == 13) {
            View azaVar = new aza(viewGroup.getContext(), null);
            azaVar.setWillNotDraw(false);
            azaVar.setPadding(azaVar.getPaddingLeft(), gm.L(16.0f), azaVar.getRight(), gm.L(16.0f));
            view = azaVar;
        } else if (i == 14) {
            view = new rza(viewGroup.getContext(), xzaVar.c0 ? 2 : 4);
        } else if (i == 15) {
            fj6 fj6Var = new fj6(viewGroup.getContext());
            fj6Var.a(cmb.u6, cmb.t6);
            view = fj6Var;
        } else {
            view = new bba(viewGroup.getContext(), 0, 0);
        }
        return kt6.h(view, view, -1, -2);
    }
}
