package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ re(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                re reVar = chatActivityEnterView.m3;
                if ((!chatActivityEnterView.i0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f3 && !chatActivityEnterView.u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    eg egVar = chatActivityEnterView.U2;
                    if (egVar != null) {
                        egVar.i1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                    break;
                }
                break;
            case 1:
                eg egVar2 = this.b.U2;
                if (egVar2 != null) {
                    egVar2.U1(0, 0, 0, 0L, 0L, true);
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
