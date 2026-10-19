package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f7)))) * this.a);
    }
}
