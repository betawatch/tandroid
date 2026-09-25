package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f7)))) * this.a);
    }
}
