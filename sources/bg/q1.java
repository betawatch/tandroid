package bg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import jh.ab;
import jh.h5;
import jh.m5;
import jh.w9;
import jh.x9;
import lh.s4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        jh.y3 y3Var;
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((vs0) ((s1) obj)).G.a0.invalidate();
                break;
            case 1:
                r2 r2Var = (r2) obj;
                r2Var.getClass();
                r2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                break;
            case 2:
                a3 a3Var = (a3) obj;
                a3Var.getClass();
                a3Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                break;
            case 3:
                ag.q qVar = (ag.q) obj;
                qVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.invalidate();
                break;
            case 4:
                u3 u3Var = (u3) obj;
                u3Var.getClass();
                u3Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                c4 c4Var = (c4) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.y = floatValue;
                y3 y3Var2 = c4Var.c;
                y3Var2.setAlpha(floatValue);
                y3Var2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.y));
                y3Var2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.y));
                c4Var.b.invalidate();
                break;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.h0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.U = floatValue2 < 0.5f ? (floatValue2 / 0.5f) * (-7.0f) : (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 7:
                cg.d1 d1Var = (cg.d1) obj;
                d1Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.d.invalidate();
                cg.b1 b1Var = d1Var.e;
                if (b1Var != null) {
                    b1Var.invalidate();
                    break;
                }
                break;
            case 8:
                ((cg.s2) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                eg.b bVar = (eg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 10:
                ig.k kVar = (ig.k) obj;
                kVar.getClass();
                kVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                h5 h5Var = (h5) obj;
                h5Var.U0.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h5Var.T1();
                break;
            case 12:
                ((jh.g4) obj).h.invalidate();
                break;
            case 13:
                jh.z3 z3Var = (jh.z3) obj;
                z3Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.A = floatValue3;
                if (floatValue3 >= 0.8f && (y3Var = z3Var.D) != null && (z10 = y3Var.l) && z10) {
                    y3Var.l = false;
                    y3Var.b();
                }
                z3Var.invalidate();
                break;
            case 14:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 15:
                m5 m5Var = (m5) obj;
                m5Var.getClass();
                m5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.invalidate();
                break;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = ((x9) obj).c;
                w9Var.setScaleX(floatValue4);
                w9Var.setScaleY(floatValue4);
                break;
            case 17:
                ab abVar = (ab) obj;
                abVar.getClass();
                abVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abVar.invalidate();
                break;
            case 18:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg.u uVar = ((kg.v) obj).b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    break;
                }
                break;
            case 19:
                lh.a aVar = (lh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 20:
                lh.o oVar = (lh.o) obj;
                oVar.K.e = AndroidUtilities.lerp(0.0f, 1.0f - oVar.U.W, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.invalidate();
                break;
            case 21:
                ((lh.u0) obj).invalidate();
                break;
            case 22:
                lh.f2 f2Var = (lh.f2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.c.setAlpha(floatValue6);
                f2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                f2Var.invalidate();
                break;
            case 23:
                lh.n0 n0Var = (lh.n0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(n0Var.f, 1.0f, floatValue7) * 255.0f));
                    n0Var.h.invalidate();
                    break;
                }
                break;
            case 24:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh.n0 n0Var2 = (lh.n0) ((ag.m0) obj).b;
                Drawable drawable2 = n0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, n0Var2.f, floatValue8) * 255.0f));
                    n0Var2.h.invalidate();
                    break;
                }
                break;
            case 25:
                lh.i1 i1Var = (lh.i1) obj;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                lh.q1 q1Var = (lh.q1) obj;
                q1Var.getClass();
                q1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 27:
                lh.z3 z3Var2 = (lh.z3) obj;
                z3Var2.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = z3Var2.c;
                textViewArr[0].setAlpha(floatValue9);
                float f9 = 1.0f - floatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f9);
                textViewArr[1].setAlpha(f9);
                textViewArr[1].setTranslationY(floatValue9 * AndroidUtilities.dp(4.0f));
                break;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.C = floatValue10;
                iz0Var.N = floatValue10;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            default:
                s4 s4Var = (s4) obj;
                s4Var.r = ((Float) s4Var.w.getAnimatedValue()).floatValue();
                s4Var.invalidate();
                break;
        }
    }
}
