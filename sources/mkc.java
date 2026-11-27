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
import org.webrtc.MediaStreamTrack;
import org.webrtc.RendererCommon;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mkc implements VoIPService.StateListener, fn7 {
    public static mkc m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public bo5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public emc G;
    public boolean G0;
    public lkc H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public d41 L;
    public int M;
    public zkc M0;
    public sbc N;
    public ug2 N0;
    public oob O;
    public ug2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public u8 Q;
    public jo0 R;
    public boolean R0;
    public g7 S;
    public TextView T;
    public fx0 U;
    public boolean U0;
    public r34 V;
    public float V0;
    public float W0;
    public float X0;
    public ikc Y;
    public float Y0;
    public ujc Z;
    public float Z0;
    public final int a;
    public ujc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public bnb c0;
    public float c1;
    public final TLRPC.User d;
    public hmc d0;
    public int d1;
    public dnc e;
    public hmc e0;
    public int e1;
    public dnc f;
    public o4 f0;
    public boolean g0;
    public boolean g1;
    public dnc h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public ljc j0;
    public boolean j1;
    public hmc k1;
    public boolean l1;
    public boolean m0;
    public jkc n;
    public boolean n0;
    public gkc o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public hkc s;
    public boolean s0;
    public float t0;
    public fkc u0;
    public int v0;
    public wmc w;
    public AccessibilityManager w0;
    public tmc x;
    public xmc y;
    public boolean z0;
    public final kjc r = new kjc();
    public final de0[] W = new de0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final pn L0 = new pn(null);
    public final pzb Q0 = new pzb(this, 9);
    public final xjc S0 = new xjc(this, 12);
    public final xjc T0 = new xjc(this, 13);
    public float f1 = 1.0f;

    public mkc(int i) {
        this.a = i;
        this.c = uc7.s1(i).X1(Long.valueOf(yac.h(i).e()));
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
        jn7.e().b(this, jn7.R4);
        jn7.f(i).b(this, jn7.P4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.E2);
        jn7.e().b(this, jn7.J5);
    }

    public static void h(int[] iArr, int i) {
        mkc mkcVar = m1;
        if (mkcVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    mkcVar.u0.b();
                    return;
                }
                if (iArr.length > 0 && iArr[0] == 0) {
                    mkcVar.i(new osa((byte) 9));
                } else if (!mkcVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    xkc.h(mkcVar.b, new xjc(mkcVar, (byte) 4), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    mkcVar.u0.b();
                } else {
                    if (iArr.length <= 0 || iArr[0] != 0) {
                        return;
                    }
                    mkcVar.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i) {
        int size;
        mkc mkcVar = m1;
        if (mkcVar != null && mkcVar.u0.getParent() == null) {
            mkc mkcVar2 = m1;
            if (mkcVar2 != null) {
                mkcVar2.d0.d.e();
                m1.e0.d.e();
                m1.c0.e();
                fkc fkcVar = m1.u0;
                if (fkcVar != null) {
                    fkcVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 != null || activity.isFinishing()) {
            return;
        }
        boolean z = dlc.d() != null;
        if (VoIPService.getSharedState() == null || VoIPService.getSharedState().getUser() == null) {
            return;
        }
        mkc mkcVar3 = new mkc(i);
        mkcVar3.b = activity;
        m1 = mkcVar3;
        fkc fkcVar2 = new fkc(activity, !z, mkcVar3);
        m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        ((PowerManager) activity.getSystemService("power")).isInteractive();
        m1.getClass();
        fkcVar2.setLockOnScreen(m1.J0);
        mkcVar3.u0 = fkcVar2;
        wjc wjcVar = new wjc(mkcVar3, (byte) 3);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(fkcVar2, wjcVar);
        ((WindowManager) activity.getSystemService("window")).addView(fkcVar2, qmc.a());
        mkcVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        mkcVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
        hkc hkcVar = new hkc(mkcVar3, activity);
        hkcVar.setClipToPadding(false);
        hkcVar.setClipChildren(false);
        hkcVar.setBackgroundColor(-16777216);
        mkcVar3.x();
        mkcVar3.s = hkcVar;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        boolean z2 = sharedState != null && sharedState.isConference();
        kjc kjcVar = mkcVar3.r;
        mkcVar3.w = new wmc(activity, z2, kjcVar);
        hmc hmcVar = new hmc(activity, false, true, false, false);
        mkcVar3.d0 = hmcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        hmcVar.d.setScalingType(scalingType);
        mkcVar3.d0.d.setEnableHardwareScaler(true);
        mkcVar3.d0.d.setRotateTextureWithScreen(true);
        mkcVar3.d0.b0 = (byte) 1;
        hkcVar.addView(mkcVar3.w, tre.c(-1.0f, -1));
        TLRPC.User user = mkcVar3.d;
        tmc tmcVar = new tmc(activity, user, kjcVar);
        mkcVar3.x = tmcVar;
        hkcVar.addView(tmcVar, tre.c(-1.0f, -1));
        xmc xmcVar = new xmc(activity);
        byte b = 2;
        if (i86.e(512)) {
            int i2 = aob.a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i3 = calendar.get(2);
            int i4 = calendar.get(5);
            calendar.get(12);
            calendar.get(11);
            if ((i3 == 11 && i4 >= 24 && i4 <= 31) || (i3 == 0 && i4 == 1)) {
                xmcVar.a = new wna(0);
            }
        }
        mkcVar3.y = xmcVar;
        hkcVar.addView(xmcVar, tre.c(220.0f, -1));
        hkcVar.addView(mkcVar3.d0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        new yd0(orientation, new int[]{-14994098, -14328963}).f(ri6.A(1), new ypb(mkcVar3, (byte) 1), 0L);
        ujc ujcVar = new ujc(activity);
        mkcVar3.Z = ujcVar;
        ujcVar.setDelegate(new wjc(mkcVar3, b));
        mkcVar3.Z.d(1.0f, 1.0f);
        mkcVar3.b0 = true;
        hmc hmcVar2 = new hmc(activity, true, false);
        mkcVar3.e0 = hmcVar2;
        hmcVar2.d.setIsCamera(true);
        mkcVar3.e0.d.setUseCameraRotation(true);
        mkcVar3.Z.setOnTapListener(new yjc(mkcVar3, (byte) 1));
        mkcVar3.e0.d.setMirror(true);
        mkcVar3.Z.addView(mkcVar3.e0);
        ujc ujcVar2 = new ujc(activity);
        mkcVar3.a0 = ujcVar2;
        ujcVar2.T = true;
        ujcVar2.c(true, false);
        bnb bnbVar = new bnb(activity);
        mkcVar3.c0 = bnbVar;
        bnbVar.setEnableHardwareScaler(true);
        mkcVar3.c0.setIsCamera(false);
        mkcVar3.c0.setFpsReduction(30.0f);
        mkcVar3.c0.setScalingType(scalingType);
        mkcVar3.a0.addView(mkcVar3.c0, tre.e(-1, -2, 17));
        mkcVar3.a0.setOnTapListener(new yjc(mkcVar3, b));
        mkcVar3.a0.setVisibility(8);
        hkcVar.addView(mkcVar3.Z, tre.c(-2.0f, -2));
        hkcVar.addView(mkcVar3.a0);
        View view = new View(activity);
        mkcVar3.h0 = view;
        view.setBackground(new GradientDrawable(orientation, new int[]{0, vm2.o(-16777216, jn7.K1)}));
        hkcVar.addView(mkcVar3.h0, tre.e(-1, jn7.p2, 80));
        View view2 = new View(activity);
        mkcVar3.i0 = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{vm2.o(-16777216, jn7.m1), 0}));
        hkcVar.addView(mkcVar3.i0, tre.e(-1, jn7.p2, 48));
        oob oobVar = new oob((byte) 23, activity, mkcVar3);
        mkcVar3.O = oobVar;
        oobVar.setOrientation(0);
        mkcVar3.O.setPadding(0, 0, 0, hl.L(30.0f));
        mkcVar3.O.setClipToPadding(false);
        mkcVar3.O.setContentDescription(ob6.M0(2131742954, null));
        mkcVar3.O.setOnClickListener(new yjc(mkcVar3, (byte) 3));
        mkcVar3.Q = new u8(activity, kjcVar);
        FrameLayout frameLayout = new FrameLayout(activity);
        mkcVar3.P = frameLayout;
        frameLayout.addView(mkcVar3.Q, tre.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
        mkcVar3.P.setVisibility(8);
        mkcVar3.P.setOnClickListener(new yjc(mkcVar3, (byte) 4));
        g7 g7Var = new g7(activity, kjcVar);
        mkcVar3.S = g7Var;
        g7Var.setOrientation(1);
        TextView textView = new TextView(activity);
        mkcVar3.T = textView;
        textView.setText(ob6.M0(2131743143, null));
        mkcVar3.T.setTextSize(1, 15.0f);
        mkcVar3.T.setTypeface(hl.o());
        mkcVar3.T.setTextColor(-1);
        mkcVar3.T.setGravity(17);
        fx0 fx0Var = new fx0((byte) 8, activity, mkcVar3);
        mkcVar3.U = fx0Var;
        fx0Var.setTextSize(1, 15.0f);
        mkcVar3.U.setTextColor(-1);
        mkcVar3.U.setGravity(17);
        mkcVar3.U.setText(ob6.a0("CallEmojiKeyTooltip", null, 2131752608, TextUtils.ellipsize(lbc.k(user, true), mkcVar3.U.getPaint(), hl.L(300.0f), TextUtils.TruncateAt.END)));
        mkcVar3.S.setVisibility(8);
        mkcVar3.S.addView(mkcVar3.T);
        mkcVar3.S.addView(mkcVar3.U, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
        mkcVar3.S.setPadding(hl.L(18.0f), hl.L(80.0f), hl.L(18.0f), hl.L(18.0f));
        int i5 = 0;
        while (i5 < 4) {
            de0 de0Var = new de0(activity);
            de0[] de0VarArr = mkcVar3.W;
            de0VarArr[i5] = de0Var;
            de0VarArr[i5].getImageReceiver().S0 = true;
            mkcVar3.O.addView(de0VarArr[i5], tre.k(i5 == 0 ? 0.0f : 6.0f, 0.0f, 0.0f, 0.0f, 25, 25));
            i5++;
        }
        ikc ikcVar = new ikc(mkcVar3, activity);
        mkcVar3.Y = ikcVar;
        ikcVar.setOrientation(1);
        mkcVar3.Y.setFocusable(true);
        mkcVar3.Y.setFocusableInTouchMode(true);
        mkcVar3.E = new bo5(activity);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        bo5 bo5Var = mkcVar3.E;
        int i6 = mkcVar3.a;
        bo5Var.b.m(jn5.m(i6, 0, user), null, rb0Var, user);
        mkcVar3.E.setRoundRadius(hl.L(135.0f) / 2);
        TextView textView2 = new TextView(activity);
        mkcVar3.F = textView2;
        textView2.setTextSize(1, 28.0f);
        mkcVar3.F.setText(pv3.m(lv2.m(0, user.first_name, user.last_name), mkcVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
        mkcVar3.F.setMaxLines(2);
        mkcVar3.F.setEllipsize(TextUtils.TruncateAt.END);
        mkcVar3.F.setTextColor(-1);
        mkcVar3.F.setGravity(1);
        mkcVar3.F.setImportantForAccessibility(2);
        mkcVar3.Y.addView(mkcVar3.F, tre.t(-2, -2, 1, 8, 0, 8, 6));
        emc emcVar = new emc(activity);
        emcVar.a = new TextView[2];
        int i7 = 0;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            emcVar.a[i7] = new TextView(activity);
            emcVar.a[i7].setTextSize(1, 15.0f);
            emcVar.a[i7].setTextColor(-1);
            emcVar.a[i7].setGravity(1);
            emcVar.addView(emcVar.a[i7]);
            i7++;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        emcVar.c = frameLayout2;
        do8 do8Var = new do8(emcVar, activity, kjcVar);
        do8Var.setTextSize(1, 15.0f);
        do8Var.setTextColor(-1);
        do8Var.setGravity(1);
        do8Var.setPadding(hl.L(12.0f), hl.L(2.0f), hl.L(12.0f), hl.L(2.0f));
        do8Var.setText(ob6.M0(2131742869, null));
        frameLayout2.addView(do8Var, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        emcVar.addView(frameLayout2, tre.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(activity);
        emcVar.b = textView3;
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(1);
        emcVar.addView(textView3, tre.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131742905, null));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new t0(new View[]{textView3}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView3.setText(spannableStringBuilder);
        textView3.setVisibility(8);
        imc imcVar = new imc(activity);
        emcVar.d = imcVar;
        emcVar.addView(imcVar, tre.c(-2.0f, -1));
        mkcVar3.G = emcVar;
        WeakHashMap weakHashMap2 = ihc.a;
        emcVar.setImportantForAccessibility(4);
        mkcVar3.Y.addView(mkcVar3.G, tre.t(-2, -2, 1, 0, 0, 0, 6));
        if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
            lkc lkcVar = new lkc(activity);
            mkcVar3.H = lkcVar;
            long j = sharedState.getUser().id;
            ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
            int i9 = sharedState.getGroupCall().participants_count;
            if (groupParticipants != null) {
                size = groupParticipants.size();
            } else if (i9 <= 0) {
                lkcVar.setVisibility(8);
                mkcVar3.Y.addView(mkcVar3.H, tre.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
            } else {
                size = 0;
            }
            int max = Math.max(i9, size);
            int min = Math.min(3, groupParticipants == null ? 0 : groupParticipants.size());
            ic0 ic0Var = lkcVar.b;
            ic0Var.i(min);
            int i10 = 0;
            while (i10 < min) {
                ic0Var.j(i10, i6, uc7.s1(i6).b2(wf3.n(groupParticipants.get(i10).peer)));
                i10++;
                j = j;
            }
            long j2 = j;
            ic0Var.a(false, true);
            if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && wf3.n(groupParticipants.get(0).peer) == j2))) {
                lkcVar.setVisibility(8);
            } else {
                lkcVar.c = new pkb(ob6.H(',', "Participants", max), 14.0f, hl.o());
                lkcVar.setVisibility(0);
                lkcVar.invalidate();
            }
            mkcVar3.Y.addView(mkcVar3.H, tre.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
        }
        mkcVar3.Y.setClipChildren(false);
        mkcVar3.Y.setClipToPadding(false);
        mkcVar3.Y.setPadding(0, 0, 0, hl.L(15.0f));
        mkcVar3.V = new r34(activity);
        mkcVar3.R = new jo0(activity, kjcVar);
        mkcVar3.V.setAlpha(0.0f);
        mkcVar3.R.setVisibility(8);
        hkcVar.addView(mkcVar3.E, tre.d(jn7.h3, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.Y, tre.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.P, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.S, tre.d(jn7.a5, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.O, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.V, tre.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
        hkcVar.addView(mkcVar3.R, tre.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
        mkcVar3.j0 = new ljc(activity);
        mkcVar3.e = new dnc(activity, kjcVar);
        mkcVar3.f = new dnc(activity, kjcVar);
        mkcVar3.h = new dnc(activity, kjcVar);
        mkcVar3.n = new jkc(activity, 52.0f);
        mkcVar3.e.setTranslationY(hl.L(100.0f));
        mkcVar3.e.setScaleX(0.0f);
        mkcVar3.e.setScaleY(0.0f);
        mkcVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mkcVar3.f.setTranslationY(hl.L(100.0f));
        mkcVar3.f.setScaleX(0.0f);
        mkcVar3.f.setScaleY(0.0f);
        mkcVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mkcVar3.h.setTranslationY(hl.L(100.0f));
        mkcVar3.h.setScaleX(0.0f);
        mkcVar3.h.setScaleY(0.0f);
        mkcVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mkcVar3.n.setTranslationY(hl.L(100.0f));
        mkcVar3.n.setScaleX(0.0f);
        mkcVar3.n.setScaleY(0.0f);
        mkcVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
        mkcVar3.j0.addView(mkcVar3.e);
        mkcVar3.j0.addView(mkcVar3.f);
        mkcVar3.j0.addView(mkcVar3.h);
        mkcVar3.j0.addView(mkcVar3.n);
        o4 o4Var = new o4(activity);
        mkcVar3.f0 = o4Var;
        o4Var.setListener(new kkc(mkcVar3));
        mkcVar3.f0.setScaleX(1.15f);
        mkcVar3.f0.setScaleY(1.15f);
        hkcVar.addView(mkcVar3.j0, tre.e(-1, -2, 80));
        float f = hl.O1() ? 100 : 27;
        hkcVar.addView(mkcVar3.f0, tre.d(-1, 186.0f, 80, f, 0.0f, f, 0.0f));
        ImageView imageView = new ImageView(activity);
        mkcVar3.J = imageView;
        imageView.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
        mkcVar3.J.setImageResource(R.drawable.msg_addcontact);
        mkcVar3.J.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        hkcVar.addView(mkcVar3.J, tre.e(56, 56, 53));
        iye.a(mkcVar3.J);
        ImageView imageView2 = new ImageView(activity);
        mkcVar3.I = imageView2;
        imageView2.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
        mkcVar3.I.setImageResource(R.drawable.msg_call_minimize_shadow);
        mkcVar3.I.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        mkcVar3.I.setContentDescription(ob6.M0(2131753749, null));
        hkcVar.addView(mkcVar3.I, tre.e(56, 56, 51));
        iye.a(mkcVar3.I);
        d41 d41Var = new d41((Context) activity, (byte) 5);
        mkcVar3.L = d41Var;
        d41Var.setContentDescription(ob6.M0(2131742891, null));
        mkcVar3.L.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
        mkcVar3.L.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        hkcVar.addView(mkcVar3.L, tre.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
        mkcVar3.L.setAlpha(0.0f);
        mkcVar3.L.setOnClickListener(new yjc(mkcVar3, (byte) 5));
        byte b2 = 6;
        mkcVar3.I.setOnClickListener(new yjc(mkcVar3, b2));
        mkcVar3.J.setOnClickListener(new jjb((Object) mkcVar3, (Object) activity, (byte) 13));
        if (mkcVar3.u0.b) {
            mkcVar3.I.setVisibility(8);
            mkcVar3.J.setVisibility(8);
        }
        zkc zkcVar = new zkc(activity);
        zkcVar.a = new HashMap();
        zkcVar.b = new ArrayList();
        zkcVar.c = new ArrayList();
        TextPaint textPaint = new TextPaint();
        zkcVar.r = textPaint;
        zkcVar.setOrientation(1);
        zkcVar.n = kjcVar;
        TransitionSet transitionSet = new TransitionSet();
        zkcVar.d = transitionSet;
        byte b3 = 5;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new i7(b3).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(hl.L(14.0f));
        mkcVar3.M0 = zkcVar;
        zkcVar.setGravity(80);
        mkcVar3.M0.setOnViewsUpdated(new xjc(mkcVar3, b3));
        hkcVar.addView(mkcVar3.M0, tre.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
        ug2 ug2Var = new ug2(activity, 3, kjcVar, true);
        ug2Var.p(true);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ug2Var.L = alignment;
        ug2Var.d = -1L;
        ug2Var.r0 = new xjc(mkcVar3, b2);
        ug2Var.U = true;
        ug2Var.h = hl.L(320.0f);
        ug2Var.e = true;
        ug2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
        ug2Var.q(8.0f);
        mkcVar3.N0 = ug2Var;
        ug2Var.t(ob6.M0(2131743907, null));
        hkcVar.addView(mkcVar3.N0, tre.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
        ug2 ug2Var2 = new ug2(activity, 1, kjcVar, false);
        ug2Var2.p(true);
        ug2Var2.L = alignment;
        ug2Var2.d = 4000L;
        ug2Var2.U = true;
        ug2Var2.h = hl.L(320.0f);
        ug2Var2.e = true;
        ug2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
        ug2Var2.q(8.0f);
        mkcVar3.O0 = ug2Var2;
        ug2Var2.t(ob6.M0(2131742954, null));
        hkcVar.addView(mkcVar3.O0, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        mkcVar3.y();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!mkcVar3.U0) {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                mkcVar3.U0 = phoneCall != null && phoneCall.video;
            }
            mkcVar3.f();
        }
        fkcVar2.addView(hkcVar);
        if (z) {
            mkcVar3.F0 = 0.0f;
            mkcVar3.I0 = true;
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                mkcVar3.d0.setStub(dlc.d().s);
                mkcVar3.e0.setStub(dlc.d().r);
            }
            mkcVar3.u0.setAlpha(0.0f);
            mkcVar3.y();
            mkcVar3.E0 = true;
            dlc.T = true;
            if (dlc.V != null) {
                dlc.U.getClass();
                throw null;
            }
            mkcVar3.L0.d();
            hl.d3(new xjc(mkcVar3, (byte) 11), 32L);
        } else {
            mkcVar3.F0 = 1.0f;
            mkcVar3.x();
        }
        elc.c();
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
        float f7 = dlc.d().d.x + dlc.d().F;
        float f8 = dlc.d().d.y + dlc.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        dlc.U.getClass();
        final float measuredWidth2 = f7 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f8 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        ujc ujcVar = this.Z;
        final float f9 = 0.0f;
        if (z4) {
            int measuredWidth3 = ujcVar.getMeasuredWidth();
            if (!this.n0 || measuredWidth3 == 0) {
                c = 0;
                f5 = 0.0f;
                measuredWidth = 1.0f;
                f6 = 1.0f;
                z3 = false;
            } else {
                f5 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = bp1.v(dlc.d().f, 0.25f, 0.4f, (dlc.d().f * 0.25f) + (f7 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f5)) / 2.0f))) - hl.L(4.0f);
                f6 = bp1.v(dlc.d().h, 0.25f, 0.4f, (dlc.d().h * 0.25f) + (f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f5)) / 2.0f))) - hl.L(4.0f);
                z3 = true;
            }
            float f10 = f5;
            measuredHeight = f6;
            z2 = z3;
            f = f10;
        } else {
            c = 0;
            measuredWidth = f7 - ((ujcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f8 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f11 = measuredWidth;
        final float L = this.m0 ? hl.L(4.0f) : 0.0f;
        final float L2 = (hl.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            dlc.U.getClass();
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
            this.d0.setRoundCorners((hl.L(6.0f) * 1.0f) / 0.25f);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bkc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue;
                mkc mkcVar = mkc.this;
                mkcVar.F0 = f13;
                mkcVar.x();
                if (z2) {
                    float f14 = (f * floatValue) + (scaleX * f13);
                    mkcVar.Z.setScaleX(f14);
                    mkcVar.Z.setScaleY(f14);
                    mkcVar.Z.setTranslationX((f11 * floatValue) + (x * f13));
                    mkcVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f13));
                    mkcVar.Z.setCornerRadius((L2 * floatValue) + (L * f13));
                    mkcVar.Z.setAlpha((f9 * floatValue) + (1.0f * f13));
                }
                float f15 = (f12 * floatValue) + (1.0f * f13);
                mkcVar.d0.setScaleX(f15);
                mkcVar.d0.setScaleY(f15);
                float f16 = 0.0f * f13;
                float f17 = (measuredWidth2 * floatValue) + f16;
                float f18 = (measuredHeight2 * floatValue) + f16;
                mkcVar.d0.setTranslationX(f17);
                mkcVar.d0.setTranslationY(f18);
                mkcVar.d0.setRoundCorners(((hl.L(4.0f) * floatValue) * 1.0f) / f15);
                if (!mkcVar.Z.Q) {
                    mkcVar.e0.d(false, floatValue);
                }
                mkcVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        jn7.e().n(this, jn7.R4);
        jn7.f(this.a).n(this, jn7.P4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.E2);
        jn7.e().n(this, jn7.J5);
        sbc sbcVar = this.N;
        if (sbcVar != null) {
            sbcVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            tmc tmcVar = this.x;
            byte b = 1;
            if (tmcVar.L && z != tmcVar.F) {
                tmcVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                tmcVar.c = ofFloat;
                ofFloat.addUpdateListener(new smc(tmcVar, b));
                tmcVar.c.setInterpolator(k43.f);
                tmcVar.c.setDuration(200L);
                tmcVar.c.start();
            }
            if (z) {
                int i = xea.b1;
                if (i < 2) {
                    xea.b1 = i + 2;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", xea.b1);
                    edit.apply();
                }
                this.O0.f(true);
                hl.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(hl.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(k43.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(k43.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(hl.L(140.0f));
                k43 k43Var = k43.f;
                ik8.t(translationY, k43Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-hl.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ckc(this, (byte) 3)).setInterpolator(k43Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(k43.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                k43 k43Var2 = k43.f;
                duration.setInterpolator(k43Var2).setListener(new gf4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(k43Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-hl.L(120.0f)).setListener(new ckc(this, (byte) 4)).setDuration(250L).setInterpolator(k43Var2).start();
            }
            this.q0 = this.p0;
            y();
        }
    }

    public final void d() {
        this.u0.b();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.P4) {
            if (this.p0 != 17 || VoIPService.getSharedInstance() == null) {
                return;
            }
            this.e0.d.e();
            this.d0.d.e();
            this.c0.e();
            f();
            VoIPService.getSharedInstance().registerStateListener(this);
            return;
        }
        if (i == jn7.l4) {
            v(true);
            return;
        }
        if (i == jn7.E2) {
            this.u0.b();
            return;
        }
        if (i == jn7.R4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
            return;
        }
        if (i == jn7.J5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        mkc mkcVar;
        byte b = 0;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            mkcVar = this;
            ofFloat.addUpdateListener(new bt4(mkcVar, this.f1, this.Y0, this.Z0, (byte) 2));
            mkcVar.i1.addListener(new ckc(mkcVar, b));
            mkcVar.i1.setDuration(350L);
            mkcVar.i1.setInterpolator(k43.f);
            mkcVar.i1.start();
        } else {
            mkcVar = this;
        }
        mkcVar.h1 = false;
        mkcVar.a1 = false;
    }

    public final void f() {
        this.e0.d.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dkc(this));
        this.d0.d.c(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ekc(this), EglBase.CONFIG_PLAIN, new nkc());
        this.c0.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (this.G0 || this.E0) {
            return;
        }
        gkc gkcVar = this.o0;
        if (gkcVar != null) {
            gkcVar.a(false, false);
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
                mkc mkcVar = m1;
                dlc.f(mkcVar.b, mkcVar.a, mkcVar.u0.getMeasuredWidth(), measuredHeight, 1);
                WindowInsets windowInsets = m1.r0;
                if (windowInsets != null) {
                    dlc.W = windowInsets.getSystemWindowInsetTop();
                    m1.r0.getSystemWindowInsetBottom();
                }
            }
            if (dlc.d() != null) {
                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                k43 k43Var = k43.f;
                duration.setInterpolator(k43Var).start();
                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                dlc.T = true;
                this.E0 = true;
                ValueAnimator a = a(false);
                this.L0.d();
                a.addListener(new ckc(this, b));
                a.setDuration(350L);
                a.setInterpolator(k43Var);
                a.start();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.f0.getLocationOnScreen(new int[2]);
            o4 o4Var = this.f0;
            ValueAnimator valueAnimator = o4Var.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                o4Var.c0 = null;
                o4Var.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        o4 o4Var2 = this.f0;
        ValueAnimator valueAnimator2 = o4Var2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            o4Var2.c0 = null;
            o4Var2.V.stop();
        }
        this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, ob6.M0(2131743063, null), false, false);
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
        final int L = hl.L(24.0f);
        final int L2 = hl.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zjc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mkc mkcVar = mkc.this;
                mkcVar.f0.setTranslationY(L2 * floatValue);
                int i = (int) (marginEnd - ((r0 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i;
                marginLayoutParams2.rightMargin = i;
                mkcVar.f0.requestLayout();
            }
        });
        o4 o4Var3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o4Var3, (Property<o4, Float>) View.SCALE_X, o4Var3.getScaleX(), 1.0f, 1.0f, 1.0f);
        o4 o4Var4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o4Var4, (Property<o4, Float>) View.SCALE_Y, o4Var4.getScaleY(), 1.0f, 1.0f, 1.0f);
        o4 o4Var5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(o4Var5, (Property<o4, Float>) View.ALPHA, o4Var5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new wd8((Object) this, (Object) runnable, (byte) 22));
        animatorSet.start();
        hl.d3(new xjc(this, (byte) 7), 133L);
    }

    public final void j(dnc dncVar, VoIPService voIPService) {
        if (!this.n0) {
            dncVar.d(2, false, false);
            dncVar.setOnBtnClickedListener(null);
            dncVar.setEnabled(false);
        } else {
            dncVar.setEnabled(true);
            if (voIPService.isFrontFaceCamera()) {
                dncVar.d(2, !voIPService.isSwitchingCamera(), false);
            } else {
                dncVar.d(2, voIPService.isSwitchingCamera(), false);
            }
            dncVar.setOnBtnClickedListener(new o48((Object) this, (Object) voIPService, (Object) dncVar, (byte) 19));
        }
    }

    public final void k(dnc dncVar, VoIPService voIPService, boolean z) {
        dncVar.d(1, voIPService.isMicMute(), false);
        ujc ujcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = ujcVar.g0;
        if (z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(ujcVar.L, isMicMute ? 1.0f : 0.0f);
            ujcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(ujcVar.h0);
            ujcVar.g0.setDuration(150L);
            ujcVar.g0.start();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ujcVar.L = isMicMute ? 1.0f : 0.0f;
            ujcVar.invalidate();
        }
        dncVar.setOnBtnClickedListener(new wjc(this, (byte) 4));
    }

    public final void l(final dnc dncVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            dncVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            dncVar.d(5, true, false);
        } else {
            dncVar.d(5, false, false);
            i = 1;
        }
        dncVar.setEnabled(true);
        dncVar.setOnBtnClickedListener(new bnc() { // from class: akc
            @Override // bnc
            public final void c(cnc cncVar) {
                if (VoIPService.getSharedInstance() != null) {
                    mkc mkcVar = mkc.this;
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(mkcVar.b, false, Integer.valueOf(i));
                    mkcVar.l(dncVar, voIPService);
                }
            }
        });
    }

    public final void m(dnc dncVar, VoIPService voIPService, boolean z) {
        if (!((this.n0 || this.m0) ? true : voIPService.isVideoAvailable())) {
            dncVar.d(3, true, false);
            dncVar.setOnClickListener(null);
            dncVar.setEnabled(false);
            return;
        }
        if (!this.n0) {
            dncVar.d(3, true, z);
        } else if (voIPService.isScreencast()) {
            dncVar.d(3, false, z);
        } else {
            dncVar.d(3, false, z);
        }
        dncVar.setOnBtnClickedListener(new wjc(this, (byte) 5));
        dncVar.setEnabled(true);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3 = (this.n0 || this.m0) ? false : true;
        bo5 bo5Var = this.E;
        byte b = 8;
        if (!z) {
            bo5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            this.E.setVisibility(z3 ? 0 : 8);
        } else if (z3) {
            if (bo5Var.getTag() == null) {
                this.E.animate().setListener(null).cancel();
                this.E.setVisibility(0);
                if (!this.C0) {
                    bo5 bo5Var2 = this.E;
                    if (z2) {
                        bo5Var2.setAlpha(0.0f);
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                    } else {
                        bo5Var2.setAlpha(0.0f);
                        this.E.setTranslationY(-hl.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                    }
                } else if (z2) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(hl.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            }
        } else if (bo5Var.getTag() != null) {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(k43.f).setListener(new ckc(this, b)).start();
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
        elc.c();
        y();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
        wmc wmcVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G == null || (wmcVar = this.w) == null) {
            return;
        }
        int i2 = wmcVar.W;
        if ((i2 == 2 || i2 == 3) && this.j1) {
            hl.d3(new me7((Object) this, i, (byte) 26), 400L);
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
        v53 v53Var = new v53(0, null, this.b);
        boolean[] zArr = new boolean[3];
        v53Var.S = ob6.M0(2131743060, null);
        v53Var.U = charSequence;
        v53Var.m0 = ob6.M0(2131747558, null);
        v53Var.n0 = null;
        v53Var.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) v53Var.c(-(i + 1))) != null) {
                yob.X(textView, aob.q7, v53Var.j1);
            }
        }
        v53Var.setCanceledOnTouchOutside(true);
        v53Var.setOnDismissListener(new dl8(this, (byte) 14));
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
        ujc ujcVar = this.Z;
        if (i != 0) {
            boolean z2 = (ujcVar.getTag() == null || ((Integer) this.Z.getTag()).intValue() == 0) ? false : z;
            ujc ujcVar2 = this.Z;
            if (!z) {
                ujcVar2.setVisibility(0);
            } else if (ujcVar2.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z, (Property<ujc, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<ujc, Float>) View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, (Property<ujc, Float>) View.SCALE_Y, 0.7f, 1.0f));
                this.A0 = animatorSet3;
                animatorSet3.setDuration(150L).start();
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                ujc ujcVar3 = this.Z;
                if (ujcVar3.E < 0.0f) {
                    ujcVar3.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            this.Z.c(i == 2, z2);
            this.b0 = i != 2;
        } else if (!z) {
            ujcVar.setVisibility(8);
        } else if (ujcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
            AnimatorSet animatorSet4 = this.A0;
            if (animatorSet4 != null) {
                animatorSet4.removeAllListeners();
                this.A0.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            ujc ujcVar4 = this.Z;
            animatorSet5.playTogether(ObjectAnimator.ofFloat(ujcVar4, (Property<ujc, Float>) View.ALPHA, ujcVar4.getAlpha(), 0.0f));
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                ujc ujcVar5 = this.Z;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ujcVar5, (Property<ujc, Float>) View.SCALE_X, ujcVar5.getScaleX(), 0.7f);
                ujc ujcVar6 = this.Z;
                animatorSet5.playTogether(ofFloat, ObjectAnimator.ofFloat(ujcVar6, (Property<ujc, Float>) View.SCALE_Y, ujcVar6.getScaleX(), 0.7f));
            }
            this.A0 = animatorSet5;
            animatorSet5.addListener(new ckc(this, (byte) 7));
            this.A0.setDuration(250L).setInterpolator(k43.f);
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
        pzb pzbVar = this.Q0;
        if (z) {
            if (!z2) {
                this.N0.f(true);
                this.O0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                k43 k43Var = k43.f;
                translationY.setInterpolator(k43Var).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(k43Var).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                this.i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 1.0f);
                this.P0 = ofFloat;
                ofFloat.addUpdateListener(pzbVar);
                this.P0.setDuration(150L).setInterpolator(k43Var);
                this.P0.start();
                this.j0.setEnabled(true);
            }
        } else if (z2) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-hl.L(10.0f)).setDuration(150L);
            k43 k43Var2 = k43.f;
            duration.setInterpolator(k43Var2).start();
            this.I.animate().alpha(0.0f).translationY(-hl.L(10.0f)).setDuration(150L).setInterpolator(k43Var2).start();
            this.J.animate().alpha(0.0f).translationY(-hl.L(10.0f)).setDuration(150L).setInterpolator(k43Var2).start();
            this.O.animate().alpha(0.0f).translationY(-hl.L(10.0f)).setDuration(150L).setInterpolator(k43Var2).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-hl.L(10.0f)).setInterpolator(k43Var2).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-hl.L(10.0f)).setInterpolator(k43Var2).start();
            this.j0.animate().alpha(0.0f).translationY(hl.L(10.0f)).setDuration(150L).setInterpolator(k43Var2).start();
            this.h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var2).start();
            this.i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var2).start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.P0 = ofFloat2;
            ofFloat2.addUpdateListener(pzbVar);
            this.P0.setDuration(150L).setInterpolator(k43Var2);
            this.P0.start();
            hl.r(this.S0);
            this.R0 = false;
            this.j0.setEnabled(false);
            this.O0.f(true);
            i = jn7.f2;
            this.x0 = z;
            fkc fkcVar = this.u0;
            if (z) {
                fkcVar.setSystemUiVisibility(fkcVar.getSystemUiVisibility() | 4);
            } else {
                fkcVar.setSystemUiVisibility(fkcVar.getSystemUiVisibility() & (-5));
            }
            this.M0.animate().translationY((-hl.L(16.0f)) - (this.x0 ? hl.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(k43.f).start();
        }
        i = 0;
        this.x0 = z;
        fkc fkcVar2 = this.u0;
        if (z) {
        }
        this.M0.animate().translationY((-hl.L(16.0f)) - (this.x0 ? hl.L(80.0f) : 0)).setDuration(150L).setStartDelay(i).setInterpolator(k43.f).start();
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            xjc xjcVar = this.S0;
            hl.r(xjcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                hl.d3(xjcVar, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                this.s.announceForAccessibility(!this.n0 ? ob6.M0(2131754727, null) : ob6.M0(2131754728, null));
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
                gkc gkcVar = new gkc(this, this.s.getContext(), r0[0], r0[1]);
                this.o0 = gkcVar;
                WindowInsets windowInsets = this.r0;
                if (windowInsets != null) {
                    gkcVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
                Transition duration = new i7((byte) 4).setDuration(250L);
                k43 k43Var = k43.f;
                transitionSet.addTransition(duration.setInterpolator(k43Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(k43Var));
                transitionSet.excludeChildren(kmc.class, true);
                transitionSet.excludeChildren(dnc.class, true);
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
                this.n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, ob6.M0(2131743063, null), false, z);
                this.n.setOnClickListener(new yjc(this, null == true ? 1 : 0));
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
    /* JADX WARN: Type inference failed for: r0v17, types: [de0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [wl] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r2v19, types: [de0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [de0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r6v0, types: [de0[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z) {
        VoIPService sharedInstance;
        byte[] bArr;
        ?? r6;
        Drawable[] drawableArr;
        boolean z2;
        nl nlVar;
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
            cc4.g(e, false);
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
                pv3.k(emojifyForCall[i2]);
                lv3 g = pv3.g(emojifyForCall[i2]);
                if (g != null) {
                    g.setBounds(z3 ? 1 : 0, z3 ? 1 : 0, hl.L(40.0f), hl.L(40.0f));
                    g.b();
                    int[] iArr = new int[1];
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(hl.L(28.0f));
                    CharSequence m = pv3.m(emojifyForCall[i2], textPaint.getFontMetricsInt(), z3, iArr, z3 ? 1 : 0);
                    boolean z4 = m instanceof Spannable;
                    int i3 = this.a;
                    if (z4) {
                        Spannable spannable = (Spannable) m;
                        mv3[] mv3VarArr = (mv3[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), mv3.class);
                        hm[] hmVarArr = (hm[]) spannable.getSpans(z3 ? 1 : 0, spannable.length(), hm.class);
                        if (mv3VarArr != null) {
                            if ((iArr[z3 ? 1 : 0] - mv3VarArr.length) - (hmVarArr == null ? z3 ? 1 : 0 : hmVarArr.length) <= 0) {
                                int length = mv3VarArr.length;
                                int i4 = z3 ? 1 : 0;
                                ?? r3 = z3;
                                while (i4 < length) {
                                    mv3 mv3Var = mv3VarArr[i4];
                                    TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                    tL_inputStickerSetShortName.short_name = "StaticEmoji";
                                    TLRPC.TL_messages_stickerSet m0 = ls6.d0(i3).m0(tL_inputStickerSetShortName, Integer.valueOf((int) r3), false, true, new sh9(this, (byte) 24));
                                    if (m0 != null) {
                                        String replace = mv3Var.d.replace("️", "");
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
                                            if (TextUtils.equals(r47.V(document, null, null).replace("️", ""), replace)) {
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
                            if ((drawable instanceof wl) && ((wl) drawable).h() == document.id) {
                                r0 = (wl) drawableArr[i2];
                            } else {
                                wl wlVar = new wl(21, i3, document);
                                drawableArr[i2] = wlVar;
                                r0 = wlVar;
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
                if (drawable2 instanceof lv3) {
                    z2 = ((lv3) drawable2).a();
                } else {
                    if ((drawable2 instanceof wl) && (nlVar = ((wl) drawable2).k) != null) {
                        Drawable drawable3 = nlVar.b0;
                        if (!(drawable3 instanceof lv3) || ((lv3) drawable3).a()) {
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
                            ik8.t(r6[i8].animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), k43.k, 250L);
                        }
                    }
                }
                this.O0.postDelayed(new xjc(this, (byte) 9), 1000L);
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
        d41 d41Var = this.L;
        if (i2 != i) {
            hl.L3(d41Var, i);
        } else {
            d41Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(vm2.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(vm2.o(-16777216, (int) (127.5f * this.F0)));
        hkc hkcVar = this.s;
        if (hkcVar != null) {
            hkcVar.invalidate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0038. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0d31  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0d4c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0d8b  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07b6  */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        TLRPC.User user;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int L;
        int i2;
        boolean z4;
        float f;
        int i3;
        VoIPService voIPService;
        int childsHight;
        ujc ujcVar;
        ujc ujcVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        hmc hmcVar;
        VideoSink videoSink;
        boolean isMicMute;
        int i4;
        int remoteAudioState;
        int i5;
        int remoteVideoState;
        boolean z8;
        TL_phone.PhoneCall phoneCall;
        VoIPService.SharedUIParams sharedUIParams;
        long j;
        k43 k43Var;
        Layout layout;
        int lineCount;
        float f2;
        float f3;
        TL_phone.PhoneCall phoneCall2;
        float f4;
        boolean z9;
        boolean z10;
        TextView textView;
        int i6;
        if (this.G0 || this.E0) {
            return;
        }
        boolean z11 = true;
        byte b = 0;
        boolean z12 = this.q0 != -1;
        VoIPServiceState sharedState = VoIPService.getSharedState();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i7 = this.p0;
        byte b2 = 27;
        TLRPC.User user2 = this.d;
        int i8 = 2;
        if (i7 == 1 || i7 == 2) {
            user = user2;
            this.G.b(ob6.M0(2131743071, null), true, z12);
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    user = user2;
                    this.G.b(ob6.M0(2131743060, null), false, z12);
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    String lastError = sharedInstance2 != null ? sharedInstance2.getLastError() : Instance.ERROR_UNKNOWN;
                    if (TextUtils.equals(lastError, Instance.ERROR_UNKNOWN)) {
                        hl.d3(new xjc(this, (byte) 2), 1000L);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_INCOMPATIBLE)) {
                        p(hl.S2(ob6.a0("VoipPeerIncompatible", null, 2131742915, lv2.m(0, user.first_name, user.last_name))));
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PEER_OUTDATED)) {
                        if (this.U0) {
                            String a0 = ob6.a0("VoipPeerVideoOutdated", null, 2131742913, lbc.k(user, true));
                            boolean[] zArr = new boolean[1];
                            v53 v53Var = new v53(0, null, this.b);
                            boolean[] zArr2 = new boolean[3];
                            v53Var.S = ob6.M0(2131743060, null);
                            v53Var.U = hl.S2(a0);
                            String M0 = ob6.M0(2131752570, null);
                            wjc wjcVar = new wjc(this, (byte) 1);
                            v53Var.o0 = M0;
                            v53Var.p0 = wjcVar;
                            String M02 = ob6.M0(2131742912, null);
                            yw9 yw9Var = new yw9(this, zArr, (byte) 22);
                            v53Var.m0 = M02;
                            v53Var.n0 = yw9Var;
                            v53Var.show();
                            for (int i9 = 0; i9 < 3; i9++) {
                                if (zArr2[i9] && (textView = (TextView) v53Var.c(-(i9 + 1))) != null) {
                                    yob.X(textView, aob.q7, v53Var.j1);
                                }
                            }
                            v53Var.setCanceledOnTouchOutside(true);
                            v53Var.setOnDismissListener(new gf(this, zArr, (byte) 17));
                        } else {
                            p(hl.S2(ob6.a0("VoipPeerOutdated", null, 2131742914, lbc.k(user, true))));
                        }
                    } else if (TextUtils.equals(lastError, Instance.ERROR_PRIVACY)) {
                        p(hl.S2(ob6.a0(null, null, 2131752587, lv2.m(0, user.first_name, user.last_name))));
                        jj.i0(this.b, this.a, user.id);
                    } else if (TextUtils.equals(lastError, Instance.ERROR_AUDIO_IO)) {
                        p("Error initializing audio hardware");
                    } else if (TextUtils.equals(lastError, Instance.ERROR_LOCALIZED)) {
                        this.u0.b();
                    } else if (TextUtils.equals(lastError, Instance.ERROR_CONNECTION_SERVICE)) {
                        p(ob6.M0(2131743062, null));
                    } else {
                        hl.d3(new xjc(this, (byte) 1), 1000L);
                    }
                } else if (i7 != 5) {
                    switch (i7) {
                        case 11:
                            boolean z13 = sharedInstance != null && sharedInstance.hasRate();
                            this.e0.c();
                            if (!z13 || this.G0) {
                                user = user2;
                                hl.d3(new xjc(this, (byte) 0), 200L);
                                break;
                            } else {
                                if (this.x0) {
                                    int[] iArr = new int[2];
                                    int i10 = hl.q.x;
                                    this.n.getLocationOnScreen(iArr);
                                    int measuredWidth = ((i10 - iArr[0]) - ((this.n.getMeasuredWidth() - hl.L(52.0f)) / 2)) - hl.L(52.0f);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
                                    marginLayoutParams.rightMargin = measuredWidth;
                                    marginLayoutParams.leftMargin = measuredWidth;
                                    this.V.setTranslationY(iArr[1]);
                                    this.V.setAlpha(1.0f);
                                    this.V.setLayoutParams(marginLayoutParams);
                                    i6 = 3;
                                    user = user2;
                                    this.j0.animate().alpha(0.0f).setDuration(80L).start();
                                    hl.d3(new g9c(this, sharedInstance, b2), 2L);
                                } else {
                                    i6 = 3;
                                    user = user2;
                                    this.j0.setVisibility(8);
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
                                    layoutParams.rightMargin = hl.L(18.0f);
                                    layoutParams.leftMargin = hl.L(18.0f);
                                    int L2 = hl.L(36.0f);
                                    layoutParams.bottomMargin = L2;
                                    WindowInsets windowInsets = this.r0;
                                    if (windowInsets != null) {
                                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom() + L2;
                                    }
                                    layoutParams.gravity = 80;
                                    this.V.setLayoutParams(layoutParams);
                                    this.V.animate().alpha(1.0f).setDuration(250L).start();
                                    this.V.a(new vjc(this, sharedInstance, b), false);
                                }
                                this.R.setVisibility(0);
                                jo0 jo0Var = this.R;
                                wjc wjcVar2 = new wjc(this, b);
                                q29[] q29VarArr = (q29[]) jo0Var.d;
                                jo0Var.e = wjcVar2;
                                tt ttVar = (tt) jo0Var.c;
                                ttVar.setVisibility(0);
                                ((FrameLayout) jo0Var.b).setVisibility(0);
                                AnimatorSet animatorSet = new AnimatorSet();
                                int i11 = i6;
                                Property property = View.ALPHA;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ttVar, (Property<tt, Float>) property, 0.0f, 1.0f);
                                Property property2 = View.SCALE_X;
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ttVar, (Property<tt, Float>) property2, 0.7f, 1.0f);
                                Property property3 = View.SCALE_Y;
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ttVar, (Property<tt, Float>) property3, 0.7f, 1.0f);
                                float f5 = 0.0f;
                                Property property4 = View.TRANSLATION_Y;
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ttVar, (Property<tt, Float>) property4, hl.L(24.0f), 0.0f);
                                Animator[] animatorArr = new Animator[4];
                                animatorArr[0] = ofFloat;
                                animatorArr[1] = ofFloat2;
                                animatorArr[2] = ofFloat3;
                                animatorArr[i11] = ofFloat4;
                                animatorSet.playTogether(animatorArr);
                                animatorSet.setInterpolator(k43.f);
                                animatorSet.setDuration(250L);
                                int i12 = 0;
                                while (i12 < q29VarArr.length) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    q29VarArr[i12].setAlpha(f5);
                                    float[] fArr = new float[i8];
                                    // fill-array-data instruction
                                    fArr[0] = 0.0f;
                                    fArr[1] = 1.0f;
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q29VarArr[i12], (Property<q29, Float>) property, fArr);
                                    float[] fArr2 = new float[i8];
                                    // fill-array-data instruction
                                    fArr2[0] = 0.3f;
                                    fArr2[1] = 1.0f;
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q29VarArr[i12], (Property<q29, Float>) property2, fArr2);
                                    AnimatorSet animatorSet3 = animatorSet;
                                    float[] fArr3 = new float[i8];
                                    // fill-array-data instruction
                                    fArr3[0] = 0.3f;
                                    fArr3[1] = 1.0f;
                                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(q29VarArr[i12], (Property<q29, Float>) property3, fArr3);
                                    q29 q29Var = q29VarArr[i12];
                                    float[] fArr4 = new float[i8];
                                    fArr4[0] = hl.L(30.0f);
                                    fArr4[1] = 0.0f;
                                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(q29Var, (Property<q29, Float>) property4, fArr4);
                                    int i13 = i8;
                                    Animator[] animatorArr2 = new Animator[4];
                                    animatorArr2[0] = ofFloat5;
                                    animatorArr2[1] = ofFloat6;
                                    animatorArr2[i13] = ofFloat7;
                                    animatorArr2[i11] = ofFloat8;
                                    animatorSet2.playTogether(animatorArr2);
                                    animatorSet2.setDuration(250L);
                                    animatorSet2.setStartDelay(i12 << 4);
                                    animatorSet2.start();
                                    i12++;
                                    animatorSet = animatorSet3;
                                    i8 = i13;
                                    f5 = 0.0f;
                                }
                                int i14 = i8;
                                animatorSet.start();
                                if (this.C0) {
                                    this.C0 = false;
                                    ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(250L);
                                    k43 k43Var2 = k43.f;
                                    duration.setInterpolator(k43Var2).setListener(new gf4(this.P)).start();
                                    this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(k43Var2).setDuration(250L).start();
                                    this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-hl.L(120.0f)).setListener(new gf4(this.P)).setDuration(250L).setInterpolator(k43Var2).start();
                                }
                                for (de0 de0Var : this.W) {
                                    de0Var.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(k43.f).setDuration(250L).start();
                                }
                                this.F.animate().alpha(0.0f).setDuration(70L).setListener(new ckc(this, (byte) 5)).start();
                                ViewPropertyAnimator alpha = this.L.animate().alpha(0.0f);
                                k43 k43Var3 = k43.f;
                                ik8.t(alpha, k43Var3, 250L);
                                this.L.setVisibility(8);
                                this.G.d(false, true);
                                this.G.c(false);
                                imc imcVar = this.G.d;
                                imcVar.n = true;
                                imcVar.invalidate();
                                bo5 bo5Var = this.E;
                                bo5Var.setShowWaves(false);
                                AnimatorSet animatorSet4 = bo5Var.c;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                                AnimatorSet animatorSet5 = new AnimatorSet();
                                bo5Var.c = animatorSet5;
                                Property property5 = View.ALPHA;
                                float[] fArr5 = new float[i14];
                                fArr5[0] = bo5Var.getAlpha();
                                fArr5[1] = 1.0f;
                                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(bo5Var, (Property<bo5, Float>) property5, fArr5);
                                Property property6 = View.TRANSLATION_Y;
                                float[] fArr6 = new float[i14];
                                fArr6[0] = bo5Var.getTranslationY();
                                fArr6[1] = -hl.L(24.0f);
                                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(bo5Var, (Property<bo5, Float>) property6, fArr6);
                                Property property7 = View.SCALE_X;
                                float[] fArr7 = new float[i11];
                                fArr7[0] = bo5Var.getScaleX();
                                fArr7[1] = 0.9f;
                                fArr7[i14] = 1.0f;
                                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(bo5Var, (Property<bo5, Float>) property7, fArr7);
                                Property property8 = View.SCALE_Y;
                                float[] fArr8 = new float[i11];
                                fArr8[0] = bo5Var.getScaleY();
                                fArr8[1] = 0.9f;
                                fArr8[i14] = 1.0f;
                                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(bo5Var, (Property<bo5, Float>) property8, fArr8);
                                Animator[] animatorArr3 = new Animator[4];
                                animatorArr3[0] = ofFloat9;
                                animatorArr3[1] = ofFloat10;
                                animatorArr3[i14] = ofFloat11;
                                animatorArr3[i11] = ofFloat12;
                                animatorSet5.playTogether(animatorArr3);
                                bo5Var.c.setInterpolator(k43Var3);
                                bo5Var.c.setDuration(300L);
                                bo5Var.c.setStartDelay(250L);
                                bo5Var.c.start();
                                u(true);
                                this.n.setVisibility(4);
                                this.a0.setAlpha(0.0f);
                                this.a0.setVisibility(8);
                                this.Z.setAlpha(0.0f);
                                this.Z.setVisibility(8);
                                gkc gkcVar = this.o0;
                                if (gkcVar != null) {
                                    gkcVar.a(false, false);
                                }
                                this.M0.animate().alpha(0.0f).setDuration(250L).start();
                                break;
                            }
                            break;
                        case 12:
                            if (this.q0 != 12) {
                                this.G.b(ob6.M0(2131743061, null), true, z12);
                            }
                            user = user2;
                            break;
                        case 13:
                            this.G.b(ob6.M0(2131742870, null), true, z12);
                            user = user2;
                            break;
                        case 14:
                            this.G.b(ob6.M0(2131742898, null), true, z12);
                            user = user2;
                            break;
                        case 15:
                            this.f0.setRetryMod(false);
                            if (sharedState != null) {
                                if (sharedState.isConference()) {
                                    this.G.b(ob6.M0(2131742950, null), false, z12);
                                    this.f0.setTranslationY(0.0f);
                                } else if (sharedState.isCallingVideo()) {
                                    this.G.b(ob6.M0(2131742949, null), false, z12);
                                    this.f0.setTranslationY(-hl.L(60.0f));
                                }
                                z = false;
                                user = user2;
                                break;
                            }
                            this.G.b(ob6.M0(2131742952, null), false, z12);
                            this.f0.setTranslationY(0.0f);
                            z = false;
                            user = user2;
                        case 16:
                            if (this.q0 != 16) {
                                this.G.b(ob6.M0(2131742897, null), true, z12);
                            }
                            user = user2;
                            break;
                        case 17:
                            this.G.b(ob6.M0(2131743144, null), false, z12);
                            this.f0.setRetryMod(true);
                            this.n0 = false;
                            this.m0 = false;
                            z = false;
                            user = user2;
                            break;
                        default:
                            user = user2;
                            break;
                    }
                    if (this.o0 == null) {
                        return;
                    }
                    boolean z14 = this.m0 || this.n0;
                    if (sharedInstance != null) {
                        this.m0 = sharedInstance.getRemoteVideoState() == 2;
                        if (sharedInstance.getVideoState(false) != 2) {
                            z9 = true;
                            if (sharedInstance.getVideoState(false) != 1) {
                                z10 = false;
                                this.n0 = z10;
                                if (z10 && !this.U0) {
                                    this.U0 = z9;
                                }
                            }
                        } else {
                            z9 = true;
                        }
                        z10 = z9;
                        this.n0 = z10;
                        if (z10) {
                            this.U0 = z9;
                        }
                    }
                    if (z12) {
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
                        hmc hmcVar2 = this.d0;
                        if (z12) {
                            hmcVar2.animate().alpha(f4).setDuration(250L).start();
                        } else {
                            hmcVar2.animate().cancel();
                            this.d0.setAlpha(f4);
                        }
                        if (!this.d0.d.c.P && !this.I0) {
                            i = 0;
                            this.m0 = false;
                            if (!this.n0 || this.m0) {
                                this.w.setVisibility(4);
                            } else {
                                this.w.setVisibility(i);
                                hmc hmcVar3 = this.d0;
                                if (z12) {
                                    hmcVar3.animate().alpha(0.0f).setDuration(250L).start();
                                } else {
                                    hmcVar3.animate().cancel();
                                    this.d0.setAlpha(0.0f);
                                }
                            }
                            z2 = this.n0;
                            if (z2 || !this.m0) {
                                this.H0 = false;
                            }
                            z3 = (z2 || !this.H0 || hl.F1(this.b)) ? false : true;
                            o(z12, z14);
                            L = this.E.getTag() != null ? 0 : hl.L(135.0f) + hl.L(12.0f);
                            if (z12) {
                                this.f0.setVisibility(z11 ? 0 : 8);
                                i2 = 8;
                            } else {
                                if (z11 && this.f0.getTag() == null) {
                                    this.f0.animate().setListener(null).cancel();
                                    i2 = 8;
                                    if (this.f0.getVisibility() == 8) {
                                        this.f0.setVisibility(0);
                                        this.f0.setAlpha(0.0f);
                                    }
                                    this.f0.animate().alpha(1.0f);
                                } else {
                                    i2 = 8;
                                }
                                if (!z11 && this.f0.getTag() != null) {
                                    this.f0.animate().setListener(null).cancel();
                                    this.f0.animate().setListener(new ckc(this, (byte) 9)).alpha(0.0f);
                                }
                            }
                            this.f0.setEnabled(z11);
                            this.f0.setTag(!z11 ? 1 : null);
                            this.u0.setLockOnScreen(this.J0);
                            z4 = this.p0 != 3 && (this.n0 || this.m0);
                            this.z0 = z4;
                            if (!z4 && !this.x0) {
                                r(true);
                            }
                            if (this.x0 && this.z0 && !this.R0 && sharedInstance != null) {
                                hl.d3(this.S0, 3000L);
                                this.R0 = true;
                            }
                            int i15 = this.p0;
                            boolean z15 = i15 == 11 && this.x0;
                            boolean z16 = (!z11 || i15 == 16 || i15 == 11 || i15 == 12 || i15 == 14 || i15 == 6 || !this.x0 || sharedInstance == null || (phoneCall2 = sharedInstance.privateCall) == null || !phoneCall2.conference_supported) ? false : true;
                            ImageView imageView = this.I;
                            if (z12) {
                                f = 12.0f;
                                imageView.setVisibility(z15 ? 0 : i2);
                                this.I.setAlpha(z15 ? 1.0f : 0.0f);
                                ImageView imageView2 = this.J;
                                if (z16) {
                                    i2 = 0;
                                }
                                imageView2.setVisibility(i2);
                                this.J.setAlpha(z16 ? 1.0f : 0.0f);
                                this.M0.setTranslationY((-hl.L(16.0f)) - (this.x0 ? hl.L(80.0f) : 0));
                            } else {
                                if (z15) {
                                    imageView.animate().alpha(1.0f).start();
                                } else {
                                    if (imageView.getVisibility() != 0) {
                                        this.I.setVisibility(0);
                                        f2 = 0.0f;
                                        this.I.setAlpha(0.0f);
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    this.I.animate().alpha(f2).start();
                                }
                                ImageView imageView3 = this.J;
                                if (z16) {
                                    imageView3.animate().alpha(1.0f).start();
                                } else {
                                    if (imageView3.getVisibility() != 0) {
                                        this.J.setVisibility(0);
                                        f3 = 0.0f;
                                        this.J.setAlpha(0.0f);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    this.J.animate().alpha(f3).start();
                                }
                                this.M0.animate().translationY((-hl.L(16.0f)) - (this.x0 ? hl.L(80.0f) : 0)).setDuration(150L).setInterpolator(k43.f).start();
                                f = 12.0f;
                            }
                            i3 = this.p0;
                            if (i3 != 10 && i3 != 11) {
                                u(z12);
                            }
                            if (b != 0) {
                                this.G.e(z12);
                            }
                            this.G.d(z, z12);
                            if (this.E.getVisibility() == 0 && this.C0) {
                                L += hl.L(24.0f);
                                layout = this.U.getLayout();
                                if (layout != null && (lineCount = layout.getLineCount()) > 2) {
                                    L = bp1.h(lineCount, 2, hl.L(20.0f), L);
                                }
                            }
                            if (this.p0 == 11 && !this.n0 && !this.m0) {
                                L -= hl.L(24.0f);
                            }
                            if (!this.n0 || this.m0) {
                                L -= hl.L(60.0f);
                            }
                            if (z12) {
                                this.Y.setTranslationY(L);
                            } else {
                                if (this.C0 && (this.n0 || this.m0)) {
                                    ViewPropertyAnimator duration2 = this.Y.animate().setStartDelay(0L).alpha(0.0f).setDuration(150L);
                                    k43 k43Var4 = k43.f;
                                    duration2.setInterpolator(k43Var4).start();
                                    k43Var = k43Var4;
                                    j = 250;
                                } else {
                                    j = 250;
                                    ViewPropertyAnimator duration3 = this.Y.animate().setStartDelay(250L).alpha(1.0f).setDuration(150L);
                                    k43Var = k43.f;
                                    duration3.setInterpolator(k43Var).start();
                                }
                                if (L != this.v0) {
                                    this.Y.animate().setStartDelay(this.p0 == 11 ? j : 0L).translationY(L).setDuration(200L).setInterpolator(k43Var).start();
                                }
                            }
                            this.v0 = L;
                            boolean z17 = sharedInstance == null && sharedInstance.isScreencast();
                            int i16 = this.p0;
                            this.D0 = i16 == 11 && i16 != 17 && ((this.n0 && !z17) || this.m0);
                            if (sharedInstance == null) {
                                if (this.n0) {
                                    voIPService = sharedInstance;
                                    voIPService.sharedUIParams.tapToVideoTooltipWasShowed = true;
                                } else {
                                    voIPService = sharedInstance;
                                }
                                this.e0.setIsScreencast(voIPService.isScreencast());
                                this.e0.d.setMirror(voIPService.isFrontFaceCamera());
                                gmc gmcVar = (!this.n0 || voIPService.isScreencast()) ? null : this.e0.d;
                                if (!this.l1 || (hmcVar = this.k1) == null) {
                                    if (z3) {
                                        videoSink = this.c0;
                                        voIPService.setSinks(gmcVar, videoSink);
                                        if (z12) {
                                            zkc zkcVar = this.M0;
                                            zkcVar.f = false;
                                            if (!zkcVar.e && zkcVar.getParent() != null) {
                                                TransitionManager.beginDelayedTransition(zkcVar, zkcVar.d);
                                            }
                                        }
                                        isMicMute = voIPService.isMicMute();
                                        zkc zkcVar2 = this.M0;
                                        if (isMicMute) {
                                            zkcVar2.c("self-muted");
                                        } else {
                                            zkcVar2.a(R.drawable.calls_mute_mini, ob6.M0(2131742938, null), "self-muted");
                                        }
                                        if ((!this.n0 || this.m0) && (((i4 = this.p0) == 3 || i4 == 5) && voIPService.getCallDuration() > 500)) {
                                            remoteAudioState = voIPService.getRemoteAudioState();
                                            zkc zkcVar3 = this.M0;
                                            if (remoteAudioState != 0) {
                                                i5 = 1;
                                                zkcVar3.a(R.drawable.calls_mute_mini, ob6.a0("VoipUserMicrophoneIsOff", null, 2131742879, zkcVar3.b(lbc.k(user, true))), "muted");
                                            } else {
                                                i5 = 1;
                                                zkcVar3.c("muted");
                                            }
                                            remoteVideoState = voIPService.getRemoteVideoState();
                                            zkc zkcVar4 = this.M0;
                                            if (remoteVideoState != 0) {
                                                Object[] objArr = new Object[i5];
                                                objArr[0] = zkcVar4.b(lbc.k(user, i5));
                                                zkcVar4.a(R.drawable.calls_camera_mini, ob6.a0("VoipUserCameraIsOff", null, 2131742880, objArr), MediaStreamTrack.VIDEO_TRACK_KIND);
                                            } else {
                                                zkcVar4.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                            }
                                        } else {
                                            int remoteAudioState2 = voIPService.getRemoteAudioState();
                                            zkc zkcVar5 = this.M0;
                                            if (remoteAudioState2 == 0) {
                                                zkcVar5.a(R.drawable.calls_mute_mini, ob6.a0("VoipUserMicrophoneIsOff", null, 2131742879, zkcVar5.b(lbc.k(user, true))), "muted");
                                            } else {
                                                zkcVar5.c("muted");
                                            }
                                            this.M0.c(MediaStreamTrack.VIDEO_TRACK_KIND);
                                        }
                                        if (this.M0.getChildCount() == 0 && this.m0 && (phoneCall = voIPService.privateCall) != null && !phoneCall.video) {
                                            sharedUIParams = voIPService.sharedUIParams;
                                            if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                                sharedUIParams.tapToVideoTooltipWasShowed = true;
                                                this.N0.setTranslationY(-((this.s.getMeasuredHeight() - this.j0.getY()) + hl.L(6.0f)));
                                                this.N0.o(0.0f, this.f.getX() + this.j0.getX() + hl.L(14.0f));
                                                this.N0.v();
                                                z8 = true;
                                                if (z12) {
                                                    zkc zkcVar6 = this.M0;
                                                    if (zkcVar6.f) {
                                                        zkcVar6.e = z8;
                                                        hl.d3(new azb(zkcVar6, (byte) 27), 700L);
                                                    }
                                                    zkcVar6.f = false;
                                                }
                                            }
                                        }
                                        if (this.M0.getChildCount() != 0) {
                                            z8 = true;
                                            this.N0.f(true);
                                            if (z12) {
                                            }
                                        }
                                        z8 = true;
                                        if (z12) {
                                        }
                                    } else {
                                        hmcVar = this.d0;
                                    }
                                }
                                videoSink = hmcVar.d;
                                voIPService.setSinks(gmcVar, videoSink);
                                if (z12) {
                                }
                                isMicMute = voIPService.isMicMute();
                                zkc zkcVar22 = this.M0;
                                if (isMicMute) {
                                }
                                if (this.n0) {
                                }
                                remoteAudioState = voIPService.getRemoteAudioState();
                                zkc zkcVar32 = this.M0;
                                if (remoteAudioState != 0) {
                                }
                                remoteVideoState = voIPService.getRemoteVideoState();
                                zkc zkcVar42 = this.M0;
                                if (remoteVideoState != 0) {
                                }
                                if (this.M0.getChildCount() == 0) {
                                    sharedUIParams = voIPService.sharedUIParams;
                                    if (!sharedUIParams.tapToVideoTooltipWasShowed) {
                                    }
                                }
                                if (this.M0.getChildCount() != 0) {
                                }
                                z8 = true;
                                if (z12) {
                                }
                            } else {
                                voIPService = sharedInstance;
                            }
                            childsHight = this.M0.getChildsHight();
                            ujcVar = this.a0;
                            if (ujcVar.getParent() == null && z12) {
                                ujcVar.U = childsHight;
                            } else {
                                ujcVar.U = childsHight;
                            }
                            ujcVar2 = this.Z;
                            if (ujcVar2.getParent() == null && z12) {
                                ujcVar2.U = childsHight;
                            } else {
                                ujcVar2.U = childsHight;
                            }
                            this.Z.setUiVisible(this.x0);
                            this.a0.setUiVisible(this.x0);
                            if (this.n0) {
                                z5 = true;
                                q(0, z12);
                            } else if (!this.m0 || this.H0) {
                                z5 = true;
                                q(1, z12);
                            } else {
                                q(2, z12);
                                z5 = true;
                            }
                            ujc ujcVar3 = this.a0;
                            if (z3) {
                                if (ujcVar3.getTag() != null) {
                                    this.a0.setIsActive(false);
                                    this.a0.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setListener(new ckc(this, (byte) 6)).setDuration(150L).setInterpolator(k43.f).start();
                                    this.a0.setTag(null);
                                }
                            } else if (ujcVar3.getTag() == null) {
                                this.a0.setIsActive(z5);
                                if (this.a0.getVisibility() != 0) {
                                    this.a0.setVisibility(0);
                                    this.a0.setAlpha(0.0f);
                                    this.a0.setScaleX(0.5f);
                                    this.a0.setScaleY(0.5f);
                                }
                                this.a0.animate().setListener(null).cancel();
                                ujc ujcVar4 = this.a0;
                                ujcVar4.d0 = true;
                                ujcVar4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).setStartDelay(150L).withEndAction(new xjc(this, (byte) 3)).start();
                                this.a0.setTag(1);
                            }
                            this.Z.a();
                            this.a0.a();
                            w();
                            if (this.p0 == 3) {
                                tmc tmcVar = this.x;
                                if (tmcVar.L && !tmcVar.E) {
                                    tmcVar.E = true;
                                    int L3 = hl.L(f);
                                    tmcVar.G = L3;
                                    ValueAnimator ofInt = ValueAnimator.ofInt(0, L3);
                                    tmcVar.c = ofInt;
                                    ofInt.addUpdateListener(new smc(tmcVar, (byte) 0));
                                    tmcVar.c.setInterpolator(k43.g);
                                    tmcVar.c.setDuration(200L);
                                    tmcVar.c.start();
                                }
                                this.E.a();
                                int i17 = this.w.W;
                                if (i17 != 2 && i17 != 3) {
                                    int[] iArr2 = new int[2];
                                    this.E.getLocationOnScreen(iArr2);
                                    z6 = true;
                                    this.w.b(hl.L(106.0f) + iArr2[0], hl.L(106.0f) + iArr2[1], this.q0 != -1);
                                    z7 = (!this.n0 || this.m0) ? z6 : false;
                                    this.y.setState(z7);
                                    this.x.setState(z7);
                                    this.r.e(z7);
                                    if (this.m0 && !z14 && this.g0) {
                                        this.g0 = false;
                                        if (voIPService != null) {
                                            voIPService.playStartRecordSound();
                                        }
                                    }
                                    View view = this.i0;
                                    if (z7) {
                                        if (view.getVisibility() != 0) {
                                            this.i0.setVisibility(0);
                                            this.h0.setVisibility(0);
                                        }
                                    } else if (view.getVisibility() != 4) {
                                        this.i0.setVisibility(4);
                                        this.h0.setVisibility(4);
                                    }
                                    xjc xjcVar = this.T0;
                                    hl.r(xjcVar);
                                    if (this.p0 == 3) {
                                        hl.d3(xjcVar, 10000L);
                                        return;
                                    }
                                    return;
                                }
                            }
                            z6 = true;
                            if (this.n0) {
                            }
                            this.y.setState(z7);
                            this.x.setState(z7);
                            this.r.e(z7);
                            if (this.m0) {
                                this.g0 = false;
                                if (voIPService != null) {
                                }
                            }
                            View view2 = this.i0;
                            if (z7) {
                            }
                            xjc xjcVar2 = this.T0;
                            hl.r(xjcVar2);
                            if (this.p0 == 3) {
                            }
                        }
                    }
                    i = 0;
                    if (this.n0) {
                    }
                    this.w.setVisibility(4);
                    z2 = this.n0;
                    if (z2) {
                    }
                    this.H0 = false;
                    if (z2) {
                    }
                    o(z12, z14);
                    if (this.E.getTag() != null) {
                    }
                    if (z12) {
                    }
                    this.f0.setEnabled(z11);
                    this.f0.setTag(!z11 ? 1 : null);
                    this.u0.setLockOnScreen(this.J0);
                    if (this.p0 != 3) {
                    }
                    this.z0 = z4;
                    if (!z4) {
                        r(true);
                    }
                    if (this.x0) {
                        hl.d3(this.S0, 3000L);
                        this.R0 = true;
                    }
                    int i152 = this.p0;
                    if (i152 == 11) {
                    }
                    if (!z11) {
                    }
                    ImageView imageView4 = this.I;
                    if (z12) {
                    }
                    i3 = this.p0;
                    if (i3 != 10) {
                        u(z12);
                    }
                    if (b != 0) {
                    }
                    this.G.d(z, z12);
                    if (this.E.getVisibility() == 0) {
                        L += hl.L(24.0f);
                        layout = this.U.getLayout();
                        if (layout != null) {
                            L = bp1.h(lineCount, 2, hl.L(20.0f), L);
                        }
                    }
                    if (this.p0 == 11) {
                        L -= hl.L(24.0f);
                    }
                    if (!this.n0) {
                    }
                    L -= hl.L(60.0f);
                    if (z12) {
                    }
                    this.v0 = L;
                    if (sharedInstance == null) {
                    }
                    int i162 = this.p0;
                    this.D0 = i162 == 11 && i162 != 17 && ((this.n0 && !z17) || this.m0);
                    if (sharedInstance == null) {
                    }
                    childsHight = this.M0.getChildsHight();
                    ujcVar = this.a0;
                    if (ujcVar.getParent() == null) {
                    }
                    ujcVar.U = childsHight;
                    ujcVar2 = this.Z;
                    if (ujcVar2.getParent() == null) {
                    }
                    ujcVar2.U = childsHight;
                    this.Z.setUiVisible(this.x0);
                    this.a0.setUiVisible(this.x0);
                    if (this.n0) {
                    }
                    ujc ujcVar32 = this.a0;
                    if (z3) {
                    }
                    this.Z.a();
                    this.a0.a();
                    w();
                    if (this.p0 == 3) {
                    }
                    z6 = true;
                    if (this.n0) {
                    }
                    this.y.setState(z7);
                    this.x.setState(z7);
                    this.r.e(z7);
                    if (this.m0) {
                    }
                    View view22 = this.i0;
                    if (z7) {
                    }
                    xjc xjcVar22 = this.T0;
                    hl.r(xjcVar22);
                    if (this.p0 == 3) {
                    }
                }
            }
            user = user2;
            v(z12);
            if (this.p0 == 5) {
                z = this.s0;
                if (!z && this.q0 != 5) {
                    this.G.b(ob6.M0(2131743071, null), true, z12);
                }
                z11 = false;
                b = 0;
                if (this.o0 == null) {
                }
            } else {
                this.s0 = true;
                b = 1;
                z = false;
                z11 = false;
                if (this.o0 == null) {
                }
            }
        }
        z = false;
        z11 = false;
        b = 0;
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
