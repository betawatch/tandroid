// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    gl.h3(parentActivity, i);
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
