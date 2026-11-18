package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.ui.Components.bh bhVar = (org.telegram.ui.Components.bh) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (bhVar != null) {
                    org.telegram.ui.Components.si siVar = bhVar.b;
                    siVar.G0 = -1;
                    siVar.H0 = intValue;
                    siVar.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((f61) this.c).B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (((MediaController) this.b).Y != 1 ? 1.0f : 0.2f));
                break;
            default:
                zu zuVar = (zu) this.b;
                View view = (View) this.c;
                zuVar.getClass();
                zuVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
