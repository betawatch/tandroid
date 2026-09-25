package ig;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h {
    public final int a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final /* synthetic */ j g;

    public h(j jVar, int i10) {
        this.g = jVar;
        this.a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new ai.a(this, 27));
        this.e.start();
    }
}
