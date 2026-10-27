package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a40 implements org.telegram.ui.ActionBar.d3 {
    public final /* synthetic */ x50 a;

    public a40(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // org.telegram.ui.ActionBar.d3
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d3
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        x50 x50Var = this.a;
        if (x50Var.F1 == 6) {
            x50.B0(x50Var);
        }
    }
}
