package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ue(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ue ueVar = chatActivityEnterView.m3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f3 && !chatActivityEnterView.u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    hg hgVar = chatActivityEnterView.U2;
                    if (hgVar != null) {
                        hgVar.r1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(ueVar);
                    AndroidUtilities.runOnUIThread(ueVar, 100L);
                    break;
                }
                break;
            case 1:
                hg hgVar2 = this.b.U2;
                if (hgVar2 != null) {
                    hgVar2.l2(0, 0, 0, 0L, 0L, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView2.R0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.R0.start();
                    break;
                }
                break;
        }
    }
}
