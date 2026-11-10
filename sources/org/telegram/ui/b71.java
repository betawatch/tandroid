package org.telegram.ui;

import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b71 implements org.telegram.ui.Components.up {
    public final /* synthetic */ x71 a;

    public b71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.Components.up
    public final void a(boolean z9) {
        int i7;
        int i10;
        x71 x71Var = this.a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
        if (!z9) {
            org.telegram.ui.Components.u4.T(x71Var, 1, null, null);
            return;
        }
        if (j6Var.r == null) {
            x71Var.finishFragment();
            i10 = ((org.telegram.ui.ActionBar.f2) x71Var).currentAccount;
            org.telegram.messenger.qp.s1(i10).y4(j6Var.b, j6Var);
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, j6Var.b, j6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i7 = ((org.telegram.ui.ActionBar.f2) x71Var).currentAccount;
        sb2.append(org.telegram.messenger.qp.s1(i7).U2);
        sb2.append("/addtheme/");
        sb2.append(j6Var.r.slug);
        String sb3 = sb2.toString();
        x71Var.showDialog(new org.telegram.ui.Components.mo0(x71Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.up
    public final void b() {
        x71 x71Var = this.a;
        if (x71Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131751484, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131751485, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new oi0(this, 19));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        x71Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, x71Var.a);
        }
    }

    @Override // org.telegram.ui.Components.up
    public final void c(int i7, int i10, boolean z9) {
        x71 x71Var = this.a;
        if (x71Var.b == 2) {
            x71Var.f1(i7, i10, true);
            return;
        }
        Runnable runnable = x71Var.Z;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
        if (i10 != -1) {
            int i11 = x71Var.Y;
            if (i11 != -1 && i11 != i10) {
                runnable.run();
            }
            x71Var.X = i7;
            x71Var.Y = i10;
            if (z9) {
                runnable.run();
                return;
            } else {
                if (x71Var.a0) {
                    return;
                }
                x71Var.a0 = true;
                x71Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i12 = x71Var.n;
        if (i12 == 1 || i12 == 2) {
            long j3 = x71Var.J;
            if (j3 != 0) {
                j6Var.j = j3;
            } else {
                j6Var.j = 0L;
            }
            long j10 = x71Var.K;
            if (j10 != 0) {
                j6Var.k = j10;
            } else {
                j6Var.k = 0L;
            }
            long j11 = x71Var.L;
            if (j11 != 0) {
                j6Var.l = j11;
            } else {
                j6Var.l = 0L;
            }
            long j12 = x71Var.M;
            if (j12 != 0) {
                j6Var.m = j12;
            } else {
                j6Var.m = 0L;
            }
            j6Var.n = x71Var.P;
            if (i12 == 2) {
                int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Be);
                int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ce);
                int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                int E04 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                int i13 = (int) j6Var.k;
                int i14 = (int) j6Var.l;
                int i15 = (int) j6Var.m;
                int i16 = (int) j6Var.j;
                org.telegram.ui.Components.vp vpVar = x71Var.W;
                if (i15 != 0) {
                    E04 = i15;
                }
                vpVar.e(E04, 3);
                org.telegram.ui.Components.vp vpVar2 = x71Var.W;
                if (i14 != 0) {
                    E03 = i14;
                }
                vpVar2.e(E03, 2);
                org.telegram.ui.Components.vp vpVar3 = x71Var.W;
                if (i13 != 0) {
                    E02 = i13;
                }
                vpVar3.e(E02, 1);
                org.telegram.ui.Components.vp vpVar4 = x71Var.W;
                if (i16 != 0) {
                    E0 = i16;
                }
                vpVar4.e(E0, 0);
            }
        }
        int i17 = x71Var.n;
        if (i17 == 1 || i17 == 3) {
            int i18 = x71Var.E;
            if (i18 != 0) {
                j6Var.e = i18;
            } else {
                j6Var.e = 0;
            }
            int i19 = x71Var.F;
            if (i19 != 0) {
                j6Var.f = i19;
            } else {
                j6Var.f = 0;
            }
            int i20 = x71Var.G;
            if (i20 != 0) {
                j6Var.g = i20;
            } else {
                j6Var.g = 0;
            }
            int i21 = x71Var.H;
            if (i21 != 0) {
                j6Var.h = i21;
            } else {
                j6Var.h = 0;
            }
            if (i17 == 3) {
                x71Var.W.e(j6Var.h, 3);
                x71Var.W.e(j6Var.g, 2);
                x71Var.W.e(j6Var.f, 1);
                org.telegram.ui.Components.vp vpVar5 = x71Var.W;
                int i22 = j6Var.e;
                if (i22 == 0) {
                    i22 = j6Var.c;
                }
                vpVar5.e(i22, 0);
            }
        }
        org.telegram.ui.ActionBar.m6.t1(false, false);
        x71Var.v0.g1();
    }

    @Override // org.telegram.ui.Components.up
    public final int d(int i7) {
        org.telegram.ui.ActionBar.j6 j6Var;
        x71 x71Var = this.a;
        if (x71Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.l6 l6Var = x71Var.f0;
        if (l6Var.S && i7 == 0 && (j6Var = (org.telegram.ui.ActionBar.j6) l6Var.a0.get(org.telegram.ui.ActionBar.m6.n)) != null) {
            return j6Var.e;
        }
        return 0;
    }
}
