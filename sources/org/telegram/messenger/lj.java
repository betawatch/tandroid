package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class lj {
    public final Boolean a;
    public final int b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ nj k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lj(nj njVar, Boolean bool, int i10, ArrayList arrayList, long j10, SparseBooleanArray sparseBooleanArray) {
        int i11;
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        jj jjVar;
        this.k = njVar;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i10;
        this.c = j10;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            jj jjVar2 = (jj) arrayList.get(i12);
            if (i10 == 0 && sparseBooleanArray == null) {
                this.g.put(jjVar2.f1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i10 != 1) {
                tL_message.date = ConnectionsManager.getInstance(jjVar2.I1).getCurrentTime();
            } else {
                tL_message.date = jjVar2.k.date;
            }
            TLRPC.Message message = jjVar2.k;
            int i13 = jjVar2.I1;
            tL_message.id = message.id;
            int i14 = i12;
            tL_message.grouped_id = message.grouped_id;
            tL_message.peer_id = message.peer_id;
            tL_message.from_id = message.from_id;
            tL_message.message = message.message;
            tL_message.rich_message = message.rich_message;
            tL_message.media = message.media;
            tL_message.action = message.action;
            tL_message.edit_date = 0;
            ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
            if (arrayList2 != null) {
                tL_message.entities.addAll(arrayList2);
            }
            boolean booleanValue = bool == null ? jjVar2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = d20.i(i13).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = jjVar2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (jjVar = jjVar2.C) != null) {
                tL_message.replyMessage = jjVar.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i10 == 0) {
                long e = d20.i(i13).e();
                j11 = 0;
                if (njVar.i) {
                    i11 = i13;
                } else {
                    TLRPC.Message message4 = jjVar2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (jjVar2.T2()) {
                            njVar.m = true;
                        } else {
                            njVar.h = true;
                        }
                        i11 = i13;
                    } else {
                        i11 = i13;
                        long j12 = message4.from_id.user_id;
                        if (j12 == 0 || message4.dialog_id != e || j12 != e) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = jjVar2.k.from_id;
                            if (jjVar2.T2()) {
                                njVar.m = true;
                            } else {
                                njVar.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (jjVar2.b5()) {
                        tL_message.id = jjVar2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(jjVar2.k.peer_id, new e9(16));
                            long o10 = o5.o(jjVar2.k.from_id);
                            if (o10 > 0) {
                                tL_message.via_bot_id = o10;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (jjVar2.b5()) {
                }
            } else {
                i11 = i13;
                j11 = 0;
            }
            kj kjVar = new kj(njVar, i11, tL_message, i10);
            kjVar.s1 = i10 == 0;
            kjVar.r1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = kjVar.k.entities;
                int size = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList3.get(i15);
                    i15++;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        this.i = true;
                        break;
                    }
                }
            }
            kjVar.k.dialog_id = j10;
            if (kjVar.d1() != j11) {
                ej ejVar = (ej) this.d.get(kjVar.d1(), null);
                if (ejVar == null) {
                    ejVar = new ej();
                    this.d.put(kjVar.d1(), ejVar);
                }
                ejVar.d.add(kjVar);
            }
            this.f.add(0, kjVar);
            if (jjVar2.T3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) jjVar2.k.media;
                mj mjVar = new mj();
                mjVar.poll = tL_messageMediaPoll.poll;
                mjVar.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                mjVar.results = tL_pollResults;
                int i16 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i16;
                mjVar.a = i16;
                kjVar.k.media = mjVar;
                if (jjVar2.C()) {
                    int size2 = tL_messageMediaPoll.results.results.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i17);
                        if (pollAnswerVoters.chosen) {
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                            pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                            pollAnswerVoters2.correct = pollAnswerVoters.correct;
                            pollAnswerVoters2.flags = pollAnswerVoters.flags;
                            pollAnswerVoters2.option = pollAnswerVoters.option;
                            pollAnswerVoters2.voters = pollAnswerVoters.voters;
                            this.h.add(pollAnswerVoters2);
                            mjVar.results.results.add(pollAnswerVoters2);
                        } else {
                            mjVar.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i12 = i14 + 1;
        }
        jj jjVar3 = null;
        for (int i18 = 0; i18 < this.d.size(); i18++) {
            ((ej) this.d.valueAt(i18)).a();
        }
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i19 = ((jj) arrayList.get(0)).D;
                if (i19 == 0 || i19 == 19) {
                    this.j = !TextUtils.isEmpty(r1.v);
                    return;
                } else {
                    this.j = !TextUtils.isEmpty(r1.z);
                    return;
                }
            }
            return;
        }
        ej ejVar2 = (ej) this.d.valueAt(0);
        ArrayList arrayList4 = ejVar2.d;
        if (!arrayList4.isEmpty() && ejVar2.f.isEmpty()) {
            ejVar2.a();
        }
        jj jjVar4 = null;
        int i20 = 0;
        while (true) {
            if (i20 >= arrayList4.size()) {
                jjVar3 = jjVar4;
                break;
            }
            jj jjVar5 = (jj) arrayList4.get(i20);
            if (!TextUtils.isEmpty(jjVar5.z)) {
                if (jjVar4 != null) {
                    break;
                } else {
                    jjVar4 = jjVar5;
                }
            }
            i20++;
        }
        this.j = jjVar3 != null;
    }

    public final lj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jj jjVar = (jj) arrayList2.get(i10);
            if (jjVar != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    jj jjVar2 = (jj) arrayList.get(i11);
                    if (jjVar2 != null && jjVar.f1() == jjVar2.f1() && jj.B0(jjVar.k) == jj.B0(jjVar2.k)) {
                        arrayList2.set(i10, jjVar2);
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
        }
        if (!z10) {
            return null;
        }
        return new lj(this.k, this.a, this.b, this.e, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            jj jjVar = (jj) arrayList2.get(i10);
            if (this.g.get(jjVar.f1(), false)) {
                arrayList.add(jjVar);
            }
            i10++;
        }
    }
}
