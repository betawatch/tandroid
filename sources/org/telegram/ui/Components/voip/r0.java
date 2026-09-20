package org.telegram.ui.Components.voip;

import ai.l4;
import ai.z5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.mi1;
import org.telegram.ui.s00;
import org.telegram.ui.yd;
import org.telegram.ui.zt0;
import yh.c4;
import yh.k7;
import yh.l8;
import yh.y3;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(a6.i iVar, View view) {
        this.a = 14;
        this.b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        yh.p2 p2Var;
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
                mi1 mi1Var = (mi1) obj;
                mi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = mi1Var.c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * mi1Var.E));
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
                m2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.b.invalidate();
                break;
            case 5:
                l4 l4Var = (l4) obj;
                ((z5) l4Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                l4Var.invalidate();
                break;
            case 6:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.U = floatValue;
                w1Var.V.setAlpha(floatValue);
                w1Var.invalidate();
                break;
            case 7:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.a0 = floatValue2;
                k0Var.j(floatValue2);
                k0Var.b0.setAlpha(k0Var.a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.a0);
                k0Var.invalidate();
                break;
            case 8:
                ((zt0) ((qg.x0) obj)).K.e0.invalidate();
                break;
            case 9:
                qg.s1 s1Var = (qg.s1) obj;
                s1Var.getClass();
                s1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
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
                qg.n2 n2Var = (qg.n2) obj;
                n2Var.getClass();
                n2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                qg.t2 t2Var = (qg.t2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue3;
                yd ydVar = t2Var.c;
                ydVar.setAlpha(floatValue3);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                break;
            case 14:
                ((View) ((g.b0) ((a6.i) obj).b).d.getParent()).invalidate();
                break;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.b0 = floatValue4 < 0.5f ? (floatValue4 / 0.5f) * (-7.0f) : (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 16:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            case 17:
                ((rg.w1) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                yh.q2 q2Var = (yh.q2) obj;
                q2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.l) && z10) {
                    p2Var.l = false;
                    p2Var.b();
                }
                q2Var.invalidate();
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
                s00 s00Var = ((k7) obj).c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                break;
            case 26:
                l8 l8Var = (l8) obj;
                l8Var.getClass();
                l8Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
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

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
