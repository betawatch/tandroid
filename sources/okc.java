// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class okc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qkc b;

    public /* synthetic */ okc(qkc qkcVar, byte b) {
        this.a = b;
        this.b = qkcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qkc qkcVar = this.b;
        switch (b) {
            case 0:
                qkcVar.r = 0;
                qkcVar.invalidate();
                break;
            default:
                qkcVar.s = 0;
                qkcVar.invalidate();
                break;
        }
    }
}
