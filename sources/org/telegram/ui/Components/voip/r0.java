package org.telegram.ui.Components.voip;

import ai.l4;
import ai.y5;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fi1;
import org.telegram.ui.o00;
import org.telegram.ui.rt0;
import org.telegram.ui.xd;
import yh.b4;
import yh.k7;
import yh.l8;
import yh.x3;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        yh.o2 o2Var;
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
                fi1 fi1Var = (fi1) obj;
                fi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                b1 b1Var = fi1Var.c;
                b1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * fi1Var.E));
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
                ((rt0) ((qg.x0) obj)).K.e0.invalidate();
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
                qg.n2 n2Var2 = (qg.n2) obj;
                n2Var2.getClass();
                n2Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                qg.t2 t2Var = (qg.t2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue3;
                xd xdVar = t2Var.c;
                xdVar.setAlpha(floatValue3);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
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
                x3 x3Var = (x3) obj;
                x3Var.Y0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.T1();
                break;
            case 21:
                ((yh.x2) obj).h.invalidate();
                break;
            case 22:
                yh.p2 p2Var = (yh.p2) obj;
                p2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (o2Var = p2Var.H) != null && (z10 = o2Var.l) && z10) {
                    o2Var.l = false;
                    o2Var.b();
                }
                p2Var.invalidate();
                break;
            case 23:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 24:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                b4Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                break;
            case 25:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o00 o00Var = ((k7) obj).c;
                o00Var.setScaleX(floatValue6);
                o00Var.setScaleY(floatValue6);
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
