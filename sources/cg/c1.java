package cg;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import lh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z71;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.b;
                d1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.e();
                break;
            case 1:
                ((a1) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((f2.z) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                i4 i4Var = (i4) this.b;
                i4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 4:
                mh.r rVar = (mh.r) this.b;
                rVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f.invalidate();
                break;
            case 5:
                nh.d0 d0Var = (nh.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 6:
                p7 p7Var = (p7) this.b;
                p7Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                break;
            case 7:
                ((t9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                jh.e1 e1Var = ((w60) this.b).e.d;
                int i10 = e1Var.A1;
                if (i10 != -1 && (view = e1Var.B1) != null) {
                    e1Var.i1(i10, view);
                    e1Var.invalidate();
                    break;
                }
                break;
            case 9:
                z71 z71Var = (z71) this.b;
                View[] viewArr = z71Var.e;
                if (z71Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    z71Var.c = abs;
                    o71 o71Var = z71Var.I;
                    if (o71Var != null) {
                        o71Var.e(abs, z71Var.d, z71Var.b);
                    }
                }
                z71Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.F = floatValue;
                org.telegram.ui.Components.voip.s1 s1Var = t1Var.e0;
                if (s1Var != null) {
                    ((wg1) s1Var).b.Z.d(floatValue, t1Var.L);
                }
                t1Var.invalidate();
                break;
            case 11:
                rf.y0 y0Var = (rf.y0) this.b;
                y0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    y0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.e));
                    y0Var.c[i11].setVisibility(0);
                    float f9 = 0.0f;
                    y0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, y0Var.e));
                    y0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.e));
                    y0Var.d[i11].setVisibility(0);
                    TextView textView = y0Var.d[i11];
                    float f10 = i11 == 0 ? 1.0f : 0.0f;
                    if (i11 == 1) {
                        f9 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f9, y0Var.e));
                    i11++;
                }
                break;
            case 12:
                tf.k kVar = (tf.k) this.b;
                kVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                break;
            default:
                tf.p pVar = (tf.p) this.b;
                pVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                break;
        }
    }
}
