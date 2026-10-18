package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ View c;

    public /* synthetic */ gf(sn snVar, org.telegram.ui.Cells.w0 w0Var, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = w0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                snVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.A9 = AndroidUtilities.dp(30.0f) * floatValue;
                snVar.t9();
                this.c.setAlpha(floatValue);
                break;
            default:
                sn snVar2 = this.b;
                snVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.A9 = AndroidUtilities.dp(30.0f) * floatValue2;
                snVar2.t9();
                snVar2.w9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
