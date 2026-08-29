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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class im implements org.telegram.ui.Components.hg {
    public int a;
    public boolean b;
    public final /* synthetic */ tn c;

    public im(tn tnVar) {
        this.c = tnVar;
    }

    @Override // org.telegram.ui.Components.hg
    public final void B() {
        this.c.Vb(true, false);
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean C0() {
        int i10;
        tn tnVar = this.c;
        if ((tnVar.getMessagesController().isForum(tnVar.a()) && !tnVar.d4) || (i10 = tnVar.N3) == 9 || tnVar.O3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        org.telegram.ui.Components.vw vwVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        tn tnVar = this.c;
        ArrayList arrayList = tnVar.q6;
        if (tnVar.u0 != null) {
            tnVar.X = tnVar.U.getBackgroundTop();
        }
        wj wjVar = tnVar.E1;
        if (wjVar != null && wjVar.getAdapter() != null) {
            tnVar.E1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (tnVar.O3 == -1) {
                tnVar.O3 = 0;
            }
            if (charSequence != null) {
                tnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = tnVar.b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                tnVar.O3 += tnVar.b5.forwardMessages.messages.size();
            }
            tnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = tnVar.b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && tnVar.b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            tnVar.b5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = tnVar.getMessagesController().getPeer(tnVar.P5);
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
                org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(tnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Components.jc) M.e).a;
                aj0Var.setScaleX(1.8f);
                aj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(tnVar.e) && !tnVar.d4 && (messageObject = tnVar.j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, tnVar.j5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                tnVar.getMediaDataController().cleanDraft(tnVar.P5, j11, false);
            }
        }
        tnVar.zb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        dk dkVar = tnVar.U;
        if (dkVar != null && dkVar.getEmojiView() != null && (vwVar = tnVar.U.getEmojiView().P0) != null) {
            if (vwVar.e) {
                MessagesController.getInstance(vwVar.a).sendTyping(vwVar.b, vwVar.c, 2, 0);
            }
            vwVar.f = -1L;
        }
        if (tnVar.getMessagesController().premiumFeaturesBlocked() || tnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || tnVar.getMessagesController().didPressTranscribeButtonEnough() || tnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.t21.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.c;
        if (tnVar.e0 == null) {
            return;
        }
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        final org.telegram.ui.ActionBar.a0 n10 = lVar.n();
        org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
        if (fy0Var != null) {
            fy0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.z zVar = tnVar.e0;
            if (zVar.o == null) {
                zVar.o = 1;
                if (tnVar.e0.l != 0) {
                    if (!(tnVar.N3 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId()) && (tnVar.N3 != 0 || (!(tnVar.Z3 == 0 || tnVar.d4) || UserObject.isReplyUser(tnVar.f) || tnVar.A9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.jr.f);
                        ofFloat.addListener(new hm(this, n10, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.gm
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
                        tnVar.e0.f(0);
                        tn.J3(tnVar);
                        org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.z zVar2 = tnVar.a0;
                        if (zVar2 != null) {
                            zVar2.f(8);
                        }
                        vr vrVar = tnVar.Z;
                        if (vrVar != null) {
                            vrVar.b(false);
                        }
                    }
                }
            }
            tnVar.w4 = i10;
            tnVar.x4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.z zVar3 = tnVar.e0;
        if (zVar3.o != null) {
            zVar3.o = null;
            if (zVar3.l != 8) {
                if (!(tnVar.N3 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId()) && (tnVar.N3 != 0 || (!(tnVar.Z3 == 0 || tnVar.d4) || UserObject.isReplyUser(tnVar.f) || tnVar.A9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.jr.f);
                    ofFloat2.addListener(new hm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.gm
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
                tnVar.e0.f(8);
                if (tnVar.U.k0() && TextUtils.isEmpty(tnVar.U.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.d0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar4 = tnVar.a0;
                    if (zVar4 != null) {
                        zVar4.f(0);
                    }
                    vr vrVar2 = tnVar.Z;
                    if (vrVar2 != null) {
                        vrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = tnVar.d0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.z zVar5 = tnVar.a0;
                if (zVar5 != null) {
                    zVar5.f(8);
                }
                vr vrVar3 = tnVar.Z;
                if (vrVar3 != null) {
                    vrVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final TLRPC.TL_channels_sendAsPeers G() {
        return this.c.da;
    }

    @Override // org.telegram.ui.Components.hg
    public final void G0() {
        tn tnVar = this.c;
        tnVar.k9 = true;
        em emVar = tnVar.w0;
        if (emVar != null) {
            emVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void G1() {
        int i10;
        int i11;
        tn tnVar = this.c;
        if (tnVar.z9() || (i10 = tnVar.N3) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = tnVar.getMessagesController();
        long j10 = tnVar.P5;
        long j11 = tnVar.Z3;
        i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.hg
    public final void I(float f9, int i10) {
        xk xkVar = this.c.X2;
        if (xkVar != null) {
            xkVar.e(f9, i10);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void K0() {
        this.c.ja(0, false);
    }

    @Override // org.telegram.ui.Components.hg
    public final void M() {
        tn tnVar = this.c;
        dk dkVar = tnVar.U;
        boolean z10 = dkVar.u3;
        org.telegram.ui.Components.xf xfVar = dkVar.Q0;
        boolean z11 = false;
        boolean z12 = xfVar != null && xfVar.getCurrentPage() == 0;
        vd.a aVar = tnVar.tc;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.hg
    public final void T0() {
        tn tnVar = this.c;
        int sendingMessageId = tnVar.getSendMessagesHelper().getSendingMessageId(tnVar.P5);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void U(boolean z10) {
        this.c.Vb(false, z10);
    }

    @Override // org.telegram.ui.Components.hg
    public final void a1(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        tn tnVar = this.c;
        if (tnVar.Y2.getVisibility() != i11) {
            tnVar.Y2.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final int b1() {
        return this.c.T0.getHeight();
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final void d2() {
        org.telegram.ui.Components.fy0 fy0Var = this.c.Z0;
        if (fy0Var != null) {
            fy0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void e() {
        this.c.vc();
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ boolean f1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final void f2(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        tn tnVar = this.c;
        if (i10 < currentActionBarHeight) {
            tnVar.V4 = false;
            if (tnVar.Z0.getVisibility() == 0) {
                tnVar.Z0.setVisibility(4);
            }
        } else {
            tnVar.V4 = true;
            if (tnVar.Z0.getVisibility() == 4 && !tnVar.isInPreviewMode()) {
                tnVar.Z0.setVisibility(0);
            }
        }
        tnVar.W4 = true ^ tnVar.U.t0();
        int i11 = i10 + (tnVar.U.t0() ? 65536 : 0);
        if (this.a != i11) {
            tnVar.X = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.hg
    public final void i() {
        org.telegram.ui.Components.fy0 fy0Var = this.c.Z0;
        if (fy0Var != null) {
            fy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean i1() {
        xk xkVar = this.c.X2;
        return (xkVar == null || xkVar.a0) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void i2() {
        km kmVar;
        int indexOfChild;
        tn tnVar = this.c;
        if (tnVar.getParentActivity() != null) {
            if ((tnVar.e == null && tnVar.W7 == null) || tnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.g40 g40Var = tnVar.b2;
            if ((g40Var == null || g40Var.getVisibility() != 0) && (indexOfChild = (kmVar = tnVar.T0).indexOfChild(tnVar.O)) != -1) {
                try {
                    tnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tnVar.b2 == null) {
                    org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(9, tnVar.getParentActivity(), tnVar.aa, false);
                    tnVar.b2 = g40Var2;
                    g40Var2.setVisibility(8);
                    kmVar.addView(tnVar.b2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = tnVar.W7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    tnVar.b2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(tnVar.U.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, tnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(tnVar.e) || ChatObject.canSendRoundVideo(tnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(tnVar.e, 20)) {
                        tnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(tnVar.e, 21)) {
                        tnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(tnVar.e, 7)) {
                        tnVar.b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = tnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            tnVar.b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            tnVar.b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(tnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (tnVar.K6()) {
                        return;
                    }
                    if (tnVar.U.Y0) {
                        tnVar.b2.setText(ChatObject.getRestrictedErrorText(tnVar.e, 21));
                    } else {
                        tnVar.b2.setText(ChatObject.getRestrictedErrorText(tnVar.e, 20));
                    }
                }
                View sendButton = tnVar.U.getSendButton();
                View audioVideoButtonContainer = tnVar.U.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                tnVar.b2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void k0() {
        org.telegram.ui.Components.fy0 fy0Var = this.c.Z0;
        if (fy0Var != null) {
            fy0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void k2(boolean z10) {
        tn tnVar = this.c;
        View view = tnVar.s2;
        if (view != null) {
            view.setVisibility(8);
        }
        tnVar.X4 = !z10;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean l() {
        return this.c.K6();
    }

    @Override // org.telegram.ui.Components.hg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.g40 g40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        tn tnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || tnVar.U.r0());
        wj wjVar = tnVar.E1;
        if (wjVar == null || wjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            tnVar.E1.getAdapter().U(charSequence2, tnVar.U.getCursorPosition(), tnVar.q6, false, false);
        }
        od.i iVar = tnVar.F5;
        if (iVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            tnVar.F5 = null;
        }
        TLRPC.Chat chat = tnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            dk dkVar = tnVar.U;
            if (dkVar.T2 && (!dkVar.r0() || !tnVar.U.V1)) {
                if (z10) {
                    tnVar.Ya(charSequence2, true);
                } else {
                    tnVar.M6(charSequence2);
                    od.i iVar2 = new od.i(1, this, charSequence2);
                    tnVar.F5 = iVar2;
                    AndroidUtilities.runOnUIThread(iVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        ok okVar = tnVar.ta;
        if (okVar != null) {
            ArrayList arrayList = okVar.B;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((qy) arrayList.get(i10)).n = true;
            }
        }
        kg.m0 m0Var = kg.m0.B;
        if (m0Var != null) {
            m0Var.l = true;
        }
        kg.m0 m0Var2 = kg.m0.C;
        if (m0Var2 != null) {
            m0Var2.l = true;
        }
        if (z11) {
            return;
        }
        zi ziVar = tnVar.c2;
        if ((ziVar != null && ziVar.getVisibility() == 0) || ((g40Var = tnVar.e2) != null && g40Var.getVisibility() == 0)) {
            zi ziVar2 = tnVar.c2;
            if (ziVar2 != null) {
                ziVar2.b(true);
            }
            org.telegram.ui.Components.g40 g40Var2 = tnVar.e2;
            if (g40Var2 != null) {
                g40Var2.b(true);
                return;
            }
            return;
        }
        df dfVar = tnVar.Ja;
        if (UserObject.isUserSelf(tnVar.f) || ((chatFull = tnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && tnVar.N3 == 0)) {
            z12 = true;
        }
        if (tnVar.f2 || tnVar.d2 || z12 || SharedConfig.scheduledHintShows >= 3 || tnVar.U.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(dfVar);
        AndroidUtilities.runOnUIThread(dfVar, 4000L);
    }

    @Override // org.telegram.ui.Components.hg
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        tn tnVar = this.c;
        if (tnVar.X2 == null && CameraView.isCameraAllowed() && tnVar.getParentActivity() != null) {
            xk xkVar = new xk(tnVar, tnVar.getParentActivity(), tnVar, tnVar.aa);
            tnVar.X2 = xkVar;
            xkVar.setClipToPadding(false);
            xk xkVar2 = tnVar.X2;
            lg.a aVar = tnVar.F;
            aj ajVar = tnVar.w;
            LinearLayout linearLayout = xkVar2.N0;
            ng.d c3 = aVar.c(linearLayout, ajVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(c3);
            int indexOfChild = tnVar.T0.indexOfChild(tnVar.O);
            if (indexOfChild < 0) {
                indexOfChild = tnVar.T0.getChildCount();
            }
            tnVar.T0.addView(tnVar.X2, Math.min(indexOfChild + 1, tnVar.T0.getChildCount()), i7.f6.e(-1, -1, 51));
        }
        xk xkVar3 = tnVar.X2;
        if (xkVar3 != null) {
            if (i10 == 0) {
                xkVar3.l(false);
                tnVar.t0.B0();
                tnVar.w0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                xkVar3.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                xkVar3.d(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final int m() {
        return this.c.T0.R();
    }

    @Override // org.telegram.ui.Components.hg
    public final void n1() {
        xk xkVar = this.c.X2;
        if (xkVar != null) {
            xkVar.q();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final jn o0() {
        return this.c.h5;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean o1() {
        tn tnVar = this.c;
        TLRPC.User user = tnVar.f;
        return (user == null || UserObject.isUserSelf(user) || tnVar.f.bot || tnVar.h != null || tnVar.N3 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void o2() {
        tn tnVar = this.c;
        zi ziVar = tnVar.c2;
        if (ziVar != null) {
            ziVar.b(true);
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.e2;
        if (g40Var != null) {
            g40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.hg
    public final void q1() {
        int i10;
        tn tnVar = this.c;
        Activity parentActivity = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        long j10 = tnVar.P5;
        MessageSuggestionParams messageSuggestionParams = tnVar.c5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new jh.s0(parentActivity, i10, j10, messageSuggestionParams, tnVar, tnVar.getResourceProvider(), 0, new qe(tnVar, 3)).show();
    }

    @Override // org.telegram.ui.Components.hg
    public final void r() {
        boolean z10;
        tn tnVar = this.c;
        if (tnVar.u0 != null) {
            tnVar.X = tnVar.U.getBackgroundTop();
        }
        wj wjVar = tnVar.E1;
        if (wjVar != null) {
            wjVar.getAdapter().b0 = true;
        }
        if (tnVar.l5 != null) {
            AndroidUtilities.runOnUIThread(new ui(this, 6), 30L);
        }
        if (tnVar.U.t0()) {
            tnVar.U.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        tnVar.U.V0(true, true, z10);
        if (tnVar.k5 != 0) {
            tnVar.getConnectionsManager().cancelRequest(tnVar.k5, true);
            tnVar.k5 = 0;
        }
        tnVar.yc(0, true);
        tnVar.hc(false);
        tnVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.hg
    public final void r1() {
        this.c.H6();
    }

    @Override // org.telegram.ui.Components.hg
    public final void s0() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.c;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.z zVar = tnVar.e0;
        if (zVar != null && !this.b) {
            zVar.f(8);
        }
        if (TextUtils.isEmpty(tnVar.U.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = tnVar.a0;
            if (zVar2 != null) {
                zVar2.f(0);
            }
            vr vrVar = tnVar.Z;
            if (vrVar != null) {
                vrVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void s1() {
        int i10;
        int i11;
        tn tnVar = this.c;
        tnVar.W6();
        dk dkVar = tnVar.U;
        boolean z10 = dkVar.u3;
        org.telegram.ui.Components.xf xfVar = dkVar.Q0;
        tnVar.tc.a(z10 && !(xfVar != null && xfVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = tnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
            if (mcVar != null && mcVar.l) {
                mcVar.b();
            }
        } else {
            Activity parentActivity2 = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        wj wjVar = tnVar.E1;
        float f9 = 0.0f;
        if (wjVar != null) {
            wjVar.animate().alpha((z10 || tnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.jr.f).start();
        }
        org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
        if (fy0Var != null) {
            fy0Var.setVisibility(0);
            ViewPropertyAnimator animate = tnVar.Z0.animate();
            if (!z10 && !tnVar.isInPreviewMode()) {
                f9 = 1.0f;
            }
            animate.alpha(f9).setInterpolator(org.telegram.ui.Components.jr.f).withEndAction(new hh.f(23, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        tn tnVar = this.c;
        tnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        tnVar.d0.setVisibility(0);
        org.telegram.ui.ActionBar.z zVar = tnVar.a0;
        if (zVar != null) {
            zVar.f(8);
        }
        vr vrVar = tnVar.Z;
        if (vrVar != null) {
            vrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void v(float f9) {
        tn tnVar = this.c;
        if (f9 != 0.0f) {
            tnVar.z4 = true;
        }
        tnVar.o9();
        tnVar.r9();
        tnVar.Mc(false, false);
        tnVar.T0.invalidate();
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
        if (mcVar == null || tnVar.Vb == null) {
            return;
        }
        mcVar.l();
    }

    @Override // org.telegram.ui.Components.hg
    public final void v1(CharSequence charSequence) {
        this.c.Ya(charSequence, true);
    }

    @Override // org.telegram.ui.Components.hg
    public final void v2() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.c;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (lVar.j0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.z zVar = tnVar.e0;
        if (zVar != null && !this.b) {
            zVar.f(8);
        }
        org.telegram.ui.ActionBar.z zVar2 = tnVar.a0;
        if (zVar2 != null) {
            zVar2.f(8);
        }
        vr vrVar = tnVar.Z;
        if (vrVar != null) {
            vrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.b5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final void x(boolean z10) {
        int i10;
        int i11;
        tn tnVar = this.c;
        if (!z10) {
            Activity parentActivity = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = tnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            tnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final void z1() {
        int i10;
        tn tnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(tnVar.P5, (int) tnVar.b());
        tnVar.c7(true);
    }

    @Override // org.telegram.ui.Components.hg
    public final void z2() {
        tn tnVar = this.c;
        lh.s2 s2Var = tnVar.F1;
        if (s2Var != null) {
            s2Var.I1(null, 0);
        }
        tnVar.X9();
    }
}
