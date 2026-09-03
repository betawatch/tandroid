package eg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import mh.bb;
import mh.f4;
import mh.g5;
import mh.l5;
import mh.x9;
import mh.y9;
import oh.b4;
import oh.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.lt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        mh.x3 x3Var;
        boolean z4;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((lt0) ((o1) obj)).H.b0.invalidate();
                break;
            case 1:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                m2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.invalidate();
                break;
            case 2:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                break;
            case 3:
                dg.p pVar = (dg.p) obj;
                pVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.invalidate();
                break;
            case 4:
                o3 o3Var = (o3) obj;
                o3Var.getClass();
                o3Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                w3 w3Var = (w3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.y = floatValue;
                s3 s3Var = w3Var.c;
                s3Var.setAlpha(floatValue);
                s3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.y));
                s3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.y));
                w3Var.b.invalidate();
                break;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.i0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.V = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 7:
                fg.b1 b1Var = (fg.b1) obj;
                b1Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.d.invalidate();
                fg.a1 a1Var = b1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    break;
                }
                break;
            case 8:
                ((fg.p2) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                hg.b bVar = (hg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 10:
                lg.k kVar = (lg.k) obj;
                kVar.getClass();
                kVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                g5 g5Var = (g5) obj;
                g5Var.V0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var.T1();
                break;
            case 12:
                ((f4) obj).h.invalidate();
                break;
            case 13:
                mh.y3 y3Var = (mh.y3) obj;
                y3Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.B = floatValue3;
                if (floatValue3 >= 0.8f && (x3Var = y3Var.E) != null && (z4 = x3Var.l) && z4) {
                    x3Var.l = false;
                    x3Var.b();
                }
                y3Var.invalidate();
                break;
            case 14:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 15:
                l5 l5Var = (l5) obj;
                l5Var.getClass();
                l5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.invalidate();
                break;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = ((y9) obj).c;
                x9Var.setScaleX(floatValue4);
                x9Var.setScaleY(floatValue4);
                break;
            case 17:
                bb bbVar = (bb) obj;
                bbVar.getClass();
                bbVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.invalidate();
                break;
            case 18:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng.u uVar = ((ng.v) obj).b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    break;
                }
                break;
            case 19:
                oh.a aVar = (oh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 20:
                oh.o oVar = (oh.o) obj;
                oVar.L.e = AndroidUtilities.lerp(0.0f, 1.0f - oVar.V.a0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.invalidate();
                break;
            case 21:
                ((oh.v0) obj).invalidate();
                break;
            case 22:
                oh.h2 h2Var = (oh.h2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.c.setAlpha(floatValue6);
                h2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                h2Var.invalidate();
                break;
            case 23:
                oh.o0 o0Var = (oh.o0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = o0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(o0Var.f, 1.0f, floatValue7) * 255.0f));
                    o0Var.h.invalidate();
                    break;
                }
                break;
            case 24:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh.o0 o0Var2 = (oh.o0) ((dg.l0) obj).b;
                Drawable drawable2 = o0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, o0Var2.f, floatValue8) * 255.0f));
                    o0Var2.h.invalidate();
                    break;
                }
                break;
            case 25:
                oh.j1 j1Var = (oh.j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                oh.r1 r1Var = (oh.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 27:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b4Var.c;
                textViewArr[0].setAlpha(floatValue9);
                float f10 = 1.0f - floatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue9 * AndroidUtilities.dp(4.0f));
                break;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                a01 a01Var = profileStoriesView.h;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.D = floatValue10;
                a01Var.O = floatValue10;
                a01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            default:
                u4 u4Var = (u4) obj;
                u4Var.r = ((Float) u4Var.w.getAnimatedValue()).floatValue();
                u4Var.invalidate();
                break;
        }
    }
}
