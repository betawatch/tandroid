// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxb b;

    public /* synthetic */ hxb(jxb jxbVar, byte b) {
        this.a = b;
        this.b = jxbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jxb jxbVar = this.b;
        switch (b) {
            case 0:
                jxbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jxbVar.h();
                jxbVar.g();
                break;
            default:
                jxbVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jxbVar.h.invalidate();
                break;
        }
    }
}
