package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class tl implements Runnable {
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

    public /* synthetic */ tl(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
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
                np npVar = (np) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z10 = this.b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (e2Var == null) {
                    e2Var = LaunchActivity.T();
                }
                if (e2Var != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String F1 = npVar.F1(user.restriction_reason);
                        if (!TextUtils.isEmpty(F1)) {
                            np.S4(F1, e2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (e2Var.getParentLayout() instanceof ActionBarLayout) {
                                    e2Var = ((ActionBarLayout) e2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(e2Var.getFragmentView());
                                int i7 = npVar.currentAccount;
                                long j3 = user.id;
                                ki.k4 b10 = ki.k4.b(i7, j3, j3, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                    ki.x2 x2Var = new ki.x2(e2Var.getContext(), e2Var.getResourceProvider());
                                    x2Var.B(false);
                                    x2Var.C0 = true;
                                    x2Var.m0 = e2Var.getParentActivity();
                                    x2Var.x(e2Var, b10);
                                    x2Var.show();
                                    break;
                                }
                            } else {
                                e2Var.presentFragment(org.telegram.ui.an.ua(user.id));
                                break;
                            }
                        } else {
                            long j10 = user.id;
                            if (e2Var instanceof org.telegram.ui.an) {
                                j10 = ((org.telegram.ui.an) e2Var).a();
                            } else if (e2Var instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) e2Var).a();
                            }
                            if (e2Var.getParentLayout() instanceof ActionBarLayout) {
                                e2Var = ((ActionBarLayout) e2Var.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(e2Var.getFragmentView());
                            ki.k4 b11 = ki.k4.b(npVar.currentAccount, j10, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                ki.x2 x2Var2 = new ki.x2(e2Var.getContext(), e2Var.getResourceProvider());
                                x2Var2.B(true);
                                x2Var2.C0 = false;
                                x2Var2.m0 = e2Var.getParentActivity();
                                x2Var2.x(e2Var, b11);
                                x2Var2.show();
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
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new ki.z0(pbVar, pbVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tl(np npVar, org.telegram.ui.ActionBar.e2 e2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = npVar;
        this.f = e2Var;
        this.h = bVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
