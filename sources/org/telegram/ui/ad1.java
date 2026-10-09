package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ad1 implements org.telegram.ui.Components.br {
    public final /* synthetic */ xd1 a;

    public ad1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // org.telegram.ui.Components.br
    public final int B0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        xd1 xd1Var = this.a;
        if (xd1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.e0;
        if (h6Var.S && i10 == 0 && (g6Var = (org.telegram.ui.ActionBar.g6) h6Var.a0.get(org.telegram.ui.ActionBar.i6.n)) != null) {
            return g6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.br
    public final void l(boolean z10) {
        int i10;
        int i11;
        xd1 xd1Var = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.s;
        if (!z10) {
            org.telegram.ui.Components.g5.V(xd1Var, 1, null, null);
            return;
        }
        if (g6Var.r == null) {
            xd1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(g6Var.b, g6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, g6Var.b, g6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(g6Var.r.slug);
        String sb3 = sb2.toString();
        xd1Var.showDialog(new org.telegram.ui.Components.mr0(xd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.br
    public final void s0(int i10, int i11, boolean z10) {
        xd1 xd1Var = this.a;
        if (xd1Var.b == 2) {
            xd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = xd1Var.Y;
        org.telegram.ui.ActionBar.g6 g6Var = xd1Var.s;
        if (i11 != -1) {
            int i12 = xd1Var.X;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            xd1Var.W = i10;
            xd1Var.X = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (xd1Var.Z) {
                    return;
                }
                xd1Var.Z = true;
                xd1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = xd1Var.n;
        if (i13 == 1 || i13 == 2) {
            long j3 = xd1Var.I;
            if (j3 != 0) {
                g6Var.j = j3;
            } else {
                g6Var.j = 0L;
            }
            long j10 = xd1Var.J;
            if (j10 != 0) {
                g6Var.k = j10;
            } else {
                g6Var.k = 0L;
            }
            long j11 = xd1Var.K;
            if (j11 != 0) {
                g6Var.l = j11;
            } else {
                g6Var.l = 0L;
            }
            long j12 = xd1Var.L;
            if (j12 != 0) {
                g6Var.m = j12;
            } else {
                g6Var.m = 0L;
            }
            g6Var.n = xd1Var.O;
            if (i13 == 2) {
                int C0 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Nd);
                int C02 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Od);
                int C03 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Pd);
                int C04 = org.telegram.ui.ActionBar.i6.C0(org.telegram.ui.ActionBar.i6.Qd);
                int i14 = (int) g6Var.k;
                int i15 = (int) g6Var.l;
                int i16 = (int) g6Var.m;
                int i17 = (int) g6Var.j;
                org.telegram.ui.Components.cr crVar = xd1Var.V;
                if (i16 != 0) {
                    C04 = i16;
                }
                crVar.e(C04, 3);
                org.telegram.ui.Components.cr crVar2 = xd1Var.V;
                if (i15 != 0) {
                    C03 = i15;
                }
                crVar2.e(C03, 2);
                org.telegram.ui.Components.cr crVar3 = xd1Var.V;
                if (i14 != 0) {
                    C02 = i14;
                }
                crVar3.e(C02, 1);
                org.telegram.ui.Components.cr crVar4 = xd1Var.V;
                if (i17 != 0) {
                    C0 = i17;
                }
                crVar4.e(C0, 0);
            }
        }
        int i18 = xd1Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = xd1Var.y;
            if (i19 != 0) {
                g6Var.e = i19;
            } else {
                g6Var.e = 0;
            }
            int i20 = xd1Var.E;
            if (i20 != 0) {
                g6Var.f = i20;
            } else {
                g6Var.f = 0;
            }
            int i21 = xd1Var.F;
            if (i21 != 0) {
                g6Var.g = i21;
            } else {
                g6Var.g = 0;
            }
            int i22 = xd1Var.G;
            if (i22 != 0) {
                g6Var.h = i22;
            } else {
                g6Var.h = 0;
            }
            if (i18 == 3) {
                xd1Var.V.e(g6Var.h, 3);
                xd1Var.V.e(g6Var.g, 2);
                xd1Var.V.e(g6Var.f, 1);
                org.telegram.ui.Components.cr crVar5 = xd1Var.V;
                int i23 = g6Var.e;
                if (i23 == 0) {
                    i23 = g6Var.c;
                }
                crVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.i6.o1(false, false);
        xd1Var.u0.f1();
    }

    @Override // org.telegram.ui.Components.br
    public final void y() {
        xd1 xd1Var = this.a;
        if (xd1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hq0(this, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        xd1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
    }
}
