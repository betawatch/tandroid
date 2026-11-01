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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sr;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u1 implements VoIPService.StateListener, lf.a, vs {
    public static boolean U = false;
    public static u1 V;
    public static u1 W;
    public static int X;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public boolean K;
    public long L;
    public int M;
    public AnimatorSet O;
    public z1 R;
    public com.google.android.gms.internal.cast.o S;
    public final fg.i a;
    public final t1 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public jf.f e;
    public final int f;
    public final int h;
    public final View n;
    public final z1 r;
    public final z1 s;
    public float w;
    public ValueAnimator x;
    public final bg.k y = new bg.k(this, 24);
    public final float[] D = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(7);
    public final q1 P = new q1(this, 0);
    public final q1 Q = new q1(this, 1);
    public final s1 T = new s1(this);

    public u1(Context context, int i10, int i11, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        fg.i iVar = new fg.i(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 18);
        this.a = iVar;
        iVar.setWillNotDraw(false);
        iVar.setPadding(i13, i12, i13, i12);
        t1 t1Var = new t1(this, context);
        this.b = t1Var;
        z1 z1Var = new z1(context, false, true);
        this.s = z1Var;
        z1Var.a0 = 3;
        z1 z1Var2 = new z1(context, false, true);
        this.r = z1Var2;
        z1Var2.d.setMirror(true);
        t1Var.addView(z1Var);
        t1Var.addView(z1Var2);
        t1Var.setBackgroundColor(-7829368);
        iVar.addView(t1Var);
        iVar.setClipChildren(false);
        iVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.o(-16777216, 76), 0}));
            t1Var.addView(view, -1, org.telegram.messenger.i0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            imageView.setContentDescription(dd.L0(2131752041, null));
            t1Var.addView(imageView, b6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            imageView2.setContentDescription(dd.L0(2131747833, null));
            t1Var.addView(imageView2, b6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bh.c(12));
            imageView2.setOnClickListener(new sr(27, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        f();
    }

    public static void a() {
        if (U) {
            return;
        }
        u1 u1Var = W;
        if (u1Var != null) {
            u1Var.b();
        }
        u1 u1Var2 = V;
        if (u1Var2 != null) {
            u1Var2.b();
        }
        W = null;
        V = null;
    }

    public static u1 d() {
        u1 u1Var = W;
        return u1Var != null ? u1Var : V;
    }

    public static void e(Activity activity, int i10, int i11, int i12, int i13) {
        if (V != null || VideoCapturerDevice.eglBase == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        float f7 = i12;
        float f10 = f7 * 0.4f;
        float f11 = i11;
        float f12 = 0.4f * f11;
        layoutParams.height = (int) ((f7 * 0.25f) + ((((int) ((f10 * 1.05f) - f10)) / 2) * 2));
        layoutParams.width = (int) ((f11 * 0.25f) + ((((int) ((1.05f * f12) - f12)) / 2) * 2));
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        Typeface typeface = org.telegram.messenger.i0.a;
        if (!Settings.canDrawOverlays(activity)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 16778120;
        V = new u1(activity, i11, i12, false);
        WindowManager windowManager = Settings.canDrawOverlays(activity) ? (WindowManager) org.telegram.messenger.w0.b.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        u1 u1Var = V;
        u1Var.M = i10;
        u1Var.c = windowManager;
        u1Var.d = layoutParams;
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        u1 u1Var2 = V;
        u1Var2.getClass();
        Point point = org.telegram.messenger.i0.q;
        float f15 = point.x;
        float f16 = point.y;
        float L = org.telegram.messenger.i0.L(16.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        float L3 = org.telegram.messenger.i0.L(60.0f);
        float L4 = org.telegram.messenger.i0.L(16.0f);
        float f17 = u1Var2.f * 0.25f;
        float f18 = u1Var2.h * 0.25f;
        t1 t1Var = u1Var2.b;
        if (t1Var.getMeasuredWidth() != 0) {
            f17 = t1Var.getMeasuredWidth();
        }
        if (t1Var.getMeasuredWidth() != 0) {
            f18 = t1Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = u1Var2.d;
        layoutParams2.x = (int) (((((f15 - L) - L2) - f17) * f13) - (u1Var2.E - L));
        layoutParams2.y = (int) (((((f16 - L3) - L4) - f18) * f14) - (u1Var2.F - L3));
        org.telegram.messenger.i0.S3(u1Var2.c, u1Var2.a, layoutParams2);
        at.e().b(V, at.D2);
        windowManager.addView(V.a, layoutParams);
        V.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        V.s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), V.T);
        if (i13 == 0) {
            V.a.setScaleX(0.5f);
            V.a.setScaleY(0.5f);
            V.a.setAlpha(0.0f);
            V.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u1 u1Var3 = V;
                sharedInstance.setSinks(u1Var3.r.d, u1Var3.s.d);
            }
        } else if (i13 == 1) {
            V.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                u1 u1Var4 = V;
                sharedInstance2.setBackgroundSinks(u1Var4.r.d, u1Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && mf.b.a(activity) == 1) {
            u1 u1Var5 = V;
            jf.e eVar = new jf.e(activity, u1Var5);
            eVar.c = "voip-pip";
            eVar.e = 1;
            z1 z1Var = u1Var5.s;
            eVar.j = z1Var.d;
            eVar.k = z1Var.getPlaceholderView();
            u1Var5.e = eVar.a();
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
            float[] fArr = this.D;
            int i10 = t1.h;
            t1Var.getClass();
            Point point = org.telegram.messenger.i0.q;
            float f7 = point.x;
            float f10 = point.y;
            u1 u1Var = t1Var.f;
            int i11 = u1Var.d.x;
            t1 t1Var2 = u1Var.b;
            float left = t1Var2.getLeft() + i11;
            float f11 = t1Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - t1Var.c) - t1Var2.getMeasuredWidth());
            float top = t1Var2.getTop() + u1Var.d.y;
            float f12 = t1Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - t1Var.e) - t1Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.w0.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.D[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.D[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        jf.f fVar = this.e;
        if (fVar != null) {
            fVar.c();
            this.e = null;
        }
        at.e().n(this, at.D2);
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.S = oVar;
        z1 z1Var = this.s;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.R.d);
        }
        WindowManager windowManager = this.c;
        fg.i iVar = this.a;
        windowManager.removeView(iVar);
        iVar.invalidate();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.D2) {
            a();
        }
    }

    public final void f() {
        boolean z10 = this.b.getMeasuredWidth() != 0;
        boolean z11 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.H = sharedInstance.getRemoteVideoState() == 2;
            this.G = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            z1 z1Var = this.r;
            z1Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            z1Var.setIsScreencast(sharedInstance.isScreencast());
            z1Var.d(false, 1.0f);
        }
        if (!z10) {
            this.w = this.H ? 1.0f : 0.0f;
            return;
        }
        if (z11 != this.H) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, this.H ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(this.y);
            this.x.setDuration(300L).setInterpolator(gr.f);
            this.x.start();
        }
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.S = oVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        fg.i iVar = this.a;
        windowManager.addView(iVar, layoutParams);
        z1 z1Var = this.R;
        if (z1Var != null) {
            z1Var.d.release();
            this.R = null;
        }
        iVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.s.d);
        }
    }

    @Override // lf.a
    public final Bitmap i() {
        z1 z1Var = this.R;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.R.d.getBitmap();
    }

    @Override // lf.a
    public final Bitmap m() {
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

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        f();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            jf.f fVar = this.e;
            if (fVar != null) {
                fVar.c();
                this.e = null;
            }
        } else {
            Context context = V.a.getContext();
            if (this.e == null && mf.b.a(context) == 1 && (context instanceof Activity)) {
                jf.e eVar = new jf.e((Activity) context, this);
                eVar.c = "voip-pip";
                eVar.e = 1;
                z1 z1Var = this.s;
                eVar.j = z1Var.d;
                eVar.k = z1Var.getPlaceholderView();
                this.e = eVar.a();
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
        if (!z10 && this.G) {
            sharedInstance.setVideoState(false, 1);
        } else if (z10 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            org.telegram.messenger.i0.h3(new n0(1), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            a();
        } else if (i10 != 3 || sharedInstance.isVideoAvailable()) {
            f();
        } else {
            a();
        }
    }

    @Override // lf.a
    public final /* synthetic */ boolean q() {
        return true;
    }

    @Override // lf.a
    public final View r() {
        z1 z1Var = new z1(this.s.getContext(), false, true, false, false);
        this.R = z1Var;
        z1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        z1 z1Var2 = this.R;
        z1Var2.a0 = 1;
        z1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new r1(this));
        View view = this.R.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.R;
    }

    @Override // lf.a
    public final /* synthetic */ void l(Canvas canvas) {
    }

    @Override // lf.a
    public final /* synthetic */ void o(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }
}
