package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class hj {
    public final Boolean a;
    public final int b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ jj k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hj(jj jjVar, Boolean bool, int i7, ArrayList arrayList, long j3, SparseBooleanArray sparseBooleanArray) {
        int i10;
        long j10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        fj fjVar;
        this.k = jjVar;
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
            fj fjVar2 = (fj) arrayList.get(i11);
            if (i7 == 0 && sparseBooleanArray == null) {
                this.g.put(fjVar2.e1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i7 != 1) {
                tL_message.date = ConnectionsManager.getInstance(fjVar2.K1).getCurrentTime();
            } else {
                tL_message.date = fjVar2.k.date;
            }
            TLRPC.Message message = fjVar2.k;
            int i12 = fjVar2.K1;
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
            boolean booleanValue = bool == null ? fjVar2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = i10.i(i12).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = fjVar2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (fjVar = fjVar2.C) != null) {
                tL_message.replyMessage = fjVar.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i7 == 0) {
                long e10 = i10.i(i12).e();
                j10 = 0;
                if (jjVar.i) {
                    i10 = i12;
                } else {
                    TLRPC.Message message4 = fjVar2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (fjVar2.T2()) {
                            jjVar.m = true;
                        } else {
                            jjVar.h = true;
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                        long j11 = message4.from_id.user_id;
                        if (j11 == 0 || message4.dialog_id != e10 || j11 != e10) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = fjVar2.k.from_id;
                            if (fjVar2.T2()) {
                                jjVar.m = true;
                            } else {
                                jjVar.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (fjVar2.b5()) {
                        tL_message.id = fjVar2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(fjVar2.k.peer_id, new ed(7));
                            long o4 = n5.o(fjVar2.k.from_id);
                            if (o4 > 0) {
                                tL_message.via_bot_id = o4;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (fjVar2.b5()) {
                }
            } else {
                i10 = i12;
                j10 = 0;
            }
            gj gjVar = new gj(jjVar, i10, tL_message, i7);
            gjVar.u1 = i7 == 0;
            gjVar.t1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = gjVar.k.entities;
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
            gjVar.k.dialog_id = j3;
            if (gjVar.c1() != j10) {
                aj ajVar = (aj) this.d.get(gjVar.c1(), null);
                if (ajVar == null) {
                    ajVar = new aj();
                    this.d.put(gjVar.c1(), ajVar);
                }
                ajVar.d.add(gjVar);
            }
            this.f.add(0, gjVar);
            if (fjVar2.T3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar2.k.media;
                ij ijVar = new ij();
                ijVar.poll = tL_messageMediaPoll.poll;
                ijVar.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                ijVar.results = tL_pollResults;
                int i15 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i15;
                ijVar.a = i15;
                gjVar.k.media = ijVar;
                if (fjVar2.C()) {
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
                            ijVar.results.results.add(pollAnswerVoters2);
                        } else {
                            ijVar.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i11 = i13 + 1;
        }
        fj fjVar3 = null;
        for (int i17 = 0; i17 < this.d.size(); i17++) {
            ((aj) this.d.valueAt(i17)).a();
        }
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i18 = ((fj) arrayList.get(0)).D;
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
        aj ajVar2 = (aj) this.d.valueAt(0);
        ArrayList arrayList4 = ajVar2.d;
        if (!arrayList4.isEmpty() && ajVar2.f.isEmpty()) {
            ajVar2.a();
        }
        fj fjVar4 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= arrayList4.size()) {
                fjVar3 = fjVar4;
                break;
            }
            fj fjVar5 = (fj) arrayList4.get(i19);
            if (!TextUtils.isEmpty(fjVar5.z)) {
                if (fjVar4 != null) {
                    break;
                } else {
                    fjVar4 = fjVar5;
                }
            }
            i19++;
        }
        this.j = fjVar3 != null;
    }

    public final hj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z10 = false;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            fj fjVar = (fj) arrayList2.get(i7);
            if (fjVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    fj fjVar2 = (fj) arrayList.get(i10);
                    if (fjVar2 != null && fjVar.e1() == fjVar2.e1() && fj.B0(fjVar.k) == fj.B0(fjVar2.k)) {
                        arrayList2.set(i7, fjVar2);
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
        return new hj(this.k, this.a, this.b, this.e, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            fj fjVar = (fj) arrayList2.get(i7);
            if (this.g.get(fjVar.e1(), false)) {
                arrayList.add(fjVar);
            }
            i7++;
        }
    }
}
