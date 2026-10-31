package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (igVar != null) {
                    org.telegram.ui.Components.bi biVar = igVar.b;
                    biVar.F0 = -1;
                    biVar.G0 = intValue;
                    biVar.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((u61) this.c).B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (((MediaController) this.b).X != 1 ? 1.0f : 0.2f));
                break;
            default:
                qv qvVar = (qv) this.b;
                View view = (View) this.c;
                qvVar.getClass();
                qvVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
