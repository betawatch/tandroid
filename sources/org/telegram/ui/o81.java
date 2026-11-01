package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o81 implements org.telegram.ui.Components.bq {
    public final /* synthetic */ k91 a;

    public o81(k91 k91Var) {
        this.a = k91Var;
    }

    @Override // org.telegram.ui.Components.bq
    public final void a(boolean z10) {
        int i10;
        int i11;
        k91 k91Var = this.a;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
        if (!z10) {
            org.telegram.ui.Components.s4.V(k91Var, 1, null, null);
            return;
        }
        if (r6Var.r == null) {
            k91Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
            org.telegram.messenger.wp.r1(i11).v4(r6Var.b, r6Var);
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.s4, r6Var.b, r6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount;
        sb2.append(org.telegram.messenger.wp.r1(i10).U2);
        sb2.append("/addtheme/");
        sb2.append(r6Var.r.slug);
        String sb3 = sb2.toString();
        k91Var.showDialog(new org.telegram.ui.Components.pp0(k91Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.bq
    public final void b() {
        k91 k91Var = this.a;
        if (k91Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k91Var.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131751485, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131751486, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new rj0(this, 20));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        k91Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, k91Var.a);
        }
    }

    @Override // org.telegram.ui.Components.bq
    public final void c(int i10, int i11, boolean z10) {
        k91 k91Var = this.a;
        if (k91Var.b == 2) {
            k91Var.f1(i10, i11, true);
            return;
        }
        Runnable runnable = k91Var.Z;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
        if (i11 != -1) {
            int i12 = k91Var.Y;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            k91Var.X = i10;
            k91Var.Y = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (k91Var.a0) {
                    return;
                }
                k91Var.a0 = true;
                k91Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = k91Var.n;
        if (i13 == 1 || i13 == 2) {
            long j10 = k91Var.J;
            if (j10 != 0) {
                r6Var.j = j10;
            } else {
                r6Var.j = 0L;
            }
            long j11 = k91Var.K;
            if (j11 != 0) {
                r6Var.k = j11;
            } else {
                r6Var.k = 0L;
            }
            long j12 = k91Var.L;
            if (j12 != 0) {
                r6Var.l = j12;
            } else {
                r6Var.l = 0L;
            }
            long j13 = k91Var.M;
            if (j13 != 0) {
                r6Var.m = j13;
            } else {
                r6Var.m = 0L;
            }
            r6Var.n = k91Var.P;
            if (i13 == 2) {
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                int i14 = (int) r6Var.k;
                int i15 = (int) r6Var.l;
                int i16 = (int) r6Var.m;
                int i17 = (int) r6Var.j;
                org.telegram.ui.Components.cq cqVar = k91Var.W;
                if (i16 != 0) {
                    E04 = i16;
                }
                cqVar.e(E04, 3);
                org.telegram.ui.Components.cq cqVar2 = k91Var.W;
                if (i15 != 0) {
                    E03 = i15;
                }
                cqVar2.e(E03, 2);
                org.telegram.ui.Components.cq cqVar3 = k91Var.W;
                if (i14 != 0) {
                    E02 = i14;
                }
                cqVar3.e(E02, 1);
                org.telegram.ui.Components.cq cqVar4 = k91Var.W;
                if (i17 != 0) {
                    E0 = i17;
                }
                cqVar4.e(E0, 0);
            }
        }
        int i18 = k91Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = k91Var.E;
            if (i19 != 0) {
                r6Var.e = i19;
            } else {
                r6Var.e = 0;
            }
            int i20 = k91Var.F;
            if (i20 != 0) {
                r6Var.f = i20;
            } else {
                r6Var.f = 0;
            }
            int i21 = k91Var.G;
            if (i21 != 0) {
                r6Var.g = i21;
            } else {
                r6Var.g = 0;
            }
            int i22 = k91Var.H;
            if (i22 != 0) {
                r6Var.h = i22;
            } else {
                r6Var.h = 0;
            }
            if (i18 == 3) {
                k91Var.W.e(r6Var.h, 3);
                k91Var.W.e(r6Var.g, 2);
                k91Var.W.e(r6Var.f, 1);
                org.telegram.ui.Components.cq cqVar5 = k91Var.W;
                int i23 = r6Var.e;
                if (i23 == 0) {
                    i23 = r6Var.c;
                }
                cqVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.t6.t1(false, false);
        k91Var.v0.g1();
    }

    @Override // org.telegram.ui.Components.bq
    public final int d(int i10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        k91 k91Var = this.a;
        if (k91Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.s6 s6Var = k91Var.f0;
        if (s6Var.S && i10 == 0 && (r6Var = (org.telegram.ui.ActionBar.r6) s6Var.a0.get(org.telegram.ui.ActionBar.t6.n)) != null) {
            return r6Var.e;
        }
        return 0;
    }
}
