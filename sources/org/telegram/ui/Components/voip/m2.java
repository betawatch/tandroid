package org.telegram.ui.Components.voip;

import ai.aa;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vh;
import org.webrtc.RendererCommon;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m2 implements VoIPService.StateListener, sf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean U = false;
    public static m2 V;
    public static m2 W;
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
    public s2 R;
    public com.google.android.gms.internal.cast.p S;
    public final m6 a;
    public final l2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public qf.e e;
    public final int f;
    public final int h;
    public final View n;
    public final s2 r;
    public final s2 s;
    public float v;
    public ValueAnimator w;
    public final r0 x = new r0(this, 4);
    public final float[] y = new float[2];
    public final aa N = new aa(6);
    public final i2 P = new i2(this, 0);
    public final i2 Q = new i2(this, 1);
    public final k2 T = new k2(this);

    public m2(int i10, int i11, Context context, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        m6 m6Var = new m6(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 15);
        this.a = m6Var;
        m6Var.setWillNotDraw(false);
        m6Var.setPadding(i13, i12, i13, i12);
        l2 l2Var = new l2(this, context);
        this.b = l2Var;
        s2 s2Var = new s2(context, false, true);
        this.s = s2Var;
        s2Var.a0 = 3;
        s2 s2Var2 = new s2(context, false, true);
        this.r = s2Var2;
        s2Var2.d.setMirror(true);
        l2Var.addView(s2Var);
        l2Var.addView(s2Var2);
        l2Var.setBackgroundColor(-7829368);
        m6Var.addView(l2Var);
        m6Var.setClipChildren(false);
        m6Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            l2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            l2Var.addView(imageView, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 53));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            l2Var.addView(imageView2, x5.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 51));
            imageView.setOnClickListener(new ai.e2(15));
            imageView2.setOnClickListener(new ut(26, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (U) {
            return;
        }
        m2 m2Var = W;
        if (m2Var != null) {
            m2Var.j();
        }
        m2 m2Var2 = V;
        if (m2Var2 != null) {
            m2Var2.j();
        }
        W = null;
        V = null;
    }

    public static m2 k() {
        m2 m2Var = W;
        return m2Var != null ? m2Var : V;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
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
        if (!AndroidUtilities.checkInlinePermissions(activity)) {
            layoutParams.type = 99;
        } else if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.flags = 16778120;
        V = new m2(i11, i12, activity, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        m2 m2Var = V;
        m2Var.M = i10;
        m2Var.c = windowManager;
        m2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        m2 m2Var2 = V;
        m2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f15 = point.x;
        float f16 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f17 = m2Var2.f * 0.25f;
        float f18 = m2Var2.h * 0.25f;
        l2 l2Var = m2Var2.b;
        if (l2Var.getMeasuredWidth() != 0) {
            f17 = l2Var.getMeasuredWidth();
        }
        if (l2Var.getMeasuredWidth() != 0) {
            f18 = l2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = m2Var2.d;
        layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (m2Var2.E - dp));
        layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (m2Var2.F - dp3));
        AndroidUtilities.updateViewLayout(m2Var2.c, m2Var2.a, layoutParams2);
        NotificationCenter.getGlobalInstance().addObserver(V, NotificationCenter.didEndCall);
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
                m2 m2Var3 = V;
                sharedInstance.setSinks(m2Var3.r.d, m2Var3.s.d);
            }
        } else if (i13 == 1) {
            V.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                m2 m2Var4 = V;
                sharedInstance2.setBackgroundSinks(m2Var4.r.d, m2Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
            m2 m2Var5 = V;
            qf.d dVar = new qf.d(activity, m2Var5);
            dVar.c = "voip-pip";
            dVar.e = 1;
            s2 s2Var = m2Var5.s;
            dVar.j = s2Var.d;
            dVar.k = s2Var.getPlaceholderView();
            m2Var5.e = dVar.a();
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        s2 s2Var = this.s;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.R.d);
        }
        WindowManager windowManager = this.c;
        m6 m6Var = this.a;
        windowManager.removeView(m6Var);
        m6Var.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        m6 m6Var = this.a;
        windowManager.addView(m6Var, layoutParams);
        s2 s2Var = this.R;
        if (s2Var != null) {
            s2Var.d.release();
            this.R = null;
        }
        m6Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.s.d);
        }
    }

    @Override // sf.a
    public final Bitmap c() {
        s2 s2Var = this.R;
        if (s2Var == null || !s2Var.d.isAvailable()) {
            return null;
        }
        return this.R.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override // sf.a
    public final Bitmap e() {
        s2 s2Var = this.s;
        if (s2Var == null) {
            return null;
        }
        r2 r2Var = s2Var.d;
        if (r2Var.isAvailable()) {
            return r2Var.getBitmap();
        }
        return null;
    }

    @Override // sf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // sf.a
    public final View h() {
        s2 s2Var = new s2(this.s.getContext(), false, true, false, false);
        this.R = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        s2 s2Var2 = this.R;
        s2Var2.a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j2(this));
        View view = this.R.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.R;
    }

    public final void j() {
        this.r.d.release();
        this.s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            l2 l2Var = this.b;
            float[] fArr = this.y;
            int i10 = l2.h;
            l2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            float f7 = point.x;
            float f10 = point.y;
            m2 m2Var = l2Var.f;
            int i11 = m2Var.d.x;
            l2 l2Var2 = m2Var.b;
            float left = l2Var2.getLeft() + i11;
            float f11 = l2Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - l2Var.c) - l2Var2.getMeasuredWidth());
            float top = l2Var2.getTop() + m2Var.d.y;
            float f12 = l2Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - l2Var.e) - l2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.y[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.y[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        qf.e eVar = this.e;
        if (eVar != null) {
            eVar.c();
            this.e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10 = this.b.getMeasuredWidth() != 0;
        boolean z11 = this.H;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.H = sharedInstance.getRemoteVideoState() == 2;
            this.G = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            s2 s2Var = this.r;
            s2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            s2Var.setIsScreencast(sharedInstance.isScreencast());
            s2Var.d(1.0f, false);
        }
        if (!z10) {
            this.v = this.H ? 1.0f : 0.0f;
            return;
        }
        if (z11 != this.H) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, this.H ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(this.x);
            this.w.setDuration(300L).setInterpolator(hs.f);
            this.w.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            qf.e eVar = this.e;
            if (eVar != null) {
                eVar.c();
                this.e = null;
            }
        } else {
            Context context = V.a.getContext();
            if (this.e == null && tf.c.a(context) == 1 && (context instanceof Activity)) {
                qf.d dVar = new qf.d((Activity) context, this);
                dVar.c = "voip-pip";
                dVar.e = 1;
                s2 s2Var = this.s;
                dVar.j = s2Var.d;
                dVar.k = s2Var.getPlaceholderView();
                this.e = dVar.a();
            }
        }
        m();
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
            AndroidUtilities.runOnUIThread(new vh(16), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            i();
        } else if (i10 != 3 || sharedInstance.isVideoAvailable()) {
            m();
        } else {
            i();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
    }
}
