package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                if ((!chatActivityEnterView.k0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
