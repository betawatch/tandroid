package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
