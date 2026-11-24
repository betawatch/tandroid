// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mz7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p c;

    public /* synthetic */ mz7(p pVar, boolean z, byte b) {
        this.a = b;
        this.c = pVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pVar.w = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pVar.w = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        pVar.r.setVisibility(4);
                        break;
                    } else {
                        pVar.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        pVar.s.setVisibility(4);
                        break;
                    } else {
                        pVar.V.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
