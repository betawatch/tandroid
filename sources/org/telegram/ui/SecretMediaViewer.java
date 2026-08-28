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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer t1;
    public boolean A;
    public float A0;
    public org.telegram.ui.Components.r7 B;
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
    public zt0 J;
    public float J0;
    public int K;
    public float K0;
    public int L;
    public float L0;
    public org.telegram.ui.Components.m61 M;
    public float M0;
    public yi0 N;
    public float N0;
    public org.telegram.ui.ActionBar.h5 O;
    public float O0;
    public View P;
    public float P0;
    public x31 Q;
    public float Q0;
    public ImageView R;
    public float R0;
    public org.telegram.ui.Components.qf0 S;
    public float S0;
    public FrameLayout T;
    public float T0;
    public tr0 U;
    public float U0;
    public pt0 V;
    public boolean V0;
    public zs0 W;
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
    public org.telegram.ui.Components.yl0 c1;
    public m0 d;
    public MessageObject d0;
    public boolean d1;
    public fh.v e;
    public ImageReceiver.BitmapHolder e0;
    public final p31 e1;
    public View f;
    public boolean f0;
    public final int[] f1;
    public final int[] g1;
    public ff.t0 h1;
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
    public w31 n;
    public float n0;
    public final p31 n1;
    public float o0;
    public float[] o1;
    public float p0;
    public final Path p1;
    public float q0;
    public final v0 q1;
    public kh.x3 r;
    public float r0;
    public final v0 r1;
    public boolean s;
    public float s0;
    public boolean s1;
    public float t0;
    public float u0;
    public long v;
    public float v0;
    public c5.c w;
    public float w0;
    public TextureView x;
    public float x0;
    public v31 y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean g0 = true;
    public final PhotoBackgroundDrawable h0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public n21 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            n21 n21Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (n21Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    n21Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i9) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            ff.t0 t0Var = secretMediaViewer.h1;
            if (t0Var != null) {
                t0Var.a(secretMediaViewer.f0 && i9 == 255);
            }
            super.setAlpha(i9);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i9, int i10, int i11, int i12) {
            super.setBounds(i9, i10, i11, i12 + AndroidUtilities.navigationBarHeight);
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
        this.e1 = new p31(this, 2);
        this.f1 = new int[2];
        this.g1 = new int[2];
        this.n1 = new p31(this, 3);
        this.p1 = new Path();
        this.q1 = new v0("videoCrossfadeAlpha", 4);
        this.r1 = new v0("animationValue", 5);
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
        int bitmapWidth;
        int bitmapHeight;
        int i9;
        float f24;
        float f25;
        int i10;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.h0;
        Path path = secretMediaViewer.p1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.f0) {
            if (secretMediaViewer.G0 != null) {
                org.telegram.ui.Components.yl0 yl0Var = secretMediaViewer.c1;
                if (!yl0Var.q) {
                    yl0Var.a();
                }
                float f26 = secretMediaViewer.u0;
                float f27 = secretMediaViewer.x0;
                float f28 = secretMediaViewer.animationValue;
                f12 = ((f27 - f26) * f28) + f26;
                float f29 = secretMediaViewer.t0;
                float z12 = e2.c.z(secretMediaViewer.w0, f29, f28, f29);
                float f30 = secretMediaViewer.s0;
                f14 = e2.c.z(secretMediaViewer.v0, f30, f28, f30);
                f10 = -1.0f;
                float f31 = secretMediaViewer.n0;
                f11 = 1.0f;
                f15 = e2.c.z(secretMediaViewer.y0, f31, f28, f31);
                float f32 = secretMediaViewer.o0;
                f16 = e2.c.z(secretMediaViewer.z0, f32, f28, f32);
                float f33 = secretMediaViewer.p0;
                f17 = e2.c.z(secretMediaViewer.A0, f33, f28, f33);
                float f34 = secretMediaViewer.q0;
                float z13 = e2.c.z(secretMediaViewer.B0, f34, f28, f34);
                float f35 = secretMediaViewer.r0;
                float z14 = e2.c.z(secretMediaViewer.C0, f35, f28, f35);
                float f36 = (f27 == 1.0f && f26 == 1.0f && f30 == 0.0f) ? z12 : -1.0f;
                secretMediaViewer.e.invalidate();
                f19 = z14;
                f20 = z12;
                f13 = f36;
                f18 = z13;
            } else {
                f10 = -1.0f;
                f11 = 1.0f;
                if (secretMediaViewer.F0 != 0) {
                    secretMediaViewer.s0 = secretMediaViewer.v0;
                    secretMediaViewer.t0 = secretMediaViewer.w0;
                    secretMediaViewer.o0 = secretMediaViewer.z0;
                    secretMediaViewer.n0 = secretMediaViewer.y0;
                    secretMediaViewer.p0 = secretMediaViewer.A0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    float f37 = secretMediaViewer.x0;
                    secretMediaViewer.u0 = f37;
                    secretMediaViewer.F0 = 0L;
                    secretMediaViewer.n(f37);
                    secretMediaViewer.a1 = false;
                }
                org.telegram.ui.Components.yl0 yl0Var2 = secretMediaViewer.c1;
                if (!yl0Var2.q && yl0Var2.b()) {
                    org.telegram.ui.Components.yl0 yl0Var3 = secretMediaViewer.c1;
                    float f38 = yl0Var3.b;
                    if (f38 < secretMediaViewer.S0 && f38 > secretMediaViewer.R0) {
                        secretMediaViewer.s0 = yl0Var3.j;
                    }
                    float f39 = yl0Var3.c;
                    if (f39 < secretMediaViewer.U0 && f39 > secretMediaViewer.T0) {
                        secretMediaViewer.t0 = yl0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f12 = secretMediaViewer.u0;
                f13 = secretMediaViewer.t0;
                f14 = secretMediaViewer.s0;
                f15 = secretMediaViewer.n0;
                f16 = secretMediaViewer.o0;
                f17 = secretMediaViewer.p0;
                f18 = secretMediaViewer.q0;
                f19 = secretMediaViewer.r0;
                if (secretMediaViewer.W0) {
                    f20 = f13;
                    f13 = -1.0f;
                } else {
                    f20 = f13;
                }
            }
            if (secretMediaViewer.D0 != null) {
                if (secretMediaViewer.o1 == null) {
                    secretMediaViewer.o1 = new float[8];
                }
                float f40 = secretMediaViewer.E0 ? secretMediaViewer.animationValue : f11 - secretMediaViewer.animationValue;
                f21 = f15;
                int i11 = 0;
                z10 = true;
                for (int i12 = 8; i11 < i12; i12 = 8) {
                    float[] fArr = secretMediaViewer.o1;
                    int i13 = i11;
                    float lerp = AndroidUtilities.lerp(secretMediaViewer.D0[i11 / 2] * 2.0f, 0.0f, f40);
                    fArr[i11 + 1] = lerp;
                    fArr[i13] = lerp;
                    if (secretMediaViewer.o1[i13] > 0.0f) {
                        z10 = false;
                    }
                    i11 = i13 + 2;
                }
            } else {
                f21 = f15;
                z10 = true;
            }
            if (secretMediaViewer.i0 != 3) {
                if (secretMediaViewer.u0 != f11 || f13 == f10 || secretMediaViewer.a1) {
                    photoBackgroundDrawable.setAlpha(255);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f11 - (Math.min(Math.abs(f13), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.a1) {
                    float f41 = secretMediaViewer.S0;
                    if (f14 > f41) {
                        float min = Math.min(1.0f, (f14 - f41) / canvas.getWidth());
                        f23 = 0.3f * min;
                        f22 = 1.0f - min;
                        f14 = secretMediaViewer.S0;
                        c5.c cVar = secretMediaViewer.w;
                        z11 = cVar == null && cVar.getVisibility() == 0;
                        canvas.save();
                        float f42 = f12 - f23;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
                        canvas.scale(f42, f42);
                        bitmapWidth = imageReceiver.getBitmapWidth();
                        bitmapHeight = imageReceiver.getBitmapHeight();
                        i9 = secretMediaViewer.K;
                        if (i9 != 0 && (i10 = secretMediaViewer.L) != 0) {
                            bitmapWidth = i9;
                            bitmapHeight = i10;
                        }
                        if (z11 && secretMediaViewer.Y && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.x.getMeasuredWidth() / secretMediaViewer.x.getMeasuredHeight())) > 0.01f) {
                            bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                            bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
                        }
                        float f43 = bitmapHeight;
                        float f44 = bitmapWidth;
                        float min2 = Math.min(secretMediaViewer.e.getHeight() / f43, secretMediaViewer.e.getWidth() / f44);
                        int i14 = (int) (f44 * min2);
                        int i15 = (int) (f43 * min2);
                        f24 = (-i14) / 2;
                        float f45 = f19 / f42;
                        float f46 = f24 + f45;
                        f25 = (-i15) / 2;
                        float f47 = f17;
                        float f48 = (i14 / 2) - f45;
                        float f49 = i15 / 2;
                        canvas.clipRect(f46, (f21 / f42) + f25, f48, f49 - (f16 / f42));
                        if (!z10) {
                            path.reset();
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(f46, (f47 / f42) + f25, f48, f49 - (f18 / f42));
                            path.addRoundRect(rectF, secretMediaViewer.o1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z11 || !secretMediaViewer.Y || !secretMediaViewer.Z || secretMediaViewer.a0 != 1.0f) {
                            imageReceiver.setAlpha(f22);
                            imageReceiver.setImageCoords(f24, f25, i14, i15);
                            imageReceiver.draw(canvas);
                        }
                        if (z11) {
                            if (!secretMediaViewer.Z && secretMediaViewer.Y) {
                                secretMediaViewer.Z = true;
                                secretMediaViewer.a0 = 0.0f;
                                secretMediaViewer.b0 = System.currentTimeMillis();
                            }
                            canvas.translate(f24, f25);
                            secretMediaViewer.x.setAlpha(f22 * secretMediaViewer.a0);
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
            f22 = 1.0f;
            f23 = 0.0f;
            c5.c cVar2 = secretMediaViewer.w;
            if (cVar2 == null) {
            }
            canvas.save();
            float f422 = f12 - f23;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
            canvas.scale(f422, f422);
            bitmapWidth = imageReceiver.getBitmapWidth();
            bitmapHeight = imageReceiver.getBitmapHeight();
            i9 = secretMediaViewer.K;
            if (i9 != 0) {
                bitmapWidth = i9;
                bitmapHeight = i10;
            }
            if (z11) {
                bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
            }
            float f432 = bitmapHeight;
            float f442 = bitmapWidth;
            float min22 = Math.min(secretMediaViewer.e.getHeight() / f432, secretMediaViewer.e.getWidth() / f442);
            int i142 = (int) (f442 * min22);
            int i152 = (int) (f432 * min22);
            f24 = (-i142) / 2;
            float f452 = f19 / f422;
            float f462 = f24 + f452;
            f25 = (-i152) / 2;
            float f472 = f17;
            float f482 = (i142 / 2) - f452;
            float f492 = i152 / 2;
            canvas.clipRect(f462, (f21 / f422) + f25, f482, f492 - (f16 / f422));
            if (!z10) {
            }
            if (z11) {
            }
            imageReceiver.setAlpha(f22);
            imageReceiver.setImageCoords(f24, f25, i142, i152);
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return t1 != null;
    }

    public final void c(float f10, float f11, float f12, boolean z10) {
        if (this.u0 == f10 && this.s0 == f11 && this.t0 == f12) {
            return;
        }
        this.a1 = z10;
        this.x0 = f10;
        this.v0 = f11;
        this.w0 = f12;
        this.F0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.G0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.G0.setInterpolator(this.I0);
        this.G0.setDuration(MediaDataController.MAX_LINKS_COUNT);
        this.G0.addListener(new u31(this, 3));
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
        float f10 = this.s0;
        float f11 = this.t0;
        n(this.u0);
        float f12 = this.s0;
        float f13 = this.R0;
        if (f12 >= f13) {
            f13 = this.S0;
        }
        f10 = f13;
        float f14 = this.t0;
        float f15 = this.T0;
        if (f14 >= f15) {
            f15 = this.U0;
        }
        f11 = f15;
        c(this.u0, f10, f11, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.messagesDeleted) {
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
        if (i9 != NotificationCenter.didCreatedNewDeleteTask) {
            if (i9 == NotificationCenter.updateMessageMedia) {
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
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int keyAt = sparseArray.keyAt(i11);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (this.d0.getId() == ((Integer) arrayList.get(i12)).intValue()) {
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
        bu0 bu0Var;
        v31 v31Var;
        Runnable runnable;
        Runnable runnable2;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
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
        ff.t0 t0Var = this.h1;
        if (t0Var != null) {
            t0Var.destroy();
            this.h1 = null;
        }
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.g0 = false;
        this.H = System.currentTimeMillis();
        zt0 zt0Var = this.J;
        if (zt0Var != null) {
            MessageObject messageObject = this.d0;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                bu0Var = zt0Var.E(messageObject, null, 0, true, false);
                v31Var = this.y;
                if (v31Var != null) {
                    v31Var.C();
                }
                PhotoBackgroundDrawable photoBackgroundDrawable = this.h0;
                int i9 = 1;
                if (z10) {
                    k(false, true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<fh.v, Float>) View.SCALE_X, 0.9f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<fh.v, Float>) View.SCALE_Y, 0.9f);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                    org.telegram.ui.Components.r7 r7Var = this.B;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7Var, (Property<org.telegram.ui.Components.r7, Float>) property, 0.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.W, (Property<zs0, Float>) property, 0.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                    x31 x31Var = this.Q;
                    animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(x31Var, x31Var.n, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<x31, Float>) property, 0.0f));
                    this.i0 = 2;
                    this.k0 = new p31(this, bu0Var, i9);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new u31(this, 2));
                    this.j0 = System.currentTimeMillis();
                    runnable = null;
                    this.e.setLayerType(2, null);
                    animatorSet.start();
                } else {
                    this.i0 = 3;
                    this.e.invalidate();
                    this.G0 = new AnimatorSet();
                    if (bu0Var == null || bu0Var.a.getThumbBitmap() == null || z11 || this.l1 != null) {
                        c10 = 7;
                        c11 = 6;
                        c12 = 5;
                        c13 = 4;
                        c14 = 3;
                        int i10 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                        if (this.t0 < 0.0f) {
                            i10 = -i10;
                        }
                        this.w0 = i10;
                    } else {
                        bu0Var.a.setVisible(false, true);
                        RectF drawRegion = bu0Var.a.getDrawRegion();
                        c10 = 7;
                        float f10 = drawRegion.right - drawRegion.left;
                        c11 = 6;
                        float f11 = drawRegion.bottom - drawRegion.top;
                        Point point = AndroidUtilities.displaySize;
                        c12 = 5;
                        c13 = 4;
                        c14 = 3;
                        this.x0 = Math.max(f10 / point.x, f11 / (point.y + AndroidUtilities.statusBarHeight));
                        float f12 = bu0Var.b;
                        float f13 = drawRegion.left;
                        this.v0 = ((f10 / 2.0f) + (f12 + f13)) - (r7 / 2);
                        this.w0 = ((f11 / 2.0f) + (bu0Var.c + drawRegion.top)) - (r6 / 2);
                        this.C0 = Math.abs(f13 - bu0Var.a.getImageX());
                        int abs = (int) Math.abs(drawRegion.top - bu0Var.a.getImageY());
                        bu0Var.d.getLocationInWindow(new int[2]);
                        float f14 = (r7[1] - (bu0Var.c + drawRegion.top)) + bu0Var.j;
                        this.y0 = f14;
                        float f15 = abs;
                        this.y0 = Math.max(0.0f, Math.max(f14, f15));
                        float height = (((bu0Var.c + drawRegion.top) + ((int) f11)) - (bu0Var.d.getHeight() + r7[1])) + bu0Var.i;
                        this.z0 = height;
                        this.z0 = Math.max(0.0f, Math.max(height, f15));
                        this.A0 = 0.0f;
                        this.A0 = Math.max(0.0f, Math.max(0.0f, f15));
                        this.B0 = 0.0f;
                        this.B0 = Math.max(0.0f, Math.max(0.0f, f15));
                        this.F0 = System.currentTimeMillis();
                        this.a1 = true;
                    }
                    this.E0 = false;
                    k(false, true);
                    boolean z12 = this.F;
                    v0 v0Var = this.r1;
                    if (z12) {
                        this.Z = false;
                        this.Y = false;
                        AnimatorSet animatorSet2 = this.G0;
                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, v0Var, 0.0f, 1.0f);
                        org.telegram.ui.Components.r7 r7Var2 = this.B;
                        Property property2 = View.ALPHA;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(r7Var2, (Property<org.telegram.ui.Components.r7, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.W, (Property<zs0, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                        x31 x31Var2 = this.Q;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(x31Var2, x31Var2.n, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.Q, (Property<x31, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<kh.x3, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this, this.q1, 0.0f);
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
                        AnimatorSet animatorSet3 = this.G0;
                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.m6.d, 0);
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, v0Var, 0.0f, 1.0f);
                        org.telegram.ui.Components.r7 r7Var3 = this.B;
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(r7Var3, (Property<org.telegram.ui.Components.r7, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.W, (Property<zs0, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                        x31 x31Var3 = this.Q;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(x31Var3, x31Var3.n, 0.0f);
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.Q, (Property<x31, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<kh.x3, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(imageReceiver, org.telegram.ui.Components.m6.c, 0.0f);
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
                    this.k0 = new p31(this, bu0Var, 0);
                    this.G0.setInterpolator(new DecelerateInterpolator());
                    this.G0.setDuration(250L);
                    this.G0.addListener(new org.telegram.ui.Components.su0(12, this, bu0Var));
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
        bu0Var = null;
        v31Var = this.y;
        if (v31Var != null) {
        }
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.h0;
        int i92 = 1;
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
            c5.c cVar = new c5.c(this.b);
            this.w = cVar;
            cVar.setVisibility(0);
            this.e.addView(this.w, 0, g7.e6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.x = textureView;
            textureView.setOpaque(false);
            this.w.addView(this.x, g7.e6.e(-1, -1, 17));
        }
        this.Y = false;
        this.Z = false;
        this.x.setAlpha(1.0f);
        if (this.y == null) {
            v31 v31Var = new v31(this);
            this.y = v31Var;
            v31Var.W(this.x);
            this.y.F = new org.telegram.ui.Cells.e3(11, this, file);
        }
        this.y.E(Uri.fromFile(file), "other");
        this.y.Q(true);
        this.S.a(true, true);
    }

    public final void i() {
        v31 v31Var = this.y;
        if (v31Var != null) {
            this.X = 0;
            v31Var.I();
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
        c5.c cVar = this.w;
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
        CharSequence cloneSpans = org.telegram.ui.Components.t5.cloneSpans(charSequence, 3);
        if (this.W == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.T = frameLayout;
            this.V.setContainer(frameLayout);
            zs0 zs0Var = new zs0(this, this.e.getContext(), this.V, this.T, 1);
            this.W = zs0Var;
            this.V.setScrollView(zs0Var);
            this.T.setClipChildren(false);
            this.W.addView(this.T, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.W, g7.e6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.U.o(this.e.getContext()).bringToFront();
        }
        boolean z12 = true;
        if (this.V.getParent() != this.T) {
            this.V.setMeasureAllChildren(true);
            this.T.addView(this.V, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.V.getCurrentView().getText());
        pt0 pt0Var = this.V;
        TextView nextView = z10 ? pt0Var.getNextView() : pt0Var.getCurrentView();
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
        zs0 zs0Var2 = this.W;
        zs0Var2.h0 = false;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(zs0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new s31(this, isEmpty2, isEmpty, 1)).addTransition(new s31(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.W.h0 = true;
                duration.addTransition(new org.telegram.ui.Components.pl0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.V);
            }
            TransitionManager.beginDelayedTransition(this.W, duration);
            z11 = true;
        } else {
            this.V.getCurrentView().setText((CharSequence) null);
            zs0 zs0Var3 = this.W;
            if (zs0Var3 != null) {
                zs0Var3.scrollTo(0, 0);
            }
            z11 = false;
        }
        if (isEmpty) {
            this.V.a(null, z10, false);
            this.V.getCurrentView().setTextColor(-1);
            pt0 pt0Var2 = this.V;
            if (z11 && !isEmpty2) {
                z12 = false;
            }
            pt0Var2.b(4, z12);
            this.V.setTag(null);
        } else {
            org.telegram.ui.ActionBar.f6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.z21.A())) {
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
                zs0 zs0Var4 = this.W;
                if (zs0Var4 != null) {
                    zs0Var4.H(zs0Var4.getWidth(), zs0Var4.getHeight());
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.V.setVisibility(this.g0 ? 0 : 4);
        }
        if (this.V.getCurrentView() instanceof ot0) {
            ((ot0) this.V.getCurrentView()).setLoading(false);
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
            this.R.animate().scaleX(z12 ? 1.0f : 0.6f).scaleY(z12 ? 1.0f : 0.6f).alpha(z12 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            return;
        }
        this.R.setScaleX(z12 ? 1.0f : 0.6f);
        this.R.setScaleY(z12 ? 1.0f : 0.6f);
        this.R.setAlpha(z12 ? 1.0f : 0.0f);
    }

    public final void l() {
        this.r.q(true);
        String string = LocaleController.getString(this.F ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        kh.x3 x3Var = this.r;
        x3Var.h = kh.x3.a(string, x3Var.getTextPaint());
        this.r.t(string);
        this.r.l(12.0f, 7.0f, 11.0f, 7.0f);
        kh.x3 x3Var2 = this.r;
        x3Var2.getClass();
        x3Var2.a0 = AndroidUtilities.dp(2);
        kh.x3 x3Var3 = this.r;
        x3Var3.getClass();
        x3Var3.W = 0.0f;
        x3Var3.j(R.raw.fire_on);
        this.r.v();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z10, boolean z11) {
        p31 p31Var = this.n1;
        AndroidUtilities.cancelRunOnUIThread(p31Var);
        if (z10 && this.F) {
            AndroidUtilities.runOnUIThread(p31Var, 3000L);
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
        org.telegram.ui.Components.r7 r7Var = this.B;
        Property property = View.ALPHA;
        int i9 = 1;
        arrayList.add(ObjectAnimator.ofFloat(r7Var, (Property<org.telegram.ui.Components.r7, Float>) property, z10 ? 1.0f : 0.0f));
        x31 x31Var = this.Q;
        arrayList.add(ObjectAnimator.ofFloat(x31Var, x31Var.n, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.W, (Property<zs0, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.P, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.C = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z10) {
            this.C.addListener(new u31(this, i9));
        }
        this.C.setDuration(200L);
        this.C.start();
    }

    public final void n(float f10) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.e.getHeight())) / 2;
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
        float f10 = this.u0;
        if ((f10 == 1.0f && (this.t0 != 0.0f || this.s0 != 0.0f)) || this.F0 != 0 || this.i0 != 0) {
            return false;
        }
        if (f10 == 1.0f) {
            float c10 = org.telegram.messenger.ll.c(3.0f, this.u0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.s0, motionEvent.getX() - (this.e.getWidth() / 2));
            float c11 = org.telegram.messenger.ll.c(3.0f, this.u0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.t0, motionEvent.getY() - (this.e.getHeight() / 2));
            n(3.0f);
            float f11 = this.R0;
            if (c10 >= f11) {
                f11 = this.S0;
            }
            c10 = f11;
            float f12 = this.T0;
            if (c11 >= f12) {
                f12 = this.U0;
            }
            c11 = f12;
            c(3.0f, c10, c11, true);
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.u0 == 1.0f) {
            return false;
        }
        this.c1.a();
        this.c1.c(Math.round(this.s0), Math.round(this.t0), Math.round(f10), Math.round(f11), (int) this.R0, (int) this.S0, (int) this.T0, (int) this.U0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
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

    public void setAnimationValue(float f10) {
        this.animationValue = f10;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f10) {
        this.a0 = f10;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
