// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class avb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qvb c;

    public /* synthetic */ avb(qvb qvbVar, boolean z, byte b) {
        this.a = b;
        this.c = qvbVar;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        qvb qvbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                qvbVar.V0(z ? 1.0f : 0.0f);
                if (!z) {
                    Activity parentActivity = qvbVar.getParentActivity();
                    i = ((d) qvbVar).classGuid;
                    gl.g3(parentActivity, i);
                    qvbVar.s0.setVisibility(8);
                    qvbVar.T0(true);
                    break;
                } else {
                    qvbVar.r0.setVisibility(8);
                    break;
                }
            default:
                if (!z) {
                    qvbVar.p0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
