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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xh0;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l2 implements VoIPService.StateListener, af.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean P = false;
    public static l2 Q;
    public static l2 R;
    public static int S;
    public final int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public boolean F;
    public long G;
    public int H;
    public AnimatorSet J;
    public r2 M;
    public bf.e N;
    public final ag.y1 a;
    public final k2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public ye.d e;
    public final int f;
    public final int h;
    public final r2 n;
    public final r2 r;
    public float s;
    public ValueAnimator v;
    public final int y;
    public final lh.m2 w = new lh.m2(this, 14);
    public final float[] x = new float[2];
    public final androidx.emoji2.text.n I = new androidx.emoji2.text.n(5);
    public final h2 K = new h2(this, 0);
    public final h2 L = new h2(this, 1);
    public final j2 O = new j2(this);

    public l2(Context context, int i10, int i11, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f10 = i11 * 0.4f;
        int i12 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.A = i12;
        float f11 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f11) - f11)) / 2;
        this.y = i13;
        ag.y1 y1Var = new ag.y1(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 17);
        this.a = y1Var;
        y1Var.setWillNotDraw(false);
        y1Var.setPadding(i13, i12, i13, i12);
        k2 k2Var = new k2(this, context);
        this.b = k2Var;
        r2 r2Var = new r2(context, false, true);
        this.r = r2Var;
        r2Var.T = 3;
        r2 r2Var2 = new r2(context, false, true);
        this.n = r2Var2;
        r2Var2.d.setMirror(true);
        k2Var.addView(r2Var);
        k2Var.addView(r2Var2);
        k2Var.setBackgroundColor(-7829368);
        y1Var.addView(k2Var);
        y1Var.setClipChildren(false);
        y1Var.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.b.k(-16777216, 76), 0}));
            k2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            k2Var.addView(imageView, z5.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            k2Var.addView(imageView2, z5.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new ag.l2(19));
            imageView2.setOnClickListener(new xh0(14, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (P) {
            return;
        }
        l2 l2Var = R;
        if (l2Var != null) {
            l2Var.j();
        }
        l2 l2Var2 = Q;
        if (l2Var2 != null) {
            l2Var2.j();
        }
        R = null;
        Q = null;
    }

    public static l2 k() {
        l2 l2Var = R;
        return l2Var != null ? l2Var : Q;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        if (Q != null || VideoCapturerDevice.eglBase == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        float f10 = i12;
        float f11 = f10 * 0.4f;
        float f12 = i11;
        float f13 = 0.4f * f12;
        layoutParams.height = (int) ((f10 * 0.25f) + ((((int) ((f11 * 1.05f) - f11)) / 2) * 2));
        layoutParams.width = (int) ((f12 * 0.25f) + ((((int) ((1.05f * f13) - f13)) / 2) * 2));
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
        Q = new l2(activity, i11, i12, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        l2 l2Var = Q;
        l2Var.H = i10;
        l2Var.c = windowManager;
        l2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
        l2 l2Var2 = Q;
        l2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f16 = point.x;
        float f17 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f18 = l2Var2.f * 0.25f;
        float f19 = l2Var2.h * 0.25f;
        k2 k2Var = l2Var2.b;
        if (k2Var.getMeasuredWidth() != 0) {
            f18 = k2Var.getMeasuredWidth();
        }
        if (k2Var.getMeasuredWidth() != 0) {
            f19 = k2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = l2Var2.d;
        layoutParams2.x = (int) (((((f16 - dp) - dp2) - f18) * f14) - (l2Var2.y - dp));
        layoutParams2.y = (int) (((((f17 - dp3) - dp4) - f19) * f15) - (l2Var2.A - dp3));
        AndroidUtilities.updateViewLayout(l2Var2.c, l2Var2.a, layoutParams2);
        NotificationCenter.getGlobalInstance().addObserver(Q, NotificationCenter.didEndCall);
        windowManager.addView(Q.a, layoutParams);
        Q.n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        Q.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), Q.O);
        if (i13 == 0) {
            Q.a.setScaleX(0.5f);
            Q.a.setScaleY(0.5f);
            Q.a.setAlpha(0.0f);
            Q.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                l2 l2Var3 = Q;
                sharedInstance.setSinks(l2Var3.n.d, l2Var3.r.d);
            }
        } else if (i13 == 1) {
            Q.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                l2 l2Var4 = Q;
                sharedInstance2.setBackgroundSinks(l2Var4.n.d, l2Var4.r.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && bf.d.a(activity) == 1) {
            l2 l2Var5 = Q;
            ye.c cVar = new ye.c(activity, l2Var5);
            cVar.c = "voip-pip";
            cVar.e = 1;
            r2 r2Var = l2Var5.r;
            cVar.j = r2Var.d;
            cVar.k = r2Var.getPlaceholderView();
            l2Var5.e = cVar.a();
        }
    }

    @Override // af.a
    public final Bitmap a() {
        r2 r2Var = this.M;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.M.d.getBitmap();
    }

    @Override // af.a
    public final Bitmap c() {
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

    @Override // af.a
    public final void d(bf.e eVar) {
        this.N = eVar;
        r2 r2Var = this.r;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.M.d);
        }
        WindowManager windowManager = this.c;
        ag.y1 y1Var = this.a;
        windowManager.removeView(y1Var);
        y1Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override // af.a
    public final void f(bf.e eVar) {
        this.N = eVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        ag.y1 y1Var = this.a;
        windowManager.addView(y1Var, layoutParams);
        r2 r2Var = this.M;
        if (r2Var != null) {
            r2Var.d.release();
            this.M = null;
        }
        y1Var.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.r.d);
        }
    }

    @Override // af.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // af.a
    public final View h() {
        r2 r2Var = new r2(this.r.getContext(), false, true, false, false);
        this.M = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.M.d.setEnableHardwareScaler(true);
        this.M.d.setRotateTextureWithScreen(true);
        r2 r2Var2 = this.M;
        r2Var2.T = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new i2(this));
        View view = this.M.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.M;
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
            float f10 = point.x;
            float f11 = point.y;
            l2 l2Var = k2Var.f;
            int i11 = l2Var.d.x;
            k2 k2Var2 = l2Var.b;
            float left = k2Var2.getLeft() + i11;
            float f12 = k2Var.b;
            fArr[0] = (left - f12) / (((f10 - f12) - k2Var.c) - k2Var2.getMeasuredWidth());
            float top = k2Var2.getTop() + l2Var.d.y;
            float f13 = k2Var.d;
            fArr[1] = (top - f13) / (((f11 - f13) - k2Var.e) - k2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.x[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        ye.d dVar = this.e;
        if (dVar != null) {
            dVar.c();
            this.e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z10 = this.b.getMeasuredWidth() != 0;
        boolean z11 = this.C;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.C = sharedInstance.getRemoteVideoState() == 2;
            this.B = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            r2 r2Var = this.n;
            r2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            r2Var.setIsScreencast(sharedInstance.isScreencast());
            r2Var.d(1.0f, false);
        }
        if (!z10) {
            this.s = this.C ? 1.0f : 0.0f;
            return;
        }
        if (z11 != this.C) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.C ? 1.0f : 0.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.w);
            this.v.setDuration(300L).setInterpolator(er.f);
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
            ye.d dVar = this.e;
            if (dVar != null) {
                dVar.c();
                this.e = null;
            }
        } else {
            Context context = Q.a.getContext();
            if (this.e == null && bf.d.a(context) == 1 && (context instanceof Activity)) {
                ye.c cVar = new ye.c((Activity) context, this);
                cVar.c = "voip-pip";
                cVar.e = 1;
                r2 r2Var = this.r;
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
        if (!z10 && this.B) {
            sharedInstance.setVideoState(false, 1);
        } else if (z10 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new gc(18), 200L);
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

    @Override // af.a
    public final /* synthetic */ void b(Canvas canvas) {
    }

    @Override // af.a
    public final /* synthetic */ void e(Canvas canvas) {
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
