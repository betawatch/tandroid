package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.t51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.lg lgVar = (org.telegram.ui.Components.lg) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (lgVar != null) {
                    org.telegram.ui.Components.ci ciVar = lgVar.b;
                    ciVar.F0 = -1;
                    ciVar.G0 = intValue;
                    ciVar.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((t51) this.c).B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (((MediaController) this.b).X != 1 ? 1.0f : 0.2f));
                break;
            default:
                fv fvVar = (fv) this.b;
                View view = (View) this.c;
                fvVar.getClass();
                fvVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
