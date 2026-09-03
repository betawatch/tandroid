package ih;

import android.view.animation.Interpolator;
import k7.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ e(boolean z4, float f10, float f11, Interpolator interpolator) {
        this.a = z4;
        this.b = f10;
        this.c = f11;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        boolean z4 = this.a;
        float f11 = this.b;
        float f12 = this.c;
        Interpolator interpolator = this.d;
        return z4 ? 1.0f - interpolator.getInterpolation(1.0f - o.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f)) : interpolator.getInterpolation(o.a((f10 - f11) / (f12 - f11), 0.0f, 1.0f));
    }
}
