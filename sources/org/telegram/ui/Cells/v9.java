package org.telegram.ui.Cells;

import android.graphics.Path;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
