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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u01 extends DispatchQueue {
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
    public q01 d;
    public int e;
    public int f;
    public EGL10 h;
    public EGLDisplay n;
    public EGLConfig r;
    public EGLSurface s;
    public EGLContext v;
    public int w;
    public int x;
    public int y;

    public u01(SurfaceTexture surfaceTexture, q01 q01Var, q01 q01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.c = surfaceTexture;
        this.d = q01Var2;
        this.e = i10;
        this.f = i11;
        start();
    }

    public final void b(t01 t01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, t01Var.A, 0);
        GLES20.glBindTexture(3553, t01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, t01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        t01Var.C.recycle();
        t01Var.C = null;
        if (t01Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((t01) obj).a();
            }
            this.T.clear();
        }
        this.T.add(t01Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            AndroidUtilities.runOnUIThread(new s01(runnable, runnable2, 0));
            w01.b(this.d);
            this.d = null;
        } else {
            t01 t01Var = new t01(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.S = true;
            postRunnable(new r01(this, t01Var, 1));
        }
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (this.b.get()) {
            t01 t01Var = new t01(this, view, f7, runnable);
            getHandler();
            this.S = true;
            postRunnable(new r01(this, t01Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        q01 q01Var = this.d;
        if (q01Var != null) {
            AndroidUtilities.runOnUIThread(q01Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            t01 t01Var = new t01(this, arrayList, runnable);
            this.S = true;
            postRunnable(new r01(this, t01Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        q01 q01Var = this.d;
        if (q01Var != null) {
            AndroidUtilities.runOnUIThread(q01Var);
            this.d = null;
        }
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        if (this.b.get()) {
            GLES20.glClear(16384);
            int i13 = 0;
            int i14 = 0;
            while (i14 < this.T.size()) {
                t01 t01Var = (t01) this.T.get(i14);
                if (t01Var.d) {
                    ArrayList arrayList = this.T;
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        i15 += ((t01) arrayList.get(i16)).u;
                    }
                    float f7 = t01Var.u;
                    float f10 = f7 / i15;
                    int[] iArr = t01Var.B;
                    int i17 = t01Var.t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i18 = t01Var.E.a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (t01Var.D) {
                        i18 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    t01Var.s = Utilities.clamp((int) ((r4 * i17) / (max * max)), (int) (i18 * f10), 10);
                    float f11 = i17;
                    float f12 = f11 / f7;
                    int round = (int) Math.round(Math.sqrt(r4 / f12));
                    t01Var.w = round;
                    t01Var.v = Math.round(t01Var.s / round);
                    while (true) {
                        i10 = t01Var.v;
                        i11 = t01Var.w;
                        i12 = i10 * i11;
                        if (i12 >= t01Var.s) {
                            break;
                        } else if (i10 / i11 < f12) {
                            t01Var.v = i10 + 1;
                        } else {
                            t01Var.w = i11 + 1;
                        }
                    }
                    t01Var.s = i12;
                    t01Var.x = Math.max(f11 / i10, f7 / i11);
                    GLES20.glGenBuffers(2, iArr, i13);
                    for (int i19 = 0; i19 < 2; i19++) {
                        GLES20.glBindBuffer(34962, iArr[i19]);
                        GLES20.glBufferData(34962, t01Var.s * 28, null, 35048);
                    }
                    if (t01Var.e != null) {
                        this.U.add(t01Var);
                    }
                }
                this.V = true;
                int[] iArr2 = t01Var.B;
                boolean z10 = t01Var.D;
                float f13 = t01Var.m;
                int i20 = t01Var.u;
                int i21 = t01Var.t;
                Matrix matrix = t01Var.r;
                u01 u01Var = t01Var.E;
                long nanoTime = System.nanoTime();
                double d = t01Var.b < 0 ? 0.0d : (nanoTime - r7) / 1.0E9d;
                t01Var.b = nanoTime;
                if (t01Var.n && !t01Var.o) {
                    matrix.reset();
                    matrix.postScale(i21, i20);
                    matrix.postTranslate(t01Var.i, t01Var.j);
                    t01Var.c();
                }
                t01Var.c = (float) ((f13 * d) + t01Var.c);
                GLES20.glUniformMatrix3fv(u01Var.x, 1, false, t01Var.p, 0);
                GLES20.glUniform1f(u01Var.y, t01Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(u01Var.E, t01Var.c);
                GLES20.glUniform1f(u01Var.F, ((float) d) * f13);
                GLES20.glUniform1f(u01Var.G, t01Var.s);
                GLES20.glUniform3f(u01Var.I, t01Var.v, t01Var.w, t01Var.x);
                GLES20.glUniform2f(u01Var.P, t01Var.g, t01Var.h);
                GLES20.glUniform1f(u01Var.Q, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(u01Var.R, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(u01Var.J, i21, i20);
                GLES20.glUniform1f(u01Var.K, t01Var.y);
                GLES20.glUniform2f(u01Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(u01Var.N, t01Var.k);
                GLES20.glUniform1f(u01Var.O, t01Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, t01Var.A[0]);
                GLES20.glUniform1i(u01Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[t01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - t01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, t01Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                t01Var.d = false;
                t01Var.z = 1 - t01Var.z;
                if (t01Var.c > t01Var.l + (t01Var.D ? 2.0f : 0.9f)) {
                    t01Var.a();
                    this.T.remove(i14);
                    this.S = !this.T.isEmpty();
                    i14--;
                }
                i14++;
                i13 = 0;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    try {
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        for (int i22 = 0; i22 < this.U.size(); i22++) {
                            AndroidUtilities.runOnUIThread(((t01) this.U.get(i22)).e);
                        }
                        this.U.clear();
                        for (int i23 = 0; i23 < this.T.size(); i23++) {
                            ((t01) this.T.get(i23)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new ue(11));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            for (int i24 = 0; i24 < this.U.size(); i24++) {
                AndroidUtilities.runOnUIThread(((t01) this.U.get(i24)).e);
            }
            this.U.clear();
            if (this.T.isEmpty() && this.V) {
                j();
            }
        }
    }

    public final void h() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.n = eglGetDisplay;
        EGL10 egl102 = this.h;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            FileLog.e("ThanosEffect: eglDisplay == egl.EGL_NO_DISPLAY");
            j();
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            FileLog.e("ThanosEffect: failed eglInitialize");
            j();
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.h.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            FileLog.e("ThanosEffect: failed eglChooseConfig");
            i();
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.r = eGLConfig;
        EGLContext eglCreateContext = this.h.eglCreateContext(this.n, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        this.v = eglCreateContext;
        if (eglCreateContext == null) {
            FileLog.e("ThanosEffect: eglContext == null");
            j();
            return;
        }
        EGLSurface eglCreateWindowSurface = this.h.eglCreateWindowSurface(this.n, this.r, this.c, null);
        this.s = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null) {
            FileLog.e("ThanosEffect: eglSurface == null");
            j();
            return;
        }
        if (!this.h.eglMakeCurrent(this.n, eglCreateWindowSurface, eglCreateWindowSurface, this.v)) {
            FileLog.e("ThanosEffect: failed eglMakeCurrent");
            j();
            return;
        }
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        if (glCreateShader == 0 || glCreateShader2 == 0) {
            FileLog.e("ThanosEffect: vertexShader == 0 || fragmentShader == 0");
            j();
            return;
        }
        GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.thanos_vertex));
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            j();
            return;
        }
        GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.thanos_fragment));
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
            GLES20.glDeleteShader(glCreateShader2);
            j();
            return;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.w = glCreateProgram;
        if (glCreateProgram == 0) {
            FileLog.e("ThanosEffect: drawProgram == 0");
            j();
            return;
        }
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(this.w, glCreateShader2);
        GLES30.glTransformFeedbackVaryings(this.w, new String[]{"outUV", "outPosition", "outVelocity", "outTime"}, 35980);
        GLES20.glLinkProgram(this.w);
        GLES20.glGetProgramiv(this.w, 35714, iArr, 0);
        if (iArr[0] != 1) {
            FileLog.e("ThanosEffect, link program error: " + GLES20.glGetProgramInfoLog(this.w));
            j();
            return;
        }
        this.x = GLES20.glGetUniformLocation(this.w, "matrix");
        this.J = GLES20.glGetUniformLocation(this.w, "rectSize");
        this.L = GLES20.glGetUniformLocation(this.w, "rectPos");
        this.y = GLES20.glGetUniformLocation(this.w, "reset");
        this.E = GLES20.glGetUniformLocation(this.w, "time");
        this.F = GLES20.glGetUniformLocation(this.w, "deltaTime");
        this.G = GLES20.glGetUniformLocation(this.w, "particlesCount");
        this.H = GLES20.glGetUniformLocation(this.w, "size");
        this.I = GLES20.glGetUniformLocation(this.w, "gridSize");
        this.M = GLES20.glGetUniformLocation(this.w, "tex");
        this.K = GLES20.glGetUniformLocation(this.w, "seed");
        this.N = GLES20.glGetUniformLocation(this.w, "dp");
        this.O = GLES20.glGetUniformLocation(this.w, "longevity");
        this.P = GLES20.glGetUniformLocation(this.w, "offset");
        this.Q = GLES20.glGetUniformLocation(this.w, "scale");
        this.R = GLES20.glGetUniformLocation(this.w, "uvOffset");
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.w);
        GLES20.glUniform2f(this.H, this.e, this.f);
    }

    @Override // org.telegram.messenger.DispatchQueue
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            g();
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
            g();
            return;
        }
        if (i10 == 2) {
            j();
            return;
        }
        if (i10 == 3) {
            b((t01) message.obj);
            return;
        }
        ArrayList arrayList = this.T;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                t01 t01Var = (t01) arrayList.get(i11);
                t01Var.g += message.arg1;
                t01Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            t01 t01Var2 = (t01) arrayList.get(i11);
            if (t01Var2.a.contains(view)) {
                t01Var2.a();
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void i() {
        if (!this.b.get()) {
            FileLog.d("ThanosEffect: kill failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: kill");
        try {
            Handler handler = getHandler();
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(2));
            }
        } catch (Exception unused) {
        }
    }

    public final void j() {
        ArrayList arrayList;
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            FileLog.d("ThanosEffect: killInternal failed, already dead");
            return;
        }
        FileLog.d("ThanosEffect: killInternal");
        int i10 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.T;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((t01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        w01.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.W;
        int i10 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    b((t01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e7) {
            FileLog.e(e7);
            while (i10 < arrayList.size()) {
                t01 t01Var = (t01) arrayList.get(i10);
                Runnable runnable = t01Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                t01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new ue(10));
            j();
        }
    }
}
