package androidx.car.app;

import android.view.Surface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        return a4.a.n(this.mDpi, "]", sb2);
    }

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }
}
