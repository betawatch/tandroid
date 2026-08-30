package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fc1 implements org.telegram.ui.Components.jq {
    public final /* synthetic */ cd1 a;

    public fc1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // org.telegram.ui.Components.jq
    public final int I0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        cd1 cd1Var = this.a;
        if (cd1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = cd1Var.b0;
        if (i6Var.P && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.X.get(org.telegram.ui.ActionBar.j6.n)) != null) {
            return h6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.jq
    public final void k(boolean z4) {
        int i10;
        int i11;
        cd1 cd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.s;
        if (!z4) {
            org.telegram.ui.Components.z4.W(cd1Var, 1, null, null);
            return;
        }
        if (h6Var.r == null) {
            cd1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(h6Var.b, h6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.b, h6Var);
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.p2) cd1Var).currentAccount;
        sb.append(MessagesController.getInstance(i10).linkPrefix);
        sb.append("/addtheme/");
        sb.append(h6Var.r.slug);
        String sb2 = sb.toString();
        cd1Var.showDialog(new org.telegram.ui.Components.lq0(cd1Var.getParentActivity(), null, sb2, false, sb2, false, null));
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
    @Override // org.telegram.ui.Components.jq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(int i10, int i11, boolean z4) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        cd1 cd1Var = this.a;
        if (cd1Var.b == 2) {
            cd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = cd1Var.V;
        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.s;
        if (i11 != -1) {
            int i19 = cd1Var.U;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            cd1Var.T = i10;
            cd1Var.U = i11;
            if (z4) {
                runnable.run();
                return;
            } else {
                if (cd1Var.W) {
                    return;
                }
                cd1Var.W = true;
                cd1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = cd1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j10 = cd1Var.F;
            if (j10 != 0) {
                h6Var.j = j10;
            } else {
                h6Var.j = 0L;
            }
            long j11 = cd1Var.G;
            if (j11 != 0) {
                h6Var.k = j11;
            } else {
                h6Var.k = 0L;
            }
            long j12 = cd1Var.H;
            if (j12 != 0) {
                h6Var.l = j12;
            } else {
                h6Var.l = 0L;
            }
            long j13 = cd1Var.I;
            if (j13 != 0) {
                h6Var.m = j13;
            } else {
                h6Var.m = 0L;
            }
            h6Var.n = cd1Var.L;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                int i21 = (int) h6Var.k;
                int i22 = (int) h6Var.l;
                int i23 = (int) h6Var.m;
                int i24 = (int) h6Var.j;
                org.telegram.ui.Components.kq kqVar = cd1Var.S;
                if (i23 != 0) {
                    B04 = i23;
                }
                kqVar.e(B04, 3);
                org.telegram.ui.Components.kq kqVar2 = cd1Var.S;
                if (i22 != 0) {
                    B03 = i22;
                }
                kqVar2.e(B03, 2);
                org.telegram.ui.Components.kq kqVar3 = cd1Var.S;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                kqVar3.e(B02, 1);
                org.telegram.ui.Components.kq kqVar4 = cd1Var.S;
                if (i24 != 0) {
                    B0 = i24;
                }
                kqVar4.e(B0, 0);
                i13 = cd1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = cd1Var.y;
                    if (i14 == 0) {
                        h6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        h6Var.e = 0;
                    }
                    i16 = cd1Var.B;
                    if (i16 == 0) {
                        h6Var.f = i16;
                    } else {
                        h6Var.f = i15;
                    }
                    i17 = cd1Var.C;
                    if (i17 == 0) {
                        h6Var.g = i17;
                    } else {
                        h6Var.g = i15;
                    }
                    i18 = cd1Var.D;
                    if (i18 == 0) {
                        h6Var.h = i18;
                    } else {
                        h6Var.h = i15;
                    }
                    if (i13 == 3) {
                        cd1Var.S.e(h6Var.h, 3);
                        cd1Var.S.e(h6Var.g, 2);
                        cd1Var.S.e(h6Var.f, 1);
                        org.telegram.ui.Components.kq kqVar5 = cd1Var.S;
                        int i25 = h6Var.e;
                        if (i25 == 0) {
                            i25 = h6Var.c;
                        }
                        z10 = false;
                        kqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.j6.n1(z10, z10);
                        cd1Var.r0.f1();
                    }
                }
                z10 = false;
                org.telegram.ui.ActionBar.j6.n1(z10, z10);
                cd1Var.r0.f1();
            }
        }
        i12 = 1;
        i13 = cd1Var.n;
        if (i13 != i12) {
        }
        i14 = cd1Var.y;
        if (i14 == 0) {
        }
        i16 = cd1Var.B;
        if (i16 == 0) {
        }
        i17 = cd1Var.C;
        if (i17 == 0) {
        }
        i18 = cd1Var.D;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z10 = false;
        org.telegram.ui.ActionBar.j6.n1(z10, z10);
        cd1Var.r0.f1();
    }

    @Override // org.telegram.ui.Components.jq
    public final void z() {
        cd1 cd1Var = this.a;
        if (cd1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cd1Var.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new il0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        cd1Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
