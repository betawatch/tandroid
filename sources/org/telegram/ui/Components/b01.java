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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b01 extends DispatchQueue {
    public int A;
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
    public volatile boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public boolean R;
    public final ArrayList S;
    public boolean a;
    public final AtomicBoolean b;
    public final SurfaceTexture c;
    public yz0 d;
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

    public b01(SurfaceTexture surfaceTexture, yz0 yz0Var, yz0 yz0Var2, int i9, int i10) {
        super("ThanosEffect.DrawingThread", false);
        this.b = new AtomicBoolean(true);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = false;
        this.S = new ArrayList();
        this.c = surfaceTexture;
        this.d = yz0Var2;
        this.e = i9;
        this.f = i10;
        start();
    }

    public final void b(a01 a01Var) {
        int i9 = 0;
        GLES20.glGenTextures(1, a01Var.A, 0);
        GLES20.glBindTexture(3553, a01Var.A[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, a01Var.C, 0);
        GLES20.glBindTexture(3553, 0);
        a01Var.C.recycle();
        a01Var.C = null;
        if (a01Var.D) {
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ((a01) obj).a();
            }
            this.P.clear();
        }
        this.P.add(a01Var);
        this.O = true;
    }

    public final void c(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        if (!this.b.get()) {
            AndroidUtilities.runOnUIThread(new gh.o8(runnable, runnable2, 1));
            d01.b(this.d);
            this.d = null;
        } else {
            a01 a01Var = new a01(this, matrix, bitmap, runnable, runnable2);
            getHandler();
            this.O = true;
            postRunnable(new zz0(this, a01Var, 1));
        }
    }

    public final void e(View view, float f10, Runnable runnable) {
        if (this.b.get()) {
            a01 a01Var = new a01(this, view, f10, runnable);
            getHandler();
            this.O = true;
            postRunnable(new zz0(this, a01Var, 2));
            return;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        yz0 yz0Var = this.d;
        if (yz0Var != null) {
            AndroidUtilities.runOnUIThread(yz0Var);
            this.d = null;
        }
    }

    public final void f(ArrayList arrayList, Runnable runnable) {
        if (this.b.get()) {
            a01 a01Var = new a01(this, arrayList, runnable);
            this.O = true;
            postRunnable(new zz0(this, a01Var, 0));
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((View) arrayList.get(i9)).setVisibility(8);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        yz0 yz0Var = this.d;
        if (yz0Var != null) {
            AndroidUtilities.runOnUIThread(yz0Var);
            this.d = null;
        }
    }

    public final void g() {
        int i9;
        int i10;
        int i11;
        if (this.b.get()) {
            GLES20.glClear(16384);
            int i12 = 0;
            int i13 = 0;
            while (i13 < this.P.size()) {
                a01 a01Var = (a01) this.P.get(i13);
                if (a01Var.d) {
                    ArrayList arrayList = this.P;
                    int i14 = 0;
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        i14 += ((a01) arrayList.get(i15)).u;
                    }
                    float f10 = a01Var.u;
                    float f11 = f10 / i14;
                    int[] iArr = a01Var.B;
                    int i16 = a01Var.t;
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int i17 = a01Var.E.a ? 120000 : devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 30000 : 120000 : 60000;
                    if (a01Var.D) {
                        i17 /= 2;
                    }
                    float max = Math.max(AndroidUtilities.dpf2(0.4f), 1.0f);
                    a01Var.s = Utilities.clamp((int) ((r4 * i16) / (max * max)), (int) (i17 * f11), 10);
                    float f12 = i16;
                    float f13 = f12 / f10;
                    int round = (int) Math.round(Math.sqrt(r4 / f13));
                    a01Var.w = round;
                    a01Var.v = Math.round(a01Var.s / round);
                    while (true) {
                        i9 = a01Var.v;
                        i10 = a01Var.w;
                        i11 = i9 * i10;
                        if (i11 >= a01Var.s) {
                            break;
                        } else if (i9 / i10 < f13) {
                            a01Var.v = i9 + 1;
                        } else {
                            a01Var.w = i10 + 1;
                        }
                    }
                    a01Var.s = i11;
                    a01Var.x = Math.max(f12 / i9, f10 / i10);
                    GLES20.glGenBuffers(2, iArr, i12);
                    for (int i18 = 0; i18 < 2; i18++) {
                        GLES20.glBindBuffer(34962, iArr[i18]);
                        GLES20.glBufferData(34962, a01Var.s * 28, null, 35048);
                    }
                    if (a01Var.e != null) {
                        this.Q.add(a01Var);
                    }
                }
                this.R = true;
                int[] iArr2 = a01Var.B;
                boolean z10 = a01Var.D;
                float f14 = a01Var.m;
                int i19 = a01Var.u;
                int i20 = a01Var.t;
                Matrix matrix = a01Var.r;
                b01 b01Var = a01Var.E;
                long nanoTime = System.nanoTime();
                double d = a01Var.b < 0 ? 0.0d : (nanoTime - r7) / 1.0E9d;
                a01Var.b = nanoTime;
                if (a01Var.n && !a01Var.o) {
                    matrix.reset();
                    matrix.postScale(i20, i19);
                    matrix.postTranslate(a01Var.i, a01Var.j);
                    a01Var.c();
                }
                a01Var.c = (float) ((f14 * d) + a01Var.c);
                GLES20.glUniformMatrix3fv(b01Var.x, 1, false, a01Var.p, 0);
                GLES20.glUniform1f(b01Var.y, a01Var.d ? 1.0f : 0.0f);
                GLES20.glUniform1f(b01Var.A, a01Var.c);
                GLES20.glUniform1f(b01Var.B, ((float) d) * f14);
                GLES20.glUniform1f(b01Var.C, a01Var.s);
                GLES20.glUniform3f(b01Var.E, a01Var.v, a01Var.w, a01Var.x);
                GLES20.glUniform2f(b01Var.L, a01Var.g, a01Var.h);
                GLES20.glUniform1f(b01Var.M, z10 ? 0.8f : 1.0f);
                GLES20.glUniform1f(b01Var.N, z10 ? 1.0f : 0.6f);
                GLES20.glUniform2f(b01Var.F, i20, i19);
                GLES20.glUniform1f(b01Var.G, a01Var.y);
                GLES20.glUniform2f(b01Var.H, 0.0f, 0.0f);
                GLES20.glUniform1f(b01Var.J, a01Var.k);
                GLES20.glUniform1f(b01Var.K, a01Var.l);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, a01Var.A[0]);
                GLES20.glUniform1i(b01Var.I, 0);
                GLES20.glBindBuffer(34962, iArr2[a01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBindBufferBase(35982, 0, iArr2[1 - a01Var.z]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 28, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 28, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 2, 5126, false, 28, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 28, 24);
                GLES20.glEnableVertexAttribArray(3);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, a01Var.s);
                GLES30.glEndTransformFeedback();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(35982, 0);
                a01Var.d = false;
                a01Var.z = 1 - a01Var.z;
                if (a01Var.c > a01Var.l + (a01Var.D ? 2.0f : 0.9f)) {
                    a01Var.a();
                    this.P.remove(i13);
                    this.O = !this.P.isEmpty();
                    i13--;
                }
                i13++;
                i12 = 0;
            }
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    try {
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        for (int i21 = 0; i21 < this.Q.size(); i21++) {
                            AndroidUtilities.runOnUIThread(((a01) this.Q.get(i21)).e);
                        }
                        this.Q.clear();
                        for (int i22 = 0; i22 < this.P.size(); i22++) {
                            ((a01) this.P.get(i22)).a();
                        }
                        this.P.clear();
                        AndroidUtilities.runOnUIThread(new hc(15));
                        j();
                        return;
                    }
                }
                FileLog.e("thanos gles error " + glGetError);
            }
            this.h.eglSwapBuffers(this.n, this.s);
            for (int i23 = 0; i23 < this.Q.size(); i23++) {
                AndroidUtilities.runOnUIThread(((a01) this.Q.get(i23)).e);
            }
            this.Q.clear();
            if (this.P.isEmpty() && this.R) {
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
        this.F = GLES20.glGetUniformLocation(this.w, "rectSize");
        this.H = GLES20.glGetUniformLocation(this.w, "rectPos");
        this.y = GLES20.glGetUniformLocation(this.w, "reset");
        this.A = GLES20.glGetUniformLocation(this.w, "time");
        this.B = GLES20.glGetUniformLocation(this.w, "deltaTime");
        this.C = GLES20.glGetUniformLocation(this.w, "particlesCount");
        this.D = GLES20.glGetUniformLocation(this.w, "size");
        this.E = GLES20.glGetUniformLocation(this.w, "gridSize");
        this.I = GLES20.glGetUniformLocation(this.w, "tex");
        this.G = GLES20.glGetUniformLocation(this.w, "seed");
        this.J = GLES20.glGetUniformLocation(this.w, "dp");
        this.K = GLES20.glGetUniformLocation(this.w, "longevity");
        this.L = GLES20.glGetUniformLocation(this.w, "offset");
        this.M = GLES20.glGetUniformLocation(this.w, "scale");
        this.N = GLES20.glGetUniformLocation(this.w, "uvOffset");
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glUseProgram(this.w);
        GLES20.glUniform2f(this.D, this.e, this.f);
    }

    @Override // org.telegram.messenger.DispatchQueue
    public final void handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            g();
            return;
        }
        int i10 = 0;
        if (i9 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            if (this.b.get()) {
                this.e = i11;
                this.f = i12;
                GLES20.glViewport(0, 0, i11, i12);
                GLES20.glUniform2f(this.D, i11, i12);
            }
            g();
            return;
        }
        if (i9 == 2) {
            j();
            return;
        }
        if (i9 == 3) {
            b((a01) message.obj);
            return;
        }
        ArrayList arrayList = this.P;
        if (i9 == 4) {
            while (i10 < arrayList.size()) {
                a01 a01Var = (a01) arrayList.get(i10);
                a01Var.g += message.arg1;
                a01Var.h += message.arg2;
                i10++;
            }
            return;
        }
        if (i9 != 5) {
            return;
        }
        View view = (View) message.obj;
        while (i10 < arrayList.size()) {
            a01 a01Var2 = (a01) arrayList.get(i10);
            if (a01Var2.a.contains(view)) {
                a01Var2.a();
                arrayList.remove(i10);
                i10--;
            }
            i10++;
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
        int i9 = 0;
        atomicBoolean.set(false);
        while (true) {
            arrayList = this.P;
            if (i9 >= arrayList.size()) {
                break;
            }
            ((a01) arrayList.get(i9)).a();
            i9++;
        }
        arrayList.clear();
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        d01.b(this.d);
        this.d = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.S;
        int i9 = 0;
        try {
            h();
            if (!arrayList.isEmpty()) {
                while (i9 < arrayList.size()) {
                    b((a01) arrayList.get(i9));
                    i9++;
                }
                arrayList.clear();
            }
            super.run();
        } catch (Exception e10) {
            FileLog.e(e10);
            while (i9 < arrayList.size()) {
                a01 a01Var = (a01) arrayList.get(i9);
                Runnable runnable = a01Var.e;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                a01Var.a();
                i9++;
            }
            arrayList.clear();
            AndroidUtilities.runOnUIThread(new hc(14));
            j();
        }
    }
}
