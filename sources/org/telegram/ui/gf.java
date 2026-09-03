package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ View c;

    public /* synthetic */ gf(zn znVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                znVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.x9 = AndroidUtilities.dp(30.0f) * floatValue;
                znVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                zn znVar2 = this.b;
                znVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.x9 = AndroidUtilities.dp(30.0f) * floatValue2;
                znVar2.o9();
                znVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
