package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements f5.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ ye.c c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n80(LaunchActivity launchActivity, ye.c cVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.s1 s1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = cVar;
        this.e = l10;
        this.g = tL_premium_boostsStatus;
        this.f = s1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.tn) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // f5.d
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
                ye.c cVar = this.c;
                if (cVar != null) {
                    cVar.b();
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R instanceof ng0) {
                    R = ((ng0) R).X();
                }
                org.telegram.ui.ActionBar.o2 o2Var = R;
                if (o2Var != null) {
                    org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
                    if (o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().G0) {
                        resourceProvider = o2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    cg.v0 v0Var = new cg.v0(19, launchActivity.K, launchActivity, o2Var, resourceProvider);
                    v0Var.G1(canApplyBoost);
                    boolean z10 = o2Var instanceof tn;
                    Long l10 = this.e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        break;
                    } else if (o2Var instanceof fy) {
                        ax axVar = ((fy) o2Var).B3;
                        if (axVar != null) {
                            break;
                        }
                        z11 = false;
                        z12 = z11;
                    }
                    v0Var.F1(tL_premium_boostsStatus, z12);
                    v0Var.H1(l10.longValue());
                    v0Var.c0 = this.f;
                    o2Var.showDialog(v0Var);
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        try {
                            runnable.run();
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            default:
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.x1;
                ye.c cVar2 = this.c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l11 = this.e;
                    channelBoostsController.userCanBoostChannel(l11.longValue(), tL_premium_boostsStatus2, new n80(this.b, cVar2, l11, tL_premium_boostsStatus2, this.f, runnable2));
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
        }
    }

    public /* synthetic */ n80(LaunchActivity launchActivity, ye.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.s1 s1Var) {
        this.b = launchActivity;
        this.c = cVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l10;
        this.f = s1Var;
    }
}
