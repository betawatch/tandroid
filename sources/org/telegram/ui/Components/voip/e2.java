package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import bi.x5;
import c8.ha;
import c8.kc;
import fi.v3;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e2 implements VoIPService.StateListener, ls {
    public static boolean S = false;
    public static e2 T;
    public static e2 U;
    public static int V;
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
    public final x5 a;
    public final d2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public final int f;
    public final int h;
    public final View n;
    public final k2 r;
    public final k2 s;
    public float w;
    public ValueAnimator x;
    public final v3 y = new v3(this, 20);
    public final float[] D = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(8);
    public final b2 P = new b2(this, 0);
    public final b2 Q = new b2(this, 1);
    public final c2 R = new c2();

    public e2(Context context, int i7, int i10, boolean z9) {
        this.f = i7;
        this.h = i10;
        float f10 = i10 * 0.4f;
        int i11 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.F = i11;
        float f11 = i7 * 0.4f;
        int i12 = ((int) ((1.05f * f11) - f11)) / 2;
        this.E = i12;
        x5 x5Var = new x5(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 19);
        this.a = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setPadding(i12, i11, i12, i11);
        d2 d2Var = new d2(this, context);
        this.b = d2Var;
        k2 k2Var = new k2(context, false, true);
        this.s = k2Var;
        k2Var.a0 = 3;
        k2 k2Var2 = new k2(context, false, true);
        this.r = k2Var2;
        k2Var2.d.setMirror(true);
        d2Var.addView(k2Var);
        d2Var.addView(k2Var2);
        d2Var.setBackgroundColor(-7829368);
        x5Var.addView(d2Var);
        x5Var.setClipChildren(false);
        x5Var.setClipToPadding(false);
        if (z9) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            d2Var.addView(view, -1, org.telegram.messenger.g0.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView.setContentDescription(hd.M0(2131752041, null));
            d2Var.addView(imageView, ha.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            imageView2.setContentDescription(hd.M0(2131747816, null));
            d2Var.addView(imageView2, ha.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bi.l1(14));
            imageView2.setOnClickListener(new t41(4, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        e2 e2Var = T;
        if (e2Var == null || U != null || S || e2Var.a.getParent() == null || kc.a(launchActivity) == e2Var.e) {
            return;
        }
        int i7 = e2Var.M;
        int i10 = e2Var.f;
        int i11 = e2Var.h;
        b();
        f(launchActivity, i7, i10, i11, 0);
    }

    public static void b() {
        if (S) {
            return;
        }
        e2 e2Var = U;
        if (e2Var != null) {
            e2Var.c();
        }
        e2 e2Var2 = T;
        if (e2Var2 != null) {
            e2Var2.c();
        }
        U = null;
        T = null;
        f2.d();
    }

    public static e2 d() {
        e2 e2Var = U;
        return e2Var != null ? e2Var : T;
    }

    public static void f(Activity activity, int i7, int i10, int i11, int i12) {
        if (T != null || VideoCapturerDevice.eglBase == null) {
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
        if (!kc.a(activity)) {
            layoutParams.type = 2;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 16778120;
        e2 e2Var = new e2(activity, i10, i11, false);
        T = e2Var;
        e2Var.e = kc.a(activity);
        WindowManager windowManager = T.e ? (WindowManager) org.telegram.messenger.t0.b.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        e2 e2Var2 = T;
        e2Var2.M = i7;
        e2Var2.c = windowManager;
        e2Var2.d = layoutParams;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("voippipconfig", 0);
        float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
        e2 e2Var3 = T;
        e2Var3.getClass();
        Point point = org.telegram.messenger.g0.q;
        float f16 = point.x;
        float f17 = point.y;
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        float L3 = org.telegram.messenger.g0.L(60.0f);
        float L4 = org.telegram.messenger.g0.L(16.0f);
        float f18 = e2Var3.f * 0.25f;
        float f19 = e2Var3.h * 0.25f;
        d2 d2Var = e2Var3.b;
        if (d2Var.getMeasuredWidth() != 0) {
            f18 = d2Var.getMeasuredWidth();
        }
        if (d2Var.getMeasuredWidth() != 0) {
            f19 = d2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = e2Var3.d;
        layoutParams2.x = (int) (((((f16 - L) - L2) - f18) * f14) - (e2Var3.E - L));
        layoutParams2.y = (int) (((((f17 - L3) - L4) - f19) * f15) - (e2Var3.F - L3));
        org.telegram.messenger.g0.T3(e2Var3.c, e2Var3.a, layoutParams2);
        qs.e().b(T, qs.D2);
        windowManager.addView(T.a, layoutParams);
        T.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        T.s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), T.R);
        if (i12 == 0) {
            T.a.setScaleX(0.5f);
            T.a.setScaleY(0.5f);
            T.a.setAlpha(0.0f);
            T.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                e2 e2Var4 = T;
                sharedInstance.setSinks(e2Var4.r.d, e2Var4.s.d);
            }
        } else if (i12 == 1) {
            T.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                e2 e2Var5 = T;
                sharedInstance2.setBackgroundSinks(e2Var5.r.d, e2Var5.s.d);
            }
        }
        f2.d();
    }

    public final void c() {
        this.r.d.release();
        this.s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            d2 d2Var = this.b;
            float[] fArr = this.D;
            int i7 = d2.h;
            d2Var.getClass();
            Point point = org.telegram.messenger.g0.q;
            float f10 = point.x;
            float f11 = point.y;
            e2 e2Var = d2Var.f;
            int i10 = e2Var.d.x;
            d2 d2Var2 = e2Var.b;
            float left = d2Var2.getLeft() + i10;
            float f12 = d2Var.b;
            fArr[0] = (left - f12) / (((f10 - f12) - d2Var.c) - d2Var2.getMeasuredWidth());
            float top = d2Var2.getTop() + e2Var.d.y;
            float f13 = d2Var.d;
            fArr[1] = (top - f13) / (((f11 - f13) - d2Var.e) - d2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            org.telegram.messenger.t0.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.D[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.D[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        qs.e().n(this, qs.D2);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.D2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (this.e || kc.b(org.telegram.messenger.t0.b) || (sharedInstance = VoIPService.getSharedInstance()) == null || !this.G) {
            return;
        }
        sharedInstance.setVideoState(false, 1);
    }

    public final void g() {
        boolean z9 = this.b.getMeasuredWidth() != 0;
        boolean z10 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.H = sharedInstance.getRemoteVideoState() == 2;
            this.G = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            k2 k2Var = this.r;
            k2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            k2Var.setIsScreencast(sharedInstance.isScreencast());
            k2Var.d(false, 1.0f);
        }
        if (!z9) {
            this.w = this.H ? 1.0f : 0.0f;
            return;
        }
        if (z10 != this.H) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, this.H ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(this.y);
            this.x.setDuration(300L).setInterpolator(xq.f);
            this.x.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z9) {
        g();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i7, int i10) {
        f2.d();
        g();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!z9 && this.G) {
            sharedInstance.setVideoState(false, 1);
        } else if (z9 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        if (i7 == 11 || i7 == 17 || i7 == 4 || i7 == 10) {
            org.telegram.messenger.g0.i3(new l10(12), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            b();
        } else if (i7 != 3 || sharedInstance.isVideoAvailable()) {
            g();
        } else {
            b();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i7) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z9) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }
}
