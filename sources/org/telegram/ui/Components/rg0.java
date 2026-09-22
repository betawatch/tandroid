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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rg0 implements rf.a {
    public static final vv0 n0 = new vv0(new i2(29), new lg0(0));
    public static final vv0 o0 = new vv0(new lg0(1), new lg0(2));
    public static final rg0 p0 = new rg0();
    public boolean E;
    public ValueAnimator F;
    public k2.e G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public zo0 R;
    public int S;
    public int T;
    public vu U;
    public PhotoViewer V;
    public pf.e W;
    public ImageView X;
    public boolean Y;
    public float Z;
    public float a0;
    public WindowManager b;
    public ai.n4 b0;
    public WindowManager.LayoutParams c;
    public boolean c0;
    public org.telegram.ui.f d;
    public boolean d0;
    public qg0 e;
    public View f;
    public boolean f0;
    public qg0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public bg0 r;
    public ScaleGestureDetector s;
    public k2.e v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final n71 Q = new n71(false);
    public final mg0 e0 = new mg0(this, 1);
    public float[] g0 = new float[2];
    public final mg0 h0 = new mg0(this, 2);
    public final mg0 j0 = new mg0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static uk0 o(float f7, boolean z10) {
        uk0 uk0Var = new uk0();
        float f10 = 1.0f / f7;
        rg0 rg0Var = p0;
        if (rg0Var.P && !z10) {
            uk0Var.a = rg0Var.K;
            uk0Var.b = rg0Var.L + AndroidUtilities.statusBarHeight;
            uk0Var.c = rg0Var.H;
            uk0Var.d = rg0Var.I;
            return uk0Var;
        }
        float f11 = ((SharedPreferences) rg0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) rg0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) rg0Var.n().b).getFloat("scale_factor", 1.0f);
        uk0Var.c = s(f10) * f13;
        uk0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = uk0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            uk0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            uk0Var.a = (AndroidUtilities.displaySize.x - uk0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            uk0Var.b = w7.q.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - uk0Var.d) + AndroidUtilities.statusBarHeight;
            return uk0Var;
        }
        uk0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return uk0Var;
    }

    public static pf.e p() {
        rg0 rg0Var = p0;
        if (rg0Var != null) {
            return rg0Var.W;
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
        rg0 rg0Var = p0;
        n71 n71Var = rg0Var.Q;
        n71Var.e(false);
        n71Var.d(!z10);
        n71Var.f(true);
        ai.n4 n4Var = rg0Var.b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        qg0 qg0Var = rg0Var.h;
        if (qg0Var != null) {
            qg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        rg0 rg0Var = p0;
        rg0Var.V = photoViewer;
        v71 v71Var = photoViewer.F2;
        pf.e eVar = rg0Var.W;
        if (eVar != null) {
            eVar.c();
            rg0Var.W = null;
        }
        if (v71Var != null && sf.c.a(photoViewer.y) == 1) {
            pf.d dVar = new pf.d(photoViewer.y, rg0Var);
            dVar.c = "photo-viewer-pip-" + v71Var.a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.j = rg0Var.d;
            dVar.k = rg0Var.k0;
            int i10 = rg0Var.S;
            int i11 = rg0Var.T;
            dVar.h = i10;
            dVar.i = i11;
            dVar.g = v71Var.d;
            dVar.f = true;
            rg0Var.W = dVar.a();
        }
        rg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, bg0 bg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        bg0 bg0Var2;
        final rg0 rg0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            rg0Var.getClass();
            if (sf.c.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!rg0Var.P) {
                    return false;
                }
                rg0Var.P = true;
                rg0Var.S = i10;
                rg0Var.T = i11;
                rg0Var.O = null;
                if (bg0Var == null || !bg0Var.x) {
                    rg0Var.r = null;
                } else {
                    rg0Var.r = bg0Var;
                }
                float f7 = ((SharedPreferences) rg0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) rg0Var.n().b).getFloat("y", -1.0f);
                rg0Var.J = ((SharedPreferences) rg0Var.n().b).getFloat("scale_factor", 1.0f);
                rg0Var.H = (int) (rg0Var.t() * rg0Var.J);
                rg0Var.I = (int) (rg0Var.r() * rg0Var.J);
                rg0Var.E = false;
                o1.k kVar = new o1.k(rg0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(rg0Var) { // from class: org.telegram.ui.Components.ng0
                    public final /* synthetic */ rg0 b;

                    {
                        this.b = rg0Var;
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
                rg0Var.M = kVar;
                o1.k kVar2 = new o1.k(rg0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(rg0Var) { // from class: org.telegram.ui.Components.ng0
                    public final /* synthetic */ rg0 b;

                    {
                        this.b = rg0Var;
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
                rg0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new lg.b(rg0Var, i12));
                rg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    rg0Var.s.setStylusScaleEnabled(false);
                }
                rg0Var.v = new k2.e(context, new pg0(rg0Var, scaledTouchSlop));
                rg0Var.e = new qg0(rg0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(rg0Var, context, i12);
                rg0Var.d = fVar;
                fVar.addView(rg0Var.e, w7.y5.c(-1.0f, -1));
                qg0 qg0Var = rg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ai.k2 k2Var = yf.j0.a;
                qg0Var.setOutlineProvider(new yf.h0(0, dp));
                rg0Var.e.setClipToOutline(true);
                rg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
                rg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) rg0Var.f.getParent()).removeView(rg0Var.f);
                }
                rg0Var.e.addView(rg0Var.f, w7.y5.c(-1.0f, -1));
                View view2 = new View(context);
                rg0Var.k0 = view2;
                rg0Var.e.addView(view2, w7.y5.c(-1.0f, -1));
                rg0Var.Q.n = new o0.b(rg0Var, 7);
                rg0Var.h = new qg0(rg0Var, context, i12);
                qg0 qg0Var2 = rg0Var.h;
                Objects.requireNonNull(qg0Var2);
                int i14 = 12;
                rg0Var.R = new zo0(new jc0(qg0Var2, i14), true);
                rg0Var.h.setWillNotDraw(false);
                rg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                rg0Var.h.addView(view3, w7.y5.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i15 = org.telegram.ui.ActionBar.j6.hg;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i16 = org.telegram.ui.ActionBar.j6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ai.e2(i14));
                float f11 = 38;
                float f12 = 4;
                rg0Var.h.addView(imageView, w7.y5.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ai.j3(6, rg0Var, z12));
                rg0Var.h.addView(imageView2, w7.y5.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                rg0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false), mode);
                rg0Var.X.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i16, false), 1, -1));
                int i17 = 8;
                rg0Var.X.setOnClickListener(new i80(rg0Var, i17));
                View view4 = rg0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof bg0);
                rg0Var.n = z13;
                ImageView imageView4 = rg0Var.X;
                if (!z13 || ((bg0Var2 = rg0Var.r) != null && bg0Var2.x)) {
                    i17 = 0;
                }
                imageView4.setVisibility(i17);
                rg0Var.h.addView(rg0Var.X, w7.y5.e(38, 38, 17));
                ai.n4 n4Var = new ai.n4(rg0Var, context);
                rg0Var.b0 = n4Var;
                rg0Var.h.addView(n4Var, w7.y5.c(-1.0f, -1));
                rg0Var.e.addView(rg0Var.h, w7.y5.c(-1.0f, -1));
                rg0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = sf.c.b(context, z12);
                rg0Var.c = b10;
                int i18 = rg0Var.H;
                b10.width = i18;
                b10.height = rg0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i18 / 2.0f) + f7;
                    int i19 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i19) / 2.0f ? (i19 - i18) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    rg0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i18) - AndroidUtilities.dp(16.0f);
                    rg0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = rg0Var.c;
                    float a2 = w7.q.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - rg0Var.I);
                    rg0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = rg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    rg0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = rg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(rg0Var.b, rg0Var.d, layoutParams3);
                if (z11) {
                    rg0Var.b.addView(rg0Var.d, rg0Var.c);
                    return true;
                }
                rg0Var.d.setAlpha(0.0f);
                rg0Var.d.setScaleX(0.1f);
                rg0Var.d.setScaleY(0.1f);
                rg0Var.b.addView(rg0Var.d, rg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(qr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(rg0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(rg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(rg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!rg0Var.P) {
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        PhotoViewer photoViewer = this.V;
        if (photoViewer != null && photoViewer.F2 != null) {
            photoViewer.Q8 = pVar;
        }
        this.b.removeView(this.d);
        this.m0 = true;
        this.d.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        pf.e eVar = this.W;
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

    @Override // rf.a
    public final Bitmap c() {
        TextureView textureView = this.l0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.l0.getBitmap();
    }

    @Override // rf.a
    public final Bitmap e() {
        TextureView textureView;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (textureView = photoViewer.w3) == null || !textureView.isAvailable()) {
            return null;
        }
        return this.V.w3.getBitmap();
    }

    @Override // rf.a
    public final boolean g() {
        PhotoViewer photoViewer = this.V;
        return photoViewer != null && photoViewer.g();
    }

    @Override // rf.a
    public final View h() {
        TextureView textureView = new TextureView(this.d.getContext());
        this.l0 = textureView;
        textureView.setVisibility(4);
        this.l0.setOpaque(false);
        this.l0.setSurfaceTextureListener(new ki.c(this, 2));
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
                AndroidUtilities.runOnUIThread(new mg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(qr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new og0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        v71 v71Var = this.V.F2;
        if (v71Var == null) {
            return 0L;
        }
        return v71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        v71 v71Var = this.V.F2;
        if (v71Var == null) {
            return 0L;
        }
        return v71Var.p();
    }

    public final k2.e n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new k2.e(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            n71 n71Var = this.Q;
            n71Var.q = f7;
            n71Var.a();
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
        pf.e eVar = this.W;
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
        duration.setInterpolator(qr.f);
        this.F.addUpdateListener(new s70(this, 3));
        this.F.addListener(new og0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        bg0 bg0Var = this.r;
        if (bg0Var != null) {
            y3 = bg0Var.G;
        } else {
            v71 v71Var = photoViewer.F2;
            if (v71Var == null) {
                return;
            } else {
                y3 = v71Var.y();
            }
        }
        mg0 mg0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(mg0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(mg0Var, 500L);
        } else if (this.Y) {
            this.X.setImageResource(R.drawable.pip_replay_large);
        } else {
            this.X.setImageResource(R.drawable.pip_play_large);
        }
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
