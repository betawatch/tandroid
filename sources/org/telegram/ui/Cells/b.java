package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f7, float f10, wi0 wi0Var, wi0 wi0Var2) {
        this.d = horizontalScrollView;
        this.b = f7;
        this.c = f10;
        this.e = wi0Var;
        this.f = wi0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        float f7 = this.c;
        float f10 = this.b;
        FrameLayout frameLayout = this.d;
        switch (i10) {
            case 0:
                i iVar = (i) frameLayout;
                o1.e eVar = (o1.e) obj;
                FrameLayout frameLayout2 = iVar.J;
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f11.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f11)).floatValue()) * 1000.0f * 8.0f;
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = org.telegram.messenger.i0.a;
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
                float T1 = org.telegram.messenger.i0.T1(f10, f7, eVar.a);
                iVar.V = T1;
                if (T1 > 0.8f && frameLayout2.getBackground() == null) {
                    frameLayout2.setBackground(iVar.K);
                }
                iVar.r.setAlpha(1.0f - iVar.V);
                iVar.s.setAlpha((float) Math.pow(1.0f - iVar.V, 2.0d));
                iVar.i();
                frameLayout2.invalidate();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) c3.i0.z(f7, f10, floatValue2, f10));
                ((wi0) obj2).setOutlineProgress(1.0f - floatValue2);
                ((wi0) obj).setOutlineProgress(floatValue2);
                break;
        }
    }

    public /* synthetic */ b(i iVar, AtomicReference atomicReference, float f7, float f10, o1.e eVar) {
        this.d = iVar;
        this.e = atomicReference;
        this.b = f7;
        this.c = f10;
        this.f = eVar;
    }
}
