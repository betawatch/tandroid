package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                oaVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = oaVar2.b;
                int d = i0.a.d(oaVar2.B, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
                oaVar2.e.b(d);
                oaVar2.f.setTextColor(d);
                break;
        }
    }
}
