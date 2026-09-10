package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import bi.da;
import bi.kb;
import bi.m3;
import bi.ob;
import bi.p5;
import bi.q8;
import bi.r8;
import bi.t4;
import bi.u7;
import bi.v7;
import bi.x4;
import gg.h1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.voip.a1;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.eo;
import org.telegram.ui.l0;
import org.telegram.ui.si1;
import org.telegram.ui.web.v1;
import org.telegram.ui.yt0;
import org.telegram.ui.zd;
import pg.n2;
import pg.r1;
import pg.t2;
import pg.w0;
import pg.y1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                g0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, g0Var.w));
                g0Var.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), g0Var.w));
                break;
            case 1:
                bi.o oVar = (bi.o) this.b;
                oVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.i iVar = oVar.f;
                iVar.getEditText().setTranslationX(AndroidUtilities.lerp(oVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), oVar.o0));
                FrameLayout frameLayout = oVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), oVar.o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, oVar.o0));
                iVar.getEmojiButton().setAlpha(oVar.o0);
                oVar.r.setAlpha((float) Math.pow(oVar.o0, 16.0d));
                oVar.u(oVar.o0);
                bi.k kVar = oVar.M;
                if (kVar != null) {
                    kVar.setAlpha((float) Math.pow(oVar.o0, 4.0d));
                }
                iVar.getEditText().invalidate();
                oVar.invalidate();
                break;
            case 2:
                bi.c0 c0Var = (bi.c0) this.b;
                c0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.a.invalidate();
                break;
            case 3:
                m3 m3Var = (m3) this.b;
                m3Var.getClass();
                m3Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.i();
                break;
            case 4:
                ((t4) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                x4 x4Var = (x4) this.b;
                x4Var.getClass();
                x4Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x4Var.invalidate();
                break;
            case 6:
                ((p5) this.b).invalidate();
                break;
            case 7:
                v7 v7Var = (v7) this.b;
                v7Var.getClass();
                v7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v7Var.e();
                break;
            case 8:
                u7 u7Var = (u7) this.b;
                u7Var.getClass();
                u7Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                break;
            case 9:
                r8 r8Var = (r8) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.E = floatValue;
                q8 q8Var = r8Var.a;
                q8Var.setScaleX(1.0f - floatValue);
                q8Var.setScaleY(1.0f - r8Var.E);
                r8Var.invalidate();
                break;
            case 10:
                da daVar = (da) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.r = floatValue2;
                Utilities.Callback callback = daVar.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                daVar.a.invalidate();
                break;
            case 11:
                ((kb) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                ob obVar = (ob) this.b;
                obVar.getClass();
                obVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                hg.h hVar = (hg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 14:
                hi.x4 x4Var2 = (hi.x4) this.b;
                x4Var2.getClass();
                x4Var2.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var2.requestLayout();
                x4Var2.invalidate();
                break;
            case 15:
                ii.n nVar = (ii.n) this.b;
                eo eoVar = nVar.F;
                if (eoVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    eoVar.r9();
                    if (eoVar.J8 != null) {
                        eoVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
            case 16:
                r0 r0Var = (r0) this.b;
                r0Var.getClass();
                r0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 17:
                si1 si1Var = (si1) this.b;
                si1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                a1 a1Var = si1Var.c;
                a1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * si1Var.E));
                a1Var.requestLayout();
                break;
            case 18:
                i1 i1Var = (i1) this.b;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                t1 t1Var = (t1) this.b;
                t1Var.getClass();
                t1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                break;
            case 20:
                l2 l2Var = (l2) this.b;
                l2Var.getClass();
                l2Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.b.invalidate();
                break;
            case 21:
                h1 h1Var = (h1) this.b;
                ((gg.i1) h1Var.b).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h1Var.invalidate();
                break;
            case 22:
                v1 v1Var = (v1) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.U = floatValue3;
                v1Var.V.setAlpha(floatValue3);
                v1Var.invalidate();
                break;
            case 23:
                l0 l0Var = (l0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.a0 = floatValue4;
                l0Var.j(floatValue4);
                l0Var.b0.setAlpha(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 24:
                ((yt0) ((w0) this.b)).K.e0.invalidate();
                break;
            case 25:
                r1 r1Var = (r1) this.b;
                r1Var.getClass();
                r1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                break;
            case 26:
                y1 y1Var = (y1) this.b;
                y1Var.getClass();
                y1Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 27:
                og.n nVar2 = (og.n) this.b;
                nVar2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.invalidate();
                break;
            case 28:
                n2 n2Var = (n2) this.b;
                n2Var.getClass();
                n2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                t2 t2Var = (t2) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.y = floatValue5;
                zd zdVar = t2Var.c;
                zdVar.setAlpha(floatValue5);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                break;
        }
    }
}
