// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nl(Object obj, Object obj2, Object obj3, byte b) {
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
                vb2 vb2Var = (vb2) obj3;
                yc2 yc2Var = (yc2) obj2;
                rc2 rc2Var = (rc2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z = vb2Var.l;
                int i2 = vb2Var.s;
                if (z) {
                    yc2Var.h0 = (-i2) * floatValue2;
                    yc2Var.i0 = (-vb2Var.t) * floatValue2;
                    yc2Var.k0 = (-vb2Var.u) * floatValue2;
                    yc2Var.j0 = (-vb2Var.v) * floatValue2;
                } else {
                    yc2Var.h0 = ((-i2) * floatValue2) - rc2Var.getAnimationOffsetX();
                    yc2Var.i0 = ((-vb2Var.t) * floatValue2) - rc2Var.getAnimationOffsetX();
                    yc2Var.k0 = ((-vb2Var.u) * floatValue2) - rc2Var.getTranslationY();
                    yc2Var.j0 = ((-vb2Var.v) * floatValue2) - rc2Var.getTranslationY();
                }
                rc2Var.invalidate();
                break;
            case 2:
                ry5 ry5Var = (ry5) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                ry5Var.Y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry5Var.V0.invalidate();
                ry5Var.S0.invalidate();
                ry5Var.T0.invalidate();
                while (i < ry5Var.V0.getChildCount()) {
                    ry5Var.V0.getChildAt(i).setAlpha(((i == ry5Var.X0 ? ry5Var.Y0 : i == ry5Var.W0 ? 1.0f - ry5Var.Y0 : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation = d53.f.getInterpolation(ry5Var.Y0);
                if (viewGroup != null && viewGroup2 != null) {
                    float f = 1.0f - interpolation;
                    float f2 = (f * 0.4f) + 0.6f;
                    viewGroup.setScaleX(f2);
                    viewGroup.setScaleY(f2);
                    viewGroup.setTranslationY((Math.min(interpolation, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f3 = (interpolation * 0.4f) + 0.6f;
                    viewGroup2.setScaleX(f3);
                    viewGroup2.setScaleY(f3);
                    viewGroup2.setTranslationY((Math.min(f, 0.25f) * (-gm.L(16.0f))) / 0.25f);
                    viewGroup2.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 3:
                xv7 xv7Var = (xv7) obj3;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                ViewGroup viewGroup4 = (ViewGroup) obj;
                xv7Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.M0.invalidate();
                xv7Var.J0.invalidate();
                xv7Var.K0.invalidate();
                while (i < xv7Var.M0.getChildCount()) {
                    xv7Var.M0.getChildAt(i).setAlpha(((i == xv7Var.P0 ? xv7Var.Q0 : i == xv7Var.O0 ? 1.0f - xv7Var.Q0 : 0.0f) * 0.4f) + 0.6f);
                    i++;
                }
                float interpolation2 = d53.f.getInterpolation(xv7Var.Q0);
                if (viewGroup3 != null && viewGroup4 != null) {
                    float f4 = 1.0f - interpolation2;
                    float f5 = (f4 * 0.4f) + 0.6f;
                    viewGroup3.setScaleX(f5);
                    viewGroup3.setScaleY(f5);
                    viewGroup3.setTranslationY((Math.min(interpolation2, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f6 = (interpolation2 * 0.4f) + 0.6f;
                    viewGroup4.setScaleX(f6);
                    viewGroup4.setScaleY(f6);
                    viewGroup4.setTranslationY((Math.min(f4, 0.25f) * (-gm.L(16.0f))) / 0.25f);
                    viewGroup4.setAlpha(1.0f - (Math.min(f4, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                a58 a58Var = ((f48) obj3).a;
                a58Var.l3 = ((Float) ((ValueAnimator) obj2).getAnimatedValue()).floatValue();
                a58Var.invalidate();
                if (a58Var.l3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    a58Var.g3 = true;
                    try {
                        a58Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 5:
                gk8 gk8Var = (gk8) obj3;
                ub8 ub8Var = (ub8) obj2;
                PremiumPreviewFragment premiumPreviewFragment = gk8Var.n;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ub8Var.setAlpha(floatValue3);
                ub8Var.setScaleX(floatValue3);
                ub8Var.setScaleY(floatValue3);
                float animatedFraction = ((ValueAnimator) obj).getAnimatedFraction();
                while (i < premiumPreviewFragment.V.getChildCount()) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i);
                    if (childAt != gk8Var.e) {
                        childAt.setTranslationY((ub8Var.getMeasuredHeight() * animatedFraction) + (childAt == gk8Var.c ? 0.0f - (gm.L(15.0f) * animatedFraction) : (gm.L(8.0f) * animatedFraction) + 0.0f));
                    }
                    i++;
                }
                break;
            case 6:
                pjb pjbVar = (pjb) obj3;
                pjbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ms1) obj2).getEditField().setAlpha(pjbVar.a);
                ((h22) obj).invalidate();
                break;
            default:
                nrb nrbVar = (nrb) obj3;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj2;
                tl2 tl2Var = (tl2) obj;
                nrbVar.getClass();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() >= 0.5f && !atomicBoolean2.get()) {
                    atomicBoolean2.set(true);
                    nrbVar.setDrawable(tl2Var);
                    break;
                }
                break;
        }
    }
}
