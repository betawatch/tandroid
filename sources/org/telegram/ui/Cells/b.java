package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.sh0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f10, float f11, sh0 sh0Var, sh0 sh0Var2) {
        this.d = horizontalScrollView;
        this.b = f10;
        this.c = f11;
        this.e = sh0Var;
        this.f = sh0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        float f10 = this.c;
        float f11 = this.b;
        FrameLayout frameLayout = this.d;
        switch (i7) {
            case 0:
                j jVar = (j) frameLayout;
                i iVar = (i) obj;
                FrameLayout frameLayout2 = jVar.J;
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f12.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f12)).floatValue()) * 1000.0f * 8.0f;
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = org.telegram.messenger.g0.a;
                float min = Math.min(floatValue, 250.0f);
                while (min > 0.0f) {
                    float min2 = Math.min(min, 18.0f);
                    float f13 = iVar.a;
                    float f14 = iVar.b;
                    float f15 = (((((-0.020170001f) * f14) + ((f13 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f14;
                    iVar.b = f15;
                    iVar.a = (f15 * min2) + f13;
                    min -= min2;
                }
                float T1 = org.telegram.messenger.g0.T1(f11, f10, iVar.a);
                jVar.V = T1;
                if (T1 > 0.8f && frameLayout2.getBackground() == null) {
                    frameLayout2.setBackground(jVar.K);
                }
                jVar.r.setAlpha(1.0f - jVar.V);
                jVar.s.setAlpha((float) Math.pow(1.0f - jVar.V, 2.0d));
                jVar.i();
                frameLayout2.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) com.google.android.recaptcha.internal.a.z(f10, f11, floatValue2, f11));
                ((sh0) obj2).setOutlineProgress(1.0f - floatValue2);
                ((sh0) obj).setOutlineProgress(floatValue2);
                break;
        }
    }

    public /* synthetic */ b(j jVar, AtomicReference atomicReference, float f10, float f11, i iVar) {
        this.d = jVar;
        this.e = atomicReference;
        this.b = f10;
        this.c = f11;
        this.f = iVar;
    }
}
