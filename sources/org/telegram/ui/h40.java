package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h40 implements org.telegram.ui.ActionBar.y2 {
    public final /* synthetic */ d60 a;

    public h40(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        d60 d60Var = this.a;
        if (d60Var.F1 == 6) {
            d60.B0(d60Var);
        }
    }
}
