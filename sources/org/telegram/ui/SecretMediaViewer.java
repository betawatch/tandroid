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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements org.telegram.messenger.us, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer v1;
    public float A0;
    public float B0;
    public float C0;
    public uq0 D;
    public float D0;
    public boolean E;
    public float E0;
    public kg.g1 F;
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
    public es0 L;
    public float L0;
    public int M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.w61 O;
    public float O0;
    public do0 P;
    public float P0;
    public org.telegram.ui.ActionBar.u5 Q;
    public float Q0;
    public View R;
    public float R0;
    public b11 S;
    public float S0;
    public ImageView T;
    public float T0;
    public org.telegram.ui.Components.kf0 U;
    public float U0;
    public FrameLayout V;
    public float V0;
    public eq0 W;
    public float W0;
    public wr0 X;
    public boolean X0;
    public fr0 Y;
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
    public l0 d;
    public long d0;
    public boolean d1;
    public fg.i e;
    public WindowInsets e0;
    public org.telegram.ui.Components.zl0 e1;
    public View f;
    public org.telegram.messenger.jj f0;
    public boolean f1;
    public org.telegram.messenger.kc g0;
    public final r01 g1;
    public boolean h0;
    public final int[] h1;
    public final int[] i1;
    public aa0 j1;
    public int k0;
    public boolean k1;
    public long l0;
    public int l1;
    public Runnable m0;
    public boolean m1;
    public a11 n;
    public boolean n0;
    public Runnable n1;
    public float o0;
    public boolean o1;
    public float p0;
    public final r01 p1;
    public float q0;
    public float[] q1;
    public vh.p2 r;
    public float r0;
    public final Path r1;
    public boolean s;
    public float s0;
    public final s0 s1;
    public float t0;
    public final s0 t1;
    public float u0;
    public boolean u1;
    public float v0;
    public long w;
    public float w0;
    public k4 x;
    public float x0;
    public TextureView y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean i0 = true;
    public final PhotoBackgroundDrawable j0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public et0 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            et0 et0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (et0Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    et0Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            aa0 aa0Var = secretMediaViewer.j1;
            if (aa0Var != null) {
                aa0Var.c(secretMediaViewer.h0 && i10 == 255);
            }
            super.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13 + org.telegram.messenger.i0.n);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(Rect rect) {
            rect.bottom += org.telegram.messenger.i0.n;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.w0 = 1.0f;
        this.K0 = new DecelerateInterpolator(1.5f);
        this.M0 = 1.0f;
        this.b1 = true;
        this.g1 = new r01(this, 2);
        this.h1 = new int[2];
        this.i1 = new int[2];
        this.p1 = new r01(this, 3);
        this.r1 = new Path();
        this.s1 = new s0("videoCrossfadeAlpha", 5);
        this.t1 = new s0("animationValue", 6);
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
        float f7;
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
        boolean z10;
        float f22;
        float f23;
        boolean z11;
        int q6;
        int o10;
        int i10;
        float f24;
        float f25;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.j0;
        Path path = secretMediaViewer.r1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.h0) {
            if (secretMediaViewer.I0 != null) {
                org.telegram.ui.Components.zl0 zl0Var = secretMediaViewer.e1;
                if (!zl0Var.q) {
                    zl0Var.a();
                }
                float f26 = secretMediaViewer.w0;
                float f27 = secretMediaViewer.z0;
                float f28 = secretMediaViewer.animationValue;
                f12 = ((f27 - f26) * f28) + f26;
                float f29 = secretMediaViewer.v0;
                float z12 = c3.i0.z(secretMediaViewer.y0, f29, f28, f29);
                float f30 = secretMediaViewer.u0;
                f14 = c3.i0.z(secretMediaViewer.x0, f30, f28, f30);
                f7 = -1.0f;
                float f31 = secretMediaViewer.p0;
                f10 = 1.0f;
                f15 = c3.i0.z(secretMediaViewer.A0, f31, f28, f31);
                float f32 = secretMediaViewer.q0;
                f11 = 0.0f;
                f16 = c3.i0.z(secretMediaViewer.B0, f32, f28, f32);
                float f33 = secretMediaViewer.r0;
                f17 = c3.i0.z(secretMediaViewer.C0, f33, f28, f33);
                float f34 = secretMediaViewer.s0;
                float z13 = c3.i0.z(secretMediaViewer.D0, f34, f28, f34);
                float f35 = secretMediaViewer.t0;
                float z14 = c3.i0.z(secretMediaViewer.E0, f35, f28, f35);
                float f36 = (f27 == 1.0f && f26 == 1.0f && f30 == 0.0f) ? z12 : -1.0f;
                secretMediaViewer.e.invalidate();
                f19 = z14;
                f20 = z12;
                f13 = f36;
                f18 = z13;
            } else {
                f7 = -1.0f;
                f10 = 1.0f;
                f11 = 0.0f;
                if (secretMediaViewer.H0 != 0) {
                    secretMediaViewer.u0 = secretMediaViewer.x0;
                    secretMediaViewer.v0 = secretMediaViewer.y0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.p0 = secretMediaViewer.A0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    secretMediaViewer.s0 = secretMediaViewer.D0;
                    secretMediaViewer.t0 = secretMediaViewer.E0;
                    float f37 = secretMediaViewer.z0;
                    secretMediaViewer.w0 = f37;
                    secretMediaViewer.H0 = 0L;
                    secretMediaViewer.o(f37);
                    secretMediaViewer.c1 = false;
                }
                org.telegram.ui.Components.zl0 zl0Var2 = secretMediaViewer.e1;
                if (!zl0Var2.q && zl0Var2.b()) {
                    org.telegram.ui.Components.zl0 zl0Var3 = secretMediaViewer.e1;
                    float f38 = zl0Var3.b;
                    if (f38 < secretMediaViewer.U0 && f38 > secretMediaViewer.T0) {
                        secretMediaViewer.u0 = zl0Var3.j;
                    }
                    float f39 = zl0Var3.c;
                    if (f39 < secretMediaViewer.W0 && f39 > secretMediaViewer.V0) {
                        secretMediaViewer.v0 = zl0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f12 = secretMediaViewer.w0;
                f13 = secretMediaViewer.v0;
                f14 = secretMediaViewer.u0;
                f15 = secretMediaViewer.p0;
                f16 = secretMediaViewer.q0;
                f17 = secretMediaViewer.r0;
                f18 = secretMediaViewer.s0;
                f19 = secretMediaViewer.t0;
                if (secretMediaViewer.Y0) {
                    f20 = f13;
                    f13 = -1.0f;
                } else {
                    f20 = f13;
                }
            }
            if (secretMediaViewer.F0 != null) {
                int i12 = 8;
                if (secretMediaViewer.q1 == null) {
                    secretMediaViewer.q1 = new float[8];
                }
                float f40 = secretMediaViewer.G0 ? secretMediaViewer.animationValue : f10 - secretMediaViewer.animationValue;
                f21 = f15;
                int i13 = 0;
                z10 = true;
                while (i13 < i12) {
                    float[] fArr = secretMediaViewer.q1;
                    int i14 = i13 + 1;
                    float f41 = secretMediaViewer.F0[i13 / 2] * 2.0f;
                    int i15 = i13;
                    float f42 = f11;
                    float T1 = org.telegram.messenger.i0.T1(f41, f42, f40);
                    fArr[i14] = T1;
                    fArr[i15] = T1;
                    if (secretMediaViewer.q1[i15] > f42) {
                        z10 = false;
                    }
                    i13 = i15 + 2;
                    i12 = 8;
                    f11 = 0.0f;
                }
            } else {
                f21 = f15;
                z10 = true;
            }
            if (secretMediaViewer.k0 != 3) {
                if (secretMediaViewer.w0 != f10 || f13 == f7 || secretMediaViewer.c1) {
                    photoBackgroundDrawable.setAlpha(org.telegram.messenger.zs.e4);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f10 - (Math.min(Math.abs(f13), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.c1) {
                    float f43 = secretMediaViewer.U0;
                    if (f14 > f43) {
                        float width = (f14 - f43) / canvas.getWidth();
                        float f44 = f10;
                        float min = Math.min(f44, width);
                        f23 = 0.3f * min;
                        f22 = f44 - min;
                        f14 = secretMediaViewer.U0;
                        k4 k4Var = secretMediaViewer.x;
                        z11 = k4Var == null && k4Var.getVisibility() == 0;
                        canvas.save();
                        float f45 = f12 - f23;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
                        canvas.scale(f45, f45);
                        q6 = imageReceiver.q();
                        o10 = imageReceiver.o();
                        i10 = secretMediaViewer.M;
                        if (i10 != 0 && (i11 = secretMediaViewer.N) != 0) {
                            q6 = i10;
                            o10 = i11;
                        }
                        if (z11 && secretMediaViewer.a0 && Math.abs((q6 / o10) - (secretMediaViewer.y.getMeasuredWidth() / secretMediaViewer.y.getMeasuredHeight())) > 0.01f) {
                            q6 = secretMediaViewer.y.getMeasuredWidth();
                            o10 = secretMediaViewer.y.getMeasuredHeight();
                        }
                        float f46 = o10;
                        float f47 = q6;
                        float min2 = Math.min(secretMediaViewer.e.getHeight() / f46, secretMediaViewer.e.getWidth() / f47);
                        int i16 = (int) (f47 * min2);
                        int i17 = (int) (f46 * min2);
                        f24 = (-i16) / 2;
                        float f48 = f19 / f45;
                        float f49 = f24 + f48;
                        f25 = (-i17) / 2;
                        float f50 = f17;
                        float f51 = (i16 / 2) - f48;
                        float f52 = i17 / 2;
                        canvas.clipRect(f49, (f21 / f45) + f25, f51, f52 - (f16 / f45));
                        if (!z10) {
                            path.reset();
                            RectF rectF = org.telegram.messenger.i0.P;
                            rectF.set(f49, (f50 / f45) + f25, f51, f52 - (f18 / f45));
                            path.addRoundRect(rectF, secretMediaViewer.q1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z11 || !secretMediaViewer.a0 || !secretMediaViewer.b0 || secretMediaViewer.c0 != 1.0f) {
                            imageReceiver.setAlpha(f22);
                            imageReceiver.y0(f24, f25, i16, i17);
                            imageReceiver.h(canvas, null);
                        }
                        if (z11) {
                            if (!secretMediaViewer.b0 && secretMediaViewer.a0) {
                                secretMediaViewer.b0 = true;
                                secretMediaViewer.c0 = 0.0f;
                                secretMediaViewer.d0 = System.currentTimeMillis();
                            }
                            canvas.translate(f24, f25);
                            secretMediaViewer.y.setAlpha(f22 * secretMediaViewer.c0);
                            secretMediaViewer.x.draw(canvas);
                            if (secretMediaViewer.b0 && secretMediaViewer.c0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j10 = currentTimeMillis - secretMediaViewer.d0;
                                secretMediaViewer.d0 = currentTimeMillis;
                                secretMediaViewer.c0 = (j10 / 200.0f) + secretMediaViewer.c0;
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
            f22 = 1.0f;
            f23 = 0.0f;
            k4 k4Var2 = secretMediaViewer.x;
            if (k4Var2 == null) {
            }
            canvas.save();
            float f452 = f12 - f23;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
            canvas.scale(f452, f452);
            q6 = imageReceiver.q();
            o10 = imageReceiver.o();
            i10 = secretMediaViewer.M;
            if (i10 != 0) {
                q6 = i10;
                o10 = i11;
            }
            if (z11) {
                q6 = secretMediaViewer.y.getMeasuredWidth();
                o10 = secretMediaViewer.y.getMeasuredHeight();
            }
            float f462 = o10;
            float f472 = q6;
            float min22 = Math.min(secretMediaViewer.e.getHeight() / f462, secretMediaViewer.e.getWidth() / f472);
            int i162 = (int) (f472 * min22);
            int i172 = (int) (f462 * min22);
            f24 = (-i162) / 2;
            float f482 = f19 / f452;
            float f492 = f24 + f482;
            f25 = (-i172) / 2;
            float f502 = f17;
            float f512 = (i162 / 2) - f482;
            float f522 = i172 / 2;
            canvas.clipRect(f492, (f21 / f452) + f25, f512, f522 - (f16 / f452));
            if (!z10) {
            }
            if (z11) {
            }
            imageReceiver.setAlpha(f22);
            imageReceiver.y0(f24, f25, i162, i172);
            imageReceiver.h(canvas, null);
            if (z11) {
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

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.w0 == f7 && this.u0 == f10 && this.v0 == f11) {
            return;
        }
        this.c1 = z10;
        this.z0 = f7;
        this.x0 = f10;
        this.y0 = f11;
        this.H0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.I0.setInterpolator(this.K0);
        this.I0.setDuration(org.telegram.messenger.zs.Z3);
        this.I0.addListener(new x01(this, 3));
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
    public final void d(boolean z10) {
        float f7 = this.u0;
        float f10 = this.v0;
        o(this.w0);
        float f11 = this.u0;
        float f12 = this.T0;
        if (f11 >= f12) {
            f12 = this.U0;
        }
        f7 = f12;
        float f13 = this.v0;
        float f14 = this.V0;
        if (f13 >= f14) {
            f14 = this.W0;
        }
        f10 = f14;
        c(this.w0, f7, f10, z10);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.w) {
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
        if (i10 != org.telegram.messenger.zs.i0) {
            if (i10 == org.telegram.messenger.zs.l0) {
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
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            int keyAt = sparseArray.keyAt(i12);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (this.f0.f1() == ((Integer) arrayList.get(i13)).intValue()) {
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
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z10, boolean z11) {
        gs0 gs0Var;
        uq0 uq0Var;
        Runnable runnable;
        Runnable runnable2;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        boolean z12;
        int i10;
        int i11;
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
            if (this.k0 == 0 && (!this.o1 || !z11)) {
                Activity activity = this.b;
                int i12 = 1;
                if (activity != null) {
                    org.telegram.messenger.i0.l3(activity, this.m1);
                    org.telegram.messenger.i0.s3(this.b, this.l1, true);
                    Activity activity2 = this.b;
                    if (activity2 instanceof LaunchActivity) {
                        ((LaunchActivity) activity2).x(this.l1);
                    } else {
                        org.telegram.messenger.i0.s3(activity2, this.l1, true);
                    }
                }
                aa0 aa0Var = this.j1;
                if (aa0Var != null) {
                    aa0Var.b();
                    this.j1 = null;
                }
                org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.w);
                org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.l0);
                org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.i0);
                this.i0 = false;
                System.currentTimeMillis();
                es0 es0Var = this.L;
                if (es0Var != null) {
                    org.telegram.messenger.jj jjVar = this.f0;
                    TLRPC.MessageMedia messageMedia = jjVar.k.media;
                    if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                        gs0Var = es0Var.E(jjVar, null, 0, true, false);
                        uq0Var = this.D;
                        if (uq0Var != null) {
                            uq0Var.g0();
                        }
                        PhotoBackgroundDrawable photoBackgroundDrawable = this.j0;
                        if (z10) {
                            l(false, true);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<fg.i, Float>) View.SCALE_X, 0.9f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<fg.i, Float>) View.SCALE_Y, 0.9f);
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.i6.d, 0);
                            kg.g1 g1Var = this.F;
                            Property property = View.ALPHA;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property, 0.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Y, (Property<fr0, Float>) property, 0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                            b11 b11Var = this.S;
                            animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(b11Var, b11Var.n, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<b11, Float>) property, 0.0f));
                            this.k0 = 2;
                            this.m0 = new r01(this, gs0Var, i12);
                            animatorSet.setDuration(200L);
                            animatorSet.addListener(new x01(this, 2));
                            this.l0 = System.currentTimeMillis();
                            runnable = null;
                            this.e.setLayerType(2, null);
                            animatorSet.start();
                        } else {
                            this.k0 = 3;
                            this.e.invalidate();
                            this.I0 = new AnimatorSet();
                            if (gs0Var != null) {
                                ImageReceiver imageReceiver = gs0Var.a;
                                Drawable drawable = imageReceiver.a0;
                                c11 = 7;
                                if (drawable instanceof BitmapDrawable) {
                                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                                } else {
                                    Drawable drawable2 = imageReceiver.m0;
                                    bitmap = drawable2 instanceof BitmapDrawable ? ((BitmapDrawable) drawable2).getBitmap() : null;
                                }
                                if (bitmap == null || z11 || this.n1 != null) {
                                    c10 = 3;
                                } else {
                                    gs0Var.a.O0(false, true);
                                    RectF rectF = gs0Var.a.P0;
                                    float f7 = rectF.right - rectF.left;
                                    c12 = 6;
                                    float f10 = rectF.bottom - rectF.top;
                                    Point point = org.telegram.messenger.i0.q;
                                    c13 = 5;
                                    c14 = 4;
                                    c10 = 3;
                                    this.z0 = Math.max(f7 / point.x, f10 / (point.y + org.telegram.messenger.i0.m));
                                    float f11 = gs0Var.b;
                                    float f12 = rectF.left;
                                    this.x0 = ((f7 / 2.0f) + (f11 + f12)) - (r8 / 2);
                                    this.y0 = ((f10 / 2.0f) + (gs0Var.c + rectF.top)) - (r7 / 2);
                                    this.E0 = Math.abs(f12 - gs0Var.a.K0);
                                    int abs = (int) Math.abs(rectF.top - gs0Var.a.L0);
                                    gs0Var.d.getLocationInWindow(new int[2]);
                                    float f13 = (r8[1] - (gs0Var.c + rectF.top)) + gs0Var.j;
                                    this.A0 = f13;
                                    float f14 = abs;
                                    this.A0 = Math.max(0.0f, Math.max(f13, f14));
                                    float height = (((gs0Var.c + rectF.top) + ((int) f10)) - (gs0Var.d.getHeight() + r8[1])) + gs0Var.i;
                                    this.B0 = height;
                                    this.B0 = Math.max(0.0f, Math.max(height, f14));
                                    this.C0 = 0.0f;
                                    this.C0 = Math.max(0.0f, Math.max(0.0f, f14));
                                    this.D0 = 0.0f;
                                    this.D0 = Math.max(0.0f, Math.max(0.0f, f14));
                                    this.H0 = System.currentTimeMillis();
                                    this.c1 = true;
                                    this.G0 = false;
                                    l(false, true);
                                    z12 = this.J;
                                    int i13 = 9;
                                    s0 s0Var = this.t1;
                                    if (z12) {
                                        i10 = 0;
                                        ImageReceiver imageReceiver2 = this.h;
                                        imageReceiver2.l1 = true;
                                        AnimatorSet animatorSet2 = this.I0;
                                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.i6.d, 0);
                                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, s0Var, 0.0f, 1.0f);
                                        kg.g1 g1Var2 = this.F;
                                        Property property2 = View.ALPHA;
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(g1Var2, (Property<kg.g1, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Y, (Property<fr0, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                                        b11 b11Var2 = this.S;
                                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(b11Var2, b11Var2.n, 0.0f);
                                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.S, (Property<b11, Float>) property2, 0.0f);
                                        i11 = 2;
                                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<vh.p2, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(imageReceiver2, org.telegram.ui.Components.i6.c, 0.0f);
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
                                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.i6.d, 0);
                                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, s0Var, 0.0f, 1.0f);
                                        kg.g1 g1Var3 = this.F;
                                        Property property3 = View.ALPHA;
                                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(g1Var3, (Property<kg.g1, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.Y, (Property<fr0, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                                        b11 b11Var3 = this.S;
                                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(b11Var3, b11Var3.n, 0.0f);
                                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.S, (Property<b11, Float>) property3, 0.0f);
                                        i10 = 0;
                                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<vh.p2, Float>) property3, 0.0f);
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
                                        i11 = 2;
                                    }
                                    this.m0 = new r01(this, gs0Var, i10);
                                    this.I0.setInterpolator(new DecelerateInterpolator());
                                    this.I0.setDuration(250L);
                                    this.I0.addListener(new org.telegram.ui.Components.iw0(i13, this, gs0Var));
                                    this.l0 = System.currentTimeMillis();
                                    this.e.setLayerType(i11, null);
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
                            int i14 = org.telegram.messenger.i0.q.y + org.telegram.messenger.i0.m;
                            if (this.v0 < 0.0f) {
                                i14 = -i14;
                            }
                            this.y0 = i14;
                            this.G0 = false;
                            l(false, true);
                            z12 = this.J;
                            int i132 = 9;
                            s0 s0Var2 = this.t1;
                            if (z12) {
                            }
                            this.m0 = new r01(this, gs0Var, i10);
                            this.I0.setInterpolator(new DecelerateInterpolator());
                            this.I0.setDuration(250L);
                            this.I0.addListener(new org.telegram.ui.Components.iw0(i132, this, gs0Var));
                            this.l0 = System.currentTimeMillis();
                            this.e.setLayerType(i11, null);
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
                gs0Var = null;
                uq0Var = this.D;
                if (uq0Var != null) {
                }
                PhotoBackgroundDrawable photoBackgroundDrawable2 = this.j0;
                if (z10) {
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
    public final void h(org.telegram.messenger.jj jjVar, rl rlVar, ue ueVar, a3.i0 i0Var) {
        gs0 E;
        ?? r17;
        String str;
        Bitmap bitmap;
        int i10;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f7;
        boolean z10;
        if (this.b == null || !jjVar.m5() || rlVar == null || (E = rlVar.E(jjVar, null, 0, true, false)) == null) {
            return;
        }
        this.o1 = jjVar.k.ttl == Integer.MAX_VALUE;
        this.n1 = i0Var;
        this.L = rlVar;
        System.currentTimeMillis();
        this.i0 = true;
        this.h0 = true;
        this.n0 = false;
        k4 k4Var = this.x;
        if (k4Var != null) {
            k4Var.setVisibility(4);
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
        Point point = org.telegram.messenger.i0.q;
        this.w0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.i0.m));
        int[] iArr = E.h;
        if (iArr != null) {
            this.F0 = new int[iArr.length];
            r17 = 1;
            int i11 = 0;
            while (true) {
                int[] iArr2 = E.h;
                if (i11 >= iArr2.length) {
                    break;
                }
                this.F0[i11] = iArr2[i11];
                i11++;
            }
        } else {
            r17 = 1;
            this.F0 = null;
        }
        float f10 = E.b;
        float f11 = rectF.left;
        this.u0 = ((width / 2.0f) + (f10 + f11)) - (r10 / 2);
        this.v0 = ((height / 2.0f) + (E.c + rectF.top)) - (r8 / 2);
        this.t0 = Math.abs(f11 - E.a.K0);
        int abs = (int) Math.abs(rectF.top - E.a.L0);
        E.d.getLocationInWindow(new int[2]);
        float f12 = (r8[r17] - (E.c + rectF.top)) + E.j;
        this.p0 = f12;
        float f13 = abs;
        this.p0 = Math.max(0.0f, Math.max(f12, f13));
        float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r8[r17])) + E.i;
        this.q0 = height2;
        this.q0 = Math.max(0.0f, Math.max(height2, f13));
        this.r0 = 0.0f;
        this.r0 = Math.max(0.0f, Math.max(0.0f, f13));
        this.s0 = 0.0f;
        this.s0 = Math.max(0.0f, Math.max(0.0f, f13));
        this.H0 = System.currentTimeMillis();
        this.x0 = 0.0f;
        this.y0 = 0.0f;
        this.B0 = 0.0f;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.A0 = 0.0f;
        this.C0 = 0.0f;
        this.z0 = 1.0f;
        boolean z11 = r17;
        this.G0 = z11;
        this.c1 = z11;
        aa0 aa0Var = this.j1;
        if (aa0Var != null) {
            aa0Var.b();
            this.j1 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        this.j1 = launchActivity != null ? new aa0(launchActivity, z11) : null;
        org.telegram.messenger.zs.f(this.a).b(this, org.telegram.messenger.zs.w);
        org.telegram.messenger.zs.f(this.a).b(this, org.telegram.messenger.zs.l0);
        org.telegram.messenger.zs.f(this.a).b(this, org.telegram.messenger.zs.i0);
        this.w = org.telegram.messenger.jj.C1(jjVar.k.peer_id);
        this.f0 = jjVar;
        TLRPC.Document F0 = jjVar.F0();
        org.telegram.messenger.kc kcVar = this.g0;
        if (kcVar != null) {
            kcVar.a();
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
        this.g0 = bitmap != null ? new org.telegram.messenger.kc(bitmap, str, 0) : null;
        this.S.setVisibility(8);
        if (F0 != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= F0.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    this.M = tL_documentAttributeVideo.w;
                    this.N = tL_documentAttributeVideo.h;
                    break;
                }
                i12++;
            }
            if (org.telegram.messenger.jj.s3(F0, false)) {
                this.F.setTitle(org.telegram.messenger.cd.L0(2131751410, null));
                String str2 = jjVar.k.attachPath;
                f7 = 1.0f;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                i10 = 2;
                imageReceiver.p0((str2 == null || !jjVar.w0) ? org.telegram.messenger.ic.b(F0) : org.telegram.messenger.ic.g(str2), null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, jjVar, 1);
            } else {
                i10 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f7 = 1.0f;
                this.Z = 1;
                this.F.setTitle(org.telegram.messenger.cd.L0(2131751408, null));
                File file = new File(jjVar.k.attachPath);
                if (file.exists()) {
                    i(file);
                } else {
                    org.telegram.messenger.b8.G(this.a);
                    File N = org.telegram.messenger.b8.N(jjVar.k, false, true);
                    File file2 = new File(N.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        N = file2;
                    }
                    i(N);
                }
                this.J = true;
                this.S.setVisibility(0);
                imageReceiver.p0(null, null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, jjVar, 2);
            }
        } else {
            i10 = 2;
            photoBackgroundDrawable = photoBackgroundDrawable2;
            f7 = 1.0f;
            this.F.setTitle(org.telegram.messenger.cd.L0(2131751409, null));
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.n0, org.telegram.messenger.i0.Z0(false), false, null, false);
            imageReceiver.p0(org.telegram.messenger.ic.f(w9, jjVar.l0), null, this.g0 != null ? new BitmapDrawable(this.g0.c) : null, -1L, null, jjVar, 2);
            if (w9 != null) {
                this.M = w9.w;
                this.N = w9.h;
            }
        }
        k(jjVar, "", false);
        k(jjVar, jjVar.z, true);
        n(true, false);
        l(false, false);
        this.U.a(true, true);
        if (this.o1) {
            a11 a11Var = this.n;
            a11Var.e = true;
            TextPaint textPaint = a11Var.r;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
            textPaint.setColor(-1);
            StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            a11Var.s = staticLayout;
            a11Var.w = staticLayout.getLineCount() > 0 ? a11Var.s.getLineWidth(0) : 0.0f;
            a11Var.x = a11Var.s.getHeight();
            a11Var.invalidate();
            this.n.setOnClickListener(new a01(this, 4));
        } else {
            this.n.setOnClickListener(null);
        }
        try {
            if (this.d.getParent() != null) {
                ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
            }
            z10 = true;
        } catch (Exception e) {
            z10 = true;
            org.telegram.messenger.f8.g(e, true);
        }
        ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
        this.n.invalidate();
        this.s = z10;
        Window window = this.b.getWindow();
        int i13 = Build.VERSION.SDK_INT;
        this.m1 = i13 >= 26 ? v7.u7.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        org.telegram.messenger.i0.l3(this.b, false);
        org.telegram.messenger.i0.n3(this.d, false);
        Activity activity = this.b;
        if (activity instanceof LaunchActivity) {
            this.l1 = i13 >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
            ((LaunchActivity) this.b).x(-16777216);
        } else {
            this.l1 = window.getNavigationBarColor();
            org.telegram.messenger.i0.s3(this.b, -16777216, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.I0 = animatorSet;
        kg.g1 g1Var = this.F;
        Property property = View.ALPHA;
        float[] fArr = new float[i10];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property, fArr);
        float[] fArr2 = new float[i10];
        // fill-array-data instruction
        fArr2[0] = 0.0f;
        fArr2[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Y, (Property<fr0, Float>) property, fArr2);
        float[] fArr3 = new float[i10];
        // fill-array-data instruction
        fArr3[0] = 0.0f;
        fArr3[1] = 1.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, (Property<vh.p2, Float>) property, fArr3);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.i6.d, 0, org.telegram.messenger.zs.e4);
        float[] fArr4 = new float[i10];
        // fill-array-data instruction
        fArr4[0] = 0.0f;
        fArr4[1] = 1.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.t1, fArr4);
        b11 b11Var = this.S;
        int i14 = i10;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(b11Var, b11Var.n, f7);
        b11 b11Var2 = this.S;
        if (!this.J) {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b11Var2, (Property<b11, Float>) property, f7);
        Animator[] animatorArr = new Animator[7];
        animatorArr[0] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[i14] = ofFloat3;
        animatorArr[3] = ofInt;
        animatorArr[4] = ofFloat4;
        animatorArr[5] = ofFloat5;
        animatorArr[6] = ofFloat6;
        animatorSet.playTogether(animatorArr);
        this.k0 = 3;
        this.m0 = new qd0(this, ueVar, jjVar, 29);
        this.I0.setDuration(250L);
        this.I0.addListener(new x01(this, 0));
        this.l0 = System.currentTimeMillis();
        if (org.telegram.messenger.tz.o() == 0) {
            this.e.setLayerType(i14, null);
        }
        this.I0.setInterpolator(new DecelerateInterpolator());
        photoBackgroundDrawable.b = 0;
        photoBackgroundDrawable.a = new et0(28, this, E);
        this.I0.start();
    }

    public final void i(File file) {
        if (this.b == null) {
            return;
        }
        j();
        if (this.y == null) {
            k4 k4Var = new k4(this.b);
            this.x = k4Var;
            k4Var.setVisibility(0);
            this.e.addView(this.x, 0, w7.b6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, w7.b6.e(-1, -1, 17));
        }
        this.a0 = false;
        this.b0 = false;
        this.y.setAlpha(1.0f);
        if (this.D == null) {
            uq0 uq0Var = new uq0(this, 1);
            this.D = uq0Var;
            uq0Var.A0(this.y);
            this.D.J = new m5.e(this, file, false, 16);
        }
        this.D.j0(Uri.fromFile(file), "other");
        this.D.u0(true);
        this.U.a(true, true);
    }

    public final void j() {
        uq0 uq0Var = this.D;
        if (uq0Var != null) {
            this.Z = 0;
            uq0Var.m0();
            this.D = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        k4 k4Var = this.x;
        if (k4Var != null) {
            this.e.removeView(k4Var);
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.E = false;
    }

    public final void k(org.telegram.messenger.jj jjVar, CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.o5.cloneSpans(charSequence, 3);
        if (this.Y == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.V = frameLayout;
            this.X.setContainer(frameLayout);
            fr0 fr0Var = new fr0(this, this.e.getContext(), this.X, this.V, 1);
            this.Y = fr0Var;
            this.X.setScrollView(fr0Var);
            this.V.setClipChildren(false);
            this.Y.addView(this.V, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Y, w7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.W.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.X.getParent() != this.V) {
            this.X.setMeasureAllChildren(true);
            this.V.addView(this.X, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.X.getCurrentView().getText());
        wr0 wr0Var = this.X;
        TextView nextView = z10 ? wr0Var.getNextView() : wr0Var.getCurrentView();
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
        fr0 fr0Var2 = this.Y;
        fr0Var2.l0 = false;
        if (z10) {
            TransitionManager.endTransitions(fr0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new v01(this, isEmpty2, isEmpty, 1)).addTransition(new v01(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Y.l0 = true;
                duration.addTransition(new org.telegram.ui.Components.rl0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.X);
            }
            TransitionManager.beginDelayedTransition(this.Y, duration);
            z11 = true;
        } else {
            this.X.getCurrentView().setText((CharSequence) null);
            fr0 fr0Var3 = this.Y;
            if (fr0Var3 != null) {
                fr0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (isEmpty) {
            this.X.a(null, z10, false);
            this.X.getCurrentView().setTextColor(-1);
            wr0 wr0Var2 = this.X;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            wr0Var2.b(4, z12);
            this.X.setTag(null);
        } else {
            org.telegram.ui.ActionBar.t6.P();
            TLRPC.Message message = jjVar.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.m31.M0())) {
                if (jjVar.k.entities.isEmpty()) {
                    cloneSpans = org.telegram.messenger.k6.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    jjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.jj.L4(jjVar.k)) {
                        org.telegram.messenger.jj.h(jjVar.P3(), spannableString, false, 3, (int) jjVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.k6.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.X.setTag(cloneSpans);
            try {
                this.X.a(cloneSpans, z10, false);
                fr0 fr0Var4 = this.Y;
                if (fr0Var4 != null) {
                    fr0Var4.H(fr0Var4.getWidth(), fr0Var4.getHeight());
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.X.setVisibility(this.i0 ? 0 : 4);
        }
        if (this.X.getCurrentView() instanceof vr0) {
            ((vr0) this.X.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12 = this.J && z10;
        if (this.k1 == z12 && z11) {
            return;
        }
        this.k1 = z12;
        this.T.animate().cancel();
        if (z11) {
            this.T.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            return;
        }
        this.T.setScaleX(z12 ? 1.0f : 0.6f);
        this.T.setScaleY(z12 ? 1.0f : 0.6f);
        this.T.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void m() {
        this.r.p(true);
        String L0 = org.telegram.messenger.cd.L0(this.J ? 2131743606 : 2131747278, null);
        vh.p2 p2Var = this.r;
        p2Var.h = vh.p2.a(L0, p2Var.getTextPaint());
        this.r.s(L0);
        this.r.k(12.0f, 7.0f, 11.0f, 7.0f);
        vh.p2 p2Var2 = this.r;
        p2Var2.getClass();
        p2Var2.e0 = org.telegram.messenger.i0.L(2);
        vh.p2 p2Var3 = this.r;
        p2Var3.getClass();
        p2Var3.d0 = 0.0f;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.fire_on, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
        bi0Var.start();
        p2Var3.j(bi0Var);
        this.r.u();
        org.telegram.messenger.vp.d1().edit().putInt("viewoncehint", org.telegram.messenger.vp.d1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        r01 r01Var = this.p1;
        org.telegram.messenger.i0.r(r01Var);
        if (z10 && this.J) {
            org.telegram.messenger.i0.h3(r01Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.i0 = z10;
        l(z10, z11);
        if (!z11) {
            this.F.setAlpha(z10 ? 1.0f : 0.0f);
            this.Y.setAlpha(z10 ? 1.0f : 0.0f);
            this.R.setAlpha(z10 ? 1.0f : 0.0f);
            this.f.setAlpha(z10 ? 1.0f : 0.0f);
            if (z10) {
                return;
            }
            this.F.setVisibility(8);
            this.Y.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        kg.g1 g1Var = this.F;
        Property property = View.ALPHA;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property, z10 ? 1.0f : 0.0f));
        b11 b11Var = this.S;
        arrayList.add(ObjectAnimator.ofFloat(b11Var, b11Var.n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<fr0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.R, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.G = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.G.addListener(new x01(this, i10));
        }
        this.G.setDuration(200L);
        this.G.start();
    }

    public final void o(float f7) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.M0 * f7) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.N0 * f7) - this.e.getHeight())) / 2;
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
        float f7 = this.w0;
        if ((f7 == 1.0f && (this.v0 != 0.0f || this.u0 != 0.0f)) || this.H0 != 0 || this.k0 != 0) {
            return false;
        }
        if (f7 == 1.0f) {
            float v = org.telegram.messenger.z20.v(3.0f, this.w0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.u0, motionEvent.getX() - (this.e.getWidth() / 2));
            float v10 = org.telegram.messenger.z20.v(3.0f, this.w0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.v0, motionEvent.getY() - (this.e.getHeight() / 2));
            o(3.0f);
            float f10 = this.T0;
            if (v >= f10) {
                f10 = this.U0;
            }
            v = f10;
            float f11 = this.V0;
            if (v10 >= f11) {
                f11 = this.W0;
            }
            v10 = f11;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        if (this.w0 == 1.0f) {
            return false;
        }
        this.e1.a();
        this.e1.c(Math.round(this.u0), Math.round(this.v0), Math.round(f7), Math.round(f10), (int) this.T0, (int) this.U0, (int) this.V0, (int) this.W0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
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
        this.D.u0(!r5.d.t());
        if (this.D.d.t()) {
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

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.c0 = f7;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
