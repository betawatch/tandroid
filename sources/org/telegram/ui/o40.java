package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o40 implements org.telegram.ui.ActionBar.a3 {
    public final /* synthetic */ k60 a;

    public o40(k60 k60Var) {
        this.a = k60Var;
    }

    @Override // org.telegram.ui.ActionBar.a3
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a3
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        k60 k60Var = this.a;
        if (k60Var.F1 == 6) {
            k60.B0(k60Var);
        }
    }
}
