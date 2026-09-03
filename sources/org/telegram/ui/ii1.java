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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ii1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, ef.a {
    public static ii1 k1;
    public boolean A0;
    public TextView B;
    public boolean B0;
    public org.telegram.ui.Components.voip.q2 C;
    public float C0;
    public hi1 D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public ImageView F;
    public boolean F0;
    public int G;
    public boolean G0;
    public org.telegram.ui.Components.ge H;
    public long H0;
    public int I;
    public hg.v2 J;
    public org.telegram.ui.Components.voip.i2 J0;
    public ob1 K;
    public org.telegram.ui.Components.voip.e3 K0;
    public FrameLayout L;
    public org.telegram.ui.Components.voip.e3 L0;
    public org.telegram.ui.Components.voip.p0 M;
    public ValueAnimator M0;
    public org.telegram.ui.Components.voip.m1 N;
    public eg.i0 O;
    public boolean O0;
    public TextView P;
    public pk Q;
    public org.telegram.ui.Components.voip.k R;
    public boolean R0;
    public float S0;
    public float T0;
    public ei1 U;
    public float U0;
    public org.telegram.ui.Components.voip.t1 V;
    public float V0;
    public org.telegram.ui.Components.voip.t1 W;
    public float W0;
    public boolean X;
    public boolean X0;
    public TextureViewRenderer Y;
    public float Y0;
    public org.telegram.ui.Components.voip.t2 Z;
    public float Z0;
    public final int a;
    public org.telegram.ui.Components.voip.t2 a0;
    public int a1;
    public Activity b;
    public org.telegram.ui.Components.voip.e b0;
    public int b1;
    public final TLRPC.User c;
    public boolean c0;
    public final TLRPC.User d;
    public cf.f d0;
    public boolean d1;
    public org.telegram.ui.Components.voip.l3 e;
    public View e0;
    public boolean e1;
    public org.telegram.ui.Components.voip.l3 f;
    public View f0;
    public ValueAnimator f1;
    public org.telegram.ui.Components.voip.p1 g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.l3 h;
    public org.telegram.ui.Components.voip.t2 h1;
    public c2.p i1;
    public boolean j0;
    public boolean j1;
    public boolean k0;
    public bi1 l0;
    public int m0;
    public fi1 n;
    public int n0;
    public WindowInsets o0;
    public boolean p0;
    public float q0;
    public ai1 r0;
    public di1 s;
    public int s0;
    public AccessibilityManager t0;
    public org.telegram.ui.Components.voip.d3 v;
    public org.telegram.ui.Components.voip.a3 w;
    public boolean w0;
    public org.telegram.ui.Components.voip.f3 x;
    public AnimatorSet x0;
    public org.telegram.ui.Components.voip.r0 y;
    public boolean y0;
    public boolean z0;
    public final org.telegram.ui.Components.voip.o1 r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.p9[] S = new org.telegram.ui.Components.p9[4];
    public final Drawable[] T = new Drawable[4];
    public final Paint h0 = new Paint();
    public final Paint i0 = new Paint();
    public boolean u0 = true;
    public float v0 = 1.0f;
    public final AnimationNotificationsLocker I0 = new AnimationNotificationsLocker();
    public final n11 N0 = new n11(this, 20);
    public final sh1 P0 = new sh1(this, 12);
    public final sh1 Q0 = new sh1(this, 13);
    public float c1 = 1.0f;

    public ii1(int i10) {
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
        this.n0 = -1;
        this.m0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static /* synthetic */ void i(ii1 ii1Var) {
        AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
        ii1Var.O0 = false;
        if (Build.VERSION.SDK_INT < 23 || ii1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            ii1Var.C();
        } else {
            ii1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(ii1 ii1Var) {
        ii1 ii1Var2;
        int i10 = 0;
        if (ii1Var.d1) {
            ii1Var.d1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ii1Var.f1 = ofFloat;
            ii1Var2 = ii1Var;
            ofFloat.addUpdateListener(new gg.c(ii1Var2, ii1Var.c1, ii1Var.V0, ii1Var.W0, 2));
            ii1Var2.f1.addListener(new wh1(ii1Var2, i10));
            ii1Var2.f1.setDuration(350L);
            ii1Var2.f1.setInterpolator(org.telegram.ui.Components.pr.f);
            ii1Var2.f1.start();
        } else {
            ii1Var2 = ii1Var;
        }
        ii1Var2.e1 = false;
        ii1Var2.X0 = false;
    }

    public static void q(int i10, int[] iArr) {
        ii1 ii1Var = k1;
        if (ii1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.r0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    ii1Var.r(new sj0(7));
                } else if (!ii1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(ii1Var.b, new sh1(ii1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ii1Var.r0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    ii1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        ii1 ii1Var = k1;
        if (ii1Var != null && ii1Var.r0.getParent() == null) {
            ii1 ii1Var2 = k1;
            if (ii1Var2 != null) {
                ii1Var2.Z.d.release();
                k1.a0.d.release();
                k1.Y.release();
                ai1 ai1Var = k1.r0;
                if (ai1Var != null) {
                    ai1Var.d();
                }
                k1.l();
            }
            k1 = null;
        }
        if (k1 != null || activity.isFinishing()) {
            return;
        }
        boolean z4 = org.telegram.ui.Components.voip.n2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        ii1 ii1Var3 = new ii1(i10);
        ii1Var3.b = activity;
        k1 = ii1Var3;
        ai1 ai1Var2 = new ai1(activity, !z4, ii1Var3);
        k1.G0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        k1.getClass();
        ai1Var2.setLockOnScreen(k1.G0);
        ii1Var3.r0 = ai1Var2;
        qh1 qh1Var = new qh1(ii1Var3, 4);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(ai1Var2, qh1Var);
        ((WindowManager) activity.getSystemService("window")).addView(ai1Var2, org.telegram.ui.Components.voip.x2.a());
        ii1Var3.q0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        ii1Var3.t0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        di1 di1Var = new di1(ii1Var3, activity);
        di1Var.setClipToPadding(false);
        di1Var.setClipChildren(false);
        di1Var.setBackgroundColor(-16777216);
        ii1Var3.G();
        ii1Var3.s = di1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z10 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.o1 o1Var = ii1Var3.r;
        ii1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z10, o1Var);
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
        ii1Var3.Z = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        t2Var.d.setScalingType(scalingType);
        ii1Var3.Z.d.setEnableHardwareScaler(true);
        ii1Var3.Z.d.setRotateTextureWithScreen(true);
        ii1Var3.Z.U = 1;
        di1Var.addView(ii1Var3.v, k7.c6.c(-1.0f, -1));
        TLRPC.User user = ii1Var3.d;
        org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, o1Var);
        ii1Var3.w = a3Var;
        di1Var.addView(a3Var, k7.c6.c(-1.0f, -1));
        org.telegram.ui.Components.voip.f3 f3Var = new org.telegram.ui.Components.voip.f3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.k6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                f3Var.a = new org.telegram.ui.Components.bw0(0);
            }
        }
        ii1Var3.x = f3Var;
        di1Var.addView(f3Var, k7.c6.c(220.0f, -1));
        di1Var.addView(ii1Var3.Z);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.o9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Cells.f1.t(0.5f, 1), new rc1(ii1Var3, 1), 0L);
        org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
        ii1Var3.V = t1Var;
        t1Var.setDelegate(new qh1(ii1Var3, 3));
        ii1Var3.V.d(1.0f, 1.0f);
        ii1Var3.X = true;
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
        ii1Var3.a0 = t2Var2;
        t2Var2.d.setIsCamera(true);
        ii1Var3.a0.d.setUseCameraRotation(true);
        ii1Var3.V.setOnTapListener(new th1(ii1Var3, 1));
        ii1Var3.a0.d.setMirror(true);
        ii1Var3.V.addView(ii1Var3.a0);
        org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
        ii1Var3.W = t1Var2;
        t1Var2.P = true;
        t1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        ii1Var3.Y = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        ii1Var3.Y.setIsCamera(false);
        ii1Var3.Y.setFpsReduction(30.0f);
        ii1Var3.Y.setScalingType(scalingType);
        ii1Var3.W.addView(ii1Var3.Y, k7.c6.e(-1, -2, 17));
        ii1Var3.W.setOnTapListener(new th1(ii1Var3, i11));
        ii1Var3.W.setVisibility(8);
        di1Var.addView(ii1Var3.V, k7.c6.c(-2.0f, -2));
        di1Var.addView(ii1Var3.W);
        View view = new View(activity);
        ii1Var3.e0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        di1Var.addView(ii1Var3.e0, k7.c6.e(-1, 160, 80));
        View view2 = new View(activity);
        ii1Var3.f0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        di1Var.addView(ii1Var3.f0, k7.c6.e(-1, 160, 48));
        ob1 ob1Var = new ob1(ii1Var3, activity, 17);
        ii1Var3.K = ob1Var;
        ob1Var.setOrientation(0);
        ii1Var3.K.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        ii1Var3.K.setClipToPadding(false);
        ii1Var3.K.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        ii1Var3.K.setOnClickListener(new th1(ii1Var3, 3));
        ii1Var3.M = new org.telegram.ui.Components.voip.p0(activity, o1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        ii1Var3.L = frameLayout;
        frameLayout.addView(ii1Var3.M, k7.c6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        ii1Var3.L.setVisibility(8);
        ii1Var3.L.setOnClickListener(new th1(ii1Var3, 4));
        eg.i0 i0Var = new eg.i0(activity, o1Var);
        ii1Var3.O = i0Var;
        i0Var.setOrientation(1);
        TextView textView = new TextView(activity);
        ii1Var3.P = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        ii1Var3.P.setTextSize(1, 15.0f);
        ii1Var3.P.setTypeface(AndroidUtilities.bold());
        ii1Var3.P.setTextColor(-1);
        ii1Var3.P.setGravity(17);
        pk pkVar = new pk(ii1Var3, activity, 5);
        ii1Var3.Q = pkVar;
        pkVar.setTextSize(1, 15.0f);
        ii1Var3.Q.setTextColor(-1);
        ii1Var3.Q.setGravity(17);
        ii1Var3.Q.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ii1Var3.Q.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        ii1Var3.O.setVisibility(8);
        ii1Var3.O.addView(ii1Var3.P);
        ii1Var3.O.addView(ii1Var3.Q, k7.c6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        ii1Var3.O.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
            org.telegram.ui.Components.p9[] p9VarArr = ii1Var3.S;
            p9VarArr[i15] = p9Var;
            p9VarArr[i15].getImageReceiver().setAspectFit(true);
            ii1Var3.K.addView(p9VarArr[i15], k7.c6.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        ei1 ei1Var = new ei1(ii1Var3, activity);
        ii1Var3.U = ei1Var;
        ei1Var.setOrientation(1);
        ii1Var3.U.setFocusable(true);
        ii1Var3.U.setFocusableInTouchMode(true);
        ii1Var3.y = new org.telegram.ui.Components.voip.r0(activity);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.r(user);
        org.telegram.ui.Components.voip.r0 r0Var = ii1Var3.y;
        int i16 = ii1Var3.a;
        r0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, z8Var, user);
        ii1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        ii1Var3.B = textView2;
        textView2.setTextSize(1, 28.0f);
        ii1Var3.B.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ii1Var3.B.getPaint().getFontMetricsInt(), false));
        ii1Var3.B.setMaxLines(2);
        ii1Var3.B.setEllipsize(TextUtils.TruncateAt.END);
        ii1Var3.B.setTextColor(-1);
        ii1Var3.B.setGravity(1);
        ii1Var3.B.setImportantForAccessibility(2);
        ii1Var3.U.addView(ii1Var3.B, k7.c6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.q2 q2Var = new org.telegram.ui.Components.voip.q2(activity);
        q2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            q2Var.a[i17] = new TextView(activity);
            q2Var.a[i17].setTextSize(1, 15.0f);
            q2Var.a[i17].setTextColor(-1);
            q2Var.a[i17].setGravity(1);
            q2Var.addView(q2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        q2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(q2Var, activity, o1Var);
        o2Var.setTextSize(1, 15.0f);
        o2Var.setTextColor(-1);
        o2Var.setGravity(1);
        o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(o2Var, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        q2Var.addView(frameLayout2, k7.c6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        q2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        q2Var.addView(textView3, k7.c6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new org.telegram.ui.Components.a0(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
        q2Var.d = u2Var;
        q2Var.addView(u2Var, k7.c6.c(-2.0f, -1));
        ii1Var3.C = q2Var;
        WeakHashMap weakHashMap2 = r0.j0.a;
        q2Var.setImportantForAccessibility(4);
        ii1Var3.U.addView(ii1Var3.C, k7.c6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            hi1 hi1Var = new hi1(activity);
            ii1Var3.D = hi1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.c9 c9Var = hi1Var.b;
                c9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    c9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                c9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    hi1Var.setVisibility(8);
                } else {
                    hi1Var.c = new org.telegram.ui.Components.k01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    hi1Var.setVisibility(0);
                    hi1Var.invalidate();
                }
            } else {
                hi1Var.setVisibility(8);
            }
            ii1Var3.U.addView(ii1Var3.D, k7.c6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        ii1Var3.U.setClipChildren(false);
        ii1Var3.U.setClipToPadding(false);
        ii1Var3.U.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        ii1Var3.R = new org.telegram.ui.Components.voip.k(activity);
        ii1Var3.N = new org.telegram.ui.Components.voip.m1(activity, o1Var);
        ii1Var3.R.setAlpha(0.0f);
        ii1Var3.N.setVisibility(8);
        di1Var.addView(ii1Var3.y, k7.c6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.U, k7.c6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.L, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.O, k7.c6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.K, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.R, k7.c6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        di1Var.addView(ii1Var3.N, k7.c6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        ii1Var3.g0 = new org.telegram.ui.Components.voip.p1(activity);
        ii1Var3.e = new org.telegram.ui.Components.voip.l3(activity, o1Var);
        ii1Var3.f = new org.telegram.ui.Components.voip.l3(activity, o1Var);
        ii1Var3.h = new org.telegram.ui.Components.voip.l3(activity, o1Var);
        ii1Var3.n = new fi1(activity, 52.0f);
        ii1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        ii1Var3.e.setScaleX(0.0f);
        ii1Var3.e.setScaleY(0.0f);
        ii1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ii1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        ii1Var3.f.setScaleX(0.0f);
        ii1Var3.f.setScaleY(0.0f);
        ii1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ii1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        ii1Var3.h.setScaleX(0.0f);
        ii1Var3.h.setScaleY(0.0f);
        ii1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ii1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        ii1Var3.n.setScaleX(0.0f);
        ii1Var3.n.setScaleY(0.0f);
        ii1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ii1Var3.g0.addView(ii1Var3.e);
        ii1Var3.g0.addView(ii1Var3.f);
        ii1Var3.g0.addView(ii1Var3.h);
        ii1Var3.g0.addView(ii1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        ii1Var3.b0 = eVar;
        eVar.setListener(new gi1(ii1Var3));
        ii1Var3.b0.setScaleX(1.15f);
        ii1Var3.b0.setScaleY(1.15f);
        di1Var.addView(ii1Var3.g0, k7.c6.e(-1, -2, 80));
        float f10 = AndroidUtilities.isTablet() ? 100 : 27;
        di1Var.addView(ii1Var3.b0, k7.c6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(activity);
        ii1Var3.F = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
        ii1Var3.F.setImageResource(R.drawable.msg_addcontact);
        ii1Var3.F.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        di1Var.addView(ii1Var3.F, k7.c6.e(56, 56, 53));
        k7.e6.a(ii1Var3.F);
        ImageView imageView2 = new ImageView(activity);
        ii1Var3.E = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
        ii1Var3.E.setImageResource(R.drawable.msg_call_minimize_shadow);
        ii1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ii1Var3.E.setContentDescription(LocaleController.getString(R.string.Back));
        di1Var.addView(ii1Var3.E, k7.c6.e(56, 56, 51));
        k7.e6.a(ii1Var3.E);
        org.telegram.ui.Components.ge geVar = new org.telegram.ui.Components.ge(activity, 4);
        ii1Var3.H = geVar;
        geVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        ii1Var3.H.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(-1, 76), 1, -1));
        ii1Var3.H.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        di1Var.addView(ii1Var3.H, k7.c6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        ii1Var3.H.setAlpha(0.0f);
        ii1Var3.H.setOnClickListener(new th1(ii1Var3, 5));
        int i21 = 6;
        ii1Var3.E.setOnClickListener(new th1(ii1Var3, i21));
        ii1Var3.F.setOnClickListener(new hb0(25, ii1Var3, activity));
        if (ii1Var3.r0.b) {
            ii1Var3.E.setVisibility(8);
            ii1Var3.F.setVisibility(8);
        }
        org.telegram.ui.Components.voip.i2 i2Var = new org.telegram.ui.Components.voip.i2(activity);
        i2Var.a = new HashMap();
        i2Var.b = new ArrayList();
        i2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        i2Var.r = textPaint;
        i2Var.setOrientation(1);
        i2Var.n = o1Var;
        TransitionSet transitionSet = new TransitionSet();
        i2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new fg.j0(4).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        ii1Var3.J0 = i2Var;
        i2Var.setGravity(80);
        ii1Var3.J0.setOnViewsUpdated(new sh1(ii1Var3, 5));
        di1Var.addView(ii1Var3.J0, k7.c6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, o1Var, true);
        e3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e3Var.H = alignment;
        e3Var.d = -1L;
        e3Var.i0 = new sh1(ii1Var3, i21);
        e3Var.Q = true;
        e3Var.h = AndroidUtilities.dp(320.0f);
        e3Var.e = true;
        e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        e3Var.q(8.0f);
        ii1Var3.K0 = e3Var;
        e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        di1Var.addView(ii1Var3.K0, k7.c6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, o1Var, false);
        e3Var2.p(true);
        e3Var2.H = alignment;
        e3Var2.d = 4000L;
        e3Var2.Q = true;
        e3Var2.h = AndroidUtilities.dp(320.0f);
        e3Var2.e = true;
        e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        e3Var2.q(8.0f);
        ii1Var3.L0 = e3Var2;
        e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        di1Var.addView(ii1Var3.L0, k7.c6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ii1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!ii1Var3.R0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                ii1Var3.R0 = phoneCall != null && phoneCall.video;
            }
            ii1Var3.o();
        }
        ai1Var2.addView(di1Var);
        if (z4) {
            ii1Var3.C0 = 0.0f;
            ii1Var3.F0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                ii1Var3.Z.setStub(org.telegram.ui.Components.voip.n2.k().r);
                ii1Var3.a0.setStub(org.telegram.ui.Components.voip.n2.k().n);
            }
            ii1Var3.r0.setAlpha(0.0f);
            ii1Var3.H();
            ii1Var3.B0 = true;
            org.telegram.ui.Components.voip.n2.Q = true;
            if (org.telegram.ui.Components.voip.n2.S != null) {
                org.telegram.ui.Components.voip.n2.R.getClass();
                throw null;
            }
            ii1Var3.I0.lock();
            AndroidUtilities.runOnUIThread(new sh1(ii1Var3, 11), 32L);
        } else {
            ii1Var3.C0 = 1.0f;
            ii1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && ff.d.a(activity) == 1) {
            ii1 ii1Var4 = k1;
            cf.e eVar2 = new cf.e(activity, ii1Var4);
            eVar2.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.t2 t2Var3 = ii1Var4.Z;
            eVar2.j = t2Var3.d;
            eVar2.k = t2Var3.getPlaceholderView();
            ii1Var4.d0 = eVar2.a();
        }
    }

    public final void A(boolean z4) {
        int i10;
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n11 n11Var = this.N0;
        if (z4 || !this.u0) {
            if (z4 && !this.u0) {
                this.K0.e(true);
                this.L0.e(true);
                ViewPropertyAnimator translationY = this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                translationY.setInterpolator(prVar).start();
                this.C.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(prVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.g0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
                this.e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                this.f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v0, 1.0f);
                this.M0 = ofFloat;
                ofFloat.addUpdateListener(n11Var);
                this.M0.setDuration(150L).setInterpolator(prVar);
                this.M0.start();
                this.g0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
            duration.setInterpolator(prVar2).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.F.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar2).start();
            this.C.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(prVar2).start();
            this.g0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(prVar2).start();
            this.e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar2).start();
            this.f0.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.v0, 0.0f);
            this.M0 = ofFloat2;
            ofFloat2.addUpdateListener(n11Var);
            this.M0.setDuration(150L).setInterpolator(prVar2);
            this.M0.start();
            AndroidUtilities.cancelRunOnUIThread(this.P0);
            this.O0 = false;
            this.g0.setEnabled(false);
            this.L0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.u0 = z4;
        ai1 ai1Var = this.r0;
        if (z4) {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() & (-5));
        } else {
            ai1Var.setSystemUiVisibility(ai1Var.getSystemUiVisibility() | 4);
        }
        this.J0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.u0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.pr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            sh1 sh1Var = this.P0;
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            this.O0 = false;
            if (this.w0 && this.u0) {
                AndroidUtilities.runOnUIThread(sh1Var, 3000L);
                this.O0 = true;
            }
        }
    }

    public final void C() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.t0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.k0 ? LocaleController.getString(R.string.AccDescrVoipCamOn) : LocaleController.getString(R.string.AccDescrVoipCamOff));
            }
            if (this.k0) {
                this.a0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.n0 = this.m0;
                H();
                return;
            }
            if (this.l0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.r0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                bi1 bi1Var = new bi1(this, this.s.getContext(), r0[0], r0[1]);
                this.l0 = bi1Var;
                WindowInsets windowInsets = this.o0;
                if (windowInsets != null) {
                    bi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.l0);
            }
        }
    }

    public final void D(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (z4) {
            TransitionSet transitionSet = new TransitionSet();
            Transition duration = new fg.j0(5).setDuration(250L);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
            transitionSet.addTransition(duration.setInterpolator(prVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(prVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
            TransitionManager.beginDelayedTransition(this.g0, transitionSet);
        }
        int i10 = this.m0;
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
                if (sharedInstance.isScreencast() || !(this.k0 || this.j0)) {
                    u(this.e, sharedInstance);
                    this.H.animate().alpha(0.0f).start();
                } else {
                    s(this.e, sharedInstance);
                    if (this.u0) {
                        this.H.animate().alpha(1.0f).start();
                    }
                }
                v(this.f, sharedInstance, false);
                t(this.h, sharedInstance, z4);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
            }
            this.n.setVisibility(8);
        } else {
            if (k1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.k0 || this.j0)) {
                u(this.e, sharedInstance);
                this.H.setTag(null);
                this.H.animate().alpha(0.0f).start();
            } else {
                s(this.e, sharedInstance);
                if (this.u0) {
                    this.H.setTag(1);
                    this.H.animate().alpha(1.0f).start();
                }
            }
            v(this.f, sharedInstance, false);
            t(this.h, sharedInstance, z4);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z4);
            this.n.setOnClickListener(new th1(this, 0));
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
            this.n.C = i11;
        }
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.p9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.p9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.p9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.l5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.p9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z4) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z10;
        oh.z2 z2Var;
        String[] strArr;
        TLRPC.Document document;
        int i10;
        ?? r52;
        if (this.y0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z11 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e6) {
            FileLog.e((Throwable) e6, false);
            bArr = null;
        }
        if (bArr == null) {
            return;
        }
        String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.computeSHA256(bArr, 0, bArr.length));
        int i11 = 0;
        while (true) {
            r62 = this.S;
            drawableArr = this.T;
            if (i11 >= 4) {
                break;
            }
            Emoji.preloadEmoji(emojifyForCall[i11]);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(emojifyForCall[i11]);
            if (emojiDrawable != null) {
                emojiDrawable.setBounds(z11 ? 1 : 0, z11 ? 1 : 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                emojiDrawable.preload();
                int[] iArr = new int[1];
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(28.0f));
                CharSequence replaceEmoji = Emoji.replaceEmoji(emojifyForCall[i11], textPaint.getFontMetricsInt(), z11, iArr);
                boolean z12 = replaceEmoji instanceof Spannable;
                int i12 = this.a;
                if (z12) {
                    Spannable spannable = (Spannable) replaceEmoji;
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), Emoji.EmojiSpan.class);
                    org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannable.getSpans(z11 ? 1 : 0, spannable.length(), org.telegram.ui.Components.u5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z11 ? 1 : 0] - emojiSpanArr.length) - (u5VarArr == null ? 0 : u5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = 0;
                            ?? r32 = z11;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new w3(this, 23));
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
                        if ((drawable instanceof org.telegram.ui.Components.l5) && ((org.telegram.ui.Components.l5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.l5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(21, i12, document);
                            drawableArr[i11] = l5Var;
                            r52 = l5Var;
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
            z11 = false;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            Drawable drawable2 = drawableArr[i16];
            if (drawable2 instanceof Emoji.EmojiDrawable) {
                z10 = ((Emoji.EmojiDrawable) drawable2).isLoaded();
            } else {
                if ((drawable2 instanceof org.telegram.ui.Components.l5) && (z2Var = ((org.telegram.ui.Components.l5) drawable2).k) != null) {
                    Drawable thumb = z2Var.getThumb();
                    if (!(thumb instanceof Emoji.EmojiDrawable) || ((Emoji.EmojiDrawable) thumb).isLoaded()) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                i15++;
            }
        }
        if (i15 == 4) {
            this.y0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r62[i17].getVisibility() != 0) {
                    r62[i17].setVisibility(0);
                    if (z4) {
                        r62[i17].setAlpha(0.0f);
                        r62[i17].setScaleX(0.0f);
                        r62[i17].setScaleY(0.0f);
                        b.p(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.pr.k, 250L);
                    }
                }
            }
            this.L0.postDelayed(new sh1(this, 9), 1000L);
        }
    }

    public final void F() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i10 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.G != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.H, i10);
        } else {
            this.H.setImageResource(i10);
        }
        this.G = i10;
    }

    public final void G() {
        this.h0.setColor(i0.a.k(-16777216, (int) (this.v0 * 102.0f * this.C0)));
        this.i0.setColor(i0.a.k(-16777216, (int) (127.5f * this.C0)));
        di1 di1Var = this.s;
        if (di1Var != null) {
            di1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0bc6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0bd6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d34 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        Integer num;
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int childsHight;
        org.telegram.ui.Components.voip.t1 t1Var;
        org.telegram.ui.Components.voip.t1 t1Var2;
        boolean z14;
        boolean z15;
        org.telegram.ui.Components.voip.t2 t2Var;
        VideoSink videoSink;
        int i13;
        boolean z16;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f10;
        float f11;
        TL_phone.PhoneCall phoneCall2;
        float f12;
        boolean z17;
        boolean z18;
        TextView textView;
        int i14;
        boolean z19 = true;
        z19 = true;
        if (this.D0 || this.B0) {
            return;
        }
        boolean z20 = this.n0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.m0;
        TLRPC.User user = this.d;
        if (i15 == 1 || i15 == 2) {
            num = 1;
            this.C.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    num = 1;
                    this.C.b(LocaleController.getString(R.string.VoipFailed), false, z20);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new sh1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.R0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            y3Var.O = LocaleController.getString(R.string.VoipFailed);
                            y3Var.Q = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            qh1 qh1Var = new qh1(this, 2);
                            y3Var.k0 = string;
                            y3Var.l0 = qh1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            vl0 vl0Var = new vl0(27, this, zArr);
                            y3Var.i0 = string2;
                            y3Var.j0 = vl0Var;
                            y3Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) y3Var.d(-(i16 + 1))) != null) {
                                    textView.setTextColor(y3Var.e(org.telegram.ui.ActionBar.k6.q7));
                                }
                            }
                            y3Var.setCanceledOnTouchOutside(true);
                            y3Var.setOnDismissListener(new hg.g(11, this, zArr));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.z4.l0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.r0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new sh1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z21 = sharedInstance != null && sharedInstance.hasRate();
                            this.a0.c();
                            if (!z21 || this.D0) {
                                num = 1;
                                AndroidUtilities.runOnUIThread(new sh1(this, 0), 200L);
                                break;
                            } else {
                                if (this.u0) {
                                    int[] iArr = new int[2];
                                    int i17 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i17 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.R.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.R.setTranslationY(iArr[1]);
                                    this.R.setAlpha(1.0f);
                                    this.R.setLayoutParams(marginLayoutParams);
                                    this.g0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new bh1(true ? 1 : 0, this, sharedInstance), 2L);
                                    i14 = 0;
                                } else {
                                    this.g0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                                    layoutParams.rightMargin = AndroidUtilities.dp(18.0f);
                                    layoutParams.leftMargin = AndroidUtilities.dp(18.0f);
                                    int dp = AndroidUtilities.dp(36.0f);
                                    layoutParams.bottomMargin = dp;
                                    WindowInsets windowInsets = this.o0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + dp;
                                    }
                                    layoutParams.gravity = 80;
                                    this.R.setLayoutParams(layoutParams);
                                    this.R.animate().alpha(1.0f).setDuration(250L).start();
                                    i14 = 0;
                                    this.R.a(new rh1(this, sharedInstance, i14), false);
                                }
                                this.N.setVisibility(i14);
                                org.telegram.ui.Components.voip.m1 m1Var = this.N;
                                qh1 qh1Var2 = new qh1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.l1[] l1VarArr = m1Var.c;
                                m1Var.d = qh1Var2;
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
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(j1Var, (Property<org.telegram.ui.Components.voip.j1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.pr.f);
                                Integer num2 = 1;
                                animatorSet.setDuration(250L);
                                int i18 = 0;
                                while (i18 < l1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    l1VarArr[i18].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(l1VarArr[i18], (Property<org.telegram.ui.Components.voip.l1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i18 * 16);
                                    animatorSet2.start();
                                    i18++;
                                    num2 = num2;
                                    property3 = property3;
                                }
                                num = num2;
                                animatorSet.start();
                                if (this.z0) {
                                    this.z0 = false;
                                    ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                                    duration.setInterpolator(prVar).setListener(new org.telegram.ui.Components.x20(this.L)).start();
                                    this.K.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar).setDuration(250L).start();
                                    this.O.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new org.telegram.ui.Components.x20(this.L)).setDuration(250L).setInterpolator(prVar).start();
                                }
                                for (org.telegram.ui.Components.p9 p9Var : this.S) {
                                    p9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.pr.f).setDuration(250L).start();
                                }
                                this.B.animate().alpha(0.0f).setDuration(70L).setListener(new zh1(this)).start();
                                ViewPropertyAnimator alpha = this.H.animate().alpha(0.0f);
                                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
                                b.p(alpha, prVar2, 250L);
                                this.H.setVisibility(8);
                                this.C.d(false, true);
                                this.C.c(false);
                                org.telegram.ui.Components.voip.u2 u2Var = this.C.d;
                                u2Var.n = true;
                                u2Var.invalidate();
                                org.telegram.ui.Components.voip.r0 r0Var = this.y;
                                r0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = r0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                r0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.ALPHA, r0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.TRANSLATION_Y, r0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_X, r0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_Y, r0Var.getScaleY(), 0.9f, 1.0f));
                                r0Var.c.setInterpolator(prVar2);
                                r0Var.c.setDuration(300L);
                                r0Var.c.setStartDelay(250L);
                                r0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.W.setAlpha(0.0f);
                                this.W.setVisibility(8);
                                this.V.setAlpha(0.0f);
                                this.V.setVisibility(8);
                                bi1 bi1Var = this.l0;
                                if (bi1Var != null) {
                                    bi1Var.a(false, false);
                                }
                                this.J0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.n0 != 12) {
                                this.C.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z20);
                            }
                            num = 1;
                            break;
                        case 13:
                            this.C.b(LocaleController.getString(R.string.VoipWaiting), true, z20);
                            num = 1;
                            break;
                        case 14:
                            this.C.b(LocaleController.getString(R.string.VoipRequesting), true, z20);
                            num = 1;
                            break;
                        case 15:
                            this.b0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.C.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z20);
                                this.b0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.C.b(LocaleController.getString(R.string.VoipInCallBranding), false, z20);
                                this.b0.setTranslationY(0.0f);
                            } else {
                                this.C.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z20);
                                this.b0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            num = 1;
                            z10 = false;
                            z4 = false;
                            break;
                        case 16:
                            if (this.n0 != 16) {
                                this.C.b(LocaleController.getString(R.string.VoipRinging), true, z20);
                            }
                            num = 1;
                            break;
                        case 17:
                            z4 = false;
                            this.C.b(LocaleController.getString(R.string.VoipBusy), false, z20);
                            this.b0.setRetryMod(true);
                            this.k0 = false;
                            this.j0 = false;
                            num = 1;
                            z10 = false;
                            break;
                        default:
                            num = 1;
                            break;
                    }
                    if (this.l0 == null) {
                        return;
                    }
                    boolean z22 = this.j0 || this.k0;
                    if (sharedInstance != null) {
                        this.j0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z17 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z18 = false;
                                this.k0 = z18;
                                if (z18 && !this.R0) {
                                    this.R0 = z17;
                                }
                            }
                        } else {
                            z17 = true;
                        }
                        z18 = true;
                        this.k0 = z18;
                        if (z18) {
                            this.R0 = z17;
                        }
                    }
                    if (z20) {
                        this.V.b();
                        this.W.b();
                    }
                    if (this.j0) {
                        if (this.B0) {
                            f12 = 1.0f;
                        } else {
                            f12 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z20) {
                            this.Z.animate().alpha(f12).setDuration(250L).start();
                        } else {
                            this.Z.animate().cancel();
                            this.Z.setAlpha(f12);
                        }
                        if (!this.Z.d.isFirstFrameRendered() && !this.F0) {
                            i10 = 0;
                            this.j0 = false;
                            if (!this.k0 || this.j0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z20) {
                                    this.Z.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.Z.animate().cancel();
                                    this.Z.setAlpha(0.0f);
                                }
                            }
                            z11 = this.k0;
                            if (z11 || !this.j0) {
                                this.E0 = false;
                            }
                            z12 = (z11 || !this.E0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            x(z20, z22);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z20) {
                                this.b0.setVisibility(z19 ? 0 : 8);
                            } else {
                                if (z19 && this.b0.getTag() == null) {
                                    this.b0.animate().setListener(null).cancel();
                                    if (this.b0.getVisibility() == 8) {
                                        this.b0.setVisibility(0);
                                        this.b0.setAlpha(0.0f);
                                    }
                                    this.b0.animate().alpha(1.0f);
                                }
                                if (!z19 && this.b0.getTag() != null) {
                                    this.b0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.b0.animate().setListener(new wh1(this, i11)).alpha(0.0f);
                                    this.b0.setEnabled(z19);
                                    this.b0.setTag(z19 ? num : null);
                                    this.r0.setLockOnScreen(this.G0);
                                    z13 = this.m0 != 3 && (this.k0 || this.j0);
                                    this.w0 = z13;
                                    if (!z13 && !this.u0) {
                                        A(true);
                                    }
                                    if (this.u0 && this.w0 && !this.O0 && sharedInstance != null) {
                                        AndroidUtilities.runOnUIThread(this.P0, 3000L);
                                        this.O0 = true;
                                    }
                                    int i19 = this.m0;
                                    boolean z23 = i19 == 11 && this.u0;
                                    boolean z24 = (!z19 || i19 == 16 || i19 == 11 || i19 == 12 || i19 == 14 || i19 == 6 || !this.u0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z20) {
                                        if (z23) {
                                            this.E.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.E.getVisibility() != 0) {
                                                this.E.setVisibility(0);
                                                f10 = 0.0f;
                                                this.E.setAlpha(0.0f);
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            this.E.animate().alpha(f10).start();
                                        }
                                        if (z24) {
                                            this.F.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.F.getVisibility() != 0) {
                                                this.F.setVisibility(0);
                                                f11 = 0.0f;
                                                this.F.setAlpha(0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            this.F.animate().alpha(f11).start();
                                        }
                                        this.J0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.u0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                    } else {
                                        this.E.setVisibility(z23 ? 0 : 8);
                                        this.E.setAlpha(z23 ? 1.0f : 0.0f);
                                        ImageView imageView = this.F;
                                        if (z24) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.F.setAlpha(z24 ? 1.0f : 0.0f);
                                        this.J0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.u0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.m0;
                                    if (i12 != 10 && i12 != 11) {
                                        D(z20);
                                    }
                                    if (z4) {
                                        this.C.e(z20);
                                    }
                                    this.C.d(z10, z20);
                                    if (this.y.getVisibility() == 0 && this.z0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.Q.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = e2.c.e(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.m0 == 11 && !this.k0 && !this.j0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.k0 || this.j0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z20) {
                                        if (this.z0 && (this.k0 || this.j0)) {
                                            this.U.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                            j10 = 250;
                                        } else {
                                            j10 = 250;
                                            this.U.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                        }
                                        if (dp2 != this.s0) {
                                            this.U.animate().setStartDelay(this.m0 == 11 ? j10 : 0L).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                        }
                                    } else {
                                        this.U.setTranslationY(dp2);
                                    }
                                    this.s0 = dp2;
                                    boolean z25 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i20 = this.m0;
                                    this.A0 = i20 == 11 && i20 != 17 && ((this.k0 && !z25) || this.j0);
                                    if (sharedInstance != null) {
                                        if (this.k0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.a0.setIsScreencast(sharedInstance.isScreencast());
                                        this.a0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.k0 || sharedInstance.isScreencast()) ? null : this.a0.d;
                                        if (!this.j1 || (t2Var = this.h1) == null) {
                                            if (z12) {
                                                videoSink = this.Y;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z20) {
                                                    org.telegram.ui.Components.voip.i2 i2Var = this.J0;
                                                    i2Var.f = false;
                                                    if (!i2Var.e && i2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.J0.c("self-muted");
                                                } else {
                                                    this.J0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.k0 || this.j0) && (((i13 = this.m0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var2 = this.J0;
                                                        i2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, i2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.J0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var3 = this.J0;
                                                        i2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, i2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.J0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var4 = this.J0;
                                                        i2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, i2Var4.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.J0.c("muted");
                                                    }
                                                    this.J0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                }
                                                if (this.J0.getChildCount() == 0 && this.j0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                                    sharedUIParams = sharedInstance.sharedUIParams;
                                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                        sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                        this.K0.setTranslationY(-((this.s.getMeasuredHeight() - this.g0.getY()) + AndroidUtilities.dp(6.0f)));
                                                        this.K0.m(0.0f, this.f.getX() + this.g0.getX() + AndroidUtilities.dp(14.0f));
                                                        this.K0.u();
                                                        z16 = true;
                                                        if (z20) {
                                                            org.telegram.ui.Components.voip.i2 i2Var5 = this.J0;
                                                            if (i2Var5.f) {
                                                                i2Var5.e = z16;
                                                                AndroidUtilities.runOnUIThread(new oh.t3(i2Var5, 22), 700L);
                                                            }
                                                            i2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.J0.getChildCount() != 0) {
                                                    z16 = true;
                                                    this.K0.e(true);
                                                    if (z20) {
                                                    }
                                                }
                                                z16 = true;
                                                if (z20) {
                                                }
                                            } else {
                                                t2Var = this.Z;
                                            }
                                        }
                                        videoSink = t2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z20) {
                                        }
                                        if (sharedInstance.isMicMute()) {
                                        }
                                        if (this.k0) {
                                        }
                                        if (sharedInstance.getRemoteAudioState() != 0) {
                                        }
                                        if (sharedInstance.getRemoteVideoState() != 0) {
                                        }
                                        if (this.J0.getChildCount() == 0) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                            }
                                        }
                                        if (this.J0.getChildCount() != 0) {
                                        }
                                        z16 = true;
                                        if (z20) {
                                        }
                                    }
                                    childsHight = this.J0.getChildsHight();
                                    t1Var = this.W;
                                    if (t1Var.getParent() == null && z20) {
                                        t1Var.Q = childsHight;
                                    } else {
                                        t1Var.Q = childsHight;
                                    }
                                    t1Var2 = this.V;
                                    if (t1Var2.getParent() == null && z20) {
                                        t1Var2.Q = childsHight;
                                    } else {
                                        t1Var2.Q = childsHight;
                                    }
                                    this.V.setUiVisible(this.u0);
                                    this.W.setUiVisible(this.u0);
                                    if (!this.k0) {
                                        z14 = true;
                                        z(0, z20);
                                    } else if (!this.j0 || this.E0) {
                                        z14 = true;
                                        z(1, z20);
                                    } else {
                                        z(2, z20);
                                        z14 = true;
                                    }
                                    if (!z12 && this.W.getTag() == null) {
                                        this.W.setIsActive(z14);
                                        if (this.W.getVisibility() != 0) {
                                            this.W.setVisibility(0);
                                            this.W.setAlpha(0.0f);
                                            this.W.setScaleX(0.5f);
                                            this.W.setScaleY(0.5f);
                                        }
                                        this.W.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.t1 t1Var3 = this.W;
                                        t1Var3.W = true;
                                        t1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).setStartDelay(150L).withEndAction(new sh1(this, 4)).start();
                                        this.W.setTag(num);
                                    } else if (!z12 && this.W.getTag() != null) {
                                        this.W.setIsActive(false);
                                        this.W.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new wh1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                        this.W.setTag(null);
                                    }
                                    this.V.a();
                                    this.W.a();
                                    F();
                                    if (this.m0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i21 = this.v.S;
                                        if (i21 != 2 && i21 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.n0 != -1);
                                            z15 = !this.k0 || this.j0;
                                            this.x.setState(z15);
                                            this.w.setState(z15);
                                            this.r.e(z15);
                                            if (this.j0 && !z22 && this.c0) {
                                                this.c0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z15) {
                                                if (this.f0.getVisibility() != 4) {
                                                    this.f0.setVisibility(4);
                                                    this.e0.setVisibility(4);
                                                }
                                            } else if (this.f0.getVisibility() != 0) {
                                                this.f0.setVisibility(0);
                                                this.e0.setVisibility(0);
                                            }
                                            sh1 sh1Var = this.Q0;
                                            AndroidUtilities.cancelRunOnUIThread(sh1Var);
                                            if (this.m0 != 3) {
                                                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.k0) {
                                    }
                                    this.x.setState(z15);
                                    this.w.setState(z15);
                                    this.r.e(z15);
                                    if (this.j0) {
                                        this.c0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z15) {
                                    }
                                    sh1 sh1Var2 = this.Q0;
                                    AndroidUtilities.cancelRunOnUIThread(sh1Var2);
                                    if (this.m0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.b0.setEnabled(z19);
                            this.b0.setTag(z19 ? num : null);
                            this.r0.setLockOnScreen(this.G0);
                            if (this.m0 != 3) {
                            }
                            this.w0 = z13;
                            if (!z13) {
                                A(true);
                            }
                            if (this.u0) {
                                AndroidUtilities.runOnUIThread(this.P0, 3000L);
                                this.O0 = true;
                            }
                            int i192 = this.m0;
                            if (i192 == 11) {
                            }
                            if (!z19) {
                            }
                            if (z20) {
                            }
                            i12 = this.m0;
                            if (i12 != 10) {
                                D(z20);
                            }
                            if (z4) {
                            }
                            this.C.d(z10, z20);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.Q.getLayout();
                                if (layout != null) {
                                    dp2 = e2.c.e(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.m0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.k0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z20) {
                            }
                            this.s0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i202 = this.m0;
                            this.A0 = i202 == 11 && i202 != 17 && ((this.k0 && !z25) || this.j0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.J0.getChildsHight();
                            t1Var = this.W;
                            if (t1Var.getParent() == null) {
                            }
                            t1Var.Q = childsHight;
                            t1Var2 = this.V;
                            if (t1Var2.getParent() == null) {
                            }
                            t1Var2.Q = childsHight;
                            this.V.setUiVisible(this.u0);
                            this.W.setUiVisible(this.u0);
                            if (!this.k0) {
                            }
                            if (!z12) {
                            }
                            if (!z12) {
                                this.W.setIsActive(false);
                                this.W.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new wh1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                                this.W.setTag(null);
                            }
                            this.V.a();
                            this.W.a();
                            F();
                            if (this.m0 == 3) {
                            }
                            if (this.k0) {
                            }
                            this.x.setState(z15);
                            this.w.setState(z15);
                            this.r.e(z15);
                            if (this.j0) {
                            }
                            if (z15) {
                            }
                            sh1 sh1Var22 = this.Q0;
                            AndroidUtilities.cancelRunOnUIThread(sh1Var22);
                            if (this.m0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.k0) {
                    }
                    this.v.setVisibility(4);
                    z11 = this.k0;
                    if (z11) {
                    }
                    this.E0 = false;
                    if (z11) {
                    }
                    x(z20, z22);
                    if (this.y.getTag() != null) {
                    }
                    if (z20) {
                    }
                    i11 = 8;
                    this.b0.setEnabled(z19);
                    this.b0.setTag(z19 ? num : null);
                    this.r0.setLockOnScreen(this.G0);
                    if (this.m0 != 3) {
                    }
                    this.w0 = z13;
                    if (!z13) {
                    }
                    if (this.u0) {
                    }
                    int i1922 = this.m0;
                    if (i1922 == 11) {
                    }
                    if (!z19) {
                    }
                    if (z20) {
                    }
                    i12 = this.m0;
                    if (i12 != 10) {
                    }
                    if (z4) {
                    }
                    this.C.d(z10, z20);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.m0 == 11) {
                    }
                    if (!this.k0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z20) {
                    }
                    this.s0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2022 = this.m0;
                    this.A0 = i2022 == 11 && i2022 != 17 && ((this.k0 && !z25) || this.j0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.J0.getChildsHight();
                    t1Var = this.W;
                    if (t1Var.getParent() == null) {
                    }
                    t1Var.Q = childsHight;
                    t1Var2 = this.V;
                    if (t1Var2.getParent() == null) {
                    }
                    t1Var2.Q = childsHight;
                    this.V.setUiVisible(this.u0);
                    this.W.setUiVisible(this.u0);
                    if (!this.k0) {
                    }
                    if (!z12) {
                    }
                    if (!z12) {
                    }
                    this.V.a();
                    this.W.a();
                    F();
                    if (this.m0 == 3) {
                    }
                    if (this.k0) {
                    }
                    this.x.setState(z15);
                    this.w.setState(z15);
                    this.r.e(z15);
                    if (this.j0) {
                    }
                    if (z15) {
                    }
                    sh1 sh1Var222 = this.Q0;
                    AndroidUtilities.cancelRunOnUIThread(sh1Var222);
                    if (this.m0 != 3) {
                    }
                }
            }
            num = 1;
            E(z20);
            if (this.m0 == 5) {
                boolean z26 = this.p0;
                if (!z26 && this.n0 != 5) {
                    this.C.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
                }
                z10 = z26;
                z19 = false;
                z4 = false;
                if (this.l0 == null) {
                }
            } else {
                this.p0 = true;
                z19 = false;
                z10 = false;
                z4 = true;
                if (this.l0 == null) {
                }
            }
        }
        z19 = false;
        z10 = false;
        z4 = false;
        if (this.l0 == null) {
        }
    }

    @Override // ef.a
    public final void a(c2.p pVar) {
        this.i1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        ai1 ai1Var = this.r0;
        ai1Var.getClass();
        windowManager.addView(ai1Var, org.telegram.ui.Components.voip.x2.a());
        this.j1 = false;
        H();
        this.r0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.h1;
        if (t2Var != null) {
            t2Var.d.release();
            this.h1 = null;
        }
    }

    @Override // ef.a
    public final Bitmap b() {
        org.telegram.ui.Components.voip.t2 t2Var = this.h1;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.h1.d.getBitmap();
    }

    @Override // ef.a
    public final void c(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // ef.a
    public final Bitmap d() {
        org.telegram.ui.Components.voip.t2 t2Var = this.Z;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.Z.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.m0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.a0.d.release();
            this.Z.d.release();
            this.Y.release();
            o();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
            return;
        }
        if (i10 == NotificationCenter.closeInCallActivity) {
            this.r0.b();
            return;
        }
        if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.c0 = booleanValue;
            if (booleanValue) {
                this.y.b(true, true);
            }
        }
    }

    @Override // ef.a
    public final void e(c2.p pVar) {
        this.i1 = pVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.j1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.r0);
        this.r0.invalidate();
    }

    @Override // ef.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // ef.a
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.b, false, true, false, false);
        this.h1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.h1.d.setEnableHardwareScaler(true);
        this.h1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h1;
        t2Var2.U = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ci1(this));
        View view = this.h1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.h1;
    }

    public final ValueAnimator k(boolean z4) {
        char c3;
        float measuredHeight;
        final float f10;
        final boolean z10;
        final float f11;
        float f12;
        float f13;
        this.V.animate().cancel();
        float f14 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().y;
        float f15 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().B;
        final float x10 = this.V.getX();
        final float y10 = this.V.getY();
        final float scaleX = this.V.getScaleX();
        org.telegram.ui.Components.voip.n2.R.getClass();
        final float measuredWidth = f14 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f15 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f16 = 1.0f;
        if (this.j0) {
            int measuredWidth2 = this.V.getMeasuredWidth();
            if (!this.k0 || measuredWidth2 == 0) {
                c3 = 0;
                measuredHeight = 1.0f;
                z10 = false;
                f12 = 1.0f;
                f13 = 0.0f;
            } else {
                f13 = (this.r0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f12 = (((org.telegram.ui.Components.voip.n2.k().f * 0.25f) + (f14 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * f13)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f15 - ((this.V.getMeasuredHeight() - (this.V.getMeasuredHeight() * f13)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z10 = true;
            }
            float f17 = f13;
            f10 = f12;
            f11 = f17;
        } else {
            c3 = 0;
            float measuredWidth3 = f14 - ((this.V.getMeasuredWidth() - (this.V.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f15 - ((this.V.getMeasuredHeight() - (this.V.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = measuredWidth3;
            z10 = true;
            f11 = 0.25f;
        }
        final float f18 = measuredHeight;
        float dp = this.j0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f11;
        if (this.j0) {
            org.telegram.ui.Components.voip.n2.R.getClass();
            f16 = 0.0f;
        }
        if (z4) {
            if (z10) {
                this.V.setScaleX(f11);
                this.V.setScaleY(f11);
                this.V.setTranslationX(f10);
                this.V.setTranslationY(f18);
                this.V.setCornerRadius(dp2);
                this.V.setAlpha(f16);
            }
            this.Z.setScaleX(0.25f);
            this.Z.setScaleY(0.25f);
            this.Z.setTranslationX(measuredWidth);
            this.Z.setTranslationY(measuredHeight2);
            this.Z.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f19 = z4 ? 1.0f : 0.0f;
        float f20 = z4 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c3] = f19;
        fArr[1] = f20;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.C0 = z4 ? 0.0f : 1.0f;
        G();
        final float f21 = dp;
        final float f22 = 0.25f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.vh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                ii1 ii1Var = ii1.this;
                ii1Var.C0 = f23;
                ii1Var.G();
                if (z10) {
                    float f24 = (f11 * floatValue) + (scaleX * f23);
                    ii1Var.V.setScaleX(f24);
                    ii1Var.V.setScaleY(f24);
                    ii1Var.V.setTranslationX((f10 * floatValue) + (x10 * f23));
                    ii1Var.V.setTranslationY((f18 * floatValue) + (y10 * f23));
                    ii1Var.V.setCornerRadius((dp2 * floatValue) + (f21 * f23));
                    ii1Var.V.setAlpha((f16 * floatValue) + (1.0f * f23));
                }
                float f25 = (f22 * floatValue) + (1.0f * f23);
                ii1Var.Z.setScaleX(f25);
                ii1Var.Z.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                ii1Var.Z.setTranslationX(f27);
                ii1Var.Z.setTranslationY(f28);
                ii1Var.Z.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!ii1Var.V.M) {
                    ii1Var.a0.d(floatValue, false);
                }
                ii1Var.r0.invalidate();
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
        cf.f fVar = this.d0;
        if (fVar != null) {
            fVar.c();
            this.d0 = null;
        }
        hg.v2 v2Var = this.J;
        if (v2Var != null) {
            v2Var.dismiss();
            this.J = null;
        }
    }

    public final void m(boolean z4) {
        ValueAnimator ofFloat;
        if (this.y0 && this.z0 != z4 && this.u0) {
            this.z0 = z4;
            org.telegram.ui.Components.voip.a3 a3Var = this.w;
            int i10 = 1;
            if (a3Var.H && z4 != a3Var.B) {
                a3Var.B = z4;
                float[] fArr = {1.0f, 0.0f};
                if (z4) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                a3Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, i10));
                a3Var.c.setInterpolator(org.telegram.ui.Components.pr.f);
                a3Var.c.setDuration(200L);
                a3Var.c.start();
            }
            if (z4) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.L0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.P0);
                this.O0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                }
                this.L.animate().setListener(null).cancel();
                this.L.setVisibility(0);
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.3f);
                this.L.setScaleY(0.3f);
                this.L.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.pr.g).start();
                ViewPropertyAnimator translationY = this.K.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                b.p(translationY, prVar, 400L);
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.O.setScaleX(0.7f);
                this.O.setScaleY(0.7f);
                this.O.setAlpha(0.0f);
                this.O.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new wh1(this, 3)).setInterpolator(prVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f).start();
                }
                this.L.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.f;
                duration.setInterpolator(prVar2).setListener(new org.telegram.ui.Components.x20(this.L)).start();
                this.K.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(prVar2).setDuration(280L).start();
                this.O.animate().setListener(null).cancel();
                this.O.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new wh1(this, 4)).setDuration(250L).setInterpolator(prVar2).start();
            }
            this.n0 = this.m0;
            H();
        }
    }

    public final void n() {
        this.r0.b();
    }

    public final void o() {
        this.a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new xh1(this));
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.Y.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z4) {
        this.n0 = this.m0;
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        this.n0 = this.m0;
        if (i11 == 2 && !this.R0) {
            this.R0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            cf.f fVar = this.d0;
            if (fVar != null) {
                fVar.c();
                this.d0 = null;
            }
        } else if (this.d0 == null && ff.d.a(this.b) == 1) {
            cf.e eVar = new cf.e(this.b, k1);
            eVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.t2 t2Var = this.Z;
            eVar.j = t2Var.d;
            eVar.k = t2Var.getPlaceholderView();
            this.d0 = eVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.g1 = true;
        }
        if (this.C == null || (d3Var = this.v) == null) {
            return;
        }
        int i11 = d3Var.S;
        if ((i11 == 2 || i11 == 3) && this.g1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.im(this, i10, 26), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.m0;
        if (i11 != i10) {
            this.n0 = i11;
            this.m0 = i10;
            if (this.r0 != null) {
                H();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z4) {
        this.n0 = this.m0;
        if (z4 && !this.R0) {
            this.R0 = true;
        }
        H();
    }

    public final void p() {
        if (this.D0 || this.B0) {
            return;
        }
        bi1 bi1Var = this.l0;
        if (bi1Var != null) {
            bi1Var.a(false, false);
            return;
        }
        if (this.j0 && this.k0 && this.E0) {
            this.E0 = false;
            this.V.setRelativePosition(this.W);
            this.X = false;
            this.n0 = this.m0;
            H();
            return;
        }
        if (this.z0) {
            m(false);
            return;
        }
        if (this.O.getVisibility() != 8) {
            return;
        }
        if (!this.A0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.r0.b();
            return;
        }
        if (ff.d.a(this.b) <= 0) {
            org.telegram.ui.Components.z4.B(this.b, new qh1(this, 0), true).o();
            return;
        }
        if (this.D0 || k1 == null) {
            return;
        }
        this.D0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = k1.r0.getMeasuredHeight();
            ii1 ii1Var = k1;
            org.telegram.ui.Components.voip.n2.l(ii1Var.b, ii1Var.a, ii1Var.r0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = k1.o0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.n2.T = windowInsets.getSystemWindowInsetTop();
                k1.o0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.n2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.H.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        duration.setInterpolator(prVar).start();
        this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.F.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.K.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.U.animate().alpha(0.0f).setDuration(150L).setInterpolator(prVar).start();
        this.g0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.W.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        this.J0.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).start();
        org.telegram.ui.Components.voip.n2.Q = true;
        this.B0 = true;
        ValueAnimator k10 = k(false);
        this.I0.lock();
        k10.addListener(new wh1(this, 1));
        k10.setDuration(350L);
        k10.setInterpolator(prVar);
        k10.start();
    }

    public final void r(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.b0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.b0;
            ValueAnimator valueAnimator = eVar.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.V = null;
                eVar.R.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.b0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.b0;
        ValueAnimator valueAnimator2 = eVar2.V;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.V = null;
            eVar2.R.stop();
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
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.uh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ii1 ii1Var = ii1.this;
                ii1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ii1Var.b0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                ii1Var.b0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.b0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.b0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, (Property<org.telegram.ui.Components.voip.e, Float>) View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.b0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, (Property<org.telegram.ui.Components.voip.e, Float>) View.ALPHA, eVar5.getAlpha(), this.b0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ex0(14, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new sh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.k0) {
            l3Var.d(2, false, false);
            l3Var.setOnBtnClickedListener(null);
            l3Var.setEnabled(false);
        } else {
            l3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                l3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                l3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            l3Var.setOnBtnClickedListener(new d7(this, voIPService, l3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z4) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.V;
        boolean isMicMute = voIPService.isMicMute();
        if (z4) {
            ValueAnimator valueAnimator = t1Var.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.H, isMicMute ? 1.0f : 0.0f);
            t1Var.c0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.d0);
            t1Var.c0.setDuration(150L);
            t1Var.c0.start();
        } else {
            ValueAnimator valueAnimator2 = t1Var.c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            t1Var.H = isMicMute ? 1.0f : 0.0f;
            t1Var.invalidate();
        }
        l3Var.setOnBtnClickedListener(new qh1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            l3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            l3Var.d(5, true, false);
            i10 = 0;
        } else {
            l3Var.d(5, false, false);
            i10 = 1;
        }
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new hg.a0(this, i10, l3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z4) {
        if (!((this.k0 || this.j0) ? true : voIPService.isVideoAvailable())) {
            l3Var.d(3, true, false);
            l3Var.setOnClickListener(null);
            l3Var.setEnabled(false);
            return;
        }
        if (!this.k0) {
            l3Var.d(3, true, z4);
        } else if (voIPService.isScreencast()) {
            l3Var.d(3, false, z4);
        } else {
            l3Var.d(3, false, z4);
        }
        l3Var.setOnBtnClickedListener(new qh1(this, 6));
        l3Var.setEnabled(true);
    }

    public final void x(boolean z4, boolean z10) {
        boolean z11 = (this.k0 || this.j0) ? false : true;
        if (!z4) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.setAlpha(1.0f);
            this.y.setScaleX(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setVisibility(z11 ? 0 : 8);
        } else if (z11 && this.y.getTag() == null) {
            this.y.animate().setListener(null).cancel();
            this.y.setVisibility(0);
            if (this.z0) {
                if (z10) {
                    this.y.setAlpha(0.0f);
                    this.y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.y.setScaleX(0.1f);
                    this.y.setScaleY(0.1f);
                }
            } else if (z10) {
                this.y.setAlpha(0.0f);
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f).start();
            }
        } else if (!z11 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.pr.f).setListener(new wh1(this, 7)).start();
        }
        this.y.setTag(z11 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        y3Var.O = LocaleController.getString(R.string.VoipFailed);
        y3Var.Q = charSequence;
        y3Var.i0 = LocaleController.getString(R.string.OK);
        y3Var.j0 = null;
        y3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) y3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(y3Var.e(org.telegram.ui.ActionBar.k6.q7));
            }
        }
        y3Var.setCanceledOnTouchOutside(true);
        y3Var.setOnDismissListener(new v5(this, 19));
    }

    public final void z(int i10, boolean z4) {
        AnimatorSet animatorSet;
        if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
            this.V.setUiVisible(this.u0);
        }
        if (!z4 && (animatorSet = this.x0) != null) {
            animatorSet.removeAllListeners();
            this.x0.cancel();
        }
        if (i10 != 0) {
            boolean z10 = (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() == 0) ? false : z4;
            if (!z4) {
                this.V.setVisibility(0);
            } else if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() == 0) {
                if (this.V.getVisibility() == 8) {
                    this.V.setAlpha(0.0f);
                    this.V.setScaleX(0.7f);
                    this.V.setScaleY(0.7f);
                    this.V.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.x0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.x0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.V, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.x0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.V.getTag() == null || ((Integer) this.V.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var = this.V;
                if (t1Var.y < 0.0f) {
                    t1Var.d(1.0f, 1.0f);
                    this.X = true;
                }
            }
            this.V.c(i10 == 2, z10);
            this.X = i10 != 2;
        } else if (!z4) {
            this.V.setVisibility(8);
        } else if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.x0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.x0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.t1 t1Var2 = this.V;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(t1Var2, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, t1Var2.getAlpha(), 0.0f));
            if (this.V.getTag() != null && ((Integer) this.V.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.t1 t1Var3 = this.V;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var3, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, t1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.t1 t1Var4 = this.V;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var4, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, t1Var4.getScaleX(), 0.7f));
            }
            this.x0 = animatorSet5;
            animatorSet5.addListener(new wh1(this, 6));
            this.x0.setDuration(250L).setInterpolator(org.telegram.ui.Components.pr.f);
            this.x0.setStartDelay(50L);
            this.x0.start();
        }
        this.V.setTag(Integer.valueOf(i10));
    }

    @Override // ef.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z4) {
    }
}
