// default package

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k1(s1 s1Var, AtomicReference atomicReference, float f, float f2, r1 r1Var) {
        this.d = s1Var;
        this.e = atomicReference;
        this.b = f;
        this.c = f2;
        this.f = r1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        float f = this.c;
        float f2 = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                s1 s1Var = (s1) frameLayout;
                r1 r1Var = (r1) obj;
                FrameLayout frameLayout2 = s1Var.K;
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                float floatValue = (f3.floatValue() - ((Float) ((AtomicReference) obj2).getAndSet(f3)).floatValue()) * 1000.0f * 8.0f;
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                Typeface typeface = gm.a;
                float min = Math.min(floatValue, 250.0f);
                while (true) {
                    float f4 = r1Var.a;
                    if (min <= 0.0f) {
                        float R1 = gm.R1(f2, f, f4);
                        s1Var.W = R1;
                        if (R1 > 0.8f && frameLayout2.getBackground() == null) {
                            frameLayout2.setBackground(s1Var.L);
                        }
                        s1Var.r.setAlpha(1.0f - s1Var.W);
                        s1Var.s.setAlpha((float) Math.pow(1.0f - s1Var.W, 2.0d));
                        s1Var.i();
                        frameLayout2.invalidate();
                        break;
                    } else {
                        float min2 = Math.min(min, 18.0f);
                        float f5 = r1Var.b;
                        float f6 = (((((-0.020170001f) * f5) + ((f4 - 1.0f) * (-3.8E-4f))) / 1.0f) * min2) + f5;
                        r1Var.b = f6;
                        r1Var.a = (f6 * min2) + f4;
                        min -= min2;
                    }
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((HorizontalScrollView) frameLayout).setScrollX((int) td4.A(f, f2, floatValue2, f2));
                ((e29) obj2).setOutlineProgress(1.0f - floatValue2);
                ((e29) obj).setOutlineProgress(floatValue2);
                break;
        }
    }

    public /* synthetic */ k1(HorizontalScrollView horizontalScrollView, float f, float f2, e29 e29Var, e29 e29Var2) {
        this.d = horizontalScrollView;
        this.b = f;
        this.c = f2;
        this.e = e29Var;
        this.f = e29Var2;
    }
}
