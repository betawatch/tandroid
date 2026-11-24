// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m47 {
    public final Boolean a;
    public final byte b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ o47 k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m47(o47 o47Var, Boolean bool, int i, ArrayList arrayList, long j, SparseBooleanArray sparseBooleanArray) {
        LongSparseArray longSparseArray;
        int i2;
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        k47 k47Var;
        this.k = o47Var;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i;
        this.c = j;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            k47 k47Var2 = (k47) arrayList.get(i3);
            if (i == 0 && sparseBooleanArray == null) {
                this.g.put(k47Var2.e1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i != 1) {
                tL_message.date = ConnectionsManager.getInstance(k47Var2.K1).getCurrentTime();
            } else {
                tL_message.date = k47Var2.k.date;
            }
            TLRPC.Message message = k47Var2.k;
            int i4 = k47Var2.K1;
            tL_message.id = message.id;
            int i5 = i3;
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
            boolean booleanValue = bool == null ? k47Var2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = z8c.h(i4).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = k47Var2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (k47Var = k47Var2.C) != null) {
                tL_message.replyMessage = k47Var.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i == 0) {
                long e = z8c.h(i4).e();
                j2 = 0;
                if (o47Var.i) {
                    i2 = i4;
                } else {
                    TLRPC.Message message4 = k47Var2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (k47Var2.T2()) {
                            o47Var.m = true;
                        } else {
                            o47Var.h = true;
                        }
                        i2 = i4;
                    } else {
                        i2 = i4;
                        long j3 = message4.from_id.user_id;
                        if (j3 == 0 || message4.dialog_id != e || j3 != e) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = k47Var2.k.from_id;
                            if (k47Var2.T2()) {
                                o47Var.m = true;
                            } else {
                                o47Var.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (k47Var2.a5()) {
                        tL_message.id = k47Var2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(k47Var2.k.peer_id, new yy6((byte) 25));
                            long n = pg3.n(k47Var2.k.from_id);
                            if (n > 0) {
                                tL_message.via_bot_id = n;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (k47Var2.a5()) {
                }
            } else {
                i2 = i4;
                j2 = 0;
            }
            l47 l47Var = new l47(o47Var, i2, tL_message, i);
            l47Var.u1 = i == 0;
            l47Var.t1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = l47Var.k.entities;
                int size = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList3.get(i6);
                    i6++;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        this.i = true;
                        break;
                    }
                }
            }
            l47Var.k.dialog_id = j;
            if (l47Var.c1() != j2) {
                f47 f47Var = (f47) this.d.get(l47Var.c1(), null);
                if (f47Var == null) {
                    f47Var = new f47();
                    this.d.put(l47Var.c1(), f47Var);
                }
                f47Var.d.add(l47Var);
            }
            this.f.add(0, l47Var);
            if (k47Var2.S3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k47Var2.k.media;
                n47 n47Var = new n47();
                n47Var.poll = tL_messageMediaPoll.poll;
                n47Var.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                n47Var.results = tL_pollResults;
                int i7 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i7;
                n47Var.a = i7;
                l47Var.k.media = n47Var;
                if (k47Var2.C()) {
                    int size2 = tL_messageMediaPoll.results.results.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i8);
                        if (pollAnswerVoters.chosen) {
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                            pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                            pollAnswerVoters2.correct = pollAnswerVoters.correct;
                            pollAnswerVoters2.flags = pollAnswerVoters.flags;
                            pollAnswerVoters2.option = pollAnswerVoters.option;
                            pollAnswerVoters2.voters = pollAnswerVoters.voters;
                            this.h.add(pollAnswerVoters2);
                            n47Var.results.results.add(pollAnswerVoters2);
                        } else {
                            n47Var.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i3 = i5 + 1;
        }
        k47 k47Var3 = null;
        int i9 = 0;
        while (true) {
            int size3 = this.d.size();
            longSparseArray = this.d;
            if (i9 >= size3) {
                break;
            }
            ((f47) longSparseArray.valueAt(i9)).a();
            i9++;
        }
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i10 = ((k47) arrayList.get(0)).D;
                if (i10 == 0 || i10 == 19) {
                    this.j = !TextUtils.isEmpty(r1.v);
                    return;
                } else {
                    this.j = !TextUtils.isEmpty(r1.z);
                    return;
                }
            }
            return;
        }
        f47 f47Var2 = (f47) this.d.valueAt(0);
        ArrayList arrayList4 = f47Var2.d;
        if (!arrayList4.isEmpty() && f47Var2.f.isEmpty()) {
            f47Var2.a();
        }
        k47 k47Var4 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList4.size()) {
                k47Var3 = k47Var4;
                break;
            }
            k47 k47Var5 = (k47) arrayList4.get(i11);
            if (!TextUtils.isEmpty(k47Var5.z)) {
                if (k47Var4 != null) {
                    break;
                } else {
                    k47Var4 = k47Var5;
                }
            }
            i11++;
        }
        this.j = k47Var3 != null;
    }

    public final m47 a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            k47 k47Var = (k47) arrayList2.get(i);
            if (k47Var != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    k47 k47Var2 = (k47) arrayList.get(i2);
                    if (k47Var2 != null && k47Var.e1() == k47Var2.e1() && k47.B0(k47Var.k) == k47.B0(k47Var2.k)) {
                        arrayList2.set(i, k47Var2);
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!z) {
            return null;
        }
        return new m47(this.k, this.a, this.b, arrayList2, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return;
            }
            k47 k47Var = (k47) arrayList2.get(i);
            if (this.g.get(k47Var.e1(), false)) {
                arrayList.add(k47Var);
            }
            i++;
        }
    }
}
