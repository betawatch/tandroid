package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f7, float f10, rk0 rk0Var, rk0 rk0Var2) {
        this.d = horizontalScrollView;
        this.b = f7;
        this.c = f10;
        this.e = rk0Var;
        this.f = rk0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                o1.e eVar = (o1.e) this.f;
                FrameLayout frameLayout = jVar.J;
                Float f7 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f7.floatValue() - ((Float) atomicReference.getAndSet(f7)).floatValue()) * 1000.0f * 8.0f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.b;
                float f11 = this.c;
                AndroidUtilities.lerp(f10, f11, floatValue2);
                float min = Math.min(floatValue, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = eVar.a;
                    float f13 = eVar.b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    eVar.b = f14;
                    eVar.a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, eVar.a);
                jVar.V = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                }
                jVar.r.setAlpha(1.0f - jVar.V);
                jVar.s.setAlpha((float) Math.pow(1.0f - jVar.V, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                break;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.d;
                rk0 rk0Var = (rk0) this.e;
                rk0 rk0Var2 = (rk0) this.f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.c;
                float f16 = this.b;
                horizontalScrollView.setScrollX((int) c3.h0.z(f15, f16, floatValue3, f16));
                rk0Var.setOutlineProgress(1.0f - floatValue3);
                rk0Var2.setOutlineProgress(floatValue3);
                break;
        }
    }

    public /* synthetic */ b(j jVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.b = f7;
        this.c = f10;
        this.f = eVar;
    }
}
