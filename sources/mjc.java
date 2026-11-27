// default package

import android.opengl.EGLContext;
import org.webrtc.EglBase14;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
