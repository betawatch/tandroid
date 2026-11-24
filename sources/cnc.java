// default package

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cnc {
    public final Context a;
    public final Handler b;
    public final int c;
    public final byte d;
    public final ArrayList e = new ArrayList();
    public volatile enc[] f = new enc[0];
    public final AtomicBoolean g = new AtomicBoolean();
    public final int[] h = new int[2];
    public EGLDisplay i = EGL14.EGL_NO_DISPLAY;
    public EGLContext j = EGL14.EGL_NO_CONTEXT;
    public EGLSurface k = EGL14.EGL_NO_SURFACE;
    public EGLConfig l;
    public cl3 m;
    public cl3 n;
    public cl3 o;
    public long p;
    public long q;
    public int r;

    /* JADX WARN: Multi-variable type inference failed */
    public cnc(Context context, int i) {
        this.a = context;
        this.d = i;
        this.c = Math.max(1, Math.min(kk7.V2, Math.round(context.getResources().getDisplayMetrics().density * 42.0f)));
        HandlerThread handlerThread = new HandlerThread("WalletDiamondTextures");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.i = eglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            sc8.j("Wallet EGL initialize failed");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.i, new int[]{12352, 64, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            sc8.j("Wallet EGL config failed");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.l = eGLConfig;
        this.j = EGL14.eglCreateContext(this.i, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.i, this.l, new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.k = eglCreatePbufferSurface;
        if (!EGL14.eglMakeCurrent(this.i, eglCreatePbufferSurface, eglCreatePbufferSurface, this.j)) {
            sc8.j("Wallet EGL context failed");
            return;
        }
        Context context = this.a;
        cl3 cl3Var = new cl3(context, 2);
        byte b = this.d;
        cl3Var.C = b;
        this.m = cl3Var;
        cl3 cl3Var2 = new cl3(context, 2);
        cl3Var2.C = b;
        this.n = cl3Var2;
        this.q = 0L;
        this.p = 0L;
        this.r = 0;
    }

    public final void b() {
        cl3 cl3Var = this.m;
        if (cl3Var != null) {
            cl3Var.b();
        }
        cl3 cl3Var2 = this.n;
        if (cl3Var2 != null) {
            cl3Var2.b();
        }
        cl3 cl3Var3 = this.o;
        if (cl3Var3 != null) {
            cl3Var3.b();
        }
        this.o = null;
        this.n = null;
        this.m = null;
        EGLDisplay eGLDisplay = this.i;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(this.i, this.k);
        EGL14.eglDestroyContext(this.i, this.j);
        EGL14.eglTerminate(this.i);
        EGL14.eglReleaseThread();
        this.i = EGL14.EGL_NO_DISPLAY;
        this.j = EGL14.EGL_NO_CONTEXT;
        this.k = EGL14.EGL_NO_SURFACE;
    }

    public final void c() {
        if (this.g.compareAndSet(false, true)) {
            this.b.post(new kbc(this, (byte) 22));
        }
    }
}
