package dg;

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
import bg.q1;
import cg.s2;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class i extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean A;
    public boolean B;
    public h C;
    public final int D;
    public final long E;
    public final int F;
    public int G;
    public final ArrayList H;
    public boolean I;
    public s2 J;
    public final int K;
    public volatile boolean L;
    public volatile ja M;
    public final GestureDetector N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final f Q;
    public final b R;
    public final b S;
    public final b T;
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

    /* JADX WARN: Type inference failed for: r2v3, types: [dg.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [dg.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [dg.b] */
    public i(Context context, int i10, int i11) {
        super(context);
        int i12 = 0;
        this.x = false;
        this.y = true;
        this.A = false;
        this.B = false;
        this.H = new ArrayList();
        this.P = new AnimatorSet();
        final int i13 = 0;
        this.Q = new f(this, 0);
        this.R = new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg.b
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
        this.S = new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg.b
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
        this.T = new ValueAnimator.AnimatorUpdateListener(this) { // from class: dg.b
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
        this.K = i11;
        this.F = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.E = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.D = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(0, this));
        this.N = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.F) {
            i12 = th.d(i12, i12, 1, this.H);
        }
        Collections.shuffle(this.H);
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
        boolean z10;
        synchronized (iVar) {
            z10 = iVar.y;
        }
        return z10 || iVar.b == null;
    }

    public static void c(i iVar, float f9) {
        synchronized (iVar) {
            try {
                iVar.e();
                a aVar = iVar.b;
                if (aVar != null) {
                    aVar.D = f9;
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
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O.cancel();
            this.O = null;
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P.cancel();
            this.P = null;
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
        f fVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        if (this.B) {
            return;
        }
        AndroidUtilities.runOnUIThread(fVar, j10);
    }

    public final void i() {
        d();
        a aVar = this.b;
        float f9 = aVar.d;
        float f10 = aVar.g;
        float f11 = aVar.e;
        float f12 = f9 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new c(this, f9, f11, f10, 0));
        this.O.setDuration(600L);
        this.O.setInterpolator(new OvershootInterpolator());
        this.O.start();
        s2 s2Var = this.J;
        if (s2Var != null) {
            float abs = Math.abs(f12);
            float f13 = abs < 60.0f ? 5.0f : abs < 180.0f ? 9.0f : 15.0f;
            AnimatorSet animatorSet = new AnimatorSet();
            q1 q1Var = new q1(s2Var, 8);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f13);
            ofFloat2.addUpdateListener(q1Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f13, 1.0f);
            ofFloat3.addUpdateListener(q1Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.E);
    }

    public final void j(long j10) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new f(this, 1), j10);
        }
    }

    public void k() {
        if (this.I) {
            int i10 = this.G;
            ArrayList arrayList = this.H;
            int intValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.G + 1;
            this.G = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.G = 0;
            }
            b bVar = this.T;
            b bVar2 = this.S;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.random.nextInt() % 4);
                this.P = new AnimatorSet();
                int i12 = this.K;
                if (i12 == 4) {
                    float f9 = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 360.0f + f9);
                    ofFloat.addUpdateListener(bVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.P.playTogether(ofFloat);
                } else if (abs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (abs == 2) {
                        i13 = -i13;
                    }
                    float f10 = i13;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.g, f10);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setDuration(3000L);
                    ofFloat2.setInterpolator(jr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(bVar2);
                    ofFloat3.setDuration(1000L);
                    ofFloat3.setStartDelay(3000L);
                    ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.P.playTogether(ofFloat2, ofFloat3);
                } else {
                    float f11 = 48;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.g, f11);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setDuration(2300L);
                    ofFloat4.setInterpolator(jr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(bVar);
                    ofFloat5.setDuration(500L);
                    ofFloat5.setStartDelay(2300L);
                    ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.P.playTogether(ofFloat4, ofFloat5);
                }
                this.P.addListener(new g(this, 1));
                this.P.start();
                return;
            }
            if (intValue == 1) {
                this.P = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(bVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(jr.f);
                this.P.playTogether(ofFloat6);
                this.P.addListener(new g(this, 0));
                this.P.start();
                return;
            }
            if (intValue != 2) {
                this.P = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat7.addUpdateListener(bVar2);
                ofFloat7.setDuration(600L);
                jr jrVar = jr.f;
                ofFloat7.setInterpolator(jrVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat8.addUpdateListener(bVar2);
                ofFloat8.setDuration(600L);
                ofFloat8.setStartDelay(2000L);
                ofFloat8.setInterpolator(jrVar);
                this.P.playTogether(ofFloat7, ofFloat8);
                this.P.addListener(new g(this, 2));
                this.P.start();
                return;
            }
            this.P = new AnimatorSet();
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(this.b.d, 184.0f);
            ofFloat9.addUpdateListener(bVar2);
            ofFloat9.setDuration(600L);
            jr jrVar2 = jr.g;
            ofFloat9.setInterpolator(jrVar2);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(this.b.g, 50.0f);
            ofFloat10.addUpdateListener(bVar);
            ofFloat10.setDuration(600L);
            ofFloat10.setInterpolator(jrVar2);
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
            ofFloat13.addUpdateListener(this.R);
            ofFloat13.setDuration(10000L);
            ofFloat13.setInterpolator(new LinearInterpolator());
            this.P.playTogether(ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13);
            this.P.addListener(new g(this, 3));
            this.P.start();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        this.A = true;
        h(this.E);
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
        this.I = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.C = new h(this);
        this.c = surfaceTexture;
        this.w = i10;
        this.v = i11;
        this.s = Math.max(0, ((int) ((1.0f / this.D) * 1000.0f)) - 1);
        this.C.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.L = false;
        if (this.C != null) {
            this.x = false;
            this.C = null;
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
        return this.N.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.b;
        j jVar = aVar.c;
        if (jVar != null) {
            jVar.V = bitmap;
        }
        aVar.o = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.B = z10;
        if (!z10) {
            h(this.E);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
            i();
        }
    }

    public synchronized void setPaused(boolean z10) {
        this.y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.b = aVar;
        this.A = true;
    }

    public void setStarParticlesView(s2 s2Var) {
        this.J = s2Var;
    }

    public void g() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
