package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(HorizontalScrollView horizontalScrollView, float f10, float f11, bk0 bk0Var, bk0 bk0Var2) {
        this.d = horizontalScrollView;
        this.b = f10;
        this.c = f11;
        this.e = bk0Var;
        this.f = bk0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = (j) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                o1.e eVar = (o1.e) this.f;
                FrameLayout frameLayout = jVar.G;
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
                jVar.Q = lerp;
                if (lerp > 0.8f && frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                }
                jVar.r.setAlpha(1.0f - jVar.Q);
                jVar.s.setAlpha((float) Math.pow(1.0f - jVar.Q, 2.0d));
                jVar.i();
                frameLayout.invalidate();
                break;
            default:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.d;
                bk0 bk0Var = (bk0) this.e;
                bk0 bk0Var2 = (bk0) this.f;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f16 = this.c;
                float f17 = this.b;
                horizontalScrollView.setScrollX((int) e2.c.w(f16, f17, floatValue3, f17));
                bk0Var.setOutlineProgress(1.0f - floatValue3);
                bk0Var2.setOutlineProgress(floatValue3);
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
