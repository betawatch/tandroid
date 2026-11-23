package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.yf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ da(Object obj, float f10, float f11, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                nb nbVar = (nb) obj;
                nbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nbVar.r.setTranslationY(f11 * floatValue);
                nbVar.r.b(f10 * floatValue);
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((yf) obj).d;
                chatActivityEnterView.H = f11 * floatValue2;
                chatActivityEnterView.s2();
                chatActivityEnterView.R0.setTranslationX(f10 * floatValue2);
                break;
            case 2:
                lv lvVar = (lv) obj;
                lvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.M = floatValue3;
                lvVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue3);
                lvVar.b.invalidate();
                break;
            case 3:
                zb1 zb1Var = (zb1) obj;
                zb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = zb1Var.E;
                zb1Var.H = L - (L * f12);
                zb1Var.I = L2 - (f12 * L2);
                zb1Var.invalidate();
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.a6;
                float f14 = ((photoViewer.e6 - f13) * photoViewer.l6) + f13;
                cropAreaView.o0 = floatValue4;
                cropAreaView.p0 = f14;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) obj;
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.A = (f11 * floatValue5) + n4Var.g();
                n4Var.B = (f10 * floatValue5) + (n4Var.k.F * 0.14f);
                n4Var.D = floatValue5 > 0.0f;
                n4Var.a.invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.t6 t6Var = (org.telegram.ui.Wallet.t6) obj;
                t6Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.O = f11 * floatValue6;
                t6Var.P = f10 * floatValue6;
                break;
            case 7:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.a;
                fVar.d = f11 * floatValue7;
                fVar.i = f10 * floatValue7;
                break;
        }
    }
}
