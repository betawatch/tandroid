// default package

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bo8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ bo8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                profileActivity.y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 1:
                RectF rectF2 = ProfileActivity.e7;
                profileActivity.r3(valueAnimator.getAnimatedFraction());
                break;
            case 2:
                RectF rectF3 = ProfileActivity.e7;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.l4(true);
                break;
            default:
                RectF rectF4 = ProfileActivity.e7;
                profileActivity.l4(true);
                break;
        }
    }
}
