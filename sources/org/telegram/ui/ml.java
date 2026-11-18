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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ml implements org.telegram.ui.Components.kg {
    public int a;
    public final /* synthetic */ bn b;

    public ml(bn bnVar) {
        this.b = bnVar;
    }

    @Override // org.telegram.ui.Components.kg
    public final void A(boolean z10) {
        int i7;
        int i10;
        bn bnVar = this.b;
        if (!z10) {
            Activity parentActivity = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity, i7);
        } else {
            Activity parentActivity2 = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity2, i10);
            bnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void B2() {
        bn bnVar = this.b;
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null) {
            n2Var.x1(0, null);
        }
        bnVar.Aa();
    }

    @Override // org.telegram.ui.Components.kg
    public final void D() {
        this.b.Cc(true, false);
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean E0() {
        int i7;
        bn bnVar = this.b;
        if ((bnVar.getMessagesController().y2(bnVar.a()) && !bnVar.x4) || (i7 = bnVar.g4) == 9 || bnVar.h4 <= 0) {
            return false;
        }
        if (i7 != 0) {
            return i7 == 3 && bnVar.e9() == bnVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kg
    public final void G() {
        org.telegram.ui.Components.yw0 yw0Var = this.b.s1;
        if (yw0Var != null) {
            yw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void G0() {
        bn bnVar = this.b;
        bnVar.L9 = true;
        kl klVar = bnVar.D0;
        if (klVar != null) {
            klVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void G1() {
        int i7;
        int i10;
        bn bnVar = this.b;
        if (bnVar.X9() || (i7 = bnVar.g4) == 6 || i7 == 8) {
            return;
        }
        org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
        long j3 = bnVar.l6;
        long j10 = bnVar.s4;
        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
        messagesController.N4(0, i10, j3, j10, null);
    }

    @Override // org.telegram.ui.Components.kg
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        jg.d1 d1Var;
        org.telegram.messenger.fj fjVar;
        int i11;
        long b22;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        TLRPC.Message message;
        org.telegram.messenger.hj hjVar2;
        bn bnVar = this.b;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.B0 != null) {
            bnVar.d0 = bnVar.a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            bnVar.X1.getAdapter().x.a(charSequence);
        }
        if (i7 != 0) {
            if (bnVar.h4 == -1) {
                bnVar.h4 = 0;
            }
            if (charSequence != null) {
                bnVar.h4++;
            }
            org.telegram.messenger.jj jjVar2 = bnVar.x5;
            if (jjVar2 != null && (hjVar2 = jjVar2.b) != null && !hjVar2.e.isEmpty()) {
                bnVar.h4 += bnVar.x5.b.e.size();
            }
            bnVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (jjVar = bnVar.x5) != null && (hjVar = jjVar.b) != null && !hjVar.e.isEmpty() && bnVar.x5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            bnVar.x5.b.b(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer B1 = bnVar.getMessagesController().B1(bnVar.l6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                if (fjVar2 != null && (message = fjVar2.k) != null && !org.telegram.messenger.fj.v5(message.peer_id, B1)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.gd.M0(2131744071, null), org.telegram.messenger.gd.M0(2131744070, null));
                org.telegram.ui.Components.ph0 ph0Var = ((org.telegram.ui.Components.dc) I.e).a;
                ph0Var.setScaleX(1.8f);
                ph0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.v3.c0(bnVar.e) && !bnVar.x4 && (fjVar = bnVar.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = fjVar.j1;
            if (tL_forumTopic != null) {
                b22 = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                b22 = org.telegram.messenger.fj.b2(i11, bnVar.F5.k, true, false);
            }
            long j10 = b22;
            if (j10 != 0) {
                bnVar.getMediaDataController().F(bnVar.l6, j10, false);
            }
        }
        bnVar.fc(false, null, null, null, z10, i7, null, false, j3, true);
        rj rjVar = bnVar.a0;
        if (rjVar != null && rjVar.getEmojiView() != null && (d1Var = bnVar.a0.getEmojiView().U0) != null) {
            if (d1Var.e) {
                org.telegram.messenger.mp.u1(d1Var.a).N4(2, 0, d1Var.b, d1Var.c, null);
            }
            d1Var.f = -1L;
        }
        if (bnVar.getMessagesController().K3() || bnVar.getMessagesController().v4 > 0) {
            return;
        }
        if ((bnVar.getMessagesController().l7 >= 2) || bnVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i13);
            if (fjVar3 != null && !fjVar3.P3() && ((org.telegram.messenger.fj.R4(fjVar3.k) || fjVar3.h4()) && fjVar3.k.media_unread)) {
                org.telegram.ui.Components.g21.t(fjVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.b.Ea;
    }

    @Override // org.telegram.ui.Components.kg
    public final void J0() {
        this.b.Ma(0, false);
    }

    @Override // org.telegram.ui.Components.kg
    public final void Q(float f10, int i7) {
        org.telegram.ui.Components.e50 e50Var = this.b.q3;
        if (e50Var != null) {
            e50Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void Q0() {
        bn bnVar = this.b;
        org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
        long j3 = bnVar.l6;
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

    @Override // org.telegram.ui.Components.kg
    public final void V() {
        bn bnVar = this.b;
        rj rjVar = bnVar.a0;
        boolean z10 = rjVar.n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        boolean z11 = false;
        boolean z12 = cgVar != null && cgVar.getCurrentPage() == 0;
        te.a aVar = bnVar.fd;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.kg
    public final void a0(boolean z10) {
        this.b.Cc(false, z10);
    }

    @Override // org.telegram.ui.Components.kg
    public final void a1(int i7) {
        int i10 = i7 == 0 ? 8 : 0;
        bn bnVar = this.b;
        if (bnVar.r3.getVisibility() != i10) {
            bnVar.r3.setVisibility(i10);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void b0() {
        org.telegram.ui.Components.yw0 yw0Var = this.b.s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final int b1() {
        return this.b.m1.getHeight();
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TL_stories.StoryItem c1() {
        return null;
    }

    @Override // org.telegram.ui.Components.kg
    public final void d() {
        this.b.dd();
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final void g() {
        org.telegram.ui.Components.yw0 yw0Var = this.b.s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean g1() {
        org.telegram.ui.Components.e50 e50Var = this.b.q3;
        return e50Var != null && e50Var.f();
    }

    @Override // org.telegram.ui.Components.kg
    public final void i2() {
        org.telegram.ui.Components.yw0 yw0Var = this.b.s1;
        if (yw0Var != null) {
            yw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        hi.m3 m3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        bn bnVar = this.b;
        B.N = !isEmpty || bnVar.a0.M0();
        kj kjVar = bnVar.X1;
        if (kjVar == null || kjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            bnVar.X1.getAdapter().U(charSequence2, bnVar.a0.getCursorPosition(), bnVar.M6, false, false);
        }
        m9.u uVar = bnVar.b6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            bnVar.b6 = null;
        }
        TLRPC.Chat chat = bnVar.e;
        if (chat == null || org.telegram.messenger.v3.m(chat)) {
            rj rjVar = bnVar.a0;
            if (rjVar.M3 && (!rjVar.M0() || !bnVar.a0.O2)) {
                if (z10) {
                    bnVar.Cb(charSequence2, true);
                } else {
                    bnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    bnVar.b6 = uVar2;
                    org.telegram.messenger.g0.h3(uVar2, org.telegram.messenger.g0.S == null ? 3000L : 1000L);
                }
            }
        }
        ak akVar = bnVar.Ua;
        if (akVar != null) {
            ArrayList arrayList = akVar.G;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((mx) arrayList.get(i7)).n = true;
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
        hi.m3 m3Var2 = bnVar.v2;
        if ((m3Var2 != null && m3Var2.W) || ((m3Var = bnVar.x2) != null && m3Var.W)) {
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            hi.m3 m3Var3 = bnVar.x2;
            if (m3Var3 != null) {
                m3Var3.f(true);
                return;
            }
            return;
        }
        vf vfVar = bnVar.lb;
        if (org.telegram.messenger.o10.C(bnVar.f) || ((chatFull = bnVar.r8) != null && chatFull.slowmode_next_send_date > 0 && bnVar.g4 == 0)) {
            z12 = true;
        }
        if (bnVar.y2 || bnVar.w2 || z12 || org.telegram.messenger.bz.M >= 3 || bnVar.a0.M0()) {
            return;
        }
        org.telegram.messenger.g0.r(vfVar);
        org.telegram.messenger.g0.h3(vfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean k() {
        return this.b.Z6();
    }

    @Override // org.telegram.ui.Components.kg
    public final void k2(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        bn bnVar = this.b;
        if (i7 < currentActionBarHeight) {
            bnVar.r5 = false;
            if (bnVar.s1.getVisibility() == 0) {
                bnVar.s1.setVisibility(4);
            }
        } else {
            bnVar.r5 = true;
            if (bnVar.s1.getVisibility() == 4 && !bnVar.isInPreviewMode()) {
                bnVar.s1.setVisibility(0);
            }
        }
        bnVar.s5 = true ^ bnVar.a0.O0();
        int i10 = i7 + (bnVar.a0.O0() ? 65536 : 0);
        if (this.a != i10) {
            bnVar.d0 = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.kg
    public final void l1() {
        org.telegram.ui.Components.e50 e50Var = this.b.q3;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final rm m0() {
        return this.b.D5;
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean m1() {
        bn bnVar = this.b;
        TLRPC.User user = bnVar.f;
        return (user == null || org.telegram.messenger.o10.C(user) || bnVar.f.bot || bnVar.h != null || bnVar.g4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.kg
    public final void m2() {
        int indexOfChild;
        bn bnVar = this.b;
        if (bnVar.getParentActivity() != null) {
            if ((bnVar.e == null && bnVar.s8 == null) || bnVar.fragmentView == null) {
                return;
            }
            hi.m3 m3Var = bnVar.u2;
            if ((m3Var == null || !m3Var.W) && (indexOfChild = bnVar.m1.indexOfChild(bnVar.U)) != -1) {
                try {
                    bnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (bnVar.u2 == null) {
                    bnVar.u2 = bnVar.E6(310.0f, 3, indexOfChild + 1, false);
                }
                TLRPC.UserFull userFull = bnVar.s8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    bnVar.u2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, bnVar.a0.d1 ? 2131743357 : 2131743283, bnVar.f.first_name)));
                } else if (org.telegram.messenger.v3.v(bnVar.e) || org.telegram.messenger.v3.s(bnVar.e)) {
                    if (org.telegram.messenger.v3.P(20, bnVar.e)) {
                        bnVar.u2.v(org.telegram.messenger.gd.M0(2131749362, null));
                    } else if (org.telegram.messenger.v3.P(21, bnVar.e)) {
                        bnVar.u2.v(org.telegram.messenger.gd.M0(2131749365, null));
                    } else if (org.telegram.messenger.v3.P(7, bnVar.e)) {
                        bnVar.u2.v(org.telegram.messenger.gd.M0(2131749368, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = bnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                            bnVar.u2.v(org.telegram.messenger.gd.M0(2131753953, null));
                        } else {
                            bnVar.u2.v(org.telegram.messenger.gd.a0("AttachMediaRestricted", null, 2131753954, org.telegram.messenger.gd.v(bnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (bnVar.Z6()) {
                        return;
                    }
                    if (bnVar.a0.d1) {
                        bnVar.u2.v(org.telegram.messenger.v3.L(21, bnVar.e));
                    } else {
                        bnVar.u2.v(org.telegram.messenger.v3.L(20, bnVar.e));
                    }
                }
                View sendButton = bnVar.a0.getSendButton();
                View audioVideoButtonContainer = bnVar.a0.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                bnVar.u2.z(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final int n() {
        return this.b.m1.Q();
    }

    @Override // org.telegram.ui.Components.kg
    public final void n1() {
        int i7;
        bn bnVar = this.b;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        long j3 = bnVar.l6;
        org.telegram.messenger.kj kjVar = bnVar.y5;
        if (kjVar == null) {
            kjVar = org.telegram.messenger.kj.a();
        }
        new di.r0(parentActivity, i7, j3, kjVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.kg
    public final void n2(boolean z10) {
        bn bnVar = this.b;
        View view = bnVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        bnVar.t5 = !z10;
    }

    @Override // org.telegram.ui.Components.kg
    public final void o1() {
        this.b.W6();
    }

    @Override // org.telegram.ui.Components.kg
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        bn bnVar = this.b;
        if (bnVar.q3 == null && CameraView.isCameraAllowed() && bnVar.getParentActivity() != null) {
            Activity parentActivity = bnVar.getParentActivity();
            zm zmVar = bnVar.Ba;
            org.telegram.ui.Components.e50 y40Var = org.telegram.ui.Components.e50.e(org.telegram.messenger.j10.t0) ? new org.telegram.ui.Components.y40(parentActivity, bnVar, zmVar) : new org.telegram.ui.Components.z40(parentActivity, bnVar, zmVar, true);
            bnVar.q3 = y40Var;
            y40Var.setAnimationCallback(new ee(bnVar, 0));
            bnVar.q3.setTrimCallback(new ee(bnVar, 1));
            bnVar.q3.setRecordingUiFrameCallback(new xi(bnVar));
            bnVar.q3.setClipToPadding(false);
            bnVar.q3.i(bnVar.L, bnVar.x);
            int indexOfChild = bnVar.m1.indexOfChild(bnVar.U);
            if (indexOfChild < 0) {
                indexOfChild = bnVar.m1.getChildCount();
            }
            bnVar.m1.addView(bnVar.q3, Math.min(indexOfChild + 1, bnVar.m1.getChildCount()), c8.ma.e(-1, -1, 51));
        }
        org.telegram.ui.Components.e50 e50Var = bnVar.q3;
        if (e50Var != null) {
            if (i7 == 0) {
                e50Var.j(false);
                bnVar.A0.C0();
                bnVar.D0.T();
            } else if (i7 == 1 || i7 == 3 || i7 == 4) {
                e50Var.h(i7, i10, i11, j3, j10, z10);
            } else if (i7 == 2 || i7 == 5) {
                e50Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void q1() {
        int i7;
        int i10;
        bn bnVar = this.b;
        bnVar.l7();
        rj rjVar = bnVar.a0;
        boolean z10 = rjVar.n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        bnVar.fd.a(z10 && !(cgVar != null && cgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i10);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
            if (gcVar != null && gcVar.l) {
                gcVar.b();
            }
        } else {
            Activity parentActivity2 = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity2, i7);
        }
        kj kjVar = bnVar.X1;
        float f10 = 0.0f;
        if (kjVar != null) {
            kjVar.animate().alpha((z10 || bnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.lr.f).start();
        }
        org.telegram.ui.Components.yw0 yw0Var = bnVar.s1;
        if (yw0Var != null) {
            yw0Var.setVisibility(0);
            ViewPropertyAnimator animate = bnVar.s1.animate();
            if (!z10 && !bnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.lr.f).withEndAction(new ch.k(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void r2() {
        bn bnVar = this.b;
        hi.m3 m3Var = bnVar.v2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        hi.m3 m3Var2 = bnVar.x2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (kVar.o0 || bnVar.ca() || !TextUtils.isEmpty(bnVar.a0.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.j0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.y yVar = bnVar.g0;
        if (yVar != null) {
            yVar.e(0);
        }
        fr frVar = bnVar.f0;
        if (frVar != null) {
            frVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        bn bnVar = this.b;
        bnVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.j0;
        if (r0Var == null || r0Var.getVisibility() == 0) {
            return;
        }
        bnVar.j0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = bnVar.g0;
        if (yVar != null) {
            yVar.e(8);
        }
        fr frVar = bnVar.f0;
        if (frVar != null) {
            frVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.kg
    public final void u() {
        boolean z10;
        bn bnVar = this.b;
        if (bnVar.B0 != null) {
            bnVar.d0 = bnVar.a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null) {
            kjVar.getAdapter().g0 = true;
        }
        if (bnVar.H5 != null) {
            org.telegram.messenger.g0.h3(new bh(this, 7), 30L);
        }
        if (bnVar.a0.O0()) {
            bnVar.a0.C1();
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.a0.t1(true, true, z10);
        if (bnVar.G5 != 0) {
            bnVar.getConnectionsManager().cancelRequest(bnVar.G5, true);
            bnVar.G5 = 0;
        }
        bnVar.gd(0, true);
        bnVar.Pc(false);
        bnVar.Gd(false);
    }

    @Override // org.telegram.ui.Components.kg
    public final void u1(CharSequence charSequence) {
        this.b.Cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.kg
    public final boolean v1() {
        org.telegram.messenger.hj hjVar;
        org.telegram.messenger.jj jjVar = this.b.x5;
        return (jjVar == null || (hjVar = jjVar.b) == null || hjVar.e.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.kg
    public final void w1() {
        int i7;
        char c10;
        long j3;
        bn bnVar = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = bnVar.l6;
        long d = (int) bnVar.d();
        LongSparseArray p10 = b10.a.p(j10, d);
        if (p10 != null && p10.size() > 0) {
            int size = p10.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c10 = 0;
                    break;
                }
                j11 = p10.keyAt(i10);
                a2Var = (org.telegram.messenger.a2) p10.valueAt(i10);
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
                b10.b.w(j10, d, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.e = true;
                    j3 = j12;
                } else {
                    b10.a.y(j10, d, j12);
                    j3 = j12;
                    org.telegram.messenger.ks notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.b, d);
                    d = d;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ks.O5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j3;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().l1(j10);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (d != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) d;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new jh.b(1));
            }
        }
        bnVar.r7(true);
    }

    @Override // org.telegram.ui.Components.kg
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (kVar.o0) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.j0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = bnVar.g0;
        if (yVar != null) {
            yVar.e(8);
        }
        fr frVar = bnVar.f0;
        if (frVar != null) {
            frVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final void x(float f10) {
        bn bnVar = this.b;
        if (f10 != 0.0f) {
            bnVar.R4 = true;
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        bnVar.m1.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || bnVar.Ec == null) {
            return;
        }
        gcVar.l();
    }
}
