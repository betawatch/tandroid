package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eg(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.c;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.V8 = floatValue;
                unVar.Z8 = floatValue / this.b;
                View view = unVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.b * floatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.jn) this.c).E.setTranslationY(org.telegram.messenger.i0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((at0) this.c).R.setTranslationY(org.telegram.messenger.i0.T1(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                cz0 cz0Var = (cz0) this.c;
                cz0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.i0.T1(0.0f, this.b, floatValue3);
                cz0Var.a.setTranslationX(T1);
                cz0Var.b.setTranslationX(T1);
                ImageView imageView = cz0Var.c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.ep epVar = cz0Var.f;
                epVar.setTranslationX((org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(32.0f) : -org.telegram.messenger.i0.L(32.0f)) + T1);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                epVar.setScaleX(f7);
                epVar.setScaleY(f7);
                epVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                break;
            case 5:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                d4Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.c;
                u8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u8Var.c = u8Var.c();
                u8Var.d = this.b * floatValue4;
                u8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
