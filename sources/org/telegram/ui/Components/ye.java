package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ye implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ye yeVar = chatActivityEnterView.q3;
                if ((!chatActivityEnterView.k0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    mg mgVar = chatActivityEnterView.Y2;
                    if (mgVar != null) {
                        mgVar.r1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(yeVar);
                    AndroidUtilities.runOnUIThread(yeVar, 100L);
                    break;
                }
                break;
            case 1:
                mg mgVar2 = this.b.Y2;
                if (mgVar2 != null) {
                    mgVar2.k2(0, 0, 0, 0L, 0L, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    break;
                }
                break;
        }
    }
}
