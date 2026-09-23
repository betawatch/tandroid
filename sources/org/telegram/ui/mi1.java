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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static mi1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.p2 F;
    public float F0;
    public li1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public hg.l K;
    public long K0;
    public int L;
    public tg.n1 M;
    public org.telegram.ui.Components.voip.h2 M0;
    public ub1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.o1 Q;
    public ci.w5 R;
    public boolean R0;
    public TextView S;
    public pk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public ii1 X;
    public float X0;
    public org.telegram.ui.Components.voip.u1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.s2 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.s2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.k3 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.k3 f;
    public boolean f0;
    public pf.e g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.r1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.s2 k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean m1;
    public ji1 n;
    public boolean n0;
    public fi1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public hi1 s;
    public boolean s0;
    public float t0;
    public ei1 u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int v0;
    public org.telegram.ui.Components.voip.z2 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.e3 x;
    public org.telegram.ui.Components.voip.t0 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.q1 r = new org.telegram.ui.Components.voip.q1();
    public final org.telegram.ui.Components.w9[] V = new org.telegram.ui.Components.w9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final s11 Q0 = new s11(this, 20);
    public final wh1 S0 = new wh1(this, 12);
    public final wh1 T0 = new wh1(this, 13);
    public float f1 = 1.0f;

    public mi1(int i10) {
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

    public static /* synthetic */ void i(mi1 mi1Var) {
        AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
        mi1Var.R0 = false;
        if (Build.VERSION.SDK_INT < 23 || mi1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            mi1Var.C();
        } else {
            mi1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(mi1 mi1Var) {
        mi1 mi1Var2;
        int i10 = 0;
        if (mi1Var.g1) {
            mi1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            mi1Var.i1 = ofFloat;
            mi1Var2 = mi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x(mi1Var2, mi1Var.f1, mi1Var.Y0, mi1Var.Z0, 1));
            mi1Var2.i1.addListener(new ai1(mi1Var2, i10));
            mi1Var2.i1.setDuration(350L);
            mi1Var2.i1.setInterpolator(org.telegram.ui.Components.rr.f);
            mi1Var2.i1.start();
        } else {
            mi1Var2 = mi1Var;
        }
        mi1Var2.h1 = false;
        mi1Var2.a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        mi1 mi1Var = n1;
        if (mi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    mi1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    mi1Var.r(new g91(2));
                } else if (!mi1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.f2.h(mi1Var.b, new wh1(mi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    mi1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    mi1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        mi1 mi1Var = n1;
        if (mi1Var != null && mi1Var.u0.getParent() == null) {
            mi1 mi1Var2 = n1;
            if (mi1Var2 != null) {
                mi1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                ei1 ei1Var = n1.u0;
                if (ei1Var != null) {
                    ei1Var.d();
                }
                n1.l();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.m2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        mi1 mi1Var3 = new mi1(i10);
        mi1Var3.b = activity;
        n1 = mi1Var3;
        ei1 ei1Var2 = new ei1(activity, !z10, mi1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        ei1Var2.setLockOnScreen(n1.J0);
        mi1Var3.u0 = ei1Var2;
        uh1 uh1Var = new uh1(mi1Var3, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ei1Var2, uh1Var);
        ((WindowManager) activity.getSystemService("window")).addView(ei1Var2, org.telegram.ui.Components.voip.w2.a());
        mi1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        mi1Var3.w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        hi1 hi1Var = new hi1(mi1Var3, activity);
        hi1Var.setClipToPadding(false);
        hi1Var.setClipChildren(false);
        hi1Var.setBackgroundColor(-16777216);
        mi1Var3.G();
        mi1Var3.s = hi1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.q1 q1Var = mi1Var3.r;
        mi1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, q1Var);
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity, false, true, false, false);
        mi1Var3.c0 = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2Var.d.setScalingType(scalingType);
        mi1Var3.c0.d.setEnableHardwareScaler(true);
        mi1Var3.c0.d.setRotateTextureWithScreen(true);
        mi1Var3.c0.a0 = 1;
        hi1Var.addView(mi1Var3.v, w7.x5.c(-1.0f, -1));
        TLRPC.User user = mi1Var3.d;
        org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, q1Var);
        mi1Var3.w = z2Var;
        hi1Var.addView(z2Var, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.h6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                e3Var.a = new org.telegram.ui.Components.aw0(0);
            }
        }
        mi1Var3.x = e3Var;
        hi1Var.addView(e3Var, w7.x5.c(220.0f, -1));
        hi1Var.addView(mi1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.v9(orientation, new int[]{-14994098, -14328963}).f(k2.b0.m(0.5f, 1), new wc1(mi1Var3, 1), 0L);
        org.telegram.ui.Components.voip.u1 u1Var = new org.telegram.ui.Components.voip.u1(activity);
        mi1Var3.Y = u1Var;
        u1Var.setDelegate(new uh1(mi1Var3, 3));
        mi1Var3.Y.d(1.0f, 1.0f);
        mi1Var3.a0 = true;
        org.telegram.ui.Components.voip.s2 s2Var2 = new org.telegram.ui.Components.voip.s2(activity, true, false);
        mi1Var3.d0 = s2Var2;
        s2Var2.d.setIsCamera(true);
        mi1Var3.d0.d.setUseCameraRotation(true);
        mi1Var3.Y.setOnTapListener(new xh1(mi1Var3, 1));
        mi1Var3.d0.d.setMirror(true);
        mi1Var3.Y.addView(mi1Var3.d0);
        org.telegram.ui.Components.voip.u1 u1Var2 = new org.telegram.ui.Components.voip.u1(activity);
        mi1Var3.Z = u1Var2;
        u1Var2.S = true;
        u1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        mi1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        mi1Var3.b0.setIsCamera(false);
        mi1Var3.b0.setFpsReduction(30.0f);
        mi1Var3.b0.setScalingType(scalingType);
        mi1Var3.Z.addView(mi1Var3.b0, w7.x5.e(-1, -2, 17));
        mi1Var3.Z.setOnTapListener(new xh1(mi1Var3, i11));
        mi1Var3.Z.setVisibility(8);
        hi1Var.addView(mi1Var3.Y, w7.x5.c(-2.0f, -2));
        hi1Var.addView(mi1Var3.Z);
        View view = new View(activity);
        mi1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        hi1Var.addView(mi1Var3.h0, w7.x5.e(-1, 160, 80));
        View view2 = new View(activity);
        mi1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        hi1Var.addView(mi1Var3.i0, w7.x5.e(-1, 160, 48));
        ub1 ub1Var = new ub1(mi1Var3, activity, 16);
        mi1Var3.N = ub1Var;
        ub1Var.setOrientation(0);
        mi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        mi1Var3.N.setClipToPadding(false);
        mi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        mi1Var3.N.setOnClickListener(new xh1(mi1Var3, 3));
        mi1Var3.P = new org.telegram.ui.Components.voip.q0(activity, q1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        mi1Var3.O = frameLayout;
        frameLayout.addView(mi1Var3.P, w7.x5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        mi1Var3.O.setVisibility(8);
        mi1Var3.O.setOnClickListener(new xh1(mi1Var3, 4));
        ci.w5 w5Var = new ci.w5(activity, q1Var);
        mi1Var3.R = w5Var;
        w5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        mi1Var3.S = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        mi1Var3.S.setTextSize(1, 15.0f);
        mi1Var3.S.setTypeface(AndroidUtilities.bold());
        mi1Var3.S.setTextColor(-1);
        mi1Var3.S.setGravity(17);
        pk pkVar = new pk(mi1Var3, activity, 5);
        mi1Var3.T = pkVar;
        pkVar.setTextSize(1, 15.0f);
        mi1Var3.T.setTextColor(-1);
        mi1Var3.T.setGravity(17);
        mi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), mi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        mi1Var3.R.setVisibility(8);
        mi1Var3.R.addView(mi1Var3.S);
        mi1Var3.R.addView(mi1Var3.T, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        mi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
            org.telegram.ui.Components.w9[] w9VarArr = mi1Var3.V;
            w9VarArr[i15] = w9Var;
            w9VarArr[i15].getImageReceiver().setAspectFit(true);
            mi1Var3.N.addView(w9VarArr[i15], w7.x5.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        ii1 ii1Var = new ii1(mi1Var3, activity);
        mi1Var3.X = ii1Var;
        ii1Var.setOrientation(1);
        mi1Var3.X.setFocusable(true);
        mi1Var3.X.setFocusableInTouchMode(true);
        mi1Var3.y = new org.telegram.ui.Components.voip.t0(activity);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.r(user);
        org.telegram.ui.Components.voip.t0 t0Var = mi1Var3.y;
        int i16 = mi1Var3.a;
        t0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, h9Var, user);
        mi1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        mi1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        mi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), mi1Var3.E.getPaint().getFontMetricsInt(), false));
        mi1Var3.E.setMaxLines(2);
        mi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        mi1Var3.E.setTextColor(-1);
        mi1Var3.E.setGravity(1);
        mi1Var3.E.setImportantForAccessibility(2);
        mi1Var3.X.addView(mi1Var3.E, w7.x5.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(activity);
        p2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            p2Var.a[i17] = new TextView(activity);
            p2Var.a[i17].setTextSize(1, 15.0f);
            p2Var.a[i17].setTextColor(-1);
            p2Var.a[i17].setGravity(1);
            p2Var.addView(p2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        p2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(p2Var, activity, q1Var);
        n2Var.setTextSize(1, 15.0f);
        n2Var.setTextColor(-1);
        n2Var.setGravity(1);
        n2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        n2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(n2Var, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        p2Var.addView(frameLayout2, w7.x5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        p2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        p2Var.addView(textView3, w7.x5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new hg.x1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity);
        p2Var.d = t2Var;
        p2Var.addView(t2Var, w7.x5.c(-2.0f, -1));
        mi1Var3.F = p2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        p2Var.setImportantForAccessibility(4);
        mi1Var3.X.addView(mi1Var3.F, w7.x5.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            li1 li1Var = new li1(activity);
            mi1Var3.G = li1Var;
            long j3 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.j9 j9Var = li1Var.b;
                j9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    j9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j3 = j3;
                }
                long j10 = j3;
                j9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                    li1Var.setVisibility(8);
                } else {
                    li1Var.c = new org.telegram.ui.Components.f01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    li1Var.setVisibility(0);
                    li1Var.invalidate();
                }
            } else {
                li1Var.setVisibility(8);
            }
            mi1Var3.X.addView(mi1Var3.G, w7.x5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        mi1Var3.X.setClipChildren(false);
        mi1Var3.X.setClipToPadding(false);
        mi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        mi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
        mi1Var3.Q = new org.telegram.ui.Components.voip.o1(activity, q1Var);
        mi1Var3.U.setAlpha(0.0f);
        mi1Var3.Q.setVisibility(8);
        hi1Var.addView(mi1Var3.y, w7.x5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.X, w7.x5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.O, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.R, w7.x5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.N, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.U, w7.x5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        hi1Var.addView(mi1Var3.Q, w7.x5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        mi1Var3.j0 = new org.telegram.ui.Components.voip.r1(activity);
        mi1Var3.e = new org.telegram.ui.Components.voip.k3(activity, q1Var);
        mi1Var3.f = new org.telegram.ui.Components.voip.k3(activity, q1Var);
        mi1Var3.h = new org.telegram.ui.Components.voip.k3(activity, q1Var);
        mi1Var3.n = new ji1(activity, 52.0f);
        mi1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        mi1Var3.e.setScaleX(0.0f);
        mi1Var3.e.setScaleY(0.0f);
        mi1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mi1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        mi1Var3.f.setScaleX(0.0f);
        mi1Var3.f.setScaleY(0.0f);
        mi1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        mi1Var3.h.setScaleX(0.0f);
        mi1Var3.h.setScaleY(0.0f);
        mi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mi1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        mi1Var3.n.setScaleX(0.0f);
        mi1Var3.n.setScaleY(0.0f);
        mi1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mi1Var3.j0.addView(mi1Var3.e);
        mi1Var3.j0.addView(mi1Var3.f);
        mi1Var3.j0.addView(mi1Var3.h);
        mi1Var3.j0.addView(mi1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        mi1Var3.e0 = eVar;
        eVar.setListener(new ki1(mi1Var3));
        mi1Var3.e0.setScaleX(1.15f);
        mi1Var3.e0.setScaleY(1.15f);
        hi1Var.addView(mi1Var3.j0, w7.x5.e(-1, -2, 80));
        float f7 = AndroidUtilities.isTablet() ? 100 : 27;
        hi1Var.addView(mi1Var3.e0, w7.x5.d(-1, 186.0f, 80, f7, 0.0f, f7, 0.0f));
        ImageView imageView = new ImageView(activity);
        mi1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
        mi1Var3.I.setImageResource(R.drawable.msg_addcontact);
        mi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        hi1Var.addView(mi1Var3.I, w7.x5.e(56, 56, 53));
        w7.z5.a(mi1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        mi1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
        mi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        mi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        mi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
        hi1Var.addView(mi1Var3.H, w7.x5.e(56, 56, 51));
        w7.z5.a(mi1Var3.H);
        hg.l lVar = new hg.l(activity, 5);
        mi1Var3.K = lVar;
        lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        mi1Var3.K.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(-1, 76), 1, -1));
        mi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        hi1Var.addView(mi1Var3.K, w7.x5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        mi1Var3.K.setAlpha(0.0f);
        mi1Var3.K.setOnClickListener(new xh1(mi1Var3, 5));
        int i21 = 6;
        mi1Var3.H.setOnClickListener(new xh1(mi1Var3, i21));
        mi1Var3.I.setOnClickListener(new py0(10, mi1Var3, activity));
        if (mi1Var3.u0.b) {
            mi1Var3.H.setVisibility(8);
            mi1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.h2 h2Var = new org.telegram.ui.Components.voip.h2(activity);
        h2Var.a = new HashMap();
        h2Var.b = new ArrayList();
        h2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        h2Var.r = textPaint;
        h2Var.setOrientation(1);
        h2Var.n = q1Var;
        TransitionSet transitionSet = new TransitionSet();
        h2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        mi1Var3.M0 = h2Var;
        h2Var.setGravity(80);
        mi1Var3.M0.setOnViewsUpdated(new wh1(mi1Var3, 5));
        hi1Var.addView(mi1Var3.M0, w7.x5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, q1Var, true);
        d3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d3Var.K = alignment;
        d3Var.d = -1L;
        d3Var.l0 = new wh1(mi1Var3, i21);
        d3Var.T = true;
        d3Var.h = AndroidUtilities.dp(320.0f);
        d3Var.e = true;
        d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        d3Var.q(8.0f);
        mi1Var3.N0 = d3Var;
        d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        hi1Var.addView(mi1Var3.N0, w7.x5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, q1Var, false);
        d3Var2.p(true);
        d3Var2.K = alignment;
        d3Var2.d = 4000L;
        d3Var2.T = true;
        d3Var2.h = AndroidUtilities.dp(320.0f);
        d3Var2.e = true;
        d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        d3Var2.q(8.0f);
        mi1Var3.O0 = d3Var2;
        d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        hi1Var.addView(mi1Var3.O0, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        mi1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!mi1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                mi1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            mi1Var3.o();
        }
        ei1Var2.addView(hi1Var);
        if (z10) {
            mi1Var3.F0 = 0.0f;
            mi1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                mi1Var3.c0.setStub(org.telegram.ui.Components.voip.m2.k().r);
                mi1Var3.d0.setStub(org.telegram.ui.Components.voip.m2.k().n);
            }
            mi1Var3.u0.setAlpha(0.0f);
            mi1Var3.H();
            mi1Var3.E0 = true;
            org.telegram.ui.Components.voip.m2.T = true;
            if (org.telegram.ui.Components.voip.m2.V != null) {
                org.telegram.ui.Components.voip.m2.U.getClass();
                throw null;
            }
            mi1Var3.L0.lock();
            AndroidUtilities.runOnUIThread(new wh1(mi1Var3, 11), 32L);
        } else {
            mi1Var3.F0 = 1.0f;
            mi1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
            mi1 mi1Var4 = n1;
            pf.d dVar = new pf.d(activity, mi1Var4);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.s2 s2Var3 = mi1Var4.c0;
            dVar.j = s2Var3.d;
            dVar.k = s2Var3.getPlaceholderView();
            mi1Var4.g0 = dVar.a();
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        s11 s11Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
                translationY.setInterpolator(rrVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(rrVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(s11Var);
                this.P0.setDuration(150L).setInterpolator(rrVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f;
            duration.setInterpolator(rrVar2).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar2).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar2).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(rrVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(rrVar2).start();
            this.j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(rrVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(s11Var);
            this.P0.setDuration(150L).setInterpolator(rrVar2);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.x0 = z10;
        ei1 ei1Var = this.u0;
        if (z10) {
            ei1Var.setSystemUiVisibility(ei1Var.getSystemUiVisibility() & (-5));
        } else {
            ei1Var.setSystemUiVisibility(ei1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.rr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            wh1 wh1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(wh1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                AndroidUtilities.runOnUIThread(wh1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
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
                H();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                fi1 fi1Var = new fi1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = fi1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    fi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
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
            Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
            transitionSet.addTransition(duration.setInterpolator(rrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(rrVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.v2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
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
                    u(this.e, sharedInstance);
                    this.K.animate().alpha(0.0f).start();
                } else {
                    s(this.e, sharedInstance);
                    if (this.x0) {
                        this.K.animate().alpha(1.0f).start();
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
            if (n1 == null) {
                return;
            }
            if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                u(this.e, sharedInstance);
                this.K.setTag(null);
                this.K.animate().alpha(0.0f).start();
            } else {
                s(this.e, sharedInstance);
                if (this.x0) {
                    this.K.setTag(1);
                    this.K.animate().alpha(1.0f).start();
                }
            }
            v(this.f, sharedInstance, false);
            t(this.h, sharedInstance, z10);
            this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
            this.n.setOnClickListener(new xh1(this, 0));
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
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.w9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.w9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.q5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.w9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r62;
        Drawable[] drawableArr;
        boolean z11;
        ai.l4 l4Var;
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
                    org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.z5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (z5VarArr == null ? 0 : z5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new t3(this, 27));
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
                        if ((drawable instanceof org.telegram.ui.Components.q5) && ((org.telegram.ui.Components.q5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.q5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(21, i12, document);
                            drawableArr[i11] = q5Var;
                            r52 = q5Var;
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
                if ((drawable2 instanceof org.telegram.ui.Components.q5) && (l4Var = ((org.telegram.ui.Components.q5) drawable2).k) != null) {
                    Drawable thumb = l4Var.getThumb();
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
                        org.telegram.messenger.ul.r(r62[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.rr.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new wh1(this, 9), 1000L);
        }
    }

    public final void F() {
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

    public final void G() {
        this.k0.setColor(i0.a.k(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        hi1 hi1Var = this.s;
        if (hi1Var != null) {
            hi1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0911 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0bb2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bc2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d1c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int childsHight;
        org.telegram.ui.Components.voip.u1 u1Var;
        org.telegram.ui.Components.voip.u1 u1Var2;
        boolean z14;
        boolean z15;
        org.telegram.ui.Components.voip.s2 s2Var;
        VideoSink videoSink;
        int i13;
        boolean z16;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j3;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        TL_phone.PhoneCall phoneCall2;
        float f11;
        boolean z17;
        boolean z18;
        TextView textView;
        boolean z19 = true;
        if (this.G0 || this.E0) {
            return;
        }
        int i14 = 0;
        boolean z20 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user = this.d;
        if (i15 == 1 || i15 == 2) {
            num = 1;
            this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    num = 1;
                    this.F.b(LocaleController.getString(R.string.VoipFailed), false, z20);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new wh1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            x3Var.R = LocaleController.getString(R.string.VoipFailed);
                            x3Var.T = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            uh1 uh1Var = new uh1(this, 2);
                            x3Var.n0 = string;
                            x3Var.o0 = uh1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            kv0 kv0Var = new kv0(19, this, zArr);
                            x3Var.l0 = string2;
                            x3Var.m0 = kv0Var;
                            x3Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) x3Var.d(-(i16 + 1))) != null) {
                                    textView.setTextColor(x3Var.e(org.telegram.ui.ActionBar.h6.q7));
                                }
                            }
                            x3Var.setCanceledOnTouchOutside(true);
                            x3Var.setOnDismissListener(new ei.e0(this, zArr, 12));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.e5.l0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new wh1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z21 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z21 || this.G0) {
                                num = 1;
                                AndroidUtilities.runOnUIThread(new wh1(this, 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i17 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i17 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.U.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.U.setTranslationY(iArr[1]);
                                    this.U.setAlpha(1.0f);
                                    this.U.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new hb1(15, this, sharedInstance), 2L);
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
                                    this.U.a(new vh1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(0);
                                org.telegram.ui.Components.voip.o1 o1Var = this.Q;
                                uh1 uh1Var2 = new uh1(this, 1 == true ? 1 : 0);
                                org.telegram.ui.Components.voip.n1[] n1VarArr = o1Var.c;
                                o1Var.d = uh1Var2;
                                org.telegram.ui.Components.voip.l1 l1Var = o1Var.a;
                                l1Var.setVisibility(0);
                                o1Var.b.setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l1Var, (Property<org.telegram.ui.Components.voip.l1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(l1Var, (Property<org.telegram.ui.Components.voip.l1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l1Var, (Property<org.telegram.ui.Components.voip.l1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(l1Var, (Property<org.telegram.ui.Components.voip.l1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f));
                                animatorSet.setInterpolator(org.telegram.ui.Components.rr.f);
                                Integer num2 = 1;
                                animatorSet.setDuration(250L);
                                int i18 = 0;
                                while (i18 < n1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    n1VarArr[i18].setAlpha(0.0f);
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(n1VarArr[i18], (Property<org.telegram.ui.Components.voip.n1, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(n1VarArr[i18], (Property<org.telegram.ui.Components.voip.n1, Float>) property2, 0.3f, 1.0f), ObjectAnimator.ofFloat(n1VarArr[i18], (Property<org.telegram.ui.Components.voip.n1, Float>) property3, 0.3f, 1.0f), ObjectAnimator.ofFloat(n1VarArr[i18], (Property<org.telegram.ui.Components.voip.n1, Float>) property4, AndroidUtilities.dp(30.0f), 0.0f));
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i18 * 16);
                                    animatorSet2.start();
                                    i18++;
                                    property4 = property4;
                                    num2 = num2;
                                }
                                num = num2;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
                                    duration.setInterpolator(rrVar).setListener(new org.telegram.ui.Components.ca(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(rrVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new org.telegram.ui.Components.ca(this.O)).setDuration(250L).setInterpolator(rrVar).start();
                                }
                                for (org.telegram.ui.Components.w9 w9Var : this.V) {
                                    w9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.rr.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new di1(this)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f;
                                org.telegram.messenger.ul.r(alpha, rrVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.t2 t2Var = this.F.d;
                                t2Var.n = true;
                                t2Var.invalidate();
                                org.telegram.ui.Components.voip.t0 t0Var = this.y;
                                t0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = t0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                t0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Components.voip.t0, Float>) View.ALPHA, t0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Components.voip.t0, Float>) View.TRANSLATION_Y, t0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Components.voip.t0, Float>) View.SCALE_X, t0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(t0Var, (Property<org.telegram.ui.Components.voip.t0, Float>) View.SCALE_Y, t0Var.getScaleY(), 0.9f, 1.0f));
                                t0Var.c.setInterpolator(rrVar2);
                                t0Var.c.setDuration(300L);
                                t0Var.c.setStartDelay(250L);
                                t0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                fi1 fi1Var = this.o0;
                                if (fi1Var != null) {
                                    fi1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z20);
                            }
                            num = 1;
                            break;
                        case 13:
                            this.F.b(LocaleController.getString(R.string.VoipWaiting), true, z20);
                            num = 1;
                            break;
                        case 14:
                            this.F.b(LocaleController.getString(R.string.VoipRequesting), true, z20);
                            num = 1;
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z20);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(LocaleController.getString(R.string.VoipInCallBranding), false, z20);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z20);
                                this.e0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            num = 1;
                            z10 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(LocaleController.getString(R.string.VoipRinging), true, z20);
                            }
                            num = 1;
                            break;
                        case 17:
                            this.F.b(LocaleController.getString(R.string.VoipBusy), false, z20);
                            this.e0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            num = 1;
                            z10 = false;
                            break;
                        default:
                            num = 1;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z22 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z17 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z18 = false;
                                this.n0 = z18;
                                if (z18 && !this.U0) {
                                    this.U0 = z17;
                                }
                            }
                        } else {
                            z17 = true;
                        }
                        z18 = true;
                        this.n0 = z18;
                        if (z18) {
                            this.U0 = z17;
                        }
                    }
                    if (z20) {
                        this.Y.b();
                        this.Z.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z20) {
                            this.c0.animate().alpha(f11).setDuration(250L).start();
                        } else {
                            this.c0.animate().cancel();
                            this.c0.setAlpha(f11);
                        }
                        if (!this.c0.d.isFirstFrameRendered() && !this.I0) {
                            i10 = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z20) {
                                    this.c0.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    this.c0.animate().cancel();
                                    this.c0.setAlpha(0.0f);
                                }
                            }
                            z11 = this.n0;
                            if (z11 || !this.m0) {
                                this.H0 = false;
                            }
                            z12 = (z11 || !this.H0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            x(z20, z22);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z20) {
                                this.e0.setVisibility(z19 ? 0 : 8);
                            } else {
                                if (z19 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z19 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.e0.animate().setListener(new ai1(this, i11)).alpha(0.0f);
                                    this.e0.setEnabled(z19);
                                    this.e0.setTag(z19 ? num : null);
                                    this.u0.setLockOnScreen(this.J0);
                                    z13 = this.p0 != 3 && (this.n0 || this.m0);
                                    this.z0 = z13;
                                    if (!z13 && !this.x0) {
                                        A(true);
                                    }
                                    if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                        AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                        this.R0 = true;
                                    }
                                    int i19 = this.p0;
                                    boolean z23 = i19 == 11 && this.x0;
                                    boolean z24 = (!z19 || i19 == 16 || i19 == 11 || i19 == 12 || i19 == 14 || i19 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z20) {
                                        if (z23) {
                                            this.H.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.H.getVisibility() != 0) {
                                                this.H.setVisibility(0);
                                                f7 = 0.0f;
                                                this.H.setAlpha(0.0f);
                                            } else {
                                                f7 = 0.0f;
                                            }
                                            this.H.animate().alpha(f7).start();
                                        }
                                        if (z24) {
                                            this.I.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.I.getVisibility() != 0) {
                                                this.I.setVisibility(0);
                                                f10 = 0.0f;
                                                this.I.setAlpha(0.0f);
                                            } else {
                                                f10 = 0.0f;
                                            }
                                            this.I.animate().alpha(f10).start();
                                        }
                                        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                    } else {
                                        ImageView imageView = this.H;
                                        if (z23) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.H.setAlpha(z23 ? 1.0f : 0.0f);
                                        this.I.setVisibility(z24 ? 0 : 8);
                                        this.I.setAlpha(z24 ? 1.0f : 0.0f);
                                        this.M0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.p0;
                                    if (i12 != 10 && i12 != 11) {
                                        D(z20);
                                    }
                                    if (i14 != 0) {
                                        this.F.e(z20);
                                    }
                                    this.F.d(z10, z20);
                                    if (this.y.getVisibility() == 0 && this.C0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.T.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = hg.c.g(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.p0 == 11 && !this.n0 && !this.m0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.n0 || this.m0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z20) {
                                        if (this.C0 && (this.n0 || this.m0)) {
                                            this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                            j3 = 250;
                                        } else {
                                            j3 = 250;
                                            this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                        }
                                        if (dp2 != this.v0) {
                                            ViewPropertyAnimator animate = this.X.animate();
                                            if (this.p0 != 11) {
                                                j3 = 0;
                                            }
                                            animate.setStartDelay(j3).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                        }
                                    } else {
                                        this.X.setTranslationY(dp2);
                                    }
                                    this.v0 = dp2;
                                    boolean z25 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i20 = this.p0;
                                    this.D0 = i20 == 11 && i20 != 17 && ((this.n0 && !z25) || this.m0);
                                    if (sharedInstance != null) {
                                        if (this.n0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.d0.setIsScreencast(sharedInstance.isScreencast());
                                        this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                        if (!this.m1 || (s2Var = this.k1) == null) {
                                            if (z12) {
                                                videoSink = this.b0;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z20) {
                                                    org.telegram.ui.Components.voip.h2 h2Var = this.M0;
                                                    h2Var.f = false;
                                                    if (!h2Var.e && h2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(h2Var, h2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.M0.c("self-muted");
                                                } else {
                                                    this.M0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.n0 || this.m0) && (((i13 = this.p0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.h2 h2Var2 = this.M0;
                                                        h2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, h2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.h2 h2Var3 = this.M0;
                                                        h2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, h2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.h2 h2Var4 = this.M0;
                                                        h2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, h2Var4.b(UserObject.getFirstName(user))), "muted");
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
                                                        z16 = true;
                                                        if (z20) {
                                                            org.telegram.ui.Components.voip.h2 h2Var5 = this.M0;
                                                            if (h2Var5.f) {
                                                                h2Var5.e = z16;
                                                                AndroidUtilities.runOnUIThread(new i2.h0(h2Var5, 22), 700L);
                                                            }
                                                            h2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.M0.getChildCount() != 0) {
                                                    z16 = true;
                                                    this.N0.e(true);
                                                    if (z20) {
                                                    }
                                                }
                                                z16 = true;
                                                if (z20) {
                                                }
                                            } else {
                                                s2Var = this.c0;
                                            }
                                        }
                                        videoSink = s2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z20) {
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
                                        z16 = true;
                                        if (z20) {
                                        }
                                    }
                                    childsHight = this.M0.getChildsHight();
                                    u1Var = this.Z;
                                    if (u1Var.getParent() == null && z20) {
                                        u1Var.T = childsHight;
                                    } else {
                                        u1Var.T = childsHight;
                                    }
                                    u1Var2 = this.Y;
                                    if (u1Var2.getParent() == null && z20) {
                                        u1Var2.T = childsHight;
                                    } else {
                                        u1Var2.T = childsHight;
                                    }
                                    this.Y.setUiVisible(this.x0);
                                    this.Z.setUiVisible(this.x0);
                                    if (!this.n0) {
                                        z14 = true;
                                        z(0, z20);
                                    } else if (!this.m0 || this.H0) {
                                        z14 = true;
                                        z(1, z20);
                                    } else {
                                        z(2, z20);
                                        z14 = true;
                                    }
                                    if (!z12 && this.Z.getTag() == null) {
                                        this.Z.setIsActive(z14);
                                        if (this.Z.getVisibility() != 0) {
                                            this.Z.setVisibility(0);
                                            this.Z.setAlpha(0.0f);
                                            this.Z.setScaleX(0.5f);
                                            this.Z.setScaleY(0.5f);
                                        }
                                        this.Z.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.u1 u1Var3 = this.Z;
                                        u1Var3.c0 = true;
                                        u1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).setStartDelay(150L).withEndAction(new wh1(this, 4)).start();
                                        this.Z.setTag(num);
                                    } else if (!z12 && this.Z.getTag() != null) {
                                        this.Z.setIsActive(false);
                                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ai1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                        this.Z.setTag(null);
                                    }
                                    this.Y.a();
                                    this.Z.a();
                                    F();
                                    if (this.p0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i21 = this.v.V;
                                        if (i21 != 2 && i21 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.q0 != -1);
                                            z15 = !this.n0 || this.m0;
                                            this.x.setState(z15);
                                            this.w.setState(z15);
                                            this.r.e(z15);
                                            if (this.m0 && !z22 && this.f0) {
                                                this.f0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z15) {
                                                if (this.i0.getVisibility() != 4) {
                                                    this.i0.setVisibility(4);
                                                    this.h0.setVisibility(4);
                                                }
                                            } else if (this.i0.getVisibility() != 0) {
                                                this.i0.setVisibility(0);
                                                this.h0.setVisibility(0);
                                            }
                                            wh1 wh1Var = this.T0;
                                            AndroidUtilities.cancelRunOnUIThread(wh1Var);
                                            if (this.p0 != 3) {
                                                AndroidUtilities.runOnUIThread(wh1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.n0) {
                                    }
                                    this.x.setState(z15);
                                    this.w.setState(z15);
                                    this.r.e(z15);
                                    if (this.m0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z15) {
                                    }
                                    wh1 wh1Var2 = this.T0;
                                    AndroidUtilities.cancelRunOnUIThread(wh1Var2);
                                    if (this.p0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.e0.setEnabled(z19);
                            this.e0.setTag(z19 ? num : null);
                            this.u0.setLockOnScreen(this.J0);
                            if (this.p0 != 3) {
                            }
                            this.z0 = z13;
                            if (!z13) {
                                A(true);
                            }
                            if (this.x0) {
                                AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i192 = this.p0;
                            if (i192 == 11) {
                            }
                            if (!z19) {
                            }
                            if (z20) {
                            }
                            i12 = this.p0;
                            if (i12 != 10) {
                                D(z20);
                            }
                            if (i14 != 0) {
                            }
                            this.F.d(z10, z20);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null) {
                                    dp2 = hg.c.g(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.p0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.n0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z20) {
                            }
                            this.v0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i202 = this.p0;
                            this.D0 = i202 == 11 && i202 != 17 && ((this.n0 && !z25) || this.m0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.M0.getChildsHight();
                            u1Var = this.Z;
                            if (u1Var.getParent() == null) {
                            }
                            u1Var.T = childsHight;
                            u1Var2 = this.Y;
                            if (u1Var2.getParent() == null) {
                            }
                            u1Var2.T = childsHight;
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (!this.n0) {
                            }
                            if (!z12) {
                            }
                            if (!z12) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ai1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            F();
                            if (this.p0 == 3) {
                            }
                            if (this.n0) {
                            }
                            this.x.setState(z15);
                            this.w.setState(z15);
                            this.r.e(z15);
                            if (this.m0) {
                            }
                            if (z15) {
                            }
                            wh1 wh1Var22 = this.T0;
                            AndroidUtilities.cancelRunOnUIThread(wh1Var22);
                            if (this.p0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.n0) {
                    }
                    this.v.setVisibility(4);
                    z11 = this.n0;
                    if (z11) {
                    }
                    this.H0 = false;
                    if (z11) {
                    }
                    x(z20, z22);
                    if (this.y.getTag() != null) {
                    }
                    if (z20) {
                    }
                    i11 = 8;
                    this.e0.setEnabled(z19);
                    this.e0.setTag(z19 ? num : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z13;
                    if (!z13) {
                    }
                    if (this.x0) {
                    }
                    int i1922 = this.p0;
                    if (i1922 == 11) {
                    }
                    if (!z19) {
                    }
                    if (z20) {
                    }
                    i12 = this.p0;
                    if (i12 != 10) {
                    }
                    if (i14 != 0) {
                    }
                    this.F.d(z10, z20);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.p0 == 11) {
                    }
                    if (!this.n0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z20) {
                    }
                    this.v0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2022 = this.p0;
                    this.D0 = i2022 == 11 && i2022 != 17 && ((this.n0 && !z25) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    u1Var = this.Z;
                    if (u1Var.getParent() == null) {
                    }
                    u1Var.T = childsHight;
                    u1Var2 = this.Y;
                    if (u1Var2.getParent() == null) {
                    }
                    u1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (!this.n0) {
                    }
                    if (!z12) {
                    }
                    if (!z12) {
                    }
                    this.Y.a();
                    this.Z.a();
                    F();
                    if (this.p0 == 3) {
                    }
                    if (this.n0) {
                    }
                    this.x.setState(z15);
                    this.w.setState(z15);
                    this.r.e(z15);
                    if (this.m0) {
                    }
                    if (z15) {
                    }
                    wh1 wh1Var222 = this.T0;
                    AndroidUtilities.cancelRunOnUIThread(wh1Var222);
                    if (this.p0 != 3) {
                    }
                }
            }
            num = 1;
            E(z20);
            if (this.p0 == 5) {
                boolean z26 = this.s0;
                if (!z26 && this.q0 != 5) {
                    this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z20);
                }
                z10 = z26;
                z19 = false;
                i14 = 0;
                if (this.o0 == null) {
                }
            } else {
                i14 = 1;
                this.s0 = true;
                z19 = false;
                z10 = false;
                if (this.o0 == null) {
                }
            }
        }
        z19 = false;
        z10 = false;
        i14 = 0;
        if (this.o0 == null) {
        }
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.s2 s2Var = this.c0;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        this.m1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        this.u0.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        ei1 ei1Var = this.u0;
        ei1Var.getClass();
        windowManager.addView(ei1Var, org.telegram.ui.Components.voip.w2.a());
        this.m1 = false;
        H();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.s2 s2Var = this.k1;
        if (s2Var != null) {
            s2Var.d.release();
            this.k1 = null;
        }
    }

    @Override // rf.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.s2 s2Var = this.k1;
        if (s2Var == null || !s2Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    @Override // rf.a
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
            o();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
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

    @Override // rf.a
    public final Bitmap e() {
        org.telegram.ui.Components.voip.s2 s2Var = this.c0;
        if (s2Var == null || !s2Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(this.b, false, true, false, false);
        this.k1 = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.s2 s2Var2 = this.k1;
        s2Var2.a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new gi1(this));
        View view = this.k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.k1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        this.Y.animate().cancel();
        float f13 = org.telegram.ui.Components.voip.m2.k().d.x + org.telegram.ui.Components.voip.m2.k().y;
        float f14 = org.telegram.ui.Components.voip.m2.k().d.y + org.telegram.ui.Components.voip.m2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.m2.U.getClass();
        final float measuredWidth = f13 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f14 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f15 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (!this.n0 || measuredWidth2 == 0) {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f11 = 1.0f;
                f12 = 0.0f;
            } else {
                f12 = (this.u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f11 = (((org.telegram.ui.Components.voip.m2.k().f * 0.25f) + (f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.m2.k().h * 0.25f) + (f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f16 = f12;
            f7 = f11;
            f10 = f16;
        } else {
            c10 = 0;
            float measuredWidth3 = f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f17 = measuredHeight;
        float dp = this.m0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.m2.U.getClass();
            f15 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f17);
                this.Y.setCornerRadius(dp2);
                this.Y.setAlpha(f15);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth);
            this.c0.setTranslationY(measuredHeight2);
            this.c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f18 = z10 ? 1.0f : 0.0f;
        float f19 = z10 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c10] = f18;
        fArr[1] = f19;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : 1.0f;
        G();
        final float f20 = dp;
        final float f21 = 0.25f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.zh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f22 = 1.0f - floatValue;
                mi1 mi1Var = mi1.this;
                mi1Var.F0 = f22;
                mi1Var.G();
                if (z11) {
                    float f23 = (f10 * floatValue) + (scaleX * f22);
                    mi1Var.Y.setScaleX(f23);
                    mi1Var.Y.setScaleY(f23);
                    mi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f22));
                    mi1Var.Y.setTranslationY((f17 * floatValue) + (y3 * f22));
                    mi1Var.Y.setCornerRadius((dp2 * floatValue) + (f20 * f22));
                    mi1Var.Y.setAlpha((f15 * floatValue) + (1.0f * f22));
                }
                float f24 = (f21 * floatValue) + (1.0f * f22);
                mi1Var.c0.setScaleX(f24);
                mi1Var.c0.setScaleY(f24);
                float f25 = 0.0f * f22;
                float f26 = (measuredWidth * floatValue) + f25;
                float f27 = (measuredHeight2 * floatValue) + f25;
                mi1Var.c0.setTranslationX(f26);
                mi1Var.c0.setTranslationY(f27);
                mi1Var.c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f24);
                if (!mi1Var.Y.P) {
                    mi1Var.d0.d(floatValue, false);
                }
                mi1Var.u0.invalidate();
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
        pf.e eVar = this.g0;
        if (eVar != null) {
            eVar.c();
            this.g0 = null;
        }
        tg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.w;
            int i10 = 1;
            if (z2Var.K && z10 != z2Var.E) {
                z2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                z2Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, i10));
                z2Var.c.setInterpolator(org.telegram.ui.Components.rr.f);
                z2Var.c.setDuration(200L);
                z2Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.rr.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
                org.telegram.messenger.ul.r(translationY, rrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ai1(this, 3)).setInterpolator(rrVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.rr.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.rr rrVar2 = org.telegram.ui.Components.rr.f;
                duration.setInterpolator(rrVar2).setListener(new org.telegram.ui.Components.ca(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(rrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ai1(this, 4)).setDuration(250L).setInterpolator(rrVar2).start();
            }
            this.q0 = this.p0;
            H();
        }
    }

    public final void n() {
        this.u0.b();
    }

    public final void o() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new bi1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ci1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
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
        this.q0 = this.p0;
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i10, int i11) {
        this.q0 = this.p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            pf.e eVar = this.g0;
            if (eVar != null) {
                eVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && sf.c.a(this.b) == 1) {
            pf.d dVar = new pf.d(this.b, n1);
            dVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.s2 s2Var = this.c0;
            dVar.j = s2Var.d;
            dVar.k = s2Var.getPlaceholderView();
            this.g0 = dVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (c3Var = this.v) == null) {
            return;
        }
        int i11 = c3Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(this, i10, 28), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.p0;
        if (i11 != i10) {
            this.q0 = i11;
            this.p0 = i10;
            if (this.u0 != null) {
                H();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z10) {
        this.q0 = this.p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (this.G0 || this.E0) {
            return;
        }
        fi1 fi1Var = this.o0;
        if (fi1Var != null) {
            fi1Var.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Y.setRelativePosition(this.Z);
            this.a0 = false;
            this.q0 = this.p0;
            H();
            return;
        }
        if (this.C0) {
            m(false);
            return;
        }
        if (this.R.getVisibility() != 8) {
            return;
        }
        if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
            this.u0.b();
            return;
        }
        if (sf.c.a(this.b) <= 0) {
            org.telegram.ui.Components.e5.B(this.b, new uh1(this, 0), true).o();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            mi1 mi1Var = n1;
            org.telegram.ui.Components.voip.m2.l(mi1Var.b, mi1Var.a, mi1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.m2.W = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.m2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
        duration.setInterpolator(rrVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(rrVar).start();
        org.telegram.ui.Components.voip.m2.T = true;
        this.E0 = true;
        ValueAnimator k10 = k(false);
        this.L0.lock();
        k10.addListener(new ai1(this, 1));
        k10.setDuration(350L);
        k10.setInterpolator(rrVar);
        k10.start();
    }

    public final void r(Runnable runnable) {
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.yh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                mi1 mi1Var = mi1.this;
                mi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mi1Var.e0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                mi1Var.e0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.qk0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new wh1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.n0) {
            k3Var.d(2, false, false);
            k3Var.setOnBtnClickedListener(null);
            k3Var.setEnabled(false);
        } else {
            k3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                k3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                k3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            k3Var.setOnBtnClickedListener(new b7(this, voIPService, k3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.u1 u1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = u1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var.K, isMicMute ? 1.0f : 0.0f);
            u1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(u1Var.g0);
            u1Var.f0.setDuration(150L);
            u1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = u1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            u1Var.K = isMicMute ? 1.0f : 0.0f;
            u1Var.invalidate();
        }
        k3Var.setOnBtnClickedListener(new uh1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            k3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            k3Var.d(5, true, false);
            i10 = 0;
        } else {
            k3Var.d(5, false, false);
            i10 = 1;
        }
        k3Var.setEnabled(true);
        k3Var.setOnBtnClickedListener(new da(this, i10, k3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            k3Var.d(3, true, false);
            k3Var.setOnClickListener(null);
            k3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            k3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            k3Var.d(3, false, z10);
        } else {
            k3Var.d(3, false, z10);
        }
        k3Var.setOnBtnClickedListener(new uh1(this, 6));
        k3Var.setEnabled(true);
    }

    public final void x(boolean z10, boolean z11) {
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
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.rr.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.rr.f).setListener(new ai1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        x3Var.R = LocaleController.getString(R.string.VoipFailed);
        x3Var.T = charSequence;
        x3Var.l0 = LocaleController.getString(R.string.OK);
        x3Var.m0 = null;
        x3Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) x3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(x3Var.e(org.telegram.ui.ActionBar.h6.q7));
            }
        }
        x3Var.setCanceledOnTouchOutside(true);
        x3Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.u1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.u1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.u1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.u1 u1Var = this.Y;
                if (u1Var.y < 0.0f) {
                    u1Var.d(1.0f, 1.0f);
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
            org.telegram.ui.Components.voip.u1 u1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(u1Var2, (Property<org.telegram.ui.Components.voip.u1, Float>) View.ALPHA, u1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.u1 u1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var3, (Property<org.telegram.ui.Components.voip.u1, Float>) View.SCALE_X, u1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.u1 u1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(u1Var4, (Property<org.telegram.ui.Components.voip.u1, Float>) View.SCALE_Y, u1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new ai1(this, 6));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.rr.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
