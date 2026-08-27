package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pb1 implements org.telegram.ui.Components.zp {
    public final /* synthetic */ nc1 a;

    public pb1(nc1 nc1Var) {
        this.a = nc1Var;
    }

    @Override // org.telegram.ui.Components.zp
    public final int D0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        nc1 nc1Var = this.a;
        if (nc1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.f6 f6Var = nc1Var.a0;
        if (f6Var.O && i10 == 0 && (e6Var = (org.telegram.ui.ActionBar.e6) f6Var.W.get(org.telegram.ui.ActionBar.g6.n)) != null) {
            return e6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.zp
    public final void g(boolean z10) {
        int i10;
        int i11;
        nc1 nc1Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.s;
        if (!z10) {
            org.telegram.ui.Components.y4.W(nc1Var, 1, null, null);
            return;
        }
        if (e6Var.r == null) {
            nc1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(e6Var.b, e6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var.b, e6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.n2) nc1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(e6Var.r.slug);
        String sb3 = sb2.toString();
        nc1Var.showDialog(new org.telegram.ui.Components.sp0(nc1Var.getParentActivity(), null, sb3, false, sb3, false, null));
    }

    @Override // org.telegram.ui.Components.zp
    public final void n() {
        nc1 nc1Var = this.a;
        if (nc1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nc1Var.getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        nc1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // org.telegram.ui.Components.zp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        nc1 nc1Var = this.a;
        if (nc1Var.b == 2) {
            nc1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = nc1Var.U;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.s;
        if (i11 != -1) {
            int i19 = nc1Var.T;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            nc1Var.S = i10;
            nc1Var.T = i11;
            if (z10) {
                runnable.run();
                return;
            } else {
                if (nc1Var.V) {
                    return;
                }
                nc1Var.V = true;
                nc1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = nc1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j10 = nc1Var.E;
            if (j10 != 0) {
                e6Var.j = j10;
            } else {
                e6Var.j = 0L;
            }
            long j11 = nc1Var.F;
            if (j11 != 0) {
                e6Var.k = j11;
            } else {
                e6Var.k = 0L;
            }
            long j12 = nc1Var.G;
            if (j12 != 0) {
                e6Var.l = j12;
            } else {
                e6Var.l = 0L;
            }
            long j13 = nc1Var.H;
            if (j13 != 0) {
                e6Var.m = j13;
            } else {
                e6Var.m = 0L;
            }
            e6Var.n = nc1Var.K;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                int B04 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                int i21 = (int) e6Var.k;
                int i22 = (int) e6Var.l;
                int i23 = (int) e6Var.m;
                int i24 = (int) e6Var.j;
                org.telegram.ui.Components.aq aqVar = nc1Var.R;
                if (i23 != 0) {
                    B04 = i23;
                }
                aqVar.e(B04, 3);
                org.telegram.ui.Components.aq aqVar2 = nc1Var.R;
                if (i22 != 0) {
                    B03 = i22;
                }
                aqVar2.e(B03, 2);
                org.telegram.ui.Components.aq aqVar3 = nc1Var.R;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                aqVar3.e(B02, 1);
                org.telegram.ui.Components.aq aqVar4 = nc1Var.R;
                if (i24 != 0) {
                    B0 = i24;
                }
                aqVar4.e(B0, 0);
                i13 = nc1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = nc1Var.y;
                    if (i14 == 0) {
                        e6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        e6Var.e = 0;
                    }
                    i16 = nc1Var.A;
                    if (i16 == 0) {
                        e6Var.f = i16;
                    } else {
                        e6Var.f = i15;
                    }
                    i17 = nc1Var.B;
                    if (i17 == 0) {
                        e6Var.g = i17;
                    } else {
                        e6Var.g = i15;
                    }
                    i18 = nc1Var.C;
                    if (i18 == 0) {
                        e6Var.h = i18;
                    } else {
                        e6Var.h = i15;
                    }
                    if (i13 == 3) {
                        nc1Var.R.e(e6Var.h, 3);
                        nc1Var.R.e(e6Var.g, 2);
                        nc1Var.R.e(e6Var.f, 1);
                        org.telegram.ui.Components.aq aqVar5 = nc1Var.R;
                        int i25 = e6Var.e;
                        if (i25 == 0) {
                            i25 = e6Var.c;
                        }
                        z11 = false;
                        aqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.g6.n1(z11, z11);
                        nc1Var.q0.f1();
                    }
                }
                z11 = false;
                org.telegram.ui.ActionBar.g6.n1(z11, z11);
                nc1Var.q0.f1();
            }
        }
        i12 = 1;
        i13 = nc1Var.n;
        if (i13 != i12) {
        }
        i14 = nc1Var.y;
        if (i14 == 0) {
        }
        i16 = nc1Var.A;
        if (i16 == 0) {
        }
        i17 = nc1Var.B;
        if (i17 == 0) {
        }
        i18 = nc1Var.C;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z11 = false;
        org.telegram.ui.ActionBar.g6.n1(z11, z11);
        nc1Var.q0.f1();
    }
}
