package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import b8.cg;
import b8.mf;
import gi.j3;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 implements VoIPService.StateListener, wf.a, cs {
    public static boolean V = false;
    public static u1 W;
    public static u1 X;
    public static int Y;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public long M;
    public int N;
    public AnimatorSet P;
    public z1 S;
    public cg T;
    public final ai.c0 a;
    public final t1 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public uf.d e;
    public final int f;
    public final int h;
    public final View n;
    public final z1 r;
    public final z1 s;
    public float w;
    public ValueAnimator x;
    public final j3 y = new j3(this, 21);
    public final float[] E = new float[2];
    public final androidx.emoji2.text.o O = new androidx.emoji2.text.o(9);
    public final q1 Q = new q1(this, 0);
    public final q1 R = new q1(this, 1);
    public final s1 U = new s1(this);

    public u1(Context context, int i3, int i10, boolean z10) {
        this.f = i3;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.G = i11;
        float f11 = i3 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.F = i12;
        ai.c0 c0Var = new ai.c0(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 21);
        this.a = c0Var;
        c0Var.setWillNotDraw(false);
        c0Var.setPadding(i12, i11, i12, i11);
        t1 t1Var = new t1(this, context);
        this.b = t1Var;
        z1 z1Var = new z1(context, false, true);
        this.s = z1Var;
        z1Var.b0 = 3;
        z1 z1Var2 = new z1(context, false, true);
        this.r = z1Var2;
        z1Var2.d.setMirror(true);
        t1Var.addView(z1Var);
        t1Var.addView(z1Var2);
        t1Var.setBackgroundColor(-7829368);
        c0Var.addView(t1Var);
        c0Var.setClipChildren(false);
        c0Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            t1Var.addView(view, -1, org.telegram.messenger.g0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView.setContentDescription(bd.M0(2131752041, null));
            t1Var.addView(imageView, mf.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView2.setContentDescription(bd.M0(2131747825, null));
            t1Var.addView(imageView2, mf.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new ai.t(20));
            imageView2.setOnClickListener(new ux0(10, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        f();
    }

    public static void a() {
        if (V) {
            return;
        }
        u1 u1Var = X;
        if (u1Var != null) {
            u1Var.b();
        }
        u1 u1Var2 = W;
        if (u1Var2 != null) {
            u1Var2.b();
        }
        X = null;
        W = null;
    }

    public static u1 d() {
        u1 u1Var = X;
        return u1Var != null ? u1Var : W;
    }

    public static void e(Activity activity, int i3, int i10, int i11, int i12) {
        if (W != null || VideoCapturerDevice.eglBase == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        float f10 = i11;
        float f11 = f10 * 0.4f;
        float f12 = i10;
        float f13 = 0.4f * f12;
        layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
        layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        Typeface typeface = org.telegram.messenger.g0.a;
        if (!Settings.canDrawOverlays(activity)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 16778120;
        W = new u1(activity, i10, i11, false);
        WindowManager windowManager = Settings.canDrawOverlays(activity) ? (WindowManager) org.telegram.messenger.t0.b.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        u1 u1Var = W;
        u1Var.N = i3;
        u1Var.c = windowManager;
        u1Var.d = layoutParams;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("voippipconfig", 0);
        float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
        u1 u1Var2 = W;
        u1Var2.getClass();
        Point point = org.telegram.messenger.g0.q;
        float f16 = point.x;
        float f17 = point.y;
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        float L3 = org.telegram.messenger.g0.L(60.0f);
        float L4 = org.telegram.messenger.g0.L(16.0f);
        float f18 = u1Var2.f * 0.25f;
        float f19 = u1Var2.h * 0.25f;
        t1 t1Var = u1Var2.b;
        if (t1Var.getMeasuredWidth() != 0) {
            f18 = t1Var.getMeasuredWidth();
        }
        if (t1Var.getMeasuredWidth() != 0) {
            f19 = t1Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = u1Var2.d;
        layoutParams2.x = (int) (((((f16 - L) - L2) - f18) * f14) - (u1Var2.F - L));
        layoutParams2.y = (int) (((((f17 - L3) - L4) - f19) * f15) - (u1Var2.G - L3));
        org.telegram.messenger.g0.T3(u1Var2.c, u1Var2.a, layoutParams2);
        hs.e().b(W, hs.D2);
        windowManager.addView(W.a, layoutParams);
        W.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        W.s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), W.U);
        if (i12 == 0) {
            W.a.setScaleX(0.5f);
            W.a.setScaleY(0.5f);
            W.a.setAlpha(0.0f);
            W.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u1 u1Var3 = W;
                sharedInstance.setSinks(u1Var3.r.d, u1Var3.s.d);
            }
        } else if (i12 == 1) {
            W.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                u1 u1Var4 = W;
                sharedInstance2.setBackgroundSinks(u1Var4.r.d, u1Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && xf.b.a(activity) == 1) {
            u1 u1Var5 = W;
            uf.c cVar = new uf.c(activity, u1Var5);
            cVar.c = "voip-pip";
            cVar.e = 1;
            z1 z1Var = u1Var5.s;
            cVar.j = z1Var.d;
            cVar.k = z1Var.getPlaceholderView();
            u1Var5.e = cVar.a();
        }
    }

    public final void b() {
        this.r.d.release();
        this.s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            t1 t1Var = this.b;
            float[] fArr = this.E;
            int i3 = t1.h;
            t1Var.getClass();
            Point point = org.telegram.messenger.g0.q;
            float f10 = point.x;
            float f11 = point.y;
            u1 u1Var = t1Var.f;
            int i10 = u1Var.d.x;
            t1 t1Var2 = u1Var.b;
            float left = t1Var2.getLeft() + i10;
            float f12 = t1Var.b;
            fArr[0] = (left - f12) / (((f10 - f12) - t1Var.c) - t1Var2.getMeasuredWidth());
            float top = t1Var2.getTop() + u1Var.d.y;
            float f13 = t1Var.d;
            fArr[1] = (top - f13) / (((f11 - f13) - t1Var.e) - t1Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.t0.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        uf.d dVar = this.e;
        if (dVar != null) {
            dVar.c();
            this.e = null;
        }
        hs.e().n(this, hs.D2);
    }

    @Override // wf.a
    public final void c(cg cgVar) {
        this.T = cgVar;
        z1 z1Var = this.s;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.S.d);
        }
        WindowManager windowManager = this.c;
        ai.c0 c0Var = this.a;
        windowManager.removeView(c0Var);
        c0Var.invalidate();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.D2) {
            a();
        }
    }

    public final void f() {
        boolean z10 = this.b.getMeasuredWidth() != 0;
        boolean z11 = this.I;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.I = sharedInstance.getRemoteVideoState() == 2;
            this.H = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            z1 z1Var = this.r;
            z1Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            z1Var.setIsScreencast(sharedInstance.isScreencast());
            z1Var.d(false, 1.0f);
        }
        if (!z10) {
            this.w = this.I ? 1.0f : 0.0f;
            return;
        }
        if (z11 != this.I) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, this.I ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(this.y);
            this.x.setDuration(300L).setInterpolator(xq.f);
            this.x.start();
        }
    }

    @Override // wf.a
    public final Bitmap g() {
        z1 z1Var = this.S;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.S.d.getBitmap();
    }

    @Override // wf.a
    public final Bitmap l() {
        z1 z1Var = this.s;
        if (z1Var == null) {
            return null;
        }
        y1 y1Var = z1Var.d;
        if (y1Var.isAvailable()) {
            return y1Var.getBitmap();
        }
        return null;
    }

    @Override // wf.a
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        f();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i3, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            uf.d dVar = this.e;
            if (dVar != null) {
                dVar.c();
                this.e = null;
            }
        } else {
            Context context = W.a.getContext();
            if (this.e == null && xf.b.a(context) == 1 && (context instanceof Activity)) {
                uf.c cVar = new uf.c((Activity) context, this);
                cVar.c = "voip-pip";
                cVar.e = 1;
                z1 z1Var = this.s;
                cVar.j = z1Var.d;
                cVar.k = z1Var.getPlaceholderView();
                this.e = cVar.a();
            }
        }
        f();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!z10 && this.H) {
            sharedInstance.setVideoState(false, 1);
        } else if (z10 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        if (i3 == 11 || i3 == 17 || i3 == 4 || i3 == 10) {
            org.telegram.messenger.g0.i3(new go(14), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            a();
        } else if (i3 != 3 || sharedInstance.isVideoAvailable()) {
            f();
        } else {
            a();
        }
    }

    @Override // wf.a
    public final View q() {
        z1 z1Var = new z1(this.s.getContext(), false, true, false, false);
        this.S = z1Var;
        z1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.S.d.setEnableHardwareScaler(true);
        this.S.d.setRotateTextureWithScreen(true);
        z1 z1Var2 = this.S;
        z1Var2.b0 = 1;
        z1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new r1(this));
        View view = this.S.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.S;
    }

    @Override // wf.a
    public final void r(cg cgVar) {
        this.T = cgVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        ai.c0 c0Var = this.a;
        windowManager.addView(c0Var, layoutParams);
        z1 z1Var = this.S;
        if (z1Var != null) {
            z1Var.d.release();
            this.S = null;
        }
        c0Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.s.d);
        }
    }

    @Override // wf.a
    public final /* synthetic */ void i(Canvas canvas) {
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i3) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }
}
