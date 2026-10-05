package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class m40 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ h60 a;

    public m40(h60 h60Var) {
        this.a = h60Var;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        h60 h60Var = this.a;
        if (h60Var.F1 == 6) {
            h60.B0(h60Var);
        }
    }
}
