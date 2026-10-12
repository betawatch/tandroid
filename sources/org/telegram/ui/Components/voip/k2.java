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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.ve;
import org.webrtc.RendererCommon;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class k2 implements VoIPService.StateListener, tf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean U = false;
    public static k2 V;
    public static k2 W;
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
    public r2 R;
    public com.google.android.gms.internal.cast.p S;
    public final ah.v a;
    public final j2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public rf.d e;
    public final int f;
    public final int h;
    public final View n;
    public final r2 r;
    public final r2 s;
    public float v;
    public ValueAnimator w;
    public final ki.a x = new ki.a(this, 5);
    public final float[] y = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(6);
    public final g2 P = new g2(this, 0);
    public final g2 Q = new g2(this, 1);
    public final i2 T = new i2(this);

    public k2(int i10, int i11, Context context, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        ah.v vVar = new ah.v(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 17);
        this.a = vVar;
        vVar.setWillNotDraw(false);
        vVar.setPadding(i13, i12, i13, i12);
        j2 j2Var = new j2(this, context);
        this.b = j2Var;
        r2 r2Var = new r2(context, false, true);
        this.s = r2Var;
        r2Var.a0 = 3;
        r2 r2Var2 = new r2(context, false, true);
        this.r = r2Var2;
        r2Var2.d.setMirror(true);
        j2Var.addView(r2Var);
        j2Var.addView(r2Var2);
        j2Var.setBackgroundColor(-7829368);
        vVar.addView(j2Var);
        vVar.setClipChildren(false);
        vVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            j2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            j2Var.addView(imageView, a6.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 53));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            j2Var.addView(imageView2, a6.a(40.0f, 4.0f, 4.0f, 4.0f, 0.0f, 40, 51));
            imageView.setOnClickListener(new ah.f(16));
            imageView2.setOnClickListener(new rt(26, this, context));
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
        k2 k2Var = W;
        if (k2Var != null) {
            k2Var.j();
        }
        k2 k2Var2 = V;
        if (k2Var2 != null) {
            k2Var2.j();
        }
        W = null;
        V = null;
    }

    public static k2 k() {
        k2 k2Var = W;
        return k2Var != null ? k2Var : V;
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
        V = new k2(i11, i12, activity, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        k2 k2Var = V;
        k2Var.M = i10;
        k2Var.c = windowManager;
        k2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        k2 k2Var2 = V;
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
        layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (k2Var2.E - dp));
        layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (k2Var2.F - dp3));
        AndroidUtilities.updateViewLayout(k2Var2.c, k2Var2.a, layoutParams2);
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
                k2 k2Var3 = V;
                sharedInstance.setSinks(k2Var3.r.d, k2Var3.s.d);
            }
        } else if (i13 == 1) {
            V.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                k2 k2Var4 = V;
                sharedInstance2.setBackgroundSinks(k2Var4.r.d, k2Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && uf.b.a(activity) == 1) {
            k2 k2Var5 = V;
            rf.c cVar = new rf.c(activity, k2Var5);
            cVar.c = "voip-pip";
            cVar.e = 1;
            r2 r2Var = k2Var5.s;
            cVar.j = r2Var.d;
            cVar.k = r2Var.getPlaceholderView();
            k2Var5.e = cVar.a();
        }
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        r2 r2Var = this.s;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.R.d);
        }
        WindowManager windowManager = this.c;
        ah.v vVar = this.a;
        windowManager.removeView(vVar);
        vVar.invalidate();
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.S = pVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        ah.v vVar = this.a;
        windowManager.addView(vVar, layoutParams);
        r2 r2Var = this.R;
        if (r2Var != null) {
            r2Var.d.release();
            this.R = null;
        }
        vVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.s.d);
        }
    }

    @Override // tf.a
    public final Bitmap c() {
        r2 r2Var = this.R;
        if (r2Var == null || !r2Var.d.isAvailable()) {
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

    @Override // tf.a
    public final Bitmap e() {
        r2 r2Var = this.s;
        if (r2Var == null) {
            return null;
        }
        q2 q2Var = r2Var.d;
        if (q2Var.isAvailable()) {
            return q2Var.getBitmap();
        }
        return null;
    }

    @Override // tf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // tf.a
    public final View h() {
        r2 r2Var = new r2(this.s.getContext(), false, true, false, false);
        this.R = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        r2 r2Var2 = this.R;
        r2Var2.a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h2(this));
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
            j2 j2Var = this.b;
            float[] fArr = this.y;
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
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.y[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.y[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        rf.d dVar = this.e;
        if (dVar != null) {
            dVar.c();
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
            r2 r2Var = this.r;
            r2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            r2Var.setIsScreencast(sharedInstance.isScreencast());
            r2Var.d(1.0f, false);
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
            this.w.setDuration(300L).setInterpolator(es.f);
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
            rf.d dVar = this.e;
            if (dVar != null) {
                dVar.c();
                this.e = null;
            }
        } else {
            Context context = V.a.getContext();
            if (this.e == null && uf.b.a(context) == 1 && (context instanceof Activity)) {
                rf.c cVar = new rf.c((Activity) context, this);
                cVar.c = "voip-pip";
                cVar.e = 1;
                r2 r2Var = this.s;
                cVar.j = r2Var.d;
                cVar.k = r2Var.getPlaceholderView();
                this.e = cVar.a();
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
            AndroidUtilities.runOnUIThread(new ve(17), 200L);
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

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
    }
}
