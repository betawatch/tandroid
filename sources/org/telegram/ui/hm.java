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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ qn c;

    public hm(qn qnVar) {
        this.c = qnVar;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean B0() {
        int i10;
        qn qnVar = this.c;
        if ((qnVar.getMessagesController().isForum(qnVar.a()) && !qnVar.h4) || (i10 = qnVar.R3) == 9 || qnVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C(boolean z10) {
        int i10;
        int i11;
        qn qnVar = this.c;
        if (!z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            qnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        if (qnVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        final org.telegram.ui.ActionBar.y n10 = kVar.n();
        org.telegram.ui.Components.hz0 hz0Var = qnVar.d1;
        if (hz0Var != null) {
            hz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.x xVar = qnVar.i0;
            if (xVar.o == null) {
                xVar.o = 1;
                if (qnVar.i0.l != 0) {
                    if (!(qnVar.R3 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId()) && (qnVar.R3 != 0 || (!(qnVar.d4 == 0 || qnVar.h4) || UserObject.isReplyUser(qnVar.f) || qnVar.F9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
                        ofFloat.addListener(new gm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.fm
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
                        qnVar.i0.f(0);
                        qn.S3(qnVar);
                        org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.x xVar2 = qnVar.e0;
                        if (xVar2 != null) {
                            xVar2.f(8);
                        }
                        ur urVar = qnVar.d0;
                        if (urVar != null) {
                            urVar.b(false);
                        }
                    }
                }
            }
            qnVar.A4 = i10;
            qnVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.x xVar3 = qnVar.i0;
        if (xVar3.o != null) {
            xVar3.o = null;
            if (xVar3.l != 8) {
                if (!(qnVar.R3 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId()) && (qnVar.R3 != 0 || (!(qnVar.d4 == 0 || qnVar.h4) || UserObject.isReplyUser(qnVar.f) || qnVar.F9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.bs.f);
                    ofFloat2.addListener(new gm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.fm
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
                qnVar.i0.f(8);
                if (qnVar.Y.i0() && TextUtils.isEmpty(qnVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar4 = qnVar.e0;
                    if (xVar4 != null) {
                        xVar4.f(0);
                    }
                    ur urVar2 = qnVar.d0;
                    if (urVar2 != null) {
                        urVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var3 = qnVar.h0;
                if (u0Var3 != null) {
                    u0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.x xVar5 = qnVar.e0;
                if (xVar5 != null) {
                    xVar5.f(8);
                }
                ur urVar3 = qnVar.d0;
                if (urVar3 != null) {
                    urVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void F0() {
        qn qnVar = this.c;
        qnVar.o9 = true;
        dm dmVar = qnVar.A0;
        if (dmVar != null) {
            dmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
        this.c.Zb(true, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void H0() {
        this.c.oa(0, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        hg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        qn qnVar = this.c;
        ArrayList arrayList = qnVar.u6;
        if (qnVar.y0 != null) {
            qnVar.b0 = qnVar.Y.getBackgroundTop();
        }
        xj xjVar = qnVar.I1;
        if (xjVar != null && xjVar.getAdapter() != null) {
            qnVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (qnVar.S3 == -1) {
                qnVar.S3 = 0;
            }
            if (charSequence != null) {
                qnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                qnVar.S3 += qnVar.f5.forwardMessages.messages.size();
            }
            qnVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = qnVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && qnVar.f5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            qnVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(qnVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.xj0 xj0Var = ((org.telegram.ui.Components.nc) M.e).a;
                xj0Var.setScaleX(1.8f);
                xj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(qnVar.e) && !qnVar.h4 && (messageObject = qnVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, qnVar.n5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                qnVar.getMediaDataController().cleanDraft(qnVar.T5, j11, false);
            }
        }
        qnVar.Cb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        fk fkVar = qnVar.Y;
        if (fkVar != null && fkVar.getEmojiView() != null && (f1Var = qnVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (qnVar.getMessagesController().premiumFeaturesBlocked() || qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || qnVar.getMessagesController().didPressTranscribeButtonEnough() || qnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.z31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.og
    public final void Q0() {
        qn qnVar = this.c;
        int sendingMessageId = qnVar.getSendMessagesHelper().getSendingMessageId(qnVar.T5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
        org.telegram.ui.Components.hz0 hz0Var = this.c.d1;
        if (hz0Var != null) {
            hz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void U(float f7, int i10) {
        org.telegram.ui.Components.r60 r60Var = this.c.b3;
        if (r60Var != null) {
            r60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void V1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        qn qnVar = this.c;
        if (i10 < currentActionBarHeight) {
            qnVar.Z4 = false;
            if (qnVar.d1.getVisibility() == 0) {
                qnVar.d1.setVisibility(4);
            }
        } else {
            qnVar.Z4 = true;
            if (qnVar.d1.getVisibility() == 4 && !qnVar.isInPreviewMode()) {
                qnVar.d1.setVisibility(0);
            }
        }
        qnVar.a5 = true ^ qnVar.Y.r0();
        int i11 = i10 + (qnVar.Y.r0() ? 65536 : 0);
        if (this.a != i11) {
            qnVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final void X0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        qn qnVar = this.c;
        if (qnVar.c3.getVisibility() != i11) {
            qnVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void Y() {
        qn qnVar = this.c;
        fk fkVar = qnVar.Y;
        boolean z10 = fkVar.z3;
        org.telegram.ui.Components.dg dgVar = fkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        ne.b bVar = qnVar.yc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.og
    public final int Y0() {
        return this.c.X0.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
        jm jmVar;
        int indexOfChild;
        qn qnVar = this.c;
        if (qnVar.getParentActivity() != null) {
            if ((qnVar.e == null && qnVar.a8 == null) || qnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.r40 r40Var = qnVar.f2;
            if ((r40Var == null || r40Var.getVisibility() != 0) && (indexOfChild = (jmVar = qnVar.X0).indexOfChild(qnVar.S)) != -1) {
                try {
                    qnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (qnVar.f2 == null) {
                    org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(9, qnVar.getParentActivity(), qnVar.ea, false);
                    qnVar.f2 = r40Var2;
                    r40Var2.setVisibility(8);
                    jmVar.addView(qnVar.f2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = qnVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    qnVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(qnVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, qnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(qnVar.e) || ChatObject.canSendRoundVideo(qnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(qnVar.e, 20)) {
                        qnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 21)) {
                        qnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 7)) {
                        qnVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = qnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            qnVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            qnVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(qnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (qnVar.N6()) {
                        return;
                    }
                    if (qnVar.Y.c1) {
                        qnVar.f2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 21));
                    } else {
                        qnVar.f2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 20));
                    }
                }
                View sendButton = qnVar.Y.getSendButton();
                View audioVideoButtonContainer = qnVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                qnVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void Z1(boolean z10) {
        qn qnVar = this.c;
        View view = qnVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        qnVar.b5 = !z10;
    }

    @Override // org.telegram.ui.Components.og
    public final void a0(boolean z10) {
        this.c.Zb(false, z10);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem a1() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        qn qnVar = this.c;
        if (qnVar.b3 == null && CameraView.isCameraAllowed() && qnVar.getParentActivity() != null) {
            Activity parentActivity = qnVar.getParentActivity();
            on onVar = qnVar.ea;
            int i13 = org.telegram.ui.Components.r60.e;
            ti.a aVar = ti.e.d;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.r60 l60Var = z11 ? new org.telegram.ui.Components.l60(parentActivity, qnVar, onVar) : new org.telegram.ui.Components.m60(parentActivity, qnVar, onVar, true);
            qnVar.b3 = l60Var;
            l60Var.setAnimationCallback(new pe(qnVar, 0));
            qnVar.b3.setTrimCallback(new pe(qnVar, 1));
            qnVar.b3.setRecordingUiFrameCallback(new jj(qnVar));
            qnVar.b3.setClipToPadding(false);
            qnVar.b3.g(qnVar.J, qnVar.w);
            int indexOfChild = qnVar.X0.indexOfChild(qnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = qnVar.X0.getChildCount();
            }
            qnVar.X0.addView(qnVar.b3, Math.min(indexOfChild + 1, qnVar.X0.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.r60 r60Var = this.c.b3;
        if (r60Var != null) {
            if (i10 == 0) {
                r60Var.h(false);
                this.c.x0.B0();
                this.c.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                r60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                r60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean b1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e1() {
        org.telegram.ui.Components.r60 r60Var = this.c.b3;
        return r60Var != null && r60Var.d();
    }

    @Override // org.telegram.ui.Components.og
    public final void e2() {
        qn qnVar = this.c;
        aj ajVar = qnVar.g2;
        if (ajVar != null) {
            ajVar.b(true);
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.i2;
        if (r40Var != null) {
            r40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.r40 r40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        qn qnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || qnVar.Y.p0());
        xj xjVar = qnVar.I1;
        if (xjVar == null || xjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            qnVar.I1.getAdapter().U(charSequence2, qnVar.Y.getCursorPosition(), qnVar.u6, false, false);
        }
        j9.u uVar = qnVar.J5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            qnVar.J5 = null;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            fk fkVar = qnVar.Y;
            if (fkVar.Y2 && (!fkVar.p0() || !qnVar.Y.a2)) {
                if (z10) {
                    qnVar.cb(charSequence2, true);
                } else {
                    qnVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    qnVar.J5 = uVar2;
                    AndroidUtilities.runOnUIThread(uVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        pk pkVar = qnVar.xa;
        if (pkVar != null) {
            ArrayList arrayList = pkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ny) arrayList.get(i10)).n = true;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.l = true;
        }
        ah.d1 d1Var2 = ah.d1.C;
        if (d1Var2 != null) {
            d1Var2.l = true;
        }
        if (z11) {
            return;
        }
        aj ajVar = qnVar.g2;
        if ((ajVar != null && ajVar.getVisibility() == 0) || ((r40Var = qnVar.i2) != null && r40Var.getVisibility() == 0)) {
            aj ajVar2 = qnVar.g2;
            if (ajVar2 != null) {
                ajVar2.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = qnVar.i2;
            if (r40Var2 != null) {
                r40Var2.b(true);
                return;
            }
            return;
        }
        kf kfVar = qnVar.Oa;
        if (UserObject.isUserSelf(qnVar.f) || ((chatFull = qnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && qnVar.R3 == 0)) {
            z12 = true;
        }
        if (qnVar.j2 || qnVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || qnVar.Y.p0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(kfVar);
        AndroidUtilities.runOnUIThread(kfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
        this.c.zc();
    }

    @Override // org.telegram.ui.Components.og
    public final void i1() {
        org.telegram.ui.Components.r60 r60Var = this.c.b3;
        if (r60Var != null) {
            r60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean j1() {
        qn qnVar = this.c;
        TLRPC.User user = qnVar.f;
        return (user == null || UserObject.isUserSelf(user) || qnVar.f.bot || qnVar.h != null || qnVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void k() {
        org.telegram.ui.Components.hz0 hz0Var = this.c.d1;
        if (hz0Var != null) {
            hz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l1() {
        int i10;
        qn qnVar = this.c;
        Activity parentActivity = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        long j10 = qnVar.T5;
        MessageSuggestionParams messageSuggestionParams = qnVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new ai.h1(parentActivity, i10, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new xe(qnVar, 4)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final void m0() {
        org.telegram.ui.Components.hz0 hz0Var = this.c.d1;
        if (hz0Var != null) {
            hz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
        this.c.K6();
    }

    @Override // org.telegram.ui.Components.og
    public final void m2() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = qnVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        org.telegram.ui.ActionBar.x xVar2 = qnVar.e0;
        if (xVar2 != null) {
            xVar2.f(8);
        }
        ur urVar = qnVar.d0;
        if (urVar != null) {
            urVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
        int i10;
        int i11;
        qn qnVar = this.c;
        qnVar.Z6();
        fk fkVar = qnVar.Y;
        boolean z10 = fkVar.z3;
        org.telegram.ui.Components.dg dgVar = fkVar.U0;
        qnVar.yc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qcVar.l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        xj xjVar = qnVar.I1;
        float f7 = 0.0f;
        if (xjVar != null) {
            xjVar.animate().alpha((z10 || qnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.bs.f).start();
        }
        org.telegram.ui.Components.hz0 hz0Var = qnVar.d1;
        if (hz0Var != null) {
            hz0Var.setVisibility(0);
            ViewPropertyAnimator animate = qnVar.d1.animate();
            if (!z10 && !qnVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f).withEndAction(new ah.t(24, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean o() {
        return this.c.N6();
    }

    @Override // org.telegram.ui.Components.og
    public final void o1(View view, CharSequence charSequence, boolean z10) {
        qn qnVar = this.c;
        qnVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
        if (u0Var == null || u0Var.getVisibility() == 0) {
            return;
        }
        qnVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = qnVar.e0;
        if (xVar != null) {
            xVar.f(8);
        }
        ur urVar = qnVar.d0;
        if (urVar != null) {
            urVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final gn p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.og
    public final void q1(CharSequence charSequence) {
        this.c.cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void q2() {
        qn qnVar = this.c;
        ci.b3 b3Var = qnVar.J1;
        if (b3Var != null) {
            b3Var.L1(null, 0);
        }
        qnVar.ca();
    }

    @Override // org.telegram.ui.Components.og
    public final boolean r1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.f5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.x xVar = qnVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        if (TextUtils.isEmpty(qnVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = qnVar.e0;
            if (xVar2 != null) {
                xVar2.f(0);
            }
            ur urVar = qnVar.d0;
            if (urVar != null) {
                urVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int u() {
        return this.c.X0.R();
    }

    @Override // org.telegram.ui.Components.og
    public final void u1() {
        int i10;
        qn qnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(qnVar.T5, (int) qnVar.d());
        qnVar.f7(true);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void y() {
        boolean z10;
        qn qnVar = this.c;
        if (qnVar.y0 != null) {
            qnVar.b0 = qnVar.Y.getBackgroundTop();
        }
        xj xjVar = qnVar.I1;
        if (xjVar != null) {
            xjVar.getAdapter().f0 = true;
        }
        if (qnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new ti(this, 7), 30L);
        }
        if (qnVar.Y.r0()) {
            qnVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.Y.S0(true, true, z10);
        if (qnVar.o5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.o5, true);
            qnVar.o5 = 0;
        }
        qnVar.Cc(0, true);
        qnVar.lc(false);
        qnVar.ad(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void y1() {
        int i10;
        int i11;
        qn qnVar = this.c;
        if (qnVar.E9() || (i10 = qnVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = qnVar.getMessagesController();
        long j10 = qnVar.T5;
        long j11 = qnVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final void z(float f7) {
        qn qnVar = this.c;
        if (f7 != 0.0f) {
            qnVar.D4 = true;
        }
        qnVar.t9();
        qnVar.w9();
        qnVar.Qc(false, false);
        qnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || qnVar.Zb == null) {
            return;
        }
        qcVar.l();
    }
}
