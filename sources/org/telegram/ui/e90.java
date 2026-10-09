package org.telegram.ui;

import android.widget.ImageView;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (((org.telegram.ui.zn) r15).a() == r7.longValue()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0155, code lost:
    
        if (r0.getCurrentFragmetDialogId() == r7.longValue()) goto L59;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10 = this.a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                of.e eVar = (of.e) obj6;
                Long l4 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                Runnable runnable = (Runnable) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    eVar.b();
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R instanceof fh0) {
                    R = ((fh0) R).X();
                }
                org.telegram.ui.ActionBar.n2 n2Var = R;
                if (n2Var != null) {
                    org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
                    if (n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().K0) {
                        resourceProvider = n2Var.getLastStoryViewer().y;
                    }
                    rg.j0 j0Var = new rg.j0(19, launchActivity.O, launchActivity, n2Var, resourceProvider);
                    j0Var.H1(canApplyBoost);
                    if (n2Var instanceof zn) {
                        break;
                    } else if (n2Var instanceof ty) {
                        nx nxVar = ((ty) n2Var).F3;
                        if (nxVar != null) {
                            break;
                        }
                        r2 = false;
                        z10 = r2;
                    }
                    j0Var.G1(tL_premium_boostsStatus, z10);
                    j0Var.I1(l4.longValue());
                    j0Var.g0 = u1Var;
                    n2Var.showDialog(j0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                of.e eVar2 = (of.e) obj6;
                Runnable runnable2 = (Runnable) obj2;
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj4;
                Long l10 = (Long) obj5;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_premium_boostsStatus2 != null) {
                    channelBoostsController.userCanBoostChannel(l10.longValue(), tL_premium_boostsStatus2, new e90(launchActivity2, eVar2, l10, tL_premium_boostsStatus2, u1Var2, runnable2, 0));
                    break;
                } else {
                    if (eVar2 != null) {
                        eVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj3;
                ai.db dbVar = (ai.db) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.f3[]) obj7)[0] = null;
                ml0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        dbVar.run();
                        break;
                    } else {
                        ml0.a = f3Var;
                        f3Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                gg.x0 x0Var = (gg.x0) obj2;
                String str = (String) obj;
                ((ci.d) obj7).setLoading(false);
                ((ci.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str != null) {
                    org.telegram.ui.Components.ad.c0(str, i2Var.topBulletinContainer, e6Var);
                    x0Var.run();
                    break;
                } else {
                    i2Var.dismiss();
                    break;
                }
            default:
                ci.d dVar = (ci.d) obj6;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                org.telegram.ui.Wallet.k kVar = (org.telegram.ui.Wallet.k) obj3;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj2;
                String str2 = (String) obj;
                ((ci.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str2 != null) {
                    org.telegram.ui.Components.ad.c0(str2, h2Var.topBulletinContainer, e6Var2);
                    kVar.run();
                    dVar.setEnabled((z1Var.n || z1Var.o) ? false : true);
                    break;
                } else {
                    h2Var.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e90(LaunchActivity launchActivity, of.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = eVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l4;
        this.f = u1Var;
    }
}
