// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
