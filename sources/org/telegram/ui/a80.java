package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Intro;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a80 extends DispatchQueue {
    public static final /* synthetic */ int y = 0;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLConfig d;
    public EGLContext e;
    public EGLSurface f;
    public boolean h;
    public final int[] n;
    public float r;
    public long s;
    public final org.telegram.ui.Components.gp0 v;
    public final x5 w;
    public final /* synthetic */ c80 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(c80 c80Var, SurfaceTexture surfaceTexture) {
        super("EGLThread");
        this.x = c80Var;
        this.n = new int[24];
        this.v = new org.telegram.ui.Components.gp0(21);
        this.w = new x5(this, 7);
        this.a = surfaceTexture;
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        Drawable drawable = this.x.getParentActivity().getResources().getDrawable(i10);
        if (drawable instanceof BitmapDrawable) {
            int[] iArr = this.n;
            if (z10) {
                GLES20.glDeleteTextures(1, iArr, i11);
                GLES20.glGenTextures(1, iArr, i11);
            }
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            GLES20.glBindTexture(3553, iArr[i11]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            if (i12 == 0) {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(5);
            paint.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            GLUtils.texImage2D(3553, 0, createBitmap, 0);
            createBitmap.recycle();
        }
    }

    public final void c(GenericProvider genericProvider, int i10, boolean z10) {
        int[] iArr = this.n;
        if (z10) {
            GLES20.glDeleteTextures(1, iArr, i10);
            GLES20.glGenTextures(1, iArr, i10);
        }
        Bitmap bitmap = (Bitmap) genericProvider.provide(null);
        GLES20.glBindTexture(3553, iArr[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        bitmap.recycle();
    }

    public final void finish() {
        if (this.f != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.f);
            this.f = null;
        }
        EGLContext eGLContext = this.e;
        if (eGLContext != null) {
            this.b.eglDestroyContext(this.c, eGLContext);
            this.e = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.em.s(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            c80 c80Var = this.x;
            if (!this.b.eglChooseConfig(this.c, EmuDetector.with(c80Var.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.em.s(this.b, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.d = eGLConfig;
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.e = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.em.s(this.b, new StringBuilder("eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, this.d, surfaceTexture, null);
                        this.f = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.em.s(this.b, new StringBuilder("createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.e)) {
                            int[] iArr2 = this.n;
                            GLES20.glGenTextures(23, iArr2, 0);
                            b(R.drawable.intro_fast_arrow_shadow, 0, 0, false);
                            b(R.drawable.intro_fast_arrow, 1, 0, false);
                            b(R.drawable.intro_fast_body, 2, 0, false);
                            b(R.drawable.intro_fast_spiral, 3, 0, false);
                            b(R.drawable.intro_ic_bubble_dot, 4, 0, false);
                            b(R.drawable.intro_ic_bubble, 5, 0, false);
                            b(R.drawable.intro_ic_cam_lens, 6, 0, false);
                            b(R.drawable.intro_ic_cam, 7, 0, false);
                            b(R.drawable.intro_ic_pencil, 8, 0, false);
                            b(R.drawable.intro_ic_pin, 9, 0, false);
                            b(R.drawable.intro_ic_smile_eye, 10, 0, false);
                            b(R.drawable.intro_ic_smile, 11, 0, false);
                            b(R.drawable.intro_ic_videocam, 12, 0, false);
                            b(R.drawable.intro_knot_down, 13, 0, false);
                            b(R.drawable.intro_knot_up, 14, 0, false);
                            b(R.drawable.intro_powerful_infinity_white, 15, 0, false);
                            b(R.drawable.intro_powerful_infinity, 16, 0, false);
                            b(R.drawable.intro_powerful_mask, 17, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), false);
                            b(R.drawable.intro_powerful_star, 18, 0, false);
                            b(R.drawable.intro_private_door, 19, 0, false);
                            b(R.drawable.intro_private_screw, 20, 0, false);
                            b(R.drawable.intro_tg_plane, 21, 0, false);
                            c(new org.telegram.ui.Components.gp0(22), 22, false);
                            c(this.v, 23, false);
                            Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                            Intro.setPowerfulTextures(iArr2[17], iArr2[18], iArr2[16], iArr2[15]);
                            Intro.setPrivateTextures(iArr2[19], iArr2[20]);
                            Intro.setFreeTextures(iArr2[14], iArr2[13]);
                            Intro.setFastTextures(iArr2[2], iArr2[3], iArr2[1], iArr2[0]);
                            Intro.setIcTextures(iArr2[4], iArr2[5], iArr2[6], iArr2[7], iArr2[8], iArr2[9], iArr2[10], iArr2[11], iArr2[12]);
                            Intro.onSurfaceCreated();
                            c80Var.J = System.currentTimeMillis() - 1000;
                            z10 = true;
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.em.s(this.b, new StringBuilder("eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.em.s(this.b, new StringBuilder("eglInitialize failed "));
            }
            finish();
        }
        this.h = z10;
        super.run();
    }
}
