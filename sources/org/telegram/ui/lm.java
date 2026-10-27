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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ wn c;

    public lm(wn wnVar) {
        this.c = wnVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ig.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        wn wnVar = this.c;
        ArrayList arrayList = wnVar.K6;
        if (wnVar.y0 != null) {
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
        bk bkVar = wnVar.U1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            wnVar.U1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (wnVar.e4 == -1) {
                wnVar.e4 = 0;
            }
            if (charSequence != null) {
                wnVar.e4++;
            }
            MessagePreviewParams messagePreviewParams2 = wnVar.v5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                wnVar.e4 += wnVar.v5.forwardMessages.messages.size();
            }
            wnVar.Vc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = wnVar.v5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && wnVar.v5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            wnVar.v5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = wnVar.getMessagesController().getPeer(wnVar.j6);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Components.nc) M.e).a;
                bk0Var.setScaleX(1.8f);
                bk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(wnVar.e) && !wnVar.t4 && (messageObject = wnVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, wnVar.D5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                wnVar.getMediaDataController().cleanDraft(wnVar.j6, j11, false);
            }
        }
        wnVar.Ob(false, null, null, null, z10, i10, null, false, j10, true);
        jk jkVar = wnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (f1Var = wnVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (wnVar.getMessagesController().premiumFeaturesBlocked() || wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || wnVar.getMessagesController().didPressTranscribeButtonEnough() || wnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.m41.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers B() {
        return this.c.xa;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(float f7, int i10) {
        org.telegram.ui.Components.u60 u60Var = this.c.n3;
        if (u60Var != null) {
            u60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
        wn wnVar = this.c;
        jk jkVar = wnVar.Y;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        oe.b bVar = wnVar.Yc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void H0() {
        wn wnVar = this.c;
        int sendingMessageId = wnVar.getSendMessagesHelper().getSendingMessageId(wnVar.j6);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void J1() {
        org.telegram.ui.Components.uz0 uz0Var = this.c.p1;
        if (uz0Var != null) {
            uz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void L1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        wn wnVar = this.c;
        if (i10 < currentActionBarHeight) {
            wnVar.p5 = false;
            if (wnVar.p1.getVisibility() == 0) {
                wnVar.p1.setVisibility(4);
            }
        } else {
            wnVar.p5 = true;
            if (wnVar.p1.getVisibility() == 4 && !wnVar.isInPreviewMode()) {
                wnVar.p1.setVisibility(0);
            }
        }
        wnVar.q5 = true ^ wnVar.Y.p0();
        int i11 = i10 + (wnVar.Y.p0() ? 65536 : 0);
        if (this.a != i11) {
            wnVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final void M0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        wn wnVar = this.c;
        if (wnVar.o3.getVisibility() != i11) {
            wnVar.o3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int N0() {
        return this.c.j1.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void N1() {
        om omVar;
        int indexOfChild;
        wn wnVar = this.c;
        if (wnVar.getParentActivity() != null) {
            if ((wnVar.e == null && wnVar.q8 == null) || wnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var = wnVar.r2;
            if ((t40Var == null || t40Var.getVisibility() != 0) && (indexOfChild = (omVar = wnVar.j1).indexOfChild(wnVar.S)) != -1) {
                try {
                    wnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (wnVar.r2 == null) {
                    org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(9, wnVar.getParentActivity(), wnVar.ua, false);
                    wnVar.r2 = t40Var2;
                    t40Var2.setVisibility(8);
                    omVar.addView(wnVar.r2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = wnVar.q8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    wnVar.r2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(wnVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, wnVar.f.first_name)));
                } else if (ChatObject.canSendVoice(wnVar.e) || ChatObject.canSendRoundVideo(wnVar.e)) {
                    if (ChatObject.isActionBannedByDefault(wnVar.e, 20)) {
                        wnVar.r2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 21)) {
                        wnVar.r2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 7)) {
                        wnVar.r2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wnVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            wnVar.r2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            wnVar.r2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(wnVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (wnVar.T6()) {
                        return;
                    }
                    if (wnVar.Y.c1) {
                        wnVar.r2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 21));
                    } else {
                        wnVar.r2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 20));
                    }
                }
                View sendButton = wnVar.Y.getSendButton();
                View audioVideoButtonContainer = wnVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                wnVar.r2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void O1(boolean z10) {
        wn wnVar = this.c;
        View view = wnVar.I2;
        if (view != null) {
            view.setVisibility(8);
        }
        wnVar.r5 = !z10;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        wn wnVar = this.c;
        if (wnVar.n3 == null && CameraView.isCameraAllowed() && wnVar.getParentActivity() != null) {
            Activity parentActivity = wnVar.getParentActivity();
            un unVar = wnVar.ua;
            org.telegram.ui.Components.u60 o60Var = org.telegram.ui.Components.u60.d(UserConfig.selectedAccount) ? new org.telegram.ui.Components.o60(parentActivity, wnVar, unVar) : new org.telegram.ui.Components.p60(parentActivity, wnVar, unVar, true);
            wnVar.n3 = o60Var;
            o60Var.setAnimationCallback(new qe(wnVar, 0));
            wnVar.n3.setTrimCallback(new qe(wnVar, 1));
            wnVar.n3.setRecordingUiFrameCallback(new nj(wnVar));
            wnVar.n3.setClipToPadding(false);
            wnVar.n3.h(wnVar.J, wnVar.w);
            int indexOfChild = wnVar.j1.indexOfChild(wnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = wnVar.j1.getChildCount();
            }
            wnVar.j1.addView(wnVar.n3, Math.min(indexOfChild + 1, wnVar.j1.getChildCount()), org.telegram.ui.Components.kb1.i(-1, -1, 51));
        }
        org.telegram.ui.Components.u60 u60Var = wnVar.n3;
        if (u60Var != null) {
            if (i10 == 0) {
                u60Var.i(false);
                wnVar.x0.C0();
                wnVar.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                u60Var.g(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                u60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void R(boolean z10) {
        this.c.lc(false, z10);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean T0() {
        org.telegram.ui.Components.u60 u60Var = this.c.n3;
        return u60Var != null && u60Var.e();
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
        wn wnVar = this.c;
        ej ejVar = wnVar.s2;
        if (ejVar != null) {
            ejVar.b(true);
        }
        org.telegram.ui.Components.t40 t40Var = wnVar.u2;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void U() {
        org.telegram.ui.Components.uz0 uz0Var = this.c.p1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.t40 t40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        wn wnVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || wnVar.Y.n0());
        bk bkVar = wnVar.U1;
        if (bkVar == null || bkVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            wnVar.U1.getAdapter().U(charSequence2, wnVar.Y.getCursorPosition(), wnVar.K6, false, false);
        }
        k9.u uVar = wnVar.Z5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            wnVar.Z5 = null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = wnVar.Y;
            if (jkVar.Y2 && (!jkVar.n0() || !wnVar.Y.a2)) {
                if (z10) {
                    wnVar.lb(charSequence2, true);
                } else {
                    wnVar.V6(charSequence2);
                    k9.u uVar2 = new k9.u(this, charSequence2, false, 22);
                    wnVar.Z5 = uVar2;
                    AndroidUtilities.runOnUIThread(uVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        tk tkVar = wnVar.Na;
        if (tkVar != null) {
            ArrayList arrayList = tkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((py) arrayList.get(i10)).n = true;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.l = true;
        }
        bh.s0 s0Var2 = bh.s0.C;
        if (s0Var2 != null) {
            s0Var2.l = true;
        }
        if (z11) {
            return;
        }
        ej ejVar = wnVar.s2;
        if ((ejVar != null && ejVar.getVisibility() == 0) || ((t40Var = wnVar.u2) != null && t40Var.getVisibility() == 0)) {
            ej ejVar2 = wnVar.s2;
            if (ejVar2 != null) {
                ejVar2.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = wnVar.u2;
            if (t40Var2 != null) {
                t40Var2.b(true);
                return;
            }
            return;
        }
        ig igVar = wnVar.eb;
        if (UserObject.isUserSelf(wnVar.f) || ((chatFull = wnVar.p8) != null && chatFull.slowmode_next_send_date > 0 && wnVar.d4 == 0)) {
            z12 = true;
        }
        if (wnVar.v2 || wnVar.t2 || z12 || SharedConfig.scheduledHintShows >= 3 || wnVar.Y.n0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(igVar);
        AndroidUtilities.runOnUIThread(igVar, 4000L);
    }

    @Override // org.telegram.ui.Components.og
    public final void X0() {
        org.telegram.ui.Components.u60 u60Var = this.c.n3;
        if (u60Var != null) {
            u60Var.j();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean Y0() {
        wn wnVar = this.c;
        TLRPC.User user = wnVar.f;
        return (user == null || UserObject.isUserSelf(user) || wnVar.f.bot || wnVar.h != null || wnVar.d4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = wnVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = wnVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        as asVar = wnVar.d0;
        if (asVar != null) {
            asVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void a1() {
        int i10;
        wn wnVar = this.c;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        long j10 = wnVar.j6;
        MessageSuggestionParams messageSuggestionParams = wnVar.w5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new bi.g1(parentActivity, i10, j10, messageSuggestionParams, wnVar, wnVar.getResourceProvider(), 0, new ye(wnVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final void b() {
        this.c.Mc();
    }

    @Override // org.telegram.ui.Components.og
    public final void b1() {
        this.c.Q6();
    }

    @Override // org.telegram.ui.Components.og
    public final void c1() {
        int i10;
        int i11;
        wn wnVar = this.c;
        wnVar.f7();
        jk jkVar = wnVar.Y;
        boolean z10 = jkVar.z3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        wnVar.Yc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
            if (qcVar != null && qcVar.m) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        bk bkVar = wnVar.U1;
        float f7 = 0.0f;
        if (bkVar != null) {
            bkVar.animate().alpha((z10 || wnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.ds.f).start();
        }
        org.telegram.ui.Components.uz0 uz0Var = wnVar.p1;
        if (uz0Var != null) {
            uz0Var.setVisibility(0);
            ViewPropertyAnimator animate = wnVar.p1.animate();
            if (!z10 && !wnVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f).withEndAction(new bh.n(24, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void c2() {
        wn wnVar = this.c;
        di.a3 a3Var = wnVar.V1;
        if (a3Var != null) {
            a3Var.P1(null, 0);
        }
        wnVar.ka();
    }

    @Override // org.telegram.ui.Components.og
    public final void e() {
        org.telegram.ui.Components.uz0 uz0Var = this.c.p1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void e1(View view, CharSequence charSequence, boolean z10) {
        wn wnVar = this.c;
        wnVar.ic(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        wnVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = wnVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        as asVar = wnVar.d0;
        if (asVar != null) {
            asVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        return this.c.T6();
    }

    @Override // org.telegram.ui.Components.og
    public final int g() {
        return this.c.j1.Q();
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence) {
        this.c.lb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean h1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.v5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final mn i0() {
        return this.c.B5;
    }

    @Override // org.telegram.ui.Components.og
    public final void j1() {
        int i10;
        wn wnVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(wnVar.j6, (int) wnVar.b());
        wnVar.l7(true);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = wnVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = wnVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            as asVar = wnVar.d0;
            if (asVar != null) {
                asVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void o() {
        boolean z10;
        wn wnVar = this.c;
        if (wnVar.y0 != null) {
            wnVar.b0 = wnVar.Y.getBackgroundTop();
        }
        bk bkVar = wnVar.U1;
        if (bkVar != null) {
            bkVar.getAdapter().f0 = true;
        }
        if (wnVar.F5 != null) {
            AndroidUtilities.runOnUIThread(new xi(this, 7), 30L);
        }
        if (wnVar.Y.p0()) {
            wnVar.Y.a1();
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.Y.R0(true, true, z10);
        if (wnVar.E5 != 0) {
            wnVar.getConnectionsManager().cancelRequest(wnVar.E5, true);
            wnVar.E5 = 0;
        }
        wnVar.Pc(0, true);
        wnVar.yc(false);
        wnVar.nd(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void o1() {
        int i10;
        int i11;
        wn wnVar = this.c;
        if (wnVar.L9() || (i10 = wnVar.d4) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = wnVar.getMessagesController();
        long j10 = wnVar.j6;
        long j11 = wnVar.p4;
        i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean p0() {
        int i10;
        wn wnVar = this.c;
        if ((wnVar.getMessagesController().isForum(wnVar.a()) && !wnVar.t4) || (i10 = wnVar.d4) == 9 || wnVar.e4 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void t(float f7) {
        wn wnVar = this.c;
        if (f7 != 0.0f) {
            wnVar.P4 = true;
        }
        wnVar.A9();
        wnVar.C9();
        wnVar.dd(false, false);
        wnVar.j1.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar == null || wnVar.zc == null) {
            return;
        }
        qcVar.l();
    }

    @Override // org.telegram.ui.Components.og
    public final void v0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.c;
        if (wnVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        final org.telegram.ui.ActionBar.z l4 = kVar.l();
        org.telegram.ui.Components.uz0 uz0Var = wnVar.p1;
        if (uz0Var != null) {
            uz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = wnVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (wnVar.i0.l != 0) {
                    if (!(wnVar.d4 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId()) && (wnVar.d4 != 0 || (!(wnVar.p4 == 0 || wnVar.t4) || UserObject.isReplyUser(wnVar.f) || wnVar.M9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                        ofFloat.addListener(new km(this, l4, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.jm
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        ofFloat.start();
                    } else {
                        wnVar.i0.f(0);
                        wn.U3(wnVar);
                        org.telegram.ui.ActionBar.w0 w0Var = wnVar.h0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = wnVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        as asVar = wnVar.d0;
                        if (asVar != null) {
                            asVar.b(false);
                        }
                    }
                }
            }
            wnVar.M4 = i10;
            wnVar.N4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = wnVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(wnVar.d4 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId()) && (wnVar.d4 != 0 || (!(wnVar.p4 == 0 || wnVar.t4) || UserObject.isReplyUser(wnVar.f) || wnVar.M9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f);
                    ofFloat2.addListener(new km(this, l4, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.jm
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ofFloat2.start();
                    return;
                }
                wnVar.i0.f(8);
                if (wnVar.Y.g0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = wnVar.h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = wnVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    as asVar2 = wnVar.d0;
                    if (asVar2 != null) {
                        asVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = wnVar.h0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = wnVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                as asVar3 = wnVar.d0;
                if (asVar3 != null) {
                    asVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void w(boolean z10) {
        int i10;
        int i11;
        wn wnVar = this.c;
        if (!z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            wnVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void x0() {
        wn wnVar = this.c;
        wnVar.E9 = true;
        hm hmVar = wnVar.A0;
        if (hmVar != null) {
            hmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void z() {
        this.c.lc(true, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void z0() {
        this.c.wa(0, false);
    }
}
