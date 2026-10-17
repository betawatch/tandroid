package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class zg0 implements tf.a {
    public static final cw0 n0 = new cw0(new k2(28), new k2(29));
    public static final cw0 o0 = new cw0(new tg0(0), new tg0(1));
    public static final zg0 p0 = new zg0();
    public boolean E;
    public ValueAnimator F;
    public k0.b G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public gp0 R;
    public int S;
    public int T;
    public cv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public ci.i3 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public yg0 e;
    public View f;
    public boolean f0;
    public yg0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public kg0 r;
    public ScaleGestureDetector s;
    public le.b v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final r71 Q = new r71(false);
    public final ug0 e0 = new ug0(this, 1);
    public float[] g0 = new float[2];
    public final ug0 h0 = new ug0(this, 2);
    public final ug0 j0 = new ug0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static el0 o(float f7, boolean z10) {
        el0 el0Var = new el0();
        float f10 = 1.0f / f7;
        zg0 zg0Var = p0;
        if (zg0Var.P && !z10) {
            el0Var.a = zg0Var.K;
            el0Var.b = zg0Var.L + AndroidUtilities.statusBarHeight;
            el0Var.c = zg0Var.H;
            el0Var.d = zg0Var.I;
            return el0Var;
        }
        float f11 = ((SharedPreferences) zg0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) zg0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) zg0Var.n().b).getFloat("scale_factor", 1.0f);
        el0Var.c = s(f10) * f13;
        el0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = el0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            el0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            el0Var.a = (AndroidUtilities.displaySize.x - el0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            el0Var.b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - el0Var.d) + AndroidUtilities.statusBarHeight;
            return el0Var;
        }
        el0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return el0Var;
    }

    public static rf.d p() {
        zg0 zg0Var = p0;
        if (zg0Var != null) {
            return zg0Var.W;
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
        zg0 zg0Var = p0;
        r71 r71Var = zg0Var.Q;
        r71Var.e(false);
        r71Var.d(!z10);
        r71Var.f(true);
        ci.i3 i3Var = zg0Var.b0;
        if (i3Var != null) {
            i3Var.invalidate();
        }
        yg0 yg0Var = zg0Var.h;
        if (yg0Var != null) {
            yg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        zg0 zg0Var = p0;
        zg0Var.V = photoViewer;
        a81 a81Var = photoViewer.F2;
        rf.d dVar = zg0Var.W;
        if (dVar != null) {
            dVar.c();
            zg0Var.W = null;
        }
        if (a81Var != null && uf.b.a(photoViewer.y) == 1) {
            rf.c cVar = new rf.c(photoViewer.y, zg0Var);
            cVar.c = "photo-viewer-pip-" + a81Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = zg0Var.d;
            cVar.k = zg0Var.k0;
            int i10 = zg0Var.S;
            int i11 = zg0Var.T;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = a81Var.d;
            cVar.f = true;
            zg0Var.W = cVar.a();
        }
        zg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, kg0 kg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        kg0 kg0Var2;
        final zg0 zg0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            zg0Var.getClass();
            if (uf.b.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!zg0Var.P) {
                    return false;
                }
                zg0Var.P = true;
                zg0Var.S = i10;
                zg0Var.T = i11;
                zg0Var.O = null;
                if (kg0Var == null || !kg0Var.x) {
                    zg0Var.r = null;
                } else {
                    zg0Var.r = kg0Var;
                }
                float f7 = ((SharedPreferences) zg0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) zg0Var.n().b).getFloat("y", -1.0f);
                zg0Var.J = ((SharedPreferences) zg0Var.n().b).getFloat("scale_factor", 1.0f);
                zg0Var.H = (int) (zg0Var.t() * zg0Var.J);
                zg0Var.I = (int) (zg0Var.r() * zg0Var.J);
                zg0Var.E = false;
                o1.k kVar = new o1.k(zg0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(zg0Var) { // from class: org.telegram.ui.Components.vg0
                    public final /* synthetic */ zg0 b;

                    {
                        this.b = zg0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i13) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                zg0Var.M = kVar;
                o1.k kVar2 = new o1.k(zg0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(zg0Var) { // from class: org.telegram.ui.Components.vg0
                    public final /* synthetic */ zg0 b;

                    {
                        this.b = zg0Var;
                    }

                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z13, float f11, float f12) {
                        switch (i12) {
                            case 0:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("x", f11).apply();
                                break;
                            default:
                                ((SharedPreferences) this.b.n().b).edit().putFloat("y", f11).apply();
                                break;
                        }
                    }
                });
                zg0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mg.b(zg0Var, i12));
                zg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                zg0Var.s.setStylusScaleEnabled(false);
                zg0Var.v = new le.b(context, new xg0(zg0Var, scaledTouchSlop));
                zg0Var.e = new yg0(zg0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(zg0Var, context, i12);
                zg0Var.d = fVar;
                fVar.addView(zg0Var.e, w7.z5.d(-1.0f, -1));
                yg0 yg0Var = zg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ci.o1 o1Var = zf.i0.a;
                yg0Var.setOutlineProvider(new zf.h0(0, dp));
                zg0Var.e.setClipToOutline(true);
                zg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false));
                zg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) zg0Var.f.getParent()).removeView(zg0Var.f);
                }
                zg0Var.e.addView(zg0Var.f, w7.z5.d(-1.0f, -1));
                View view2 = new View(context);
                zg0Var.k0 = view2;
                zg0Var.e.addView(view2, w7.z5.d(-1.0f, -1));
                zg0Var.Q.n = new le.b(zg0Var, 10);
                zg0Var.h = new yg0(zg0Var, context, i12);
                yg0 yg0Var2 = zg0Var.h;
                Objects.requireNonNull(yg0Var2);
                zg0Var.R = new gp0(new rc0(yg0Var2, 11), true);
                zg0Var.h.setWillNotDraw(false);
                zg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                zg0Var.h.addView(view3, w7.z5.d(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.h6.hg;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(x02, mode);
                int i15 = org.telegram.ui.ActionBar.h6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ah.f(14));
                float f11 = 38;
                float f12 = 4;
                zg0Var.h.addView(imageView, w7.z5.a(f11, 0.0f, f12, f12, 0.0f, 38, 5));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ci.h2(6, zg0Var, z12));
                zg0Var.h.addView(imageView2, w7.z5.a(f11, 0.0f, f12, 48, 0.0f, 38, 5));
                ImageView imageView3 = new ImageView(context);
                zg0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), mode);
                zg0Var.X.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i15, false), 1, -1));
                zg0Var.X.setOnClickListener(new u80(zg0Var, 7));
                View view4 = zg0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof kg0);
                zg0Var.n = z13;
                zg0Var.X.setVisibility((!z13 || ((kg0Var2 = zg0Var.r) != null && kg0Var2.x)) ? 0 : 8);
                zg0Var.h.addView(zg0Var.X, w7.z5.e(38, 38, 17));
                ci.i3 i3Var = new ci.i3(zg0Var, context);
                zg0Var.b0 = i3Var;
                zg0Var.h.addView(i3Var, w7.z5.d(-1.0f, -1));
                zg0Var.e.addView(zg0Var.h, w7.z5.d(-1.0f, -1));
                zg0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, z12);
                zg0Var.c = b10;
                int i16 = zg0Var.H;
                b10.width = i16;
                b10.height = zg0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    zg0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
                    zg0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = zg0Var.c;
                    float a2 = w7.r.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - zg0Var.I);
                    zg0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = zg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    zg0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = zg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(zg0Var.b, zg0Var.d, layoutParams3);
                if (z11) {
                    zg0Var.b.addView(zg0Var.d, zg0Var.c);
                    return true;
                }
                zg0Var.d.setAlpha(0.0f);
                zg0Var.d.setScaleX(0.1f);
                zg0Var.d.setScaleY(0.1f);
                zg0Var.b.addView(zg0Var.d, zg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(zg0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(zg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(zg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!zg0Var.P) {
        }
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        rf.d dVar = this.W;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.W.h.a).width();
            this.H = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.W.h.a).height();
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

    @Override // tf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // tf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // tf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // tf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new t50(this, 1));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.ss0 ss0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ss0Var = photoViewer.c4) == null) {
            return;
        }
        ss0Var.cancelRewind();
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
                AndroidUtilities.runOnUIThread(new ug0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(bs.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new wg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        a81 a81Var = this.V.F2;
        if (a81Var == null) {
            return 0L;
        }
        return a81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        a81 a81Var = this.V.F2;
        if (a81Var == null) {
            return 0L;
        }
        return a81Var.p();
    }

    public final k0.b n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k0.b(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            r71 r71Var = this.Q;
            r71Var.q = f7;
            r71Var.a();
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
        rf.d dVar = this.W;
        if (dVar != null) {
            dVar.c();
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
        duration.setInterpolator(bs.f);
        this.F.addUpdateListener(new b80(this, 4));
        this.F.addListener(new wg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        kg0 kg0Var = this.r;
        if (kg0Var != null) {
            y3 = kg0Var.G;
        } else {
            a81 a81Var = photoViewer.F2;
            if (a81Var == null) {
                return;
            } else {
                y3 = a81Var.y();
            }
        }
        ug0 ug0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(ug0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(ug0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
