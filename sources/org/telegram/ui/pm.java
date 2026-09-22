package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
import org.telegram.messenger.SharedSettings;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pm implements org.telegram.ui.Components.ng {
    public int a;
    public boolean b;
    public final /* synthetic */ zn c;

    public pm(zn znVar) {
        this.c = znVar;
    }

    @Override // org.telegram.ui.Components.ng
    public final void A1() {
        int i10;
        zn znVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.T5, (int) znVar.d());
        znVar.c7(true);
    }

    @Override // org.telegram.ui.Components.ng
    public final void A2() {
        zn znVar = this.c;
        ai.g4 g4Var = znVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        znVar.X9();
    }

    @Override // org.telegram.ui.Components.ng
    public final void B(boolean z10) {
        int i10;
        int i11;
        zn znVar = this.c;
        if (!z10) {
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            znVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean D0() {
        int i10;
        zn znVar = this.c;
        if ((znVar.getMessagesController().isForum(znVar.a()) && !znVar.h4) || (i10 = znVar.R3) == 9 || znVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void F0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        if (znVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        final org.telegram.ui.ActionBar.z n10 = kVar.n();
        org.telegram.ui.Components.az0 az0Var = znVar.d1;
        if (az0Var != null) {
            az0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = znVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (znVar.i0.l != 0) {
                    if (!(znVar.R3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) && (znVar.R3 != 0 || (!(znVar.d4 == 0 || znVar.h4) || UserObject.isReplyUser(znVar.f) || znVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.f);
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
                        znVar.i0.f(0);
                        zn.J3(znVar);
                        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        hs hsVar = znVar.d0;
                        if (hsVar != null) {
                            hsVar.b(false);
                        }
                    }
                }
            }
            znVar.A4 = i10;
            znVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = znVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(znVar.R3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) && (znVar.R3 != 0 || (!(znVar.d4 == 0 || znVar.h4) || UserObject.isReplyUser(znVar.f) || znVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f);
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
                znVar.i0.f(8);
                if (znVar.Y.k0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = znVar.h0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = znVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    hs hsVar2 = znVar.d0;
                    if (hsVar2 != null) {
                        hsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = znVar.h0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = znVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                hs hsVar3 = znVar.d0;
                if (hsVar3 != null) {
                    hsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void F1() {
        int i10;
        int i11;
        zn znVar = this.c;
        if (znVar.z9() || (i10 = znVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = znVar.getMessagesController();
        long j3 = znVar.T5;
        long j10 = znVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
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
        zn znVar = this.c;
        ArrayList arrayList = znVar.u6;
        if (znVar.y0 != null) {
            znVar.b0 = znVar.Y.getBackgroundTop();
        }
        fk fkVar = znVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            znVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (znVar.S3 == -1) {
                znVar.S3 = 0;
            }
            if (charSequence != null) {
                znVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.S3 += znVar.f5.forwardMessages.messages.size();
            }
            znVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = znVar.getMessagesController().getPeer(znVar.T5);
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
                org.telegram.ui.Components.pc M = org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Components.mc) M.e).a;
                nj0Var.setScaleX(1.8f);
                nj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.e) && !znVar.h4 && (messageObject = znVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.T5, j10, false);
            }
        }
        znVar.yb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        mk mkVar = znVar.Y;
        if (mkVar != null && mkVar.getEmojiView() != null && (g1Var = znVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
        }
        if (znVar.getMessagesController().premiumFeaturesBlocked() || znVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || znVar.getMessagesController().didPressTranscribeButtonEnough() || znVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.u31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void H0() {
        zn znVar = this.c;
        znVar.o9 = true;
        lm lmVar = znVar.A0;
        if (lmVar != null) {
            lmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        if (h60Var != null) {
            h60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void K0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.ng
    public final void U0() {
        zn znVar = this.c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.T5);
        if (sendingMessageId != 0) {
            this.c.E(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void W() {
        zn znVar = this.c;
        mk mkVar = znVar.Y;
        boolean z10 = mkVar.z3;
        org.telegram.ui.Components.dg dgVar = mkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        le.b bVar = znVar.wc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.ng
    public final void b1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        zn znVar = this.c;
        if (znVar.c3.getVisibility() != i11) {
            znVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final int c1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.ng
    public final void d2() {
        org.telegram.ui.Components.az0 az0Var = this.c.d1;
        if (az0Var != null) {
            az0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.c;
        if (i10 < currentActionBarHeight) {
            znVar.Z4 = false;
            if (znVar.d1.getVisibility() == 0) {
                znVar.d1.setVisibility(4);
            }
        } else {
            znVar.Z4 = true;
            if (znVar.d1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.d1.setVisibility(0);
            }
        }
        znVar.a5 = true ^ znVar.Y.t0();
        int i11 = i10 + (znVar.Y.t0() ? 65536 : 0);
        if (this.a != i11) {
            znVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean g1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
        rm rmVar;
        int indexOfChild;
        zn znVar = this.c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.e == null && znVar.a8 == null) || znVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.i40 i40Var = znVar.f2;
            if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (rmVar = znVar.X0).indexOfChild(znVar.S)) != -1) {
                try {
                    znVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (znVar.f2 == null) {
                    org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, znVar.getParentActivity(), znVar.ea, false);
                    znVar.f2 = i40Var2;
                    i40Var2.setVisibility(8);
                    rmVar.addView(znVar.f2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = znVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    znVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(znVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, znVar.f.first_name)));
                } else if (ChatObject.canSendVoice(znVar.e) || ChatObject.canSendRoundVideo(znVar.e)) {
                    if (ChatObject.isActionBannedByDefault(znVar.e, 20)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 21)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 7)) {
                        znVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            znVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            znVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (znVar.K6()) {
                        return;
                    }
                    if (znVar.Y.c1) {
                        znVar.f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 21));
                    } else {
                        znVar.f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 20));
                    }
                }
                View sendButton = znVar.Y.getSendButton();
                View audioVideoButtonContainer = znVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                znVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean j1() {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        return h60Var != null && h60Var.d();
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
        zn znVar = this.c;
        View view = znVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        zn znVar = this.c;
        if (znVar.b3 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            Activity parentActivity = znVar.getParentActivity();
            xn xnVar = znVar.ea;
            int i13 = org.telegram.ui.Components.h60.e;
            org.telegram.ui.Components.h60 b60Var = SharedSettings.roundVideoCamera2Enabled.get() ? new org.telegram.ui.Components.b60(parentActivity, znVar, xnVar) : new org.telegram.ui.Components.c60(parentActivity, znVar, xnVar, true);
            znVar.b3 = b60Var;
            b60Var.setAnimationCallback(new qe(znVar, 0));
            znVar.b3.setTrimCallback(new qe(znVar, 1));
            znVar.b3.setRecordingUiFrameCallback(new qj(znVar));
            znVar.b3.setClipToPadding(false);
            znVar.b3.g(znVar.J, znVar.w);
            int indexOfChild = znVar.X0.indexOfChild(znVar.S);
            if (indexOfChild < 0) {
                indexOfChild = znVar.X0.getChildCount();
            }
            znVar.X0.addView(znVar.b3, Math.min(indexOfChild + 1, znVar.X0.getChildCount()), w7.y5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h60 h60Var = znVar.b3;
        if (h60Var != null) {
            if (i10 == 0) {
                h60Var.h(false);
                znVar.x0.C0();
                znVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                h60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                h60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void l() {
        org.telegram.ui.Components.az0 az0Var = this.c.d1;
        if (az0Var != null) {
            az0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean m() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.ng
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        zn znVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || znVar.Y.r0());
        fk fkVar = znVar.I1;
        if (fkVar == null || fkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            znVar.I1.getAdapter().U(charSequence2, znVar.Y.getCursorPosition(), znVar.u6, false, false);
        }
        i9.s sVar = znVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            znVar.J5 = null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            mk mkVar = znVar.Y;
            if (mkVar.Y2 && (!mkVar.r0() || !znVar.Y.a2)) {
                if (z10) {
                    znVar.Ya(charSequence2, true);
                } else {
                    znVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    znVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        xk xkVar = znVar.xa;
        if (xkVar != null) {
            ArrayList arrayList = xkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).n = true;
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
        ij ijVar = znVar.g2;
        if ((ijVar != null && ijVar.getVisibility() == 0) || ((i40Var = znVar.i2) != null && i40Var.getVisibility() == 0)) {
            ij ijVar2 = znVar.g2;
            if (ijVar2 != null) {
                ijVar2.b(true);
            }
            org.telegram.ui.Components.i40 i40Var2 = znVar.i2;
            if (i40Var2 != null) {
                i40Var2.b(true);
                return;
            }
            return;
        }
        ug ugVar = znVar.Na;
        if (UserObject.isUserSelf(znVar.f) || ((chatFull = znVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && znVar.R3 == 0)) {
            z12 = true;
        }
        if (znVar.j2 || znVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || znVar.Y.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ugVar);
        AndroidUtilities.runOnUIThread(ugVar, 4000L);
    }

    @Override // org.telegram.ui.Components.ng
    public final void n0() {
        org.telegram.ui.Components.az0 az0Var = this.c.d1;
        if (az0Var != null) {
            az0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void o1() {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        if (h60Var != null) {
            h60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
        zn znVar = this.c;
        ij ijVar = znVar.g2;
        if (ijVar != null) {
            ijVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = znVar.i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean p1() {
        zn znVar = this.c;
        TLRPC.User user = znVar.f;
        return (user == null || UserObject.isUserSelf(user) || znVar.f.bot || znVar.h != null || znVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final int q() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.ng
    public final pn q0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.ng
    public final void r1() {
        int i10;
        zn znVar = this.c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        long j3 = znVar.T5;
        MessageSuggestionParams messageSuggestionParams = znVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new bf(znVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.ng
    public final void s1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.ng
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            hs hsVar = znVar.d0;
            if (hsVar != null) {
                hsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1() {
        int i10;
        int i11;
        zn znVar = this.c;
        znVar.W6();
        mk mkVar = znVar.Y;
        boolean z10 = mkVar.z3;
        org.telegram.ui.Components.dg dgVar = mkVar.U0;
        znVar.wc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
            if (pcVar != null && pcVar.l) {
                pcVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        fk fkVar = znVar.I1;
        float f7 = 0.0f;
        if (fkVar != null) {
            fkVar.animate().alpha((z10 || znVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.qr.f).start();
        }
        org.telegram.ui.Components.az0 az0Var = znVar.d1;
        if (az0Var != null) {
            az0Var.setVisibility(0);
            ViewPropertyAnimator animate = znVar.d1.animate();
            if (!z10 && !znVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f).withEndAction(new bi.f(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(View view, CharSequence charSequence, boolean z10) {
        zn znVar = this.c;
        znVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        znVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = znVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        hs hsVar = znVar.d0;
        if (hsVar != null) {
            hsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final void w1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = znVar.h0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = znVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = znVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        hs hsVar = znVar.d0;
        if (hsVar != null) {
            hsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
        boolean z10;
        zn znVar = this.c;
        if (znVar.y0 != null) {
            znVar.b0 = znVar.Y.getBackgroundTop();
        }
        fk fkVar = znVar.I1;
        if (fkVar != null) {
            fkVar.getAdapter().f0 = true;
        }
        if (znVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new dj(this, 6), 30L);
        }
        if (znVar.Y.t0()) {
            znVar.Y.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.Y.U0(true, true, z10);
        if (znVar.o5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.o5, true);
            znVar.o5 = 0;
        }
        znVar.yc(0, true);
        znVar.hc(false);
        znVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean x1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void y(float f7) {
        zn znVar = this.c;
        if (f7 != 0.0f) {
            znVar.D4 = true;
        }
        znVar.o9();
        znVar.r9();
        znVar.Mc(false, false);
        znVar.X0.invalidate();
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        if (pcVar == null || znVar.Yb == null) {
            return;
        }
        pcVar.l();
    }
}
