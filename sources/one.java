// default package

import android.opengl.EGL14;
import android.opengl.EGLDisplay;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class one {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        no5 no5Var = po5.b;
        throw new gy4(str, j99.e);
    }

    public static boolean b(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new gy4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), po5.u(Integer.valueOf(eglGetError)));
    }
}
