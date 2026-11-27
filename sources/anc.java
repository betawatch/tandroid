// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class anc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnc b;

    public /* synthetic */ anc(cnc cncVar, byte b) {
        this.a = b;
        this.b = cncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        cnc cncVar = this.b;
        switch (b) {
            case 0:
                cncVar.r = 0;
                cncVar.invalidate();
                break;
            default:
                cncVar.s = 0;
                cncVar.invalidate();
                break;
        }
    }
}
