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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pm implements org.telegram.ui.Components.eg {
    public int a;
    public boolean b;
    public final /* synthetic */ zn c;

    public pm(zn znVar) {
        this.c = znVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final void A1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void A2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.k0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = znVar.f0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = znVar.b0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        es esVar = znVar.a0;
        if (esVar != null) {
            esVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void B(boolean z4) {
        int i10;
        int i11;
        zn znVar = this.c;
        if (!z4) {
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            znVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean B1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.c5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void D() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void E1() {
        int i10;
        zn znVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.Q5, (int) znVar.d());
        znVar.c7(true);
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
        zn znVar = this.c;
        nh.t2 t2Var = znVar.G1;
        if (t2Var != null) {
            t2Var.I1(null, 0);
        }
        znVar.X9();
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        org.telegram.ui.Components.zw zwVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        zn znVar = this.c;
        ArrayList arrayList = znVar.r6;
        if (znVar.v0 != null) {
            znVar.Y = znVar.V.getBackgroundTop();
        }
        dk dkVar = znVar.F1;
        if (dkVar != null && dkVar.getAdapter() != null) {
            znVar.F1.getAdapter().w.a(charSequence);
        }
        boolean z10 = false;
        if (i10 != 0) {
            if (znVar.P3 == -1) {
                znVar.P3 = 0;
            }
            if (charSequence != null) {
                znVar.P3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.c5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.P3 += znVar.c5.forwardMessages.messages.size();
            }
            znVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.c5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.c5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.c5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z11 = arrayList2.size() > 0;
            TLRPC.Peer peer = znVar.getMessagesController().getPeer(znVar.Q5);
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
                org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Components.fc) M.e).a;
                jj0Var.setScaleX(1.8f);
                jj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.e) && !znVar.e4 && (messageObject = znVar.k5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.k5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.Q5, j11, false);
            }
        }
        znVar.zb(false, null, null, null, null, z4, i10, null, false, j10, null, true);
        lk lkVar = znVar.V;
        if (lkVar != null && lkVar.getEmojiView() != null && (zwVar = znVar.V.getEmojiView().Q0) != null) {
            if (zwVar.e) {
                MessagesController.getInstance(zwVar.a).sendTyping(zwVar.b, zwVar.c, 2, 0);
            }
            zwVar.f = -1L;
        }
        if (znVar.getMessagesController().premiumFeaturesBlocked() || znVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || znVar.getMessagesController().didPressTranscribeButtonEnough() || znVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
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
    public final TLRPC.TL_channels_sendAsPeers H() {
        return this.c.ea;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean H0() {
        int i10;
        zn znVar = this.c;
        if ((znVar.getMessagesController().isForum(znVar.a()) && !znVar.e4) || (i10 = znVar.O3) == 9 || znVar.P3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        if (znVar.f0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.qy0 qy0Var = znVar.a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = znVar.f0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (znVar.f0.l != 0) {
                    if (!(znVar.O3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) && (znVar.O3 != 0 || (!(znVar.a4 == 0 || znVar.e4) || UserObject.isReplyUser(znVar.f) || znVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.mr.f);
                        ofFloat.addListener(new om(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.nm
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
                        znVar.f0.f(0);
                        zn.J3(znVar);
                        org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = znVar.b0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        es esVar = znVar.a0;
                        if (esVar != null) {
                            esVar.b(false);
                        }
                    }
                }
            }
            znVar.x4 = i10;
            znVar.y4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = znVar.f0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(znVar.O3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) && (znVar.O3 != 0 || (!(znVar.a4 == 0 || znVar.e4) || UserObject.isReplyUser(znVar.f) || znVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.mr.f);
                    ofFloat2.addListener(new om(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.nm
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
                znVar.f0.f(8);
                if (znVar.V.k0() && TextUtils.isEmpty(znVar.V.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = znVar.e0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = znVar.b0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    es esVar2 = znVar.a0;
                    if (esVar2 != null) {
                        esVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = znVar.e0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = znVar.b0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                es esVar3 = znVar.a0;
                if (esVar3 != null) {
                    esVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void J1() {
        int i10;
        int i11;
        zn znVar = this.c;
        if (znVar.z9() || (i10 = znVar.O3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = znVar.getMessagesController();
        long j10 = znVar.Q5;
        long j11 = znVar.a4;
        i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.eg
    public final void K(float f10, int i10) {
        fl flVar = this.c.Y2;
        if (flVar != null) {
            flVar.e(f10, i10);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void L0() {
        zn znVar = this.c;
        znVar.l9 = true;
        lm lmVar = znVar.x0;
        if (lmVar != null) {
            lmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void O0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void X() {
        zn znVar = this.c;
        lk lkVar = znVar.V;
        boolean z4 = lkVar.v3;
        org.telegram.ui.Components.uf ufVar = lkVar.R0;
        boolean z10 = false;
        boolean z11 = ufVar != null && ufVar.getCurrentPage() == 0;
        xd.a aVar = znVar.uc;
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
        zn znVar = this.c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.Q5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void c() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.eg
    public final void f1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        zn znVar = this.c;
        if (znVar.Z2.getVisibility() != i11) {
            znVar.Z2.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final int g1() {
        return this.c.U0.getHeight();
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem i1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void i2() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void k() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void k2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.c;
        if (i10 < currentActionBarHeight) {
            znVar.W4 = false;
            if (znVar.a1.getVisibility() == 0) {
                znVar.a1.setVisibility(4);
            }
        } else {
            znVar.W4 = true;
            if (znVar.a1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.a1.setVisibility(0);
            }
        }
        znVar.X4 = true ^ znVar.V.t0();
        int i11 = i10 + (znVar.V.t0() ? 65536 : 0);
        if (this.a != i11) {
            znVar.Y = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean l() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        fl flVar = this.c.Y2;
        return (flVar == null || flVar.b0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2() {
        rm rmVar;
        int indexOfChild;
        zn znVar = this.c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.e == null && znVar.X7 == null) || znVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.l40 l40Var = znVar.c2;
            if ((l40Var == null || l40Var.getVisibility() != 0) && (indexOfChild = (rmVar = znVar.U0).indexOfChild(znVar.P)) != -1) {
                try {
                    znVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (znVar.c2 == null) {
                    org.telegram.ui.Components.l40 l40Var2 = new org.telegram.ui.Components.l40(9, znVar.getParentActivity(), znVar.ba, false);
                    znVar.c2 = l40Var2;
                    l40Var2.setVisibility(8);
                    rmVar.addView(znVar.c2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = znVar.X7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    znVar.c2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(znVar.V.Z0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, znVar.f.first_name)));
                } else if (ChatObject.canSendVoice(znVar.e) || ChatObject.canSendRoundVideo(znVar.e)) {
                    if (ChatObject.isActionBannedByDefault(znVar.e, 20)) {
                        znVar.c2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 21)) {
                        znVar.c2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 7)) {
                        znVar.c2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            znVar.c2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            znVar.c2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (znVar.K6()) {
                        return;
                    }
                    if (znVar.V.Z0) {
                        znVar.c2.setText(ChatObject.getRestrictedErrorText(znVar.e, 21));
                    } else {
                        znVar.c2.setText(ChatObject.getRestrictedErrorText(znVar.e, 20));
                    }
                }
                View sendButton = znVar.V.getSendButton();
                View audioVideoButtonContainer = znVar.V.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                znVar.c2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(boolean z4) {
        zn znVar = this.c;
        View view = znVar.t2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.Y4 = !z4;
    }

    @Override // org.telegram.ui.Components.eg
    public final int p() {
        return this.c.U0.R();
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        zn znVar = this.c;
        if (znVar.Y2 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            fl flVar = new fl(znVar, znVar.getParentActivity(), znVar, znVar.ba);
            znVar.Y2 = flVar;
            flVar.setClipToPadding(false);
            fl flVar2 = znVar.Y2;
            ng.a aVar = znVar.G;
            hj hjVar = znVar.w;
            LinearLayout linearLayout = flVar2.O0;
            pg.b c3 = aVar.c(linearLayout, hjVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c3);
            int indexOfChild = znVar.U0.indexOfChild(znVar.P);
            if (indexOfChild < 0) {
                indexOfChild = znVar.U0.getChildCount();
            }
            znVar.U0.addView(znVar.Y2, Math.min(indexOfChild + 1, znVar.U0.getChildCount()), k7.b6.e(-1, -1, 51));
        }
        fl flVar3 = znVar.Y2;
        if (flVar3 != null) {
            if (i10 == 0) {
                flVar3.l(false);
                znVar.u0.B0();
                znVar.x0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                flVar3.k(i10, i11, i12, j10, j11, z4);
            } else if (i10 == 2 || i10 == 5) {
                flVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void q0() {
        org.telegram.ui.Components.qy0 qy0Var = this.c.a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        CharSequence charSequence2;
        org.telegram.ui.Components.l40 l40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = false;
        zn znVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || znVar.V.r0());
        dk dkVar = znVar.F1;
        if (dkVar == null || dkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            znVar.F1.getAdapter().U(charSequence2, znVar.V.getCursorPosition(), znVar.r6, false, false);
        }
        androidx.biometric.j jVar = znVar.G5;
        if (jVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jVar);
            znVar.G5 = null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            lk lkVar = znVar.V;
            if (lkVar.U2 && (!lkVar.r0() || !znVar.V.W1)) {
                if (z4) {
                    znVar.Ya(charSequence2, true);
                } else {
                    znVar.M6(charSequence2);
                    androidx.biometric.j jVar2 = new androidx.biometric.j(28, this, charSequence2);
                    znVar.G5 = jVar2;
                    AndroidUtilities.runOnUIThread(jVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        wk wkVar = znVar.ua;
        if (wkVar != null) {
            ArrayList arrayList = wkVar.C;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((cz) arrayList.get(i10)).n = true;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.l = true;
        }
        mg.m0 m0Var2 = mg.m0.C;
        if (m0Var2 != null) {
            m0Var2.l = true;
        }
        if (z10) {
            return;
        }
        gj gjVar = znVar.d2;
        if ((gjVar != null && gjVar.getVisibility() == 0) || ((l40Var = znVar.f2) != null && l40Var.getVisibility() == 0)) {
            gj gjVar2 = znVar.d2;
            if (gjVar2 != null) {
                gjVar2.b(true);
            }
            org.telegram.ui.Components.l40 l40Var2 = znVar.f2;
            if (l40Var2 != null) {
                l40Var2.b(true);
                return;
            }
            return;
        }
        nf nfVar = znVar.Ka;
        if (UserObject.isUserSelf(znVar.f) || ((chatFull = znVar.W7) != null && chatFull.slowmode_next_send_date > 0 && znVar.O3 == 0)) {
            z11 = true;
        }
        if (znVar.g2 || znVar.e2 || z11 || SharedConfig.scheduledHintShows >= 3 || znVar.V.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(nfVar);
        AndroidUtilities.runOnUIThread(nfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer r() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void s1() {
        fl flVar = this.c.Y2;
        if (flVar != null) {
            flVar.q();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean t1() {
        zn znVar = this.c;
        TLRPC.User user = znVar.f;
        return (user == null || UserObject.isUserSelf(user) || znVar.f.bot || znVar.h != null || znVar.O3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2() {
        zn znVar = this.c;
        gj gjVar = znVar.d2;
        if (gjVar != null) {
            gjVar.b(true);
        }
        org.telegram.ui.Components.l40 l40Var = znVar.f2;
        if (l40Var != null) {
            l40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final pn u0() {
        return this.c.i5;
    }

    @Override // org.telegram.ui.Components.eg
    public final void v() {
        boolean z4;
        zn znVar = this.c;
        if (znVar.v0 != null) {
            znVar.Y = znVar.V.getBackgroundTop();
        }
        dk dkVar = znVar.F1;
        if (dkVar != null) {
            dkVar.getAdapter().c0 = true;
        }
        if (znVar.m5 != null) {
            AndroidUtilities.runOnUIThread(new bj(this, 6), 30L);
        }
        if (znVar.V.t0()) {
            znVar.V.e1();
            z4 = true;
        } else {
            z4 = false;
        }
        znVar.V.V0(true, true, z4);
        if (znVar.l5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.l5, true);
            znVar.l5 = 0;
        }
        znVar.yc(0, true);
        znVar.hc(false);
        znVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.eg
    public final void v1() {
        int i10;
        zn znVar = this.c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        long j10 = znVar.Q5;
        MessageSuggestionParams messageSuggestionParams = znVar.d5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new lh.s0(parentActivity, i10, j10, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new ze(znVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.eg
    public final void w1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
        zn znVar = this.c;
        if (f10 != 0.0f) {
            znVar.A4 = true;
        }
        znVar.o9();
        znVar.r9();
        znVar.Mc(false, false);
        znVar.U0.invalidate();
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        if (icVar == null || znVar.Wb == null) {
            return;
        }
        icVar.l();
    }

    @Override // org.telegram.ui.Components.eg
    public final void x0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.k0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = znVar.f0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(znVar.V.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.b0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            es esVar = znVar.a0;
            if (esVar != null) {
                esVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void x1() {
        int i10;
        int i11;
        zn znVar = this.c;
        znVar.W6();
        lk lkVar = znVar.V;
        boolean z4 = lkVar.v3;
        org.telegram.ui.Components.uf ufVar = lkVar.R0;
        znVar.uc.a(z4 && !(ufVar != null && ufVar.getCurrentPage() == 0), true);
        if (z4) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null && icVar.l) {
                icVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        dk dkVar = znVar.F1;
        float f10 = 0.0f;
        if (dkVar != null) {
            dkVar.animate().alpha((z4 || znVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.mr.f).start();
        }
        org.telegram.ui.Components.qy0 qy0Var = znVar.a1;
        if (qy0Var != null) {
            qy0Var.setVisibility(0);
            ViewPropertyAnimator animate = znVar.a1.animate();
            if (!z4 && !znVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.mr.f).withEndAction(new jh.f(18, this, z4)).start();
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(View view, CharSequence charSequence, boolean z4) {
        zn znVar = this.c;
        znVar.Sb(view, charSequence, z4);
        org.telegram.ui.ActionBar.w0 w0Var = znVar.e0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        znVar.e0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = znVar.b0;
        if (yVar != null) {
            yVar.f(8);
        }
        es esVar = znVar.a0;
        if (esVar != null) {
            esVar.b(false);
        }
    }
}
