package androidx.car.app;

import android.view.Surface;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;
    private final Surface mSurface;
    private final int mWidth;

    public SurfaceContainer(Surface surface, int i10, int i11, int i12) {
        this.mSurface = surface;
        this.mWidth = i10;
        this.mHeight = i11;
        this.mDpi = i12;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.mSurface);
        sb2.append(", ");
        sb2.append(this.mWidth);
        sb2.append("x");
        sb2.append(this.mHeight);
        sb2.append(", dpi: ");
        return a1.g.n(this.mDpi, "]", sb2);
    }

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }
}
