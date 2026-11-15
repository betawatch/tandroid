package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                org.telegram.ui.Components.sg sgVar = (org.telegram.ui.Components.sg) this.b;
                Window window = (Window) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sgVar != null) {
                    org.telegram.ui.Components.ki kiVar = sgVar.b;
                    kiVar.G0 = -1;
                    kiVar.H0 = intValue;
                    kiVar.b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                ((u51) this.c).B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * (((MediaController) this.b).Y != 1 ? 1.0f : 0.2f));
                break;
            default:
                dv dvVar = (dv) this.b;
                View view = (View) this.c;
                dvVar.getClass();
                dvVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
        }
    }
}
