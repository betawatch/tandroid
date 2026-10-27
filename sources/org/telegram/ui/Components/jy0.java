package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ky0 ky0Var = (ky0) this.c;
                ky0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.invalidate();
                ((qn0) this.b).invalidate();
                break;
            case 1:
                ((v91) this.c).F((View) this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4.c cVar = (w4.c) this.c;
                w4.b bVar = (w4.b) this.b;
                w4.c.b(floatValue, bVar);
                cVar.a(floatValue, bVar, false);
                cVar.invalidateSelf();
                break;
        }
    }
}
