package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
