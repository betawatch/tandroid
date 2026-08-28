package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.PowerManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.EncryptionKeyEmojifier;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, ze.a {
    public static mh1 j1;
    public TextView A;
    public boolean A0;
    public org.telegram.ui.Components.voip.o2 B;
    public float B0;
    public lh1 C;
    public boolean C0;
    public ImageView D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public int F;
    public boolean F0;
    public org.telegram.ui.Components.ge G;
    public long G0;
    public int H;
    public bg.g3 I;
    public org.telegram.ui.Components.voip.g2 I0;
    public ta1 J;
    public org.telegram.ui.Components.voip.c3 J0;
    public FrameLayout K;
    public org.telegram.ui.Components.voip.c3 K0;
    public org.telegram.ui.Components.voip.o0 L;
    public ValueAnimator L0;
    public org.telegram.ui.Components.voip.l1 M;
    public kh.n5 N;
    public boolean N0;
    public TextView O;
    public gk P;
    public org.telegram.ui.Components.voip.k Q;
    public boolean Q0;
    public float R0;
    public float S0;
    public ih1 T;
    public float T0;
    public org.telegram.ui.Components.voip.s1 U;
    public float U0;
    public org.telegram.ui.Components.voip.s1 V;
    public float V0;
    public boolean W;
    public boolean W0;
    public TextureViewRenderer X;
    public float X0;
    public org.telegram.ui.Components.voip.r2 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.r2 Z;
    public int Z0;
    public final int a;
    public org.telegram.ui.Components.voip.e a0;
    public int a1;
    public Activity b;
    public boolean b0;
    public final TLRPC.User c;
    public xe.d c0;
    public boolean c1;
    public final TLRPC.User d;
    public View d0;
    public boolean d1;
    public org.telegram.ui.Components.voip.j3 e;
    public View e0;
    public ValueAnimator e1;
    public org.telegram.ui.Components.voip.j3 f;
    public org.telegram.ui.Components.voip.o1 f0;
    public boolean f1;
    public org.telegram.ui.Components.voip.r2 g1;
    public org.telegram.ui.Components.voip.j3 h;
    public af.f h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public fh1 k0;
    public int l0;
    public int m0;
    public jh1 n;
    public WindowInsets n0;
    public boolean o0;
    public float p0;
    public eh1 q0;
    public int r0;
    public hh1 s;
    public AccessibilityManager s0;
    public org.telegram.ui.Components.voip.b3 v;
    public boolean v0;
    public org.telegram.ui.Components.voip.y2 w;
    public AnimatorSet w0;
    public org.telegram.ui.Components.voip.d3 x;
    public boolean x0;
    public org.telegram.ui.Components.voip.q0 y;
    public boolean y0;
    public boolean z0;
    public final org.telegram.ui.Components.voip.n1 r = new org.telegram.ui.Components.voip.n1();
    public final org.telegram.ui.Components.o9[] R = new org.telegram.ui.Components.o9[4];
    public final Drawable[] S = new Drawable[4];
    public final Paint g0 = new Paint();
    public final Paint h0 = new Paint();
    public boolean t0 = true;
    public float u0 = 1.0f;
    public final AnimationNotificationsLocker H0 = new AnimationNotificationsLocker();
    public final v01 M0 = new v01(this, 20);
    public final wg1 O0 = new wg1(this, 12);
    public final wg1 P0 = new wg1(this, 13);
    public float b1 = 1.0f;

    public mh1(int i9) {
        this.a = i9;
        this.c = MessagesController.getInstance(i9).getUser(Long.valueOf(UserConfig.getInstance(i9).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.m0 = -1;
        this.l0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static /* synthetic */ void i(mh1 mh1Var) {
        AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
        mh1Var.N0 = false;
        if (Build.VERSION.SDK_INT < 23 || mh1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            mh1Var.C();
        } else {
            mh1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(mh1 mh1Var) {
        mh1 mh1Var2;
        int i9 = 0;
        if (mh1Var.c1) {
            mh1Var.c1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            mh1Var.e1 = ofFloat;
            mh1Var2 = mh1Var;
            ofFloat.addUpdateListener(new ag.c(mh1Var2, mh1Var.b1, mh1Var.U0, mh1Var.V0, 2));
            mh1Var2.e1.addListener(new ah1(mh1Var2, i9));
            mh1Var2.e1.setDuration(350L);
            mh1Var2.e1.setInterpolator(org.telegram.ui.Components.gr.f);
            mh1Var2.e1.start();
        } else {
            mh1Var2 = mh1Var;
        }
        mh1Var2.d1 = false;
        mh1Var2.W0 = false;
    }

    public static void q(int i9, int[] iArr) {
        mh1 mh1Var = j1;
        if (mh1Var != null) {
            if (i9 == 101) {
                if (VoIPService.getSharedState() == null) {
                    mh1Var.q0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    mh1Var.r(new lj0(7));
                } else if (!mh1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.e2.i(mh1Var.b, new wg1(mh1Var, 2), i9);
                    return;
                }
            }
            if (i9 == 102) {
                if (VoIPService.getSharedState() == null) {
                    mh1Var.q0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    mh1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i9) {
        mh1 mh1Var = j1;
        if (mh1Var != null && mh1Var.q0.getParent() == null) {
            mh1 mh1Var2 = j1;
            if (mh1Var2 != null) {
                mh1Var2.Y.d.release();
                j1.Z.d.release();
                j1.X.release();
                eh1 eh1Var = j1.q0;
                if (eh1Var != null) {
                    eh1Var.d();
                }
                j1.l();
            }
            j1 = null;
        }
        if (j1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.l2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        mh1 mh1Var3 = new mh1(i9);
        mh1Var3.b = activity;
        j1 = mh1Var3;
        eh1 eh1Var2 = new eh1(activity, !z10, mh1Var3);
        j1.F0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        j1.getClass();
        eh1Var2.setLockOnScreen(j1.F0);
        mh1Var3.q0 = eh1Var2;
        ug1 ug1Var = new ug1(mh1Var3, 4);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(eh1Var2, ug1Var);
        ((WindowManager) activity.getSystemService("window")).addView(eh1Var2, org.telegram.ui.Components.voip.v2.a());
        mh1Var3.p0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        mh1Var3.s0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        hh1 hh1Var = new hh1(mh1Var3, activity);
        hh1Var.setClipToPadding(false);
        hh1Var.setClipChildren(false);
        hh1Var.setBackgroundColor(-16777216);
        mh1Var3.G();
        mh1Var3.s = hh1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.n1 n1Var = mh1Var3.r;
        mh1Var3.v = new org.telegram.ui.Components.voip.b3(activity, z11, n1Var);
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
        mh1Var3.Y = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2Var.d.setScalingType(scalingType);
        mh1Var3.Y.d.setEnableHardwareScaler(true);
        mh1Var3.Y.d.setRotateTextureWithScreen(true);
        mh1Var3.Y.T = 1;
        hh1Var.addView(mh1Var3.v, g7.e6.c(-1.0f, -1));
        TLRPC.User user = mh1Var3.d;
        org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity, user, n1Var);
        mh1Var3.w = y2Var;
        hh1Var.addView(y2Var, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity);
        int i10 = 2;
        if (LiteMode.isEnabled(512)) {
            int i11 = org.telegram.ui.ActionBar.f6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                d3Var.a = new org.telegram.ui.Components.iv0(0);
            }
        }
        mh1Var3.x = d3Var;
        hh1Var.addView(d3Var, g7.e6.c(220.0f, -1));
        hh1Var.addView(mh1Var3.Y);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.n9(orientation, new int[]{-14994098, -14328963}).f(m5.c0.m(0.5f, 1), new wb1(mh1Var3, 1), 0L);
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
        mh1Var3.U = s1Var;
        s1Var.setDelegate(new ug1(mh1Var3, 3));
        mh1Var3.U.d(1.0f, 1.0f);
        mh1Var3.W = true;
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
        mh1Var3.Z = r2Var2;
        r2Var2.d.setIsCamera(true);
        mh1Var3.Z.d.setUseCameraRotation(true);
        mh1Var3.U.setOnTapListener(new xg1(mh1Var3, 1));
        mh1Var3.Z.d.setMirror(true);
        mh1Var3.U.addView(mh1Var3.Z);
        org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
        mh1Var3.V = s1Var2;
        s1Var2.O = true;
        s1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        mh1Var3.X = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        mh1Var3.X.setIsCamera(false);
        mh1Var3.X.setFpsReduction(30.0f);
        mh1Var3.X.setScalingType(scalingType);
        mh1Var3.V.addView(mh1Var3.X, g7.e6.e(-1, -2, 17));
        mh1Var3.V.setOnTapListener(new xg1(mh1Var3, i10));
        mh1Var3.V.setVisibility(8);
        hh1Var.addView(mh1Var3.U, g7.e6.c(-2.0f, -2));
        hh1Var.addView(mh1Var3.V);
        View view = new View(activity);
        mh1Var3.d0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        hh1Var.addView(mh1Var3.d0, g7.e6.e(-1, 160, 80));
        View view2 = new View(activity);
        mh1Var3.e0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        hh1Var.addView(mh1Var3.e0, g7.e6.e(-1, 160, 48));
        ta1 ta1Var = new ta1(mh1Var3, activity, 17);
        mh1Var3.J = ta1Var;
        ta1Var.setOrientation(0);
        mh1Var3.J.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        mh1Var3.J.setClipToPadding(false);
        mh1Var3.J.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        mh1Var3.J.setOnClickListener(new xg1(mh1Var3, 3));
        mh1Var3.L = new org.telegram.ui.Components.voip.o0(activity, n1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        mh1Var3.K = frameLayout;
        frameLayout.addView(mh1Var3.L, g7.e6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        mh1Var3.K.setVisibility(8);
        mh1Var3.K.setOnClickListener(new xg1(mh1Var3, 4));
        kh.n5 n5Var = new kh.n5(activity, n1Var);
        mh1Var3.N = n5Var;
        n5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        mh1Var3.O = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        mh1Var3.O.setTextSize(1, 15.0f);
        mh1Var3.O.setTypeface(AndroidUtilities.bold());
        mh1Var3.O.setTextColor(-1);
        mh1Var3.O.setGravity(17);
        gk gkVar = new gk(mh1Var3, activity, 5);
        mh1Var3.P = gkVar;
        gkVar.setTextSize(1, 15.0f);
        mh1Var3.P.setTextColor(-1);
        mh1Var3.P.setGravity(17);
        mh1Var3.P.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), mh1Var3.P.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        mh1Var3.N.setVisibility(8);
        mh1Var3.N.addView(mh1Var3.O);
        mh1Var3.N.addView(mh1Var3.P, g7.e6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        mh1Var3.N.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i14 = 0;
        while (i14 < 4) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
            org.telegram.ui.Components.o9[] o9VarArr = mh1Var3.R;
            o9VarArr[i14] = o9Var;
            o9VarArr[i14].getImageReceiver().setAspectFit(true);
            mh1Var3.J.addView(o9VarArr[i14], g7.e6.k(i14 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i14++;
        }
        ih1 ih1Var = new ih1(mh1Var3, activity);
        mh1Var3.T = ih1Var;
        ih1Var.setOrientation(1);
        mh1Var3.T.setFocusable(true);
        mh1Var3.T.setFocusableInTouchMode(true);
        mh1Var3.y = new org.telegram.ui.Components.voip.q0(activity);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.r(user);
        org.telegram.ui.Components.voip.q0 q0Var = mh1Var3.y;
        int i15 = mh1Var3.a;
        q0Var.b.h(ImageLocation.getForUserOrChat(i15, user, 0), null, z8Var, user);
        mh1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        mh1Var3.A = textView2;
        textView2.setTextSize(1, 28.0f);
        mh1Var3.A.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), mh1Var3.A.getPaint().getFontMetricsInt(), false));
        mh1Var3.A.setMaxLines(2);
        mh1Var3.A.setEllipsize(TextUtils.TruncateAt.END);
        mh1Var3.A.setTextColor(-1);
        mh1Var3.A.setGravity(1);
        mh1Var3.A.setImportantForAccessibility(2);
        mh1Var3.T.addView(mh1Var3.A, g7.e6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity);
        o2Var.a = new TextView[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            o2Var.a[i16] = new TextView(activity);
            o2Var.a[i16].setTextSize(1, 15.0f);
            o2Var.a[i16].setTextColor(-1);
            o2Var.a[i16].setGravity(1);
            o2Var.addView(o2Var.a[i16]);
            i16++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        o2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(o2Var, activity, n1Var);
        m2Var.setTextSize(1, 15.0f);
        m2Var.setTextColor(-1);
        m2Var.setGravity(1);
        m2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        m2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(m2Var, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        o2Var.addView(frameLayout2, g7.e6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        o2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        o2Var.addView(textView3, g7.e6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new org.telegram.ui.Components.z(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
        o2Var.d = s2Var;
        o2Var.addView(s2Var, g7.e6.c(-2.0f, -1));
        mh1Var3.B = o2Var;
        WeakHashMap weakHashMap2 = r0.j0.a;
        o2Var.setImportantForAccessibility(4);
        mh1Var3.T.addView(mh1Var3.B, g7.e6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            lh1 lh1Var = new lh1(activity);
            mh1Var3.C = lh1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i18 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i18 > 0) {
                int max = Math.max(i18, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.b9 b9Var = lh1Var.b;
                b9Var.k(min);
                int i19 = 0;
                while (i19 < min) {
                    b9Var.l(i19, MessagesController.getInstance(i15).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i19).peer)), i15);
                    i19++;
                    j10 = j10;
                }
                long j11 = j10;
                b9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    lh1Var.setVisibility(8);
                } else {
                    lh1Var.c = new org.telegram.ui.Components.nz0(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    lh1Var.setVisibility(0);
                    lh1Var.invalidate();
                }
            } else {
                lh1Var.setVisibility(8);
            }
            mh1Var3.T.addView(mh1Var3.C, g7.e6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        mh1Var3.T.setClipChildren(false);
        mh1Var3.T.setClipToPadding(false);
        mh1Var3.T.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        mh1Var3.Q = new org.telegram.ui.Components.voip.k(activity);
        mh1Var3.M = new org.telegram.ui.Components.voip.l1(activity, n1Var);
        mh1Var3.Q.setAlpha(0.0f);
        mh1Var3.M.setVisibility(8);
        hh1Var.addView(mh1Var3.y, g7.e6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.T, g7.e6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.K, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.N, g7.e6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.J, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.Q, g7.e6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        hh1Var.addView(mh1Var3.M, g7.e6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        mh1Var3.f0 = new org.telegram.ui.Components.voip.o1(activity);
        mh1Var3.e = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        mh1Var3.f = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        mh1Var3.h = new org.telegram.ui.Components.voip.j3(activity, n1Var);
        mh1Var3.n = new jh1(activity, 52.0f);
        mh1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        mh1Var3.e.setScaleX(0.0f);
        mh1Var3.e.setScaleY(0.0f);
        mh1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mh1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        mh1Var3.f.setScaleX(0.0f);
        mh1Var3.f.setScaleY(0.0f);
        mh1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        mh1Var3.h.setScaleX(0.0f);
        mh1Var3.h.setScaleY(0.0f);
        mh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mh1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        mh1Var3.n.setScaleX(0.0f);
        mh1Var3.n.setScaleY(0.0f);
        mh1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mh1Var3.f0.addView(mh1Var3.e);
        mh1Var3.f0.addView(mh1Var3.f);
        mh1Var3.f0.addView(mh1Var3.h);
        mh1Var3.f0.addView(mh1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        mh1Var3.a0 = eVar;
        eVar.setListener(new kh1(mh1Var3));
        mh1Var3.a0.setScaleX(1.15f);
        mh1Var3.a0.setScaleY(1.15f);
        hh1Var.addView(mh1Var3.f0, g7.e6.e(-1, -2, 80));
        int i20 = 27;
        float f10 = AndroidUtilities.isTablet() ? 100 : 27;
        hh1Var.addView(mh1Var3.a0, g7.e6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        mh1Var3.E = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
        mh1Var3.E.setImageResource(R.drawable.msg_addcontact);
        mh1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        hh1Var.addView(mh1Var3.E, g7.e6.e(56, 56, 53));
        g7.g6.a(mh1Var3.E);
        ImageView imageView2 = new ImageView(activity);
        mh1Var3.D = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
        mh1Var3.D.setImageResource(R.drawable.msg_call_minimize_shadow);
        mh1Var3.D.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        mh1Var3.D.setContentDescription(LocaleController.getString(R.string.Back));
        hh1Var.addView(mh1Var3.D, g7.e6.e(56, 56, 51));
        g7.g6.a(mh1Var3.D);
        org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
        mh1Var3.G = geVar;
        geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        mh1Var3.G.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(-1, 76), 1, -1));
        mh1Var3.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        hh1Var.addView(mh1Var3.G, g7.e6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        mh1Var3.G.setAlpha(0.0f);
        mh1Var3.G.setOnClickListener(new xg1(mh1Var3, 5));
        int i21 = 6;
        mh1Var3.D.setOnClickListener(new xg1(mh1Var3, i21));
        mh1Var3.E.setOnClickListener(new v80(i20, mh1Var3, activity));
        if (mh1Var3.q0.b) {
            mh1Var3.D.setVisibility(8);
            mh1Var3.E.setVisibility(8);
        }
        org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity);
        g2Var.a = new HashMap();
        g2Var.b = new ArrayList();
        g2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        g2Var.r = textPaint;
        g2Var.setOrientation(1);
        g2Var.n = n1Var;
        TransitionSet transitionSet = new TransitionSet();
        g2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.o0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        mh1Var3.I0 = g2Var;
        g2Var.setGravity(80);
        mh1Var3.I0.setOnViewsUpdated(new wg1(mh1Var3, 5));
        hh1Var.addView(mh1Var3.I0, g7.e6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity, 3, n1Var, true);
        c3Var.q(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c3Var.G = alignment;
        c3Var.d = -1L;
        c3Var.h0 = new wg1(mh1Var3, i21);
        c3Var.P = true;
        c3Var.h = AndroidUtilities.dp(320.0f);
        c3Var.e = true;
        c3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var.r(8.0f);
        mh1Var3.J0 = c3Var;
        c3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
        hh1Var.addView(mh1Var3.J0, g7.e6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.c3 c3Var2 = new org.telegram.ui.Components.voip.c3(activity, 1, n1Var, false);
        c3Var2.q(true);
        c3Var2.G = alignment;
        c3Var2.d = 4000L;
        c3Var2.P = true;
        c3Var2.h = AndroidUtilities.dp(320.0f);
        c3Var2.e = true;
        c3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var2.r(8.0f);
        mh1Var3.K0 = c3Var2;
        c3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
        hh1Var.addView(mh1Var3.K0, g7.e6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        mh1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!mh1Var3.Q0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                mh1Var3.Q0 = phoneCall != null && phoneCall.video;
            }
            mh1Var3.o();
        }
        eh1Var2.addView(hh1Var);
        if (z10) {
            mh1Var3.B0 = 0.0f;
            mh1Var3.E0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                mh1Var3.Y.setStub(org.telegram.ui.Components.voip.l2.k().r);
                mh1Var3.Z.setStub(org.telegram.ui.Components.voip.l2.k().n);
            }
            mh1Var3.q0.setAlpha(0.0f);
            mh1Var3.H();
            mh1Var3.A0 = true;
            org.telegram.ui.Components.voip.l2.P = true;
            if (org.telegram.ui.Components.voip.l2.R != null) {
                org.telegram.ui.Components.voip.l2.Q.getClass();
                throw null;
            }
            mh1Var3.H0.lock();
            AndroidUtilities.runOnUIThread(new wg1(mh1Var3, 11), 32L);
        } else {
            mh1Var3.B0 = 1.0f;
            mh1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && af.d.a(activity) == 1) {
            mh1 mh1Var4 = j1;
            xe.c cVar = new xe.c(activity, mh1Var4);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var3 = mh1Var4.Y;
            cVar.j = r2Var3.d;
            cVar.k = r2Var3.getPlaceholderView();
            mh1Var4.c0 = cVar.a();
        }
    }

    public final void A(boolean z10) {
        int i9;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        v01 v01Var = this.M0;
        if (z10 || !this.t0) {
            if (z10 && !this.t0) {
                this.J0.e(true);
                this.K0.e(true);
                ViewPropertyAnimator translationY = this.A.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                translationY.setInterpolator(grVar).start();
                this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(grVar).start();
                this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.D.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.f0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar).start();
                this.d0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                this.e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0, 1.0f);
                this.L0 = ofFloat;
                ofFloat.addUpdateListener(v01Var);
                this.L0.setDuration(150L).setInterpolator(grVar);
                this.L0.start();
                this.f0.setEnabled(true);
            }
            i9 = 0;
        } else {
            ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
            duration.setInterpolator(grVar2).start();
            this.D.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.J.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.A.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(grVar2).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(grVar2).start();
            this.f0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(grVar2).start();
            this.d0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar2).start();
            this.e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.u0, 0.0f);
            this.L0 = ofFloat2;
            ofFloat2.addUpdateListener(v01Var);
            this.L0.setDuration(150L).setInterpolator(grVar2);
            this.L0.start();
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            this.N0 = false;
            this.f0.setEnabled(false);
            this.K0.e(true);
            i9 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.t0 = z10;
        eh1 eh1Var = this.q0;
        if (z10) {
            eh1Var.setSystemUiVisibility(eh1Var.getSystemUiVisibility() & (-5));
        } else {
            eh1Var.setSystemUiVisibility(eh1Var.getSystemUiVisibility() | 4);
        }
        this.I0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i9).setInterpolator(org.telegram.ui.Components.gr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            wg1 wg1Var = this.O0;
            AndroidUtilities.cancelRunOnUIThread(wg1Var);
            this.N0 = false;
            if (this.v0 && this.t0) {
                AndroidUtilities.runOnUIThread(wg1Var, 3000L);
                this.N0 = true;
            }
        }
    }

    public final void C() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.s0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.j0 ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.j0) {
                this.Z.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.m0 = this.l0;
                H();
                return;
            }
            if (this.k0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.q0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                fh1 fh1Var = new fh1(this, this.s.getContext(), r0[0], r0[1]);
                this.k0 = fh1Var;
                WindowInsets windowInsets = this.n0;
                if (windowInsets != null) {
                    fh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.k0);
            }
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.o0(4).setDuration(250L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
            transitionSet.addTransition(duration.setInterpolator(grVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(grVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.j3.class, true);
            TransitionManager.beginDelayedTransition(this.f0, transitionSet);
        }
        int i9 = this.l0;
        if (i9 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i10 = 0;
        if (i9 == 15 || i9 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i9 == 15) {
                if (sharedInstance.isScreencast() || !(this.j0 || this.i0)) {
                    u(this.e, sharedInstance);
                    this.G.animate().alpha(0.0f).start();
                } else {
                    s(this.e, sharedInstance);
                    if (this.t0) {
                        this.G.animate().alpha(1.0f).start();
                    }
                }
                v(this.f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (j1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.j0 || this.i0)) {
                u(this.e, sharedInstance);
                this.G.setTag(null);
                this.G.animate().alpha(0.0f).start();
            } else {
                s(this.e, sharedInstance);
                if (this.t0) {
                    this.G.setTag(1);
                    this.G.animate().alpha(1.0f).start();
                }
            }
            v(this.f, sharedInstance, false);
            t(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
            this.n.setOnClickListener(new xg1(this, 0));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i10 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i10;
            i10 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i10;
            i10 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.B = i10;
        }
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.o9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.o9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.o9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.k5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.o9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        ih.z2 z2Var;
        String[] strArr;
        TLRPC.Document document;
        int i9;
        ?? r52;
        if (this.x0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z12 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
        int i10 = 0;
        while (true) {
            r62 = this.R;
            drawableArr = this.S;
            if (i10 >= 4) {
                break;
            }
            Emoji.preloadEmoji(emojifyForCall[i10]);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i10]);
            if (emojiDrawable != null) {
                emojiDrawable.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence replaceEmoji = Emoji.replaceEmoji(emojifyForCall[i10], textPaint.getFontMetricsInt(), z12, iArr);
                boolean z13 = replaceEmoji instanceof Spannable;
                int i11 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                    org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.t5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (t5VarArr == null ? 0 : t5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i12 = 0;
                            ?? r32 = z12;
                            while (i12 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i12];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new w3(this, 23));
                                if (stickerSet != null) {
                                    String replace = emojiSpan.emoji.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size) {
                                            strArr = emojifyForCall;
                                            i9 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i13);
                                        i13++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i9 = length;
                                        if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i9;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i12++;
                                    length = i9;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i10];
                        if ((drawable instanceof org.telegram.ui.Components.k5) && ((org.telegram.ui.Components.k5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.k5) drawableArr[i10];
                        } else {
                            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(21, i11, document);
                            drawableArr[i10] = k5Var;
                            r52 = k5Var;
                        }
                        r52.r(strArr[i10]);
                        r62[i10].setAnimatedEmojiDrawable(r52);
                        r62[i10].getImageReceiver().clearImage();
                        emojiDrawable = r52;
                    } else {
                        r62[i10].setImageDrawable(emojiDrawable);
                        emojiDrawable = emojiDrawable;
                    }
                    r62[i10].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i10].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i10] = emojiDrawable;
            i10++;
            emojifyForCall = strArr;
            z12 = false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            Drawable drawable2 = drawableArr[i15];
            if (drawable2 instanceof Emoji.EmojiDrawable) {
                z11 = ((Emoji.EmojiDrawable) drawable2).isLoaded();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.k5) && (z2Var = ((org.telegram.ui.Components.k5) drawable2).k) != null) {
                    Drawable thumb = z2Var.getThumb();
                    if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i14++;
            }
        }
        if (i14 == 4) {
            this.x0 = true;
            for (int i16 = 0; i16 < 4; i16++) {
                if (r62[i16].getVisibility() != 0) {
                    r62[i16].setVisibility(0);
                    if (z10) {
                        r62[i16].setAlpha(0.0f);
                        r62[i16].setScaleX(0.0f);
                        r62[i16].setScaleY(0.0f);
                        org.telegram.messenger.ll.r(r62[i16].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.gr.k, 250L);
                    }
                }
            }
            this.K0.postDelayed(new wg1(this, 9), 1000L);
        }
    }

    public final void F() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i9 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.F != i9) {
            AndroidUtilities.updateImageViewImageAnimated(this.G, i9);
        } else {
            this.G.setImageResource(i9);
        }
        this.F = i9;
    }

    public final void G() {
        this.g0.setColor(i0.a.k(-16777216, (int) (this.u0 * 102.0f * this.B0)));
        this.h0.setColor(i0.a.k(-16777216, (int) (127.5f * this.B0)));
        hh1 hh1Var = this.s;
        if (hh1Var != null) {
            hh1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0913 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0bc3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bd3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d2f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        boolean z10;
        boolean z11;
        int i9;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        int childsHight;
        org.telegram.ui.Components.voip.s1 s1Var;
        org.telegram.ui.Components.voip.s1 s1Var2;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.voip.r2 r2Var;
        VideoSink videoSink;
        int i11;
        boolean z18;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f10;
        float f11;
        float f12;
        TL_phone.PhoneCall phoneCall2;
        float f13;
        boolean z19;
        boolean z20;
        TextView textView;
        int i12;
        boolean z21 = true;
        z21 = true;
        z21 = true;
        z21 = true;
        if (this.C0 || this.A0) {
            return;
        }
        boolean z22 = this.m0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i13 = this.l0;
        TLRPC.User user = this.d;
        if (i13 == 1 || i13 == 2) {
            this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z22);
        } else {
            if (i13 != 3) {
                if (i13 == 4) {
                    this.B.b(LocaleController.getString(R.string.VoipFailed), false, z22);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new wg1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.Q0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            w3Var.N = LocaleController.getString(R.string.VoipFailed);
                            w3Var.P = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            ug1 ug1Var = new ug1(this, 2);
                            w3Var.j0 = string;
                            w3Var.k0 = ug1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            nl0 nl0Var = new nl0(28, this, zArr);
                            w3Var.h0 = string2;
                            w3Var.i0 = nl0Var;
                            w3Var.show();
                            for (int i14 = 0; i14 < 3; i14++) {
                                if (zArr2[i14] && (textView = (TextView) w3Var.d(-(i14 + 1))) != null) {
                                    textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.f6.q7));
                                }
                            }
                            w3Var.setCanceledOnTouchOutside(true);
                            w3Var.setOnDismissListener(new bg.j(14, this, zArr));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.y4.l0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.q0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new wg1(this, 1), 1000L);
                    }
                } else if (i13 != 5) {
                    switch (i13) {
                        case 11:
                            boolean z23 = sharedInstance != null && sharedInstance.hasRate();
                            this.Z.c();
                            if (!z23 || this.C0) {
                                AndroidUtilities.runOnUIThread(new wg1(this, 0), 200L);
                                break;
                            } else {
                                if (this.t0) {
                                    int[] iArr = new int[2];
                                    int i15 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i15 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.Q.setTranslationY(iArr[1]);
                                    this.Q.setAlpha(1.0f);
                                    this.Q.setLayoutParams(marginLayoutParams);
                                    this.f0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new n21(27, this, sharedInstance), 2L);
                                    i12 = 0;
                                } else {
                                    this.f0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Q.getLayoutParams();
                                    layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                    layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    layoutParams.bottomMargin = dp;
                                    WindowInsets windowInsets = this.n0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dp;
                                    }
                                    layoutParams.gravity = 80;
                                    this.Q.setLayoutParams(layoutParams);
                                    this.Q.animate().alpha(1.0f).setDuration(250L).start();
                                    i12 = 0;
                                    this.Q.a(new vg1(this, sharedInstance, i12), false);
                                }
                                this.M.setVisibility(i12);
                                org.telegram.ui.Components.voip.l1 l1Var = this.M;
                                ug1 ug1Var2 = new ug1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.k1[] k1VarArr = l1Var.c;
                                l1Var.d = ug1Var2;
                                org.telegram.ui.Components.voip.i1 i1Var = l1Var.a;
                                i1Var.setVisibility(i12);
                                l1Var.b.setVisibility(i12);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(i1Var, (Property<org.telegram.ui.Components.voip.i1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.gr.f);
                                animatorSet.setDuration(250L);
                                int i16 = 0;
                                while (i16 < k1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    k1VarArr[i16].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(k1VarArr[i16], (Property<org.telegram.ui.Components.voip.k1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i16], (Property<org.telegram.ui.Components.voip.k1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i16], (Property<org.telegram.ui.Components.voip.k1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(k1VarArr[i16], (Property<org.telegram.ui.Components.voip.k1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i16 * 16);
                                    animatorSet2.start();
                                    i16++;
                                    animatorSet = animatorSet;
                                    property3 = property3;
                                }
                                animatorSet.start();
                                if (this.y0) {
                                    this.y0 = false;
                                    ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                                    duration.setInterpolator(grVar).setListener(new org.telegram.ui.Components.u9(this.K)).start();
                                    this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar).setDuration(250L).start();
                                    this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new org.telegram.ui.Components.u9(this.K)).setDuration(250L).setInterpolator(grVar).start();
                                }
                                for (org.telegram.ui.Components.o9 o9Var : this.R) {
                                    o9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.gr.f).setDuration(250L).start();
                                }
                                this.A.animate().alpha(0.0f).setDuration(70L).setListener(new dh1(this)).start();
                                ViewPropertyAnimator alpha = this.G.animate().alpha(0.0f);
                                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
                                org.telegram.messenger.ll.r(alpha, grVar2, 250L);
                                this.G.setVisibility(8);
                                this.B.d(false, true);
                                this.B.c(false);
                                org.telegram.ui.Components.voip.s2 s2Var = this.B.d;
                                s2Var.n = true;
                                s2Var.invalidate();
                                org.telegram.ui.Components.voip.q0 q0Var = this.y;
                                q0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = q0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                q0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.ALPHA, q0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.TRANSLATION_Y, q0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_X, q0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(q0Var, (Property<org.telegram.ui.Components.voip.q0, Float>) View.SCALE_Y, q0Var.getScaleY(), 0.9f, 1.0f));
                                q0Var.c.setInterpolator(grVar2);
                                q0Var.c.setDuration(300L);
                                q0Var.c.setStartDelay(250L);
                                q0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.V.setAlpha(0.0f);
                                this.V.setVisibility(8);
                                this.U.setAlpha(0.0f);
                                this.U.setVisibility(8);
                                fh1 fh1Var = this.k0;
                                if (fh1Var != null) {
                                    fh1Var.a(false, false);
                                }
                                this.I0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.m0 != 12) {
                                this.B.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z22);
                                break;
                            }
                            break;
                        case 13:
                            this.B.b(LocaleController.getString(R.string.VoipWaiting), true, z22);
                            break;
                        case 14:
                            this.B.b(LocaleController.getString(R.string.VoipRequesting), true, z22);
                            break;
                        case 15:
                            this.a0.setRetryMod(false);
                            if (sharedState == null || !sharedState.isConference()) {
                                if (sharedState == null || !sharedState.isCallingVideo()) {
                                    this.B.b(LocaleController.getString(R.string.VoipInCallBranding), false, z22);
                                    this.a0.setTranslationY(0.0f);
                                    break;
                                } else {
                                    this.B.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z22);
                                    this.a0.setTranslationY(-AndroidUtilities.dp(60.0f));
                                    break;
                                }
                            } else {
                                this.B.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z22);
                                this.a0.setTranslationY(0.0f);
                                break;
                            }
                            break;
                        case 16:
                            if (this.m0 != 16) {
                                this.B.b(LocaleController.getString(R.string.VoipRinging), true, z22);
                                break;
                            }
                            break;
                        case 17:
                            this.B.b(LocaleController.getString(R.string.VoipBusy), false, z22);
                            this.a0.setRetryMod(true);
                            this.j0 = false;
                            this.i0 = false;
                            break;
                    }
                    z11 = false;
                    z10 = false;
                    if (this.k0 == null) {
                        return;
                    }
                    boolean z24 = this.i0 || this.j0;
                    if (sharedInstance != null) {
                        this.i0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z19 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z20 = false;
                                this.j0 = z20;
                                if (z20 && !this.Q0) {
                                    this.Q0 = z19;
                                }
                            }
                        } else {
                            z19 = true;
                        }
                        z20 = true;
                        this.j0 = z20;
                        if (z20) {
                            this.Q0 = z19;
                        }
                    }
                    if (z22) {
                        this.U.b();
                        this.V.b();
                    }
                    if (this.i0) {
                        if (this.A0) {
                            f13 = 1.0f;
                        } else {
                            f13 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z22) {
                            this.Y.animate().alpha(f13).setDuration(250L).start();
                        } else {
                            this.Y.animate().cancel();
                            this.Y.setAlpha(f13);
                        }
                        if (!this.Y.d.isFirstFrameRendered() && !this.E0) {
                            i9 = 0;
                            this.i0 = false;
                            if (!this.j0 || this.i0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i9);
                                if (z22) {
                                    this.Y.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.Y.animate().cancel();
                                    this.Y.setAlpha(0.0f);
                                }
                            }
                            z12 = this.j0;
                            if (z12 || !this.i0) {
                                this.D0 = false;
                            }
                            z13 = (z12 || !this.D0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            x(z22, z24);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z22) {
                                this.a0.setVisibility(z21 ? 0 : 8);
                            } else {
                                if (z21 && this.a0.getTag() == null) {
                                    this.a0.animate().setListener(null).cancel();
                                    if (this.a0.getVisibility() == 8) {
                                        this.a0.setVisibility(0);
                                        this.a0.setAlpha(0.0f);
                                    }
                                    this.a0.animate().alpha(1.0f);
                                }
                                if (!z21 && this.a0.getTag() != null) {
                                    this.a0.animate().setListener(null).cancel();
                                    this.a0.animate().setListener(new ah1(this, 8)).alpha(0.0f);
                                    this.a0.setEnabled(z21);
                                    this.a0.setTag(z21 ? 1 : null);
                                    this.q0.setLockOnScreen(this.F0);
                                    z14 = this.l0 != 3 && (this.j0 || this.i0);
                                    this.v0 = z14;
                                    if (!z14 && !this.t0) {
                                        A(true);
                                    }
                                    if (this.t0 && this.v0 && !this.N0 && sharedInstance != null) {
                                        AndroidUtilities.runOnUIThread(this.O0, 3000L);
                                        this.N0 = true;
                                    }
                                    int i17 = this.l0;
                                    boolean z25 = i17 == 11 && this.t0;
                                    boolean z26 = (!z21 || i17 == 16 || i17 == 11 || i17 == 12 || i17 == 14 || i17 == 6 || !this.t0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z22) {
                                        if (z25) {
                                            f10 = 80.0f;
                                            this.D.animate().alpha(1.0f).start();
                                        } else {
                                            f10 = 80.0f;
                                            if (this.D.getVisibility() != 0) {
                                                this.D.setVisibility(0);
                                                f11 = 0.0f;
                                                this.D.setAlpha(0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            this.D.animate().alpha(f11).start();
                                        }
                                        if (z26) {
                                            this.E.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.E.getVisibility() != 0) {
                                                this.E.setVisibility(0);
                                                f12 = 0.0f;
                                                this.E.setAlpha(0.0f);
                                            } else {
                                                f12 = 0.0f;
                                            }
                                            this.E.animate().alpha(f12).start();
                                        }
                                        this.I0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(f10) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                    } else {
                                        this.D.setVisibility(z25 ? 0 : 8);
                                        this.D.setAlpha(z25 ? 1.0f : 0.0f);
                                        this.E.setVisibility(z26 ? 0 : 8);
                                        this.E.setAlpha(z26 ? 1.0f : 0.0f);
                                        this.I0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i10 = this.l0;
                                    if (i10 != 10 && i10 != 11) {
                                        D(z22);
                                    }
                                    if (z10) {
                                        this.B.e(z22);
                                    }
                                    this.B.d(z11, z22);
                                    if (this.y.getVisibility() == 0 && this.y0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.P.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = e2.c.e(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.l0 == 11 && !this.j0 && !this.i0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.j0 || this.i0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z22) {
                                        if (this.y0 && (this.j0 || this.i0)) {
                                            this.T.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                            z15 = z24;
                                            j10 = 250;
                                        } else {
                                            j10 = 250;
                                            z15 = z24;
                                            this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                        }
                                        if (dp2 != this.r0) {
                                            ViewPropertyAnimator animate = this.T.animate();
                                            if (this.l0 != 11) {
                                                j10 = 0;
                                            }
                                            animate.setStartDelay(j10).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                        }
                                    } else {
                                        z15 = z24;
                                        this.T.setTranslationY(dp2);
                                    }
                                    this.r0 = dp2;
                                    boolean z27 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i18 = this.l0;
                                    this.z0 = i18 == 11 && i18 != 17 && ((this.j0 && !z27) || this.i0);
                                    if (sharedInstance != null) {
                                        if (this.j0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.Z.setIsScreencast(sharedInstance.isScreencast());
                                        this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.j0 || sharedInstance.isScreencast()) ? null : this.Z.d;
                                        if (!this.i1 || (r2Var = this.g1) == null) {
                                            if (z13) {
                                                videoSink = this.X;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z22) {
                                                    org.telegram.ui.Components.voip.g2 g2Var = this.I0;
                                                    g2Var.f = false;
                                                    if (!g2Var.e && g2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(g2Var, g2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.I0.c("self-muted");
                                                } else {
                                                    this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.j0 || this.i0) && (((i11 = this.l0) == 3 || i11 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var2 = this.I0;
                                                        g2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.I0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var3 = this.I0;
                                                        g2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, g2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.I0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.g2 g2Var4 = this.I0;
                                                        g2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, g2Var4.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.I0.c("muted");
                                                    }
                                                    this.I0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                }
                                                if (this.I0.getChildCount() == 0 && this.i0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                                    sharedUIParams = sharedInstance.sharedUIParams;
                                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                        sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                        this.J0.setTranslationY(-((this.s.getMeasuredHeight() - this.f0.getY()) + AndroidUtilities.dp(6.0f)));
                                                        this.J0.n(0.0f, this.f.getX() + this.f0.getX() + AndroidUtilities.dp(14.0f));
                                                        this.J0.v();
                                                        z18 = true;
                                                        if (z22) {
                                                            org.telegram.ui.Components.voip.g2 g2Var5 = this.I0;
                                                            if (g2Var5.f) {
                                                                g2Var5.e = z18;
                                                                AndroidUtilities.runOnUIThread(new mh.m2(g2Var5, 9), 700L);
                                                            }
                                                            g2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.I0.getChildCount() != 0) {
                                                    z18 = true;
                                                    this.J0.e(true);
                                                    if (z22) {
                                                    }
                                                }
                                                z18 = true;
                                                if (z22) {
                                                }
                                            } else {
                                                r2Var = this.Y;
                                            }
                                        }
                                        videoSink = r2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z22) {
                                        }
                                        if (sharedInstance.isMicMute()) {
                                        }
                                        if (this.j0) {
                                        }
                                        if (sharedInstance.getRemoteAudioState() != 0) {
                                        }
                                        if (sharedInstance.getRemoteVideoState() != 0) {
                                        }
                                        if (this.I0.getChildCount() == 0) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                            }
                                        }
                                        if (this.I0.getChildCount() != 0) {
                                        }
                                        z18 = true;
                                        if (z22) {
                                        }
                                    }
                                    childsHight = this.I0.getChildsHight();
                                    s1Var = this.V;
                                    if (s1Var.getParent() == null && z22) {
                                        s1Var.P = childsHight;
                                    } else {
                                        s1Var.P = childsHight;
                                    }
                                    s1Var2 = this.U;
                                    if (s1Var2.getParent() == null && z22) {
                                        s1Var2.P = childsHight;
                                    } else {
                                        s1Var2.P = childsHight;
                                    }
                                    this.U.setUiVisible(this.t0);
                                    this.V.setUiVisible(this.t0);
                                    if (!this.j0) {
                                        z16 = true;
                                        z(0, z22);
                                    } else if (!this.i0 || this.D0) {
                                        z16 = true;
                                        z(1, z22);
                                    } else {
                                        z(2, z22);
                                        z16 = true;
                                    }
                                    if (!z13 && this.V.getTag() == null) {
                                        this.V.setIsActive(z16);
                                        if (this.V.getVisibility() != 0) {
                                            this.V.setVisibility(0);
                                            this.V.setAlpha(0.0f);
                                            this.V.setScaleX(0.5f);
                                            this.V.setScaleY(0.5f);
                                        }
                                        this.V.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.s1 s1Var3 = this.V;
                                        s1Var3.V = true;
                                        s1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).setStartDelay(150L).withEndAction(new wg1(this, 4)).start();
                                        this.V.setTag(1);
                                    } else if (!z13 && this.V.getTag() != null) {
                                        this.V.setIsActive(false);
                                        this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ah1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                        this.V.setTag(null);
                                    }
                                    this.U.a();
                                    this.V.a();
                                    F();
                                    if (this.l0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i19 = this.v.R;
                                        if (i19 != 2 && i19 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.m0 != -1);
                                            z17 = !this.j0 || this.i0;
                                            this.x.setState(z17);
                                            this.w.setState(z17);
                                            this.r.e(z17);
                                            if (this.i0 && !z15 && this.b0) {
                                                this.b0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z17) {
                                                if (this.e0.getVisibility() != 4) {
                                                    this.e0.setVisibility(4);
                                                    this.d0.setVisibility(4);
                                                }
                                            } else if (this.e0.getVisibility() != 0) {
                                                this.e0.setVisibility(0);
                                                this.d0.setVisibility(0);
                                            }
                                            wg1 wg1Var = this.P0;
                                            AndroidUtilities.cancelRunOnUIThread(wg1Var);
                                            if (this.l0 != 3) {
                                                AndroidUtilities.runOnUIThread(wg1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.j0) {
                                    }
                                    this.x.setState(z17);
                                    this.w.setState(z17);
                                    this.r.e(z17);
                                    if (this.i0) {
                                        this.b0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z17) {
                                    }
                                    wg1 wg1Var2 = this.P0;
                                    AndroidUtilities.cancelRunOnUIThread(wg1Var2);
                                    if (this.l0 != 3) {
                                    }
                                }
                            }
                            this.a0.setEnabled(z21);
                            this.a0.setTag(z21 ? 1 : null);
                            this.q0.setLockOnScreen(this.F0);
                            if (this.l0 != 3) {
                            }
                            this.v0 = z14;
                            if (!z14) {
                                A(true);
                            }
                            if (this.t0) {
                                AndroidUtilities.runOnUIThread(this.O0, 3000L);
                                this.N0 = true;
                            }
                            int i172 = this.l0;
                            if (i172 == 11) {
                            }
                            if (!z21) {
                            }
                            if (z22) {
                            }
                            i10 = this.l0;
                            if (i10 != 10) {
                                D(z22);
                            }
                            if (z10) {
                            }
                            this.B.d(z11, z22);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.P.getLayout();
                                if (layout != null) {
                                    dp2 = e2.c.e(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.l0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.j0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z22) {
                            }
                            this.r0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i182 = this.l0;
                            this.z0 = i182 == 11 && i182 != 17 && ((this.j0 && !z27) || this.i0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.I0.getChildsHight();
                            s1Var = this.V;
                            if (s1Var.getParent() == null) {
                            }
                            s1Var.P = childsHight;
                            s1Var2 = this.U;
                            if (s1Var2.getParent() == null) {
                            }
                            s1Var2.P = childsHight;
                            this.U.setUiVisible(this.t0);
                            this.V.setUiVisible(this.t0);
                            if (!this.j0) {
                            }
                            if (!z13) {
                            }
                            if (!z13) {
                                this.V.setIsActive(false);
                                this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ah1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                                this.V.setTag(null);
                            }
                            this.U.a();
                            this.V.a();
                            F();
                            if (this.l0 == 3) {
                            }
                            if (this.j0) {
                            }
                            this.x.setState(z17);
                            this.w.setState(z17);
                            this.r.e(z17);
                            if (this.i0) {
                            }
                            if (z17) {
                            }
                            wg1 wg1Var22 = this.P0;
                            AndroidUtilities.cancelRunOnUIThread(wg1Var22);
                            if (this.l0 != 3) {
                            }
                        }
                    }
                    i9 = 0;
                    if (this.j0) {
                    }
                    this.v.setVisibility(4);
                    z12 = this.j0;
                    if (z12) {
                    }
                    this.D0 = false;
                    if (z12) {
                    }
                    x(z22, z24);
                    if (this.y.getTag() != null) {
                    }
                    if (z22) {
                    }
                    this.a0.setEnabled(z21);
                    this.a0.setTag(z21 ? 1 : null);
                    this.q0.setLockOnScreen(this.F0);
                    if (this.l0 != 3) {
                    }
                    this.v0 = z14;
                    if (!z14) {
                    }
                    if (this.t0) {
                    }
                    int i1722 = this.l0;
                    if (i1722 == 11) {
                    }
                    if (!z21) {
                    }
                    if (z22) {
                    }
                    i10 = this.l0;
                    if (i10 != 10) {
                    }
                    if (z10) {
                    }
                    this.B.d(z11, z22);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.l0 == 11) {
                    }
                    if (!this.j0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z22) {
                    }
                    this.r0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i1822 = this.l0;
                    this.z0 = i1822 == 11 && i1822 != 17 && ((this.j0 && !z27) || this.i0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.I0.getChildsHight();
                    s1Var = this.V;
                    if (s1Var.getParent() == null) {
                    }
                    s1Var.P = childsHight;
                    s1Var2 = this.U;
                    if (s1Var2.getParent() == null) {
                    }
                    s1Var2.P = childsHight;
                    this.U.setUiVisible(this.t0);
                    this.V.setUiVisible(this.t0);
                    if (!this.j0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                    }
                    this.U.a();
                    this.V.a();
                    F();
                    if (this.l0 == 3) {
                    }
                    if (this.j0) {
                    }
                    this.x.setState(z17);
                    this.w.setState(z17);
                    this.r.e(z17);
                    if (this.i0) {
                    }
                    if (z17) {
                    }
                    wg1 wg1Var222 = this.P0;
                    AndroidUtilities.cancelRunOnUIThread(wg1Var222);
                    if (this.l0 != 3) {
                    }
                }
            }
            E(z22);
            if (this.l0 == 5) {
                boolean z28 = this.o0;
                if (!z28 && this.m0 != 5) {
                    this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z22);
                }
                z11 = z28;
                z21 = false;
                z10 = false;
                if (this.k0 == null) {
                }
            } else {
                z10 = true;
                this.o0 = true;
                z21 = false;
                z11 = false;
                if (this.k0 == null) {
                }
            }
        }
        z21 = false;
        z11 = false;
        z10 = false;
        if (this.k0 == null) {
        }
    }

    @Override // ze.a
    public final Bitmap a() {
        org.telegram.ui.Components.voip.r2 r2Var = this.g1;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.g1.d.getBitmap();
    }

    @Override // ze.a
    public final void b(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // ze.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.Y.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.voipServiceCreated) {
            if (this.l0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.Z.d.release();
            this.Y.d.release();
            this.X.release();
            o();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            E(true);
            return;
        }
        if (i9 == NotificationCenter.closeInCallActivity) {
            this.q0.b();
            return;
        }
        if (i9 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i9 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.b0 = booleanValue;
            if (booleanValue) {
                this.y.b(true, true);
            }
        }
    }

    @Override // ze.a
    public final void e(af.f fVar) {
        this.h1 = fVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        eh1 eh1Var = this.q0;
        eh1Var.getClass();
        windowManager.addView(eh1Var, org.telegram.ui.Components.voip.v2.a());
        this.i1 = false;
        H();
        this.q0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.g1;
        if (r2Var != null) {
            r2Var.d.release();
            this.g1 = null;
        }
    }

    @Override // ze.a
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // ze.a
    public final void g(af.f fVar) {
        this.h1 = fVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.Y;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.i1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.q0);
        this.q0.invalidate();
    }

    @Override // ze.a
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.b, false, true, false, false);
        this.g1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.g1.d.setEnableHardwareScaler(true);
        this.g1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.g1;
        r2Var2.T = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new gh1(this));
        View view = this.g1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.g1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f10;
        final boolean z11;
        final float f11;
        float f12;
        float f13;
        this.U.animate().cancel();
        float f14 = org.telegram.ui.Components.voip.l2.k().d.x + org.telegram.ui.Components.voip.l2.k().y;
        float f15 = org.telegram.ui.Components.voip.l2.k().d.y + org.telegram.ui.Components.voip.l2.k().A;
        final float x10 = this.U.getX();
        final float y10 = this.U.getY();
        final float scaleX = this.U.getScaleX();
        org.telegram.ui.Components.voip.l2.Q.getClass();
        final float measuredWidth = f14 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f15 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f16 = 1.0f;
        if (this.i0) {
            int measuredWidth2 = this.U.getMeasuredWidth();
            if (!this.j0 || measuredWidth2 == 0) {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f12 = 1.0f;
                f13 = 0.0f;
            } else {
                f13 = (this.q0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f12 = (((org.telegram.ui.Components.voip.l2.k().f * 0.25f) + (f14 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * f13)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.l2.k().h * 0.25f) + (f15 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * f13)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f17 = f13;
            f10 = f12;
            f11 = f17;
        } else {
            c10 = 0;
            float measuredWidth3 = f14 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f15 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = measuredWidth3;
            z11 = true;
            f11 = 0.25f;
        }
        final float f18 = measuredHeight;
        float dp = this.i0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.i0) {
            org.telegram.ui.Components.voip.l2.Q.getClass();
            f16 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.U.setScaleX(f11);
                this.U.setScaleY(f11);
                this.U.setTranslationX(f10);
                this.U.setTranslationY(f18);
                this.U.setCornerRadius(dp2);
                this.U.setAlpha(f16);
            }
            this.Y.setScaleX(0.25f);
            this.Y.setScaleY(0.25f);
            this.Y.setTranslationX(measuredWidth);
            this.Y.setTranslationY(measuredHeight2);
            this.Y.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f19 = z10 ? 1.0f : 0.0f;
        float f20 = z10 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c10] = f19;
        fArr[1] = f20;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.B0 = z10 ? 0.0f : 1.0f;
        G();
        final float f21 = dp;
        final float f22 = 0.25f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zg1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                mh1 mh1Var = mh1.this;
                mh1Var.B0 = f23;
                mh1Var.G();
                if (z11) {
                    float f24 = (f11 * floatValue) + (scaleX * f23);
                    mh1Var.U.setScaleX(f24);
                    mh1Var.U.setScaleY(f24);
                    mh1Var.U.setTranslationX((f10 * floatValue) + (x10 * f23));
                    mh1Var.U.setTranslationY((f18 * floatValue) + (y10 * f23));
                    mh1Var.U.setCornerRadius((dp2 * floatValue) + (f21 * f23));
                    mh1Var.U.setAlpha((f16 * floatValue) + (1.0f * f23));
                }
                float f25 = (f22 * floatValue) + (1.0f * f23);
                mh1Var.Y.setScaleX(f25);
                mh1Var.Y.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                mh1Var.Y.setTranslationX(f27);
                mh1Var.Y.setTranslationY(f28);
                mh1Var.Y.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!mh1Var.U.L) {
                    mh1Var.Z.d(floatValue, false);
                }
                mh1Var.q0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        xe.d dVar = this.c0;
        if (dVar != null) {
            dVar.c();
            this.c0 = null;
        }
        bg.g3 g3Var = this.I;
        if (g3Var != null) {
            g3Var.dismiss();
            this.I = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.x0 && this.y0 != z10 && this.t0) {
            this.y0 = z10;
            org.telegram.ui.Components.voip.y2 y2Var = this.w;
            int i9 = 1;
            if (y2Var.G && z10 != y2Var.A) {
                y2Var.A = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                y2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x2(y2Var, i9));
                y2Var.c.setInterpolator(org.telegram.ui.Components.gr.f);
                y2Var.c.setDuration(200L);
                y2Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.K0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.O0);
                this.N0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                }
                this.K.animate().setListener(null).cancel();
                this.K.setVisibility(0);
                this.K.setAlpha(0.0f);
                this.K.setScaleX(0.3f);
                this.K.setScaleY(0.3f);
                this.K.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                ViewPropertyAnimator translationY = this.J.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                org.telegram.messenger.ll.r(translationY, grVar, 400L);
                this.N.animate().setListener(null).cancel();
                this.N.setVisibility(0);
                this.N.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.N.setScaleX(0.7f);
                this.N.setScaleY(0.7f);
                this.N.setAlpha(0.0f);
                this.N.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ah1(this, 3)).setInterpolator(grVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f).start();
                }
                this.K.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f;
                duration.setInterpolator(grVar2).setListener(new org.telegram.ui.Components.u9(this.K)).start();
                this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar2).setDuration(280L).start();
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ah1(this, 4)).setDuration(250L).setInterpolator(grVar2).start();
            }
            this.m0 = this.l0;
            H();
        }
    }

    public final void n() {
        this.q0.b();
    }

    public final void o() {
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bh1(this));
        this.Y.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ch1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.X.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.m0 = this.l0;
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i9, int i10) {
        this.m0 = this.l0;
        if (i10 == 2 && !this.Q0) {
            this.Q0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            xe.d dVar = this.c0;
            if (dVar != null) {
                dVar.c();
                this.c0 = null;
            }
        } else if (this.c0 == null && af.d.a(this.b) == 1) {
            xe.c cVar = new xe.c(this.b, j1);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var = this.Y;
            cVar.j = r2Var.d;
            cVar.k = r2Var.getPlaceholderView();
            this.c0 = cVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.ui.Components.voip.b3 b3Var;
        if (i9 > 0) {
            this.f1 = true;
        }
        if (this.B == null || (b3Var = this.v) == null) {
            return;
        }
        int i10 = b3Var.R;
        if ((i10 == 2 || i10 == 3) && this.f1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(this, i9, 26), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i9) {
        int i10 = this.l0;
        if (i10 != i9) {
            this.m0 = i10;
            this.l0 = i9;
            if (this.q0 != null) {
                H();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.m0 = this.l0;
        if (z10 && !this.Q0) {
            this.Q0 = true;
        }
        H();
    }

    public final void p() {
        if (this.C0 || this.A0) {
            return;
        }
        fh1 fh1Var = this.k0;
        if (fh1Var != null) {
            fh1Var.a(false, false);
            return;
        }
        if (this.i0 && this.j0 && this.D0) {
            this.D0 = false;
            this.U.setRelativePosition(this.V);
            this.W = false;
            this.m0 = this.l0;
            H();
            return;
        }
        if (this.y0) {
            m(false);
            return;
        }
        if (this.N.getVisibility() != 8) {
            return;
        }
        if (!this.z0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.q0.b();
            return;
        }
        if (af.d.a(this.b) <= 0) {
            org.telegram.ui.Components.y4.B(this.b, new ug1(this, 0), true).o();
            return;
        }
        if (this.C0 || j1 == null) {
            return;
        }
        this.C0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = j1.q0.getMeasuredHeight();
            mh1 mh1Var = j1;
            org.telegram.ui.Components.voip.l2.l(mh1Var.b, mh1Var.a, mh1Var.q0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = j1.n0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.l2.S = windowInsets.getSystemWindowInsetTop();
                j1.n0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.l2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        duration.setInterpolator(grVar).start();
        this.D.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.T.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
        this.f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.d0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.V.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        this.I0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
        org.telegram.ui.Components.voip.l2.P = true;
        this.A0 = true;
        ValueAnimator k10 = k(false);
        this.H0.lock();
        k10.addListener(new ah1(this, 1));
        k10.setDuration(350L);
        k10.setInterpolator(grVar);
        k10.start();
    }

    public final void r(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.a0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.a0;
            ValueAnimator valueAnimator = eVar.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.U = null;
                eVar.Q.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.a0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.a0;
        ValueAnimator valueAnimator2 = eVar2.U;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.U = null;
            eVar2.Q.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f.d(3, true, false);
        this.n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.yg1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                mh1 mh1Var = mh1.this;
                mh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mh1Var.a0.setTranslationY(dp2 * floatValue);
                int i9 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i9;
                marginLayoutParams2.rightMargin = i9;
                mh1Var.a0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.a0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.a0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.a0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.a0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.su0(15, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new wg1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        if (!this.j0) {
            j3Var.d(2, false, false);
            j3Var.setOnBtnClickedListener(null);
            j3Var.setEnabled(false);
        } else {
            j3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                j3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                j3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            j3Var.setOnBtnClickedListener(new a7(this, voIPService, j3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        j3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.U;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = s1Var.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.G, isMicMute ? 1.0f : 0.0f);
            s1Var.b0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.c0);
            s1Var.b0.setDuration(150L);
            s1Var.b0.start();
        } else {
            ValueAnimator valueAnimator2 = s1Var.b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            s1Var.G = isMicMute ? 1.0f : 0.0f;
            s1Var.invalidate();
        }
        j3Var.setOnBtnClickedListener(new ug1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        int i9;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            j3Var.d(4, false, false);
            i9 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            j3Var.d(5, true, false);
            i9 = 0;
        } else {
            j3Var.d(5, false, false);
            i9 = 1;
        }
        j3Var.setEnabled(true);
        j3Var.setOnBtnClickedListener(new bg.d0(this, i9, j3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        if (!((this.j0 || this.i0) ? true : voIPService.isVideoAvailable())) {
            j3Var.d(3, true, false);
            j3Var.setOnClickListener(null);
            j3Var.setEnabled(false);
            return;
        }
        if (!this.j0) {
            j3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            j3Var.d(3, false, z10);
        } else {
            j3Var.d(3, false, z10);
        }
        j3Var.setOnBtnClickedListener(new ug1(this, 6));
        j3Var.setEnabled(true);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12 = (this.j0 || this.i0) ? false : true;
        if (!z10) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.setAlpha(1.0f);
            this.y.setScaleX(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setVisibility(z12 ? 0 : 8);
        } else if (z12 && this.y.getTag() == null) {
            this.y.animate().setListener(null).cancel();
            this.y.setVisibility(0);
            if (this.y0) {
                if (z11) {
                    this.y.setAlpha(0.0f);
                    this.y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.y.setScaleX(0.1f);
                    this.y.setScaleY(0.1f);
                }
            } else if (z11) {
                this.y.setAlpha(0.0f);
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.gr.f).setListener(new ah1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        w3Var.N = LocaleController.getString(R.string.VoipFailed);
        w3Var.P = charSequence;
        w3Var.h0 = LocaleController.getString(R.string.OK);
        w3Var.i0 = null;
        w3Var.show();
        for (int i9 = 0; i9 < 3; i9++) {
            if (zArr[i9] && (textView = (TextView) w3Var.d(-(i9 + 1))) != null) {
                textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.f6.q7));
            }
        }
        w3Var.setCanceledOnTouchOutside(true);
        w3Var.setOnDismissListener(new r5(this, 19));
    }

    public final void z(int i9, boolean z10) {
        AnimatorSet animatorSet;
        if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
            this.U.setUiVisible(this.t0);
        }
        if (!z10 && (animatorSet = this.w0) != null) {
            animatorSet.removeAllListeners();
            this.w0.cancel();
        }
        if (i9 != 0) {
            boolean z11 = (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.U.setVisibility(0);
            } else if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 0) {
                if (this.U.getVisibility() == 8) {
                    this.U.setAlpha(0.0f);
                    this.U.setScaleX(0.7f);
                    this.U.setScaleY(0.7f);
                    this.U.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.w0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.w0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.w0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var = this.U;
                if (s1Var.y < 0.0f) {
                    s1Var.d(1.0f, 1.0f);
                    this.W = true;
                }
            }
            this.U.c(i9 == 2, z11);
            this.W = i9 != 2;
        } else if (!z10) {
            this.U.setVisibility(8);
        } else if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.w0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.w0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.s1 s1Var2 = this.U;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(s1Var2, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, s1Var2.getAlpha(), 0.0f));
            if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.s1 s1Var3 = this.U;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var3, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, s1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.s1 s1Var4 = this.U;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var4, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, s1Var4.getScaleX(), 0.7f));
            }
            this.w0 = animatorSet5;
            animatorSet5.addListener(new ah1(this, 6));
            this.w0.setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f);
            this.w0.setStartDelay(50L);
            this.w0.start();
        }
        this.U.setTag(Integer.valueOf(i9));
    }

    @Override // ze.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
