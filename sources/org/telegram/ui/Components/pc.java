package org.telegram.ui.Components;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements TimeInterpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.a) {
            case 0:
                return ((((6.0f * f10) - 15.0f) * f10) + 10.0f) * f10 * f10 * f10;
            default:
                return f10;
        }
    }
}
