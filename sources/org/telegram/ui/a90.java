package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ nf.e c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.u1 u1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = eVar;
        this.e = l4;
        this.g = tL_premium_boostsStatus;
        this.f = u1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.wn) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.g;
        switch (i10) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.B1;
                nf.e eVar = this.c;
                if (eVar != null) {
                    eVar.b();
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R instanceof yg0) {
                    R = ((yg0) R).X();
                }
                org.telegram.ui.ActionBar.m2 m2Var = R;
                if (m2Var != null) {
                    org.telegram.ui.ActionBar.d6 resourceProvider = m2Var.getResourceProvider();
                    if (m2Var.getLastStoryViewer() != null && m2Var.getLastStoryViewer().K0) {
                        resourceProvider = m2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    rg.j0 j0Var = new rg.j0(19, launchActivity.O, launchActivity, m2Var, resourceProvider);
                    j0Var.G1(canApplyBoost);
                    boolean z10 = m2Var instanceof wn;
                    Long l4 = this.e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        break;
                    } else if (m2Var instanceof qy) {
                        kx kxVar = ((qy) m2Var).F3;
                        if (kxVar != null) {
                            break;
                        }
                        z11 = false;
                        z12 = z11;
                    }
                    j0Var.F1(tL_premium_boostsStatus, z12);
                    j0Var.H1(l4.longValue());
                    j0Var.g0 = this.f;
                    m2Var.showDialog(j0Var);
                    Runnable runnable = this.d;
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
            default:
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.B1;
                nf.e eVar2 = this.c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l10 = this.e;
                    channelBoostsController.userCanBoostChannel(l10.longValue(), tL_premium_boostsStatus2, new a90(this.b, eVar2, l10, tL_premium_boostsStatus2, this.f, runnable2));
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
        }
    }

    public /* synthetic */ a90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.u1 u1Var) {
        this.b = launchActivity;
        this.c = eVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l4;
        this.f = u1Var;
    }
}
