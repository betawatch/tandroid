package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ na(oa oaVar, int i10) {
        this.a = i10;
        this.b = oaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                oa oaVar = this.b;
                oaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oaVar.n = floatValue;
                oaVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                oaVar.d.setAlpha(oaVar.n);
                break;
            default:
                oa oaVar2 = this.b;
                oaVar2.getClass();
                oaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = oaVar2.b;
                int d = i0.a.d(oaVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
                oaVar2.e.b(d);
                oaVar2.f.setTextColor(d);
                break;
        }
    }
}
