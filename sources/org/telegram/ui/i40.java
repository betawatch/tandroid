package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i40 implements org.telegram.ui.ActionBar.b3 {
    public final /* synthetic */ d60 a;

    public i40(d60 d60Var) {
        this.a = d60Var;
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
        d60 d60Var = this.a;
        if (d60Var.C1 == 6) {
            d60.B0(d60Var);
        }
    }
}
