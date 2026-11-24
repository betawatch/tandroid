// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eaa extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ taa c;

    public /* synthetic */ eaa(taa taaVar, boolean z, byte b) {
        this.a = b;
        this.c = taaVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        taa taaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = taaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                if (animator.equals(taaVar.y1)) {
                    taaVar.y1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        taa taaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = taaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        taaVar.N1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                FrameLayout frameLayout = taaVar.q1;
                if (animator.equals(taaVar.y1)) {
                    if (!z) {
                        taaVar.m1.setVisibility(4);
                        FrameLayout frameLayout2 = taaVar.X1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        taaVar.p1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    taaVar.y1 = null;
                    break;
                }
                break;
        }
    }
}
