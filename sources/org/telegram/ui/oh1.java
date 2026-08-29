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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, cf.a {
    public static oh1 j1;
    public TextView A;
    public boolean A0;
    public org.telegram.ui.Components.voip.r2 B;
    public float B0;
    public nh1 C;
    public boolean C0;
    public ImageView D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public int F;
    public boolean F0;
    public org.telegram.ui.Components.je G;
    public long G0;
    public int H;
    public eg.w2 I;
    public org.telegram.ui.Components.voip.j2 I0;
    public ua1 J;
    public org.telegram.ui.Components.voip.f3 J0;
    public FrameLayout K;
    public org.telegram.ui.Components.voip.f3 K0;
    public org.telegram.ui.Components.voip.p0 L;
    public ValueAnimator L0;
    public org.telegram.ui.Components.voip.m1 M;
    public bg.l0 N;
    public boolean N0;
    public TextView O;
    public jk P;
    public org.telegram.ui.Components.voip.k Q;
    public boolean Q0;
    public float R0;
    public float S0;
    public kh1 T;
    public float T0;
    public org.telegram.ui.Components.voip.t1 U;
    public float U0;
    public org.telegram.ui.Components.voip.t1 V;
    public float V0;
    public boolean W;
    public boolean W0;
    public TextureViewRenderer X;
    public float X0;
    public org.telegram.ui.Components.voip.u2 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u2 Z;
    public int Z0;
    public final int a;
    public org.telegram.ui.Components.voip.e a0;
    public int a1;
    public Activity b;
    public boolean b0;
    public final TLRPC.User c;
    public af.g c0;
    public boolean c1;
    public final TLRPC.User d;
    public View d0;
    public boolean d1;
    public org.telegram.ui.Components.voip.m3 e;
    public View e0;
    public ValueAnimator e1;
    public org.telegram.ui.Components.voip.m3 f;
    public org.telegram.ui.Components.voip.p1 f0;
    public boolean f1;
    public org.telegram.ui.Components.voip.u2 g1;
    public org.telegram.ui.Components.voip.m3 h;
    public c2.p h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public hh1 k0;
    public int l0;
    public int m0;
    public lh1 n;
    public WindowInsets n0;
    public boolean o0;
    public float p0;
    public gh1 q0;
    public int r0;
    public jh1 s;
    public AccessibilityManager s0;
    public org.telegram.ui.Components.voip.e3 v;
    public boolean v0;
    public org.telegram.ui.Components.voip.b3 w;
    public AnimatorSet w0;
    public org.telegram.ui.Components.voip.g3 x;
    public boolean x0;
    public org.telegram.ui.Components.voip.r0 y;
    public boolean y0;
    public boolean z0;
    public final org.telegram.ui.Components.voip.o1 r = new org.telegram.ui.Components.voip.o1();
    public final org.telegram.ui.Components.t9[] R = new org.telegram.ui.Components.t9[4];
    public final Drawable[] S = new Drawable[4];
    public final Paint g0 = new Paint();
    public final Paint h0 = new Paint();
    public boolean t0 = true;
    public float u0 = 1.0f;
    public final AnimationNotificationsLocker H0 = new AnimationNotificationsLocker();
    public final w01 M0 = new w01(this, 20);
    public final yg1 O0 = new yg1(this, 12);
    public final yg1 P0 = new yg1(this, 13);
    public float b1 = 1.0f;

    public oh1(int i10) {
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
        this.m0 = -1;
        this.l0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static /* synthetic */ void i(oh1 oh1Var) {
        AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
        oh1Var.N0 = false;
        if (Build.VERSION.SDK_INT < 23 || oh1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
            oh1Var.C();
        } else {
            oh1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        }
    }

    public static void j(oh1 oh1Var) {
        oh1 oh1Var2;
        int i10 = 0;
        if (oh1Var.c1) {
            oh1Var.c1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            oh1Var.e1 = ofFloat;
            oh1Var2 = oh1Var;
            ofFloat.addUpdateListener(new dg.c(oh1Var2, oh1Var.b1, oh1Var.U0, oh1Var.V0, 2));
            oh1Var2.e1.addListener(new ch1(oh1Var2, i10));
            oh1Var2.e1.setDuration(350L);
            oh1Var2.e1.setInterpolator(org.telegram.ui.Components.jr.f);
            oh1Var2.e1.start();
        } else {
            oh1Var2 = oh1Var;
        }
        oh1Var2.d1 = false;
        oh1Var2.W0 = false;
    }

    public static void q(int i10, int[] iArr) {
        oh1 oh1Var = j1;
        if (oh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    oh1Var.q0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    oh1Var.r(new ef0(9));
                } else if (!oh1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.h2.i(oh1Var.b, new yg1(oh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    oh1Var.q0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    oh1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        oh1 oh1Var = j1;
        if (oh1Var != null && oh1Var.q0.getParent() == null) {
            oh1 oh1Var2 = j1;
            if (oh1Var2 != null) {
                oh1Var2.Y.d.release();
                j1.Z.d.release();
                j1.X.release();
                gh1 gh1Var = j1.q0;
                if (gh1Var != null) {
                    gh1Var.d();
                }
                j1.l();
            }
            j1 = null;
        }
        if (j1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.o2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        oh1 oh1Var3 = new oh1(i10);
        oh1Var3.b = activity;
        j1 = oh1Var3;
        gh1 gh1Var2 = new gh1(activity, !z10, oh1Var3);
        j1.F0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        j1.getClass();
        gh1Var2.setLockOnScreen(j1.F0);
        oh1Var3.q0 = gh1Var2;
        wg1 wg1Var = new wg1(oh1Var3, 4);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(gh1Var2, wg1Var);
        ((WindowManager) activity.getSystemService("window")).addView(gh1Var2, org.telegram.ui.Components.voip.y2.a());
        oh1Var3.p0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        oh1Var3.s0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
        jh1 jh1Var = new jh1(oh1Var3, activity);
        jh1Var.setClipToPadding(false);
        jh1Var.setClipChildren(false);
        jh1Var.setBackgroundColor(-16777216);
        oh1Var3.G();
        oh1Var3.s = jh1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.o1 o1Var = oh1Var3.r;
        oh1Var3.v = new org.telegram.ui.Components.voip.e3(activity, z11, o1Var);
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity, false, true, false, false);
        oh1Var3.Y = u2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        u2Var.d.setScalingType(scalingType);
        oh1Var3.Y.d.setEnableHardwareScaler(true);
        oh1Var3.Y.d.setRotateTextureWithScreen(true);
        oh1Var3.Y.T = 1;
        jh1Var.addView(oh1Var3.v, i7.f6.c(-1.0f, -1));
        TLRPC.User user = oh1Var3.d;
        org.telegram.ui.Components.voip.b3 b3Var = new org.telegram.ui.Components.voip.b3(activity, user, o1Var);
        oh1Var3.w = b3Var;
        jh1Var.addView(b3Var, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.voip.g3 g3Var = new org.telegram.ui.Components.voip.g3(activity);
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
                g3Var.a = new org.telegram.ui.Components.sv0(0);
            }
        }
        oh1Var3.x = g3Var;
        jh1Var.addView(g3Var, i7.f6.c(220.0f, -1));
        jh1Var.addView(oh1Var3.Y);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.s9(orientation, new int[]{-14994098, -14328963}).f(o1.a.F(0.5f, 1), new xb1(oh1Var3, 1), 0L);
        org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
        oh1Var3.U = t1Var;
        t1Var.setDelegate(new wg1(oh1Var3, 3));
        oh1Var3.U.d(1.0f, 1.0f);
        oh1Var3.W = true;
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(activity, true, false);
        oh1Var3.Z = u2Var2;
        u2Var2.d.setIsCamera(true);
        oh1Var3.Z.d.setUseCameraRotation(true);
        oh1Var3.U.setOnTapListener(new zg1(oh1Var3, 1));
        oh1Var3.Z.d.setMirror(true);
        oh1Var3.U.addView(oh1Var3.Z);
        org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
        oh1Var3.V = t1Var2;
        t1Var2.O = true;
        t1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        oh1Var3.X = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        oh1Var3.X.setIsCamera(false);
        oh1Var3.X.setFpsReduction(30.0f);
        oh1Var3.X.setScalingType(scalingType);
        oh1Var3.V.addView(oh1Var3.X, i7.f6.e(-1, -2, 17));
        oh1Var3.V.setOnTapListener(new zg1(oh1Var3, i11));
        oh1Var3.V.setVisibility(8);
        jh1Var.addView(oh1Var3.U, i7.f6.c(-2.0f, -2));
        jh1Var.addView(oh1Var3.V);
        View view = new View(activity);
        oh1Var3.d0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
        jh1Var.addView(oh1Var3.d0, i7.f6.e(-1, 160, 80));
        View view2 = new View(activity);
        oh1Var3.e0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
        jh1Var.addView(oh1Var3.e0, i7.f6.e(-1, 160, 48));
        ua1 ua1Var = new ua1(oh1Var3, activity, 18);
        oh1Var3.J = ua1Var;
        ua1Var.setOrientation(0);
        oh1Var3.J.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        oh1Var3.J.setClipToPadding(false);
        oh1Var3.J.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        oh1Var3.J.setOnClickListener(new zg1(oh1Var3, 3));
        oh1Var3.L = new org.telegram.ui.Components.voip.p0(activity, o1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        oh1Var3.K = frameLayout;
        frameLayout.addView(oh1Var3.L, i7.f6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        oh1Var3.K.setVisibility(8);
        oh1Var3.K.setOnClickListener(new zg1(oh1Var3, 4));
        bg.l0 l0Var = new bg.l0(activity, o1Var);
        oh1Var3.N = l0Var;
        l0Var.setOrientation(1);
        TextView textView = new TextView(activity);
        oh1Var3.O = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        oh1Var3.O.setTextSize(1, 15.0f);
        oh1Var3.O.setTypeface(AndroidUtilities.bold());
        oh1Var3.O.setTextColor(-1);
        oh1Var3.O.setGravity(17);
        jk jkVar = new jk(oh1Var3, activity, 5);
        oh1Var3.P = jkVar;
        jkVar.setTextSize(1, 15.0f);
        oh1Var3.P.setTextColor(-1);
        oh1Var3.P.setGravity(17);
        oh1Var3.P.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), oh1Var3.P.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        oh1Var3.N.setVisibility(8);
        oh1Var3.N.addView(oh1Var3.O);
        oh1Var3.N.addView(oh1Var3.P, i7.f6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        oh1Var3.N.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
            org.telegram.ui.Components.t9[] t9VarArr = oh1Var3.R;
            t9VarArr[i15] = t9Var;
            t9VarArr[i15].getImageReceiver().setAspectFit(true);
            oh1Var3.J.addView(t9VarArr[i15], i7.f6.k(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        kh1 kh1Var = new kh1(oh1Var3, activity);
        oh1Var3.T = kh1Var;
        kh1Var.setOrientation(1);
        oh1Var3.T.setFocusable(true);
        oh1Var3.T.setFocusableInTouchMode(true);
        oh1Var3.y = new org.telegram.ui.Components.voip.r0(activity);
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.r(user);
        org.telegram.ui.Components.voip.r0 r0Var = oh1Var3.y;
        int i16 = oh1Var3.a;
        r0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, e9Var, user);
        oh1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        oh1Var3.A = textView2;
        textView2.setTextSize(1, 28.0f);
        oh1Var3.A.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), oh1Var3.A.getPaint().getFontMetricsInt(), false));
        oh1Var3.A.setMaxLines(2);
        oh1Var3.A.setEllipsize(TextUtils.TruncateAt.END);
        oh1Var3.A.setTextColor(-1);
        oh1Var3.A.setGravity(1);
        oh1Var3.A.setImportantForAccessibility(2);
        oh1Var3.T.addView(oh1Var3.A, i7.f6.t(-2, -2, 1, 8, 0, 8, 6));
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity);
        r2Var.a = new TextView[2];
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            r2Var.a[i17] = new TextView(activity);
            r2Var.a[i17].setTextSize(1, 15.0f);
            r2Var.a[i17].setTextColor(-1);
            r2Var.a[i17].setGravity(1);
            r2Var.addView(r2Var.a[i17]);
            i17++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        r2Var.c = frameLayout2;
        org.telegram.ui.Components.voip.p2 p2Var = new org.telegram.ui.Components.voip.p2(r2Var, activity, o1Var);
        p2Var.setTextSize(1, 15.0f);
        p2Var.setTextColor(-1);
        p2Var.setGravity(1);
        p2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        p2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(p2Var, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        r2Var.addView(frameLayout2, i7.f6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        r2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        r2Var.addView(textView3, i7.f6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new org.telegram.ui.Components.b0(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.v2 v2Var = new org.telegram.ui.Components.voip.v2(activity);
        r2Var.d = v2Var;
        r2Var.addView(v2Var, i7.f6.c(-2.0f, -1));
        oh1Var3.B = r2Var;
        WeakHashMap weakHashMap2 = r0.j0.a;
        r2Var.setImportantForAccessibility(4);
        oh1Var3.T.addView(oh1Var3.B, i7.f6.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            nh1 nh1Var = new nh1(activity);
            oh1Var3.C = nh1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.g9 g9Var = nh1Var.b;
                g9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    g9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                g9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    nh1Var.setVisibility(8);
                } else {
                    nh1Var.c = new org.telegram.ui.Components.zz0(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    nh1Var.setVisibility(0);
                    nh1Var.invalidate();
                }
            } else {
                nh1Var.setVisibility(8);
            }
            oh1Var3.T.addView(oh1Var3.C, i7.f6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        oh1Var3.T.setClipChildren(false);
        oh1Var3.T.setClipToPadding(false);
        oh1Var3.T.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        oh1Var3.Q = new org.telegram.ui.Components.voip.k(activity);
        oh1Var3.M = new org.telegram.ui.Components.voip.m1(activity, o1Var);
        oh1Var3.Q.setAlpha(0.0f);
        oh1Var3.M.setVisibility(8);
        jh1Var.addView(oh1Var3.y, i7.f6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.T, i7.f6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.K, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.N, i7.f6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.J, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.Q, i7.f6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        jh1Var.addView(oh1Var3.M, i7.f6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        oh1Var3.f0 = new org.telegram.ui.Components.voip.p1(activity);
        oh1Var3.e = new org.telegram.ui.Components.voip.m3(activity, o1Var);
        oh1Var3.f = new org.telegram.ui.Components.voip.m3(activity, o1Var);
        oh1Var3.h = new org.telegram.ui.Components.voip.m3(activity, o1Var);
        oh1Var3.n = new lh1(activity, 52.0f);
        oh1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        oh1Var3.e.setScaleX(0.0f);
        oh1Var3.e.setScaleY(0.0f);
        oh1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        oh1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        oh1Var3.f.setScaleX(0.0f);
        oh1Var3.f.setScaleY(0.0f);
        oh1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        oh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        oh1Var3.h.setScaleX(0.0f);
        oh1Var3.h.setScaleY(0.0f);
        oh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        oh1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        oh1Var3.n.setScaleX(0.0f);
        oh1Var3.n.setScaleY(0.0f);
        oh1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        oh1Var3.f0.addView(oh1Var3.e);
        oh1Var3.f0.addView(oh1Var3.f);
        oh1Var3.f0.addView(oh1Var3.h);
        oh1Var3.f0.addView(oh1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        oh1Var3.a0 = eVar;
        eVar.setListener(new mh1(oh1Var3));
        oh1Var3.a0.setScaleX(1.15f);
        oh1Var3.a0.setScaleY(1.15f);
        jh1Var.addView(oh1Var3.f0, i7.f6.e(-1, -2, 80));
        float f9 = AndroidUtilities.isTablet() ? 100 : 27;
        jh1Var.addView(oh1Var3.a0, i7.f6.d(-1, 186.0f, 80, f9, 0.0f, f9, 0.0f));
        ImageView imageView = new ImageView(activity);
        oh1Var3.E = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
        oh1Var3.E.setImageResource(R.drawable.msg_addcontact);
        oh1Var3.E.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jh1Var.addView(oh1Var3.E, i7.f6.e(56, 56, 53));
        i7.h6.a(oh1Var3.E);
        ImageView imageView2 = new ImageView(activity);
        oh1Var3.D = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
        oh1Var3.D.setImageResource(R.drawable.msg_call_minimize_shadow);
        oh1Var3.D.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        oh1Var3.D.setContentDescription(LocaleController.getString(R.string.Back));
        jh1Var.addView(oh1Var3.D, i7.f6.e(56, 56, 51));
        i7.h6.a(oh1Var3.D);
        org.telegram.ui.Components.je jeVar = new org.telegram.ui.Components.je(activity, 4);
        oh1Var3.G = jeVar;
        jeVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        oh1Var3.G.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(-1, 76), 1, -1));
        oh1Var3.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        jh1Var.addView(oh1Var3.G, i7.f6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        oh1Var3.G.setAlpha(0.0f);
        oh1Var3.G.setOnClickListener(new zg1(oh1Var3, 5));
        int i21 = 6;
        oh1Var3.D.setOnClickListener(new zg1(oh1Var3, i21));
        oh1Var3.E.setOnClickListener(new t70(28, oh1Var3, activity));
        if (oh1Var3.q0.b) {
            oh1Var3.D.setVisibility(8);
            oh1Var3.E.setVisibility(8);
        }
        org.telegram.ui.Components.voip.j2 j2Var = new org.telegram.ui.Components.voip.j2(activity);
        j2Var.a = new HashMap();
        j2Var.b = new ArrayList();
        j2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        j2Var.r = textPaint;
        j2Var.setOrientation(1);
        j2Var.n = o1Var;
        TransitionSet transitionSet = new TransitionSet();
        j2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new cg.j0(4).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        oh1Var3.I0 = j2Var;
        j2Var.setGravity(80);
        oh1Var3.I0.setOnViewsUpdated(new yg1(oh1Var3, 5));
        jh1Var.addView(oh1Var3.I0, i7.f6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.f3 f3Var = new org.telegram.ui.Components.voip.f3(activity, 3, o1Var, true);
        f3Var.q(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f3Var.G = alignment;
        f3Var.d = -1L;
        f3Var.h0 = new yg1(oh1Var3, i21);
        f3Var.P = true;
        f3Var.h = AndroidUtilities.dp(320.0f);
        f3Var.e = true;
        f3Var.l(10.0f, 6.0f, 10.0f, 6.0f);
        f3Var.r(8.0f);
        oh1Var3.J0 = f3Var;
        f3Var.t(LocaleController.getString(R.string.TapToTurnCamera));
        jh1Var.addView(oh1Var3.J0, i7.f6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.f3 f3Var2 = new org.telegram.ui.Components.voip.f3(activity, 1, o1Var, false);
        f3Var2.q(true);
        f3Var2.G = alignment;
        f3Var2.d = 4000L;
        f3Var2.P = true;
        f3Var2.h = AndroidUtilities.dp(320.0f);
        f3Var2.e = true;
        f3Var2.l(10.0f, 6.0f, 10.0f, 6.0f);
        f3Var2.r(8.0f);
        oh1Var3.K0 = f3Var2;
        f3Var2.t(LocaleController.getString(R.string.VoipHintEncryptionKey));
        jh1Var.addView(oh1Var3.K0, i7.f6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        oh1Var3.H();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!oh1Var3.Q0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                oh1Var3.Q0 = phoneCall != null && phoneCall.video;
            }
            oh1Var3.o();
        }
        gh1Var2.addView(jh1Var);
        if (z10) {
            oh1Var3.B0 = 0.0f;
            oh1Var3.E0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                oh1Var3.Y.setStub(org.telegram.ui.Components.voip.o2.k().r);
                oh1Var3.Z.setStub(org.telegram.ui.Components.voip.o2.k().n);
            }
            oh1Var3.q0.setAlpha(0.0f);
            oh1Var3.H();
            oh1Var3.A0 = true;
            org.telegram.ui.Components.voip.o2.P = true;
            if (org.telegram.ui.Components.voip.o2.R != null) {
                org.telegram.ui.Components.voip.o2.Q.getClass();
                throw null;
            }
            oh1Var3.H0.lock();
            AndroidUtilities.runOnUIThread(new yg1(oh1Var3, 11), 32L);
        } else {
            oh1Var3.B0 = 1.0f;
            oh1Var3.G();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && df.d.a(activity) == 1) {
            oh1 oh1Var4 = j1;
            af.f fVar = new af.f(activity, oh1Var4);
            fVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.u2 u2Var3 = oh1Var4.Y;
            fVar.j = u2Var3.d;
            fVar.k = u2Var3.getPlaceholderView();
            oh1Var4.c0 = fVar.a();
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        w01 w01Var = this.M0;
        if (z10 || !this.t0) {
            if (z10 && !this.t0) {
                this.J0.e(true);
                this.K0.e(true);
                ViewPropertyAnimator translationY = this.A.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
                translationY.setInterpolator(jrVar).start();
                this.B.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(jrVar).start();
                this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.D.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.E.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.f0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.d0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                this.e0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0, 1.0f);
                this.L0 = ofFloat;
                ofFloat.addUpdateListener(w01Var);
                this.L0.setDuration(150L).setInterpolator(jrVar);
                this.L0.start();
                this.f0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f;
            duration.setInterpolator(jrVar2).start();
            this.D.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar2).start();
            this.E.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar2).start();
            this.J.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar2).start();
            this.A.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jrVar2).start();
            this.B.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jrVar2).start();
            this.f0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jrVar2).start();
            this.d0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
            this.e0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.u0, 0.0f);
            this.L0 = ofFloat2;
            ofFloat2.addUpdateListener(w01Var);
            this.L0.setDuration(150L).setInterpolator(jrVar2);
            this.L0.start();
            AndroidUtilities.cancelRunOnUIThread(this.O0);
            this.N0 = false;
            this.f0.setEnabled(false);
            this.K0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.t0 = z10;
        gh1 gh1Var = this.q0;
        if (z10) {
            gh1Var.setSystemUiVisibility(gh1Var.getSystemUiVisibility() & (-5));
        } else {
            gh1Var.setSystemUiVisibility(gh1Var.getSystemUiVisibility() | 4);
        }
        this.I0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.jr.f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            yg1 yg1Var = this.O0;
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            this.N0 = false;
            if (this.v0 && this.t0) {
                AndroidUtilities.runOnUIThread(yg1Var, 3000L);
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
                hh1 hh1Var = new hh1(this, this.s.getContext(), r0[0], r0[1]);
                this.k0 = hh1Var;
                WindowInsets windowInsets = this.n0;
                if (windowInsets != null) {
                    hh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
            Transition duration = new cg.j0(5).setDuration(250L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
            transitionSet.addTransition(duration.setInterpolator(jrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(jrVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.x2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.m3.class, true);
            TransitionManager.beginDelayedTransition(this.f0, transitionSet);
        }
        int i10 = this.l0;
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
            this.n.setOnClickListener(new zg1(this, 0));
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
            this.n.B = i11;
        }
        F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165  */
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.t9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.t9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.t9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.p5] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.t9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r6;
        Drawable[] drawableArr;
        boolean z11;
        lh.x2 x2Var;
        String[] strArr;
        TLRPC.Document document;
        int i10;
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
        int i11 = 0;
        while (true) {
            r6 = this.R;
            drawableArr = this.S;
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
                    org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.y5.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (y5VarArr == null ? 0 : y5VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new x3(this, 23));
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
                        if ((drawable instanceof org.telegram.ui.Components.p5) && ((org.telegram.ui.Components.p5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.p5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(21, i12, document);
                            drawableArr[i11] = p5Var;
                            r52 = p5Var;
                        }
                        r52.r(strArr[i11]);
                        r6[i11].setAnimatedEmojiDrawable(r52);
                        r6[i11].getImageReceiver().clearImage();
                        emojiDrawable = r52;
                    } else {
                        r6[i11].setImageDrawable(emojiDrawable);
                        emojiDrawable = emojiDrawable;
                    }
                    r6[i11].setVisibility(8);
                }
                strArr = emojifyForCall;
                document = null;
                if (document == null) {
                }
                r6[i11].setVisibility(8);
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
                if ((drawable2 instanceof org.telegram.ui.Components.p5) && (x2Var = ((org.telegram.ui.Components.p5) drawable2).k) != null) {
                    Drawable thumb = x2Var.getThumb();
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
            this.x0 = true;
            for (int i17 = 0; i17 < 4; i17++) {
                if (r6[i17].getVisibility() != 0) {
                    r6[i17].setVisibility(0);
                    if (z10) {
                        r6[i17].setAlpha(0.0f);
                        r6[i17].setScaleX(0.0f);
                        r6[i17].setScaleY(0.0f);
                        b.q(r6[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.jr.k, 250L);
                    }
                }
            }
            this.K0.postDelayed(new yg1(this, 9), 1000L);
        }
    }

    public final void F() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i10 = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        if (this.F != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.G, i10);
        } else {
            this.G.setImageResource(i10);
        }
        this.F = i10;
    }

    public final void G() {
        this.g0.setColor(i0.a.k(-16777216, (int) (this.u0 * 102.0f * this.B0)));
        this.h0.setColor(i0.a.k(-16777216, (int) (127.5f * this.B0)));
        jh1 jh1Var = this.s;
        if (jh1Var != null) {
            jh1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0bc8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0bd8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d36 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d77  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        Integer num;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        int i12;
        int childsHight;
        org.telegram.ui.Components.voip.t1 t1Var;
        org.telegram.ui.Components.voip.t1 t1Var2;
        boolean z15;
        boolean z16;
        org.telegram.ui.Components.voip.u2 u2Var;
        VideoSink videoSink;
        int i13;
        boolean z17;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f9;
        float f10;
        TL_phone.PhoneCall phoneCall2;
        float f11;
        boolean z18;
        boolean z19;
        TextView textView;
        int i14;
        boolean z20 = true;
        z20 = true;
        if (this.C0 || this.A0) {
            return;
        }
        boolean z21 = this.m0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.l0;
        TLRPC.User user = this.d;
        if (i15 == 1 || i15 == 2) {
            num = 1;
            this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z21);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    num = 1;
                    this.B.b(LocaleController.getString(R.string.VoipFailed), false, z21);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new yg1(this, 3), 1000L);
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
                            wg1 wg1Var = new wg1(this, 2);
                            w3Var.j0 = string;
                            w3Var.k0 = wg1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            kl0 kl0Var = new kl0(28, this, zArr);
                            w3Var.h0 = string2;
                            w3Var.i0 = kl0Var;
                            w3Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) w3Var.d(-(i16 + 1))) != null) {
                                    textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.q7));
                                }
                            }
                            w3Var.setCanceledOnTouchOutside(true);
                            w3Var.setOnDismissListener(new eg.g(11, this, zArr));
                        } else {
                            y(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        y(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.c5.l0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        y("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.q0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        y(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new yg1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z22 = sharedInstance != null && sharedInstance.hasRate();
                            this.Z.c();
                            if (!z22 || this.C0) {
                                num = 1;
                                AndroidUtilities.runOnUIThread(new yg1(this, 0), 200L);
                                break;
                            } else {
                                if (this.t0) {
                                    int[] iArr = new int[2];
                                    int i17 = AndroidUtilities.displaySize.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i17 - iArr[0]) - ((this.n.getMeasuredWidth() - AndroidUtilities.dp(52.0f)) / 2)) - AndroidUtilities.dp(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.Q.setTranslationY(iArr[1]);
                                    this.Q.setAlpha(1.0f);
                                    this.Q.setLayoutParams(marginLayoutParams);
                                    this.f0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new t31(24, this, sharedInstance), 2L);
                                    i14 = 0;
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
                                    i14 = 0;
                                    this.Q.a(new xg1(this, sharedInstance, i14), false);
                                }
                                this.M.setVisibility(i14);
                                org.telegram.ui.Components.voip.m1 m1Var = this.M;
                                wg1 wg1Var2 = new wg1(this, true ? 1 : 0);
                                org.telegram.ui.Components.voip.l1[] l1VarArr = m1Var.c;
                                m1Var.d = wg1Var2;
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
                                animatorSet.setInterpolator(org.telegram.ui.Components.jr.f);
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
                                if (this.y0) {
                                    this.y0 = false;
                                    ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
                                    duration.setInterpolator(jrVar).setListener(new org.telegram.ui.Components.z9(this.K)).start();
                                    this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(jrVar).setDuration(250L).start();
                                    this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new org.telegram.ui.Components.z9(this.K)).setDuration(250L).setInterpolator(jrVar).start();
                                }
                                for (org.telegram.ui.Components.t9 t9Var : this.R) {
                                    t9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.jr.f).setDuration(250L).start();
                                }
                                this.A.animate().alpha(0.0f).setDuration(70L).setListener(new fh1(this)).start();
                                ViewPropertyAnimator alpha = this.G.animate().alpha(0.0f);
                                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f;
                                b.q(alpha, jrVar2, 250L);
                                this.G.setVisibility(8);
                                this.B.d(false, true);
                                this.B.c(false);
                                org.telegram.ui.Components.voip.v2 v2Var = this.B.d;
                                v2Var.n = true;
                                v2Var.invalidate();
                                org.telegram.ui.Components.voip.r0 r0Var = this.y;
                                r0Var.setShowWaves(false);
                                AnimatorSet animatorSet3 = r0Var.c;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                r0Var.c = animatorSet4;
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.ALPHA, r0Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.TRANSLATION_Y, r0Var.getTranslationY(), -AndroidUtilities.dp(24.0f)), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_X, r0Var.getScaleX(), 0.9f, 1.0f), ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.SCALE_Y, r0Var.getScaleY(), 0.9f, 1.0f));
                                r0Var.c.setInterpolator(jrVar2);
                                r0Var.c.setDuration(300L);
                                r0Var.c.setStartDelay(250L);
                                r0Var.c.start();
                                D(true);
                                this.n.setVisibility(4);
                                this.V.setAlpha(0.0f);
                                this.V.setVisibility(8);
                                this.U.setAlpha(0.0f);
                                this.U.setVisibility(8);
                                hh1 hh1Var = this.k0;
                                if (hh1Var != null) {
                                    hh1Var.a(false, false);
                                }
                                this.I0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.m0 != 12) {
                                this.B.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z21);
                            }
                            num = 1;
                            break;
                        case 13:
                            this.B.b(LocaleController.getString(R.string.VoipWaiting), true, z21);
                            num = 1;
                            break;
                        case 14:
                            this.B.b(LocaleController.getString(R.string.VoipRequesting), true, z21);
                            num = 1;
                            break;
                        case 15:
                            this.a0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.B.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z21);
                                this.a0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.B.b(LocaleController.getString(R.string.VoipInCallBranding), false, z21);
                                this.a0.setTranslationY(0.0f);
                            } else {
                                this.B.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z21);
                                this.a0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            num = 1;
                            z11 = false;
                            z10 = false;
                            break;
                        case 16:
                            if (this.m0 != 16) {
                                this.B.b(LocaleController.getString(R.string.VoipRinging), true, z21);
                            }
                            num = 1;
                            break;
                        case 17:
                            z10 = false;
                            this.B.b(LocaleController.getString(R.string.VoipBusy), false, z21);
                            this.a0.setRetryMod(true);
                            this.j0 = false;
                            this.i0 = false;
                            num = 1;
                            z11 = false;
                            break;
                        default:
                            num = 1;
                            break;
                    }
                    if (this.k0 == null) {
                        return;
                    }
                    boolean z23 = this.i0 || this.j0;
                    if (sharedInstance != null) {
                        this.i0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z18 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z19 = false;
                                this.j0 = z19;
                                if (z19 && !this.Q0) {
                                    this.Q0 = z18;
                                }
                            }
                        } else {
                            z18 = true;
                        }
                        z19 = true;
                        this.j0 = z19;
                        if (z19) {
                            this.Q0 = z18;
                        }
                    }
                    if (z21) {
                        this.U.b();
                        this.V.b();
                    }
                    if (this.i0) {
                        if (this.A0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 1.0f;
                            this.v.setAlpha(1.0f);
                        }
                        if (z21) {
                            this.Y.animate().alpha(f11).setDuration(250L).start();
                        } else {
                            this.Y.animate().cancel();
                            this.Y.setAlpha(f11);
                        }
                        if (!this.Y.d.isFirstFrameRendered() && !this.E0) {
                            i10 = 0;
                            this.i0 = false;
                            if (!this.j0 || this.i0) {
                                this.v.setVisibility(4);
                            } else {
                                this.v.setVisibility(i10);
                                if (z21) {
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
                            x(z21, z23);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z21) {
                                this.a0.setVisibility(z20 ? 0 : 8);
                            } else {
                                if (z20 && this.a0.getTag() == null) {
                                    this.a0.animate().setListener(null).cancel();
                                    if (this.a0.getVisibility() == 8) {
                                        this.a0.setVisibility(0);
                                        this.a0.setAlpha(0.0f);
                                    }
                                    this.a0.animate().alpha(1.0f);
                                }
                                if (!z20 && this.a0.getTag() != null) {
                                    this.a0.animate().setListener(null).cancel();
                                    i11 = 8;
                                    this.a0.animate().setListener(new ch1(this, i11)).alpha(0.0f);
                                    this.a0.setEnabled(z20);
                                    this.a0.setTag(z20 ? num : null);
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
                                    int i19 = this.l0;
                                    boolean z24 = i19 == 11 && this.t0;
                                    boolean z25 = (!z20 || i19 == 16 || i19 == 11 || i19 == 12 || i19 == 14 || i19 == 6 || !this.t0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z21) {
                                        if (z24) {
                                            this.D.animate().alpha(1.0f).start();
                                        } else {
                                            if (this.D.getVisibility() != 0) {
                                                this.D.setVisibility(0);
                                                f9 = 0.0f;
                                                this.D.setAlpha(0.0f);
                                            } else {
                                                f9 = 0.0f;
                                            }
                                            this.D.animate().alpha(f9).start();
                                        }
                                        if (z25) {
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
                                        this.I0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                    } else {
                                        this.D.setVisibility(z24 ? 0 : 8);
                                        this.D.setAlpha(z24 ? 1.0f : 0.0f);
                                        ImageView imageView = this.E;
                                        if (z25) {
                                            i11 = 0;
                                        }
                                        imageView.setVisibility(i11);
                                        this.E.setAlpha(z25 ? 1.0f : 0.0f);
                                        this.I0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.t0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i12 = this.l0;
                                    if (i12 != 10 && i12 != 11) {
                                        D(z21);
                                    }
                                    if (z10) {
                                        this.B.e(z21);
                                    }
                                    this.B.d(z11, z21);
                                    if (this.y.getVisibility() == 0 && this.y0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.P.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = com.google.android.recaptcha.internal.a.f(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.l0 == 11 && !this.j0 && !this.i0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.j0 || this.i0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z21) {
                                        if (this.y0 && (this.j0 || this.i0)) {
                                            this.T.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                            j10 = 250;
                                        } else {
                                            j10 = 250;
                                            this.T.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                        }
                                        if (dp2 != this.r0) {
                                            this.T.animate().setStartDelay(this.l0 == 11 ? j10 : 0L).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                        }
                                    } else {
                                        this.T.setTranslationY(dp2);
                                    }
                                    this.r0 = dp2;
                                    boolean z26 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i20 = this.l0;
                                    this.z0 = i20 == 11 && i20 != 17 && ((this.j0 && !z26) || this.i0);
                                    if (sharedInstance != null) {
                                        if (this.j0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.Z.setIsScreencast(sharedInstance.isScreencast());
                                        this.Z.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.j0 || sharedInstance.isScreencast()) ? null : this.Z.d;
                                        if (!this.i1 || (u2Var = this.g1) == null) {
                                            if (z13) {
                                                videoSink = this.X;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z21) {
                                                    org.telegram.ui.Components.voip.j2 j2Var = this.I0;
                                                    j2Var.f = false;
                                                    if (!j2Var.e && j2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(j2Var, j2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.I0.c("self-muted");
                                                } else {
                                                    this.I0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.j0 || this.i0) && (((i13 = this.l0) == 3 || i13 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.j2 j2Var2 = this.I0;
                                                        j2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, j2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.I0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.j2 j2Var3 = this.I0;
                                                        j2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, j2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.I0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.j2 j2Var4 = this.I0;
                                                        j2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, j2Var4.b(UserObject.getFirstName(user))), "muted");
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
                                                        z17 = true;
                                                        if (z21) {
                                                            org.telegram.ui.Components.voip.j2 j2Var5 = this.I0;
                                                            if (j2Var5.f) {
                                                                j2Var5.e = z17;
                                                                AndroidUtilities.runOnUIThread(new nh.m6(j2Var5, 18), 700L);
                                                            }
                                                            j2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.I0.getChildCount() != 0) {
                                                    z17 = true;
                                                    this.J0.e(true);
                                                    if (z21) {
                                                    }
                                                }
                                                z17 = true;
                                                if (z21) {
                                                }
                                            } else {
                                                u2Var = this.Y;
                                            }
                                        }
                                        videoSink = u2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z21) {
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
                                        z17 = true;
                                        if (z21) {
                                        }
                                    }
                                    childsHight = this.I0.getChildsHight();
                                    t1Var = this.V;
                                    if (t1Var.getParent() == null && z21) {
                                        t1Var.P = childsHight;
                                    } else {
                                        t1Var.P = childsHight;
                                    }
                                    t1Var2 = this.U;
                                    if (t1Var2.getParent() == null && z21) {
                                        t1Var2.P = childsHight;
                                    } else {
                                        t1Var2.P = childsHight;
                                    }
                                    this.U.setUiVisible(this.t0);
                                    this.V.setUiVisible(this.t0);
                                    if (!this.j0) {
                                        z15 = true;
                                        z(0, z21);
                                    } else if (!this.i0 || this.D0) {
                                        z15 = true;
                                        z(1, z21);
                                    } else {
                                        z(2, z21);
                                        z15 = true;
                                    }
                                    if (!z13 && this.V.getTag() == null) {
                                        this.V.setIsActive(z15);
                                        if (this.V.getVisibility() != 0) {
                                            this.V.setVisibility(0);
                                            this.V.setAlpha(0.0f);
                                            this.V.setScaleX(0.5f);
                                            this.V.setScaleY(0.5f);
                                        }
                                        this.V.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.t1 t1Var3 = this.V;
                                        t1Var3.V = true;
                                        t1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).setStartDelay(150L).withEndAction(new yg1(this, 4)).start();
                                        this.V.setTag(num);
                                    } else if (!z13 && this.V.getTag() != null) {
                                        this.V.setIsActive(false);
                                        this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ch1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                        this.V.setTag(null);
                                    }
                                    this.U.a();
                                    this.V.a();
                                    F();
                                    if (this.l0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i21 = this.v.R;
                                        if (i21 != 2 && i21 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.m0 != -1);
                                            z16 = !this.j0 || this.i0;
                                            this.x.setState(z16);
                                            this.w.setState(z16);
                                            this.r.e(z16);
                                            if (this.i0 && !z23 && this.b0) {
                                                this.b0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z16) {
                                                if (this.e0.getVisibility() != 4) {
                                                    this.e0.setVisibility(4);
                                                    this.d0.setVisibility(4);
                                                }
                                            } else if (this.e0.getVisibility() != 0) {
                                                this.e0.setVisibility(0);
                                                this.d0.setVisibility(0);
                                            }
                                            yg1 yg1Var = this.P0;
                                            AndroidUtilities.cancelRunOnUIThread(yg1Var);
                                            if (this.l0 != 3) {
                                                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (this.j0) {
                                    }
                                    this.x.setState(z16);
                                    this.w.setState(z16);
                                    this.r.e(z16);
                                    if (this.i0) {
                                        this.b0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z16) {
                                    }
                                    yg1 yg1Var2 = this.P0;
                                    AndroidUtilities.cancelRunOnUIThread(yg1Var2);
                                    if (this.l0 != 3) {
                                    }
                                }
                            }
                            i11 = 8;
                            this.a0.setEnabled(z20);
                            this.a0.setTag(z20 ? num : null);
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
                            int i192 = this.l0;
                            if (i192 == 11) {
                            }
                            if (!z20) {
                            }
                            if (z21) {
                            }
                            i12 = this.l0;
                            if (i12 != 10) {
                                D(z21);
                            }
                            if (z10) {
                            }
                            this.B.d(z11, z21);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.P.getLayout();
                                if (layout != null) {
                                    dp2 = com.google.android.recaptcha.internal.a.f(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.l0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.j0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z21) {
                            }
                            this.r0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i202 = this.l0;
                            this.z0 = i202 == 11 && i202 != 17 && ((this.j0 && !z26) || this.i0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.I0.getChildsHight();
                            t1Var = this.V;
                            if (t1Var.getParent() == null) {
                            }
                            t1Var.P = childsHight;
                            t1Var2 = this.U;
                            if (t1Var2.getParent() == null) {
                            }
                            t1Var2.P = childsHight;
                            this.U.setUiVisible(this.t0);
                            this.V.setUiVisible(this.t0);
                            if (!this.j0) {
                            }
                            if (!z13) {
                            }
                            if (!z13) {
                                this.V.setIsActive(false);
                                this.V.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ch1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                                this.V.setTag(null);
                            }
                            this.U.a();
                            this.V.a();
                            F();
                            if (this.l0 == 3) {
                            }
                            if (this.j0) {
                            }
                            this.x.setState(z16);
                            this.w.setState(z16);
                            this.r.e(z16);
                            if (this.i0) {
                            }
                            if (z16) {
                            }
                            yg1 yg1Var22 = this.P0;
                            AndroidUtilities.cancelRunOnUIThread(yg1Var22);
                            if (this.l0 != 3) {
                            }
                        }
                    }
                    i10 = 0;
                    if (this.j0) {
                    }
                    this.v.setVisibility(4);
                    z12 = this.j0;
                    if (z12) {
                    }
                    this.D0 = false;
                    if (z12) {
                    }
                    x(z21, z23);
                    if (this.y.getTag() != null) {
                    }
                    if (z21) {
                    }
                    i11 = 8;
                    this.a0.setEnabled(z20);
                    this.a0.setTag(z20 ? num : null);
                    this.q0.setLockOnScreen(this.F0);
                    if (this.l0 != 3) {
                    }
                    this.v0 = z14;
                    if (!z14) {
                    }
                    if (this.t0) {
                    }
                    int i1922 = this.l0;
                    if (i1922 == 11) {
                    }
                    if (!z20) {
                    }
                    if (z21) {
                    }
                    i12 = this.l0;
                    if (i12 != 10) {
                    }
                    if (z10) {
                    }
                    this.B.d(z11, z21);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.l0 == 11) {
                    }
                    if (!this.j0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z21) {
                    }
                    this.r0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2022 = this.l0;
                    this.z0 = i2022 == 11 && i2022 != 17 && ((this.j0 && !z26) || this.i0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.I0.getChildsHight();
                    t1Var = this.V;
                    if (t1Var.getParent() == null) {
                    }
                    t1Var.P = childsHight;
                    t1Var2 = this.U;
                    if (t1Var2.getParent() == null) {
                    }
                    t1Var2.P = childsHight;
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
                    this.x.setState(z16);
                    this.w.setState(z16);
                    this.r.e(z16);
                    if (this.i0) {
                    }
                    if (z16) {
                    }
                    yg1 yg1Var222 = this.P0;
                    AndroidUtilities.cancelRunOnUIThread(yg1Var222);
                    if (this.l0 != 3) {
                    }
                }
            }
            num = 1;
            E(z21);
            if (this.l0 == 5) {
                boolean z27 = this.o0;
                if (!z27 && this.m0 != 5) {
                    this.B.b(LocaleController.getString(R.string.VoipConnecting), true, z21);
                }
                z11 = z27;
                z20 = false;
                z10 = false;
                if (this.k0 == null) {
                }
            } else {
                this.o0 = true;
                z20 = false;
                z11 = false;
                z10 = true;
                if (this.k0 == null) {
                }
            }
        }
        z20 = false;
        z11 = false;
        z10 = false;
        if (this.k0 == null) {
        }
    }

    @Override // cf.a
    public final void a(c2.p pVar) {
        this.h1 = pVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        gh1 gh1Var = this.q0;
        gh1Var.getClass();
        windowManager.addView(gh1Var, org.telegram.ui.Components.voip.y2.a());
        this.i1 = false;
        H();
        this.q0.invalidate();
        org.telegram.ui.Components.voip.u2 u2Var = this.g1;
        if (u2Var != null) {
            u2Var.d.release();
            this.g1 = null;
        }
    }

    @Override // cf.a
    public final Bitmap b() {
        org.telegram.ui.Components.voip.u2 u2Var = this.g1;
        if (u2Var == null || !u2Var.d.isAvailable()) {
            return null;
        }
        return this.g1.d.getBitmap();
    }

    @Override // cf.a
    public final void c(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override // cf.a
    public final Bitmap d() {
        org.telegram.ui.Components.voip.u2 u2Var = this.Y;
        if (u2Var == null || !u2Var.d.isAvailable()) {
            return null;
        }
        return this.Y.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
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
        if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
            return;
        }
        if (i10 == NotificationCenter.closeInCallActivity) {
            this.q0.b();
            return;
        }
        if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.b0 = booleanValue;
            if (booleanValue) {
                this.y.b(true, true);
            }
        }
    }

    @Override // cf.a
    public final void e(c2.p pVar) {
        this.h1 = pVar;
        org.telegram.ui.Components.voip.u2 u2Var = this.Y;
        if (u2Var != null) {
            u2Var.d.clearFirstFrame();
        }
        this.i1 = true;
        H();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.q0);
        this.q0.invalidate();
    }

    @Override // cf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // cf.a
    public final View h() {
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(this.b, false, true, false, false);
        this.g1 = u2Var;
        u2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.g1.d.setEnableHardwareScaler(true);
        this.g1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.u2 u2Var2 = this.g1;
        u2Var2.T = 1;
        u2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ih1(this));
        View view = this.g1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.g1;
    }

    public final ValueAnimator k(boolean z10) {
        char c3;
        float measuredHeight;
        final float f9;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        this.U.animate().cancel();
        float f13 = org.telegram.ui.Components.voip.o2.k().d.x + org.telegram.ui.Components.voip.o2.k().y;
        float f14 = org.telegram.ui.Components.voip.o2.k().d.y + org.telegram.ui.Components.voip.o2.k().A;
        final float x4 = this.U.getX();
        final float y8 = this.U.getY();
        final float scaleX = this.U.getScaleX();
        org.telegram.ui.Components.voip.o2.Q.getClass();
        final float measuredWidth = f13 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f14 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f15 = 1.0f;
        if (this.i0) {
            int measuredWidth2 = this.U.getMeasuredWidth();
            if (!this.j0 || measuredWidth2 == 0) {
                c3 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f11 = 1.0f;
                f12 = 0.0f;
            } else {
                f12 = (this.q0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c3 = 0;
                f11 = (((org.telegram.ui.Components.voip.o2.k().f * 0.25f) + (f13 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.o2.k().f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.o2.k().h * 0.25f) + (f14 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * f12)) / 2.0f))) - ((org.telegram.ui.Components.voip.o2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            }
            float f16 = f12;
            f9 = f11;
            f10 = f16;
        } else {
            c3 = 0;
            float measuredWidth3 = f13 - ((this.U.getMeasuredWidth() - (this.U.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f14 - ((this.U.getMeasuredHeight() - (this.U.getMeasuredHeight() * 0.25f)) / 2.0f);
            f9 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f17 = measuredHeight;
        float dp = this.i0 ? AndroidUtilities.dp(4.0f) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.i0) {
            org.telegram.ui.Components.voip.o2.Q.getClass();
            f15 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.U.setScaleX(f10);
                this.U.setScaleY(f10);
                this.U.setTranslationX(f9);
                this.U.setTranslationY(f17);
                this.U.setCornerRadius(dp2);
                this.U.setAlpha(f15);
            }
            this.Y.setScaleX(0.25f);
            this.Y.setScaleY(0.25f);
            this.Y.setTranslationX(measuredWidth);
            this.Y.setTranslationY(measuredHeight2);
            this.Y.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        float f18 = z10 ? 1.0f : 0.0f;
        float f19 = z10 ? 0.0f : 1.0f;
        float[] fArr = new float[2];
        fArr[c3] = f18;
        fArr[1] = f19;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.B0 = z10 ? 0.0f : 1.0f;
        G();
        final float f20 = dp;
        final float f21 = 0.25f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f22 = 1.0f - floatValue;
                oh1 oh1Var = oh1.this;
                oh1Var.B0 = f22;
                oh1Var.G();
                if (z11) {
                    float f23 = (f10 * floatValue) + (scaleX * f22);
                    oh1Var.U.setScaleX(f23);
                    oh1Var.U.setScaleY(f23);
                    oh1Var.U.setTranslationX((f9 * floatValue) + (x4 * f22));
                    oh1Var.U.setTranslationY((f17 * floatValue) + (y8 * f22));
                    oh1Var.U.setCornerRadius((dp2 * floatValue) + (f20 * f22));
                    oh1Var.U.setAlpha((f15 * floatValue) + (1.0f * f22));
                }
                float f24 = (f21 * floatValue) + (1.0f * f22);
                oh1Var.Y.setScaleX(f24);
                oh1Var.Y.setScaleY(f24);
                float f25 = 0.0f * f22;
                float f26 = (measuredWidth * floatValue) + f25;
                float f27 = (measuredHeight2 * floatValue) + f25;
                oh1Var.Y.setTranslationX(f26);
                oh1Var.Y.setTranslationY(f27);
                oh1Var.Y.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f24);
                if (!oh1Var.U.L) {
                    oh1Var.Z.d(floatValue, false);
                }
                oh1Var.q0.invalidate();
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
        af.g gVar = this.c0;
        if (gVar != null) {
            gVar.c();
            this.c0 = null;
        }
        eg.w2 w2Var = this.I;
        if (w2Var != null) {
            w2Var.dismiss();
            this.I = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.x0 && this.y0 != z10 && this.t0) {
            this.y0 = z10;
            org.telegram.ui.Components.voip.b3 b3Var = this.w;
            int i10 = 1;
            if (b3Var.G && z10 != b3Var.A) {
                b3Var.A = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                b3Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.a3(b3Var, i10));
                b3Var.c.setInterpolator(org.telegram.ui.Components.jr.f);
                b3Var.c.setDuration(200L);
                b3Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.K0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.O0);
                this.N0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                }
                this.K.animate().setListener(null).cancel();
                this.K.setVisibility(0);
                this.K.setAlpha(0.0f);
                this.K.setScaleX(0.3f);
                this.K.setScaleY(0.3f);
                this.K.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.jr.g).start();
                ViewPropertyAnimator translationY = this.J.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
                b.q(translationY, jrVar, 400L);
                this.N.animate().setListener(null).cancel();
                this.N.setVisibility(0);
                this.N.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.N.setScaleX(0.7f);
                this.N.setScaleY(0.7f);
                this.N.setAlpha(0.0f);
                this.N.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ch1(this, 3)).setInterpolator(jrVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.jr.f).start();
                }
                this.K.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.f;
                duration.setInterpolator(jrVar2).setListener(new org.telegram.ui.Components.z9(this.K)).start();
                this.J.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(jrVar2).setDuration(280L).start();
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ch1(this, 4)).setDuration(250L).setInterpolator(jrVar2).start();
            }
            this.m0 = this.l0;
            H();
        }
    }

    public final void n() {
        this.q0.b();
    }

    public final void o() {
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dh1(this));
        this.Y.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new eh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
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
    public final void onMediaStateUpdated(int i10, int i11) {
        this.m0 = this.l0;
        if (i11 == 2 && !this.Q0) {
            this.Q0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getRemoteVideoState() != 2) {
            af.g gVar = this.c0;
            if (gVar != null) {
                gVar.c();
                this.c0 = null;
            }
        } else if (this.c0 == null && df.d.a(this.b) == 1) {
            af.f fVar = new af.f(this.b, j1);
            fVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.u2 u2Var = this.Y;
            fVar.j = u2Var.d;
            fVar.k = u2Var.getPlaceholderView();
            this.c0 = fVar.a();
        }
        H();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.e3 e3Var;
        if (i10 > 0) {
            this.f1 = true;
        }
        if (this.B == null || (e3Var = this.v) == null) {
            return;
        }
        int i11 = e3Var.R;
        if ((i11 == 2 || i11 == 3) && this.f1) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i8(this, i10, 28), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        int i11 = this.l0;
        if (i11 != i10) {
            this.m0 = i11;
            this.l0 = i10;
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
        hh1 hh1Var = this.k0;
        if (hh1Var != null) {
            hh1Var.a(false, false);
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
        if (df.d.a(this.b) <= 0) {
            org.telegram.ui.Components.c5.B(this.b, new wg1(this, 0), true).o();
            return;
        }
        if (this.C0 || j1 == null) {
            return;
        }
        this.C0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = j1.q0.getMeasuredHeight();
            oh1 oh1Var = j1;
            org.telegram.ui.Components.voip.o2.l(oh1Var.b, oh1Var.a, oh1Var.q0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = j1.n0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.o2.S = windowInsets.getSystemWindowInsetTop();
                j1.n0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.o2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.G.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
        duration.setInterpolator(jrVar).start();
        this.D.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        this.E.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        this.T.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
        this.f0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        this.d0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        this.e0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        this.V.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        this.I0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        org.telegram.ui.Components.voip.o2.P = true;
        this.A0 = true;
        ValueAnimator k9 = k(false);
        this.H0.lock();
        k9.addListener(new ch1(this, 1));
        k9.setDuration(350L);
        k9.setInterpolator(jrVar);
        k9.start();
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ah1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                oh1 oh1Var = oh1.this;
                oh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                oh1Var.a0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                oh1Var.a0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.ok0(18, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new yg1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService) {
        if (!this.j0) {
            m3Var.d(2, false, false);
            m3Var.setOnBtnClickedListener(null);
            m3Var.setEnabled(false);
        } else {
            m3Var.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                m3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
            } else {
                m3Var.d(2, voIPService.isSwitchingCamera(), false);
            }
            m3Var.setOnBtnClickedListener(new z6(this, voIPService, m3Var, 23));
        }
    }

    public final void t(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService, boolean z10) {
        m3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.U;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = t1Var.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.G, isMicMute ? 1.0f : 0.0f);
            t1Var.b0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.c0);
            t1Var.b0.setDuration(150L);
            t1Var.b0.start();
        } else {
            ValueAnimator valueAnimator2 = t1Var.b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            t1Var.G = isMicMute ? 1.0f : 0.0f;
            t1Var.invalidate();
        }
        m3Var.setOnBtnClickedListener(new wg1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            m3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            m3Var.d(5, true, false);
            i10 = 0;
        } else {
            m3Var.d(5, false, false);
            i10 = 1;
        }
        m3Var.setEnabled(true);
        m3Var.setOnBtnClickedListener(new eg.b0(this, i10, m3Var, voIPService, 10));
    }

    public final void v(org.telegram.ui.Components.voip.m3 m3Var, VoIPService voIPService, boolean z10) {
        if (!((this.j0 || this.i0) ? true : voIPService.isVideoAvailable())) {
            m3Var.d(3, true, false);
            m3Var.setOnClickListener(null);
            m3Var.setEnabled(false);
            return;
        }
        if (!this.j0) {
            m3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            m3Var.d(3, false, z10);
        } else {
            m3Var.d(3, false, z10);
        }
        m3Var.setOnBtnClickedListener(new wg1(this, 6));
        m3Var.setEnabled(true);
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
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.jr.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.jr.f).setListener(new ch1(this, 7)).start();
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
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) w3Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(w3Var.e(org.telegram.ui.ActionBar.g6.q7));
            }
        }
        w3Var.setCanceledOnTouchOutside(true);
        w3Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        AnimatorSet animatorSet;
        if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
            this.U.setUiVisible(this.t0);
        }
        if (!z10 && (animatorSet = this.w0) != null) {
            animatorSet.removeAllListeners();
            this.w0.cancel();
        }
        if (i10 != 0) {
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.w0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.U.getTag() == null || ((Integer) this.U.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.t1 t1Var = this.U;
                if (t1Var.y < 0.0f) {
                    t1Var.d(1.0f, 1.0f);
                    this.W = true;
                }
            }
            this.U.c(i10 == 2, z11);
            this.W = i10 != 2;
        } else if (!z10) {
            this.U.setVisibility(8);
        } else if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.w0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.w0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            org.telegram.ui.Components.voip.t1 t1Var2 = this.U;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(t1Var2, (Property<org.telegram.ui.Components.voip.t1, Float>) View.ALPHA, t1Var2.getAlpha(), 0.0f));
            if (this.U.getTag() != null && ((Integer) this.U.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.t1 t1Var3 = this.U;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var3, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_X, t1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.t1 t1Var4 = this.U;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var4, (Property<org.telegram.ui.Components.voip.t1, Float>) View.SCALE_Y, t1Var4.getScaleX(), 0.7f));
            }
            this.w0 = animatorSet5;
            animatorSet5.addListener(new ch1(this, 6));
            this.w0.setDuration(250L).setInterpolator(org.telegram.ui.Components.jr.f);
            this.w0.setStartDelay(50L);
            this.w0.start();
        }
        this.U.setTag(Integer.valueOf(i10));
    }

    @Override // cf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
