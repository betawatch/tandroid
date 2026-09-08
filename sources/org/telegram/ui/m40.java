package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m40 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ j60 a;

    public m40(j60 j60Var) {
        this.a = j60Var;
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
        j60 j60Var = this.a;
        if (j60Var.F1 == 6) {
            j60.B0(j60Var);
        }
    }
}
