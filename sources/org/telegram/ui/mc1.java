package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mc1 implements org.telegram.ui.Components.iq {
    public final /* synthetic */ jd1 a;

    public mc1(jd1 jd1Var) {
        this.a = jd1Var;
    }

    @Override // org.telegram.ui.Components.iq
    public final int H0(int i10) {
        org.telegram.ui.ActionBar.h6 h6Var;
        jd1 jd1Var = this.a;
        if (jd1Var.n != 3) {
            return 0;
        }
        org.telegram.ui.ActionBar.i6 i6Var = jd1Var.b0;
        if (i6Var.P && i10 == 0 && (h6Var = (org.telegram.ui.ActionBar.h6) i6Var.X.get(org.telegram.ui.ActionBar.j6.n)) != null) {
            return h6Var.e;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.iq
    public final void k(boolean z4) {
        int i10;
        int i11;
        jd1 jd1Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.s;
        if (!z4) {
            org.telegram.ui.Components.z4.W(jd1Var, 1, null, null);
            return;
        }
        if (h6Var.r == null) {
            jd1Var.finishFragment();
            i11 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
            MessagesController.getInstance(i11).saveThemeToServer(h6Var.b, h6Var);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, h6Var.b, h6Var);
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        i10 = ((org.telegram.ui.ActionBar.p2) jd1Var).currentAccount;
        sb.append(MessagesController.getInstance(i10).linkPrefix);
        sb.append("/addtheme/");
        sb.append(h6Var.r.slug);
        String sb2 = sb.toString();
        jd1Var.showDialog(new org.telegram.ui.Components.lq0(jd1Var.getParentActivity(), null, sb2, false, sb2, false, null));
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
    @Override // org.telegram.ui.Components.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(int i10, int i11, boolean z4) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        jd1 jd1Var = this.a;
        if (jd1Var.b == 2) {
            jd1Var.a1(i10, i11, true);
            return;
        }
        Runnable runnable = jd1Var.V;
        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.s;
        if (i11 != -1) {
            int i19 = jd1Var.U;
            if (i19 != -1 && i19 != i11) {
                runnable.run();
            }
            jd1Var.T = i10;
            jd1Var.U = i11;
            if (z4) {
                runnable.run();
                return;
            } else {
                if (jd1Var.W) {
                    return;
                }
                jd1Var.W = true;
                jd1Var.fragmentView.postDelayed(runnable, 16L);
                return;
            }
        }
        int i20 = jd1Var.n;
        if (i20 == 1 || i20 == 2) {
            long j10 = jd1Var.F;
            if (j10 != 0) {
                h6Var.j = j10;
            } else {
                h6Var.j = 0L;
            }
            long j11 = jd1Var.G;
            if (j11 != 0) {
                h6Var.k = j11;
            } else {
                h6Var.k = 0L;
            }
            long j12 = jd1Var.H;
            if (j12 != 0) {
                h6Var.l = j12;
            } else {
                h6Var.l = 0L;
            }
            long j13 = jd1Var.I;
            if (j13 != 0) {
                h6Var.m = j13;
            } else {
                h6Var.m = 0L;
            }
            h6Var.n = jd1Var.L;
            if (i20 == 2) {
                int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Nd);
                int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                int B04 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                int i21 = (int) h6Var.k;
                int i22 = (int) h6Var.l;
                int i23 = (int) h6Var.m;
                int i24 = (int) h6Var.j;
                org.telegram.ui.Components.jq jqVar = jd1Var.S;
                if (i23 != 0) {
                    B04 = i23;
                }
                jqVar.e(B04, 3);
                org.telegram.ui.Components.jq jqVar2 = jd1Var.S;
                if (i22 != 0) {
                    B03 = i22;
                }
                jqVar2.e(B03, 2);
                org.telegram.ui.Components.jq jqVar3 = jd1Var.S;
                if (i21 != 0) {
                    B02 = i21;
                }
                i12 = 1;
                jqVar3.e(B02, 1);
                org.telegram.ui.Components.jq jqVar4 = jd1Var.S;
                if (i24 != 0) {
                    B0 = i24;
                }
                jqVar4.e(B0, 0);
                i13 = jd1Var.n;
                if (i13 != i12 || i13 == 3) {
                    i14 = jd1Var.y;
                    if (i14 == 0) {
                        h6Var.e = i14;
                        i15 = 0;
                    } else {
                        i15 = 0;
                        h6Var.e = 0;
                    }
                    i16 = jd1Var.B;
                    if (i16 == 0) {
                        h6Var.f = i16;
                    } else {
                        h6Var.f = i15;
                    }
                    i17 = jd1Var.C;
                    if (i17 == 0) {
                        h6Var.g = i17;
                    } else {
                        h6Var.g = i15;
                    }
                    i18 = jd1Var.D;
                    if (i18 == 0) {
                        h6Var.h = i18;
                    } else {
                        h6Var.h = i15;
                    }
                    if (i13 == 3) {
                        jd1Var.S.e(h6Var.h, 3);
                        jd1Var.S.e(h6Var.g, 2);
                        jd1Var.S.e(h6Var.f, 1);
                        org.telegram.ui.Components.jq jqVar5 = jd1Var.S;
                        int i25 = h6Var.e;
                        if (i25 == 0) {
                            i25 = h6Var.c;
                        }
                        z10 = false;
                        jqVar5.e(i25, 0);
                        org.telegram.ui.ActionBar.j6.n1(z10, z10);
                        jd1Var.r0.e1();
                    }
                }
                z10 = false;
                org.telegram.ui.ActionBar.j6.n1(z10, z10);
                jd1Var.r0.e1();
            }
        }
        i12 = 1;
        i13 = jd1Var.n;
        if (i13 != i12) {
        }
        i14 = jd1Var.y;
        if (i14 == 0) {
        }
        i16 = jd1Var.B;
        if (i16 == 0) {
        }
        i17 = jd1Var.C;
        if (i17 == 0) {
        }
        i18 = jd1Var.D;
        if (i18 == 0) {
        }
        if (i13 == 3) {
        }
        z10 = false;
        org.telegram.ui.ActionBar.j6.n1(z10, z10);
        jd1Var.r0.e1();
    }

    @Override // org.telegram.ui.Components.iq
    public final void z() {
        jd1 jd1Var = this.a;
        if (jd1Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jd1Var.getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteThemeTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteThemeAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(this, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        jd1Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }
}
