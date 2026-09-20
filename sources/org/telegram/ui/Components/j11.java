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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j11 extends DispatchQueue {
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
    public f11 d;
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

    public j11(SurfaceTexture surfaceTexture, f11 f11Var, f11 f11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.c = surfaceTexture;
        this.d = f11Var2;
        this.e = i10;
        this.f = i11;
        start();
    }

    public final void b(i11 i11Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, i11Var.A, 0);
        GLES20.glBindTexture(3553, i11Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, i11Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        i11Var.C.recycle();
        i11Var.C = null;
        if (i11Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((i11) obj).a();
            }
            this.T.clear();
        }
        this.T.add(i11Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            AndroidUtilities.runOnUIThread(new h11(runnable, runnable2, 0));
            l11.b(this.d);
            this.d = null;
        } else {
            i11 i11Var = new i11(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.S = true;
            postRunnable(new g11(this, i11Var, 1));
        }
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (this.b.get()) {
            i11 i11Var = new i11(this, view, f7, runnable);
            getHandler();
            this.S = true;
            postRunnable(new g11(this, i11Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        f11 f11Var = this.d;
        if (f11Var != null) {
            AndroidUtilities.runOnUIThread(f11Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            i11 i11Var = new i11(this, arrayList, runnable);
            this.S = true;
            postRunnable(new g11(this, i11Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        f11 f11Var = this.d;
        if (f11Var != null) {
            AndroidUtilities.runOnUIThread(f11Var);
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
                i11 i11Var = (i11) this.T.get(i14);
                if (i11Var.d) {
                    ArrayList arrayList = this.T;
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        i15 += ((i11) arrayList.get(i16)).u;
                    }
                    float f7 = i11Var.u;
                    float f10 = f7 / i15;
                    int[] iArr = i11Var.B;
                    int i17 = i11Var.t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i18 = i11Var.E.a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (i11Var.D) {
                        i18 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    i11Var.s = Utilities.clamp((int) ((r4 * i17) / (max * max)), (int) (i18 * f10), 10);
                    float f11 = i17;
                    float f12 = f11 / f7;
                    int round = (int) Math.round(Math.sqrt(r4 / f12));
                    i11Var.w = round;
                    i11Var.v = Math.round(i11Var.s / round);
                    while (true) {
                        i10 = i11Var.v;
                        i11 = i11Var.w;
                        i12 = i10 * i11;
                        if (i12 >= i11Var.s) {
                            break;
                        } else if (i10 / i11 < f12) {
                            i11Var.v = i10 + 1;
                        } else {
                            i11Var.w = i11 + 1;
                        }
                    }
                    i11Var.s = i12;
                    i11Var.x = Math.max(f11 / i10, f7 / i11);
                    GLES20.glGenBuffers(2, iArr, i13);
                    for (int i19 = 0; i19 < 2; i19++) {
                        GLES20.glBindBuffer(34962, iArr[i19]);
                        GLES20.glBufferData(34962, i11Var.s * 28, null, 35048);
                    }
                    if (i11Var.e != null) {
                        this.U.add(i11Var);
                    }
                }
                this.V = true;
                int[] iArr2 = i11Var.B;
                boolean z10 = i11Var.D;
                float f13 = i11Var.m;
                int i20 = i11Var.u;
                int i21 = i11Var.t;
                Matrix matrix = i11Var.r;
                j11 j11Var = i11Var.E;
                long nanoTime = System.nanoTime();
                double d = i11Var.b < 0 ? 0.0d : (nanoTime - r7) / 1.0E9d;
                i11Var.b = nanoTime;
                if (i11Var.n && !i11Var.o) {
                    matrix.reset();
                    matrix.postScale(i21, i20);
                    matrix.postTranslate(i11Var.i, i11Var.j);
                    i11Var.c();
                }
                i11Var.c = (float) ((f13 * d) + i11Var.c);
                GLES20.glUniformMatrix3fv(j11Var.x, 1, false, i11Var.p, 0);
                GLES20.glUniform1f(j11Var.y, i11Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(j11Var.E, i11Var.c);
                GLES20.glUniform1f(j11Var.F, ((float) d) * f13);
                GLES20.glUniform1f(j11Var.G, i11Var.s);
                GLES20.glUniform3f(j11Var.I, i11Var.v, i11Var.w, i11Var.x);
                GLES20.glUniform2f(j11Var.P, i11Var.g, i11Var.h);
                GLES20.glUniform1f(j11Var.Q, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(j11Var.R, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(j11Var.J, i21, i20);
                GLES20.glUniform1f(j11Var.K, i11Var.y);
                GLES20.glUniform2f(j11Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(j11Var.N, i11Var.k);
                GLES20.glUniform1f(j11Var.O, i11Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i11Var.A[0]);
                GLES20.glUniform1i(j11Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[i11Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - i11Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, i11Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                i11Var.d = false;
                i11Var.z = 1 - i11Var.z;
                if (i11Var.c > i11Var.l + (i11Var.D ? 2.0f : 0.9f)) {
                    i11Var.a();
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        for (int i22 = 0; i22 < this.U.size(); i22++) {
                            AndroidUtilities.runOnUIThread(((i11) this.U.get(i22)).e);
                        }
                        this.U.clear();
                        for (int i23 = 0; i23 < this.T.size(); i23++) {
                            ((i11) this.T.get(i23)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new sh(12));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            for (int i24 = 0; i24 < this.U.size(); i24++) {
                AndroidUtilities.runOnUIThread(((i11) this.U.get(i24)).e);
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
            b((i11) message.obj);
            return;
        }
        ArrayList arrayList = this.T;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                i11 i11Var = (i11) arrayList.get(i11);
                i11Var.g += message.arg1;
                i11Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            i11 i11Var2 = (i11) arrayList.get(i11);
            if (i11Var2.a.contains(view)) {
                i11Var2.a();
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
            ((i11) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        l11.b(this.d);
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
                    b((i11) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e) {
            FileLog.e(e);
            while (i10 < arrayList.size()) {
                i11 i11Var = (i11) arrayList.get(i10);
                Runnable runnable = i11Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                i11Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new sh(11));
            j();
        }
    }
}
