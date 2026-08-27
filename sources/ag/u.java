package ag;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import hh.ca;
import hh.da;
import hh.g4;
import hh.gb;
import hh.i5;
import hh.o5;
import hh.y3;
import hh.z3;
import java.util.ArrayList;
import jh.a4;
import jh.k5;
import jh.s4;
import jh.v6;
import jh.w6;
import jh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y3 y3Var;
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.h0;
                limitPreviewView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.U = floatValue < 0.5f ? (floatValue / 0.5f) * (-7.0f) : (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 1:
                s1 s1Var = (s1) obj;
                s1Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.d.invalidate();
                o1 o1Var = s1Var.e;
                if (o1Var != null) {
                    o1Var.invalidate();
                    break;
                }
                break;
            case 2:
                ((k3) obj).a.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 3:
                cg.b bVar = (cg.b) obj;
                bVar.getClass();
                bVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                break;
            case 4:
                gg.l lVar = (gg.l) obj;
                lVar.getClass();
                lVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                i5 i5Var = (i5) obj;
                i5Var.U0.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.T1();
                break;
            case 6:
                ((g4) obj).h.invalidate();
                break;
            case 7:
                z3 z3Var = (z3) obj;
                z3Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.A = floatValue2;
                if (floatValue2 >= 0.8f && (y3Var = z3Var.D) != null && (z10 = y3Var.l) && z10) {
                    y3Var.l = false;
                    y3Var.b();
                }
                z3Var.invalidate();
                break;
            case 8:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 9:
                o5 o5Var = (o5) obj;
                o5Var.getClass();
                o5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                break;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca caVar = ((da) obj).c;
                caVar.setScaleX(floatValue3);
                caVar.setScaleY(floatValue3);
                break;
            case 11:
                gb gbVar = (gb) obj;
                gbVar.getClass();
                gbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.invalidate();
                break;
            case 12:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.u uVar = ((ig.v) obj).b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue4);
                    break;
                }
                break;
            case 13:
                jh.a aVar = (jh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 14:
                jh.o oVar = (jh.o) obj;
                oVar.K.e = AndroidUtilities.lerp(0.0f, 1.0f - oVar.U.W, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.invalidate();
                break;
            case 15:
                ((jh.u0) obj).invalidate();
                break;
            case 16:
                jh.g2 g2Var = (jh.g2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.c.setAlpha(floatValue5);
                g2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue5));
                g2Var.invalidate();
                break;
            case 17:
                jh.n0 n0Var = (jh.n0) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(n0Var.f, 1.0f, floatValue6) * 255.0f));
                    n0Var.h.invalidate();
                    break;
                }
                break;
            case 18:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jh.n0 n0Var2 = (jh.n0) ((r1) obj).b;
                Drawable drawable2 = n0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, n0Var2.f, floatValue7) * 255.0f));
                    n0Var2.h.invalidate();
                    break;
                }
                break;
            case 19:
                jh.i1 i1Var = (jh.i1) obj;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                jh.q1 q1Var = (jh.q1) obj;
                q1Var.getClass();
                q1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 21:
                a4 a4Var = (a4) obj;
                a4Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = a4Var.c;
                textViewArr[0].setAlpha(floatValue8);
                float f10 = 1.0f - floatValue8;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue8 * AndroidUtilities.dp(4.0f));
                break;
            case 22:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.C = floatValue9;
                iz0Var.N = floatValue9;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 23:
                s4 s4Var = (s4) obj;
                s4Var.r = ((Float) s4Var.w.getAnimatedValue()).floatValue();
                s4Var.invalidate();
                break;
            case 24:
                k5 k5Var = (k5) obj;
                k5Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.e.setTranslationY(((-k5Var.d) + k5Var.getMeasuredHeight()) - k5Var.v);
                break;
            case 25:
                w6 w6Var = (w6) obj;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = w6Var.a;
                v6 v6Var = (v6) arrayList.get(w6Var.d);
                v6Var.n = floatValue10;
                v6Var.invalidate();
                int i12 = w6Var.c;
                if (i12 != -1) {
                    v6 v6Var2 = (v6) arrayList.get(i12);
                    v6Var2.n = 1.0f - floatValue10;
                    v6Var2.invalidate();
                    break;
                }
                break;
            case 26:
                z7 z7Var = (z7) obj;
                z7Var.getClass();
                z7Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                break;
            case 27:
                kh.v vVar = (kh.v) obj;
                vVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.w));
                vVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.w));
                break;
            case 28:
                lh.m mVar = (lh.m) obj;
                mVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.k0));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.k0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.k0));
                gVar.getEmojiButton().setAlpha(mVar.k0);
                mVar.r.setAlpha((float) Math.pow(mVar.k0, 16.0d));
                mVar.u(mVar.k0);
                lh.i iVar = mVar.I;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.k0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            default:
                lh.z zVar = (lh.z) obj;
                zVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.a.invalidate();
                break;
        }
    }
}
