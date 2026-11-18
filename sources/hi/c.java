package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i7) {
        this.a = i7;
        this.b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                dVar.N = false;
                dVar.e.t(null, false, true);
                break;
            default:
                d dVar2 = this.b;
                dVar2.U = 1.0f;
                dVar2.invalidate();
                break;
        }
    }
}
