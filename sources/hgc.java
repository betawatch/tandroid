// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hgc implements VoIPService.StateListener, gk7 {
    public static hgc m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public yl5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public xhc G;
    public boolean G0;
    public ggc H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public v31 L;
    public int M;
    public tgc M0;
    public s7c N;
    public cg2 N0;
    public pkb O;
    public cg2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public t8 Q;
    public jo0 R;
    public boolean R0;
    public f7 S;
    public TextView T;
    public xw0 U;
    public boolean U0;
    public w24 V;
    public float V0;
    public float W0;
    public float X0;
    public dgc Y;
    public float Y0;
    public pfc Z;
    public float Z0;
    public final int a;
    public pfc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public aic d0;
    public int d1;
    public ric e;
    public aic e0;
    public int e1;
    public ric f;
    public n4 f0;
    public boolean g0;
    public boolean g1;
    public ric h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public mfc j0;
    public boolean j1;
    public aic k1;
    public boolean l1;
    public boolean m0;
    public egc n;
    public boolean n0;
    public bgc o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public cgc s;
    public boolean s0;
    public float t0;
    public agc u0;
    public int v0;
    public kic w;
    public AccessibilityManager w0;
    public hic x;
    public lic y;
    public boolean z0;
    public final lfc r = new lfc();
    public final be0[] W = new be0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final on L0 = new on(null);
    public final uwb Q0 = new uwb(this, 7);
    public final sfc S0 = new sfc(this, 12);
    public final sfc T0 = new sfc(this, 13);
    public float f1 = 1.0f;

    public hgc(int i) {
        this.a = i;
        this.c = na7.q1(i).V1(Long.valueOf(y6c.h(i).e()));
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
        kk7.e().b(this, kk7.Q4);
        kk7.f(i).b(this, kk7.O4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.D2);
        kk7.e().b(this, kk7.I5);
    }

    public static void h(int[] iArr, int i) {
        hgc hgcVar = m1;
        if (hgcVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    hgcVar.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    hgcVar.i(new cza((byte) 6));
                } else if (!hgcVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    rgc.h(hgcVar.b, new sfc(hgcVar, (byte) 3), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    hgcVar.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    hgcVar.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i) {
        int size;
        hgc hgcVar = m1;
        if (hgcVar != null && hgcVar.u0.getParent() == null) {
            hgc hgcVar2 = m1;
            if (hgcVar2 != null) {
                hgcVar2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                agc agcVar = m1.u0;
                if (agcVar != null) {
                    agcVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 != null || activity.isFinishing()) {
            return;
        }
        boolean z = xgc.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        hgc hgcVar3 = new hgc(i);
        hgcVar3.b = activity;
        m1 = hgcVar3;
        agc agcVar2 = new agc(activity, !z, hgcVar3);
        m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        m1.getClass();
        agcVar2.setLockOnScreen(m1.J0);
        hgcVar3.u0 = agcVar2;
        rfc rfcVar = new rfc(hgcVar3, (byte) 3);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(agcVar2, rfcVar);
        ((WindowManager) activity.getSystemService("window")).addView(agcVar2, eic.a());
        hgcVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        hgcVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        cgc cgcVar = new cgc(hgcVar3, activity);
        cgcVar.setClipToPadding(false);
        cgcVar.setClipChildren(false);
        cgcVar.setBackgroundColor(-16777216);
        hgcVar3.x();
        hgcVar3.s = cgcVar;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z2 = sharedState != null && sharedState.isConference();
        lfc lfcVar = hgcVar3.r;
        hgcVar3.w = new kic(activity, z2, lfcVar);
        aic aicVar = new aic(activity, false, true, false, false);
        hgcVar3.d0 = aicVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        aicVar.d.setScalingType(scalingType);
        hgcVar3.d0.d.setEnableHardwareScaler(true);
        hgcVar3.d0.d.setRotateTextureWithScreen(true);
        hgcVar3.d0.b0 = (byte) 1;
        cgcVar.addView(hgcVar3.w, nme.c(-1.0f, -1));
        TLRPC.User user = hgcVar3.d;
        hic hicVar = new hic(activity, user, lfcVar);
        hgcVar3.x = hicVar;
        cgcVar.addView(hicVar, nme.c(-1.0f, -1));
        lic licVar = new lic(activity);
        byte b = 2;
        if (e66.e(512)) {
            int i2 = bkb.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(2);
            int i4 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i3 == 11 && i4 >= 24 && i4 <= 31) || (i3 == 0 && i4 == 1)) {
                licVar.a = new cka(0);
            }
        }
        hgcVar3.y = licVar;
        cgcVar.addView(licVar, nme.c(220.0f, -1));
        cgcVar.addView(hgcVar3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new wd0(orientation, new int[]{-14994098, -14328963}).f(l69.y(1), new zlb(hgcVar3, (byte) 1), 0L);
        pfc pfcVar = new pfc(activity);
        hgcVar3.Z = pfcVar;
        pfcVar.setDelegate(new rfc(hgcVar3, b));
        hgcVar3.Z.d(1.0f, 1.0f);
        hgcVar3.b0 = true;
        aic aicVar2 = new aic(activity, true, false);
        hgcVar3.e0 = aicVar2;
        aicVar2.d.setIsCamera(true);
        hgcVar3.e0.d.setUseCameraRotation(true);
        hgcVar3.Z.setOnTapListener(new tfc(hgcVar3, (byte) 1));
        hgcVar3.e0.d.setMirror(true);
        hgcVar3.Z.addView(hgcVar3.e0);
        pfc pfcVar2 = new pfc(activity);
        hgcVar3.a0 = pfcVar2;
        pfcVar2.T = true;
        pfcVar2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        hgcVar3.c0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        hgcVar3.c0.setIsCamera(false);
        hgcVar3.c0.setFpsReduction(30.0f);
        hgcVar3.c0.setScalingType(scalingType);
        hgcVar3.a0.addView(hgcVar3.c0, nme.e(-1, -2, 17));
        hgcVar3.a0.setOnTapListener(new tfc(hgcVar3, b));
        hgcVar3.a0.setVisibility(8);
        cgcVar.addView(hgcVar3.Z, nme.c(-2.0f, -2));
        cgcVar.addView(hgcVar3.a0);
        View view = new View(activity);
        hgcVar3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, bm2.o(-16777216, kk7.K1)}));
        cgcVar.addView(hgcVar3.h0, nme.e(-1, kk7.p2, 80));
        View view2 = new View(activity);
        hgcVar3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{bm2.o(-16777216, kk7.m1), 0}));
        cgcVar.addView(hgcVar3.i0, nme.e(-1, kk7.p2, 48));
        pkb pkbVar = new pkb((byte) 23, activity, hgcVar3);
        hgcVar3.O = pkbVar;
        pkbVar.setOrientation(0);
        hgcVar3.O.setPadding(0, 0, 0, gl.L(30.0f));
        hgcVar3.O.setClipToPadding(false);
        hgcVar3.O.setContentDescription(k96.M0(2131743060, null));
        hgcVar3.O.setOnClickListener(new tfc(hgcVar3, (byte) 3));
        hgcVar3.Q = new t8(activity, lfcVar);
        FrameLayout frameLayout = new FrameLayout(activity);
        hgcVar3.P = frameLayout;
        frameLayout.addView(hgcVar3.Q, nme.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        hgcVar3.P.setVisibility(8);
        hgcVar3.P.setOnClickListener(new tfc(hgcVar3, (byte) 4));
        f7 f7Var = new f7(activity, lfcVar);
        hgcVar3.S = f7Var;
        f7Var.setOrientation(1);
        TextView textView = new TextView(activity);
        hgcVar3.T = textView;
        textView.setText(k96.M0(2131743249, null));
        hgcVar3.T.setTextSize(1, 15.0f);
        hgcVar3.T.setTypeface(gl.o());
        hgcVar3.T.setTextColor(-1);
        hgcVar3.T.setGravity(17);
        xw0 xw0Var = new xw0((byte) 8, activity, hgcVar3);
        hgcVar3.U = xw0Var;
        xw0Var.setTextSize(1, 15.0f);
        hgcVar3.U.setTextColor(-1);
        hgcVar3.U.setGravity(17);
        hgcVar3.U.setText(k96.a0("CallEmojiKeyTooltip", null, 2131752615, TextUtils.ellipsize(l7c.k(user, true), hgcVar3.U.getPaint(), gl.L(300.0f), TextUtils.TruncateAt.END)));
        hgcVar3.S.setVisibility(8);
        hgcVar3.S.addView(hgcVar3.T);
        hgcVar3.S.addView(hgcVar3.U, nme.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        hgcVar3.S.setPadding(gl.L(18.0f), gl.L(80.0f), gl.L(18.0f), gl.L(18.0f));
        int i5 = 0;
        while (i5 < 4) {
            be0 be0Var = new be0(activity);
            be0[] be0VarArr = hgcVar3.W;
            be0VarArr[i5] = be0Var;
            be0VarArr[i5].getImageReceiver().S0 = true;
            hgcVar3.O.addView(be0VarArr[i5], nme.k(i5 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i5++;
        }
        dgc dgcVar = new dgc(hgcVar3, activity);
        hgcVar3.Y = dgcVar;
        dgcVar.setOrientation(1);
        hgcVar3.Y.setFocusable(true);
        hgcVar3.Y.setFocusableInTouchMode(true);
        hgcVar3.E = new yl5(activity);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.q(user);
        yl5 yl5Var = hgcVar3.E;
        int i6 = hgcVar3.a;
        yl5Var.b.m(gl5.m(i6, 0, user), null, pb0Var, user);
        hgcVar3.E.setRoundRadius(gl.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        hgcVar3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        hgcVar3.F.setText(vu3.m(qu2.m(0, user.first_name, user.last_name), hgcVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
        hgcVar3.F.setMaxLines(2);
        hgcVar3.F.setEllipsize(TextUtils.TruncateAt.END);
        hgcVar3.F.setTextColor(-1);
        hgcVar3.F.setGravity(1);
        hgcVar3.F.setImportantForAccessibility(2);
        hgcVar3.Y.addView(hgcVar3.F, nme.t(-2, -2, 1, 8, 0, 8, 6));
        xhc xhcVar = new xhc(activity);
        xhcVar.a = new TextView[2];
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            xhcVar.a[i7] = new TextView(activity);
            xhcVar.a[i7].setTextSize(1, 15.0f);
            xhcVar.a[i7].setTextColor(-1);
            xhcVar.a[i7].setGravity(1);
            xhcVar.addView(xhcVar.a[i7]);
            i7++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        xhcVar.c = frameLayout2;
        qk8 qk8Var = new qk8(xhcVar, activity, lfcVar);
        qk8Var.setTextSize(1, 15.0f);
        qk8Var.setTextColor(-1);
        qk8Var.setGravity(1);
        qk8Var.setPadding(gl.L(12.0f), gl.L(2.0f), gl.L(12.0f), gl.L(2.0f));
        qk8Var.setText(k96.M0(2131742975, null));
        frameLayout2.addView(qk8Var, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        xhcVar.addView(frameLayout2, nme.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        xhcVar.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        xhcVar.addView(textView3, nme.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131743011, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new s0(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        bic bicVar = new bic(activity);
        xhcVar.d = bicVar;
        xhcVar.addView(bicVar, nme.c(-2.0f, -1));
        hgcVar3.G = xhcVar;
        WeakHashMap weakHashMap2 = jdc.a;
        xhcVar.setImportantForAccessibility(4);
        hgcVar3.Y.addView(hgcVar3.G, nme.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            ggc ggcVar = new ggc(activity);
            hgcVar3.H = ggcVar;
            long j = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i9 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null) {
                size = groupParticipants.size();
            } else if (i9 <= 0) {
                ggcVar.setVisibility(8);
                hgcVar3.Y.addView(hgcVar3.H, nme.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
            } else {
                size = 0;
            }
            int max = Math.max(i9, size);
            int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
            gc0 gc0Var = ggcVar.b;
            gc0Var.i(min);
            int i10 = 0;
            while (i10 < min) {
                gc0Var.j(i10, i6, na7.q1(i6).Z1(cf3.n(groupParticipants.get(i10).peer)));
                i10++;
                j = j;
            }
            long j2 = j;
            gc0Var.a(false, true);
            if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && cf3.n(groupParticipants.get(0).peer) == j2))) {
                ggcVar.setVisibility(8);
            } else {
                ggcVar.c = new tgb(k96.H(',', "Participants", max), 14.0f, gl.o());
                ggcVar.setVisibility(0);
                ggcVar.invalidate();
            }
            hgcVar3.Y.addView(hgcVar3.H, nme.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        hgcVar3.Y.setClipChildren(false);
        hgcVar3.Y.setClipToPadding(false);
        hgcVar3.Y.setPadding(0, 0, 0, gl.L(15.0f));
        hgcVar3.V = new w24(activity);
        hgcVar3.R = new jo0(activity, lfcVar);
        hgcVar3.V.setAlpha(0.0f);
        hgcVar3.R.setVisibility(8);
        cgcVar.addView(hgcVar3.E, nme.d(kk7.h3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.Y, nme.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.P, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.S, nme.d(kk7.a5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.O, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.V, nme.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        cgcVar.addView(hgcVar3.R, nme.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        hgcVar3.j0 = new mfc(activity);
        hgcVar3.e = new ric(activity, lfcVar);
        hgcVar3.f = new ric(activity, lfcVar);
        hgcVar3.h = new ric(activity, lfcVar);
        hgcVar3.n = new egc(activity, 52.0f);
        hgcVar3.e.setTranslationY(gl.L(100.0f));
        hgcVar3.e.setScaleX(0.0f);
        hgcVar3.e.setScaleY(0.0f);
        hgcVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hgcVar3.f.setTranslationY(gl.L(100.0f));
        hgcVar3.f.setScaleX(0.0f);
        hgcVar3.f.setScaleY(0.0f);
        hgcVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hgcVar3.h.setTranslationY(gl.L(100.0f));
        hgcVar3.h.setScaleX(0.0f);
        hgcVar3.h.setScaleY(0.0f);
        hgcVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hgcVar3.n.setTranslationY(gl.L(100.0f));
        hgcVar3.n.setScaleX(0.0f);
        hgcVar3.n.setScaleY(0.0f);
        hgcVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        hgcVar3.j0.addView(hgcVar3.e);
        hgcVar3.j0.addView(hgcVar3.f);
        hgcVar3.j0.addView(hgcVar3.h);
        hgcVar3.j0.addView(hgcVar3.n);
        n4 n4Var = new n4(activity);
        hgcVar3.f0 = n4Var;
        n4Var.setListener(new fgc(hgcVar3));
        hgcVar3.f0.setScaleX(1.15f);
        hgcVar3.f0.setScaleY(1.15f);
        cgcVar.addView(hgcVar3.j0, nme.e(-1, -2, 80));
        float f = gl.O1() ? 100 : 27;
        cgcVar.addView(hgcVar3.f0, nme.d(-1, 186.0f, 80, f, 0.0f, f, 0.0f));
        ImageView imageView = new ImageView(activity);
        hgcVar3.J = imageView;
        imageView.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
        hgcVar3.J.setImageResource(R.drawable.msg_addcontact);
        hgcVar3.J.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        cgcVar.addView(hgcVar3.J, nme.e(56, 56, 53));
        ote.a(hgcVar3.J);
        ImageView imageView2 = new ImageView(activity);
        hgcVar3.I = imageView2;
        imageView2.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
        hgcVar3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        hgcVar3.I.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        hgcVar3.I.setContentDescription(k96.M0(2131753753, null));
        cgcVar.addView(hgcVar3.I, nme.e(56, 56, 51));
        ote.a(hgcVar3.I);
        v31 v31Var = new v31((Context) activity, (byte) 5);
        hgcVar3.L = v31Var;
        v31Var.setContentDescription(k96.M0(2131742997, null));
        hgcVar3.L.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
        hgcVar3.L.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        cgcVar.addView(hgcVar3.L, nme.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        hgcVar3.L.setAlpha(0.0f);
        hgcVar3.L.setOnClickListener(new tfc(hgcVar3, (byte) 5));
        byte b2 = 6;
        hgcVar3.I.setOnClickListener(new tfc(hgcVar3, b2));
        hgcVar3.J.setOnClickListener(new vzb(hgcVar3, activity, (byte) 10));
        if (hgcVar3.u0.b) {
            hgcVar3.I.setVisibility(8);
            hgcVar3.J.setVisibility(8);
        }
        tgc tgcVar = new tgc(activity);
        tgcVar.a = new HashMap();
        tgcVar.b = new ArrayList();
        tgcVar.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        tgcVar.r = textPaint;
        tgcVar.setOrientation(1);
        tgcVar.n = lfcVar;
        TransitionSet transitionSet = new TransitionSet();
        tgcVar.d = transitionSet;
        byte b3 = 5;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new h7(b3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(gl.L(14.0f));
        hgcVar3.M0 = tgcVar;
        tgcVar.setGravity(80);
        hgcVar3.M0.setOnViewsUpdated(new sfc(hgcVar3, b3));
        cgcVar.addView(hgcVar3.M0, nme.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        cg2 cg2Var = new cg2(activity, 3, lfcVar, true);
        cg2Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        cg2Var.L = alignment;
        cg2Var.d = -1L;
        cg2Var.r0 = new sfc(hgcVar3, b2);
        cg2Var.U = true;
        cg2Var.h = gl.L(320.0f);
        cg2Var.e = true;
        cg2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
        cg2Var.q(8.0f);
        hgcVar3.N0 = cg2Var;
        cg2Var.t(k96.M0(2131744013, null));
        cgcVar.addView(hgcVar3.N0, nme.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        cg2 cg2Var2 = new cg2(activity, 1, lfcVar, false);
        cg2Var2.p(true);
        cg2Var2.L = alignment;
        cg2Var2.d = 4000L;
        cg2Var2.U = true;
        cg2Var2.h = gl.L(320.0f);
        cg2Var2.e = true;
        cg2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
        cg2Var2.q(8.0f);
        hgcVar3.O0 = cg2Var2;
        cg2Var2.t(k96.M0(2131743060, null));
        cgcVar.addView(hgcVar3.O0, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hgcVar3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!hgcVar3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                hgcVar3.U0 = phoneCall != null && phoneCall.video;
            }
            hgcVar3.f();
        }
        agcVar2.addView(cgcVar);
        if (z) {
            hgcVar3.F0 = 0.0f;
            hgcVar3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                hgcVar3.d0.setStub(xgc.d().s);
                hgcVar3.e0.setStub(xgc.d().r);
            }
            hgcVar3.u0.setAlpha(0.0f);
            hgcVar3.y();
            hgcVar3.E0 = true;
            xgc.T = true;
            if (xgc.V != null) {
                xgc.U.getClass();
                throw null;
            }
            hgcVar3.L0.d();
            gl.e3(new sfc(hgcVar3, (byte) 11), 32L);
        } else {
            hgcVar3.F0 = 1.0f;
            hgcVar3.x();
        }
        ygc.b();
    }

    public final ValueAnimator a(boolean z) {
        char c;
        float measuredWidth;
        final float measuredHeight;
        final float f;
        final boolean z2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z3;
        this.Z.animate().cancel();
        float f7 = xgc.d().d.x + xgc.d().F;
        float f8 = xgc.d().d.y + xgc.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        xgc.U.getClass();
        final float measuredWidth2 = f7 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        pfc pfcVar = this.Z;
        final float f9 = 0.0f;
        if (z4) {
            int measuredWidth3 = pfcVar.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c = 0;
                f5 = 0.0f;
                measuredWidth = 1.0f;
                f6 = 1.0f;
                z3 = false;
            } else {
                f5 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = oo1.v(xgc.d().f, 0.25f, 0.4f, (xgc.d().f * 0.25f) + (f7 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f5)) / 2.0f))) - gl.L(4.0f);
                f6 = oo1.v(xgc.d().h, 0.25f, 0.4f, (xgc.d().h * 0.25f) + (f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f5)) / 2.0f))) - gl.L(4.0f);
                z3 = true;
            }
            float f10 = f5;
            measuredHeight = f6;
            z2 = z3;
            f = f10;
        } else {
            c = 0;
            measuredWidth = f7 - ((pfcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f11 = measuredWidth;
        final float L = this.m0 ? gl.L(4.0f) : 0.0f;
        final float L2 = (gl.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            xgc.U.getClass();
        } else {
            f9 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.Z.setScaleX(f);
                this.Z.setScaleY(f);
                this.Z.setTranslationX(f11);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L2);
                this.Z.setAlpha(f9);
            }
            this.d0.setScaleX(0.25f);
            this.d0.setScaleY(0.25f);
            this.d0.setTranslationX(measuredWidth2);
            this.d0.setTranslationY(measuredHeight2);
            f2 = 0.25f;
            this.d0.setRoundCorners((gl.L(6.0f) * 1.0f) / 0.25f);
        } else {
            f2 = 0.25f;
        }
        if (z) {
            f4 = 1.0f;
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
            f4 = 0.0f;
        }
        float[] fArr = new float[2];
        fArr[c] = f4;
        fArr[1] = f3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.F0 = z ? 0.0f : 1.0f;
        x();
        final float f12 = f2;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wfc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue;
                hgc hgcVar = hgc.this;
                hgcVar.F0 = f13;
                hgcVar.x();
                if (z2) {
                    float f14 = (f * floatValue) + (scaleX * f13);
                    hgcVar.Z.setScaleX(f14);
                    hgcVar.Z.setScaleY(f14);
                    hgcVar.Z.setTranslationX((f11 * floatValue) + (x * f13));
                    hgcVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f13));
                    hgcVar.Z.setCornerRadius((L2 * floatValue) + (L * f13));
                    hgcVar.Z.setAlpha((f9 * floatValue) + (1.0f * f13));
                }
                float f15 = (f12 * floatValue) + (1.0f * f13);
                hgcVar.d0.setScaleX(f15);
                hgcVar.d0.setScaleY(f15);
                float f16 = 0.0f * f13;
                float f17 = (measuredWidth2 * floatValue) + f16;
                float f18 = (measuredHeight2 * floatValue) + f16;
                hgcVar.d0.setTranslationX(f17);
                hgcVar.d0.setTranslationY(f18);
                hgcVar.d0.setRoundCorners(((gl.L(4.0f) * floatValue) * 1.0f) / f15);
                if (!hgcVar.Z.Q) {
                    hgcVar.e0.d(false, floatValue);
                }
                hgcVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        kk7.e().n(this, kk7.Q4);
        kk7.f(this.a).n(this, kk7.O4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.D2);
        kk7.e().n(this, kk7.I5);
        s7c s7cVar = this.N;
        if (s7cVar != null) {
            s7cVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            hic hicVar = this.x;
            byte b = 1;
            if (hicVar.L && z != hicVar.F) {
                hicVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                hicVar.c = ofFloat;
                ofFloat.addUpdateListener(new gic(hicVar, b));
                hicVar.c.setInterpolator(s33.f);
                hicVar.c.setDuration(200L);
                hicVar.c.start();
            }
            if (z) {
                int i = gba.c1;
                if (i < 2) {
                    gba.c1 = i + 2;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gba.c1);
                    edit.apply();
                }
                this.O0.f(true);
                gl.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(gl.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(s33.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(s33.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(gl.L(140.0f));
                s33 s33Var = s33.f;
                ug8.t(translationY, s33Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-gl.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new xfc(this, (byte) 3)).setInterpolator(s33Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(s33.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                s33 s33Var2 = s33.f;
                duration.setInterpolator(s33Var2).setListener(new id4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(s33Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gl.L(120.0f)).setListener(new xfc(this, (byte) 4)).setDuration(250L).setInterpolator(s33Var2).start();
            }
            this.q0 = this.p0;
            y();
        }
    }

    public final void d() {
        this.u0.b();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.O4) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.e0.d.release();
            this.d0.d.release();
            this.c0.release();
            f();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i == kk7.k4) {
            v(true);
            return;
        }
        if (i == kk7.D2) {
            this.u0.b();
            return;
        }
        if (i == kk7.Q4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i == kk7.I5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        hgc hgcVar;
        byte b = 0;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            hgcVar = this;
            ofFloat.addUpdateListener(new xq4(hgcVar, this.f1, this.Y0, this.Z0, (byte) 2));
            hgcVar.i1.addListener(new xfc(hgcVar, b));
            hgcVar.i1.setDuration(350L);
            hgcVar.i1.setInterpolator(s33.f);
            hgcVar.i1.start();
        } else {
            hgcVar = this;
        }
        hgcVar.h1 = false;
        hgcVar.a1 = false;
    }

    public final void f() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yfc(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zfc(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.G0 || this.E0) {
            return;
        }
        bgc bgcVar = this.o0;
        if (bgcVar != null) {
            bgcVar.a(false, false);
            return;
        }
        if (this.m0 && this.n0 && this.H0) {
            this.H0 = false;
            this.Z.setRelativePosition(this.a0);
            this.b0 = false;
            this.q0 = this.p0;
            y();
            return;
        }
        if (this.C0) {
            c(false);
            return;
        }
        if (this.S.getVisibility() == 8) {
            if (!this.D0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isConverting()) {
                this.u0.b();
                return;
            }
            if (this.G0 || m1 == null) {
                return;
            }
            byte b = 1;
            this.G0 = true;
            if (VoIPService.getSharedInstance() != null) {
                int measuredHeight = m1.u0.getMeasuredHeight();
                hgc hgcVar = m1;
                xgc.f(hgcVar.b, hgcVar.a, hgcVar.u0.getMeasuredWidth(), measuredHeight, 1);
                WindowInsets windowInsets = m1.r0;
                if (windowInsets != null) {
                    xgc.W = windowInsets.getSystemWindowInsetTop();
                    m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (xgc.d() != null) {
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var).start();
                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                xgc.T = true;
                this.E0 = true;
                ValueAnimator a = a(false);
                this.L0.d();
                a.addListener(new xfc(this, b));
                a.setDuration(350L);
                a.setInterpolator(s33Var);
                a.start();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.f0.getLocationOnScreen(new int[2]);
            n4 n4Var = this.f0;
            ValueAnimator valueAnimator = n4Var.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                n4Var.c0 = null;
                n4Var.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        n4 n4Var2 = this.f0;
        ValueAnimator valueAnimator2 = n4Var2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            n4Var2.c0 = null;
            n4Var2.V.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, k96.M0(2131743169, null), false, false);
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
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        final int L = gl.L(24.0f);
        final int L2 = gl.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ufc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                hgc hgcVar = hgc.this;
                hgcVar.f0.setTranslationY(L2 * floatValue);
                int i = (int) (marginEnd - ((r0 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i;
                marginLayoutParams2.rightMargin = i;
                hgcVar.f0.requestLayout();
            }
        });
        n4 n4Var3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n4Var3, (Property<n4, Float>) View.SCALE_X, n4Var3.getScaleX(), 1.0f, 1.0f, 1.0f);
        n4 n4Var4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n4Var4, (Property<n4, Float>) View.SCALE_Y, n4Var4.getScaleY(), 1.0f, 1.0f, 1.0f);
        n4 n4Var5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(n4Var5, (Property<n4, Float>) View.ALPHA, n4Var5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new eh8((Object) this, (Object) runnable, (byte) 21));
        animatorSet.start();
        gl.e3(new sfc(this, (byte) 7), 133L);
    }

    public final void j(ric ricVar, VoIPService voIPService) {
        if (!this.n0) {
            ricVar.d(2, false, false);
            ricVar.setOnBtnClickedListener(null);
            ricVar.setEnabled(false);
        } else {
            ricVar.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                ricVar.d(2, !voIPService.isSwitchingCamera(), false);
            } else {
                ricVar.d(2, voIPService.isSwitchingCamera(), false);
            }
            ricVar.setOnBtnClickedListener(new io9(this, voIPService, ricVar, (byte) 10));
        }
    }

    public final void k(ric ricVar, VoIPService voIPService, boolean z) {
        ricVar.d(1, voIPService.isMicMute(), false);
        pfc pfcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = pfcVar.g0;
        if (z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(pfcVar.L, isMicMute ? 1.0f : 0.0f);
            pfcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(pfcVar.h0);
            pfcVar.g0.setDuration(150L);
            pfcVar.g0.start();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            pfcVar.L = isMicMute ? 1.0f : 0.0f;
            pfcVar.invalidate();
        }
        ricVar.setOnBtnClickedListener(new rfc(this, (byte) 4));
    }

    public final void l(final ric ricVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            ricVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            ricVar.d(5, true, false);
        } else {
            ricVar.d(5, false, false);
            i = 1;
        }
        ricVar.setEnabled(true);
        ricVar.setOnBtnClickedListener(new pic() { // from class: vfc
            @Override // pic
            public final void a(qic qicVar) {
                if (VoIPService.getSharedInstance() != null) {
                    hgc hgcVar = hgc.this;
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(hgcVar.b, false, Integer.valueOf(i));
                    hgcVar.l(ricVar, voIPService);
                }
            }
        });
    }

    public final void m(ric ricVar, VoIPService voIPService, boolean z) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            ricVar.d(3, true, false);
            ricVar.setOnClickListener(null);
            ricVar.setEnabled(false);
            return;
        }
        if (!this.n0) {
            ricVar.d(3, true, z);
        } else if (voIPService.isScreencast()) {
            ricVar.d(3, false, z);
        } else {
            ricVar.d(3, false, z);
        }
        ricVar.setOnBtnClickedListener(new rfc(this, (byte) 5));
        ricVar.setEnabled(true);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3 = (this.n0 || this.m0) ? false : true;
        yl5 yl5Var = this.E;
        byte b = 8;
        if (!z) {
            yl5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            this.E.setVisibility(z3 ? 0 : 8);
        } else if (z3) {
            if (yl5Var.getTag() == null) {
                this.E.animate().setListener(null).cancel();
                this.E.setVisibility(0);
                if (!this.C0) {
                    yl5 yl5Var2 = this.E;
                    if (z2) {
                        yl5Var2.setAlpha(0.0f);
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                    } else {
                        yl5Var2.setAlpha(0.0f);
                        this.E.setTranslationY(-gl.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                    }
                } else if (z2) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(gl.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            }
        } else if (yl5Var.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(s33.f).setListener(new xfc(this, b)).start();
        }
        this.E.setTag(z3 ? 1 : null);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
        this.q0 = this.p0;
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
        this.q0 = this.p0;
        if (i2 == 2 && !this.U0) {
            this.U0 = true;
        }
        ygc.b();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
        kic kicVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G == null || (kicVar = this.w) == null) {
            return;
        }
        int i2 = kicVar.W;
        if ((i2 == 2 || i2 == 3) && this.j1) {
            gl.e3(new on7((Object) this, i, (byte) 23), 400L);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        int i2 = this.p0;
        if (i2 != i) {
            this.q0 = i2;
            this.p0 = i;
            if (this.u0 != null) {
                y();
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
        this.q0 = this.p0;
        if (z && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        d53 d53Var = new d53(0, null, this.b);
        boolean[] zArr = new boolean[3];
        d53Var.S = k96.M0(2131743166, null);
        d53Var.U = charSequence;
        d53Var.m0 = k96.M0(2131747638, null);
        d53Var.n0 = null;
        d53Var.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) d53Var.c(-(i + 1))) != null) {
                zkb.X(textView, bkb.p7, d53Var.j1);
            }
        }
        d53Var.setCanceledOnTouchOutside(true);
        d53Var.setOnDismissListener(new ph8(this, (byte) 14));
    }

    public final void q(int i, boolean z) {
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.x0);
        }
        if (!z && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        pfc pfcVar = this.Z;
        if (i != 0) {
            boolean z2 = (pfcVar.getTag() == null || ((Integer) this.Z.getTag()).intValue() == 0) ? false : z;
            pfc pfcVar2 = this.Z;
            if (!z) {
                pfcVar2.setVisibility(0);
            } else if (pfcVar2.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                if (this.Z.getVisibility() == 8) {
                    this.Z.setAlpha(0.0f);
                    this.Z.setScaleX(0.7f);
                    this.Z.setScaleY(0.7f);
                    this.Z.setVisibility(0);
                }
                AnimatorSet animatorSet2 = this.A0;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    this.A0.cancel();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<pfc, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<pfc, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<pfc, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                pfc pfcVar3 = this.Z;
                if (pfcVar3.E < 0.0f) {
                    pfcVar3.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            this.Z.c(i == 2, z2);
            this.b0 = i != 2;
        } else if (!z) {
            pfcVar.setVisibility(8);
        } else if (pfcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            pfc pfcVar4 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(pfcVar4, (Property<pfc, Float>) View.ALPHA, pfcVar4.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                pfc pfcVar5 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pfcVar5, (Property<pfc, Float>) View.SCALE_X, pfcVar5.getScaleX(), 0.7f);
                pfc pfcVar6 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(pfcVar6, (Property<pfc, Float>) View.SCALE_Y, pfcVar6.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new xfc(this, (byte) 7));
            this.A0.setDuration(250L).setInterpolator(s33.f);
            this.A0.setStartDelay(50L);
            this.A0.start();
        }
        this.Z.setTag(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z2 = this.x0;
        uwb uwbVar = this.Q0;
        if (z) {
            if (!z2) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                s33 s33Var = s33.f;
                translationY.setInterpolator(s33Var).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(s33Var).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(uwbVar);
                this.P0.setDuration(150L).setInterpolator(s33Var);
                this.P0.start();
                this.j0.setEnabled(true);
            }
        } else if (z2) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-gl.L(10.0f)).setDuration(150L);
            s33 s33Var2 = s33.f;
            duration.setInterpolator(s33Var2).start();
            this.I.animate().alpha(0.0f).translationY(-gl.L(10.0f)).setDuration(150L).setInterpolator(s33Var2).start();
            this.J.animate().alpha(0.0f).translationY(-gl.L(10.0f)).setDuration(150L).setInterpolator(s33Var2).start();
            this.O.animate().alpha(0.0f).translationY(-gl.L(10.0f)).setDuration(150L).setInterpolator(s33Var2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-gl.L(10.0f)).setInterpolator(s33Var2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-gl.L(10.0f)).setInterpolator(s33Var2).start();
            this.j0.animate().alpha(0.0f).translationY(gl.L(10.0f)).setDuration(150L).setInterpolator(s33Var2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(uwbVar);
            this.P0.setDuration(150L).setInterpolator(s33Var2);
            this.P0.start();
            gl.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.f(true);
            i = kk7.f2;
            this.x0 = z;
            agc agcVar = this.u0;
            if (z) {
                agcVar.setSystemUiVisibility(agcVar.getSystemUiVisibility() | 4);
            } else {
                agcVar.setSystemUiVisibility(agcVar.getSystemUiVisibility() & (-5));
            }
            this.M0.animate().translationY((-gl.L(16.0f)) - (this.x0 ? gl.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(s33.f).start();
        }
        i = 0;
        this.x0 = z;
        agc agcVar2 = this.u0;
        if (z) {
        }
        this.M0.animate().translationY((-gl.L(16.0f)) - (this.x0 ? gl.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(s33.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            sfc sfcVar = this.S0;
            gl.r(sfcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                gl.e3(sfcVar, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? k96.M0(2131754731, null) : k96.M0(2131754732, null));
            }
            if (this.n0) {
                this.e0.c();
                sharedInstance.setVideoState(false, 0);
                sharedInstance.clearCamera();
                this.q0 = this.p0;
                y();
                return;
            }
            if (this.o0 == null) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                this.u0.setLockOnScreen(true);
                this.f.getLocationOnScreen(new int[2]);
                bgc bgcVar = new bgc(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = bgcVar;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    bgcVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                }
                this.s.addView(this.o0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new h7((byte) 4).setDuration(250L);
                s33 s33Var = s33.f;
                transitionSet.addTransition(duration.setInterpolator(s33Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(s33Var));
                transitionSet.excludeChildren(dic.class, true);
                transitionSet.excludeChildren(ric.class, true);
                TransitionManager.beginDelayedTransition(this.j0, transitionSet);
            }
            int i = this.p0;
            if (i == 11) {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
                this.n.setVisibility(8);
                return;
            }
            int i2 = 0;
            if (i == 15 || i == 17) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i == 15) {
                    if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                        l(this.e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    } else {
                        j(this.e, sharedInstance);
                        if (this.x0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    }
                    m(this.f, sharedInstance, false);
                    k(this.h, sharedInstance, z);
                } else {
                    this.e.setVisibility(8);
                    this.f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.n.setVisibility(8);
            } else {
                if (m1 == null) {
                    return;
                }
                if (sharedInstance.isScreencast() || !(this.n0 || this.m0)) {
                    l(this.e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                } else {
                    j(this.e, sharedInstance);
                    if (this.x0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                }
                m(this.f, sharedInstance, false);
                k(this.h, sharedInstance, z);
                this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, k96.M0(2131743169, null), false, z);
                this.n.setOnClickListener(new tfc(this, null == true ? 1 : 0));
            }
            if (this.e.getVisibility() == 0) {
                this.e.f = 0;
                i2 = 16;
            }
            if (this.f.getVisibility() == 0) {
                this.f.f = i2;
                i2 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f = i2;
                i2 += 16;
            }
            if (this.n.getVisibility() == 0) {
                this.n.G = i2;
            }
            w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Type inference failed for: r0v17, types: [be0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [vl] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r2v19, types: [be0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [be0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r6v0, types: [be0[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r6;
        Drawable[] drawableArr;
        boolean z2;
        ml mlVar;
        String[] strArr;
        TLRPC.Document document;
        ?? r0;
        int i;
        if (this.B0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean z3 = false;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(sharedInstance.getEncryptionKey());
            byteArrayOutputStream.write(sharedInstance.getGA());
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            fa4.g(e, false);
            bArr = null;
        }
        if (bArr != null) {
            String[] emojifyForCall = EncryptionKeyEmojifier.emojifyForCall(Utilities.o(bArr.length, bArr));
            int i2 = 0;
            while (true) {
                r6 = this.W;
                drawableArr = this.X;
                if (i2 >= 4) {
                    break;
                }
                vu3.k(emojifyForCall[i2]);
                ru3 g = vu3.g(emojifyForCall[i2]);
                if (g != null) {
                    g.setBounds(z3 ? 1 : 0, z3 ? 1 : 0, gl.L(40.0f), gl.L(40.0f));
                    g.b();
                    int[] iArr = new int[1];
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(gl.L(28.0f));
                    CharSequence m = vu3.m(emojifyForCall[i2], textPaint.getFontMetricsInt(), z3, iArr, z3 ? 1 : 0);
                    boolean z4 = m instanceof Spannable;
                    int i3 = this.a;
                    if (z4) {
                        Spannable spannable = (Spannable) m;
                        su3[] su3VarArr = (su3[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), su3.class);
                        gm[] gmVarArr = (gm[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), gm.class);
                        if (su3VarArr != null) {
                            if ((iArr[z3 ? 1 : 0] - su3VarArr.length) - (gmVarArr == null ? z3 ? 1 : 0 : gmVarArr.length) <= 0) {
                                int length = su3VarArr.length;
                                int i4 = z3 ? 1 : 0;
                                ?? r3 = z3;
                                while (i4 < length) {
                                    su3 su3Var = su3VarArr[i4];
                                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                    TLRPC.TL_messages_stickerSet m0 = hq6.d0(i3).m0(tL_inputStickerSetShortName, Integer.valueOf((int) r3), false, true, new ae9(this, (byte) 24));
                                    if (m0 != null) {
                                        String replace = su3Var.d.replace("️", "");
                                        ArrayList<TLRPC.Document> arrayList = m0.documents;
                                        int size = arrayList.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size) {
                                                strArr = emojifyForCall;
                                                i = length;
                                                document = null;
                                                break;
                                            }
                                            TLRPC.Document document2 = arrayList.get(i5);
                                            i5++;
                                            strArr = emojifyForCall;
                                            document = document2;
                                            ArrayList<TLRPC.Document> arrayList2 = arrayList;
                                            i = length;
                                            if (TextUtils.equals(k27.V(document, null, null).replace("️", ""), replace)) {
                                                break;
                                            }
                                            length = i;
                                            emojifyForCall = strArr;
                                            arrayList = arrayList2;
                                        }
                                        if (document != null) {
                                            break;
                                        }
                                        i4++;
                                        length = i;
                                        emojifyForCall = strArr;
                                        r3 = 0;
                                    }
                                }
                            }
                        }
                        strArr = emojifyForCall;
                        document = null;
                        if (document == null) {
                            Drawable drawable = drawableArr[i2];
                            if ((drawable instanceof vl) && ((vl) drawable).h() == document.id) {
                                r0 = (vl) drawableArr[i2];
                            } else {
                                vl vlVar = new vl(21, i3, document);
                                drawableArr[i2] = vlVar;
                                r0 = vlVar;
                            }
                            r0.q(strArr[i2]);
                            r6[i2].setAnimatedEmojiDrawable(r0);
                            r6[i2].getImageReceiver().f();
                            g = r0;
                        } else {
                            r6[i2].setImageDrawable(g);
                        }
                        r6[i2].setVisibility(8);
                    }
                    strArr = emojifyForCall;
                    document = null;
                    if (document == null) {
                    }
                    r6[i2].setVisibility(8);
                } else {
                    strArr = emojifyForCall;
                }
                drawableArr[i2] = g;
                i2++;
                emojifyForCall = strArr;
                z3 = false;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < 4; i7++) {
                Drawable drawable2 = drawableArr[i7];
                if (drawable2 instanceof ru3) {
                    z2 = ((ru3) drawable2).a();
                } else {
                    if ((drawable2 instanceof vl) && (mlVar = ((vl) drawable2).k) != null) {
                        Drawable drawable3 = mlVar.b0;
                        if (!(drawable3 instanceof ru3) || ((ru3) drawable3).a()) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    i6++;
                }
            }
            if (i6 == 4) {
                this.B0 = true;
                for (int i8 = 0; i8 < 4; i8++) {
                    if (r6[i8].getVisibility() != 0) {
                        r6[i8].setVisibility(0);
                        if (z) {
                            r6[i8].setAlpha(0.0f);
                            r6[i8].setScaleX(0.0f);
                            r6[i8].setScaleY(0.0f);
                            ug8.t(r6[i8].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), s33.k, 250L);
                        }
                    }
                }
                this.O0.postDelayed(new sfc(this, (byte) 9), 1000L);
            }
        }
    }

    public final void w() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int i = sharedInstance.isBluetoothOn() ? R.drawable.calls_bluetooth : VoipAudioManager.get().isSpeakerphoneOn() ? R.drawable.calls_speaker : sharedInstance.isHeadsetPlugged() ? R.drawable.calls_menu_headset : R.drawable.calls_menu_phone;
        int i2 = this.K;
        v31 v31Var = this.L;
        if (i2 != i) {
            gl.M3(v31Var, i);
        } else {
            v31Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(bm2.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(bm2.o(-16777216, (int) (127.5f * this.F0)));
        cgc cgcVar = this.s;
        if (cgcVar != null) {
            cgcVar.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0d46 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07b2  */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TLRPC.User user;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int L;
        boolean z5;
        float f;
        int i2;
        int childsHight;
        pfc pfcVar;
        pfc pfcVar2;
        boolean z6;
        boolean z7;
        boolean z8;
        aic aicVar;
        VideoSink videoSink;
        boolean isMicMute;
        int i3;
        int remoteAudioState;
        int i4;
        int remoteVideoState;
        boolean z9;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j;
        s33 s33Var;
        Layout layout;
        int lineCount;
        float f2;
        float f3;
        TL_phone.PhoneCall phoneCall2;
        float f4;
        boolean z10;
        boolean z11;
        TextView textView;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z12 = true;
        byte b = 0;
        boolean z13 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i5 = this.p0;
        TLRPC.User user2 = this.d;
        int i6 = 2;
        if (i5 == 1 || i5 == 2) {
            user = user2;
            this.G.b(k96.M0(2131743177, null), true, z13);
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    this.G.b(k96.M0(2131743166, null), false, z13);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        user = user2;
                        gl.e3(new sfc(this, (byte) 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        user = user2;
                        p(gl.T2(k96.a0("VoipPeerIncompatible", null, 2131743021, qu2.m(0, user.first_name, user.last_name))));
                    } else {
                        user = user2;
                        if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                            if (this.U0) {
                                String a0 = k96.a0("VoipPeerVideoOutdated", null, 2131743019, l7c.k(user, true));
                                boolean[] zArr = new boolean[1];
                                d53 d53Var = new d53(0, null, this.b);
                                boolean[] zArr2 = new boolean[3];
                                d53Var.S = k96.M0(2131743166, null);
                                d53Var.U = gl.T2(a0);
                                String M0 = k96.M0(2131752577, null);
                                rfc rfcVar = new rfc(this, (byte) 1);
                                d53Var.o0 = M0;
                                d53Var.p0 = rfcVar;
                                String M02 = k96.M0(2131743018, null);
                                cwb cwbVar = new cwb(this, zArr, (byte) 6);
                                d53Var.m0 = M02;
                                d53Var.n0 = cwbVar;
                                d53Var.show();
                                for (int i7 = 0; i7 < 3; i7++) {
                                    if (zArr2[i7] && (textView = (TextView) d53Var.c(-(i7 + 1))) != null) {
                                        zkb.X(textView, bkb.p7, d53Var.j1);
                                    }
                                }
                                d53Var.setCanceledOnTouchOutside(true);
                                d53Var.setOnDismissListener(new cf(this, zArr, (byte) 17));
                            } else {
                                p(gl.T2(k96.a0("VoipPeerOutdated", null, 2131743020, l7c.k(user, true))));
                            }
                        } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                            p(gl.T2(k96.a0(null, null, 2131752594, qu2.m(0, user.first_name, user.last_name))));
                            ij.i0(this.b, this.a, user.id);
                        } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                            p("Error initializing audio hardware");
                        } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                            this.u0.b();
                        } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                            p(k96.M0(2131743168, null));
                        } else {
                            gl.e3(new sfc(this, (byte) 1), 1000L);
                        }
                    }
                } else if (i5 != 5) {
                    switch (i5) {
                        case 11:
                            boolean z14 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z14 || this.G0) {
                                gl.e3(new sfc(this, (byte) 0), 200L);
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i8 = gl.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i8 - iArr[0]) - ((this.n.getMeasuredWidth() - gl.L(52.0f)) / 2)) - gl.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.V.setTranslationY(iArr[1]);
                                    this.V.setAlpha(1.0f);
                                    this.V.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    gl.e3(new l3c(this, sharedInstance, (byte) 28), 2L);
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                                    layoutParams.rightMargin = gl.L(18.0f);
                                    layoutParams.leftMargin = gl.L(18.0f);
                                    int L2 = gl.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.V.setLayoutParams(layoutParams);
                                    this.V.animate().alpha(1.0f).setDuration(250L).start();
                                    this.V.a(new qfc(this, sharedInstance, b), false);
                                }
                                this.R.setVisibility(0);
                                jo0 jo0Var = this.R;
                                rfc rfcVar2 = new rfc(this, b);
                                dz8[] dz8VarArr = (dz8[]) jo0Var.d;
                                jo0Var.e = rfcVar2;
                                st stVar = (st) jo0Var.c;
                                stVar.setVisibility(0);
                                ((FrameLayout) jo0Var.b).setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(stVar, (Property<st, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(stVar, (Property<st, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(stVar, (Property<st, Float>) property3, 0.7f, 1.0f);
                                Property property4 = View.TRANSLATION_Y;
                                float f5 = 0.0f;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(stVar, (Property<st, Float>) property4, gl.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(s33.f);
                                animatorSet.setDuration(250L);
                                int i9 = 0;
                                while (i9 < dz8VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    dz8VarArr[i9].setAlpha(f5);
                                    float[] fArr = new float[i6];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(dz8VarArr[i9], (Property<dz8, Float>) property, fArr);
                                    float[] fArr2 = new float[i6];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dz8VarArr[i9], (Property<dz8, Float>) property2, fArr2);
                                    float[] fArr3 = new float[i6];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(dz8VarArr[i9], (Property<dz8, Float>) property3, fArr3);
                                    dz8 dz8Var = dz8VarArr[i9];
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr4 = new float[i6];
                                    fArr4[0] = gl.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(dz8Var, (Property<dz8, Float>) property4, fArr4);
                                    int i10 = i6;
                                    Animator[] animatorArr = new Animator[4];
                                    animatorArr[0] = ofFloat4;
                                    animatorArr[1] = ofFloat5;
                                    animatorArr[i10] = ofFloat6;
                                    animatorArr[3] = ofFloat7;
                                    animatorSet2.playTogether(animatorArr);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i9 << 4);
                                    animatorSet2.start();
                                    i9++;
                                    animatorSet = animatorSet3;
                                    i6 = i10;
                                    f5 = 0.0f;
                                }
                                int i11 = i6;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    s33 s33Var2 = s33.f;
                                    duration.setInterpolator(s33Var2).setListener(new id4(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(s33Var2).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gl.L(120.0f)).setListener(new id4(this.P)).setDuration(250L).setInterpolator(s33Var2).start();
                                }
                                for (be0 be0Var : this.W) {
                                    be0Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(s33.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new xfc(this, (byte) 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                s33 s33Var3 = s33.f;
                                ug8.t(alpha, s33Var3, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                bic bicVar = this.G.d;
                                bicVar.n = true;
                                bicVar.invalidate();
                                yl5 yl5Var = this.E;
                                yl5Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = yl5Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                yl5Var.c = animatorSet5;
                                Property property5 = View.ALPHA;
                                float[] fArr5 = new float[i11];
                                fArr5[0] = yl5Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(yl5Var, (Property<yl5, Float>) property5, fArr5);
                                Property property6 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i11];
                                fArr6[0] = yl5Var.getTranslationY();
                                fArr6[1] = -gl.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(yl5Var, (Property<yl5, Float>) property6, fArr6);
                                Property property7 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = yl5Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i11] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(yl5Var, (Property<yl5, Float>) property7, fArr7);
                                Property property8 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = yl5Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i11] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(yl5Var, (Property<yl5, Float>) property8, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i11] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                yl5Var.c.setInterpolator(s33Var3);
                                yl5Var.c.setDuration(300L);
                                yl5Var.c.setStartDelay(250L);
                                yl5Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                bgc bgcVar = this.o0;
                                if (bgcVar != null) {
                                    bgcVar.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                            }
                            user = user2;
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.G.b(k96.M0(2131743167, null), true, z13);
                            }
                            user = user2;
                            break;
                        case 13:
                            this.G.b(k96.M0(2131742976, null), true, z13);
                            user = user2;
                            break;
                        case 14:
                            this.G.b(k96.M0(2131743004, null), true, z13);
                            user = user2;
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null) {
                                if (sharedState.isConference()) {
                                    this.G.b(k96.M0(2131743056, null), false, z13);
                                    this.f0.setTranslationY(0.0f);
                                } else if (sharedState.isCallingVideo()) {
                                    this.G.b(k96.M0(2131743055, null), false, z13);
                                    this.f0.setTranslationY(-gl.L(60.0f));
                                }
                                z = false;
                                z2 = false;
                                user = user2;
                                break;
                            }
                            this.G.b(k96.M0(2131743058, null), false, z13);
                            this.f0.setTranslationY(0.0f);
                            z = false;
                            z2 = false;
                            user = user2;
                        case 16:
                            if (this.q0 != 16) {
                                this.G.b(k96.M0(2131743003, null), true, z13);
                            }
                            user = user2;
                            break;
                        case 17:
                            this.G.b(k96.M0(2131743250, null), false, z13);
                            this.f0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z = false;
                            z2 = false;
                            user = user2;
                            break;
                        default:
                            user = user2;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z15 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z10 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z11 = false;
                                this.n0 = z11;
                                if (z11 && !this.U0) {
                                    this.U0 = z10;
                                }
                            }
                        } else {
                            z10 = true;
                        }
                        z11 = z10;
                        this.n0 = z11;
                        if (z11) {
                            this.U0 = z10;
                        }
                    }
                    if (z13) {
                        this.Z.b();
                        this.a0.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f4 = 1.0f;
                        } else {
                            f4 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        aic aicVar2 = this.d0;
                        if (z13) {
                            aicVar2.animate().alpha(f4).setDuration(250L).start();
                        } else {
                            aicVar2.animate().cancel();
                            this.d0.setAlpha(f4);
                        }
                        if (!this.d0.d.isFirstFrameRendered() && !this.I0) {
                            i = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i);
                                aic aicVar3 = this.d0;
                                if (z13) {
                                    aicVar3.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    aicVar3.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z3 = this.n0;
                            if (z3 || !this.m0) {
                                this.H0 = false;
                            }
                            z4 = (z3 || !this.H0 || gl.F1(this.b)) ? false : true;
                            o(z13, z15);
                            L = this.E.getTag() != null ? 0 : gl.L(135.0f) + gl.L(12.0f);
                            if (z13) {
                                this.f0.setVisibility(z12 ? 0 : 8);
                            } else {
                                if (z12 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                }
                                if (!z12 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new xfc(this, (byte) 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z12);
                            this.f0.setTag(!z12 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z5 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z5;
                            if (!z5 && !this.x0) {
                                r(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                gl.e3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i12 = this.p0;
                            boolean z16 = i12 == 11 && this.x0;
                            boolean z17 = (!z12 || i12 == 16 || i12 == 11 || i12 == 12 || i12 == 14 || i12 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            ImageView imageView = this.I;
                            boolean z18 = z16;
                            if (z13) {
                                f = 12.0f;
                                imageView.setVisibility(z18 ? 0 : 8);
                                this.I.setAlpha(z18 ? 1.0f : 0.0f);
                                this.J.setVisibility(z17 ? 0 : 8);
                                this.J.setAlpha(z17 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-gl.L(16.0f)) - (this.x0 ? gl.L(80.0f) : 0));
                            } else {
                                if (z18) {
                                    f = 12.0f;
                                    imageView.animate().alpha(1.0f).start();
                                } else {
                                    f = 12.0f;
                                    if (imageView.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f2 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    this.I.animate().alpha(f2).start();
                                }
                                ImageView imageView2 = this.J;
                                if (z17) {
                                    imageView2.animate().alpha(1.0f).start();
                                } else {
                                    if (imageView2.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f3 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    this.J.animate().alpha(f3).start();
                                }
                                this.M0.animate().translationY((-gl.L(16.0f)) - (this.x0 ? gl.L(80.0f) : 0)).setDuration(150L).setInterpolator(s33.f).start();
                            }
                            i2 = this.p0;
                            if (i2 != 10 && i2 != 11) {
                                u(z13);
                            }
                            if (z2) {
                                this.G.e(z13);
                            }
                            this.G.d(z, z13);
                            if (this.E.getVisibility() == 0 && this.C0) {
                                L += gl.L(24.0f);
                                layout = this.U.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = oo1.h(lineCount, 2, gl.L(20.0f), L);
                                }
                            }
                            if (this.p0 == 11 && !this.n0 && !this.m0) {
                                L -= gl.L(24.0f);
                            }
                            if (!this.n0 || this.m0) {
                                L -= gl.L(60.0f);
                            }
                            if (z13) {
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    ViewPropertyAnimator duration2 = this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L);
                                    s33Var = s33.f;
                                    duration2.setInterpolator(s33Var).start();
                                    j = 250;
                                } else {
                                    j = 250;
                                    ViewPropertyAnimator duration3 = this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L);
                                    s33Var = s33.f;
                                    duration3.setInterpolator(s33Var).start();
                                }
                                if (L != this.v0) {
                                    ViewPropertyAnimator animate = this.Y.animate();
                                    if (this.p0 != 11) {
                                        j = 0;
                                    }
                                    animate.setStartDelay(j).translationY(L).setDuration(200L).setInterpolator(s33Var).start();
                                }
                            }
                            this.v0 = L;
                            boolean z19 = sharedInstance == null && sharedInstance.isScreencast();
                            int i13 = this.p0;
                            this.D0 = i13 == 11 && i13 != 17 && ((this.n0 && !z19) || this.m0);
                            if (sharedInstance != null) {
                                if (this.n0) {
                                    sharedInstance.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                }
                                this.e0.setIsScreencast(sharedInstance.isScreencast());
                                this.e0.d.setMirror(sharedInstance.isFrontFaceCamera());
                                zhc zhcVar = (!this.n0 || sharedInstance.isScreencast()) ? null : this.e0.d;
                                if (!this.l1 || (aicVar = this.k1) == null) {
                                    if (z4) {
                                        videoSink = this.c0;
                                        sharedInstance.setSinks(zhcVar, videoSink);
                                        if (z13) {
                                            tgc tgcVar = this.M0;
                                            tgcVar.f = false;
                                            if (!tgcVar.e && tgcVar.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(tgcVar, tgcVar.d);
                                            }
                                        }
                                        isMicMute = sharedInstance.isMicMute();
                                        tgc tgcVar2 = this.M0;
                                        if (isMicMute) {
                                            tgcVar2.c("self-muted");
                                        } else {
                                            tgcVar2.a(R.drawable.calls_mute_mini, k96.M0(2131743044, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i3 = this.p0) == 3 || i3 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            remoteAudioState = sharedInstance.getRemoteAudioState();
                                            tgc tgcVar3 = this.M0;
                                            if (remoteAudioState != 0) {
                                                i4 = 1;
                                                tgcVar3.a(R.drawable.calls_mute_mini, k96.a0("VoipUserMicrophoneIsOff", null, 2131742985, tgcVar3.b(l7c.k(user, true))), "muted");
                                            } else {
                                                i4 = 1;
                                                tgcVar3.c("muted");
                                            }
                                            remoteVideoState = sharedInstance.getRemoteVideoState();
                                            tgc tgcVar4 = this.M0;
                                            if (remoteVideoState != 0) {
                                                CharSequence b2 = tgcVar4.b(l7c.k(user, i4));
                                                Object[] objArr = new Object[i4];
                                                objArr[0] = b2;
                                                tgcVar4.a(R.drawable.calls_camera_mini, k96.a0("VoipUserCameraIsOff", null, 2131742986, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                tgcVar4.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            int remoteAudioState2 = sharedInstance.getRemoteAudioState();
                                            tgc tgcVar5 = this.M0;
                                            if (remoteAudioState2 == 0) {
                                                tgcVar5.a(R.drawable.calls_mute_mini, k96.a0("VoipUserMicrophoneIsOff", null, 2131742985, tgcVar5.b(l7c.k(user, true))), "muted");
                                            } else {
                                                tgcVar5.c("muted");
                                            }
                                            this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + gl.L(6.0f)));
                                                this.N0.o(0.0f, this.f.getX() + this.j0.getX() + gl.L(14.0f));
                                                this.N0.v();
                                                z9 = true;
                                                if (z13) {
                                                    tgc tgcVar6 = this.M0;
                                                    if (tgcVar6.f) {
                                                        tgcVar6.e = z9;
                                                        gl.e3(new kbc(tgcVar6, (byte) 10), 700L);
                                                    }
                                                    tgcVar6.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z9 = true;
                                            this.N0.f(true);
                                            if (z13) {
                                            }
                                        }
                                        z9 = true;
                                        if (z13) {
                                        }
                                    } else {
                                        aicVar = this.d0;
                                    }
                                }
                                videoSink = aicVar.d;
                                sharedInstance.setSinks(zhcVar, videoSink);
                                if (z13) {
                                }
                                isMicMute = sharedInstance.isMicMute();
                                tgc tgcVar22 = this.M0;
                                if (isMicMute) {
                                }
                                if (this.n0) {
                                }
                                remoteAudioState = sharedInstance.getRemoteAudioState();
                                tgc tgcVar32 = this.M0;
                                if (remoteAudioState != 0) {
                                }
                                remoteVideoState = sharedInstance.getRemoteVideoState();
                                tgc tgcVar42 = this.M0;
                                if (remoteVideoState != 0) {
                                }
                                if (this.M0.getChildCount() == 0) {
                                    sharedUIParams = sharedInstance.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.M0.getChildCount() != 0) {
                                }
                                z9 = true;
                                if (z13) {
                                }
                            }
                            childsHight = this.M0.getChildsHight();
                            pfcVar = this.a0;
                            if (pfcVar.getParent() == null && z13) {
                                pfcVar.U = childsHight;
                            } else {
                                pfcVar.U = childsHight;
                            }
                            pfcVar2 = this.Z;
                            if (pfcVar2.getParent() == null && z13) {
                                pfcVar2.U = childsHight;
                            } else {
                                pfcVar2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.x0);
                            this.a0.setUiVisible(this.x0);
                            if (this.n0) {
                                z6 = true;
                                q(0, z13);
                            } else if (!this.m0 || this.H0) {
                                z6 = true;
                                q(1, z13);
                            } else {
                                q(2, z13);
                                z6 = true;
                            }
                            pfc pfcVar3 = this.a0;
                            if (z4) {
                                if (pfcVar3.getTag() != null) {
                                    this.a0.setIsActive(false);
                                    this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new xfc(this, (byte) 6)).setDuration(150L).setInterpolator(s33.f).start();
                                    this.a0.setTag(null);
                                }
                            } else if (pfcVar3.getTag() == null) {
                                this.a0.setIsActive(z6);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                pfc pfcVar4 = this.a0;
                                pfcVar4.d0 = true;
                                pfcVar4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).setStartDelay(150L).withEndAction(new sfc(this, (byte) 4)).start();
                                this.a0.setTag(1);
                            }
                            this.Z.a();
                            this.a0.a();
                            w();
                            if (this.p0 == 3) {
                                hic hicVar = this.x;
                                if (hicVar.L && !hicVar.E) {
                                    hicVar.E = true;
                                    int L3 = gl.L(f);
                                    hicVar.G = L3;
                                    ValueAnimator ofInt = ValueAnimator.ofInt(0, L3);
                                    hicVar.c = ofInt;
                                    ofInt.addUpdateListener(new gic(hicVar, (byte) 0));
                                    hicVar.c.setInterpolator(s33.g);
                                    hicVar.c.setDuration(200L);
                                    hicVar.c.start();
                                }
                                this.E.a();
                                int i14 = this.w.W;
                                if (i14 != 2 && i14 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.E.getLocationOnScreen(iArr2);
                                    z7 = true;
                                    this.w.b(gl.L(106.0f) + iArr2[0], gl.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z8 = (!this.n0 || this.m0) ? z7 : false;
                                    this.y.setState(z8);
                                    this.x.setState(z8);
                                    this.r.e(z8);
                                    if (this.m0 && !z15 && this.g0) {
                                        this.g0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    View view = this.i0;
                                    if (z8) {
                                        if (view.getVisibility() != 0) {
                                            this.i0.setVisibility(0);
                                            this.h0.setVisibility(0);
                                        }
                                    } else if (view.getVisibility() != 4) {
                                        this.i0.setVisibility(4);
                                        this.h0.setVisibility(4);
                                    }
                                    sfc sfcVar = this.T0;
                                    gl.r(sfcVar);
                                    if (this.p0 == 3) {
                                        gl.e3(sfcVar, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z7 = true;
                            if (this.n0) {
                            }
                            this.y.setState(z8);
                            this.x.setState(z8);
                            this.r.e(z8);
                            if (this.m0) {
                                this.g0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            View view2 = this.i0;
                            if (z8) {
                            }
                            sfc sfcVar2 = this.T0;
                            gl.r(sfcVar2);
                            if (this.p0 == 3) {
                            }
                        }
                    }
                    i = 0;
                    if (this.n0) {
                    }
                    this.w.setVisibility(4);
                    z3 = this.n0;
                    if (z3) {
                    }
                    this.H0 = false;
                    if (z3) {
                    }
                    o(z13, z15);
                    if (this.E.getTag() != null) {
                    }
                    if (z13) {
                    }
                    this.f0.setEnabled(z12);
                    this.f0.setTag(!z12 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z5;
                    if (!z5) {
                        r(true);
                    }
                    if (this.x0) {
                        gl.e3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i122 = this.p0;
                    if (i122 == 11) {
                    }
                    if (!z12) {
                    }
                    ImageView imageView3 = this.I;
                    boolean z182 = z16;
                    if (z13) {
                    }
                    i2 = this.p0;
                    if (i2 != 10) {
                        u(z13);
                    }
                    if (z2) {
                    }
                    this.G.d(z, z13);
                    if (this.E.getVisibility() == 0) {
                        L += gl.L(24.0f);
                        layout = this.U.getLayout();
                        if (layout != null) {
                            L = oo1.h(lineCount, 2, gl.L(20.0f), L);
                        }
                    }
                    if (this.p0 == 11) {
                        L -= gl.L(24.0f);
                    }
                    if (!this.n0) {
                    }
                    L -= gl.L(60.0f);
                    if (z13) {
                    }
                    this.v0 = L;
                    if (sharedInstance == null) {
                    }
                    int i132 = this.p0;
                    this.D0 = i132 == 11 && i132 != 17 && ((this.n0 && !z19) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    pfcVar = this.a0;
                    if (pfcVar.getParent() == null) {
                    }
                    pfcVar.U = childsHight;
                    pfcVar2 = this.Z;
                    if (pfcVar2.getParent() == null) {
                    }
                    pfcVar2.U = childsHight;
                    this.Z.setUiVisible(this.x0);
                    this.a0.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    pfc pfcVar32 = this.a0;
                    if (z4) {
                    }
                    this.Z.a();
                    this.a0.a();
                    w();
                    if (this.p0 == 3) {
                    }
                    z7 = true;
                    if (this.n0) {
                    }
                    this.y.setState(z8);
                    this.x.setState(z8);
                    this.r.e(z8);
                    if (this.m0) {
                    }
                    View view22 = this.i0;
                    if (z8) {
                    }
                    sfc sfcVar22 = this.T0;
                    gl.r(sfcVar22);
                    if (this.p0 == 3) {
                    }
                }
            }
            user = user2;
            v(z13);
            if (this.p0 == 5) {
                z = this.s0;
                if (!z && this.q0 != 5) {
                    this.G.b(k96.M0(2131743177, null), true, z13);
                }
                z12 = false;
                z2 = false;
                if (this.o0 == null) {
                }
            } else {
                z2 = true;
                this.s0 = true;
                z = false;
                z12 = false;
                if (this.o0 == null) {
                }
            }
        }
        z = false;
        z12 = false;
        z2 = false;
        if (this.o0 == null) {
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }
}
