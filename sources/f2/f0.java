package f2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import ih.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.o9;
import org.telegram.ui.ug1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                ((b0) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                m4 m4Var = (m4) this.b;
                m4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.invalidate();
                break;
            case 2:
                jh.q qVar = (jh.q) this.b;
                qVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.f.invalidate();
                break;
            case 3:
                kh.e0 e0Var = (kh.e0) this.b;
                e0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.p.invalidate();
                break;
            case 4:
                of.i1 i1Var = (of.i1) this.b;
                i1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var.invalidate();
                int i9 = 0;
                while (i9 < 2) {
                    i1Var.c[i9].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.e));
                    i1Var.c[i9].setVisibility(0);
                    float f10 = 0.0f;
                    i1Var.c[i9].setAlpha(AndroidUtilities.lerp(i9 == 0 ? 1.0f : 0.0f, i9 == 1 ? 1.0f : 0.0f, i1Var.e));
                    i1Var.d[i9].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.e));
                    i1Var.d[i9].setVisibility(0);
                    TextView textView = i1Var.d[i9];
                    float f11 = i9 == 0 ? 1.0f : 0.0f;
                    if (i9 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f11, f10, i1Var.e));
                    i9++;
                }
                break;
            case 5:
                r7 r7Var = (r7) this.b;
                r7Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                break;
            case 6:
                ((o9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                gh.f1 f1Var = ((j60) this.b).e.d;
                int i10 = f1Var.A1;
                if (i10 != -1 && (view = f1Var.B1) != null) {
                    f1Var.i1(i10, view);
                    f1Var.invalidate();
                    break;
                }
                break;
            case 8:
                n71 n71Var = (n71) this.b;
                View[] viewArr = n71Var.e;
                if (n71Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    n71Var.c = abs;
                    c71 c71Var = n71Var.I;
                    if (c71Var != null) {
                        c71Var.e(abs, n71Var.d, n71Var.b);
                    }
                }
                n71Var.w(false);
                break;
            case 9:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.F = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.e0;
                if (r1Var != null) {
                    ((ug1) r1Var).b.Z.d(floatValue, s1Var.L);
                }
                s1Var.invalidate();
                break;
            case 10:
                qf.k kVar = (qf.k) this.b;
                kVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                break;
            case 11:
                qf.p pVar = (qf.p) this.b;
                pVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                break;
            case 12:
                zf.p0 p0Var = (zf.p0) this.b;
                p0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                break;
            default:
                ((zf.n0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
