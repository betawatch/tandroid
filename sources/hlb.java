// default package

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hlb extends np3 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public volatile boolean T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public final ArrayList X;
    public boolean a;
    public final AtomicBoolean b;
    public final SurfaceTexture c;
    public elb d;
    public int e;
    public int f;
    public EGL10 h;
    public EGLDisplay n;
    public EGLConfig r;
    public EGLSurface s;
    public EGLContext w;
    public int x;
    public int y;

    public hlb(SurfaceTexture surfaceTexture, elb elbVar, elb elbVar2, int i, int i2) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.c = surfaceTexture;
        this.d = elbVar2;
        this.e = i;
        this.f = i2;
        start();
    }

    public final void a(glb glbVar) {
        int i = 0;
        GLES20.glGenTextures(1, glbVar.A, 0);
        GLES20.glBindTexture(3553, glbVar.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, glbVar.C, 0);
        GLES20.glBindTexture(3553, 0);
        glbVar.C.recycle();
        glbVar.C = null;
        if (glbVar.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((glb) obj).a();
            }
            this.U.clear();
        }
        this.U.add(glbVar);
        this.T = true;
    }

    public final void b(float f, View view, Runnable runnable) {
        if (this.b.get()) {
            glb glbVar = new glb(this, view, f, runnable);
            getHandler();
            this.T = true;
            postRunnable(new flb(this, glbVar, (byte) 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            gm.c3(runnable);
        }
        elb elbVar = this.d;
        if (elbVar != null) {
            gm.c3(elbVar);
            this.d = null;
        }
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            gm.c3(new gwa(runnable, runnable2, (byte) 1));
            jlb.b(this.d);
            this.d = null;
        } else {
            glb glbVar = new glb(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.T = true;
            postRunnable(new flb(this, glbVar, (byte) 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(ArrayList arrayList, Runnable runnable) {
        Object[] objArr = 0;
        if (this.b.get()) {
            glb glbVar = new glb(this, arrayList, runnable);
            this.T = true;
            postRunnable(new flb(this, glbVar, objArr == true ? 1 : 0));
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setVisibility(8);
        }
        if (runnable != null) {
            gm.c3(runnable);
        }
        elb elbVar = this.d;
        if (elbVar != null) {
            gm.c3(elbVar);
            this.d = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.b.get()) {
            GLES20.glClear(TLObject.FLAG_14);
            int i5 = 0;
            int i6 = 0;
            while (i6 < this.U.size()) {
                glb glbVar = (glb) this.U.get(i6);
                if (glbVar.d) {
                    ArrayList arrayList3 = this.U;
                    int i7 = 0;
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        i7 += ((glb) arrayList3.get(i8)).u;
                    }
                    float f = glbVar.u;
                    float f2 = f / i7;
                    int[] iArr = glbVar.B;
                    int i9 = glbVar.t;
                    int o = gda.o();
                    int i10 = glbVar.E.a ? 120000 : o != 1 ? o != 2 ? 30000 : 120000 : 60000;
                    if (glbVar.D) {
                        i10 /= 2;
                    }
                    float max = Math.max(gm.N(0.4f), 1.0f);
                    glbVar.s = Utilities.j((int) ((r5 * i9) / (max * max)), (int) (i10 * f2), 10);
                    float f3 = i9;
                    float f4 = f3 / f;
                    int round = (int) Math.round(Math.sqrt(r5 / f4));
                    glbVar.w = round;
                    glbVar.v = Math.round(glbVar.s / round);
                    while (true) {
                        i2 = glbVar.v;
                        i3 = glbVar.w;
                        i4 = i2 * i3;
                        if (i4 >= glbVar.s) {
                            break;
                        } else if (i2 / i3 < f4) {
                            glbVar.v = i2 + 1;
                        } else {
                            glbVar.w = i3 + 1;
                        }
                    }
                    glbVar.s = i4;
                    glbVar.x = Math.max(f3 / i2, f / i3);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i11 = 0; i11 < 2; i11++) {
                        GLES20.glBindBuffer(34962, iArr[i11]);
                        GLES20.glBufferData(34962, glbVar.s * 28, null, 35048);
                    }
                    if (glbVar.e != null) {
                        this.V.add(glbVar);
                    }
                }
                this.W = true;
                int[] iArr2 = glbVar.B;
                boolean z = glbVar.D;
                float f5 = glbVar.m;
                int i12 = glbVar.u;
                int i13 = glbVar.t;
                Matrix matrix = glbVar.r;
                hlb hlbVar = glbVar.E;
                long nanoTime = System.nanoTime();
                double d = glbVar.b < 0 ? 0.0d : (nanoTime - r8) / 1.0E9d;
                glbVar.b = nanoTime;
                if (glbVar.n && !glbVar.o) {
                    matrix.reset();
                    matrix.postScale(i13, i12);
                    matrix.postTranslate(glbVar.i, glbVar.j);
                    glbVar.c();
                }
                glbVar.c = (float) ((f5 * d) + glbVar.c);
                GLES20.glUniformMatrix3fv(hlbVar.y, 1, false, glbVar.p, 0);
                GLES20.glUniform1f(hlbVar.E, glbVar.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(hlbVar.F, glbVar.c);
                GLES20.glUniform1f(hlbVar.G, ((float) d) * f5);
                GLES20.glUniform1f(hlbVar.H, glbVar.s);
                GLES20.glUniform3f(hlbVar.J, glbVar.v, glbVar.w, glbVar.x);
                GLES20.glUniform2f(hlbVar.Q, glbVar.g, glbVar.h);
                GLES20.glUniform1f(hlbVar.R, z ? 0.8f : 1.0f);
                GLES20.glUniform1f(hlbVar.S, z ? 1.0f : 0.6f);
                GLES20.glUniform2f(hlbVar.K, i13, i12);
                GLES20.glUniform1f(hlbVar.L, glbVar.y);
                GLES20.glUniform2f(hlbVar.M, 0.0f, 0.0f);
                GLES20.glUniform1f(hlbVar.O, glbVar.k);
                GLES20.glUniform1f(hlbVar.P, glbVar.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, glbVar.A[0]);
                GLES20.glUniform1i(hlbVar.N, 0);
                GLES20.glBindBuffer(34962, iArr2[glbVar.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - glbVar.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, glbVar.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                glbVar.d = false;
                glbVar.z = 1 - glbVar.z;
                if (glbVar.c > glbVar.l + (glbVar.D ? 2.0f : 0.9f)) {
                    glbVar.a();
                    this.U.remove(i6);
                    i = 1;
                    this.T = !this.U.isEmpty();
                    i6--;
                } else {
                    i = 1;
                }
                i6 += i;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    fc4.d("thanos gles error " + glGetError);
                } else {
                    try {
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        int i14 = 0;
                        while (true) {
                            int size = this.V.size();
                            arrayList = this.V;
                            if (i14 >= size) {
                                break;
                            }
                            gm.c3(((glb) arrayList.get(i14)).e);
                            i14++;
                        }
                        arrayList.clear();
                        while (true) {
                            int size2 = this.U.size();
                            ArrayList arrayList4 = this.U;
                            if (i5 >= size2) {
                                arrayList4.clear();
                                gm.c3(new e1b((byte) 4));
                                h();
                                return;
                            }
                            ((glb) arrayList4.get(i5)).a();
                            i5++;
                        }
                    }
                }
            }
            this.h.eglSwapBuffers(this.n, this.s);
            while (true) {
                int size3 = this.V.size();
                arrayList2 = this.V;
                if (i5 >= size3) {
                    break;
                }
                gm.c3(((glb) arrayList2.get(i5)).e);
                i5++;
            }
            arrayList2.clear();
            if (this.U.isEmpty() && this.W) {
                h();
            }
        }
    }

    public final void f() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            fc4.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            h();
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            fc4.d("ThanosEffect: failed eglInitialize");
            h();
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.h.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            fc4.d("ThanosEffect: failed eglChooseConfig");
            g();
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.r = eGLConfig;
        EGLContext eglCreateContext = this.h.eglCreateContext(this.n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        this.w = eglCreateContext;
        if (eglCreateContext == null) {
            fc4.d("ThanosEffect: eglContext == null");
            h();
            return;
        }
        EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.n, this.r, this.c, null);
        this.s = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null) {
            fc4.d("ThanosEffect: eglSurface == null");
            h();
            return;
        }
        if (!this.h.eglMakeCurrent(this.n, eglCreateWindowSurface, eglCreateWindowSurface, this.w)) {
            fc4.d("ThanosEffect: failed eglMakeCurrent");
            h();
            return;
        }
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        if (glCreateShader == 0 || glCreateShader2 == 0) {
            fc4.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
            h();
            return;
        }
        GLES20.glShaderSource(glCreateShader, gm.v2(null, R.raw.thanos_vertex));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            fc4.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            h();
            return;
        }
        GLES20.glShaderSource(glCreateShader2, gm.v2(null, R.raw.thanos_fragment));
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            fc4.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
            GLES20.glDeleteShader(glCreateShader2);
            h();
            return;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.x = glCreateProgram;
        if (glCreateProgram == 0) {
            fc4.d("ThanosEffect: drawProgram == 0");
            h();
            return;
        }
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(this.x, glCreateShader2);
        GLES30.glTransformFeedbackVaryings(this.x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
        GLES20.glLinkProgram(this.x);
        GLES20.glGetProgramiv(this.x, 35714, iArr, 0);
        int i = iArr[0];
        int i2 = this.x;
        if (i != 1) {
            fc4.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(i2));
            h();
            return;
        }
        this.y = GLES20.glGetUniformLocation(i2, "matrix");
        this.K = GLES20.glGetUniformLocation(this.x, "rectSize");
        this.M = GLES20.glGetUniformLocation(this.x, "rectPos");
        this.E = GLES20.glGetUniformLocation(this.x, "reset");
        this.F = GLES20.glGetUniformLocation(this.x, "time");
        this.G = GLES20.glGetUniformLocation(this.x, "deltaTime");
        this.H = GLES20.glGetUniformLocation(this.x, "particlesCount");
        this.I = GLES20.glGetUniformLocation(this.x, "size");
        this.J = GLES20.glGetUniformLocation(this.x, "gridSize");
        this.N = GLES20.glGetUniformLocation(this.x, "tex");
        this.L = GLES20.glGetUniformLocation(this.x, "seed");
        this.O = GLES20.glGetUniformLocation(this.x, "dp");
        this.P = GLES20.glGetUniformLocation(this.x, "longevity");
        this.Q = GLES20.glGetUniformLocation(this.x, "offset");
        this.R = GLES20.glGetUniformLocation(this.x, "scale");
        this.S = GLES20.glGetUniformLocation(this.x, "uvOffset");
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.x);
        GLES20.glUniform2f(this.I, this.e, this.f);
    }

    public final void g() {
        if (!this.b.get()) {
            fc4.b("ThanosEffect: kill failed, already dead");
            return;
        }
        fc4.b("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            fc4.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        fc4.b("ThanosEffect: killInternal");
        int i = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.U;
            if (i >= arrayList.size()) {
                break;
            }
            ((glb) arrayList.get(i)).a();
            i++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        jlb.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // np3
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            e();
            return;
        }
        int i2 = 0;
        if (i == 1) {
            int i3 = message.arg1;
            int i4 = message.arg2;
            if (this.b.get()) {
                this.e = i3;
                this.f = i4;
                GLES20.glViewport(0, 0, i3, i4);
                GLES20.glUniform2f(this.I, i3, i4);
            }
            e();
            return;
        }
        if (i == 2) {
            h();
            return;
        }
        if (i == 3) {
            a((glb) message.obj);
            return;
        }
        ArrayList arrayList = this.U;
        if (i == 4) {
            while (i2 < arrayList.size()) {
                glb glbVar = (glb) arrayList.get(i2);
                glbVar.g += message.arg1;
                glbVar.h += message.arg2;
                i2++;
            }
            return;
        }
        if (i == 5) {
            View view = (View) message.obj;
            while (i2 < arrayList.size()) {
                glb glbVar2 = (glb) arrayList.get(i2);
                if (glbVar2.a.contains(view)) {
                    glbVar2.a();
                    arrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    @Override // np3, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.X;
        int i = 0;
        try {
            f();
            if (!arrayList.isEmpty()) {
                while (i < arrayList.size()) {
                    a((glb) arrayList.get(i));
                    i++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            fc4.g(e, true);
            while (i < arrayList.size()) {
                glb glbVar = (glb) arrayList.get(i);
                Runnable runnable = glbVar.e;
                if (runnable != null) {
                    gm.c3(runnable);
                }
                glbVar.a();
                i++;
            }
            arrayList.clear();
            gm.c3(new e1b((byte) 3));
            h();
        }
    }
}
