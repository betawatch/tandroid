package org.telegram.ui.Components;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements TimeInterpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
            case 0:
                return ((((6.0f * f7) - 15.0f) * f7) + 10.0f) * f7 * f7 * f7;
            default:
                return f7;
        }
    }
}
