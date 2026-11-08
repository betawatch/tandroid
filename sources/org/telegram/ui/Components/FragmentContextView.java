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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements org.telegram.messenger.ls, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.a6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public fi.m3 B0;
    public ViewGroup C0;
    public l00 D;
    public long D0;
    public zg0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.r0 G;
    public PorterDuffColorFilter G0;
    public du0 H;
    public int H0;
    public org.telegram.ui.ActionBar.v0 I;
    public int I0;
    public final org.telegram.ui.ActionBar.p0[] J;
    public int J0;
    public FrameLayout K;
    public final org.telegram.messenger.ms[] K0;
    public ImageView L;
    public ab.b0 L0;
    public org.telegram.ui.ActionBar.m2 M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.n O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public org.telegram.messenger.ij R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final te.j U0;
    public String V;
    public int V0;
    public boolean W;
    public final sc a;
    public boolean a0;
    public ImageView b;
    public z8 b0;
    public he0 c;
    public Paint c0;
    public j00 d;
    public LinearGradient d0;
    public j00 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.f2 h;
    public boolean h0;
    public boolean i0;
    public final i6 j0;
    public ic k0;
    public boolean l0;
    public final h00 m0;
    public final kg n;
    public final int n0;
    public final boolean o0;
    public n00 p0;
    public final org.telegram.ui.ActionBar.f6 q0;
    public final View r;
    public boolean r0;
    public i00 s;
    public int s0;
    public final et t0;
    public final h2.f u0;
    public final h2.f v0;
    public di.a4 w;
    public boolean w0;
    public View x;
    public boolean x0;
    public ch0 y;
    public boolean y0;
    public boolean z0;

    public FragmentContextView(Context context, org.telegram.ui.ww wwVar, boolean z9) {
        this(context, wwVar, null, z9, null);
    }

    private int getTitleTextColor() {
        int i7 = this.U;
        org.telegram.ui.ActionBar.f6 f6Var = this.q0;
        return i7 == 4 ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, f6Var) : (i7 == 1 || i7 == 3) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A7, f6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.u7, f6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static boolean j() {
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        return ijVar != null && org.telegram.messenger.ij.S4(ijVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z9) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.r3 groupCall;
        org.telegram.messenger.r3 r3Var;
        int i7;
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.h;
        View fragmentView = f2Var.getFragmentView();
        boolean z12 = (z9 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z9 : true;
        boolean d = p10.d();
        kg kgVar = this.n;
        if (d) {
            z10 = false;
        } else {
            z10 = (org.telegram.ui.c40.v5 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (r3Var = sharedInstance.groupCall) != null && (r3Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z10 = false;
            }
            if (j() || org.telegram.ui.c40.v5 || !this.a0 || z10 || kgVar == null || (groupCall = kgVar.getGroupCall()) == null || !groupCall.y()) {
                z11 = false;
                h2.f fVar = this.u0;
                int i11 = 8;
                if (z10) {
                    boolean z13 = this.T;
                    if (z13 && ((z12 && this.U == -1) || (i10 = this.U) == 4 || i10 == 3 || i10 == 1)) {
                        this.T = false;
                        if (z12) {
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
                            this.f.setInterpolator(xq.f);
                            this.f.addListener(new g00(this, i11));
                            this.f.start();
                        }
                    } else if (z13 && ((i7 = this.U) == -1 || i7 == 4 || i7 == 3 || i7 == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z12 || kgVar == null || !kgVar.J() || p10.d()) {
                        return;
                    }
                    org.telegram.messenger.k5.o(null, 2131749153, hc.a0(f2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z11 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.U;
                if (i12 != i13 && this.f != null && !z12) {
                    this.w0 = true;
                    return;
                }
                if (i12 != i13 && this.T && !z12) {
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
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new g00(this, 9));
                    this.f.start();
                    return;
                }
                if (z11) {
                    boolean z14 = i13 == 4 && this.T;
                    r(4);
                    org.telegram.messenger.r3 groupCall2 = kgVar.getGroupCall();
                    TLRPC.Chat g10 = kgVar.g();
                    if (groupCall2.j()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(org.telegram.messenger.g0.L(14.0f));
                            this.g0.setTypeface(org.telegram.messenger.g0.o());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        org.telegram.messenger.id.M0(2131743443, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (org.telegram.messenger.t3.W(g10)) {
                            this.d.b(org.telegram.messenger.id.M0(2131743464, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.id.M0(2131743343, null), false);
                        }
                        this.e.b(org.telegram.messenger.id.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(org.telegram.messenger.id.M0(2131743445, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(org.telegram.messenger.id.M0(2131743450, null), false);
                        } else if (org.telegram.messenger.t3.W(g10)) {
                            this.d.b(org.telegram.messenger.id.M0(2131743450, null), false);
                        } else {
                            this.d.b(org.telegram.messenger.id.M0(2131743309, null), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.id.M0(groupCall4.rtmp_stream ? 2131743538 : 2131748615, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.id.G(i14, groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                        this.s.invalidate();
                    }
                    o(this.b0.a.d && z14);
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
                if (z12) {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new g00(this, 10));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z10 = true;
        }
        z11 = z10;
        h2.f fVar2 = this.u0;
        int i112 = 8;
        if (z10) {
        }
    }

    public final void b() {
        if (this.s != null) {
            return;
        }
        Context context = getContext();
        i00 i00Var = new i00(this, context);
        this.s = i00Var;
        this.k0 = new ic(i00Var);
        int i7 = org.telegram.messenger.g0.q.x;
        i6 i6Var = this.j0;
        i6Var.M = i7;
        i6Var.A = 0.4f;
        i6Var.setCallback(i00Var);
        i6Var.u(-1);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        addView(this.s, c8.ha.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.x = view;
        this.s.addView(view, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i10 = org.telegram.ui.ActionBar.k6.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f6 f6Var = this.q0;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, f6Var, mode);
        ImageView imageView3 = this.b;
        he0 he0Var = new he0(16);
        this.c = he0Var;
        imageView3.setImageDrawable(he0Var);
        final int i11 = 1;
        this.b.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        addView(this.b, c8.ha.e(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i13;
                long j3;
                TL_stories.StoryItem u10;
                int i14 = i12;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        kg kgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131744838, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.id.M0(2131744840, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToGroupText", null, 2131744839, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToUserText", null, 2131744837, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.id.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new b00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        kg kgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.U;
                        if (i15 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.b;
                                int i16 = g1Var.e;
                                if (i16 != org.telegram.messenger.p10.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i16);
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i16).P1().u(g1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i16).G(i16, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i15 == 0) {
                            org.telegram.messenger.ij ijVar = MediaController.B().u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.ij.B0(ijVar.k) == (kgVar2 != null ? kgVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ijVar.f1());
                                    f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                    break;
                                }
                            }
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i15 == 2) {
                            int i17 = org.telegram.messenger.p10.s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i13 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.sd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i18).I.get(0);
                                            j3 = rdVar.a;
                                            i13 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i13 = i17;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i13).h(j3));
                                break;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new b00(fragmentContextView), f6Var3));
                                break;
                            }
                        } else if (i15 != 3) {
                            if (i15 == 4) {
                                if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z9 = true;
                                    }
                                    org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i15 == 5) {
                                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                                if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                    l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                    l30Var.H0 = new p0(fragmentContextView, 7);
                                    f2Var2.showDialog(l30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        ch0 ch0Var = new ch0(context);
        this.y = ch0Var;
        ch0Var.setScaleType(scaleType);
        this.y.setAutoRepeat(true);
        this.y.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.r6.C(this.y, org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.k6.w0(i10, f6Var)), org.telegram.ui.ActionBar.r6.N(i10), f6Var);
        addView(this.y, c8.ha.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final int i13 = 0;
        j00 j00Var = new j00(this, context, context, i13);
        this.d = j00Var;
        addView(j00Var, c8.ha.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        j00 j00Var2 = new j00(this, context, context, i11);
        this.e = j00Var2;
        addView(j00Var2, c8.ha.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.O = nVar;
        nVar.g = 1.0f;
        nVar.j = false;
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(2, context, this);
        this.M = m2Var;
        m2Var.setText(org.telegram.messenger.id.M0(2131743445, null));
        org.telegram.ui.ActionBar.r6.V(this.M, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        org.telegram.ui.ActionBar.m2 m2Var2 = this.M;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Ci;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i14, f6Var);
        int i15 = org.telegram.ui.ActionBar.k6.Ei;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i15, f6Var);
        org.telegram.ui.ActionBar.r6.R(m2Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i14), org.telegram.ui.ActionBar.r6.N(i15), f6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(org.telegram.messenger.g0.o());
        this.M.setGravity(17);
        this.M.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        addView(this.M, c8.ha.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i16 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i16;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        kg kgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131744838, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.id.M0(2131744840, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToGroupText", null, 2131744839, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToUserText", null, 2131744837, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.id.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new b00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        kg kgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i152 = fragmentContextView.U;
                        if (i152 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.b;
                                int i162 = g1Var.e;
                                if (i162 != org.telegram.messenger.p10.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i162);
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i162).P1().u(g1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i162).G(i162, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i152 == 0) {
                            org.telegram.messenger.ij ijVar = MediaController.B().u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.ij.B0(ijVar.k) == (kgVar2 != null ? kgVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ijVar.f1());
                                    f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                    break;
                                }
                            }
                        } else if (i152 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i152 == 2) {
                            int i17 = org.telegram.messenger.p10.s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i132 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!org.telegram.messenger.sd.f(i18).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i18).I.get(0);
                                            j3 = rdVar.a;
                                            i132 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i132 = i17;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i132).h(j3));
                                break;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new b00(fragmentContextView), f6Var3));
                                break;
                            }
                        } else if (i152 != 3) {
                            if (i152 == 4) {
                                if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z9 = true;
                                    }
                                    org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i152 == 5) {
                                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                                if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                    l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                    l30Var.H0 = new p0(fragmentContextView, 7);
                                    f2Var2.showDialog(l30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        int i17 = org.telegram.ui.ActionBar.k6.x7;
        org.telegram.ui.ActionBar.r6.t(imageView5, i17, f6Var, mode);
        this.K.addView(this.L, c8.ha.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i17, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.K.setContentDescription(org.telegram.messenger.id.M0(2131743852, null));
        this.K.setOnClickListener(new bi.l1(12));
        this.K.setVisibility(8);
        addView(this.K, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        z8 z8Var = new z8(context, false);
        this.b0 = z8Var;
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(21.0f));
        this.b0.setDelegate(new f00(this, 1));
        this.b0.setVisibility(8);
        addView(this.b0, c8.ha.e(org.telegram.messenger.qs.t1, 36, 51));
        this.E = new zg0(R.raw.voice_muted, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), true, null);
        l00 l00Var = new l00(this, context);
        this.D = l00Var;
        org.telegram.ui.ActionBar.r6.t(l00Var, org.telegram.ui.ActionBar.k6.A7, f6Var, PorterDuff.Mode.SRC_IN);
        this.D.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i17, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.D.setAnimation(this.E);
        this.D.setScaleType(scaleType);
        this.D.setVisibility(8);
        addView(this.D, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i18 = 4;
        this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i18;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        kg kgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131744838, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.id.M0(2131744840, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToGroupText", null, 2131744839, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToUserText", null, 2131744837, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.id.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new b00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        kg kgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i152 = fragmentContextView.U;
                        if (i152 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.b;
                                int i162 = g1Var.e;
                                if (i162 != org.telegram.messenger.p10.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i162);
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i162).P1().u(g1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i162).G(i162, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i152 == 0) {
                            org.telegram.messenger.ij ijVar = MediaController.B().u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.ij.B0(ijVar.k) == (kgVar2 != null ? kgVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ijVar.f1());
                                    f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                    break;
                                }
                            }
                        } else if (i152 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i152 == 2) {
                            int i172 = org.telegram.messenger.p10.s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i132 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i182 = 0; i182 < 4; i182++) {
                                        if (!org.telegram.messenger.sd.f(i182).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i182).I.get(0);
                                            j3 = rdVar.a;
                                            i132 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i132 = i172;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i132).h(j3));
                                break;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new b00(fragmentContextView), f6Var3));
                                break;
                            }
                        } else if (i152 != 3) {
                            if (i152 == 4) {
                                if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z9 = true;
                                    }
                                    org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i152 == 5) {
                                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                                if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                    l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                    l30Var.H0 = new p0(fragmentContextView, 7);
                                    f2Var2.showDialog(l30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        org.telegram.ui.ActionBar.r6.t(this.F, i17, f6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i17, f6Var) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i13;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        kg kgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131744838, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.id.M0(2131744840, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToGroupText", null, 2131744839, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToUserText", null, 2131744837, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.id.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new b00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        kg kgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i152 = fragmentContextView.U;
                        if (i152 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.b;
                                int i162 = g1Var.e;
                                if (i162 != org.telegram.messenger.p10.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i162);
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i162).P1().u(g1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i162).G(i162, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i152 == 0) {
                            org.telegram.messenger.ij ijVar = MediaController.B().u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.ij.B0(ijVar.k) == (kgVar2 != null ? kgVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ijVar.f1());
                                    f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                    break;
                                }
                            }
                        } else if (i152 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i152 == 2) {
                            int i172 = org.telegram.messenger.p10.s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i132 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i182 = 0; i182 < 4; i182++) {
                                        if (!org.telegram.messenger.sd.f(i182).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i182).I.get(0);
                                            j3 = rdVar.a;
                                            i132 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i132 = i172;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i132).h(j3));
                                break;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new b00(fragmentContextView), f6Var3));
                                break;
                            }
                        } else if (i152 != 3) {
                            if (i152 == 4) {
                                if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z9 = true;
                                    }
                                    org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i152 == 5) {
                                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                                if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                    l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                    l30Var.H0 = new p0(fragmentContextView, 7);
                                    f2Var2.showDialog(l30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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
        di.a4 a4Var = new di.a4(getContext(), 14);
        this.w = a4Var;
        addView(a4Var, c8.ha.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.c00
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                org.telegram.messenger.r3 groupCall;
                int i132;
                long j3;
                TL_stories.StoryItem u10;
                int i142 = i11;
                boolean z9 = false;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        kg kgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getParentActivity(), f6Var2);
                            String M0 = org.telegram.messenger.id.M0(2131744838, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.R = M0;
                            if (f2Var instanceof org.telegram.ui.ww) {
                                u1Var.T = org.telegram.messenger.id.M0(2131744840, null);
                            } else {
                                TLRPC.Chat g10 = kgVar.g();
                                TLRPC.User j10 = kgVar.j();
                                if (g10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToGroupText", null, 2131744839, g10.title));
                                } else if (j10 != null) {
                                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StopLiveLocationAlertToUserText", null, 2131744837, org.telegram.messenger.t10.j(j10, true)));
                                } else {
                                    u1Var.T = org.telegram.messenger.id.M0(2131754120, null);
                                }
                            }
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744844, null), new b00(fragmentContextView));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, f6Var2);
                                break;
                            }
                        } else {
                            MediaController.B().q(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        kg kgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.q0;
                        org.telegram.ui.ActionBar.f2 f2Var2 = fragmentContextView.h;
                        int i152 = fragmentContextView.U;
                        if (i152 == 6) {
                            di.g1 g1Var = di.g1.W;
                            if (g1Var != null) {
                                long j11 = g1Var.b;
                                int i162 = g1Var.e;
                                if (i162 != org.telegram.messenger.p10.s0) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i162);
                                    }
                                }
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                if (T != null && (u10 = org.telegram.messenger.qp.s1(i162).P1().u(g1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    T.getOrCreateStoryViewer(i162).G(i162, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i152 == 0) {
                            org.telegram.messenger.ij ijVar = MediaController.B().u0;
                            if (f2Var2 != null && ijVar != null) {
                                if (ijVar.J3()) {
                                    Activity W = org.telegram.messenger.g0.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new b8(W, f6Var3).show();
                                        break;
                                    } else if (org.telegram.messenger.g0.E1(LaunchActivity.G1)) {
                                        new b8(LaunchActivity.G1, f6Var3).show();
                                        break;
                                    }
                                } else if (org.telegram.messenger.ij.B0(ijVar.k) == (kgVar2 != null ? kgVar2.a() : 0L)) {
                                    fragmentContextView.n.l(ijVar.f1(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                                    Bundle bundle = new Bundle();
                                    if (org.telegram.messenger.m5.C(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (org.telegram.messenger.m5.E(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", ijVar.f1());
                                    f2Var2.presentFragment(new org.telegram.ui.an(bundle), f2Var2 instanceof org.telegram.ui.an);
                                    break;
                                }
                            }
                        } else if (i152 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i152 == 2) {
                            int i172 = org.telegram.messenger.p10.s0;
                            if (kgVar2 != null) {
                                j3 = kgVar2.a();
                                i132 = f2Var2.getCurrentAccount();
                            } else {
                                if (org.telegram.messenger.sd.g() == 1) {
                                    for (int i182 = 0; i182 < 4; i182++) {
                                        if (!org.telegram.messenger.sd.f(i182).I.isEmpty()) {
                                            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) org.telegram.messenger.sd.f(i182).I.get(0);
                                            j3 = rdVar.a;
                                            i132 = rdVar.h.I1;
                                        }
                                    }
                                }
                                i132 = i172;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(org.telegram.messenger.sd.f(i132).h(j3));
                                break;
                            } else {
                                f2Var2.showDialog(new at0(fragmentContextView.getContext(), new b00(fragmentContextView), f6Var3));
                                break;
                            }
                        } else if (i152 != 3) {
                            if (i152 == 4) {
                                if (f2Var2.getParentActivity() != null && (groupCall = kgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat M02 = f2Var2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                    TLRPC.GroupCall groupCall2 = groupCall.b;
                                    if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                        z9 = true;
                                    }
                                    org.telegram.ui.Components.voip.y1.l(M02, null, false, Boolean.valueOf(z9), f2Var2.getParentActivity(), f2Var2, f2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i152 == 5) {
                                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var2;
                                if (f2Var2.getSendMessagesHelper().B(anVar.a()) != null) {
                                    l30 l30Var = new l30(fragmentContextView.getContext(), null, anVar, f6Var3);
                                    l30Var.H0 = new p0(fragmentContextView, 7);
                                    f2Var2.showDialog(l30Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.c40.e1((LaunchActivity) fragmentContextView.getContext(), org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, chat)) {
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.E.P(fragmentContextView.P ? 15 : 29)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.D.d();
                            org.telegram.ui.ActionBar.k6.G0().c(true);
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

    public final void c(boolean z9) {
        int i7;
        kg kgVar = this.n;
        if (kgVar != null) {
            int i10 = 3;
            if (this.T && ((i7 = this.U) == 1 || i7 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.f2 f2Var = this.h;
            org.telegram.messenger.xy B = f2Var.getSendMessagesHelper().B(kgVar.a());
            View fragmentView = f2Var.getFragmentView();
            if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z9 = true;
            }
            Dialog visibleDialog = f2Var.getVisibleDialog();
            if ((j() || kgVar.q() || ((visibleDialog instanceof l30) && !((l30) visibleDialog).I)) && B != null) {
                B = null;
            }
            h2.f fVar = this.u0;
            if (B == null) {
                if (!this.T || ((!z9 || this.U != -1) && this.U != 5)) {
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.T = false;
                if (z9) {
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
                this.f.setInterpolator(xq.f);
                this.f.addListener(new g00(this, i10));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z9) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z9 && this.S == 0.0f) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                n00 n00Var = this.p0;
                if (n00Var != null) {
                    ((uo0) n00Var).b(true);
                    ((uo0) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z9) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    fVar.d();
                    this.f = new AnimatorSet();
                    n00 n00Var2 = this.p0;
                    if (n00Var2 != null) {
                        ((uo0) n00Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new g00(this, 4));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i12 = this.Q;
            int i13 = B.l;
            if (i12 != i13) {
                this.Q = i13;
                this.d.b(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("ImportUploading", null, 2131749223, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z9) {
        String G;
        String M0;
        org.telegram.ui.ActionBar.f2 f2Var = this.h;
        View fragmentView = f2Var.getFragmentView();
        if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z9 = true;
        }
        boolean z10 = f2Var instanceof org.telegram.ui.ww;
        int i7 = 0;
        boolean i10 = z10 ? org.telegram.messenger.sd.g() != 0 : org.telegram.messenger.sd.f(f2Var.getCurrentAccount()).i(this.n.a());
        et etVar = this.t0;
        if (!i10) {
            this.s0 = -1;
            org.telegram.messenger.g0.r(etVar);
            if (this.T || z9) {
                this.T = false;
                if (z9) {
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
                this.f.addListener(new g00(this, 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new no0(getContext(), 1));
        if (z9 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        if (!this.T) {
            if (!z9) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new g00(this, i7));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z10) {
            etVar.run();
            f();
            return;
        }
        String M02 = org.telegram.messenger.id.M0(2131748841, null);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.addAll(org.telegram.messenger.sd.f(i11).I);
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.rd rdVar = (org.telegram.messenger.rd) arrayList.get(0);
            long B0 = org.telegram.messenger.ij.B0(rdVar.h.k);
            if (org.telegram.messenger.m5.E(B0)) {
                G = org.telegram.messenger.t10.j(org.telegram.messenger.qp.s1(rdVar.h.I1).a2(Long.valueOf(B0)), true);
                M0 = org.telegram.messenger.id.M0(2131753965, null);
            } else {
                TLRPC.Chat M03 = org.telegram.messenger.qp.s1(rdVar.h.I1).M0(Long.valueOf(-B0));
                G = M03 != null ? M03.title : "";
                M0 = org.telegram.messenger.id.M0(2131753964, null);
            }
        } else {
            G = org.telegram.messenger.id.G(arrayList.size(), "Chats", new Object[0]);
            M0 = org.telegram.messenger.id.M0(2131753963, null);
        }
        String format = String.format(M0, M02, G);
        int indexOf = format.indexOf(M02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i12 = 0;
        while (i12 < 2) {
            j00 j00Var = this.d;
            TextView textView = i12 == 0 ? j00Var.getTextView() : j00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i12++;
        }
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.q0)), indexOf, M02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i7 == org.telegram.messenger.qs.D4) {
            d(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.G2) {
            e(false);
            return;
        }
        int i11 = org.telegram.messenger.qs.F4;
        kg kgVar = this.n;
        if (i7 == i11) {
            if (kgVar != null) {
                if (kgVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.h2 || i7 == org.telegram.messenger.qs.g2 || i7 == org.telegram.messenger.qs.f2 || i7 == org.telegram.messenger.qs.D2) {
            int i12 = this.U;
            if (i12 == 1 || i12 == 3 || i12 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i13 = org.telegram.messenger.qs.v2;
        if (i7 == i13 || i7 == org.telegram.messenger.qs.w2 || i7 == org.telegram.messenger.qs.F2) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i7 == i13) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.D == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.D.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i7 == org.telegram.messenger.qs.C2) {
            b();
            if (this.T && this.U == 4) {
                org.telegram.messenger.r3 groupCall = kgVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.j()) {
                        this.e.b(org.telegram.messenger.id.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i14 = groupCall2.participants_count;
                        if (i14 == 0) {
                            this.e.b(org.telegram.messenger.id.M0(groupCall2.rtmp_stream ? 2131743538 : 2131748615, null), false);
                        } else {
                            this.e.b(org.telegram.messenger.id.G(i14, groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.v1) {
            int i15 = this.U;
            if (i15 == 1 || i15 == 3 || i15 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.J4) {
            q(true);
            return;
        }
        int i16 = org.telegram.messenger.qs.N4;
        sc scVar = this.a;
        if (i7 == i16) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.M0, this.N0));
                scVar.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.O4) {
            if (i7 == org.telegram.messenger.qs.e2 && this.U == 0) {
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
            org.telegram.ui.ActionBar.k6.G0().a(Math.max(this.M0, this.N0));
            scVar.f(Math.max(this.M0, this.N0));
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
        boolean z9;
        boolean z10;
        float f10;
        float f11;
        long j3;
        long j10;
        int i7;
        float f12;
        char c10;
        float f13;
        Path path;
        boolean z11;
        float f14;
        float f15;
        float f16;
        long j11;
        float f17;
        float f18;
        Path path2;
        float f19;
        o00 o00Var;
        float f20;
        org.telegram.messenger.ij ijVar;
        if (this.s == null) {
            return;
        }
        if (!this.R0 || getVisibility() == 0) {
            int i10 = this.U;
            char c11 = 3;
            float f21 = 1.0f;
            if (i10 == 3 || i10 == 1) {
                org.telegram.ui.ActionBar.k6.G0().c(this.P0);
                this.a.h(this.P0);
                org.telegram.messenger.g0.L(getStyleHeight());
                p00 G0 = org.telegram.ui.ActionBar.k6.G0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path3 = G0.n;
                Paint paint = G0.m;
                int i11 = 0;
                while (true) {
                    o00[] o00VarArr = G0.a;
                    if (i11 >= o00VarArr.length) {
                        break;
                    }
                    o00 o00Var2 = o00VarArr[i11];
                    int i12 = o00Var2.i;
                    if (i12 == 0) {
                        if (o00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.m, false) || o00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.n, false)) {
                            o00Var2.a();
                        }
                    } else if (i12 == 1) {
                        if (o00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.o, false) || o00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.p, false)) {
                            o00Var2.a();
                        }
                    } else if (i12 == 3 && (o00Var2.j != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.q, false) || o00Var2.k != org.telegram.ui.ActionBar.k6.x0(null, o00Var2.r, false))) {
                        o00Var2.a();
                    }
                    i11++;
                }
                boolean z12 = G0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    o00 o00Var3 = G0.b;
                    if (o00Var3 != null && (o00Var = G0.c) != null) {
                        int i13 = o00Var.i;
                        int i14 = o00Var3.i;
                        if ((i14 == 1 && i13 == 0) || (i13 == 1 && i14 == 0)) {
                            z9 = true;
                            z10 = z12;
                            if (z12) {
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
                                    z10 = false;
                                    float f22 = 0.0f;
                                    if (z10) {
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
                                            z11 = z9;
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
                                                z11 = z9;
                                                f14 = 0.0f;
                                            } else {
                                                o00 o00Var4 = G0.b;
                                                if (o00Var4 == null) {
                                                    break;
                                                }
                                                f12 = f21;
                                                float f32 = G0.c != null ? G0.k : f12;
                                                if (z10) {
                                                    f14 = 0.0f;
                                                    int i15 = (int) (measuredHeight - f10);
                                                    int i16 = (int) (f11 - 0.0f);
                                                    float f33 = G0.e;
                                                    float f34 = f22;
                                                    Matrix matrix = o00Var4.h;
                                                    int i17 = o00Var4.i;
                                                    if (i17 == 2) {
                                                        f13 = f32;
                                                        path = path3;
                                                        z11 = z9;
                                                        c10 = 3;
                                                    } else {
                                                        float f35 = o00Var4.e;
                                                        if (f35 == f34 || o00Var4.f >= f35) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f13 = f32;
                                                            o00Var4.e = secureRandom.nextInt(700) + 500;
                                                            o00Var4.f = f34;
                                                            if (o00Var4.a == -1.0f) {
                                                                z11 = z9;
                                                                if (i17 == 3) {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    o00Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    o00Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f16 = 100.0f;
                                                                    if (i17 == 0) {
                                                                        o00Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        o00Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        o00Var4.a = com.google.android.recaptcha.internal.a.c(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        o00Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z11 = z9;
                                                                f16 = 100.0f;
                                                            }
                                                            o00Var4.c = o00Var4.a;
                                                            o00Var4.d = o00Var4.b;
                                                            if (i17 == 3) {
                                                                o00Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.05f, f16, -0.3f);
                                                                o00Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.05f, f16, 0.7f);
                                                            } else if (i17 == 0) {
                                                                o00Var4.a = a8.p0.f(secureRandom.nextInt(100), 0.2f, f16, -0.3f);
                                                                o00Var4.b = a8.p0.f(secureRandom.nextInt(100), 0.3f, f16, 0.7f);
                                                            } else {
                                                                o00Var4.a = com.google.android.recaptcha.internal.a.c(secureRandom.nextInt(100), f16, 0.2f, 1.1f);
                                                                o00Var4.b = (secureRandom.nextInt(100) * 4.0f) / f16;
                                                            }
                                                        } else {
                                                            f13 = f32;
                                                            path = path3;
                                                            z11 = z9;
                                                        }
                                                        float f36 = j10;
                                                        float f37 = (f36 * 0.02f * f33) + (f36 * f12) + o00Var4.f;
                                                        o00Var4.f = f37;
                                                        float f38 = o00Var4.e;
                                                        if (f37 > f38) {
                                                            o00Var4.f = f38;
                                                        }
                                                        float interpolation = xq.g.getInterpolation(o00Var4.f / f38);
                                                        float f39 = i16;
                                                        float f40 = o00Var4.c;
                                                        float f41 = ((((o00Var4.a - f40) * interpolation) + f40) * f39) - 200.0f;
                                                        float f42 = o00Var4.d;
                                                        float f43 = ((((o00Var4.b - f42) * interpolation) + f42) * i15) - 200.0f;
                                                        c10 = 3;
                                                        float f44 = (f39 / 400.0f) * ((i17 == 0 || i17 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f41, f43);
                                                        matrix.postScale(f44, f44, f41 + 200.0f, f43 + 200.0f);
                                                        o00Var4.g.setLocalMatrix(matrix);
                                                    }
                                                } else {
                                                    c10 = c11;
                                                    f13 = f32;
                                                    path = path3;
                                                    z11 = z9;
                                                    f14 = 0.0f;
                                                }
                                                G0.b.b(paint);
                                                f15 = f13;
                                            }
                                            if (i7 == 1 && z11) {
                                                paint.setAlpha(org.telegram.messenger.qs.e4);
                                            } else if (i7 == 1) {
                                                paint.setAlpha((int) (255.0f * f15));
                                            } else {
                                                paint.setAlpha(org.telegram.messenger.qs.e4);
                                            }
                                            if (i7 == 1 && z11) {
                                                path.rewind();
                                                f18 = f10;
                                                float f45 = f11;
                                                float f46 = f14;
                                                path2 = path;
                                                path2.addCircle(f11 - org.telegram.messenger.g0.L(18.0f), com.google.android.recaptcha.internal.a.A(measuredHeight, f18, 2.0f, f18), org.telegram.messenger.k5.A(f45, f46, 1.1f, f15), Path.Direction.CW);
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
                                        z9 = z11;
                                    }
                                }
                            }
                            j10 = j3;
                            float f222 = 0.0f;
                            if (z10) {
                            }
                            i7 = 0;
                            while (i7 < 2) {
                            }
                        }
                    }
                    z9 = false;
                    z10 = z12;
                    if (z12) {
                    }
                    j10 = j3;
                    float f2222 = 0.0f;
                    if (z10) {
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
            if (this.U == 0 && (ijVar = MediaController.B().u0) != null) {
                float f47 = -org.telegram.messenger.g0.N(f20);
                float T1 = org.telegram.messenger.g0.T1(f47, org.telegram.messenger.g0.N(f20) + getMeasuredWidth(), ijVar.b0);
                float measuredHeight2 = getMeasuredHeight();
                float N = measuredHeight2 - org.telegram.messenger.g0.N(2.0f);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vl, this.q0);
                Paint paint2 = this.Q0;
                paint2.setColor(w02);
                canvas.drawRoundRect(f47, N, T1, measuredHeight2, org.telegram.messenger.g0.N(f20), org.telegram.messenger.g0.N(f20), paint2);
            }
            this.P0 = true;
        }
    }

    public final void e(boolean z9) {
        View fragmentView = this.h.getFragmentView();
        if (!z9 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z9 = true;
        }
        di.g1 g1Var = di.g1.W;
        h2.f fVar = this.u0;
        int i7 = 6;
        if (g1Var != null) {
            b();
            int i10 = this.U;
            if (6 != i10 && this.f != null && !z9) {
                this.x0 = true;
                return;
            }
            if (6 != i10 && this.T && !z9) {
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
                this.f.setInterpolator(xq.f);
                this.f.addListener(new g00(this, i7));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
                setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z9) {
                    setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new g00(this, 7));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
        } else {
            boolean z10 = this.T;
            if (z10 && ((z9 && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z9) {
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
                    this.f.setInterpolator(xq.f);
                    this.f.addListener(new g00(this, 5));
                    this.f.start();
                }
            } else if (z10 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        di.g1 g1Var2 = di.g1.W;
        if (g1Var2 == null || this.U != 6) {
            return;
        }
        j00 j00Var = this.d;
        TLRPC.GroupCall groupCall = g1Var2.w;
        j00Var.setText(org.telegram.messenger.id.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i7;
        TLRPC.User user;
        int i10;
        String format;
        kg kgVar = this.n;
        if (kgVar == null || this.d == null) {
            return;
        }
        b();
        long a10 = kgVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) org.telegram.messenger.sd.f(currentAccount).c.f(a10);
        int i11 = 1;
        if (!this.r0) {
            org.telegram.messenger.sd f10 = org.telegram.messenger.sd.f(currentAccount);
            a0.h hVar = f10.G;
            if (hVar.h(a10) < 0) {
                hVar.k(Boolean.TRUE, a10);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f10.getMessagesController().j1(a10);
                tL_messages_getRecentLocations.limit = 100;
                f10.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new org.telegram.messenger.v4(f10, a10, i11));
            }
            this.r0 = true;
        }
        if (arrayList != null) {
            long e10 = org.telegram.messenger.p10.i(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i10 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long C1 = org.telegram.messenger.ij.C1(message.from_id);
                    if (user == null && C1 != e10) {
                        user = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(C1));
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
        if (this.s0 == i10) {
            return;
        }
        this.s0 = i10;
        String M0 = org.telegram.messenger.id.M0(2131748841, null);
        if (i10 == 0) {
            format = M0;
        } else {
            int i13 = i10 - 1;
            if (!org.telegram.messenger.sd.f(currentAccount).i(a10)) {
                int i14 = i7;
                if (i13 != 0) {
                    String j3 = org.telegram.messenger.t10.j(user, true);
                    String G = org.telegram.messenger.id.G(i13, "AndOther", new Object[i14]);
                    Object[] objArr = new Object[3];
                    objArr[i14] = M0;
                    objArr[1] = j3;
                    objArr[2] = G;
                    format = String.format("%1$s - %2$s %3$s", objArr);
                } else {
                    String j10 = org.telegram.messenger.t10.j(user, true);
                    Object[] objArr2 = new Object[2];
                    objArr2[i14] = M0;
                    objArr2[1] = j10;
                    format = String.format("%1$s - %2$s", objArr2);
                }
            } else if (i13 == 0) {
                String M02 = org.telegram.messenger.id.M0(2131752184, null);
                Object[] objArr3 = new Object[2];
                objArr3[i7] = M0;
                objArr3[1] = M02;
                format = String.format("%1$s - %2$s", objArr3);
            } else if (i13 != 1 || user == null) {
                String M03 = org.telegram.messenger.id.M0(2131752184, null);
                int i15 = i7;
                String G2 = org.telegram.messenger.id.G(i13, "AndOther", new Object[i15]);
                Object[] objArr4 = new Object[3];
                objArr4[i15] = M0;
                objArr4[1] = M03;
                objArr4[2] = G2;
                format = String.format("%1$s - %2$s %3$s", objArr4);
            } else {
                Object[] objArr5 = new Object[1];
                objArr5[i7] = org.telegram.messenger.t10.j(user, true);
                String a02 = org.telegram.messenger.id.a0("SharingYouAndOtherName", null, 2131745371, objArr5);
                Object[] objArr6 = new Object[2];
                objArr6[i7] = M0;
                objArr6[1] = a02;
                format = String.format("%1$s - %2$s", objArr6);
            }
        }
        if (format.equals(this.V)) {
            return;
        }
        this.V = format;
        int indexOf = format.indexOf(M0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i16 = 0;
        while (i16 < 2) {
            j00 j00Var = this.d;
            TextView textView = i16 == 0 ? j00Var.getTextView() : j00Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i16++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.q0)), indexOf, M0.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z10 = true;
        if (this.T) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3) {
                return;
            }
            if ((i7 == 4 || i7 == 5) && !j()) {
                return;
            }
        }
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        View fragmentView = this.h.getFragmentView();
        boolean z11 = (z9 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z9 : true;
        boolean z12 = this.T;
        h2.f fVar = this.u0;
        if (ijVar == null || ijVar.f1() == 0 || org.telegram.messenger.ij.M4(ijVar.k)) {
            this.R = null;
            boolean z13 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || p10.d()) ? false : true;
            boolean z14 = z13;
            z14 = z13;
            if (!j() && !z13) {
                kg kgVar = this.n;
                z14 = z13;
                if (kgVar != null) {
                    z14 = z13;
                    if (!p10.d()) {
                        org.telegram.messenger.r3 groupCall = kgVar.getGroupCall();
                        z14 = groupCall != null && groupCall.y();
                    }
                }
            }
            if (z14) {
                a(false);
                return;
            }
            if (!this.T) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.G;
            if (r0Var != null && r0Var.x()) {
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
            n00 n00Var = this.p0;
            if (n00Var != null) {
                ((uo0) n00Var).b(true);
            }
            this.f.addListener(new g00(this, z10 ? 1 : 0));
            this.f.start();
            return;
        }
        b();
        int i10 = this.U;
        if (i10 != 0 && this.f != null && !z11) {
            this.y0 = true;
            return;
        }
        r(0);
        if (z11 && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
            n00 n00Var2 = this.p0;
            if (n00Var2 != null) {
                ((uo0) n00Var2).b(true);
                ((uo0) this.p0).b(false);
            }
        }
        int i11 = 2;
        if (!this.T) {
            if (!z11) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                fVar.d();
                this.f = new AnimatorSet();
                n00 n00Var3 = this.p0;
                if (n00Var3 != null) {
                    ((uo0) n00Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", org.telegram.messenger.g0.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new g00(this, i11));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (MediaController.B().H()) {
            this.c.a(false, !z11);
            this.b.setContentDescription(org.telegram.messenger.id.M0(2131754929, null));
        } else {
            this.c.a(true, !z11);
            this.b.setContentDescription(org.telegram.messenger.id.M0(2131754930, null));
        }
        if (this.R == ijVar && i10 == 0) {
            return;
        }
        this.R = ijVar;
        if (org.telegram.messenger.ij.S4(ijVar.k) || this.R.i4()) {
            this.W = false;
            org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
            if (r0Var2 != null) {
                r0Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(ijVar.x1(true), " ", ijVar.z1(true)));
            int i12 = 0;
            while (i12 < 2) {
                j00 j00Var = this.d;
                TextView textView = i12 == 0 ? j00Var.getTextView() : j00Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G == null) {
                this.d.setPadding(0, 0, this.N, 0);
            } else if (ijVar.L0() >= 600.0d) {
                this.G.setAlpha(1.0f);
                this.G.setEnabled(true);
                this.d.setPadding(0, 0, org.telegram.messenger.g0.L(44.0f) + this.N, 0);
                q(false);
            } else {
                this.G.setAlpha(0.0f);
                this.G.setEnabled(false);
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(ijVar.x1(true), " - ", ijVar.z1(true)));
            int i13 = 0;
            while (i13 < 2) {
                j00 j00Var2 = this.d;
                TextView textView2 = i13 == 0 ? j00Var2.getTextView() : j00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, this.q0)), 0, ijVar.x1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z11 && z12 && this.W);
    }

    public sc getCapsuleBlobDrawable() {
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
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.q0;
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), false, this.q0);
        this.G = r0Var;
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(this.G.getIconView(), i7, f6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(org.telegram.messenger.g0.L(30.0f));
        int i10 = 0;
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(org.telegram.messenger.id.M0(2131754805, null));
        this.G.setDelegate(new b00(this));
        org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
        du0 du0Var = new du0();
        this.H = du0Var;
        r0Var2.setIcon(du0Var);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), f6Var);
        this.I = v0Var;
        v0Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.p0 z9 = this.G.z(0, R.drawable.msg_speed_slow, org.telegram.messenger.id.M0(2131745269, null));
        org.telegram.ui.ActionBar.p0[] p0VarArr = this.J;
        p0VarArr[0] = z9;
        p0VarArr[1] = this.G.z(1, R.drawable.msg_speed_normal, org.telegram.messenger.id.M0(2131745270, null));
        p0VarArr[2] = this.G.z(2, R.drawable.msg_speed_medium, org.telegram.messenger.id.M0(2131745271, null));
        p0VarArr[3] = this.G.z(3, R.drawable.msg_speed_fast, org.telegram.messenger.id.M0(2131745273, null));
        p0VarArr[4] = this.G.z(4, R.drawable.msg_speed_veryfast, org.telegram.messenger.id.M0(2131745267, null));
        p0VarArr[5] = this.G.z(5, R.drawable.msg_speed_superfast, org.telegram.messenger.id.M0(2131745268, null));
        if (org.telegram.messenger.g0.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(org.telegram.messenger.g0.L(8.0f));
        addView(this.G, c8.ha.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new lk(11, this, fArr));
        this.G.setOnLongClickListener(new e00(this, i10));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i7 = this.U;
        if ((i7 == 3 || i7 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(org.telegram.messenger.rd rdVar) {
        if (rdVar != null) {
            org.telegram.ui.ActionBar.f2 f2Var = this.h;
            if (f2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) f2Var.getParentActivity();
                launchActivity.O0(rdVar.h.I1);
                org.telegram.ui.pa0 pa0Var = new org.telegram.ui.pa0(2);
                pa0Var.G0(rdVar.h);
                pa0Var.G0 = new di.c1(rdVar, org.telegram.messenger.ij.B0(rdVar.h.k), 4);
                launchActivity.t0(pa0Var);
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
    public final void l(float f10, float f11, boolean z9) {
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
            a02 = org.telegram.messenger.id.M0(2131753901, null);
            if (Math.abs(f10 - 2.0f) < 0.05f) {
                i7 = R.raw.speed_2to1;
            }
        } else if (z9 && i(f11, 1.5f) && i(f10, 1.0f)) {
            a02 = org.telegram.messenger.id.a0("AudioSpeedCustom", null, 2131753903, du0.a(f11));
            i7 = R.raw.speed_1to15;
        } else if (z9 && i(f11, 2.0f) && i(f10, 1.5f)) {
            a02 = org.telegram.messenger.id.M0(2131753902, null);
            i7 = R.raw.speed_15to2;
        } else {
            a02 = org.telegram.messenger.id.a0("AudioSpeedCustom", null, 2131753903, du0.a(f11));
        }
        hc.a0(this.h).Q(i7, 36, a02).j();
    }

    public final void m() {
        ab.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.b();
            this.L0 = null;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.ms[] msVarArr = this.K0;
            org.telegram.messenger.ms msVar = msVarArr[i7];
            if (msVar != null) {
                msVar.b();
                msVarArr[i7] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.n nVar = this.O;
        if (nVar == null || nVar.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            org.telegram.messenger.g0.i3(new f00(this, 0), 150L);
        }
    }

    public final void o(boolean z9) {
        org.telegram.messenger.r3 r3Var;
        int i7;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z9 && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        y8 y8Var = this.b0.a;
        if (y8Var.f != null) {
            y8Var.g = true;
            return;
        }
        int i10 = this.U;
        int i11 = this.n0;
        kg kgVar = this.n;
        if (i10 == 4) {
            if (kgVar != null) {
                r3Var = kgVar.getGroupCall();
                i11 = this.h.getCurrentAccount();
            } else {
                r3Var = null;
            }
            i7 = i11;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            r3Var = VoIPService.getSharedInstance().groupCall;
            user = kgVar != null ? null : VoIPService.getSharedInstance().getUser();
            i7 = VoIPService.getSharedInstance().getAccount();
        } else {
            r3Var = null;
            i7 = i11;
            user = null;
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.e;
            int size = arrayList.size();
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 < size) {
                    this.b0.b(i12, i7, (TLObject) arrayList.get(i12));
                } else {
                    this.b0.b(i12, i7, null);
                }
            }
        } else if (user != null) {
            this.b0.b(0, i7, user);
            for (int i13 = 1; i13 < 3; i13++) {
                this.b0.b(i13, i7, null);
            }
        } else {
            for (int i14 = 0; i14 < 3; i14++) {
                this.b0.b(i14, i7, null);
            }
        }
        this.b0.a(z9);
        if (this.U != 4 || r3Var == null) {
            return;
        }
        int min = r3Var.b.rtmp_stream ? 0 : Math.min(3, r3Var.e.size());
        int e10 = (min == 0 ? 10 : com.google.android.recaptcha.internal.a.e(min, 1, 24, 52)) + 3;
        if (z9) {
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
        this.d.setLayoutParams(c8.ha.d(-1, 20.0f, 51, f10, 5.0f, r3Var.j() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(c8.ha.d(-1, 20.0f, 51, f10, 25.0f, r3Var.j() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            ab.b0 b0Var = new ab.b0(org.telegram.messenger.qs.e(), this);
            b0Var.c(org.telegram.messenger.qs.D4);
            b0Var.c(org.telegram.messenger.qs.F4);
            this.L0 = b0Var;
            d(true);
        } else {
            for (int i7 = 0; i7 < 4; i7++) {
                ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.f(i7), this);
                b0Var2.c(org.telegram.messenger.qs.f2);
                b0Var2.c(org.telegram.messenger.qs.g2);
                b0Var2.c(org.telegram.messenger.qs.h2);
                b0Var2.c(org.telegram.messenger.qs.w2);
                b0Var2.c(org.telegram.messenger.qs.C2);
                b0Var2.c(org.telegram.messenger.qs.v1);
                b0Var2.c(org.telegram.messenger.qs.G2);
                b0Var2.c(org.telegram.messenger.qs.e2);
                this.K0[i7] = b0Var2;
                GroupCallMessagesController.getInstance(i7).subscribeToCallMessages(0L, this);
            }
            ab.b0 b0Var3 = new ab.b0(org.telegram.messenger.qs.e(), this);
            b0Var3.c(org.telegram.messenger.qs.J4);
            b0Var3.c(org.telegram.messenger.qs.v2);
            b0Var3.c(org.telegram.messenger.qs.D2);
            b0Var3.c(org.telegram.messenger.qs.O4);
            b0Var3.c(org.telegram.messenger.qs.N4);
            b0Var3.c(org.telegram.messenger.qs.F2);
            this.L0 = b0Var3;
            if (di.g1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || p10.d()) {
                kg kgVar = this.n;
                if (kgVar != null && this.h.getSendMessagesHelper().B(kgVar.a()) != null && !j()) {
                    c(true);
                } else if (kgVar == null || kgVar.getGroupCall() == null || !kgVar.getGroupCall().y() || p10.d() || j()) {
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
        int i10 = this.U;
        if (i10 == 3 || i10 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.G0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            sc scVar = this.a;
            if (!scVar.u) {
                scVar.u = true;
                scVar.t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, scVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z9 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z9 && this.D != null) {
                this.P = z9;
                this.E.P(z9 ? 15 : 29);
                zg0 zg0Var = this.E;
                zg0Var.N(zg0Var.f - 1, false, true);
                this.D.invalidate();
            }
        } else if (i10 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z9 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z10 = this.P;
        sc scVar = this.a;
        if (z10 != z9) {
            this.P = z9;
            this.E.P(z9 ? 15 : 29);
            zg0 zg0Var = this.E;
            zg0Var.N(zg0Var.f - 1, false, true);
            this.D.invalidate();
            org.telegram.ui.ActionBar.k6.G0().c(this.T);
            scVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.k6.G0().a(0.0f);
            scVar.f(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
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
            org.telegram.messenger.g0.r(this.m0);
            this.l0 = false;
        }
        this.T = false;
        this.u0.e();
        this.S = 0.0f;
        m();
        if (!this.o0) {
            for (int i7 = 0; i7 < 4; i7++) {
                GroupCallMessagesController.getInstance(i7).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i10 = this.U;
        if (i10 == 3 || i10 == 1) {
            p00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            sc scVar = this.a;
            if (scVar.u) {
                scVar.u = false;
                bg.k.d().f(scVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, org.telegram.messenger.g0.M(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.w == null) {
            return;
        }
        int i7 = this.U;
        if ((i7 == 1 || i7 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
            this.V0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.U0.f(new m00(this.w, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i7 = this.V0;
        if (i7 > 0) {
            int i10 = i7 - 1;
            this.V0 = i10;
            if (i10 == 0) {
                this.U0.f(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        p();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public final void p() {
        org.telegram.messenger.r3 r3Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(org.telegram.messenger.id.M0(2131743395, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (r3Var = sharedInstance.groupCall) != null) {
                    if (r3Var.e.size() <= 1) {
                        this.d.b(org.telegram.messenger.id.M0(2131751823, null), false);
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
                        sb2.append(org.telegram.messenger.id.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                kg kgVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (kgVar == null || kgVar.j() == null || kgVar.j().id != user.id) {
                            this.d.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(org.telegram.messenger.id.M0(2131746049, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (kgVar == null || kgVar.g() == null || kgVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = kgVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(org.telegram.messenger.id.M0(2131743451, null), false);
                } else if (org.telegram.messenger.t3.W(g10)) {
                    this.d.b(org.telegram.messenger.id.M0(2131743451, null), false);
                } else {
                    this.d.b(org.telegram.messenger.id.M0(2131743310, null), false);
                }
            }
        }
    }

    public final void q(boolean z9) {
        if (this.H == null) {
            return;
        }
        float C = MediaController.B().C(this.W);
        this.H.b(z9, C);
        updateColors();
        boolean z10 = this.A0;
        int i7 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.p0[] p0VarArr = this.J;
            if (i7 >= p0VarArr.length) {
                this.I.e(z9, C);
                return;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.q0;
            if (z10 || Math.abs(C - W0[i7]) >= 0.05f) {
                org.telegram.ui.ActionBar.p0 p0Var = p0VarArr[i7];
                int i10 = org.telegram.ui.ActionBar.k6.E8;
                p0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            } else {
                org.telegram.ui.ActionBar.p0 p0Var2 = p0VarArr[i7];
                int i11 = org.telegram.ui.ActionBar.k6.Ei;
                p0Var2.a(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            }
            i7++;
        }
    }

    public final void r(int i7) {
        if (this.U == i7) {
            return;
        }
        b();
        int i10 = this.U;
        sc scVar = this.a;
        if (i10 == 3 || i10 == 1) {
            p00 G0 = org.telegram.ui.ActionBar.k6.G0();
            ArrayList arrayList = G0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                G0.d = G0.b;
                G0.b = null;
                G0.c = null;
            }
            if (scVar.u) {
                scVar.u = false;
                bg.k.d().f(scVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            te.j jVar = this.U0;
            if (jVar != null) {
                jVar.f(null, true);
            }
        }
        this.U = i7;
        this.s.setWillNotDraw(i7 != 4);
        if (i7 != 4) {
            this.h0 = false;
        }
        z8 z8Var = this.b0;
        if (z8Var != null) {
            z8Var.setStyle(this.U);
            this.b0.setLayoutParams(c8.ha.e(org.telegram.messenger.qs.t1, getStyleHeight(), 51));
        }
        this.s.setLayoutParams(c8.ha.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.S;
        if (f10 > 0.0f && f10 != org.telegram.messenger.g0.M(getStyleHeight())) {
            setTopPadding(org.telegram.messenger.g0.M(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.q0;
        if (i7 == 6) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, f6Var)}));
            this.s.setTag(null);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.D.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.b0.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            int i11 = 0;
            while (i11 < 2) {
                j00 j00Var = this.d;
                TextView textView = i11 == 0 ? j00Var.getTextView() : j00Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A7, f6Var);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 15.0f);
                }
                i11++;
            }
            this.d.setLayoutParams(c8.ha.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i7 == 5) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            int i12 = 0;
            while (i12 < 2) {
                j00 j00Var2 = this.d;
                TextView textView2 = i12 == 0 ? j00Var2.getTextView() : j00Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.u7, f6Var);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.D.setVisibility(8);
            this.b0.setVisibility(8);
            this.y.setVisibility(0);
            this.y.d();
            this.F.setContentDescription(org.telegram.messenger.id.M0(2131754900, null));
            org.telegram.ui.ActionBar.r0 r0Var = this.G;
            if (r0Var != null) {
                r0Var.setVisibility(8);
                this.G.setTag(null);
            }
            this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i7 == 0 || i7 == 2) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.F.setVisibility(0);
            this.b.setVisibility(0);
            this.D.setVisibility(8);
            this.y.setVisibility(8);
            this.y.i();
            this.b0.setVisibility(8);
            int i13 = 0;
            while (i13 < 2) {
                j00 j00Var3 = this.d;
                TextView textView3 = i13 == 0 ? j00Var3.getTextView() : j00Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.u7, f6Var);
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            if (i7 == 6) {
                this.b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.F.setVisibility(8);
                return;
            } else {
                if (i7 != 0) {
                    this.b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(org.telegram.messenger.id.M0(2131754755, null));
                    return;
                }
                this.b.setLayoutParams(c8.ha.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(c8.ha.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
                if (r0Var2 != null) {
                    r0Var2.setVisibility(0);
                    this.G.setTag(1);
                }
                this.F.setContentDescription(org.telegram.messenger.id.M0(2131754900, null));
                return;
            }
        }
        if (i7 == 4) {
            this.x.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            this.s.setBackgroundColor(0);
            this.s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            this.D.setVisibility(8);
            this.e.setVisibility(0);
            int i14 = 0;
            while (i14 < 2) {
                j00 j00Var4 = this.d;
                TextView textView4 = i14 == 0 ? j00Var4.getTextView() : j00Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.t7, f6Var);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.t7));
            this.d.setPadding(0, 0, this.N, 0);
            this.y.setVisibility(8);
            this.y.i();
            kg kgVar = this.n;
            this.b0.setVisibility(!((kgVar == null || kgVar.getGroupCall() == null || kgVar.getGroupCall().b == null || !kgVar.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
                this.e.setTranslationX(-org.telegram.messenger.g0.L(36.0f));
            }
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.r0 r0Var3 = this.G;
            if (r0Var3 != null) {
                r0Var3.setVisibility(8);
                this.G.setTag(null);
                return;
            }
            return;
        }
        if (i7 == 1 || i7 == 3) {
            this.x.setBackground(null);
            p();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.b0.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i7 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.b0.getVisibility() != 8) {
                o(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.D.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z9 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.P = z9;
            this.E.P(z9 ? 15 : 29);
            zg0 zg0Var = this.E;
            zg0Var.N(zg0Var.f - 1, false, true);
            this.D.invalidate();
            this.s.setBackground(null);
            this.s.setBackgroundColor(0);
            this.y.setVisibility(8);
            this.y.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.G0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!scVar.u) {
                scVar.u = true;
                scVar.t = SystemClock.elapsedRealtime();
                bg.k.d().a(60, scVar.F);
            }
            invalidate();
            int i15 = 0;
            while (i15 < 2) {
                j00 j00Var5 = this.d;
                TextView textView5 = i15 == 0 ? j00Var5.getTextView() : j00Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.A7, f6Var);
                    textView5.setTypeface(org.telegram.messenger.g0.o());
                    textView5.setTextSize(1, 14.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            this.F.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.M.setVisibility(8);
            this.d.setLayoutParams(c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(org.telegram.messenger.g0.L(88.0f), 0, org.telegram.messenger.g0.L(88.0f) + this.N, 0);
            org.telegram.ui.ActionBar.r0 r0Var4 = this.G;
            if (r0Var4 != null) {
                r0Var4.setVisibility(8);
                this.G.setTag(null);
            }
        }
    }

    public void setDelegate(n00 n00Var) {
        this.p0 = n00Var;
    }

    public void setDrawOverlay(boolean z9) {
        this.R0 = z9;
    }

    public void setLeftMargin(float f10) {
        if (this.s == null) {
            this.T0 = f10;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ch0 ch0Var = this.y;
        if (ch0Var != null) {
            ch0Var.setTranslationX(f10);
        }
        j00 j00Var = this.d;
        if (j00Var != null) {
            j00Var.setTranslationX(f10);
        }
        j00 j00Var2 = this.e;
        if (j00Var2 != null) {
            j00Var2.setTranslationX(f10);
        }
        z8 z8Var = this.b0;
        if (z8Var != null) {
            z8Var.setTranslationX(f10);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z9) {
        this.a0 = z9;
    }

    public void setTopPadding(float f10) {
        this.S = f10;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        setTopPadding(this.S);
        if (i7 == 8) {
            this.P0 = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        u31[] u31VarArr;
        sc scVar = this.a;
        int i7 = scVar.A;
        if (i7 >= 0) {
            scVar.E = 1.0f;
            scVar.a(sc.e(i7));
        }
        int i10 = !i(MediaController.B().C(this.W), 1.0f) ? org.telegram.ui.ActionBar.k6.Ei : org.telegram.ui.ActionBar.k6.x7;
        org.telegram.ui.ActionBar.f6 f6Var = this.q0;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        du0 du0Var = this.H;
        if (du0Var != null) {
            du0Var.a.u(w02);
            Paint paint = du0Var.b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.G;
        if (r0Var != null) {
            Drawable background = r0Var.getBackground();
            if (background == null || background != this.E0) {
                org.telegram.ui.ActionBar.r0 r0Var2 = this.G;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(436207615 & w02, 1, org.telegram.messenger.g0.L(14.0f));
                this.E0 = h02;
                r0Var2.setBackground(h02);
                this.J0 = w02;
            } else if (w02 != this.J0) {
                this.J0 = w02;
                org.telegram.ui.ActionBar.k6.H1(background, w02 & 436207615, true);
            }
        }
        if (this.b != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.w7, f6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.x7, f6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                j00 j00Var = this.e;
                TextView textView = i11 == 0 ? j00Var.getTextView() : j00Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.x7, f6Var));
                }
                i11++;
            }
        }
        j00 j00Var2 = this.d;
        if (j00Var2 != null) {
            Object tag = j00Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    j00 j00Var3 = this.d;
                    TextView textView2 = i12 == 0 ? j00Var3.getTextView() : j00Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(intValue, f6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (u31VarArr = (u31[]) ((Spanned) text).getSpans(0, text.length(), u31.class)) != null) {
                            for (u31 u31Var : u31VarArr) {
                                u31Var.b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.t7, f6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.f2 f2Var, View view, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new sc();
        this.J = new org.telegram.ui.ActionBar.p0[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new i6(false, true, true);
        this.m0 = new h00(this);
        this.n0 = org.telegram.messenger.p10.s0;
        this.s0 = -1;
        this.t0 = new et(this, 4);
        this.u0 = new h2.f((int[]) null);
        this.v0 = new h2.f(new int[]{org.telegram.messenger.qs.D});
        this.K0 = new org.telegram.messenger.ms[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new te.j(new b00(this), xq.h, 450L);
        this.V0 = 0;
        this.q0 = f6Var;
        this.h = f2Var;
        if (f2Var instanceof kg) {
            this.n = (kg) f2Var;
        }
        this.r = view;
        this.T = true;
        this.o0 = z9;
        if (view == null) {
            ((ViewGroup) f2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
