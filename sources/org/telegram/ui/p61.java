package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p61 implements org.telegram.ui.Components.up {
    public final /* synthetic */ l71 a;

    public p61(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // org.telegram.ui.Components.up
    public final void a(boolean z10) {
        int i3;
        int i10;
        l71 l71Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
        if (!z10) {
            org.telegram.ui.Components.t4.V(l71Var, 1, null, null);
            return;
        }
        if (g6Var.r == null) {
            l71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
            org.telegram.messenger.hp.s1(i10).y4(g6Var.b, g6Var);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.s4, g6Var.b, g6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i3 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
        sb2.append(org.telegram.messenger.hp.s1(i3).V2);
        sb2.append("/addtheme/");
        sb2.append(g6Var.r.slug);
        String sb3 = sb2.toString();
        l71Var.showDialog(new org.telegram.ui.Components.oo0(l71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.up
    public final void b() {
        l71 l71Var = this.a;
        if (l71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l71Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131751485, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131751486, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci0(this, 20));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        l71Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, l71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.up
    public final void c(int i3, int i10, boolean z10) {
        l71 l71Var = this.a;
        if (l71Var.b == 2) {
            l71Var.f1(i3, i10, true);
            return;
        }
        Runnable runnable = l71Var.a0;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
        if (i10 != -1) {
            int i11 = l71Var.Z;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            l71Var.Y = i3;
            l71Var.Z = i10;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (l71Var.b0) {
                    return;
                }
                l71Var.b0 = true;
                l71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = l71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j10 = l71Var.K;
            if (j10 != 0) {
                g6Var.j = j10;
            } else {
                g6Var.j = 0L;
            }
            long j11 = l71Var.L;
            if (j11 != 0) {
                g6Var.k = j11;
            } else {
                g6Var.k = 0L;
            }
            long j12 = l71Var.M;
            if (j12 != 0) {
                g6Var.l = j12;
            } else {
                g6Var.l = 0L;
            }
            long j13 = l71Var.N;
            if (j13 != 0) {
                g6Var.m = j13;
            } else {
                g6Var.m = 0L;
            }
            g6Var.n = l71Var.Q;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                int i13 = (int) g6Var.k;
                int i14 = (int) g6Var.l;
                int i15 = (int) g6Var.m;
                int i16 = (int) g6Var.j;
                org.telegram.ui.Components.vp vpVar = l71Var.X;
                if (i15 != 0) {
                    E04 = i15;
                }
                vpVar.e(E04, 3);
                org.telegram.ui.Components.vp vpVar2 = l71Var.X;
                if (i14 != 0) {
                    E03 = i14;
                }
                vpVar2.e(E03, 2);
                org.telegram.ui.Components.vp vpVar3 = l71Var.X;
                if (i13 != 0) {
                    E02 = i13;
                }
                vpVar3.e(E02, 1);
                org.telegram.ui.Components.vp vpVar4 = l71Var.X;
                if (i16 != 0) {
                    E0 = i16;
                }
                vpVar4.e(E0, 0);
            }
        }
        int i17 = l71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = l71Var.F;
            if (i18 != 0) {
                g6Var.e = i18;
            } else {
                g6Var.e = 0;
            }
            int i19 = l71Var.G;
            if (i19 != 0) {
                g6Var.f = i19;
            } else {
                g6Var.f = 0;
            }
            int i20 = l71Var.H;
            if (i20 != 0) {
                g6Var.g = i20;
            } else {
                g6Var.g = 0;
            }
            int i21 = l71Var.I;
            if (i21 != 0) {
                g6Var.h = i21;
            } else {
                g6Var.h = 0;
            }
            if (i17 == 3) {
                l71Var.X.e(g6Var.h, 3);
                l71Var.X.e(g6Var.g, 2);
                l71Var.X.e(g6Var.f, 1);
                org.telegram.ui.Components.vp vpVar5 = l71Var.X;
                int i22 = g6Var.e;
                if (i22 == 0) {
                    i22 = g6Var.c;
                }
                vpVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.k6.t1(false, false);
        l71Var.w0.g1();
    }

    @Override // org.telegram.ui.Components.up
    public final int d(int i3) {
        org.telegram.ui.ActionBar.g6 g6Var;
        l71 l71Var = this.a;
        if (l71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = l71Var.g0;
        if (j6Var.T && i3 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) j6Var.b0.get(org.telegram.ui.ActionBar.k6.n)) != null) {
            return g6Var.e;
        }
        return 0;
    }
}
