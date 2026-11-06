package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class kj {
    public final Boolean a;
    public final int b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ mj k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kj(mj mjVar, Boolean bool, int i7, ArrayList arrayList, long j3, SparseBooleanArray sparseBooleanArray) {
        int i10;
        long j10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        ij ijVar;
        this.k = mjVar;
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
            ij ijVar2 = (ij) arrayList.get(i11);
            if (i7 == 0 && sparseBooleanArray == null) {
                this.g.put(ijVar2.f1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i7 != 1) {
                tL_message.date = ConnectionsManager.getInstance(ijVar2.I1).getCurrentTime();
            } else {
                tL_message.date = ijVar2.k.date;
            }
            TLRPC.Message message = ijVar2.k;
            int i12 = ijVar2.I1;
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
            boolean booleanValue = bool == null ? ijVar2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = p10.i(i12).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = ijVar2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (ijVar = ijVar2.C) != null) {
                tL_message.replyMessage = ijVar.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i7 == 0) {
                long e10 = p10.i(i12).e();
                j10 = 0;
                if (mjVar.i) {
                    i10 = i12;
                } else {
                    TLRPC.Message message4 = ijVar2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (ijVar2.U2()) {
                            mjVar.m = true;
                        } else {
                            mjVar.h = true;
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                        long j11 = message4.from_id.user_id;
                        if (j11 == 0 || message4.dialog_id != e10 || j11 != e10) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = ijVar2.k.from_id;
                            if (ijVar2.U2()) {
                                mjVar.m = true;
                            } else {
                                mjVar.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (ijVar2.c5()) {
                        tL_message.id = ijVar2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(ijVar2.k.peer_id, new ch(2));
                            long o4 = m5.o(ijVar2.k.from_id);
                            if (o4 > 0) {
                                tL_message.via_bot_id = o4;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (ijVar2.c5()) {
                }
            } else {
                i10 = i12;
                j10 = 0;
            }
            jj jjVar = new jj(mjVar, i10, tL_message, i7);
            jjVar.s1 = i7 == 0;
            jjVar.r1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = jjVar.k.entities;
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
            jjVar.k.dialog_id = j3;
            if (jjVar.d1() != j10) {
                dj djVar = (dj) this.d.get(jjVar.d1(), null);
                if (djVar == null) {
                    djVar = new dj();
                    this.d.put(jjVar.d1(), djVar);
                }
                djVar.d.add(jjVar);
            }
            this.f.add(0, jjVar);
            if (ijVar2.U3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar2.k.media;
                lj ljVar = new lj();
                ljVar.poll = tL_messageMediaPoll.poll;
                ljVar.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                ljVar.results = tL_pollResults;
                int i15 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i15;
                ljVar.a = i15;
                jjVar.k.media = ljVar;
                if (ijVar2.C()) {
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
                            ljVar.results.results.add(pollAnswerVoters2);
                        } else {
                            ljVar.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i11 = i13 + 1;
        }
        ij ijVar3 = null;
        for (int i17 = 0; i17 < this.d.size(); i17++) {
            ((dj) this.d.valueAt(i17)).a();
        }
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i18 = ((ij) arrayList.get(0)).D;
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
        dj djVar2 = (dj) this.d.valueAt(0);
        ArrayList arrayList4 = djVar2.d;
        if (!arrayList4.isEmpty() && djVar2.f.isEmpty()) {
            djVar2.a();
        }
        ij ijVar4 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= arrayList4.size()) {
                ijVar3 = ijVar4;
                break;
            }
            ij ijVar5 = (ij) arrayList4.get(i19);
            if (!TextUtils.isEmpty(ijVar5.z)) {
                if (ijVar4 != null) {
                    break;
                } else {
                    ijVar4 = ijVar5;
                }
            }
            i19++;
        }
        this.j = ijVar3 != null;
    }

    public final kj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z9 = false;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ij ijVar = (ij) arrayList2.get(i7);
            if (ijVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    ij ijVar2 = (ij) arrayList.get(i10);
                    if (ijVar2 != null && ijVar.f1() == ijVar2.f1() && ij.B0(ijVar.k) == ij.B0(ijVar2.k)) {
                        arrayList2.set(i7, ijVar2);
                        z9 = true;
                        break;
                    }
                    i10++;
                }
            }
        }
        if (!z9) {
            return null;
        }
        return new kj(this.k, this.a, this.b, this.e, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            ij ijVar = (ij) arrayList2.get(i7);
            if (this.g.get(ijVar.f1(), false)) {
                arrayList.add(ijVar);
            }
            i7++;
        }
    }
}
