package org.telegram.ui.Cells;

import android.graphics.Path;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s9 extends Path {
    public float a;

    @Override // android.graphics.Path
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        super.addRect(f10, f11, f12, f13, direction);
        if (f13 > this.a) {
            this.a = f13;
        }
    }

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        this.a = 0.0f;
    }
}
