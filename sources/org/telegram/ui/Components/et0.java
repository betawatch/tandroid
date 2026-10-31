package org.telegram.ui.Components;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class et0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 b;
    public final /* synthetic */ gt0 c;

    public et0(gt0 gt0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.c = gt0Var;
        this.a = i10;
        this.b = p6Var;
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

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.qs0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        if (i10 == 80) {
            org.telegram.ui.ActionBar.k2 k2Var = this.c.s.x1;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            mh.g gVar = tf0.I1;
            if (k2Var == null || k2Var.getParentActivity() == null) {
                return;
            }
            k2Var.showDialog(new tf0(k2Var.getContext(), k2Var.getCurrentAccount(), messageObject, k2Var.getResourceProvider()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        org.telegram.messenger.qz.C(this.a).w0(q1Var.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean i0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
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
        zt0 zt0Var = this.c.s;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(messageObject);
        if (messageMedia == null || messageObject == null || !(n12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int i14 = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.i0.J1(zt0Var.x1)) {
                ys0 ys0Var = new ys0(3);
                ys0Var.setResourceProvider(p6Var);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = org.telegram.messenger.vp.r1(i14).y1(zt0Var.l1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                ys0Var.W0 = false;
                ys0Var.H0(new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, false));
                zt0Var.x1.presentFragment(ys0Var);
                return;
            }
            return;
        }
        if (org.telegram.messenger.jj.N2(messageMedia.document)) {
            org.telegram.ui.lt.p().v(zt0Var.x1.getParentActivity());
            org.telegram.ui.lt.p().u(new zs0(this, tL_messageMediaPoll, pollAnswer, q1Var));
            org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
            TLRPC.Document document4 = messageMedia.document;
            p5.s(document4, null, "", null, null, org.telegram.messenger.jj.H2(document4) ? 2 : 0, false, q1Var.getMessageObject(), this.b, org.telegram.messenger.zs.e3);
            return;
        }
        TLRPC.Message message2 = messageObject.k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.jj.K4(document3))) {
            i11 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message a2 = a(message2);
            a2.media = messageMedia3;
            arrayList2.add(new at0(i14, a2, false, true));
            arrayList.add(-2);
        } else {
            i11 = -1;
        }
        if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.jj.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i11 = arrayList2.size();
            }
            TLRPC.TL_message a10 = a(message2);
            a10.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            a10.message = pollResults2.solution;
            a10.entities = pollResults2.solution_entities;
            arrayList2.add(new bt0(i14, a10, false, true));
            arrayList.add(-3);
        }
        int i15 = i14;
        sf.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.d20.i(i14).e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i16 = 0;
        while (i16 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i16);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.jj.K4(document))) {
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
                arrayList2.add(new ct0(i13, a11, false, true));
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
        messageObject.q0 = arrayList;
        PhotoViewer.v1().N2(null, zt0Var.x1, p6Var);
        PhotoViewer.v1().e2(arrayList2, i11, zt0Var.l1, 0L, 0L, new dt0(this));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
