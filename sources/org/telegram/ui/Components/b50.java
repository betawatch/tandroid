package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b50 extends h50 {
    public static final /* synthetic */ int M0 = 0;
    public float A0;
    public int B0;
    public int C0;
    public boolean D0;
    public final org.telegram.ui.qk E;
    public boolean E0;
    public final LinearLayout F;
    public float F0;
    public final hi.l2 G;
    public int G0;
    public final hi.l2 H;
    public long H0;
    public final ImageView I;
    public boolean I0;
    public final hi.n2 J;
    public boolean J0;
    public final int[] K;
    public final w40 K0;
    public final Matrix L;
    public final qf L0;
    public final float[] M;
    public final Paint N;
    public final int O;
    public zi.u0 P;
    public zi.s0 Q;
    public zi.t0 R;
    public zi.m0 S;
    public sy0 T;
    public org.telegram.messenger.f20 U;
    public a50 V;
    public boolean W;
    public boolean a0;
    public AnimatorSet b0;
    public ValueAnimator c0;
    public ValueAnimator d0;
    public final p40 e;
    public final oh0 e0;
    public final int f;
    public oh0 f0;
    public oh0 g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final boolean n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final View r;
    public boolean r0;
    public final z40 s;
    public boolean s0;
    public long t0;
    public int u0;
    public Bitmap v0;
    public final uk0 w;
    public long w0;
    public final FrameLayout x;
    public float x0;
    public final y40 y;
    public float y0;
    public float z0;

    public b50(Activity activity, p40 p40Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f = org.telegram.messenger.k10.t0;
        int i7 = 2;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.B0 = -1;
        this.C0 = -1;
        this.F0 = Float.NaN;
        final int i10 = 0;
        this.K0 = new w40(this, 0);
        this.L0 = new qf(this, 4);
        this.e = p40Var;
        this.h = p40Var.getClassGuid();
        this.n = p40Var.z();
        this.r = p40Var.getFragmentView();
        setWillNotDraw(false);
        hi.n2 n2Var = new hi.n2(activity, null, this, null);
        this.J = n2Var;
        n2Var.o = 0.5f;
        n2Var.n = hi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.b, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        z40 z40Var = new z40(this, activity);
        this.s = z40Var;
        uk0 uk0Var = new uk0(activity);
        this.w = uk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        y40 y40Var = new y40(i10, activity, this);
        final int i11 = 1;
        y40Var.setOpaque(true);
        y40Var.setClickable(true);
        y40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        y40Var.setOutlineProvider(new bg.q0(12));
        y40Var.setClipToOutline(true);
        this.y = y40Var;
        frameLayout.addView(y40Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.qk qkVar = new org.telegram.ui.qk(this, activity, paint);
        this.E = qkVar;
        qkVar.setOutlineProvider(new bg.q0(11));
        qkVar.setClipToOutline(true);
        frameLayout.addView(qkVar, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        uk0Var.addView(frameLayout, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        z40Var.addView(uk0Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        int i12 = org.telegram.messenger.g0.v;
        addView(z40Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(n2Var.c, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ma.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        hi.l2 l2Var = new hi.l2(activity);
        this.G = l2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        l2Var.setContentDescription(org.telegram.messenger.hd.N0(2131754751, null));
        linearLayout.addView(l2Var, c8.ma.o(44, 44));
        l2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x40
            public final /* synthetic */ b50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.t0 t0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.t0 t0Var2;
                int i13;
                switch (i10) {
                    case 0:
                        b50 b50Var = this.b;
                        zi.u0 u0Var = b50Var.P;
                        if (u0Var != null && (t0Var = b50Var.R) != null && (m0Var = b50Var.S) != null && t0Var.a == 3 && !t0Var.f && !b50Var.p0) {
                            zi.n0 n0Var = m0Var.a;
                            zi.n0 n0Var2 = zi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.b;
                            }
                            u0Var.getClass();
                            zi.u0.v();
                            int i14 = u0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (u0Var.r != n0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.r + " -> " + n0Var2 + ", state=" + yi.i.e(u0Var.a0));
                                    u0Var.r = n0Var2;
                                    int i15 = u0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        u0Var.e();
                                        zi.k kVar = u0Var.l;
                                        kVar.E = n0Var2;
                                        Handler handler = kVar.n;
                                        if (!kVar.U || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new wg.q(23, kVar, n0Var2));
                                            z10 = true;
                                        }
                                        u0Var.y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                b50Var.e0.M(0);
                                b50Var.e0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b50 b50Var2 = this.b;
                        zi.u0 u0Var2 = b50Var2.P;
                        if (u0Var2 != null && (t0Var2 = b50Var2.R) != null && b50Var2.S != null) {
                            boolean z11 = !t0Var2.g;
                            zi.k kVar2 = u0Var2.l;
                            zi.u0.v();
                            if (u0Var2.a0 == 3 && !u0Var2.y && (i13 = u0Var2.b0) != 1) {
                                u0Var2.w = z11;
                                if (i13 == 3) {
                                    u0Var2.w(z11);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z11);
                                }
                                u0Var2.o();
                                b50Var2.E();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        hi.l2 l2Var2 = new hi.l2(activity);
        this.H = l2Var2;
        l2Var2.setScaleType(scaleType);
        linearLayout.addView(l2Var2, c8.ma.o(44, 44));
        l2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.x40
            public final /* synthetic */ b50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.t0 t0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.t0 t0Var2;
                int i13;
                switch (i11) {
                    case 0:
                        b50 b50Var = this.b;
                        zi.u0 u0Var = b50Var.P;
                        if (u0Var != null && (t0Var = b50Var.R) != null && (m0Var = b50Var.S) != null && t0Var.a == 3 && !t0Var.f && !b50Var.p0) {
                            zi.n0 n0Var = m0Var.a;
                            zi.n0 n0Var2 = zi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.b;
                            }
                            u0Var.getClass();
                            zi.u0.v();
                            int i14 = u0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (u0Var.r != n0Var2) {
                                    u0Var.m.b("camera facing requested: " + u0Var.r + " -> " + n0Var2 + ", state=" + yi.i.e(u0Var.a0));
                                    u0Var.r = n0Var2;
                                    int i15 = u0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        u0Var.e();
                                        zi.k kVar = u0Var.l;
                                        kVar.E = n0Var2;
                                        Handler handler = kVar.n;
                                        if (!kVar.U || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new wg.q(23, kVar, n0Var2));
                                            z10 = true;
                                        }
                                        u0Var.y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                b50Var.e0.M(0);
                                b50Var.e0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        b50 b50Var2 = this.b;
                        zi.u0 u0Var2 = b50Var2.P;
                        if (u0Var2 != null && (t0Var2 = b50Var2.R) != null && b50Var2.S != null) {
                            boolean z11 = !t0Var2.g;
                            zi.k kVar2 = u0Var2.l;
                            zi.u0.v();
                            if (u0Var2.a0 == 3 && !u0Var2.y && (i13 = u0Var2.b0) != 1) {
                                u0Var2.w = z11;
                                if (i13 == 3) {
                                    u0Var2.w(z11);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z11);
                                }
                                u0Var2.o();
                                b50Var2.E();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.O = L;
        oh0 oh0Var = new oh0(R.raw.roundcamera_flip, L, L);
        this.e0 = oh0Var;
        oh0Var.setCallback(l2Var);
        oh0Var.M(oh0Var.e[0] - 1);
        l2Var.setImageDrawable(oh0Var);
        E();
        if (h6Var != null && !h6Var.d()) {
            l2Var.setInvert(0.6f);
            l2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ma.e(48, 48, 17));
        y40Var.setOnTouchListener(new qk(this, i7));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.t0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.t0);
    }

    private long getCurrentDurationMs() {
        zi.t0 t0Var;
        zi.u0 u0Var = this.P;
        if (u0Var == null || (t0Var = this.R) == null) {
            return 0L;
        }
        return t0Var.a == 3 ? u0Var.j() : t0Var.b;
    }

    public static void n(b50 b50Var) {
        if (b50Var.p0 && b50Var.s0 && b50Var.q0 && b50Var.r0) {
            b50Var.p0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + b50Var.getCameraFlipElapsedMs());
            b50Var.D();
        }
    }

    public static void o(b50 b50Var) {
        org.telegram.ui.qk qkVar = b50Var.E;
        if (b50Var.n0) {
            b50Var.n0 = false;
            qkVar.invalidate();
            qkVar.animate().cancel();
            qkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.rj rjVar;
        if (z10 == this.I0) {
            return;
        }
        this.I0 = z10;
        this.H0 = 0L;
        w40 w40Var = this.K0;
        if (z10) {
            bg.k.d().a(30, w40Var);
        } else {
            bg.k.d().f(w40Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        f50 f50Var = this.c;
        if (f50Var == null || (rjVar = ((org.telegram.ui.xi) f50Var).a.a0) == null) {
            return;
        }
        rjVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        hi.n2 n2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.F0)) {
                this.F0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            n2Var.c(null);
        } else {
            if (!Float.isNaN(this.F0)) {
                attributes.screenBrightness = this.F0;
                this.F0 = Float.NaN;
            }
            n2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z10) {
        Bitmap bitmap;
        y40 y40Var = this.y;
        if (y40Var.isAvailable() && (bitmap = y40Var.getBitmap(org.telegram.messenger.ls.K2, org.telegram.messenger.ls.K2)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.v0;
                    this.v0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.v0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.v0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void B(boolean z10, boolean z11) {
        d50 d50Var = this.a;
        if (d50Var != null) {
            ((org.telegram.ui.ee) d50Var).b.dd.a(z10, true);
        }
        AnimatorSet animatorSet = this.b0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.b0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        z40 z40Var = this.s;
        if (z10 && !this.m0) {
            z40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.y0 = measuredHeight;
            z40Var.setTranslationY(measuredHeight + this.x0);
        }
        this.m0 = z10;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z10 || Math.max(getCurrentDurationMs(), this.w0) <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new v40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b0 = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(z40Var, (Property<z40, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.k0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.b0.setDuration(180L);
        this.b0.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.b0.addListener(new y(this, 29));
        }
        this.b0.start();
    }

    public final void C() {
        if (this.E0) {
            this.E0 = false;
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.k1, 512);
        }
    }

    public final void D() {
        zi.m0 m0Var;
        zi.t0 t0Var = this.R;
        boolean z10 = false;
        boolean z11 = (t0Var == null || t0Var.a != 3 || t0Var.f || this.p0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (m0Var = this.S) != null && m0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        E();
    }

    public final void E() {
        zi.t0 t0Var = this.R;
        int i7 = this.O;
        hi.l2 l2Var = this.H;
        if (t0Var == null || !t0Var.g) {
            if (this.f0 == null) {
                oh0 oh0Var = new oh0(R.raw.roundcamera_flash_on, i7, i7);
                this.f0 = oh0Var;
                oh0Var.setCallback(l2Var);
            }
            l2Var.setImageDrawable(this.f0);
            return;
        }
        if (this.g0 == null) {
            oh0 oh0Var2 = new oh0(R.raw.roundcamera_flash_off, i7, i7);
            this.g0 = oh0Var2;
            oh0Var2.setCallback(l2Var);
        }
        l2Var.setImageDrawable(this.g0);
    }

    public final void F() {
        org.telegram.ui.rj rjVar;
        zi.t0 t0Var = this.R;
        if (t0Var != null) {
            long j3 = t0Var.d;
            if (t0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + t0Var.b) - t0Var.c);
            this.w0 = min;
            this.w.setProgress(min / j3);
            f50 f50Var = this.c;
            if (f50Var == null || (rjVar = ((org.telegram.ui.xi) f50Var).a.a0) == null || !rjVar.Z1) {
                return;
            }
            rjVar.Y1 = min;
            wg wgVar = rjVar.Z0;
            if (wgVar != null && wgVar.r) {
                wgVar.h = min;
                wgVar.invalidate();
            }
            tg tgVar = rjVar.b2;
            if (tgVar != null && tgVar.f) {
                if (!tgVar.e) {
                    long j10 = tgVar.h;
                    if (j10 >= 0) {
                        if (!tgVar.c) {
                            tgVar.a = tg.b(Math.max(0L, min - j10));
                        }
                        tgVar.invalidate();
                    }
                }
                tgVar.h = min;
                tgVar.a = 1.0f;
                tgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = rjVar.a2;
            if (slideTextView == null || !slideTextView.H || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final void a(boolean z10) {
        zi.u0 u0Var;
        if (x() || (u0Var = this.P) == null || !u0Var.a()) {
            return;
        }
        this.V = null;
        z(z10 ? 0 : 6);
        sy0 sy0Var = this.T;
        if (sy0Var != null) {
            sy0Var.d(true);
        }
        this.T = null;
        MediaController.B().Y(false);
        B(false, false);
    }

    @Override // org.telegram.ui.Components.h50
    public final void b(float f10, int i7) {
        zi.t0 t0Var;
        if (this.P == null || (t0Var = this.R) == null || t0Var.a != 5) {
            return;
        }
        q();
        if (i7 == 0) {
            this.P.r();
            return;
        }
        if (i7 == 1) {
            this.P.p();
            return;
        }
        if (i7 == 2) {
            zi.u0 u0Var = this.P;
            long j3 = (long) (f10 * this.R.b);
            u0Var.getClass();
            zi.u0.v();
            if (u0Var.a0 != 5 || u0Var.W == null) {
                return;
            }
            long j10 = u0Var.K;
            u0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, u0Var.L - 1), j3)));
            u0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.P == null || !x()) {
            zi.u0 u0Var = this.P;
            if (u0Var != null) {
                u0Var.s();
                this.P = null;
            }
        } else {
            this.a0 = true;
            this.P.s();
        }
        sy0 sy0Var = this.T;
        if (sy0Var != null && !this.a0) {
            sy0Var.d(true ^ this.l0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override // org.telegram.ui.Components.h50
    public final void d(boolean z10) {
        c(true);
        z40 z40Var = this.s;
        z40Var.setTranslationX(0.0f);
        this.y0 = 0.0f;
        z40Var.setTranslationY(0.0f + this.x0);
        z40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.h50
    public final boolean f() {
        zi.t0 t0Var = this.R;
        if (t0Var == null) {
            return false;
        }
        int i7 = t0Var.a;
        return i7 == 4 || i7 == 5 || i7 == 6;
    }

    @Override // org.telegram.ui.Components.h50
    public final void g(float f10) {
        float f11 = f10 * 0.5f;
        this.x0 = f11;
        this.s.setTranslationY(this.y0 + f11);
    }

    @Override // org.telegram.ui.Components.h50
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.h50
    public e50 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.h50
    public RectF getCameraRect() {
        y40 y40Var = this.y;
        int[] iArr = this.K;
        y40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], y40Var.getWidth() + r3, y40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.h50
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.h50
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.h50
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.h50
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        if (this.P == null || this.R == null) {
            return;
        }
        if (i7 == 3) {
            y();
            return;
        }
        if ((i7 == 1 || i7 == 4) && this.V == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                org.telegram.messenger.ls.f(this.f).k(org.telegram.messenger.ls.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.R.a == 3) {
                z(5);
            }
            this.i0 = false;
            this.V = new a50(i10, i11, j3, j10, z10);
            u();
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final void i(dh.c cVar, org.telegram.ui.pi piVar) {
        LinearLayout linearLayout = this.F;
        fh.g c10 = cVar.c(linearLayout, piVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.h50
    public final void j(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.ls.e4);
        this.l0 = false;
        this.k0 = false;
        this.V = null;
        this.W = false;
        this.h0 = false;
        this.j0 = false;
        this.w0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.qk qkVar = this.E;
        if (!this.n0) {
            if (this.v0 == null) {
                try {
                    this.v0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.v0;
            if (bitmap != null) {
                qkVar.setImageBitmap(bitmap);
            } else {
                qkVar.setImageResource(R.drawable.icplaceholder);
            }
            this.n0 = true;
            qkVar.animate().cancel();
            qkVar.setAlpha(1.0f);
            qkVar.invalidate();
        }
        this.T = new sy0(this.f, this.n);
        this.Q = (zi.s0) aj.e.e.a();
        zi.l0 l0Var = new zi.l0(getContext(), this.y);
        l0Var.c = new File(org.telegram.messenger.t0.h(), "cache");
        l0Var.d = (zi.n0) aj.e.j.a();
        l0Var.e = this.Q;
        l0Var.h = aj.e.h.a();
        l0Var.f = (zi.o0) aj.e.f.a();
        l0Var.g = (zi.p0) aj.e.g.a();
        aj.a aVar = aj.e.i;
        aVar.a();
        l0Var.i = aVar.d;
        qf qfVar = this.L0;
        l0Var.j = qfVar;
        sy0 sy0Var = this.T;
        l0Var.k = sy0Var;
        l0Var.l = new ky(this, 4);
        if (l0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (l0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (l0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (l0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (l0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (qfVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (sy0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new zi.u0(l0Var);
        MediaController.B().Y(true);
        zi.u0 u0Var = this.P;
        u0Var.getClass();
        zi.u0.v();
        if (u0Var.a0 == 1) {
            try {
                u0Var.m.b("start requested");
                u0Var.c(true);
                u0Var.x(2);
                u0Var.l.V(u0Var.U, 0L, u0Var.r);
            } catch (Exception e10) {
                u0Var.h(e10);
            }
        }
        B(true, false);
    }

    @Override // org.telegram.ui.Components.h50
    public final void k() {
        zi.t0 t0Var;
        zi.u0 u0Var = this.P;
        if (u0Var == null || (t0Var = this.R) == null) {
            return;
        }
        int i7 = t0Var.a;
        if (i7 == 3) {
            y();
            return;
        }
        if (i7 == 5) {
            zi.u0.v();
            if (u0Var.a0 != 5 || u0Var.L - u0Var.K >= u0Var.q) {
                return;
            }
            u0Var.Q++;
            u0Var.D = false;
            u0Var.m.b("resume requested: trim=" + u0Var.K + ".." + u0Var.L + ", sourceDurationMs=" + u0Var.I);
            u0Var.t();
            u0Var.x(6);
            u0Var.j.execute(new ai.i(u0Var, u0Var.l(), u0Var.U, u0Var.T, u0Var.V, 17));
            this.U = null;
            this.i0 = true;
            this.j0 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i7)) * 1.3f ? org.telegram.messenger.g0.v : org.telegram.messenger.g0.u;
        if (this.G0 != i11) {
            this.G0 = i11;
            z40 z40Var = this.s;
            z40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            z40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        hi.n2 n2Var = this.J;
        n2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        zi.u0 u0Var;
        zi.t0 t0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0 || (u0Var = this.P) == null || (t0Var = this.R) == null) {
            return;
        }
        if (t0Var.a == 3) {
            y();
        } else if (t0Var.e) {
            u0Var.p();
        }
    }

    public final void q() {
        zi.t0 t0Var;
        org.telegram.messenger.f20 f20Var;
        if (this.P == null || (t0Var = this.R) == null || (f20Var = this.U) == null) {
            return;
        }
        long j3 = t0Var.b;
        long max = Math.max(0L, f20Var.a);
        long j10 = this.U.b;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        zi.u0 u0Var = this.P;
        u0Var.getClass();
        zi.u0.v();
        if (u0Var.a0 != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(u0Var.I, max));
        long max3 = Math.max(max2, Math.min(u0Var.I, j3));
        if (max3 - max2 < Math.min(800L, u0Var.I)) {
            return;
        }
        u0Var.K = max2;
        u0Var.L = max3;
        l2.f0 f0Var = u0Var.W;
        if (f0Var != null) {
            f0Var.Z0(5, max2);
        }
        u0Var.d.getClass();
        u0Var.o();
    }

    public final Bitmap r(Bitmap bitmap) {
        y40 y40Var = this.y;
        if (y40Var.getWidth() > 0 && y40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            y40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / y40Var.getWidth();
                float height = bitmap.getHeight() / y40Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void s() {
        if (this.p0 || this.d0 != null) {
            this.u0++;
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.d0.cancel();
                this.d0 = null;
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.p0 = false;
            this.q0 = false;
            this.r0 = false;
            this.s0 = false;
            w(false);
        }
    }

    @Override // org.telegram.ui.Components.h50
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override // org.telegram.ui.Components.h50
    public void setIsMessageTransition(boolean z10) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.F.setAlpha(0.0f);
        z40 z40Var = this.s;
        z40Var.setAlpha(0.0f);
        z40Var.setScaleX(0.1f);
        z40Var.setScaleY(0.1f);
        z40Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i7 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final org.telegram.messenger.f20 t(File file, long j3, ry0 ry0Var) {
        zi.p0 p0Var;
        org.telegram.messenger.f20 f20Var = new org.telegram.messenger.f20();
        f20Var.a = -1L;
        f20Var.b = -1L;
        f20Var.r = j3;
        f20Var.q = Math.max(1L, ry0Var == null ? file.length() : ry0Var.a);
        f20Var.s = true;
        zi.u0 u0Var = this.P;
        f20Var.n = (u0Var == null || (p0Var = u0Var.u) == null) ? 30 : p0Var.a;
        zi.s0 s0Var = this.Q;
        int i7 = s0Var == null ? 480 : s0Var.a;
        f20Var.h = i7;
        f20Var.k = i7;
        f20Var.i = i7;
        f20Var.l = i7;
        f20Var.o = file.getAbsolutePath();
        if (ry0Var != null) {
            f20Var.w = ry0Var.b;
            f20Var.x = ry0Var.c;
            f20Var.y = ry0Var.d;
            f20Var.z = ry0Var.e;
        }
        return f20Var;
    }

    public final void u() {
        zi.t0 t0Var;
        if (this.V == null || this.W || this.P == null || (t0Var = this.R) == null) {
            return;
        }
        int i7 = t0Var.a;
        if (i7 == 5) {
            q();
        } else if (i7 != 3) {
            return;
        }
        zi.u0 u0Var = this.P;
        boolean z10 = this.k0;
        boolean z11 = !z10;
        u0Var.getClass();
        zi.u0.v();
        int i10 = u0Var.a0;
        boolean z12 = false;
        if (i10 == 3 || i10 == 5) {
            u0Var.m.b("finish requested: state=" + yi.i.e(u0Var.a0) + ", includeAudio=" + z11 + ", durationMs=" + u0Var.j() + ", trim=" + u0Var.K + ".." + u0Var.L);
            u0Var.B = z11;
            if (u0Var.a0 == 3) {
                u0Var.I = u0Var.j();
                u0Var.A = true;
                u0Var.e();
                u0Var.i.removeCallbacks(u0Var.X);
                u0Var.x(7);
                boolean W = u0Var.l.W();
                u0Var.E = W;
                if (!W) {
                    u0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                u0Var.t();
                u0Var.x(7);
                u0Var.j.execute(new di.ia(u0Var, u0Var.U, u0Var.l() || z10, u0Var.V, z11, u0Var.l() ? 1 : 2, u0Var.T));
            }
            z12 = true;
        }
        this.W = z12;
    }

    public final void v() {
        if (this.D0) {
            this.D0 = false;
            this.B0 = -1;
            this.C0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A0, 0.0f);
            this.c0 = ofFloat;
            ofFloat.setDuration(350L);
            this.c0.addUpdateListener(new v40(this, 1));
            this.c0.start();
        }
    }

    public final void w(boolean z10) {
        if (this.o0) {
            this.o0 = false;
            org.telegram.ui.qk qkVar = this.E;
            qkVar.animate().cancel();
            if (z10) {
                qkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                qkVar.setAlpha(0.0f);
            }
        }
    }

    public final boolean x() {
        zi.u0 u0Var;
        if (this.V == null || !this.W || (u0Var = this.P) == null) {
            return false;
        }
        zi.u0.v();
        return u0Var.a0 == 7;
    }

    public final void y() {
        zi.t0 t0Var;
        if (this.P == null || (t0Var = this.R) == null || t0Var.a != 3) {
            return;
        }
        z(2);
        this.P.q();
    }

    public final void z(int i7) {
        if (this.j0 && i7 == 2) {
            return;
        }
        this.j0 = true;
        org.telegram.messenger.ls.f(this.f).k(org.telegram.messenger.ls.n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
