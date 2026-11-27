// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
