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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fg0 implements rf.a {
    public static final jv0 n0 = new jv0(new l2(25), new l2(26));
    public static final jv0 o0 = new jv0(new l2(27), new l2(28));
    public static final fg0 p0 = new fg0();
    public boolean E;
    public ValueAnimator F;
    public com.google.firebase.messaging.v G;
    public int H;
    public int I;
    public float K;
    public float L;
    public o1.k M;
    public o1.k N;
    public Float O;
    public boolean P;
    public lo0 R;
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
    public eg0 e;
    public View f;
    public boolean f0;
    public eg0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public qf0 r;
    public ScaleGestureDetector s;
    public org.telegram.ui.Cells.ia v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final x61 Q = new x61(false);
    public final ag0 e0 = new ag0(this, 1);
    public float[] g0 = new float[2];
    public final ag0 h0 = new ag0(this, 2);
    public final ag0 j0 = new ag0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static ik0 o(float f7, boolean z10) {
        ik0 ik0Var = new ik0();
        float f10 = 1.0f / f7;
        fg0 fg0Var = p0;
        if (fg0Var.P && !z10) {
            ik0Var.a = fg0Var.K;
            ik0Var.b = fg0Var.L + AndroidUtilities.statusBarHeight;
            ik0Var.c = fg0Var.H;
            ik0Var.d = fg0Var.I;
            return ik0Var;
        }
        float f11 = fg0Var.n().a.getFloat("x", -1.0f);
        float f12 = fg0Var.n().a.getFloat("y", -1.0f);
        float f13 = fg0Var.n().a.getFloat("scale_factor", 1.0f);
        ik0Var.c = s(f10) * f13;
        ik0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = ik0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            ik0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            ik0Var.a = (AndroidUtilities.displaySize.x - ik0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            ik0Var.b = w7.p.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - ik0Var.d) + AndroidUtilities.statusBarHeight;
            return ik0Var;
        }
        ik0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return ik0Var;
    }

    public static pf.e p() {
        fg0 fg0Var = p0;
        if (fg0Var != null) {
            return fg0Var.W;
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
        fg0 fg0Var = p0;
        x61 x61Var = fg0Var.Q;
        x61Var.e(false);
        x61Var.d(!z10);
        x61Var.f(true);
        ai.n4 n4Var = fg0Var.b0;
        if (n4Var != null) {
            n4Var.invalidate();
        }
        eg0 eg0Var = fg0Var.h;
        if (eg0Var != null) {
            eg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        fg0 fg0Var = p0;
        fg0Var.V = photoViewer;
        h71 h71Var = photoViewer.F2;
        pf.e eVar = fg0Var.W;
        if (eVar != null) {
            eVar.c();
            fg0Var.W = null;
        }
        if (h71Var != null && sf.c.a(photoViewer.y) == 1) {
            pf.d dVar = new pf.d(photoViewer.y, fg0Var);
            dVar.c = "photo-viewer-pip-" + h71Var.a;
            dVar.e = 1;
            dVar.d = AndroidUtilities.dp(10.0f);
            dVar.j = fg0Var.d;
            dVar.k = fg0Var.k0;
            int i10 = fg0Var.S;
            int i11 = fg0Var.T;
            dVar.h = i10;
            dVar.i = i11;
            dVar.g = h71Var.d;
            dVar.f = true;
            fg0Var.W = dVar.a();
        }
        fg0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, qf0 qf0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        qf0 qf0Var2;
        final fg0 fg0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            fg0Var.getClass();
            if (sf.c.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!fg0Var.P) {
                    return false;
                }
                fg0Var.P = true;
                fg0Var.S = i10;
                fg0Var.T = i11;
                fg0Var.O = null;
                if (qf0Var == null || !qf0Var.x) {
                    fg0Var.r = null;
                } else {
                    fg0Var.r = qf0Var;
                }
                float f7 = fg0Var.n().a.getFloat("x", -1.0f);
                float f10 = fg0Var.n().a.getFloat("y", -1.0f);
                fg0Var.J = fg0Var.n().a.getFloat("scale_factor", 1.0f);
                fg0Var.H = (int) (fg0Var.t() * fg0Var.J);
                fg0Var.I = (int) (fg0Var.r() * fg0Var.J);
                fg0Var.E = false;
                o1.k kVar = new o1.k(fg0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(fg0Var) { // from class: org.telegram.ui.Components.bg0
                    public final /* synthetic */ fg0 b;

                    {
                        this.b = fg0Var;
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
                fg0Var.M = kVar;
                o1.k kVar2 = new o1.k(fg0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(fg0Var) { // from class: org.telegram.ui.Components.bg0
                    public final /* synthetic */ fg0 b;

                    {
                        this.b = fg0Var;
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
                fg0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new lg.b(fg0Var, i12));
                fg0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                if (Build.VERSION.SDK_INT >= 23) {
                    fg0Var.s.setStylusScaleEnabled(false);
                }
                fg0Var.v = new org.telegram.ui.Cells.ia(context, new dg0(fg0Var, scaledTouchSlop));
                fg0Var.e = new eg0(fg0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(fg0Var, context, i12);
                fg0Var.d = fVar;
                fVar.addView(fg0Var.e, w7.x5.c(-1.0f, -1));
                eg0 eg0Var = fg0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ai.k2 k2Var = yf.j0.a;
                eg0Var.setOutlineProvider(new yf.h0(0, dp));
                fg0Var.e.setClipToOutline(true);
                fg0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
                fg0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) fg0Var.f.getParent()).removeView(fg0Var.f);
                }
                fg0Var.e.addView(fg0Var.f, w7.x5.c(-1.0f, -1));
                View view2 = new View(context);
                fg0Var.k0 = view2;
                fg0Var.e.addView(view2, w7.x5.c(-1.0f, -1));
                fg0Var.Q.n = new k2.c0(fg0Var, 14);
                fg0Var.h = new eg0(fg0Var, context, i12);
                eg0 eg0Var2 = fg0Var.h;
                Objects.requireNonNull(eg0Var2);
                fg0Var.R = new lo0(new bc0(eg0Var2, 11), true);
                fg0Var.h.setWillNotDraw(false);
                fg0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                fg0Var.h.addView(view3, w7.x5.c(-1.0f, -1));
                int dp2 = AndroidUtilities.dp(8.0f);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.pip_video_close);
                int i14 = org.telegram.ui.ActionBar.j6.hg;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(w02, mode);
                int i15 = org.telegram.ui.ActionBar.j6.i6;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                imageView.setPadding(dp2, dp2, dp2, dp2);
                imageView.setOnClickListener(new ai.e2(12));
                float f11 = 38;
                float f12 = 4;
                fg0Var.h.addView(imageView, w7.x5.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ai.j3(6, fg0Var, z12));
                fg0Var.h.addView(imageView2, w7.x5.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                fg0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), mode);
                fg0Var.X.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i15, false), 1, -1));
                int i16 = 8;
                fg0Var.X.setOnClickListener(new x70(fg0Var, i16));
                View view4 = fg0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof qf0);
                fg0Var.n = z13;
                ImageView imageView4 = fg0Var.X;
                if (!z13 || ((qf0Var2 = fg0Var.r) != null && qf0Var2.x)) {
                    i16 = 0;
                }
                imageView4.setVisibility(i16);
                fg0Var.h.addView(fg0Var.X, w7.x5.e(38, 38, 17));
                ai.n4 n4Var = new ai.n4(fg0Var, context);
                fg0Var.b0 = n4Var;
                fg0Var.h.addView(n4Var, w7.x5.c(-1.0f, -1));
                fg0Var.e.addView(fg0Var.h, w7.x5.c(-1.0f, -1));
                fg0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = sf.c.b(context, z12);
                fg0Var.c = b10;
                int i17 = fg0Var.H;
                b10.width = i17;
                b10.height = fg0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i17 / 2.0f) + f7;
                    int i18 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i18) / 2.0f ? (i18 - i17) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    fg0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i17) - AndroidUtilities.dp(16.0f);
                    fg0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = fg0Var.c;
                    float a2 = w7.p.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - fg0Var.I);
                    fg0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = fg0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    fg0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = fg0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(fg0Var.b, fg0Var.d, layoutParams3);
                if (z11) {
                    fg0Var.b.addView(fg0Var.d, fg0Var.c);
                    return true;
                }
                fg0Var.d.setAlpha(0.0f);
                fg0Var.d.setScaleX(0.1f);
                fg0Var.d.setScaleY(0.1f);
                fg0Var.b.addView(fg0Var.d, fg0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(qr.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(fg0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(fg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(fg0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!fg0Var.P) {
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
        this.l0.setSurfaceTextureListener(new j50(this, 1));
        return this.l0;
    }

    public final void i() {
        org.telegram.ui.mt0 mt0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (mt0Var = photoViewer.c4) == null) {
            return;
        }
        mt0Var.cancelRewind();
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
                AndroidUtilities.runOnUIThread(new ag0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(qr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new cg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        h71 h71Var = this.V.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        h71 h71Var = this.V.F2;
        if (h71Var == null) {
            return 0L;
        }
        return h71Var.p();
    }

    public final com.google.firebase.messaging.v n() {
        if (this.G == null) {
            Point point = AndroidUtilities.displaySize;
            this.G = new com.google.firebase.messaging.v(point.x, point.y);
        }
        return this.G;
    }

    public final float q() {
        if (this.O == null) {
            this.O = Float.valueOf(this.T / this.S);
            Point point = AndroidUtilities.displaySize;
            this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / t();
            float f7 = this.O.floatValue() < 1.0f ? 0.6f : 0.45f;
            x61 x61Var = this.Q;
            x61Var.q = f7;
            x61Var.a();
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
        this.F.addUpdateListener(new h70(this, 3));
        this.F.addListener(new cg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        qf0 qf0Var = this.r;
        if (qf0Var != null) {
            y3 = qf0Var.G;
        } else {
            h71 h71Var = photoViewer.F2;
            if (h71Var == null) {
                return;
            } else {
                y3 = h71Var.y();
            }
        }
        ag0 ag0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(ag0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(ag0Var, 500L);
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
