package org.telegram.ui.Components.voip;

import ai.l4;
import ai.y5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.di1;
import org.telegram.ui.s00;
import org.telegram.ui.ut0;
import org.telegram.ui.zd;
import yh.c4;
import yh.m7;
import yh.o8;
import yh.y3;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(a4.m mVar, View view) {
        this.a = 14;
        this.b = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        yh.q2 q2Var;
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                s0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 1:
                di1 di1Var = (di1) obj;
                di1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = di1Var.c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * di1Var.E));
                b1Var.requestLayout();
                break;
            case 2:
                k1 k1Var = (k1) obj;
                k1Var.getClass();
                k1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                v1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                break;
            case 4:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                n2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.b.invalidate();
                break;
            case 5:
                l4 l4Var = (l4) obj;
                ((y5) l4Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                break;
            case 6:
                org.telegram.ui.web.v1 v1Var2 = (org.telegram.ui.web.v1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var2.U = floatValue;
                v1Var2.V.setAlpha(floatValue);
                v1Var2.invalidate();
                break;
            case 7:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.a0 = floatValue2;
                l0Var.j(floatValue2);
                l0Var.b0.setAlpha(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 8:
                ((ut0) ((qg.w0) obj)).K.e0.invalidate();
                break;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 10:
                qg.y1 y1Var = (qg.y1) obj;
                y1Var.getClass();
                y1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 12:
                qg.n2 n2Var2 = (qg.n2) obj;
                n2Var2.getClass();
                n2Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                qg.t2 t2Var = (qg.t2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue3;
                zd zdVar = t2Var.c;
                zdVar.setAlpha(floatValue3);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                break;
            case 14:
                ((View) ((g.b0) ((a4.m) obj).b).d.getParent()).invalidate();
                break;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue4 < 0.5f ? (floatValue4 / 0.5f) * (-7.0f) : (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 16:
                rg.q0 q0Var = (rg.q0) obj;
                q0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.d.invalidate();
                rg.p0 p0Var = q0Var.e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    break;
                }
                break;
            case 17:
                ((rg.y1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 18:
                tg.b bVar = (tg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 19:
                xg.i iVar = (xg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                y3 y3Var = (y3) obj;
                y3Var.Y0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.T1();
                break;
            case 21:
                ((yh.y2) obj).h.invalidate();
                break;
            case 22:
                yh.r2 r2Var = (yh.r2) obj;
                r2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (q2Var = r2Var.H) != null && (z10 = q2Var.l) && z10) {
                    q2Var.l = false;
                    q2Var.b();
                }
                r2Var.invalidate();
                break;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 24:
                c4 c4Var = (c4) obj;
                c4Var.getClass();
                c4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.invalidate();
                break;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((m7) obj).c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                break;
            case 26:
                o8 o8Var = (o8) obj;
                o8Var.getClass();
                o8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                break;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.q qVar = ((zg.r) obj).b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue7);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
