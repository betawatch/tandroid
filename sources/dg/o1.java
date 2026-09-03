package dg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import lh.bb;
import lh.f4;
import lh.g5;
import lh.l5;
import lh.x9;
import lh.y9;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.lt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lh.x3 x3Var;
        boolean z4;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((lt0) ((q1) obj)).H.b0.invalidate();
                break;
            case 1:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                o2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.invalidate();
                break;
            case 2:
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                x2Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                break;
            case 3:
                cg.p pVar = (cg.p) obj;
                pVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.invalidate();
                break;
            case 4:
                q3 q3Var = (q3) obj;
                q3Var.getClass();
                q3Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                y3 y3Var = (y3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.y = floatValue;
                u3 u3Var = y3Var.c;
                u3Var.setAlpha(floatValue);
                u3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.y));
                u3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.y));
                y3Var.b.invalidate();
                break;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.i0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.V = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 7:
                eg.c1 c1Var = (eg.c1) obj;
                c1Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.d.invalidate();
                eg.a1 a1Var = c1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    break;
                }
                break;
            case 8:
                ((eg.q2) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                gg.b bVar = (gg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 10:
                kg.k kVar = (kg.k) obj;
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
                lh.y3 y3Var2 = (lh.y3) obj;
                y3Var2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.B = floatValue3;
                if (floatValue3 >= 0.8f && (x3Var = y3Var2.E) != null && (z4 = x3Var.l) && z4) {
                    x3Var.l = false;
                    x3Var.b();
                }
                y3Var2.invalidate();
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
                mg.u uVar = ((mg.v) obj).b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    break;
                }
                break;
            case 19:
                nh.a aVar = (nh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 20:
                nh.p pVar2 = (nh.p) obj;
                pVar2.L.e = AndroidUtilities.lerp(0.0f, 1.0f - pVar2.V.a0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar2.invalidate();
                break;
            case 21:
                ((nh.v0) obj).invalidate();
                break;
            case 22:
                nh.g2 g2Var = (nh.g2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.c.setAlpha(floatValue6);
                g2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                g2Var.invalidate();
                break;
            case 23:
                nh.o0 o0Var = (nh.o0) obj;
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
                nh.o0 o0Var2 = (nh.o0) ((cg.l0) obj).b;
                Drawable drawable2 = o0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, o0Var2.f, floatValue8) * 255.0f));
                    o0Var2.h.invalidate();
                    break;
                }
                break;
            case 25:
                nh.j1 j1Var = (nh.j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                nh.r1 r1Var = (nh.r1) obj;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 27:
                nh.z3 z3Var = (nh.z3) obj;
                z3Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = z3Var.c;
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
                t4 t4Var = (t4) obj;
                t4Var.r = ((Float) t4Var.w.getAnimatedValue()).floatValue();
                t4Var.invalidate();
                break;
        }
    }
}
