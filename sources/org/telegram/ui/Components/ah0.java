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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ah0 implements tf.a {
    public static final ew0 n0 = new ew0(new k2(28), new k2(29));
    public static final ew0 o0 = new ew0(new ug0(0), new ug0(1));
    public static final ah0 p0 = new ah0();
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
    public hp0 R;
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
    public zg0 e;
    public View f;
    public boolean f0;
    public zg0 h;
    public boolean i0;
    public View k0;
    public TextureView l0;
    public boolean m0;
    public boolean n;
    public lg0 r;
    public ScaleGestureDetector s;
    public le.b v;
    public boolean w;
    public boolean x;
    public View y;
    public float a = 1.4f;
    public float J = 1.0f;
    public final t71 Q = new t71(false);
    public final vg0 e0 = new vg0(this, 1);
    public float[] g0 = new float[2];
    public final vg0 h0 = new vg0(this, 2);
    public final vg0 j0 = new vg0(this, 3);

    public static void j(boolean z10) {
        p0.k(z10, false);
    }

    public static fl0 o(float f7, boolean z10) {
        fl0 fl0Var = new fl0();
        float f10 = 1.0f / f7;
        ah0 ah0Var = p0;
        if (ah0Var.P && !z10) {
            fl0Var.a = ah0Var.K;
            fl0Var.b = ah0Var.L + AndroidUtilities.statusBarHeight;
            fl0Var.c = ah0Var.H;
            fl0Var.d = ah0Var.I;
            return fl0Var;
        }
        float f11 = ((SharedPreferences) ah0Var.n().b).getFloat("x", -1.0f);
        float f12 = ((SharedPreferences) ah0Var.n().b).getFloat("y", -1.0f);
        float f13 = ((SharedPreferences) ah0Var.n().b).getFloat("scale_factor", 1.0f);
        fl0Var.c = s(f10) * f13;
        fl0Var.d = ((int) (s(f10) * f10)) * f13;
        if (f11 != -1.0f) {
            float f14 = fl0Var.c;
            float f15 = (f14 / 2.0f) + f11;
            float f16 = AndroidUtilities.displaySize.x;
            fl0Var.a = f15 >= f16 / 2.0f ? (f16 - f14) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        } else {
            fl0Var.a = (AndroidUtilities.displaySize.x - fl0Var.c) - AndroidUtilities.dp(16.0f);
        }
        if (f12 != -1.0f) {
            fl0Var.b = w7.r.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - fl0Var.d) + AndroidUtilities.statusBarHeight;
            return fl0Var;
        }
        fl0Var.b = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
        return fl0Var;
    }

    public static rf.d p() {
        ah0 ah0Var = p0;
        if (ah0Var != null) {
            return ah0Var.W;
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
        ah0 ah0Var = p0;
        t71 t71Var = ah0Var.Q;
        t71Var.e(false);
        t71Var.d(!z10);
        t71Var.f(true);
        ci.i3 i3Var = ah0Var.b0;
        if (i3Var != null) {
            i3Var.invalidate();
        }
        zg0 zg0Var = ah0Var.h;
        if (zg0Var != null) {
            zg0Var.invalidate();
        }
    }

    public static void w(PhotoViewer photoViewer) {
        ah0 ah0Var = p0;
        ah0Var.V = photoViewer;
        c81 c81Var = photoViewer.F2;
        rf.d dVar = ah0Var.W;
        if (dVar != null) {
            dVar.c();
            ah0Var.W = null;
        }
        if (c81Var != null && uf.b.a(photoViewer.y) == 1) {
            rf.c cVar = new rf.c(photoViewer.y, ah0Var);
            cVar.c = "photo-viewer-pip-" + c81Var.a;
            cVar.e = 1;
            cVar.d = AndroidUtilities.dp(10.0f);
            cVar.j = ah0Var.d;
            cVar.k = ah0Var.k0;
            int i10 = ah0Var.S;
            int i11 = ah0Var.T;
            cVar.h = i10;
            cVar.i = i11;
            cVar.g = c81Var.d;
            cVar.f = true;
            ah0Var.W = cVar.a();
        }
        ah0Var.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(boolean z10, Activity activity, lg0 lg0Var, View view, int i10, int i11, boolean z11) {
        boolean z12;
        lg0 lg0Var2;
        final ah0 ah0Var = p0;
        final int i12 = 1;
        final int i13 = 0;
        if (!z10) {
            ah0Var.getClass();
            if (uf.b.a(ApplicationLoader.applicationContext) != 1) {
                z12 = false;
                if (!ah0Var.P) {
                    return false;
                }
                ah0Var.P = true;
                ah0Var.S = i10;
                ah0Var.T = i11;
                ah0Var.O = null;
                if (lg0Var == null || !lg0Var.x) {
                    ah0Var.r = null;
                } else {
                    ah0Var.r = lg0Var;
                }
                float f7 = ((SharedPreferences) ah0Var.n().b).getFloat("x", -1.0f);
                float f10 = ((SharedPreferences) ah0Var.n().b).getFloat("y", -1.0f);
                ah0Var.J = ((SharedPreferences) ah0Var.n().b).getFloat("scale_factor", 1.0f);
                ah0Var.H = (int) (ah0Var.t() * ah0Var.J);
                ah0Var.I = (int) (ah0Var.r() * ah0Var.J);
                ah0Var.E = false;
                o1.k kVar = new o1.k(ah0Var, n0);
                o1.l lVar = new o1.l();
                lVar.a(0.75f);
                lVar.b(650.0f);
                kVar.u = lVar;
                kVar.a(new o1.f(ah0Var) { // from class: org.telegram.ui.Components.wg0
                    public final /* synthetic */ ah0 b;

                    {
                        this.b = ah0Var;
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
                ah0Var.M = kVar;
                o1.k kVar2 = new o1.k(ah0Var, o0);
                o1.l lVar2 = new o1.l();
                lVar2.a(0.75f);
                lVar2.b(650.0f);
                kVar2.u = lVar2;
                kVar2.a(new o1.f(ah0Var) { // from class: org.telegram.ui.Components.wg0
                    public final /* synthetic */ ah0 b;

                    {
                        this.b = ah0Var;
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
                ah0Var.N = kVar2;
                Context context = z12 ? activity : ApplicationLoader.applicationContext;
                int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new mg.b(ah0Var, i12));
                ah0Var.s = scaleGestureDetector;
                scaleGestureDetector.setQuickScaleEnabled(false);
                ah0Var.s.setStylusScaleEnabled(false);
                ah0Var.v = new le.b(context, (u20) new yg0(ah0Var, scaledTouchSlop));
                ah0Var.e = new zg0(ah0Var, context, i13);
                org.telegram.ui.f fVar = new org.telegram.ui.f(ah0Var, context, i12);
                ah0Var.d = fVar;
                fVar.addView(ah0Var.e, w7.z5.c(-1.0f, -1));
                zg0 zg0Var = ah0Var.e;
                float dp = AndroidUtilities.dp(10.0f);
                ci.o1 o1Var = zf.j0.a;
                zg0Var.setOutlineProvider(new zf.i0(0, dp));
                ah0Var.e.setClipToOutline(true);
                ah0Var.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gg, false));
                ah0Var.f = view;
                if (view.getParent() != null) {
                    ((ViewGroup) ah0Var.f.getParent()).removeView(ah0Var.f);
                }
                ah0Var.e.addView(ah0Var.f, w7.z5.c(-1.0f, -1));
                View view2 = new View(context);
                ah0Var.k0 = view2;
                ah0Var.e.addView(view2, w7.z5.c(-1.0f, -1));
                ah0Var.Q.n = new le.b(ah0Var, 10);
                ah0Var.h = new zg0(ah0Var, context, i12);
                zg0 zg0Var2 = ah0Var.h;
                Objects.requireNonNull(zg0Var2);
                ah0Var.R = new hp0(new rc0(zg0Var2, 11), true);
                ah0Var.h.setWillNotDraw(false);
                ah0Var.h.setAlpha(0.0f);
                View view3 = new View(context);
                view3.setBackgroundColor(1275068416);
                ah0Var.h.addView(view3, w7.z5.c(-1.0f, -1));
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
                ah0Var.h.addView(imageView, w7.z5.d(38, f11, 5, 0.0f, f12, f12, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.pip_video_expand);
                imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), mode);
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i15, false), 1, -1));
                imageView2.setPadding(dp2, dp2, dp2, dp2);
                imageView2.setOnClickListener(new ci.h2(6, ah0Var, z12));
                ah0Var.h.addView(imageView2, w7.z5.d(38, f11, 5, 0.0f, f12, 48, 0.0f));
                ImageView imageView3 = new ImageView(context);
                ah0Var.X = imageView3;
                imageView3.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), mode);
                ah0Var.X.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i15, false), 1, -1));
                ah0Var.X.setOnClickListener(new u80(ah0Var, 7));
                View view4 = ah0Var.f;
                boolean z13 = (view4 instanceof WebView) || (view4 instanceof lg0);
                ah0Var.n = z13;
                ah0Var.X.setVisibility((!z13 || ((lg0Var2 = ah0Var.r) != null && lg0Var2.x)) ? 0 : 8);
                ah0Var.h.addView(ah0Var.X, w7.z5.e(38, 38, 17));
                ci.i3 i3Var = new ci.i3(ah0Var, context);
                ah0Var.b0 = i3Var;
                ah0Var.h.addView(i3Var, w7.z5.c(-1.0f, -1));
                ah0Var.e.addView(ah0Var.h, w7.z5.c(-1.0f, -1));
                ah0Var.b = (WindowManager) (z12 ? activity : ApplicationLoader.applicationContext).getSystemService("window");
                WindowManager.LayoutParams b10 = uf.b.b(context, z12);
                ah0Var.c = b10;
                int i16 = ah0Var.H;
                b10.width = i16;
                b10.height = ah0Var.I;
                if (f7 != -1.0f) {
                    float f13 = (i16 / 2.0f) + f7;
                    int i17 = AndroidUtilities.displaySize.x;
                    float dp3 = f13 >= ((float) i17) / 2.0f ? (i17 - i16) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ah0Var.K = dp3;
                    b10.x = (int) dp3;
                } else {
                    float dp4 = (AndroidUtilities.displaySize.x - i16) - AndroidUtilities.dp(16.0f);
                    ah0Var.K = dp4;
                    b10.x = (int) dp4;
                }
                if (f10 != -1.0f) {
                    WindowManager.LayoutParams layoutParams = ah0Var.c;
                    float a2 = w7.r.a(f10, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - AndroidUtilities.dp(16.0f)) - ah0Var.I);
                    ah0Var.L = a2;
                    layoutParams.y = (int) a2;
                } else {
                    WindowManager.LayoutParams layoutParams2 = ah0Var.c;
                    float dp5 = AndroidUtilities.dp(16.0f);
                    ah0Var.L = dp5;
                    layoutParams2.y = (int) dp5;
                }
                WindowManager.LayoutParams layoutParams3 = ah0Var.c;
                layoutParams3.dimAmount = 0.0f;
                layoutParams3.flags = 520;
                AndroidUtilities.setPreferredMaxRefreshRate(ah0Var.b, ah0Var.d, layoutParams3);
                if (z11) {
                    ah0Var.b.addView(ah0Var.d, ah0Var.c);
                    return true;
                }
                ah0Var.d.setAlpha(0.0f);
                ah0Var.d.setScaleX(0.1f);
                ah0Var.d.setScaleY(0.1f);
                ah0Var.b.addView(ah0Var.d, ah0Var.c);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(bs.f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(ah0Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(ah0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(ah0Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
                animatorSet.start();
                return true;
            }
        }
        z12 = true;
        if (!ah0Var.P) {
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
        org.telegram.ui.qs0 qs0Var;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || (qs0Var = photoViewer.c4) == null) {
            return;
        }
        qs0Var.cancelRewind();
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
                AndroidUtilities.runOnUIThread(new vg0(this, i10), 100L);
                return;
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(bs.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
        animatorSet.addListener(new xg0(this, 1));
        animatorSet.start();
    }

    public final long l() {
        if (this.r != null) {
            return r0.getCurrentPosition();
        }
        c81 c81Var = this.V.F2;
        if (c81Var == null) {
            return 0L;
        }
        return c81Var.n();
    }

    public final long m() {
        if (this.r != null) {
            return r0.getVideoDuration();
        }
        c81 c81Var = this.V.F2;
        if (c81Var == null) {
            return 0L;
        }
        return c81Var.p();
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
            t71 t71Var = this.Q;
            t71Var.q = f7;
            t71Var.a();
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
        this.F.addListener(new xg0(this, 0));
        this.F.start();
    }

    public final void z() {
        boolean y3;
        PhotoViewer photoViewer = this.V;
        if (photoViewer == null || this.X == null) {
            return;
        }
        lg0 lg0Var = this.r;
        if (lg0Var != null) {
            y3 = lg0Var.G;
        } else {
            c81 c81Var = photoViewer.F2;
            if (c81Var == null) {
                return;
            } else {
                y3 = c81Var.y();
            }
        }
        vg0 vg0Var = this.e0;
        AndroidUtilities.cancelRunOnUIThread(vg0Var);
        if (y3) {
            this.X.setImageResource(R.drawable.pip_pause_large);
            AndroidUtilities.runOnUIThread(vg0Var, 500L);
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
