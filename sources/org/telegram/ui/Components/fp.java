package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp b;

    public /* synthetic */ fp(gp gpVar, int i9) {
        this.a = i9;
        this.b = gpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gp gpVar = this.b;
                gpVar.d = null;
                fg fgVar = new fg(this, 29);
                gpVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                break;
            default:
                gp gpVar2 = this.b;
                gpVar2.setVisibility(4);
                gpVar2.getClass();
                gpVar2.getClass();
                gpVar2.d = null;
                break;
        }
    }
}
