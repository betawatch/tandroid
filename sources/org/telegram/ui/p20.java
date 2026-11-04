package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.voip.r b;
    public final /* synthetic */ x30 c;

    public /* synthetic */ p20(x30 x30Var, org.telegram.ui.Components.voip.r rVar, int i3) {
        this.a = i3;
        this.c = x30Var;
        this.b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.voip.r rVar = this.b;
                if (rVar.getParent() != null) {
                    this.c.b.removeView(rVar);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.voip.r rVar2 = this.b;
                if (rVar2.getParent() != null) {
                    this.c.b.removeView(rVar2);
                    break;
                }
                break;
        }
    }
}
