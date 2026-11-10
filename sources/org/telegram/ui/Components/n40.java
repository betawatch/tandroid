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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n40 extends t40 {
    public static final /* synthetic */ int L0 = 0;
    public int A0;
    public int B0;
    public boolean C0;
    public final org.telegram.ui.rk D;
    public boolean D0;
    public final LinearLayout E;
    public float E0;
    public final fi.n2 F;
    public int F0;
    public final fi.n2 G;
    public long G0;
    public final ImageView H;
    public boolean H0;
    public final fi.p2 I;
    public boolean I0;
    public final int[] J;
    public final i40 J0;
    public final Matrix K;
    public final qt K0;
    public final float[] L;
    public final Paint M;
    public final int N;
    public wi.t0 O;
    public wi.r0 P;
    public wi.s0 Q;
    public wi.l0 R;
    public hy0 S;
    public org.telegram.messenger.j20 T;
    public m40 U;
    public boolean V;
    public boolean W;
    public AnimatorSet a0;
    public ValueAnimator b0;
    public ValueAnimator c0;
    public final zg0 d0;
    public final b40 e;
    public zg0 e0;
    public final int f;
    public zg0 f0;
    public boolean g0;
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
    public final l40 s;
    public long s0;
    public int t0;
    public Bitmap u0;
    public long v0;
    public final fk0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final k40 y;
    public float y0;
    public float z0;

    public n40(Activity activity, b40 b40Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f = org.telegram.messenger.p10.s0;
        int i7 = 2;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        final int i10 = 0;
        this.J0 = new i40(this, 0);
        this.K0 = new qt(this, i7);
        this.e = b40Var;
        this.h = b40Var.getClassGuid();
        this.n = b40Var.z();
        this.r = b40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.o = 0.5f;
        p2Var.n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.b, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        l40 l40Var = new l40(this, activity);
        this.s = l40Var;
        fk0 fk0Var = new fk0(activity);
        this.w = fk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        k40 k40Var = new k40(i10, activity, this);
        final int i11 = 1;
        k40Var.setOpaque(true);
        k40Var.setClickable(true);
        k40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        k40Var.setOutlineProvider(new bg.q0(12));
        k40Var.setClipToOutline(true);
        this.y = k40Var;
        frameLayout.addView(k40Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, activity, paint);
        this.D = rkVar;
        rkVar.setOutlineProvider(new bg.q0(11));
        rkVar.setClipToOutline(true);
        frameLayout.addView(rkVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        l40Var.addView(fk0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        int i12 = org.telegram.messenger.g0.v;
        addView(l40Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(p2Var.c, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        fi.n2 n2Var = new fi.n2(activity);
        this.F = n2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var.setScaleType(scaleType);
        n2Var.setContentDescription(org.telegram.messenger.id.M0(2131754752, null));
        linearLayout.addView(n2Var, c8.ha.o(44, 44));
        n2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j40
            public final /* synthetic */ n40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i13;
                switch (i10) {
                    case 0:
                        n40 n40Var = this.b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.a == 3 && !s0Var.f && !n40Var.o0) {
                            wi.m0 m0Var = l0Var.a;
                            wi.m0 m0Var2 = wi.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i14 = t0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (t0Var.r != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.a0));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.n;
                                        if (!kVar.U || handler == null) {
                                            z9 = false;
                                        } else {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        }
                                        t0Var.y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.d0.M(0);
                                n40Var.d0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        n40 n40Var2 = this.b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.g;
                            wi.k kVar2 = t0Var2.l;
                            wi.t0.v();
                            if (t0Var2.a0 == 3 && !t0Var2.y && (i13 = t0Var2.b0) != 1) {
                                t0Var2.w = z10;
                                if (i13 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                n40Var2.E();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        fi.n2 n2Var2 = new fi.n2(activity);
        this.G = n2Var2;
        n2Var2.setScaleType(scaleType);
        linearLayout.addView(n2Var2, c8.ha.o(44, 44));
        n2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j40
            public final /* synthetic */ n40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i13;
                switch (i11) {
                    case 0:
                        n40 n40Var = this.b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.a == 3 && !s0Var.f && !n40Var.o0) {
                            wi.m0 m0Var = l0Var.a;
                            wi.m0 m0Var2 = wi.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i14 = t0Var.a0;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (t0Var.r != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.a0));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.a0;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.n;
                                        if (!kVar.U || handler == null) {
                                            z9 = false;
                                        } else {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        }
                                        t0Var.y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.d0.M(0);
                                n40Var.d0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        n40 n40Var2 = this.b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.g;
                            wi.k kVar2 = t0Var2.l;
                            wi.t0.v();
                            if (t0Var2.a0 == 3 && !t0Var2.y && (i13 = t0Var2.b0) != 1) {
                                t0Var2.w = z10;
                                if (i13 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                n40Var2.E();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.N = L;
        zg0 zg0Var = new zg0(R.raw.roundcamera_flip, L, L);
        this.d0 = zg0Var;
        zg0Var.setCallback(n2Var);
        zg0Var.M(zg0Var.e[0] - 1);
        n2Var.setImageDrawable(zg0Var);
        E();
        if (h6Var != null && !h6Var.a()) {
            n2Var.setInvert(0.6f);
            n2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.H = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ha.e(48, 48, 17));
        k40Var.setOnTouchListener(new yj(this, i7));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.s0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var == null || (s0Var = this.Q) == null) {
            return 0L;
        }
        return s0Var.a == 3 ? t0Var.j() : s0Var.b;
    }

    public static void n(n40 n40Var) {
        if (n40Var.o0 && n40Var.r0 && n40Var.p0 && n40Var.q0) {
            n40Var.o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + n40Var.getCameraFlipElapsedMs());
            n40Var.D();
        }
    }

    public static void o(n40 n40Var) {
        org.telegram.ui.rk rkVar = n40Var.D;
        if (n40Var.m0) {
            n40Var.m0 = false;
            rkVar.invalidate();
            rkVar.animate().cancel();
            rkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.sj sjVar;
        if (z9 == this.H0) {
            return;
        }
        this.H0 = z9;
        this.G0 = 0L;
        i40 i40Var = this.J0;
        if (z9) {
            bg.k.d().a(30, i40Var);
        } else {
            bg.k.d().f(i40Var);
        }
        if (this.d == z9) {
            return;
        }
        this.d = z9;
        r40 r40Var = this.c;
        if (r40Var == null || (sjVar = ((org.telegram.ui.yi) r40Var).a.Z) == null) {
            return;
        }
        sjVar.setRoundVideoUiFrameClockActive(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.p2 p2Var = this.I;
        if (z9) {
            if (Float.isNaN(this.E0)) {
                this.E0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            p2Var.c(null);
        } else {
            if (!Float.isNaN(this.E0)) {
                attributes.screenBrightness = this.E0;
                this.E0 = Float.NaN;
            }
            p2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z9) {
        Bitmap bitmap;
        k40 k40Var = this.y;
        if (k40Var.isAvailable() && (bitmap = k40Var.getBitmap(org.telegram.messenger.qs.K2, org.telegram.messenger.qs.K2)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.u0;
                    this.u0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z9) {
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
                    if (bitmap != this.u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.u0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void B(boolean z9, boolean z10) {
        p40 p40Var = this.a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).b.bd.a(z9, true);
        }
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        l40 l40Var = this.s;
        if (z9 && !this.l0) {
            l40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.x0 = measuredHeight;
            l40Var.setTranslationY(measuredHeight + this.w0);
        }
        this.l0 = z9;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z9 || Math.max(getCurrentDurationMs(), this.v0) <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 1.0f : 0.0f, z9 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new h40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a0 = animatorSet2;
        float[] fArr = {z9 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) property, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.SCALE_X, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.SCALE_Y, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.H, (Property<ImageView, Float>) property, (this.j0 && z9) ? 1.0f : 0.0f), ofFloat);
        this.a0.setDuration(180L);
        this.a0.setInterpolator(new DecelerateInterpolator());
        if (z9) {
            setTranslationX(0.0f);
        } else {
            this.a0.addListener(new y5(this, 29));
        }
        this.a0.start();
    }

    public final void C() {
        if (this.D0) {
            this.D0 = false;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 512);
        }
    }

    public final void D() {
        wi.l0 l0Var;
        wi.s0 s0Var = this.Q;
        boolean z9 = false;
        boolean z10 = (s0Var == null || s0Var.a != 3 || s0Var.f || this.o0) ? false : true;
        this.F.setEnabled(z10);
        if (z10 && (l0Var = this.R) != null && l0Var.b != 1) {
            z9 = true;
        }
        this.G.setEnabled(z9);
        E();
    }

    public final void E() {
        wi.s0 s0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (s0Var == null || !s0Var.g) {
            if (this.e0 == null) {
                zg0 zg0Var = new zg0(R.raw.roundcamera_flash_on, i7, i7);
                this.e0 = zg0Var;
                zg0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.e0);
            return;
        }
        if (this.f0 == null) {
            zg0 zg0Var2 = new zg0(R.raw.roundcamera_flash_off, i7, i7);
            this.f0 = zg0Var2;
            zg0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.f0);
    }

    public final void F() {
        org.telegram.ui.sj sjVar;
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.b) - s0Var.c);
            this.v0 = min;
            this.w.setProgress(min / j3);
            r40 r40Var = this.c;
            if (r40Var == null || (sjVar = ((org.telegram.ui.yi) r40Var).a.Z) == null || !sjVar.j1) {
                return;
            }
            sjVar.i1 = min;
            eg egVar = sjVar.Y0;
            if (egVar != null && egVar.r) {
                egVar.h = min;
                egVar.invalidate();
            }
            bg bgVar = sjVar.l1;
            if (bgVar != null && bgVar.n) {
                if (!bgVar.h) {
                    long j10 = bgVar.r;
                    if (j10 >= 0) {
                        if (!bgVar.e) {
                            long max = Math.max(0L, min - j10) % 1200;
                            bgVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        bgVar.invalidate();
                    }
                }
                bgVar.r = min;
                bgVar.a = 1.0f;
                bgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = sjVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void a(boolean z9) {
        wi.t0 t0Var;
        if (x() || (t0Var = this.O) == null || !t0Var.a()) {
            return;
        }
        this.U = null;
        z(z9 ? 0 : 6);
        hy0 hy0Var = this.S;
        if (hy0Var != null) {
            hy0Var.d(true);
        }
        this.S = null;
        MediaController.B().Y(false);
        B(false, false);
    }

    @Override // org.telegram.ui.Components.t40
    public final void b(float f10, int i7) {
        wi.s0 s0Var;
        if (this.O == null || (s0Var = this.Q) == null || s0Var.a != 5) {
            return;
        }
        q();
        if (i7 == 0) {
            this.O.r();
            return;
        }
        if (i7 == 1) {
            this.O.p();
            return;
        }
        if (i7 == 2) {
            wi.t0 t0Var = this.O;
            long j3 = (long) (f10 * this.Q.b);
            t0Var.getClass();
            wi.t0.v();
            if (t0Var.a0 != 5 || t0Var.W == null) {
                return;
            }
            long j10 = t0Var.K;
            t0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, t0Var.L - 1), j3)));
            t0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void c(boolean z9) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.O == null || !x()) {
            wi.t0 t0Var = this.O;
            if (t0Var != null) {
                t0Var.s();
                this.O = null;
            }
        } else {
            this.W = true;
            this.O.s();
        }
        hy0 hy0Var = this.S;
        if (hy0Var != null && !this.W) {
            hy0Var.d(true ^ this.k0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override // org.telegram.ui.Components.t40
    public final void d(boolean z9) {
        c(true);
        l40 l40Var = this.s;
        l40Var.setTranslationX(0.0f);
        this.x0 = 0.0f;
        l40Var.setTranslationY(0.0f + this.w0);
        l40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.t40
    public final boolean f() {
        wi.s0 s0Var = this.Q;
        if (s0Var == null) {
            return false;
        }
        int i7 = s0Var.a;
        return i7 == 4 || i7 == 5 || i7 == 6;
    }

    @Override // org.telegram.ui.Components.t40
    public final void g(float f10) {
        float f11 = f10 * 0.5f;
        this.w0 = f11;
        this.s.setTranslationY(this.x0 + f11);
    }

    @Override // org.telegram.ui.Components.t40
    public View getButtonsLayout() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.t40
    public q40 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.t40
    public RectF getCameraRect() {
        k40 k40Var = this.y;
        int[] iArr = this.J;
        k40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], k40Var.getWidth() + r3, k40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.t40
    public View getMuteImageView() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.t40
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.t40
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.t40
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O == null || this.Q == null) {
            return;
        }
        if (i7 == 3) {
            y();
            return;
        }
        if ((i7 == 1 || i7 == 4) && this.U == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                org.telegram.messenger.qs.f(this.f).k(org.telegram.messenger.qs.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.Q.a == 3) {
                z(5);
            }
            this.h0 = false;
            this.U = new m40(i10, i11, j3, j10, z9);
            u();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void i(dh.c cVar, org.telegram.ui.qi qiVar) {
        LinearLayout linearLayout = this.E;
        fh.g c10 = cVar.c(linearLayout, qiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.t40
    public final void j(boolean z9) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.qs.e4);
        this.k0 = false;
        this.j0 = false;
        this.U = null;
        this.V = false;
        this.g0 = false;
        this.i0 = false;
        this.v0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.rk rkVar = this.D;
        if (!this.m0) {
            if (this.u0 == null) {
                try {
                    this.u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.u0;
            if (bitmap != null) {
                rkVar.setImageBitmap(bitmap);
            } else {
                rkVar.setImageResource(R.drawable.icplaceholder);
            }
            this.m0 = true;
            rkVar.animate().cancel();
            rkVar.setAlpha(1.0f);
            rkVar.invalidate();
        }
        this.S = new hy0(this.f, this.n);
        this.P = (wi.r0) xi.e.e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.y);
        k0Var.c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.j.a();
        k0Var.e = this.P;
        k0Var.h = xi.e.h.a();
        k0Var.f = (wi.n0) xi.e.f.a();
        k0Var.g = (wi.o0) xi.e.g.a();
        xi.a aVar = xi.e.i;
        aVar.a();
        k0Var.i = aVar.d;
        qt qtVar = this.K0;
        k0Var.j = qtVar;
        hy0 hy0Var = this.S;
        k0Var.k = hy0Var;
        k0Var.l = new ax(this, 5);
        if (k0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (k0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (k0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (k0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (k0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (qtVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (hy0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.O = new wi.t0(k0Var);
        MediaController.B().Y(true);
        wi.t0 t0Var = this.O;
        t0Var.getClass();
        wi.t0.v();
        if (t0Var.a0 == 1) {
            try {
                t0Var.m.b("start requested");
                t0Var.c(true);
                t0Var.x(2);
                t0Var.l.V(t0Var.U, 0L, t0Var.r);
            } catch (Exception e10) {
                t0Var.h(e10);
            }
        }
        B(true, false);
    }

    @Override // org.telegram.ui.Components.t40
    public final void k() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var == null || (s0Var = this.Q) == null) {
            return;
        }
        int i7 = s0Var.a;
        if (i7 == 3) {
            y();
            return;
        }
        if (i7 == 5) {
            wi.t0.v();
            if (t0Var.a0 != 5 || t0Var.L - t0Var.K >= t0Var.q) {
                return;
            }
            t0Var.Q++;
            t0Var.D = false;
            t0Var.m.b("resume requested: trim=" + t0Var.K + ".." + t0Var.L + ", sourceDurationMs=" + t0Var.I);
            t0Var.t();
            t0Var.x(6);
            t0Var.j.execute(new fi.q1(t0Var, t0Var.l(), t0Var.U, t0Var.T, t0Var.V));
            this.T = null;
            this.h0 = true;
            this.i0 = false;
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
        if (this.F0 != i11) {
            this.F0 = i11;
            l40 l40Var = this.s;
            l40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            l40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        fi.p2 p2Var = this.I;
        p2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        wi.t0 t0Var;
        wi.s0 s0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0 || (t0Var = this.O) == null || (s0Var = this.Q) == null) {
            return;
        }
        if (s0Var.a == 3) {
            y();
        } else if (s0Var.e) {
            t0Var.p();
        }
    }

    public final void q() {
        wi.s0 s0Var;
        org.telegram.messenger.j20 j20Var;
        if (this.O == null || (s0Var = this.Q) == null || (j20Var = this.T) == null) {
            return;
        }
        long j3 = s0Var.b;
        long max = Math.max(0L, j20Var.a);
        long j10 = this.T.b;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        wi.t0 t0Var = this.O;
        t0Var.getClass();
        wi.t0.v();
        if (t0Var.a0 != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(t0Var.I, max));
        long max3 = Math.max(max2, Math.min(t0Var.I, j3));
        if (max3 - max2 < Math.min(800L, t0Var.I)) {
            return;
        }
        t0Var.K = max2;
        t0Var.L = max3;
        l2.i0 i0Var = t0Var.W;
        if (i0Var != null) {
            i0Var.Z0(5, max2);
        }
        t0Var.d.getClass();
        t0Var.o();
    }

    public final Bitmap r(Bitmap bitmap) {
        k40 k40Var = this.y;
        if (k40Var.getWidth() > 0 && k40Var.getHeight() > 0) {
            Matrix matrix = this.K;
            k40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / k40Var.getWidth();
                float height = bitmap.getHeight() / k40Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void s() {
        if (this.o0 || this.c0 != null) {
            this.t0++;
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
                this.c0 = null;
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.o0 = false;
            this.p0 = false;
            this.q0 = false;
            this.r0 = false;
            w(false);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override // org.telegram.ui.Components.t40
    public void setIsMessageTransition(boolean z9) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        l40 l40Var = this.s;
        l40Var.setAlpha(0.0f);
        l40Var.setScaleX(0.1f);
        l40Var.setScaleY(0.1f);
        l40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
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

    public final org.telegram.messenger.j20 t(File file, long j3, gy0 gy0Var) {
        wi.o0 o0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.a = -1L;
        j20Var.b = -1L;
        j20Var.r = j3;
        j20Var.q = Math.max(1L, gy0Var == null ? file.length() : gy0Var.a);
        j20Var.s = true;
        wi.t0 t0Var = this.O;
        j20Var.n = (t0Var == null || (o0Var = t0Var.u) == null) ? 30 : o0Var.a;
        wi.r0 r0Var = this.P;
        int i7 = r0Var == null ? 480 : r0Var.a;
        j20Var.h = i7;
        j20Var.k = i7;
        j20Var.i = i7;
        j20Var.l = i7;
        j20Var.o = file.getAbsolutePath();
        if (gy0Var != null) {
            j20Var.w = gy0Var.b;
            j20Var.x = gy0Var.c;
            j20Var.y = gy0Var.d;
            j20Var.z = gy0Var.e;
        }
        return j20Var;
    }

    public final void u() {
        wi.s0 s0Var;
        if (this.U == null || this.V || this.O == null || (s0Var = this.Q) == null) {
            return;
        }
        int i7 = s0Var.a;
        if (i7 == 5) {
            q();
        } else if (i7 != 3) {
            return;
        }
        wi.t0 t0Var = this.O;
        boolean z9 = this.j0;
        boolean z10 = !z9;
        t0Var.getClass();
        wi.t0.v();
        int i10 = t0Var.a0;
        boolean z11 = false;
        if (i10 == 3 || i10 == 5) {
            t0Var.m.b("finish requested: state=" + rf.b.u(t0Var.a0) + ", includeAudio=" + z10 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.K + ".." + t0Var.L);
            t0Var.B = z10;
            if (t0Var.a0 == 3) {
                t0Var.I = t0Var.j();
                t0Var.A = true;
                t0Var.e();
                t0Var.i.removeCallbacks(t0Var.X);
                t0Var.x(7);
                boolean W = t0Var.l.W();
                t0Var.E = W;
                if (!W) {
                    t0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                t0Var.t();
                t0Var.x(7);
                t0Var.j.execute(new bi.sb(t0Var, t0Var.U, t0Var.l() || z9, t0Var.V, z10, t0Var.l() ? 1 : 2, t0Var.T));
            }
            z11 = true;
        }
        this.V = z11;
    }

    public final void v() {
        if (this.C0) {
            this.C0 = false;
            this.A0 = -1;
            this.B0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, 0.0f);
            this.b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.b0.addUpdateListener(new h40(this, 1));
            this.b0.start();
        }
    }

    public final void w(boolean z9) {
        if (this.n0) {
            this.n0 = false;
            org.telegram.ui.rk rkVar = this.D;
            rkVar.animate().cancel();
            if (z9) {
                rkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                rkVar.setAlpha(0.0f);
            }
        }
    }

    public final boolean x() {
        wi.t0 t0Var;
        if (this.U == null || !this.V || (t0Var = this.O) == null) {
            return false;
        }
        wi.t0.v();
        return t0Var.a0 == 7;
    }

    public final void y() {
        wi.s0 s0Var;
        if (this.O == null || (s0Var = this.Q) == null || s0Var.a != 3) {
            return;
        }
        z(2);
        this.O.q();
    }

    public final void z(int i7) {
        if (this.i0 && i7 == 2) {
            return;
        }
        this.i0 = true;
        org.telegram.messenger.qs.f(this.f).k(org.telegram.messenger.qs.n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
