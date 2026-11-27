// default package

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lia implements rb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ nia c;

    public lia(nia niaVar, int i, vnb vnbVar) {
        this.c = niaVar;
        this.a = i;
        this.b = vnbVar;
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

    @Override // rb2
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // rb2
    public final de8 J1() {
        return null;
    }

    @Override // rb2
    public final boolean K() {
        return false;
    }

    @Override // rb2
    public final boolean L1(long j) {
        return false;
    }

    @Override // rb2
    public final boolean M() {
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final int N() {
        return 0;
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        return null;
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean Z() {
        return false;
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final boolean b() {
        return true;
    }

    @Override // rb2
    public final boolean c0() {
        return true;
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
        r7a.B(this.a).v0(wb2Var.getMessageObject(), arrayList, null);
    }

    @Override // rb2, al1
    public final boolean h() {
        return true;
    }

    @Override // rb2
    public final boolean i1() {
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        return false;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override // rb2
    public final bmb l2() {
        return null;
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Message message;
        int i3;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        eja ejaVar = this.c.s;
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = r47.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m1 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        vnb vnbVar = this.b;
        int i4 = this.a;
        if (geoPoint != null) {
            if (hl.H1(ejaVar.y1)) {
                fia fiaVar = new fia(3);
                fiaVar.setResourceProvider(vnbVar);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = uc7.s1(i4).y1(ejaVar.m1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                fiaVar.V0 = false;
                fiaVar.G0(new r47(yac.t0, tL_message, false, false));
                ejaVar.y1.presentFragment(fiaVar);
                return;
            }
            return;
        }
        if (r47.N2(messageMedia.document)) {
            rw2.e().l(ejaVar.y1.getParentActivity());
            rw2.e().k(new gia(this, tL_messageMediaPoll, pollAnswer, wb2Var));
            rw2 e = rw2.e();
            TLRPC.Document document4 = messageMedia.document;
            e.i(document4, null, "", null, null, r47.H2(document4) ? 2 : 0, false, wb2Var.getMessageObject(), this.b, jn7.d3);
            return;
        }
        TLRPC.Message message2 = messageObject.k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || r47.J4(document3))) {
            i2 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message a = a(message2);
            a.media = messageMedia3;
            arrayList2.add(new hia(i4, a, false, true));
            arrayList.add(-2);
        } else {
            i2 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || r47.J4(document2))) {
            if (messageMedia2 == messageMedia) {
                i2 = arrayList2.size();
            }
            TLRPC.TL_message a2 = a(message2);
            a2.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            a2.message = pollResults2.solution;
            a2.entities = pollResults2.solution_entities;
            arrayList2.add(new iia(i4, a2, false, true));
            arrayList.add(-3);
        }
        int i5 = i4;
        atb.b(tL_messageMediaPoll.poll, yac.h(i4).e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i6 = 0;
        while (i6 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i6);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || r47.J4(document))) {
                if (pollAnswer2.unshuffled_index == i) {
                    i2 = arrayList2.size();
                }
                TLRPC.TL_message a3 = a(message2);
                a3.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                a3.message = tL_textWithEntities2.text;
                a3.entities = tL_textWithEntities2.entities;
                i3 = i5;
                message = message2;
                arrayList2.add(new jia(i3, a3, false, true));
                arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            } else {
                int i7 = i5;
                message = message2;
                i3 = i7;
            }
            i6++;
            message2 = message;
            i5 = i3;
        }
        if (i2 <= -1 || arrayList2.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList;
        PhotoViewer.q0().T1(null, ejaVar.y1, vnbVar);
        PhotoViewer.q0().n1(arrayList2, i2, ejaVar.m1, 0L, 0L, new kia(this));
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
        if (i == 80) {
            e eVar = this.c.s.y1;
            r47 messageObject = wb2Var.getMessageObject();
            qm qmVar = ui8.L1;
            if (eVar == null || eVar.getParentActivity() == null) {
                return;
            }
            eVar.showDialog(new ui8(eVar.getContext(), eVar.getCurrentAccount(), messageObject, eVar.getResourceProvider()));
        }
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // rb2
    public final String u(long j) {
        return null;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        return false;
    }

    @Override // rb2
    public final boolean y0(long j) {
        return false;
    }

    @Override // rb2
    public final void Q0() {
    }

    @Override // rb2
    public final void d() {
    }

    @Override // rb2
    public final void d2() {
    }

    @Override // rb2
    public final void i() {
    }

    @Override // rb2
    public final void k2() {
    }

    @Override // rb2
    public final void r() {
    }

    @Override // rb2
    public final void r0() {
    }

    @Override // rb2
    public final void z1() {
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
    }

    @Override // rb2
    public final void T(r47 r47Var) {
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Y(int i) {
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void g0(String str) {
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void K1(String str, String str2) {
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override // rb2
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
