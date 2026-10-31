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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sr;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 implements VoIPService.StateListener, lf.a, us {
    public static boolean U = false;
    public static t1 V;
    public static t1 W;
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
    public y1 R;
    public com.google.android.gms.internal.cast.o S;
    public final fg.i a;
    public final s1 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public jf.f e;
    public final int f;
    public final int h;
    public final View n;
    public final y1 r;
    public final y1 s;
    public float w;
    public ValueAnimator x;
    public final bg.k y = new bg.k(this, 24);
    public final float[] D = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(7);
    public final p1 P = new p1(this, 0);
    public final p1 Q = new p1(this, 1);
    public final r1 T = new r1(this);

    public t1(Context context, int i10, int i11, boolean z10) {
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
        s1 s1Var = new s1(this, context);
        this.b = s1Var;
        y1 y1Var = new y1(context, false, true);
        this.s = y1Var;
        y1Var.a0 = 3;
        y1 y1Var2 = new y1(context, false, true);
        this.r = y1Var2;
        y1Var2.d.setMirror(true);
        s1Var.addView(y1Var);
        s1Var.addView(y1Var2);
        s1Var.setBackgroundColor(-7829368);
        iVar.addView(s1Var);
        iVar.setClipChildren(false);
        iVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.o(-16777216, 76), 0}));
            s1Var.addView(view, -1, org.telegram.messenger.i0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            imageView.setContentDescription(cd.L0(2131752041, null));
            s1Var.addView(imageView, b6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            imageView2.setContentDescription(cd.L0(2131747833, null));
            s1Var.addView(imageView2, b6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
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
        t1 t1Var = W;
        if (t1Var != null) {
            t1Var.b();
        }
        t1 t1Var2 = V;
        if (t1Var2 != null) {
            t1Var2.b();
        }
        W = null;
        V = null;
    }

    public static t1 d() {
        t1 t1Var = W;
        return t1Var != null ? t1Var : V;
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
        V = new t1(activity, i11, i12, false);
        WindowManager windowManager = Settings.canDrawOverlays(activity) ? (WindowManager) org.telegram.messenger.w0.b.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        t1 t1Var = V;
        t1Var.M = i10;
        t1Var.c = windowManager;
        t1Var.d = layoutParams;
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        t1 t1Var2 = V;
        t1Var2.getClass();
        Point point = org.telegram.messenger.i0.q;
        float f15 = point.x;
        float f16 = point.y;
        float L = org.telegram.messenger.i0.L(16.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        float L3 = org.telegram.messenger.i0.L(60.0f);
        float L4 = org.telegram.messenger.i0.L(16.0f);
        float f17 = t1Var2.f * 0.25f;
        float f18 = t1Var2.h * 0.25f;
        s1 s1Var = t1Var2.b;
        if (s1Var.getMeasuredWidth() != 0) {
            f17 = s1Var.getMeasuredWidth();
        }
        if (s1Var.getMeasuredWidth() != 0) {
            f18 = s1Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = t1Var2.d;
        layoutParams2.x = (int) (((((f15 - L) - L2) - f17) * f13) - (t1Var2.E - L));
        layoutParams2.y = (int) (((((f16 - L3) - L4) - f18) * f14) - (t1Var2.F - L3));
        org.telegram.messenger.i0.S3(t1Var2.c, t1Var2.a, layoutParams2);
        zs.e().b(V, zs.D2);
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
                t1 t1Var3 = V;
                sharedInstance.setSinks(t1Var3.r.d, t1Var3.s.d);
            }
        } else if (i13 == 1) {
            V.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                t1 t1Var4 = V;
                sharedInstance2.setBackgroundSinks(t1Var4.r.d, t1Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && mf.b.a(activity) == 1) {
            t1 t1Var5 = V;
            jf.e eVar = new jf.e(activity, t1Var5);
            eVar.c = "voip-pip";
            eVar.e = 1;
            y1 y1Var = t1Var5.s;
            eVar.j = y1Var.d;
            eVar.k = y1Var.getPlaceholderView();
            t1Var5.e = eVar.a();
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
            s1 s1Var = this.b;
            float[] fArr = this.D;
            int i10 = s1.h;
            s1Var.getClass();
            Point point = org.telegram.messenger.i0.q;
            float f7 = point.x;
            float f10 = point.y;
            t1 t1Var = s1Var.f;
            int i11 = t1Var.d.x;
            s1 s1Var2 = t1Var.b;
            float left = s1Var2.getLeft() + i11;
            float f11 = s1Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - s1Var.c) - s1Var2.getMeasuredWidth());
            float top = s1Var2.getTop() + t1Var.d.y;
            float f12 = s1Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - s1Var.e) - s1Var2.getMeasuredHeight());
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
        zs.e().n(this, zs.D2);
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.S = oVar;
        y1 y1Var = this.s;
        if (y1Var != null) {
            y1Var.d.clearFirstFrame();
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

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.D2) {
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
            y1 y1Var = this.r;
            y1Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            y1Var.setIsScreencast(sharedInstance.isScreencast());
            y1Var.d(false, 1.0f);
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
        y1 y1Var = this.R;
        if (y1Var != null) {
            y1Var.d.release();
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
        y1 y1Var = this.R;
        if (y1Var == null || !y1Var.d.isAvailable()) {
            return null;
        }
        return this.R.d.getBitmap();
    }

    @Override // lf.a
    public final Bitmap m() {
        y1 y1Var = this.s;
        if (y1Var == null) {
            return null;
        }
        x1 x1Var = y1Var.d;
        if (x1Var.isAvailable()) {
            return x1Var.getBitmap();
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
                y1 y1Var = this.s;
                eVar.j = y1Var.d;
                eVar.k = y1Var.getPlaceholderView();
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
            org.telegram.messenger.i0.h3(new m0(1), 200L);
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
        y1 y1Var = new y1(this.s.getContext(), false, true, false, false);
        this.R = y1Var;
        y1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        y1 y1Var2 = this.R;
        y1Var2.a0 = 1;
        y1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q1(this));
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
    public final /* synthetic */ void n(Canvas canvas) {
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
