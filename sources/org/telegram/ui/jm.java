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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ sn c;

    public jm(sn snVar) {
        this.c = snVar;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean B0() {
        int i10;
        sn snVar = this.c;
        if ((snVar.getMessagesController().isForum(snVar.a()) && !snVar.h4) || (i10 = snVar.R3) == 9 || snVar.S3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C(boolean z10) {
        int i10;
        int i11;
        sn snVar = this.c;
        if (!z10) {
            Activity parentActivity = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = snVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            snVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.c;
        if (snVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        final org.telegram.ui.ActionBar.y n10 = kVar.n();
        org.telegram.ui.Components.gz0 gz0Var = snVar.d1;
        if (gz0Var != null) {
            gz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.x xVar = snVar.i0;
            if (xVar.o == null) {
                xVar.o = 1;
                if (snVar.i0.l != 0) {
                    if (!(snVar.R3 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId()) && (snVar.R3 != 0 || (!(snVar.d4 == 0 || snVar.h4) || UserObject.isReplyUser(snVar.f) || snVar.F9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.f);
                        ofFloat.addListener(new im(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.hm
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
                        snVar.i0.f(0);
                        sn.S3(snVar);
                        org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
                        if (u0Var != null) {
                            u0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.x xVar2 = snVar.e0;
                        if (xVar2 != null) {
                            xVar2.f(8);
                        }
                        wr wrVar = snVar.d0;
                        if (wrVar != null) {
                            wrVar.b(false);
                        }
                    }
                }
            }
            snVar.A4 = i10;
            snVar.B4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.x xVar3 = snVar.i0;
        if (xVar3.o != null) {
            xVar3.o = null;
            if (xVar3.l != 8) {
                if (!(snVar.R3 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId()) && (snVar.R3 != 0 || (!(snVar.d4 == 0 || snVar.h4) || UserObject.isReplyUser(snVar.f) || snVar.F9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.bs.f);
                    ofFloat2.addListener(new im(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.hm
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
                snVar.i0.f(8);
                if (snVar.Y.i0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = snVar.h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar4 = snVar.e0;
                    if (xVar4 != null) {
                        xVar4.f(0);
                    }
                    wr wrVar2 = snVar.d0;
                    if (wrVar2 != null) {
                        wrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var3 = snVar.h0;
                if (u0Var3 != null) {
                    u0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.x xVar5 = snVar.e0;
                if (xVar5 != null) {
                    xVar5.f(8);
                }
                wr wrVar3 = snVar.d0;
                if (wrVar3 != null) {
                    wrVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void F0() {
        sn snVar = this.c;
        snVar.o9 = true;
        fm fmVar = snVar.A0;
        if (fmVar != null) {
            fmVar.K(true);
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
        sn snVar = this.c;
        ArrayList arrayList = snVar.u6;
        if (snVar.y0 != null) {
            snVar.b0 = snVar.Y.getBackgroundTop();
        }
        zj zjVar = snVar.I1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            snVar.I1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (snVar.S3 == -1) {
                snVar.S3 = 0;
            }
            if (charSequence != null) {
                snVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = snVar.f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                snVar.S3 += snVar.f5.forwardMessages.messages.size();
            }
            snVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = snVar.f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && snVar.f5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            snVar.f5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = snVar.getMessagesController().getPeer(snVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.xj0 xj0Var = ((org.telegram.ui.Components.nc) M.e).a;
                xj0Var.setScaleX(1.8f);
                xj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(snVar.e) && !snVar.h4 && (messageObject = snVar.n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, snVar.n5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                snVar.getMediaDataController().cleanDraft(snVar.T5, j11, false);
            }
        }
        snVar.Cb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        hk hkVar = snVar.Y;
        if (hkVar != null && hkVar.getEmojiView() != null && (f1Var = snVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (snVar.getMessagesController().premiumFeaturesBlocked() || snVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || snVar.getMessagesController().didPressTranscribeButtonEnough() || snVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.y31.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.c.ha;
    }

    @Override // org.telegram.ui.Components.og
    public final void Q0() {
        sn snVar = this.c;
        int sendingMessageId = snVar.getSendMessagesHelper().getSendingMessageId(snVar.T5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
        org.telegram.ui.Components.gz0 gz0Var = this.c.d1;
        if (gz0Var != null) {
            gz0Var.e();
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
        sn snVar = this.c;
        if (i10 < currentActionBarHeight) {
            snVar.Z4 = false;
            if (snVar.d1.getVisibility() == 0) {
                snVar.d1.setVisibility(4);
            }
        } else {
            snVar.Z4 = true;
            if (snVar.d1.getVisibility() == 4 && !snVar.isInPreviewMode()) {
                snVar.d1.setVisibility(0);
            }
        }
        snVar.a5 = true ^ snVar.Y.r0();
        int i11 = i10 + (snVar.Y.r0() ? 65536 : 0);
        if (this.a != i11) {
            snVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final void X0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        sn snVar = this.c;
        if (snVar.c3.getVisibility() != i11) {
            snVar.c3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void Y() {
        sn snVar = this.c;
        hk hkVar = snVar.Y;
        boolean z10 = hkVar.z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        ne.b bVar = snVar.yc;
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
        lm lmVar;
        int indexOfChild;
        sn snVar = this.c;
        if (snVar.getParentActivity() != null) {
            if ((snVar.e == null && snVar.a8 == null) || snVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.r40 r40Var = snVar.f2;
            if ((r40Var == null || r40Var.getVisibility() != 0) && (indexOfChild = (lmVar = snVar.X0).indexOfChild(snVar.S)) != -1) {
                try {
                    snVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (snVar.f2 == null) {
                    org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(9, snVar.getParentActivity(), snVar.ea, false);
                    snVar.f2 = r40Var2;
                    r40Var2.setVisibility(8);
                    lmVar.addView(snVar.f2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = snVar.a8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    snVar.f2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(snVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, snVar.f.first_name)));
                } else if (ChatObject.canSendVoice(snVar.e) || ChatObject.canSendRoundVideo(snVar.e)) {
                    if (ChatObject.isActionBannedByDefault(snVar.e, 20)) {
                        snVar.f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(snVar.e, 21)) {
                        snVar.f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(snVar.e, 7)) {
                        snVar.f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = snVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            snVar.f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            snVar.f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(snVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (snVar.N6()) {
                        return;
                    }
                    if (snVar.Y.c1) {
                        snVar.f2.setText(ChatObject.getRestrictedErrorText(snVar.e, 21));
                    } else {
                        snVar.f2.setText(ChatObject.getRestrictedErrorText(snVar.e, 20));
                    }
                }
                View sendButton = snVar.Y.getSendButton();
                View audioVideoButtonContainer = snVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                snVar.f2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void Z1(boolean z10) {
        sn snVar = this.c;
        View view = snVar.w2;
        if (view != null) {
            view.setVisibility(8);
        }
        snVar.b5 = !z10;
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
        sn snVar = this.c;
        if (snVar.b3 == null && CameraView.isCameraAllowed() && snVar.getParentActivity() != null) {
            Activity parentActivity = snVar.getParentActivity();
            qn qnVar = snVar.ea;
            int i13 = org.telegram.ui.Components.r60.e;
            ti.a aVar = ti.e.d;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.r60 l60Var = z11 ? new org.telegram.ui.Components.l60(parentActivity, snVar, qnVar) : new org.telegram.ui.Components.m60(parentActivity, snVar, qnVar, true);
            snVar.b3 = l60Var;
            l60Var.setAnimationCallback(new re(snVar, 0));
            snVar.b3.setTrimCallback(new re(snVar, 1));
            snVar.b3.setRecordingUiFrameCallback(new lj(snVar));
            snVar.b3.setClipToPadding(false);
            snVar.b3.g(snVar.J, snVar.w);
            int indexOfChild = snVar.X0.indexOfChild(snVar.S);
            if (indexOfChild < 0) {
                indexOfChild = snVar.X0.getChildCount();
            }
            snVar.X0.addView(snVar.b3, Math.min(indexOfChild + 1, snVar.X0.getChildCount()), w7.z5.e(-1, -1, 51));
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
        sn snVar = this.c;
        cj cjVar = snVar.g2;
        if (cjVar != null) {
            cjVar.b(true);
        }
        org.telegram.ui.Components.r40 r40Var = snVar.i2;
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
        sn snVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || snVar.Y.p0());
        zj zjVar = snVar.I1;
        if (zjVar == null || zjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            snVar.I1.getAdapter().U(charSequence2, snVar.Y.getCursorPosition(), snVar.u6, false, false);
        }
        j9.u uVar = snVar.J5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            snVar.J5 = null;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            hk hkVar = snVar.Y;
            if (hkVar.Y2 && (!hkVar.p0() || !snVar.Y.a2)) {
                if (z10) {
                    snVar.cb(charSequence2, true);
                } else {
                    snVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    snVar.J5 = uVar2;
                    AndroidUtilities.runOnUIThread(uVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        rk rkVar = snVar.xa;
        if (rkVar != null) {
            ArrayList arrayList = rkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((py) arrayList.get(i10)).n = true;
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
        cj cjVar = snVar.g2;
        if ((cjVar != null && cjVar.getVisibility() == 0) || ((r40Var = snVar.i2) != null && r40Var.getVisibility() == 0)) {
            cj cjVar2 = snVar.g2;
            if (cjVar2 != null) {
                cjVar2.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = snVar.i2;
            if (r40Var2 != null) {
                r40Var2.b(true);
                return;
            }
            return;
        }
        mf mfVar = snVar.Oa;
        if (UserObject.isUserSelf(snVar.f) || ((chatFull = snVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && snVar.R3 == 0)) {
            z12 = true;
        }
        if (snVar.j2 || snVar.h2 || z12 || SharedConfig.scheduledHintShows >= 3 || snVar.Y.p0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(mfVar);
        AndroidUtilities.runOnUIThread(mfVar, 4000L);
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
        sn snVar = this.c;
        TLRPC.User user = snVar.f;
        return (user == null || UserObject.isUserSelf(user) || snVar.f.bot || snVar.h != null || snVar.R3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void k() {
        org.telegram.ui.Components.gz0 gz0Var = this.c.d1;
        if (gz0Var != null) {
            gz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void l1() {
        int i10;
        sn snVar = this.c;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        long j10 = snVar.T5;
        MessageSuggestionParams messageSuggestionParams = snVar.g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new ai.h1(parentActivity, i10, j10, messageSuggestionParams, snVar, snVar.getResourceProvider(), 0, new ze(snVar, 4)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final void m0() {
        org.telegram.ui.Components.gz0 gz0Var = this.c.d1;
        if (gz0Var != null) {
            gz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
        this.c.K6();
    }

    @Override // org.telegram.ui.Components.og
    public final void m2() {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.x xVar = snVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        org.telegram.ui.ActionBar.x xVar2 = snVar.e0;
        if (xVar2 != null) {
            xVar2.f(8);
        }
        wr wrVar = snVar.d0;
        if (wrVar != null) {
            wrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
        int i10;
        int i11;
        sn snVar = this.c;
        snVar.Z6();
        hk hkVar = snVar.Y;
        boolean z10 = hkVar.z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        snVar.yc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = snVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qcVar.l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        zj zjVar = snVar.I1;
        float f7 = 0.0f;
        if (zjVar != null) {
            zjVar.animate().alpha((z10 || snVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.bs.f).start();
        }
        org.telegram.ui.Components.gz0 gz0Var = snVar.d1;
        if (gz0Var != null) {
            gz0Var.setVisibility(0);
            ViewPropertyAnimator animate = snVar.d1.animate();
            if (!z10 && !snVar.isInPreviewMode()) {
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
        sn snVar = this.c;
        snVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
        if (u0Var == null || u0Var.getVisibility() == 0) {
            return;
        }
        snVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.x xVar = snVar.e0;
        if (xVar != null) {
            xVar.f(8);
        }
        wr wrVar = snVar.d0;
        if (wrVar != null) {
            wrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final in p0() {
        return this.c.l5;
    }

    @Override // org.telegram.ui.Components.og
    public final void q1(CharSequence charSequence) {
        this.c.cb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void q2() {
        sn snVar = this.c;
        ci.a3 a3Var = snVar.J1;
        if (a3Var != null) {
            a3Var.L1(null, 0);
        }
        snVar.ca();
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
        sn snVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.x xVar = snVar.i0;
        if (xVar != null && !this.b) {
            xVar.f(8);
        }
        if (TextUtils.isEmpty(snVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.e0;
            if (xVar2 != null) {
                xVar2.f(0);
            }
            wr wrVar = snVar.d0;
            if (wrVar != null) {
                wrVar.b(true);
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
        sn snVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(snVar.T5, (int) snVar.d());
        snVar.f7(true);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void y() {
        boolean z10;
        sn snVar = this.c;
        if (snVar.y0 != null) {
            snVar.b0 = snVar.Y.getBackgroundTop();
        }
        zj zjVar = snVar.I1;
        if (zjVar != null) {
            zjVar.getAdapter().f0 = true;
        }
        if (snVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new vi(this, 7), 30L);
        }
        if (snVar.Y.r0()) {
            snVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.Y.S0(true, true, z10);
        if (snVar.o5 != 0) {
            snVar.getConnectionsManager().cancelRequest(snVar.o5, true);
            snVar.o5 = 0;
        }
        snVar.Cc(0, true);
        snVar.lc(false);
        snVar.ad(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void y1() {
        int i10;
        int i11;
        sn snVar = this.c;
        if (snVar.E9() || (i10 = snVar.R3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = snVar.getMessagesController();
        long j10 = snVar.T5;
        long j11 = snVar.d4;
        i11 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final void z(float f7) {
        sn snVar = this.c;
        if (f7 != 0.0f) {
            snVar.D4 = true;
        }
        snVar.t9();
        snVar.w9();
        snVar.Qc(false, false);
        snVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || snVar.Zb == null) {
            return;
        }
        qcVar.l();
    }
}
