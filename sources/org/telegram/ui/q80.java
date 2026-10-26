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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (((org.telegram.ui.un) r15).a() == r7.longValue()) goto L59;
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
                qf.c cVar = (qf.c) obj6;
                Long l4 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj3;
                Runnable runnable = (Runnable) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.D1;
                if (cVar != null) {
                    cVar.b();
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R instanceof pg0) {
                    R = ((pg0) R).X();
                }
                org.telegram.ui.ActionBar.r2 r2Var = R;
                if (r2Var != null) {
                    org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
                    if (r2Var.getLastStoryViewer() != null && r2Var.getLastStoryViewer().K0) {
                        resourceProvider = r2Var.getLastStoryViewer().y;
                    }
                    tg.j0 j0Var = new tg.j0(19, launchActivity.O, launchActivity, r2Var, resourceProvider);
                    j0Var.K1(canApplyBoost);
                    if (r2Var instanceof un) {
                        break;
                    } else if (r2Var instanceof cy) {
                        tw twVar = ((cy) r2Var).G3;
                        if (twVar != null) {
                            break;
                        }
                        r2 = false;
                        z10 = r2;
                    }
                    j0Var.J1(tL_premium_boostsStatus, z10);
                    j0Var.L1(l4.longValue());
                    j0Var.g0 = s1Var;
                    r2Var.showDialog(j0Var);
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                qf.c cVar2 = (qf.c) obj6;
                Runnable runnable2 = (Runnable) obj2;
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj4;
                Long l10 = (Long) obj5;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (tL_premium_boostsStatus2 != null) {
                    channelBoostsController.userCanBoostChannel(l10.longValue(), tL_premium_boostsStatus2, new q80(launchActivity2, cVar2, l10, tL_premium_boostsStatus2, s1Var2, runnable2, 0));
                    break;
                } else {
                    if (cVar2 != null) {
                        cVar2.b();
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
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj3;
                ag.q0 q0Var = (ag.q0) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.k3[]) obj7)[0] = null;
                dl0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        q0Var.run();
                        break;
                    } else {
                        dl0.a = k3Var;
                        k3Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                ig.x0 x0Var = (ig.x0) obj2;
                String str = (String) obj;
                ((fi.d) obj7).setLoading(false);
                ((fi.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str != null) {
                    org.telegram.ui.Components.wc.d0(str, j2Var.topBulletinContainer, u6Var);
                    x0Var.run();
                    break;
                } else {
                    j2Var.dismiss();
                    break;
                }
            default:
                fi.d dVar = (fi.d) obj6;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj5;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj4;
                org.telegram.ui.Wallet.h hVar = (org.telegram.ui.Wallet.h) obj3;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                String str2 = (String) obj;
                ((fi.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str2 != null) {
                    org.telegram.ui.Components.wc.d0(str2, i2Var.topBulletinContainer, u6Var2);
                    hVar.run();
                    dVar.setEnabled((a2Var.n || a2Var.o) ? false : true);
                    break;
                } else {
                    i2Var.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q80(LaunchActivity launchActivity, qf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.s1 s1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = cVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l4;
        this.f = s1Var;
    }
}
