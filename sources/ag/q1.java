package ag;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import jh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.p71;
import org.telegram.ui.tg1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                s1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.e();
                break;
            case 1:
                ((n1) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((f2.a0) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                i4 i4Var = (i4) this.b;
                i4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 4:
                kh.r rVar = (kh.r) this.b;
                rVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f.invalidate();
                break;
            case 5:
                lh.d0 d0Var = (lh.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 6:
                o7 o7Var = (o7) this.b;
                o7Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 7:
                ((n9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                hh.f1 f1Var = ((o60) this.b).e.d;
                int i10 = f1Var.A1;
                if (i10 != -1 && (view = f1Var.B1) != null) {
                    f1Var.i1(i10, view);
                    f1Var.invalidate();
                    break;
                }
                break;
            case 9:
                p71 p71Var = (p71) this.b;
                View[] viewArr = p71Var.e;
                if (p71Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    p71Var.c = abs;
                    e71 e71Var = p71Var.I;
                    if (e71Var != null) {
                        e71Var.e(abs, p71Var.d, p71Var.b);
                    }
                }
                p71Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var2 = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var2.F = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var2.e0;
                if (r1Var != null) {
                    ((tg1) r1Var).b.Z.d(floatValue, s1Var2.L);
                }
                s1Var2.invalidate();
                break;
            case 11:
                pf.x0 x0Var = (pf.x0) this.b;
                x0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i11].setVisibility(0);
                    float f10 = 0.0f;
                    x0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility(0);
                    TextView textView = x0Var.d[i11];
                    float f11 = i11 == 0 ? 1.0f : 0.0f;
                    if (i11 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f11, f10, x0Var.e));
                    i11++;
                }
                break;
            case 12:
                rf.k kVar = (rf.k) this.b;
                kVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                break;
            default:
                rf.p pVar = (rf.p) this.b;
                pVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                break;
        }
    }
}
