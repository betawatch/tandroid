package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka b;

    public /* synthetic */ ja(ka kaVar, int i10) {
        this.a = i10;
        this.b = kaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ka kaVar = this.b;
                kaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kaVar.n = floatValue;
                kaVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                kaVar.d.setAlpha(kaVar.n);
                break;
            default:
                ka kaVar2 = this.b;
                kaVar2.getClass();
                kaVar2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.g6.z6;
                org.telegram.ui.ActionBar.c6 c6Var = kaVar2.b;
                int d = i0.b.d(kaVar2.A, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
                kaVar2.e.b(d);
                kaVar2.f.setTextColor(d);
                break;
        }
    }
}
