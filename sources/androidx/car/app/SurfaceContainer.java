package androidx.car.app;

import android.view.Surface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.mSurface);
        sb.append(", ");
        sb.append(this.mWidth);
        sb.append("x");
        sb.append(this.mHeight);
        sb.append(", dpi: ");
        return android.support.v4.media.a.m(this.mDpi, "]", sb);
    }

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }
}
