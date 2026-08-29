package org.telegram.ui.Cells;

import android.graphics.Path;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p9 extends Path {
    public float a;

    @Override // android.graphics.Path
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        super.addRect(f9, f10, f11, f12, direction);
        if (f12 > this.a) {
            this.a = f12;
        }
    }

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        this.a = 0.0f;
    }
}
