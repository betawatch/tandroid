package lg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v {
    public final w a;
    public final Surface b;
    public volatile boolean d;
    public volatile u e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public v(w wVar, Surface surface, int i10) {
        this.a = wVar;
        this.b = surface;
        this.g = i10;
        this.f = i10;
    }
}
