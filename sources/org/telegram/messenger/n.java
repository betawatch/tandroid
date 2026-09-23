package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.b, valueAnimator);
                break;
            case 1:
                ((RichMessageLayout.RichButton) this.b).lambda$setPressed$0(valueAnimator);
                break;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.b).lambda$settle$0(valueAnimator);
                break;
        }
    }
}
