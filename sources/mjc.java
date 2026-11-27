// default package

import android.opengl.EGLContext;
import org.webrtc.EglBase14;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
