package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bj {
    public final Boolean a;
    public final int b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ dj k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bj(dj djVar, Boolean bool, int i3, ArrayList arrayList, long j10, SparseBooleanArray sparseBooleanArray) {
        int i10;
        long j11;
        TLRPC.MessageFwdHeader messageFwdHeader;
        zi ziVar;
        this.k = djVar;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i3;
        this.c = j10;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            zi ziVar2 = (zi) arrayList.get(i11);
            if (i3 == 0 && sparseBooleanArray == null) {
                this.g.put(ziVar2.f1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i3 != 1) {
                tL_message.date = ConnectionsManager.getInstance(ziVar2.I1).getCurrentTime();
            } else {
                tL_message.date = ziVar2.k.date;
            }
            TLRPC.Message message = ziVar2.k;
            int i12 = ziVar2.I1;
            tL_message.id = message.id;
            int i13 = i11;
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
            boolean booleanValue = bool == null ? ziVar2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = h10.i(i12).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = ziVar2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (ziVar = ziVar2.C) != null) {
                tL_message.replyMessage = ziVar.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i3 == 0) {
                long e10 = h10.i(i12).e();
                j11 = 0;
                if (djVar.i) {
                    i10 = i12;
                } else {
                    TLRPC.Message message4 = ziVar2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (ziVar2.U2()) {
                            djVar.m = true;
                        } else {
                            djVar.h = true;
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                        long j12 = message4.from_id.user_id;
                        if (j12 == 0 || message4.dialog_id != e10 || j12 != e10) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = ziVar2.k.from_id;
                            if (ziVar2.U2()) {
                                djVar.m = true;
                            } else {
                                djVar.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (ziVar2.c5()) {
                        tL_message.id = ziVar2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(ziVar2.k.peer_id, new o4.v0(29));
                            long o10 = m5.o(ziVar2.k.from_id);
                            if (o10 > 0) {
                                tL_message.via_bot_id = o10;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (ziVar2.c5()) {
                }
            } else {
                i10 = i12;
                j11 = 0;
            }
            aj ajVar = new aj(djVar, i10, tL_message, i3);
            ajVar.s1 = i3 == 0;
            ajVar.r1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = ajVar.k.entities;
                int size = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList3.get(i14);
                    i14++;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        this.i = true;
                        break;
                    }
                }
            }
            ajVar.k.dialog_id = j10;
            if (ajVar.d1() != j11) {
                ui uiVar = (ui) this.d.get(ajVar.d1(), null);
                if (uiVar == null) {
                    uiVar = new ui();
                    this.d.put(ajVar.d1(), uiVar);
                }
                uiVar.d.add(ajVar);
            }
            this.f.add(0, ajVar);
            if (ziVar2.U3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ziVar2.k.media;
                cj cjVar = new cj();
                cjVar.poll = tL_messageMediaPoll.poll;
                cjVar.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                cjVar.results = tL_pollResults;
                int i15 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i15;
                cjVar.a = i15;
                ajVar.k.media = cjVar;
                if (ziVar2.C()) {
                    int size2 = tL_messageMediaPoll.results.results.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i16);
                        if (pollAnswerVoters.chosen) {
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                            pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                            pollAnswerVoters2.correct = pollAnswerVoters.correct;
                            pollAnswerVoters2.flags = pollAnswerVoters.flags;
                            pollAnswerVoters2.option = pollAnswerVoters.option;
                            pollAnswerVoters2.voters = pollAnswerVoters.voters;
                            this.h.add(pollAnswerVoters2);
                            cjVar.results.results.add(pollAnswerVoters2);
                        } else {
                            cjVar.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i11 = i13 + 1;
        }
        zi ziVar3 = null;
        for (int i17 = 0; i17 < this.d.size(); i17++) {
            ((ui) this.d.valueAt(i17)).a();
        }
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i18 = ((zi) arrayList.get(0)).D;
                if (i18 == 0 || i18 == 19) {
                    this.j = !TextUtils.isEmpty(r1.v);
                    return;
                } else {
                    this.j = !TextUtils.isEmpty(r1.z);
                    return;
                }
            }
            return;
        }
        ui uiVar2 = (ui) this.d.valueAt(0);
        ArrayList arrayList4 = uiVar2.d;
        if (!arrayList4.isEmpty() && uiVar2.f.isEmpty()) {
            uiVar2.a();
        }
        zi ziVar4 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= arrayList4.size()) {
                ziVar3 = ziVar4;
                break;
            }
            zi ziVar5 = (zi) arrayList4.get(i19);
            if (!TextUtils.isEmpty(ziVar5.z)) {
                if (ziVar4 != null) {
                    break;
                } else {
                    ziVar4 = ziVar5;
                }
            }
            i19++;
        }
        this.j = ziVar3 != null;
    }

    public final bj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z10 = false;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zi ziVar = (zi) arrayList2.get(i3);
            if (ziVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    zi ziVar2 = (zi) arrayList.get(i10);
                    if (ziVar2 != null && ziVar.f1() == ziVar2.f1() && zi.B0(ziVar.k) == zi.B0(ziVar2.k)) {
                        arrayList2.set(i3, ziVar2);
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
        }
        if (!z10) {
            return null;
        }
        return new bj(this.k, this.a, this.b, this.e, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i3 >= arrayList2.size()) {
                return;
            }
            zi ziVar = (zi) arrayList2.get(i3);
            if (this.g.get(ziVar.f1(), false)) {
                arrayList.add(ziVar);
            }
            i3++;
        }
    }
}
