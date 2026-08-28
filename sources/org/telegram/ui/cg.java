package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cg(Object obj, float f10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.c;
                qnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.D8 = floatValue;
                qnVar.H8 = floatValue / this.b;
                View view = qnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    View view2 = (View) arrayList.get(i9);
                    if (view2 != null) {
                        view2.setTranslationY(this.b * floatValue2);
                    }
                }
                break;
            case 2:
                ((org.telegram.ui.Components.jn) this.c).A.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((xu0) this.c).N.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                c11 c11Var = (c11) this.c;
                c11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.b, floatValue3);
                c11Var.a.setTranslationX(lerp);
                c11Var.b.setTranslationX(lerp);
                ImageView imageView = c11Var.c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.dp dpVar = c11Var.f;
                dpVar.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + lerp);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                dpVar.setScaleX(f10);
                dpVar.setScaleY(f10);
                dpVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                break;
        }
    }
}
