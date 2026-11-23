package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
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

    public /* synthetic */ rl(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z10 = this.b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (g2Var == null) {
                    g2Var = LaunchActivity.T();
                }
                if (g2Var != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String H1 = npVar.H1(user.restriction_reason);
                        if (!TextUtils.isEmpty(H1)) {
                            np.d5(H1, g2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (g2Var.getParentLayout() instanceof ActionBarLayout) {
                                    g2Var = ((ActionBarLayout) g2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(g2Var.getFragmentView());
                                int i7 = npVar.currentAccount;
                                long j3 = user.id;
                                ki.e4 b10 = ki.e4.b(i7, j3, j3, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                    ki.s2 s2Var = new ki.s2(g2Var.getContext(), g2Var.getResourceProvider());
                                    s2Var.B(false);
                                    s2Var.C0 = true;
                                    s2Var.m0 = g2Var.getParentActivity();
                                    s2Var.x(g2Var, b10);
                                    s2Var.show();
                                    break;
                                }
                            } else {
                                g2Var.presentFragment(org.telegram.ui.bn.ua(user.id));
                                break;
                            }
                        } else {
                            long j10 = user.id;
                            if (g2Var instanceof org.telegram.ui.bn) {
                                j10 = ((org.telegram.ui.bn) g2Var).a();
                            } else if (g2Var instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) g2Var).a();
                            }
                            if (g2Var.getParentLayout() instanceof ActionBarLayout) {
                                g2Var = ((ActionBarLayout) g2Var.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(g2Var.getFragmentView());
                            ki.e4 b11 = ki.e4.b(npVar.currentAccount, j10, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                ki.s2 s2Var2 = new ki.s2(g2Var.getContext(), g2Var.getResourceProvider());
                                s2Var2.B(true);
                                s2Var2.C0 = false;
                                s2Var2.m0 = g2Var.getParentActivity();
                                s2Var2.x(g2Var, b11);
                                s2Var2.show();
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
                    Utilities.d.c(new ii.i(pbVar, pbVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rl(np npVar, org.telegram.ui.ActionBar.g2 g2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = npVar;
        this.f = g2Var;
        this.h = bVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
