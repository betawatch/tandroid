// default package

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fl3 implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final /* synthetic */ hl3 d;

    public fl3(hl3 hl3Var) {
        this.d = hl3Var;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            return;
        }
        final byte b = 1;
        if (!this.d.y) {
            final byte b2 = 0;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            if (this.d.E) {
                return;
            }
            this.d.E = true;
            final int i = this.d.F;
            this.d.post(new Runnable(this) { // from class: el3
                public final /* synthetic */ fl3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b2) {
                        case 0:
                            fl3 fl3Var = this.b;
                            fl3Var.d.d(i);
                            break;
                        default:
                            fl3 fl3Var2 = this.b;
                            int i2 = i;
                            hl3 hl3Var = fl3Var2.d;
                            if (hl3Var.e && !hl3Var.r && i2 == fl3Var2.d.H) {
                                hl3 hl3Var2 = fl3Var2.d;
                                hl3Var2.s = true;
                                Runnable runnable = hl3Var2.w;
                                hl3Var2.w = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            this.d.a.G = this.a == 0 ? 0.016666668f : Math.min(0.1f, (nanoTime - r5) / 1.0E9f);
            this.a = nanoTime;
            hl3 hl3Var = this.d;
            hl3Var.a.c.A = hl3Var.x;
            this.d.a.onDrawFrame(gl10);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            }
            if (this.b) {
                return;
            }
            this.b = true;
            final int i2 = this.c;
            this.d.post(new Runnable(this) { // from class: el3
                public final /* synthetic */ fl3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (b) {
                        case 0:
                            fl3 fl3Var = this.b;
                            fl3Var.d.d(i2);
                            break;
                        default:
                            fl3 fl3Var2 = this.b;
                            int i22 = i2;
                            hl3 hl3Var2 = fl3Var2.d;
                            if (hl3Var2.e && !hl3Var2.r && i22 == fl3Var2.d.H) {
                                hl3 hl3Var22 = fl3Var2.d;
                                hl3Var22.s = true;
                                Runnable runnable = hl3Var22.w;
                                hl3Var22.w = null;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        } catch (RuntimeException e) {
            fa4.g(e, true);
            this.d.r = true;
            this.d.post(new li3(this, (byte) 7));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b = false;
        this.c = this.d.H;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        hl3 hl3Var = this.d;
        int i = hl3Var.H + 1;
        hl3Var.H = i;
        this.c = i;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        uq4 uq4Var = this.d.a;
        uq4Var.c = null;
        try {
            uq4Var.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            fa4.g(e, true);
            this.d.r = true;
            this.d.post(new li3(this, (byte) 7));
        }
    }
}
