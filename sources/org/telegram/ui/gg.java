package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gg(Object obj, float f10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.c;
                xnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.E8 = floatValue;
                xnVar.I8 = floatValue / this.b;
                View view = xnVar.fragmentView;
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
                ((org.telegram.ui.Components.rn) this.c).B.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((mv0) this.c).O.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                v11 v11Var = (v11) this.c;
                v11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.b, floatValue3);
                v11Var.a.setTranslationX(lerp);
                v11Var.b.setTranslationX(lerp);
                ImageView imageView = v11Var.c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.np npVar = v11Var.f;
                npVar.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                npVar.setScaleX(f10);
                npVar.setScaleY(f10);
                npVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
        }
    }
}
