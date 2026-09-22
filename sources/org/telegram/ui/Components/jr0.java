package org.telegram.ui.Components;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements Interpolator {
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
