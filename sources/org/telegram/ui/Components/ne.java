package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ne(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ne neVar = chatActivityEnterView.m3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f3 && !chatActivityEnterView.u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    ag agVar = chatActivityEnterView.U2;
                    if (agVar != null) {
                        agVar.j1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(neVar);
                    AndroidUtilities.runOnUIThread(neVar, 100L);
                    break;
                }
                break;
            case 1:
                ag agVar2 = this.b.U2;
                if (agVar2 != null) {
                    agVar2.X1(0, 0, 0, 0L, 0L, true);
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
