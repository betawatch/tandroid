package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f9, float f10, qj0 qj0Var, qj0 qj0Var2) {
        this.d = horizontalScrollView;
        this.b = f9;
        this.c = f10;
        this.e = qj0Var;
        this.f = qj0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                o1.f fVar = (o1.f) this.f;
                FrameLayout frameLayout = jVar.F;
                Float f9 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f9.floatValue() - ((Float) atomicReference.getAndSet(f9)).floatValue()) * 1000.0f * 8.0f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = this.b;
                float f11 = this.c;
                AndroidUtilities.lerp(f10, f11, floatValue2);
                float min = Math.min(floatValue, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f12 = fVar.a;
                    float f13 = fVar.b;
                    float f14 = (((((-0.020170001f) * f13) + ((f12 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f13;
                    fVar.b = f14;
                    fVar.a = (f14 * min2) + f12;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f10, f11, fVar.a);
                jVar.P = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                }
                jVar.r.setAlpha(1.0f - jVar.P);
                jVar.s.setAlpha((float) Math.pow(1.0f - jVar.P, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                break;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.d;
                qj0 qj0Var = (qj0) this.e;
                qj0 qj0Var2 = (qj0) this.f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = this.c;
                float f16 = this.b;
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f15, f16, floatValue3, f16));
                qj0Var.setOutlineProgress(1.0f - floatValue3);
                qj0Var2.setOutlineProgress(floatValue3);
                break;
        }
    }

    public /* synthetic */ b(j jVar, AtomicReference atomicReference, float f9, float f10, o1.f fVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.b = f9;
        this.c = f10;
        this.f = fVar;
    }
}
