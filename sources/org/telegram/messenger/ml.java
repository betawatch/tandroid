package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ml implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ml(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.e = t7Var;
        this.b = z10;
        this.c = str;
        this.d = z11;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
                sf.b bVar = (sf.b) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z10 = this.b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (d2Var == null) {
                    d2Var = LaunchActivity.T();
                }
                if (d2Var != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = hpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            hp.R4(F1, d2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (d2Var.getParentLayout() instanceof ActionBarLayout) {
                                    d2Var = ((ActionBarLayout) d2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(d2Var.getFragmentView());
                                int i3 = hpVar.currentAccount;
                                long j10 = user.id;
                                ii.q4 b10 = ii.q4.b(i3, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity = LaunchActivity.K1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().k(b10) == null) {
                                    ii.a3 a3Var = new ii.a3(d2Var.getContext(), d2Var.getResourceProvider());
                                    a3Var.B(false);
                                    a3Var.C0 = true;
                                    a3Var.m0 = d2Var.getParentActivity();
                                    a3Var.x(d2Var, b10);
                                    a3Var.show();
                                    break;
                                }
                            } else {
                                d2Var.presentFragment(org.telegram.ui.wm.ra(user.id));
                                break;
                            }
                        } else {
                            long j11 = user.id;
                            if (d2Var instanceof org.telegram.ui.wm) {
                                j11 = ((org.telegram.ui.wm) d2Var).a();
                            } else if (d2Var instanceof ProfileActivity) {
                                j11 = ((ProfileActivity) d2Var).a();
                            }
                            if (d2Var.getParentLayout() instanceof ActionBarLayout) {
                                d2Var = ((ActionBarLayout) d2Var.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(d2Var.getFragmentView());
                            ii.q4 b11 = ii.q4.b(hpVar.currentAccount, j11, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity2 = LaunchActivity.K1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.K1.O().k(b11) == null) {
                                ii.a3 a3Var2 = new ii.a3(d2Var.getContext(), d2Var.getResourceProvider());
                                a3Var2.B(true);
                                a3Var2.C0 = false;
                                a3Var2.m0 = d2Var.getParentActivity();
                                a3Var2.x(d2Var, b11);
                                a3Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                t7 t7Var = (t7) this.e;
                boolean z12 = this.b;
                String str2 = this.c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                y8 y8Var3 = (y8) this.s;
                if (z12) {
                    t7Var.d.n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i10 = w7Var.s - 1;
                    w7Var.s = i10;
                    if (i10 < 1 && (y8Var2 = (y8) w7Var.f.poll()) != null) {
                        t7Var.d.s++;
                        y8Var2.c();
                    }
                } else {
                    w7 w7Var2 = t7Var.d;
                    int i11 = w7Var2.r - 1;
                    w7Var2.r = i11;
                    if (i11 < 1 && (y8Var = (y8) w7Var2.e.poll()) != null) {
                        t7Var.d.r++;
                        y8Var.c();
                    }
                }
                jb jbVar = t7Var.d.F;
                if (jbVar != null) {
                    Utilities.d.c(new ii.z0(jbVar, jbVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ml(hp hpVar, org.telegram.ui.ActionBar.d2 d2Var, sf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = hpVar;
        this.f = d2Var;
        this.h = bVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
