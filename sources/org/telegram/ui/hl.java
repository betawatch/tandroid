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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hl implements org.telegram.ui.Components.uf {
    public int a;
    public final /* synthetic */ wm b;

    public hl(wm wmVar) {
        this.b = wmVar;
    }

    @Override // org.telegram.ui.Components.uf
    public final void A(boolean z10) {
        int i3;
        int i10;
        wm wmVar = this.b;
        if (!z10) {
            Activity parentActivity = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i3);
        } else {
            Activity parentActivity2 = wmVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity2, i10);
            wmVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void E() {
        this.b.yc(true, false);
    }

    @Override // org.telegram.ui.Components.uf
    public final void F() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.s1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void F0() {
        this.b.Ja(0, false);
    }

    @Override // org.telegram.ui.Components.uf
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        kg.a1 a1Var;
        org.telegram.messenger.zi ziVar;
        int i11;
        long c2;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        TLRPC.Message message;
        org.telegram.messenger.bj bjVar2;
        wm wmVar = this.b;
        ArrayList arrayList = wmVar.L6;
        if (wmVar.B0 != null) {
            wmVar.d0 = wmVar.a0.getBackgroundTop();
        }
        fj fjVar = wmVar.X1;
        if (fjVar != null && fjVar.getAdapter() != null) {
            wmVar.X1.getAdapter().x.a(charSequence);
        }
        if (i3 != 0) {
            if (wmVar.h4 == -1) {
                wmVar.h4 = 0;
            }
            if (charSequence != null) {
                wmVar.h4++;
            }
            org.telegram.messenger.dj djVar2 = wmVar.w5;
            if (djVar2 != null && (bjVar2 = djVar2.b) != null && !bjVar2.e.isEmpty()) {
                wmVar.h4 += wmVar.w5.b.e.size();
            }
            wmVar.id(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (djVar = wmVar.w5) != null && (bjVar = djVar.b) != null && !bjVar.e.isEmpty() && wmVar.w5.d == null && j10 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            wmVar.w5.b.b(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer z12 = wmVar.getMessagesController().z1(wmVar.k6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i12);
                if (ziVar2 != null && (message = ziVar2.k) != null && !org.telegram.messenger.zi.w5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.hint_swipe_reply, org.telegram.messenger.bd.M0(2131744316, null), org.telegram.messenger.bd.M0(2131744315, null));
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.xb) I.e).a;
                fh0Var.setScaleX(1.8f);
                fh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(wmVar.e) && !wmVar.w4 && (ziVar = wmVar.E5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ziVar.h1;
            if (tL_forumTopic != null) {
                c2 = tL_forumTopic.id;
            } else {
                i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                c2 = org.telegram.messenger.zi.c2(i11, wmVar.E5.k, true, false);
            }
            long j11 = c2;
            if (j11 != 0) {
                wmVar.getMediaDataController().D(wmVar.k6, j11, false);
            }
        }
        wmVar.bc(false, null, null, null, null, z10, i3, null, false, j10, null, true);
        mj mjVar = wmVar.a0;
        if (mjVar != null && mjVar.getEmojiView() != null && (a1Var = wmVar.a0.getEmojiView().U0) != null) {
            if (a1Var.e) {
                org.telegram.messenger.hp.s1(a1Var.a).C4(2, 0, a1Var.b, a1Var.c, null);
            }
            a1Var.f = -1L;
        }
        if (wmVar.getMessagesController().D3() || wmVar.getMessagesController().s4 > 0) {
            return;
        }
        if ((wmVar.getMessagesController().i7 >= 2) || wmVar.getUserConfig().q() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i13);
            if (ziVar3 != null && !ziVar3.Q3() && ((org.telegram.messenger.zi.S4(ziVar3.k) || ziVar3.i4()) && ziVar3.k.media_unread)) {
                org.telegram.ui.Components.m11.r(ziVar3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void I0() {
        wm wmVar = this.b;
        org.telegram.messenger.yy sendMessagesHelper = wmVar.getSendMessagesHelper();
        long j10 = wmVar.k6;
        SparseArray sparseArray = sendMessagesHelper.e;
        SparseArray sparseArray2 = sendMessagesHelper.c;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= sparseArray2.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message = (TLRPC.Message) sparseArray.valueAt(i11);
                    if (message.dialog_id == j10) {
                        i3 = message.id;
                        break;
                    }
                    i11++;
                }
            } else {
                TLRPC.Message message2 = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message2.dialog_id == j10) {
                    i3 = message2.id;
                    break;
                }
                i10++;
            }
        }
        int i12 = i3;
        if (i12 != 0) {
            this.b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final TLRPC.TL_channels_sendAsPeers M() {
        return this.b.Ba;
    }

    @Override // org.telegram.ui.Components.uf
    public final void M0(int i3) {
        int i10 = i3 == 0 ? 8 : 0;
        wm wmVar = this.b;
        if (wmVar.r3.getVisibility() != i10) {
            wmVar.r3.setVisibility(i10);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void O(float f10, int i3) {
        org.telegram.ui.Components.p40 p40Var = this.b.q3;
        if (p40Var != null) {
            p40Var.b(f10, i3);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final int O0() {
        return this.b.m1.getHeight();
    }

    @Override // org.telegram.ui.Components.uf
    public final void O1() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.s1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TL_stories.StoryItem R0() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ boolean T0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.uf
    public final void T1(int i3) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        wm wmVar = this.b;
        if (i3 < currentActionBarHeight) {
            wmVar.q5 = false;
            if (wmVar.s1.getVisibility() == 0) {
                wmVar.s1.setVisibility(4);
            }
        } else {
            wmVar.q5 = true;
            if (wmVar.s1.getVisibility() == 4 && !wmVar.isInPreviewMode()) {
                wmVar.s1.setVisibility(0);
            }
        }
        wmVar.r5 = true ^ wmVar.a0.r0();
        int i10 = i3 + (wmVar.a0.r0() ? 65536 : 0);
        if (this.a != i10) {
            wmVar.d0 = 0;
        }
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean V0() {
        org.telegram.ui.Components.p40 p40Var = this.b.q3;
        return p40Var != null && p40Var.e();
    }

    @Override // org.telegram.ui.Components.uf
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        gi.l3 l3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        wm wmVar = this.b;
        B.N = !isEmpty || wmVar.a0.p0();
        fj fjVar = wmVar.X1;
        if (fjVar == null || fjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            wmVar.X1.getAdapter().U(charSequence2, wmVar.a0.getCursorPosition(), wmVar.L6, false, false);
        }
        l9.u uVar = wmVar.a6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            wmVar.a6 = null;
        }
        TLRPC.Chat chat = wmVar.e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            mj mjVar = wmVar.a0;
            if (mjVar.Z2 && (!mjVar.p0() || !wmVar.a0.b2)) {
                if (z10) {
                    wmVar.yb(charSequence2, true);
                } else {
                    wmVar.a7(charSequence2);
                    l9.u uVar2 = new l9.u(this, charSequence2, false, 26);
                    wmVar.a6 = uVar2;
                    org.telegram.messenger.g0.i3(uVar2, org.telegram.messenger.g0.S == null ? 3000L : 1000L);
                }
            }
        }
        vj vjVar = wmVar.Ra;
        if (vjVar != null) {
            ArrayList arrayList = vjVar.G;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((ex) arrayList.get(i3)).n = true;
            }
        }
        dh.j0 j0Var = dh.j0.B;
        if (j0Var != null) {
            j0Var.l = true;
        }
        dh.j0 j0Var2 = dh.j0.C;
        if (j0Var2 != null) {
            j0Var2.l = true;
        }
        if (z11) {
            return;
        }
        gi.l3 l3Var2 = wmVar.v2;
        if ((l3Var2 != null && l3Var2.W) || ((l3Var = wmVar.x2) != null && l3Var.W)) {
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            gi.l3 l3Var3 = wmVar.x2;
            if (l3Var3 != null) {
                l3Var3.f(true);
                return;
            }
            return;
        }
        tf tfVar = wmVar.ib;
        if (org.telegram.messenger.l10.B(wmVar.f) || ((chatFull = wmVar.q8) != null && chatFull.slowmode_next_send_date > 0 && wmVar.g4 == 0)) {
            z12 = true;
        }
        if (wmVar.y2 || wmVar.w2 || z12 || org.telegram.messenger.az.M >= 3 || wmVar.a0.p0()) {
            return;
        }
        org.telegram.messenger.g0.r(tfVar);
        org.telegram.messenger.g0.i3(tfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.uf
    public final void Z0() {
        org.telegram.ui.Components.p40 p40Var = this.b.q3;
        if (p40Var != null) {
            p40Var.j();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void a0() {
        wm wmVar = this.b;
        mj mjVar = wmVar.a0;
        boolean z10 = mjVar.A3;
        org.telegram.ui.Components.kf kfVar = mjVar.V0;
        boolean z11 = false;
        boolean z12 = kfVar != null && kfVar.getCurrentPage() == 0;
        qe.a aVar = wmVar.cd;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean a1() {
        wm wmVar = this.b;
        TLRPC.User user = wmVar.f;
        return (user == null || org.telegram.messenger.l10.B(user) || wmVar.f.bot || wmVar.h != null || wmVar.g4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.uf
    public final void b1() {
        int i3;
        wm wmVar = this.b;
        Activity parentActivity = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        long j10 = wmVar.k6;
        org.telegram.messenger.ej ejVar = wmVar.x5;
        if (ejVar == null) {
            ejVar = org.telegram.messenger.ej.a();
        }
        new ci.x0(parentActivity, i3, j10, ejVar, wmVar, wmVar.getResourceProvider(), 0, new le(wmVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.uf
    public final void b2() {
        int indexOfChild;
        wm wmVar = this.b;
        if (wmVar.getParentActivity() != null) {
            if ((wmVar.e == null && wmVar.r8 == null) || wmVar.fragmentView == null) {
                return;
            }
            gi.l3 l3Var = wmVar.u2;
            if ((l3Var == null || !l3Var.W) && (indexOfChild = wmVar.m1.indexOfChild(wmVar.U)) != -1) {
                try {
                    wmVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (wmVar.u2 == null) {
                    wmVar.u2 = wmVar.D6(310.0f, 3, indexOfChild + 1, false);
                }
                TLRPC.UserFull userFull = wmVar.r8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    wmVar.u2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, wmVar.a0.d1 ? 2131743604 : 2131743530, wmVar.f.first_name)));
                } else if (org.telegram.messenger.t3.v(wmVar.e) || org.telegram.messenger.t3.s(wmVar.e)) {
                    if (org.telegram.messenger.t3.P(20, wmVar.e)) {
                        wmVar.u2.u(org.telegram.messenger.bd.M0(2131749545, null));
                    } else if (org.telegram.messenger.t3.P(21, wmVar.e)) {
                        wmVar.u2.u(org.telegram.messenger.bd.M0(2131749548, null));
                    } else if (org.telegram.messenger.t3.P(7, wmVar.e)) {
                        wmVar.u2.u(org.telegram.messenger.bd.M0(2131749551, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wmVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                            wmVar.u2.u(org.telegram.messenger.bd.M0(2131753955, null));
                        } else {
                            wmVar.u2.u(org.telegram.messenger.bd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.bd.v(wmVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (wmVar.Y6()) {
                        return;
                    }
                    if (wmVar.a0.d1) {
                        wmVar.u2.u(org.telegram.messenger.t3.L(21, wmVar.e));
                    } else {
                        wmVar.u2.u(org.telegram.messenger.t3.L(20, wmVar.e));
                    }
                }
                View sendButton = wmVar.a0.getSendButton();
                View audioVideoButtonContainer = wmVar.a0.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                wmVar.u2.y(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void c0(boolean z10) {
        this.b.yc(false, z10);
    }

    @Override // org.telegram.ui.Components.uf
    public final void c2(boolean z10) {
        wm wmVar = this.b;
        View view = wmVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        wmVar.s5 = !z10;
    }

    @Override // org.telegram.ui.Components.uf
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        wm wmVar = this.b;
        if (wmVar.q3 == null && CameraView.isCameraAllowed() && wmVar.getParentActivity() != null) {
            Activity parentActivity = wmVar.getParentActivity();
            um umVar = wmVar.ya;
            org.telegram.ui.Components.p40 j40Var = org.telegram.ui.Components.p40.d(org.telegram.messenger.h10.t0) ? new org.telegram.ui.Components.j40(parentActivity, wmVar, umVar) : new org.telegram.ui.Components.k40(parentActivity, wmVar, umVar, true);
            wmVar.q3 = j40Var;
            j40Var.setAnimationCallback(new de(wmVar, 0));
            wmVar.q3.setTrimCallback(new de(wmVar, 1));
            wmVar.q3.setRecordingUiFrameCallback(new si(wmVar));
            wmVar.q3.setClipToPadding(false);
            wmVar.q3.h(wmVar.L, wmVar.x);
            int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
            if (indexOfChild < 0) {
                indexOfChild = wmVar.m1.getChildCount();
            }
            wmVar.m1.addView(wmVar.q3, Math.min(indexOfChild + 1, wmVar.m1.getChildCount()), b8.mf.e(-1, -1, 51));
        }
        org.telegram.ui.Components.p40 p40Var = wmVar.q3;
        if (p40Var != null) {
            if (i3 == 0) {
                p40Var.i(false);
                wmVar.A0.C0();
                wmVar.D0.T();
            } else if (i3 == 1 || i3 == 3 || i3 == 4) {
                p40Var.g(i3, i10, i11, j10, j11, z10);
            } else if (i3 == 2 || i3 == 5) {
                p40Var.a(i3 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void e() {
        this.b.Zc();
    }

    @Override // org.telegram.ui.Components.uf
    public final void e1() {
        this.b.V6();
    }

    @Override // org.telegram.ui.Components.uf
    public final void f() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.s1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void g0() {
        org.telegram.ui.Components.ow0 ow0Var = this.b.s1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void g1() {
        int i3;
        int i10;
        wm wmVar = this.b;
        wmVar.k7();
        mj mjVar = wmVar.a0;
        boolean z10 = mjVar.A3;
        org.telegram.ui.Components.kf kfVar = mjVar.V0;
        wmVar.cd.a(z10 && !(kfVar != null && kfVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = wmVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
            if (acVar != null && acVar.l) {
                acVar.b();
            }
        } else {
            Activity parentActivity2 = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i3);
        }
        fj fjVar = wmVar.X1;
        float f10 = 0.0f;
        if (fjVar != null) {
            fjVar.animate().alpha((z10 || wmVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.xq.f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = wmVar.s1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate = wmVar.s1.animate();
            if (!z10 && !wmVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f).withEndAction(new ci.e1(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void g2() {
        wm wmVar = this.b;
        gi.l3 l3Var = wmVar.v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = wmVar.x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void h1(View view, CharSequence charSequence, boolean z10) {
        wm wmVar = this.b;
        wmVar.vc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.j0;
        if (q0Var == null || q0Var.getVisibility() == 0) {
            return;
        }
        wmVar.j0.setVisibility(0);
        org.telegram.ui.ActionBar.w wVar = wmVar.g0;
        if (wVar != null) {
            wVar.e(8);
        }
        ar arVar = wmVar.f0;
        if (arVar != null) {
            arVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final mm i0() {
        return this.b.C5;
    }

    @Override // org.telegram.ui.Components.uf
    public final void j1(CharSequence charSequence) {
        this.b.yb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean k() {
        return this.b.Y6();
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean k1() {
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.dj djVar = this.b.w5;
        return (djVar == null || (bjVar = djVar.b) == null || bjVar.e.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.uf
    public final void m1() {
        int i3;
        char c2;
        long j10;
        wm wmVar = this.b;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i3);
        long j11 = wmVar.k6;
        long b11 = (int) wmVar.b();
        LongSparseArray U = b10.a.U(j11, b11);
        if (U != null && U.size() > 0) {
            int size = U.size();
            org.telegram.messenger.a2 a2Var = null;
            long j12 = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    c2 = 0;
                    break;
                }
                j12 = U.keyAt(i10);
                a2Var = (org.telegram.messenger.a2) U.valueAt(i10);
                c2 = 0;
                if (!a2Var.e) {
                    break;
                } else {
                    i10++;
                }
            }
            org.telegram.messenger.a2 a2Var2 = a2Var;
            long j13 = j12;
            if (a2Var2 != null && !a2Var2.e) {
                Runnable runnable = a2Var2.f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.b.Y(j11, b11, j13, new Object());
                if (a2Var2.d) {
                    a2Var2.e = true;
                    j10 = j13;
                } else {
                    b10.a.b0(j11, b11, j13);
                    j10 = j13;
                    org.telegram.messenger.hs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j11, a2Var2.b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c2] = b2Var;
                    notificationCenter.k(org.telegram.messenger.hs.L5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j10;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().j1(j11);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (b11 != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) b11;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new kh.b(1));
            }
        }
        wmVar.q7(true);
    }

    @Override // org.telegram.ui.Components.uf
    public final void n2() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.o0) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.j0;
        if (q0Var != null) {
            q0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.w wVar = wmVar.g0;
        if (wVar != null) {
            wVar.e(8);
        }
        ar arVar = wmVar.f0;
        if (arVar != null) {
            arVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final int o() {
        return this.b.m1.Q();
    }

    @Override // org.telegram.ui.Components.uf
    public final void q0() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.b;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.o0 || wmVar.aa() || !TextUtils.isEmpty(wmVar.a0.getSlowModeTimer())) {
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.j0;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        org.telegram.ui.ActionBar.w wVar = wmVar.g0;
        if (wVar != null) {
            wVar.e(0);
        }
        ar arVar = wmVar.f0;
        if (arVar != null) {
            arVar.b(true);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void r2() {
        wm wmVar = this.b;
        ei.x2 x2Var = wmVar.Y1;
        if (x2Var != null) {
            x2Var.w1(0, null);
        }
        wmVar.xa();
    }

    @Override // org.telegram.ui.Components.uf
    public final void s1() {
        int i3;
        int i10;
        wm wmVar = this.b;
        if (wmVar.V9() || (i3 = wmVar.g4) == 6 || i3 == 8) {
            return;
        }
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j10 = wmVar.k6;
        long j11 = wmVar.s4;
        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        messagesController.C4(0, i10, j10, j11, null);
    }

    @Override // org.telegram.ui.Components.uf
    public final /* synthetic */ TLRPC.Peer t() {
        return null;
    }

    @Override // org.telegram.ui.Components.uf
    public final void u() {
        boolean z10;
        wm wmVar = this.b;
        if (wmVar.B0 != null) {
            wmVar.d0 = wmVar.a0.getBackgroundTop();
        }
        fj fjVar = wmVar.X1;
        if (fjVar != null) {
            fjVar.getAdapter().g0 = true;
        }
        if (wmVar.G5 != null) {
            org.telegram.messenger.g0.i3(new xg(this, 7), 30L);
        }
        if (wmVar.a0.r0()) {
            wmVar.a0.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        wmVar.a0.U0(true, true, z10);
        if (wmVar.F5 != 0) {
            wmVar.getConnectionsManager().cancelRequest(wmVar.F5, true);
            wmVar.F5 = 0;
        }
        wmVar.cd(0, true);
        wmVar.Lc(false);
        wmVar.Cd(false);
    }

    @Override // org.telegram.ui.Components.uf
    public final boolean u0() {
        int i3;
        wm wmVar = this.b;
        if ((wmVar.getMessagesController().t2(wmVar.a()) && !wmVar.w4) || (i3 = wmVar.g4) == 9 || wmVar.h4 <= 0) {
            return false;
        }
        if (i3 != 0) {
            return i3 == 3 && wmVar.c9() == wmVar.getUserConfig().e();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.uf
    public final void w0() {
        wm wmVar = this.b;
        wmVar.I9 = true;
        fl flVar = wmVar.D0;
        if (flVar != null) {
            flVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.uf
    public final void x(float f10) {
        wm wmVar = this.b;
        if (f10 != 0.0f) {
            wmVar.Q4 = true;
        }
        wmVar.K9();
        wmVar.M9();
        wmVar.rd(false, false);
        wmVar.m1.invalidate();
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        if (acVar == null || wmVar.Bc == null) {
            return;
        }
        acVar.l();
    }
}
