package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ dp(ep epVar, int i10) {
        this.a = i10;
        this.b = epVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ep epVar = this.b;
                epVar.d = null;
                bg bgVar = new bg(this, 29);
                epVar.e = bgVar;
                AndroidUtilities.runOnUIThread(bgVar, 3000L);
                break;
            default:
                ep epVar2 = this.b;
                epVar2.setVisibility(4);
                epVar2.getClass();
                epVar2.getClass();
                epVar2.d = null;
                break;
        }
    }
}
