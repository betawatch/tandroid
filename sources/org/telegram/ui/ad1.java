package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ad1 implements org.telegram.ui.Components.lq {
    public final /* synthetic */ xd1 a;

    public ad1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // org.telegram.ui.Components.lq
    public final int K0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        xd1 xd1Var = this.a;
        if (xd1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = xd1Var.e0;
        if (i6Var.S && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.a0.get(org.telegram.ui.ActionBar.j6.n)) != null) {
            return h6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.lq
    public final void l(boolean z10) {
        int i10;
        int i11;
        xd1 xd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.s;
        if (!z10) {
            org.telegram.ui.Components.d5.W(xd1Var, 1, null, null);
            return;
        }
        if (h6Var.r == null) {
            xd1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(h6Var.b, h6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.b, h6Var);
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.n2) xd1Var).currentAccount;
        sb2.append(MessagesController.getInstance(i10).linkPrefix);
        sb2.append("/addtheme/");
        sb2.append(h6Var.r.slug);
        String sb3 = sb2.toString();
        xd1Var.showDialog(new org.telegram.ui.Components.wq0(xd1Var.getParentActivity(), null, sb3, false, sb3, false, null));
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
    @Override // org.telegram.ui.Components.lq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        xd1 xd1Var = this.a;
        if (xd1Var.b == 2) {
            xd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = xd1Var.Y;
        org.telegram.ui.ActionBar.h6 h6Var = xd1Var.s;
        if (i11 != -1) {
            int i19 = xd1Var.X;
            if (i19 != -1 && i19 != i11) {
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
        int i20 = xd1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j3 = xd1Var.I;
            if (j3 != 0) {
                h6Var.j = j3;
            } else {
                h6Var.j = 0L;
            }
            long j10 = xd1Var.J;
            if (j10 != 0) {
                h6Var.k = j10;
            } else {
                h6Var.k = 0L;
            }
            long j11 = xd1Var.K;
            if (j11 != 0) {
                h6Var.l = j11;
            } else {
                h6Var.l = 0L;
            }
            long j12 = xd1Var.L;
            if (j12 != 0) {
                h6Var.m = j12;
            } else {
                h6Var.m = 0L;
            }
            h6Var.n = xd1Var.O;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                int i21 = (int) h6Var.k;
                int i22 = (int) h6Var.l;
                int i23 = (int) h6Var.m;
                int i24 = (int) h6Var.j;
                org.telegram.ui.Components.mq mqVar = xd1Var.V;
                if (i23 != 0) {
                    B04 = i23;
                }
                mqVar.e(B04, 3);
                org.telegram.ui.Components.mq mqVar2 = xd1Var.V;
                if (i22 != 0) {
                    B03 = i22;
                }
                mqVar2.e(B03, 2);
                org.telegram.ui.Components.mq mqVar3 = xd1Var.V;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                mqVar3.e(B02, 1);
                org.telegram.ui.Components.mq mqVar4 = xd1Var.V;
                if (i24 != 0) {
                    B0 = i24;
                }
                mqVar4.e(B0, 0);
                i13 = xd1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = xd1Var.y;
                    if (i14 == 0) {
                        h6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        h6Var.e = 0;
                    }
                    i16 = xd1Var.E;
                    if (i16 == 0) {
                        h6Var.f = i16;
                    } else {
                        h6Var.f = i15;
                    }
                    i17 = xd1Var.F;
                    if (i17 == 0) {
                        h6Var.g = i17;
                    } else {
                        h6Var.g = i15;
                    }
                    i18 = xd1Var.G;
                    if (i18 == 0) {
                        h6Var.h = i18;
                    } else {
                        h6Var.h = i15;
                    }
                    if (i13 == 3) {
                        xd1Var.V.e(h6Var.h, 3);
                        xd1Var.V.e(h6Var.g, 2);
                        xd1Var.V.e(h6Var.f, 1);
                        org.telegram.ui.Components.mq mqVar5 = xd1Var.V;
                        int i25 = h6Var.e;
                        if (i25 == 0) {
                            i25 = h6Var.c;
                        }
                        z11 = false;
                        mqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.j6.n1(z11, z11);
                        xd1Var.u0.g1();
                    }
                }
                z11 = false;
                org.telegram.ui.ActionBar.j6.n1(z11, z11);
                xd1Var.u0.g1();
            }
        }
        i12 = 1;
        i13 = xd1Var.n;
        if (i13 != i12) {
        }
        i14 = xd1Var.y;
        if (i14 == 0) {
        }
        i16 = xd1Var.E;
        if (i16 == 0) {
        }
        i17 = xd1Var.F;
        if (i17 == 0) {
        }
        i18 = xd1Var.G;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z11 = false;
        org.telegram.ui.ActionBar.j6.n1(z11, z11);
        xd1Var.u0.g1();
    }

    @Override // org.telegram.ui.Components.lq
    public final void y() {
        xd1 xd1Var = this.a;
        if (xd1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd1Var.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ol0(this, 22));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        xd1Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(xd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
