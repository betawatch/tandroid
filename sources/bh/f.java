package bh;

import ai.e1;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a0;
import bi.j0;
import ci.a5;
import ci.b5;
import ci.h5;
import ci.kb;
import ci.l6;
import ci.lb;
import ci.q6;
import ci.qc;
import dh.q;
import dh.r;
import ei.c7;
import ei.d7;
import ei.f4;
import ei.g8;
import ei.k2;
import ei.n1;
import ei.p0;
import ei.s5;
import ei.v1;
import ei.w0;
import gi.h3;
import gi.n2;
import gi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a5 a5Var;
        boolean z10;
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                mVar.getClass();
                mVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                a0 a0Var = (a0) this.b;
                a0Var.getClass();
                a0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.invalidate();
                break;
            case 2:
                ((j0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                l6 l6Var = (l6) this.b;
                l6Var.U2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.P1();
                break;
            case 4:
                ((h5) this.b).h.invalidate();
                break;
            case 5:
                b5 b5Var = (b5) this.b;
                b5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.F = floatValue;
                if (floatValue >= 0.8f && (a5Var = b5Var.I) != null && (z10 = a5Var.l) && z10) {
                    a5Var.l = false;
                    a5Var.b();
                }
                b5Var.invalidate();
                break;
            case 6:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 7:
                q6 q6Var = (q6) this.b;
                q6Var.getClass();
                q6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.invalidate();
                break;
            case 8:
                lb lbVar = (lb) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kb kbVar = lbVar.c;
                kbVar.setScaleX(floatValue2);
                kbVar.setScaleY(floatValue2);
                break;
            case 9:
                qc qcVar = (qc) this.b;
                qcVar.getClass();
                qcVar.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.invalidate();
                break;
            case 10:
                r rVar = (r) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q qVar = rVar.b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    break;
                }
                break;
            case 11:
                ei.a aVar = (ei.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 12:
                ei.q qVar2 = (ei.q) this.b;
                qVar2.P.e = g0.T1(0.0f, 1.0f - qVar2.c0.e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar2.invalidate();
                break;
            case 13:
                ((w0) this.b).invalidate();
                break;
            case 14:
                k2 k2Var = (k2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.c.setAlpha(floatValue4);
                k2Var.a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                k2Var.invalidate();
                break;
            case 15:
                p0 p0Var = (p0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = p0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(p0Var.f, 1.0f, floatValue5) * 255.0f));
                    p0Var.h.invalidate();
                    break;
                }
                break;
            case 16:
                e1 e1Var = (e1) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var2 = (p0) e1Var.b;
                Drawable drawable2 = p0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, p0Var2.f, floatValue6) * 255.0f));
                    p0Var2.h.invalidate();
                    break;
                }
                break;
            case 17:
                n1 n1Var = (n1) this.b;
                n1Var.getClass();
                n1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                v1 v1Var = (v1) this.b;
                v1Var.getClass();
                v1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                break;
            case 19:
                f4 f4Var = (f4) this.b;
                f4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = f4Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                break;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                nv0 nv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                nv0Var.S = floatValue8;
                nv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 21:
                ei.a5 a5Var2 = (ei.a5) this.b;
                a5Var2.r = ((Float) a5Var2.x.getAnimatedValue()).floatValue();
                a5Var2.invalidate();
                break;
            case 22:
                s5 s5Var = (s5) this.b;
                s5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.e.setTranslationY(((-s5Var.d) + s5Var.getMeasuredHeight()) - s5Var.w);
                break;
            case 23:
                d7 d7Var = (d7) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = d7Var.a;
                c7 c7Var = (c7) arrayList.get(d7Var.d);
                c7Var.n = floatValue9;
                c7Var.invalidate();
                int i3 = d7Var.c;
                if (i3 != -1) {
                    c7 c7Var2 = (c7) arrayList.get(i3);
                    c7Var2.n = 1.0f - floatValue9;
                    c7Var2.invalidate();
                    break;
                }
                break;
            case 24:
                g8 g8Var = (g8) this.b;
                g8Var.getClass();
                g8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.K.requestLayout();
                break;
            case 25:
                fi.q qVar3 = (fi.q) this.b;
                qVar3.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar3.r.setTranslationY(g0.W1(qVar3.x, -g0.L(42.0f), 0));
                qVar3.n.setTranslationY(g0.W1(qVar3.x, 0, g0.L(42.0f)));
                break;
            case 26:
                gi.m mVar2 = (gi.m) this.b;
                mVar2.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi.g gVar = mVar2.f;
                gVar.getEditText().setTranslationX(g0.W1(mVar2.o0, mVar2.getEditTextLeft() + g0.L(-26.0f), g0.L(2.0f)));
                FrameLayout frameLayout = mVar2.s;
                frameLayout.setTranslationX(g0.W1(mVar2.o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar2.o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar2.o0);
                mVar2.r.setAlpha((float) Math.pow(mVar2.o0, 16.0d));
                mVar2.u(mVar2.o0);
                gi.i iVar = mVar2.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar2.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar2.invalidate();
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
                ((h3) this.b).j1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
