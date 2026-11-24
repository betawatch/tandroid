// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dwb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwb b;

    public /* synthetic */ dwb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                if (lwbVar.b0 == animator) {
                    lwbVar.b0 = null;
                    break;
                }
                break;
            case 1:
                if (lwbVar.k0 == animator) {
                    lwbVar.k0 = null;
                }
                lwbVar.b(1.0f);
                break;
            default:
                if (lwbVar.K == animator) {
                    lwbVar.K = null;
                    break;
                }
                break;
        }
    }
}
