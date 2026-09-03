package jh;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
