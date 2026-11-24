// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dic b;

    public /* synthetic */ cic(dic dicVar, byte b) {
        this.a = b;
        this.b = dicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dic dicVar = this.b;
        switch (b) {
            case 0:
                dicVar.getClass();
                dicVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.a(dicVar.S, dicVar.T);
                break;
            default:
                dicVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.invalidate();
                break;
        }
    }
}
