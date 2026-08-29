package org.telegram.ui.Components;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr0 implements Interpolator {
    public final /* synthetic */ int a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.a) {
        }
        float f10 = f9 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
