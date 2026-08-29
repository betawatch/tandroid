package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bg0 implements cf.a {
    public static final av0 j0 = new av0(new r2(21), new r2(22));
    public static final av0 k0 = new av0(new r2(23), new r2(24));
    public static final bg0 l0 = new bg0();
    public boolean A;
    public ValueAnimator B;
    public com.google.firebase.messaging.u C;
    public int D;
    public int E;
    public float G;
    public float H;
    public o1.k I;
    public o1.k J;
    public Float K;
    public boolean L;
    public eo0 N;
    public int O;
    public int P;
    public mu Q;
    public PhotoViewer R;
    public af.g S;
    public ImageView T;
    public boolean U;
    public float V;
    public float W;
    public lh.z2 X;
    public boolean Y;
    public boolean Z;
    public WindowManager b;
    public boolean b0;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.g d;
    public ag0 e;
    public boolean e0;
    public View f;
    public View g0;
    public ag0 h;
    public TextureView h0;
    public boolean i0;
    public boolean n;
    public mf0 r;
    public ScaleGestureDetector s;
    public o4.g v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float F = 1.0f;
    public final n61 M = new n61(false);
    public final vf0 a0 = new vf0(this, 1);
    public float[] c0 = new float[2];
    public final vf0 d0 = new vf0(this, 2);
    public final vf0 f0 = new vf0(this, 3);

    public static void j(boolean z10) {
        l0.k(z10, false);
    }

    public static hk0 o(float f9, boolean z10) {
        hk0 hk0Var = new hk0();
        float f10 = 1.0f / f9;
        bg0 bg0Var = l0;
        if (bg0Var.L && !z10) {
            hk0Var.a = bg0Var.G;
            hk0Var.b = bg0Var.H + AndroidUtilities.statusBarHeight;
            hk0Var.c = bg0Var.D;
            hk0Var.d = bg0Var.E;
            return hk0Var;
        }
        float f11 = bg0Var.n().a.getFloat("x", -1.0f);
        float f12 = bg0Var.n().a.getFloat("y", -1.0f);
        float f13 = bg0Var.n().a.getFloat("scale_factor", 1.0f);
        hk0Var.c = s(f10) * f13;
        hk0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = hk0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            hk0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            hk0Var.a = (AndroidUtilities.displaySize.x - hk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            hk0Var.b = i7.w.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - hk0Var.d) + AndroidUtilities.statusBarHeight;
            return hk0Var;
        }
        hk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return hk0Var;
    }

    public static af.g p() {
        bg0 bg0Var = l0;
        if (bg0Var != null) {
            return bg0Var.S;
        }
        return null;
    }

    public static int s(float f9) {
        float min;
        float f10;
        if (f9 >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public static void v(boolean z10) {
        bg0 bg0Var = l0;
        n61 n61Var = bg0Var.M;
        n61Var.e(false);
        n61Var.d(!z10);
        n61Var.f(true);
        lh.z2 z2Var = bg0Var.X;
        if (z2Var != null) {
            z2Var.invalidate();
        }
        ag0 ag0Var = bg0Var.h;
        if (ag0Var != null) {
            ag0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        bg0 bg0Var = l0;
        bg0Var.R = photoViewer;
        x61 x61Var = photoViewer.B2;
        af.g gVar = bg0Var.S;
        if (gVar != null) {
            gVar.c();
            bg0Var.S = null;
        }
        if (x61Var != null && df.d.a(photoViewer.y) == 1) {
            af.f fVar = new af.f(photoViewer.y, bg0Var);
            fVar.c = "photo-viewer-pip-" + x61Var.a;
            fVar.e = 1;
            fVar.d = AndroidUtilities.dp(10.0f);
            fVar.j = bg0Var.d;
            fVar.k = bg0Var.g0;
            int i10 = bg0Var.O;
            int i11 = bg0Var.P;
            fVar.h = i10;
            fVar.i = i11;
            fVar.g = x61Var.d;
            fVar.f = true;
            bg0Var.S = fVar.a();
        }
        bg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, mf0 mf0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        mf0 mf0Var2;
        final bg0 bg0Var = l0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            bg0Var.getClass();
            if (df.d.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!bg0Var.L) {
                    return false;
                }
                bg0Var.L = true;
                bg0Var.O = i10;
                bg0Var.P = i11;
                bg0Var.K = null;
                if (mf0Var == null || !mf0Var.x) {
                    bg0Var.r = null;
                } else {
                    bg0Var.r = mf0Var;
                }
                float f9 = bg0Var.n().a.getFloat("x", -1.0f);
                float f10 = bg0Var.n().a.getFloat("y", -1.0f);
                bg0Var.F = bg0Var.n().a.getFloat("scale_factor", 1.0f);
                bg0Var.D = (int) (bg0Var.t() * bg0Var.F);
                bg0Var.E = (int) (bg0Var.r() * bg0Var.F);
                bg0Var.A = false;
                o1.k kVar = new o1.k(bg0Var, j0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.g(bg0Var) { // from class: org.telegram.ui.Components.wf0
                    public final /* synthetic */ bg0 b;

                    {
                        this.b = bg0Var;
                    }

                    @Override // o1.g
                    public final void a(o1.i iVar, boolean z13, float f11, float f12) {
                        switch (i13) {
                            case 0:
                                this.b.n().a.edit().putFloat("x", f11).apply();
                                break;
                            default:
                                this.b.n().a.edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                bg0Var.I = kVar;
                o1.k kVar2 = new o1.k(bg0Var, k0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.g(bg0Var) { // from class: org.telegram.ui.Components.wf0
                    public final /* synthetic */ bg0 b;

                    {
                        this.b = bg0Var;
                    }

                    @Override // o1.g
                    public final void a(o1.i iVar, boolean z13, float f11, float f12) {
                        switch (i12) {
                            case 0:
                                this.b.n().a.edit().putFloat("x", f11).apply();
                                break;
                            default:
                                this.b.n().a.edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                bg0Var.J = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new yf0(bg0Var, i13));
                bg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    bg0Var.s.setStylusScaleEnabled(false);
                }
                bg0Var.v = new o4.g(context, (h20) new zf0(bg0Var, scaledTouchSlop));
                bg0Var.e = new ag0(bg0Var, context, i13);
                org.telegram.ui.g gVar = new org.telegram.ui.g(bg0Var, context, i12);
                bg0Var.d = gVar;
                gVar.addView(bg0Var.e, i7.f6.c(-1.0f, -1));
                ag0 ag0Var = bg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                eg.k1 k1Var = jf.q0.a;
                ag0Var.setOutlineProvider(new jf.p0(0, dp));
                bg0Var.e.setClipToOutline(true);
                bg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gg, false));
                bg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) bg0Var.f.getParent()).removeView(bg0Var.f);
                }
                bg0Var.e.addView(bg0Var.f, i7.f6.c(-1.0f, -1));
                View view2 = new View(context);
                bg0Var.g0 = view2;
                bg0Var.e.addView(view2, i7.f6.c(-1.0f, -1));
                bg0Var.M.n = new o1.a(bg0Var, 9);
                bg0Var.h = new ag0(bg0Var, context, i12);
                ag0 ag0Var2 = bg0Var.h;
                Objects.requireNonNull(ag0Var2);
                bg0Var.N = new eo0(new xb0(ag0Var2, 11), true);
                bg0Var.h.setWillNotDraw(false);
                bg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                bg0Var.h.addView(view3, i7.f6.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.g6.hg;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.g6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new bg.n(16));
                float f11 = 38;
                float f12 = 4;
                bg0Var.h.addView(imageView, i7.f6.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new lh.z1(6, bg0Var, z12));
                bg0Var.h.addView(imageView2, i7.f6.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                bg0Var.T = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), mode);
                bg0Var.T.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                bg0Var.T.setOnClickListener(new u70(bg0Var, i16));
                View view4 = bg0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof mf0);
                bg0Var.n = z13;
                ImageView imageView4 = bg0Var.T;
                if (!z13 || ((mf0Var2 = bg0Var.r) != null && mf0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                bg0Var.h.addView(bg0Var.T, i7.f6.e(38, 38, 17));
                lh.z2 z2Var = new lh.z2(bg0Var, context);
                bg0Var.X = z2Var;
                bg0Var.h.addView(z2Var, i7.f6.c(-1.0f, -1));
                bg0Var.e.addView(bg0Var.h, i7.f6.c(-1.0f, -1));
                bg0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = df.d.b(context, z12);
                bg0Var.c = b10;
                int i17 = bg0Var.D;
                b10.width = i17;
                b10.height = bg0Var.E;
                if (f9 != -1.0f) {
                    float f13 = (i17 / 2.0f) + f9;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    bg0Var.G = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    bg0Var.G = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = bg0Var.c;
                    float a2 = i7.w.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - bg0Var.E);
                    bg0Var.H = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = bg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    bg0Var.H = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = bg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(bg0Var.b, bg0Var.d, layoutParams3);
                if (z11) {
                    bg0Var.b.addView(bg0Var.d, bg0Var.c);
                    return true;
                }
                bg0Var.d.setAlpha(0.0f);
                bg0Var.d.setScaleX(0.1f);
                bg0Var.d.setScaleY(0.1f);
                bg0Var.b.addView(bg0Var.d, bg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(jr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(bg0Var.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(bg0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(bg0Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!bg0Var.L) {
        }
    }

    @Override // cf.a
    public final void a(c2.p pVar) {
        af.g gVar = this.S;
        if (gVar != null && gVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.S.h.a.width();
            this.D = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.S.h.a.height();
            this.E = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.i0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.R;
        if ((photoViewer != null ? photoViewer.B2 : null) == null) {
            return;
        }
        photoViewer.L8 = pVar;
    }

    @Override // cf.a
    public final Bitmap b() {
        TextureView textureView = this.h0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.h0.getBitmap();
    }

    @Override // cf.a
    public final Bitmap d() {
        TextureView textureView;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (textureView = photoViewer.s3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.R.s3.getBitmap();
    }

    @Override // cf.a
    public final void e(c2.p pVar) {
        PhotoViewer photoViewer = this.R;
        if (photoViewer != null && photoViewer.B2 != null) {
            photoViewer.L8 = pVar;
        }
        this.b.removeView(this.d);
        this.i0 = true;
        this.d.invalidate();
    }

    @Override // cf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.R;
        return photoViewer != null && photoViewer.g();
    }

    @Override // cf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.h0 = textureView;
        textureView.setVisibility(4);
        this.h0.setOpaque(false);
        this.h0.setSurfaceTextureListener(new gh.h(this, 2));
        return this.h0;
    }

    public final void i() {
        org.telegram.ui.gs0 gs0Var;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || (gs0Var = photoViewer.Y3) == null) {
            return;
        }
        gs0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (this.e0) {
            AndroidUtilities.cancelRunOnUIThread(this.f0);
            this.e0 = false;
        }
        o1.k kVar = this.I;
        if (kVar != null) {
            kVar.c();
            this.J.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new vf0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(jr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new xf0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        x61 x61Var = this.R.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.o();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        x61 x61Var = this.R.B2;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    public final com.google.firebase.messaging.u n() {
        if (this.C == null) {
            Point point = AndroidUtilities.displaySize;
            this.C = new com.google.firebase.messaging.u(point.x, point.y);
        }
        return this.C;
    }

    public final float q() {
        if (this.K == null) {
            this.K = Float.valueOf(this.P / this.O);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f9 = this.K.floatValue() < 1.0f ? 0.6f : 0.45f;
            n61 n61Var = this.M;
            n61Var.q = f9;
            n61Var.a();
        }
        return this.K.floatValue();
    }

    public final int r() {
        return (int) (s(r0) * q());
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.g gVar = this.d;
            if (gVar != null && gVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.X = null;
        this.f = null;
        this.R = null;
        af.g gVar2 = this.S;
        if (gVar2 != null) {
            gVar2.c();
            this.S = null;
        }
        this.r = null;
        this.Q = null;
        this.y = null;
        this.w = false;
        this.L = false;
        this.Y = false;
        this.b0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.d0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.B = duration;
        duration.setInterpolator(jr.f);
        this.B.addUpdateListener(new d70(this, 3));
        this.B.addListener(new xf0(this, 0));
        this.B.start();
    }

    public final void z() {
        boolean z10;
        PhotoViewer photoViewer = this.R;
        if (photoViewer == null || this.T == null) {
            return;
        }
        mf0 mf0Var = this.r;
        if (mf0Var != null) {
            z10 = mf0Var.C;
        } else {
            x61 x61Var = photoViewer.B2;
            if (x61Var == null) {
                return;
            } else {
                z10 = x61Var.z();
            }
        }
        vf0 vf0Var = this.a0;
        AndroidUtilities.cancelRunOnUIThread(vf0Var);
        if (z10) {
            this.T.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(vf0Var, 500L);
        } else if (this.U) {
            this.T.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.T.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // cf.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // cf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
