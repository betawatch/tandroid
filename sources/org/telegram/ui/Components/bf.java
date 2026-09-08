package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                bf bfVar = chatActivityEnterView.q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Y2;
                    if (ogVar != null) {
                        ogVar.l1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(bfVar);
                    AndroidUtilities.runOnUIThread(bfVar, 100L);
                    break;
                }
                break;
            case 1:
                og ogVar2 = this.b.Y2;
                if (ogVar2 != null) {
                    ogVar2.c2(0, 0, 0, 0L, 0L, true);
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
