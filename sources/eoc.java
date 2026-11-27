// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class eoc extends AnimatorListenerAdapter {
    public final /* synthetic */ foc a;

    public eoc(foc focVar) {
        this.a = focVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        foc focVar = this.a;
        focVar.e = focVar.c;
        focVar.f = focVar.d;
        SecureRandom secureRandom = Utilities.b;
        focVar.c = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
        focVar.d = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
        ValueAnimator valueAnimator = focVar.b;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
