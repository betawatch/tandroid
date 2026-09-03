package gg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import eg.m1;
import fg.p2;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import mh.ka;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class i extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean B;
    public boolean C;
    public h D;
    public final int E;
    public final long F;
    public final int G;
    public int H;
    public final ArrayList I;
    public boolean J;
    public p2 K;
    public final int L;
    public volatile boolean M;
    public volatile ka N;
    public final GestureDetector O;
    public ValueAnimator P;
    public AnimatorSet Q;
    public final f R;
    public final b S;
    public final b T;
    public final b U;
    public boolean a;
    public a b;
    public SurfaceTexture c;
    public EGLDisplay d;
    public EGLSurface e;
    public EGLContext f;
    public EGL10 h;
    public EGLConfig n;
    public GL10 r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r2v3, types: [gg.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [gg.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [gg.b] */
    public i(Context context, int i10, int i11) {
        super(context);
        int i12 = 0;
        this.x = false;
        this.y = true;
        this.B = false;
        this.C = false;
        this.I = new ArrayList();
        this.Q = new AnimatorSet();
        final int i13 = 0;
        this.R = new f(this, 0);
        this.S = new ValueAnimator.AnimatorUpdateListener(this) { // from class: gg.b
            public final /* synthetic */ i b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i14 = 1;
        this.T = new ValueAnimator.AnimatorUpdateListener(this) { // from class: gg.b
            public final /* synthetic */ i b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i15 = 2;
        this.U = new ValueAnimator.AnimatorUpdateListener(this) { // from class: gg.b
            public final /* synthetic */ i b;

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
                        this.b.b.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.L = i11;
        this.G = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.F = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.E = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(0, this));
        this.O = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.G) {
            i12 = yh.d(i12, i12, 1, this.I);
        }
        Collections.shuffle(this.I);
    }

    public static void a(i iVar) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        iVar.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        iVar.d = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        if (!iVar.h.eglInitialize(eglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = EmuDetector.with(iVar.getContext()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
        iVar.n = null;
        if (!iVar.h.eglChooseConfig(iVar.d, iArr2, eGLConfigArr, 1, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        if (iArr[0] > 0) {
            iVar.n = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = iVar.n;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        iVar.f = iVar.h.eglCreateContext(iVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        iVar.f();
        iVar.e = iVar.h.eglCreateWindowSurface(iVar.d, iVar.n, iVar.c, null);
        iVar.f();
        EGLSurface eGLSurface = iVar.e;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = iVar.h.eglGetError();
            if (eglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            } else {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
            }
        }
        if (!iVar.h.eglMakeCurrent(iVar.d, eGLSurface, eGLSurface, iVar.f)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        iVar.f();
        iVar.r = (GL10) iVar.f.getGL();
        iVar.f();
    }

    public static boolean b(i iVar) {
        boolean z4;
        synchronized (iVar) {
            z4 = iVar.y;
        }
        return z4 || iVar.b == null;
    }

    public static void c(i iVar, float f10) {
        synchronized (iVar) {
            try {
                iVar.e();
                a aVar = iVar.b;
                if (aVar != null) {
                    aVar.D = f10;
                    aVar.onDrawFrame(iVar.r);
                }
                int glGetError = iVar.r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                iVar.h.eglSwapBuffers(iVar.d, iVar.e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.P.cancel();
            this.P = null;
        }
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.Q.cancel();
            this.Q = null;
        }
    }

    public final void e() {
        if (this.f.equals(this.h.eglGetCurrentContext()) && this.e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f)) {
            f();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.h.eglGetError()));
        }
    }

    public final void f() {
        if (this.h.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void h(long j10) {
        f fVar = this.R;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        if (this.C) {
            return;
        }
        AndroidUtilities.runOnUIThread(fVar, j10);
    }

    public final void i() {
        d();
        a aVar = this.b;
        float f10 = aVar.d;
        float f11 = aVar.g;
        float f12 = aVar.e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new c(this, f10, f12, f11, 0));
        this.P.setDuration(600L);
        this.P.setInterpolator(new OvershootInterpolator());
        this.P.start();
        p2 p2Var = this.K;
        if (p2Var != null) {
            float abs = Math.abs(f13);
            float f14 = abs < 60.0f ? 5.0f : abs < 180.0f ? 9.0f : 15.0f;
            AnimatorSet animatorSet = new AnimatorSet();
            m1 m1Var = new m1(p2Var, 8);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f14);
            ofFloat2.addUpdateListener(m1Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f14, 1.0f);
            ofFloat3.addUpdateListener(m1Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.F);
    }

    public final void j(long j10) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new f(this, 1), j10);
        }
    }

    public void k() {
        if (this.J) {
            int i10 = this.H;
            ArrayList arrayList = this.I;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.H + 1;
            this.H = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.H = 0;
            }
            b bVar = this.U;
            b bVar2 = this.T;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.Q = new AnimatorSet();
                int i12 = this.L;
                if (i12 == 4) {
                    float f10 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    ofFloat.addUpdateListener(bVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.Q.playTogether(ofFloat);
                } else if (abs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i13 = -i13;
                    }
                    float f11 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.g, f11);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(pr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat3.addUpdateListener(bVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.Q.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f12 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.g, f12);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(pr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    ofFloat5.addUpdateListener(bVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.Q.playTogether(ofFloat4, ofFloat5);
                }
                this.Q.addListener(new g(this, 1));
                this.Q.start();
                return;
            }
            if (intValue == 1) {
                this.Q = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(bVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(pr.f);
                this.Q.playTogether(ofFloat6);
                this.Q.addListener(new g(this, 0));
                this.Q.start();
                return;
            }
            if (intValue != 2) {
                this.Q = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(bVar2);
                ofFloat7.setDuration(600L);
                pr prVar = pr.f;
                ofFloat7.setInterpolator(prVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(bVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(prVar);
                this.Q.playTogether(ofFloat7, ofFloat8);
                this.Q.addListener(new g(this, 2));
                this.Q.start();
                return;
            }
            this.Q = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(bVar2);
            ofFloat9.setDuration(600L);
            pr prVar2 = pr.g;
            ofFloat9.setInterpolator(prVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.g, 50.0f);
            ofFloat10.addUpdateListener(bVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(prVar2);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat11.addUpdateListener(bVar2);
            ofFloat11.setDuration(800L);
            ofFloat11.setStartDelay(10000L);
            ofFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat12.addUpdateListener(bVar);
            ofFloat12.setDuration(800L);
            ofFloat12.setStartDelay(10000L);
            ofFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat13.addUpdateListener(this.S);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.Q.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.Q.addListener(new g(this, 3));
            this.Q.start();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.B = true;
        h(this.F);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a aVar = this.b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.g = 0.0f;
            aVar.e = 0.0f;
        }
        this.J = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.D = new h(this);
        this.c = surfaceTexture;
        this.w = i10;
        this.v = i11;
        this.s = Math.max(0, ((int) ((1.0f / this.E) * 1000.0f)) - 1);
        this.D.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.M = false;
        if (this.D != null) {
            this.x = false;
            this.D = null;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.w = i10;
        this.v = i11;
        a aVar = this.b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.r, i10, i11);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.O.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.b;
        j jVar = aVar.c;
        if (jVar != null) {
            jVar.V = bitmap;
        }
        aVar.o = bitmap;
    }

    public void setDialogVisible(boolean z4) {
        this.C = z4;
        if (!z4) {
            h(this.F);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.R);
            i();
        }
    }

    public synchronized void setPaused(boolean z4) {
        this.y = z4;
    }

    public synchronized void setRenderer(a aVar) {
        this.b = aVar;
        this.B = true;
    }

    public void setStarParticlesView(p2 p2Var) {
        this.K = p2Var;
    }

    public void g() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
