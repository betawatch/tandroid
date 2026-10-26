package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ View c;

    public /* synthetic */ ef(un unVar, org.telegram.ui.Cells.v0 v0Var, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.M9 = AndroidUtilities.dp(30.0f) * floatValue;
                unVar.x9();
                this.c.setAlpha(floatValue);
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.M9 = AndroidUtilities.dp(30.0f) * floatValue2;
                unVar2.x9();
                unVar2.z9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
