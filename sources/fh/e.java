package fh;

import android.view.animation.Interpolator;
import i7.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Interpolator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Interpolator d;

    public /* synthetic */ e(boolean z10, float f9, float f10, Interpolator interpolator) {
        this.a = z10;
        this.b = f9;
        this.c = f10;
        this.d = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        boolean z10 = this.a;
        float f10 = this.b;
        float f11 = this.c;
        Interpolator interpolator = this.d;
        return z10 ? 1.0f - interpolator.getInterpolation(1.0f - w.a((f9 - f10) / (f11 - f10), 0.0f, 1.0f)) : interpolator.getInterpolation(w.a((f9 - f10) / (f11 - f10), 0.0f, 1.0f));
    }
}
