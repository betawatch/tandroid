package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class eb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ eb(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b.I0;
                sbVar.X = 0.0f;
                sb.k(sbVar);
                break;
            default:
                sb sbVar2 = this.b.I0;
                sbVar2.W = 0.0f;
                sbVar2.Z = 0.0f;
                sb.k(sbVar2);
                break;
        }
    }
}
