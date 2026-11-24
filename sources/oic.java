// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oic extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qic b;

    public /* synthetic */ oic(qic qicVar, byte b) {
        this.a = b;
        this.b = qicVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qic qicVar = this.b;
        switch (b) {
            case 0:
                qicVar.r = 0;
                qicVar.invalidate();
                break;
            default:
                qicVar.s = 0;
                qicVar.invalidate();
                break;
        }
    }
}
