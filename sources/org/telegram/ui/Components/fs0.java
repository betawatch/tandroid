package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fs0 implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;
    public final /* synthetic */ hs0 c;

    public fs0(hs0 hs0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = hs0Var;
        this.a = i7;
        this.b = e6Var;
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
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.dr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.ez.C(this.a).w0(q1Var.getMessageObject(), arrayList, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Message message;
        int i11;
        int i12;
        TLRPC.Document document;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        TLRPC.Document document3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        ys0 ys0Var = this.c.s;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia == null || messageObject == null || !(m12 instanceof TLRPC.TL_messageMediaPoll)) {
            return;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int i13 = this.a;
        if (geoPoint != null) {
            if (org.telegram.messenger.g0.J1(ys0Var.y1)) {
                zr0 zr0Var = new zr0(3);
                zr0Var.setResourceProvider(e6Var);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.local_id = -1;
                tL_message.peer_id = org.telegram.messenger.np.s1(i13).z1(ys0Var.m1);
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = messageMedia.geo;
                String str = messageMedia.address;
                if (str == null) {
                    str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                }
                tL_messageMediaGeo.address = str;
                tL_message.media = tL_messageMediaGeo;
                zr0Var.Q0 = false;
                zr0Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, false));
                ys0Var.y1.presentFragment(zr0Var);
                return;
            }
            return;
        }
        if (org.telegram.messenger.gj.N2(messageMedia.document)) {
            org.telegram.ui.ns.p().v(ys0Var.y1.getParentActivity());
            org.telegram.ui.ns.p().u(new as0(this, tL_messageMediaPoll, pollAnswer, q1Var));
            org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
            TLRPC.Document document4 = messageMedia.document;
            p10.s(document4, null, "", null, null, org.telegram.messenger.gj.H2(document4) ? 2 : 0, false, q1Var.getMessageObject(), this.b, org.telegram.messenger.ns.e3);
            return;
        }
        TLRPC.Message message2 = messageObject.k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
        if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
            i10 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
            TLRPC.TL_message a10 = a(message2);
            a10.media = messageMedia3;
            arrayList2.add(new bs0(i13, a10, false, true));
            arrayList.add(-2);
        } else {
            i10 = -1;
        }
        if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
            if (messageMedia2 == messageMedia) {
                i10 = arrayList2.size();
            }
            TLRPC.TL_message a11 = a(message2);
            a11.media = messageMedia2;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            a11.message = pollResults2.solution;
            a11.entities = pollResults2.solution_entities;
            arrayList2.add(new cs0(i13, a11, false, true));
            arrayList.add(-3);
        }
        int i14 = i13;
        cg.d.b(tL_messageMediaPoll.poll, org.telegram.messenger.m10.i(i13).e());
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
        if (arrayList3 == null) {
            arrayList3 = poll.answers;
        }
        int i15 = 0;
        while (i15 < arrayList3.size()) {
            TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i15);
            TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
            if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.gj.K4(document))) {
                if (pollAnswer2.unshuffled_index == i7) {
                    i10 = arrayList2.size();
                }
                TLRPC.TL_message a12 = a(message2);
                a12.media = messageMedia4;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                a12.message = tL_textWithEntities2.text;
                a12.entities = tL_textWithEntities2.entities;
                i12 = i14;
                message = message2;
                i11 = 0;
                arrayList2.add(new ds0(i12, a12, false, true));
                arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
            } else {
                int i16 = i14;
                message = message2;
                i11 = r10;
                i12 = i16;
            }
            i15++;
            int i17 = i12;
            r10 = i11;
            message2 = message;
            i14 = i17;
        }
        if (i10 <= -1 || arrayList2.isEmpty()) {
            return;
        }
        messageObject.s0 = arrayList;
        PhotoViewer.p1().I2(null, ys0Var.y1, e6Var);
        PhotoViewer.p1().a2(arrayList2, i10, ys0Var.m1, 0L, 0L, new es0(this));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        if (i7 == 80) {
            org.telegram.ui.ActionBar.e2 e2Var = this.c.s.y1;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            org.telegram.ui.Cells.n8 n8Var = te0.M1;
            if (e2Var == null || e2Var.getParentActivity() == null) {
                return;
            }
            e2Var.showDialog(new te0(e2Var.getContext(), e2Var.getCurrentAccount(), messageObject, e2Var.getResourceProvider()));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String x(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
