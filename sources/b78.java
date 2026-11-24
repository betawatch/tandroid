// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b78 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q11 q11Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        m21 m21Var = m21.w;
        if (m21Var == null || (q11Var = m21Var.e) == null) {
            return;
        }
        q11Var.updatePosition();
    }
}
