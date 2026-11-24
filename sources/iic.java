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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iic implements VoIPService.StateListener, jm7 {
    public static iic m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public yn5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public xjc G;
    public boolean G0;
    public hic H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public c51 L;
    public int M;
    public uic M0;
    public t9c N;
    public qh2 N0;
    public qmb O;
    public qh2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public t8 Q;
    public jp0 R;
    public boolean R0;
    public f7 S;
    public TextView T;
    public ey0 U;
    public boolean U0;
    public h44 V;
    public float V0;
    public float W0;
    public float X0;
    public eic Y;
    public float Y0;
    public phc Z;
    public float Z0;
    public final int a;
    public phc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public akc d0;
    public int d1;
    public rkc e;
    public akc e0;
    public int e1;
    public rkc f;
    public n4 f0;
    public boolean g0;
    public boolean g1;
    public rkc h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public mhc j0;
    public boolean j1;
    public akc k1;
    public boolean l1;
    public boolean m0;
    public fic n;
    public boolean n0;
    public cic o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public dic s;
    public boolean s0;
    public float t0;
    public bic u0;
    public int v0;
    public kkc w;
    public AccessibilityManager w0;
    public hkc x;
    public lkc y;
    public boolean z0;
    public final lhc r = new lhc();
    public final bf0[] W = new bf0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final po L0 = new po(null);
    public final oxb Q0 = new oxb(this, 9);
    public final thc S0 = new thc(this, 12);
    public final thc T0 = new thc(this, 13);
    public float f1 = 1.0f;

    public iic(int i) {
        this.a = i;
        this.c = oc7.r1(i).W1(Long.valueOf(z8c.h(i).e()));
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
        nm7.e().b(this, nm7.S4);
        nm7.f(i).b(this, nm7.Q4);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.E2);
        nm7.e().b(this, nm7.K5);
    }

    public static void h(int[] iArr, int i) {
        iic iicVar = m1;
        if (iicVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    iicVar.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    iicVar.i(new e1b((byte) 6));
                } else if (!iicVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    sic.h(iicVar.b, new thc(iicVar, (byte) 3), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    iicVar.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    iicVar.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i) {
        int size;
        iic iicVar = m1;
        if (iicVar != null && iicVar.u0.getParent() == null) {
            iic iicVar2 = m1;
            if (iicVar2 != null) {
                iicVar2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                bic bicVar = m1.u0;
                if (bicVar != null) {
                    bicVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 != null || activity.isFinishing()) {
            return;
        }
        boolean z = yic.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        iic iicVar3 = new iic(i);
        iicVar3.b = activity;
        m1 = iicVar3;
        bic bicVar2 = new bic(activity, !z, iicVar3);
        m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        m1.getClass();
        bicVar2.setLockOnScreen(m1.J0);
        iicVar3.u0 = bicVar2;
        shc shcVar = new shc(iicVar3, (byte) 3);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(bicVar2, shcVar);
        ((WindowManager) activity.getSystemService("window")).addView(bicVar2, ekc.a());
        iicVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        iicVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        dic dicVar = new dic(iicVar3, activity);
        dicVar.setClipToPadding(false);
        dicVar.setClipChildren(false);
        dicVar.setBackgroundColor(-16777216);
        iicVar3.x();
        iicVar3.s = dicVar;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z2 = sharedState != null && sharedState.isConference();
        lhc lhcVar = iicVar3.r;
        iicVar3.w = new kkc(activity, z2, lhcVar);
        akc akcVar = new akc(activity, false, true, false, false);
        iicVar3.d0 = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        akcVar.d.setScalingType(scalingType);
        iicVar3.d0.d.setEnableHardwareScaler(true);
        iicVar3.d0.d.setRotateTextureWithScreen(true);
        iicVar3.d0.b0 = (byte) 1;
        dicVar.addView(iicVar3.w, qoe.c(-1.0f, -1));
        TLRPC.User user = iicVar3.d;
        hkc hkcVar = new hkc(activity, user, lhcVar);
        iicVar3.x = hkcVar;
        dicVar.addView(hkcVar, qoe.c(-1.0f, -1));
        lkc lkcVar = new lkc(activity);
        byte b = 2;
        if (e86.e(512)) {
            int i2 = cmb.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(2);
            int i4 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i3 == 11 && i4 >= 24 && i4 <= 31) || (i3 == 0 && i4 == 1)) {
                lkcVar.a = new dma(0);
            }
        }
        iicVar3.y = lkcVar;
        dicVar.addView(lkcVar, qoe.c(220.0f, -1));
        dicVar.addView(iicVar3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new we0(orientation, new int[]{-14994098, -14328963}).f(ni6.A(1), new aob(iicVar3, (byte) 1), 0L);
        phc phcVar = new phc(activity);
        iicVar3.Z = phcVar;
        phcVar.setDelegate(new shc(iicVar3, b));
        iicVar3.Z.d(1.0f, 1.0f);
        iicVar3.b0 = true;
        akc akcVar2 = new akc(activity, true, false);
        iicVar3.e0 = akcVar2;
        akcVar2.d.setIsCamera(true);
        iicVar3.e0.d.setUseCameraRotation(true);
        iicVar3.Z.setOnTapListener(new uhc(iicVar3, (byte) 1));
        iicVar3.e0.d.setMirror(true);
        iicVar3.Z.addView(iicVar3.e0);
        phc phcVar2 = new phc(activity);
        iicVar3.a0 = phcVar2;
        phcVar2.T = true;
        phcVar2.c(true, false);
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
        iicVar3.c0 = textureViewRenderer;
        textureViewRenderer.setEnableHardwareScaler(true);
        iicVar3.c0.setIsCamera(false);
        iicVar3.c0.setFpsReduction(30.0f);
        iicVar3.c0.setScalingType(scalingType);
        iicVar3.a0.addView(iicVar3.c0, qoe.e(-1, -2, 17));
        iicVar3.a0.setOnTapListener(new uhc(iicVar3, b));
        iicVar3.a0.setVisibility(8);
        dicVar.addView(iicVar3.Z, qoe.c(-2.0f, -2));
        dicVar.addView(iicVar3.a0);
        View view = new View(activity);
        iicVar3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, on2.p(-16777216, nm7.K1)}));
        dicVar.addView(iicVar3.h0, qoe.e(-1, nm7.p2, 80));
        View view2 = new View(activity);
        iicVar3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{on2.p(-16777216, nm7.m1), 0}));
        dicVar.addView(iicVar3.i0, qoe.e(-1, nm7.p2, 48));
        qmb qmbVar = new qmb((byte) 23, activity, iicVar3);
        iicVar3.O = qmbVar;
        qmbVar.setOrientation(0);
        iicVar3.O.setPadding(0, 0, 0, gm.L(30.0f));
        iicVar3.O.setClipToPadding(false);
        iicVar3.O.setContentDescription(jb6.M0(2131742986, null));
        iicVar3.O.setOnClickListener(new uhc(iicVar3, (byte) 3));
        iicVar3.Q = new t8(activity, lhcVar);
        FrameLayout frameLayout = new FrameLayout(activity);
        iicVar3.P = frameLayout;
        frameLayout.addView(iicVar3.Q, qoe.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        iicVar3.P.setVisibility(8);
        iicVar3.P.setOnClickListener(new uhc(iicVar3, (byte) 4));
        f7 f7Var = new f7(activity, lhcVar);
        iicVar3.S = f7Var;
        f7Var.setOrientation(1);
        TextView textView = new TextView(activity);
        iicVar3.T = textView;
        textView.setText(jb6.M0(2131743175, null));
        iicVar3.T.setTextSize(1, 15.0f);
        iicVar3.T.setTypeface(gm.o());
        iicVar3.T.setTextColor(-1);
        iicVar3.T.setGravity(17);
        ey0 ey0Var = new ey0((byte) 8, activity, iicVar3);
        iicVar3.U = ey0Var;
        ey0Var.setTextSize(1, 15.0f);
        iicVar3.U.setTextColor(-1);
        iicVar3.U.setGravity(17);
        iicVar3.U.setText(jb6.a0("CallEmojiKeyTooltip", null, 2131752580, TextUtils.ellipsize(m9c.k(user, true), iicVar3.U.getPaint(), gm.L(300.0f), TextUtils.TruncateAt.END)));
        iicVar3.S.setVisibility(8);
        iicVar3.S.addView(iicVar3.T);
        iicVar3.S.addView(iicVar3.U, qoe.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        iicVar3.S.setPadding(gm.L(18.0f), gm.L(80.0f), gm.L(18.0f), gm.L(18.0f));
        int i5 = 0;
        while (i5 < 4) {
            bf0 bf0Var = new bf0(activity);
            bf0[] bf0VarArr = iicVar3.W;
            bf0VarArr[i5] = bf0Var;
            bf0VarArr[i5].getImageReceiver().S0 = true;
            iicVar3.O.addView(bf0VarArr[i5], qoe.k(i5 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i5++;
        }
        eic eicVar = new eic(iicVar3, activity);
        iicVar3.Y = eicVar;
        eicVar.setOrientation(1);
        iicVar3.Y.setFocusable(true);
        iicVar3.Y.setFocusableInTouchMode(true);
        iicVar3.E = new yn5(activity);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        yn5 yn5Var = iicVar3.E;
        int i6 = iicVar3.a;
        yn5Var.b.m(gn5.m(i6, 0, user), null, pc0Var, user);
        iicVar3.E.setRoundRadius(gm.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        iicVar3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        iicVar3.F.setText(gw3.m(bw2.m(0, user.first_name, user.last_name), iicVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
        iicVar3.F.setMaxLines(2);
        iicVar3.F.setEllipsize(TextUtils.TruncateAt.END);
        iicVar3.F.setTextColor(-1);
        iicVar3.F.setGravity(1);
        iicVar3.F.setImportantForAccessibility(2);
        iicVar3.Y.addView(iicVar3.F, qoe.t(-2, -2, 1, 8, 0, 8, 6));
        xjc xjcVar = new xjc(activity);
        xjcVar.a = new TextView[2];
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            xjcVar.a[i7] = new TextView(activity);
            xjcVar.a[i7].setTextSize(1, 15.0f);
            xjcVar.a[i7].setTextColor(-1);
            xjcVar.a[i7].setGravity(1);
            xjcVar.addView(xjcVar.a[i7]);
            i7++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        xjcVar.c = frameLayout2;
        sm8 sm8Var = new sm8(xjcVar, activity, lhcVar);
        sm8Var.setTextSize(1, 15.0f);
        sm8Var.setTextColor(-1);
        sm8Var.setGravity(1);
        sm8Var.setPadding(gm.L(12.0f), gm.L(2.0f), gm.L(12.0f), gm.L(2.0f));
        sm8Var.setText(jb6.M0(2131742901, null));
        frameLayout2.addView(sm8Var, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        xjcVar.addView(frameLayout2, qoe.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        xjcVar.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        xjcVar.addView(textView3, qoe.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131742937, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new s0(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        bkc bkcVar = new bkc(activity);
        xjcVar.d = bkcVar;
        xjcVar.addView(bkcVar, qoe.c(-2.0f, -1));
        iicVar3.G = xjcVar;
        WeakHashMap weakHashMap2 = kfc.a;
        xjcVar.setImportantForAccessibility(4);
        iicVar3.Y.addView(iicVar3.G, qoe.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            hic hicVar = new hic(activity);
            iicVar3.H = hicVar;
            long j = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i9 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null) {
                size = groupParticipants.size();
            } else if (i9 <= 0) {
                hicVar.setVisibility(8);
                iicVar3.Y.addView(iicVar3.H, qoe.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
            } else {
                size = 0;
            }
            int max = Math.max(i9, size);
            int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
            gd0 gd0Var = hicVar.b;
            gd0Var.i(min);
            int i10 = 0;
            while (i10 < min) {
                gd0Var.j(i10, i6, oc7.r1(i6).a2(pg3.n(groupParticipants.get(i10).peer)));
                i10++;
                j = j;
            }
            long j2 = j;
            gd0Var.a(false, true);
            if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && pg3.n(groupParticipants.get(0).peer) == j2))) {
                hicVar.setVisibility(8);
            } else {
                hicVar.c = new uib(jb6.H(',', "Participants", max), 14.0f, gm.o());
                hicVar.setVisibility(0);
                hicVar.invalidate();
            }
            iicVar3.Y.addView(iicVar3.H, qoe.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        iicVar3.Y.setClipChildren(false);
        iicVar3.Y.setClipToPadding(false);
        iicVar3.Y.setPadding(0, 0, 0, gm.L(15.0f));
        iicVar3.V = new h44(activity);
        iicVar3.R = new jp0(activity, lhcVar);
        iicVar3.V.setAlpha(0.0f);
        iicVar3.R.setVisibility(8);
        dicVar.addView(iicVar3.E, qoe.d(nm7.h3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.Y, qoe.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.P, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.S, qoe.d(nm7.a5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.O, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.V, qoe.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        dicVar.addView(iicVar3.R, qoe.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        iicVar3.j0 = new mhc(activity);
        iicVar3.e = new rkc(activity, lhcVar);
        iicVar3.f = new rkc(activity, lhcVar);
        iicVar3.h = new rkc(activity, lhcVar);
        iicVar3.n = new fic(activity, 52.0f);
        iicVar3.e.setTranslationY(gm.L(100.0f));
        iicVar3.e.setScaleX(0.0f);
        iicVar3.e.setScaleY(0.0f);
        iicVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        iicVar3.f.setTranslationY(gm.L(100.0f));
        iicVar3.f.setScaleX(0.0f);
        iicVar3.f.setScaleY(0.0f);
        iicVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        iicVar3.h.setTranslationY(gm.L(100.0f));
        iicVar3.h.setScaleX(0.0f);
        iicVar3.h.setScaleY(0.0f);
        iicVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        iicVar3.n.setTranslationY(gm.L(100.0f));
        iicVar3.n.setScaleX(0.0f);
        iicVar3.n.setScaleY(0.0f);
        iicVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        iicVar3.j0.addView(iicVar3.e);
        iicVar3.j0.addView(iicVar3.f);
        iicVar3.j0.addView(iicVar3.h);
        iicVar3.j0.addView(iicVar3.n);
        n4 n4Var = new n4(activity);
        iicVar3.f0 = n4Var;
        n4Var.setListener(new gic(iicVar3));
        iicVar3.f0.setScaleX(1.15f);
        iicVar3.f0.setScaleY(1.15f);
        dicVar.addView(iicVar3.j0, qoe.e(-1, -2, 80));
        float f = gm.O1() ? 100 : 27;
        dicVar.addView(iicVar3.f0, qoe.d(-1, 186.0f, 80, f, 0.0f, f, 0.0f));
        ImageView imageView = new ImageView(activity);
        iicVar3.J = imageView;
        imageView.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
        iicVar3.J.setImageResource(R.drawable.msg_addcontact);
        iicVar3.J.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        dicVar.addView(iicVar3.J, qoe.e(56, 56, 53));
        rve.a(iicVar3.J);
        ImageView imageView2 = new ImageView(activity);
        iicVar3.I = imageView2;
        imageView2.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
        iicVar3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        iicVar3.I.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        iicVar3.I.setContentDescription(jb6.M0(2131753721, null));
        dicVar.addView(iicVar3.I, qoe.e(56, 56, 51));
        rve.a(iicVar3.I);
        c51 c51Var = new c51((Context) activity, (byte) 5);
        iicVar3.L = c51Var;
        c51Var.setContentDescription(jb6.M0(2131742923, null));
        iicVar3.L.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
        iicVar3.L.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        dicVar.addView(iicVar3.L, qoe.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        iicVar3.L.setAlpha(0.0f);
        iicVar3.L.setOnClickListener(new uhc(iicVar3, (byte) 5));
        byte b2 = 6;
        iicVar3.I.setOnClickListener(new uhc(iicVar3, b2));
        iicVar3.J.setOnClickListener(new fyb(iicVar3, activity, (byte) 11));
        if (iicVar3.u0.b) {
            iicVar3.I.setVisibility(8);
            iicVar3.J.setVisibility(8);
        }
        uic uicVar = new uic(activity);
        uicVar.a = new HashMap();
        uicVar.b = new ArrayList();
        uicVar.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        uicVar.r = textPaint;
        uicVar.setOrientation(1);
        uicVar.n = lhcVar;
        TransitionSet transitionSet = new TransitionSet();
        uicVar.d = transitionSet;
        byte b3 = 5;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new h7(b3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(gm.L(14.0f));
        iicVar3.M0 = uicVar;
        uicVar.setGravity(80);
        iicVar3.M0.setOnViewsUpdated(new thc(iicVar3, b3));
        dicVar.addView(iicVar3.M0, qoe.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        qh2 qh2Var = new qh2(activity, 3, lhcVar, true);
        qh2Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qh2Var.L = alignment;
        qh2Var.d = -1L;
        qh2Var.r0 = new thc(iicVar3, b2);
        qh2Var.U = true;
        qh2Var.h = gm.L(320.0f);
        qh2Var.e = true;
        qh2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
        qh2Var.q(8.0f);
        iicVar3.N0 = qh2Var;
        qh2Var.t(jb6.M0(2131743939, null));
        dicVar.addView(iicVar3.N0, qoe.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        qh2 qh2Var2 = new qh2(activity, 1, lhcVar, false);
        qh2Var2.p(true);
        qh2Var2.L = alignment;
        qh2Var2.d = 4000L;
        qh2Var2.U = true;
        qh2Var2.h = gm.L(320.0f);
        qh2Var2.e = true;
        qh2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
        qh2Var2.q(8.0f);
        iicVar3.O0 = qh2Var2;
        qh2Var2.t(jb6.M0(2131742986, null));
        dicVar.addView(iicVar3.O0, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        iicVar3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!iicVar3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                iicVar3.U0 = phoneCall != null && phoneCall.video;
            }
            iicVar3.f();
        }
        bicVar2.addView(dicVar);
        if (z) {
            iicVar3.F0 = 0.0f;
            iicVar3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                iicVar3.d0.setStub(yic.d().s);
                iicVar3.e0.setStub(yic.d().r);
            }
            iicVar3.u0.setAlpha(0.0f);
            iicVar3.y();
            iicVar3.E0 = true;
            yic.T = true;
            if (yic.V != null) {
                yic.U.getClass();
                throw null;
            }
            iicVar3.L0.d();
            gm.d3(new thc(iicVar3, (byte) 11), 32L);
        } else {
            iicVar3.F0 = 1.0f;
            iicVar3.x();
        }
        zic.b();
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
        float f7 = yic.d().d.x + yic.d().F;
        float f8 = yic.d().d.y + yic.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        yic.U.getClass();
        final float measuredWidth2 = f7 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        phc phcVar = this.Z;
        final float f9 = 0.0f;
        if (z4) {
            int measuredWidth3 = phcVar.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c = 0;
                f5 = 0.0f;
                measuredWidth = 1.0f;
                f6 = 1.0f;
                z3 = false;
            } else {
                f5 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = aq1.v(yic.d().f, 0.25f, 0.4f, (yic.d().f * 0.25f) + (f7 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f5)) / 2.0f))) - gm.L(4.0f);
                f6 = aq1.v(yic.d().h, 0.25f, 0.4f, (yic.d().h * 0.25f) + (f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f5)) / 2.0f))) - gm.L(4.0f);
                z3 = true;
            }
            float f10 = f5;
            measuredHeight = f6;
            z2 = z3;
            f = f10;
        } else {
            c = 0;
            measuredWidth = f7 - ((phcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f11 = measuredWidth;
        final float L = this.m0 ? gm.L(4.0f) : 0.0f;
        final float L2 = (gm.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            yic.U.getClass();
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
            this.d0.setRoundCorners((gm.L(6.0f) * 1.0f) / 0.25f);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xhc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue;
                iic iicVar = iic.this;
                iicVar.F0 = f13;
                iicVar.x();
                if (z2) {
                    float f14 = (f * floatValue) + (scaleX * f13);
                    iicVar.Z.setScaleX(f14);
                    iicVar.Z.setScaleY(f14);
                    iicVar.Z.setTranslationX((f11 * floatValue) + (x * f13));
                    iicVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f13));
                    iicVar.Z.setCornerRadius((L2 * floatValue) + (L * f13));
                    iicVar.Z.setAlpha((f9 * floatValue) + (1.0f * f13));
                }
                float f15 = (f12 * floatValue) + (1.0f * f13);
                iicVar.d0.setScaleX(f15);
                iicVar.d0.setScaleY(f15);
                float f16 = 0.0f * f13;
                float f17 = (measuredWidth2 * floatValue) + f16;
                float f18 = (measuredHeight2 * floatValue) + f16;
                iicVar.d0.setTranslationX(f17);
                iicVar.d0.setTranslationY(f18);
                iicVar.d0.setRoundCorners(((gm.L(4.0f) * floatValue) * 1.0f) / f15);
                if (!iicVar.Z.Q) {
                    iicVar.e0.d(false, floatValue);
                }
                iicVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        nm7.e().n(this, nm7.S4);
        nm7.f(this.a).n(this, nm7.Q4);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.E2);
        nm7.e().n(this, nm7.K5);
        t9c t9cVar = this.N;
        if (t9cVar != null) {
            t9cVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            hkc hkcVar = this.x;
            byte b = 1;
            if (hkcVar.L && z != hkcVar.F) {
                hkcVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                hkcVar.c = ofFloat;
                ofFloat.addUpdateListener(new gkc(hkcVar, b));
                hkcVar.c.setInterpolator(d53.f);
                hkcVar.c.setDuration(200L);
                hkcVar.c.start();
            }
            if (z) {
                int i = gda.b1;
                if (i < 2) {
                    gda.b1 = i + 2;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gda.b1);
                    edit.apply();
                }
                this.O0.f(true);
                gm.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(gm.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(d53.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(d53.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(gm.L(140.0f));
                d53 d53Var = d53.f;
                wi8.t(translationY, d53Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-gm.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new yhc(this, (byte) 3)).setInterpolator(d53Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(d53.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                d53 d53Var2 = d53.f;
                duration.setInterpolator(d53Var2).setListener(new jf4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(d53Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gm.L(120.0f)).setListener(new yhc(this, (byte) 4)).setDuration(250L).setInterpolator(d53Var2).start();
            }
            this.q0 = this.p0;
            y();
        }
    }

    public final void d() {
        this.u0.b();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.Q4) {
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
        if (i == nm7.m4) {
            v(true);
            return;
        }
        if (i == nm7.E2) {
            this.u0.b();
            return;
        }
        if (i == nm7.S4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i == nm7.K5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        iic iicVar;
        byte b = 0;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            iicVar = this;
            ofFloat.addUpdateListener(new ys4(iicVar, this.f1, this.Y0, this.Z0, (byte) 2));
            iicVar.i1.addListener(new yhc(iicVar, b));
            iicVar.i1.setDuration(350L);
            iicVar.i1.setInterpolator(d53.f);
            iicVar.i1.start();
        } else {
            iicVar = this;
        }
        iicVar.h1 = false;
        iicVar.a1 = false;
    }

    public final void f() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zhc(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new aic(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.G0 || this.E0) {
            return;
        }
        cic cicVar = this.o0;
        if (cicVar != null) {
            cicVar.a(false, false);
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
                iic iicVar = m1;
                yic.f(iicVar.b, iicVar.a, iicVar.u0.getMeasuredWidth(), measuredHeight, 1);
                WindowInsets windowInsets = m1.r0;
                if (windowInsets != null) {
                    yic.W = windowInsets.getSystemWindowInsetTop();
                    m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (yic.d() != null) {
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                d53 d53Var = d53.f;
                duration.setInterpolator(d53Var).start();
                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                yic.T = true;
                this.E0 = true;
                ValueAnimator a = a(false);
                this.L0.d();
                a.addListener(new yhc(this, b));
                a.setDuration(350L);
                a.setInterpolator(d53Var);
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
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, jb6.M0(2131743095, null), false, false);
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
        final int L = gm.L(24.0f);
        final int L2 = gm.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vhc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                iic iicVar = iic.this;
                iicVar.f0.setTranslationY(L2 * floatValue);
                int i = (int) (marginEnd - ((r0 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i;
                marginLayoutParams2.rightMargin = i;
                iicVar.f0.requestLayout();
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
        animatorSet.addListener(new ic8((Object) this, (Object) runnable, (byte) 22));
        animatorSet.start();
        gm.d3(new thc(this, (byte) 7), 133L);
    }

    public final void j(rkc rkcVar, VoIPService voIPService) {
        if (!this.n0) {
            rkcVar.d(2, false, false);
            rkcVar.setOnBtnClickedListener(null);
            rkcVar.setEnabled(false);
        } else {
            rkcVar.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                rkcVar.d(2, !voIPService.isSwitchingCamera(), false);
            } else {
                rkcVar.d(2, voIPService.isSwitchingCamera(), false);
            }
            rkcVar.setOnBtnClickedListener(new jq9(this, voIPService, rkcVar, (byte) 10));
        }
    }

    public final void k(rkc rkcVar, VoIPService voIPService, boolean z) {
        rkcVar.d(1, voIPService.isMicMute(), false);
        phc phcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = phcVar.g0;
        if (z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(phcVar.L, isMicMute ? 1.0f : 0.0f);
            phcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(phcVar.h0);
            phcVar.g0.setDuration(150L);
            phcVar.g0.start();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            phcVar.L = isMicMute ? 1.0f : 0.0f;
            phcVar.invalidate();
        }
        rkcVar.setOnBtnClickedListener(new shc(this, (byte) 4));
    }

    public final void l(final rkc rkcVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            rkcVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            rkcVar.d(5, true, false);
        } else {
            rkcVar.d(5, false, false);
            i = 1;
        }
        rkcVar.setEnabled(true);
        rkcVar.setOnBtnClickedListener(new pkc() { // from class: whc
            @Override // pkc
            public final void a(qkc qkcVar) {
                if (VoIPService.getSharedInstance() != null) {
                    iic iicVar = iic.this;
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(iicVar.b, false, Integer.valueOf(i));
                    iicVar.l(rkcVar, voIPService);
                }
            }
        });
    }

    public final void m(rkc rkcVar, VoIPService voIPService, boolean z) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            rkcVar.d(3, true, false);
            rkcVar.setOnClickListener(null);
            rkcVar.setEnabled(false);
            return;
        }
        if (!this.n0) {
            rkcVar.d(3, true, z);
        } else if (voIPService.isScreencast()) {
            rkcVar.d(3, false, z);
        } else {
            rkcVar.d(3, false, z);
        }
        rkcVar.setOnBtnClickedListener(new shc(this, (byte) 5));
        rkcVar.setEnabled(true);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3 = (this.n0 || this.m0) ? false : true;
        yn5 yn5Var = this.E;
        byte b = 8;
        if (!z) {
            yn5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            this.E.setVisibility(z3 ? 0 : 8);
        } else if (z3) {
            if (yn5Var.getTag() == null) {
                this.E.animate().setListener(null).cancel();
                this.E.setVisibility(0);
                if (!this.C0) {
                    yn5 yn5Var2 = this.E;
                    if (z2) {
                        yn5Var2.setAlpha(0.0f);
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                    } else {
                        yn5Var2.setAlpha(0.0f);
                        this.E.setTranslationY(-gm.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                    }
                } else if (z2) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(gm.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            }
        } else if (yn5Var.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(d53.f).setListener(new yhc(this, b)).start();
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
        zic.b();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
        kkc kkcVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G == null || (kkcVar = this.w) == null) {
            return;
        }
        int i2 = kkcVar.W;
        if ((i2 == 2 || i2 == 3) && this.j1) {
            gm.d3(new ge7((Object) this, i, (byte) 25), 400L);
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
        p63 p63Var = new p63(0, null, this.b);
        boolean[] zArr = new boolean[3];
        p63Var.S = jb6.M0(2131743092, null);
        p63Var.U = charSequence;
        p63Var.m0 = jb6.M0(2131747564, null);
        p63Var.n0 = null;
        p63Var.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) p63Var.c(-(i + 1))) != null) {
                anb.X(textView, cmb.p7, p63Var.j1);
            }
        }
        p63Var.setCanceledOnTouchOutside(true);
        p63Var.setOnDismissListener(new qj8(this, (byte) 14));
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
        phc phcVar = this.Z;
        if (i != 0) {
            boolean z2 = (phcVar.getTag() == null || ((Integer) this.Z.getTag()).intValue() == 0) ? false : z;
            phc phcVar2 = this.Z;
            if (!z) {
                phcVar2.setVisibility(0);
            } else if (phcVar2.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<phc, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<phc, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<phc, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                phc phcVar3 = this.Z;
                if (phcVar3.E < 0.0f) {
                    phcVar3.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            this.Z.c(i == 2, z2);
            this.b0 = i != 2;
        } else if (!z) {
            phcVar.setVisibility(8);
        } else if (phcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            phc phcVar4 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(phcVar4, (Property<phc, Float>) View.ALPHA, phcVar4.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                phc phcVar5 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(phcVar5, (Property<phc, Float>) View.SCALE_X, phcVar5.getScaleX(), 0.7f);
                phc phcVar6 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(phcVar6, (Property<phc, Float>) View.SCALE_Y, phcVar6.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new yhc(this, (byte) 7));
            this.A0.setDuration(250L).setInterpolator(d53.f);
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
        oxb oxbVar = this.Q0;
        if (z) {
            if (!z2) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                d53 d53Var = d53.f;
                translationY.setInterpolator(d53Var).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(d53Var).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53Var).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(oxbVar);
                this.P0.setDuration(150L).setInterpolator(d53Var);
                this.P0.start();
                this.j0.setEnabled(true);
            }
        } else if (z2) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-gm.L(10.0f)).setDuration(150L);
            d53 d53Var2 = d53.f;
            duration.setInterpolator(d53Var2).start();
            this.I.animate().alpha(0.0f).translationY(-gm.L(10.0f)).setDuration(150L).setInterpolator(d53Var2).start();
            this.J.animate().alpha(0.0f).translationY(-gm.L(10.0f)).setDuration(150L).setInterpolator(d53Var2).start();
            this.O.animate().alpha(0.0f).translationY(-gm.L(10.0f)).setDuration(150L).setInterpolator(d53Var2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-gm.L(10.0f)).setInterpolator(d53Var2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-gm.L(10.0f)).setInterpolator(d53Var2).start();
            this.j0.animate().alpha(0.0f).translationY(gm.L(10.0f)).setDuration(150L).setInterpolator(d53Var2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(oxbVar);
            this.P0.setDuration(150L).setInterpolator(d53Var2);
            this.P0.start();
            gm.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.f(true);
            i = nm7.f2;
            this.x0 = z;
            bic bicVar = this.u0;
            if (z) {
                bicVar.setSystemUiVisibility(bicVar.getSystemUiVisibility() | 4);
            } else {
                bicVar.setSystemUiVisibility(bicVar.getSystemUiVisibility() & (-5));
            }
            this.M0.animate().translationY((-gm.L(16.0f)) - (this.x0 ? gm.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(d53.f).start();
        }
        i = 0;
        this.x0 = z;
        bic bicVar2 = this.u0;
        if (z) {
        }
        this.M0.animate().translationY((-gm.L(16.0f)) - (this.x0 ? gm.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(d53.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            thc thcVar = this.S0;
            gm.r(thcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                gm.d3(thcVar, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? jb6.M0(2131754731, null) : jb6.M0(2131754732, null));
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
                cic cicVar = new cic(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = cicVar;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    cicVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
                d53 d53Var = d53.f;
                transitionSet.addTransition(duration.setInterpolator(d53Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(d53Var));
                transitionSet.excludeChildren(dkc.class, true);
                transitionSet.excludeChildren(rkc.class, true);
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
                this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, jb6.M0(2131743095, null), false, z);
                this.n.setOnClickListener(new uhc(this, null == true ? 1 : 0));
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
    /* JADX WARN: Type inference failed for: r0v17, types: [bf0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [vm] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r2v19, types: [bf0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [bf0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r6v0, types: [bf0[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r6;
        Drawable[] drawableArr;
        boolean z2;
        mm mmVar;
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
            fc4.g(e, false);
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
                gw3.k(emojifyForCall[i2]);
                cw3 g = gw3.g(emojifyForCall[i2]);
                if (g != null) {
                    g.setBounds(z3 ? 1 : 0, z3 ? 1 : 0, gm.L(40.0f), gm.L(40.0f));
                    g.b();
                    int[] iArr = new int[1];
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(gm.L(28.0f));
                    CharSequence m = gw3.m(emojifyForCall[i2], textPaint.getFontMetricsInt(), z3, iArr, z3 ? 1 : 0);
                    boolean z4 = m instanceof Spannable;
                    int i3 = this.a;
                    if (z4) {
                        Spannable spannable = (Spannable) m;
                        dw3[] dw3VarArr = (dw3[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), dw3.class);
                        gn[] gnVarArr = (gn[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), gn.class);
                        if (dw3VarArr != null) {
                            if ((iArr[z3 ? 1 : 0] - dw3VarArr.length) - (gnVarArr == null ? z3 ? 1 : 0 : gnVarArr.length) <= 0) {
                                int length = dw3VarArr.length;
                                int i4 = z3 ? 1 : 0;
                                ?? r3 = z3;
                                while (i4 < length) {
                                    dw3 dw3Var = dw3VarArr[i4];
                                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                    TLRPC.TL_messages_stickerSet m0 = hs6.d0(i3).m0(tL_inputStickerSetShortName, Integer.valueOf((int) r3), false, true, new eg9(this, (byte) 24));
                                    if (m0 != null) {
                                        String replace = dw3Var.d.replace("️", "");
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
                                            if (TextUtils.equals(k47.V(document, null, null).replace("️", ""), replace)) {
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
                            if ((drawable instanceof vm) && ((vm) drawable).h() == document.id) {
                                r0 = (vm) drawableArr[i2];
                            } else {
                                vm vmVar = new vm(21, i3, document);
                                drawableArr[i2] = vmVar;
                                r0 = vmVar;
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
                if (drawable2 instanceof cw3) {
                    z2 = ((cw3) drawable2).a();
                } else {
                    if ((drawable2 instanceof vm) && (mmVar = ((vm) drawable2).k) != null) {
                        Drawable drawable3 = mmVar.b0;
                        if (!(drawable3 instanceof cw3) || ((cw3) drawable3).a()) {
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
                            wi8.t(r6[i8].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), d53.k, 250L);
                        }
                    }
                }
                this.O0.postDelayed(new thc(this, (byte) 9), 1000L);
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
        c51 c51Var = this.L;
        if (i2 != i) {
            gm.L3(c51Var, i);
        } else {
            c51Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(on2.p(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(on2.p(-16777216, (int) (127.5f * this.F0)));
        dic dicVar = this.s;
        if (dicVar != null) {
            dicVar.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0d4a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0d55  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x07b5  */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int L;
        boolean z5;
        int i2;
        boolean z6;
        int childsHight;
        phc phcVar;
        phc phcVar2;
        boolean z7;
        boolean z8;
        boolean z9;
        akc akcVar;
        VideoSink videoSink;
        boolean isMicMute;
        int i3;
        int remoteAudioState;
        int i4;
        int remoteVideoState;
        boolean z10;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        d53 d53Var;
        Layout layout;
        int lineCount;
        float f;
        float f2;
        TL_phone.PhoneCall phoneCall2;
        float f3;
        boolean z11;
        boolean z12;
        TextView textView;
        byte b;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z13 = true;
        boolean z14 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i5 = this.p0;
        TLRPC.User user = this.d;
        int i6 = 2;
        if (i5 == 1 || i5 == 2) {
            this.G.b(jb6.M0(2131743103, null), true, z14);
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    this.G.b(jb6.M0(2131743092, null), false, z14);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        gm.d3(new thc(this, (byte) 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        p(gm.S2(jb6.a0("VoipPeerIncompatible", null, 2131742947, bw2.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String a0 = jb6.a0("VoipPeerVideoOutdated", null, 2131742945, m9c.k(user, true));
                            boolean[] zArr = new boolean[1];
                            p63 p63Var = new p63(0, null, this.b);
                            boolean[] zArr2 = new boolean[3];
                            p63Var.S = jb6.M0(2131743092, null);
                            p63Var.U = gm.S2(a0);
                            String M0 = jb6.M0(2131752542, null);
                            shc shcVar = new shc(this, (byte) 1);
                            p63Var.o0 = M0;
                            p63Var.p0 = shcVar;
                            String M02 = jb6.M0(2131742944, null);
                            uxb uxbVar = new uxb(this, zArr, (byte) 7);
                            p63Var.m0 = M02;
                            p63Var.n0 = uxbVar;
                            p63Var.show();
                            for (int i7 = 0; i7 < 3; i7++) {
                                if (zArr2[i7] && (textView = (TextView) p63Var.c(-(i7 + 1))) != null) {
                                    anb.X(textView, cmb.p7, p63Var.j1);
                                }
                            }
                            p63Var.setCanceledOnTouchOutside(true);
                            p63Var.setOnDismissListener(new dg(this, zArr, (byte) 17));
                        } else {
                            p(gm.S2(jb6.a0("VoipPeerOutdated", null, 2131742946, m9c.k(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        p(gm.S2(jb6.a0(null, null, 2131752559, bw2.m(0, user.first_name, user.last_name))));
                        ik.i0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        p("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        p(jb6.M0(2131743094, null));
                    } else {
                        gm.d3(new thc(this, (byte) 1), 1000L);
                    }
                } else if (i5 != 5) {
                    switch (i5) {
                        case 11:
                            boolean z15 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z15 || this.G0) {
                                gm.d3(new thc(this, (byte) 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i8 = gm.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i8 - iArr[0]) - ((this.n.getMeasuredWidth() - gm.L(52.0f)) / 2)) - gm.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.V.setTranslationY(iArr[1]);
                                    this.V.setAlpha(1.0f);
                                    this.V.setLayoutParams(marginLayoutParams);
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    gm.d3(new qhc((Object) this, (Object) sharedInstance, (byte) 0), 2L);
                                    b = 0;
                                } else {
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                                    layoutParams.rightMargin = gm.L(18.0f);
                                    layoutParams.leftMargin = gm.L(18.0f);
                                    int L2 = gm.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.V.setLayoutParams(layoutParams);
                                    this.V.animate().alpha(1.0f).setDuration(250L).start();
                                    b = 0;
                                    this.V.a(new rhc(this, sharedInstance, b), false);
                                }
                                this.R.setVisibility(b);
                                jp0 jp0Var = this.R;
                                shc shcVar2 = new shc(this, b);
                                e19[] e19VarArr = (e19[]) jp0Var.d;
                                jp0Var.e = shcVar2;
                                su suVar = (su) jp0Var.c;
                                suVar.setVisibility(b);
                                ((FrameLayout) jp0Var.b).setVisibility(b);
                                AnimatorSet animatorSet = new AnimatorSet();
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(suVar, (Property<su, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(suVar, (Property<su, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(suVar, (Property<su, Float>) property3, 0.7f, 1.0f);
                                float f4 = 0.0f;
                                Property property4 = View.TRANSLATION_Y;
                                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(suVar, (Property<su, Float>) property4, gm.L(24.0f), 0.0f));
                                animatorSet.setInterpolator(d53.f);
                                animatorSet.setDuration(250L);
                                int i9 = 0;
                                while (i9 < e19VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    e19VarArr[i9].setAlpha(f4);
                                    float[] fArr = new float[i6];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e19VarArr[i9], (Property<e19, Float>) property, fArr);
                                    float[] fArr2 = new float[i6];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(e19VarArr[i9], (Property<e19, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i6];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(e19VarArr[i9], (Property<e19, Float>) property3, fArr3);
                                    e19 e19Var = e19VarArr[i9];
                                    Property property5 = property3;
                                    float[] fArr4 = new float[i6];
                                    fArr4[0] = gm.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(e19Var, (Property<e19, Float>) property4, fArr4);
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
                                    property3 = property5;
                                    f4 = 0.0f;
                                }
                                int i11 = i6;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    d53 d53Var2 = d53.f;
                                    duration.setInterpolator(d53Var2).setListener(new jf4(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(d53Var2).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gm.L(120.0f)).setListener(new jf4(this.P)).setDuration(250L).setInterpolator(d53Var2).start();
                                }
                                for (bf0 bf0Var : this.W) {
                                    bf0Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(d53.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new yhc(this, (byte) 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                d53 d53Var3 = d53.f;
                                wi8.t(alpha, d53Var3, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                bkc bkcVar = this.G.d;
                                bkcVar.n = true;
                                bkcVar.invalidate();
                                yn5 yn5Var = this.E;
                                yn5Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = yn5Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                yn5Var.c = animatorSet5;
                                Property property6 = View.ALPHA;
                                float[] fArr5 = new float[i11];
                                fArr5[0] = yn5Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(yn5Var, (Property<yn5, Float>) property6, fArr5);
                                Property property7 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i11];
                                fArr6[0] = yn5Var.getTranslationY();
                                fArr6[1] = -gm.L(24.0f);
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(yn5Var, (Property<yn5, Float>) property7, fArr6);
                                Property property8 = View.SCALE_X;
                                float[] fArr7 = new float[3];
                                fArr7[0] = yn5Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i11] = 1.0f;
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(yn5Var, (Property<yn5, Float>) property8, fArr7);
                                Property property9 = View.SCALE_Y;
                                float[] fArr8 = new float[3];
                                fArr8[0] = yn5Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i11] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(yn5Var, (Property<yn5, Float>) property9, fArr8);
                                Animator[] animatorArr2 = new Animator[4];
                                animatorArr2[0] = ofFloat8;
                                animatorArr2[1] = ofFloat9;
                                animatorArr2[i11] = ofFloat10;
                                animatorArr2[3] = ofFloat11;
                                animatorSet5.playTogether(animatorArr2);
                                yn5Var.c.setInterpolator(d53Var3);
                                yn5Var.c.setDuration(300L);
                                yn5Var.c.setStartDelay(250L);
                                yn5Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                cic cicVar = this.o0;
                                if (cicVar != null) {
                                    cicVar.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.G.b(jb6.M0(2131743093, null), true, z14);
                                break;
                            }
                            break;
                        case 13:
                            this.G.b(jb6.M0(2131742902, null), true, z14);
                            break;
                        case 14:
                            this.G.b(jb6.M0(2131742930, null), true, z14);
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null) {
                                if (sharedState.isConference()) {
                                    this.G.b(jb6.M0(2131742982, null), false, z14);
                                    this.f0.setTranslationY(0.0f);
                                } else if (sharedState.isCallingVideo()) {
                                    this.G.b(jb6.M0(2131742981, null), false, z14);
                                    this.f0.setTranslationY(-gm.L(60.0f));
                                }
                                z = false;
                                z2 = false;
                                break;
                            }
                            this.G.b(jb6.M0(2131742984, null), false, z14);
                            this.f0.setTranslationY(0.0f);
                            z = false;
                            z2 = false;
                        case 16:
                            if (this.q0 != 16) {
                                this.G.b(jb6.M0(2131742929, null), true, z14);
                                break;
                            }
                            break;
                        case 17:
                            this.G.b(jb6.M0(2131743176, null), false, z14);
                            this.f0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z = false;
                            z2 = false;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z16 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z11 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z12 = false;
                                this.n0 = z12;
                                if (z12 && !this.U0) {
                                    this.U0 = z11;
                                }
                            }
                        } else {
                            z11 = true;
                        }
                        z12 = z11;
                        this.n0 = z12;
                        if (z12) {
                            this.U0 = z11;
                        }
                    }
                    if (z14) {
                        this.Z.b();
                        this.a0.b();
                    }
                    if (this.m0) {
                        if (this.E0) {
                            f3 = 1.0f;
                        } else {
                            f3 = 1.0f;
                            this.w.setAlpha(1.0f);
                        }
                        akc akcVar2 = this.d0;
                        if (z14) {
                            akcVar2.animate().alpha(f3).setDuration(250L).start();
                        } else {
                            akcVar2.animate().cancel();
                            this.d0.setAlpha(f3);
                        }
                        if (!this.d0.d.isFirstFrameRendered() && !this.I0) {
                            i = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i);
                                akc akcVar3 = this.d0;
                                if (z14) {
                                    akcVar3.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    akcVar3.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z3 = this.n0;
                            if (z3 || !this.m0) {
                                this.H0 = false;
                            }
                            z4 = (z3 || !this.H0 || gm.F1(this.b)) ? false : true;
                            o(z14, z16);
                            L = this.E.getTag() != null ? 0 : gm.L(135.0f) + gm.L(12.0f);
                            if (z14) {
                                this.f0.setVisibility(z13 ? 0 : 8);
                            } else {
                                if (z13 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                }
                                if (!z13 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new yhc(this, (byte) 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z13);
                            this.f0.setTag(!z13 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z5 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z5;
                            if (!z5 && !this.x0) {
                                r(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                gm.d3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i12 = this.p0;
                            boolean z17 = i12 == 11 && this.x0;
                            boolean z18 = (!z13 || i12 == 16 || i12 == 11 || i12 == 12 || i12 == 14 || i12 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            ImageView imageView = this.I;
                            if (z14) {
                                imageView.setVisibility(z17 ? 0 : 8);
                                this.I.setAlpha(z17 ? 1.0f : 0.0f);
                                this.J.setVisibility(z18 ? 0 : 8);
                                this.J.setAlpha(z18 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-gm.L(16.0f)) - (this.x0 ? gm.L(80.0f) : 0));
                            } else {
                                if (z17) {
                                    imageView.animate().alpha(1.0f).start();
                                } else {
                                    if (imageView.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f = 0.0f;
                                    }
                                    this.I.animate().alpha(f).start();
                                }
                                ImageView imageView2 = this.J;
                                if (z18) {
                                    imageView2.animate().alpha(1.0f).start();
                                } else {
                                    if (imageView2.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f2 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    this.J.animate().alpha(f2).start();
                                }
                                this.M0.animate().translationY((-gm.L(16.0f)) - (this.x0 ? gm.L(80.0f) : 0)).setDuration(150L).setInterpolator(d53.f).start();
                            }
                            i2 = this.p0;
                            if (i2 != 10 && i2 != 11) {
                                u(z14);
                            }
                            if (z2) {
                                this.G.e(z14);
                            }
                            this.G.d(z, z14);
                            if (this.E.getVisibility() == 0 && this.C0) {
                                L += gm.L(24.0f);
                                layout = this.U.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = aq1.h(lineCount, 2, gm.L(20.0f), L);
                                }
                            }
                            if (this.p0 == 11 && !this.n0 && !this.m0) {
                                L -= gm.L(24.0f);
                            }
                            if (!this.n0 || this.m0) {
                                L -= gm.L(60.0f);
                            }
                            if (z14) {
                                z6 = z16;
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    ViewPropertyAnimator duration2 = this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L);
                                    d53 d53Var4 = d53.f;
                                    duration2.setInterpolator(d53Var4).start();
                                    d53Var = d53Var4;
                                    z6 = z16;
                                } else {
                                    z6 = z16;
                                    ViewPropertyAnimator duration3 = this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L);
                                    d53Var = d53.f;
                                    duration3.setInterpolator(d53Var).start();
                                }
                                if (L != this.v0) {
                                    this.Y.animate().setStartDelay(this.p0 == 11 ? 250L : 0L).translationY(L).setDuration(200L).setInterpolator(d53Var).start();
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
                                zjc zjcVar = (!this.n0 || sharedInstance.isScreencast()) ? null : this.e0.d;
                                if (!this.l1 || (akcVar = this.k1) == null) {
                                    if (z4) {
                                        videoSink = this.c0;
                                        sharedInstance.setSinks(zjcVar, videoSink);
                                        if (z14) {
                                            uic uicVar = this.M0;
                                            uicVar.f = false;
                                            if (!uicVar.e && uicVar.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(uicVar, uicVar.d);
                                            }
                                        }
                                        isMicMute = sharedInstance.isMicMute();
                                        uic uicVar2 = this.M0;
                                        if (isMicMute) {
                                            uicVar2.c("self-muted");
                                        } else {
                                            uicVar2.a(R.drawable.calls_mute_mini, jb6.M0(2131742970, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i3 = this.p0) == 3 || i3 == 5) && sharedInstance.getCallDuration() > 500)) {
                                            remoteAudioState = sharedInstance.getRemoteAudioState();
                                            uic uicVar3 = this.M0;
                                            if (remoteAudioState != 0) {
                                                i4 = 1;
                                                uicVar3.a(R.drawable.calls_mute_mini, jb6.a0("VoipUserMicrophoneIsOff", null, 2131742911, uicVar3.b(m9c.k(user, true))), "muted");
                                            } else {
                                                i4 = 1;
                                                uicVar3.c("muted");
                                            }
                                            remoteVideoState = sharedInstance.getRemoteVideoState();
                                            uic uicVar4 = this.M0;
                                            if (remoteVideoState != 0) {
                                                Object[] objArr = new Object[i4];
                                                objArr[0] = uicVar4.b(m9c.k(user, i4));
                                                uicVar4.a(R.drawable.calls_camera_mini, jb6.a0("VoipUserCameraIsOff", null, 2131742912, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                uicVar4.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            int remoteAudioState2 = sharedInstance.getRemoteAudioState();
                                            uic uicVar5 = this.M0;
                                            if (remoteAudioState2 == 0) {
                                                uicVar5.a(R.drawable.calls_mute_mini, jb6.a0("VoipUserMicrophoneIsOff", null, 2131742911, uicVar5.b(m9c.k(user, true))), "muted");
                                            } else {
                                                uicVar5.c("muted");
                                            }
                                            this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = sharedInstance.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = sharedInstance.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + gm.L(6.0f)));
                                                this.N0.o(0.0f, this.f.getX() + this.j0.getX() + gm.L(14.0f));
                                                this.N0.v();
                                                z10 = true;
                                                if (z14) {
                                                    uic uicVar6 = this.M0;
                                                    if (uicVar6.f) {
                                                        uicVar6.e = z10;
                                                        gm.d3(new f8c(uicVar6, (byte) 18), 700L);
                                                    }
                                                    uicVar6.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z10 = true;
                                            this.N0.f(true);
                                            if (z14) {
                                            }
                                        }
                                        z10 = true;
                                        if (z14) {
                                        }
                                    } else {
                                        akcVar = this.d0;
                                    }
                                }
                                videoSink = akcVar.d;
                                sharedInstance.setSinks(zjcVar, videoSink);
                                if (z14) {
                                }
                                isMicMute = sharedInstance.isMicMute();
                                uic uicVar22 = this.M0;
                                if (isMicMute) {
                                }
                                if (this.n0) {
                                }
                                remoteAudioState = sharedInstance.getRemoteAudioState();
                                uic uicVar32 = this.M0;
                                if (remoteAudioState != 0) {
                                }
                                remoteVideoState = sharedInstance.getRemoteVideoState();
                                uic uicVar42 = this.M0;
                                if (remoteVideoState != 0) {
                                }
                                if (this.M0.getChildCount() == 0) {
                                    sharedUIParams = sharedInstance.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.M0.getChildCount() != 0) {
                                }
                                z10 = true;
                                if (z14) {
                                }
                            }
                            childsHight = this.M0.getChildsHight();
                            phcVar = this.a0;
                            if (phcVar.getParent() == null && z14) {
                                phcVar.U = childsHight;
                            } else {
                                phcVar.U = childsHight;
                            }
                            phcVar2 = this.Z;
                            if (phcVar2.getParent() == null && z14) {
                                phcVar2.U = childsHight;
                            } else {
                                phcVar2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.x0);
                            this.a0.setUiVisible(this.x0);
                            if (this.n0) {
                                z7 = true;
                                q(0, z14);
                            } else if (!this.m0 || this.H0) {
                                z7 = true;
                                q(1, z14);
                            } else {
                                q(2, z14);
                                z7 = true;
                            }
                            phc phcVar3 = this.a0;
                            if (z4) {
                                if (phcVar3.getTag() != null) {
                                    this.a0.setIsActive(false);
                                    this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new yhc(this, (byte) 6)).setDuration(150L).setInterpolator(d53.f).start();
                                    this.a0.setTag(null);
                                }
                            } else if (phcVar3.getTag() == null) {
                                this.a0.setIsActive(z7);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                phc phcVar4 = this.a0;
                                phcVar4.d0 = true;
                                phcVar4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).setStartDelay(150L).withEndAction(new thc(this, (byte) 4)).start();
                                this.a0.setTag(1);
                            }
                            this.Z.a();
                            this.a0.a();
                            w();
                            if (this.p0 == 3) {
                                hkc hkcVar = this.x;
                                if (hkcVar.L && !hkcVar.E) {
                                    hkcVar.E = true;
                                    int L3 = gm.L(12.0f);
                                    hkcVar.G = L3;
                                    ValueAnimator ofInt = ValueAnimator.ofInt(0, L3);
                                    hkcVar.c = ofInt;
                                    ofInt.addUpdateListener(new gkc(hkcVar, (byte) 0));
                                    hkcVar.c.setInterpolator(d53.g);
                                    hkcVar.c.setDuration(200L);
                                    hkcVar.c.start();
                                }
                                this.E.a();
                                int i14 = this.w.W;
                                if (i14 != 2 && i14 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.E.getLocationOnScreen(iArr2);
                                    z8 = true;
                                    this.w.b(gm.L(106.0f) + iArr2[0], gm.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z9 = (!this.n0 || this.m0) ? z8 : false;
                                    this.y.setState(z9);
                                    this.x.setState(z9);
                                    this.r.e(z9);
                                    if (this.m0 && !z6 && this.g0) {
                                        this.g0 = false;
                                        if (sharedInstance != null) {
                                            sharedInstance.playStartRecordSound();
                                        }
                                    }
                                    View view = this.i0;
                                    if (z9) {
                                        if (view.getVisibility() != 0) {
                                            this.i0.setVisibility(0);
                                            this.h0.setVisibility(0);
                                        }
                                    } else if (view.getVisibility() != 4) {
                                        this.i0.setVisibility(4);
                                        this.h0.setVisibility(4);
                                    }
                                    thc thcVar = this.T0;
                                    gm.r(thcVar);
                                    if (this.p0 == 3) {
                                        gm.d3(thcVar, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z8 = true;
                            if (this.n0) {
                            }
                            this.y.setState(z9);
                            this.x.setState(z9);
                            this.r.e(z9);
                            if (this.m0) {
                                this.g0 = false;
                                if (sharedInstance != null) {
                                }
                            }
                            View view2 = this.i0;
                            if (z9) {
                            }
                            thc thcVar2 = this.T0;
                            gm.r(thcVar2);
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
                    o(z14, z16);
                    if (this.E.getTag() != null) {
                    }
                    if (z14) {
                    }
                    this.f0.setEnabled(z13);
                    this.f0.setTag(!z13 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z5;
                    if (!z5) {
                        r(true);
                    }
                    if (this.x0) {
                        gm.d3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i122 = this.p0;
                    if (i122 == 11) {
                    }
                    if (!z13) {
                    }
                    ImageView imageView3 = this.I;
                    if (z14) {
                    }
                    i2 = this.p0;
                    if (i2 != 10) {
                        u(z14);
                    }
                    if (z2) {
                    }
                    this.G.d(z, z14);
                    if (this.E.getVisibility() == 0) {
                        L += gm.L(24.0f);
                        layout = this.U.getLayout();
                        if (layout != null) {
                            L = aq1.h(lineCount, 2, gm.L(20.0f), L);
                        }
                    }
                    if (this.p0 == 11) {
                        L -= gm.L(24.0f);
                    }
                    if (!this.n0) {
                    }
                    L -= gm.L(60.0f);
                    if (z14) {
                    }
                    this.v0 = L;
                    if (sharedInstance == null) {
                    }
                    int i132 = this.p0;
                    this.D0 = i132 == 11 && i132 != 17 && ((this.n0 && !z19) || this.m0);
                    if (sharedInstance != null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    phcVar = this.a0;
                    if (phcVar.getParent() == null) {
                    }
                    phcVar.U = childsHight;
                    phcVar2 = this.Z;
                    if (phcVar2.getParent() == null) {
                    }
                    phcVar2.U = childsHight;
                    this.Z.setUiVisible(this.x0);
                    this.a0.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    phc phcVar32 = this.a0;
                    if (z4) {
                    }
                    this.Z.a();
                    this.a0.a();
                    w();
                    if (this.p0 == 3) {
                    }
                    z8 = true;
                    if (this.n0) {
                    }
                    this.y.setState(z9);
                    this.x.setState(z9);
                    this.r.e(z9);
                    if (this.m0) {
                    }
                    View view22 = this.i0;
                    if (z9) {
                    }
                    thc thcVar22 = this.T0;
                    gm.r(thcVar22);
                    if (this.p0 == 3) {
                    }
                }
            }
            v(z14);
            if (this.p0 == 5) {
                z = this.s0;
                if (!z && this.q0 != 5) {
                    this.G.b(jb6.M0(2131743103, null), true, z14);
                }
                z13 = false;
                z2 = false;
                if (this.o0 == null) {
                }
            } else {
                z2 = true;
                this.s0 = true;
                z = false;
                z13 = false;
                if (this.o0 == null) {
                }
            }
        }
        z = false;
        z13 = false;
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
