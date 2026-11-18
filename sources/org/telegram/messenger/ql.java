package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements Runnable {
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

    public /* synthetic */ ql(t7 t7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, y8 y8Var) {
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
                mp mpVar = (mp) this.e;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f;
                vf.b bVar = (vf.b) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z10 = this.b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (h2Var == null) {
                    h2Var = LaunchActivity.T();
                }
                if (h2Var != null) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    if (!zArr[0]) {
                        String H1 = mpVar.H1(user.restriction_reason);
                        if (!TextUtils.isEmpty(H1)) {
                            mp.d5(H1, h2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (h2Var.getParentLayout() instanceof ActionBarLayout) {
                                    h2Var = ((ActionBarLayout) h2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                g0.v1(h2Var.getFragmentView());
                                int i7 = mpVar.currentAccount;
                                long j3 = user.id;
                                ki.f4 b10 = ki.f4.b(i7, j3, j3, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().k(b10) == null) {
                                    ki.t2 t2Var = new ki.t2(h2Var.getContext(), h2Var.getResourceProvider());
                                    t2Var.B(false);
                                    t2Var.C0 = true;
                                    t2Var.m0 = h2Var.getParentActivity();
                                    t2Var.x(h2Var, b10);
                                    t2Var.show();
                                    break;
                                }
                            } else {
                                h2Var.presentFragment(org.telegram.ui.bn.ua(user.id));
                                break;
                            }
                        } else {
                            long j10 = user.id;
                            if (h2Var instanceof org.telegram.ui.bn) {
                                j10 = ((org.telegram.ui.bn) h2Var).a();
                            } else if (h2Var instanceof ProfileActivity) {
                                j10 = ((ProfileActivity) h2Var).a();
                            }
                            if (h2Var.getParentLayout() instanceof ActionBarLayout) {
                                h2Var = ((ActionBarLayout) h2Var.getParentLayout()).getSheetFragment();
                            }
                            g0.v1(h2Var.getFragmentView());
                            ki.f4 b11 = ki.f4.b(mpVar.currentAccount, j10, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity2 = LaunchActivity.H1;
                            if (launchActivity2 == null || launchActivity2.N() == null || LaunchActivity.H1.N().k(b11) == null) {
                                ki.t2 t2Var2 = new ki.t2(h2Var.getContext(), h2Var.getResourceProvider());
                                t2Var2.B(true);
                                t2Var2.C0 = false;
                                t2Var2.m0 = h2Var.getParentActivity();
                                t2Var2.x(h2Var, b11);
                                t2Var2.show();
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
                ob obVar = t7Var.d.F;
                if (obVar != null) {
                    Utilities.d.c(new ii.i(obVar, obVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, y8Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ql(mp mpVar, org.telegram.ui.ActionBar.h2 h2Var, vf.b bVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = mpVar;
        this.f = h2Var;
        this.h = bVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
