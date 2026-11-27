// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cyc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dyc b;

    public /* synthetic */ cyc(dyc dycVar, byte b) {
        this.a = b;
        this.b = dycVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dyc dycVar = this.b;
        switch (b) {
            case 0:
                dycVar.E = null;
                break;
            default:
                dycVar.E = null;
                break;
        }
    }
}
