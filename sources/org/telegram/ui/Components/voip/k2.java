package org.telegram.ui.Components.voip;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ue;
import org.webrtc.RendererCommon;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k2 implements VoIPService.StateListener, sf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean T = false;
    public static k2 U;
    public static k2 V;
    public static int W;
    public final int E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public boolean J;
    public long K;
    public int L;
    public AnimatorSet N;
    public q2 Q;
    public com.google.android.gms.internal.cast.p R;
    public final ah.w a;
    public final j2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public qf.e e;
    public final int f;
    public final int h;
    public final q2 n;
    public final q2 r;
    public float s;
    public ValueAnimator v;
    public final int y;
    public final ki.a w = new ki.a(this, 5);
    public final float[] x = new float[2];
    public final androidx.emoji2.text.n M = new androidx.emoji2.text.n(6);
    public final g2 O = new g2(this, 0);
    public final g2 P = new g2(this, 1);
    public final i2 S = new i2(this);

    public k2(Context context, int i10, int i11, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.E = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.y = i13;
        ah.w wVar = new ah.w(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 17);
        this.a = wVar;
        wVar.setWillNotDraw(false);
        wVar.setPadding(i13, i12, i13, i12);
        j2 j2Var = new j2(this, context);
        this.b = j2Var;
        q2 q2Var = new q2(context, false, true);
        this.r = q2Var;
        q2Var.a0 = 3;
        q2 q2Var2 = new q2(context, false, true);
        this.n = q2Var2;
        q2Var2.d.setMirror(true);
        j2Var.addView(q2Var);
        j2Var.addView(q2Var2);
        j2Var.setBackgroundColor(-7829368);
        wVar.addView(j2Var);
        wVar.setClipChildren(false);
        wVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            j2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            j2Var.addView(imageView, x5.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            j2Var.addView(imageView2, x5.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new ah.f(16));
            imageView2.setOnClickListener(new ct(26, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (T) {
            return;
        }
        k2 k2Var = V;
        if (k2Var != null) {
            k2Var.j();
        }
        k2 k2Var2 = U;
        if (k2Var2 != null) {
            k2Var2.j();
        }
        V = null;
        U = null;
    }

    public static k2 k() {
        k2 k2Var = V;
        return k2Var != null ? k2Var : U;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        if (U != null || VideoCapturerDevice.eglBase == null) {
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
        U = new k2(activity, i11, i12, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        k2 k2Var = U;
        k2Var.L = i10;
        k2Var.c = windowManager;
        k2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        k2 k2Var2 = U;
        k2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f15 = point.x;
        float f16 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f17 = k2Var2.f * 0.25f;
        float f18 = k2Var2.h * 0.25f;
        j2 j2Var = k2Var2.b;
        if (j2Var.getMeasuredWidth() != 0) {
            f17 = j2Var.getMeasuredWidth();
        }
        if (j2Var.getMeasuredWidth() != 0) {
            f18 = j2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = k2Var2.d;
        layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (k2Var2.y - dp));
        layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (k2Var2.E - dp3));
        AndroidUtilities.updateViewLayout(k2Var2.c, k2Var2.a, layoutParams2);
        NotificationCenter.getGlobalInstance().addObserver(U, NotificationCenter.didEndCall);
        windowManager.addView(U.a, layoutParams);
        U.n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        U.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
        if (i13 == 0) {
            U.a.setScaleX(0.5f);
            U.a.setScaleY(0.5f);
            U.a.setAlpha(0.0f);
            U.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                k2 k2Var3 = U;
                sharedInstance.setSinks(k2Var3.n.d, k2Var3.r.d);
            }
        } else if (i13 == 1) {
            U.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                k2 k2Var4 = U;
                sharedInstance2.setBackgroundSinks(k2Var4.n.d, k2Var4.r.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
            k2 k2Var5 = U;
            qf.d dVar = new qf.d(activity, k2Var5);
            dVar.c = "voip-pip";
            dVar.e = 1;
            q2 q2Var = k2Var5.r;
            dVar.j = q2Var.d;
            dVar.k = q2Var.getPlaceholderView();
            k2Var5.e = dVar.a();
        }
    }

    @Override // sf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        q2 q2Var = this.r;
        if (q2Var != null) {
            q2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.Q.d);
        }
        WindowManager windowManager = this.c;
        ah.w wVar = this.a;
        windowManager.removeView(wVar);
        wVar.invalidate();
    }

    @Override // sf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        ah.w wVar = this.a;
        windowManager.addView(wVar, layoutParams);
        q2 q2Var = this.Q;
        if (q2Var != null) {
            q2Var.d.release();
            this.Q = null;
        }
        wVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.r.d);
        }
    }

    @Override // sf.a
    public final Bitmap c() {
        q2 q2Var = this.Q;
        if (q2Var == null || !q2Var.d.isAvailable()) {
            return null;
        }
        return this.Q.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override // sf.a
    public final Bitmap e() {
        q2 q2Var = this.r;
        if (q2Var == null) {
            return null;
        }
        p2 p2Var = q2Var.d;
        if (p2Var.isAvailable()) {
            return p2Var.getBitmap();
        }
        return null;
    }

    @Override // sf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // sf.a
    public final View h() {
        q2 q2Var = new q2(this.r.getContext(), false, true, false, false);
        this.Q = q2Var;
        q2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.Q.d.setEnableHardwareScaler(true);
        this.Q.d.setRotateTextureWithScreen(true);
        q2 q2Var2 = this.Q;
        q2Var2.a0 = 1;
        q2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h2(this));
        View view = this.Q.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Q;
    }

    public final void j() {
        this.n.d.release();
        this.r.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            j2 j2Var = this.b;
            float[] fArr = this.x;
            int i10 = j2.h;
            j2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            float f7 = point.x;
            float f10 = point.y;
            k2 k2Var = j2Var.f;
            int i11 = k2Var.d.x;
            j2 j2Var2 = k2Var.b;
            float left = j2Var2.getLeft() + i11;
            float f11 = j2Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - j2Var.c) - j2Var2.getMeasuredWidth());
            float top = j2Var2.getTop() + k2Var.d.y;
            float f12 = j2Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - j2Var.e) - j2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.x[1]))).apply();
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
        boolean z11 = this.G;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.G = sharedInstance.getRemoteVideoState() == 2;
            this.F = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            q2 q2Var = this.n;
            q2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            q2Var.setIsScreencast(sharedInstance.isScreencast());
            q2Var.d(1.0f, false);
        }
        if (!z10) {
            this.s = this.G ? 1.0f : 0.0f;
            return;
        }
        if (z11 != this.G) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.G ? 1.0f : 0.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.w);
            this.v.setDuration(300L).setInterpolator(pr.f);
            this.v.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
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
            Context context = U.a.getContext();
            if (this.e == null && tf.c.a(context) == 1 && (context instanceof Activity)) {
                qf.d dVar = new qf.d((Activity) context, this);
                dVar.c = "voip-pip";
                dVar.e = 1;
                q2 q2Var = this.r;
                dVar.j = q2Var.d;
                dVar.k = q2Var.getPlaceholderView();
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
        if (!z10 && this.F) {
            sharedInstance.setVideoState(false, 1);
        } else if (z10 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new ue(15), 200L);
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

    @Override // sf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // sf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
    }
}
