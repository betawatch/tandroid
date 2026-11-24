// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class er4 extends TextureView implements TextureView.SurfaceTextureListener, tjb {
    public volatile int E;
    public int F;
    public int G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public volatile dr4 K;
    public final int L;
    public final short M;
    public boolean N;
    public final byte O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public cra S;
    public final byte T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean a;
    public volatile boolean a0;
    public uq4 b;
    public volatile Runnable b0;
    public SurfaceTexture c;
    public final GestureDetector c0;
    public final Object d;
    public ValueAnimator d0;
    public uq4 e;
    public AnimatorSet e0;
    public EGLDisplay f;
    public final ar4 f0;
    public final wq4 g0;
    public EGLSurface h;
    public final wq4 h0;
    public final wq4 i0;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 w;
    public long x;
    public volatile int y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v5, types: [wq4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [wq4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [wq4] */
    public er4(Context context, int i, int i2) {
        super(context);
        this.d = new Object();
        this.H = true;
        int i3 = 0;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Q = new ArrayList();
        this.V = new int[1];
        this.W = new int[1];
        this.e0 = new AnimatorSet();
        final byte b = 0;
        this.f0 = new ar4(this, (byte) 0);
        this.g0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wq4
            public final /* synthetic */ er4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                er4 er4Var = this.b;
                switch (b2) {
                    case 0:
                        er4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        er4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        er4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.h0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wq4
            public final /* synthetic */ er4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b22 = b2;
                er4 er4Var = this.b;
                switch (b22) {
                    case 0:
                        er4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        er4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        er4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.i0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wq4
            public final /* synthetic */ er4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b22 = b3;
                er4 er4Var = this.b;
                switch (b22) {
                    case 0:
                        er4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        er4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        er4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.T = i2;
        this.O = (i2 == 1 || i2 == 4 || i2 == 3) ? (byte) 1 : (byte) 5;
        this.M = (int) (i2 == 4 ? 0L : 2000L);
        setOpaque(false);
        setRenderer(new uq4(context, i, i2));
        this.L = (int) gl.r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new zq4(this, i2));
        this.c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (true) {
            byte b4 = this.O;
            ArrayList arrayList = this.Q;
            if (i3 >= b4) {
                Collections.shuffle(arrayList);
                return;
            }
            i3 = tb4.g(i3, i3, 1, arrayList);
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d0.cancel();
            this.d0 = null;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.e0.cancel();
            this.e0 = null;
        }
    }

    public final void b() {
        if (this.n.equals(this.r.eglGetCurrentContext()) && this.h.equals(this.r.eglGetCurrentSurface(12377))) {
            return;
        }
        c();
        EGL10 egl10 = this.r;
        EGLDisplay eGLDisplay = this.f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.n)) {
            c();
        } else {
            k93.c(GLUtils.getEGLErrorString(this.r.eglGetError()), "eglMakeCurrent failed ");
        }
    }

    public final void c() {
        if (this.r.eglGetError() != 12288) {
            fa4.d("cannot swap buffers!");
        }
    }

    public final void d() {
        int glGetError = this.w.glGetError();
        if (glGetError == 0 || this.T != 4) {
            return;
        }
        wn4.p(Integer.toHexString(glGetError), "Diamond GL error: 0x");
    }

    public final synchronized void e(float f) {
        int i;
        b();
        if (this.b != null) {
            int i2 = this.E;
            int i3 = this.y;
            if (this.U) {
                this.r.eglQuerySurface(this.f, this.h, 12375, this.V);
                this.r.eglQuerySurface(this.f, this.h, 12374, this.W);
                int i4 = this.V[0];
                if (i4 > 0 && (i = this.W[0]) > 0 && (i4 != i2 || i != i3)) {
                    this.c.setDefaultBufferSize(i2, i3);
                    i2 = this.V[0];
                    i3 = this.W[0];
                }
            }
            if (i2 != this.F || i3 != this.G) {
                this.F = i2;
                this.G = i3;
                this.b.onSurfaceChanged(this.w, i2, i3);
            }
            uq4 uq4Var = this.b;
            uq4Var.G = f;
            uq4Var.onDrawFrame(this.w);
        }
        d();
        if (!this.r.eglSwapBuffers(this.f, this.h) && this.T == 4) {
            throw new IllegalStateException("Diamond buffer swap failed: " + this.r.eglGetError());
        }
    }

    public final synchronized void f(uq4 uq4Var) {
        if (uq4Var != null) {
            this.e = uq4Var;
            uq4Var.onSurfaceCreated(this.w, this.s);
            this.F = this.E;
            int i = this.y;
            this.G = i;
            uq4Var.onSurfaceChanged(this.w, this.F, i);
        }
    }

    public int getMaxFrameRate() {
        return this.T == 4 ? gba.o() == 2 ? 60 : 30 : this.L;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r6.e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r2 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r3 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r3 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r2.eglMakeCurrent(r3, r4, r4, r5);
        r2 = r6.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r2 == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r6.r.eglDestroySurface(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r2 = r6.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r2 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r6.r.eglDestroyContext(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        r6.h = null;
        r6.n = null;
        r6.f = null;
        r6.w = null;
        r6.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        fa4.g(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0026, code lost:
    
        r2.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0024, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        uq4 uq4Var;
        lj5 lj5Var;
        try {
            try {
                uq4 uq4Var2 = this.e;
                if (uq4Var2 != null && (lj5Var = uq4Var2.c) != null) {
                    cl3 cl3Var = lj5Var.a;
                    if (cl3Var != null) {
                        cl3Var.b();
                        lj5Var.a = null;
                    } else {
                        GLES20.glDeleteProgram(lj5Var.f);
                    }
                }
                uq4Var = this.e;
            } catch (Exception e) {
                fa4.g(e, true);
                uq4Var = this.e;
            }
        } catch (Throwable th) {
            uq4 uq4Var3 = this.e;
            if (uq4Var3 != null) {
                uq4Var3.c = null;
            }
            this.e = null;
            throw th;
        }
    }

    public final void j(long j) {
        ar4 ar4Var = this.f0;
        gl.r(ar4Var);
        if (this.J || !this.N) {
            return;
        }
        gl.e3(ar4Var, j);
    }

    public final void k(SurfaceTexture surfaceTexture, int i, int i2) {
        float renderScale = getRenderScale();
        this.U = renderScale < 1.0f;
        if (renderScale < 1.0f && i > 0 && i2 > 0) {
            i = Math.max(1, Math.round(i * renderScale));
            i2 = Math.max(1, Math.round(i2 * renderScale));
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.E = i;
        this.y = i2;
    }

    public final void l() {
        a();
        uq4 uq4Var = this.b;
        float f = uq4Var.d;
        float f2 = uq4Var.i;
        float f3 = uq4Var.e;
        float f4 = f + f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new xq4(this, f, f3, f2, (byte) 0));
        this.d0.setDuration(600L);
        this.d0.setInterpolator(new OvershootInterpolator());
        this.d0.start();
        cra craVar = this.S;
        if (craVar != null) {
            craVar.b(Math.abs(f4));
        }
        j(this.M);
    }

    public final void m(long j) {
        uq4 uq4Var = this.b;
        if (uq4Var != null) {
            uq4Var.d = -180.0f;
            gl.e3(new ar4(this, (byte) 1), j);
        }
    }

    public void n() {
        if (this.R && this.N) {
            int i = this.P;
            ArrayList arrayList = this.Q;
            int intValue = ((Integer) arrayList.get(i)).intValue();
            int i2 = this.P + 1;
            this.P = i2;
            if (i2 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.P = 0;
            }
            wq4 wq4Var = this.i0;
            wq4 wq4Var2 = this.h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.b.nextInt() % 4);
                this.e0 = new AnimatorSet();
                byte b = this.T;
                if (b == 4) {
                    float f = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 360.0f + f);
                    ofFloat.addUpdateListener(wq4Var2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.e0.playTogether(ofFloat);
                } else if (abs != 0 || b == 1 || b == 3) {
                    int i3 = (b == 1 || b == 3) ? 360 : 485;
                    if (abs == 2) {
                        i3 = -i3;
                    }
                    float f2 = i3;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.i, f2);
                    ofFloat2.addUpdateListener(wq4Var2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(s33.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f2, 0.0f);
                    ofFloat3.addUpdateListener(wq4Var2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(gl.H);
                    this.e0.playTogether(ofFloat2, ofFloat3);
                } else {
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, 48.0f);
                    ofFloat4.addUpdateListener(wq4Var);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(s33.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(48.0f, 0.0f);
                    ofFloat5.addUpdateListener(wq4Var);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(gl.H);
                    this.e0.playTogether(ofFloat4, ofFloat5);
                }
                this.e0.addListener(new br4(this, (byte) 1));
                this.e0.start();
                return;
            }
            if (intValue == 1) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(wq4Var2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(s33.f);
                this.e0.playTogether(ofFloat6);
                this.e0.addListener(new br4(this, (byte) 0));
                this.e0.start();
                return;
            }
            if (intValue != 2) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(wq4Var2);
                ofFloat7.setDuration(600L);
                s33 s33Var = s33.f;
                ofFloat7.setInterpolator(s33Var);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(wq4Var2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(s33Var);
                this.e0.playTogether(ofFloat7, ofFloat8);
                this.e0.addListener(new br4(this, (byte) 2));
                this.e0.start();
                return;
            }
            this.e0 = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(wq4Var2);
            ofFloat9.setDuration(600L);
            s33 s33Var2 = s33.g;
            ofFloat9.setInterpolator(s33Var2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.i, 50.0f);
            ofFloat10.addUpdateListener(wq4Var);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(s33Var2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(wq4Var2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            OvershootInterpolator overshootInterpolator = gl.H;
            ofFloat11.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(wq4Var);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.g0);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.e0.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.e0.addListener(new br4(this, (byte) 3));
            this.e0.start();
        }
    }

    public final void o() {
        dr4 dr4Var = this.K;
        this.K = null;
        this.a0 = false;
        if (dr4Var != null) {
            dr4Var.b = true;
            dr4Var.interrupt();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        this.I = true;
        j(this.M);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        uq4 uq4Var = this.b;
        if (uq4Var != null) {
            uq4Var.d = 0.0f;
            uq4Var.i = 0.0f;
            uq4Var.e = 0.0f;
        }
        this.R = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o();
        this.a0 = false;
        this.K = new dr4(this, surfaceTexture);
        k(surfaceTexture, i, i2);
        this.x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a0 = false;
        o();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        k(surfaceTexture, i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        uq4 uq4Var = this.b;
        lj5 lj5Var = uq4Var.c;
        if (lj5Var != null && lj5Var.a == null) {
            lj5Var.Z = bitmap;
        }
        uq4Var.r = bitmap;
    }

    public void setDialogVisible(boolean z) {
        this.J = z;
        if (!z) {
            j(this.M);
        } else {
            gl.r(this.f0);
            l();
        }
    }

    public void setIdleAnimationEnabled(boolean z) {
        this.N = z;
        if (z) {
            j(this.M);
        } else {
            gl.r(this.f0);
            a();
        }
    }

    public void setPaused(boolean z) {
        boolean z2 = this.H;
        this.H = z;
        if (!z2 || z || this.K == null) {
            return;
        }
        this.K.interrupt();
    }

    public synchronized void setRenderer(uq4 uq4Var) {
        this.b = uq4Var;
        this.I = true;
    }

    public void setStarParticlesView(cra craVar) {
        this.S = craVar;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            uq4 uq4Var = this.b;
            if (uq4Var != null) {
                uq4Var.b();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
