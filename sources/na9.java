// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class na9 extends uo3 {
    public final /* synthetic */ pa9 E;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public ma9 s;
    public final tl0 w;
    public final li7 x;
    public final ma9 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na9(pa9 pa9Var, SurfaceTexture surfaceTexture, tl0 tl0Var) {
        super("CanvasInternal", true);
        this.E = pa9Var;
        this.x = new li7(this, (byte) 16);
        this.y = new ma9(this, (byte) 0);
        this.w = tl0Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        if (this.f) {
            if (this.d.equals(this.b.eglGetCurrentContext()) && this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
        }
    }

    public final void finish() {
        tl0 tl0Var = this.w;
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
            if (tl0Var != null) {
                synchronized (tl0Var.f) {
                    if (tl0Var.g == eGLContext) {
                        tl0Var.g = null;
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
        if (tl0Var != null) {
            ma9 ma9Var = this.y;
            ArrayList arrayList = tl0Var.e;
            arrayList.remove(ma9Var);
            if (arrayList.isEmpty() && tl0Var.d.isEmpty()) {
                tl0Var.n.a();
            }
        }
    }

    @Override // uo3, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i;
        pa9 pa9Var = this.E;
        Bitmap bitmap = pa9Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        tl0 tl0Var = this.w;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i2 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (f11.a) {
                c00.w(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (tl0Var != null) {
                            synchronized (tl0Var.f) {
                                eGLContext = tl0Var.g;
                                if (eGLContext == null) {
                                    eGLContext = EGL10.EGL_NO_CONTEXT;
                                }
                            }
                        } else {
                            eGLContext = EGL10.EGL_NO_CONTEXT;
                        }
                        EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                        this.d = eglCreateContext;
                        if (eglCreateContext == null) {
                            if (f11.a) {
                                c00.w(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (tl0Var != null) {
                                tl0Var.a(eglCreateContext);
                                tl0Var.e.add(this.y);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (f11.a) {
                                        c00.w(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    nx7 nx7Var = pa9Var.c;
                                    nx7Var.getClass();
                                    Map map = rca.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : rca.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        qca qcaVar = new qca();
                                        qcaVar.b = new HashMap();
                                        qcaVar.a = GLES20.glCreateProgram();
                                        m09 b = qca.b(35633, str);
                                        int i3 = b.b;
                                        if (b.c == 0) {
                                            if (f11.a) {
                                                cc4.d("Vertex shader compilation failed");
                                            }
                                            qca.c(i3, i2, qcaVar.a);
                                        } else {
                                            m09 b2 = qca.b(35632, str2);
                                            int i4 = b2.b;
                                            if (b2.c == 0) {
                                                if (f11.a) {
                                                    cc4.d("Fragment shader compilation failed");
                                                }
                                                qca.c(i3, i4, qcaVar.a);
                                            } else {
                                                GLES20.glAttachShader(qcaVar.a, i3);
                                                GLES20.glAttachShader(qcaVar.a, i4);
                                                int i5 = i2;
                                                while (true) {
                                                    int length = strArr.length;
                                                    i = qcaVar.a;
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    GLES20.glBindAttribLocation(i, i5, strArr[i5]);
                                                    i5++;
                                                }
                                                GLES20.glLinkProgram(i);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i, 35714, iArr3, i2);
                                                if (iArr3[i2] == 0 && f11.a) {
                                                    cc4.d(GLES20.glGetProgramInfoLog(i));
                                                }
                                                if (iArr3[i2] == 0) {
                                                    qca.c(i3, i4, qcaVar.a);
                                                } else {
                                                    int length2 = strArr2.length;
                                                    for (int i6 = i2; i6 < length2; i6++) {
                                                        String str3 = strArr2[i6];
                                                        qcaVar.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(qcaVar.a, str3)));
                                                    }
                                                    if (i3 != 0) {
                                                        GLES20.glDeleteShader(i3);
                                                    }
                                                    if (i4 != 0) {
                                                        GLES20.glDeleteShader(i4);
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.put((String) entry.getKey(), qcaVar);
                                        i2 = 0;
                                    }
                                    nx7Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    qma qmaVar = nx7Var.g;
                                    if (pa9Var.h.getWidth() != qmaVar.a || pa9Var.h.getHeight() != qmaVar.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) qmaVar.a, (int) qmaVar.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(pa9Var.h, (Rect) null, new RectF(0.0f, 0.0f, qmaVar.a, qmaVar.b), (Paint) null);
                                        pa9Var.h = createBitmap;
                                        pa9Var.r = true;
                                    }
                                    if (pa9Var.n != null && (r5.getWidth() != qmaVar.a || pa9Var.n.getHeight() != qmaVar.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) qmaVar.a, (int) qmaVar.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(pa9Var.n, (Rect) null, new RectF(0.0f, 0.0f, qmaVar.a, qmaVar.b), (Paint) null);
                                        pa9Var.n = createBitmap2;
                                        pa9Var.r = true;
                                    }
                                    Bitmap bitmap2 = pa9Var.h;
                                    Bitmap bitmap3 = pa9Var.n;
                                    if (nx7Var.k == null) {
                                        nx7Var.k = new ymb(bitmap2);
                                    }
                                    if (nx7Var.D == null) {
                                        nx7Var.D = new ymb(bitmap3);
                                    }
                                    if (nx7Var.G && nx7Var.l == null) {
                                        nx7Var.l = new ymb(nx7Var.A);
                                    }
                                    k2f.a();
                                    z = true;
                                } else {
                                    if (f11.a) {
                                        c00.w(this.b, new StringBuilder("eglMakeCurrent failed "));
                                    }
                                    finish();
                                }
                            } else {
                                finish();
                            }
                        }
                    } else {
                        if (f11.a) {
                            cc4.d("eglConfig not initialized");
                        }
                        finish();
                    }
                    z = false;
                } else {
                    if (f11.a) {
                        c00.w(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (f11.a) {
                    c00.w(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z;
        super.run();
    }
}
