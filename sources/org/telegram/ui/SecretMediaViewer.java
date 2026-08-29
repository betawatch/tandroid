package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer t1;
    public boolean A;
    public float A0;
    public cg.m1 B;
    public float B0;
    public AnimatorSet C;
    public float C0;
    public boolean D;
    public int[] D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public long F0;
    public long G;
    public AnimatorSet G0;
    public long H;
    public GestureDetector H0;
    public boolean I;
    public final DecelerateInterpolator I0;
    public xt0 J;
    public float J0;
    public int K;
    public float K0;
    public int L;
    public float L0;
    public org.telegram.ui.Components.z61 M;
    public float M0;
    public op0 N;
    public float N0;
    public org.telegram.ui.ActionBar.h5 O;
    public float O0;
    public View P;
    public float P0;
    public z31 Q;
    public float Q0;
    public ImageView R;
    public float R0;
    public org.telegram.ui.Components.cg0 S;
    public float S0;
    public FrameLayout T;
    public float T0;
    public sr0 U;
    public float U0;
    public nt0 V;
    public boolean V0;
    public xs0 W;
    public boolean W0;
    public int X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int a;
    public float a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public long b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public WindowInsets c0;
    public org.telegram.ui.Components.lm0 c1;
    public n0 d;
    public MessageObject d0;
    public boolean d1;
    public bg.d1 e;
    public ImageReceiver.BitmapHolder e0;
    public final q31 e1;
    public View f;
    public boolean f0;
    public final int[] f1;
    public final int[] g1;
    public jf.s0 h1;
    public int i0;
    public boolean i1;
    public long j0;
    public int j1;
    public Runnable k0;
    public boolean k1;
    public boolean l0;
    public Runnable l1;
    public float m0;
    public boolean m1;
    public y31 n;
    public float n0;
    public final q31 n1;
    public float o0;
    public float[] o1;
    public float p0;
    public final Path p1;
    public float q0;
    public final w0 q1;
    public nh.t3 r;
    public float r0;
    public final w0 r1;
    public boolean s;
    public float s0;
    public boolean s1;
    public float t0;
    public float u0;
    public long v;
    public float v0;
    public e5.c w;
    public float w0;
    public TextureView x;
    public float x0;
    public x31 y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean g0 = true;
    public final PhotoBackgroundDrawable h0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public t31 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            t31 t31Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (t31Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    t31Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            jf.s0 s0Var = secretMediaViewer.h1;
            if (s0Var != null) {
                s0Var.a(secretMediaViewer.f0 && i10 == 255);
            }
            super.setAlpha(i10);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13 + AndroidUtilities.navigationBarHeight);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(Rect rect) {
            rect.bottom += AndroidUtilities.navigationBarHeight;
            super.setBounds(rect);
        }
    }

    public SecretMediaViewer() {
        new Paint();
        this.u0 = 1.0f;
        this.I0 = new DecelerateInterpolator(1.5f);
        this.K0 = 1.0f;
        this.Z0 = true;
        this.e1 = new q31(this, 2);
        this.f1 = new int[2];
        this.g1 = new int[2];
        this.n1 = new q31(this, 3);
        this.p1 = new Path();
        this.q1 = new w0("videoCrossfadeAlpha", 4);
        this.r1 = new w0("animationValue", 5);
    }

    public static /* synthetic */ WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.c0;
        secretMediaViewer.c0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            secretMediaViewer.d.requestLayout();
        }
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(SecretMediaViewer secretMediaViewer, Canvas canvas) {
        float f9;
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
        boolean z10;
        float f21;
        float f22;
        boolean z11;
        int bitmapWidth;
        int bitmapHeight;
        int i10;
        float f23;
        float f24;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.h0;
        Path path = secretMediaViewer.p1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.f0) {
            if (secretMediaViewer.G0 != null) {
                org.telegram.ui.Components.lm0 lm0Var = secretMediaViewer.c1;
                if (!lm0Var.q) {
                    lm0Var.a();
                }
                float f25 = secretMediaViewer.u0;
                float f26 = secretMediaViewer.x0;
                float f27 = secretMediaViewer.animationValue;
                f11 = ((f26 - f25) * f27) + f25;
                float f28 = secretMediaViewer.t0;
                float z12 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.w0, f28, f27, f28);
                float f29 = secretMediaViewer.s0;
                f13 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.v0, f29, f27, f29);
                f9 = -1.0f;
                float f30 = secretMediaViewer.n0;
                f10 = 1.0f;
                f14 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.y0, f30, f27, f30);
                float f31 = secretMediaViewer.o0;
                f15 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.z0, f31, f27, f31);
                float f32 = secretMediaViewer.p0;
                f16 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.A0, f32, f27, f32);
                float f33 = secretMediaViewer.q0;
                float z13 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.B0, f33, f27, f33);
                float f34 = secretMediaViewer.r0;
                float z14 = com.google.android.recaptcha.internal.a.z(secretMediaViewer.C0, f34, f27, f34);
                float f35 = (f26 == 1.0f && f25 == 1.0f && f29 == 0.0f) ? z12 : -1.0f;
                secretMediaViewer.e.invalidate();
                f18 = z14;
                f19 = z12;
                f12 = f35;
                f17 = z13;
            } else {
                f9 = -1.0f;
                f10 = 1.0f;
                if (secretMediaViewer.F0 != 0) {
                    secretMediaViewer.s0 = secretMediaViewer.v0;
                    secretMediaViewer.t0 = secretMediaViewer.w0;
                    secretMediaViewer.o0 = secretMediaViewer.z0;
                    secretMediaViewer.n0 = secretMediaViewer.y0;
                    secretMediaViewer.p0 = secretMediaViewer.A0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    float f36 = secretMediaViewer.x0;
                    secretMediaViewer.u0 = f36;
                    secretMediaViewer.F0 = 0L;
                    secretMediaViewer.n(f36);
                    secretMediaViewer.a1 = false;
                }
                org.telegram.ui.Components.lm0 lm0Var2 = secretMediaViewer.c1;
                if (!lm0Var2.q && lm0Var2.b()) {
                    org.telegram.ui.Components.lm0 lm0Var3 = secretMediaViewer.c1;
                    float f37 = lm0Var3.b;
                    if (f37 < secretMediaViewer.S0 && f37 > secretMediaViewer.R0) {
                        secretMediaViewer.s0 = lm0Var3.j;
                    }
                    float f38 = lm0Var3.c;
                    if (f38 < secretMediaViewer.U0 && f38 > secretMediaViewer.T0) {
                        secretMediaViewer.t0 = lm0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f11 = secretMediaViewer.u0;
                f12 = secretMediaViewer.t0;
                f13 = secretMediaViewer.s0;
                f14 = secretMediaViewer.n0;
                f15 = secretMediaViewer.o0;
                f16 = secretMediaViewer.p0;
                f17 = secretMediaViewer.q0;
                f18 = secretMediaViewer.r0;
                if (secretMediaViewer.W0) {
                    f19 = f12;
                    f12 = -1.0f;
                } else {
                    f19 = f12;
                }
            }
            if (secretMediaViewer.D0 != null) {
                if (secretMediaViewer.o1 == null) {
                    secretMediaViewer.o1 = new float[8];
                }
                float f39 = secretMediaViewer.E0 ? secretMediaViewer.animationValue : f10 - secretMediaViewer.animationValue;
                f20 = f14;
                int i12 = 0;
                z10 = true;
                for (int i13 = 8; i12 < i13; i13 = 8) {
                    float[] fArr = secretMediaViewer.o1;
                    int i14 = i12;
                    float lerp = AndroidUtilities.lerp(secretMediaViewer.D0[i12 / 2] * 2.0f, 0.0f, f39);
                    fArr[i12 + 1] = lerp;
                    fArr[i14] = lerp;
                    if (secretMediaViewer.o1[i14] > 0.0f) {
                        z10 = false;
                    }
                    i12 = i14 + 2;
                }
            } else {
                f20 = f14;
                z10 = true;
            }
            if (secretMediaViewer.i0 != 3) {
                if (secretMediaViewer.u0 != f10 || f12 == f9 || secretMediaViewer.a1) {
                    photoBackgroundDrawable.setAlpha(255);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f10 - (Math.min(Math.abs(f12), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.a1) {
                    float f40 = secretMediaViewer.S0;
                    if (f13 > f40) {
                        float min = Math.min(1.0f, (f13 - f40) / canvas.getWidth());
                        f22 = 0.3f * min;
                        f21 = 1.0f - min;
                        f13 = secretMediaViewer.S0;
                        e5.c cVar = secretMediaViewer.w;
                        z11 = cVar == null && cVar.getVisibility() == 0;
                        canvas.save();
                        float f41 = f11 - f22;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f13, (secretMediaViewer.e.getHeight() / 2) + f19);
                        canvas.scale(f41, f41);
                        bitmapWidth = imageReceiver.getBitmapWidth();
                        bitmapHeight = imageReceiver.getBitmapHeight();
                        i10 = secretMediaViewer.K;
                        if (i10 != 0 && (i11 = secretMediaViewer.L) != 0) {
                            bitmapWidth = i10;
                            bitmapHeight = i11;
                        }
                        if (z11 && secretMediaViewer.Y && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.x.getMeasuredWidth() / secretMediaViewer.x.getMeasuredHeight())) > 0.01f) {
                            bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                            bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
                        }
                        float f42 = bitmapHeight;
                        float f43 = bitmapWidth;
                        float min2 = Math.min(secretMediaViewer.e.getHeight() / f42, secretMediaViewer.e.getWidth() / f43);
                        int i15 = (int) (f43 * min2);
                        int i16 = (int) (f42 * min2);
                        f23 = (-i15) / 2;
                        float f44 = f18 / f41;
                        float f45 = f23 + f44;
                        f24 = (-i16) / 2;
                        float f46 = f16;
                        float f47 = (i15 / 2) - f44;
                        float f48 = i16 / 2;
                        canvas.clipRect(f45, (f20 / f41) + f24, f47, f48 - (f15 / f41));
                        if (!z10) {
                            path.reset();
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(f45, (f46 / f41) + f24, f47, f48 - (f17 / f41));
                            path.addRoundRect(rectF, secretMediaViewer.o1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z11 || !secretMediaViewer.Y || !secretMediaViewer.Z || secretMediaViewer.a0 != 1.0f) {
                            imageReceiver.setAlpha(f21);
                            imageReceiver.setImageCoords(f23, f24, i15, i16);
                            imageReceiver.draw(canvas);
                        }
                        if (z11) {
                            if (!secretMediaViewer.Z && secretMediaViewer.Y) {
                                secretMediaViewer.Z = true;
                                secretMediaViewer.a0 = 0.0f;
                                secretMediaViewer.b0 = System.currentTimeMillis();
                            }
                            canvas.translate(f23, f24);
                            secretMediaViewer.x.setAlpha(f21 * secretMediaViewer.a0);
                            secretMediaViewer.w.draw(canvas);
                            if (secretMediaViewer.Z && secretMediaViewer.a0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j10 = currentTimeMillis - secretMediaViewer.b0;
                                secretMediaViewer.b0 = currentTimeMillis;
                                secretMediaViewer.a0 = (j10 / 200.0f) + secretMediaViewer.a0;
                                secretMediaViewer.e.invalidate();
                                if (secretMediaViewer.a0 > 1.0f) {
                                    secretMediaViewer.a0 = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f21 = 1.0f;
            f22 = 0.0f;
            e5.c cVar2 = secretMediaViewer.w;
            if (cVar2 == null) {
            }
            canvas.save();
            float f412 = f11 - f22;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f13, (secretMediaViewer.e.getHeight() / 2) + f19);
            canvas.scale(f412, f412);
            bitmapWidth = imageReceiver.getBitmapWidth();
            bitmapHeight = imageReceiver.getBitmapHeight();
            i10 = secretMediaViewer.K;
            if (i10 != 0) {
                bitmapWidth = i10;
                bitmapHeight = i11;
            }
            if (z11) {
                bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
            }
            float f422 = bitmapHeight;
            float f432 = bitmapWidth;
            float min22 = Math.min(secretMediaViewer.e.getHeight() / f422, secretMediaViewer.e.getWidth() / f432);
            int i152 = (int) (f432 * min22);
            int i162 = (int) (f422 * min22);
            f23 = (-i152) / 2;
            float f442 = f18 / f412;
            float f452 = f23 + f442;
            f24 = (-i162) / 2;
            float f462 = f16;
            float f472 = (i152 / 2) - f442;
            float f482 = i162 / 2;
            canvas.clipRect(f452, (f20 / f412) + f24, f472, f482 - (f15 / f412));
            if (!z10) {
            }
            if (z11) {
            }
            imageReceiver.setAlpha(f21);
            imageReceiver.setImageCoords(f23, f24, i152, i162);
            imageReceiver.draw(canvas);
            if (z11) {
            }
            canvas.restore();
        }
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = t1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = t1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    t1 = secretMediaViewer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return t1 != null;
    }

    public final void c(float f9, float f10, float f11, boolean z10) {
        if (this.u0 == f9 && this.s0 == f10 && this.t0 == f11) {
            return;
        }
        this.a1 = z10;
        this.x0 = f9;
        this.v0 = f10;
        this.w0 = f11;
        this.F0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.G0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.G0.setInterpolator(this.I0);
        this.G0.setDuration(MediaDataController.MAX_LINKS_COUNT);
        this.G0.addListener(new w31(this, 3));
        this.G0.start();
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
        float f9 = this.s0;
        float f10 = this.t0;
        n(this.u0);
        float f11 = this.s0;
        float f12 = this.R0;
        if (f11 >= f12) {
            f12 = this.S0;
        }
        f9 = f12;
        float f13 = this.t0;
        float f14 = this.T0;
        if (f13 >= f14) {
            f14 = this.U0;
        }
        f10 = f14;
        c(this.u0, f9, f10, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.d0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.d0.getId()))) {
                if (this.F && !this.D) {
                    this.E = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.d1 = true;
                    return;
                }
            }
            return;
        }
        if (i10 != NotificationCenter.didCreatedNewDeleteTask) {
            if (i10 == NotificationCenter.updateMessageMedia) {
                if (this.d0.getId() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.F && !this.D) {
                        this.E = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.d1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.d0 == null || this.n == null || ((Long) objArr[0]).longValue() != this.v) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            int keyAt = sparseArray.keyAt(i12);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (this.d0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                    this.d0.messageOwner.destroyTime = keyAt;
                    this.n.invalidate();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x031d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(boolean z10, boolean z11) {
        zt0 zt0Var;
        x31 x31Var;
        Runnable runnable;
        Runnable runnable2;
        char c3;
        char c6;
        char c10;
        char c11;
        char c12;
        if (this.b == null || !this.f0) {
            return false;
        }
        if (this.i0 != 0 && Math.abs(this.j0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable3 = this.k0;
            if (runnable3 != null) {
                runnable3.run();
                this.k0 = null;
            }
            this.i0 = 0;
        }
        if (this.i0 != 0) {
            return false;
        }
        if (this.m1 && z11) {
            return false;
        }
        Activity activity = this.b;
        if (activity != null) {
            AndroidUtilities.setLightNavigationBar(activity, this.k1);
            AndroidUtilities.setNavigationBarColor(this.b, this.j1);
            Activity activity2 = this.b;
            if (activity2 instanceof LaunchActivity) {
                ((LaunchActivity) activity2).y(this.j1);
            } else {
                AndroidUtilities.setNavigationBarColor(activity2, this.j1);
            }
        }
        jf.s0 s0Var = this.h1;
        if (s0Var != null) {
            s0Var.destroy();
            this.h1 = null;
        }
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.g0 = false;
        this.H = System.currentTimeMillis();
        xt0 xt0Var = this.J;
        if (xt0Var != null) {
            MessageObject messageObject = this.d0;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                zt0Var = xt0Var.E(messageObject, null, 0, true, false);
                x31Var = this.y;
                if (x31Var != null) {
                    x31Var.C();
                }
                PhotoBackgroundDrawable photoBackgroundDrawable = this.h0;
                int i10 = 1;
                if (z10) {
                    k(false, true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<bg.d1, Float>) View.SCALE_X, 0.9f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<bg.d1, Float>) View.SCALE_Y, 0.9f);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0);
                    cg.m1 m1Var = this.B;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, (Property<cg.m1, Float>) property, 0.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.W, (Property<xs0, Float>) property, 0.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                    z31 z31Var = this.Q;
                    animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(z31Var, z31Var.n, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<z31, Float>) property, 0.0f));
                    this.i0 = 2;
                    this.k0 = new q31(this, zt0Var, i10);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new w31(this, 2));
                    this.j0 = System.currentTimeMillis();
                    runnable = null;
                    this.e.setLayerType(2, null);
                    animatorSet.start();
                } else {
                    this.i0 = 3;
                    this.e.invalidate();
                    this.G0 = new AnimatorSet();
                    if (zt0Var == null || zt0Var.a.getThumbBitmap() == null || z11 || this.l1 != null) {
                        c3 = 7;
                        c6 = 6;
                        c10 = 5;
                        c11 = 4;
                        c12 = 3;
                        int i11 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                        if (this.t0 < 0.0f) {
                            i11 = -i11;
                        }
                        this.w0 = i11;
                    } else {
                        zt0Var.a.setVisible(false, true);
                        RectF drawRegion = zt0Var.a.getDrawRegion();
                        c3 = 7;
                        float f9 = drawRegion.right - drawRegion.left;
                        c6 = 6;
                        float f10 = drawRegion.bottom - drawRegion.top;
                        Point point = AndroidUtilities.displaySize;
                        c10 = 5;
                        c11 = 4;
                        c12 = 3;
                        this.x0 = Math.max(f9 / point.x, f10 / (point.y + AndroidUtilities.statusBarHeight));
                        float f11 = zt0Var.b;
                        float f12 = drawRegion.left;
                        this.v0 = ((f9 / 2.0f) + (f11 + f12)) - (r7 / 2);
                        this.w0 = ((f10 / 2.0f) + (zt0Var.c + drawRegion.top)) - (r6 / 2);
                        this.C0 = Math.abs(f12 - zt0Var.a.getImageX());
                        int abs = (int) Math.abs(drawRegion.top - zt0Var.a.getImageY());
                        zt0Var.d.getLocationInWindow(new int[2]);
                        float f13 = (r7[1] - (zt0Var.c + drawRegion.top)) + zt0Var.j;
                        this.y0 = f13;
                        float f14 = abs;
                        this.y0 = Math.max(0.0f, Math.max(f13, f14));
                        float height = (((zt0Var.c + drawRegion.top) + ((int) f10)) - (zt0Var.d.getHeight() + r7[1])) + zt0Var.i;
                        this.z0 = height;
                        this.z0 = Math.max(0.0f, Math.max(height, f14));
                        this.A0 = 0.0f;
                        this.A0 = Math.max(0.0f, Math.max(0.0f, f14));
                        this.B0 = 0.0f;
                        this.B0 = Math.max(0.0f, Math.max(0.0f, f14));
                        this.F0 = System.currentTimeMillis();
                        this.a1 = true;
                    }
                    this.E0 = false;
                    k(false, true);
                    boolean z12 = this.F;
                    w0 w0Var = this.r1;
                    if (z12) {
                        this.Z = false;
                        this.Y = false;
                        AnimatorSet animatorSet2 = this.G0;
                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, w0Var, 0.0f, 1.0f);
                        cg.m1 m1Var2 = this.B;
                        Property property2 = View.ALPHA;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m1Var2, (Property<cg.m1, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.W, (Property<xs0, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                        z31 z31Var2 = this.Q;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(z31Var2, z31Var2.n, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.Q, (Property<z31, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<nh.t3, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this, this.q1, 0.0f);
                        Animator[] animatorArr = new Animator[9];
                        animatorArr[0] = ofInt2;
                        animatorArr[1] = ofFloat6;
                        animatorArr[2] = ofFloat7;
                        animatorArr[c12] = ofFloat8;
                        animatorArr[c11] = ofFloat9;
                        animatorArr[c10] = ofFloat10;
                        animatorArr[c6] = ofFloat11;
                        animatorArr[c3] = ofFloat12;
                        animatorArr[8] = ofFloat13;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        ImageReceiver imageReceiver = this.h;
                        imageReceiver.setManualAlphaAnimator(true);
                        AnimatorSet animatorSet3 = this.G0;
                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.r6.d, 0);
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, w0Var, 0.0f, 1.0f);
                        cg.m1 m1Var3 = this.B;
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(m1Var3, (Property<cg.m1, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.W, (Property<xs0, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                        z31 z31Var3 = this.Q;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(z31Var3, z31Var3.n, 0.0f);
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.Q, (Property<z31, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<nh.t3, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(imageReceiver, org.telegram.ui.Components.r6.c, 0.0f);
                        Animator[] animatorArr2 = new Animator[9];
                        animatorArr2[0] = ofInt3;
                        animatorArr2[1] = ofFloat14;
                        animatorArr2[2] = ofFloat15;
                        animatorArr2[c12] = ofFloat16;
                        animatorArr2[c11] = ofFloat17;
                        animatorArr2[c10] = ofFloat18;
                        animatorArr2[c6] = ofFloat19;
                        animatorArr2[c3] = ofFloat20;
                        animatorArr2[8] = ofFloat21;
                        animatorSet3.playTogether(animatorArr2);
                    }
                    this.k0 = new q31(this, zt0Var, 0);
                    this.G0.setInterpolator(new DecelerateInterpolator());
                    this.G0.setDuration(250L);
                    this.G0.addListener(new org.telegram.ui.Components.ok0(15, this, zt0Var));
                    this.j0 = System.currentTimeMillis();
                    this.e.setLayerType(2, null);
                    this.G0.start();
                    runnable = null;
                }
                runnable2 = this.l1;
                if (runnable2 != null) {
                    runnable2.run();
                    this.l1 = runnable;
                }
                return true;
            }
        }
        zt0Var = null;
        x31Var = this.y;
        if (x31Var != null) {
        }
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.h0;
        int i102 = 1;
        if (z10) {
        }
        runnable2 = this.l1;
        if (runnable2 != null) {
        }
        return true;
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.a0;
    }

    public final void h(File file) {
        if (this.b == null) {
            return;
        }
        i();
        if (this.x == null) {
            e5.c cVar = new e5.c(this.b);
            this.w = cVar;
            cVar.setVisibility(0);
            this.e.addView(this.w, 0, i7.f6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.x = textureView;
            textureView.setOpaque(false);
            this.w.addView(this.x, i7.f6.e(-1, -1, 17));
        }
        this.Y = false;
        this.Z = false;
        this.x.setAlpha(1.0f);
        if (this.y == null) {
            x31 x31Var = new x31(this);
            this.y = x31Var;
            x31Var.W(this.x);
            this.y.F = new oc.i(this, file, false, 14);
        }
        this.y.E(Uri.fromFile(file), "other");
        this.y.Q(true);
        this.S.a(true, true);
    }

    public final void i() {
        x31 x31Var = this.y;
        if (x31Var != null) {
            this.X = 0;
            x31Var.I();
            this.y = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        e5.c cVar = this.w;
        if (cVar != null) {
            this.e.removeView(cVar);
            this.w = null;
        }
        if (this.x != null) {
            this.x = null;
        }
        this.A = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.y5.cloneSpans(charSequence, 3);
        if (this.W == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.T = frameLayout;
            this.V.setContainer(frameLayout);
            xs0 xs0Var = new xs0(this, this.e.getContext(), this.V, this.T, 1);
            this.W = xs0Var;
            this.V.setScrollView(xs0Var);
            this.T.setClipChildren(false);
            this.W.addView(this.T, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.W, i7.f6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.o(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.V.getParent() != this.T) {
            this.V.setMeasureAllChildren(true);
            this.T.addView(this.V, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.V.getCurrentView().getText());
        nt0 nt0Var = this.V;
        TextView nextView = z10 ? nt0Var.getNextView() : nt0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.V.getCurrentView().setSingleLine(false);
            this.V.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.V.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.V.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.V.getCurrentView().setEllipsize(null);
            this.V.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        xs0 xs0Var2 = this.W;
        xs0Var2.h0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(xs0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new u31(this, isEmpty2, isEmpty, 1)).addTransition(new u31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.W.h0 = true;
                duration.addTransition(new org.telegram.ui.Components.cm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.V);
            }
            TransitionManager.beginDelayedTransition(this.W, duration);
            z11 = true;
        } else {
            this.V.getCurrentView().setText((CharSequence) null);
            xs0 xs0Var3 = this.W;
            if (xs0Var3 != null) {
                xs0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (isEmpty) {
            this.V.a(null, z10, false);
            this.V.getCurrentView().setTextColor(-1);
            nt0 nt0Var2 = this.V;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            nt0Var2.b(4, z12);
            this.V.setTag(null);
        } else {
            org.telegram.ui.ActionBar.g6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.k31.B())) {
                if (messageObject.messageOwner.entities.isEmpty()) {
                    cloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    cloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), false);
                }
            }
            this.V.setTag(cloneSpans);
            try {
                this.V.a(cloneSpans, z10, false);
                xs0 xs0Var4 = this.W;
                if (xs0Var4 != null) {
                    xs0Var4.H(xs0Var4.getWidth(), xs0Var4.getHeight());
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.V.setVisibility(this.g0 ? 0 : 4);
        }
        if (this.V.getCurrentView() instanceof mt0) {
            ((mt0) this.V.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12 = this.F && z10;
        if (this.i1 == z12 && z11) {
            return;
        }
        this.i1 = z12;
        this.R.animate().cancel();
        if (z11) {
            this.R.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.jr.h).start();
            return;
        }
        this.R.setScaleX(z12 ? 1.0f : 0.6f);
        this.R.setScaleY(z12 ? 1.0f : 0.6f);
        this.R.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void l() {
        this.r.q(true);
        String string = LocaleController.getString(this.F ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        nh.t3 t3Var = this.r;
        t3Var.h = nh.t3.a(string, t3Var.getTextPaint());
        this.r.t(string);
        this.r.l(12.0f, 7.0f, 11.0f, 7.0f);
        nh.t3 t3Var2 = this.r;
        t3Var2.getClass();
        t3Var2.a0 = AndroidUtilities.dp(2);
        nh.t3 t3Var3 = this.r;
        t3Var3.getClass();
        t3Var3.W = 0.0f;
        t3Var3.j(R.raw.fire_on);
        this.r.v();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        q31 q31Var = this.n1;
        AndroidUtilities.cancelRunOnUIThread(q31Var);
        if (z10 && this.F) {
            AndroidUtilities.runOnUIThread(q31Var, 3000L);
        }
        if (z10) {
            this.B.setVisibility(0);
        }
        this.B.setEnabled(z10);
        this.g0 = z10;
        k(z10, z11);
        if (!z11) {
            this.B.setAlpha(z10 ? 1.0f : 0.0f);
            this.W.setAlpha(z10 ? 1.0f : 0.0f);
            this.P.setAlpha(z10 ? 1.0f : 0.0f);
            this.f.setAlpha(z10 ? 1.0f : 0.0f);
            if (z10) {
                return;
            }
            this.B.setVisibility(8);
            this.W.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        cg.m1 m1Var = this.B;
        Property property = View.ALPHA;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(m1Var, (Property<cg.m1, Float>) property, z10 ? 1.0f : 0.0f));
        z31 z31Var = this.Q;
        arrayList.add(ObjectAnimator.ofFloat(z31Var, z31Var.n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.W, (Property<xs0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.P, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.C = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.C.addListener(new w31(this, i10));
        }
        this.C.setDuration(200L);
        this.C.start();
    }

    public final void n(float f9) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f9) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f9) - this.e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.R0 = -imageWidth;
            this.S0 = imageWidth;
        } else {
            this.S0 = 0.0f;
            this.R0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.T0 = -imageHeight;
            this.U0 = imageHeight;
        } else {
            this.U0 = 0.0f;
            this.T0 = 0.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r9 > r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r0 > r1) goto L18;
     */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f9 = this.u0;
        if ((f9 == 1.0f && (this.t0 != 0.0f || this.s0 != 0.0f)) || this.F0 != 0 || this.i0 != 0) {
            return false;
        }
        if (f9 == 1.0f) {
            float A = org.telegram.messenger.x3.A(3.0f, this.u0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.s0, motionEvent.getX() - (this.e.getWidth() / 2));
            float A2 = org.telegram.messenger.x3.A(3.0f, this.u0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.t0, motionEvent.getY() - (this.e.getHeight() / 2));
            n(3.0f);
            float f10 = this.R0;
            if (A >= f10) {
                f10 = this.S0;
            }
            A = f10;
            float f11 = this.T0;
            if (A2 >= f11) {
                f11 = this.U0;
            }
            A2 = f11;
            c(3.0f, A, A2, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.X0 = true;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        if (this.u0 == 1.0f) {
            return false;
        }
        this.c1.a();
        this.c1.c(Math.round(this.s0), Math.round(this.t0), Math.round(f9), Math.round(f10), (int) this.R0, (int) this.S0, (int) this.T0, (int) this.U0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.b1) {
            return false;
        }
        if (this.y == null || !this.g0 || motionEvent.getX() < this.R.getX() || motionEvent.getY() < this.R.getY() || motionEvent.getX() > this.R.getX() + this.R.getMeasuredWidth() || motionEvent.getX() > this.R.getX() + this.R.getMeasuredWidth()) {
            m(!this.g0, true);
            return true;
        }
        this.y.Q(!r5.d.h());
        if (this.y.d.h()) {
            m(true, true);
            return true;
        }
        k(true, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setAnimationValue(float f9) {
        this.animationValue = f9;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f9) {
        this.a0 = f9;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
