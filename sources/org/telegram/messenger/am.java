package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements Runnable {
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

    public /* synthetic */ am(y7 y7Var, boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, d9 d9Var) {
        this.e = y7Var;
        this.b = z10;
        this.c = str;
        this.d = z11;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.s = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d9 d9Var;
        d9 d9Var2;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f;
                gf.e eVar = (gf.e) this.h;
                boolean[] zArr = (boolean[]) this.n;
                TLRPC.User user = (TLRPC.User) this.r;
                String str = this.c;
                boolean z10 = this.b;
                boolean z11 = this.d;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.s;
                if (k2Var == null) {
                    k2Var = LaunchActivity.T();
                }
                if (k2Var != null) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    if (!zArr[0]) {
                        String E1 = vpVar.E1(user.restriction_reason);
                        if (!TextUtils.isEmpty(E1)) {
                            vp.O4(E1, k2Var);
                            break;
                        } else if (!user.bot_has_main_app) {
                            TL_bots.BotInfo botInfo = botInfoArr[0];
                            if (botInfo != null && (botInfo.menu_button instanceof TL_bots.TL_botMenuButton)) {
                                if (k2Var.getParentLayout() instanceof ActionBarLayout) {
                                    k2Var = ((ActionBarLayout) k2Var.getParentLayout()).getSheetFragment();
                                }
                                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botInfoArr[0].menu_button;
                                i0.v1(k2Var.getFragmentView());
                                int i10 = vpVar.currentAccount;
                                long j10 = user.id;
                                xh.s3 b10 = xh.s3.b(i10, j10, j10, tL_botMenuButton.text, tL_botMenuButton.url, 2, 0, 0L, null, false, str, user, 0, z10, z11);
                                LaunchActivity launchActivity = LaunchActivity.I1;
                                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().m(b10) == null) {
                                    xh.m2 m2Var = new xh.m2(k2Var.getContext(), k2Var.getResourceProvider());
                                    m2Var.B(false);
                                    m2Var.B0 = true;
                                    m2Var.l0 = k2Var.getParentActivity();
                                    m2Var.x(k2Var, b10);
                                    m2Var.show();
                                    break;
                                }
                            } else {
                                k2Var.presentFragment(org.telegram.ui.un.ha(user.id));
                                break;
                            }
                        } else {
                            long j11 = user.id;
                            if (k2Var instanceof org.telegram.ui.un) {
                                j11 = ((org.telegram.ui.un) k2Var).a();
                            } else if (k2Var instanceof ProfileActivity) {
                                j11 = ((ProfileActivity) k2Var).a();
                            }
                            if (k2Var.getParentLayout() instanceof ActionBarLayout) {
                                k2Var = ((ActionBarLayout) k2Var.getParentLayout()).getSheetFragment();
                            }
                            i0.v1(k2Var.getFragmentView());
                            xh.s3 b11 = xh.s3.b(vpVar.currentAccount, j11, user.id, null, null, 4, 0, 0L, null, false, str, user, 0, z10, z11);
                            LaunchActivity launchActivity2 = LaunchActivity.I1;
                            if (launchActivity2 == null || launchActivity2.O() == null || LaunchActivity.I1.O().m(b11) == null) {
                                xh.m2 m2Var2 = new xh.m2(k2Var.getContext(), k2Var.getResourceProvider());
                                m2Var2.B(true);
                                m2Var2.B0 = false;
                                m2Var2.l0 = k2Var.getParentActivity();
                                m2Var2.x(k2Var, b11);
                                m2Var2.show();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                y7 y7Var = (y7) this.e;
                boolean z12 = this.b;
                String str2 = this.c;
                boolean z13 = this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) this.f;
                TLRPC.InputEncryptedFile inputEncryptedFile = (TLRPC.InputEncryptedFile) this.h;
                byte[] bArr = (byte[]) this.n;
                byte[] bArr2 = (byte[]) this.r;
                d9 d9Var3 = (d9) this.s;
                if (z12) {
                    y7Var.d.n.remove(str2);
                } else {
                    y7Var.d.h.remove(str2);
                }
                if (z13) {
                    b8 b8Var = y7Var.d;
                    int i11 = b8Var.s - 1;
                    b8Var.s = i11;
                    if (i11 < 1 && (d9Var2 = (d9) b8Var.f.poll()) != null) {
                        y7Var.d.s++;
                        d9Var2.c();
                    }
                } else {
                    b8 b8Var2 = y7Var.d;
                    int i12 = b8Var2.r - 1;
                    b8Var2.r = i12;
                    if (i12 < 1 && (d9Var = (d9) b8Var2.e.poll()) != null) {
                        y7Var.d.r++;
                        d9Var.c();
                    }
                }
                rb rbVar = y7Var.d.E;
                if (rbVar != null) {
                    Utilities.d.c(new pb(rbVar, rbVar.a, str2, inputFile, inputEncryptedFile, bArr, bArr2, d9Var3.t));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ am(vp vpVar, org.telegram.ui.ActionBar.k2 k2Var, gf.e eVar, boolean[] zArr, TLRPC.User user, String str, boolean z10, boolean z11, TL_bots.BotInfo[] botInfoArr) {
        this.e = vpVar;
        this.f = k2Var;
        this.h = eVar;
        this.n = zArr;
        this.r = user;
        this.c = str;
        this.b = z10;
        this.d = z11;
        this.s = botInfoArr;
    }
}
