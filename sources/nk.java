// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                Drawable drawable = (Drawable) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = Math.abs(floatValue - 0.5f) + 0.5f;
                imageView.setScaleX(abs);
                imageView.setScaleY(abs);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    imageView.setImageDrawable(drawable);
                    break;
                }
                break;
            case 1:
                ka2 ka2Var = (ka2) obj3;
                nb2 nb2Var = (nb2) obj2;
                gb2 gb2Var = (gb2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z = ka2Var.l;
                int i2 = ka2Var.s;
                if (z) {
                    nb2Var.h0 = (-i2) * floatValue2;
                    nb2Var.i0 = (-ka2Var.t) * floatValue2;
                    nb2Var.k0 = (-ka2Var.u) * floatValue2;
                    nb2Var.j0 = (-ka2Var.v) * floatValue2;
                } else {
                    nb2Var.h0 = ((-i2) * floatValue2) - gb2Var.getAnimationOffsetX();
                    nb2Var.i0 = ((-ka2Var.t) * floatValue2) - gb2Var.getAnimationOffsetX();
                    nb2Var.k0 = ((-ka2Var.u) * floatValue2) - gb2Var.getTranslationY();
                    nb2Var.j0 = ((-ka2Var.v) * floatValue2) - gb2Var.getTranslationY();
                }
                gb2Var.invalidate();
                break;
            case 2:
                rw5 rw5Var = (rw5) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                rw5Var.Y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw5Var.V0.invalidate();
                rw5Var.S0.invalidate();
                rw5Var.T0.invalidate();
                while (i < rw5Var.V0.getChildCount()) {
                    rw5Var.V0.getChildAt(i).setAlpha(((i == rw5Var.X0 ? rw5Var.Y0 : i == rw5Var.W0 ? 1.0f - rw5Var.Y0 : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = s33.f.getInterpolation(rw5Var.Y0);
                if (viewGroup != null && viewGroup2 != null) {
                    float f = 1.0f - interpolation;
                    float f2 = (f * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f2);
                    viewGroup.setScaleY(f2);
                    viewGroup.setTranslationY((Math.min(interpolation, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f3 = (interpolation * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f3);
                    viewGroup2.setScaleY(f3);
                    viewGroup2.setTranslationY((Math.min(f, 0.25f) * (-gl.L(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 3:
                wt7 wt7Var = (wt7) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                ViewGroup viewGroup4 = (ViewGroup) obj;
                wt7Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wt7Var.M0.invalidate();
                wt7Var.J0.invalidate();
                wt7Var.K0.invalidate();
                while (i < wt7Var.M0.getChildCount()) {
                    wt7Var.M0.getChildAt(i).setAlpha(((i == wt7Var.P0 ? wt7Var.Q0 : i == wt7Var.O0 ? 1.0f - wt7Var.Q0 : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation2 = s33.f.getInterpolation(wt7Var.Q0);
                if (viewGroup3 != null && viewGroup4 != null) {
                    float f4 = 1.0f - interpolation2;
                    float f5 = (f4 * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f5);
                    viewGroup3.setScaleY(f5);
                    viewGroup3.setTranslationY((Math.min(interpolation2, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f6 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f6);
                    viewGroup4.setScaleY(f6);
                    viewGroup4.setTranslationY((Math.min(f4, 0.25f) * (-gl.L(16.0f))) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(f4, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                y28 y28Var = ((c28) obj3).a;
                y28Var.l3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                y28Var.invalidate();
                if (y28Var.l3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    y28Var.g3 = true;
                    try {
                        y28Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 5:
                ei8 ei8Var = (ei8) obj3;
                t98 t98Var = (t98) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ei8Var.n;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t98Var.setAlpha(floatValue3);
                t98Var.setScaleX(floatValue3);
                t98Var.setScaleY(floatValue3);
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                while (i < premiumPreviewFragment.V.getChildCount()) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt != ei8Var.e) {
                        childAt.setTranslationY((t98Var.getMeasuredHeight() * animatedFraction) + (childAt == ei8Var.c ? 0.0f - (gl.L(15.0f) * animatedFraction) : (gl.L(8.0f) * animatedFraction) + 0.0f));
                    }
                    i++;
                }
                break;
            case 6:
                ohb ohbVar = (ohb) obj3;
                ohbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ar1) obj2).getEditField().setAlpha(ohbVar.a);
                ((w02) obj).invalidate();
                break;
            default:
                mpb mpbVar = (mpb) obj3;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj2;
                gk2 gk2Var = (gk2) obj;
                mpbVar.getClass();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 0.5f && !atomicBoolean2.get()) {
                    atomicBoolean2.set(true);
                    mpbVar.setDrawable(gk2Var);
                    break;
                }
                break;
        }
    }
}
