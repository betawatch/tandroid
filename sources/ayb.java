// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyb b;

    public /* synthetic */ ayb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                oybVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oybVar.a0 = floatValue;
                smb smbVar = oybVar.S;
                smbVar.setVisibility(floatValue > 0.0f ? 0 : 8);
                smbVar.setAlpha(floatValue);
                smbVar.setTranslationY((1.0f - floatValue) * (-gm.L(8.0f)));
                oybVar.b(floatValue);
                int L = gm.L(100.0f) + gm.m + ((int) (gm.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) oybVar.r.getLayoutParams()).topMargin = L;
                View view = oybVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                oybVar.h.requestLayout();
                break;
            default:
                oybVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
