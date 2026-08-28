package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements d5.d {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ ve.d c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k80(LaunchActivity launchActivity, ve.d dVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.b = launchActivity;
        this.c = dVar;
        this.e = l10;
        this.g = tL_premium_boostsStatus;
        this.f = t1Var;
        this.d = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (((org.telegram.ui.qn) r6).a() == r0.longValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r12.getCurrentFragmetDialogId() == r0.longValue()) goto L32;
     */
    @Override // d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        int i9 = this.a;
        Object obj2 = this.g;
        switch (i9) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.x1;
                ve.d dVar = this.c;
                if (dVar != null) {
                    dVar.b();
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R instanceof ng0) {
                    R = ((ng0) R).W();
                }
                org.telegram.ui.ActionBar.o2 o2Var = R;
                if (o2Var != null) {
                    org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
                    if (o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().G0) {
                        resourceProvider = o2Var.getLastStoryViewer().y;
                    }
                    LaunchActivity launchActivity = this.b;
                    zf.j0 j0Var = new zf.j0(19, launchActivity.K, launchActivity, o2Var, resourceProvider);
                    j0Var.G1(canApplyBoost);
                    boolean z10 = o2Var instanceof qn;
                    Long l10 = this.e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        break;
                    } else if (o2Var instanceof dy) {
                        yw ywVar = ((dy) o2Var).B3;
                        if (ywVar != null) {
                            break;
                        }
                        z11 = false;
                        z12 = z11;
                    }
                    j0Var.F1(tL_premium_boostsStatus, z12);
                    j0Var.H1(l10.longValue());
                    j0Var.c0 = this.f;
                    o2Var.showDialog(j0Var);
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
                ve.d dVar2 = this.c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l11 = this.e;
                    channelBoostsController.userCanBoostChannel(l11.longValue(), tL_premium_boostsStatus2, new k80(this.b, dVar2, l11, tL_premium_boostsStatus2, this.f, runnable2));
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

    public /* synthetic */ k80(LaunchActivity launchActivity, ve.d dVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.b = launchActivity;
        this.c = dVar;
        this.d = runnable;
        this.g = channelBoostsController;
        this.e = l10;
        this.f = t1Var;
    }
}
