package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m40 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ i60 a;

    public m40(i60 i60Var) {
        this.a = i60Var;
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
        i60 i60Var = this.a;
        if (i60Var.F1 == 6) {
            i60.B0(i60Var);
        }
    }
}
