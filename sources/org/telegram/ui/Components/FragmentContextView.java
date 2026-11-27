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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class FragmentContextView extends FrameLayout implements fn7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, snb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public kg5 B0;
    public ViewGroup C0;
    public long D0;
    public b29 E;
    public hf0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public s7 G;
    public PorterDuffColorFilter G0;
    public zoa H;
    public int H0;
    public w7 I;
    public int I0;
    public final q7[] J;
    public int J0;
    public FrameLayout K;
    public final gn7[] K0;
    public ImageView L;
    public u8a L0;
    public fx0 M;
    public float M0;
    public int N;
    public float N0;
    public fe1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public r47 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final xa9 U0;
    public String V;
    public int V0;
    public boolean W;
    public final cb1 a;
    public boolean a0;
    public ImageView b;
    public jc0 b0;
    public mf8 c;
    public Paint c0;
    public sp4 d;
    public LinearGradient d0;
    public sp4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.e h;
    public boolean h0;
    public boolean i0;
    public final hn j0;
    public v41 k0;
    public boolean l0;
    public final qp4 m0;
    public final kz1 n;
    public final int n0;
    public final boolean o0;
    public wp4 p0;
    public final vnb q0;
    public rp4 r;
    public boolean r0;
    public b6 s;
    public int s0;
    public final zz3 t0;
    public final pn u0;
    public final pn v0;
    public View w;
    public boolean w0;
    public e29 x;
    public boolean x0;
    public up4 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.e eVar, FrameLayout frameLayout, boolean z, vnb vnbVar) {
        super(context);
        this.a = new cb1();
        this.J = new q7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new hn(false, true, true);
        this.m0 = new qp4(this);
        this.n0 = yac.t0;
        this.s0 = -1;
        this.t0 = new zz3(this, (byte) 7);
        this.u0 = new pn(null);
        this.v0 = new pn(new int[]{jn7.C});
        this.K0 = new gn7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new xa9(new lp4(this), k43.h, 450L);
        this.V0 = 0;
        this.q0 = vnbVar;
        this.h = eVar;
        if (eVar instanceof kz1) {
            this.n = (kz1) eVar;
        }
        this.T = true;
        this.o0 = z;
        if (frameLayout == null) {
            ((ViewGroup) eVar.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    private int getTitleTextColor() {
        int i = this.U;
        vnb vnbVar = this.q0;
        return i == 4 ? aob.v0(aob.t7, vnbVar) : (i == 1 || i == 3) ? aob.v0(aob.A7, vnbVar) : aob.v0(aob.u7, vnbVar);
    }

    public static boolean i(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public static boolean j() {
        r47 r47Var = MediaController.z().v0;
        return r47Var != null && r47.Q4(r47Var.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        vc2 groupCall;
        vc2 vc2Var;
        int i;
        int i2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.e eVar = this.h;
        View fragmentView = eVar.getFragmentView();
        boolean z4 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean d = ra5.d();
        kz1 kz1Var = this.n;
        if (d) {
            z2 = false;
        } else {
            z2 = (j95.t5 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (vc2Var = sharedInstance.groupCall) != null && (vc2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z2 = false;
            }
            if (j() || j95.t5 || !this.a0 || z2 || kz1Var == null || (groupCall = kz1Var.getGroupCall()) == null || !groupCall.A()) {
                z3 = false;
                pn pnVar = this.u0;
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
                            pnVar.d();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(k43.f);
                            this.f.addListener(new pp4(this, b));
                            this.f.start();
                        }
                    } else if (z5 && ((i = this.U) == -1 || i == 4 || i == 3 || i == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z4 || kz1Var == null || !kz1Var.K() || ra5.d()) {
                        return;
                    }
                    bs2.v(null, 2131748906, d31.b0(eVar), R.raw.linkbroken, 36);
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
                    pnVar.d();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(k43.f);
                    this.f.addListener(new pp4(this, (byte) 9));
                    this.f.start();
                    return;
                }
                if (z3) {
                    boolean z6 = i4 == 4 && this.T;
                    r(4);
                    vc2 groupCall2 = kz1Var.getGroupCall();
                    TLRPC.Chat e = kz1Var.e();
                    if (groupCall2.k()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(hl.L(14.0f));
                            this.g0.setTypeface(hl.o());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        ob6.M0(2131743092, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (TextUtils.isEmpty(groupCall2.b.title)) {
                            boolean W = xc2.W(e);
                            sp4 sp4Var = this.d;
                            if (W) {
                                sp4Var.b(ob6.M0(2131743113, null), false);
                            } else {
                                sp4Var.b(ob6.M0(2131742992, null), false);
                            }
                        } else {
                            this.d.b(groupCall2.b.title, false);
                        }
                        this.e.b(ob6.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(ob6.M0(2131743094, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(ob6.M0(2131743099, null), false);
                        } else {
                            boolean W2 = xc2.W(e);
                            sp4 sp4Var2 = this.d;
                            if (W2) {
                                sp4Var2.b(ob6.M0(2131743099, null), false);
                            } else {
                                sp4Var2.b(ob6.M0(2131742958, null), false);
                            }
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i5 = groupCall4.participants_count;
                        sp4 sp4Var3 = this.e;
                        boolean z7 = groupCall4.rtmp_stream;
                        if (i5 == 0) {
                            sp4Var3.b(ob6.M0(z7 ? 2131743187 : 2131748368, null), false);
                        } else {
                            sp4Var3.b(ob6.G(i5, z7 ? "ViewersWatching" : "Participants", new Object[0]), false);
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
                    setTopPadding(hl.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(k43.f);
                    this.f.addListener(new pp4(this, (byte) 10));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z2 = true;
        }
        z3 = z2;
        pn pnVar2 = this.u0;
        byte b2 = 8;
        if (z2) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        rp4 rp4Var = new rp4(this, context);
        this.r = rp4Var;
        this.k0 = new v41(rp4Var);
        int i = hl.q.x;
        hn hnVar = this.j0;
        hnVar.N = i;
        hnVar.B = 0.4f;
        hnVar.setCallback(rp4Var);
        hnVar.u(-1);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.o());
        addView(this.r, tre.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, tre.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = aob.w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vnb vnbVar = this.q0;
        yob.s(imageView2, i2, vnbVar, mode);
        ImageView imageView3 = this.b;
        mf8 mf8Var = new mf8(16);
        this.c = mf8Var;
        imageView3.setImageDrawable(mf8Var);
        final byte b = 1;
        this.b.setBackground(aob.f0(aob.v0(i2, vnbVar) & 436207615, 1, hl.L(14.0f)));
        addView(this.b, tre.e(36, 36, 51));
        final byte b2 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: mp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vc2 groupCall;
                int i3;
                long j;
                TL_stories.StoryItem t;
                byte b3 = b2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b3) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                break;
                            }
                        } else {
                            MediaController.z().m(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i4 = fragmentContextView.U;
                        if (i4 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i5 = w96Var.e;
                                if (i5 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i5).O1().t(w96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i4 == 0) {
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        break;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        break;
                                    }
                                } else if (r47.B0(r47Var.k) == (kz1Var2 != null ? kz1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = r47.B0(r47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (wf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (wf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", r47Var.e1());
                                    eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                    break;
                                }
                            }
                        } else if (i4 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i4 == 2) {
                            int i6 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i3 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!id6.f(i7).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i7).J.get(0);
                                            j = hd6Var.a;
                                            i3 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i3).h(j));
                                break;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                break;
                            }
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    zu1 zu1Var = (zu1) eVar2;
                                    if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                        ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                        ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                        eVar2.showDialog(ep5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                break;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var = fragmentContextView.E;
                                if (z3) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        e29 e29Var = new e29(context);
        this.x = e29Var;
        e29Var.setScaleType(scaleType);
        this.x.setAutoRepeat(true);
        this.x.f(R.raw.import_progress, 30, 30, null);
        yob.B(this.x, aob.K(hl.L(22.0f), aob.v0(i2, vnbVar)), yob.M(i2), vnbVar);
        addView(this.x, tre.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final byte b3 = 0;
        sp4 sp4Var = new sp4(this, context, context, b3);
        this.d = sp4Var;
        addView(sp4Var, tre.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        sp4 sp4Var2 = new sp4(this, context, context, b);
        this.e = sp4Var2;
        addView(sp4Var2, tre.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        fe1 fe1Var = new fe1();
        this.O = fe1Var;
        fe1Var.g = 1.0f;
        fe1Var.j = false;
        fx0 fx0Var = new fx0((byte) 2, context, this);
        this.M = fx0Var;
        fx0Var.setText(ob6.M0(2131743094, null));
        yob.X(this.M, aob.Ji, vnbVar);
        fx0 fx0Var2 = this.M;
        int L = hl.L(16.0f);
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, vnbVar);
        int i4 = aob.Hi;
        int v02 = aob.v0(i4, vnbVar);
        yob.R(fx0Var2, aob.i0(L, L, L, L, v0, v02, v02), yob.M(i3), yob.M(i4), vnbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(hl.o());
        this.M.setGravity(17);
        this.M.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        addView(this.M, tre.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final byte b4 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: mp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b4;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                break;
                            }
                        } else {
                            MediaController.z().m(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i5 = w96Var.e;
                                if (i5 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i5).O1().t(w96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        break;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        break;
                                    }
                                } else if (r47.B0(r47Var.k) == (kz1Var2 != null ? kz1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = r47.B0(r47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (wf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (wf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", r47Var.e1());
                                    eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!id6.f(i7).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i7).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                break;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    zu1 zu1Var = (zu1) eVar2;
                                    if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                        ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                        ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                        eVar2.showDialog(ep5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                break;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var = fragmentContextView.E;
                                if (z3) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        int i5 = aob.x7;
        yob.s(imageView5, i5, vnbVar, mode);
        this.K.addView(this.L, tre.e(20, 20, 17));
        this.K.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.K.setContentDescription(ob6.M0(2131743504, null));
        this.K.setOnClickListener(new y00((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        jc0 jc0Var = new jc0(context, false);
        this.b0 = jc0Var;
        jc0Var.setAvatarsTextSize(hl.L(21.0f));
        this.b0.setDelegate(new op4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, tre.e(jn7.s1, 36, 51));
        this.E = new b29(R.raw.voice_muted, hl.L(16.0f), hl.L(20.0f), true, null);
        up4 up4Var = new up4(this, context);
        this.y = up4Var;
        yob.s(up4Var, aob.A7, vnbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final byte b5 = 4;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: mp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b5;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                break;
                            }
                        } else {
                            MediaController.z().m(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i52 = w96Var.e;
                                if (i52 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i52).O1().t(w96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        break;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        break;
                                    }
                                } else if (r47.B0(r47Var.k) == (kz1Var2 != null ? kz1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = r47.B0(r47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (wf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (wf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", r47Var.e1());
                                    eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!id6.f(i7).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i7).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                break;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    zu1 zu1Var = (zu1) eVar2;
                                    if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                        ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                        ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                        eVar2.showDialog(ep5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                break;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var = fragmentContextView.E;
                                if (z3) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        yob.s(this.F, i5, vnbVar, mode);
        this.F.setBackground(aob.f0(aob.v0(i5, vnbVar) & 436207615, 1, hl.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: mp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b3;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                break;
                            }
                        } else {
                            MediaController.z().m(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i52 = w96Var.e;
                                if (i52 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i52).O1().t(w96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        break;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        break;
                                    }
                                } else if (r47.B0(r47Var.k) == (kz1Var2 != null ? kz1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = r47.B0(r47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (wf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (wf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", r47Var.e1());
                                    eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!id6.f(i7).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i7).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                break;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    zu1 zu1Var = (zu1) eVar2;
                                    if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                        ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                        ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                        eVar2.showDialog(ep5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                break;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var = fragmentContextView.E;
                                if (z3) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        b6 b6Var = new b6(getContext(), (byte) 14);
        this.s = b6Var;
        addView(b6Var, tre.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: mp4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        kz1 kz1Var = fragmentContextView.n;
                        vnb vnbVar2 = fragmentContextView.q0;
                        e eVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, eVar.getParentActivity());
                            String M0 = ob6.M0(2131744492, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            if (eVar instanceof uj3) {
                                idVar.U = ob6.M0(2131744494, null);
                            } else {
                                TLRPC.Chat e = kz1Var.e();
                                TLRPC.User h = kz1Var.h();
                                if (e != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToGroupText", null, 2131744493, e.title));
                                } else if (h != null) {
                                    idVar.U = hl.S2(ob6.a0("StopLiveLocationAlertToUserText", null, 2131744491, lbc.k(h, true)));
                                } else {
                                    idVar.U = ob6.M0(2131754113, null);
                                }
                            }
                            alertDialog$Builder.j(ob6.M0(2131744498, null), new lp4(fragmentContextView));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, vnbVar2);
                                break;
                            }
                        } else {
                            MediaController.z().m(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        kz1 kz1Var2 = fragmentContextView.n;
                        vnb vnbVar3 = fragmentContextView.q0;
                        e eVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            w96 w96Var = w96.N;
                            if (w96Var != null) {
                                long j2 = w96Var.b;
                                int i52 = w96Var.e;
                                if (i52 != yac.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                e S = LaunchActivity.S();
                                if (S != null && (t = uc7.s1(i52).O1().t(w96Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            r47 r47Var = MediaController.z().v0;
                            if (eVar2 != null && r47Var != null) {
                                if (r47Var.I3()) {
                                    Activity W = hl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new j20(W, vnbVar3).show();
                                        break;
                                    } else if (hl.C1(LaunchActivity.H1)) {
                                        new j20(LaunchActivity.H1, vnbVar3).show();
                                        break;
                                    }
                                } else if (r47.B0(r47Var.k) == (kz1Var2 != null ? kz1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(r47Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = r47.B0(r47Var.k);
                                    Bundle bundle = new Bundle();
                                    if (wf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (wf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", r47Var.e1());
                                    eVar2.presentFragment(new zu1(bundle), eVar2 instanceof zu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = yac.t0;
                            if (kz1Var2 != null) {
                                j = kz1Var2.a();
                                i32 = eVar2.getCurrentAccount();
                            } else {
                                if (id6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!id6.f(i7).J.isEmpty()) {
                                            hd6 hd6Var = (hd6) id6.f(i7).J.get(0);
                                            j = hd6Var.a;
                                            i32 = hd6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(id6.f(i32).h(j));
                                break;
                            } else {
                                eVar2.showDialog(new dka(fragmentContextView.getContext(), new lp4(fragmentContextView), vnbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    zu1 zu1Var = (zu1) eVar2;
                                    if (eVar2.getSendMessagesHelper().A(zu1Var.a()) != null) {
                                        ep5 ep5Var = new ep5(fragmentContextView.getContext(), null, zu1Var, vnbVar3);
                                        ep5Var.I0 = new o1(fragmentContextView, (byte) 21);
                                        eVar2.showDialog(ep5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (eVar2.getParentActivity() != null && (groupCall = kz1Var2.getGroupCall()) != null) {
                                TLRPC.Chat M02 = eVar2.getMessagesController().M0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                xkc.l(M02, null, false, Boolean.valueOf(z), eVar2.getParentActivity(), eVar2, eVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            j95.T0((LaunchActivity) fragmentContextView.getContext(), k5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        float[] fArr3 = FragmentContextView.W0;
                        if (fragmentContextView.U == 0) {
                            if (MediaController.z().G()) {
                                MediaController.z().V(MediaController.z().v0);
                                break;
                            } else {
                                MediaController.z().U(MediaController.z().v0, true);
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
                                k5.a(sharedInstance.getAccount());
                                vc2 vc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                b29 b29Var = fragmentContextView.E;
                                if (z3) {
                                    b29Var.H(0);
                                } else {
                                    b29Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            aob.E0().c(true);
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
        kz1 kz1Var = this.n;
        if (kz1Var != null) {
            byte b = 3;
            if (this.T && ((i = this.U) == 1 || i == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.e eVar = this.h;
            i7a A = eVar.getSendMessagesHelper().A(kz1Var.a());
            View fragmentView = eVar.getFragmentView();
            if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z = true;
            }
            Dialog visibleDialog = eVar.getVisibleDialog();
            if ((j() || kz1Var.n() || ((visibleDialog instanceof ep5) && !((ep5) visibleDialog).J)) && A != null) {
                A = null;
            }
            pn pnVar = this.u0;
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
                pnVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(k43.f);
                this.f.addListener(new pp4(this, b));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z && this.S == 0.0f) {
                setTopPadding(hl.M(getStyleHeight()));
                wp4 wp4Var = this.p0;
                if (wp4Var != null) {
                    ((hfa) wp4Var).b(true);
                    ((hfa) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    pnVar.d();
                    this.f = new AnimatorSet();
                    wp4 wp4Var2 = this.p0;
                    if (wp4Var2 != null) {
                        ((hfa) wp4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new pp4(this, (byte) 4));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i3 = this.Q;
            int i4 = A.l;
            if (i3 != i4) {
                this.Q = i4;
                this.d.b(hl.S2(ob6.a0("ImportUploading", null, 2131748976, Integer.valueOf(i4))), false);
            }
        }
    }

    public final void d(boolean z) {
        String G;
        String M0;
        org.telegram.ui.ActionBar.e eVar = this.h;
        View fragmentView = eVar.getFragmentView();
        if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z = true;
        }
        boolean z2 = eVar instanceof uj3;
        byte b = 0;
        boolean i = z2 ? id6.g() != 0 : id6.f(eVar.getCurrentAccount()).i(this.n.a());
        zz3 zz3Var = this.t0;
        if (!i) {
            this.s0 = -1;
            hl.r(zz3Var);
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
                this.f.addListener(new pp4(this, (byte) 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new oea(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(hl.M(getStyleHeight()));
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
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new pp4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z2) {
            zz3Var.run();
            f();
            return;
        }
        String M02 = ob6.M0(2131748594, null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.addAll(id6.f(i2).J);
        }
        if (arrayList.size() == 1) {
            hd6 hd6Var = (hd6) arrayList.get(0);
            long B0 = r47.B0(hd6Var.h.k);
            boolean D = wf3.D(B0);
            r47 r47Var = hd6Var.h;
            if (D) {
                G = lbc.k(uc7.s1(r47Var.K1).X1(Long.valueOf(B0)), true);
                M0 = ob6.M0(2131753958, null);
            } else {
                TLRPC.Chat M03 = uc7.s1(r47Var.K1).M0(Long.valueOf(-B0));
                G = M03 != null ? M03.title : "";
                M0 = ob6.M0(2131753957, null);
            }
        } else {
            G = ob6.G(arrayList.size(), "Chats", new Object[0]);
            M0 = ob6.M0(2131753956, null);
        }
        String format = String.format(M0, M02, G);
        int indexOf = format.indexOf(M02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i3 = 0;
        while (i3 < 2) {
            sp4 sp4Var = this.d;
            TextView textView = i3 == 0 ? sp4Var.getTextView() : sp4Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i3++;
        }
        spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), indexOf, M02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i == jn7.G4) {
            d(false);
            return;
        }
        if (i == jn7.G2) {
            e(false);
            return;
        }
        int i3 = jn7.I4;
        kz1 kz1Var = this.n;
        if (i == i3) {
            if (kz1Var != null) {
                if (kz1Var.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.h2 || i == jn7.g2 || i == jn7.f2 || i == jn7.D2) {
            int i4 = this.U;
            if (i4 == 1 || i4 == 3 || i4 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i5 = jn7.v2;
        if (i == i5 || i == jn7.w2 || i == jn7.F2) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i == i5) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.y == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i == jn7.C2) {
            b();
            if (this.T && this.U == 4) {
                vc2 groupCall = kz1Var.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.k()) {
                        this.e.b(ob6.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i6 = groupCall2.participants_count;
                        sp4 sp4Var = this.e;
                        boolean z = groupCall2.rtmp_stream;
                        if (i6 == 0) {
                            sp4Var.b(ob6.M0(z ? 2131743187 : 2131748368, null), false);
                        } else {
                            sp4Var.b(ob6.G(i6, z ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i == jn7.v1) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i == jn7.M4) {
            q(true);
            return;
        }
        int i8 = jn7.Q4;
        cb1 cb1Var = this.a;
        if (i == i8) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                aob.E0().a(Math.max(this.M0, this.N0));
                cb1Var.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i != jn7.R4) {
            if (i == jn7.e2 && this.U == 0) {
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
            aob.E0().a(Math.max(this.M0, this.N0));
            cb1Var.f(Math.max(this.M0, this.N0));
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
        xp4 xp4Var;
        r47 r47Var;
        if (this.r != null) {
            if (!this.R0 || getVisibility() == 0) {
                int i2 = this.U;
                float f12 = 1.0f;
                if (i2 == 3 || i2 == 1) {
                    aob.E0().c(this.P0);
                    this.a.h(this.P0);
                    getStyleHeight();
                    Typeface typeface = hl.a;
                    yp4 E0 = aob.E0();
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    Path path3 = E0.n;
                    Paint paint = E0.m;
                    int i3 = 0;
                    while (true) {
                        xp4[] xp4VarArr = E0.a;
                        if (i3 >= xp4VarArr.length) {
                            break;
                        }
                        xp4 xp4Var2 = xp4VarArr[i3];
                        int i4 = xp4Var2.i;
                        if (i4 == 0) {
                            if (xp4Var2.j != aob.w0(null, xp4Var2.m, false) || xp4Var2.k != aob.w0(null, xp4Var2.n, false)) {
                                xp4Var2.a();
                            }
                        } else if (i4 == 1) {
                            if (xp4Var2.j != aob.w0(null, xp4Var2.o, false) || xp4Var2.k != aob.w0(null, xp4Var2.p, false)) {
                                xp4Var2.a();
                            }
                        } else if (i4 == 3 && (xp4Var2.j != aob.w0(null, xp4Var2.q, false) || xp4Var2.k != aob.w0(null, xp4Var2.r, false))) {
                            xp4Var2.a();
                        }
                        i3++;
                    }
                    boolean z4 = E0.l.size() > 0;
                    if (0.0f <= measuredHeight) {
                        xp4 xp4Var3 = E0.b;
                        if (xp4Var3 != null && (xp4Var = E0.c) != null) {
                            int i5 = xp4Var.i;
                            int i6 = xp4Var3.i;
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
                                                xp4 xp4Var4 = E0.b;
                                                if (xp4Var4 == null) {
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
                                                    Matrix matrix = xp4Var4.h;
                                                    int i9 = xp4Var4.i;
                                                    if (i9 == 2) {
                                                        f5 = f23;
                                                        path = path3;
                                                        z3 = z;
                                                    } else {
                                                        float f26 = xp4Var4.e;
                                                        if (f26 == f25 || xp4Var4.f >= f26) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f5 = f23;
                                                            xp4Var4.e = secureRandom.nextInt(700) + 500;
                                                            xp4Var4.f = f25;
                                                            if (xp4Var4.a == -1.0f) {
                                                                z3 = z;
                                                                if (i9 == 3) {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    xp4Var4.a = qu6.d(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    xp4Var4.b = qu6.d(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    if (i9 == 0) {
                                                                        xp4Var4.a = qu6.d(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        xp4Var4.b = qu6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        xp4Var4.a = c00.B(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        xp4Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z3 = z;
                                                                f8 = 100.0f;
                                                            }
                                                            xp4Var4.c = xp4Var4.a;
                                                            xp4Var4.d = xp4Var4.b;
                                                            if (i9 == 3) {
                                                                xp4Var4.a = qu6.d(secureRandom.nextInt(100), 0.05f, f8, -0.3f);
                                                                xp4Var4.b = qu6.d(secureRandom.nextInt(100), 0.05f, f8, 0.7f);
                                                            } else if (i9 == 0) {
                                                                xp4Var4.a = qu6.d(secureRandom.nextInt(100), 0.2f, f8, -0.3f);
                                                                xp4Var4.b = qu6.d(secureRandom.nextInt(100), 0.3f, f8, 0.7f);
                                                            } else {
                                                                xp4Var4.a = c00.B(secureRandom.nextInt(100), f8, 0.2f, 1.1f);
                                                                xp4Var4.b = (secureRandom.nextInt(100) * 4.0f) / f8;
                                                            }
                                                        } else {
                                                            f5 = f23;
                                                            path = path3;
                                                            z3 = z;
                                                        }
                                                        float f27 = j2;
                                                        float f28 = (f27 * 0.02f * f24) + (f27 * f4) + xp4Var4.f;
                                                        xp4Var4.f = f28;
                                                        float f29 = xp4Var4.e;
                                                        if (f28 > f29) {
                                                            xp4Var4.f = f29;
                                                            f28 = f29;
                                                        }
                                                        float interpolation = k43.g.getInterpolation(f28 / f29);
                                                        float f30 = i8;
                                                        float f31 = xp4Var4.c;
                                                        float f32 = ((((xp4Var4.a - f31) * interpolation) + f31) * f30) - 200.0f;
                                                        float f33 = xp4Var4.d;
                                                        float f34 = ((((xp4Var4.b - f33) * interpolation) + f33) * i7) - 200.0f;
                                                        float f35 = (f30 / 400.0f) * ((i9 == 0 || i9 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f32, f34);
                                                        matrix.postScale(f35, f35, f32 + 200.0f, f34 + 200.0f);
                                                        xp4Var4.g.setLocalMatrix(matrix);
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
                                                xp4 xp4Var5 = E0.c;
                                                if (xp4Var5 == null) {
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
                                                    xp4Var5.b(paint);
                                                    f4 = f12;
                                                    path = path3;
                                                    z3 = z;
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (i != 1) {
                                                paint.setAlpha(jn7.d4);
                                            } else if (z3) {
                                                paint.setAlpha(jn7.d4);
                                            } else {
                                                paint.setAlpha((int) (255.0f * f7));
                                            }
                                            if (i == 1 && z3) {
                                                path.rewind();
                                                f10 = f2;
                                                float f36 = f3;
                                                float f37 = f6;
                                                path2 = path;
                                                path2.addCircle(f3 - hl.L(18.0f), bp1.z(measuredHeight, f10, 2.0f, f10), qd4.z(f36, f37, 1.1f, f7), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f9 = f36;
                                                f11 = 0.0f;
                                                j3 = j2;
                                                canvas.drawRoundRect(f37, f10, f9, measuredHeight, hl.L(18.0f), hl.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j3 = j2;
                                                f9 = f3;
                                                f10 = f2;
                                                path2 = path;
                                                f11 = 0.0f;
                                                canvas.drawRoundRect(f6, f10, f9, measuredHeight, hl.L(18.0f), hl.L(18.0f), paint);
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
                if (this.U == 0 && (r47Var = MediaController.z().v0) != null) {
                    float f38 = -hl.N(f);
                    float R1 = hl.R1(f38, hl.N(f) + getMeasuredWidth(), r47Var.b0);
                    float measuredHeight2 = getMeasuredHeight();
                    float N = measuredHeight2 - hl.N(2.0f);
                    int v0 = aob.v0(aob.Yl, this.q0);
                    Paint paint2 = this.Q0;
                    paint2.setColor(v0);
                    canvas.drawRoundRect(f38, N, R1, measuredHeight2, hl.N(f), hl.N(f), paint2);
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
        w96 w96Var = w96.N;
        pn pnVar = this.u0;
        byte b = 6;
        if (w96Var != null) {
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
                pnVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(k43.f);
                this.f.addListener(new pp4(this, b));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
                setTopPadding(hl.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z) {
                    setTopPadding(hl.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(k43.f);
                    this.f.addListener(new pp4(this, (byte) 7));
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
                    pnVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(k43.f);
                    this.f.addListener(new pp4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        w96 w96Var2 = w96.N;
        if (w96Var2 == null || this.U != 6) {
            return;
        }
        sp4 sp4Var = this.d;
        TLRPC.GroupCall groupCall = w96Var2.s;
        sp4Var.setText(ob6.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        kz1 kz1Var = this.n;
        if (kz1Var == null || this.d == null) {
            return;
        }
        b();
        long a = kz1Var.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) id6.f(currentAccount).c.f(a);
        byte b = 2;
        if (!this.r0) {
            id6 f = id6.f(currentAccount);
            zh6 zh6Var = f.H;
            if (zh6Var.h(a) < 0) {
                zh6Var.k(a, Boolean.TRUE);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f.getMessagesController().j1(a);
                tL_messages_getRecentLocations.limit = 100;
                f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new yu2(f, a, b));
            }
            this.r0 = true;
        }
        if (arrayList != null) {
            long e = yac.h(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long B1 = r47.B1(message.from_id);
                    if (user == null && B1 != e) {
                        user = uc7.s1(currentAccount).X1(Long.valueOf(B1));
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
            String M0 = ob6.M0(2131748594, null);
            if (i2 == 0) {
                format = M0;
            } else {
                int i4 = i2 - 1;
                if (!id6.f(currentAccount).i(a)) {
                    int i5 = i;
                    if (i4 != 0) {
                        String k = lbc.k(user, true);
                        String G = ob6.G(i4, "AndOther", new Object[i5]);
                        Object[] objArr = new Object[3];
                        objArr[i5] = M0;
                        objArr[1] = k;
                        objArr[2] = G;
                        format = String.format("%1$s - %2$s %3$s", objArr);
                    } else {
                        String k2 = lbc.k(user, true);
                        Object[] objArr2 = new Object[2];
                        objArr2[i5] = M0;
                        objArr2[1] = k2;
                        format = String.format("%1$s - %2$s", objArr2);
                    }
                } else if (i4 == 0) {
                    String M02 = ob6.M0(2131752149, null);
                    Object[] objArr3 = new Object[2];
                    objArr3[i] = M0;
                    objArr3[1] = M02;
                    format = String.format("%1$s - %2$s", objArr3);
                } else if (i4 != 1 || user == null) {
                    String M03 = ob6.M0(2131752149, null);
                    int i6 = i;
                    String G2 = ob6.G(i4, "AndOther", new Object[i6]);
                    Object[] objArr4 = new Object[3];
                    objArr4[i6] = M0;
                    objArr4[1] = M03;
                    objArr4[2] = G2;
                    format = String.format("%1$s - %2$s %3$s", objArr4);
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[i] = lbc.k(user, true);
                    String a0 = ob6.a0("SharingYouAndOtherName", null, 2131745096, objArr5);
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
                sp4 sp4Var = this.d;
                TextView textView = i7 == 0 ? sp4Var.getTextView() : sp4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                i7++;
            }
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), indexOf, M0.length() + indexOf, 18);
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
        r47 r47Var = MediaController.z().v0;
        View fragmentView = this.h.getFragmentView();
        boolean z3 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean z4 = this.T;
        pn pnVar = this.u0;
        if (r47Var == null || r47Var.e1() == 0 || r47.K4(r47Var.k)) {
            this.R = null;
            boolean z5 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || ra5.d()) ? false : true;
            boolean z6 = z5;
            z6 = z5;
            if (!j() && !z5) {
                kz1 kz1Var = this.n;
                z6 = z5;
                if (kz1Var != null) {
                    z6 = z5;
                    if (!ra5.d()) {
                        vc2 groupCall = kz1Var.getGroupCall();
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
            s7 s7Var = this.G;
            if (s7Var != null && s7Var.y()) {
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
            pnVar.d();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            wp4 wp4Var = this.p0;
            if (wp4Var != null) {
                ((hfa) wp4Var).b(true);
            }
            this.f.addListener(new pp4(this, z2 ? 1 : 0));
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
            setTopPadding(hl.M(getStyleHeight()));
            wp4 wp4Var2 = this.p0;
            if (wp4Var2 != null) {
                ((hfa) wp4Var2).b(true);
                ((hfa) this.p0).b(false);
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
                pnVar.d();
                this.f = new AnimatorSet();
                wp4 wp4Var3 = this.p0;
                if (wp4Var3 != null) {
                    ((hfa) wp4Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", hl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new pp4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        boolean G = MediaController.z().G();
        mf8 mf8Var = this.c;
        if (G) {
            mf8Var.a(false, !z3);
            this.b.setContentDescription(ob6.M0(2131754925, null));
        } else {
            mf8Var.a(true, !z3);
            this.b.setContentDescription(ob6.M0(2131754926, null));
        }
        if (this.R == r47Var && i2 == 0) {
            return;
        }
        this.R = r47Var;
        if (r47.Q4(r47Var.k) || this.R.g4()) {
            this.W = false;
            s7 s7Var2 = this.G;
            if (s7Var2 != null) {
                s7Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, hl.L(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(qd4.p(r47Var.w1(true), " ", r47Var.y1(true)));
            int i3 = 0;
            while (i3 < 2) {
                sp4 sp4Var = this.d;
                TextView textView = i3 == 0 ? sp4Var.getTextView() : sp4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i3++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G != null) {
                double L0 = r47Var.L0();
                s7 s7Var3 = this.G;
                if (L0 >= 600.0d) {
                    s7Var3.setAlpha(1.0f);
                    this.G.setEnabled(true);
                    this.d.setPadding(0, 0, hl.L(44.0f) + this.N, 0);
                    q(false);
                } else {
                    s7Var3.setAlpha(0.0f);
                    this.G.setEnabled(false);
                    this.d.setPadding(0, 0, this.N, 0);
                }
            } else {
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(qd4.p(r47Var.w1(true), " - ", r47Var.y1(true)));
            int i4 = 0;
            while (i4 < 2) {
                sp4 sp4Var2 = this.d;
                TextView textView2 = i4 == 0 ? sp4Var2.getTextView() : sp4Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i4++;
            }
        }
        spannableStringBuilder.setSpan(new y7c(hl.o(), aob.v0(aob.t7, this.q0)), 0, r47Var.w1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z3 && z4 && this.W);
    }

    public cb1 getCapsuleBlobDrawable() {
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
        int i = aob.j5;
        vnb vnbVar = this.q0;
        s7 s7Var = new s7(context, null, 0, aob.v0(i, vnbVar), false, this.q0);
        this.G = s7Var;
        if (s7Var.getIconView() != null) {
            yob.s(this.G.getIconView(), i, vnbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(hl.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(ob6.M0(2131754800, null));
        this.G.setDelegate(new lp4(this));
        s7 s7Var2 = this.G;
        zoa zoaVar = new zoa();
        this.H = zoaVar;
        s7Var2.setIcon(zoaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        w7 w7Var = new w7(getContext(), vnbVar);
        this.I = w7Var;
        w7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new n82(this, (byte) 29));
        q7 A = this.G.A(0, R.drawable.msg_speed_slow, ob6.M0(2131744923, null));
        q7[] q7VarArr = this.J;
        q7VarArr[0] = A;
        q7VarArr[1] = this.G.A(1, R.drawable.msg_speed_normal, ob6.M0(2131744924, null));
        q7VarArr[2] = this.G.A(2, R.drawable.msg_speed_medium, ob6.M0(2131744925, null));
        q7VarArr[3] = this.G.A(3, R.drawable.msg_speed_fast, ob6.M0(2131744927, null));
        byte b = 4;
        q7VarArr[4] = this.G.A(4, R.drawable.msg_speed_veryfast, ob6.M0(2131744921, null));
        q7VarArr[5] = this.G.A(5, R.drawable.msg_speed_superfast, ob6.M0(2131744922, null));
        if (hl.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(hl.L(8.0f));
        addView(this.G, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new je3(this, fArr, (byte) 13));
        this.G.setOnLongClickListener(new zs(this, b));
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

    public final void k(hd6 hd6Var) {
        if (hd6Var != null) {
            org.telegram.ui.ActionBar.e eVar = this.h;
            if (eVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) eVar.getParentActivity();
                launchActivity.N0(hd6Var.h.K1);
                uc6 uc6Var = new uc6(2);
                uc6Var.G0(hd6Var.h);
                uc6Var.M0 = new i02((Object) hd6Var, r47.B0(hd6Var.h.k), (byte) 6);
                launchActivity.t0(uc6Var);
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
            a0 = ob6.M0(2131753894, null);
            if (Math.abs(f - 2.0f) < 0.05f) {
                i = R.raw.speed_2to1;
            }
        } else if (z && i(f2, 1.5f) && i(f, 1.0f)) {
            a0 = ob6.a0("AudioSpeedCustom", null, 2131753896, zoa.a(f2));
            i = R.raw.speed_1to15;
        } else if (z && i(f2, 2.0f) && i(f, 1.5f)) {
            a0 = ob6.M0(2131753895, null);
            i = R.raw.speed_15to2;
        } else {
            a0 = ob6.a0("AudioSpeedCustom", null, 2131753896, zoa.a(f2));
        }
        d31.b0(this.h).Q(i, 36, a0).j();
    }

    public final void m() {
        u8a u8aVar = this.L0;
        if (u8aVar != null) {
            u8aVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            gn7[] gn7VarArr = this.K0;
            gn7 gn7Var = gn7VarArr[i];
            if (gn7Var != null) {
                gn7Var.a();
                gn7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        fe1 fe1Var = this.O;
        if (fe1Var == null || fe1Var.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            hl.d3(new op4(this, (byte) 0), 150L);
        }
    }

    public final void o(boolean z) {
        vc2 vc2Var;
        int i;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        ic0 ic0Var = this.b0.a;
        if (ic0Var.f != null) {
            ic0Var.g = true;
            return;
        }
        int i2 = this.U;
        int i3 = this.n0;
        kz1 kz1Var = this.n;
        if (i2 == 4) {
            if (kz1Var != null) {
                vc2Var = kz1Var.getGroupCall();
                i3 = this.h.getCurrentAccount();
            } else {
                vc2Var = null;
            }
            i = i3;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            vc2Var = VoIPService.getSharedInstance().groupCall;
            user = kz1Var != null ? null : VoIPService.getSharedInstance().getUser();
            i = VoIPService.getSharedInstance().getAccount();
        } else {
            vc2Var = null;
            i = i3;
            user = null;
        }
        if (vc2Var != null) {
            ArrayList arrayList = vc2Var.e;
            int size = arrayList.size();
            for (int i4 = 0; i4 < 3; i4++) {
                jc0 jc0Var = this.b0;
                if (i4 < size) {
                    jc0Var.b(i4, i, (TLObject) arrayList.get(i4));
                } else {
                    jc0Var.b(i4, i, null);
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
        if (this.U != 4 || vc2Var == null) {
            return;
        }
        int min = vc2Var.b.rtmp_stream ? 0 : Math.min(3, vc2Var.e.size());
        int h = (min == 0 ? 10 : bp1.h(min, 1, 24, 52)) + 3;
        sp4 sp4Var = this.d;
        if (z) {
            int i7 = ((FrameLayout.LayoutParams) sp4Var.getLayoutParams()).leftMargin;
            if (hl.L(h) != i7) {
                float translationX = (this.d.getTranslationX() + i7) - hl.L(r2);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                k43 k43Var = k43.f;
                duration.setInterpolator(k43Var);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(k43Var);
            }
        } else {
            sp4Var.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f = h;
        this.d.setLayoutParams(tre.d(-1, 20.0f, 51, f, 5.0f, vc2Var.k() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(tre.d(-1, 20.0f, 51, f, 25.0f, vc2Var.k() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            u8a u8aVar = new u8a(jn7.e(), this);
            u8aVar.b(jn7.G4);
            u8aVar.b(jn7.I4);
            this.L0 = u8aVar;
            d(true);
        } else {
            for (int i = 0; i < 4; i++) {
                u8a u8aVar2 = new u8a(jn7.f(i), this);
                u8aVar2.b(jn7.f2);
                u8aVar2.b(jn7.g2);
                u8aVar2.b(jn7.h2);
                u8aVar2.b(jn7.w2);
                u8aVar2.b(jn7.C2);
                u8aVar2.b(jn7.v1);
                u8aVar2.b(jn7.G2);
                u8aVar2.b(jn7.e2);
                this.K0[i] = u8aVar2;
                GroupCallMessagesController.getInstance(i).subscribeToCallMessages(0L, this);
            }
            u8a u8aVar3 = new u8a(jn7.e(), this);
            u8aVar3.b(jn7.M4);
            u8aVar3.b(jn7.v2);
            u8aVar3.b(jn7.D2);
            u8aVar3.b(jn7.R4);
            u8aVar3.b(jn7.Q4);
            u8aVar3.b(jn7.F2);
            this.L0 = u8aVar3;
            if (w96.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || ra5.d()) {
                kz1 kz1Var = this.n;
                if (kz1Var != null && this.h.getSendMessagesHelper().A(kz1Var.a()) != null && !j()) {
                    c(true);
                } else if (kz1Var == null || kz1Var.getGroupCall() == null || !kz1Var.getGroupCall().A() || ra5.d() || j()) {
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
            ArrayList arrayList = aob.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cb1 cb1Var = this.a;
            if (!cb1Var.u) {
                cb1Var.u = true;
                cb1Var.t = SystemClock.elapsedRealtime();
                jh2.d().a(60, cb1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z && this.y != null) {
                this.P = z;
                this.E.K(z ? 15 : 29);
                b29 b29Var = this.E;
                b29Var.I(b29Var.f - 1, false, true);
                this.y.invalidate();
            }
        } else if (i2 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(hl.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z2 = this.P;
        cb1 cb1Var = this.a;
        if (z2 != z) {
            this.P = z;
            this.E.K(z ? 15 : 29);
            b29 b29Var = this.E;
            b29Var.I(b29Var.f - 1, false, true);
            this.y.invalidate();
            aob.E0().c(this.T);
            cb1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            aob.E0().a(0.0f);
            cb1Var.f(0.0f);
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
            hl.r(this.m0);
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
            yp4 E0 = aob.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            cb1 cb1Var = this.a;
            if (cb1Var.u) {
                cb1Var.u = false;
                jh2.d().g(cb1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, hl.M(getStyleHeight()));
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
                this.U0.h(new vp4(this.s, groupCallMessage), true);
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
        vc2 vc2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(ob6.M0(2131743044, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (vc2Var = sharedInstance.groupCall) != null) {
                    if (vc2Var.e.size() <= 1) {
                        this.d.b(ob6.M0(2131751788, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(wf3.r(sharedInstance.getAccount(), wf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(ob6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                kz1 kz1Var = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (kz1Var == null || kz1Var.h() == null || kz1Var.h().id != user.id) {
                            this.d.setText(lv2.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(ob6.M0(2131745773, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (kz1Var == null || kz1Var.e() == null || kz1Var.e().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat e = kz1Var.e();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(ob6.M0(2131743100, null), false);
                    return;
                }
                boolean W = xc2.W(e);
                sp4 sp4Var = this.d;
                if (W) {
                    sp4Var.b(ob6.M0(2131743100, null), false);
                } else {
                    sp4Var.b(ob6.M0(2131742959, null), false);
                }
            }
        }
    }

    public final void q(boolean z) {
        if (this.H == null) {
            return;
        }
        float A = MediaController.z().A(this.W);
        this.H.b(z, A);
        updateColors();
        boolean z2 = this.A0;
        int i = 0;
        this.A0 = false;
        while (true) {
            q7[] q7VarArr = this.J;
            if (i >= q7VarArr.length) {
                this.I.e(z, A);
                return;
            }
            vnb vnbVar = this.q0;
            if (z2 || Math.abs(A - W0[i]) >= 0.05f) {
                q7 q7Var = q7VarArr[i];
                int i2 = aob.E8;
                q7Var.a(aob.v0(i2, vnbVar), aob.v0(i2, vnbVar));
            } else {
                q7 q7Var2 = q7VarArr[i];
                int i3 = aob.Hi;
                q7Var2.a(aob.v0(i3, vnbVar), aob.v0(i3, vnbVar));
            }
            i++;
        }
    }

    public final void r(int i) {
        sp4 sp4Var;
        sp4 sp4Var2;
        sp4 sp4Var3;
        sp4 sp4Var4;
        if (this.U == i) {
            return;
        }
        b();
        int i2 = this.U;
        cb1 cb1Var = this.a;
        int i3 = 0;
        if (i2 == 3 || i2 == 1) {
            yp4 E0 = aob.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            if (cb1Var.u) {
                cb1Var.u = false;
                jh2.d().g(cb1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            xa9 xa9Var = this.U0;
            if (xa9Var != null) {
                xa9Var.h(null, true);
            }
        }
        this.U = i;
        this.r.setWillNotDraw(i != 4);
        if (i != 4) {
            this.h0 = false;
        }
        jc0 jc0Var = this.b0;
        if (jc0Var != null) {
            jc0Var.setStyle(this.U);
            this.b0.setLayoutParams(tre.e(jn7.s1, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(tre.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f = this.S;
        if (f > 0.0f && f != hl.M(getStyleHeight())) {
            setTopPadding(hl.M(getStyleHeight()));
        }
        vnb vnbVar = this.q0;
        if (i != 6) {
            if (i == 5) {
                this.w.setBackground(aob.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(aob.v7));
                int i4 = 0;
                while (true) {
                    sp4Var4 = this.d;
                    if (i4 >= 2) {
                        break;
                    }
                    TextView textView = i4 == 0 ? sp4Var4.getTextView() : sp4Var4.getNextTextView();
                    if (textView != null) {
                        textView.setGravity(19);
                        yob.X(textView, aob.u7, vnbVar);
                        textView.setTypeface(Typeface.DEFAULT);
                        textView.setTextSize(1, 15.0f);
                    }
                    i4++;
                }
                sp4Var4.setTag(Integer.valueOf(aob.u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(ob6.M0(2131754896, null));
                s7 s7Var = this.G;
                if (s7Var != null) {
                    s7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
                return;
            }
            if (i == 0 || i == 2) {
                this.w.setBackground(aob.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(aob.v7));
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
                    sp4Var = this.d;
                    if (i5 >= 2) {
                        break;
                    }
                    TextView textView2 = i5 == 0 ? sp4Var.getTextView() : sp4Var.getNextTextView();
                    if (textView2 != null) {
                        textView2.setGravity(19);
                        yob.X(textView2, aob.u7, vnbVar);
                        textView2.setTypeface(Typeface.DEFAULT);
                        textView2.setTextSize(1, 15.0f);
                    }
                    i5++;
                }
                sp4Var.setTag(Integer.valueOf(aob.u7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(tre.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                    return;
                } else {
                    if (i != 0) {
                        imageView.setLayoutParams(tre.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                        this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                        this.F.setContentDescription(ob6.M0(2131754750, null));
                        return;
                    }
                    imageView.setLayoutParams(tre.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(tre.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    s7 s7Var2 = this.G;
                    if (s7Var2 != null) {
                        s7Var2.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(ob6.M0(2131754896, null));
                    return;
                }
            }
            if (i == 4) {
                this.w.setBackground(aob.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(aob.v7));
                this.y.setVisibility(8);
                this.e.setVisibility(0);
                int i6 = 0;
                while (true) {
                    sp4Var3 = this.d;
                    if (i6 >= 2) {
                        break;
                    }
                    TextView textView3 = i6 == 0 ? sp4Var3.getTextView() : sp4Var3.getNextTextView();
                    if (textView3 != null) {
                        textView3.setGravity(51);
                        yob.X(textView3, aob.t7, vnbVar);
                        textView3.setTypeface(hl.o());
                        textView3.setTextSize(1, 15.0f);
                    }
                    i6++;
                }
                sp4Var3.setTag(Integer.valueOf(aob.t7));
                this.d.setPadding(0, 0, this.N, 0);
                this.x.setVisibility(8);
                this.x.i();
                kz1 kz1Var = this.n;
                this.b0.setVisibility(!((kz1Var == null || kz1Var.getGroupCall() == null || kz1Var.getGroupCall().b == null || !kz1Var.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
                if (this.b0.getVisibility() != 8) {
                    o(false);
                } else {
                    this.d.setTranslationX(-hl.L(36.0f));
                    this.e.setTranslationX(-hl.L(36.0f));
                }
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                s7 s7Var3 = this.G;
                if (s7Var3 != null) {
                    s7Var3.setVisibility(8);
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
                b29 b29Var = this.E;
                b29Var.I(b29Var.f - 1, false, true);
                this.y.invalidate();
                this.r.setBackground(null);
                this.r.setBackgroundColor(0);
                this.x.setVisibility(8);
                this.x.i();
                ArrayList arrayList2 = aob.E0().l;
                if (!arrayList2.contains(this)) {
                    arrayList2.add(this);
                }
                if (!cb1Var.u) {
                    cb1Var.u = true;
                    cb1Var.t = SystemClock.elapsedRealtime();
                    jh2.d().a(60, cb1Var.F);
                }
                invalidate();
                int i7 = 0;
                while (true) {
                    sp4Var2 = this.d;
                    if (i7 >= 2) {
                        break;
                    }
                    TextView textView4 = i7 == 0 ? sp4Var2.getTextView() : sp4Var2.getNextTextView();
                    if (textView4 != null) {
                        textView4.setGravity(19);
                        yob.X(textView4, aob.A7, vnbVar);
                        textView4.setTypeface(hl.o());
                        textView4.setTextSize(1, 14.0f);
                    }
                    i7++;
                }
                sp4Var2.setTag(Integer.valueOf(aob.A7));
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.d.setLayoutParams(tre.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                this.d.setPadding(hl.L(88.0f), 0, hl.L(88.0f) + this.N, 0);
                s7 s7Var4 = this.G;
                if (s7Var4 != null) {
                    s7Var4.setVisibility(8);
                    this.G.setTag(null);
                    return;
                }
                return;
            }
            return;
        }
        this.w.setBackground(aob.L0(false));
        this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.v0(aob.el, vnbVar), aob.v0(aob.fl, vnbVar)}));
        this.r.setTag(null);
        this.e.setVisibility(8);
        this.M.setVisibility(8);
        this.F.setVisibility(8);
        this.b.setVisibility(8);
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        this.x.i();
        this.b0.setVisibility(8);
        this.d.setTag(Integer.valueOf(aob.A7));
        while (true) {
            sp4 sp4Var5 = this.d;
            if (i3 >= 2) {
                sp4Var5.setLayoutParams(tre.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                return;
            }
            TextView textView5 = i3 == 0 ? sp4Var5.getTextView() : sp4Var5.getNextTextView();
            if (textView5 != null) {
                textView5.setGravity(19);
                yob.X(textView5, aob.A7, vnbVar);
                textView5.setTypeface(hl.o());
                textView5.setTextSize(1, 15.0f);
            }
            i3++;
        }
    }

    public void setDelegate(wp4 wp4Var) {
        this.p0 = wp4Var;
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
        e29 e29Var = this.x;
        if (e29Var != null) {
            e29Var.setTranslationX(f);
        }
        sp4 sp4Var = this.d;
        if (sp4Var != null) {
            sp4Var.setTranslationX(f);
        }
        sp4 sp4Var2 = this.e;
        if (sp4Var2 != null) {
            sp4Var2.setTranslationX(f);
        }
        jc0 jc0Var = this.b0;
        if (jc0Var != null) {
            jc0Var.setTranslationX(f);
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

    @Override // snb
    public final void updateColors() {
        y7c[] y7cVarArr;
        cb1 cb1Var = this.a;
        int i = cb1Var.A;
        if (i >= 0) {
            cb1Var.E = 1.0f;
            cb1Var.a(cb1.e(i));
        }
        int i2 = !i(MediaController.z().A(this.W), 1.0f) ? aob.Hi : aob.x7;
        vnb vnbVar = this.q0;
        int v0 = aob.v0(i2, vnbVar);
        zoa zoaVar = this.H;
        if (zoaVar != null) {
            zoaVar.a.u(v0);
            Paint paint = zoaVar.b;
            if (paint != null) {
                paint.setColor(v0);
            }
        }
        s7 s7Var = this.G;
        if (s7Var != null) {
            Drawable background = s7Var.getBackground();
            if (background == null || background != this.E0) {
                s7 s7Var2 = this.G;
                hf0 f0 = aob.f0(436207615 & v0, 1, hl.L(14.0f));
                this.E0 = f0;
                s7Var2.setBackground(f0);
                this.J0 = v0;
            } else if (v0 != this.J0) {
                this.J0 = v0;
                aob.F1(background, v0 & 436207615, true);
            }
        }
        if (this.b != null) {
            int v02 = aob.v0(aob.w7, vnbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = aob.v0(aob.x7, vnbVar);
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
                sp4 sp4Var = this.e;
                TextView textView = i3 == 0 ? sp4Var.getTextView() : sp4Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(aob.v0(aob.x7, vnbVar));
                }
                i3++;
            }
        }
        sp4 sp4Var2 = this.d;
        if (sp4Var2 != null) {
            Object tag = sp4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i4 = 0;
                while (i4 < 2) {
                    sp4 sp4Var3 = this.d;
                    TextView textView2 = i4 == 0 ? sp4Var3.getTextView() : sp4Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(aob.v0(intValue, vnbVar));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (y7cVarArr = (y7c[]) ((Spanned) text).getSpans(0, text.length(), y7c.class)) != null) {
                            for (y7c y7cVar : y7cVarArr) {
                                y7cVar.b = aob.v0(aob.t7, vnbVar);
                            }
                        }
                    }
                    i4++;
                }
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
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

    public FragmentContextView(Context context, uj3 uj3Var, boolean z) {
        this(context, uj3Var, null, z, null);
    }
}
