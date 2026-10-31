package ig;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.messenger.v2;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
import v7.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a1 extends s5 {
    public final /* synthetic */ c1 D;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public z0 s;
    public final s9 w;
    public final androidx.activity.i x;
    public final z0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, SurfaceTexture surfaceTexture, s9 s9Var) {
        super("CanvasInternal", true);
        this.D = c1Var;
        this.x = new androidx.activity.i(this, 21);
        this.y = new z0(this, 0);
        this.w = s9Var;
        this.a = surfaceTexture;
    }

    public static void a(a1 a1Var) {
        if (a1Var.f) {
            if (a1Var.d.equals(a1Var.b.eglGetCurrentContext()) && a1Var.e.equals(a1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = a1Var.b;
            EGLDisplay eGLDisplay = a1Var.c;
            EGLSurface eGLSurface = a1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, a1Var.d);
        }
    }

    public final void finish() {
        s9 s9Var = this.w;
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
            if (s9Var != null) {
                synchronized (s9Var.f) {
                    try {
                        if (s9Var.g == eGLContext) {
                            s9Var.g = null;
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
        if (s9Var != null) {
            z0 z0Var = this.y;
            ArrayList arrayList = s9Var.e;
            arrayList.remove(z0Var);
            if (arrayList.isEmpty() && s9Var.d.isEmpty()) {
                s9Var.n.c();
            }
        }
    }

    @Override // org.telegram.messenger.s5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        c1 c1Var = this.D;
        Bitmap bitmap = c1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        s9 s9Var = this.w;
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
            if (v2.a) {
                z20.t(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (s9Var != null) {
                            synchronized (s9Var.f) {
                                try {
                                    eGLContext = s9Var.g;
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
                            if (v2.a) {
                                z20.t(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (s9Var != null) {
                                s9Var.a(eglCreateContext);
                                s9Var.e.add(this.y);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (v2.a) {
                                        z20.t(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    q0 q0Var = c1Var.c;
                                    q0Var.getClass();
                                    Map map = e1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : e1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        d1 d1Var = new d1();
                                        d1Var.b = new HashMap();
                                        d1Var.a = GLES20.glCreateProgram();
                                        ac.g b10 = d1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (v2.a) {
                                                f8.d("Vertex shader compilation failed");
                                            }
                                            d1.c(i11, i10, d1Var.a);
                                        } else {
                                            ac.g b11 = d1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (v2.a) {
                                                    f8.d("Fragment shader compilation failed");
                                                }
                                                d1.c(i11, i12, d1Var.a);
                                            } else {
                                                GLES20.glAttachShader(d1Var.a, i11);
                                                GLES20.glAttachShader(d1Var.a, i12);
                                                for (int i13 = i10; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(d1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = d1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && v2.a) {
                                                    f8.d(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    d1.c(i11, i12, d1Var.a);
                                                } else {
                                                    int length = strArr2.length;
                                                    for (int i15 = i10; i15 < length; i15++) {
                                                        String str3 = strArr2[i15];
                                                        d1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(d1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), d1Var);
                                        i10 = 0;
                                    }
                                    q0Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    pu0 pu0Var = q0Var.g;
                                    if (c1Var.h.getWidth() != pu0Var.a || c1Var.h.getHeight() != pu0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) pu0Var.a, (int) pu0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(c1Var.h, (Rect) null, new RectF(0.0f, 0.0f, pu0Var.a, pu0Var.b), (Paint) null);
                                        c1Var.h = createBitmap;
                                        c1Var.r = true;
                                    }
                                    if (c1Var.n != null && (r5.getWidth() != pu0Var.a || c1Var.n.getHeight() != pu0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) pu0Var.a, (int) pu0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(c1Var.n, (Rect) null, new RectF(0.0f, 0.0f, pu0Var.a, pu0Var.b), (Paint) null);
                                        c1Var.n = createBitmap2;
                                        c1Var.r = true;
                                    }
                                    Bitmap bitmap2 = c1Var.h;
                                    Bitmap bitmap3 = c1Var.n;
                                    if (q0Var.k == null) {
                                        q0Var.k = new r1(bitmap2);
                                    }
                                    if (q0Var.D == null) {
                                        q0Var.D = new r1(bitmap3);
                                    }
                                    if (q0Var.G && q0Var.l == null) {
                                        q0Var.l = new r1(q0Var.A);
                                    }
                                    h8.a();
                                    z10 = true;
                                } else {
                                    if (v2.a) {
                                        z20.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (v2.a) {
                            f8.d("eglConfig not initialized");
                        }
                        finish();
                    }
                    z10 = false;
                } else {
                    if (v2.a) {
                        z20.t(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (v2.a) {
                    z20.t(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }
}
