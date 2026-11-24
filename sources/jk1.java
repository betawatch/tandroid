// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jk1 {
    public final byte a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final /* synthetic */ lk1 g;

    /* JADX WARN: Multi-variable type inference failed */
    public jk1(lk1 lk1Var, int i) {
        this.g = lk1Var;
        this.a = i;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(nf0.D1);
        this.e.addUpdateListener(new f0(this, (byte) 26));
        this.e.start();
    }
}
