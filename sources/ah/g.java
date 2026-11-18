package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.g8;
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
import fi.i5;
import fi.m0;
import fi.m1;
import fi.q4;
import fi.s6;
import fi.t0;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.i3;
import hi.o2;
import hi.z;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                g8 g8Var = (g8) this.b;
                g8Var.getClass();
                g8Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g8Var.k0();
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
                ai.j0 j0Var = (ai.j0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var2 = (m0) j0Var.b;
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
                q4 q4Var = (q4) this.b;
                q4Var.r = ((Float) q4Var.x.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                break;
            case 22:
                i5 i5Var = (i5) this.b;
                i5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.e.setTranslationY(((-i5Var.d) + i5Var.getMeasuredHeight()) - i5Var.w);
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
                hi.n nVar = (hi.n) this.b;
                nVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi.g gVar = nVar.f;
                gVar.getEditText().setTranslationX(g0.W1(nVar.o0, nVar.getEditTextLeft() + g0.L(-26.0f), g0.L(2.0f)));
                FrameLayout frameLayout = nVar.s;
                frameLayout.setTranslationX(g0.W1(nVar.o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(nVar.o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(nVar.o0);
                nVar.r.setAlpha((float) Math.pow(nVar.o0, 16.0d));
                nVar.u(nVar.o0);
                hi.i iVar = nVar.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(nVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                nVar.invalidate();
                break;
            case 27:
                z zVar = (z) this.b;
                zVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.a.invalidate();
                break;
            case 28:
                o2 o2Var = (o2) this.b;
                o2Var.getClass();
                o2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.i();
                break;
            default:
                ((i3) this.b).m1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
