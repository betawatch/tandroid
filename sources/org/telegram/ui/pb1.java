package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pb1 implements org.telegram.ui.Components.vq {
    public final /* synthetic */ mc1 a;

    public pb1(mc1 mc1Var) {
        this.a = mc1Var;
    }

    @Override // org.telegram.ui.Components.vq
    public final void j0(int i10, int i11, boolean z10) {
        mc1 mc1Var = this.a;
        if (mc1Var.b == 2) {
            mc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = mc1Var.Y;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.s;
        if (i11 != -1) {
            int i12 = mc1Var.X;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            mc1Var.W = i10;
            mc1Var.X = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (mc1Var.Z) {
                    return;
                }
                mc1Var.Z = true;
                mc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = mc1Var.n;
        if (i13 == 1 || i13 == 2) {
            long j10 = mc1Var.I;
            if (j10 != 0) {
                f6Var.j = j10;
            } else {
                f6Var.j = 0L;
            }
            long j11 = mc1Var.J;
            if (j11 != 0) {
                f6Var.k = j11;
            } else {
                f6Var.k = 0L;
            }
            long j12 = mc1Var.K;
            if (j12 != 0) {
                f6Var.l = j12;
            } else {
                f6Var.l = 0L;
            }
            long j13 = mc1Var.L;
            if (j13 != 0) {
                f6Var.m = j13;
            } else {
                f6Var.m = 0L;
            }
            f6Var.n = mc1Var.O;
            if (i13 == 2) {
                int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                int C04 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                int i14 = (int) f6Var.k;
                int i15 = (int) f6Var.l;
                int i16 = (int) f6Var.m;
                int i17 = (int) f6Var.j;
                org.telegram.ui.Components.wq wqVar = mc1Var.V;
                if (i16 != 0) {
                    C04 = i16;
                }
                wqVar.e(C04, 3);
                org.telegram.ui.Components.wq wqVar2 = mc1Var.V;
                if (i15 != 0) {
                    C03 = i15;
                }
                wqVar2.e(C03, 2);
                org.telegram.ui.Components.wq wqVar3 = mc1Var.V;
                if (i14 != 0) {
                    C02 = i14;
                }
                wqVar3.e(C02, 1);
                org.telegram.ui.Components.wq wqVar4 = mc1Var.V;
                if (i17 != 0) {
                    C0 = i17;
                }
                wqVar4.e(C0, 0);
            }
        }
        int i18 = mc1Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = mc1Var.y;
            if (i19 != 0) {
                f6Var.e = i19;
            } else {
                f6Var.e = 0;
            }
            int i20 = mc1Var.E;
            if (i20 != 0) {
                f6Var.f = i20;
            } else {
                f6Var.f = 0;
            }
            int i21 = mc1Var.F;
            if (i21 != 0) {
                f6Var.g = i21;
            } else {
                f6Var.g = 0;
            }
            int i22 = mc1Var.G;
            if (i22 != 0) {
                f6Var.h = i22;
            } else {
                f6Var.h = 0;
            }
            if (i18 == 3) {
                mc1Var.V.e(f6Var.h, 3);
                mc1Var.V.e(f6Var.g, 2);
                mc1Var.V.e(f6Var.f, 1);
                org.telegram.ui.Components.wq wqVar5 = mc1Var.V;
                int i23 = f6Var.e;
                if (i23 == 0) {
                    i23 = f6Var.c;
                }
                wqVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.h6.o1(false, false);
        mc1Var.u0.f1();
    }

    @Override // org.telegram.ui.Components.vq
    public final void k(boolean z10) {
        int i10;
        int i11;
        mc1 mc1Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.s;
        if (!z10) {
            org.telegram.ui.Components.f5.V(mc1Var, 1, null, null);
            return;
        }
        if (f6Var.r == null) {
            mc1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.n2) mc1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(f6Var.b, f6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var.b, f6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.n2) mc1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(f6Var.r.slug);
        String sb3 = sb2.toString();
        mc1Var.showDialog(new org.telegram.ui.Components.dr0(mc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.vq
    public final int r0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        mc1 mc1Var = this.a;
        if (mc1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.g6 g6Var = mc1Var.e0;
        if (g6Var.S && i10 == 0 && (f6Var = (org.telegram.ui.ActionBar.f6) g6Var.a0.get(org.telegram.ui.ActionBar.h6.n)) != null) {
            return f6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vq
    public final void u() {
        mc1 mc1Var = this.a;
        if (mc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mc1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rp0(this, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        mc1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }
}
