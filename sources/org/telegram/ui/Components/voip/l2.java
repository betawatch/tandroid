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
import bi.d5;
import bi.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.wr;
import org.webrtc.RendererCommon;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l2 implements VoIPService.StateListener, rf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean T = false;
    public static l2 U;
    public static l2 V;
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
    public r2 Q;
    public com.google.android.gms.internal.cast.p R;
    public final n7 a;
    public final k2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public pf.e e;
    public final int f;
    public final int h;
    public final r2 n;
    public final r2 r;
    public float s;
    public ValueAnimator v;
    public final int y;
    public final ai.a w = new ai.a(this, 20);
    public final float[] x = new float[2];
    public final androidx.emoji2.text.n M = new androidx.emoji2.text.n(5);
    public final h2 O = new h2(this, 0);
    public final h2 P = new h2(this, 1);
    public final j2 S = new j2(this);

    public l2(Context context, int i10, int i11, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.E = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.y = i13;
        n7 n7Var = new n7(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 15);
        this.a = n7Var;
        n7Var.setWillNotDraw(false);
        n7Var.setPadding(i13, i12, i13, i12);
        k2 k2Var = new k2(this, context);
        this.b = k2Var;
        r2 r2Var = new r2(context, false, true);
        this.r = r2Var;
        r2Var.a0 = 3;
        r2 r2Var2 = new r2(context, false, true);
        this.n = r2Var2;
        r2Var2.d.setMirror(true);
        k2Var.addView(r2Var);
        k2Var.addView(r2Var2);
        k2Var.setBackgroundColor(-7829368);
        n7Var.addView(k2Var);
        n7Var.setClipChildren(false);
        n7Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            k2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            k2Var.addView(imageView, a6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            k2Var.addView(imageView2, a6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new d5(14));
            imageView2.setOnClickListener(new u10(23, this, context));
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
        l2 l2Var = V;
        if (l2Var != null) {
            l2Var.j();
        }
        l2 l2Var2 = U;
        if (l2Var2 != null) {
            l2Var2.j();
        }
        V = null;
        U = null;
    }

    public static l2 k() {
        l2 l2Var = V;
        return l2Var != null ? l2Var : U;
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
        U = new l2(activity, i11, i12, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        l2 l2Var = U;
        l2Var.L = i10;
        l2Var.c = windowManager;
        l2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        l2 l2Var2 = U;
        l2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f15 = point.x;
        float f16 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f17 = l2Var2.f * 0.25f;
        float f18 = l2Var2.h * 0.25f;
        k2 k2Var = l2Var2.b;
        if (k2Var.getMeasuredWidth() != 0) {
            f17 = k2Var.getMeasuredWidth();
        }
        if (k2Var.getMeasuredWidth() != 0) {
            f18 = k2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = l2Var2.d;
        layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (l2Var2.y - dp));
        layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (l2Var2.E - dp3));
        AndroidUtilities.updateViewLayout(l2Var2.c, l2Var2.a, layoutParams2);
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
                l2 l2Var3 = U;
                sharedInstance.setSinks(l2Var3.n.d, l2Var3.r.d);
            }
        } else if (i13 == 1) {
            U.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                l2 l2Var4 = U;
                sharedInstance2.setBackgroundSinks(l2Var4.n.d, l2Var4.r.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
            l2 l2Var5 = U;
            pf.d dVar = new pf.d(activity, l2Var5);
            dVar.c = "voip-pip";
            dVar.e = 1;
            r2 r2Var = l2Var5.r;
            dVar.j = r2Var.d;
            dVar.k = r2Var.getPlaceholderView();
            l2Var5.e = dVar.a();
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        r2 r2Var = this.r;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.Q.d);
        }
        WindowManager windowManager = this.c;
        n7 n7Var = this.a;
        windowManager.removeView(n7Var);
        n7Var.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.R = pVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        n7 n7Var = this.a;
        windowManager.addView(n7Var, layoutParams);
        r2 r2Var = this.Q;
        if (r2Var != null) {
            r2Var.d.release();
            this.Q = null;
        }
        n7Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.r.d);
        }
    }

    @Override // rf.a
    public final Bitmap c() {
        r2 r2Var = this.Q;
        if (r2Var == null || !r2Var.d.isAvailable()) {
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

    @Override // rf.a
    public final Bitmap e() {
        r2 r2Var = this.r;
        if (r2Var == null) {
            return null;
        }
        q2 q2Var = r2Var.d;
        if (q2Var.isAvailable()) {
            return q2Var.getBitmap();
        }
        return null;
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        r2 r2Var = new r2(this.r.getContext(), false, true, false, false);
        this.Q = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.Q.d.setEnableHardwareScaler(true);
        this.Q.d.setRotateTextureWithScreen(true);
        r2 r2Var2 = this.Q;
        r2Var2.a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new i2(this));
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
            k2 k2Var = this.b;
            float[] fArr = this.x;
            int i10 = k2.h;
            k2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            float f7 = point.x;
            float f10 = point.y;
            l2 l2Var = k2Var.f;
            int i11 = l2Var.d.x;
            k2 k2Var2 = l2Var.b;
            float left = k2Var2.getLeft() + i11;
            float f11 = k2Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - k2Var.c) - k2Var2.getMeasuredWidth());
            float top = k2Var2.getTop() + l2Var.d.y;
            float f12 = k2Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - k2Var.e) - k2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.x[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        pf.e eVar = this.e;
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
            r2 r2Var = this.n;
            r2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            r2Var.setIsScreencast(sharedInstance.isScreencast());
            r2Var.d(1.0f, false);
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
            this.v.setDuration(300L).setInterpolator(wr.f);
            this.v.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            pf.e eVar = this.e;
            if (eVar != null) {
                eVar.c();
                this.e = null;
            }
        } else {
            Context context = U.a.getContext();
            if (this.e == null && sf.c.a(context) == 1 && (context instanceof Activity)) {
                pf.d dVar = new pf.d((Activity) context, this);
                dVar.c = "voip-pip";
                dVar.e = 1;
                r2 r2Var = this.r;
                dVar.j = r2Var.d;
                dVar.k = r2Var.getPlaceholderView();
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
            AndroidUtilities.runOnUIThread(new c30(9), 200L);
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

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
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
