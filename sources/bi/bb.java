package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class bb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ bb(db dbVar, int i10) {
        this.a = i10;
        this.b = dbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pb pbVar = this.b.I0;
                pbVar.X = 0.0f;
                pb.k(pbVar);
                break;
            default:
                pb pbVar2 = this.b.I0;
                pbVar2.W = 0.0f;
                pbVar2.Z = 0.0f;
                pb.k(pbVar2);
                break;
        }
    }
}
