package org.telegram.ui.Cells;

import android.graphics.Path;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v9 extends Path {
    public float a;

    @Override // android.graphics.Path
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        super.addRect(f7, f10, f11, f12, direction);
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
