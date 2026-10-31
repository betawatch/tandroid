package nh;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements TimeInterpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
            case 0:
                return f7;
            default:
                return ((((6.0f * f7) - 15.0f) * f7) + 10.0f) * f7 * f7 * f7;
        }
    }
}
