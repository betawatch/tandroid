package org.telegram.ui.Components.voip;

import a8.fg;
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
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l51;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n2 implements VoIPService.StateListener, uf.a, NotificationCenter.NotificationCenterDelegate {
    public static boolean U = false;
    public static n2 V;
    public static n2 W;
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
    public t2 R;
    public fg S;
    public final bh.p a;
    public final m2 b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public sf.d e;
    public final int f;
    public final int h;
    public final View n;
    public final t2 r;
    public final t2 s;
    public float v;
    public ValueAnimator w;
    public final e4 x = new e4(this, 15);
    public final float[] y = new float[2];
    public final androidx.emoji2.text.n N = new androidx.emoji2.text.n(6);
    public final j2 P = new j2(this, 0);
    public final j2 Q = new j2(this, 1);
    public final l2 T = new l2(this);

    public n2(Context context, int i10, int i11, boolean z10) {
        this.f = i10;
        this.h = i11;
        float f7 = i11 * 0.4f;
        int i12 = ((int) ((f7 * 1.05f) - f7)) / 2;
        this.F = i12;
        float f10 = i10 * 0.4f;
        int i13 = ((int) ((1.05f * f10) - f10)) / 2;
        this.E = i13;
        bh.p pVar = new bh.p(this, context, context.getDrawable(R.drawable.calls_pip_outershadow), 16);
        this.a = pVar;
        pVar.setWillNotDraw(false);
        pVar.setPadding(i13, i12, i13, i12);
        m2 m2Var = new m2(this, context);
        this.b = m2Var;
        t2 t2Var = new t2(context, false, true);
        this.s = t2Var;
        t2Var.a0 = 3;
        t2 t2Var2 = new t2(context, false, true);
        this.r = t2Var2;
        t2Var2.d.setMirror(true);
        m2Var.addView(t2Var);
        m2Var.addView(t2Var2);
        m2Var.setBackgroundColor(-7829368);
        pVar.addView(m2Var);
        pVar.setClipChildren(false);
        pVar.setClipToPadding(false);
        if (z10) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i0.a.o(-16777216, 76), 0}));
            m2Var.addView(view, -1, AndroidUtilities.dp(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.pip_close);
            imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            m2Var.addView(imageView, kb1.h(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.pip_enlarge);
            imageView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView2.setContentDescription(LocaleController.getString(R.string.Open));
            m2Var.addView(imageView2, kb1.h(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new bh.f(17));
            imageView2.setOnClickListener(new l51(7, this, context));
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
        n2 n2Var = W;
        if (n2Var != null) {
            n2Var.j();
        }
        n2 n2Var2 = V;
        if (n2Var2 != null) {
            n2Var2.j();
        }
        W = null;
        V = null;
    }

    public static n2 k() {
        n2 n2Var = W;
        return n2Var != null ? n2Var : V;
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
        V = new n2(activity, i11, i12, false);
        WindowManager windowManager = AndroidUtilities.checkInlinePermissions(activity) ? (WindowManager) ApplicationLoader.applicationContext.getSystemService("window") : (WindowManager) activity.getSystemService("window");
        n2 n2Var = V;
        n2Var.M = i10;
        n2Var.c = windowManager;
        n2Var.d = layoutParams;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0);
        float f13 = sharedPreferences.getFloat("relativeX", 1.0f);
        float f14 = sharedPreferences.getFloat("relativeY", 0.0f);
        n2 n2Var2 = V;
        n2Var2.getClass();
        Point point = AndroidUtilities.displaySize;
        float f15 = point.x;
        float f16 = point.y;
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        float dp3 = AndroidUtilities.dp(60.0f);
        float dp4 = AndroidUtilities.dp(16.0f);
        float f17 = n2Var2.f * 0.25f;
        float f18 = n2Var2.h * 0.25f;
        m2 m2Var = n2Var2.b;
        if (m2Var.getMeasuredWidth() != 0) {
            f17 = m2Var.getMeasuredWidth();
        }
        if (m2Var.getMeasuredWidth() != 0) {
            f18 = m2Var.getMeasuredHeight();
        }
        WindowManager.LayoutParams layoutParams2 = n2Var2.d;
        layoutParams2.x = (int) (((((f15 - dp) - dp2) - f17) * f13) - (n2Var2.E - dp));
        layoutParams2.y = (int) (((((f16 - dp3) - dp4) - f18) * f14) - (n2Var2.F - dp3));
        AndroidUtilities.updateViewLayout(n2Var2.c, n2Var2.a, layoutParams2);
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
                n2 n2Var3 = V;
                sharedInstance.setSinks(n2Var3.r.d, n2Var3.s.d);
            }
        } else if (i13 == 1) {
            V.a.setAlpha(0.0f);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                n2 n2Var4 = V;
                sharedInstance2.setBackgroundSinks(n2Var4.r.d, n2Var4.s.d);
            }
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && vf.b.a(activity) == 1) {
            n2 n2Var5 = V;
            sf.c cVar = new sf.c(activity, n2Var5);
            cVar.c = "voip-pip";
            cVar.e = 1;
            t2 t2Var = n2Var5.s;
            cVar.j = t2Var.d;
            cVar.k = t2Var.getPlaceholderView();
            n2Var5.e = cVar.a();
        }
    }

    @Override // uf.a
    public final void a(fg fgVar) {
        this.S = fgVar;
        t2 t2Var = this.s;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.R.d);
        }
        WindowManager windowManager = this.c;
        bh.p pVar = this.a;
        windowManager.removeView(pVar);
        pVar.invalidate();
    }

    @Override // uf.a
    public final void b(fg fgVar) {
        this.S = fgVar;
        WindowManager windowManager = this.c;
        WindowManager.LayoutParams layoutParams = this.d;
        bh.p pVar = this.a;
        windowManager.addView(pVar, layoutParams);
        t2 t2Var = this.R;
        if (t2Var != null) {
            t2Var.d.release();
            this.R = null;
        }
        pVar.invalidate();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.setSinks(this.r.d, this.s.d);
        }
    }

    @Override // uf.a
    public final Bitmap c() {
        t2 t2Var = this.R;
        if (t2Var == null || !t2Var.d.isAvailable()) {
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

    @Override // uf.a
    public final Bitmap e() {
        t2 t2Var = this.s;
        if (t2Var == null) {
            return null;
        }
        s2 s2Var = t2Var.d;
        if (s2Var.isAvailable()) {
            return s2Var.getBitmap();
        }
        return null;
    }

    @Override // uf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // uf.a
    public final View h() {
        t2 t2Var = new t2(this.s.getContext(), false, true, false, false);
        this.R = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.R.d.setEnableHardwareScaler(true);
        this.R.d.setRotateTextureWithScreen(true);
        t2 t2Var2 = this.R;
        t2Var2.a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new k2(this));
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
            m2 m2Var = this.b;
            float[] fArr = this.y;
            int i10 = m2.h;
            m2Var.getClass();
            Point point = AndroidUtilities.displaySize;
            float f7 = point.x;
            float f10 = point.y;
            n2 n2Var = m2Var.f;
            int i11 = n2Var.d.x;
            m2 m2Var2 = n2Var.b;
            float left = m2Var2.getLeft() + i11;
            float f11 = m2Var.b;
            fArr[0] = (left - f11) / (((f7 - f11) - m2Var.c) - m2Var2.getMeasuredWidth());
            float top = m2Var2.getTop() + n2Var.d.y;
            float f12 = m2Var.d;
            fArr[1] = (top - f12) / (((f10 - f12) - m2Var.e) - m2Var2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            ApplicationLoader.applicationContext.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.y[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.y[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        sf.d dVar = this.e;
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
            t2 t2Var = this.r;
            t2Var.d.setMirror(sharedInstance.isFrontFaceCamera());
            t2Var.setIsScreencast(sharedInstance.isScreencast());
            t2Var.d(1.0f, false);
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
            this.w.setDuration(300L).setInterpolator(ds.f);
            this.w.start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        m();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            sf.d dVar = this.e;
            if (dVar != null) {
                dVar.c();
                this.e = null;
            }
        } else {
            Context context = V.a.getContext();
            if (this.e == null && vf.b.a(context) == 1 && (context instanceof Activity)) {
                sf.c cVar = new sf.c((Activity) context, this);
                cVar.c = "voip-pip";
                cVar.e = 1;
                t2 t2Var = this.s;
                cVar.j = t2Var.d;
                cVar.k = t2Var.getPlaceholderView();
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
            AndroidUtilities.runOnUIThread(new k5(24), 200L);
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

    @Override // uf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // uf.a
    public final /* synthetic */ void f(Canvas canvas) {
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
