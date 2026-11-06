package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements org.telegram.messenger.ls, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer v1;
    public float A0;
    public float B0;
    public float C0;
    public kp0 D;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.r7 F;
    public int[] F0;
    public AnimatorSet G;
    public boolean G0;
    public boolean H;
    public long H0;
    public boolean I;
    public AnimatorSet I0;
    public boolean J;
    public GestureDetector J0;
    public boolean K;
    public final DecelerateInterpolator K0;
    public uq0 L;
    public float L0;
    public int M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.v51 O;
    public float O0;
    public l00 P;
    public float P0;
    public org.telegram.ui.ActionBar.k5 Q;
    public float Q0;
    public View R;
    public float R0;
    public lz0 S;
    public float S0;
    public ImageView T;
    public float T0;
    public org.telegram.ui.Components.he0 U;
    public float U0;
    public FrameLayout V;
    public float V0;
    public uo0 W;
    public float W0;
    public lq0 X;
    public boolean X0;
    public vp0 Y;
    public boolean Y0;
    public int Z;
    public boolean Z0;
    public int a;
    public boolean a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public boolean b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public float c0;
    public boolean c1;
    public k0 d;
    public long d0;
    public boolean d1;
    public bi.x5 e;
    public WindowInsets e0;
    public org.telegram.ui.Components.wk0 e1;
    public View f;
    public org.telegram.messenger.ij f0;
    public boolean f1;
    public org.telegram.messenger.jc g0;
    public final dz0 g1;
    public boolean h0;
    public final int[] h1;
    public final int[] i1;
    public bg.v0 j1;
    public int k0;
    public boolean k1;
    public long l0;
    public int l1;
    public Runnable m0;
    public boolean m1;
    public kz0 n;
    public boolean n0;
    public Runnable n1;
    public float o0;
    public boolean o1;
    public float p0;
    public final dz0 p1;
    public float q0;
    public float[] q1;
    public fi.m3 r;
    public float r0;
    public final Path r1;
    public boolean s;
    public float s0;
    public final q0 s1;
    public float t0;
    public final q0 t1;
    public float u0;
    public boolean u1;
    public float v0;
    public long w;
    public float w0;
    public j4 x;
    public float x0;
    public TextureView y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean i0 = true;
    public final PhotoBackgroundDrawable j0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public by0 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            by0 by0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (by0Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    by0Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i7) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.j1;
            if (v0Var != null) {
                v0Var.c(secretMediaViewer.h0 && i7 == 255);
            }
            super.setAlpha(i7);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i7, int i10, int i11, int i12) {
            super.setBounds(i7, i10, i11, i12 + org.telegram.messenger.g0.n);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.g0.n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.w0 = 1.0f;
        this.K0 = new DecelerateInterpolator(1.5f);
        this.M0 = 1.0f;
        this.b1 = true;
        this.g1 = new dz0(this, 2);
        this.h1 = new int[2];
        this.i1 = new int[2];
        this.p1 = new dz0(this, 3);
        this.r1 = new Path();
        this.s1 = new q0("videoCrossfadeAlpha", 5);
        this.t1 = new q0("animationValue", 6);
    }

    public static /* synthetic */ WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.e0;
        secretMediaViewer.e0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.d.requestLayout();
        }
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(SecretMediaViewer secretMediaViewer, Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        boolean z9;
        float f23;
        float f24;
        boolean z10;
        int q10;
        int o4;
        int i7;
        float f25;
        float f26;
        int i10;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.j0;
        Path path = secretMediaViewer.r1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.h0) {
            if (secretMediaViewer.I0 != null) {
                org.telegram.ui.Components.wk0 wk0Var = secretMediaViewer.e1;
                if (!wk0Var.q) {
                    wk0Var.a();
                }
                float f27 = secretMediaViewer.w0;
                float f28 = secretMediaViewer.z0;
                float f29 = secretMediaViewer.animationValue;
                f13 = ((f28 - f27) * f29) + f27;
                float f30 = secretMediaViewer.v0;
                float z11 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.y0, f30, f29, f30);
                float f31 = secretMediaViewer.u0;
                f15 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.x0, f31, f29, f31);
                f10 = -1.0f;
                float f32 = secretMediaViewer.p0;
                f11 = 1.0f;
                f16 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.A0, f32, f29, f32);
                float f33 = secretMediaViewer.q0;
                f12 = 0.0f;
                f17 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.B0, f33, f29, f33);
                float f34 = secretMediaViewer.r0;
                f18 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.C0, f34, f29, f34);
                float f35 = secretMediaViewer.s0;
                float z12 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.D0, f35, f29, f35);
                float f36 = secretMediaViewer.t0;
                float z13 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.E0, f36, f29, f36);
                float f37 = (f28 == 1.0f && f27 == 1.0f && f31 == 0.0f) ? z11 : -1.0f;
                secretMediaViewer.e.invalidate();
                f20 = z13;
                f21 = z11;
                f14 = f37;
                f19 = z12;
            } else {
                f10 = -1.0f;
                f11 = 1.0f;
                f12 = 0.0f;
                if (secretMediaViewer.H0 != 0) {
                    secretMediaViewer.u0 = secretMediaViewer.x0;
                    secretMediaViewer.v0 = secretMediaViewer.y0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.p0 = secretMediaViewer.A0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    secretMediaViewer.s0 = secretMediaViewer.D0;
                    secretMediaViewer.t0 = secretMediaViewer.E0;
                    float f38 = secretMediaViewer.z0;
                    secretMediaViewer.w0 = f38;
                    secretMediaViewer.H0 = 0L;
                    secretMediaViewer.o(f38);
                    secretMediaViewer.c1 = false;
                }
                org.telegram.ui.Components.wk0 wk0Var2 = secretMediaViewer.e1;
                if (!wk0Var2.q && wk0Var2.b()) {
                    org.telegram.ui.Components.wk0 wk0Var3 = secretMediaViewer.e1;
                    float f39 = wk0Var3.b;
                    if (f39 < secretMediaViewer.U0 && f39 > secretMediaViewer.T0) {
                        secretMediaViewer.u0 = wk0Var3.j;
                    }
                    float f40 = wk0Var3.c;
                    if (f40 < secretMediaViewer.W0 && f40 > secretMediaViewer.V0) {
                        secretMediaViewer.v0 = wk0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f13 = secretMediaViewer.w0;
                f14 = secretMediaViewer.v0;
                f15 = secretMediaViewer.u0;
                f16 = secretMediaViewer.p0;
                f17 = secretMediaViewer.q0;
                f18 = secretMediaViewer.r0;
                f19 = secretMediaViewer.s0;
                f20 = secretMediaViewer.t0;
                if (secretMediaViewer.Y0) {
                    f21 = f14;
                    f14 = -1.0f;
                } else {
                    f21 = f14;
                }
            }
            if (secretMediaViewer.F0 != null) {
                int i11 = 8;
                if (secretMediaViewer.q1 == null) {
                    secretMediaViewer.q1 = new float[8];
                }
                float f41 = secretMediaViewer.G0 ? secretMediaViewer.animationValue : f11 - secretMediaViewer.animationValue;
                f22 = f16;
                int i12 = 0;
                z9 = true;
                while (i12 < i11) {
                    float[] fArr = secretMediaViewer.q1;
                    int i13 = i12 + 1;
                    float f42 = secretMediaViewer.F0[i12 / 2] * 2.0f;
                    int i14 = i12;
                    float f43 = f12;
                    float T1 = org.telegram.messenger.g0.T1(f42, f43, f41);
                    fArr[i13] = T1;
                    fArr[i14] = T1;
                    if (secretMediaViewer.q1[i14] > f43) {
                        z9 = false;
                    }
                    i12 = i14 + 2;
                    i11 = 8;
                    f12 = 0.0f;
                }
            } else {
                f22 = f16;
                z9 = true;
            }
            if (secretMediaViewer.k0 != 3) {
                if (secretMediaViewer.w0 != f11 || f14 == f10 || secretMediaViewer.c1) {
                    photoBackgroundDrawable.setAlpha(org.telegram.messenger.qs.e4);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f11 - (Math.min(Math.abs(f14), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.c1) {
                    float f44 = secretMediaViewer.U0;
                    if (f15 > f44) {
                        float width = (f15 - f44) / canvas.getWidth();
                        float f45 = f11;
                        float min = Math.min(f45, width);
                        f24 = 0.3f * min;
                        f23 = f45 - min;
                        f15 = secretMediaViewer.U0;
                        j4 j4Var = secretMediaViewer.x;
                        z10 = j4Var == null && j4Var.getVisibility() == 0;
                        canvas.save();
                        float f46 = f13 - f24;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f15, (secretMediaViewer.e.getHeight() / 2) + f21);
                        canvas.scale(f46, f46);
                        q10 = imageReceiver.q();
                        o4 = imageReceiver.o();
                        i7 = secretMediaViewer.M;
                        if (i7 != 0 && (i10 = secretMediaViewer.N) != 0) {
                            q10 = i7;
                            o4 = i10;
                        }
                        if (z10 && secretMediaViewer.a0 && Math.abs((q10 / o4) - (secretMediaViewer.y.getMeasuredWidth() / secretMediaViewer.y.getMeasuredHeight())) > 0.01f) {
                            q10 = secretMediaViewer.y.getMeasuredWidth();
                            o4 = secretMediaViewer.y.getMeasuredHeight();
                        }
                        float f47 = o4;
                        float f48 = q10;
                        float min2 = Math.min(secretMediaViewer.e.getHeight() / f47, secretMediaViewer.e.getWidth() / f48);
                        int i15 = (int) (f48 * min2);
                        int i16 = (int) (f47 * min2);
                        f25 = (-i15) / 2;
                        float f49 = f20 / f46;
                        float f50 = f25 + f49;
                        f26 = (-i16) / 2;
                        float f51 = f18;
                        float f52 = (i15 / 2) - f49;
                        float f53 = i16 / 2;
                        canvas.clipRect(f50, (f22 / f46) + f26, f52, f53 - (f17 / f46));
                        if (!z9) {
                            path.reset();
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(f50, (f51 / f46) + f26, f52, f53 - (f19 / f46));
                            path.addRoundRect(rectF, secretMediaViewer.q1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z10 || !secretMediaViewer.a0 || !secretMediaViewer.b0 || secretMediaViewer.c0 != 1.0f) {
                            imageReceiver.setAlpha(f23);
                            imageReceiver.y0(f25, f26, i15, i16);
                            imageReceiver.h(canvas, null);
                        }
                        if (z10) {
                            if (!secretMediaViewer.b0 && secretMediaViewer.a0) {
                                secretMediaViewer.b0 = true;
                                secretMediaViewer.c0 = 0.0f;
                                secretMediaViewer.d0 = System.currentTimeMillis();
                            }
                            canvas.translate(f25, f26);
                            secretMediaViewer.y.setAlpha(f23 * secretMediaViewer.c0);
                            secretMediaViewer.x.draw(canvas);
                            if (secretMediaViewer.b0 && secretMediaViewer.c0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j3 = currentTimeMillis - secretMediaViewer.d0;
                                secretMediaViewer.d0 = currentTimeMillis;
                                secretMediaViewer.c0 = (j3 / 200.0f) + secretMediaViewer.c0;
                                secretMediaViewer.e.invalidate();
                                if (secretMediaViewer.c0 > 1.0f) {
                                    secretMediaViewer.c0 = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f23 = 1.0f;
            f24 = 0.0f;
            j4 j4Var2 = secretMediaViewer.x;
            if (j4Var2 == null) {
            }
            canvas.save();
            float f462 = f13 - f24;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f15, (secretMediaViewer.e.getHeight() / 2) + f21);
            canvas.scale(f462, f462);
            q10 = imageReceiver.q();
            o4 = imageReceiver.o();
            i7 = secretMediaViewer.M;
            if (i7 != 0) {
                q10 = i7;
                o4 = i10;
            }
            if (z10) {
                q10 = secretMediaViewer.y.getMeasuredWidth();
                o4 = secretMediaViewer.y.getMeasuredHeight();
            }
            float f472 = o4;
            float f482 = q10;
            float min22 = Math.min(secretMediaViewer.e.getHeight() / f472, secretMediaViewer.e.getWidth() / f482);
            int i152 = (int) (f482 * min22);
            int i162 = (int) (f472 * min22);
            f25 = (-i152) / 2;
            float f492 = f20 / f462;
            float f502 = f25 + f492;
            f26 = (-i162) / 2;
            float f512 = f18;
            float f522 = (i152 / 2) - f492;
            float f532 = i162 / 2;
            canvas.clipRect(f502, (f22 / f462) + f26, f522, f532 - (f17 / f462));
            if (!z9) {
            }
            if (z10) {
            }
            imageReceiver.setAlpha(f23);
            imageReceiver.y0(f25, f26, i152, i162);
            imageReceiver.h(canvas, null);
            if (z10) {
            }
            canvas.restore();
        }
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = v1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = v1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    v1 = secretMediaViewer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return v1 != null;
    }

    public final void c(float f10, float f11, float f12, boolean z9) {
        if (this.w0 == f10 && this.u0 == f11 && this.v0 == f12) {
            return;
        }
        this.c1 = z9;
        this.z0 = f10;
        this.x0 = f11;
        this.y0 = f12;
        this.H0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.I0.setInterpolator(this.K0);
        this.I0.setDuration(org.telegram.messenger.qs.Z3);
        this.I0.addListener(new jz0(this, 3));
        this.I0.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r2 > r3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r2 > r3) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z9) {
        float f10 = this.u0;
        float f11 = this.v0;
        o(this.w0);
        float f12 = this.u0;
        float f13 = this.T0;
        if (f12 >= f13) {
            f13 = this.U0;
        }
        f10 = f13;
        float f14 = this.v0;
        float f15 = this.V0;
        if (f14 >= f15) {
            f15 = this.W0;
        }
        f11 = f15;
        c(this.w0, f10, f11, z9);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.f0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.f0.f1()))) {
                if (this.J && !this.H) {
                    this.I = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.f1 = true;
                    return;
                }
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.i0) {
            if (i7 == org.telegram.messenger.qs.l0) {
                if (this.f0.f1() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.J && !this.H) {
                        this.I = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.f1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f0 == null || this.n == null || ((Long) objArr[0]).longValue() != this.w) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (this.f0.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                    this.f0.k.destroyTime = keyAt;
                    this.n.invalidate();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z9, boolean z10) {
        wq0 wq0Var;
        kp0 kp0Var;
        Runnable runnable;
        Runnable runnable2;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        boolean z11;
        int i7;
        int i10;
        Bitmap bitmap;
        if (this.b != null && this.h0) {
            if (this.k0 != 0 && Math.abs(this.l0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable3 = this.m0;
                if (runnable3 != null) {
                    runnable3.run();
                    this.m0 = null;
                }
                this.k0 = 0;
            }
            if (this.k0 == 0 && (!this.o1 || !z10)) {
                Activity activity = this.b;
                int i11 = 1;
                if (activity != null) {
                    org.telegram.messenger.g0.m3(activity, this.m1);
                    org.telegram.messenger.g0.t3(this.b, this.l1, true);
                    Activity activity2 = this.b;
                    if (activity2 instanceof LaunchActivity) {
                        ((LaunchActivity) activity2).x(this.l1);
                    } else {
                        org.telegram.messenger.g0.t3(activity2, this.l1, true);
                    }
                }
                bg.v0 v0Var = this.j1;
                if (v0Var != null) {
                    v0Var.b();
                    this.j1 = null;
                }
                org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.w);
                org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.l0);
                org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.i0);
                this.i0 = false;
                System.currentTimeMillis();
                uq0 uq0Var = this.L;
                if (uq0Var != null) {
                    org.telegram.messenger.ij ijVar = this.f0;
                    TLRPC.MessageMedia messageMedia = ijVar.k.media;
                    if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                        wq0Var = uq0Var.E(ijVar, null, 0, true, false);
                        kp0Var = this.D;
                        if (kp0Var != null) {
                            kp0Var.g0();
                        }
                        PhotoBackgroundDrawable photoBackgroundDrawable = this.j0;
                        if (z9) {
                            l(false, true);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<bi.x5, Float>) View.SCALE_X, 0.9f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<bi.x5, Float>) View.SCALE_Y, 0.9f);
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                            org.telegram.ui.Components.r7 r7Var = this.F;
                            Property property = View.ALPHA;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7Var, (Property<org.telegram.ui.Components.r7, Float>) property, 0.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Y, (Property<vp0, Float>) property, 0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                            lz0 lz0Var = this.S;
                            animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(lz0Var, lz0Var.n, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<lz0, Float>) property, 0.0f));
                            this.k0 = 2;
                            this.m0 = new dz0(this, wq0Var, i11);
                            animatorSet.setDuration(200L);
                            animatorSet.addListener(new jz0(this, 2));
                            this.l0 = System.currentTimeMillis();
                            runnable = null;
                            this.e.setLayerType(2, null);
                            animatorSet.start();
                        } else {
                            this.k0 = 3;
                            this.e.invalidate();
                            this.I0 = new AnimatorSet();
                            if (wq0Var != null) {
                                ImageReceiver imageReceiver = wq0Var.a;
                                Drawable drawable = imageReceiver.a0;
                                c11 = 7;
                                if (drawable instanceof BitmapDrawable) {
                                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                                } else {
                                    Drawable drawable2 = imageReceiver.m0;
                                    bitmap = drawable2 instanceof BitmapDrawable ? ((BitmapDrawable) drawable2).getBitmap() : null;
                                }
                                if (bitmap == null || z10 || this.n1 != null) {
                                    c10 = 3;
                                } else {
                                    wq0Var.a.O0(false, true);
                                    RectF rectF = wq0Var.a.P0;
                                    float f10 = rectF.right - rectF.left;
                                    c12 = 6;
                                    float f11 = rectF.bottom - rectF.top;
                                    Point point = org.telegram.messenger.g0.q;
                                    c13 = 5;
                                    c14 = 4;
                                    c10 = 3;
                                    this.z0 = Math.max(f10 / point.x, f11 / (point.y + org.telegram.messenger.g0.m));
                                    float f12 = wq0Var.b;
                                    float f13 = rectF.left;
                                    this.x0 = ((f10 / 2.0f) + (f12 + f13)) - (r8 / 2);
                                    this.y0 = ((f11 / 2.0f) + (wq0Var.c + rectF.top)) - (r7 / 2);
                                    this.E0 = Math.abs(f13 - wq0Var.a.K0);
                                    int abs = (int) Math.abs(rectF.top - wq0Var.a.L0);
                                    wq0Var.d.getLocationInWindow(new int[2]);
                                    float f14 = (r8[1] - (wq0Var.c + rectF.top)) + wq0Var.j;
                                    this.A0 = f14;
                                    float f15 = abs;
                                    this.A0 = Math.max(0.0f, Math.max(f14, f15));
                                    float height = (((wq0Var.c + rectF.top) + ((int) f11)) - (wq0Var.d.getHeight() + r8[1])) + wq0Var.i;
                                    this.B0 = height;
                                    this.B0 = Math.max(0.0f, Math.max(height, f15));
                                    this.C0 = 0.0f;
                                    this.C0 = Math.max(0.0f, Math.max(0.0f, f15));
                                    this.D0 = 0.0f;
                                    this.D0 = Math.max(0.0f, Math.max(0.0f, f15));
                                    this.H0 = System.currentTimeMillis();
                                    this.c1 = true;
                                    this.G0 = false;
                                    l(false, true);
                                    z11 = this.J;
                                    q0 q0Var = this.t1;
                                    if (z11) {
                                        i7 = 0;
                                        ImageReceiver imageReceiver2 = this.h;
                                        imageReceiver2.l1 = true;
                                        AnimatorSet animatorSet2 = this.I0;
                                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, q0Var, 0.0f, 1.0f);
                                        org.telegram.ui.Components.r7 r7Var2 = this.F;
                                        Property property2 = View.ALPHA;
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r7Var2, (Property<org.telegram.ui.Components.r7, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Y, (Property<vp0, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                                        lz0 lz0Var2 = this.S;
                                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(lz0Var2, lz0Var2.n, 0.0f);
                                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.S, (Property<lz0, Float>) property2, 0.0f);
                                        i10 = 2;
                                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<fi.m3, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(imageReceiver2, org.telegram.ui.Components.m6.c, 0.0f);
                                        Animator[] animatorArr = new Animator[9];
                                        animatorArr[0] = ofInt2;
                                        animatorArr[1] = ofFloat6;
                                        animatorArr[2] = ofFloat7;
                                        animatorArr[c10] = ofFloat8;
                                        animatorArr[c14] = ofFloat9;
                                        animatorArr[c13] = ofFloat10;
                                        animatorArr[c12] = ofFloat11;
                                        animatorArr[c11] = ofFloat12;
                                        animatorArr[8] = ofFloat13;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        this.b0 = false;
                                        this.a0 = false;
                                        AnimatorSet animatorSet3 = this.I0;
                                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, q0Var, 0.0f, 1.0f);
                                        org.telegram.ui.Components.r7 r7Var3 = this.F;
                                        Property property3 = View.ALPHA;
                                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(r7Var3, (Property<org.telegram.ui.Components.r7, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.Y, (Property<vp0, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                                        lz0 lz0Var3 = this.S;
                                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(lz0Var3, lz0Var3.n, 0.0f);
                                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.S, (Property<lz0, Float>) property3, 0.0f);
                                        i7 = 0;
                                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<fi.m3, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(this, this.s1, 0.0f);
                                        Animator[] animatorArr2 = new Animator[9];
                                        animatorArr2[0] = ofInt3;
                                        animatorArr2[1] = ofFloat14;
                                        animatorArr2[2] = ofFloat15;
                                        animatorArr2[c10] = ofFloat16;
                                        animatorArr2[c14] = ofFloat17;
                                        animatorArr2[c13] = ofFloat18;
                                        animatorArr2[c12] = ofFloat19;
                                        animatorArr2[c11] = ofFloat20;
                                        animatorArr2[8] = ofFloat21;
                                        animatorSet3.playTogether(animatorArr2);
                                        i10 = 2;
                                    }
                                    this.m0 = new dz0(this, wq0Var, i7);
                                    this.I0.setInterpolator(new DecelerateInterpolator());
                                    this.I0.setDuration(250L);
                                    this.I0.addListener(new org.telegram.ui.Components.v50(14, this, wq0Var));
                                    this.l0 = System.currentTimeMillis();
                                    this.e.setLayerType(i10, null);
                                    this.I0.start();
                                    runnable = null;
                                }
                            } else {
                                c10 = 3;
                                c11 = 7;
                            }
                            c12 = 6;
                            c13 = 5;
                            c14 = 4;
                            int i12 = org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m;
                            if (this.v0 < 0.0f) {
                                i12 = -i12;
                            }
                            this.y0 = i12;
                            this.G0 = false;
                            l(false, true);
                            z11 = this.J;
                            q0 q0Var2 = this.t1;
                            if (z11) {
                            }
                            this.m0 = new dz0(this, wq0Var, i7);
                            this.I0.setInterpolator(new DecelerateInterpolator());
                            this.I0.setDuration(250L);
                            this.I0.addListener(new org.telegram.ui.Components.v50(14, this, wq0Var));
                            this.l0 = System.currentTimeMillis();
                            this.e.setLayerType(i10, null);
                            this.I0.start();
                            runnable = null;
                        }
                        runnable2 = this.n1;
                        if (runnable2 != null) {
                            runnable2.run();
                            this.n1 = runnable;
                        }
                        return true;
                    }
                }
                wq0Var = null;
                kp0Var = this.D;
                if (kp0Var != null) {
                }
                PhotoBackgroundDrawable photoBackgroundDrawable2 = this.j0;
                if (z9) {
                }
                runnable2 = this.n1;
                if (runnable2 != null) {
                }
                return true;
            }
        }
        return false;
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public final void h(org.telegram.messenger.ij ijVar, uk ukVar, ie ieVar, bi.d3 d3Var) {
        wq0 E;
        ?? r17;
        String str;
        Bitmap bitmap;
        int i7;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        boolean z9;
        File M;
        if (this.b == null || !ijVar.n5() || ukVar == null || (E = ukVar.E(ijVar, null, 0, true, false)) == null) {
            return;
        }
        this.o1 = ijVar.k.ttl == Integer.MAX_VALUE;
        this.n1 = d3Var;
        this.L = ukVar;
        System.currentTimeMillis();
        this.i0 = true;
        this.h0 = true;
        this.n0 = false;
        j4 j4Var = this.x;
        if (j4Var != null) {
            j4Var.setVisibility(4);
        }
        j();
        this.L0 = 0.0f;
        this.M0 = 1.0f;
        this.N0 = 0.0f;
        this.O0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
        this.R0 = 0.0f;
        this.S0 = 0.0f;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = false;
        this.b1 = true;
        o(this.w0);
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.j0;
        photoBackgroundDrawable2.setAlpha(0);
        this.e.setAlpha(1.0f);
        this.e.setVisibility(0);
        this.n.setAlpha(1.0f);
        this.J = false;
        this.H = false;
        this.I = false;
        this.K = true;
        ImageReceiver imageReceiver = this.h;
        imageReceiver.l1 = false;
        this.M = 0;
        this.N = 0;
        RectF rectF = new RectF(E.a.P0);
        rectF.left = Math.max(rectF.left, E.a.K0);
        rectF.top = Math.max(rectF.top, E.a.L0);
        rectF.right = Math.min(rectF.right, E.a.y());
        rectF.bottom = Math.min(rectF.bottom, E.a.A());
        float width = rectF.width();
        float height = rectF.height();
        Point point = org.telegram.messenger.g0.q;
        this.w0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.m));
        int[] iArr = E.h;
        if (iArr != null) {
            this.F0 = new int[iArr.length];
            r17 = 1;
            int i10 = 0;
            while (true) {
                int[] iArr2 = E.h;
                if (i10 >= iArr2.length) {
                    break;
                }
                this.F0[i10] = iArr2[i10];
                i10++;
            }
        } else {
            r17 = 1;
            this.F0 = null;
        }
        float f11 = E.b;
        float f12 = rectF.left;
        this.u0 = ((width / 2.0f) + (f11 + f12)) - (r10 / 2);
        this.v0 = ((height / 2.0f) + (E.c + rectF.top)) - (r8 / 2);
        this.t0 = Math.abs(f12 - E.a.K0);
        int abs = (int) Math.abs(rectF.top - E.a.L0);
        E.d.getLocationInWindow(new int[2]);
        float f13 = (r8[r17] - (E.c + rectF.top)) + E.j;
        this.p0 = f13;
        float f14 = abs;
        this.p0 = Math.max(0.0f, Math.max(f13, f14));
        float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r8[r17])) + E.i;
        this.q0 = height2;
        this.q0 = Math.max(0.0f, Math.max(height2, f14));
        this.r0 = 0.0f;
        this.r0 = Math.max(0.0f, Math.max(0.0f, f14));
        this.s0 = 0.0f;
        this.s0 = Math.max(0.0f, Math.max(0.0f, f14));
        this.H0 = System.currentTimeMillis();
        this.x0 = 0.0f;
        this.y0 = 0.0f;
        this.B0 = 0.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.A0 = 0.0f;
        this.C0 = 0.0f;
        this.z0 = 1.0f;
        boolean z10 = r17;
        this.G0 = z10;
        this.c1 = z10;
        bg.v0 v0Var = this.j1;
        if (v0Var != null) {
            v0Var.b();
            this.j1 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.j1 = launchActivity != null ? new bg.v0(launchActivity, z10) : null;
        org.telegram.messenger.qs.f(this.a).b(this, org.telegram.messenger.qs.w);
        org.telegram.messenger.qs.f(this.a).b(this, org.telegram.messenger.qs.l0);
        org.telegram.messenger.qs.f(this.a).b(this, org.telegram.messenger.qs.i0);
        this.w = org.telegram.messenger.ij.C1(ijVar.k.peer_id);
        this.f0 = ijVar;
        TLRPC.Document F0 = ijVar.F0();
        org.telegram.messenger.jc jcVar = this.g0;
        if (jcVar != null) {
            jcVar.a();
            this.g0 = null;
        }
        ImageReceiver imageReceiver2 = E.a;
        Drawable drawable = imageReceiver2.a0;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            str = imageReceiver2.Y;
        } else {
            Drawable drawable2 = imageReceiver2.m0;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
                str = null;
            } else {
                str = null;
                bitmap = null;
            }
        }
        this.g0 = bitmap != null ? new org.telegram.messenger.jc(bitmap, str, 0) : null;
        this.S.setVisibility(8);
        if (F0 != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= F0.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    this.M = tL_documentAttributeVideo.w;
                    this.N = tL_documentAttributeVideo.h;
                    break;
                }
                i11++;
            }
            if (org.telegram.messenger.ij.t3(F0, false)) {
                this.F.setTitle(org.telegram.messenger.hd.M0(2131751410, null));
                String str2 = ijVar.k.attachPath;
                f10 = 1.0f;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                i7 = 2;
                imageReceiver.p0((str2 == null || !ijVar.w0) ? org.telegram.messenger.hc.b(F0) : org.telegram.messenger.hc.g(str2), null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, ijVar, 1);
            } else {
                i7 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.Z = 1;
                this.F.setTitle(org.telegram.messenger.hd.M0(2131751408, null));
                File file = new File(ijVar.k.attachPath);
                if (file.exists()) {
                    i(file);
                } else {
                    if (ijVar.E3()) {
                        org.telegram.messenger.w7.G(this.a);
                        M = org.telegram.messenger.w7.J(F0, null, true, true);
                    } else {
                        org.telegram.messenger.w7.G(this.a);
                        M = org.telegram.messenger.w7.M(ijVar.k, false, true);
                    }
                    File file2 = new File(M.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        M = file2;
                    }
                    i(M);
                }
                this.J = true;
                this.S.setVisibility(0);
                imageReceiver.p0(null, null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, ijVar, 2);
            }
        } else {
            i7 = 2;
            photoBackgroundDrawable = photoBackgroundDrawable2;
            f10 = 1.0f;
            this.F.setTitle(org.telegram.messenger.hd.M0(2131751409, null));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ijVar.n0, org.telegram.messenger.g0.Z0(false), false, null, false);
            imageReceiver.p0(org.telegram.messenger.hc.f(w10, ijVar.l0), null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, ijVar, 2);
            if (w10 != null) {
                this.M = w10.w;
                this.N = w10.h;
            }
        }
        k(ijVar, "", false);
        k(ijVar, ijVar.z, true);
        n(true, false);
        l(false, false);
        this.U.a(true, true);
        if (this.o1) {
            kz0 kz0Var = this.n;
            kz0Var.e = true;
            TextPaint textPaint = kz0Var.r;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
            textPaint.setColor(-1);
            StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            kz0Var.s = staticLayout;
            kz0Var.w = staticLayout.getLineCount() > 0 ? kz0Var.s.getLineWidth(0) : 0.0f;
            kz0Var.x = kz0Var.s.getHeight();
            kz0Var.invalidate();
            this.n.setOnClickListener(new my0(this, 4));
        } else {
            this.n.setOnClickListener(null);
        }
        try {
            if (this.d.getParent() != null) {
                ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
            }
            z9 = true;
        } catch (Exception e10) {
            z9 = true;
            org.telegram.messenger.a8.g(e10, true);
        }
        ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
        this.n.invalidate();
        this.s = z9;
        Window window = this.b.getWindow();
        int i12 = Build.VERSION.SDK_INT;
        this.m1 = i12 >= 26 ? c8.zc.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        org.telegram.messenger.g0.m3(this.b, false);
        org.telegram.messenger.g0.o3(this.d, false);
        Activity activity = this.b;
        if (activity instanceof LaunchActivity) {
            this.l1 = i12 >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
            ((LaunchActivity) this.b).x(-16777216);
        } else {
            this.l1 = window.getNavigationBarColor();
            org.telegram.messenger.g0.t3(this.b, -16777216, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        org.telegram.ui.Components.r7 r7Var = this.F;
        Property property = View.ALPHA;
        float[] fArr = new float[i7];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, (Property<org.telegram.ui.Components.r7, Float>) property, fArr);
        float[] fArr2 = new float[i7];
        // fill-array-data instruction
        fArr2[0] = 0.0f;
        fArr2[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Y, (Property<vp0, Float>) property, fArr2);
        float[] fArr3 = new float[i7];
        // fill-array-data instruction
        fArr3[0] = 0.0f;
        fArr3[1] = 1.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, (Property<fi.m3, Float>) property, fArr3);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0, org.telegram.messenger.qs.e4);
        float[] fArr4 = new float[i7];
        // fill-array-data instruction
        fArr4[0] = 0.0f;
        fArr4[1] = 1.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.t1, fArr4);
        lz0 lz0Var = this.S;
        int i13 = i7;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(lz0Var, lz0Var.n, f10);
        lz0 lz0Var2 = this.S;
        if (!this.J) {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lz0Var2, (Property<lz0, Float>) property, f10);
        Animator[] animatorArr = new Animator[7];
        animatorArr[0] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[i13] = ofFloat3;
        animatorArr[3] = ofInt;
        animatorArr[4] = ofFloat4;
        int i14 = 5;
        animatorArr[5] = ofFloat5;
        animatorArr[6] = ofFloat6;
        animatorSet.playTogether(animatorArr);
        this.k0 = 3;
        this.m0 = new mc0(this, ieVar, ijVar, 29);
        this.I0.setDuration(250L);
        this.I0.addListener(new jz0(this, 0));
        this.l0 = System.currentTimeMillis();
        if (org.telegram.messenger.iz.o() == 0) {
            this.e.setLayerType(i13, null);
        }
        this.I0.setInterpolator(new DecelerateInterpolator());
        photoBackgroundDrawable.b = 0;
        photoBackgroundDrawable.a = new by0(i14, this, E);
        this.I0.start();
    }

    public final void i(File file) {
        if (this.b == null) {
            return;
        }
        j();
        if (this.y == null) {
            j4 j4Var = new j4(this.b);
            this.x = j4Var;
            j4Var.setVisibility(0);
            this.e.addView(this.x, 0, c8.ha.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, c8.ha.e(-1, -1, 17));
        }
        this.a0 = false;
        this.b0 = false;
        this.y.setAlpha(1.0f);
        if (this.D == null) {
            kp0 kp0Var = new kp0(this, 1);
            this.D = kp0Var;
            kp0Var.A0(this.y);
            this.D.J = new j2.n(21, this, file);
        }
        this.D.j0(Uri.fromFile(file), "other");
        this.D.u0(true);
        this.U.a(true, true);
    }

    public final void j() {
        kp0 kp0Var = this.D;
        if (kp0Var != null) {
            this.Z = 0;
            kp0Var.m0();
            this.D = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        j4 j4Var = this.x;
        if (j4Var != null) {
            this.e.removeView(j4Var);
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.E = false;
    }

    public final void k(org.telegram.messenger.ij ijVar, CharSequence charSequence, boolean z9) {
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.r5.cloneSpans(charSequence, 3);
        if (this.Y == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.V = frameLayout;
            this.X.setContainer(frameLayout);
            vp0 vp0Var = new vp0(this, this.e.getContext(), this.X, this.V, 1);
            this.Y = vp0Var;
            this.X.setScrollView(vp0Var);
            this.V.setClipChildren(false);
            this.Y.addView(this.V, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Y, c8.ha.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.W.n(this.e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.X.getParent() != this.V) {
            this.X.setMeasureAllChildren(true);
            this.V.addView(this.X, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.X.getCurrentView().getText());
        lq0 lq0Var = this.X;
        TextView nextView = z9 ? lq0Var.getNextView() : lq0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.X.getCurrentView().setSingleLine(false);
            this.X.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.X.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.X.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.X.getCurrentView().setEllipsize(null);
            this.X.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        vp0 vp0Var2 = this.Y;
        vp0Var2.l0 = false;
        if (z9) {
            TransitionManager.endTransitions(vp0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new hz0(this, isEmpty2, isEmpty, 1)).addTransition(new hz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Y.l0 = true;
                duration.addTransition(new org.telegram.ui.Components.nk0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.X);
            }
            TransitionManager.beginDelayedTransition(this.Y, duration);
            z10 = true;
        } else {
            this.X.getCurrentView().setText((CharSequence) null);
            vp0 vp0Var3 = this.Y;
            if (vp0Var3 != null) {
                vp0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        if (isEmpty) {
            this.X.a(null, z9, false);
            this.X.getCurrentView().setTextColor(-1);
            lq0 lq0Var2 = this.X;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            lq0Var2.b(4, z11);
            this.X.setTag(null);
        } else {
            org.telegram.ui.ActionBar.k6.P();
            TLRPC.Message message = ijVar.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k21.M0())) {
                if (ijVar.k.entities.isEmpty()) {
                    cloneSpans = org.telegram.messenger.i6.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    ijVar.c(spannableString, true, false);
                    if (org.telegram.messenger.ij.M4(ijVar.k)) {
                        org.telegram.messenger.ij.h(ijVar.Q3(), spannableString, false, 3, (int) ijVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.i6.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.X.setTag(cloneSpans);
            try {
                this.X.a(cloneSpans, z9, false);
                vp0 vp0Var4 = this.Y;
                if (vp0Var4 != null) {
                    vp0Var4.H(vp0Var4.getWidth(), vp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.X.setVisibility(this.i0 ? 0 : 4);
        }
        if (this.X.getCurrentView() instanceof kq0) {
            ((kq0) this.X.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z9, boolean z10) {
        boolean z11 = this.J && z9;
        if (this.k1 == z11 && z10) {
            return;
        }
        this.k1 = z11;
        this.T.animate().cancel();
        if (z10) {
            this.T.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            return;
        }
        this.T.setScaleX(z11 ? 1.0f : 0.6f);
        this.T.setScaleY(z11 ? 1.0f : 0.6f);
        this.T.setAlpha(z11 ? 1.0f : 0.0f);
    }

    public final void m() {
        this.r.r(true);
        String M0 = org.telegram.messenger.hd.M0(this.J ? 2131743581 : 2131747261, null);
        fi.m3 m3Var = this.r;
        m3Var.h = fi.m3.a(M0, m3Var.getTextPaint());
        this.r.u(M0);
        this.r.n(12.0f, 7.0f, 11.0f, 7.0f);
        fi.m3 m3Var2 = this.r;
        m3Var2.getClass();
        m3Var2.e0 = org.telegram.messenger.g0.L(2);
        fi.m3 m3Var3 = this.r;
        m3Var3.getClass();
        m3Var3.d0 = 0.0f;
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        zg0Var.start();
        m3Var3.m(zg0Var);
        this.r.w();
        org.telegram.messenger.qp.e1().edit().putInt("viewoncehint", org.telegram.messenger.qp.e1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z9, boolean z10) {
        dz0 dz0Var = this.p1;
        org.telegram.messenger.g0.r(dz0Var);
        if (z9 && this.J) {
            org.telegram.messenger.g0.i3(dz0Var, 3000L);
        }
        if (z9) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z9);
        this.i0 = z9;
        l(z9, z10);
        if (!z10) {
            this.F.setAlpha(z9 ? 1.0f : 0.0f);
            this.Y.setAlpha(z9 ? 1.0f : 0.0f);
            this.R.setAlpha(z9 ? 1.0f : 0.0f);
            this.f.setAlpha(z9 ? 1.0f : 0.0f);
            if (z9) {
                return;
            }
            this.F.setVisibility(8);
            this.Y.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.r7 r7Var = this.F;
        Property property = View.ALPHA;
        int i7 = 1;
        arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<org.telegram.ui.Components.r7, Float>) property, z9 ? 1.0f : 0.0f));
        lz0 lz0Var = this.S;
        arrayList.add(ObjectAnimator.ofFloat(lz0Var, lz0Var.n, z9 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<vp0, Float>) property, z9 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.G = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z9) {
            this.G.addListener(new jz0(this, i7));
        }
        this.G.setDuration(200L);
        this.G.start();
    }

    public final void o(float f10) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.M0 * f10) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.N0 * f10) - this.e.getHeight())) / 2;
        if (width > 0) {
            this.T0 = -width;
            this.U0 = width;
        } else {
            this.U0 = 0.0f;
            this.T0 = 0.0f;
        }
        if (height > 0) {
            this.V0 = -height;
            this.W0 = height;
        } else {
            this.W0 = 0.0f;
            this.V0 = 0.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r8 > r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r0 > r1) goto L18;
     */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f10 = this.w0;
        if ((f10 == 1.0f && (this.v0 != 0.0f || this.u0 != 0.0f)) || this.H0 != 0 || this.k0 != 0) {
            return false;
        }
        if (f10 == 1.0f) {
            float v = org.telegram.messenger.camera.q.v(3.0f, this.w0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.u0, motionEvent.getX() - (this.e.getWidth() / 2));
            float v10 = org.telegram.messenger.camera.q.v(3.0f, this.w0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.v0, motionEvent.getY() - (this.e.getHeight() / 2));
            o(3.0f);
            float f11 = this.T0;
            if (v >= f11) {
                f11 = this.U0;
            }
            v = f11;
            float f12 = this.V0;
            if (v10 >= f12) {
                f12 = this.W0;
            }
            v10 = f12;
            c(3.0f, v, v10, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.Z0 = true;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.w0 == 1.0f) {
            return false;
        }
        this.e1.a();
        this.e1.c(Math.round(this.u0), Math.round(this.v0), Math.round(f10), Math.round(f11), (int) this.T0, (int) this.U0, (int) this.V0, (int) this.W0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.d1) {
            return false;
        }
        if (this.D == null || !this.i0 || motionEvent.getX() < this.T.getX() || motionEvent.getY() < this.T.getY() || motionEvent.getX() > this.T.getX() + this.T.getMeasuredWidth() || motionEvent.getX() > this.T.getX() + this.T.getMeasuredWidth()) {
            n(!this.i0, true);
            return true;
        }
        this.D.u0(!r5.d.u());
        if (this.D.d.u()) {
            n(true, true);
            return true;
        }
        l(true, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.c0 = f10;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
