package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n40 implements org.telegram.ui.ActionBar.b3 {
    public final /* synthetic */ j60 a;

    public n40(j60 j60Var) {
        this.a = j60Var;
    }

    @Override // org.telegram.ui.ActionBar.b3
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b3
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        j60 j60Var = this.a;
        if (j60Var.F1 == 6) {
            j60.B0(j60Var);
        }
    }
}
