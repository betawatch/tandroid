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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fh0 implements tf.a {
    public static final hw0 n0 = new hw0(new n2(25), new n2(26));
    public static final hw0 o0 = new hw0(new n2(27), new n2(28));
    public static final fh0 p0 = new fh0();
    public boolean E;
    public ValueAnimator F;
    public m.h G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public lp0 R;
    public int S;
    public int T;
    public hv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public bi.d4 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public eh0 e;
    public View f;
    public boolean f0;
    public eh0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public rg0 r;
    public ScaleGestureDetector s;
    public ji.w4 v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final a81 Q = new a81(false);
    public final ah0 e0 = new ah0(this, 1);
    public float[] g0 = new float[2];
    public final ah0 h0 = new ah0(this, 2);
    public final ah0 j0 = new ah0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        il0 il0Var = new il0();
        float f10 = 1.0f / f7;
        fh0 fh0Var = p0;
        if (fh0Var.P && !z10) {
            il0Var.a = fh0Var.K;
            il0Var.b = fh0Var.L + AndroidUtilities.statusBarHeight;
            il0Var.c = fh0Var.H;
            il0Var.d = fh0Var.I;
            return il0Var;
        }
        float f11 = ((SharedPreferences) fh0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) fh0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) fh0Var.n().b).getFloat("scale_factor", 1.0f);
        il0Var.c = s(f10) * f13;
        il0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = il0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            il0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            il0Var.a = (AndroidUtilities.displaySize.x - il0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            il0Var.b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - il0Var.d) + AndroidUtilities.statusBarHeight;
            return il0Var;
        }
        il0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return il0Var;
    }

    public static rf.d p() {
        fh0 fh0Var = p0;
        if (fh0Var != null) {
            return fh0Var.W;
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
        fh0 fh0Var = p0;
        a81 a81Var = fh0Var.Q;
        a81Var.e(false);
        a81Var.d(!z10);
        a81Var.f(true);
        bi.d4 d4Var = fh0Var.b0;
        if (d4Var != null) {
            d4Var.invalidate();
        }
        eh0 eh0Var = fh0Var.h;
        if (eh0Var != null) {
            eh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        fh0 fh0Var = p0;
        fh0Var.V = photoViewer;
        i81 i81Var = photoViewer.F2;
        rf.d dVar = fh0Var.W;
        if (dVar != null) {
            dVar.c();
            fh0Var.W = null;
        }
        if (i81Var != null && uf.b.a(photoViewer.y) == 1) {
            rf.c cVar = new rf.c(photoViewer.y, fh0Var);
            cVar.c = "photo-viewer-pip-" + i81Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = fh0Var.d;
            cVar.k = fh0Var.k0;
            int i10 = fh0Var.S;
            int i11 = fh0Var.T;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = i81Var.d;
            cVar.f = true;
            fh0Var.W = cVar.a();
        }
        fh0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, rg0 rg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        rg0 rg0Var2;
        final fh0 fh0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            fh0Var.getClass();
            if (uf.b.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!fh0Var.P) {
                    return false;
                }
                fh0Var.P = true;
                fh0Var.S = i10;
                fh0Var.T = i11;
                fh0Var.O = null;
                if (rg0Var == null || !rg0Var.x) {
                    fh0Var.r = null;
                } else {
                    fh0Var.r = rg0Var;
                }
                float f7 = ((SharedPreferences) fh0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) fh0Var.n().b).getFloat("y", -1.0f);
                fh0Var.J = ((SharedPreferences) fh0Var.n().b).getFloat("scale_factor", 1.0f);
                fh0Var.H = (int) (fh0Var.t() * fh0Var.J);
                fh0Var.I = (int) (fh0Var.r() * fh0Var.J);
                fh0Var.E = false;
                o1.k kVar = new o1.k(fh0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(fh0Var) { // from class: org.telegram.ui.Components.bh0
                    public final /* synthetic */ fh0 b;

                    {
                        this.b = fh0Var;
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
                fh0Var.M = kVar;
                o1.k kVar2 = new o1.k(fh0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(fh0Var) { // from class: org.telegram.ui.Components.bh0
                    public final /* synthetic */ fh0 b;

                    {
                        this.b = fh0Var;
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
                fh0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mg.b(fh0Var, i12));
                fh0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                fh0Var.s.setStylusScaleEnabled(false);
                fh0Var.v = new ji.w4(context, new dh0(fh0Var, scaledTouchSlop));
                fh0Var.e = new eh0(fh0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(fh0Var, context, i12);
                fh0Var.d = fVar;
                fVar.addView(fh0Var.e, w7.z5.d(-1.0f, -1));
                eh0 eh0Var = fh0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                bi.a2 a2Var = zf.j0.a;
                eh0Var.setOutlineProvider(new zf.i0(0, dp));
                fh0Var.e.setClipToOutline(true);
                fh0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gg, false));
                fh0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) fh0Var.f.getParent()).removeView(fh0Var.f);
                }
                fh0Var.e.addView(fh0Var.f, w7.z5.d(-1.0f, -1));
                View view2 = new View(context);
                fh0Var.k0 = view2;
                fh0Var.e.addView(view2, w7.z5.d(-1.0f, -1));
                fh0Var.Q.n = new ji.h5(fh0Var, 14);
                fh0Var.h = new eh0(fh0Var, context, i12);
                eh0 eh0Var2 = fh0Var.h;
                Objects.requireNonNull(eh0Var2);
                fh0Var.R = new lp0(new yc0(eh0Var2, 12), true);
                fh0Var.h.setWillNotDraw(false);
                fh0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                fh0Var.h.addView(view3, w7.z5.d(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.g6.hg;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(x02, mode);
                int i15 = org.telegram.ui.ActionBar.g6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ah.f(13));
                float f11 = 38;
                float f12 = 4;
                fh0Var.h.addView(imageView, w7.z5.a(f11, 0.0f, f12, f12, 0.0f, 38, 5));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new bi.z2(6, fh0Var, z12));
                fh0Var.h.addView(imageView2, w7.z5.a(f11, 0.0f, f12, 48, 0.0f, 38, 5));
                ImageView imageView3 = new ImageView(context);
                fh0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i14, false), mode);
                fh0Var.X.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i15, false), 1, -1));
                fh0Var.X.setOnClickListener(new y80(fh0Var, 7));
                View view4 = fh0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof rg0);
                fh0Var.n = z13;
                fh0Var.X.setVisibility((!z13 || ((rg0Var2 = fh0Var.r) != null && rg0Var2.x)) ? 0 : 8);
                fh0Var.h.addView(fh0Var.X, w7.z5.e(38, 38, 17));
                bi.d4 d4Var = new bi.d4(fh0Var, context);
                fh0Var.b0 = d4Var;
                fh0Var.h.addView(d4Var, w7.z5.d(-1.0f, -1));
                fh0Var.e.addView(fh0Var.h, w7.z5.d(-1.0f, -1));
                fh0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, z12);
                fh0Var.c = b10;
                int i16 = fh0Var.H;
                b10.width = i16;
                b10.height = fh0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    fh0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
                    fh0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = fh0Var.c;
                    float a2 = w7.r.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - fh0Var.I);
                    fh0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = fh0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    fh0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = fh0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(fh0Var.b, fh0Var.d, layoutParams3);
                if (z11) {
                    fh0Var.b.addView(fh0Var.d, fh0Var.c);
                    return true;
                }
                fh0Var.d.setAlpha(0.0f);
                fh0Var.d.setScaleX(0.1f);
                fh0Var.d.setScaleY(0.1f);
                fh0Var.b.addView(fh0Var.d, fh0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(es.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(fh0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(fh0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(fh0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!fh0Var.P) {
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
        this.l0.setSurfaceTextureListener(new x50(this, 1));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.qt0 qt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (qt0Var = photoViewer.c4) == null) {
            return;
        }
        qt0Var.cancelRewind();
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
                AndroidUtilities.runOnUIThread(new ah0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(es.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new ch0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        i81 i81Var = this.V.F2;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        i81 i81Var = this.V.F2;
        if (i81Var == null) {
            return 0L;
        }
        return i81Var.p();
    }

    public final m.h n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new m.h(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            a81 a81Var = this.Q;
            a81Var.q = f7;
            a81Var.a();
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
        duration.setInterpolator(es.f);
        this.F.addUpdateListener(new f80(this, 4));
        this.F.addListener(new ch0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        rg0 rg0Var = this.r;
        if (rg0Var != null) {
            y3 = rg0Var.G;
        } else {
            i81 i81Var = photoViewer.F2;
            if (i81Var == null) {
                return;
            } else {
                y3 = i81Var.y();
            }
        }
        ah0 ah0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(ah0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(ah0Var, 500L);
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
