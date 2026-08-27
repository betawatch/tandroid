package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements d5.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ we.d c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o80(LaunchActivity launchActivity, we.d dVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.s1 s1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = dVar;
        this.e = l10;
        this.g = tL_premium_boostsStatus;
        this.f = s1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.rn) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.g;
        switch (i10) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.x1;
                we.d dVar = this.c;
                if (dVar != null) {
                    dVar.b();
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R instanceof qg0) {
                    R = ((qg0) R).X();
                }
                org.telegram.ui.ActionBar.n2 n2Var = R;
                if (n2Var != null) {
                    org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
                    if (n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().G0) {
                        resourceProvider = n2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    ag.i1 i1Var = new ag.i1(19, launchActivity.K, launchActivity, n2Var, resourceProvider);
                    i1Var.G1(canApplyBoost);
                    boolean z10 = n2Var instanceof rn;
                    Long l10 = this.e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        break;
                    } else if (n2Var instanceof gy) {
                        bx bxVar = ((gy) n2Var).B3;
                        if (bxVar != null) {
                            break;
                        }
                        z11 = false;
                        z12 = z11;
                    }
                    i1Var.F1(tL_premium_boostsStatus, z12);
                    i1Var.H1(l10.longValue());
                    i1Var.c0 = this.f;
                    n2Var.showDialog(i1Var);
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                }
                break;
            default:
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.x1;
                we.d dVar2 = this.c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l11 = this.e;
                    channelBoostsController.userCanBoostChannel(l11.longValue(), tL_premium_boostsStatus2, new o80(this.b, dVar2, l11, tL_premium_boostsStatus2, this.f, runnable2));
                    break;
                } else {
                    if (dVar2 != null) {
                        dVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o80(LaunchActivity launchActivity, we.d dVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.s1 s1Var) {
        this.b = launchActivity;
        this.c = dVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l10;
        this.f = s1Var;
    }
}
