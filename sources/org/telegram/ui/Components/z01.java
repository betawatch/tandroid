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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z01 extends DispatchQueue {
    public int B;
    public int C;
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
    public volatile boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public final ArrayList T;
    public boolean a;
    public final AtomicBoolean b;
    public final SurfaceTexture c;
    public w01 d;
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

    public z01(SurfaceTexture surfaceTexture, w01 w01Var, w01 w01Var2, int i10, int i11) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = false;
        this.T = new ArrayList();
        this.c = surfaceTexture;
        this.d = w01Var2;
        this.e = i10;
        this.f = i11;
        start();
    }

    public final void b(y01 y01Var) {
        int i10 = 0;
        GLES20.glGenTextures(1, y01Var.A, 0);
        GLES20.glBindTexture(3553, y01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, y01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        y01Var.C.recycle();
        y01Var.C = null;
        if (y01Var.D) {
            ArrayList arrayList = this.Q;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((y01) obj).a();
            }
            this.Q.clear();
        }
        this.Q.add(y01Var);
        this.P = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            AndroidUtilities.runOnUIThread(new mh.l8(runnable, runnable2, 1));
            b11.b(this.d);
            this.d = null;
        } else {
            y01 y01Var = new y01(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.P = true;
            postRunnable(new x01(this, y01Var, 1));
        }
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (this.b.get()) {
            y01 y01Var = new y01(this, view, f10, runnable);
            getHandler();
            this.P = true;
            postRunnable(new x01(this, y01Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        w01 w01Var = this.d;
        if (w01Var != null) {
            AndroidUtilities.runOnUIThread(w01Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            y01 y01Var = new y01(this, arrayList, runnable);
            this.P = true;
            postRunnable(new x01(this, y01Var, 0));
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        w01 w01Var = this.d;
        if (w01Var != null) {
            AndroidUtilities.runOnUIThread(w01Var);
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
            while (i14 < this.Q.size()) {
                y01 y01Var = (y01) this.Q.get(i14);
                if (y01Var.d) {
                    ArrayList arrayList = this.Q;
                    int i15 = 0;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        i15 += ((y01) arrayList.get(i16)).u;
                    }
                    float f10 = y01Var.u;
                    float f11 = f10 / i15;
                    int[] iArr = y01Var.B;
                    int i17 = y01Var.t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i18 = y01Var.E.a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (y01Var.D) {
                        i18 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    y01Var.s = Utilities.clamp((int) ((r4 * i17) / (max * max)), (int) (i18 * f11), 10);
                    float f12 = i17;
                    float f13 = f12 / f10;
                    int round = (int) Math.round(Math.sqrt(r4 / f13));
                    y01Var.w = round;
                    y01Var.v = Math.round(y01Var.s / round);
                    while (true) {
                        i10 = y01Var.v;
                        i11 = y01Var.w;
                        i12 = i10 * i11;
                        if (i12 >= y01Var.s) {
                            break;
                        } else if (i10 / i11 < f13) {
                            y01Var.v = i10 + 1;
                        } else {
                            y01Var.w = i11 + 1;
                        }
                    }
                    y01Var.s = i12;
                    y01Var.x = Math.max(f12 / i10, f10 / i11);
                    GLES20.glGenBuffers(2, iArr, i13);
                    for (int i19 = 0; i19 < 2; i19++) {
                        GLES20.glBindBuffer(34962, iArr[i19]);
                        GLES20.glBufferData(34962, y01Var.s * 28, null, 35048);
                    }
                    if (y01Var.e != null) {
                        this.R.add(y01Var);
                    }
                }
                this.S = true;
                int[] iArr2 = y01Var.B;
                boolean z4 = y01Var.D;
                float f14 = y01Var.m;
                int i20 = y01Var.u;
                int i21 = y01Var.t;
                Matrix matrix = y01Var.r;
                z01 z01Var = y01Var.E;
                long nanoTime = System.nanoTime();
                double d = y01Var.b < 0 ? 0.0d : (nanoTime - r7) / 1.0E9d;
                y01Var.b = nanoTime;
                if (y01Var.n && !y01Var.o) {
                    matrix.reset();
                    matrix.postScale(i21, i20);
                    matrix.postTranslate(y01Var.i, y01Var.j);
                    y01Var.c();
                }
                y01Var.c = (float) ((f14 * d) + y01Var.c);
                GLES20.glUniformMatrix3fv(z01Var.x, 1, false, y01Var.p, 0);
                GLES20.glUniform1f(z01Var.y, y01Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(z01Var.B, y01Var.c);
                GLES20.glUniform1f(z01Var.C, ((float) d) * f14);
                GLES20.glUniform1f(z01Var.D, y01Var.s);
                GLES20.glUniform3f(z01Var.F, y01Var.v, y01Var.w, y01Var.x);
                GLES20.glUniform2f(z01Var.M, y01Var.g, y01Var.h);
                GLES20.glUniform1f(z01Var.N, z4 ? 0.8f : 1.0f);
                GLES20.glUniform1f(z01Var.O, z4 ? 1.0f : 0.6f);
                GLES20.glUniform2f(z01Var.G, i21, i20);
                GLES20.glUniform1f(z01Var.H, y01Var.y);
                GLES20.glUniform2f(z01Var.I, 0.0f, 0.0f);
                GLES20.glUniform1f(z01Var.K, y01Var.k);
                GLES20.glUniform1f(z01Var.L, y01Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, y01Var.A[0]);
                GLES20.glUniform1i(z01Var.J, 0);
                GLES20.glBindBuffer(34962, iArr2[y01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - y01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, y01Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                y01Var.d = false;
                y01Var.z = 1 - y01Var.z;
                if (y01Var.c > y01Var.l + (y01Var.D ? 2.0f : 0.9f)) {
                    y01Var.a();
                    this.Q.remove(i14);
                    this.P = !this.Q.isEmpty();
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        for (int i22 = 0; i22 < this.R.size(); i22++) {
                            AndroidUtilities.runOnUIThread(((y01) this.R.get(i22)).e);
                        }
                        this.R.clear();
                        for (int i23 = 0; i23 < this.Q.size(); i23++) {
                            ((y01) this.Q.get(i23)).a();
                        }
                        this.Q.clear();
                        AndroidUtilities.runOnUIThread(new jc(15));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            for (int i24 = 0; i24 < this.R.size(); i24++) {
                AndroidUtilities.runOnUIThread(((y01) this.R.get(i24)).e);
            }
            this.R.clear();
            if (this.Q.isEmpty() && this.S) {
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
        this.G = GLES20.glGetUniformLocation(this.w, "rectSize");
        this.I = GLES20.glGetUniformLocation(this.w, "rectPos");
        this.y = GLES20.glGetUniformLocation(this.w, "reset");
        this.B = GLES20.glGetUniformLocation(this.w, "time");
        this.C = GLES20.glGetUniformLocation(this.w, "deltaTime");
        this.D = GLES20.glGetUniformLocation(this.w, "particlesCount");
        this.E = GLES20.glGetUniformLocation(this.w, "size");
        this.F = GLES20.glGetUniformLocation(this.w, "gridSize");
        this.J = GLES20.glGetUniformLocation(this.w, "tex");
        this.H = GLES20.glGetUniformLocation(this.w, "seed");
        this.K = GLES20.glGetUniformLocation(this.w, "dp");
        this.L = GLES20.glGetUniformLocation(this.w, "longevity");
        this.M = GLES20.glGetUniformLocation(this.w, "offset");
        this.N = GLES20.glGetUniformLocation(this.w, "scale");
        this.O = GLES20.glGetUniformLocation(this.w, "uvOffset");
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.w);
        GLES20.glUniform2f(this.E, this.e, this.f);
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
                GLES20.glUniform2f(this.E, i12, i13);
            }
            g();
            return;
        }
        if (i10 == 2) {
            j();
            return;
        }
        if (i10 == 3) {
            b((y01) message.obj);
            return;
        }
        ArrayList arrayList = this.Q;
        if (i10 == 4) {
            while (i11 < arrayList.size()) {
                y01 y01Var = (y01) arrayList.get(i11);
                y01Var.g += message.arg1;
                y01Var.h += message.arg2;
                i11++;
            }
            return;
        }
        if (i10 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i11 < arrayList.size()) {
            y01 y01Var2 = (y01) arrayList.get(i11);
            if (y01Var2.a.contains(view)) {
                y01Var2.a();
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
            arrayList = this.Q;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((y01) arrayList.get(i10)).a();
            i10++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        b11.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.T;
        int i10 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i10 < arrayList.size()) {
                    b((y01) arrayList.get(i10));
                    i10++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e6) {
            FileLog.e(e6);
            while (i10 < arrayList.size()) {
                y01 y01Var = (y01) arrayList.get(i10);
                Runnable runnable = y01Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                y01Var.a();
                i10++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new jc(14));
            j();
        }
    }
}
