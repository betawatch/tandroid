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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.ui.Components.sf {
    public int a;
    public final /* synthetic */ un b;

    public hm(un unVar) {
        this.b = unVar;
    }

    @Override // org.telegram.ui.Components.sf
    public final void B(boolean z10) {
        int i10;
        int i11;
        un unVar = this.b;
        if (!z10) {
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity, i10);
        } else {
            Activity parentActivity2 = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.k3(parentActivity2, i11);
            unVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void C() {
        this.b.oc(true, false);
    }

    @Override // org.telegram.ui.Components.sf
    public final void D() {
        org.telegram.ui.Components.sx0 sx0Var = this.b.r1;
        if (sx0Var != null) {
            sx0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        org.telegram.ui.Components.mw mwVar;
        org.telegram.messenger.jj jjVar;
        int i12;
        long c22;
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.lj ljVar;
        TLRPC.Message message;
        org.telegram.messenger.lj ljVar2;
        un unVar = this.b;
        ArrayList arrayList = unVar.K6;
        if (unVar.A0 != null) {
            unVar.c0 = unVar.Z.getBackgroundTop();
        }
        ek ekVar = unVar.W1;
        if (ekVar != null && ekVar.getAdapter() != null) {
            unVar.W1.getAdapter().x.a(charSequence);
        }
        if (i10 != 0) {
            if (unVar.g4 == -1) {
                unVar.g4 = 0;
            }
            if (charSequence != null) {
                unVar.g4++;
            }
            org.telegram.messenger.nj njVar2 = unVar.v5;
            if (njVar2 != null && (ljVar2 = njVar2.b) != null && !ljVar2.e.isEmpty()) {
                unVar.g4 += unVar.v5.b.e.size();
            }
            unVar.Yc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (njVar = unVar.v5) != null && (ljVar = njVar.b) != null && !ljVar.e.isEmpty() && unVar.v5.d == null && j10 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            unVar.v5.b.b(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer y12 = unVar.getMessagesController().y1(unVar.j6);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i13);
                if (jjVar2 != null && (message = jjVar2.k) != null && !org.telegram.messenger.jj.v5(message.peer_id, y12)) {
                    z11 = false;
                    break;
                }
                i13++;
            }
            if (z11) {
                org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(unVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.cd.L0(2131744332, null), org.telegram.messenger.cd.L0(2131744331, null));
                org.telegram.ui.Components.ei0 ei0Var = ((org.telegram.ui.Components.tb) I.e).a;
                ei0Var.setScaleX(1.8f);
                ei0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.w3.c0(unVar.e) && !unVar.v4 && (jjVar = unVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = jjVar.h1;
            if (tL_forumTopic != null) {
                c22 = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                c22 = org.telegram.messenger.jj.c2(i12, unVar.D5.k, true, false);
            }
            long j11 = c22;
            if (j11 != 0) {
                unVar.getMediaDataController().D(unVar.j6, j11, false);
            }
        }
        unVar.Rb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        mk mkVar = unVar.Z;
        if (mkVar != null && mkVar.getEmojiView() != null && (mwVar = unVar.Z.getEmojiView().T0) != null) {
            if (mwVar.e) {
                org.telegram.messenger.vp.r1(mwVar.a).z4(2, 0, mwVar.b, mwVar.c, null);
            }
            mwVar.f = -1L;
        }
        if (unVar.getMessagesController().A3() || unVar.getMessagesController().t4 > 0) {
            return;
        }
        if ((unVar.getMessagesController().j7 >= 2) || unVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(i14);
            if (jjVar3 != null && !jjVar3.P3() && ((org.telegram.messenger.jj.R4(jjVar3.k) || jjVar3.h4()) && jjVar3.k.media_unread)) {
                org.telegram.ui.Components.u21.r(jjVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final TLRPC.TL_channels_sendAsPeers F() {
        return this.b.Aa;
    }

    @Override // org.telegram.ui.Components.sf
    public final void G0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        un unVar = this.b;
        if (unVar.q3.getVisibility() != i11) {
            unVar.q3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final int H0() {
        return this.b.l1.getHeight();
    }

    @Override // org.telegram.ui.Components.sf
    public final void I(float f7, int i10) {
        org.telegram.ui.Components.j50 j50Var = this.b.p3;
        if (j50Var != null) {
            j50Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void N() {
        un unVar = this.b;
        mk mkVar = unVar.Z;
        boolean z10 = mkVar.z3;
        org.telegram.ui.Components.gf gfVar = mkVar.U0;
        boolean z11 = false;
        boolean z12 = gfVar != null && gfVar.getCurrentPage() == 0;
        fe.b bVar = unVar.Tc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.sf
    public final void O1() {
        org.telegram.ui.Components.sx0 sx0Var = this.b.r1;
        if (sx0Var != null) {
            sx0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final void Q1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(72.0f);
        un unVar = this.b;
        if (i10 < currentActionBarHeight) {
            unVar.p5 = false;
            if (unVar.r1.getVisibility() == 0) {
                unVar.r1.setVisibility(4);
            }
        } else {
            unVar.p5 = true;
            if (unVar.r1.getVisibility() == 4 && !unVar.isInPreviewMode()) {
                unVar.r1.setVisibility(0);
            }
        }
        unVar.q5 = true ^ unVar.Z.q0();
        int i11 = i10 + (unVar.Z.q0() ? 65536 : 0);
        if (this.a != i11) {
            unVar.c0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean T0() {
        org.telegram.ui.Components.j50 j50Var = this.b.p3;
        return j50Var != null && j50Var.e();
    }

    @Override // org.telegram.ui.Components.sf
    public final void T1() {
        km kmVar;
        int indexOfChild;
        un unVar = this.b;
        if (unVar.getParentActivity() != null) {
            if ((unVar.e == null && unVar.q8 == null) || unVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.q30 q30Var = unVar.t2;
            if ((q30Var == null || q30Var.getVisibility() != 0) && (indexOfChild = (kmVar = unVar.l1).indexOfChild(unVar.T)) != -1) {
                try {
                    unVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (unVar.t2 == null) {
                    org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(9, unVar.getParentActivity(), unVar.xa, false);
                    unVar.t2 = q30Var2;
                    q30Var2.setVisibility(8);
                    kmVar.addView(unVar.t2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = unVar.q8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    unVar.t2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, unVar.Z.c1 ? 2131743620 : 2131743546, unVar.f.first_name)));
                } else if (org.telegram.messenger.w3.v(unVar.e) || org.telegram.messenger.w3.s(unVar.e)) {
                    if (org.telegram.messenger.w3.P(20, unVar.e)) {
                        unVar.t2.setText(org.telegram.messenger.cd.L0(2131749546, null));
                    } else if (org.telegram.messenger.w3.P(21, unVar.e)) {
                        unVar.t2.setText(org.telegram.messenger.cd.L0(2131749549, null));
                    } else if (org.telegram.messenger.w3.P(7, unVar.e)) {
                        unVar.t2.setText(org.telegram.messenger.cd.L0(2131749552, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = unVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.i0.D1(tL_chatBannedRights)) {
                            unVar.t2.setText(org.telegram.messenger.cd.L0(2131753955, null));
                        } else {
                            unVar.t2.setText(org.telegram.messenger.cd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.cd.v(unVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (unVar.S6()) {
                        return;
                    }
                    if (unVar.Z.c1) {
                        unVar.t2.setText(org.telegram.messenger.w3.L(21, unVar.e));
                    } else {
                        unVar.t2.setText(org.telegram.messenger.w3.L(20, unVar.e));
                    }
                }
                View sendButton = unVar.Z.getSendButton();
                View audioVideoButtonContainer = unVar.Z.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                unVar.t2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void U1(boolean z10) {
        un unVar = this.b;
        View view = unVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        unVar.r5 = !z10;
    }

    @Override // org.telegram.ui.Components.sf
    public final void V(boolean z10) {
        this.b.oc(false, z10);
    }

    @Override // org.telegram.ui.Components.sf
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.q30 q30Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        un unVar = this.b;
        B.M = !isEmpty || unVar.Z.o0();
        ek ekVar = unVar.W1;
        if (ekVar == null || ekVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            unVar.W1.getAdapter().U(charSequence2, unVar.Z.getCursorPosition(), unVar.K6, false, false);
        }
        j9.u uVar = unVar.Z5;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
            unVar.Z5 = null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || org.telegram.messenger.w3.m(chat)) {
            mk mkVar = unVar.Z;
            if (mkVar.Y2 && (!mkVar.o0() || !unVar.Z.a2)) {
                if (z10) {
                    unVar.ob(charSequence2, true);
                } else {
                    unVar.U6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 25);
                    unVar.Z5 = uVar2;
                    org.telegram.messenger.i0.h3(uVar2, org.telegram.messenger.i0.S == null ? 3000L : 1000L);
                }
            }
        }
        vk vkVar = unVar.Qa;
        if (vkVar != null) {
            ArrayList arrayList = vkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ky) arrayList.get(i10)).n = true;
            }
        }
        sg.k0 k0Var = sg.k0.B;
        if (k0Var != null) {
            k0Var.l = true;
        }
        sg.k0 k0Var2 = sg.k0.C;
        if (k0Var2 != null) {
            k0Var2.l = true;
        }
        if (z11) {
            return;
        }
        ij ijVar = unVar.u2;
        if ((ijVar != null && ijVar.getVisibility() == 0) || ((q30Var = unVar.w2) != null && q30Var.getVisibility() == 0)) {
            ij ijVar2 = unVar.u2;
            if (ijVar2 != null) {
                ijVar2.b(true);
            }
            org.telegram.ui.Components.q30 q30Var2 = unVar.w2;
            if (q30Var2 != null) {
                q30Var2.b(true);
                return;
            }
            return;
        }
        lg lgVar = unVar.hb;
        if (org.telegram.messenger.h20.B(unVar.f) || ((chatFull = unVar.p8) != null && chatFull.slowmode_next_send_date > 0 && unVar.f4 == 0)) {
            z12 = true;
        }
        if (unVar.x2 || unVar.v2 || z12 || org.telegram.messenger.tz.M >= 3 || unVar.Z.o0()) {
            return;
        }
        org.telegram.messenger.i0.r(lgVar);
        org.telegram.messenger.i0.h3(lgVar, 4000L);
    }

    @Override // org.telegram.ui.Components.sf
    public final void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        un unVar = this.b;
        if (unVar.p3 == null && CameraView.isCameraAllowed() && unVar.getParentActivity() != null) {
            Activity parentActivity = unVar.getParentActivity();
            sn snVar = unVar.xa;
            org.telegram.ui.Components.j50 d50Var = org.telegram.ui.Components.j50.d(org.telegram.messenger.d20.s0) ? new org.telegram.ui.Components.d50(parentActivity, unVar, snVar) : new org.telegram.ui.Components.e50(parentActivity, unVar, snVar, true);
            unVar.p3 = d50Var;
            d50Var.setAnimationCallback(new re(unVar, 0));
            unVar.p3.setTrimCallback(new re(unVar, 1));
            unVar.p3.setRecordingUiFrameCallback(new rj(unVar));
            unVar.p3.setClipToPadding(false);
            unVar.p3.h(unVar.K, unVar.x);
            int indexOfChild = unVar.l1.indexOfChild(unVar.T);
            if (indexOfChild < 0) {
                indexOfChild = unVar.l1.getChildCount();
            }
            unVar.l1.addView(unVar.p3, Math.min(indexOfChild + 1, unVar.l1.getChildCount()), w7.b6.e(-1, -1, 51));
        }
        org.telegram.ui.Components.j50 j50Var = unVar.p3;
        if (j50Var != null) {
            if (i10 == 0) {
                j50Var.i(false);
                unVar.z0.C0();
                unVar.C0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                j50Var.g(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                j50Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void X() {
        org.telegram.ui.Components.sx0 sx0Var = this.b.r1;
        if (sx0Var != null) {
            sx0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void X0() {
        org.telegram.ui.Components.j50 j50Var = this.b.p3;
        if (j50Var != null) {
            j50Var.j();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean Y0() {
        un unVar = this.b;
        TLRPC.User user = unVar.f;
        return (user == null || org.telegram.messenger.h20.B(user) || unVar.f.bot || unVar.h != null || unVar.f4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.sf
    public final void Y1() {
        un unVar = this.b;
        ij ijVar = unVar.u2;
        if (ijVar != null) {
            ijVar.b(true);
        }
        org.telegram.ui.Components.q30 q30Var = unVar.w2;
        if (q30Var != null) {
            q30Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void a1() {
        int i10;
        un unVar = this.b;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        long j10 = unVar.j6;
        org.telegram.messenger.oj ojVar = unVar.w5;
        if (ojVar == null) {
            ojVar = org.telegram.messenger.oj.a();
        }
        new rh.e0(parentActivity, i10, j10, ojVar, unVar, unVar.getResourceProvider(), 0, new ze(unVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.sf
    public final kn b0() {
        return this.b.B5;
    }

    @Override // org.telegram.ui.Components.sf
    public final void b1() {
        this.b.P6();
    }

    @Override // org.telegram.ui.Components.sf
    public final void d1() {
        int i10;
        int i11;
        un unVar = this.b;
        unVar.e7();
        mk mkVar = unVar.Z;
        boolean z10 = mkVar.z3;
        org.telegram.ui.Components.gf gfVar = mkVar.U0;
        unVar.Tc.a(z10 && !(gfVar != null && gfVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.k3(parentActivity, i11);
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
            if (wbVar != null && wbVar.l) {
                wbVar.b();
            }
        } else {
            Activity parentActivity2 = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity2, i10);
        }
        ek ekVar = unVar.W1;
        float f7 = 0.0f;
        if (ekVar != null) {
            ekVar.animate().alpha((z10 || unVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.gr.f).start();
        }
        org.telegram.ui.Components.sx0 sx0Var = unVar.r1;
        if (sx0Var != null) {
            sx0Var.setVisibility(0);
            ViewPropertyAnimator animate = unVar.r1.animate();
            if (!z10 && !unVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.gr.f).withEndAction(new k2.v(10, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void d2() {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.b;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.t0 t0Var = unVar.i0;
        if (t0Var != null) {
            t0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = unVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        cs csVar = unVar.e0;
        if (csVar != null) {
            csVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void e() {
        this.b.Pc();
    }

    @Override // org.telegram.ui.Components.sf
    public final void e1(View view, CharSequence charSequence, boolean z10) {
        un unVar = this.b;
        unVar.lc(view, charSequence, z10);
        org.telegram.ui.ActionBar.t0 t0Var = unVar.i0;
        if (t0Var == null || t0Var.getVisibility() == 0) {
            return;
        }
        unVar.i0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = unVar.f0;
        if (xVar != null) {
            xVar.e(8);
        }
        cs csVar = unVar.e0;
        if (csVar != null) {
            csVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void g1(CharSequence charSequence) {
        this.b.ob(charSequence, true);
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean h1() {
        org.telegram.messenger.lj ljVar;
        org.telegram.messenger.nj njVar = this.b.v5;
        return (njVar == null || (ljVar = njVar.b) == null || ljVar.e.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.sf
    public final void h2() {
        un unVar = this.b;
        ag.v vVar = unVar.X1;
        if (vVar != null) {
            vVar.v1(0, null);
        }
        unVar.na();
    }

    @Override // org.telegram.ui.Components.sf
    public final void i1() {
        int i10;
        long j10;
        long j11;
        un unVar = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        org.telegram.messenger.j2 b10 = org.telegram.messenger.j2.b(i10);
        long j12 = unVar.j6;
        long b11 = (int) unVar.b();
        LongSparseArray s10 = b10.a.s(j12, b11);
        if (s10 != null && s10.size() > 0) {
            int size = s10.size();
            org.telegram.messenger.e2 e2Var = null;
            int i11 = 0;
            long j13 = 0;
            while (true) {
                if (i11 >= size) {
                    j10 = 0;
                    break;
                }
                j13 = s10.keyAt(i11);
                e2Var = (org.telegram.messenger.e2) s10.valueAt(i11);
                j10 = 0;
                if (!e2Var.e) {
                    break;
                } else {
                    i11++;
                }
            }
            org.telegram.messenger.e2 e2Var2 = e2Var;
            long j14 = j13;
            if (e2Var2 != null && !e2Var2.e) {
                Runnable runnable = e2Var2.f;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                }
                b10.b.O(j12, b11, j14, new Object());
                if (e2Var2.d) {
                    e2Var2.e = true;
                    j11 = j14;
                } else {
                    b10.a.P(j12, b11, j14);
                    j11 = j14;
                    org.telegram.messenger.zs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.f2 f2Var = new org.telegram.messenger.f2(j12, e2Var2.b, b11);
                    b11 = b11;
                    notificationCenter.k(org.telegram.messenger.zs.L5, f2Var);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j11;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().i1(j12);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (b11 != j10) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) b11;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new org.telegram.messenger.z1(0));
            }
        }
        unVar.k7(true);
    }

    @Override // org.telegram.ui.Components.sf
    public final void j0() {
        org.telegram.ui.ActionBar.l lVar;
        un unVar = this.b;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.n0 || unVar.Q9() || !TextUtils.isEmpty(unVar.Z.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.t0 t0Var = unVar.i0;
        if (t0Var != null) {
            t0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.x xVar = unVar.f0;
        if (xVar != null) {
            xVar.e(0);
        }
        cs csVar = unVar.e0;
        if (csVar != null) {
            csVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void k() {
        org.telegram.ui.Components.sx0 sx0Var = this.b.r1;
        if (sx0Var != null) {
            sx0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean k0() {
        int i10;
        un unVar = this.b;
        if ((unVar.getMessagesController().s2(unVar.a()) && !unVar.v4) || (i10 = unVar.f4) == 9 || unVar.g4 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && unVar.V8() == unVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sf
    public final boolean m() {
        return this.b.S6();
    }

    @Override // org.telegram.ui.Components.sf
    public final void n0() {
        un unVar = this.b;
        unVar.H9 = true;
        fm fmVar = unVar.C0;
        if (fmVar != null) {
            fmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void o1() {
        int i10;
        int i11;
        un unVar = this.b;
        if (unVar.L9() || (i10 = unVar.f4) == 6 || i10 == 8) {
            return;
        }
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j10 = unVar.j6;
        long j11 = unVar.r4;
        i11 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        messagesController.z4(0, i11, j10, j11, null);
    }

    @Override // org.telegram.ui.Components.sf
    public final void q0() {
        this.b.za(0, false);
    }

    @Override // org.telegram.ui.Components.sf
    public final int r() {
        return this.b.l1.Q();
    }

    @Override // org.telegram.ui.Components.sf
    public final /* synthetic */ TLRPC.Peer u() {
        return null;
    }

    @Override // org.telegram.ui.Components.sf
    public final void v0() {
        un unVar = this.b;
        org.telegram.messenger.qz sendMessagesHelper = unVar.getSendMessagesHelper();
        long j10 = unVar.j6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= sparseArray2.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message = (TLRPC.Message) sparseArray.valueAt(i12);
                    if (message.dialog_id == j10) {
                        i10 = message.id;
                        break;
                    }
                    i12++;
                }
            } else {
                TLRPC.Message message2 = (TLRPC.Message) sparseArray2.valueAt(i11);
                if (message2.dialog_id == j10) {
                    i10 = message2.id;
                    break;
                }
                i11++;
            }
        }
        int i13 = i10;
        if (i13 != 0) {
            this.b.k(i13, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.sf
    public final void w() {
        boolean z10;
        un unVar = this.b;
        if (unVar.A0 != null) {
            unVar.c0 = unVar.Z.getBackgroundTop();
        }
        ek ekVar = unVar.W1;
        if (ekVar != null) {
            ekVar.getAdapter().f0 = true;
        }
        if (unVar.F5 != null) {
            org.telegram.messenger.i0.h3(new rh(this, 8), 30L);
        }
        if (unVar.Z.q0()) {
            unVar.Z.c1();
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.Z.T0(true, true, z10);
        if (unVar.E5 != 0) {
            unVar.getConnectionsManager().cancelRequest(unVar.E5, true);
            unVar.E5 = 0;
        }
        unVar.Sc(0, true);
        unVar.Bc(false);
        unVar.sd(false);
    }

    @Override // org.telegram.ui.Components.sf
    public final void y(float f7) {
        un unVar = this.b;
        if (f7 != 0.0f) {
            unVar.P4 = true;
        }
        unVar.A9();
        unVar.C9();
        unVar.hd(false, false);
        unVar.l1.invalidate();
        org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
        if (wbVar == null || unVar.uc == null) {
            return;
        }
        wbVar.l();
    }
}
