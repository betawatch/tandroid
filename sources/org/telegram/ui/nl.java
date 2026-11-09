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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nl implements org.telegram.ui.Components.wf {
    public int a;
    public final /* synthetic */ cn b;

    public nl(cn cnVar) {
        this.b = cnVar;
    }

    @Override // org.telegram.ui.Components.wf
    public final void B(boolean z9) {
        int i7;
        int i10;
        cn cnVar = this.b;
        if (!z9) {
            Activity parentActivity = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        } else {
            Activity parentActivity2 = cnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity2, i10);
            cnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void C0() {
        this.b.La(0, false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void D() {
        this.b.Bc(true, false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void E() {
        org.telegram.ui.Components.pw0 pw0Var = this.b.r1;
        if (pw0Var != null) {
            pw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        jg.e1 e1Var;
        org.telegram.messenger.ij ijVar;
        int i11;
        long b22;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        TLRPC.Message message;
        org.telegram.messenger.kj kjVar2;
        cn cnVar = this.b;
        ArrayList arrayList = cnVar.K6;
        if (cnVar.A0 != null) {
            cnVar.c0 = cnVar.Z.getBackgroundTop();
        }
        lj ljVar = cnVar.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            cnVar.W1.getAdapter().x.a(charSequence);
        }
        if (i7 != 0) {
            if (cnVar.g4 == -1) {
                cnVar.g4 = 0;
            }
            if (charSequence != null) {
                cnVar.g4++;
            }
            org.telegram.messenger.mj mjVar2 = cnVar.v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.b) != null && !kjVar2.e.isEmpty()) {
                cnVar.g4 += cnVar.v5.b.e.size();
            }
            cnVar.ld(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = cnVar.v5) != null && (kjVar = mjVar.b) != null && !kjVar.e.isEmpty() && cnVar.v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            cnVar.v5.b.b(arrayList2);
            boolean z10 = arrayList2.size() > 0;
            TLRPC.Peer z12 = cnVar.getMessagesController().z1(cnVar.j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.k) != null && !org.telegram.messenger.ij.v5(message.peer_id, z12)) {
                    z10 = false;
                    break;
                }
                i12++;
            }
            if (z10) {
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(cnVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.id.M0(2131744306, null), org.telegram.messenger.id.M0(2131744305, null));
                org.telegram.ui.Components.dh0 dh0Var = ((org.telegram.ui.Components.zb) I.e).a;
                dh0Var.setScaleX(1.8f);
                dh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(cnVar.e) && !cnVar.v4 && (ijVar = cnVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.h1;
            if (tL_forumTopic != null) {
                b22 = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                b22 = org.telegram.messenger.ij.b2(i11, cnVar.D5.k, true, false);
            }
            long j10 = b22;
            if (j10 != 0) {
                cnVar.getMediaDataController().D(cnVar.j6, j10, false);
            }
        }
        cnVar.ec(false, null, null, null, null, z9, i7, null, false, j3);
        sj sjVar = cnVar.Z;
        if (sjVar != null && sjVar.getEmojiView() != null && (e1Var = cnVar.Z.getEmojiView().T0) != null) {
            if (e1Var.e) {
                org.telegram.messenger.qp.s1(e1Var.a).C4(2, 0, e1Var.b, e1Var.c, null);
            }
            e1Var.f = -1L;
        }
        if (cnVar.getMessagesController().D3() || cnVar.getMessagesController().s4 > 0) {
            return;
        }
        if ((cnVar.getMessagesController().i7 >= 2) || cnVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
            if (ijVar3 != null && !ijVar3.P3() && ((org.telegram.messenger.ij.R4(ijVar3.k) || ijVar3.h4()) && ijVar3.k.media_unread)) {
                org.telegram.ui.Components.t11.r(ijVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.b.Ca;
    }

    @Override // org.telegram.ui.Components.wf
    public final void I0() {
        cn cnVar = this.b;
        org.telegram.messenger.gz sendMessagesHelper = cnVar.getSendMessagesHelper();
        long j3 = cnVar.j6;
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
        org.telegram.ui.Components.u40 u40Var = this.b.p3;
        if (u40Var != null) {
            u40Var.b(f10, i7);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void R0(int i7) {
        int i10 = i7 == 0 ? 8 : 0;
        cn cnVar = this.b;
        if (cnVar.q3.getVisibility() != i10) {
            cnVar.q3.setVisibility(i10);
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
        org.telegram.ui.Components.pw0 pw0Var = this.b.r1;
        if (pw0Var != null) {
            pw0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ boolean V0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.wf
    public final void V1(int i7) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        cn cnVar = this.b;
        if (i7 < currentActionBarHeight) {
            cnVar.p5 = false;
            if (cnVar.r1.getVisibility() == 0) {
                cnVar.r1.setVisibility(4);
            }
        } else {
            cnVar.p5 = true;
            if (cnVar.r1.getVisibility() == 4 && !cnVar.isInPreviewMode()) {
                cnVar.r1.setVisibility(0);
            }
        }
        cnVar.q5 = true ^ cnVar.Z.s0();
        int i10 = i7 + (cnVar.Z.s0() ? 65536 : 0);
        if (this.a != i10) {
            cnVar.c0 = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.wf
    public final void W() {
        cn cnVar = this.b;
        sj sjVar = cnVar.Z;
        boolean z9 = sjVar.z3;
        org.telegram.ui.Components.mf mfVar = sjVar.U0;
        boolean z10 = false;
        boolean z11 = mfVar != null && mfVar.getCurrentPage() == 0;
        te.a aVar = cnVar.dd;
        if (z9 && !z11) {
            z10 = true;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean X0() {
        org.telegram.ui.Components.u40 u40Var = this.b.p3;
        return u40Var != null && u40Var.f();
    }

    @Override // org.telegram.ui.Components.wf
    public final void X1() {
        int indexOfChild;
        cn cnVar = this.b;
        if (cnVar.getParentActivity() != null) {
            if ((cnVar.e == null && cnVar.q8 == null) || cnVar.fragmentView == null) {
                return;
            }
            fi.m3 m3Var = cnVar.t2;
            if ((m3Var == null || !m3Var.V) && (indexOfChild = cnVar.l1.indexOfChild(cnVar.T)) != -1) {
                try {
                    cnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (cnVar.t2 == null) {
                    cnVar.t2 = cnVar.E6(310.0f, 3, indexOfChild + 1, false);
                }
                TLRPC.UserFull userFull = cnVar.q8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    cnVar.t2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, cnVar.Z.c1 ? 2131743594 : 2131743520, cnVar.f.first_name)));
                } else if (org.telegram.messenger.t3.v(cnVar.e) || org.telegram.messenger.t3.s(cnVar.e)) {
                    if (org.telegram.messenger.t3.P(20, cnVar.e)) {
                        cnVar.t2.u(org.telegram.messenger.id.M0(2131749537, null));
                    } else if (org.telegram.messenger.t3.P(21, cnVar.e)) {
                        cnVar.t2.u(org.telegram.messenger.id.M0(2131749540, null));
                    } else if (org.telegram.messenger.t3.P(7, cnVar.e)) {
                        cnVar.t2.u(org.telegram.messenger.id.M0(2131749543, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = cnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                            cnVar.t2.u(org.telegram.messenger.id.M0(2131753955, null));
                        } else {
                            cnVar.t2.u(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(cnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (cnVar.Z6()) {
                        return;
                    }
                    if (cnVar.Z.c1) {
                        cnVar.t2.u(org.telegram.messenger.t3.L(21, cnVar.e));
                    } else {
                        cnVar.t2.u(org.telegram.messenger.t3.L(20, cnVar.e));
                    }
                }
                View sendButton = cnVar.Z.getSendButton();
                View audioVideoButtonContainer = cnVar.Z.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                cnVar.t2.y(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y(boolean z9) {
        this.b.Bc(false, z9);
    }

    @Override // org.telegram.ui.Components.wf
    public final void Y1(boolean z9) {
        cn cnVar = this.b;
        View view = cnVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        cnVar.r5 = !z9;
    }

    @Override // org.telegram.ui.Components.wf
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        cn cnVar = this.b;
        if (cnVar.p3 == null && CameraView.isCameraAllowed() && cnVar.getParentActivity() != null) {
            Activity parentActivity = cnVar.getParentActivity();
            an anVar = cnVar.za;
            org.telegram.ui.Components.u40 o40Var = org.telegram.ui.Components.u40.e(org.telegram.messenger.p10.s0) ? new org.telegram.ui.Components.o40(parentActivity, cnVar, anVar) : new org.telegram.ui.Components.p40(parentActivity, cnVar, anVar, true);
            cnVar.p3 = o40Var;
            o40Var.setAnimationCallback(new fe(cnVar, 0));
            cnVar.p3.setTrimCallback(new fe(cnVar, 1));
            cnVar.p3.setRecordingUiFrameCallback(new yi(cnVar));
            cnVar.p3.setClipToPadding(false);
            cnVar.p3.i(cnVar.K, cnVar.x);
            int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
            if (indexOfChild < 0) {
                indexOfChild = cnVar.l1.getChildCount();
            }
            cnVar.l1.addView(cnVar.p3, Math.min(indexOfChild + 1, cnVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.u40 u40Var = cnVar.p3;
        if (u40Var != null) {
            if (i7 == 0) {
                u40Var.j(false);
                cnVar.z0.C0();
                cnVar.C0.T();
            } else if (i7 == 1 || i7 == 3 || i7 == 4) {
                u40Var.h(i7, i10, i11, j3, j10, z9);
            } else if (i7 == 2 || i7 == 5) {
                u40Var.a(i7 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void a() {
        this.b.cd();
    }

    @Override // org.telegram.ui.Components.wf
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        CharSequence charSequence2;
        fi.m3 m3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = false;
        cn cnVar = this.b;
        B.M = !isEmpty || cnVar.Z.q0();
        lj ljVar = cnVar.W1;
        if (ljVar == null || ljVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            cnVar.W1.getAdapter().U(charSequence2, cnVar.Z.getCursorPosition(), cnVar.K6, false, false);
        }
        m9.u uVar = cnVar.Z5;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            cnVar.Z5 = null;
        }
        TLRPC.Chat chat = cnVar.e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            sj sjVar = cnVar.Z;
            if (sjVar.Y2 && (!sjVar.q0() || !cnVar.Z.a2)) {
                if (z9) {
                    cnVar.Bb(charSequence2, true);
                } else {
                    cnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 28);
                    cnVar.Z5 = uVar2;
                    org.telegram.messenger.g0.i3(uVar2, org.telegram.messenger.g0.S == null ? 3000L : 1000L);
                }
            }
        }
        bk bkVar = cnVar.Sa;
        if (bkVar != null) {
            ArrayList arrayList = bkVar.F;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((jx) arrayList.get(i7)).n = true;
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
        fi.m3 m3Var2 = cnVar.u2;
        if ((m3Var2 != null && m3Var2.V) || ((m3Var = cnVar.w2) != null && m3Var.V)) {
            if (m3Var2 != null) {
                m3Var2.f(true);
            }
            fi.m3 m3Var3 = cnVar.w2;
            if (m3Var3 != null) {
                m3Var3.f(true);
                return;
            }
            return;
        }
        xf xfVar = cnVar.jb;
        if (org.telegram.messenger.t10.B(cnVar.f) || ((chatFull = cnVar.p8) != null && chatFull.slowmode_next_send_date > 0 && cnVar.f4 == 0)) {
            z11 = true;
        }
        if (cnVar.x2 || cnVar.v2 || z11 || org.telegram.messenger.iz.M >= 3 || cnVar.Z.q0()) {
            return;
        }
        org.telegram.messenger.g0.r(xfVar);
        org.telegram.messenger.g0.i3(xfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.wf
    public final void b() {
        org.telegram.ui.Components.pw0 pw0Var = this.b.r1;
        if (pw0Var != null) {
            pw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean c() {
        return this.b.Z6();
    }

    @Override // org.telegram.ui.Components.wf
    public final void c1() {
        org.telegram.ui.Components.u40 u40Var = this.b.p3;
        if (u40Var != null) {
            u40Var.k();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean d1() {
        cn cnVar = this.b;
        TLRPC.User user = cnVar.f;
        return (user == null || org.telegram.messenger.t10.B(user) || cnVar.f.bot || cnVar.h != null || cnVar.f4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.wf
    public final void d2() {
        cn cnVar = this.b;
        fi.m3 m3Var = cnVar.u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = cnVar.w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void e1() {
        int i7;
        cn cnVar = this.b;
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        long j3 = cnVar.j6;
        org.telegram.messenger.nj njVar = cnVar.w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, cnVar, cnVar.getResourceProvider(), 0, new ne(cnVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.wf
    public final void f1() {
        this.b.W6();
    }

    @Override // org.telegram.ui.Components.wf
    public final void h1() {
        int i7;
        int i10;
        cn cnVar = this.b;
        cnVar.l7();
        sj sjVar = cnVar.Z;
        boolean z9 = sjVar.z3;
        org.telegram.ui.Components.mf mfVar = sjVar.U0;
        cnVar.dd.a(z9 && !(mfVar != null && mfVar.getCurrentPage() == 0), true);
        if (z9) {
            Activity parentActivity = cnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
            if (ccVar != null && ccVar.l) {
                ccVar.b();
            }
        } else {
            Activity parentActivity2 = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        lj ljVar = cnVar.W1;
        float f10 = 0.0f;
        if (ljVar != null) {
            ljVar.animate().alpha((z9 || cnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        org.telegram.ui.Components.pw0 pw0Var = cnVar.r1;
        if (pw0Var != null) {
            pw0Var.setVisibility(0);
            ViewPropertyAnimator animate = cnVar.r1.animate();
            if (!z9 && !cnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f).withEndAction(new bi.k1(20, this, z9)).start();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void h2() {
        org.telegram.ui.ActionBar.k kVar;
        cn cnVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.i0;
        if (r0Var != null) {
            r0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = cnVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        er erVar = cnVar.e0;
        if (erVar != null) {
            erVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        cn cnVar = this.b;
        cnVar.yc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.i0;
        if (r0Var == null || r0Var.getVisibility() == 0) {
            return;
        }
        cnVar.i0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = cnVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        er erVar = cnVar.e0;
        if (erVar != null) {
            erVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void j0() {
        org.telegram.ui.Components.pw0 pw0Var = this.b.r1;
        if (pw0Var != null) {
            pw0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final void k1(CharSequence charSequence) {
        this.b.Bb(charSequence, true);
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
        cn cnVar = this.b;
        di.u2 u2Var = cnVar.X1;
        if (u2Var != null) {
            u2Var.w1(0, null);
        }
        cnVar.za();
    }

    @Override // org.telegram.ui.Components.wf
    public final void m1() {
        int i7;
        char c10;
        long j3;
        cn cnVar = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = cnVar.j6;
        long b11 = (int) cnVar.b();
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
        cnVar.r7(true);
    }

    @Override // org.telegram.ui.Components.wf
    public final sm o0() {
        return this.b.B5;
    }

    @Override // org.telegram.ui.Components.wf
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        cn cnVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.n0 || cnVar.ba() || !TextUtils.isEmpty(cnVar.Z.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.i0;
        if (r0Var != null) {
            r0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.x xVar = cnVar.f0;
        if (xVar != null) {
            xVar.e(0);
        }
        er erVar = cnVar.e0;
        if (erVar != null) {
            erVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.wf
    public final /* synthetic */ TLRPC.Peer s() {
        return null;
    }

    @Override // org.telegram.ui.Components.wf
    public final void t() {
        boolean z9;
        cn cnVar = this.b;
        if (cnVar.A0 != null) {
            cnVar.c0 = cnVar.Z.getBackgroundTop();
        }
        lj ljVar = cnVar.W1;
        if (ljVar != null) {
            ljVar.getAdapter().f0 = true;
        }
        if (cnVar.F5 != null) {
            org.telegram.messenger.g0.i3(new dh(this, 7), 30L);
        }
        if (cnVar.Z.s0()) {
            cnVar.Z.e1();
            z9 = true;
        } else {
            z9 = false;
        }
        cnVar.Z.V0(true, true, z9);
        if (cnVar.E5 != 0) {
            cnVar.getConnectionsManager().cancelRequest(cnVar.E5, true);
            cnVar.E5 = 0;
        }
        cnVar.fd(0, true);
        cnVar.Oc(false);
        cnVar.Fd(false);
    }

    @Override // org.telegram.ui.Components.wf
    public final void t1() {
        int i7;
        int i10;
        cn cnVar = this.b;
        if (cnVar.W9() || (i7 = cnVar.f4) == 6 || i7 == 8) {
            return;
        }
        org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
        long j3 = cnVar.j6;
        long j10 = cnVar.r4;
        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        messagesController.C4(0, i10, j3, j10, null);
    }

    @Override // org.telegram.ui.Components.wf
    public final boolean v0() {
        int i7;
        cn cnVar = this.b;
        if ((cnVar.getMessagesController().t2(cnVar.a()) && !cnVar.v4) || (i7 = cnVar.f4) == 9 || cnVar.g4 <= 0) {
            return false;
        }
        if (i7 != 0) {
            return i7 == 3 && cnVar.d9() == cnVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wf
    public final void w(float f10) {
        cn cnVar = this.b;
        if (f10 != 0.0f) {
            cnVar.P4 = true;
        }
        cnVar.L9();
        cnVar.N9();
        cnVar.ud(false, false);
        cnVar.l1.invalidate();
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar == null || cnVar.Cc == null) {
            return;
        }
        ccVar.l();
    }

    @Override // org.telegram.ui.Components.wf
    public final void w0() {
        cn cnVar = this.b;
        cnVar.J9 = true;
        ll llVar = cnVar.C0;
        if (llVar != null) {
            llVar.K(true);
        }
    }
}
