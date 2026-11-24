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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ft4 extends TextureView implements TextureView.SurfaceTextureListener, vlb {
    public volatile int E;
    public int F;
    public int G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public volatile et4 K;
    public final int L;
    public final short M;
    public boolean N;
    public final byte O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public dta S;
    public final byte T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean a;
    public volatile boolean a0;
    public vs4 b;
    public volatile Runnable b0;
    public SurfaceTexture c;
    public final GestureDetector c0;
    public final Object d;
    public ValueAnimator d0;
    public vs4 e;
    public AnimatorSet e0;
    public EGLDisplay f;
    public final bt4 f0;
    public final xs4 g0;
    public EGLSurface h;
    public final xs4 h0;
    public final xs4 i0;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 w;
    public long x;
    public volatile int y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v5, types: [xs4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [xs4] */
    /* JADX WARN: Type inference failed for: r2v7, types: [xs4] */
    public ft4(Context context, int i, int i2) {
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
        this.f0 = new bt4(this, (byte) 0);
        this.g0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: xs4
            public final /* synthetic */ ft4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = b;
                ft4 ft4Var = this.b;
                switch (b2) {
                    case 0:
                        ft4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        ft4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        ft4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.h0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: xs4
            public final /* synthetic */ ft4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b22 = b2;
                ft4 ft4Var = this.b;
                switch (b22) {
                    case 0:
                        ft4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        ft4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        ft4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.i0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: xs4
            public final /* synthetic */ ft4 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b22 = b3;
                ft4 ft4Var = this.b;
                switch (b22) {
                    case 0:
                        ft4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        ft4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        ft4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.T = i2;
        this.O = (i2 == 1 || i2 == 4 || i2 == 3) ? (byte) 1 : (byte) 5;
        this.M = (int) (i2 == 4 ? 0L : 2000L);
        setOpaque(false);
        setRenderer(new vs4(context, i, i2));
        this.L = (int) gm.r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new at4(this, i2));
        this.c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (true) {
            byte b4 = this.O;
            ArrayList arrayList = this.Q;
            if (i3 >= b4) {
                Collections.shuffle(arrayList);
                return;
            }
            i3 = td4.g(i3, i3, 1, arrayList);
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
            wa3.c(GLUtils.getEGLErrorString(this.r.eglGetError()), "eglMakeCurrent failed ");
        }
    }

    public final void c() {
        if (this.r.eglGetError() != 12288) {
            fc4.d("cannot swap buffers!");
        }
    }

    public final void d() {
        int glGetError = this.w.glGetError();
        if (glGetError == 0 || this.T != 4) {
            return;
        }
        zo4.r(Integer.toHexString(glGetError), "Diamond GL error: 0x");
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
            vs4 vs4Var = this.b;
            vs4Var.G = f;
            vs4Var.onDrawFrame(this.w);
        }
        d();
        if (!this.r.eglSwapBuffers(this.f, this.h) && this.T == 4) {
            throw new IllegalStateException("Diamond buffer swap failed: " + this.r.eglGetError());
        }
    }

    public final synchronized void f(vs4 vs4Var) {
        if (vs4Var != null) {
            this.e = vs4Var;
            vs4Var.onSurfaceCreated(this.w, this.s);
            this.F = this.E;
            int i = this.y;
            this.G = i;
            vs4Var.onSurfaceChanged(this.w, this.F, i);
        }
    }

    public int getMaxFrameRate() {
        return this.T == 4 ? gda.o() == 2 ? 60 : 30 : this.L;
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
    
        fc4.g(r2, true);
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
        vs4 vs4Var;
        kl5 kl5Var;
        try {
            try {
                vs4 vs4Var2 = this.e;
                if (vs4Var2 != null && (kl5Var = vs4Var2.c) != null) {
                    nm3 nm3Var = kl5Var.a;
                    if (nm3Var != null) {
                        nm3Var.b();
                        kl5Var.a = null;
                    } else {
                        GLES20.glDeleteProgram(kl5Var.f);
                    }
                }
                vs4Var = this.e;
            } catch (Exception e) {
                fc4.g(e, true);
                vs4Var = this.e;
            }
        } catch (Throwable th) {
            vs4 vs4Var3 = this.e;
            if (vs4Var3 != null) {
                vs4Var3.c = null;
            }
            this.e = null;
            throw th;
        }
    }

    public final void j(long j) {
        bt4 bt4Var = this.f0;
        gm.r(bt4Var);
        if (this.J || !this.N) {
            return;
        }
        gm.d3(bt4Var, j);
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
        vs4 vs4Var = this.b;
        float f = vs4Var.d;
        float f2 = vs4Var.i;
        float f3 = vs4Var.e;
        float f4 = f + f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new ys4(this, f, f3, f2, (byte) 0));
        this.d0.setDuration(600L);
        this.d0.setInterpolator(new OvershootInterpolator());
        this.d0.start();
        dta dtaVar = this.S;
        if (dtaVar != null) {
            dtaVar.b(Math.abs(f4));
        }
        j(this.M);
    }

    public final void m(long j) {
        vs4 vs4Var = this.b;
        if (vs4Var != null) {
            vs4Var.d = -180.0f;
            gm.d3(new bt4(this, (byte) 1), j);
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
            xs4 xs4Var = this.i0;
            xs4 xs4Var2 = this.h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.b.nextInt() % 4);
                this.e0 = new AnimatorSet();
                byte b = this.T;
                if (b == 4) {
                    float f = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 360.0f + f);
                    ofFloat.addUpdateListener(xs4Var2);
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
                    ofFloat2.addUpdateListener(xs4Var2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(d53.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f2, 0.0f);
                    ofFloat3.addUpdateListener(xs4Var2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(gm.H);
                    this.e0.playTogether(ofFloat2, ofFloat3);
                } else {
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, 48.0f);
                    ofFloat4.addUpdateListener(xs4Var);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(d53.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(48.0f, 0.0f);
                    ofFloat5.addUpdateListener(xs4Var);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(gm.H);
                    this.e0.playTogether(ofFloat4, ofFloat5);
                }
                this.e0.addListener(new ct4(this, (byte) 1));
                this.e0.start();
                return;
            }
            if (intValue == 1) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(xs4Var2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(d53.f);
                this.e0.playTogether(ofFloat6);
                this.e0.addListener(new ct4(this, (byte) 0));
                this.e0.start();
                return;
            }
            if (intValue != 2) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(xs4Var2);
                ofFloat7.setDuration(600L);
                d53 d53Var = d53.f;
                ofFloat7.setInterpolator(d53Var);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(xs4Var2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(d53Var);
                this.e0.playTogether(ofFloat7, ofFloat8);
                this.e0.addListener(new ct4(this, (byte) 2));
                this.e0.start();
                return;
            }
            this.e0 = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(xs4Var2);
            ofFloat9.setDuration(600L);
            d53 d53Var2 = d53.g;
            ofFloat9.setInterpolator(d53Var2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.i, 50.0f);
            ofFloat10.addUpdateListener(xs4Var);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(d53Var2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(xs4Var2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            OvershootInterpolator overshootInterpolator = gm.H;
            ofFloat11.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(xs4Var);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.g0);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.e0.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.e0.addListener(new ct4(this, (byte) 3));
            this.e0.start();
        }
    }

    public final void o() {
        et4 et4Var = this.K;
        this.K = null;
        this.a0 = false;
        if (et4Var != null) {
            et4Var.b = true;
            et4Var.interrupt();
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
        vs4 vs4Var = this.b;
        if (vs4Var != null) {
            vs4Var.d = 0.0f;
            vs4Var.i = 0.0f;
            vs4Var.e = 0.0f;
        }
        this.R = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o();
        this.a0 = false;
        this.K = new et4(this, surfaceTexture);
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
        vs4 vs4Var = this.b;
        kl5 kl5Var = vs4Var.c;
        if (kl5Var != null && kl5Var.a == null) {
            kl5Var.Z = bitmap;
        }
        vs4Var.r = bitmap;
    }

    public void setDialogVisible(boolean z) {
        this.J = z;
        if (!z) {
            j(this.M);
        } else {
            gm.r(this.f0);
            l();
        }
    }

    public void setIdleAnimationEnabled(boolean z) {
        this.N = z;
        if (z) {
            j(this.M);
        } else {
            gm.r(this.f0);
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

    public synchronized void setRenderer(vs4 vs4Var) {
        this.b = vs4Var;
        this.I = true;
    }

    public void setStarParticlesView(dta dtaVar) {
        this.S = dtaVar;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            vs4 vs4Var = this.b;
            if (vs4Var != null) {
                vs4Var.b();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void g() {
    }

    public void h() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
