package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class ij {
    public final Boolean a;
    public final int b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ kj k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ij(kj kjVar, Boolean bool, int i7, ArrayList arrayList, long j3, SparseBooleanArray sparseBooleanArray) {
        int i10;
        long j10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        gj gjVar;
        this.k = kjVar;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i7;
        this.c = j3;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            gj gjVar2 = (gj) arrayList.get(i11);
            if (i7 == 0 && sparseBooleanArray == null) {
                this.g.put(gjVar2.e1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i7 != 1) {
                tL_message.date = ConnectionsManager.getInstance(gjVar2.K1).getCurrentTime();
            } else {
                tL_message.date = gjVar2.k.date;
            }
            TLRPC.Message message = gjVar2.k;
            int i12 = gjVar2.K1;
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
            boolean booleanValue = bool == null ? gjVar2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = k10.i(i12).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = gjVar2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (gjVar = gjVar2.C) != null) {
                tL_message.replyMessage = gjVar.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i7 == 0) {
                long e10 = k10.i(i12).e();
                j10 = 0;
                if (kjVar.i) {
                    i10 = i12;
                } else {
                    TLRPC.Message message4 = gjVar2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (gjVar2.T2()) {
                            kjVar.m = true;
                        } else {
                            kjVar.h = true;
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                        long j11 = message4.from_id.user_id;
                        if (j11 == 0 || message4.dialog_id != e10 || j11 != e10) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = gjVar2.k.from_id;
                            if (gjVar2.T2()) {
                                kjVar.m = true;
                            } else {
                                kjVar.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (gjVar2.b5()) {
                        tL_message.id = gjVar2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(gjVar2.k.peer_id, new fd(7));
                            long o4 = n5.o(gjVar2.k.from_id);
                            if (o4 > 0) {
                                tL_message.via_bot_id = o4;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (gjVar2.b5()) {
                }
            } else {
                i10 = i12;
                j10 = 0;
            }
            hj hjVar = new hj(kjVar, i10, tL_message, i7);
            hjVar.u1 = i7 == 0;
            hjVar.t1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = hjVar.k.entities;
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
            hjVar.k.dialog_id = j3;
            if (hjVar.c1() != j10) {
                bj bjVar = (bj) this.d.get(hjVar.c1(), null);
                if (bjVar == null) {
                    bjVar = new bj();
                    this.d.put(hjVar.c1(), bjVar);
                }
                bjVar.d.add(hjVar);
            }
            this.f.add(0, hjVar);
            if (gjVar2.T3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) gjVar2.k.media;
                jj jjVar = new jj();
                jjVar.poll = tL_messageMediaPoll.poll;
                jjVar.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                jjVar.results = tL_pollResults;
                int i15 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i15;
                jjVar.a = i15;
                hjVar.k.media = jjVar;
                if (gjVar2.C()) {
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
                            jjVar.results.results.add(pollAnswerVoters2);
                        } else {
                            jjVar.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i11 = i13 + 1;
        }
        gj gjVar3 = null;
        for (int i17 = 0; i17 < this.d.size(); i17++) {
            ((bj) this.d.valueAt(i17)).a();
        }
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i18 = ((gj) arrayList.get(0)).D;
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
        bj bjVar2 = (bj) this.d.valueAt(0);
        ArrayList arrayList4 = bjVar2.d;
        if (!arrayList4.isEmpty() && bjVar2.f.isEmpty()) {
            bjVar2.a();
        }
        gj gjVar4 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= arrayList4.size()) {
                gjVar3 = gjVar4;
                break;
            }
            gj gjVar5 = (gj) arrayList4.get(i19);
            if (!TextUtils.isEmpty(gjVar5.z)) {
                if (gjVar4 != null) {
                    break;
                } else {
                    gjVar4 = gjVar5;
                }
            }
            i19++;
        }
        this.j = gjVar3 != null;
    }

    public final ij a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z10 = false;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            gj gjVar = (gj) arrayList2.get(i7);
            if (gjVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    gj gjVar2 = (gj) arrayList.get(i10);
                    if (gjVar2 != null && gjVar.e1() == gjVar2.e1() && gj.B0(gjVar.k) == gj.B0(gjVar2.k)) {
                        arrayList2.set(i7, gjVar2);
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
        return new ij(this.k, this.a, this.b, this.e, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            gj gjVar = (gj) arrayList2.get(i7);
            if (this.g.get(gjVar.e1(), false)) {
                arrayList.add(gjVar);
            }
            i7++;
        }
    }
}
