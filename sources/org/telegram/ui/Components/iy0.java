package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jy0 jy0Var = (jy0) this.c;
                jy0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jy0Var.invalidate();
                ((pn0) this.b).invalidate();
                break;
            case 1:
                ((u91) this.c).F((View) this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
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
