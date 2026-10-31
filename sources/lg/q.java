package lg;

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
import kg.g2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class q extends TextureView implements TextureView.SurfaceTextureListener, k6 {
    public volatile int D;
    public int E;
    public int F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public volatile p J;
    public final int K;
    public final long L;
    public boolean M;
    public final int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public g2 R;
    public final int S;
    public volatile boolean T;
    public final int[] U;
    public final int[] V;
    public volatile boolean W;
    public boolean a;
    public volatile Runnable a0;
    public h b;
    public final GestureDetector b0;
    public SurfaceTexture c;
    public ValueAnimator c0;
    public final Object d;
    public AnimatorSet d0;
    public h e;
    public final m e0;
    public EGLDisplay f;
    public final i f0;
    public final i g0;
    public EGLSurface h;
    public final i h0;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 w;
    public long x;
    public volatile int y;

    /* JADX WARN: Type inference failed for: r2v5, types: [lg.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [lg.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [lg.i] */
    public q(Context context, int i10, int i11) {
        super(context);
        this.d = new Object();
        this.G = true;
        int i12 = 0;
        this.H = false;
        this.I = false;
        this.M = true;
        this.P = new ArrayList();
        this.U = new int[1];
        this.V = new int[1];
        this.d0 = new AnimatorSet();
        final int i13 = 0;
        this.e0 = new m(this, 0);
        this.f0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i14 = 1;
        this.g0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i15 = 2;
        this.h0 = new ValueAnimator.AnimatorUpdateListener(this) { // from class: lg.i
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        this.b.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.b.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.b.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.S = i11;
        this.N = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.L = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new h(context, i10, i11));
        this.K = (int) i0.r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new l(this, i11));
        this.b0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.N) {
            i12 = c3.i0.j(i12, i12, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(q qVar, float f7) {
        int i10;
        synchronized (qVar) {
            try {
                qVar.e();
                if (qVar.b != null) {
                    int i11 = qVar.D;
                    int i12 = qVar.y;
                    if (qVar.T) {
                        qVar.r.eglQuerySurface(qVar.f, qVar.h, 12375, qVar.U);
                        qVar.r.eglQuerySurface(qVar.f, qVar.h, 12374, qVar.V);
                        int i13 = qVar.U[0];
                        if (i13 > 0 && (i10 = qVar.V[0]) > 0 && (i13 != i11 || i10 != i12)) {
                            qVar.c.setDefaultBufferSize(i11, i12);
                            i11 = qVar.U[0];
                            i12 = qVar.V[0];
                        }
                    }
                    if (i11 != qVar.E || i12 != qVar.F) {
                        qVar.E = i11;
                        qVar.F = i12;
                        qVar.b.onSurfaceChanged(qVar.w, i11, i12);
                    }
                    h hVar = qVar.b;
                    hVar.G = f7;
                    hVar.onDrawFrame(qVar.w);
                }
                qVar.g();
                if (!qVar.r.eglSwapBuffers(qVar.f, qVar.h) && qVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + qVar.r.eglGetError());
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r2 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r3 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r3 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r3 == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r2.eglMakeCurrent(r3, r4, r4, r5);
        r2 = r6.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r6.r.eglDestroySurface(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r2 = r6.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r2 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r6.r.eglDestroyContext(r6.f, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r6.h = null;
        r6.n = null;
        r6.f = null;
        r6.w = null;
        r6.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        org.telegram.messenger.f8.g(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002c, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(q qVar) {
        r rVar;
        try {
            try {
                h hVar = qVar.e;
                if (hVar != null && (rVar = hVar.c) != null) {
                    a aVar = rVar.a;
                    if (aVar != null) {
                        aVar.b();
                        rVar.a = null;
                    } else {
                        GLES20.glDeleteProgram(rVar.f);
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
                h hVar2 = qVar.e;
            }
            qVar.h = null;
            qVar.n = null;
            qVar.f = null;
            qVar.w = null;
            qVar.c = null;
        } finally {
            h hVar3 = qVar.e;
            if (hVar3 != null) {
                hVar3.c = null;
            }
            qVar.e = null;
        }
    }

    public static void c(q qVar, h hVar) {
        synchronized (qVar) {
            if (hVar != null) {
                qVar.e = hVar;
                hVar.onSurfaceCreated(qVar.w, qVar.s);
                qVar.E = qVar.D;
                int i10 = qVar.y;
                qVar.F = i10;
                hVar.onSurfaceChanged(qVar.w, qVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
            this.c0 = null;
        }
        AnimatorSet animatorSet = this.d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.d0.cancel();
            this.d0 = null;
        }
    }

    public final void e() {
        if (this.n.equals(this.r.eglGetCurrentContext()) && this.h.equals(this.r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.r;
        EGLDisplay eGLDisplay = this.f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.n)) {
            f();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.r.eglGetError()));
        }
    }

    public final void f() {
        if (this.r.eglGetError() != 12288) {
            f8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.w.glGetError();
        if (glGetError == 0 || this.S != 4) {
            return;
        }
        throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
    }

    public int getMaxFrameRate() {
        return this.S == 4 ? tz.o() == 2 ? 60 : 30 : this.K;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void j(long j10) {
        m mVar = this.e0;
        i0.r(mVar);
        if (this.I || !this.M) {
            return;
        }
        i0.h3(mVar, j10);
    }

    public final void k(SurfaceTexture surfaceTexture, int i10, int i11) {
        float renderScale = getRenderScale();
        this.T = renderScale < 1.0f;
        if (renderScale < 1.0f && i10 > 0 && i11 > 0) {
            i10 = Math.max(1, Math.round(i10 * renderScale));
            i11 = Math.max(1, Math.round(i11 * renderScale));
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this.D = i10;
        this.y = i11;
    }

    public final void l() {
        d();
        h hVar = this.b;
        float f7 = hVar.d;
        float f10 = hVar.i;
        float f11 = hVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new j(this, f7, f11, f10, 0));
        this.c0.setDuration(600L);
        this.c0.setInterpolator(new OvershootInterpolator());
        this.c0.start();
        g2 g2Var = this.R;
        if (g2Var != null) {
            g2Var.b(Math.abs(f12));
        }
        j(this.L);
    }

    public final void m(long j10) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.d = -180.0f;
            i0.h3(new m(this, 1), j10);
        }
    }

    public void n() {
        if (this.Q && this.M) {
            int i10 = this.O;
            ArrayList arrayList = this.P;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.O + 1;
            this.O = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.O = 0;
            }
            i iVar = this.h0;
            i iVar2 = this.g0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.b.nextInt() % 4);
                this.d0 = new AnimatorSet();
                int i12 = this.S;
                if (i12 == 4) {
                    float f7 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(iVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.d0.playTogether(ofFloat);
                } else if (abs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i13 = -i13;
                    }
                    float f10 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.i, f10);
                    ofFloat2.addUpdateListener(iVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(gr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(iVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(i0.H);
                    this.d0.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f11 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, f11);
                    ofFloat4.addUpdateListener(iVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(gr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(iVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(i0.H);
                    this.d0.playTogether(ofFloat4, ofFloat5);
                }
                this.d0.addListener(new n(this, 1));
                this.d0.start();
                return;
            }
            if (intValue == 1) {
                this.d0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(iVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(gr.f);
                this.d0.playTogether(ofFloat6);
                this.d0.addListener(new n(this, 0));
                this.d0.start();
                return;
            }
            if (intValue != 2) {
                this.d0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(iVar2);
                ofFloat7.setDuration(600L);
                gr grVar = gr.f;
                ofFloat7.setInterpolator(grVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(iVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(grVar);
                this.d0.playTogether(ofFloat7, ofFloat8);
                this.d0.addListener(new n(this, 2));
                this.d0.start();
                return;
            }
            this.d0 = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(iVar2);
            ofFloat9.setDuration(600L);
            gr grVar2 = gr.g;
            ofFloat9.setInterpolator(grVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.i, 50.0f);
            ofFloat10.addUpdateListener(iVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(grVar2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(iVar2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            OvershootInterpolator overshootInterpolator = i0.H;
            ofFloat11.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(iVar);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.f0);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.d0.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.d0.addListener(new n(this, 3));
            this.d0.start();
        }
    }

    public final void o() {
        p pVar = this.J;
        this.J = null;
        this.W = false;
        if (pVar != null) {
            pVar.b = true;
            pVar.interrupt();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        j(this.L);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        h hVar = this.b;
        if (hVar != null) {
            hVar.d = 0.0f;
            hVar.i = 0.0f;
            hVar.e = 0.0f;
        }
        this.Q = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        o();
        this.W = false;
        this.J = new p(this, surfaceTexture);
        k(surfaceTexture, i10, i11);
        this.x = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.W = false;
        o();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        k(surfaceTexture, i10, i11);
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
        return this.b0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        h hVar = this.b;
        r rVar = hVar.c;
        if (rVar != null && rVar.a == null) {
            rVar.Z = bitmap;
        }
        hVar.r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (!z10) {
            j(this.L);
        } else {
            i0.r(this.e0);
            l();
        }
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            j(this.L);
        } else {
            i0.r(this.e0);
            d();
        }
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.G;
        this.G = z10;
        if (!z11 || z10 || this.J == null) {
            return;
        }
        this.J.interrupt();
    }

    public synchronized void setRenderer(h hVar) {
        this.b = hVar;
        this.H = true;
    }

    public void setStarParticlesView(g2 g2Var) {
        this.R = g2Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            h hVar = this.b;
            if (hVar != null) {
                hVar.b();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void h() {
    }

    public void i() {
    }
}
