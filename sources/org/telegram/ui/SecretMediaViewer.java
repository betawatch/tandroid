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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer u1;
    public float A0;
    public boolean B;
    public float B0;
    public fg.k1 C;
    public float C0;
    public AnimatorSet D;
    public float D0;
    public boolean E;
    public int[] E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public long G0;
    public long H;
    public AnimatorSet H0;
    public long I;
    public GestureDetector I0;
    public boolean J;
    public final DecelerateInterpolator J0;
    public ou0 K;
    public float K0;
    public int L;
    public float L0;
    public int M;
    public float M0;
    public org.telegram.ui.Components.l71 N;
    public float N0;
    public nw0 O;
    public float O0;
    public org.telegram.ui.ActionBar.l5 P;
    public float P0;
    public View Q;
    public float Q0;
    public q41 R;
    public float R0;
    public ImageView S;
    public float S0;
    public org.telegram.ui.Components.og0 T;
    public float T0;
    public FrameLayout U;
    public float U0;
    public hs0 V;
    public float V0;
    public du0 W;
    public boolean W0;
    public nt0 X;
    public boolean X0;
    public int Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int a;
    public boolean a0;
    public boolean a1;
    private float animationValue;
    public Activity b;
    public float b0;
    public boolean b1;
    public WindowManager.LayoutParams c;
    public long c0;
    public boolean c1;
    public l0 d;
    public WindowInsets d0;
    public org.telegram.ui.Components.vm0 d1;
    public ag.l e;
    public MessageObject e0;
    public boolean e1;
    public View f;
    public ImageReceiver.BitmapHolder f0;
    public final i41 f1;
    public boolean g0;
    public final int[] g1;
    public final int[] h1;
    public lf.s0 i1;
    public int j0;
    public boolean j1;
    public long k0;
    public int k1;
    public Runnable l0;
    public boolean l1;
    public boolean m0;
    public Runnable m1;
    public p41 n;
    public float n0;
    public boolean n1;
    public float o0;
    public final i41 o1;
    public float p0;
    public float[] p1;
    public float q0;
    public final Path q1;
    public qh.e3 r;
    public float r0;
    public final u0 r1;
    public boolean s;
    public float s0;
    public final u0 s1;
    public float t0;
    public boolean t1;
    public float u0;
    public long v;
    public float v0;
    public o4 w;
    public float w0;
    public TextureView x;
    public float x0;
    public o41 y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver();
    public boolean h0 = true;
    public final PhotoBackgroundDrawable i0 = new PhotoBackgroundDrawable();

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public h21 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            h21 h21Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (h21Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    h21Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            lf.s0 s0Var = secretMediaViewer.i1;
            if (s0Var != null) {
                s0Var.a(secretMediaViewer.g0 && i10 == 255);
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
        this.v0 = 1.0f;
        this.J0 = new DecelerateInterpolator(1.5f);
        this.L0 = 1.0f;
        this.a1 = true;
        this.f1 = new i41(this, 2);
        this.g1 = new int[2];
        this.h1 = new int[2];
        this.o1 = new i41(this, 3);
        this.q1 = new Path();
        this.r1 = new u0("videoCrossfadeAlpha", 4);
        this.s1 = new u0("animationValue", 5);
    }

    public static /* synthetic */ WindowInsets a(SecretMediaViewer secretMediaViewer, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = secretMediaViewer.d0;
        secretMediaViewer.d0 = windowInsets;
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
        boolean z4;
        float f22;
        float f23;
        boolean z10;
        int bitmapWidth;
        int bitmapHeight;
        int i10;
        float f24;
        float f25;
        int i11;
        PhotoBackgroundDrawable photoBackgroundDrawable = secretMediaViewer.i0;
        Path path = secretMediaViewer.q1;
        ImageReceiver imageReceiver = secretMediaViewer.h;
        if (secretMediaViewer.g0) {
            if (secretMediaViewer.H0 != null) {
                org.telegram.ui.Components.vm0 vm0Var = secretMediaViewer.d1;
                if (!vm0Var.q) {
                    vm0Var.a();
                }
                float f26 = secretMediaViewer.v0;
                float f27 = secretMediaViewer.y0;
                float f28 = secretMediaViewer.animationValue;
                f12 = ((f27 - f26) * f28) + f26;
                float f29 = secretMediaViewer.u0;
                float w10 = e2.c.w(secretMediaViewer.x0, f29, f28, f29);
                float f30 = secretMediaViewer.t0;
                f14 = e2.c.w(secretMediaViewer.w0, f30, f28, f30);
                f10 = -1.0f;
                float f31 = secretMediaViewer.o0;
                f11 = 1.0f;
                f15 = e2.c.w(secretMediaViewer.z0, f31, f28, f31);
                float f32 = secretMediaViewer.p0;
                f16 = e2.c.w(secretMediaViewer.A0, f32, f28, f32);
                float f33 = secretMediaViewer.q0;
                f17 = e2.c.w(secretMediaViewer.B0, f33, f28, f33);
                float f34 = secretMediaViewer.r0;
                float w11 = e2.c.w(secretMediaViewer.C0, f34, f28, f34);
                float f35 = secretMediaViewer.s0;
                float w12 = e2.c.w(secretMediaViewer.D0, f35, f28, f35);
                float f36 = (f27 == 1.0f && f26 == 1.0f && f30 == 0.0f) ? w10 : -1.0f;
                secretMediaViewer.e.invalidate();
                f19 = w12;
                f20 = w10;
                f13 = f36;
                f18 = w11;
            } else {
                f10 = -1.0f;
                f11 = 1.0f;
                if (secretMediaViewer.G0 != 0) {
                    secretMediaViewer.t0 = secretMediaViewer.w0;
                    secretMediaViewer.u0 = secretMediaViewer.x0;
                    secretMediaViewer.p0 = secretMediaViewer.A0;
                    secretMediaViewer.o0 = secretMediaViewer.z0;
                    secretMediaViewer.q0 = secretMediaViewer.B0;
                    secretMediaViewer.r0 = secretMediaViewer.C0;
                    secretMediaViewer.s0 = secretMediaViewer.D0;
                    float f37 = secretMediaViewer.y0;
                    secretMediaViewer.v0 = f37;
                    secretMediaViewer.G0 = 0L;
                    secretMediaViewer.n(f37);
                    secretMediaViewer.b1 = false;
                }
                org.telegram.ui.Components.vm0 vm0Var2 = secretMediaViewer.d1;
                if (!vm0Var2.q && vm0Var2.b()) {
                    org.telegram.ui.Components.vm0 vm0Var3 = secretMediaViewer.d1;
                    float f38 = vm0Var3.b;
                    if (f38 < secretMediaViewer.T0 && f38 > secretMediaViewer.S0) {
                        secretMediaViewer.t0 = vm0Var3.j;
                    }
                    float f39 = vm0Var3.c;
                    if (f39 < secretMediaViewer.V0 && f39 > secretMediaViewer.U0) {
                        secretMediaViewer.u0 = vm0Var3.k;
                    }
                    secretMediaViewer.e.invalidate();
                }
                f12 = secretMediaViewer.v0;
                f13 = secretMediaViewer.u0;
                f14 = secretMediaViewer.t0;
                f15 = secretMediaViewer.o0;
                f16 = secretMediaViewer.p0;
                f17 = secretMediaViewer.q0;
                f18 = secretMediaViewer.r0;
                f19 = secretMediaViewer.s0;
                if (secretMediaViewer.X0) {
                    f20 = f13;
                    f13 = -1.0f;
                } else {
                    f20 = f13;
                }
            }
            if (secretMediaViewer.E0 != null) {
                if (secretMediaViewer.p1 == null) {
                    secretMediaViewer.p1 = new float[8];
                }
                float f40 = secretMediaViewer.F0 ? secretMediaViewer.animationValue : f11 - secretMediaViewer.animationValue;
                f21 = f15;
                int i12 = 0;
                z4 = true;
                for (int i13 = 8; i12 < i13; i13 = 8) {
                    float[] fArr = secretMediaViewer.p1;
                    int i14 = i12;
                    float lerp = AndroidUtilities.lerp(secretMediaViewer.E0[i12 / 2] * 2.0f, 0.0f, f40);
                    fArr[i12 + 1] = lerp;
                    fArr[i14] = lerp;
                    if (secretMediaViewer.p1[i14] > 0.0f) {
                        z4 = false;
                    }
                    i12 = i14 + 2;
                }
            } else {
                f21 = f15;
                z4 = true;
            }
            if (secretMediaViewer.j0 != 3) {
                if (secretMediaViewer.v0 != f11 || f13 == f10 || secretMediaViewer.b1) {
                    photoBackgroundDrawable.setAlpha(255);
                } else {
                    float height = secretMediaViewer.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f11 - (Math.min(Math.abs(f13), height) / height)) * 255.0f));
                }
                if (!secretMediaViewer.b1) {
                    float f41 = secretMediaViewer.T0;
                    if (f14 > f41) {
                        float min = Math.min(1.0f, (f14 - f41) / canvas.getWidth());
                        f23 = 0.3f * min;
                        f22 = 1.0f - min;
                        f14 = secretMediaViewer.T0;
                        o4 o4Var = secretMediaViewer.w;
                        z10 = o4Var == null && o4Var.getVisibility() == 0;
                        canvas.save();
                        float f42 = f12 - f23;
                        canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
                        canvas.scale(f42, f42);
                        bitmapWidth = imageReceiver.getBitmapWidth();
                        bitmapHeight = imageReceiver.getBitmapHeight();
                        i10 = secretMediaViewer.L;
                        if (i10 != 0 && (i11 = secretMediaViewer.M) != 0) {
                            bitmapWidth = i10;
                            bitmapHeight = i11;
                        }
                        if (z10 && secretMediaViewer.Z && Math.abs((bitmapWidth / bitmapHeight) - (secretMediaViewer.x.getMeasuredWidth() / secretMediaViewer.x.getMeasuredHeight())) > 0.01f) {
                            bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                            bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
                        }
                        float f43 = bitmapHeight;
                        float f44 = bitmapWidth;
                        float min2 = Math.min(secretMediaViewer.e.getHeight() / f43, secretMediaViewer.e.getWidth() / f44);
                        int i15 = (int) (f44 * min2);
                        int i16 = (int) (f43 * min2);
                        f24 = (-i15) / 2;
                        float f45 = f19 / f42;
                        float f46 = f24 + f45;
                        f25 = (-i16) / 2;
                        float f47 = f17;
                        float f48 = (i15 / 2) - f45;
                        float f49 = i16 / 2;
                        canvas.clipRect(f46, (f21 / f42) + f25, f48, f49 - (f16 / f42));
                        if (!z4) {
                            path.reset();
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(f46, (f47 / f42) + f25, f48, f49 - (f18 / f42));
                            path.addRoundRect(rectF, secretMediaViewer.p1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z10 || !secretMediaViewer.Z || !secretMediaViewer.a0 || secretMediaViewer.b0 != 1.0f) {
                            imageReceiver.setAlpha(f22);
                            imageReceiver.setImageCoords(f24, f25, i15, i16);
                            imageReceiver.draw(canvas);
                        }
                        if (z10) {
                            if (!secretMediaViewer.a0 && secretMediaViewer.Z) {
                                secretMediaViewer.a0 = true;
                                secretMediaViewer.b0 = 0.0f;
                                secretMediaViewer.c0 = System.currentTimeMillis();
                            }
                            canvas.translate(f24, f25);
                            secretMediaViewer.x.setAlpha(f22 * secretMediaViewer.b0);
                            secretMediaViewer.w.draw(canvas);
                            if (secretMediaViewer.a0 && secretMediaViewer.b0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j10 = currentTimeMillis - secretMediaViewer.c0;
                                secretMediaViewer.c0 = currentTimeMillis;
                                secretMediaViewer.b0 = (j10 / 200.0f) + secretMediaViewer.b0;
                                secretMediaViewer.e.invalidate();
                                if (secretMediaViewer.b0 > 1.0f) {
                                    secretMediaViewer.b0 = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f22 = 1.0f;
            f23 = 0.0f;
            o4 o4Var2 = secretMediaViewer.w;
            if (o4Var2 == null) {
            }
            canvas.save();
            float f422 = f12 - f23;
            canvas.translate((secretMediaViewer.e.getWidth() / 2) + f14, (secretMediaViewer.e.getHeight() / 2) + f20);
            canvas.scale(f422, f422);
            bitmapWidth = imageReceiver.getBitmapWidth();
            bitmapHeight = imageReceiver.getBitmapHeight();
            i10 = secretMediaViewer.L;
            if (i10 != 0) {
                bitmapWidth = i10;
                bitmapHeight = i11;
            }
            if (z10) {
                bitmapWidth = secretMediaViewer.x.getMeasuredWidth();
                bitmapHeight = secretMediaViewer.x.getMeasuredHeight();
            }
            float f432 = bitmapHeight;
            float f442 = bitmapWidth;
            float min22 = Math.min(secretMediaViewer.e.getHeight() / f432, secretMediaViewer.e.getWidth() / f442);
            int i152 = (int) (f442 * min22);
            int i162 = (int) (f432 * min22);
            f24 = (-i152) / 2;
            float f452 = f19 / f422;
            float f462 = f24 + f452;
            f25 = (-i162) / 2;
            float f472 = f17;
            float f482 = (i152 / 2) - f452;
            float f492 = i162 / 2;
            canvas.clipRect(f462, (f21 / f422) + f25, f482, f492 - (f16 / f422));
            if (!z4) {
            }
            if (z10) {
            }
            imageReceiver.setAlpha(f22);
            imageReceiver.setImageCoords(f24, f25, i152, i162);
            imageReceiver.draw(canvas);
            if (z10) {
            }
            canvas.restore();
        }
    }

    public static SecretMediaViewer f() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = u1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            try {
                secretMediaViewer = u1;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    u1 = secretMediaViewer;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretMediaViewer;
    }

    public static boolean g() {
        return u1 != null;
    }

    public final void c(float f10, float f11, float f12, boolean z4) {
        if (this.v0 == f10 && this.t0 == f11 && this.u0 == f12) {
            return;
        }
        this.b1 = z4;
        this.y0 = f10;
        this.w0 = f11;
        this.x0 = f12;
        this.G0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.H0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.H0.setInterpolator(this.J0);
        this.H0.setDuration(MediaDataController.MAX_LINKS_COUNT);
        this.H0.addListener(new n41(this, 3));
        this.H0.start();
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
    public final void d(boolean z4) {
        float f10 = this.t0;
        float f11 = this.u0;
        n(this.v0);
        float f12 = this.t0;
        float f13 = this.S0;
        if (f12 >= f13) {
            f13 = this.T0;
        }
        f10 = f13;
        float f14 = this.u0;
        float f15 = this.U0;
        if (f14 >= f15) {
            f15 = this.V0;
        }
        f11 = f15;
        c(this.v0, f10, f11, z4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.messagesDeleted) {
            if (!((Boolean) objArr[2]).booleanValue() && this.e0 != null && ((Long) objArr[1]).longValue() == 0 && ((ArrayList) objArr[0]).contains(Integer.valueOf(this.e0.getId()))) {
                if (this.G && !this.E) {
                    this.F = true;
                    return;
                } else {
                    if (e(true, true)) {
                        return;
                    }
                    this.e1 = true;
                    return;
                }
            }
            return;
        }
        if (i10 != NotificationCenter.didCreatedNewDeleteTask) {
            if (i10 == NotificationCenter.updateMessageMedia) {
                if (this.e0.getId() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.G && !this.E) {
                        this.F = true;
                        return;
                    } else {
                        if (e(true, true)) {
                            return;
                        }
                        this.e1 = true;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.e0 == null || this.n == null || ((Long) objArr[0]).longValue() != this.v) {
            return;
        }
        SparseArray sparseArray = (SparseArray) objArr[1];
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            int keyAt = sparseArray.keyAt(i12);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (this.e0.getId() == ((Integer) arrayList.get(i13)).intValue()) {
                    this.e0.messageOwner.destroyTime = keyAt;
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
    public final boolean e(boolean z4, boolean z10) {
        qu0 qu0Var;
        o41 o41Var;
        Runnable runnable;
        Runnable runnable2;
        char c3;
        char c10;
        char c11;
        char c12;
        char c13;
        if (this.b == null || !this.g0) {
            return false;
        }
        if (this.j0 != 0 && Math.abs(this.k0 - System.currentTimeMillis()) >= 500) {
            Runnable runnable3 = this.l0;
            if (runnable3 != null) {
                runnable3.run();
                this.l0 = null;
            }
            this.j0 = 0;
        }
        if (this.j0 != 0) {
            return false;
        }
        if (this.n1 && z10) {
            return false;
        }
        Activity activity = this.b;
        if (activity != null) {
            AndroidUtilities.setLightNavigationBar(activity, this.l1);
            AndroidUtilities.setNavigationBarColor(this.b, this.k1);
            Activity activity2 = this.b;
            if (activity2 instanceof LaunchActivity) {
                ((LaunchActivity) activity2).y(this.k1);
            } else {
                AndroidUtilities.setNavigationBarColor(activity2, this.k1);
            }
        }
        lf.s0 s0Var = this.i1;
        if (s0Var != null) {
            s0Var.destroy();
            this.i1 = null;
        }
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.h0 = false;
        this.I = System.currentTimeMillis();
        ou0 ou0Var = this.K;
        if (ou0Var != null) {
            MessageObject messageObject = this.e0;
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                qu0Var = ou0Var.E(messageObject, null, 0, true, false);
                o41Var = this.y;
                if (o41Var != null) {
                    o41Var.B();
                }
                PhotoBackgroundDrawable photoBackgroundDrawable = this.i0;
                int i10 = 1;
                if (z4) {
                    k(false, true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<ag.l, Float>) View.SCALE_X, 0.9f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<ag.l, Float>) View.SCALE_Y, 0.9f);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0);
                    fg.k1 k1Var = this.C;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k1Var, (Property<fg.k1, Float>) property, 0.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.X, (Property<nt0, Float>) property, 0.0f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                    q41 q41Var = this.R;
                    animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(q41Var, q41Var.n, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<q41, Float>) property, 0.0f));
                    this.j0 = 2;
                    this.l0 = new i41(this, qu0Var, i10);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new n41(this, 2));
                    this.k0 = System.currentTimeMillis();
                    runnable = null;
                    this.e.setLayerType(2, null);
                    animatorSet.start();
                } else {
                    this.j0 = 3;
                    this.e.invalidate();
                    this.H0 = new AnimatorSet();
                    if (qu0Var == null || qu0Var.a.getThumbBitmap() == null || z10 || this.m1 != null) {
                        c3 = 7;
                        c10 = 6;
                        c11 = 5;
                        c12 = 4;
                        c13 = 3;
                        int i11 = AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight;
                        if (this.u0 < 0.0f) {
                            i11 = -i11;
                        }
                        this.x0 = i11;
                    } else {
                        qu0Var.a.setVisible(false, true);
                        RectF drawRegion = qu0Var.a.getDrawRegion();
                        c3 = 7;
                        float f10 = drawRegion.right - drawRegion.left;
                        c10 = 6;
                        float f11 = drawRegion.bottom - drawRegion.top;
                        Point point = AndroidUtilities.displaySize;
                        c11 = 5;
                        c12 = 4;
                        c13 = 3;
                        this.y0 = Math.max(f10 / point.x, f11 / (point.y + AndroidUtilities.statusBarHeight));
                        float f12 = qu0Var.b;
                        float f13 = drawRegion.left;
                        this.w0 = ((f10 / 2.0f) + (f12 + f13)) - (r7 / 2);
                        this.x0 = ((f11 / 2.0f) + (qu0Var.c + drawRegion.top)) - (r6 / 2);
                        this.D0 = Math.abs(f13 - qu0Var.a.getImageX());
                        int abs = (int) Math.abs(drawRegion.top - qu0Var.a.getImageY());
                        qu0Var.d.getLocationInWindow(new int[2]);
                        float f14 = (r7[1] - (qu0Var.c + drawRegion.top)) + qu0Var.j;
                        this.z0 = f14;
                        float f15 = abs;
                        this.z0 = Math.max(0.0f, Math.max(f14, f15));
                        float height = (((qu0Var.c + drawRegion.top) + ((int) f11)) - (qu0Var.d.getHeight() + r7[1])) + qu0Var.i;
                        this.A0 = height;
                        this.A0 = Math.max(0.0f, Math.max(height, f15));
                        this.B0 = 0.0f;
                        this.B0 = Math.max(0.0f, Math.max(0.0f, f15));
                        this.C0 = 0.0f;
                        this.C0 = Math.max(0.0f, Math.max(0.0f, f15));
                        this.G0 = System.currentTimeMillis();
                        this.b1 = true;
                    }
                    this.F0 = false;
                    k(false, true);
                    boolean z11 = this.G;
                    u0 u0Var = this.s1;
                    if (z11) {
                        this.a0 = false;
                        this.Z = false;
                        AnimatorSet animatorSet2 = this.H0;
                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, u0Var, 0.0f, 1.0f);
                        fg.k1 k1Var2 = this.C;
                        Property property2 = View.ALPHA;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k1Var2, (Property<fg.k1, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.X, (Property<nt0, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                        q41 q41Var2 = this.R;
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(q41Var2, q41Var2.n, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R, (Property<q41, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<qh.e3, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(this, this.r1, 0.0f);
                        Animator[] animatorArr = new Animator[9];
                        animatorArr[0] = ofInt2;
                        animatorArr[1] = ofFloat6;
                        animatorArr[2] = ofFloat7;
                        animatorArr[c13] = ofFloat8;
                        animatorArr[c12] = ofFloat9;
                        animatorArr[c11] = ofFloat10;
                        animatorArr[c10] = ofFloat11;
                        animatorArr[c3] = ofFloat12;
                        animatorArr[8] = ofFloat13;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        ImageReceiver imageReceiver = this.h;
                        imageReceiver.setManualAlphaAnimator(true);
                        AnimatorSet animatorSet3 = this.H0;
                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, org.telegram.ui.Components.n6.d, 0);
                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, u0Var, 0.0f, 1.0f);
                        fg.k1 k1Var3 = this.C;
                        Property property3 = View.ALPHA;
                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(k1Var3, (Property<fg.k1, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.X, (Property<nt0, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                        q41 q41Var3 = this.R;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(q41Var3, q41Var3.n, 0.0f);
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.R, (Property<q41, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<qh.e3, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(imageReceiver, org.telegram.ui.Components.n6.c, 0.0f);
                        Animator[] animatorArr2 = new Animator[9];
                        animatorArr2[0] = ofInt3;
                        animatorArr2[1] = ofFloat14;
                        animatorArr2[2] = ofFloat15;
                        animatorArr2[c13] = ofFloat16;
                        animatorArr2[c12] = ofFloat17;
                        animatorArr2[c11] = ofFloat18;
                        animatorArr2[c10] = ofFloat19;
                        animatorArr2[c3] = ofFloat20;
                        animatorArr2[8] = ofFloat21;
                        animatorSet3.playTogether(animatorArr2);
                    }
                    this.l0 = new i41(this, qu0Var, 0);
                    this.H0.setInterpolator(new DecelerateInterpolator());
                    this.H0.setDuration(250L);
                    this.H0.addListener(new org.telegram.ui.Components.ex0(11, this, qu0Var));
                    this.k0 = System.currentTimeMillis();
                    this.e.setLayerType(2, null);
                    this.H0.start();
                    runnable = null;
                }
                runnable2 = this.m1;
                if (runnable2 != null) {
                    runnable2.run();
                    this.m1 = runnable;
                }
                return true;
            }
        }
        qu0Var = null;
        o41Var = this.y;
        if (o41Var != null) {
        }
        PhotoBackgroundDrawable photoBackgroundDrawable2 = this.i0;
        int i102 = 1;
        if (z4) {
        }
        runnable2 = this.m1;
        if (runnable2 != null) {
        }
        return true;
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    public float getVideoCrossfadeAlpha() {
        return this.b0;
    }

    public final void h(File file) {
        if (this.b == null) {
            return;
        }
        i();
        if (this.x == null) {
            o4 o4Var = new o4(this.b);
            this.w = o4Var;
            o4Var.setVisibility(0);
            this.e.addView(this.w, 0, k7.c6.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.x = textureView;
            textureView.setOpaque(false);
            this.w.addView(this.x, k7.c6.e(-1, -1, 17));
        }
        this.Z = false;
        this.a0 = false;
        this.x.setAlpha(1.0f);
        if (this.y == null) {
            o41 o41Var = new o41(this);
            this.y = o41Var;
            o41Var.V(this.x);
            this.y.G = new n7.qa(this, file, false, 22);
        }
        this.y.D(Uri.fromFile(file), "other");
        this.y.P(true);
        this.T.a(true, true);
    }

    public final void i() {
        o41 o41Var = this.y;
        if (o41Var != null) {
            this.Y = 0;
            o41Var.H();
            this.y = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        o4 o4Var = this.w;
        if (o4Var != null) {
            this.e.removeView(o4Var);
            this.w = null;
        }
        if (this.x != null) {
            this.x = null;
        }
        this.B = false;
    }

    public final void j(MessageObject messageObject, CharSequence charSequence, boolean z4) {
        boolean z10;
        CharSequence cloneSpans = org.telegram.ui.Components.u5.cloneSpans(charSequence, 3);
        if (this.X == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.U = frameLayout;
            this.W.setContainer(frameLayout);
            nt0 nt0Var = new nt0(this, this.e.getContext(), this.W, this.U, 1);
            this.X = nt0Var;
            this.W.setScrollView(nt0Var);
            this.U.setClipChildren(false);
            this.X.addView(this.U, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.X, k7.c6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.V.o(this.e.getContext()).bringToFront();
        }
        boolean z11 = true;
        if (this.W.getParent() != this.U) {
            this.W.setMeasureAllChildren(true);
            this.U.addView(this.W, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.W.getCurrentView().getText());
        du0 du0Var = this.W;
        TextView nextView = z4 ? du0Var.getNextView() : du0Var.getCurrentView();
        int maxLines = nextView.getMaxLines();
        if (maxLines == 1) {
            this.W.getCurrentView().setSingleLine(false);
            this.W.getNextView().setSingleLine(false);
        }
        if (maxLines != Integer.MAX_VALUE) {
            this.W.getCurrentView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.W.getNextView().setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.W.getCurrentView().setEllipsize(null);
            this.W.getNextView().setEllipsize(null);
        }
        nextView.setScrollX(0);
        nt0 nt0Var2 = this.X;
        nt0Var2.i0 = false;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(nt0Var2);
            }
            TransitionSet duration = new TransitionSet().addTransition(new l41(this, isEmpty2, isEmpty, 1)).addTransition(new l41(this, isEmpty2, isEmpty, 0)).setDuration(200L);
            if (!isEmpty2) {
                this.X.i0 = true;
                duration.addTransition(new org.telegram.ui.Components.mm0(this, 3));
            }
            if (isEmpty2 && !isEmpty) {
                duration.addTarget((View) this.W);
            }
            TransitionManager.beginDelayedTransition(this.X, duration);
            z10 = true;
        } else {
            this.W.getCurrentView().setText((CharSequence) null);
            nt0 nt0Var3 = this.X;
            if (nt0Var3 != null) {
                nt0Var3.scrollTo(0, 0);
            }
            z10 = false;
        }
        if (isEmpty) {
            this.W.a(null, z4, false);
            this.W.getCurrentView().setTextColor(-1);
            du0 du0Var2 = this.W;
            if (z10 && !isEmpty2) {
                z11 = false;
            }
            du0Var2.b(4, z11);
            this.W.setTag(null);
        } else {
            org.telegram.ui.ActionBar.k6.J(null, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.v31.B())) {
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
            this.W.setTag(cloneSpans);
            try {
                this.W.a(cloneSpans, z4, false);
                nt0 nt0Var4 = this.X;
                if (nt0Var4 != null) {
                    nt0Var4.H(nt0Var4.getWidth(), nt0Var4.getHeight());
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.W.setVisibility(this.h0 ? 0 : 4);
        }
        if (this.W.getCurrentView() instanceof cu0) {
            ((cu0) this.W.getCurrentView()).setLoading(false);
        }
    }

    public final void k(boolean z4, boolean z10) {
        boolean z11 = this.G && z4;
        if (this.j1 == z11 && z10) {
            return;
        }
        this.j1 = z11;
        this.S.animate().cancel();
        if (z10) {
            this.S.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.h).start();
            return;
        }
        this.S.setScaleX(z11 ? 1.0f : 0.6f);
        this.S.setScaleY(z11 ? 1.0f : 0.6f);
        this.S.setAlpha(z11 ? 1.0f : 0.0f);
    }

    public final void l() {
        this.r.p(true);
        String string = LocaleController.getString(this.G ? R.string.VideoShownOnce : R.string.PhotoShownOnce);
        qh.e3 e3Var = this.r;
        e3Var.h = qh.e3.a(string, e3Var.getTextPaint());
        this.r.s(string);
        this.r.k(12.0f, 7.0f, 11.0f, 7.0f);
        qh.e3 e3Var2 = this.r;
        e3Var2.getClass();
        e3Var2.b0 = AndroidUtilities.dp(2);
        qh.e3 e3Var3 = this.r;
        e3Var3.getClass();
        e3Var3.a0 = 0.0f;
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.fire_on, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        hj0Var.start();
        e3Var3.j(hj0Var);
        this.r.u();
        MessagesController.getGlobalMainSettings().edit().putInt("viewoncehint", MessagesController.getGlobalMainSettings().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void m(boolean z4, boolean z10) {
        i41 i41Var = this.o1;
        AndroidUtilities.cancelRunOnUIThread(i41Var);
        if (z4 && this.G) {
            AndroidUtilities.runOnUIThread(i41Var, 3000L);
        }
        if (z4) {
            this.C.setVisibility(0);
        }
        this.C.setEnabled(z4);
        this.h0 = z4;
        k(z4, z10);
        if (!z10) {
            this.C.setAlpha(z4 ? 1.0f : 0.0f);
            this.X.setAlpha(z4 ? 1.0f : 0.0f);
            this.Q.setAlpha(z4 ? 1.0f : 0.0f);
            this.f.setAlpha(z4 ? 1.0f : 0.0f);
            if (z4) {
                return;
            }
            this.C.setVisibility(8);
            this.X.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        fg.k1 k1Var = this.C;
        Property property = View.ALPHA;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(k1Var, (Property<fg.k1, Float>) property, z4 ? 1.0f : 0.0f));
        q41 q41Var = this.R;
        arrayList.add(ObjectAnimator.ofFloat(q41Var, q41Var.n, z4 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<nt0, Float>) property, z4 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.Q, (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.D = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z4) {
            this.D.addListener(new n41(this, i10));
        }
        this.D.setDuration(200L);
        this.D.start();
    }

    public final void n(float f10) {
        ImageReceiver imageReceiver = this.h;
        int imageWidth = ((int) ((imageReceiver.getImageWidth() * f10) - this.e.getWidth())) / 2;
        int imageHeight = ((int) ((imageReceiver.getImageHeight() * f10) - this.e.getHeight())) / 2;
        if (imageWidth > 0) {
            this.S0 = -imageWidth;
            this.T0 = imageWidth;
        } else {
            this.T0 = 0.0f;
            this.S0 = 0.0f;
        }
        if (imageHeight > 0) {
            this.U0 = -imageHeight;
            this.V0 = imageHeight;
        } else {
            this.V0 = 0.0f;
            this.U0 = 0.0f;
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
        float f10 = this.v0;
        if ((f10 == 1.0f && (this.u0 != 0.0f || this.t0 != 0.0f)) || this.G0 != 0 || this.j0 != 0) {
            return false;
        }
        if (f10 == 1.0f) {
            float A = org.telegram.messenger.y3.A(3.0f, this.v0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.t0, motionEvent.getX() - (this.e.getWidth() / 2));
            float A2 = org.telegram.messenger.y3.A(3.0f, this.v0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.u0, motionEvent.getY() - (this.e.getHeight() / 2));
            n(3.0f);
            float f11 = this.S0;
            if (A >= f11) {
                f11 = this.T0;
            }
            A = f11;
            float f12 = this.U0;
            if (A2 >= f12) {
                f12 = this.V0;
            }
            A2 = f12;
            c(3.0f, A, A2, true);
        } else {
            c(1.0f, 0.0f, 0.0f, true);
        }
        this.Y0 = true;
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
        if (this.v0 == 1.0f) {
            return false;
        }
        this.d1.a();
        this.d1.c(Math.round(this.t0), Math.round(this.u0), Math.round(f10), Math.round(f11), (int) this.S0, (int) this.T0, (int) this.U0, (int) this.V0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.c1) {
            return false;
        }
        if (this.y == null || !this.h0 || motionEvent.getX() < this.S.getX() || motionEvent.getY() < this.S.getY() || motionEvent.getX() > this.S.getX() + this.S.getMeasuredWidth() || motionEvent.getX() > this.S.getX() + this.S.getMeasuredWidth()) {
            m(!this.h0, true);
            return true;
        }
        this.y.P(!r5.d.j());
        if (this.y.d.j()) {
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
        this.b0 = f10;
        this.e.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
