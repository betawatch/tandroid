package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.c;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.W8 = floatValue;
                anVar.a9 = floatValue / this.b;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    View view2 = (View) arrayList.get(i7);
                    if (view2 != null) {
                        view2.setTranslationY(this.b * floatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.jn) this.c).F.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((nr0) this.c).S.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                mx0 mx0Var = (mx0) this.c;
                mx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue3);
                mx0Var.a.setTranslationX(T1);
                mx0Var.b.setTranslationX(T1);
                ImageView imageView = mx0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.fp fpVar = mx0Var.f;
                fpVar.setTranslationX((org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(32.0f) : -org.telegram.messenger.g0.L(32.0f)) + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                fpVar.setScaleX(f10);
                fpVar.setScaleY(f10);
                fpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
            case 5:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.c;
                c4Var.getClass();
                c4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                c4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) this.c;
                q8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.c = q8Var.c();
                q8Var.d = this.b * floatValue4;
                q8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
