package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                wn wnVar = (wn) this.c;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X8 = floatValue;
                wnVar.b9 = floatValue / this.b;
                View view = wnVar.fragmentView;
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
                ((org.telegram.ui.Components.go) this.c).E.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((ov0) this.c).R.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                u11 u11Var = (u11) this.c;
                u11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.b, floatValue3);
                u11Var.a.setTranslationX(lerp);
                u11Var.b.setTranslationX(lerp);
                ImageView imageView = u11Var.c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.aq aqVar = u11Var.f;
                aqVar.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                aqVar.setScaleX(f7);
                aqVar.setScaleY(f7);
                aqVar.setAlpha(floatValue3);
                float f10 = 1.0f - floatValue3;
                float f11 = (f10 * 0.5f) + 0.5f;
                imageView.setScaleX(f11);
                imageView.setScaleY(f11);
                imageView.setAlpha(f10);
                break;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) this.c;
                m3Var.getClass();
                m3Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.b) % 360.0f;
                m3Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.c;
                i8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.c = i8Var.c();
                i8Var.d = this.b * floatValue4;
                i8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
