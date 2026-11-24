// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bxb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sxb c;

    public /* synthetic */ bxb(sxb sxbVar, boolean z, byte b) {
        this.a = b;
        this.c = sxbVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        sxb sxbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                sxbVar.W0(z ? 1.0f : 0.0f);
                if (!z) {
                    Activity parentActivity = sxbVar.getParentActivity();
                    i = ((d) sxbVar).classGuid;
                    gm.g3(parentActivity, i);
                    sxbVar.s0.setVisibility(8);
                    sxbVar.U0(true);
                    break;
                } else {
                    sxbVar.r0.setVisibility(8);
                    break;
                }
            default:
                if (!z) {
                    sxbVar.p0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
