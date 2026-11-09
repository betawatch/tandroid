package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a71 implements org.telegram.ui.Components.up {
    public final /* synthetic */ w71 a;

    public a71(w71 w71Var) {
        this.a = w71Var;
    }

    @Override // org.telegram.ui.Components.up
    public final void a(boolean z9) {
        int i7;
        int i10;
        w71 w71Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
        if (!z9) {
            org.telegram.ui.Components.v4.T(w71Var, 1, null, null);
            return;
        }
        if (i6Var.r == null) {
            w71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.f2) w71Var).currentAccount;
            org.telegram.messenger.qp.s1(i10).y4(i6Var.b, i6Var);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, i6Var.b, i6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i7 = ((org.telegram.ui.ActionBar.f2) w71Var).currentAccount;
        sb2.append(org.telegram.messenger.qp.s1(i7).U2);
        sb2.append("/addtheme/");
        sb2.append(i6Var.r.slug);
        String sb3 = sb2.toString();
        w71Var.showDialog(new org.telegram.ui.Components.no0(w71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.up
    public final void b() {
        w71 w71Var = this.a;
        if (w71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w71Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131751484, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751485, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni0(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        w71Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, w71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.up
    public final void c(int i7, int i10, boolean z9) {
        w71 w71Var = this.a;
        if (w71Var.b == 2) {
            w71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = w71Var.Z;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
        if (i10 != -1) {
            int i11 = w71Var.Y;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            w71Var.X = i7;
            w71Var.Y = i10;
            if (z9) {
                runnable.run();
                return;
            } else {
                if (w71Var.a0) {
                    return;
                }
                w71Var.a0 = true;
                w71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = w71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j3 = w71Var.J;
            if (j3 != 0) {
                i6Var.j = j3;
            } else {
                i6Var.j = 0L;
            }
            long j10 = w71Var.K;
            if (j10 != 0) {
                i6Var.k = j10;
            } else {
                i6Var.k = 0L;
            }
            long j11 = w71Var.L;
            if (j11 != 0) {
                i6Var.l = j11;
            } else {
                i6Var.l = 0L;
            }
            long j12 = w71Var.M;
            if (j12 != 0) {
                i6Var.m = j12;
            } else {
                i6Var.m = 0L;
            }
            i6Var.n = w71Var.P;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Be);
                int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                int E03 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                int E04 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                int i13 = (int) i6Var.k;
                int i14 = (int) i6Var.l;
                int i15 = (int) i6Var.m;
                int i16 = (int) i6Var.j;
                org.telegram.ui.Components.vp vpVar = w71Var.W;
                if (i15 != 0) {
                    E04 = i15;
                }
                vpVar.e(E04, 3);
                org.telegram.ui.Components.vp vpVar2 = w71Var.W;
                if (i14 != 0) {
                    E03 = i14;
                }
                vpVar2.e(E03, 2);
                org.telegram.ui.Components.vp vpVar3 = w71Var.W;
                if (i13 != 0) {
                    E02 = i13;
                }
                vpVar3.e(E02, 1);
                org.telegram.ui.Components.vp vpVar4 = w71Var.W;
                if (i16 != 0) {
                    E0 = i16;
                }
                vpVar4.e(E0, 0);
            }
        }
        int i17 = w71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = w71Var.E;
            if (i18 != 0) {
                i6Var.e = i18;
            } else {
                i6Var.e = 0;
            }
            int i19 = w71Var.F;
            if (i19 != 0) {
                i6Var.f = i19;
            } else {
                i6Var.f = 0;
            }
            int i20 = w71Var.G;
            if (i20 != 0) {
                i6Var.g = i20;
            } else {
                i6Var.g = 0;
            }
            int i21 = w71Var.H;
            if (i21 != 0) {
                i6Var.h = i21;
            } else {
                i6Var.h = 0;
            }
            if (i17 == 3) {
                w71Var.W.e(i6Var.h, 3);
                w71Var.W.e(i6Var.g, 2);
                w71Var.W.e(i6Var.f, 1);
                org.telegram.ui.Components.vp vpVar5 = w71Var.W;
                int i22 = i6Var.e;
                if (i22 == 0) {
                    i22 = i6Var.c;
                }
                vpVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.l6.t1(false, false);
        w71Var.v0.g1();
    }

    @Override // org.telegram.ui.Components.up
    public final int d(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        w71 w71Var = this.a;
        if (w71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.k6 k6Var = w71Var.f0;
        if (k6Var.S && i7 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) k6Var.a0.get(org.telegram.ui.ActionBar.l6.n)) != null) {
            return i6Var.e;
        }
        return 0;
    }
}
