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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer x1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public float E0;
    public org.telegram.ui.Components.z7 F;
    public float F0;
    public AnimatorSet G;
    public float G0;
    public boolean H;
    public int[] H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public long J0;
    public long K;
    public AnimatorSet K0;
    public long L;
    public GestureDetector L0;
    public boolean M;
    public final DecelerateInterpolator M0;
    public av0 N;
    public float N0;
    public int O;
    public float O0;
    public int P;
    public float P0;
    public org.telegram.ui.Components.i71 Q;
    public float Q0;
    public t50 R;
    public float R0;
    public org.telegram.ui.ActionBar.j5 S;
    public float S0;
    public View T;
    public float T0;
    public e51 U;
    public float U0;
    public ImageView V;
    public float V0;
    public org.telegram.ui.Components.fg0 W;
    public float W0;
    public FrameLayout X;
    public float X0;
    public vs0 Y;
    public float Y0;
    public qu0 Z;
    public boolean Z0;
    public int a;
    public au0 a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public int b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public boolean c1;
    public j0 d;
    public boolean d0;
    public boolean d1;
    public ah.w e;
    public float e0;
    public boolean e1;
    public View f;
    public long f0;
    public boolean f1;
    public WindowInsets g0;
    public org.telegram.ui.Components.nm0 g1;
    public MessageObject h0;
    public boolean h1;
    public ImageReceiver.BitmapHolder i0;
    public final w41 i1;
    public boolean j0;
    public final int[] j1;
    public final int[] k1;
    public kb0 l1;
    public int m0;
    public boolean m1;
    public d51 n;
    public long n0;
    public int n1;
    public Runnable o0;
    public boolean o1;
    public boolean p0;
    public Runnable p1;
    public float q0;
    public boolean q1;
    public di.f4 r;
    public float r0;
    public final w41 r1;
    public boolean s;
    public float s0;
    public float[] s1;
    public float t0;
    public final Path t1;
    public float u0;
    public final t0 u1;
    public long v;
    public float v0;
    public final t0 v1;
    public l4 w;
    public float w0;
    public boolean w1;
    public TextureView x;
    public float x0;
    public c51 y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean k0 = true;
    public final PhotoBackgroundDrawable l0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public rx0 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            rx0 rx0Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (rx0Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    rx0Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            kb0 kb0Var = secretMediaViewer.l1;
            if (kb0Var != null) {
                kb0Var.a(secretMediaViewer.j0 && i10 == 255);
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
        this.y0 = 1.0f;
        this.M0 = new DecelerateInterpolator(1.5f);
        this.O0 = 1.0f;
        this.d1 = true;
        this.i1 = new w41(this, 2);
        this.j1 = new int[2];
        this.k1 = new int[2];
        this.r1 = new w41(this, 3);
        this.t1 = new Path();
        this.u1 = new t0("videoCrossfadeAlpha", 4);
        this.v1 = new t0("animationValue", 5);
    }

    public static /* synthetic */ WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.g0;
        secretMediaViewer.g0 = windowInsets;
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
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.l0;
        Path path = secretMediaViewer.t1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.j0) {
            if (secretMediaViewer.K0 != null) {
                org.telegram.ui.Components.nm0 nm0Var = secretMediaViewer.g1;
                if (!nm0Var.q) {
                    nm0Var.a();
                }
                float f25 = secretMediaViewer.y0;
                float f26 = secretMediaViewer.B0;
                float f27 = secretMediaViewer.animationValue;
                f11 = ((f26 - f25) * f27) + f25;
                float f28 = secretMediaViewer.x0;
                float z12 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.A0, f28, f27, f28);
                float f29 = secretMediaViewer.w0;
                f13 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.z0, f29, f27, f29);
                f7 = -1.0f;
                float f30 = secretMediaViewer.r0;
                f10 = 1.0f;
                f14 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.C0, f30, f27, f30);
                float f31 = secretMediaViewer.s0;
                f15 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.D0, f31, f27, f31);
                float f32 = secretMediaViewer.t0;
                f16 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.E0, f32, f27, f32);
                float f33 = secretMediaViewer.u0;
                float z13 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.F0, f33, f27, f33);
                float f34 = secretMediaViewer.v0;
                float z14 = com.google.android.gms.internal.vision.e2.z(secretMediaViewer.G0, f34, f27, f34);
                float f35 = (f26 == 1.0f && f25 == 1.0f && f29 == 0.0f) ? z12 : -1.0f;
                secretMediaViewer.e.invalidate();
                f18 = z14;
                f19 = z12;
                f12 = f35;
                f17 = z13;
            } else {
                f7 = -1.0f;
                f10 = 1.0f;
                if (secretMediaViewer.J0 != 0) {
                    secretMediaViewer.w0 = secretMediaViewer.z0;
                    secretMediaViewer.x0 = secretMediaViewer.A0;
                    secretMediaViewer.s0 = secretMediaViewer.D0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    secretMediaViewer.t0 = secretMediaViewer.E0;
                    secretMediaViewer.u0 = secretMediaViewer.F0;
                    secretMediaViewer.v0 = secretMediaViewer.G0;
                    float f36 = secretMediaViewer.B0;
                    secretMediaViewer.y0 = f36;
                    secretMediaViewer.J0 = 0L;
                    secretMediaViewer.n(f36);
                    secretMediaViewer.e1 = false;
                }
                org.telegram.ui.Components.nm0 nm0Var2 = secretMediaViewer.g1;
                if (!nm0Var2.q && nm0Var2.b()) {
                    org.telegram.ui.Components.nm0 nm0Var3 = secretMediaViewer.g1;
                    float f37 = nm0Var3.b;
                    if (f37 < secretMediaViewer.W0 && f37 > secretMediaViewer.V0) {
                        secretMediaViewer.w0 = nm0Var3.j;
                    }
                    float f38 = nm0Var3.c;
                    if (f38 < secretMediaViewer.Y0 && f38 > secretMediaViewer.X0) {
                        secretMediaViewer.x0 = nm0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f11 = secretMediaViewer.y0;
                f12 = secretMediaViewer.x0;
                f13 = secretMediaViewer.w0;
                f14 = secretMediaViewer.r0;
                f15 = secretMediaViewer.s0;
                f16 = secretMediaViewer.t0;
                f17 = secretMediaViewer.u0;
                f18 = secretMediaViewer.v0;
                if (secretMediaViewer.a1) {
                    f19 = f12;
                    f12 = -1.0f;
                } else {
                    f19 = f12;
                }
            }
            if (secretMediaViewer.H0 != null) {
                if (secretMediaViewer.s1 == null) {
                    secretMediaViewer.s1 = new float[8];
                }
                float f39 = secretMediaViewer.I0 ? secretMediaViewer.animationValue : f10 - secretMediaViewer.animationValue;
                f20 = f14;
                int i12 = 0;
                z10 = true;
                for (int i13 = 8; i12 < i13; i13 = 8) {
                    float[] fArr = secretMediaViewer.s1;
                    int i14 = i12;
                    float lerp = AndroidUtilities.lerp(secretMediaViewer.H0[i12 / 2] * 2.0f, 0.0f, f39);
                    fArr[i12 + 1] = lerp;
                    fArr[i14] = lerp;
                    if (secretMediaViewer.s1[i14] > 0.0f) {
                        z10 = false;
                    }
                    i12 = i14 + 2;
                }
            } else {
                f20 = f14;
                z10 = true;
            }
            if (secretMediaViewer.m0 != 3) {
                if (secretMediaViewer.y0 != f10 || f12 == f7 || secretMediaViewer.e1) {
                    photoBackgroundDrawable.setAlpha(255);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f10 - (Math.min(Math.abs(f12), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.e1) {
                    float f40 = secretMediaViewer.W0;
                    if (f13 > f40) {
                        float min = Math.min(1.0f, (f13 - f40) / canvas.getWidth());
                        f22 = 0.3f * min;
                        f21 = 1.0f - min;
                        f13 = secretMediaViewer.W0;
                        l4 l4Var = secretMediaViewer.w;
                        z11 = l4Var == null && l4Var.getVisibility() == 0;
                        canvas.save();
                        float f41 = f11 - f22;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f13, (secretMediaViewer.e.getHeight() / 2) + f19);
                        canvas.scale(f41, f41);
                        bitmapWidth = imageReceiver.getBitmapWidth();
                        bitmapHeight = imageReceiver.getBitmapHeight();
                        i10 = secretMediaViewer.O;
                        if (i10 != 0 && (i11 = secretMediaViewer.P) != 0) {
                            bitmapWidth = i10;
                            bitmapHeight = i11;
                        }
                        if (z11 && secretMediaViewer.c0 && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.x.getMeasuredWidth() / secretMediaViewer.x.getMeasuredHeight())) > 0.01f) {
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
                            path.addRoundRect(rectF, secretMediaViewer.s1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z11 || !secretMediaViewer.c0 || !secretMediaViewer.d0 || secretMediaViewer.e0 != 1.0f) {
                            imageReceiver.setAlpha(f21);
                            imageReceiver.setImageCoords(f23, f24, i15, i16);
                            imageReceiver.draw(canvas);
                        }
                        if (z11) {
                            if (!secretMediaViewer.d0 && secretMediaViewer.c0) {
                                secretMediaViewer.d0 = true;
                                secretMediaViewer.e0 = 0.0f;
                                secretMediaViewer.f0 = System.currentTimeMillis();
                            }
                            canvas.translate(f23, f24);
                            secretMediaViewer.x.setAlpha(f21 * secretMediaViewer.e0);
                            secretMediaViewer.w.draw(canvas);
                            if (secretMediaViewer.d0 && secretMediaViewer.e0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j3 = currentTimeMillis - secretMediaViewer.f0;
                                secretMediaViewer.f0 = currentTimeMillis;
                                secretMediaViewer.e0 = (j3 / 200.0f) + secretMediaViewer.e0;
                                secretMediaViewer.e.invalidate();
                                if (secretMediaViewer.e0 > 1.0f) {
                                    secretMediaViewer.e0 = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f21 = 1.0f;
            f22 = 0.0f;
            l4 l4Var2 = secretMediaViewer.w;
            if (l4Var2 == null) {
            }
            canvas.save();
            float f412 = f11 - f22;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f13, (secretMediaViewer.e.getHeight() / 2) + f19);
            canvas.scale(f412, f412);
            bitmapWidth = imageReceiver.getBitmapWidth();
            bitmapHeight = imageReceiver.getBitmapHeight();
            i10 = secretMediaViewer.O;
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
        SecretMediaViewer secretMediaViewer2 = x1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = x1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    x1 = secretMediaViewer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return x1 != null;
    }

    public final void c(float f7, float f10, float f11, boolean z10) {
        if (this.y0 == f7 && this.w0 == f10 && this.x0 == f11) {
            return;
        }
        this.e1 = z10;
        this.B0 = f7;
        this.z0 = f10;
        this.A0 = f11;
        this.J0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.K0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.K0.setInterpolator(this.M0);
        this.K0.setDuration(MediaDataController.MAX_LINKS_COUNT);
        this.K0.addListener(new b51(this, 3));
        this.K0.start();
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
        float f7 = this.w0;
        float f10 = this.x0;
        n(this.y0);
        float f11 = this.w0;
        float f12 = this.V0;
        if (f11 >= f12) {
            f12 = this.W0;
        }
        f7 = f12;
        float f13 = this.x0;
        float f14 = this.X0;
        if (f13 >= f14) {
            f14 = this.Y0;
        }
        f10 = f14;
        c(this.y0, f7, f10, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.h0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.h0.getId()))) {
                if (this.J && !this.H) {
                    this.I = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.h1 = true;
                    return;
                }
            }
            return;
        }
        if (i10 != NotificationCenter.didCreatedNewDeleteTask) {
            if (i10 == NotificationCenter.updateMessageMedia) {
                if (this.h0.getId() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.J && !this.H) {
                        this.I = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.h1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.h0 == null || this.n == null || ((Long) objArr[0]).longValue() != this.v) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            int keyAt = sparseArray.keyAt(i12);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (this.h0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                    this.h0.messageOwner.destroyTime = keyAt;
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
        cv0 cv0Var;
        c51 c51Var;
        Runnable runnable;
        Runnable runnable2;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        if (this.b == null || !this.j0) {
            return false;
        }
        if (this.m0 != 0 && Math.abs(this.n0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable3 = this.o0;
            if (runnable3 != null) {
                runnable3.run();
                this.o0 = null;
            }
            this.m0 = 0;
        }
        if (this.m0 != 0) {
            return false;
        }
        if (this.q1 && z11) {
            return false;
        }
        Activity activity = this.b;
        if (activity != null) {
            AndroidUtilities.setLightNavigationBar(activity, this.o1);
            AndroidUtilities.setNavigationBarColor(this.b, this.n1);
            Activity activity2 = this.b;
            if (activity2 instanceof LaunchActivity) {
                ((LaunchActivity) activity2).y(this.n1);
            } else {
                AndroidUtilities.setNavigationBarColor(activity2, this.n1);
            }
        }
        kb0 kb0Var = this.l1;
        if (kb0Var != null) {
            kb0Var.destroy();
            this.l1 = null;
        }
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.k0 = false;
        this.L = System.currentTimeMillis();
        av0 av0Var = this.N;
        if (av0Var != null) {
            MessageObject messageObject = this.h0;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                cv0Var = av0Var.E(messageObject, null, 0, true, false);
                c51Var = this.y;
                if (c51Var != null) {
                    c51Var.B();
                }
                PhotoBackgroundDrawable photoBackgroundDrawable = this.l0;
                int i10 = 1;
                if (z10) {
                    k(false, true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<ah.w, Float>) View.SCALE_X, 0.9f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<ah.w, Float>) View.SCALE_Y, 0.9f);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.t6.d, 0);
                    org.telegram.ui.Components.z7 z7Var = this.F;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z7Var, (Property<org.telegram.ui.Components.z7, Float>) property, 0.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.a0, (Property<au0, Float>) property, 0.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                    e51 e51Var = this.U;
                    animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(e51Var, e51Var.n, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<e51, Float>) property, 0.0f));
                    this.m0 = 2;
                    this.o0 = new w41(this, cv0Var, i10);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new b51(this, 2));
                    this.n0 = System.currentTimeMillis();
                    runnable = null;
                    this.e.setLayerType(2, null);
                    animatorSet.start();
                } else {
                    this.m0 = 3;
                    this.e.invalidate();
                    this.K0 = new AnimatorSet();
                    if (cv0Var == null || cv0Var.a.getThumbBitmap() == null || z11 || this.p1 != null) {
                        c10 = 7;
                        c11 = 6;
                        c12 = 5;
                        c13 = 4;
                        c14 = 3;
                        int i11 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                        if (this.x0 < 0.0f) {
                            i11 = -i11;
                        }
                        this.A0 = i11;
                    } else {
                        cv0Var.a.setVisible(false, true);
                        RectF drawRegion = cv0Var.a.getDrawRegion();
                        c10 = 7;
                        float f7 = drawRegion.right - drawRegion.left;
                        c11 = 6;
                        float f10 = drawRegion.bottom - drawRegion.top;
                        Point point = AndroidUtilities.displaySize;
                        c12 = 5;
                        c13 = 4;
                        c14 = 3;
                        this.B0 = Math.max(f7 / point.x, f10 / (point.y + AndroidUtilities.statusBarHeight));
                        float f11 = cv0Var.b;
                        float f12 = drawRegion.left;
                        this.z0 = ((f7 / 2.0f) + (f11 + f12)) - (r7 / 2);
                        this.A0 = ((f10 / 2.0f) + (cv0Var.c + drawRegion.top)) - (r6 / 2);
                        this.G0 = Math.abs(f12 - cv0Var.a.getImageX());
                        int abs = (int) Math.abs(drawRegion.top - cv0Var.a.getImageY());
                        cv0Var.d.getLocationInWindow(new int[2]);
                        float f13 = (r7[1] - (cv0Var.c + drawRegion.top)) + cv0Var.j;
                        this.C0 = f13;
                        float f14 = abs;
                        this.C0 = Math.max(0.0f, Math.max(f13, f14));
                        float height = (((cv0Var.c + drawRegion.top) + ((int) f10)) - (cv0Var.d.getHeight() + r7[1])) + cv0Var.i;
                        this.D0 = height;
                        this.D0 = Math.max(0.0f, Math.max(height, f14));
                        this.E0 = 0.0f;
                        this.E0 = Math.max(0.0f, Math.max(0.0f, f14));
                        this.F0 = 0.0f;
                        this.F0 = Math.max(0.0f, Math.max(0.0f, f14));
                        this.J0 = System.currentTimeMillis();
                        this.e1 = true;
                    }
                    this.I0 = false;
                    k(false, true);
                    boolean z12 = this.J;
                    t0 t0Var = this.v1;
                    if (z12) {
                        this.d0 = false;
                        this.c0 = false;
                        AnimatorSet animatorSet2 = this.K0;
                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.t6.d, 0);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, t0Var, 0.0f, 1.0f);
                        org.telegram.ui.Components.z7 z7Var2 = this.F;
                        Property property2 = View.ALPHA;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(z7Var2, (Property<org.telegram.ui.Components.z7, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.a0, (Property<au0, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                        e51 e51Var2 = this.U;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(e51Var2, e51Var2.n, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.U, (Property<e51, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<di.f4, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this, this.u1, 0.0f);
                        Animator[] animatorArr = new Animator[9];
                        animatorArr[0] = ofInt2;
                        animatorArr[1] = ofFloat6;
                        animatorArr[2] = ofFloat7;
                        animatorArr[c14] = ofFloat8;
                        animatorArr[c13] = ofFloat9;
                        animatorArr[c12] = ofFloat10;
                        animatorArr[c11] = ofFloat11;
                        animatorArr[c10] = ofFloat12;
                        animatorArr[8] = ofFloat13;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        ImageReceiver imageReceiver = this.h;
                        imageReceiver.setManualAlphaAnimator(true);
                        AnimatorSet animatorSet3 = this.K0;
                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.t6.d, 0);
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, t0Var, 0.0f, 1.0f);
                        org.telegram.ui.Components.z7 z7Var3 = this.F;
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(z7Var3, (Property<org.telegram.ui.Components.z7, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.a0, (Property<au0, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                        e51 e51Var3 = this.U;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(e51Var3, e51Var3.n, 0.0f);
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.U, (Property<e51, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<di.f4, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(imageReceiver, org.telegram.ui.Components.t6.c, 0.0f);
                        Animator[] animatorArr2 = new Animator[9];
                        animatorArr2[0] = ofInt3;
                        animatorArr2[1] = ofFloat14;
                        animatorArr2[2] = ofFloat15;
                        animatorArr2[c14] = ofFloat16;
                        animatorArr2[c13] = ofFloat17;
                        animatorArr2[c12] = ofFloat18;
                        animatorArr2[c11] = ofFloat19;
                        animatorArr2[c10] = ofFloat20;
                        animatorArr2[8] = ofFloat21;
                        animatorSet3.playTogether(animatorArr2);
                    }
                    this.o0 = new w41(this, cv0Var, 0);
                    this.K0.setInterpolator(new DecelerateInterpolator());
                    this.K0.setDuration(250L);
                    this.K0.addListener(new org.telegram.ui.Components.pk0(14, this, cv0Var));
                    this.n0 = System.currentTimeMillis();
                    this.e.setLayerType(2, null);
                    this.K0.start();
                    runnable = null;
                }
                runnable2 = this.p1;
                if (runnable2 != null) {
                    runnable2.run();
                    this.p1 = runnable;
                }
                return true;
            }
        }
        cv0Var = null;
        c51Var = this.y;
        if (c51Var != null) {
        }
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.l0;
        int i102 = 1;
        if (z10) {
        }
        runnable2 = this.p1;
        if (runnable2 != null) {
        }
        return true;
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.e0;
    }

    public final void h(File file) {
        if (this.b == null) {
            return;
        }
        i();
        if (this.x == null) {
            l4 l4Var = new l4(this.b);
            this.w = l4Var;
            l4Var.setVisibility(0);
            this.e.addView(this.w, 0, w7.x5.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.x = textureView;
            textureView.setOpaque(false);
            this.w.addView(this.x, w7.x5.e(-1, -1, 17));
        }
        this.c0 = false;
        this.d0 = false;
        this.x.setAlpha(1.0f);
        if (this.y == null) {
            c51 c51Var = new c51(this);
            this.y = c51Var;
            c51Var.V(this.x);
            this.y.J = new n7.z0(this, file, false, 9);
        }
        this.y.D(Uri.fromFile(file), "other");
        this.y.P(true);
        this.W.a(true, true);
    }

    public final void i() {
        c51 c51Var = this.y;
        if (c51Var != null) {
            this.b0 = 0;
            c51Var.H();
            this.y = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        l4 l4Var = this.w;
        if (l4Var != null) {
            this.e.removeView(l4Var);
            this.w = null;
        }
        if (this.x != null) {
            this.x = null;
        }
        this.E = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z10) {
        boolean z11;
        CharSequence cloneSpans = org.telegram.ui.Components.z5.cloneSpans(charSequence, 3);
        if (this.a0 == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.X = frameLayout;
            this.Z.setContainer(frameLayout);
            au0 au0Var = new au0(this, this.e.getContext(), this.Z, this.X, 1);
            this.a0 = au0Var;
            this.Z.setScrollView(au0Var);
            this.X.setClipChildren(false);
            this.a0.addView(this.X, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.a0, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.Y.o(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.Z.getParent() != this.X) {
            this.Z.setMeasureAllChildren(true);
            this.X.addView(this.Z, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Z.getCurrentView().getText());
        qu0 qu0Var = this.Z;
        TextView nextView = z10 ? qu0Var.getNextView() : qu0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.Z.getCurrentView().setSingleLine(false);
            this.Z.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.Z.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.Z.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.Z.getCurrentView().setEllipsize(null);
            this.Z.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        au0 au0Var2 = this.a0;
        au0Var2.l0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(au0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new z41(this, isEmpty2, isEmpty, 1)).addTransition(new z41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.a0.l0 = true;
                duration.addTransition(new org.telegram.ui.Components.em0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.Z);
            }
            TransitionManager.beginDelayedTransition(this.a0, duration);
            z11 = true;
        } else {
            this.Z.getCurrentView().setText((CharSequence) null);
            au0 au0Var3 = this.a0;
            if (au0Var3 != null) {
                au0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (isEmpty) {
            this.Z.a(null, z10, false);
            this.Z.getCurrentView().setTextColor(-1);
            qu0 qu0Var2 = this.Z;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            qu0Var2.b(4, z12);
            this.Z.setTag(null);
        } else {
            org.telegram.ui.ActionBar.j6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.u31.B())) {
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
            this.Z.setTag(cloneSpans);
            try {
                this.Z.a(cloneSpans, z10, false);
                au0 au0Var4 = this.a0;
                if (au0Var4 != null) {
                    au0Var4.H(au0Var4.getWidth(), au0Var4.getHeight());
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.Z.setVisibility(this.k0 ? 0 : 4);
        }
        if (this.Z.getCurrentView() instanceof pu0) {
            ((pu0) this.Z.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z10, boolean z11) {
        boolean z12 = this.J && z10;
        if (this.m1 == z12 && z11) {
            return;
        }
        this.m1 = z12;
        this.V.animate().cancel();
        if (z11) {
            this.V.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.h).start();
            return;
        }
        this.V.setScaleX(z12 ? 1.0f : 0.6f);
        this.V.setScaleY(z12 ? 1.0f : 0.6f);
        this.V.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void l() {
        this.r.p(true);
        String string = LocaleController.getString(this.J ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        di.f4 f4Var = this.r;
        f4Var.h = di.f4.a(string, f4Var.getTextPaint());
        this.r.s(string);
        this.r.k(12.0f, 7.0f, 11.0f, 7.0f);
        di.f4 f4Var2 = this.r;
        f4Var2.getClass();
        f4Var2.e0 = AndroidUtilities.dp(2);
        di.f4 f4Var3 = this.r;
        f4Var3.getClass();
        f4Var3.d0 = 0.0f;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        xi0Var.start();
        f4Var3.j(xi0Var);
        this.r.u();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        w41 w41Var = this.r1;
        AndroidUtilities.cancelRunOnUIThread(w41Var);
        if (z10 && this.J) {
            AndroidUtilities.runOnUIThread(w41Var, 3000L);
        }
        if (z10) {
            this.F.setVisibility(0);
        }
        this.F.setEnabled(z10);
        this.k0 = z10;
        k(z10, z11);
        if (!z11) {
            this.F.setAlpha(z10 ? 1.0f : 0.0f);
            this.a0.setAlpha(z10 ? 1.0f : 0.0f);
            this.T.setAlpha(z10 ? 1.0f : 0.0f);
            this.f.setAlpha(z10 ? 1.0f : 0.0f);
            if (z10) {
                return;
            }
            this.F.setVisibility(8);
            this.a0.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.z7 z7Var = this.F;
        Property property = View.ALPHA;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(z7Var, (Property<org.telegram.ui.Components.z7, Float>) property, z10 ? 1.0f : 0.0f));
        e51 e51Var = this.U;
        arrayList.add(ObjectAnimator.ofFloat(e51Var, e51Var.n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.a0, (Property<au0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.T, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.G = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.G.addListener(new b51(this, i10));
        }
        this.G.setDuration(200L);
        this.G.start();
    }

    public final void n(float f7) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f7) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f7) - this.e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.V0 = -imageWidth;
            this.W0 = imageWidth;
        } else {
            this.W0 = 0.0f;
            this.V0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.X0 = -imageHeight;
            this.Y0 = imageHeight;
        } else {
            this.Y0 = 0.0f;
            this.X0 = 0.0f;
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
        float f7 = this.y0;
        if ((f7 == 1.0f && (this.x0 != 0.0f || this.w0 != 0.0f)) || this.J0 != 0 || this.m0 != 0) {
            return false;
        }
        if (f7 == 1.0f) {
            float c10 = org.telegram.messenger.wl.c(3.0f, this.y0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.w0, motionEvent.getX() - (this.e.getWidth() / 2));
            float c11 = org.telegram.messenger.wl.c(3.0f, this.y0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.x0, motionEvent.getY() - (this.e.getHeight() / 2));
            n(3.0f);
            float f10 = this.V0;
            if (c10 >= f10) {
                f10 = this.W0;
            }
            c10 = f10;
            float f11 = this.X0;
            if (c11 >= f11) {
                f11 = this.Y0;
            }
            c11 = f11;
            c(3.0f, c10, c11, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.b1 = true;
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
        if (this.y0 == 1.0f) {
            return false;
        }
        this.g1.a();
        this.g1.c(Math.round(this.w0), Math.round(this.x0), Math.round(f7), Math.round(f10), (int) this.V0, (int) this.W0, (int) this.X0, (int) this.Y0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f1) {
            return false;
        }
        if (this.y == null || !this.k0 || motionEvent.getX() < this.V.getX() || motionEvent.getY() < this.V.getY() || motionEvent.getX() > this.V.getX() + this.V.getMeasuredWidth() || motionEvent.getX() > this.V.getX() + this.V.getMeasuredWidth()) {
            m(!this.k0, true);
            return true;
        }
        this.y.P(!r5.d.u());
        if (this.y.d.u()) {
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

    public void setAnimationValue(float f7) {
        this.animationValue = f7;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f7) {
        this.e0 = f7;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
