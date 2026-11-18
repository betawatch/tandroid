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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kz0 extends org.telegram.messenger.r5 {
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
    public hz0 d;
    public int e;
    public int f;
    public EGL10 h;
    public EGLDisplay n;
    public EGLConfig r;
    public EGLSurface s;
    public EGLContext w;
    public int x;
    public int y;

    public kz0(SurfaceTexture surfaceTexture, hz0 hz0Var, hz0 hz0Var2, int i7, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = false;
        this.X = new ArrayList();
        this.c = surfaceTexture;
        this.d = hz0Var2;
        this.e = i7;
        this.f = i10;
        start();
    }

    public final void a(jz0 jz0Var) {
        int i7 = 0;
        GLES20.glGenTextures(1, jz0Var.A, 0);
        GLES20.glBindTexture(3553, jz0Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, jz0Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        jz0Var.C.recycle();
        jz0Var.C = null;
        if (jz0Var.D) {
            ArrayList arrayList = this.U;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((jz0) obj).a();
            }
            this.U.clear();
        }
        this.U.add(jz0Var);
        this.T = true;
    }

    public final void b(float f10, View view, Runnable runnable) {
        if (this.b.get()) {
            jz0 jz0Var = new jz0(this, view, f10, runnable);
            getHandler();
            this.T = true;
            postRunnable(new iz0(this, jz0Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            org.telegram.messenger.g0.g3(runnable);
        }
        hz0 hz0Var = this.d;
        if (hz0Var != null) {
            org.telegram.messenger.g0.g3(hz0Var);
            this.d = null;
        }
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            org.telegram.messenger.g0.g3(new di.ea(runnable, runnable2, 1));
            mz0.b(this.d);
            this.d = null;
        } else {
            jz0 jz0Var = new jz0(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.T = true;
            postRunnable(new iz0(this, jz0Var, 1));
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            jz0 jz0Var = new jz0(this, arrayList, runnable);
            this.T = true;
            postRunnable(new iz0(this, jz0Var, 0));
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).setVisibility(8);
        }
        if (runnable != null) {
            org.telegram.messenger.g0.g3(runnable);
        }
        hz0 hz0Var = this.d;
        if (hz0Var != null) {
            org.telegram.messenger.g0.g3(hz0Var);
            this.d = null;
        }
    }

    public final void f() {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.b.get()) {
            GLES20.glClear(TLObject.FLAG_14);
            int i13 = 0;
            int i14 = 0;
            while (i14 < this.U.size()) {
                jz0 jz0Var = (jz0) this.U.get(i14);
                if (jz0Var.d) {
                    ArrayList arrayList = this.U;
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        i15 += ((jz0) arrayList.get(i16)).u;
                    }
                    float f10 = jz0Var.u;
                    float f11 = f10 / i15;
                    int[] iArr = jz0Var.B;
                    int i17 = jz0Var.t;
                    int o4 = org.telegram.messenger.bz.o();
                    int i18 = jz0Var.E.a ? 120000 : o4 != 1 ? o4 != 2 ? 30000 : 120000 : 60000;
                    if (jz0Var.D) {
                        i18 /= 2;
                    }
                    float max = Math.max(org.telegram.messenger.g0.N(0.4f), 1.0f);
                    jz0Var.s = Utilities.j((int) ((r5 * i17) / (max * max)), (int) (i18 * f11), 10);
                    float f12 = i17;
                    float f13 = f12 / f10;
                    int round = (int) Math.round(Math.sqrt(r5 / f13));
                    jz0Var.w = round;
                    jz0Var.v = Math.round(jz0Var.s / round);
                    while (true) {
                        i10 = jz0Var.v;
                        i11 = jz0Var.w;
                        i12 = i10 * i11;
                        if (i12 >= jz0Var.s) {
                            break;
                        } else if (i10 / i11 < f13) {
                            jz0Var.v = i10 + 1;
                        } else {
                            jz0Var.w = i11 + 1;
                        }
                    }
                    jz0Var.s = i12;
                    jz0Var.x = Math.max(f12 / i10, f10 / i11);
                    GLES20.glGenBuffers(2, iArr, 0);
                    for (int i19 = 0; i19 < 2; i19++) {
                        GLES20.glBindBuffer(34962, iArr[i19]);
                        GLES20.glBufferData(34962, jz0Var.s * 28, null, 35048);
                    }
                    if (jz0Var.e != null) {
                        this.V.add(jz0Var);
                    }
                }
                this.W = true;
                int[] iArr2 = jz0Var.B;
                boolean z10 = jz0Var.D;
                float f14 = jz0Var.m;
                int i20 = jz0Var.u;
                int i21 = jz0Var.t;
                Matrix matrix = jz0Var.r;
                kz0 kz0Var = jz0Var.E;
                long nanoTime = System.nanoTime();
                double d = jz0Var.b < 0 ? 0.0d : (nanoTime - r8) / 1.0E9d;
                jz0Var.b = nanoTime;
                if (jz0Var.n && !jz0Var.o) {
                    matrix.reset();
                    matrix.postScale(i21, i20);
                    matrix.postTranslate(jz0Var.i, jz0Var.j);
                    jz0Var.c();
                }
                jz0Var.c = (float) ((f14 * d) + jz0Var.c);
                GLES20.glUniformMatrix3fv(kz0Var.y, 1, false, jz0Var.p, 0);
                GLES20.glUniform1f(kz0Var.E, jz0Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(kz0Var.F, jz0Var.c);
                GLES20.glUniform1f(kz0Var.G, ((float) d) * f14);
                GLES20.glUniform1f(kz0Var.H, jz0Var.s);
                GLES20.glUniform3f(kz0Var.J, jz0Var.v, jz0Var.w, jz0Var.x);
                GLES20.glUniform2f(kz0Var.Q, jz0Var.g, jz0Var.h);
                GLES20.glUniform1f(kz0Var.R, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(kz0Var.S, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(kz0Var.K, i21, i20);
                GLES20.glUniform1f(kz0Var.L, jz0Var.y);
                GLES20.glUniform2f(kz0Var.M, 0.0f, 0.0f);
                GLES20.glUniform1f(kz0Var.O, jz0Var.k);
                GLES20.glUniform1f(kz0Var.P, jz0Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, jz0Var.A[0]);
                GLES20.glUniform1i(kz0Var.N, 0);
                GLES20.glBindBuffer(34962, iArr2[jz0Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - jz0Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, jz0Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                jz0Var.d = false;
                jz0Var.z = 1 - jz0Var.z;
                if (jz0Var.c > jz0Var.l + (jz0Var.D ? 2.0f : 0.9f)) {
                    jz0Var.a();
                    this.U.remove(i14);
                    i7 = 1;
                    this.T = !this.U.isEmpty();
                    i14--;
                } else {
                    i7 = 1;
                }
                i14 += i7;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    try {
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        for (int i22 = 0; i22 < this.V.size(); i22++) {
                            org.telegram.messenger.g0.g3(((jz0) this.V.get(i22)).e);
                        }
                        this.V.clear();
                        while (i13 < this.U.size()) {
                            ((jz0) this.U.get(i13)).a();
                            i13++;
                        }
                        this.U.clear();
                        org.telegram.messenger.g0.g3(new me(14));
                        i();
                        return;
                    }
                }
                org.telegram.messenger.a8.d("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            while (i13 < this.V.size()) {
                org.telegram.messenger.g0.g3(((jz0) this.V.get(i13)).e);
                i13++;
            }
            this.V.clear();
            if (this.U.isEmpty() && this.W) {
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
            org.telegram.messenger.a8.d("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            i();
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglInitialize");
            i();
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.h.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglChooseConfig");
            h();
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.r = eGLConfig;
        EGLContext eglCreateContext = this.h.eglCreateContext(this.n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        this.w = eglCreateContext;
        if (eglCreateContext == null) {
            org.telegram.messenger.a8.d("ThanosEffect: eglContext == null");
            i();
            return;
        }
        EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.n, this.r, this.c, null);
        this.s = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null) {
            org.telegram.messenger.a8.d("ThanosEffect: eglSurface == null");
            i();
            return;
        }
        if (!this.h.eglMakeCurrent(this.n, eglCreateWindowSurface, eglCreateWindowSurface, this.w)) {
            org.telegram.messenger.a8.d("ThanosEffect: failed eglMakeCurrent");
            i();
            return;
        }
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        if (glCreateShader == 0 || glCreateShader2 == 0) {
            org.telegram.messenger.a8.d("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
            i();
            return;
        }
        GLES20.glShaderSource(glCreateShader, org.telegram.messenger.g0.y2(null, R.raw.thanos_vertex));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.a8.d("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            i();
            return;
        }
        GLES20.glShaderSource(glCreateShader2, org.telegram.messenger.g0.y2(null, R.raw.thanos_fragment));
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.a8.d("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
            GLES20.glDeleteShader(glCreateShader2);
            i();
            return;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.x = glCreateProgram;
        if (glCreateProgram == 0) {
            org.telegram.messenger.a8.d("ThanosEffect: drawProgram == 0");
            i();
            return;
        }
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(this.x, glCreateShader2);
        GLES30.glTransformFeedbackVaryings(this.x, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
        GLES20.glLinkProgram(this.x);
        GLES20.glGetProgramiv(this.x, 35714, iArr, 0);
        if (iArr[0] != 1) {
            org.telegram.messenger.a8.d("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.x));
            i();
            return;
        }
        this.y = GLES20.glGetUniformLocation(this.x, "matrix");
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

    public final void h() {
        if (!this.b.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: kill failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.r5
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            f();
            return;
        }
        int i10 = 0;
        if (i7 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.b.get()) {
                this.e = i11;
                this.f = i12;
                GLES20.glViewport(0, 0, i11, i12);
                GLES20.glUniform2f(this.I, i11, i12);
            }
            f();
            return;
        }
        if (i7 == 2) {
            i();
            return;
        }
        if (i7 == 3) {
            a((jz0) message.obj);
            return;
        }
        ArrayList arrayList = this.U;
        if (i7 == 4) {
            while (i10 < arrayList.size()) {
                jz0 jz0Var = (jz0) arrayList.get(i10);
                jz0Var.g += message.arg1;
                jz0Var.h += message.arg2;
                i10++;
            }
            return;
        }
        if (i7 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i10 < arrayList.size()) {
            jz0 jz0Var2 = (jz0) arrayList.get(i10);
            if (jz0Var2.a.contains(view)) {
                jz0Var2.a();
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void i() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            org.telegram.messenger.a8.b("ThanosEffect: killInternal failed, already dead");
            return;
        }
        org.telegram.messenger.a8.b("ThanosEffect: killInternal");
        int i7 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.U;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((jz0) arrayList.get(i7)).a();
            i7++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        mz0.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.messenger.r5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.X;
        int i7 = 0;
        try {
            g();
            if (!arrayList.isEmpty()) {
                while (i7 < arrayList.size()) {
                    a((jz0) arrayList.get(i7));
                    i7++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            while (i7 < arrayList.size()) {
                jz0 jz0Var = (jz0) arrayList.get(i7);
                Runnable runnable = jz0Var.e;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                }
                jz0Var.a();
                i7++;
            }
            arrayList.clear();
            org.telegram.messenger.g0.g3(new me(13));
            i();
        }
    }
}
