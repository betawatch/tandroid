package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ View c;

    public /* synthetic */ hf(wn wnVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                wnVar.o9();
                this.c.setAlpha(floatValue);
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                wnVar2.o9();
                wnVar2.r9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
