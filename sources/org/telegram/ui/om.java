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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class om implements org.telegram.ui.Components.ng {
    public int a;
    public boolean b;
    public final /* synthetic */ xn c;

    public om(xn xnVar) {
        this.c = xnVar;
    }

    @Override // org.telegram.ui.Components.ng
    public final void A2() {
        xn xnVar = this.c;
        ai.g4 g4Var = xnVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        xnVar.X9();
    }

    @Override // org.telegram.ui.Components.ng
    public final void B(boolean z10) {
        int i10;
        int i11;
        xn xnVar = this.c;
        if (!z10) {
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            xnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean C0() {
        int i10;
        xn xnVar = this.c;
        if ((xnVar.getMessagesController().isForum(xnVar.a()) && !xnVar.h4) || (i10 = xnVar.R3) == 9 || xnVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.ng
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        if (xnVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.my0 my0Var = xnVar.d1;
        if (my0Var != null) {
            my0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = xnVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (xnVar.i0.l != 0) {
                    if (!(xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) && (xnVar.R3 != 0 || (!(xnVar.d4 == 0 || xnVar.h4) || UserObject.isReplyUser(xnVar.f) || xnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.rr.f);
                        ofFloat.addListener(new nm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mm
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
                        xnVar.i0.f(0);
                        xn.J3(xnVar);
                        org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = xnVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        cs csVar = xnVar.d0;
                        if (csVar != null) {
                            csVar.b(false);
                        }
                    }
                }
            }
            xnVar.A4 = i10;
            xnVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = xnVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) && (xnVar.R3 != 0 || (!(xnVar.d4 == 0 || xnVar.h4) || UserObject.isReplyUser(xnVar.f) || xnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.rr.f);
                    ofFloat2.addListener(new nm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mm
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
                xnVar.i0.f(8);
                if (xnVar.Y.l0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.h0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = xnVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    cs csVar2 = xnVar.d0;
                    if (csVar2 != null) {
                        csVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = xnVar.h0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = xnVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                cs csVar3 = xnVar.d0;
                if (csVar3 != null) {
                    csVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void E1() {
        int i10;
        int i11;
        xn xnVar = this.c;
        if (xnVar.z9() || (i10 = xnVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = xnVar.getMessagesController();
        long j3 = xnVar.T5;
        long j10 = xnVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.ng
    public final void G0() {
        xn xnVar = this.c;
        xnVar.o9 = true;
        km kmVar = xnVar.A0;
        if (kmVar != null) {
            kmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        xn xnVar = this.c;
        ArrayList arrayList = xnVar.u6;
        if (xnVar.y0 != null) {
            xnVar.b0 = xnVar.Y.getBackgroundTop();
        }
        ck ckVar = xnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            xnVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (xnVar.S3 == -1) {
                xnVar.S3 = 0;
            }
            if (charSequence != null) {
                xnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                xnVar.S3 += xnVar.f5.forwardMessages.messages.size();
            }
            xnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = xnVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && xnVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            xnVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = xnVar.getMessagesController().getPeer(xnVar.T5);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    z11 = z12;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i13);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (z11) {
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(xnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Components.nc) M.e).a;
                bj0Var.setScaleX(1.8f);
                bj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(xnVar.e) && !xnVar.h4 && (messageObject = xnVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, xnVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                xnVar.getMediaDataController().cleanDraft(xnVar.T5, j10, false);
            }
        }
        xnVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = xnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = xnVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
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

    @Override // org.telegram.ui.Components.ng
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.ng
    public final void J0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
        dl dlVar = this.c.b3;
        if (dlVar != null) {
            dlVar.e(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void T0() {
        xn xnVar = this.c;
        int sendingMessageId = xnVar.getSendMessagesHelper().getSendingMessageId(xnVar.T5);
        if (sendingMessageId != 0) {
            this.c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void W() {
        xn xnVar = this.c;
        jk jkVar = xnVar.Y;
        boolean z10 = jkVar.y3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        le.c cVar = xnVar.wc;
        if (z10 && !z12) {
            z11 = true;
        }
        cVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.ng
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        xn xnVar = this.c;
        if (xnVar.c3.getVisibility() != i11) {
            xnVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final int b1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void d2() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        xn xnVar = this.c;
        if (i10 < currentActionBarHeight) {
            xnVar.Z4 = false;
            if (xnVar.d1.getVisibility() == 0) {
                xnVar.d1.setVisibility(4);
            }
        } else {
            xnVar.Z4 = true;
            if (xnVar.d1.getVisibility() == 4 && !xnVar.isInPreviewMode()) {
                xnVar.d1.setVisibility(0);
            }
        }
        xnVar.a5 = true ^ xnVar.Y.u0();
        int i11 = i10 + (xnVar.Y.u0() ? 65536 : 0);
        if (this.a != i11) {
            xnVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean i1() {
        dl dlVar = this.c.b3;
        return (dlVar == null || dlVar.e0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
        qm qmVar;
        int indexOfChild;
        xn xnVar = this.c;
        if (xnVar.getParentActivity() != null) {
            if ((xnVar.e == null && xnVar.a8 == null) || xnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.j40 j40Var = xnVar.f2;
            if ((j40Var == null || j40Var.getVisibility() != 0) && (indexOfChild = (qmVar = xnVar.X0).indexOfChild(xnVar.S)) != -1) {
                try {
                    xnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (xnVar.f2 == null) {
                    org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(9, xnVar.getParentActivity(), xnVar.ea, false);
                    xnVar.f2 = j40Var2;
                    j40Var2.setVisibility(8);
                    qmVar.addView(xnVar.f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = xnVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    xnVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(xnVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, xnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(xnVar.e) || ChatObject.canSendRoundVideo(xnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(xnVar.e, 20)) {
                        xnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 21)) {
                        xnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 7)) {
                        xnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = xnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            xnVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            xnVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(xnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (xnVar.K6()) {
                        return;
                    }
                    if (xnVar.Y.c1) {
                        xnVar.f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 21));
                    } else {
                        xnVar.f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 20));
                    }
                }
                View sendButton = xnVar.Y.getSendButton();
                View audioVideoButtonContainer = xnVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                xnVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
        xn xnVar = this.c;
        View view = xnVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        xnVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        xn xnVar = this.c;
        if (xnVar.b3 == null && CameraView.isCameraAllowed() && xnVar.getParentActivity() != null) {
            dl dlVar = new dl(xnVar, xnVar.getParentActivity(), xnVar, xnVar.ea);
            xnVar.b3 = dlVar;
            dlVar.setClipToPadding(false);
            dl dlVar2 = xnVar.b3;
            ah.c cVar = xnVar.J;
            gj gjVar = xnVar.w;
            LinearLayout linearLayout = dlVar2.R0;
            ch.d c10 = cVar.c(linearLayout, gjVar, false);
            c10.p(AndroidUtilities.dp(6.0f));
            c10.q(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c10);
            int indexOfChild = xnVar.X0.indexOfChild(xnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = xnVar.X0.getChildCount();
            }
            xnVar.X0.addView(xnVar.b3, Math.min(indexOfChild + 1, xnVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        dl dlVar3 = xnVar.b3;
        if (dlVar3 != null) {
            if (i10 == 0) {
                dlVar3.l(false);
                xnVar.x0.B0();
                xnVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                dlVar3.k(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                dlVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void l() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.j40 j40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        xn xnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || xnVar.Y.s0());
        ck ckVar = xnVar.I1;
        if (ckVar == null || ckVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            xnVar.I1.getAdapter().U(charSequence2, xnVar.Y.getCursorPosition(), xnVar.u6, false, false);
        }
        i9.s sVar = xnVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            xnVar.J5 = null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = xnVar.Y;
            if (jkVar.X2 && (!jkVar.s0() || !xnVar.Y.Z1)) {
                if (z10) {
                    xnVar.Ya(charSequence2, true);
                } else {
                    xnVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    xnVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        uk ukVar = xnVar.xa;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((cz) arrayList.get(i10)).n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.l = true;
        }
        if (z11) {
            return;
        }
        fj fjVar = xnVar.g2;
        if ((fjVar != null && fjVar.getVisibility() == 0) || ((j40Var = xnVar.i2) != null && j40Var.getVisibility() == 0)) {
            fj fjVar2 = xnVar.g2;
            if (fjVar2 != null) {
                fjVar2.b(true);
            }
            org.telegram.ui.Components.j40 j40Var2 = xnVar.i2;
            if (j40Var2 != null) {
                j40Var2.b(true);
                return;
            }
            return;
        }
        pf pfVar = xnVar.Na;
        if (UserObject.isUserSelf(xnVar.f) || ((chatFull = xnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && xnVar.R3 == 0)) {
            z12 = true;
        }
        if (xnVar.j2 || xnVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || xnVar.Y.s0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(pfVar);
        AndroidUtilities.runOnUIThread(pfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean m() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.ng
    public final void m0() {
        org.telegram.ui.Components.my0 my0Var = this.c.d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void n1() {
        dl dlVar = this.c.b3;
        if (dlVar != null) {
            dlVar.q();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean o1() {
        xn xnVar = this.c;
        TLRPC.User user = xnVar.f;
        return (user == null || UserObject.isUserSelf(user) || xnVar.f.bot || xnVar.h != null || xnVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
        xn xnVar = this.c;
        fj fjVar = xnVar.g2;
        if (fjVar != null) {
            fjVar.b(true);
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.i2;
        if (j40Var != null) {
            j40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final nn p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.ng
    public final int q() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.ng
    public final void q1() {
        int i10;
        xn xnVar = this.c;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        long j3 = xnVar.T5;
        MessageSuggestionParams messageSuggestionParams = xnVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new af(xnVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.ng
    public final void r1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.ng
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = xnVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            cs csVar = xnVar.d0;
            if (csVar != null) {
                csVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void s1() {
        int i10;
        int i11;
        xn xnVar = this.c;
        xnVar.W6();
        jk jkVar = xnVar.Y;
        boolean z10 = jkVar.y3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        xnVar.wc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qcVar.l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = xnVar.I1;
        float f7 = 0.0f;
        if (ckVar != null) {
            ckVar.animate().alpha((z10 || xnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.rr.f).start();
        }
        org.telegram.ui.Components.my0 my0Var = xnVar.d1;
        if (my0Var != null) {
            my0Var.setVisibility(0);
            ViewPropertyAnimator animate = xnVar.d1.animate();
            if (!z10 && !xnVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f).withEndAction(new bi.f(19, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        xn xnVar = this.c;
        xnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        xnVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = xnVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        cs csVar = xnVar.d0;
        if (csVar != null) {
            csVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void v1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = xnVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = xnVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        cs csVar = xnVar.d0;
        if (csVar != null) {
            csVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
        boolean z10;
        xn xnVar = this.c;
        if (xnVar.y0 != null) {
            xnVar.b0 = xnVar.Y.getBackgroundTop();
        }
        ck ckVar = xnVar.I1;
        if (ckVar != null) {
            ckVar.getAdapter().f0 = true;
        }
        if (xnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new aj(this, 6), 30L);
        }
        if (xnVar.Y.u0()) {
            xnVar.Y.f1();
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.Y.W0(true, true, z10);
        if (xnVar.o5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.o5, true);
            xnVar.o5 = 0;
        }
        xnVar.yc(0, true);
        xnVar.hc(false);
        xnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.ng
    public final void y(float f7) {
        xn xnVar = this.c;
        if (f7 != 0.0f) {
            xnVar.D4 = true;
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        xnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || xnVar.Yb == null) {
            return;
        }
        qcVar.l();
    }

    @Override // org.telegram.ui.Components.ng
    public final void z1() {
        int i10;
        xn xnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(xnVar.T5, (int) xnVar.d());
        xnVar.c7(true);
    }
}
