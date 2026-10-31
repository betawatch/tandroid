package org.telegram.ui.Cells;

import android.view.animation.Interpolator;
import org.telegram.messenger.z20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p2 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ p2(int i10) {
        this.a = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        switch (this.a) {
            case 0:
                if (f7 < 0.33f) {
                    return (f7 / 0.33f) * 0.1f;
                }
                float f10 = f7 - 0.33f;
                return f10 < 0.33f ? z20.v(f10, 0.34f, 0.15f, 0.1f) : (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return (float) Math.pow(f7, 2.0d);
            case 2:
                return f7 * f7 * f7 * f7 * f7;
            case 3:
            case 4:
            default:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
