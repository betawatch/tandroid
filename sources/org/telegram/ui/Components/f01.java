package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f01 extends org.telegram.messenger.s5 {
    public int D;
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
    public volatile boolean S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public final ArrayList W;
    public boolean a;
    public final AtomicBoolean b;
    public final SurfaceTexture c;
    public b01 d;
    public int e;
    public int f;
    public EGL10 h;
    public EGLDisplay n;
    public EGLConfig r;
    public EGLSurface s;
    public EGLContext w;
    public int x;
    public int y;

    public f01(SurfaceTexture surfaceTexture, b01 b01Var, b01 b01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.c = surfaceTexture;
        this.d = b01Var2;
        this.e = i10;
        this.f = i11;
        start();
    }

    public final void a(e01 e01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, e01Var.A, 0);
        GLES20.glBindTexture(3553, e01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, e01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        e01Var.C.recycle();
        e01Var.C = null;
        if (e01Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((e01) obj).a();
            }
            this.T.clear();
        }
        this.T.add(e01Var);
        this.S = true;
    }

    public final void b(float f7, View view, Runnable runnable) {
        if (this.b.get()) {
            e01 e01Var = new e01(this, view, f7, runnable);
            getHandler();
            this.S = true;
            postRunnable(new c01(this, e01Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            org.telegram.messenger.i0.g3(runnable);
        }
        b01 b01Var = this.d;
        if (b01Var != null) {
            org.telegram.messenger.i0.g3(b01Var);
            this.d = null;
        }
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            org.telegram.messenger.i0.g3(new d01(runnable, runnable2, 0));
            h01.b(this.d);
            this.d = null;
        } else {
            e01 e01Var = new e01(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.S = true;
            postRunnable(new c01(this, e01Var, 1));
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            e01 e01Var = new e01(this, arrayList, runnable);
            this.S = true;
            postRunnable(new c01(this, e01Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            org.telegram.messenger.i0.g3(runnable);
        }
        b01 b01Var = this.d;
        if (b01Var != null) {
            org.telegram.messenger.i0.g3(b01Var);
            this.d = null;
        }
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.b.get()) {
            GLES20.glClear(TLObject.FLAG_14);
            int i14 = 0;
            int i15 = 0;
            while (i15 < this.T.size()) {
                e01 e01Var = (e01) this.T.get(i15);
                if (e01Var.d) {
                    ArrayList arrayList = this.T;
                    int i16 = 0;
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        i16 += ((e01) arrayList.get(i17)).u;
                    }
                    float f7 = e01Var.u;
                    float f10 = f7 / i16;
                    int[] iArr = e01Var.B;
                    int i18 = e01Var.t;
                    int o10 = org.telegram.messenger.tz.o();
                    int i19 = e01Var.E.a ? 120000 : o10 != 1 ? o10 != 2 ? 30000 : 120000 : 60000;
                    if (e01Var.D) {
                        i19 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.i0.N(0.4f), 1.0f);
                    e01Var.s = Utilities.j((int) ((r5 * i18) / (max * max)), (int) (i19 * f10), 10);
                    float f11 = i18;
                    float f12 = f11 / f7;
                    int round = (int) Math.round(Math.sqrt(r5 / f12));
                    e01Var.w = round;
                    e01Var.v = Math.round(e01Var.s / round);
                    while (true) {
                        i11 = e01Var.v;
                        i12 = e01Var.w;
                        i13 = i11 * i12;
                        if (i13 >= e01Var.s) {
                            break;
                        } else if (i11 / i12 < f12) {
                            e01Var.v = i11 + 1;
                        } else {
                            e01Var.w = i12 + 1;
                        }
                    }
                    e01Var.s = i13;
                    e01Var.x = Math.max(f11 / i11, f7 / i12);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i20 = 0; i20 < 2; i20++) {
                        GLES20.glBindBuffer(34962, iArr[i20]);
                        GLES20.glBufferData(34962, e01Var.s * 28, null, 35048);
                    }
                    if (e01Var.e != null) {
                        this.U.add(e01Var);
                    }
                }
                this.V = true;
                int[] iArr2 = e01Var.B;
                boolean z10 = e01Var.D;
                float f13 = e01Var.m;
                int i21 = e01Var.u;
                int i22 = e01Var.t;
                Matrix matrix = e01Var.r;
                f01 f01Var = e01Var.E;
                long nanoTime = System.nanoTime();
                double d = e01Var.b < 0 ? 0.0d : (nanoTime - r8) / 1.0E9d;
                e01Var.b = nanoTime;
                if (e01Var.n && !e01Var.o) {
                    matrix.reset();
                    matrix.postScale(i22, i21);
                    matrix.postTranslate(e01Var.i, e01Var.j);
                    e01Var.c();
                }
                e01Var.c = (float) ((f13 * d) + e01Var.c);
                GLES20.glUniformMatrix3fv(f01Var.y, 1, false, e01Var.p, 0);
                GLES20.glUniform1f(f01Var.D, e01Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(f01Var.E, e01Var.c);
                GLES20.glUniform1f(f01Var.F, ((float) d) * f13);
                GLES20.glUniform1f(f01Var.G, e01Var.s);
                GLES20.glUniform3f(f01Var.I, e01Var.v, e01Var.w, e01Var.x);
                GLES20.glUniform2f(f01Var.P, e01Var.g, e01Var.h);
                GLES20.glUniform1f(f01Var.Q, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(f01Var.R, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(f01Var.J, i22, i21);
                GLES20.glUniform1f(f01Var.K, e01Var.y);
                GLES20.glUniform2f(f01Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(f01Var.N, e01Var.k);
                GLES20.glUniform1f(f01Var.O, e01Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, e01Var.A[0]);
                GLES20.glUniform1i(f01Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[e01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - e01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, e01Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                e01Var.d = false;
                e01Var.z = 1 - e01Var.z;
                if (e01Var.c > e01Var.l + (e01Var.D ? 2.0f : 0.9f)) {
                    e01Var.a();
                    this.T.remove(i15);
                    i10 = 1;
                    this.S = !this.T.isEmpty();
                    i15--;
                } else {
                    i10 = 1;
                }
                i15 += i10;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    try {
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        for (int i23 = 0; i23 < this.U.size(); i23++) {
                            org.telegram.messenger.i0.g3(((e01) this.U.get(i23)).e);
                        }
                        this.U.clear();
                        while (i14 < this.T.size()) {
                            ((e01) this.T.get(i14)).a();
                            i14++;
                        }
                        this.T.clear();
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(27));
                        i();
                        return;
                    }
                }
                org.telegram.messenger.f8.d("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            while (i14 < this.U.size()) {
                org.telegram.messenger.i0.g3(((e01) this.U.get(i14)).e);
                i14++;
            }
            this.U.clear();
            if (this.T.isEmpty() && this.V) {
                i();
            }
        }
    }

    public final void g() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            org.telegram.messenger.f8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.f8.d("ThanosEffect: failed eglInitialize");
            i();
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.h.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            org.telegram.messenger.f8.d("ThanosEffect: failed eglChooseConfig");
            h();
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.r = eGLConfig;
        EGLContext eglCreateContext = this.h.eglCreateContext(this.n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        this.w = eglCreateContext;
        if (eglCreateContext == null) {
            org.telegram.messenger.f8.d("ThanosEffect: eglContext == null");
            i();
            return;
        }
        EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.n, this.r, this.c, null);
        this.s = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null) {
            org.telegram.messenger.f8.d("ThanosEffect: eglSurface == null");
            i();
            return;
        }
        if (!this.h.eglMakeCurrent(this.n, eglCreateWindowSurface, eglCreateWindowSurface, this.w)) {
            org.telegram.messenger.f8.d("ThanosEffect: failed eglMakeCurrent");
            i();
            return;
        }
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        if (glCreateShader == 0 || glCreateShader2 == 0) {
            org.telegram.messenger.f8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
            i();
            return;
        }
        GLES20.glShaderSource(glCreateShader, org.telegram.messenger.i0.y2(null, R.raw.thanos_vertex));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.f8.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            i();
            return;
        }
        GLES20.glShaderSource(glCreateShader2, org.telegram.messenger.i0.y2(null, R.raw.thanos_fragment));
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.f8.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
            GLES20.glDeleteShader(glCreateShader2);
            i();
            return;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.x = glCreateProgram;
        if (glCreateProgram == 0) {
            org.telegram.messenger.f8.d("ThanosEffect: drawProgram == 0");
            i();
            return;
        }
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(this.x, glCreateShader2);
        GLES30.glTransformFeedbackVaryings(this.x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
        GLES20.glLinkProgram(this.x);
        GLES20.glGetProgramiv(this.x, 35714, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.f8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.x));
            i();
            return;
        }
        this.y = GLES20.glGetUniformLocation(this.x, "matrix");
        this.J = GLES20.glGetUniformLocation(this.x, "rectSize");
        this.L = GLES20.glGetUniformLocation(this.x, "rectPos");
        this.D = GLES20.glGetUniformLocation(this.x, "reset");
        this.E = GLES20.glGetUniformLocation(this.x, "time");
        this.F = GLES20.glGetUniformLocation(this.x, "deltaTime");
        this.G = GLES20.glGetUniformLocation(this.x, "particlesCount");
        this.H = GLES20.glGetUniformLocation(this.x, "size");
        this.I = GLES20.glGetUniformLocation(this.x, "gridSize");
        this.M = GLES20.glGetUniformLocation(this.x, "tex");
        this.K = GLES20.glGetUniformLocation(this.x, "seed");
        this.N = GLES20.glGetUniformLocation(this.x, "dp");
        this.O = GLES20.glGetUniformLocation(this.x, "longevity");
        this.P = GLES20.glGetUniformLocation(this.x, "offset");
        this.Q = GLES20.glGetUniformLocation(this.x, "scale");
        this.R = GLES20.glGetUniformLocation(this.x, "uvOffset");
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.x);
        GLES20.glUniform2f(this.H, this.e, this.f);
    }

    public final void h() {
        if (!this.b.get()) {
            org.telegram.messenger.f8.b("ThanosEffect: kill failed, already dead");
            return;
        }
        org.telegram.messenger.f8.b("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.s5
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f();
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            int i12 = message.arg1;
            int i13 = message.arg2;
            if (this.b.get()) {
                this.e = i12;
                this.f = i13;
                GLES20.glViewport(0, 0, i12, i13);
                GLES20.glUniform2f(this.H, i12, i13);
            }
            f();
            return;
        }
        if (i10 == 2) {
            i();
            return;
        }
        if (i10 == 3) {
            a((e01) message.obj);
            return;
        }
        ArrayList arrayList = this.T;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                e01 e01Var = (e01) arrayList.get(i11);
                e01Var.g += message.arg1;
                e01Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            e01 e01Var2 = (e01) arrayList.get(i11);
            if (e01Var2.a.contains(view)) {
                e01Var2.a();
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void i() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.f8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.f8.b("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.T;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((e01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        h01.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.messenger.s5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.W;
        int i10 = 0;
        try {
            g();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    a((e01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            while (i10 < arrayList.size()) {
                e01 e01Var = (e01) arrayList.get(i10);
                Runnable runnable = e01Var.e;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                }
                e01Var.a();
                i10++;
            }
            arrayList.clear();
            org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(26));
            i();
        }
    }
}
