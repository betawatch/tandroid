package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f10)))) * this.a);
    }
}
