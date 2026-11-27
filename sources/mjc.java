// default package

import android.opengl.EGLContext;
import org.webrtc.EglBase14;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class mjc implements EglBase14.Context {
    public final EGLContext a;

    public mjc(EGLContext eGLContext) {
        this.a = eGLContext;
    }

    @Override // org.webrtc.EglBase.Context
    public final long getNativeEglContext() {
        return this.a.getNativeHandle();
    }

    @Override // org.webrtc.EglBase14.Context
    public final EGLContext getRawContext() {
        return this.a;
    }
}
