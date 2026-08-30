package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h40 implements org.telegram.ui.ActionBar.a3 {
    public final /* synthetic */ c60 a;

    public h40(c60 c60Var) {
        this.a = c60Var;
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
        c60 c60Var = this.a;
        if (c60Var.C1 == 6) {
            c60.B0(c60Var);
        }
    }
}
