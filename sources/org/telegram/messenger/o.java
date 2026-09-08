package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
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
