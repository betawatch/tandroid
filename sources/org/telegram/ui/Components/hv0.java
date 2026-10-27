package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hv0 implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 b;
    public final /* synthetic */ jv0 c;

    public hv0(jv0 jv0Var, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.c = jv0Var;
        this.a = i10;
        this.b = u6Var;
    }

    public static TLRPC.TL_message a(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = message.id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean C0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.r2 r2Var = this.c.s.x1;
            MessageObject messageObject = s1Var.getMessageObject();
            org.telegram.ui.Cells.x8 x8Var = oh0.R;
            if (r2Var == null || r2Var.getParentActivity() == null) {
                return;
            }
            r2Var.showDialog(new oh0(r2Var.getContext(), r2Var.getCurrentAccount(), messageObject, r2Var.getResourceProvider()));
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.ev0 E1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean G1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int S() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean S0(MessageObject messageObject) {
        return org.telegram.ui.d3.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ jh.a V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean X1(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h0(c6 c6Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        SendMessagesHelper.getInstance(this.a).sendVote(s1Var.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        bw0 bw0Var = this.c.s;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        int i14 = this.a;
        if (geoPoint != null) {
            if (AndroidUtilities.isMapsInstalled(bw0Var.x1)) {
                bv0 bv0Var = new bv0(3);
                bv0Var.setResourceProvider(u6Var);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = MessagesController.getInstance(i14).getPeer(bw0Var.l1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                bv0Var.N0 = false;
                bv0Var.v0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                bw0Var.x1.presentFragment(bv0Var);
                return;
            }
            return;
        }
        if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
            org.telegram.ui.ht.o().u(bw0Var.x1.getParentActivity());
            org.telegram.ui.ht.o().t(new cv0(this, tL_messageMediaPoll, pollAnswer, s1Var));
            org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
            TLRPC.Document document4 = messageMedia.document;
            o10.r(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, s1Var.getMessageObject(), this.b, 200);
            return;
        }
        TLRPC.Message message2 = messageObject.messageOwner;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message a2 = a(message2);
            a2.media = messageMedia3;
            arrayList2.add(new dv0(i14, a2, false, true));
            arrayList.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList2.size();
            }
            TLRPC.TL_message a10 = a(message2);
            a10.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            a10.message = pollResults2.solution;
            a10.entities = pollResults2.solution_entities;
            arrayList2.add(new ev0(i14, a10, false, true));
            arrayList.add(-3);
        }
        int i15 = i14;
        bg.d.b(tL_messageMediaPoll.poll, UserConfig.getInstance(i14).getClientUserId());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i16 = 0;
        while (i16 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                if (pollAnswer2.unshuffled_index == i10) {
                    i11 = arrayList2.size();
                }
                TLRPC.TL_message a11 = a(message2);
                a11.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                a11.message = tL_textWithEntities2.text;
                a11.entities = tL_textWithEntities2.entities;
                i13 = i15;
                message = message2;
                i12 = 0;
                arrayList2.add(new fv0(i13, a11, false, true));
                arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            } else {
                int i17 = i15;
                message = message2;
                i12 = r10;
                i13 = i17;
            }
            i16++;
            int i18 = i13;
            r10 = i12;
            message2 = message;
            i15 = i18;
        }
        if (i11 <= -1 || arrayList2.isEmpty()) {
            return;
        }
        messageObject.pollMediaMapping = arrayList;
        PhotoViewer.v1().N2(null, bw0Var.x1, u6Var);
        PhotoViewer.v1().e2(arrayList2, i11, bw0Var.l1, 0L, 0L, new gv0(this));
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String u(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void g0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
