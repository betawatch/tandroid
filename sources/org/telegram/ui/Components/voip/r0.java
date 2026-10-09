package org.telegram.ui.Components.voip;

import ai.m4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.au0;
import org.telegram.ui.pi1;
import org.telegram.ui.s00;
import org.telegram.ui.yd;
import yh.d7;
import yh.e8;
import yh.s3;
import yh.w3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        yh.l2 l2Var;
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
                pi1 pi1Var = (pi1) obj;
                pi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = pi1Var.c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * pi1Var.E));
                b1Var.requestLayout();
                break;
            case 2:
                j1 j1Var = (j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                u1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                break;
            case 4:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                m2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.b.invalidate();
                break;
            case 5:
                m4 m4Var = (m4) obj;
                ((z5) m4Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m4Var.invalidate();
                break;
            case 6:
                org.telegram.ui.web.u1 u1Var2 = (org.telegram.ui.web.u1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var2.U = floatValue;
                u1Var2.V.setAlpha(floatValue);
                u1Var2.invalidate();
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
                ((au0) ((qg.w0) obj)).K.e0.invalidate();
                break;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 10:
                qg.z1 z1Var = (qg.z1) obj;
                z1Var.getClass();
                z1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                break;
            case 11:
                pg.n nVar = (pg.n) obj;
                nVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 12:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                qg.u2 u2Var = (qg.u2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.y = floatValue3;
                yd ydVar = u2Var.c;
                ydVar.setAlpha(floatValue3);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                u2Var.b.invalidate();
                break;
            case 14:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue4 < 0.5f ? (floatValue4 / 0.5f) * (-7.0f) : (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 15:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            case 16:
                ((rg.w1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 17:
                ((sg.f) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                s3 s3Var = (s3) obj;
                s3Var.Z0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.U1();
                break;
            case 21:
                ((yh.t2) obj).h.invalidate();
                break;
            case 22:
                yh.m2 m2Var2 = (yh.m2) obj;
                m2Var2.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var2.E = floatValue5;
                if (floatValue5 >= 0.8f && (l2Var = m2Var2.H) != null && (z10 = l2Var.l) && z10) {
                    l2Var.l = false;
                    l2Var.b();
                }
                m2Var2.invalidate();
                break;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 24:
                w3 w3Var = (w3) obj;
                w3Var.getClass();
                w3Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                break;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((d7) obj).c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                break;
            case 26:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                break;
            default:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zg.s sVar = ((zg.t) obj).b;
                if (sVar != null) {
                    sVar.setAlpha(floatValue7);
                    break;
                }
                break;
        }
    }
}
