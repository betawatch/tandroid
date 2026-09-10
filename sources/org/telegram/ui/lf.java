package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ View c;

    public /* synthetic */ lf(eo eoVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                eoVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                eoVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                eo eoVar2 = this.b;
                eoVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                eoVar2.o9();
                eoVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
