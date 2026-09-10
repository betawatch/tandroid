package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;

    public /* synthetic */ vp(wp wpVar, int i10) {
        this.a = i10;
        this.b = wpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                wpVar.d = null;
                rg rgVar = new rg(this, 29);
                wpVar.e = rgVar;
                AndroidUtilities.runOnUIThread(rgVar, 3000L);
                break;
            default:
                wp wpVar2 = this.b;
                wpVar2.setVisibility(4);
                wpVar2.getClass();
                wpVar2.getClass();
                wpVar2.d = null;
                break;
        }
    }
}
