package lg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final /* synthetic */ g d;

    public e(g gVar) {
        this.d = gVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            return;
        }
        if (!this.d.y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(TLObject.FLAG_14);
            if (this.d.D) {
                return;
            }
            this.d.D = true;
            final int i10 = this.d.E;
            final int i11 = 0;
            this.d.post(new Runnable(this) { // from class: lg.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            e eVar = this.b;
                            g.a(eVar.d, i10);
                            break;
                        default:
                            e eVar2 = this.b;
                            int i12 = i10;
                            g gVar = eVar2.d;
                            if (gVar.e && !gVar.r && i12 == eVar2.d.G) {
                                g gVar2 = eVar2.d;
                                gVar2.s = true;
                                Runnable runnable = gVar2.w;
                                gVar2.w = null;
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
            g gVar = this.d;
            gVar.a.c.A = gVar.x;
            this.d.a.onDrawFrame(gl10);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            }
            if (this.b) {
                return;
            }
            this.b = true;
            final int i12 = this.c;
            final int i13 = 1;
            this.d.post(new Runnable(this) { // from class: lg.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            e eVar = this.b;
                            g.a(eVar.d, i12);
                            break;
                        default:
                            e eVar2 = this.b;
                            int i122 = i12;
                            g gVar2 = eVar2.d;
                            if (gVar2.e && !gVar2.r && i122 == eVar2.d.G) {
                                g gVar22 = eVar2.d;
                                gVar22.s = true;
                                Runnable runnable = gVar22.w;
                                gVar22.w = null;
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
            f8.g(e, true);
            this.d.r = true;
            this.d.post(new gg.c(this, 29));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.b = false;
        this.c = this.d.G;
        if (this.d.r) {
            return;
        }
        this.d.a.onSurfaceChanged(gl10, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        g gVar = this.d;
        int i10 = gVar.G + 1;
        gVar.G = i10;
        this.c = i10;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        h hVar = this.d.a;
        hVar.c = null;
        try {
            hVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            f8.g(e, true);
            this.d.r = true;
            this.d.post(new gg.c(this, 29));
        }
    }
}
