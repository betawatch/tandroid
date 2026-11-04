package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ of(Object obj, float f10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.c;
                wmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.W8 = floatValue;
                wmVar.a9 = floatValue / this.b;
                View view = wmVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    View view2 = (View) arrayList.get(i3);
                    if (view2 != null) {
                        view2.setTranslationY(this.b * floatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.an) this.c).F.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((fr0) this.c).S.setTranslationY(org.telegram.messenger.g0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                fx0 fx0Var = (fx0) this.c;
                fx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.b, floatValue3);
                fx0Var.a.setTranslationX(T1);
                fx0Var.b.setTranslationX(T1);
                ImageView imageView = fx0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = fx0Var.f;
                woVar.setTranslationX((org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(32.0f) : -org.telegram.messenger.g0.L(32.0f)) + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                woVar.setScaleX(f10);
                woVar.setScaleY(f10);
                woVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
            case 5:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.c;
                b4Var.getClass();
                b4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                b4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) this.c;
                o8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.c = o8Var.c();
                o8Var.d = this.b * floatValue4;
                o8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
