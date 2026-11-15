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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q40 extends w40 {
    public static final /* synthetic */ int M0 = 0;
    public float A0;
    public int B0;
    public int C0;
    public boolean D0;
    public final org.telegram.ui.pk E;
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
    public final l40 K0;
    public final Matrix L;
    public final ff L0;
    public final float[] M;
    public final Paint N;
    public final int O;
    public zi.v0 P;
    public zi.t0 Q;
    public zi.u0 R;
    public zi.m0 S;
    public jy0 T;
    public org.telegram.messenger.g20 U;
    public p40 V;
    public boolean W;
    public boolean a0;
    public AnimatorSet b0;
    public ValueAnimator c0;
    public ValueAnimator d0;
    public final e40 e;
    public final ch0 e0;
    public final int f;
    public ch0 f0;
    public ch0 g0;
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
    public final o40 s;
    public boolean s0;
    public long t0;
    public int u0;
    public Bitmap v0;
    public final kk0 w;
    public long w0;
    public final FrameLayout x;
    public float x0;
    public final n40 y;
    public float y0;
    public float z0;

    public q40(Activity activity, e40 e40Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f = org.telegram.messenger.m10.t0;
        int i7 = 2;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.B0 = -1;
        this.C0 = -1;
        this.F0 = Float.NaN;
        final int i10 = 0;
        this.K0 = new l40(this, 0);
        this.L0 = new ff(this, 4);
        this.e = e40Var;
        this.h = e40Var.getClassGuid();
        this.n = e40Var.z();
        this.r = e40Var.getFragmentView();
        setWillNotDraw(false);
        hi.n2 n2Var = new hi.n2(activity, null, this, null);
        this.J = n2Var;
        n2Var.o = 0.5f;
        n2Var.n = hi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.b, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        o40 o40Var = new o40(this, activity);
        this.s = o40Var;
        kk0 kk0Var = new kk0(activity);
        this.w = kk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        n40 n40Var = new n40(i10, activity, this);
        final int i11 = 1;
        n40Var.setOpaque(true);
        n40Var.setClickable(true);
        n40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        n40Var.setOutlineProvider(new bg.p0(12));
        n40Var.setClipToOutline(true);
        this.y = n40Var;
        frameLayout.addView(n40Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, activity, paint);
        this.E = pkVar;
        pkVar.setOutlineProvider(new bg.p0(11));
        pkVar.setClipToOutline(true);
        frameLayout.addView(pkVar, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        kk0Var.addView(frameLayout, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        o40Var.addView(kk0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        int i12 = org.telegram.messenger.g0.v;
        addView(o40Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(n2Var.c, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ja.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        hi.l2 l2Var = new hi.l2(activity);
        this.G = l2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        l2Var.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView(l2Var, c8.ja.o(44, 44));
        l2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m40
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.u0 u0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.u0 u0Var2;
                int i13;
                switch (i10) {
                    case 0:
                        q40 q40Var = this.b;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && (u0Var = q40Var.R) != null && (m0Var = q40Var.S) != null && u0Var.a == 3 && !u0Var.f && !q40Var.p0) {
                            zi.n0 n0Var = m0Var.a;
                            zi.n0 n0Var2 = zi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.b;
                            }
                            v0Var.getClass();
                            zi.v0.v();
                            int i14 = v0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (v0Var.r != n0Var2) {
                                    v0Var.m.b("camera facing requested: " + v0Var.r + " -> " + n0Var2 + ", state=" + zi.p0.b(v0Var.a0));
                                    v0Var.r = n0Var2;
                                    int i15 = v0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        v0Var.e();
                                        zi.l lVar = v0Var.l;
                                        lVar.E = n0Var2;
                                        Handler handler = lVar.n;
                                        if (!lVar.U || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new ug.t1(29, lVar, n0Var2));
                                            z10 = true;
                                        }
                                        v0Var.y = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                q40Var.e0.M(0);
                                q40Var.e0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        q40 q40Var2 = this.b;
                        zi.v0 v0Var2 = q40Var2.P;
                        if (v0Var2 != null && (u0Var2 = q40Var2.R) != null && q40Var2.S != null) {
                            boolean z11 = !u0Var2.g;
                            zi.l lVar2 = v0Var2.l;
                            zi.v0.v();
                            if (v0Var2.a0 == 3 && !v0Var2.y && (i13 = v0Var2.b0) != 1) {
                                v0Var2.w = z11;
                                if (i13 == 3) {
                                    v0Var2.w(z11);
                                    lVar2.S(false);
                                } else {
                                    v0Var2.w(false);
                                    lVar2.S(z11);
                                }
                                v0Var2.o();
                                q40Var2.E();
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
        linearLayout.addView(l2Var2, c8.ja.o(44, 44));
        l2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m40
            public final /* synthetic */ q40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zi.u0 u0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.u0 u0Var2;
                int i13;
                switch (i11) {
                    case 0:
                        q40 q40Var = this.b;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && (u0Var = q40Var.R) != null && (m0Var = q40Var.S) != null && u0Var.a == 3 && !u0Var.f && !q40Var.p0) {
                            zi.n0 n0Var = m0Var.a;
                            zi.n0 n0Var2 = zi.n0.a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.b;
                            }
                            v0Var.getClass();
                            zi.v0.v();
                            int i14 = v0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (v0Var.r != n0Var2) {
                                    v0Var.m.b("camera facing requested: " + v0Var.r + " -> " + n0Var2 + ", state=" + zi.p0.b(v0Var.a0));
                                    v0Var.r = n0Var2;
                                    int i15 = v0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        v0Var.e();
                                        zi.l lVar = v0Var.l;
                                        lVar.E = n0Var2;
                                        Handler handler = lVar.n;
                                        if (!lVar.U || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new ug.t1(29, lVar, n0Var2));
                                            z10 = true;
                                        }
                                        v0Var.y = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                q40Var.e0.M(0);
                                q40Var.e0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        q40 q40Var2 = this.b;
                        zi.v0 v0Var2 = q40Var2.P;
                        if (v0Var2 != null && (u0Var2 = q40Var2.R) != null && q40Var2.S != null) {
                            boolean z11 = !u0Var2.g;
                            zi.l lVar2 = v0Var2.l;
                            zi.v0.v();
                            if (v0Var2.a0 == 3 && !v0Var2.y && (i13 = v0Var2.b0) != 1) {
                                v0Var2.w = z11;
                                if (i13 == 3) {
                                    v0Var2.w(z11);
                                    lVar2.S(false);
                                } else {
                                    v0Var2.w(false);
                                    lVar2.S(z11);
                                }
                                v0Var2.o();
                                q40Var2.E();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.O = L;
        ch0 ch0Var = new ch0(R.raw.roundcamera_flip, L, L);
        this.e0 = ch0Var;
        ch0Var.setCallback(l2Var);
        ch0Var.M(ch0Var.e[0] - 1);
        l2Var.setImageDrawable(ch0Var);
        E();
        if (e6Var != null && !e6Var.a()) {
            l2Var.setInvert(0.6f);
            l2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ja.e(48, 48, 17));
        n40Var.setOnTouchListener(new hk(this, i7));
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
        zi.u0 u0Var;
        zi.v0 v0Var = this.P;
        if (v0Var == null || (u0Var = this.R) == null) {
            return 0L;
        }
        return u0Var.a == 3 ? v0Var.j() : u0Var.b;
    }

    public static void n(q40 q40Var) {
        if (q40Var.p0 && q40Var.s0 && q40Var.q0 && q40Var.r0) {
            q40Var.p0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + q40Var.getCameraFlipElapsedMs());
            q40Var.D();
        }
    }

    public static void o(q40 q40Var) {
        org.telegram.ui.pk pkVar = q40Var.E;
        if (q40Var.n0) {
            q40Var.n0 = false;
            pkVar.invalidate();
            pkVar.animate().cancel();
            pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.qj qjVar;
        if (z10 == this.I0) {
            return;
        }
        this.I0 = z10;
        this.H0 = 0L;
        l40 l40Var = this.K0;
        if (z10) {
            bg.k.d().a(30, l40Var);
        } else {
            bg.k.d().f(l40Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        u40 u40Var = this.c;
        if (u40Var == null || (qjVar = ((org.telegram.ui.wi) u40Var).a.a0) == null) {
            return;
        }
        qjVar.setRoundVideoUiFrameClockActive(z10);
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
        n40 n40Var = this.y;
        if (n40Var.isAvailable() && (bitmap = n40Var.getBitmap(org.telegram.messenger.ns.K2, org.telegram.messenger.ns.K2)) != null) {
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
        s40 s40Var = this.a;
        if (s40Var != null) {
            ((org.telegram.ui.ce) s40Var).b.cd.a(z10, true);
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
        o40 o40Var = this.s;
        if (z10 && !this.m0) {
            o40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.y0 = measuredHeight;
            o40Var.setTranslationY(measuredHeight + this.x0);
        }
        this.m0 = z10;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z10 || Math.max(getCurrentDurationMs(), this.w0) <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new k40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.b0 = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(o40Var, (Property<o40, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(o40Var, (Property<o40, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(o40Var, (Property<o40, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(o40Var, (Property<o40, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.k0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.b0.setDuration(180L);
        this.b0.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.b0.addListener(new x5(this, 29));
        }
        this.b0.start();
    }

    public final void C() {
        if (this.E0) {
            this.E0 = false;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 512);
        }
    }

    public final void D() {
        zi.m0 m0Var;
        zi.u0 u0Var = this.R;
        boolean z10 = false;
        boolean z11 = (u0Var == null || u0Var.a != 3 || u0Var.f || this.p0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (m0Var = this.S) != null && m0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        E();
    }

    public final void E() {
        zi.u0 u0Var = this.R;
        int i7 = this.O;
        hi.l2 l2Var = this.H;
        if (u0Var == null || !u0Var.g) {
            if (this.f0 == null) {
                ch0 ch0Var = new ch0(R.raw.roundcamera_flash_on, i7, i7);
                this.f0 = ch0Var;
                ch0Var.setCallback(l2Var);
            }
            l2Var.setImageDrawable(this.f0);
            return;
        }
        if (this.g0 == null) {
            ch0 ch0Var2 = new ch0(R.raw.roundcamera_flash_off, i7, i7);
            this.g0 = ch0Var2;
            ch0Var2.setCallback(l2Var);
        }
        l2Var.setImageDrawable(this.g0);
    }

    public final void F() {
        org.telegram.ui.qj qjVar;
        zi.u0 u0Var = this.R;
        if (u0Var != null) {
            long j3 = u0Var.d;
            if (u0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + u0Var.b) - u0Var.c);
            this.w0 = min;
            this.w.setProgress(min / j3);
            u40 u40Var = this.c;
            if (u40Var == null || (qjVar = ((org.telegram.ui.wi) u40Var).a.a0) == null || !qjVar.R1) {
                return;
            }
            qjVar.Q1 = min;
            lg lgVar = qjVar.Z0;
            if (lgVar != null && lgVar.r) {
                lgVar.h = min;
                lgVar.invalidate();
            }
            ig igVar = qjVar.T1;
            if (igVar != null && igVar.f) {
                if (!igVar.e) {
                    long j10 = igVar.h;
                    if (j10 >= 0) {
                        if (!igVar.c) {
                            igVar.a = ig.b(Math.max(0L, min - j10));
                        }
                        igVar.invalidate();
                    }
                }
                igVar.h = min;
                igVar.a = 1.0f;
                igVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = qjVar.S1;
            if (slideTextView == null || !slideTextView.H || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final void a(boolean z10) {
        zi.v0 v0Var;
        if (x() || (v0Var = this.P) == null || !v0Var.a()) {
            return;
        }
        this.V = null;
        z(z10 ? 0 : 6);
        jy0 jy0Var = this.T;
        if (jy0Var != null) {
            jy0Var.d(true);
        }
        this.T = null;
        MediaController.B().Y(false);
        B(false, false);
    }

    @Override // org.telegram.ui.Components.w40
    public final void b(float f10, int i7) {
        zi.u0 u0Var;
        if (this.P == null || (u0Var = this.R) == null || u0Var.a != 5) {
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
            zi.v0 v0Var = this.P;
            long j3 = (long) (f10 * this.R.b);
            v0Var.getClass();
            zi.v0.v();
            if (v0Var.a0 != 5 || v0Var.W == null) {
                return;
            }
            long j10 = v0Var.K;
            v0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, v0Var.L - 1), j3)));
            v0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.P == null || !x()) {
            zi.v0 v0Var = this.P;
            if (v0Var != null) {
                v0Var.s();
                this.P = null;
            }
        } else {
            this.a0 = true;
            this.P.s();
        }
        jy0 jy0Var = this.T;
        if (jy0Var != null && !this.a0) {
            jy0Var.d(true ^ this.l0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override // org.telegram.ui.Components.w40
    public final void d(boolean z10) {
        c(true);
        o40 o40Var = this.s;
        o40Var.setTranslationX(0.0f);
        this.y0 = 0.0f;
        o40Var.setTranslationY(0.0f + this.x0);
        o40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.w40
    public final boolean f() {
        zi.u0 u0Var = this.R;
        if (u0Var == null) {
            return false;
        }
        int i7 = u0Var.a;
        return i7 == 4 || i7 == 5 || i7 == 6;
    }

    @Override // org.telegram.ui.Components.w40
    public final void g(float f10) {
        float f11 = f10 * 0.5f;
        this.x0 = f11;
        this.s.setTranslationY(this.y0 + f11);
    }

    @Override // org.telegram.ui.Components.w40
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.w40
    public t40 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.w40
    public RectF getCameraRect() {
        n40 n40Var = this.y;
        int[] iArr = this.K;
        n40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], n40Var.getWidth() + r3, n40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.w40
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.w40
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.w40
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.w40
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
                org.telegram.messenger.ns.f(this.f).k(org.telegram.messenger.ns.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.R.a == 3) {
                z(5);
            }
            this.i0 = false;
            this.V = new p40(i10, i11, j3, j10, z10);
            u();
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final void i(dh.c cVar, org.telegram.ui.oi oiVar) {
        LinearLayout linearLayout = this.F;
        fh.g c10 = cVar.c(linearLayout, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void j(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.ns.e4);
        this.l0 = false;
        this.k0 = false;
        this.V = null;
        this.W = false;
        this.h0 = false;
        this.j0 = false;
        this.w0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.pk pkVar = this.E;
        if (!this.n0) {
            if (this.v0 == null) {
                try {
                    this.v0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.v0;
            if (bitmap != null) {
                pkVar.setImageBitmap(bitmap);
            } else {
                pkVar.setImageResource(R.drawable.icplaceholder);
            }
            this.n0 = true;
            pkVar.animate().cancel();
            pkVar.setAlpha(1.0f);
            pkVar.invalidate();
        }
        this.T = new jy0(this.f, this.n);
        this.Q = (zi.t0) aj.e.e.a();
        zi.l0 l0Var = new zi.l0(getContext(), this.y);
        l0Var.c = new File(org.telegram.messenger.t0.h(), "cache");
        l0Var.d = (zi.n0) aj.e.j.a();
        l0Var.e = this.Q;
        l0Var.h = aj.e.h.a();
        l0Var.f = (zi.o0) aj.e.f.a();
        l0Var.g = (zi.q0) aj.e.g.a();
        aj.a aVar = aj.e.i;
        aVar.a();
        l0Var.i = aVar.d;
        ff ffVar = this.L0;
        l0Var.j = ffVar;
        jy0 jy0Var = this.T;
        l0Var.k = jy0Var;
        l0Var.l = new gx(this, 5);
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
        if (ffVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (jy0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new zi.v0(l0Var);
        MediaController.B().Y(true);
        zi.v0 v0Var = this.P;
        v0Var.getClass();
        zi.v0.v();
        if (v0Var.a0 == 1) {
            try {
                v0Var.m.b("start requested");
                v0Var.c(true);
                v0Var.x(2);
                v0Var.l.V(v0Var.U, 0L, v0Var.r);
            } catch (Exception e10) {
                v0Var.h(e10);
            }
        }
        B(true, false);
    }

    @Override // org.telegram.ui.Components.w40
    public final void k() {
        zi.u0 u0Var;
        zi.v0 v0Var = this.P;
        if (v0Var == null || (u0Var = this.R) == null) {
            return;
        }
        int i7 = u0Var.a;
        if (i7 == 3) {
            y();
            return;
        }
        if (i7 == 5) {
            zi.v0.v();
            if (v0Var.a0 != 5 || v0Var.L - v0Var.K >= v0Var.q) {
                return;
            }
            v0Var.Q++;
            v0Var.D = false;
            v0Var.m.b("resume requested: trim=" + v0Var.K + ".." + v0Var.L + ", sourceDurationMs=" + v0Var.I);
            v0Var.t();
            v0Var.x(6);
            v0Var.j.execute(new ai.j(v0Var, v0Var.l(), v0Var.U, v0Var.T, v0Var.V, 17));
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
            o40 o40Var = this.s;
            o40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            o40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
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
        zi.v0 v0Var;
        zi.u0 u0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0 || (v0Var = this.P) == null || (u0Var = this.R) == null) {
            return;
        }
        if (u0Var.a == 3) {
            y();
        } else if (u0Var.e) {
            v0Var.p();
        }
    }

    public final void q() {
        zi.u0 u0Var;
        org.telegram.messenger.g20 g20Var;
        if (this.P == null || (u0Var = this.R) == null || (g20Var = this.U) == null) {
            return;
        }
        long j3 = u0Var.b;
        long max = Math.max(0L, g20Var.a);
        long j10 = this.U.b;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        zi.v0 v0Var = this.P;
        v0Var.getClass();
        zi.v0.v();
        if (v0Var.a0 != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(v0Var.I, max));
        long max3 = Math.max(max2, Math.min(v0Var.I, j3));
        if (max3 - max2 < Math.min(800L, v0Var.I)) {
            return;
        }
        v0Var.K = max2;
        v0Var.L = max3;
        l2.f0 f0Var = v0Var.W;
        if (f0Var != null) {
            f0Var.Z0(5, max2);
        }
        v0Var.d.getClass();
        v0Var.o();
    }

    public final Bitmap r(Bitmap bitmap) {
        n40 n40Var = this.y;
        if (n40Var.getWidth() > 0 && n40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            n40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / n40Var.getWidth();
                float height = bitmap.getHeight() / n40Var.getHeight();
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

    @Override // org.telegram.ui.Components.w40
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override // org.telegram.ui.Components.w40
    public void setIsMessageTransition(boolean z10) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.F.setAlpha(0.0f);
        o40 o40Var = this.s;
        o40Var.setAlpha(0.0f);
        o40Var.setScaleX(0.1f);
        o40Var.setScaleY(0.1f);
        o40Var.setTranslationX(0.0f);
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

    public final org.telegram.messenger.g20 t(File file, long j3, iy0 iy0Var) {
        zi.q0 q0Var;
        org.telegram.messenger.g20 g20Var = new org.telegram.messenger.g20();
        g20Var.a = -1L;
        g20Var.b = -1L;
        g20Var.r = j3;
        g20Var.q = Math.max(1L, iy0Var == null ? file.length() : iy0Var.a);
        g20Var.s = true;
        zi.v0 v0Var = this.P;
        g20Var.n = (v0Var == null || (q0Var = v0Var.u) == null) ? 30 : q0Var.a;
        zi.t0 t0Var = this.Q;
        int i7 = t0Var == null ? 480 : t0Var.a;
        g20Var.h = i7;
        g20Var.k = i7;
        g20Var.i = i7;
        g20Var.l = i7;
        g20Var.o = file.getAbsolutePath();
        if (iy0Var != null) {
            g20Var.w = iy0Var.b;
            g20Var.x = iy0Var.c;
            g20Var.y = iy0Var.d;
            g20Var.z = iy0Var.e;
        }
        return g20Var;
    }

    public final void u() {
        zi.u0 u0Var;
        if (this.V == null || this.W || this.P == null || (u0Var = this.R) == null) {
            return;
        }
        int i7 = u0Var.a;
        if (i7 == 5) {
            q();
        } else if (i7 != 3) {
            return;
        }
        zi.v0 v0Var = this.P;
        boolean z10 = this.k0;
        boolean z11 = !z10;
        v0Var.getClass();
        zi.v0.v();
        int i10 = v0Var.a0;
        boolean z12 = false;
        if (i10 == 3 || i10 == 5) {
            v0Var.m.b("finish requested: state=" + zi.p0.b(v0Var.a0) + ", includeAudio=" + z11 + ", durationMs=" + v0Var.j() + ", trim=" + v0Var.K + ".." + v0Var.L);
            v0Var.B = z11;
            if (v0Var.a0 == 3) {
                v0Var.I = v0Var.j();
                v0Var.A = true;
                v0Var.e();
                v0Var.i.removeCallbacks(v0Var.X);
                v0Var.x(7);
                boolean W = v0Var.l.W();
                v0Var.E = W;
                if (!W) {
                    v0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                v0Var.t();
                v0Var.x(7);
                v0Var.j.execute(new di.ea(v0Var, v0Var.U, v0Var.l() || z10, v0Var.V, z11, v0Var.l() ? 1 : 2, v0Var.T));
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
            this.c0.addUpdateListener(new k40(this, 1));
            this.c0.start();
        }
    }

    public final void w(boolean z10) {
        if (this.o0) {
            this.o0 = false;
            org.telegram.ui.pk pkVar = this.E;
            pkVar.animate().cancel();
            if (z10) {
                pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                pkVar.setAlpha(0.0f);
            }
        }
    }

    public final boolean x() {
        zi.v0 v0Var;
        if (this.V == null || !this.W || (v0Var = this.P) == null) {
            return false;
        }
        zi.v0.v();
        return v0Var.a0 == 7;
    }

    public final void y() {
        zi.u0 u0Var;
        if (this.P == null || (u0Var = this.R) == null || u0Var.a != 3) {
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
        org.telegram.messenger.ns.f(this.f).k(org.telegram.messenger.ns.n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
