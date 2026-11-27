package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class SecretMediaViewer implements fn7, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public static volatile SecretMediaViewer w1;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public ac8 E;
    public float E0;
    public boolean F;
    public float F0;
    public y10 G;
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
    public ts1 M;
    public float M0;
    public int N;
    public int O;
    public float O0;
    public sfc P;
    public float P0;
    public nf9 Q;
    public float Q0;
    public ema R;
    public float R0;
    public View S;
    public float S0;
    public ey9 T;
    public float T0;
    public ImageView U;
    public float U0;
    public mf8 V;
    public float V0;
    public FrameLayout W;
    public float W0;
    public kb8 X;
    public float X0;
    public wc8 Y;
    public boolean Y0;
    public ic8 Z;
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
    public d26 d;
    public float d0;
    public boolean d1;
    public tt e;
    public long e0;
    public boolean e1;
    public View f;
    public WindowInsets f0;
    public dv9 f1;
    public r47 g0;
    public boolean g1;
    public mn5 h0;
    public boolean i0;
    public e26 k1;
    public byte l0;
    public boolean l1;
    public long m0;
    public int m1;
    public dy9 n;
    public Runnable n0;
    public boolean n1;
    public boolean o0;
    public Runnable o1;
    public float p0;
    public boolean p1;
    public float q0;
    public kg5 r;
    public float r0;
    public float[] r1;
    public boolean s;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public boolean v1;
    public long w;
    public float w0;
    public jx x;
    public TextureView y;
    public float y0;
    public float z0;
    public final ImageReceiver h = new ImageReceiver(null);
    public boolean j0 = true;
    public final PhotoBackgroundDrawable k0 = new PhotoBackgroundDrawable();
    public float x0 = 1.0f;
    public final DecelerateInterpolator L0 = new DecelerateInterpolator(1.5f);
    public float N0 = 1.0f;
    public boolean c1 = true;
    public final xx9 h1 = new xx9(this, 2);
    public final int[] i1 = new int[2];
    public final int[] j1 = new int[2];
    public final xx9 q1 = new xx9(this, 3);
    public final Path s1 = new Path();
    public final qm t1 = new qm("videoCrossfadeAlpha", 13);
    public final qm u1 = new qm("animationValue", 14);

    public static SecretMediaViewer d() {
        SecretMediaViewer secretMediaViewer;
        SecretMediaViewer secretMediaViewer2 = w1;
        if (secretMediaViewer2 != null) {
            return secretMediaViewer2;
        }
        synchronized (PhotoViewer.class) {
            secretMediaViewer = w1;
            if (secretMediaViewer == null) {
                secretMediaViewer = new SecretMediaViewer();
                w1 = secretMediaViewer;
            }
        }
        return secretMediaViewer;
    }

    public static boolean e() {
        return w1 != null;
    }

    public final void a(float f, float f2, float f3, boolean z) {
        if (this.x0 == f && this.v0 == f2 && this.w0 == f3) {
            return;
        }
        this.d1 = z;
        this.A0 = f;
        this.y0 = f2;
        this.z0 = f3;
        this.I0 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
        this.J0.setInterpolator(this.L0);
        this.J0.setDuration(250L);
        this.J0.addListener(new cy9(this, (byte) 3));
        this.J0.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r2 > r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 > r3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        float f = this.v0;
        float f2 = this.w0;
        o(this.x0);
        float f3 = this.v0;
        float f4 = this.U0;
        if (f3 >= f4) {
            f4 = this.V0;
        }
        f = f4;
        float f5 = this.w0;
        float f6 = this.W0;
        if (f5 >= f6) {
            f6 = this.X0;
        }
        f2 = f6;
        a(this.x0, f, f2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(boolean z, boolean z2) {
        fd8 fd8Var;
        ac8 ac8Var;
        Runnable runnable;
        Runnable runnable2;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        boolean z3;
        byte b;
        int i;
        Bitmap bitmap;
        if (this.b != null && this.i0) {
            if (this.l0 != 0 && Math.abs(this.m0 - System.currentTimeMillis()) >= 500) {
                Runnable runnable3 = this.n0;
                if (runnable3 != null) {
                    runnable3.run();
                    this.n0 = null;
                }
                this.l0 = (byte) 0;
            }
            if (this.l0 == 0 && (!this.p1 || !z2)) {
                Activity activity = this.b;
                byte b2 = 1;
                if (activity != null) {
                    hl.h3(activity, this.n1);
                    Activity activity2 = this.b;
                    int i2 = this.m1;
                    if (activity2 != null) {
                        hl.p3(activity2.getWindow(), i2, true, null);
                    }
                    Activity activity3 = this.b;
                    boolean z4 = activity3 instanceof LaunchActivity;
                    int i3 = this.m1;
                    if (z4) {
                        ((LaunchActivity) activity3).z(i3);
                    } else if (activity3 != null) {
                        hl.p3(activity3.getWindow(), i3, true, null);
                    }
                }
                e26 e26Var = this.k1;
                if (e26Var != null) {
                    e26Var.a();
                    this.k1 = null;
                }
                jn7.f(this.a).n(this, jn7.v);
                jn7.f(this.a).n(this, jn7.l0);
                jn7.f(this.a).n(this, jn7.i0);
                this.j0 = false;
                System.currentTimeMillis();
                ts1 ts1Var = this.M;
                if (ts1Var != null) {
                    r47 r47Var = this.g0;
                    TLRPC.MessageMedia messageMedia = r47Var.k.media;
                    if (!(messageMedia.photo instanceof TLRPC.TL_photoEmpty) && !(messageMedia.document instanceof TLRPC.TL_documentEmpty)) {
                        fd8Var = ts1Var.M(r47Var, null, 0, true, false);
                        ac8Var = this.E;
                        if (ac8Var != null) {
                            ac8Var.f0();
                        }
                        PhotoBackgroundDrawable photoBackgroundDrawable = this.k0;
                        if (z) {
                            l(false, true);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, (Property<tt, Float>) View.SCALE_X, 0.9f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, (Property<tt, Float>) View.SCALE_Y, 0.9f);
                            ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, sn.d, 0);
                            y10 y10Var = this.G;
                            Property property = View.ALPHA;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) property, 0.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z, (Property<ic8, Float>) property, 0.0f);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, 0.0f);
                            ey9 ey9Var = this.T;
                            animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ey9Var, ey9Var.n, 0.0f), ObjectAnimator.ofFloat(this.T, (Property<ey9, Float>) property, 0.0f));
                            this.l0 = (byte) 2;
                            this.n0 = new xx9(this, fd8Var, b2);
                            animatorSet.setDuration(200L);
                            animatorSet.addListener(new cy9(this, (byte) 2));
                            this.m0 = System.currentTimeMillis();
                            runnable = null;
                            this.e.setLayerType(2, null);
                            animatorSet.start();
                        } else {
                            this.l0 = (byte) 3;
                            this.e.invalidate();
                            this.J0 = new AnimatorSet();
                            if (fd8Var != null) {
                                ImageReceiver imageReceiver = fd8Var.a;
                                Drawable drawable = imageReceiver.b0;
                                c2 = 7;
                                if (drawable instanceof BitmapDrawable) {
                                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                                } else {
                                    Drawable drawable2 = imageReceiver.n0;
                                    bitmap = drawable2 instanceof BitmapDrawable ? ((BitmapDrawable) drawable2).getBitmap() : null;
                                }
                                if (bitmap == null || z2 || this.o1 != null) {
                                    c = 3;
                                } else {
                                    fd8Var.a.v0(false, true);
                                    RectF rectF = fd8Var.a.Q0;
                                    float f = rectF.right - rectF.left;
                                    c3 = 6;
                                    float f2 = rectF.bottom - rectF.top;
                                    Point point = hl.q;
                                    c4 = 5;
                                    c5 = 4;
                                    c = 3;
                                    this.A0 = Math.max(f / point.x, f2 / (point.y + hl.m));
                                    float f3 = fd8Var.b;
                                    float f4 = rectF.left;
                                    this.y0 = ((f / 2.0f) + (f3 + f4)) - (r8 / 2);
                                    this.z0 = ((f2 / 2.0f) + (fd8Var.c + rectF.top)) - (r7 / 2);
                                    this.F0 = Math.abs(f4 - fd8Var.a.L0);
                                    int abs = (int) Math.abs(rectF.top - fd8Var.a.M0);
                                    fd8Var.d.getLocationInWindow(new int[2]);
                                    float f5 = (r8[1] - (fd8Var.c + rectF.top)) + fd8Var.j;
                                    this.B0 = f5;
                                    float f6 = abs;
                                    this.B0 = Math.max(0.0f, Math.max(f5, f6));
                                    float height = (((fd8Var.c + rectF.top) + ((int) f2)) - (fd8Var.d.getHeight() + r8[1])) + fd8Var.i;
                                    this.C0 = height;
                                    this.C0 = Math.max(0.0f, Math.max(height, f6));
                                    this.D0 = 0.0f;
                                    this.D0 = Math.max(0.0f, Math.max(0.0f, f6));
                                    this.E0 = 0.0f;
                                    this.E0 = Math.max(0.0f, Math.max(0.0f, f6));
                                    this.I0 = System.currentTimeMillis();
                                    this.d1 = true;
                                    this.H0 = false;
                                    l(false, true);
                                    z3 = this.K;
                                    qm qmVar = this.u1;
                                    if (z3) {
                                        b = 0;
                                        ImageReceiver imageReceiver2 = this.h;
                                        imageReceiver2.m1 = true;
                                        AnimatorSet animatorSet2 = this.J0;
                                        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(photoBackgroundDrawable, sn.d, 0);
                                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, qmVar, 0.0f, 1.0f);
                                        y10 y10Var2 = this.G;
                                        Property property2 = View.ALPHA;
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(y10Var2, (Property<y10, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.Z, (Property<ic8, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property2, 0.0f);
                                        ey9 ey9Var2 = this.T;
                                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(ey9Var2, ey9Var2.n, 0.0f);
                                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.T, (Property<ey9, Float>) property2, 0.0f);
                                        i = 2;
                                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.r, (Property<kg5, Float>) property2, 0.0f);
                                        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(imageReceiver2, sn.c, 0.0f);
                                        Animator[] animatorArr = new Animator[9];
                                        animatorArr[0] = ofInt2;
                                        animatorArr[1] = ofFloat6;
                                        animatorArr[2] = ofFloat7;
                                        animatorArr[c] = ofFloat8;
                                        animatorArr[c5] = ofFloat9;
                                        animatorArr[c4] = ofFloat10;
                                        animatorArr[c3] = ofFloat11;
                                        animatorArr[c2] = ofFloat12;
                                        animatorArr[8] = ofFloat13;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        this.c0 = false;
                                        this.b0 = false;
                                        AnimatorSet animatorSet3 = this.J0;
                                        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(photoBackgroundDrawable, sn.d, 0);
                                        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(this, qmVar, 0.0f, 1.0f);
                                        y10 y10Var3 = this.G;
                                        Property property3 = View.ALPHA;
                                        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(this.Z, (Property<ic8, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property3, 0.0f);
                                        ey9 ey9Var3 = this.T;
                                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(ey9Var3, ey9Var3.n, 0.0f);
                                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(this.T, (Property<ey9, Float>) property3, 0.0f);
                                        b = 0;
                                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(this.r, (Property<kg5, Float>) property3, 0.0f);
                                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(this, this.t1, 0.0f);
                                        Animator[] animatorArr2 = new Animator[9];
                                        animatorArr2[0] = ofInt3;
                                        animatorArr2[1] = ofFloat14;
                                        animatorArr2[2] = ofFloat15;
                                        animatorArr2[c] = ofFloat16;
                                        animatorArr2[c5] = ofFloat17;
                                        animatorArr2[c4] = ofFloat18;
                                        animatorArr2[c3] = ofFloat19;
                                        animatorArr2[c2] = ofFloat20;
                                        animatorArr2[8] = ofFloat21;
                                        animatorSet3.playTogether(animatorArr2);
                                        i = 2;
                                    }
                                    this.n0 = new xx9(this, fd8Var, b);
                                    this.J0.setInterpolator(new DecelerateInterpolator());
                                    this.J0.setDuration(250L);
                                    this.J0.addListener(new wd8((Object) this, (Object) fd8Var, (byte) 13));
                                    this.m0 = System.currentTimeMillis();
                                    this.e.setLayerType(i, null);
                                    this.J0.start();
                                    runnable = null;
                                }
                            } else {
                                c = 3;
                                c2 = 7;
                            }
                            c3 = 6;
                            c4 = 5;
                            c5 = 4;
                            int i4 = hl.q.y + hl.m;
                            if (this.w0 < 0.0f) {
                                i4 = -i4;
                            }
                            this.z0 = i4;
                            this.H0 = false;
                            l(false, true);
                            z3 = this.K;
                            qm qmVar2 = this.u1;
                            if (z3) {
                            }
                            this.n0 = new xx9(this, fd8Var, b);
                            this.J0.setInterpolator(new DecelerateInterpolator());
                            this.J0.setDuration(250L);
                            this.J0.addListener(new wd8((Object) this, (Object) fd8Var, (byte) 13));
                            this.m0 = System.currentTimeMillis();
                            this.e.setLayerType(i, null);
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
                fd8Var = null;
                ac8Var = this.E;
                if (ac8Var != null) {
                }
                PhotoBackgroundDrawable photoBackgroundDrawable2 = this.k0;
                if (z) {
                }
                runnable2 = this.o1;
                if (runnable2 != null) {
                }
                return true;
            }
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.v) {
            if (((Boolean) objArr[2]).booleanValue() || this.g0 == null || ((Long) objArr[1]).longValue() != 0 || !((ArrayList) objArr[0]).contains(Integer.valueOf(this.g0.e1()))) {
                return;
            }
            if (this.K && !this.I) {
                this.J = true;
                return;
            } else {
                if (c(true, true)) {
                    return;
                }
                this.g1 = true;
                return;
            }
        }
        if (i != jn7.i0) {
            if (i == jn7.l0) {
                if (this.g0.e1() == ((TLRPC.Message) objArr[0]).id) {
                    if (this.K && !this.I) {
                        this.J = true;
                        return;
                    } else {
                        if (c(true, true)) {
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
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int keyAt = sparseArray.keyAt(i3);
            ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (this.g0.e1() == ((Integer) arrayList.get(i4)).intValue()) {
                    this.g0.k.destroyTime = keyAt;
                    this.n.invalidate();
                    return;
                }
            }
        }
    }

    public final /* synthetic */ WindowInsets f(WindowInsets windowInsets) {
        WindowInsets windowInsets2 = this.f0;
        this.f0 = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            this.d.requestLayout();
        }
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z;
        float f13;
        float f14;
        boolean z2;
        int q;
        int o;
        int i;
        float f15;
        float f16;
        int i2;
        if (this.i0) {
            if (this.J0 != null) {
                dv9 dv9Var = this.f1;
                if (!dv9Var.q) {
                    dv9Var.a();
                }
                float f17 = this.x0;
                float f18 = this.A0;
                float f19 = this.animationValue;
                f4 = ((f18 - f17) * f19) + f17;
                float f20 = this.w0;
                f5 = qd4.A(this.z0, f20, f19, f20);
                float f21 = this.v0;
                f6 = qd4.A(this.y0, f21, f19, f21);
                float f22 = this.q0;
                f7 = qd4.A(this.B0, f22, f19, f22);
                float f23 = this.r0;
                f8 = qd4.A(this.C0, f23, f19, f23);
                float f24 = this.s0;
                f = -1.0f;
                f9 = qd4.A(this.D0, f24, f19, f24);
                float f25 = this.t0;
                f2 = 1.0f;
                f10 = qd4.A(this.E0, f25, f19, f25);
                float f26 = this.u0;
                f3 = 0.0f;
                f11 = qd4.A(this.F0, f26, f19, f26);
                f12 = (f18 == 1.0f && f17 == 1.0f && f21 == 0.0f) ? f5 : -1.0f;
                this.e.invalidate();
            } else {
                f = -1.0f;
                f2 = 1.0f;
                f3 = 0.0f;
                if (this.I0 != 0) {
                    this.v0 = this.y0;
                    this.w0 = this.z0;
                    this.r0 = this.C0;
                    this.q0 = this.B0;
                    this.s0 = this.D0;
                    this.t0 = this.E0;
                    this.u0 = this.F0;
                    float f27 = this.A0;
                    this.x0 = f27;
                    this.I0 = 0L;
                    o(f27);
                    this.d1 = false;
                }
                dv9 dv9Var2 = this.f1;
                if (!dv9Var2.q && dv9Var2.b()) {
                    dv9 dv9Var3 = this.f1;
                    float f28 = dv9Var3.b;
                    if (f28 < this.V0 && f28 > this.U0) {
                        this.v0 = dv9Var3.j;
                    }
                    float f29 = dv9Var3.c;
                    if (f29 < this.X0 && f29 > this.W0) {
                        this.w0 = dv9Var3.k;
                    }
                    this.e.invalidate();
                }
                f4 = this.x0;
                f5 = this.w0;
                f6 = this.v0;
                f7 = this.q0;
                f8 = this.r0;
                f9 = this.s0;
                f10 = this.t0;
                f11 = this.u0;
                f12 = !this.Z0 ? f5 : -1.0f;
            }
            if (this.G0 != null) {
                int i3 = 8;
                if (this.r1 == null) {
                    this.r1 = new float[8];
                }
                boolean z3 = this.H0;
                float f30 = this.animationValue;
                if (!z3) {
                    f30 = f2 - f30;
                }
                int i4 = 0;
                z = true;
                while (i4 < i3) {
                    float[] fArr = this.r1;
                    float f31 = f3;
                    float R1 = hl.R1(this.G0[i4 / 2] * 2.0f, f31, f30);
                    fArr[i4 + 1] = R1;
                    fArr[i4] = R1;
                    if (this.r1[i4] > f31) {
                        z = false;
                    }
                    i4 += 2;
                    i3 = 8;
                    f3 = 0.0f;
                }
            } else {
                z = true;
            }
            if (this.l0 != 3) {
                float f32 = this.x0;
                PhotoBackgroundDrawable photoBackgroundDrawable = this.k0;
                if (f32 != f2 || f12 == f || this.d1) {
                    photoBackgroundDrawable.setAlpha(jn7.d4);
                } else {
                    float height = this.e.getHeight() / 4.0f;
                    photoBackgroundDrawable.setAlpha((int) Math.max(127.0f, (f2 - (Math.min(Math.abs(f12), height) / height)) * 255.0f));
                }
                if (!this.d1) {
                    float f33 = this.V0;
                    if (f6 > f33) {
                        float width = (f6 - f33) / canvas.getWidth();
                        float f34 = f2;
                        float min = Math.min(f34, width);
                        f14 = min * 0.3f;
                        f13 = f34 - min;
                        f6 = this.V0;
                        jx jxVar = this.x;
                        z2 = jxVar == null && jxVar.getVisibility() == 0;
                        canvas.save();
                        float f35 = f4 - f14;
                        canvas.translate((this.e.getWidth() / 2) + f6, (this.e.getHeight() / 2) + f5);
                        canvas.scale(f35, f35);
                        ImageReceiver imageReceiver = this.h;
                        q = imageReceiver.q();
                        o = imageReceiver.o();
                        i = this.N;
                        if (i != 0 && (i2 = this.O) != 0) {
                            q = i;
                            o = i2;
                        }
                        if (z2 && this.b0 && Math.abs((q / o) - (this.y.getMeasuredWidth() / this.y.getMeasuredHeight())) > 0.01f) {
                            q = this.y.getMeasuredWidth();
                            o = this.y.getMeasuredHeight();
                        }
                        float f36 = o;
                        float f37 = q;
                        float min2 = Math.min(this.e.getHeight() / f36, this.e.getWidth() / f37);
                        int i5 = (int) (f37 * min2);
                        int i6 = (int) (f36 * min2);
                        f15 = (-i5) / 2;
                        float f38 = f11 / f35;
                        float f39 = f15 + f38;
                        f16 = (-i6) / 2;
                        float f40 = (i5 / 2) - f38;
                        float f41 = i6 / 2;
                        canvas.clipRect(f39, (f7 / f35) + f16, f40, f41 - (f8 / f35));
                        if (!z) {
                            Path path = this.s1;
                            path.reset();
                            RectF rectF = hl.P;
                            rectF.set(f39, (f9 / f35) + f16, f40, f41 - (f10 / f35));
                            path.addRoundRect(rectF, this.r1, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                        if (z2 || !this.b0 || !this.c0 || this.d0 != 1.0f) {
                            imageReceiver.setAlpha(f13);
                            imageReceiver.i0(f15, f16, i5, i6);
                            imageReceiver.h(canvas, null);
                        }
                        if (z2) {
                            if (!this.c0 && this.b0) {
                                this.c0 = true;
                                this.d0 = 0.0f;
                                this.e0 = System.currentTimeMillis();
                            }
                            canvas.translate(f15, f16);
                            this.y.setAlpha(f13 * this.d0);
                            this.x.draw(canvas);
                            if (this.c0 && this.d0 < 1.0f) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long j = currentTimeMillis - this.e0;
                                this.e0 = currentTimeMillis;
                                this.d0 = (j / 200.0f) + this.d0;
                                this.e.invalidate();
                                if (this.d0 > 1.0f) {
                                    this.d0 = 1.0f;
                                }
                            }
                        }
                        canvas.restore();
                    }
                }
            }
            f13 = 1.0f;
            f14 = 0.0f;
            jx jxVar2 = this.x;
            if (jxVar2 == null) {
            }
            canvas.save();
            float f352 = f4 - f14;
            canvas.translate((this.e.getWidth() / 2) + f6, (this.e.getHeight() / 2) + f5);
            canvas.scale(f352, f352);
            ImageReceiver imageReceiver2 = this.h;
            q = imageReceiver2.q();
            o = imageReceiver2.o();
            i = this.N;
            if (i != 0) {
                q = i;
                o = i2;
            }
            if (z2) {
                q = this.y.getMeasuredWidth();
                o = this.y.getMeasuredHeight();
            }
            float f362 = o;
            float f372 = q;
            float min22 = Math.min(this.e.getHeight() / f362, this.e.getWidth() / f372);
            int i52 = (int) (f372 * min22);
            int i62 = (int) (f362 * min22);
            f15 = (-i52) / 2;
            float f382 = f11 / f352;
            float f392 = f15 + f382;
            f16 = (-i62) / 2;
            float f402 = (i52 / 2) - f382;
            float f412 = i62 / 2;
            canvas.clipRect(f392, (f7 / f352) + f16, f402, f412 - (f8 / f352));
            if (!z) {
            }
            if (z2) {
            }
            imageReceiver2.setAlpha(f13);
            imageReceiver2.i0(f15, f16, i52, i62);
            imageReceiver2.h(canvas, null);
            if (z2) {
            }
            canvas.restore();
        }
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
    public final void h(r47 r47Var, ts1 ts1Var, fm1 fm1Var, ue2 ue2Var) {
        fd8 M;
        ?? r17;
        String str;
        Bitmap bitmap;
        int i;
        PhotoBackgroundDrawable photoBackgroundDrawable;
        float f;
        boolean z;
        File M2;
        if (this.b == null || !r47Var.l5() || ts1Var == null || (M = ts1Var.M(r47Var, null, 0, true, false)) == null) {
            return;
        }
        this.p1 = r47Var.k.ttl == Integer.MAX_VALUE;
        this.o1 = ue2Var;
        this.M = ts1Var;
        System.currentTimeMillis();
        this.j0 = true;
        this.i0 = true;
        this.o0 = false;
        jx jxVar = this.x;
        if (jxVar != null) {
            jxVar.setVisibility(4);
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
        RectF rectF = new RectF(M.a.Q0);
        rectF.left = Math.max(rectF.left, M.a.L0);
        rectF.top = Math.max(rectF.top, M.a.M0);
        rectF.right = Math.min(rectF.right, M.a.w());
        rectF.bottom = Math.min(rectF.bottom, M.a.x());
        float width = rectF.width();
        float height = rectF.height();
        Point point = hl.q;
        this.x0 = Math.max(width / point.x, height / (point.y + hl.m));
        int[] iArr = M.h;
        if (iArr != null) {
            this.G0 = new int[iArr.length];
            r17 = 1;
            int i2 = 0;
            while (true) {
                int[] iArr2 = M.h;
                if (i2 >= iArr2.length) {
                    break;
                }
                this.G0[i2] = iArr2[i2];
                i2++;
            }
        } else {
            r17 = 1;
            this.G0 = null;
        }
        float f2 = M.b;
        float f3 = rectF.left;
        this.v0 = ((width / 2.0f) + (f2 + f3)) - (r10 / 2);
        this.w0 = ((height / 2.0f) + (M.c + rectF.top)) - (r8 / 2);
        this.u0 = Math.abs(f3 - M.a.L0);
        int abs = (int) Math.abs(rectF.top - M.a.M0);
        M.d.getLocationInWindow(new int[2]);
        float f4 = (r8[r17] - (M.c + rectF.top)) + M.j;
        this.q0 = f4;
        float f5 = abs;
        this.q0 = Math.max(0.0f, Math.max(f4, f5));
        float height2 = (((M.c + rectF.top) + ((int) height)) - (M.d.getHeight() + r8[r17])) + M.i;
        this.r0 = height2;
        this.r0 = Math.max(0.0f, Math.max(height2, f5));
        this.s0 = 0.0f;
        this.s0 = Math.max(0.0f, Math.max(0.0f, f5));
        this.t0 = 0.0f;
        this.t0 = Math.max(0.0f, Math.max(0.0f, f5));
        this.I0 = System.currentTimeMillis();
        this.y0 = 0.0f;
        this.z0 = 0.0f;
        this.C0 = 0.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.B0 = 0.0f;
        this.D0 = 0.0f;
        this.A0 = 1.0f;
        boolean z2 = r17;
        this.H0 = z2;
        this.d1 = z2;
        e26 e26Var = this.k1;
        if (e26Var != null) {
            e26Var.a();
            this.k1 = null;
        }
        this.k1 = LaunchActivity.c0();
        jn7.f(this.a).a(this, jn7.v);
        jn7.f(this.a).a(this, jn7.l0);
        jn7.f(this.a).a(this, jn7.i0);
        this.w = r47.B1(r47Var.k.peer_id);
        this.g0 = r47Var;
        TLRPC.Document F0 = r47Var.F0();
        mn5 mn5Var = this.h0;
        if (mn5Var != null) {
            mn5Var.a();
            this.h0 = null;
        }
        ImageReceiver imageReceiver2 = M.a;
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
        this.h0 = bitmap != null ? new mn5(bitmap, str, 0) : null;
        this.T.setVisibility(8);
        if (F0 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= F0.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    this.N = tL_documentAttributeVideo.w;
                    this.O = tL_documentAttributeVideo.h;
                    break;
                }
                i3++;
            }
            if (r47.s3(F0, false)) {
                this.G.setTitle(ob6.M0(2131751374, null));
                String str2 = r47Var.k.attachPath;
                f = 1.0f;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                i = 2;
                imageReceiver.c0((str2 == null || !r47Var.y0) ? jn5.b(F0) : jn5.g(str2), null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, r47Var, 1);
            } else {
                i = 2;
                photoBackgroundDrawable = photoBackgroundDrawable2;
                f = 1.0f;
                this.a0 = 1;
                this.G.setTitle(ob6.M0(2131751372, null));
                File file = new File(r47Var.k.attachPath);
                if (file.exists()) {
                    i(file);
                } else {
                    boolean D3 = r47Var.D3();
                    int i4 = this.a;
                    if (D3) {
                        xb4.G(i4);
                        M2 = xb4.J(F0, null, true, true);
                    } else {
                        xb4.G(i4);
                        M2 = xb4.M(r47Var.k, false, true);
                    }
                    File file2 = new File(M2.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        M2 = file2;
                    }
                    i(M2);
                }
                this.K = true;
                this.T.setVisibility(0);
                imageReceiver.c0(null, null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, r47Var, 2);
            }
        } else {
            i = 2;
            photoBackgroundDrawable = photoBackgroundDrawable2;
            f = 1.0f;
            this.G.setTitle(ob6.M0(2131751373, null));
            TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
            imageReceiver.c0(jn5.f(w, r47Var.n0), null, this.h0 != null ? new BitmapDrawable(this.h0.c) : null, -1L, null, r47Var, 2);
            if (w != null) {
                this.N = w.w;
                this.O = w.h;
            }
        }
        k(r47Var, "", false);
        k(r47Var, r47Var.z, true);
        n(true, false);
        l(false, false);
        this.V.a(true, true);
        boolean z3 = this.p1;
        dy9 dy9Var = this.n;
        if (z3) {
            dy9Var.e = true;
            TextPaint textPaint = dy9Var.r;
            textPaint.setTextSize(hl.L(13.0f));
            textPaint.setTypeface(hl.n1("fonts/num.otf"));
            textPaint.setColor(-1);
            StaticLayout staticLayout = new StaticLayout("1", textPaint, 999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            dy9Var.s = staticLayout;
            dy9Var.w = staticLayout.getLineCount() > 0 ? dy9Var.s.getLineWidth(0) : 0.0f;
            dy9Var.x = dy9Var.s.getHeight();
            dy9Var.invalidate();
            this.n.setOnClickListener(new jn8(this, (byte) 21));
        } else {
            dy9Var.setOnClickListener(null);
        }
        try {
            if (this.d.getParent() != null) {
                ((WindowManager) this.b.getSystemService("window")).removeView(this.d);
            }
            z = true;
        } catch (Exception e) {
            z = true;
            cc4.g(e, true);
        }
        ((WindowManager) this.b.getSystemService("window")).addView(this.d, this.c);
        this.n.invalidate();
        this.s = z;
        Window window = this.b.getWindow();
        int i5 = Build.VERSION.SDK_INT;
        this.n1 = i5 >= 26 ? vsd.a(window.getDecorView().getSystemUiVisibility(), 16) : false;
        hl.h3(this.b, false);
        hl.j3(this.d, false);
        Activity activity = this.b;
        if (activity instanceof LaunchActivity) {
            this.m1 = i5 >= 26 ? ((LaunchActivity) activity).getWindow().getNavigationBarColor() : 0;
            ((LaunchActivity) this.b).z(-16777216);
        } else {
            this.m1 = window.getNavigationBarColor();
            Activity activity2 = this.b;
            if (activity2 != null) {
                hl.p3(activity2.getWindow(), -16777216, true, null);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.J0 = animatorSet;
        y10 y10Var = this.G;
        Property property = View.ALPHA;
        float[] fArr = new float[i];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) property, fArr);
        float[] fArr2 = new float[i];
        // fill-array-data instruction
        fArr2[0] = 0.0f;
        fArr2[1] = 1.0f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Z, (Property<ic8, Float>) property, fArr2);
        float[] fArr3 = new float[i];
        // fill-array-data instruction
        fArr3[0] = 0.0f;
        fArr3[1] = 1.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, (Property<kg5, Float>) property, fArr3);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(photoBackgroundDrawable, sn.d, 0, jn7.d4);
        float[] fArr4 = new float[i];
        // fill-array-data instruction
        fArr4[0] = 0.0f;
        fArr4[1] = 1.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, this.u1, fArr4);
        ey9 ey9Var = this.T;
        int i6 = i;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ey9Var, ey9Var.n, f);
        ey9 ey9Var2 = this.T;
        if (!this.K) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ey9Var2, (Property<ey9, Float>) property, f);
        Animator[] animatorArr = new Animator[7];
        animatorArr[0] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[i6] = ofFloat3;
        animatorArr[3] = ofInt;
        animatorArr[4] = ofFloat4;
        animatorArr[5] = ofFloat5;
        animatorArr[6] = ofFloat6;
        animatorSet.playTogether(animatorArr);
        this.l0 = (byte) 3;
        this.n0 = new jr9((Object) this, (Object) fm1Var, (Object) r47Var, (byte) 6);
        this.J0.setDuration(250L);
        this.J0.addListener(new cy9(this, (byte) 0));
        this.m0 = System.currentTimeMillis();
        if (xea.o() == 0) {
            this.e.setLayerType(i6, null);
        }
        this.J0.setInterpolator(new DecelerateInterpolator());
        photoBackgroundDrawable.b = 0;
        photoBackgroundDrawable.a = new dn9(this, M, (byte) 16);
        this.J0.start();
    }

    public final void i(File file) {
        if (this.b == null) {
            return;
        }
        j();
        boolean z = false;
        if (this.y == null) {
            jx jxVar = new jx(this.b);
            this.x = jxVar;
            jxVar.setVisibility(0);
            this.e.addView(this.x, 0, tre.e(-1, -1, 17));
            TextureView textureView = new TextureView(this.b);
            this.y = textureView;
            textureView.setOpaque(false);
            this.x.addView(this.y, tre.e(-1, -1, 17));
        }
        this.b0 = false;
        this.c0 = false;
        this.y.setAlpha(1.0f);
        ac8 ac8Var = this.E;
        byte b = 1;
        if (ac8Var == null) {
            ac8 ac8Var2 = new ac8(this, b);
            this.E = ac8Var2;
            ac8Var2.z0(this.y);
            ac8Var = this.E;
            ac8Var.K = new um4(this, file, z, (byte) 26);
        }
        ac8Var.i0(Uri.fromFile(file), "other");
        this.E.t0(true);
        this.V.a(true, true);
    }

    public final void j() {
        ac8 ac8Var = this.E;
        if (ac8Var != null) {
            this.a0 = 0;
            ac8Var.l0();
            this.E = null;
        }
        try {
            Activity activity = this.b;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        jx jxVar = this.x;
        if (jxVar != null) {
            this.e.removeView(jxVar);
            this.x = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.F = false;
    }

    public final void k(r47 r47Var, CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence cloneSpans = hm.cloneSpans(charSequence, 3);
        if (this.Z == null) {
            FrameLayout frameLayout = new FrameLayout(this.e.getContext());
            this.W = frameLayout;
            this.Y.setContainer(frameLayout);
            ic8 ic8Var = new ic8(this, this.e.getContext(), this.Y, this.W, (byte) 1);
            this.Z = ic8Var;
            this.Y.setScrollView(ic8Var);
            this.W.setClipChildren(false);
            this.Z.addView(this.W, new ViewGroup.LayoutParams(-1, -2));
            this.e.addView(this.Z, tre.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
            this.X.m(this.e.getContext()).bringToFront();
        }
        boolean z3 = true;
        if (this.Y.getParent() != this.W) {
            this.Y.setMeasureAllChildren(true);
            this.W.addView(this.Y, -1, -2);
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.Y.getCurrentView().getText());
        wc8 wc8Var = this.Y;
        TextView nextView = z ? wc8Var.getNextView() : wc8Var.getCurrentView();
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
        ic8 ic8Var2 = this.Z;
        ic8Var2.l0 = false;
        if (z) {
            TransitionManager.endTransitions(ic8Var2);
            TransitionSet duration = new TransitionSet().addTransition(new ay9(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new ay9(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
            if (!isEmpty2) {
                this.Z.l0 = true;
                duration.addTransition(new lc8(this, (byte) 2));
            } else if (!isEmpty) {
                duration.addTarget((View) this.Y);
            }
            TransitionManager.beginDelayedTransition(this.Z, duration);
            z2 = true;
        } else {
            this.Y.getCurrentView().setText((CharSequence) null);
            ic8 ic8Var3 = this.Z;
            if (ic8Var3 != null) {
                ic8Var3.scrollTo(0, 0);
            }
            z2 = false;
        }
        if (isEmpty) {
            this.Y.a(null, z, false);
            this.Y.getCurrentView().setTextColor(-1);
            wc8 wc8Var2 = this.Y;
            if (z2 && !isEmpty2) {
                z3 = false;
            }
            wc8Var2.b(4, z3);
            this.Y.setTag(null);
        } else {
            aob.O();
            TLRPC.Message message = r47Var.k;
            if (message == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
                if (r47Var.k.entities.isEmpty()) {
                    cloneSpans = pv3.m(new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    r47Var.c(spannableString, true, false);
                    if (r47.K4(r47Var.k)) {
                        r47.h(r47Var.O3(), spannableString, false, 3, (int) r47Var.L0(), false);
                    }
                    cloneSpans = pv3.m(spannableString, nextView.getPaint().getFontMetricsInt(), false, null, 0);
                }
            }
            this.Y.setTag(cloneSpans);
            try {
                this.Y.a(cloneSpans, z, false);
                ic8 ic8Var4 = this.Z;
                if (ic8Var4 != null) {
                    ic8Var4.H(ic8Var4.getWidth(), ic8Var4.getHeight());
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.Y.setVisibility(this.j0 ? 0 : 4);
        }
        if (this.Y.getCurrentView() instanceof vc8) {
            ((vc8) this.Y.getCurrentView()).setLoading(false);
        }
    }

    public final void l(boolean z, boolean z2) {
        boolean z3 = this.K && z;
        if (this.l1 == z3 && z2) {
            return;
        }
        this.l1 = z3;
        this.U.animate().cancel();
        ImageView imageView = this.U;
        if (z2) {
            imageView.animate().scaleX(z3 ? 1.0f : 0.6f).scaleY(z3 ? 1.0f : 0.6f).alpha(z3 ? 1.0f : 0.0f).setDuration(340L).setInterpolator(k43.h).start();
            return;
        }
        imageView.setScaleX(z3 ? 1.0f : 0.6f);
        this.U.setScaleY(z3 ? 1.0f : 0.6f);
        this.U.setAlpha(z3 ? 1.0f : 0.0f);
    }

    public final void m() {
        this.r.p(true);
        String M0 = ob6.M0(this.K ? 2131743232 : 2131746989, null);
        kg5 kg5Var = this.r;
        kg5Var.h = kg5.a(M0, kg5Var.getTextPaint());
        this.r.t(M0);
        this.r.m(12.0f, 7.0f, 11.0f, 7.0f);
        kg5 kg5Var2 = this.r;
        kg5Var2.getClass();
        kg5Var2.f0 = hl.L(2.0f);
        kg5 kg5Var3 = this.r;
        kg5Var3.getClass();
        kg5Var3.e0 = 0.0f;
        b29 b29Var = new b29(R.raw.fire_on, hl.L(34.0f), hl.L(34.0f));
        b29Var.start();
        kg5Var3.l(b29Var);
        this.r.v();
        uc7.e1().edit().putInt("viewoncehint", uc7.e1().getInt("viewoncehint", 0) + 1).commit();
    }

    public final void n(boolean z, boolean z2) {
        xx9 xx9Var = this.q1;
        hl.r(xx9Var);
        if (z && this.K) {
            hl.d3(xx9Var, 3000L);
        }
        if (z) {
            this.G.setVisibility(0);
        }
        this.G.setEnabled(z);
        this.j0 = z;
        l(z, z2);
        if (!z2) {
            this.G.setAlpha(z ? 1.0f : 0.0f);
            this.Z.setAlpha(z ? 1.0f : 0.0f);
            this.S.setAlpha(z ? 1.0f : 0.0f);
            this.f.setAlpha(z ? 1.0f : 0.0f);
            if (z) {
                return;
            }
            this.G.setVisibility(8);
            this.Z.scrollTo(0, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        y10 y10Var = this.G;
        Property property = View.ALPHA;
        byte b = 1;
        arrayList.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) property, z ? 1.0f : 0.0f));
        ey9 ey9Var = this.T;
        arrayList.add(ObjectAnimator.ofFloat(ey9Var, ey9Var.n, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.Z, (Property<ic8, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.S, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        this.H = animatorSet;
        animatorSet.playTogether(arrayList);
        if (!z) {
            this.H.addListener(new cy9(this, b));
        }
        this.H.setDuration(200L);
        this.H.start();
    }

    public final void o(float f) {
        ImageReceiver imageReceiver = this.h;
        int width = ((int) ((imageReceiver.N0 * f) - this.e.getWidth())) / 2;
        int height = ((int) ((imageReceiver.O0 * f) - this.e.getHeight())) / 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r0 > r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r8 > r1) goto L23;
     */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f = this.x0;
        if ((f == 1.0f && (this.w0 != 0.0f || this.v0 != 0.0f)) || this.I0 != 0 || this.l0 != 0) {
            return false;
        }
        if (f == 1.0f) {
            float x = uh9.x(3.0f, this.x0, (motionEvent.getX() - (this.e.getWidth() / 2)) - this.v0, motionEvent.getX() - (this.e.getWidth() / 2));
            float x2 = uh9.x(3.0f, this.x0, (motionEvent.getY() - (this.e.getHeight() / 2)) - this.w0, motionEvent.getY() - (this.e.getHeight() / 2));
            o(3.0f);
            float f2 = this.U0;
            if (x >= f2) {
                f2 = this.V0;
            }
            x = f2;
            float f3 = this.W0;
            if (x2 >= f3) {
                f3 = this.X0;
            }
            x2 = f3;
            a(3.0f, x, x2, true);
        } else {
            a(1.0f, 0.0f, 0.0f, true);
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.x0 == 1.0f) {
            return false;
        }
        this.f1.a();
        this.f1.c(Math.round(this.v0), Math.round(this.w0), Math.round(f), Math.round(f2), (int) this.U0, (int) this.V0, (int) this.W0, (int) this.X0);
        this.e.postInvalidate();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
        this.E.t0(!r5.d.s());
        if (this.E.d.s()) {
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

    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.e.invalidate();
    }

    public void setVideoCrossfadeAlpha(float f) {
        this.d0 = f;
        this.e.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    public class PhotoBackgroundDrawable extends ColorDrawable {
        public dn9 a;
        public int b;

        public PhotoBackgroundDrawable() {
            super(-16777216);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            dn9 dn9Var;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.b != 2 || (dn9Var = this.a) == null) {
                    invalidateSelf();
                } else {
                    dn9Var.run();
                    this.a = null;
                }
                this.b++;
            }
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
            e26 e26Var = secretMediaViewer.k1;
            if (e26Var != null) {
                e26Var.b(secretMediaViewer.i0 && i == 255);
            }
            super.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(Rect rect) {
            rect.bottom += hl.n;
            super.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4 + hl.n);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
