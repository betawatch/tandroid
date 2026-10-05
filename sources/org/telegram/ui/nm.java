package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nm implements org.telegram.ui.Components.pg {
    public int a;
    public boolean b;
    public final /* synthetic */ yn c;

    public nm(yn ynVar) {
        this.c = ynVar;
    }

    @Override // org.telegram.ui.Components.pg
    public final void A2() {
        yn ynVar = this.c;
        ai.g4 g4Var = ynVar.H1;
        if (g4Var != null) {
            g4Var.H1(null, 0);
        }
        ynVar.W9();
    }

    @Override // org.telegram.ui.Components.pg
    public final void B(boolean z10) {
        int i10;
        int i11;
        yn ynVar = this.c;
        if (!z10) {
            Activity parentActivity = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = ynVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            ynVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean C0() {
        int i10;
        yn ynVar = this.c;
        if ((ynVar.getMessagesController().isForum(ynVar.a()) && !ynVar.f4) || (i10 = ynVar.P3) == 9 || ynVar.Q3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void D() {
        this.c.Ub(true, false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.c;
        if (ynVar.g0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.jz0 jz0Var = ynVar.b1;
        if (jz0Var != null) {
            jz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = ynVar.g0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (ynVar.g0.l != 0) {
                    if (!(ynVar.P3 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId()) && (ynVar.P3 != 0 || (!(ynVar.b4 == 0 || ynVar.f4) || UserObject.isReplyUser(ynVar.f) || ynVar.z9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.tr.f);
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
                        ynVar.g0.f(0);
                        yn.J3(ynVar);
                        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = ynVar.c0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        fs fsVar = ynVar.b0;
                        if (fsVar != null) {
                            fsVar.b(false);
                        }
                    }
                }
            }
            ynVar.y4 = i10;
            ynVar.z4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = ynVar.g0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(ynVar.P3 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId()) && (ynVar.P3 != 0 || (!(ynVar.b4 == 0 || ynVar.f4) || UserObject.isReplyUser(ynVar.f) || ynVar.z9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.tr.f);
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
                ynVar.g0.f(8);
                if (ynVar.W.k0() && TextUtils.isEmpty(ynVar.W.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.f0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = ynVar.c0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    fs fsVar2 = ynVar.b0;
                    if (fsVar2 != null) {
                        fsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = ynVar.f0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = ynVar.c0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                fs fsVar3 = ynVar.b0;
                if (fsVar3 != null) {
                    fsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void E1() {
        int i10;
        int i11;
        yn ynVar = this.c;
        if (ynVar.y9() || (i10 = ynVar.P3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = ynVar.getMessagesController();
        long j3 = ynVar.R5;
        long j10 = ynVar.b4;
        i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.pg
    public final void G0() {
        yn ynVar = this.c;
        ynVar.m9 = true;
        jm jmVar = ynVar.y0;
        if (jmVar != null) {
            jmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        yn ynVar = this.c;
        ArrayList arrayList = ynVar.s6;
        if (ynVar.w0 != null) {
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
        ck ckVar = ynVar.G1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            ynVar.G1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (ynVar.Q3 == -1) {
                ynVar.Q3 = 0;
            }
            if (charSequence != null) {
                ynVar.Q3++;
            }
            MessagePreviewParams messagePreviewParams2 = ynVar.d5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                ynVar.Q3 += ynVar.d5.forwardMessages.messages.size();
            }
            ynVar.Dc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = ynVar.d5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && ynVar.d5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            ynVar.d5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = ynVar.getMessagesController().getPeer(ynVar.R5);
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
                org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Components.oc) M.e).a;
                nj0Var.setScaleX(1.8f);
                nj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(ynVar.e) && !ynVar.f4 && (messageObject = ynVar.l5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, ynVar.l5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                ynVar.getMediaDataController().cleanDraft(ynVar.R5, j10, false);
            }
        }
        ynVar.xb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = ynVar.W;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = ynVar.W.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
        }
        if (ynVar.getMessagesController().premiumFeaturesBlocked() || ynVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || ynVar.getMessagesController().didPressTranscribeButtonEnough() || ynVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.d41.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.c.fa;
    }

    @Override // org.telegram.ui.Components.pg
    public final void J0() {
        this.c.ia(0, false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.k60 k60Var = this.c.Z2;
        if (k60Var != null) {
            k60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void T0() {
        yn ynVar = this.c;
        int sendingMessageId = ynVar.getSendMessagesHelper().getSendingMessageId(ynVar.R5);
        if (sendingMessageId != 0) {
            this.c.D(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void V() {
        yn ynVar = this.c;
        jk jkVar = ynVar.W;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.fg fgVar = jkVar.U0;
        boolean z11 = false;
        boolean z12 = fgVar != null && fgVar.getCurrentPage() == 0;
        le.b bVar = ynVar.uc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.pg
    public final void X(boolean z10) {
        this.c.Ub(false, z10);
    }

    @Override // org.telegram.ui.Components.pg
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        yn ynVar = this.c;
        if (ynVar.a3.getVisibility() != i11) {
            ynVar.a3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final int b1() {
        return this.c.V0.getHeight();
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void d2() {
        org.telegram.ui.Components.jz0 jz0Var = this.c.b1;
        if (jz0Var != null) {
            jz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void f() {
        this.c.uc();
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        yn ynVar = this.c;
        if (i10 < currentActionBarHeight) {
            ynVar.X4 = false;
            if (ynVar.b1.getVisibility() == 0) {
                ynVar.b1.setVisibility(4);
            }
        } else {
            ynVar.X4 = true;
            if (ynVar.b1.getVisibility() == 4 && !ynVar.isInPreviewMode()) {
                ynVar.b1.setVisibility(0);
            }
        }
        ynVar.Y4 = true ^ ynVar.W.t0();
        int i11 = i10 + (ynVar.W.t0() ? 65536 : 0);
        if (this.a != i11) {
            ynVar.Z = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.pg
    public final void i() {
        org.telegram.ui.Components.jz0 jz0Var = this.c.b1;
        if (jz0Var != null) {
            jz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean i1() {
        org.telegram.ui.Components.k60 k60Var = this.c.Z2;
        return k60Var != null && k60Var.d();
    }

    @Override // org.telegram.ui.Components.pg
    public final void i2() {
        qm qmVar;
        int indexOfChild;
        yn ynVar = this.c;
        if (ynVar.getParentActivity() != null) {
            if ((ynVar.e == null && ynVar.Y7 == null) || ynVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.m40 m40Var = ynVar.d2;
            if ((m40Var == null || m40Var.getVisibility() != 0) && (indexOfChild = (qmVar = ynVar.V0).indexOfChild(ynVar.Q)) != -1) {
                try {
                    ynVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (ynVar.d2 == null) {
                    org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(9, ynVar.getParentActivity(), ynVar.ca, false);
                    ynVar.d2 = m40Var2;
                    m40Var2.setVisibility(8);
                    qmVar.addView(ynVar.d2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = ynVar.Y7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    ynVar.d2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(ynVar.W.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, ynVar.f.first_name)));
                } else if (ChatObject.canSendVoice(ynVar.e) || ChatObject.canSendRoundVideo(ynVar.e)) {
                    if (ChatObject.isActionBannedByDefault(ynVar.e, 20)) {
                        ynVar.d2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(ynVar.e, 21)) {
                        ynVar.d2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(ynVar.e, 7)) {
                        ynVar.d2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = ynVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            ynVar.d2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            ynVar.d2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(ynVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (ynVar.K6()) {
                        return;
                    }
                    if (ynVar.W.c1) {
                        ynVar.d2.setText(ChatObject.getRestrictedErrorText(ynVar.e, 21));
                    } else {
                        ynVar.d2.setText(ChatObject.getRestrictedErrorText(ynVar.e, 20));
                    }
                }
                View sendButton = ynVar.W.getSendButton();
                View audioVideoButtonContainer = ynVar.W.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                ynVar.d2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void j2(boolean z10) {
        yn ynVar = this.c;
        View view = ynVar.u2;
        if (view != null) {
            view.setVisibility(8);
        }
        ynVar.Z4 = !z10;
    }

    @Override // org.telegram.ui.Components.pg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        yn ynVar = this.c;
        if (ynVar.Z2 == null && CameraView.isCameraAllowed() && ynVar.getParentActivity() != null) {
            Activity parentActivity = ynVar.getParentActivity();
            wn wnVar = ynVar.ca;
            int i13 = org.telegram.ui.Components.k60.e;
            ri.a aVar = ri.e.b;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.k60 e60Var = z11 ? new org.telegram.ui.Components.e60(parentActivity, ynVar, wnVar) : new org.telegram.ui.Components.f60(parentActivity, ynVar, wnVar, true);
            ynVar.Z2 = e60Var;
            e60Var.setAnimationCallback(new re(ynVar, 0));
            ynVar.Z2.setTrimCallback(new re(ynVar, 1));
            ynVar.Z2.setRecordingUiFrameCallback(new oj(ynVar));
            ynVar.Z2.setClipToPadding(false);
            ynVar.Z2.g(ynVar.H, ynVar.w);
            int indexOfChild = ynVar.V0.indexOfChild(ynVar.Q);
            if (indexOfChild < 0) {
                indexOfChild = ynVar.V0.getChildCount();
            }
            ynVar.V0.addView(ynVar.Z2, Math.min(indexOfChild + 1, ynVar.V0.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.k60 k60Var = this.c.Z2;
        if (k60Var != null) {
            if (i10 == 0) {
                k60Var.h(false);
                this.c.v0.C0();
                this.c.y0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                k60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                k60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.m40 m40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        yn ynVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || ynVar.W.r0());
        ck ckVar = ynVar.G1;
        if (ckVar == null || ckVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            ynVar.G1.getAdapter().U(charSequence2, ynVar.W.getCursorPosition(), ynVar.s6, false, false);
        }
        i9.s sVar = ynVar.H5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            ynVar.H5 = null;
        }
        TLRPC.Chat chat = ynVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = ynVar.W;
            if (jkVar.Y2 && (!jkVar.r0() || !ynVar.W.a2)) {
                if (z10) {
                    ynVar.Xa(charSequence2, true);
                } else {
                    ynVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    ynVar.H5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        uk ukVar = ynVar.va;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).n = true;
            }
        }
        zg.i0 i0Var = zg.i0.B;
        if (i0Var != null) {
            i0Var.l = true;
        }
        zg.i0 i0Var2 = zg.i0.C;
        if (i0Var2 != null) {
            i0Var2.l = true;
        }
        if (z11) {
            return;
        }
        gj gjVar = ynVar.e2;
        if ((gjVar != null && gjVar.getVisibility() == 0) || ((m40Var = ynVar.g2) != null && m40Var.getVisibility() == 0)) {
            gj gjVar2 = ynVar.e2;
            if (gjVar2 != null) {
                gjVar2.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = ynVar.g2;
            if (m40Var2 != null) {
                m40Var2.b(true);
                return;
            }
            return;
        }
        yf yfVar = ynVar.La;
        if (UserObject.isUserSelf(ynVar.f) || ((chatFull = ynVar.X7) != null && chatFull.slowmode_next_send_date > 0 && ynVar.P3 == 0)) {
            z12 = true;
        }
        if (ynVar.h2 || ynVar.f2 || z12 || SharedConfig.scheduledHintShows >= 3 || ynVar.W.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(yfVar);
        AndroidUtilities.runOnUIThread(yfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean m() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.pg
    public final void m0() {
        org.telegram.ui.Components.jz0 jz0Var = this.c.b1;
        if (jz0Var != null) {
            jz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void n1() {
        org.telegram.ui.Components.k60 k60Var = this.c.Z2;
        if (k60Var != null) {
            k60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean o1() {
        yn ynVar = this.c;
        TLRPC.User user = ynVar.f;
        return (user == null || UserObject.isUserSelf(user) || ynVar.f.bot || ynVar.h != null || ynVar.P3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void o2() {
        yn ynVar = this.c;
        gj gjVar = ynVar.e2;
        if (gjVar != null) {
            gjVar.b(true);
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.g2;
        if (m40Var != null) {
            m40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final on p0() {
        return this.c.j5;
    }

    @Override // org.telegram.ui.Components.pg
    public final int q() {
        return this.c.V0.R();
    }

    @Override // org.telegram.ui.Components.pg
    public final void q1() {
        int i10;
        yn ynVar = this.c;
        Activity parentActivity = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        long j3 = ynVar.R5;
        MessageSuggestionParams messageSuggestionParams = ynVar.e5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.f0(parentActivity, i10, j3, messageSuggestionParams, ynVar, ynVar.getResourceProvider(), 0, new xe(ynVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.pg
    public final void r1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.pg
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = ynVar.g0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(ynVar.W.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = ynVar.c0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            fs fsVar = ynVar.b0;
            if (fsVar != null) {
                fsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void s1() {
        int i10;
        int i11;
        yn ynVar = this.c;
        ynVar.W6();
        jk jkVar = ynVar.W;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.fg fgVar = jkVar.U0;
        ynVar.uc.a(z10 && !(fgVar != null && fgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = ynVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
            if (rcVar != null && rcVar.l) {
                rcVar.b();
            }
        } else {
            Activity parentActivity2 = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = ynVar.G1;
        float f7 = 0.0f;
        if (ckVar != null) {
            ckVar.animate().alpha((z10 || ynVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.tr.f).start();
        }
        org.telegram.ui.Components.jz0 jz0Var = ynVar.b1;
        if (jz0Var != null) {
            jz0Var.setVisibility(0);
            ViewPropertyAnimator animate = ynVar.b1.animate();
            if (!z10 && !ynVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.tr.f).withEndAction(new bi.f(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        yn ynVar = this.c;
        ynVar.Rb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        ynVar.f0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = ynVar.c0;
        if (yVar != null) {
            yVar.f(8);
        }
        fs fsVar = ynVar.b0;
        if (fsVar != null) {
            fsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void v1(CharSequence charSequence) {
        this.c.Xa(charSequence, true);
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.d5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = ynVar.g0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = ynVar.c0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        fs fsVar = ynVar.b0;
        if (fsVar != null) {
            fsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final void x() {
        boolean z10;
        yn ynVar = this.c;
        if (ynVar.w0 != null) {
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
        ck ckVar = ynVar.G1;
        if (ckVar != null) {
            ckVar.getAdapter().f0 = true;
        }
        if (ynVar.n5 != null) {
            AndroidUtilities.runOnUIThread(new bj(this, 6), 30L);
        }
        if (ynVar.W.t0()) {
            ynVar.W.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        ynVar.W.U0(true, true, z10);
        if (ynVar.m5 != 0) {
            ynVar.getConnectionsManager().cancelRequest(ynVar.m5, true);
            ynVar.m5 = 0;
        }
        ynVar.xc(0, true);
        ynVar.gc(false);
        ynVar.Vc(false);
    }

    @Override // org.telegram.ui.Components.pg
    public final void y(float f7) {
        yn ynVar = this.c;
        if (f7 != 0.0f) {
            ynVar.B4 = true;
        }
        ynVar.o9();
        ynVar.q9();
        ynVar.Lc(false, false);
        ynVar.V0.invalidate();
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
        if (rcVar == null || ynVar.Wb == null) {
            return;
        }
        rcVar.l();
    }

    @Override // org.telegram.ui.Components.pg
    public final void z1() {
        int i10;
        yn ynVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(ynVar.R5, (int) ynVar.d());
        ynVar.c7(true);
    }
}
