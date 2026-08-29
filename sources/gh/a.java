package gh;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements TimeInterpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.a) {
            case 0:
                return f9;
            default:
                return ((((6.0f * f9) - 15.0f) * f9) + 10.0f) * f9 * f9 * f9;
        }
    }
}
