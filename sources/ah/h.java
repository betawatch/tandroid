package ah;

import ai.i0;
import ai.s0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d6;
import bi.k7;
import bi.p7;
import bi.rc;
import bi.sc;
import bi.t5;
import bi.v5;
import bi.w5;
import bi.zd;
import di.a5;
import di.b7;
import di.c7;
import di.e4;
import di.g2;
import di.g8;
import di.n0;
import di.q1;
import di.s5;
import di.u0;
import fi.j3;
import fi.m3;
import fi.p2;
import fi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        v5 v5Var;
        boolean z9;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                i0 i0Var = (i0) this.b;
                i0Var.getClass();
                i0Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.invalidate();
                break;
            case 2:
                ((s0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                k7 k7Var = (k7) this.b;
                k7Var.T2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k7Var.P1();
                break;
            case 4:
                ((d6) this.b).h.invalidate();
                break;
            case 5:
                w5 w5Var = (w5) this.b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.E = floatValue;
                if (floatValue >= 0.8f && (v5Var = w5Var.H) != null && (z9 = v5Var.l) && z9) {
                    v5Var.l = false;
                    v5Var.b();
                }
                w5Var.invalidate();
                break;
            case 6:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 7:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                break;
            case 8:
                sc scVar = (sc) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rc rcVar = scVar.c;
                rcVar.setScaleX(floatValue2);
                rcVar.setScaleY(floatValue2);
                break;
            case 9:
                zd zdVar = (zd) this.b;
                zdVar.getClass();
                zdVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.invalidate();
                break;
            case 10:
                ch.r rVar = (ch.r) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.q qVar = rVar.b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    break;
                }
                break;
            case 11:
                di.a aVar = (di.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 12:
                di.p pVar = (di.p) this.b;
                pVar.O.e = g0.T1(0.0f, 1.0f - pVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                break;
            case 13:
                ((u0) this.b).invalidate();
                break;
            case 14:
                g2 g2Var = (g2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.c.setAlpha(floatValue4);
                g2Var.a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                g2Var.invalidate();
                break;
            case 15:
                n0 n0Var = (n0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(n0Var.f, 1.0f, floatValue5) * 255.0f));
                    n0Var.h.invalidate();
                    break;
                }
                break;
            case 16:
                t5 t5Var = (t5) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = (n0) t5Var.b;
                Drawable drawable2 = n0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, n0Var2.f, floatValue6) * 255.0f));
                    n0Var2.h.invalidate();
                    break;
                }
                break;
            case 17:
                q1 q1Var = (q1) this.b;
                q1Var.getClass();
                q1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                break;
            case 18:
                e4 e4Var = (e4) this.b;
                e4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = e4Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                break;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                wv0 wv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                wv0Var.R = floatValue8;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 20:
                a5 a5Var = (a5) this.b;
                a5Var.r = ((Float) a5Var.x.getAnimatedValue()).floatValue();
                a5Var.invalidate();
                break;
            case 21:
                s5 s5Var = (s5) this.b;
                s5Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.e.setTranslationY(((-s5Var.d) + s5Var.getMeasuredHeight()) - s5Var.w);
                break;
            case 22:
                c7 c7Var = (c7) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = c7Var.a;
                b7 b7Var = (b7) arrayList.get(c7Var.d);
                b7Var.n = floatValue9;
                b7Var.invalidate();
                int i7 = c7Var.c;
                if (i7 != -1) {
                    b7 b7Var2 = (b7) arrayList.get(i7);
                    b7Var2.n = 1.0f - floatValue9;
                    b7Var2.invalidate();
                    break;
                }
                break;
            case 23:
                g8 g8Var = (g8) this.b;
                g8Var.getClass();
                g8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.J.requestLayout();
                break;
            case 24:
                ei.r rVar2 = (ei.r) this.b;
                rVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.r.setTranslationY(g0.W1(rVar2.x, -g0.L(42.0f), 0));
                rVar2.n.setTranslationY(g0.W1(rVar2.x, 0, g0.L(42.0f)));
                break;
            case 25:
                fi.m mVar = (fi.m) this.b;
                mVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(g0.W1(mVar.n0, mVar.getEditTextLeft() + g0.L(-26.0f), g0.L(2.0f)));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(g0.W1(mVar.n0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.n0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.n0);
                mVar.r.setAlpha((float) Math.pow(mVar.n0, 16.0d));
                mVar.u(mVar.n0);
                fi.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.n0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 26:
                y yVar = (y) this.b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.a.invalidate();
                break;
            case 27:
                p2 p2Var = (p2) this.b;
                p2Var.getClass();
                p2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.i();
                break;
            case 28:
                ((j3) this.b).i1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                m3Var.z0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m3Var.invalidate();
                break;
        }
    }
}
