package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class FragmentContextView extends FrameLayout implements jm7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, vlb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public hg5 B0;
    public ViewGroup C0;
    public long D0;
    public p09 E;
    public fg0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public r7 G;
    public PorterDuffColorFilter G0;
    public dna H;
    public int H0;
    public v7 I;
    public int I0;
    public final p7[] J;
    public int J0;
    public FrameLayout K;
    public final km7[] K0;
    public ImageView L;
    public e7a L0;
    public ey0 M;
    public float M0;
    public int N;
    public float N0;
    public ef1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public k47 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final m99 U0;
    public String V;
    public int V0;
    public boolean W;
    public final cc1 a;
    public boolean a0;
    public ImageView b;
    public hd0 b0;
    public ae8 c;
    public Paint c0;
    public pp4 d;
    public LinearGradient d0;
    public pp4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.d h;
    public boolean h0;
    public boolean i0;
    public final ho j0;
    public u51 k0;
    public boolean l0;
    public final np4 m0;
    public final f02 n;
    public final int n0;
    public final boolean o0;
    public tp4 p0;
    public final ylb q0;
    public op4 r;
    public boolean r0;
    public a6 s;
    public int s0;
    public final o04 t0;
    public final po u0;
    public final po v0;
    public View w;
    public boolean w0;
    public s09 x;
    public boolean x0;
    public rp4 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d dVar, FrameLayout frameLayout, boolean z, ylb ylbVar) {
        super(context);
        this.a = new cc1();
        this.J = new p7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new ho(false, true, true);
        this.m0 = new np4(this);
        this.n0 = z8c.t0;
        this.s0 = -1;
        this.t0 = new o04(this, (byte) 7);
        this.u0 = new po(null);
        this.v0 = new po(new int[]{nm7.C});
        this.K0 = new km7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new m99(new ip4(this), d53.h, 450L);
        this.V0 = 0;
        this.q0 = ylbVar;
        this.h = dVar;
        if (dVar instanceof f02) {
            this.n = (f02) dVar;
        }
        this.T = true;
        this.o0 = z;
        if (frameLayout == null) {
            ((ViewGroup) dVar.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    private int getTitleTextColor() {
        int i = this.U;
        ylb ylbVar = this.q0;
        return i == 4 ? cmb.v0(cmb.s7, ylbVar) : (i == 1 || i == 3) ? cmb.v0(cmb.z7, ylbVar) : cmb.v0(cmb.t7, ylbVar);
    }

    public static boolean i(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public static boolean j() {
        k47 k47Var = MediaController.w().v0;
        return k47Var != null && k47.Q4(k47Var.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        qd2 groupCall;
        qd2 qd2Var;
        int i;
        int i2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.d dVar = this.h;
        View fragmentView = dVar.getFragmentView();
        boolean z4 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean d = oa5.d();
        f02 f02Var = this.n;
        if (d) {
            z2 = false;
        } else {
            z2 = (g95.t5 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (qd2Var = sharedInstance.groupCall) != null && (qd2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z2 = false;
            }
            if (j() || g95.t5 || !this.a0 || z2 || f02Var == null || (groupCall = f02Var.getGroupCall()) == null || !groupCall.A()) {
                z3 = false;
                po poVar = this.u0;
                byte b = 8;
                if (z2) {
                    boolean z5 = this.T;
                    if (z5 && ((z4 && this.U == -1) || (i2 = this.U) == 4 || i2 == 3 || i2 == 1)) {
                        this.T = false;
                        if (z4) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                        } else {
                            AnimatorSet animatorSet = this.f;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                this.f = null;
                            }
                            poVar.d();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(d53.f);
                            this.f.addListener(new mp4(this, b));
                            this.f.start();
                        }
                    } else if (z5 && ((i = this.U) == -1 || i == 4 || i == 3 || i == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z4 || f02Var == null || !f02Var.K() || oa5.d()) {
                        return;
                    }
                    ts2.u(null, 2131748909, c41.b0(dVar), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i3 = z3 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i4 = this.U;
                if (i3 != i4 && this.f != null && !z4) {
                    this.w0 = true;
                    return;
                }
                if (i3 != i4 && this.T && !z4) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    poVar.d();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(d53.f);
                    this.f.addListener(new mp4(this, (byte) 9));
                    this.f.start();
                    return;
                }
                if (z3) {
                    boolean z6 = i4 == 4 && this.T;
                    r(4);
                    qd2 groupCall2 = f02Var.getGroupCall();
                    TLRPC.Chat f = f02Var.f();
                    if (groupCall2.k()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(gm.L(14.0f));
                            this.g0.setTypeface(gm.o());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        jb6.M0(2131743124, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (TextUtils.isEmpty(groupCall2.b.title)) {
                            boolean W = sd2.W(f);
                            pp4 pp4Var = this.d;
                            if (W) {
                                pp4Var.b(jb6.M0(2131743145, null), false);
                            } else {
                                pp4Var.b(jb6.M0(2131743024, null), false);
                            }
                        } else {
                            this.d.b(groupCall2.b.title, false);
                        }
                        this.e.b(jb6.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(jb6.M0(2131743126, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(jb6.M0(2131743131, null), false);
                        } else {
                            boolean W2 = sd2.W(f);
                            pp4 pp4Var2 = this.d;
                            if (W2) {
                                pp4Var2.b(jb6.M0(2131743131, null), false);
                            } else {
                                pp4Var2.b(jb6.M0(2131742990, null), false);
                            }
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i5 = groupCall4.participants_count;
                        pp4 pp4Var3 = this.e;
                        boolean z7 = groupCall4.rtmp_stream;
                        if (i5 == 0) {
                            pp4Var3.b(jb6.M0(z7 ? 2131743219 : 2131748371, null), false);
                        } else {
                            pp4Var3.b(jb6.G(i5, z7 ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                        this.r.invalidate();
                    }
                    o(this.b0.a.d && z6);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    o(i4 == 1);
                    r(1);
                } else {
                    o(i4 == 3);
                    r(3);
                }
                if (this.T) {
                    return;
                }
                if (z4) {
                    setTopPadding(gm.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(d53.f);
                    this.f.addListener(new mp4(this, (byte) 10));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z2 = true;
        }
        z3 = z2;
        po poVar2 = this.u0;
        byte b2 = 8;
        if (z2) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        op4 op4Var = new op4(this, context);
        this.r = op4Var;
        this.k0 = new u51(op4Var);
        int i = gm.q.x;
        ho hoVar = this.j0;
        hoVar.N = i;
        hoVar.B = 0.4f;
        hoVar.setCallback(op4Var);
        hoVar.u(-1);
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.o());
        addView(this.r, qoe.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, qoe.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = cmb.v7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ylb ylbVar = this.q0;
        anb.s(imageView2, i2, ylbVar, mode);
        ImageView imageView3 = this.b;
        ae8 ae8Var = new ae8(16);
        this.c = ae8Var;
        imageView3.setImageDrawable(ae8Var);
        final byte b = 1;
        this.b.setBackground(cmb.f0(cmb.v0(i2, ylbVar) & 436207615, 1, gm.L(14.0f)));
        addView(this.b, qoe.e(36, 36, 51));
        final byte b2 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: jp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qd2 groupCall;
                int i3;
                long j;
                TL_stories.StoryItem t;
                byte b3 = b2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b3) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i4 = fragmentContextView.U;
                        if (i4 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i5 = s96Var.e;
                                if (i5 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i5).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i4 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        break;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        break;
                                    }
                                } else if (k47.B0(k47Var.k) == (f02Var2 != null ? f02Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k47.B0(k47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (pg3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (pg3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k47Var.e1());
                                    dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                    break;
                                }
                            }
                        } else if (i4 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i4 == 2) {
                            int i6 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i3 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!dd6.f(i7).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i7).J.get(0);
                                            j = cd6Var.a;
                                            i3 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i3).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                break;
                            }
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    yv1 yv1Var = (yv1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                        bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                        bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bp5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                break;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var = fragmentContextView.E;
                                if (z3) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        s09 s09Var = new s09(context);
        this.x = s09Var;
        s09Var.setScaleType(scaleType);
        this.x.setAutoRepeat(true);
        this.x.f(R.raw.import_progress, 30, 30, null);
        anb.B(this.x, cmb.K(gm.L(22.0f), cmb.v0(i2, ylbVar)), anb.M(i2), ylbVar);
        addView(this.x, qoe.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final byte b3 = 0;
        pp4 pp4Var = new pp4(this, context, context, b3);
        this.d = pp4Var;
        addView(pp4Var, qoe.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        pp4 pp4Var2 = new pp4(this, context, context, b);
        this.e = pp4Var2;
        addView(pp4Var2, qoe.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        ef1 ef1Var = new ef1();
        this.O = ef1Var;
        ef1Var.g = 1.0f;
        ef1Var.j = false;
        ey0 ey0Var = new ey0((byte) 2, context, this);
        this.M = ey0Var;
        ey0Var.setText(jb6.M0(2131743126, null));
        anb.X(this.M, cmb.Ii, ylbVar);
        ey0 ey0Var2 = this.M;
        int L = gm.L(16.0f);
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, ylbVar);
        int i4 = cmb.Gi;
        int v02 = cmb.v0(i4, ylbVar);
        anb.R(ey0Var2, cmb.i0(L, L, L, L, v0, v02, v02), anb.M(i3), anb.M(i4), ylbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(gm.o());
        this.M.setGravity(17);
        this.M.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        addView(this.M, qoe.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final byte b4 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: jp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b4;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i5 = s96Var.e;
                                if (i5 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i5).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        break;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        break;
                                    }
                                } else if (k47.B0(k47Var.k) == (f02Var2 != null ? f02Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k47.B0(k47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (pg3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (pg3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k47Var.e1());
                                    dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!dd6.f(i7).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i7).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    yv1 yv1Var = (yv1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                        bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                        bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bp5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                break;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var = fragmentContextView.E;
                                if (z3) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        if (this.O0) {
            n();
        }
        this.K = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.L = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.L;
        int i5 = cmb.w7;
        anb.s(imageView5, i5, ylbVar, mode);
        this.K.addView(this.L, qoe.e(20, 20, 17));
        this.K.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.K.setContentDescription(jb6.M0(2131743536, null));
        this.K.setOnClickListener(new x10((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        hd0 hd0Var = new hd0(context, false);
        this.b0 = hd0Var;
        hd0Var.setAvatarsTextSize(gm.L(21.0f));
        this.b0.setDelegate(new lp4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, qoe.e(nm7.s1, 36, 51));
        this.E = new p09(R.raw.voice_muted, gm.L(16.0f), gm.L(20.0f), true, null);
        rp4 rp4Var = new rp4(this, context);
        this.y = rp4Var;
        anb.s(rp4Var, cmb.z7, ylbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final byte b5 = 4;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: jp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b5;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i52 = s96Var.e;
                                if (i52 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i52).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        break;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        break;
                                    }
                                } else if (k47.B0(k47Var.k) == (f02Var2 != null ? f02Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k47.B0(k47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (pg3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (pg3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k47Var.e1());
                                    dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!dd6.f(i7).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i7).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    yv1 yv1Var = (yv1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                        bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                        bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bp5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                break;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var = fragmentContextView.E;
                                if (z3) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.F = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        anb.s(this.F, i5, ylbVar, mode);
        this.F.setBackground(cmb.f0(cmb.v0(i5, ylbVar) & 436207615, 1, gm.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: jp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b3;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i52 = s96Var.e;
                                if (i52 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i52).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        break;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        break;
                                    }
                                } else if (k47.B0(k47Var.k) == (f02Var2 != null ? f02Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k47.B0(k47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (pg3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (pg3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k47Var.e1());
                                    dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!dd6.f(i7).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i7).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    yv1 yv1Var = (yv1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                        bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                        bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bp5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                break;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var = fragmentContextView.E;
                                if (z3) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        a6 a6Var = new a6(getContext(), (byte) 13);
        this.s = a6Var;
        addView(a6Var, qoe.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: jp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qd2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        f02 f02Var = fragmentContextView.n;
                        ylb ylbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, dVar.getParentActivity());
                            String M0 = jb6.M0(2131744524, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (dVar instanceof nk3) {
                                heVar.U = jb6.M0(2131744526, null);
                            } else {
                                TLRPC.Chat f = f02Var.f();
                                TLRPC.User h = f02Var.h();
                                if (f != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToGroupText", null, 2131744525, f.title));
                                } else if (h != null) {
                                    heVar.U = gm.S2(jb6.a0("StopLiveLocationAlertToUserText", null, 2131744523, m9c.k(h, true)));
                                } else {
                                    heVar.U = jb6.M0(2131754085, null);
                                }
                            }
                            alertDialog$Builder.j(jb6.M0(2131744530, null), new ip4(fragmentContextView));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, ylbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        f02 f02Var2 = fragmentContextView.n;
                        ylb ylbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            s96 s96Var = s96.N;
                            if (s96Var != null) {
                                long j2 = s96Var.b;
                                int i52 = s96Var.e;
                                if (i52 != z8c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = oc7.r1(i52).N1().t(s96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k47 k47Var = MediaController.w().v0;
                            if (dVar2 != null && k47Var != null) {
                                if (k47Var.I3()) {
                                    Activity W = gm.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i30(W, ylbVar3).show();
                                        break;
                                    } else if (gm.C1(LaunchActivity.H1)) {
                                        new i30(LaunchActivity.H1, ylbVar3).show();
                                        break;
                                    }
                                } else if (k47.B0(k47Var.k) == (f02Var2 != null ? f02Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k47.B0(k47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (pg3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (pg3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k47Var.e1());
                                    dVar2.presentFragment(new yv1(bundle), dVar2 instanceof yv1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = z8c.t0;
                            if (f02Var2 != null) {
                                j = f02Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (dd6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!dd6.f(i7).J.isEmpty()) {
                                            cd6 cd6Var = (cd6) dd6.f(i7).J.get(0);
                                            j = cd6Var.a;
                                            i32 = cd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(dd6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new mia(fragmentContextView.getContext(), new ip4(fragmentContextView), ylbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    yv1 yv1Var = (yv1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(yv1Var.a()) != null) {
                                        bp5 bp5Var = new bp5(fragmentContextView.getContext(), null, yv1Var, ylbVar3);
                                        bp5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bp5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = f02Var2.getGroupCall()) != null) {
                                TLRPC.Chat L0 = dVar2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                sic.l(L0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            g95.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.w().C()) {
                                MediaController.w().R(MediaController.w().v0);
                                break;
                            } else {
                                MediaController.w().Q(MediaController.w().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr4 = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr5 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                j5.a(sharedInstance.getAccount());
                                qd2 qd2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !sd2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                p09 p09Var = fragmentContextView.E;
                                if (z3) {
                                    p09Var.H(0);
                                } else {
                                    p09Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            cmb.E0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.y.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.T0);
    }

    public final void c(boolean z) {
        int i;
        f02 f02Var = this.n;
        if (f02Var != null) {
            byte b = 3;
            if (this.T && ((i = this.U) == 1 || i == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.d dVar = this.h;
            r5a A = dVar.getSendMessagesHelper().A(f02Var.a());
            View fragmentView = dVar.getFragmentView();
            if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z = true;
            }
            Dialog visibleDialog = dVar.getVisibleDialog();
            if ((j() || f02Var.n() || ((visibleDialog instanceof bp5) && !((bp5) visibleDialog).J)) && A != null) {
                A = null;
            }
            po poVar = this.u0;
            if (A == null) {
                if (!this.T || ((!z || this.U != -1) && this.U != 5)) {
                    int i2 = this.U;
                    if (i2 == -1 || i2 == 5) {
                        this.T = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.T = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                poVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(d53.f);
                this.f.addListener(new mp4(this, b));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z && this.S == 0.0f) {
                setTopPadding(gm.M(getStyleHeight()));
                tp4 tp4Var = this.p0;
                if (tp4Var != null) {
                    ((qda) tp4Var).b(true);
                    ((qda) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    poVar.d();
                    this.f = new AnimatorSet();
                    tp4 tp4Var2 = this.p0;
                    if (tp4Var2 != null) {
                        ((qda) tp4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new mp4(this, (byte) 4));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i3 = this.Q;
            int i4 = A.l;
            if (i3 != i4) {
                this.Q = i4;
                this.d.b(gm.S2(jb6.a0("ImportUploading", null, 2131748979, Integer.valueOf(i4))), false);
            }
        }
    }

    public final void d(boolean z) {
        String G;
        String M0;
        org.telegram.ui.ActionBar.d dVar = this.h;
        View fragmentView = dVar.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z2 = dVar instanceof nk3;
        byte b = 0;
        boolean i = z2 ? dd6.g() != 0 : dd6.f(dVar.getCurrentAccount()).i(this.n.a());
        o04 o04Var = this.t0;
        if (!i) {
            this.s0 = -1;
            gm.r(o04Var);
            if (this.T || z) {
                this.T = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(200L);
                this.f.addListener(new mp4(this, (byte) 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new xca(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(gm.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new mp4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z2) {
            o04Var.run();
            f();
            return;
        }
        String M02 = jb6.M0(2131748597, null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.addAll(dd6.f(i2).J);
        }
        if (arrayList.size() == 1) {
            cd6 cd6Var = (cd6) arrayList.get(0);
            long B0 = k47.B0(cd6Var.h.k);
            boolean D = pg3.D(B0);
            k47 k47Var = cd6Var.h;
            if (D) {
                G = m9c.k(oc7.r1(k47Var.K1).W1(Long.valueOf(B0)), true);
                M0 = jb6.M0(2131753930, null);
            } else {
                TLRPC.Chat L0 = oc7.r1(k47Var.K1).L0(Long.valueOf(-B0));
                G = L0 != null ? L0.title : "";
                M0 = jb6.M0(2131753929, null);
            }
        } else {
            G = jb6.G(arrayList.size(), "Chats", new Object[0]);
            M0 = jb6.M0(2131753928, null);
        }
        String format = String.format(M0, M02, G);
        int indexOf = format.indexOf(M02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i3 = 0;
        while (i3 < 2) {
            pp4 pp4Var = this.d;
            TextView textView = i3 == 0 ? pp4Var.getTextView() : pp4Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i3++;
        }
        spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), indexOf, M02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i == nm7.H4) {
            d(false);
            return;
        }
        if (i == nm7.G2) {
            e(false);
            return;
        }
        int i3 = nm7.J4;
        f02 f02Var = this.n;
        if (i == i3) {
            if (f02Var != null) {
                if (f02Var.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.h2 || i == nm7.g2 || i == nm7.f2 || i == nm7.D2) {
            int i4 = this.U;
            if (i4 == 1 || i4 == 3 || i4 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i5 = nm7.v2;
        if (i == i5 || i == nm7.w2 || i == nm7.F2) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i == i5) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.y == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || sd2.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i == nm7.C2) {
            b();
            if (this.T && this.U == 4) {
                qd2 groupCall = f02Var.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.k()) {
                        this.e.b(jb6.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i6 = groupCall2.participants_count;
                        pp4 pp4Var = this.e;
                        boolean z = groupCall2.rtmp_stream;
                        if (i6 == 0) {
                            pp4Var.b(jb6.M0(z ? 2131743219 : 2131748371, null), false);
                        } else {
                            pp4Var.b(jb6.G(i6, z ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i == nm7.v1) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i == nm7.N4) {
            q(true);
            return;
        }
        int i8 = nm7.R4;
        cc1 cc1Var = this.a;
        if (i == i8) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                cmb.E0().a(Math.max(this.M0, this.N0));
                cc1Var.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i != nm7.S4) {
            if (i == nm7.e2 && this.U == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.N0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            cmb.E0().a(Math.max(this.M0, this.N0));
            cc1Var.f(Math.max(this.M0, this.N0));
        }
        this.b0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        long j;
        long j2;
        int i;
        float f4;
        float f5;
        Path path;
        boolean z3;
        float f6;
        float f7;
        float f8;
        long j3;
        float f9;
        float f10;
        Path path2;
        float f11;
        up4 up4Var;
        k47 k47Var;
        if (this.r != null) {
            if (!this.R0 || getVisibility() == 0) {
                int i2 = this.U;
                float f12 = 1.0f;
                if (i2 == 3 || i2 == 1) {
                    cmb.E0().c(this.P0);
                    this.a.h(this.P0);
                    getStyleHeight();
                    Typeface typeface = gm.a;
                    vp4 E0 = cmb.E0();
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    Path path3 = E0.n;
                    Paint paint = E0.m;
                    int i3 = 0;
                    while (true) {
                        up4[] up4VarArr = E0.a;
                        if (i3 >= up4VarArr.length) {
                            break;
                        }
                        up4 up4Var2 = up4VarArr[i3];
                        int i4 = up4Var2.i;
                        if (i4 == 0) {
                            if (up4Var2.j != cmb.w0(null, up4Var2.m, false) || up4Var2.k != cmb.w0(null, up4Var2.n, false)) {
                                up4Var2.a();
                            }
                        } else if (i4 == 1) {
                            if (up4Var2.j != cmb.w0(null, up4Var2.o, false) || up4Var2.k != cmb.w0(null, up4Var2.p, false)) {
                                up4Var2.a();
                            }
                        } else if (i4 == 3 && (up4Var2.j != cmb.w0(null, up4Var2.q, false) || up4Var2.k != cmb.w0(null, up4Var2.r, false))) {
                            up4Var2.a();
                        }
                        i3++;
                    }
                    boolean z4 = E0.l.size() > 0;
                    if (0.0f <= measuredHeight) {
                        up4 up4Var3 = E0.b;
                        if (up4Var3 != null && (up4Var = E0.c) != null) {
                            int i5 = up4Var.i;
                            int i6 = up4Var3.i;
                            if ((i6 == 1 && i5 == 0) || (i5 == 1 && i6 == 0)) {
                                z = true;
                                z2 = z4;
                                if (z4) {
                                    f2 = 0.0f;
                                    f3 = measuredWidth;
                                    j = 0;
                                } else {
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    f2 = 0.0f;
                                    f3 = measuredWidth;
                                    j = elapsedRealtime - E0.j;
                                    E0.j = elapsedRealtime;
                                    if (j > 20) {
                                        j = 17;
                                    }
                                    if (j < 3) {
                                        j2 = j;
                                        z2 = false;
                                        float f13 = 0.0f;
                                        if (z2) {
                                            float f14 = E0.g;
                                            float f15 = E0.e;
                                            if (f14 != f15) {
                                                float f16 = E0.h;
                                                float f17 = (j2 * f16) + f15;
                                                E0.e = f17;
                                                if (f16 > 0.0f) {
                                                    if (f17 > f14) {
                                                        E0.e = f14;
                                                    }
                                                } else if (f17 < f14) {
                                                    E0.e = f14;
                                                }
                                                invalidate();
                                            }
                                            float f18 = E0.g;
                                            float f19 = E0.f;
                                            if (f18 != f19) {
                                                float f20 = E0.i;
                                                float f21 = (j2 * f20) + f19;
                                                E0.f = f21;
                                                if (f20 > 0.0f) {
                                                    if (f21 > f18) {
                                                        E0.f = f18;
                                                    }
                                                } else if (f21 < f18) {
                                                    E0.f = f18;
                                                }
                                                invalidate();
                                            }
                                            if (E0.c != null) {
                                                float f22 = (j2 / 250.0f) + E0.k;
                                                E0.k = f22;
                                                if (f22 > 1.0f) {
                                                    E0.k = 1.0f;
                                                    E0.c = null;
                                                }
                                                invalidate();
                                            }
                                        }
                                        i = 0;
                                        while (i < 2) {
                                            if (i != 0) {
                                                up4 up4Var4 = E0.b;
                                                if (up4Var4 == null) {
                                                    break;
                                                }
                                                f4 = f12;
                                                float f23 = E0.c != null ? E0.k : f4;
                                                if (z2) {
                                                    f6 = 0.0f;
                                                    int i7 = (int) (measuredHeight - f2);
                                                    int i8 = (int) (f3 - 0.0f);
                                                    float f24 = E0.e;
                                                    float f25 = f13;
                                                    Matrix matrix = up4Var4.h;
                                                    int i9 = up4Var4.i;
                                                    if (i9 == 2) {
                                                        f5 = f23;
                                                        path = path3;
                                                        z3 = z;
                                                    } else {
                                                        float f26 = up4Var4.e;
                                                        if (f26 == f25 || up4Var4.f >= f26) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f5 = f23;
                                                            up4Var4.e = secureRandom.nextInt(700) + 500;
                                                            up4Var4.f = f25;
                                                            if (up4Var4.a == -1.0f) {
                                                                z3 = z;
                                                                if (i9 == 3) {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    up4Var4.a = kt6.d(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    up4Var4.b = kt6.d(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    if (i9 == 0) {
                                                                        up4Var4.a = kt6.d(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        up4Var4.b = kt6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        up4Var4.a = b10.A(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        up4Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z3 = z;
                                                                f8 = 100.0f;
                                                            }
                                                            up4Var4.c = up4Var4.a;
                                                            up4Var4.d = up4Var4.b;
                                                            if (i9 == 3) {
                                                                up4Var4.a = kt6.d(secureRandom.nextInt(100), 0.05f, f8, -0.3f);
                                                                up4Var4.b = kt6.d(secureRandom.nextInt(100), 0.05f, f8, 0.7f);
                                                            } else if (i9 == 0) {
                                                                up4Var4.a = kt6.d(secureRandom.nextInt(100), 0.2f, f8, -0.3f);
                                                                up4Var4.b = kt6.d(secureRandom.nextInt(100), 0.3f, f8, 0.7f);
                                                            } else {
                                                                up4Var4.a = b10.A(secureRandom.nextInt(100), f8, 0.2f, 1.1f);
                                                                up4Var4.b = (secureRandom.nextInt(100) * 4.0f) / f8;
                                                            }
                                                        } else {
                                                            f5 = f23;
                                                            path = path3;
                                                            z3 = z;
                                                        }
                                                        float f27 = j2;
                                                        float f28 = (f27 * 0.02f * f24) + (f27 * f4) + up4Var4.f;
                                                        up4Var4.f = f28;
                                                        float f29 = up4Var4.e;
                                                        if (f28 > f29) {
                                                            up4Var4.f = f29;
                                                            f28 = f29;
                                                        }
                                                        float interpolation = d53.g.getInterpolation(f28 / f29);
                                                        float f30 = i8;
                                                        float f31 = up4Var4.c;
                                                        float f32 = ((((up4Var4.a - f31) * interpolation) + f31) * f30) - 200.0f;
                                                        float f33 = up4Var4.d;
                                                        float f34 = ((((up4Var4.b - f33) * interpolation) + f33) * i7) - 200.0f;
                                                        float f35 = (f30 / 400.0f) * ((i9 == 0 || i9 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f32, f34);
                                                        matrix.postScale(f35, f35, f32 + 200.0f, f34 + 200.0f);
                                                        up4Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    f5 = f23;
                                                    path = path3;
                                                    z3 = z;
                                                    f6 = 0.0f;
                                                }
                                                E0.b.b(paint);
                                                f7 = f5;
                                            } else {
                                                up4 up4Var5 = E0.c;
                                                if (up4Var5 == null) {
                                                    f4 = f12;
                                                    j3 = j2;
                                                    f11 = f13;
                                                    z3 = z;
                                                    f9 = f3;
                                                    f10 = f2;
                                                    path2 = path3;
                                                    i++;
                                                    j2 = j3;
                                                    f2 = f10;
                                                    f3 = f9;
                                                    path3 = path2;
                                                    f12 = f4;
                                                    f13 = f11;
                                                    z = z3;
                                                } else {
                                                    f7 = f12 - E0.k;
                                                    up4Var5.b(paint);
                                                    f4 = f12;
                                                    path = path3;
                                                    z3 = z;
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (i != 1) {
                                                paint.setAlpha(nm7.d4);
                                            } else if (z3) {
                                                paint.setAlpha(nm7.d4);
                                            } else {
                                                paint.setAlpha((int) (255.0f * f7));
                                            }
                                            if (i == 1 && z3) {
                                                path.rewind();
                                                f10 = f2;
                                                float f36 = f3;
                                                float f37 = f6;
                                                path2 = path;
                                                path2.addCircle(f3 - gm.L(18.0f), aq1.z(measuredHeight, f10, 2.0f, f10), td4.z(f36, f37, 1.1f, f7), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f9 = f36;
                                                f11 = 0.0f;
                                                j3 = j2;
                                                canvas.drawRoundRect(f37, f10, f9, measuredHeight, gm.L(18.0f), gm.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j3 = j2;
                                                f9 = f3;
                                                f10 = f2;
                                                path2 = path;
                                                f11 = 0.0f;
                                                canvas.drawRoundRect(f6, f10, f9, measuredHeight, gm.L(18.0f), gm.L(18.0f), paint);
                                            }
                                            i++;
                                            j2 = j3;
                                            f2 = f10;
                                            f3 = f9;
                                            path3 = path2;
                                            f12 = f4;
                                            f13 = f11;
                                            z = z3;
                                        }
                                    }
                                }
                                j2 = j;
                                float f132 = 0.0f;
                                if (z2) {
                                }
                                i = 0;
                                while (i < 2) {
                                }
                            }
                        }
                        z = false;
                        z2 = z4;
                        if (z4) {
                        }
                        j2 = j;
                        float f1322 = 0.0f;
                        if (z2) {
                        }
                        i = 0;
                        while (i < 2) {
                        }
                    }
                    f = f12;
                    invalidate();
                } else {
                    f = 1.0f;
                }
                super.dispatchDraw(canvas);
                if (this.U == 0 && (k47Var = MediaController.w().v0) != null) {
                    float f38 = -gm.N(f);
                    float R1 = gm.R1(f38, gm.N(f) + getMeasuredWidth(), k47Var.b0);
                    float measuredHeight2 = getMeasuredHeight();
                    float N = measuredHeight2 - gm.N(2.0f);
                    int v0 = cmb.v0(cmb.Xl, this.q0);
                    Paint paint2 = this.Q0;
                    paint2.setColor(v0);
                    canvas.drawRoundRect(f38, N, R1, measuredHeight2, gm.N(f), gm.N(f), paint2);
                }
                this.P0 = true;
            }
        }
    }

    public final void e(boolean z) {
        View fragmentView = this.h.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        s96 s96Var = s96.N;
        po poVar = this.u0;
        byte b = 6;
        if (s96Var != null) {
            b();
            int i = this.U;
            if (6 != i && this.f != null && !z) {
                this.x0 = true;
                return;
            }
            if (6 != i && this.T && !z) {
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                poVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(d53.f);
                this.f.addListener(new mp4(this, b));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
                setTopPadding(gm.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z) {
                    setTopPadding(gm.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(d53.f);
                    this.f.addListener(new mp4(this, (byte) 7));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
        } else {
            boolean z2 = this.T;
            if (z2 && ((z && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f = null;
                    }
                    poVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(d53.f);
                    this.f.addListener(new mp4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        s96 s96Var2 = s96.N;
        if (s96Var2 == null || this.U != 6) {
            return;
        }
        pp4 pp4Var = this.d;
        TLRPC.GroupCall groupCall = s96Var2.s;
        pp4Var.setText(jb6.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        f02 f02Var = this.n;
        if (f02Var == null || this.d == null) {
            return;
        }
        b();
        long a = f02Var.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) dd6.f(currentAccount).c.f(a);
        byte b = 2;
        if (!this.r0) {
            dd6 f = dd6.f(currentAccount);
            vh6 vh6Var = f.H;
            if (vh6Var.h(a) < 0) {
                vh6Var.k(Boolean.TRUE, a);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f.getMessagesController().i1(a);
                tL_messages_getRecentLocations.limit = 100;
                f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new qv2(f, a, b));
            }
            this.r0 = true;
        }
        if (arrayList != null) {
            long e = z8c.h(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long B1 = k47.B1(message.from_id);
                    if (user == null && B1 != e) {
                        user = oc7.r1(currentAccount).W1(Long.valueOf(B1));
                    }
                    i2++;
                }
            }
            i = 0;
        } else {
            i = 0;
            user = null;
            i2 = 0;
        }
        if (this.s0 != i2) {
            this.s0 = i2;
            String M0 = jb6.M0(2131748597, null);
            if (i2 == 0) {
                format = M0;
            } else {
                int i4 = i2 - 1;
                if (!dd6.f(currentAccount).i(a)) {
                    int i5 = i;
                    if (i4 != 0) {
                        String k = m9c.k(user, true);
                        String G = jb6.G(i4, "AndOther", new Object[i5]);
                        Object[] objArr = new Object[3];
                        objArr[i5] = M0;
                        objArr[1] = k;
                        objArr[2] = G;
                        format = String.format("%1$s - %2$s %3$s", objArr);
                    } else {
                        String k2 = m9c.k(user, true);
                        Object[] objArr2 = new Object[2];
                        objArr2[i5] = M0;
                        objArr2[1] = k2;
                        format = String.format("%1$s - %2$s", objArr2);
                    }
                } else if (i4 == 0) {
                    String M02 = jb6.M0(2131752121, null);
                    Object[] objArr3 = new Object[2];
                    objArr3[i] = M0;
                    objArr3[1] = M02;
                    format = String.format("%1$s - %2$s", objArr3);
                } else if (i4 != 1 || user == null) {
                    String M03 = jb6.M0(2131752121, null);
                    int i6 = i;
                    String G2 = jb6.G(i4, "AndOther", new Object[i6]);
                    Object[] objArr4 = new Object[3];
                    objArr4[i6] = M0;
                    objArr4[1] = M03;
                    objArr4[2] = G2;
                    format = String.format("%1$s - %2$s %3$s", objArr4);
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[i] = m9c.k(user, true);
                    String a0 = jb6.a0("SharingYouAndOtherName", null, 2131745102, objArr5);
                    Object[] objArr6 = new Object[2];
                    objArr6[i] = M0;
                    objArr6[1] = a0;
                    format = String.format("%1$s - %2$s", objArr6);
                }
            }
            if (format.equals(this.V)) {
                return;
            }
            this.V = format;
            int indexOf = format.indexOf(M0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            int i7 = 0;
            while (i7 < 2) {
                pp4 pp4Var = this.d;
                TextView textView = i7 == 0 ? pp4Var.getTextView() : pp4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                i7++;
            }
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), indexOf, M0.length() + indexOf, 18);
            }
            this.d.b(spannableStringBuilder, false);
        }
    }

    public final void g(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z2 = true;
        if (this.T) {
            int i = this.U;
            if (i == 1 || i == 3) {
                return;
            }
            if ((i == 4 || i == 5) && !j()) {
                return;
            }
        }
        k47 k47Var = MediaController.w().v0;
        View fragmentView = this.h.getFragmentView();
        boolean z3 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean z4 = this.T;
        po poVar = this.u0;
        if (k47Var == null || k47Var.e1() == 0 || k47.K4(k47Var.k)) {
            this.R = null;
            boolean z5 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || oa5.d()) ? false : true;
            boolean z6 = z5;
            z6 = z5;
            if (!j() && !z5) {
                f02 f02Var = this.n;
                z6 = z5;
                if (f02Var != null) {
                    z6 = z5;
                    if (!oa5.d()) {
                        qd2 groupCall = f02Var.getGroupCall();
                        z6 = groupCall != null && groupCall.A();
                    }
                }
            }
            if (z6) {
                a(false);
                return;
            }
            if (!this.T) {
                setVisibility(8);
                return;
            }
            r7 r7Var = this.G;
            if (r7Var != null && r7Var.y()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z3) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f = null;
            }
            poVar.d();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            tp4 tp4Var = this.p0;
            if (tp4Var != null) {
                ((qda) tp4Var).b(true);
            }
            this.f.addListener(new mp4(this, z2 ? 1 : 0));
            this.f.start();
            return;
        }
        b();
        int i2 = this.U;
        if (i2 != 0 && this.f != null && !z3) {
            this.y0 = true;
            return;
        }
        r(0);
        if (z3 && this.S == 0.0f) {
            setTopPadding(gm.M(getStyleHeight()));
            tp4 tp4Var2 = this.p0;
            if (tp4Var2 != null) {
                ((qda) tp4Var2).b(true);
                ((qda) this.p0).b(false);
            }
        }
        byte b = 2;
        if (!this.T) {
            if (!z3) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                poVar.d();
                this.f = new AnimatorSet();
                tp4 tp4Var3 = this.p0;
                if (tp4Var3 != null) {
                    ((qda) tp4Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gm.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new mp4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        boolean C = MediaController.w().C();
        ae8 ae8Var = this.c;
        if (C) {
            ae8Var.a(false, !z3);
            this.b.setContentDescription(jb6.M0(2131754929, null));
        } else {
            ae8Var.a(true, !z3);
            this.b.setContentDescription(jb6.M0(2131754930, null));
        }
        if (this.R == k47Var && i2 == 0) {
            return;
        }
        this.R = k47Var;
        if (k47.Q4(k47Var.k) || this.R.g4()) {
            this.W = false;
            r7 r7Var2 = this.G;
            if (r7Var2 != null) {
                r7Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, gm.L(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(td4.q(k47Var.w1(true), " ", k47Var.y1(true)));
            int i3 = 0;
            while (i3 < 2) {
                pp4 pp4Var = this.d;
                TextView textView = i3 == 0 ? pp4Var.getTextView() : pp4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i3++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G != null) {
                double L0 = k47Var.L0();
                r7 r7Var3 = this.G;
                if (L0 >= 600.0d) {
                    r7Var3.setAlpha(1.0f);
                    this.G.setEnabled(true);
                    this.d.setPadding(0, 0, gm.L(44.0f) + this.N, 0);
                    q(false);
                } else {
                    r7Var3.setAlpha(0.0f);
                    this.G.setEnabled(false);
                    this.d.setPadding(0, 0, this.N, 0);
                }
            } else {
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(td4.q(k47Var.w1(true), " - ", k47Var.y1(true)));
            int i4 = 0;
            while (i4 < 2) {
                pp4 pp4Var2 = this.d;
                TextView textView2 = i4 == 0 ? pp4Var2.getTextView() : pp4Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i4++;
            }
        }
        spannableStringBuilder.setSpan(new z5c(gm.o(), cmb.v0(cmb.s7, this.q0)), 0, k47Var.w1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z3 && z4 && this.W);
    }

    public cc1 getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.U;
    }

    public int getStyleHeight() {
        return this.U == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.S;
    }

    public final void h() {
        if (this.G != null) {
            return;
        }
        Context context = getContext();
        int i = cmb.i5;
        ylb ylbVar = this.q0;
        r7 r7Var = new r7(context, null, 0, cmb.v0(i, ylbVar), false, this.q0);
        this.G = r7Var;
        if (r7Var.getIconView() != null) {
            anb.s(this.G.getIconView(), i, ylbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(gm.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(jb6.M0(2131754804, null));
        this.G.setDelegate(new ip4(this));
        r7 r7Var2 = this.G;
        dna dnaVar = new dna();
        this.H = dnaVar;
        r7Var2.setIcon(dnaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), ylbVar);
        this.I = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new h92(this, (byte) 29));
        p7 A = this.G.A(0, R.drawable.msg_speed_slow, jb6.M0(2131744955, null));
        p7[] p7VarArr = this.J;
        p7VarArr[0] = A;
        p7VarArr[1] = this.G.A(1, R.drawable.msg_speed_normal, jb6.M0(2131744956, null));
        p7VarArr[2] = this.G.A(2, R.drawable.msg_speed_medium, jb6.M0(2131744957, null));
        p7VarArr[3] = this.G.A(3, R.drawable.msg_speed_fast, jb6.M0(2131744959, null));
        byte b = 4;
        p7VarArr[4] = this.G.A(4, R.drawable.msg_speed_veryfast, jb6.M0(2131744953, null));
        p7VarArr[5] = this.G.A(5, R.drawable.msg_speed_superfast, jb6.M0(2131744954, null));
        if (gm.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(gm.L(8.0f));
        addView(this.G, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new tf3(this, fArr, (byte) 11));
        this.G.setOnLongClickListener(new au(this, b));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i = this.U;
        if ((i == 3 || i == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(cd6 cd6Var) {
        if (cd6Var != null) {
            org.telegram.ui.ActionBar.d dVar = this.h;
            if (dVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) dVar.getParentActivity();
                launchActivity.N0(cd6Var.h.K1);
                pc6 pc6Var = new pc6(2);
                pc6Var.G0(cd6Var.h);
                pc6Var.M0 = new d12((Object) cd6Var, k47.B0(cd6Var.h.k), (byte) 6);
                launchActivity.t0(pc6Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r13 < r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        r3 = org.telegram.messenger.beta.R.raw.speed_slow;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r13 < 1.0f) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float f, float f2, boolean z) {
        String a0;
        if (i(f, f2)) {
            return;
        }
        float abs = Math.abs(f2 - 1.0f);
        int i = R.raw.speed_fast;
        if (abs < 0.05f) {
            if (f < f2) {
                return;
            }
            a0 = jb6.M0(2131753866, null);
            if (Math.abs(f - 2.0f) < 0.05f) {
                i = R.raw.speed_2to1;
            }
        } else if (z && i(f2, 1.5f) && i(f, 1.0f)) {
            a0 = jb6.a0("AudioSpeedCustom", null, 2131753868, dna.a(f2));
            i = R.raw.speed_1to15;
        } else if (z && i(f2, 2.0f) && i(f, 1.5f)) {
            a0 = jb6.M0(2131753867, null);
            i = R.raw.speed_15to2;
        } else {
            a0 = jb6.a0("AudioSpeedCustom", null, 2131753868, dna.a(f2));
        }
        c41.b0(this.h).Q(i, 36, a0).j();
    }

    public final void m() {
        e7a e7aVar = this.L0;
        if (e7aVar != null) {
            e7aVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            km7[] km7VarArr = this.K0;
            km7 km7Var = km7VarArr[i];
            if (km7Var != null) {
                km7Var.a();
                km7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        ef1 ef1Var = this.O;
        if (ef1Var == null || ef1Var.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            gm.d3(new lp4(this, (byte) 0), 150L);
        }
    }

    public final void o(boolean z) {
        qd2 qd2Var;
        int i;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        gd0 gd0Var = this.b0.a;
        if (gd0Var.f != null) {
            gd0Var.g = true;
            return;
        }
        int i2 = this.U;
        int i3 = this.n0;
        f02 f02Var = this.n;
        if (i2 == 4) {
            if (f02Var != null) {
                qd2Var = f02Var.getGroupCall();
                i3 = this.h.getCurrentAccount();
            } else {
                qd2Var = null;
            }
            i = i3;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            qd2Var = VoIPService.getSharedInstance().groupCall;
            user = f02Var != null ? null : VoIPService.getSharedInstance().getUser();
            i = VoIPService.getSharedInstance().getAccount();
        } else {
            qd2Var = null;
            i = i3;
            user = null;
        }
        if (qd2Var != null) {
            ArrayList arrayList = qd2Var.e;
            int size = arrayList.size();
            for (int i4 = 0; i4 < 3; i4++) {
                hd0 hd0Var = this.b0;
                if (i4 < size) {
                    hd0Var.b(i4, i, (TLObject) arrayList.get(i4));
                } else {
                    hd0Var.b(i4, i, null);
                }
            }
        } else if (user != null) {
            this.b0.b(0, i, user);
            for (int i5 = 1; i5 < 3; i5++) {
                this.b0.b(i5, i, null);
            }
        } else {
            for (int i6 = 0; i6 < 3; i6++) {
                this.b0.b(i6, i, null);
            }
        }
        this.b0.a(z);
        if (this.U != 4 || qd2Var == null) {
            return;
        }
        int min = qd2Var.b.rtmp_stream ? 0 : Math.min(3, qd2Var.e.size());
        int h = (min == 0 ? 10 : aq1.h(min, 1, 24, 52)) + 3;
        pp4 pp4Var = this.d;
        if (z) {
            int i7 = ((FrameLayout.LayoutParams) pp4Var.getLayoutParams()).leftMargin;
            if (gm.L(h) != i7) {
                float translationX = (this.d.getTranslationX() + i7) - gm.L(r2);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                d53 d53Var = d53.f;
                duration.setInterpolator(d53Var);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(d53Var);
            }
        } else {
            pp4Var.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f = h;
        this.d.setLayoutParams(qoe.d(-1, 20.0f, 51, f, 5.0f, qd2Var.k() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(qoe.d(-1, 20.0f, 51, f, 25.0f, qd2Var.k() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            e7a e7aVar = new e7a(nm7.e(), this);
            e7aVar.b(nm7.H4);
            e7aVar.b(nm7.J4);
            this.L0 = e7aVar;
            d(true);
        } else {
            for (int i = 0; i < 4; i++) {
                e7a e7aVar2 = new e7a(nm7.f(i), this);
                e7aVar2.b(nm7.f2);
                e7aVar2.b(nm7.g2);
                e7aVar2.b(nm7.h2);
                e7aVar2.b(nm7.w2);
                e7aVar2.b(nm7.C2);
                e7aVar2.b(nm7.v1);
                e7aVar2.b(nm7.G2);
                e7aVar2.b(nm7.e2);
                this.K0[i] = e7aVar2;
                GroupCallMessagesController.getInstance(i).subscribeToCallMessages(0L, this);
            }
            e7a e7aVar3 = new e7a(nm7.e(), this);
            e7aVar3.b(nm7.N4);
            e7aVar3.b(nm7.v2);
            e7aVar3.b(nm7.D2);
            e7aVar3.b(nm7.S4);
            e7aVar3.b(nm7.R4);
            e7aVar3.b(nm7.F2);
            this.L0 = e7aVar3;
            if (s96.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || oa5.d()) {
                f02 f02Var = this.n;
                if (f02Var != null && this.h.getSendMessagesHelper().A(f02Var.a()) != null && !j()) {
                    c(true);
                } else if (f02Var == null || f02Var.getGroupCall() == null || !f02Var.getGroupCall().A() || oa5.d() || j()) {
                    a(true);
                    g(true);
                    q(false);
                } else {
                    a(true);
                }
            } else {
                a(true);
            }
        }
        int i2 = this.U;
        if (i2 == 3 || i2 == 1) {
            ArrayList arrayList = cmb.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cc1 cc1Var = this.a;
            if (!cc1Var.u) {
                cc1Var.u = true;
                cc1Var.t = SystemClock.elapsedRealtime();
                fi2.d().a(60, cc1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z && this.y != null) {
                this.P = z;
                this.E.K(z ? 15 : 29);
                p09 p09Var = this.E;
                p09Var.I(p09Var.f - 1, false, true);
                this.y.invalidate();
            }
        } else if (i2 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(gm.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z2 = this.P;
        cc1 cc1Var = this.a;
        if (z2 != z) {
            this.P = z;
            this.E.K(z ? 15 : 29);
            p09 p09Var = this.E;
            p09Var.I(p09Var.f - 1, false, true);
            this.y.invalidate();
            cmb.E0().c(this.T);
            cc1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            cmb.E0().a(0.0f);
            cc1Var.f(0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.l0) {
            gm.r(this.m0);
            this.l0 = false;
        }
        this.T = false;
        this.u0.e();
        this.S = 0.0f;
        m();
        if (!this.o0) {
            for (int i = 0; i < 4; i++) {
                GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i2 = this.U;
        if (i2 == 3 || i2 == 1) {
            vp4 E0 = cmb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            cc1 cc1Var = this.a;
            if (cc1Var.u) {
                cc1Var.u = false;
                fi2.d().g(cc1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, gm.M(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.s != null) {
            int i = this.U;
            if ((i == 1 || i == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j) {
                this.V0++;
                if (groupCallMessage.isOut()) {
                    return;
                }
                this.U0.h(new sp4(this.s, groupCallMessage), true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i = this.V0;
        if (i > 0) {
            int i2 = i - 1;
            this.V0 = i2;
            if (i2 == 0) {
                this.U0.h(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        p();
    }

    public final void p() {
        qd2 qd2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(jb6.M0(2131743076, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (qd2Var = sharedInstance.groupCall) != null) {
                    if (qd2Var.e.size() <= 1) {
                        this.d.b(jb6.M0(2131751760, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(pg3.r(sharedInstance.getAccount(), pg3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(jb6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                f02 f02Var = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (f02Var == null || f02Var.h() == null || f02Var.h().id != user.id) {
                            this.d.setText(bw2.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(jb6.M0(2131745779, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (f02Var == null || f02Var.f() == null || f02Var.f().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat f = f02Var.f();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(jb6.M0(2131743132, null), false);
                    return;
                }
                boolean W = sd2.W(f);
                pp4 pp4Var = this.d;
                if (W) {
                    pp4Var.b(jb6.M0(2131743132, null), false);
                } else {
                    pp4Var.b(jb6.M0(2131742991, null), false);
                }
            }
        }
    }

    public final void q(boolean z) {
        if (this.H == null) {
            return;
        }
        float x = MediaController.w().x(this.W);
        this.H.b(z, x);
        updateColors();
        boolean z2 = this.A0;
        int i = 0;
        this.A0 = false;
        while (true) {
            p7[] p7VarArr = this.J;
            if (i >= p7VarArr.length) {
                this.I.e(z, x);
                return;
            }
            ylb ylbVar = this.q0;
            if (z2 || Math.abs(x - W0[i]) >= 0.05f) {
                p7 p7Var = p7VarArr[i];
                int i2 = cmb.D8;
                p7Var.a(cmb.v0(i2, ylbVar), cmb.v0(i2, ylbVar));
            } else {
                p7 p7Var2 = p7VarArr[i];
                int i3 = cmb.Gi;
                p7Var2.a(cmb.v0(i3, ylbVar), cmb.v0(i3, ylbVar));
            }
            i++;
        }
    }

    public final void r(int i) {
        pp4 pp4Var;
        pp4 pp4Var2;
        pp4 pp4Var3;
        pp4 pp4Var4;
        if (this.U == i) {
            return;
        }
        b();
        int i2 = this.U;
        cc1 cc1Var = this.a;
        int i3 = 0;
        if (i2 == 3 || i2 == 1) {
            vp4 E0 = cmb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            if (cc1Var.u) {
                cc1Var.u = false;
                fi2.d().g(cc1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            m99 m99Var = this.U0;
            if (m99Var != null) {
                m99Var.h(null, true);
            }
        }
        this.U = i;
        this.r.setWillNotDraw(i != 4);
        if (i != 4) {
            this.h0 = false;
        }
        hd0 hd0Var = this.b0;
        if (hd0Var != null) {
            hd0Var.setStyle(this.U);
            this.b0.setLayoutParams(qoe.e(nm7.s1, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(qoe.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f = this.S;
        if (f > 0.0f && f != gm.M(getStyleHeight())) {
            setTopPadding(gm.M(getStyleHeight()));
        }
        ylb ylbVar = this.q0;
        if (i != 6) {
            if (i == 5) {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(cmb.u7));
                int i4 = 0;
                while (true) {
                    pp4Var4 = this.d;
                    if (i4 >= 2) {
                        break;
                    }
                    TextView textView = i4 == 0 ? pp4Var4.getTextView() : pp4Var4.getNextTextView();
                    if (textView != null) {
                        textView.setGravity(19);
                        anb.X(textView, cmb.t7, ylbVar);
                        textView.setTypeface(Typeface.DEFAULT);
                        textView.setTextSize(1, 15.0f);
                    }
                    i4++;
                }
                pp4Var4.setTag(Integer.valueOf(cmb.t7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(jb6.M0(2131754900, null));
                r7 r7Var = this.G;
                if (r7Var != null) {
                    r7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
                return;
            }
            if (i == 0 || i == 2) {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(cmb.u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.b.setVisibility(0);
                this.y.setVisibility(8);
                this.x.setVisibility(8);
                this.x.i();
                this.b0.setVisibility(8);
                int i5 = 0;
                while (true) {
                    pp4Var = this.d;
                    if (i5 >= 2) {
                        break;
                    }
                    TextView textView2 = i5 == 0 ? pp4Var.getTextView() : pp4Var.getNextTextView();
                    if (textView2 != null) {
                        textView2.setGravity(19);
                        anb.X(textView2, cmb.t7, ylbVar);
                        textView2.setTypeface(Typeface.DEFAULT);
                        textView2.setTextSize(1, 15.0f);
                    }
                    i5++;
                }
                pp4Var.setTag(Integer.valueOf(cmb.t7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                    return;
                } else {
                    if (i != 0) {
                        imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                        this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                        this.F.setContentDescription(jb6.M0(2131754754, null));
                        return;
                    }
                    imageView.setLayoutParams(qoe.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(qoe.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    r7 r7Var2 = this.G;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(jb6.M0(2131754900, null));
                    return;
                }
            }
            if (i == 4) {
                this.w.setBackground(cmb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(cmb.u7));
                this.y.setVisibility(8);
                this.e.setVisibility(0);
                int i6 = 0;
                while (true) {
                    pp4Var3 = this.d;
                    if (i6 >= 2) {
                        break;
                    }
                    TextView textView3 = i6 == 0 ? pp4Var3.getTextView() : pp4Var3.getNextTextView();
                    if (textView3 != null) {
                        textView3.setGravity(51);
                        anb.X(textView3, cmb.s7, ylbVar);
                        textView3.setTypeface(gm.o());
                        textView3.setTextSize(1, 15.0f);
                    }
                    i6++;
                }
                pp4Var3.setTag(Integer.valueOf(cmb.s7));
                this.d.setPadding(0, 0, this.N, 0);
                this.x.setVisibility(8);
                this.x.i();
                f02 f02Var = this.n;
                this.b0.setVisibility(!((f02Var == null || f02Var.getGroupCall() == null || f02Var.getGroupCall().b == null || !f02Var.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
                if (this.b0.getVisibility() != 8) {
                    o(false);
                } else {
                    this.d.setTranslationX(-gm.L(36.0f));
                    this.e.setTranslationX(-gm.L(36.0f));
                }
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                r7 r7Var3 = this.G;
                if (r7Var3 != null) {
                    r7Var3.setVisibility(8);
                    this.G.setTag(null);
                    return;
                }
                return;
            }
            if (i == 1 || i == 3) {
                this.w.setBackground(null);
                p();
                boolean hasRtmpStream = VoIPService.hasRtmpStream();
                this.b0.setVisibility(!hasRtmpStream ? 0 : 8);
                if (i == 3 && VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().registerStateListener(this);
                }
                if (this.b0.getVisibility() != 8) {
                    o(false);
                } else {
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                this.y.setVisibility(!hasRtmpStream ? 0 : 8);
                boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
                this.P = z;
                this.E.K(z ? 15 : 29);
                p09 p09Var = this.E;
                p09Var.I(p09Var.f - 1, false, true);
                this.y.invalidate();
                this.r.setBackground(null);
                this.r.setBackgroundColor(0);
                this.x.setVisibility(8);
                this.x.i();
                ArrayList arrayList2 = cmb.E0().l;
                if (!arrayList2.contains(this)) {
                    arrayList2.add(this);
                }
                if (!cc1Var.u) {
                    cc1Var.u = true;
                    cc1Var.t = SystemClock.elapsedRealtime();
                    fi2.d().a(60, cc1Var.F);
                }
                invalidate();
                int i7 = 0;
                while (true) {
                    pp4Var2 = this.d;
                    if (i7 >= 2) {
                        break;
                    }
                    TextView textView4 = i7 == 0 ? pp4Var2.getTextView() : pp4Var2.getNextTextView();
                    if (textView4 != null) {
                        textView4.setGravity(19);
                        anb.X(textView4, cmb.z7, ylbVar);
                        textView4.setTypeface(gm.o());
                        textView4.setTextSize(1, 14.0f);
                    }
                    i7++;
                }
                pp4Var2.setTag(Integer.valueOf(cmb.z7));
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.d.setLayoutParams(qoe.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                this.d.setPadding(gm.L(88.0f), 0, gm.L(88.0f) + this.N, 0);
                r7 r7Var4 = this.G;
                if (r7Var4 != null) {
                    r7Var4.setVisibility(8);
                    this.G.setTag(null);
                    return;
                }
                return;
            }
            return;
        }
        this.w.setBackground(cmb.L0(false));
        this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.v0(cmb.dl, ylbVar), cmb.v0(cmb.el, ylbVar)}));
        this.r.setTag(null);
        this.e.setVisibility(8);
        this.M.setVisibility(8);
        this.F.setVisibility(8);
        this.b.setVisibility(8);
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        this.x.i();
        this.b0.setVisibility(8);
        this.d.setTag(Integer.valueOf(cmb.z7));
        while (true) {
            pp4 pp4Var5 = this.d;
            if (i3 >= 2) {
                pp4Var5.setLayoutParams(qoe.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                return;
            }
            TextView textView5 = i3 == 0 ? pp4Var5.getTextView() : pp4Var5.getNextTextView();
            if (textView5 != null) {
                textView5.setGravity(19);
                anb.X(textView5, cmb.z7, ylbVar);
                textView5.setTypeface(gm.o());
                textView5.setTextSize(1, 15.0f);
            }
            i3++;
        }
    }

    public void setDelegate(tp4 tp4Var) {
        this.p0 = tp4Var;
    }

    public void setDrawOverlay(boolean z) {
        this.R0 = z;
    }

    public void setLeftMargin(float f) {
        if (this.r == null) {
            this.T0 = f;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
        s09 s09Var = this.x;
        if (s09Var != null) {
            s09Var.setTranslationX(f);
        }
        pp4 pp4Var = this.d;
        if (pp4Var != null) {
            pp4Var.setTranslationX(f);
        }
        pp4 pp4Var2 = this.e;
        if (pp4Var2 != null) {
            pp4Var2.setTranslationX(f);
        }
        hd0 hd0Var = this.b0;
        if (hd0Var != null) {
            hd0Var.setTranslationX(f);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z) {
        this.a0 = z;
    }

    public void setTopPadding(float f) {
        this.S = f;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setTopPadding(this.S);
        if (i == 8) {
            this.P0 = false;
        }
    }

    @Override // vlb
    public final void updateColors() {
        z5c[] z5cVarArr;
        cc1 cc1Var = this.a;
        int i = cc1Var.A;
        if (i >= 0) {
            cc1Var.E = 1.0f;
            cc1Var.a(cc1.e(i));
        }
        int i2 = !i(MediaController.w().x(this.W), 1.0f) ? cmb.Gi : cmb.w7;
        ylb ylbVar = this.q0;
        int v0 = cmb.v0(i2, ylbVar);
        dna dnaVar = this.H;
        if (dnaVar != null) {
            dnaVar.a.u(v0);
            Paint paint = dnaVar.b;
            if (paint != null) {
                paint.setColor(v0);
            }
        }
        r7 r7Var = this.G;
        if (r7Var != null) {
            Drawable background = r7Var.getBackground();
            if (background == null || background != this.E0) {
                r7 r7Var2 = this.G;
                fg0 f0 = cmb.f0(436207615 & v0, 1, gm.L(14.0f));
                this.E0 = f0;
                r7Var2.setBackground(f0);
                this.J0 = v0;
            } else if (v0 != this.J0) {
                this.J0 = v0;
                cmb.F1(background, v0 & 436207615, true);
            }
        }
        if (this.b != null) {
            int v02 = cmb.v0(cmb.v7, ylbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = cmb.v0(cmb.w7, ylbVar);
            if (this.G0 == null || v03 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = v03;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            int i3 = 0;
            while (i3 < 2) {
                pp4 pp4Var = this.e;
                TextView textView = i3 == 0 ? pp4Var.getTextView() : pp4Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(cmb.v0(cmb.w7, ylbVar));
                }
                i3++;
            }
        }
        pp4 pp4Var2 = this.d;
        if (pp4Var2 != null) {
            Object tag = pp4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i4 = 0;
                while (i4 < 2) {
                    pp4 pp4Var3 = this.d;
                    TextView textView2 = i4 == 0 ? pp4Var3.getTextView() : pp4Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(cmb.v0(intValue, ylbVar));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (z5cVarArr = (z5c[]) ((Spanned) text).getSpans(0, text.length(), z5c.class)) != null) {
                            for (z5c z5cVar : z5cVarArr) {
                                z5cVar.b = cmb.v0(cmb.s7, ylbVar);
                            }
                        }
                    }
                    i4++;
                }
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }

    public FragmentContextView(Context context, nk3 nk3Var, boolean z) {
        this(context, nk3Var, null, z, null);
    }
}
