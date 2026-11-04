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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.cs, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.z5 {
    public static final float[] X0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public boolean B0;
    public gi.l3 C0;
    public ViewGroup D0;
    public g00 E;
    public long E0;
    public ch0 F;
    public org.telegram.ui.Cells.y F0;
    public ImageView G;
    public PorterDuffColorFilter G0;
    public org.telegram.ui.ActionBar.q0 H;
    public PorterDuffColorFilter H0;
    public cu0 I;
    public int I0;
    public org.telegram.ui.ActionBar.u0 J;
    public int J0;
    public final org.telegram.ui.ActionBar.o0[] K;
    public int K0;
    public FrameLayout L;
    public final org.telegram.messenger.ds[] L0;
    public ImageView M;
    public za.p M0;
    public org.telegram.ui.ActionBar.k2 N;
    public float N0;
    public int O;
    public float O0;
    public org.telegram.ui.Components.voip.g P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public final Paint R0;
    public org.telegram.messenger.zi S;
    public boolean S0;
    public float T;
    public int T0;
    public boolean U;
    public float U0;
    public int V;
    public final qe.j V0;
    public String W;
    public int W0;
    public final qc a;
    public boolean a0;
    public ImageView b;
    public boolean b0;
    public je0 c;
    public x8 c0;
    public e00 d;
    public Paint d0;
    public e00 e;
    public LinearGradient e0;
    public AnimatorSet f;
    public Matrix f0;
    public int g0;
    public final org.telegram.ui.ActionBar.d2 h;
    public TextPaint h0;
    public boolean i0;
    public boolean j0;
    public final g6 k0;
    public gc l0;
    public boolean m0;
    public final ig n;
    public final c00 n0;
    public final int o0;
    public final boolean p0;
    public i00 q0;
    public final View r;
    public final org.telegram.ui.ActionBar.e6 r0;
    public d00 s;
    public boolean s0;
    public int t0;
    public final lt u0;
    public final g2.g v0;
    public ai.d2 w;
    public final g2.g w0;
    public View x;
    public boolean x0;
    public fh0 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.uw uwVar, boolean z10) {
        this(context, uwVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i3 = this.V;
        org.telegram.ui.ActionBar.e6 e6Var = this.r0;
        return i3 == 4 ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, e6Var) : (i3 == 1 || i3 == 3) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A7, e6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.u7, e6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static boolean j() {
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        return ziVar != null && org.telegram.messenger.zi.S4(ziVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.r3 groupCall;
        org.telegram.messenger.r3 r3Var;
        int i3;
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.U && this.V == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        View fragmentView = d2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c2 = l10.c();
        ig igVar = this.n;
        if (c2) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.x30.w5 || !this.b0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (r3Var = sharedInstance.groupCall) != null && (r3Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (j() || org.telegram.ui.x30.w5 || !this.b0 || z11 || igVar == null || (groupCall = igVar.getGroupCall()) == null || !groupCall.y()) {
                z12 = false;
                g2.g gVar = this.v0;
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
                            gVar.d();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(xq.f);
                            this.f.addListener(new b00(this, i11));
                            this.f.start();
                        }
                    } else if (z14 && ((i3 = this.V) == -1 || i3 == 4 || i3 == 3 || i3 == 1)) {
                        this.U = false;
                        setVisibility(8);
                    }
                    if (!z13 || igVar == null || !igVar.J() || l10.c()) {
                        return;
                    }
                    org.telegram.messenger.k5.o(null, 2131749160, fc.a0(d2Var), R.raw.linkbroken, 36);
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
                    gVar.d();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new b00(this, 9));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.U;
                    r(4);
                    org.telegram.messenger.r3 groupCall2 = igVar.getGroupCall();
                    TLRPC.Chat g7 = igVar.g();
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
                        org.telegram.messenger.bd.M0(2131743450, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.j0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.N.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (org.telegram.messenger.t3.W(g7)) {
                            this.d.b(org.telegram.messenger.bd.M0(2131743471, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.bd.M0(2131743350, null), false);
                        }
                        this.e.b(org.telegram.messenger.bd.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.m0) {
                            this.m0 = true;
                            this.n0.run();
                        }
                    } else {
                        this.i0 = false;
                        this.N.setVisibility(0);
                        this.N.setText(org.telegram.messenger.bd.M0(2131743452, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(org.telegram.messenger.bd.M0(2131743457, null), false);
                        } else if (org.telegram.messenger.t3.W(g7)) {
                            this.d.b(org.telegram.messenger.bd.M0(2131743457, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.bd.M0(2131743316, null), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.bd.M0(groupCall4.rtmp_stream ? 2131743545 : 2131748622, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.bd.G(i14, groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
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
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new b00(this, 10));
                    this.f.start();
                }
                this.U = true;
                setVisibility(0);
                return;
            }
            z11 = true;
        }
        z12 = z11;
        g2.g gVar2 = this.v0;
        int i112 = 8;
        if (z11) {
        }
    }

    public final void b() {
        if (this.s != null) {
            return;
        }
        Context context = getContext();
        d00 d00Var = new d00(this, context);
        this.s = d00Var;
        this.l0 = new gc(d00Var);
        int i3 = org.telegram.messenger.g0.q.x;
        g6 g6Var = this.k0;
        g6Var.M = i3;
        g6Var.A = 0.4f;
        g6Var.setCallback(d00Var);
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        addView(this.s, b8.mf.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.x = view;
        this.s.addView(view, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i10 = org.telegram.ui.ActionBar.k6.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.r0;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, mode);
        ImageView imageView3 = this.b;
        int i11 = 16;
        je0 je0Var = new je0(16);
        this.c = je0Var;
        imageView3.setImageDrawable(je0Var);
        final int i12 = 1;
        this.b.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.b, b8.mf.e(36, 36, 51));
        final int i13 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xz
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i14;
                long j10;
                TL_stories.StoryItem u10;
                int i15 = i13;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i15) {
                    case 0:
                        ig igVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        ig igVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.V;
                        if (i16 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.b;
                                int i17 = g1Var.e;
                                if (i17 != org.telegram.messenger.h10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i17).P1().u(g1Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i17).O(i17, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.zi.B0(ziVar.k) == (igVar2 != null ? igVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ziVar.f1());
                                    d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i18 = org.telegram.messenger.h10.t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i14 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!org.telegram.messenger.ld.f(i19).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i19).J.get(0);
                                            j10 = kdVar.a;
                                            i14 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i14 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i14).h(j10));
                                break;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                                if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                    h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                    h30Var.I0 = new p0(fragmentContextView, 7);
                                    d2Var2.showDialog(h30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        fh0 fh0Var = new fh0(context);
        this.y = fh0Var;
        fh0Var.setScaleType(scaleType);
        this.y.setAutoRepeat(true);
        this.y.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.r6.C(this.y, org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var)), org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        addView(this.y, b8.mf.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final int i14 = 0;
        e00 e00Var = new e00(this, context, context, i14);
        this.d = e00Var;
        addView(e00Var, b8.mf.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        e00 e00Var2 = new e00(this, context, context, i12);
        this.e = e00Var2;
        addView(e00Var2, b8.mf.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.P = gVar;
        gVar.g = 1.0f;
        gVar.j = false;
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(2, context, this);
        this.N = k2Var;
        k2Var.setText(org.telegram.messenger.bd.M0(2131743452, null));
        org.telegram.ui.ActionBar.r6.V(this.N, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        org.telegram.ui.ActionBar.k2 k2Var2 = this.N;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i15 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
        int i16 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
        org.telegram.ui.ActionBar.r6.R(k2Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i15), org.telegram.ui.ActionBar.r6.N(i16), e6Var);
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(org.telegram.messenger.g0.o());
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.N, b8.mf.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i17 = 3;
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xz
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i17;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        ig igVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        ig igVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        if (i162 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.b;
                                int i172 = g1Var.e;
                                if (i172 != org.telegram.messenger.h10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i172).P1().u(g1Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).O(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.zi.B0(ziVar.k) == (igVar2 != null ? igVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ziVar.f1());
                                    d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i18 = org.telegram.messenger.h10.t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i142 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!org.telegram.messenger.ld.f(i19).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i19).J.get(0);
                                            j10 = kdVar.a;
                                            i142 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i142).h(j10));
                                break;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                                if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                    h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                    h30Var.I0 = new p0(fragmentContextView, 7);
                                    d2Var2.showDialog(h30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        int i18 = org.telegram.ui.ActionBar.k6.x7;
        org.telegram.ui.ActionBar.r6.t(imageView5, i18, e6Var, mode);
        this.L.addView(this.M, b8.mf.e(20, 20, 17));
        this.L.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.L.setContentDescription(org.telegram.messenger.bd.M0(2131743859, null));
        this.L.setOnClickListener(new ai.t(i11));
        this.L.setVisibility(8);
        addView(this.L, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.p0) {
            h();
        }
        x8 x8Var = new x8(context, false);
        this.c0 = x8Var;
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.c0.setDelegate(new a00(this, 1));
        this.c0.setVisibility(8);
        addView(this.c0, b8.mf.e(org.telegram.messenger.hs.t1, 36, 51));
        this.F = new ch0(R.raw.voice_muted, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        g00 g00Var = new g00(this, context);
        this.E = g00Var;
        org.telegram.ui.ActionBar.r6.t(g00Var, org.telegram.ui.ActionBar.k6.A7, e6Var, PorterDuff.Mode.SRC_IN);
        this.E.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.E.setAnimation(this.F);
        this.E.setScaleType(scaleType);
        this.E.setVisibility(8);
        addView(this.E, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i19 = 4;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xz
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i19;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        ig igVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        ig igVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        if (i162 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.b;
                                int i172 = g1Var.e;
                                if (i172 != org.telegram.messenger.h10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i172).P1().u(g1Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).O(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.zi.B0(ziVar.k) == (igVar2 != null ? igVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ziVar.f1());
                                    d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.h10.t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i142 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.ld.f(i192).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i192).J.get(0);
                                            j10 = kdVar.a;
                                            i142 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i142).h(j10));
                                break;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                                if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                    h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                    h30Var.I0 = new p0(fragmentContextView, 7);
                                    d2Var2.showDialog(h30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        org.telegram.ui.ActionBar.r6.t(this.G, i18, e6Var, mode);
        this.G.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i18, e6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.G.setScaleType(scaleType);
        addView(this.G, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xz
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i14;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        ig igVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            if (d2Var instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        ig igVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        if (i162 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.b;
                                int i172 = g1Var.e;
                                if (i172 != org.telegram.messenger.h10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i172).P1().u(g1Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).O(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (d2Var2 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.zi.B0(ziVar.k) == (igVar2 != null ? igVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ziVar.f1());
                                    d2Var2.presentFragment(new org.telegram.ui.wm(bundle), d2Var2 instanceof org.telegram.ui.wm);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.h10.t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i142 = d2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.ld.f(i192).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i192).J.get(0);
                                            j10 = kdVar.a;
                                            i142 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i142).h(j10));
                                break;
                            } else {
                                d2Var2.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (d2Var2.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = d2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var2.getParentActivity(), d2Var2, d2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var2;
                                if (d2Var2.getSendMessagesHelper().B(wmVar.a()) != null) {
                                    h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                    h30Var.I0 = new p0(fragmentContextView, 7);
                                    d2Var2.showDialog(h30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        ai.d2 d2Var = new ai.d2(getContext(), 16);
        this.w = d2Var;
        addView(d2Var, b8.mf.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xz
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i12;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        ig igVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var2 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var2 = fragmentContextView.h;
                        if (fragmentContextView.V == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d2Var2.getParentActivity(), e6Var2);
                            String M0 = org.telegram.messenger.bd.M0(2131744845, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            s1Var.S = M0;
                            if (d2Var2 instanceof org.telegram.ui.uw) {
                                s1Var.U = org.telegram.messenger.bd.M0(2131744847, null);
                            } else {
                                TLRPC.Chat g7 = igVar.g();
                                TLRPC.User j11 = igVar.j();
                                if (g7 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToGroupText", null, 2131744846, g7.title));
                                } else if (j11 != null) {
                                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StopLiveLocationAlertToUserText", null, 2131744844, org.telegram.messenger.l10.j(j11, true)));
                                } else {
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131744851, null), new wz(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, e6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        ig igVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.e6 e6Var3 = fragmentContextView.r0;
                        org.telegram.ui.ActionBar.d2 d2Var22 = fragmentContextView.h;
                        int i162 = fragmentContextView.V;
                        if (i162 == 6) {
                            ei.g1 g1Var = ei.g1.X;
                            if (g1Var != null) {
                                long j12 = g1Var.b;
                                int i172 = g1Var.e;
                                if (i172 != org.telegram.messenger.h10.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.hp.s1(i172).P1().u(g1Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).O(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.zi ziVar = MediaController.B().v0;
                            if (d2Var22 != null && ziVar != null) {
                                if (ziVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new z7(W, e6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.K1)) {
                                        new z7(LaunchActivity.K1, e6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.zi.B0(ziVar.k) == (igVar2 != null ? igVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ziVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ziVar.f1());
                                    d2Var22.presentFragment(new org.telegram.ui.wm(bundle), d2Var22 instanceof org.telegram.ui.wm);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.h10.t0;
                            if (igVar2 != null) {
                                j10 = igVar2.a();
                                i142 = d2Var22.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.ld.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.ld.f(i192).J.isEmpty()) {
                                            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) org.telegram.messenger.ld.f(i192).J.get(0);
                                            j10 = kdVar.a;
                                            i142 = kdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.ld.f(i142).h(j10));
                                break;
                            } else {
                                d2Var22.showDialog(new zs0(fragmentContextView.getContext(), new wz(fragmentContextView), e6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (d2Var22.getParentActivity() != null && (groupCall = igVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = d2Var22.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.n1.l(M02, null, false, Boolean.valueOf(z10), d2Var22.getParentActivity(), d2Var22, d2Var22.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var22;
                                if (d2Var22.getSendMessagesHelper().B(wmVar.a()) != null) {
                                    h30 h30Var = new h30(fragmentContextView.getContext(), null, wmVar, e6Var3);
                                    h30Var.I0 = new p0(fragmentContextView, 7);
                                    d2Var22.showDialog(h30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.x30.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
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
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        int i3;
        ig igVar = this.n;
        if (igVar != null) {
            int i10 = 3;
            if (this.U && ((i3 = this.V) == 1 || i3 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.d2 d2Var = this.h;
            org.telegram.messenger.py B = d2Var.getSendMessagesHelper().B(igVar.a());
            View fragmentView = d2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = d2Var.getVisibleDialog();
            if ((j() || igVar.q() || ((visibleDialog instanceof h30) && !((h30) visibleDialog).J)) && B != null) {
                B = null;
            }
            g2.g gVar = this.v0;
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
                gVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(xq.f);
                this.f.addListener(new b00(this, i10));
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
                i00 i00Var = this.q0;
                if (i00Var != null) {
                    ((wo0) i00Var).b(true);
                    ((wo0) this.q0).b(false);
                }
            }
            if (!this.U) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    gVar.d();
                    this.f = new AnimatorSet();
                    i00 i00Var2 = this.q0;
                    if (i00Var2 != null) {
                        ((wo0) i00Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new b00(this, 4));
                    this.f.start();
                }
                this.U = true;
                setVisibility(0);
            }
            int i12 = this.R;
            int i13 = B.l;
            if (i12 != i13) {
                this.R = i13;
                this.d.b(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("ImportUploading", null, 2131749230, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String G;
        String M0;
        org.telegram.ui.ActionBar.d2 d2Var = this.h;
        View fragmentView = d2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = d2Var instanceof org.telegram.ui.uw;
        int i3 = 0;
        boolean i10 = z11 ? org.telegram.messenger.ld.g() != 0 : org.telegram.messenger.ld.f(d2Var.getCurrentAccount()).i(this.n.a());
        lt ltVar = this.u0;
        if (!i10) {
            this.t0 = -1;
            org.telegram.messenger.g0.r(ltVar);
            if (this.U) {
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
                this.f.addListener(new b00(this, 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new po0(getContext(), 1));
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
                this.f.addListener(new b00(this, i3));
                this.f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (!z11) {
            ltVar.run();
            f();
            return;
        }
        String M02 = org.telegram.messenger.bd.M0(2131748848, null);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.addAll(org.telegram.messenger.ld.f(i11).J);
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.kd kdVar = (org.telegram.messenger.kd) arrayList.get(0);
            long B0 = org.telegram.messenger.zi.B0(kdVar.h.k);
            if (org.telegram.messenger.m5.E(B0)) {
                G = org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(kdVar.h.I1).a2(Long.valueOf(B0)), true);
                M0 = org.telegram.messenger.bd.M0(2131753965, null);
            } else {
                TLRPC.Chat M03 = org.telegram.messenger.hp.s1(kdVar.h.I1).M0(Long.valueOf(-B0));
                G = M03 != null ? M03.title : "";
                M0 = org.telegram.messenger.bd.M0(2131753964, null);
            }
        } else {
            G = org.telegram.messenger.bd.G(arrayList.size(), "Chats", new Object[0]);
            M0 = org.telegram.messenger.bd.M0(2131753963, null);
        }
        String format = String.format(M0, M02, G);
        int indexOf = format.indexOf(M02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i12 = 0;
        while (i12 < 2) {
            e00 e00Var = this.d;
            TextView textView = i12 == 0 ? e00Var.getTextView() : e00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i12++;
        }
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.r0)), indexOf, M02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i3 == org.telegram.messenger.hs.D4) {
            d(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.G2) {
            e(false);
            return;
        }
        int i11 = org.telegram.messenger.hs.F4;
        ig igVar = this.n;
        if (i3 == i11) {
            if (igVar != null) {
                if (igVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.h2 || i3 == org.telegram.messenger.hs.g2 || i3 == org.telegram.messenger.hs.f2 || i3 == org.telegram.messenger.hs.D2) {
            int i12 = this.V;
            if (i12 == 1 || i12 == 3 || i12 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i13 = org.telegram.messenger.hs.v2;
        if (i3 == i13 || i3 == org.telegram.messenger.hs.w2 || i3 == org.telegram.messenger.hs.F2) {
            a(false);
            if (this.V != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i3 == i13) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.E == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.E.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i3 == org.telegram.messenger.hs.C2) {
            b();
            if (this.U && this.V == 4) {
                org.telegram.messenger.r3 groupCall = igVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.j()) {
                        this.e.b(org.telegram.messenger.bd.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i14 = groupCall2.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.bd.M0(groupCall2.rtmp_stream ? 2131743545 : 2131748622, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.bd.G(i14, groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.v1) {
            int i15 = this.V;
            if (i15 == 1 || i15 == 3 || i15 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i3 == org.telegram.messenger.hs.J4) {
            q(true);
            return;
        }
        int i16 = org.telegram.messenger.hs.N4;
        qc qcVar = this.a;
        if (i3 == i16) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.O0 = 0.0f;
            } else {
                this.O0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.N0, this.O0));
                qcVar.f(Math.max(this.N0, this.O0));
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.O4) {
            if (i3 == org.telegram.messenger.hs.e2 && this.V == 0) {
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
            org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.N0, this.O0));
            qcVar.f(Math.max(this.N0, this.O0));
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
        long j10;
        long j11;
        int i3;
        float f12;
        char c2;
        float f13;
        Path path;
        boolean z12;
        float f14;
        float f15;
        float f16;
        long j12;
        float f17;
        float f18;
        Path path2;
        float f19;
        j00 j00Var;
        float f20;
        org.telegram.messenger.zi ziVar;
        if (this.s == null) {
            return;
        }
        if (!this.S0 || getVisibility() == 0) {
            int i10 = this.V;
            char c10 = 3;
            float f21 = 1.0f;
            if (i10 == 3 || i10 == 1) {
                org.telegram.ui.ActionBar.k6.G0().c(this.Q0);
                this.a.h(this.Q0);
                org.telegram.messenger.g0.L(getStyleHeight());
                k00 G0 = org.telegram.ui.ActionBar.k6.G0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path3 = G0.n;
                Paint paint = G0.m;
                int i11 = 0;
                while (true) {
                    j00[] j00VarArr = G0.a;
                    if (i11 >= j00VarArr.length) {
                        break;
                    }
                    j00 j00Var2 = j00VarArr[i11];
                    int i12 = j00Var2.i;
                    if (i12 == 0) {
                        if (j00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.m, false) || j00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.n, false)) {
                            j00Var2.a();
                        }
                    } else if (i12 == 1) {
                        if (j00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.o, false) || j00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.p, false)) {
                            j00Var2.a();
                        }
                    } else if (i12 == 3 && (j00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.q, false) || j00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, j00Var2.r, false))) {
                        j00Var2.a();
                    }
                    i11++;
                }
                boolean z13 = G0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    j00 j00Var3 = G0.b;
                    if (j00Var3 != null && (j00Var = G0.c) != null) {
                        int i13 = j00Var.i;
                        int i14 = j00Var3.i;
                        if ((i14 == 1 && i13 == 0) || (i13 == 1 && i14 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f10 = 0.0f;
                                f11 = measuredWidth;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f10 = 0.0f;
                                f11 = measuredWidth;
                                j10 = elapsedRealtime - G0.j;
                                G0.j = elapsedRealtime;
                                if (j10 > 20) {
                                    j10 = 17;
                                }
                                if (j10 < 3) {
                                    j11 = j10;
                                    z11 = false;
                                    float f22 = 0.0f;
                                    if (z11) {
                                        float f23 = G0.g;
                                        float f24 = G0.e;
                                        if (f23 != f24) {
                                            float f25 = G0.h;
                                            float f26 = (j11 * f25) + f24;
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
                                            float f30 = (j11 * f29) + f28;
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
                                            float f31 = (j11 / 250.0f) + G0.k;
                                            G0.k = f31;
                                            if (f31 > 1.0f) {
                                                G0.k = 1.0f;
                                                G0.c = null;
                                            }
                                            invalidate();
                                        }
                                    }
                                    i3 = 0;
                                    while (i3 < 2) {
                                        if (i3 == 0 && G0.c == null) {
                                            c2 = c10;
                                            f12 = f21;
                                            j12 = j11;
                                            f19 = f22;
                                            z12 = z10;
                                            f17 = f11;
                                            f18 = f10;
                                            path2 = path3;
                                        } else {
                                            if (i3 == 0) {
                                                f15 = f21 - G0.k;
                                                G0.c.b(paint);
                                                c2 = c10;
                                                f12 = f21;
                                                path = path3;
                                                z12 = z10;
                                                f14 = 0.0f;
                                            } else {
                                                j00 j00Var4 = G0.b;
                                                if (j00Var4 == null) {
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
                                                    Matrix matrix = j00Var4.h;
                                                    int i17 = j00Var4.i;
                                                    if (i17 == 2) {
                                                        f13 = f32;
                                                        path = path3;
                                                        z12 = z10;
                                                        c2 = 3;
                                                    } else {
                                                        float f35 = j00Var4.e;
                                                        if (f35 == f34 || j00Var4.f >= f35) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f13 = f32;
                                                            j00Var4.e = secureRandom.nextInt(700) + 500;
                                                            j00Var4.f = f34;
                                                            if (j00Var4.a == -1.0f) {
                                                                z12 = z10;
                                                                if (i17 == 3) {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    j00Var4.a = a1.g.e(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    j00Var4.b = a1.g.e(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    if (i17 == 0) {
                                                                        j00Var4.a = a1.g.e(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        j00Var4.b = a1.g.e(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        j00Var4.a = a1.g.A(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        j00Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z12 = z10;
                                                                f16 = 100.0f;
                                                            }
                                                            j00Var4.c = j00Var4.a;
                                                            j00Var4.d = j00Var4.b;
                                                            if (i17 == 3) {
                                                                j00Var4.a = a1.g.e(secureRandom.nextInt(100), 0.05f, f16, -0.3f);
                                                                j00Var4.b = a1.g.e(secureRandom.nextInt(100), 0.05f, f16, 0.7f);
                                                            } else if (i17 == 0) {
                                                                j00Var4.a = a1.g.e(secureRandom.nextInt(100), 0.2f, f16, -0.3f);
                                                                j00Var4.b = a1.g.e(secureRandom.nextInt(100), 0.3f, f16, 0.7f);
                                                            } else {
                                                                j00Var4.a = a1.g.A(secureRandom.nextInt(100), f16, 0.2f, 1.1f);
                                                                j00Var4.b = (secureRandom.nextInt(100) * 4.0f) / f16;
                                                            }
                                                        } else {
                                                            f13 = f32;
                                                            path = path3;
                                                            z12 = z10;
                                                        }
                                                        float f36 = j11;
                                                        float f37 = (f36 * 0.02f * f33) + (f36 * f12) + j00Var4.f;
                                                        j00Var4.f = f37;
                                                        float f38 = j00Var4.e;
                                                        if (f37 > f38) {
                                                            j00Var4.f = f38;
                                                        }
                                                        float interpolation = xq.g.getInterpolation(j00Var4.f / f38);
                                                        float f39 = i16;
                                                        float f40 = j00Var4.c;
                                                        float f41 = ((((j00Var4.a - f40) * interpolation) + f40) * f39) - 200.0f;
                                                        float f42 = j00Var4.d;
                                                        float f43 = ((((j00Var4.b - f42) * interpolation) + f42) * i15) - 200.0f;
                                                        c2 = 3;
                                                        float f44 = (f39 / 400.0f) * ((i17 == 0 || i17 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f41, f43);
                                                        matrix.postScale(f44, f44, f41 + 200.0f, f43 + 200.0f);
                                                        j00Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    c2 = c10;
                                                    f13 = f32;
                                                    path = path3;
                                                    z12 = z10;
                                                    f14 = 0.0f;
                                                }
                                                G0.b.b(paint);
                                                f15 = f13;
                                            }
                                            if (i3 == 1 && z12) {
                                                paint.setAlpha(org.telegram.messenger.hs.e4);
                                            } else if (i3 == 1) {
                                                paint.setAlpha((int) (255.0f * f15));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.hs.e4);
                                            }
                                            if (i3 == 1 && z12) {
                                                path.rewind();
                                                f18 = f10;
                                                float f45 = f11;
                                                float f46 = f14;
                                                path2 = path;
                                                path2.addCircle(f11 - org.telegram.messenger.g0.L(18.0f), com.google.android.recaptcha.internal.a.z(measuredHeight, f18, 2.0f, f18), org.telegram.messenger.k5.A(f45, f46, 1.1f, f15), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f17 = f45;
                                                f19 = 0.0f;
                                                j12 = j11;
                                                canvas.drawRoundRect(f46, f18, f17, measuredHeight, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j12 = j11;
                                                f17 = f11;
                                                f18 = f10;
                                                path2 = path;
                                                f19 = 0.0f;
                                                canvas.drawRoundRect(f14, f18, f17, measuredHeight, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
                                            }
                                        }
                                        i3++;
                                        c10 = c2;
                                        j11 = j12;
                                        f10 = f18;
                                        f11 = f17;
                                        path3 = path2;
                                        f21 = f12;
                                        f22 = f19;
                                        z10 = z12;
                                    }
                                }
                            }
                            j11 = j10;
                            float f222 = 0.0f;
                            if (z11) {
                            }
                            i3 = 0;
                            while (i3 < 2) {
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    j11 = j10;
                    float f2222 = 0.0f;
                    if (z11) {
                    }
                    i3 = 0;
                    while (i3 < 2) {
                    }
                }
                f20 = f21;
                invalidate();
            } else {
                f20 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.V == 0 && (ziVar = MediaController.B().v0) != null) {
                float f47 = -org.telegram.messenger.g0.N(f20);
                float T1 = org.telegram.messenger.g0.T1(f47, org.telegram.messenger.g0.N(f20) + getMeasuredWidth(), ziVar.b0);
                float measuredHeight2 = getMeasuredHeight();
                float N = measuredHeight2 - org.telegram.messenger.g0.N(2.0f);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.r0);
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
        ei.g1 g1Var = ei.g1.X;
        g2.g gVar = this.v0;
        int i3 = 6;
        if (g1Var != null) {
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
                gVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(xq.f);
                this.f.addListener(new b00(this, i3));
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
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new b00(this, 7));
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
                    gVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new b00(this, 5));
                    this.f.start();
                }
            } else if (z11 && this.V == -1) {
                this.U = false;
                setVisibility(8);
            }
        }
        ei.g1 g1Var2 = ei.g1.X;
        if (g1Var2 == null || this.V != 6) {
            return;
        }
        e00 e00Var = this.d;
        TLRPC.GroupCall groupCall = g1Var2.w;
        e00Var.setText(org.telegram.messenger.bd.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i3;
        TLRPC.User user;
        int i10;
        String format;
        ig igVar = this.n;
        if (igVar == null || this.d == null) {
            return;
        }
        b();
        long a10 = igVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) org.telegram.messenger.ld.f(currentAccount).c.f(a10);
        int i11 = 1;
        if (!this.s0) {
            org.telegram.messenger.ld f10 = org.telegram.messenger.ld.f(currentAccount);
            a0.h hVar = f10.H;
            if (hVar.h(a10) < 0) {
                hVar.k(Boolean.TRUE, a10);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f10.getMessagesController().j1(a10);
                tL_messages_getRecentLocations.limit = 100;
                f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.p4(f10, a10, i11));
            }
            this.s0 = true;
        }
        if (arrayList != null) {
            long e10 = org.telegram.messenger.h10.i(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i10 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long C1 = org.telegram.messenger.zi.C1(message.from_id);
                    if (user == null && C1 != e10) {
                        user = org.telegram.messenger.hp.s1(currentAccount).a2(Long.valueOf(C1));
                    }
                    i10++;
                }
            }
            i3 = 0;
        } else {
            i3 = 0;
            user = null;
            i10 = 0;
        }
        if (this.t0 == i10) {
            return;
        }
        this.t0 = i10;
        String M0 = org.telegram.messenger.bd.M0(2131748848, null);
        if (i10 == 0) {
            format = M0;
        } else {
            int i13 = i10 - 1;
            if (!org.telegram.messenger.ld.f(currentAccount).i(a10)) {
                int i14 = i3;
                if (i13 != 0) {
                    String j10 = org.telegram.messenger.l10.j(user, true);
                    String G = org.telegram.messenger.bd.G(i13, "AndOther", new Object[i14]);
                    Object[] objArr = new Object[3];
                    objArr[i14] = M0;
                    objArr[1] = j10;
                    objArr[2] = G;
                    format = String.format("%1$s - %2$s %3$s", objArr);
                } else {
                    String j11 = org.telegram.messenger.l10.j(user, true);
                    Object[] objArr2 = new Object[2];
                    objArr2[i14] = M0;
                    objArr2[1] = j11;
                    format = String.format("%1$s - %2$s", objArr2);
                }
            } else if (i13 == 0) {
                String M02 = org.telegram.messenger.bd.M0(2131752184, null);
                Object[] objArr3 = new Object[2];
                objArr3[i3] = M0;
                objArr3[1] = M02;
                format = String.format("%1$s - %2$s", objArr3);
            } else if (i13 != 1 || user == null) {
                String M03 = org.telegram.messenger.bd.M0(2131752184, null);
                int i15 = i3;
                String G2 = org.telegram.messenger.bd.G(i13, "AndOther", new Object[i15]);
                Object[] objArr4 = new Object[3];
                objArr4[i15] = M0;
                objArr4[1] = M03;
                objArr4[2] = G2;
                format = String.format("%1$s - %2$s %3$s", objArr4);
            } else {
                Object[] objArr5 = new Object[1];
                objArr5[i3] = org.telegram.messenger.l10.j(user, true);
                String a02 = org.telegram.messenger.bd.a0("SharingYouAndOtherName", null, 2131745378, objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i3] = M0;
                objArr6[1] = a02;
                format = String.format("%1$s - %2$s", objArr6);
            }
        }
        if (format.equals(this.W)) {
            return;
        }
        this.W = format;
        int indexOf = format.indexOf(M0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i16 = 0;
        while (i16 < 2) {
            e00 e00Var = this.d;
            TextView textView = i16 == 0 ? e00Var.getTextView() : e00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i16++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.r0)), indexOf, M0.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z11 = true;
        if (this.U) {
            int i3 = this.V;
            if (i3 == 1 || i3 == 3) {
                return;
            }
            if ((i3 == 4 || i3 == 5) && !j()) {
                return;
            }
        }
        org.telegram.messenger.zi ziVar = MediaController.B().v0;
        View fragmentView = this.h.getFragmentView();
        boolean z12 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean z13 = this.U;
        g2.g gVar = this.v0;
        if (ziVar == null || ziVar.f1() == 0 || org.telegram.messenger.zi.M4(ziVar.k)) {
            this.S = null;
            boolean z14 = (!this.b0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || l10.c()) ? false : true;
            boolean z15 = z14;
            z15 = z14;
            if (!j() && !z14) {
                ig igVar = this.n;
                z15 = z14;
                if (igVar != null) {
                    z15 = z14;
                    if (!l10.c()) {
                        org.telegram.messenger.r3 groupCall = igVar.getGroupCall();
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
            if (q0Var != null && q0Var.x()) {
                this.H.U(null, null);
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
            gVar.d();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            i00 i00Var = this.q0;
            if (i00Var != null) {
                ((wo0) i00Var).b(true);
            }
            this.f.addListener(new b00(this, z11 ? 1 : 0));
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
            i00 i00Var2 = this.q0;
            if (i00Var2 != null) {
                ((wo0) i00Var2).b(true);
                ((wo0) this.q0).b(false);
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
                gVar.d();
                this.f = new AnimatorSet();
                i00 i00Var3 = this.q0;
                if (i00Var3 != null) {
                    ((wo0) i00Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new b00(this, i11));
                this.f.start();
            }
            this.U = true;
            setVisibility(0);
        }
        if (MediaController.B().H()) {
            this.c.a(false, !z12);
            this.b.setContentDescription(org.telegram.messenger.bd.M0(2131754929, null));
        } else {
            this.c.a(true, !z12);
            this.b.setContentDescription(org.telegram.messenger.bd.M0(2131754930, null));
        }
        if (this.S == ziVar && i10 == 0) {
            return;
        }
        this.S = ziVar;
        if (org.telegram.messenger.zi.S4(ziVar.k) || this.S.i4()) {
            this.a0 = false;
            org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
            if (q0Var2 != null) {
                q0Var2.setAlpha(1.0f);
                this.H.setEnabled(true);
            }
            this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
            spannableStringBuilder = new SpannableStringBuilder(a1.g.C(ziVar.x1(true), " ", ziVar.z1(true)));
            int i12 = 0;
            while (i12 < 2) {
                e00 e00Var = this.d;
                TextView textView = i12 == 0 ? e00Var.getTextView() : e00Var.getNextTextView();
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
            } else if (ziVar.L0() >= 600.0d) {
                this.H.setAlpha(1.0f);
                this.H.setEnabled(true);
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.O, 0);
                q(false);
            } else {
                this.H.setAlpha(0.0f);
                this.H.setEnabled(false);
                this.d.setPadding(0, 0, this.O, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a1.g.C(ziVar.x1(true), " - ", ziVar.z1(true)));
            int i13 = 0;
            while (i13 < 2) {
                e00 e00Var2 = this.d;
                TextView textView2 = i13 == 0 ? e00Var2.getTextView() : e00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.r0)), 0, ziVar.x1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z12 && z13 && this.a0);
    }

    public qc getCapsuleBlobDrawable() {
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
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.r0;
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), false, this.r0);
        this.H = q0Var;
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(this.H.getIconView(), i3, e6Var, PorterDuff.Mode.SRC_IN);
        }
        this.H.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        int i10 = 0;
        this.H.setLongClickEnabled(false);
        this.H.setVisibility(8);
        this.H.setTag(null);
        this.H.setShowSubmenuByMove(false);
        this.H.setContentDescription(org.telegram.messenger.bd.M0(2131754805, null));
        this.H.setDelegate(new wz(this));
        org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
        cu0 cu0Var = new cu0();
        this.I = cu0Var;
        q0Var2.setIcon(cu0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), e6Var);
        this.J = u0Var;
        u0Var.setRoundRadiusDp(6.0f);
        this.J.setDrawShadow(true);
        this.J.setOnValueChange(new e(this, 13));
        org.telegram.ui.ActionBar.o0 z10 = this.H.z(0, R.drawable.msg_speed_slow, org.telegram.messenger.bd.M0(2131745276, null));
        org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
        o0VarArr[0] = z10;
        o0VarArr[1] = this.H.z(1, R.drawable.msg_speed_normal, org.telegram.messenger.bd.M0(2131745277, null));
        o0VarArr[2] = this.H.z(2, R.drawable.msg_speed_medium, org.telegram.messenger.bd.M0(2131745278, null));
        o0VarArr[3] = this.H.z(3, R.drawable.msg_speed_fast, org.telegram.messenger.bd.M0(2131745280, null));
        o0VarArr[4] = this.H.z(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.bd.M0(2131745274, null));
        o0VarArr[5] = this.H.z(5, R.drawable.msg_speed_superfast, org.telegram.messenger.bd.M0(2131745275, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            this.H.setPadding(0, 1, 0, 0);
        }
        this.H.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.H, b8.mf.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.H.setOnClickListener(new q2(17, this, fArr));
        this.H.setOnLongClickListener(new zz(this, i10));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i3 = this.V;
        if ((i3 == 3 || i3 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.kd kdVar) {
        if (kdVar != null) {
            org.telegram.ui.ActionBar.d2 d2Var = this.h;
            if (d2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) d2Var.getParentActivity();
                launchActivity.O0(kdVar.h.I1);
                org.telegram.ui.la0 la0Var = new org.telegram.ui.la0(2);
                la0Var.G0(kdVar.h);
                la0Var.H0 = new ei.c1(kdVar, org.telegram.messenger.zi.B0(kdVar.h.k), 5);
                launchActivity.t0(la0Var);
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
        int i3 = R.raw.speed_fast;
        if (abs < 0.05f) {
            if (f10 < f11) {
                return;
            }
            a02 = org.telegram.messenger.bd.M0(2131753901, null);
            if (Math.abs(f10 - 2.0f) < 0.05f) {
                i3 = R.raw.speed_2to1;
            }
        } else if (z10 && i(f11, 1.5f) && i(f10, 1.0f)) {
            a02 = org.telegram.messenger.bd.a0("AudioSpeedCustom", null, 2131753903, cu0.a(f11));
            i3 = R.raw.speed_1to15;
        } else if (z10 && i(f11, 2.0f) && i(f10, 1.5f)) {
            a02 = org.telegram.messenger.bd.M0(2131753902, null);
            i3 = R.raw.speed_15to2;
        } else {
            a02 = org.telegram.messenger.bd.a0("AudioSpeedCustom", null, 2131753903, cu0.a(f11));
        }
        fc.a0(this.h).Q(i3, 36, a02).j();
    }

    public final void m() {
        za.p pVar = this.M0;
        if (pVar != null) {
            pVar.a();
            this.M0 = null;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            org.telegram.messenger.ds[] dsVarArr = this.L0;
            org.telegram.messenger.ds dsVar = dsVarArr[i3];
            if (dsVar != null) {
                dsVar.a();
                dsVarArr[i3] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.g gVar = this.P;
        if (gVar == null || gVar.g < 1.0f) {
            this.P0 = true;
        } else {
            this.P0 = false;
            org.telegram.messenger.g0.i3(new a00(this, 0), 150L);
        }
    }

    public final void o(boolean z10) {
        org.telegram.messenger.r3 r3Var;
        int i3;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.c0.a.f) != null) {
            valueAnimator.cancel();
            this.c0.a.f = null;
        }
        w8 w8Var = this.c0.a;
        if (w8Var.f != null) {
            w8Var.g = true;
            return;
        }
        int i10 = this.V;
        int i11 = this.o0;
        ig igVar = this.n;
        if (i10 == 4) {
            if (igVar != null) {
                r3Var = igVar.getGroupCall();
                i11 = this.h.getCurrentAccount();
            } else {
                r3Var = null;
            }
            i3 = i11;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            r3Var = VoIPService.getSharedInstance().groupCall;
            user = igVar != null ? null : VoIPService.getSharedInstance().getUser();
            i3 = VoIPService.getSharedInstance().getAccount();
        } else {
            r3Var = null;
            i3 = i11;
            user = null;
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.e;
            int size = arrayList.size();
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 < size) {
                    this.c0.b(i12, i3, (TLObject) arrayList.get(i12));
                } else {
                    this.c0.b(i12, i3, null);
                }
            }
        } else if (user != null) {
            this.c0.b(0, i3, user);
            for (int i13 = 1; i13 < 3; i13++) {
                this.c0.b(i13, i3, null);
            }
        } else {
            for (int i14 = 0; i14 < 3; i14++) {
                this.c0.b(i14, i3, null);
            }
        }
        this.c0.a(z10);
        if (this.V != 4 || r3Var == null) {
            return;
        }
        int min = r3Var.b.rtmp_stream ? 0 : Math.min(3, r3Var.e.size());
        int e10 = (min == 0 ? 10 : com.google.android.recaptcha.internal.a.e(min, 1, 24, 52)) + 3;
        if (z10) {
            int i15 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (org.telegram.messenger.g0.L(e10) != i15) {
                float translationX = (this.d.getTranslationX() + i15) - org.telegram.messenger.g0.L(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                xq xqVar = xq.f;
                duration.setInterpolator(xqVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(xqVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = e10;
        this.d.setLayoutParams(b8.mf.d(-1, 20.0f, 51, f10, 5.0f, r3Var.j() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(b8.mf.d(-1, 20.0f, 51, f10, 25.0f, r3Var.j() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.p0) {
            za.p pVar = new za.p(org.telegram.messenger.hs.e(), this);
            pVar.b(org.telegram.messenger.hs.D4);
            pVar.b(org.telegram.messenger.hs.F4);
            this.M0 = pVar;
            d(true);
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                za.p pVar2 = new za.p(org.telegram.messenger.hs.f(i3), this);
                pVar2.b(org.telegram.messenger.hs.f2);
                pVar2.b(org.telegram.messenger.hs.g2);
                pVar2.b(org.telegram.messenger.hs.h2);
                pVar2.b(org.telegram.messenger.hs.w2);
                pVar2.b(org.telegram.messenger.hs.C2);
                pVar2.b(org.telegram.messenger.hs.v1);
                pVar2.b(org.telegram.messenger.hs.G2);
                pVar2.b(org.telegram.messenger.hs.e2);
                this.L0[i3] = pVar2;
                GroupCallMessagesController.getInstance(i3).subscribeToCallMessages(0L, this);
            }
            za.p pVar3 = new za.p(org.telegram.messenger.hs.e(), this);
            pVar3.b(org.telegram.messenger.hs.J4);
            pVar3.b(org.telegram.messenger.hs.v2);
            pVar3.b(org.telegram.messenger.hs.D2);
            pVar3.b(org.telegram.messenger.hs.O4);
            pVar3.b(org.telegram.messenger.hs.N4);
            pVar3.b(org.telegram.messenger.hs.F2);
            this.M0 = pVar3;
            if (ei.g1.X != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || l10.c()) {
                ig igVar = this.n;
                if (igVar != null && this.h.getSendMessagesHelper().B(igVar.a()) != null && !j()) {
                    c(true);
                } else if (igVar == null || igVar.getGroupCall() == null || !igVar.getGroupCall().y() || l10.c() || j()) {
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
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.G0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            qc qcVar = this.a;
            if (!qcVar.u) {
                qcVar.u = true;
                qcVar.t = SystemClock.elapsedRealtime();
                cg.j.d().a(60, qcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.Q != z10 && this.E != null) {
                this.Q = z10;
                this.F.P(z10 ? 15 : 29);
                ch0 ch0Var = this.F;
                ch0Var.N(ch0Var.f - 1, false, true);
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
        qc qcVar = this.a;
        if (z11 != z10) {
            this.Q = z10;
            this.F.P(z10 ? 15 : 29);
            ch0 ch0Var = this.F;
            ch0Var.N(ch0Var.f - 1, false, true);
            this.E.invalidate();
            org.telegram.ui.ActionBar.k6.G0().c(this.U);
            qcVar.h(this.U);
        }
        if (this.Q) {
            this.O0 = 0.0f;
            org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            qcVar.f(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
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
            for (int i3 = 0; i3 < 4; i3++) {
                GroupCallMessagesController.getInstance(i3).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.V;
        if (i10 == 3 || i10 == 1) {
            k00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            qc qcVar = this.a;
            if (qcVar.u) {
                qcVar.u = false;
                cg.j.d().f(qcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.Q0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.w == null) {
            return;
        }
        int i3 = this.V;
        if ((i3 == 1 || i3 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.W0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.V0.h(new h00(this.w, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i3 = this.W0;
        if (i3 > 0) {
            int i10 = i3 - 1;
            this.W0 = i10;
            if (i10 == 0) {
                this.V0.h(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.r3 r3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i3 = this.V;
            if (i3 == 1 || i3 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.bd.M0(2131743402, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                    if (r3Var.e.size() <= 1) {
                        this.d.b(org.telegram.messenger.bd.M0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.e.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.m5.s(sharedInstance.getAccount(), org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i10)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.bd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                ig igVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (igVar == null || igVar.j() == null || igVar.j().id != user.id) {
                            this.d.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(org.telegram.messenger.bd.M0(2131746056, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (igVar == null || igVar.g() == null || igVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g7 = igVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(org.telegram.messenger.bd.M0(2131743458, null), false);
                } else if (org.telegram.messenger.t3.W(g7)) {
                    this.d.b(org.telegram.messenger.bd.M0(2131743458, null), false);
                } else {
                    this.d.b(org.telegram.messenger.bd.M0(2131743317, null), false);
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
        int i3 = 0;
        this.B0 = false;
        while (true) {
            org.telegram.ui.ActionBar.o0[] o0VarArr = this.K;
            if (i3 >= o0VarArr.length) {
                this.J.e(z10, C);
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.r0;
            if (z11 || Math.abs(C - X0[i3]) >= 0.05f) {
                org.telegram.ui.ActionBar.o0 o0Var = o0VarArr[i3];
                int i10 = org.telegram.ui.ActionBar.k6.E8;
                o0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            } else {
                org.telegram.ui.ActionBar.o0 o0Var2 = o0VarArr[i3];
                int i11 = org.telegram.ui.ActionBar.k6.Ei;
                o0Var2.a(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            }
            i3++;
        }
    }

    public final void r(int i3) {
        if (this.V == i3) {
            return;
        }
        b();
        int i10 = this.V;
        qc qcVar = this.a;
        if (i10 == 3 || i10 == 1) {
            k00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            if (qcVar.u) {
                qcVar.u = false;
                cg.j.d().f(qcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            qe.j jVar = this.V0;
            if (jVar != null) {
                jVar.h(null, true);
            }
        }
        this.V = i3;
        this.s.setWillNotDraw(i3 != 4);
        if (i3 != 4) {
            this.i0 = false;
        }
        x8 x8Var = this.c0;
        if (x8Var != null) {
            x8Var.setStyle(this.V);
            this.c0.setLayoutParams(b8.mf.e(org.telegram.messenger.hs.t1, getStyleHeight(), 51));
        }
        this.s.setLayoutParams(b8.mf.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.T;
        if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.r0;
        if (i3 == 6) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, e6Var)}));
            this.s.setTag(null);
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.E.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.c0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            int i11 = 0;
            while (i11 < 2) {
                e00 e00Var = this.d;
                TextView textView = i11 == 0 ? e00Var.getTextView() : e00Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A7, e6Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 15.0f);
                }
                i11++;
            }
            this.d.setLayoutParams(b8.mf.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i3 == 5) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            int i12 = 0;
            while (i12 < 2) {
                e00 e00Var2 = this.d;
                TextView textView2 = i12 == 0 ? e00Var2.getTextView() : e00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.u7, e6Var);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.E.setVisibility(8);
            this.c0.setVisibility(8);
            this.y.setVisibility(0);
            this.y.d();
            this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754900, null));
            org.telegram.ui.ActionBar.q0 q0Var = this.H;
            if (q0Var != null) {
                q0Var.setVisibility(8);
                this.H.setTag(null);
            }
            this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i3 == 0 || i3 == 2) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
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
                e00 e00Var3 = this.d;
                TextView textView3 = i13 == 0 ? e00Var3.getTextView() : e00Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.u7, e6Var);
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            if (i3 == 6) {
                this.b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.G.setVisibility(8);
                return;
            } else {
                if (i3 != 0) {
                    this.b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754755, null));
                    return;
                }
                this.b.setLayoutParams(b8.mf.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(b8.mf.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                if (q0Var2 != null) {
                    q0Var2.setVisibility(0);
                    this.H.setTag(1);
                }
                this.G.setContentDescription(org.telegram.messenger.bd.M0(2131754900, null));
                return;
            }
        }
        if (i3 == 4) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            this.E.setVisibility(8);
            this.e.setVisibility(0);
            int i14 = 0;
            while (i14 < 2) {
                e00 e00Var4 = this.d;
                TextView textView4 = i14 == 0 ? e00Var4.getTextView() : e00Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.t7, e6Var);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.t7));
            this.d.setPadding(0, 0, this.O, 0);
            this.y.setVisibility(8);
            this.y.i();
            ig igVar = this.n;
            this.c0.setVisibility(!((igVar == null || igVar.getGroupCall() == null || igVar.getGroupCall().b == null || !igVar.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
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
        if (i3 == 1 || i3 == 3) {
            this.x.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.c0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i3 == 3 && VoIPService.getSharedInstance() != null) {
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
            ch0 ch0Var = this.F;
            ch0Var.N(ch0Var.f - 1, false, true);
            this.E.invalidate();
            this.s.setBackground(null);
            this.s.setBackgroundColor(0);
            this.y.setVisibility(8);
            this.y.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.G0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!qcVar.u) {
                qcVar.u = true;
                qcVar.t = SystemClock.elapsedRealtime();
                cg.j.d().a(60, qcVar.F);
            }
            invalidate();
            int i15 = 0;
            while (i15 < 2) {
                e00 e00Var5 = this.d;
                TextView textView5 = i15 == 0 ? e00Var5.getTextView() : e00Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.A7, e6Var);
                    textView5.setTypeface(org.telegram.messenger.g0.o());
                    textView5.setTextSize(1, 14.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            this.G.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.N.setVisibility(8);
            this.d.setLayoutParams(b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.O, 0);
            org.telegram.ui.ActionBar.q0 q0Var4 = this.H;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
                this.H.setTag(null);
            }
        }
    }

    public void setDelegate(i00 i00Var) {
        this.q0 = i00Var;
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
        fh0 fh0Var = this.y;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f10);
        }
        e00 e00Var = this.d;
        if (e00Var != null) {
            e00Var.setTranslationX(f10);
        }
        e00 e00Var2 = this.e;
        if (e00Var2 != null) {
            e00Var2.setTranslationX(f10);
        }
        x8 x8Var = this.c0;
        if (x8Var != null) {
            x8Var.setTranslationX(f10);
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
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        setTopPadding(this.T);
        if (i3 == 8) {
            this.Q0 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        o31[] o31VarArr;
        qc qcVar = this.a;
        int i3 = qcVar.A;
        if (i3 >= 0) {
            qcVar.E = 1.0f;
            qcVar.a(qc.e(i3));
        }
        int i10 = !i(MediaController.B().C(this.a0), 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7;
        org.telegram.ui.ActionBar.e6 e6Var = this.r0;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        cu0 cu0Var = this.I;
        if (cu0Var != null) {
            cu0Var.a.u(w02);
            Paint paint = cu0Var.b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.H;
        if (q0Var != null) {
            Drawable background = q0Var.getBackground();
            if (background == null || background != this.F0) {
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.F0 = h02;
                q0Var2.setBackground(h02);
                this.K0 = w02;
            } else if (w02 != this.K0) {
                this.K0 = w02;
                org.telegram.ui.ActionBar.k6.H1(background, w02 & 436207615, true);
            }
        }
        if (this.b != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.w7, e6Var);
            if (this.G0 == null || w03 != this.I0) {
                ImageView imageView = this.b;
                this.I0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.G != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.x7, e6Var);
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
                e00 e00Var = this.e;
                TextView textView = i11 == 0 ? e00Var.getTextView() : e00Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.x7, e6Var));
                }
                i11++;
            }
        }
        e00 e00Var2 = this.d;
        if (e00Var2 != null) {
            Object tag = e00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    e00 e00Var3 = this.d;
                    TextView textView2 = i12 == 0 ? e00Var3.getTextView() : e00Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(intValue, e6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (o31VarArr = (o31[]) ((Spanned) text).getSpans(0, text.length(), o31.class)) != null) {
                            for (o31 o31Var : o31VarArr) {
                                o31Var.b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, e6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d2 d2Var, View view, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = new qc();
        this.K = new org.telegram.ui.ActionBar.o0[6];
        this.R = -1;
        this.V = -1;
        this.b0 = true;
        this.k0 = new g6(false, true, true);
        this.n0 = new c00(this);
        this.o0 = org.telegram.messenger.h10.t0;
        this.t0 = -1;
        this.u0 = new lt(this, 3);
        this.v0 = new g2.g((int[]) null);
        this.w0 = new g2.g(new int[]{org.telegram.messenger.hs.D});
        this.L0 = new org.telegram.messenger.ds[4];
        this.R0 = new Paint(1);
        this.T0 = 0;
        this.V0 = new qe.j(new wz(this), xq.h, 450L);
        this.W0 = 0;
        this.r0 = e6Var;
        this.h = d2Var;
        if (d2Var instanceof ig) {
            this.n = (ig) d2Var;
        }
        this.r = view;
        this.U = true;
        this.p0 = z10;
        if (view == null) {
            ((ViewGroup) d2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
