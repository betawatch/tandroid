// default package

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b49 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b49(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pt2) obj).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 1:
                g49 g49Var = (g49) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g49Var.J = floatValue;
                f49 f49Var = g49Var.b;
                f49Var.setScaleY(floatValue * (g49Var.x ? 0.76f : 1.0f));
                f49Var.setScaleX(g49Var.J * (g49Var.x ? 0.76f : 1.0f));
                break;
            case 2:
                ya9 ya9Var = (ya9) obj;
                ya9Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ya9Var.invalidateSelf();
                break;
            case 3:
                mj9 mj9Var = (mj9) obj;
                mj9Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mj9Var.requestLayout();
                mj9Var.invalidate();
                break;
            case 4:
                ek9 ek9Var = (ek9) obj;
                ek9Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ek9Var.t.run();
                break;
            case 5:
                uk9 uk9Var = (uk9) obj;
                uk9Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uk9Var.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 6:
                li3 li3Var = (li3) obj;
                li3Var.getClass();
                li3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li3Var.g();
                break;
            case 7:
                qo9 qo9Var = (qo9) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qo9Var.F = floatValue2;
                oo9 oo9Var = qo9Var.a;
                oo9Var.setScaleX(1.0f - floatValue2);
                oo9Var.setScaleY(1.0f - qo9Var.F);
                qo9Var.invalidate();
                break;
            case 8:
                ((dr9) obj).k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                mu9 mu9Var = (mu9) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu9Var.r = floatValue3;
                mu9Var.E.setScaleX(hl.R1(0.8f, 1.0f, floatValue3));
                mu9Var.E.setScaleY(hl.R1(0.8f, 1.0f, mu9Var.r));
                mu9Var.E.setAlpha(mu9Var.r);
                mu9Var.s.invalidate();
                mu9Var.w.invalidate();
                break;
            case 10:
                xu9 xu9Var = (xu9) obj;
                xu9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu9Var.j();
                break;
            case 11:
                ((xu9) ((lc8) obj).b).invalidate();
                break;
            case 12:
                ((cv9) obj).setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                ow9 ow9Var = (ow9) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow9Var.G = floatValue4;
                ow9Var.setShown(floatValue4);
                ow9Var.b(false);
                break;
            case 14:
                SecretMediaViewer secretMediaViewer = ((ay9) obj).d;
                secretMediaViewer.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                break;
            case 15:
                SecretMediaViewer secretMediaViewer2 = ((ay9) obj).d;
                secretMediaViewer2.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                break;
            case 16:
                ((SecretMediaViewer) ((lc8) obj).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 17:
                ky9 ky9Var = (ky9) obj;
                ky9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
                    break;
                }
                break;
            case 18:
                ((d0a) obj).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 19:
                e0a e0aVar = (e0a) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0aVar.r = floatValue5;
                View view2 = e0aVar.e;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    break;
                } else {
                    gj3 gj3Var = e0aVar.d;
                    if (gj3Var != null) {
                        gj3Var.invalidate();
                        break;
                    }
                }
                break;
            case 20:
                j1a j1aVar = (j1a) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1aVar.M = floatValue6;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j1aVar.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue6);
                oob oobVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(k43.g.getInterpolation(j1aVar.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = hl.s(j1aVar.M, i, itemsCount, 4.0f);
                    oobVar.getChildAt(i).setTranslationY((1.0f - s) * hl.L(-12.0f));
                    oobVar.getChildAt(i).setAlpha(s);
                }
                break;
            case 21:
                ((b3a) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                r3a r3aVar = (r3a) obj;
                r3aVar.r = ((Float) r3aVar.x.getAnimatedValue()).floatValue();
                r3aVar.invalidate();
                break;
            case 23:
                g4a g4aVar = (g4a) obj;
                g4aVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4aVar.e.setTranslationY(((-g4aVar.d) + g4aVar.getMeasuredHeight()) - g4aVar.w);
                break;
            case 24:
                c8a c8aVar = (c8a) obj;
                c8aVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8aVar.invalidate();
                break;
            case 25:
                ((tba) obj).k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                pda pdaVar = (pda) obj;
                kea keaVar = pdaVar.b;
                keaVar.p2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                keaVar.m1.invalidate();
                pdaVar.invalidate();
                break;
            case 27:
                ((xt3) obj).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                eja ejaVar = (eja) obj;
                ejaVar.T0(ejaVar.getTabProgress());
                break;
            default:
                ((zha) obj).h.invalidate();
                break;
        }
    }
}
