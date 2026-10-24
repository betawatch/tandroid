package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class aq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq b;

    public /* synthetic */ aq(bq bqVar, int i10) {
        this.a = i10;
        this.b = bqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bq bqVar = this.b;
                bqVar.d = null;
                zp zpVar = new zp(this, 0);
                bqVar.e = zpVar;
                AndroidUtilities.runOnUIThread(zpVar, 3000L);
                break;
            default:
                bq bqVar2 = this.b;
                bqVar2.setVisibility(4);
                bqVar2.getClass();
                bqVar2.getClass();
                bqVar2.d = null;
                break;
        }
    }
}
