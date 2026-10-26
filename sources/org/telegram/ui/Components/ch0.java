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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ch0 implements uf.a {
    public static final pw0 n0 = new pw0(new qd0(7), new qd0(8));
    public static final pw0 o0 = new pw0(new qd0(9), new qd0(10));
    public static final ch0 p0 = new ch0();
    public boolean E;
    public ValueAnimator F;
    public li.e3 G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.j M;
    public o1.j N;
    public Float O;
    public boolean P;
    public qp0 R;
    public int S;
    public int T;
    public dv U;
    public PhotoViewer V;
    public sf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public di.h3 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.e d;
    public boolean d0;
    public bh0 e;
    public View f;
    public boolean f0;
    public bh0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public mg0 r;
    public ScaleGestureDetector s;
    public jg.i v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final j81 Q = new j81(false);
    public final xg0 e0 = new xg0(this, 1);
    public float[] g0 = new float[2];
    public final xg0 h0 = new xg0(this, 2);
    public final xg0 j0 = new xg0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static hl0 o(float f7, boolean z10) {
        hl0 hl0Var = new hl0();
        float f10 = 1.0f / f7;
        ch0 ch0Var = p0;
        if (ch0Var.P && !z10) {
            hl0Var.a = ch0Var.K;
            hl0Var.b = ch0Var.L + AndroidUtilities.statusBarHeight;
            hl0Var.c = ch0Var.H;
            hl0Var.d = ch0Var.I;
            return hl0Var;
        }
        float f11 = ((SharedPreferences) ch0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) ch0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) ch0Var.n().b).getFloat("scale_factor", 1.0f);
        hl0Var.c = s(f10) * f13;
        hl0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = hl0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            hl0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            hl0Var.a = (AndroidUtilities.displaySize.x - hl0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            hl0Var.b = a8.ee.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - hl0Var.d) + AndroidUtilities.statusBarHeight;
            return hl0Var;
        }
        hl0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return hl0Var;
    }

    public static sf.d p() {
        ch0 ch0Var = p0;
        if (ch0Var != null) {
            return ch0Var.W;
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
        ch0 ch0Var = p0;
        j81 j81Var = ch0Var.Q;
        j81Var.e(false);
        j81Var.d(!z10);
        j81Var.f(true);
        di.h3 h3Var = ch0Var.b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        bh0 bh0Var = ch0Var.h;
        if (bh0Var != null) {
            bh0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ch0 ch0Var = p0;
        ch0Var.V = photoViewer;
        s81 s81Var = photoViewer.F2;
        sf.d dVar = ch0Var.W;
        if (dVar != null) {
            dVar.c();
            ch0Var.W = null;
        }
        if (s81Var != null && vf.b.a(photoViewer.y) == 1) {
            sf.c cVar = new sf.c(photoViewer.y, ch0Var);
            cVar.c = "photo-viewer-pip-" + s81Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = ch0Var.d;
            cVar.k = ch0Var.k0;
            int i10 = ch0Var.S;
            int i11 = ch0Var.T;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = s81Var.d;
            cVar.f = true;
            ch0Var.W = cVar.a();
        }
        ch0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, mg0 mg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        mg0 mg0Var2;
        final ch0 ch0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            ch0Var.getClass();
            if (vf.b.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!ch0Var.P) {
                    return false;
                }
                ch0Var.P = true;
                ch0Var.S = i10;
                ch0Var.T = i11;
                ch0Var.O = null;
                if (mg0Var == null || !mg0Var.x) {
                    ch0Var.r = null;
                } else {
                    ch0Var.r = mg0Var;
                }
                float f7 = ((SharedPreferences) ch0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) ch0Var.n().b).getFloat("y", -1.0f);
                ch0Var.J = ((SharedPreferences) ch0Var.n().b).getFloat("scale_factor", 1.0f);
                ch0Var.H = (int) (ch0Var.t() * ch0Var.J);
                ch0Var.I = (int) (ch0Var.r() * ch0Var.J);
                ch0Var.E = false;
                o1.j jVar = new o1.j(ch0Var, n0);
                o1.k kVar = new o1.k();
                kVar.a(0.75f);
                kVar.b(650.0f);
                jVar.u = kVar;
                jVar.a(new o1.f(ch0Var) { // from class: org.telegram.ui.Components.yg0
                    public final /* synthetic */ ch0 b;

                    {
                        this.b = ch0Var;
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
                ch0Var.M = jVar;
                o1.j jVar2 = new o1.j(ch0Var, o0);
                o1.k kVar2 = new o1.k();
                kVar2.a(0.75f);
                kVar2.b(650.0f);
                jVar2.u = kVar2;
                jVar2.a(new o1.f(ch0Var) { // from class: org.telegram.ui.Components.yg0
                    public final /* synthetic */ ch0 b;

                    {
                        this.b = ch0Var;
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
                ch0Var.N = jVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new ng.b(ch0Var, i12));
                ch0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                ch0Var.s.setStylusScaleEnabled(false);
                ch0Var.v = new jg.i(context, new ah0(ch0Var, scaledTouchSlop));
                ch0Var.e = new bh0(ch0Var, context, i13);
                org.telegram.ui.e eVar = new org.telegram.ui.e(ch0Var, context, i12);
                ch0Var.d = eVar;
                eVar.addView(ch0Var.e, gb1.g(-1.0f, -1));
                bh0 bh0Var = ch0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ag.v0 v0Var = ag.z0.a;
                bh0Var.setOutlineProvider(new ag.x0(0, dp));
                ch0Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.gg, ch0Var.e, null);
                ch0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) ch0Var.f.getParent()).removeView(ch0Var.f);
                }
                ch0Var.e.addView(ch0Var.f, gb1.g(-1.0f, -1));
                View view2 = new View(context);
                ch0Var.k0 = view2;
                ch0Var.e.addView(view2, gb1.g(-1.0f, -1));
                ch0Var.Q.n = new jg.s0(ch0Var, 20);
                ch0Var.h = new bh0(ch0Var, context, i12);
                bh0 bh0Var2 = ch0Var.h;
                Objects.requireNonNull(bh0Var2);
                ch0Var.R = new qp0(new wa0(bh0Var2, 13), true);
                ch0Var.h.setWillNotDraw(false);
                ch0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                ch0Var.h.addView(view3, gb1.g(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.y6.hg;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.f7.t(imageView, i14, null, mode);
                int i15 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                imageView.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new bh.f(14));
                float f11 = 38;
                float f12 = 4;
                ch0Var.h.addView(imageView, gb1.h(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.f7.t(imageView2, i14, null, mode);
                org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i15);
                imageView2.setBackground(g03);
                org.telegram.ui.ActionBar.f7.k(imageView2, g03, null, N2, null);
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                int i16 = 6;
                imageView2.setOnClickListener(new di.g2(i16, ch0Var, z12));
                ch0Var.h.addView(imageView2, gb1.h(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                ch0Var.X = imageView3;
                org.telegram.ui.ActionBar.f7.t(imageView3, i14, null, mode);
                org.telegram.ui.ActionBar.f7.R(ch0Var.X, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i15), null);
                ch0Var.X.setOnClickListener(new w80(ch0Var, i16));
                View view4 = ch0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof mg0);
                ch0Var.n = z13;
                ch0Var.X.setVisibility((!z13 || ((mg0Var2 = ch0Var.r) != null && mg0Var2.x)) ? 0 : 8);
                ch0Var.h.addView(ch0Var.X, gb1.i(38, 38, 17));
                di.h3 h3Var = new di.h3(ch0Var, context);
                ch0Var.b0 = h3Var;
                ch0Var.h.addView(h3Var, gb1.g(-1.0f, -1));
                ch0Var.e.addView(ch0Var.h, gb1.g(-1.0f, -1));
                ch0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = vf.b.b(context, z12);
                ch0Var.c = b10;
                int i17 = ch0Var.H;
                b10.width = i17;
                b10.height = ch0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i17 / 2.0f) + f7;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ch0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    ch0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = ch0Var.c;
                    float a2 = a8.ee.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - ch0Var.I);
                    ch0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = ch0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    ch0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = ch0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(ch0Var.b, ch0Var.d, layoutParams3);
                if (z11) {
                    ch0Var.b.addView(ch0Var.d, ch0Var.c);
                    return true;
                }
                ch0Var.d.setAlpha(0.0f);
                ch0Var.d.setScaleX(0.1f);
                ch0Var.d.setScaleY(0.1f);
                ch0Var.b.addView(ch0Var.d, ch0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(ds.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(ch0Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(ch0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(ch0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!ch0Var.P) {
        }
    }

    @Override // uf.a
    public final void a(a8.fg fgVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = fgVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // uf.a
    public final void b(a8.fg fgVar) {
        sf.d dVar = this.W;
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
        photoViewer.Q8 = fgVar;
    }

    @Override // uf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // uf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // uf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // uf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new v50(this, 1));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.xs0 xs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (xs0Var = photoViewer.c4) == null) {
            return;
        }
        xs0Var.cancelRewind();
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
        o1.j jVar = this.M;
        if (jVar != null) {
            jVar.c();
            this.N.c();
        }
        if (z10 || this.d == null) {
            if (z11) {
                u();
                return;
            } else {
                AndroidUtilities.runOnUIThread(new xg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ds.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new zg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        s81 s81Var = this.V.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        s81 s81Var = this.V.F2;
        if (s81Var == null) {
            return 0L;
        }
        return s81Var.p();
    }

    public final li.e3 n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new li.e3(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            j81 j81Var = this.Q;
            j81Var.q = f7;
            j81Var.a();
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
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
                this.b.removeViewImmediate(this.d);
            }
        } catch (Exception unused) {
        }
        this.b0 = null;
        this.f = null;
        this.V = null;
        sf.d dVar = this.W;
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
        duration.setInterpolator(ds.f);
        this.F.addUpdateListener(new e80(this, 4));
        this.F.addListener(new zg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        mg0 mg0Var = this.r;
        if (mg0Var != null) {
            y3 = mg0Var.G;
        } else {
            s81 s81Var = photoViewer.F2;
            if (s81Var == null) {
                return;
            } else {
                y3 = s81Var.y();
            }
        }
        xg0 xg0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(xg0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(xg0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // uf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // uf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
