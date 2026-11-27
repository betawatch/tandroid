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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b1b extends c79 {
    public int d;
    public int d0;
    public final /* synthetic */ w1b e0;
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
    public final ss b0 = new ss(0);
    public final ss c0 = new ss(0);

    public b1b(w1b w1bVar) {
        this.e0 = w1bVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        ss ssVar = this.c0;
        ssVar.clear();
        ss ssVar2 = this.b0;
        ssVar2.clear();
        w1b w1bVar = this.e0;
        ArrayList arrayList = w1bVar.z0;
        ArrayList arrayList2 = w1bVar.Q;
        ArrayList arrayList3 = w1bVar.R;
        ArrayList arrayList4 = w1bVar.P;
        if (w1bVar.c0) {
            if (w1bVar.H != null) {
                int i = this.d0;
                this.c = i;
                this.d0 = i + 2;
                this.d = i + 1;
            }
            i1b i1bVar = w1bVar.d;
            if (i1bVar != null && !i1bVar.l) {
                int i2 = this.d0;
                if (i2 > 0) {
                    this.d0 = i2 + 1;
                    ssVar2.add(Integer.valueOf(i2));
                }
                int i3 = this.d0;
                this.d0 = i3 + 1;
                this.e = i3;
            }
            i1b i1bVar2 = w1bVar.I;
            if (i1bVar2 != null && !i1bVar2.l) {
                int i4 = this.d0;
                if (i4 > 0) {
                    this.d0 = i4 + 1;
                    ssVar2.add(Integer.valueOf(i4));
                }
                int i5 = this.d0;
                this.d0 = i5 + 1;
                this.L = i5;
            }
            i1b i1bVar3 = w1bVar.J;
            if (i1bVar3 != null && !i1bVar3.l && !i1bVar3.a) {
                int i6 = this.d0;
                if (i6 > 0) {
                    this.d0 = i6 + 1;
                    ssVar2.add(Integer.valueOf(i6));
                }
                int i7 = this.d0;
                this.d0 = i7 + 1;
                this.M = i7;
            }
            i1b i1bVar4 = w1bVar.K;
            if (i1bVar4 != null && !i1bVar4.l && !i1bVar4.a) {
                int i8 = this.d0;
                if (i8 > 0) {
                    this.d0 = i8 + 1;
                    ssVar2.add(Integer.valueOf(i8));
                }
                int i9 = this.d0;
                this.d0 = i9 + 1;
                this.N = i9;
            }
            i1b i1bVar5 = w1bVar.L;
            if (i1bVar5 != null && !i1bVar5.l && !i1bVar5.a) {
                int i10 = this.d0;
                if (i10 > 0) {
                    this.d0 = i10 + 1;
                    ssVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.d0;
                this.d0 = i11 + 1;
                this.O = i11;
            }
            i1b i1bVar6 = w1bVar.M;
            if (i1bVar6 != null && !i1bVar6.l && !i1bVar6.a) {
                int i12 = this.d0;
                if (i12 > 0) {
                    this.d0 = i12 + 1;
                    ssVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.d0;
                this.d0 = i13 + 1;
                this.P = i13;
            }
            i1b i1bVar7 = w1bVar.e;
            if (i1bVar7 != null && !i1bVar7.l && !i1bVar7.a) {
                int i14 = this.d0;
                if (i14 > 0) {
                    this.d0 = i14 + 1;
                    ssVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.d0;
                this.d0 = i15 + 1;
                this.n = i15;
            }
            i1b i1bVar8 = w1bVar.N;
            if (i1bVar8 != null && !i1bVar8.l && !i1bVar8.a) {
                int i16 = this.d0;
                if (i16 > 0) {
                    this.d0 = i16 + 1;
                    ssVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.d0;
                this.d0 = i17 + 1;
                this.Q = i17;
            }
            if (arrayList4.size() > 0) {
                int i18 = this.d0;
                if (i18 > 0) {
                    this.d0 = i18 + 1;
                    ssVar2.add(Integer.valueOf(i18));
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
                int size3 = w1bVar.O.size();
                int i21 = this.d0;
                if (size2 != size3) {
                    this.d0 = i21 + 1;
                    this.a0 = i21;
                } else {
                    this.d0 = i21 + 1;
                    ssVar.add(Integer.valueOf(i21));
                }
            }
            if (arrayList3.size() > 0) {
                int i22 = this.d0;
                if (i22 > 0) {
                    this.d0 = i22 + 1;
                    ssVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.d0;
                int i24 = i23 + 1;
                this.U = i23;
                this.d0 = i23 + 2;
                this.V = i24;
                int size4 = arrayList3.size() + i24;
                this.W = size4 - 1;
                this.d0 = size4 + 1;
                ssVar.add(Integer.valueOf(size4));
            }
            if (arrayList2.size() > 0) {
                int i25 = this.d0;
                if (i25 > 0) {
                    this.d0 = i25 + 1;
                    ssVar2.add(Integer.valueOf(i25));
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
                ssVar.add(Integer.valueOf(i28));
                int i29 = this.d0;
                this.d0 = i29 + 1;
                ssVar2.add(Integer.valueOf(i29));
                return;
            }
            return;
        }
        if (w1bVar.f != null) {
            int i30 = this.d0;
            this.c = i30;
            this.d0 = i30 + 2;
            this.d = i30 + 1;
        }
        i1b i1bVar9 = w1bVar.d;
        if (i1bVar9 != null && !i1bVar9.l) {
            int i31 = this.d0;
            if (i31 > 0) {
                this.d0 = i31 + 1;
                ssVar2.add(Integer.valueOf(i31));
            }
            int i32 = this.d0;
            this.d0 = i32 + 1;
            this.e = i32;
        }
        i1b i1bVar10 = w1bVar.h;
        if (i1bVar10 != null && !i1bVar10.l) {
            int i33 = this.d0;
            if (i33 > 0) {
                this.d0 = i33 + 1;
                ssVar2.add(Integer.valueOf(i33));
            }
            int i34 = this.d0;
            this.d0 = i34 + 1;
            this.h = i34;
        }
        i1b i1bVar11 = w1bVar.y;
        if (i1bVar11 != null && !i1bVar11.l) {
            int i35 = this.d0;
            if (i35 > 0) {
                this.d0 = i35 + 1;
                ssVar2.add(Integer.valueOf(i35));
            }
            int i36 = this.d0;
            this.d0 = i36 + 1;
            this.E = i36;
        }
        i1b i1bVar12 = w1bVar.e;
        if (i1bVar12 != null && !i1bVar12.l) {
            int i37 = this.d0;
            if (i37 > 0) {
                this.d0 = i37 + 1;
                ssVar2.add(Integer.valueOf(i37));
            }
            int i38 = this.d0;
            this.d0 = i38 + 1;
            this.n = i38;
        }
        i1b i1bVar13 = w1bVar.s;
        if (i1bVar13 != null && !i1bVar13.l) {
            int i39 = this.d0;
            if (i39 > 0) {
                this.d0 = i39 + 1;
                ssVar2.add(Integer.valueOf(i39));
            }
            int i40 = this.d0;
            this.d0 = i40 + 1;
            this.w = i40;
        }
        i1b i1bVar14 = w1bVar.w;
        if (i1bVar14 != null && !i1bVar14.l) {
            int i41 = this.d0;
            if (i41 > 0) {
                this.d0 = i41 + 1;
                ssVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.d0;
            this.d0 = i42 + 1;
            this.x = i42;
        }
        i1b i1bVar15 = w1bVar.x;
        if (i1bVar15 != null && !i1bVar15.l) {
            int i43 = this.d0;
            if (i43 > 0) {
                this.d0 = i43 + 1;
                ssVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.d0;
            this.d0 = i44 + 1;
            this.y = i44;
        }
        i1b i1bVar16 = w1bVar.n;
        if (i1bVar16 != null && !i1bVar16.l) {
            int i45 = this.d0;
            if (i45 > 0) {
                this.d0 = i45 + 1;
                ssVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.d0;
            this.d0 = i46 + 1;
            this.r = i46;
        }
        i1b i1bVar17 = w1bVar.r;
        if (i1bVar17 != null && !i1bVar17.k && !i1bVar17.a) {
            int i47 = this.d0;
            if (i47 > 0) {
                this.d0 = i47 + 1;
                ssVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.d0;
            this.d0 = i48 + 1;
            this.s = i48;
        }
        i1b i1bVar18 = w1bVar.E;
        if (i1bVar18 != null && !i1bVar18.l && !i1bVar18.a) {
            int i49 = this.d0;
            if (i49 > 0) {
                this.d0 = i49 + 1;
                ssVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.d0;
            this.d0 = i50 + 1;
            this.F = i50;
        }
        i1b i1bVar19 = w1bVar.F;
        if (i1bVar19 != null && !i1bVar19.l && !i1bVar19.a) {
            int i51 = this.d0;
            if (i51 > 0) {
                this.d0 = i51 + 1;
                ssVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.d0;
            this.d0 = i52 + 1;
            this.G = i52;
        }
        i1b i1bVar20 = w1bVar.G;
        if (i1bVar20 != null && !i1bVar20.l && !i1bVar20.a) {
            int i53 = this.d0;
            if (i53 > 0) {
                this.d0 = i53 + 1;
                ssVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.d0;
            this.d0 = i54 + 1;
            this.H = i54;
        }
        int i55 = this.d0;
        this.d0 = i55 + 1;
        ssVar2.add(Integer.valueOf(i55));
        if (arrayList.size() > 0) {
            int i56 = this.d0;
            int i57 = i56 + 1;
            this.I = i56;
            this.d0 = i56 + 2;
            this.J = i57;
            int size6 = arrayList.size() + i57;
            this.K = size6 - 1;
            this.d0 = size6;
            int size7 = w1bVar.w0.size();
            int size8 = w1bVar.v0.size();
            int i58 = this.d0;
            if (size7 != size8) {
                this.d0 = i58 + 1;
                this.f = i58;
            } else {
                this.d0 = i58 + 1;
                ssVar.add(Integer.valueOf(i58));
            }
            int i59 = this.d0;
            this.d0 = i59 + 1;
            ssVar2.add(Integer.valueOf(i59));
        }
    }

    @Override // j79
    public final int b() {
        return this.d0;
    }

    @Override // j79
    public final long c(int i) {
        if (i >= this.J && i < this.K) {
            return ((t1b) this.e0.z0.get(i - r0)).b();
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

    @Override // j79
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        r47 r47Var;
        float f;
        r47 r47Var2;
        t1b t1bVar;
        CharSequence charSequence;
        t1b t1bVar2;
        View view = f89Var.a;
        w1b w1bVar = this.e0;
        ArrayList arrayList = w1bVar.z0;
        ArrayList arrayList2 = w1bVar.P;
        boolean z = w1bVar.c0;
        int d = d(i);
        if (d >= 0 && d <= 4) {
            ((h1b) view).e(this.e == i ? w1bVar.d : this.h == i ? w1bVar.h : this.r == i ? w1bVar.n : this.w == i ? w1bVar.s : this.x == i ? w1bVar.w : this.s == i ? w1bVar.r : this.n == i ? w1bVar.e : this.E == i ? w1bVar.y : this.F == i ? w1bVar.E : this.G == i ? w1bVar.F : this.H == i ? w1bVar.G : this.L == i ? w1bVar.I : this.M == i ? w1bVar.J : this.N == i ? w1bVar.K : this.O == i ? w1bVar.L : this.P == i ? w1bVar.M : this.Q == i ? w1bVar.N : w1bVar.x, false);
            return;
        }
        if (d != 9) {
            if (d == 13) {
                qk1 qk1Var = (qk1) view;
                qk1Var.c(true);
                qk1Var.b(w1bVar.g0, w1bVar.f0);
                qk1Var.setPadding(0, hl.L(16.0f), 0, hl.L(16.0f));
                if (i == this.c) {
                    qk1Var.setTitle(ob6.M0(2131744552, "StatisticOverview"));
                    return;
                }
                if (i == this.U) {
                    qk1Var.setTitle(ob6.M0(2131743689, "TopAdmins"));
                    return;
                }
                if (i == this.X) {
                    qk1Var.setTitle(ob6.M0(2131743686, "TopInviters"));
                    return;
                } else {
                    if (i == this.R) {
                        qk1Var.setTitle(ob6.M0(2131743685, "TopMembers"));
                        return;
                    }
                    qk1Var.c(false);
                    qk1Var.setPadding(hl.L(2.0f), hl.L(15.0f), hl.L(2.0f), hl.L(6.0f));
                    qk1Var.setTitle(ob6.M0(2131746092, "RecentPostsCapitalize"));
                    return;
                }
            }
            if (d != 14) {
                if (d == 15) {
                    ((ij6) view).b(R.drawable.arrow_more, 5, ob6.G(w1bVar.O.size() - arrayList2.size(), "ShowVotes", new Object[0]), false);
                    return;
                }
                return;
            }
            q1b q1bVar = (q1b) view;
            if (z) {
                q1bVar.setData(w1bVar.H);
                return;
            }
            r1b r1bVar = w1bVar.f;
            TextView[] textViewArr = q1bVar.a;
            TextView[] textViewArr2 = q1bVar.c;
            TextView[] textViewArr3 = q1bVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < textViewArr.length; i3++) {
                switch (i3) {
                    case 0:
                        textViewArr[i2].setText(r1bVar.b);
                        textViewArr3[i2].setText(r1bVar.c);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.d ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.a);
                        i2++;
                        break;
                    case 1:
                        textViewArr[i2].setText(r1bVar.n);
                        textViewArr3[i2].setText("");
                        textViewArr2[i2].setText(r1bVar.m);
                        i2++;
                        break;
                    case 2:
                        textViewArr[i2].setText(r1bVar.f);
                        textViewArr3[i2].setText(r1bVar.g);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.h ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.e);
                        i2++;
                        break;
                    case 3:
                        textViewArr[i2].setText(r1bVar.z);
                        textViewArr3[i2].setText(r1bVar.A);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.B ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.y);
                        if (!r1bVar.C) {
                            break;
                        }
                        i2++;
                        break;
                    case 4:
                        textViewArr[i2].setText(r1bVar.j);
                        textViewArr3[i2].setText(r1bVar.k);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.l ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.i);
                        i2++;
                        break;
                    case 5:
                        textViewArr[i2].setText(r1bVar.E);
                        textViewArr3[i2].setText(r1bVar.F);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.G ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.D);
                        if (!r1bVar.H) {
                            break;
                        }
                        i2++;
                        break;
                    case 6:
                        textViewArr[i2].setText(r1bVar.p);
                        textViewArr3[i2].setText(r1bVar.q);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.r ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.o);
                        if (!r1bVar.s) {
                            break;
                        }
                        i2++;
                        break;
                    case 7:
                        textViewArr[i2].setText(r1bVar.u);
                        textViewArr3[i2].setText(r1bVar.v);
                        textViewArr3[i2].setTag(Integer.valueOf(r1bVar.w ? aob.x6 : aob.p7));
                        textViewArr2[i2].setText(r1bVar.t);
                        if (!r1bVar.x) {
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
            for (int i4 = 0; i4 < q1bVar.getChildCount(); i4++) {
                ViewGroup viewGroup = (ViewGroup) q1bVar.getChildAt(i4);
                if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                    viewGroup.setVisibility(8);
                }
            }
            q1bVar.updateColors();
            return;
        }
        if (z) {
            int i5 = this.V;
            if (i >= i5 && i <= this.W) {
                ((z1b) view).setData((p1b) w1bVar.R.get(i - i5));
                return;
            }
            int i6 = this.S;
            if (i >= i6 && i <= this.T) {
                ((z1b) view).setData((p1b) arrayList2.get(i - i6));
                return;
            }
            int i7 = this.Y;
            if (i < i7 || i > this.Z) {
                return;
            }
            ((z1b) view).setData((p1b) w1bVar.Q.get(i - i7));
            return;
        }
        int i8 = i - this.J;
        t1b t1bVar3 = (t1b) arrayList.get(i8);
        z1b z1bVar = (z1b) view;
        boolean z2 = i8 == arrayList.size() - 1;
        TextView textView = z1bVar.f;
        TextView textView2 = z1bVar.d;
        rb0 rb0Var = z1bVar.n;
        TLRPC.ChatFull chatFull = z1bVar.x;
        x1b x1bVar = z1bVar.a;
        z1bVar.w = t1bVar3;
        z1bVar.y = !z2;
        r47 r47Var3 = t1bVar3.b;
        ArrayList arrayList3 = r47Var3.p0;
        if (arrayList3 != null) {
            r47Var = r47Var3;
            f = 1.0f;
            x1bVar.h(jn5.f(xb4.w(arrayList3, hl.Y0(false), false, null, false), r47Var3.n0), "50_50", jn5.f(xb4.w(r47Var3.p0, 50, false, null, false), r47Var3.n0), "b1", 0, r47Var);
            x1bVar.setRoundRadius(hl.L(9.0f));
            x1bVar.setScaleX(0.96f);
            x1bVar.setScaleY(0.96f);
        } else {
            r47Var = r47Var3;
            f = 1.0f;
            if (chatFull.chat_photo.sizes.size() <= 0) {
                r47Var2 = r47Var;
                t1bVar = t1bVar3;
                TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(chatFull.id));
                rb0Var.p(M0);
                x1bVar.f(M0, rb0Var);
                x1bVar.setRoundRadius(hl.L(46.0f) >> 1);
                x1bVar.setScaleX(1.0f);
                x1bVar.setScaleY(1.0f);
                if (r47Var2.w4()) {
                    x1bVar.setScaleX(f);
                    x1bVar.setScaleY(f);
                    x1bVar.setRoundRadius(hl.L(46.0f) >> 1);
                }
                if (!r47Var2.I3()) {
                    charSequence = qd4.p(r47Var2.y1(true).trim(), ", ", r47Var2.w1(true).trim());
                } else if (r47Var2.w4()) {
                    charSequence = ob6.M0(2131744392, null);
                } else {
                    charSequence = r47Var2.z;
                    if (charSequence == null) {
                        charSequence = r47Var2.v;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence != null ? charSequence : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                z1bVar.b.k(hl.J3(hl.J2(spannableStringBuilder), null));
                z1bVar.c.setText(String.format(ob6.J0(t1bVar.d(), "Views"), hl.o0(t1bVar.d(), 0)));
                t1bVar2 = t1bVar;
                Date date = new Date((t1bVar2.b != null ? 0L : r6.k.date) * 1000);
                z1bVar.e.setText(ob6.a0(null, null, 2131742414, ob6.D0().B0().format(date), ob6.D0().o0().format(date)));
                textView2.setText(hl.o0(t1bVar2.a(), 0));
                textView.setText(hl.o0(t1bVar2.c(), 0));
                textView2.setVisibility(t1bVar2.a() == 0 ? 0 : 8);
                textView.setVisibility(t1bVar2.c() == 0 ? 8 : 0);
                z1bVar.invalidate();
                if (t1bVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
                    z1bVar.setImageViewAction(null);
                    return;
                } else {
                    z1bVar.setImageViewAction(new jy8(this, t1bVar2, (byte) 21));
                    return;
                }
            }
            x1bVar.n(jn5.i(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, z1bVar.x);
            x1bVar.setRoundRadius(hl.L(46.0f) >> 1);
            x1bVar.setScaleX(0.96f);
            x1bVar.setScaleY(0.96f);
        }
        t1bVar = t1bVar3;
        r47Var2 = r47Var;
        if (r47Var2.w4()) {
        }
        if (!r47Var2.I3()) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence != null ? charSequence : "");
        while (r7 < r6) {
        }
        z1bVar.b.k(hl.J3(hl.J2(spannableStringBuilder2), null));
        z1bVar.c.setText(String.format(ob6.J0(t1bVar.d(), "Views"), hl.o0(t1bVar.d(), 0)));
        t1bVar2 = t1bVar;
        Date date2 = new Date((t1bVar2.b != null ? 0L : r6.k.date) * 1000);
        z1bVar.e.setText(ob6.a0(null, null, 2131742414, ob6.D0().B0().format(date2), ob6.D0().o0().format(date2)));
        textView2.setText(hl.o0(t1bVar2.a(), 0));
        textView.setText(hl.o0(t1bVar2.c(), 0));
        textView2.setVisibility(t1bVar2.a() == 0 ? 0 : 8);
        textView.setVisibility(t1bVar2.c() == 0 ? 8 : 0);
        z1bVar.invalidate();
        if (t1bVar2.a instanceof TL_stats.TL_postInteractionCountersStory) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        w1b w1bVar = this.e0;
        if (i >= 0 && i <= 4) {
            Context context = viewGroup.getContext();
            i2 = ((e) w1bVar).currentAccount;
            View y0bVar = new y0b(w1bVar, context, i2, i, w1bVar.a0);
            y0bVar.setWillNotDraw(false);
            view = y0bVar;
        } else if (i == 9) {
            View z0bVar = new z0b(viewGroup.getContext(), w1bVar.a, w1bVar.getResourceProvider());
            z0bVar.setWillNotDraw(false);
            view = z0bVar;
        } else if (i == 11) {
            view = new ua6(viewGroup.getContext());
        } else if (i == 12) {
            view = new t24(viewGroup.getContext(), hl.L(15.0f));
        } else if (i == 13) {
            View a1bVar = new a1b(viewGroup.getContext(), null);
            a1bVar.setWillNotDraw(false);
            a1bVar.setPadding(a1bVar.getPaddingLeft(), hl.L(16.0f), a1bVar.getRight(), hl.L(16.0f));
            view = a1bVar;
        } else if (i == 14) {
            view = new q1b(viewGroup.getContext(), w1bVar.c0 ? 2 : 4);
        } else if (i == 15) {
            ij6 ij6Var = new ij6(viewGroup.getContext());
            ij6Var.a(aob.v6, aob.u6);
            view = ij6Var;
        } else {
            view = new rca(viewGroup.getContext(), 0, 0);
        }
        return qu6.h(view, view, -1, -2);
    }
}
