// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ju1 implements uz1 {
    public int a;
    public final /* synthetic */ yv1 b;

    public ju1(yv1 yv1Var) {
        this.b = yv1Var;
    }

    @Override // uz1
    public final void A1() {
        int indexOfChild;
        yv1 yv1Var = this.b;
        if (yv1Var.getParentActivity() != null) {
            if ((yv1Var.e == null && yv1Var.s8 == null) || yv1Var.fragmentView == null) {
                return;
            }
            hg5 hg5Var = yv1Var.u2;
            if ((hg5Var == null || !hg5Var.W) && (indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U)) != -1) {
                try {
                    yv1Var.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                hg5 hg5Var2 = yv1Var.u2;
                if (hg5Var2 == null) {
                    hg5Var2 = yv1Var.x4(310.0f, 3, indexOfChild + 1, false);
                    yv1Var.u2 = hg5Var2;
                }
                TLRPC.UserFull userFull = yv1Var.s8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    hg5Var2.t(gm.S2(jb6.a0(null, null, yv1Var.a0.d1 ? 2131743281 : 2131743204, yv1Var.f.first_name)));
                } else if (sd2.v(yv1Var.e) || sd2.s(yv1Var.e)) {
                    if (sd2.P(20, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749311, null));
                    } else if (sd2.P(21, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749314, null));
                    } else if (sd2.P(7, yv1Var.e)) {
                        yv1Var.u2.t(jb6.M0(2131749317, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = yv1Var.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        boolean B1 = gm.B1(tL_chatBannedRights);
                        hg5 hg5Var3 = yv1Var.u2;
                        if (B1) {
                            hg5Var3.t(jb6.M0(2131753920, null));
                        } else {
                            hg5Var3.t(jb6.a0("AttachMediaRestricted", null, 2131753921, jb6.v(yv1Var.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (yv1Var.W4()) {
                        return;
                    }
                    boolean z = yv1Var.a0.d1;
                    hg5 hg5Var4 = yv1Var.u2;
                    TLRPC.Chat chat = yv1Var.e;
                    if (z) {
                        hg5Var4.t(sd2.L(21, chat));
                    } else {
                        hg5Var4.t(sd2.L(20, chat));
                    }
                }
                View sendButton = yv1Var.a0.getSendButton();
                View audioVideoButtonContainer = yv1Var.a0.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                yv1Var.u2.x(sendButton, true);
            }
        }
    }

    @Override // uz1
    public final void B() {
        yv1 yv1Var = this.b;
        ms1 ms1Var = yv1Var.a0;
        boolean z = ms1Var.p4;
        jz1 jz1Var = ms1Var.V0;
        boolean z2 = false;
        boolean z3 = jz1Var != null && jz1Var.getCurrentPage() == 0;
        fn0 fn0Var = yv1Var.qd;
        if (z && !z3) {
            z2 = true;
        }
        fn0Var.a(z2, true);
    }

    @Override // uz1
    public final int B0() {
        return this.b.m1.getHeight();
    }

    @Override // uz1
    public final void C(boolean z) {
        this.b.zc(false, z);
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override // uz1
    public final boolean E0(long j) {
        return false;
    }

    @Override // uz1
    public final void E1(boolean z) {
        yv1 yv1Var = this.b;
        View view = yv1Var.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        yv1Var.t5 = !z;
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
        yv1 yv1Var = this.b;
        boolean z2 = false;
        if (yv1Var.q3 == null && CameraView.isCameraAllowed() && yv1Var.getParentActivity() != null) {
            Activity parentActivity = yv1Var.getParentActivity();
            wv1 wv1Var = yv1Var.Ba;
            int i4 = zq5.e;
            q qVar = new q(parentActivity, yv1Var, wv1Var, true);
            yv1Var.q3 = qVar;
            qVar.setAnimationCallback(new gm1(yv1Var, (byte) 0));
            yv1Var.q3.setTrimCallback(new gm1(yv1Var, (byte) 1));
            yv1Var.q3.setRecordingUiFrameCallback(new ni6(yv1Var, (byte) 17));
            yv1Var.q3.setClipToPadding(false);
            q qVar2 = yv1Var.q3;
            km0 km0Var = yv1Var.L;
            jr1 jr1Var = yv1Var.x;
            LinearLayout linearLayout = qVar2.G;
            im0 c = km0Var.c(linearLayout, jr1Var, false);
            c.q(gm.L(6.0f));
            c.r(gm.L(21.0f));
            linearLayout.setBackground(c);
            int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
            if (indexOfChild < 0) {
                indexOfChild = yv1Var.m1.getChildCount();
            }
            yv1Var.m1.addView(yv1Var.q3, Math.min(indexOfChild + 1, yv1Var.m1.getChildCount()), qoe.e(-1, -1, 51));
        }
        q qVar3 = yv1Var.q3;
        if (qVar3 != null) {
            if (i == 0) {
                qVar3.v();
                yv1Var.A0.D0();
                yv1Var.D0.O();
            } else {
                if (i == 1 || i == 3 || i == 4) {
                    qVar3.u(i, i2, i3, j, j2, z);
                    return;
                }
                if (i == 2) {
                    z2 = true;
                } else if (i != 5) {
                    return;
                }
                qVar3.f(z2);
            }
        }
    }

    @Override // uz1
    public final boolean G0() {
        tn9 tn9Var;
        q qVar = this.b.q3;
        if (qVar == null || (tn9Var = qVar.S) == null) {
            return false;
        }
        int i = tn9Var.a;
        return i == 4 || i == 5 || i == 6;
    }

    @Override // uz1
    public final void G1() {
        yv1 yv1Var = this.b;
        hg5 hg5Var = yv1Var.v2;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = yv1Var.x2;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
        CharSequence charSequence2;
        hg5 hg5Var;
        TLRPC.ChatFull chatFull;
        MediaController w = MediaController.w();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = false;
        yv1 yv1Var = this.b;
        w.N = !isEmpty || yv1Var.a0.Q0();
        es1 es1Var = yv1Var.X1;
        if (es1Var == null || es1Var.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            yv1Var.X1.getAdapter().U(charSequence2, yv1Var.a0.getCursorPosition(), yv1Var.M6, false, false);
        }
        us4 us4Var = yv1Var.b6;
        if (us4Var != null) {
            gm.r(us4Var);
            yv1Var.b6 = null;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || sd2.m(chat)) {
            ms1 ms1Var = yv1Var.a0;
            if (ms1Var.O3 && (!ms1Var.Q0() || !yv1Var.a0.Q2)) {
                if (z) {
                    yv1Var.tb(charSequence2, true);
                } else {
                    yv1Var.Z4(charSequence2);
                    us4 us4Var2 = new us4(this, charSequence2, false, (byte) 4);
                    yv1Var.b6 = us4Var2;
                    gm.d3(us4Var2, gm.S == null ? 3000L : 1000L);
                }
            }
        }
        xs1 xs1Var = yv1Var.Ua;
        if (xs1Var != null) {
            ArrayList arrayList = xs1Var.G;
            for (int i = 0; i < arrayList.size(); i++) {
                ((jw3) arrayList.get(i)).n = true;
            }
        }
        g39 g39Var = g39.B;
        if (g39Var != null) {
            g39Var.l = true;
        }
        g39 g39Var2 = g39.C;
        if (g39Var2 != null) {
            g39Var2.l = true;
        }
        if (z2) {
            return;
        }
        hg5 hg5Var2 = yv1Var.v2;
        if ((hg5Var2 != null && hg5Var2.W) || ((hg5Var = yv1Var.x2) != null && hg5Var.W)) {
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
            hg5 hg5Var3 = yv1Var.x2;
            if (hg5Var3 != null) {
                hg5Var3.f(true);
                return;
            }
            return;
        }
        ho1 ho1Var = yv1Var.lb;
        if (m9c.D(yv1Var.f) || ((chatFull = yv1Var.r8) != null && chatFull.slowmode_next_send_date > 0 && yv1Var.g4 == 0)) {
            z3 = true;
        }
        if (yv1Var.y2 || yv1Var.w2 || z3 || gda.L >= 3 || yv1Var.a0.Q0()) {
            return;
        }
        gm.r(ho1Var);
        gm.d3(ho1Var, 4000L);
    }

    @Override // uz1
    public final void H1() {
        a aVar;
        yv1 yv1Var = this.b;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.o0) {
            return;
        }
        r7 r7Var = yv1Var.j0;
        if (r7Var != null) {
            r7Var.setVisibility(0);
        }
        q6 q6Var = yv1Var.g0;
        if (q6Var != null) {
            q6Var.e(8);
        }
        qr2 qr2Var = yv1Var.f0;
        if (qr2Var != null) {
            qr2Var.b(false);
        }
    }

    @Override // uz1
    public final void I() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.e();
        }
    }

    @Override // uz1
    public final void I0() {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // uz1
    public final nv1 J() {
        return this.b.D5;
    }

    @Override // uz1
    public final boolean K0() {
        yv1 yv1Var = this.b;
        TLRPC.User user = yv1Var.f;
        return (user == null || m9c.D(user) || yv1Var.f.bot || yv1Var.h != null || yv1Var.g4 != 0) ? false : true;
    }

    @Override // uz1
    public final void L() {
        a aVar;
        yv1 yv1Var = this.b;
        aVar = ((d) yv1Var).actionBar;
        if (aVar.o0 || yv1Var.g8() || !TextUtils.isEmpty(yv1Var.a0.getSlowModeTimer())) {
            return;
        }
        r7 r7Var = yv1Var.j0;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        q6 q6Var = yv1Var.g0;
        if (q6Var != null) {
            q6Var.e(0);
        }
        qr2 qr2Var = yv1Var.f0;
        if (qr2Var != null) {
            qr2Var.b(true);
        }
    }

    @Override // uz1
    public final void O0() {
        int i;
        yv1 yv1Var = this.b;
        Activity parentActivity = yv1Var.getParentActivity();
        i = ((d) yv1Var).currentAccount;
        long j = yv1Var.l6;
        v67 v67Var = yv1Var.y5;
        if (v67Var == null) {
            v67Var = v67.a();
        }
        new u67(parentActivity, i, j, v67Var, yv1Var, yv1Var.getResourceProvider(), 0, new qm1(yv1Var, (byte) 9)).show();
    }

    @Override // uz1
    public final void R1() {
        yv1 yv1Var = this.b;
        e51 e51Var = yv1Var.Y1;
        if (e51Var != null) {
            e51Var.r1(0, null);
        }
        yv1Var.ma();
    }

    @Override // uz1
    public final void W0() {
        this.b.S4();
    }

    @Override // uz1
    public final void Y0() {
        int i;
        int i2;
        yv1 yv1Var = this.b;
        yv1Var.j5();
        ms1 ms1Var = yv1Var.a0;
        boolean z = ms1Var.p4;
        jz1 jz1Var = ms1Var.V0;
        yv1Var.qd.a(z && !(jz1Var != null && jz1Var.getCurrentPage() == 0), true);
        if (z) {
            Activity parentActivity = yv1Var.getParentActivity();
            i2 = ((d) yv1Var).classGuid;
            gm.g3(parentActivity, i2);
            u31 u31Var = u31.x;
            if (u31Var != null && u31Var.m) {
                u31Var.b();
            }
        } else {
            Activity parentActivity2 = yv1Var.getParentActivity();
            i = ((d) yv1Var).classGuid;
            gm.V2(parentActivity2, i);
        }
        es1 es1Var = yv1Var.X1;
        float f = 0.0f;
        if (es1Var != null) {
            es1Var.animate().alpha((z || yv1Var.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(d53.f).start();
        }
        fdb fdbVar = yv1Var.s1;
        if (fdbVar != null) {
            fdbVar.setVisibility(0);
            ViewPropertyAnimator animate = yv1Var.s1.animate();
            if (!z && !yv1Var.isInPreviewMode()) {
                f = 1.0f;
            }
            animate.alpha(f).setInterpolator(d53.f).withEndAction(new y8c((byte) 9, this, z)).start();
        }
    }

    @Override // uz1
    public final void a() {
        this.b.dd();
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
        yv1 yv1Var = this.b;
        yv1Var.vc(view, charSequence, z);
        r7 r7Var = yv1Var.j0;
        if (r7Var == null || r7Var.getVisibility() == 0) {
            return;
        }
        yv1Var.j0.setVisibility(0);
        q6 q6Var = yv1Var.g0;
        if (q6Var != null) {
            q6Var.e(8);
        }
        qr2 qr2Var = yv1Var.f0;
        if (qr2Var != null) {
            qr2Var.b(false);
        }
    }

    @Override // uz1
    public final boolean b0() {
        int i;
        yv1 yv1Var = this.b;
        if ((yv1Var.getMessagesController().s2(yv1Var.a()) && !yv1Var.x4) || (i = yv1Var.g4) == 9 || yv1Var.h4 <= 0) {
            return false;
        }
        if (i != 0) {
            return i == 3 && yv1Var.f7() == yv1Var.getUserConfig().e();
        }
        return true;
    }

    @Override // uz1
    public final void c0() {
        yv1 yv1Var = this.b;
        yv1Var.L9 = true;
        hu1 hu1Var = yv1Var.D0;
        if (hu1Var != null) {
            hu1Var.F(true);
        }
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
        this.b.tb(charSequence, true);
    }

    @Override // uz1
    public final boolean d1() {
        m47 m47Var;
        o47 o47Var = this.b.x5;
        return (o47Var == null || (m47Var = o47Var.b) == null || m47Var.e.isEmpty()) ? false : true;
    }

    @Override // uz1
    public final void e() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.e();
        }
    }

    @Override // uz1
    public final void e1() {
        int i;
        long j;
        long j2;
        yv1 yv1Var = this.b;
        i = ((d) yv1Var).currentAccount;
        wq0 b = wq0.b(i);
        long j3 = yv1Var.l6;
        long d = (int) yv1Var.d();
        nl9 nl9Var = b.a;
        LongSparseArray z0 = nl9Var.z0(j3, d);
        if (z0 != null && z0.size() > 0) {
            int size = z0.size();
            rq0 rq0Var = null;
            int i2 = 0;
            long j4 = 0;
            while (true) {
                if (i2 >= size) {
                    j = 0;
                    break;
                }
                j4 = z0.keyAt(i2);
                rq0Var = (rq0) z0.valueAt(i2);
                j = 0;
                if (!rq0Var.e) {
                    break;
                } else {
                    i2++;
                }
            }
            rq0 rq0Var2 = rq0Var;
            long j5 = j4;
            if (rq0Var2 != null && !rq0Var2.e) {
                Runnable runnable = rq0Var2.f;
                if (runnable != null) {
                    gm.r(runnable);
                }
                b.b.I0(j3, d, j5, new Object());
                if (rq0Var2.d) {
                    rq0Var2.e = true;
                    j2 = j5;
                } else {
                    nl9Var.J0(j3, d, j5);
                    j2 = j5;
                    nm7 notificationCenter = b.getNotificationCenter();
                    sq0 sq0Var = new sq0(j3, rq0Var2.b, d);
                    d = d;
                    notificationCenter.k(nm7.P5, sq0Var);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j2;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b.getMessagesController().i1(j3);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (d != j) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) d;
                }
                b.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new nq0((byte) 0));
            }
        }
        yv1Var.p5(true);
    }

    @Override // uz1
    public final void f0() {
        this.b.za(0, false);
    }

    @Override // uz1
    public final boolean h() {
        return this.b.W4();
    }

    @Override // uz1
    public final int j() {
        return this.b.m1.Q();
    }

    @Override // uz1
    public final void j1() {
        int i;
        int i2;
        yv1 yv1Var = this.b;
        if (yv1Var.b8() || (i = yv1Var.g4) == 6 || i == 8) {
            return;
        }
        oc7 messagesController = yv1Var.getMessagesController();
        long j = yv1Var.l6;
        long j2 = yv1Var.s4;
        i2 = ((d) yv1Var).classGuid;
        messagesController.J4(0, i2, j, j2, null);
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        return null;
    }

    @Override // uz1
    public final void n() {
        boolean z;
        yv1 yv1Var = this.b;
        if (yv1Var.B0 != null) {
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
        es1 es1Var = yv1Var.X1;
        if (es1Var != null) {
            es1Var.getAdapter().g0 = true;
        }
        if (yv1Var.H5 != null) {
            gm.d3(new fo1(this, (byte) 7), 30L);
        }
        if (yv1Var.a0.R0()) {
            yv1Var.a0.I1();
            z = true;
        } else {
            z = false;
        }
        yv1Var.a0.z1(true, true, z);
        if (yv1Var.G5 != 0) {
            yv1Var.getConnectionsManager().cancelRequest(yv1Var.G5, true);
            yv1Var.G5 = 0;
        }
        yv1Var.gd(0, true);
        yv1Var.Pc(false);
        yv1Var.Gd(false);
    }

    @Override // uz1
    public final void n0() {
        yv1 yv1Var = this.b;
        a6a sendMessagesHelper = yv1Var.getSendMessagesHelper();
        long j = yv1Var.l6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= sparseArray2.size()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message = (TLRPC.Message) sparseArray.valueAt(i3);
                    if (message.dialog_id == j) {
                        i = message.id;
                        break;
                    }
                    i3++;
                }
            } else {
                TLRPC.Message message2 = (TLRPC.Message) sparseArray2.valueAt(i2);
                if (message2.dialog_id == j) {
                    i = message2.id;
                    break;
                }
                i2++;
            }
        }
        int i4 = i;
        if (i4 != 0) {
            yv1Var.J(i4, 0, 0, 0, true, true);
        }
    }

    @Override // uz1
    public final void o(float f) {
        yv1 yv1Var = this.b;
        if (f != 0.0f) {
            yv1Var.R4 = true;
        }
        yv1Var.O7();
        yv1Var.Q7();
        yv1Var.vd(false, false);
        yv1Var.m1.invalidate();
        u31 u31Var = u31.x;
        if (u31Var == null || yv1Var.Pc == null) {
            return;
        }
        u31Var.l();
    }

    @Override // uz1
    public final void p(boolean z) {
        int i;
        int i2;
        yv1 yv1Var = this.b;
        if (!z) {
            Activity parentActivity = yv1Var.getParentActivity();
            i = ((d) yv1Var).classGuid;
            gm.V2(parentActivity, i);
        } else {
            Activity parentActivity2 = yv1Var.getParentActivity();
            i2 = ((d) yv1Var).classGuid;
            gm.g3(parentActivity2, i2);
            yv1Var.fragmentView.requestLayout();
        }
    }

    @Override // uz1
    public final void r() {
        this.b.zc(true, false);
    }

    @Override // uz1
    public final void s1() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.d();
        }
    }

    @Override // uz1
    public final void v() {
        fdb fdbVar = this.b.s1;
        if (fdbVar != null) {
            fdbVar.d();
        }
    }

    @Override // uz1
    public final void v1(int i) {
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gm.L(72.0f);
        yv1 yv1Var = this.b;
        if (i < currentActionBarHeight) {
            yv1Var.r5 = false;
            if (yv1Var.s1.getVisibility() == 0) {
                yv1Var.s1.setVisibility(4);
            }
        } else {
            yv1Var.r5 = true;
            if (yv1Var.s1.getVisibility() == 4 && !yv1Var.isInPreviewMode()) {
                yv1Var.s1.setVisibility(0);
            }
        }
        yv1Var.s5 = !yv1Var.a0.R0();
        int i2 = i + (yv1Var.a0.R0() ? 65536 : 0);
        if (this.a != i2) {
            yv1Var.d0 = 0;
        }
        this.a = i2;
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        w04 w04Var;
        k47 k47Var;
        int i3;
        long b2;
        o47 o47Var;
        m47 m47Var;
        TLRPC.Message message;
        m47 m47Var2;
        yv1 yv1Var = this.b;
        ArrayList arrayList = yv1Var.M6;
        if (yv1Var.B0 != null) {
            yv1Var.d0 = yv1Var.a0.getBackgroundTop();
        }
        es1 es1Var = yv1Var.X1;
        if (es1Var != null && es1Var.getAdapter() != null) {
            yv1Var.X1.getAdapter().x.a(charSequence);
        }
        if (i != 0) {
            int i4 = yv1Var.h4;
            if (i4 == -1) {
                yv1Var.h4 = 0;
                i4 = 0;
            }
            if (charSequence != null) {
                yv1Var.h4 = i4 + 1;
            }
            o47 o47Var2 = yv1Var.x5;
            if (o47Var2 != null && (m47Var2 = o47Var2.b) != null && !m47Var2.e.isEmpty()) {
                yv1Var.h4 += yv1Var.x5.b.e.size();
            }
            yv1Var.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (o47Var = yv1Var.x5) != null && (m47Var = o47Var.b) != null && !m47Var.e.isEmpty() && yv1Var.x5.d == null && j <= 0) {
            ArrayList arrayList2 = new ArrayList();
            yv1Var.x5.b.b(arrayList2);
            boolean z2 = arrayList2.size() > 0;
            TLRPC.Peer x1 = yv1Var.getMessagesController().x1(yv1Var.l6);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList2.size()) {
                    break;
                }
                k47 k47Var2 = (k47) arrayList2.get(i5);
                if (k47Var2 != null && (message = k47Var2.k) != null && !k47.u5(message.peer_id, x1)) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                u31 I = c41.b0(yv1Var).I(R.raw.hint_swipe_reply, jb6.M0(2131743991, null), jb6.M0(2131743990, null));
                s09 s09Var = ((r31) I.e).a;
                s09Var.setScaleX(1.8f);
                s09Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (sd2.c0(yv1Var.e) && !yv1Var.x4 && (k47Var = yv1Var.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = k47Var.j1;
            if (tL_forumTopic != null) {
                b2 = tL_forumTopic.id;
            } else {
                i3 = ((d) yv1Var).currentAccount;
                b2 = k47.b2(i3, yv1Var.F5.k, true, false);
            }
            long j2 = b2;
            if (j2 != 0) {
                yv1Var.getMediaDataController().F(yv1Var.l6, j2, false);
            }
        }
        yv1Var.ac(false, null, null, null, null, z, i, null, false, j, null, true);
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null && ms1Var.getEmojiView() != null && (w04Var = yv1Var.a0.getEmojiView().U0) != null) {
            if (w04Var.e) {
                oc7.r1(w04Var.a).J4(2, 0, w04Var.b, w04Var.c, null);
            }
            w04Var.f = -1L;
        }
        if (yv1Var.getMessagesController().H3() || yv1Var.getMessagesController().G3 > 0 || yv1Var.getMessagesController().a4 >= 2 || yv1Var.getUserConfig().p() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i6 = 1; i6 < Math.min(5, arrayList.size()); i6++) {
            k47 k47Var3 = (k47) arrayList.get(i6);
            if (k47Var3 != null && !k47Var3.O3() && ((k47.Q4(k47Var3.k) || k47Var3.g4()) && k47Var3.k.media_unread)) {
                v0c.v(k47Var3, true);
            }
        }
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        return this.b.Ea;
    }

    @Override // uz1
    public final void y(float f, int i) {
        q qVar = this.b.q3;
        if (qVar != null) {
            qVar.h(f, i);
        }
    }

    @Override // uz1
    public final void z0(int i) {
        int i2 = i == 0 ? 8 : 0;
        yv1 yv1Var = this.b;
        if (yv1Var.r3.getVisibility() != i2) {
            yv1Var.r3.setVisibility(i2);
        }
    }
}
