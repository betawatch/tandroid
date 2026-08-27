package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f10, float f11, hj0 hj0Var, hj0 hj0Var2) {
        this.d = horizontalScrollView;
        this.b = f10;
        this.c = f11;
        this.e = hj0Var;
        this.f = hj0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                o1.e eVar = (o1.e) this.f;
                FrameLayout frameLayout = jVar.F;
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f10.floatValue() - ((Float) atomicReference.getAndSet(f10)).floatValue()) * 1000.0f * 8.0f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f11 = this.b;
                float f12 = this.c;
                AndroidUtilities.lerp(f11, f12, floatValue2);
                float min = Math.min(floatValue, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = eVar.a;
                    float f14 = eVar.b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    eVar.b = f15;
                    eVar.a = (f15 * min2) + f13;
                    min -= min2;
                }
                float lerp = AndroidUtilities.lerp(f11, f12, eVar.a);
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
                hj0 hj0Var = (hj0) this.e;
                hj0 hj0Var2 = (hj0) this.f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.c;
                float f17 = this.b;
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f16, f17, floatValue3, f17));
                hj0Var.setOutlineProgress(1.0f - floatValue3);
                hj0Var2.setOutlineProgress(floatValue3);
                break;
        }
    }

    public /* synthetic */ b(j jVar, AtomicReference atomicReference, float f10, float f11, o1.e eVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.b = f10;
        this.c = f11;
        this.f = eVar;
    }
}
