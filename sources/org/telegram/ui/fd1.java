package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fd1 implements org.telegram.ui.Components.yq {
    public final /* synthetic */ ce1 a;

    public fd1(ce1 ce1Var) {
        this.a = ce1Var;
    }

    @Override // org.telegram.ui.Components.yq
    public final int J0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        ce1 ce1Var = this.a;
        if (ce1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = ce1Var.e0;
        if (f6Var.S && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.a0.get(org.telegram.ui.ActionBar.g6.n)) != null) {
            return e6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.yq
    public final void k(boolean z10) {
        int i10;
        int i11;
        ce1 ce1Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.s;
        if (!z10) {
            org.telegram.ui.Components.g5.V(ce1Var, 1, null, null);
            return;
        }
        if (e6Var.r == null) {
            ce1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(e6Var.b, e6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.b, e6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.m2) ce1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(e6Var.r.slug);
        String sb3 = sb2.toString();
        ce1Var.showDialog(new org.telegram.ui.Components.ir0(ce1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.yq
    public final void t0(int i10, int i11, boolean z10) {
        ce1 ce1Var = this.a;
        if (ce1Var.b == 2) {
            ce1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = ce1Var.Y;
        org.telegram.ui.ActionBar.e6 e6Var = ce1Var.s;
        if (i11 != -1) {
            int i12 = ce1Var.X;
            if (i12 != -1 && i12 != i11) {
                runnable.run();
            }
            ce1Var.W = i10;
            ce1Var.X = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (ce1Var.Z) {
                    return;
                }
                ce1Var.Z = true;
                ce1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i13 = ce1Var.n;
        if (i13 == 1 || i13 == 2) {
            long j10 = ce1Var.I;
            if (j10 != 0) {
                e6Var.j = j10;
            } else {
                e6Var.j = 0L;
            }
            long j11 = ce1Var.J;
            if (j11 != 0) {
                e6Var.k = j11;
            } else {
                e6Var.k = 0L;
            }
            long j12 = ce1Var.K;
            if (j12 != 0) {
                e6Var.l = j12;
            } else {
                e6Var.l = 0L;
            }
            long j13 = ce1Var.L;
            if (j13 != 0) {
                e6Var.m = j13;
            } else {
                e6Var.m = 0L;
            }
            e6Var.n = ce1Var.O;
            if (i13 == 2) {
                int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Nd);
                int C02 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Od);
                int C03 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                int C04 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Qd);
                int i14 = (int) e6Var.k;
                int i15 = (int) e6Var.l;
                int i16 = (int) e6Var.m;
                int i17 = (int) e6Var.j;
                org.telegram.ui.Components.zq zqVar = ce1Var.V;
                if (i16 != 0) {
                    C04 = i16;
                }
                zqVar.e(C04, 3);
                org.telegram.ui.Components.zq zqVar2 = ce1Var.V;
                if (i15 != 0) {
                    C03 = i15;
                }
                zqVar2.e(C03, 2);
                org.telegram.ui.Components.zq zqVar3 = ce1Var.V;
                if (i14 != 0) {
                    C02 = i14;
                }
                zqVar3.e(C02, 1);
                org.telegram.ui.Components.zq zqVar4 = ce1Var.V;
                if (i17 != 0) {
                    C0 = i17;
                }
                zqVar4.e(C0, 0);
            }
        }
        int i18 = ce1Var.n;
        if (i18 == 1 || i18 == 3) {
            int i19 = ce1Var.y;
            if (i19 != 0) {
                e6Var.e = i19;
            } else {
                e6Var.e = 0;
            }
            int i20 = ce1Var.E;
            if (i20 != 0) {
                e6Var.f = i20;
            } else {
                e6Var.f = 0;
            }
            int i21 = ce1Var.F;
            if (i21 != 0) {
                e6Var.g = i21;
            } else {
                e6Var.g = 0;
            }
            int i22 = ce1Var.G;
            if (i22 != 0) {
                e6Var.h = i22;
            } else {
                e6Var.h = 0;
            }
            if (i18 == 3) {
                ce1Var.V.e(e6Var.h, 3);
                ce1Var.V.e(e6Var.g, 2);
                ce1Var.V.e(e6Var.f, 1);
                org.telegram.ui.Components.zq zqVar5 = ce1Var.V;
                int i23 = e6Var.e;
                if (i23 == 0) {
                    i23 = e6Var.c;
                }
                zqVar5.e(i23, 0);
            }
        }
        org.telegram.ui.ActionBar.g6.o1(false, false);
        ce1Var.u0.f1();
    }

    @Override // org.telegram.ui.Components.yq
    public final void y() {
        ce1 ce1Var = this.a;
        if (ce1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new lq0(this, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        ce1Var.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ce1Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }
}
