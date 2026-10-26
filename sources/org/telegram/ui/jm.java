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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jm implements org.telegram.ui.Components.og {
    public int a;
    public boolean b;
    public final /* synthetic */ un c;

    public jm(un unVar) {
        this.c = unVar;
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
        un unVar = this.c;
        ArrayList arrayList = unVar.G6;
        if (unVar.y0 != null) {
            unVar.b0 = unVar.Y.getBackgroundTop();
        }
        zj zjVar = unVar.U1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            unVar.U1.getAdapter().w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (unVar.e4 == -1) {
                unVar.e4 = 0;
            }
            if (charSequence != null) {
                unVar.e4++;
            }
            MessagePreviewParams messagePreviewParams2 = unVar.r5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                unVar.e4 += unVar.r5.forwardMessages.messages.size();
            }
            unVar.Rc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = unVar.r5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && unVar.r5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            unVar.r5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = unVar.getMessagesController().getPeer(unVar.f6);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.ak0 ak0Var = ((org.telegram.ui.Components.nc) M.e).a;
                ak0Var.setScaleX(1.8f);
                ak0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(unVar.e) && !unVar.t4 && (messageObject = unVar.z5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                topicId = tL_forumTopic.id;
            } else {
                i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, unVar.z5.messageOwner, true);
            }
            long j11 = topicId;
            if (j11 != 0) {
                unVar.getMediaDataController().cleanDraft(unVar.f6, j11, false);
            }
        }
        unVar.Kb(false, null, null, null, z10, i10, null, false, j10, true);
        hk hkVar = unVar.Y;
        if (hkVar != null && hkVar.getEmojiView() != null && (f1Var = unVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.a).sendTyping(f1Var.b, f1Var.c, 2, 0);
            }
            f1Var.f = -1L;
        }
        if (unVar.getMessagesController().premiumFeaturesBlocked() || unVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || unVar.getMessagesController().didPressTranscribeButtonEnough() || unVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.l41.u(messageObject3, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final TLRPC.TL_channels_sendAsPeers B() {
        return this.c.ta;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(float f7, int i10) {
        org.telegram.ui.Components.t60 t60Var = this.c.n3;
        if (t60Var != null) {
            t60Var.b(f7, i10);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
        un unVar = this.c;
        hk hkVar = unVar.Y;
        boolean z10 = hkVar.z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        boolean z11 = false;
        boolean z12 = dgVar != null && dgVar.getCurrentPage() == 0;
        oe.b bVar = unVar.Uc;
        if (z10 && !z12) {
            z11 = true;
        }
        bVar.a(z11, true);
    }

    @Override // org.telegram.ui.Components.og
    public final void H0() {
        un unVar = this.c;
        int sendingMessageId = unVar.getSendMessagesHelper().getSendingMessageId(unVar.f6);
        if (sendingMessageId != 0) {
            this.c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void J1() {
        org.telegram.ui.Components.tz0 tz0Var = this.c.p1;
        if (tz0Var != null) {
            tz0Var.e();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void L1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        un unVar = this.c;
        if (i10 < currentActionBarHeight) {
            unVar.l5 = false;
            if (unVar.p1.getVisibility() == 0) {
                unVar.p1.setVisibility(4);
            }
        } else {
            unVar.l5 = true;
            if (unVar.p1.getVisibility() == 4 && !unVar.isInPreviewMode()) {
                unVar.p1.setVisibility(0);
            }
        }
        unVar.m5 = true ^ unVar.Y.q0();
        int i11 = i10 + (unVar.Y.q0() ? 65536 : 0);
        if (this.a != i11) {
            unVar.b0 = 0;
        }
        this.a = i11;
    }

    @Override // org.telegram.ui.Components.og
    public final void M0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        un unVar = this.c;
        if (unVar.o3.getVisibility() != i11) {
            unVar.o3.setVisibility(i11);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final int N0() {
        return this.c.j1.getHeight();
    }

    @Override // org.telegram.ui.Components.og
    public final void N1() {
        mm mmVar;
        int indexOfChild;
        un unVar = this.c;
        if (unVar.getParentActivity() != null) {
            if ((unVar.e == null && unVar.m8 == null) || unVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var = unVar.r2;
            if ((t40Var == null || t40Var.getVisibility() != 0) && (indexOfChild = (mmVar = unVar.j1).indexOfChild(unVar.S)) != -1) {
                try {
                    unVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (unVar.r2 == null) {
                    org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(9, unVar.getParentActivity(), unVar.qa, false);
                    unVar.r2 = t40Var2;
                    t40Var2.setVisibility(8);
                    mmVar.addView(unVar.r2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = unVar.m8;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    unVar.r2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(unVar.Y.c1 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, unVar.f.first_name)));
                } else if (ChatObject.canSendVoice(unVar.e) || ChatObject.canSendRoundVideo(unVar.e)) {
                    if (ChatObject.isActionBannedByDefault(unVar.e, 20)) {
                        unVar.r2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(unVar.e, 21)) {
                        unVar.r2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(unVar.e, 7)) {
                        unVar.r2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = unVar.e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            unVar.r2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            unVar.r2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(unVar.e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (unVar.R6()) {
                        return;
                    }
                    if (unVar.Y.c1) {
                        unVar.r2.setText(ChatObject.getRestrictedErrorText(unVar.e, 21));
                    } else {
                        unVar.r2.setText(ChatObject.getRestrictedErrorText(unVar.e, 20));
                    }
                }
                View sendButton = unVar.Y.getSendButton();
                View audioVideoButtonContainer = unVar.Y.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                unVar.r2.f(sendButton, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void O1(boolean z10) {
        un unVar = this.c;
        View view = unVar.I2;
        if (view != null) {
            view.setVisibility(8);
        }
        unVar.n5 = !z10;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        un unVar = this.c;
        if (unVar.n3 == null && CameraView.isCameraAllowed() && unVar.getParentActivity() != null) {
            Activity parentActivity = unVar.getParentActivity();
            sn snVar = unVar.qa;
            int i13 = org.telegram.ui.Components.t60.e;
            wi.a aVar = wi.e.d;
            aVar.a();
            if (aVar.c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            org.telegram.ui.Components.t60 n60Var = z11 ? new org.telegram.ui.Components.n60(parentActivity, unVar, snVar) : new org.telegram.ui.Components.o60(parentActivity, unVar, snVar, true);
            unVar.n3 = n60Var;
            n60Var.setAnimationCallback(new pe(unVar, 0));
            unVar.n3.setTrimCallback(new pe(unVar, 1));
            unVar.n3.setRecordingUiFrameCallback(new kj(unVar));
            unVar.n3.setClipToPadding(false);
            unVar.n3.g(unVar.J, unVar.w);
            int indexOfChild = unVar.j1.indexOfChild(unVar.S);
            if (indexOfChild < 0) {
                indexOfChild = unVar.j1.getChildCount();
            }
            unVar.j1.addView(unVar.n3, Math.min(indexOfChild + 1, unVar.j1.getChildCount()), org.telegram.ui.Components.gb1.i(-1, -1, 51));
        }
        org.telegram.ui.Components.t60 t60Var = this.c.n3;
        if (t60Var != null) {
            if (i10 == 0) {
                t60Var.h(false);
                this.c.x0.C0();
                this.c.A0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                t60Var.f(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                t60Var.a(i10 == 2);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void R(boolean z10) {
        this.c.hc(false, z10);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean T0() {
        org.telegram.ui.Components.t60 t60Var = this.c.n3;
        return t60Var != null && t60Var.d();
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
        un unVar = this.c;
        bj bjVar = unVar.s2;
        if (bjVar != null) {
            bjVar.b(true);
        }
        org.telegram.ui.Components.t40 t40Var = unVar.u2;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void U() {
        org.telegram.ui.Components.tz0 tz0Var = this.c.p1;
        if (tz0Var != null) {
            tz0Var.f();
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
        un unVar = this.c;
        mediaController.setInputFieldHasText(!isEmpty || unVar.Y.o0());
        zj zjVar = unVar.U1;
        if (zjVar == null || zjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            unVar.U1.getAdapter().U(charSequence2, unVar.Y.getCursorPosition(), unVar.G6, false, false);
        }
        k9.u uVar = unVar.V5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            unVar.V5 = null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            hk hkVar = unVar.Y;
            if (hkVar.Y2 && (!hkVar.o0() || !unVar.Y.a2)) {
                if (z10) {
                    unVar.hb(charSequence2, true);
                } else {
                    unVar.T6(charSequence2);
                    k9.u uVar2 = new k9.u(this, charSequence2, false, 22);
                    unVar.V5 = uVar2;
                    AndroidUtilities.runOnUIThread(uVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        rk rkVar = unVar.Ja;
        if (rkVar != null) {
            ArrayList arrayList = rkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ny) arrayList.get(i10)).n = true;
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
        bj bjVar = unVar.s2;
        if ((bjVar != null && bjVar.getVisibility() == 0) || ((t40Var = unVar.u2) != null && t40Var.getVisibility() == 0)) {
            bj bjVar2 = unVar.s2;
            if (bjVar2 != null) {
                bjVar2.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = unVar.u2;
            if (t40Var2 != null) {
                t40Var2.b(true);
                return;
            }
            return;
        }
        jg jgVar = unVar.ab;
        if (UserObject.isUserSelf(unVar.f) || ((chatFull = unVar.l8) != null && chatFull.slowmode_next_send_date > 0 && unVar.d4 == 0)) {
            z12 = true;
        }
        if (unVar.v2 || unVar.t2 || z12 || SharedConfig.scheduledHintShows >= 3 || unVar.Y.o0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(jgVar);
        AndroidUtilities.runOnUIThread(jgVar, 4000L);
    }

    @Override // org.telegram.ui.Components.og
    public final void X0() {
        org.telegram.ui.Components.t60 t60Var = this.c.n3;
        if (t60Var != null) {
            t60Var.i();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean Y0() {
        un unVar = this.c;
        TLRPC.User user = unVar.f;
        return (user == null || UserObject.isUserSelf(user) || unVar.f.bot || unVar.h != null || unVar.d4 != 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = unVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = unVar.e0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        yr yrVar = unVar.d0;
        if (yrVar != null) {
            yrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void a1() {
        int i10;
        un unVar = this.c;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        long j10 = unVar.f6;
        MessageSuggestionParams messageSuggestionParams = unVar.s5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new bi.g1(parentActivity, i10, j10, messageSuggestionParams, unVar, unVar.getResourceProvider(), 0, new ye(unVar, 1)).show();
    }

    @Override // org.telegram.ui.Components.og
    public final void b() {
        this.c.Ic();
    }

    @Override // org.telegram.ui.Components.og
    public final void b1() {
        this.c.O6();
    }

    @Override // org.telegram.ui.Components.og
    public final void c1() {
        int i10;
        int i11;
        un unVar = this.c;
        unVar.d7();
        hk hkVar = unVar.Y;
        boolean z10 = hkVar.z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        unVar.Uc.a(z10 && !(dgVar != null && dgVar.getCurrentPage() == 0), true);
        if (z10) {
            Activity parentActivity = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
            if (qcVar != null && qcVar.m) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        zj zjVar = unVar.U1;
        float f7 = 0.0f;
        if (zjVar != null) {
            zjVar.animate().alpha((z10 || unVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.ds.f).start();
        }
        org.telegram.ui.Components.tz0 tz0Var = unVar.p1;
        if (tz0Var != null) {
            tz0Var.setVisibility(0);
            ViewPropertyAnimator animate = unVar.p1.animate();
            if (!z10 && !unVar.isInPreviewMode()) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f).withEndAction(new bh.n(24, this, z10)).start();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void c2() {
        un unVar = this.c;
        di.a3 a3Var = unVar.V1;
        if (a3Var != null) {
            a3Var.O1(null, 0);
        }
        unVar.ha();
    }

    @Override // org.telegram.ui.Components.og
    public final void e() {
        org.telegram.ui.Components.tz0 tz0Var = this.c.p1;
        if (tz0Var != null) {
            tz0Var.f();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void e1(View view, CharSequence charSequence, boolean z10) {
        un unVar = this.c;
        unVar.ec(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
        if (w0Var == null || w0Var.getVisibility() == 0) {
            return;
        }
        unVar.h0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = unVar.e0;
        if (yVar != null) {
            yVar.f(8);
        }
        yr yrVar = unVar.d0;
        if (yrVar != null) {
            yrVar.b(false);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        return this.c.R6();
    }

    @Override // org.telegram.ui.Components.og
    public final int g() {
        return this.c.j1.Q();
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence) {
        this.c.hb(charSequence, true);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean h1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.c.r5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.og
    public final kn i0() {
        return this.c.x5;
    }

    @Override // org.telegram.ui.Components.og
    public final void j1() {
        int i10;
        un unVar = this.c;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(unVar.f6, (int) unVar.b());
        unVar.j7(true);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.c;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (kVar.n0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = unVar.i0;
        if (yVar != null && !this.b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(unVar.Y.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = unVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            yr yrVar = unVar.d0;
            if (yrVar != null) {
                yrVar.b(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void o() {
        boolean z10;
        un unVar = this.c;
        if (unVar.y0 != null) {
            unVar.b0 = unVar.Y.getBackgroundTop();
        }
        zj zjVar = unVar.U1;
        if (zjVar != null) {
            zjVar.getAdapter().f0 = true;
        }
        if (unVar.B5 != null) {
            AndroidUtilities.runOnUIThread(new ui(this, 7), 30L);
        }
        if (unVar.Y.q0()) {
            unVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.Y.S0(true, true, z10);
        if (unVar.A5 != 0) {
            unVar.getConnectionsManager().cancelRequest(unVar.A5, true);
            unVar.A5 = 0;
        }
        unVar.Lc(0, true);
        unVar.uc(false);
        unVar.jd(false);
    }

    @Override // org.telegram.ui.Components.og
    public final void o1() {
        int i10;
        int i11;
        un unVar = this.c;
        if (unVar.I9() || (i10 = unVar.d4) == 6 || i10 == 8) {
            return;
        }
        MessagesController messagesController = unVar.getMessagesController();
        long j10 = unVar.f6;
        long j11 = unVar.p4;
        i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        messagesController.sendTyping(j10, j11, 0, i11);
    }

    @Override // org.telegram.ui.Components.og
    public final boolean p0() {
        int i10;
        un unVar = this.c;
        if ((unVar.getMessagesController().isForum(unVar.a()) && !unVar.t4) || (i10 = unVar.d4) == 9 || unVar.e4 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void t(float f7) {
        un unVar = this.c;
        if (f7 != 0.0f) {
            unVar.P4 = true;
        }
        unVar.x9();
        unVar.z9();
        unVar.Zc(false, false);
        unVar.j1.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar == null || unVar.vc == null) {
            return;
        }
        qcVar.l();
    }

    @Override // org.telegram.ui.Components.og
    public final void v0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.c;
        if (unVar.i0 == null) {
            return;
        }
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        final org.telegram.ui.ActionBar.z l4 = kVar.l();
        org.telegram.ui.Components.tz0 tz0Var = unVar.p1;
        if (tz0Var != null) {
            tz0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = unVar.i0;
            if (yVar.o == null) {
                yVar.o = 1;
                if (unVar.i0.l != 0) {
                    if (!(unVar.d4 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId()) && (unVar.d4 != 0 || (!(unVar.p4 == 0 || unVar.t4) || UserObject.isReplyUser(unVar.f) || unVar.J9()))) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        ofFloat.setDuration(220L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                        ofFloat.addListener(new im(this, l4, 0));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.hm
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
                        unVar.i0.f(0);
                        un.T3(unVar);
                        org.telegram.ui.ActionBar.w0 w0Var = unVar.h0;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = unVar.e0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        yr yrVar = unVar.d0;
                        if (yrVar != null) {
                            yrVar.b(false);
                        }
                    }
                }
            }
            unVar.M4 = i10;
            unVar.N4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = unVar.i0;
        if (yVar3.o != null) {
            yVar3.o = null;
            if (yVar3.l != 8) {
                if (!(unVar.d4 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId()) && (unVar.d4 != 0 || (!(unVar.p4 == 0 || unVar.t4) || UserObject.isReplyUser(unVar.f) || unVar.J9()))) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f);
                    ofFloat2.addListener(new im(this, l4, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.hm
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
                unVar.i0.f(8);
                if (unVar.Y.h0() && TextUtils.isEmpty(unVar.Y.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = unVar.h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = unVar.e0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    yr yrVar2 = unVar.d0;
                    if (yrVar2 != null) {
                        yrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var3 = unVar.h0;
                if (w0Var3 != null) {
                    w0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = unVar.e0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                yr yrVar3 = unVar.d0;
                if (yrVar3 != null) {
                    yrVar3.b(false);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void w(boolean z10) {
        int i10;
        int i11;
        un unVar = this.c;
        if (!z10) {
            Activity parentActivity = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        } else {
            Activity parentActivity2 = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity2, i11);
            unVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void x0() {
        un unVar = this.c;
        unVar.A9 = true;
        fm fmVar = unVar.A0;
        if (fmVar != null) {
            fmVar.K(true);
        }
    }

    @Override // org.telegram.ui.Components.og
    public final void z() {
        this.c.hc(true, false);
    }

    @Override // org.telegram.ui.Components.og
    public final void z0() {
        this.c.ta(0, false);
    }
}
