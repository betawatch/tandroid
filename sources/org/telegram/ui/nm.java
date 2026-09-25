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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ wn c;

    public nm(wn wnVar) {
        this.c = wnVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void A2() {
        wn wnVar = this.c;
        ai.g4 g4Var = wnVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        wnVar.X9();
    }

    @Override // org.telegram.ui.Components.og
    public final void B(boolean z10) {
        int i10;
        int i11;
        wn wnVar = this.c;
        if (!z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            wnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean C0() {
        int i10;
        wn wnVar = this.c;
        if ((wnVar.getMessagesController().isForum(wnVar.a()) && !wnVar.h4) || (i10 = wnVar.R3) == 9 || wnVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void D() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        if (wnVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        final org.telegram.ui.ActionBar.y n10 = kVar.n();
        org.telegram.ui.Components.xy0 xy0Var = wnVar.d1;
        if (xy0Var != null) {
            xy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.x xVar = wnVar.i0;
            if (xVar.o == null) {
                xVar.o = 1;
                if (wnVar.i0.l != 0) {
                    if (!(wnVar.R3 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId()) && (wnVar.R3 != 0 || (!(wnVar.d4 == 0 || wnVar.h4) || UserObject.isReplyUser(wnVar.f) || wnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.rr.f);
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
                        wnVar.i0.f(0);
                        wn.J3(wnVar);
                        org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.x xVar2 = wnVar.e0;
                        if (xVar2 != null) {
                            xVar2.f(8);
                        }
                        bs bsVar = wnVar.d0;
                        if (bsVar != null) {
                            bsVar.b(false);
                        }
                    }
                }
            }
            wnVar.A4 = i10;
            wnVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.x xVar3 = wnVar.i0;
        if (xVar3.o != null) {
            xVar3.o = null;
            if (xVar3.l != 8) {
                if (!(wnVar.R3 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId()) && (wnVar.R3 != 0 || (!(wnVar.d4 == 0 || wnVar.h4) || UserObject.isReplyUser(wnVar.f) || wnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.rr.f);
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
                wnVar.i0.f(8);
                if (wnVar.Y.k0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar4 = wnVar.e0;
                    if (xVar4 != null) {
                        xVar4.f(0);
                    }
                    bs bsVar2 = wnVar.d0;
                    if (bsVar2 != null) {
                        bsVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var3 = wnVar.h0;
                if (u0Var3 != null) {
                    u0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.x xVar5 = wnVar.e0;
                if (xVar5 != null) {
                    xVar5.f(8);
                }
                bs bsVar3 = wnVar.d0;
                if (bsVar3 != null) {
                    bsVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void E1() {
        int i10;
        int i11;
        wn wnVar = this.c;
        if (wnVar.z9() || (i10 = wnVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = wnVar.getMessagesController();
        long j3 = wnVar.T5;
        long j10 = wnVar.d4;
        i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        messagesController.sendTyping(j3, j10, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final void G0() {
        wn wnVar = this.c;
        wnVar.o9 = true;
        jm jmVar = wnVar.A0;
        if (jmVar != null) {
            jmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        wn wnVar = this.c;
        ArrayList arrayList = wnVar.u6;
        if (wnVar.y0 != null) {
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
        ck ckVar = wnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            wnVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (wnVar.S3 == -1) {
                wnVar.S3 = 0;
            }
            if (charSequence != null) {
                wnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = wnVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                wnVar.S3 += wnVar.f5.forwardMessages.messages.size();
            }
            wnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = wnVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && wnVar.f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            wnVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = wnVar.getMessagesController().getPeer(wnVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(wnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Components.nc) M.e).a;
                lj0Var.setScaleX(1.8f);
                lj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(wnVar.e) && !wnVar.h4 && (messageObject = wnVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, wnVar.n5.messageOwner, true);
            }
            long j10 = topicId;
            if (j10 != 0) {
                wnVar.getMediaDataController().cleanDraft(wnVar.T5, j10, false);
            }
        }
        wnVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = wnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = wnVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.a).sendTyping(g1Var.b, g1Var.c, 2, 0);
            }
            g1Var.f = -1L;
        }
        if (wnVar.getMessagesController().premiumFeaturesBlocked() || wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || wnVar.getMessagesController().didPressTranscribeButtonEnough() || wnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.r31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.og
    public final void J0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        if (h60Var != null) {
            h60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void T0() {
        wn wnVar = this.c;
        int sendingMessageId = wnVar.getSendMessagesHelper().getSendingMessageId(wnVar.T5);
        if (sendingMessageId != 0) {
            this.c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void W() {
        wn wnVar = this.c;
        jk jkVar = wnVar.Y;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.eg egVar = jkVar.U0;
        boolean z11 = false;
        boolean z12 = egVar != null && egVar.getCurrentPage() == 0;
        le.c cVar = wnVar.wc;
        if (z10 && !z12) {
            z11 = true;
        }
        cVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void X(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.og
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        wn wnVar = this.c;
        if (wnVar.c3.getVisibility() != i11) {
            wnVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int b1() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void d2() {
        org.telegram.ui.Components.xy0 xy0Var = this.c.d1;
        if (xy0Var != null) {
            xy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        wn wnVar = this.c;
        if (i10 < currentActionBarHeight) {
            wnVar.Z4 = false;
            if (wnVar.d1.getVisibility() == 0) {
                wnVar.d1.setVisibility(4);
            }
        } else {
            wnVar.Z4 = true;
            if (wnVar.d1.getVisibility() == 4 && !wnVar.isInPreviewMode()) {
                wnVar.d1.setVisibility(0);
            }
        }
        wnVar.a5 = true ^ wnVar.Y.t0();
        int i11 = i10 + (wnVar.Y.t0() ? 65536 : 0);
        if (this.a != i11) {
            wnVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final void g() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean i1() {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        return h60Var != null && h60Var.d();
    }

    @Override // org.telegram.ui.Components.og
    public final void i2() {
        pm pmVar;
        int indexOfChild;
        wn wnVar = this.c;
        if (wnVar.getParentActivity() != null) {
            if ((wnVar.e == null && wnVar.a8 == null) || wnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.j40 j40Var = wnVar.f2;
            if ((j40Var == null || j40Var.getVisibility() != 0) && (indexOfChild = (pmVar = wnVar.X0).indexOfChild(wnVar.S)) != -1) {
                try {
                    wnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (wnVar.f2 == null) {
                    org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(9, wnVar.getParentActivity(), wnVar.ea, false);
                    wnVar.f2 = j40Var2;
                    j40Var2.setVisibility(8);
                    pmVar.addView(wnVar.f2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = wnVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    wnVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(wnVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, wnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(wnVar.e) || ChatObject.canSendRoundVideo(wnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(wnVar.e, 20)) {
                        wnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 21)) {
                        wnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 7)) {
                        wnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            wnVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            wnVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(wnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (wnVar.K6()) {
                        return;
                    }
                    if (wnVar.Y.c1) {
                        wnVar.f2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 21));
                    } else {
                        wnVar.f2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 20));
                    }
                }
                View sendButton = wnVar.Y.getSendButton();
                View audioVideoButtonContainer = wnVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                wnVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void j2(boolean z10) {
        wn wnVar = this.c;
        View view = wnVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        wnVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.og
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        wn wnVar = this.c;
        if (wnVar.b3 == null && CameraView.isCameraAllowed() && wnVar.getParentActivity() != null) {
            Activity parentActivity = wnVar.getParentActivity();
            un unVar = wnVar.ea;
            int i13 = org.telegram.ui.Components.h60.e;
            org.telegram.ui.Components.h60 b60Var = pi.e.b.a() ? new org.telegram.ui.Components.b60(parentActivity, wnVar, unVar) : new org.telegram.ui.Components.c60(parentActivity, wnVar, unVar, true);
            wnVar.b3 = b60Var;
            b60Var.setAnimationCallback(new pe(wnVar, 0));
            wnVar.b3.setTrimCallback(new pe(wnVar, 1));
            wnVar.b3.setRecordingUiFrameCallback(new nj(wnVar));
            wnVar.b3.setClipToPadding(false);
            wnVar.b3.g(wnVar.J, wnVar.w);
            int indexOfChild = wnVar.X0.indexOfChild(wnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = wnVar.X0.getChildCount();
            }
            wnVar.X0.addView(wnVar.b3, Math.min(indexOfChild + 1, wnVar.X0.getChildCount()), w7.y5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h60 h60Var = wnVar.b3;
        if (h60Var != null) {
            if (i10 == 0) {
                h60Var.h(false);
                wnVar.x0.B0();
                wnVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                h60Var.f(i10, i11, i12, j3, j10, z10);
            } else if (i10 == 2 || i10 == 5) {
                h60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l() {
        org.telegram.ui.Components.xy0 xy0Var = this.c.d1;
        if (xy0Var != null) {
            xy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.j40 j40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        wn wnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || wnVar.Y.r0());
        ck ckVar = wnVar.I1;
        if (ckVar == null || ckVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            wnVar.I1.getAdapter().U(charSequence2, wnVar.Y.getCursorPosition(), wnVar.u6, false, false);
        }
        i9.s sVar = wnVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            wnVar.J5 = null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = wnVar.Y;
            if (jkVar.Y2 && (!jkVar.r0() || !wnVar.Y.a2)) {
                if (z10) {
                    wnVar.Ya(charSequence2, true);
                } else {
                    wnVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    wnVar.J5 = sVar2;
                    AndroidUtilities.runOnUIThread(sVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        uk ukVar = wnVar.xa;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((bz) arrayList.get(i10)).n = true;
            }
        }
        zg.k0 k0Var = zg.k0.B;
        if (k0Var != null) {
            k0Var.l = true;
        }
        zg.k0 k0Var2 = zg.k0.C;
        if (k0Var2 != null) {
            k0Var2.l = true;
        }
        if (z11) {
            return;
        }
        fj fjVar = wnVar.g2;
        if ((fjVar != null && fjVar.getVisibility() == 0) || ((j40Var = wnVar.i2) != null && j40Var.getVisibility() == 0)) {
            fj fjVar2 = wnVar.g2;
            if (fjVar2 != null) {
                fjVar2.b(true);
            }
            org.telegram.ui.Components.j40 j40Var2 = wnVar.i2;
            if (j40Var2 != null) {
                j40Var2.b(true);
                return;
            }
            return;
        }
        rg rgVar = wnVar.Na;
        if (UserObject.isUserSelf(wnVar.f) || ((chatFull = wnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && wnVar.R3 == 0)) {
            z12 = true;
        }
        if (wnVar.j2 || wnVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || wnVar.Y.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rgVar);
        AndroidUtilities.runOnUIThread(rgVar, 4000L);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean m() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.og
    public final void m0() {
        org.telegram.ui.Components.xy0 xy0Var = this.c.d1;
        if (xy0Var != null) {
            xy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
        org.telegram.ui.Components.h60 h60Var = this.c.b3;
        if (h60Var != null) {
            h60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean o1() {
        wn wnVar = this.c;
        TLRPC.User user = wnVar.f;
        return (user == null || UserObject.isUserSelf(user) || wnVar.f.bot || wnVar.h != null || wnVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void o2() {
        wn wnVar = this.c;
        fj fjVar = wnVar.g2;
        if (fjVar != null) {
            fjVar.b(true);
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.i2;
        if (j40Var != null) {
            j40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final mn p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.og
    public final int q() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.og
    public final void q1() {
        int i10;
        wn wnVar = this.c;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        long j3 = wnVar.T5;
        MessageSuggestionParams messageSuggestionParams = wnVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, wnVar, wnVar.getResourceProvider(), 0, new af(wnVar, 4)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final void r1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.og
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.x xVar = wnVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        if (TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = wnVar.e0;
            if (xVar2 != null) {
                xVar2.f(0);
            }
            bs bsVar = wnVar.d0;
            if (bsVar != null) {
                bsVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void s1() {
        int i10;
        int i11;
        wn wnVar = this.c;
        wnVar.W6();
        jk jkVar = wnVar.Y;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.eg egVar = jkVar.U0;
        wnVar.wc.a(z10 && !(egVar != null && egVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qcVar.l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = wnVar.I1;
        float f7 = 0.0f;
        if (ckVar != null) {
            ckVar.animate().alpha((z10 || wnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.rr.f).start();
        }
        org.telegram.ui.Components.xy0 xy0Var = wnVar.d1;
        if (xy0Var != null) {
            xy0Var.setVisibility(0);
            ViewPropertyAnimator animate = wnVar.d1.animate();
            if (!z10 && !wnVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f).withEndAction(new bi.f(20, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        wn wnVar = this.c;
        wnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
        if (u0Var == null || u0Var.getVisibility() == 0) {
            return;
        }
        wnVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = wnVar.e0;
        if (xVar != null) {
            xVar.f(8);
        }
        bs bsVar = wnVar.d0;
        if (bsVar != null) {
            bsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void v1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = wnVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        org.telegram.ui.ActionBar.x xVar2 = wnVar.e0;
        if (xVar2 != null) {
            xVar2.f(8);
        }
        bs bsVar = wnVar.d0;
        if (bsVar != null) {
            bsVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void x() {
        boolean z10;
        wn wnVar = this.c;
        if (wnVar.y0 != null) {
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
        ck ckVar = wnVar.I1;
        if (ckVar != null) {
            ckVar.getAdapter().f0 = true;
        }
        if (wnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new aj(this, 6), 30L);
        }
        if (wnVar.Y.t0()) {
            wnVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.Y.V0(true, true, z10);
        if (wnVar.o5 != 0) {
            wnVar.getConnectionsManager().cancelRequest(wnVar.o5, true);
            wnVar.o5 = 0;
        }
        wnVar.yc(0, true);
        wnVar.hc(false);
        wnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void y(float f7) {
        wn wnVar = this.c;
        if (f7 != 0.0f) {
            wnVar.D4 = true;
        }
        wnVar.o9();
        wnVar.r9();
        wnVar.Mc(false, false);
        wnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || wnVar.Yb == null) {
            return;
        }
        qcVar.l();
    }

    @Override // org.telegram.ui.Components.og
    public final void z1() {
        int i10;
        wn wnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(wnVar.T5, (int) wnVar.d());
        wnVar.c7(true);
    }
}
