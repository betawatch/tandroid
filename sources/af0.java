// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class af0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ af0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kc0) obj).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                gs0 gs0Var = (gs0) obj;
                gs0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gs0Var.f.invalidate();
                break;
            case 2:
                yv1 yv1Var = (yv1) obj;
                yv1Var.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.m1.invalidate();
                break;
            case 3:
                bm2 bm2Var = (bm2) obj;
                bm2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm2Var.p.invalidate();
                break;
            case 4:
                nk3 nk3Var = (nk3) obj;
                nk3Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = nk3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 5:
                mq3 mq3Var = (mq3) obj;
                mq3Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mq3Var.I = true;
                mq3Var.invalidate();
                break;
            case 6:
                pu9 pu9Var = ((ht5) obj).e.n1;
                int i = pu9Var.D1;
                if (i != -1 && (view = pu9Var.E1) != null) {
                    pu9Var.l1(i, view);
                    pu9Var.invalidate();
                    break;
                }
                break;
            case 7:
                ((du5) obj).y = valueAnimator.getAnimatedFraction();
                break;
            case 8:
                MediaController mediaController = (MediaController) obj;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.m0();
                break;
            case 9:
                rc7 rc7Var = (rc7) obj;
                rc7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rc7Var.invalidate();
                int i2 = 0;
                while (i2 < 2) {
                    rc7Var.c[i2].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    rc7Var.c[i2].setVisibility(0);
                    float f = 0.0f;
                    rc7Var.c[i2].setAlpha(gm.R1(i2 == 0 ? 1.0f : 0.0f, i2 == 1 ? 1.0f : 0.0f, rc7Var.e));
                    rc7Var.d[i2].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    rc7Var.d[i2].setVisibility(0);
                    TextView textView = rc7Var.d[i2];
                    float f2 = i2 == 0 ? 1.0f : 0.0f;
                    if (i2 == 1) {
                        f = 1.0f;
                    }
                    textView.setAlpha(gm.R1(f2, f, rc7Var.e));
                    i2++;
                }
                break;
            case 10:
                cj8 cj8Var = (cj8) obj;
                cj8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj8Var.e();
                break;
            case 11:
                ((zi8) obj).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                p1a p1aVar = (p1a) obj;
                p1aVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1aVar.invalidate();
                break;
            case 13:
                sha shaVar = (sha) obj;
                shaVar.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shaVar.invalidate();
                break;
            case 14:
                joa joaVar = (joa) obj;
                joaVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                joaVar.I = true;
                joaVar.invalidate();
                break;
            case 15:
                ((rob) obj).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                wgc wgcVar = (wgc) obj;
                View[] viewArr = wgcVar.e;
                if (wgcVar.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    wgcVar.c = abs;
                    mgc mgcVar = wgcVar.N;
                    if (mgcVar != null) {
                        mgcVar.f(abs, wgcVar.d, wgcVar.b);
                    }
                }
                wgcVar.x(false);
                break;
            default:
                phc phcVar = (phc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                phcVar.K = floatValue;
                ohc ohcVar = phcVar.j0;
                if (ohcVar != null) {
                    ((shc) ohcVar).b.e0.d(phcVar.Q, floatValue);
                }
                phcVar.invalidate();
                break;
        }
    }
}
