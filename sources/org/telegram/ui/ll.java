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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ll implements org.telegram.ui.Components.wf {
    public int a;
    public final /* synthetic */ an b;

    public ll(an anVar) {
        this.b = anVar;
    }

    @Override // org.telegram.ui.Components.wf
    public final void B(boolean z9) {
        int i7;
        int i10;
        an anVar = this.b;
        if (!z9) {
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity2, i10);
            anVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void C0() {
        this.b.Ja(0, false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void D() {
        this.b.yc(true, false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void E() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.r1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        jg.e1 e1Var;
        org.telegram.messenger.ij ijVar;
        int i11;
        long c22;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        TLRPC.Message message;
        org.telegram.messenger.kj kjVar2;
        an anVar = this.b;
        ArrayList arrayList = anVar.K6;
        if (anVar.A0 != null) {
            anVar.c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            anVar.W1.getAdapter().x.a(charSequence);
        }
        if (i7 != 0) {
            if (anVar.g4 == -1) {
                anVar.g4 = 0;
            }
            if (charSequence != null) {
                anVar.g4++;
            }
            org.telegram.messenger.mj mjVar2 = anVar.v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.b) != null && !kjVar2.e.isEmpty()) {
                anVar.g4 += anVar.v5.b.e.size();
            }
            anVar.id(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = anVar.v5) != null && (kjVar = mjVar.b) != null && !kjVar.e.isEmpty() && anVar.v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            anVar.v5.b.b(arrayList2);
            boolean z10 = arrayList2.size() > 0;
            TLRPC.Peer z12 = anVar.getMessagesController().z1(anVar.j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.k) != null && !org.telegram.messenger.ij.w5(message.peer_id, z12)) {
                    z10 = false;
                    break;
                }
                i12++;
            }
            if (z10) {
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(anVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.hd.M0(2131744307, null), org.telegram.messenger.hd.M0(2131744306, null));
                org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Components.zb) I.e).a;
                ch0Var.setScaleX(1.8f);
                ch0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(anVar.e) && !anVar.v4 && (ijVar = anVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.h1;
            if (tL_forumTopic != null) {
                c22 = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                c22 = org.telegram.messenger.ij.c2(i11, anVar.D5.k, true, false);
            }
            long j10 = c22;
            if (j10 != 0) {
                anVar.getMediaDataController().D(anVar.j6, j10, false);
            }
        }
        anVar.bc(false, null, null, null, z9, i7, null, false, j3, true);
        qj qjVar = anVar.Z;
        if (qjVar != null && qjVar.getEmojiView() != null && (e1Var = anVar.Z.getEmojiView().T0) != null) {
            if (e1Var.e) {
                org.telegram.messenger.qp.s1(e1Var.a).C4(2, 0, e1Var.b, e1Var.c, null);
            }
            e1Var.f = -1L;
        }
        if (anVar.getMessagesController().D3() || anVar.getMessagesController().s4 > 0) {
            return;
        }
        if ((anVar.getMessagesController().i7 >= 2) || anVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
            if (ijVar3 != null && !ijVar3.Q3() && ((org.telegram.messenger.ij.S4(ijVar3.k) || ijVar3.i4()) && ijVar3.k.media_unread)) {
                org.telegram.ui.Components.s11.r(ijVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.b.Aa;
    }

    @Override // org.telegram.ui.Components.wf
    public final void I0() {
        an anVar = this.b;
        org.telegram.messenger.gz sendMessagesHelper = anVar.getSendMessagesHelper();
        long j3 = anVar.j6;
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

    @Override // org.telegram.ui.Components.wf
    public final void M(float f10, int i7) {
        org.telegram.ui.Components.t40 t40Var = this.b.p3;
        if (t40Var != null) {
            t40Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void R0(int i7) {
        int i10 = i7 == 0 ? 8 : 0;
        an anVar = this.b;
        if (anVar.q3.getVisibility() != i10) {
            anVar.q3.setVisibility(i10);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final int S0() {
        return this.b.l1.getHeight();
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TL_stories.StoryItem T0() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final void T1() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.r1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final void V1(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        an anVar = this.b;
        if (i7 < currentActionBarHeight) {
            anVar.p5 = false;
            if (anVar.r1.getVisibility() == 0) {
                anVar.r1.setVisibility(4);
            }
        } else {
            anVar.p5 = true;
            if (anVar.r1.getVisibility() == 4 && !anVar.isInPreviewMode()) {
                anVar.r1.setVisibility(0);
            }
        }
        anVar.q5 = true ^ anVar.Z.s0();
        int i10 = i7 + (anVar.Z.s0() ? 65536 : 0);
        if (this.a != i10) {
            anVar.c0 = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.wf
    public final void W() {
        an anVar = this.b;
        qj qjVar = anVar.Z;
        boolean z9 = qjVar.z3;
        org.telegram.ui.Components.mf mfVar = qjVar.U0;
        boolean z10 = false;
        boolean z11 = mfVar != null && mfVar.getCurrentPage() == 0;
        te.a aVar = anVar.bd;
        if (z9 && !z11) {
            z10 = true;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean X0() {
        org.telegram.ui.Components.t40 t40Var = this.b.p3;
        return t40Var != null && t40Var.e();
    }

    @Override // org.telegram.ui.Components.wf
    public final void X1() {
        int indexOfChild;
        an anVar = this.b;
        if (anVar.getParentActivity() != null) {
            if ((anVar.e == null && anVar.q8 == null) || anVar.fragmentView == null) {
                return;
            }
            fi.m3 m3Var = anVar.t2;
            if ((m3Var == null || !m3Var.V) && (indexOfChild = anVar.l1.indexOfChild(anVar.T)) != -1) {
                try {
                    anVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (anVar.t2 == null) {
                    anVar.t2 = anVar.D6(310.0f, 3, indexOfChild + 1, false);
                }
                TLRPC.UserFull userFull = anVar.q8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    anVar.t2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, anVar.Z.c1 ? 2131743595 : 2131743521, anVar.f.first_name)));
                } else if (org.telegram.messenger.t3.v(anVar.e) || org.telegram.messenger.t3.s(anVar.e)) {
                    if (org.telegram.messenger.t3.P(20, anVar.e)) {
                        anVar.t2.u(org.telegram.messenger.hd.M0(2131749536, null));
                    } else if (org.telegram.messenger.t3.P(21, anVar.e)) {
                        anVar.t2.u(org.telegram.messenger.hd.M0(2131749539, null));
                    } else if (org.telegram.messenger.t3.P(7, anVar.e)) {
                        anVar.t2.u(org.telegram.messenger.hd.M0(2131749542, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = anVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                            anVar.t2.u(org.telegram.messenger.hd.M0(2131753955, null));
                        } else {
                            anVar.t2.u(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.hd.v(anVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (anVar.Y6()) {
                        return;
                    }
                    if (anVar.Z.c1) {
                        anVar.t2.u(org.telegram.messenger.t3.L(21, anVar.e));
                    } else {
                        anVar.t2.u(org.telegram.messenger.t3.L(20, anVar.e));
                    }
                }
                View sendButton = anVar.Z.getSendButton();
                View audioVideoButtonContainer = anVar.Z.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                anVar.t2.y(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y(boolean z9) {
        this.b.yc(false, z9);
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y1(boolean z9) {
        an anVar = this.b;
        View view = anVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        anVar.r5 = !z9;
    }

    @Override // org.telegram.ui.Components.wf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        an anVar = this.b;
        if (anVar.p3 == null && CameraView.isCameraAllowed() && anVar.getParentActivity() != null) {
            Activity parentActivity = anVar.getParentActivity();
            ym ymVar = anVar.xa;
            org.telegram.ui.Components.t40 n40Var = org.telegram.ui.Components.t40.d(org.telegram.messenger.p10.s0) ? new org.telegram.ui.Components.n40(parentActivity, anVar, ymVar) : new org.telegram.ui.Components.o40(parentActivity, anVar, ymVar, true);
            anVar.p3 = n40Var;
            n40Var.setAnimationCallback(new fe(anVar, 0));
            anVar.p3.setTrimCallback(new fe(anVar, 1));
            anVar.p3.setRecordingUiFrameCallback(new wi(anVar));
            anVar.p3.setClipToPadding(false);
            anVar.p3.h(anVar.K, anVar.x);
            int indexOfChild = anVar.l1.indexOfChild(anVar.T);
            if (indexOfChild < 0) {
                indexOfChild = anVar.l1.getChildCount();
            }
            anVar.l1.addView(anVar.p3, Math.min(indexOfChild + 1, anVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.t40 t40Var = anVar.p3;
        if (t40Var != null) {
            if (i7 == 0) {
                t40Var.i(false);
                anVar.z0.C0();
                anVar.C0.T();
            } else if (i7 == 1 || i7 == 3 || i7 == 4) {
                t40Var.g(i7, i10, i11, j3, j10, z9);
            } else if (i7 == 2 || i7 == 5) {
                t40Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void a() {
        this.b.Zc();
    }

    @Override // org.telegram.ui.Components.wf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        CharSequence charSequence2;
        fi.m3 m3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = false;
        an anVar = this.b;
        B.M = !isEmpty || anVar.Z.q0();
        jj jjVar = anVar.W1;
        if (jjVar == null || jjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            anVar.W1.getAdapter().U(charSequence2, anVar.Z.getCursorPosition(), anVar.K6, false, false);
        }
        m9.u uVar = anVar.Z5;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            anVar.Z5 = null;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            qj qjVar = anVar.Z;
            if (qjVar.Y2 && (!qjVar.q0() || !anVar.Z.a2)) {
                if (z9) {
                    anVar.yb(charSequence2, true);
                } else {
                    anVar.a7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 28);
                    anVar.Z5 = uVar2;
                    org.telegram.messenger.g0.i3(uVar2, org.telegram.messenger.g0.S == null ? 3000L : 1000L);
                }
            }
        }
        zj zjVar = anVar.Qa;
        if (zjVar != null) {
            ArrayList arrayList = zjVar.F;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((hx) arrayList.get(i7)).n = true;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.l = true;
        }
        ch.k0 k0Var2 = ch.k0.C;
        if (k0Var2 != null) {
            k0Var2.l = true;
        }
        if (z10) {
            return;
        }
        fi.m3 m3Var2 = anVar.u2;
        if ((m3Var2 != null && m3Var2.V) || ((m3Var = anVar.w2) != null && m3Var.V)) {
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            fi.m3 m3Var3 = anVar.w2;
            if (m3Var3 != null) {
                m3Var3.f(true);
                return;
            }
            return;
        }
        xf xfVar = anVar.hb;
        if (org.telegram.messenger.t10.B(anVar.f) || ((chatFull = anVar.p8) != null && chatFull.slowmode_next_send_date > 0 && anVar.f4 == 0)) {
            z11 = true;
        }
        if (anVar.x2 || anVar.v2 || z11 || org.telegram.messenger.iz.M >= 3 || anVar.Z.q0()) {
            return;
        }
        org.telegram.messenger.g0.r(xfVar);
        org.telegram.messenger.g0.i3(xfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.wf
    public final void b() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean c() {
        return this.b.Y6();
    }

    @Override // org.telegram.ui.Components.wf
    public final void c1() {
        org.telegram.ui.Components.t40 t40Var = this.b.p3;
        if (t40Var != null) {
            t40Var.j();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean d1() {
        an anVar = this.b;
        TLRPC.User user = anVar.f;
        return (user == null || org.telegram.messenger.t10.B(user) || anVar.f.bot || anVar.h != null || anVar.f4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.wf
    public final void d2() {
        an anVar = this.b;
        fi.m3 m3Var = anVar.u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = anVar.w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void e1() {
        int i7;
        an anVar = this.b;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        long j3 = anVar.j6;
        org.telegram.messenger.nj njVar = anVar.w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, anVar, anVar.getResourceProvider(), 0, new ne(anVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.wf
    public final void f1() {
        this.b.V6();
    }

    @Override // org.telegram.ui.Components.wf
    public final void h1() {
        int i7;
        int i10;
        an anVar = this.b;
        anVar.k7();
        qj qjVar = anVar.Z;
        boolean z9 = qjVar.z3;
        org.telegram.ui.Components.mf mfVar = qjVar.U0;
        anVar.bd.a(z9 && !(mfVar != null && mfVar.getCurrentPage() == 0), true);
        if (z9) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
            if (ccVar != null && ccVar.l) {
                ccVar.b();
            }
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        jj jjVar = anVar.W1;
        float f10 = 0.0f;
        if (jjVar != null) {
            jjVar.animate().alpha((z9 || anVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = anVar.r1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate = anVar.r1.animate();
            if (!z9 && !anVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f).withEndAction(new bi.k1(20, this, z9)).start();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void h2() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = anVar.i0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = anVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        cr crVar = anVar.e0;
        if (crVar != null) {
            crVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        an anVar = this.b;
        anVar.vc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = anVar.i0;
        if (r0Var == null || r0Var.getVisibility() == 0) {
            return;
        }
        anVar.i0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = anVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        cr crVar = anVar.e0;
        if (crVar != null) {
            crVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void j0() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void k1(CharSequence charSequence) {
        this.b.yb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.wf
    public final int l() {
        return this.b.l1.Q();
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean l1() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.mj mjVar = this.b.v5;
        return (mjVar == null || (kjVar = mjVar.b) == null || kjVar.e.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.wf
    public final void l2() {
        an anVar = this.b;
        di.u2 u2Var = anVar.X1;
        if (u2Var != null) {
            u2Var.w1(0, null);
        }
        anVar.xa();
    }

    @Override // org.telegram.ui.Components.wf
    public final void m1() {
        int i7;
        char c10;
        long j3;
        an anVar = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = anVar.j6;
        long b11 = (int) anVar.b();
        LongSparseArray V = b10.a.V(j10, b11);
        if (V != null && V.size() > 0) {
            int size = V.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c10 = 0;
                    break;
                }
                j11 = V.keyAt(i10);
                a2Var = (org.telegram.messenger.a2) V.valueAt(i10);
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
                b10.b.Z(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.e = true;
                    j3 = j12;
                } else {
                    b10.a.a0(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.qs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.qs.L5, objArr);
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
        anVar.q7(true);
    }

    @Override // org.telegram.ui.Components.wf
    public final qm o0() {
        return this.b.B5;
    }

    @Override // org.telegram.ui.Components.wf
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.n0 || anVar.aa() || !TextUtils.isEmpty(anVar.Z.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = anVar.i0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.x xVar = anVar.f0;
        if (xVar != null) {
            xVar.e(0);
        }
        cr crVar = anVar.e0;
        if (crVar != null) {
            crVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final void t() {
        boolean z9;
        an anVar = this.b;
        if (anVar.A0 != null) {
            anVar.c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null) {
            jjVar.getAdapter().f0 = true;
        }
        if (anVar.F5 != null) {
            org.telegram.messenger.g0.i3(new bh(this, 7), 30L);
        }
        if (anVar.Z.s0()) {
            anVar.Z.d1();
            z9 = true;
        } else {
            z9 = false;
        }
        anVar.Z.U0(true, true, z9);
        if (anVar.E5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.E5, true);
            anVar.E5 = 0;
        }
        anVar.cd(0, true);
        anVar.Lc(false);
        anVar.Cd(false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void t1() {
        int i7;
        int i10;
        an anVar = this.b;
        if (anVar.V9() || (i7 = anVar.f4) == 6 || i7 == 8) {
            return;
        }
        org.telegram.messenger.qp messagesController = anVar.getMessagesController();
        long j3 = anVar.j6;
        long j10 = anVar.r4;
        i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        messagesController.C4(0, i10, j3, j10, null);
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean v0() {
        int i7;
        an anVar = this.b;
        if ((anVar.getMessagesController().t2(anVar.a()) && !anVar.v4) || (i7 = anVar.f4) == 9 || anVar.g4 <= 0) {
            return false;
        }
        if (i7 != 0) {
            return i7 == 3 && anVar.c9() == anVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wf
    public final void w(float f10) {
        an anVar = this.b;
        if (f10 != 0.0f) {
            anVar.P4 = true;
        }
        anVar.K9();
        anVar.M9();
        anVar.rd(false, false);
        anVar.l1.invalidate();
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar == null || anVar.Ac == null) {
            return;
        }
        ccVar.l();
    }

    @Override // org.telegram.ui.Components.wf
    public final void w0() {
        an anVar = this.b;
        anVar.H9 = true;
        jl jlVar = anVar.C0;
        if (jlVar != null) {
            jlVar.K(true);
        }
    }
}
