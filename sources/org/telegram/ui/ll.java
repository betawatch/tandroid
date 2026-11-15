package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ll implements org.telegram.ui.Components.cg {
    public int a;
    public final /* synthetic */ an b;

    public ll(an anVar) {
        this.b = anVar;
    }

    @Override // org.telegram.ui.Components.cg
    public final void B2() {
        an anVar = this.b;
        fi.p2 p2Var = anVar.Y1;
        if (p2Var != null) {
            p2Var.w1(0, null);
        }
        anVar.Aa();
    }

    @Override // org.telegram.ui.Components.cg
    public final void C(boolean z10) {
        int i7;
        int i10;
        an anVar = this.b;
        if (!z10) {
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity2, i10);
            anVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void E() {
        this.b.Cc(true, false);
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean E0() {
        int i7;
        an anVar = this.b;
        if ((anVar.getMessagesController().t2(anVar.a()) && !anVar.w4) || (i7 = anVar.g4) == 9 || anVar.h4 <= 0) {
            return false;
        }
        if (i7 != 0) {
            return i7 == 3 && anVar.e9() == anVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void G0() {
        an anVar = this.b;
        anVar.K9 = true;
        jl jlVar = anVar.D0;
        if (jlVar != null) {
            jlVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void G1() {
        int i7;
        int i10;
        an anVar = this.b;
        if (anVar.X9() || (i7 = anVar.g4) == 6 || i7 == 8) {
            return;
        }
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j3 = anVar.k6;
        long j10 = anVar.s4;
        i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        messagesController.D4(0, i10, j3, j10, null);
    }

    @Override // org.telegram.ui.Components.cg
    public final void I() {
        org.telegram.ui.Components.rw0 rw0Var = this.b.s1;
        if (rw0Var != null) {
            rw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void J0() {
        this.b.Ma(0, false);
    }

    @Override // org.telegram.ui.Components.cg
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        jg.d1 d1Var;
        org.telegram.messenger.gj gjVar;
        int i11;
        long b22;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        org.telegram.messenger.ij ijVar2;
        an anVar = this.b;
        ArrayList arrayList = anVar.L6;
        if (anVar.B0 != null) {
            anVar.d0 = anVar.a0.getBackgroundTop();
        }
        jj jjVar = anVar.X1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            anVar.X1.getAdapter().x.a(charSequence);
        }
        if (i7 != 0) {
            if (anVar.h4 == -1) {
                anVar.h4 = 0;
            }
            if (charSequence != null) {
                anVar.h4++;
            }
            org.telegram.messenger.kj kjVar2 = anVar.w5;
            if (kjVar2 != null && (ijVar2 = kjVar2.b) != null && !ijVar2.e.isEmpty()) {
                anVar.h4 += anVar.w5.b.e.size();
            }
            anVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (kjVar = anVar.w5) != null && (ijVar = kjVar.b) != null && !ijVar.e.isEmpty() && anVar.w5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            anVar.w5.b.b(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer z12 = anVar.getMessagesController().z1(anVar.k6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i12);
                if (gjVar2 != null && (message = gjVar2.k) != null && !org.telegram.messenger.gj.v5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(anVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.hd.M0(2131744306, null), org.telegram.messenger.hd.M0(2131744305, null));
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.ub) I.e).a;
                fh0Var.setScaleX(1.8f);
                fh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(anVar.e) && !anVar.w4 && (gjVar = anVar.E5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = gjVar.j1;
            if (tL_forumTopic != null) {
                b22 = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                b22 = org.telegram.messenger.gj.b2(i11, anVar.E5.k, true, false);
            }
            long j10 = b22;
            if (j10 != 0) {
                anVar.getMediaDataController().D(anVar.k6, j10, false);
            }
        }
        anVar.fc(false, null, null, null, z10, i7, null, false, j3);
        qj qjVar = anVar.a0;
        if (qjVar != null && qjVar.getEmojiView() != null && (d1Var = anVar.a0.getEmojiView().U0) != null) {
            if (d1Var.e) {
                org.telegram.messenger.np.s1(d1Var.a).D4(2, 0, d1Var.b, d1Var.c, null);
            }
            d1Var.f = -1L;
        }
        if (anVar.getMessagesController().D3() || anVar.getMessagesController().t4 > 0) {
            return;
        }
        if ((anVar.getMessagesController().j7 >= 2) || anVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i13);
            if (gjVar3 != null && !gjVar3.P3() && ((org.telegram.messenger.gj.R4(gjVar3.k) || gjVar3.h4()) && gjVar3.k.media_unread)) {
                org.telegram.ui.Components.x11.t(gjVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.b.Da;
    }

    @Override // org.telegram.ui.Components.cg
    public final void Q0() {
        an anVar = this.b;
        org.telegram.messenger.ez sendMessagesHelper = anVar.getSendMessagesHelper();
        long j3 = anVar.k6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= sparseArray2.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message = (TLRPC.Message) sparseArray.valueAt(i11);
                    if (message.dialog_id == j3) {
                        i7 = message.id;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Message message2 = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message2.dialog_id == j3) {
                    i7 = message2.id;
                    break;
                }
                i10++;
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void W(float f10, int i7) {
        org.telegram.ui.Components.w40 w40Var = this.b.q3;
        if (w40Var != null) {
            w40Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void Y() {
        an anVar = this.b;
        qj qjVar = anVar.a0;
        boolean z10 = qjVar.h4;
        org.telegram.ui.Components.sf sfVar = qjVar.V0;
        boolean z11 = false;
        boolean z12 = sfVar != null && sfVar.getCurrentPage() == 0;
        te.a aVar = anVar.ed;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.cg
    public final void a1(int i7) {
        int i10 = i7 == 0 ? 8 : 0;
        an anVar = this.b;
        if (anVar.r3.getVisibility() != i10) {
            anVar.r3.setVisibility(i10);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void b() {
        this.b.dd();
    }

    @Override // org.telegram.ui.Components.cg
    public final void b0(boolean z10) {
        this.b.Cc(false, z10);
    }

    @Override // org.telegram.ui.Components.cg
    public final int b1() {
        return this.b.m1.getHeight();
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final void d() {
        org.telegram.ui.Components.rw0 rw0Var = this.b.s1;
        if (rw0Var != null) {
            rw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean g1() {
        org.telegram.ui.Components.w40 w40Var = this.b.q3;
        return w40Var != null && w40Var.f();
    }

    @Override // org.telegram.ui.Components.cg
    public final void i2() {
        org.telegram.ui.Components.rw0 rw0Var = this.b.s1;
        if (rw0Var != null) {
            rw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        hi.l3 l3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        an anVar = this.b;
        B.N = !isEmpty || anVar.a0.E0();
        jj jjVar = anVar.X1;
        if (jjVar == null || jjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            anVar.X1.getAdapter().U(charSequence2, anVar.a0.getCursorPosition(), anVar.L6, false, false);
        }
        m9.u uVar = anVar.a6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            anVar.a6 = null;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            qj qjVar = anVar.a0;
            if (qjVar.G3 && (!qjVar.E0() || !anVar.a0.I2)) {
                if (z10) {
                    anVar.Cb(charSequence2, true);
                } else {
                    anVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    anVar.a6 = uVar2;
                    org.telegram.messenger.g0.i3(uVar2, org.telegram.messenger.g0.S == null ? 3000L : 1000L);
                }
            }
        }
        zj zjVar = anVar.Ta;
        if (zjVar != null) {
            ArrayList arrayList = zjVar.G;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((ix) arrayList.get(i7)).n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.l = true;
        }
        if (z11) {
            return;
        }
        hi.l3 l3Var2 = anVar.v2;
        if ((l3Var2 != null && l3Var2.W) || ((l3Var = anVar.x2) != null && l3Var.W)) {
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            hi.l3 l3Var3 = anVar.x2;
            if (l3Var3 != null) {
                l3Var3.f(true);
                return;
            }
            return;
        }
        uf ufVar = anVar.kb;
        if (org.telegram.messenger.q10.B(anVar.f) || ((chatFull = anVar.q8) != null && chatFull.slowmode_next_send_date > 0 && anVar.g4 == 0)) {
            z12 = true;
        }
        if (anVar.y2 || anVar.w2 || z12 || org.telegram.messenger.gz.M >= 3 || anVar.a0.E0()) {
            return;
        }
        org.telegram.messenger.g0.r(ufVar);
        org.telegram.messenger.g0.i3(ufVar, 4000L);
    }

    @Override // org.telegram.ui.Components.cg
    public final void k2(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        an anVar = this.b;
        if (i7 < currentActionBarHeight) {
            anVar.q5 = false;
            if (anVar.s1.getVisibility() == 0) {
                anVar.s1.setVisibility(4);
            }
        } else {
            anVar.q5 = true;
            if (anVar.s1.getVisibility() == 4 && !anVar.isInPreviewMode()) {
                anVar.s1.setVisibility(0);
            }
        }
        anVar.r5 = true ^ anVar.a0.G0();
        int i10 = i7 + (anVar.a0.G0() ? 65536 : 0);
        if (this.a != i10) {
            anVar.d0 = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean l() {
        return this.b.Z6();
    }

    @Override // org.telegram.ui.Components.cg
    public final void l1() {
        org.telegram.ui.Components.w40 w40Var = this.b.q3;
        if (w40Var != null) {
            w40Var.k();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void m0() {
        org.telegram.ui.Components.rw0 rw0Var = this.b.s1;
        if (rw0Var != null) {
            rw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean m1() {
        an anVar = this.b;
        TLRPC.User user = anVar.f;
        return (user == null || org.telegram.messenger.q10.B(user) || anVar.f.bot || anVar.h != null || anVar.g4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void m2() {
        int indexOfChild;
        an anVar = this.b;
        if (anVar.getParentActivity() != null) {
            if ((anVar.e == null && anVar.r8 == null) || anVar.fragmentView == null) {
                return;
            }
            hi.l3 l3Var = anVar.u2;
            if ((l3Var == null || !l3Var.W) && (indexOfChild = anVar.m1.indexOfChild(anVar.U)) != -1) {
                try {
                    anVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (anVar.u2 == null) {
                    anVar.u2 = anVar.E6(310.0f, 3, indexOfChild + 1, false);
                }
                TLRPC.UserFull userFull = anVar.r8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    anVar.u2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, anVar.a0.d1 ? 2131743594 : 2131743520, anVar.f.first_name)));
                } else if (org.telegram.messenger.t3.v(anVar.e) || org.telegram.messenger.t3.s(anVar.e)) {
                    if (org.telegram.messenger.t3.P(20, anVar.e)) {
                        anVar.u2.u(org.telegram.messenger.hd.M0(2131749537, null));
                    } else if (org.telegram.messenger.t3.P(21, anVar.e)) {
                        anVar.u2.u(org.telegram.messenger.hd.M0(2131749540, null));
                    } else if (org.telegram.messenger.t3.P(7, anVar.e)) {
                        anVar.u2.u(org.telegram.messenger.hd.M0(2131749543, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = anVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                            anVar.u2.u(org.telegram.messenger.hd.M0(2131753955, null));
                        } else {
                            anVar.u2.u(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.hd.v(anVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (anVar.Z6()) {
                        return;
                    }
                    if (anVar.a0.d1) {
                        anVar.u2.u(org.telegram.messenger.t3.L(21, anVar.e));
                    } else {
                        anVar.u2.u(org.telegram.messenger.t3.L(20, anVar.e));
                    }
                }
                View sendButton = anVar.a0.getSendButton();
                View audioVideoButtonContainer = anVar.a0.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                anVar.u2.y(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final int n() {
        return this.b.m1.Q();
    }

    @Override // org.telegram.ui.Components.cg
    public final void n1() {
        int i7;
        an anVar = this.b;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        long j3 = anVar.k6;
        org.telegram.messenger.lj ljVar = anVar.x5;
        if (ljVar == null) {
            ljVar = org.telegram.messenger.lj.a();
        }
        new di.s0(parentActivity, i7, j3, ljVar, anVar, anVar.getResourceProvider(), 0, new ke(anVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.cg
    public final void n2(boolean z10) {
        an anVar = this.b;
        View view = anVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        anVar.s5 = !z10;
    }

    @Override // org.telegram.ui.Components.cg
    public final void o1() {
        this.b.W6();
    }

    @Override // org.telegram.ui.Components.cg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        an anVar = this.b;
        if (anVar.q3 == null && CameraView.isCameraAllowed() && anVar.getParentActivity() != null) {
            Activity parentActivity = anVar.getParentActivity();
            ym ymVar = anVar.Aa;
            org.telegram.ui.Components.w40 q40Var = org.telegram.ui.Components.w40.e(org.telegram.messenger.m10.t0) ? new org.telegram.ui.Components.q40(parentActivity, anVar, ymVar) : new org.telegram.ui.Components.r40(parentActivity, anVar, ymVar, true);
            anVar.q3 = q40Var;
            q40Var.setAnimationCallback(new ce(anVar, 0));
            anVar.q3.setTrimCallback(new ce(anVar, 1));
            anVar.q3.setRecordingUiFrameCallback(new wi(anVar));
            anVar.q3.setClipToPadding(false);
            anVar.q3.i(anVar.L, anVar.x);
            int indexOfChild = anVar.m1.indexOfChild(anVar.U);
            if (indexOfChild < 0) {
                indexOfChild = anVar.m1.getChildCount();
            }
            anVar.m1.addView(anVar.q3, Math.min(indexOfChild + 1, anVar.m1.getChildCount()), c8.ja.e(-1, -1, 51));
        }
        org.telegram.ui.Components.w40 w40Var = anVar.q3;
        if (w40Var != null) {
            if (i7 == 0) {
                w40Var.j(false);
                anVar.A0.C0();
                anVar.D0.T();
            } else if (i7 == 1 || i7 == 3 || i7 == 4) {
                w40Var.h(i7, i10, i11, j3, j10, z10);
            } else if (i7 == 2 || i7 == 5) {
                w40Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final qm p0() {
        return this.b.C5;
    }

    @Override // org.telegram.ui.Components.cg
    public final void q1() {
        int i7;
        int i10;
        an anVar = this.b;
        anVar.l7();
        qj qjVar = anVar.a0;
        boolean z10 = qjVar.h4;
        org.telegram.ui.Components.sf sfVar = qjVar.V0;
        anVar.ed.a(z10 && !(sfVar != null && sfVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
            if (xbVar != null && xbVar.l) {
                xbVar.b();
            }
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        jj jjVar = anVar.X1;
        float f10 = 0.0f;
        if (jjVar != null) {
            jjVar.animate().alpha((z10 || anVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.er.f).start();
        }
        org.telegram.ui.Components.rw0 rw0Var = anVar.s1;
        if (rw0Var != null) {
            rw0Var.setVisibility(0);
            ViewPropertyAnimator animate = anVar.s1.animate();
            if (!z10 && !anVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.er.f).withEndAction(new ai.q(21, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void r2() {
        an anVar = this.b;
        hi.l3 l3Var = anVar.v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = anVar.x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.cg
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.o0 || anVar.ca() || !TextUtils.isEmpty(anVar.a0.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = anVar.j0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.x xVar = anVar.g0;
        if (xVar != null) {
            xVar.e(0);
        }
        er erVar = anVar.f0;
        if (erVar != null) {
            erVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        an anVar = this.b;
        anVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = anVar.j0;
        if (q0Var == null || q0Var.getVisibility() == 0) {
            return;
        }
        anVar.j0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = anVar.g0;
        if (xVar != null) {
            xVar.e(8);
        }
        er erVar = anVar.f0;
        if (erVar != null) {
            erVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void u1(CharSequence charSequence) {
        this.b.Cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.cg
    public final void v() {
        boolean z10;
        an anVar = this.b;
        if (anVar.B0 != null) {
            anVar.d0 = anVar.a0.getBackgroundTop();
        }
        jj jjVar = anVar.X1;
        if (jjVar != null) {
            jjVar.getAdapter().g0 = true;
        }
        if (anVar.G5 != null) {
            org.telegram.messenger.g0.i3(new bh(this, 7), 30L);
        }
        if (anVar.a0.G0()) {
            anVar.a0.u1();
            z10 = true;
        } else {
            z10 = false;
        }
        anVar.a0.l1(true, true, z10);
        if (anVar.F5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.F5, true);
            anVar.F5 = 0;
        }
        anVar.gd(0, true);
        anVar.Pc(false);
        anVar.Gd(false);
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean v1() {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.kj kjVar = this.b.w5;
        return (kjVar == null || (ijVar = kjVar.b) == null || ijVar.e.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.cg
    public final void w1() {
        int i7;
        char c10;
        long j3;
        an anVar = this.b;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = anVar.k6;
        long b11 = (int) anVar.b();
        LongSparseArray w10 = b10.a.w(j10, b11);
        if (w10 != null && w10.size() > 0) {
            int size = w10.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c10 = 0;
                    break;
                }
                j11 = w10.keyAt(i10);
                a2Var = (org.telegram.messenger.a2) w10.valueAt(i10);
                c10 = 0;
                if (!a2Var.e) {
                    break;
                } else {
                    i10++;
                }
            }
            org.telegram.messenger.a2 a2Var2 = a2Var;
            long j12 = j11;
            if (a2Var2 != null && !a2Var2.e) {
                Runnable runnable = a2Var2.f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.b.T(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.e = true;
                    j3 = j12;
                } else {
                    b10.a.W(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.ns notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ns.L5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j3;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().j1(j10);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (b11 != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) b11;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new jh.b(1));
            }
        }
        anVar.r7(true);
    }

    @Override // org.telegram.ui.Components.cg
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.o0) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = anVar.j0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = anVar.g0;
        if (xVar != null) {
            xVar.e(8);
        }
        er erVar = anVar.f0;
        if (erVar != null) {
            erVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.cg
    public final void y(float f10) {
        an anVar = this.b;
        if (f10 != 0.0f) {
            anVar.Q4 = true;
        }
        anVar.M9();
        anVar.O9();
        anVar.vd(false, false);
        anVar.m1.invalidate();
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
        if (xbVar == null || anVar.Dc == null) {
            return;
        }
        xbVar.l();
    }
}
