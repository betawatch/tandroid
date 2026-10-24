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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dh0 implements tf.a {
    public static final hw0 n0 = new hw0(new ud0(4), new ud0(5));
    public static final hw0 o0 = new hw0(new ud0(6), new ud0(7));
    public static final dh0 p0 = new dh0();
    public boolean E;
    public ValueAnimator F;
    public k2.w0 G;
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
    public cv U;
    public PhotoViewer V;
    public rf.d W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public ci.h3 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.e d;
    public boolean d0;
    public ch0 e;
    public View f;
    public boolean f0;
    public ch0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public pg0 r;
    public ScaleGestureDetector s;
    public le.b v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final b81 Q = new b81(false);
    public final yg0 e0 = new yg0(this, 1);
    public float[] g0 = new float[2];
    public final yg0 h0 = new yg0(this, 2);
    public final yg0 j0 = new yg0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static il0 o(float f7, boolean z10) {
        il0 il0Var = new il0();
        float f10 = 1.0f / f7;
        dh0 dh0Var = p0;
        if (dh0Var.P && !z10) {
            il0Var.a = dh0Var.K;
            il0Var.b = dh0Var.L + AndroidUtilities.statusBarHeight;
            il0Var.c = dh0Var.H;
            il0Var.d = dh0Var.I;
            return il0Var;
        }
        float f11 = ((SharedPreferences) dh0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) dh0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) dh0Var.n().b).getFloat("scale_factor", 1.0f);
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
        dh0 dh0Var = p0;
        if (dh0Var != null) {
            return dh0Var.W;
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
        dh0 dh0Var = p0;
        b81 b81Var = dh0Var.Q;
        b81Var.e(false);
        b81Var.d(!z10);
        b81Var.f(true);
        ci.h3 h3Var = dh0Var.b0;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        ch0 ch0Var = dh0Var.h;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        dh0 dh0Var = p0;
        dh0Var.V = photoViewer;
        j81 j81Var = photoViewer.F2;
        rf.d dVar = dh0Var.W;
        if (dVar != null) {
            dVar.c();
            dh0Var.W = null;
        }
        if (j81Var != null && uf.b.a(photoViewer.y) == 1) {
            rf.c cVar = new rf.c(photoViewer.y, dh0Var);
            cVar.c = "photo-viewer-pip-" + j81Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = dh0Var.d;
            cVar.k = dh0Var.k0;
            int i10 = dh0Var.S;
            int i11 = dh0Var.T;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = j81Var.d;
            cVar.f = true;
            dh0Var.W = cVar.a();
        }
        dh0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, pg0 pg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        pg0 pg0Var2;
        final dh0 dh0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            dh0Var.getClass();
            if (uf.b.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!dh0Var.P) {
                    return false;
                }
                dh0Var.P = true;
                dh0Var.S = i10;
                dh0Var.T = i11;
                dh0Var.O = null;
                if (pg0Var == null || !pg0Var.x) {
                    dh0Var.r = null;
                } else {
                    dh0Var.r = pg0Var;
                }
                float f7 = ((SharedPreferences) dh0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) dh0Var.n().b).getFloat("y", -1.0f);
                dh0Var.J = ((SharedPreferences) dh0Var.n().b).getFloat("scale_factor", 1.0f);
                dh0Var.H = (int) (dh0Var.t() * dh0Var.J);
                dh0Var.I = (int) (dh0Var.r() * dh0Var.J);
                dh0Var.E = false;
                o1.k kVar = new o1.k(dh0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(dh0Var) { // from class: org.telegram.ui.Components.zg0
                    public final /* synthetic */ dh0 b;

                    {
                        this.b = dh0Var;
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
                dh0Var.M = kVar;
                o1.k kVar2 = new o1.k(dh0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(dh0Var) { // from class: org.telegram.ui.Components.zg0
                    public final /* synthetic */ dh0 b;

                    {
                        this.b = dh0Var;
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
                dh0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mg.b(dh0Var, i12));
                dh0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                dh0Var.s.setStylusScaleEnabled(false);
                dh0Var.v = new le.b(context, (u20) new bh0(dh0Var, scaledTouchSlop));
                dh0Var.e = new ch0(dh0Var, context, i13);
                org.telegram.ui.e eVar = new org.telegram.ui.e(dh0Var, context, i12);
                dh0Var.d = eVar;
                eVar.addView(dh0Var.e, w7.z5.c(-1.0f, -1));
                ch0 ch0Var = dh0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ci.n1 n1Var = zf.j0.a;
                ch0Var.setOutlineProvider(new zf.i0(0, dp));
                dh0Var.e.setClipToOutline(true);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.gg, dh0Var.e, null);
                dh0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) dh0Var.f.getParent()).removeView(dh0Var.f);
                }
                dh0Var.e.addView(dh0Var.f, w7.z5.c(-1.0f, -1));
                View view2 = new View(context);
                dh0Var.k0 = view2;
                dh0Var.e.addView(view2, w7.z5.c(-1.0f, -1));
                dh0Var.Q.n = new le.b(dh0Var, 10);
                dh0Var.h = new ch0(dh0Var, context, i12);
                ch0 ch0Var2 = dh0Var.h;
                Objects.requireNonNull(ch0Var2);
                dh0Var.R = new lp0(new yb0(ch0Var2, 12), true);
                dh0Var.h.setWillNotDraw(false);
                dh0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                dh0Var.h.addView(view3, w7.z5.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.k6.hg;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(imageView, i14, null, mode);
                int i15 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
                imageView.setBackground(g02);
                org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ah.f(14));
                float f11 = 38;
                float f12 = 4;
                dh0Var.h.addView(imageView, w7.z5.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                org.telegram.ui.ActionBar.r6.t(imageView2, i14, null, mode);
                org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 1, -1);
                org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
                imageView2.setBackground(g03);
                org.telegram.ui.ActionBar.r6.k(imageView2, g03, null, O2, null);
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ci.g2(6, dh0Var, z12));
                dh0Var.h.addView(imageView2, w7.z5.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                dh0Var.X = imageView3;
                org.telegram.ui.ActionBar.r6.t(imageView3, i14, null, mode);
                org.telegram.ui.ActionBar.r6.S(dh0Var.X, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i15), null);
                dh0Var.X.setOnClickListener(new v80(dh0Var, 7));
                View view4 = dh0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof pg0);
                dh0Var.n = z13;
                dh0Var.X.setVisibility((!z13 || ((pg0Var2 = dh0Var.r) != null && pg0Var2.x)) ? 0 : 8);
                dh0Var.h.addView(dh0Var.X, w7.z5.e(38, 38, 17));
                ci.h3 h3Var = new ci.h3(dh0Var, context);
                dh0Var.b0 = h3Var;
                dh0Var.h.addView(h3Var, w7.z5.c(-1.0f, -1));
                dh0Var.e.addView(dh0Var.h, w7.z5.c(-1.0f, -1));
                dh0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, z12);
                dh0Var.c = b10;
                int i16 = dh0Var.H;
                b10.width = i16;
                b10.height = dh0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    dh0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
                    dh0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = dh0Var.c;
                    float a2 = w7.r.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - dh0Var.I);
                    dh0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = dh0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    dh0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = dh0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(dh0Var.b, dh0Var.d, layoutParams3);
                if (z11) {
                    dh0Var.b.addView(dh0Var.d, dh0Var.c);
                    return true;
                }
                dh0Var.d.setAlpha(0.0f);
                dh0Var.d.setScaleX(0.1f);
                dh0Var.d.setScaleY(0.1f);
                dh0Var.b.addView(dh0Var.d, dh0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(dh0Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(dh0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(dh0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!dh0Var.P) {
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
        org.telegram.ui.ts0 ts0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (ts0Var = photoViewer.c4) == null) {
            return;
        }
        ts0Var.cancelRewind();
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
                AndroidUtilities.runOnUIThread(new yg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(bs.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new ah0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        j81 j81Var = this.V.F2;
        if (j81Var == null) {
            return 0L;
        }
        return j81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        j81 j81Var = this.V.F2;
        if (j81Var == null) {
            return 0L;
        }
        return j81Var.p();
    }

    public final k2.w0 n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k2.w0(point.x, point.y);
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
            org.telegram.ui.e eVar = this.d;
            if (eVar != null && eVar.getParent() != null) {
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
        this.F.addUpdateListener(new d80(this, 4));
        this.F.addListener(new ah0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        pg0 pg0Var = this.r;
        if (pg0Var != null) {
            y3 = pg0Var.G;
        } else {
            j81 j81Var = photoViewer.F2;
            if (j81Var == null) {
                return;
            } else {
                y3 = j81Var.y();
            }
        }
        yg0 yg0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(yg0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(yg0Var, 500L);
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
