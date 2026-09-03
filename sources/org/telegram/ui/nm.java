package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nm implements org.telegram.ui.Components.eg {
    public int a;
    public boolean b;
    public final /* synthetic */ xn c;

    public nm(xn xnVar) {
        this.c = xnVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final void A(boolean z4) {
        int i10;
        int i11;
        xn xnVar = this.c;
        if (!z4) {
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            xnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void B() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        org.telegram.ui.Components.bx bxVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        xn xnVar = this.c;
        ArrayList arrayList = xnVar.r6;
        if (xnVar.v0 != null) {
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
        bk bkVar = xnVar.F1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            xnVar.F1.getAdapter().w.a(charSequence);
        }
        boolean z10 = false;
        if (i10 != 0) {
            if (xnVar.P3 == -1) {
                xnVar.P3 = 0;
            }
            if (charSequence != null) {
                xnVar.P3++;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.c5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                xnVar.P3 += xnVar.c5.forwardMessages.messages.size();
            }
            xnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = xnVar.c5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && xnVar.c5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            xnVar.c5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer peer = xnVar.getMessagesController().getPeer(xnVar.Q5);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    z10 = z11;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i13);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (z10) {
                org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(xnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.kj0 kj0Var = ((org.telegram.ui.Components.fc) M.e).a;
                kj0Var.setScaleX(1.8f);
                kj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(xnVar.e) && !xnVar.e4 && (messageObject = xnVar.k5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, xnVar.k5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                xnVar.getMediaDataController().cleanDraft(xnVar.Q5, j11, false);
            }
        }
        xnVar.zb(false, null, null, null, null, z4, i10, null, false, j10, null, true);
        jk jkVar = xnVar.V;
        if (jkVar != null && jkVar.getEmojiView() != null && (bxVar = xnVar.V.getEmojiView().Q0) != null) {
            if (bxVar.e) {
                MessagesController.getInstance(bxVar.a).sendTyping(bxVar.b, bxVar.c, 2, 0);
            }
            bxVar.f = -1L;
        }
        if (xnVar.getMessagesController().premiumFeaturesBlocked() || xnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || xnVar.getMessagesController().didPressTranscribeButtonEnough() || xnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.d31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void C1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean D1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.c5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final TLRPC.TL_channels_sendAsPeers F() {
        return this.c.ea;
    }

    @Override // org.telegram.ui.Components.eg
    public final void F2() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.k0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = xnVar.f0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = xnVar.b0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        ds dsVar = xnVar.a0;
        if (dsVar != null) {
            dsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(float f10, int i10) {
        dl dlVar = this.c.Y2;
        if (dlVar != null) {
            dlVar.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void G1() {
        int i10;
        xn xnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(xnVar.Q5, (int) xnVar.b());
        xnVar.c7(true);
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean H0() {
        int i10;
        xn xnVar = this.c;
        if ((xnVar.getMessagesController().isForum(xnVar.a()) && !xnVar.e4) || (i10 = xnVar.O3) == 9 || xnVar.P3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        if (xnVar.f0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.qy0 qy0Var = xnVar.a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = xnVar.f0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (xnVar.f0.l != 0) {
                    if (!(xnVar.O3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) && (xnVar.O3 != 0 || (!(xnVar.a4 == 0 || xnVar.e4) || UserObject.isReplyUser(xnVar.f) || xnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f);
                        ofFloat.addListener(new mm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.lm
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    } else {
                        xnVar.f0.f(0);
                        xn.J3(xnVar);
                        org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = xnVar.b0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        ds dsVar = xnVar.a0;
                        if (dsVar != null) {
                            dsVar.b(false);
                        }
                    }
                }
            }
            xnVar.x4 = i10;
            xnVar.y4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = xnVar.f0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(xnVar.O3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) && (xnVar.O3 != 0 || (!(xnVar.a4 == 0 || xnVar.e4) || UserObject.isReplyUser(xnVar.f) || xnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.pr.f);
                    ofFloat2.addListener(new mm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.lm
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat2.start();
                    return;
                }
                xnVar.f0.f(8);
                if (xnVar.V.k0() && TextUtils.isEmpty(xnVar.V.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.e0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = xnVar.b0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    ds dsVar2 = xnVar.a0;
                    if (dsVar2 != null) {
                        dsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.e0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = xnVar.b0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                ds dsVar3 = xnVar.a0;
                if (dsVar3 != null) {
                    dsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void J2() {
        xn xnVar = this.c;
        oh.u2 u2Var = xnVar.G1;
        if (u2Var != null) {
            u2Var.I1(null, 0);
        }
        xnVar.X9();
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0() {
        xn xnVar = this.c;
        xnVar.l9 = true;
        jm jmVar = xnVar.x0;
        if (jmVar != null) {
            jmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void M1() {
        int i10;
        int i11;
        xn xnVar = this.c;
        if (xnVar.z9() || (i10 = xnVar.O3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = xnVar.getMessagesController();
        long j10 = xnVar.Q5;
        long j11 = xnVar.a4;
        i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.eg
    public final void P0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void X() {
        xn xnVar = this.c;
        jk jkVar = xnVar.V;
        boolean z4 = jkVar.v3;
        org.telegram.ui.Components.uf ufVar = jkVar.R0;
        boolean z10 = false;
        boolean z11 = ufVar != null && ufVar.getCurrentPage() == 0;
        xd.a aVar = xnVar.uc;
        if (z4 && !z11) {
            z10 = true;
        }
        aVar.a(z10, true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y(boolean z4) {
        this.c.Vb(false, z4);
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y0() {
        xn xnVar = this.c;
        int sendingMessageId = xnVar.getSendMessagesHelper().getSendingMessageId(xnVar.Q5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void e1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        xn xnVar = this.c;
        if (xnVar.Z2.getVisibility() != i11) {
            xnVar.Z2.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.eg
    public final int f1() {
        return this.c.U0.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final void h() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem h1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean j1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean k() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.eg
    public final int l() {
        return this.c.U0.R();
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        dl dlVar = this.c.Y2;
        return (dlVar == null || dlVar.b0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void o0() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        xn xnVar = this.c;
        if (i10 < currentActionBarHeight) {
            xnVar.W4 = false;
            if (xnVar.a1.getVisibility() == 0) {
                xnVar.a1.setVisibility(4);
            }
        } else {
            xnVar.W4 = true;
            if (xnVar.a1.getVisibility() == 4 && !xnVar.isInPreviewMode()) {
                xnVar.a1.setVisibility(0);
            }
        }
        xnVar.X4 = true ^ xnVar.V.t0();
        int i11 = i10 + (xnVar.V.t0() ? 65536 : 0);
        if (this.a != i11) {
            xnVar.Y = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.eg
    public final nn r0() {
        return this.c.i5;
    }

    @Override // org.telegram.ui.Components.eg
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        CharSequence charSequence2;
        org.telegram.ui.Components.m40 m40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = false;
        xn xnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || xnVar.V.r0());
        bk bkVar = xnVar.F1;
        if (bkVar == null || bkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            xnVar.F1.getAdapter().U(charSequence2, xnVar.V.getCursorPosition(), xnVar.r6, false, false);
        }
        androidx.biometric.k kVar = xnVar.G5;
        if (kVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kVar);
            xnVar.G5 = null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = xnVar.V;
            if (jkVar.U2 && (!jkVar.r0() || !xnVar.V.W1)) {
                if (z4) {
                    xnVar.Ya(charSequence2, true);
                } else {
                    xnVar.M6(charSequence2);
                    androidx.biometric.k kVar2 = new androidx.biometric.k(28, this, charSequence2);
                    xnVar.G5 = kVar2;
                    AndroidUtilities.runOnUIThread(kVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        uk ukVar = xnVar.ua;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.C;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((bz) arrayList.get(i10)).n = true;
            }
        }
        ng.m0 m0Var = ng.m0.B;
        if (m0Var != null) {
            m0Var.l = true;
        }
        ng.m0 m0Var2 = ng.m0.C;
        if (m0Var2 != null) {
            m0Var2.l = true;
        }
        if (z10) {
            return;
        }
        ej ejVar = xnVar.d2;
        if ((ejVar != null && ejVar.getVisibility() == 0) || ((m40Var = xnVar.f2) != null && m40Var.getVisibility() == 0)) {
            ej ejVar2 = xnVar.d2;
            if (ejVar2 != null) {
                ejVar2.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = xnVar.f2;
            if (m40Var2 != null) {
                m40Var2.b(true);
                return;
            }
            return;
        }
        lf lfVar = xnVar.Ka;
        if (UserObject.isUserSelf(xnVar.f) || ((chatFull = xnVar.W7) != null && chatFull.slowmode_next_send_date > 0 && xnVar.O3 == 0)) {
            z11 = true;
        }
        if (xnVar.g2 || xnVar.e2 || z11 || SharedConfig.scheduledHintShows >= 3 || xnVar.V.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(lfVar);
        AndroidUtilities.runOnUIThread(lfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.eg
    public final void s2() {
        pm pmVar;
        int indexOfChild;
        xn xnVar = this.c;
        if (xnVar.getParentActivity() != null) {
            if ((xnVar.e == null && xnVar.X7 == null) || xnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.m40 m40Var = xnVar.c2;
            if ((m40Var == null || m40Var.getVisibility() != 0) && (indexOfChild = (pmVar = xnVar.U0).indexOfChild(xnVar.P)) != -1) {
                try {
                    xnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (xnVar.c2 == null) {
                    org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(9, xnVar.getParentActivity(), xnVar.ba, false);
                    xnVar.c2 = m40Var2;
                    m40Var2.setVisibility(8);
                    pmVar.addView(xnVar.c2, indexOfChild + 1, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = xnVar.X7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    xnVar.c2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(xnVar.V.Z0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, xnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(xnVar.e) || ChatObject.canSendRoundVideo(xnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(xnVar.e, 20)) {
                        xnVar.c2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 21)) {
                        xnVar.c2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 7)) {
                        xnVar.c2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = xnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            xnVar.c2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            xnVar.c2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(xnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (xnVar.K6()) {
                        return;
                    }
                    if (xnVar.V.Z0) {
                        xnVar.c2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 21));
                    } else {
                        xnVar.c2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 20));
                    }
                }
                View sendButton = xnVar.V.getSendButton();
                View audioVideoButtonContainer = xnVar.V.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                xnVar.c2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void t1() {
        dl dlVar = this.c.Y2;
        if (dlVar != null) {
            dlVar.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2(boolean z4) {
        xn xnVar = this.c;
        View view = xnVar.t2;
        if (view != null) {
            view.setVisibility(8);
        }
        xnVar.Y4 = !z4;
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
        boolean z4;
        xn xnVar = this.c;
        if (xnVar.v0 != null) {
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
        bk bkVar = xnVar.F1;
        if (bkVar != null) {
            bkVar.getAdapter().c0 = true;
        }
        if (xnVar.m5 != null) {
            AndroidUtilities.runOnUIThread(new zi(this, 6), 30L);
        }
        if (xnVar.V.t0()) {
            xnVar.V.e1();
            z4 = true;
        } else {
            z4 = false;
        }
        xnVar.V.V0(true, true, z4);
        if (xnVar.l5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.l5, true);
            xnVar.l5 = 0;
        }
        xnVar.yc(0, true);
        xnVar.hc(false);
        xnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean u1() {
        xn xnVar = this.c;
        TLRPC.User user = xnVar.f;
        return (user == null || UserObject.isUserSelf(user) || xnVar.f.bot || xnVar.h != null || xnVar.O3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        xn xnVar = this.c;
        if (xnVar.Y2 == null && CameraView.isCameraAllowed() && xnVar.getParentActivity() != null) {
            dl dlVar = new dl(xnVar, xnVar.getParentActivity(), xnVar, xnVar.ba);
            xnVar.Y2 = dlVar;
            dlVar.setClipToPadding(false);
            dl dlVar2 = xnVar.Y2;
            og.a aVar = xnVar.G;
            fj fjVar = xnVar.w;
            LinearLayout linearLayout = dlVar2.O0;
            qg.b c3 = aVar.c(linearLayout, fjVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c3);
            int indexOfChild = xnVar.U0.indexOfChild(xnVar.P);
            if (indexOfChild < 0) {
                indexOfChild = xnVar.U0.getChildCount();
            }
            xnVar.U0.addView(xnVar.Y2, Math.min(indexOfChild + 1, xnVar.U0.getChildCount()), k7.c6.e(-1, -1, 51));
        }
        dl dlVar3 = xnVar.Y2;
        if (dlVar3 != null) {
            if (i10 == 0) {
                dlVar3.l(false);
                xnVar.u0.B0();
                xnVar.x0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                dlVar3.k(i10, i11, i12, j10, j11, z4);
            } else if (i10 == 2 || i10 == 5) {
                dlVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (kVar.k0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = xnVar.f0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(xnVar.V.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.b0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            ds dsVar = xnVar.a0;
            if (dsVar != null) {
                dsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void w1() {
        int i10;
        xn xnVar = this.c;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        long j10 = xnVar.Q5;
        MessageSuggestionParams messageSuggestionParams = xnVar.d5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new mh.r0(parentActivity, i10, j10, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new xe(xnVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
        xn xnVar = this.c;
        if (f10 != 0.0f) {
            xnVar.A4 = true;
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        xnVar.U0.invalidate();
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar == null || xnVar.Wb == null) {
            return;
        }
        icVar.l();
    }

    @Override // org.telegram.ui.Components.eg
    public final void x1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.eg
    public final void x2() {
        xn xnVar = this.c;
        ej ejVar = xnVar.d2;
        if (ejVar != null) {
            ejVar.b(true);
        }
        org.telegram.ui.Components.m40 m40Var = xnVar.f2;
        if (m40Var != null) {
            m40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1() {
        int i10;
        int i11;
        xn xnVar = this.c;
        xnVar.W6();
        jk jkVar = xnVar.V;
        boolean z4 = jkVar.v3;
        org.telegram.ui.Components.uf ufVar = jkVar.R0;
        xnVar.uc.a(z4 && !(ufVar != null && ufVar.getCurrentPage() == 0), true);
        if (z4) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null && icVar.l) {
                icVar.b();
            }
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        bk bkVar = xnVar.F1;
        float f10 = 0.0f;
        if (bkVar != null) {
            bkVar.animate().alpha((z4 || xnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.pr.f).start();
        }
        org.telegram.ui.Components.qy0 qy0Var = xnVar.a1;
        if (qy0Var != null) {
            qy0Var.setVisibility(0);
            ViewPropertyAnimator animate = xnVar.a1.animate();
            if (!z4 && !xnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.pr.f).withEndAction(new kh.f(17, this, z4)).start();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void z1(View view, CharSequence charSequence, boolean z4) {
        xn xnVar = this.c;
        xnVar.Sb(view, charSequence, z4);
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        xnVar.e0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = xnVar.b0;
        if (yVar != null) {
            yVar.f(8);
        }
        ds dsVar = xnVar.a0;
        if (dsVar != null) {
            dsVar.b(false);
        }
    }
}
