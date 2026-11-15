package ah;

import ai.j0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a6;
import ci.a0;
import ci.i0;
import di.ab;
import di.c6;
import di.fc;
import di.h6;
import di.r4;
import di.s4;
import di.y4;
import di.za;
import fi.c2;
import fi.k5;
import fi.n0;
import fi.o1;
import fi.u0;
import fi.v6;
import fi.w6;
import fi.x3;
import fi.z7;
import hi.h3;
import hi.n2;
import hi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r4 r4Var;
        boolean z10;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                a6 a6Var = (a6) this.b;
                a6Var.getClass();
                a6Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.j0();
                break;
            case 2:
                ch.r rVar = (ch.r) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.q qVar = rVar.b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue);
                    break;
                }
                break;
            case 3:
                a0 a0Var = (a0) this.b;
                a0Var.getClass();
                a0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.invalidate();
                break;
            case 4:
                ((i0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                c6 c6Var = (c6) this.b;
                c6Var.X2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.P1();
                break;
            case 6:
                ((y4) this.b).h.invalidate();
                break;
            case 7:
                s4 s4Var = (s4) this.b;
                s4Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.F = floatValue2;
                if (floatValue2 >= 0.8f && (r4Var = s4Var.I) != null && (z10 = r4Var.l) && z10) {
                    r4Var.l = false;
                    r4Var.b();
                }
                s4Var.invalidate();
                break;
            case 8:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 9:
                h6 h6Var = (h6) this.b;
                h6Var.getClass();
                h6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                break;
            case 10:
                ab abVar = (ab) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                za zaVar = abVar.c;
                zaVar.setScaleX(floatValue3);
                zaVar.setScaleY(floatValue3);
                break;
            case 11:
                fc fcVar = (fc) this.b;
                fcVar.getClass();
                fcVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fcVar.invalidate();
                break;
            case 12:
                fi.a aVar = (fi.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 13:
                fi.p pVar = (fi.p) this.b;
                pVar.P.e = g0.T1(0.0f, 1.0f - pVar.c0.e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                break;
            case 14:
                ((u0) this.b).invalidate();
                break;
            case 15:
                c2 c2Var = (c2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.c.setAlpha(floatValue4);
                c2Var.a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                c2Var.invalidate();
                break;
            case 16:
                n0 n0Var = (n0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(n0Var.f, 1.0f, floatValue5) * 255.0f));
                    n0Var.h.invalidate();
                    break;
                }
                break;
            case 17:
                j0 j0Var = (j0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = (n0) j0Var.b;
                Drawable drawable2 = n0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, n0Var2.f, floatValue6) * 255.0f));
                    n0Var2.h.invalidate();
                    break;
                }
                break;
            case 18:
                o1 o1Var = (o1) this.b;
                o1Var.getClass();
                o1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                break;
            case 19:
                x3 x3Var = (x3) this.b;
                x3Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = x3Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                break;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                vv0 vv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                vv0Var.S = floatValue8;
                vv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 21:
                fi.s4 s4Var2 = (fi.s4) this.b;
                s4Var2.r = ((Float) s4Var2.x.getAnimatedValue()).floatValue();
                s4Var2.invalidate();
                break;
            case 22:
                k5 k5Var = (k5) this.b;
                k5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.e.setTranslationY(((-k5Var.d) + k5Var.getMeasuredHeight()) - k5Var.w);
                break;
            case 23:
                w6 w6Var = (w6) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = w6Var.a;
                v6 v6Var = (v6) arrayList.get(w6Var.d);
                v6Var.n = floatValue9;
                v6Var.invalidate();
                int i7 = w6Var.c;
                if (i7 != -1) {
                    v6 v6Var2 = (v6) arrayList.get(i7);
                    v6Var2.n = 1.0f - floatValue9;
                    v6Var2.invalidate();
                    break;
                }
                break;
            case 24:
                z7 z7Var = (z7) this.b;
                z7Var.getClass();
                z7Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.K.requestLayout();
                break;
            case 25:
                gi.q qVar2 = (gi.q) this.b;
                qVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar2.r.setTranslationY(g0.W1(qVar2.x, -g0.L(42.0f), 0));
                qVar2.n.setTranslationY(g0.W1(qVar2.x, 0, g0.L(42.0f)));
                break;
            case 26:
                hi.m mVar = (hi.m) this.b;
                mVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(g0.W1(mVar.o0, mVar.getEditTextLeft() + g0.L(-26.0f), g0.L(2.0f)));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(g0.W1(mVar.o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.o0);
                mVar.r.setAlpha((float) Math.pow(mVar.o0, 16.0d));
                mVar.u(mVar.o0);
                hi.i iVar = mVar.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 27:
                y yVar = (y) this.b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.a.invalidate();
                break;
            case 28:
                n2 n2Var = (n2) this.b;
                n2Var.getClass();
                n2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.i();
                break;
            default:
                ((h3) this.b).m1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
