package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ View c;

    public /* synthetic */ jf(zn znVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                zn znVar2 = this.b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.o9();
                znVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
