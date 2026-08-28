package dh;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements TimeInterpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
                return f10;
            default:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
        }
    }
}
