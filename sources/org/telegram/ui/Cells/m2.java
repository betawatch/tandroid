package org.telegram.ui.Cells;

import android.view.animation.Interpolator;
import org.telegram.messenger.ok;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class m2 implements Interpolator {
    public final /* synthetic */ int a;

    public /* synthetic */ m2(int i10) {
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
                return f10 < 0.33f ? ok.b(f10, 0.34f, 0.15f, 0.1f) : (((f10 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
            case 1:
                return f7 * f7 * f7 * f7 * f7;
            case 2:
            case 3:
            default:
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case 4:
                return (float) Math.pow(f7, 2.0d);
        }
    }
}
