package g7;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j8 {
    public static void a() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.d("Paint", GLUtils.getEGLErrorString(glGetError));
        }
    }
}
