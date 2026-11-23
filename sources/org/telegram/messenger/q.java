package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                org.telegram.ui.Components.dh dhVar = (org.telegram.ui.Components.dh) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (dhVar != null) {
                    org.telegram.ui.Components.ui uiVar = dhVar.b;
                    uiVar.G0 = -1;
                    uiVar.H0 = intValue;
                    uiVar.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((i61) this.c).B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (((MediaController) this.b).Y != 1 ? 1.0f : 0.2f));
                break;
            default:
                av avVar = (av) this.b;
                View view = (View) this.c;
                avVar.getClass();
                avVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
