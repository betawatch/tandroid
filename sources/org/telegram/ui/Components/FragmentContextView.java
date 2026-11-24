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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class FragmentContextView extends FrameLayout implements gk7, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, tjb {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public je5 B0;
    public ViewGroup C0;
    public long D0;
    public oy8 E;
    public ff0 E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public r7 G;
    public PorterDuffColorFilter G0;
    public cla H;
    public int H0;
    public v7 I;
    public int I0;
    public final p7[] J;
    public int J0;
    public FrameLayout K;
    public final hk7[] K0;
    public ImageView L;
    public wtc L0;
    public xw0 M;
    public float M0;
    public int N;
    public float N0;
    public wd1 O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public k27 R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final k79 U0;
    public String V;
    public int V0;
    public boolean W;
    public final ua1 a;
    public boolean a0;
    public ImageView b;
    public hc0 b0;
    public xb8 c;
    public Paint c0;
    public nn4 d;
    public LinearGradient d0;
    public nn4 e;
    public Matrix e0;
    public AnimatorSet f;
    public int f0;
    public TextPaint g0;
    public final org.telegram.ui.ActionBar.d h;
    public boolean h0;
    public boolean i0;
    public final gn j0;
    public n41 k0;
    public boolean l0;
    public final ln4 m0;
    public final sy1 n;
    public final int n0;
    public final boolean o0;
    public rn4 p0;
    public final wjb q0;
    public mn4 r;
    public boolean r0;
    public a6 s;
    public int s0;
    public final ez3 t0;
    public final on u0;
    public final on v0;
    public View w;
    public boolean w0;
    public ry8 x;
    public boolean x0;
    public pn4 y;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.d dVar, FrameLayout frameLayout, boolean z, wjb wjbVar) {
        super(context);
        this.a = new ua1();
        this.J = new p7[6];
        this.Q = -1;
        this.U = -1;
        this.a0 = true;
        this.j0 = new gn(false, true, true);
        this.m0 = new ln4(this);
        this.n0 = y6c.t0;
        this.s0 = -1;
        this.t0 = new ez3(this, (byte) 7);
        this.u0 = new on(null);
        this.v0 = new on(new int[]{kk7.C});
        this.K0 = new hk7[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new k79(new gn4(this), s33.h, 450L);
        this.V0 = 0;
        this.q0 = wjbVar;
        this.h = dVar;
        if (dVar instanceof sy1) {
            this.n = (sy1) dVar;
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
        wjb wjbVar = this.q0;
        return i == 4 ? bkb.v0(bkb.s7, wjbVar) : (i == 1 || i == 3) ? bkb.v0(bkb.z7, wjbVar) : bkb.v0(bkb.t7, wjbVar);
    }

    public static boolean i(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public static boolean j() {
        k27 k27Var = MediaController.w().v0;
        return k27Var != null && k27.Q4(k27Var.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        boolean z3;
        fc2 groupCall;
        fc2 fc2Var;
        int i;
        int i2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.T && this.U == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.d dVar = this.h;
        View fragmentView = dVar.getFragmentView();
        boolean z4 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean d = o85.d();
        sy1 sy1Var = this.n;
        if (d) {
            z2 = false;
        } else {
            z2 = (h75.t5 || !this.a0 || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (fc2Var = sharedInstance.groupCall) != null && (fc2Var.b instanceof TLRPC.TL_groupCallDiscarded)) {
                z2 = false;
            }
            if (j() || h75.t5 || !this.a0 || z2 || sy1Var == null || (groupCall = sy1Var.getGroupCall()) == null || !groupCall.A()) {
                z3 = false;
                on onVar = this.u0;
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
                            onVar.d();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(s33.f);
                            this.f.addListener(new kn4(this, b));
                            this.f.start();
                        }
                    } else if (z5 && ((i = this.U) == -1 || i == 4 || i == 3 || i == 1)) {
                        this.T = false;
                        setVisibility(8);
                    }
                    if (!z4 || sy1Var == null || !sy1Var.K() || o85.d()) {
                        return;
                    }
                    ir2.v(null, 2131748960, u21.b0(dVar), R.raw.linkbroken, 36);
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
                    onVar.d();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(s33.f);
                    this.f.addListener(new kn4(this, (byte) 9));
                    this.f.start();
                    return;
                }
                if (z3) {
                    boolean z6 = i4 == 4 && this.T;
                    r(4);
                    fc2 groupCall2 = sy1Var.getGroupCall();
                    TLRPC.Chat f = sy1Var.f();
                    if (groupCall2.k()) {
                        if (this.c0 == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.g0 = textPaint;
                            textPaint.setColor(-1);
                            this.g0.setTextSize(gl.L(14.0f));
                            this.g0.setTypeface(gl.o());
                            Paint paint = new Paint(1);
                            this.c0 = paint;
                            paint.setColor(-1);
                            this.e0 = new Matrix();
                        }
                        this.h0 = true;
                        k96.M0(2131743198, null);
                        TLRPC.GroupCall groupCall3 = groupCall2.b;
                        this.i0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.M.setVisibility(8);
                        if (TextUtils.isEmpty(groupCall2.b.title)) {
                            boolean W = hc2.W(f);
                            nn4 nn4Var = this.d;
                            if (W) {
                                nn4Var.b(k96.M0(2131743219, null), false);
                            } else {
                                nn4Var.b(k96.M0(2131743098, null), false);
                            }
                        } else {
                            this.d.b(groupCall2.b.title, false);
                        }
                        this.e.b(k96.W(4, groupCall2.b.schedule_date, true), false);
                        if (!this.l0) {
                            this.l0 = true;
                            this.m0.run();
                        }
                    } else {
                        this.h0 = false;
                        this.M.setVisibility(0);
                        this.M.setText(k96.M0(2131743200, null));
                        if (!TextUtils.isEmpty(groupCall2.b.title)) {
                            this.d.b(groupCall2.b.title, false);
                        } else if (groupCall2.b.rtmp_stream) {
                            this.d.b(k96.M0(2131743205, null), false);
                        } else {
                            boolean W2 = hc2.W(f);
                            nn4 nn4Var2 = this.d;
                            if (W2) {
                                nn4Var2.b(k96.M0(2131743205, null), false);
                            } else {
                                nn4Var2.b(k96.M0(2131743064, null), false);
                            }
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.b;
                        int i5 = groupCall4.participants_count;
                        nn4 nn4Var3 = this.e;
                        boolean z7 = groupCall4.rtmp_stream;
                        if (i5 == 0) {
                            nn4Var3.b(k96.M0(z7 ? 2131743293 : 2131748422, null), false);
                        } else {
                            nn4Var3.b(k96.G(i5, z7 ? "ViewersWatching" : "Participants", new Object[0]), false);
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
                    setTopPadding(gl.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(s33.f);
                    this.f.addListener(new kn4(this, (byte) 10));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
                return;
            }
            z2 = true;
        }
        z3 = z2;
        on onVar2 = this.u0;
        byte b2 = 8;
        if (z2) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        mn4 mn4Var = new mn4(this, context);
        this.r = mn4Var;
        this.k0 = new n41(mn4Var);
        int i = gl.q.x;
        gn gnVar = this.j0;
        gnVar.N = i;
        gnVar.B = 0.4f;
        gnVar.setCallback(mn4Var);
        gnVar.u(-1);
        gnVar.w(gl.L(14.0f));
        gnVar.x(gl.o());
        addView(this.r, nme.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.w = view;
        this.r.addView(view, nme.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i2 = bkb.v7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wjb wjbVar = this.q0;
        zkb.s(imageView2, i2, wjbVar, mode);
        ImageView imageView3 = this.b;
        xb8 xb8Var = new xb8(16);
        this.c = xb8Var;
        imageView3.setImageDrawable(xb8Var);
        final byte b = 1;
        this.b.setBackground(bkb.f0(bkb.v0(i2, wjbVar) & 436207615, 1, gl.L(14.0f)));
        addView(this.b, nme.e(36, 36, 51));
        final byte b2 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: hn4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fc2 groupCall;
                int i3;
                long j;
                TL_stories.StoryItem t;
                byte b3 = b2;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b3) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i4 = fragmentContextView.U;
                        if (i4 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i5 = t76Var.e;
                                if (i5 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i5).M1().t(t76Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i4 == 0) {
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        break;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        break;
                                    }
                                } else if (k27.B0(k27Var.k) == (sy1Var2 != null ? sy1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k27.B0(k27Var.k);
                                    Bundle bundle = new Bundle();
                                    if (cf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (cf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k27Var.e1());
                                    dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                    break;
                                }
                            }
                        } else if (i4 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i4 == 2) {
                            int i6 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i3 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!eb6.f(i7).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i7).J.get(0);
                                            j = db6Var.a;
                                            i3 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i3 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i3).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                break;
                            }
                        } else if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    mu1 mu1Var = (mu1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                        bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                        bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bn5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var = fragmentContextView.E;
                                if (z3) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        ry8 ry8Var = new ry8(context);
        this.x = ry8Var;
        ry8Var.setScaleType(scaleType);
        this.x.setAutoRepeat(true);
        this.x.f(R.raw.import_progress, 30, 30, null);
        zkb.B(this.x, bkb.K(gl.L(22.0f), bkb.v0(i2, wjbVar)), zkb.M(i2), wjbVar);
        addView(this.x, nme.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        final byte b3 = 0;
        nn4 nn4Var = new nn4(this, context, context, b3);
        this.d = nn4Var;
        addView(nn4Var, nme.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
        nn4 nn4Var2 = new nn4(this, context, context, b);
        this.e = nn4Var2;
        addView(nn4Var2, nme.d(-1, 36.0f, 51, 35.0f, 10.0f, 36.0f, 0.0f));
        wd1 wd1Var = new wd1();
        this.O = wd1Var;
        wd1Var.g = 1.0f;
        wd1Var.j = false;
        xw0 xw0Var = new xw0((byte) 2, context, this);
        this.M = xw0Var;
        xw0Var.setText(k96.M0(2131743200, null));
        zkb.X(this.M, bkb.Ii, wjbVar);
        xw0 xw0Var2 = this.M;
        int L = gl.L(16.0f);
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, wjbVar);
        int i4 = bkb.Gi;
        int v02 = bkb.v0(i4, wjbVar);
        zkb.R(xw0Var2, bkb.i0(L, L, L, L, v0, v02, v02), zkb.M(i3), zkb.M(i4), wjbVar);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(gl.o());
        this.M.setGravity(17);
        this.M.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        addView(this.M, nme.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final byte b4 = 3;
        this.M.setOnClickListener(new View.OnClickListener(this) { // from class: hn4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b4;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i5 = t76Var.e;
                                if (i5 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i5);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i5).M1().t(t76Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i5).E(i5, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        break;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        break;
                                    }
                                } else if (k27.B0(k27Var.k) == (sy1Var2 != null ? sy1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k27.B0(k27Var.k);
                                    Bundle bundle = new Bundle();
                                    if (cf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (cf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k27Var.e1());
                                    dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!eb6.f(i7).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i7).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    mu1 mu1Var = (mu1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                        bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                        bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bn5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var = fragmentContextView.E;
                                if (z3) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        int i5 = bkb.w7;
        zkb.s(imageView5, i5, wjbVar, mode);
        this.K.addView(this.L, nme.e(20, 20, 17));
        this.K.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.K.setContentDescription(k96.M0(2131743610, null));
        this.K.setOnClickListener(new x00((byte) 7));
        this.K.setVisibility(8);
        addView(this.K, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.o0) {
            h();
        }
        hc0 hc0Var = new hc0(context, false);
        this.b0 = hc0Var;
        hc0Var.setAvatarsTextSize(gl.L(21.0f));
        this.b0.setDelegate(new jn4(this, (byte) 1));
        this.b0.setVisibility(8);
        addView(this.b0, nme.e(kk7.s1, 36, 51));
        this.E = new oy8(R.raw.voice_muted, gl.L(16.0f), gl.L(20.0f), true, null);
        pn4 pn4Var = new pn4(this, context);
        this.y = pn4Var;
        zkb.s(pn4Var, bkb.z7, wjbVar, PorterDuff.Mode.SRC_IN);
        this.y.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.y.setAnimation(this.E);
        this.y.setScaleType(scaleType);
        this.y.setVisibility(8);
        addView(this.y, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final byte b5 = 4;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: hn4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b5;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i52 = t76Var.e;
                                if (i52 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i52).M1().t(t76Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        break;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        break;
                                    }
                                } else if (k27.B0(k27Var.k) == (sy1Var2 != null ? sy1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k27.B0(k27Var.k);
                                    Bundle bundle = new Bundle();
                                    if (cf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (cf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k27Var.e1());
                                    dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!eb6.f(i7).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i7).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    mu1 mu1Var = (mu1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                        bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                        bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bn5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var = fragmentContextView.E;
                                if (z3) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        zkb.s(this.F, i5, wjbVar, mode);
        this.F.setBackground(bkb.f0(bkb.v0(i5, wjbVar) & 436207615, 1, gl.L(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) { // from class: hn4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b3;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i52 = t76Var.e;
                                if (i52 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i52).M1().t(t76Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        break;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        break;
                                    }
                                } else if (k27.B0(k27Var.k) == (sy1Var2 != null ? sy1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k27.B0(k27Var.k);
                                    Bundle bundle = new Bundle();
                                    if (cf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (cf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k27Var.e1());
                                    dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!eb6.f(i7).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i7).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    mu1 mu1Var = (mu1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                        bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                        bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bn5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var = fragmentContextView.E;
                                if (z3) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        addView(a6Var, nme.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) { // from class: hn4
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fc2 groupCall;
                int i32;
                long j;
                TL_stories.StoryItem t;
                byte b32 = b;
                boolean z = false;
                FragmentContextView fragmentContextView = this.b;
                switch (b32) {
                    case 0:
                        float[] fArr = FragmentContextView.W0;
                        sy1 sy1Var = fragmentContextView.n;
                        wjb wjbVar2 = fragmentContextView.q0;
                        d dVar = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, dVar.getParentActivity());
                            String M0 = k96.M0(2131744598, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (dVar instanceof cj3) {
                                hdVar.U = k96.M0(2131744600, null);
                            } else {
                                TLRPC.Chat f = sy1Var.f();
                                TLRPC.User h = sy1Var.h();
                                if (f != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToGroupText", null, 2131744599, f.title));
                                } else if (h != null) {
                                    hdVar.U = gl.S2(k96.a0("StopLiveLocationAlertToUserText", null, 2131744597, l7c.k(h, true)));
                                } else {
                                    hdVar.U = k96.M0(2131754117, null);
                                }
                            }
                            alertDialog$Builder.j(k96.M0(2131744604, null), new gn4(fragmentContextView));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, wjbVar2);
                                break;
                            }
                        } else {
                            MediaController.w().l(true, true, false, false);
                            break;
                        }
                        break;
                    case 1:
                        float[] fArr2 = FragmentContextView.W0;
                        sy1 sy1Var2 = fragmentContextView.n;
                        wjb wjbVar3 = fragmentContextView.q0;
                        d dVar2 = fragmentContextView.h;
                        int i42 = fragmentContextView.U;
                        if (i42 == 6) {
                            t76 t76Var = t76.N;
                            if (t76Var != null) {
                                long j2 = t76Var.b;
                                int i52 = t76Var.e;
                                if (i52 != y6c.t0) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.N0(i52);
                                    }
                                }
                                d S = LaunchActivity.S();
                                if (S != null && (t = na7.q1(i52).M1().t(t76Var.c, j2)) != null) {
                                    t.dialogId = j2;
                                    S.getOrCreateStoryViewer(i52).E(i52, fragmentContextView.getContext(), t, null);
                                    break;
                                }
                            }
                        } else if (i42 == 0) {
                            k27 k27Var = MediaController.w().v0;
                            if (dVar2 != null && k27Var != null) {
                                if (k27Var.I3()) {
                                    Activity W = gl.W(fragmentContextView.getContext());
                                    if (W instanceof LaunchActivity) {
                                        new i20(W, wjbVar3).show();
                                        break;
                                    } else if (gl.C1(LaunchActivity.H1)) {
                                        new i20(LaunchActivity.H1, wjbVar3).show();
                                        break;
                                    }
                                } else if (k27.B0(k27Var.k) == (sy1Var2 != null ? sy1Var2.a() : 0L)) {
                                    fragmentContextView.n.J(k27Var.e1(), 0, 0, 0, false, true);
                                    break;
                                } else {
                                    long B0 = k27.B0(k27Var.k);
                                    Bundle bundle = new Bundle();
                                    if (cf3.B(B0)) {
                                        bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                                    } else if (cf3.D(B0)) {
                                        bundle.putLong("user_id", B0);
                                    } else {
                                        bundle.putLong("chat_id", -B0);
                                    }
                                    bundle.putInt("message_id", k27Var.e1());
                                    dVar2.presentFragment(new mu1(bundle), dVar2 instanceof mu1);
                                    break;
                                }
                            }
                        } else if (i42 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i42 == 2) {
                            int i6 = y6c.t0;
                            if (sy1Var2 != null) {
                                j = sy1Var2.a();
                                i32 = dVar2.getCurrentAccount();
                            } else {
                                if (eb6.g() == 1) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (!eb6.f(i7).J.isEmpty()) {
                                            db6 db6Var = (db6) eb6.f(i7).J.get(0);
                                            j = db6Var.a;
                                            i32 = db6Var.h.K1;
                                        }
                                    }
                                }
                                i32 = i6;
                                j = 0;
                            }
                            if (j != 0) {
                                fragmentContextView.k(eb6.f(i32).h(j));
                                break;
                            } else {
                                dVar2.showDialog(new kga(fragmentContextView.getContext(), new gn4(fragmentContextView), wjbVar3));
                                break;
                            }
                        } else if (i42 != 3) {
                            if (i42 != 4) {
                                if (i42 == 5) {
                                    mu1 mu1Var = (mu1) dVar2;
                                    if (dVar2.getSendMessagesHelper().A(mu1Var.a()) != null) {
                                        bn5 bn5Var = new bn5(fragmentContextView.getContext(), null, mu1Var, wjbVar3);
                                        bn5Var.I0 = new n1(fragmentContextView, (byte) 21);
                                        dVar2.showDialog(bn5Var);
                                        fragmentContextView.c(false);
                                        break;
                                    }
                                }
                            } else if (dVar2.getParentActivity() != null && (groupCall = sy1Var2.getGroupCall()) != null) {
                                TLRPC.Chat K0 = dVar2.getMessagesController().K0(Long.valueOf(groupCall.c));
                                TLRPC.GroupCall groupCall2 = groupCall.b;
                                if (groupCall2 != null && !groupCall2.rtmp_stream) {
                                    z = true;
                                }
                                rgc.l(K0, null, false, Boolean.valueOf(z), dVar2.getParentActivity(), dVar2, dVar2.getAccountInstance());
                                break;
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            h75.S0((LaunchActivity) fragmentContextView.getContext(), j5.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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
                                fc2 fc2Var = sharedInstance.groupCall;
                                TLRPC.Chat chat = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, chat)) {
                                }
                            }
                            boolean z2 = !sharedInstance.isMicMute();
                            fragmentContextView.P = z2;
                            sharedInstance.setMicMute(z2, false, true);
                            if (fragmentContextView.E.K(fragmentContextView.P ? 15 : 29)) {
                                boolean z3 = fragmentContextView.P;
                                oy8 oy8Var = fragmentContextView.E;
                                if (z3) {
                                    oy8Var.H(0);
                                } else {
                                    oy8Var.H(14);
                                }
                            }
                            fragmentContextView.y.d();
                            bkb.E0().c(true);
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
        sy1 sy1Var = this.n;
        if (sy1Var != null) {
            byte b = 3;
            if (this.T && ((i = this.U) == 1 || i == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.d dVar = this.h;
            p3a A = dVar.getSendMessagesHelper().A(sy1Var.a());
            View fragmentView = dVar.getFragmentView();
            if (!z && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z = true;
            }
            Dialog visibleDialog = dVar.getVisibleDialog();
            if ((j() || sy1Var.n() || ((visibleDialog instanceof bn5) && !((bn5) visibleDialog).J)) && A != null) {
                A = null;
            }
            on onVar = this.u0;
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
                onVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(s33.f);
                this.f.addListener(new kn4(this, b));
                this.f.start();
                return;
            }
            if (this.U != 5 && this.f != null && !z) {
                this.z0 = true;
                return;
            }
            r(5);
            if (z && this.S == 0.0f) {
                setTopPadding(gl.M(getStyleHeight()));
                rn4 rn4Var = this.p0;
                if (rn4Var != null) {
                    ((qba) rn4Var).b(true);
                    ((qba) this.p0).b(false);
                }
            }
            if (!this.T) {
                if (!z) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    onVar.d();
                    this.f = new AnimatorSet();
                    rn4 rn4Var2 = this.p0;
                    if (rn4Var2 != null) {
                        ((qba) rn4Var2).b(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new kn4(this, (byte) 4));
                    this.f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            int i3 = this.Q;
            int i4 = A.l;
            if (i3 != i4) {
                this.Q = i4;
                this.d.b(gl.S2(k96.a0("ImportUploading", null, 2131749030, Integer.valueOf(i4))), false);
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
        boolean z2 = dVar instanceof cj3;
        byte b = 0;
        boolean i = z2 ? eb6.g() != 0 : eb6.f(dVar.getCurrentAccount()).i(this.n.a());
        ez3 ez3Var = this.t0;
        if (!i) {
            this.s0 = -1;
            gl.r(ez3Var);
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
                this.f.addListener(new kn4(this, (byte) 11));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new xaa(getContext(), 1));
        if (z && this.S == 0.0f) {
            setTopPadding(gl.M(getStyleHeight()));
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
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new kn4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (!z2) {
            ez3Var.run();
            f();
            return;
        }
        String M02 = k96.M0(2131748648, null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.addAll(eb6.f(i2).J);
        }
        if (arrayList.size() == 1) {
            db6 db6Var = (db6) arrayList.get(0);
            long B0 = k27.B0(db6Var.h.k);
            boolean D = cf3.D(B0);
            k27 k27Var = db6Var.h;
            if (D) {
                G = l7c.k(na7.q1(k27Var.K1).V1(Long.valueOf(B0)), true);
                M0 = k96.M0(2131753962, null);
            } else {
                TLRPC.Chat K0 = na7.q1(k27Var.K1).K0(Long.valueOf(-B0));
                G = K0 != null ? K0.title : "";
                M0 = k96.M0(2131753961, null);
            }
        } else {
            G = k96.G(arrayList.size(), "Chats", new Object[0]);
            M0 = k96.M0(2131753960, null);
        }
        String format = String.format(M0, M02, G);
        int indexOf = format.indexOf(M02);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i3 = 0;
        while (i3 < 2) {
            nn4 nn4Var = this.d;
            TextView textView = i3 == 0 ? nn4Var.getTextView() : nn4Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i3++;
        }
        spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), indexOf, M02.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i == kk7.F4) {
            d(false);
            return;
        }
        if (i == kk7.F2) {
            e(false);
            return;
        }
        int i3 = kk7.H4;
        sy1 sy1Var = this.n;
        if (i == i3) {
            if (sy1Var != null) {
                if (sy1Var.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.g2 || i == kk7.f2 || i == kk7.e2 || i == kk7.C2) {
            int i4 = this.U;
            if (i4 == 1 || i4 == 3 || i4 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i5 = kk7.u2;
        if (i == i5 || i == kk7.v2 || i == kk7.E2) {
            a(false);
            if (this.U != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i == i5) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.y == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || hc2.w(14, sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i == kk7.B2) {
            b();
            if (this.T && this.U == 4) {
                fc2 groupCall = sy1Var.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.k()) {
                        this.e.b(k96.W(4, groupCall.b.schedule_date, true), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        int i6 = groupCall2.participants_count;
                        nn4 nn4Var = this.e;
                        boolean z = groupCall2.rtmp_stream;
                        if (i6 == 0) {
                            nn4Var.b(k96.M0(z ? 2131743293 : 2131748422, null), false);
                        } else {
                            nn4Var.b(k96.G(i6, z ? "ViewersWatching" : "Participants", new Object[0]), false);
                        }
                    }
                }
                o(true);
                return;
            }
            return;
        }
        if (i == kk7.u1) {
            int i7 = this.U;
            if (i7 == 1 || i7 == 3 || i7 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i == kk7.L4) {
            q(true);
            return;
        }
        int i8 = kk7.P4;
        ua1 ua1Var = this.a;
        if (i == i8) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.N0 = 0.0f;
            } else {
                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                bkb.E0().a(Math.max(this.M0, this.N0));
                ua1Var.f(Math.max(this.M0, this.N0));
                return;
            }
            return;
        }
        if (i != kk7.Q4) {
            if (i == kk7.d2 && this.U == 0) {
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
            bkb.E0().a(Math.max(this.M0, this.N0));
            ua1Var.f(Math.max(this.M0, this.N0));
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
        sn4 sn4Var;
        k27 k27Var;
        if (this.r != null) {
            if (!this.R0 || getVisibility() == 0) {
                int i2 = this.U;
                float f12 = 1.0f;
                if (i2 == 3 || i2 == 1) {
                    bkb.E0().c(this.P0);
                    this.a.h(this.P0);
                    getStyleHeight();
                    Typeface typeface = gl.a;
                    tn4 E0 = bkb.E0();
                    float measuredWidth = getMeasuredWidth();
                    float measuredHeight = getMeasuredHeight();
                    Path path3 = E0.n;
                    Paint paint = E0.m;
                    int i3 = 0;
                    while (true) {
                        sn4[] sn4VarArr = E0.a;
                        if (i3 >= sn4VarArr.length) {
                            break;
                        }
                        sn4 sn4Var2 = sn4VarArr[i3];
                        int i4 = sn4Var2.i;
                        if (i4 == 0) {
                            if (sn4Var2.j != bkb.w0(null, sn4Var2.m, false) || sn4Var2.k != bkb.w0(null, sn4Var2.n, false)) {
                                sn4Var2.a();
                            }
                        } else if (i4 == 1) {
                            if (sn4Var2.j != bkb.w0(null, sn4Var2.o, false) || sn4Var2.k != bkb.w0(null, sn4Var2.p, false)) {
                                sn4Var2.a();
                            }
                        } else if (i4 == 3 && (sn4Var2.j != bkb.w0(null, sn4Var2.q, false) || sn4Var2.k != bkb.w0(null, sn4Var2.r, false))) {
                            sn4Var2.a();
                        }
                        i3++;
                    }
                    boolean z4 = E0.l.size() > 0;
                    if (0.0f <= measuredHeight) {
                        sn4 sn4Var3 = E0.b;
                        if (sn4Var3 != null && (sn4Var = E0.c) != null) {
                            int i5 = sn4Var.i;
                            int i6 = sn4Var3.i;
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
                                                sn4 sn4Var4 = E0.b;
                                                if (sn4Var4 == null) {
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
                                                    Matrix matrix = sn4Var4.h;
                                                    int i9 = sn4Var4.i;
                                                    if (i9 == 2) {
                                                        f5 = f23;
                                                        path = path3;
                                                        z3 = z;
                                                    } else {
                                                        float f26 = sn4Var4.e;
                                                        if (f26 == f25 || sn4Var4.f >= f26) {
                                                            SecureRandom secureRandom = Utilities.b;
                                                            f5 = f23;
                                                            sn4Var4.e = secureRandom.nextInt(700) + 500;
                                                            sn4Var4.f = f25;
                                                            if (sn4Var4.a == -1.0f) {
                                                                z3 = z;
                                                                if (i9 == 3) {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    sn4Var4.a = ls6.d(secureRandom.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                                    sn4Var4.b = ls6.d(secureRandom.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                                } else {
                                                                    path = path3;
                                                                    f8 = 100.0f;
                                                                    if (i9 == 0) {
                                                                        sn4Var4.a = ls6.d(secureRandom.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                                        sn4Var4.b = ls6.d(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                                    } else {
                                                                        sn4Var4.a = b00.A(secureRandom.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                                        sn4Var4.b = (secureRandom.nextInt(100) * 4.0f) / 100.0f;
                                                                    }
                                                                }
                                                            } else {
                                                                path = path3;
                                                                z3 = z;
                                                                f8 = 100.0f;
                                                            }
                                                            sn4Var4.c = sn4Var4.a;
                                                            sn4Var4.d = sn4Var4.b;
                                                            if (i9 == 3) {
                                                                sn4Var4.a = ls6.d(secureRandom.nextInt(100), 0.05f, f8, -0.3f);
                                                                sn4Var4.b = ls6.d(secureRandom.nextInt(100), 0.05f, f8, 0.7f);
                                                            } else if (i9 == 0) {
                                                                sn4Var4.a = ls6.d(secureRandom.nextInt(100), 0.2f, f8, -0.3f);
                                                                sn4Var4.b = ls6.d(secureRandom.nextInt(100), 0.3f, f8, 0.7f);
                                                            } else {
                                                                sn4Var4.a = b00.A(secureRandom.nextInt(100), f8, 0.2f, 1.1f);
                                                                sn4Var4.b = (secureRandom.nextInt(100) * 4.0f) / f8;
                                                            }
                                                        } else {
                                                            f5 = f23;
                                                            path = path3;
                                                            z3 = z;
                                                        }
                                                        float f27 = j2;
                                                        float f28 = (f27 * 0.02f * f24) + (f27 * f4) + sn4Var4.f;
                                                        sn4Var4.f = f28;
                                                        float f29 = sn4Var4.e;
                                                        if (f28 > f29) {
                                                            sn4Var4.f = f29;
                                                            f28 = f29;
                                                        }
                                                        float interpolation = s33.g.getInterpolation(f28 / f29);
                                                        float f30 = i8;
                                                        float f31 = sn4Var4.c;
                                                        float f32 = ((((sn4Var4.a - f31) * interpolation) + f31) * f30) - 200.0f;
                                                        float f33 = sn4Var4.d;
                                                        float f34 = ((((sn4Var4.b - f33) * interpolation) + f33) * i7) - 200.0f;
                                                        float f35 = (f30 / 400.0f) * ((i9 == 0 || i9 == 3) ? 3.0f : 1.5f);
                                                        matrix.reset();
                                                        matrix.postTranslate(f32, f34);
                                                        matrix.postScale(f35, f35, f32 + 200.0f, f34 + 200.0f);
                                                        sn4Var4.g.setLocalMatrix(matrix);
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
                                                sn4 sn4Var5 = E0.c;
                                                if (sn4Var5 == null) {
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
                                                    sn4Var5.b(paint);
                                                    f4 = f12;
                                                    path = path3;
                                                    z3 = z;
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (i != 1) {
                                                paint.setAlpha(kk7.d4);
                                            } else if (z3) {
                                                paint.setAlpha(kk7.d4);
                                            } else {
                                                paint.setAlpha((int) (255.0f * f7));
                                            }
                                            if (i == 1 && z3) {
                                                path.rewind();
                                                f10 = f2;
                                                float f36 = f3;
                                                float f37 = f6;
                                                path2 = path;
                                                path2.addCircle(f3 - gl.L(18.0f), oo1.z(measuredHeight, f10, 2.0f, f10), tb4.z(f36, f37, 1.1f, f7), Path.Direction.CW);
                                                canvas.save();
                                                canvas.clipPath(path2);
                                                f9 = f36;
                                                f11 = 0.0f;
                                                j3 = j2;
                                                canvas.drawRoundRect(f37, f10, f9, measuredHeight, gl.L(18.0f), gl.L(18.0f), paint);
                                                canvas.restore();
                                            } else {
                                                j3 = j2;
                                                f9 = f3;
                                                f10 = f2;
                                                path2 = path;
                                                f11 = 0.0f;
                                                canvas.drawRoundRect(f6, f10, f9, measuredHeight, gl.L(18.0f), gl.L(18.0f), paint);
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
                if (this.U == 0 && (k27Var = MediaController.w().v0) != null) {
                    float f38 = -gl.N(f);
                    float R1 = gl.R1(f38, gl.N(f) + getMeasuredWidth(), k27Var.b0);
                    float measuredHeight2 = getMeasuredHeight();
                    float N = measuredHeight2 - gl.N(2.0f);
                    int v0 = bkb.v0(bkb.Xl, this.q0);
                    Paint paint2 = this.Q0;
                    paint2.setColor(v0);
                    canvas.drawRoundRect(f38, N, R1, measuredHeight2, gl.N(f), gl.N(f), paint2);
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
        t76 t76Var = t76.N;
        on onVar = this.u0;
        byte b = 6;
        if (t76Var != null) {
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
                onVar.d();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(s33.f);
                this.f.addListener(new kn4(this, b));
                this.f.start();
                return;
            }
            r(6);
            if (this.T) {
                setTopPadding(gl.M(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z) {
                    setTopPadding(gl.M(getStyleHeight()));
                    n();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.v0.d();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(s33.f);
                    this.f.addListener(new kn4(this, (byte) 7));
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
                    onVar.d();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(s33.f);
                    this.f.addListener(new kn4(this, (byte) 5));
                    this.f.start();
                }
            } else if (z2 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        t76 t76Var2 = t76.N;
        if (t76Var2 == null || this.U != 6) {
            return;
        }
        nn4 nn4Var = this.d;
        TLRPC.GroupCall groupCall = t76Var2.s;
        nn4Var.setText(k96.H(',', "LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i;
        TLRPC.User user;
        int i2;
        String format;
        sy1 sy1Var = this.n;
        if (sy1Var == null || this.d == null) {
            return;
        }
        b();
        long a = sy1Var.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) eb6.f(currentAccount).c.f(a);
        byte b = 2;
        if (!this.r0) {
            eb6 f = eb6.f(currentAccount);
            vf6 vf6Var = f.H;
            if (vf6Var.h(a) < 0) {
                vf6Var.k(Boolean.TRUE, a);
                TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
                tL_messages_getRecentLocations.peer = f.getMessagesController().h1(a);
                tL_messages_getRecentLocations.limit = 100;
                f.getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new eu2(f, a, b));
            }
            this.r0 = true;
        }
        if (arrayList != null) {
            long e = y6c.h(currentAccount).e();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            user = null;
            i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long B1 = k27.B1(message.from_id);
                    if (user == null && B1 != e) {
                        user = na7.q1(currentAccount).V1(Long.valueOf(B1));
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
            String M0 = k96.M0(2131748648, null);
            if (i2 == 0) {
                format = M0;
            } else {
                int i4 = i2 - 1;
                if (!eb6.f(currentAccount).i(a)) {
                    int i5 = i;
                    if (i4 != 0) {
                        String k = l7c.k(user, true);
                        String G = k96.G(i4, "AndOther", new Object[i5]);
                        Object[] objArr = new Object[3];
                        objArr[i5] = M0;
                        objArr[1] = k;
                        objArr[2] = G;
                        format = String.format("%1$s - %2$s %3$s", objArr);
                    } else {
                        String k2 = l7c.k(user, true);
                        Object[] objArr2 = new Object[2];
                        objArr2[i5] = M0;
                        objArr2[1] = k2;
                        format = String.format("%1$s - %2$s", objArr2);
                    }
                } else if (i4 == 0) {
                    String M02 = k96.M0(2131752172, null);
                    Object[] objArr3 = new Object[2];
                    objArr3[i] = M0;
                    objArr3[1] = M02;
                    format = String.format("%1$s - %2$s", objArr3);
                } else if (i4 != 1 || user == null) {
                    String M03 = k96.M0(2131752172, null);
                    int i6 = i;
                    String G2 = k96.G(i4, "AndOther", new Object[i6]);
                    Object[] objArr4 = new Object[3];
                    objArr4[i6] = M0;
                    objArr4[1] = M03;
                    objArr4[2] = G2;
                    format = String.format("%1$s - %2$s %3$s", objArr4);
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[i] = l7c.k(user, true);
                    String a0 = k96.a0("SharingYouAndOtherName", null, 2131745176, objArr5);
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
                nn4 nn4Var = this.d;
                TextView textView = i7 == 0 ? nn4Var.getTextView() : nn4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
                i7++;
            }
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), indexOf, M0.length() + indexOf, 18);
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
        k27 k27Var = MediaController.w().v0;
        View fragmentView = this.h.getFragmentView();
        boolean z3 = (z || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z : true;
        boolean z4 = this.T;
        on onVar = this.u0;
        if (k27Var == null || k27Var.e1() == 0 || k27.K4(k27Var.k)) {
            this.R = null;
            boolean z5 = (!this.a0 || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || o85.d()) ? false : true;
            boolean z6 = z5;
            z6 = z5;
            if (!j() && !z5) {
                sy1 sy1Var = this.n;
                z6 = z5;
                if (sy1Var != null) {
                    z6 = z5;
                    if (!o85.d()) {
                        fc2 groupCall = sy1Var.getGroupCall();
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
            onVar.d();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            rn4 rn4Var = this.p0;
            if (rn4Var != null) {
                ((qba) rn4Var).b(true);
            }
            this.f.addListener(new kn4(this, z2 ? 1 : 0));
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
            setTopPadding(gl.M(getStyleHeight()));
            rn4 rn4Var2 = this.p0;
            if (rn4Var2 != null) {
                ((qba) rn4Var2).b(true);
                ((qba) this.p0).b(false);
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
                onVar.d();
                this.f = new AnimatorSet();
                rn4 rn4Var3 = this.p0;
                if (rn4Var3 != null) {
                    ((qba) rn4Var3).b(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", gl.M(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new kn4(this, b));
                this.f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        boolean C = MediaController.w().C();
        xb8 xb8Var = this.c;
        if (C) {
            xb8Var.a(false, !z3);
            this.b.setContentDescription(k96.M0(2131754929, null));
        } else {
            xb8Var.a(true, !z3);
            this.b.setContentDescription(k96.M0(2131754930, null));
        }
        if (this.R == k27Var && i2 == 0) {
            return;
        }
        this.R = k27Var;
        if (k27.Q4(k27Var.k) || this.R.g4()) {
            this.W = false;
            r7 r7Var2 = this.G;
            if (r7Var2 != null) {
                r7Var2.setAlpha(1.0f);
                this.G.setEnabled(true);
            }
            this.d.setPadding(0, 0, gl.L(44.0f) + this.N, 0);
            spannableStringBuilder = new SpannableStringBuilder(tb4.p(k27Var.w1(true), " ", k27Var.y1(true)));
            int i3 = 0;
            while (i3 < 2) {
                nn4 nn4Var = this.d;
                TextView textView = i3 == 0 ? nn4Var.getTextView() : nn4Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i3++;
            }
            q(false);
        } else {
            this.W = true;
            if (this.G != null) {
                double L0 = k27Var.L0();
                r7 r7Var3 = this.G;
                if (L0 >= 600.0d) {
                    r7Var3.setAlpha(1.0f);
                    this.G.setEnabled(true);
                    this.d.setPadding(0, 0, gl.L(44.0f) + this.N, 0);
                    q(false);
                } else {
                    r7Var3.setAlpha(0.0f);
                    this.G.setEnabled(false);
                    this.d.setPadding(0, 0, this.N, 0);
                }
            } else {
                this.d.setPadding(0, 0, this.N, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(tb4.p(k27Var.w1(true), " - ", k27Var.y1(true)));
            int i4 = 0;
            while (i4 < 2) {
                nn4 nn4Var2 = this.d;
                TextView textView2 = i4 == 0 ? nn4Var2.getTextView() : nn4Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i4++;
            }
        }
        spannableStringBuilder.setSpan(new z3c(gl.o(), bkb.v0(bkb.s7, this.q0)), 0, k27Var.w1(true).length(), 18);
        this.d.b(spannableStringBuilder, !z3 && z4 && this.W);
    }

    public ua1 getCapsuleBlobDrawable() {
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
        int i = bkb.i5;
        wjb wjbVar = this.q0;
        r7 r7Var = new r7(context, null, 0, bkb.v0(i, wjbVar), false, this.q0);
        this.G = r7Var;
        if (r7Var.getIconView() != null) {
            zkb.s(this.G.getIconView(), i, wjbVar, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(gl.L(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(k96.M0(2131754804, null));
        this.G.setDelegate(new gn4(this));
        r7 r7Var2 = this.G;
        cla claVar = new cla();
        this.H = claVar;
        r7Var2.setIcon(claVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), wjbVar);
        this.I = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new w72(this, (byte) 29));
        p7 A = this.G.A(0, R.drawable.msg_speed_slow, k96.M0(2131745029, null));
        p7[] p7VarArr = this.J;
        p7VarArr[0] = A;
        p7VarArr[1] = this.G.A(1, R.drawable.msg_speed_normal, k96.M0(2131745030, null));
        p7VarArr[2] = this.G.A(2, R.drawable.msg_speed_medium, k96.M0(2131745031, null));
        p7VarArr[3] = this.G.A(3, R.drawable.msg_speed_fast, k96.M0(2131745033, null));
        byte b = 4;
        p7VarArr[4] = this.G.A(4, R.drawable.msg_speed_veryfast, k96.M0(2131745027, null));
        p7VarArr[5] = this.G.A(5, R.drawable.msg_speed_superfast, k96.M0(2131745028, null));
        if (gl.p >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(gl.L(8.0f));
        addView(this.G, nme.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new xf3((Object) this, (Object) fArr, (byte) 10));
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

    public final void k(db6 db6Var) {
        if (db6Var != null) {
            org.telegram.ui.ActionBar.d dVar = this.h;
            if (dVar.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) dVar.getParentActivity();
                launchActivity.N0(db6Var.h.K1);
                qa6 qa6Var = new qa6(2);
                qa6Var.F0(db6Var.h);
                qa6Var.M0 = new rz1((Object) db6Var, k27.B0(db6Var.h.k), (byte) 6);
                launchActivity.t0(qa6Var);
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
            a0 = k96.M0(2131753898, null);
            if (Math.abs(f - 2.0f) < 0.05f) {
                i = R.raw.speed_2to1;
            }
        } else if (z && i(f2, 1.5f) && i(f, 1.0f)) {
            a0 = k96.a0("AudioSpeedCustom", null, 2131753900, cla.a(f2));
            i = R.raw.speed_1to15;
        } else if (z && i(f2, 2.0f) && i(f, 1.5f)) {
            a0 = k96.M0(2131753899, null);
            i = R.raw.speed_15to2;
        } else {
            a0 = k96.a0("AudioSpeedCustom", null, 2131753900, cla.a(f2));
        }
        u21.b0(this.h).Q(i, 36, a0).j();
    }

    public final void m() {
        wtc wtcVar = this.L0;
        if (wtcVar != null) {
            wtcVar.a();
            this.L0 = null;
        }
        for (int i = 0; i < 4; i++) {
            hk7[] hk7VarArr = this.K0;
            hk7 hk7Var = hk7VarArr[i];
            if (hk7Var != null) {
                hk7Var.a();
                hk7VarArr[i] = null;
            }
        }
    }

    public final void n() {
        wd1 wd1Var = this.O;
        if (wd1Var == null || wd1Var.g < 1.0f) {
            this.O0 = true;
        } else {
            this.O0 = false;
            gl.d3(new jn4(this, (byte) 0), 150L);
        }
    }

    public final void o(boolean z) {
        fc2 fc2Var;
        int i;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z && (valueAnimator = this.b0.a.f) != null) {
            valueAnimator.cancel();
            this.b0.a.f = null;
        }
        gc0 gc0Var = this.b0.a;
        if (gc0Var.f != null) {
            gc0Var.g = true;
            return;
        }
        int i2 = this.U;
        int i3 = this.n0;
        sy1 sy1Var = this.n;
        if (i2 == 4) {
            if (sy1Var != null) {
                fc2Var = sy1Var.getGroupCall();
                i3 = this.h.getCurrentAccount();
            } else {
                fc2Var = null;
            }
            i = i3;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            fc2Var = VoIPService.getSharedInstance().groupCall;
            user = sy1Var != null ? null : VoIPService.getSharedInstance().getUser();
            i = VoIPService.getSharedInstance().getAccount();
        } else {
            fc2Var = null;
            i = i3;
            user = null;
        }
        if (fc2Var != null) {
            ArrayList arrayList = fc2Var.e;
            int size = arrayList.size();
            for (int i4 = 0; i4 < 3; i4++) {
                hc0 hc0Var = this.b0;
                if (i4 < size) {
                    hc0Var.b(i4, i, (TLObject) arrayList.get(i4));
                } else {
                    hc0Var.b(i4, i, null);
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
        if (this.U != 4 || fc2Var == null) {
            return;
        }
        int min = fc2Var.b.rtmp_stream ? 0 : Math.min(3, fc2Var.e.size());
        int h = (min == 0 ? 10 : oo1.h(min, 1, 24, 52)) + 3;
        nn4 nn4Var = this.d;
        if (z) {
            int i7 = ((FrameLayout.LayoutParams) nn4Var.getLayoutParams()).leftMargin;
            if (gl.L(h) != i7) {
                float translationX = (this.d.getTranslationX() + i7) - gl.L(r2);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(s33Var);
            }
        } else {
            nn4Var.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f = h;
        this.d.setLayoutParams(nme.d(-1, 20.0f, 51, f, 5.0f, fc2Var.k() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(nme.d(-1, 20.0f, 51, f, 25.0f, fc2Var.k() ? 90 : 36, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
        if (this.o0) {
            wtc wtcVar = new wtc(kk7.e(), this);
            wtcVar.b(kk7.F4);
            wtcVar.b(kk7.H4);
            this.L0 = wtcVar;
            d(true);
        } else {
            for (int i = 0; i < 4; i++) {
                wtc wtcVar2 = new wtc(kk7.f(i), this);
                wtcVar2.b(kk7.e2);
                wtcVar2.b(kk7.f2);
                wtcVar2.b(kk7.g2);
                wtcVar2.b(kk7.v2);
                wtcVar2.b(kk7.B2);
                wtcVar2.b(kk7.u1);
                wtcVar2.b(kk7.F2);
                wtcVar2.b(kk7.d2);
                this.K0[i] = wtcVar2;
                GroupCallMessagesController.getInstance(i).subscribeToCallMessages(0L, this);
            }
            wtc wtcVar3 = new wtc(kk7.e(), this);
            wtcVar3.b(kk7.L4);
            wtcVar3.b(kk7.u2);
            wtcVar3.b(kk7.C2);
            wtcVar3.b(kk7.Q4);
            wtcVar3.b(kk7.P4);
            wtcVar3.b(kk7.E2);
            this.L0 = wtcVar3;
            if (t76.N != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || o85.d()) {
                sy1 sy1Var = this.n;
                if (sy1Var != null && this.h.getSendMessagesHelper().A(sy1Var.a()) != null && !j()) {
                    c(true);
                } else if (sy1Var == null || sy1Var.getGroupCall() == null || !sy1Var.getGroupCall().A() || o85.d() || j()) {
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
            ArrayList arrayList = bkb.E0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            ua1 ua1Var = this.a;
            if (!ua1Var.u) {
                ua1Var.u = true;
                ua1Var.t = SystemClock.elapsedRealtime();
                rg2.d().a(60, ua1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.P != z && this.y != null) {
                this.P = z;
                this.E.K(z ? 15 : 29);
                oy8 oy8Var = this.E;
                oy8Var.I(oy8Var.f - 1, false, true);
                this.y.invalidate();
            }
        } else if (i2 == 4 && !this.l0) {
            this.l0 = true;
            this.m0.run();
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(gl.M(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z2 = this.P;
        ua1 ua1Var = this.a;
        if (z2 != z) {
            this.P = z;
            this.E.K(z ? 15 : 29);
            oy8 oy8Var = this.E;
            oy8Var.I(oy8Var.f - 1, false, true);
            this.y.invalidate();
            bkb.E0().c(this.T);
            ua1Var.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            bkb.E0().a(0.0f);
            ua1Var.f(0.0f);
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
            gl.r(this.m0);
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
            tn4 E0 = bkb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            ua1 ua1Var = this.a;
            if (ua1Var.u) {
                ua1Var.u = false;
                rg2.d().g(ua1Var.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, gl.M(getStyleHeight()));
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
                this.U0.h(new qn4(this.s, groupCallMessage), true);
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
        fc2 fc2Var;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i = this.U;
            if (i == 1 || i == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(k96.M0(2131743150, null), false);
                    return;
                }
                if (sharedInstance.isConference() && (fc2Var = sharedInstance.groupCall) != null) {
                    if (fc2Var.e.size() <= 1) {
                        this.d.b(k96.M0(2131751811, null), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(cf3.r(sharedInstance.getAccount(), cf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                    }
                    if (sharedInstance.groupCall.e.size() > 3) {
                        sb.append(" ");
                        sb.append(k96.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                sy1 sy1Var = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (sy1Var == null || sy1Var.h() == null || sy1Var.h().id != user.id) {
                            this.d.setText(qu2.m(0, user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(k96.M0(2131745853, null));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.b.title)) {
                    this.d.b(sharedInstance.groupCall.b.title, false);
                    return;
                }
                if (sy1Var == null || sy1Var.f() == null || sy1Var.f().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat f = sy1Var.f();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(k96.M0(2131743206, null), false);
                    return;
                }
                boolean W = hc2.W(f);
                nn4 nn4Var = this.d;
                if (W) {
                    nn4Var.b(k96.M0(2131743206, null), false);
                } else {
                    nn4Var.b(k96.M0(2131743065, null), false);
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
            wjb wjbVar = this.q0;
            if (z2 || Math.abs(x - W0[i]) >= 0.05f) {
                p7 p7Var = p7VarArr[i];
                int i2 = bkb.D8;
                p7Var.a(bkb.v0(i2, wjbVar), bkb.v0(i2, wjbVar));
            } else {
                p7 p7Var2 = p7VarArr[i];
                int i3 = bkb.Gi;
                p7Var2.a(bkb.v0(i3, wjbVar), bkb.v0(i3, wjbVar));
            }
            i++;
        }
    }

    public final void r(int i) {
        nn4 nn4Var;
        nn4 nn4Var2;
        nn4 nn4Var3;
        nn4 nn4Var4;
        if (this.U == i) {
            return;
        }
        b();
        int i2 = this.U;
        ua1 ua1Var = this.a;
        int i3 = 0;
        if (i2 == 3 || i2 == 1) {
            tn4 E0 = bkb.E0();
            ArrayList arrayList = E0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.b;
                E0.b = null;
                E0.c = null;
            }
            if (ua1Var.u) {
                ua1Var.u = false;
                rg2.d().g(ua1Var.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            k79 k79Var = this.U0;
            if (k79Var != null) {
                k79Var.h(null, true);
            }
        }
        this.U = i;
        this.r.setWillNotDraw(i != 4);
        if (i != 4) {
            this.h0 = false;
        }
        hc0 hc0Var = this.b0;
        if (hc0Var != null) {
            hc0Var.setStyle(this.U);
            this.b0.setLayoutParams(nme.e(kk7.s1, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(nme.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f = this.S;
        if (f > 0.0f && f != gl.M(getStyleHeight())) {
            setTopPadding(gl.M(getStyleHeight()));
        }
        wjb wjbVar = this.q0;
        if (i != 6) {
            if (i == 5) {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(bkb.u7));
                int i4 = 0;
                while (true) {
                    nn4Var4 = this.d;
                    if (i4 >= 2) {
                        break;
                    }
                    TextView textView = i4 == 0 ? nn4Var4.getTextView() : nn4Var4.getNextTextView();
                    if (textView != null) {
                        textView.setGravity(19);
                        zkb.X(textView, bkb.t7, wjbVar);
                        textView.setTypeface(Typeface.DEFAULT);
                        textView.setTextSize(1, 15.0f);
                    }
                    i4++;
                }
                nn4Var4.setTag(Integer.valueOf(bkb.t7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.y.setVisibility(8);
                this.b0.setVisibility(8);
                this.x.setVisibility(0);
                this.x.d();
                this.F.setContentDescription(k96.M0(2131754900, null));
                r7 r7Var = this.G;
                if (r7Var != null) {
                    r7Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 35.0f, 0.0f, 36.0f, 0.0f));
                return;
            }
            if (i == 0 || i == 2) {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(bkb.u7));
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
                    nn4Var = this.d;
                    if (i5 >= 2) {
                        break;
                    }
                    TextView textView2 = i5 == 0 ? nn4Var.getTextView() : nn4Var.getNextTextView();
                    if (textView2 != null) {
                        textView2.setGravity(19);
                        zkb.X(textView2, bkb.t7, wjbVar);
                        textView2.setTypeface(Typeface.DEFAULT);
                        textView2.setTextSize(1, 15.0f);
                    }
                    i5++;
                }
                nn4Var.setTag(Integer.valueOf(bkb.t7));
                ImageView imageView = this.b;
                if (i == 6) {
                    imageView.setLayoutParams(nme.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                    this.F.setVisibility(8);
                    return;
                } else {
                    if (i != 0) {
                        imageView.setLayoutParams(nme.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                        this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 51.0f, 0.0f, 36.0f, 0.0f));
                        this.F.setContentDescription(k96.M0(2131754754, null));
                        return;
                    }
                    imageView.setLayoutParams(nme.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(nme.d(-1, 36.0f, 51, 37.0f, 0.0f, 36.0f, 0.0f));
                    h();
                    r7 r7Var2 = this.G;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(k96.M0(2131754900, null));
                    return;
                }
            }
            if (i == 4) {
                this.w.setBackground(bkb.L0(false));
                this.r.setBackgroundColor(0);
                this.r.setTag(Integer.valueOf(bkb.u7));
                this.y.setVisibility(8);
                this.e.setVisibility(0);
                int i6 = 0;
                while (true) {
                    nn4Var3 = this.d;
                    if (i6 >= 2) {
                        break;
                    }
                    TextView textView3 = i6 == 0 ? nn4Var3.getTextView() : nn4Var3.getNextTextView();
                    if (textView3 != null) {
                        textView3.setGravity(51);
                        zkb.X(textView3, bkb.s7, wjbVar);
                        textView3.setTypeface(gl.o());
                        textView3.setTextSize(1, 15.0f);
                    }
                    i6++;
                }
                nn4Var3.setTag(Integer.valueOf(bkb.s7));
                this.d.setPadding(0, 0, this.N, 0);
                this.x.setVisibility(8);
                this.x.i();
                sy1 sy1Var = this.n;
                this.b0.setVisibility(!((sy1Var == null || sy1Var.getGroupCall() == null || sy1Var.getGroupCall().b == null || !sy1Var.getGroupCall().b.rtmp_stream) ? false : true) ? 0 : 8);
                if (this.b0.getVisibility() != 8) {
                    o(false);
                } else {
                    this.d.setTranslationX(-gl.L(36.0f));
                    this.e.setTranslationX(-gl.L(36.0f));
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
                oy8 oy8Var = this.E;
                oy8Var.I(oy8Var.f - 1, false, true);
                this.y.invalidate();
                this.r.setBackground(null);
                this.r.setBackgroundColor(0);
                this.x.setVisibility(8);
                this.x.i();
                ArrayList arrayList2 = bkb.E0().l;
                if (!arrayList2.contains(this)) {
                    arrayList2.add(this);
                }
                if (!ua1Var.u) {
                    ua1Var.u = true;
                    ua1Var.t = SystemClock.elapsedRealtime();
                    rg2.d().a(60, ua1Var.F);
                }
                invalidate();
                int i7 = 0;
                while (true) {
                    nn4Var2 = this.d;
                    if (i7 >= 2) {
                        break;
                    }
                    TextView textView4 = i7 == 0 ? nn4Var2.getTextView() : nn4Var2.getNextTextView();
                    if (textView4 != null) {
                        textView4.setGravity(19);
                        zkb.X(textView4, bkb.z7, wjbVar);
                        textView4.setTypeface(gl.o());
                        textView4.setTextSize(1, 14.0f);
                    }
                    i7++;
                }
                nn4Var2.setTag(Integer.valueOf(bkb.z7));
                this.F.setVisibility(8);
                this.b.setVisibility(8);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.d.setLayoutParams(nme.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                this.d.setPadding(gl.L(88.0f), 0, gl.L(88.0f) + this.N, 0);
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
        this.w.setBackground(bkb.L0(false));
        this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.v0(bkb.dl, wjbVar), bkb.v0(bkb.el, wjbVar)}));
        this.r.setTag(null);
        this.e.setVisibility(8);
        this.M.setVisibility(8);
        this.F.setVisibility(8);
        this.b.setVisibility(8);
        this.y.setVisibility(8);
        this.x.setVisibility(8);
        this.x.i();
        this.b0.setVisibility(8);
        this.d.setTag(Integer.valueOf(bkb.z7));
        while (true) {
            nn4 nn4Var5 = this.d;
            if (i3 >= 2) {
                nn4Var5.setLayoutParams(nme.d(-2, -2.0f, 17, 0.0f, -1.0f, 0.0f, 0.0f));
                return;
            }
            TextView textView5 = i3 == 0 ? nn4Var5.getTextView() : nn4Var5.getNextTextView();
            if (textView5 != null) {
                textView5.setGravity(19);
                zkb.X(textView5, bkb.z7, wjbVar);
                textView5.setTypeface(gl.o());
                textView5.setTextSize(1, 15.0f);
            }
            i3++;
        }
    }

    public void setDelegate(rn4 rn4Var) {
        this.p0 = rn4Var;
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
        ry8 ry8Var = this.x;
        if (ry8Var != null) {
            ry8Var.setTranslationX(f);
        }
        nn4 nn4Var = this.d;
        if (nn4Var != null) {
            nn4Var.setTranslationX(f);
        }
        nn4 nn4Var2 = this.e;
        if (nn4Var2 != null) {
            nn4Var2.setTranslationX(f);
        }
        hc0 hc0Var = this.b0;
        if (hc0Var != null) {
            hc0Var.setTranslationX(f);
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

    @Override // tjb
    public final void updateColors() {
        z3c[] z3cVarArr;
        ua1 ua1Var = this.a;
        int i = ua1Var.A;
        if (i >= 0) {
            ua1Var.E = 1.0f;
            ua1Var.a(ua1.e(i));
        }
        int i2 = !i(MediaController.w().x(this.W), 1.0f) ? bkb.Gi : bkb.w7;
        wjb wjbVar = this.q0;
        int v0 = bkb.v0(i2, wjbVar);
        cla claVar = this.H;
        if (claVar != null) {
            claVar.a.u(v0);
            Paint paint = claVar.b;
            if (paint != null) {
                paint.setColor(v0);
            }
        }
        r7 r7Var = this.G;
        if (r7Var != null) {
            Drawable background = r7Var.getBackground();
            if (background == null || background != this.E0) {
                r7 r7Var2 = this.G;
                ff0 f0 = bkb.f0(436207615 & v0, 1, gl.L(14.0f));
                this.E0 = f0;
                r7Var2.setBackground(f0);
                this.J0 = v0;
            } else if (v0 != this.J0) {
                this.J0 = v0;
                bkb.F1(background, v0 & 436207615, true);
            }
        }
        if (this.b != null) {
            int v02 = bkb.v0(bkb.v7, wjbVar);
            if (this.F0 == null || v02 != this.H0) {
                ImageView imageView = this.b;
                this.H0 = v02;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int v03 = bkb.v0(bkb.w7, wjbVar);
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
                nn4 nn4Var = this.e;
                TextView textView = i3 == 0 ? nn4Var.getTextView() : nn4Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(bkb.v0(bkb.w7, wjbVar));
                }
                i3++;
            }
        }
        nn4 nn4Var2 = this.d;
        if (nn4Var2 != null) {
            Object tag = nn4Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i4 = 0;
                while (i4 < 2) {
                    nn4 nn4Var3 = this.d;
                    TextView textView2 = i4 == 0 ? nn4Var3.getTextView() : nn4Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(bkb.v0(intValue, wjbVar));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (z3cVarArr = (z3c[]) ((Spanned) text).getSpans(0, text.length(), z3c.class)) != null) {
                            for (z3c z3cVar : z3cVarArr) {
                                z3cVar.b = bkb.v0(bkb.s7, wjbVar);
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

    @Override // tjb
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

    public FragmentContextView(Context context, cj3 cj3Var, boolean z) {
        this(context, cj3Var, null, z, null);
    }
}
