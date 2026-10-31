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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.us, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.k6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public z00 B0;
    public ViewGroup C0;
    public y00 D;
    public long D0;
    public bi0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.t0 G;
    public PorterDuffColorFilter G0;
    public jh.g H;
    public int H0;
    public org.telegram.ui.ActionBar.x0 I;
    public int I0;
    public final org.telegram.ui.ActionBar.r0[] J;
    public int J0;
    public FrameLayout K;
    public final org.telegram.messenger.vs[] K0;
    public ImageView L;
    public xa.n L0;
    public org.telegram.ui.ActionBar.q2 M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.g O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public org.telegram.messenger.jj R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final fe.m U0;
    public String V;
    public int V0;
    public boolean W;
    public final lc a;
    public boolean a0;
    public ImageView b;
    public u8 b0;
    public kf0 c;
    public Paint c0;
    public w00 d;
    public LinearGradient d0;
    public w00 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.k2 h;
    public boolean h0;
    public boolean i0;
    public final e6 j0;
    public dc k0;
    public boolean l0;
    public final u00 m0;
    public final gg n;
    public final int n0;
    public final boolean o0;
    public b10 p0;
    public final org.telegram.ui.ActionBar.p6 q0;
    public final View r;
    public boolean r0;
    public v00 s;
    public int s0;
    public final ew t0;
    public final e2.f u0;
    public final e2.f v0;
    public org.telegram.ui.Cells.a5 w;
    public boolean w0;
    public View x;
    public boolean x0;
    public ei0 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.ay ayVar, boolean z10) {
        this(context, ayVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.p6 p6Var = this.q0;
        return i10 == 4 ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t7, p6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A7, p6Var) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.u7, p6Var);
    }

    public static boolean i(float f7, float f10) {
        return Math.abs(f7 - f10) < 0.05f;
    }

    public static boolean j() {
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        return jjVar != null && org.telegram.messenger.jj.R4(jjVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.u3 groupCall;
        org.telegram.messenger.u3 u3Var;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.h;
        View fragmentView = k2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c10 = g20.c();
        gg ggVar = this.n;
        if (c10) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.b50.v5 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (u3Var = sharedInstance.groupCall) != null && (u3Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (j() || org.telegram.ui.b50.v5 || !this.a0 || z11 || ggVar == null || (groupCall = ggVar.getGroupCall()) == null || !groupCall.y()) {
                z12 = false;
                e2.f fVar = this.u0;
                if (z11) {
                    boolean z14 = this.T;
                    if (z14 && ((z13 && this.U == -1) || (i11 = this.U) == 4 || i11 == 3 || i11 == 1)) {
                        this.T = false;
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
                            this.f.setInterpolator(gr.f);
                            this.f.addListener(new t00(this, 9));
                            this.f.start();
                        }
                    } else if (z14 && ((i10 = this.U) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z13 || ggVar == null || !ggVar.J() || g20.c()) {
                        return;
                    }
                    org.telegram.messenger.m5.n(null, 2131749162, cc.a0(k2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.U;
                if (i12 != i13 && this.f != null && !z13) {
                    this.w0 = true;
                    return;
                }
                if (i12 != i13 && this.T && !z13) {
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
                    this.f.setInterpolator(gr.f);
                    this.f.addListener(new t00(this, 10));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.T;
                    r(4);
                    org.telegram.messenger.u3 groupCall2 = ggVar.getGroupCall();
                    TLRPC.Chat g10 = ggVar.g();
                    if (groupCall2.j()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(org.telegram.messenger.i0.L(14.0f));
                            this.g0.setTypeface(org.telegram.messenger.i0.o());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        org.telegram.messenger.cd.L0(2131743466, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (org.telegram.messenger.w3.W(g10)) {
                            this.d.b(org.telegram.messenger.cd.L0(2131743487, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.cd.L0(2131743366, null), false);
                        }
                        this.e.b(org.telegram.messenger.cd.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(org.telegram.messenger.cd.L0(2131743468, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(org.telegram.messenger.cd.L0(2131743473, null), false);
                        } else if (org.telegram.messenger.w3.W(g10)) {
                            this.d.b(org.telegram.messenger.cd.L0(2131743473, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.cd.L0(2131743332, null), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.cd.L0(groupCall4.rtmp_stream ? 2131743561 : 2131748629, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.cd.G(i14, groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                        this.s.invalidate();
                    }
                    o(this.b0.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    o(i13 == 1);
                    r(1);
                } else {
                    o(i13 == 3);
                    r(3);
                }
                if (this.T) {
                    return;
                }
                if (z13) {
                    setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(gr.f);
                    this.f.addListener(new t00(this, 11));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z11 = true;
        }
        z12 = z11;
        e2.f fVar2 = this.u0;
        if (z11) {
        }
    }

    public final void b() {
        if (this.s != null) {
            return;
        }
        Context context = getContext();
        v00 v00Var = new v00(this, context);
        this.s = v00Var;
        this.k0 = new dc(v00Var);
        int i10 = org.telegram.messenger.i0.q.x;
        e6 e6Var = this.j0;
        e6Var.M = i10;
        e6Var.A = 0.4f;
        e6Var.setCallback(v00Var);
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        addView(this.s, w7.b6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.x = view;
        this.s.addView(view, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.t6.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.p6 p6Var = this.q0;
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, p6Var, mode);
        ImageView imageView3 = this.b;
        kf0 kf0Var = new kf0(16);
        this.c = kf0Var;
        imageView3.setImageDrawable(kf0Var);
        final int i12 = 1;
        this.b.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        addView(this.b, w7.b6.e(36, 36, 51));
        final int i13 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i14;
                long j10;
                TL_stories.StoryItem u10;
                int i15 = i13;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i15) {
                    case 0:
                        gg ggVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        gg ggVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.b;
                                int i17 = s0Var.e;
                                if (i17 != org.telegram.messenger.d20.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i17).O1().u(s0Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i17).P(i17, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.jj.B0(jjVar.k) == (ggVar2 != null ? ggVar2.a() : 0L)) {
                                    fragmentContextView.n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.o5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.o5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", jjVar.f1());
                                    k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i18 = org.telegram.messenger.d20.s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i14 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!org.telegram.messenger.nd.f(i19).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i19).I.get(0);
                                            j10 = mdVar.a;
                                            i14 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i14 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i14).h(j10));
                                break;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                    TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                    d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                    d40Var.H0 = new r0(fragmentContextView, 7);
                                    k2Var2.showDialog(d40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().u0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().u0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ei0 ei0Var = new ei0(context);
        this.y = ei0Var;
        ei0Var.setScaleType(scaleType);
        this.y.setAutoRepeat(true);
        this.y.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.a7.C(this.y, org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(22.0f), org.telegram.ui.ActionBar.t6.w0(i11, p6Var)), org.telegram.ui.ActionBar.a7.N(i11), p6Var);
        addView(this.y, w7.b6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final int i14 = 0;
        w00 w00Var = new w00(this, context, context, i14);
        this.d = w00Var;
        addView(w00Var, w7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        w00 w00Var2 = new w00(this, context, context, i12);
        this.e = w00Var2;
        addView(w00Var2, w7.b6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.O = gVar;
        gVar.g = 1.0f;
        gVar.j = false;
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 2);
        this.M = q2Var;
        q2Var.setText(org.telegram.messenger.cd.L0(2131743468, null));
        org.telegram.ui.ActionBar.a7.V(this.M, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        org.telegram.ui.ActionBar.q2 q2Var2 = this.M;
        int L = org.telegram.messenger.i0.L(16.0f);
        int i15 = org.telegram.ui.ActionBar.t6.Ci;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
        int i16 = org.telegram.ui.ActionBar.t6.Ei;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
        org.telegram.ui.ActionBar.a7.R(q2Var2, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.a7.N(i15), org.telegram.ui.ActionBar.a7.N(i16), p6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(org.telegram.messenger.i0.o());
        this.M.setGravity(17);
        this.M.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        addView(this.M, w7.b6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i17 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i17;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        gg ggVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        gg ggVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.b;
                                int i172 = s0Var.e;
                                if (i172 != org.telegram.messenger.d20.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i172).O1().u(s0Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).P(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.jj.B0(jjVar.k) == (ggVar2 != null ? ggVar2.a() : 0L)) {
                                    fragmentContextView.n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.o5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.o5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", jjVar.f1());
                                    k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i18 = org.telegram.messenger.d20.s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i142 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!org.telegram.messenger.nd.f(i19).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i19).I.get(0);
                                            j10 = mdVar.a;
                                            i142 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i142).h(j10));
                                break;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                    TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                    d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                    d40Var.H0 = new r0(fragmentContextView, 7);
                                    k2Var2.showDialog(d40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().u0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().u0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
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
        int i18 = org.telegram.ui.ActionBar.t6.x7;
        org.telegram.ui.ActionBar.a7.t(imageView5, i18, p6Var, mode);
        this.K.addView(this.L, w7.b6.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.K.setContentDescription(org.telegram.messenger.cd.L0(2131743874, null));
        this.K.setOnClickListener(new bh.c(8));
        this.K.setVisibility(8);
        addView(this.K, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        u8 u8Var = new u8(context, false);
        this.b0 = u8Var;
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(21.0f));
        this.b0.setDelegate(new s00(this, 1));
        this.b0.setVisibility(8);
        addView(this.b0, w7.b6.e(org.telegram.messenger.zs.t1, 36, 51));
        this.E = new bi0(R.raw.voice_muted, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), true, null);
        y00 y00Var = new y00(this, context);
        this.D = y00Var;
        org.telegram.ui.ActionBar.a7.t(y00Var, org.telegram.ui.ActionBar.t6.A7, p6Var, PorterDuff.Mode.SRC_IN);
        this.D.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.D.setAnimation(this.E);
        this.D.setScaleType(scaleType);
        this.D.setVisibility(8);
        addView(this.D, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i19 = 4;
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i19;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        gg ggVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        gg ggVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.b;
                                int i172 = s0Var.e;
                                if (i172 != org.telegram.messenger.d20.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i172).O1().u(s0Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).P(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.jj.B0(jjVar.k) == (ggVar2 != null ? ggVar2.a() : 0L)) {
                                    fragmentContextView.n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.o5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.o5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", jjVar.f1());
                                    k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.d20.s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i142 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.nd.f(i192).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i192).I.get(0);
                                            j10 = mdVar.a;
                                            i142 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i142).h(j10));
                                break;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                    TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                    d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                    d40Var.H0 = new r0(fragmentContextView, 7);
                                    k2Var2.showDialog(d40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().u0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().u0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
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
        org.telegram.ui.ActionBar.a7.t(this.F, i18, p6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, p6Var) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i14;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        gg ggVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        gg ggVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.b;
                                int i172 = s0Var.e;
                                if (i172 != org.telegram.messenger.d20.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i172).O1().u(s0Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).P(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.jj.B0(jjVar.k) == (ggVar2 != null ? ggVar2.a() : 0L)) {
                                    fragmentContextView.n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.o5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.o5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", jjVar.f1());
                                    k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.d20.s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i142 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.nd.f(i192).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i192).I.get(0);
                                            j10 = mdVar.a;
                                            i142 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i142).h(j10));
                                break;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                    TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                    d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                    d40Var.H0 = new r0(fragmentContextView, 7);
                                    k2Var2.showDialog(d40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().u0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().u0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(getContext(), 18);
        this.w = a5Var;
        addView(a5Var, w7.b6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.u3 groupCall;
                int i142;
                long j10;
                TL_stories.StoryItem u10;
                int i152 = i12;
                boolean z10 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i152) {
                    case 0:
                        gg ggVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k2Var.getParentActivity(), p6Var2);
                            String L0 = org.telegram.messenger.cd.L0(2131744853, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L0;
                            if (k2Var instanceof org.telegram.ui.ay) {
                                x1Var.T = org.telegram.messenger.cd.L0(2131744855, null);
                            } else {
                                TLRPC.Chat g10 = ggVar.g();
                                TLRPC.User j11 = ggVar.j();
                                if (g10 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToGroupText", null, 2131744854, g10.title));
                                } else if (j11 != null) {
                                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StopLiveLocationAlertToUserText", null, 2131744852, org.telegram.messenger.h20.j(j11, true)));
                                } else {
                                    x1Var.T = org.telegram.messenger.cd.L0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744859, null), new o00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, p6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        gg ggVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.p6 p6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.k2 k2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.U;
                        if (i162 == 6) {
                            th.s0 s0Var = th.s0.W;
                            if (s0Var != null) {
                                long j12 = s0Var.b;
                                int i172 = s0Var.e;
                                if (i172 != org.telegram.messenger.d20.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i172);
                                    }
                                }
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.vp.r1(i172).O1().u(s0Var.c, j12)) != null) {
                                    u10.dialogId = j12;
                                    T.getOrCreateStoryViewer(i172).P(i172, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            org.telegram.messenger.jj jjVar = MediaController.B().u0;
                            if (k2Var2 != null && jjVar != null) {
                                if (jjVar.I3()) {
                                    Activity W = org.telegram.messenger.i0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new w7(W, p6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.i0.E1(LaunchActivity.I1)) {
                                        new w7(LaunchActivity.I1, p6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.jj.B0(jjVar.k) == (ggVar2 != null ? ggVar2.a() : 0L)) {
                                    fragmentContextView.n.k(jjVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.o5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.o5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", jjVar.f1());
                                    k2Var2.presentFragment(new org.telegram.ui.un(bundle), k2Var2 instanceof org.telegram.ui.un);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i182 = org.telegram.messenger.d20.s0;
                            if (ggVar2 != null) {
                                j10 = ggVar2.a();
                                i142 = k2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.nd.g() == 1) {
                                    for (int i192 = 0; i192 < 4; i192++) {
                                        if (!org.telegram.messenger.nd.f(i192).I.isEmpty()) {
                                            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) org.telegram.messenger.nd.f(i192).I.get(0);
                                            j10 = mdVar.a;
                                            i142 = mdVar.h.I1;
                                        }
                                    }
                                }
                                i142 = i182;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(org.telegram.messenger.nd.f(i142).h(j10));
                                break;
                            } else {
                                k2Var2.showDialog(new du0(fragmentContextView.getContext(), new o00(fragmentContextView), p6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (k2Var2.getParentActivity() != null && (groupCall = ggVar2.getGroupCall()) != null) {
                                    TLRPC.Chat L02 = k2Var2.getMessagesController().L0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z10 = true;
                                    }
                                    org.telegram.ui.Components.voip.m1.l(L02, null, false, Boolean.valueOf(z10), k2Var2.getParentActivity(), k2Var2, k2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var2;
                                if (k2Var2.getSendMessagesHelper().B(unVar.a()) != null) {
                                    d40 d40Var = new d40(fragmentContextView.getContext(), null, unVar, p6Var3);
                                    d40Var.H0 = new r0(fragmentContextView, 7);
                                    k2Var2.showDialog(d40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.b50.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.U == 0) {
                            if (MediaController.B().H()) {
                                MediaController.B().S(MediaController.B().u0);
                                break;
                            } else {
                                MediaController.B().R(MediaController.B().u0, true);
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                org.telegram.messenger.c.a(sharedInstance.getAccount());
                                org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, chat)) {
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView.a.h(true);
                            try {
                                fragmentContextView.D.performHapticFeedback(3, 2);
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

    public final void c(boolean z10) {
        int i10;
        gg ggVar = this.n;
        if (ggVar != null) {
            if (this.T && ((i10 = this.U) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.k2 k2Var = this.h;
            org.telegram.messenger.hz B = k2Var.getSendMessagesHelper().B(ggVar.a());
            View fragmentView = k2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = k2Var.getVisibleDialog();
            if ((j() || ggVar.p() || ((visibleDialog instanceof d40) && !((d40) visibleDialog).I)) && B != null) {
                B = null;
            }
            e2.f fVar = this.u0;
            int i11 = 5;
            if (B == null) {
                if (!this.T || ((!z10 || this.U != -1) && this.U != 5)) {
                    int i12 = this.U;
                    if (i12 == -1 || i12 == 5) {
                        this.T = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.T = false;
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
                this.f.setInterpolator(gr.f);
                this.f.addListener(new t00(this, 4));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z10) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z10 && this.S == 0.0f) {
                setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                b10 b10Var = this.p0;
                if (b10Var != null) {
                    ((wp0) b10Var).b(true);
                    ((wp0) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    fVar.d();
                    this.f = new AnimatorSet();
                    b10 b10Var2 = this.p0;
                    if (b10Var2 != null) {
                        ((wp0) b10Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new t00(this, i11));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i13 = this.Q;
            int i14 = B.l;
            if (i13 != i14) {
                this.Q = i14;
                this.d.b(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ImportUploading", null, 2131749231, Integer.valueOf(i14))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String G;
        String L0;
        org.telegram.ui.ActionBar.k2 k2Var = this.h;
        View fragmentView = k2Var.getFragmentView();
        int i10 = 1;
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = k2Var instanceof org.telegram.ui.ay;
        int i11 = 0;
        boolean i12 = z11 ? org.telegram.messenger.nd.g() != 0 : org.telegram.messenger.nd.f(k2Var.getCurrentAccount()).i(this.n.a());
        ew ewVar = this.t0;
        if (!i12) {
            this.s0 = -1;
            org.telegram.messenger.i0.r(ewVar);
            if (this.T) {
                this.T = false;
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
                this.f.addListener(new t00(this, i11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new pp0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new t00(this, i10));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z11) {
            ewVar.run();
            f();
            return;
        }
        String L02 = org.telegram.messenger.cd.L0(2131748850, null);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 4; i13++) {
            arrayList.addAll(org.telegram.messenger.nd.f(i13).I);
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.md mdVar = (org.telegram.messenger.md) arrayList.get(0);
            long B0 = org.telegram.messenger.jj.B0(mdVar.h.k);
            if (org.telegram.messenger.o5.E(B0)) {
                G = org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(mdVar.h.I1).Z1(Long.valueOf(B0)), true);
                L0 = org.telegram.messenger.cd.L0(2131753965, null);
            } else {
                TLRPC.Chat L03 = org.telegram.messenger.vp.r1(mdVar.h.I1).L0(Long.valueOf(-B0));
                G = L03 != null ? L03.title : "";
                L0 = org.telegram.messenger.cd.L0(2131753964, null);
            }
        } else {
            G = org.telegram.messenger.cd.G(arrayList.size(), "Chats", new Object[0]);
            L0 = org.telegram.messenger.cd.L0(2131753963, null);
        }
        String format = String.format(L0, L02, G);
        int indexOf = format.indexOf(L02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i14 = 0;
        while (i14 < 2) {
            w00 w00Var = this.d;
            TextView textView = i14 == 0 ? w00Var.getTextView() : w00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i14++;
        }
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t7, this.q0)), indexOf, L02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i10 == org.telegram.messenger.zs.D4) {
            d(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.G2) {
            e(false);
            return;
        }
        int i12 = org.telegram.messenger.zs.F4;
        gg ggVar = this.n;
        if (i10 == i12) {
            if (ggVar != null) {
                if (ggVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.h2 || i10 == org.telegram.messenger.zs.g2 || i10 == org.telegram.messenger.zs.f2 || i10 == org.telegram.messenger.zs.D2) {
            int i13 = this.U;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = org.telegram.messenger.zs.v2;
        if (i10 == i14 || i10 == org.telegram.messenger.zs.w2 || i10 == org.telegram.messenger.zs.F2) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i10 == i14) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.D == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.D.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i10 == org.telegram.messenger.zs.C2) {
            b();
            if (this.T && this.U == 4) {
                org.telegram.messenger.u3 groupCall = ggVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.j()) {
                        this.e.b(org.telegram.messenger.cd.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i15 = groupCall2.participants_count;
                        if (i15 == 0) {
                            this.e.b(org.telegram.messenger.cd.L0(groupCall2.rtmp_stream ? 2131743561 : 2131748629, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.cd.G(i15, groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.v1) {
            int i16 = this.U;
            if (i16 == 1 || i16 == 3 || i16 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.J4) {
            q(true);
            return;
        }
        int i17 = org.telegram.messenger.zs.N4;
        lc lcVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.t6.G0().a(Math.max(this.M0, this.N0));
                lcVar.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.O4) {
            if (i10 == org.telegram.messenger.zs.e2 && this.U == 0) {
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
            org.telegram.ui.ActionBar.t6.G0().a(Math.max(this.M0, this.N0));
            lcVar.f(Math.max(this.M0, this.N0));
        }
        this.b0.invalidate();
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
        float f7;
        float f10;
        long j10;
        long j11;
        int i10;
        float f11;
        char c10;
        float f12;
        Path path;
        boolean z12;
        float f13;
        float f14;
        float f15;
        long j12;
        float f16;
        float f17;
        Path path2;
        float f18;
        c10 c10Var;
        float f19;
        org.telegram.messenger.jj jjVar;
        if (this.s == null) {
            return;
        }
        if (!this.R0 || getVisibility() == 0) {
            int i11 = this.U;
            char c11 = 3;
            float f20 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.t6.G0().c(this.P0);
                this.a.h(this.P0);
                org.telegram.messenger.i0.L(getStyleHeight());
                d10 G0 = org.telegram.ui.ActionBar.t6.G0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path3 = G0.n;
                Paint paint = G0.m;
                int i12 = 0;
                while (true) {
                    c10[] c10VarArr = G0.a;
                    if (i12 >= c10VarArr.length) {
                        break;
                    }
                    c10 c10Var2 = c10VarArr[i12];
                    int i13 = c10Var2.i;
                    if (i13 == 0) {
                        if (c10Var2.j != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.m, false) || c10Var2.k != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.n, false)) {
                            c10Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (c10Var2.j != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.o, false) || c10Var2.k != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.p, false)) {
                            c10Var2.a();
                        }
                    } else if (i13 == 3 && (c10Var2.j != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.q, false) || c10Var2.k != org.telegram.ui.ActionBar.t6.x0(null, c10Var2.r, false))) {
                        c10Var2.a();
                    }
                    i12++;
                }
                boolean z13 = G0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    c10 c10Var3 = G0.b;
                    if (c10Var3 != null && (c10Var = G0.c) != null) {
                        int i14 = c10Var.i;
                        int i15 = c10Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f7 = 0.0f;
                                f10 = measuredWidth;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f7 = 0.0f;
                                f10 = measuredWidth;
                                j10 = elapsedRealtime - G0.j;
                                G0.j = elapsedRealtime;
                                if (j10 > 20) {
                                    j10 = 17;
                                }
                                if (j10 < 3) {
                                    j11 = j10;
                                    z11 = false;
                                    float f21 = 0.0f;
                                    if (z11) {
                                        float f22 = G0.g;
                                        float f23 = G0.e;
                                        if (f22 != f23) {
                                            float f24 = G0.h;
                                            float f25 = (j11 * f24) + f23;
                                            G0.e = f25;
                                            if (f24 > 0.0f) {
                                                if (f25 > f22) {
                                                    G0.e = f22;
                                                }
                                            } else if (f25 < f22) {
                                                G0.e = f22;
                                            }
                                            invalidate();
                                        }
                                        float f26 = G0.g;
                                        float f27 = G0.f;
                                        if (f26 != f27) {
                                            float f28 = G0.i;
                                            float f29 = (j11 * f28) + f27;
                                            G0.f = f29;
                                            if (f28 > 0.0f) {
                                                if (f29 > f26) {
                                                    G0.f = f26;
                                                }
                                            } else if (f29 < f26) {
                                                G0.f = f26;
                                            }
                                            invalidate();
                                        }
                                        if (G0.c != null) {
                                            float f30 = (j11 / 250.0f) + G0.k;
                                            G0.k = f30;
                                            if (f30 > 1.0f) {
                                                G0.k = 1.0f;
                                                G0.c = null;
                                            }
                                            invalidate();
                                        }
                                    }
                                    i10 = 0;
                                    while (i10 < 2) {
                                        if (i10 == 0 && G0.c == null) {
                                            c10 = c11;
                                            f11 = f20;
                                            j12 = j11;
                                            f18 = f21;
                                            z12 = z10;
                                            f16 = f10;
                                            f17 = f7;
                                            path2 = path3;
                                        } else {
                                            if (i10 == 0) {
                                                f14 = f20 - G0.k;
                                                G0.c.b(paint);
                                                c10 = c11;
                                                f11 = f20;
                                                path = path3;
                                                z12 = z10;
                                                f13 = 0.0f;
                                            } else {
                                                c10 c10Var4 = G0.b;
                                                if (c10Var4 == null) {
                                                    break;
                                                }
                                                f11 = f20;
                                                float f31 = G0.c != null ? G0.k : f11;
                                                if (z11) {
                                                    f13 = 0.0f;
                                                    int i16 = (int) (measuredHeight - f7);
                                                    int i17 = (int) (f10 - 0.0f);
                                                    float f32 = G0.e;
                                                    float f33 = f21;
                                                    Matrix matrix = c10Var4.h;
                                                    int i18 = c10Var4.i;
                                                    if (i18 == 2) {
                                                        f12 = f31;
                                                        path = path3;
                                                        z12 = z10;
                                                        c10 = 3;
                                                    } else {
                                                        float f34 = c10Var4.e;
                                                        if (f34 == f33 || c10Var4.f >= f34) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f12 = f31;
                                                            c10Var4.e = secureRandom.nextInt(700) + 500;
                                                            c10Var4.f = f33;
                                                            if (c10Var4.a == -1.0f) {
                                                                z12 = z10;
                                                                if (i18 == 3) {
                                                                    path = path3;
                                                                    f15 = 100.0f;
                                                                    c10Var4.a = a1.g.A(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    c10Var4.b = a1.g.A(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f15 = 100.0f;
                                                                    if (i18 == 0) {
                                                                        c10Var4.a = a1.g.A(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        c10Var4.b = a1.g.A(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        c10Var4.a = a1.g.c(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        c10Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z12 = z10;
                                                                f15 = 100.0f;
                                                            }
                                                            c10Var4.c = c10Var4.a;
                                                            c10Var4.d = c10Var4.b;
                                                            if (i18 == 3) {
                                                                c10Var4.a = a1.g.A(secureRandom.nextInt(100), 0.05f, f15, -0.3f);
                                                                c10Var4.b = a1.g.A(secureRandom.nextInt(100), 0.05f, f15, 0.7f);
                                                            } else if (i18 == 0) {
                                                                c10Var4.a = a1.g.A(secureRandom.nextInt(100), 0.2f, f15, -0.3f);
                                                                c10Var4.b = a1.g.A(secureRandom.nextInt(100), 0.3f, f15, 0.7f);
                                                            } else {
                                                                c10Var4.a = a1.g.c(secureRandom.nextInt(100), f15, 0.2f, 1.1f);
                                                                c10Var4.b = (secureRandom.nextInt(100) * 4.0f) / f15;
                                                            }
                                                        } else {
                                                            f12 = f31;
                                                            path = path3;
                                                            z12 = z10;
                                                        }
                                                        float f35 = j11;
                                                        float f36 = (f35 * 0.02f * f32) + (f35 * f11) + c10Var4.f;
                                                        c10Var4.f = f36;
                                                        float f37 = c10Var4.e;
                                                        if (f36 > f37) {
                                                            c10Var4.f = f37;
                                                        }
                                                        float interpolation = gr.g.getInterpolation(c10Var4.f / f37);
                                                        float f38 = i17;
                                                        float f39 = c10Var4.c;
                                                        float f40 = ((((c10Var4.a - f39) * interpolation) + f39) * f38) - 200.0f;
                                                        float f41 = c10Var4.d;
                                                        float f42 = ((((c10Var4.b - f41) * interpolation) + f41) * i16) - 200.0f;
                                                        c10 = 3;
                                                        float f43 = (f38 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f40, f42);
                                                        matrix.postScale(f43, f43, f40 + 200.0f, f42 + 200.0f);
                                                        c10Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    c10 = c11;
                                                    f12 = f31;
                                                    path = path3;
                                                    z12 = z10;
                                                    f13 = 0.0f;
                                                }
                                                G0.b.b(paint);
                                                f14 = f12;
                                            }
                                            if (i10 == 1 && z12) {
                                                paint.setAlpha(org.telegram.messenger.zs.e4);
                                            } else if (i10 == 1) {
                                                paint.setAlpha((int) (255.0f * f14));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.zs.e4);
                                            }
                                            if (i10 == 1 && z12) {
                                                path.rewind();
                                                f17 = f7;
                                                float f44 = f10;
                                                float f45 = f13;
                                                path2 = path;
                                                path2.addCircle(f10 - org.telegram.messenger.i0.L(18.0f), c3.i0.B(measuredHeight, f17, 2.0f, f17), org.telegram.messenger.m5.A(f44, f45, 1.1f, f14), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f16 = f44;
                                                f18 = 0.0f;
                                                j12 = j11;
                                                canvas.drawRoundRect(f45, f17, f16, measuredHeight, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j12 = j11;
                                                f16 = f10;
                                                f17 = f7;
                                                path2 = path;
                                                f18 = 0.0f;
                                                canvas.drawRoundRect(f13, f17, f16, measuredHeight, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
                                            }
                                        }
                                        i10++;
                                        c11 = c10;
                                        j11 = j12;
                                        f7 = f17;
                                        f10 = f16;
                                        path3 = path2;
                                        f20 = f11;
                                        f21 = f18;
                                        z10 = z12;
                                    }
                                }
                            }
                            j11 = j10;
                            float f212 = 0.0f;
                            if (z11) {
                            }
                            i10 = 0;
                            while (i10 < 2) {
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    j11 = j10;
                    float f2122 = 0.0f;
                    if (z11) {
                    }
                    i10 = 0;
                    while (i10 < 2) {
                    }
                }
                f19 = f20;
                invalidate();
            } else {
                f19 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.U == 0 && (jjVar = MediaController.B().u0) != null) {
                float f46 = -org.telegram.messenger.i0.N(f19);
                float T1 = org.telegram.messenger.i0.T1(f46, org.telegram.messenger.i0.N(f19) + getMeasuredWidth(), jjVar.b0);
                float measuredHeight2 = getMeasuredHeight();
                float N = measuredHeight2 - org.telegram.messenger.i0.N(2.0f);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vl, this.q0);
                Paint paint2 = this.Q0;
                paint2.setColor(w02);
                canvas.drawRoundRect(f46, N, T1, measuredHeight2, org.telegram.messenger.i0.N(f19), org.telegram.messenger.i0.N(f19), paint2);
            }
            this.P0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        th.s0 s0Var = th.s0.W;
        e2.f fVar = this.u0;
        int i10 = 8;
        int i11 = 6;
        if (s0Var != null) {
            b();
            int i12 = this.U;
            if (6 != i12 && this.f != null && !z10) {
                this.x0 = true;
                return;
            }
            if (6 != i12 && this.T && !z10) {
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
                this.f.setInterpolator(gr.f);
                this.f.addListener(new t00(this, 7));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
                setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(gr.f);
                    this.f.addListener(new t00(this, i10));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.T;
            if (z11 && ((z10 && this.U == -1) || this.U == 6)) {
                this.T = false;
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
                    this.f.setInterpolator(gr.f);
                    this.f.addListener(new t00(this, i11));
                    this.f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        th.s0 s0Var2 = th.s0.W;
        if (s0Var2 == null || this.U != 6) {
            return;
        }
        w00 w00Var = this.d;
        TLRPC.GroupCall groupCall = s0Var2.w;
        w00Var.setText(org.telegram.messenger.cd.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        TLRPC.User user;
        int i11;
        String format;
        gg ggVar = this.n;
        if (ggVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = ggVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) org.telegram.messenger.nd.f(currentAccount).c.f(a2);
        int i12 = 1;
        if (!this.r0) {
            org.telegram.messenger.nd f7 = org.telegram.messenger.nd.f(currentAccount);
            a0.h hVar = f7.G;
            if (hVar.h(a2) < 0) {
                hVar.k(Boolean.TRUE, a2);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f7.getMessagesController().i1(a2);
                tL_messages_getRecentLocations.limit = 100;
                f7.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.s4(f7, a2, i12));
            }
            this.r0 = true;
        }
        if (arrayList != null) {
            long e = org.telegram.messenger.d20.i(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i11 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i13);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long C1 = org.telegram.messenger.jj.C1(message.from_id);
                    if (user == null && C1 != e) {
                        user = org.telegram.messenger.vp.r1(currentAccount).Z1(Long.valueOf(C1));
                    }
                    i11++;
                }
            }
            i10 = 0;
        } else {
            i10 = 0;
            user = null;
            i11 = 0;
        }
        if (this.s0 == i11) {
            return;
        }
        this.s0 = i11;
        String L0 = org.telegram.messenger.cd.L0(2131748850, null);
        if (i11 == 0) {
            format = L0;
        } else {
            int i14 = i11 - 1;
            if (!org.telegram.messenger.nd.f(currentAccount).i(a2)) {
                int i15 = i10;
                if (i14 != 0) {
                    String j10 = org.telegram.messenger.h20.j(user, true);
                    String G = org.telegram.messenger.cd.G(i14, "AndOther", new Object[i15]);
                    Object[] objArr = new Object[3];
                    objArr[i15] = L0;
                    objArr[1] = j10;
                    objArr[2] = G;
                    format = String.format("%1$s - %2$s %3$s", objArr);
                } else {
                    String j11 = org.telegram.messenger.h20.j(user, true);
                    Object[] objArr2 = new Object[2];
                    objArr2[i15] = L0;
                    objArr2[1] = j11;
                    format = String.format("%1$s - %2$s", objArr2);
                }
            } else if (i14 == 0) {
                String L02 = org.telegram.messenger.cd.L0(2131752184, null);
                Object[] objArr3 = new Object[2];
                objArr3[i10] = L0;
                objArr3[1] = L02;
                format = String.format("%1$s - %2$s", objArr3);
            } else if (i14 != 1 || user == null) {
                String L03 = org.telegram.messenger.cd.L0(2131752184, null);
                int i16 = i10;
                String G2 = org.telegram.messenger.cd.G(i14, "AndOther", new Object[i16]);
                Object[] objArr4 = new Object[3];
                objArr4[i16] = L0;
                objArr4[1] = L03;
                objArr4[2] = G2;
                format = String.format("%1$s - %2$s %3$s", objArr4);
            } else {
                Object[] objArr5 = new Object[1];
                objArr5[i10] = org.telegram.messenger.h20.j(user, true);
                String a02 = org.telegram.messenger.cd.a0("SharingYouAndOtherName", null, 2131745386, objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i10] = L0;
                objArr6[1] = a02;
                format = String.format("%1$s - %2$s", objArr6);
            }
        }
        if (format.equals(this.V)) {
            return;
        }
        this.V = format;
        int indexOf = format.indexOf(L0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i17 = 0;
        while (i17 < 2) {
            w00 w00Var = this.d;
            TextView textView = i17 == 0 ? w00Var.getTextView() : w00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i17++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t7, this.q0)), indexOf, L0.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        gg ggVar;
        SpannableStringBuilder spannableStringBuilder;
        int i10 = 3;
        if (this.T) {
            int i11 = this.U;
            if (i11 == 1 || i11 == 3) {
                return;
            }
            if ((i11 == 4 || i11 == 5) && !j()) {
                return;
            }
        }
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        View fragmentView = this.h.getFragmentView();
        boolean z11 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean z12 = this.T;
        e2.f fVar = this.u0;
        if (jjVar == null || jjVar.f1() == 0 || org.telegram.messenger.jj.L4(jjVar.k)) {
            this.R = null;
            boolean z13 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || g20.c()) ? false : true;
            if (!j() && !z13 && (ggVar = this.n) != null && !g20.c()) {
                org.telegram.messenger.u3 groupCall = ggVar.getGroupCall();
                z13 = groupCall != null && groupCall.y();
            }
            if (z13) {
                a(false);
                return;
            }
            if (!this.T) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.t0 t0Var = this.G;
            if (t0Var != null && t0Var.x()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z11) {
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
            b10 b10Var = this.p0;
            if (b10Var != null) {
                ((wp0) b10Var).b(true);
            }
            this.f.addListener(new t00(this, 2));
            this.f.start();
            return;
        }
        b();
        int i12 = this.U;
        if (i12 != 0 && this.f != null && !z11) {
            this.y0 = true;
            return;
        }
        r(0);
        if (z11 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
            b10 b10Var2 = this.p0;
            if (b10Var2 != null) {
                ((wp0) b10Var2).b(true);
                ((wp0) this.p0).b(false);
            }
        }
        if (!this.T) {
            if (!z11) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                fVar.d();
                this.f = new AnimatorSet();
                b10 b10Var3 = this.p0;
                if (b10Var3 != null) {
                    ((wp0) b10Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.i0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new t00(this, i10));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (MediaController.B().H()) {
            this.c.a(false, !z11);
            this.b.setContentDescription(org.telegram.messenger.cd.L0(2131754929, null));
        } else {
            this.c.a(true, !z11);
            this.b.setContentDescription(org.telegram.messenger.cd.L0(2131754930, null));
        }
        if (this.R == jjVar && i12 == 0) {
            return;
        }
        this.R = jjVar;
        if (org.telegram.messenger.jj.R4(jjVar.k) || this.R.h4()) {
            this.W = false;
            org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
            if (t0Var2 != null) {
                t0Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, org.telegram.messenger.i0.L(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(a1.g.C(jjVar.x1(true), " ", jjVar.z1(true)));
            int i13 = 0;
            while (i13 < 2) {
                w00 w00Var = this.d;
                TextView textView = i13 == 0 ? w00Var.getTextView() : w00Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i13++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G == null) {
                this.d.setPadding(0, 0, this.N, 0);
            } else if (jjVar.L0() >= 600.0d) {
                this.G.setAlpha(1.0f);
                this.G.setEnabled(true);
                this.d.setPadding(0, 0, org.telegram.messenger.i0.L(44.0f) + this.N, 0);
                q(false);
            } else {
                this.G.setAlpha(0.0f);
                this.G.setEnabled(false);
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a1.g.C(jjVar.x1(true), " - ", jjVar.z1(true)));
            int i14 = 0;
            while (i14 < 2) {
                w00 w00Var2 = this.d;
                TextView textView2 = i14 == 0 ? w00Var2.getTextView() : w00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i14++;
            }
        }
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t7, this.q0)), 0, jjVar.x1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z11 && z12 && this.W);
    }

    public lc getCapsuleBlobDrawable() {
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
        int i10 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.p6 p6Var = this.q0;
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), false, this.q0);
        this.G = t0Var;
        if (t0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.a7.t(this.G.getIconView(), i10, p6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(org.telegram.messenger.i0.L(30.0f));
        int i11 = 0;
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(org.telegram.messenger.cd.L0(2131754805, null));
        this.G.setDelegate(new o00(this));
        org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
        jh.g gVar = new jh.g();
        this.H = gVar;
        t0Var2.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(getContext(), p6Var);
        this.I = x0Var;
        x0Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.r0 z10 = this.G.z(0, R.drawable.msg_speed_slow, org.telegram.messenger.cd.L0(2131745284, null));
        org.telegram.ui.ActionBar.r0[] r0VarArr = this.J;
        r0VarArr[0] = z10;
        r0VarArr[1] = this.G.z(1, R.drawable.msg_speed_normal, org.telegram.messenger.cd.L0(2131745285, null));
        r0VarArr[2] = this.G.z(2, R.drawable.msg_speed_medium, org.telegram.messenger.cd.L0(2131745286, null));
        r0VarArr[3] = this.G.z(3, R.drawable.msg_speed_fast, org.telegram.messenger.cd.L0(2131745288, null));
        int i12 = 4;
        r0VarArr[4] = this.G.z(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.cd.L0(2131745282, null));
        r0VarArr[5] = this.G.z(5, R.drawable.msg_speed_superfast, org.telegram.messenger.cd.L0(2131745283, null));
        if (org.telegram.messenger.i0.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(org.telegram.messenger.i0.L(8.0f));
        addView(this.G, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new sr(i12, this, fArr));
        this.G.setOnLongClickListener(new r00(this, i11));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.U;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.md mdVar) {
        if (mdVar != null) {
            org.telegram.ui.ActionBar.k2 k2Var = this.h;
            if (k2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) k2Var.getParentActivity();
                launchActivity.O0(mdVar.h.I1);
                org.telegram.ui.yb0 yb0Var = new org.telegram.ui.yb0(2);
                yb0Var.H0(mdVar.h);
                yb0Var.N0 = new m4.x0(mdVar, org.telegram.messenger.jj.B0(mdVar.h.k), 3);
                launchActivity.t0(yb0Var);
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
    public final void l(float f7, float f10, boolean z10) {
        String a02;
        if (i(f7, f10)) {
            return;
        }
        float abs = Math.abs(f10 - 1.0f);
        int i10 = R.raw.speed_fast;
        if (abs < 0.05f) {
            if (f7 < f10) {
                return;
            }
            a02 = org.telegram.messenger.cd.L0(2131753901, null);
            if (Math.abs(f7 - 2.0f) < 0.05f) {
                i10 = R.raw.speed_2to1;
            }
        } else if (z10 && i(f10, 1.5f) && i(f7, 1.0f)) {
            a02 = org.telegram.messenger.cd.a0("AudioSpeedCustom", null, 2131753903, jh.g.a(f10));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
            a02 = org.telegram.messenger.cd.L0(2131753902, null);
            i10 = R.raw.speed_15to2;
        } else {
            a02 = org.telegram.messenger.cd.a0("AudioSpeedCustom", null, 2131753903, jh.g.a(f10));
        }
        cc.a0(this.h).Q(i10, 36, a02).j();
    }

    public final void m() {
        xa.n nVar = this.L0;
        if (nVar != null) {
            nVar.a();
            this.L0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            org.telegram.messenger.vs[] vsVarArr = this.K0;
            org.telegram.messenger.vs vsVar = vsVarArr[i10];
            if (vsVar != null) {
                vsVar.a();
                vsVarArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.g gVar = this.O;
        if (gVar == null || gVar.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            org.telegram.messenger.i0.h3(new s00(this, 0), 150L);
        }
    }

    public final void o(boolean z10) {
        org.telegram.messenger.u3 u3Var;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        t8 t8Var = this.b0.a;
        if (t8Var.f != null) {
            t8Var.g = true;
            return;
        }
        int i11 = this.U;
        int i12 = this.n0;
        gg ggVar = this.n;
        if (i11 == 4) {
            if (ggVar != null) {
                u3Var = ggVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                u3Var = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            u3Var = VoIPService.getSharedInstance().groupCall;
            user = ggVar != null ? null : VoIPService.getSharedInstance().getUser();
            i10 = VoIPService.getSharedInstance().getAccount();
        } else {
            u3Var = null;
            i10 = i12;
            user = null;
        }
        if (u3Var != null) {
            ArrayList arrayList = u3Var.e;
            int size = arrayList.size();
            for (int i13 = 0; i13 < 3; i13++) {
                if (i13 < size) {
                    this.b0.b(i13, i10, (TLObject) arrayList.get(i13));
                } else {
                    this.b0.b(i13, i10, null);
                }
            }
        } else if (user != null) {
            this.b0.b(0, i10, user);
            for (int i14 = 1; i14 < 3; i14++) {
                this.b0.b(i14, i10, null);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.b0.b(i15, i10, null);
            }
        }
        this.b0.a(z10);
        if (this.U != 4 || u3Var == null) {
            return;
        }
        int min = u3Var.b.rtmp_stream ? 0 : Math.min(3, u3Var.e.size());
        int e = (min == 0 ? 10 : i0.a.e(min, 1, 24, 52)) + 3;
        if (z10) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (org.telegram.messenger.i0.L(e) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - org.telegram.messenger.i0.L(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                gr grVar = gr.f;
                duration.setInterpolator(grVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(grVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f7 = e;
        this.d.setLayoutParams(w7.b6.d(-1, 20.0f, 51, f7, 5.0f, u3Var.j() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(w7.b6.d(-1, 20.0f, 51, f7, 25.0f, u3Var.j() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            xa.n nVar = new xa.n(org.telegram.messenger.zs.e(), this);
            nVar.e(org.telegram.messenger.zs.D4);
            nVar.e(org.telegram.messenger.zs.F4);
            this.L0 = nVar;
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                xa.n nVar2 = new xa.n(org.telegram.messenger.zs.f(i10), this);
                nVar2.e(org.telegram.messenger.zs.f2);
                nVar2.e(org.telegram.messenger.zs.g2);
                nVar2.e(org.telegram.messenger.zs.h2);
                nVar2.e(org.telegram.messenger.zs.w2);
                nVar2.e(org.telegram.messenger.zs.C2);
                nVar2.e(org.telegram.messenger.zs.v1);
                nVar2.e(org.telegram.messenger.zs.G2);
                nVar2.e(org.telegram.messenger.zs.e2);
                this.K0[i10] = nVar2;
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            xa.n nVar3 = new xa.n(org.telegram.messenger.zs.e(), this);
            nVar3.e(org.telegram.messenger.zs.J4);
            nVar3.e(org.telegram.messenger.zs.v2);
            nVar3.e(org.telegram.messenger.zs.D2);
            nVar3.e(org.telegram.messenger.zs.O4);
            nVar3.e(org.telegram.messenger.zs.N4);
            nVar3.e(org.telegram.messenger.zs.F2);
            this.L0 = nVar3;
            if (th.s0.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || g20.c()) {
                gg ggVar = this.n;
                if (ggVar != null && this.h.getSendMessagesHelper().B(ggVar.a()) != null && !j()) {
                    c(true);
                } else if (ggVar == null || ggVar.getGroupCall() == null || !ggVar.getGroupCall().y() || g20.c() || j()) {
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
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.t6.G0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            lc lcVar = this.a;
            if (!lcVar.u) {
                lcVar.u = true;
                lcVar.t = SystemClock.elapsedRealtime();
                rf.g.d().a(60, lcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z10 && this.D != null) {
                this.P = z10;
                this.E.P(z10 ? 15 : 29);
                bi0 bi0Var = this.E;
                bi0Var.N(bi0Var.f - 1, false, true);
                this.D.invalidate();
            }
        } else if (i11 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.P;
        lc lcVar = this.a;
        if (z11 != z10) {
            this.P = z10;
            this.E.P(z10 ? 15 : 29);
            bi0 bi0Var = this.E;
            bi0Var.N(bi0Var.f - 1, false, true);
            this.D.invalidate();
            org.telegram.ui.ActionBar.t6.G0().c(this.T);
            lcVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.t6.G0().a(0.0f);
            lcVar.f(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
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
            org.telegram.messenger.i0.r(this.m0);
            this.l0 = false;
        }
        this.T = false;
        this.u0.e();
        this.S = 0.0f;
        m();
        if (!this.o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            d10 G0 = org.telegram.ui.ActionBar.t6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            lc lcVar = this.a;
            if (lcVar.u) {
                lcVar.u = false;
                rf.g.d().f(lcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, org.telegram.messenger.i0.M(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.w == null) {
            return;
        }
        int i10 = this.U;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.V0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.U0.l(new a10(this.w, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.V0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.V0 = i11;
            if (i11 == 0) {
                this.U0.l(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public final void p() {
        org.telegram.messenger.u3 u3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.U;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.cd.L0(2131743418, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (u3Var = sharedInstance.groupCall) != null) {
                    if (u3Var.e.size() <= 1) {
                        this.d.b(org.telegram.messenger.cd.L0(2131751823, null), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.e.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(org.telegram.messenger.o5.s(sharedInstance.getAccount(), org.telegram.messenger.o5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i11)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb2.append(" ");
                        sb2.append(org.telegram.messenger.cd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                gg ggVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ggVar == null || ggVar.j() == null || ggVar.j().id != user.id) {
                            this.d.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(org.telegram.messenger.cd.L0(2131746063, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (ggVar == null || ggVar.g() == null || ggVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = ggVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(org.telegram.messenger.cd.L0(2131743474, null), false);
                } else if (org.telegram.messenger.w3.W(g10)) {
                    this.d.b(org.telegram.messenger.cd.L0(2131743474, null), false);
                } else {
                    this.d.b(org.telegram.messenger.cd.L0(2131743333, null), false);
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.H == null) {
            return;
        }
        float C = MediaController.B().C(this.W);
        this.H.n(z10, C);
        updateColors();
        boolean z11 = this.A0;
        int i10 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.r0[] r0VarArr = this.J;
            if (i10 >= r0VarArr.length) {
                this.I.e(z10, C);
                return;
            }
            org.telegram.ui.ActionBar.p6 p6Var = this.q0;
            if (z11 || Math.abs(C - W0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.r0 r0Var = r0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.t6.E8;
                r0Var.a(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            } else {
                org.telegram.ui.ActionBar.r0 r0Var2 = r0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.t6.Ei;
                r0Var2.a(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.U == i10) {
            return;
        }
        b();
        int i11 = this.U;
        lc lcVar = this.a;
        if (i11 == 3 || i11 == 1) {
            d10 G0 = org.telegram.ui.ActionBar.t6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            if (lcVar.u) {
                lcVar.u = false;
                rf.g.d().f(lcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            fe.m mVar = this.U0;
            if (mVar != null) {
                mVar.l(null, true);
            }
        }
        this.U = i10;
        this.s.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.h0 = false;
        }
        u8 u8Var = this.b0;
        if (u8Var != null) {
            u8Var.setStyle(this.U);
            this.b0.setLayoutParams(w7.b6.e(org.telegram.messenger.zs.t1, getStyleHeight(), 51));
        }
        this.s.setLayoutParams(w7.b6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f7 = this.S;
        if (f7 > 0.0f && f7 != org.telegram.messenger.i0.M(getStyleHeight())) {
            setTopPadding(org.telegram.messenger.i0.M(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.q0;
        if (i10 == 6) {
            this.x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            this.s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.bl, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.cl, p6Var)}));
            this.s.setTag(null);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.D.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.b0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.A7));
            int i12 = 0;
            while (i12 < 2) {
                w00 w00Var = this.d;
                TextView textView = i12 == 0 ? w00Var.getTextView() : w00Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A7, p6Var);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(w7.b6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.v7));
            int i13 = 0;
            while (i13 < 2) {
                w00 w00Var2 = this.d;
                TextView textView2 = i13 == 0 ? w00Var2.getTextView() : w00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.u7, p6Var);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.u7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.D.setVisibility(8);
            this.b0.setVisibility(8);
            this.y.setVisibility(0);
            this.y.d();
            this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754900, null));
            org.telegram.ui.ActionBar.t0 t0Var = this.G;
            if (t0Var != null) {
                t0Var.setVisibility(8);
                this.G.setTag(null);
            }
            this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.v7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(0);
            this.b.setVisibility(0);
            this.D.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.b0.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                w00 w00Var3 = this.d;
                TextView textView3 = i14 == 0 ? w00Var3.getTextView() : w00Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.u7, p6Var);
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.F.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754755, null));
                    return;
                }
                this.b.setLayoutParams(w7.b6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(w7.b6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(0);
                    this.G.setTag(1);
                }
                this.F.setContentDescription(org.telegram.messenger.cd.L0(2131754900, null));
                return;
            }
        }
        if (i10 == 4) {
            this.x.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.v7));
            this.D.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                w00 w00Var4 = this.d;
                TextView textView4 = i15 == 0 ? w00Var4.getTextView() : w00Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.t7, p6Var);
                    textView4.setTypeface(org.telegram.messenger.i0.o());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.t7));
            this.d.setPadding(0, 0, this.N, 0);
            this.y.setVisibility(8);
            this.y.i();
            gg ggVar = this.n;
            this.b0.setVisibility(!((ggVar == null || ggVar.getGroupCall() == null || ggVar.getGroupCall().b == null || !ggVar.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(-org.telegram.messenger.i0.L(36.0f));
                this.e.setTranslationX(-org.telegram.messenger.i0.L(36.0f));
            }
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.t0 t0Var3 = this.G;
            if (t0Var3 != null) {
                t0Var3.setVisibility(8);
                this.G.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.x.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.b0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.D.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.P = z10;
            this.E.P(z10 ? 15 : 29);
            bi0 bi0Var = this.E;
            bi0Var.N(bi0Var.f - 1, false, true);
            this.D.invalidate();
            this.s.setBackground(null);
            this.s.setBackgroundColor(0);
            this.y.setVisibility(8);
            this.y.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.t6.G0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!lcVar.u) {
                lcVar.u = true;
                lcVar.t = SystemClock.elapsedRealtime();
                rf.g.d().a(60, lcVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                w00 w00Var5 = this.d;
                TextView textView5 = i16 == 0 ? w00Var5.getTextView() : w00Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    org.telegram.ui.ActionBar.a7.V(textView5, org.telegram.ui.ActionBar.t6.A7, p6Var);
                    textView5.setTypeface(org.telegram.messenger.i0.o());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.t6.A7));
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.d.setLayoutParams(w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(org.telegram.messenger.i0.L(88.0f), 0, org.telegram.messenger.i0.L(88.0f) + this.N, 0);
            org.telegram.ui.ActionBar.t0 t0Var4 = this.G;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
                this.G.setTag(null);
            }
        }
    }

    public void setDelegate(b10 b10Var) {
        this.p0 = b10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.R0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.s == null) {
            this.T0 = f7;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        ei0 ei0Var = this.y;
        if (ei0Var != null) {
            ei0Var.setTranslationX(f7);
        }
        w00 w00Var = this.d;
        if (w00Var != null) {
            w00Var.setTranslationX(f7);
        }
        w00 w00Var2 = this.e;
        if (w00Var2 != null) {
            w00Var2.setTranslationX(f7);
        }
        u8 u8Var = this.b0;
        if (u8Var != null) {
            u8Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.a0 = z10;
    }

    public void setTopPadding(float f7) {
        this.S = f7;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.S);
        if (i10 == 8) {
            this.P0 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        x41[] x41VarArr;
        lc lcVar = this.a;
        int i10 = lcVar.A;
        if (i10 >= 0) {
            lcVar.E = 1.0f;
            lcVar.a(lc.e(i10));
        }
        int i11 = !i(MediaController.B().C(this.W), 1.0f) ? org.telegram.ui.ActionBar.t6.Ei : org.telegram.ui.ActionBar.t6.x7;
        org.telegram.ui.ActionBar.p6 p6Var = this.q0;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        jh.g gVar = this.H;
        if (gVar != null) {
            ((e6) gVar.b).u(w02);
            Paint paint = (Paint) gVar.c;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.G;
        if (t0Var != null) {
            Drawable background = t0Var.getBackground();
            if (background == null || background != this.E0) {
                org.telegram.ui.ActionBar.t0 t0Var2 = this.G;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(436207615 & w02, 1, org.telegram.messenger.i0.L(14.0f));
                this.E0 = h02;
                t0Var2.setBackground(h02);
                this.J0 = w02;
            } else if (w02 != this.J0) {
                this.J0 = w02;
                org.telegram.ui.ActionBar.t6.H1(background, w02 & 436207615, true);
            }
        }
        if (this.b != null) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.w7, p6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.x7, p6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            int i12 = 0;
            while (i12 < 2) {
                w00 w00Var = this.e;
                TextView textView = i12 == 0 ? w00Var.getTextView() : w00Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.x7, p6Var));
                }
                i12++;
            }
        }
        w00 w00Var2 = this.d;
        if (w00Var2 != null) {
            Object tag = w00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i13 = 0;
                while (i13 < 2) {
                    w00 w00Var3 = this.d;
                    TextView textView2 = i13 == 0 ? w00Var3.getTextView() : w00Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(intValue, p6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (x41VarArr = (x41[]) ((Spanned) text).getSpans(0, text.length(), x41.class)) != null) {
                            for (x41 x41Var : x41VarArr) {
                                x41Var.b = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.t7, p6Var);
                            }
                        }
                    }
                    i13++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.k2 k2Var, View view, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = new lc();
        this.J = new org.telegram.ui.ActionBar.r0[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new e6(false, true, true);
        this.m0 = new u00(this);
        this.n0 = org.telegram.messenger.d20.s0;
        this.s0 = -1;
        this.t0 = new ew(this, 2);
        this.u0 = new e2.f(null);
        this.v0 = new e2.f(new int[]{org.telegram.messenger.zs.D});
        this.K0 = new org.telegram.messenger.vs[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new fe.m(new o00(this), gr.h, 450L);
        this.V0 = 0;
        this.q0 = p6Var;
        this.h = k2Var;
        if (k2Var instanceof gg) {
            this.n = (gg) k2Var;
        }
        this.r = view;
        this.T = true;
        this.o0 = z10;
        if (view == null) {
            ((ViewGroup) k2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
