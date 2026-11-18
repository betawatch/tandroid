package org.telegram.ui.ActionBar;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i4 implements Interpolator {
    public final float a = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f10)))) * this.a);
    }
}
