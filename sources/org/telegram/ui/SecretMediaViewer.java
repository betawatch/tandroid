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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements org.telegram.messenger.fs, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public lp0 E;
    public float E0;
    public boolean F;
    public float F0;
    public org.telegram.ui.Components.v7 G;
    public int[] G0;
    public AnimatorSet H;
    public boolean H0;
    public boolean I;
    public long I0;
    public boolean J;
    public AnimatorSet J0;
    public boolean K;
    public GestureDetector K0;
    public boolean L;
    public final DecelerateInterpolator L0;
    public uq0 M;
    public float M0;
    public int N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.h61 P;
    public float P0;
    public uv Q;
    public float Q0;
    public org.telegram.ui.ActionBar.n5 R;
    public float R0;
    public View S;
    public float S0;
    public nz0 T;
    public float T0;
    public ImageView U;
    public float U0;
    public org.telegram.ui.Components.ue0 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public vo0 X;
    public float X0;
    public mq0 Y;
    public boolean Y0;
    public wp0 Z;
    public boolean Z0;
    public int a;
    public int a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public boolean b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public boolean c1;
    public k0 d;
    public float d0;
    public boolean d1;
    public ai.k0 e;
    public long e0;
    public boolean e1;
    public View f;
    public WindowInsets f0;
    public org.telegram.ui.Components.jl0 f1;
    public org.telegram.messenger.fj g0;
    public boolean g1;
    public org.telegram.messenger.hc h0;
    public final fz0 h1;
    public boolean i0;
    public final int[] i1;
    public final int[] j1;
    public bg.v0 k1;
    public int l0;
    public boolean l1;
    public long m0;
    public int m1;
    public mz0 n;
    public Runnable n0;
    public boolean n1;
    public boolean o0;
    public Runnable o1;
    public float p0;
    public boolean p1;
    public float q0;
    public final fz0 q1;
    public hi.m3 r;
    public float r0;
    public float[] r1;
    public boolean s;
    public float s0;
    public final Path s1;
    public float t0;
    public final q0 t1;
    public float u0;
    public final q0 u1;
    public float v0;
    public boolean v1;
    public long w;
    public float w0;
    public j4 x;
    public float x0;
    public TextureView y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean j0 = true;
    public final PhotoBackgroundDrawable k0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public tr0 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            tr0 tr0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (tr0Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    tr0Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i7) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            bg.v0 v0Var = secretMediaViewer.k1;
            if (v0Var != null) {
                v0Var.b(secretMediaViewer.i0 && i7 == 255);
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
        this.x0 = 1.0f;
        this.L0 = new DecelerateInterpolator(1.5f);
        this.N0 = 1.0f;
        this.c1 = true;
        this.h1 = new fz0(this, 2);
        this.i1 = new int[2];
        this.j1 = new int[2];
        this.q1 = new fz0(this, 3);
        this.s1 = new Path();
        this.t1 = new q0("videoCrossfadeAlpha", 5);
        this.u1 = new q0("animationValue", 6);
    }

    public static /* synthetic */ WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.f0;
        secretMediaViewer.f0 = windowInsets;
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
        boolean z10;
        float f23;
        float f24;
        boolean z11;
        int q10;
        int o4;
        int i7;
        float f25;
        float f26;
        int i10;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.k0;
        Path path = secretMediaViewer.s1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.i0) {
            if (secretMediaViewer.J0 != null) {
                org.telegram.ui.Components.jl0 jl0Var = secretMediaViewer.f1;
                if (!jl0Var.q) {
                    jl0Var.a();
                }
                float f27 = secretMediaViewer.x0;
                float f28 = secretMediaViewer.A0;
                float f29 = secretMediaViewer.animationValue;
                f13 = ((f28 - f27) * f29) + f27;
                float f30 = secretMediaViewer.w0;
                float z12 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.z0, f30, f29, f30);
                float f31 = secretMediaViewer.v0;
                f15 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.y0, f31, f29, f31);
                f10 = -1.0f;
                float f32 = secretMediaViewer.q0;
                f11 = 1.0f;
                f16 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.B0, f32, f29, f32);
                float f33 = secretMediaViewer.r0;
                f12 = 0.0f;
                f17 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.C0, f33, f29, f33);
                float f34 = secretMediaViewer.s0;
                f18 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.D0, f34, f29, f34);
                float f35 = secretMediaViewer.t0;
                float z13 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.E0, f35, f29, f35);
                float f36 = secretMediaViewer.u0;
                float z14 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.F0, f36, f29, f36);
                float f37 = (f28 == 1.0f && f27 == 1.0f && f31 == 0.0f) ? z12 : -1.0f;
                secretMediaViewer.e.invalidate();
                f20 = z14;
                f21 = z12;
                f14 = f37;
                f19 = z13;
            } else {
                f10 = -1.0f;
                f11 = 1.0f;
                f12 = 0.0f;
                if (secretMediaViewer.I0 != 0) {
                    secretMediaViewer.v0 = secretMediaViewer.y0;
                    secretMediaViewer.w0 = secretMediaViewer.z0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.s0 = secretMediaViewer.D0;
                    secretMediaViewer.t0 = secretMediaViewer.E0;
                    secretMediaViewer.u0 = secretMediaViewer.F0;
                    float f38 = secretMediaViewer.A0;
                    secretMediaViewer.x0 = f38;
                    secretMediaViewer.I0 = 0L;
                    secretMediaViewer.o(f38);
                    secretMediaViewer.d1 = false;
                }
                org.telegram.ui.Components.jl0 jl0Var2 = secretMediaViewer.f1;
                if (!jl0Var2.q && jl0Var2.b()) {
                    org.telegram.ui.Components.jl0 jl0Var3 = secretMediaViewer.f1;
                    float f39 = jl0Var3.b;
                    if (f39 < secretMediaViewer.V0 && f39 > secretMediaViewer.U0) {
                        secretMediaViewer.v0 = jl0Var3.j;
                    }
                    float f40 = jl0Var3.c;
                    if (f40 < secretMediaViewer.X0 && f40 > secretMediaViewer.W0) {
                        secretMediaViewer.w0 = jl0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f13 = secretMediaViewer.x0;
                f14 = secretMediaViewer.w0;
                f15 = secretMediaViewer.v0;
                f16 = secretMediaViewer.q0;
                f17 = secretMediaViewer.r0;
                f18 = secretMediaViewer.s0;
                f19 = secretMediaViewer.t0;
                f20 = secretMediaViewer.u0;
                if (secretMediaViewer.Z0) {
                    f21 = f14;
                    f14 = -1.0f;
                } else {
                    f21 = f14;
                }
            }
            if (secretMediaViewer.G0 != null) {
                int i11 = 8;
                if (secretMediaViewer.r1 == null) {
                    secretMediaViewer.r1 = new float[8];
                }
                float f41 = secretMediaViewer.H0 ? secretMediaViewer.animationValue : f11 - secretMediaViewer.animationValue;
                f22 = f16;
                int i12 = 0;
                z10 = true;
                while (i12 < i11) {
                    float[] fArr = secretMediaViewer.r1;
                    int i13 = i12 + 1;
                    float f42 = secretMediaViewer.G0[i12 / 2] * 2.0f;
                    int i14 = i12;
                    float f43 = f12;
                    float T1 = org.telegram.messenger.g0.T1(f42, f43, f41);
                    fArr[i13] = T1;
                    fArr[i14] = T1;
                    if (secretMediaViewer.r1[i14] > f43) {
                        z10 = false;
                    }
                    i12 = i14 + 2;
                    i11 = 8;
                    f12 = 0.0f;
                }
            } else {
                f22 = f16;
                z10 = true;
            }
            if (secretMediaViewer.l0 != 3) {
                if (secretMediaViewer.x0 != f11 || f14 == f10 || secretMediaViewer.d1) {
                    photoBackgroundDrawable.setAlpha(org.telegram.messenger.ks.e4);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f11 - (Math.min(Math.abs(f14), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.d1) {
                    float f44 = secretMediaViewer.V0;
                    if (f15 > f44) {
                        float width = (f15 - f44) / canvas.getWidth();
                        float f45 = f11;
                        float min = Math.min(f45, width);
                        f24 = 0.3f * min;
                        f23 = f45 - min;
                        f15 = secretMediaViewer.V0;
                        j4 j4Var = secretMediaViewer.x;
                        z11 = j4Var == null && j4Var.getVisibility() == 0;
                        canvas.save();
                        float f46 = f13 - f24;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f15, (secretMediaViewer.e.getHeight() / 2) + f21);
                        canvas.scale(f46, f46);
                        q10 = imageReceiver.q();
                        o4 = imageReceiver.o();
                        i7 = secretMediaViewer.N;
                        if (i7 != 0 && (i10 = secretMediaViewer.O) != 0) {
                            q10 = i7;
                            o4 = i10;
                        }
                        if (z11 && secretMediaViewer.b0 && Math.abs((q10 / o4) - (secretMediaViewer.y.getMeasuredWidth() / secretMediaViewer.y.getMeasuredHeight())) > 0.01f) {
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
                        if (!z10) {
                            path.reset();
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(f50, (f51 / f46) + f26, f52, f53 - (f19 / f46));
                            path.addRoundRect(rectF, secretMediaViewer.r1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z11 || !secretMediaViewer.b0 || !secretMediaViewer.c0 || secretMediaViewer.d0 != 1.0f) {
                            imageReceiver.setAlpha(f23);
                            imageReceiver.y0(f25, f26, i15, i16);
                            imageReceiver.h(canvas, null);
                        }
                        if (z11) {
                            if (!secretMediaViewer.c0 && secretMediaViewer.b0) {
                                secretMediaViewer.c0 = true;
                                secretMediaViewer.d0 = 0.0f;
                                secretMediaViewer.e0 = System.currentTimeMillis();
                            }
                            canvas.translate(f25, f26);
                            secretMediaViewer.y.setAlpha(f23 * secretMediaViewer.d0);
                            secretMediaViewer.x.draw(canvas);
                            if (secretMediaViewer.c0 && secretMediaViewer.d0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j3 = currentTimeMillis - secretMediaViewer.e0;
                                secretMediaViewer.e0 = currentTimeMillis;
                                secretMediaViewer.d0 = (j3 / 200.0f) + secretMediaViewer.d0;
                                secretMediaViewer.e.invalidate();
                                if (secretMediaViewer.d0 > 1.0f) {
                                    secretMediaViewer.d0 = 1.0f;
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
            i7 = secretMediaViewer.N;
            if (i7 != 0) {
                q10 = i7;
                o4 = i10;
            }
            if (z11) {
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
            if (!z10) {
            }
            if (z11) {
            }
            imageReceiver.setAlpha(f23);
            imageReceiver.y0(f25, f26, i152, i162);
            imageReceiver.h(canvas, null);
            if (z11) {
            }
            canvas.restore();
        }
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = w1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = w1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    w1 = secretMediaViewer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return w1 != null;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.x0 == f10 && this.v0 == f11 && this.w0 == f12) {
            return;
        }
        this.d1 = z10;
        this.A0 = f10;
        this.y0 = f11;
        this.z0 = f12;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(org.telegram.messenger.ks.Z3);
        this.J0.addListener(new lz0(this, 3));
        this.J0.start();
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
        float f10 = this.v0;
        float f11 = this.w0;
        o(this.x0);
        float f12 = this.v0;
        float f13 = this.U0;
        if (f12 >= f13) {
            f13 = this.V0;
        }
        f10 = f13;
        float f14 = this.w0;
        float f15 = this.W0;
        if (f14 >= f15) {
            f15 = this.X0;
        }
        f11 = f15;
        c(this.x0, f10, f11, z10);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.w) {
            if (!((Boolean) objArr[2]).booleanValue() && this.g0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.g0.e1()))) {
                if (this.K && !this.I) {
                    this.J = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.g1 = true;
                    return;
                }
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.i0) {
            if (i7 == org.telegram.messenger.ks.l0) {
                if (this.g0.e1() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.K && !this.I) {
                        this.J = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.g1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.g0 == null || this.n == null || ((Long) objArr[0]).longValue() != this.w) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (this.g0.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                    this.g0.k.destroyTime = keyAt;
                    this.n.invalidate();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z10, boolean z11) {
        wq0 wq0Var;
        lp0 lp0Var;
        Runnable runnable;
        Runnable runnable2;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        boolean z12;
        int i7;
        int i10;
        Bitmap bitmap;
        if (this.b != null && this.i0) {
            if (this.l0 != 0 && Math.abs(this.m0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable3 = this.n0;
                if (runnable3 != null) {
                    runnable3.run();
                    this.n0 = null;
                }
                this.l0 = 0;
            }
            if (this.l0 == 0 && (!this.p1 || !z11)) {
                Activity activity = this.b;
                int i11 = 1;
                if (activity != null) {
                    org.telegram.messenger.g0.l3(activity, this.n1);
                    Activity activity2 = this.b;
                    int i12 = this.m1;
                    if (activity2 != null) {
                        org.telegram.messenger.g0.t3(activity2.getWindow(), i12, true, null);
                    }
                    Activity activity3 = this.b;
                    if (activity3 instanceof LaunchActivity) {
                        ((LaunchActivity) activity3).x(this.m1);
                    } else {
                        int i13 = this.m1;
                        if (activity3 != null) {
                            org.telegram.messenger.g0.t3(activity3.getWindow(), i13, true, null);
                        }
                    }
                }
                bg.v0 v0Var = this.k1;
                if (v0Var != null) {
                    v0Var.a();
                    this.k1 = null;
                }
                org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.w);
                org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.l0);
                org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.i0);
                this.j0 = false;
                System.currentTimeMillis();
                uq0 uq0Var = this.M;
                if (uq0Var != null) {
                    org.telegram.messenger.fj fjVar = this.g0;
                    TLRPC.MessageMedia messageMedia = fjVar.k.media;
                    if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                        wq0Var = uq0Var.E(fjVar, null, 0, true, false);
                        lp0Var = this.E;
                        if (lp0Var != null) {
                            lp0Var.g0();
                        }
                        PhotoBackgroundDrawable photoBackgroundDrawable = this.k0;
                        if (z10) {
                            l(false, true);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<ai.k0, Float>) View.SCALE_X, 0.9f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<ai.k0, Float>) View.SCALE_Y, 0.9f);
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.q6.d, 0);
                            org.telegram.ui.Components.v7 v7Var = this.G;
                            Property property = View.ALPHA;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v7Var, (Property<org.telegram.ui.Components.v7, Float>) property, 0.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z, (Property<wp0, Float>) property, 0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                            nz0 nz0Var = this.T;
                            animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(nz0Var, nz0Var.n, 0.0f), ObjectAnimator.ofFloat(this.T, (Property<nz0, Float>) property, 0.0f));
                            this.l0 = 2;
                            this.n0 = new fz0(this, wq0Var, i11);
                            animatorSet.setDuration(200L);
                            animatorSet.addListener(new lz0(this, 2));
                            this.m0 = System.currentTimeMillis();
                            runnable = null;
                            this.e.setLayerType(2, null);
                            animatorSet.start();
                        } else {
                            this.l0 = 3;
                            this.e.invalidate();
                            this.J0 = new AnimatorSet();
                            if (wq0Var != null) {
                                ImageReceiver imageReceiver = wq0Var.a;
                                Drawable drawable = imageReceiver.b0;
                                c11 = 7;
                                if (drawable instanceof BitmapDrawable) {
                                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                                } else {
                                    Drawable drawable2 = imageReceiver.n0;
                                    bitmap = drawable2 instanceof BitmapDrawable ? ((BitmapDrawable) drawable2).getBitmap() : null;
                                }
                                if (bitmap == null || z11 || this.o1 != null) {
                                    c10 = 3;
                                } else {
                                    wq0Var.a.O0(false, true);
                                    RectF rectF = wq0Var.a.Q0;
                                    float f10 = rectF.right - rectF.left;
                                    c12 = 6;
                                    float f11 = rectF.bottom - rectF.top;
                                    Point point = org.telegram.messenger.g0.q;
                                    c13 = 5;
                                    c14 = 4;
                                    c10 = 3;
                                    this.A0 = Math.max(f10 / point.x, f11 / (point.y + org.telegram.messenger.g0.m));
                                    float f12 = wq0Var.b;
                                    float f13 = rectF.left;
                                    this.y0 = ((f10 / 2.0f) + (f12 + f13)) - (r8 / 2);
                                    this.z0 = ((f11 / 2.0f) + (wq0Var.c + rectF.top)) - (r7 / 2);
                                    this.F0 = Math.abs(f13 - wq0Var.a.L0);
                                    int abs = (int) Math.abs(rectF.top - wq0Var.a.M0);
                                    wq0Var.d.getLocationInWindow(new int[2]);
                                    float f14 = (r8[1] - (wq0Var.c + rectF.top)) + wq0Var.j;
                                    this.B0 = f14;
                                    float f15 = abs;
                                    this.B0 = Math.max(0.0f, Math.max(f14, f15));
                                    float height = (((wq0Var.c + rectF.top) + ((int) f11)) - (wq0Var.d.getHeight() + r8[1])) + wq0Var.i;
                                    this.C0 = height;
                                    this.C0 = Math.max(0.0f, Math.max(height, f15));
                                    this.D0 = 0.0f;
                                    this.D0 = Math.max(0.0f, Math.max(0.0f, f15));
                                    this.E0 = 0.0f;
                                    this.E0 = Math.max(0.0f, Math.max(0.0f, f15));
                                    this.I0 = System.currentTimeMillis();
                                    this.d1 = true;
                                    this.H0 = false;
                                    l(false, true);
                                    z12 = this.K;
                                    q0 q0Var = this.u1;
                                    if (z12) {
                                        i7 = 0;
                                        ImageReceiver imageReceiver2 = this.h;
                                        imageReceiver2.m1 = true;
                                        AnimatorSet animatorSet2 = this.J0;
                                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.q6.d, 0);
                                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, q0Var, 0.0f, 1.0f);
                                        org.telegram.ui.Components.v7 v7Var2 = this.G;
                                        Property property2 = View.ALPHA;
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(v7Var2, (Property<org.telegram.ui.Components.v7, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Z, (Property<wp0, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                                        nz0 nz0Var2 = this.T;
                                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(nz0Var2, nz0Var2.n, 0.0f);
                                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.T, (Property<nz0, Float>) property2, 0.0f);
                                        i10 = 2;
                                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<hi.m3, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(imageReceiver2, org.telegram.ui.Components.q6.c, 0.0f);
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
                                        this.c0 = false;
                                        this.b0 = false;
                                        AnimatorSet animatorSet3 = this.J0;
                                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.q6.d, 0);
                                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, q0Var, 0.0f, 1.0f);
                                        org.telegram.ui.Components.v7 v7Var3 = this.G;
                                        Property property3 = View.ALPHA;
                                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(v7Var3, (Property<org.telegram.ui.Components.v7, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.Z, (Property<wp0, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                                        nz0 nz0Var3 = this.T;
                                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(nz0Var3, nz0Var3.n, 0.0f);
                                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.T, (Property<nz0, Float>) property3, 0.0f);
                                        i7 = 0;
                                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<hi.m3, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(this, this.t1, 0.0f);
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
                                    this.n0 = new fz0(this, wq0Var, i7);
                                    this.J0.setInterpolator(new DecelerateInterpolator());
                                    this.J0.setDuration(250L);
                                    this.J0.addListener(new org.telegram.ui.Components.h60(14, this, wq0Var));
                                    this.m0 = System.currentTimeMillis();
                                    this.e.setLayerType(i10, null);
                                    this.J0.start();
                                    runnable = null;
                                }
                            } else {
                                c10 = 3;
                                c11 = 7;
                            }
                            c12 = 6;
                            c13 = 5;
                            c14 = 4;
                            int i14 = org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m;
                            if (this.w0 < 0.0f) {
                                i14 = -i14;
                            }
                            this.z0 = i14;
                            this.H0 = false;
                            l(false, true);
                            z12 = this.K;
                            q0 q0Var2 = this.u1;
                            if (z12) {
                            }
                            this.n0 = new fz0(this, wq0Var, i7);
                            this.J0.setInterpolator(new DecelerateInterpolator());
                            this.J0.setDuration(250L);
                            this.J0.addListener(new org.telegram.ui.Components.h60(14, this, wq0Var));
                            this.m0 = System.currentTimeMillis();
                            this.e.setLayerType(i10, null);
                            this.J0.start();
                            runnable = null;
                        }
                        runnable2 = this.o1;
                        if (runnable2 != null) {
                            runnable2.run();
                            this.o1 = runnable;
                        }
                        return true;
                    }
                }
                wq0Var = null;
                lp0Var = this.E;
                if (lp0Var != null) {
                }
                PhotoBackgroundDrawable photoBackgroundDrawable2 = this.k0;
                if (z10) {
                }
                runnable2 = this.o1;
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
        return this.d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    public final void h(org.telegram.messenger.fj fjVar, vk vkVar, he heVar, bi.m2 m2Var) {
        wq0 E;
        ?? r17;
        String str;
        Bitmap bitmap;
        int i7;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f10;
        boolean z10;
        File M;
        if (this.b == null || !fjVar.m5() || vkVar == null || (E = vkVar.E(fjVar, null, 0, true, false)) == null) {
            return;
        }
        this.p1 = fjVar.k.ttl == Integer.MAX_VALUE;
        this.o1 = m2Var;
        this.M = vkVar;
        System.currentTimeMillis();
        this.j0 = true;
        this.i0 = true;
        this.o0 = false;
        j4 j4Var = this.x;
        if (j4Var != null) {
            j4Var.setVisibility(4);
        }
        j();
        this.M0 = 0.0f;
        this.N0 = 1.0f;
        this.O0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
        this.R0 = 0.0f;
        this.S0 = 0.0f;
        this.T0 = 0.0f;
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = false;
        this.b1 = false;
        this.c1 = true;
        o(this.x0);
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.k0;
        photoBackgroundDrawable2.setAlpha(0);
        this.e.setAlpha(1.0f);
        this.e.setVisibility(0);
        this.n.setAlpha(1.0f);
        this.K = false;
        this.I = false;
        this.J = false;
        this.L = true;
        ImageReceiver imageReceiver = this.h;
        imageReceiver.m1 = false;
        this.N = 0;
        this.O = 0;
        RectF rectF = new RectF(E.a.Q0);
        rectF.left = Math.max(rectF.left, E.a.L0);
        rectF.top = Math.max(rectF.top, E.a.M0);
        rectF.right = Math.min(rectF.right, E.a.y());
        rectF.bottom = Math.min(rectF.bottom, E.a.A());
        float width = rectF.width();
        float height = rectF.height();
        Point point = org.telegram.messenger.g0.q;
        this.x0 = Math.max(width / point.x, height / (point.y + org.telegram.messenger.g0.m));
        int[] iArr = E.h;
        if (iArr != null) {
            this.G0 = new int[iArr.length];
            r17 = 1;
            int i10 = 0;
            while (true) {
                int[] iArr2 = E.h;
                if (i10 >= iArr2.length) {
                    break;
                }
                this.G0[i10] = iArr2[i10];
                i10++;
            }
        } else {
            r17 = 1;
            this.G0 = null;
        }
        float f11 = E.b;
        float f12 = rectF.left;
        this.v0 = ((width / 2.0f) + (f11 + f12)) - (r10 / 2);
        this.w0 = ((height / 2.0f) + (E.c + rectF.top)) - (r8 / 2);
        this.u0 = Math.abs(f12 - E.a.L0);
        int abs = (int) Math.abs(rectF.top - E.a.M0);
        E.d.getLocationInWindow(new int[2]);
        float f13 = (r8[r17] - (E.c + rectF.top)) + E.j;
        this.q0 = f13;
        float f14 = abs;
        this.q0 = Math.max(0.0f, Math.max(f13, f14));
        float height2 = (((E.c + rectF.top) + ((int) height)) - (E.d.getHeight() + r8[r17])) + E.i;
        this.r0 = height2;
        this.r0 = Math.max(0.0f, Math.max(height2, f14));
        this.s0 = 0.0f;
        this.s0 = Math.max(0.0f, Math.max(0.0f, f14));
        this.t0 = 0.0f;
        this.t0 = Math.max(0.0f, Math.max(0.0f, f14));
        this.I0 = System.currentTimeMillis();
        this.y0 = 0.0f;
        this.z0 = 0.0f;
        this.C0 = 0.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.B0 = 0.0f;
        this.D0 = 0.0f;
        this.A0 = 1.0f;
        boolean z11 = r17;
        this.H0 = z11;
        this.d1 = z11;
        bg.v0 v0Var = this.k1;
        if (v0Var != null) {
            v0Var.a();
            this.k1 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        this.k1 = launchActivity != null ? new bg.v0(launchActivity, z11) : null;
        org.telegram.messenger.ks.f(this.a).b(this, org.telegram.messenger.ks.w);
        org.telegram.messenger.ks.f(this.a).b(this, org.telegram.messenger.ks.l0);
        org.telegram.messenger.ks.f(this.a).b(this, org.telegram.messenger.ks.i0);
        this.w = org.telegram.messenger.fj.B1(fjVar.k.peer_id);
        this.g0 = fjVar;
        TLRPC.Document F0 = fjVar.F0();
        org.telegram.messenger.hc hcVar = this.h0;
        if (hcVar != null) {
            hcVar.a();
            this.h0 = null;
        }
        ImageReceiver imageReceiver2 = E.a;
        Drawable drawable = imageReceiver2.b0;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            str = imageReceiver2.Z;
        } else {
            Drawable drawable2 = imageReceiver2.n0;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
                str = null;
            } else {
                str = null;
                bitmap = null;
            }
        }
        this.h0 = bitmap != null ? new org.telegram.messenger.hc(bitmap, str, 0) : null;
        this.T.setVisibility(8);
        if (F0 != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= F0.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    this.N = tL_documentAttributeVideo.w;
                    this.O = tL_documentAttributeVideo.h;
                    break;
                }
                i11++;
            }
            if (org.telegram.messenger.fj.s3(F0, false)) {
                this.G.setTitle(org.telegram.messenger.gd.M0(2131751398, null));
                String str2 = fjVar.k.attachPath;
                f10 = 1.0f;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                i7 = 2;
                imageReceiver.p0((str2 == null || !fjVar.y0) ? org.telegram.messenger.fc.b(F0) : org.telegram.messenger.fc.g(str2), null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, fjVar, 1);
            } else {
                i7 = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f10 = 1.0f;
                this.a0 = 1;
                this.G.setTitle(org.telegram.messenger.gd.M0(2131751396, null));
                File file = new File(fjVar.k.attachPath);
                if (file.exists()) {
                    i(file);
                } else {
                    if (fjVar.D3()) {
                        org.telegram.messenger.w7.G(this.a);
                        M = org.telegram.messenger.w7.J(F0, null, true, true);
                    } else {
                        org.telegram.messenger.w7.G(this.a);
                        M = org.telegram.messenger.w7.M(fjVar.k, false, true);
                    }
                    File file2 = new File(M.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        M = file2;
                    }
                    i(M);
                }
                this.K = true;
                this.T.setVisibility(0);
                imageReceiver.p0(null, null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, fjVar, 2);
            }
        } else {
            i7 = 2;
            photoBackgroundDrawable = photoBackgroundDrawable2;
            f10 = 1.0f;
            this.G.setTitle(org.telegram.messenger.gd.M0(2131751397, null));
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.p0, org.telegram.messenger.g0.Z0(false), false, null, false);
            imageReceiver.p0(org.telegram.messenger.fc.f(w10, fjVar.n0), null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, fjVar, 2);
            if (w10 != null) {
                this.N = w10.w;
                this.O = w10.h;
            }
        }
        k(fjVar, "", false);
        k(fjVar, fjVar.z, true);
        n(true, false);
        l(false, false);
        this.V.a(true, true);
        if (this.p1) {
            mz0 mz0Var = this.n;
            mz0Var.e = true;
            TextPaint textPaint = mz0Var.r;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
            textPaint.setColor(-1);
            StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            mz0Var.s = staticLayout;
            mz0Var.w = staticLayout.getLineCount() > 0 ? mz0Var.s.getLineWidth(0) : 0.0f;
            mz0Var.x = mz0Var.s.getHeight();
            mz0Var.invalidate();
            this.n.setOnClickListener(new oy0(this, 4));
        } else {
            this.n.setOnClickListener(null);
        }
        try {
            if (this.d.getParent() != null) {
                ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
            }
            z10 = true;
        } catch (Exception e10) {
            z10 = true;
            org.telegram.messenger.a8.g(e10, true);
        }
        ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
        this.n.invalidate();
        this.s = z10;
        Window window = this.b.getWindow();
        int i12 = Build.VERSION.SDK_INT;
        this.n1 = i12 >= 26 ? c8.dd.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        org.telegram.messenger.g0.l3(this.b, false);
        org.telegram.messenger.g0.n3(this.d, false);
        Activity activity = this.b;
        if (activity instanceof LaunchActivity) {
            this.m1 = i12 >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
            ((LaunchActivity) this.b).x(-16777216);
        } else {
            this.m1 = window.getNavigationBarColor();
            Activity activity2 = this.b;
            if (activity2 != null) {
                org.telegram.messenger.g0.t3(activity2.getWindow(), -16777216, true, null);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        org.telegram.ui.Components.v7 v7Var = this.G;
        Property property = View.ALPHA;
        float[] fArr = new float[i7];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v7Var, (Property<org.telegram.ui.Components.v7, Float>) property, fArr);
        float[] fArr2 = new float[i7];
        // fill-array-data instruction
        fArr2[0] = 0.0f;
        fArr2[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, (Property<wp0, Float>) property, fArr2);
        float[] fArr3 = new float[i7];
        // fill-array-data instruction
        fArr3[0] = 0.0f;
        fArr3[1] = 1.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, (Property<hi.m3, Float>) property, fArr3);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.q6.d, 0, org.telegram.messenger.ks.e4);
        float[] fArr4 = new float[i7];
        // fill-array-data instruction
        fArr4[0] = 0.0f;
        fArr4[1] = 1.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.u1, fArr4);
        nz0 nz0Var = this.T;
        int i13 = i7;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(nz0Var, nz0Var.n, f10);
        nz0 nz0Var2 = this.T;
        if (!this.K) {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(nz0Var2, (Property<nz0, Float>) property, f10);
        Animator[] animatorArr = new Animator[7];
        animatorArr[0] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[i13] = ofFloat3;
        animatorArr[3] = ofInt;
        animatorArr[4] = ofFloat4;
        animatorArr[5] = ofFloat5;
        animatorArr[6] = ofFloat6;
        animatorSet.playTogether(animatorArr);
        this.l0 = 3;
        this.n0 = new mc0(this, heVar, fjVar, 29);
        this.J0.setDuration(250L);
        this.J0.addListener(new lz0(this, 0));
        this.m0 = System.currentTimeMillis();
        if (org.telegram.messenger.bz.o() == 0) {
            this.e.setLayerType(i13, null);
        }
        this.J0.setInterpolator(new DecelerateInterpolator());
        photoBackgroundDrawable.b = 0;
        photoBackgroundDrawable.a = new tr0(27, this, E);
        this.J0.start();
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
            this.e.addView(this.x, 0, c8.ma.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, c8.ma.e(-1, -1, 17));
        }
        this.b0 = false;
        this.c0 = false;
        this.y.setAlpha(1.0f);
        if (this.E == null) {
            lp0 lp0Var = new lp0(this, 1);
            this.E = lp0Var;
            lp0Var.A0(this.y);
            this.E.K = new ji.j(this, file, false, 19);
        }
        this.E.j0(Uri.fromFile(file), "other");
        this.E.u0(true);
        this.V.a(true, true);
    }

    public final void j() {
        lp0 lp0Var = this.E;
        if (lp0Var != null) {
            this.a0 = 0;
            lp0Var.m0();
            this.E = null;
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
        this.F = false;
    }

    public final void k(org.telegram.messenger.fj fjVar, CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.x5.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            wp0 wp0Var = new wp0(this, this.e.getContext(), this.Y, this.W, 1);
            this.Z = wp0Var;
            this.Y.setScrollView(wp0Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Z, c8.ma.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.n(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        mq0 mq0Var = this.Y;
        TextView nextView = z10 ? mq0Var.getNextView() : mq0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.Y.getCurrentView().setSingleLine(false);
            this.Y.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.Y.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.Y.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.Y.getCurrentView().setEllipsize(null);
            this.Y.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        wp0 wp0Var2 = this.Z;
        wp0Var2.m0 = false;
        if (z10) {
            TransitionManager.endTransitions(wp0Var2);
            TransitionSet duration = new TransitionSet().addTransition(new jz0(this, isEmpty2, isEmpty, 1)).addTransition(new jz0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.m0 = true;
                duration.addTransition(new org.telegram.ui.Components.al0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z11 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            wp0 wp0Var3 = this.Z;
            if (wp0Var3 != null) {
                wp0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (isEmpty) {
            this.Y.a(null, z10, false);
            this.Y.getCurrentView().setTextColor(-1);
            mq0 mq0Var2 = this.Y;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            mq0Var2.b(4, z12);
            this.Y.setTag(null);
        } else {
            org.telegram.ui.ActionBar.n6.P();
            TLRPC.Message message = fjVar.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.y21.N0())) {
                if (fjVar.k.entities.isEmpty()) {
                    cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    fjVar.c(spannableString, true, false);
                    if (org.telegram.messenger.fj.L4(fjVar.k)) {
                        org.telegram.messenger.fj.h(fjVar.P3(), spannableString, false, 3, (int) fjVar.L0(), false);
                    }
                    cloneSpans = org.telegram.messenger.j6.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z10, false);
                wp0 wp0Var4 = this.Z;
                if (wp0Var4 != null) {
                    wp0Var4.H(wp0Var4.getWidth(), wp0Var4.getHeight());
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.Y.setVisibility(this.j0 ? 0 : 4);
        }
        if (this.Y.getCurrentView() instanceof lq0) {
            ((lq0) this.Y.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12 = this.K && z10;
        if (this.l1 == z12 && z11) {
            return;
        }
        this.l1 = z12;
        this.U.animate().cancel();
        if (z11) {
            this.U.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.lr.h).start();
            return;
        }
        this.U.setScaleX(z12 ? 1.0f : 0.6f);
        this.U.setScaleY(z12 ? 1.0f : 0.6f);
        this.U.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void m() {
        this.r.r(true);
        String M0 = org.telegram.messenger.gd.M0(this.K ? 2131743343 : 2131747069, null);
        hi.m3 m3Var = this.r;
        m3Var.h = hi.m3.a(M0, m3Var.getTextPaint());
        this.r.v(M0);
        this.r.n(12.0f, 7.0f, 11.0f, 7.0f);
        hi.m3 m3Var2 = this.r;
        m3Var2.getClass();
        m3Var2.f0 = org.telegram.messenger.g0.L(2);
        hi.m3 m3Var3 = this.r;
        m3Var3.getClass();
        m3Var3.e0 = 0.0f;
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
        mh0Var.start();
        m3Var3.m(mh0Var);
        this.r.x();
        org.telegram.messenger.mp.g1().edit().putInt("viewoncehint", org.telegram.messenger.mp.g1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z10, boolean z11) {
        fz0 fz0Var = this.q1;
        org.telegram.messenger.g0.r(fz0Var);
        if (z10 && this.K) {
            org.telegram.messenger.g0.h3(fz0Var, 3000L);
        }
        if (z10) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z10);
        this.j0 = z10;
        l(z10, z11);
        if (!z11) {
            this.G.setAlpha(z10 ? 1.0f : 0.0f);
            this.Z.setAlpha(z10 ? 1.0f : 0.0f);
            this.S.setAlpha(z10 ? 1.0f : 0.0f);
            this.f.setAlpha(z10 ? 1.0f : 0.0f);
            if (z10) {
                return;
            }
            this.G.setVisibility(8);
            this.Z.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.v7 v7Var = this.G;
        Property property = View.ALPHA;
        int i7 = 1;
        arrayList.add(ObjectAnimator.ofFloat(v7Var, (Property<org.telegram.ui.Components.v7, Float>) property, z10 ? 1.0f : 0.0f));
        nz0 nz0Var = this.T;
        arrayList.add(ObjectAnimator.ofFloat(nz0Var, nz0Var.n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.Z, (Property<wp0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.H = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.H.addListener(new lz0(this, i7));
        }
        this.H.setDuration(200L);
        this.H.start();
    }

    public final void o(float f10) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.N0 * f10) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f10) - this.e.getHeight())) / 2;
        if (width > 0) {
            this.U0 = -width;
            this.V0 = width;
        } else {
            this.V0 = 0.0f;
            this.U0 = 0.0f;
        }
        if (height > 0) {
            this.W0 = -height;
            this.X0 = height;
        } else {
            this.X0 = 0.0f;
            this.W0 = 0.0f;
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
        float f10 = this.x0;
        if ((f10 == 1.0f && (this.w0 != 0.0f || this.v0 != 0.0f)) || this.I0 != 0 || this.l0 != 0) {
            return false;
        }
        if (f10 == 1.0f) {
            float w10 = org.telegram.messenger.n10.w(3.0f, this.x0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.v0, motionEvent.getX() - (this.e.getWidth() / 2));
            float w11 = org.telegram.messenger.n10.w(3.0f, this.x0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.w0, motionEvent.getY() - (this.e.getHeight() / 2));
            o(3.0f);
            float f11 = this.U0;
            if (w10 >= f11) {
                f11 = this.V0;
            }
            w10 = f11;
            float f12 = this.W0;
            if (w11 >= f12) {
                f12 = this.X0;
            }
            w11 = f12;
            c(3.0f, w10, w11, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.a1 = true;
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
        if (this.x0 == 1.0f) {
            return false;
        }
        this.f1.a();
        this.f1.c(Math.round(this.v0), Math.round(this.w0), Math.round(f10), Math.round(f11), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.e1) {
            return false;
        }
        if (this.E == null || !this.j0 || motionEvent.getX() < this.U.getX() || motionEvent.getY() < this.U.getY() || motionEvent.getX() > this.U.getX() + this.U.getMeasuredWidth() || motionEvent.getX() > this.U.getX() + this.U.getMeasuredWidth()) {
            n(!this.j0, true);
            return true;
        }
        this.E.u0(!r5.d.u());
        if (this.E.d.u()) {
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
        this.d0 = f10;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
