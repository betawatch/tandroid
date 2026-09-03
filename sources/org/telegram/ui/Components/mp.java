package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ mp(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.d = null;
                fg fgVar = new fg(this, 29);
                npVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                break;
            default:
                np npVar2 = this.b;
                npVar2.setVisibility(4);
                npVar2.getClass();
                npVar2.getClass();
                npVar2.d = null;
                break;
        }
    }
}
