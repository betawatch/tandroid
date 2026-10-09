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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a21 extends DispatchQueue {
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
    public w11 d;
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

    public a21(SurfaceTexture surfaceTexture, w11 w11Var, w11 w11Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new ArrayList();
        this.c = surfaceTexture;
        this.d = w11Var2;
        this.e = i10;
        this.f = i11;
        start();
    }

    public final void b(z11 z11Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, z11Var.A, 0);
        GLES20.glBindTexture(3553, z11Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, z11Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        z11Var.C.recycle();
        z11Var.C = null;
        if (z11Var.D) {
            ArrayList arrayList = this.T;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((z11) obj).a();
            }
            this.T.clear();
        }
        this.T.add(z11Var);
        this.S = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            AndroidUtilities.runOnUIThread(new y11(runnable, runnable2, 0));
            c21.b(this.d);
            this.d = null;
        } else {
            z11 z11Var = new z11(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.S = true;
            postRunnable(new x11(this, z11Var, 1));
        }
    }

    public final void e(View view, float f7, Runnable runnable) {
        if (this.b.get()) {
            z11 z11Var = new z11(this, view, f7, runnable);
            getHandler();
            this.S = true;
            postRunnable(new x11(this, z11Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        w11 w11Var = this.d;
        if (w11Var != null) {
            AndroidUtilities.runOnUIThread(w11Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            z11 z11Var = new z11(this, arrayList, runnable);
            this.S = true;
            postRunnable(new x11(this, z11Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        w11 w11Var = this.d;
        if (w11Var != null) {
            AndroidUtilities.runOnUIThread(w11Var);
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
                z11 z11Var = (z11) this.T.get(i14);
                if (z11Var.d) {
                    ArrayList arrayList = this.T;
                    int i15 = i13;
                    int i16 = i15;
                    while (i15 < arrayList.size()) {
                        i16 += ((z11) arrayList.get(i15)).u;
                        i15++;
                    }
                    float f7 = z11Var.u;
                    float f10 = f7 / i16;
                    int[] iArr = z11Var.B;
                    int i17 = z11Var.t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i18 = z11Var.E.a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (z11Var.D) {
                        i18 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    z11Var.s = Utilities.clamp((int) ((r4 * i17) / (max * max)), (int) (i18 * f10), 10);
                    float f11 = i17;
                    float f12 = f11 / f7;
                    int round = (int) Math.round(Math.sqrt(r4 / f12));
                    z11Var.w = round;
                    z11Var.v = Math.round(z11Var.s / round);
                    while (true) {
                        i10 = z11Var.v;
                        i11 = z11Var.w;
                        i12 = i10 * i11;
                        if (i12 >= z11Var.s) {
                            break;
                        } else if (i10 / i11 < f12) {
                            z11Var.v = i10 + 1;
                        } else {
                            z11Var.w = i11 + 1;
                        }
                    }
                    z11Var.s = i12;
                    z11Var.x = Math.max(f11 / i10, f7 / i11);
                    GLES20.glGenBuffers(2, iArr, i13);
                    for (int i19 = i13; i19 < 2; i19++) {
                        GLES20.glBindBuffer(34962, iArr[i19]);
                        GLES20.glBufferData(34962, z11Var.s * 28, null, 35048);
                    }
                    if (z11Var.e != null) {
                        this.U.add(z11Var);
                    }
                }
                this.V = true;
                int[] iArr2 = z11Var.B;
                boolean z10 = z11Var.D;
                float f13 = z11Var.m;
                int i20 = z11Var.u;
                int i21 = z11Var.t;
                Matrix matrix = z11Var.r;
                a21 a21Var = z11Var.E;
                long nanoTime = System.nanoTime();
                double d = z11Var.b < 0 ? 0.0d : (nanoTime - r7) / 1.0E9d;
                z11Var.b = nanoTime;
                if (z11Var.n && !z11Var.o) {
                    matrix.reset();
                    matrix.postScale(i21, i20);
                    matrix.postTranslate(z11Var.i, z11Var.j);
                    z11Var.c();
                }
                z11Var.c = (float) ((f13 * d) + z11Var.c);
                GLES20.glUniformMatrix3fv(a21Var.x, 1, false, z11Var.p, 0);
                GLES20.glUniform1f(a21Var.y, z11Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(a21Var.E, z11Var.c);
                GLES20.glUniform1f(a21Var.F, ((float) d) * f13);
                GLES20.glUniform1f(a21Var.G, z11Var.s);
                GLES20.glUniform3f(a21Var.I, z11Var.v, z11Var.w, z11Var.x);
                GLES20.glUniform2f(a21Var.P, z11Var.g, z11Var.h);
                GLES20.glUniform1f(a21Var.Q, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(a21Var.R, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(a21Var.J, i21, i20);
                GLES20.glUniform1f(a21Var.K, z11Var.y);
                GLES20.glUniform2f(a21Var.L, 0.0f, 0.0f);
                GLES20.glUniform1f(a21Var.N, z11Var.k);
                GLES20.glUniform1f(a21Var.O, z11Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, z11Var.A[0]);
                GLES20.glUniform1i(a21Var.M, 0);
                GLES20.glBindBuffer(34962, iArr2[z11Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - z11Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, z11Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                z11Var.d = false;
                z11Var.z = 1 - z11Var.z;
                if (z11Var.c > z11Var.l + (z11Var.D ? 2.0f : 0.9f)) {
                    z11Var.a();
                    this.T.remove(i14);
                    this.S = !this.T.isEmpty();
                    i14--;
                }
                i14++;
                i13 = 0;
            }
            int i22 = i13;
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    try {
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        for (int i23 = i22; i23 < this.U.size(); i23++) {
                            AndroidUtilities.runOnUIThread(((z11) this.U.get(i23)).e);
                        }
                        this.U.clear();
                        for (int i24 = i22; i24 < this.T.size(); i24++) {
                            ((z11) this.T.get(i24)).a();
                        }
                        this.T.clear();
                        AndroidUtilities.runOnUIThread(new vh(12));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            for (int i25 = i22; i25 < this.U.size(); i25++) {
                AndroidUtilities.runOnUIThread(((z11) this.U.get(i25)).e);
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
            b((z11) message.obj);
            return;
        }
        ArrayList arrayList = this.T;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                z11 z11Var = (z11) arrayList.get(i11);
                z11Var.g += message.arg1;
                z11Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            z11 z11Var2 = (z11) arrayList.get(i11);
            if (z11Var2.a.contains(view)) {
                z11Var2.a();
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
            ((z11) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        c21.b(this.d);
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
                    b((z11) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e7) {
            FileLog.e(e7);
            while (i10 < arrayList.size()) {
                z11 z11Var = (z11) arrayList.get(i10);
                Runnable runnable = z11Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                z11Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new vh(11));
            j();
        }
    }
}
