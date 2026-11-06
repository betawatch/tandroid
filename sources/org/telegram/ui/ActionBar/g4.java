package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f10)))) * this.a);
    }
}
