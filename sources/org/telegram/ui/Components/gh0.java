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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gh0 implements sf.a {
    public static final lw0 n0 = new lw0(new fe0(2), new fe0(3));
    public static final lw0 o0 = new lw0(new fe0(4), new fe0(5));
    public static final gh0 p0 = new gh0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.u G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public pp0 R;
    public int S;
    public int T;
    public lv U;
    public PhotoViewer V;
    public qf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public ai.o4 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public fh0 e;
    public View f;
    public boolean f0;
    public fh0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public sg0 r;
    public ScaleGestureDetector s;
    public k2.g0 v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final b81 Q = new b81(false);
    public final bh0 e0 = new bh0(this, 1);
    public float[] g0 = new float[2];
    public final bh0 h0 = new bh0(this, 2);
    public final bh0 j0 = new bh0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static ml0 o(float f7, boolean z10) {
        ml0 ml0Var = new ml0();
        float f10 = 1.0f / f7;
        gh0 gh0Var = p0;
        if (gh0Var.P && !z10) {
            ml0Var.a = gh0Var.K;
            ml0Var.b = gh0Var.L + AndroidUtilities.statusBarHeight;
            ml0Var.c = gh0Var.H;
            ml0Var.d = gh0Var.I;
            return ml0Var;
        }
        float f11 = gh0Var.n().a.getFloat("x", -1.0f);
        float f12 = gh0Var.n().a.getFloat("y", -1.0f);
        float f13 = gh0Var.n().a.getFloat("scale_factor", 1.0f);
        ml0Var.c = s(f10) * f13;
        ml0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = ml0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            ml0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            ml0Var.a = (AndroidUtilities.displaySize.x - ml0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            ml0Var.b = w7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - ml0Var.d) + AndroidUtilities.statusBarHeight;
            return ml0Var;
        }
        ml0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return ml0Var;
    }

    public static qf.e p() {
        gh0 gh0Var = p0;
        if (gh0Var != null) {
            return gh0Var.W;
        }
        return null;
    }

    public static int s(float f7) {
        float min;
        float f10;
        if (f7 >= 1.0f) {
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
        gh0 gh0Var = p0;
        b81 b81Var = gh0Var.Q;
        b81Var.e(false);
        b81Var.d(!z10);
        b81Var.f(true);
        ai.o4 o4Var = gh0Var.b0;
        if (o4Var != null) {
            o4Var.invalidate();
        }
        fh0 fh0Var = gh0Var.h;
        if (fh0Var != null) {
            fh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        gh0 gh0Var = p0;
        gh0Var.V = photoViewer;
        k81 k81Var = photoViewer.F2;
        qf.e eVar = gh0Var.W;
        if (eVar != null) {
            eVar.c();
            gh0Var.W = null;
        }
        if (k81Var != null && tf.c.a(photoViewer.y) == 1) {
            qf.d dVar = new qf.d(photoViewer.y, gh0Var);
            dVar.c = "photo-viewer-pip-" + k81Var.a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.j = gh0Var.d;
            dVar.k = gh0Var.k0;
            int i10 = gh0Var.S;
            int i11 = gh0Var.T;
            dVar.h = i10;
            dVar.i = i11;
            dVar.g = k81Var.d;
            dVar.f = true;
            gh0Var.W = dVar.a();
        }
        gh0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, sg0 sg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        sg0 sg0Var2;
        final gh0 gh0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            gh0Var.getClass();
            if (tf.c.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!gh0Var.P) {
                    return false;
                }
                gh0Var.P = true;
                gh0Var.S = i10;
                gh0Var.T = i11;
                gh0Var.O = null;
                if (sg0Var == null || !sg0Var.x) {
                    gh0Var.r = null;
                } else {
                    gh0Var.r = sg0Var;
                }
                float f7 = gh0Var.n().a.getFloat("x", -1.0f);
                float f10 = gh0Var.n().a.getFloat("y", -1.0f);
                gh0Var.J = gh0Var.n().a.getFloat("scale_factor", 1.0f);
                gh0Var.H = (int) (gh0Var.t() * gh0Var.J);
                gh0Var.I = (int) (gh0Var.r() * gh0Var.J);
                gh0Var.E = false;
                o1.k kVar = new o1.k(gh0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(gh0Var) { // from class: org.telegram.ui.Components.ch0
                    public final /* synthetic */ gh0 b;

                    {
                        this.b = gh0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
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
                gh0Var.M = kVar;
                o1.k kVar2 = new o1.k(gh0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(gh0Var) { // from class: org.telegram.ui.Components.ch0
                    public final /* synthetic */ gh0 b;

                    {
                        this.b = gh0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
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
                gh0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new lg.b(gh0Var, i12));
                gh0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                gh0Var.s.setStylusScaleEnabled(false);
                gh0Var.v = new k2.g0(context, new eh0(gh0Var, scaledTouchSlop));
                gh0Var.e = new fh0(gh0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(gh0Var, context, i12);
                gh0Var.d = fVar;
                fVar.addView(gh0Var.e, w7.x5.d(-1.0f, -1));
                fh0 fh0Var = gh0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ai.l2 l2Var = yf.i0.a;
                fh0Var.setOutlineProvider(new yf.h0(0, dp));
                gh0Var.e.setClipToOutline(true);
                gh0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gg, false));
                gh0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) gh0Var.f.getParent()).removeView(gh0Var.f);
                }
                gh0Var.e.addView(gh0Var.f, w7.x5.d(-1.0f, -1));
                View view2 = new View(context);
                gh0Var.k0 = view2;
                gh0Var.e.addView(view2, w7.x5.d(-1.0f, -1));
                gh0Var.Q.n = new m.f3(gh0Var, 8);
                gh0Var.h = new fh0(gh0Var, context, i12);
                fh0 fh0Var2 = gh0Var.h;
                Objects.requireNonNull(fh0Var2);
                gh0Var.R = new pp0(new bd0(fh0Var2, 11), true);
                gh0Var.h.setWillNotDraw(false);
                gh0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                gh0Var.h.addView(view3, w7.x5.d(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.i6.hg;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(x02, mode);
                int i15 = org.telegram.ui.ActionBar.i6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ai.e2(12));
                float f11 = 38;
                float f12 = 4;
                gh0Var.h.addView(imageView, w7.x5.a(f11, 0.0f, f12, f12, 0.0f, 38, 5));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ai.k3(6, gh0Var, z12));
                gh0Var.h.addView(imageView2, w7.x5.a(f11, 0.0f, f12, 48, 0.0f, 38, 5));
                ImageView imageView3 = new ImageView(context);
                gh0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i14, false), mode);
                gh0Var.X.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i15, false), 1, -1));
                gh0Var.X.setOnClickListener(new b90(gh0Var, 7));
                View view4 = gh0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof sg0);
                gh0Var.n = z13;
                gh0Var.X.setVisibility((!z13 || ((sg0Var2 = gh0Var.r) != null && sg0Var2.x)) ? 0 : 8);
                gh0Var.h.addView(gh0Var.X, w7.x5.e(38, 38, 17));
                ai.o4 o4Var = new ai.o4(gh0Var, context);
                gh0Var.b0 = o4Var;
                gh0Var.h.addView(o4Var, w7.x5.d(-1.0f, -1));
                gh0Var.e.addView(gh0Var.h, w7.x5.d(-1.0f, -1));
                gh0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = tf.c.b(context, z12);
                gh0Var.c = b10;
                int i16 = gh0Var.H;
                b10.width = i16;
                b10.height = gh0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    gh0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
                    gh0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = gh0Var.c;
                    float a2 = w7.o.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - gh0Var.I);
                    gh0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = gh0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    gh0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = gh0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(gh0Var.b, gh0Var.d, layoutParams3);
                if (z11) {
                    gh0Var.b.addView(gh0Var.d, gh0Var.c);
                    return true;
                }
                gh0Var.d.setAlpha(0.0f);
                gh0Var.d.setScaleX(0.1f);
                gh0Var.d.setScaleY(0.1f);
                gh0Var.b.addView(gh0Var.d, gh0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(hs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(gh0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(gh0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(gh0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!gh0Var.P) {
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        qf.e eVar = this.W;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.W.h.a.width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.W.h.a.height();
            this.I = height;
            layoutParams2.height = height;
        }
        this.b.addView(this.d, this.c);
        this.m0 = false;
        this.d.invalidate();
        PhotoViewer photoViewer = this.V;
        if ((photoViewer != null ? photoViewer.F2 : null) == null) {
            return;
        }
        photoViewer.Q8 = pVar;
    }

    @Override // sf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // sf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // sf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // sf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new ki.d(this, 2));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.kt0 kt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (kt0Var = photoViewer.c4) == null) {
            return;
        }
        kt0Var.cancelRewind();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (this.i0) {
            AndroidUtilities.cancelRunOnUIThread(this.j0);
            this.i0 = false;
        }
        o1.k kVar = this.M;
        if (kVar != null) {
            kVar.c();
            this.N.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new bh0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(hs.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new dh0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        k81 k81Var = this.V.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        k81 k81Var = this.V.F2;
        if (k81Var == null) {
            return 0L;
        }
        return k81Var.p();
    }

    public final com.google.firebase.messaging.u n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.u(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            b81 b81Var = this.Q;
            b81Var.q = f7;
            b81Var.a();
        }
        return this.O.floatValue();
    }

    public final int r() {
        return (int) (s(r0) * q());
    }

    public final int t() {
        return s(q());
    }

    public final void u() {
        try {
            org.telegram.ui.f fVar = this.d;
            if (fVar != null && fVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.b0 = null;
        this.f = null;
        this.V = null;
        qf.e eVar = this.W;
        if (eVar != null) {
            eVar.c();
            this.W = null;
        }
        this.r = null;
        this.U = null;
        this.y = null;
        this.w = false;
        this.P = false;
        this.c0 = false;
        this.f0 = false;
        i();
        AndroidUtilities.cancelRunOnUIThread(this.h0);
    }

    public final void y(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.F = duration;
        duration.setInterpolator(hs.f);
        this.F.addUpdateListener(new j80(this, 4));
        this.F.addListener(new dh0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        sg0 sg0Var = this.r;
        if (sg0Var != null) {
            y3 = sg0Var.G;
        } else {
            k81 k81Var = photoViewer.F2;
            if (k81Var == null) {
                return;
            } else {
                y3 = k81Var.y();
            }
        }
        bh0 bh0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(bh0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(bh0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
