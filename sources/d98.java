// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d98 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y21 y21Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        u31 u31Var = u31.x;
        if (u31Var == null || (y21Var = u31Var.e) == null) {
            return;
        }
        y21Var.updatePosition();
    }
}
