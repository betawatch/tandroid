package og;

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
import org.telegram.messenger.em;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.tv0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f1 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public e1 s;
    public final ia v;
    public final androidx.activity.i w;
    public final e1 x;
    public final /* synthetic */ h1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, SurfaceTexture surfaceTexture, ia iaVar) {
        super("CanvasInternal");
        this.y = h1Var;
        this.w = new androidx.activity.i(this, 24);
        this.x = new e1(this, 0);
        this.v = iaVar;
        this.a = surfaceTexture;
    }

    public static void b(f1 f1Var) {
        if (f1Var.f) {
            if (f1Var.d.equals(f1Var.b.eglGetCurrentContext()) && f1Var.e.equals(f1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = f1Var.b;
            EGLDisplay eGLDisplay = f1Var.c;
            EGLSurface eGLSurface = f1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f1Var.d);
        }
    }

    public final void finish() {
        ia iaVar = this.v;
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
            if (iaVar != null) {
                synchronized (iaVar.f) {
                    try {
                        if (iaVar.g == eGLContext) {
                            iaVar.g = null;
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
        if (iaVar != null) {
            e1 e1Var = this.x;
            ArrayList arrayList = iaVar.e;
            arrayList.remove(e1Var);
            if (arrayList.isEmpty() && iaVar.d.isEmpty()) {
                iaVar.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        h1 h1Var = this.y;
        Bitmap bitmap = h1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        ia iaVar = this.v;
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
                em.s(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (iaVar != null) {
                            synchronized (iaVar.f) {
                                try {
                                    eGLContext = iaVar.g;
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
                                em.s(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (iaVar != null) {
                                iaVar.a(eglCreateContext);
                                iaVar.e.add(this.x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        em.s(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    v0 v0Var = h1Var.c;
                                    v0Var.getClass();
                                    Map map = j1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : j1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        i1 i1Var = new i1();
                                        i1Var.b = new HashMap();
                                        i1Var.a = GLES20.glCreateProgram();
                                        b2.q0 b10 = i1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            i1.c(i11, i10, i1Var.a);
                                        } else {
                                            b2.q0 b11 = i1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                i1.c(i11, i12, i1Var.a);
                                            } else {
                                                GLES20.glAttachShader(i1Var.a, i11);
                                                GLES20.glAttachShader(i1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(i1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = i1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    i1.c(i11, i12, i1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        i1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(i1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), i1Var);
                                        i10 = 0;
                                    }
                                    v0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    tv0 tv0Var = v0Var.g;
                                    if (h1Var.h.getWidth() != tv0Var.a || h1Var.h.getHeight() != tv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) tv0Var.a, (int) tv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(h1Var.h, (Rect) null, new RectF(0.0f, 0.0f, tv0Var.a, tv0Var.b), (Paint) null);
                                        h1Var.h = createBitmap;
                                        h1Var.r = true;
                                    }
                                    if (h1Var.n != null && (r5.getWidth() != tv0Var.a || h1Var.n.getHeight() != tv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) tv0Var.a, (int) tv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(h1Var.n, (Rect) null, new RectF(0.0f, 0.0f, tv0Var.a, tv0Var.b), (Paint) null);
                                        h1Var.n = createBitmap2;
                                        h1Var.r = true;
                                    }
                                    Bitmap bitmap2 = h1Var.h;
                                    Bitmap bitmap3 = h1Var.n;
                                    if (v0Var.k == null) {
                                        v0Var.k = new w1(bitmap2);
                                    }
                                    if (v0Var.D == null) {
                                        v0Var.D = new w1(bitmap3);
                                    }
                                    if (v0Var.G && v0Var.l == null) {
                                        v0Var.l = new w1(v0Var.A);
                                    }
                                    w7.j0.a();
                                    z10 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        em.s(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                        em.s(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    em.s(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
