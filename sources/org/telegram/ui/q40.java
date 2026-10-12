package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.ActionBar.y2 {
    public final /* synthetic */ n60 a;

    public q40(n60 n60Var) {
        this.a = n60Var;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.y2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        n60 n60Var = this.a;
        if (n60Var.F1 == 6) {
            n60.C0(n60Var);
        }
    }
}
