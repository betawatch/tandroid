// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oqa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rqa b;

    public /* synthetic */ oqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                rqaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rqaVar.d(rqaVar.b0);
                break;
            case 1:
                float w = b00.w((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d), 0.075f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                rqaVar.A0 = w;
                FrameLayout frameLayout = rqaVar.b;
                frameLayout.setScaleX(w);
                frameLayout.setScaleY(rqaVar.A0);
                rqaVar.invalidate();
                break;
            default:
                rqaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rqaVar.d(rqaVar.b0);
                break;
        }
    }
}
