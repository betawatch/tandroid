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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j90(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
        this.f = obj5;
        this.d = obj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (((org.telegram.ui.fo) r15).a() == r7.longValue()) goto L59;
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
                pf.c cVar = (pf.c) obj6;
                Long l4 = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                Runnable runnable = (Runnable) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.B1;
                if (cVar != null) {
                    cVar.b();
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R instanceof jh0) {
                    R = ((jh0) R).X();
                }
                org.telegram.ui.ActionBar.m2 m2Var = R;
                if (m2Var != null) {
                    org.telegram.ui.ActionBar.c6 resourceProvider = m2Var.getResourceProvider();
                    if (m2Var.getLastStoryViewer() != null && m2Var.getLastStoryViewer().K0) {
                        resourceProvider = m2Var.getLastStoryViewer().y;
                    }
                    sg.j0 j0Var = new sg.j0(19, launchActivity.O, launchActivity, m2Var, resourceProvider);
                    j0Var.H1(canApplyBoost);
                    if (m2Var instanceof fo) {
                        break;
                    } else if (m2Var instanceof yy) {
                        sx sxVar = ((yy) m2Var).G3;
                        if (sxVar != null) {
                            break;
                        }
                        r2 = false;
                        z10 = r2;
                    }
                    j0Var.G1(tL_premium_boostsStatus, z10);
                    j0Var.I1(l4.longValue());
                    j0Var.g0 = u1Var;
                    m2Var.showDialog(j0Var);
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
                pf.c cVar2 = (pf.c) obj6;
                Runnable runnable2 = (Runnable) obj2;
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj4;
                Long l10 = (Long) obj5;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.B1;
                if (tL_premium_boostsStatus2 != null) {
                    channelBoostsController.userCanBoostChannel(l10.longValue(), tL_premium_boostsStatus2, new j90(launchActivity2, cVar2, l10, tL_premium_boostsStatus2, u1Var2, runnable2, 0));
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
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj3;
                bi.ma maVar = (bi.ma) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((org.telegram.ui.ActionBar.e3[]) obj7)[0] = null;
                ql0.a = null;
                if (!((boolean[]) obj6)[0]) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                    if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                        maVar.run();
                        break;
                    } else {
                        ql0.a = e3Var;
                        e3Var.show();
                        break;
                    }
                } else {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                hg.x0 x0Var = (hg.x0) obj2;
                String str = (String) obj;
                ((di.d) obj7).setLoading(false);
                ((di.d) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str != null) {
                    org.telegram.ui.Components.zc.c0(str, j2Var.topBulletinContainer, c6Var);
                    x0Var.run();
                    break;
                } else {
                    j2Var.dismiss();
                    break;
                }
            default:
                di.d dVar = (di.d) obj6;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj5;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) obj4;
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) obj3;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj2;
                String str2 = (String) obj;
                ((di.d) obj7).setLoading(false);
                dVar.setLoading(false);
                if (str2 != null) {
                    org.telegram.ui.Components.zc.c0(str2, i2Var.topBulletinContainer, c6Var2);
                    lVar.run();
                    dVar.setEnabled((a2Var.n || a2Var.o) ? false : true);
                    break;
                } else {
                    i2Var.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j90(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.a = 1;
        this.b = launchActivity;
        this.c = cVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l4;
        this.f = u1Var;
    }
}
