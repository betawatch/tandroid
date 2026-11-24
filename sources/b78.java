// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b78 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q11 q11Var;
        Drawable[] drawableArr = PhotoViewer.f9;
        m21 m21Var = m21.w;
        if (m21Var == null || (q11Var = m21Var.e) == null) {
            return;
        }
        q11Var.updatePosition();
    }
}
