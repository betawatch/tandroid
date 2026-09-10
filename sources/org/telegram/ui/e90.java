package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements e2.h {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ nf.e c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e90(LaunchActivity launchActivity, nf.e eVar, Long l4, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = eVar;
        this.e = l4;
        this.g = tL_premium_boostsStatus;
        this.f = t1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.eo) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // e2.h
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
                Pattern pattern = LaunchActivity.B1;
                nf.e eVar = this.c;
                if (eVar != null) {
                    eVar.b();
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R instanceof fh0) {
                    R = ((fh0) R).X();
                }
                org.telegram.ui.ActionBar.p2 p2Var = R;
                if (p2Var != null) {
                    org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
                    if (p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().K0) {
                        resourceProvider = p2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    qg.k0 k0Var = new qg.k0(19, launchActivity.O, launchActivity, p2Var, resourceProvider);
                    k0Var.G1(canApplyBoost);
                    boolean z10 = p2Var instanceof eo;
                    Long l4 = this.e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        break;
                    } else if (p2Var instanceof wy) {
                        qx qxVar = ((wy) p2Var).F3;
                        if (qxVar != null) {
                            break;
                        }
                        z11 = false;
                        z12 = z11;
                    }
                    k0Var.F1(tL_premium_boostsStatus, z12);
                    k0Var.H1(l4.longValue());
                    k0Var.g0 = this.f;
                    p2Var.showDialog(k0Var);
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
                    channelBoostsController.userCanBoostChannel(l10.longValue(), tL_premium_boostsStatus2, new e90(this.b, eVar2, l10, tL_premium_boostsStatus2, this.f, runnable2));
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

    public /* synthetic */ e90(LaunchActivity launchActivity, nf.e eVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.b = launchActivity;
        this.c = eVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l4;
        this.f = t1Var;
    }
}
