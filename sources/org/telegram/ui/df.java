package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ View c;

    public /* synthetic */ df(wn wnVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.Q9 = AndroidUtilities.dp(30.0f) * floatValue;
                wnVar.A9();
                this.c.setAlpha(floatValue);
                break;
            default:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.Q9 = AndroidUtilities.dp(30.0f) * floatValue2;
                wnVar2.A9();
                wnVar2.C9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
