package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k40 implements org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ g60 a;

    public k40(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void onOpenAnimationEnd() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        g60 g60Var = this.a;
        if (g60Var.F1 == 6) {
            g60.C0(g60Var);
        }
    }
}
