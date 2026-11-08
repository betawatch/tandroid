package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements Runnable {
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

    public /* synthetic */ wl(t7 t7Var, boolean z9, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
        this.e = t7Var;
        this.b = z9;
        this.c = str;
        this.d = z10;
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
                qp qpVar = (qp) this.e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z9 = this.b;
                boolean z10 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (f2Var == null) {
                    f2Var = LaunchActivity.T();
                }
                if (f2Var != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = qpVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            qp.R4(F1, f2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (f2Var.getParentLayout() instanceof ActionBarLayout) {
                                    f2Var = ((ActionBarLayout) f2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(f2Var.getFragmentView());
                                int i7 = qpVar.currentAccount;
                                long j3 = user.id;
                                hi.q4 b10 = hi.q4.b(i7, j3, j3, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z9, z10);
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().k(b10) == null) {
                                    hi.a3 a3Var = new hi.a3(f2Var.getContext(), f2Var.getResourceProvider());
                                    a3Var.B(false);
                                    a3Var.B0 = true;
                                    a3Var.l0 = f2Var.getParentActivity();
                                    a3Var.x(f2Var, b10);
                                    a3Var.show();
                                    break;
                                }
                            } else {
                                f2Var.presentFragment(org.telegram.ui.an.ra(user.id));
                                break;
                            }
                        } else {
                            long j10 = user.id;
                            if (f2Var instanceof org.telegram.ui.an) {
                                j10 = ((org.telegram.ui.an) f2Var).a();
                            } else if (f2Var instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) f2Var).a();
                            }
                            if (f2Var.getParentLayout() instanceof ActionBarLayout) {
                                f2Var = ((ActionBarLayout) f2Var.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(f2Var.getFragmentView());
                            hi.q4 b11 = hi.q4.b(qpVar.currentAccount, j10, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z9, z10);
                            LaunchActivity launchActivity2 = LaunchActivity.G1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.G1.O().k(b11) == null) {
                                hi.a3 a3Var2 = new hi.a3(f2Var.getContext(), f2Var.getResourceProvider());
                                a3Var2.B(true);
                                a3Var2.B0 = false;
                                a3Var2.l0 = f2Var.getParentActivity();
                                a3Var2.x(f2Var, b11);
                                a3Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                t7 t7Var = (t7) this.e;
                boolean z11 = this.b;
                String str2 = this.c;
                boolean z12 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                y8 y8Var3 = (y8) this.s;
                if (z11) {
                    t7Var.d.n.remove(str2);
                } else {
                    t7Var.d.h.remove(str2);
                }
                if (z12) {
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
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new hi.y0(qbVar, qbVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wl(qp qpVar, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z9, boolean z10, TL_bots.BotInfo[] botInfoArr) {
        this.e = qpVar;
        this.f = f2Var;
        this.h = bVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z9;
        this.d = z10;
        this.s = botInfoArr;
    }
}
