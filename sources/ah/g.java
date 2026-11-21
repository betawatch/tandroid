package ah;

import ai.k0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.k8;
import ch.s;
import ci.b0;
import ci.j0;
import di.b5;
import di.db;
import di.eb;
import di.f6;
import di.jc;
import di.k6;
import di.u4;
import di.v4;
import fi.a2;
import fi.j5;
import fi.m0;
import fi.m1;
import fi.r4;
import fi.s6;
import fi.t0;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.a0;
import hi.h3;
import hi.n2;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        u4 u4Var;
        boolean z10;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                k8 k8Var = (k8) this.b;
                k8Var.getClass();
                k8Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.k0();
                break;
            case 2:
                s sVar = (s) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.r rVar = sVar.b;
                if (rVar != null) {
                    rVar.setAlpha(floatValue);
                    break;
                }
                break;
            case 3:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                b0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.invalidate();
                break;
            case 4:
                ((j0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                f6 f6Var = (f6) this.b;
                f6Var.X2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.X1();
                break;
            case 6:
                ((b5) this.b).h.invalidate();
                break;
            case 7:
                v4 v4Var = (v4) this.b;
                v4Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.F = floatValue2;
                if (floatValue2 >= 0.8f && (u4Var = v4Var.I) != null && (z10 = u4Var.l) && z10) {
                    u4Var.l = false;
                    u4Var.b();
                }
                v4Var.invalidate();
                break;
            case 8:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 9:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                k6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                break;
            case 10:
                eb ebVar = (eb) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = ebVar.c;
                dbVar.setScaleX(floatValue3);
                dbVar.setScaleY(floatValue3);
                break;
            case 11:
                jc jcVar = (jc) this.b;
                jcVar.getClass();
                jcVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.invalidate();
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
                ((t0) this.b).invalidate();
                break;
            case 15:
                a2 a2Var = (a2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.c.setAlpha(floatValue4);
                a2Var.a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                a2Var.invalidate();
                break;
            case 16:
                m0 m0Var = (m0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = m0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(m0Var.f, 1.0f, floatValue5) * 255.0f));
                    m0Var.h.invalidate();
                    break;
                }
                break;
            case 17:
                k0 k0Var = (k0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var2 = (m0) k0Var.b;
                Drawable drawable2 = m0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, m0Var2.f, floatValue6) * 255.0f));
                    m0Var2.h.invalidate();
                    break;
                }
                break;
            case 18:
                m1 m1Var = (m1) this.b;
                m1Var.getClass();
                m1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                break;
            case 19:
                v3 v3Var = (v3) this.b;
                v3Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = v3Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                break;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                wv0 wv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                wv0Var.S = floatValue8;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 21:
                r4 r4Var = (r4) this.b;
                r4Var.r = ((Float) r4Var.x.getAnimatedValue()).floatValue();
                r4Var.invalidate();
                break;
            case 22:
                j5 j5Var = (j5) this.b;
                j5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.e.setTranslationY(((-j5Var.d) + j5Var.getMeasuredHeight()) - j5Var.w);
                break;
            case 23:
                t6 t6Var = (t6) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = t6Var.a;
                s6 s6Var = (s6) arrayList.get(t6Var.d);
                s6Var.n = floatValue9;
                s6Var.invalidate();
                int i7 = t6Var.c;
                if (i7 != -1) {
                    s6 s6Var2 = (s6) arrayList.get(i7);
                    s6Var2.n = 1.0f - floatValue9;
                    s6Var2.invalidate();
                    break;
                }
                break;
            case 24:
                w7 w7Var = (w7) this.b;
                w7Var.getClass();
                w7Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                w7Var.requestLayout();
                w7Var.K.requestLayout();
                break;
            case 25:
                gi.q qVar = (gi.q) this.b;
                qVar.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.r.setTranslationY(g0.W1(qVar.x, -g0.L(42.0f), 0));
                qVar.n.setTranslationY(g0.W1(qVar.x, 0, g0.L(42.0f)));
                break;
            case 26:
                hi.o oVar2 = (hi.o) this.b;
                oVar2.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi.h hVar = oVar2.f;
                hVar.getEditText().setTranslationX(g0.W1(oVar2.o0, oVar2.getEditTextLeft() + g0.L(-26.0f), g0.L(2.0f)));
                FrameLayout frameLayout = oVar2.s;
                frameLayout.setTranslationX(g0.W1(oVar2.o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(oVar2.o0, -g0.L(8.0f), 0));
                hVar.getEmojiButton().setAlpha(oVar2.o0);
                oVar2.r.setAlpha((float) Math.pow(oVar2.o0, 16.0d));
                oVar2.u(oVar2.o0);
                hi.j jVar = oVar2.N;
                if (jVar != null) {
                    jVar.setAlpha((float) Math.pow(oVar2.o0, 4.0d));
                }
                hVar.getEditText().invalidate();
                oVar2.invalidate();
                break;
            case 27:
                a0 a0Var = (a0) this.b;
                a0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.a.invalidate();
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
