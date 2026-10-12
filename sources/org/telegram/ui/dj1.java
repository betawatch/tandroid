package org.telegram.ui;

import android.animation.Animator;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dj1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, tf.a {
    public static dj1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.o2 F;
    public float F0;
    public cj1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ig.k K;
    public long K0;
    public int L;
    public ug.m1 M;
    public org.telegram.ui.Components.voip.f2 M0;
    public ic1 N;
    public org.telegram.ui.Components.voip.c3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.c3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.m1 Q;
    public di.v5 R;
    public boolean R0;
    public TextView S;
    public xk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public zi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.s1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.s1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.r2 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.r2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.j3 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.j3 f;
    public boolean f0;
    public rf.d g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.j3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.p1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.r2 k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean m1;
    public aj1 n;
    public boolean n0;
    public wi1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public yi1 s;
    public boolean s0;
    public float t0;
    public vi1 u0;
    public org.telegram.ui.Components.voip.b3 v;
    public int v0;
    public org.telegram.ui.Components.voip.y2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.d3 x;
    public org.telegram.ui.Components.voip.r0 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.o1 r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.z9[] V = new org.telegram.ui.Components.z9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final f21 Q0 = new f21(this, 20);
    public final ni1 S0 = new ni1(this, 12);
    public final ni1 T0 = new ni1(this, 13);
    public float f1 = 1.0f;

    public dj1(int i10) {
        this.a = i10;
        this.c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.q0 = -1;
        this.p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(dj1 dj1Var) {
        dj1 dj1Var2;
        int i10 = 0;
        if (dj1Var.g1) {
            dj1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            dj1Var.i1 = ofFloat;
            dj1Var2 = dj1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(dj1Var2, dj1Var.f1, dj1Var.Y0, dj1Var.Z0, 1));
            dj1Var2.i1.addListener(new ri1(dj1Var2, i10));
            dj1Var2.i1.setDuration(350L);
            dj1Var2.i1.setInterpolator(org.telegram.ui.Components.es.f);
            dj1Var2.i1.start();
        } else {
            dj1Var2 = dj1Var;
        }
        dj1Var2.h1 = false;
        dj1Var2.a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        dj1 dj1Var = n1;
        if (dj1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    dj1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    dj1Var.q(new b31(5));
                } else if (!dj1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.d2.h(dj1Var.b, new ni1(dj1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    dj1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    dj1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i10) {
        dj1 dj1Var = n1;
        if (dj1Var != null && dj1Var.u0.getParent() == null) {
            dj1 dj1Var2 = n1;
            if (dj1Var2 != null) {
                dj1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                vi1 vi1Var = n1.u0;
                if (vi1Var != null) {
                    vi1Var.d();
                }
                n1.k();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.k2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        dj1 dj1Var3 = new dj1(i10);
        dj1Var3.b = activity;
        n1 = dj1Var3;
        vi1 vi1Var2 = new vi1(activity, !z10, dj1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        vi1Var2.setLockOnScreen(n1.J0);
        dj1Var3.u0 = vi1Var2;
        ki1 ki1Var = new ki1(dj1Var3, 4);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.i(vi1Var2, ki1Var);
        ((WindowManager) activity.getSystemService("window")).addView(vi1Var2, org.telegram.ui.Components.voip.v2.a());
        dj1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        dj1Var3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        yi1 yi1Var = new yi1(dj1Var3, activity);
        yi1Var.setClipToPadding(false);
        yi1Var.setClipChildren(false);
        yi1Var.setBackgroundColor(-16777216);
        dj1Var3.F();
        dj1Var3.s = yi1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.o1 o1Var = dj1Var3.r;
        dj1Var3.v = new org.telegram.ui.Components.voip.b3(activity, z11, o1Var);
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
        dj1Var3.c0 = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2Var.d.setScalingType(scalingType);
        dj1Var3.c0.d.setEnableHardwareScaler(true);
        dj1Var3.c0.d.setRotateTextureWithScreen(true);
        dj1Var3.c0.a0 = 1;
        yi1Var.addView(dj1Var3.v, w7.a6.d(-1.0f, -1));
        TLRPC.User user = dj1Var3.d;
        org.telegram.ui.Components.voip.y2 y2Var = new org.telegram.ui.Components.voip.y2(activity, user, o1Var);
        dj1Var3.w = y2Var;
        yi1Var.addView(y2Var, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.g6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                d3Var.a = new org.telegram.ui.Components.zw0(0);
            }
        }
        dj1Var3.x = d3Var;
        yi1Var.addView(d3Var, w7.a6.d(220.0f, -1));
        yi1Var.addView(dj1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.y9(orientation, new int[]{-14994098, -14328963}).f(ji.w4.T(0.5f, 1), new kd1(dj1Var3, 1), 0L);
        org.telegram.ui.Components.voip.s1 s1Var = new org.telegram.ui.Components.voip.s1(activity);
        dj1Var3.Y = s1Var;
        s1Var.setDelegate(new ki1(dj1Var3, 3));
        dj1Var3.Y.d(1.0f, 1.0f);
        dj1Var3.a0 = true;
        org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
        dj1Var3.d0 = r2Var2;
        r2Var2.d.setIsCamera(true);
        dj1Var3.d0.d.setUseCameraRotation(true);
        dj1Var3.Y.setOnTapListener(new oi1(dj1Var3, 1));
        dj1Var3.d0.d.setMirror(true);
        dj1Var3.Y.addView(dj1Var3.d0);
        org.telegram.ui.Components.voip.s1 s1Var2 = new org.telegram.ui.Components.voip.s1(activity);
        dj1Var3.Z = s1Var2;
        s1Var2.S = true;
        s1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        dj1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        dj1Var3.b0.setIsCamera(false);
        dj1Var3.b0.setFpsReduction(30.0f);
        dj1Var3.b0.setScalingType(scalingType);
        dj1Var3.Z.addView(dj1Var3.b0, w7.a6.e(-1, -2, 17));
        dj1Var3.Z.setOnTapListener(new oi1(dj1Var3, i11));
        dj1Var3.Z.setVisibility(8);
        yi1Var.addView(dj1Var3.Y, w7.a6.d(-2.0f, -2));
        yi1Var.addView(dj1Var3.Z);
        View view = new View(activity);
        dj1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        yi1Var.addView(dj1Var3.h0, w7.a6.e(-1, 160, 80));
        View view2 = new View(activity);
        dj1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        yi1Var.addView(dj1Var3.i0, w7.a6.e(-1, 160, 48));
        ic1 ic1Var = new ic1(dj1Var3, activity, 16);
        dj1Var3.N = ic1Var;
        ic1Var.setOrientation(0);
        dj1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        dj1Var3.N.setClipToPadding(false);
        dj1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        dj1Var3.N.setOnClickListener(new oi1(dj1Var3, 3));
        dj1Var3.P = new org.telegram.ui.Components.voip.p0(activity, o1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        dj1Var3.O = frameLayout;
        frameLayout.addView(dj1Var3.P, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 3));
        dj1Var3.O.setVisibility(8);
        dj1Var3.O.setOnClickListener(new oi1(dj1Var3, 4));
        di.v5 v5Var = new di.v5(activity, o1Var);
        dj1Var3.R = v5Var;
        v5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        dj1Var3.S = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        dj1Var3.S.setTextSize(1, 15.0f);
        dj1Var3.S.setTypeface(AndroidUtilities.bold());
        dj1Var3.S.setTextColor(-1);
        dj1Var3.S.setGravity(17);
        xk xkVar = new xk(dj1Var3, activity, 5);
        dj1Var3.T = xkVar;
        xkVar.setTextSize(1, 15.0f);
        dj1Var3.T.setTextColor(-1);
        dj1Var3.T.setGravity(17);
        dj1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), dj1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        dj1Var3.R.setVisibility(8);
        dj1Var3.R.addView(dj1Var3.S);
        dj1Var3.R.addView(dj1Var3.T, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        dj1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(activity);
            org.telegram.ui.Components.z9[] z9VarArr = dj1Var3.V;
            z9VarArr[i15] = z9Var;
            z9VarArr[i15].getImageReceiver().setAspectFit(true);
            dj1Var3.N.addView(z9VarArr[i15], w7.a6.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        zi1 zi1Var = new zi1(dj1Var3, activity);
        dj1Var3.X = zi1Var;
        zi1Var.setOrientation(1);
        dj1Var3.X.setFocusable(true);
        dj1Var3.X.setFocusableInTouchMode(true);
        dj1Var3.y = new org.telegram.ui.Components.voip.r0(activity);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.r(user);
        org.telegram.ui.Components.voip.r0 r0Var = dj1Var3.y;
        int i16 = dj1Var3.a;
        r0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, k9Var, user);
        dj1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        dj1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        dj1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), dj1Var3.E.getPaint().getFontMetricsInt(), false));
        dj1Var3.E.setMaxLines(2);
        dj1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        dj1Var3.E.setTextColor(-1);
        dj1Var3.E.setGravity(1);
        dj1Var3.E.setImportantForAccessibility(2);
        dj1Var3.X.addView(dj1Var3.E, w7.a6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(activity);
        o2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            o2Var.a[i17] = new TextView(activity);
            o2Var.a[i17].setTextSize(1, 15.0f);
            o2Var.a[i17].setTextColor(-1);
            o2Var.a[i17].setGravity(1);
            o2Var.addView(o2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        o2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(o2Var, activity, o1Var);
        l2Var.setTextSize(1, 15.0f);
        l2Var.setTextColor(-1);
        l2Var.setGravity(1);
        l2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        l2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(l2Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        frameLayout2.setVisibility(8);
        o2Var.addView(frameLayout2, w7.a6.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 0));
        TextView textView3 = new TextView(activity);
        o2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        o2Var.addView(textView3, w7.a6.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -1, 0));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new ig.w1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
        o2Var.d = s2Var;
        o2Var.addView(s2Var, w7.a6.d(-2.0f, -1));
        dj1Var3.F = o2Var;
        WeakHashMap weakHashMap2 = r0.j0.a;
        o2Var.setImportantForAccessibility(4);
        dj1Var3.X.addView(dj1Var3.F, w7.a6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            cj1 cj1Var = new cj1(activity);
            dj1Var3.G = cj1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.m9 m9Var = cj1Var.b;
                m9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    m9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                m9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    cj1Var.setVisibility(8);
                } else {
                    cj1Var.c = new org.telegram.ui.Components.h11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    cj1Var.setVisibility(0);
                    cj1Var.invalidate();
                }
            } else {
                cj1Var.setVisibility(8);
            }
            dj1Var3.X.addView(dj1Var3.G, w7.a6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        dj1Var3.X.setClipChildren(false);
        dj1Var3.X.setClipToPadding(false);
        dj1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        dj1Var3.U = new org.telegram.ui.Components.voip.k(activity);
        dj1Var3.Q = new org.telegram.ui.Components.voip.m1(activity, o1Var);
        dj1Var3.U.setAlpha(0.0f);
        dj1Var3.Q.setVisibility(8);
        yi1Var.addView(dj1Var3.y, w7.a6.a(204.0f, 0.0f, 93.0f, 0.0f, 0.0f, 204, 1));
        yi1Var.addView(dj1Var3.X, w7.a6.a(-2.0f, 0.0f, 135.0f, 0.0f, 0.0f, -1, 0));
        yi1Var.addView(dj1Var3.O, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        yi1Var.addView(dj1Var3.R, w7.a6.a(-2.0f, 0.0f, 118.0f, 0.0f, 0.0f, 304, 49));
        yi1Var.addView(dj1Var3.N, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        yi1Var.addView(dj1Var3.U, w7.a6.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 5));
        yi1Var.addView(dj1Var3.Q, w7.a6.a(-2.0f, 0.0f, 380.0f, 0.0f, 0.0f, -1, 3));
        dj1Var3.j0 = new org.telegram.ui.Components.voip.p1(activity);
        dj1Var3.e = new org.telegram.ui.Components.voip.j3(activity, o1Var);
        dj1Var3.f = new org.telegram.ui.Components.voip.j3(activity, o1Var);
        dj1Var3.h = new org.telegram.ui.Components.voip.j3(activity, o1Var);
        dj1Var3.n = new aj1(activity, 52.0f);
        dj1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        dj1Var3.e.setScaleX(0.0f);
        dj1Var3.e.setScaleY(0.0f);
        dj1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        dj1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        dj1Var3.f.setScaleX(0.0f);
        dj1Var3.f.setScaleY(0.0f);
        dj1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        dj1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        dj1Var3.h.setScaleX(0.0f);
        dj1Var3.h.setScaleY(0.0f);
        dj1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        dj1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        dj1Var3.n.setScaleX(0.0f);
        dj1Var3.n.setScaleY(0.0f);
        dj1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        dj1Var3.j0.addView(dj1Var3.e);
        dj1Var3.j0.addView(dj1Var3.f);
        dj1Var3.j0.addView(dj1Var3.h);
        dj1Var3.j0.addView(dj1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        dj1Var3.e0 = eVar;
        eVar.setListener(new bj1(dj1Var3));
        dj1Var3.e0.setScaleX(1.15f);
        dj1Var3.e0.setScaleY(1.15f);
        yi1Var.addView(dj1Var3.j0, w7.a6.e(-1, -2, 80));
        float f7 = AndroidUtilities.isTablet() ? 100 : 27;
        yi1Var.addView(dj1Var3.e0, w7.a6.a(186.0f, f7, 0.0f, f7, 0.0f, -1, 80));
        ImageView imageView = new ImageView(activity);
        dj1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
        dj1Var3.I.setImageResource(R.drawable.msg_addcontact);
        dj1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        yi1Var.addView(dj1Var3.I, w7.a6.e(56, 56, 53));
        w7.c6.a(dj1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        dj1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
        dj1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        dj1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        dj1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
        yi1Var.addView(dj1Var3.H, w7.a6.e(56, 56, 51));
        w7.c6.a(dj1Var3.H);
        ig.k kVar = new ig.k(activity, 5);
        dj1Var3.K = kVar;
        kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        dj1Var3.K.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(-1, 76), 1, -1));
        dj1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        yi1Var.addView(dj1Var3.K, w7.a6.a(56.0f, 0.0f, 56.0f, 0.0f, 0.0f, 56, 53));
        dj1Var3.K.setAlpha(0.0f);
        dj1Var3.K.setOnClickListener(new oi1(dj1Var3, 5));
        int i21 = 6;
        dj1Var3.H.setOnClickListener(new oi1(dj1Var3, i21));
        dj1Var3.I.setOnClickListener(new bz0(10, dj1Var3, activity));
        if (dj1Var3.u0.b) {
            dj1Var3.H.setVisibility(8);
            dj1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.f2 f2Var = new org.telegram.ui.Components.voip.f2(activity);
        f2Var.a = new HashMap();
        f2Var.b = new ArrayList();
        f2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        f2Var.r = textPaint;
        f2Var.setOrientation(1);
        f2Var.n = o1Var;
        TransitionSet transitionSet = new TransitionSet();
        f2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        dj1Var3.M0 = f2Var;
        f2Var.setGravity(80);
        dj1Var3.M0.setOnViewsUpdated(new ni1(dj1Var3, 5));
        yi1Var.addView(dj1Var3.M0, w7.a6.a(200.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 80));
        org.telegram.ui.Components.voip.c3 c3Var = new org.telegram.ui.Components.voip.c3(activity, 3, o1Var, true);
        c3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c3Var.K = alignment;
        c3Var.d = -1L;
        c3Var.l0 = new ni1(dj1Var3, i21);
        c3Var.T = true;
        c3Var.h = AndroidUtilities.dp(320.0f);
        c3Var.e = true;
        c3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var.q(8.0f);
        dj1Var3.N0 = c3Var;
        c3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        yi1Var.addView(dj1Var3.N0, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 80));
        org.telegram.ui.Components.voip.c3 c3Var2 = new org.telegram.ui.Components.voip.c3(activity, 1, o1Var, false);
        c3Var2.p(true);
        c3Var2.K = alignment;
        c3Var2.d = 4000L;
        c3Var2.T = true;
        c3Var2.h = AndroidUtilities.dp(320.0f);
        c3Var2.e = true;
        c3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        c3Var2.q(8.0f);
        dj1Var3.O0 = c3Var2;
        c3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        yi1Var.addView(dj1Var3.O0, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
        dj1Var3.G();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!dj1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                dj1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            dj1Var3.n();
        }
        vi1Var2.addView(yi1Var);
        if (z10) {
            dj1Var3.F0 = 0.0f;
            dj1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                dj1Var3.c0.setStub(org.telegram.ui.Components.voip.k2.k().s);
                dj1Var3.d0.setStub(org.telegram.ui.Components.voip.k2.k().r);
            }
            dj1Var3.u0.setAlpha(0.0f);
            dj1Var3.G();
            dj1Var3.E0 = true;
            org.telegram.ui.Components.voip.k2.U = true;
            if (org.telegram.ui.Components.voip.k2.W != null) {
                org.telegram.ui.Components.voip.k2.V.getClass();
                throw null;
            }
            dj1Var3.L0.lock();
            AndroidUtilities.runOnUIThread(new ni1(dj1Var3, 11), 32L);
        } else {
            dj1Var3.F0 = 1.0f;
            dj1Var3.F();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && uf.b.a(activity) == 1) {
            dj1 dj1Var4 = n1;
            rf.c cVar = new rf.c(activity, dj1Var4);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var3 = dj1Var4.c0;
            cVar.j = r2Var3.d;
            cVar.k = r2Var3.getPlaceholderView();
            dj1Var4.g0 = cVar.a();
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            ni1 ni1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                AndroidUtilities.runOnUIThread(ni1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.n0) {
                this.d0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.q0 = this.p0;
                G();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                wi1 wi1Var = new wi1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = wi1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    wi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
            }
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
            transitionSet.addTransition(duration.setInterpolator(esVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(esVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.j3.class, true);
            TransitionManager.beginDelayedTransition(this.j0, transitionSet);
        }
        int i10 = this.p0;
        if (i10 == 11) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        int i11 = 0;
        if (i10 == 15 || i10 == 17) {
            TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
            if (phoneCall != null && phoneCall.video && i10 == 15) {
                if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                    t(this.e, sharedInstance);
                    this.K.animate().alpha(0.0f).start();
                } else {
                    r(this.e, sharedInstance);
                    if (this.x0) {
                        this.K.animate().alpha(1.0f).start();
                    }
                }
                u(this.f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (n1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                t(this.e, sharedInstance);
                this.K.setTag(null);
                this.K.animate().alpha(0.0f).start();
            } else {
                r(this.e, sharedInstance);
                if (this.x0) {
                    this.K.setTag(1);
                    this.K.animate().alpha(1.0f).start();
                }
            }
            u(this.f, sharedInstance, false);
            s(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
            this.n.setOnClickListener(new oi1(this, 0));
        }
        if (this.e.getVisibility() == 0) {
            this.e.f = 0;
            i11 = 16;
        }
        if (this.f.getVisibility() == 0) {
            this.f.f = i11;
            i11 += 16;
        }
        if (this.h.getVisibility() == 0) {
            this.h.f = i11;
            i11 += 16;
        }
        if (this.n.getVisibility() == 0) {
            this.n.F = i11;
        }
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.z9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.z9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.z9] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.s5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.z9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        bi.b4 b4Var;
        String[] strArr;
        TLRPC.Document document;
        int i10;
        ?? r52;
        if (this.B0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z12 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
        int i11 = 0;
        while (true) {
            r62 = this.V;
            drawableArr = this.W;
            if (i11 >= 4) {
                break;
            }
            Emoji.preloadEmoji(emojifyForCall[i11]);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i11]);
            if (emojiDrawable != null) {
                emojiDrawable.setBounds(z12 ? 1 : 0, z12 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence replaceEmoji = Emoji.replaceEmoji(emojifyForCall[i11], textPaint.getFontMetricsInt(), z12, iArr);
                boolean z13 = replaceEmoji instanceof Spannable;
                int i12 = this.a;
                if (z13) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                    org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.b6.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (b6VarArr == null ? z12 ? 1 : 0 : b6VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = z12 ? 1 : 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new v3(this, 27));
                                if (stickerSet != null) {
                                    String replace = emojiSpan.emoji.replace("️", "");
                                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= size) {
                                            strArr = emojifyForCall;
                                            i10 = length;
                                            document = null;
                                            break;
                                        }
                                        TLRPC.Document document2 = arrayList.get(i14);
                                        i14++;
                                        strArr = emojifyForCall;
                                        document = document2;
                                        ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                        i10 = length;
                                        if (TextUtils.equals(MessageObject.findAnimatedEmojiEmoticon(document, null).replace("️", ""), replace)) {
                                            break;
                                        }
                                        length = i10;
                                        emojifyForCall = strArr;
                                        arrayList = arrayList2;
                                    }
                                    if (document != null) {
                                        break;
                                    }
                                    i13++;
                                    length = i10;
                                    emojifyForCall = strArr;
                                    r32 = 0;
                                }
                            }
                        }
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                        Drawable drawable = drawableArr[i11];
                        if ((drawable instanceof org.telegram.ui.Components.s5) && ((org.telegram.ui.Components.s5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.s5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(21, i12, document);
                            drawableArr[i11] = s5Var;
                            r52 = s5Var;
                        }
                        r52.r(strArr[i11]);
                        r62[i11].setAnimatedEmojiDrawable(r52);
                        r62[i11].getImageReceiver().clearImage();
                        emojiDrawable = r52;
                    } else {
                        r62[i11].setImageDrawable(emojiDrawable);
                        emojiDrawable = emojiDrawable;
                    }
                    r62[i11].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r62[i11].setVisibility(8);
            } else {
                strArr = emojifyForCall;
            }
            drawableArr[i11] = emojiDrawable;
            i11++;
            emojifyForCall = strArr;
            z12 = false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            Drawable drawable2 = drawableArr[i16];
            if (drawable2 instanceof Emoji.EmojiDrawable) {
                z11 = ((Emoji.EmojiDrawable) drawable2).isLoaded();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.s5) && (b4Var = ((org.telegram.ui.Components.s5) drawable2).k) != null) {
                    Drawable thumb = b4Var.getThumb();
                    if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                i15++;
            }
        }
        if (i15 == 4) {
            this.B0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r62[i17].getVisibility() != 0) {
                    r62[i17].setVisibility(0);
                    if (z10) {
                        r62[i17].setAlpha(0.0f);
                        r62[i17].setScaleX(0.0f);
                        r62[i17].setScaleY(0.0f);
                        org.telegram.messenger.yh.s(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.es.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new ni1(this, 9), 1000L);
        }
    }

    public final void E() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i10 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.J != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void F() {
        this.k0.setColor(i0.a.k(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        yi1 yi1Var = this.s;
        if (yi1Var != null) {
            yi1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0924 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0bd2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0be2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0d3f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        TLRPC.User user;
        int i12;
        boolean z15;
        int childsHight;
        org.telegram.ui.Components.voip.s1 s1Var;
        org.telegram.ui.Components.voip.s1 s1Var2;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.ui.Components.voip.r2 r2Var;
        VideoSink videoSink;
        int i13;
        boolean z19;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        float f11;
        TL_phone.PhoneCall phoneCall2;
        float f12;
        boolean z20;
        boolean z21;
        TextView textView;
        int i14;
        boolean z22 = true;
        z22 = true;
        z22 = true;
        z22 = true;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z23 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        int i16 = 10;
        TLRPC.User user2 = this.d;
        int i17 = 2;
        if (i15 == 1 || i15 == 2) {
            this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z23);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    this.F.b(LocaleController.getString(R.string.VoipFailed), false, z23);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new ni1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        x(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user2.first_name, user2.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user2));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            w3Var.R = LocaleController.getString(R.string.VoipFailed);
                            w3Var.T = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            ki1 ki1Var = new ki1(this, 2);
                            w3Var.n0 = string;
                            w3Var.o0 = ki1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            cs0 cs0Var = new cs0(23, this, zArr);
                            w3Var.l0 = string2;
                            w3Var.m0 = cs0Var;
                            w3Var.show();
                            for (int i18 = 0; i18 < 3; i18++) {
                                if (zArr2[i18] && (textView = (TextView) w3Var.d(-(i18 + 1))) != null) {
                                    textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.q7));
                                }
                            }
                            w3Var.setCanceledOnTouchOutside(true);
                            w3Var.setOnDismissListener(new fi.d0(this, zArr, 12));
                        } else {
                            x(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user2))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        x(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user2.first_name, user2.last_name))));
                        org.telegram.ui.Components.g5.k0(this.b, this.a, user2.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        x("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        x(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new ni1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z24 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z24 || this.G0) {
                                AndroidUtilities.runOnUIThread(new ni1(this, 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i19 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i19 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.U.setTranslationY(iArr[1]);
                                    this.U.setAlpha(1.0f);
                                    this.U.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new je1(i16, this, sharedInstance), 2L);
                                    i14 = 0;
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
                                    layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                    layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    layoutParams.bottomMargin = dp;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dp;
                                    }
                                    layoutParams.gravity = 80;
                                    this.U.setLayoutParams(layoutParams);
                                    this.U.animate().alpha(1.0f).setDuration(250L).start();
                                    i14 = 0;
                                    this.U.a(new mi1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(i14);
                                org.telegram.ui.Components.voip.m1 m1Var = this.Q;
                                ki1 ki1Var2 = new ki1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.l1[] l1VarArr = m1Var.c;
                                m1Var.d = ki1Var2;
                                org.telegram.ui.Components.voip.j1 j1Var = m1Var.a;
                                j1Var.setVisibility(i14);
                                m1Var.b.setVisibility(i14);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                float f13 = 0.0f;
                                Property property5 = property2;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.es.f);
                                animatorSet.setDuration(250L);
                                int i20 = 0;
                                while (i20 < l1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    l1VarArr[i20].setAlpha(f13);
                                    float[] fArr = new float[i17];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l1VarArr[i20], (Property<org.telegram.ui.Components.voip.l1, Float>) property, fArr);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr2 = new float[i17];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l1VarArr[i20], (Property<org.telegram.ui.Components.voip.l1, Float>) property5, fArr2);
                                    Property property6 = property5;
                                    float[] fArr3 = new float[i17];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l1VarArr[i20], (Property<org.telegram.ui.Components.voip.l1, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.l1 l1Var = l1VarArr[i20];
                                    float[] fArr4 = new float[i17];
                                    fArr4[0] = AndroidUtilities.dp(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(l1Var, (Property<org.telegram.ui.Components.voip.l1, Float>) property4, fArr4);
                                    int i21 = i17;
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i21] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i20 * 16);
                                    animatorSet2.start();
                                    i20++;
                                    i17 = i21;
                                    animatorSet = animatorSet3;
                                    property5 = property6;
                                    f13 = 0.0f;
                                }
                                int i22 = i17;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
                                    duration.setInterpolator(esVar).setListener(new vo(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(esVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new vo(this.O)).setDuration(250L).setInterpolator(esVar).start();
                                }
                                for (org.telegram.ui.Components.z9 z9Var : this.V) {
                                    z9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.es.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new ui1(this)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f;
                                org.telegram.messenger.yh.s(alpha, esVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.s2 s2Var = this.F.d;
                                s2Var.n = true;
                                s2Var.invalidate();
                                org.telegram.ui.Components.voip.r0 r0Var = this.y;
                                r0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = r0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                r0Var.c = animatorSet5;
                                Property property7 = View.ALPHA;
                                float[] fArr5 = new float[i22];
                                fArr5[0] = r0Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property7, fArr5);
                                Property property8 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i22];
                                fArr6[0] = r0Var.getTranslationY();
                                fArr6[1] = -AndroidUtilities.dp(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property8, fArr6);
                                Property property9 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = r0Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i22] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property9, fArr7);
                                Property property10 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = r0Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i22] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property10, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i22] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                r0Var.c.setInterpolator(esVar2);
                                r0Var.c.setDuration(300L);
                                r0Var.c.setStartDelay(250L);
                                r0Var.c.start();
                                C(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                wi1 wi1Var = this.o0;
                                if (wi1Var != null) {
                                    wi1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z23);
                                break;
                            }
                            break;
                        case 13:
                            this.F.b(LocaleController.getString(R.string.VoipWaiting), true, z23);
                            break;
                        case 14:
                            this.F.b(LocaleController.getString(R.string.VoipRequesting), true, z23);
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z23);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(LocaleController.getString(R.string.VoipInCallBranding), false, z23);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z23);
                                this.e0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            z10 = false;
                            z11 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(LocaleController.getString(R.string.VoipRinging), true, z23);
                                break;
                            }
                            break;
                        case 17:
                            this.F.b(LocaleController.getString(R.string.VoipBusy), false, z23);
                            this.e0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z10 = false;
                            z11 = false;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z25 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z20 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z21 = false;
                                this.n0 = z21;
                                if (z21 && !this.U0) {
                                    this.U0 = z20;
                                }
                            }
                        } else {
                            z20 = true;
                        }
                        z21 = z20;
                        this.n0 = z21;
                        if (z21) {
                            this.U0 = z20;
                        }
                    }
                    if (z23) {
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z23) {
                            this.c0.animate().alpha(f12).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f12);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.I0) {
                            i10 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z23) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z12 = this.n0;
                            if (z12 || !this.m0) {
                                this.H0 = false;
                            }
                            z13 = (z12 || !this.H0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            w(z23, z25);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z23) {
                                this.e0.setVisibility(z22 ? 0 : 8);
                            } else {
                                if (z22 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z22 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.e0.animate().setListener(new ri1(this, i11)).alpha(0.0f);
                                    this.e0.setEnabled(z22);
                                    this.e0.setTag(z22 ? 1 : null);
                                    this.u0.setLockOnScreen(this.J0);
                                    z14 = this.p0 != 3 && (this.n0 || this.m0);
                                    this.z0 = z14;
                                    if (!z14 && !this.x0) {
                                        z(true);
                                    }
                                    if (this.x0 || !this.z0 || this.R0 || sharedInstance == null) {
                                        user = user2;
                                    } else {
                                        user = user2;
                                        AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                        this.R0 = true;
                                    }
                                    int i23 = this.p0;
                                    boolean z26 = i23 == 11 && this.x0;
                                    boolean z27 = (!z22 || i23 == 16 || i23 == 11 || i23 == 12 || i23 == 14 || i23 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    boolean z28 = z26;
                                    if (z23) {
                                        if (z28) {
                                            f7 = 80.0f;
                                            this.H.animate().alpha(1.0f).start();
                                        } else {
                                            f7 = 80.0f;
                                            if (this.H.getVisibility() != 0) {
                                                this.H.setVisibility(0);
                                                f10 = 0.0f;
                                                this.H.setAlpha(0.0f);
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            this.H.animate().alpha(f10).start();
                                        }
                                        if (z27) {
                                            this.I.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.I.getVisibility() != 0) {
                                                this.I.setVisibility(0);
                                                f11 = 0.0f;
                                                this.I.setAlpha(0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            this.I.animate().alpha(f11).start();
                                        }
                                        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(f7) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                    } else {
                                        ImageView imageView = this.H;
                                        if (z28) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.H.setAlpha(z28 ? 1.0f : 0.0f);
                                        this.I.setVisibility(z27 ? 0 : 8);
                                        this.I.setAlpha(z27 ? 1.0f : 0.0f);
                                        this.M0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.p0;
                                    if (i12 != 10 && i12 != 11) {
                                        C(z23);
                                    }
                                    if (z11) {
                                        this.F.e(z23);
                                    }
                                    this.F.d(z10, z23);
                                    if (this.y.getVisibility() == 0 && this.C0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.T.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = com.google.android.gms.internal.play_billing.k3.v(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.p0 == 11 && !this.n0 && !this.m0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.n0 || this.m0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z23) {
                                        if (this.C0 && (this.n0 || this.m0)) {
                                            z15 = z25;
                                            this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                            j10 = 250;
                                        } else {
                                            z15 = z25;
                                            j10 = 250;
                                            this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                        }
                                        if (dp2 != this.v0) {
                                            ViewPropertyAnimator animate = this.X.animate();
                                            if (this.p0 != 11) {
                                                j10 = 0;
                                            }
                                            animate.setStartDelay(j10).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                        }
                                    } else {
                                        z15 = z25;
                                        this.X.setTranslationY(dp2);
                                    }
                                    this.v0 = dp2;
                                    boolean z29 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i24 = this.p0;
                                    this.D0 = i24 == 11 && i24 != 17 && ((this.n0 && !z29) || this.m0);
                                    if (sharedInstance != null) {
                                        if (this.n0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.d0.setIsScreencast(sharedInstance.isScreencast());
                                        this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                        if (!this.m1 || (r2Var = this.k1) == null) {
                                            if (z13) {
                                                videoSink = this.b0;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z23) {
                                                    org.telegram.ui.Components.voip.f2 f2Var = this.M0;
                                                    f2Var.f = false;
                                                    if (!f2Var.e && f2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.M0.c("self-muted");
                                                } else {
                                                    this.M0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.n0 || this.m0) && (((i13 = this.p0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var2 = this.M0;
                                                        f2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, f2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var3 = this.M0;
                                                        f2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, f2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.f2 f2Var4 = this.M0;
                                                        f2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, f2Var4.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                }
                                                if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                                    sharedUIParams = sharedInstance.sharedUIParams;
                                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                        sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                        this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + AndroidUtilities.dp(6.0f)));
                                                        this.N0.m(0.0f, this.f.getX() + this.j0.getX() + AndroidUtilities.dp(14.0f));
                                                        this.N0.u();
                                                        z19 = true;
                                                        if (z23) {
                                                            org.telegram.ui.Components.voip.f2 f2Var5 = this.M0;
                                                            if (f2Var5.f) {
                                                                f2Var5.e = z19;
                                                                AndroidUtilities.runOnUIThread(new ig.t0(f2Var5, 28), 700L);
                                                            }
                                                            f2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.M0.getChildCount() != 0) {
                                                    z19 = true;
                                                    this.N0.e(true);
                                                    if (z23) {
                                                    }
                                                }
                                                z19 = true;
                                                if (z23) {
                                                }
                                            } else {
                                                r2Var = this.c0;
                                            }
                                        }
                                        videoSink = r2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z23) {
                                        }
                                        if (sharedInstance.isMicMute()) {
                                        }
                                        if (this.n0) {
                                        }
                                        if (sharedInstance.getRemoteAudioState() != 0) {
                                        }
                                        if (sharedInstance.getRemoteVideoState() != 0) {
                                        }
                                        if (this.M0.getChildCount() == 0) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                        }
                                        z19 = true;
                                        if (z23) {
                                        }
                                    }
                                    childsHight = this.M0.getChildsHight();
                                    s1Var = this.Z;
                                    if (s1Var.getParent() == null && z23) {
                                        s1Var.T = childsHight;
                                    } else {
                                        s1Var.T = childsHight;
                                    }
                                    s1Var2 = this.Y;
                                    if (s1Var2.getParent() == null && z23) {
                                        s1Var2.T = childsHight;
                                    } else {
                                        s1Var2.T = childsHight;
                                    }
                                    this.Y.setUiVisible(this.x0);
                                    this.Z.setUiVisible(this.x0);
                                    if (!this.n0) {
                                        z16 = true;
                                        y(0, z23);
                                    } else if (!this.m0 || this.H0) {
                                        z16 = true;
                                        y(1, z23);
                                    } else {
                                        y(2, z23);
                                        z16 = true;
                                    }
                                    if (!z13 && this.Z.getTag() == null) {
                                        this.Z.setIsActive(z16);
                                        if (this.Z.getVisibility() != 0) {
                                            this.Z.setVisibility(0);
                                            this.Z.setAlpha(0.0f);
                                            this.Z.setScaleX(0.5f);
                                            this.Z.setScaleY(0.5f);
                                        }
                                        this.Z.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.s1 s1Var3 = this.Z;
                                        s1Var3.c0 = true;
                                        s1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).setStartDelay(150L).withEndAction(new ni1(this, 4)).start();
                                        this.Z.setTag(1);
                                    } else if (!z13 && this.Z.getTag() != null) {
                                        this.Z.setIsActive(false);
                                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ri1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                        this.Z.setTag(null);
                                    }
                                    this.Y.a();
                                    this.Z.a();
                                    E();
                                    if (this.p0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i25 = this.v.V;
                                        if (i25 != 2 && i25 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            z17 = true;
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.q0 != -1);
                                            z18 = (!this.n0 || this.m0) ? z17 : false;
                                            this.x.setState(z18);
                                            this.w.setState(z18);
                                            this.r.e(z18);
                                            if (this.m0 && !z15 && this.f0) {
                                                this.f0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z18) {
                                                if (this.i0.getVisibility() != 4) {
                                                    this.i0.setVisibility(4);
                                                    this.h0.setVisibility(4);
                                                }
                                            } else if (this.i0.getVisibility() != 0) {
                                                this.i0.setVisibility(0);
                                                this.h0.setVisibility(0);
                                            }
                                            ni1 ni1Var = this.T0;
                                            AndroidUtilities.cancelRunOnUIThread(ni1Var);
                                            if (this.p0 != 3) {
                                                AndroidUtilities.runOnUIThread(ni1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    z17 = true;
                                    if (this.n0) {
                                    }
                                    this.x.setState(z18);
                                    this.w.setState(z18);
                                    this.r.e(z18);
                                    if (this.m0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z18) {
                                    }
                                    ni1 ni1Var2 = this.T0;
                                    AndroidUtilities.cancelRunOnUIThread(ni1Var2);
                                    if (this.p0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.e0.setEnabled(z22);
                            this.e0.setTag(z22 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            if (this.p0 != 3) {
                            }
                            this.z0 = z14;
                            if (!z14) {
                                z(true);
                            }
                            if (this.x0) {
                            }
                            user = user2;
                            int i232 = this.p0;
                            if (i232 == 11) {
                            }
                            if (!z22) {
                            }
                            boolean z282 = z26;
                            if (z23) {
                            }
                            i12 = this.p0;
                            if (i12 != 10) {
                                C(z23);
                            }
                            if (z11) {
                            }
                            this.F.d(z10, z23);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null) {
                                    dp2 = com.google.android.gms.internal.play_billing.k3.v(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.p0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.n0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z23) {
                            }
                            this.v0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i242 = this.p0;
                            this.D0 = i242 == 11 && i242 != 17 && ((this.n0 && !z29) || this.m0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.M0.getChildsHight();
                            s1Var = this.Z;
                            if (s1Var.getParent() == null) {
                            }
                            s1Var.T = childsHight;
                            s1Var2 = this.Y;
                            if (s1Var2.getParent() == null) {
                            }
                            s1Var2.T = childsHight;
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (!this.n0) {
                            }
                            if (!z13) {
                            }
                            if (!z13) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ri1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            E();
                            if (this.p0 == 3) {
                            }
                            z17 = true;
                            if (this.n0) {
                            }
                            this.x.setState(z18);
                            this.w.setState(z18);
                            this.r.e(z18);
                            if (this.m0) {
                            }
                            if (z18) {
                            }
                            ni1 ni1Var22 = this.T0;
                            AndroidUtilities.cancelRunOnUIThread(ni1Var22);
                            if (this.p0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.n0) {
                    }
                    this.v.setVisibility(4);
                    z12 = this.n0;
                    if (z12) {
                    }
                    this.H0 = false;
                    if (z12) {
                    }
                    w(z23, z25);
                    if (this.y.getTag() != null) {
                    }
                    if (z23) {
                    }
                    i11 = 8;
                    this.e0.setEnabled(z22);
                    this.e0.setTag(z22 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z14;
                    if (!z14) {
                    }
                    if (this.x0) {
                    }
                    user = user2;
                    int i2322 = this.p0;
                    if (i2322 == 11) {
                    }
                    if (!z22) {
                    }
                    boolean z2822 = z26;
                    if (z23) {
                    }
                    i12 = this.p0;
                    if (i12 != 10) {
                    }
                    if (z11) {
                    }
                    this.F.d(z10, z23);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.p0 == 11) {
                    }
                    if (!this.n0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z23) {
                    }
                    this.v0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2422 = this.p0;
                    this.D0 = i2422 == 11 && i2422 != 17 && ((this.n0 && !z29) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    s1Var = this.Z;
                    if (s1Var.getParent() == null) {
                    }
                    s1Var.T = childsHight;
                    s1Var2 = this.Y;
                    if (s1Var2.getParent() == null) {
                    }
                    s1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (!this.n0) {
                    }
                    if (!z13) {
                    }
                    if (!z13) {
                    }
                    this.Y.a();
                    this.Z.a();
                    E();
                    if (this.p0 == 3) {
                    }
                    z17 = true;
                    if (this.n0) {
                    }
                    this.x.setState(z18);
                    this.w.setState(z18);
                    this.r.e(z18);
                    if (this.m0) {
                    }
                    if (z18) {
                    }
                    ni1 ni1Var222 = this.T0;
                    AndroidUtilities.cancelRunOnUIThread(ni1Var222);
                    if (this.p0 != 3) {
                    }
                }
            }
            D(z23);
            if (this.p0 == 5) {
                boolean z30 = this.s0;
                if (!z30 && this.q0 != 5) {
                    this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z23);
                }
                z10 = z30;
                z22 = false;
                z11 = false;
                if (this.o0 == null) {
                }
            } else {
                z11 = true;
                this.s0 = true;
                z22 = false;
                z10 = false;
                if (this.o0 == null) {
                }
            }
        }
        z22 = false;
        z10 = false;
        z11 = false;
        if (this.o0 == null) {
        }
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.c0;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.m1 = true;
        G();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        this.u0.invalidate();
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        vi1 vi1Var = this.u0;
        vi1Var.getClass();
        windowManager.addView(vi1Var, org.telegram.ui.Components.voip.v2.a());
        this.m1 = false;
        G();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.k1;
        if (r2Var != null) {
            r2Var.d.release();
            this.k1 = null;
        }
    }

    @Override // tf.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.k1;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    @Override // tf.a
    public final void d(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.d0.d.release();
            this.c0.d.release();
            this.b0.release();
            n();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
            return;
        }
        if (i10 == NotificationCenter.closeInCallActivity) {
            this.u0.b();
            return;
        }
        if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f0 = booleanValue;
            if (booleanValue) {
                this.y.b(true, true);
            }
        }
    }

    @Override // tf.a
    public final Bitmap e() {
        org.telegram.ui.Components.voip.r2 r2Var = this.c0;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    @Override // tf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // tf.a
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.b, false, true, false, false);
        this.k1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.k1;
        r2Var2.a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xi1(this));
        View view = this.k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.k1;
    }

    public final ValueAnimator j(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final float f10;
        final boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        this.Y.animate().cancel();
        float f15 = org.telegram.ui.Components.voip.k2.k().d.x + org.telegram.ui.Components.voip.k2.k().E;
        float f16 = org.telegram.ui.Components.voip.k2.k().d.y + org.telegram.ui.Components.voip.k2.k().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.k2.V.getClass();
        final float measuredWidth = f15 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f16 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f17 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (!this.n0 || measuredWidth2 == 0) {
                c10 = 0;
                measuredHeight = 1.0f;
                f13 = 1.0f;
                z11 = false;
                f14 = 0.0f;
            } else {
                f14 = (this.u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f13 = (((org.telegram.ui.Components.voip.k2.k().f * 0.25f) + (f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f14)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.k2.k().h * 0.25f) + (f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f14)) / 2.0f))) - ((org.telegram.ui.Components.voip.k2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f18 = f14;
            f7 = f13;
            f10 = f18;
        } else {
            c10 = 0;
            float measuredWidth3 = f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            f10 = 0.25f;
            z11 = true;
        }
        final float f19 = measuredHeight;
        float dp = this.m0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.k2.V.getClass();
            f11 = 1.0f;
            f17 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f20 = f11;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f19);
                this.Y.setCornerRadius(dp2);
                this.Y.setAlpha(f17);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth);
            this.c0.setTranslationY(measuredHeight2);
            f12 = 0.25f;
            this.c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f20) / 0.25f);
        } else {
            f12 = 0.25f;
        }
        float f21 = z10 ? f20 : 0.0f;
        float f22 = z10 ? 0.0f : f20;
        float[] fArr = new float[2];
        fArr[c10] = f21;
        fArr[1] = f22;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : f20;
        F();
        final float f23 = dp;
        final float f24 = f12;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.qi1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f25 = 1.0f - floatValue;
                dj1 dj1Var = dj1.this;
                dj1Var.F0 = f25;
                dj1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    dj1Var.Y.setScaleX(f26);
                    dj1Var.Y.setScaleY(f26);
                    dj1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f25));
                    dj1Var.Y.setTranslationY((f19 * floatValue) + (y3 * f25));
                    dj1Var.Y.setCornerRadius((dp2 * floatValue) + (f23 * f25));
                    dj1Var.Y.setAlpha((f17 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                dj1Var.c0.setScaleX(f27);
                dj1Var.c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                dj1Var.c0.setTranslationX(f29);
                dj1Var.c0.setTranslationY(f30);
                dj1Var.c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f27);
                if (!dj1Var.Y.P) {
                    dj1Var.d0.d(floatValue, false);
                }
                dj1Var.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        rf.d dVar = this.g0;
        if (dVar != null) {
            dVar.c();
            this.g0 = null;
        }
        ug.m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.y2 y2Var = this.w;
            int i10 = 1;
            if (y2Var.K && z10 != y2Var.E) {
                y2Var.E = z10;
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
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x2(y2Var, i10));
                y2Var.c.setInterpolator(org.telegram.ui.Components.es.f);
                y2Var.c.setDuration(200L);
                y2Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.es.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.es.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
                org.telegram.messenger.yh.s(translationY, esVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ri1(this, 3)).setInterpolator(esVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.es.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f;
                duration.setInterpolator(esVar2).setListener(new vo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(esVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ri1(this, 4)).setDuration(250L).setInterpolator(esVar2).start();
            }
            this.q0 = this.p0;
            G();
        }
    }

    public final void m() {
        this.u0.b();
    }

    public final void n() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new si1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ti1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (this.G0 || this.E0) {
            return;
        }
        wi1 wi1Var = this.o0;
        if (wi1Var != null) {
            wi1Var.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Y.setRelativePosition(this.Z);
            this.a0 = false;
            this.q0 = this.p0;
            G();
            return;
        }
        if (this.C0) {
            l(false);
            return;
        }
        if (this.R.getVisibility() != 8) {
            return;
        }
        if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.u0.b();
            return;
        }
        if (uf.b.a(this.b) <= 0) {
            org.telegram.ui.Components.g5.A(this.b, new ki1(this, 0), true).o();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            dj1 dj1Var = n1;
            org.telegram.ui.Components.voip.k2.l(dj1Var.b, dj1Var.a, dj1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.k2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
        duration.setInterpolator(esVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(esVar).start();
        org.telegram.ui.Components.voip.k2.U = true;
        this.E0 = true;
        ValueAnimator j10 = j(false);
        this.L0.lock();
        j10.addListener(new ri1(this, 1));
        j10.setDuration(350L);
        j10.setInterpolator(esVar);
        j10.start();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        this.q0 = this.p0;
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        this.q0 = this.p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            rf.d dVar = this.g0;
            if (dVar != null) {
                dVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && uf.b.a(this.b) == 1) {
            rf.c cVar = new rf.c(this.b, n1);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.r2 r2Var = this.c0;
            cVar.j = r2Var.d;
            cVar.k = r2Var.getPlaceholderView();
            this.g0 = cVar.a();
        }
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.b3 b3Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (b3Var = this.v) == null) {
            return;
        }
        int i11 = b3Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            AndroidUtilities.runOnUIThread(new li1(this, i10, 0), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.p0;
        if (i11 != i10) {
            this.q0 = i11;
            this.p0 = i10;
            if (this.u0 != null) {
                G();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.q0 = this.p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.e0;
            ValueAnimator valueAnimator = eVar.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.e0;
        ValueAnimator valueAnimator2 = eVar2.b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.b0 = null;
            eVar2.U.stop();
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
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pi1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                dj1 dj1Var = dj1.this;
                dj1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                dj1Var.e0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                dj1Var.e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ql0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ni1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        if (!this.n0) {
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
            j3Var.setOnBtnClickedListener(new f7(this, voIPService, j3Var, 23));
        }
    }

    public final void s(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        j3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.s1 s1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = s1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.K, isMicMute ? 1.0f : 0.0f);
            s1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(s1Var.g0);
            s1Var.f0.setDuration(150L);
            s1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = s1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            s1Var.K = isMicMute ? 1.0f : 0.0f;
            s1Var.invalidate();
        }
        j3Var.setOnBtnClickedListener(new ki1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            j3Var.d(4, false, false);
            i11 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                j3Var.d(5, false, false);
                i10 = 1;
                j3Var.setEnabled(true);
                j3Var.setOnBtnClickedListener(new ia(this, i10, j3Var, voIPService, 8));
            }
            j3Var.d(5, true, false);
        }
        i10 = i11;
        j3Var.setEnabled(true);
        j3Var.setOnBtnClickedListener(new ia(this, i10, j3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.j3 j3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            j3Var.d(3, true, false);
            j3Var.setOnClickListener(null);
            j3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            j3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            j3Var.d(3, false, z10);
        } else {
            j3Var.d(3, false, z10);
        }
        j3Var.setOnBtnClickedListener(new ki1(this, 6));
        j3Var.setEnabled(true);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12 = (this.n0 || this.m0) ? false : true;
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
            if (this.C0) {
                if (z11) {
                    this.y.setAlpha(0.0f);
                    this.y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.y.setScaleX(0.1f);
                    this.y.setScaleY(0.1f);
                }
            } else if (z11) {
                this.y.setAlpha(0.0f);
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.es.f).setListener(new ri1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        w3Var.R = LocaleController.getString(R.string.VoipFailed);
        w3Var.T = charSequence;
        w3Var.l0 = LocaleController.getString(R.string.OK);
        w3Var.m0 = null;
        w3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) w3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.q7));
            }
        }
        w3Var.setCanceledOnTouchOutside(true);
        w3Var.setOnDismissListener(new v5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        if (i10 != 0) {
            boolean z11 = (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() == 0) ? false : z10;
            if (!z10) {
                this.Y.setVisibility(0);
            } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                if (this.Y.getVisibility() == 8) {
                    this.Y.setAlpha(0.0f);
                    this.Y.setScaleX(0.7f);
                    this.Y.setScaleY(0.7f);
                    this.Y.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.A0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.A0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.s1 s1Var = this.Y;
                if (s1Var.y < 0.0f) {
                    s1Var.d(1.0f, 1.0f);
                    this.a0 = true;
                }
            }
            this.Y.c(i10 == 2, z11);
            this.a0 = i10 != 2;
        } else if (!z10) {
            this.Y.setVisibility(8);
        } else if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.s1 s1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(s1Var2, (Property<org.telegram.ui.Components.voip.s1, Float>) View.ALPHA, s1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.s1 s1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s1Var3, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_X, s1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.s1 s1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(s1Var4, (Property<org.telegram.ui.Components.voip.s1, Float>) View.SCALE_Y, s1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new ri1(this, 6));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.es.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f21 f21Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f;
                translationY.setInterpolator(esVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(esVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(esVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(f21Var);
                this.P0.setDuration(150L).setInterpolator(esVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.es esVar2 = org.telegram.ui.Components.es.f;
            duration.setInterpolator(esVar2).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar2).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar2).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(esVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(esVar2).start();
            this.j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(esVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(esVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(f21Var);
            this.P0.setDuration(150L).setInterpolator(esVar2);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.x0 = z10;
        vi1 vi1Var = this.u0;
        if (z10) {
            vi1Var.setSystemUiVisibility(vi1Var.getSystemUiVisibility() & (-5));
        } else {
            vi1Var.setSystemUiVisibility(vi1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.es.f).start();
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
