package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq b;

    public /* synthetic */ zp(aq aqVar, int i10) {
        this.a = i10;
        this.b = aqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                aq aqVar = this.b;
                aqVar.d = null;
                pg pgVar = new pg(this, 29);
                aqVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                break;
            default:
                aq aqVar2 = this.b;
                aqVar2.setVisibility(4);
                aqVar2.getClass();
                aqVar2.getClass();
                aqVar2.d = null;
                break;
        }
    }
}
