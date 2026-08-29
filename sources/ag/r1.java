package ag;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r1 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public p1 s;
    public final ga v;
    public final q1 w;
    public final p1 x;
    public final /* synthetic */ t1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var, SurfaceTexture surfaceTexture, ga gaVar) {
        super("CanvasInternal");
        this.y = t1Var;
        int i10 = 0;
        this.w = new q1(this, i10);
        this.x = new p1(this, i10);
        this.v = gaVar;
        this.a = surfaceTexture;
    }

    public static void b(r1 r1Var) {
        if (r1Var.f) {
            if (r1Var.d.equals(r1Var.b.eglGetCurrentContext()) && r1Var.e.equals(r1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = r1Var.b;
            EGLDisplay eGLDisplay = r1Var.c;
            EGLSurface eGLSurface = r1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r1Var.d);
        }
    }

    public final void finish() {
        ga gaVar = this.v;
        if (this.e != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            if (gaVar != null) {
                synchronized (gaVar.f) {
                    try {
                        if (gaVar.g == eGLContext) {
                            gaVar.g = null;
                        }
                    } finally {
                    }
                }
            }
            this.b.eglDestroyContext(this.c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
        if (gaVar != null) {
            p1 p1Var = this.x;
            ArrayList arrayList = gaVar.e;
            arrayList.remove(p1Var);
            if (arrayList.isEmpty() && gaVar.d.isEmpty()) {
                gaVar.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        t1 t1Var = this.y;
        Bitmap bitmap = t1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        ga gaVar = this.v;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i10 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                x3.u(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (iArr[0] > 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        int[] iArr2 = {12440, 2, 12344};
                        if (gaVar != null) {
                            synchronized (gaVar.f) {
                                try {
                                    eGLContext = gaVar.g;
                                    if (eGLContext == null) {
                                        eGLContext = EGL10.EGL_NO_CONTEXT;
                                    }
                                } finally {
                                }
                            }
                        } else {
                            eGLContext = EGL10.EGL_NO_CONTEXT;
                        }
                        EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                        this.d = eglCreateContext;
                        if (eglCreateContext == null) {
                            if (BuildVars.LOGS_ENABLED) {
                                x3.u(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (gaVar != null) {
                                gaVar.a(eglCreateContext);
                                gaVar.e.add(this.x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        x3.u(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    f1 f1Var = t1Var.c;
                                    f1Var.getClass();
                                    Map map = v1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : v1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        u1 u1Var = new u1();
                                        u1Var.b = new HashMap();
                                        u1Var.a = GLES20.glCreateProgram();
                                        a5.e b10 = u1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            u1.c(i11, i10, u1Var.a);
                                        } else {
                                            a5.e b11 = u1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                u1.c(i11, i12, u1Var.a);
                                            } else {
                                                GLES20.glAttachShader(u1Var.a, i11);
                                                GLES20.glAttachShader(u1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(u1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = u1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    u1.c(i11, i12, u1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        u1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(u1Var.a, str3)));
                                                    }
                                                    if (i11 != 0) {
                                                        GLES20.glDeleteShader(i11);
                                                    }
                                                    if (i12 != 0) {
                                                        GLES20.glDeleteShader(i12);
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.put((String) entry.getKey(), u1Var);
                                        i10 = 0;
                                    }
                                    f1Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    bv0 bv0Var = f1Var.g;
                                    if (t1Var.h.getWidth() != bv0Var.a || t1Var.h.getHeight() != bv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) bv0Var.a, (int) bv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(t1Var.h, (Rect) null, new RectF(0.0f, 0.0f, bv0Var.a, bv0Var.b), (Paint) null);
                                        t1Var.h = createBitmap;
                                        t1Var.r = true;
                                    }
                                    if (t1Var.n != null && (r5.getWidth() != bv0Var.a || t1Var.n.getHeight() != bv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) bv0Var.a, (int) bv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(t1Var.n, (Rect) null, new RectF(0.0f, 0.0f, bv0Var.a, bv0Var.b), (Paint) null);
                                        t1Var.n = createBitmap2;
                                        t1Var.r = true;
                                    }
                                    Bitmap bitmap2 = t1Var.h;
                                    Bitmap bitmap3 = t1Var.n;
                                    if (f1Var.k == null) {
                                        f1Var.k = new l2(bitmap2);
                                    }
                                    if (f1Var.D == null) {
                                        f1Var.D = new l2(bitmap3);
                                    }
                                    if (f1Var.G && f1Var.l == null) {
                                        f1Var.l = new l2(f1Var.A);
                                    }
                                    h7.t.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        x3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("eglConfig not initialized");
                        }
                        finish();
                    }
                    z10 = false;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        x3.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    x3.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
