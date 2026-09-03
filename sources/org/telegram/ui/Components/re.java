package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                re reVar = chatActivityEnterView.n3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.p2.hasSheets(chatActivityEnterView.L2) && !chatActivityEnterView.U1 && chatActivityEnterView.B0 != null && chatActivityEnterView.g3 && !chatActivityEnterView.v2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    eg egVar = chatActivityEnterView.V2;
                    if (egVar != null) {
                        egVar.w1();
                    }
                    chatActivityEnterView.B0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.B0);
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                    break;
                }
                break;
            case 1:
                eg egVar2 = this.b.V2;
                if (egVar2 != null) {
                    egVar2.p2(0, 0, 0, 0L, 0L, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView2.S0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.S0.start();
                    break;
                }
                break;
        }
    }
}
