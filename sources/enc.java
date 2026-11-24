// default package

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class enc {
    public final fnc a;
    public final Surface b;
    public volatile boolean d;
    public volatile dnc e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public enc(fnc fncVar, Surface surface, int i) {
        this.a = fncVar;
        this.b = surface;
        this.g = i;
        this.f = i;
    }
}
