// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dmc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ emc b;

    public /* synthetic */ dmc(emc emcVar, byte b) {
        this.a = b;
        this.b = emcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        emc emcVar = this.b;
        switch (b) {
            case 0:
                emcVar.b.setVisibility(8);
                break;
            default:
                emcVar.c.setVisibility(8);
                break;
        }
    }
}
