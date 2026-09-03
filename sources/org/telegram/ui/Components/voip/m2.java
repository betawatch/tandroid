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
import k7.b6;
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rx0;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m2 implements VoIPService.StateListener, df.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean Q = false;
    public static m2 R;
    public static m2 S;
    public static int T;
    public final int B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public long H;
    public int I;
    public AnimatorSet K;
    public s2 N;
    public c2.p O;
    public final ah.e a;
    public final l2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public bf.f e;
    public final int f;
    public final int h;
    public final s2 n;
    public final s2 r;
    public float s;
    public ValueAnimator v;
    public final int y;
    public final e5 w = new e5(this, 8);
    public final float[] x = new float[2];
    public final androidx.emoji2.text.n J = new androidx.emoji2.text.n(6);
    public final i2 L = new i2(this, 0);
    public final i2 M = new i2(this, 1);
    public final k2 P = new k2(this);

    public m2(Context context, int i10, int i11, boolean z4) {
        this.f = i10;
        this.h = i11;
        float f10 = i11 * 0.4f;
        int i12 = ((int) ((f10 * 1.05f) - f10)) / 2;
        this.B = i12;
        float f11 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f11) - f11)) / 2;
        this.y = i13;
        ah.e eVar = new ah.e(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 18);
        this.a = eVar;
        eVar.setWillNotDraw(false);
        eVar.setPadding(i13, i12, i13, i12);
        l2 l2Var = new l2(this, context);
        this.b = l2Var;
        s2 s2Var = new s2(context, false, true);
        this.r = s2Var;
        s2Var.U = 3;
        s2 s2Var2 = new s2(context, false, true);
        this.n = s2Var2;
        s2Var2.d.setMirror(true);
        l2Var.addView(s2Var);
        l2Var.addView(s2Var2);
        l2Var.setBackgroundColor(-7829368);
        eVar.addView(l2Var);
        eVar.setClipChildren(false);
        eVar.setClipToPadding(false);
        if (z4) {
            View view = new View(context);
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.k(-16777216, 76), 0}));
            l2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            l2Var.addView(imageView, b6.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            l2Var.addView(imageView2, b6.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new dg.m(17));
            imageView2.setOnClickListener(new rx0(11, this, context));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        m();
    }

    public static void i() {
        if (Q) {
            return;
        }
        m2 m2Var = S;
        if (m2Var != null) {
            m2Var.j();
        }
        m2 m2Var2 = R;
        if (m2Var2 != null) {
            m2Var2.j();
        }
        S = null;
        R = null;
    }

    public static m2 k() {
        m2 m2Var = S;
        return m2Var != null ? m2Var : R;
    }

    public static void l(Activity activity, int i10, int i11, int i12, int i13) {
        if (R != null || VideoCapturerDevice.eglBase == null) {
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
        R = new m2(activity, i11, i12, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        m2 m2Var = R;
        m2Var.I = i10;
        m2Var.c = windowManager;
        m2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f14 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f15 = sharedPreferences.getFloat("relativeY", 0.0f);
        m2 m2Var2 = R;
        m2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f16 = point.x;
        float f17 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f18 = m2Var2.f * 0.25f;
        float f19 = m2Var2.h * 0.25f;
        l2 l2Var = m2Var2.b;
        if (l2Var.getMeasuredWidth() != 0) {
            f18 = l2Var.getMeasuredWidth();
        }
        if (l2Var.getMeasuredWidth() != 0) {
            f19 = l2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = m2Var2.d;
        layoutParams2.x = (int) (((((f16 - dp) - dp2) - f18) * f14) - (m2Var2.y - dp));
        layoutParams2.y = (int) (((((f17 - dp3) - dp4) - f19) * f15) - (m2Var2.B - dp3));
        AndroidUtilities.updateViewLayout(m2Var2.c, m2Var2.a, layoutParams2);
        NotificationCenter.getGlobalInstance().addObserver(R, NotificationCenter.didEndCall);
        windowManager.addView(R.a, layoutParams);
        R.n.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
        R.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), R.P);
        if (i13 == 0) {
            R.a.setScaleX(0.5f);
            R.a.setScaleY(0.5f);
            R.a.setAlpha(0.0f);
            R.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                m2 m2Var3 = R;
                sharedInstance.setSinks(m2Var3.n.d, m2Var3.r.d);
            }
        } else if (i13 == 1) {
            R.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                m2 m2Var4 = R;
                sharedInstance2.setBackgroundSinks(m2Var4.n.d, m2Var4.r.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ef.d.a(activity) == 1) {
            m2 m2Var5 = R;
            bf.e eVar = new bf.e(activity, m2Var5);
            eVar.c = "voip-pip";
            eVar.e = 1;
            s2 s2Var = m2Var5.r;
            eVar.j = s2Var.d;
            eVar.k = s2Var.getPlaceholderView();
            m2Var5.e = eVar.a();
        }
    }

    @Override // df.a
    public final void a(c2.p pVar) {
        this.O = pVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        ah.e eVar = this.a;
        windowManager.addView(eVar, layoutParams);
        s2 s2Var = this.N;
        if (s2Var != null) {
            s2Var.d.release();
            this.N = null;
        }
        eVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.r.d);
        }
    }

    @Override // df.a
    public final Bitmap b() {
        s2 s2Var = this.N;
        if (s2Var == null || !s2Var.d.isAvailable()) {
            return null;
        }
        return this.N.d.getBitmap();
    }

    @Override // df.a
    public final Bitmap d() {
        s2 s2Var = this.r;
        if (s2Var == null) {
            return null;
        }
        r2 r2Var = s2Var.d;
        if (r2Var.isAvailable()) {
            return r2Var.getBitmap();
        }
        return null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            i();
        }
    }

    @Override // df.a
    public final void e(c2.p pVar) {
        this.O = pVar;
        s2 s2Var = this.r;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.n.d, this.N.d);
        }
        WindowManager windowManager = this.c;
        ah.e eVar = this.a;
        windowManager.removeView(eVar);
        eVar.invalidate();
    }

    @Override // df.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // df.a
    public final View h() {
        s2 s2Var = new s2(this.r.getContext(), false, true, false, false);
        this.N = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.N.d.setEnableHardwareScaler(true);
        this.N.d.setRotateTextureWithScreen(true);
        s2 s2Var2 = this.N;
        s2Var2.U = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new j2(this));
        View view = this.N.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.N;
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
            l2 l2Var = this.b;
            float[] fArr = this.x;
            int i10 = l2.h;
            l2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            float f10 = point.x;
            float f11 = point.y;
            m2 m2Var = l2Var.f;
            int i11 = m2Var.d.x;
            l2 l2Var2 = m2Var.b;
            float left = l2Var2.getLeft() + i11;
            float f12 = l2Var.b;
            fArr[0] = (left - f12) / (((f10 - f12) - l2Var.c) - l2Var2.getMeasuredWidth());
            float top = l2Var2.getTop() + m2Var.d.y;
            float f13 = l2Var.d;
            fArr[1] = (top - f13) / (((f11 - f13) - l2Var.e) - l2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.x[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.x[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        bf.f fVar = this.e;
        if (fVar != null) {
            fVar.c();
            this.e = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
    }

    public final void m() {
        boolean z4 = this.b.getMeasuredWidth() != 0;
        boolean z10 = this.D;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.D = sharedInstance.getRemoteVideoState() == 2;
            this.C = sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1;
            s2 s2Var = this.n;
            s2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            s2Var.setIsScreencast(sharedInstance.isScreencast());
            s2Var.d(1.0f, false);
        }
        if (!z4) {
            this.s = this.D ? 1.0f : 0.0f;
            return;
        }
        if (z10 != this.D) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.D ? 1.0f : 0.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(this.w);
            this.v.setDuration(300L).setInterpolator(mr.f);
            this.v.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z4) {
        m();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            bf.f fVar = this.e;
            if (fVar != null) {
                fVar.c();
                this.e = null;
            }
        } else {
            Context context = R.a.getContext();
            if (this.e == null && ef.d.a(context) == 1 && (context instanceof Activity)) {
                bf.e eVar = new bf.e((Activity) context, this);
                eVar.c = "voip-pip";
                eVar.e = 1;
                s2 s2Var = this.r;
                eVar.j = s2Var.d;
                eVar.k = s2Var.getPlaceholderView();
                this.e = eVar.a();
            }
        }
        m();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (!z4 && this.C) {
            sharedInstance.setVideoState(false, 1);
        } else if (z4 && sharedInstance.getVideoState(false) == 1) {
            sharedInstance.setVideoState(false, 2);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        if (i10 == 11 || i10 == 17 || i10 == 4 || i10 == 10) {
            AndroidUtilities.runOnUIThread(new mc(17), 200L);
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

    @Override // df.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // df.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z4) {
    }
}
