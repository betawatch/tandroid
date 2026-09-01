package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import j$.util.DesugarCollections;
import j7.b7;
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
import org.telegram.messenger.y3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m1 extends DispatchQueue {
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public volatile boolean h;
    public int n;
    public int r;
    public l1 s;
    public final ba v;
    public final androidx.activity.i w;
    public final l1 x;
    public final /* synthetic */ o1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(o1 o1Var, SurfaceTexture surfaceTexture, ba baVar) {
        super("CanvasInternal");
        this.y = o1Var;
        this.w = new androidx.activity.i(this, 16);
        this.x = new l1(this, 0);
        this.v = baVar;
        this.a = surfaceTexture;
    }

    public static void b(m1 m1Var) {
        if (m1Var.f) {
            if (m1Var.d.equals(m1Var.b.eglGetCurrentContext()) && m1Var.e.equals(m1Var.b.eglGetCurrentSurface(12377))) {
                return;
            }
            EGL10 egl10 = m1Var.b;
            EGLDisplay eGLDisplay = m1Var.c;
            EGLSurface eGLSurface = m1Var.e;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, m1Var.d);
        }
    }

    public final void finish() {
        ba baVar = this.v;
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
            if (baVar != null) {
                synchronized (baVar.f) {
                    try {
                        if (baVar.g == eGLContext) {
                            baVar.g = null;
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
        if (baVar != null) {
            l1 l1Var = this.x;
            ArrayList arrayList = baVar.e;
            arrayList.remove(l1Var);
            if (arrayList.isEmpty() && baVar.d.isEmpty()) {
                baVar.n.a();
            }
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        o1 o1Var = this.y;
        Bitmap bitmap = o1Var.h;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        SurfaceTexture surfaceTexture = this.a;
        ba baVar = this.v;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        int i10 = 0;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z4 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                y3.u(this.b, new StringBuilder("eglGetDisplay failed "));
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
                        if (baVar != null) {
                            synchronized (baVar.f) {
                                try {
                                    eGLContext = baVar.g;
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
                                y3.u(this.b, new StringBuilder("eglCreateContext failed "));
                            }
                            finish();
                        } else {
                            if (baVar != null) {
                                baVar.a(eglCreateContext);
                                baVar.e.add(this.x);
                            }
                            if (surfaceTexture != null) {
                                EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                                this.e = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        y3.u(this.b, new StringBuilder("createWindowSurface failed "));
                                    }
                                    finish();
                                } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                    GLES20.glEnable(3042);
                                    GLES20.glDisable(3024);
                                    GLES20.glDisable(2960);
                                    GLES20.glDisable(2929);
                                    c1 c1Var = o1Var.c;
                                    c1Var.getClass();
                                    Map map = q1.a;
                                    HashMap hashMap = new HashMap();
                                    for (Map.Entry entry : q1.a.entrySet()) {
                                        Map map2 = (Map) entry.getValue();
                                        String str = (String) map2.get("vertex");
                                        String str2 = (String) map2.get("fragment");
                                        String[] strArr = (String[]) map2.get("attributes");
                                        String[] strArr2 = (String[]) map2.get("uniforms");
                                        p1 p1Var = new p1();
                                        p1Var.b = new HashMap();
                                        p1Var.a = GLES20.glCreateProgram();
                                        c5.e b10 = p1.b(35633, str);
                                        int i11 = b10.a;
                                        if (b10.b == 0) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                FileLog.e("Vertex shader compilation failed");
                                            }
                                            p1.c(i11, i10, p1Var.a);
                                        } else {
                                            c5.e b11 = p1.b(35632, str2);
                                            int i12 = b11.a;
                                            if (b11.b == 0) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    FileLog.e("Fragment shader compilation failed");
                                                }
                                                p1.c(i11, i12, p1Var.a);
                                            } else {
                                                GLES20.glAttachShader(p1Var.a, i11);
                                                GLES20.glAttachShader(p1Var.a, i12);
                                                for (int i13 = 0; i13 < strArr.length; i13++) {
                                                    GLES20.glBindAttribLocation(p1Var.a, i13, strArr[i13]);
                                                }
                                                int i14 = p1Var.a;
                                                GLES20.glLinkProgram(i14);
                                                int[] iArr3 = new int[1];
                                                GLES20.glGetProgramiv(i14, 35714, iArr3, i10);
                                                if (iArr3[i10] == 0 && BuildVars.LOGS_ENABLED) {
                                                    FileLog.e(GLES20.glGetProgramInfoLog(i14));
                                                }
                                                if (iArr3[i10] == 0) {
                                                    p1.c(i11, i12, p1Var.a);
                                                } else {
                                                    for (String str3 : strArr2) {
                                                        p1Var.b.put(str3, Integer.valueOf(GLES20.glGetUniformLocation(p1Var.a, str3)));
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
                                        hashMap.put((String) entry.getKey(), p1Var);
                                        i10 = 0;
                                    }
                                    c1Var.r = DesugarCollections.unmodifiableMap(hashMap);
                                    kv0 kv0Var = c1Var.g;
                                    if (o1Var.h.getWidth() != kv0Var.a || o1Var.h.getHeight() != kv0Var.b) {
                                        Bitmap createBitmap = Bitmap.createBitmap((int) kv0Var.a, (int) kv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap).drawBitmap(o1Var.h, (Rect) null, new RectF(0.0f, 0.0f, kv0Var.a, kv0Var.b), (Paint) null);
                                        o1Var.h = createBitmap;
                                        o1Var.r = true;
                                    }
                                    if (o1Var.n != null && (r5.getWidth() != kv0Var.a || o1Var.n.getHeight() != kv0Var.b)) {
                                        Bitmap createBitmap2 = Bitmap.createBitmap((int) kv0Var.a, (int) kv0Var.b, Bitmap.Config.ARGB_8888);
                                        new Canvas(createBitmap2).drawBitmap(o1Var.n, (Rect) null, new RectF(0.0f, 0.0f, kv0Var.a, kv0Var.b), (Paint) null);
                                        o1Var.n = createBitmap2;
                                        o1Var.r = true;
                                    }
                                    Bitmap bitmap2 = o1Var.h;
                                    Bitmap bitmap3 = o1Var.n;
                                    if (c1Var.k == null) {
                                        c1Var.k = new f2(bitmap2);
                                    }
                                    if (c1Var.D == null) {
                                        c1Var.D = new f2(bitmap3);
                                    }
                                    if (c1Var.G && c1Var.l == null) {
                                        c1Var.l = new f2(c1Var.A);
                                    }
                                    b7.a();
                                    z4 = true;
                                } else {
                                    if (BuildVars.LOGS_ENABLED) {
                                        y3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                    z4 = false;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        y3.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    y3.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z4;
        super.run();
    }
}
