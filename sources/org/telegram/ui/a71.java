package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a71 implements org.telegram.ui.Components.lq {
    public final /* synthetic */ x71 a;

    public a71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.Components.lq
    public final void a(boolean z10) {
        int i7;
        int i10;
        x71 x71Var = this.a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
        if (!z10) {
            org.telegram.ui.Components.c5.T(x71Var, 1, null, null);
            return;
        }
        if (j6Var.r == null) {
            x71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
            org.telegram.messenger.np.u1(i10).H4(j6Var.b, j6Var);
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.v4, j6Var.b, j6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i7 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
        sb2.append(org.telegram.messenger.np.u1(i7).X2);
        sb2.append("/addtheme/");
        sb2.append(j6Var.r.slug);
        String sb3 = sb2.toString();
        x71Var.showDialog(new org.telegram.ui.Components.ap0(x71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.lq
    public final void b() {
        x71 x71Var = this.a;
        if (x71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131751472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131751473, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new qi0(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        x71Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, x71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.lq
    public final void c(int i7, int i10, boolean z10) {
        x71 x71Var = this.a;
        if (x71Var.b == 2) {
            x71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = x71Var.a0;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
        if (i10 != -1) {
            int i11 = x71Var.Z;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            x71Var.Y = i7;
            x71Var.Z = i10;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (x71Var.b0) {
                    return;
                }
                x71Var.b0 = true;
                x71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = x71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j3 = x71Var.K;
            if (j3 != 0) {
                j6Var.j = j3;
            } else {
                j6Var.j = 0L;
            }
            long j10 = x71Var.L;
            if (j10 != 0) {
                j6Var.k = j10;
            } else {
                j6Var.k = 0L;
            }
            long j11 = x71Var.M;
            if (j11 != 0) {
                j6Var.l = j11;
            } else {
                j6Var.l = 0L;
            }
            long j12 = x71Var.N;
            if (j12 != 0) {
                j6Var.m = j12;
            } else {
                j6Var.m = 0L;
            }
            j6Var.n = x71Var.Q;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Fe);
                int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                int E04 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.He);
                int i13 = (int) j6Var.k;
                int i14 = (int) j6Var.l;
                int i15 = (int) j6Var.m;
                int i16 = (int) j6Var.j;
                org.telegram.ui.Components.mq mqVar = x71Var.X;
                if (i15 != 0) {
                    E04 = i15;
                }
                mqVar.e(E04, 3);
                org.telegram.ui.Components.mq mqVar2 = x71Var.X;
                if (i14 != 0) {
                    E03 = i14;
                }
                mqVar2.e(E03, 2);
                org.telegram.ui.Components.mq mqVar3 = x71Var.X;
                if (i13 != 0) {
                    E02 = i13;
                }
                mqVar3.e(E02, 1);
                org.telegram.ui.Components.mq mqVar4 = x71Var.X;
                if (i16 != 0) {
                    E0 = i16;
                }
                mqVar4.e(E0, 0);
            }
        }
        int i17 = x71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = x71Var.F;
            if (i18 != 0) {
                j6Var.e = i18;
            } else {
                j6Var.e = 0;
            }
            int i19 = x71Var.G;
            if (i19 != 0) {
                j6Var.f = i19;
            } else {
                j6Var.f = 0;
            }
            int i20 = x71Var.H;
            if (i20 != 0) {
                j6Var.g = i20;
            } else {
                j6Var.g = 0;
            }
            int i21 = x71Var.I;
            if (i21 != 0) {
                j6Var.h = i21;
            } else {
                j6Var.h = 0;
            }
            if (i17 == 3) {
                x71Var.X.e(j6Var.h, 3);
                x71Var.X.e(j6Var.g, 2);
                x71Var.X.e(j6Var.f, 1);
                org.telegram.ui.Components.mq mqVar5 = x71Var.X;
                int i22 = j6Var.e;
                if (i22 == 0) {
                    i22 = j6Var.c;
                }
                mqVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.m6.t1(false, false);
        x71Var.w0.g1();
    }

    @Override // org.telegram.ui.Components.lq
    public final int d(int i7) {
        org.telegram.ui.ActionBar.j6 j6Var;
        x71 x71Var = this.a;
        if (x71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.l6 l6Var = x71Var.g0;
        if (l6Var.T && i7 == 0 && (j6Var = (org.telegram.ui.ActionBar.j6) l6Var.b0.get(org.telegram.ui.ActionBar.m6.n)) != null) {
            return j6Var.e;
        }
        return 0;
    }
}
