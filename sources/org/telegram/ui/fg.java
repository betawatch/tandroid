package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fg(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.c;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.T8 = floatValue;
                snVar.X8 = floatValue / this.b;
                View view = snVar.fragmentView;
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
                ((org.telegram.ui.Components.fo) this.c).E.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ((iv0) this.c).R.setTranslationY(AndroidUtilities.lerp(this.b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                o11 o11Var = (o11) this.c;
                o11Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float lerp = AndroidUtilities.lerp(0.0f, this.b, floatValue3);
                o11Var.a.setTranslationX(lerp);
                o11Var.b.setTranslationX(lerp);
                ImageView imageView = o11Var.c;
                imageView.setTranslationX(lerp);
                org.telegram.ui.Components.xp xpVar = o11Var.f;
                xpVar.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : -AndroidUtilities.dp(32.0f)) + lerp);
                float f7 = (floatValue3 * 0.5f) + 0.5f;
                xpVar.setScaleX(f7);
                xpVar.setScaleY(f7);
                xpVar.setAlpha(floatValue3);
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
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.c;
                j8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.c = j8Var.c();
                j8Var.d = this.b * floatValue4;
                j8Var.s = floatValue4 > 0.0f;
                break;
        }
    }
}
