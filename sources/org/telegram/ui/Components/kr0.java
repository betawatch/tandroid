package org.telegram.ui.Components;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Interpolator {
    public final /* synthetic */ int a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
        }
        float f10 = f7 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
