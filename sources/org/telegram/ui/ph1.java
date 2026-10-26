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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ph1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, uf.a {
    public static ph1 n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.q2 F;
    public float F0;
    public oh1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public jg.l K;
    public long K0;
    public int L;
    public vg.n1 M;
    public org.telegram.ui.Components.voip.i2 M0;
    public xa1 N;
    public org.telegram.ui.Components.voip.e3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.e3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.p1 Q;
    public fi.l5 R;
    public boolean R0;
    public TextView S;
    public mk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public lh1 X;
    public float X0;
    public org.telegram.ui.Components.voip.v1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.v1 Z;
    public float Z0;
    public final int a;
    public boolean a0;
    public boolean a1;
    public Activity b;
    public TextureViewRenderer b0;
    public float b1;
    public final TLRPC.User c;
    public org.telegram.ui.Components.voip.t2 c0;
    public float c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.t2 d0;
    public int d1;
    public org.telegram.ui.Components.voip.l3 e;
    public org.telegram.ui.Components.voip.e e0;
    public int e1;
    public org.telegram.ui.Components.voip.l3 f;
    public boolean f0;
    public sf.d g0;
    public boolean g1;
    public org.telegram.ui.Components.voip.l3 h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public org.telegram.ui.Components.voip.s1 j0;
    public boolean j1;
    public org.telegram.ui.Components.voip.t2 k1;
    public a8.fg l1;
    public boolean m0;
    public boolean m1;
    public mh1 n;
    public boolean n0;
    public ih1 o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public kh1 s;
    public boolean s0;
    public float t0;
    public hh1 u0;
    public org.telegram.ui.Components.voip.d3 v;
    public int v0;
    public org.telegram.ui.Components.voip.a3 w;
    public AccessibilityManager w0;
    public org.telegram.ui.Components.voip.f3 x;
    public org.telegram.ui.Components.voip.r0 y;
    public boolean z0;
    public final org.telegram.ui.Components.voip.r1 r = new org.telegram.ui.Components.voip.r1();
    public final org.telegram.ui.Components.y9[] V = new org.telegram.ui.Components.y9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final v11 Q0 = new v11(this, 17);
    public final yg1 S0 = new yg1(this, 12);
    public final yg1 T0 = new yg1(this, 13);
    public float f1 = 1.0f;

    public ph1(int i10) {
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

    public static void i(ph1 ph1Var) {
        ph1 ph1Var2;
        int i10 = 0;
        if (ph1Var.g1) {
            ph1Var.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ph1Var.i1 = ofFloat;
            ph1Var2 = ph1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(ph1Var2, ph1Var.f1, ph1Var.Y0, ph1Var.Z0, 1));
            ph1Var2.i1.addListener(new dh1(ph1Var2, i10));
            ph1Var2.i1.setDuration(350L);
            ph1Var2.i1.setInterpolator(org.telegram.ui.Components.ds.f);
            ph1Var2.i1.start();
        } else {
            ph1Var2 = ph1Var;
        }
        ph1Var2.h1 = false;
        ph1Var2.a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        ph1 ph1Var = n1;
        if (ph1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ph1Var.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    ph1Var.q(new u90(10));
                } else if (!ph1Var.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(ph1Var.b, new yg1(ph1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ph1Var.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    ph1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i10) {
        ph1 ph1Var = n1;
        if (ph1Var != null && ph1Var.u0.getParent() == null) {
            ph1 ph1Var2 = n1;
            if (ph1Var2 != null) {
                ph1Var2.c0.d.release();
                n1.d0.d.release();
                n1.b0.release();
                hh1 hh1Var = n1.u0;
                if (hh1Var != null) {
                    hh1Var.d();
                }
                n1.k();
            }
            n1 = null;
        }
        if (n1 != null || activity.isFinishing()) {
            return;
        }
        boolean z10 = org.telegram.ui.Components.voip.n2.k() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        ph1 ph1Var3 = new ph1(i10);
        ph1Var3.b = activity;
        n1 = ph1Var3;
        hh1 hh1Var2 = new hh1(activity, !z10, ph1Var3);
        n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        n1.getClass();
        hh1Var2.setLockOnScreen(n1.J0);
        ph1Var3.u0 = hh1Var2;
        vg1 vg1Var = new vg1(ph1Var3, 4);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(hh1Var2, vg1Var);
        ((WindowManager) activity.getSystemService("window")).addView(hh1Var2, org.telegram.ui.Components.voip.x2.a());
        ph1Var3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        ph1Var3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        kh1 kh1Var = new kh1(ph1Var3, activity);
        kh1Var.setClipToPadding(false);
        kh1Var.setClipChildren(false);
        kh1Var.setBackgroundColor(-16777216);
        ph1Var3.F();
        ph1Var3.s = kh1Var;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z11 = sharedState != null && sharedState.isConference();
        org.telegram.ui.Components.voip.r1 r1Var = ph1Var3.r;
        ph1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z11, r1Var);
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
        ph1Var3.c0 = t2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        t2Var.d.setScalingType(scalingType);
        ph1Var3.c0.d.setEnableHardwareScaler(true);
        ph1Var3.c0.d.setRotateTextureWithScreen(true);
        ph1Var3.c0.a0 = 1;
        kh1Var.addView(ph1Var3.v, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        TLRPC.User user = ph1Var3.d;
        org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, r1Var);
        ph1Var3.w = a3Var;
        kh1Var.addView(a3Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.voip.f3 f3Var = new org.telegram.ui.Components.voip.f3(activity);
        int i11 = 2;
        if (LiteMode.isEnabled(512)) {
            int i12 = org.telegram.ui.ActionBar.y6.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i13 = calendar.get(2);
            int i14 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                f3Var.a = new org.telegram.ui.Components.gx0(0);
            }
        }
        ph1Var3.x = f3Var;
        kh1Var.addView(f3Var, org.telegram.ui.Components.gb1.g(220.0f, -1));
        kh1Var.addView(ph1Var3.c0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new org.telegram.ui.Components.x9(orientation, new int[]{-14994098, -14328963}).f(jg.s0.e0(0.5f, 1), new ac1(ph1Var3, 1), 0L);
        org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
        ph1Var3.Y = v1Var;
        v1Var.setDelegate(new vg1(ph1Var3, 3));
        ph1Var3.Y.d(1.0f, 1.0f);
        ph1Var3.a0 = true;
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
        ph1Var3.d0 = t2Var2;
        t2Var2.d.setIsCamera(true);
        ph1Var3.d0.d.setUseCameraRotation(true);
        ph1Var3.Y.setOnTapListener(new ah1(ph1Var3, 1));
        ph1Var3.d0.d.setMirror(true);
        ph1Var3.Y.addView(ph1Var3.d0);
        org.telegram.ui.Components.voip.v1 v1Var2 = new org.telegram.ui.Components.voip.v1(activity);
        ph1Var3.Z = v1Var2;
        v1Var2.S = true;
        v1Var2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        ph1Var3.b0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        ph1Var3.b0.setIsCamera(false);
        ph1Var3.b0.setFpsReduction(30.0f);
        ph1Var3.b0.setScalingType(scalingType);
        ph1Var3.Z.addView(ph1Var3.b0, org.telegram.ui.Components.gb1.i(-1, -2, 17));
        ph1Var3.Z.setOnTapListener(new ah1(ph1Var3, i11));
        ph1Var3.Z.setVisibility(8);
        kh1Var.addView(ph1Var3.Y, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        kh1Var.addView(ph1Var3.Z);
        View view = new View(activity);
        ph1Var3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
        kh1Var.addView(ph1Var3.h0, org.telegram.ui.Components.gb1.i(-1, 160, 80));
        View view2 = new View(activity);
        ph1Var3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
        kh1Var.addView(ph1Var3.i0, org.telegram.ui.Components.gb1.i(-1, 160, 48));
        xa1 xa1Var = new xa1(ph1Var3, activity, 19);
        ph1Var3.N = xa1Var;
        xa1Var.setOrientation(0);
        ph1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
        ph1Var3.N.setClipToPadding(false);
        ph1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
        ph1Var3.N.setOnClickListener(new ah1(ph1Var3, 3));
        ph1Var3.P = new org.telegram.ui.Components.voip.p0(activity, r1Var);
        FrameLayout frameLayout = new FrameLayout(activity);
        ph1Var3.O = frameLayout;
        frameLayout.addView(ph1Var3.P, org.telegram.ui.Components.gb1.h(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        ph1Var3.O.setVisibility(8);
        ph1Var3.O.setOnClickListener(new ah1(ph1Var3, 4));
        fi.l5 l5Var = new fi.l5(activity, r1Var);
        ph1Var3.R = l5Var;
        l5Var.setOrientation(1);
        TextView textView = new TextView(activity);
        ph1Var3.S = textView;
        textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
        ph1Var3.S.setTextSize(1, 15.0f);
        ph1Var3.S.setTypeface(AndroidUtilities.bold());
        ph1Var3.S.setTextColor(-1);
        ph1Var3.S.setGravity(17);
        mk mkVar = new mk(ph1Var3, activity, 5);
        ph1Var3.T = mkVar;
        mkVar.setTextSize(1, 15.0f);
        ph1Var3.T.setTextColor(-1);
        ph1Var3.T.setGravity(17);
        ph1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ph1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
        ph1Var3.R.setVisibility(8);
        ph1Var3.R.addView(ph1Var3.S);
        ph1Var3.R.addView(ph1Var3.T, org.telegram.ui.Components.gb1.o(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        ph1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        int i15 = 0;
        while (i15 < 4) {
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
            org.telegram.ui.Components.y9[] y9VarArr = ph1Var3.V;
            y9VarArr[i15] = y9Var;
            y9VarArr[i15].getImageReceiver().setAspectFit(true);
            ph1Var3.N.addView(y9VarArr[i15], org.telegram.ui.Components.gb1.o(i15 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i15++;
        }
        lh1 lh1Var = new lh1(ph1Var3, activity);
        ph1Var3.X = lh1Var;
        lh1Var.setOrientation(1);
        ph1Var3.X.setFocusable(true);
        ph1Var3.X.setFocusableInTouchMode(true);
        ph1Var3.y = new org.telegram.ui.Components.voip.r0(activity);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.r(user);
        org.telegram.ui.Components.voip.r0 r0Var = ph1Var3.y;
        int i16 = ph1Var3.a;
        r0Var.b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, j9Var, user);
        ph1Var3.y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        ph1Var3.E = textView2;
        textView2.setTextSize(1, 28.0f);
        ph1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ph1Var3.E.getPaint().getFontMetricsInt(), false));
        ph1Var3.E.setMaxLines(2);
        ph1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
        ph1Var3.E.setTextColor(-1);
        ph1Var3.E.setGravity(1);
        ph1Var3.E.setImportantForAccessibility(2);
        ph1Var3.X.addView(ph1Var3.E, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, 0, 8, 6));
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
        org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(q2Var, activity, r1Var);
        o2Var.setTextSize(1, 15.0f);
        o2Var.setTextColor(-1);
        o2Var.setGravity(1);
        o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout2.addView(o2Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        q2Var.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        q2Var.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        q2Var.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new jg.x1(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
        q2Var.d = u2Var;
        q2Var.addView(u2Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        ph1Var3.F = q2Var;
        WeakHashMap weakHashMap2 = r0.i0.a;
        q2Var.setImportantForAccessibility(4);
        ph1Var3.X.addView(ph1Var3.F, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            oh1 oh1Var = new oh1(activity);
            ph1Var3.G = oh1Var;
            long j10 = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i19 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null || i19 > 0) {
                int max = Math.max(i19, groupParticipants == null ? 0 : groupParticipants.size());
                int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
                org.telegram.ui.Components.l9 l9Var = oh1Var.b;
                l9Var.k(min);
                int i20 = 0;
                while (i20 < min) {
                    l9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                    i20++;
                    j10 = j10;
                }
                long j11 = j10;
                l9Var.b(false, true);
                if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                    oh1Var.setVisibility(8);
                } else {
                    oh1Var.c = new org.telegram.ui.Components.q11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                    oh1Var.setVisibility(0);
                    oh1Var.invalidate();
                }
            } else {
                oh1Var.setVisibility(8);
            }
            ph1Var3.X.addView(ph1Var3.G, org.telegram.ui.Components.gb1.o(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        ph1Var3.X.setClipChildren(false);
        ph1Var3.X.setClipToPadding(false);
        ph1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
        ph1Var3.U = new org.telegram.ui.Components.voip.k(activity);
        ph1Var3.Q = new org.telegram.ui.Components.voip.p1(activity, r1Var);
        ph1Var3.U.setAlpha(0.0f);
        ph1Var3.Q.setVisibility(8);
        kh1Var.addView(ph1Var3.y, org.telegram.ui.Components.gb1.h(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.X, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.O, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.R, org.telegram.ui.Components.gb1.h(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.N, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.U, org.telegram.ui.Components.gb1.h(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        kh1Var.addView(ph1Var3.Q, org.telegram.ui.Components.gb1.h(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        ph1Var3.j0 = new org.telegram.ui.Components.voip.s1(activity);
        ph1Var3.e = new org.telegram.ui.Components.voip.l3(activity, r1Var);
        ph1Var3.f = new org.telegram.ui.Components.voip.l3(activity, r1Var);
        ph1Var3.h = new org.telegram.ui.Components.voip.l3(activity, r1Var);
        ph1Var3.n = new mh1(activity, 52.0f);
        ph1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
        ph1Var3.e.setScaleX(0.0f);
        ph1Var3.e.setScaleY(0.0f);
        ph1Var3.e.animate().setStartDelay(ImageReceiver.DEFAULT_CROSSFADE_DURATION).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ph1Var3.f.setTranslationY(AndroidUtilities.dp(100.0f));
        ph1Var3.f.setScaleX(0.0f);
        ph1Var3.f.setScaleY(0.0f);
        ph1Var3.f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ph1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
        ph1Var3.h.setScaleX(0.0f);
        ph1Var3.h.setScaleY(0.0f);
        ph1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ph1Var3.n.setTranslationY(AndroidUtilities.dp(100.0f));
        ph1Var3.n.setScaleX(0.0f);
        ph1Var3.n.setScaleY(0.0f);
        ph1Var3.n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        ph1Var3.j0.addView(ph1Var3.e);
        ph1Var3.j0.addView(ph1Var3.f);
        ph1Var3.j0.addView(ph1Var3.h);
        ph1Var3.j0.addView(ph1Var3.n);
        org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
        ph1Var3.e0 = eVar;
        eVar.setListener(new nh1(ph1Var3));
        ph1Var3.e0.setScaleX(1.15f);
        ph1Var3.e0.setScaleY(1.15f);
        kh1Var.addView(ph1Var3.j0, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        float f7 = AndroidUtilities.isTablet() ? 100 : 27;
        kh1Var.addView(ph1Var3.e0, org.telegram.ui.Components.gb1.h(-1, 186.0f, 80, f7, 0.0f, f7, 0.0f));
        ImageView imageView = new ImageView(activity);
        ph1Var3.I = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
        ph1Var3.I.setImageResource(R.drawable.msg_addcontact);
        ph1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        kh1Var.addView(ph1Var3.I, org.telegram.ui.Components.gb1.i(56, 56, 53));
        org.telegram.ui.Components.gb1.b(ph1Var3.I);
        ImageView imageView2 = new ImageView(activity);
        ph1Var3.H = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
        ph1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
        ph1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        ph1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
        kh1Var.addView(ph1Var3.H, org.telegram.ui.Components.gb1.i(56, 56, 51));
        org.telegram.ui.Components.gb1.b(ph1Var3.H);
        jg.l lVar = new jg.l(activity, 5);
        ph1Var3.K = lVar;
        lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
        ph1Var3.K.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
        ph1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        kh1Var.addView(ph1Var3.K, org.telegram.ui.Components.gb1.h(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        ph1Var3.K.setAlpha(0.0f);
        ph1Var3.K.setOnClickListener(new ah1(ph1Var3, 5));
        int i21 = 6;
        ph1Var3.H.setOnClickListener(new ah1(ph1Var3, i21));
        ph1Var3.I.setOnClickListener(new xd0(21, ph1Var3, activity));
        if (ph1Var3.u0.b) {
            ph1Var3.H.setVisibility(8);
            ph1Var3.I.setVisibility(8);
        }
        org.telegram.ui.Components.voip.i2 i2Var = new org.telegram.ui.Components.voip.i2(activity);
        i2Var.a = new HashMap();
        i2Var.b = new ArrayList();
        i2Var.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        i2Var.r = textPaint;
        i2Var.setOrientation(1);
        i2Var.n = r1Var;
        TransitionSet transitionSet = new TransitionSet();
        i2Var.d = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        ph1Var3.M0 = i2Var;
        i2Var.setGravity(80);
        ph1Var3.M0.setOnViewsUpdated(new yg1(ph1Var3, 5));
        kh1Var.addView(ph1Var3.M0, org.telegram.ui.Components.gb1.h(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, r1Var, true);
        e3Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e3Var.K = alignment;
        e3Var.d = -1L;
        e3Var.l0 = new yg1(ph1Var3, i21);
        e3Var.T = true;
        e3Var.h = AndroidUtilities.dp(320.0f);
        e3Var.e = true;
        e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
        e3Var.q(8.0f);
        ph1Var3.N0 = e3Var;
        e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
        kh1Var.addView(ph1Var3.N0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, r1Var, false);
        e3Var2.p(true);
        e3Var2.K = alignment;
        e3Var2.d = 4000L;
        e3Var2.T = true;
        e3Var2.h = AndroidUtilities.dp(320.0f);
        e3Var2.e = true;
        e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
        e3Var2.q(8.0f);
        ph1Var3.O0 = e3Var2;
        e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
        kh1Var.addView(ph1Var3.O0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        ph1Var3.G();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!ph1Var3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                ph1Var3.U0 = phoneCall != null && phoneCall.video;
            }
            ph1Var3.n();
        }
        hh1Var2.addView(kh1Var);
        if (z10) {
            ph1Var3.F0 = 0.0f;
            ph1Var3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                ph1Var3.c0.setStub(org.telegram.ui.Components.voip.n2.k().s);
                ph1Var3.d0.setStub(org.telegram.ui.Components.voip.n2.k().r);
            }
            ph1Var3.u0.setAlpha(0.0f);
            ph1Var3.G();
            ph1Var3.E0 = true;
            org.telegram.ui.Components.voip.n2.U = true;
            if (org.telegram.ui.Components.voip.n2.W != null) {
                org.telegram.ui.Components.voip.n2.V.getClass();
                throw null;
            }
            ph1Var3.L0.lock();
            AndroidUtilities.runOnUIThread(new yg1(ph1Var3, 11), 32L);
        } else {
            ph1Var3.F0 = 1.0f;
            ph1Var3.F();
        }
        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
        if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && vf.b.a(activity) == 1) {
            ph1 ph1Var4 = n1;
            sf.c cVar = new sf.c(activity, ph1Var4);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.t2 t2Var3 = ph1Var4.c0;
            cVar.j = t2Var3.d;
            cVar.k = t2Var3.getPlaceholderView();
            ph1Var4.g0 = cVar.a();
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            yg1 yg1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            this.R0 = false;
            if (this.z0 && this.x0) {
                AndroidUtilities.runOnUIThread(yg1Var, 3000L);
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
                ih1 ih1Var = new ih1(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = ih1Var;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    ih1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
            Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
            transitionSet.addTransition(duration.setInterpolator(dsVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(dsVar));
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
            transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
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
            this.n.setOnClickListener(new ah1(this, 0));
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
    /* JADX WARN: Type inference failed for: r0v25, types: [org.telegram.ui.Components.y9] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v28, types: [org.telegram.ui.Components.y9] */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.telegram.ui.Components.y9] */
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
    /* JADX WARN: Type inference failed for: r5v7, types: [org.telegram.ui.Components.t5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.telegram.ui.Components.y9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r6;
        Drawable[] drawableArr;
        boolean z11;
        di.f3 f3Var;
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
            r6 = this.V;
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
                    org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spannable.getSpans(z12 ? 1 : 0, spannable.length(), org.telegram.ui.Components.c6.class);
                    if (emojiSpanArr != null) {
                        if ((iArr[z12 ? 1 : 0] - emojiSpanArr.length) - (c6VarArr == null ? z12 ? 1 : 0 : c6VarArr.length) <= 0) {
                            int length = emojiSpanArr.length;
                            int i13 = z12 ? 1 : 0;
                            ?? r32 = z12;
                            while (i13 < length) {
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(tL_inputStickerSetShortName, Integer.valueOf((int) r32), false, true, new t3(this, 26));
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
                        if ((drawable instanceof org.telegram.ui.Components.t5) && ((org.telegram.ui.Components.t5) drawable).i() == document.id) {
                            r52 = (org.telegram.ui.Components.t5) drawableArr[i11];
                        } else {
                            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(21, i12, document);
                            drawableArr[i11] = t5Var;
                            r52 = t5Var;
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
                if ((drawable2 instanceof org.telegram.ui.Components.t5) && (f3Var = ((org.telegram.ui.Components.t5) drawable2).k) != null) {
                    Drawable thumb = f3Var.getThumb();
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
                if (r6[i17].getVisibility() != 0) {
                    r6[i17].setVisibility(0);
                    if (z10) {
                        r6[i17].setAlpha(0.0f);
                        r6[i17].setScaleX(0.0f);
                        r6[i17].setScaleY(0.0f);
                        org.telegram.messenger.vh.q(r6[i17].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.ds.k, 250L);
                    }
                }
            }
            this.O0.postDelayed(new yg1(this, 9), 1000L);
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
        this.k0.setColor(i0.a.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        kh1 kh1Var = this.s;
        if (kh1Var != null) {
            kh1Var.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0bcb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0bdb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0d38 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int childsHight;
        org.telegram.ui.Components.voip.v1 v1Var;
        org.telegram.ui.Components.voip.v1 v1Var2;
        boolean z15;
        boolean z16;
        boolean z17;
        org.telegram.ui.Components.voip.t2 t2Var;
        VideoSink videoSink;
        int i12;
        boolean z18;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j10;
        Layout layout;
        int lineCount;
        float f7;
        float f10;
        TL_phone.PhoneCall phoneCall2;
        float f11;
        boolean z19;
        boolean z20;
        TextView textView;
        int i13;
        int i14;
        boolean z21 = true;
        z21 = true;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z22 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i15 = this.p0;
        TLRPC.User user2 = this.d;
        if (i15 == 1 || i15 == 2) {
            user = user2;
            this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z22);
        } else {
            if (i15 != 3) {
                if (i15 == 4) {
                    user = user2;
                    this.F.b(LocaleController.getString(R.string.VoipFailed), false, z22);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        AndroidUtilities.runOnUIThread(new yg1(this, 3), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        x(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerIncompatible", R.string.VoipPeerIncompatible, ContactsController.formatName(user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String formatString = LocaleController.formatString("VoipPeerVideoOutdated", R.string.VoipPeerVideoOutdated, UserObject.getFirstName(user));
                            boolean[] zArr = new boolean[1];
                            org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(this.b, 0, null);
                            boolean[] zArr2 = new boolean[3];
                            c4Var.R = LocaleController.getString(R.string.VoipFailed);
                            c4Var.T = AndroidUtilities.replaceTags(formatString);
                            String string = LocaleController.getString(R.string.Cancel);
                            vg1 vg1Var = new vg1(this, 2);
                            c4Var.p0 = string;
                            c4Var.q0 = vg1Var;
                            String string2 = LocaleController.getString(R.string.VoipPeerVideoOutdatedMakeVoice);
                            zg1 zg1Var = new zg1(0, this, zArr);
                            c4Var.n0 = string2;
                            c4Var.o0 = zg1Var;
                            c4Var.show();
                            for (int i16 = 0; i16 < 3; i16++) {
                                if (zArr2[i16] && (textView = (TextView) c4Var.d(-(i16 + 1))) != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, c4Var.k1);
                                }
                            }
                            c4Var.setCanceledOnTouchOutside(true);
                            c4Var.setOnDismissListener(new bi.u3(this, zArr, 14));
                        } else {
                            x(AndroidUtilities.replaceTags(LocaleController.formatString("VoipPeerOutdated", R.string.VoipPeerOutdated, UserObject.getFirstName(user))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        x(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CallNotAvailable, ContactsController.formatName(user.first_name, user.last_name))));
                        org.telegram.ui.Components.g5.k0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        x("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        x(LocaleController.getString(R.string.VoipErrorUnknown));
                    } else {
                        AndroidUtilities.runOnUIThread(new yg1(this, 1), 1000L);
                    }
                } else if (i15 != 5) {
                    switch (i15) {
                        case 11:
                            boolean z23 = sharedInstance != null && sharedInstance.hasRate();
                            this.d0.c();
                            if (!z23 || this.G0) {
                                user = user2;
                                AndroidUtilities.runOnUIThread(new yg1(this, 0), 200L);
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
                                    i13 = 3;
                                    user = user2;
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    AndroidUtilities.runOnUIThread(new zc1(11, this, sharedInstance), 2L);
                                    i14 = 0;
                                } else {
                                    i13 = 3;
                                    user = user2;
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
                                    this.U.a(new xg1(this, sharedInstance, i14), false);
                                }
                                this.Q.setVisibility(i14);
                                org.telegram.ui.Components.voip.p1 p1Var = this.Q;
                                vg1 vg1Var2 = new vg1(this, true ? 1 : 0);
                                int i18 = i13;
                                org.telegram.ui.Components.voip.o1[] o1VarArr = p1Var.c;
                                p1Var.d = vg1Var2;
                                org.telegram.ui.Components.voip.m1 m1Var = p1Var.a;
                                m1Var.setVisibility(i14);
                                p1Var.b.setVisibility(i14);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1Var, (Property<org.telegram.ui.Components.voip.m1, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m1Var, (Property<org.telegram.ui.Components.voip.m1, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                float f12 = 0.0f;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, (Property<org.telegram.ui.Components.voip.m1, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m1Var, (Property<org.telegram.ui.Components.voip.m1, Float>) property4, AndroidUtilities.dp(24.0f), 0.0f);
                                int i19 = 2;
                                Animator[] animatorArr = new Animator[4];
                                animatorArr[0] = ofFloat;
                                animatorArr[1] = ofFloat2;
                                animatorArr[2] = ofFloat3;
                                animatorArr[i18] = ofFloat4;
                                animatorSet.playTogether(animatorArr);
                                animatorSet.setInterpolator(org.telegram.ui.Components.ds.f);
                                animatorSet.setDuration(250L);
                                int i20 = 0;
                                while (i20 < o1VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    o1VarArr[i20].setAlpha(f12);
                                    int i21 = i19;
                                    float[] fArr = new float[i21];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o1VarArr[i20], (Property<org.telegram.ui.Components.voip.o1, Float>) property, fArr);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr2 = new float[i21];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(o1VarArr[i20], (Property<org.telegram.ui.Components.voip.o1, Float>) property2, fArr2);
                                    float[] fArr3 = new float[i21];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(o1VarArr[i20], (Property<org.telegram.ui.Components.voip.o1, Float>) property3, fArr3);
                                    org.telegram.ui.Components.voip.o1 o1Var = o1VarArr[i20];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i21];
                                    fArr4[0] = AndroidUtilities.dp(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(o1Var, (Property<org.telegram.ui.Components.voip.o1, Float>) property4, fArr4);
                                    Animator[] animatorArr2 = new Animator[4];
                                    animatorArr2[0] = ofFloat5;
                                    animatorArr2[1] = ofFloat6;
                                    animatorArr2[i21] = ofFloat7;
                                    animatorArr2[i18] = ofFloat8;
                                    animatorSet2.playTogether(animatorArr2);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i20 * 16);
                                    animatorSet2.start();
                                    i20++;
                                    animatorSet = animatorSet3;
                                    property3 = property5;
                                    f12 = 0.0f;
                                    i19 = 2;
                                }
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                                    duration.setInterpolator(dsVar).setListener(new jo(this.O)).start();
                                    this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(dsVar).setDuration(250L).start();
                                    this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new jo(this.O)).setDuration(250L).setInterpolator(dsVar).start();
                                }
                                for (org.telegram.ui.Components.y9 y9Var : this.V) {
                                    y9Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(org.telegram.ui.Components.ds.f).setDuration(250L).start();
                                }
                                this.E.animate().alpha(0.0f).setDuration(70L).setListener(new gh1(this)).start();
                                ViewPropertyAnimator alpha = this.K.animate().alpha(0.0f);
                                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f;
                                org.telegram.messenger.vh.q(alpha, dsVar2, 250L);
                                this.K.setVisibility(8);
                                this.F.d(false, true);
                                this.F.c(false);
                                org.telegram.ui.Components.voip.u2 u2Var = this.F.d;
                                u2Var.n = true;
                                u2Var.invalidate();
                                org.telegram.ui.Components.voip.r0 r0Var = this.y;
                                r0Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = r0Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                r0Var.c = animatorSet5;
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.ALPHA, r0Var.getAlpha(), 1.0f);
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) View.TRANSLATION_Y, r0Var.getTranslationY(), -AndroidUtilities.dp(24.0f));
                                Property property6 = View.SCALE_X;
                                float[] fArr5 = new float[i18];
                                fArr5[0] = r0Var.getScaleX();
                                fArr5[1] = 0.9f;
                                fArr5[2] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property6, fArr5);
                                Property property7 = View.SCALE_Y;
                                float[] fArr6 = new float[i18];
                                fArr6[0] = r0Var.getScaleY();
                                fArr6[1] = 0.9f;
                                fArr6[2] = 1.0f;
                                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(r0Var, (Property<org.telegram.ui.Components.voip.r0, Float>) property7, fArr6);
                                Animator[] animatorArr3 = new Animator[4];
                                animatorArr3[0] = ofFloat9;
                                animatorArr3[1] = ofFloat10;
                                animatorArr3[2] = ofFloat11;
                                animatorArr3[i18] = ofFloat12;
                                animatorSet5.playTogether(animatorArr3);
                                r0Var.c.setInterpolator(dsVar2);
                                r0Var.c.setDuration(300L);
                                r0Var.c.setStartDelay(250L);
                                r0Var.c.start();
                                C(true);
                                this.n.setVisibility(4);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                this.Y.setAlpha(0.0f);
                                this.Y.setVisibility(8);
                                ih1 ih1Var = this.o0;
                                if (ih1Var != null) {
                                    ih1Var.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                        case 12:
                            if (this.q0 != 12) {
                                this.F.b(LocaleController.getString(R.string.VoipExchangingKeys), true, z22);
                            }
                            user = user2;
                            break;
                        case 13:
                            this.F.b(LocaleController.getString(R.string.VoipWaiting), true, z22);
                            user = user2;
                            break;
                        case 14:
                            this.F.b(LocaleController.getString(R.string.VoipRequesting), true, z22);
                            user = user2;
                            break;
                        case 15:
                            this.e0.setRetryMod(false);
                            if (sharedState != null && sharedState.isConference()) {
                                this.F.b(LocaleController.getString(R.string.VoipInConferenceCallBranding), false, z22);
                                this.e0.setTranslationY(0.0f);
                            } else if (sharedState == null || !sharedState.isCallingVideo()) {
                                this.F.b(LocaleController.getString(R.string.VoipInCallBranding), false, z22);
                                this.e0.setTranslationY(0.0f);
                            } else {
                                this.F.b(LocaleController.getString(R.string.VoipInVideoCallBranding), false, z22);
                                this.e0.setTranslationY(-AndroidUtilities.dp(60.0f));
                            }
                            user = user2;
                            z11 = false;
                            z10 = false;
                            break;
                        case 16:
                            if (this.q0 != 16) {
                                this.F.b(LocaleController.getString(R.string.VoipRinging), true, z22);
                            }
                            user = user2;
                            break;
                        case 17:
                            this.F.b(LocaleController.getString(R.string.VoipBusy), false, z22);
                            this.e0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z11 = false;
                            z10 = false;
                            user = user2;
                            break;
                        default:
                            user = user2;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z24 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z19 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z20 = false;
                                this.n0 = z20;
                                if (z20 && !this.U0) {
                                    this.U0 = z19;
                                }
                            }
                        } else {
                            z19 = true;
                        }
                        z20 = z19;
                        this.n0 = z20;
                        if (z20) {
                            this.U0 = z19;
                        }
                    }
                    if (z22) {
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
                        if (z22) {
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
                                if (z22) {
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
                            boolean z25 = (z12 || !this.H0 || AndroidUtilities.isInPictureInPictureMode(this.b)) ? false : true;
                            w(z22, z24);
                            int dp2 = this.y.getTag() != null ? 0 : AndroidUtilities.dp(135.0f) + AndroidUtilities.dp(12.0f);
                            if (z22) {
                                this.e0.setVisibility(z21 ? 0 : 8);
                            } else {
                                if (z21 && this.e0.getTag() == null) {
                                    this.e0.animate().setListener(null).cancel();
                                    if (this.e0.getVisibility() == 8) {
                                        this.e0.setVisibility(0);
                                        this.e0.setAlpha(0.0f);
                                    }
                                    this.e0.animate().alpha(1.0f);
                                }
                                if (!z21 && this.e0.getTag() != null) {
                                    this.e0.animate().setListener(null).cancel();
                                    this.e0.animate().setListener(new dh1(this, 8)).alpha(0.0f);
                                    this.e0.setEnabled(z21);
                                    this.e0.setTag(z21 ? 1 : null);
                                    this.u0.setLockOnScreen(this.J0);
                                    z13 = this.p0 != 3 && (this.n0 || this.m0);
                                    this.z0 = z13;
                                    if (!z13 && !this.x0) {
                                        z(true);
                                    }
                                    if (this.x0 || !this.z0 || this.R0 || sharedInstance == null) {
                                        z14 = z25;
                                    } else {
                                        z14 = z25;
                                        AndroidUtilities.runOnUIThread(this.S0, 3000L);
                                        this.R0 = true;
                                    }
                                    int i22 = this.p0;
                                    boolean z26 = i22 == 11 && this.x0;
                                    boolean z27 = (!z21 || i22 == 16 || i22 == 11 || i22 == 12 || i22 == 14 || i22 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                                    if (z22) {
                                        if (z26) {
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
                                        if (z27) {
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
                                        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                    } else {
                                        this.H.setVisibility(z26 ? 0 : 8);
                                        this.H.setAlpha(z26 ? 1.0f : 0.0f);
                                        this.I.setVisibility(z27 ? 0 : 8);
                                        this.I.setAlpha(z27 ? 1.0f : 0.0f);
                                        this.M0.setTranslationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0));
                                    }
                                    i11 = this.p0;
                                    if (i11 != 10 && i11 != 11) {
                                        C(z22);
                                    }
                                    if (z10) {
                                        this.F.e(z22);
                                    }
                                    this.F.d(z11, z22);
                                    if (this.y.getVisibility() == 0 && this.C0) {
                                        dp2 += AndroidUtilities.dp(24.0f);
                                        layout = this.T.getLayout();
                                        if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                            dp2 = c3.h0.w(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                        }
                                    }
                                    if (this.p0 == 11 && !this.n0 && !this.m0) {
                                        dp2 -= AndroidUtilities.dp(24.0f);
                                    }
                                    if (!this.n0 || this.m0) {
                                        dp2 -= AndroidUtilities.dp(60.0f);
                                    }
                                    if (z22) {
                                        if (this.C0 && (this.n0 || this.m0)) {
                                            this.X.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                            j10 = 250;
                                        } else {
                                            j10 = 250;
                                            this.X.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                        }
                                        if (dp2 != this.v0) {
                                            ViewPropertyAnimator animate = this.X.animate();
                                            if (this.p0 != 11) {
                                                j10 = 0;
                                            }
                                            animate.setStartDelay(j10).translationY(dp2).setDuration(200L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                        }
                                    } else {
                                        this.X.setTranslationY(dp2);
                                    }
                                    this.v0 = dp2;
                                    boolean z28 = sharedInstance == null && sharedInstance.isScreencast();
                                    int i23 = this.p0;
                                    this.D0 = i23 == 11 && i23 != 17 && ((this.n0 && !z28) || this.m0);
                                    if (sharedInstance != null) {
                                        if (this.n0) {
                                            sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                        }
                                        this.d0.setIsScreencast(sharedInstance.isScreencast());
                                        this.d0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                        VideoSink videoSink2 = (!this.n0 || sharedInstance.isScreencast()) ? null : this.d0.d;
                                        if (!this.m1 || (t2Var = this.k1) == null) {
                                            if (z14) {
                                                videoSink = this.b0;
                                                sharedInstance.setSinks(videoSink2, videoSink);
                                                if (z22) {
                                                    org.telegram.ui.Components.voip.i2 i2Var = this.M0;
                                                    i2Var.f = false;
                                                    if (!i2Var.e && i2Var.getParent() != null) {
                                                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                                                    }
                                                }
                                                if (sharedInstance.isMicMute()) {
                                                    this.M0.c("self-muted");
                                                } else {
                                                    this.M0.a(R.drawable.calls_mute_mini, LocaleController.getString(R.string.VoipMyMicrophoneState), "self-muted");
                                                }
                                                if ((!this.n0 || this.m0) && (((i12 = this.p0) == 3 || i12 == 5) && sharedInstance.getCallDuration() > 500)) {
                                                    if (sharedInstance.getRemoteAudioState() != 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var2 = this.M0;
                                                        i2Var2.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, i2Var2.b(UserObject.getFirstName(user))), "muted");
                                                    } else {
                                                        this.M0.c("muted");
                                                    }
                                                    if (sharedInstance.getRemoteVideoState() != 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var3 = this.M0;
                                                        i2Var3.a(R.drawable.calls_camera_mini, LocaleController.formatString("VoipUserCameraIsOff", R.string.VoipUserCameraIsOff, i2Var3.b(UserObject.getFirstName(user))), MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    } else {
                                                        this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                                    }
                                                } else {
                                                    if (sharedInstance.getRemoteAudioState() == 0) {
                                                        org.telegram.ui.Components.voip.i2 i2Var4 = this.M0;
                                                        i2Var4.a(R.drawable.calls_mute_mini, LocaleController.formatString("VoipUserMicrophoneIsOff", R.string.VoipUserMicrophoneIsOff, i2Var4.b(UserObject.getFirstName(user))), "muted");
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
                                                        z18 = true;
                                                        if (z22) {
                                                            org.telegram.ui.Components.voip.i2 i2Var5 = this.M0;
                                                            if (i2Var5.f) {
                                                                i2Var5.e = z18;
                                                                AndroidUtilities.runOnUIThread(new k2.c(i2Var5, 20), 700L);
                                                            }
                                                            i2Var5.f = false;
                                                        }
                                                    }
                                                }
                                                if (this.M0.getChildCount() != 0) {
                                                    z18 = true;
                                                    this.N0.e(true);
                                                    if (z22) {
                                                    }
                                                }
                                                z18 = true;
                                                if (z22) {
                                                }
                                            } else {
                                                t2Var = this.c0;
                                            }
                                        }
                                        videoSink = t2Var.d;
                                        sharedInstance.setSinks(videoSink2, videoSink);
                                        if (z22) {
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
                                        z18 = true;
                                        if (z22) {
                                        }
                                    }
                                    childsHight = this.M0.getChildsHight();
                                    v1Var = this.Z;
                                    if (v1Var.getParent() == null && z22) {
                                        v1Var.T = childsHight;
                                    } else {
                                        v1Var.T = childsHight;
                                    }
                                    v1Var2 = this.Y;
                                    if (v1Var2.getParent() == null && z22) {
                                        v1Var2.T = childsHight;
                                    } else {
                                        v1Var2.T = childsHight;
                                    }
                                    this.Y.setUiVisible(this.x0);
                                    this.Z.setUiVisible(this.x0);
                                    if (!this.n0) {
                                        z15 = true;
                                        y(0, z22);
                                    } else if (!this.m0 || this.H0) {
                                        z15 = true;
                                        y(1, z22);
                                    } else {
                                        y(2, z22);
                                        z15 = true;
                                    }
                                    if (!z14 && this.Z.getTag() == null) {
                                        this.Z.setIsActive(z15);
                                        if (this.Z.getVisibility() != 0) {
                                            this.Z.setVisibility(0);
                                            this.Z.setAlpha(0.0f);
                                            this.Z.setScaleX(0.5f);
                                            this.Z.setScaleY(0.5f);
                                        }
                                        this.Z.animate().setListener(null).cancel();
                                        org.telegram.ui.Components.voip.v1 v1Var3 = this.Z;
                                        v1Var3.c0 = true;
                                        v1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).setStartDelay(150L).withEndAction(new yg1(this, 4)).start();
                                        this.Z.setTag(1);
                                    } else if (!z14 && this.Z.getTag() != null) {
                                        this.Z.setIsActive(false);
                                        this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new dh1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                        this.Z.setTag(null);
                                    }
                                    this.Y.a();
                                    this.Z.a();
                                    E();
                                    if (this.p0 == 3) {
                                        this.w.a();
                                        this.y.a();
                                        int i24 = this.v.V;
                                        if (i24 != 2 && i24 != 3) {
                                            int[] iArr2 = new int[2];
                                            this.y.getLocationOnScreen(iArr2);
                                            z16 = true;
                                            this.v.b(AndroidUtilities.dp(106.0f) + iArr2[0], AndroidUtilities.dp(106.0f) + iArr2[1], this.q0 != -1);
                                            z17 = (!this.n0 || this.m0) ? z16 : false;
                                            this.x.setState(z17);
                                            this.w.setState(z17);
                                            this.r.e(z17);
                                            if (this.m0 && !z24 && this.f0) {
                                                this.f0 = false;
                                                if (sharedInstance != null) {
                                                    sharedInstance.playStartRecordSound();
                                                }
                                            }
                                            if (z17) {
                                                if (this.i0.getVisibility() != 4) {
                                                    this.i0.setVisibility(4);
                                                    this.h0.setVisibility(4);
                                                }
                                            } else if (this.i0.getVisibility() != 0) {
                                                this.i0.setVisibility(0);
                                                this.h0.setVisibility(0);
                                            }
                                            yg1 yg1Var = this.T0;
                                            AndroidUtilities.cancelRunOnUIThread(yg1Var);
                                            if (this.p0 != 3) {
                                                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    z16 = true;
                                    if (this.n0) {
                                    }
                                    this.x.setState(z17);
                                    this.w.setState(z17);
                                    this.r.e(z17);
                                    if (this.m0) {
                                        this.f0 = false;
                                        if (sharedInstance != null) {
                                        }
                                    }
                                    if (z17) {
                                    }
                                    yg1 yg1Var2 = this.T0;
                                    AndroidUtilities.cancelRunOnUIThread(yg1Var2);
                                    if (this.p0 != 3) {
                                    }
                                }
                            }
                            this.e0.setEnabled(z21);
                            this.e0.setTag(z21 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            if (this.p0 != 3) {
                            }
                            this.z0 = z13;
                            if (!z13) {
                                z(true);
                            }
                            if (this.x0) {
                            }
                            z14 = z25;
                            int i222 = this.p0;
                            if (i222 == 11) {
                            }
                            if (!z21) {
                            }
                            if (z22) {
                            }
                            i11 = this.p0;
                            if (i11 != 10) {
                                C(z22);
                            }
                            if (z10) {
                            }
                            this.F.d(z11, z22);
                            if (this.y.getVisibility() == 0) {
                                dp2 += AndroidUtilities.dp(24.0f);
                                layout = this.T.getLayout();
                                if (layout != null) {
                                    dp2 = c3.h0.w(lineCount, 2, AndroidUtilities.dp(20.0f), dp2);
                                }
                            }
                            if (this.p0 == 11) {
                                dp2 -= AndroidUtilities.dp(24.0f);
                            }
                            if (!this.n0) {
                            }
                            dp2 -= AndroidUtilities.dp(60.0f);
                            if (z22) {
                            }
                            this.v0 = dp2;
                            if (sharedInstance == null) {
                            }
                            int i232 = this.p0;
                            this.D0 = i232 == 11 && i232 != 17 && ((this.n0 && !z28) || this.m0);
                            if (sharedInstance != null) {
                            }
                            childsHight = this.M0.getChildsHight();
                            v1Var = this.Z;
                            if (v1Var.getParent() == null) {
                            }
                            v1Var.T = childsHight;
                            v1Var2 = this.Y;
                            if (v1Var2.getParent() == null) {
                            }
                            v1Var2.T = childsHight;
                            this.Y.setUiVisible(this.x0);
                            this.Z.setUiVisible(this.x0);
                            if (!this.n0) {
                            }
                            if (!z14) {
                            }
                            if (!z14) {
                                this.Z.setIsActive(false);
                                this.Z.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new dh1(this, 5)).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                                this.Z.setTag(null);
                            }
                            this.Y.a();
                            this.Z.a();
                            E();
                            if (this.p0 == 3) {
                            }
                            z16 = true;
                            if (this.n0) {
                            }
                            this.x.setState(z17);
                            this.w.setState(z17);
                            this.r.e(z17);
                            if (this.m0) {
                            }
                            if (z17) {
                            }
                            yg1 yg1Var22 = this.T0;
                            AndroidUtilities.cancelRunOnUIThread(yg1Var22);
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
                    w(z22, z24);
                    if (this.y.getTag() != null) {
                    }
                    if (z22) {
                    }
                    this.e0.setEnabled(z21);
                    this.e0.setTag(z21 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z13;
                    if (!z13) {
                    }
                    if (this.x0) {
                    }
                    z14 = z25;
                    int i2222 = this.p0;
                    if (i2222 == 11) {
                    }
                    if (!z21) {
                    }
                    if (z22) {
                    }
                    i11 = this.p0;
                    if (i11 != 10) {
                    }
                    if (z10) {
                    }
                    this.F.d(z11, z22);
                    if (this.y.getVisibility() == 0) {
                    }
                    if (this.p0 == 11) {
                    }
                    if (!this.n0) {
                    }
                    dp2 -= AndroidUtilities.dp(60.0f);
                    if (z22) {
                    }
                    this.v0 = dp2;
                    if (sharedInstance == null) {
                    }
                    int i2322 = this.p0;
                    this.D0 = i2322 == 11 && i2322 != 17 && ((this.n0 && !z28) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    v1Var = this.Z;
                    if (v1Var.getParent() == null) {
                    }
                    v1Var.T = childsHight;
                    v1Var2 = this.Y;
                    if (v1Var2.getParent() == null) {
                    }
                    v1Var2.T = childsHight;
                    this.Y.setUiVisible(this.x0);
                    this.Z.setUiVisible(this.x0);
                    if (!this.n0) {
                    }
                    if (!z14) {
                    }
                    if (!z14) {
                    }
                    this.Y.a();
                    this.Z.a();
                    E();
                    if (this.p0 == 3) {
                    }
                    z16 = true;
                    if (this.n0) {
                    }
                    this.x.setState(z17);
                    this.w.setState(z17);
                    this.r.e(z17);
                    if (this.m0) {
                    }
                    if (z17) {
                    }
                    yg1 yg1Var222 = this.T0;
                    AndroidUtilities.cancelRunOnUIThread(yg1Var222);
                    if (this.p0 != 3) {
                    }
                }
            }
            user = user2;
            D(z22);
            if (this.p0 == 5) {
                boolean z29 = this.s0;
                if (!z29 && this.q0 != 5) {
                    this.F.b(LocaleController.getString(R.string.VoipConnecting), true, z22);
                }
                z11 = z29;
                z21 = false;
                z10 = false;
                if (this.o0 == null) {
                }
            } else {
                z10 = true;
                this.s0 = true;
                z21 = false;
                z11 = false;
                if (this.o0 == null) {
                }
            }
        }
        z21 = false;
        z11 = false;
        z10 = false;
        if (this.o0 == null) {
        }
    }

    @Override // uf.a
    public final void a(a8.fg fgVar) {
        this.l1 = fgVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.c0;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.m1 = true;
        G();
        ((WindowManager) this.b.getSystemService("window")).removeView(this.u0);
        this.u0.invalidate();
    }

    @Override // uf.a
    public final void b(a8.fg fgVar) {
        this.l1 = fgVar;
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        hh1 hh1Var = this.u0;
        hh1Var.getClass();
        windowManager.addView(hh1Var, org.telegram.ui.Components.voip.x2.a());
        this.m1 = false;
        G();
        this.u0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.k1;
        if (t2Var != null) {
            t2Var.d.release();
            this.k1 = null;
        }
    }

    @Override // uf.a
    public final Bitmap c() {
        org.telegram.ui.Components.voip.t2 t2Var = this.k1;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.k1.d.getBitmap();
    }

    @Override // uf.a
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

    @Override // uf.a
    public final Bitmap e() {
        org.telegram.ui.Components.voip.t2 t2Var = this.c0;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.c0.d.getBitmap();
    }

    @Override // uf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // uf.a
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.b, false, true, false, false);
        this.k1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.k1.d.setEnableHardwareScaler(true);
        this.k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.k1;
        t2Var2.a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new jh1(this));
        View view = this.k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.k1;
    }

    public final ValueAnimator j(boolean z10) {
        char c10;
        float f7;
        float measuredWidth;
        final float measuredHeight;
        final float f10;
        final boolean z11;
        float f11;
        float f12;
        float f13;
        boolean z12;
        float f14;
        this.Y.animate().cancel();
        float f15 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().E;
        float f16 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().F;
        final float x9 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.n2.V.getClass();
        final float measuredWidth2 = f15 - ((this.c0.getMeasuredWidth() - (this.c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f16 - ((this.c0.getMeasuredHeight() - (this.c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f17 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = 1.0f;
                f13 = 1.0f;
                z12 = false;
                f14 = 0.0f;
            } else {
                f14 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = d3.A(org.telegram.ui.Components.voip.n2.k().f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().f * 0.25f) + (f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f14)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                f13 = d3.A(org.telegram.ui.Components.voip.n2.k().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f14)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                z12 = true;
            }
            measuredHeight = f13;
            z11 = z12;
            f10 = f14;
        } else {
            c10 = 0;
            f7 = 4.0f;
            measuredWidth = f15 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f16 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = 0.25f;
            z11 = true;
        }
        final float f18 = measuredWidth;
        final float dp = this.m0 ? AndroidUtilities.dp(f7) : 0.0f;
        final float dp2 = (AndroidUtilities.dp(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.n2.V.getClass();
            f11 = 1.0f;
            f17 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float f19 = f11;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f18);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(dp2);
                this.Y.setAlpha(f17);
            }
            this.c0.setScaleX(0.25f);
            this.c0.setScaleY(0.25f);
            this.c0.setTranslationX(measuredWidth2);
            this.c0.setTranslationY(measuredHeight2);
            f12 = 0.25f;
            this.c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f19) / 0.25f);
        } else {
            f12 = 0.25f;
        }
        float f20 = z10 ? f19 : 0.0f;
        float f21 = z10 ? 0.0f : f19;
        float[] fArr = new float[2];
        fArr[c10] = f20;
        fArr[1] = f21;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z10 ? 0.0f : f19;
        F();
        final float f22 = f12;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ch1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                ph1 ph1Var = ph1.this;
                ph1Var.F0 = f23;
                ph1Var.F();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    ph1Var.Y.setScaleX(f24);
                    ph1Var.Y.setScaleY(f24);
                    ph1Var.Y.setTranslationX((f18 * floatValue) + (x9 * f23));
                    ph1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f23));
                    ph1Var.Y.setCornerRadius((dp2 * floatValue) + (dp * f23));
                    ph1Var.Y.setAlpha((f17 * floatValue) + (1.0f * f23));
                }
                float f25 = (f22 * floatValue) + (1.0f * f23);
                ph1Var.c0.setScaleX(f25);
                ph1Var.c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth2 * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                ph1Var.c0.setTranslationX(f27);
                ph1Var.c0.setTranslationY(f28);
                ph1Var.c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!ph1Var.Y.P) {
                    ph1Var.d0.d(floatValue, false);
                }
                ph1Var.u0.invalidate();
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
        sf.d dVar = this.g0;
        if (dVar != null) {
            dVar.c();
            this.g0 = null;
        }
        vg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.a3 a3Var = this.w;
            int i10 = 1;
            if (a3Var.K && z10 != a3Var.E) {
                a3Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                a3Var.c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, i10));
                a3Var.c.setInterpolator(org.telegram.ui.Components.ds.f);
                a3Var.c.setDuration(200L);
                a3Var.c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.ds.g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                org.telegram.messenger.vh.q(translationY, dsVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new dh1(this, 3)).setInterpolator(dsVar).start();
            } else {
                if (this.y.getVisibility() == 0) {
                    this.y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f;
                duration.setInterpolator(dsVar2).setListener(new jo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(dsVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new dh1(this, 4)).setDuration(250L).setInterpolator(dsVar2).start();
            }
            this.q0 = this.p0;
            G();
        }
    }

    public final void m() {
        this.u0.b();
    }

    public final void n() {
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new eh1(this));
        this.c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new fh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (this.G0 || this.E0) {
            return;
        }
        ih1 ih1Var = this.o0;
        if (ih1Var != null) {
            ih1Var.a(false, false);
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
        if (vf.b.a(this.b) <= 0) {
            org.telegram.ui.Components.g5.A(this.b, new vg1(this, 0), true).p();
            return;
        }
        if (this.G0 || n1 == null) {
            return;
        }
        this.G0 = true;
        if (VoIPService.getSharedInstance() != null) {
            int measuredHeight = n1.u0.getMeasuredHeight();
            ph1 ph1Var = n1;
            org.telegram.ui.Components.voip.n2.l(ph1Var.b, ph1Var.a, ph1Var.u0.getMeasuredWidth(), measuredHeight, 1);
            WindowInsets windowInsets = n1.r0;
            if (windowInsets != null) {
                org.telegram.ui.Components.voip.n2.X = windowInsets.getSystemWindowInsetTop();
                n1.r0.getSystemWindowInsetBottom();
            }
        }
        if (org.telegram.ui.Components.voip.n2.k() == null) {
            return;
        }
        ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        duration.setInterpolator(dsVar).start();
        this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
        org.telegram.ui.Components.voip.n2.U = true;
        this.E0 = true;
        ValueAnimator j10 = j(false);
        this.L0.lock();
        j10.addListener(new dh1(this, 1));
        j10.setDuration(350L);
        j10.setInterpolator(dsVar);
        j10.start();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
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
            sf.d dVar = this.g0;
            if (dVar != null) {
                dVar.c();
                this.g0 = null;
            }
        } else if (this.g0 == null && vf.b.a(this.b) == 1) {
            sf.c cVar = new sf.c(this.b, n1);
            cVar.c = "voip-fragment-pip";
            org.telegram.ui.Components.voip.t2 t2Var = this.c0;
            cVar.j = t2Var.d;
            cVar.k = t2Var.getPlaceholderView();
            this.g0 = cVar.a();
        }
        G();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.j1 = true;
        }
        if (this.F == null || (d3Var = this.v) == null) {
            return;
        }
        int i11 = d3Var.V;
        if ((i11 == 2 || i11 == 3) && this.j1) {
            AndroidUtilities.runOnUIThread(new wg1(this, i10, 0), 400L);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.bh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ph1 ph1Var = ph1.this;
                ph1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ph1Var.e0.setTranslationY(dp2 * floatValue);
                int i10 = (int) (marginEnd - ((r1 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                ph1Var.e0.requestLayout();
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
        animatorSet.addListener(new org.telegram.ui.Components.ll0(16, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new yg1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.n0) {
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
            l3Var.setOnBtnClickedListener(new e7(this, voIPService, l3Var, 23));
        }
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.v1 v1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        if (z10) {
            ValueAnimator valueAnimator = v1Var.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(v1Var.K, isMicMute ? 1.0f : 0.0f);
            v1Var.f0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.g0);
            v1Var.f0.setDuration(150L);
            v1Var.f0.start();
        } else {
            ValueAnimator valueAnimator2 = v1Var.f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            v1Var.K = isMicMute ? 1.0f : 0.0f;
            v1Var.invalidate();
        }
        l3Var.setOnBtnClickedListener(new vg1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            l3Var.d(4, false, false);
            i11 = 2;
        } else {
            if (!voipAudioManager.isSpeakerphoneOn()) {
                l3Var.d(5, false, false);
                i10 = 1;
                l3Var.setEnabled(true);
                l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
            }
            l3Var.d(5, true, false);
        }
        i10 = i11;
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            l3Var.d(3, true, false);
            l3Var.setOnClickListener(null);
            l3Var.setEnabled(false);
            return;
        }
        if (!this.n0) {
            l3Var.d(3, true, z10);
        } else if (voIPService.isScreencast()) {
            l3Var.d(3, false, z10);
        } else {
            l3Var.d(3, false, z10);
        }
        l3Var.setOnBtnClickedListener(new vg1(this, 6));
        l3Var.setEnabled(true);
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
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
            } else {
                this.y.setAlpha(0.0f);
                this.y.setTranslationY(-AndroidUtilities.dp(135.0f));
                this.y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f).start();
            }
        } else if (!z12 && this.y.getTag() != null) {
            this.y.animate().setListener(null).cancel();
            this.y.setTranslationY(0.0f);
            this.y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.ds.f).setListener(new dh1(this, 7)).start();
        }
        this.y.setTag(z12 ? 1 : null);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(this.b, 0, null);
        boolean[] zArr = new boolean[3];
        c4Var.R = LocaleController.getString(R.string.VoipFailed);
        c4Var.T = charSequence;
        c4Var.n0 = LocaleController.getString(R.string.OK);
        c4Var.o0 = null;
        c4Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) c4Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, c4Var.k1);
            }
        }
        c4Var.setCanceledOnTouchOutside(true);
        c4Var.setOnDismissListener(new u5(this, 18));
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.v1, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.v1, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<org.telegram.ui.Components.voip.v1, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.v1 v1Var = this.Y;
                if (v1Var.y < 0.0f) {
                    v1Var.d(1.0f, 1.0f);
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
            org.telegram.ui.Components.voip.v1 v1Var2 = this.Y;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(v1Var2, (Property<org.telegram.ui.Components.voip.v1, Float>) View.ALPHA, v1Var2.getAlpha(), 0.0f));
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                org.telegram.ui.Components.voip.v1 v1Var3 = this.Y;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v1Var3, (Property<org.telegram.ui.Components.voip.v1, Float>) View.SCALE_X, v1Var3.getScaleX(), 0.7f);
                org.telegram.ui.Components.voip.v1 v1Var4 = this.Y;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(v1Var4, (Property<org.telegram.ui.Components.voip.v1, Float>) View.SCALE_Y, v1Var4.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new dh1(this, 6));
            this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f);
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
        v11 v11Var = this.Q0;
        if (z10 || !this.x0) {
            if (z10 && !this.x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                translationY.setInterpolator(dsVar).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(dsVar).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(v11Var);
                this.P0.setDuration(150L).setInterpolator(dsVar);
                this.P0.start();
                this.j0.setEnabled(true);
            }
            i10 = 0;
        } else {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f;
            duration.setInterpolator(dsVar2).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar2).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar2).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar2).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar2).start();
            this.j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(v11Var);
            this.P0.setDuration(150L).setInterpolator(dsVar2);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.e(true);
            i10 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        }
        this.x0 = z10;
        hh1 hh1Var = this.u0;
        if (z10) {
            hh1Var.setSystemUiVisibility(hh1Var.getSystemUiVisibility() & (-5));
        } else {
            hh1Var.setSystemUiVisibility(hh1Var.getSystemUiVisibility() | 4);
        }
        this.M0.animate().translationY((-AndroidUtilities.dp(16.0f)) - (this.x0 ? AndroidUtilities.dp(80.0f) : 0)).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.ds.f).start();
    }

    @Override // uf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z10) {
    }
}
