package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gc1 implements org.telegram.ui.Components.lq {
    public final /* synthetic */ ed1 a;

    public gc1(ed1 ed1Var) {
        this.a = ed1Var;
    }

    @Override // org.telegram.ui.Components.lq
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        ed1 ed1Var = this.a;
        if (ed1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = ed1Var.b0;
        if (j6Var.P && i10 == 0 && (i6Var = (org.telegram.ui.ActionBar.i6) j6Var.X.get(org.telegram.ui.ActionBar.k6.n)) != null) {
            return i6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.lq
    public final void k(boolean z4) {
        int i10;
        int i11;
        ed1 ed1Var = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.s;
        if (!z4) {
            org.telegram.ui.Components.z4.W(ed1Var, 1, null, null);
            return;
        }
        if (i6Var.r == null) {
            ed1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(i6Var.b, i6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, i6Var.b, i6Var);
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.p2) ed1Var).currentAccount;
        sb.append(MessagesController.getInstance(i10).linkPrefix);
        sb.append("/addtheme/");
        sb.append(i6Var.r.slug);
        String sb2 = sb.toString();
        ed1Var.showDialog(new org.telegram.ui.Components.mq0(ed1Var.getParentActivity(), null, sb2, false, sb2, false, null));
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
    public final void v0(int i10, int i11, boolean z4) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        ed1 ed1Var = this.a;
        if (ed1Var.b == 2) {
            ed1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = ed1Var.V;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.s;
        if (i11 != -1) {
            int i19 = ed1Var.U;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            ed1Var.T = i10;
            ed1Var.U = i11;
            if (z4) {
                runnable.run();
                return;
            } else {
                if (ed1Var.W) {
                    return;
                }
                ed1Var.W = true;
                ed1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = ed1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j10 = ed1Var.F;
            if (j10 != 0) {
                i6Var.j = j10;
            } else {
                i6Var.j = 0L;
            }
            long j11 = ed1Var.G;
            if (j11 != 0) {
                i6Var.k = j11;
            } else {
                i6Var.k = 0L;
            }
            long j12 = ed1Var.H;
            if (j12 != 0) {
                i6Var.l = j12;
            } else {
                i6Var.l = 0L;
            }
            long j13 = ed1Var.I;
            if (j13 != 0) {
                i6Var.m = j13;
            } else {
                i6Var.m = 0L;
            }
            i6Var.n = ed1Var.L;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
                int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                int B04 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                int i21 = (int) i6Var.k;
                int i22 = (int) i6Var.l;
                int i23 = (int) i6Var.m;
                int i24 = (int) i6Var.j;
                org.telegram.ui.Components.mq mqVar = ed1Var.S;
                if (i23 != 0) {
                    B04 = i23;
                }
                mqVar.e(B04, 3);
                org.telegram.ui.Components.mq mqVar2 = ed1Var.S;
                if (i22 != 0) {
                    B03 = i22;
                }
                mqVar2.e(B03, 2);
                org.telegram.ui.Components.mq mqVar3 = ed1Var.S;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                mqVar3.e(B02, 1);
                org.telegram.ui.Components.mq mqVar4 = ed1Var.S;
                if (i24 != 0) {
                    B0 = i24;
                }
                mqVar4.e(B0, 0);
                i13 = ed1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = ed1Var.y;
                    if (i14 == 0) {
                        i6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        i6Var.e = 0;
                    }
                    i16 = ed1Var.B;
                    if (i16 == 0) {
                        i6Var.f = i16;
                    } else {
                        i6Var.f = i15;
                    }
                    i17 = ed1Var.C;
                    if (i17 == 0) {
                        i6Var.g = i17;
                    } else {
                        i6Var.g = i15;
                    }
                    i18 = ed1Var.D;
                    if (i18 == 0) {
                        i6Var.h = i18;
                    } else {
                        i6Var.h = i15;
                    }
                    if (i13 == 3) {
                        ed1Var.S.e(i6Var.h, 3);
                        ed1Var.S.e(i6Var.g, 2);
                        ed1Var.S.e(i6Var.f, 1);
                        org.telegram.ui.Components.mq mqVar5 = ed1Var.S;
                        int i25 = i6Var.e;
                        if (i25 == 0) {
                            i25 = i6Var.c;
                        }
                        z10 = false;
                        mqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.k6.n1(z10, z10);
                        ed1Var.r0.f1();
                    }
                }
                z10 = false;
                org.telegram.ui.ActionBar.k6.n1(z10, z10);
                ed1Var.r0.f1();
            }
        }
        i12 = 1;
        i13 = ed1Var.n;
        if (i13 != i12) {
        }
        i14 = ed1Var.y;
        if (i14 == 0) {
        }
        i16 = ed1Var.B;
        if (i16 == 0) {
        }
        i17 = ed1Var.C;
        if (i17 == 0) {
        }
        i18 = ed1Var.D;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z10 = false;
        org.telegram.ui.ActionBar.k6.n1(z10, z10);
        ed1Var.r0.f1();
    }

    @Override // org.telegram.ui.Components.lq
    public final void x() {
        ed1 ed1Var = this.a;
        if (ed1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ed1Var.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        ed1Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
        }
    }
}
