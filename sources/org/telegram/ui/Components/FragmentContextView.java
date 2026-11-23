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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.gs, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.b6 {
    public static final float[] X0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public boolean B0;
    public hi.l3 C0;
    public ViewGroup D0;
    public x00 E;
    public long E0;
    public oh0 F;
    public org.telegram.ui.Cells.y F0;
    public ImageView G;
    public PorterDuffColorFilter G0;
    public org.telegram.ui.ActionBar.q0 H;
    public PorterDuffColorFilter H0;
    public pu0 I;
    public int I0;
    public org.telegram.ui.ActionBar.u0 J;
    public int J0;
    public final org.telegram.ui.ActionBar.o0[] K;
    public int K0;
    public FrameLayout L;
    public final org.telegram.messenger.hs[] L0;
    public ImageView M;
    public xi.e M0;
    public org.telegram.ui.ActionBar.n2 N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.voip.n P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public final Paint R0;
    public org.telegram.messenger.gj S;
    public boolean S0;
    public float T;
    public int T0;
    public boolean U;
    public float U0;
    public int V;
    public final te.j V0;
    public String W;
    public int W0;
    public final wc a;
    public boolean a0;
    public ImageView b;
    public boolean b0;
    public we0 c;
    public e9 c0;
    public v00 d;
    public Paint d0;
    public v00 e;
    public LinearGradient e0;
    public AnimatorSet f;
    public Matrix f0;
    public int g0;
    public final org.telegram.ui.ActionBar.g2 h;
    public TextPaint h0;
    public boolean i0;
    public boolean j0;
    public final n6 k0;
    public mc l0;
    public boolean m0;
    public final bh n;
    public final t00 n0;
    public final int o0;
    public final boolean p0;
    public z00 q0;
    public final View r;
    public final org.telegram.ui.ActionBar.h6 r0;
    public u00 s;
    public boolean s0;
    public int t0;
    public final ik u0;
    public final h2.f v0;
    public bi.t2 w;
    public final h2.f w0;
    public View x;
    public boolean x0;
    public rh0 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.cx cxVar, boolean z10) {
        this(context, cxVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i7 = this.V;
        org.telegram.ui.ActionBar.h6 h6Var = this.r0;
        return i7 == 4 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t7, h6Var) : (i7 == 1 || i7 == 3) ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A7, h6Var) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.u7, h6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static boolean j() {
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        return gjVar != null && org.telegram.messenger.gj.R4(gjVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.t3 groupCall;
        org.telegram.messenger.t3 t3Var;
        int i7;
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.U && this.V == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.h;
        View fragmentView = g2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean d = c20.d();
        bh bhVar = this.n;
        if (d) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.f40.D5 || !this.b0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (t3Var = sharedInstance.groupCall) != null && (t3Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (j() || org.telegram.ui.f40.D5 || !this.b0 || z11 || bhVar == null || (groupCall = bhVar.getGroupCall()) == null || !groupCall.y()) {
                z12 = false;
                h2.f fVar = this.v0;
                int i11 = 8;
                if (z11) {
                    boolean z14 = this.U;
                    if (z14 && ((z13 && this.V == -1) || (i10 = this.V) == 4 || i10 == 3 || i10 == 1)) {
                        this.U = false;
                        if (z13) {
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
                            fVar.d();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(nr.f);
                            this.f.addListener(new s00(this, i11));
                            this.f.start();
                        }
                    } else if (z14 && ((i7 = this.V) == -1 || i7 == 4 || i7 == 3 || i7 == 1)) {
                        this.U = false;
                        setVisibility(8);
                    }
                    if (!z13 || bhVar == null || !bhVar.K() || c20.d()) {
                        return;
                    }
                    org.telegram.messenger.f3.n(null, 2131748959, lc.b0(g2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.V;
                if (i12 != i13 && this.f != null && !z13) {
                    this.x0 = true;
                    return;
                }
                if (i12 != i13 && this.U && !z13) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    fVar.d();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(nr.f);
                    this.f.addListener(new s00(this, 9));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.U;
                    r(4);
                    org.telegram.messenger.t3 groupCall2 = bhVar.getGroupCall();
                    TLRPC.Chat g10 = bhVar.g();
                    if (groupCall2.j()) {
                        if (this.d0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.h0 = textPaint;
                            textPaint.setColor(-1);
                            this.h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
                            this.h0.setTypeface(org.telegram.messenger.g0.o());
                            Paint paint = new Paint(1);
                            this.d0 = paint;
                            paint.setColor(-1);
                            this.f0 = new Matrix();
                        }
                        this.i0 = true;
                        org.telegram.messenger.hd.N0(2131743195, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.j0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.N.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (org.telegram.messenger.v3.W(g10)) {
                            this.d.b(org.telegram.messenger.hd.N0(2131743216, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.hd.N0(2131743095, null), false);
                        }
                        this.e.b(org.telegram.messenger.hd.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.m0) {
                            this.m0 = true;
                            this.n0.run();
                        }
                    } else {
                        this.i0 = false;
                        this.N.setVisibility(0);
                        this.N.setText(org.telegram.messenger.hd.N0(2131743197, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(org.telegram.messenger.hd.N0(2131743202, null), false);
                        } else if (org.telegram.messenger.v3.W(g10)) {
                            this.d.b(org.telegram.messenger.hd.N0(2131743202, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.hd.N0(2131743061, null), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.hd.N0(groupCall4.rtmp_stream ? 2131743290 : 2131748421, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.hd.G(i14, groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                        this.s.invalidate();
                    }
                    o(this.c0.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    o(i13 == 1);
                    r(1);
                } else {
                    o(i13 == 3);
                    r(3);
                }
                if (this.U) {
                    return;
                }
                if (z13) {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.w0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(nr.f);
                    this.f.addListener(new s00(this, 10));
                    this.f.start();
                }
                this.U = true;
                setVisibility(0);
                return;
            }
            z11 = true;
        }
        z12 = z11;
        h2.f fVar2 = this.v0;
        int i112 = 8;
        if (z11) {
        }
    }

    public final void b() {
        if (this.s != null) {
            return;
        }
        Context context = getContext();
        u00 u00Var = new u00(this, context);
        this.s = u00Var;
        this.l0 = new mc(u00Var);
        int i7 = org.telegram.messenger.g0.q.x;
        n6 n6Var = this.k0;
        n6Var.N = i7;
        n6Var.B = 0.4f;
        n6Var.setCallback(u00Var);
        n6Var.u(-1);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        addView(this.s, c8.ma.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.x = view;
        this.s.addView(view, c8.ma.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i10 = org.telegram.ui.ActionBar.m6.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.h6 h6Var = this.r0;
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, h6Var, mode);
        ImageView imageView3 = this.b;
        int i11 = 16;
        we0 we0Var = new we0(16);
        this.c = we0Var;
        imageView3.setImageDrawable(we0Var);
        final int i12 = 1;
        this.b.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.b, c8.ma.e(36, 36, 51));
        final int i13 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i14;
                long j3;
                TL_stories.StoryItem u10;
                int i15 = i13;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i15) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var2);
                            String N0 = org.telegram.messenger.hd.N0(2131744592, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.cx) {
                                t1Var.U = org.telegram.messenger.hd.N0(2131744594, null);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User j10 = bhVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744593, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744591, org.telegram.messenger.p10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new n00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.V;
                        int i17 = 6;
                        if (i16 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.b;
                                int i18 = c1Var.e;
                                if (i18 != org.telegram.messenger.k10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.u1(i18).R1().u(c1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i18).G(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            org.telegram.messenger.gj gjVar = MediaController.B().v0;
                            if (g2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new f8(W, h6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new f8(LaunchActivity.H1, h6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.gj.B0(gjVar.k) == (bhVar2 != null ? bhVar2.a() : 0L)) {
                                    fragmentContextView.n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.n5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.n5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", gjVar.e1());
                                    g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = org.telegram.messenger.k10.t0;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
                                i14 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!org.telegram.messenger.rd.f(i20).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i20).J.get(0);
                                            j3 = qdVar.a;
                                            i14 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i14 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i14).h(j3));
                                break;
                            } else {
                                g2Var2.showDialog(new mt0(fragmentContextView.getContext(), new n00(fragmentContextView), h6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (g2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                                if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                    z30 z30Var = new z30(fragmentContextView.getContext(), null, bnVar, h6Var3);
                                    z30Var.I0 = new z0(fragmentContextView, i17);
                                    g2Var2.showDialog(z30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.f40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().v0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.F.P(fragmentContextView.Q ? 15 : 29)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        rh0 rh0Var = new rh0(context);
        this.y = rh0Var;
        rh0Var.setScaleType(scaleType);
        this.y.setAutoRepeat(true);
        this.y.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.t6.B(this.y, org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.w0(i10, h6Var)), org.telegram.ui.ActionBar.t6.M(i10), h6Var);
        addView(this.y, c8.ma.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final int i14 = 0;
        v00 v00Var = new v00(this, context, context, i14);
        this.d = v00Var;
        addView(v00Var, c8.ma.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        v00 v00Var2 = new v00(this, context, context, i12);
        this.e = v00Var2;
        addView(v00Var2, c8.ma.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.P = nVar;
        nVar.g = 1.0f;
        nVar.j = false;
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(2, context, this);
        this.N = n2Var;
        n2Var.setText(org.telegram.messenger.hd.N0(2131743197, null));
        org.telegram.ui.ActionBar.t6.U(this.N, org.telegram.ui.ActionBar.m6.Ji, h6Var);
        org.telegram.ui.ActionBar.n2 n2Var2 = this.N;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i15 = org.telegram.ui.ActionBar.m6.Fi;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
        int i16 = org.telegram.ui.ActionBar.m6.Hi;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
        org.telegram.ui.ActionBar.t6.Q(n2Var2, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.t6.M(i15), org.telegram.ui.ActionBar.t6.M(i16), h6Var);
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(org.telegram.messenger.g0.o());
        int i17 = 17;
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.N, c8.ma.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i18 = 3;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i142;
                long j3;
                TL_stories.StoryItem u10;
                int i152 = i18;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var2);
                            String N0 = org.telegram.messenger.hd.N0(2131744592, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.cx) {
                                t1Var.U = org.telegram.messenger.hd.N0(2131744594, null);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User j10 = bhVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744593, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744591, org.telegram.messenger.p10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new n00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        int i172 = 6;
                        if (i162 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.b;
                                int i182 = c1Var.e;
                                if (i182 != org.telegram.messenger.k10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i182);
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.u1(i182).R1().u(c1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i182).G(i182, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.gj gjVar = MediaController.B().v0;
                            if (g2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new f8(W, h6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new f8(LaunchActivity.H1, h6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.gj.B0(gjVar.k) == (bhVar2 != null ? bhVar2.a() : 0L)) {
                                    fragmentContextView.n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.n5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.n5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", gjVar.e1());
                                    g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = org.telegram.messenger.k10.t0;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
                                i142 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!org.telegram.messenger.rd.f(i20).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i20).J.get(0);
                                            j3 = qdVar.a;
                                            i142 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i142 = i19;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i142).h(j3));
                                break;
                            } else {
                                g2Var2.showDialog(new mt0(fragmentContextView.getContext(), new n00(fragmentContextView), h6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (g2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                                if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                    z30 z30Var = new z30(fragmentContextView.getContext(), null, bnVar, h6Var3);
                                    z30Var.I0 = new z0(fragmentContextView, i172);
                                    g2Var2.showDialog(z30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.f40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().v0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.F.P(fragmentContextView.Q ? 15 : 29)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        if (this.P0) {
            n();
        }
        this.L = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.M = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.M;
        int i19 = org.telegram.ui.ActionBar.m6.x7;
        org.telegram.ui.ActionBar.t6.s(imageView5, i19, h6Var, mode);
        this.L.addView(this.M, c8.ma.e(20, 20, 17));
        this.L.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.L.setContentDescription(org.telegram.messenger.hd.N0(2131743604, null));
        this.L.setOnClickListener(new bi.o(i17));
        this.L.setVisibility(8);
        addView(this.L, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.p0) {
            h();
        }
        e9 e9Var = new e9(context, false);
        this.c0 = e9Var;
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.c0.setDelegate(new r00(this, 1));
        this.c0.setVisibility(8);
        addView(this.c0, c8.ma.e(org.telegram.messenger.ls.t1, 36, 51));
        this.F = new oh0(R.raw.voice_muted, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        x00 x00Var = new x00(this, context);
        this.E = x00Var;
        org.telegram.ui.ActionBar.t6.s(x00Var, org.telegram.ui.ActionBar.m6.A7, h6Var, PorterDuff.Mode.SRC_IN);
        this.E.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.E.setAnimation(this.F);
        this.E.setScaleType(scaleType);
        this.E.setVisibility(8);
        addView(this.E, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i20 = 4;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i142;
                long j3;
                TL_stories.StoryItem u10;
                int i152 = i20;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var2);
                            String N0 = org.telegram.messenger.hd.N0(2131744592, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.cx) {
                                t1Var.U = org.telegram.messenger.hd.N0(2131744594, null);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User j10 = bhVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744593, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744591, org.telegram.messenger.p10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new n00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        int i172 = 6;
                        if (i162 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.b;
                                int i182 = c1Var.e;
                                if (i182 != org.telegram.messenger.k10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i182);
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.u1(i182).R1().u(c1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i182).G(i182, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.gj gjVar = MediaController.B().v0;
                            if (g2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new f8(W, h6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new f8(LaunchActivity.H1, h6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.gj.B0(gjVar.k) == (bhVar2 != null ? bhVar2.a() : 0L)) {
                                    fragmentContextView.n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.n5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.n5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", gjVar.e1());
                                    g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i192 = org.telegram.messenger.k10.t0;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
                                i142 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i202 = 0; i202 < 4; i202++) {
                                        if (!org.telegram.messenger.rd.f(i202).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i202).J.get(0);
                                            j3 = qdVar.a;
                                            i142 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i142 = i192;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i142).h(j3));
                                break;
                            } else {
                                g2Var2.showDialog(new mt0(fragmentContextView.getContext(), new n00(fragmentContextView), h6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (g2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                                if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                    z30 z30Var = new z30(fragmentContextView.getContext(), null, bnVar, h6Var3);
                                    z30Var.I0 = new z0(fragmentContextView, i172);
                                    g2Var2.showDialog(z30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.f40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().v0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.F.P(fragmentContextView.Q ? 15 : 29)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
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
        this.G = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        org.telegram.ui.ActionBar.t6.s(this.G, i19, h6Var, mode);
        this.G.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i19, h6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.G.setScaleType(scaleType);
        addView(this.G, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i142;
                long j3;
                TL_stories.StoryItem u10;
                int i152 = i14;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var2);
                            String N0 = org.telegram.messenger.hd.N0(2131744592, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.cx) {
                                t1Var.U = org.telegram.messenger.hd.N0(2131744594, null);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User j10 = bhVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744593, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744591, org.telegram.messenger.p10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new n00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        int i172 = 6;
                        if (i162 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.b;
                                int i182 = c1Var.e;
                                if (i182 != org.telegram.messenger.k10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i182);
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.u1(i182).R1().u(c1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i182).G(i182, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.gj gjVar = MediaController.B().v0;
                            if (g2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new f8(W, h6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new f8(LaunchActivity.H1, h6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.gj.B0(gjVar.k) == (bhVar2 != null ? bhVar2.a() : 0L)) {
                                    fragmentContextView.n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.n5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.n5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", gjVar.e1());
                                    g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i192 = org.telegram.messenger.k10.t0;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
                                i142 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i202 = 0; i202 < 4; i202++) {
                                        if (!org.telegram.messenger.rd.f(i202).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i202).J.get(0);
                                            j3 = qdVar.a;
                                            i142 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i142 = i192;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i142).h(j3));
                                break;
                            } else {
                                g2Var2.showDialog(new mt0(fragmentContextView.getContext(), new n00(fragmentContextView), h6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (g2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                                if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                    z30 z30Var = new z30(fragmentContextView.getContext(), null, bnVar, h6Var3);
                                    z30Var.I0 = new z0(fragmentContextView, i172);
                                    g2Var2.showDialog(z30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.f40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().v0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.F.P(fragmentContextView.Q ? 15 : 29)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        bi.t2 t2Var = new bi.t2(getContext(), i11);
        this.w = t2Var;
        addView(t2Var, c8.ma.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.o00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.t3 groupCall;
                int i142;
                long j3;
                TL_stories.StoryItem u10;
                int i152 = i12;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        bh bhVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g2Var.getParentActivity(), h6Var2);
                            String N0 = org.telegram.messenger.hd.N0(2131744592, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            if (g2Var instanceof org.telegram.ui.cx) {
                                t1Var.U = org.telegram.messenger.hd.N0(2131744594, null);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User j10 = bhVar.j();
                                if (g10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToGroupText", null, 2131744593, g10.title));
                                } else if (j10 != null) {
                                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StopLiveLocationAlertToUserText", null, 2131744591, org.telegram.messenger.p10.k(j10, true)));
                                } else {
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131744598, null), new n00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, h6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        bh bhVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.h6 h6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.g2 g2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        int i172 = 6;
                        if (i162 == 6) {
                            fi.c1 c1Var = fi.c1.X;
                            if (c1Var != null) {
                                long j11 = c1Var.b;
                                int i182 = c1Var.e;
                                if (i182 != org.telegram.messenger.k10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i182);
                                    }
                                }
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.np.u1(i182).R1().u(c1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i182).G(i182, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.gj gjVar = MediaController.B().v0;
                            if (g2Var2 != null && gjVar != null) {
                                if (gjVar.I3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new f8(W, h6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.H1)) {
                                        new f8(LaunchActivity.H1, h6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.gj.B0(gjVar.k) == (bhVar2 != null ? bhVar2.a() : 0L)) {
                                    fragmentContextView.n.l(gjVar.e1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.n5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.n5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", gjVar.e1());
                                    g2Var2.presentFragment(new org.telegram.ui.bn(bundle), g2Var2 instanceof org.telegram.ui.bn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i192 = org.telegram.messenger.k10.t0;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
                                i142 = g2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.rd.g() == 1) {
                                    for (int i202 = 0; i202 < 4; i202++) {
                                        if (!org.telegram.messenger.rd.f(i202).J.isEmpty()) {
                                            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) org.telegram.messenger.rd.f(i202).J.get(0);
                                            j3 = qdVar.a;
                                            i142 = qdVar.h.K1;
                                        }
                                    }
                                }
                                i142 = i192;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.rd.f(i142).h(j3));
                                break;
                            } else {
                                g2Var2.showDialog(new mt0(fragmentContextView.getContext(), new n00(fragmentContextView), h6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (g2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                    TLRPC.Chat O0 = g2Var2.getMessagesController().O0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.b2.l(O0, null, false, Boolean.valueOf(z10), g2Var2.getParentActivity(), g2Var2, g2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var2;
                                if (g2Var2.getSendMessagesHelper().B(bnVar.a()) != null) {
                                    z30 z30Var = new z30(fragmentContextView.getContext(), null, bnVar, h6Var3);
                                    z30Var.I0 = new z0(fragmentContextView, i172);
                                    g2Var2.showDialog(z30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.f40.f1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.V == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().v0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().v0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.X0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.X0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.Q = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.F.P(fragmentContextView.Q ? 15 : 29)) {
                                if (fragmentContextView.Q) {
                                    fragmentContextView.F.M(0);
                                } else {
                                    fragmentContextView.F.M(14);
                                }
                            }
                            fragmentContextView.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.E.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.U0);
    }

    public final void c(boolean z10) {
        int i7;
        bh bhVar = this.n;
        if (bhVar != null) {
            int i10 = 3;
            if (this.U && ((i7 = this.V) == 1 || i7 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.g2 g2Var = this.h;
            org.telegram.messenger.ry B = g2Var.getSendMessagesHelper().B(bhVar.a());
            View fragmentView = g2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = g2Var.getVisibleDialog();
            if ((j() || bhVar.q() || ((visibleDialog instanceof z30) && !((z30) visibleDialog).J)) && B != null) {
                B = null;
            }
            h2.f fVar = this.v0;
            if (B == null) {
                if (!this.U || ((!z10 || this.V != -1) && this.V != 5)) {
                    int i11 = this.V;
                    if (i11 == -1 || i11 == 5) {
                        this.U = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.U = false;
                if (z10) {
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
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(nr.f);
                this.f.addListener(new s00(this, i10));
                this.f.start();
                return;
            }
            if (this.V != 5 && this.f != null && !z10) {
                this.A0 = true;
                return;
            }
            r(5);
            if (z10 && this.T == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                z00 z00Var = this.q0;
                if (z00Var != null) {
                    ((jp0) z00Var).b(true);
                    ((jp0) this.q0).b(false);
                }
            }
            if (!this.U) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    fVar.d();
                    this.f = new AnimatorSet();
                    z00 z00Var2 = this.q0;
                    if (z00Var2 != null) {
                        ((jp0) z00Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new s00(this, 4));
                    this.f.start();
                }
                this.U = true;
                setVisibility(0);
            }
            int i12 = this.R;
            int i13 = B.l;
            if (i12 != i13) {
                this.R = i13;
                this.d.b(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("ImportUploading", null, 2131749029, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String G;
        String N0;
        org.telegram.ui.ActionBar.g2 g2Var = this.h;
        View fragmentView = g2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = g2Var instanceof org.telegram.ui.cx;
        int i7 = 0;
        boolean i10 = z11 ? org.telegram.messenger.rd.g() != 0 : org.telegram.messenger.rd.f(g2Var.getCurrentAccount()).i(this.n.a());
        ik ikVar = this.u0;
        if (!i10) {
            this.t0 = -1;
            org.telegram.messenger.g0.r(ikVar);
            if (this.U || z10) {
                this.U = false;
                if (z10) {
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
                this.f.addListener(new s00(this, 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new bp0(getContext(), 1));
        if (z10 && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.U) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new s00(this, i7));
                this.f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (!z11) {
            ikVar.run();
            f();
            return;
        }
        String N02 = org.telegram.messenger.hd.N0(2131748647, null);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.addAll(org.telegram.messenger.rd.f(i11).J);
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.qd qdVar = (org.telegram.messenger.qd) arrayList.get(0);
            long B0 = org.telegram.messenger.gj.B0(qdVar.h.k);
            if (org.telegram.messenger.n5.E(B0)) {
                G = org.telegram.messenger.p10.k(org.telegram.messenger.np.u1(qdVar.h.K1).c2(Long.valueOf(B0)), true);
                N0 = org.telegram.messenger.hd.N0(2131753962, null);
            } else {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(qdVar.h.K1).O0(Long.valueOf(-B0));
                G = O0 != null ? O0.title : "";
                N0 = org.telegram.messenger.hd.N0(2131753961, null);
            }
        } else {
            G = org.telegram.messenger.hd.G(arrayList.size(), "Chats", new Object[0]);
            N0 = org.telegram.messenger.hd.N0(2131753960, null);
        }
        String format = String.format(N0, N02, G);
        int indexOf = format.indexOf(N02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i12 = 0;
        while (i12 < 2) {
            v00 v00Var = this.d;
            TextView textView = i12 == 0 ? v00Var.getTextView() : v00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i12++;
        }
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t7, this.r0)), indexOf, N02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i7 == org.telegram.messenger.ls.G4) {
            d(false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.G2) {
            e(false);
            return;
        }
        int i11 = org.telegram.messenger.ls.I4;
        bh bhVar = this.n;
        if (i7 == i11) {
            if (bhVar != null) {
                if (bhVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.h2 || i7 == org.telegram.messenger.ls.g2 || i7 == org.telegram.messenger.ls.f2 || i7 == org.telegram.messenger.ls.D2) {
            int i12 = this.V;
            if (i12 == 1 || i12 == 3 || i12 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i13 = org.telegram.messenger.ls.v2;
        if (i7 == i13 || i7 == org.telegram.messenger.ls.w2 || i7 == org.telegram.messenger.ls.F2) {
            a(false);
            if (this.V != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i7 == i13) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.E == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.E.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i7 == org.telegram.messenger.ls.C2) {
            b();
            if (this.U && this.V == 4) {
                org.telegram.messenger.t3 groupCall = bhVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.j()) {
                        this.e.b(org.telegram.messenger.hd.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i14 = groupCall2.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.hd.N0(groupCall2.rtmp_stream ? 2131743290 : 2131748421, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.hd.G(i14, groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ls.v1) {
            int i15 = this.V;
            if (i15 == 1 || i15 == 3 || i15 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i7 == org.telegram.messenger.ls.M4) {
            q(true);
            return;
        }
        int i16 = org.telegram.messenger.ls.Q4;
        wc wcVar = this.a;
        if (i7 == i16) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.O0 = 0.0f;
            } else {
                this.O0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.m6.G0().a(Math.max(this.N0, this.O0));
                wcVar.f(Math.max(this.N0, this.O0));
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ls.R4) {
            if (i7 == org.telegram.messenger.ls.e2 && this.V == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.N0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.O0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.m6.G0().a(Math.max(this.N0, this.O0));
            wcVar.f(Math.max(this.N0, this.O0));
        }
        this.c0.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        long j3;
        long j10;
        int i7;
        float f12;
        char c10;
        float f13;
        Path path;
        boolean z12;
        float f14;
        float f15;
        float f16;
        long j11;
        float f17;
        float f18;
        Path path2;
        float f19;
        a10 a10Var;
        float f20;
        org.telegram.messenger.gj gjVar;
        if (this.s == null) {
            return;
        }
        if (!this.S0 || getVisibility() == 0) {
            int i10 = this.V;
            char c11 = 3;
            float f21 = 1.0f;
            if (i10 == 3 || i10 == 1) {
                org.telegram.ui.ActionBar.m6.G0().c(this.Q0);
                this.a.h(this.Q0);
                org.telegram.messenger.g0.L(getStyleHeight());
                b10 G0 = org.telegram.ui.ActionBar.m6.G0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path3 = G0.n;
                Paint paint = G0.m;
                int i11 = 0;
                while (true) {
                    a10[] a10VarArr = G0.a;
                    if (i11 >= a10VarArr.length) {
                        break;
                    }
                    a10 a10Var2 = a10VarArr[i11];
                    int i12 = a10Var2.i;
                    if (i12 == 0) {
                        if (a10Var2.j != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.m, false) || a10Var2.k != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.n, false)) {
                            a10Var2.a();
                        }
                    } else if (i12 == 1) {
                        if (a10Var2.j != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.o, false) || a10Var2.k != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.p, false)) {
                            a10Var2.a();
                        }
                    } else if (i12 == 3 && (a10Var2.j != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.q, false) || a10Var2.k != org.telegram.ui.ActionBar.m6.x0(null, a10Var2.r, false))) {
                        a10Var2.a();
                    }
                    i11++;
                }
                boolean z13 = G0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    a10 a10Var3 = G0.b;
                    if (a10Var3 != null && (a10Var = G0.c) != null) {
                        int i13 = a10Var.i;
                        int i14 = a10Var3.i;
                        if ((i14 == 1 && i13 == 0) || (i13 == 1 && i14 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f10 = 0.0f;
                                f11 = measuredWidth;
                                j3 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f10 = 0.0f;
                                f11 = measuredWidth;
                                j3 = elapsedRealtime - G0.j;
                                G0.j = elapsedRealtime;
                                if (j3 > 20) {
                                    j3 = 17;
                                }
                                if (j3 < 3) {
                                    j10 = j3;
                                    z11 = false;
                                    float f22 = 0.0f;
                                    if (z11) {
                                        float f23 = G0.g;
                                        float f24 = G0.e;
                                        if (f23 != f24) {
                                            float f25 = G0.h;
                                            float f26 = (j10 * f25) + f24;
                                            G0.e = f26;
                                            if (f25 > 0.0f) {
                                                if (f26 > f23) {
                                                    G0.e = f23;
                                                }
                                            } else if (f26 < f23) {
                                                G0.e = f23;
                                            }
                                            invalidate();
                                        }
                                        float f27 = G0.g;
                                        float f28 = G0.f;
                                        if (f27 != f28) {
                                            float f29 = G0.i;
                                            float f30 = (j10 * f29) + f28;
                                            G0.f = f30;
                                            if (f29 > 0.0f) {
                                                if (f30 > f27) {
                                                    G0.f = f27;
                                                }
                                            } else if (f30 < f27) {
                                                G0.f = f27;
                                            }
                                            invalidate();
                                        }
                                        if (G0.c != null) {
                                            float f31 = (j10 / 250.0f) + G0.k;
                                            G0.k = f31;
                                            if (f31 > 1.0f) {
                                                G0.k = 1.0f;
                                                G0.c = null;
                                            }
                                            invalidate();
                                        }
                                    }
                                    i7 = 0;
                                    while (i7 < 2) {
                                        if (i7 == 0 && G0.c == null) {
                                            c10 = c11;
                                            f12 = f21;
                                            j11 = j10;
                                            f19 = f22;
                                            z12 = z10;
                                            f17 = f11;
                                            f18 = f10;
                                            path2 = path3;
                                        } else {
                                            if (i7 == 0) {
                                                f15 = f21 - G0.k;
                                                G0.c.b(paint);
                                                c10 = c11;
                                                f12 = f21;
                                                path = path3;
                                                z12 = z10;
                                                f14 = 0.0f;
                                            } else {
                                                a10 a10Var4 = G0.b;
                                                if (a10Var4 == null) {
                                                    break;
                                                }
                                                f12 = f21;
                                                float f32 = G0.c != null ? G0.k : f12;
                                                if (z11) {
                                                    f14 = 0.0f;
                                                    int i15 = (int) (measuredHeight - f10);
                                                    int i16 = (int) (f11 - 0.0f);
                                                    float f33 = G0.e;
                                                    float f34 = f22;
                                                    Matrix matrix = a10Var4.h;
                                                    int i17 = a10Var4.i;
                                                    if (i17 == 2) {
                                                        f13 = f32;
                                                        path = path3;
                                                        z12 = z10;
                                                        c10 = 3;
                                                    } else {
                                                        float f35 = a10Var4.e;
                                                        if (f35 == f34 || a10Var4.f >= f35) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f13 = f32;
                                                            a10Var4.e = secureRandom.nextInt(700) + 500;
                                                            a10Var4.f = f34;
                                                            if (a10Var4.a == -1.0f) {
                                                                z12 = z10;
                                                                if (i17 == 3) {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    a10Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    a10Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    if (i17 == 0) {
                                                                        a10Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        a10Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        a10Var4.a = com.google.android.gms.internal.vision.e2.c(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        a10Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z12 = z10;
                                                                f16 = 100.0f;
                                                            }
                                                            a10Var4.c = a10Var4.a;
                                                            a10Var4.d = a10Var4.b;
                                                            if (i17 == 3) {
                                                                a10Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.05f, f16, -0.3f);
                                                                a10Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.05f, f16, 0.7f);
                                                            } else if (i17 == 0) {
                                                                a10Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.2f, f16, -0.3f);
                                                                a10Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.3f, f16, 0.7f);
                                                            } else {
                                                                a10Var4.a = com.google.android.gms.internal.vision.e2.c(secureRandom.nextInt(100), f16, 0.2f, 1.1f);
                                                                a10Var4.b = (secureRandom.nextInt(100) * 4.0f) / f16;
                                                            }
                                                        } else {
                                                            f13 = f32;
                                                            path = path3;
                                                            z12 = z10;
                                                        }
                                                        float f36 = j10;
                                                        float f37 = (f36 * 0.02f * f33) + (f36 * f12) + a10Var4.f;
                                                        a10Var4.f = f37;
                                                        float f38 = a10Var4.e;
                                                        if (f37 > f38) {
                                                            a10Var4.f = f38;
                                                        }
                                                        float interpolation = nr.g.getInterpolation(a10Var4.f / f38);
                                                        float f39 = i16;
                                                        float f40 = a10Var4.c;
                                                        float f41 = ((((a10Var4.a - f40) * interpolation) + f40) * f39) - 200.0f;
                                                        float f42 = a10Var4.d;
                                                        float f43 = ((((a10Var4.b - f42) * interpolation) + f42) * i15) - 200.0f;
                                                        c10 = 3;
                                                        float f44 = (f39 / 400.0f) * ((i17 == 0 || i17 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f41, f43);
                                                        matrix.postScale(f44, f44, f41 + 200.0f, f43 + 200.0f);
                                                        a10Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    c10 = c11;
                                                    f13 = f32;
                                                    path = path3;
                                                    z12 = z10;
                                                    f14 = 0.0f;
                                                }
                                                G0.b.b(paint);
                                                f15 = f13;
                                            }
                                            if (i7 == 1 && z12) {
                                                paint.setAlpha(org.telegram.messenger.ls.e4);
                                            } else if (i7 == 1) {
                                                paint.setAlpha((int) (255.0f * f15));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.ls.e4);
                                            }
                                            if (i7 == 1 && z12) {
                                                path.rewind();
                                                f18 = f10;
                                                float f45 = f11;
                                                float f46 = f14;
                                                path2 = path;
                                                path2.addCircle(f11 - org.telegram.messenger.g0.L(18.0f), com.google.android.gms.internal.vision.e2.A(measuredHeight, f18, 2.0f, f18), org.telegram.messenger.f3.A(f45, f46, 1.1f, f15), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f17 = f45;
                                                f19 = 0.0f;
                                                j11 = j10;
                                                canvas.drawRoundRect(f46, f18, f17, measuredHeight, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j11 = j10;
                                                f17 = f11;
                                                f18 = f10;
                                                path2 = path;
                                                f19 = 0.0f;
                                                canvas.drawRoundRect(f14, f18, f17, measuredHeight, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
                                            }
                                        }
                                        i7++;
                                        c11 = c10;
                                        j10 = j11;
                                        f10 = f18;
                                        f11 = f17;
                                        path3 = path2;
                                        f21 = f12;
                                        f22 = f19;
                                        z10 = z12;
                                    }
                                }
                            }
                            j10 = j3;
                            float f222 = 0.0f;
                            if (z11) {
                            }
                            i7 = 0;
                            while (i7 < 2) {
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    j10 = j3;
                    float f2222 = 0.0f;
                    if (z11) {
                    }
                    i7 = 0;
                    while (i7 < 2) {
                    }
                }
                f20 = f21;
                invalidate();
            } else {
                f20 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.V == 0 && (gjVar = MediaController.B().v0) != null) {
                float f47 = -org.telegram.messenger.g0.N(f20);
                float T1 = org.telegram.messenger.g0.T1(f47, org.telegram.messenger.g0.N(f20) + getMeasuredWidth(), gjVar.b0);
                float measuredHeight2 = getMeasuredHeight();
                float N = measuredHeight2 - org.telegram.messenger.g0.N(2.0f);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yl, this.r0);
                Paint paint2 = this.R0;
                paint2.setColor(w02);
                canvas.drawRoundRect(f47, N, T1, measuredHeight2, org.telegram.messenger.g0.N(f20), org.telegram.messenger.g0.N(f20), paint2);
            }
            this.Q0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        fi.c1 c1Var = fi.c1.X;
        h2.f fVar = this.v0;
        int i7 = 6;
        if (c1Var != null) {
            b();
            int i10 = this.V;
            if (6 != i10 && this.f != null && !z10) {
                this.y0 = true;
                return;
            }
            if (6 != i10 && this.U && !z10) {
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                fVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(nr.f);
                this.f.addListener(new s00(this, i7));
                this.f.start();
                return;
            }
            r(6);
            if (this.U) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.w0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(nr.f);
                    this.f.addListener(new s00(this, 7));
                    this.f.start();
                }
                this.U = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.U;
            if (z11 && ((z10 && this.V == -1) || this.V == 6)) {
                this.U = false;
                if (z10) {
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
                    fVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(nr.f);
                    this.f.addListener(new s00(this, 5));
                    this.f.start();
                }
            } else if (z11 && this.V == -1) {
                this.U = false;
                setVisibility(8);
            }
        }
        fi.c1 c1Var2 = fi.c1.X;
        if (c1Var2 == null || this.V != 6) {
            return;
        }
        v00 v00Var = this.d;
        TLRPC.GroupCall groupCall = c1Var2.w;
        v00Var.setText(org.telegram.messenger.hd.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i7;
        TLRPC.User user;
        int i10;
        String format;
        bh bhVar = this.n;
        if (bhVar == null || this.d == null) {
            return;
        }
        b();
        long a10 = bhVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) org.telegram.messenger.rd.f(currentAccount).c.f(a10);
        int i11 = 1;
        if (!this.s0) {
            org.telegram.messenger.rd f10 = org.telegram.messenger.rd.f(currentAccount);
            a0.h hVar = f10.H;
            if (hVar.h(a10) < 0) {
                hVar.k(Boolean.TRUE, a10);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f10.getMessagesController().l1(a10);
                tL_messages_getRecentLocations.limit = 100;
                f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.x4(f10, a10, i11));
            }
            this.s0 = true;
        }
        if (arrayList != null) {
            long e10 = org.telegram.messenger.k10.i(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i10 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long B1 = org.telegram.messenger.gj.B1(message.from_id);
                    if (user == null && B1 != e10) {
                        user = org.telegram.messenger.np.u1(currentAccount).c2(Long.valueOf(B1));
                    }
                    i10++;
                }
            }
            i7 = 0;
        } else {
            i7 = 0;
            user = null;
            i10 = 0;
        }
        if (this.t0 == i10) {
            return;
        }
        this.t0 = i10;
        String N0 = org.telegram.messenger.hd.N0(2131748647, null);
        if (i10 == 0) {
            format = N0;
        } else {
            int i13 = i10 - 1;
            if (!org.telegram.messenger.rd.f(currentAccount).i(a10)) {
                int i14 = i7;
                if (i13 != 0) {
                    String k10 = org.telegram.messenger.p10.k(user, true);
                    String G = org.telegram.messenger.hd.G(i13, "AndOther", new Object[i14]);
                    Object[] objArr = new Object[3];
                    objArr[i14] = N0;
                    objArr[1] = k10;
                    objArr[2] = G;
                    format = String.format("%1$s - %2$s %3$s", objArr);
                } else {
                    String k11 = org.telegram.messenger.p10.k(user, true);
                    Object[] objArr2 = new Object[2];
                    objArr2[i14] = N0;
                    objArr2[1] = k11;
                    format = String.format("%1$s - %2$s", objArr2);
                }
            } else if (i13 == 0) {
                String N02 = org.telegram.messenger.hd.N0(2131752172, null);
                Object[] objArr3 = new Object[2];
                objArr3[i7] = N0;
                objArr3[1] = N02;
                format = String.format("%1$s - %2$s", objArr3);
            } else if (i13 != 1 || user == null) {
                String N03 = org.telegram.messenger.hd.N0(2131752172, null);
                int i15 = i7;
                String G2 = org.telegram.messenger.hd.G(i13, "AndOther", new Object[i15]);
                Object[] objArr4 = new Object[3];
                objArr4[i15] = N0;
                objArr4[1] = N03;
                objArr4[2] = G2;
                format = String.format("%1$s - %2$s %3$s", objArr4);
            } else {
                Object[] objArr5 = new Object[1];
                objArr5[i7] = org.telegram.messenger.p10.k(user, true);
                String a02 = org.telegram.messenger.hd.a0("SharingYouAndOtherName", null, 2131745172, objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i7] = N0;
                objArr6[1] = a02;
                format = String.format("%1$s - %2$s", objArr6);
            }
        }
        if (format.equals(this.W)) {
            return;
        }
        this.W = format;
        int indexOf = format.indexOf(N0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i16 = 0;
        while (i16 < 2) {
            v00 v00Var = this.d;
            TextView textView = i16 == 0 ? v00Var.getTextView() : v00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i16++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t7, this.r0)), indexOf, N0.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z11 = true;
        if (this.U) {
            int i7 = this.V;
            if (i7 == 1 || i7 == 3) {
                return;
            }
            if ((i7 == 4 || i7 == 5) && !j()) {
                return;
            }
        }
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        View fragmentView = this.h.getFragmentView();
        boolean z12 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean z13 = this.U;
        h2.f fVar = this.v0;
        if (gjVar == null || gjVar.e1() == 0 || org.telegram.messenger.gj.L4(gjVar.k)) {
            this.S = null;
            boolean z14 = (!this.b0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || c20.d()) ? false : true;
            boolean z15 = z14;
            z15 = z14;
            if (!j() && !z14) {
                bh bhVar = this.n;
                z15 = z14;
                if (bhVar != null) {
                    z15 = z14;
                    if (!c20.d()) {
                        org.telegram.messenger.t3 groupCall = bhVar.getGroupCall();
                        z15 = groupCall != null && groupCall.y();
                    }
                }
            }
            if (z15) {
                a(false);
                return;
            }
            if (!this.U) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.H;
            if (q0Var != null && q0Var.y()) {
                this.H.V(null, null);
            }
            this.U = false;
            if (z12) {
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
            fVar.d();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            z00 z00Var = this.q0;
            if (z00Var != null) {
                ((jp0) z00Var).b(true);
            }
            this.f.addListener(new s00(this, z11 ? 1 : 0));
            this.f.start();
            return;
        }
        b();
        int i10 = this.V;
        if (i10 != 0 && this.f != null && !z12) {
            this.z0 = true;
            return;
        }
        r(0);
        if (z12 && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            z00 z00Var2 = this.q0;
            if (z00Var2 != null) {
                ((jp0) z00Var2).b(true);
                ((jp0) this.q0).b(false);
            }
        }
        int i11 = 2;
        if (!this.U) {
            if (!z12) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                fVar.d();
                this.f = new AnimatorSet();
                z00 z00Var3 = this.q0;
                if (z00Var3 != null) {
                    ((jp0) z00Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new s00(this, i11));
                this.f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (MediaController.B().H()) {
            this.c.a(false, !z12);
            this.b.setContentDescription(org.telegram.messenger.hd.N0(2131754929, null));
        } else {
            this.c.a(true, !z12);
            this.b.setContentDescription(org.telegram.messenger.hd.N0(2131754930, null));
        }
        if (this.S == gjVar && i10 == 0) {
            return;
        }
        this.S = gjVar;
        if (org.telegram.messenger.gj.R4(gjVar.k) || this.S.h4()) {
            this.a0 = false;
            org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
            if (q0Var2 != null) {
                q0Var2.setAlpha(1.0f);
                this.H.setEnabled(true);
            }
            this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
            spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(gjVar.w1(true), " ", gjVar.y1(true)));
            int i12 = 0;
            while (i12 < 2) {
                v00 v00Var = this.d;
                TextView textView = i12 == 0 ? v00Var.getTextView() : v00Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.a0 = true;
            if (this.H == null) {
                this.d.setPadding(0, 0, this.O, 0);
            } else if (gjVar.L0() >= 600.0d) {
                this.H.setAlpha(1.0f);
                this.H.setEnabled(true);
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                q(false);
            } else {
                this.H.setAlpha(0.0f);
                this.H.setEnabled(false);
                this.d.setPadding(0, 0, this.O, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(gjVar.w1(true), " - ", gjVar.y1(true)));
            int i13 = 0;
            while (i13 < 2) {
                v00 v00Var2 = this.d;
                TextView textView2 = i13 == 0 ? v00Var2.getTextView() : v00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t7, this.r0)), 0, gjVar.w1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z12 && z13 && this.a0);
    }

    public wc getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.V;
    }

    public int getStyleHeight() {
        return this.V == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.T;
    }

    public final void h() {
        if (this.H != null) {
            return;
        }
        Context context = getContext();
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.h6 h6Var = this.r0;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), false, this.r0);
        this.H = q0Var;
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.t6.s(this.H.getIconView(), i7, h6Var, PorterDuff.Mode.SRC_IN);
        }
        this.H.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        int i10 = 0;
        this.H.setLongClickEnabled(false);
        this.H.setVisibility(8);
        this.H.setTag(null);
        this.H.setShowSubmenuByMove(false);
        this.H.setContentDescription(org.telegram.messenger.hd.N0(2131754804, null));
        this.H.setDelegate(new n00(this));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
        pu0 pu0Var = new pu0();
        this.I = pu0Var;
        q0Var2.setIcon(pu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), h6Var);
        this.J = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        this.J.setDrawShadow(true);
        this.J.setOnValueChange(new d(this, 14));
        org.telegram.ui.ActionBar.o0 A = this.H.A(0, R.drawable.msg_speed_slow, org.telegram.messenger.hd.N0(2131745023, null));
        org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
        o0VarArr[0] = A;
        o0VarArr[1] = this.H.A(1, R.drawable.msg_speed_normal, org.telegram.messenger.hd.N0(2131745024, null));
        o0VarArr[2] = this.H.A(2, R.drawable.msg_speed_medium, org.telegram.messenger.hd.N0(2131745025, null));
        o0VarArr[3] = this.H.A(3, R.drawable.msg_speed_fast, org.telegram.messenger.hd.N0(2131745027, null));
        o0VarArr[4] = this.H.A(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.hd.N0(2131745021, null));
        o0VarArr[5] = this.H.A(5, R.drawable.msg_speed_superfast, org.telegram.messenger.hd.N0(2131745022, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            this.H.setPadding(0, 1, 0, 0);
        }
        this.H.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.H, c8.ma.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.H.setOnClickListener(new m8(13, this, fArr));
        this.H.setOnLongClickListener(new q00(this, i10));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i7 = this.V;
        if ((i7 == 3 || i7 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.qd qdVar) {
        if (qdVar != null) {
            org.telegram.ui.ActionBar.g2 g2Var = this.h;
            if (g2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) g2Var.getParentActivity();
                launchActivity.O0(qdVar.h.K1);
                org.telegram.ui.qa0 qa0Var = new org.telegram.ui.qa0(2);
                qa0Var.G0(qdVar.h);
                qa0Var.M0 = new ai.d0(qdVar, org.telegram.messenger.gj.B0(qdVar.h.k), 5);
                launchActivity.t0(qa0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r13 < r12) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r3 = org.telegram.messenger.beta.R.raw.speed_slow;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r13 < 1.0f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float f10, float f11, boolean z10) {
        String a02;
        if (i(f10, f11)) {
            return;
        }
        float abs = Math.abs(f11 - 1.0f);
        int i7 = R.raw.speed_fast;
        if (abs < 0.05f) {
            if (f10 < f11) {
                return;
            }
            a02 = org.telegram.messenger.hd.N0(2131753898, null);
            if (Math.abs(f10 - 2.0f) < 0.05f) {
                i7 = R.raw.speed_2to1;
            }
        } else if (z10 && i(f11, 1.5f) && i(f10, 1.0f)) {
            a02 = org.telegram.messenger.hd.a0("AudioSpeedCustom", null, 2131753900, pu0.a(f11));
            i7 = R.raw.speed_1to15;
        } else if (z10 && i(f11, 2.0f) && i(f10, 1.5f)) {
            a02 = org.telegram.messenger.hd.N0(2131753899, null);
            i7 = R.raw.speed_15to2;
        } else {
            a02 = org.telegram.messenger.hd.a0("AudioSpeedCustom", null, 2131753900, pu0.a(f11));
        }
        lc.b0(this.h).Q(i7, 36, a02).j();
    }

    public final void m() {
        xi.e eVar = this.M0;
        if (eVar != null) {
            eVar.b();
            this.M0 = null;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.hs[] hsVarArr = this.L0;
            org.telegram.messenger.hs hsVar = hsVarArr[i7];
            if (hsVar != null) {
                hsVar.b();
                hsVarArr[i7] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.n nVar = this.P;
        if (nVar == null || nVar.g < 1.0f) {
            this.P0 = true;
        } else {
            this.P0 = false;
            org.telegram.messenger.g0.h3(new r00(this, 0), 150L);
        }
    }

    public final void o(boolean z10) {
        org.telegram.messenger.t3 t3Var;
        int i7;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.c0.a.f) != null) {
            valueAnimator.cancel();
            this.c0.a.f = null;
        }
        d9 d9Var = this.c0.a;
        if (d9Var.f != null) {
            d9Var.g = true;
            return;
        }
        int i10 = this.V;
        int i11 = this.o0;
        bh bhVar = this.n;
        if (i10 == 4) {
            if (bhVar != null) {
                t3Var = bhVar.getGroupCall();
                i11 = this.h.getCurrentAccount();
            } else {
                t3Var = null;
            }
            i7 = i11;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            t3Var = VoIPService.getSharedInstance().groupCall;
            user = bhVar != null ? null : VoIPService.getSharedInstance().getUser();
            i7 = VoIPService.getSharedInstance().getAccount();
        } else {
            t3Var = null;
            i7 = i11;
            user = null;
        }
        if (t3Var != null) {
            ArrayList arrayList = t3Var.e;
            int size = arrayList.size();
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 < size) {
                    this.c0.b(i12, i7, (TLObject) arrayList.get(i12));
                } else {
                    this.c0.b(i12, i7, null);
                }
            }
        } else if (user != null) {
            this.c0.b(0, i7, user);
            for (int i13 = 1; i13 < 3; i13++) {
                this.c0.b(i13, i7, null);
            }
        } else {
            for (int i14 = 0; i14 < 3; i14++) {
                this.c0.b(i14, i7, null);
            }
        }
        this.c0.a(z10);
        if (this.V != 4 || t3Var == null) {
            return;
        }
        int min = t3Var.b.rtmp_stream ? 0 : Math.min(3, t3Var.e.size());
        int v = (min == 0 ? 10 : com.google.android.gms.internal.vision.e2.v(min, 1, 24, 52)) + 3;
        if (z10) {
            int i15 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (org.telegram.messenger.g0.L(v) != i15) {
                float translationX = (this.d.getTranslationX() + i15) - org.telegram.messenger.g0.L(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                nr nrVar = nr.f;
                duration.setInterpolator(nrVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(nrVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = v;
        this.d.setLayoutParams(c8.ma.d(-1, 20.0f, 51, f10, 5.0f, t3Var.j() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(c8.ma.d(-1, 20.0f, 51, f10, 25.0f, t3Var.j() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.p0) {
            xi.e eVar = new xi.e(org.telegram.messenger.ls.e(), this);
            eVar.c(org.telegram.messenger.ls.G4);
            eVar.c(org.telegram.messenger.ls.I4);
            this.M0 = eVar;
            d(true);
        } else {
            for (int i7 = 0; i7 < 4; i7++) {
                xi.e eVar2 = new xi.e(org.telegram.messenger.ls.f(i7), this);
                eVar2.c(org.telegram.messenger.ls.f2);
                eVar2.c(org.telegram.messenger.ls.g2);
                eVar2.c(org.telegram.messenger.ls.h2);
                eVar2.c(org.telegram.messenger.ls.w2);
                eVar2.c(org.telegram.messenger.ls.C2);
                eVar2.c(org.telegram.messenger.ls.v1);
                eVar2.c(org.telegram.messenger.ls.G2);
                eVar2.c(org.telegram.messenger.ls.e2);
                this.L0[i7] = eVar2;
                GroupCallMessagesController.getInstance(i7).subscribeToCallMessages(0L, this);
            }
            xi.e eVar3 = new xi.e(org.telegram.messenger.ls.e(), this);
            eVar3.c(org.telegram.messenger.ls.M4);
            eVar3.c(org.telegram.messenger.ls.v2);
            eVar3.c(org.telegram.messenger.ls.D2);
            eVar3.c(org.telegram.messenger.ls.R4);
            eVar3.c(org.telegram.messenger.ls.Q4);
            eVar3.c(org.telegram.messenger.ls.F2);
            this.M0 = eVar3;
            if (fi.c1.X != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || c20.d()) {
                bh bhVar = this.n;
                if (bhVar != null && this.h.getSendMessagesHelper().B(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar == null || bhVar.getGroupCall() == null || !bhVar.getGroupCall().y() || c20.d() || j()) {
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
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.m6.G0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            wc wcVar = this.a;
            if (!wcVar.u) {
                wcVar.u = true;
                wcVar.t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, wcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.Q != z10 && this.E != null) {
                this.Q = z10;
                this.F.P(z10 ? 15 : 29);
                oh0 oh0Var = this.F;
                oh0Var.N(oh0Var.f - 1, false, true);
                this.E.invalidate();
            }
        } else if (i10 == 4 && !this.m0) {
            this.m0 = true;
            this.n0.run();
        }
        if (this.U && this.T == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        this.N0 = 0.0f;
        this.O0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.Q;
        wc wcVar = this.a;
        if (z11 != z10) {
            this.Q = z10;
            this.F.P(z10 ? 15 : 29);
            oh0 oh0Var = this.F;
            oh0Var.N(oh0Var.f - 1, false, true);
            this.E.invalidate();
            org.telegram.ui.ActionBar.m6.G0().c(this.U);
            wcVar.h(this.U);
        }
        if (this.Q) {
            this.O0 = 0.0f;
            org.telegram.ui.ActionBar.m6.G0().a(0.0f);
            wcVar.f(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.m0) {
            org.telegram.messenger.g0.r(this.n0);
            this.m0 = false;
        }
        this.U = false;
        this.v0.e();
        this.T = 0.0f;
        m();
        if (!this.p0) {
            for (int i7 = 0; i7 < 4; i7++) {
                GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            b10 G0 = org.telegram.ui.ActionBar.m6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            wc wcVar = this.a;
            if (wcVar.u) {
                wcVar.u = false;
                bg.k.d().f(wcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.Q0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.w == null) {
            return;
        }
        int i7 = this.V;
        if ((i7 == 1 || i7 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
            this.W0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.V0.f(new y00(this.w, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i7 = this.W0;
        if (i7 > 0) {
            int i10 = i7 - 1;
            this.W0 = i10;
            if (i10 == 0) {
                this.V0.f(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.t3 t3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i7 = this.V;
            if (i7 == 1 || i7 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.hd.N0(2131743147, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (t3Var = sharedInstance.groupCall) != null) {
                    if (t3Var.e.size() <= 1) {
                        this.d.b(org.telegram.messenger.hd.N0(2131751811, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.n5.s(sharedInstance.getAccount(), org.telegram.messenger.n5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.hd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                bh bhVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (bhVar == null || bhVar.j() == null || bhVar.j().id != user.id) {
                            this.d.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(org.telegram.messenger.hd.N0(2131745850, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (bhVar == null || bhVar.g() == null || bhVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = bhVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(org.telegram.messenger.hd.N0(2131743203, null), false);
                } else if (org.telegram.messenger.v3.W(g10)) {
                    this.d.b(org.telegram.messenger.hd.N0(2131743203, null), false);
                } else {
                    this.d.b(org.telegram.messenger.hd.N0(2131743062, null), false);
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.I == null) {
            return;
        }
        float C = MediaController.B().C(this.a0);
        this.I.b(z10, C);
        updateColors();
        boolean z11 = this.B0;
        int i7 = 0;
        this.B0 = false;
        while (true) {
            org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
            if (i7 >= o0VarArr.length) {
                this.J.e(z10, C);
                return;
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.r0;
            if (z11 || Math.abs(C - X0[i7]) >= 0.05f) {
                org.telegram.ui.ActionBar.o0 o0Var = o0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.m6.E8;
                o0Var.a(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            } else {
                org.telegram.ui.ActionBar.o0 o0Var2 = o0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.m6.Hi;
                o0Var2.a(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            }
            i7++;
        }
    }

    public final void r(int i7) {
        if (this.V == i7) {
            return;
        }
        b();
        int i10 = this.V;
        wc wcVar = this.a;
        if (i10 == 3 || i10 == 1) {
            b10 G0 = org.telegram.ui.ActionBar.m6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            if (wcVar.u) {
                wcVar.u = false;
                bg.k.d().f(wcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            te.j jVar = this.V0;
            if (jVar != null) {
                jVar.f(null, true);
            }
        }
        this.V = i7;
        this.s.setWillNotDraw(i7 != 4);
        if (i7 != 4) {
            this.i0 = false;
        }
        e9 e9Var = this.c0;
        if (e9Var != null) {
            e9Var.setStyle(this.V);
            this.c0.setLayoutParams(c8.ma.e(org.telegram.messenger.ls.t1, getStyleHeight(), 51));
        }
        this.s.setLayoutParams(c8.ma.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.T;
        if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.r0;
        if (i7 == 6) {
            this.x.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            this.s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.el, h6Var), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.fl, h6Var)}));
            this.s.setTag(null);
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.E.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.c0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.A7));
            int i11 = 0;
            while (i11 < 2) {
                v00 v00Var = this.d;
                TextView textView = i11 == 0 ? v00Var.getTextView() : v00Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A7, h6Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 15.0f);
                }
                i11++;
            }
            this.d.setLayoutParams(c8.ma.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i7 == 5) {
            this.x.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.v7));
            int i12 = 0;
            while (i12 < 2) {
                v00 v00Var2 = this.d;
                TextView textView2 = i12 == 0 ? v00Var2.getTextView() : v00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.u7, h6Var);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.u7));
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.E.setVisibility(8);
            this.c0.setVisibility(8);
            this.y.setVisibility(0);
            this.y.d();
            this.G.setContentDescription(org.telegram.messenger.hd.N0(2131754900, null));
            org.telegram.ui.ActionBar.q0 q0Var = this.H;
            if (q0Var != null) {
                q0Var.setVisibility(8);
                this.H.setTag(null);
            }
            this.d.setLayoutParams(c8.ma.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i7 == 0 || i7 == 2) {
            this.x.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.v7));
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.G.setVisibility(0);
            this.b.setVisibility(0);
            this.E.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.c0.setVisibility(8);
            int i13 = 0;
            while (i13 < 2) {
                v00 v00Var3 = this.d;
                TextView textView3 = i13 == 0 ? v00Var3.getTextView() : v00Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.u7, h6Var);
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.u7));
            if (i7 == 6) {
                this.b.setLayoutParams(c8.ma.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(c8.ma.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.G.setVisibility(8);
                return;
            } else {
                if (i7 != 0) {
                    this.b.setLayoutParams(c8.ma.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ma.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setContentDescription(org.telegram.messenger.hd.N0(2131754754, null));
                    return;
                }
                this.b.setLayoutParams(c8.ma.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(c8.ma.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(0);
                    this.H.setTag(1);
                }
                this.G.setContentDescription(org.telegram.messenger.hd.N0(2131754900, null));
                return;
            }
        }
        if (i7 == 4) {
            this.x.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.v7));
            this.E.setVisibility(8);
            this.e.setVisibility(0);
            int i14 = 0;
            while (i14 < 2) {
                v00 v00Var4 = this.d;
                TextView textView4 = i14 == 0 ? v00Var4.getTextView() : v00Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.t7, h6Var);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.t7));
            this.d.setPadding(0, 0, this.O, 0);
            this.y.setVisibility(8);
            this.y.i();
            bh bhVar = this.n;
            this.c0.setVisibility(!((bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().b == null || !bhVar.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.c0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                this.e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
            }
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.q0 q0Var3 = this.H;
            if (q0Var3 != null) {
                q0Var3.setVisibility(8);
                this.H.setTag(null);
                return;
            }
            return;
        }
        if (i7 == 1 || i7 == 3) {
            this.x.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.c0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i7 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.c0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.E.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.Q = z10;
            this.F.P(z10 ? 15 : 29);
            oh0 oh0Var = this.F;
            oh0Var.N(oh0Var.f - 1, false, true);
            this.E.invalidate();
            this.s.setBackground(null);
            this.s.setBackgroundColor(0);
            this.y.setVisibility(8);
            this.y.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.m6.G0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!wcVar.u) {
                wcVar.u = true;
                wcVar.t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, wcVar.F);
            }
            invalidate();
            int i15 = 0;
            while (i15 < 2) {
                v00 v00Var5 = this.d;
                TextView textView5 = i15 == 0 ? v00Var5.getTextView() : v00Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    org.telegram.ui.ActionBar.t6.U(textView5, org.telegram.ui.ActionBar.m6.A7, h6Var);
                    textView5.setTypeface(org.telegram.messenger.g0.o());
                    textView5.setTextSize(1, 14.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.m6.A7));
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.d.setLayoutParams(c8.ma.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.O, 0);
            org.telegram.ui.ActionBar.q0 q0Var4 = this.H;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
                this.H.setTag(null);
            }
        }
    }

    public void setDelegate(z00 z00Var) {
        this.q0 = z00Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.S0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.s == null) {
            this.U0 = f10;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        rh0 rh0Var = this.y;
        if (rh0Var != null) {
            rh0Var.setTranslationX(f10);
        }
        v00 v00Var = this.d;
        if (v00Var != null) {
            v00Var.setTranslationX(f10);
        }
        v00 v00Var2 = this.e;
        if (v00Var2 != null) {
            v00Var2.setTranslationX(f10);
        }
        e9 e9Var = this.c0;
        if (e9Var != null) {
            e9Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.D0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.b0 = z10;
    }

    public void setTopPadding(float f10) {
        this.T = f10;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        setTopPadding(this.T);
        if (i7 == 8) {
            this.Q0 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        l41[] l41VarArr;
        wc wcVar = this.a;
        int i7 = wcVar.A;
        if (i7 >= 0) {
            wcVar.E = 1.0f;
            wcVar.a(wc.e(i7));
        }
        int i10 = !i(MediaController.B().C(this.a0), 1.0f) ? org.telegram.ui.ActionBar.m6.Hi : org.telegram.ui.ActionBar.m6.x7;
        org.telegram.ui.ActionBar.h6 h6Var = this.r0;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        pu0 pu0Var = this.I;
        if (pu0Var != null) {
            pu0Var.a.u(w02);
            Paint paint = pu0Var.b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.H;
        if (q0Var != null) {
            Drawable background = q0Var.getBackground();
            if (background == null || background != this.F0) {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.F0 = h02;
                q0Var2.setBackground(h02);
                this.K0 = w02;
            } else if (w02 != this.K0) {
                this.K0 = w02;
                org.telegram.ui.ActionBar.m6.H1(background, w02 & 436207615, true);
            }
        }
        if (this.b != null) {
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.w7, h6Var);
            if (this.G0 == null || w03 != this.I0) {
                ImageView imageView = this.b;
                this.I0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.G != null) {
            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.x7, h6Var);
            if (this.H0 == null || w04 != this.J0) {
                ImageView imageView2 = this.G;
                this.J0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.H0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                v00 v00Var = this.e;
                TextView textView = i11 == 0 ? v00Var.getTextView() : v00Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.x7, h6Var));
                }
                i11++;
            }
        }
        v00 v00Var2 = this.d;
        if (v00Var2 != null) {
            Object tag = v00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    v00 v00Var3 = this.d;
                    TextView textView2 = i12 == 0 ? v00Var3.getTextView() : v00Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(intValue, h6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (l41VarArr = (l41[]) ((Spanned) text).getSpans(0, text.length(), l41.class)) != null) {
                            for (l41 l41Var : l41VarArr) {
                                l41Var.b = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.t7, h6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.g2 g2Var, View view, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = new wc();
        this.K = new org.telegram.ui.ActionBar.o0[6];
        this.R = -1;
        this.V = -1;
        this.b0 = true;
        this.k0 = new n6(false, true, true);
        this.n0 = new t00(this);
        this.o0 = org.telegram.messenger.k10.t0;
        this.t0 = -1;
        this.u0 = new ik(this, 7);
        this.v0 = new h2.f((int[]) null);
        this.w0 = new h2.f(new int[]{org.telegram.messenger.ls.D});
        this.L0 = new org.telegram.messenger.hs[4];
        this.R0 = new Paint(1);
        this.T0 = 0;
        this.V0 = new te.j(new n00(this), nr.h, 450L);
        this.W0 = 0;
        this.r0 = h6Var;
        this.h = g2Var;
        if (g2Var instanceof bh) {
            this.n = (bh) g2Var;
        }
        this.r = view;
        this.U = true;
        this.p0 = z10;
        if (view == null) {
            ((ViewGroup) g2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
