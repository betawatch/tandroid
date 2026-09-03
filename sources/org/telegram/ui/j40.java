package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j40 implements org.telegram.ui.ActionBar.a3 {
    public final /* synthetic */ e60 a;

    public j40(e60 e60Var) {
        this.a = e60Var;
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
        e60 e60Var = this.a;
        if (e60Var.C1 == 6) {
            e60.B0(e60Var);
        }
    }
}
